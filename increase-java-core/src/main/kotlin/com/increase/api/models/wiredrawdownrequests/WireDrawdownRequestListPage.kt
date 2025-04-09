// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.wiredrawdownrequests

import com.increase.api.services.blocking.WireDrawdownRequestService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** List Wire Drawdown Requests */
class WireDrawdownRequestListPage
private constructor(
    private val wireDrawdownRequestsService: WireDrawdownRequestService,
    private val params: WireDrawdownRequestListParams,
    private val response: WireDrawdownRequestListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): WireDrawdownRequestListPageResponse = response

    /**
     * Delegates to [WireDrawdownRequestListPageResponse], but gracefully handles missing data.
     *
     * @see [WireDrawdownRequestListPageResponse.data]
     */
    fun data(): List<WireDrawdownRequest> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [WireDrawdownRequestListPageResponse], but gracefully handles missing data.
     *
     * @see [WireDrawdownRequestListPageResponse.nextCursor]
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is WireDrawdownRequestListPage && wireDrawdownRequestsService == other.wireDrawdownRequestsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(wireDrawdownRequestsService, params, response) /* spotless:on */

    override fun toString() =
        "WireDrawdownRequestListPage{wireDrawdownRequestsService=$wireDrawdownRequestsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor().isPresent

    fun getNextPageParams(): Optional<WireDrawdownRequestListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextCursor().ifPresent { cursor(it) } }.build()
        )
    }

    fun getNextPage(): Optional<WireDrawdownRequestListPage> {
        return getNextPageParams().map { wireDrawdownRequestsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            wireDrawdownRequestsService: WireDrawdownRequestService,
            params: WireDrawdownRequestListParams,
            response: WireDrawdownRequestListPageResponse,
        ) = WireDrawdownRequestListPage(wireDrawdownRequestsService, params, response)
    }

    class AutoPager(private val firstPage: WireDrawdownRequestListPage) :
        Iterable<WireDrawdownRequest> {

        override fun iterator(): Iterator<WireDrawdownRequest> = iterator {
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

        fun stream(): Stream<WireDrawdownRequest> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
