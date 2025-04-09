// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.accounttransfers

import com.increase.api.services.async.AccountTransferServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** List Account Transfers */
class AccountTransferListPageAsync
private constructor(
    private val accountTransfersService: AccountTransferServiceAsync,
    private val params: AccountTransferListParams,
    private val response: AccountTransferListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): AccountTransferListPageResponse = response

    /**
     * Delegates to [AccountTransferListPageResponse], but gracefully handles missing data.
     *
     * @see [AccountTransferListPageResponse.data]
     */
    fun data(): List<AccountTransfer> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [AccountTransferListPageResponse], but gracefully handles missing data.
     *
     * @see [AccountTransferListPageResponse.nextCursor]
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AccountTransferListPageAsync && accountTransfersService == other.accountTransfersService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(accountTransfersService, params, response) /* spotless:on */

    override fun toString() =
        "AccountTransferListPageAsync{accountTransfersService=$accountTransfersService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor().isPresent

    fun getNextPageParams(): Optional<AccountTransferListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextCursor().ifPresent { cursor(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<AccountTransferListPageAsync>> {
        return getNextPageParams()
            .map { accountTransfersService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            accountTransfersService: AccountTransferServiceAsync,
            params: AccountTransferListParams,
            response: AccountTransferListPageResponse,
        ) = AccountTransferListPageAsync(accountTransfersService, params, response)
    }

    class AutoPager(private val firstPage: AccountTransferListPageAsync) {

        fun forEach(
            action: Predicate<AccountTransfer>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<AccountTransferListPageAsync>>.forEach(
                action: (AccountTransfer) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<AccountTransfer>> {
            val values = mutableListOf<AccountTransfer>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
