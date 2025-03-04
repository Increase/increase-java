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
import com.increase.api.services.async.InboundWireDrawdownRequestServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate

/** List Inbound Wire Drawdown Requests */
class InboundWireDrawdownRequestListPageAsync
private constructor(
    private val inboundWireDrawdownRequestsService: InboundWireDrawdownRequestServiceAsync,
    private val params: InboundWireDrawdownRequestListParams,
    private val response: Response,
) {

    fun response(): Response = response

    fun data(): List<InboundWireDrawdownRequest> = response().data()

    fun nextCursor(): Optional<String> = response().nextCursor()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is InboundWireDrawdownRequestListPageAsync && inboundWireDrawdownRequestsService == other.inboundWireDrawdownRequestsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(inboundWireDrawdownRequestsService, params, response) /* spotless:on */

    override fun toString() =
        "InboundWireDrawdownRequestListPageAsync{inboundWireDrawdownRequestsService=$inboundWireDrawdownRequestsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
        if (data().isEmpty()) {
            return false
        }

        return nextCursor().isPresent
    }

    fun getNextPageParams(): Optional<InboundWireDrawdownRequestListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            InboundWireDrawdownRequestListParams.builder()
                .from(params)
                .apply { nextCursor().ifPresent { this.cursor(it) } }
                .build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<InboundWireDrawdownRequestListPageAsync>> {
        return getNextPageParams()
            .map { inboundWireDrawdownRequestsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            inboundWireDrawdownRequestsService: InboundWireDrawdownRequestServiceAsync,
            params: InboundWireDrawdownRequestListParams,
            response: Response,
        ) =
            InboundWireDrawdownRequestListPageAsync(
                inboundWireDrawdownRequestsService,
                params,
                response,
            )
    }

    @NoAutoDetect
    class Response
    @JsonCreator
    constructor(
        @JsonProperty("data")
        private val data: JsonField<List<InboundWireDrawdownRequest>> = JsonMissing.of(),
        @JsonProperty("next_cursor") private val nextCursor: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun data(): List<InboundWireDrawdownRequest> = data.getNullable("data") ?: listOf()

        fun nextCursor(): Optional<String> =
            Optional.ofNullable(nextCursor.getNullable("next_cursor"))

        @JsonProperty("data")
        fun _data(): Optional<JsonField<List<InboundWireDrawdownRequest>>> =
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

            /**
             * Returns a mutable builder for constructing an instance of
             * [InboundWireDrawdownRequestListPageAsync].
             */
            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var data: JsonField<List<InboundWireDrawdownRequest>> = JsonMissing.of()
            private var nextCursor: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(page: Response) = apply {
                this.data = page.data
                this.nextCursor = page.nextCursor
                this.additionalProperties.putAll(page.additionalProperties)
            }

            fun data(data: List<InboundWireDrawdownRequest>) = data(JsonField.of(data))

            fun data(data: JsonField<List<InboundWireDrawdownRequest>>) = apply { this.data = data }

            fun nextCursor(nextCursor: String) = nextCursor(JsonField.of(nextCursor))

            fun nextCursor(nextCursor: JsonField<String>) = apply { this.nextCursor = nextCursor }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun build() = Response(data, nextCursor, additionalProperties.toImmutable())
        }
    }

    class AutoPager(private val firstPage: InboundWireDrawdownRequestListPageAsync) {

        fun forEach(
            action: Predicate<InboundWireDrawdownRequest>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<InboundWireDrawdownRequestListPageAsync>>.forEach(
                action: (InboundWireDrawdownRequest) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<InboundWireDrawdownRequest>> {
            val values = mutableListOf<InboundWireDrawdownRequest>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
