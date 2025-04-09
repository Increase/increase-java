// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.inboundcheckdeposits

import com.increase.api.services.async.InboundCheckDepositServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** List Inbound Check Deposits */
class InboundCheckDepositListPageAsync
private constructor(
    private val inboundCheckDepositsService: InboundCheckDepositServiceAsync,
    private val params: InboundCheckDepositListParams,
    private val response: InboundCheckDepositListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): InboundCheckDepositListPageResponse = response

    /**
     * Delegates to [InboundCheckDepositListPageResponse], but gracefully handles missing data.
     *
     * @see [InboundCheckDepositListPageResponse.data]
     */
    fun data(): List<InboundCheckDeposit> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [InboundCheckDepositListPageResponse], but gracefully handles missing data.
     *
     * @see [InboundCheckDepositListPageResponse.nextCursor]
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is InboundCheckDepositListPageAsync && inboundCheckDepositsService == other.inboundCheckDepositsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(inboundCheckDepositsService, params, response) /* spotless:on */

    override fun toString() =
        "InboundCheckDepositListPageAsync{inboundCheckDepositsService=$inboundCheckDepositsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor().isPresent

    fun getNextPageParams(): Optional<InboundCheckDepositListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextCursor().ifPresent { cursor(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<InboundCheckDepositListPageAsync>> {
        return getNextPageParams()
            .map { inboundCheckDepositsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            inboundCheckDepositsService: InboundCheckDepositServiceAsync,
            params: InboundCheckDepositListParams,
            response: InboundCheckDepositListPageResponse,
        ) = InboundCheckDepositListPageAsync(inboundCheckDepositsService, params, response)
    }

    class AutoPager(private val firstPage: InboundCheckDepositListPageAsync) {

        fun forEach(
            action: Predicate<InboundCheckDeposit>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<InboundCheckDepositListPageAsync>>.forEach(
                action: (InboundCheckDeposit) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<InboundCheckDeposit>> {
            val values = mutableListOf<InboundCheckDeposit>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
