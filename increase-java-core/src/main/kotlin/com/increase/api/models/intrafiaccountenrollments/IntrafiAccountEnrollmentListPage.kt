// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.intrafiaccountenrollments

import com.increase.api.core.checkRequired
import com.increase.api.services.blocking.IntrafiAccountEnrollmentService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** @see [IntrafiAccountEnrollmentService.list] */
class IntrafiAccountEnrollmentListPage
private constructor(
    private val service: IntrafiAccountEnrollmentService,
    private val params: IntrafiAccountEnrollmentListParams,
    private val response: IntrafiAccountEnrollmentListPageResponse,
) {

    /**
     * Delegates to [IntrafiAccountEnrollmentListPageResponse], but gracefully handles missing data.
     *
     * @see [IntrafiAccountEnrollmentListPageResponse.data]
     */
    fun data(): List<IntrafiAccountEnrollment> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [IntrafiAccountEnrollmentListPageResponse], but gracefully handles missing data.
     *
     * @see [IntrafiAccountEnrollmentListPageResponse.nextCursor]
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor().isPresent

    fun getNextPageParams(): Optional<IntrafiAccountEnrollmentListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextCursor().ifPresent { cursor(it) } }.build()
        )
    }

    fun getNextPage(): Optional<IntrafiAccountEnrollmentListPage> =
        getNextPageParams().map { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): IntrafiAccountEnrollmentListParams = params

    /** The response that this page was parsed from. */
    fun response(): IntrafiAccountEnrollmentListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [IntrafiAccountEnrollmentListPage].
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

    /** A builder for [IntrafiAccountEnrollmentListPage]. */
    class Builder internal constructor() {

        private var service: IntrafiAccountEnrollmentService? = null
        private var params: IntrafiAccountEnrollmentListParams? = null
        private var response: IntrafiAccountEnrollmentListPageResponse? = null

        @JvmSynthetic
        internal fun from(intrafiAccountEnrollmentListPage: IntrafiAccountEnrollmentListPage) =
            apply {
                service = intrafiAccountEnrollmentListPage.service
                params = intrafiAccountEnrollmentListPage.params
                response = intrafiAccountEnrollmentListPage.response
            }

        fun service(service: IntrafiAccountEnrollmentService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: IntrafiAccountEnrollmentListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: IntrafiAccountEnrollmentListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [IntrafiAccountEnrollmentListPage].
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
        fun build(): IntrafiAccountEnrollmentListPage =
            IntrafiAccountEnrollmentListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: IntrafiAccountEnrollmentListPage) :
        Iterable<IntrafiAccountEnrollment> {

        override fun iterator(): Iterator<IntrafiAccountEnrollment> = iterator {
            var page = firstPage
            var index = 0
            while (true) {
                while (index < page.data().size) {
                    yield(page.data()[index++])
                }
                page = page.getNextPage().getOrNull() ?: break
                index = 0
            }
        }

        fun stream(): Stream<IntrafiAccountEnrollment> {
            return StreamSupport.stream(spliterator(), false)
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is IntrafiAccountEnrollmentListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "IntrafiAccountEnrollmentListPage{service=$service, params=$params, response=$response}"
}
