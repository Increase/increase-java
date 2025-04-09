// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.documents

import com.increase.api.services.blocking.DocumentService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** List Documents */
class DocumentListPage
private constructor(
    private val documentsService: DocumentService,
    private val params: DocumentListParams,
    private val response: DocumentListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): DocumentListPageResponse = response

    /**
     * Delegates to [DocumentListPageResponse], but gracefully handles missing data.
     *
     * @see [DocumentListPageResponse.data]
     */
    fun data(): List<Document> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [DocumentListPageResponse], but gracefully handles missing data.
     *
     * @see [DocumentListPageResponse.nextCursor]
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DocumentListPage && documentsService == other.documentsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(documentsService, params, response) /* spotless:on */

    override fun toString() =
        "DocumentListPage{documentsService=$documentsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor().isPresent

    fun getNextPageParams(): Optional<DocumentListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextCursor().ifPresent { cursor(it) } }.build()
        )
    }

    fun getNextPage(): Optional<DocumentListPage> {
        return getNextPageParams().map { documentsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            documentsService: DocumentService,
            params: DocumentListParams,
            response: DocumentListPageResponse,
        ) = DocumentListPage(documentsService, params, response)
    }

    class AutoPager(private val firstPage: DocumentListPage) : Iterable<Document> {

        override fun iterator(): Iterator<Document> = iterator {
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

        fun stream(): Stream<Document> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
