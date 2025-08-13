// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.checktransfers

import com.increase.api.core.AutoPagerAsync
import com.increase.api.core.PageAsync
import com.increase.api.core.checkRequired
import com.increase.api.services.async.CheckTransferServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see CheckTransferServiceAsync.list */
class CheckTransferListPageAsync
private constructor(
    private val service: CheckTransferServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: CheckTransferListParams,
    private val response: CheckTransferListPageResponse,
) : PageAsync<CheckTransfer> {

    /**
     * Delegates to [CheckTransferListPageResponse], but gracefully handles missing data.
     *
     * @see CheckTransferListPageResponse.data
     */
    fun data(): List<CheckTransfer> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [CheckTransferListPageResponse], but gracefully handles missing data.
     *
     * @see CheckTransferListPageResponse.nextCursor
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun items(): List<CheckTransfer> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): CheckTransferListParams {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<CheckTransferListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<CheckTransfer> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): CheckTransferListParams = params

    /** The response that this page was parsed from. */
    fun response(): CheckTransferListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CheckTransferListPageAsync].
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

    /** A builder for [CheckTransferListPageAsync]. */
    class Builder internal constructor() {

        private var service: CheckTransferServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: CheckTransferListParams? = null
        private var response: CheckTransferListPageResponse? = null

        @JvmSynthetic
        internal fun from(checkTransferListPageAsync: CheckTransferListPageAsync) = apply {
            service = checkTransferListPageAsync.service
            streamHandlerExecutor = checkTransferListPageAsync.streamHandlerExecutor
            params = checkTransferListPageAsync.params
            response = checkTransferListPageAsync.response
        }

        fun service(service: CheckTransferServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: CheckTransferListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CheckTransferListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [CheckTransferListPageAsync].
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
        fun build(): CheckTransferListPageAsync =
            CheckTransferListPageAsync(
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

        return other is CheckTransferListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "CheckTransferListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
