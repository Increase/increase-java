// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.wiretransfers

import com.increase.api.services.blocking.WireTransferService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** List Wire Transfers */
class WireTransferListPage
private constructor(
    private val wireTransfersService: WireTransferService,
    private val params: WireTransferListParams,
    private val response: WireTransferListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): WireTransferListPageResponse = response

    /**
     * Delegates to [WireTransferListPageResponse], but gracefully handles missing data.
     *
     * @see [WireTransferListPageResponse.data]
     */
    fun data(): List<WireTransfer> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [WireTransferListPageResponse], but gracefully handles missing data.
     *
     * @see [WireTransferListPageResponse.nextCursor]
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is WireTransferListPage && wireTransfersService == other.wireTransfersService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(wireTransfersService, params, response) /* spotless:on */

    override fun toString() =
        "WireTransferListPage{wireTransfersService=$wireTransfersService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor().isPresent

    fun getNextPageParams(): Optional<WireTransferListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextCursor().ifPresent { cursor(it) } }.build()
        )
    }

    fun getNextPage(): Optional<WireTransferListPage> {
        return getNextPageParams().map { wireTransfersService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            wireTransfersService: WireTransferService,
            params: WireTransferListParams,
            response: WireTransferListPageResponse,
        ) = WireTransferListPage(wireTransfersService, params, response)
    }

    class AutoPager(private val firstPage: WireTransferListPage) : Iterable<WireTransfer> {

        override fun iterator(): Iterator<WireTransfer> = iterator {
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

        fun stream(): Stream<WireTransfer> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
