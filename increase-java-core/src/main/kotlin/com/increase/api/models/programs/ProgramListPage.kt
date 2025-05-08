// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.programs

import com.increase.api.core.AutoPager
import com.increase.api.core.Page
import com.increase.api.core.checkRequired
import com.increase.api.services.blocking.ProgramService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see [ProgramService.list] */
class ProgramListPage
private constructor(
    private val service: ProgramService,
    private val params: ProgramListParams,
    private val response: ProgramListPageResponse,
) : Page<Program> {

    /**
     * Delegates to [ProgramListPageResponse], but gracefully handles missing data.
     *
     * @see [ProgramListPageResponse.data]
     */
    fun data(): List<Program> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [ProgramListPageResponse], but gracefully handles missing data.
     *
     * @see [ProgramListPageResponse.nextCursor]
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun items(): List<Program> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): ProgramListParams {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): ProgramListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<Program> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): ProgramListParams = params

    /** The response that this page was parsed from. */
    fun response(): ProgramListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ProgramListPage].
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

    /** A builder for [ProgramListPage]. */
    class Builder internal constructor() {

        private var service: ProgramService? = null
        private var params: ProgramListParams? = null
        private var response: ProgramListPageResponse? = null

        @JvmSynthetic
        internal fun from(programListPage: ProgramListPage) = apply {
            service = programListPage.service
            params = programListPage.params
            response = programListPage.response
        }

        fun service(service: ProgramService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ProgramListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ProgramListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ProgramListPage].
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
        fun build(): ProgramListPage =
            ProgramListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ProgramListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "ProgramListPage{service=$service, params=$params, response=$response}"
}
