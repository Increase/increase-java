// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.inboundcheckdeposits

import com.increase.api.services.blocking.InboundCheckDepositService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** List Inbound Check Deposits */
class InboundCheckDepositListPage
private constructor(
    private val inboundCheckDepositsService: InboundCheckDepositService,
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

        return /* spotless:off */ other is InboundCheckDepositListPage && inboundCheckDepositsService == other.inboundCheckDepositsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(inboundCheckDepositsService, params, response) /* spotless:on */

    override fun toString() =
        "InboundCheckDepositListPage{inboundCheckDepositsService=$inboundCheckDepositsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor().isPresent

    fun getNextPageParams(): Optional<InboundCheckDepositListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextCursor().ifPresent { cursor(it) } }.build()
        )
    }

    fun getNextPage(): Optional<InboundCheckDepositListPage> {
        return getNextPageParams().map { inboundCheckDepositsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            inboundCheckDepositsService: InboundCheckDepositService,
            params: InboundCheckDepositListParams,
            response: InboundCheckDepositListPageResponse,
        ) = InboundCheckDepositListPage(inboundCheckDepositsService, params, response)
    }

    class AutoPager(private val firstPage: InboundCheckDepositListPage) :
        Iterable<InboundCheckDeposit> {

        override fun iterator(): Iterator<InboundCheckDeposit> = iterator {
            var page = firstPage
            var index = 0
            while (true) {
                while (index < page.data().size) {
                    yield(page.data()[index++])
                }
                page = page.getNextPage().getOrNull() ?: break
                index = 0
            }
        }

        fun stream(): Stream<InboundCheckDeposit> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
