// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.cardpushtransfers

import com.increase.api.core.AutoPagerAsync
import com.increase.api.core.PageAsync
import com.increase.api.core.checkRequired
import com.increase.api.services.async.CardPushTransferServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see CardPushTransferServiceAsync.list */
class CardPushTransferListPageAsync
private constructor(
    private val service: CardPushTransferServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: CardPushTransferListParams,
    private val response: CardPushTransferListPageResponse,
) : PageAsync<CardPushTransfer> {

    /**
     * Delegates to [CardPushTransferListPageResponse], but gracefully handles missing data.
     *
     * @see CardPushTransferListPageResponse.data
     */
    fun data(): List<CardPushTransfer> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [CardPushTransferListPageResponse], but gracefully handles missing data.
     *
     * @see CardPushTransferListPageResponse.nextCursor
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun items(): List<CardPushTransfer> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): CardPushTransferListParams {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<CardPushTransferListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<CardPushTransfer> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): CardPushTransferListParams = params

    /** The response that this page was parsed from. */
    fun response(): CardPushTransferListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [CardPushTransferListPageAsync].
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

    /** A builder for [CardPushTransferListPageAsync]. */
    class Builder internal constructor() {

        private var service: CardPushTransferServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: CardPushTransferListParams? = null
        private var response: CardPushTransferListPageResponse? = null

        @JvmSynthetic
        internal fun from(cardPushTransferListPageAsync: CardPushTransferListPageAsync) = apply {
            service = cardPushTransferListPageAsync.service
            streamHandlerExecutor = cardPushTransferListPageAsync.streamHandlerExecutor
            params = cardPushTransferListPageAsync.params
            response = cardPushTransferListPageAsync.response
        }

        fun service(service: CardPushTransferServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: CardPushTransferListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CardPushTransferListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [CardPushTransferListPageAsync].
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
        fun build(): CardPushTransferListPageAsync =
            CardPushTransferListPageAsync(
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

        return other is CardPushTransferListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "CardPushTransferListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
