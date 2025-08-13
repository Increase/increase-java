// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.intrafiaccountenrollments

import com.increase.api.core.AutoPagerAsync
import com.increase.api.core.PageAsync
import com.increase.api.core.checkRequired
import com.increase.api.services.async.IntrafiAccountEnrollmentServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see IntrafiAccountEnrollmentServiceAsync.list */
class IntrafiAccountEnrollmentListPageAsync
private constructor(
    private val service: IntrafiAccountEnrollmentServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: IntrafiAccountEnrollmentListParams,
    private val response: IntrafiAccountEnrollmentListPageResponse,
) : PageAsync<IntrafiAccountEnrollment> {

    /**
     * Delegates to [IntrafiAccountEnrollmentListPageResponse], but gracefully handles missing data.
     *
     * @see IntrafiAccountEnrollmentListPageResponse.data
     */
    fun data(): List<IntrafiAccountEnrollment> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [IntrafiAccountEnrollmentListPageResponse], but gracefully handles missing data.
     *
     * @see IntrafiAccountEnrollmentListPageResponse.nextCursor
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun items(): List<IntrafiAccountEnrollment> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): IntrafiAccountEnrollmentListParams {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<IntrafiAccountEnrollmentListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<IntrafiAccountEnrollment> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): IntrafiAccountEnrollmentListParams = params

    /** The response that this page was parsed from. */
    fun response(): IntrafiAccountEnrollmentListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [IntrafiAccountEnrollmentListPageAsync].
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

    /** A builder for [IntrafiAccountEnrollmentListPageAsync]. */
    class Builder internal constructor() {

        private var service: IntrafiAccountEnrollmentServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: IntrafiAccountEnrollmentListParams? = null
        private var response: IntrafiAccountEnrollmentListPageResponse? = null

        @JvmSynthetic
        internal fun from(
            intrafiAccountEnrollmentListPageAsync: IntrafiAccountEnrollmentListPageAsync
        ) = apply {
            service = intrafiAccountEnrollmentListPageAsync.service
            streamHandlerExecutor = intrafiAccountEnrollmentListPageAsync.streamHandlerExecutor
            params = intrafiAccountEnrollmentListPageAsync.params
            response = intrafiAccountEnrollmentListPageAsync.response
        }

        fun service(service: IntrafiAccountEnrollmentServiceAsync) = apply {
            this.service = service
        }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: IntrafiAccountEnrollmentListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: IntrafiAccountEnrollmentListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [IntrafiAccountEnrollmentListPageAsync].
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
        fun build(): IntrafiAccountEnrollmentListPageAsync =
            IntrafiAccountEnrollmentListPageAsync(
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

        return other is IntrafiAccountEnrollmentListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "IntrafiAccountEnrollmentListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
