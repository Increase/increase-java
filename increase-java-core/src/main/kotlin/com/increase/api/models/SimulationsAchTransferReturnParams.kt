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

class SimulationsAchTransferReturnParams constructor(private val achTransferId: String,private val reason: Reason?,private val additionalQueryParams: Map<String, List<String>>,private val additionalHeaders: Map<String, List<String>>,private val additionalBodyProperties: Map<String, JsonValue>,) {

    fun achTransferId(): String = achTransferId

    fun reason(): Optional<Reason> = Optional.ofNullable(reason)

    @JvmSynthetic
    internal fun getBody(): SimulationsAchTransferReturnBody {
      return SimulationsAchTransferReturnBody(reason, additionalBodyProperties)
    }

    @JvmSynthetic
    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic
    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
      return when (index) {
          0 -> achTransferId
          else -> ""
      }
    }

    @JsonDeserialize(builder = SimulationsAchTransferReturnBody.Builder::class)
    @NoAutoDetect
    class SimulationsAchTransferReturnBody internal constructor(private val reason: Reason?,private val additionalProperties: Map<String, JsonValue>,) {

        private var hashCode: Int = 0

        /**
         * The reason why the Federal Reserve or destination bank returned this transfer.
         * Defaults to `no_account`.
         */
        @JsonProperty("reason")
        fun reason(): Reason? = reason

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is SimulationsAchTransferReturnBody &&
              this.reason == other.reason &&
              this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
          if (hashCode == 0) {
            hashCode = Objects.hash(reason, additionalProperties)
          }
          return hashCode
        }

        override fun toString() = "SimulationsAchTransferReturnBody{reason=$reason, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic
            fun builder() = Builder()
        }

        class Builder {

            private var reason: Reason? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(simulationsAchTransferReturnBody: SimulationsAchTransferReturnBody) = apply {
                this.reason = simulationsAchTransferReturnBody.reason
                additionalProperties(simulationsAchTransferReturnBody.additionalProperties)
            }

            /**
             * The reason why the Federal Reserve or destination bank returned this transfer.
             * Defaults to `no_account`.
             */
            @JsonProperty("reason")
            fun reason(reason: Reason) = apply {
                this.reason = reason
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

            fun build(): SimulationsAchTransferReturnBody = SimulationsAchTransferReturnBody(reason, additionalProperties.toUnmodifiable())
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return other is SimulationsAchTransferReturnParams &&
          this.achTransferId == other.achTransferId &&
          this.reason == other.reason &&
          this.additionalQueryParams == other.additionalQueryParams &&
          this.additionalHeaders == other.additionalHeaders &&
          this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
      return Objects.hash(
          achTransferId,
          reason,
          additionalQueryParams,
          additionalHeaders,
          additionalBodyProperties,
      )
    }

    override fun toString() = "SimulationsAchTransferReturnParams{achTransferId=$achTransferId, reason=$reason, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic
        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var achTransferId: String? = null
        private var reason: Reason? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(simulationsAchTransferReturnParams: SimulationsAchTransferReturnParams) = apply {
            this.achTransferId = simulationsAchTransferReturnParams.achTransferId
            this.reason = simulationsAchTransferReturnParams.reason
            additionalQueryParams(simulationsAchTransferReturnParams.additionalQueryParams)
            additionalHeaders(simulationsAchTransferReturnParams.additionalHeaders)
            additionalBodyProperties(simulationsAchTransferReturnParams.additionalBodyProperties)
        }

        /** The identifier of the ACH Transfer you wish to return. */
        fun achTransferId(achTransferId: String) = apply {
            this.achTransferId = achTransferId
        }

        /**
         * The reason why the Federal Reserve or destination bank returned this transfer.
         * Defaults to `no_account`.
         */
        fun reason(reason: Reason) = apply {
            this.reason = reason
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

        fun build(): SimulationsAchTransferReturnParams = SimulationsAchTransferReturnParams(
            checkNotNull(achTransferId) {
                "`achTransferId` is required but was not set"
            },
            reason,
            additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            additionalBodyProperties.toUnmodifiable(),
        )
    }

    class Reason @JsonCreator private constructor(private val value: JsonField<String>,) {

        @com.fasterxml.jackson.annotation.JsonValue
        fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is Reason &&
              this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val INSUFFICIENT_FUND = Reason(JsonField.of("insufficient_fund"))

            @JvmField val NO_ACCOUNT = Reason(JsonField.of("no_account"))

            @JvmField val ACCOUNT_CLOSED = Reason(JsonField.of("account_closed"))

            @JvmField val INVALID_ACCOUNT_NUMBER_STRUCTURE = Reason(JsonField.of("invalid_account_number_structure"))

            @JvmField val ACCOUNT_FROZEN_ENTRY_RETURNED_PER_OFAC_INSTRUCTION = Reason(JsonField.of("account_frozen_entry_returned_per_ofac_instruction"))

            @JvmField val CREDIT_ENTRY_REFUSED_BY_RECEIVER = Reason(JsonField.of("credit_entry_refused_by_receiver"))

            @JvmField val UNAUTHORIZED_DEBIT_TO_CONSUMER_ACCOUNT_USING_CORPORATE_SEC_CODE = Reason(JsonField.of("unauthorized_debit_to_consumer_account_using_corporate_sec_code"))

            @JvmField val CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED = Reason(JsonField.of("corporate_customer_advised_not_authorized"))

            @JvmField val PAYMENT_STOPPED = Reason(JsonField.of("payment_stopped"))

            @JvmField val NON_TRANSACTION_ACCOUNT = Reason(JsonField.of("non_transaction_account"))

            @JvmField val UNCOLLECTED_FUNDS = Reason(JsonField.of("uncollected_funds"))

            @JvmField val ROUTING_NUMBER_CHECK_DIGIT_ERROR = Reason(JsonField.of("routing_number_check_digit_error"))

            @JvmField val CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE = Reason(JsonField.of("customer_advised_unauthorized_improper_ineligible_or_incomplete"))

            @JvmField val AMOUNT_FIELD_ERROR = Reason(JsonField.of("amount_field_error"))

            @JvmField val AUTHORIZATION_REVOKED_BY_CUSTOMER = Reason(JsonField.of("authorization_revoked_by_customer"))

            @JvmField val INVALID_ACH_ROUTING_NUMBER = Reason(JsonField.of("invalid_ach_routing_number"))

            @JvmField val FILE_RECORD_EDIT_CRITERIA = Reason(JsonField.of("file_record_edit_criteria"))

            @JvmField val ENR_INVALID_INDIVIDUAL_NAME = Reason(JsonField.of("enr_invalid_individual_name"))

            @JvmField val RETURNED_PER_ODFI_REQUEST = Reason(JsonField.of("returned_per_odfi_request"))

            @JvmField val ADDENDA_ERROR = Reason(JsonField.of("addenda_error"))

            @JvmField val LIMITED_PARTICIPATION_DFI = Reason(JsonField.of("limited_participation_dfi"))

            @JvmField val INCORRECTLY_CODED_OUTBOUND_INTERNATIONAL_PAYMENT = Reason(JsonField.of("incorrectly_coded_outbound_international_payment"))

            @JvmField val OTHER = Reason(JsonField.of("other"))

            @JvmStatic fun of(value: String) = Reason(JsonField.of(value))
        }

        enum class Known {
            INSUFFICIENT_FUND,
            NO_ACCOUNT,
            ACCOUNT_CLOSED,
            INVALID_ACCOUNT_NUMBER_STRUCTURE,
            ACCOUNT_FROZEN_ENTRY_RETURNED_PER_OFAC_INSTRUCTION,
            CREDIT_ENTRY_REFUSED_BY_RECEIVER,
            UNAUTHORIZED_DEBIT_TO_CONSUMER_ACCOUNT_USING_CORPORATE_SEC_CODE,
            CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED,
            PAYMENT_STOPPED,
            NON_TRANSACTION_ACCOUNT,
            UNCOLLECTED_FUNDS,
            ROUTING_NUMBER_CHECK_DIGIT_ERROR,
            CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE,
            AMOUNT_FIELD_ERROR,
            AUTHORIZATION_REVOKED_BY_CUSTOMER,
            INVALID_ACH_ROUTING_NUMBER,
            FILE_RECORD_EDIT_CRITERIA,
            ENR_INVALID_INDIVIDUAL_NAME,
            RETURNED_PER_ODFI_REQUEST,
            ADDENDA_ERROR,
            LIMITED_PARTICIPATION_DFI,
            INCORRECTLY_CODED_OUTBOUND_INTERNATIONAL_PAYMENT,
            OTHER,
        }

        enum class Value {
            INSUFFICIENT_FUND,
            NO_ACCOUNT,
            ACCOUNT_CLOSED,
            INVALID_ACCOUNT_NUMBER_STRUCTURE,
            ACCOUNT_FROZEN_ENTRY_RETURNED_PER_OFAC_INSTRUCTION,
            CREDIT_ENTRY_REFUSED_BY_RECEIVER,
            UNAUTHORIZED_DEBIT_TO_CONSUMER_ACCOUNT_USING_CORPORATE_SEC_CODE,
            CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED,
            PAYMENT_STOPPED,
            NON_TRANSACTION_ACCOUNT,
            UNCOLLECTED_FUNDS,
            ROUTING_NUMBER_CHECK_DIGIT_ERROR,
            CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE,
            AMOUNT_FIELD_ERROR,
            AUTHORIZATION_REVOKED_BY_CUSTOMER,
            INVALID_ACH_ROUTING_NUMBER,
            FILE_RECORD_EDIT_CRITERIA,
            ENR_INVALID_INDIVIDUAL_NAME,
            RETURNED_PER_ODFI_REQUEST,
            ADDENDA_ERROR,
            LIMITED_PARTICIPATION_DFI,
            INCORRECTLY_CODED_OUTBOUND_INTERNATIONAL_PAYMENT,
            OTHER,
            _UNKNOWN,
        }

        fun value(): Value = when (this) {
            INSUFFICIENT_FUND -> Value.INSUFFICIENT_FUND
            NO_ACCOUNT -> Value.NO_ACCOUNT
            ACCOUNT_CLOSED -> Value.ACCOUNT_CLOSED
            INVALID_ACCOUNT_NUMBER_STRUCTURE -> Value.INVALID_ACCOUNT_NUMBER_STRUCTURE
            ACCOUNT_FROZEN_ENTRY_RETURNED_PER_OFAC_INSTRUCTION -> Value.ACCOUNT_FROZEN_ENTRY_RETURNED_PER_OFAC_INSTRUCTION
            CREDIT_ENTRY_REFUSED_BY_RECEIVER -> Value.CREDIT_ENTRY_REFUSED_BY_RECEIVER
            UNAUTHORIZED_DEBIT_TO_CONSUMER_ACCOUNT_USING_CORPORATE_SEC_CODE -> Value.UNAUTHORIZED_DEBIT_TO_CONSUMER_ACCOUNT_USING_CORPORATE_SEC_CODE
            CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED -> Value.CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED
            PAYMENT_STOPPED -> Value.PAYMENT_STOPPED
            NON_TRANSACTION_ACCOUNT -> Value.NON_TRANSACTION_ACCOUNT
            UNCOLLECTED_FUNDS -> Value.UNCOLLECTED_FUNDS
            ROUTING_NUMBER_CHECK_DIGIT_ERROR -> Value.ROUTING_NUMBER_CHECK_DIGIT_ERROR
            CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE -> Value.CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE
            AMOUNT_FIELD_ERROR -> Value.AMOUNT_FIELD_ERROR
            AUTHORIZATION_REVOKED_BY_CUSTOMER -> Value.AUTHORIZATION_REVOKED_BY_CUSTOMER
            INVALID_ACH_ROUTING_NUMBER -> Value.INVALID_ACH_ROUTING_NUMBER
            FILE_RECORD_EDIT_CRITERIA -> Value.FILE_RECORD_EDIT_CRITERIA
            ENR_INVALID_INDIVIDUAL_NAME -> Value.ENR_INVALID_INDIVIDUAL_NAME
            RETURNED_PER_ODFI_REQUEST -> Value.RETURNED_PER_ODFI_REQUEST
            ADDENDA_ERROR -> Value.ADDENDA_ERROR
            LIMITED_PARTICIPATION_DFI -> Value.LIMITED_PARTICIPATION_DFI
            INCORRECTLY_CODED_OUTBOUND_INTERNATIONAL_PAYMENT -> Value.INCORRECTLY_CODED_OUTBOUND_INTERNATIONAL_PAYMENT
            OTHER -> Value.OTHER
            else -> Value._UNKNOWN
        }

        fun known(): Known = when (this) {
            INSUFFICIENT_FUND -> Known.INSUFFICIENT_FUND
            NO_ACCOUNT -> Known.NO_ACCOUNT
            ACCOUNT_CLOSED -> Known.ACCOUNT_CLOSED
            INVALID_ACCOUNT_NUMBER_STRUCTURE -> Known.INVALID_ACCOUNT_NUMBER_STRUCTURE
            ACCOUNT_FROZEN_ENTRY_RETURNED_PER_OFAC_INSTRUCTION -> Known.ACCOUNT_FROZEN_ENTRY_RETURNED_PER_OFAC_INSTRUCTION
            CREDIT_ENTRY_REFUSED_BY_RECEIVER -> Known.CREDIT_ENTRY_REFUSED_BY_RECEIVER
            UNAUTHORIZED_DEBIT_TO_CONSUMER_ACCOUNT_USING_CORPORATE_SEC_CODE -> Known.UNAUTHORIZED_DEBIT_TO_CONSUMER_ACCOUNT_USING_CORPORATE_SEC_CODE
            CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED -> Known.CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED
            PAYMENT_STOPPED -> Known.PAYMENT_STOPPED
            NON_TRANSACTION_ACCOUNT -> Known.NON_TRANSACTION_ACCOUNT
            UNCOLLECTED_FUNDS -> Known.UNCOLLECTED_FUNDS
            ROUTING_NUMBER_CHECK_DIGIT_ERROR -> Known.ROUTING_NUMBER_CHECK_DIGIT_ERROR
            CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE -> Known.CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE
            AMOUNT_FIELD_ERROR -> Known.AMOUNT_FIELD_ERROR
            AUTHORIZATION_REVOKED_BY_CUSTOMER -> Known.AUTHORIZATION_REVOKED_BY_CUSTOMER
            INVALID_ACH_ROUTING_NUMBER -> Known.INVALID_ACH_ROUTING_NUMBER
            FILE_RECORD_EDIT_CRITERIA -> Known.FILE_RECORD_EDIT_CRITERIA
            ENR_INVALID_INDIVIDUAL_NAME -> Known.ENR_INVALID_INDIVIDUAL_NAME
            RETURNED_PER_ODFI_REQUEST -> Known.RETURNED_PER_ODFI_REQUEST
            ADDENDA_ERROR -> Known.ADDENDA_ERROR
            LIMITED_PARTICIPATION_DFI -> Known.LIMITED_PARTICIPATION_DFI
            INCORRECTLY_CODED_OUTBOUND_INTERNATIONAL_PAYMENT -> Known.INCORRECTLY_CODED_OUTBOUND_INTERNATIONAL_PAYMENT
            OTHER -> Known.OTHER
            else -> throw IncreaseInvalidDataException("Unknown Reason: $value")
        }

        fun asString(): String = _value().asStringOrThrow()
    }
}
