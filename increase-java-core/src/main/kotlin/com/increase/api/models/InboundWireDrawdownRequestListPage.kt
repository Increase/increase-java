package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional
import java.util.Spliterator
import java.util.Spliterators
import java.util.UUID
import java.util.concurrent.CompletableFuture
import java.util.stream.Stream
import java.util.stream.StreamSupport
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.JsonField
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.toUnmodifiable
import com.increase.api.models.InboundWireDrawdownRequest
import com.increase.api.services.blocking.InboundWireDrawdownRequestService

class InboundWireDrawdownRequestListPage private constructor(private val inboundWireDrawdownRequestsService: InboundWireDrawdownRequestService,private val params: InboundWireDrawdownRequestListParams,private val response: Response,) {

    fun response(): Response = response

    fun data(): List<InboundWireDrawdownRequest> = response().data()

    fun nextCursor(): String = response().nextCursor()

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return other is InboundWireDrawdownRequestListPage &&
          this.inboundWireDrawdownRequestsService == other.inboundWireDrawdownRequestsService &&
          this.params == other.params &&
          this.response == other.response
    }

    override fun hashCode(): Int {
      return Objects.hash(
          inboundWireDrawdownRequestsService,
          params,
          response,
      )
    }

    override fun toString() = "InboundWireDrawdownRequestListPage{inboundWireDrawdownRequestsService=$inboundWireDrawdownRequestsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
      if (data().isEmpty()) {
        return false
      }

      return nextCursor().isNotEmpty()
    }

    fun getNextPageParams(): Optional<InboundWireDrawdownRequestListParams> {
      if (!hasNextPage()) {
        return Optional.empty()
      }

      return Optional.of(InboundWireDrawdownRequestListParams.builder().from(params).cursor(nextCursor()).build())
    }

    fun getNextPage(): Optional<InboundWireDrawdownRequestListPage> {
      return getNextPageParams().map { inboundWireDrawdownRequestsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(inboundWireDrawdownRequestsService: InboundWireDrawdownRequestService, params: InboundWireDrawdownRequestListParams, response: Response) = InboundWireDrawdownRequestListPage(
            inboundWireDrawdownRequestsService,
            params,
            response,
        )
    }

    @JsonDeserialize(builder = Response.Builder::class)
    @NoAutoDetect
    class Response constructor(private val data: JsonField<List<InboundWireDrawdownRequest>>,private val nextCursor: JsonField<String>,private val additionalProperties: Map<String, JsonValue>,) {

        private var validated: Boolean = false

        fun data(): List<InboundWireDrawdownRequest> = data.getRequired("data")

        fun nextCursor(): String = nextCursor.getRequired("next_cursor")

        @JsonProperty("data")
        fun _data(): Optional<JsonField<List<InboundWireDrawdownRequest>>> = Optional.ofNullable(data)

        @JsonProperty("next_cursor")
        fun _nextCursor(): Optional<JsonField<String>> = Optional.ofNullable(nextCursor)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate() = apply {
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

        override fun toString() = "InboundWireDrawdownRequestListPage.Response{data=$data, nextCursor=$nextCursor, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic
            fun builder() = Builder()
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

            @JsonProperty("data")
            fun data(data: JsonField<List<InboundWireDrawdownRequest>>) = apply { this.data = data }

            fun nextCursor(nextCursor: String) = nextCursor(JsonField.of(nextCursor))

            @JsonProperty("next_cursor")
            fun nextCursor(nextCursor: JsonField<String>) = apply { this.nextCursor = nextCursor }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun build() = Response(
                data,
                nextCursor,
                additionalProperties.toUnmodifiable(),
            )
        }
    }

    class AutoPager constructor(private val firstPage: InboundWireDrawdownRequestListPage,) : Iterable<InboundWireDrawdownRequest> {

        override fun iterator(): Iterator<InboundWireDrawdownRequest> = sequence {
            var page = firstPage
            var index = 0
            while (true) {
              while (index >= page.data().size) {
                page = page.getNextPage().orElse(null) ?: return@sequence
                index = 0
              }
              yield(page.data()[index++])
            }
        }
        .iterator()

        fun stream(): Stream<InboundWireDrawdownRequest> {
          return StreamSupport.stream(spliterator(), false)
        }
    }
}
