// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.accountnumbers

import com.increase.api.core.AutoPager
import com.increase.api.core.Page
import com.increase.api.core.checkRequired
import com.increase.api.services.blocking.AccountNumberService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see [AccountNumberService.list] */
class AccountNumberListPage
private constructor(
    private val service: AccountNumberService,
    private val params: AccountNumberListParams,
    private val response: AccountNumberListPageResponse,
) : Page<AccountNumber> {

    /**
     * Delegates to [AccountNumberListPageResponse], but gracefully handles missing data.
     *
     * @see [AccountNumberListPageResponse.data]
     */
    fun data(): List<AccountNumber> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [AccountNumberListPageResponse], but gracefully handles missing data.
     *
     * @see [AccountNumberListPageResponse.nextCursor]
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun items(): List<AccountNumber> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): AccountNumberListParams {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): AccountNumberListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<AccountNumber> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): AccountNumberListParams = params

    /** The response that this page was parsed from. */
    fun response(): AccountNumberListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AccountNumberListPage].
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

    /** A builder for [AccountNumberListPage]. */
    class Builder internal constructor() {

        private var service: AccountNumberService? = null
        private var params: AccountNumberListParams? = null
        private var response: AccountNumberListPageResponse? = null

        @JvmSynthetic
        internal fun from(accountNumberListPage: AccountNumberListPage) = apply {
            service = accountNumberListPage.service
            params = accountNumberListPage.params
            response = accountNumberListPage.response
        }

        fun service(service: AccountNumberService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: AccountNumberListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AccountNumberListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [AccountNumberListPage].
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
        fun build(): AccountNumberListPage =
            AccountNumberListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AccountNumberListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "AccountNumberListPage{service=$service, params=$params, response=$response}"
}
