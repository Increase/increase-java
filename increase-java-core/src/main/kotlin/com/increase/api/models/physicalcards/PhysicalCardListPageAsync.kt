// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.physicalcards

import com.increase.api.services.async.PhysicalCardServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** List Physical Cards */
class PhysicalCardListPageAsync
private constructor(
    private val physicalCardsService: PhysicalCardServiceAsync,
    private val params: PhysicalCardListParams,
    private val response: PhysicalCardListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): PhysicalCardListPageResponse = response

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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PhysicalCardListPageAsync && physicalCardsService == other.physicalCardsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(physicalCardsService, params, response) /* spotless:on */

    override fun toString() =
        "PhysicalCardListPageAsync{physicalCardsService=$physicalCardsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor().isPresent

    fun getNextPageParams(): Optional<PhysicalCardListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextCursor().ifPresent { cursor(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<PhysicalCardListPageAsync>> {
        return getNextPageParams()
            .map { physicalCardsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            physicalCardsService: PhysicalCardServiceAsync,
            params: PhysicalCardListParams,
            response: PhysicalCardListPageResponse,
        ) = PhysicalCardListPageAsync(physicalCardsService, params, response)
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
}
