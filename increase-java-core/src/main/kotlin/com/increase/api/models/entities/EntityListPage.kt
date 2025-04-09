// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.entities

import com.increase.api.services.blocking.EntityService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** List Entities */
class EntityListPage
private constructor(
    private val entitiesService: EntityService,
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

        return /* spotless:off */ other is EntityListPage && entitiesService == other.entitiesService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(entitiesService, params, response) /* spotless:on */

    override fun toString() =
        "EntityListPage{entitiesService=$entitiesService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor().isPresent

    fun getNextPageParams(): Optional<EntityListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextCursor().ifPresent { cursor(it) } }.build()
        )
    }

    fun getNextPage(): Optional<EntityListPage> {
        return getNextPageParams().map { entitiesService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            entitiesService: EntityService,
            params: EntityListParams,
            response: EntityListPageResponse,
        ) = EntityListPage(entitiesService, params, response)
    }

    class AutoPager(private val firstPage: EntityListPage) : Iterable<Entity> {

        override fun iterator(): Iterator<Entity> = iterator {
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

        fun stream(): Stream<Entity> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
