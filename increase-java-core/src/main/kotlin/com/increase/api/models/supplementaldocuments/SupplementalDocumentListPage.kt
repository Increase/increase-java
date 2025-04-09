// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.supplementaldocuments

import com.increase.api.services.blocking.SupplementalDocumentService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** List Entity Supplemental Document Submissions */
class SupplementalDocumentListPage
private constructor(
    private val supplementalDocumentsService: SupplementalDocumentService,
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

        return /* spotless:off */ other is SupplementalDocumentListPage && supplementalDocumentsService == other.supplementalDocumentsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(supplementalDocumentsService, params, response) /* spotless:on */

    override fun toString() =
        "SupplementalDocumentListPage{supplementalDocumentsService=$supplementalDocumentsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor().isPresent

    fun getNextPageParams(): Optional<SupplementalDocumentListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextCursor().ifPresent { cursor(it) } }.build()
        )
    }

    fun getNextPage(): Optional<SupplementalDocumentListPage> {
        return getNextPageParams().map { supplementalDocumentsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            supplementalDocumentsService: SupplementalDocumentService,
            params: SupplementalDocumentListParams,
            response: SupplementalDocumentListPageResponse,
        ) = SupplementalDocumentListPage(supplementalDocumentsService, params, response)
    }

    class AutoPager(private val firstPage: SupplementalDocumentListPage) :
        Iterable<EntitySupplementalDocument> {

        override fun iterator(): Iterator<EntitySupplementalDocument> = iterator {
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

        fun stream(): Stream<EntitySupplementalDocument> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
