// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.bookkeepingaccounts

import com.increase.api.core.AutoPager
import com.increase.api.core.Page
import com.increase.api.core.checkRequired
import com.increase.api.services.blocking.BookkeepingAccountService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see BookkeepingAccountService.list */
class BookkeepingAccountListPage
private constructor(
    private val service: BookkeepingAccountService,
    private val params: BookkeepingAccountListParams,
    private val response: BookkeepingAccountListPageResponse,
) : Page<BookkeepingAccount> {

    /**
     * Delegates to [BookkeepingAccountListPageResponse], but gracefully handles missing data.
     *
     * @see BookkeepingAccountListPageResponse.data
     */
    fun data(): List<BookkeepingAccount> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [BookkeepingAccountListPageResponse], but gracefully handles missing data.
     *
     * @see BookkeepingAccountListPageResponse.nextCursor
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun items(): List<BookkeepingAccount> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): BookkeepingAccountListParams {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): BookkeepingAccountListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<BookkeepingAccount> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): BookkeepingAccountListParams = params

    /** The response that this page was parsed from. */
    fun response(): BookkeepingAccountListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BookkeepingAccountListPage].
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

    /** A builder for [BookkeepingAccountListPage]. */
    class Builder internal constructor() {

        private var service: BookkeepingAccountService? = null
        private var params: BookkeepingAccountListParams? = null
        private var response: BookkeepingAccountListPageResponse? = null

        @JvmSynthetic
        internal fun from(bookkeepingAccountListPage: BookkeepingAccountListPage) = apply {
            service = bookkeepingAccountListPage.service
            params = bookkeepingAccountListPage.params
            response = bookkeepingAccountListPage.response
        }

        fun service(service: BookkeepingAccountService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: BookkeepingAccountListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: BookkeepingAccountListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [BookkeepingAccountListPage].
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
        fun build(): BookkeepingAccountListPage =
            BookkeepingAccountListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BookkeepingAccountListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "BookkeepingAccountListPage{service=$service, params=$params, response=$response}"
}
