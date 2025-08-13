// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.digitalcardprofiles

import com.increase.api.core.AutoPagerAsync
import com.increase.api.core.PageAsync
import com.increase.api.core.checkRequired
import com.increase.api.services.async.DigitalCardProfileServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see DigitalCardProfileServiceAsync.list */
class DigitalCardProfileListPageAsync
private constructor(
    private val service: DigitalCardProfileServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: DigitalCardProfileListParams,
    private val response: DigitalCardProfileListPageResponse,
) : PageAsync<DigitalCardProfile> {

    /**
     * Delegates to [DigitalCardProfileListPageResponse], but gracefully handles missing data.
     *
     * @see DigitalCardProfileListPageResponse.data
     */
    fun data(): List<DigitalCardProfile> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [DigitalCardProfileListPageResponse], but gracefully handles missing data.
     *
     * @see DigitalCardProfileListPageResponse.nextCursor
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun items(): List<DigitalCardProfile> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): DigitalCardProfileListParams {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<DigitalCardProfileListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<DigitalCardProfile> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): DigitalCardProfileListParams = params

    /** The response that this page was parsed from. */
    fun response(): DigitalCardProfileListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [DigitalCardProfileListPageAsync].
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

    /** A builder for [DigitalCardProfileListPageAsync]. */
    class Builder internal constructor() {

        private var service: DigitalCardProfileServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: DigitalCardProfileListParams? = null
        private var response: DigitalCardProfileListPageResponse? = null

        @JvmSynthetic
        internal fun from(digitalCardProfileListPageAsync: DigitalCardProfileListPageAsync) =
            apply {
                service = digitalCardProfileListPageAsync.service
                streamHandlerExecutor = digitalCardProfileListPageAsync.streamHandlerExecutor
                params = digitalCardProfileListPageAsync.params
                response = digitalCardProfileListPageAsync.response
            }

        fun service(service: DigitalCardProfileServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: DigitalCardProfileListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: DigitalCardProfileListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [DigitalCardProfileListPageAsync].
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
        fun build(): DigitalCardProfileListPageAsync =
            DigitalCardProfileListPageAsync(
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

        return other is DigitalCardProfileListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "DigitalCardProfileListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
