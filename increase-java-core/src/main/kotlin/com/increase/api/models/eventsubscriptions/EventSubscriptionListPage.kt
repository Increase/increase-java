// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.eventsubscriptions

import com.increase.api.services.blocking.EventSubscriptionService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** List Event Subscriptions */
class EventSubscriptionListPage
private constructor(
    private val eventSubscriptionsService: EventSubscriptionService,
    private val params: EventSubscriptionListParams,
    private val response: EventSubscriptionListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): EventSubscriptionListPageResponse = response

    /**
     * Delegates to [EventSubscriptionListPageResponse], but gracefully handles missing data.
     *
     * @see [EventSubscriptionListPageResponse.data]
     */
    fun data(): List<EventSubscription> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [EventSubscriptionListPageResponse], but gracefully handles missing data.
     *
     * @see [EventSubscriptionListPageResponse.nextCursor]
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is EventSubscriptionListPage && eventSubscriptionsService == other.eventSubscriptionsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(eventSubscriptionsService, params, response) /* spotless:on */

    override fun toString() =
        "EventSubscriptionListPage{eventSubscriptionsService=$eventSubscriptionsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor().isPresent

    fun getNextPageParams(): Optional<EventSubscriptionListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextCursor().ifPresent { cursor(it) } }.build()
        )
    }

    fun getNextPage(): Optional<EventSubscriptionListPage> {
        return getNextPageParams().map { eventSubscriptionsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            eventSubscriptionsService: EventSubscriptionService,
            params: EventSubscriptionListParams,
            response: EventSubscriptionListPageResponse,
        ) = EventSubscriptionListPage(eventSubscriptionsService, params, response)
    }

    class AutoPager(private val firstPage: EventSubscriptionListPage) :
        Iterable<EventSubscription> {

        override fun iterator(): Iterator<EventSubscription> = iterator {
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

        fun stream(): Stream<EventSubscription> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
