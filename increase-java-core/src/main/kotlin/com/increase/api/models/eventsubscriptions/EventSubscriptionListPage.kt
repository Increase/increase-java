// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.eventsubscriptions

import com.increase.api.core.AutoPager
import com.increase.api.core.Page
import com.increase.api.core.checkRequired
import com.increase.api.services.blocking.EventSubscriptionService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see [EventSubscriptionService.list] */
class EventSubscriptionListPage
private constructor(
    private val service: EventSubscriptionService,
    private val params: EventSubscriptionListParams,
    private val response: EventSubscriptionListPageResponse,
) : Page<EventSubscription> {

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

    override fun items(): List<EventSubscription> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): EventSubscriptionListParams {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): EventSubscriptionListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<EventSubscription> = AutoPager.from(this)

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
