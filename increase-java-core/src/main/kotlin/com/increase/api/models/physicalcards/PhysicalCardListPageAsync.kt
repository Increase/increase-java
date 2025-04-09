// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.physicalcards

import com.increase.api.core.checkRequired
import com.increase.api.services.async.PhysicalCardServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** @see [PhysicalCardServiceAsync.list] */
class PhysicalCardListPageAsync
private constructor(
    private val service: PhysicalCardServiceAsync,
    private val params: PhysicalCardListParams,
    private val response: PhysicalCardListPageResponse,
) {

    /**
     * Delegates to [PhysicalCardListPageResponse], but gracefully handles missing data.
     *
     * @see [PhysicalCardListPageResponse.data]
     */
    fun data(): List<PhysicalCard> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [PhysicalCardListPageResponse], but gracefully handles missing data.
     *
     * @see [PhysicalCardListPageResponse.nextCursor]
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor().isPresent

    fun getNextPageParams(): Optional<PhysicalCardListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextCursor().ifPresent { cursor(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<PhysicalCardListPageAsync>> =
        getNextPageParams()
            .map { service.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): PhysicalCardListParams = params

    /** The response that this page was parsed from. */
    fun response(): PhysicalCardListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PhysicalCardListPageAsync].
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

    /** A builder for [PhysicalCardListPageAsync]. */
    class Builder internal constructor() {

        private var service: PhysicalCardServiceAsync? = null
        private var params: PhysicalCardListParams? = null
        private var response: PhysicalCardListPageResponse? = null

        @JvmSynthetic
        internal fun from(physicalCardListPageAsync: PhysicalCardListPageAsync) = apply {
            service = physicalCardListPageAsync.service
            params = physicalCardListPageAsync.params
            response = physicalCardListPageAsync.response
        }

        fun service(service: PhysicalCardServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: PhysicalCardListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PhysicalCardListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [PhysicalCardListPageAsync].
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
        fun build(): PhysicalCardListPageAsync =
            PhysicalCardListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: PhysicalCardListPageAsync) {

        fun forEach(action: Predicate<PhysicalCard>, executor: Executor): CompletableFuture<Void> {
            fun CompletableFuture<Optional<PhysicalCardListPageAsync>>.forEach(
                action: (PhysicalCard) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<PhysicalCard>> {
            val values = mutableListOf<PhysicalCard>()
            return forEach(values::add, executor).thenApply { values }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PhysicalCardListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "PhysicalCardListPageAsync{service=$service, params=$params, response=$response}"
}
