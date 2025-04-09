// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.digitalwallettokens

import com.increase.api.services.async.DigitalWalletTokenServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** List Digital Wallet Tokens */
class DigitalWalletTokenListPageAsync
private constructor(
    private val digitalWalletTokensService: DigitalWalletTokenServiceAsync,
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

        return /* spotless:off */ other is DigitalWalletTokenListPageAsync && digitalWalletTokensService == other.digitalWalletTokensService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(digitalWalletTokensService, params, response) /* spotless:on */

    override fun toString() =
        "DigitalWalletTokenListPageAsync{digitalWalletTokensService=$digitalWalletTokensService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor().isPresent

    fun getNextPageParams(): Optional<DigitalWalletTokenListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextCursor().ifPresent { cursor(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<DigitalWalletTokenListPageAsync>> {
        return getNextPageParams()
            .map { digitalWalletTokensService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            digitalWalletTokensService: DigitalWalletTokenServiceAsync,
            params: DigitalWalletTokenListParams,
            response: DigitalWalletTokenListPageResponse,
        ) = DigitalWalletTokenListPageAsync(digitalWalletTokensService, params, response)
    }

    class AutoPager(private val firstPage: DigitalWalletTokenListPageAsync) {

        fun forEach(
            action: Predicate<DigitalWalletToken>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<DigitalWalletTokenListPageAsync>>.forEach(
                action: (DigitalWalletToken) -> Boolean,
                executor: Executor,
            ): CompletableFuture<Void> =
                thenComposeAsync(
                    { page ->
                        page
                            .filter { it.data().all(action) }
                            .map { it.getNextPage().forEach(action, executor) }
                            .orElseGet { CompletableFuture.completedFuture(null) }
                    },
                    executor,
                )
            return CompletableFuture.completedFuture(Optional.of(firstPage))
                .forEach(action::test, executor)
        }

        fun toList(executor: Executor): CompletableFuture<List<DigitalWalletToken>> {
            val values = mutableListOf<DigitalWalletToken>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
