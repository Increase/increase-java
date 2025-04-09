// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.bookkeepingentries

import com.increase.api.core.checkRequired
import com.increase.api.services.async.BookkeepingEntryServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** @see [BookkeepingEntryServiceAsync.list] */
class BookkeepingEntryListPageAsync
private constructor(
    private val service: BookkeepingEntryServiceAsync,
    private val params: BookkeepingEntryListParams,
    private val response: BookkeepingEntryListPageResponse,
) {

    /**
     * Delegates to [BookkeepingEntryListPageResponse], but gracefully handles missing data.
     *
     * @see [BookkeepingEntryListPageResponse.data]
     */
    fun data(): List<BookkeepingEntry> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [BookkeepingEntryListPageResponse], but gracefully handles missing data.
     *
     * @see [BookkeepingEntryListPageResponse.nextCursor]
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor().isPresent

    fun getNextPageParams(): Optional<BookkeepingEntryListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextCursor().ifPresent { cursor(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<BookkeepingEntryListPageAsync>> =
        getNextPageParams()
            .map { service.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): BookkeepingEntryListParams = params

    /** The response that this page was parsed from. */
    fun response(): BookkeepingEntryListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [BookkeepingEntryListPageAsync].
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

    /** A builder for [BookkeepingEntryListPageAsync]. */
    class Builder internal constructor() {

        private var service: BookkeepingEntryServiceAsync? = null
        private var params: BookkeepingEntryListParams? = null
        private var response: BookkeepingEntryListPageResponse? = null

        @JvmSynthetic
        internal fun from(bookkeepingEntryListPageAsync: BookkeepingEntryListPageAsync) = apply {
            service = bookkeepingEntryListPageAsync.service
            params = bookkeepingEntryListPageAsync.params
            response = bookkeepingEntryListPageAsync.response
        }

        fun service(service: BookkeepingEntryServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: BookkeepingEntryListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: BookkeepingEntryListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [BookkeepingEntryListPageAsync].
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
        fun build(): BookkeepingEntryListPageAsync =
            BookkeepingEntryListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: BookkeepingEntryListPageAsync) {

        fun forEach(
            action: Predicate<BookkeepingEntry>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<BookkeepingEntryListPageAsync>>.forEach(
                action: (BookkeepingEntry) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<BookkeepingEntry>> {
            val values = mutableListOf<BookkeepingEntry>()
            return forEach(values::add, executor).thenApply { values }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BookkeepingEntryListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "BookkeepingEntryListPageAsync{service=$service, params=$params, response=$response}"
}
