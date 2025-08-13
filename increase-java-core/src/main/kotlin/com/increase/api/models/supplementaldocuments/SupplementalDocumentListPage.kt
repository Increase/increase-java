// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.supplementaldocuments

import com.increase.api.core.AutoPager
import com.increase.api.core.Page
import com.increase.api.core.checkRequired
import com.increase.api.services.blocking.SupplementalDocumentService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see SupplementalDocumentService.list */
class SupplementalDocumentListPage
private constructor(
    private val service: SupplementalDocumentService,
    private val params: SupplementalDocumentListParams,
    private val response: SupplementalDocumentListPageResponse,
) : Page<EntitySupplementalDocument> {

    /**
     * Delegates to [SupplementalDocumentListPageResponse], but gracefully handles missing data.
     *
     * @see SupplementalDocumentListPageResponse.data
     */
    fun data(): List<EntitySupplementalDocument> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [SupplementalDocumentListPageResponse], but gracefully handles missing data.
     *
     * @see SupplementalDocumentListPageResponse.nextCursor
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun items(): List<EntitySupplementalDocument> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): SupplementalDocumentListParams {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): SupplementalDocumentListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<EntitySupplementalDocument> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): SupplementalDocumentListParams = params

    /** The response that this page was parsed from. */
    fun response(): SupplementalDocumentListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SupplementalDocumentListPage].
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

    /** A builder for [SupplementalDocumentListPage]. */
    class Builder internal constructor() {

        private var service: SupplementalDocumentService? = null
        private var params: SupplementalDocumentListParams? = null
        private var response: SupplementalDocumentListPageResponse? = null

        @JvmSynthetic
        internal fun from(supplementalDocumentListPage: SupplementalDocumentListPage) = apply {
            service = supplementalDocumentListPage.service
            params = supplementalDocumentListPage.params
            response = supplementalDocumentListPage.response
        }

        fun service(service: SupplementalDocumentService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: SupplementalDocumentListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: SupplementalDocumentListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [SupplementalDocumentListPage].
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
        fun build(): SupplementalDocumentListPage =
            SupplementalDocumentListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SupplementalDocumentListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "SupplementalDocumentListPage{service=$service, params=$params, response=$response}"
}
