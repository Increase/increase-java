// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.inboundmailitems

import com.increase.api.services.async.InboundMailItemServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** List Inbound Mail Items */
class InboundMailItemListPageAsync
private constructor(
    private val inboundMailItemsService: InboundMailItemServiceAsync,
    private val params: InboundMailItemListParams,
    private val response: InboundMailItemListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): InboundMailItemListPageResponse = response

    /**
     * Delegates to [InboundMailItemListPageResponse], but gracefully handles missing data.
     *
     * @see [InboundMailItemListPageResponse.data]
     */
    fun data(): List<InboundMailItem> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [InboundMailItemListPageResponse], but gracefully handles missing data.
     *
     * @see [InboundMailItemListPageResponse.nextCursor]
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is InboundMailItemListPageAsync && inboundMailItemsService == other.inboundMailItemsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(inboundMailItemsService, params, response) /* spotless:on */

    override fun toString() =
        "InboundMailItemListPageAsync{inboundMailItemsService=$inboundMailItemsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor().isPresent

    fun getNextPageParams(): Optional<InboundMailItemListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextCursor().ifPresent { cursor(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<InboundMailItemListPageAsync>> {
        return getNextPageParams()
            .map { inboundMailItemsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            inboundMailItemsService: InboundMailItemServiceAsync,
            params: InboundMailItemListParams,
            response: InboundMailItemListPageResponse,
        ) = InboundMailItemListPageAsync(inboundMailItemsService, params, response)
    }

    class AutoPager(private val firstPage: InboundMailItemListPageAsync) {

        fun forEach(
            action: Predicate<InboundMailItem>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<InboundMailItemListPageAsync>>.forEach(
                action: (InboundMailItem) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<InboundMailItem>> {
            val values = mutableListOf<InboundMailItem>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
