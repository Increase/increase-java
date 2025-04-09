// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.proofofauthorizationrequestsubmissions

import com.increase.api.core.checkRequired
import com.increase.api.services.async.ProofOfAuthorizationRequestSubmissionServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** @see [ProofOfAuthorizationRequestSubmissionServiceAsync.list] */
class ProofOfAuthorizationRequestSubmissionListPageAsync
private constructor(
    private val service: ProofOfAuthorizationRequestSubmissionServiceAsync,
    private val params: ProofOfAuthorizationRequestSubmissionListParams,
    private val response: ProofOfAuthorizationRequestSubmissionListPageResponse,
) {

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

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor().isPresent

    fun getNextPageParams(): Optional<ProofOfAuthorizationRequestSubmissionListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextCursor().ifPresent { cursor(it) } }.build()
        )
    }

    fun getNextPage():
        CompletableFuture<Optional<ProofOfAuthorizationRequestSubmissionListPageAsync>> =
        getNextPageParams()
            .map { service.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): ProofOfAuthorizationRequestSubmissionListParams = params

    /** The response that this page was parsed from. */
    fun response(): ProofOfAuthorizationRequestSubmissionListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [ProofOfAuthorizationRequestSubmissionListPageAsync].
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

    /** A builder for [ProofOfAuthorizationRequestSubmissionListPageAsync]. */
    class Builder internal constructor() {

        private var service: ProofOfAuthorizationRequestSubmissionServiceAsync? = null
        private var params: ProofOfAuthorizationRequestSubmissionListParams? = null
        private var response: ProofOfAuthorizationRequestSubmissionListPageResponse? = null

        @JvmSynthetic
        internal fun from(
            proofOfAuthorizationRequestSubmissionListPageAsync:
                ProofOfAuthorizationRequestSubmissionListPageAsync
        ) = apply {
            service = proofOfAuthorizationRequestSubmissionListPageAsync.service
            params = proofOfAuthorizationRequestSubmissionListPageAsync.params
            response = proofOfAuthorizationRequestSubmissionListPageAsync.response
        }

        fun service(service: ProofOfAuthorizationRequestSubmissionServiceAsync) = apply {
            this.service = service
        }

        /** The parameters that were used to request this page. */
        fun params(params: ProofOfAuthorizationRequestSubmissionListParams) = apply {
            this.params = params
        }

        /** The response that this page was parsed from. */
        fun response(response: ProofOfAuthorizationRequestSubmissionListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [ProofOfAuthorizationRequestSubmissionListPageAsync].
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
        fun build(): ProofOfAuthorizationRequestSubmissionListPageAsync =
            ProofOfAuthorizationRequestSubmissionListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: ProofOfAuthorizationRequestSubmissionListPageAsync) {

        fun forEach(
            action: Predicate<ProofOfAuthorizationRequestSubmission>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<ProofOfAuthorizationRequestSubmissionListPageAsync>>
                .forEach(
                action: (ProofOfAuthorizationRequestSubmission) -> Boolean,
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

        fun toList(
            executor: Executor
        ): CompletableFuture<List<ProofOfAuthorizationRequestSubmission>> {
            val values = mutableListOf<ProofOfAuthorizationRequestSubmission>()
            return forEach(values::add, executor).thenApply { values }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ProofOfAuthorizationRequestSubmissionListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "ProofOfAuthorizationRequestSubmissionListPageAsync{service=$service, params=$params, response=$response}"
}
