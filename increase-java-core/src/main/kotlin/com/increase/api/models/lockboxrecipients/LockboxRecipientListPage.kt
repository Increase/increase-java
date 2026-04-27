// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.lockboxrecipients

import com.increase.api.core.AutoPager
import com.increase.api.core.Page
import com.increase.api.core.checkRequired
import com.increase.api.services.blocking.LockboxRecipientService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see LockboxRecipientService.list */
class LockboxRecipientListPage
private constructor(
    private val service: LockboxRecipientService,
    private val params: LockboxRecipientListParams,
    private val response: LockboxRecipientListPageResponse,
) : Page<LockboxRecipient> {

    /**
     * Delegates to [LockboxRecipientListPageResponse], but gracefully handles missing data.
     *
     * @see LockboxRecipientListPageResponse.data
     */
    fun data(): List<LockboxRecipient> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [LockboxRecipientListPageResponse], but gracefully handles missing data.
     *
     * @see LockboxRecipientListPageResponse.nextCursor
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun items(): List<LockboxRecipient> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): LockboxRecipientListParams {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): LockboxRecipientListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<LockboxRecipient> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): LockboxRecipientListParams = params

    /** The response that this page was parsed from. */
    fun response(): LockboxRecipientListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [LockboxRecipientListPage].
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

    /** A builder for [LockboxRecipientListPage]. */
    class Builder internal constructor() {

        private var service: LockboxRecipientService? = null
        private var params: LockboxRecipientListParams? = null
        private var response: LockboxRecipientListPageResponse? = null

        @JvmSynthetic
        internal fun from(lockboxRecipientListPage: LockboxRecipientListPage) = apply {
            service = lockboxRecipientListPage.service
            params = lockboxRecipientListPage.params
            response = lockboxRecipientListPage.response
        }

        fun service(service: LockboxRecipientService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: LockboxRecipientListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: LockboxRecipientListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [LockboxRecipientListPage].
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
        fun build(): LockboxRecipientListPage =
            LockboxRecipientListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LockboxRecipientListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "LockboxRecipientListPage{service=$service, params=$params, response=$response}"
}
