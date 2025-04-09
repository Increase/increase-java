// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.checkdeposits

import com.increase.api.services.async.CheckDepositServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** List Check Deposits */
class CheckDepositListPageAsync
private constructor(
    private val checkDepositsService: CheckDepositServiceAsync,
    private val params: CheckDepositListParams,
    private val response: CheckDepositListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): CheckDepositListPageResponse = response

    /**
     * Delegates to [CheckDepositListPageResponse], but gracefully handles missing data.
     *
     * @see [CheckDepositListPageResponse.data]
     */
    fun data(): List<CheckDeposit> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [CheckDepositListPageResponse], but gracefully handles missing data.
     *
     * @see [CheckDepositListPageResponse.nextCursor]
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CheckDepositListPageAsync && checkDepositsService == other.checkDepositsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(checkDepositsService, params, response) /* spotless:on */

    override fun toString() =
        "CheckDepositListPageAsync{checkDepositsService=$checkDepositsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor().isPresent

    fun getNextPageParams(): Optional<CheckDepositListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextCursor().ifPresent { cursor(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<CheckDepositListPageAsync>> {
        return getNextPageParams()
            .map { checkDepositsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            checkDepositsService: CheckDepositServiceAsync,
            params: CheckDepositListParams,
            response: CheckDepositListPageResponse,
        ) = CheckDepositListPageAsync(checkDepositsService, params, response)
    }

    class AutoPager(private val firstPage: CheckDepositListPageAsync) {

        fun forEach(action: Predicate<CheckDeposit>, executor: Executor): CompletableFuture<Void> {
            fun CompletableFuture<Optional<CheckDepositListPageAsync>>.forEach(
                action: (CheckDeposit) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<CheckDeposit>> {
            val values = mutableListOf<CheckDeposit>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
