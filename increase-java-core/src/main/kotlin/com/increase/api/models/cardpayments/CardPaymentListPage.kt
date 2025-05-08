// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.cardpayments

import com.increase.api.core.AutoPager
import com.increase.api.core.Page
import com.increase.api.core.checkRequired
import com.increase.api.services.blocking.CardPaymentService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see [CardPaymentService.list] */
class CardPaymentListPage
private constructor(
    private val service: CardPaymentService,
    private val params: CardPaymentListParams,
    private val response: CardPaymentListPageResponse,
) : Page<CardPayment> {

    /**
     * Delegates to [CardPaymentListPageResponse], but gracefully handles missing data.
     *
     * @see [CardPaymentListPageResponse.data]
     */
    fun data(): List<CardPayment> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [CardPaymentListPageResponse], but gracefully handles missing data.
     *
     * @see [CardPaymentListPageResponse.nextCursor]
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun items(): List<CardPayment> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): CardPaymentListParams {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): CardPaymentListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<CardPayment> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): CardPaymentListParams = params

    /** The response that this page was parsed from. */
    fun response(): CardPaymentListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CardPaymentListPage].
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

    /** A builder for [CardPaymentListPage]. */
    class Builder internal constructor() {

        private var service: CardPaymentService? = null
        private var params: CardPaymentListParams? = null
        private var response: CardPaymentListPageResponse? = null

        @JvmSynthetic
        internal fun from(cardPaymentListPage: CardPaymentListPage) = apply {
            service = cardPaymentListPage.service
            params = cardPaymentListPage.params
            response = cardPaymentListPage.response
        }

        fun service(service: CardPaymentService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CardPaymentListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CardPaymentListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [CardPaymentListPage].
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
        fun build(): CardPaymentListPage =
            CardPaymentListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CardPaymentListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "CardPaymentListPage{service=$service, params=$params, response=$response}"
}
