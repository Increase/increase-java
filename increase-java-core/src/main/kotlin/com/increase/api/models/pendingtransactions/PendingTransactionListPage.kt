// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.pendingtransactions

import com.increase.api.core.checkRequired
import com.increase.api.services.blocking.PendingTransactionService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** @see [PendingTransactionService.list] */
class PendingTransactionListPage
private constructor(
    private val service: PendingTransactionService,
    private val params: PendingTransactionListParams,
    private val response: PendingTransactionListPageResponse,
) {

    /**
     * Delegates to [PendingTransactionListPageResponse], but gracefully handles missing data.
     *
     * @see [PendingTransactionListPageResponse.data]
     */
    fun data(): List<PendingTransaction> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [PendingTransactionListPageResponse], but gracefully handles missing data.
     *
     * @see [PendingTransactionListPageResponse.nextCursor]
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor().isPresent

    fun getNextPageParams(): Optional<PendingTransactionListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextCursor().ifPresent { cursor(it) } }.build()
        )
    }

    fun getNextPage(): Optional<PendingTransactionListPage> =
        getNextPageParams().map { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): PendingTransactionListParams = params

    /** The response that this page was parsed from. */
    fun response(): PendingTransactionListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PendingTransactionListPage].
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

    /** A builder for [PendingTransactionListPage]. */
    class Builder internal constructor() {

        private var service: PendingTransactionService? = null
        private var params: PendingTransactionListParams? = null
        private var response: PendingTransactionListPageResponse? = null

        @JvmSynthetic
        internal fun from(pendingTransactionListPage: PendingTransactionListPage) = apply {
            service = pendingTransactionListPage.service
            params = pendingTransactionListPage.params
            response = pendingTransactionListPage.response
        }

        fun service(service: PendingTransactionService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: PendingTransactionListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PendingTransactionListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [PendingTransactionListPage].
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
        fun build(): PendingTransactionListPage =
            PendingTransactionListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: PendingTransactionListPage) :
        Iterable<PendingTransaction> {

        override fun iterator(): Iterator<PendingTransaction> = iterator {
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

        fun stream(): Stream<PendingTransaction> {
            return StreamSupport.stream(spliterator(), false)
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PendingTransactionListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "PendingTransactionListPage{service=$service, params=$params, response=$response}"
}
