// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.programs

import com.increase.api.services.async.ProgramServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** List Programs */
class ProgramListPageAsync
private constructor(
    private val programsService: ProgramServiceAsync,
    private val params: ProgramListParams,
    private val response: ProgramListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): ProgramListPageResponse = response

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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ProgramListPageAsync && programsService == other.programsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(programsService, params, response) /* spotless:on */

    override fun toString() =
        "ProgramListPageAsync{programsService=$programsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor().isPresent

    fun getNextPageParams(): Optional<ProgramListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextCursor().ifPresent { cursor(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<ProgramListPageAsync>> {
        return getNextPageParams()
            .map { programsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            programsService: ProgramServiceAsync,
            params: ProgramListParams,
            response: ProgramListPageResponse,
        ) = ProgramListPageAsync(programsService, params, response)
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
}
