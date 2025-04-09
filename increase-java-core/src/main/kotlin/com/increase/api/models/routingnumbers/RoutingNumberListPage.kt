// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.routingnumbers

import com.increase.api.core.checkRequired
import com.increase.api.services.blocking.RoutingNumberService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** @see [RoutingNumberService.list] */
class RoutingNumberListPage
private constructor(
    private val service: RoutingNumberService,
    private val params: RoutingNumberListParams,
    private val response: RoutingNumberListPageResponse,
) {

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

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor().isPresent

    fun getNextPageParams(): Optional<RoutingNumberListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextCursor().ifPresent { cursor(it) } }.build()
        )
    }

    fun getNextPage(): Optional<RoutingNumberListPage> =
        getNextPageParams().map { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): RoutingNumberListParams = params

    /** The response that this page was parsed from. */
    fun response(): RoutingNumberListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [RoutingNumberListPage].
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

    /** A builder for [RoutingNumberListPage]. */
    class Builder internal constructor() {

        private var service: RoutingNumberService? = null
        private var params: RoutingNumberListParams? = null
        private var response: RoutingNumberListPageResponse? = null

        @JvmSynthetic
        internal fun from(routingNumberListPage: RoutingNumberListPage) = apply {
            service = routingNumberListPage.service
            params = routingNumberListPage.params
            response = routingNumberListPage.response
        }

        fun service(service: RoutingNumberService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: RoutingNumberListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: RoutingNumberListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [RoutingNumberListPage].
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
        fun build(): RoutingNumberListPage =
            RoutingNumberListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is RoutingNumberListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "RoutingNumberListPage{service=$service, params=$params, response=$response}"
}
