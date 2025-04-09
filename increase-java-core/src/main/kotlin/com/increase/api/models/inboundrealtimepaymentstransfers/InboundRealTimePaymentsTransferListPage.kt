// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.inboundrealtimepaymentstransfers

import com.increase.api.services.blocking.InboundRealTimePaymentsTransferService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** List Inbound Real-Time Payments Transfers */
class InboundRealTimePaymentsTransferListPage
private constructor(
    private val inboundRealTimePaymentsTransfersService: InboundRealTimePaymentsTransferService,
    private val params: InboundRealTimePaymentsTransferListParams,
    private val response: InboundRealTimePaymentsTransferListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): InboundRealTimePaymentsTransferListPageResponse = response

    /**
     * Delegates to [InboundRealTimePaymentsTransferListPageResponse], but gracefully handles
     * missing data.
     *
     * @see [InboundRealTimePaymentsTransferListPageResponse.data]
     */
    fun data(): List<InboundRealTimePaymentsTransfer> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [InboundRealTimePaymentsTransferListPageResponse], but gracefully handles
     * missing data.
     *
     * @see [InboundRealTimePaymentsTransferListPageResponse.nextCursor]
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is InboundRealTimePaymentsTransferListPage && inboundRealTimePaymentsTransfersService == other.inboundRealTimePaymentsTransfersService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(inboundRealTimePaymentsTransfersService, params, response) /* spotless:on */

    override fun toString() =
        "InboundRealTimePaymentsTransferListPage{inboundRealTimePaymentsTransfersService=$inboundRealTimePaymentsTransfersService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor().isPresent

    fun getNextPageParams(): Optional<InboundRealTimePaymentsTransferListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextCursor().ifPresent { cursor(it) } }.build()
        )
    }

    fun getNextPage(): Optional<InboundRealTimePaymentsTransferListPage> {
        return getNextPageParams().map { inboundRealTimePaymentsTransfersService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            inboundRealTimePaymentsTransfersService: InboundRealTimePaymentsTransferService,
            params: InboundRealTimePaymentsTransferListParams,
            response: InboundRealTimePaymentsTransferListPageResponse,
        ) =
            InboundRealTimePaymentsTransferListPage(
                inboundRealTimePaymentsTransfersService,
                params,
                response,
            )
    }

    class AutoPager(private val firstPage: InboundRealTimePaymentsTransferListPage) :
        Iterable<InboundRealTimePaymentsTransfer> {

        override fun iterator(): Iterator<InboundRealTimePaymentsTransfer> = iterator {
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

        fun stream(): Stream<InboundRealTimePaymentsTransfer> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
