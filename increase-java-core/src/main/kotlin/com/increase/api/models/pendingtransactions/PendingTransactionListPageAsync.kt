// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.pendingtransactions

import com.increase.api.core.AutoPagerAsync
import com.increase.api.core.PageAsync
import com.increase.api.core.checkRequired
import com.increase.api.services.async.PendingTransactionServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see PendingTransactionServiceAsync.list */
class PendingTransactionListPageAsync
private constructor(
    private val service: PendingTransactionServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: PendingTransactionListParams,
    private val response: PendingTransactionListPageResponse,
) : PageAsync<PendingTransaction> {

    /**
     * Delegates to [PendingTransactionListPageResponse], but gracefully handles missing data.
     *
     * @see PendingTransactionListPageResponse.data
     */
    fun data(): List<PendingTransaction> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [PendingTransactionListPageResponse], but gracefully handles missing data.
     *
     * @see PendingTransactionListPageResponse.nextCursor
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun items(): List<PendingTransaction> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): PendingTransactionListParams {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<PendingTransactionListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<PendingTransaction> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): PendingTransactionListParams = params

    /** The response that this page was parsed from. */
    fun response(): PendingTransactionListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [PendingTransactionListPageAsync].
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

    /** A builder for [PendingTransactionListPageAsync]. */
    class Builder internal constructor() {

        private var service: PendingTransactionServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: PendingTransactionListParams? = null
        private var response: PendingTransactionListPageResponse? = null

        @JvmSynthetic
        internal fun from(pendingTransactionListPageAsync: PendingTransactionListPageAsync) =
            apply {
                service = pendingTransactionListPageAsync.service
                streamHandlerExecutor = pendingTransactionListPageAsync.streamHandlerExecutor
                params = pendingTransactionListPageAsync.params
                response = pendingTransactionListPageAsync.response
            }

        fun service(service: PendingTransactionServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: PendingTransactionListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PendingTransactionListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [PendingTransactionListPageAsync].
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
        fun build(): PendingTransactionListPageAsync =
            PendingTransactionListPageAsync(
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

        return other is PendingTransactionListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "PendingTransactionListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
