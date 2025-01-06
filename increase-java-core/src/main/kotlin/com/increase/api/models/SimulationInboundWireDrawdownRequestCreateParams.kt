// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import com.increase.api.core.immutableEmptyMap
import com.increase.api.core.toImmutable
import java.util.Objects
import java.util.Optional

class SimulationInboundWireDrawdownRequestCreateParams
constructor(
    private val body: SimulationInboundWireDrawdownRequestCreateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    /** The amount being requested in cents. */
    fun amount(): Long = body.amount()

    /** The drawdown request's beneficiary's account number. */
    fun beneficiaryAccountNumber(): String = body.beneficiaryAccountNumber()

    /** The drawdown request's beneficiary's routing number. */
    fun beneficiaryRoutingNumber(): String = body.beneficiaryRoutingNumber()

    /**
     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the amount being requested.
     * Will always be "USD".
     */
    fun currency(): String = body.currency()

    /** A message from the drawdown request's originator. */
    fun messageToRecipient(): String = body.messageToRecipient()

    /** The drawdown request's originator's account number. */
    fun originatorAccountNumber(): String = body.originatorAccountNumber()

    /** The drawdown request's originator's routing number. */
    fun originatorRoutingNumber(): String = body.originatorRoutingNumber()

    /**
     * The Account Number to which the recipient of this request is being requested to send funds
     * from.
     */
    fun recipientAccountNumberId(): String = body.recipientAccountNumberId()

    /** Line 1 of the drawdown request's beneficiary's address. */
    fun beneficiaryAddressLine1(): Optional<String> = body.beneficiaryAddressLine1()

    /** Line 2 of the drawdown request's beneficiary's address. */
    fun beneficiaryAddressLine2(): Optional<String> = body.beneficiaryAddressLine2()

    /** Line 3 of the drawdown request's beneficiary's address. */
    fun beneficiaryAddressLine3(): Optional<String> = body.beneficiaryAddressLine3()

    /** The drawdown request's beneficiary's name. */
    fun beneficiaryName(): Optional<String> = body.beneficiaryName()

    /** Line 1 of the drawdown request's originator's address. */
    fun originatorAddressLine1(): Optional<String> = body.originatorAddressLine1()

    /** Line 2 of the drawdown request's originator's address. */
    fun originatorAddressLine2(): Optional<String> = body.originatorAddressLine2()

    /** Line 3 of the drawdown request's originator's address. */
    fun originatorAddressLine3(): Optional<String> = body.originatorAddressLine3()

    /** The drawdown request's originator's name. */
    fun originatorName(): Optional<String> = body.originatorName()

    /** Line 1 of the information conveyed from the originator of the message to the beneficiary. */
    fun originatorToBeneficiaryInformationLine1(): Optional<String> =
        body.originatorToBeneficiaryInformationLine1()

    /** Line 2 of the information conveyed from the originator of the message to the beneficiary. */
    fun originatorToBeneficiaryInformationLine2(): Optional<String> =
        body.originatorToBeneficiaryInformationLine2()

    /** Line 3 of the information conveyed from the originator of the message to the beneficiary. */
    fun originatorToBeneficiaryInformationLine3(): Optional<String> =
        body.originatorToBeneficiaryInformationLine3()

    /** Line 4 of the information conveyed from the originator of the message to the beneficiary. */
    fun originatorToBeneficiaryInformationLine4(): Optional<String> =
        body.originatorToBeneficiaryInformationLine4()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    @JvmSynthetic internal fun getBody(): SimulationInboundWireDrawdownRequestCreateBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class SimulationInboundWireDrawdownRequestCreateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("amount") private val amount: Long,
        @JsonProperty("beneficiary_account_number") private val beneficiaryAccountNumber: String,
        @JsonProperty("beneficiary_routing_number") private val beneficiaryRoutingNumber: String,
        @JsonProperty("currency") private val currency: String,
        @JsonProperty("message_to_recipient") private val messageToRecipient: String,
        @JsonProperty("originator_account_number") private val originatorAccountNumber: String,
        @JsonProperty("originator_routing_number") private val originatorRoutingNumber: String,
        @JsonProperty("recipient_account_number_id") private val recipientAccountNumberId: String,
        @JsonProperty("beneficiary_address_line1") private val beneficiaryAddressLine1: String?,
        @JsonProperty("beneficiary_address_line2") private val beneficiaryAddressLine2: String?,
        @JsonProperty("beneficiary_address_line3") private val beneficiaryAddressLine3: String?,
        @JsonProperty("beneficiary_name") private val beneficiaryName: String?,
        @JsonProperty("originator_address_line1") private val originatorAddressLine1: String?,
        @JsonProperty("originator_address_line2") private val originatorAddressLine2: String?,
        @JsonProperty("originator_address_line3") private val originatorAddressLine3: String?,
        @JsonProperty("originator_name") private val originatorName: String?,
        @JsonProperty("originator_to_beneficiary_information_line1")
        private val originatorToBeneficiaryInformationLine1: String?,
        @JsonProperty("originator_to_beneficiary_information_line2")
        private val originatorToBeneficiaryInformationLine2: String?,
        @JsonProperty("originator_to_beneficiary_information_line3")
        private val originatorToBeneficiaryInformationLine3: String?,
        @JsonProperty("originator_to_beneficiary_information_line4")
        private val originatorToBeneficiaryInformationLine4: String?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The amount being requested in cents. */
        @JsonProperty("amount") fun amount(): Long = amount

        /** The drawdown request's beneficiary's account number. */
        @JsonProperty("beneficiary_account_number")
        fun beneficiaryAccountNumber(): String = beneficiaryAccountNumber

        /** The drawdown request's beneficiary's routing number. */
        @JsonProperty("beneficiary_routing_number")
        fun beneficiaryRoutingNumber(): String = beneficiaryRoutingNumber

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the amount being
         * requested. Will always be "USD".
         */
        @JsonProperty("currency") fun currency(): String = currency

        /** A message from the drawdown request's originator. */
        @JsonProperty("message_to_recipient") fun messageToRecipient(): String = messageToRecipient

        /** The drawdown request's originator's account number. */
        @JsonProperty("originator_account_number")
        fun originatorAccountNumber(): String = originatorAccountNumber

        /** The drawdown request's originator's routing number. */
        @JsonProperty("originator_routing_number")
        fun originatorRoutingNumber(): String = originatorRoutingNumber

        /**
         * The Account Number to which the recipient of this request is being requested to send
         * funds from.
         */
        @JsonProperty("recipient_account_number_id")
        fun recipientAccountNumberId(): String = recipientAccountNumberId

        /** Line 1 of the drawdown request's beneficiary's address. */
        @JsonProperty("beneficiary_address_line1")
        fun beneficiaryAddressLine1(): Optional<String> =
            Optional.ofNullable(beneficiaryAddressLine1)

        /** Line 2 of the drawdown request's beneficiary's address. */
        @JsonProperty("beneficiary_address_line2")
        fun beneficiaryAddressLine2(): Optional<String> =
            Optional.ofNullable(beneficiaryAddressLine2)

        /** Line 3 of the drawdown request's beneficiary's address. */
        @JsonProperty("beneficiary_address_line3")
        fun beneficiaryAddressLine3(): Optional<String> =
            Optional.ofNullable(beneficiaryAddressLine3)

        /** The drawdown request's beneficiary's name. */
        @JsonProperty("beneficiary_name")
        fun beneficiaryName(): Optional<String> = Optional.ofNullable(beneficiaryName)

        /** Line 1 of the drawdown request's originator's address. */
        @JsonProperty("originator_address_line1")
        fun originatorAddressLine1(): Optional<String> = Optional.ofNullable(originatorAddressLine1)

        /** Line 2 of the drawdown request's originator's address. */
        @JsonProperty("originator_address_line2")
        fun originatorAddressLine2(): Optional<String> = Optional.ofNullable(originatorAddressLine2)

        /** Line 3 of the drawdown request's originator's address. */
        @JsonProperty("originator_address_line3")
        fun originatorAddressLine3(): Optional<String> = Optional.ofNullable(originatorAddressLine3)

        /** The drawdown request's originator's name. */
        @JsonProperty("originator_name")
        fun originatorName(): Optional<String> = Optional.ofNullable(originatorName)

        /**
         * Line 1 of the information conveyed from the originator of the message to the beneficiary.
         */
        @JsonProperty("originator_to_beneficiary_information_line1")
        fun originatorToBeneficiaryInformationLine1(): Optional<String> =
            Optional.ofNullable(originatorToBeneficiaryInformationLine1)

        /**
         * Line 2 of the information conveyed from the originator of the message to the beneficiary.
         */
        @JsonProperty("originator_to_beneficiary_information_line2")
        fun originatorToBeneficiaryInformationLine2(): Optional<String> =
            Optional.ofNullable(originatorToBeneficiaryInformationLine2)

        /**
         * Line 3 of the information conveyed from the originator of the message to the beneficiary.
         */
        @JsonProperty("originator_to_beneficiary_information_line3")
        fun originatorToBeneficiaryInformationLine3(): Optional<String> =
            Optional.ofNullable(originatorToBeneficiaryInformationLine3)

        /**
         * Line 4 of the information conveyed from the originator of the message to the beneficiary.
         */
        @JsonProperty("originator_to_beneficiary_information_line4")
        fun originatorToBeneficiaryInformationLine4(): Optional<String> =
            Optional.ofNullable(originatorToBeneficiaryInformationLine4)

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
                amount = simulationInboundWireDrawdownRequestCreateBody.amount
                beneficiaryAccountNumber =
                    simulationInboundWireDrawdownRequestCreateBody.beneficiaryAccountNumber
                beneficiaryRoutingNumber =
                    simulationInboundWireDrawdownRequestCreateBody.beneficiaryRoutingNumber
                currency = simulationInboundWireDrawdownRequestCreateBody.currency
                messageToRecipient =
                    simulationInboundWireDrawdownRequestCreateBody.messageToRecipient
                originatorAccountNumber =
                    simulationInboundWireDrawdownRequestCreateBody.originatorAccountNumber
                originatorRoutingNumber =
                    simulationInboundWireDrawdownRequestCreateBody.originatorRoutingNumber
                recipientAccountNumberId =
                    simulationInboundWireDrawdownRequestCreateBody.recipientAccountNumberId
                beneficiaryAddressLine1 =
                    simulationInboundWireDrawdownRequestCreateBody.beneficiaryAddressLine1
                beneficiaryAddressLine2 =
                    simulationInboundWireDrawdownRequestCreateBody.beneficiaryAddressLine2
                beneficiaryAddressLine3 =
                    simulationInboundWireDrawdownRequestCreateBody.beneficiaryAddressLine3
                beneficiaryName = simulationInboundWireDrawdownRequestCreateBody.beneficiaryName
                originatorAddressLine1 =
                    simulationInboundWireDrawdownRequestCreateBody.originatorAddressLine1
                originatorAddressLine2 =
                    simulationInboundWireDrawdownRequestCreateBody.originatorAddressLine2
                originatorAddressLine3 =
                    simulationInboundWireDrawdownRequestCreateBody.originatorAddressLine3
                originatorName = simulationInboundWireDrawdownRequestCreateBody.originatorName
                originatorToBeneficiaryInformationLine1 =
                    simulationInboundWireDrawdownRequestCreateBody
                        .originatorToBeneficiaryInformationLine1
                originatorToBeneficiaryInformationLine2 =
                    simulationInboundWireDrawdownRequestCreateBody
                        .originatorToBeneficiaryInformationLine2
                originatorToBeneficiaryInformationLine3 =
                    simulationInboundWireDrawdownRequestCreateBody
                        .originatorToBeneficiaryInformationLine3
                originatorToBeneficiaryInformationLine4 =
                    simulationInboundWireDrawdownRequestCreateBody
                        .originatorToBeneficiaryInformationLine4
                additionalProperties =
                    simulationInboundWireDrawdownRequestCreateBody.additionalProperties
                        .toMutableMap()
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
            fun beneficiaryAddressLine1(beneficiaryAddressLine1: String?) = apply {
                this.beneficiaryAddressLine1 = beneficiaryAddressLine1
            }

            /** Line 1 of the drawdown request's beneficiary's address. */
            fun beneficiaryAddressLine1(beneficiaryAddressLine1: Optional<String>) =
                beneficiaryAddressLine1(beneficiaryAddressLine1.orElse(null))

            /** Line 2 of the drawdown request's beneficiary's address. */
            fun beneficiaryAddressLine2(beneficiaryAddressLine2: String?) = apply {
                this.beneficiaryAddressLine2 = beneficiaryAddressLine2
            }

            /** Line 2 of the drawdown request's beneficiary's address. */
            fun beneficiaryAddressLine2(beneficiaryAddressLine2: Optional<String>) =
                beneficiaryAddressLine2(beneficiaryAddressLine2.orElse(null))

            /** Line 3 of the drawdown request's beneficiary's address. */
            fun beneficiaryAddressLine3(beneficiaryAddressLine3: String?) = apply {
                this.beneficiaryAddressLine3 = beneficiaryAddressLine3
            }

            /** Line 3 of the drawdown request's beneficiary's address. */
            fun beneficiaryAddressLine3(beneficiaryAddressLine3: Optional<String>) =
                beneficiaryAddressLine3(beneficiaryAddressLine3.orElse(null))

            /** The drawdown request's beneficiary's name. */
            fun beneficiaryName(beneficiaryName: String?) = apply {
                this.beneficiaryName = beneficiaryName
            }

            /** The drawdown request's beneficiary's name. */
            fun beneficiaryName(beneficiaryName: Optional<String>) =
                beneficiaryName(beneficiaryName.orElse(null))

            /** Line 1 of the drawdown request's originator's address. */
            fun originatorAddressLine1(originatorAddressLine1: String?) = apply {
                this.originatorAddressLine1 = originatorAddressLine1
            }

            /** Line 1 of the drawdown request's originator's address. */
            fun originatorAddressLine1(originatorAddressLine1: Optional<String>) =
                originatorAddressLine1(originatorAddressLine1.orElse(null))

            /** Line 2 of the drawdown request's originator's address. */
            fun originatorAddressLine2(originatorAddressLine2: String?) = apply {
                this.originatorAddressLine2 = originatorAddressLine2
            }

            /** Line 2 of the drawdown request's originator's address. */
            fun originatorAddressLine2(originatorAddressLine2: Optional<String>) =
                originatorAddressLine2(originatorAddressLine2.orElse(null))

            /** Line 3 of the drawdown request's originator's address. */
            fun originatorAddressLine3(originatorAddressLine3: String?) = apply {
                this.originatorAddressLine3 = originatorAddressLine3
            }

            /** Line 3 of the drawdown request's originator's address. */
            fun originatorAddressLine3(originatorAddressLine3: Optional<String>) =
                originatorAddressLine3(originatorAddressLine3.orElse(null))

            /** The drawdown request's originator's name. */
            fun originatorName(originatorName: String?) = apply {
                this.originatorName = originatorName
            }

            /** The drawdown request's originator's name. */
            fun originatorName(originatorName: Optional<String>) =
                originatorName(originatorName.orElse(null))

            /**
             * Line 1 of the information conveyed from the originator of the message to the
             * beneficiary.
             */
            fun originatorToBeneficiaryInformationLine1(
                originatorToBeneficiaryInformationLine1: String?
            ) = apply {
                this.originatorToBeneficiaryInformationLine1 =
                    originatorToBeneficiaryInformationLine1
            }

            /**
             * Line 1 of the information conveyed from the originator of the message to the
             * beneficiary.
             */
            fun originatorToBeneficiaryInformationLine1(
                originatorToBeneficiaryInformationLine1: Optional<String>
            ) =
                originatorToBeneficiaryInformationLine1(
                    originatorToBeneficiaryInformationLine1.orElse(null)
                )

            /**
             * Line 2 of the information conveyed from the originator of the message to the
             * beneficiary.
             */
            fun originatorToBeneficiaryInformationLine2(
                originatorToBeneficiaryInformationLine2: String?
            ) = apply {
                this.originatorToBeneficiaryInformationLine2 =
                    originatorToBeneficiaryInformationLine2
            }

            /**
             * Line 2 of the information conveyed from the originator of the message to the
             * beneficiary.
             */
            fun originatorToBeneficiaryInformationLine2(
                originatorToBeneficiaryInformationLine2: Optional<String>
            ) =
                originatorToBeneficiaryInformationLine2(
                    originatorToBeneficiaryInformationLine2.orElse(null)
                )

            /**
             * Line 3 of the information conveyed from the originator of the message to the
             * beneficiary.
             */
            fun originatorToBeneficiaryInformationLine3(
                originatorToBeneficiaryInformationLine3: String?
            ) = apply {
                this.originatorToBeneficiaryInformationLine3 =
                    originatorToBeneficiaryInformationLine3
            }

            /**
             * Line 3 of the information conveyed from the originator of the message to the
             * beneficiary.
             */
            fun originatorToBeneficiaryInformationLine3(
                originatorToBeneficiaryInformationLine3: Optional<String>
            ) =
                originatorToBeneficiaryInformationLine3(
                    originatorToBeneficiaryInformationLine3.orElse(null)
                )

            /**
             * Line 4 of the information conveyed from the originator of the message to the
             * beneficiary.
             */
            fun originatorToBeneficiaryInformationLine4(
                originatorToBeneficiaryInformationLine4: String?
            ) = apply {
                this.originatorToBeneficiaryInformationLine4 =
                    originatorToBeneficiaryInformationLine4
            }

            /**
             * Line 4 of the information conveyed from the originator of the message to the
             * beneficiary.
             */
            fun originatorToBeneficiaryInformationLine4(
                originatorToBeneficiaryInformationLine4: Optional<String>
            ) =
                originatorToBeneficiaryInformationLine4(
                    originatorToBeneficiaryInformationLine4.orElse(null)
                )

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

            return /* spotless:off */ other is SimulationInboundWireDrawdownRequestCreateBody && amount == other.amount && beneficiaryAccountNumber == other.beneficiaryAccountNumber && beneficiaryRoutingNumber == other.beneficiaryRoutingNumber && currency == other.currency && messageToRecipient == other.messageToRecipient && originatorAccountNumber == other.originatorAccountNumber && originatorRoutingNumber == other.originatorRoutingNumber && recipientAccountNumberId == other.recipientAccountNumberId && beneficiaryAddressLine1 == other.beneficiaryAddressLine1 && beneficiaryAddressLine2 == other.beneficiaryAddressLine2 && beneficiaryAddressLine3 == other.beneficiaryAddressLine3 && beneficiaryName == other.beneficiaryName && originatorAddressLine1 == other.originatorAddressLine1 && originatorAddressLine2 == other.originatorAddressLine2 && originatorAddressLine3 == other.originatorAddressLine3 && originatorName == other.originatorName && originatorToBeneficiaryInformationLine1 == other.originatorToBeneficiaryInformationLine1 && originatorToBeneficiaryInformationLine2 == other.originatorToBeneficiaryInformationLine2 && originatorToBeneficiaryInformationLine3 == other.originatorToBeneficiaryInformationLine3 && originatorToBeneficiaryInformationLine4 == other.originatorToBeneficiaryInformationLine4 && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(amount, beneficiaryAccountNumber, beneficiaryRoutingNumber, currency, messageToRecipient, originatorAccountNumber, originatorRoutingNumber, recipientAccountNumberId, beneficiaryAddressLine1, beneficiaryAddressLine2, beneficiaryAddressLine3, beneficiaryName, originatorAddressLine1, originatorAddressLine2, originatorAddressLine3, originatorName, originatorToBeneficiaryInformationLine1, originatorToBeneficiaryInformationLine2, originatorToBeneficiaryInformationLine3, originatorToBeneficiaryInformationLine4, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SimulationInboundWireDrawdownRequestCreateBody{amount=$amount, beneficiaryAccountNumber=$beneficiaryAccountNumber, beneficiaryRoutingNumber=$beneficiaryRoutingNumber, currency=$currency, messageToRecipient=$messageToRecipient, originatorAccountNumber=$originatorAccountNumber, originatorRoutingNumber=$originatorRoutingNumber, recipientAccountNumberId=$recipientAccountNumberId, beneficiaryAddressLine1=$beneficiaryAddressLine1, beneficiaryAddressLine2=$beneficiaryAddressLine2, beneficiaryAddressLine3=$beneficiaryAddressLine3, beneficiaryName=$beneficiaryName, originatorAddressLine1=$originatorAddressLine1, originatorAddressLine2=$originatorAddressLine2, originatorAddressLine3=$originatorAddressLine3, originatorName=$originatorName, originatorToBeneficiaryInformationLine1=$originatorToBeneficiaryInformationLine1, originatorToBeneficiaryInformationLine2=$originatorToBeneficiaryInformationLine2, originatorToBeneficiaryInformationLine3=$originatorToBeneficiaryInformationLine3, originatorToBeneficiaryInformationLine4=$originatorToBeneficiaryInformationLine4, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var body: SimulationInboundWireDrawdownRequestCreateBody.Builder =
            SimulationInboundWireDrawdownRequestCreateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            simulationInboundWireDrawdownRequestCreateParams:
                SimulationInboundWireDrawdownRequestCreateParams
        ) = apply {
            body = simulationInboundWireDrawdownRequestCreateParams.body.toBuilder()
            additionalHeaders =
                simulationInboundWireDrawdownRequestCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                simulationInboundWireDrawdownRequestCreateParams.additionalQueryParams.toBuilder()
        }

        /** The amount being requested in cents. */
        fun amount(amount: Long) = apply { body.amount(amount) }

        /** The drawdown request's beneficiary's account number. */
        fun beneficiaryAccountNumber(beneficiaryAccountNumber: String) = apply {
            body.beneficiaryAccountNumber(beneficiaryAccountNumber)
        }

        /** The drawdown request's beneficiary's routing number. */
        fun beneficiaryRoutingNumber(beneficiaryRoutingNumber: String) = apply {
            body.beneficiaryRoutingNumber(beneficiaryRoutingNumber)
        }

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the amount being
         * requested. Will always be "USD".
         */
        fun currency(currency: String) = apply { body.currency(currency) }

        /** A message from the drawdown request's originator. */
        fun messageToRecipient(messageToRecipient: String) = apply {
            body.messageToRecipient(messageToRecipient)
        }

        /** The drawdown request's originator's account number. */
        fun originatorAccountNumber(originatorAccountNumber: String) = apply {
            body.originatorAccountNumber(originatorAccountNumber)
        }

        /** The drawdown request's originator's routing number. */
        fun originatorRoutingNumber(originatorRoutingNumber: String) = apply {
            body.originatorRoutingNumber(originatorRoutingNumber)
        }

        /**
         * The Account Number to which the recipient of this request is being requested to send
         * funds from.
         */
        fun recipientAccountNumberId(recipientAccountNumberId: String) = apply {
            body.recipientAccountNumberId(recipientAccountNumberId)
        }

        /** Line 1 of the drawdown request's beneficiary's address. */
        fun beneficiaryAddressLine1(beneficiaryAddressLine1: String?) = apply {
            body.beneficiaryAddressLine1(beneficiaryAddressLine1)
        }

        /** Line 1 of the drawdown request's beneficiary's address. */
        fun beneficiaryAddressLine1(beneficiaryAddressLine1: Optional<String>) =
            beneficiaryAddressLine1(beneficiaryAddressLine1.orElse(null))

        /** Line 2 of the drawdown request's beneficiary's address. */
        fun beneficiaryAddressLine2(beneficiaryAddressLine2: String?) = apply {
            body.beneficiaryAddressLine2(beneficiaryAddressLine2)
        }

        /** Line 2 of the drawdown request's beneficiary's address. */
        fun beneficiaryAddressLine2(beneficiaryAddressLine2: Optional<String>) =
            beneficiaryAddressLine2(beneficiaryAddressLine2.orElse(null))

        /** Line 3 of the drawdown request's beneficiary's address. */
        fun beneficiaryAddressLine3(beneficiaryAddressLine3: String?) = apply {
            body.beneficiaryAddressLine3(beneficiaryAddressLine3)
        }

        /** Line 3 of the drawdown request's beneficiary's address. */
        fun beneficiaryAddressLine3(beneficiaryAddressLine3: Optional<String>) =
            beneficiaryAddressLine3(beneficiaryAddressLine3.orElse(null))

        /** The drawdown request's beneficiary's name. */
        fun beneficiaryName(beneficiaryName: String?) = apply {
            body.beneficiaryName(beneficiaryName)
        }

        /** The drawdown request's beneficiary's name. */
        fun beneficiaryName(beneficiaryName: Optional<String>) =
            beneficiaryName(beneficiaryName.orElse(null))

        /** Line 1 of the drawdown request's originator's address. */
        fun originatorAddressLine1(originatorAddressLine1: String?) = apply {
            body.originatorAddressLine1(originatorAddressLine1)
        }

        /** Line 1 of the drawdown request's originator's address. */
        fun originatorAddressLine1(originatorAddressLine1: Optional<String>) =
            originatorAddressLine1(originatorAddressLine1.orElse(null))

        /** Line 2 of the drawdown request's originator's address. */
        fun originatorAddressLine2(originatorAddressLine2: String?) = apply {
            body.originatorAddressLine2(originatorAddressLine2)
        }

        /** Line 2 of the drawdown request's originator's address. */
        fun originatorAddressLine2(originatorAddressLine2: Optional<String>) =
            originatorAddressLine2(originatorAddressLine2.orElse(null))

        /** Line 3 of the drawdown request's originator's address. */
        fun originatorAddressLine3(originatorAddressLine3: String?) = apply {
            body.originatorAddressLine3(originatorAddressLine3)
        }

        /** Line 3 of the drawdown request's originator's address. */
        fun originatorAddressLine3(originatorAddressLine3: Optional<String>) =
            originatorAddressLine3(originatorAddressLine3.orElse(null))

        /** The drawdown request's originator's name. */
        fun originatorName(originatorName: String?) = apply { body.originatorName(originatorName) }

        /** The drawdown request's originator's name. */
        fun originatorName(originatorName: Optional<String>) =
            originatorName(originatorName.orElse(null))

        /**
         * Line 1 of the information conveyed from the originator of the message to the beneficiary.
         */
        fun originatorToBeneficiaryInformationLine1(
            originatorToBeneficiaryInformationLine1: String?
        ) = apply {
            body.originatorToBeneficiaryInformationLine1(originatorToBeneficiaryInformationLine1)
        }

        /**
         * Line 1 of the information conveyed from the originator of the message to the beneficiary.
         */
        fun originatorToBeneficiaryInformationLine1(
            originatorToBeneficiaryInformationLine1: Optional<String>
        ) =
            originatorToBeneficiaryInformationLine1(
                originatorToBeneficiaryInformationLine1.orElse(null)
            )

        /**
         * Line 2 of the information conveyed from the originator of the message to the beneficiary.
         */
        fun originatorToBeneficiaryInformationLine2(
            originatorToBeneficiaryInformationLine2: String?
        ) = apply {
            body.originatorToBeneficiaryInformationLine2(originatorToBeneficiaryInformationLine2)
        }

        /**
         * Line 2 of the information conveyed from the originator of the message to the beneficiary.
         */
        fun originatorToBeneficiaryInformationLine2(
            originatorToBeneficiaryInformationLine2: Optional<String>
        ) =
            originatorToBeneficiaryInformationLine2(
                originatorToBeneficiaryInformationLine2.orElse(null)
            )

        /**
         * Line 3 of the information conveyed from the originator of the message to the beneficiary.
         */
        fun originatorToBeneficiaryInformationLine3(
            originatorToBeneficiaryInformationLine3: String?
        ) = apply {
            body.originatorToBeneficiaryInformationLine3(originatorToBeneficiaryInformationLine3)
        }

        /**
         * Line 3 of the information conveyed from the originator of the message to the beneficiary.
         */
        fun originatorToBeneficiaryInformationLine3(
            originatorToBeneficiaryInformationLine3: Optional<String>
        ) =
            originatorToBeneficiaryInformationLine3(
                originatorToBeneficiaryInformationLine3.orElse(null)
            )

        /**
         * Line 4 of the information conveyed from the originator of the message to the beneficiary.
         */
        fun originatorToBeneficiaryInformationLine4(
            originatorToBeneficiaryInformationLine4: String?
        ) = apply {
            body.originatorToBeneficiaryInformationLine4(originatorToBeneficiaryInformationLine4)
        }

        /**
         * Line 4 of the information conveyed from the originator of the message to the beneficiary.
         */
        fun originatorToBeneficiaryInformationLine4(
            originatorToBeneficiaryInformationLine4: Optional<String>
        ) =
            originatorToBeneficiaryInformationLine4(
                originatorToBeneficiaryInformationLine4.orElse(null)
            )

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

        fun build(): SimulationInboundWireDrawdownRequestCreateParams =
            SimulationInboundWireDrawdownRequestCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SimulationInboundWireDrawdownRequestCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "SimulationInboundWireDrawdownRequestCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
