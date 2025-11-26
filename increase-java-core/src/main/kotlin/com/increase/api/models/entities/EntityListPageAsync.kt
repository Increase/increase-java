// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.entities

import com.increase.api.core.AutoPagerAsync
import com.increase.api.core.PageAsync
import com.increase.api.core.checkRequired
import com.increase.api.services.async.EntityServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see EntityServiceAsync.list */
class EntityListPageAsync
private constructor(
    private val service: EntityServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: EntityListParams,
    private val response: EntityListPageResponse,
) : PageAsync<Entity> {

    /**
     * Delegates to [EntityListPageResponse], but gracefully handles missing data.
     *
     * @see EntityListPageResponse.data
     */
    fun data(): List<Entity> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [EntityListPageResponse], but gracefully handles missing data.
     *
     * @see EntityListPageResponse.nextCursor
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun items(): List<Entity> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): EntityListParams {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<EntityListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<Entity> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): EntityListParams = params

    /** The response that this page was parsed from. */
    fun response(): EntityListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EntityListPageAsync].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EntityListPageAsync]. */
    class Builder internal constructor() {

        private var service: EntityServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: EntityListParams? = null
        private var response: EntityListPageResponse? = null

        @JvmSynthetic
        internal fun from(entityListPageAsync: EntityListPageAsync) = apply {
            service = entityListPageAsync.service
            streamHandlerExecutor = entityListPageAsync.streamHandlerExecutor
            params = entityListPageAsync.params
            response = entityListPageAsync.response
        }

        fun service(service: EntityServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: EntityListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: EntityListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [EntityListPageAsync].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EntityListPageAsync =
            EntityListPageAsync(
                checkRequired("service", service),
                checkRequired("streamHandlerExecutor", streamHandlerExecutor),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EntityListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "EntityListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
