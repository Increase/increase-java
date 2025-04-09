// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.inboundachtransfers

import com.increase.api.services.blocking.InboundAchTransferService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** List Inbound ACH Transfers */
class InboundAchTransferListPage
private constructor(
    private val inboundAchTransfersService: InboundAchTransferService,
    private val params: InboundAchTransferListParams,
    private val response: InboundAchTransferListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): InboundAchTransferListPageResponse = response

    /**
     * Delegates to [InboundAchTransferListPageResponse], but gracefully handles missing data.
     *
     * @see [InboundAchTransferListPageResponse.data]
     */
    fun data(): List<InboundAchTransfer> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [InboundAchTransferListPageResponse], but gracefully handles missing data.
     *
     * @see [InboundAchTransferListPageResponse.nextCursor]
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is InboundAchTransferListPage && inboundAchTransfersService == other.inboundAchTransfersService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(inboundAchTransfersService, params, response) /* spotless:on */

    override fun toString() =
        "InboundAchTransferListPage{inboundAchTransfersService=$inboundAchTransfersService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor().isPresent

    fun getNextPageParams(): Optional<InboundAchTransferListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextCursor().ifPresent { cursor(it) } }.build()
        )
    }

    fun getNextPage(): Optional<InboundAchTransferListPage> {
        return getNextPageParams().map { inboundAchTransfersService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            inboundAchTransfersService: InboundAchTransferService,
            params: InboundAchTransferListParams,
            response: InboundAchTransferListPageResponse,
        ) = InboundAchTransferListPage(inboundAchTransfersService, params, response)
    }

    class AutoPager(private val firstPage: InboundAchTransferListPage) :
        Iterable<InboundAchTransfer> {

        override fun iterator(): Iterator<InboundAchTransfer> = iterator {
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

        fun stream(): Stream<InboundAchTransfer> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
