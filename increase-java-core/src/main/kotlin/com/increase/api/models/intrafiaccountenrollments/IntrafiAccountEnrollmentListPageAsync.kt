// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.intrafiaccountenrollments

import com.increase.api.services.async.IntrafiAccountEnrollmentServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** List IntraFi Account Enrollments */
class IntrafiAccountEnrollmentListPageAsync
private constructor(
    private val intrafiAccountEnrollmentsService: IntrafiAccountEnrollmentServiceAsync,
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

        return /* spotless:off */ other is IntrafiAccountEnrollmentListPageAsync && intrafiAccountEnrollmentsService == other.intrafiAccountEnrollmentsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(intrafiAccountEnrollmentsService, params, response) /* spotless:on */

    override fun toString() =
        "IntrafiAccountEnrollmentListPageAsync{intrafiAccountEnrollmentsService=$intrafiAccountEnrollmentsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor().isPresent

    fun getNextPageParams(): Optional<IntrafiAccountEnrollmentListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextCursor().ifPresent { cursor(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<IntrafiAccountEnrollmentListPageAsync>> {
        return getNextPageParams()
            .map { intrafiAccountEnrollmentsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            intrafiAccountEnrollmentsService: IntrafiAccountEnrollmentServiceAsync,
            params: IntrafiAccountEnrollmentListParams,
            response: IntrafiAccountEnrollmentListPageResponse,
        ) =
            IntrafiAccountEnrollmentListPageAsync(
                intrafiAccountEnrollmentsService,
                params,
                response,
            )
    }

    class AutoPager(private val firstPage: IntrafiAccountEnrollmentListPageAsync) {

        fun forEach(
            action: Predicate<IntrafiAccountEnrollment>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<IntrafiAccountEnrollmentListPageAsync>>.forEach(
                action: (IntrafiAccountEnrollment) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<IntrafiAccountEnrollment>> {
            val values = mutableListOf<IntrafiAccountEnrollment>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
