// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.physicalcardprofiles

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
import com.increase.api.services.blocking.PhysicalCardProfileService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** List Physical Card Profiles */
class PhysicalCardProfileListPage private constructor(
    private val physicalCardProfilesService: PhysicalCardProfileService,
    private val params: PhysicalCardProfileListParams,
    private val response: Response,

) {

    fun response(): Response = response

    fun data(): List<PhysicalCardProfile> = response().data()

    fun nextCursor(): Optional<String> = response().nextCursor()

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return /* spotless:off */ other is PhysicalCardProfileListPage && physicalCardProfilesService == other.physicalCardProfilesService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(physicalCardProfilesService, params, response) /* spotless:on */

    override fun toString() = "PhysicalCardProfileListPage{physicalCardProfilesService=$physicalCardProfilesService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
      if (data().isEmpty()) {
        return false;
      }

      return nextCursor().isPresent
    }

    fun getNextPageParams(): Optional<PhysicalCardProfileListParams> {
      if (!hasNextPage()) {
        return Optional.empty()
      }

      return Optional.of(PhysicalCardProfileListParams.builder().from(params).apply {nextCursor().ifPresent{ this.cursor(it) } }.build())
    }

    fun getNextPage(): Optional<PhysicalCardProfileListPage> {
      return getNextPageParams().map { physicalCardProfilesService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(physicalCardProfilesService: PhysicalCardProfileService, params: PhysicalCardProfileListParams, response: Response) =
            PhysicalCardProfileListPage(
              physicalCardProfilesService,
              params,
              response,
            )
    }

    @NoAutoDetect
    class Response @JsonCreator constructor(
        @JsonProperty("data") private val data: JsonField<List<PhysicalCardProfile>> = JsonMissing.of(),
        @JsonProperty("next_cursor") private val nextCursor: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),

    ) {

        fun data(): List<PhysicalCardProfile> = data.getNullable("data") ?: listOf()

        fun nextCursor(): Optional<String> = Optional.ofNullable(nextCursor.getNullable("next_cursor"))

        @JsonProperty("data")
        fun _data(): Optional<JsonField<List<PhysicalCardProfile>>> = Optional.ofNullable(data)

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
             * [PhysicalCardProfileListPage].
             */
            @JvmStatic
            fun builder() = Builder()
        }

        class Builder {

            private var data: JsonField<List<PhysicalCardProfile>> = JsonMissing.of()
            private var nextCursor: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(page: Response) =
                apply {
                    this.data = page.data
                    this.nextCursor = page.nextCursor
                    this.additionalProperties.putAll(page.additionalProperties)
                }

            fun data(data: List<PhysicalCardProfile>) = data(JsonField.of(data))

            fun data(data: JsonField<List<PhysicalCardProfile>>) = apply { this.data = data }

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
        private val firstPage: PhysicalCardProfileListPage,

    ) : Iterable<PhysicalCardProfile> {

        override fun iterator(): Iterator<PhysicalCardProfile> =
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

        fun stream(): Stream<PhysicalCardProfile> {
          return StreamSupport.stream(spliterator(), false)
        }
    }
}
