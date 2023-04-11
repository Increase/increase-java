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
import java.time.LocalDate
import java.time.OffsetDateTime
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
import com.increase.api.core.toUnmodifiable
import com.increase.api.core.NoAutoDetect
import com.increase.api.errors.IncreaseInvalidDataException
import com.increase.api.models.*

class ExternalAccountUpdateParams constructor(private val externalAccountId: String,private val description: String?,private val status: Status?,private val additionalQueryParams: Map<String, List<String>>,private val additionalHeaders: Map<String, List<String>>,private val additionalBodyProperties: Map<String, JsonValue>,) {

    fun externalAccountId(): String = externalAccountId

    fun description(): Optional<String> = Optional.ofNullable(description)

    fun status(): Optional<Status> = Optional.ofNullable(status)

    @JvmSynthetic
    internal fun getBody(): ExternalAccountUpdateBody {
      return ExternalAccountUpdateBody(
          description,
          status,
          additionalBodyProperties,
      )
    }

    @JvmSynthetic
    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic
    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
      return when (index) {
          0 -> externalAccountId
          else -> ""
      }
    }

    @JsonDeserialize(builder = ExternalAccountUpdateBody.Builder::class)
    @NoAutoDetect
    class ExternalAccountUpdateBody internal constructor(private val description: String?,private val status: Status?,private val additionalProperties: Map<String, JsonValue>,) {

        private var hashCode: Int = 0

        /** The description you choose to give the external account. */
        @JsonProperty("description")
        fun description(): String? = description

        /** The status of the External Account. */
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

          return other is ExternalAccountUpdateBody &&
              this.description == other.description &&
              this.status == other.status &&
              this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
          if (hashCode == 0) {
            hashCode = Objects.hash(
                description,
                status,
                additionalProperties,
            )
          }
          return hashCode
        }

        override fun toString() = "ExternalAccountUpdateBody{description=$description, status=$status, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic
            fun builder() = Builder()
        }

        class Builder {

            private var description: String? = null
            private var status: Status? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(externalAccountUpdateBody: ExternalAccountUpdateBody) = apply {
                this.description = externalAccountUpdateBody.description
                this.status = externalAccountUpdateBody.status
                additionalProperties(externalAccountUpdateBody.additionalProperties)
            }

            /** The description you choose to give the external account. */
            @JsonProperty("description")
            fun description(description: String) = apply {
                this.description = description
            }

            /** The status of the External Account. */
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

            fun build(): ExternalAccountUpdateBody = ExternalAccountUpdateBody(
                description,
                status,
                additionalProperties.toUnmodifiable(),
            )
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return other is ExternalAccountUpdateParams &&
          this.externalAccountId == other.externalAccountId &&
          this.description == other.description &&
          this.status == other.status &&
          this.additionalQueryParams == other.additionalQueryParams &&
          this.additionalHeaders == other.additionalHeaders &&
          this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
      return Objects.hash(
          externalAccountId,
          description,
          status,
          additionalQueryParams,
          additionalHeaders,
          additionalBodyProperties,
      )
    }

    override fun toString() = "ExternalAccountUpdateParams{externalAccountId=$externalAccountId, description=$description, status=$status, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic
        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var externalAccountId: String? = null
        private var description: String? = null
        private var status: Status? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(externalAccountUpdateParams: ExternalAccountUpdateParams) = apply {
            this.externalAccountId = externalAccountUpdateParams.externalAccountId
            this.description = externalAccountUpdateParams.description
            this.status = externalAccountUpdateParams.status
            additionalQueryParams(externalAccountUpdateParams.additionalQueryParams)
            additionalHeaders(externalAccountUpdateParams.additionalHeaders)
            additionalBodyProperties(externalAccountUpdateParams.additionalBodyProperties)
        }

        /** The external account identifier. */
        fun externalAccountId(externalAccountId: String) = apply {
            this.externalAccountId = externalAccountId
        }

        /** The description you choose to give the external account. */
        fun description(description: String) = apply {
            this.description = description
        }

        /** The status of the External Account. */
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

        fun build(): ExternalAccountUpdateParams = ExternalAccountUpdateParams(
            checkNotNull(externalAccountId) {
                "`externalAccountId` is required but was not set"
            },
            description,
            status,
            additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            additionalBodyProperties.toUnmodifiable(),
        )
    }

    class Status @JsonCreator private constructor(private val value: JsonField<String>,) {

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

            @JvmField val ARCHIVED = Status(JsonField.of("archived"))

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            ACTIVE,
            ARCHIVED,
        }

        enum class Value {
            ACTIVE,
            ARCHIVED,
            _UNKNOWN,
        }

        fun value(): Value = when (this) {
            ACTIVE -> Value.ACTIVE
            ARCHIVED -> Value.ARCHIVED
            else -> Value._UNKNOWN
        }

        fun known(): Known = when (this) {
            ACTIVE -> Known.ACTIVE
            ARCHIVED -> Known.ARCHIVED
            else -> throw IncreaseInvalidDataException("Unknown Status: $value")
        }

        fun asString(): String = _value().asStringOrThrow()
    }
}
