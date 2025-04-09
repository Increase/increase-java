// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.checktransfers

import com.increase.api.core.checkRequired
import com.increase.api.services.blocking.CheckTransferService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** @see [CheckTransferService.list] */
class CheckTransferListPage
private constructor(
    private val service: CheckTransferService,
    private val params: CheckTransferListParams,
    private val response: CheckTransferListPageResponse,
) {

    /**
     * Delegates to [CheckTransferListPageResponse], but gracefully handles missing data.
     *
     * @see [CheckTransferListPageResponse.data]
     */
    fun data(): List<CheckTransfer> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [CheckTransferListPageResponse], but gracefully handles missing data.
     *
     * @see [CheckTransferListPageResponse.nextCursor]
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor().isPresent

    fun getNextPageParams(): Optional<CheckTransferListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextCursor().ifPresent { cursor(it) } }.build()
        )
    }

    fun getNextPage(): Optional<CheckTransferListPage> =
        getNextPageParams().map { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): CheckTransferListParams = params

    /** The response that this page was parsed from. */
    fun response(): CheckTransferListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CheckTransferListPage].
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

    /** A builder for [CheckTransferListPage]. */
    class Builder internal constructor() {

        private var service: CheckTransferService? = null
        private var params: CheckTransferListParams? = null
        private var response: CheckTransferListPageResponse? = null

        @JvmSynthetic
        internal fun from(checkTransferListPage: CheckTransferListPage) = apply {
            service = checkTransferListPage.service
            params = checkTransferListPage.params
            response = checkTransferListPage.response
        }

        fun service(service: CheckTransferService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CheckTransferListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CheckTransferListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [CheckTransferListPage].
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
        fun build(): CheckTransferListPage =
            CheckTransferListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: CheckTransferListPage) : Iterable<CheckTransfer> {

        override fun iterator(): Iterator<CheckTransfer> = iterator {
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

        fun stream(): Stream<CheckTransfer> {
            return StreamSupport.stream(spliterator(), false)
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CheckTransferListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "CheckTransferListPage{service=$service, params=$params, response=$response}"
}
