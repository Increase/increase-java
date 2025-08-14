// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.cardpushtransfers

import com.increase.api.core.AutoPager
import com.increase.api.core.Page
import com.increase.api.core.checkRequired
import com.increase.api.services.blocking.CardPushTransferService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see CardPushTransferService.list */
class CardPushTransferListPage
private constructor(
    private val service: CardPushTransferService,
    private val params: CardPushTransferListParams,
    private val response: CardPushTransferListPageResponse,
) : Page<CardPushTransfer> {

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

    override fun nextPage(): CardPushTransferListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<CardPushTransfer> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): CardPushTransferListParams = params

    /** The response that this page was parsed from. */
    fun response(): CardPushTransferListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CardPushTransferListPage].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CardPushTransferListPage]. */
    class Builder internal constructor() {

        private var service: CardPushTransferService? = null
        private var params: CardPushTransferListParams? = null
        private var response: CardPushTransferListPageResponse? = null

        @JvmSynthetic
        internal fun from(cardPushTransferListPage: CardPushTransferListPage) = apply {
            service = cardPushTransferListPage.service
            params = cardPushTransferListPage.params
            response = cardPushTransferListPage.response
        }

        fun service(service: CardPushTransferService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CardPushTransferListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CardPushTransferListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [CardPushTransferListPage].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CardPushTransferListPage =
            CardPushTransferListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CardPushTransferListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "CardPushTransferListPage{service=$service, params=$params, response=$response}"
}
