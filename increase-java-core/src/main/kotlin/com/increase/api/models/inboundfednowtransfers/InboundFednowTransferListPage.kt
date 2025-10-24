// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.inboundfednowtransfers

import com.increase.api.core.AutoPager
import com.increase.api.core.Page
import com.increase.api.core.checkRequired
import com.increase.api.services.blocking.InboundFednowTransferService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see InboundFednowTransferService.list */
class InboundFednowTransferListPage
private constructor(
    private val service: InboundFednowTransferService,
    private val params: InboundFednowTransferListParams,
    private val response: InboundFednowTransferListPageResponse,
) : Page<InboundFednowTransfer> {

    /**
     * Delegates to [InboundFednowTransferListPageResponse], but gracefully handles missing data.
     *
     * @see InboundFednowTransferListPageResponse.data
     */
    fun data(): List<InboundFednowTransfer> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [InboundFednowTransferListPageResponse], but gracefully handles missing data.
     *
     * @see InboundFednowTransferListPageResponse.nextCursor
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun items(): List<InboundFednowTransfer> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): InboundFednowTransferListParams {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): InboundFednowTransferListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<InboundFednowTransfer> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): InboundFednowTransferListParams = params

    /** The response that this page was parsed from. */
    fun response(): InboundFednowTransferListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [InboundFednowTransferListPage].
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

    /** A builder for [InboundFednowTransferListPage]. */
    class Builder internal constructor() {

        private var service: InboundFednowTransferService? = null
        private var params: InboundFednowTransferListParams? = null
        private var response: InboundFednowTransferListPageResponse? = null

        @JvmSynthetic
        internal fun from(inboundFednowTransferListPage: InboundFednowTransferListPage) = apply {
            service = inboundFednowTransferListPage.service
            params = inboundFednowTransferListPage.params
            response = inboundFednowTransferListPage.response
        }

        fun service(service: InboundFednowTransferService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: InboundFednowTransferListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: InboundFednowTransferListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [InboundFednowTransferListPage].
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
        fun build(): InboundFednowTransferListPage =
            InboundFednowTransferListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InboundFednowTransferListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "InboundFednowTransferListPage{service=$service, params=$params, response=$response}"
}
