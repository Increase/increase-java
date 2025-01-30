// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.increase.api.core.Enum
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.Params
import com.increase.api.core.checkRequired
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import com.increase.api.core.immutableEmptyMap
import com.increase.api.core.toImmutable
import com.increase.api.errors.IncreaseInvalidDataException
import java.util.Objects
import java.util.Optional

/**
 * Simulates submission of a [Real-Time Payments Transfer](#real-time-payments-transfers) and
 * handling the response from the destination financial institution. This transfer must first have a
 * `status` of `pending_submission`.
 */
class SimulationRealTimePaymentsTransferCompleteParams
private constructor(
    private val realTimePaymentsTransferId: String,
    private val body: SimulationRealTimePaymentsTransferCompleteBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** The identifier of the Real-Time Payments Transfer you wish to complete. */
    fun realTimePaymentsTransferId(): String = realTimePaymentsTransferId

    /** If set, the simulation will reject the transfer. */
    fun rejection(): Optional<Rejection> = body.rejection()

    /** If set, the simulation will reject the transfer. */
    fun _rejection(): JsonField<Rejection> = body._rejection()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun _body(): SimulationRealTimePaymentsTransferCompleteBody = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> realTimePaymentsTransferId
            else -> ""
        }
    }

    @NoAutoDetect
    class SimulationRealTimePaymentsTransferCompleteBody
    @JsonCreator
    internal constructor(
        @JsonProperty("rejection")
        @ExcludeMissing
        private val rejection: JsonField<Rejection> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** If set, the simulation will reject the transfer. */
        fun rejection(): Optional<Rejection> =
            Optional.ofNullable(rejection.getNullable("rejection"))

        /** If set, the simulation will reject the transfer. */
        @JsonProperty("rejection")
        @ExcludeMissing
        fun _rejection(): JsonField<Rejection> = rejection

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): SimulationRealTimePaymentsTransferCompleteBody = apply {
            if (validated) {
                return@apply
            }

            rejection().ifPresent { it.validate() }
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [SimulationRealTimePaymentsTransferCompleteBody]. */
        class Builder internal constructor() {

            private var rejection: JsonField<Rejection> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                simulationRealTimePaymentsTransferCompleteBody:
                    SimulationRealTimePaymentsTransferCompleteBody
            ) = apply {
                rejection = simulationRealTimePaymentsTransferCompleteBody.rejection
                additionalProperties =
                    simulationRealTimePaymentsTransferCompleteBody.additionalProperties
                        .toMutableMap()
            }

            /** If set, the simulation will reject the transfer. */
            fun rejection(rejection: Rejection) = rejection(JsonField.of(rejection))

            /** If set, the simulation will reject the transfer. */
            fun rejection(rejection: JsonField<Rejection>) = apply { this.rejection = rejection }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
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

    /** A builder for [SimulationRealTimePaymentsTransferCompleteParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var realTimePaymentsTransferId: String? = null
        private var body: SimulationRealTimePaymentsTransferCompleteBody.Builder =
            SimulationRealTimePaymentsTransferCompleteBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            simulationRealTimePaymentsTransferCompleteParams:
                SimulationRealTimePaymentsTransferCompleteParams
        ) = apply {
            realTimePaymentsTransferId =
                simulationRealTimePaymentsTransferCompleteParams.realTimePaymentsTransferId
            body = simulationRealTimePaymentsTransferCompleteParams.body.toBuilder()
            additionalHeaders =
                simulationRealTimePaymentsTransferCompleteParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                simulationRealTimePaymentsTransferCompleteParams.additionalQueryParams.toBuilder()
        }

        /** The identifier of the Real-Time Payments Transfer you wish to complete. */
        fun realTimePaymentsTransferId(realTimePaymentsTransferId: String) = apply {
            this.realTimePaymentsTransferId = realTimePaymentsTransferId
        }

        /** If set, the simulation will reject the transfer. */
        fun rejection(rejection: Rejection) = apply { body.rejection(rejection) }

        /** If set, the simulation will reject the transfer. */
        fun rejection(rejection: JsonField<Rejection>) = apply { body.rejection(rejection) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

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

        fun build(): SimulationRealTimePaymentsTransferCompleteParams =
            SimulationRealTimePaymentsTransferCompleteParams(
                checkRequired("realTimePaymentsTransferId", realTimePaymentsTransferId),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    /** If set, the simulation will reject the transfer. */
    @NoAutoDetect
    class Rejection
    @JsonCreator
    private constructor(
        @JsonProperty("reject_reason_code")
        @ExcludeMissing
        private val rejectReasonCode: JsonField<RejectReasonCode> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The reason code that the simulated rejection will have. */
        fun rejectReasonCode(): RejectReasonCode =
            rejectReasonCode.getRequired("reject_reason_code")

        /** The reason code that the simulated rejection will have. */
        @JsonProperty("reject_reason_code")
        @ExcludeMissing
        fun _rejectReasonCode(): JsonField<RejectReasonCode> = rejectReasonCode

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Rejection = apply {
            if (validated) {
                return@apply
            }

            rejectReasonCode()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Rejection]. */
        class Builder internal constructor() {

            private var rejectReasonCode: JsonField<RejectReasonCode>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(rejection: Rejection) = apply {
                rejectReasonCode = rejection.rejectReasonCode
                additionalProperties = rejection.additionalProperties.toMutableMap()
            }

            /** The reason code that the simulated rejection will have. */
            fun rejectReasonCode(rejectReasonCode: RejectReasonCode) =
                rejectReasonCode(JsonField.of(rejectReasonCode))

            /** The reason code that the simulated rejection will have. */
            fun rejectReasonCode(rejectReasonCode: JsonField<RejectReasonCode>) = apply {
                this.rejectReasonCode = rejectReasonCode
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            fun build(): Rejection =
                Rejection(
                    checkRequired("rejectReasonCode", rejectReasonCode),
                    additionalProperties.toImmutable()
                )
        }

        /** The reason code that the simulated rejection will have. */
        class RejectReasonCode
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                /**
                 * The destination account is closed. Corresponds to the Real-Time Payments reason
                 * code `AC04`.
                 */
                @JvmField val ACCOUNT_CLOSED = of("account_closed")

                /**
                 * The destination account is currently blocked from receiving transactions.
                 * Corresponds to the Real-Time Payments reason code `AC06`.
                 */
                @JvmField val ACCOUNT_BLOCKED = of("account_blocked")

                /**
                 * The destination account is ineligible to receive Real-Time Payments transfers.
                 * Corresponds to the Real-Time Payments reason code `AC14`.
                 */
                @JvmField val INVALID_CREDITOR_ACCOUNT_TYPE = of("invalid_creditor_account_type")

                /**
                 * The destination account does not exist. Corresponds to the Real-Time Payments
                 * reason code `AC03`.
                 */
                @JvmField
                val INVALID_CREDITOR_ACCOUNT_NUMBER = of("invalid_creditor_account_number")

                /**
                 * The destination routing number is invalid. Corresponds to the Real-Time Payments
                 * reason code `RC04`.
                 */
                @JvmField
                val INVALID_CREDITOR_FINANCIAL_INSTITUTION_IDENTIFIER =
                    of("invalid_creditor_financial_institution_identifier")

                /**
                 * The destination account holder is deceased. Corresponds to the Real-Time Payments
                 * reason code `MD07`.
                 */
                @JvmField val END_CUSTOMER_DECEASED = of("end_customer_deceased")

                /**
                 * The reason is provided as narrative information in the additional information
                 * field.
                 */
                @JvmField val NARRATIVE = of("narrative")

                /**
                 * Real-Time Payments transfers are not allowed to the destination account.
                 * Corresponds to the Real-Time Payments reason code `AG01`.
                 */
                @JvmField val TRANSACTION_FORBIDDEN = of("transaction_forbidden")

                /**
                 * Real-Time Payments transfers are not enabled for the destination account.
                 * Corresponds to the Real-Time Payments reason code `AG03`.
                 */
                @JvmField val TRANSACTION_TYPE_NOT_SUPPORTED = of("transaction_type_not_supported")

                /**
                 * The amount of the transfer is different than expected by the recipient.
                 * Corresponds to the Real-Time Payments reason code `AM09`.
                 */
                @JvmField val UNEXPECTED_AMOUNT = of("unexpected_amount")

                /**
                 * The amount is higher than the recipient is authorized to send or receive.
                 * Corresponds to the Real-Time Payments reason code `AM14`.
                 */
                @JvmField val AMOUNT_EXCEEDS_BANK_LIMITS = of("amount_exceeds_bank_limits")

                /**
                 * The creditor's address is required, but missing or invalid. Corresponds to the
                 * Real-Time Payments reason code `BE04`.
                 */
                @JvmField val INVALID_CREDITOR_ADDRESS = of("invalid_creditor_address")

                /**
                 * The specified creditor is unknown. Corresponds to the Real-Time Payments reason
                 * code `BE06`.
                 */
                @JvmField val UNKNOWN_END_CUSTOMER = of("unknown_end_customer")

                /**
                 * The debtor's address is required, but missing or invalid. Corresponds to the
                 * Real-Time Payments reason code `BE07`.
                 */
                @JvmField val INVALID_DEBTOR_ADDRESS = of("invalid_debtor_address")

                /**
                 * There was a timeout processing the transfer. Corresponds to the Real-Time
                 * Payments reason code `DS24`.
                 */
                @JvmField val TIMEOUT = of("timeout")

                /**
                 * Real-Time Payments transfers are not enabled for the destination account.
                 * Corresponds to the Real-Time Payments reason code `NOAT`.
                 */
                @JvmField
                val UNSUPPORTED_MESSAGE_FOR_RECIPIENT = of("unsupported_message_for_recipient")

                /**
                 * The destination financial institution is currently not connected to Real-Time
                 * Payments. Corresponds to the Real-Time Payments reason code `9912`.
                 */
                @JvmField
                val RECIPIENT_CONNECTION_NOT_AVAILABLE = of("recipient_connection_not_available")

                /**
                 * Real-Time Payments is currently unavailable. Corresponds to the Real-Time
                 * Payments reason code `9948`.
                 */
                @JvmField val REAL_TIME_PAYMENTS_SUSPENDED = of("real_time_payments_suspended")

                /**
                 * The destination financial institution is currently signed off of Real-Time
                 * Payments. Corresponds to the Real-Time Payments reason code `9910`.
                 */
                @JvmField val INSTRUCTED_AGENT_SIGNED_OFF = of("instructed_agent_signed_off")

                /**
                 * The transfer was rejected due to an internal Increase issue. We have been
                 * notified.
                 */
                @JvmField val PROCESSING_ERROR = of("processing_error")

                /** Some other error or issue has occurred. */
                @JvmField val OTHER = of("other")

                @JvmStatic fun of(value: String) = RejectReasonCode(JsonField.of(value))
            }

            /** An enum containing [RejectReasonCode]'s known values. */
            enum class Known {
                /**
                 * The destination account is closed. Corresponds to the Real-Time Payments reason
                 * code `AC04`.
                 */
                ACCOUNT_CLOSED,
                /**
                 * The destination account is currently blocked from receiving transactions.
                 * Corresponds to the Real-Time Payments reason code `AC06`.
                 */
                ACCOUNT_BLOCKED,
                /**
                 * The destination account is ineligible to receive Real-Time Payments transfers.
                 * Corresponds to the Real-Time Payments reason code `AC14`.
                 */
                INVALID_CREDITOR_ACCOUNT_TYPE,
                /**
                 * The destination account does not exist. Corresponds to the Real-Time Payments
                 * reason code `AC03`.
                 */
                INVALID_CREDITOR_ACCOUNT_NUMBER,
                /**
                 * The destination routing number is invalid. Corresponds to the Real-Time Payments
                 * reason code `RC04`.
                 */
                INVALID_CREDITOR_FINANCIAL_INSTITUTION_IDENTIFIER,
                /**
                 * The destination account holder is deceased. Corresponds to the Real-Time Payments
                 * reason code `MD07`.
                 */
                END_CUSTOMER_DECEASED,
                /**
                 * The reason is provided as narrative information in the additional information
                 * field.
                 */
                NARRATIVE,
                /**
                 * Real-Time Payments transfers are not allowed to the destination account.
                 * Corresponds to the Real-Time Payments reason code `AG01`.
                 */
                TRANSACTION_FORBIDDEN,
                /**
                 * Real-Time Payments transfers are not enabled for the destination account.
                 * Corresponds to the Real-Time Payments reason code `AG03`.
                 */
                TRANSACTION_TYPE_NOT_SUPPORTED,
                /**
                 * The amount of the transfer is different than expected by the recipient.
                 * Corresponds to the Real-Time Payments reason code `AM09`.
                 */
                UNEXPECTED_AMOUNT,
                /**
                 * The amount is higher than the recipient is authorized to send or receive.
                 * Corresponds to the Real-Time Payments reason code `AM14`.
                 */
                AMOUNT_EXCEEDS_BANK_LIMITS,
                /**
                 * The creditor's address is required, but missing or invalid. Corresponds to the
                 * Real-Time Payments reason code `BE04`.
                 */
                INVALID_CREDITOR_ADDRESS,
                /**
                 * The specified creditor is unknown. Corresponds to the Real-Time Payments reason
                 * code `BE06`.
                 */
                UNKNOWN_END_CUSTOMER,
                /**
                 * The debtor's address is required, but missing or invalid. Corresponds to the
                 * Real-Time Payments reason code `BE07`.
                 */
                INVALID_DEBTOR_ADDRESS,
                /**
                 * There was a timeout processing the transfer. Corresponds to the Real-Time
                 * Payments reason code `DS24`.
                 */
                TIMEOUT,
                /**
                 * Real-Time Payments transfers are not enabled for the destination account.
                 * Corresponds to the Real-Time Payments reason code `NOAT`.
                 */
                UNSUPPORTED_MESSAGE_FOR_RECIPIENT,
                /**
                 * The destination financial institution is currently not connected to Real-Time
                 * Payments. Corresponds to the Real-Time Payments reason code `9912`.
                 */
                RECIPIENT_CONNECTION_NOT_AVAILABLE,
                /**
                 * Real-Time Payments is currently unavailable. Corresponds to the Real-Time
                 * Payments reason code `9948`.
                 */
                REAL_TIME_PAYMENTS_SUSPENDED,
                /**
                 * The destination financial institution is currently signed off of Real-Time
                 * Payments. Corresponds to the Real-Time Payments reason code `9910`.
                 */
                INSTRUCTED_AGENT_SIGNED_OFF,
                /**
                 * The transfer was rejected due to an internal Increase issue. We have been
                 * notified.
                 */
                PROCESSING_ERROR,
                /** Some other error or issue has occurred. */
                OTHER,
            }

            /**
             * An enum containing [RejectReasonCode]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [RejectReasonCode] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                /**
                 * The destination account is closed. Corresponds to the Real-Time Payments reason
                 * code `AC04`.
                 */
                ACCOUNT_CLOSED,
                /**
                 * The destination account is currently blocked from receiving transactions.
                 * Corresponds to the Real-Time Payments reason code `AC06`.
                 */
                ACCOUNT_BLOCKED,
                /**
                 * The destination account is ineligible to receive Real-Time Payments transfers.
                 * Corresponds to the Real-Time Payments reason code `AC14`.
                 */
                INVALID_CREDITOR_ACCOUNT_TYPE,
                /**
                 * The destination account does not exist. Corresponds to the Real-Time Payments
                 * reason code `AC03`.
                 */
                INVALID_CREDITOR_ACCOUNT_NUMBER,
                /**
                 * The destination routing number is invalid. Corresponds to the Real-Time Payments
                 * reason code `RC04`.
                 */
                INVALID_CREDITOR_FINANCIAL_INSTITUTION_IDENTIFIER,
                /**
                 * The destination account holder is deceased. Corresponds to the Real-Time Payments
                 * reason code `MD07`.
                 */
                END_CUSTOMER_DECEASED,
                /**
                 * The reason is provided as narrative information in the additional information
                 * field.
                 */
                NARRATIVE,
                /**
                 * Real-Time Payments transfers are not allowed to the destination account.
                 * Corresponds to the Real-Time Payments reason code `AG01`.
                 */
                TRANSACTION_FORBIDDEN,
                /**
                 * Real-Time Payments transfers are not enabled for the destination account.
                 * Corresponds to the Real-Time Payments reason code `AG03`.
                 */
                TRANSACTION_TYPE_NOT_SUPPORTED,
                /**
                 * The amount of the transfer is different than expected by the recipient.
                 * Corresponds to the Real-Time Payments reason code `AM09`.
                 */
                UNEXPECTED_AMOUNT,
                /**
                 * The amount is higher than the recipient is authorized to send or receive.
                 * Corresponds to the Real-Time Payments reason code `AM14`.
                 */
                AMOUNT_EXCEEDS_BANK_LIMITS,
                /**
                 * The creditor's address is required, but missing or invalid. Corresponds to the
                 * Real-Time Payments reason code `BE04`.
                 */
                INVALID_CREDITOR_ADDRESS,
                /**
                 * The specified creditor is unknown. Corresponds to the Real-Time Payments reason
                 * code `BE06`.
                 */
                UNKNOWN_END_CUSTOMER,
                /**
                 * The debtor's address is required, but missing or invalid. Corresponds to the
                 * Real-Time Payments reason code `BE07`.
                 */
                INVALID_DEBTOR_ADDRESS,
                /**
                 * There was a timeout processing the transfer. Corresponds to the Real-Time
                 * Payments reason code `DS24`.
                 */
                TIMEOUT,
                /**
                 * Real-Time Payments transfers are not enabled for the destination account.
                 * Corresponds to the Real-Time Payments reason code `NOAT`.
                 */
                UNSUPPORTED_MESSAGE_FOR_RECIPIENT,
                /**
                 * The destination financial institution is currently not connected to Real-Time
                 * Payments. Corresponds to the Real-Time Payments reason code `9912`.
                 */
                RECIPIENT_CONNECTION_NOT_AVAILABLE,
                /**
                 * Real-Time Payments is currently unavailable. Corresponds to the Real-Time
                 * Payments reason code `9948`.
                 */
                REAL_TIME_PAYMENTS_SUSPENDED,
                /**
                 * The destination financial institution is currently signed off of Real-Time
                 * Payments. Corresponds to the Real-Time Payments reason code `9910`.
                 */
                INSTRUCTED_AGENT_SIGNED_OFF,
                /**
                 * The transfer was rejected due to an internal Increase issue. We have been
                 * notified.
                 */
                PROCESSING_ERROR,
                /** Some other error or issue has occurred. */
                OTHER,
                /**
                 * An enum member indicating that [RejectReasonCode] was instantiated with an
                 * unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
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

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws IncreaseInvalidDataException if this class instance's value is a not a known
             *   member.
             */
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

        return /* spotless:off */ other is SimulationRealTimePaymentsTransferCompleteParams && realTimePaymentsTransferId == other.realTimePaymentsTransferId && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(realTimePaymentsTransferId, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "SimulationRealTimePaymentsTransferCompleteParams{realTimePaymentsTransferId=$realTimePaymentsTransferId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
