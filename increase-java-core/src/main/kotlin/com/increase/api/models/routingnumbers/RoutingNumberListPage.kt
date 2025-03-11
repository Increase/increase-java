// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.routingnumbers

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
import com.increase.api.services.blocking.RoutingNumberService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/**
 * You can use this API to confirm if a routing number is valid, such as when a
 * user is providing you with bank account details. Since routing numbers uniquely
 * identify a bank, this will always return 0 or 1 entry. In Sandbox, the only
 * valid routing number for this method is 110000000.
 */
class RoutingNumberListPage private constructor(
    private val routingNumbersService: RoutingNumberService,
    private val params: RoutingNumberListParams,
    private val response: Response,

) {

    fun response(): Response = response

    fun data(): List<RoutingNumberListResponse> = response().data()

    fun nextCursor(): Optional<String> = response().nextCursor()

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return /* spotless:off */ other is RoutingNumberListPage && routingNumbersService == other.routingNumbersService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(routingNumbersService, params, response) /* spotless:on */

    override fun toString() = "RoutingNumberListPage{routingNumbersService=$routingNumbersService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
      if (data().isEmpty()) {
        return false;
      }

      return nextCursor().isPresent
    }

    fun getNextPageParams(): Optional<RoutingNumberListParams> {
      if (!hasNextPage()) {
        return Optional.empty()
      }

      return Optional.of(RoutingNumberListParams.builder().from(params).apply {nextCursor().ifPresent{ this.cursor(it) } }.build())
    }

    fun getNextPage(): Optional<RoutingNumberListPage> {
      return getNextPageParams().map { routingNumbersService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(routingNumbersService: RoutingNumberService, params: RoutingNumberListParams, response: Response) =
            RoutingNumberListPage(
              routingNumbersService,
              params,
              response,
            )
    }

    @NoAutoDetect
    class Response @JsonCreator constructor(
        @JsonProperty("data") private val data: JsonField<List<RoutingNumberListResponse>> = JsonMissing.of(),
        @JsonProperty("next_cursor") private val nextCursor: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),

    ) {

        fun data(): List<RoutingNumberListResponse> = data.getNullable("data") ?: listOf()

        fun nextCursor(): Optional<String> = Optional.ofNullable(nextCursor.getNullable("next_cursor"))

        @JsonProperty("data")
        fun _data(): Optional<JsonField<List<RoutingNumberListResponse>>> = Optional.ofNullable(data)

        @JsonProperty("next_cursor")
        fun _nextCursor(): Optional<JsonField<String>> = Optional.ofNullable(nextCursor)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Response =
            apply {
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

        override fun toString() = "Response{data=$data, nextCursor=$nextCursor, additionalProperties=$additionalProperties}"

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of
             * [RoutingNumberListPage].
             */
            @JvmStatic
            fun builder() = Builder()
        }

        class Builder {

            private var data: JsonField<List<RoutingNumberListResponse>> = JsonMissing.of()
            private var nextCursor: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(page: Response) =
                apply {
                    this.data = page.data
                    this.nextCursor = page.nextCursor
                    this.additionalProperties.putAll(page.additionalProperties)
                }

            fun data(data: List<RoutingNumberListResponse>) = data(JsonField.of(data))

            fun data(data: JsonField<List<RoutingNumberListResponse>>) = apply { this.data = data }

            fun nextCursor(nextCursor: String) = nextCursor(JsonField.of(nextCursor))

            fun nextCursor(nextCursor: JsonField<String>) = apply { this.nextCursor = nextCursor }

            fun putAdditionalProperty(key: String, value: JsonValue) =
                apply {
                    this.additionalProperties.put(key, value)
                }

            fun build() =
                Response(
                  data,
                  nextCursor,
                  additionalProperties.toImmutable(),
                )
        }
    }

    class AutoPager(
        private val firstPage: RoutingNumberListPage,

    ) : Iterable<RoutingNumberListResponse> {

        override fun iterator(): Iterator<RoutingNumberListResponse> =
            iterator {
                var page = firstPage
                var index = 0
                while (true) {
                  while (index < page.data().size) {
                    yield(page.data()[index++])
                  }
                  page = page.getNextPage().getOrNull() ?: break
                  index = 0
                }
            }

        fun stream(): Stream<RoutingNumberListResponse> {
          return StreamSupport.stream(spliterator(), false)
        }
    }
}
