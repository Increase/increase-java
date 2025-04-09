// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.accounttransfers

import com.increase.api.core.checkRequired
import com.increase.api.services.async.AccountTransferServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** @see [AccountTransferServiceAsync.list] */
class AccountTransferListPageAsync
private constructor(
    private val service: AccountTransferServiceAsync,
    private val params: AccountTransferListParams,
    private val response: AccountTransferListPageResponse,
) {

    /**
     * Delegates to [AccountTransferListPageResponse], but gracefully handles missing data.
     *
     * @see [AccountTransferListPageResponse.data]
     */
    fun data(): List<AccountTransfer> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [AccountTransferListPageResponse], but gracefully handles missing data.
     *
     * @see [AccountTransferListPageResponse.nextCursor]
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor().isPresent

    fun getNextPageParams(): Optional<AccountTransferListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextCursor().ifPresent { cursor(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<AccountTransferListPageAsync>> =
        getNextPageParams()
            .map { service.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): AccountTransferListParams = params

    /** The response that this page was parsed from. */
    fun response(): AccountTransferListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AccountTransferListPageAsync].
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

    /** A builder for [AccountTransferListPageAsync]. */
    class Builder internal constructor() {

        private var service: AccountTransferServiceAsync? = null
        private var params: AccountTransferListParams? = null
        private var response: AccountTransferListPageResponse? = null

        @JvmSynthetic
        internal fun from(accountTransferListPageAsync: AccountTransferListPageAsync) = apply {
            service = accountTransferListPageAsync.service
            params = accountTransferListPageAsync.params
            response = accountTransferListPageAsync.response
        }

        fun service(service: AccountTransferServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: AccountTransferListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AccountTransferListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [AccountTransferListPageAsync].
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
        fun build(): AccountTransferListPageAsync =
            AccountTransferListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: AccountTransferListPageAsync) {

        fun forEach(
            action: Predicate<AccountTransfer>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<AccountTransferListPageAsync>>.forEach(
                action: (AccountTransfer) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<AccountTransfer>> {
            val values = mutableListOf<AccountTransfer>()
            return forEach(values::add, executor).thenApply { values }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AccountTransferListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "AccountTransferListPageAsync{service=$service, params=$params, response=$response}"
}
