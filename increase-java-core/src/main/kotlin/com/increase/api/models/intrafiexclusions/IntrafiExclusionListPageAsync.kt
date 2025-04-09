// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.intrafiexclusions

import com.increase.api.services.async.IntrafiExclusionServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** List IntraFi Exclusions */
class IntrafiExclusionListPageAsync
private constructor(
    private val intrafiExclusionsService: IntrafiExclusionServiceAsync,
    private val params: IntrafiExclusionListParams,
    private val response: IntrafiExclusionListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): IntrafiExclusionListPageResponse = response

    /**
     * Delegates to [IntrafiExclusionListPageResponse], but gracefully handles missing data.
     *
     * @see [IntrafiExclusionListPageResponse.data]
     */
    fun data(): List<IntrafiExclusion> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [IntrafiExclusionListPageResponse], but gracefully handles missing data.
     *
     * @see [IntrafiExclusionListPageResponse.nextCursor]
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is IntrafiExclusionListPageAsync && intrafiExclusionsService == other.intrafiExclusionsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(intrafiExclusionsService, params, response) /* spotless:on */

    override fun toString() =
        "IntrafiExclusionListPageAsync{intrafiExclusionsService=$intrafiExclusionsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor().isPresent

    fun getNextPageParams(): Optional<IntrafiExclusionListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextCursor().ifPresent { cursor(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<IntrafiExclusionListPageAsync>> {
        return getNextPageParams()
            .map { intrafiExclusionsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            intrafiExclusionsService: IntrafiExclusionServiceAsync,
            params: IntrafiExclusionListParams,
            response: IntrafiExclusionListPageResponse,
        ) = IntrafiExclusionListPageAsync(intrafiExclusionsService, params, response)
    }

    class AutoPager(private val firstPage: IntrafiExclusionListPageAsync) {

        fun forEach(
            action: Predicate<IntrafiExclusion>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<IntrafiExclusionListPageAsync>>.forEach(
                action: (IntrafiExclusion) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<IntrafiExclusion>> {
            val values = mutableListOf<IntrafiExclusion>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
