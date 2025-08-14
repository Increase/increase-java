// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.cardvalidations

import com.increase.api.core.AutoPager
import com.increase.api.core.Page
import com.increase.api.core.checkRequired
import com.increase.api.services.blocking.CardValidationService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see CardValidationService.list */
class CardValidationListPage
private constructor(
    private val service: CardValidationService,
    private val params: CardValidationListParams,
    private val response: CardValidationListPageResponse,
) : Page<CardValidation> {

    /**
     * Delegates to [CardValidationListPageResponse], but gracefully handles missing data.
     *
     * @see CardValidationListPageResponse.data
     */
    fun data(): List<CardValidation> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [CardValidationListPageResponse], but gracefully handles missing data.
     *
     * @see CardValidationListPageResponse.nextCursor
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun items(): List<CardValidation> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): CardValidationListParams {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): CardValidationListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<CardValidation> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): CardValidationListParams = params

    /** The response that this page was parsed from. */
    fun response(): CardValidationListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CardValidationListPage].
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

    /** A builder for [CardValidationListPage]. */
    class Builder internal constructor() {

        private var service: CardValidationService? = null
        private var params: CardValidationListParams? = null
        private var response: CardValidationListPageResponse? = null

        @JvmSynthetic
        internal fun from(cardValidationListPage: CardValidationListPage) = apply {
            service = cardValidationListPage.service
            params = cardValidationListPage.params
            response = cardValidationListPage.response
        }

        fun service(service: CardValidationService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CardValidationListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CardValidationListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [CardValidationListPage].
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
        fun build(): CardValidationListPage =
            CardValidationListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CardValidationListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "CardValidationListPage{service=$service, params=$params, response=$response}"
}
