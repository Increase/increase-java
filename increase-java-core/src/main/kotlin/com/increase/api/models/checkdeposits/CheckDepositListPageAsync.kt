// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.checkdeposits

import com.increase.api.core.AutoPagerAsync
import com.increase.api.core.PageAsync
import com.increase.api.core.checkRequired
import com.increase.api.services.async.CheckDepositServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see CheckDepositServiceAsync.list */
class CheckDepositListPageAsync
private constructor(
    private val service: CheckDepositServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: CheckDepositListParams,
    private val response: CheckDepositListPageResponse,
) : PageAsync<CheckDeposit> {

    /**
     * Delegates to [CheckDepositListPageResponse], but gracefully handles missing data.
     *
     * @see CheckDepositListPageResponse.data
     */
    fun data(): List<CheckDeposit> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [CheckDepositListPageResponse], but gracefully handles missing data.
     *
     * @see CheckDepositListPageResponse.nextCursor
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

    override fun nextPage(): CompletableFuture<CheckDepositListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<CheckDeposit> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): CheckDepositListParams = params

    /** The response that this page was parsed from. */
    fun response(): CheckDepositListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CheckDepositListPageAsync].
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

    /** A builder for [CheckDepositListPageAsync]. */
    class Builder internal constructor() {

        private var service: CheckDepositServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: CheckDepositListParams? = null
        private var response: CheckDepositListPageResponse? = null

        @JvmSynthetic
        internal fun from(checkDepositListPageAsync: CheckDepositListPageAsync) = apply {
            service = checkDepositListPageAsync.service
            streamHandlerExecutor = checkDepositListPageAsync.streamHandlerExecutor
            params = checkDepositListPageAsync.params
            response = checkDepositListPageAsync.response
        }

        fun service(service: CheckDepositServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: CheckDepositListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CheckDepositListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [CheckDepositListPageAsync].
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
        fun build(): CheckDepositListPageAsync =
            CheckDepositListPageAsync(
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

        return /* spotless:off */ other is CheckDepositListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, response) /* spotless:on */

    override fun toString() =
        "CheckDepositListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
