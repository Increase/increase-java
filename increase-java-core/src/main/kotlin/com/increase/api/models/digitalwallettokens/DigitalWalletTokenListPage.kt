// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.digitalwallettokens

import com.increase.api.services.blocking.DigitalWalletTokenService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** List Digital Wallet Tokens */
class DigitalWalletTokenListPage
private constructor(
    private val digitalWalletTokensService: DigitalWalletTokenService,
    private val params: DigitalWalletTokenListParams,
    private val response: DigitalWalletTokenListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): DigitalWalletTokenListPageResponse = response

    /**
     * Delegates to [DigitalWalletTokenListPageResponse], but gracefully handles missing data.
     *
     * @see [DigitalWalletTokenListPageResponse.data]
     */
    fun data(): List<DigitalWalletToken> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [DigitalWalletTokenListPageResponse], but gracefully handles missing data.
     *
     * @see [DigitalWalletTokenListPageResponse.nextCursor]
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DigitalWalletTokenListPage && digitalWalletTokensService == other.digitalWalletTokensService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(digitalWalletTokensService, params, response) /* spotless:on */

    override fun toString() =
        "DigitalWalletTokenListPage{digitalWalletTokensService=$digitalWalletTokensService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor().isPresent

    fun getNextPageParams(): Optional<DigitalWalletTokenListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextCursor().ifPresent { cursor(it) } }.build()
        )
    }

    fun getNextPage(): Optional<DigitalWalletTokenListPage> {
        return getNextPageParams().map { digitalWalletTokensService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            digitalWalletTokensService: DigitalWalletTokenService,
            params: DigitalWalletTokenListParams,
            response: DigitalWalletTokenListPageResponse,
        ) = DigitalWalletTokenListPage(digitalWalletTokensService, params, response)
    }

    class AutoPager(private val firstPage: DigitalWalletTokenListPage) :
        Iterable<DigitalWalletToken> {

        override fun iterator(): Iterator<DigitalWalletToken> = iterator {
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

        fun stream(): Stream<DigitalWalletToken> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
