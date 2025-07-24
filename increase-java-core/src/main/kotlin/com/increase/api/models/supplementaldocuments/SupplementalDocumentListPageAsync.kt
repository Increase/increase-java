// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.supplementaldocuments

import com.increase.api.core.AutoPagerAsync
import com.increase.api.core.PageAsync
import com.increase.api.core.checkRequired
import com.increase.api.services.async.SupplementalDocumentServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see SupplementalDocumentServiceAsync.list */
class SupplementalDocumentListPageAsync
private constructor(
    private val service: SupplementalDocumentServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: SupplementalDocumentListParams,
    private val response: SupplementalDocumentListPageResponse,
) : PageAsync<EntitySupplementalDocument> {

    /**
     * Delegates to [SupplementalDocumentListPageResponse], but gracefully handles missing data.
     *
     * @see SupplementalDocumentListPageResponse.data
     */
    fun data(): List<EntitySupplementalDocument> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [SupplementalDocumentListPageResponse], but gracefully handles missing data.
     *
     * @see SupplementalDocumentListPageResponse.nextCursor
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun items(): List<EntitySupplementalDocument> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): SupplementalDocumentListParams {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<SupplementalDocumentListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<EntitySupplementalDocument> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): SupplementalDocumentListParams = params

    /** The response that this page was parsed from. */
    fun response(): SupplementalDocumentListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [SupplementalDocumentListPageAsync].
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

    /** A builder for [SupplementalDocumentListPageAsync]. */
    class Builder internal constructor() {

        private var service: SupplementalDocumentServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: SupplementalDocumentListParams? = null
        private var response: SupplementalDocumentListPageResponse? = null

        @JvmSynthetic
        internal fun from(supplementalDocumentListPageAsync: SupplementalDocumentListPageAsync) =
            apply {
                service = supplementalDocumentListPageAsync.service
                streamHandlerExecutor = supplementalDocumentListPageAsync.streamHandlerExecutor
                params = supplementalDocumentListPageAsync.params
                response = supplementalDocumentListPageAsync.response
            }

        fun service(service: SupplementalDocumentServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: SupplementalDocumentListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: SupplementalDocumentListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [SupplementalDocumentListPageAsync].
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
        fun build(): SupplementalDocumentListPageAsync =
            SupplementalDocumentListPageAsync(
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

        return /* spotless:off */ other is SupplementalDocumentListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, response) /* spotless:on */

    override fun toString() =
        "SupplementalDocumentListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
