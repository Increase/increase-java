// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.entityonboardingsessions

import com.increase.api.core.AutoPager
import com.increase.api.core.Page
import com.increase.api.core.checkRequired
import com.increase.api.services.blocking.EntityOnboardingSessionService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see EntityOnboardingSessionService.list */
class EntityOnboardingSessionListPage
private constructor(
    private val service: EntityOnboardingSessionService,
    private val params: EntityOnboardingSessionListParams,
    private val response: EntityOnboardingSessionListPageResponse,
) : Page<EntityOnboardingSession> {

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

    override fun nextPage(): EntityOnboardingSessionListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<EntityOnboardingSession> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): EntityOnboardingSessionListParams = params

    /** The response that this page was parsed from. */
    fun response(): EntityOnboardingSessionListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [EntityOnboardingSessionListPage].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EntityOnboardingSessionListPage]. */
    class Builder internal constructor() {

        private var service: EntityOnboardingSessionService? = null
        private var params: EntityOnboardingSessionListParams? = null
        private var response: EntityOnboardingSessionListPageResponse? = null

        @JvmSynthetic
        internal fun from(entityOnboardingSessionListPage: EntityOnboardingSessionListPage) =
            apply {
                service = entityOnboardingSessionListPage.service
                params = entityOnboardingSessionListPage.params
                response = entityOnboardingSessionListPage.response
            }

        fun service(service: EntityOnboardingSessionService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: EntityOnboardingSessionListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: EntityOnboardingSessionListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [EntityOnboardingSessionListPage].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EntityOnboardingSessionListPage =
            EntityOnboardingSessionListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EntityOnboardingSessionListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "EntityOnboardingSessionListPage{service=$service, params=$params, response=$response}"
}
