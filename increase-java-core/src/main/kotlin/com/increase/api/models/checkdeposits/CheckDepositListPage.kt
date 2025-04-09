// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.checkdeposits

import com.increase.api.services.blocking.CheckDepositService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** List Check Deposits */
class CheckDepositListPage
private constructor(
    private val checkDepositsService: CheckDepositService,
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

        return /* spotless:off */ other is CheckDepositListPage && checkDepositsService == other.checkDepositsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(checkDepositsService, params, response) /* spotless:on */

    override fun toString() =
        "CheckDepositListPage{checkDepositsService=$checkDepositsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor().isPresent

    fun getNextPageParams(): Optional<CheckDepositListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextCursor().ifPresent { cursor(it) } }.build()
        )
    }

    fun getNextPage(): Optional<CheckDepositListPage> {
        return getNextPageParams().map { checkDepositsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            checkDepositsService: CheckDepositService,
            params: CheckDepositListParams,
            response: CheckDepositListPageResponse,
        ) = CheckDepositListPage(checkDepositsService, params, response)
    }

    class AutoPager(private val firstPage: CheckDepositListPage) : Iterable<CheckDeposit> {

        override fun iterator(): Iterator<CheckDeposit> = iterator {
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

        fun stream(): Stream<CheckDeposit> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
