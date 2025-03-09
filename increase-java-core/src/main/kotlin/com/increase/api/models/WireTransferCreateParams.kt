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

/** Create a Wire Transfer */
class WireTransferCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** The identifier for the account that will send the transfer. */
    fun accountId(): String = body.accountId()

    /** The transfer amount in USD cents. */
    fun amount(): Long = body.amount()

    /** The beneficiary's name. */
    fun beneficiaryName(): String = body.beneficiaryName()

    /** The message that will show on the recipient's bank statement. */
    fun messageToRecipient(): String = body.messageToRecipient()

    /** The account number for the destination account. */
    fun accountNumber(): Optional<String> = body.accountNumber()

    /** The beneficiary's address line 1. */
    fun beneficiaryAddressLine1(): Optional<String> = body.beneficiaryAddressLine1()

    /** The beneficiary's address line 2. */
    fun beneficiaryAddressLine2(): Optional<String> = body.beneficiaryAddressLine2()

    /** The beneficiary's address line 3. */
    fun beneficiaryAddressLine3(): Optional<String> = body.beneficiaryAddressLine3()

    /**
     * The ID of an External Account to initiate a transfer to. If this parameter is provided,
     * `account_number` and `routing_number` must be absent.
     */
    fun externalAccountId(): Optional<String> = body.externalAccountId()

    /**
     * The originator's address line 1. This is only necessary if you're transferring from a
     * commingled account. Otherwise, we'll use the associated entity's details.
     */
    fun originatorAddressLine1(): Optional<String> = body.originatorAddressLine1()

    /**
     * The originator's address line 2. This is only necessary if you're transferring from a
     * commingled account. Otherwise, we'll use the associated entity's details.
     */
    fun originatorAddressLine2(): Optional<String> = body.originatorAddressLine2()

    /**
     * The originator's address line 3. This is only necessary if you're transferring from a
     * commingled account. Otherwise, we'll use the associated entity's details.
     */
    fun originatorAddressLine3(): Optional<String> = body.originatorAddressLine3()

    /**
     * The originator's name. This is only necessary if you're transferring from a commingled
     * account. Otherwise, we'll use the associated entity's details.
     */
    fun originatorName(): Optional<String> = body.originatorName()

    /** Whether the transfer requires explicit approval via the dashboard or API. */
    fun requireApproval(): Optional<Boolean> = body.requireApproval()

    /**
     * The American Bankers' Association (ABA) Routing Transit Number (RTN) for the destination
     * account.
     */
    fun routingNumber(): Optional<String> = body.routingNumber()

    /** The ID of an Account Number that will be passed to the wire's recipient */
    fun sourceAccountNumberId(): Optional<String> = body.sourceAccountNumberId()

    /** The identifier for the account that will send the transfer. */
    fun _accountId(): JsonField<String> = body._accountId()

    /** The transfer amount in USD cents. */
    fun _amount(): JsonField<Long> = body._amount()

    /** The beneficiary's name. */
    fun _beneficiaryName(): JsonField<String> = body._beneficiaryName()

    /** The message that will show on the recipient's bank statement. */
    fun _messageToRecipient(): JsonField<String> = body._messageToRecipient()

    /** The account number for the destination account. */
    fun _accountNumber(): JsonField<String> = body._accountNumber()

    /** The beneficiary's address line 1. */
    fun _beneficiaryAddressLine1(): JsonField<String> = body._beneficiaryAddressLine1()

    /** The beneficiary's address line 2. */
    fun _beneficiaryAddressLine2(): JsonField<String> = body._beneficiaryAddressLine2()

    /** The beneficiary's address line 3. */
    fun _beneficiaryAddressLine3(): JsonField<String> = body._beneficiaryAddressLine3()

    /**
     * The ID of an External Account to initiate a transfer to. If this parameter is provided,
     * `account_number` and `routing_number` must be absent.
     */
    fun _externalAccountId(): JsonField<String> = body._externalAccountId()

    /**
     * The originator's address line 1. This is only necessary if you're transferring from a
     * commingled account. Otherwise, we'll use the associated entity's details.
     */
    fun _originatorAddressLine1(): JsonField<String> = body._originatorAddressLine1()

    /**
     * The originator's address line 2. This is only necessary if you're transferring from a
     * commingled account. Otherwise, we'll use the associated entity's details.
     */
    fun _originatorAddressLine2(): JsonField<String> = body._originatorAddressLine2()

    /**
     * The originator's address line 3. This is only necessary if you're transferring from a
     * commingled account. Otherwise, we'll use the associated entity's details.
     */
    fun _originatorAddressLine3(): JsonField<String> = body._originatorAddressLine3()

    /**
     * The originator's name. This is only necessary if you're transferring from a commingled
     * account. Otherwise, we'll use the associated entity's details.
     */
    fun _originatorName(): JsonField<String> = body._originatorName()

    /** Whether the transfer requires explicit approval via the dashboard or API. */
    fun _requireApproval(): JsonField<Boolean> = body._requireApproval()

    /**
     * The American Bankers' Association (ABA) Routing Transit Number (RTN) for the destination
     * account.
     */
    fun _routingNumber(): JsonField<String> = body._routingNumber()

    /** The ID of an Account Number that will be passed to the wire's recipient */
    fun _sourceAccountNumberId(): JsonField<String> = body._sourceAccountNumberId()

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
        @JsonProperty("account_id")
        @ExcludeMissing
        private val accountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("amount")
        @ExcludeMissing
        private val amount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("beneficiary_name")
        @ExcludeMissing
        private val beneficiaryName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("message_to_recipient")
        @ExcludeMissing
        private val messageToRecipient: JsonField<String> = JsonMissing.of(),
        @JsonProperty("account_number")
        @ExcludeMissing
        private val accountNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("beneficiary_address_line1")
        @ExcludeMissing
        private val beneficiaryAddressLine1: JsonField<String> = JsonMissing.of(),
        @JsonProperty("beneficiary_address_line2")
        @ExcludeMissing
        private val beneficiaryAddressLine2: JsonField<String> = JsonMissing.of(),
        @JsonProperty("beneficiary_address_line3")
        @ExcludeMissing
        private val beneficiaryAddressLine3: JsonField<String> = JsonMissing.of(),
        @JsonProperty("external_account_id")
        @ExcludeMissing
        private val externalAccountId: JsonField<String> = JsonMissing.of(),
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
        @JsonProperty("require_approval")
        @ExcludeMissing
        private val requireApproval: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("routing_number")
        @ExcludeMissing
        private val routingNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("source_account_number_id")
        @ExcludeMissing
        private val sourceAccountNumberId: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The identifier for the account that will send the transfer. */
        fun accountId(): String = accountId.getRequired("account_id")

        /** The transfer amount in USD cents. */
        fun amount(): Long = amount.getRequired("amount")

        /** The beneficiary's name. */
        fun beneficiaryName(): String = beneficiaryName.getRequired("beneficiary_name")

        /** The message that will show on the recipient's bank statement. */
        fun messageToRecipient(): String = messageToRecipient.getRequired("message_to_recipient")

        /** The account number for the destination account. */
        fun accountNumber(): Optional<String> =
            Optional.ofNullable(accountNumber.getNullable("account_number"))

        /** The beneficiary's address line 1. */
        fun beneficiaryAddressLine1(): Optional<String> =
            Optional.ofNullable(beneficiaryAddressLine1.getNullable("beneficiary_address_line1"))

        /** The beneficiary's address line 2. */
        fun beneficiaryAddressLine2(): Optional<String> =
            Optional.ofNullable(beneficiaryAddressLine2.getNullable("beneficiary_address_line2"))

        /** The beneficiary's address line 3. */
        fun beneficiaryAddressLine3(): Optional<String> =
            Optional.ofNullable(beneficiaryAddressLine3.getNullable("beneficiary_address_line3"))

        /**
         * The ID of an External Account to initiate a transfer to. If this parameter is provided,
         * `account_number` and `routing_number` must be absent.
         */
        fun externalAccountId(): Optional<String> =
            Optional.ofNullable(externalAccountId.getNullable("external_account_id"))

        /**
         * The originator's address line 1. This is only necessary if you're transferring from a
         * commingled account. Otherwise, we'll use the associated entity's details.
         */
        fun originatorAddressLine1(): Optional<String> =
            Optional.ofNullable(originatorAddressLine1.getNullable("originator_address_line1"))

        /**
         * The originator's address line 2. This is only necessary if you're transferring from a
         * commingled account. Otherwise, we'll use the associated entity's details.
         */
        fun originatorAddressLine2(): Optional<String> =
            Optional.ofNullable(originatorAddressLine2.getNullable("originator_address_line2"))

        /**
         * The originator's address line 3. This is only necessary if you're transferring from a
         * commingled account. Otherwise, we'll use the associated entity's details.
         */
        fun originatorAddressLine3(): Optional<String> =
            Optional.ofNullable(originatorAddressLine3.getNullable("originator_address_line3"))

        /**
         * The originator's name. This is only necessary if you're transferring from a commingled
         * account. Otherwise, we'll use the associated entity's details.
         */
        fun originatorName(): Optional<String> =
            Optional.ofNullable(originatorName.getNullable("originator_name"))

        /** Whether the transfer requires explicit approval via the dashboard or API. */
        fun requireApproval(): Optional<Boolean> =
            Optional.ofNullable(requireApproval.getNullable("require_approval"))

        /**
         * The American Bankers' Association (ABA) Routing Transit Number (RTN) for the destination
         * account.
         */
        fun routingNumber(): Optional<String> =
            Optional.ofNullable(routingNumber.getNullable("routing_number"))

        /** The ID of an Account Number that will be passed to the wire's recipient */
        fun sourceAccountNumberId(): Optional<String> =
            Optional.ofNullable(sourceAccountNumberId.getNullable("source_account_number_id"))

        /** The identifier for the account that will send the transfer. */
        @JsonProperty("account_id") @ExcludeMissing fun _accountId(): JsonField<String> = accountId

        /** The transfer amount in USD cents. */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

        /** The beneficiary's name. */
        @JsonProperty("beneficiary_name")
        @ExcludeMissing
        fun _beneficiaryName(): JsonField<String> = beneficiaryName

        /** The message that will show on the recipient's bank statement. */
        @JsonProperty("message_to_recipient")
        @ExcludeMissing
        fun _messageToRecipient(): JsonField<String> = messageToRecipient

        /** The account number for the destination account. */
        @JsonProperty("account_number")
        @ExcludeMissing
        fun _accountNumber(): JsonField<String> = accountNumber

        /** The beneficiary's address line 1. */
        @JsonProperty("beneficiary_address_line1")
        @ExcludeMissing
        fun _beneficiaryAddressLine1(): JsonField<String> = beneficiaryAddressLine1

        /** The beneficiary's address line 2. */
        @JsonProperty("beneficiary_address_line2")
        @ExcludeMissing
        fun _beneficiaryAddressLine2(): JsonField<String> = beneficiaryAddressLine2

        /** The beneficiary's address line 3. */
        @JsonProperty("beneficiary_address_line3")
        @ExcludeMissing
        fun _beneficiaryAddressLine3(): JsonField<String> = beneficiaryAddressLine3

        /**
         * The ID of an External Account to initiate a transfer to. If this parameter is provided,
         * `account_number` and `routing_number` must be absent.
         */
        @JsonProperty("external_account_id")
        @ExcludeMissing
        fun _externalAccountId(): JsonField<String> = externalAccountId

        /**
         * The originator's address line 1. This is only necessary if you're transferring from a
         * commingled account. Otherwise, we'll use the associated entity's details.
         */
        @JsonProperty("originator_address_line1")
        @ExcludeMissing
        fun _originatorAddressLine1(): JsonField<String> = originatorAddressLine1

        /**
         * The originator's address line 2. This is only necessary if you're transferring from a
         * commingled account. Otherwise, we'll use the associated entity's details.
         */
        @JsonProperty("originator_address_line2")
        @ExcludeMissing
        fun _originatorAddressLine2(): JsonField<String> = originatorAddressLine2

        /**
         * The originator's address line 3. This is only necessary if you're transferring from a
         * commingled account. Otherwise, we'll use the associated entity's details.
         */
        @JsonProperty("originator_address_line3")
        @ExcludeMissing
        fun _originatorAddressLine3(): JsonField<String> = originatorAddressLine3

        /**
         * The originator's name. This is only necessary if you're transferring from a commingled
         * account. Otherwise, we'll use the associated entity's details.
         */
        @JsonProperty("originator_name")
        @ExcludeMissing
        fun _originatorName(): JsonField<String> = originatorName

        /** Whether the transfer requires explicit approval via the dashboard or API. */
        @JsonProperty("require_approval")
        @ExcludeMissing
        fun _requireApproval(): JsonField<Boolean> = requireApproval

        /**
         * The American Bankers' Association (ABA) Routing Transit Number (RTN) for the destination
         * account.
         */
        @JsonProperty("routing_number")
        @ExcludeMissing
        fun _routingNumber(): JsonField<String> = routingNumber

        /** The ID of an Account Number that will be passed to the wire's recipient */
        @JsonProperty("source_account_number_id")
        @ExcludeMissing
        fun _sourceAccountNumberId(): JsonField<String> = sourceAccountNumberId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            accountId()
            amount()
            beneficiaryName()
            messageToRecipient()
            accountNumber()
            beneficiaryAddressLine1()
            beneficiaryAddressLine2()
            beneficiaryAddressLine3()
            externalAccountId()
            originatorAddressLine1()
            originatorAddressLine2()
            originatorAddressLine3()
            originatorName()
            requireApproval()
            routingNumber()
            sourceAccountNumberId()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .accountId()
             * .amount()
             * .beneficiaryName()
             * .messageToRecipient()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var accountId: JsonField<String>? = null
            private var amount: JsonField<Long>? = null
            private var beneficiaryName: JsonField<String>? = null
            private var messageToRecipient: JsonField<String>? = null
            private var accountNumber: JsonField<String> = JsonMissing.of()
            private var beneficiaryAddressLine1: JsonField<String> = JsonMissing.of()
            private var beneficiaryAddressLine2: JsonField<String> = JsonMissing.of()
            private var beneficiaryAddressLine3: JsonField<String> = JsonMissing.of()
            private var externalAccountId: JsonField<String> = JsonMissing.of()
            private var originatorAddressLine1: JsonField<String> = JsonMissing.of()
            private var originatorAddressLine2: JsonField<String> = JsonMissing.of()
            private var originatorAddressLine3: JsonField<String> = JsonMissing.of()
            private var originatorName: JsonField<String> = JsonMissing.of()
            private var requireApproval: JsonField<Boolean> = JsonMissing.of()
            private var routingNumber: JsonField<String> = JsonMissing.of()
            private var sourceAccountNumberId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                accountId = body.accountId
                amount = body.amount
                beneficiaryName = body.beneficiaryName
                messageToRecipient = body.messageToRecipient
                accountNumber = body.accountNumber
                beneficiaryAddressLine1 = body.beneficiaryAddressLine1
                beneficiaryAddressLine2 = body.beneficiaryAddressLine2
                beneficiaryAddressLine3 = body.beneficiaryAddressLine3
                externalAccountId = body.externalAccountId
                originatorAddressLine1 = body.originatorAddressLine1
                originatorAddressLine2 = body.originatorAddressLine2
                originatorAddressLine3 = body.originatorAddressLine3
                originatorName = body.originatorName
                requireApproval = body.requireApproval
                routingNumber = body.routingNumber
                sourceAccountNumberId = body.sourceAccountNumberId
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The identifier for the account that will send the transfer. */
            fun accountId(accountId: String) = accountId(JsonField.of(accountId))

            /** The identifier for the account that will send the transfer. */
            fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

            /** The transfer amount in USD cents. */
            fun amount(amount: Long) = amount(JsonField.of(amount))

            /** The transfer amount in USD cents. */
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            /** The beneficiary's name. */
            fun beneficiaryName(beneficiaryName: String) =
                beneficiaryName(JsonField.of(beneficiaryName))

            /** The beneficiary's name. */
            fun beneficiaryName(beneficiaryName: JsonField<String>) = apply {
                this.beneficiaryName = beneficiaryName
            }

            /** The message that will show on the recipient's bank statement. */
            fun messageToRecipient(messageToRecipient: String) =
                messageToRecipient(JsonField.of(messageToRecipient))

            /** The message that will show on the recipient's bank statement. */
            fun messageToRecipient(messageToRecipient: JsonField<String>) = apply {
                this.messageToRecipient = messageToRecipient
            }

            /** The account number for the destination account. */
            fun accountNumber(accountNumber: String) = accountNumber(JsonField.of(accountNumber))

            /** The account number for the destination account. */
            fun accountNumber(accountNumber: JsonField<String>) = apply {
                this.accountNumber = accountNumber
            }

            /** The beneficiary's address line 1. */
            fun beneficiaryAddressLine1(beneficiaryAddressLine1: String) =
                beneficiaryAddressLine1(JsonField.of(beneficiaryAddressLine1))

            /** The beneficiary's address line 1. */
            fun beneficiaryAddressLine1(beneficiaryAddressLine1: JsonField<String>) = apply {
                this.beneficiaryAddressLine1 = beneficiaryAddressLine1
            }

            /** The beneficiary's address line 2. */
            fun beneficiaryAddressLine2(beneficiaryAddressLine2: String) =
                beneficiaryAddressLine2(JsonField.of(beneficiaryAddressLine2))

            /** The beneficiary's address line 2. */
            fun beneficiaryAddressLine2(beneficiaryAddressLine2: JsonField<String>) = apply {
                this.beneficiaryAddressLine2 = beneficiaryAddressLine2
            }

            /** The beneficiary's address line 3. */
            fun beneficiaryAddressLine3(beneficiaryAddressLine3: String) =
                beneficiaryAddressLine3(JsonField.of(beneficiaryAddressLine3))

            /** The beneficiary's address line 3. */
            fun beneficiaryAddressLine3(beneficiaryAddressLine3: JsonField<String>) = apply {
                this.beneficiaryAddressLine3 = beneficiaryAddressLine3
            }

            /**
             * The ID of an External Account to initiate a transfer to. If this parameter is
             * provided, `account_number` and `routing_number` must be absent.
             */
            fun externalAccountId(externalAccountId: String) =
                externalAccountId(JsonField.of(externalAccountId))

            /**
             * The ID of an External Account to initiate a transfer to. If this parameter is
             * provided, `account_number` and `routing_number` must be absent.
             */
            fun externalAccountId(externalAccountId: JsonField<String>) = apply {
                this.externalAccountId = externalAccountId
            }

            /**
             * The originator's address line 1. This is only necessary if you're transferring from a
             * commingled account. Otherwise, we'll use the associated entity's details.
             */
            fun originatorAddressLine1(originatorAddressLine1: String) =
                originatorAddressLine1(JsonField.of(originatorAddressLine1))

            /**
             * The originator's address line 1. This is only necessary if you're transferring from a
             * commingled account. Otherwise, we'll use the associated entity's details.
             */
            fun originatorAddressLine1(originatorAddressLine1: JsonField<String>) = apply {
                this.originatorAddressLine1 = originatorAddressLine1
            }

            /**
             * The originator's address line 2. This is only necessary if you're transferring from a
             * commingled account. Otherwise, we'll use the associated entity's details.
             */
            fun originatorAddressLine2(originatorAddressLine2: String) =
                originatorAddressLine2(JsonField.of(originatorAddressLine2))

            /**
             * The originator's address line 2. This is only necessary if you're transferring from a
             * commingled account. Otherwise, we'll use the associated entity's details.
             */
            fun originatorAddressLine2(originatorAddressLine2: JsonField<String>) = apply {
                this.originatorAddressLine2 = originatorAddressLine2
            }

            /**
             * The originator's address line 3. This is only necessary if you're transferring from a
             * commingled account. Otherwise, we'll use the associated entity's details.
             */
            fun originatorAddressLine3(originatorAddressLine3: String) =
                originatorAddressLine3(JsonField.of(originatorAddressLine3))

            /**
             * The originator's address line 3. This is only necessary if you're transferring from a
             * commingled account. Otherwise, we'll use the associated entity's details.
             */
            fun originatorAddressLine3(originatorAddressLine3: JsonField<String>) = apply {
                this.originatorAddressLine3 = originatorAddressLine3
            }

            /**
             * The originator's name. This is only necessary if you're transferring from a
             * commingled account. Otherwise, we'll use the associated entity's details.
             */
            fun originatorName(originatorName: String) =
                originatorName(JsonField.of(originatorName))

            /**
             * The originator's name. This is only necessary if you're transferring from a
             * commingled account. Otherwise, we'll use the associated entity's details.
             */
            fun originatorName(originatorName: JsonField<String>) = apply {
                this.originatorName = originatorName
            }

            /** Whether the transfer requires explicit approval via the dashboard or API. */
            fun requireApproval(requireApproval: Boolean) =
                requireApproval(JsonField.of(requireApproval))

            /** Whether the transfer requires explicit approval via the dashboard or API. */
            fun requireApproval(requireApproval: JsonField<Boolean>) = apply {
                this.requireApproval = requireApproval
            }

            /**
             * The American Bankers' Association (ABA) Routing Transit Number (RTN) for the
             * destination account.
             */
            fun routingNumber(routingNumber: String) = routingNumber(JsonField.of(routingNumber))

            /**
             * The American Bankers' Association (ABA) Routing Transit Number (RTN) for the
             * destination account.
             */
            fun routingNumber(routingNumber: JsonField<String>) = apply {
                this.routingNumber = routingNumber
            }

            /** The ID of an Account Number that will be passed to the wire's recipient */
            fun sourceAccountNumberId(sourceAccountNumberId: String) =
                sourceAccountNumberId(JsonField.of(sourceAccountNumberId))

            /** The ID of an Account Number that will be passed to the wire's recipient */
            fun sourceAccountNumberId(sourceAccountNumberId: JsonField<String>) = apply {
                this.sourceAccountNumberId = sourceAccountNumberId
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
                    checkRequired("accountId", accountId),
                    checkRequired("amount", amount),
                    checkRequired("beneficiaryName", beneficiaryName),
                    checkRequired("messageToRecipient", messageToRecipient),
                    accountNumber,
                    beneficiaryAddressLine1,
                    beneficiaryAddressLine2,
                    beneficiaryAddressLine3,
                    externalAccountId,
                    originatorAddressLine1,
                    originatorAddressLine2,
                    originatorAddressLine3,
                    originatorName,
                    requireApproval,
                    routingNumber,
                    sourceAccountNumberId,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && accountId == other.accountId && amount == other.amount && beneficiaryName == other.beneficiaryName && messageToRecipient == other.messageToRecipient && accountNumber == other.accountNumber && beneficiaryAddressLine1 == other.beneficiaryAddressLine1 && beneficiaryAddressLine2 == other.beneficiaryAddressLine2 && beneficiaryAddressLine3 == other.beneficiaryAddressLine3 && externalAccountId == other.externalAccountId && originatorAddressLine1 == other.originatorAddressLine1 && originatorAddressLine2 == other.originatorAddressLine2 && originatorAddressLine3 == other.originatorAddressLine3 && originatorName == other.originatorName && requireApproval == other.requireApproval && routingNumber == other.routingNumber && sourceAccountNumberId == other.sourceAccountNumberId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(accountId, amount, beneficiaryName, messageToRecipient, accountNumber, beneficiaryAddressLine1, beneficiaryAddressLine2, beneficiaryAddressLine3, externalAccountId, originatorAddressLine1, originatorAddressLine2, originatorAddressLine3, originatorName, requireApproval, routingNumber, sourceAccountNumberId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{accountId=$accountId, amount=$amount, beneficiaryName=$beneficiaryName, messageToRecipient=$messageToRecipient, accountNumber=$accountNumber, beneficiaryAddressLine1=$beneficiaryAddressLine1, beneficiaryAddressLine2=$beneficiaryAddressLine2, beneficiaryAddressLine3=$beneficiaryAddressLine3, externalAccountId=$externalAccountId, originatorAddressLine1=$originatorAddressLine1, originatorAddressLine2=$originatorAddressLine2, originatorAddressLine3=$originatorAddressLine3, originatorName=$originatorName, requireApproval=$requireApproval, routingNumber=$routingNumber, sourceAccountNumberId=$sourceAccountNumberId, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [WireTransferCreateParams].
         *
         * The following fields are required:
         * ```java
         * .accountId()
         * .amount()
         * .beneficiaryName()
         * .messageToRecipient()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [WireTransferCreateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(wireTransferCreateParams: WireTransferCreateParams) = apply {
            body = wireTransferCreateParams.body.toBuilder()
            additionalHeaders = wireTransferCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = wireTransferCreateParams.additionalQueryParams.toBuilder()
        }

        /** The identifier for the account that will send the transfer. */
        fun accountId(accountId: String) = apply { body.accountId(accountId) }

        /** The identifier for the account that will send the transfer. */
        fun accountId(accountId: JsonField<String>) = apply { body.accountId(accountId) }

        /** The transfer amount in USD cents. */
        fun amount(amount: Long) = apply { body.amount(amount) }

        /** The transfer amount in USD cents. */
        fun amount(amount: JsonField<Long>) = apply { body.amount(amount) }

        /** The beneficiary's name. */
        fun beneficiaryName(beneficiaryName: String) = apply {
            body.beneficiaryName(beneficiaryName)
        }

        /** The beneficiary's name. */
        fun beneficiaryName(beneficiaryName: JsonField<String>) = apply {
            body.beneficiaryName(beneficiaryName)
        }

        /** The message that will show on the recipient's bank statement. */
        fun messageToRecipient(messageToRecipient: String) = apply {
            body.messageToRecipient(messageToRecipient)
        }

        /** The message that will show on the recipient's bank statement. */
        fun messageToRecipient(messageToRecipient: JsonField<String>) = apply {
            body.messageToRecipient(messageToRecipient)
        }

        /** The account number for the destination account. */
        fun accountNumber(accountNumber: String) = apply { body.accountNumber(accountNumber) }

        /** The account number for the destination account. */
        fun accountNumber(accountNumber: JsonField<String>) = apply {
            body.accountNumber(accountNumber)
        }

        /** The beneficiary's address line 1. */
        fun beneficiaryAddressLine1(beneficiaryAddressLine1: String) = apply {
            body.beneficiaryAddressLine1(beneficiaryAddressLine1)
        }

        /** The beneficiary's address line 1. */
        fun beneficiaryAddressLine1(beneficiaryAddressLine1: JsonField<String>) = apply {
            body.beneficiaryAddressLine1(beneficiaryAddressLine1)
        }

        /** The beneficiary's address line 2. */
        fun beneficiaryAddressLine2(beneficiaryAddressLine2: String) = apply {
            body.beneficiaryAddressLine2(beneficiaryAddressLine2)
        }

        /** The beneficiary's address line 2. */
        fun beneficiaryAddressLine2(beneficiaryAddressLine2: JsonField<String>) = apply {
            body.beneficiaryAddressLine2(beneficiaryAddressLine2)
        }

        /** The beneficiary's address line 3. */
        fun beneficiaryAddressLine3(beneficiaryAddressLine3: String) = apply {
            body.beneficiaryAddressLine3(beneficiaryAddressLine3)
        }

        /** The beneficiary's address line 3. */
        fun beneficiaryAddressLine3(beneficiaryAddressLine3: JsonField<String>) = apply {
            body.beneficiaryAddressLine3(beneficiaryAddressLine3)
        }

        /**
         * The ID of an External Account to initiate a transfer to. If this parameter is provided,
         * `account_number` and `routing_number` must be absent.
         */
        fun externalAccountId(externalAccountId: String) = apply {
            body.externalAccountId(externalAccountId)
        }

        /**
         * The ID of an External Account to initiate a transfer to. If this parameter is provided,
         * `account_number` and `routing_number` must be absent.
         */
        fun externalAccountId(externalAccountId: JsonField<String>) = apply {
            body.externalAccountId(externalAccountId)
        }

        /**
         * The originator's address line 1. This is only necessary if you're transferring from a
         * commingled account. Otherwise, we'll use the associated entity's details.
         */
        fun originatorAddressLine1(originatorAddressLine1: String) = apply {
            body.originatorAddressLine1(originatorAddressLine1)
        }

        /**
         * The originator's address line 1. This is only necessary if you're transferring from a
         * commingled account. Otherwise, we'll use the associated entity's details.
         */
        fun originatorAddressLine1(originatorAddressLine1: JsonField<String>) = apply {
            body.originatorAddressLine1(originatorAddressLine1)
        }

        /**
         * The originator's address line 2. This is only necessary if you're transferring from a
         * commingled account. Otherwise, we'll use the associated entity's details.
         */
        fun originatorAddressLine2(originatorAddressLine2: String) = apply {
            body.originatorAddressLine2(originatorAddressLine2)
        }

        /**
         * The originator's address line 2. This is only necessary if you're transferring from a
         * commingled account. Otherwise, we'll use the associated entity's details.
         */
        fun originatorAddressLine2(originatorAddressLine2: JsonField<String>) = apply {
            body.originatorAddressLine2(originatorAddressLine2)
        }

        /**
         * The originator's address line 3. This is only necessary if you're transferring from a
         * commingled account. Otherwise, we'll use the associated entity's details.
         */
        fun originatorAddressLine3(originatorAddressLine3: String) = apply {
            body.originatorAddressLine3(originatorAddressLine3)
        }

        /**
         * The originator's address line 3. This is only necessary if you're transferring from a
         * commingled account. Otherwise, we'll use the associated entity's details.
         */
        fun originatorAddressLine3(originatorAddressLine3: JsonField<String>) = apply {
            body.originatorAddressLine3(originatorAddressLine3)
        }

        /**
         * The originator's name. This is only necessary if you're transferring from a commingled
         * account. Otherwise, we'll use the associated entity's details.
         */
        fun originatorName(originatorName: String) = apply { body.originatorName(originatorName) }

        /**
         * The originator's name. This is only necessary if you're transferring from a commingled
         * account. Otherwise, we'll use the associated entity's details.
         */
        fun originatorName(originatorName: JsonField<String>) = apply {
            body.originatorName(originatorName)
        }

        /** Whether the transfer requires explicit approval via the dashboard or API. */
        fun requireApproval(requireApproval: Boolean) = apply {
            body.requireApproval(requireApproval)
        }

        /** Whether the transfer requires explicit approval via the dashboard or API. */
        fun requireApproval(requireApproval: JsonField<Boolean>) = apply {
            body.requireApproval(requireApproval)
        }

        /**
         * The American Bankers' Association (ABA) Routing Transit Number (RTN) for the destination
         * account.
         */
        fun routingNumber(routingNumber: String) = apply { body.routingNumber(routingNumber) }

        /**
         * The American Bankers' Association (ABA) Routing Transit Number (RTN) for the destination
         * account.
         */
        fun routingNumber(routingNumber: JsonField<String>) = apply {
            body.routingNumber(routingNumber)
        }

        /** The ID of an Account Number that will be passed to the wire's recipient */
        fun sourceAccountNumberId(sourceAccountNumberId: String) = apply {
            body.sourceAccountNumberId(sourceAccountNumberId)
        }

        /** The ID of an Account Number that will be passed to the wire's recipient */
        fun sourceAccountNumberId(sourceAccountNumberId: JsonField<String>) = apply {
            body.sourceAccountNumberId(sourceAccountNumberId)
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

        fun build(): WireTransferCreateParams =
            WireTransferCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is WireTransferCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "WireTransferCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
