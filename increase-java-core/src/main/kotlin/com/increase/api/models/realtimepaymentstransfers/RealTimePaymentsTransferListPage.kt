// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.realtimepaymentstransfers

import com.increase.api.core.AutoPager
import com.increase.api.core.Page
import com.increase.api.core.checkRequired
import com.increase.api.services.blocking.RealTimePaymentsTransferService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see RealTimePaymentsTransferService.list */
class RealTimePaymentsTransferListPage
private constructor(
    private val service: RealTimePaymentsTransferService,
    private val params: RealTimePaymentsTransferListParams,
    private val response: RealTimePaymentsTransferListPageResponse,
) : Page<RealTimePaymentsTransfer> {

    /**
     * Delegates to [RealTimePaymentsTransferListPageResponse], but gracefully handles missing data.
     *
     * @see RealTimePaymentsTransferListPageResponse.data
     */
    fun data(): List<RealTimePaymentsTransfer> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [RealTimePaymentsTransferListPageResponse], but gracefully handles missing data.
     *
     * @see RealTimePaymentsTransferListPageResponse.nextCursor
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun items(): List<RealTimePaymentsTransfer> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): RealTimePaymentsTransferListParams {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): RealTimePaymentsTransferListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<RealTimePaymentsTransfer> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): RealTimePaymentsTransferListParams = params

    /** The response that this page was parsed from. */
    fun response(): RealTimePaymentsTransferListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [RealTimePaymentsTransferListPage].
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

    /** A builder for [RealTimePaymentsTransferListPage]. */
    class Builder internal constructor() {

        private var service: RealTimePaymentsTransferService? = null
        private var params: RealTimePaymentsTransferListParams? = null
        private var response: RealTimePaymentsTransferListPageResponse? = null

        @JvmSynthetic
        internal fun from(realTimePaymentsTransferListPage: RealTimePaymentsTransferListPage) =
            apply {
                service = realTimePaymentsTransferListPage.service
                params = realTimePaymentsTransferListPage.params
                response = realTimePaymentsTransferListPage.response
            }

        fun service(service: RealTimePaymentsTransferService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: RealTimePaymentsTransferListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: RealTimePaymentsTransferListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [RealTimePaymentsTransferListPage].
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
        fun build(): RealTimePaymentsTransferListPage =
            RealTimePaymentsTransferListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is RealTimePaymentsTransferListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "RealTimePaymentsTransferListPage{service=$service, params=$params, response=$response}"
}
