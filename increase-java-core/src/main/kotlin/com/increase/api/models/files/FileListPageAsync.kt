// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.files

import com.increase.api.core.checkRequired
import com.increase.api.services.async.FileServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** @see [FileServiceAsync.list] */
class FileListPageAsync
private constructor(
    private val service: FileServiceAsync,
    private val params: FileListParams,
    private val response: FileListPageResponse,
) {

    /**
     * Delegates to [FileListPageResponse], but gracefully handles missing data.
     *
     * @see [FileListPageResponse.data]
     */
    fun data(): List<File> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [FileListPageResponse], but gracefully handles missing data.
     *
     * @see [FileListPageResponse.nextCursor]
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor().isPresent

    fun getNextPageParams(): Optional<FileListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextCursor().ifPresent { cursor(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<FileListPageAsync>> =
        getNextPageParams()
            .map { service.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): FileListParams = params

    /** The response that this page was parsed from. */
    fun response(): FileListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [FileListPageAsync].
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

    /** A builder for [FileListPageAsync]. */
    class Builder internal constructor() {

        private var service: FileServiceAsync? = null
        private var params: FileListParams? = null
        private var response: FileListPageResponse? = null

        @JvmSynthetic
        internal fun from(fileListPageAsync: FileListPageAsync) = apply {
            service = fileListPageAsync.service
            params = fileListPageAsync.params
            response = fileListPageAsync.response
        }

        fun service(service: FileServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: FileListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: FileListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [FileListPageAsync].
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
        fun build(): FileListPageAsync =
            FileListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: FileListPageAsync) {

        fun forEach(action: Predicate<File>, executor: Executor): CompletableFuture<Void> {
            fun CompletableFuture<Optional<FileListPageAsync>>.forEach(
                action: (File) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<File>> {
            val values = mutableListOf<File>()
            return forEach(values::add, executor).thenApply { values }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is FileListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "FileListPageAsync{service=$service, params=$params, response=$response}"
}
