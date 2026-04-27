// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.lockboxrecipients

import com.increase.api.core.AutoPagerAsync
import com.increase.api.core.PageAsync
import com.increase.api.core.checkRequired
import com.increase.api.services.async.LockboxRecipientServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see LockboxRecipientServiceAsync.list */
class LockboxRecipientListPageAsync
private constructor(
    private val service: LockboxRecipientServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: LockboxRecipientListParams,
    private val response: LockboxRecipientListPageResponse,
) : PageAsync<LockboxRecipient> {

    /**
     * Delegates to [LockboxRecipientListPageResponse], but gracefully handles missing data.
     *
     * @see LockboxRecipientListPageResponse.data
     */
    fun data(): List<LockboxRecipient> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [LockboxRecipientListPageResponse], but gracefully handles missing data.
     *
     * @see LockboxRecipientListPageResponse.nextCursor
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun items(): List<LockboxRecipient> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): LockboxRecipientListParams {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<LockboxRecipientListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<LockboxRecipient> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): LockboxRecipientListParams = params

    /** The response that this page was parsed from. */
    fun response(): LockboxRecipientListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [LockboxRecipientListPageAsync].
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

    /** A builder for [LockboxRecipientListPageAsync]. */
    class Builder internal constructor() {

        private var service: LockboxRecipientServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: LockboxRecipientListParams? = null
        private var response: LockboxRecipientListPageResponse? = null

        @JvmSynthetic
        internal fun from(lockboxRecipientListPageAsync: LockboxRecipientListPageAsync) = apply {
            service = lockboxRecipientListPageAsync.service
            streamHandlerExecutor = lockboxRecipientListPageAsync.streamHandlerExecutor
            params = lockboxRecipientListPageAsync.params
            response = lockboxRecipientListPageAsync.response
        }

        fun service(service: LockboxRecipientServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: LockboxRecipientListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: LockboxRecipientListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [LockboxRecipientListPageAsync].
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
        fun build(): LockboxRecipientListPageAsync =
            LockboxRecipientListPageAsync(
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

        return other is LockboxRecipientListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "LockboxRecipientListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
