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

/** Simulates an [Inbound Wire Transfer](#inbound-wire-transfers) to your account. */
class SimulationInboundWireTransferCreateParams
constructor(
    private val body: SimulationInboundWireTransferCreateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    /** The identifier of the Account Number the inbound Wire Transfer is for. */
    fun accountNumberId(): String = body.accountNumberId()

    /** The transfer amount in cents. Must be positive. */
    fun amount(): Long = body.amount()

    /**
     * The sending bank will set beneficiary_address_line1 in production. You can simulate any value
     * here.
     */
    fun beneficiaryAddressLine1(): Optional<String> = body.beneficiaryAddressLine1()

    /**
     * The sending bank will set beneficiary_address_line2 in production. You can simulate any value
     * here.
     */
    fun beneficiaryAddressLine2(): Optional<String> = body.beneficiaryAddressLine2()

    /**
     * The sending bank will set beneficiary_address_line3 in production. You can simulate any value
     * here.
     */
    fun beneficiaryAddressLine3(): Optional<String> = body.beneficiaryAddressLine3()

    /**
     * The sending bank will set beneficiary_name in production. You can simulate any value here.
     */
    fun beneficiaryName(): Optional<String> = body.beneficiaryName()

    /**
     * The sending bank will set beneficiary_reference in production. You can simulate any value
     * here.
     */
    fun beneficiaryReference(): Optional<String> = body.beneficiaryReference()

    /**
     * The sending bank will set originator_address_line1 in production. You can simulate any value
     * here.
     */
    fun originatorAddressLine1(): Optional<String> = body.originatorAddressLine1()

    /**
     * The sending bank will set originator_address_line2 in production. You can simulate any value
     * here.
     */
    fun originatorAddressLine2(): Optional<String> = body.originatorAddressLine2()

    /**
     * The sending bank will set originator_address_line3 in production. You can simulate any value
     * here.
     */
    fun originatorAddressLine3(): Optional<String> = body.originatorAddressLine3()

    /** The sending bank will set originator_name in production. You can simulate any value here. */
    fun originatorName(): Optional<String> = body.originatorName()

    /**
     * The sending bank will set originator_routing_number in production. You can simulate any value
     * here.
     */
    fun originatorRoutingNumber(): Optional<String> = body.originatorRoutingNumber()

    /**
     * The sending bank will set originator_to_beneficiary_information_line1 in production. You can
     * simulate any value here.
     */
    fun originatorToBeneficiaryInformationLine1(): Optional<String> =
        body.originatorToBeneficiaryInformationLine1()

    /**
     * The sending bank will set originator_to_beneficiary_information_line2 in production. You can
     * simulate any value here.
     */
    fun originatorToBeneficiaryInformationLine2(): Optional<String> =
        body.originatorToBeneficiaryInformationLine2()

    /**
     * The sending bank will set originator_to_beneficiary_information_line3 in production. You can
     * simulate any value here.
     */
    fun originatorToBeneficiaryInformationLine3(): Optional<String> =
        body.originatorToBeneficiaryInformationLine3()

    /**
     * The sending bank will set originator_to_beneficiary_information_line4 in production. You can
     * simulate any value here.
     */
    fun originatorToBeneficiaryInformationLine4(): Optional<String> =
        body.originatorToBeneficiaryInformationLine4()

    /**
     * The sending bank will set sender_reference in production. You can simulate any value here.
     */
    fun senderReference(): Optional<String> = body.senderReference()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    @JvmSynthetic internal fun getBody(): SimulationInboundWireTransferCreateBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class SimulationInboundWireTransferCreateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("account_number_id") private val accountNumberId: String,
        @JsonProperty("amount") private val amount: Long,
        @JsonProperty("beneficiary_address_line1") private val beneficiaryAddressLine1: String?,
        @JsonProperty("beneficiary_address_line2") private val beneficiaryAddressLine2: String?,
        @JsonProperty("beneficiary_address_line3") private val beneficiaryAddressLine3: String?,
        @JsonProperty("beneficiary_name") private val beneficiaryName: String?,
        @JsonProperty("beneficiary_reference") private val beneficiaryReference: String?,
        @JsonProperty("originator_address_line1") private val originatorAddressLine1: String?,
        @JsonProperty("originator_address_line2") private val originatorAddressLine2: String?,
        @JsonProperty("originator_address_line3") private val originatorAddressLine3: String?,
        @JsonProperty("originator_name") private val originatorName: String?,
        @JsonProperty("originator_routing_number") private val originatorRoutingNumber: String?,
        @JsonProperty("originator_to_beneficiary_information_line1")
        private val originatorToBeneficiaryInformationLine1: String?,
        @JsonProperty("originator_to_beneficiary_information_line2")
        private val originatorToBeneficiaryInformationLine2: String?,
        @JsonProperty("originator_to_beneficiary_information_line3")
        private val originatorToBeneficiaryInformationLine3: String?,
        @JsonProperty("originator_to_beneficiary_information_line4")
        private val originatorToBeneficiaryInformationLine4: String?,
        @JsonProperty("sender_reference") private val senderReference: String?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The identifier of the Account Number the inbound Wire Transfer is for. */
        @JsonProperty("account_number_id") fun accountNumberId(): String = accountNumberId

        /** The transfer amount in cents. Must be positive. */
        @JsonProperty("amount") fun amount(): Long = amount

        /**
         * The sending bank will set beneficiary_address_line1 in production. You can simulate any
         * value here.
         */
        @JsonProperty("beneficiary_address_line1")
        fun beneficiaryAddressLine1(): Optional<String> =
            Optional.ofNullable(beneficiaryAddressLine1)

        /**
         * The sending bank will set beneficiary_address_line2 in production. You can simulate any
         * value here.
         */
        @JsonProperty("beneficiary_address_line2")
        fun beneficiaryAddressLine2(): Optional<String> =
            Optional.ofNullable(beneficiaryAddressLine2)

        /**
         * The sending bank will set beneficiary_address_line3 in production. You can simulate any
         * value here.
         */
        @JsonProperty("beneficiary_address_line3")
        fun beneficiaryAddressLine3(): Optional<String> =
            Optional.ofNullable(beneficiaryAddressLine3)

        /**
         * The sending bank will set beneficiary_name in production. You can simulate any value
         * here.
         */
        @JsonProperty("beneficiary_name")
        fun beneficiaryName(): Optional<String> = Optional.ofNullable(beneficiaryName)

        /**
         * The sending bank will set beneficiary_reference in production. You can simulate any value
         * here.
         */
        @JsonProperty("beneficiary_reference")
        fun beneficiaryReference(): Optional<String> = Optional.ofNullable(beneficiaryReference)

        /**
         * The sending bank will set originator_address_line1 in production. You can simulate any
         * value here.
         */
        @JsonProperty("originator_address_line1")
        fun originatorAddressLine1(): Optional<String> = Optional.ofNullable(originatorAddressLine1)

        /**
         * The sending bank will set originator_address_line2 in production. You can simulate any
         * value here.
         */
        @JsonProperty("originator_address_line2")
        fun originatorAddressLine2(): Optional<String> = Optional.ofNullable(originatorAddressLine2)

        /**
         * The sending bank will set originator_address_line3 in production. You can simulate any
         * value here.
         */
        @JsonProperty("originator_address_line3")
        fun originatorAddressLine3(): Optional<String> = Optional.ofNullable(originatorAddressLine3)

        /**
         * The sending bank will set originator_name in production. You can simulate any value here.
         */
        @JsonProperty("originator_name")
        fun originatorName(): Optional<String> = Optional.ofNullable(originatorName)

        /**
         * The sending bank will set originator_routing_number in production. You can simulate any
         * value here.
         */
        @JsonProperty("originator_routing_number")
        fun originatorRoutingNumber(): Optional<String> =
            Optional.ofNullable(originatorRoutingNumber)

        /**
         * The sending bank will set originator_to_beneficiary_information_line1 in production. You
         * can simulate any value here.
         */
        @JsonProperty("originator_to_beneficiary_information_line1")
        fun originatorToBeneficiaryInformationLine1(): Optional<String> =
            Optional.ofNullable(originatorToBeneficiaryInformationLine1)

        /**
         * The sending bank will set originator_to_beneficiary_information_line2 in production. You
         * can simulate any value here.
         */
        @JsonProperty("originator_to_beneficiary_information_line2")
        fun originatorToBeneficiaryInformationLine2(): Optional<String> =
            Optional.ofNullable(originatorToBeneficiaryInformationLine2)

        /**
         * The sending bank will set originator_to_beneficiary_information_line3 in production. You
         * can simulate any value here.
         */
        @JsonProperty("originator_to_beneficiary_information_line3")
        fun originatorToBeneficiaryInformationLine3(): Optional<String> =
            Optional.ofNullable(originatorToBeneficiaryInformationLine3)

        /**
         * The sending bank will set originator_to_beneficiary_information_line4 in production. You
         * can simulate any value here.
         */
        @JsonProperty("originator_to_beneficiary_information_line4")
        fun originatorToBeneficiaryInformationLine4(): Optional<String> =
            Optional.ofNullable(originatorToBeneficiaryInformationLine4)

        /**
         * The sending bank will set sender_reference in production. You can simulate any value
         * here.
         */
        @JsonProperty("sender_reference")
        fun senderReference(): Optional<String> = Optional.ofNullable(senderReference)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var accountNumberId: String? = null
            private var amount: Long? = null
            private var beneficiaryAddressLine1: String? = null
            private var beneficiaryAddressLine2: String? = null
            private var beneficiaryAddressLine3: String? = null
            private var beneficiaryName: String? = null
            private var beneficiaryReference: String? = null
            private var originatorAddressLine1: String? = null
            private var originatorAddressLine2: String? = null
            private var originatorAddressLine3: String? = null
            private var originatorName: String? = null
            private var originatorRoutingNumber: String? = null
            private var originatorToBeneficiaryInformationLine1: String? = null
            private var originatorToBeneficiaryInformationLine2: String? = null
            private var originatorToBeneficiaryInformationLine3: String? = null
            private var originatorToBeneficiaryInformationLine4: String? = null
            private var senderReference: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                simulationInboundWireTransferCreateBody: SimulationInboundWireTransferCreateBody
            ) = apply {
                accountNumberId = simulationInboundWireTransferCreateBody.accountNumberId
                amount = simulationInboundWireTransferCreateBody.amount
                beneficiaryAddressLine1 =
                    simulationInboundWireTransferCreateBody.beneficiaryAddressLine1
                beneficiaryAddressLine2 =
                    simulationInboundWireTransferCreateBody.beneficiaryAddressLine2
                beneficiaryAddressLine3 =
                    simulationInboundWireTransferCreateBody.beneficiaryAddressLine3
                beneficiaryName = simulationInboundWireTransferCreateBody.beneficiaryName
                beneficiaryReference = simulationInboundWireTransferCreateBody.beneficiaryReference
                originatorAddressLine1 =
                    simulationInboundWireTransferCreateBody.originatorAddressLine1
                originatorAddressLine2 =
                    simulationInboundWireTransferCreateBody.originatorAddressLine2
                originatorAddressLine3 =
                    simulationInboundWireTransferCreateBody.originatorAddressLine3
                originatorName = simulationInboundWireTransferCreateBody.originatorName
                originatorRoutingNumber =
                    simulationInboundWireTransferCreateBody.originatorRoutingNumber
                originatorToBeneficiaryInformationLine1 =
                    simulationInboundWireTransferCreateBody.originatorToBeneficiaryInformationLine1
                originatorToBeneficiaryInformationLine2 =
                    simulationInboundWireTransferCreateBody.originatorToBeneficiaryInformationLine2
                originatorToBeneficiaryInformationLine3 =
                    simulationInboundWireTransferCreateBody.originatorToBeneficiaryInformationLine3
                originatorToBeneficiaryInformationLine4 =
                    simulationInboundWireTransferCreateBody.originatorToBeneficiaryInformationLine4
                senderReference = simulationInboundWireTransferCreateBody.senderReference
                additionalProperties =
                    simulationInboundWireTransferCreateBody.additionalProperties.toMutableMap()
            }

            /** The identifier of the Account Number the inbound Wire Transfer is for. */
            fun accountNumberId(accountNumberId: String) = apply {
                this.accountNumberId = accountNumberId
            }

            /** The transfer amount in cents. Must be positive. */
            fun amount(amount: Long) = apply { this.amount = amount }

            /**
             * The sending bank will set beneficiary_address_line1 in production. You can simulate
             * any value here.
             */
            fun beneficiaryAddressLine1(beneficiaryAddressLine1: String?) = apply {
                this.beneficiaryAddressLine1 = beneficiaryAddressLine1
            }

            /**
             * The sending bank will set beneficiary_address_line1 in production. You can simulate
             * any value here.
             */
            fun beneficiaryAddressLine1(beneficiaryAddressLine1: Optional<String>) =
                beneficiaryAddressLine1(beneficiaryAddressLine1.orElse(null))

            /**
             * The sending bank will set beneficiary_address_line2 in production. You can simulate
             * any value here.
             */
            fun beneficiaryAddressLine2(beneficiaryAddressLine2: String?) = apply {
                this.beneficiaryAddressLine2 = beneficiaryAddressLine2
            }

            /**
             * The sending bank will set beneficiary_address_line2 in production. You can simulate
             * any value here.
             */
            fun beneficiaryAddressLine2(beneficiaryAddressLine2: Optional<String>) =
                beneficiaryAddressLine2(beneficiaryAddressLine2.orElse(null))

            /**
             * The sending bank will set beneficiary_address_line3 in production. You can simulate
             * any value here.
             */
            fun beneficiaryAddressLine3(beneficiaryAddressLine3: String?) = apply {
                this.beneficiaryAddressLine3 = beneficiaryAddressLine3
            }

            /**
             * The sending bank will set beneficiary_address_line3 in production. You can simulate
             * any value here.
             */
            fun beneficiaryAddressLine3(beneficiaryAddressLine3: Optional<String>) =
                beneficiaryAddressLine3(beneficiaryAddressLine3.orElse(null))

            /**
             * The sending bank will set beneficiary_name in production. You can simulate any value
             * here.
             */
            fun beneficiaryName(beneficiaryName: String?) = apply {
                this.beneficiaryName = beneficiaryName
            }

            /**
             * The sending bank will set beneficiary_name in production. You can simulate any value
             * here.
             */
            fun beneficiaryName(beneficiaryName: Optional<String>) =
                beneficiaryName(beneficiaryName.orElse(null))

            /**
             * The sending bank will set beneficiary_reference in production. You can simulate any
             * value here.
             */
            fun beneficiaryReference(beneficiaryReference: String?) = apply {
                this.beneficiaryReference = beneficiaryReference
            }

            /**
             * The sending bank will set beneficiary_reference in production. You can simulate any
             * value here.
             */
            fun beneficiaryReference(beneficiaryReference: Optional<String>) =
                beneficiaryReference(beneficiaryReference.orElse(null))

            /**
             * The sending bank will set originator_address_line1 in production. You can simulate
             * any value here.
             */
            fun originatorAddressLine1(originatorAddressLine1: String?) = apply {
                this.originatorAddressLine1 = originatorAddressLine1
            }

            /**
             * The sending bank will set originator_address_line1 in production. You can simulate
             * any value here.
             */
            fun originatorAddressLine1(originatorAddressLine1: Optional<String>) =
                originatorAddressLine1(originatorAddressLine1.orElse(null))

            /**
             * The sending bank will set originator_address_line2 in production. You can simulate
             * any value here.
             */
            fun originatorAddressLine2(originatorAddressLine2: String?) = apply {
                this.originatorAddressLine2 = originatorAddressLine2
            }

            /**
             * The sending bank will set originator_address_line2 in production. You can simulate
             * any value here.
             */
            fun originatorAddressLine2(originatorAddressLine2: Optional<String>) =
                originatorAddressLine2(originatorAddressLine2.orElse(null))

            /**
             * The sending bank will set originator_address_line3 in production. You can simulate
             * any value here.
             */
            fun originatorAddressLine3(originatorAddressLine3: String?) = apply {
                this.originatorAddressLine3 = originatorAddressLine3
            }

            /**
             * The sending bank will set originator_address_line3 in production. You can simulate
             * any value here.
             */
            fun originatorAddressLine3(originatorAddressLine3: Optional<String>) =
                originatorAddressLine3(originatorAddressLine3.orElse(null))

            /**
             * The sending bank will set originator_name in production. You can simulate any value
             * here.
             */
            fun originatorName(originatorName: String?) = apply {
                this.originatorName = originatorName
            }

            /**
             * The sending bank will set originator_name in production. You can simulate any value
             * here.
             */
            fun originatorName(originatorName: Optional<String>) =
                originatorName(originatorName.orElse(null))

            /**
             * The sending bank will set originator_routing_number in production. You can simulate
             * any value here.
             */
            fun originatorRoutingNumber(originatorRoutingNumber: String?) = apply {
                this.originatorRoutingNumber = originatorRoutingNumber
            }

            /**
             * The sending bank will set originator_routing_number in production. You can simulate
             * any value here.
             */
            fun originatorRoutingNumber(originatorRoutingNumber: Optional<String>) =
                originatorRoutingNumber(originatorRoutingNumber.orElse(null))

            /**
             * The sending bank will set originator_to_beneficiary_information_line1 in production.
             * You can simulate any value here.
             */
            fun originatorToBeneficiaryInformationLine1(
                originatorToBeneficiaryInformationLine1: String?
            ) = apply {
                this.originatorToBeneficiaryInformationLine1 =
                    originatorToBeneficiaryInformationLine1
            }

            /**
             * The sending bank will set originator_to_beneficiary_information_line1 in production.
             * You can simulate any value here.
             */
            fun originatorToBeneficiaryInformationLine1(
                originatorToBeneficiaryInformationLine1: Optional<String>
            ) =
                originatorToBeneficiaryInformationLine1(
                    originatorToBeneficiaryInformationLine1.orElse(null)
                )

            /**
             * The sending bank will set originator_to_beneficiary_information_line2 in production.
             * You can simulate any value here.
             */
            fun originatorToBeneficiaryInformationLine2(
                originatorToBeneficiaryInformationLine2: String?
            ) = apply {
                this.originatorToBeneficiaryInformationLine2 =
                    originatorToBeneficiaryInformationLine2
            }

            /**
             * The sending bank will set originator_to_beneficiary_information_line2 in production.
             * You can simulate any value here.
             */
            fun originatorToBeneficiaryInformationLine2(
                originatorToBeneficiaryInformationLine2: Optional<String>
            ) =
                originatorToBeneficiaryInformationLine2(
                    originatorToBeneficiaryInformationLine2.orElse(null)
                )

            /**
             * The sending bank will set originator_to_beneficiary_information_line3 in production.
             * You can simulate any value here.
             */
            fun originatorToBeneficiaryInformationLine3(
                originatorToBeneficiaryInformationLine3: String?
            ) = apply {
                this.originatorToBeneficiaryInformationLine3 =
                    originatorToBeneficiaryInformationLine3
            }

            /**
             * The sending bank will set originator_to_beneficiary_information_line3 in production.
             * You can simulate any value here.
             */
            fun originatorToBeneficiaryInformationLine3(
                originatorToBeneficiaryInformationLine3: Optional<String>
            ) =
                originatorToBeneficiaryInformationLine3(
                    originatorToBeneficiaryInformationLine3.orElse(null)
                )

            /**
             * The sending bank will set originator_to_beneficiary_information_line4 in production.
             * You can simulate any value here.
             */
            fun originatorToBeneficiaryInformationLine4(
                originatorToBeneficiaryInformationLine4: String?
            ) = apply {
                this.originatorToBeneficiaryInformationLine4 =
                    originatorToBeneficiaryInformationLine4
            }

            /**
             * The sending bank will set originator_to_beneficiary_information_line4 in production.
             * You can simulate any value here.
             */
            fun originatorToBeneficiaryInformationLine4(
                originatorToBeneficiaryInformationLine4: Optional<String>
            ) =
                originatorToBeneficiaryInformationLine4(
                    originatorToBeneficiaryInformationLine4.orElse(null)
                )

            /**
             * The sending bank will set sender_reference in production. You can simulate any value
             * here.
             */
            fun senderReference(senderReference: String?) = apply {
                this.senderReference = senderReference
            }

            /**
             * The sending bank will set sender_reference in production. You can simulate any value
             * here.
             */
            fun senderReference(senderReference: Optional<String>) =
                senderReference(senderReference.orElse(null))

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

            fun build(): SimulationInboundWireTransferCreateBody =
                SimulationInboundWireTransferCreateBody(
                    checkNotNull(accountNumberId) {
                        "`accountNumberId` is required but was not set"
                    },
                    checkNotNull(amount) { "`amount` is required but was not set" },
                    beneficiaryAddressLine1,
                    beneficiaryAddressLine2,
                    beneficiaryAddressLine3,
                    beneficiaryName,
                    beneficiaryReference,
                    originatorAddressLine1,
                    originatorAddressLine2,
                    originatorAddressLine3,
                    originatorName,
                    originatorRoutingNumber,
                    originatorToBeneficiaryInformationLine1,
                    originatorToBeneficiaryInformationLine2,
                    originatorToBeneficiaryInformationLine3,
                    originatorToBeneficiaryInformationLine4,
                    senderReference,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is SimulationInboundWireTransferCreateBody && accountNumberId == other.accountNumberId && amount == other.amount && beneficiaryAddressLine1 == other.beneficiaryAddressLine1 && beneficiaryAddressLine2 == other.beneficiaryAddressLine2 && beneficiaryAddressLine3 == other.beneficiaryAddressLine3 && beneficiaryName == other.beneficiaryName && beneficiaryReference == other.beneficiaryReference && originatorAddressLine1 == other.originatorAddressLine1 && originatorAddressLine2 == other.originatorAddressLine2 && originatorAddressLine3 == other.originatorAddressLine3 && originatorName == other.originatorName && originatorRoutingNumber == other.originatorRoutingNumber && originatorToBeneficiaryInformationLine1 == other.originatorToBeneficiaryInformationLine1 && originatorToBeneficiaryInformationLine2 == other.originatorToBeneficiaryInformationLine2 && originatorToBeneficiaryInformationLine3 == other.originatorToBeneficiaryInformationLine3 && originatorToBeneficiaryInformationLine4 == other.originatorToBeneficiaryInformationLine4 && senderReference == other.senderReference && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(accountNumberId, amount, beneficiaryAddressLine1, beneficiaryAddressLine2, beneficiaryAddressLine3, beneficiaryName, beneficiaryReference, originatorAddressLine1, originatorAddressLine2, originatorAddressLine3, originatorName, originatorRoutingNumber, originatorToBeneficiaryInformationLine1, originatorToBeneficiaryInformationLine2, originatorToBeneficiaryInformationLine3, originatorToBeneficiaryInformationLine4, senderReference, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SimulationInboundWireTransferCreateBody{accountNumberId=$accountNumberId, amount=$amount, beneficiaryAddressLine1=$beneficiaryAddressLine1, beneficiaryAddressLine2=$beneficiaryAddressLine2, beneficiaryAddressLine3=$beneficiaryAddressLine3, beneficiaryName=$beneficiaryName, beneficiaryReference=$beneficiaryReference, originatorAddressLine1=$originatorAddressLine1, originatorAddressLine2=$originatorAddressLine2, originatorAddressLine3=$originatorAddressLine3, originatorName=$originatorName, originatorRoutingNumber=$originatorRoutingNumber, originatorToBeneficiaryInformationLine1=$originatorToBeneficiaryInformationLine1, originatorToBeneficiaryInformationLine2=$originatorToBeneficiaryInformationLine2, originatorToBeneficiaryInformationLine3=$originatorToBeneficiaryInformationLine3, originatorToBeneficiaryInformationLine4=$originatorToBeneficiaryInformationLine4, senderReference=$senderReference, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var body: SimulationInboundWireTransferCreateBody.Builder =
            SimulationInboundWireTransferCreateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            simulationInboundWireTransferCreateParams: SimulationInboundWireTransferCreateParams
        ) = apply {
            body = simulationInboundWireTransferCreateParams.body.toBuilder()
            additionalHeaders =
                simulationInboundWireTransferCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                simulationInboundWireTransferCreateParams.additionalQueryParams.toBuilder()
        }

        /** The identifier of the Account Number the inbound Wire Transfer is for. */
        fun accountNumberId(accountNumberId: String) = apply {
            body.accountNumberId(accountNumberId)
        }

        /** The transfer amount in cents. Must be positive. */
        fun amount(amount: Long) = apply { body.amount(amount) }

        /**
         * The sending bank will set beneficiary_address_line1 in production. You can simulate any
         * value here.
         */
        fun beneficiaryAddressLine1(beneficiaryAddressLine1: String?) = apply {
            body.beneficiaryAddressLine1(beneficiaryAddressLine1)
        }

        /**
         * The sending bank will set beneficiary_address_line1 in production. You can simulate any
         * value here.
         */
        fun beneficiaryAddressLine1(beneficiaryAddressLine1: Optional<String>) =
            beneficiaryAddressLine1(beneficiaryAddressLine1.orElse(null))

        /**
         * The sending bank will set beneficiary_address_line2 in production. You can simulate any
         * value here.
         */
        fun beneficiaryAddressLine2(beneficiaryAddressLine2: String?) = apply {
            body.beneficiaryAddressLine2(beneficiaryAddressLine2)
        }

        /**
         * The sending bank will set beneficiary_address_line2 in production. You can simulate any
         * value here.
         */
        fun beneficiaryAddressLine2(beneficiaryAddressLine2: Optional<String>) =
            beneficiaryAddressLine2(beneficiaryAddressLine2.orElse(null))

        /**
         * The sending bank will set beneficiary_address_line3 in production. You can simulate any
         * value here.
         */
        fun beneficiaryAddressLine3(beneficiaryAddressLine3: String?) = apply {
            body.beneficiaryAddressLine3(beneficiaryAddressLine3)
        }

        /**
         * The sending bank will set beneficiary_address_line3 in production. You can simulate any
         * value here.
         */
        fun beneficiaryAddressLine3(beneficiaryAddressLine3: Optional<String>) =
            beneficiaryAddressLine3(beneficiaryAddressLine3.orElse(null))

        /**
         * The sending bank will set beneficiary_name in production. You can simulate any value
         * here.
         */
        fun beneficiaryName(beneficiaryName: String?) = apply {
            body.beneficiaryName(beneficiaryName)
        }

        /**
         * The sending bank will set beneficiary_name in production. You can simulate any value
         * here.
         */
        fun beneficiaryName(beneficiaryName: Optional<String>) =
            beneficiaryName(beneficiaryName.orElse(null))

        /**
         * The sending bank will set beneficiary_reference in production. You can simulate any value
         * here.
         */
        fun beneficiaryReference(beneficiaryReference: String?) = apply {
            body.beneficiaryReference(beneficiaryReference)
        }

        /**
         * The sending bank will set beneficiary_reference in production. You can simulate any value
         * here.
         */
        fun beneficiaryReference(beneficiaryReference: Optional<String>) =
            beneficiaryReference(beneficiaryReference.orElse(null))

        /**
         * The sending bank will set originator_address_line1 in production. You can simulate any
         * value here.
         */
        fun originatorAddressLine1(originatorAddressLine1: String?) = apply {
            body.originatorAddressLine1(originatorAddressLine1)
        }

        /**
         * The sending bank will set originator_address_line1 in production. You can simulate any
         * value here.
         */
        fun originatorAddressLine1(originatorAddressLine1: Optional<String>) =
            originatorAddressLine1(originatorAddressLine1.orElse(null))

        /**
         * The sending bank will set originator_address_line2 in production. You can simulate any
         * value here.
         */
        fun originatorAddressLine2(originatorAddressLine2: String?) = apply {
            body.originatorAddressLine2(originatorAddressLine2)
        }

        /**
         * The sending bank will set originator_address_line2 in production. You can simulate any
         * value here.
         */
        fun originatorAddressLine2(originatorAddressLine2: Optional<String>) =
            originatorAddressLine2(originatorAddressLine2.orElse(null))

        /**
         * The sending bank will set originator_address_line3 in production. You can simulate any
         * value here.
         */
        fun originatorAddressLine3(originatorAddressLine3: String?) = apply {
            body.originatorAddressLine3(originatorAddressLine3)
        }

        /**
         * The sending bank will set originator_address_line3 in production. You can simulate any
         * value here.
         */
        fun originatorAddressLine3(originatorAddressLine3: Optional<String>) =
            originatorAddressLine3(originatorAddressLine3.orElse(null))

        /**
         * The sending bank will set originator_name in production. You can simulate any value here.
         */
        fun originatorName(originatorName: String?) = apply { body.originatorName(originatorName) }

        /**
         * The sending bank will set originator_name in production. You can simulate any value here.
         */
        fun originatorName(originatorName: Optional<String>) =
            originatorName(originatorName.orElse(null))

        /**
         * The sending bank will set originator_routing_number in production. You can simulate any
         * value here.
         */
        fun originatorRoutingNumber(originatorRoutingNumber: String?) = apply {
            body.originatorRoutingNumber(originatorRoutingNumber)
        }

        /**
         * The sending bank will set originator_routing_number in production. You can simulate any
         * value here.
         */
        fun originatorRoutingNumber(originatorRoutingNumber: Optional<String>) =
            originatorRoutingNumber(originatorRoutingNumber.orElse(null))

        /**
         * The sending bank will set originator_to_beneficiary_information_line1 in production. You
         * can simulate any value here.
         */
        fun originatorToBeneficiaryInformationLine1(
            originatorToBeneficiaryInformationLine1: String?
        ) = apply {
            body.originatorToBeneficiaryInformationLine1(originatorToBeneficiaryInformationLine1)
        }

        /**
         * The sending bank will set originator_to_beneficiary_information_line1 in production. You
         * can simulate any value here.
         */
        fun originatorToBeneficiaryInformationLine1(
            originatorToBeneficiaryInformationLine1: Optional<String>
        ) =
            originatorToBeneficiaryInformationLine1(
                originatorToBeneficiaryInformationLine1.orElse(null)
            )

        /**
         * The sending bank will set originator_to_beneficiary_information_line2 in production. You
         * can simulate any value here.
         */
        fun originatorToBeneficiaryInformationLine2(
            originatorToBeneficiaryInformationLine2: String?
        ) = apply {
            body.originatorToBeneficiaryInformationLine2(originatorToBeneficiaryInformationLine2)
        }

        /**
         * The sending bank will set originator_to_beneficiary_information_line2 in production. You
         * can simulate any value here.
         */
        fun originatorToBeneficiaryInformationLine2(
            originatorToBeneficiaryInformationLine2: Optional<String>
        ) =
            originatorToBeneficiaryInformationLine2(
                originatorToBeneficiaryInformationLine2.orElse(null)
            )

        /**
         * The sending bank will set originator_to_beneficiary_information_line3 in production. You
         * can simulate any value here.
         */
        fun originatorToBeneficiaryInformationLine3(
            originatorToBeneficiaryInformationLine3: String?
        ) = apply {
            body.originatorToBeneficiaryInformationLine3(originatorToBeneficiaryInformationLine3)
        }

        /**
         * The sending bank will set originator_to_beneficiary_information_line3 in production. You
         * can simulate any value here.
         */
        fun originatorToBeneficiaryInformationLine3(
            originatorToBeneficiaryInformationLine3: Optional<String>
        ) =
            originatorToBeneficiaryInformationLine3(
                originatorToBeneficiaryInformationLine3.orElse(null)
            )

        /**
         * The sending bank will set originator_to_beneficiary_information_line4 in production. You
         * can simulate any value here.
         */
        fun originatorToBeneficiaryInformationLine4(
            originatorToBeneficiaryInformationLine4: String?
        ) = apply {
            body.originatorToBeneficiaryInformationLine4(originatorToBeneficiaryInformationLine4)
        }

        /**
         * The sending bank will set originator_to_beneficiary_information_line4 in production. You
         * can simulate any value here.
         */
        fun originatorToBeneficiaryInformationLine4(
            originatorToBeneficiaryInformationLine4: Optional<String>
        ) =
            originatorToBeneficiaryInformationLine4(
                originatorToBeneficiaryInformationLine4.orElse(null)
            )

        /**
         * The sending bank will set sender_reference in production. You can simulate any value
         * here.
         */
        fun senderReference(senderReference: String?) = apply {
            body.senderReference(senderReference)
        }

        /**
         * The sending bank will set sender_reference in production. You can simulate any value
         * here.
         */
        fun senderReference(senderReference: Optional<String>) =
            senderReference(senderReference.orElse(null))

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

        fun build(): SimulationInboundWireTransferCreateParams =
            SimulationInboundWireTransferCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SimulationInboundWireTransferCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "SimulationInboundWireTransferCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
