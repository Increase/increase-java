// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.increase.api.core.Enum
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import com.increase.api.core.toImmutable
import com.increase.api.errors.IncreaseInvalidDataException
import com.increase.api.models.*
import java.util.Objects

class InboundAchTransferTransferReturnParams
constructor(
    private val inboundAchTransferId: String,
    private val reason: Reason,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun inboundAchTransferId(): String = inboundAchTransferId

    fun reason(): Reason = reason

    @JvmSynthetic
    internal fun getBody(): InboundAchTransferTransferReturnBody {
        return InboundAchTransferTransferReturnBody(reason, additionalBodyProperties)
    }

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> inboundAchTransferId
            else -> ""
        }
    }

    @JsonDeserialize(builder = InboundAchTransferTransferReturnBody.Builder::class)
    @NoAutoDetect
    class InboundAchTransferTransferReturnBody
    internal constructor(
        private val reason: Reason?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /**
         * The reason why this transfer will be returned. The most usual return codes are
         * `payment_stopped` for debits and `credit_entry_refused_by_receiver` for credits.
         */
        @JsonProperty("reason") fun reason(): Reason? = reason

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var reason: Reason? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                inboundAchTransferTransferReturnBody: InboundAchTransferTransferReturnBody
            ) = apply {
                this.reason = inboundAchTransferTransferReturnBody.reason
                additionalProperties(inboundAchTransferTransferReturnBody.additionalProperties)
            }

            /**
             * The reason why this transfer will be returned. The most usual return codes are
             * `payment_stopped` for debits and `credit_entry_refused_by_receiver` for credits.
             */
            @JsonProperty("reason") fun reason(reason: Reason) = apply { this.reason = reason }

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

            fun build(): InboundAchTransferTransferReturnBody =
                InboundAchTransferTransferReturnBody(
                    checkNotNull(reason) { "`reason` is required but was not set" },
                    additionalProperties.toImmutable()
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is InboundAchTransferTransferReturnBody && this.reason == other.reason && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(reason, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "InboundAchTransferTransferReturnBody{reason=$reason, additionalProperties=$additionalProperties}"
    }

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is InboundAchTransferTransferReturnParams && this.inboundAchTransferId == other.inboundAchTransferId && this.reason == other.reason && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(inboundAchTransferId, reason, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "InboundAchTransferTransferReturnParams{inboundAchTransferId=$inboundAchTransferId, reason=$reason, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var inboundAchTransferId: String? = null
        private var reason: Reason? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            inboundAchTransferTransferReturnParams: InboundAchTransferTransferReturnParams
        ) = apply {
            this.inboundAchTransferId = inboundAchTransferTransferReturnParams.inboundAchTransferId
            this.reason = inboundAchTransferTransferReturnParams.reason
            additionalHeaders(inboundAchTransferTransferReturnParams.additionalHeaders)
            additionalQueryParams(inboundAchTransferTransferReturnParams.additionalQueryParams)
            additionalBodyProperties(
                inboundAchTransferTransferReturnParams.additionalBodyProperties
            )
        }

        /**
         * The identifier of the Inbound ACH Transfer to return to the originating financial
         * institution.
         */
        fun inboundAchTransferId(inboundAchTransferId: String) = apply {
            this.inboundAchTransferId = inboundAchTransferId
        }

        /**
         * The reason why this transfer will be returned. The most usual return codes are
         * `payment_stopped` for debits and `credit_entry_refused_by_receiver` for credits.
         */
        fun reason(reason: Reason) = apply { this.reason = reason }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun build(): InboundAchTransferTransferReturnParams =
            InboundAchTransferTransferReturnParams(
                checkNotNull(inboundAchTransferId) {
                    "`inboundAchTransferId` is required but was not set"
                },
                checkNotNull(reason) { "`reason` is required but was not set" },
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    class Reason
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Reason && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val INSUFFICIENT_FUNDS = Reason(JsonField.of("insufficient_funds"))

            @JvmField
            val RETURNED_PER_ODFI_REQUEST = Reason(JsonField.of("returned_per_odfi_request"))

            @JvmField
            val AUTHORIZATION_REVOKED_BY_CUSTOMER =
                Reason(JsonField.of("authorization_revoked_by_customer"))

            @JvmField val PAYMENT_STOPPED = Reason(JsonField.of("payment_stopped"))

            @JvmField
            val CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE =
                Reason(
                    JsonField.of("customer_advised_unauthorized_improper_ineligible_or_incomplete")
                )

            @JvmField
            val REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY =
                Reason(
                    JsonField.of(
                        "representative_payee_deceased_or_unable_to_continue_in_that_capacity"
                    )
                )

            @JvmField
            val BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED =
                Reason(JsonField.of("beneficiary_or_account_holder_deceased"))

            @JvmField
            val CREDIT_ENTRY_REFUSED_BY_RECEIVER =
                Reason(JsonField.of("credit_entry_refused_by_receiver"))

            @JvmField val DUPLICATE_ENTRY = Reason(JsonField.of("duplicate_entry"))

            @JvmField
            val CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED =
                Reason(JsonField.of("corporate_customer_advised_not_authorized"))

            @JvmStatic fun of(value: String) = Reason(JsonField.of(value))
        }

        enum class Known {
            INSUFFICIENT_FUNDS,
            RETURNED_PER_ODFI_REQUEST,
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
            INSUFFICIENT_FUNDS,
            RETURNED_PER_ODFI_REQUEST,
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

        fun value(): Value =
            when (this) {
                INSUFFICIENT_FUNDS -> Value.INSUFFICIENT_FUNDS
                RETURNED_PER_ODFI_REQUEST -> Value.RETURNED_PER_ODFI_REQUEST
                AUTHORIZATION_REVOKED_BY_CUSTOMER -> Value.AUTHORIZATION_REVOKED_BY_CUSTOMER
                PAYMENT_STOPPED -> Value.PAYMENT_STOPPED
                CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE ->
                    Value.CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE
                REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY ->
                    Value.REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY
                BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED ->
                    Value.BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED
                CREDIT_ENTRY_REFUSED_BY_RECEIVER -> Value.CREDIT_ENTRY_REFUSED_BY_RECEIVER
                DUPLICATE_ENTRY -> Value.DUPLICATE_ENTRY
                CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED ->
                    Value.CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                INSUFFICIENT_FUNDS -> Known.INSUFFICIENT_FUNDS
                RETURNED_PER_ODFI_REQUEST -> Known.RETURNED_PER_ODFI_REQUEST
                AUTHORIZATION_REVOKED_BY_CUSTOMER -> Known.AUTHORIZATION_REVOKED_BY_CUSTOMER
                PAYMENT_STOPPED -> Known.PAYMENT_STOPPED
                CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE ->
                    Known.CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE
                REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY ->
                    Known.REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY
                BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED ->
                    Known.BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED
                CREDIT_ENTRY_REFUSED_BY_RECEIVER -> Known.CREDIT_ENTRY_REFUSED_BY_RECEIVER
                DUPLICATE_ENTRY -> Known.DUPLICATE_ENTRY
                CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED ->
                    Known.CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED
                else -> throw IncreaseInvalidDataException("Unknown Reason: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
