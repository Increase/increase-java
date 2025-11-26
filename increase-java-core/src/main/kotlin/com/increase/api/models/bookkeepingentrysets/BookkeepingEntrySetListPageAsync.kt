// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.bookkeepingentrysets

import com.increase.api.core.AutoPagerAsync
import com.increase.api.core.PageAsync
import com.increase.api.core.checkRequired
import com.increase.api.services.async.BookkeepingEntrySetServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see BookkeepingEntrySetServiceAsync.list */
class BookkeepingEntrySetListPageAsync
private constructor(
    private val service: BookkeepingEntrySetServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: BookkeepingEntrySetListParams,
    private val response: BookkeepingEntrySetListPageResponse,
) : PageAsync<BookkeepingEntrySet> {

    /**
     * Delegates to [BookkeepingEntrySetListPageResponse], but gracefully handles missing data.
     *
     * @see BookkeepingEntrySetListPageResponse.data
     */
    fun data(): List<BookkeepingEntrySet> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [BookkeepingEntrySetListPageResponse], but gracefully handles missing data.
     *
     * @see BookkeepingEntrySetListPageResponse.nextCursor
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun items(): List<BookkeepingEntrySet> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): BookkeepingEntrySetListParams {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<BookkeepingEntrySetListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<BookkeepingEntrySet> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): BookkeepingEntrySetListParams = params

    /** The response that this page was parsed from. */
    fun response(): BookkeepingEntrySetListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [BookkeepingEntrySetListPageAsync].
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

    /** A builder for [BookkeepingEntrySetListPageAsync]. */
    class Builder internal constructor() {

        private var service: BookkeepingEntrySetServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: BookkeepingEntrySetListParams? = null
        private var response: BookkeepingEntrySetListPageResponse? = null

        @JvmSynthetic
        internal fun from(bookkeepingEntrySetListPageAsync: BookkeepingEntrySetListPageAsync) =
            apply {
                service = bookkeepingEntrySetListPageAsync.service
                streamHandlerExecutor = bookkeepingEntrySetListPageAsync.streamHandlerExecutor
                params = bookkeepingEntrySetListPageAsync.params
                response = bookkeepingEntrySetListPageAsync.response
            }

        fun service(service: BookkeepingEntrySetServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: BookkeepingEntrySetListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: BookkeepingEntrySetListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [BookkeepingEntrySetListPageAsync].
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
        fun build(): BookkeepingEntrySetListPageAsync =
            BookkeepingEntrySetListPageAsync(
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

        return other is BookkeepingEntrySetListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "BookkeepingEntrySetListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
