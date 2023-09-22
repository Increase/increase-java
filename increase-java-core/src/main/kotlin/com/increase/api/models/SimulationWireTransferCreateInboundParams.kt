package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.toUnmodifiable
import com.increase.api.models.*
import java.util.Objects
import java.util.Optional

class SimulationWireTransferCreateInboundParams
constructor(
    private val accountNumberId: String,
    private val amount: Long,
    private val beneficiaryAddressLine1: String?,
    private val beneficiaryAddressLine2: String?,
    private val beneficiaryAddressLine3: String?,
    private val beneficiaryName: String?,
    private val beneficiaryReference: String?,
    private val originatorAddressLine1: String?,
    private val originatorAddressLine2: String?,
    private val originatorAddressLine3: String?,
    private val originatorName: String?,
    private val originatorRoutingNumber: String?,
    private val originatorToBeneficiaryInformationLine1: String?,
    private val originatorToBeneficiaryInformationLine2: String?,
    private val originatorToBeneficiaryInformationLine3: String?,
    private val originatorToBeneficiaryInformationLine4: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun accountNumberId(): String = accountNumberId

    fun amount(): Long = amount

    fun beneficiaryAddressLine1(): Optional<String> = Optional.ofNullable(beneficiaryAddressLine1)

    fun beneficiaryAddressLine2(): Optional<String> = Optional.ofNullable(beneficiaryAddressLine2)

    fun beneficiaryAddressLine3(): Optional<String> = Optional.ofNullable(beneficiaryAddressLine3)

    fun beneficiaryName(): Optional<String> = Optional.ofNullable(beneficiaryName)

    fun beneficiaryReference(): Optional<String> = Optional.ofNullable(beneficiaryReference)

    fun originatorAddressLine1(): Optional<String> = Optional.ofNullable(originatorAddressLine1)

    fun originatorAddressLine2(): Optional<String> = Optional.ofNullable(originatorAddressLine2)

    fun originatorAddressLine3(): Optional<String> = Optional.ofNullable(originatorAddressLine3)

    fun originatorName(): Optional<String> = Optional.ofNullable(originatorName)

    fun originatorRoutingNumber(): Optional<String> = Optional.ofNullable(originatorRoutingNumber)

    fun originatorToBeneficiaryInformationLine1(): Optional<String> =
        Optional.ofNullable(originatorToBeneficiaryInformationLine1)

    fun originatorToBeneficiaryInformationLine2(): Optional<String> =
        Optional.ofNullable(originatorToBeneficiaryInformationLine2)

    fun originatorToBeneficiaryInformationLine3(): Optional<String> =
        Optional.ofNullable(originatorToBeneficiaryInformationLine3)

    fun originatorToBeneficiaryInformationLine4(): Optional<String> =
        Optional.ofNullable(originatorToBeneficiaryInformationLine4)

    @JvmSynthetic
    internal fun getBody(): SimulationWireTransferCreateInboundBody {
        return SimulationWireTransferCreateInboundBody(
            accountNumberId,
            amount,
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
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = SimulationWireTransferCreateInboundBody.Builder::class)
    @NoAutoDetect
    class SimulationWireTransferCreateInboundBody
    internal constructor(
        private val accountNumberId: String?,
        private val amount: Long?,
        private val beneficiaryAddressLine1: String?,
        private val beneficiaryAddressLine2: String?,
        private val beneficiaryAddressLine3: String?,
        private val beneficiaryName: String?,
        private val beneficiaryReference: String?,
        private val originatorAddressLine1: String?,
        private val originatorAddressLine2: String?,
        private val originatorAddressLine3: String?,
        private val originatorName: String?,
        private val originatorRoutingNumber: String?,
        private val originatorToBeneficiaryInformationLine1: String?,
        private val originatorToBeneficiaryInformationLine2: String?,
        private val originatorToBeneficiaryInformationLine3: String?,
        private val originatorToBeneficiaryInformationLine4: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** The identifier of the Account Number the inbound Wire Transfer is for. */
        @JsonProperty("account_number_id") fun accountNumberId(): String? = accountNumberId

        /** The transfer amount in cents. Must be positive. */
        @JsonProperty("amount") fun amount(): Long? = amount

        /**
         * The sending bank will set beneficiary_address_line1 in production. You can simulate any
         * value here.
         */
        @JsonProperty("beneficiary_address_line1")
        fun beneficiaryAddressLine1(): String? = beneficiaryAddressLine1

        /**
         * The sending bank will set beneficiary_address_line2 in production. You can simulate any
         * value here.
         */
        @JsonProperty("beneficiary_address_line2")
        fun beneficiaryAddressLine2(): String? = beneficiaryAddressLine2

        /**
         * The sending bank will set beneficiary_address_line3 in production. You can simulate any
         * value here.
         */
        @JsonProperty("beneficiary_address_line3")
        fun beneficiaryAddressLine3(): String? = beneficiaryAddressLine3

        /**
         * The sending bank will set beneficiary_name in production. You can simulate any value
         * here.
         */
        @JsonProperty("beneficiary_name") fun beneficiaryName(): String? = beneficiaryName

        /**
         * The sending bank will set beneficiary_reference in production. You can simulate any value
         * here.
         */
        @JsonProperty("beneficiary_reference")
        fun beneficiaryReference(): String? = beneficiaryReference

        /**
         * The sending bank will set originator_address_line1 in production. You can simulate any
         * value here.
         */
        @JsonProperty("originator_address_line1")
        fun originatorAddressLine1(): String? = originatorAddressLine1

        /**
         * The sending bank will set originator_address_line2 in production. You can simulate any
         * value here.
         */
        @JsonProperty("originator_address_line2")
        fun originatorAddressLine2(): String? = originatorAddressLine2

        /**
         * The sending bank will set originator_address_line3 in production. You can simulate any
         * value here.
         */
        @JsonProperty("originator_address_line3")
        fun originatorAddressLine3(): String? = originatorAddressLine3

        /**
         * The sending bank will set originator_name in production. You can simulate any value here.
         */
        @JsonProperty("originator_name") fun originatorName(): String? = originatorName

        /**
         * The sending bank will set originator_routing_number in production. You can simulate any
         * value here.
         */
        @JsonProperty("originator_routing_number")
        fun originatorRoutingNumber(): String? = originatorRoutingNumber

        /**
         * The sending bank will set originator_to_beneficiary_information_line1 in production. You
         * can simulate any value here.
         */
        @JsonProperty("originator_to_beneficiary_information_line1")
        fun originatorToBeneficiaryInformationLine1(): String? =
            originatorToBeneficiaryInformationLine1

        /**
         * The sending bank will set originator_to_beneficiary_information_line2 in production. You
         * can simulate any value here.
         */
        @JsonProperty("originator_to_beneficiary_information_line2")
        fun originatorToBeneficiaryInformationLine2(): String? =
            originatorToBeneficiaryInformationLine2

        /**
         * The sending bank will set originator_to_beneficiary_information_line3 in production. You
         * can simulate any value here.
         */
        @JsonProperty("originator_to_beneficiary_information_line3")
        fun originatorToBeneficiaryInformationLine3(): String? =
            originatorToBeneficiaryInformationLine3

        /**
         * The sending bank will set originator_to_beneficiary_information_line4 in production. You
         * can simulate any value here.
         */
        @JsonProperty("originator_to_beneficiary_information_line4")
        fun originatorToBeneficiaryInformationLine4(): String? =
            originatorToBeneficiaryInformationLine4

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is SimulationWireTransferCreateInboundBody &&
                this.accountNumberId == other.accountNumberId &&
                this.amount == other.amount &&
                this.beneficiaryAddressLine1 == other.beneficiaryAddressLine1 &&
                this.beneficiaryAddressLine2 == other.beneficiaryAddressLine2 &&
                this.beneficiaryAddressLine3 == other.beneficiaryAddressLine3 &&
                this.beneficiaryName == other.beneficiaryName &&
                this.beneficiaryReference == other.beneficiaryReference &&
                this.originatorAddressLine1 == other.originatorAddressLine1 &&
                this.originatorAddressLine2 == other.originatorAddressLine2 &&
                this.originatorAddressLine3 == other.originatorAddressLine3 &&
                this.originatorName == other.originatorName &&
                this.originatorRoutingNumber == other.originatorRoutingNumber &&
                this.originatorToBeneficiaryInformationLine1 ==
                    other.originatorToBeneficiaryInformationLine1 &&
                this.originatorToBeneficiaryInformationLine2 ==
                    other.originatorToBeneficiaryInformationLine2 &&
                this.originatorToBeneficiaryInformationLine3 ==
                    other.originatorToBeneficiaryInformationLine3 &&
                this.originatorToBeneficiaryInformationLine4 ==
                    other.originatorToBeneficiaryInformationLine4 &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        accountNumberId,
                        amount,
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
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "SimulationWireTransferCreateInboundBody{accountNumberId=$accountNumberId, amount=$amount, beneficiaryAddressLine1=$beneficiaryAddressLine1, beneficiaryAddressLine2=$beneficiaryAddressLine2, beneficiaryAddressLine3=$beneficiaryAddressLine3, beneficiaryName=$beneficiaryName, beneficiaryReference=$beneficiaryReference, originatorAddressLine1=$originatorAddressLine1, originatorAddressLine2=$originatorAddressLine2, originatorAddressLine3=$originatorAddressLine3, originatorName=$originatorName, originatorRoutingNumber=$originatorRoutingNumber, originatorToBeneficiaryInformationLine1=$originatorToBeneficiaryInformationLine1, originatorToBeneficiaryInformationLine2=$originatorToBeneficiaryInformationLine2, originatorToBeneficiaryInformationLine3=$originatorToBeneficiaryInformationLine3, originatorToBeneficiaryInformationLine4=$originatorToBeneficiaryInformationLine4, additionalProperties=$additionalProperties}"

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
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                simulationWireTransferCreateInboundBody: SimulationWireTransferCreateInboundBody
            ) = apply {
                this.accountNumberId = simulationWireTransferCreateInboundBody.accountNumberId
                this.amount = simulationWireTransferCreateInboundBody.amount
                this.beneficiaryAddressLine1 =
                    simulationWireTransferCreateInboundBody.beneficiaryAddressLine1
                this.beneficiaryAddressLine2 =
                    simulationWireTransferCreateInboundBody.beneficiaryAddressLine2
                this.beneficiaryAddressLine3 =
                    simulationWireTransferCreateInboundBody.beneficiaryAddressLine3
                this.beneficiaryName = simulationWireTransferCreateInboundBody.beneficiaryName
                this.beneficiaryReference =
                    simulationWireTransferCreateInboundBody.beneficiaryReference
                this.originatorAddressLine1 =
                    simulationWireTransferCreateInboundBody.originatorAddressLine1
                this.originatorAddressLine2 =
                    simulationWireTransferCreateInboundBody.originatorAddressLine2
                this.originatorAddressLine3 =
                    simulationWireTransferCreateInboundBody.originatorAddressLine3
                this.originatorName = simulationWireTransferCreateInboundBody.originatorName
                this.originatorRoutingNumber =
                    simulationWireTransferCreateInboundBody.originatorRoutingNumber
                this.originatorToBeneficiaryInformationLine1 =
                    simulationWireTransferCreateInboundBody.originatorToBeneficiaryInformationLine1
                this.originatorToBeneficiaryInformationLine2 =
                    simulationWireTransferCreateInboundBody.originatorToBeneficiaryInformationLine2
                this.originatorToBeneficiaryInformationLine3 =
                    simulationWireTransferCreateInboundBody.originatorToBeneficiaryInformationLine3
                this.originatorToBeneficiaryInformationLine4 =
                    simulationWireTransferCreateInboundBody.originatorToBeneficiaryInformationLine4
                additionalProperties(simulationWireTransferCreateInboundBody.additionalProperties)
            }

            /** The identifier of the Account Number the inbound Wire Transfer is for. */
            @JsonProperty("account_number_id")
            fun accountNumberId(accountNumberId: String) = apply {
                this.accountNumberId = accountNumberId
            }

            /** The transfer amount in cents. Must be positive. */
            @JsonProperty("amount") fun amount(amount: Long) = apply { this.amount = amount }

            /**
             * The sending bank will set beneficiary_address_line1 in production. You can simulate
             * any value here.
             */
            @JsonProperty("beneficiary_address_line1")
            fun beneficiaryAddressLine1(beneficiaryAddressLine1: String) = apply {
                this.beneficiaryAddressLine1 = beneficiaryAddressLine1
            }

            /**
             * The sending bank will set beneficiary_address_line2 in production. You can simulate
             * any value here.
             */
            @JsonProperty("beneficiary_address_line2")
            fun beneficiaryAddressLine2(beneficiaryAddressLine2: String) = apply {
                this.beneficiaryAddressLine2 = beneficiaryAddressLine2
            }

            /**
             * The sending bank will set beneficiary_address_line3 in production. You can simulate
             * any value here.
             */
            @JsonProperty("beneficiary_address_line3")
            fun beneficiaryAddressLine3(beneficiaryAddressLine3: String) = apply {
                this.beneficiaryAddressLine3 = beneficiaryAddressLine3
            }

            /**
             * The sending bank will set beneficiary_name in production. You can simulate any value
             * here.
             */
            @JsonProperty("beneficiary_name")
            fun beneficiaryName(beneficiaryName: String) = apply {
                this.beneficiaryName = beneficiaryName
            }

            /**
             * The sending bank will set beneficiary_reference in production. You can simulate any
             * value here.
             */
            @JsonProperty("beneficiary_reference")
            fun beneficiaryReference(beneficiaryReference: String) = apply {
                this.beneficiaryReference = beneficiaryReference
            }

            /**
             * The sending bank will set originator_address_line1 in production. You can simulate
             * any value here.
             */
            @JsonProperty("originator_address_line1")
            fun originatorAddressLine1(originatorAddressLine1: String) = apply {
                this.originatorAddressLine1 = originatorAddressLine1
            }

            /**
             * The sending bank will set originator_address_line2 in production. You can simulate
             * any value here.
             */
            @JsonProperty("originator_address_line2")
            fun originatorAddressLine2(originatorAddressLine2: String) = apply {
                this.originatorAddressLine2 = originatorAddressLine2
            }

            /**
             * The sending bank will set originator_address_line3 in production. You can simulate
             * any value here.
             */
            @JsonProperty("originator_address_line3")
            fun originatorAddressLine3(originatorAddressLine3: String) = apply {
                this.originatorAddressLine3 = originatorAddressLine3
            }

            /**
             * The sending bank will set originator_name in production. You can simulate any value
             * here.
             */
            @JsonProperty("originator_name")
            fun originatorName(originatorName: String) = apply {
                this.originatorName = originatorName
            }

            /**
             * The sending bank will set originator_routing_number in production. You can simulate
             * any value here.
             */
            @JsonProperty("originator_routing_number")
            fun originatorRoutingNumber(originatorRoutingNumber: String) = apply {
                this.originatorRoutingNumber = originatorRoutingNumber
            }

            /**
             * The sending bank will set originator_to_beneficiary_information_line1 in production.
             * You can simulate any value here.
             */
            @JsonProperty("originator_to_beneficiary_information_line1")
            fun originatorToBeneficiaryInformationLine1(
                originatorToBeneficiaryInformationLine1: String
            ) = apply {
                this.originatorToBeneficiaryInformationLine1 =
                    originatorToBeneficiaryInformationLine1
            }

            /**
             * The sending bank will set originator_to_beneficiary_information_line2 in production.
             * You can simulate any value here.
             */
            @JsonProperty("originator_to_beneficiary_information_line2")
            fun originatorToBeneficiaryInformationLine2(
                originatorToBeneficiaryInformationLine2: String
            ) = apply {
                this.originatorToBeneficiaryInformationLine2 =
                    originatorToBeneficiaryInformationLine2
            }

            /**
             * The sending bank will set originator_to_beneficiary_information_line3 in production.
             * You can simulate any value here.
             */
            @JsonProperty("originator_to_beneficiary_information_line3")
            fun originatorToBeneficiaryInformationLine3(
                originatorToBeneficiaryInformationLine3: String
            ) = apply {
                this.originatorToBeneficiaryInformationLine3 =
                    originatorToBeneficiaryInformationLine3
            }

            /**
             * The sending bank will set originator_to_beneficiary_information_line4 in production.
             * You can simulate any value here.
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

            fun build(): SimulationWireTransferCreateInboundBody =
                SimulationWireTransferCreateInboundBody(
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

        return other is SimulationWireTransferCreateInboundParams &&
            this.accountNumberId == other.accountNumberId &&
            this.amount == other.amount &&
            this.beneficiaryAddressLine1 == other.beneficiaryAddressLine1 &&
            this.beneficiaryAddressLine2 == other.beneficiaryAddressLine2 &&
            this.beneficiaryAddressLine3 == other.beneficiaryAddressLine3 &&
            this.beneficiaryName == other.beneficiaryName &&
            this.beneficiaryReference == other.beneficiaryReference &&
            this.originatorAddressLine1 == other.originatorAddressLine1 &&
            this.originatorAddressLine2 == other.originatorAddressLine2 &&
            this.originatorAddressLine3 == other.originatorAddressLine3 &&
            this.originatorName == other.originatorName &&
            this.originatorRoutingNumber == other.originatorRoutingNumber &&
            this.originatorToBeneficiaryInformationLine1 ==
                other.originatorToBeneficiaryInformationLine1 &&
            this.originatorToBeneficiaryInformationLine2 ==
                other.originatorToBeneficiaryInformationLine2 &&
            this.originatorToBeneficiaryInformationLine3 ==
                other.originatorToBeneficiaryInformationLine3 &&
            this.originatorToBeneficiaryInformationLine4 ==
                other.originatorToBeneficiaryInformationLine4 &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            accountNumberId,
            amount,
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
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "SimulationWireTransferCreateInboundParams{accountNumberId=$accountNumberId, amount=$amount, beneficiaryAddressLine1=$beneficiaryAddressLine1, beneficiaryAddressLine2=$beneficiaryAddressLine2, beneficiaryAddressLine3=$beneficiaryAddressLine3, beneficiaryName=$beneficiaryName, beneficiaryReference=$beneficiaryReference, originatorAddressLine1=$originatorAddressLine1, originatorAddressLine2=$originatorAddressLine2, originatorAddressLine3=$originatorAddressLine3, originatorName=$originatorName, originatorRoutingNumber=$originatorRoutingNumber, originatorToBeneficiaryInformationLine1=$originatorToBeneficiaryInformationLine1, originatorToBeneficiaryInformationLine2=$originatorToBeneficiaryInformationLine2, originatorToBeneficiaryInformationLine3=$originatorToBeneficiaryInformationLine3, originatorToBeneficiaryInformationLine4=$originatorToBeneficiaryInformationLine4, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
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
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            simulationWireTransferCreateInboundParams: SimulationWireTransferCreateInboundParams
        ) = apply {
            this.accountNumberId = simulationWireTransferCreateInboundParams.accountNumberId
            this.amount = simulationWireTransferCreateInboundParams.amount
            this.beneficiaryAddressLine1 =
                simulationWireTransferCreateInboundParams.beneficiaryAddressLine1
            this.beneficiaryAddressLine2 =
                simulationWireTransferCreateInboundParams.beneficiaryAddressLine2
            this.beneficiaryAddressLine3 =
                simulationWireTransferCreateInboundParams.beneficiaryAddressLine3
            this.beneficiaryName = simulationWireTransferCreateInboundParams.beneficiaryName
            this.beneficiaryReference =
                simulationWireTransferCreateInboundParams.beneficiaryReference
            this.originatorAddressLine1 =
                simulationWireTransferCreateInboundParams.originatorAddressLine1
            this.originatorAddressLine2 =
                simulationWireTransferCreateInboundParams.originatorAddressLine2
            this.originatorAddressLine3 =
                simulationWireTransferCreateInboundParams.originatorAddressLine3
            this.originatorName = simulationWireTransferCreateInboundParams.originatorName
            this.originatorRoutingNumber =
                simulationWireTransferCreateInboundParams.originatorRoutingNumber
            this.originatorToBeneficiaryInformationLine1 =
                simulationWireTransferCreateInboundParams.originatorToBeneficiaryInformationLine1
            this.originatorToBeneficiaryInformationLine2 =
                simulationWireTransferCreateInboundParams.originatorToBeneficiaryInformationLine2
            this.originatorToBeneficiaryInformationLine3 =
                simulationWireTransferCreateInboundParams.originatorToBeneficiaryInformationLine3
            this.originatorToBeneficiaryInformationLine4 =
                simulationWireTransferCreateInboundParams.originatorToBeneficiaryInformationLine4
            additionalQueryParams(simulationWireTransferCreateInboundParams.additionalQueryParams)
            additionalHeaders(simulationWireTransferCreateInboundParams.additionalHeaders)
            additionalBodyProperties(
                simulationWireTransferCreateInboundParams.additionalBodyProperties
            )
        }

        /** The identifier of the Account Number the inbound Wire Transfer is for. */
        fun accountNumberId(accountNumberId: String) = apply {
            this.accountNumberId = accountNumberId
        }

        /** The transfer amount in cents. Must be positive. */
        fun amount(amount: Long) = apply { this.amount = amount }

        /**
         * The sending bank will set beneficiary_address_line1 in production. You can simulate any
         * value here.
         */
        fun beneficiaryAddressLine1(beneficiaryAddressLine1: String) = apply {
            this.beneficiaryAddressLine1 = beneficiaryAddressLine1
        }

        /**
         * The sending bank will set beneficiary_address_line2 in production. You can simulate any
         * value here.
         */
        fun beneficiaryAddressLine2(beneficiaryAddressLine2: String) = apply {
            this.beneficiaryAddressLine2 = beneficiaryAddressLine2
        }

        /**
         * The sending bank will set beneficiary_address_line3 in production. You can simulate any
         * value here.
         */
        fun beneficiaryAddressLine3(beneficiaryAddressLine3: String) = apply {
            this.beneficiaryAddressLine3 = beneficiaryAddressLine3
        }

        /**
         * The sending bank will set beneficiary_name in production. You can simulate any value
         * here.
         */
        fun beneficiaryName(beneficiaryName: String) = apply {
            this.beneficiaryName = beneficiaryName
        }

        /**
         * The sending bank will set beneficiary_reference in production. You can simulate any value
         * here.
         */
        fun beneficiaryReference(beneficiaryReference: String) = apply {
            this.beneficiaryReference = beneficiaryReference
        }

        /**
         * The sending bank will set originator_address_line1 in production. You can simulate any
         * value here.
         */
        fun originatorAddressLine1(originatorAddressLine1: String) = apply {
            this.originatorAddressLine1 = originatorAddressLine1
        }

        /**
         * The sending bank will set originator_address_line2 in production. You can simulate any
         * value here.
         */
        fun originatorAddressLine2(originatorAddressLine2: String) = apply {
            this.originatorAddressLine2 = originatorAddressLine2
        }

        /**
         * The sending bank will set originator_address_line3 in production. You can simulate any
         * value here.
         */
        fun originatorAddressLine3(originatorAddressLine3: String) = apply {
            this.originatorAddressLine3 = originatorAddressLine3
        }

        /**
         * The sending bank will set originator_name in production. You can simulate any value here.
         */
        fun originatorName(originatorName: String) = apply { this.originatorName = originatorName }

        /**
         * The sending bank will set originator_routing_number in production. You can simulate any
         * value here.
         */
        fun originatorRoutingNumber(originatorRoutingNumber: String) = apply {
            this.originatorRoutingNumber = originatorRoutingNumber
        }

        /**
         * The sending bank will set originator_to_beneficiary_information_line1 in production. You
         * can simulate any value here.
         */
        fun originatorToBeneficiaryInformationLine1(
            originatorToBeneficiaryInformationLine1: String
        ) = apply {
            this.originatorToBeneficiaryInformationLine1 = originatorToBeneficiaryInformationLine1
        }

        /**
         * The sending bank will set originator_to_beneficiary_information_line2 in production. You
         * can simulate any value here.
         */
        fun originatorToBeneficiaryInformationLine2(
            originatorToBeneficiaryInformationLine2: String
        ) = apply {
            this.originatorToBeneficiaryInformationLine2 = originatorToBeneficiaryInformationLine2
        }

        /**
         * The sending bank will set originator_to_beneficiary_information_line3 in production. You
         * can simulate any value here.
         */
        fun originatorToBeneficiaryInformationLine3(
            originatorToBeneficiaryInformationLine3: String
        ) = apply {
            this.originatorToBeneficiaryInformationLine3 = originatorToBeneficiaryInformationLine3
        }

        /**
         * The sending bank will set originator_to_beneficiary_information_line4 in production. You
         * can simulate any value here.
         */
        fun originatorToBeneficiaryInformationLine4(
            originatorToBeneficiaryInformationLine4: String
        ) = apply {
            this.originatorToBeneficiaryInformationLine4 = originatorToBeneficiaryInformationLine4
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

        fun build(): SimulationWireTransferCreateInboundParams =
            SimulationWireTransferCreateInboundParams(
                checkNotNull(accountNumberId) { "`accountNumberId` is required but was not set" },
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
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }
}
