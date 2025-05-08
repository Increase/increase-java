// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.intrafiexclusions

import com.increase.api.core.AutoPagerAsync
import com.increase.api.core.PageAsync
import com.increase.api.core.checkRequired
import com.increase.api.services.async.IntrafiExclusionServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see [IntrafiExclusionServiceAsync.list] */
class IntrafiExclusionListPageAsync
private constructor(
    private val service: IntrafiExclusionServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: IntrafiExclusionListParams,
    private val response: IntrafiExclusionListPageResponse,
) : PageAsync<IntrafiExclusion> {

    /**
     * Delegates to [IntrafiExclusionListPageResponse], but gracefully handles missing data.
     *
     * @see [IntrafiExclusionListPageResponse.data]
     */
    fun data(): List<IntrafiExclusion> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [IntrafiExclusionListPageResponse], but gracefully handles missing data.
     *
     * @see [IntrafiExclusionListPageResponse.nextCursor]
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun items(): List<IntrafiExclusion> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): IntrafiExclusionListParams {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<IntrafiExclusionListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<IntrafiExclusion> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): IntrafiExclusionListParams = params

    /** The response that this page was parsed from. */
    fun response(): IntrafiExclusionListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [IntrafiExclusionListPageAsync].
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

    /** A builder for [IntrafiExclusionListPageAsync]. */
    class Builder internal constructor() {

        private var service: IntrafiExclusionServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: IntrafiExclusionListParams? = null
        private var response: IntrafiExclusionListPageResponse? = null

        @JvmSynthetic
        internal fun from(intrafiExclusionListPageAsync: IntrafiExclusionListPageAsync) = apply {
            service = intrafiExclusionListPageAsync.service
            streamHandlerExecutor = intrafiExclusionListPageAsync.streamHandlerExecutor
            params = intrafiExclusionListPageAsync.params
            response = intrafiExclusionListPageAsync.response
        }

        fun service(service: IntrafiExclusionServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: IntrafiExclusionListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: IntrafiExclusionListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [IntrafiExclusionListPageAsync].
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
        fun build(): IntrafiExclusionListPageAsync =
            IntrafiExclusionListPageAsync(
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

        return /* spotless:off */ other is IntrafiExclusionListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, response) /* spotless:on */

    override fun toString() =
        "IntrafiExclusionListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
