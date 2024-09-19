// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import java.util.Spliterator
import java.util.Spliterators
import java.util.UUID
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.JsonField
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.toUnmodifiable
import com.increase.api.models.ProofOfAuthorizationRequest
import com.increase.api.services.async.ProofOfAuthorizationRequestServiceAsync

class ProofOfAuthorizationRequestListPageAsync private constructor(private val proofOfAuthorizationRequestsService: ProofOfAuthorizationRequestServiceAsync, private val params: ProofOfAuthorizationRequestListParams, private val response: Response, ) {

    fun response(): Response = response

    fun data(): List<ProofOfAuthorizationRequest> = response().data()

    fun nextCursor(): Optional<String> = response().nextCursor()

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return other is ProofOfAuthorizationRequestListPageAsync &&
          this.proofOfAuthorizationRequestsService == other.proofOfAuthorizationRequestsService &&
          this.params == other.params &&
          this.response == other.response
    }

    override fun hashCode(): Int {
      return Objects.hash(
          proofOfAuthorizationRequestsService,
          params,
          response,
      )
    }

    override fun toString() = "ProofOfAuthorizationRequestListPageAsync{proofOfAuthorizationRequestsService=$proofOfAuthorizationRequestsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
      if (data().isEmpty()) {
        return false;
      }

      return nextCursor().isPresent
    }

    fun getNextPageParams(): Optional<ProofOfAuthorizationRequestListParams> {
      if (!hasNextPage()) {
        return Optional.empty()
      }

      return Optional.of(ProofOfAuthorizationRequestListParams.builder().from(params).apply {nextCursor().ifPresent{ this.cursor(it) } }.build())
    }

    fun getNextPage(): CompletableFuture<Optional<ProofOfAuthorizationRequestListPageAsync>> {
      return getNextPageParams().map {
        proofOfAuthorizationRequestsService.list(it).thenApply { Optional.of(it) }
      }.orElseGet {
          CompletableFuture.completedFuture(Optional.empty())
      }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(proofOfAuthorizationRequestsService: ProofOfAuthorizationRequestServiceAsync, params: ProofOfAuthorizationRequestListParams, response: Response) = ProofOfAuthorizationRequestListPageAsync(
            proofOfAuthorizationRequestsService,
            params,
            response,
        )
    }

    @JsonDeserialize(builder = Response.Builder::class)
    @NoAutoDetect
    class Response constructor(private val data: JsonField<List<ProofOfAuthorizationRequest>>, private val nextCursor: JsonField<String>, private val additionalProperties: Map<String, JsonValue>, ) {

        private var validated: Boolean = false

        fun data(): List<ProofOfAuthorizationRequest> = data.getNullable("data") ?: listOf()

        fun nextCursor(): Optional<String> = Optional.ofNullable(nextCursor.getNullable("next_cursor"))

        @JsonProperty("data")
        fun _data(): Optional<JsonField<List<ProofOfAuthorizationRequest>>> = Optional.ofNullable(data)

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

        override fun toString() = "ProofOfAuthorizationRequestListPageAsync.Response{data=$data, nextCursor=$nextCursor, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic
            fun builder() = Builder()
        }

        class Builder {

            private var data: JsonField<List<ProofOfAuthorizationRequest>> = JsonMissing.of()
            private var nextCursor: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(page: Response) = apply {
                this.data = page.data
                this.nextCursor = page.nextCursor
                this.additionalProperties.putAll(page.additionalProperties)
            }

            fun data(data: List<ProofOfAuthorizationRequest>) = data(JsonField.of(data))

            @JsonProperty("data")
            fun data(data: JsonField<List<ProofOfAuthorizationRequest>>) = apply { this.data = data }

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

    class AutoPager constructor(private val firstPage: ProofOfAuthorizationRequestListPageAsync, ) {

        fun forEach(action: Predicate<ProofOfAuthorizationRequest>, executor: Executor): CompletableFuture<Void> {
          fun CompletableFuture<Optional<ProofOfAuthorizationRequestListPageAsync>>.forEach(action: (ProofOfAuthorizationRequest) -> Boolean, executor: Executor): CompletableFuture<Void> = thenComposeAsync({ page -> 
              page
              .filter {
                  it.data().all(action)
              }
              .map {
                  it.getNextPage().forEach(action, executor)
              }
              .orElseGet {
                  CompletableFuture.completedFuture(null)
              }
          }, executor)
          return CompletableFuture.completedFuture(Optional.of(firstPage))
          .forEach(action::test, executor)
        }

        fun toList(executor: Executor): CompletableFuture<List<ProofOfAuthorizationRequest>> {
          val values = mutableListOf<ProofOfAuthorizationRequest>()
          return forEach(values::add, executor)
          .thenApply {
              values
          }
        }
    }
}
