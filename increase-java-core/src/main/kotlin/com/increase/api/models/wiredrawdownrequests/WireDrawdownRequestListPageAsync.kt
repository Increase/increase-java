// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.wiredrawdownrequests

import com.increase.api.services.async.WireDrawdownRequestServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** List Wire Drawdown Requests */
class WireDrawdownRequestListPageAsync
private constructor(
    private val wireDrawdownRequestsService: WireDrawdownRequestServiceAsync,
    private val params: WireDrawdownRequestListParams,
    private val response: WireDrawdownRequestListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): WireDrawdownRequestListPageResponse = response

    /**
     * Delegates to [WireDrawdownRequestListPageResponse], but gracefully handles missing data.
     *
     * @see [WireDrawdownRequestListPageResponse.data]
     */
    fun data(): List<WireDrawdownRequest> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [WireDrawdownRequestListPageResponse], but gracefully handles missing data.
     *
     * @see [WireDrawdownRequestListPageResponse.nextCursor]
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is WireDrawdownRequestListPageAsync && wireDrawdownRequestsService == other.wireDrawdownRequestsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(wireDrawdownRequestsService, params, response) /* spotless:on */

    override fun toString() =
        "WireDrawdownRequestListPageAsync{wireDrawdownRequestsService=$wireDrawdownRequestsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor().isPresent

    fun getNextPageParams(): Optional<WireDrawdownRequestListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextCursor().ifPresent { cursor(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<WireDrawdownRequestListPageAsync>> {
        return getNextPageParams()
            .map { wireDrawdownRequestsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            wireDrawdownRequestsService: WireDrawdownRequestServiceAsync,
            params: WireDrawdownRequestListParams,
            response: WireDrawdownRequestListPageResponse,
        ) = WireDrawdownRequestListPageAsync(wireDrawdownRequestsService, params, response)
    }

    class AutoPager(private val firstPage: WireDrawdownRequestListPageAsync) {

        fun forEach(
            action: Predicate<WireDrawdownRequest>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<WireDrawdownRequestListPageAsync>>.forEach(
                action: (WireDrawdownRequest) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<WireDrawdownRequest>> {
            val values = mutableListOf<WireDrawdownRequest>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
