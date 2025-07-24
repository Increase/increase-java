// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.digitalwallettokens

import com.increase.api.core.AutoPager
import com.increase.api.core.Page
import com.increase.api.core.checkRequired
import com.increase.api.services.blocking.DigitalWalletTokenService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see DigitalWalletTokenService.list */
class DigitalWalletTokenListPage
private constructor(
    private val service: DigitalWalletTokenService,
    private val params: DigitalWalletTokenListParams,
    private val response: DigitalWalletTokenListPageResponse,
) : Page<DigitalWalletToken> {

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

    override fun nextPage(): DigitalWalletTokenListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<DigitalWalletToken> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): DigitalWalletTokenListParams = params

    /** The response that this page was parsed from. */
    fun response(): DigitalWalletTokenListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DigitalWalletTokenListPage].
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

    /** A builder for [DigitalWalletTokenListPage]. */
    class Builder internal constructor() {

        private var service: DigitalWalletTokenService? = null
        private var params: DigitalWalletTokenListParams? = null
        private var response: DigitalWalletTokenListPageResponse? = null

        @JvmSynthetic
        internal fun from(digitalWalletTokenListPage: DigitalWalletTokenListPage) = apply {
            service = digitalWalletTokenListPage.service
            params = digitalWalletTokenListPage.params
            response = digitalWalletTokenListPage.response
        }

        fun service(service: DigitalWalletTokenService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: DigitalWalletTokenListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: DigitalWalletTokenListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [DigitalWalletTokenListPage].
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
        fun build(): DigitalWalletTokenListPage =
            DigitalWalletTokenListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DigitalWalletTokenListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "DigitalWalletTokenListPage{service=$service, params=$params, response=$response}"
}
