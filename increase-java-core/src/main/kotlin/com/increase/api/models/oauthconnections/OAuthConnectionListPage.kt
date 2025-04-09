// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.oauthconnections

import com.increase.api.services.blocking.OAuthConnectionService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** List OAuth Connections */
class OAuthConnectionListPage
private constructor(
    private val oauthConnectionsService: OAuthConnectionService,
    private val params: OAuthConnectionListParams,
    private val response: OAuthConnectionListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): OAuthConnectionListPageResponse = response

    /**
     * Delegates to [OAuthConnectionListPageResponse], but gracefully handles missing data.
     *
     * @see [OAuthConnectionListPageResponse.data]
     */
    fun data(): List<OAuthConnection> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [OAuthConnectionListPageResponse], but gracefully handles missing data.
     *
     * @see [OAuthConnectionListPageResponse.nextCursor]
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is OAuthConnectionListPage && oauthConnectionsService == other.oauthConnectionsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(oauthConnectionsService, params, response) /* spotless:on */

    override fun toString() =
        "OAuthConnectionListPage{oauthConnectionsService=$oauthConnectionsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor().isPresent

    fun getNextPageParams(): Optional<OAuthConnectionListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextCursor().ifPresent { cursor(it) } }.build()
        )
    }

    fun getNextPage(): Optional<OAuthConnectionListPage> {
        return getNextPageParams().map { oauthConnectionsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            oauthConnectionsService: OAuthConnectionService,
            params: OAuthConnectionListParams,
            response: OAuthConnectionListPageResponse,
        ) = OAuthConnectionListPage(oauthConnectionsService, params, response)
    }

    class AutoPager(private val firstPage: OAuthConnectionListPage) : Iterable<OAuthConnection> {

        override fun iterator(): Iterator<OAuthConnection> = iterator {
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

        fun stream(): Stream<OAuthConnection> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
