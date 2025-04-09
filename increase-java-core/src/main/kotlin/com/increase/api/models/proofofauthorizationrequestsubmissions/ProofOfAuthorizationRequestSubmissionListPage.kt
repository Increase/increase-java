// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.proofofauthorizationrequestsubmissions

import com.increase.api.services.blocking.ProofOfAuthorizationRequestSubmissionService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** List Proof of Authorization Request Submissions */
class ProofOfAuthorizationRequestSubmissionListPage
private constructor(
    private val proofOfAuthorizationRequestSubmissionsService:
        ProofOfAuthorizationRequestSubmissionService,
    private val params: ProofOfAuthorizationRequestSubmissionListParams,
    private val response: ProofOfAuthorizationRequestSubmissionListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): ProofOfAuthorizationRequestSubmissionListPageResponse = response

    /**
     * Delegates to [ProofOfAuthorizationRequestSubmissionListPageResponse], but gracefully handles
     * missing data.
     *
     * @see [ProofOfAuthorizationRequestSubmissionListPageResponse.data]
     */
    fun data(): List<ProofOfAuthorizationRequestSubmission> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [ProofOfAuthorizationRequestSubmissionListPageResponse], but gracefully handles
     * missing data.
     *
     * @see [ProofOfAuthorizationRequestSubmissionListPageResponse.nextCursor]
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ProofOfAuthorizationRequestSubmissionListPage && proofOfAuthorizationRequestSubmissionsService == other.proofOfAuthorizationRequestSubmissionsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(proofOfAuthorizationRequestSubmissionsService, params, response) /* spotless:on */

    override fun toString() =
        "ProofOfAuthorizationRequestSubmissionListPage{proofOfAuthorizationRequestSubmissionsService=$proofOfAuthorizationRequestSubmissionsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor().isPresent

    fun getNextPageParams(): Optional<ProofOfAuthorizationRequestSubmissionListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextCursor().ifPresent { cursor(it) } }.build()
        )
    }

    fun getNextPage(): Optional<ProofOfAuthorizationRequestSubmissionListPage> {
        return getNextPageParams().map { proofOfAuthorizationRequestSubmissionsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            proofOfAuthorizationRequestSubmissionsService:
                ProofOfAuthorizationRequestSubmissionService,
            params: ProofOfAuthorizationRequestSubmissionListParams,
            response: ProofOfAuthorizationRequestSubmissionListPageResponse,
        ) =
            ProofOfAuthorizationRequestSubmissionListPage(
                proofOfAuthorizationRequestSubmissionsService,
                params,
                response,
            )
    }

    class AutoPager(private val firstPage: ProofOfAuthorizationRequestSubmissionListPage) :
        Iterable<ProofOfAuthorizationRequestSubmission> {

        override fun iterator(): Iterator<ProofOfAuthorizationRequestSubmission> = iterator {
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

        fun stream(): Stream<ProofOfAuthorizationRequestSubmission> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
