// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.exports

import com.increase.api.services.async.ExportServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** List Exports */
class ExportListPageAsync
private constructor(
    private val exportsService: ExportServiceAsync,
    private val params: ExportListParams,
    private val response: ExportListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): ExportListPageResponse = response

    /**
     * Delegates to [ExportListPageResponse], but gracefully handles missing data.
     *
     * @see [ExportListPageResponse.data]
     */
    fun data(): List<Export> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [ExportListPageResponse], but gracefully handles missing data.
     *
     * @see [ExportListPageResponse.nextCursor]
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ExportListPageAsync && exportsService == other.exportsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(exportsService, params, response) /* spotless:on */

    override fun toString() =
        "ExportListPageAsync{exportsService=$exportsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor().isPresent

    fun getNextPageParams(): Optional<ExportListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextCursor().ifPresent { cursor(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<ExportListPageAsync>> {
        return getNextPageParams()
            .map { exportsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            exportsService: ExportServiceAsync,
            params: ExportListParams,
            response: ExportListPageResponse,
        ) = ExportListPageAsync(exportsService, params, response)
    }

    class AutoPager(private val firstPage: ExportListPageAsync) {

        fun forEach(action: Predicate<Export>, executor: Executor): CompletableFuture<Void> {
            fun CompletableFuture<Optional<ExportListPageAsync>>.forEach(
                action: (Export) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<Export>> {
            val values = mutableListOf<Export>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
