// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.eventsubscriptions

import com.increase.api.core.checkRequired
import com.increase.api.services.blocking.EventSubscriptionService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** @see [EventSubscriptionService.list] */
class EventSubscriptionListPage
private constructor(
    private val service: EventSubscriptionService,
    private val params: EventSubscriptionListParams,
    private val response: EventSubscriptionListPageResponse,
) {

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

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor().isPresent

    fun getNextPageParams(): Optional<EventSubscriptionListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextCursor().ifPresent { cursor(it) } }.build()
        )
    }

    fun getNextPage(): Optional<EventSubscriptionListPage> =
        getNextPageParams().map { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): EventSubscriptionListParams = params

    /** The response that this page was parsed from. */
    fun response(): EventSubscriptionListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EventSubscriptionListPage].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EventSubscriptionListPage]. */
    class Builder internal constructor() {

        private var service: EventSubscriptionService? = null
        private var params: EventSubscriptionListParams? = null
        private var response: EventSubscriptionListPageResponse? = null

        @JvmSynthetic
        internal fun from(eventSubscriptionListPage: EventSubscriptionListPage) = apply {
            service = eventSubscriptionListPage.service
            params = eventSubscriptionListPage.params
            response = eventSubscriptionListPage.response
        }

        fun service(service: EventSubscriptionService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: EventSubscriptionListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: EventSubscriptionListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [EventSubscriptionListPage].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EventSubscriptionListPage =
            EventSubscriptionListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is EventSubscriptionListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "EventSubscriptionListPage{service=$service, params=$params, response=$response}"
}
