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
import java.util.Optional

class SimulationRealTimePaymentsTransferCompleteParams
constructor(
    private val realTimePaymentsTransferId: String,
    private val rejection: Rejection?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun realTimePaymentsTransferId(): String = realTimePaymentsTransferId

    fun rejection(): Optional<Rejection> = Optional.ofNullable(rejection)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    @JvmSynthetic
    internal fun getBody(): SimulationRealTimePaymentsTransferCompleteBody {
        return SimulationRealTimePaymentsTransferCompleteBody(rejection, additionalBodyProperties)
    }

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> realTimePaymentsTransferId
            else -> ""
        }
    }

    @JsonDeserialize(builder = SimulationRealTimePaymentsTransferCompleteBody.Builder::class)
    @NoAutoDetect
    class SimulationRealTimePaymentsTransferCompleteBody
    internal constructor(
        private val rejection: Rejection?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** If set, the simulation will reject the transfer. */
        @JsonProperty("rejection") fun rejection(): Rejection? = rejection

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var rejection: Rejection? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                simulationRealTimePaymentsTransferCompleteBody:
                    SimulationRealTimePaymentsTransferCompleteBody
            ) = apply {
                this.rejection = simulationRealTimePaymentsTransferCompleteBody.rejection
                additionalProperties(
                    simulationRealTimePaymentsTransferCompleteBody.additionalProperties
                )
            }

            /** If set, the simulation will reject the transfer. */
            @JsonProperty("rejection")
            fun rejection(rejection: Rejection) = apply { this.rejection = rejection }

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

            fun build(): SimulationRealTimePaymentsTransferCompleteBody =
                SimulationRealTimePaymentsTransferCompleteBody(
                    rejection,
                    additionalProperties.toImmutable()
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is SimulationRealTimePaymentsTransferCompleteBody && rejection == other.rejection && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(rejection, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SimulationRealTimePaymentsTransferCompleteBody{rejection=$rejection, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var realTimePaymentsTransferId: String? = null
        private var rejection: Rejection? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            simulationRealTimePaymentsTransferCompleteParams:
                SimulationRealTimePaymentsTransferCompleteParams
        ) = apply {
            realTimePaymentsTransferId =
                simulationRealTimePaymentsTransferCompleteParams.realTimePaymentsTransferId
            rejection = simulationRealTimePaymentsTransferCompleteParams.rejection
            additionalHeaders =
                simulationRealTimePaymentsTransferCompleteParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                simulationRealTimePaymentsTransferCompleteParams.additionalQueryParams.toBuilder()
            additionalBodyProperties =
                simulationRealTimePaymentsTransferCompleteParams.additionalBodyProperties
                    .toMutableMap()
        }

        /** The identifier of the Real-Time Payments Transfer you wish to complete. */
        fun realTimePaymentsTransferId(realTimePaymentsTransferId: String) = apply {
            this.realTimePaymentsTransferId = realTimePaymentsTransferId
        }

        /** If set, the simulation will reject the transfer. */
        fun rejection(rejection: Rejection) = apply { this.rejection = rejection }

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
            putAllAdditionalBodyProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply {
            additionalBodyProperties.remove(key)
        }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalBodyProperty)
        }

        fun build(): SimulationRealTimePaymentsTransferCompleteParams =
            SimulationRealTimePaymentsTransferCompleteParams(
                checkNotNull(realTimePaymentsTransferId) {
                    "`realTimePaymentsTransferId` is required but was not set"
                },
                rejection,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    /** If set, the simulation will reject the transfer. */
    @JsonDeserialize(builder = Rejection.Builder::class)
    @NoAutoDetect
    class Rejection
    private constructor(
        private val rejectReasonCode: RejectReasonCode?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The reason code that the simulated rejection will have. */
        @JsonProperty("reject_reason_code")
        fun rejectReasonCode(): RejectReasonCode? = rejectReasonCode

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var rejectReasonCode: RejectReasonCode? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(rejection: Rejection) = apply {
                this.rejectReasonCode = rejection.rejectReasonCode
                additionalProperties(rejection.additionalProperties)
            }

            /** The reason code that the simulated rejection will have. */
            @JsonProperty("reject_reason_code")
            fun rejectReasonCode(rejectReasonCode: RejectReasonCode) = apply {
                this.rejectReasonCode = rejectReasonCode
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

            fun build(): Rejection =
                Rejection(
                    checkNotNull(rejectReasonCode) {
                        "`rejectReasonCode` is required but was not set"
                    },
                    additionalProperties.toImmutable()
                )
        }

        class RejectReasonCode
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val ACCOUNT_CLOSED = of("account_closed")

                @JvmField val ACCOUNT_BLOCKED = of("account_blocked")

                @JvmField val INVALID_CREDITOR_ACCOUNT_TYPE = of("invalid_creditor_account_type")

                @JvmField
                val INVALID_CREDITOR_ACCOUNT_NUMBER = of("invalid_creditor_account_number")

                @JvmField
                val INVALID_CREDITOR_FINANCIAL_INSTITUTION_IDENTIFIER =
                    of("invalid_creditor_financial_institution_identifier")

                @JvmField val END_CUSTOMER_DECEASED = of("end_customer_deceased")

                @JvmField val NARRATIVE = of("narrative")

                @JvmField val TRANSACTION_FORBIDDEN = of("transaction_forbidden")

                @JvmField val TRANSACTION_TYPE_NOT_SUPPORTED = of("transaction_type_not_supported")

                @JvmField val UNEXPECTED_AMOUNT = of("unexpected_amount")

                @JvmField val AMOUNT_EXCEEDS_BANK_LIMITS = of("amount_exceeds_bank_limits")

                @JvmField val INVALID_CREDITOR_ADDRESS = of("invalid_creditor_address")

                @JvmField val UNKNOWN_END_CUSTOMER = of("unknown_end_customer")

                @JvmField val INVALID_DEBTOR_ADDRESS = of("invalid_debtor_address")

                @JvmField val TIMEOUT = of("timeout")

                @JvmField
                val UNSUPPORTED_MESSAGE_FOR_RECIPIENT = of("unsupported_message_for_recipient")

                @JvmField
                val RECIPIENT_CONNECTION_NOT_AVAILABLE = of("recipient_connection_not_available")

                @JvmField val REAL_TIME_PAYMENTS_SUSPENDED = of("real_time_payments_suspended")

                @JvmField val INSTRUCTED_AGENT_SIGNED_OFF = of("instructed_agent_signed_off")

                @JvmField val PROCESSING_ERROR = of("processing_error")

                @JvmField val OTHER = of("other")

                @JvmStatic fun of(value: String) = RejectReasonCode(JsonField.of(value))
            }

            enum class Known {
                ACCOUNT_CLOSED,
                ACCOUNT_BLOCKED,
                INVALID_CREDITOR_ACCOUNT_TYPE,
                INVALID_CREDITOR_ACCOUNT_NUMBER,
                INVALID_CREDITOR_FINANCIAL_INSTITUTION_IDENTIFIER,
                END_CUSTOMER_DECEASED,
                NARRATIVE,
                TRANSACTION_FORBIDDEN,
                TRANSACTION_TYPE_NOT_SUPPORTED,
                UNEXPECTED_AMOUNT,
                AMOUNT_EXCEEDS_BANK_LIMITS,
                INVALID_CREDITOR_ADDRESS,
                UNKNOWN_END_CUSTOMER,
                INVALID_DEBTOR_ADDRESS,
                TIMEOUT,
                UNSUPPORTED_MESSAGE_FOR_RECIPIENT,
                RECIPIENT_CONNECTION_NOT_AVAILABLE,
                REAL_TIME_PAYMENTS_SUSPENDED,
                INSTRUCTED_AGENT_SIGNED_OFF,
                PROCESSING_ERROR,
                OTHER,
            }

            enum class Value {
                ACCOUNT_CLOSED,
                ACCOUNT_BLOCKED,
                INVALID_CREDITOR_ACCOUNT_TYPE,
                INVALID_CREDITOR_ACCOUNT_NUMBER,
                INVALID_CREDITOR_FINANCIAL_INSTITUTION_IDENTIFIER,
                END_CUSTOMER_DECEASED,
                NARRATIVE,
                TRANSACTION_FORBIDDEN,
                TRANSACTION_TYPE_NOT_SUPPORTED,
                UNEXPECTED_AMOUNT,
                AMOUNT_EXCEEDS_BANK_LIMITS,
                INVALID_CREDITOR_ADDRESS,
                UNKNOWN_END_CUSTOMER,
                INVALID_DEBTOR_ADDRESS,
                TIMEOUT,
                UNSUPPORTED_MESSAGE_FOR_RECIPIENT,
                RECIPIENT_CONNECTION_NOT_AVAILABLE,
                REAL_TIME_PAYMENTS_SUSPENDED,
                INSTRUCTED_AGENT_SIGNED_OFF,
                PROCESSING_ERROR,
                OTHER,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    ACCOUNT_CLOSED -> Value.ACCOUNT_CLOSED
                    ACCOUNT_BLOCKED -> Value.ACCOUNT_BLOCKED
                    INVALID_CREDITOR_ACCOUNT_TYPE -> Value.INVALID_CREDITOR_ACCOUNT_TYPE
                    INVALID_CREDITOR_ACCOUNT_NUMBER -> Value.INVALID_CREDITOR_ACCOUNT_NUMBER
                    INVALID_CREDITOR_FINANCIAL_INSTITUTION_IDENTIFIER ->
                        Value.INVALID_CREDITOR_FINANCIAL_INSTITUTION_IDENTIFIER
                    END_CUSTOMER_DECEASED -> Value.END_CUSTOMER_DECEASED
                    NARRATIVE -> Value.NARRATIVE
                    TRANSACTION_FORBIDDEN -> Value.TRANSACTION_FORBIDDEN
                    TRANSACTION_TYPE_NOT_SUPPORTED -> Value.TRANSACTION_TYPE_NOT_SUPPORTED
                    UNEXPECTED_AMOUNT -> Value.UNEXPECTED_AMOUNT
                    AMOUNT_EXCEEDS_BANK_LIMITS -> Value.AMOUNT_EXCEEDS_BANK_LIMITS
                    INVALID_CREDITOR_ADDRESS -> Value.INVALID_CREDITOR_ADDRESS
                    UNKNOWN_END_CUSTOMER -> Value.UNKNOWN_END_CUSTOMER
                    INVALID_DEBTOR_ADDRESS -> Value.INVALID_DEBTOR_ADDRESS
                    TIMEOUT -> Value.TIMEOUT
                    UNSUPPORTED_MESSAGE_FOR_RECIPIENT -> Value.UNSUPPORTED_MESSAGE_FOR_RECIPIENT
                    RECIPIENT_CONNECTION_NOT_AVAILABLE -> Value.RECIPIENT_CONNECTION_NOT_AVAILABLE
                    REAL_TIME_PAYMENTS_SUSPENDED -> Value.REAL_TIME_PAYMENTS_SUSPENDED
                    INSTRUCTED_AGENT_SIGNED_OFF -> Value.INSTRUCTED_AGENT_SIGNED_OFF
                    PROCESSING_ERROR -> Value.PROCESSING_ERROR
                    OTHER -> Value.OTHER
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    ACCOUNT_CLOSED -> Known.ACCOUNT_CLOSED
                    ACCOUNT_BLOCKED -> Known.ACCOUNT_BLOCKED
                    INVALID_CREDITOR_ACCOUNT_TYPE -> Known.INVALID_CREDITOR_ACCOUNT_TYPE
                    INVALID_CREDITOR_ACCOUNT_NUMBER -> Known.INVALID_CREDITOR_ACCOUNT_NUMBER
                    INVALID_CREDITOR_FINANCIAL_INSTITUTION_IDENTIFIER ->
                        Known.INVALID_CREDITOR_FINANCIAL_INSTITUTION_IDENTIFIER
                    END_CUSTOMER_DECEASED -> Known.END_CUSTOMER_DECEASED
                    NARRATIVE -> Known.NARRATIVE
                    TRANSACTION_FORBIDDEN -> Known.TRANSACTION_FORBIDDEN
                    TRANSACTION_TYPE_NOT_SUPPORTED -> Known.TRANSACTION_TYPE_NOT_SUPPORTED
                    UNEXPECTED_AMOUNT -> Known.UNEXPECTED_AMOUNT
                    AMOUNT_EXCEEDS_BANK_LIMITS -> Known.AMOUNT_EXCEEDS_BANK_LIMITS
                    INVALID_CREDITOR_ADDRESS -> Known.INVALID_CREDITOR_ADDRESS
                    UNKNOWN_END_CUSTOMER -> Known.UNKNOWN_END_CUSTOMER
                    INVALID_DEBTOR_ADDRESS -> Known.INVALID_DEBTOR_ADDRESS
                    TIMEOUT -> Known.TIMEOUT
                    UNSUPPORTED_MESSAGE_FOR_RECIPIENT -> Known.UNSUPPORTED_MESSAGE_FOR_RECIPIENT
                    RECIPIENT_CONNECTION_NOT_AVAILABLE -> Known.RECIPIENT_CONNECTION_NOT_AVAILABLE
                    REAL_TIME_PAYMENTS_SUSPENDED -> Known.REAL_TIME_PAYMENTS_SUSPENDED
                    INSTRUCTED_AGENT_SIGNED_OFF -> Known.INSTRUCTED_AGENT_SIGNED_OFF
                    PROCESSING_ERROR -> Known.PROCESSING_ERROR
                    OTHER -> Known.OTHER
                    else -> throw IncreaseInvalidDataException("Unknown RejectReasonCode: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is RejectReasonCode && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Rejection && rejectReasonCode == other.rejectReasonCode && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(rejectReasonCode, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Rejection{rejectReasonCode=$rejectReasonCode, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SimulationRealTimePaymentsTransferCompleteParams && realTimePaymentsTransferId == other.realTimePaymentsTransferId && rejection == other.rejection && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(realTimePaymentsTransferId, rejection, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "SimulationRealTimePaymentsTransferCompleteParams{realTimePaymentsTransferId=$realTimePaymentsTransferId, rejection=$rejection, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}
