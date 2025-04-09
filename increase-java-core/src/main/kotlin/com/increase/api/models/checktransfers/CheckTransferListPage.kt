// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.checktransfers

import com.increase.api.services.blocking.CheckTransferService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** List Check Transfers */
class CheckTransferListPage
private constructor(
    private val checkTransfersService: CheckTransferService,
    private val params: CheckTransferListParams,
    private val response: CheckTransferListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): CheckTransferListPageResponse = response

    /**
     * Delegates to [CheckTransferListPageResponse], but gracefully handles missing data.
     *
     * @see [CheckTransferListPageResponse.data]
     */
    fun data(): List<CheckTransfer> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [CheckTransferListPageResponse], but gracefully handles missing data.
     *
     * @see [CheckTransferListPageResponse.nextCursor]
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CheckTransferListPage && checkTransfersService == other.checkTransfersService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(checkTransfersService, params, response) /* spotless:on */

    override fun toString() =
        "CheckTransferListPage{checkTransfersService=$checkTransfersService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor().isPresent

    fun getNextPageParams(): Optional<CheckTransferListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextCursor().ifPresent { cursor(it) } }.build()
        )
    }

    fun getNextPage(): Optional<CheckTransferListPage> {
        return getNextPageParams().map { checkTransfersService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            checkTransfersService: CheckTransferService,
            params: CheckTransferListParams,
            response: CheckTransferListPageResponse,
        ) = CheckTransferListPage(checkTransfersService, params, response)
    }

    class AutoPager(private val firstPage: CheckTransferListPage) : Iterable<CheckTransfer> {

        override fun iterator(): Iterator<CheckTransfer> = iterator {
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

        fun stream(): Stream<CheckTransfer> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
