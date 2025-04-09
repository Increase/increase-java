// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.checktransfers

import com.increase.api.services.async.CheckTransferServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** List Check Transfers */
class CheckTransferListPageAsync
private constructor(
    private val checkTransfersService: CheckTransferServiceAsync,
    private val params: CheckTransferListParams,
    private val response: CheckTransferListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): CheckTransferListPageResponse = response

    /**
     * Delegates to [CheckTransferListPageResponse], but gracefully handles missing data.
     *
     * @see [CheckTransferListPageResponse.data]
     */
    fun data(): List<CheckTransfer> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [CheckTransferListPageResponse], but gracefully handles missing data.
     *
     * @see [CheckTransferListPageResponse.nextCursor]
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CheckTransferListPageAsync && checkTransfersService == other.checkTransfersService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(checkTransfersService, params, response) /* spotless:on */

    override fun toString() =
        "CheckTransferListPageAsync{checkTransfersService=$checkTransfersService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor().isPresent

    fun getNextPageParams(): Optional<CheckTransferListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextCursor().ifPresent { cursor(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<CheckTransferListPageAsync>> {
        return getNextPageParams()
            .map { checkTransfersService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            checkTransfersService: CheckTransferServiceAsync,
            params: CheckTransferListParams,
            response: CheckTransferListPageResponse,
        ) = CheckTransferListPageAsync(checkTransfersService, params, response)
    }

    class AutoPager(private val firstPage: CheckTransferListPageAsync) {

        fun forEach(action: Predicate<CheckTransfer>, executor: Executor): CompletableFuture<Void> {
            fun CompletableFuture<Optional<CheckTransferListPageAsync>>.forEach(
                action: (CheckTransfer) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<CheckTransfer>> {
            val values = mutableListOf<CheckTransfer>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
