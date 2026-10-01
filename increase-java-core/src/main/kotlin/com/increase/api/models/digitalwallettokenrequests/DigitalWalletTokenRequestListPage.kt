// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.digitalwallettokenrequests

import com.increase.api.core.AutoPager
import com.increase.api.core.Page
import com.increase.api.core.checkRequired
import com.increase.api.services.blocking.DigitalWalletTokenRequestService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see DigitalWalletTokenRequestService.list */
class DigitalWalletTokenRequestListPage
private constructor(
    private val service: DigitalWalletTokenRequestService,
    private val params: DigitalWalletTokenRequestListParams,
    private val response: DigitalWalletTokenRequestListPageResponse,
) : Page<DigitalWalletTokenRequest> {

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

    override fun nextPage(): DigitalWalletTokenRequestListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<DigitalWalletTokenRequest> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): DigitalWalletTokenRequestListParams = params

    /** The response that this page was parsed from. */
    fun response(): DigitalWalletTokenRequestListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [DigitalWalletTokenRequestListPage].
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

    /** A builder for [DigitalWalletTokenRequestListPage]. */
    class Builder internal constructor() {

        private var service: DigitalWalletTokenRequestService? = null
        private var params: DigitalWalletTokenRequestListParams? = null
        private var response: DigitalWalletTokenRequestListPageResponse? = null

        @JvmSynthetic
        internal fun from(digitalWalletTokenRequestListPage: DigitalWalletTokenRequestListPage) =
            apply {
                service = digitalWalletTokenRequestListPage.service
                params = digitalWalletTokenRequestListPage.params
                response = digitalWalletTokenRequestListPage.response
            }

        fun service(service: DigitalWalletTokenRequestService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: DigitalWalletTokenRequestListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: DigitalWalletTokenRequestListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [DigitalWalletTokenRequestListPage].
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
        fun build(): DigitalWalletTokenRequestListPage =
            DigitalWalletTokenRequestListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DigitalWalletTokenRequestListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "DigitalWalletTokenRequestListPage{service=$service, params=$params, response=$response}"
}
