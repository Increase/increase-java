// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.supplementaldocuments

import com.increase.api.services.async.SupplementalDocumentServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** List Entity Supplemental Document Submissions */
class SupplementalDocumentListPageAsync
private constructor(
    private val supplementalDocumentsService: SupplementalDocumentServiceAsync,
    private val params: SupplementalDocumentListParams,
    private val response: SupplementalDocumentListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): SupplementalDocumentListPageResponse = response

    /**
     * Delegates to [SupplementalDocumentListPageResponse], but gracefully handles missing data.
     *
     * @see [SupplementalDocumentListPageResponse.data]
     */
    fun data(): List<EntitySupplementalDocument> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [SupplementalDocumentListPageResponse], but gracefully handles missing data.
     *
     * @see [SupplementalDocumentListPageResponse.nextCursor]
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SupplementalDocumentListPageAsync && supplementalDocumentsService == other.supplementalDocumentsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(supplementalDocumentsService, params, response) /* spotless:on */

    override fun toString() =
        "SupplementalDocumentListPageAsync{supplementalDocumentsService=$supplementalDocumentsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor().isPresent

    fun getNextPageParams(): Optional<SupplementalDocumentListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextCursor().ifPresent { cursor(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<SupplementalDocumentListPageAsync>> {
        return getNextPageParams()
            .map { supplementalDocumentsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            supplementalDocumentsService: SupplementalDocumentServiceAsync,
            params: SupplementalDocumentListParams,
            response: SupplementalDocumentListPageResponse,
        ) = SupplementalDocumentListPageAsync(supplementalDocumentsService, params, response)
    }

    class AutoPager(private val firstPage: SupplementalDocumentListPageAsync) {

        fun forEach(
            action: Predicate<EntitySupplementalDocument>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<SupplementalDocumentListPageAsync>>.forEach(
                action: (EntitySupplementalDocument) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<EntitySupplementalDocument>> {
            val values = mutableListOf<EntitySupplementalDocument>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
