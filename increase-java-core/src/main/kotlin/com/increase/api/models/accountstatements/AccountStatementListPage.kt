// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.accountstatements

import com.increase.api.core.AutoPager
import com.increase.api.core.Page
import com.increase.api.core.checkRequired
import com.increase.api.services.blocking.AccountStatementService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see AccountStatementService.list */
class AccountStatementListPage
private constructor(
    private val service: AccountStatementService,
    private val params: AccountStatementListParams,
    private val response: AccountStatementListPageResponse,
) : Page<AccountStatement> {

    /**
     * Delegates to [AccountStatementListPageResponse], but gracefully handles missing data.
     *
     * @see AccountStatementListPageResponse.data
     */
    fun data(): List<AccountStatement> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [AccountStatementListPageResponse], but gracefully handles missing data.
     *
     * @see AccountStatementListPageResponse.nextCursor
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun items(): List<AccountStatement> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): AccountStatementListParams {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): AccountStatementListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<AccountStatement> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): AccountStatementListParams = params

    /** The response that this page was parsed from. */
    fun response(): AccountStatementListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AccountStatementListPage].
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

    /** A builder for [AccountStatementListPage]. */
    class Builder internal constructor() {

        private var service: AccountStatementService? = null
        private var params: AccountStatementListParams? = null
        private var response: AccountStatementListPageResponse? = null

        @JvmSynthetic
        internal fun from(accountStatementListPage: AccountStatementListPage) = apply {
            service = accountStatementListPage.service
            params = accountStatementListPage.params
            response = accountStatementListPage.response
        }

        fun service(service: AccountStatementService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: AccountStatementListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AccountStatementListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [AccountStatementListPage].
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
        fun build(): AccountStatementListPage =
            AccountStatementListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AccountStatementListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "AccountStatementListPage{service=$service, params=$params, response=$response}"
}
