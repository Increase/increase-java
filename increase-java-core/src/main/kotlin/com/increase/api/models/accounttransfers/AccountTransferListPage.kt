// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.accounttransfers

import com.increase.api.core.AutoPager
import com.increase.api.core.Page
import com.increase.api.core.checkRequired
import com.increase.api.services.blocking.AccountTransferService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see AccountTransferService.list */
class AccountTransferListPage
private constructor(
    private val service: AccountTransferService,
    private val params: AccountTransferListParams,
    private val response: AccountTransferListPageResponse,
) : Page<AccountTransfer> {

    /**
     * Delegates to [AccountTransferListPageResponse], but gracefully handles missing data.
     *
     * @see AccountTransferListPageResponse.data
     */
    fun data(): List<AccountTransfer> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [AccountTransferListPageResponse], but gracefully handles missing data.
     *
     * @see AccountTransferListPageResponse.nextCursor
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun items(): List<AccountTransfer> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): AccountTransferListParams {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): AccountTransferListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<AccountTransfer> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): AccountTransferListParams = params

    /** The response that this page was parsed from. */
    fun response(): AccountTransferListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AccountTransferListPage].
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

    /** A builder for [AccountTransferListPage]. */
    class Builder internal constructor() {

        private var service: AccountTransferService? = null
        private var params: AccountTransferListParams? = null
        private var response: AccountTransferListPageResponse? = null

        @JvmSynthetic
        internal fun from(accountTransferListPage: AccountTransferListPage) = apply {
            service = accountTransferListPage.service
            params = accountTransferListPage.params
            response = accountTransferListPage.response
        }

        fun service(service: AccountTransferService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: AccountTransferListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AccountTransferListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [AccountTransferListPage].
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
        fun build(): AccountTransferListPage =
            AccountTransferListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AccountTransferListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "AccountTransferListPage{service=$service, params=$params, response=$response}"
}
