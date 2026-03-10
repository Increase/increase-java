// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.beneficialowners

import com.increase.api.core.AutoPagerAsync
import com.increase.api.core.PageAsync
import com.increase.api.core.checkRequired
import com.increase.api.services.async.BeneficialOwnerServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see BeneficialOwnerServiceAsync.list */
class BeneficialOwnerListPageAsync
private constructor(
    private val service: BeneficialOwnerServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: BeneficialOwnerListParams,
    private val response: BeneficialOwnerListPageResponse,
) : PageAsync<EntityBeneficialOwner> {

    /**
     * Delegates to [BeneficialOwnerListPageResponse], but gracefully handles missing data.
     *
     * @see BeneficialOwnerListPageResponse.data
     */
    fun data(): List<EntityBeneficialOwner> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [BeneficialOwnerListPageResponse], but gracefully handles missing data.
     *
     * @see BeneficialOwnerListPageResponse.nextCursor
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun items(): List<EntityBeneficialOwner> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): BeneficialOwnerListParams {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<BeneficialOwnerListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<EntityBeneficialOwner> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): BeneficialOwnerListParams = params

    /** The response that this page was parsed from. */
    fun response(): BeneficialOwnerListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BeneficialOwnerListPageAsync].
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

    /** A builder for [BeneficialOwnerListPageAsync]. */
    class Builder internal constructor() {

        private var service: BeneficialOwnerServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: BeneficialOwnerListParams? = null
        private var response: BeneficialOwnerListPageResponse? = null

        @JvmSynthetic
        internal fun from(beneficialOwnerListPageAsync: BeneficialOwnerListPageAsync) = apply {
            service = beneficialOwnerListPageAsync.service
            streamHandlerExecutor = beneficialOwnerListPageAsync.streamHandlerExecutor
            params = beneficialOwnerListPageAsync.params
            response = beneficialOwnerListPageAsync.response
        }

        fun service(service: BeneficialOwnerServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: BeneficialOwnerListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: BeneficialOwnerListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [BeneficialOwnerListPageAsync].
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
        fun build(): BeneficialOwnerListPageAsync =
            BeneficialOwnerListPageAsync(
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

        return other is BeneficialOwnerListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "BeneficialOwnerListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
