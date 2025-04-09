// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.proofofauthorizationrequests

import com.increase.api.services.async.ProofOfAuthorizationRequestServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** List Proof of Authorization Requests */
class ProofOfAuthorizationRequestListPageAsync
private constructor(
    private val proofOfAuthorizationRequestsService: ProofOfAuthorizationRequestServiceAsync,
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

        return /* spotless:off */ other is ProofOfAuthorizationRequestListPageAsync && proofOfAuthorizationRequestsService == other.proofOfAuthorizationRequestsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(proofOfAuthorizationRequestsService, params, response) /* spotless:on */

    override fun toString() =
        "ProofOfAuthorizationRequestListPageAsync{proofOfAuthorizationRequestsService=$proofOfAuthorizationRequestsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor().isPresent

    fun getNextPageParams(): Optional<ProofOfAuthorizationRequestListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextCursor().ifPresent { cursor(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<ProofOfAuthorizationRequestListPageAsync>> {
        return getNextPageParams()
            .map { proofOfAuthorizationRequestsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            proofOfAuthorizationRequestsService: ProofOfAuthorizationRequestServiceAsync,
            params: ProofOfAuthorizationRequestListParams,
            response: ProofOfAuthorizationRequestListPageResponse,
        ) =
            ProofOfAuthorizationRequestListPageAsync(
                proofOfAuthorizationRequestsService,
                params,
                response,
            )
    }

    class AutoPager(private val firstPage: ProofOfAuthorizationRequestListPageAsync) {

        fun forEach(
            action: Predicate<ProofOfAuthorizationRequest>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<ProofOfAuthorizationRequestListPageAsync>>.forEach(
                action: (ProofOfAuthorizationRequest) -> Boolean,
                executor: Executor,
            ): CompletableFuture<Void> =
                thenComposeAsync(
                    { page ->
                        page
                            .filter { it.data().all(action) }
                            .map { it.getNextPage().forEach(action, executor) }
                            .orElseGet { CompletableFuture.completedFuture(null) }
                    },
                    executor,
                )
            return CompletableFuture.completedFuture(Optional.of(firstPage))
                .forEach(action::test, executor)
        }

        fun toList(executor: Executor): CompletableFuture<List<ProofOfAuthorizationRequest>> {
            val values = mutableListOf<ProofOfAuthorizationRequest>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
