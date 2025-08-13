// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.physicalcardprofiles

import com.increase.api.core.AutoPager
import com.increase.api.core.Page
import com.increase.api.core.checkRequired
import com.increase.api.services.blocking.PhysicalCardProfileService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see PhysicalCardProfileService.list */
class PhysicalCardProfileListPage
private constructor(
    private val service: PhysicalCardProfileService,
    private val params: PhysicalCardProfileListParams,
    private val response: PhysicalCardProfileListPageResponse,
) : Page<PhysicalCardProfile> {

    /**
     * Delegates to [PhysicalCardProfileListPageResponse], but gracefully handles missing data.
     *
     * @see PhysicalCardProfileListPageResponse.data
     */
    fun data(): List<PhysicalCardProfile> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [PhysicalCardProfileListPageResponse], but gracefully handles missing data.
     *
     * @see PhysicalCardProfileListPageResponse.nextCursor
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun items(): List<PhysicalCardProfile> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): PhysicalCardProfileListParams {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): PhysicalCardProfileListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<PhysicalCardProfile> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): PhysicalCardProfileListParams = params

    /** The response that this page was parsed from. */
    fun response(): PhysicalCardProfileListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PhysicalCardProfileListPage].
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

    /** A builder for [PhysicalCardProfileListPage]. */
    class Builder internal constructor() {

        private var service: PhysicalCardProfileService? = null
        private var params: PhysicalCardProfileListParams? = null
        private var response: PhysicalCardProfileListPageResponse? = null

        @JvmSynthetic
        internal fun from(physicalCardProfileListPage: PhysicalCardProfileListPage) = apply {
            service = physicalCardProfileListPage.service
            params = physicalCardProfileListPage.params
            response = physicalCardProfileListPage.response
        }

        fun service(service: PhysicalCardProfileService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: PhysicalCardProfileListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PhysicalCardProfileListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [PhysicalCardProfileListPage].
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
        fun build(): PhysicalCardProfileListPage =
            PhysicalCardProfileListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PhysicalCardProfileListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "PhysicalCardProfileListPage{service=$service, params=$params, response=$response}"
}
