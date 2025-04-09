// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.inboundwiredrawdownrequests

import com.increase.api.services.async.InboundWireDrawdownRequestServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** List Inbound Wire Drawdown Requests */
class InboundWireDrawdownRequestListPageAsync
private constructor(
    private val inboundWireDrawdownRequestsService: InboundWireDrawdownRequestServiceAsync,
    private val params: InboundWireDrawdownRequestListParams,
    private val response: InboundWireDrawdownRequestListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): InboundWireDrawdownRequestListPageResponse = response

    /**
     * Delegates to [InboundWireDrawdownRequestListPageResponse], but gracefully handles missing
     * data.
     *
     * @see [InboundWireDrawdownRequestListPageResponse.data]
     */
    fun data(): List<InboundWireDrawdownRequest> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [InboundWireDrawdownRequestListPageResponse], but gracefully handles missing
     * data.
     *
     * @see [InboundWireDrawdownRequestListPageResponse.nextCursor]
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is InboundWireDrawdownRequestListPageAsync && inboundWireDrawdownRequestsService == other.inboundWireDrawdownRequestsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(inboundWireDrawdownRequestsService, params, response) /* spotless:on */

    override fun toString() =
        "InboundWireDrawdownRequestListPageAsync{inboundWireDrawdownRequestsService=$inboundWireDrawdownRequestsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor().isPresent

    fun getNextPageParams(): Optional<InboundWireDrawdownRequestListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextCursor().ifPresent { cursor(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<InboundWireDrawdownRequestListPageAsync>> {
        return getNextPageParams()
            .map { inboundWireDrawdownRequestsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            inboundWireDrawdownRequestsService: InboundWireDrawdownRequestServiceAsync,
            params: InboundWireDrawdownRequestListParams,
            response: InboundWireDrawdownRequestListPageResponse,
        ) =
            InboundWireDrawdownRequestListPageAsync(
                inboundWireDrawdownRequestsService,
                params,
                response,
            )
    }

    class AutoPager(private val firstPage: InboundWireDrawdownRequestListPageAsync) {

        fun forEach(
            action: Predicate<InboundWireDrawdownRequest>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<InboundWireDrawdownRequestListPageAsync>>.forEach(
                action: (InboundWireDrawdownRequest) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<InboundWireDrawdownRequest>> {
            val values = mutableListOf<InboundWireDrawdownRequest>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
