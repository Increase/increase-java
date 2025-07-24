// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.inboundachtransfers

import com.increase.api.core.AutoPager
import com.increase.api.core.Page
import com.increase.api.core.checkRequired
import com.increase.api.services.blocking.InboundAchTransferService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see InboundAchTransferService.list */
class InboundAchTransferListPage
private constructor(
    private val service: InboundAchTransferService,
    private val params: InboundAchTransferListParams,
    private val response: InboundAchTransferListPageResponse,
) : Page<InboundAchTransfer> {

    /**
     * Delegates to [InboundAchTransferListPageResponse], but gracefully handles missing data.
     *
     * @see InboundAchTransferListPageResponse.data
     */
    fun data(): List<InboundAchTransfer> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [InboundAchTransferListPageResponse], but gracefully handles missing data.
     *
     * @see InboundAchTransferListPageResponse.nextCursor
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun items(): List<InboundAchTransfer> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): InboundAchTransferListParams {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): InboundAchTransferListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<InboundAchTransfer> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): InboundAchTransferListParams = params

    /** The response that this page was parsed from. */
    fun response(): InboundAchTransferListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [InboundAchTransferListPage].
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

    /** A builder for [InboundAchTransferListPage]. */
    class Builder internal constructor() {

        private var service: InboundAchTransferService? = null
        private var params: InboundAchTransferListParams? = null
        private var response: InboundAchTransferListPageResponse? = null

        @JvmSynthetic
        internal fun from(inboundAchTransferListPage: InboundAchTransferListPage) = apply {
            service = inboundAchTransferListPage.service
            params = inboundAchTransferListPage.params
            response = inboundAchTransferListPage.response
        }

        fun service(service: InboundAchTransferService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: InboundAchTransferListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: InboundAchTransferListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [InboundAchTransferListPage].
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
        fun build(): InboundAchTransferListPage =
            InboundAchTransferListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is InboundAchTransferListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "InboundAchTransferListPage{service=$service, params=$params, response=$response}"
}
