// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.proofofauthorizationrequests

import com.increase.api.core.checkRequired
import com.increase.api.services.async.ProofOfAuthorizationRequestServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** @see [ProofOfAuthorizationRequestServiceAsync.list] */
class ProofOfAuthorizationRequestListPageAsync
private constructor(
    private val service: ProofOfAuthorizationRequestServiceAsync,
    private val params: ProofOfAuthorizationRequestListParams,
    private val response: ProofOfAuthorizationRequestListPageResponse,
) {

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

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor().isPresent

    fun getNextPageParams(): Optional<ProofOfAuthorizationRequestListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextCursor().ifPresent { cursor(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<ProofOfAuthorizationRequestListPageAsync>> =
        getNextPageParams()
            .map { service.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): ProofOfAuthorizationRequestListParams = params

    /** The response that this page was parsed from. */
    fun response(): ProofOfAuthorizationRequestListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [ProofOfAuthorizationRequestListPageAsync].
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

    /** A builder for [ProofOfAuthorizationRequestListPageAsync]. */
    class Builder internal constructor() {

        private var service: ProofOfAuthorizationRequestServiceAsync? = null
        private var params: ProofOfAuthorizationRequestListParams? = null
        private var response: ProofOfAuthorizationRequestListPageResponse? = null

        @JvmSynthetic
        internal fun from(
            proofOfAuthorizationRequestListPageAsync: ProofOfAuthorizationRequestListPageAsync
        ) = apply {
            service = proofOfAuthorizationRequestListPageAsync.service
            params = proofOfAuthorizationRequestListPageAsync.params
            response = proofOfAuthorizationRequestListPageAsync.response
        }

        fun service(service: ProofOfAuthorizationRequestServiceAsync) = apply {
            this.service = service
        }

        /** The parameters that were used to request this page. */
        fun params(params: ProofOfAuthorizationRequestListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ProofOfAuthorizationRequestListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [ProofOfAuthorizationRequestListPageAsync].
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
        fun build(): ProofOfAuthorizationRequestListPageAsync =
            ProofOfAuthorizationRequestListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ProofOfAuthorizationRequestListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "ProofOfAuthorizationRequestListPageAsync{service=$service, params=$params, response=$response}"
}
