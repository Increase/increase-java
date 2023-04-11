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

class ExternalAccountCreateParams constructor(private val routingNumber: String,private val accountNumber: String,private val funding: Funding?,private val description: String,private val additionalQueryParams: Map<String, List<String>>,private val additionalHeaders: Map<String, List<String>>,private val additionalBodyProperties: Map<String, JsonValue>,) {

    fun routingNumber(): String = routingNumber

    fun accountNumber(): String = accountNumber

    fun funding(): Optional<Funding> = Optional.ofNullable(funding)

    fun description(): String = description

    @JvmSynthetic
    internal fun getBody(): ExternalAccountCreateBody {
      return ExternalAccountCreateBody(
          routingNumber,
          accountNumber,
          funding,
          description,
          additionalBodyProperties,
      )
    }

    @JvmSynthetic
    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic
    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = ExternalAccountCreateBody.Builder::class)
    @NoAutoDetect
    class ExternalAccountCreateBody internal constructor(private val routingNumber: String?,private val accountNumber: String?,private val funding: Funding?,private val description: String?,private val additionalProperties: Map<String, JsonValue>,) {

        private var hashCode: Int = 0

        /**
         * The American Bankers' Association (ABA) Routing Transit Number (RTN) for the
         * destination account.
         */
        @JsonProperty("routing_number")
        fun routingNumber(): String? = routingNumber

        /** The account number for the destination account. */
        @JsonProperty("account_number")
        fun accountNumber(): String? = accountNumber

        /** The type of the destination account. Defaults to `checking`. */
        @JsonProperty("funding")
        fun funding(): Funding? = funding

        /** The name you choose for the Account. */
        @JsonProperty("description")
        fun description(): String? = description

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is ExternalAccountCreateBody &&
              this.routingNumber == other.routingNumber &&
              this.accountNumber == other.accountNumber &&
              this.funding == other.funding &&
              this.description == other.description &&
              this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
          if (hashCode == 0) {
            hashCode = Objects.hash(
                routingNumber,
                accountNumber,
                funding,
                description,
                additionalProperties,
            )
          }
          return hashCode
        }

        override fun toString() = "ExternalAccountCreateBody{routingNumber=$routingNumber, accountNumber=$accountNumber, funding=$funding, description=$description, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic
            fun builder() = Builder()
        }

        class Builder {

            private var routingNumber: String? = null
            private var accountNumber: String? = null
            private var funding: Funding? = null
            private var description: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(externalAccountCreateBody: ExternalAccountCreateBody) = apply {
                this.routingNumber = externalAccountCreateBody.routingNumber
                this.accountNumber = externalAccountCreateBody.accountNumber
                this.funding = externalAccountCreateBody.funding
                this.description = externalAccountCreateBody.description
                additionalProperties(externalAccountCreateBody.additionalProperties)
            }

            /**
             * The American Bankers' Association (ABA) Routing Transit Number (RTN) for the
             * destination account.
             */
            @JsonProperty("routing_number")
            fun routingNumber(routingNumber: String) = apply {
                this.routingNumber = routingNumber
            }

            /** The account number for the destination account. */
            @JsonProperty("account_number")
            fun accountNumber(accountNumber: String) = apply {
                this.accountNumber = accountNumber
            }

            /** The type of the destination account. Defaults to `checking`. */
            @JsonProperty("funding")
            fun funding(funding: Funding) = apply {
                this.funding = funding
            }

            /** The name you choose for the Account. */
            @JsonProperty("description")
            fun description(description: String) = apply {
                this.description = description
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

            fun build(): ExternalAccountCreateBody = ExternalAccountCreateBody(
                checkNotNull(routingNumber) {
                    "`routingNumber` is required but was not set"
                },
                checkNotNull(accountNumber) {
                    "`accountNumber` is required but was not set"
                },
                funding,
                checkNotNull(description) {
                    "`description` is required but was not set"
                },
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

      return other is ExternalAccountCreateParams &&
          this.routingNumber == other.routingNumber &&
          this.accountNumber == other.accountNumber &&
          this.funding == other.funding &&
          this.description == other.description &&
          this.additionalQueryParams == other.additionalQueryParams &&
          this.additionalHeaders == other.additionalHeaders &&
          this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
      return Objects.hash(
          routingNumber,
          accountNumber,
          funding,
          description,
          additionalQueryParams,
          additionalHeaders,
          additionalBodyProperties,
      )
    }

    override fun toString() = "ExternalAccountCreateParams{routingNumber=$routingNumber, accountNumber=$accountNumber, funding=$funding, description=$description, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic
        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var routingNumber: String? = null
        private var accountNumber: String? = null
        private var funding: Funding? = null
        private var description: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(externalAccountCreateParams: ExternalAccountCreateParams) = apply {
            this.routingNumber = externalAccountCreateParams.routingNumber
            this.accountNumber = externalAccountCreateParams.accountNumber
            this.funding = externalAccountCreateParams.funding
            this.description = externalAccountCreateParams.description
            additionalQueryParams(externalAccountCreateParams.additionalQueryParams)
            additionalHeaders(externalAccountCreateParams.additionalHeaders)
            additionalBodyProperties(externalAccountCreateParams.additionalBodyProperties)
        }

        /**
         * The American Bankers' Association (ABA) Routing Transit Number (RTN) for the
         * destination account.
         */
        fun routingNumber(routingNumber: String) = apply {
            this.routingNumber = routingNumber
        }

        /** The account number for the destination account. */
        fun accountNumber(accountNumber: String) = apply {
            this.accountNumber = accountNumber
        }

        /** The type of the destination account. Defaults to `checking`. */
        fun funding(funding: Funding) = apply {
            this.funding = funding
        }

        /** The name you choose for the Account. */
        fun description(description: String) = apply {
            this.description = description
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

        fun build(): ExternalAccountCreateParams = ExternalAccountCreateParams(
            checkNotNull(routingNumber) {
                "`routingNumber` is required but was not set"
            },
            checkNotNull(accountNumber) {
                "`accountNumber` is required but was not set"
            },
            funding,
            checkNotNull(description) {
                "`description` is required but was not set"
            },
            additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            additionalBodyProperties.toUnmodifiable(),
        )
    }

    class Funding @JsonCreator private constructor(private val value: JsonField<String>,) {

        @com.fasterxml.jackson.annotation.JsonValue
        fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is Funding &&
              this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val CHECKING = Funding(JsonField.of("checking"))

            @JvmField val SAVINGS = Funding(JsonField.of("savings"))

            @JvmField val OTHER = Funding(JsonField.of("other"))

            @JvmStatic fun of(value: String) = Funding(JsonField.of(value))
        }

        enum class Known {
            CHECKING,
            SAVINGS,
            OTHER,
        }

        enum class Value {
            CHECKING,
            SAVINGS,
            OTHER,
            _UNKNOWN,
        }

        fun value(): Value = when (this) {
            CHECKING -> Value.CHECKING
            SAVINGS -> Value.SAVINGS
            OTHER -> Value.OTHER
            else -> Value._UNKNOWN
        }

        fun known(): Known = when (this) {
            CHECKING -> Known.CHECKING
            SAVINGS -> Known.SAVINGS
            OTHER -> Known.OTHER
            else -> throw IncreaseInvalidDataException("Unknown Funding: $value")
        }

        fun asString(): String = _value().asStringOrThrow()
    }
}
