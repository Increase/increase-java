// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.realtimepaymentstransfers

import com.increase.api.services.blocking.RealTimePaymentsTransferService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** List Real-Time Payments Transfers */
class RealTimePaymentsTransferListPage
private constructor(
    private val realTimePaymentsTransfersService: RealTimePaymentsTransferService,
    private val params: RealTimePaymentsTransferListParams,
    private val response: RealTimePaymentsTransferListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): RealTimePaymentsTransferListPageResponse = response

    /**
     * Delegates to [RealTimePaymentsTransferListPageResponse], but gracefully handles missing data.
     *
     * @see [RealTimePaymentsTransferListPageResponse.data]
     */
    fun data(): List<RealTimePaymentsTransfer> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [RealTimePaymentsTransferListPageResponse], but gracefully handles missing data.
     *
     * @see [RealTimePaymentsTransferListPageResponse.nextCursor]
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is RealTimePaymentsTransferListPage && realTimePaymentsTransfersService == other.realTimePaymentsTransfersService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(realTimePaymentsTransfersService, params, response) /* spotless:on */

    override fun toString() =
        "RealTimePaymentsTransferListPage{realTimePaymentsTransfersService=$realTimePaymentsTransfersService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor().isPresent

    fun getNextPageParams(): Optional<RealTimePaymentsTransferListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextCursor().ifPresent { cursor(it) } }.build()
        )
    }

    fun getNextPage(): Optional<RealTimePaymentsTransferListPage> {
        return getNextPageParams().map { realTimePaymentsTransfersService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            realTimePaymentsTransfersService: RealTimePaymentsTransferService,
            params: RealTimePaymentsTransferListParams,
            response: RealTimePaymentsTransferListPageResponse,
        ) = RealTimePaymentsTransferListPage(realTimePaymentsTransfersService, params, response)
    }

    class AutoPager(private val firstPage: RealTimePaymentsTransferListPage) :
        Iterable<RealTimePaymentsTransfer> {

        override fun iterator(): Iterator<RealTimePaymentsTransfer> = iterator {
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

        fun stream(): Stream<RealTimePaymentsTransfer> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
