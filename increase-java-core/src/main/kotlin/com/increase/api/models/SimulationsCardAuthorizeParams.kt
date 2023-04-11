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

class SimulationsCardAuthorizeParams constructor(private val amount: Long,private val cardId: String?,private val digitalWalletTokenId: String?,private val additionalQueryParams: Map<String, List<String>>,private val additionalHeaders: Map<String, List<String>>,private val additionalBodyProperties: Map<String, JsonValue>,) {

    fun amount(): Long = amount

    fun cardId(): Optional<String> = Optional.ofNullable(cardId)

    fun digitalWalletTokenId(): Optional<String> = Optional.ofNullable(digitalWalletTokenId)

    @JvmSynthetic
    internal fun getBody(): SimulationsCardAuthorizeBody {
      return SimulationsCardAuthorizeBody(
          amount,
          cardId,
          digitalWalletTokenId,
          additionalBodyProperties,
      )
    }

    @JvmSynthetic
    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic
    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = SimulationsCardAuthorizeBody.Builder::class)
    @NoAutoDetect
    class SimulationsCardAuthorizeBody internal constructor(private val amount: Long?,private val cardId: String?,private val digitalWalletTokenId: String?,private val additionalProperties: Map<String, JsonValue>,) {

        private var hashCode: Int = 0

        /** The authorization amount in cents. */
        @JsonProperty("amount")
        fun amount(): Long? = amount

        /** The identifier of the Card to be authorized. */
        @JsonProperty("card_id")
        fun cardId(): String? = cardId

        /** The identifier of the Digital Wallet Token to be authorized. */
        @JsonProperty("digital_wallet_token_id")
        fun digitalWalletTokenId(): String? = digitalWalletTokenId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is SimulationsCardAuthorizeBody &&
              this.amount == other.amount &&
              this.cardId == other.cardId &&
              this.digitalWalletTokenId == other.digitalWalletTokenId &&
              this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
          if (hashCode == 0) {
            hashCode = Objects.hash(
                amount,
                cardId,
                digitalWalletTokenId,
                additionalProperties,
            )
          }
          return hashCode
        }

        override fun toString() = "SimulationsCardAuthorizeBody{amount=$amount, cardId=$cardId, digitalWalletTokenId=$digitalWalletTokenId, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic
            fun builder() = Builder()
        }

        class Builder {

            private var amount: Long? = null
            private var cardId: String? = null
            private var digitalWalletTokenId: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(simulationsCardAuthorizeBody: SimulationsCardAuthorizeBody) = apply {
                this.amount = simulationsCardAuthorizeBody.amount
                this.cardId = simulationsCardAuthorizeBody.cardId
                this.digitalWalletTokenId = simulationsCardAuthorizeBody.digitalWalletTokenId
                additionalProperties(simulationsCardAuthorizeBody.additionalProperties)
            }

            /** The authorization amount in cents. */
            @JsonProperty("amount")
            fun amount(amount: Long) = apply {
                this.amount = amount
            }

            /** The identifier of the Card to be authorized. */
            @JsonProperty("card_id")
            fun cardId(cardId: String) = apply {
                this.cardId = cardId
            }

            /** The identifier of the Digital Wallet Token to be authorized. */
            @JsonProperty("digital_wallet_token_id")
            fun digitalWalletTokenId(digitalWalletTokenId: String) = apply {
                this.digitalWalletTokenId = digitalWalletTokenId
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

            fun build(): SimulationsCardAuthorizeBody = SimulationsCardAuthorizeBody(
                checkNotNull(amount) {
                    "`amount` is required but was not set"
                },
                cardId,
                digitalWalletTokenId,
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

      return other is SimulationsCardAuthorizeParams &&
          this.amount == other.amount &&
          this.cardId == other.cardId &&
          this.digitalWalletTokenId == other.digitalWalletTokenId &&
          this.additionalQueryParams == other.additionalQueryParams &&
          this.additionalHeaders == other.additionalHeaders &&
          this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
      return Objects.hash(
          amount,
          cardId,
          digitalWalletTokenId,
          additionalQueryParams,
          additionalHeaders,
          additionalBodyProperties,
      )
    }

    override fun toString() = "SimulationsCardAuthorizeParams{amount=$amount, cardId=$cardId, digitalWalletTokenId=$digitalWalletTokenId, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic
        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var amount: Long? = null
        private var cardId: String? = null
        private var digitalWalletTokenId: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(simulationsCardAuthorizeParams: SimulationsCardAuthorizeParams) = apply {
            this.amount = simulationsCardAuthorizeParams.amount
            this.cardId = simulationsCardAuthorizeParams.cardId
            this.digitalWalletTokenId = simulationsCardAuthorizeParams.digitalWalletTokenId
            additionalQueryParams(simulationsCardAuthorizeParams.additionalQueryParams)
            additionalHeaders(simulationsCardAuthorizeParams.additionalHeaders)
            additionalBodyProperties(simulationsCardAuthorizeParams.additionalBodyProperties)
        }

        /** The authorization amount in cents. */
        fun amount(amount: Long) = apply {
            this.amount = amount
        }

        /** The identifier of the Card to be authorized. */
        fun cardId(cardId: String) = apply {
            this.cardId = cardId
        }

        /** The identifier of the Digital Wallet Token to be authorized. */
        fun digitalWalletTokenId(digitalWalletTokenId: String) = apply {
            this.digitalWalletTokenId = digitalWalletTokenId
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

        fun build(): SimulationsCardAuthorizeParams = SimulationsCardAuthorizeParams(
            checkNotNull(amount) {
                "`amount` is required but was not set"
            },
            cardId,
            digitalWalletTokenId,
            additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            additionalBodyProperties.toUnmodifiable(),
        )
    }
}
