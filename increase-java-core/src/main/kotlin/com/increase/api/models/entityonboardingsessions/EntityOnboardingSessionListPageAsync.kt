// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.entityonboardingsessions

import com.increase.api.core.AutoPagerAsync
import com.increase.api.core.PageAsync
import com.increase.api.core.checkRequired
import com.increase.api.services.async.EntityOnboardingSessionServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see EntityOnboardingSessionServiceAsync.list */
class EntityOnboardingSessionListPageAsync
private constructor(
    private val service: EntityOnboardingSessionServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: EntityOnboardingSessionListParams,
    private val response: EntityOnboardingSessionListPageResponse,
) : PageAsync<EntityOnboardingSession> {

    /**
     * Delegates to [EntityOnboardingSessionListPageResponse], but gracefully handles missing data.
     *
     * @see EntityOnboardingSessionListPageResponse.data
     */
    fun data(): List<EntityOnboardingSession> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [EntityOnboardingSessionListPageResponse], but gracefully handles missing data.
     *
     * @see EntityOnboardingSessionListPageResponse.nextCursor
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun items(): List<EntityOnboardingSession> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): EntityOnboardingSessionListParams {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<EntityOnboardingSessionListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<EntityOnboardingSession> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): EntityOnboardingSessionListParams = params

    /** The response that this page was parsed from. */
    fun response(): EntityOnboardingSessionListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [EntityOnboardingSessionListPageAsync].
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

    /** A builder for [EntityOnboardingSessionListPageAsync]. */
    class Builder internal constructor() {

        private var service: EntityOnboardingSessionServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: EntityOnboardingSessionListParams? = null
        private var response: EntityOnboardingSessionListPageResponse? = null

        @JvmSynthetic
        internal fun from(
            entityOnboardingSessionListPageAsync: EntityOnboardingSessionListPageAsync
        ) = apply {
            service = entityOnboardingSessionListPageAsync.service
            streamHandlerExecutor = entityOnboardingSessionListPageAsync.streamHandlerExecutor
            params = entityOnboardingSessionListPageAsync.params
            response = entityOnboardingSessionListPageAsync.response
        }

        fun service(service: EntityOnboardingSessionServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: EntityOnboardingSessionListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: EntityOnboardingSessionListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [EntityOnboardingSessionListPageAsync].
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
        fun build(): EntityOnboardingSessionListPageAsync =
            EntityOnboardingSessionListPageAsync(
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

        return other is EntityOnboardingSessionListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "EntityOnboardingSessionListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
