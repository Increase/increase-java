// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.bookkeepingentrysets

import com.increase.api.core.AutoPager
import com.increase.api.core.Page
import com.increase.api.core.checkRequired
import com.increase.api.services.blocking.BookkeepingEntrySetService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see [BookkeepingEntrySetService.list] */
class BookkeepingEntrySetListPage
private constructor(
    private val service: BookkeepingEntrySetService,
    private val params: BookkeepingEntrySetListParams,
    private val response: BookkeepingEntrySetListPageResponse,
) : Page<BookkeepingEntrySet> {

    /**
     * Delegates to [BookkeepingEntrySetListPageResponse], but gracefully handles missing data.
     *
     * @see [BookkeepingEntrySetListPageResponse.data]
     */
    fun data(): List<BookkeepingEntrySet> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [BookkeepingEntrySetListPageResponse], but gracefully handles missing data.
     *
     * @see [BookkeepingEntrySetListPageResponse.nextCursor]
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun items(): List<BookkeepingEntrySet> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): BookkeepingEntrySetListParams {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): BookkeepingEntrySetListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<BookkeepingEntrySet> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): BookkeepingEntrySetListParams = params

    /** The response that this page was parsed from. */
    fun response(): BookkeepingEntrySetListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BookkeepingEntrySetListPage].
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

    /** A builder for [BookkeepingEntrySetListPage]. */
    class Builder internal constructor() {

        private var service: BookkeepingEntrySetService? = null
        private var params: BookkeepingEntrySetListParams? = null
        private var response: BookkeepingEntrySetListPageResponse? = null

        @JvmSynthetic
        internal fun from(bookkeepingEntrySetListPage: BookkeepingEntrySetListPage) = apply {
            service = bookkeepingEntrySetListPage.service
            params = bookkeepingEntrySetListPage.params
            response = bookkeepingEntrySetListPage.response
        }

        fun service(service: BookkeepingEntrySetService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: BookkeepingEntrySetListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: BookkeepingEntrySetListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [BookkeepingEntrySetListPage].
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
        fun build(): BookkeepingEntrySetListPage =
            BookkeepingEntrySetListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BookkeepingEntrySetListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "BookkeepingEntrySetListPage{service=$service, params=$params, response=$response}"
}
