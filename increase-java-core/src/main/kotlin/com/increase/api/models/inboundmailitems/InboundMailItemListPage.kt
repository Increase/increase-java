// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.inboundmailitems

import com.increase.api.services.blocking.InboundMailItemService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** List Inbound Mail Items */
class InboundMailItemListPage
private constructor(
    private val inboundMailItemsService: InboundMailItemService,
    private val params: InboundMailItemListParams,
    private val response: InboundMailItemListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): InboundMailItemListPageResponse = response

    /**
     * Delegates to [InboundMailItemListPageResponse], but gracefully handles missing data.
     *
     * @see [InboundMailItemListPageResponse.data]
     */
    fun data(): List<InboundMailItem> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [InboundMailItemListPageResponse], but gracefully handles missing data.
     *
     * @see [InboundMailItemListPageResponse.nextCursor]
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is InboundMailItemListPage && inboundMailItemsService == other.inboundMailItemsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(inboundMailItemsService, params, response) /* spotless:on */

    override fun toString() =
        "InboundMailItemListPage{inboundMailItemsService=$inboundMailItemsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor().isPresent

    fun getNextPageParams(): Optional<InboundMailItemListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextCursor().ifPresent { cursor(it) } }.build()
        )
    }

    fun getNextPage(): Optional<InboundMailItemListPage> {
        return getNextPageParams().map { inboundMailItemsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            inboundMailItemsService: InboundMailItemService,
            params: InboundMailItemListParams,
            response: InboundMailItemListPageResponse,
        ) = InboundMailItemListPage(inboundMailItemsService, params, response)
    }

    class AutoPager(private val firstPage: InboundMailItemListPage) : Iterable<InboundMailItem> {

        override fun iterator(): Iterator<InboundMailItem> = iterator {
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

        fun stream(): Stream<InboundMailItem> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
