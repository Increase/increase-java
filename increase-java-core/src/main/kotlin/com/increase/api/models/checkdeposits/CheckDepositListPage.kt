// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.checkdeposits

import com.increase.api.core.AutoPager
import com.increase.api.core.Page
import com.increase.api.core.checkRequired
import com.increase.api.services.blocking.CheckDepositService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see [CheckDepositService.list] */
class CheckDepositListPage
private constructor(
    private val service: CheckDepositService,
    private val params: CheckDepositListParams,
    private val response: CheckDepositListPageResponse,
) : Page<CheckDeposit> {

    /**
     * Delegates to [CheckDepositListPageResponse], but gracefully handles missing data.
     *
     * @see [CheckDepositListPageResponse.data]
     */
    fun data(): List<CheckDeposit> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [CheckDepositListPageResponse], but gracefully handles missing data.
     *
     * @see [CheckDepositListPageResponse.nextCursor]
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun items(): List<CheckDeposit> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): CheckDepositListParams {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): CheckDepositListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<CheckDeposit> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): CheckDepositListParams = params

    /** The response that this page was parsed from. */
    fun response(): CheckDepositListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CheckDepositListPage].
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

    /** A builder for [CheckDepositListPage]. */
    class Builder internal constructor() {

        private var service: CheckDepositService? = null
        private var params: CheckDepositListParams? = null
        private var response: CheckDepositListPageResponse? = null

        @JvmSynthetic
        internal fun from(checkDepositListPage: CheckDepositListPage) = apply {
            service = checkDepositListPage.service
            params = checkDepositListPage.params
            response = checkDepositListPage.response
        }

        fun service(service: CheckDepositService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CheckDepositListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CheckDepositListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [CheckDepositListPage].
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
        fun build(): CheckDepositListPage =
            CheckDepositListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CheckDepositListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "CheckDepositListPage{service=$service, params=$params, response=$response}"
}
