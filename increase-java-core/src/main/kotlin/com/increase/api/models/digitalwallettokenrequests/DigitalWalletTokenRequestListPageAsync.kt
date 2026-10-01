// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.digitalwallettokenrequests

import com.increase.api.core.AutoPagerAsync
import com.increase.api.core.PageAsync
import com.increase.api.core.checkRequired
import com.increase.api.services.async.DigitalWalletTokenRequestServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see DigitalWalletTokenRequestServiceAsync.list */
class DigitalWalletTokenRequestListPageAsync
private constructor(
    private val service: DigitalWalletTokenRequestServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: DigitalWalletTokenRequestListParams,
    private val response: DigitalWalletTokenRequestListPageResponse,
) : PageAsync<DigitalWalletTokenRequest> {

    /**
     * Delegates to [DigitalWalletTokenRequestListPageResponse], but gracefully handles missing
     * data.
     *
     * @see DigitalWalletTokenRequestListPageResponse.data
     */
    fun data(): List<DigitalWalletTokenRequest> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [DigitalWalletTokenRequestListPageResponse], but gracefully handles missing
     * data.
     *
     * @see DigitalWalletTokenRequestListPageResponse.nextCursor
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun items(): List<DigitalWalletTokenRequest> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): DigitalWalletTokenRequestListParams {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<DigitalWalletTokenRequestListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<DigitalWalletTokenRequest> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): DigitalWalletTokenRequestListParams = params

    /** The response that this page was parsed from. */
    fun response(): DigitalWalletTokenRequestListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [DigitalWalletTokenRequestListPageAsync].
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

    /** A builder for [DigitalWalletTokenRequestListPageAsync]. */
    class Builder internal constructor() {

        private var service: DigitalWalletTokenRequestServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: DigitalWalletTokenRequestListParams? = null
        private var response: DigitalWalletTokenRequestListPageResponse? = null

        @JvmSynthetic
        internal fun from(
            digitalWalletTokenRequestListPageAsync: DigitalWalletTokenRequestListPageAsync
        ) = apply {
            service = digitalWalletTokenRequestListPageAsync.service
            streamHandlerExecutor = digitalWalletTokenRequestListPageAsync.streamHandlerExecutor
            params = digitalWalletTokenRequestListPageAsync.params
            response = digitalWalletTokenRequestListPageAsync.response
        }

        fun service(service: DigitalWalletTokenRequestServiceAsync) = apply {
            this.service = service
        }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: DigitalWalletTokenRequestListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: DigitalWalletTokenRequestListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [DigitalWalletTokenRequestListPageAsync].
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
        fun build(): DigitalWalletTokenRequestListPageAsync =
            DigitalWalletTokenRequestListPageAsync(
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

        return other is DigitalWalletTokenRequestListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "DigitalWalletTokenRequestListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
