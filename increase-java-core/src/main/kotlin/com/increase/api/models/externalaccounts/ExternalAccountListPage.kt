// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.externalaccounts

import com.increase.api.core.checkRequired
import com.increase.api.services.blocking.ExternalAccountService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** @see [ExternalAccountService.list] */
class ExternalAccountListPage
private constructor(
    private val service: ExternalAccountService,
    private val params: ExternalAccountListParams,
    private val response: ExternalAccountListPageResponse,
) {

    /**
     * Delegates to [ExternalAccountListPageResponse], but gracefully handles missing data.
     *
     * @see [ExternalAccountListPageResponse.data]
     */
    fun data(): List<ExternalAccount> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [ExternalAccountListPageResponse], but gracefully handles missing data.
     *
     * @see [ExternalAccountListPageResponse.nextCursor]
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor().isPresent

    fun getNextPageParams(): Optional<ExternalAccountListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextCursor().ifPresent { cursor(it) } }.build()
        )
    }

    fun getNextPage(): Optional<ExternalAccountListPage> =
        getNextPageParams().map { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): ExternalAccountListParams = params

    /** The response that this page was parsed from. */
    fun response(): ExternalAccountListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ExternalAccountListPage].
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

    /** A builder for [ExternalAccountListPage]. */
    class Builder internal constructor() {

        private var service: ExternalAccountService? = null
        private var params: ExternalAccountListParams? = null
        private var response: ExternalAccountListPageResponse? = null

        @JvmSynthetic
        internal fun from(externalAccountListPage: ExternalAccountListPage) = apply {
            service = externalAccountListPage.service
            params = externalAccountListPage.params
            response = externalAccountListPage.response
        }

        fun service(service: ExternalAccountService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ExternalAccountListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ExternalAccountListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ExternalAccountListPage].
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
        fun build(): ExternalAccountListPage =
            ExternalAccountListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: ExternalAccountListPage) : Iterable<ExternalAccount> {

        override fun iterator(): Iterator<ExternalAccount> = iterator {
            var page = firstPage
            var index = 0
            while (true) {
                while (index < page.data().size) {
                    yield(page.data()[index++])
                }
                page = page.getNextPage().getOrNull() ?: break
                index = 0
            }
        }

        fun stream(): Stream<ExternalAccount> {
            return StreamSupport.stream(spliterator(), false)
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ExternalAccountListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "ExternalAccountListPage{service=$service, params=$params, response=$response}"
}
