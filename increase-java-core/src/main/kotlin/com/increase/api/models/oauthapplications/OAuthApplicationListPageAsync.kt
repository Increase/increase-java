// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.oauthapplications

import com.increase.api.core.AutoPagerAsync
import com.increase.api.core.PageAsync
import com.increase.api.core.checkRequired
import com.increase.api.services.async.OAuthApplicationServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see [OAuthApplicationServiceAsync.list] */
class OAuthApplicationListPageAsync
private constructor(
    private val service: OAuthApplicationServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: OAuthApplicationListParams,
    private val response: OAuthApplicationListPageResponse,
) : PageAsync<OAuthApplication> {

    /**
     * Delegates to [OAuthApplicationListPageResponse], but gracefully handles missing data.
     *
     * @see [OAuthApplicationListPageResponse.data]
     */
    fun data(): List<OAuthApplication> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [OAuthApplicationListPageResponse], but gracefully handles missing data.
     *
     * @see [OAuthApplicationListPageResponse.nextCursor]
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun items(): List<OAuthApplication> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): OAuthApplicationListParams {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<OAuthApplicationListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<OAuthApplication> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): OAuthApplicationListParams = params

    /** The response that this page was parsed from. */
    fun response(): OAuthApplicationListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [OAuthApplicationListPageAsync].
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

    /** A builder for [OAuthApplicationListPageAsync]. */
    class Builder internal constructor() {

        private var service: OAuthApplicationServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: OAuthApplicationListParams? = null
        private var response: OAuthApplicationListPageResponse? = null

        @JvmSynthetic
        internal fun from(oauthApplicationListPageAsync: OAuthApplicationListPageAsync) = apply {
            service = oauthApplicationListPageAsync.service
            streamHandlerExecutor = oauthApplicationListPageAsync.streamHandlerExecutor
            params = oauthApplicationListPageAsync.params
            response = oauthApplicationListPageAsync.response
        }

        fun service(service: OAuthApplicationServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: OAuthApplicationListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: OAuthApplicationListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [OAuthApplicationListPageAsync].
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
        fun build(): OAuthApplicationListPageAsync =
            OAuthApplicationListPageAsync(
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

        return /* spotless:off */ other is OAuthApplicationListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, response) /* spotless:on */

    override fun toString() =
        "OAuthApplicationListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
