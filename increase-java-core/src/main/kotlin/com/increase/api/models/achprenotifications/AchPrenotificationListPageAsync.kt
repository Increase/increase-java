// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.achprenotifications

import com.increase.api.core.AutoPagerAsync
import com.increase.api.core.PageAsync
import com.increase.api.core.checkRequired
import com.increase.api.services.async.AchPrenotificationServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see AchPrenotificationServiceAsync.list */
class AchPrenotificationListPageAsync
private constructor(
    private val service: AchPrenotificationServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: AchPrenotificationListParams,
    private val response: AchPrenotificationListPageResponse,
) : PageAsync<AchPrenotification> {

    /**
     * Delegates to [AchPrenotificationListPageResponse], but gracefully handles missing data.
     *
     * @see AchPrenotificationListPageResponse.data
     */
    fun data(): List<AchPrenotification> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [AchPrenotificationListPageResponse], but gracefully handles missing data.
     *
     * @see AchPrenotificationListPageResponse.nextCursor
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun items(): List<AchPrenotification> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): AchPrenotificationListParams {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<AchPrenotificationListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<AchPrenotification> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): AchPrenotificationListParams = params

    /** The response that this page was parsed from. */
    fun response(): AchPrenotificationListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [AchPrenotificationListPageAsync].
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

    /** A builder for [AchPrenotificationListPageAsync]. */
    class Builder internal constructor() {

        private var service: AchPrenotificationServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: AchPrenotificationListParams? = null
        private var response: AchPrenotificationListPageResponse? = null

        @JvmSynthetic
        internal fun from(achPrenotificationListPageAsync: AchPrenotificationListPageAsync) =
            apply {
                service = achPrenotificationListPageAsync.service
                streamHandlerExecutor = achPrenotificationListPageAsync.streamHandlerExecutor
                params = achPrenotificationListPageAsync.params
                response = achPrenotificationListPageAsync.response
            }

        fun service(service: AchPrenotificationServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: AchPrenotificationListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AchPrenotificationListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [AchPrenotificationListPageAsync].
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
        fun build(): AchPrenotificationListPageAsync =
            AchPrenotificationListPageAsync(
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

        return other is AchPrenotificationListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "AchPrenotificationListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
