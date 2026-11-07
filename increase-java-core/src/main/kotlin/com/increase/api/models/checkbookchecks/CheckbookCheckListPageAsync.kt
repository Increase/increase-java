// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.checkbookchecks

import com.increase.api.core.AutoPagerAsync
import com.increase.api.core.PageAsync
import com.increase.api.core.checkRequired
import com.increase.api.services.async.CheckbookCheckServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see CheckbookCheckServiceAsync.list */
class CheckbookCheckListPageAsync
private constructor(
    private val service: CheckbookCheckServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: CheckbookCheckListParams,
    private val response: CheckbookCheckListPageResponse,
) : PageAsync<CheckbookCheck> {

    /**
     * Delegates to [CheckbookCheckListPageResponse], but gracefully handles missing data.
     *
     * @see CheckbookCheckListPageResponse.data
     */
    fun data(): List<CheckbookCheck> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [CheckbookCheckListPageResponse], but gracefully handles missing data.
     *
     * @see CheckbookCheckListPageResponse.nextCursor
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun items(): List<CheckbookCheck> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): CheckbookCheckListParams {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<CheckbookCheckListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<CheckbookCheck> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): CheckbookCheckListParams = params

    /** The response that this page was parsed from. */
    fun response(): CheckbookCheckListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CheckbookCheckListPageAsync].
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

    /** A builder for [CheckbookCheckListPageAsync]. */
    class Builder internal constructor() {

        private var service: CheckbookCheckServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: CheckbookCheckListParams? = null
        private var response: CheckbookCheckListPageResponse? = null

        @JvmSynthetic
        internal fun from(checkbookCheckListPageAsync: CheckbookCheckListPageAsync) = apply {
            service = checkbookCheckListPageAsync.service
            streamHandlerExecutor = checkbookCheckListPageAsync.streamHandlerExecutor
            params = checkbookCheckListPageAsync.params
            response = checkbookCheckListPageAsync.response
        }

        fun service(service: CheckbookCheckServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: CheckbookCheckListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CheckbookCheckListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [CheckbookCheckListPageAsync].
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
        fun build(): CheckbookCheckListPageAsync =
            CheckbookCheckListPageAsync(
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

        return other is CheckbookCheckListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "CheckbookCheckListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
