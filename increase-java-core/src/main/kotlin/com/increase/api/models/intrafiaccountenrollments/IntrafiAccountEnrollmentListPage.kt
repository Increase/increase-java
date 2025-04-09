// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.intrafiaccountenrollments

import com.increase.api.services.blocking.IntrafiAccountEnrollmentService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** List IntraFi Account Enrollments */
class IntrafiAccountEnrollmentListPage
private constructor(
    private val intrafiAccountEnrollmentsService: IntrafiAccountEnrollmentService,
    private val params: IntrafiAccountEnrollmentListParams,
    private val response: IntrafiAccountEnrollmentListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): IntrafiAccountEnrollmentListPageResponse = response

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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is IntrafiAccountEnrollmentListPage && intrafiAccountEnrollmentsService == other.intrafiAccountEnrollmentsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(intrafiAccountEnrollmentsService, params, response) /* spotless:on */

    override fun toString() =
        "IntrafiAccountEnrollmentListPage{intrafiAccountEnrollmentsService=$intrafiAccountEnrollmentsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor().isPresent

    fun getNextPageParams(): Optional<IntrafiAccountEnrollmentListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextCursor().ifPresent { cursor(it) } }.build()
        )
    }

    fun getNextPage(): Optional<IntrafiAccountEnrollmentListPage> {
        return getNextPageParams().map { intrafiAccountEnrollmentsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            intrafiAccountEnrollmentsService: IntrafiAccountEnrollmentService,
            params: IntrafiAccountEnrollmentListParams,
            response: IntrafiAccountEnrollmentListPageResponse,
        ) = IntrafiAccountEnrollmentListPage(intrafiAccountEnrollmentsService, params, response)
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
}
