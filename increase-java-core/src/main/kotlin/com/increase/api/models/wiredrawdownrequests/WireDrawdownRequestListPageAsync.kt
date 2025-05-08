// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.wiredrawdownrequests

import com.increase.api.core.AutoPagerAsync
import com.increase.api.core.PageAsync
import com.increase.api.core.checkRequired
import com.increase.api.services.async.WireDrawdownRequestServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see [WireDrawdownRequestServiceAsync.list] */
class WireDrawdownRequestListPageAsync
private constructor(
    private val service: WireDrawdownRequestServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: WireDrawdownRequestListParams,
    private val response: WireDrawdownRequestListPageResponse,
) : PageAsync<WireDrawdownRequest> {

    /**
     * Delegates to [WireDrawdownRequestListPageResponse], but gracefully handles missing data.
     *
     * @see [WireDrawdownRequestListPageResponse.data]
     */
    fun data(): List<WireDrawdownRequest> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [WireDrawdownRequestListPageResponse], but gracefully handles missing data.
     *
     * @see [WireDrawdownRequestListPageResponse.nextCursor]
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun items(): List<WireDrawdownRequest> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): WireDrawdownRequestListParams {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<WireDrawdownRequestListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<WireDrawdownRequest> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): WireDrawdownRequestListParams = params

    /** The response that this page was parsed from. */
    fun response(): WireDrawdownRequestListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [WireDrawdownRequestListPageAsync].
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

    /** A builder for [WireDrawdownRequestListPageAsync]. */
    class Builder internal constructor() {

        private var service: WireDrawdownRequestServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: WireDrawdownRequestListParams? = null
        private var response: WireDrawdownRequestListPageResponse? = null

        @JvmSynthetic
        internal fun from(wireDrawdownRequestListPageAsync: WireDrawdownRequestListPageAsync) =
            apply {
                service = wireDrawdownRequestListPageAsync.service
                streamHandlerExecutor = wireDrawdownRequestListPageAsync.streamHandlerExecutor
                params = wireDrawdownRequestListPageAsync.params
                response = wireDrawdownRequestListPageAsync.response
            }

        fun service(service: WireDrawdownRequestServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: WireDrawdownRequestListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: WireDrawdownRequestListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [WireDrawdownRequestListPageAsync].
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
        fun build(): WireDrawdownRequestListPageAsync =
            WireDrawdownRequestListPageAsync(
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

        return /* spotless:off */ other is WireDrawdownRequestListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, response) /* spotless:on */

    override fun toString() =
        "WireDrawdownRequestListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
