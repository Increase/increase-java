// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.entities

import com.increase.api.services.async.EntityServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** List Entities */
class EntityListPageAsync
private constructor(
    private val entitiesService: EntityServiceAsync,
    private val params: EntityListParams,
    private val response: EntityListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): EntityListPageResponse = response

    /**
     * Delegates to [EntityListPageResponse], but gracefully handles missing data.
     *
     * @see [EntityListPageResponse.data]
     */
    fun data(): List<Entity> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [EntityListPageResponse], but gracefully handles missing data.
     *
     * @see [EntityListPageResponse.nextCursor]
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is EntityListPageAsync && entitiesService == other.entitiesService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(entitiesService, params, response) /* spotless:on */

    override fun toString() =
        "EntityListPageAsync{entitiesService=$entitiesService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor().isPresent

    fun getNextPageParams(): Optional<EntityListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextCursor().ifPresent { cursor(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<EntityListPageAsync>> {
        return getNextPageParams()
            .map { entitiesService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            entitiesService: EntityServiceAsync,
            params: EntityListParams,
            response: EntityListPageResponse,
        ) = EntityListPageAsync(entitiesService, params, response)
    }

    class AutoPager(private val firstPage: EntityListPageAsync) {

        fun forEach(action: Predicate<Entity>, executor: Executor): CompletableFuture<Void> {
            fun CompletableFuture<Optional<EntityListPageAsync>>.forEach(
                action: (Entity) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<Entity>> {
            val values = mutableListOf<Entity>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
