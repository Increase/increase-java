// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.achtransfers

import com.increase.api.services.blocking.AchTransferService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** List ACH Transfers */
class AchTransferListPage
private constructor(
    private val achTransfersService: AchTransferService,
    private val params: AchTransferListParams,
    private val response: AchTransferListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): AchTransferListPageResponse = response

    /**
     * Delegates to [AchTransferListPageResponse], but gracefully handles missing data.
     *
     * @see [AchTransferListPageResponse.data]
     */
    fun data(): List<AchTransfer> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [AchTransferListPageResponse], but gracefully handles missing data.
     *
     * @see [AchTransferListPageResponse.nextCursor]
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AchTransferListPage && achTransfersService == other.achTransfersService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(achTransfersService, params, response) /* spotless:on */

    override fun toString() =
        "AchTransferListPage{achTransfersService=$achTransfersService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor().isPresent

    fun getNextPageParams(): Optional<AchTransferListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextCursor().ifPresent { cursor(it) } }.build()
        )
    }

    fun getNextPage(): Optional<AchTransferListPage> {
        return getNextPageParams().map { achTransfersService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            achTransfersService: AchTransferService,
            params: AchTransferListParams,
            response: AchTransferListPageResponse,
        ) = AchTransferListPage(achTransfersService, params, response)
    }

    class AutoPager(private val firstPage: AchTransferListPage) : Iterable<AchTransfer> {

        override fun iterator(): Iterator<AchTransfer> = iterator {
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

        fun stream(): Stream<AchTransfer> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
