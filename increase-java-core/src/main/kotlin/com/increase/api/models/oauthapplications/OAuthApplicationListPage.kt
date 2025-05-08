// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.oauthapplications

import com.increase.api.core.AutoPager
import com.increase.api.core.Page
import com.increase.api.core.checkRequired
import com.increase.api.services.blocking.OAuthApplicationService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see [OAuthApplicationService.list] */
class OAuthApplicationListPage
private constructor(
    private val service: OAuthApplicationService,
    private val params: OAuthApplicationListParams,
    private val response: OAuthApplicationListPageResponse,
) : Page<OAuthApplication> {

    /**
     * Delegates to [OAuthApplicationListPageResponse], but gracefully handles missing data.
     *
     * @see [OAuthApplicationListPageResponse.data]
     */
    fun data(): List<OAuthApplication> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [OAuthApplicationListPageResponse], but gracefully handles missing data.
     *
     * @see [OAuthApplicationListPageResponse.nextCursor]
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun items(): List<OAuthApplication> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): OAuthApplicationListParams {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): OAuthApplicationListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<OAuthApplication> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): OAuthApplicationListParams = params

    /** The response that this page was parsed from. */
    fun response(): OAuthApplicationListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [OAuthApplicationListPage].
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

    /** A builder for [OAuthApplicationListPage]. */
    class Builder internal constructor() {

        private var service: OAuthApplicationService? = null
        private var params: OAuthApplicationListParams? = null
        private var response: OAuthApplicationListPageResponse? = null

        @JvmSynthetic
        internal fun from(oauthApplicationListPage: OAuthApplicationListPage) = apply {
            service = oauthApplicationListPage.service
            params = oauthApplicationListPage.params
            response = oauthApplicationListPage.response
        }

        fun service(service: OAuthApplicationService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: OAuthApplicationListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: OAuthApplicationListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [OAuthApplicationListPage].
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
        fun build(): OAuthApplicationListPage =
            OAuthApplicationListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is OAuthApplicationListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "OAuthApplicationListPage{service=$service, params=$params, response=$response}"
}
