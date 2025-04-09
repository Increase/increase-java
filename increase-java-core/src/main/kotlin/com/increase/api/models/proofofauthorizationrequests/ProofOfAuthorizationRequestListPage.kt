// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.proofofauthorizationrequests

import com.increase.api.services.blocking.ProofOfAuthorizationRequestService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** List Proof of Authorization Requests */
class ProofOfAuthorizationRequestListPage
private constructor(
    private val proofOfAuthorizationRequestsService: ProofOfAuthorizationRequestService,
    private val params: ProofOfAuthorizationRequestListParams,
    private val response: ProofOfAuthorizationRequestListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): ProofOfAuthorizationRequestListPageResponse = response

    /**
     * Delegates to [ProofOfAuthorizationRequestListPageResponse], but gracefully handles missing
     * data.
     *
     * @see [ProofOfAuthorizationRequestListPageResponse.data]
     */
    fun data(): List<ProofOfAuthorizationRequest> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [ProofOfAuthorizationRequestListPageResponse], but gracefully handles missing
     * data.
     *
     * @see [ProofOfAuthorizationRequestListPageResponse.nextCursor]
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ProofOfAuthorizationRequestListPage && proofOfAuthorizationRequestsService == other.proofOfAuthorizationRequestsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(proofOfAuthorizationRequestsService, params, response) /* spotless:on */

    override fun toString() =
        "ProofOfAuthorizationRequestListPage{proofOfAuthorizationRequestsService=$proofOfAuthorizationRequestsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor().isPresent

    fun getNextPageParams(): Optional<ProofOfAuthorizationRequestListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextCursor().ifPresent { cursor(it) } }.build()
        )
    }

    fun getNextPage(): Optional<ProofOfAuthorizationRequestListPage> {
        return getNextPageParams().map { proofOfAuthorizationRequestsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            proofOfAuthorizationRequestsService: ProofOfAuthorizationRequestService,
            params: ProofOfAuthorizationRequestListParams,
            response: ProofOfAuthorizationRequestListPageResponse,
        ) =
            ProofOfAuthorizationRequestListPage(
                proofOfAuthorizationRequestsService,
                params,
                response,
            )
    }

    class AutoPager(private val firstPage: ProofOfAuthorizationRequestListPage) :
        Iterable<ProofOfAuthorizationRequest> {

        override fun iterator(): Iterator<ProofOfAuthorizationRequest> = iterator {
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

        fun stream(): Stream<ProofOfAuthorizationRequest> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
