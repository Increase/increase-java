// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.supplementaldocuments

import com.increase.api.core.checkRequired
import com.increase.api.services.async.SupplementalDocumentServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** @see [SupplementalDocumentServiceAsync.list] */
class SupplementalDocumentListPageAsync
private constructor(
    private val service: SupplementalDocumentServiceAsync,
    private val params: SupplementalDocumentListParams,
    private val response: SupplementalDocumentListPageResponse,
) {

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

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor().isPresent

    fun getNextPageParams(): Optional<SupplementalDocumentListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextCursor().ifPresent { cursor(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<SupplementalDocumentListPageAsync>> =
        getNextPageParams()
            .map { service.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): SupplementalDocumentListParams = params

    /** The response that this page was parsed from. */
    fun response(): SupplementalDocumentListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [SupplementalDocumentListPageAsync].
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

    /** A builder for [SupplementalDocumentListPageAsync]. */
    class Builder internal constructor() {

        private var service: SupplementalDocumentServiceAsync? = null
        private var params: SupplementalDocumentListParams? = null
        private var response: SupplementalDocumentListPageResponse? = null

        @JvmSynthetic
        internal fun from(supplementalDocumentListPageAsync: SupplementalDocumentListPageAsync) =
            apply {
                service = supplementalDocumentListPageAsync.service
                params = supplementalDocumentListPageAsync.params
                response = supplementalDocumentListPageAsync.response
            }

        fun service(service: SupplementalDocumentServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: SupplementalDocumentListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: SupplementalDocumentListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [SupplementalDocumentListPageAsync].
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
        fun build(): SupplementalDocumentListPageAsync =
            SupplementalDocumentListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SupplementalDocumentListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "SupplementalDocumentListPageAsync{service=$service, params=$params, response=$response}"
}
