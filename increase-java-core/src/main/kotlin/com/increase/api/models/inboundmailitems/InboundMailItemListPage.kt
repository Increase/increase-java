// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.inboundmailitems

import com.increase.api.core.AutoPager
import com.increase.api.core.Page
import com.increase.api.core.checkRequired
import com.increase.api.services.blocking.InboundMailItemService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see InboundMailItemService.list */
class InboundMailItemListPage
private constructor(
    private val service: InboundMailItemService,
    private val params: InboundMailItemListParams,
    private val response: InboundMailItemListPageResponse,
) : Page<InboundMailItem> {

    /**
     * Delegates to [InboundMailItemListPageResponse], but gracefully handles missing data.
     *
     * @see InboundMailItemListPageResponse.data
     */
    fun data(): List<InboundMailItem> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [InboundMailItemListPageResponse], but gracefully handles missing data.
     *
     * @see InboundMailItemListPageResponse.nextCursor
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun items(): List<InboundMailItem> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): InboundMailItemListParams {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): InboundMailItemListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<InboundMailItem> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): InboundMailItemListParams = params

    /** The response that this page was parsed from. */
    fun response(): InboundMailItemListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [InboundMailItemListPage].
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

    /** A builder for [InboundMailItemListPage]. */
    class Builder internal constructor() {

        private var service: InboundMailItemService? = null
        private var params: InboundMailItemListParams? = null
        private var response: InboundMailItemListPageResponse? = null

        @JvmSynthetic
        internal fun from(inboundMailItemListPage: InboundMailItemListPage) = apply {
            service = inboundMailItemListPage.service
            params = inboundMailItemListPage.params
            response = inboundMailItemListPage.response
        }

        fun service(service: InboundMailItemService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: InboundMailItemListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: InboundMailItemListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [InboundMailItemListPage].
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
        fun build(): InboundMailItemListPage =
            InboundMailItemListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InboundMailItemListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "InboundMailItemListPage{service=$service, params=$params, response=$response}"
}
