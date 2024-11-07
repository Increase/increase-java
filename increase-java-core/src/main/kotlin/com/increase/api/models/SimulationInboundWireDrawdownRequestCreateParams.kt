// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import com.increase.api.core.toImmutable
import com.increase.api.models.*
import java.util.Objects
import java.util.Optional

class SimulationInboundWireDrawdownRequestCreateParams
constructor(
    private val amount: Long,
    private val beneficiaryAccountNumber: String,
    private val beneficiaryRoutingNumber: String,
    private val currency: String,
    private val messageToRecipient: String,
    private val originatorAccountNumber: String,
    private val originatorRoutingNumber: String,
    private val recipientAccountNumberId: String,
    private val beneficiaryAddressLine1: String?,
    private val beneficiaryAddressLine2: String?,
    private val beneficiaryAddressLine3: String?,
    private val beneficiaryName: String?,
    private val originatorAddressLine1: String?,
    private val originatorAddressLine2: String?,
    private val originatorAddressLine3: String?,
    private val originatorName: String?,
    private val originatorToBeneficiaryInformationLine1: String?,
    private val originatorToBeneficiaryInformationLine2: String?,
    private val originatorToBeneficiaryInformationLine3: String?,
    private val originatorToBeneficiaryInformationLine4: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun amount(): Long = amount

    fun beneficiaryAccountNumber(): String = beneficiaryAccountNumber

    fun beneficiaryRoutingNumber(): String = beneficiaryRoutingNumber

    fun currency(): String = currency

    fun messageToRecipient(): String = messageToRecipient

    fun originatorAccountNumber(): String = originatorAccountNumber

    fun originatorRoutingNumber(): String = originatorRoutingNumber

    fun recipientAccountNumberId(): String = recipientAccountNumberId

    fun beneficiaryAddressLine1(): Optional<String> = Optional.ofNullable(beneficiaryAddressLine1)

    fun beneficiaryAddressLine2(): Optional<String> = Optional.ofNullable(beneficiaryAddressLine2)

    fun beneficiaryAddressLine3(): Optional<String> = Optional.ofNullable(beneficiaryAddressLine3)

    fun beneficiaryName(): Optional<String> = Optional.ofNullable(beneficiaryName)

    fun originatorAddressLine1(): Optional<String> = Optional.ofNullable(originatorAddressLine1)

    fun originatorAddressLine2(): Optional<String> = Optional.ofNullable(originatorAddressLine2)

    fun originatorAddressLine3(): Optional<String> = Optional.ofNullable(originatorAddressLine3)

    fun originatorName(): Optional<String> = Optional.ofNullable(originatorName)

    fun originatorToBeneficiaryInformationLine1(): Optional<String> =
        Optional.ofNullable(originatorToBeneficiaryInformationLine1)

    fun originatorToBeneficiaryInformationLine2(): Optional<String> =
        Optional.ofNullable(originatorToBeneficiaryInformationLine2)

    fun originatorToBeneficiaryInformationLine3(): Optional<String> =
        Optional.ofNullable(originatorToBeneficiaryInformationLine3)

    fun originatorToBeneficiaryInformationLine4(): Optional<String> =
        Optional.ofNullable(originatorToBeneficiaryInformationLine4)

    @JvmSynthetic
    internal fun getBody(): SimulationInboundWireDrawdownRequestCreateBody {
        return SimulationInboundWireDrawdownRequestCreateBody(
            amount,
            beneficiaryAccountNumber,
            beneficiaryRoutingNumber,
            currency,
            messageToRecipient,
            originatorAccountNumber,
            originatorRoutingNumber,
            recipientAccountNumberId,
            beneficiaryAddressLine1,
            beneficiaryAddressLine2,
            beneficiaryAddressLine3,
            beneficiaryName,
            originatorAddressLine1,
            originatorAddressLine2,
            originatorAddressLine3,
            originatorName,
            originatorToBeneficiaryInformationLine1,
            originatorToBeneficiaryInformationLine2,
            originatorToBeneficiaryInformationLine3,
            originatorToBeneficiaryInformationLine4,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @JsonDeserialize(builder = SimulationInboundWireDrawdownRequestCreateBody.Builder::class)
    @NoAutoDetect
    class SimulationInboundWireDrawdownRequestCreateBody
    internal constructor(
        private val amount: Long?,
        private val beneficiaryAccountNumber: String?,
        private val beneficiaryRoutingNumber: String?,
        private val currency: String?,
        private val messageToRecipient: String?,
        private val originatorAccountNumber: String?,
        private val originatorRoutingNumber: String?,
        private val recipientAccountNumberId: String?,
        private val beneficiaryAddressLine1: String?,
        private val beneficiaryAddressLine2: String?,
        private val beneficiaryAddressLine3: String?,
        private val beneficiaryName: String?,
        private val originatorAddressLine1: String?,
        private val originatorAddressLine2: String?,
        private val originatorAddressLine3: String?,
        private val originatorName: String?,
        private val originatorToBeneficiaryInformationLine1: String?,
        private val originatorToBeneficiaryInformationLine2: String?,
        private val originatorToBeneficiaryInformationLine3: String?,
        private val originatorToBeneficiaryInformationLine4: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The amount being requested in cents. */
        @JsonProperty("amount") fun amount(): Long? = amount

        /** The drawdown request's beneficiary's account number. */
        @JsonProperty("beneficiary_account_number")
        fun beneficiaryAccountNumber(): String? = beneficiaryAccountNumber

        /** The drawdown request's beneficiary's routing number. */
        @JsonProperty("beneficiary_routing_number")
        fun beneficiaryRoutingNumber(): String? = beneficiaryRoutingNumber

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the amount being
         * requested. Will always be "USD".
         */
        @JsonProperty("currency") fun currency(): String? = currency

        /** A message from the drawdown request's originator. */
        @JsonProperty("message_to_recipient") fun messageToRecipient(): String? = messageToRecipient

        /** The drawdown request's originator's account number. */
        @JsonProperty("originator_account_number")
        fun originatorAccountNumber(): String? = originatorAccountNumber

        /** The drawdown request's originator's routing number. */
        @JsonProperty("originator_routing_number")
        fun originatorRoutingNumber(): String? = originatorRoutingNumber

        /**
         * The Account Number to which the recipient of this request is being requested to send
         * funds from.
         */
        @JsonProperty("recipient_account_number_id")
        fun recipientAccountNumberId(): String? = recipientAccountNumberId

        /** Line 1 of the drawdown request's beneficiary's address. */
        @JsonProperty("beneficiary_address_line1")
        fun beneficiaryAddressLine1(): String? = beneficiaryAddressLine1

        /** Line 2 of the drawdown request's beneficiary's address. */
        @JsonProperty("beneficiary_address_line2")
        fun beneficiaryAddressLine2(): String? = beneficiaryAddressLine2

        /** Line 3 of the drawdown request's beneficiary's address. */
        @JsonProperty("beneficiary_address_line3")
        fun beneficiaryAddressLine3(): String? = beneficiaryAddressLine3

        /** The drawdown request's beneficiary's name. */
        @JsonProperty("beneficiary_name") fun beneficiaryName(): String? = beneficiaryName

        /** Line 1 of the drawdown request's originator's address. */
        @JsonProperty("originator_address_line1")
        fun originatorAddressLine1(): String? = originatorAddressLine1

        /** Line 2 of the drawdown request's originator's address. */
        @JsonProperty("originator_address_line2")
        fun originatorAddressLine2(): String? = originatorAddressLine2

        /** Line 3 of the drawdown request's originator's address. */
        @JsonProperty("originator_address_line3")
        fun originatorAddressLine3(): String? = originatorAddressLine3

        /** The drawdown request's originator's name. */
        @JsonProperty("originator_name") fun originatorName(): String? = originatorName

        /**
         * Line 1 of the information conveyed from the originator of the message to the beneficiary.
         */
        @JsonProperty("originator_to_beneficiary_information_line1")
        fun originatorToBeneficiaryInformationLine1(): String? =
            originatorToBeneficiaryInformationLine1

        /**
         * Line 2 of the information conveyed from the originator of the message to the beneficiary.
         */
        @JsonProperty("originator_to_beneficiary_information_line2")
        fun originatorToBeneficiaryInformationLine2(): String? =
            originatorToBeneficiaryInformationLine2

        /**
         * Line 3 of the information conveyed from the originator of the message to the beneficiary.
         */
        @JsonProperty("originator_to_beneficiary_information_line3")
        fun originatorToBeneficiaryInformationLine3(): String? =
            originatorToBeneficiaryInformationLine3

        /**
         * Line 4 of the information conveyed from the originator of the message to the beneficiary.
         */
        @JsonProperty("originator_to_beneficiary_information_line4")
        fun originatorToBeneficiaryInformationLine4(): String? =
            originatorToBeneficiaryInformationLine4

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var amount: Long? = null
            private var beneficiaryAccountNumber: String? = null
            private var beneficiaryRoutingNumber: String? = null
            private var currency: String? = null
            private var messageToRecipient: String? = null
            private var originatorAccountNumber: String? = null
            private var originatorRoutingNumber: String? = null
            private var recipientAccountNumberId: String? = null
            private var beneficiaryAddressLine1: String? = null
            private var beneficiaryAddressLine2: String? = null
            private var beneficiaryAddressLine3: String? = null
            private var beneficiaryName: String? = null
            private var originatorAddressLine1: String? = null
            private var originatorAddressLine2: String? = null
            private var originatorAddressLine3: String? = null
            private var originatorName: String? = null
            private var originatorToBeneficiaryInformationLine1: String? = null
            private var originatorToBeneficiaryInformationLine2: String? = null
            private var originatorToBeneficiaryInformationLine3: String? = null
            private var originatorToBeneficiaryInformationLine4: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                simulationInboundWireDrawdownRequestCreateBody:
                    SimulationInboundWireDrawdownRequestCreateBody
            ) = apply {
                this.amount = simulationInboundWireDrawdownRequestCreateBody.amount
                this.beneficiaryAccountNumber =
                    simulationInboundWireDrawdownRequestCreateBody.beneficiaryAccountNumber
                this.beneficiaryRoutingNumber =
                    simulationInboundWireDrawdownRequestCreateBody.beneficiaryRoutingNumber
                this.currency = simulationInboundWireDrawdownRequestCreateBody.currency
                this.messageToRecipient =
                    simulationInboundWireDrawdownRequestCreateBody.messageToRecipient
                this.originatorAccountNumber =
                    simulationInboundWireDrawdownRequestCreateBody.originatorAccountNumber
                this.originatorRoutingNumber =
                    simulationInboundWireDrawdownRequestCreateBody.originatorRoutingNumber
                this.recipientAccountNumberId =
                    simulationInboundWireDrawdownRequestCreateBody.recipientAccountNumberId
                this.beneficiaryAddressLine1 =
                    simulationInboundWireDrawdownRequestCreateBody.beneficiaryAddressLine1
                this.beneficiaryAddressLine2 =
                    simulationInboundWireDrawdownRequestCreateBody.beneficiaryAddressLine2
                this.beneficiaryAddressLine3 =
                    simulationInboundWireDrawdownRequestCreateBody.beneficiaryAddressLine3
                this.beneficiaryName =
                    simulationInboundWireDrawdownRequestCreateBody.beneficiaryName
                this.originatorAddressLine1 =
                    simulationInboundWireDrawdownRequestCreateBody.originatorAddressLine1
                this.originatorAddressLine2 =
                    simulationInboundWireDrawdownRequestCreateBody.originatorAddressLine2
                this.originatorAddressLine3 =
                    simulationInboundWireDrawdownRequestCreateBody.originatorAddressLine3
                this.originatorName = simulationInboundWireDrawdownRequestCreateBody.originatorName
                this.originatorToBeneficiaryInformationLine1 =
                    simulationInboundWireDrawdownRequestCreateBody
                        .originatorToBeneficiaryInformationLine1
                this.originatorToBeneficiaryInformationLine2 =
                    simulationInboundWireDrawdownRequestCreateBody
                        .originatorToBeneficiaryInformationLine2
                this.originatorToBeneficiaryInformationLine3 =
                    simulationInboundWireDrawdownRequestCreateBody
                        .originatorToBeneficiaryInformationLine3
                this.originatorToBeneficiaryInformationLine4 =
                    simulationInboundWireDrawdownRequestCreateBody
                        .originatorToBeneficiaryInformationLine4
                additionalProperties(
                    simulationInboundWireDrawdownRequestCreateBody.additionalProperties
                )
            }

            /** The amount being requested in cents. */
            @JsonProperty("amount") fun amount(amount: Long) = apply { this.amount = amount }

            /** The drawdown request's beneficiary's account number. */
            @JsonProperty("beneficiary_account_number")
            fun beneficiaryAccountNumber(beneficiaryAccountNumber: String) = apply {
                this.beneficiaryAccountNumber = beneficiaryAccountNumber
            }

            /** The drawdown request's beneficiary's routing number. */
            @JsonProperty("beneficiary_routing_number")
            fun beneficiaryRoutingNumber(beneficiaryRoutingNumber: String) = apply {
                this.beneficiaryRoutingNumber = beneficiaryRoutingNumber
            }

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the amount being
             * requested. Will always be "USD".
             */
            @JsonProperty("currency")
            fun currency(currency: String) = apply { this.currency = currency }

            /** A message from the drawdown request's originator. */
            @JsonProperty("message_to_recipient")
            fun messageToRecipient(messageToRecipient: String) = apply {
                this.messageToRecipient = messageToRecipient
            }

            /** The drawdown request's originator's account number. */
            @JsonProperty("originator_account_number")
            fun originatorAccountNumber(originatorAccountNumber: String) = apply {
                this.originatorAccountNumber = originatorAccountNumber
            }

            /** The drawdown request's originator's routing number. */
            @JsonProperty("originator_routing_number")
            fun originatorRoutingNumber(originatorRoutingNumber: String) = apply {
                this.originatorRoutingNumber = originatorRoutingNumber
            }

            /**
             * The Account Number to which the recipient of this request is being requested to send
             * funds from.
             */
            @JsonProperty("recipient_account_number_id")
            fun recipientAccountNumberId(recipientAccountNumberId: String) = apply {
                this.recipientAccountNumberId = recipientAccountNumberId
            }

            /** Line 1 of the drawdown request's beneficiary's address. */
            @JsonProperty("beneficiary_address_line1")
            fun beneficiaryAddressLine1(beneficiaryAddressLine1: String) = apply {
                this.beneficiaryAddressLine1 = beneficiaryAddressLine1
            }

            /** Line 2 of the drawdown request's beneficiary's address. */
            @JsonProperty("beneficiary_address_line2")
            fun beneficiaryAddressLine2(beneficiaryAddressLine2: String) = apply {
                this.beneficiaryAddressLine2 = beneficiaryAddressLine2
            }

            /** Line 3 of the drawdown request's beneficiary's address. */
            @JsonProperty("beneficiary_address_line3")
            fun beneficiaryAddressLine3(beneficiaryAddressLine3: String) = apply {
                this.beneficiaryAddressLine3 = beneficiaryAddressLine3
            }

            /** The drawdown request's beneficiary's name. */
            @JsonProperty("beneficiary_name")
            fun beneficiaryName(beneficiaryName: String) = apply {
                this.beneficiaryName = beneficiaryName
            }

            /** Line 1 of the drawdown request's originator's address. */
            @JsonProperty("originator_address_line1")
            fun originatorAddressLine1(originatorAddressLine1: String) = apply {
                this.originatorAddressLine1 = originatorAddressLine1
            }

            /** Line 2 of the drawdown request's originator's address. */
            @JsonProperty("originator_address_line2")
            fun originatorAddressLine2(originatorAddressLine2: String) = apply {
                this.originatorAddressLine2 = originatorAddressLine2
            }

            /** Line 3 of the drawdown request's originator's address. */
            @JsonProperty("originator_address_line3")
            fun originatorAddressLine3(originatorAddressLine3: String) = apply {
                this.originatorAddressLine3 = originatorAddressLine3
            }

            /** The drawdown request's originator's name. */
            @JsonProperty("originator_name")
            fun originatorName(originatorName: String) = apply {
                this.originatorName = originatorName
            }

            /**
             * Line 1 of the information conveyed from the originator of the message to the
             * beneficiary.
             */
            @JsonProperty("originator_to_beneficiary_information_line1")
            fun originatorToBeneficiaryInformationLine1(
                originatorToBeneficiaryInformationLine1: String
            ) = apply {
                this.originatorToBeneficiaryInformationLine1 =
                    originatorToBeneficiaryInformationLine1
            }

            /**
             * Line 2 of the information conveyed from the originator of the message to the
             * beneficiary.
             */
            @JsonProperty("originator_to_beneficiary_information_line2")
            fun originatorToBeneficiaryInformationLine2(
                originatorToBeneficiaryInformationLine2: String
            ) = apply {
                this.originatorToBeneficiaryInformationLine2 =
                    originatorToBeneficiaryInformationLine2
            }

            /**
             * Line 3 of the information conveyed from the originator of the message to the
             * beneficiary.
             */
            @JsonProperty("originator_to_beneficiary_information_line3")
            fun originatorToBeneficiaryInformationLine3(
                originatorToBeneficiaryInformationLine3: String
            ) = apply {
                this.originatorToBeneficiaryInformationLine3 =
                    originatorToBeneficiaryInformationLine3
            }

            /**
             * Line 4 of the information conveyed from the originator of the message to the
             * beneficiary.
             */
            @JsonProperty("originator_to_beneficiary_information_line4")
            fun originatorToBeneficiaryInformationLine4(
                originatorToBeneficiaryInformationLine4: String
            ) = apply {
                this.originatorToBeneficiaryInformationLine4 =
                    originatorToBeneficiaryInformationLine4
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

            fun build(): SimulationInboundWireDrawdownRequestCreateBody =
                SimulationInboundWireDrawdownRequestCreateBody(
                    checkNotNull(amount) { "`amount` is required but was not set" },
                    checkNotNull(beneficiaryAccountNumber) {
                        "`beneficiaryAccountNumber` is required but was not set"
                    },
                    checkNotNull(beneficiaryRoutingNumber) {
                        "`beneficiaryRoutingNumber` is required but was not set"
                    },
                    checkNotNull(currency) { "`currency` is required but was not set" },
                    checkNotNull(messageToRecipient) {
                        "`messageToRecipient` is required but was not set"
                    },
                    checkNotNull(originatorAccountNumber) {
                        "`originatorAccountNumber` is required but was not set"
                    },
                    checkNotNull(originatorRoutingNumber) {
                        "`originatorRoutingNumber` is required but was not set"
                    },
                    checkNotNull(recipientAccountNumberId) {
                        "`recipientAccountNumberId` is required but was not set"
                    },
                    beneficiaryAddressLine1,
                    beneficiaryAddressLine2,
                    beneficiaryAddressLine3,
                    beneficiaryName,
                    originatorAddressLine1,
                    originatorAddressLine2,
                    originatorAddressLine3,
                    originatorName,
                    originatorToBeneficiaryInformationLine1,
                    originatorToBeneficiaryInformationLine2,
                    originatorToBeneficiaryInformationLine3,
                    originatorToBeneficiaryInformationLine4,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is SimulationInboundWireDrawdownRequestCreateBody && this.amount == other.amount && this.beneficiaryAccountNumber == other.beneficiaryAccountNumber && this.beneficiaryRoutingNumber == other.beneficiaryRoutingNumber && this.currency == other.currency && this.messageToRecipient == other.messageToRecipient && this.originatorAccountNumber == other.originatorAccountNumber && this.originatorRoutingNumber == other.originatorRoutingNumber && this.recipientAccountNumberId == other.recipientAccountNumberId && this.beneficiaryAddressLine1 == other.beneficiaryAddressLine1 && this.beneficiaryAddressLine2 == other.beneficiaryAddressLine2 && this.beneficiaryAddressLine3 == other.beneficiaryAddressLine3 && this.beneficiaryName == other.beneficiaryName && this.originatorAddressLine1 == other.originatorAddressLine1 && this.originatorAddressLine2 == other.originatorAddressLine2 && this.originatorAddressLine3 == other.originatorAddressLine3 && this.originatorName == other.originatorName && this.originatorToBeneficiaryInformationLine1 == other.originatorToBeneficiaryInformationLine1 && this.originatorToBeneficiaryInformationLine2 == other.originatorToBeneficiaryInformationLine2 && this.originatorToBeneficiaryInformationLine3 == other.originatorToBeneficiaryInformationLine3 && this.originatorToBeneficiaryInformationLine4 == other.originatorToBeneficiaryInformationLine4 && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(amount, beneficiaryAccountNumber, beneficiaryRoutingNumber, currency, messageToRecipient, originatorAccountNumber, originatorRoutingNumber, recipientAccountNumberId, beneficiaryAddressLine1, beneficiaryAddressLine2, beneficiaryAddressLine3, beneficiaryName, originatorAddressLine1, originatorAddressLine2, originatorAddressLine3, originatorName, originatorToBeneficiaryInformationLine1, originatorToBeneficiaryInformationLine2, originatorToBeneficiaryInformationLine3, originatorToBeneficiaryInformationLine4, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "SimulationInboundWireDrawdownRequestCreateBody{amount=$amount, beneficiaryAccountNumber=$beneficiaryAccountNumber, beneficiaryRoutingNumber=$beneficiaryRoutingNumber, currency=$currency, messageToRecipient=$messageToRecipient, originatorAccountNumber=$originatorAccountNumber, originatorRoutingNumber=$originatorRoutingNumber, recipientAccountNumberId=$recipientAccountNumberId, beneficiaryAddressLine1=$beneficiaryAddressLine1, beneficiaryAddressLine2=$beneficiaryAddressLine2, beneficiaryAddressLine3=$beneficiaryAddressLine3, beneficiaryName=$beneficiaryName, originatorAddressLine1=$originatorAddressLine1, originatorAddressLine2=$originatorAddressLine2, originatorAddressLine3=$originatorAddressLine3, originatorName=$originatorName, originatorToBeneficiaryInformationLine1=$originatorToBeneficiaryInformationLine1, originatorToBeneficiaryInformationLine2=$originatorToBeneficiaryInformationLine2, originatorToBeneficiaryInformationLine3=$originatorToBeneficiaryInformationLine3, originatorToBeneficiaryInformationLine4=$originatorToBeneficiaryInformationLine4, additionalProperties=$additionalProperties}"
    }

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SimulationInboundWireDrawdownRequestCreateParams && this.amount == other.amount && this.beneficiaryAccountNumber == other.beneficiaryAccountNumber && this.beneficiaryRoutingNumber == other.beneficiaryRoutingNumber && this.currency == other.currency && this.messageToRecipient == other.messageToRecipient && this.originatorAccountNumber == other.originatorAccountNumber && this.originatorRoutingNumber == other.originatorRoutingNumber && this.recipientAccountNumberId == other.recipientAccountNumberId && this.beneficiaryAddressLine1 == other.beneficiaryAddressLine1 && this.beneficiaryAddressLine2 == other.beneficiaryAddressLine2 && this.beneficiaryAddressLine3 == other.beneficiaryAddressLine3 && this.beneficiaryName == other.beneficiaryName && this.originatorAddressLine1 == other.originatorAddressLine1 && this.originatorAddressLine2 == other.originatorAddressLine2 && this.originatorAddressLine3 == other.originatorAddressLine3 && this.originatorName == other.originatorName && this.originatorToBeneficiaryInformationLine1 == other.originatorToBeneficiaryInformationLine1 && this.originatorToBeneficiaryInformationLine2 == other.originatorToBeneficiaryInformationLine2 && this.originatorToBeneficiaryInformationLine3 == other.originatorToBeneficiaryInformationLine3 && this.originatorToBeneficiaryInformationLine4 == other.originatorToBeneficiaryInformationLine4 && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(amount, beneficiaryAccountNumber, beneficiaryRoutingNumber, currency, messageToRecipient, originatorAccountNumber, originatorRoutingNumber, recipientAccountNumberId, beneficiaryAddressLine1, beneficiaryAddressLine2, beneficiaryAddressLine3, beneficiaryName, originatorAddressLine1, originatorAddressLine2, originatorAddressLine3, originatorName, originatorToBeneficiaryInformationLine1, originatorToBeneficiaryInformationLine2, originatorToBeneficiaryInformationLine3, originatorToBeneficiaryInformationLine4, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "SimulationInboundWireDrawdownRequestCreateParams{amount=$amount, beneficiaryAccountNumber=$beneficiaryAccountNumber, beneficiaryRoutingNumber=$beneficiaryRoutingNumber, currency=$currency, messageToRecipient=$messageToRecipient, originatorAccountNumber=$originatorAccountNumber, originatorRoutingNumber=$originatorRoutingNumber, recipientAccountNumberId=$recipientAccountNumberId, beneficiaryAddressLine1=$beneficiaryAddressLine1, beneficiaryAddressLine2=$beneficiaryAddressLine2, beneficiaryAddressLine3=$beneficiaryAddressLine3, beneficiaryName=$beneficiaryName, originatorAddressLine1=$originatorAddressLine1, originatorAddressLine2=$originatorAddressLine2, originatorAddressLine3=$originatorAddressLine3, originatorName=$originatorName, originatorToBeneficiaryInformationLine1=$originatorToBeneficiaryInformationLine1, originatorToBeneficiaryInformationLine2=$originatorToBeneficiaryInformationLine2, originatorToBeneficiaryInformationLine3=$originatorToBeneficiaryInformationLine3, originatorToBeneficiaryInformationLine4=$originatorToBeneficiaryInformationLine4, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var amount: Long? = null
        private var beneficiaryAccountNumber: String? = null
        private var beneficiaryRoutingNumber: String? = null
        private var currency: String? = null
        private var messageToRecipient: String? = null
        private var originatorAccountNumber: String? = null
        private var originatorRoutingNumber: String? = null
        private var recipientAccountNumberId: String? = null
        private var beneficiaryAddressLine1: String? = null
        private var beneficiaryAddressLine2: String? = null
        private var beneficiaryAddressLine3: String? = null
        private var beneficiaryName: String? = null
        private var originatorAddressLine1: String? = null
        private var originatorAddressLine2: String? = null
        private var originatorAddressLine3: String? = null
        private var originatorName: String? = null
        private var originatorToBeneficiaryInformationLine1: String? = null
        private var originatorToBeneficiaryInformationLine2: String? = null
        private var originatorToBeneficiaryInformationLine3: String? = null
        private var originatorToBeneficiaryInformationLine4: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            simulationInboundWireDrawdownRequestCreateParams:
                SimulationInboundWireDrawdownRequestCreateParams
        ) = apply {
            this.amount = simulationInboundWireDrawdownRequestCreateParams.amount
            this.beneficiaryAccountNumber =
                simulationInboundWireDrawdownRequestCreateParams.beneficiaryAccountNumber
            this.beneficiaryRoutingNumber =
                simulationInboundWireDrawdownRequestCreateParams.beneficiaryRoutingNumber
            this.currency = simulationInboundWireDrawdownRequestCreateParams.currency
            this.messageToRecipient =
                simulationInboundWireDrawdownRequestCreateParams.messageToRecipient
            this.originatorAccountNumber =
                simulationInboundWireDrawdownRequestCreateParams.originatorAccountNumber
            this.originatorRoutingNumber =
                simulationInboundWireDrawdownRequestCreateParams.originatorRoutingNumber
            this.recipientAccountNumberId =
                simulationInboundWireDrawdownRequestCreateParams.recipientAccountNumberId
            this.beneficiaryAddressLine1 =
                simulationInboundWireDrawdownRequestCreateParams.beneficiaryAddressLine1
            this.beneficiaryAddressLine2 =
                simulationInboundWireDrawdownRequestCreateParams.beneficiaryAddressLine2
            this.beneficiaryAddressLine3 =
                simulationInboundWireDrawdownRequestCreateParams.beneficiaryAddressLine3
            this.beneficiaryName = simulationInboundWireDrawdownRequestCreateParams.beneficiaryName
            this.originatorAddressLine1 =
                simulationInboundWireDrawdownRequestCreateParams.originatorAddressLine1
            this.originatorAddressLine2 =
                simulationInboundWireDrawdownRequestCreateParams.originatorAddressLine2
            this.originatorAddressLine3 =
                simulationInboundWireDrawdownRequestCreateParams.originatorAddressLine3
            this.originatorName = simulationInboundWireDrawdownRequestCreateParams.originatorName
            this.originatorToBeneficiaryInformationLine1 =
                simulationInboundWireDrawdownRequestCreateParams
                    .originatorToBeneficiaryInformationLine1
            this.originatorToBeneficiaryInformationLine2 =
                simulationInboundWireDrawdownRequestCreateParams
                    .originatorToBeneficiaryInformationLine2
            this.originatorToBeneficiaryInformationLine3 =
                simulationInboundWireDrawdownRequestCreateParams
                    .originatorToBeneficiaryInformationLine3
            this.originatorToBeneficiaryInformationLine4 =
                simulationInboundWireDrawdownRequestCreateParams
                    .originatorToBeneficiaryInformationLine4
            additionalHeaders(simulationInboundWireDrawdownRequestCreateParams.additionalHeaders)
            additionalQueryParams(
                simulationInboundWireDrawdownRequestCreateParams.additionalQueryParams
            )
            additionalBodyProperties(
                simulationInboundWireDrawdownRequestCreateParams.additionalBodyProperties
            )
        }

        /** The amount being requested in cents. */
        fun amount(amount: Long) = apply { this.amount = amount }

        /** The drawdown request's beneficiary's account number. */
        fun beneficiaryAccountNumber(beneficiaryAccountNumber: String) = apply {
            this.beneficiaryAccountNumber = beneficiaryAccountNumber
        }

        /** The drawdown request's beneficiary's routing number. */
        fun beneficiaryRoutingNumber(beneficiaryRoutingNumber: String) = apply {
            this.beneficiaryRoutingNumber = beneficiaryRoutingNumber
        }

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the amount being
         * requested. Will always be "USD".
         */
        fun currency(currency: String) = apply { this.currency = currency }

        /** A message from the drawdown request's originator. */
        fun messageToRecipient(messageToRecipient: String) = apply {
            this.messageToRecipient = messageToRecipient
        }

        /** The drawdown request's originator's account number. */
        fun originatorAccountNumber(originatorAccountNumber: String) = apply {
            this.originatorAccountNumber = originatorAccountNumber
        }

        /** The drawdown request's originator's routing number. */
        fun originatorRoutingNumber(originatorRoutingNumber: String) = apply {
            this.originatorRoutingNumber = originatorRoutingNumber
        }

        /**
         * The Account Number to which the recipient of this request is being requested to send
         * funds from.
         */
        fun recipientAccountNumberId(recipientAccountNumberId: String) = apply {
            this.recipientAccountNumberId = recipientAccountNumberId
        }

        /** Line 1 of the drawdown request's beneficiary's address. */
        fun beneficiaryAddressLine1(beneficiaryAddressLine1: String) = apply {
            this.beneficiaryAddressLine1 = beneficiaryAddressLine1
        }

        /** Line 2 of the drawdown request's beneficiary's address. */
        fun beneficiaryAddressLine2(beneficiaryAddressLine2: String) = apply {
            this.beneficiaryAddressLine2 = beneficiaryAddressLine2
        }

        /** Line 3 of the drawdown request's beneficiary's address. */
        fun beneficiaryAddressLine3(beneficiaryAddressLine3: String) = apply {
            this.beneficiaryAddressLine3 = beneficiaryAddressLine3
        }

        /** The drawdown request's beneficiary's name. */
        fun beneficiaryName(beneficiaryName: String) = apply {
            this.beneficiaryName = beneficiaryName
        }

        /** Line 1 of the drawdown request's originator's address. */
        fun originatorAddressLine1(originatorAddressLine1: String) = apply {
            this.originatorAddressLine1 = originatorAddressLine1
        }

        /** Line 2 of the drawdown request's originator's address. */
        fun originatorAddressLine2(originatorAddressLine2: String) = apply {
            this.originatorAddressLine2 = originatorAddressLine2
        }

        /** Line 3 of the drawdown request's originator's address. */
        fun originatorAddressLine3(originatorAddressLine3: String) = apply {
            this.originatorAddressLine3 = originatorAddressLine3
        }

        /** The drawdown request's originator's name. */
        fun originatorName(originatorName: String) = apply { this.originatorName = originatorName }

        /**
         * Line 1 of the information conveyed from the originator of the message to the beneficiary.
         */
        fun originatorToBeneficiaryInformationLine1(
            originatorToBeneficiaryInformationLine1: String
        ) = apply {
            this.originatorToBeneficiaryInformationLine1 = originatorToBeneficiaryInformationLine1
        }

        /**
         * Line 2 of the information conveyed from the originator of the message to the beneficiary.
         */
        fun originatorToBeneficiaryInformationLine2(
            originatorToBeneficiaryInformationLine2: String
        ) = apply {
            this.originatorToBeneficiaryInformationLine2 = originatorToBeneficiaryInformationLine2
        }

        /**
         * Line 3 of the information conveyed from the originator of the message to the beneficiary.
         */
        fun originatorToBeneficiaryInformationLine3(
            originatorToBeneficiaryInformationLine3: String
        ) = apply {
            this.originatorToBeneficiaryInformationLine3 = originatorToBeneficiaryInformationLine3
        }

        /**
         * Line 4 of the information conveyed from the originator of the message to the beneficiary.
         */
        fun originatorToBeneficiaryInformationLine4(
            originatorToBeneficiaryInformationLine4: String
        ) = apply {
            this.originatorToBeneficiaryInformationLine4 = originatorToBeneficiaryInformationLine4
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

        fun build(): SimulationInboundWireDrawdownRequestCreateParams =
            SimulationInboundWireDrawdownRequestCreateParams(
                checkNotNull(amount) { "`amount` is required but was not set" },
                checkNotNull(beneficiaryAccountNumber) {
                    "`beneficiaryAccountNumber` is required but was not set"
                },
                checkNotNull(beneficiaryRoutingNumber) {
                    "`beneficiaryRoutingNumber` is required but was not set"
                },
                checkNotNull(currency) { "`currency` is required but was not set" },
                checkNotNull(messageToRecipient) {
                    "`messageToRecipient` is required but was not set"
                },
                checkNotNull(originatorAccountNumber) {
                    "`originatorAccountNumber` is required but was not set"
                },
                checkNotNull(originatorRoutingNumber) {
                    "`originatorRoutingNumber` is required but was not set"
                },
                checkNotNull(recipientAccountNumberId) {
                    "`recipientAccountNumberId` is required but was not set"
                },
                beneficiaryAddressLine1,
                beneficiaryAddressLine2,
                beneficiaryAddressLine3,
                beneficiaryName,
                originatorAddressLine1,
                originatorAddressLine2,
                originatorAddressLine3,
                originatorName,
                originatorToBeneficiaryInformationLine1,
                originatorToBeneficiaryInformationLine2,
                originatorToBeneficiaryInformationLine3,
                originatorToBeneficiaryInformationLine4,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }
}
