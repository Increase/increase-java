// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.cardtokens

import com.increase.api.core.AutoPagerAsync
import com.increase.api.core.PageAsync
import com.increase.api.core.checkRequired
import com.increase.api.services.async.CardTokenServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see CardTokenServiceAsync.list */
class CardTokenListPageAsync
private constructor(
    private val service: CardTokenServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: CardTokenListParams,
    private val response: CardTokenListPageResponse,
) : PageAsync<CardToken> {

    /**
     * Delegates to [CardTokenListPageResponse], but gracefully handles missing data.
     *
     * @see CardTokenListPageResponse.data
     */
    fun data(): List<CardToken> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [CardTokenListPageResponse], but gracefully handles missing data.
     *
     * @see CardTokenListPageResponse.nextCursor
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun items(): List<CardToken> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): CardTokenListParams {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<CardTokenListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<CardToken> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): CardTokenListParams = params

    /** The response that this page was parsed from. */
    fun response(): CardTokenListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CardTokenListPageAsync].
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

    /** A builder for [CardTokenListPageAsync]. */
    class Builder internal constructor() {

        private var service: CardTokenServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: CardTokenListParams? = null
        private var response: CardTokenListPageResponse? = null

        @JvmSynthetic
        internal fun from(cardTokenListPageAsync: CardTokenListPageAsync) = apply {
            service = cardTokenListPageAsync.service
            streamHandlerExecutor = cardTokenListPageAsync.streamHandlerExecutor
            params = cardTokenListPageAsync.params
            response = cardTokenListPageAsync.response
        }

        fun service(service: CardTokenServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: CardTokenListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CardTokenListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [CardTokenListPageAsync].
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
        fun build(): CardTokenListPageAsync =
            CardTokenListPageAsync(
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

        return other is CardTokenListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "CardTokenListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
