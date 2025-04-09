// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.routingnumbers

import com.increase.api.services.blocking.RoutingNumberService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/**
 * You can use this API to confirm if a routing number is valid, such as when a user is providing
 * you with bank account details. Since routing numbers uniquely identify a bank, this will always
 * return 0 or 1 entry. In Sandbox, the only valid routing number for this method is 110000000.
 */
class RoutingNumberListPage
private constructor(
    private val routingNumbersService: RoutingNumberService,
    private val params: RoutingNumberListParams,
    private val response: RoutingNumberListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): RoutingNumberListPageResponse = response

    /**
     * Delegates to [RoutingNumberListPageResponse], but gracefully handles missing data.
     *
     * @see [RoutingNumberListPageResponse.data]
     */
    fun data(): List<RoutingNumberListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [RoutingNumberListPageResponse], but gracefully handles missing data.
     *
     * @see [RoutingNumberListPageResponse.nextCursor]
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is RoutingNumberListPage && routingNumbersService == other.routingNumbersService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(routingNumbersService, params, response) /* spotless:on */

    override fun toString() =
        "RoutingNumberListPage{routingNumbersService=$routingNumbersService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor().isPresent

    fun getNextPageParams(): Optional<RoutingNumberListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextCursor().ifPresent { cursor(it) } }.build()
        )
    }

    fun getNextPage(): Optional<RoutingNumberListPage> {
        return getNextPageParams().map { routingNumbersService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            routingNumbersService: RoutingNumberService,
            params: RoutingNumberListParams,
            response: RoutingNumberListPageResponse,
        ) = RoutingNumberListPage(routingNumbersService, params, response)
    }

    class AutoPager(private val firstPage: RoutingNumberListPage) :
        Iterable<RoutingNumberListResponse> {

        override fun iterator(): Iterator<RoutingNumberListResponse> = iterator {
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

        fun stream(): Stream<RoutingNumberListResponse> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
