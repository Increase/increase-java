// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.documents

import com.increase.api.core.checkRequired
import com.increase.api.services.blocking.DocumentService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** @see [DocumentService.list] */
class DocumentListPage
private constructor(
    private val service: DocumentService,
    private val params: DocumentListParams,
    private val response: DocumentListPageResponse,
) {

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

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor().isPresent

    fun getNextPageParams(): Optional<DocumentListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextCursor().ifPresent { cursor(it) } }.build()
        )
    }

    fun getNextPage(): Optional<DocumentListPage> = getNextPageParams().map { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): DocumentListParams = params

    /** The response that this page was parsed from. */
    fun response(): DocumentListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DocumentListPage].
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

    /** A builder for [DocumentListPage]. */
    class Builder internal constructor() {

        private var service: DocumentService? = null
        private var params: DocumentListParams? = null
        private var response: DocumentListPageResponse? = null

        @JvmSynthetic
        internal fun from(documentListPage: DocumentListPage) = apply {
            service = documentListPage.service
            params = documentListPage.params
            response = documentListPage.response
        }

        fun service(service: DocumentService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: DocumentListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: DocumentListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [DocumentListPage].
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
        fun build(): DocumentListPage =
            DocumentListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DocumentListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "DocumentListPage{service=$service, params=$params, response=$response}"
}
