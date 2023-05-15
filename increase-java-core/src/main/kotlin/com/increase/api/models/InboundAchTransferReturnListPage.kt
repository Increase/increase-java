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
import com.increase.api.services.blocking.InboundAchTransferReturnService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport

class InboundAchTransferReturnListPage
private constructor(
    private val inboundAchTransferReturnsService: InboundAchTransferReturnService,
    private val params: InboundAchTransferReturnListParams,
    private val response: Response,
) {

    fun response(): Response = response

    fun data(): List<InboundAchTransferReturn> = response().data()

    fun nextCursor(): String = response().nextCursor()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InboundAchTransferReturnListPage &&
            this.inboundAchTransferReturnsService == other.inboundAchTransferReturnsService &&
            this.params == other.params &&
            this.response == other.response
    }

    override fun hashCode(): Int {
        return Objects.hash(
            inboundAchTransferReturnsService,
            params,
            response,
        )
    }

    override fun toString() =
        "InboundAchTransferReturnListPage{inboundAchTransferReturnsService=$inboundAchTransferReturnsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
        if (data().isEmpty()) {
            return false
        }

        return nextCursor().isNotEmpty()
    }

    fun getNextPageParams(): Optional<InboundAchTransferReturnListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            InboundAchTransferReturnListParams.builder().from(params).cursor(nextCursor()).build()
        )
    }

    fun getNextPage(): Optional<InboundAchTransferReturnListPage> {
        return getNextPageParams().map { inboundAchTransferReturnsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            inboundAchTransferReturnsService: InboundAchTransferReturnService,
            params: InboundAchTransferReturnListParams,
            response: Response
        ) =
            InboundAchTransferReturnListPage(
                inboundAchTransferReturnsService,
                params,
                response,
            )
    }

    @JsonDeserialize(builder = Response.Builder::class)
    @NoAutoDetect
    class Response
    constructor(
        private val data: JsonField<List<InboundAchTransferReturn>>,
        private val nextCursor: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun data(): List<InboundAchTransferReturn> = data.getRequired("data")

        fun nextCursor(): String = nextCursor.getRequired("next_cursor")

        @JsonProperty("data")
        fun _data(): Optional<JsonField<List<InboundAchTransferReturn>>> = Optional.ofNullable(data)

        @JsonProperty("next_cursor")
        fun _nextCursor(): Optional<JsonField<String>> = Optional.ofNullable(nextCursor)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Response = apply {
            if (!validated) {
                data().forEach { it.validate() }
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
            "InboundAchTransferReturnListPage.Response{data=$data, nextCursor=$nextCursor, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var data: JsonField<List<InboundAchTransferReturn>> = JsonMissing.of()
            private var nextCursor: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(page: Response) = apply {
                this.data = page.data
                this.nextCursor = page.nextCursor
                this.additionalProperties.putAll(page.additionalProperties)
            }

            fun data(data: List<InboundAchTransferReturn>) = data(JsonField.of(data))

            @JsonProperty("data")
            fun data(data: JsonField<List<InboundAchTransferReturn>>) = apply { this.data = data }

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
        private val firstPage: InboundAchTransferReturnListPage,
    ) : Iterable<InboundAchTransferReturn> {

        override fun iterator(): Iterator<InboundAchTransferReturn> = iterator {
            var page = firstPage
            var index = 0
            while (true) {
                while (index < page.data().size) {
                    yield(page.data()[index++])
                }
                page = page.getNextPage().orElse(null) ?: break
                index = 0
            }
        }

        fun stream(): Stream<InboundAchTransferReturn> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
