// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.documents

import com.increase.api.core.checkRequired
import com.increase.api.services.async.DocumentServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** @see [DocumentServiceAsync.list] */
class DocumentListPageAsync
private constructor(
    private val service: DocumentServiceAsync,
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

    fun getNextPage(): CompletableFuture<Optional<DocumentListPageAsync>> =
        getNextPageParams()
            .map { service.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): DocumentListParams = params

    /** The response that this page was parsed from. */
    fun response(): DocumentListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DocumentListPageAsync].
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

    /** A builder for [DocumentListPageAsync]. */
    class Builder internal constructor() {

        private var service: DocumentServiceAsync? = null
        private var params: DocumentListParams? = null
        private var response: DocumentListPageResponse? = null

        @JvmSynthetic
        internal fun from(documentListPageAsync: DocumentListPageAsync) = apply {
            service = documentListPageAsync.service
            params = documentListPageAsync.params
            response = documentListPageAsync.response
        }

        fun service(service: DocumentServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: DocumentListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: DocumentListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [DocumentListPageAsync].
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
        fun build(): DocumentListPageAsync =
            DocumentListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: DocumentListPageAsync) {

        fun forEach(action: Predicate<Document>, executor: Executor): CompletableFuture<Void> {
            fun CompletableFuture<Optional<DocumentListPageAsync>>.forEach(
                action: (Document) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<Document>> {
            val values = mutableListOf<Document>()
            return forEach(values::add, executor).thenApply { values }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DocumentListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "DocumentListPageAsync{service=$service, params=$params, response=$response}"
}
