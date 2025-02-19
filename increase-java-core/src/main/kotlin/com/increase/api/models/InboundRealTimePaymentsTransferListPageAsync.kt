// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.immutableEmptyMap
import com.increase.api.core.toImmutable
import com.increase.api.services.async.InboundRealTimePaymentsTransferServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate

/** List Inbound Real-Time Payments Transfers */
class InboundRealTimePaymentsTransferListPageAsync
private constructor(
    private val inboundRealTimePaymentsTransfersService:
        InboundRealTimePaymentsTransferServiceAsync,
    private val params: InboundRealTimePaymentsTransferListParams,
    private val response: Response,
) {

    fun response(): Response = response

    fun data(): List<InboundRealTimePaymentsTransfer> = response().data()

    fun nextCursor(): Optional<String> = response().nextCursor()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is InboundRealTimePaymentsTransferListPageAsync && inboundRealTimePaymentsTransfersService == other.inboundRealTimePaymentsTransfersService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(inboundRealTimePaymentsTransfersService, params, response) /* spotless:on */

    override fun toString() =
        "InboundRealTimePaymentsTransferListPageAsync{inboundRealTimePaymentsTransfersService=$inboundRealTimePaymentsTransfersService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
        if (data().isEmpty()) {
            return false
        }

        return nextCursor().isPresent
    }

    fun getNextPageParams(): Optional<InboundRealTimePaymentsTransferListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            InboundRealTimePaymentsTransferListParams.builder()
                .from(params)
                .apply { nextCursor().ifPresent { this.cursor(it) } }
                .build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<InboundRealTimePaymentsTransferListPageAsync>> {
        return getNextPageParams()
            .map { inboundRealTimePaymentsTransfersService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            inboundRealTimePaymentsTransfersService: InboundRealTimePaymentsTransferServiceAsync,
            params: InboundRealTimePaymentsTransferListParams,
            response: Response,
        ) =
            InboundRealTimePaymentsTransferListPageAsync(
                inboundRealTimePaymentsTransfersService,
                params,
                response,
            )
    }

    @NoAutoDetect
    class Response
    @JsonCreator
    constructor(
        @JsonProperty("data")
        private val data: JsonField<List<InboundRealTimePaymentsTransfer>> = JsonMissing.of(),
        @JsonProperty("next_cursor") private val nextCursor: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun data(): List<InboundRealTimePaymentsTransfer> = data.getNullable("data") ?: listOf()

        fun nextCursor(): Optional<String> =
            Optional.ofNullable(nextCursor.getNullable("next_cursor"))

        @JsonProperty("data")
        fun _data(): Optional<JsonField<List<InboundRealTimePaymentsTransfer>>> =
            Optional.ofNullable(data)

        @JsonProperty("next_cursor")
        fun _nextCursor(): Optional<JsonField<String>> = Optional.ofNullable(nextCursor)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Response = apply {
            if (validated) {
                return@apply
            }

            data().map { it.validate() }
            nextCursor()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Response && data == other.data && nextCursor == other.nextCursor && additionalProperties == other.additionalProperties /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(data, nextCursor, additionalProperties) /* spotless:on */

        override fun toString() =
            "Response{data=$data, nextCursor=$nextCursor, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var data: JsonField<List<InboundRealTimePaymentsTransfer>> = JsonMissing.of()
            private var nextCursor: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(page: Response) = apply {
                this.data = page.data
                this.nextCursor = page.nextCursor
                this.additionalProperties.putAll(page.additionalProperties)
            }

            fun data(data: List<InboundRealTimePaymentsTransfer>) = data(JsonField.of(data))

            fun data(data: JsonField<List<InboundRealTimePaymentsTransfer>>) = apply {
                this.data = data
            }

            fun nextCursor(nextCursor: String) = nextCursor(JsonField.of(nextCursor))

            fun nextCursor(nextCursor: JsonField<String>) = apply { this.nextCursor = nextCursor }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun build() = Response(data, nextCursor, additionalProperties.toImmutable())
        }
    }

    class AutoPager(private val firstPage: InboundRealTimePaymentsTransferListPageAsync) {

        fun forEach(
            action: Predicate<InboundRealTimePaymentsTransfer>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<InboundRealTimePaymentsTransferListPageAsync>>.forEach(
                action: (InboundRealTimePaymentsTransfer) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<InboundRealTimePaymentsTransfer>> {
            val values = mutableListOf<InboundRealTimePaymentsTransfer>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
