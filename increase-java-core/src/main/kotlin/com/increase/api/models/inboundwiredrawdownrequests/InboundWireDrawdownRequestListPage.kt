// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.inboundwiredrawdownrequests

import com.increase.api.core.AutoPager
import com.increase.api.core.Page
import com.increase.api.core.checkRequired
import com.increase.api.services.blocking.InboundWireDrawdownRequestService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see InboundWireDrawdownRequestService.list */
class InboundWireDrawdownRequestListPage
private constructor(
    private val service: InboundWireDrawdownRequestService,
    private val params: InboundWireDrawdownRequestListParams,
    private val response: InboundWireDrawdownRequestListPageResponse,
) : Page<InboundWireDrawdownRequest> {

    /**
     * Delegates to [InboundWireDrawdownRequestListPageResponse], but gracefully handles missing
     * data.
     *
     * @see InboundWireDrawdownRequestListPageResponse.data
     */
    fun data(): List<InboundWireDrawdownRequest> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [InboundWireDrawdownRequestListPageResponse], but gracefully handles missing
     * data.
     *
     * @see InboundWireDrawdownRequestListPageResponse.nextCursor
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun items(): List<InboundWireDrawdownRequest> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): InboundWireDrawdownRequestListParams {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): InboundWireDrawdownRequestListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<InboundWireDrawdownRequest> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): InboundWireDrawdownRequestListParams = params

    /** The response that this page was parsed from. */
    fun response(): InboundWireDrawdownRequestListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [InboundWireDrawdownRequestListPage].
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

    /** A builder for [InboundWireDrawdownRequestListPage]. */
    class Builder internal constructor() {

        private var service: InboundWireDrawdownRequestService? = null
        private var params: InboundWireDrawdownRequestListParams? = null
        private var response: InboundWireDrawdownRequestListPageResponse? = null

        @JvmSynthetic
        internal fun from(inboundWireDrawdownRequestListPage: InboundWireDrawdownRequestListPage) =
            apply {
                service = inboundWireDrawdownRequestListPage.service
                params = inboundWireDrawdownRequestListPage.params
                response = inboundWireDrawdownRequestListPage.response
            }

        fun service(service: InboundWireDrawdownRequestService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: InboundWireDrawdownRequestListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: InboundWireDrawdownRequestListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [InboundWireDrawdownRequestListPage].
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
        fun build(): InboundWireDrawdownRequestListPage =
            InboundWireDrawdownRequestListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is InboundWireDrawdownRequestListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "InboundWireDrawdownRequestListPage{service=$service, params=$params, response=$response}"
}
