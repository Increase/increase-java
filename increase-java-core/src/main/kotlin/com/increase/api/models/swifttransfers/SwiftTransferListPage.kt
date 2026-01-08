// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.swifttransfers

import com.increase.api.core.AutoPager
import com.increase.api.core.Page
import com.increase.api.core.checkRequired
import com.increase.api.services.blocking.SwiftTransferService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see SwiftTransferService.list */
class SwiftTransferListPage
private constructor(
    private val service: SwiftTransferService,
    private val params: SwiftTransferListParams,
    private val response: SwiftTransferListPageResponse,
) : Page<SwiftTransfer> {

    /**
     * Delegates to [SwiftTransferListPageResponse], but gracefully handles missing data.
     *
     * @see SwiftTransferListPageResponse.data
     */
    fun data(): List<SwiftTransfer> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [SwiftTransferListPageResponse], but gracefully handles missing data.
     *
     * @see SwiftTransferListPageResponse.nextCursor
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun items(): List<SwiftTransfer> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): SwiftTransferListParams {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): SwiftTransferListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<SwiftTransfer> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): SwiftTransferListParams = params

    /** The response that this page was parsed from. */
    fun response(): SwiftTransferListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SwiftTransferListPage].
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

    /** A builder for [SwiftTransferListPage]. */
    class Builder internal constructor() {

        private var service: SwiftTransferService? = null
        private var params: SwiftTransferListParams? = null
        private var response: SwiftTransferListPageResponse? = null

        @JvmSynthetic
        internal fun from(swiftTransferListPage: SwiftTransferListPage) = apply {
            service = swiftTransferListPage.service
            params = swiftTransferListPage.params
            response = swiftTransferListPage.response
        }

        fun service(service: SwiftTransferService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: SwiftTransferListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: SwiftTransferListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [SwiftTransferListPage].
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
        fun build(): SwiftTransferListPage =
            SwiftTransferListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SwiftTransferListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "SwiftTransferListPage{service=$service, params=$params, response=$response}"
}
