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

class InboundAchTransferReturnCreateParams constructor(private val transactionId: String,private val reason: Reason,private val additionalQueryParams: Map<String, List<String>>,private val additionalHeaders: Map<String, List<String>>,private val additionalBodyProperties: Map<String, JsonValue>,) {

    fun transactionId(): String = transactionId

    fun reason(): Reason = reason

    @JvmSynthetic
    internal fun getBody(): InboundAchTransferReturnCreateBody {
      return InboundAchTransferReturnCreateBody(
          transactionId,
          reason,
          additionalBodyProperties,
      )
    }

    @JvmSynthetic
    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic
    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = InboundAchTransferReturnCreateBody.Builder::class)
    @NoAutoDetect
    class InboundAchTransferReturnCreateBody internal constructor(private val transactionId: String?,private val reason: Reason?,private val additionalProperties: Map<String, JsonValue>,) {

        private var hashCode: Int = 0

        /**
         * The transaction identifier of the Inbound ACH Transfer to return to the
         * originating financial institution.
         */
        @JsonProperty("transaction_id")
        fun transactionId(): String? = transactionId

        /**
         * The reason why this transfer will be returned. The most usual return codes are
         * `payment_stopped` for debits and `credit_entry_refused_by_receiver` for credits.
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

          return other is InboundAchTransferReturnCreateBody &&
              this.transactionId == other.transactionId &&
              this.reason == other.reason &&
              this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
          if (hashCode == 0) {
            hashCode = Objects.hash(
                transactionId,
                reason,
                additionalProperties,
            )
          }
          return hashCode
        }

        override fun toString() = "InboundAchTransferReturnCreateBody{transactionId=$transactionId, reason=$reason, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic
            fun builder() = Builder()
        }

        class Builder {

            private var transactionId: String? = null
            private var reason: Reason? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(inboundAchTransferReturnCreateBody: InboundAchTransferReturnCreateBody) = apply {
                this.transactionId = inboundAchTransferReturnCreateBody.transactionId
                this.reason = inboundAchTransferReturnCreateBody.reason
                additionalProperties(inboundAchTransferReturnCreateBody.additionalProperties)
            }

            /**
             * The transaction identifier of the Inbound ACH Transfer to return to the
             * originating financial institution.
             */
            @JsonProperty("transaction_id")
            fun transactionId(transactionId: String) = apply {
                this.transactionId = transactionId
            }

            /**
             * The reason why this transfer will be returned. The most usual return codes are
             * `payment_stopped` for debits and `credit_entry_refused_by_receiver` for credits.
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

            fun build(): InboundAchTransferReturnCreateBody = InboundAchTransferReturnCreateBody(
                checkNotNull(transactionId) {
                    "`transactionId` is required but was not set"
                },
                checkNotNull(reason) {
                    "`reason` is required but was not set"
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

      return other is InboundAchTransferReturnCreateParams &&
          this.transactionId == other.transactionId &&
          this.reason == other.reason &&
          this.additionalQueryParams == other.additionalQueryParams &&
          this.additionalHeaders == other.additionalHeaders &&
          this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
      return Objects.hash(
          transactionId,
          reason,
          additionalQueryParams,
          additionalHeaders,
          additionalBodyProperties,
      )
    }

    override fun toString() = "InboundAchTransferReturnCreateParams{transactionId=$transactionId, reason=$reason, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic
        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var transactionId: String? = null
        private var reason: Reason? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(inboundAchTransferReturnCreateParams: InboundAchTransferReturnCreateParams) = apply {
            this.transactionId = inboundAchTransferReturnCreateParams.transactionId
            this.reason = inboundAchTransferReturnCreateParams.reason
            additionalQueryParams(inboundAchTransferReturnCreateParams.additionalQueryParams)
            additionalHeaders(inboundAchTransferReturnCreateParams.additionalHeaders)
            additionalBodyProperties(inboundAchTransferReturnCreateParams.additionalBodyProperties)
        }

        /**
         * The transaction identifier of the Inbound ACH Transfer to return to the
         * originating financial institution.
         */
        fun transactionId(transactionId: String) = apply {
            this.transactionId = transactionId
        }

        /**
         * The reason why this transfer will be returned. The most usual return codes are
         * `payment_stopped` for debits and `credit_entry_refused_by_receiver` for credits.
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

        fun build(): InboundAchTransferReturnCreateParams = InboundAchTransferReturnCreateParams(
            checkNotNull(transactionId) {
                "`transactionId` is required but was not set"
            },
            checkNotNull(reason) {
                "`reason` is required but was not set"
            },
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

            @JvmField val AUTHORIZATION_REVOKED_BY_CUSTOMER = Reason(JsonField.of("authorization_revoked_by_customer"))

            @JvmField val PAYMENT_STOPPED = Reason(JsonField.of("payment_stopped"))

            @JvmField val CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE = Reason(JsonField.of("customer_advised_unauthorized_improper_ineligible_or_incomplete"))

            @JvmField val REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY = Reason(JsonField.of("representative_payee_deceased_or_unable_to_continue_in_that_capacity"))

            @JvmField val BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED = Reason(JsonField.of("beneficiary_or_account_holder_deceased"))

            @JvmField val CREDIT_ENTRY_REFUSED_BY_RECEIVER = Reason(JsonField.of("credit_entry_refused_by_receiver"))

            @JvmField val DUPLICATE_ENTRY = Reason(JsonField.of("duplicate_entry"))

            @JvmField val CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED = Reason(JsonField.of("corporate_customer_advised_not_authorized"))

            @JvmStatic fun of(value: String) = Reason(JsonField.of(value))
        }

        enum class Known {
            AUTHORIZATION_REVOKED_BY_CUSTOMER,
            PAYMENT_STOPPED,
            CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE,
            REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY,
            BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED,
            CREDIT_ENTRY_REFUSED_BY_RECEIVER,
            DUPLICATE_ENTRY,
            CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED,
        }

        enum class Value {
            AUTHORIZATION_REVOKED_BY_CUSTOMER,
            PAYMENT_STOPPED,
            CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE,
            REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY,
            BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED,
            CREDIT_ENTRY_REFUSED_BY_RECEIVER,
            DUPLICATE_ENTRY,
            CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED,
            _UNKNOWN,
        }

        fun value(): Value = when (this) {
            AUTHORIZATION_REVOKED_BY_CUSTOMER -> Value.AUTHORIZATION_REVOKED_BY_CUSTOMER
            PAYMENT_STOPPED -> Value.PAYMENT_STOPPED
            CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE -> Value.CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE
            REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY -> Value.REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY
            BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED -> Value.BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED
            CREDIT_ENTRY_REFUSED_BY_RECEIVER -> Value.CREDIT_ENTRY_REFUSED_BY_RECEIVER
            DUPLICATE_ENTRY -> Value.DUPLICATE_ENTRY
            CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED -> Value.CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED
            else -> Value._UNKNOWN
        }

        fun known(): Known = when (this) {
            AUTHORIZATION_REVOKED_BY_CUSTOMER -> Known.AUTHORIZATION_REVOKED_BY_CUSTOMER
            PAYMENT_STOPPED -> Known.PAYMENT_STOPPED
            CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE -> Known.CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE
            REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY -> Known.REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY
            BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED -> Known.BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED
            CREDIT_ENTRY_REFUSED_BY_RECEIVER -> Known.CREDIT_ENTRY_REFUSED_BY_RECEIVER
            DUPLICATE_ENTRY -> Known.DUPLICATE_ENTRY
            CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED -> Known.CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED
            else -> throw IncreaseInvalidDataException("Unknown Reason: $value")
        }

        fun asString(): String = _value().asStringOrThrow()
    }
}
