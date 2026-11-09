// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.checkbooks

import com.increase.api.core.AutoPagerAsync
import com.increase.api.core.PageAsync
import com.increase.api.core.checkRequired
import com.increase.api.services.async.CheckbookServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see CheckbookServiceAsync.list */
class CheckbookListPageAsync
private constructor(
    private val service: CheckbookServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: CheckbookListParams,
    private val response: CheckbookListPageResponse,
) : PageAsync<Checkbook> {

    /**
     * Delegates to [CheckbookListPageResponse], but gracefully handles missing data.
     *
     * @see CheckbookListPageResponse.data
     */
    fun data(): List<Checkbook> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [CheckbookListPageResponse], but gracefully handles missing data.
     *
     * @see CheckbookListPageResponse.nextCursor
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun items(): List<Checkbook> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): CheckbookListParams {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<CheckbookListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<Checkbook> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): CheckbookListParams = params

    /** The response that this page was parsed from. */
    fun response(): CheckbookListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CheckbookListPageAsync].
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

    /** A builder for [CheckbookListPageAsync]. */
    class Builder internal constructor() {

        private var service: CheckbookServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: CheckbookListParams? = null
        private var response: CheckbookListPageResponse? = null

        @JvmSynthetic
        internal fun from(checkbookListPageAsync: CheckbookListPageAsync) = apply {
            service = checkbookListPageAsync.service
            streamHandlerExecutor = checkbookListPageAsync.streamHandlerExecutor
            params = checkbookListPageAsync.params
            response = checkbookListPageAsync.response
        }

        fun service(service: CheckbookServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: CheckbookListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CheckbookListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [CheckbookListPageAsync].
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
        fun build(): CheckbookListPageAsync =
            CheckbookListPageAsync(
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

        return other is CheckbookListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "CheckbookListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
