// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.eventsubscriptions

import com.increase.api.services.async.EventSubscriptionServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** List Event Subscriptions */
class EventSubscriptionListPageAsync
private constructor(
    private val eventSubscriptionsService: EventSubscriptionServiceAsync,
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

        return /* spotless:off */ other is EventSubscriptionListPageAsync && eventSubscriptionsService == other.eventSubscriptionsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(eventSubscriptionsService, params, response) /* spotless:on */

    override fun toString() =
        "EventSubscriptionListPageAsync{eventSubscriptionsService=$eventSubscriptionsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor().isPresent

    fun getNextPageParams(): Optional<EventSubscriptionListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextCursor().ifPresent { cursor(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<EventSubscriptionListPageAsync>> {
        return getNextPageParams()
            .map { eventSubscriptionsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            eventSubscriptionsService: EventSubscriptionServiceAsync,
            params: EventSubscriptionListParams,
            response: EventSubscriptionListPageResponse,
        ) = EventSubscriptionListPageAsync(eventSubscriptionsService, params, response)
    }

    class AutoPager(private val firstPage: EventSubscriptionListPageAsync) {

        fun forEach(
            action: Predicate<EventSubscription>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<EventSubscriptionListPageAsync>>.forEach(
                action: (EventSubscription) -> Boolean,
                executor: Executor,
            ): CompletableFuture<Void> =
                thenComposeAsync(
                    { page ->
                        page
                            .filter { it.data().all(action) }
                            .map { it.getNextPage().forEach(action, executor) }
                            .orElseGet { CompletableFuture.completedFuture(null) }
                    },
                    executor,
                )
            return CompletableFuture.completedFuture(Optional.of(firstPage))
                .forEach(action::test, executor)
        }

        fun toList(executor: Executor): CompletableFuture<List<EventSubscription>> {
            val values = mutableListOf<EventSubscription>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
