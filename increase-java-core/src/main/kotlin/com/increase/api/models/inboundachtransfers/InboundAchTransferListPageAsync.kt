// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.inboundachtransfers

import com.increase.api.services.async.InboundAchTransferServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** List Inbound ACH Transfers */
class InboundAchTransferListPageAsync
private constructor(
    private val inboundAchTransfersService: InboundAchTransferServiceAsync,
    private val params: InboundAchTransferListParams,
    private val response: InboundAchTransferListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): InboundAchTransferListPageResponse = response

    /**
     * Delegates to [InboundAchTransferListPageResponse], but gracefully handles missing data.
     *
     * @see [InboundAchTransferListPageResponse.data]
     */
    fun data(): List<InboundAchTransfer> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [InboundAchTransferListPageResponse], but gracefully handles missing data.
     *
     * @see [InboundAchTransferListPageResponse.nextCursor]
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is InboundAchTransferListPageAsync && inboundAchTransfersService == other.inboundAchTransfersService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(inboundAchTransfersService, params, response) /* spotless:on */

    override fun toString() =
        "InboundAchTransferListPageAsync{inboundAchTransfersService=$inboundAchTransfersService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor().isPresent

    fun getNextPageParams(): Optional<InboundAchTransferListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextCursor().ifPresent { cursor(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<InboundAchTransferListPageAsync>> {
        return getNextPageParams()
            .map { inboundAchTransfersService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            inboundAchTransfersService: InboundAchTransferServiceAsync,
            params: InboundAchTransferListParams,
            response: InboundAchTransferListPageResponse,
        ) = InboundAchTransferListPageAsync(inboundAchTransfersService, params, response)
    }

    class AutoPager(private val firstPage: InboundAchTransferListPageAsync) {

        fun forEach(
            action: Predicate<InboundAchTransfer>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<InboundAchTransferListPageAsync>>.forEach(
                action: (InboundAchTransfer) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<InboundAchTransfer>> {
            val values = mutableListOf<InboundAchTransfer>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
