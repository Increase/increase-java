// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.inboundwiretransfers

import com.increase.api.core.AutoPager
import com.increase.api.core.Page
import com.increase.api.core.checkRequired
import com.increase.api.services.blocking.InboundWireTransferService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see InboundWireTransferService.list */
class InboundWireTransferListPage
private constructor(
    private val service: InboundWireTransferService,
    private val params: InboundWireTransferListParams,
    private val response: InboundWireTransferListPageResponse,
) : Page<InboundWireTransfer> {

    /**
     * Delegates to [InboundWireTransferListPageResponse], but gracefully handles missing data.
     *
     * @see InboundWireTransferListPageResponse.data
     */
    fun data(): List<InboundWireTransfer> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [InboundWireTransferListPageResponse], but gracefully handles missing data.
     *
     * @see InboundWireTransferListPageResponse.nextCursor
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun items(): List<InboundWireTransfer> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): InboundWireTransferListParams {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): InboundWireTransferListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<InboundWireTransfer> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): InboundWireTransferListParams = params

    /** The response that this page was parsed from. */
    fun response(): InboundWireTransferListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [InboundWireTransferListPage].
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

    /** A builder for [InboundWireTransferListPage]. */
    class Builder internal constructor() {

        private var service: InboundWireTransferService? = null
        private var params: InboundWireTransferListParams? = null
        private var response: InboundWireTransferListPageResponse? = null

        @JvmSynthetic
        internal fun from(inboundWireTransferListPage: InboundWireTransferListPage) = apply {
            service = inboundWireTransferListPage.service
            params = inboundWireTransferListPage.params
            response = inboundWireTransferListPage.response
        }

        fun service(service: InboundWireTransferService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: InboundWireTransferListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: InboundWireTransferListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [InboundWireTransferListPage].
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
        fun build(): InboundWireTransferListPage =
            InboundWireTransferListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InboundWireTransferListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "InboundWireTransferListPage{service=$service, params=$params, response=$response}"
}
