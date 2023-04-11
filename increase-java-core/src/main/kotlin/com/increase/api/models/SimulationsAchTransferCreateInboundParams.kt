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

class SimulationsAchTransferCreateInboundParams constructor(private val accountNumberId: String,private val amount: Long,private val companyDescriptiveDate: String?,private val companyDiscretionaryData: String?,private val companyEntryDescription: String?,private val companyName: String?,private val companyId: String?,private val additionalQueryParams: Map<String, List<String>>,private val additionalHeaders: Map<String, List<String>>,private val additionalBodyProperties: Map<String, JsonValue>,) {

    fun accountNumberId(): String = accountNumberId

    fun amount(): Long = amount

    fun companyDescriptiveDate(): Optional<String> = Optional.ofNullable(companyDescriptiveDate)

    fun companyDiscretionaryData(): Optional<String> = Optional.ofNullable(companyDiscretionaryData)

    fun companyEntryDescription(): Optional<String> = Optional.ofNullable(companyEntryDescription)

    fun companyName(): Optional<String> = Optional.ofNullable(companyName)

    fun companyId(): Optional<String> = Optional.ofNullable(companyId)

    @JvmSynthetic
    internal fun getBody(): SimulationsAchTransferCreateInboundBody {
      return SimulationsAchTransferCreateInboundBody(
          accountNumberId,
          amount,
          companyDescriptiveDate,
          companyDiscretionaryData,
          companyEntryDescription,
          companyName,
          companyId,
          additionalBodyProperties,
      )
    }

    @JvmSynthetic
    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic
    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = SimulationsAchTransferCreateInboundBody.Builder::class)
    @NoAutoDetect
    class SimulationsAchTransferCreateInboundBody internal constructor(private val accountNumberId: String?,private val amount: Long?,private val companyDescriptiveDate: String?,private val companyDiscretionaryData: String?,private val companyEntryDescription: String?,private val companyName: String?,private val companyId: String?,private val additionalProperties: Map<String, JsonValue>,) {

        private var hashCode: Int = 0

        /** The identifier of the Account Number the inbound ACH Transfer is for. */
        @JsonProperty("account_number_id")
        fun accountNumberId(): String? = accountNumberId

        /**
         * The transfer amount in cents. A positive amount originates a credit transfer
         * pushing funds to the receiving account. A negative amount originates a debit
         * transfer pulling funds from the receiving account.
         */
        @JsonProperty("amount")
        fun amount(): Long? = amount

        /** The description of the date of the transfer. */
        @JsonProperty("company_descriptive_date")
        fun companyDescriptiveDate(): String? = companyDescriptiveDate

        /** Data associated with the transfer set by the sender. */
        @JsonProperty("company_discretionary_data")
        fun companyDiscretionaryData(): String? = companyDiscretionaryData

        /** The description of the transfer set by the sender. */
        @JsonProperty("company_entry_description")
        fun companyEntryDescription(): String? = companyEntryDescription

        /** The name of the sender. */
        @JsonProperty("company_name")
        fun companyName(): String? = companyName

        /** The sender's company id. */
        @JsonProperty("company_id")
        fun companyId(): String? = companyId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is SimulationsAchTransferCreateInboundBody &&
              this.accountNumberId == other.accountNumberId &&
              this.amount == other.amount &&
              this.companyDescriptiveDate == other.companyDescriptiveDate &&
              this.companyDiscretionaryData == other.companyDiscretionaryData &&
              this.companyEntryDescription == other.companyEntryDescription &&
              this.companyName == other.companyName &&
              this.companyId == other.companyId &&
              this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
          if (hashCode == 0) {
            hashCode = Objects.hash(
                accountNumberId,
                amount,
                companyDescriptiveDate,
                companyDiscretionaryData,
                companyEntryDescription,
                companyName,
                companyId,
                additionalProperties,
            )
          }
          return hashCode
        }

        override fun toString() = "SimulationsAchTransferCreateInboundBody{accountNumberId=$accountNumberId, amount=$amount, companyDescriptiveDate=$companyDescriptiveDate, companyDiscretionaryData=$companyDiscretionaryData, companyEntryDescription=$companyEntryDescription, companyName=$companyName, companyId=$companyId, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic
            fun builder() = Builder()
        }

        class Builder {

            private var accountNumberId: String? = null
            private var amount: Long? = null
            private var companyDescriptiveDate: String? = null
            private var companyDiscretionaryData: String? = null
            private var companyEntryDescription: String? = null
            private var companyName: String? = null
            private var companyId: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(simulationsAchTransferCreateInboundBody: SimulationsAchTransferCreateInboundBody) = apply {
                this.accountNumberId = simulationsAchTransferCreateInboundBody.accountNumberId
                this.amount = simulationsAchTransferCreateInboundBody.amount
                this.companyDescriptiveDate = simulationsAchTransferCreateInboundBody.companyDescriptiveDate
                this.companyDiscretionaryData = simulationsAchTransferCreateInboundBody.companyDiscretionaryData
                this.companyEntryDescription = simulationsAchTransferCreateInboundBody.companyEntryDescription
                this.companyName = simulationsAchTransferCreateInboundBody.companyName
                this.companyId = simulationsAchTransferCreateInboundBody.companyId
                additionalProperties(simulationsAchTransferCreateInboundBody.additionalProperties)
            }

            /** The identifier of the Account Number the inbound ACH Transfer is for. */
            @JsonProperty("account_number_id")
            fun accountNumberId(accountNumberId: String) = apply {
                this.accountNumberId = accountNumberId
            }

            /**
             * The transfer amount in cents. A positive amount originates a credit transfer
             * pushing funds to the receiving account. A negative amount originates a debit
             * transfer pulling funds from the receiving account.
             */
            @JsonProperty("amount")
            fun amount(amount: Long) = apply {
                this.amount = amount
            }

            /** The description of the date of the transfer. */
            @JsonProperty("company_descriptive_date")
            fun companyDescriptiveDate(companyDescriptiveDate: String) = apply {
                this.companyDescriptiveDate = companyDescriptiveDate
            }

            /** Data associated with the transfer set by the sender. */
            @JsonProperty("company_discretionary_data")
            fun companyDiscretionaryData(companyDiscretionaryData: String) = apply {
                this.companyDiscretionaryData = companyDiscretionaryData
            }

            /** The description of the transfer set by the sender. */
            @JsonProperty("company_entry_description")
            fun companyEntryDescription(companyEntryDescription: String) = apply {
                this.companyEntryDescription = companyEntryDescription
            }

            /** The name of the sender. */
            @JsonProperty("company_name")
            fun companyName(companyName: String) = apply {
                this.companyName = companyName
            }

            /** The sender's company id. */
            @JsonProperty("company_id")
            fun companyId(companyId: String) = apply {
                this.companyId = companyId
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

            fun build(): SimulationsAchTransferCreateInboundBody = SimulationsAchTransferCreateInboundBody(
                checkNotNull(accountNumberId) {
                    "`accountNumberId` is required but was not set"
                },
                checkNotNull(amount) {
                    "`amount` is required but was not set"
                },
                companyDescriptiveDate,
                companyDiscretionaryData,
                companyEntryDescription,
                companyName,
                companyId,
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

      return other is SimulationsAchTransferCreateInboundParams &&
          this.accountNumberId == other.accountNumberId &&
          this.amount == other.amount &&
          this.companyDescriptiveDate == other.companyDescriptiveDate &&
          this.companyDiscretionaryData == other.companyDiscretionaryData &&
          this.companyEntryDescription == other.companyEntryDescription &&
          this.companyName == other.companyName &&
          this.companyId == other.companyId &&
          this.additionalQueryParams == other.additionalQueryParams &&
          this.additionalHeaders == other.additionalHeaders &&
          this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
      return Objects.hash(
          accountNumberId,
          amount,
          companyDescriptiveDate,
          companyDiscretionaryData,
          companyEntryDescription,
          companyName,
          companyId,
          additionalQueryParams,
          additionalHeaders,
          additionalBodyProperties,
      )
    }

    override fun toString() = "SimulationsAchTransferCreateInboundParams{accountNumberId=$accountNumberId, amount=$amount, companyDescriptiveDate=$companyDescriptiveDate, companyDiscretionaryData=$companyDiscretionaryData, companyEntryDescription=$companyEntryDescription, companyName=$companyName, companyId=$companyId, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic
        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var accountNumberId: String? = null
        private var amount: Long? = null
        private var companyDescriptiveDate: String? = null
        private var companyDiscretionaryData: String? = null
        private var companyEntryDescription: String? = null
        private var companyName: String? = null
        private var companyId: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(simulationsAchTransferCreateInboundParams: SimulationsAchTransferCreateInboundParams) = apply {
            this.accountNumberId = simulationsAchTransferCreateInboundParams.accountNumberId
            this.amount = simulationsAchTransferCreateInboundParams.amount
            this.companyDescriptiveDate = simulationsAchTransferCreateInboundParams.companyDescriptiveDate
            this.companyDiscretionaryData = simulationsAchTransferCreateInboundParams.companyDiscretionaryData
            this.companyEntryDescription = simulationsAchTransferCreateInboundParams.companyEntryDescription
            this.companyName = simulationsAchTransferCreateInboundParams.companyName
            this.companyId = simulationsAchTransferCreateInboundParams.companyId
            additionalQueryParams(simulationsAchTransferCreateInboundParams.additionalQueryParams)
            additionalHeaders(simulationsAchTransferCreateInboundParams.additionalHeaders)
            additionalBodyProperties(simulationsAchTransferCreateInboundParams.additionalBodyProperties)
        }

        /** The identifier of the Account Number the inbound ACH Transfer is for. */
        fun accountNumberId(accountNumberId: String) = apply {
            this.accountNumberId = accountNumberId
        }

        /**
         * The transfer amount in cents. A positive amount originates a credit transfer
         * pushing funds to the receiving account. A negative amount originates a debit
         * transfer pulling funds from the receiving account.
         */
        fun amount(amount: Long) = apply {
            this.amount = amount
        }

        /** The description of the date of the transfer. */
        fun companyDescriptiveDate(companyDescriptiveDate: String) = apply {
            this.companyDescriptiveDate = companyDescriptiveDate
        }

        /** Data associated with the transfer set by the sender. */
        fun companyDiscretionaryData(companyDiscretionaryData: String) = apply {
            this.companyDiscretionaryData = companyDiscretionaryData
        }

        /** The description of the transfer set by the sender. */
        fun companyEntryDescription(companyEntryDescription: String) = apply {
            this.companyEntryDescription = companyEntryDescription
        }

        /** The name of the sender. */
        fun companyName(companyName: String) = apply {
            this.companyName = companyName
        }

        /** The sender's company id. */
        fun companyId(companyId: String) = apply {
            this.companyId = companyId
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

        fun build(): SimulationsAchTransferCreateInboundParams = SimulationsAchTransferCreateInboundParams(
            checkNotNull(accountNumberId) {
                "`accountNumberId` is required but was not set"
            },
            checkNotNull(amount) {
                "`amount` is required but was not set"
            },
            companyDescriptiveDate,
            companyDiscretionaryData,
            companyEntryDescription,
            companyName,
            companyId,
            additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            additionalBodyProperties.toUnmodifiable(),
        )
    }
}
