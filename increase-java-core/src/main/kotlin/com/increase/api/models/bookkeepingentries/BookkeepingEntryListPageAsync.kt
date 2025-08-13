// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.bookkeepingentries

import com.increase.api.core.AutoPagerAsync
import com.increase.api.core.PageAsync
import com.increase.api.core.checkRequired
import com.increase.api.services.async.BookkeepingEntryServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see BookkeepingEntryServiceAsync.list */
class BookkeepingEntryListPageAsync
private constructor(
    private val service: BookkeepingEntryServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: BookkeepingEntryListParams,
    private val response: BookkeepingEntryListPageResponse,
) : PageAsync<BookkeepingEntry> {

    /**
     * Delegates to [BookkeepingEntryListPageResponse], but gracefully handles missing data.
     *
     * @see BookkeepingEntryListPageResponse.data
     */
    fun data(): List<BookkeepingEntry> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [BookkeepingEntryListPageResponse], but gracefully handles missing data.
     *
     * @see BookkeepingEntryListPageResponse.nextCursor
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun items(): List<BookkeepingEntry> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): BookkeepingEntryListParams {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<BookkeepingEntryListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<BookkeepingEntry> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): BookkeepingEntryListParams = params

    /** The response that this page was parsed from. */
    fun response(): BookkeepingEntryListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [BookkeepingEntryListPageAsync].
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

    /** A builder for [BookkeepingEntryListPageAsync]. */
    class Builder internal constructor() {

        private var service: BookkeepingEntryServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: BookkeepingEntryListParams? = null
        private var response: BookkeepingEntryListPageResponse? = null

        @JvmSynthetic
        internal fun from(bookkeepingEntryListPageAsync: BookkeepingEntryListPageAsync) = apply {
            service = bookkeepingEntryListPageAsync.service
            streamHandlerExecutor = bookkeepingEntryListPageAsync.streamHandlerExecutor
            params = bookkeepingEntryListPageAsync.params
            response = bookkeepingEntryListPageAsync.response
        }

        fun service(service: BookkeepingEntryServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: BookkeepingEntryListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: BookkeepingEntryListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [BookkeepingEntryListPageAsync].
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
        fun build(): BookkeepingEntryListPageAsync =
            BookkeepingEntryListPageAsync(
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

        return other is BookkeepingEntryListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "BookkeepingEntryListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
