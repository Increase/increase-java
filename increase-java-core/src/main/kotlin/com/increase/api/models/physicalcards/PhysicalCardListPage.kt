// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.physicalcards

import com.increase.api.core.AutoPager
import com.increase.api.core.Page
import com.increase.api.core.checkRequired
import com.increase.api.services.blocking.PhysicalCardService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see [PhysicalCardService.list] */
class PhysicalCardListPage
private constructor(
    private val service: PhysicalCardService,
    private val params: PhysicalCardListParams,
    private val response: PhysicalCardListPageResponse,
) : Page<PhysicalCard> {

    /**
     * Delegates to [PhysicalCardListPageResponse], but gracefully handles missing data.
     *
     * @see [PhysicalCardListPageResponse.data]
     */
    fun data(): List<PhysicalCard> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [PhysicalCardListPageResponse], but gracefully handles missing data.
     *
     * @see [PhysicalCardListPageResponse.nextCursor]
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun items(): List<PhysicalCard> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): PhysicalCardListParams {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): PhysicalCardListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<PhysicalCard> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): PhysicalCardListParams = params

    /** The response that this page was parsed from. */
    fun response(): PhysicalCardListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PhysicalCardListPage].
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

    /** A builder for [PhysicalCardListPage]. */
    class Builder internal constructor() {

        private var service: PhysicalCardService? = null
        private var params: PhysicalCardListParams? = null
        private var response: PhysicalCardListPageResponse? = null

        @JvmSynthetic
        internal fun from(physicalCardListPage: PhysicalCardListPage) = apply {
            service = physicalCardListPage.service
            params = physicalCardListPage.params
            response = physicalCardListPage.response
        }

        fun service(service: PhysicalCardService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: PhysicalCardListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PhysicalCardListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [PhysicalCardListPage].
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
        fun build(): PhysicalCardListPage =
            PhysicalCardListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PhysicalCardListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "PhysicalCardListPage{service=$service, params=$params, response=$response}"
}
