// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.inboundwiretransfers

import com.increase.api.services.async.InboundWireTransferServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** List Inbound Wire Transfers */
class InboundWireTransferListPageAsync
private constructor(
    private val inboundWireTransfersService: InboundWireTransferServiceAsync,
    private val params: InboundWireTransferListParams,
    private val response: InboundWireTransferListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): InboundWireTransferListPageResponse = response

    /**
     * Delegates to [InboundWireTransferListPageResponse], but gracefully handles missing data.
     *
     * @see [InboundWireTransferListPageResponse.data]
     */
    fun data(): List<InboundWireTransfer> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [InboundWireTransferListPageResponse], but gracefully handles missing data.
     *
     * @see [InboundWireTransferListPageResponse.nextCursor]
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is InboundWireTransferListPageAsync && inboundWireTransfersService == other.inboundWireTransfersService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(inboundWireTransfersService, params, response) /* spotless:on */

    override fun toString() =
        "InboundWireTransferListPageAsync{inboundWireTransfersService=$inboundWireTransfersService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor().isPresent

    fun getNextPageParams(): Optional<InboundWireTransferListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextCursor().ifPresent { cursor(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<InboundWireTransferListPageAsync>> {
        return getNextPageParams()
            .map { inboundWireTransfersService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            inboundWireTransfersService: InboundWireTransferServiceAsync,
            params: InboundWireTransferListParams,
            response: InboundWireTransferListPageResponse,
        ) = InboundWireTransferListPageAsync(inboundWireTransfersService, params, response)
    }

    class AutoPager(private val firstPage: InboundWireTransferListPageAsync) {

        fun forEach(
            action: Predicate<InboundWireTransfer>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<InboundWireTransferListPageAsync>>.forEach(
                action: (InboundWireTransfer) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<InboundWireTransfer>> {
            val values = mutableListOf<InboundWireTransfer>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
