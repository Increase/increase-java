// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.intrafiexclusions

import com.increase.api.core.AutoPager
import com.increase.api.core.Page
import com.increase.api.core.checkRequired
import com.increase.api.services.blocking.IntrafiExclusionService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see IntrafiExclusionService.list */
class IntrafiExclusionListPage
private constructor(
    private val service: IntrafiExclusionService,
    private val params: IntrafiExclusionListParams,
    private val response: IntrafiExclusionListPageResponse,
) : Page<IntrafiExclusion> {

    /**
     * Delegates to [IntrafiExclusionListPageResponse], but gracefully handles missing data.
     *
     * @see IntrafiExclusionListPageResponse.data
     */
    fun data(): List<IntrafiExclusion> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [IntrafiExclusionListPageResponse], but gracefully handles missing data.
     *
     * @see IntrafiExclusionListPageResponse.nextCursor
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun items(): List<IntrafiExclusion> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): IntrafiExclusionListParams {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): IntrafiExclusionListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<IntrafiExclusion> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): IntrafiExclusionListParams = params

    /** The response that this page was parsed from. */
    fun response(): IntrafiExclusionListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [IntrafiExclusionListPage].
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

    /** A builder for [IntrafiExclusionListPage]. */
    class Builder internal constructor() {

        private var service: IntrafiExclusionService? = null
        private var params: IntrafiExclusionListParams? = null
        private var response: IntrafiExclusionListPageResponse? = null

        @JvmSynthetic
        internal fun from(intrafiExclusionListPage: IntrafiExclusionListPage) = apply {
            service = intrafiExclusionListPage.service
            params = intrafiExclusionListPage.params
            response = intrafiExclusionListPage.response
        }

        fun service(service: IntrafiExclusionService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: IntrafiExclusionListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: IntrafiExclusionListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [IntrafiExclusionListPage].
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
        fun build(): IntrafiExclusionListPage =
            IntrafiExclusionListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is IntrafiExclusionListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "IntrafiExclusionListPage{service=$service, params=$params, response=$response}"
}
