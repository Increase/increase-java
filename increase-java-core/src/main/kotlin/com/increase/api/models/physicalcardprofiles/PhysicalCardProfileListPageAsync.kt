// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.physicalcardprofiles

import com.increase.api.services.async.PhysicalCardProfileServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** List Physical Card Profiles */
class PhysicalCardProfileListPageAsync
private constructor(
    private val physicalCardProfilesService: PhysicalCardProfileServiceAsync,
    private val params: PhysicalCardProfileListParams,
    private val response: PhysicalCardProfileListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): PhysicalCardProfileListPageResponse = response

    /**
     * Delegates to [PhysicalCardProfileListPageResponse], but gracefully handles missing data.
     *
     * @see [PhysicalCardProfileListPageResponse.data]
     */
    fun data(): List<PhysicalCardProfile> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [PhysicalCardProfileListPageResponse], but gracefully handles missing data.
     *
     * @see [PhysicalCardProfileListPageResponse.nextCursor]
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PhysicalCardProfileListPageAsync && physicalCardProfilesService == other.physicalCardProfilesService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(physicalCardProfilesService, params, response) /* spotless:on */

    override fun toString() =
        "PhysicalCardProfileListPageAsync{physicalCardProfilesService=$physicalCardProfilesService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor().isPresent

    fun getNextPageParams(): Optional<PhysicalCardProfileListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextCursor().ifPresent { cursor(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<PhysicalCardProfileListPageAsync>> {
        return getNextPageParams()
            .map { physicalCardProfilesService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            physicalCardProfilesService: PhysicalCardProfileServiceAsync,
            params: PhysicalCardProfileListParams,
            response: PhysicalCardProfileListPageResponse,
        ) = PhysicalCardProfileListPageAsync(physicalCardProfilesService, params, response)
    }

    class AutoPager(private val firstPage: PhysicalCardProfileListPageAsync) {

        fun forEach(
            action: Predicate<PhysicalCardProfile>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<PhysicalCardProfileListPageAsync>>.forEach(
                action: (PhysicalCardProfile) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<PhysicalCardProfile>> {
            val values = mutableListOf<PhysicalCardProfile>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
