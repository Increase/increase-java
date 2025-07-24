// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.physicalcardprofiles

import com.increase.api.core.AutoPagerAsync
import com.increase.api.core.PageAsync
import com.increase.api.core.checkRequired
import com.increase.api.services.async.PhysicalCardProfileServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see PhysicalCardProfileServiceAsync.list */
class PhysicalCardProfileListPageAsync
private constructor(
    private val service: PhysicalCardProfileServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: PhysicalCardProfileListParams,
    private val response: PhysicalCardProfileListPageResponse,
) : PageAsync<PhysicalCardProfile> {

    /**
     * Delegates to [PhysicalCardProfileListPageResponse], but gracefully handles missing data.
     *
     * @see PhysicalCardProfileListPageResponse.data
     */
    fun data(): List<PhysicalCardProfile> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [PhysicalCardProfileListPageResponse], but gracefully handles missing data.
     *
     * @see PhysicalCardProfileListPageResponse.nextCursor
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun items(): List<PhysicalCardProfile> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): PhysicalCardProfileListParams {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<PhysicalCardProfileListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<PhysicalCardProfile> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): PhysicalCardProfileListParams = params

    /** The response that this page was parsed from. */
    fun response(): PhysicalCardProfileListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [PhysicalCardProfileListPageAsync].
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

    /** A builder for [PhysicalCardProfileListPageAsync]. */
    class Builder internal constructor() {

        private var service: PhysicalCardProfileServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: PhysicalCardProfileListParams? = null
        private var response: PhysicalCardProfileListPageResponse? = null

        @JvmSynthetic
        internal fun from(physicalCardProfileListPageAsync: PhysicalCardProfileListPageAsync) =
            apply {
                service = physicalCardProfileListPageAsync.service
                streamHandlerExecutor = physicalCardProfileListPageAsync.streamHandlerExecutor
                params = physicalCardProfileListPageAsync.params
                response = physicalCardProfileListPageAsync.response
            }

        fun service(service: PhysicalCardProfileServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: PhysicalCardProfileListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PhysicalCardProfileListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [PhysicalCardProfileListPageAsync].
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
        fun build(): PhysicalCardProfileListPageAsync =
            PhysicalCardProfileListPageAsync(
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

        return /* spotless:off */ other is PhysicalCardProfileListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, response) /* spotless:on */

    override fun toString() =
        "PhysicalCardProfileListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
