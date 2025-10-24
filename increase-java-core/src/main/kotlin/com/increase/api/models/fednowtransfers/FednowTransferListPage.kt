// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.fednowtransfers

import com.increase.api.core.AutoPager
import com.increase.api.core.Page
import com.increase.api.core.checkRequired
import com.increase.api.services.blocking.FednowTransferService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see FednowTransferService.list */
class FednowTransferListPage
private constructor(
    private val service: FednowTransferService,
    private val params: FednowTransferListParams,
    private val response: FednowTransferListPageResponse,
) : Page<FednowTransfer> {

    /**
     * Delegates to [FednowTransferListPageResponse], but gracefully handles missing data.
     *
     * @see FednowTransferListPageResponse.data
     */
    fun data(): List<FednowTransfer> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [FednowTransferListPageResponse], but gracefully handles missing data.
     *
     * @see FednowTransferListPageResponse.nextCursor
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun items(): List<FednowTransfer> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): FednowTransferListParams {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): FednowTransferListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<FednowTransfer> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): FednowTransferListParams = params

    /** The response that this page was parsed from. */
    fun response(): FednowTransferListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [FednowTransferListPage].
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

    /** A builder for [FednowTransferListPage]. */
    class Builder internal constructor() {

        private var service: FednowTransferService? = null
        private var params: FednowTransferListParams? = null
        private var response: FednowTransferListPageResponse? = null

        @JvmSynthetic
        internal fun from(fednowTransferListPage: FednowTransferListPage) = apply {
            service = fednowTransferListPage.service
            params = fednowTransferListPage.params
            response = fednowTransferListPage.response
        }

        fun service(service: FednowTransferService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: FednowTransferListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: FednowTransferListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [FednowTransferListPage].
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
        fun build(): FednowTransferListPage =
            FednowTransferListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FednowTransferListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "FednowTransferListPage{service=$service, params=$params, response=$response}"
}
