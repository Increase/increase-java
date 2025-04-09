// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.oauthapplications

import com.increase.api.services.blocking.OAuthApplicationService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** List OAuth Applications */
class OAuthApplicationListPage
private constructor(
    private val oauthApplicationsService: OAuthApplicationService,
    private val params: OAuthApplicationListParams,
    private val response: OAuthApplicationListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): OAuthApplicationListPageResponse = response

    /**
     * Delegates to [OAuthApplicationListPageResponse], but gracefully handles missing data.
     *
     * @see [OAuthApplicationListPageResponse.data]
     */
    fun data(): List<OAuthApplication> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [OAuthApplicationListPageResponse], but gracefully handles missing data.
     *
     * @see [OAuthApplicationListPageResponse.nextCursor]
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is OAuthApplicationListPage && oauthApplicationsService == other.oauthApplicationsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(oauthApplicationsService, params, response) /* spotless:on */

    override fun toString() =
        "OAuthApplicationListPage{oauthApplicationsService=$oauthApplicationsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor().isPresent

    fun getNextPageParams(): Optional<OAuthApplicationListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextCursor().ifPresent { cursor(it) } }.build()
        )
    }

    fun getNextPage(): Optional<OAuthApplicationListPage> {
        return getNextPageParams().map { oauthApplicationsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            oauthApplicationsService: OAuthApplicationService,
            params: OAuthApplicationListParams,
            response: OAuthApplicationListPageResponse,
        ) = OAuthApplicationListPage(oauthApplicationsService, params, response)
    }

    class AutoPager(private val firstPage: OAuthApplicationListPage) : Iterable<OAuthApplication> {

        override fun iterator(): Iterator<OAuthApplication> = iterator {
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

        fun stream(): Stream<OAuthApplication> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
