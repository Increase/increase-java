// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.accountnumbers

import com.increase.api.core.checkRequired
import com.increase.api.services.async.AccountNumberServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** @see [AccountNumberServiceAsync.list] */
class AccountNumberListPageAsync
private constructor(
    private val service: AccountNumberServiceAsync,
    private val params: AccountNumberListParams,
    private val response: AccountNumberListPageResponse,
) {

    /**
     * Delegates to [AccountNumberListPageResponse], but gracefully handles missing data.
     *
     * @see [AccountNumberListPageResponse.data]
     */
    fun data(): List<AccountNumber> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [AccountNumberListPageResponse], but gracefully handles missing data.
     *
     * @see [AccountNumberListPageResponse.nextCursor]
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor().isPresent

    fun getNextPageParams(): Optional<AccountNumberListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextCursor().ifPresent { cursor(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<AccountNumberListPageAsync>> =
        getNextPageParams()
            .map { service.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): AccountNumberListParams = params

    /** The response that this page was parsed from. */
    fun response(): AccountNumberListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AccountNumberListPageAsync].
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

    /** A builder for [AccountNumberListPageAsync]. */
    class Builder internal constructor() {

        private var service: AccountNumberServiceAsync? = null
        private var params: AccountNumberListParams? = null
        private var response: AccountNumberListPageResponse? = null

        @JvmSynthetic
        internal fun from(accountNumberListPageAsync: AccountNumberListPageAsync) = apply {
            service = accountNumberListPageAsync.service
            params = accountNumberListPageAsync.params
            response = accountNumberListPageAsync.response
        }

        fun service(service: AccountNumberServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: AccountNumberListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AccountNumberListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [AccountNumberListPageAsync].
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
        fun build(): AccountNumberListPageAsync =
            AccountNumberListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: AccountNumberListPageAsync) {

        fun forEach(action: Predicate<AccountNumber>, executor: Executor): CompletableFuture<Void> {
            fun CompletableFuture<Optional<AccountNumberListPageAsync>>.forEach(
                action: (AccountNumber) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<AccountNumber>> {
            val values = mutableListOf<AccountNumber>()
            return forEach(values::add, executor).thenApply { values }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AccountNumberListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "AccountNumberListPageAsync{service=$service, params=$params, response=$response}"
}
