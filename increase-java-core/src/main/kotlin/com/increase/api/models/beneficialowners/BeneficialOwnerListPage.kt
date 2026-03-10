// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.beneficialowners

import com.increase.api.core.AutoPager
import com.increase.api.core.Page
import com.increase.api.core.checkRequired
import com.increase.api.services.blocking.BeneficialOwnerService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see BeneficialOwnerService.list */
class BeneficialOwnerListPage
private constructor(
    private val service: BeneficialOwnerService,
    private val params: BeneficialOwnerListParams,
    private val response: BeneficialOwnerListPageResponse,
) : Page<EntityBeneficialOwner> {

    /**
     * Delegates to [BeneficialOwnerListPageResponse], but gracefully handles missing data.
     *
     * @see BeneficialOwnerListPageResponse.data
     */
    fun data(): List<EntityBeneficialOwner> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [BeneficialOwnerListPageResponse], but gracefully handles missing data.
     *
     * @see BeneficialOwnerListPageResponse.nextCursor
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun items(): List<EntityBeneficialOwner> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): BeneficialOwnerListParams {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): BeneficialOwnerListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<EntityBeneficialOwner> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): BeneficialOwnerListParams = params

    /** The response that this page was parsed from. */
    fun response(): BeneficialOwnerListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BeneficialOwnerListPage].
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

    /** A builder for [BeneficialOwnerListPage]. */
    class Builder internal constructor() {

        private var service: BeneficialOwnerService? = null
        private var params: BeneficialOwnerListParams? = null
        private var response: BeneficialOwnerListPageResponse? = null

        @JvmSynthetic
        internal fun from(beneficialOwnerListPage: BeneficialOwnerListPage) = apply {
            service = beneficialOwnerListPage.service
            params = beneficialOwnerListPage.params
            response = beneficialOwnerListPage.response
        }

        fun service(service: BeneficialOwnerService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: BeneficialOwnerListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: BeneficialOwnerListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [BeneficialOwnerListPage].
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
        fun build(): BeneficialOwnerListPage =
            BeneficialOwnerListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BeneficialOwnerListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "BeneficialOwnerListPage{service=$service, params=$params, response=$response}"
}
