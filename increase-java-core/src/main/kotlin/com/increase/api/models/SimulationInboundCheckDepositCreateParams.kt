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

class SimulationInboundCheckDepositCreateParams constructor(
  private val accountNumberId: String,
  private val amount: Long,
  private val checkNumber: String,
  private val additionalQueryParams: Map<String, List<String>>,
  private val additionalHeaders: Map<String, List<String>>,
  private val additionalBodyProperties: Map<String, JsonValue>,

) {

    fun accountNumberId(): String = accountNumberId

    fun amount(): Long = amount

    fun checkNumber(): String = checkNumber

    @JvmSynthetic
    internal fun getBody(): SimulationInboundCheckDepositCreateBody {
      return SimulationInboundCheckDepositCreateBody(
          accountNumberId,
          amount,
          checkNumber,
          additionalBodyProperties,
      )
    }

    @JvmSynthetic
    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic
    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = SimulationInboundCheckDepositCreateBody.Builder::class)
    @NoAutoDetect
    class SimulationInboundCheckDepositCreateBody internal constructor(
      private val accountNumberId: String?,
      private val amount: Long?,
      private val checkNumber: String?,
      private val additionalProperties: Map<String, JsonValue>,

    ) {

        private var hashCode: Int = 0

        /** The identifier of the Account Number the Inbound Check Deposit will be against. */
        @JsonProperty("account_number_id")
        fun accountNumberId(): String? = accountNumberId

        /** The check amount in cents. */
        @JsonProperty("amount")
        fun amount(): Long? = amount

        /** The check number on the check to be deposited. */
        @JsonProperty("check_number")
        fun checkNumber(): String? = checkNumber

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is SimulationInboundCheckDepositCreateBody &&
              this.accountNumberId == other.accountNumberId &&
              this.amount == other.amount &&
              this.checkNumber == other.checkNumber &&
              this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
          if (hashCode == 0) {
            hashCode = Objects.hash(
                accountNumberId,
                amount,
                checkNumber,
                additionalProperties,
            )
          }
          return hashCode
        }

        override fun toString() = "SimulationInboundCheckDepositCreateBody{accountNumberId=$accountNumberId, amount=$amount, checkNumber=$checkNumber, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic
            fun builder() = Builder()
        }

        class Builder {

            private var accountNumberId: String? = null
            private var amount: Long? = null
            private var checkNumber: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(simulationInboundCheckDepositCreateBody: SimulationInboundCheckDepositCreateBody) = apply {
                this.accountNumberId = simulationInboundCheckDepositCreateBody.accountNumberId
                this.amount = simulationInboundCheckDepositCreateBody.amount
                this.checkNumber = simulationInboundCheckDepositCreateBody.checkNumber
                additionalProperties(simulationInboundCheckDepositCreateBody.additionalProperties)
            }

            /** The identifier of the Account Number the Inbound Check Deposit will be against. */
            @JsonProperty("account_number_id")
            fun accountNumberId(accountNumberId: String) = apply {
                this.accountNumberId = accountNumberId
            }

            /** The check amount in cents. */
            @JsonProperty("amount")
            fun amount(amount: Long) = apply {
                this.amount = amount
            }

            /** The check number on the check to be deposited. */
            @JsonProperty("check_number")
            fun checkNumber(checkNumber: String) = apply {
                this.checkNumber = checkNumber
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

            fun build(): SimulationInboundCheckDepositCreateBody = SimulationInboundCheckDepositCreateBody(
                checkNotNull(accountNumberId) {
                    "`accountNumberId` is required but was not set"
                },
                checkNotNull(amount) {
                    "`amount` is required but was not set"
                },
                checkNotNull(checkNumber) {
                    "`checkNumber` is required but was not set"
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

      return other is SimulationInboundCheckDepositCreateParams &&
          this.accountNumberId == other.accountNumberId &&
          this.amount == other.amount &&
          this.checkNumber == other.checkNumber &&
          this.additionalQueryParams == other.additionalQueryParams &&
          this.additionalHeaders == other.additionalHeaders &&
          this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
      return Objects.hash(
          accountNumberId,
          amount,
          checkNumber,
          additionalQueryParams,
          additionalHeaders,
          additionalBodyProperties,
      )
    }

    override fun toString() = "SimulationInboundCheckDepositCreateParams{accountNumberId=$accountNumberId, amount=$amount, checkNumber=$checkNumber, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic
        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var accountNumberId: String? = null
        private var amount: Long? = null
        private var checkNumber: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(simulationInboundCheckDepositCreateParams: SimulationInboundCheckDepositCreateParams) = apply {
            this.accountNumberId = simulationInboundCheckDepositCreateParams.accountNumberId
            this.amount = simulationInboundCheckDepositCreateParams.amount
            this.checkNumber = simulationInboundCheckDepositCreateParams.checkNumber
            additionalQueryParams(simulationInboundCheckDepositCreateParams.additionalQueryParams)
            additionalHeaders(simulationInboundCheckDepositCreateParams.additionalHeaders)
            additionalBodyProperties(simulationInboundCheckDepositCreateParams.additionalBodyProperties)
        }

        /** The identifier of the Account Number the Inbound Check Deposit will be against. */
        fun accountNumberId(accountNumberId: String) = apply {
            this.accountNumberId = accountNumberId
        }

        /** The check amount in cents. */
        fun amount(amount: Long) = apply {
            this.amount = amount
        }

        /** The check number on the check to be deposited. */
        fun checkNumber(checkNumber: String) = apply {
            this.checkNumber = checkNumber
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

        fun build(): SimulationInboundCheckDepositCreateParams = SimulationInboundCheckDepositCreateParams(
            checkNotNull(accountNumberId) {
                "`accountNumberId` is required but was not set"
            },
            checkNotNull(amount) {
                "`amount` is required but was not set"
            },
            checkNotNull(checkNumber) {
                "`checkNumber` is required but was not set"
            },
            additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            additionalBodyProperties.toUnmodifiable(),
        )
    }
}
