// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.digitalcardprofiles

import com.increase.api.core.AutoPager
import com.increase.api.core.Page
import com.increase.api.core.checkRequired
import com.increase.api.services.blocking.DigitalCardProfileService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see [DigitalCardProfileService.list] */
class DigitalCardProfileListPage
private constructor(
    private val service: DigitalCardProfileService,
    private val params: DigitalCardProfileListParams,
    private val response: DigitalCardProfileListPageResponse,
) : Page<DigitalCardProfile> {

    /**
     * Delegates to [DigitalCardProfileListPageResponse], but gracefully handles missing data.
     *
     * @see [DigitalCardProfileListPageResponse.data]
     */
    fun data(): List<DigitalCardProfile> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [DigitalCardProfileListPageResponse], but gracefully handles missing data.
     *
     * @see [DigitalCardProfileListPageResponse.nextCursor]
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun items(): List<DigitalCardProfile> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): DigitalCardProfileListParams {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): DigitalCardProfileListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<DigitalCardProfile> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): DigitalCardProfileListParams = params

    /** The response that this page was parsed from. */
    fun response(): DigitalCardProfileListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DigitalCardProfileListPage].
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

    /** A builder for [DigitalCardProfileListPage]. */
    class Builder internal constructor() {

        private var service: DigitalCardProfileService? = null
        private var params: DigitalCardProfileListParams? = null
        private var response: DigitalCardProfileListPageResponse? = null

        @JvmSynthetic
        internal fun from(digitalCardProfileListPage: DigitalCardProfileListPage) = apply {
            service = digitalCardProfileListPage.service
            params = digitalCardProfileListPage.params
            response = digitalCardProfileListPage.response
        }

        fun service(service: DigitalCardProfileService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: DigitalCardProfileListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: DigitalCardProfileListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [DigitalCardProfileListPage].
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
        fun build(): DigitalCardProfileListPage =
            DigitalCardProfileListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DigitalCardProfileListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "DigitalCardProfileListPage{service=$service, params=$params, response=$response}"
}
