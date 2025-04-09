// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.achprenotifications

import com.increase.api.services.async.AchPrenotificationServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** List ACH Prenotifications */
class AchPrenotificationListPageAsync
private constructor(
    private val achPrenotificationsService: AchPrenotificationServiceAsync,
    private val params: AchPrenotificationListParams,
    private val response: AchPrenotificationListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): AchPrenotificationListPageResponse = response

    /**
     * Delegates to [AchPrenotificationListPageResponse], but gracefully handles missing data.
     *
     * @see [AchPrenotificationListPageResponse.data]
     */
    fun data(): List<AchPrenotification> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [AchPrenotificationListPageResponse], but gracefully handles missing data.
     *
     * @see [AchPrenotificationListPageResponse.nextCursor]
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AchPrenotificationListPageAsync && achPrenotificationsService == other.achPrenotificationsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(achPrenotificationsService, params, response) /* spotless:on */

    override fun toString() =
        "AchPrenotificationListPageAsync{achPrenotificationsService=$achPrenotificationsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor().isPresent

    fun getNextPageParams(): Optional<AchPrenotificationListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextCursor().ifPresent { cursor(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<AchPrenotificationListPageAsync>> {
        return getNextPageParams()
            .map { achPrenotificationsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            achPrenotificationsService: AchPrenotificationServiceAsync,
            params: AchPrenotificationListParams,
            response: AchPrenotificationListPageResponse,
        ) = AchPrenotificationListPageAsync(achPrenotificationsService, params, response)
    }

    class AutoPager(private val firstPage: AchPrenotificationListPageAsync) {

        fun forEach(
            action: Predicate<AchPrenotification>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<AchPrenotificationListPageAsync>>.forEach(
                action: (AchPrenotification) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<AchPrenotification>> {
            val values = mutableListOf<AchPrenotification>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
