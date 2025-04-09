// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.inboundrealtimepaymentstransfers

import com.increase.api.services.async.InboundRealTimePaymentsTransferServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** List Inbound Real-Time Payments Transfers */
class InboundRealTimePaymentsTransferListPageAsync
private constructor(
    private val inboundRealTimePaymentsTransfersService:
        InboundRealTimePaymentsTransferServiceAsync,
    private val params: InboundRealTimePaymentsTransferListParams,
    private val response: InboundRealTimePaymentsTransferListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): InboundRealTimePaymentsTransferListPageResponse = response

    /**
     * Delegates to [InboundRealTimePaymentsTransferListPageResponse], but gracefully handles
     * missing data.
     *
     * @see [InboundRealTimePaymentsTransferListPageResponse.data]
     */
    fun data(): List<InboundRealTimePaymentsTransfer> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [InboundRealTimePaymentsTransferListPageResponse], but gracefully handles
     * missing data.
     *
     * @see [InboundRealTimePaymentsTransferListPageResponse.nextCursor]
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is InboundRealTimePaymentsTransferListPageAsync && inboundRealTimePaymentsTransfersService == other.inboundRealTimePaymentsTransfersService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(inboundRealTimePaymentsTransfersService, params, response) /* spotless:on */

    override fun toString() =
        "InboundRealTimePaymentsTransferListPageAsync{inboundRealTimePaymentsTransfersService=$inboundRealTimePaymentsTransfersService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor().isPresent

    fun getNextPageParams(): Optional<InboundRealTimePaymentsTransferListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextCursor().ifPresent { cursor(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<InboundRealTimePaymentsTransferListPageAsync>> {
        return getNextPageParams()
            .map { inboundRealTimePaymentsTransfersService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            inboundRealTimePaymentsTransfersService: InboundRealTimePaymentsTransferServiceAsync,
            params: InboundRealTimePaymentsTransferListParams,
            response: InboundRealTimePaymentsTransferListPageResponse,
        ) =
            InboundRealTimePaymentsTransferListPageAsync(
                inboundRealTimePaymentsTransfersService,
                params,
                response,
            )
    }

    class AutoPager(private val firstPage: InboundRealTimePaymentsTransferListPageAsync) {

        fun forEach(
            action: Predicate<InboundRealTimePaymentsTransfer>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<InboundRealTimePaymentsTransferListPageAsync>>.forEach(
                action: (InboundRealTimePaymentsTransfer) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<InboundRealTimePaymentsTransfer>> {
            val values = mutableListOf<InboundRealTimePaymentsTransfer>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
