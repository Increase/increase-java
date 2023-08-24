package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.toUnmodifiable
import com.increase.api.errors.IncreaseInvalidDataException
import com.increase.api.models.*
import java.util.Objects
import java.util.Optional

class SimulationRealTimePaymentsTransferCompleteParams
constructor(
    private val realTimePaymentsTransferId: String,
    private val rejection: Rejection?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun realTimePaymentsTransferId(): String = realTimePaymentsTransferId

    fun rejection(): Optional<Rejection> = Optional.ofNullable(rejection)

    @JvmSynthetic
    internal fun getBody(): SimulationRealTimePaymentsTransferCompleteBody {
        return SimulationRealTimePaymentsTransferCompleteBody(rejection, additionalBodyProperties)
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

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

        private var hashCode: Int = 0

        /** If set, the simulation will reject the transfer. */
        @JsonProperty("rejection") fun rejection(): Rejection? = rejection

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is SimulationRealTimePaymentsTransferCompleteBody &&
                this.rejection == other.rejection &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = Objects.hash(rejection, additionalProperties)
            }
            return hashCode
        }

        override fun toString() =
            "SimulationRealTimePaymentsTransferCompleteBody{rejection=$rejection, additionalProperties=$additionalProperties}"

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
                    additionalProperties.toUnmodifiable()
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

        return other is SimulationRealTimePaymentsTransferCompleteParams &&
            this.realTimePaymentsTransferId == other.realTimePaymentsTransferId &&
            this.rejection == other.rejection &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            realTimePaymentsTransferId,
            rejection,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "SimulationRealTimePaymentsTransferCompleteParams{realTimePaymentsTransferId=$realTimePaymentsTransferId, rejection=$rejection, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var realTimePaymentsTransferId: String? = null
        private var rejection: Rejection? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            simulationRealTimePaymentsTransferCompleteParams:
                SimulationRealTimePaymentsTransferCompleteParams
        ) = apply {
            this.realTimePaymentsTransferId =
                simulationRealTimePaymentsTransferCompleteParams.realTimePaymentsTransferId
            this.rejection = simulationRealTimePaymentsTransferCompleteParams.rejection
            additionalQueryParams(
                simulationRealTimePaymentsTransferCompleteParams.additionalQueryParams
            )
            additionalHeaders(simulationRealTimePaymentsTransferCompleteParams.additionalHeaders)
            additionalBodyProperties(
                simulationRealTimePaymentsTransferCompleteParams.additionalBodyProperties
            )
        }

        /** The identifier of the Real-Time Payments Transfer you wish to complete. */
        fun realTimePaymentsTransferId(realTimePaymentsTransferId: String) = apply {
            this.realTimePaymentsTransferId = realTimePaymentsTransferId
        }

        /** If set, the simulation will reject the transfer. */
        fun rejection(rejection: Rejection) = apply { this.rejection = rejection }

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

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

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

        fun build(): SimulationRealTimePaymentsTransferCompleteParams =
            SimulationRealTimePaymentsTransferCompleteParams(
                checkNotNull(realTimePaymentsTransferId) {
                    "`realTimePaymentsTransferId` is required but was not set"
                },
                rejection,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
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

        private var hashCode: Int = 0

        /** The reason code that the simulated rejection will have. */
        @JsonProperty("reject_reason_code")
        fun rejectReasonCode(): RejectReasonCode? = rejectReasonCode

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Rejection &&
                this.rejectReasonCode == other.rejectReasonCode &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = Objects.hash(rejectReasonCode, additionalProperties)
            }
            return hashCode
        }

        override fun toString() =
            "Rejection{rejectReasonCode=$rejectReasonCode, additionalProperties=$additionalProperties}"

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
                    additionalProperties.toUnmodifiable()
                )
        }

        class RejectReasonCode
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is RejectReasonCode && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val ACCOUNT_CLOSED = RejectReasonCode(JsonField.of("account_closed"))

                @JvmField val ACCOUNT_BLOCKED = RejectReasonCode(JsonField.of("account_blocked"))

                @JvmField
                val INVALID_CREDITOR_ACCOUNT_TYPE =
                    RejectReasonCode(JsonField.of("invalid_creditor_account_type"))

                @JvmField
                val INVALID_CREDITOR_ACCOUNT_NUMBER =
                    RejectReasonCode(JsonField.of("invalid_creditor_account_number"))

                @JvmField
                val INVALID_CREDITOR_FINANCIAL_INSTITUTION_IDENTIFIER =
                    RejectReasonCode(
                        JsonField.of("invalid_creditor_financial_institution_identifier")
                    )

                @JvmField
                val END_CUSTOMER_DECEASED = RejectReasonCode(JsonField.of("end_customer_deceased"))

                @JvmField val NARRATIVE = RejectReasonCode(JsonField.of("narrative"))

                @JvmField
                val TRANSACTION_FORBIDDEN = RejectReasonCode(JsonField.of("transaction_forbidden"))

                @JvmField
                val TRANSACTION_TYPE_NOT_SUPPORTED =
                    RejectReasonCode(JsonField.of("transaction_type_not_supported"))

                @JvmField
                val UNEXPECTED_AMOUNT = RejectReasonCode(JsonField.of("unexpected_amount"))

                @JvmField
                val AMOUNT_EXCEEDS_BANK_LIMITS =
                    RejectReasonCode(JsonField.of("amount_exceeds_bank_limits"))

                @JvmField
                val INVALID_CREDITOR_ADDRESS =
                    RejectReasonCode(JsonField.of("invalid_creditor_address"))

                @JvmField
                val UNKNOWN_END_CUSTOMER = RejectReasonCode(JsonField.of("unknown_end_customer"))

                @JvmField
                val INVALID_DEBTOR_ADDRESS =
                    RejectReasonCode(JsonField.of("invalid_debtor_address"))

                @JvmField val TIMEOUT = RejectReasonCode(JsonField.of("timeout"))

                @JvmField
                val UNSUPPORTED_MESSAGE_FOR_RECIPIENT =
                    RejectReasonCode(JsonField.of("unsupported_message_for_recipient"))

                @JvmField
                val RECIPIENT_CONNECTION_NOT_AVAILABLE =
                    RejectReasonCode(JsonField.of("recipient_connection_not_available"))

                @JvmField
                val REAL_TIME_PAYMENTS_SUSPENDED =
                    RejectReasonCode(JsonField.of("real_time_payments_suspended"))

                @JvmField
                val INSTRUCTED_AGENT_SIGNED_OFF =
                    RejectReasonCode(JsonField.of("instructed_agent_signed_off"))

                @JvmField val PROCESSING_ERROR = RejectReasonCode(JsonField.of("processing_error"))

                @JvmField val OTHER = RejectReasonCode(JsonField.of("other"))

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
        }
    }
}
