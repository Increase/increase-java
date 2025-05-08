// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.accounttransfers

import com.increase.api.core.AutoPagerAsync
import com.increase.api.core.PageAsync
import com.increase.api.core.checkRequired
import com.increase.api.services.async.AccountTransferServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see [AccountTransferServiceAsync.list] */
class AccountTransferListPageAsync
private constructor(
    private val service: AccountTransferServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: AccountTransferListParams,
    private val response: AccountTransferListPageResponse,
) : PageAsync<AccountTransfer> {

    /**
     * Delegates to [AccountTransferListPageResponse], but gracefully handles missing data.
     *
     * @see [AccountTransferListPageResponse.data]
     */
    fun data(): List<AccountTransfer> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [AccountTransferListPageResponse], but gracefully handles missing data.
     *
     * @see [AccountTransferListPageResponse.nextCursor]
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

    override fun nextPage(): CompletableFuture<AccountTransferListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<AccountTransfer> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): AccountTransferListParams = params

    /** The response that this page was parsed from. */
    fun response(): AccountTransferListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AccountTransferListPageAsync].
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

    /** A builder for [AccountTransferListPageAsync]. */
    class Builder internal constructor() {

        private var service: AccountTransferServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: AccountTransferListParams? = null
        private var response: AccountTransferListPageResponse? = null

        @JvmSynthetic
        internal fun from(accountTransferListPageAsync: AccountTransferListPageAsync) = apply {
            service = accountTransferListPageAsync.service
            streamHandlerExecutor = accountTransferListPageAsync.streamHandlerExecutor
            params = accountTransferListPageAsync.params
            response = accountTransferListPageAsync.response
        }

        fun service(service: AccountTransferServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: AccountTransferListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AccountTransferListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [AccountTransferListPageAsync].
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
        fun build(): AccountTransferListPageAsync =
            AccountTransferListPageAsync(
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

        return /* spotless:off */ other is AccountTransferListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, response) /* spotless:on */

    override fun toString() =
        "AccountTransferListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
