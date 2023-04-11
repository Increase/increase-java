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
import com.increase.api.models.Document
import com.increase.api.services.blocking.DocumentService

class DocumentListPage private constructor(private val documentsService: DocumentService,private val params: DocumentListParams,private val response: Response,) {

    fun response(): Response = response

    fun data(): List<Document> = response().data()

    fun nextCursor(): String = response().nextCursor()

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return other is DocumentListPage &&
          this.documentsService == other.documentsService &&
          this.params == other.params &&
          this.response == other.response
    }

    override fun hashCode(): Int {
      return Objects.hash(
          documentsService,
          params,
          response,
      )
    }

    override fun toString() = "DocumentListPage{documentsService=$documentsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
      if (data().isEmpty()) {
        return false
      }

      return nextCursor().isNotEmpty()
    }

    fun getNextPageParams(): Optional<DocumentListParams> {
      if (!hasNextPage()) {
        return Optional.empty()
      }

      return Optional.of(DocumentListParams.builder().from(params).cursor(nextCursor()).build())
    }

    fun getNextPage(): Optional<DocumentListPage> {
      return getNextPageParams().map { documentsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(documentsService: DocumentService, params: DocumentListParams, response: Response) = DocumentListPage(
            documentsService,
            params,
            response,
        )
    }

    @JsonDeserialize(builder = Response.Builder::class)
    @NoAutoDetect
    class Response constructor(private val data: JsonField<List<Document>>,private val nextCursor: JsonField<String>,private val additionalProperties: Map<String, JsonValue>,) {

        private var validated: Boolean = false

        fun data(): List<Document> = data.getRequired("data")

        fun nextCursor(): String = nextCursor.getRequired("next_cursor")

        @JsonProperty("data")
        fun _data(): Optional<JsonField<List<Document>>> = Optional.ofNullable(data)

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

        override fun toString() = "DocumentListPage.Response{data=$data, nextCursor=$nextCursor, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic
            fun builder() = Builder()
        }

        class Builder {

            private var data: JsonField<List<Document>> = JsonMissing.of()
            private var nextCursor: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(page: Response) = apply {
                this.data = page.data
                this.nextCursor = page.nextCursor
                this.additionalProperties.putAll(page.additionalProperties)
            }

            fun data(data: List<Document>) = data(JsonField.of(data))

            @JsonProperty("data")
            fun data(data: JsonField<List<Document>>) = apply { this.data = data }

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

    class AutoPager constructor(private val firstPage: DocumentListPage,) : Iterable<Document> {

        override fun iterator(): Iterator<Document> = sequence {
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

        fun stream(): Stream<Document> {
          return StreamSupport.stream(spliterator(), false)
        }
    }
}
