// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.events

import com.increase.api.services.async.EventServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** List Events */
class EventListPageAsync
private constructor(
    private val eventsService: EventServiceAsync,
    private val params: EventListParams,
    private val response: EventListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): EventListPageResponse = response

    /**
     * Delegates to [EventListPageResponse], but gracefully handles missing data.
     *
     * @see [EventListPageResponse.data]
     */
    fun data(): List<Event> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [EventListPageResponse], but gracefully handles missing data.
     *
     * @see [EventListPageResponse.nextCursor]
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is EventListPageAsync && eventsService == other.eventsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(eventsService, params, response) /* spotless:on */

    override fun toString() =
        "EventListPageAsync{eventsService=$eventsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor().isPresent

    fun getNextPageParams(): Optional<EventListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextCursor().ifPresent { cursor(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<EventListPageAsync>> {
        return getNextPageParams()
            .map { eventsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            eventsService: EventServiceAsync,
            params: EventListParams,
            response: EventListPageResponse,
        ) = EventListPageAsync(eventsService, params, response)
    }

    class AutoPager(private val firstPage: EventListPageAsync) {

        fun forEach(action: Predicate<Event>, executor: Executor): CompletableFuture<Void> {
            fun CompletableFuture<Optional<EventListPageAsync>>.forEach(
                action: (Event) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<Event>> {
            val values = mutableListOf<Event>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
