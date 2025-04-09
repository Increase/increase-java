// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.cardpayments

import com.increase.api.services.blocking.CardPaymentService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** List Card Payments */
class CardPaymentListPage
private constructor(
    private val cardPaymentsService: CardPaymentService,
    private val params: CardPaymentListParams,
    private val response: CardPaymentListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): CardPaymentListPageResponse = response

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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CardPaymentListPage && cardPaymentsService == other.cardPaymentsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(cardPaymentsService, params, response) /* spotless:on */

    override fun toString() =
        "CardPaymentListPage{cardPaymentsService=$cardPaymentsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor().isPresent

    fun getNextPageParams(): Optional<CardPaymentListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextCursor().ifPresent { cursor(it) } }.build()
        )
    }

    fun getNextPage(): Optional<CardPaymentListPage> {
        return getNextPageParams().map { cardPaymentsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            cardPaymentsService: CardPaymentService,
            params: CardPaymentListParams,
            response: CardPaymentListPageResponse,
        ) = CardPaymentListPage(cardPaymentsService, params, response)
    }

    class AutoPager(private val firstPage: CardPaymentListPage) : Iterable<CardPayment> {

        override fun iterator(): Iterator<CardPayment> = iterator {
            var page = firstPage
            var index = 0
            while (true) {
                while (index < page.data().size) {
                    yield(page.data()[index++])
                }
                page = page.getNextPage().getOrNull() ?: break
                index = 0
            }
        }

        fun stream(): Stream<CardPayment> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
