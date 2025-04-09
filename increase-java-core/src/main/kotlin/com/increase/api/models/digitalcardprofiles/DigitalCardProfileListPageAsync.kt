// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.digitalcardprofiles

import com.increase.api.services.async.DigitalCardProfileServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** List Card Profiles */
class DigitalCardProfileListPageAsync
private constructor(
    private val digitalCardProfilesService: DigitalCardProfileServiceAsync,
    private val params: DigitalCardProfileListParams,
    private val response: DigitalCardProfileListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): DigitalCardProfileListPageResponse = response

    /**
     * Delegates to [DigitalCardProfileListPageResponse], but gracefully handles missing data.
     *
     * @see [DigitalCardProfileListPageResponse.data]
     */
    fun data(): List<DigitalCardProfile> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [DigitalCardProfileListPageResponse], but gracefully handles missing data.
     *
     * @see [DigitalCardProfileListPageResponse.nextCursor]
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DigitalCardProfileListPageAsync && digitalCardProfilesService == other.digitalCardProfilesService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(digitalCardProfilesService, params, response) /* spotless:on */

    override fun toString() =
        "DigitalCardProfileListPageAsync{digitalCardProfilesService=$digitalCardProfilesService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor().isPresent

    fun getNextPageParams(): Optional<DigitalCardProfileListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextCursor().ifPresent { cursor(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<DigitalCardProfileListPageAsync>> {
        return getNextPageParams()
            .map { digitalCardProfilesService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            digitalCardProfilesService: DigitalCardProfileServiceAsync,
            params: DigitalCardProfileListParams,
            response: DigitalCardProfileListPageResponse,
        ) = DigitalCardProfileListPageAsync(digitalCardProfilesService, params, response)
    }

    class AutoPager(private val firstPage: DigitalCardProfileListPageAsync) {

        fun forEach(
            action: Predicate<DigitalCardProfile>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<DigitalCardProfileListPageAsync>>.forEach(
                action: (DigitalCardProfile) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<DigitalCardProfile>> {
            val values = mutableListOf<DigitalCardProfile>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
