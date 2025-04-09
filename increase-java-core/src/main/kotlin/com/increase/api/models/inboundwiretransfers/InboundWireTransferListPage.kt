// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.inboundwiretransfers

import com.increase.api.services.blocking.InboundWireTransferService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** List Inbound Wire Transfers */
class InboundWireTransferListPage
private constructor(
    private val inboundWireTransfersService: InboundWireTransferService,
    private val params: InboundWireTransferListParams,
    private val response: InboundWireTransferListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): InboundWireTransferListPageResponse = response

    /**
     * Delegates to [InboundWireTransferListPageResponse], but gracefully handles missing data.
     *
     * @see [InboundWireTransferListPageResponse.data]
     */
    fun data(): List<InboundWireTransfer> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [InboundWireTransferListPageResponse], but gracefully handles missing data.
     *
     * @see [InboundWireTransferListPageResponse.nextCursor]
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is InboundWireTransferListPage && inboundWireTransfersService == other.inboundWireTransfersService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(inboundWireTransfersService, params, response) /* spotless:on */

    override fun toString() =
        "InboundWireTransferListPage{inboundWireTransfersService=$inboundWireTransfersService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor().isPresent

    fun getNextPageParams(): Optional<InboundWireTransferListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextCursor().ifPresent { cursor(it) } }.build()
        )
    }

    fun getNextPage(): Optional<InboundWireTransferListPage> {
        return getNextPageParams().map { inboundWireTransfersService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            inboundWireTransfersService: InboundWireTransferService,
            params: InboundWireTransferListParams,
            response: InboundWireTransferListPageResponse,
        ) = InboundWireTransferListPage(inboundWireTransfersService, params, response)
    }

    class AutoPager(private val firstPage: InboundWireTransferListPage) :
        Iterable<InboundWireTransfer> {

        override fun iterator(): Iterator<InboundWireTransfer> = iterator {
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

        fun stream(): Stream<InboundWireTransfer> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
