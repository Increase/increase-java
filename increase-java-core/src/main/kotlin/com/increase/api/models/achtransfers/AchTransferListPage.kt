// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.achtransfers

import com.increase.api.core.AutoPager
import com.increase.api.core.Page
import com.increase.api.core.checkRequired
import com.increase.api.services.blocking.AchTransferService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see [AchTransferService.list] */
class AchTransferListPage
private constructor(
    private val service: AchTransferService,
    private val params: AchTransferListParams,
    private val response: AchTransferListPageResponse,
) : Page<AchTransfer> {

    /**
     * Delegates to [AchTransferListPageResponse], but gracefully handles missing data.
     *
     * @see [AchTransferListPageResponse.data]
     */
    fun data(): List<AchTransfer> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [AchTransferListPageResponse], but gracefully handles missing data.
     *
     * @see [AchTransferListPageResponse.nextCursor]
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun items(): List<AchTransfer> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): AchTransferListParams {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): AchTransferListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<AchTransfer> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): AchTransferListParams = params

    /** The response that this page was parsed from. */
    fun response(): AchTransferListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AchTransferListPage].
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

    /** A builder for [AchTransferListPage]. */
    class Builder internal constructor() {

        private var service: AchTransferService? = null
        private var params: AchTransferListParams? = null
        private var response: AchTransferListPageResponse? = null

        @JvmSynthetic
        internal fun from(achTransferListPage: AchTransferListPage) = apply {
            service = achTransferListPage.service
            params = achTransferListPage.params
            response = achTransferListPage.response
        }

        fun service(service: AchTransferService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: AchTransferListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AchTransferListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [AchTransferListPage].
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
        fun build(): AchTransferListPage =
            AchTransferListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AchTransferListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "AchTransferListPage{service=$service, params=$params, response=$response}"
}
