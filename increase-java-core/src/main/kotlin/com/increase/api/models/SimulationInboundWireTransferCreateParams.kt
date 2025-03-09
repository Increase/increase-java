// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
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
import java.util.Objects
import java.util.Optional

/** Simulates an [Inbound Wire Transfer](#inbound-wire-transfers) to your account. */
class SimulationInboundWireTransferCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

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

    /** The identifier of the Account Number the inbound Wire Transfer is for. */
    fun _accountNumberId(): JsonField<String> = body._accountNumberId()

    /** The transfer amount in cents. Must be positive. */
    fun _amount(): JsonField<Long> = body._amount()

    /**
     * The sending bank will set beneficiary_address_line1 in production. You can simulate any value
     * here.
     */
    fun _beneficiaryAddressLine1(): JsonField<String> = body._beneficiaryAddressLine1()

    /**
     * The sending bank will set beneficiary_address_line2 in production. You can simulate any value
     * here.
     */
    fun _beneficiaryAddressLine2(): JsonField<String> = body._beneficiaryAddressLine2()

    /**
     * The sending bank will set beneficiary_address_line3 in production. You can simulate any value
     * here.
     */
    fun _beneficiaryAddressLine3(): JsonField<String> = body._beneficiaryAddressLine3()

    /**
     * The sending bank will set beneficiary_name in production. You can simulate any value here.
     */
    fun _beneficiaryName(): JsonField<String> = body._beneficiaryName()

    /**
     * The sending bank will set beneficiary_reference in production. You can simulate any value
     * here.
     */
    fun _beneficiaryReference(): JsonField<String> = body._beneficiaryReference()

    /**
     * The sending bank will set originator_address_line1 in production. You can simulate any value
     * here.
     */
    fun _originatorAddressLine1(): JsonField<String> = body._originatorAddressLine1()

    /**
     * The sending bank will set originator_address_line2 in production. You can simulate any value
     * here.
     */
    fun _originatorAddressLine2(): JsonField<String> = body._originatorAddressLine2()

    /**
     * The sending bank will set originator_address_line3 in production. You can simulate any value
     * here.
     */
    fun _originatorAddressLine3(): JsonField<String> = body._originatorAddressLine3()

    /** The sending bank will set originator_name in production. You can simulate any value here. */
    fun _originatorName(): JsonField<String> = body._originatorName()

    /**
     * The sending bank will set originator_routing_number in production. You can simulate any value
     * here.
     */
    fun _originatorRoutingNumber(): JsonField<String> = body._originatorRoutingNumber()

    /**
     * The sending bank will set originator_to_beneficiary_information_line1 in production. You can
     * simulate any value here.
     */
    fun _originatorToBeneficiaryInformationLine1(): JsonField<String> =
        body._originatorToBeneficiaryInformationLine1()

    /**
     * The sending bank will set originator_to_beneficiary_information_line2 in production. You can
     * simulate any value here.
     */
    fun _originatorToBeneficiaryInformationLine2(): JsonField<String> =
        body._originatorToBeneficiaryInformationLine2()

    /**
     * The sending bank will set originator_to_beneficiary_information_line3 in production. You can
     * simulate any value here.
     */
    fun _originatorToBeneficiaryInformationLine3(): JsonField<String> =
        body._originatorToBeneficiaryInformationLine3()

    /**
     * The sending bank will set originator_to_beneficiary_information_line4 in production. You can
     * simulate any value here.
     */
    fun _originatorToBeneficiaryInformationLine4(): JsonField<String> =
        body._originatorToBeneficiaryInformationLine4()

    /**
     * The sending bank will set sender_reference in production. You can simulate any value here.
     */
    fun _senderReference(): JsonField<String> = body._senderReference()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class Body
    @JsonCreator
    private constructor(
        @JsonProperty("account_number_id")
        @ExcludeMissing
        private val accountNumberId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("amount")
        @ExcludeMissing
        private val amount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("beneficiary_address_line1")
        @ExcludeMissing
        private val beneficiaryAddressLine1: JsonField<String> = JsonMissing.of(),
        @JsonProperty("beneficiary_address_line2")
        @ExcludeMissing
        private val beneficiaryAddressLine2: JsonField<String> = JsonMissing.of(),
        @JsonProperty("beneficiary_address_line3")
        @ExcludeMissing
        private val beneficiaryAddressLine3: JsonField<String> = JsonMissing.of(),
        @JsonProperty("beneficiary_name")
        @ExcludeMissing
        private val beneficiaryName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("beneficiary_reference")
        @ExcludeMissing
        private val beneficiaryReference: JsonField<String> = JsonMissing.of(),
        @JsonProperty("originator_address_line1")
        @ExcludeMissing
        private val originatorAddressLine1: JsonField<String> = JsonMissing.of(),
        @JsonProperty("originator_address_line2")
        @ExcludeMissing
        private val originatorAddressLine2: JsonField<String> = JsonMissing.of(),
        @JsonProperty("originator_address_line3")
        @ExcludeMissing
        private val originatorAddressLine3: JsonField<String> = JsonMissing.of(),
        @JsonProperty("originator_name")
        @ExcludeMissing
        private val originatorName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("originator_routing_number")
        @ExcludeMissing
        private val originatorRoutingNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("originator_to_beneficiary_information_line1")
        @ExcludeMissing
        private val originatorToBeneficiaryInformationLine1: JsonField<String> = JsonMissing.of(),
        @JsonProperty("originator_to_beneficiary_information_line2")
        @ExcludeMissing
        private val originatorToBeneficiaryInformationLine2: JsonField<String> = JsonMissing.of(),
        @JsonProperty("originator_to_beneficiary_information_line3")
        @ExcludeMissing
        private val originatorToBeneficiaryInformationLine3: JsonField<String> = JsonMissing.of(),
        @JsonProperty("originator_to_beneficiary_information_line4")
        @ExcludeMissing
        private val originatorToBeneficiaryInformationLine4: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sender_reference")
        @ExcludeMissing
        private val senderReference: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The identifier of the Account Number the inbound Wire Transfer is for. */
        fun accountNumberId(): String = accountNumberId.getRequired("account_number_id")

        /** The transfer amount in cents. Must be positive. */
        fun amount(): Long = amount.getRequired("amount")

        /**
         * The sending bank will set beneficiary_address_line1 in production. You can simulate any
         * value here.
         */
        fun beneficiaryAddressLine1(): Optional<String> =
            Optional.ofNullable(beneficiaryAddressLine1.getNullable("beneficiary_address_line1"))

        /**
         * The sending bank will set beneficiary_address_line2 in production. You can simulate any
         * value here.
         */
        fun beneficiaryAddressLine2(): Optional<String> =
            Optional.ofNullable(beneficiaryAddressLine2.getNullable("beneficiary_address_line2"))

        /**
         * The sending bank will set beneficiary_address_line3 in production. You can simulate any
         * value here.
         */
        fun beneficiaryAddressLine3(): Optional<String> =
            Optional.ofNullable(beneficiaryAddressLine3.getNullable("beneficiary_address_line3"))

        /**
         * The sending bank will set beneficiary_name in production. You can simulate any value
         * here.
         */
        fun beneficiaryName(): Optional<String> =
            Optional.ofNullable(beneficiaryName.getNullable("beneficiary_name"))

        /**
         * The sending bank will set beneficiary_reference in production. You can simulate any value
         * here.
         */
        fun beneficiaryReference(): Optional<String> =
            Optional.ofNullable(beneficiaryReference.getNullable("beneficiary_reference"))

        /**
         * The sending bank will set originator_address_line1 in production. You can simulate any
         * value here.
         */
        fun originatorAddressLine1(): Optional<String> =
            Optional.ofNullable(originatorAddressLine1.getNullable("originator_address_line1"))

        /**
         * The sending bank will set originator_address_line2 in production. You can simulate any
         * value here.
         */
        fun originatorAddressLine2(): Optional<String> =
            Optional.ofNullable(originatorAddressLine2.getNullable("originator_address_line2"))

        /**
         * The sending bank will set originator_address_line3 in production. You can simulate any
         * value here.
         */
        fun originatorAddressLine3(): Optional<String> =
            Optional.ofNullable(originatorAddressLine3.getNullable("originator_address_line3"))

        /**
         * The sending bank will set originator_name in production. You can simulate any value here.
         */
        fun originatorName(): Optional<String> =
            Optional.ofNullable(originatorName.getNullable("originator_name"))

        /**
         * The sending bank will set originator_routing_number in production. You can simulate any
         * value here.
         */
        fun originatorRoutingNumber(): Optional<String> =
            Optional.ofNullable(originatorRoutingNumber.getNullable("originator_routing_number"))

        /**
         * The sending bank will set originator_to_beneficiary_information_line1 in production. You
         * can simulate any value here.
         */
        fun originatorToBeneficiaryInformationLine1(): Optional<String> =
            Optional.ofNullable(
                originatorToBeneficiaryInformationLine1.getNullable(
                    "originator_to_beneficiary_information_line1"
                )
            )

        /**
         * The sending bank will set originator_to_beneficiary_information_line2 in production. You
         * can simulate any value here.
         */
        fun originatorToBeneficiaryInformationLine2(): Optional<String> =
            Optional.ofNullable(
                originatorToBeneficiaryInformationLine2.getNullable(
                    "originator_to_beneficiary_information_line2"
                )
            )

        /**
         * The sending bank will set originator_to_beneficiary_information_line3 in production. You
         * can simulate any value here.
         */
        fun originatorToBeneficiaryInformationLine3(): Optional<String> =
            Optional.ofNullable(
                originatorToBeneficiaryInformationLine3.getNullable(
                    "originator_to_beneficiary_information_line3"
                )
            )

        /**
         * The sending bank will set originator_to_beneficiary_information_line4 in production. You
         * can simulate any value here.
         */
        fun originatorToBeneficiaryInformationLine4(): Optional<String> =
            Optional.ofNullable(
                originatorToBeneficiaryInformationLine4.getNullable(
                    "originator_to_beneficiary_information_line4"
                )
            )

        /**
         * The sending bank will set sender_reference in production. You can simulate any value
         * here.
         */
        fun senderReference(): Optional<String> =
            Optional.ofNullable(senderReference.getNullable("sender_reference"))

        /** The identifier of the Account Number the inbound Wire Transfer is for. */
        @JsonProperty("account_number_id")
        @ExcludeMissing
        fun _accountNumberId(): JsonField<String> = accountNumberId

        /** The transfer amount in cents. Must be positive. */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

        /**
         * The sending bank will set beneficiary_address_line1 in production. You can simulate any
         * value here.
         */
        @JsonProperty("beneficiary_address_line1")
        @ExcludeMissing
        fun _beneficiaryAddressLine1(): JsonField<String> = beneficiaryAddressLine1

        /**
         * The sending bank will set beneficiary_address_line2 in production. You can simulate any
         * value here.
         */
        @JsonProperty("beneficiary_address_line2")
        @ExcludeMissing
        fun _beneficiaryAddressLine2(): JsonField<String> = beneficiaryAddressLine2

        /**
         * The sending bank will set beneficiary_address_line3 in production. You can simulate any
         * value here.
         */
        @JsonProperty("beneficiary_address_line3")
        @ExcludeMissing
        fun _beneficiaryAddressLine3(): JsonField<String> = beneficiaryAddressLine3

        /**
         * The sending bank will set beneficiary_name in production. You can simulate any value
         * here.
         */
        @JsonProperty("beneficiary_name")
        @ExcludeMissing
        fun _beneficiaryName(): JsonField<String> = beneficiaryName

        /**
         * The sending bank will set beneficiary_reference in production. You can simulate any value
         * here.
         */
        @JsonProperty("beneficiary_reference")
        @ExcludeMissing
        fun _beneficiaryReference(): JsonField<String> = beneficiaryReference

        /**
         * The sending bank will set originator_address_line1 in production. You can simulate any
         * value here.
         */
        @JsonProperty("originator_address_line1")
        @ExcludeMissing
        fun _originatorAddressLine1(): JsonField<String> = originatorAddressLine1

        /**
         * The sending bank will set originator_address_line2 in production. You can simulate any
         * value here.
         */
        @JsonProperty("originator_address_line2")
        @ExcludeMissing
        fun _originatorAddressLine2(): JsonField<String> = originatorAddressLine2

        /**
         * The sending bank will set originator_address_line3 in production. You can simulate any
         * value here.
         */
        @JsonProperty("originator_address_line3")
        @ExcludeMissing
        fun _originatorAddressLine3(): JsonField<String> = originatorAddressLine3

        /**
         * The sending bank will set originator_name in production. You can simulate any value here.
         */
        @JsonProperty("originator_name")
        @ExcludeMissing
        fun _originatorName(): JsonField<String> = originatorName

        /**
         * The sending bank will set originator_routing_number in production. You can simulate any
         * value here.
         */
        @JsonProperty("originator_routing_number")
        @ExcludeMissing
        fun _originatorRoutingNumber(): JsonField<String> = originatorRoutingNumber

        /**
         * The sending bank will set originator_to_beneficiary_information_line1 in production. You
         * can simulate any value here.
         */
        @JsonProperty("originator_to_beneficiary_information_line1")
        @ExcludeMissing
        fun _originatorToBeneficiaryInformationLine1(): JsonField<String> =
            originatorToBeneficiaryInformationLine1

        /**
         * The sending bank will set originator_to_beneficiary_information_line2 in production. You
         * can simulate any value here.
         */
        @JsonProperty("originator_to_beneficiary_information_line2")
        @ExcludeMissing
        fun _originatorToBeneficiaryInformationLine2(): JsonField<String> =
            originatorToBeneficiaryInformationLine2

        /**
         * The sending bank will set originator_to_beneficiary_information_line3 in production. You
         * can simulate any value here.
         */
        @JsonProperty("originator_to_beneficiary_information_line3")
        @ExcludeMissing
        fun _originatorToBeneficiaryInformationLine3(): JsonField<String> =
            originatorToBeneficiaryInformationLine3

        /**
         * The sending bank will set originator_to_beneficiary_information_line4 in production. You
         * can simulate any value here.
         */
        @JsonProperty("originator_to_beneficiary_information_line4")
        @ExcludeMissing
        fun _originatorToBeneficiaryInformationLine4(): JsonField<String> =
            originatorToBeneficiaryInformationLine4

        /**
         * The sending bank will set sender_reference in production. You can simulate any value
         * here.
         */
        @JsonProperty("sender_reference")
        @ExcludeMissing
        fun _senderReference(): JsonField<String> = senderReference

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            accountNumberId()
            amount()
            beneficiaryAddressLine1()
            beneficiaryAddressLine2()
            beneficiaryAddressLine3()
            beneficiaryName()
            beneficiaryReference()
            originatorAddressLine1()
            originatorAddressLine2()
            originatorAddressLine3()
            originatorName()
            originatorRoutingNumber()
            originatorToBeneficiaryInformationLine1()
            originatorToBeneficiaryInformationLine2()
            originatorToBeneficiaryInformationLine3()
            originatorToBeneficiaryInformationLine4()
            senderReference()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .accountNumberId()
             * .amount()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var accountNumberId: JsonField<String>? = null
            private var amount: JsonField<Long>? = null
            private var beneficiaryAddressLine1: JsonField<String> = JsonMissing.of()
            private var beneficiaryAddressLine2: JsonField<String> = JsonMissing.of()
            private var beneficiaryAddressLine3: JsonField<String> = JsonMissing.of()
            private var beneficiaryName: JsonField<String> = JsonMissing.of()
            private var beneficiaryReference: JsonField<String> = JsonMissing.of()
            private var originatorAddressLine1: JsonField<String> = JsonMissing.of()
            private var originatorAddressLine2: JsonField<String> = JsonMissing.of()
            private var originatorAddressLine3: JsonField<String> = JsonMissing.of()
            private var originatorName: JsonField<String> = JsonMissing.of()
            private var originatorRoutingNumber: JsonField<String> = JsonMissing.of()
            private var originatorToBeneficiaryInformationLine1: JsonField<String> =
                JsonMissing.of()
            private var originatorToBeneficiaryInformationLine2: JsonField<String> =
                JsonMissing.of()
            private var originatorToBeneficiaryInformationLine3: JsonField<String> =
                JsonMissing.of()
            private var originatorToBeneficiaryInformationLine4: JsonField<String> =
                JsonMissing.of()
            private var senderReference: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                accountNumberId = body.accountNumberId
                amount = body.amount
                beneficiaryAddressLine1 = body.beneficiaryAddressLine1
                beneficiaryAddressLine2 = body.beneficiaryAddressLine2
                beneficiaryAddressLine3 = body.beneficiaryAddressLine3
                beneficiaryName = body.beneficiaryName
                beneficiaryReference = body.beneficiaryReference
                originatorAddressLine1 = body.originatorAddressLine1
                originatorAddressLine2 = body.originatorAddressLine2
                originatorAddressLine3 = body.originatorAddressLine3
                originatorName = body.originatorName
                originatorRoutingNumber = body.originatorRoutingNumber
                originatorToBeneficiaryInformationLine1 =
                    body.originatorToBeneficiaryInformationLine1
                originatorToBeneficiaryInformationLine2 =
                    body.originatorToBeneficiaryInformationLine2
                originatorToBeneficiaryInformationLine3 =
                    body.originatorToBeneficiaryInformationLine3
                originatorToBeneficiaryInformationLine4 =
                    body.originatorToBeneficiaryInformationLine4
                senderReference = body.senderReference
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The identifier of the Account Number the inbound Wire Transfer is for. */
            fun accountNumberId(accountNumberId: String) =
                accountNumberId(JsonField.of(accountNumberId))

            /** The identifier of the Account Number the inbound Wire Transfer is for. */
            fun accountNumberId(accountNumberId: JsonField<String>) = apply {
                this.accountNumberId = accountNumberId
            }

            /** The transfer amount in cents. Must be positive. */
            fun amount(amount: Long) = amount(JsonField.of(amount))

            /** The transfer amount in cents. Must be positive. */
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            /**
             * The sending bank will set beneficiary_address_line1 in production. You can simulate
             * any value here.
             */
            fun beneficiaryAddressLine1(beneficiaryAddressLine1: String) =
                beneficiaryAddressLine1(JsonField.of(beneficiaryAddressLine1))

            /**
             * The sending bank will set beneficiary_address_line1 in production. You can simulate
             * any value here.
             */
            fun beneficiaryAddressLine1(beneficiaryAddressLine1: JsonField<String>) = apply {
                this.beneficiaryAddressLine1 = beneficiaryAddressLine1
            }

            /**
             * The sending bank will set beneficiary_address_line2 in production. You can simulate
             * any value here.
             */
            fun beneficiaryAddressLine2(beneficiaryAddressLine2: String) =
                beneficiaryAddressLine2(JsonField.of(beneficiaryAddressLine2))

            /**
             * The sending bank will set beneficiary_address_line2 in production. You can simulate
             * any value here.
             */
            fun beneficiaryAddressLine2(beneficiaryAddressLine2: JsonField<String>) = apply {
                this.beneficiaryAddressLine2 = beneficiaryAddressLine2
            }

            /**
             * The sending bank will set beneficiary_address_line3 in production. You can simulate
             * any value here.
             */
            fun beneficiaryAddressLine3(beneficiaryAddressLine3: String) =
                beneficiaryAddressLine3(JsonField.of(beneficiaryAddressLine3))

            /**
             * The sending bank will set beneficiary_address_line3 in production. You can simulate
             * any value here.
             */
            fun beneficiaryAddressLine3(beneficiaryAddressLine3: JsonField<String>) = apply {
                this.beneficiaryAddressLine3 = beneficiaryAddressLine3
            }

            /**
             * The sending bank will set beneficiary_name in production. You can simulate any value
             * here.
             */
            fun beneficiaryName(beneficiaryName: String) =
                beneficiaryName(JsonField.of(beneficiaryName))

            /**
             * The sending bank will set beneficiary_name in production. You can simulate any value
             * here.
             */
            fun beneficiaryName(beneficiaryName: JsonField<String>) = apply {
                this.beneficiaryName = beneficiaryName
            }

            /**
             * The sending bank will set beneficiary_reference in production. You can simulate any
             * value here.
             */
            fun beneficiaryReference(beneficiaryReference: String) =
                beneficiaryReference(JsonField.of(beneficiaryReference))

            /**
             * The sending bank will set beneficiary_reference in production. You can simulate any
             * value here.
             */
            fun beneficiaryReference(beneficiaryReference: JsonField<String>) = apply {
                this.beneficiaryReference = beneficiaryReference
            }

            /**
             * The sending bank will set originator_address_line1 in production. You can simulate
             * any value here.
             */
            fun originatorAddressLine1(originatorAddressLine1: String) =
                originatorAddressLine1(JsonField.of(originatorAddressLine1))

            /**
             * The sending bank will set originator_address_line1 in production. You can simulate
             * any value here.
             */
            fun originatorAddressLine1(originatorAddressLine1: JsonField<String>) = apply {
                this.originatorAddressLine1 = originatorAddressLine1
            }

            /**
             * The sending bank will set originator_address_line2 in production. You can simulate
             * any value here.
             */
            fun originatorAddressLine2(originatorAddressLine2: String) =
                originatorAddressLine2(JsonField.of(originatorAddressLine2))

            /**
             * The sending bank will set originator_address_line2 in production. You can simulate
             * any value here.
             */
            fun originatorAddressLine2(originatorAddressLine2: JsonField<String>) = apply {
                this.originatorAddressLine2 = originatorAddressLine2
            }

            /**
             * The sending bank will set originator_address_line3 in production. You can simulate
             * any value here.
             */
            fun originatorAddressLine3(originatorAddressLine3: String) =
                originatorAddressLine3(JsonField.of(originatorAddressLine3))

            /**
             * The sending bank will set originator_address_line3 in production. You can simulate
             * any value here.
             */
            fun originatorAddressLine3(originatorAddressLine3: JsonField<String>) = apply {
                this.originatorAddressLine3 = originatorAddressLine3
            }

            /**
             * The sending bank will set originator_name in production. You can simulate any value
             * here.
             */
            fun originatorName(originatorName: String) =
                originatorName(JsonField.of(originatorName))

            /**
             * The sending bank will set originator_name in production. You can simulate any value
             * here.
             */
            fun originatorName(originatorName: JsonField<String>) = apply {
                this.originatorName = originatorName
            }

            /**
             * The sending bank will set originator_routing_number in production. You can simulate
             * any value here.
             */
            fun originatorRoutingNumber(originatorRoutingNumber: String) =
                originatorRoutingNumber(JsonField.of(originatorRoutingNumber))

            /**
             * The sending bank will set originator_routing_number in production. You can simulate
             * any value here.
             */
            fun originatorRoutingNumber(originatorRoutingNumber: JsonField<String>) = apply {
                this.originatorRoutingNumber = originatorRoutingNumber
            }

            /**
             * The sending bank will set originator_to_beneficiary_information_line1 in production.
             * You can simulate any value here.
             */
            fun originatorToBeneficiaryInformationLine1(
                originatorToBeneficiaryInformationLine1: String
            ) =
                originatorToBeneficiaryInformationLine1(
                    JsonField.of(originatorToBeneficiaryInformationLine1)
                )

            /**
             * The sending bank will set originator_to_beneficiary_information_line1 in production.
             * You can simulate any value here.
             */
            fun originatorToBeneficiaryInformationLine1(
                originatorToBeneficiaryInformationLine1: JsonField<String>
            ) = apply {
                this.originatorToBeneficiaryInformationLine1 =
                    originatorToBeneficiaryInformationLine1
            }

            /**
             * The sending bank will set originator_to_beneficiary_information_line2 in production.
             * You can simulate any value here.
             */
            fun originatorToBeneficiaryInformationLine2(
                originatorToBeneficiaryInformationLine2: String
            ) =
                originatorToBeneficiaryInformationLine2(
                    JsonField.of(originatorToBeneficiaryInformationLine2)
                )

            /**
             * The sending bank will set originator_to_beneficiary_information_line2 in production.
             * You can simulate any value here.
             */
            fun originatorToBeneficiaryInformationLine2(
                originatorToBeneficiaryInformationLine2: JsonField<String>
            ) = apply {
                this.originatorToBeneficiaryInformationLine2 =
                    originatorToBeneficiaryInformationLine2
            }

            /**
             * The sending bank will set originator_to_beneficiary_information_line3 in production.
             * You can simulate any value here.
             */
            fun originatorToBeneficiaryInformationLine3(
                originatorToBeneficiaryInformationLine3: String
            ) =
                originatorToBeneficiaryInformationLine3(
                    JsonField.of(originatorToBeneficiaryInformationLine3)
                )

            /**
             * The sending bank will set originator_to_beneficiary_information_line3 in production.
             * You can simulate any value here.
             */
            fun originatorToBeneficiaryInformationLine3(
                originatorToBeneficiaryInformationLine3: JsonField<String>
            ) = apply {
                this.originatorToBeneficiaryInformationLine3 =
                    originatorToBeneficiaryInformationLine3
            }

            /**
             * The sending bank will set originator_to_beneficiary_information_line4 in production.
             * You can simulate any value here.
             */
            fun originatorToBeneficiaryInformationLine4(
                originatorToBeneficiaryInformationLine4: String
            ) =
                originatorToBeneficiaryInformationLine4(
                    JsonField.of(originatorToBeneficiaryInformationLine4)
                )

            /**
             * The sending bank will set originator_to_beneficiary_information_line4 in production.
             * You can simulate any value here.
             */
            fun originatorToBeneficiaryInformationLine4(
                originatorToBeneficiaryInformationLine4: JsonField<String>
            ) = apply {
                this.originatorToBeneficiaryInformationLine4 =
                    originatorToBeneficiaryInformationLine4
            }

            /**
             * The sending bank will set sender_reference in production. You can simulate any value
             * here.
             */
            fun senderReference(senderReference: String) =
                senderReference(JsonField.of(senderReference))

            /**
             * The sending bank will set sender_reference in production. You can simulate any value
             * here.
             */
            fun senderReference(senderReference: JsonField<String>) = apply {
                this.senderReference = senderReference
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

            fun build(): Body =
                Body(
                    checkRequired("accountNumberId", accountNumberId),
                    checkRequired("amount", amount),
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

            return /* spotless:off */ other is Body && accountNumberId == other.accountNumberId && amount == other.amount && beneficiaryAddressLine1 == other.beneficiaryAddressLine1 && beneficiaryAddressLine2 == other.beneficiaryAddressLine2 && beneficiaryAddressLine3 == other.beneficiaryAddressLine3 && beneficiaryName == other.beneficiaryName && beneficiaryReference == other.beneficiaryReference && originatorAddressLine1 == other.originatorAddressLine1 && originatorAddressLine2 == other.originatorAddressLine2 && originatorAddressLine3 == other.originatorAddressLine3 && originatorName == other.originatorName && originatorRoutingNumber == other.originatorRoutingNumber && originatorToBeneficiaryInformationLine1 == other.originatorToBeneficiaryInformationLine1 && originatorToBeneficiaryInformationLine2 == other.originatorToBeneficiaryInformationLine2 && originatorToBeneficiaryInformationLine3 == other.originatorToBeneficiaryInformationLine3 && originatorToBeneficiaryInformationLine4 == other.originatorToBeneficiaryInformationLine4 && senderReference == other.senderReference && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(accountNumberId, amount, beneficiaryAddressLine1, beneficiaryAddressLine2, beneficiaryAddressLine3, beneficiaryName, beneficiaryReference, originatorAddressLine1, originatorAddressLine2, originatorAddressLine3, originatorName, originatorRoutingNumber, originatorToBeneficiaryInformationLine1, originatorToBeneficiaryInformationLine2, originatorToBeneficiaryInformationLine3, originatorToBeneficiaryInformationLine4, senderReference, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{accountNumberId=$accountNumberId, amount=$amount, beneficiaryAddressLine1=$beneficiaryAddressLine1, beneficiaryAddressLine2=$beneficiaryAddressLine2, beneficiaryAddressLine3=$beneficiaryAddressLine3, beneficiaryName=$beneficiaryName, beneficiaryReference=$beneficiaryReference, originatorAddressLine1=$originatorAddressLine1, originatorAddressLine2=$originatorAddressLine2, originatorAddressLine3=$originatorAddressLine3, originatorName=$originatorName, originatorRoutingNumber=$originatorRoutingNumber, originatorToBeneficiaryInformationLine1=$originatorToBeneficiaryInformationLine1, originatorToBeneficiaryInformationLine2=$originatorToBeneficiaryInformationLine2, originatorToBeneficiaryInformationLine3=$originatorToBeneficiaryInformationLine3, originatorToBeneficiaryInformationLine4=$originatorToBeneficiaryInformationLine4, senderReference=$senderReference, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [SimulationInboundWireTransferCreateParams].
         *
         * The following fields are required:
         * ```java
         * .accountNumberId()
         * .amount()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SimulationInboundWireTransferCreateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
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

        /** The identifier of the Account Number the inbound Wire Transfer is for. */
        fun accountNumberId(accountNumberId: JsonField<String>) = apply {
            body.accountNumberId(accountNumberId)
        }

        /** The transfer amount in cents. Must be positive. */
        fun amount(amount: Long) = apply { body.amount(amount) }

        /** The transfer amount in cents. Must be positive. */
        fun amount(amount: JsonField<Long>) = apply { body.amount(amount) }

        /**
         * The sending bank will set beneficiary_address_line1 in production. You can simulate any
         * value here.
         */
        fun beneficiaryAddressLine1(beneficiaryAddressLine1: String) = apply {
            body.beneficiaryAddressLine1(beneficiaryAddressLine1)
        }

        /**
         * The sending bank will set beneficiary_address_line1 in production. You can simulate any
         * value here.
         */
        fun beneficiaryAddressLine1(beneficiaryAddressLine1: JsonField<String>) = apply {
            body.beneficiaryAddressLine1(beneficiaryAddressLine1)
        }

        /**
         * The sending bank will set beneficiary_address_line2 in production. You can simulate any
         * value here.
         */
        fun beneficiaryAddressLine2(beneficiaryAddressLine2: String) = apply {
            body.beneficiaryAddressLine2(beneficiaryAddressLine2)
        }

        /**
         * The sending bank will set beneficiary_address_line2 in production. You can simulate any
         * value here.
         */
        fun beneficiaryAddressLine2(beneficiaryAddressLine2: JsonField<String>) = apply {
            body.beneficiaryAddressLine2(beneficiaryAddressLine2)
        }

        /**
         * The sending bank will set beneficiary_address_line3 in production. You can simulate any
         * value here.
         */
        fun beneficiaryAddressLine3(beneficiaryAddressLine3: String) = apply {
            body.beneficiaryAddressLine3(beneficiaryAddressLine3)
        }

        /**
         * The sending bank will set beneficiary_address_line3 in production. You can simulate any
         * value here.
         */
        fun beneficiaryAddressLine3(beneficiaryAddressLine3: JsonField<String>) = apply {
            body.beneficiaryAddressLine3(beneficiaryAddressLine3)
        }

        /**
         * The sending bank will set beneficiary_name in production. You can simulate any value
         * here.
         */
        fun beneficiaryName(beneficiaryName: String) = apply {
            body.beneficiaryName(beneficiaryName)
        }

        /**
         * The sending bank will set beneficiary_name in production. You can simulate any value
         * here.
         */
        fun beneficiaryName(beneficiaryName: JsonField<String>) = apply {
            body.beneficiaryName(beneficiaryName)
        }

        /**
         * The sending bank will set beneficiary_reference in production. You can simulate any value
         * here.
         */
        fun beneficiaryReference(beneficiaryReference: String) = apply {
            body.beneficiaryReference(beneficiaryReference)
        }

        /**
         * The sending bank will set beneficiary_reference in production. You can simulate any value
         * here.
         */
        fun beneficiaryReference(beneficiaryReference: JsonField<String>) = apply {
            body.beneficiaryReference(beneficiaryReference)
        }

        /**
         * The sending bank will set originator_address_line1 in production. You can simulate any
         * value here.
         */
        fun originatorAddressLine1(originatorAddressLine1: String) = apply {
            body.originatorAddressLine1(originatorAddressLine1)
        }

        /**
         * The sending bank will set originator_address_line1 in production. You can simulate any
         * value here.
         */
        fun originatorAddressLine1(originatorAddressLine1: JsonField<String>) = apply {
            body.originatorAddressLine1(originatorAddressLine1)
        }

        /**
         * The sending bank will set originator_address_line2 in production. You can simulate any
         * value here.
         */
        fun originatorAddressLine2(originatorAddressLine2: String) = apply {
            body.originatorAddressLine2(originatorAddressLine2)
        }

        /**
         * The sending bank will set originator_address_line2 in production. You can simulate any
         * value here.
         */
        fun originatorAddressLine2(originatorAddressLine2: JsonField<String>) = apply {
            body.originatorAddressLine2(originatorAddressLine2)
        }

        /**
         * The sending bank will set originator_address_line3 in production. You can simulate any
         * value here.
         */
        fun originatorAddressLine3(originatorAddressLine3: String) = apply {
            body.originatorAddressLine3(originatorAddressLine3)
        }

        /**
         * The sending bank will set originator_address_line3 in production. You can simulate any
         * value here.
         */
        fun originatorAddressLine3(originatorAddressLine3: JsonField<String>) = apply {
            body.originatorAddressLine3(originatorAddressLine3)
        }

        /**
         * The sending bank will set originator_name in production. You can simulate any value here.
         */
        fun originatorName(originatorName: String) = apply { body.originatorName(originatorName) }

        /**
         * The sending bank will set originator_name in production. You can simulate any value here.
         */
        fun originatorName(originatorName: JsonField<String>) = apply {
            body.originatorName(originatorName)
        }

        /**
         * The sending bank will set originator_routing_number in production. You can simulate any
         * value here.
         */
        fun originatorRoutingNumber(originatorRoutingNumber: String) = apply {
            body.originatorRoutingNumber(originatorRoutingNumber)
        }

        /**
         * The sending bank will set originator_routing_number in production. You can simulate any
         * value here.
         */
        fun originatorRoutingNumber(originatorRoutingNumber: JsonField<String>) = apply {
            body.originatorRoutingNumber(originatorRoutingNumber)
        }

        /**
         * The sending bank will set originator_to_beneficiary_information_line1 in production. You
         * can simulate any value here.
         */
        fun originatorToBeneficiaryInformationLine1(
            originatorToBeneficiaryInformationLine1: String
        ) = apply {
            body.originatorToBeneficiaryInformationLine1(originatorToBeneficiaryInformationLine1)
        }

        /**
         * The sending bank will set originator_to_beneficiary_information_line1 in production. You
         * can simulate any value here.
         */
        fun originatorToBeneficiaryInformationLine1(
            originatorToBeneficiaryInformationLine1: JsonField<String>
        ) = apply {
            body.originatorToBeneficiaryInformationLine1(originatorToBeneficiaryInformationLine1)
        }

        /**
         * The sending bank will set originator_to_beneficiary_information_line2 in production. You
         * can simulate any value here.
         */
        fun originatorToBeneficiaryInformationLine2(
            originatorToBeneficiaryInformationLine2: String
        ) = apply {
            body.originatorToBeneficiaryInformationLine2(originatorToBeneficiaryInformationLine2)
        }

        /**
         * The sending bank will set originator_to_beneficiary_information_line2 in production. You
         * can simulate any value here.
         */
        fun originatorToBeneficiaryInformationLine2(
            originatorToBeneficiaryInformationLine2: JsonField<String>
        ) = apply {
            body.originatorToBeneficiaryInformationLine2(originatorToBeneficiaryInformationLine2)
        }

        /**
         * The sending bank will set originator_to_beneficiary_information_line3 in production. You
         * can simulate any value here.
         */
        fun originatorToBeneficiaryInformationLine3(
            originatorToBeneficiaryInformationLine3: String
        ) = apply {
            body.originatorToBeneficiaryInformationLine3(originatorToBeneficiaryInformationLine3)
        }

        /**
         * The sending bank will set originator_to_beneficiary_information_line3 in production. You
         * can simulate any value here.
         */
        fun originatorToBeneficiaryInformationLine3(
            originatorToBeneficiaryInformationLine3: JsonField<String>
        ) = apply {
            body.originatorToBeneficiaryInformationLine3(originatorToBeneficiaryInformationLine3)
        }

        /**
         * The sending bank will set originator_to_beneficiary_information_line4 in production. You
         * can simulate any value here.
         */
        fun originatorToBeneficiaryInformationLine4(
            originatorToBeneficiaryInformationLine4: String
        ) = apply {
            body.originatorToBeneficiaryInformationLine4(originatorToBeneficiaryInformationLine4)
        }

        /**
         * The sending bank will set originator_to_beneficiary_information_line4 in production. You
         * can simulate any value here.
         */
        fun originatorToBeneficiaryInformationLine4(
            originatorToBeneficiaryInformationLine4: JsonField<String>
        ) = apply {
            body.originatorToBeneficiaryInformationLine4(originatorToBeneficiaryInformationLine4)
        }

        /**
         * The sending bank will set sender_reference in production. You can simulate any value
         * here.
         */
        fun senderReference(senderReference: String) = apply {
            body.senderReference(senderReference)
        }

        /**
         * The sending bank will set sender_reference in production. You can simulate any value
         * here.
         */
        fun senderReference(senderReference: JsonField<String>) = apply {
            body.senderReference(senderReference)
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
