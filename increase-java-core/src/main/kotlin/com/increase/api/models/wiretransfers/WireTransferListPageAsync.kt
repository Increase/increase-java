// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.wiretransfers

import com.increase.api.services.async.WireTransferServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** List Wire Transfers */
class WireTransferListPageAsync
private constructor(
    private val wireTransfersService: WireTransferServiceAsync,
    private val params: WireTransferListParams,
    private val response: WireTransferListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): WireTransferListPageResponse = response

    /**
     * Delegates to [WireTransferListPageResponse], but gracefully handles missing data.
     *
     * @see [WireTransferListPageResponse.data]
     */
    fun data(): List<WireTransfer> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [WireTransferListPageResponse], but gracefully handles missing data.
     *
     * @see [WireTransferListPageResponse.nextCursor]
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is WireTransferListPageAsync && wireTransfersService == other.wireTransfersService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(wireTransfersService, params, response) /* spotless:on */

    override fun toString() =
        "WireTransferListPageAsync{wireTransfersService=$wireTransfersService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor().isPresent

    fun getNextPageParams(): Optional<WireTransferListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextCursor().ifPresent { cursor(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<WireTransferListPageAsync>> {
        return getNextPageParams()
            .map { wireTransfersService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            wireTransfersService: WireTransferServiceAsync,
            params: WireTransferListParams,
            response: WireTransferListPageResponse,
        ) = WireTransferListPageAsync(wireTransfersService, params, response)
    }

    class AutoPager(private val firstPage: WireTransferListPageAsync) {

        fun forEach(action: Predicate<WireTransfer>, executor: Executor): CompletableFuture<Void> {
            fun CompletableFuture<Optional<WireTransferListPageAsync>>.forEach(
                action: (WireTransfer) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<WireTransfer>> {
            val values = mutableListOf<WireTransfer>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
