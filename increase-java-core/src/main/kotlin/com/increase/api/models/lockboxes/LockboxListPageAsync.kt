// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.lockboxes

import com.increase.api.core.AutoPagerAsync
import com.increase.api.core.PageAsync
import com.increase.api.core.checkRequired
import com.increase.api.services.async.LockboxServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see LockboxServiceAsync.list */
class LockboxListPageAsync
private constructor(
    private val service: LockboxServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: LockboxListParams,
    private val response: LockboxListPageResponse,
) : PageAsync<Lockbox> {

    /**
     * Delegates to [LockboxListPageResponse], but gracefully handles missing data.
     *
     * @see LockboxListPageResponse.data
     */
    fun data(): List<Lockbox> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [LockboxListPageResponse], but gracefully handles missing data.
     *
     * @see LockboxListPageResponse.nextCursor
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun items(): List<Lockbox> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): LockboxListParams {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<LockboxListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<Lockbox> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): LockboxListParams = params

    /** The response that this page was parsed from. */
    fun response(): LockboxListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [LockboxListPageAsync].
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

    /** A builder for [LockboxListPageAsync]. */
    class Builder internal constructor() {

        private var service: LockboxServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: LockboxListParams? = null
        private var response: LockboxListPageResponse? = null

        @JvmSynthetic
        internal fun from(lockboxListPageAsync: LockboxListPageAsync) = apply {
            service = lockboxListPageAsync.service
            streamHandlerExecutor = lockboxListPageAsync.streamHandlerExecutor
            params = lockboxListPageAsync.params
            response = lockboxListPageAsync.response
        }

        fun service(service: LockboxServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: LockboxListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: LockboxListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [LockboxListPageAsync].
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
        fun build(): LockboxListPageAsync =
            LockboxListPageAsync(
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

        return /* spotless:off */ other is LockboxListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, response) /* spotless:on */

    override fun toString() =
        "LockboxListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
