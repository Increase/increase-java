// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.checkbooks

import com.increase.api.core.AutoPager
import com.increase.api.core.Page
import com.increase.api.core.checkRequired
import com.increase.api.services.blocking.CheckbookService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see CheckbookService.list */
class CheckbookListPage
private constructor(
    private val service: CheckbookService,
    private val params: CheckbookListParams,
    private val response: CheckbookListPageResponse,
) : Page<Checkbook> {

    /**
     * Delegates to [CheckbookListPageResponse], but gracefully handles missing data.
     *
     * @see CheckbookListPageResponse.data
     */
    fun data(): List<Checkbook> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [CheckbookListPageResponse], but gracefully handles missing data.
     *
     * @see CheckbookListPageResponse.nextCursor
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun items(): List<Checkbook> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): CheckbookListParams {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): CheckbookListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<Checkbook> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): CheckbookListParams = params

    /** The response that this page was parsed from. */
    fun response(): CheckbookListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CheckbookListPage].
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

    /** A builder for [CheckbookListPage]. */
    class Builder internal constructor() {

        private var service: CheckbookService? = null
        private var params: CheckbookListParams? = null
        private var response: CheckbookListPageResponse? = null

        @JvmSynthetic
        internal fun from(checkbookListPage: CheckbookListPage) = apply {
            service = checkbookListPage.service
            params = checkbookListPage.params
            response = checkbookListPage.response
        }

        fun service(service: CheckbookService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CheckbookListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CheckbookListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [CheckbookListPage].
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
        fun build(): CheckbookListPage =
            CheckbookListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CheckbookListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "CheckbookListPage{service=$service, params=$params, response=$response}"
}
