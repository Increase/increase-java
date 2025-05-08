// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.bookkeepingentries

import com.increase.api.core.AutoPager
import com.increase.api.core.Page
import com.increase.api.core.checkRequired
import com.increase.api.services.blocking.BookkeepingEntryService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see [BookkeepingEntryService.list] */
class BookkeepingEntryListPage
private constructor(
    private val service: BookkeepingEntryService,
    private val params: BookkeepingEntryListParams,
    private val response: BookkeepingEntryListPageResponse,
) : Page<BookkeepingEntry> {

    /**
     * Delegates to [BookkeepingEntryListPageResponse], but gracefully handles missing data.
     *
     * @see [BookkeepingEntryListPageResponse.data]
     */
    fun data(): List<BookkeepingEntry> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [BookkeepingEntryListPageResponse], but gracefully handles missing data.
     *
     * @see [BookkeepingEntryListPageResponse.nextCursor]
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun items(): List<BookkeepingEntry> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): BookkeepingEntryListParams {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): BookkeepingEntryListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<BookkeepingEntry> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): BookkeepingEntryListParams = params

    /** The response that this page was parsed from. */
    fun response(): BookkeepingEntryListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BookkeepingEntryListPage].
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

    /** A builder for [BookkeepingEntryListPage]. */
    class Builder internal constructor() {

        private var service: BookkeepingEntryService? = null
        private var params: BookkeepingEntryListParams? = null
        private var response: BookkeepingEntryListPageResponse? = null

        @JvmSynthetic
        internal fun from(bookkeepingEntryListPage: BookkeepingEntryListPage) = apply {
            service = bookkeepingEntryListPage.service
            params = bookkeepingEntryListPage.params
            response = bookkeepingEntryListPage.response
        }

        fun service(service: BookkeepingEntryService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: BookkeepingEntryListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: BookkeepingEntryListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [BookkeepingEntryListPage].
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
        fun build(): BookkeepingEntryListPage =
            BookkeepingEntryListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BookkeepingEntryListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "BookkeepingEntryListPage{service=$service, params=$params, response=$response}"
}
