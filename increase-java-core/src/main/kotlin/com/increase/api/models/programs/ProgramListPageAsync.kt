// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.programs

import com.increase.api.core.checkRequired
import com.increase.api.services.async.ProgramServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** @see [ProgramServiceAsync.list] */
class ProgramListPageAsync
private constructor(
    private val service: ProgramServiceAsync,
    private val params: ProgramListParams,
    private val response: ProgramListPageResponse,
) {

    /**
     * Delegates to [ProgramListPageResponse], but gracefully handles missing data.
     *
     * @see [ProgramListPageResponse.data]
     */
    fun data(): List<Program> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [ProgramListPageResponse], but gracefully handles missing data.
     *
     * @see [ProgramListPageResponse.nextCursor]
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor().isPresent

    fun getNextPageParams(): Optional<ProgramListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextCursor().ifPresent { cursor(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<ProgramListPageAsync>> =
        getNextPageParams()
            .map { service.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): ProgramListParams = params

    /** The response that this page was parsed from. */
    fun response(): ProgramListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ProgramListPageAsync].
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

    /** A builder for [ProgramListPageAsync]. */
    class Builder internal constructor() {

        private var service: ProgramServiceAsync? = null
        private var params: ProgramListParams? = null
        private var response: ProgramListPageResponse? = null

        @JvmSynthetic
        internal fun from(programListPageAsync: ProgramListPageAsync) = apply {
            service = programListPageAsync.service
            params = programListPageAsync.params
            response = programListPageAsync.response
        }

        fun service(service: ProgramServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ProgramListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ProgramListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ProgramListPageAsync].
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
        fun build(): ProgramListPageAsync =
            ProgramListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: ProgramListPageAsync) {

        fun forEach(action: Predicate<Program>, executor: Executor): CompletableFuture<Void> {
            fun CompletableFuture<Optional<ProgramListPageAsync>>.forEach(
                action: (Program) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<Program>> {
            val values = mutableListOf<Program>()
            return forEach(values::add, executor).thenApply { values }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ProgramListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "ProgramListPageAsync{service=$service, params=$params, response=$response}"
}
