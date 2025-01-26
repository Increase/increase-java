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
import com.increase.api.core.checkRequired
import com.increase.api.core.immutableEmptyMap
import com.increase.api.core.toImmutable
import com.increase.api.errors.IncreaseInvalidDataException
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

/**
 * Wire transfers move funds between your Increase account and any other account accessible by
 * Fedwire.
 */
@NoAutoDetect
class WireTransfer
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("account_id")
    @ExcludeMissing
    private val accountId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("account_number")
    @ExcludeMissing
    private val accountNumber: JsonField<String> = JsonMissing.of(),
    @JsonProperty("amount") @ExcludeMissing private val amount: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("approval")
    @ExcludeMissing
    private val approval: JsonField<Approval> = JsonMissing.of(),
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
    @JsonProperty("cancellation")
    @ExcludeMissing
    private val cancellation: JsonField<Cancellation> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("created_by")
    @ExcludeMissing
    private val createdBy: JsonField<CreatedBy> = JsonMissing.of(),
    @JsonProperty("currency")
    @ExcludeMissing
    private val currency: JsonField<Currency> = JsonMissing.of(),
    @JsonProperty("external_account_id")
    @ExcludeMissing
    private val externalAccountId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("idempotency_key")
    @ExcludeMissing
    private val idempotencyKey: JsonField<String> = JsonMissing.of(),
    @JsonProperty("message_to_recipient")
    @ExcludeMissing
    private val messageToRecipient: JsonField<String> = JsonMissing.of(),
    @JsonProperty("network")
    @ExcludeMissing
    private val network: JsonField<Network> = JsonMissing.of(),
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
    @JsonProperty("pending_transaction_id")
    @ExcludeMissing
    private val pendingTransactionId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("reversal")
    @ExcludeMissing
    private val reversal: JsonField<Reversal> = JsonMissing.of(),
    @JsonProperty("routing_number")
    @ExcludeMissing
    private val routingNumber: JsonField<String> = JsonMissing.of(),
    @JsonProperty("source_account_number_id")
    @ExcludeMissing
    private val sourceAccountNumberId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("status")
    @ExcludeMissing
    private val status: JsonField<Status> = JsonMissing.of(),
    @JsonProperty("submission")
    @ExcludeMissing
    private val submission: JsonField<Submission> = JsonMissing.of(),
    @JsonProperty("transaction_id")
    @ExcludeMissing
    private val transactionId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The wire transfer's identifier. */
    fun id(): String = id.getRequired("id")

    /** The Account to which the transfer belongs. */
    fun accountId(): String = accountId.getRequired("account_id")

    /** The destination account number. */
    fun accountNumber(): String = accountNumber.getRequired("account_number")

    /** The transfer amount in USD cents. */
    fun amount(): Long = amount.getRequired("amount")

    /**
     * If your account requires approvals for transfers and the transfer was approved, this will
     * contain details of the approval.
     */
    fun approval(): Optional<Approval> = Optional.ofNullable(approval.getNullable("approval"))

    /** The beneficiary's address line 1. */
    fun beneficiaryAddressLine1(): Optional<String> =
        Optional.ofNullable(beneficiaryAddressLine1.getNullable("beneficiary_address_line1"))

    /** The beneficiary's address line 2. */
    fun beneficiaryAddressLine2(): Optional<String> =
        Optional.ofNullable(beneficiaryAddressLine2.getNullable("beneficiary_address_line2"))

    /** The beneficiary's address line 3. */
    fun beneficiaryAddressLine3(): Optional<String> =
        Optional.ofNullable(beneficiaryAddressLine3.getNullable("beneficiary_address_line3"))

    /** The beneficiary's name. */
    fun beneficiaryName(): Optional<String> =
        Optional.ofNullable(beneficiaryName.getNullable("beneficiary_name"))

    /**
     * If your account requires approvals for transfers and the transfer was not approved, this will
     * contain details of the cancellation.
     */
    fun cancellation(): Optional<Cancellation> =
        Optional.ofNullable(cancellation.getNullable("cancellation"))

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the transfer
     * was created.
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /** What object created the transfer, either via the API or the dashboard. */
    fun createdBy(): Optional<CreatedBy> = Optional.ofNullable(createdBy.getNullable("created_by"))

    /**
     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transfer's currency. For
     * wire transfers this is always equal to `usd`.
     */
    fun currency(): Currency = currency.getRequired("currency")

    /** The identifier of the External Account the transfer was made to, if any. */
    fun externalAccountId(): Optional<String> =
        Optional.ofNullable(externalAccountId.getNullable("external_account_id"))

    /**
     * The idempotency key you chose for this object. This value is unique across Increase and is
     * used to ensure that a request is only processed once. Learn more about
     * [idempotency](https://increase.com/documentation/idempotency-keys).
     */
    fun idempotencyKey(): Optional<String> =
        Optional.ofNullable(idempotencyKey.getNullable("idempotency_key"))

    /** The message that will show on the recipient's bank statement. */
    fun messageToRecipient(): Optional<String> =
        Optional.ofNullable(messageToRecipient.getNullable("message_to_recipient"))

    /** The transfer's network. */
    fun network(): Network = network.getRequired("network")

    /** The originator's address line 1. */
    fun originatorAddressLine1(): Optional<String> =
        Optional.ofNullable(originatorAddressLine1.getNullable("originator_address_line1"))

    /** The originator's address line 2. */
    fun originatorAddressLine2(): Optional<String> =
        Optional.ofNullable(originatorAddressLine2.getNullable("originator_address_line2"))

    /** The originator's address line 3. */
    fun originatorAddressLine3(): Optional<String> =
        Optional.ofNullable(originatorAddressLine3.getNullable("originator_address_line3"))

    /** The originator's name. */
    fun originatorName(): Optional<String> =
        Optional.ofNullable(originatorName.getNullable("originator_name"))

    /**
     * The ID for the pending transaction representing the transfer. A pending transaction is
     * created when the transfer
     * [requires approval](https://increase.com/documentation/transfer-approvals#transfer-approvals)
     * by someone else in your organization.
     */
    fun pendingTransactionId(): Optional<String> =
        Optional.ofNullable(pendingTransactionId.getNullable("pending_transaction_id"))

    /** If your transfer is reversed, this will contain details of the reversal. */
    fun reversal(): Optional<Reversal> = Optional.ofNullable(reversal.getNullable("reversal"))

    /** The American Bankers' Association (ABA) Routing Transit Number (RTN). */
    fun routingNumber(): String = routingNumber.getRequired("routing_number")

    /** The Account Number that was passed to the wire's recipient. */
    fun sourceAccountNumberId(): Optional<String> =
        Optional.ofNullable(sourceAccountNumberId.getNullable("source_account_number_id"))

    /** The lifecycle status of the transfer. */
    fun status(): Status = status.getRequired("status")

    /** After the transfer is submitted to Fedwire, this will contain supplemental details. */
    fun submission(): Optional<Submission> =
        Optional.ofNullable(submission.getNullable("submission"))

    /** The ID for the transaction funding the transfer. */
    fun transactionId(): Optional<String> =
        Optional.ofNullable(transactionId.getNullable("transaction_id"))

    /**
     * A constant representing the object's type. For this resource it will always be
     * `wire_transfer`.
     */
    fun type(): Type = type.getRequired("type")

    /** The wire transfer's identifier. */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /** The Account to which the transfer belongs. */
    @JsonProperty("account_id") @ExcludeMissing fun _accountId(): JsonField<String> = accountId

    /** The destination account number. */
    @JsonProperty("account_number")
    @ExcludeMissing
    fun _accountNumber(): JsonField<String> = accountNumber

    /** The transfer amount in USD cents. */
    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

    /**
     * If your account requires approvals for transfers and the transfer was approved, this will
     * contain details of the approval.
     */
    @JsonProperty("approval") @ExcludeMissing fun _approval(): JsonField<Approval> = approval

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

    /** The beneficiary's name. */
    @JsonProperty("beneficiary_name")
    @ExcludeMissing
    fun _beneficiaryName(): JsonField<String> = beneficiaryName

    /**
     * If your account requires approvals for transfers and the transfer was not approved, this will
     * contain details of the cancellation.
     */
    @JsonProperty("cancellation")
    @ExcludeMissing
    fun _cancellation(): JsonField<Cancellation> = cancellation

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the transfer
     * was created.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /** What object created the transfer, either via the API or the dashboard. */
    @JsonProperty("created_by") @ExcludeMissing fun _createdBy(): JsonField<CreatedBy> = createdBy

    /**
     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transfer's currency. For
     * wire transfers this is always equal to `usd`.
     */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<Currency> = currency

    /** The identifier of the External Account the transfer was made to, if any. */
    @JsonProperty("external_account_id")
    @ExcludeMissing
    fun _externalAccountId(): JsonField<String> = externalAccountId

    /**
     * The idempotency key you chose for this object. This value is unique across Increase and is
     * used to ensure that a request is only processed once. Learn more about
     * [idempotency](https://increase.com/documentation/idempotency-keys).
     */
    @JsonProperty("idempotency_key")
    @ExcludeMissing
    fun _idempotencyKey(): JsonField<String> = idempotencyKey

    /** The message that will show on the recipient's bank statement. */
    @JsonProperty("message_to_recipient")
    @ExcludeMissing
    fun _messageToRecipient(): JsonField<String> = messageToRecipient

    /** The transfer's network. */
    @JsonProperty("network") @ExcludeMissing fun _network(): JsonField<Network> = network

    /** The originator's address line 1. */
    @JsonProperty("originator_address_line1")
    @ExcludeMissing
    fun _originatorAddressLine1(): JsonField<String> = originatorAddressLine1

    /** The originator's address line 2. */
    @JsonProperty("originator_address_line2")
    @ExcludeMissing
    fun _originatorAddressLine2(): JsonField<String> = originatorAddressLine2

    /** The originator's address line 3. */
    @JsonProperty("originator_address_line3")
    @ExcludeMissing
    fun _originatorAddressLine3(): JsonField<String> = originatorAddressLine3

    /** The originator's name. */
    @JsonProperty("originator_name")
    @ExcludeMissing
    fun _originatorName(): JsonField<String> = originatorName

    /**
     * The ID for the pending transaction representing the transfer. A pending transaction is
     * created when the transfer
     * [requires approval](https://increase.com/documentation/transfer-approvals#transfer-approvals)
     * by someone else in your organization.
     */
    @JsonProperty("pending_transaction_id")
    @ExcludeMissing
    fun _pendingTransactionId(): JsonField<String> = pendingTransactionId

    /** If your transfer is reversed, this will contain details of the reversal. */
    @JsonProperty("reversal") @ExcludeMissing fun _reversal(): JsonField<Reversal> = reversal

    /** The American Bankers' Association (ABA) Routing Transit Number (RTN). */
    @JsonProperty("routing_number")
    @ExcludeMissing
    fun _routingNumber(): JsonField<String> = routingNumber

    /** The Account Number that was passed to the wire's recipient. */
    @JsonProperty("source_account_number_id")
    @ExcludeMissing
    fun _sourceAccountNumberId(): JsonField<String> = sourceAccountNumberId

    /** The lifecycle status of the transfer. */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /** After the transfer is submitted to Fedwire, this will contain supplemental details. */
    @JsonProperty("submission")
    @ExcludeMissing
    fun _submission(): JsonField<Submission> = submission

    /** The ID for the transaction funding the transfer. */
    @JsonProperty("transaction_id")
    @ExcludeMissing
    fun _transactionId(): JsonField<String> = transactionId

    /**
     * A constant representing the object's type. For this resource it will always be
     * `wire_transfer`.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): WireTransfer = apply {
        if (validated) {
            return@apply
        }

        id()
        accountId()
        accountNumber()
        amount()
        approval().ifPresent { it.validate() }
        beneficiaryAddressLine1()
        beneficiaryAddressLine2()
        beneficiaryAddressLine3()
        beneficiaryName()
        cancellation().ifPresent { it.validate() }
        createdAt()
        createdBy().ifPresent { it.validate() }
        currency()
        externalAccountId()
        idempotencyKey()
        messageToRecipient()
        network()
        originatorAddressLine1()
        originatorAddressLine2()
        originatorAddressLine3()
        originatorName()
        pendingTransactionId()
        reversal().ifPresent { it.validate() }
        routingNumber()
        sourceAccountNumberId()
        status()
        submission().ifPresent { it.validate() }
        transactionId()
        type()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var accountId: JsonField<String>? = null
        private var accountNumber: JsonField<String>? = null
        private var amount: JsonField<Long>? = null
        private var approval: JsonField<Approval>? = null
        private var beneficiaryAddressLine1: JsonField<String>? = null
        private var beneficiaryAddressLine2: JsonField<String>? = null
        private var beneficiaryAddressLine3: JsonField<String>? = null
        private var beneficiaryName: JsonField<String>? = null
        private var cancellation: JsonField<Cancellation>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var createdBy: JsonField<CreatedBy>? = null
        private var currency: JsonField<Currency>? = null
        private var externalAccountId: JsonField<String>? = null
        private var idempotencyKey: JsonField<String>? = null
        private var messageToRecipient: JsonField<String>? = null
        private var network: JsonField<Network>? = null
        private var originatorAddressLine1: JsonField<String>? = null
        private var originatorAddressLine2: JsonField<String>? = null
        private var originatorAddressLine3: JsonField<String>? = null
        private var originatorName: JsonField<String>? = null
        private var pendingTransactionId: JsonField<String>? = null
        private var reversal: JsonField<Reversal>? = null
        private var routingNumber: JsonField<String>? = null
        private var sourceAccountNumberId: JsonField<String>? = null
        private var status: JsonField<Status>? = null
        private var submission: JsonField<Submission>? = null
        private var transactionId: JsonField<String>? = null
        private var type: JsonField<Type>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(wireTransfer: WireTransfer) = apply {
            id = wireTransfer.id
            accountId = wireTransfer.accountId
            accountNumber = wireTransfer.accountNumber
            amount = wireTransfer.amount
            approval = wireTransfer.approval
            beneficiaryAddressLine1 = wireTransfer.beneficiaryAddressLine1
            beneficiaryAddressLine2 = wireTransfer.beneficiaryAddressLine2
            beneficiaryAddressLine3 = wireTransfer.beneficiaryAddressLine3
            beneficiaryName = wireTransfer.beneficiaryName
            cancellation = wireTransfer.cancellation
            createdAt = wireTransfer.createdAt
            createdBy = wireTransfer.createdBy
            currency = wireTransfer.currency
            externalAccountId = wireTransfer.externalAccountId
            idempotencyKey = wireTransfer.idempotencyKey
            messageToRecipient = wireTransfer.messageToRecipient
            network = wireTransfer.network
            originatorAddressLine1 = wireTransfer.originatorAddressLine1
            originatorAddressLine2 = wireTransfer.originatorAddressLine2
            originatorAddressLine3 = wireTransfer.originatorAddressLine3
            originatorName = wireTransfer.originatorName
            pendingTransactionId = wireTransfer.pendingTransactionId
            reversal = wireTransfer.reversal
            routingNumber = wireTransfer.routingNumber
            sourceAccountNumberId = wireTransfer.sourceAccountNumberId
            status = wireTransfer.status
            submission = wireTransfer.submission
            transactionId = wireTransfer.transactionId
            type = wireTransfer.type
            additionalProperties = wireTransfer.additionalProperties.toMutableMap()
        }

        /** The wire transfer's identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The wire transfer's identifier. */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The Account to which the transfer belongs. */
        fun accountId(accountId: String) = accountId(JsonField.of(accountId))

        /** The Account to which the transfer belongs. */
        fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

        /** The destination account number. */
        fun accountNumber(accountNumber: String) = accountNumber(JsonField.of(accountNumber))

        /** The destination account number. */
        fun accountNumber(accountNumber: JsonField<String>) = apply {
            this.accountNumber = accountNumber
        }

        /** The transfer amount in USD cents. */
        fun amount(amount: Long) = amount(JsonField.of(amount))

        /** The transfer amount in USD cents. */
        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

        /**
         * If your account requires approvals for transfers and the transfer was approved, this will
         * contain details of the approval.
         */
        fun approval(approval: Approval?) = approval(JsonField.ofNullable(approval))

        /**
         * If your account requires approvals for transfers and the transfer was approved, this will
         * contain details of the approval.
         */
        fun approval(approval: Optional<Approval>) = approval(approval.orElse(null))

        /**
         * If your account requires approvals for transfers and the transfer was approved, this will
         * contain details of the approval.
         */
        fun approval(approval: JsonField<Approval>) = apply { this.approval = approval }

        /** The beneficiary's address line 1. */
        fun beneficiaryAddressLine1(beneficiaryAddressLine1: String?) =
            beneficiaryAddressLine1(JsonField.ofNullable(beneficiaryAddressLine1))

        /** The beneficiary's address line 1. */
        fun beneficiaryAddressLine1(beneficiaryAddressLine1: Optional<String>) =
            beneficiaryAddressLine1(beneficiaryAddressLine1.orElse(null))

        /** The beneficiary's address line 1. */
        fun beneficiaryAddressLine1(beneficiaryAddressLine1: JsonField<String>) = apply {
            this.beneficiaryAddressLine1 = beneficiaryAddressLine1
        }

        /** The beneficiary's address line 2. */
        fun beneficiaryAddressLine2(beneficiaryAddressLine2: String?) =
            beneficiaryAddressLine2(JsonField.ofNullable(beneficiaryAddressLine2))

        /** The beneficiary's address line 2. */
        fun beneficiaryAddressLine2(beneficiaryAddressLine2: Optional<String>) =
            beneficiaryAddressLine2(beneficiaryAddressLine2.orElse(null))

        /** The beneficiary's address line 2. */
        fun beneficiaryAddressLine2(beneficiaryAddressLine2: JsonField<String>) = apply {
            this.beneficiaryAddressLine2 = beneficiaryAddressLine2
        }

        /** The beneficiary's address line 3. */
        fun beneficiaryAddressLine3(beneficiaryAddressLine3: String?) =
            beneficiaryAddressLine3(JsonField.ofNullable(beneficiaryAddressLine3))

        /** The beneficiary's address line 3. */
        fun beneficiaryAddressLine3(beneficiaryAddressLine3: Optional<String>) =
            beneficiaryAddressLine3(beneficiaryAddressLine3.orElse(null))

        /** The beneficiary's address line 3. */
        fun beneficiaryAddressLine3(beneficiaryAddressLine3: JsonField<String>) = apply {
            this.beneficiaryAddressLine3 = beneficiaryAddressLine3
        }

        /** The beneficiary's name. */
        fun beneficiaryName(beneficiaryName: String?) =
            beneficiaryName(JsonField.ofNullable(beneficiaryName))

        /** The beneficiary's name. */
        fun beneficiaryName(beneficiaryName: Optional<String>) =
            beneficiaryName(beneficiaryName.orElse(null))

        /** The beneficiary's name. */
        fun beneficiaryName(beneficiaryName: JsonField<String>) = apply {
            this.beneficiaryName = beneficiaryName
        }

        /**
         * If your account requires approvals for transfers and the transfer was not approved, this
         * will contain details of the cancellation.
         */
        fun cancellation(cancellation: Cancellation?) =
            cancellation(JsonField.ofNullable(cancellation))

        /**
         * If your account requires approvals for transfers and the transfer was not approved, this
         * will contain details of the cancellation.
         */
        fun cancellation(cancellation: Optional<Cancellation>) =
            cancellation(cancellation.orElse(null))

        /**
         * If your account requires approvals for transfers and the transfer was not approved, this
         * will contain details of the cancellation.
         */
        fun cancellation(cancellation: JsonField<Cancellation>) = apply {
            this.cancellation = cancellation
        }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
         * transfer was created.
         */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
         * transfer was created.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** What object created the transfer, either via the API or the dashboard. */
        fun createdBy(createdBy: CreatedBy?) = createdBy(JsonField.ofNullable(createdBy))

        /** What object created the transfer, either via the API or the dashboard. */
        fun createdBy(createdBy: Optional<CreatedBy>) = createdBy(createdBy.orElse(null))

        /** What object created the transfer, either via the API or the dashboard. */
        fun createdBy(createdBy: JsonField<CreatedBy>) = apply { this.createdBy = createdBy }

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transfer's currency.
         * For wire transfers this is always equal to `usd`.
         */
        fun currency(currency: Currency) = currency(JsonField.of(currency))

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transfer's currency.
         * For wire transfers this is always equal to `usd`.
         */
        fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

        /** The identifier of the External Account the transfer was made to, if any. */
        fun externalAccountId(externalAccountId: String?) =
            externalAccountId(JsonField.ofNullable(externalAccountId))

        /** The identifier of the External Account the transfer was made to, if any. */
        fun externalAccountId(externalAccountId: Optional<String>) =
            externalAccountId(externalAccountId.orElse(null))

        /** The identifier of the External Account the transfer was made to, if any. */
        fun externalAccountId(externalAccountId: JsonField<String>) = apply {
            this.externalAccountId = externalAccountId
        }

        /**
         * The idempotency key you chose for this object. This value is unique across Increase and
         * is used to ensure that a request is only processed once. Learn more about
         * [idempotency](https://increase.com/documentation/idempotency-keys).
         */
        fun idempotencyKey(idempotencyKey: String?) =
            idempotencyKey(JsonField.ofNullable(idempotencyKey))

        /**
         * The idempotency key you chose for this object. This value is unique across Increase and
         * is used to ensure that a request is only processed once. Learn more about
         * [idempotency](https://increase.com/documentation/idempotency-keys).
         */
        fun idempotencyKey(idempotencyKey: Optional<String>) =
            idempotencyKey(idempotencyKey.orElse(null))

        /**
         * The idempotency key you chose for this object. This value is unique across Increase and
         * is used to ensure that a request is only processed once. Learn more about
         * [idempotency](https://increase.com/documentation/idempotency-keys).
         */
        fun idempotencyKey(idempotencyKey: JsonField<String>) = apply {
            this.idempotencyKey = idempotencyKey
        }

        /** The message that will show on the recipient's bank statement. */
        fun messageToRecipient(messageToRecipient: String?) =
            messageToRecipient(JsonField.ofNullable(messageToRecipient))

        /** The message that will show on the recipient's bank statement. */
        fun messageToRecipient(messageToRecipient: Optional<String>) =
            messageToRecipient(messageToRecipient.orElse(null))

        /** The message that will show on the recipient's bank statement. */
        fun messageToRecipient(messageToRecipient: JsonField<String>) = apply {
            this.messageToRecipient = messageToRecipient
        }

        /** The transfer's network. */
        fun network(network: Network) = network(JsonField.of(network))

        /** The transfer's network. */
        fun network(network: JsonField<Network>) = apply { this.network = network }

        /** The originator's address line 1. */
        fun originatorAddressLine1(originatorAddressLine1: String?) =
            originatorAddressLine1(JsonField.ofNullable(originatorAddressLine1))

        /** The originator's address line 1. */
        fun originatorAddressLine1(originatorAddressLine1: Optional<String>) =
            originatorAddressLine1(originatorAddressLine1.orElse(null))

        /** The originator's address line 1. */
        fun originatorAddressLine1(originatorAddressLine1: JsonField<String>) = apply {
            this.originatorAddressLine1 = originatorAddressLine1
        }

        /** The originator's address line 2. */
        fun originatorAddressLine2(originatorAddressLine2: String?) =
            originatorAddressLine2(JsonField.ofNullable(originatorAddressLine2))

        /** The originator's address line 2. */
        fun originatorAddressLine2(originatorAddressLine2: Optional<String>) =
            originatorAddressLine2(originatorAddressLine2.orElse(null))

        /** The originator's address line 2. */
        fun originatorAddressLine2(originatorAddressLine2: JsonField<String>) = apply {
            this.originatorAddressLine2 = originatorAddressLine2
        }

        /** The originator's address line 3. */
        fun originatorAddressLine3(originatorAddressLine3: String?) =
            originatorAddressLine3(JsonField.ofNullable(originatorAddressLine3))

        /** The originator's address line 3. */
        fun originatorAddressLine3(originatorAddressLine3: Optional<String>) =
            originatorAddressLine3(originatorAddressLine3.orElse(null))

        /** The originator's address line 3. */
        fun originatorAddressLine3(originatorAddressLine3: JsonField<String>) = apply {
            this.originatorAddressLine3 = originatorAddressLine3
        }

        /** The originator's name. */
        fun originatorName(originatorName: String?) =
            originatorName(JsonField.ofNullable(originatorName))

        /** The originator's name. */
        fun originatorName(originatorName: Optional<String>) =
            originatorName(originatorName.orElse(null))

        /** The originator's name. */
        fun originatorName(originatorName: JsonField<String>) = apply {
            this.originatorName = originatorName
        }

        /**
         * The ID for the pending transaction representing the transfer. A pending transaction is
         * created when the transfer
         * [requires approval](https://increase.com/documentation/transfer-approvals#transfer-approvals)
         * by someone else in your organization.
         */
        fun pendingTransactionId(pendingTransactionId: String?) =
            pendingTransactionId(JsonField.ofNullable(pendingTransactionId))

        /**
         * The ID for the pending transaction representing the transfer. A pending transaction is
         * created when the transfer
         * [requires approval](https://increase.com/documentation/transfer-approvals#transfer-approvals)
         * by someone else in your organization.
         */
        fun pendingTransactionId(pendingTransactionId: Optional<String>) =
            pendingTransactionId(pendingTransactionId.orElse(null))

        /**
         * The ID for the pending transaction representing the transfer. A pending transaction is
         * created when the transfer
         * [requires approval](https://increase.com/documentation/transfer-approvals#transfer-approvals)
         * by someone else in your organization.
         */
        fun pendingTransactionId(pendingTransactionId: JsonField<String>) = apply {
            this.pendingTransactionId = pendingTransactionId
        }

        /** If your transfer is reversed, this will contain details of the reversal. */
        fun reversal(reversal: Reversal?) = reversal(JsonField.ofNullable(reversal))

        /** If your transfer is reversed, this will contain details of the reversal. */
        fun reversal(reversal: Optional<Reversal>) = reversal(reversal.orElse(null))

        /** If your transfer is reversed, this will contain details of the reversal. */
        fun reversal(reversal: JsonField<Reversal>) = apply { this.reversal = reversal }

        /** The American Bankers' Association (ABA) Routing Transit Number (RTN). */
        fun routingNumber(routingNumber: String) = routingNumber(JsonField.of(routingNumber))

        /** The American Bankers' Association (ABA) Routing Transit Number (RTN). */
        fun routingNumber(routingNumber: JsonField<String>) = apply {
            this.routingNumber = routingNumber
        }

        /** The Account Number that was passed to the wire's recipient. */
        fun sourceAccountNumberId(sourceAccountNumberId: String?) =
            sourceAccountNumberId(JsonField.ofNullable(sourceAccountNumberId))

        /** The Account Number that was passed to the wire's recipient. */
        fun sourceAccountNumberId(sourceAccountNumberId: Optional<String>) =
            sourceAccountNumberId(sourceAccountNumberId.orElse(null))

        /** The Account Number that was passed to the wire's recipient. */
        fun sourceAccountNumberId(sourceAccountNumberId: JsonField<String>) = apply {
            this.sourceAccountNumberId = sourceAccountNumberId
        }

        /** The lifecycle status of the transfer. */
        fun status(status: Status) = status(JsonField.of(status))

        /** The lifecycle status of the transfer. */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** After the transfer is submitted to Fedwire, this will contain supplemental details. */
        fun submission(submission: Submission?) = submission(JsonField.ofNullable(submission))

        /** After the transfer is submitted to Fedwire, this will contain supplemental details. */
        fun submission(submission: Optional<Submission>) = submission(submission.orElse(null))

        /** After the transfer is submitted to Fedwire, this will contain supplemental details. */
        fun submission(submission: JsonField<Submission>) = apply { this.submission = submission }

        /** The ID for the transaction funding the transfer. */
        fun transactionId(transactionId: String?) =
            transactionId(JsonField.ofNullable(transactionId))

        /** The ID for the transaction funding the transfer. */
        fun transactionId(transactionId: Optional<String>) =
            transactionId(transactionId.orElse(null))

        /** The ID for the transaction funding the transfer. */
        fun transactionId(transactionId: JsonField<String>) = apply {
            this.transactionId = transactionId
        }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `wire_transfer`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * A constant representing the object's type. For this resource it will always be
         * `wire_transfer`.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

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

        fun build(): WireTransfer =
            WireTransfer(
                checkRequired("id", id),
                checkRequired("accountId", accountId),
                checkRequired("accountNumber", accountNumber),
                checkRequired("amount", amount),
                checkRequired("approval", approval),
                checkRequired("beneficiaryAddressLine1", beneficiaryAddressLine1),
                checkRequired("beneficiaryAddressLine2", beneficiaryAddressLine2),
                checkRequired("beneficiaryAddressLine3", beneficiaryAddressLine3),
                checkRequired("beneficiaryName", beneficiaryName),
                checkRequired("cancellation", cancellation),
                checkRequired("createdAt", createdAt),
                checkRequired("createdBy", createdBy),
                checkRequired("currency", currency),
                checkRequired("externalAccountId", externalAccountId),
                checkRequired("idempotencyKey", idempotencyKey),
                checkRequired("messageToRecipient", messageToRecipient),
                checkRequired("network", network),
                checkRequired("originatorAddressLine1", originatorAddressLine1),
                checkRequired("originatorAddressLine2", originatorAddressLine2),
                checkRequired("originatorAddressLine3", originatorAddressLine3),
                checkRequired("originatorName", originatorName),
                checkRequired("pendingTransactionId", pendingTransactionId),
                checkRequired("reversal", reversal),
                checkRequired("routingNumber", routingNumber),
                checkRequired("sourceAccountNumberId", sourceAccountNumberId),
                checkRequired("status", status),
                checkRequired("submission", submission),
                checkRequired("transactionId", transactionId),
                checkRequired("type", type),
                additionalProperties.toImmutable(),
            )
    }

    /**
     * If your account requires approvals for transfers and the transfer was approved, this will
     * contain details of the approval.
     */
    @NoAutoDetect
    class Approval
    @JsonCreator
    private constructor(
        @JsonProperty("approved_at")
        @ExcludeMissing
        private val approvedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("approved_by")
        @ExcludeMissing
        private val approvedBy: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
         * transfer was approved.
         */
        fun approvedAt(): OffsetDateTime = approvedAt.getRequired("approved_at")

        /**
         * If the Transfer was approved by a user in the dashboard, the email address of that user.
         */
        fun approvedBy(): Optional<String> =
            Optional.ofNullable(approvedBy.getNullable("approved_by"))

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
         * transfer was approved.
         */
        @JsonProperty("approved_at")
        @ExcludeMissing
        fun _approvedAt(): JsonField<OffsetDateTime> = approvedAt

        /**
         * If the Transfer was approved by a user in the dashboard, the email address of that user.
         */
        @JsonProperty("approved_by")
        @ExcludeMissing
        fun _approvedBy(): JsonField<String> = approvedBy

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Approval = apply {
            if (validated) {
                return@apply
            }

            approvedAt()
            approvedBy()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder internal constructor() {

            private var approvedAt: JsonField<OffsetDateTime>? = null
            private var approvedBy: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(approval: Approval) = apply {
                approvedAt = approval.approvedAt
                approvedBy = approval.approvedBy
                additionalProperties = approval.additionalProperties.toMutableMap()
            }

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * transfer was approved.
             */
            fun approvedAt(approvedAt: OffsetDateTime) = approvedAt(JsonField.of(approvedAt))

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * transfer was approved.
             */
            fun approvedAt(approvedAt: JsonField<OffsetDateTime>) = apply {
                this.approvedAt = approvedAt
            }

            /**
             * If the Transfer was approved by a user in the dashboard, the email address of that
             * user.
             */
            fun approvedBy(approvedBy: String?) = approvedBy(JsonField.ofNullable(approvedBy))

            /**
             * If the Transfer was approved by a user in the dashboard, the email address of that
             * user.
             */
            fun approvedBy(approvedBy: Optional<String>) = approvedBy(approvedBy.orElse(null))

            /**
             * If the Transfer was approved by a user in the dashboard, the email address of that
             * user.
             */
            fun approvedBy(approvedBy: JsonField<String>) = apply { this.approvedBy = approvedBy }

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

            fun build(): Approval =
                Approval(
                    checkRequired("approvedAt", approvedAt),
                    checkRequired("approvedBy", approvedBy),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Approval && approvedAt == other.approvedAt && approvedBy == other.approvedBy && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(approvedAt, approvedBy, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Approval{approvedAt=$approvedAt, approvedBy=$approvedBy, additionalProperties=$additionalProperties}"
    }

    /**
     * If your account requires approvals for transfers and the transfer was not approved, this will
     * contain details of the cancellation.
     */
    @NoAutoDetect
    class Cancellation
    @JsonCreator
    private constructor(
        @JsonProperty("canceled_at")
        @ExcludeMissing
        private val canceledAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("canceled_by")
        @ExcludeMissing
        private val canceledBy: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
         * Transfer was canceled.
         */
        fun canceledAt(): OffsetDateTime = canceledAt.getRequired("canceled_at")

        /**
         * If the Transfer was canceled by a user in the dashboard, the email address of that user.
         */
        fun canceledBy(): Optional<String> =
            Optional.ofNullable(canceledBy.getNullable("canceled_by"))

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
         * Transfer was canceled.
         */
        @JsonProperty("canceled_at")
        @ExcludeMissing
        fun _canceledAt(): JsonField<OffsetDateTime> = canceledAt

        /**
         * If the Transfer was canceled by a user in the dashboard, the email address of that user.
         */
        @JsonProperty("canceled_by")
        @ExcludeMissing
        fun _canceledBy(): JsonField<String> = canceledBy

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Cancellation = apply {
            if (validated) {
                return@apply
            }

            canceledAt()
            canceledBy()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder internal constructor() {

            private var canceledAt: JsonField<OffsetDateTime>? = null
            private var canceledBy: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(cancellation: Cancellation) = apply {
                canceledAt = cancellation.canceledAt
                canceledBy = cancellation.canceledBy
                additionalProperties = cancellation.additionalProperties.toMutableMap()
            }

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * Transfer was canceled.
             */
            fun canceledAt(canceledAt: OffsetDateTime) = canceledAt(JsonField.of(canceledAt))

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * Transfer was canceled.
             */
            fun canceledAt(canceledAt: JsonField<OffsetDateTime>) = apply {
                this.canceledAt = canceledAt
            }

            /**
             * If the Transfer was canceled by a user in the dashboard, the email address of that
             * user.
             */
            fun canceledBy(canceledBy: String?) = canceledBy(JsonField.ofNullable(canceledBy))

            /**
             * If the Transfer was canceled by a user in the dashboard, the email address of that
             * user.
             */
            fun canceledBy(canceledBy: Optional<String>) = canceledBy(canceledBy.orElse(null))

            /**
             * If the Transfer was canceled by a user in the dashboard, the email address of that
             * user.
             */
            fun canceledBy(canceledBy: JsonField<String>) = apply { this.canceledBy = canceledBy }

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

            fun build(): Cancellation =
                Cancellation(
                    checkRequired("canceledAt", canceledAt),
                    checkRequired("canceledBy", canceledBy),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Cancellation && canceledAt == other.canceledAt && canceledBy == other.canceledBy && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(canceledAt, canceledBy, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Cancellation{canceledAt=$canceledAt, canceledBy=$canceledBy, additionalProperties=$additionalProperties}"
    }

    /** What object created the transfer, either via the API or the dashboard. */
    @NoAutoDetect
    class CreatedBy
    @JsonCreator
    private constructor(
        @JsonProperty("api_key")
        @ExcludeMissing
        private val apiKey: JsonField<ApiKey> = JsonMissing.of(),
        @JsonProperty("category")
        @ExcludeMissing
        private val category: JsonField<Category> = JsonMissing.of(),
        @JsonProperty("oauth_application")
        @ExcludeMissing
        private val oauthApplication: JsonField<OAuthApplication> = JsonMissing.of(),
        @JsonProperty("user") @ExcludeMissing private val user: JsonField<User> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** If present, details about the API key that created the transfer. */
        fun apiKey(): Optional<ApiKey> = Optional.ofNullable(apiKey.getNullable("api_key"))

        /** The type of object that created this transfer. */
        fun category(): Category = category.getRequired("category")

        /** If present, details about the OAuth Application that created the transfer. */
        fun oauthApplication(): Optional<OAuthApplication> =
            Optional.ofNullable(oauthApplication.getNullable("oauth_application"))

        /** If present, details about the User that created the transfer. */
        fun user(): Optional<User> = Optional.ofNullable(user.getNullable("user"))

        /** If present, details about the API key that created the transfer. */
        @JsonProperty("api_key") @ExcludeMissing fun _apiKey(): JsonField<ApiKey> = apiKey

        /** The type of object that created this transfer. */
        @JsonProperty("category") @ExcludeMissing fun _category(): JsonField<Category> = category

        /** If present, details about the OAuth Application that created the transfer. */
        @JsonProperty("oauth_application")
        @ExcludeMissing
        fun _oauthApplication(): JsonField<OAuthApplication> = oauthApplication

        /** If present, details about the User that created the transfer. */
        @JsonProperty("user") @ExcludeMissing fun _user(): JsonField<User> = user

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): CreatedBy = apply {
            if (validated) {
                return@apply
            }

            apiKey().ifPresent { it.validate() }
            category()
            oauthApplication().ifPresent { it.validate() }
            user().ifPresent { it.validate() }
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder internal constructor() {

            private var apiKey: JsonField<ApiKey>? = null
            private var category: JsonField<Category>? = null
            private var oauthApplication: JsonField<OAuthApplication>? = null
            private var user: JsonField<User>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(createdBy: CreatedBy) = apply {
                apiKey = createdBy.apiKey
                category = createdBy.category
                oauthApplication = createdBy.oauthApplication
                user = createdBy.user
                additionalProperties = createdBy.additionalProperties.toMutableMap()
            }

            /** If present, details about the API key that created the transfer. */
            fun apiKey(apiKey: ApiKey?) = apiKey(JsonField.ofNullable(apiKey))

            /** If present, details about the API key that created the transfer. */
            fun apiKey(apiKey: Optional<ApiKey>) = apiKey(apiKey.orElse(null))

            /** If present, details about the API key that created the transfer. */
            fun apiKey(apiKey: JsonField<ApiKey>) = apply { this.apiKey = apiKey }

            /** The type of object that created this transfer. */
            fun category(category: Category) = category(JsonField.of(category))

            /** The type of object that created this transfer. */
            fun category(category: JsonField<Category>) = apply { this.category = category }

            /** If present, details about the OAuth Application that created the transfer. */
            fun oauthApplication(oauthApplication: OAuthApplication?) =
                oauthApplication(JsonField.ofNullable(oauthApplication))

            /** If present, details about the OAuth Application that created the transfer. */
            fun oauthApplication(oauthApplication: Optional<OAuthApplication>) =
                oauthApplication(oauthApplication.orElse(null))

            /** If present, details about the OAuth Application that created the transfer. */
            fun oauthApplication(oauthApplication: JsonField<OAuthApplication>) = apply {
                this.oauthApplication = oauthApplication
            }

            /** If present, details about the User that created the transfer. */
            fun user(user: User?) = user(JsonField.ofNullable(user))

            /** If present, details about the User that created the transfer. */
            fun user(user: Optional<User>) = user(user.orElse(null))

            /** If present, details about the User that created the transfer. */
            fun user(user: JsonField<User>) = apply { this.user = user }

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

            fun build(): CreatedBy =
                CreatedBy(
                    checkRequired("apiKey", apiKey),
                    checkRequired("category", category),
                    checkRequired("oauthApplication", oauthApplication),
                    checkRequired("user", user),
                    additionalProperties.toImmutable(),
                )
        }

        /** If present, details about the API key that created the transfer. */
        @NoAutoDetect
        class ApiKey
        @JsonCreator
        private constructor(
            @JsonProperty("description")
            @ExcludeMissing
            private val description: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The description set for the API key when it was created. */
            fun description(): Optional<String> =
                Optional.ofNullable(description.getNullable("description"))

            /** The description set for the API key when it was created. */
            @JsonProperty("description")
            @ExcludeMissing
            fun _description(): JsonField<String> = description

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): ApiKey = apply {
                if (validated) {
                    return@apply
                }

                description()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder internal constructor() {

                private var description: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(apiKey: ApiKey) = apply {
                    description = apiKey.description
                    additionalProperties = apiKey.additionalProperties.toMutableMap()
                }

                /** The description set for the API key when it was created. */
                fun description(description: String?) =
                    description(JsonField.ofNullable(description))

                /** The description set for the API key when it was created. */
                fun description(description: Optional<String>) =
                    description(description.orElse(null))

                /** The description set for the API key when it was created. */
                fun description(description: JsonField<String>) = apply {
                    this.description = description
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): ApiKey =
                    ApiKey(
                        checkRequired("description", description),
                        additionalProperties.toImmutable()
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ApiKey && description == other.description && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(description, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ApiKey{description=$description, additionalProperties=$additionalProperties}"
        }

        /** The type of object that created this transfer. */
        class Category
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                /** An API key. Details will be under the `api_key` object. */
                @JvmField val API_KEY = of("api_key")

                /**
                 * An OAuth application you connected to Increase. Details will be under the
                 * `oauth_application` object.
                 */
                @JvmField val OAUTH_APPLICATION = of("oauth_application")

                /** A User in the Increase dashboard. Details will be under the `user` object. */
                @JvmField val USER = of("user")

                @JvmStatic fun of(value: String) = Category(JsonField.of(value))
            }

            enum class Known {
                /** An API key. Details will be under the `api_key` object. */
                API_KEY,
                /**
                 * An OAuth application you connected to Increase. Details will be under the
                 * `oauth_application` object.
                 */
                OAUTH_APPLICATION,
                /** A User in the Increase dashboard. Details will be under the `user` object. */
                USER,
            }

            enum class Value {
                /** An API key. Details will be under the `api_key` object. */
                API_KEY,
                /**
                 * An OAuth application you connected to Increase. Details will be under the
                 * `oauth_application` object.
                 */
                OAUTH_APPLICATION,
                /** A User in the Increase dashboard. Details will be under the `user` object. */
                USER,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    API_KEY -> Value.API_KEY
                    OAUTH_APPLICATION -> Value.OAUTH_APPLICATION
                    USER -> Value.USER
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    API_KEY -> Known.API_KEY
                    OAUTH_APPLICATION -> Known.OAUTH_APPLICATION
                    USER -> Known.USER
                    else -> throw IncreaseInvalidDataException("Unknown Category: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Category && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** If present, details about the OAuth Application that created the transfer. */
        @NoAutoDetect
        class OAuthApplication
        @JsonCreator
        private constructor(
            @JsonProperty("name")
            @ExcludeMissing
            private val name: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The name of the OAuth Application. */
            fun name(): String = name.getRequired("name")

            /** The name of the OAuth Application. */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): OAuthApplication = apply {
                if (validated) {
                    return@apply
                }

                name()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder internal constructor() {

                private var name: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(oauthApplication: OAuthApplication) = apply {
                    name = oauthApplication.name
                    additionalProperties = oauthApplication.additionalProperties.toMutableMap()
                }

                /** The name of the OAuth Application. */
                fun name(name: String) = name(JsonField.of(name))

                /** The name of the OAuth Application. */
                fun name(name: JsonField<String>) = apply { this.name = name }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): OAuthApplication =
                    OAuthApplication(
                        checkRequired("name", name),
                        additionalProperties.toImmutable()
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is OAuthApplication && name == other.name && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(name, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "OAuthApplication{name=$name, additionalProperties=$additionalProperties}"
        }

        /** If present, details about the User that created the transfer. */
        @NoAutoDetect
        class User
        @JsonCreator
        private constructor(
            @JsonProperty("email")
            @ExcludeMissing
            private val email: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The email address of the User. */
            fun email(): String = email.getRequired("email")

            /** The email address of the User. */
            @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): User = apply {
                if (validated) {
                    return@apply
                }

                email()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder internal constructor() {

                private var email: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(user: User) = apply {
                    email = user.email
                    additionalProperties = user.additionalProperties.toMutableMap()
                }

                /** The email address of the User. */
                fun email(email: String) = email(JsonField.of(email))

                /** The email address of the User. */
                fun email(email: JsonField<String>) = apply { this.email = email }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): User =
                    User(checkRequired("email", email), additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is User && email == other.email && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(email, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "User{email=$email, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CreatedBy && apiKey == other.apiKey && category == other.category && oauthApplication == other.oauthApplication && user == other.user && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(apiKey, category, oauthApplication, user, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CreatedBy{apiKey=$apiKey, category=$category, oauthApplication=$oauthApplication, user=$user, additionalProperties=$additionalProperties}"
    }

    /**
     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transfer's currency. For
     * wire transfers this is always equal to `usd`.
     */
    class Currency
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            /** Canadian Dollar (CAD) */
            @JvmField val CAD = of("CAD")

            /** Swiss Franc (CHF) */
            @JvmField val CHF = of("CHF")

            /** Euro (EUR) */
            @JvmField val EUR = of("EUR")

            /** British Pound (GBP) */
            @JvmField val GBP = of("GBP")

            /** Japanese Yen (JPY) */
            @JvmField val JPY = of("JPY")

            /** US Dollar (USD) */
            @JvmField val USD = of("USD")

            @JvmStatic fun of(value: String) = Currency(JsonField.of(value))
        }

        enum class Known {
            /** Canadian Dollar (CAD) */
            CAD,
            /** Swiss Franc (CHF) */
            CHF,
            /** Euro (EUR) */
            EUR,
            /** British Pound (GBP) */
            GBP,
            /** Japanese Yen (JPY) */
            JPY,
            /** US Dollar (USD) */
            USD,
        }

        enum class Value {
            /** Canadian Dollar (CAD) */
            CAD,
            /** Swiss Franc (CHF) */
            CHF,
            /** Euro (EUR) */
            EUR,
            /** British Pound (GBP) */
            GBP,
            /** Japanese Yen (JPY) */
            JPY,
            /** US Dollar (USD) */
            USD,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                CAD -> Value.CAD
                CHF -> Value.CHF
                EUR -> Value.EUR
                GBP -> Value.GBP
                JPY -> Value.JPY
                USD -> Value.USD
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                CAD -> Known.CAD
                CHF -> Known.CHF
                EUR -> Known.EUR
                GBP -> Known.GBP
                JPY -> Known.JPY
                USD -> Known.USD
                else -> throw IncreaseInvalidDataException("Unknown Currency: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Currency && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The transfer's network. */
    class Network
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val WIRE = of("wire")

            @JvmStatic fun of(value: String) = Network(JsonField.of(value))
        }

        enum class Known {
            WIRE,
        }

        enum class Value {
            WIRE,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                WIRE -> Value.WIRE
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                WIRE -> Known.WIRE
                else -> throw IncreaseInvalidDataException("Unknown Network: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Network && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** If your transfer is reversed, this will contain details of the reversal. */
    @NoAutoDetect
    class Reversal
    @JsonCreator
    private constructor(
        @JsonProperty("amount")
        @ExcludeMissing
        private val amount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        private val description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("financial_institution_to_financial_institution_information")
        @ExcludeMissing
        private val financialInstitutionToFinancialInstitutionInformation: JsonField<String> =
            JsonMissing.of(),
        @JsonProperty("input_cycle_date")
        @ExcludeMissing
        private val inputCycleDate: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("input_message_accountability_data")
        @ExcludeMissing
        private val inputMessageAccountabilityData: JsonField<String> = JsonMissing.of(),
        @JsonProperty("input_sequence_number")
        @ExcludeMissing
        private val inputSequenceNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("input_source")
        @ExcludeMissing
        private val inputSource: JsonField<String> = JsonMissing.of(),
        @JsonProperty("originator_routing_number")
        @ExcludeMissing
        private val originatorRoutingNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("previous_message_input_cycle_date")
        @ExcludeMissing
        private val previousMessageInputCycleDate: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("previous_message_input_message_accountability_data")
        @ExcludeMissing
        private val previousMessageInputMessageAccountabilityData: JsonField<String> =
            JsonMissing.of(),
        @JsonProperty("previous_message_input_sequence_number")
        @ExcludeMissing
        private val previousMessageInputSequenceNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("previous_message_input_source")
        @ExcludeMissing
        private val previousMessageInputSource: JsonField<String> = JsonMissing.of(),
        @JsonProperty("receiver_financial_institution_information")
        @ExcludeMissing
        private val receiverFinancialInstitutionInformation: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sender_reference")
        @ExcludeMissing
        private val senderReference: JsonField<String> = JsonMissing.of(),
        @JsonProperty("transaction_id")
        @ExcludeMissing
        private val transactionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("wire_transfer_id")
        @ExcludeMissing
        private val wireTransferId: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The amount that was reversed in USD cents. */
        fun amount(): Long = amount.getRequired("amount")

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
         * reversal was created.
         */
        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        /** The description on the reversal message from Fedwire, set by the reversing bank. */
        fun description(): String = description.getRequired("description")

        /** Additional financial institution information included in the wire reversal. */
        fun financialInstitutionToFinancialInstitutionInformation(): Optional<String> =
            Optional.ofNullable(
                financialInstitutionToFinancialInstitutionInformation.getNullable(
                    "financial_institution_to_financial_institution_information"
                )
            )

        /**
         * The Fedwire cycle date for the wire reversal. The "Fedwire day" begins at 9:00 PM Eastern
         * Time on the evening before the `cycle date`.
         */
        fun inputCycleDate(): LocalDate = inputCycleDate.getRequired("input_cycle_date")

        /** The Fedwire transaction identifier. */
        fun inputMessageAccountabilityData(): String =
            inputMessageAccountabilityData.getRequired("input_message_accountability_data")

        /** The Fedwire sequence number. */
        fun inputSequenceNumber(): String = inputSequenceNumber.getRequired("input_sequence_number")

        /** The Fedwire input source identifier. */
        fun inputSource(): String = inputSource.getRequired("input_source")

        /**
         * The American Banking Association (ABA) routing number of the bank originating the
         * transfer.
         */
        fun originatorRoutingNumber(): Optional<String> =
            Optional.ofNullable(originatorRoutingNumber.getNullable("originator_routing_number"))

        /** The Fedwire cycle date for the wire transfer that is being reversed by this message. */
        fun previousMessageInputCycleDate(): LocalDate =
            previousMessageInputCycleDate.getRequired("previous_message_input_cycle_date")

        /** The Fedwire transaction identifier for the wire transfer that was reversed. */
        fun previousMessageInputMessageAccountabilityData(): String =
            previousMessageInputMessageAccountabilityData.getRequired(
                "previous_message_input_message_accountability_data"
            )

        /** The Fedwire sequence number for the wire transfer that was reversed. */
        fun previousMessageInputSequenceNumber(): String =
            previousMessageInputSequenceNumber.getRequired("previous_message_input_sequence_number")

        /** The Fedwire input source identifier for the wire transfer that was reversed. */
        fun previousMessageInputSource(): String =
            previousMessageInputSource.getRequired("previous_message_input_source")

        /** Information included in the wire reversal for the receiving financial institution. */
        fun receiverFinancialInstitutionInformation(): Optional<String> =
            Optional.ofNullable(
                receiverFinancialInstitutionInformation.getNullable(
                    "receiver_financial_institution_information"
                )
            )

        /** The sending bank's reference number for the wire reversal. */
        fun senderReference(): Optional<String> =
            Optional.ofNullable(senderReference.getNullable("sender_reference"))

        /** The ID for the Transaction associated with the transfer reversal. */
        fun transactionId(): String = transactionId.getRequired("transaction_id")

        /** The ID for the Wire Transfer that is being reversed. */
        fun wireTransferId(): String = wireTransferId.getRequired("wire_transfer_id")

        /** The amount that was reversed in USD cents. */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
         * reversal was created.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /** The description on the reversal message from Fedwire, set by the reversing bank. */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /** Additional financial institution information included in the wire reversal. */
        @JsonProperty("financial_institution_to_financial_institution_information")
        @ExcludeMissing
        fun _financialInstitutionToFinancialInstitutionInformation(): JsonField<String> =
            financialInstitutionToFinancialInstitutionInformation

        /**
         * The Fedwire cycle date for the wire reversal. The "Fedwire day" begins at 9:00 PM Eastern
         * Time on the evening before the `cycle date`.
         */
        @JsonProperty("input_cycle_date")
        @ExcludeMissing
        fun _inputCycleDate(): JsonField<LocalDate> = inputCycleDate

        /** The Fedwire transaction identifier. */
        @JsonProperty("input_message_accountability_data")
        @ExcludeMissing
        fun _inputMessageAccountabilityData(): JsonField<String> = inputMessageAccountabilityData

        /** The Fedwire sequence number. */
        @JsonProperty("input_sequence_number")
        @ExcludeMissing
        fun _inputSequenceNumber(): JsonField<String> = inputSequenceNumber

        /** The Fedwire input source identifier. */
        @JsonProperty("input_source")
        @ExcludeMissing
        fun _inputSource(): JsonField<String> = inputSource

        /**
         * The American Banking Association (ABA) routing number of the bank originating the
         * transfer.
         */
        @JsonProperty("originator_routing_number")
        @ExcludeMissing
        fun _originatorRoutingNumber(): JsonField<String> = originatorRoutingNumber

        /** The Fedwire cycle date for the wire transfer that is being reversed by this message. */
        @JsonProperty("previous_message_input_cycle_date")
        @ExcludeMissing
        fun _previousMessageInputCycleDate(): JsonField<LocalDate> = previousMessageInputCycleDate

        /** The Fedwire transaction identifier for the wire transfer that was reversed. */
        @JsonProperty("previous_message_input_message_accountability_data")
        @ExcludeMissing
        fun _previousMessageInputMessageAccountabilityData(): JsonField<String> =
            previousMessageInputMessageAccountabilityData

        /** The Fedwire sequence number for the wire transfer that was reversed. */
        @JsonProperty("previous_message_input_sequence_number")
        @ExcludeMissing
        fun _previousMessageInputSequenceNumber(): JsonField<String> =
            previousMessageInputSequenceNumber

        /** The Fedwire input source identifier for the wire transfer that was reversed. */
        @JsonProperty("previous_message_input_source")
        @ExcludeMissing
        fun _previousMessageInputSource(): JsonField<String> = previousMessageInputSource

        /** Information included in the wire reversal for the receiving financial institution. */
        @JsonProperty("receiver_financial_institution_information")
        @ExcludeMissing
        fun _receiverFinancialInstitutionInformation(): JsonField<String> =
            receiverFinancialInstitutionInformation

        /** The sending bank's reference number for the wire reversal. */
        @JsonProperty("sender_reference")
        @ExcludeMissing
        fun _senderReference(): JsonField<String> = senderReference

        /** The ID for the Transaction associated with the transfer reversal. */
        @JsonProperty("transaction_id")
        @ExcludeMissing
        fun _transactionId(): JsonField<String> = transactionId

        /** The ID for the Wire Transfer that is being reversed. */
        @JsonProperty("wire_transfer_id")
        @ExcludeMissing
        fun _wireTransferId(): JsonField<String> = wireTransferId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Reversal = apply {
            if (validated) {
                return@apply
            }

            amount()
            createdAt()
            description()
            financialInstitutionToFinancialInstitutionInformation()
            inputCycleDate()
            inputMessageAccountabilityData()
            inputSequenceNumber()
            inputSource()
            originatorRoutingNumber()
            previousMessageInputCycleDate()
            previousMessageInputMessageAccountabilityData()
            previousMessageInputSequenceNumber()
            previousMessageInputSource()
            receiverFinancialInstitutionInformation()
            senderReference()
            transactionId()
            wireTransferId()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder internal constructor() {

            private var amount: JsonField<Long>? = null
            private var createdAt: JsonField<OffsetDateTime>? = null
            private var description: JsonField<String>? = null
            private var financialInstitutionToFinancialInstitutionInformation: JsonField<String>? =
                null
            private var inputCycleDate: JsonField<LocalDate>? = null
            private var inputMessageAccountabilityData: JsonField<String>? = null
            private var inputSequenceNumber: JsonField<String>? = null
            private var inputSource: JsonField<String>? = null
            private var originatorRoutingNumber: JsonField<String>? = null
            private var previousMessageInputCycleDate: JsonField<LocalDate>? = null
            private var previousMessageInputMessageAccountabilityData: JsonField<String>? = null
            private var previousMessageInputSequenceNumber: JsonField<String>? = null
            private var previousMessageInputSource: JsonField<String>? = null
            private var receiverFinancialInstitutionInformation: JsonField<String>? = null
            private var senderReference: JsonField<String>? = null
            private var transactionId: JsonField<String>? = null
            private var wireTransferId: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(reversal: Reversal) = apply {
                amount = reversal.amount
                createdAt = reversal.createdAt
                description = reversal.description
                financialInstitutionToFinancialInstitutionInformation =
                    reversal.financialInstitutionToFinancialInstitutionInformation
                inputCycleDate = reversal.inputCycleDate
                inputMessageAccountabilityData = reversal.inputMessageAccountabilityData
                inputSequenceNumber = reversal.inputSequenceNumber
                inputSource = reversal.inputSource
                originatorRoutingNumber = reversal.originatorRoutingNumber
                previousMessageInputCycleDate = reversal.previousMessageInputCycleDate
                previousMessageInputMessageAccountabilityData =
                    reversal.previousMessageInputMessageAccountabilityData
                previousMessageInputSequenceNumber = reversal.previousMessageInputSequenceNumber
                previousMessageInputSource = reversal.previousMessageInputSource
                receiverFinancialInstitutionInformation =
                    reversal.receiverFinancialInstitutionInformation
                senderReference = reversal.senderReference
                transactionId = reversal.transactionId
                wireTransferId = reversal.wireTransferId
                additionalProperties = reversal.additionalProperties.toMutableMap()
            }

            /** The amount that was reversed in USD cents. */
            fun amount(amount: Long) = amount(JsonField.of(amount))

            /** The amount that was reversed in USD cents. */
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * reversal was created.
             */
            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * reversal was created.
             */
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            /** The description on the reversal message from Fedwire, set by the reversing bank. */
            fun description(description: String) = description(JsonField.of(description))

            /** The description on the reversal message from Fedwire, set by the reversing bank. */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /** Additional financial institution information included in the wire reversal. */
            fun financialInstitutionToFinancialInstitutionInformation(
                financialInstitutionToFinancialInstitutionInformation: String?
            ) =
                financialInstitutionToFinancialInstitutionInformation(
                    JsonField.ofNullable(financialInstitutionToFinancialInstitutionInformation)
                )

            /** Additional financial institution information included in the wire reversal. */
            fun financialInstitutionToFinancialInstitutionInformation(
                financialInstitutionToFinancialInstitutionInformation: Optional<String>
            ) =
                financialInstitutionToFinancialInstitutionInformation(
                    financialInstitutionToFinancialInstitutionInformation.orElse(null)
                )

            /** Additional financial institution information included in the wire reversal. */
            fun financialInstitutionToFinancialInstitutionInformation(
                financialInstitutionToFinancialInstitutionInformation: JsonField<String>
            ) = apply {
                this.financialInstitutionToFinancialInstitutionInformation =
                    financialInstitutionToFinancialInstitutionInformation
            }

            /**
             * The Fedwire cycle date for the wire reversal. The "Fedwire day" begins at 9:00 PM
             * Eastern Time on the evening before the `cycle date`.
             */
            fun inputCycleDate(inputCycleDate: LocalDate) =
                inputCycleDate(JsonField.of(inputCycleDate))

            /**
             * The Fedwire cycle date for the wire reversal. The "Fedwire day" begins at 9:00 PM
             * Eastern Time on the evening before the `cycle date`.
             */
            fun inputCycleDate(inputCycleDate: JsonField<LocalDate>) = apply {
                this.inputCycleDate = inputCycleDate
            }

            /** The Fedwire transaction identifier. */
            fun inputMessageAccountabilityData(inputMessageAccountabilityData: String) =
                inputMessageAccountabilityData(JsonField.of(inputMessageAccountabilityData))

            /** The Fedwire transaction identifier. */
            fun inputMessageAccountabilityData(inputMessageAccountabilityData: JsonField<String>) =
                apply {
                    this.inputMessageAccountabilityData = inputMessageAccountabilityData
                }

            /** The Fedwire sequence number. */
            fun inputSequenceNumber(inputSequenceNumber: String) =
                inputSequenceNumber(JsonField.of(inputSequenceNumber))

            /** The Fedwire sequence number. */
            fun inputSequenceNumber(inputSequenceNumber: JsonField<String>) = apply {
                this.inputSequenceNumber = inputSequenceNumber
            }

            /** The Fedwire input source identifier. */
            fun inputSource(inputSource: String) = inputSource(JsonField.of(inputSource))

            /** The Fedwire input source identifier. */
            fun inputSource(inputSource: JsonField<String>) = apply {
                this.inputSource = inputSource
            }

            /**
             * The American Banking Association (ABA) routing number of the bank originating the
             * transfer.
             */
            fun originatorRoutingNumber(originatorRoutingNumber: String?) =
                originatorRoutingNumber(JsonField.ofNullable(originatorRoutingNumber))

            /**
             * The American Banking Association (ABA) routing number of the bank originating the
             * transfer.
             */
            fun originatorRoutingNumber(originatorRoutingNumber: Optional<String>) =
                originatorRoutingNumber(originatorRoutingNumber.orElse(null))

            /**
             * The American Banking Association (ABA) routing number of the bank originating the
             * transfer.
             */
            fun originatorRoutingNumber(originatorRoutingNumber: JsonField<String>) = apply {
                this.originatorRoutingNumber = originatorRoutingNumber
            }

            /**
             * The Fedwire cycle date for the wire transfer that is being reversed by this message.
             */
            fun previousMessageInputCycleDate(previousMessageInputCycleDate: LocalDate) =
                previousMessageInputCycleDate(JsonField.of(previousMessageInputCycleDate))

            /**
             * The Fedwire cycle date for the wire transfer that is being reversed by this message.
             */
            fun previousMessageInputCycleDate(previousMessageInputCycleDate: JsonField<LocalDate>) =
                apply {
                    this.previousMessageInputCycleDate = previousMessageInputCycleDate
                }

            /** The Fedwire transaction identifier for the wire transfer that was reversed. */
            fun previousMessageInputMessageAccountabilityData(
                previousMessageInputMessageAccountabilityData: String
            ) =
                previousMessageInputMessageAccountabilityData(
                    JsonField.of(previousMessageInputMessageAccountabilityData)
                )

            /** The Fedwire transaction identifier for the wire transfer that was reversed. */
            fun previousMessageInputMessageAccountabilityData(
                previousMessageInputMessageAccountabilityData: JsonField<String>
            ) = apply {
                this.previousMessageInputMessageAccountabilityData =
                    previousMessageInputMessageAccountabilityData
            }

            /** The Fedwire sequence number for the wire transfer that was reversed. */
            fun previousMessageInputSequenceNumber(previousMessageInputSequenceNumber: String) =
                previousMessageInputSequenceNumber(JsonField.of(previousMessageInputSequenceNumber))

            /** The Fedwire sequence number for the wire transfer that was reversed. */
            fun previousMessageInputSequenceNumber(
                previousMessageInputSequenceNumber: JsonField<String>
            ) = apply {
                this.previousMessageInputSequenceNumber = previousMessageInputSequenceNumber
            }

            /** The Fedwire input source identifier for the wire transfer that was reversed. */
            fun previousMessageInputSource(previousMessageInputSource: String) =
                previousMessageInputSource(JsonField.of(previousMessageInputSource))

            /** The Fedwire input source identifier for the wire transfer that was reversed. */
            fun previousMessageInputSource(previousMessageInputSource: JsonField<String>) = apply {
                this.previousMessageInputSource = previousMessageInputSource
            }

            /**
             * Information included in the wire reversal for the receiving financial institution.
             */
            fun receiverFinancialInstitutionInformation(
                receiverFinancialInstitutionInformation: String?
            ) =
                receiverFinancialInstitutionInformation(
                    JsonField.ofNullable(receiverFinancialInstitutionInformation)
                )

            /**
             * Information included in the wire reversal for the receiving financial institution.
             */
            fun receiverFinancialInstitutionInformation(
                receiverFinancialInstitutionInformation: Optional<String>
            ) =
                receiverFinancialInstitutionInformation(
                    receiverFinancialInstitutionInformation.orElse(null)
                )

            /**
             * Information included in the wire reversal for the receiving financial institution.
             */
            fun receiverFinancialInstitutionInformation(
                receiverFinancialInstitutionInformation: JsonField<String>
            ) = apply {
                this.receiverFinancialInstitutionInformation =
                    receiverFinancialInstitutionInformation
            }

            /** The sending bank's reference number for the wire reversal. */
            fun senderReference(senderReference: String?) =
                senderReference(JsonField.ofNullable(senderReference))

            /** The sending bank's reference number for the wire reversal. */
            fun senderReference(senderReference: Optional<String>) =
                senderReference(senderReference.orElse(null))

            /** The sending bank's reference number for the wire reversal. */
            fun senderReference(senderReference: JsonField<String>) = apply {
                this.senderReference = senderReference
            }

            /** The ID for the Transaction associated with the transfer reversal. */
            fun transactionId(transactionId: String) = transactionId(JsonField.of(transactionId))

            /** The ID for the Transaction associated with the transfer reversal. */
            fun transactionId(transactionId: JsonField<String>) = apply {
                this.transactionId = transactionId
            }

            /** The ID for the Wire Transfer that is being reversed. */
            fun wireTransferId(wireTransferId: String) =
                wireTransferId(JsonField.of(wireTransferId))

            /** The ID for the Wire Transfer that is being reversed. */
            fun wireTransferId(wireTransferId: JsonField<String>) = apply {
                this.wireTransferId = wireTransferId
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

            fun build(): Reversal =
                Reversal(
                    checkRequired("amount", amount),
                    checkRequired("createdAt", createdAt),
                    checkRequired("description", description),
                    checkRequired(
                        "financialInstitutionToFinancialInstitutionInformation",
                        financialInstitutionToFinancialInstitutionInformation
                    ),
                    checkRequired("inputCycleDate", inputCycleDate),
                    checkRequired("inputMessageAccountabilityData", inputMessageAccountabilityData),
                    checkRequired("inputSequenceNumber", inputSequenceNumber),
                    checkRequired("inputSource", inputSource),
                    checkRequired("originatorRoutingNumber", originatorRoutingNumber),
                    checkRequired("previousMessageInputCycleDate", previousMessageInputCycleDate),
                    checkRequired(
                        "previousMessageInputMessageAccountabilityData",
                        previousMessageInputMessageAccountabilityData
                    ),
                    checkRequired(
                        "previousMessageInputSequenceNumber",
                        previousMessageInputSequenceNumber
                    ),
                    checkRequired("previousMessageInputSource", previousMessageInputSource),
                    checkRequired(
                        "receiverFinancialInstitutionInformation",
                        receiverFinancialInstitutionInformation
                    ),
                    checkRequired("senderReference", senderReference),
                    checkRequired("transactionId", transactionId),
                    checkRequired("wireTransferId", wireTransferId),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Reversal && amount == other.amount && createdAt == other.createdAt && description == other.description && financialInstitutionToFinancialInstitutionInformation == other.financialInstitutionToFinancialInstitutionInformation && inputCycleDate == other.inputCycleDate && inputMessageAccountabilityData == other.inputMessageAccountabilityData && inputSequenceNumber == other.inputSequenceNumber && inputSource == other.inputSource && originatorRoutingNumber == other.originatorRoutingNumber && previousMessageInputCycleDate == other.previousMessageInputCycleDate && previousMessageInputMessageAccountabilityData == other.previousMessageInputMessageAccountabilityData && previousMessageInputSequenceNumber == other.previousMessageInputSequenceNumber && previousMessageInputSource == other.previousMessageInputSource && receiverFinancialInstitutionInformation == other.receiverFinancialInstitutionInformation && senderReference == other.senderReference && transactionId == other.transactionId && wireTransferId == other.wireTransferId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(amount, createdAt, description, financialInstitutionToFinancialInstitutionInformation, inputCycleDate, inputMessageAccountabilityData, inputSequenceNumber, inputSource, originatorRoutingNumber, previousMessageInputCycleDate, previousMessageInputMessageAccountabilityData, previousMessageInputSequenceNumber, previousMessageInputSource, receiverFinancialInstitutionInformation, senderReference, transactionId, wireTransferId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Reversal{amount=$amount, createdAt=$createdAt, description=$description, financialInstitutionToFinancialInstitutionInformation=$financialInstitutionToFinancialInstitutionInformation, inputCycleDate=$inputCycleDate, inputMessageAccountabilityData=$inputMessageAccountabilityData, inputSequenceNumber=$inputSequenceNumber, inputSource=$inputSource, originatorRoutingNumber=$originatorRoutingNumber, previousMessageInputCycleDate=$previousMessageInputCycleDate, previousMessageInputMessageAccountabilityData=$previousMessageInputMessageAccountabilityData, previousMessageInputSequenceNumber=$previousMessageInputSequenceNumber, previousMessageInputSource=$previousMessageInputSource, receiverFinancialInstitutionInformation=$receiverFinancialInstitutionInformation, senderReference=$senderReference, transactionId=$transactionId, wireTransferId=$wireTransferId, additionalProperties=$additionalProperties}"
    }

    /** The lifecycle status of the transfer. */
    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            /** The transfer is pending approval. */
            @JvmField val PENDING_APPROVAL = of("pending_approval")

            /** The transfer has been canceled. */
            @JvmField val CANCELED = of("canceled")

            /** The transfer is pending review by Increase. */
            @JvmField val PENDING_REVIEWING = of("pending_reviewing")

            /** The transfer has been rejected by Increase. */
            @JvmField val REJECTED = of("rejected")

            /** The transfer requires attention from an Increase operator. */
            @JvmField val REQUIRES_ATTENTION = of("requires_attention")

            /** The transfer is pending creation. */
            @JvmField val PENDING_CREATING = of("pending_creating")

            /** The transfer has been reversed. */
            @JvmField val REVERSED = of("reversed")

            /** The transfer has been submitted to Fedwire. */
            @JvmField val SUBMITTED = of("submitted")

            /** The transfer has been acknowledged by Fedwire and can be considered complete. */
            @JvmField val COMPLETE = of("complete")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            /** The transfer is pending approval. */
            PENDING_APPROVAL,
            /** The transfer has been canceled. */
            CANCELED,
            /** The transfer is pending review by Increase. */
            PENDING_REVIEWING,
            /** The transfer has been rejected by Increase. */
            REJECTED,
            /** The transfer requires attention from an Increase operator. */
            REQUIRES_ATTENTION,
            /** The transfer is pending creation. */
            PENDING_CREATING,
            /** The transfer has been reversed. */
            REVERSED,
            /** The transfer has been submitted to Fedwire. */
            SUBMITTED,
            /** The transfer has been acknowledged by Fedwire and can be considered complete. */
            COMPLETE,
        }

        enum class Value {
            /** The transfer is pending approval. */
            PENDING_APPROVAL,
            /** The transfer has been canceled. */
            CANCELED,
            /** The transfer is pending review by Increase. */
            PENDING_REVIEWING,
            /** The transfer has been rejected by Increase. */
            REJECTED,
            /** The transfer requires attention from an Increase operator. */
            REQUIRES_ATTENTION,
            /** The transfer is pending creation. */
            PENDING_CREATING,
            /** The transfer has been reversed. */
            REVERSED,
            /** The transfer has been submitted to Fedwire. */
            SUBMITTED,
            /** The transfer has been acknowledged by Fedwire and can be considered complete. */
            COMPLETE,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                PENDING_APPROVAL -> Value.PENDING_APPROVAL
                CANCELED -> Value.CANCELED
                PENDING_REVIEWING -> Value.PENDING_REVIEWING
                REJECTED -> Value.REJECTED
                REQUIRES_ATTENTION -> Value.REQUIRES_ATTENTION
                PENDING_CREATING -> Value.PENDING_CREATING
                REVERSED -> Value.REVERSED
                SUBMITTED -> Value.SUBMITTED
                COMPLETE -> Value.COMPLETE
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                PENDING_APPROVAL -> Known.PENDING_APPROVAL
                CANCELED -> Known.CANCELED
                PENDING_REVIEWING -> Known.PENDING_REVIEWING
                REJECTED -> Known.REJECTED
                REQUIRES_ATTENTION -> Known.REQUIRES_ATTENTION
                PENDING_CREATING -> Known.PENDING_CREATING
                REVERSED -> Known.REVERSED
                SUBMITTED -> Known.SUBMITTED
                COMPLETE -> Known.COMPLETE
                else -> throw IncreaseInvalidDataException("Unknown Status: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Status && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** After the transfer is submitted to Fedwire, this will contain supplemental details. */
    @NoAutoDetect
    class Submission
    @JsonCreator
    private constructor(
        @JsonProperty("input_message_accountability_data")
        @ExcludeMissing
        private val inputMessageAccountabilityData: JsonField<String> = JsonMissing.of(),
        @JsonProperty("submitted_at")
        @ExcludeMissing
        private val submittedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The accountability data for the submission. */
        fun inputMessageAccountabilityData(): String =
            inputMessageAccountabilityData.getRequired("input_message_accountability_data")

        /** When this wire transfer was submitted to Fedwire. */
        fun submittedAt(): OffsetDateTime = submittedAt.getRequired("submitted_at")

        /** The accountability data for the submission. */
        @JsonProperty("input_message_accountability_data")
        @ExcludeMissing
        fun _inputMessageAccountabilityData(): JsonField<String> = inputMessageAccountabilityData

        /** When this wire transfer was submitted to Fedwire. */
        @JsonProperty("submitted_at")
        @ExcludeMissing
        fun _submittedAt(): JsonField<OffsetDateTime> = submittedAt

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Submission = apply {
            if (validated) {
                return@apply
            }

            inputMessageAccountabilityData()
            submittedAt()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder internal constructor() {

            private var inputMessageAccountabilityData: JsonField<String>? = null
            private var submittedAt: JsonField<OffsetDateTime>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(submission: Submission) = apply {
                inputMessageAccountabilityData = submission.inputMessageAccountabilityData
                submittedAt = submission.submittedAt
                additionalProperties = submission.additionalProperties.toMutableMap()
            }

            /** The accountability data for the submission. */
            fun inputMessageAccountabilityData(inputMessageAccountabilityData: String) =
                inputMessageAccountabilityData(JsonField.of(inputMessageAccountabilityData))

            /** The accountability data for the submission. */
            fun inputMessageAccountabilityData(inputMessageAccountabilityData: JsonField<String>) =
                apply {
                    this.inputMessageAccountabilityData = inputMessageAccountabilityData
                }

            /** When this wire transfer was submitted to Fedwire. */
            fun submittedAt(submittedAt: OffsetDateTime) = submittedAt(JsonField.of(submittedAt))

            /** When this wire transfer was submitted to Fedwire. */
            fun submittedAt(submittedAt: JsonField<OffsetDateTime>) = apply {
                this.submittedAt = submittedAt
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

            fun build(): Submission =
                Submission(
                    checkRequired("inputMessageAccountabilityData", inputMessageAccountabilityData),
                    checkRequired("submittedAt", submittedAt),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Submission && inputMessageAccountabilityData == other.inputMessageAccountabilityData && submittedAt == other.submittedAt && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(inputMessageAccountabilityData, submittedAt, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Submission{inputMessageAccountabilityData=$inputMessageAccountabilityData, submittedAt=$submittedAt, additionalProperties=$additionalProperties}"
    }

    /**
     * A constant representing the object's type. For this resource it will always be
     * `wire_transfer`.
     */
    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val WIRE_TRANSFER = of("wire_transfer")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            WIRE_TRANSFER,
        }

        enum class Value {
            WIRE_TRANSFER,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                WIRE_TRANSFER -> Value.WIRE_TRANSFER
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                WIRE_TRANSFER -> Known.WIRE_TRANSFER
                else -> throw IncreaseInvalidDataException("Unknown Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Type && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is WireTransfer && id == other.id && accountId == other.accountId && accountNumber == other.accountNumber && amount == other.amount && approval == other.approval && beneficiaryAddressLine1 == other.beneficiaryAddressLine1 && beneficiaryAddressLine2 == other.beneficiaryAddressLine2 && beneficiaryAddressLine3 == other.beneficiaryAddressLine3 && beneficiaryName == other.beneficiaryName && cancellation == other.cancellation && createdAt == other.createdAt && createdBy == other.createdBy && currency == other.currency && externalAccountId == other.externalAccountId && idempotencyKey == other.idempotencyKey && messageToRecipient == other.messageToRecipient && network == other.network && originatorAddressLine1 == other.originatorAddressLine1 && originatorAddressLine2 == other.originatorAddressLine2 && originatorAddressLine3 == other.originatorAddressLine3 && originatorName == other.originatorName && pendingTransactionId == other.pendingTransactionId && reversal == other.reversal && routingNumber == other.routingNumber && sourceAccountNumberId == other.sourceAccountNumberId && status == other.status && submission == other.submission && transactionId == other.transactionId && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, accountId, accountNumber, amount, approval, beneficiaryAddressLine1, beneficiaryAddressLine2, beneficiaryAddressLine3, beneficiaryName, cancellation, createdAt, createdBy, currency, externalAccountId, idempotencyKey, messageToRecipient, network, originatorAddressLine1, originatorAddressLine2, originatorAddressLine3, originatorName, pendingTransactionId, reversal, routingNumber, sourceAccountNumberId, status, submission, transactionId, type, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "WireTransfer{id=$id, accountId=$accountId, accountNumber=$accountNumber, amount=$amount, approval=$approval, beneficiaryAddressLine1=$beneficiaryAddressLine1, beneficiaryAddressLine2=$beneficiaryAddressLine2, beneficiaryAddressLine3=$beneficiaryAddressLine3, beneficiaryName=$beneficiaryName, cancellation=$cancellation, createdAt=$createdAt, createdBy=$createdBy, currency=$currency, externalAccountId=$externalAccountId, idempotencyKey=$idempotencyKey, messageToRecipient=$messageToRecipient, network=$network, originatorAddressLine1=$originatorAddressLine1, originatorAddressLine2=$originatorAddressLine2, originatorAddressLine3=$originatorAddressLine3, originatorName=$originatorName, pendingTransactionId=$pendingTransactionId, reversal=$reversal, routingNumber=$routingNumber, sourceAccountNumberId=$sourceAccountNumberId, status=$status, submission=$submission, transactionId=$transactionId, type=$type, additionalProperties=$additionalProperties}"
}
