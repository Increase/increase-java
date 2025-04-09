// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.oauthapplications

import com.increase.api.services.async.OAuthApplicationServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** List OAuth Applications */
class OAuthApplicationListPageAsync
private constructor(
    private val oauthApplicationsService: OAuthApplicationServiceAsync,
    private val params: OAuthApplicationListParams,
    private val response: OAuthApplicationListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): OAuthApplicationListPageResponse = response

    /**
     * Delegates to [OAuthApplicationListPageResponse], but gracefully handles missing data.
     *
     * @see [OAuthApplicationListPageResponse.data]
     */
    fun data(): List<OAuthApplication> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [OAuthApplicationListPageResponse], but gracefully handles missing data.
     *
     * @see [OAuthApplicationListPageResponse.nextCursor]
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is OAuthApplicationListPageAsync && oauthApplicationsService == other.oauthApplicationsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(oauthApplicationsService, params, response) /* spotless:on */

    override fun toString() =
        "OAuthApplicationListPageAsync{oauthApplicationsService=$oauthApplicationsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor().isPresent

    fun getNextPageParams(): Optional<OAuthApplicationListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextCursor().ifPresent { cursor(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<OAuthApplicationListPageAsync>> {
        return getNextPageParams()
            .map { oauthApplicationsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            oauthApplicationsService: OAuthApplicationServiceAsync,
            params: OAuthApplicationListParams,
            response: OAuthApplicationListPageResponse,
        ) = OAuthApplicationListPageAsync(oauthApplicationsService, params, response)
    }

    class AutoPager(private val firstPage: OAuthApplicationListPageAsync) {

        fun forEach(
            action: Predicate<OAuthApplication>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<OAuthApplicationListPageAsync>>.forEach(
                action: (OAuthApplication) -> Boolean,
                executor: Executor,
            ): CompletableFuture<Void> =
                thenComposeAsync(
                    { page ->
                        page
                            .filter { it.data().all(action) }
                            .map { it.getNextPage().forEach(action, executor) }
                            .orElseGet { CompletableFuture.completedFuture(null) }
                    },
                    executor,
                )
            return CompletableFuture.completedFuture(Optional.of(firstPage))
                .forEach(action::test, executor)
        }

        fun toList(executor: Executor): CompletableFuture<List<OAuthApplication>> {
            val values = mutableListOf<OAuthApplication>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
