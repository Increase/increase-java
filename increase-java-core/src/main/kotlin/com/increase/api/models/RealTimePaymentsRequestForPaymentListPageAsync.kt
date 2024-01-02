// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.toUnmodifiable
import com.increase.api.services.async.RealTimePaymentsRequestForPaymentServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate

class RealTimePaymentsRequestForPaymentListPageAsync
private constructor(
    private val realTimePaymentsRequestForPaymentsService:
        RealTimePaymentsRequestForPaymentServiceAsync,
    private val params: RealTimePaymentsRequestForPaymentListParams,
    private val response: Response,
) {

    fun response(): Response = response

    fun data(): List<RealTimePaymentsRequestForPayment> = response().data()

    fun nextCursor(): Optional<String> = response().nextCursor()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RealTimePaymentsRequestForPaymentListPageAsync &&
            this.realTimePaymentsRequestForPaymentsService ==
                other.realTimePaymentsRequestForPaymentsService &&
            this.params == other.params &&
            this.response == other.response
    }

    override fun hashCode(): Int {
        return Objects.hash(
            realTimePaymentsRequestForPaymentsService,
            params,
            response,
        )
    }

    override fun toString() =
        "RealTimePaymentsRequestForPaymentListPageAsync{realTimePaymentsRequestForPaymentsService=$realTimePaymentsRequestForPaymentsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
        if (data().isEmpty()) {
            return false
        }

        return nextCursor().isPresent()
    }

    fun getNextPageParams(): Optional<RealTimePaymentsRequestForPaymentListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            RealTimePaymentsRequestForPaymentListParams.builder()
                .from(params)
                .apply { nextCursor().ifPresent { this.cursor(it) } }
                .build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<RealTimePaymentsRequestForPaymentListPageAsync>> {
        return getNextPageParams()
            .map {
                realTimePaymentsRequestForPaymentsService.list(it).thenApply { Optional.of(it) }
            }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            realTimePaymentsRequestForPaymentsService:
                RealTimePaymentsRequestForPaymentServiceAsync,
            params: RealTimePaymentsRequestForPaymentListParams,
            response: Response
        ) =
            RealTimePaymentsRequestForPaymentListPageAsync(
                realTimePaymentsRequestForPaymentsService,
                params,
                response,
            )
    }

    @JsonDeserialize(builder = Response.Builder::class)
    @NoAutoDetect
    class Response
    constructor(
        private val data: JsonField<List<RealTimePaymentsRequestForPayment>>,
        private val nextCursor: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun data(): List<RealTimePaymentsRequestForPayment> = data.getNullable("data") ?: listOf()

        fun nextCursor(): Optional<String> =
            Optional.ofNullable(nextCursor.getNullable("next_cursor"))

        @JsonProperty("data")
        fun _data(): Optional<JsonField<List<RealTimePaymentsRequestForPayment>>> =
            Optional.ofNullable(data)

        @JsonProperty("next_cursor")
        fun _nextCursor(): Optional<JsonField<String>> = Optional.ofNullable(nextCursor)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Response = apply {
            if (!validated) {
                data().map { it.validate() }
                nextCursor()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Response &&
                this.data == other.data &&
                this.nextCursor == other.nextCursor &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            return Objects.hash(
                data,
                nextCursor,
                additionalProperties,
            )
        }

        override fun toString() =
            "RealTimePaymentsRequestForPaymentListPageAsync.Response{data=$data, nextCursor=$nextCursor, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var data: JsonField<List<RealTimePaymentsRequestForPayment>> = JsonMissing.of()
            private var nextCursor: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(page: Response) = apply {
                this.data = page.data
                this.nextCursor = page.nextCursor
                this.additionalProperties.putAll(page.additionalProperties)
            }

            fun data(data: List<RealTimePaymentsRequestForPayment>) = data(JsonField.of(data))

            @JsonProperty("data")
            fun data(data: JsonField<List<RealTimePaymentsRequestForPayment>>) = apply {
                this.data = data
            }

            fun nextCursor(nextCursor: String) = nextCursor(JsonField.of(nextCursor))

            @JsonProperty("next_cursor")
            fun nextCursor(nextCursor: JsonField<String>) = apply { this.nextCursor = nextCursor }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun build() =
                Response(
                    data,
                    nextCursor,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    class AutoPager
    constructor(
        private val firstPage: RealTimePaymentsRequestForPaymentListPageAsync,
    ) {

        fun forEach(
            action: Predicate<RealTimePaymentsRequestForPayment>,
            executor: Executor
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<RealTimePaymentsRequestForPaymentListPageAsync>>.forEach(
                action: (RealTimePaymentsRequestForPayment) -> Boolean,
                executor: Executor
            ): CompletableFuture<Void> =
                thenComposeAsync(
                    { page ->
                        page
                            .filter { it.data().all(action) }
                            .map { it.getNextPage().forEach(action, executor) }
                            .orElseGet { CompletableFuture.completedFuture(null) }
                    },
                    executor
                )
            return CompletableFuture.completedFuture(Optional.of(firstPage))
                .forEach(action::test, executor)
        }

        fun toList(executor: Executor): CompletableFuture<List<RealTimePaymentsRequestForPayment>> {
            val values = mutableListOf<RealTimePaymentsRequestForPayment>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
