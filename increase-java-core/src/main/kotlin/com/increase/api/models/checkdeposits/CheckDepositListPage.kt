// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.checkdeposits

import com.increase.api.core.checkRequired
import com.increase.api.services.blocking.CheckDepositService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** @see [CheckDepositService.list] */
class CheckDepositListPage
private constructor(
    private val service: CheckDepositService,
    private val params: CheckDepositListParams,
    private val response: CheckDepositListPageResponse,
) {

    /**
     * Delegates to [CheckDepositListPageResponse], but gracefully handles missing data.
     *
     * @see [CheckDepositListPageResponse.data]
     */
    fun data(): List<CheckDeposit> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [CheckDepositListPageResponse], but gracefully handles missing data.
     *
     * @see [CheckDepositListPageResponse.nextCursor]
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor().isPresent

    fun getNextPageParams(): Optional<CheckDepositListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextCursor().ifPresent { cursor(it) } }.build()
        )
    }

    fun getNextPage(): Optional<CheckDepositListPage> = getNextPageParams().map { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): CheckDepositListParams = params

    /** The response that this page was parsed from. */
    fun response(): CheckDepositListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CheckDepositListPage].
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

    /** A builder for [CheckDepositListPage]. */
    class Builder internal constructor() {

        private var service: CheckDepositService? = null
        private var params: CheckDepositListParams? = null
        private var response: CheckDepositListPageResponse? = null

        @JvmSynthetic
        internal fun from(checkDepositListPage: CheckDepositListPage) = apply {
            service = checkDepositListPage.service
            params = checkDepositListPage.params
            response = checkDepositListPage.response
        }

        fun service(service: CheckDepositService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CheckDepositListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CheckDepositListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [CheckDepositListPage].
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
        fun build(): CheckDepositListPage =
            CheckDepositListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: CheckDepositListPage) : Iterable<CheckDeposit> {

        override fun iterator(): Iterator<CheckDeposit> = iterator {
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

        fun stream(): Stream<CheckDeposit> {
            return StreamSupport.stream(spliterator(), false)
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CheckDepositListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "CheckDepositListPage{service=$service, params=$params, response=$response}"
}
