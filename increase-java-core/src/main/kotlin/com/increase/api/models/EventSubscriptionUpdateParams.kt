// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.apache.hc.core5.http.ContentType
import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import java.util.UUID
import com.increase.api.core.BaseDeserializer
import com.increase.api.core.BaseSerializer
import com.increase.api.core.getOrThrow
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.MultipartFormValue
import com.increase.api.core.toUnmodifiable
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.Enum
import com.increase.api.core.ContentTypes
import com.increase.api.errors.IncreaseInvalidDataException
import com.increase.api.models.*

class EventSubscriptionUpdateParams constructor(
  private val eventSubscriptionId: String,
  private val status: Status?,
  private val additionalQueryParams: Map<String, List<String>>,
  private val additionalHeaders: Map<String, List<String>>,
  private val additionalBodyProperties: Map<String, JsonValue>,

) {

    fun eventSubscriptionId(): String = eventSubscriptionId

    fun status(): Optional<Status> = Optional.ofNullable(status)

    @JvmSynthetic
    internal fun getBody(): EventSubscriptionUpdateBody {
      return EventSubscriptionUpdateBody(status, additionalBodyProperties)
    }

    @JvmSynthetic
    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic
    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
      return when (index) {
          0 -> eventSubscriptionId
          else -> ""
      }
    }

    @JsonDeserialize(builder = EventSubscriptionUpdateBody.Builder::class)
    @NoAutoDetect
    class EventSubscriptionUpdateBody internal constructor(private val status: Status?, private val additionalProperties: Map<String, JsonValue>, ) {

        private var hashCode: Int = 0

        /** The status to update the Event Subscription with. */
        @JsonProperty("status")
        fun status(): Status? = status

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is EventSubscriptionUpdateBody &&
              this.status == other.status &&
              this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
          if (hashCode == 0) {
            hashCode = Objects.hash(status, additionalProperties)
          }
          return hashCode
        }

        override fun toString() = "EventSubscriptionUpdateBody{status=$status, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic
            fun builder() = Builder()
        }

        class Builder {

            private var status: Status? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(eventSubscriptionUpdateBody: EventSubscriptionUpdateBody) = apply {
                this.status = eventSubscriptionUpdateBody.status
                additionalProperties(eventSubscriptionUpdateBody.additionalProperties)
            }

            /** The status to update the Event Subscription with. */
            @JsonProperty("status")
            fun status(status: Status) = apply {
                this.status = status
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): EventSubscriptionUpdateBody = EventSubscriptionUpdateBody(status, additionalProperties.toUnmodifiable())
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return other is EventSubscriptionUpdateParams &&
          this.eventSubscriptionId == other.eventSubscriptionId &&
          this.status == other.status &&
          this.additionalQueryParams == other.additionalQueryParams &&
          this.additionalHeaders == other.additionalHeaders &&
          this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
      return Objects.hash(
          eventSubscriptionId,
          status,
          additionalQueryParams,
          additionalHeaders,
          additionalBodyProperties,
      )
    }

    override fun toString() = "EventSubscriptionUpdateParams{eventSubscriptionId=$eventSubscriptionId, status=$status, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic
        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var eventSubscriptionId: String? = null
        private var status: Status? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(eventSubscriptionUpdateParams: EventSubscriptionUpdateParams) = apply {
            this.eventSubscriptionId = eventSubscriptionUpdateParams.eventSubscriptionId
            this.status = eventSubscriptionUpdateParams.status
            additionalQueryParams(eventSubscriptionUpdateParams.additionalQueryParams)
            additionalHeaders(eventSubscriptionUpdateParams.additionalHeaders)
            additionalBodyProperties(eventSubscriptionUpdateParams.additionalBodyProperties)
        }

        /** The identifier of the Event Subscription. */
        fun eventSubscriptionId(eventSubscriptionId: String) = apply {
            this.eventSubscriptionId = eventSubscriptionId
        }

        /** The status to update the Event Subscription with. */
        fun status(status: Status) = apply {
            this.status = status
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply {
            this.additionalHeaders.put(name, mutableListOf())
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun build(): EventSubscriptionUpdateParams = EventSubscriptionUpdateParams(
            checkNotNull(eventSubscriptionId) {
                "`eventSubscriptionId` is required but was not set"
            },
            status,
            additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            additionalBodyProperties.toUnmodifiable(),
        )
    }

    class Status @JsonCreator private constructor(private val value: JsonField<String>, ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue
        fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is Status &&
              this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val ACTIVE = Status(JsonField.of("active"))

            @JvmField val DISABLED = Status(JsonField.of("disabled"))

            @JvmField val DELETED = Status(JsonField.of("deleted"))

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            ACTIVE,
            DISABLED,
            DELETED,
        }

        enum class Value {
            ACTIVE,
            DISABLED,
            DELETED,
            _UNKNOWN,
        }

        fun value(): Value = when (this) {
            ACTIVE -> Value.ACTIVE
            DISABLED -> Value.DISABLED
            DELETED -> Value.DELETED
            else -> Value._UNKNOWN
        }

        fun known(): Known = when (this) {
            ACTIVE -> Known.ACTIVE
            DISABLED -> Known.DISABLED
            DELETED -> Known.DELETED
            else -> throw IncreaseInvalidDataException("Unknown Status: $value")
        }

        fun asString(): String = _value().asStringOrThrow()
    }
}
