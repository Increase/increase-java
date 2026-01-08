// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.swifttransfers

import com.increase.api.core.AutoPagerAsync
import com.increase.api.core.PageAsync
import com.increase.api.core.checkRequired
import com.increase.api.services.async.SwiftTransferServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see SwiftTransferServiceAsync.list */
class SwiftTransferListPageAsync
private constructor(
    private val service: SwiftTransferServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: SwiftTransferListParams,
    private val response: SwiftTransferListPageResponse,
) : PageAsync<SwiftTransfer> {

    /**
     * Delegates to [SwiftTransferListPageResponse], but gracefully handles missing data.
     *
     * @see SwiftTransferListPageResponse.data
     */
    fun data(): List<SwiftTransfer> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [SwiftTransferListPageResponse], but gracefully handles missing data.
     *
     * @see SwiftTransferListPageResponse.nextCursor
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun items(): List<SwiftTransfer> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): SwiftTransferListParams {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<SwiftTransferListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<SwiftTransfer> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): SwiftTransferListParams = params

    /** The response that this page was parsed from. */
    fun response(): SwiftTransferListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SwiftTransferListPageAsync].
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

    /** A builder for [SwiftTransferListPageAsync]. */
    class Builder internal constructor() {

        private var service: SwiftTransferServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: SwiftTransferListParams? = null
        private var response: SwiftTransferListPageResponse? = null

        @JvmSynthetic
        internal fun from(swiftTransferListPageAsync: SwiftTransferListPageAsync) = apply {
            service = swiftTransferListPageAsync.service
            streamHandlerExecutor = swiftTransferListPageAsync.streamHandlerExecutor
            params = swiftTransferListPageAsync.params
            response = swiftTransferListPageAsync.response
        }

        fun service(service: SwiftTransferServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: SwiftTransferListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: SwiftTransferListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [SwiftTransferListPageAsync].
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
        fun build(): SwiftTransferListPageAsync =
            SwiftTransferListPageAsync(
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

        return other is SwiftTransferListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "SwiftTransferListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
