// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.digitalwallettokens

import com.increase.api.core.AutoPagerAsync
import com.increase.api.core.PageAsync
import com.increase.api.core.checkRequired
import com.increase.api.services.async.DigitalWalletTokenServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see DigitalWalletTokenServiceAsync.list */
class DigitalWalletTokenListPageAsync
private constructor(
    private val service: DigitalWalletTokenServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: DigitalWalletTokenListParams,
    private val response: DigitalWalletTokenListPageResponse,
) : PageAsync<DigitalWalletToken> {

    /**
     * Delegates to [DigitalWalletTokenListPageResponse], but gracefully handles missing data.
     *
     * @see DigitalWalletTokenListPageResponse.data
     */
    fun data(): List<DigitalWalletToken> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [DigitalWalletTokenListPageResponse], but gracefully handles missing data.
     *
     * @see DigitalWalletTokenListPageResponse.nextCursor
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun items(): List<DigitalWalletToken> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): DigitalWalletTokenListParams {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<DigitalWalletTokenListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<DigitalWalletToken> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): DigitalWalletTokenListParams = params

    /** The response that this page was parsed from. */
    fun response(): DigitalWalletTokenListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [DigitalWalletTokenListPageAsync].
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

    /** A builder for [DigitalWalletTokenListPageAsync]. */
    class Builder internal constructor() {

        private var service: DigitalWalletTokenServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: DigitalWalletTokenListParams? = null
        private var response: DigitalWalletTokenListPageResponse? = null

        @JvmSynthetic
        internal fun from(digitalWalletTokenListPageAsync: DigitalWalletTokenListPageAsync) =
            apply {
                service = digitalWalletTokenListPageAsync.service
                streamHandlerExecutor = digitalWalletTokenListPageAsync.streamHandlerExecutor
                params = digitalWalletTokenListPageAsync.params
                response = digitalWalletTokenListPageAsync.response
            }

        fun service(service: DigitalWalletTokenServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: DigitalWalletTokenListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: DigitalWalletTokenListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [DigitalWalletTokenListPageAsync].
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
        fun build(): DigitalWalletTokenListPageAsync =
            DigitalWalletTokenListPageAsync(
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

        return other is DigitalWalletTokenListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "DigitalWalletTokenListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
