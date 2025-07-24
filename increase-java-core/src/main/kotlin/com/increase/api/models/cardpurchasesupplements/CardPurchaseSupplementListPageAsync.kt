// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.cardpurchasesupplements

import com.increase.api.core.AutoPagerAsync
import com.increase.api.core.PageAsync
import com.increase.api.core.checkRequired
import com.increase.api.services.async.CardPurchaseSupplementServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see CardPurchaseSupplementServiceAsync.list */
class CardPurchaseSupplementListPageAsync
private constructor(
    private val service: CardPurchaseSupplementServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: CardPurchaseSupplementListParams,
    private val response: CardPurchaseSupplementListPageResponse,
) : PageAsync<CardPurchaseSupplement> {

    /**
     * Delegates to [CardPurchaseSupplementListPageResponse], but gracefully handles missing data.
     *
     * @see CardPurchaseSupplementListPageResponse.data
     */
    fun data(): List<CardPurchaseSupplement> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [CardPurchaseSupplementListPageResponse], but gracefully handles missing data.
     *
     * @see CardPurchaseSupplementListPageResponse.nextCursor
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun items(): List<CardPurchaseSupplement> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): CardPurchaseSupplementListParams {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<CardPurchaseSupplementListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<CardPurchaseSupplement> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): CardPurchaseSupplementListParams = params

    /** The response that this page was parsed from. */
    fun response(): CardPurchaseSupplementListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [CardPurchaseSupplementListPageAsync].
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

    /** A builder for [CardPurchaseSupplementListPageAsync]. */
    class Builder internal constructor() {

        private var service: CardPurchaseSupplementServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: CardPurchaseSupplementListParams? = null
        private var response: CardPurchaseSupplementListPageResponse? = null

        @JvmSynthetic
        internal fun from(
            cardPurchaseSupplementListPageAsync: CardPurchaseSupplementListPageAsync
        ) = apply {
            service = cardPurchaseSupplementListPageAsync.service
            streamHandlerExecutor = cardPurchaseSupplementListPageAsync.streamHandlerExecutor
            params = cardPurchaseSupplementListPageAsync.params
            response = cardPurchaseSupplementListPageAsync.response
        }

        fun service(service: CardPurchaseSupplementServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: CardPurchaseSupplementListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CardPurchaseSupplementListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [CardPurchaseSupplementListPageAsync].
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
        fun build(): CardPurchaseSupplementListPageAsync =
            CardPurchaseSupplementListPageAsync(
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

        return /* spotless:off */ other is CardPurchaseSupplementListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, response) /* spotless:on */

    override fun toString() =
        "CardPurchaseSupplementListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
