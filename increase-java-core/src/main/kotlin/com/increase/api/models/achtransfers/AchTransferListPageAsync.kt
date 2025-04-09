// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.achtransfers

import com.increase.api.services.async.AchTransferServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** List ACH Transfers */
class AchTransferListPageAsync
private constructor(
    private val achTransfersService: AchTransferServiceAsync,
    private val params: AchTransferListParams,
    private val response: AchTransferListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): AchTransferListPageResponse = response

    /**
     * Delegates to [AchTransferListPageResponse], but gracefully handles missing data.
     *
     * @see [AchTransferListPageResponse.data]
     */
    fun data(): List<AchTransfer> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [AchTransferListPageResponse], but gracefully handles missing data.
     *
     * @see [AchTransferListPageResponse.nextCursor]
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AchTransferListPageAsync && achTransfersService == other.achTransfersService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(achTransfersService, params, response) /* spotless:on */

    override fun toString() =
        "AchTransferListPageAsync{achTransfersService=$achTransfersService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor().isPresent

    fun getNextPageParams(): Optional<AchTransferListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextCursor().ifPresent { cursor(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<AchTransferListPageAsync>> {
        return getNextPageParams()
            .map { achTransfersService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            achTransfersService: AchTransferServiceAsync,
            params: AchTransferListParams,
            response: AchTransferListPageResponse,
        ) = AchTransferListPageAsync(achTransfersService, params, response)
    }

    class AutoPager(private val firstPage: AchTransferListPageAsync) {

        fun forEach(action: Predicate<AchTransfer>, executor: Executor): CompletableFuture<Void> {
            fun CompletableFuture<Optional<AchTransferListPageAsync>>.forEach(
                action: (AchTransfer) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<AchTransfer>> {
            val values = mutableListOf<AchTransfer>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
