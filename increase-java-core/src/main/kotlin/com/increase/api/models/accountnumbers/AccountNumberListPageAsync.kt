// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.accountnumbers

import com.increase.api.core.AutoPagerAsync
import com.increase.api.core.PageAsync
import com.increase.api.core.checkRequired
import com.increase.api.services.async.AccountNumberServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see AccountNumberServiceAsync.list */
class AccountNumberListPageAsync
private constructor(
    private val service: AccountNumberServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: AccountNumberListParams,
    private val response: AccountNumberListPageResponse,
) : PageAsync<AccountNumber> {

    /**
     * Delegates to [AccountNumberListPageResponse], but gracefully handles missing data.
     *
     * @see AccountNumberListPageResponse.data
     */
    fun data(): List<AccountNumber> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [AccountNumberListPageResponse], but gracefully handles missing data.
     *
     * @see AccountNumberListPageResponse.nextCursor
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

    override fun nextPage(): CompletableFuture<AccountNumberListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<AccountNumber> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): AccountNumberListParams = params

    /** The response that this page was parsed from. */
    fun response(): AccountNumberListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AccountNumberListPageAsync].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AccountNumberListPageAsync]. */
    class Builder internal constructor() {

        private var service: AccountNumberServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: AccountNumberListParams? = null
        private var response: AccountNumberListPageResponse? = null

        @JvmSynthetic
        internal fun from(accountNumberListPageAsync: AccountNumberListPageAsync) = apply {
            service = accountNumberListPageAsync.service
            streamHandlerExecutor = accountNumberListPageAsync.streamHandlerExecutor
            params = accountNumberListPageAsync.params
            response = accountNumberListPageAsync.response
        }

        fun service(service: AccountNumberServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: AccountNumberListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AccountNumberListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [AccountNumberListPageAsync].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AccountNumberListPageAsync =
            AccountNumberListPageAsync(
                checkRequired("service", service),
                checkRequired("streamHandlerExecutor", streamHandlerExecutor),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AccountNumberListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, response) /* spotless:on */

    override fun toString() =
        "AccountNumberListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
