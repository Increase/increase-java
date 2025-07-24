// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.exports

import com.increase.api.core.AutoPagerAsync
import com.increase.api.core.PageAsync
import com.increase.api.core.checkRequired
import com.increase.api.services.async.ExportServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see ExportServiceAsync.list */
class ExportListPageAsync
private constructor(
    private val service: ExportServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: ExportListParams,
    private val response: ExportListPageResponse,
) : PageAsync<Export> {

    /**
     * Delegates to [ExportListPageResponse], but gracefully handles missing data.
     *
     * @see ExportListPageResponse.data
     */
    fun data(): List<Export> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [ExportListPageResponse], but gracefully handles missing data.
     *
     * @see ExportListPageResponse.nextCursor
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun items(): List<Export> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): ExportListParams {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<ExportListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<Export> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): ExportListParams = params

    /** The response that this page was parsed from. */
    fun response(): ExportListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ExportListPageAsync].
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

    /** A builder for [ExportListPageAsync]. */
    class Builder internal constructor() {

        private var service: ExportServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: ExportListParams? = null
        private var response: ExportListPageResponse? = null

        @JvmSynthetic
        internal fun from(exportListPageAsync: ExportListPageAsync) = apply {
            service = exportListPageAsync.service
            streamHandlerExecutor = exportListPageAsync.streamHandlerExecutor
            params = exportListPageAsync.params
            response = exportListPageAsync.response
        }

        fun service(service: ExportServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: ExportListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ExportListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ExportListPageAsync].
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
        fun build(): ExportListPageAsync =
            ExportListPageAsync(
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

        return /* spotless:off */ other is ExportListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, response) /* spotless:on */

    override fun toString() =
        "ExportListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
