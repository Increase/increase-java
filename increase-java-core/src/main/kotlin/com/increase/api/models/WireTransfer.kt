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
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.toUnmodifiable
import com.increase.api.errors.IncreaseInvalidDataException
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

/**
 * Wire transfers move funds between your Increase account and any other account accessible by
 * Fedwire.
 */
@JsonDeserialize(builder = WireTransfer.Builder::class)
@NoAutoDetect
class WireTransfer
private constructor(
    private val accountId: JsonField<String>,
    private val accountNumber: JsonField<String>,
    private val amount: JsonField<Long>,
    private val approval: JsonField<Approval>,
    private val beneficiaryAddressLine1: JsonField<String>,
    private val beneficiaryAddressLine2: JsonField<String>,
    private val beneficiaryAddressLine3: JsonField<String>,
    private val beneficiaryName: JsonField<String>,
    private val cancellation: JsonField<Cancellation>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<CreatedBy>,
    private val currency: JsonField<Currency>,
    private val externalAccountId: JsonField<String>,
    private val id: JsonField<String>,
    private val idempotencyKey: JsonField<String>,
    private val messageToRecipient: JsonField<String>,
    private val network: JsonField<Network>,
    private val originatorAddressLine1: JsonField<String>,
    private val originatorAddressLine2: JsonField<String>,
    private val originatorAddressLine3: JsonField<String>,
    private val originatorName: JsonField<String>,
    private val pendingTransactionId: JsonField<String>,
    private val reversal: JsonField<Reversal>,
    private val routingNumber: JsonField<String>,
    private val status: JsonField<Status>,
    private val submission: JsonField<Submission>,
    private val transactionId: JsonField<String>,
    private val type: JsonField<Type>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

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

    /** The wire transfer's identifier. */
    fun id(): String = id.getRequired("id")

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

    /** The Account to which the transfer belongs. */
    @JsonProperty("account_id") @ExcludeMissing fun _accountId() = accountId

    /** The destination account number. */
    @JsonProperty("account_number") @ExcludeMissing fun _accountNumber() = accountNumber

    /** The transfer amount in USD cents. */
    @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

    /**
     * If your account requires approvals for transfers and the transfer was approved, this will
     * contain details of the approval.
     */
    @JsonProperty("approval") @ExcludeMissing fun _approval() = approval

    /** The beneficiary's address line 1. */
    @JsonProperty("beneficiary_address_line1")
    @ExcludeMissing
    fun _beneficiaryAddressLine1() = beneficiaryAddressLine1

    /** The beneficiary's address line 2. */
    @JsonProperty("beneficiary_address_line2")
    @ExcludeMissing
    fun _beneficiaryAddressLine2() = beneficiaryAddressLine2

    /** The beneficiary's address line 3. */
    @JsonProperty("beneficiary_address_line3")
    @ExcludeMissing
    fun _beneficiaryAddressLine3() = beneficiaryAddressLine3

    /** The beneficiary's name. */
    @JsonProperty("beneficiary_name") @ExcludeMissing fun _beneficiaryName() = beneficiaryName

    /**
     * If your account requires approvals for transfers and the transfer was not approved, this will
     * contain details of the cancellation.
     */
    @JsonProperty("cancellation") @ExcludeMissing fun _cancellation() = cancellation

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the transfer
     * was created.
     */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    /** What object created the transfer, either via the API or the dashboard. */
    @JsonProperty("created_by") @ExcludeMissing fun _createdBy() = createdBy

    /**
     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transfer's currency. For
     * wire transfers this is always equal to `usd`.
     */
    @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

    /** The identifier of the External Account the transfer was made to, if any. */
    @JsonProperty("external_account_id")
    @ExcludeMissing
    fun _externalAccountId() = externalAccountId

    /** The wire transfer's identifier. */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /**
     * The idempotency key you chose for this object. This value is unique across Increase and is
     * used to ensure that a request is only processed once. Learn more about
     * [idempotency](https://increase.com/documentation/idempotency-keys).
     */
    @JsonProperty("idempotency_key") @ExcludeMissing fun _idempotencyKey() = idempotencyKey

    /** The message that will show on the recipient's bank statement. */
    @JsonProperty("message_to_recipient")
    @ExcludeMissing
    fun _messageToRecipient() = messageToRecipient

    /** The transfer's network. */
    @JsonProperty("network") @ExcludeMissing fun _network() = network

    /** The originator's address line 1. */
    @JsonProperty("originator_address_line1")
    @ExcludeMissing
    fun _originatorAddressLine1() = originatorAddressLine1

    /** The originator's address line 2. */
    @JsonProperty("originator_address_line2")
    @ExcludeMissing
    fun _originatorAddressLine2() = originatorAddressLine2

    /** The originator's address line 3. */
    @JsonProperty("originator_address_line3")
    @ExcludeMissing
    fun _originatorAddressLine3() = originatorAddressLine3

    /** The originator's name. */
    @JsonProperty("originator_name") @ExcludeMissing fun _originatorName() = originatorName

    /**
     * The ID for the pending transaction representing the transfer. A pending transaction is
     * created when the transfer
     * [requires approval](https://increase.com/documentation/transfer-approvals#transfer-approvals)
     * by someone else in your organization.
     */
    @JsonProperty("pending_transaction_id")
    @ExcludeMissing
    fun _pendingTransactionId() = pendingTransactionId

    /** If your transfer is reversed, this will contain details of the reversal. */
    @JsonProperty("reversal") @ExcludeMissing fun _reversal() = reversal

    /** The American Bankers' Association (ABA) Routing Transit Number (RTN). */
    @JsonProperty("routing_number") @ExcludeMissing fun _routingNumber() = routingNumber

    /** The lifecycle status of the transfer. */
    @JsonProperty("status") @ExcludeMissing fun _status() = status

    /** After the transfer is submitted to Fedwire, this will contain supplemental details. */
    @JsonProperty("submission") @ExcludeMissing fun _submission() = submission

    /** The ID for the transaction funding the transfer. */
    @JsonProperty("transaction_id") @ExcludeMissing fun _transactionId() = transactionId

    /**
     * A constant representing the object's type. For this resource it will always be
     * `wire_transfer`.
     */
    @JsonProperty("type") @ExcludeMissing fun _type() = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): WireTransfer = apply {
        if (!validated) {
            accountId()
            accountNumber()
            amount()
            approval().map { it.validate() }
            beneficiaryAddressLine1()
            beneficiaryAddressLine2()
            beneficiaryAddressLine3()
            beneficiaryName()
            cancellation().map { it.validate() }
            createdAt()
            createdBy().map { it.validate() }
            currency()
            externalAccountId()
            id()
            idempotencyKey()
            messageToRecipient()
            network()
            originatorAddressLine1()
            originatorAddressLine2()
            originatorAddressLine3()
            originatorName()
            pendingTransactionId()
            reversal().map { it.validate() }
            routingNumber()
            status()
            submission().map { it.validate() }
            transactionId()
            type()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is WireTransfer &&
            this.accountId == other.accountId &&
            this.accountNumber == other.accountNumber &&
            this.amount == other.amount &&
            this.approval == other.approval &&
            this.beneficiaryAddressLine1 == other.beneficiaryAddressLine1 &&
            this.beneficiaryAddressLine2 == other.beneficiaryAddressLine2 &&
            this.beneficiaryAddressLine3 == other.beneficiaryAddressLine3 &&
            this.beneficiaryName == other.beneficiaryName &&
            this.cancellation == other.cancellation &&
            this.createdAt == other.createdAt &&
            this.createdBy == other.createdBy &&
            this.currency == other.currency &&
            this.externalAccountId == other.externalAccountId &&
            this.id == other.id &&
            this.idempotencyKey == other.idempotencyKey &&
            this.messageToRecipient == other.messageToRecipient &&
            this.network == other.network &&
            this.originatorAddressLine1 == other.originatorAddressLine1 &&
            this.originatorAddressLine2 == other.originatorAddressLine2 &&
            this.originatorAddressLine3 == other.originatorAddressLine3 &&
            this.originatorName == other.originatorName &&
            this.pendingTransactionId == other.pendingTransactionId &&
            this.reversal == other.reversal &&
            this.routingNumber == other.routingNumber &&
            this.status == other.status &&
            this.submission == other.submission &&
            this.transactionId == other.transactionId &&
            this.type == other.type &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    accountId,
                    accountNumber,
                    amount,
                    approval,
                    beneficiaryAddressLine1,
                    beneficiaryAddressLine2,
                    beneficiaryAddressLine3,
                    beneficiaryName,
                    cancellation,
                    createdAt,
                    createdBy,
                    currency,
                    externalAccountId,
                    id,
                    idempotencyKey,
                    messageToRecipient,
                    network,
                    originatorAddressLine1,
                    originatorAddressLine2,
                    originatorAddressLine3,
                    originatorName,
                    pendingTransactionId,
                    reversal,
                    routingNumber,
                    status,
                    submission,
                    transactionId,
                    type,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "WireTransfer{accountId=$accountId, accountNumber=$accountNumber, amount=$amount, approval=$approval, beneficiaryAddressLine1=$beneficiaryAddressLine1, beneficiaryAddressLine2=$beneficiaryAddressLine2, beneficiaryAddressLine3=$beneficiaryAddressLine3, beneficiaryName=$beneficiaryName, cancellation=$cancellation, createdAt=$createdAt, createdBy=$createdBy, currency=$currency, externalAccountId=$externalAccountId, id=$id, idempotencyKey=$idempotencyKey, messageToRecipient=$messageToRecipient, network=$network, originatorAddressLine1=$originatorAddressLine1, originatorAddressLine2=$originatorAddressLine2, originatorAddressLine3=$originatorAddressLine3, originatorName=$originatorName, pendingTransactionId=$pendingTransactionId, reversal=$reversal, routingNumber=$routingNumber, status=$status, submission=$submission, transactionId=$transactionId, type=$type, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var accountId: JsonField<String> = JsonMissing.of()
        private var accountNumber: JsonField<String> = JsonMissing.of()
        private var amount: JsonField<Long> = JsonMissing.of()
        private var approval: JsonField<Approval> = JsonMissing.of()
        private var beneficiaryAddressLine1: JsonField<String> = JsonMissing.of()
        private var beneficiaryAddressLine2: JsonField<String> = JsonMissing.of()
        private var beneficiaryAddressLine3: JsonField<String> = JsonMissing.of()
        private var beneficiaryName: JsonField<String> = JsonMissing.of()
        private var cancellation: JsonField<Cancellation> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdBy: JsonField<CreatedBy> = JsonMissing.of()
        private var currency: JsonField<Currency> = JsonMissing.of()
        private var externalAccountId: JsonField<String> = JsonMissing.of()
        private var id: JsonField<String> = JsonMissing.of()
        private var idempotencyKey: JsonField<String> = JsonMissing.of()
        private var messageToRecipient: JsonField<String> = JsonMissing.of()
        private var network: JsonField<Network> = JsonMissing.of()
        private var originatorAddressLine1: JsonField<String> = JsonMissing.of()
        private var originatorAddressLine2: JsonField<String> = JsonMissing.of()
        private var originatorAddressLine3: JsonField<String> = JsonMissing.of()
        private var originatorName: JsonField<String> = JsonMissing.of()
        private var pendingTransactionId: JsonField<String> = JsonMissing.of()
        private var reversal: JsonField<Reversal> = JsonMissing.of()
        private var routingNumber: JsonField<String> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var submission: JsonField<Submission> = JsonMissing.of()
        private var transactionId: JsonField<String> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(wireTransfer: WireTransfer) = apply {
            this.accountId = wireTransfer.accountId
            this.accountNumber = wireTransfer.accountNumber
            this.amount = wireTransfer.amount
            this.approval = wireTransfer.approval
            this.beneficiaryAddressLine1 = wireTransfer.beneficiaryAddressLine1
            this.beneficiaryAddressLine2 = wireTransfer.beneficiaryAddressLine2
            this.beneficiaryAddressLine3 = wireTransfer.beneficiaryAddressLine3
            this.beneficiaryName = wireTransfer.beneficiaryName
            this.cancellation = wireTransfer.cancellation
            this.createdAt = wireTransfer.createdAt
            this.createdBy = wireTransfer.createdBy
            this.currency = wireTransfer.currency
            this.externalAccountId = wireTransfer.externalAccountId
            this.id = wireTransfer.id
            this.idempotencyKey = wireTransfer.idempotencyKey
            this.messageToRecipient = wireTransfer.messageToRecipient
            this.network = wireTransfer.network
            this.originatorAddressLine1 = wireTransfer.originatorAddressLine1
            this.originatorAddressLine2 = wireTransfer.originatorAddressLine2
            this.originatorAddressLine3 = wireTransfer.originatorAddressLine3
            this.originatorName = wireTransfer.originatorName
            this.pendingTransactionId = wireTransfer.pendingTransactionId
            this.reversal = wireTransfer.reversal
            this.routingNumber = wireTransfer.routingNumber
            this.status = wireTransfer.status
            this.submission = wireTransfer.submission
            this.transactionId = wireTransfer.transactionId
            this.type = wireTransfer.type
            additionalProperties(wireTransfer.additionalProperties)
        }

        /** The Account to which the transfer belongs. */
        fun accountId(accountId: String) = accountId(JsonField.of(accountId))

        /** The Account to which the transfer belongs. */
        @JsonProperty("account_id")
        @ExcludeMissing
        fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

        /** The destination account number. */
        fun accountNumber(accountNumber: String) = accountNumber(JsonField.of(accountNumber))

        /** The destination account number. */
        @JsonProperty("account_number")
        @ExcludeMissing
        fun accountNumber(accountNumber: JsonField<String>) = apply {
            this.accountNumber = accountNumber
        }

        /** The transfer amount in USD cents. */
        fun amount(amount: Long) = amount(JsonField.of(amount))

        /** The transfer amount in USD cents. */
        @JsonProperty("amount")
        @ExcludeMissing
        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

        /**
         * If your account requires approvals for transfers and the transfer was approved, this will
         * contain details of the approval.
         */
        fun approval(approval: Approval) = approval(JsonField.of(approval))

        /**
         * If your account requires approvals for transfers and the transfer was approved, this will
         * contain details of the approval.
         */
        @JsonProperty("approval")
        @ExcludeMissing
        fun approval(approval: JsonField<Approval>) = apply { this.approval = approval }

        /** The beneficiary's address line 1. */
        fun beneficiaryAddressLine1(beneficiaryAddressLine1: String) =
            beneficiaryAddressLine1(JsonField.of(beneficiaryAddressLine1))

        /** The beneficiary's address line 1. */
        @JsonProperty("beneficiary_address_line1")
        @ExcludeMissing
        fun beneficiaryAddressLine1(beneficiaryAddressLine1: JsonField<String>) = apply {
            this.beneficiaryAddressLine1 = beneficiaryAddressLine1
        }

        /** The beneficiary's address line 2. */
        fun beneficiaryAddressLine2(beneficiaryAddressLine2: String) =
            beneficiaryAddressLine2(JsonField.of(beneficiaryAddressLine2))

        /** The beneficiary's address line 2. */
        @JsonProperty("beneficiary_address_line2")
        @ExcludeMissing
        fun beneficiaryAddressLine2(beneficiaryAddressLine2: JsonField<String>) = apply {
            this.beneficiaryAddressLine2 = beneficiaryAddressLine2
        }

        /** The beneficiary's address line 3. */
        fun beneficiaryAddressLine3(beneficiaryAddressLine3: String) =
            beneficiaryAddressLine3(JsonField.of(beneficiaryAddressLine3))

        /** The beneficiary's address line 3. */
        @JsonProperty("beneficiary_address_line3")
        @ExcludeMissing
        fun beneficiaryAddressLine3(beneficiaryAddressLine3: JsonField<String>) = apply {
            this.beneficiaryAddressLine3 = beneficiaryAddressLine3
        }

        /** The beneficiary's name. */
        fun beneficiaryName(beneficiaryName: String) =
            beneficiaryName(JsonField.of(beneficiaryName))

        /** The beneficiary's name. */
        @JsonProperty("beneficiary_name")
        @ExcludeMissing
        fun beneficiaryName(beneficiaryName: JsonField<String>) = apply {
            this.beneficiaryName = beneficiaryName
        }

        /**
         * If your account requires approvals for transfers and the transfer was not approved, this
         * will contain details of the cancellation.
         */
        fun cancellation(cancellation: Cancellation) = cancellation(JsonField.of(cancellation))

        /**
         * If your account requires approvals for transfers and the transfer was not approved, this
         * will contain details of the cancellation.
         */
        @JsonProperty("cancellation")
        @ExcludeMissing
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
        @JsonProperty("created_at")
        @ExcludeMissing
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** What object created the transfer, either via the API or the dashboard. */
        fun createdBy(createdBy: CreatedBy) = createdBy(JsonField.of(createdBy))

        /** What object created the transfer, either via the API or the dashboard. */
        @JsonProperty("created_by")
        @ExcludeMissing
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
        @JsonProperty("currency")
        @ExcludeMissing
        fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

        /** The identifier of the External Account the transfer was made to, if any. */
        fun externalAccountId(externalAccountId: String) =
            externalAccountId(JsonField.of(externalAccountId))

        /** The identifier of the External Account the transfer was made to, if any. */
        @JsonProperty("external_account_id")
        @ExcludeMissing
        fun externalAccountId(externalAccountId: JsonField<String>) = apply {
            this.externalAccountId = externalAccountId
        }

        /** The wire transfer's identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The wire transfer's identifier. */
        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * The idempotency key you chose for this object. This value is unique across Increase and
         * is used to ensure that a request is only processed once. Learn more about
         * [idempotency](https://increase.com/documentation/idempotency-keys).
         */
        fun idempotencyKey(idempotencyKey: String) = idempotencyKey(JsonField.of(idempotencyKey))

        /**
         * The idempotency key you chose for this object. This value is unique across Increase and
         * is used to ensure that a request is only processed once. Learn more about
         * [idempotency](https://increase.com/documentation/idempotency-keys).
         */
        @JsonProperty("idempotency_key")
        @ExcludeMissing
        fun idempotencyKey(idempotencyKey: JsonField<String>) = apply {
            this.idempotencyKey = idempotencyKey
        }

        /** The message that will show on the recipient's bank statement. */
        fun messageToRecipient(messageToRecipient: String) =
            messageToRecipient(JsonField.of(messageToRecipient))

        /** The message that will show on the recipient's bank statement. */
        @JsonProperty("message_to_recipient")
        @ExcludeMissing
        fun messageToRecipient(messageToRecipient: JsonField<String>) = apply {
            this.messageToRecipient = messageToRecipient
        }

        /** The transfer's network. */
        fun network(network: Network) = network(JsonField.of(network))

        /** The transfer's network. */
        @JsonProperty("network")
        @ExcludeMissing
        fun network(network: JsonField<Network>) = apply { this.network = network }

        /** The originator's address line 1. */
        fun originatorAddressLine1(originatorAddressLine1: String) =
            originatorAddressLine1(JsonField.of(originatorAddressLine1))

        /** The originator's address line 1. */
        @JsonProperty("originator_address_line1")
        @ExcludeMissing
        fun originatorAddressLine1(originatorAddressLine1: JsonField<String>) = apply {
            this.originatorAddressLine1 = originatorAddressLine1
        }

        /** The originator's address line 2. */
        fun originatorAddressLine2(originatorAddressLine2: String) =
            originatorAddressLine2(JsonField.of(originatorAddressLine2))

        /** The originator's address line 2. */
        @JsonProperty("originator_address_line2")
        @ExcludeMissing
        fun originatorAddressLine2(originatorAddressLine2: JsonField<String>) = apply {
            this.originatorAddressLine2 = originatorAddressLine2
        }

        /** The originator's address line 3. */
        fun originatorAddressLine3(originatorAddressLine3: String) =
            originatorAddressLine3(JsonField.of(originatorAddressLine3))

        /** The originator's address line 3. */
        @JsonProperty("originator_address_line3")
        @ExcludeMissing
        fun originatorAddressLine3(originatorAddressLine3: JsonField<String>) = apply {
            this.originatorAddressLine3 = originatorAddressLine3
        }

        /** The originator's name. */
        fun originatorName(originatorName: String) = originatorName(JsonField.of(originatorName))

        /** The originator's name. */
        @JsonProperty("originator_name")
        @ExcludeMissing
        fun originatorName(originatorName: JsonField<String>) = apply {
            this.originatorName = originatorName
        }

        /**
         * The ID for the pending transaction representing the transfer. A pending transaction is
         * created when the transfer
         * [requires approval](https://increase.com/documentation/transfer-approvals#transfer-approvals)
         * by someone else in your organization.
         */
        fun pendingTransactionId(pendingTransactionId: String) =
            pendingTransactionId(JsonField.of(pendingTransactionId))

        /**
         * The ID for the pending transaction representing the transfer. A pending transaction is
         * created when the transfer
         * [requires approval](https://increase.com/documentation/transfer-approvals#transfer-approvals)
         * by someone else in your organization.
         */
        @JsonProperty("pending_transaction_id")
        @ExcludeMissing
        fun pendingTransactionId(pendingTransactionId: JsonField<String>) = apply {
            this.pendingTransactionId = pendingTransactionId
        }

        /** If your transfer is reversed, this will contain details of the reversal. */
        fun reversal(reversal: Reversal) = reversal(JsonField.of(reversal))

        /** If your transfer is reversed, this will contain details of the reversal. */
        @JsonProperty("reversal")
        @ExcludeMissing
        fun reversal(reversal: JsonField<Reversal>) = apply { this.reversal = reversal }

        /** The American Bankers' Association (ABA) Routing Transit Number (RTN). */
        fun routingNumber(routingNumber: String) = routingNumber(JsonField.of(routingNumber))

        /** The American Bankers' Association (ABA) Routing Transit Number (RTN). */
        @JsonProperty("routing_number")
        @ExcludeMissing
        fun routingNumber(routingNumber: JsonField<String>) = apply {
            this.routingNumber = routingNumber
        }

        /** The lifecycle status of the transfer. */
        fun status(status: Status) = status(JsonField.of(status))

        /** The lifecycle status of the transfer. */
        @JsonProperty("status")
        @ExcludeMissing
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** After the transfer is submitted to Fedwire, this will contain supplemental details. */
        fun submission(submission: Submission) = submission(JsonField.of(submission))

        /** After the transfer is submitted to Fedwire, this will contain supplemental details. */
        @JsonProperty("submission")
        @ExcludeMissing
        fun submission(submission: JsonField<Submission>) = apply { this.submission = submission }

        /** The ID for the transaction funding the transfer. */
        fun transactionId(transactionId: String) = transactionId(JsonField.of(transactionId))

        /** The ID for the transaction funding the transfer. */
        @JsonProperty("transaction_id")
        @ExcludeMissing
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
        @JsonProperty("type")
        @ExcludeMissing
        fun type(type: JsonField<Type>) = apply { this.type = type }

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

        fun build(): WireTransfer =
            WireTransfer(
                accountId,
                accountNumber,
                amount,
                approval,
                beneficiaryAddressLine1,
                beneficiaryAddressLine2,
                beneficiaryAddressLine3,
                beneficiaryName,
                cancellation,
                createdAt,
                createdBy,
                currency,
                externalAccountId,
                id,
                idempotencyKey,
                messageToRecipient,
                network,
                originatorAddressLine1,
                originatorAddressLine2,
                originatorAddressLine3,
                originatorName,
                pendingTransactionId,
                reversal,
                routingNumber,
                status,
                submission,
                transactionId,
                type,
                additionalProperties.toUnmodifiable(),
            )
    }

    /**
     * If your account requires approvals for transfers and the transfer was approved, this will
     * contain details of the approval.
     */
    @JsonDeserialize(builder = Approval.Builder::class)
    @NoAutoDetect
    class Approval
    private constructor(
        private val approvedAt: JsonField<OffsetDateTime>,
        private val approvedBy: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

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
        @JsonProperty("approved_at") @ExcludeMissing fun _approvedAt() = approvedAt

        /**
         * If the Transfer was approved by a user in the dashboard, the email address of that user.
         */
        @JsonProperty("approved_by") @ExcludeMissing fun _approvedBy() = approvedBy

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Approval = apply {
            if (!validated) {
                approvedAt()
                approvedBy()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Approval &&
                this.approvedAt == other.approvedAt &&
                this.approvedBy == other.approvedBy &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        approvedAt,
                        approvedBy,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Approval{approvedAt=$approvedAt, approvedBy=$approvedBy, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var approvedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var approvedBy: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(approval: Approval) = apply {
                this.approvedAt = approval.approvedAt
                this.approvedBy = approval.approvedBy
                additionalProperties(approval.additionalProperties)
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
            @JsonProperty("approved_at")
            @ExcludeMissing
            fun approvedAt(approvedAt: JsonField<OffsetDateTime>) = apply {
                this.approvedAt = approvedAt
            }

            /**
             * If the Transfer was approved by a user in the dashboard, the email address of that
             * user.
             */
            fun approvedBy(approvedBy: String) = approvedBy(JsonField.of(approvedBy))

            /**
             * If the Transfer was approved by a user in the dashboard, the email address of that
             * user.
             */
            @JsonProperty("approved_by")
            @ExcludeMissing
            fun approvedBy(approvedBy: JsonField<String>) = apply { this.approvedBy = approvedBy }

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

            fun build(): Approval =
                Approval(
                    approvedAt,
                    approvedBy,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    /**
     * If your account requires approvals for transfers and the transfer was not approved, this will
     * contain details of the cancellation.
     */
    @JsonDeserialize(builder = Cancellation.Builder::class)
    @NoAutoDetect
    class Cancellation
    private constructor(
        private val canceledAt: JsonField<OffsetDateTime>,
        private val canceledBy: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

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
        @JsonProperty("canceled_at") @ExcludeMissing fun _canceledAt() = canceledAt

        /**
         * If the Transfer was canceled by a user in the dashboard, the email address of that user.
         */
        @JsonProperty("canceled_by") @ExcludeMissing fun _canceledBy() = canceledBy

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Cancellation = apply {
            if (!validated) {
                canceledAt()
                canceledBy()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Cancellation &&
                this.canceledAt == other.canceledAt &&
                this.canceledBy == other.canceledBy &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        canceledAt,
                        canceledBy,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Cancellation{canceledAt=$canceledAt, canceledBy=$canceledBy, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var canceledAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var canceledBy: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(cancellation: Cancellation) = apply {
                this.canceledAt = cancellation.canceledAt
                this.canceledBy = cancellation.canceledBy
                additionalProperties(cancellation.additionalProperties)
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
            @JsonProperty("canceled_at")
            @ExcludeMissing
            fun canceledAt(canceledAt: JsonField<OffsetDateTime>) = apply {
                this.canceledAt = canceledAt
            }

            /**
             * If the Transfer was canceled by a user in the dashboard, the email address of that
             * user.
             */
            fun canceledBy(canceledBy: String) = canceledBy(JsonField.of(canceledBy))

            /**
             * If the Transfer was canceled by a user in the dashboard, the email address of that
             * user.
             */
            @JsonProperty("canceled_by")
            @ExcludeMissing
            fun canceledBy(canceledBy: JsonField<String>) = apply { this.canceledBy = canceledBy }

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

            fun build(): Cancellation =
                Cancellation(
                    canceledAt,
                    canceledBy,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    /** What object created the transfer, either via the API or the dashboard. */
    @JsonDeserialize(builder = CreatedBy.Builder::class)
    @NoAutoDetect
    class CreatedBy
    private constructor(
        private val category: JsonField<Category>,
        private val apiKey: JsonField<ApiKey>,
        private val oauthApplication: JsonField<OAuthApplication>,
        private val user: JsonField<User>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /** The type of object that created this transfer. */
        fun category(): Category = category.getRequired("category")

        /** If present, details about the API key that created the transfer. */
        fun apiKey(): Optional<ApiKey> = Optional.ofNullable(apiKey.getNullable("api_key"))

        /** If present, details about the OAuth Application that created the transfer. */
        fun oauthApplication(): Optional<OAuthApplication> =
            Optional.ofNullable(oauthApplication.getNullable("oauth_application"))

        /** If present, details about the User that created the transfer. */
        fun user(): Optional<User> = Optional.ofNullable(user.getNullable("user"))

        /** The type of object that created this transfer. */
        @JsonProperty("category") @ExcludeMissing fun _category() = category

        /** If present, details about the API key that created the transfer. */
        @JsonProperty("api_key") @ExcludeMissing fun _apiKey() = apiKey

        /** If present, details about the OAuth Application that created the transfer. */
        @JsonProperty("oauth_application")
        @ExcludeMissing
        fun _oauthApplication() = oauthApplication

        /** If present, details about the User that created the transfer. */
        @JsonProperty("user") @ExcludeMissing fun _user() = user

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): CreatedBy = apply {
            if (!validated) {
                category()
                apiKey().map { it.validate() }
                oauthApplication().map { it.validate() }
                user().map { it.validate() }
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CreatedBy &&
                this.category == other.category &&
                this.apiKey == other.apiKey &&
                this.oauthApplication == other.oauthApplication &&
                this.user == other.user &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        category,
                        apiKey,
                        oauthApplication,
                        user,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "CreatedBy{category=$category, apiKey=$apiKey, oauthApplication=$oauthApplication, user=$user, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var category: JsonField<Category> = JsonMissing.of()
            private var apiKey: JsonField<ApiKey> = JsonMissing.of()
            private var oauthApplication: JsonField<OAuthApplication> = JsonMissing.of()
            private var user: JsonField<User> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(createdBy: CreatedBy) = apply {
                this.category = createdBy.category
                this.apiKey = createdBy.apiKey
                this.oauthApplication = createdBy.oauthApplication
                this.user = createdBy.user
                additionalProperties(createdBy.additionalProperties)
            }

            /** The type of object that created this transfer. */
            fun category(category: Category) = category(JsonField.of(category))

            /** The type of object that created this transfer. */
            @JsonProperty("category")
            @ExcludeMissing
            fun category(category: JsonField<Category>) = apply { this.category = category }

            /** If present, details about the API key that created the transfer. */
            fun apiKey(apiKey: ApiKey) = apiKey(JsonField.of(apiKey))

            /** If present, details about the API key that created the transfer. */
            @JsonProperty("api_key")
            @ExcludeMissing
            fun apiKey(apiKey: JsonField<ApiKey>) = apply { this.apiKey = apiKey }

            /** If present, details about the OAuth Application that created the transfer. */
            fun oauthApplication(oauthApplication: OAuthApplication) =
                oauthApplication(JsonField.of(oauthApplication))

            /** If present, details about the OAuth Application that created the transfer. */
            @JsonProperty("oauth_application")
            @ExcludeMissing
            fun oauthApplication(oauthApplication: JsonField<OAuthApplication>) = apply {
                this.oauthApplication = oauthApplication
            }

            /** If present, details about the User that created the transfer. */
            fun user(user: User) = user(JsonField.of(user))

            /** If present, details about the User that created the transfer. */
            @JsonProperty("user")
            @ExcludeMissing
            fun user(user: JsonField<User>) = apply { this.user = user }

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

            fun build(): CreatedBy =
                CreatedBy(
                    category,
                    apiKey,
                    oauthApplication,
                    user,
                    additionalProperties.toUnmodifiable(),
                )
        }

        /** If present, details about the API key that created the transfer. */
        @JsonDeserialize(builder = ApiKey.Builder::class)
        @NoAutoDetect
        class ApiKey
        private constructor(
            private val description: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** The description set for the API key when it was created. */
            fun description(): Optional<String> =
                Optional.ofNullable(description.getNullable("description"))

            /** The description set for the API key when it was created. */
            @JsonProperty("description") @ExcludeMissing fun _description() = description

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): ApiKey = apply {
                if (!validated) {
                    description()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ApiKey &&
                    this.description == other.description &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = Objects.hash(description, additionalProperties)
                }
                return hashCode
            }

            override fun toString() =
                "ApiKey{description=$description, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var description: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(apiKey: ApiKey) = apply {
                    this.description = apiKey.description
                    additionalProperties(apiKey.additionalProperties)
                }

                /** The description set for the API key when it was created. */
                fun description(description: String) = description(JsonField.of(description))

                /** The description set for the API key when it was created. */
                @JsonProperty("description")
                @ExcludeMissing
                fun description(description: JsonField<String>) = apply {
                    this.description = description
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): ApiKey = ApiKey(description, additionalProperties.toUnmodifiable())
            }
        }

        class Category
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Category && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val API_KEY = Category(JsonField.of("api_key"))

                @JvmField val OAUTH_APPLICATION = Category(JsonField.of("oauth_application"))

                @JvmField val USER = Category(JsonField.of("user"))

                @JvmStatic fun of(value: String) = Category(JsonField.of(value))
            }

            enum class Known {
                API_KEY,
                OAUTH_APPLICATION,
                USER,
            }

            enum class Value {
                API_KEY,
                OAUTH_APPLICATION,
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
        }

        /** If present, details about the OAuth Application that created the transfer. */
        @JsonDeserialize(builder = OAuthApplication.Builder::class)
        @NoAutoDetect
        class OAuthApplication
        private constructor(
            private val name: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** The name of the OAuth Application. */
            fun name(): String = name.getRequired("name")

            /** The name of the OAuth Application. */
            @JsonProperty("name") @ExcludeMissing fun _name() = name

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): OAuthApplication = apply {
                if (!validated) {
                    name()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is OAuthApplication &&
                    this.name == other.name &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = Objects.hash(name, additionalProperties)
                }
                return hashCode
            }

            override fun toString() =
                "OAuthApplication{name=$name, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var name: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(oauthApplication: OAuthApplication) = apply {
                    this.name = oauthApplication.name
                    additionalProperties(oauthApplication.additionalProperties)
                }

                /** The name of the OAuth Application. */
                fun name(name: String) = name(JsonField.of(name))

                /** The name of the OAuth Application. */
                @JsonProperty("name")
                @ExcludeMissing
                fun name(name: JsonField<String>) = apply { this.name = name }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): OAuthApplication =
                    OAuthApplication(name, additionalProperties.toUnmodifiable())
            }
        }

        /** If present, details about the User that created the transfer. */
        @JsonDeserialize(builder = User.Builder::class)
        @NoAutoDetect
        class User
        private constructor(
            private val email: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** The email address of the User. */
            fun email(): String = email.getRequired("email")

            /** The email address of the User. */
            @JsonProperty("email") @ExcludeMissing fun _email() = email

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): User = apply {
                if (!validated) {
                    email()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is User &&
                    this.email == other.email &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = Objects.hash(email, additionalProperties)
                }
                return hashCode
            }

            override fun toString() =
                "User{email=$email, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var email: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(user: User) = apply {
                    this.email = user.email
                    additionalProperties(user.additionalProperties)
                }

                /** The email address of the User. */
                fun email(email: String) = email(JsonField.of(email))

                /** The email address of the User. */
                @JsonProperty("email")
                @ExcludeMissing
                fun email(email: JsonField<String>) = apply { this.email = email }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): User = User(email, additionalProperties.toUnmodifiable())
            }
        }
    }

    class Currency
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Currency && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val CAD = Currency(JsonField.of("CAD"))

            @JvmField val CHF = Currency(JsonField.of("CHF"))

            @JvmField val EUR = Currency(JsonField.of("EUR"))

            @JvmField val GBP = Currency(JsonField.of("GBP"))

            @JvmField val JPY = Currency(JsonField.of("JPY"))

            @JvmField val USD = Currency(JsonField.of("USD"))

            @JvmStatic fun of(value: String) = Currency(JsonField.of(value))
        }

        enum class Known {
            CAD,
            CHF,
            EUR,
            GBP,
            JPY,
            USD,
        }

        enum class Value {
            CAD,
            CHF,
            EUR,
            GBP,
            JPY,
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
    }

    class Network
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Network && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val WIRE = Network(JsonField.of("wire"))

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
    }

    /** If your transfer is reversed, this will contain details of the reversal. */
    @JsonDeserialize(builder = Reversal.Builder::class)
    @NoAutoDetect
    class Reversal
    private constructor(
        private val amount: JsonField<Long>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val description: JsonField<String>,
        private val inputCycleDate: JsonField<LocalDate>,
        private val inputSequenceNumber: JsonField<String>,
        private val inputSource: JsonField<String>,
        private val inputMessageAccountabilityData: JsonField<String>,
        private val previousMessageInputMessageAccountabilityData: JsonField<String>,
        private val previousMessageInputCycleDate: JsonField<LocalDate>,
        private val previousMessageInputSequenceNumber: JsonField<String>,
        private val previousMessageInputSource: JsonField<String>,
        private val receiverFinancialInstitutionInformation: JsonField<String>,
        private val financialInstitutionToFinancialInstitutionInformation: JsonField<String>,
        private val transactionId: JsonField<String>,
        private val wireTransferId: JsonField<String>,
        private val originatorRoutingNumber: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /** The amount that was reversed in USD cents. */
        fun amount(): Long = amount.getRequired("amount")

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
         * reversal was created.
         */
        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        /** The description on the reversal message from Fedwire, set by the reversing bank. */
        fun description(): String = description.getRequired("description")

        /**
         * The Fedwire cycle date for the wire reversal. The "Fedwire day" begins at 9:00 PM Eastern
         * Time on the evening before the `cycle date`.
         */
        fun inputCycleDate(): LocalDate = inputCycleDate.getRequired("input_cycle_date")

        /** The Fedwire sequence number. */
        fun inputSequenceNumber(): String = inputSequenceNumber.getRequired("input_sequence_number")

        /** The Fedwire input source identifier. */
        fun inputSource(): String = inputSource.getRequired("input_source")

        /** The Fedwire transaction identifier. */
        fun inputMessageAccountabilityData(): String =
            inputMessageAccountabilityData.getRequired("input_message_accountability_data")

        /** The Fedwire transaction identifier for the wire transfer that was reversed. */
        fun previousMessageInputMessageAccountabilityData(): String =
            previousMessageInputMessageAccountabilityData.getRequired(
                "previous_message_input_message_accountability_data"
            )

        /** The Fedwire cycle date for the wire transfer that is being reversed by this message. */
        fun previousMessageInputCycleDate(): LocalDate =
            previousMessageInputCycleDate.getRequired("previous_message_input_cycle_date")

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

        /** Additional financial institution information included in the wire reversal. */
        fun financialInstitutionToFinancialInstitutionInformation(): Optional<String> =
            Optional.ofNullable(
                financialInstitutionToFinancialInstitutionInformation.getNullable(
                    "financial_institution_to_financial_institution_information"
                )
            )

        /** The ID for the Transaction associated with the transfer reversal. */
        fun transactionId(): String = transactionId.getRequired("transaction_id")

        /** The ID for the Wire Transfer that is being reversed. */
        fun wireTransferId(): String = wireTransferId.getRequired("wire_transfer_id")

        /**
         * The American Banking Association (ABA) routing number of the bank originating the
         * transfer.
         */
        fun originatorRoutingNumber(): Optional<String> =
            Optional.ofNullable(originatorRoutingNumber.getNullable("originator_routing_number"))

        /** The amount that was reversed in USD cents. */
        @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
         * reversal was created.
         */
        @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

        /** The description on the reversal message from Fedwire, set by the reversing bank. */
        @JsonProperty("description") @ExcludeMissing fun _description() = description

        /**
         * The Fedwire cycle date for the wire reversal. The "Fedwire day" begins at 9:00 PM Eastern
         * Time on the evening before the `cycle date`.
         */
        @JsonProperty("input_cycle_date") @ExcludeMissing fun _inputCycleDate() = inputCycleDate

        /** The Fedwire sequence number. */
        @JsonProperty("input_sequence_number")
        @ExcludeMissing
        fun _inputSequenceNumber() = inputSequenceNumber

        /** The Fedwire input source identifier. */
        @JsonProperty("input_source") @ExcludeMissing fun _inputSource() = inputSource

        /** The Fedwire transaction identifier. */
        @JsonProperty("input_message_accountability_data")
        @ExcludeMissing
        fun _inputMessageAccountabilityData() = inputMessageAccountabilityData

        /** The Fedwire transaction identifier for the wire transfer that was reversed. */
        @JsonProperty("previous_message_input_message_accountability_data")
        @ExcludeMissing
        fun _previousMessageInputMessageAccountabilityData() =
            previousMessageInputMessageAccountabilityData

        /** The Fedwire cycle date for the wire transfer that is being reversed by this message. */
        @JsonProperty("previous_message_input_cycle_date")
        @ExcludeMissing
        fun _previousMessageInputCycleDate() = previousMessageInputCycleDate

        /** The Fedwire sequence number for the wire transfer that was reversed. */
        @JsonProperty("previous_message_input_sequence_number")
        @ExcludeMissing
        fun _previousMessageInputSequenceNumber() = previousMessageInputSequenceNumber

        /** The Fedwire input source identifier for the wire transfer that was reversed. */
        @JsonProperty("previous_message_input_source")
        @ExcludeMissing
        fun _previousMessageInputSource() = previousMessageInputSource

        /** Information included in the wire reversal for the receiving financial institution. */
        @JsonProperty("receiver_financial_institution_information")
        @ExcludeMissing
        fun _receiverFinancialInstitutionInformation() = receiverFinancialInstitutionInformation

        /** Additional financial institution information included in the wire reversal. */
        @JsonProperty("financial_institution_to_financial_institution_information")
        @ExcludeMissing
        fun _financialInstitutionToFinancialInstitutionInformation() =
            financialInstitutionToFinancialInstitutionInformation

        /** The ID for the Transaction associated with the transfer reversal. */
        @JsonProperty("transaction_id") @ExcludeMissing fun _transactionId() = transactionId

        /** The ID for the Wire Transfer that is being reversed. */
        @JsonProperty("wire_transfer_id") @ExcludeMissing fun _wireTransferId() = wireTransferId

        /**
         * The American Banking Association (ABA) routing number of the bank originating the
         * transfer.
         */
        @JsonProperty("originator_routing_number")
        @ExcludeMissing
        fun _originatorRoutingNumber() = originatorRoutingNumber

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Reversal = apply {
            if (!validated) {
                amount()
                createdAt()
                description()
                inputCycleDate()
                inputSequenceNumber()
                inputSource()
                inputMessageAccountabilityData()
                previousMessageInputMessageAccountabilityData()
                previousMessageInputCycleDate()
                previousMessageInputSequenceNumber()
                previousMessageInputSource()
                receiverFinancialInstitutionInformation()
                financialInstitutionToFinancialInstitutionInformation()
                transactionId()
                wireTransferId()
                originatorRoutingNumber()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Reversal &&
                this.amount == other.amount &&
                this.createdAt == other.createdAt &&
                this.description == other.description &&
                this.inputCycleDate == other.inputCycleDate &&
                this.inputSequenceNumber == other.inputSequenceNumber &&
                this.inputSource == other.inputSource &&
                this.inputMessageAccountabilityData == other.inputMessageAccountabilityData &&
                this.previousMessageInputMessageAccountabilityData ==
                    other.previousMessageInputMessageAccountabilityData &&
                this.previousMessageInputCycleDate == other.previousMessageInputCycleDate &&
                this.previousMessageInputSequenceNumber ==
                    other.previousMessageInputSequenceNumber &&
                this.previousMessageInputSource == other.previousMessageInputSource &&
                this.receiverFinancialInstitutionInformation ==
                    other.receiverFinancialInstitutionInformation &&
                this.financialInstitutionToFinancialInstitutionInformation ==
                    other.financialInstitutionToFinancialInstitutionInformation &&
                this.transactionId == other.transactionId &&
                this.wireTransferId == other.wireTransferId &&
                this.originatorRoutingNumber == other.originatorRoutingNumber &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        amount,
                        createdAt,
                        description,
                        inputCycleDate,
                        inputSequenceNumber,
                        inputSource,
                        inputMessageAccountabilityData,
                        previousMessageInputMessageAccountabilityData,
                        previousMessageInputCycleDate,
                        previousMessageInputSequenceNumber,
                        previousMessageInputSource,
                        receiverFinancialInstitutionInformation,
                        financialInstitutionToFinancialInstitutionInformation,
                        transactionId,
                        wireTransferId,
                        originatorRoutingNumber,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Reversal{amount=$amount, createdAt=$createdAt, description=$description, inputCycleDate=$inputCycleDate, inputSequenceNumber=$inputSequenceNumber, inputSource=$inputSource, inputMessageAccountabilityData=$inputMessageAccountabilityData, previousMessageInputMessageAccountabilityData=$previousMessageInputMessageAccountabilityData, previousMessageInputCycleDate=$previousMessageInputCycleDate, previousMessageInputSequenceNumber=$previousMessageInputSequenceNumber, previousMessageInputSource=$previousMessageInputSource, receiverFinancialInstitutionInformation=$receiverFinancialInstitutionInformation, financialInstitutionToFinancialInstitutionInformation=$financialInstitutionToFinancialInstitutionInformation, transactionId=$transactionId, wireTransferId=$wireTransferId, originatorRoutingNumber=$originatorRoutingNumber, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var amount: JsonField<Long> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var inputCycleDate: JsonField<LocalDate> = JsonMissing.of()
            private var inputSequenceNumber: JsonField<String> = JsonMissing.of()
            private var inputSource: JsonField<String> = JsonMissing.of()
            private var inputMessageAccountabilityData: JsonField<String> = JsonMissing.of()
            private var previousMessageInputMessageAccountabilityData: JsonField<String> =
                JsonMissing.of()
            private var previousMessageInputCycleDate: JsonField<LocalDate> = JsonMissing.of()
            private var previousMessageInputSequenceNumber: JsonField<String> = JsonMissing.of()
            private var previousMessageInputSource: JsonField<String> = JsonMissing.of()
            private var receiverFinancialInstitutionInformation: JsonField<String> =
                JsonMissing.of()
            private var financialInstitutionToFinancialInstitutionInformation: JsonField<String> =
                JsonMissing.of()
            private var transactionId: JsonField<String> = JsonMissing.of()
            private var wireTransferId: JsonField<String> = JsonMissing.of()
            private var originatorRoutingNumber: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(reversal: Reversal) = apply {
                this.amount = reversal.amount
                this.createdAt = reversal.createdAt
                this.description = reversal.description
                this.inputCycleDate = reversal.inputCycleDate
                this.inputSequenceNumber = reversal.inputSequenceNumber
                this.inputSource = reversal.inputSource
                this.inputMessageAccountabilityData = reversal.inputMessageAccountabilityData
                this.previousMessageInputMessageAccountabilityData =
                    reversal.previousMessageInputMessageAccountabilityData
                this.previousMessageInputCycleDate = reversal.previousMessageInputCycleDate
                this.previousMessageInputSequenceNumber =
                    reversal.previousMessageInputSequenceNumber
                this.previousMessageInputSource = reversal.previousMessageInputSource
                this.receiverFinancialInstitutionInformation =
                    reversal.receiverFinancialInstitutionInformation
                this.financialInstitutionToFinancialInstitutionInformation =
                    reversal.financialInstitutionToFinancialInstitutionInformation
                this.transactionId = reversal.transactionId
                this.wireTransferId = reversal.wireTransferId
                this.originatorRoutingNumber = reversal.originatorRoutingNumber
                additionalProperties(reversal.additionalProperties)
            }

            /** The amount that was reversed in USD cents. */
            fun amount(amount: Long) = amount(JsonField.of(amount))

            /** The amount that was reversed in USD cents. */
            @JsonProperty("amount")
            @ExcludeMissing
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
            @JsonProperty("created_at")
            @ExcludeMissing
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            /** The description on the reversal message from Fedwire, set by the reversing bank. */
            fun description(description: String) = description(JsonField.of(description))

            /** The description on the reversal message from Fedwire, set by the reversing bank. */
            @JsonProperty("description")
            @ExcludeMissing
            fun description(description: JsonField<String>) = apply {
                this.description = description
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
            @JsonProperty("input_cycle_date")
            @ExcludeMissing
            fun inputCycleDate(inputCycleDate: JsonField<LocalDate>) = apply {
                this.inputCycleDate = inputCycleDate
            }

            /** The Fedwire sequence number. */
            fun inputSequenceNumber(inputSequenceNumber: String) =
                inputSequenceNumber(JsonField.of(inputSequenceNumber))

            /** The Fedwire sequence number. */
            @JsonProperty("input_sequence_number")
            @ExcludeMissing
            fun inputSequenceNumber(inputSequenceNumber: JsonField<String>) = apply {
                this.inputSequenceNumber = inputSequenceNumber
            }

            /** The Fedwire input source identifier. */
            fun inputSource(inputSource: String) = inputSource(JsonField.of(inputSource))

            /** The Fedwire input source identifier. */
            @JsonProperty("input_source")
            @ExcludeMissing
            fun inputSource(inputSource: JsonField<String>) = apply {
                this.inputSource = inputSource
            }

            /** The Fedwire transaction identifier. */
            fun inputMessageAccountabilityData(inputMessageAccountabilityData: String) =
                inputMessageAccountabilityData(JsonField.of(inputMessageAccountabilityData))

            /** The Fedwire transaction identifier. */
            @JsonProperty("input_message_accountability_data")
            @ExcludeMissing
            fun inputMessageAccountabilityData(inputMessageAccountabilityData: JsonField<String>) =
                apply {
                    this.inputMessageAccountabilityData = inputMessageAccountabilityData
                }

            /** The Fedwire transaction identifier for the wire transfer that was reversed. */
            fun previousMessageInputMessageAccountabilityData(
                previousMessageInputMessageAccountabilityData: String
            ) =
                previousMessageInputMessageAccountabilityData(
                    JsonField.of(previousMessageInputMessageAccountabilityData)
                )

            /** The Fedwire transaction identifier for the wire transfer that was reversed. */
            @JsonProperty("previous_message_input_message_accountability_data")
            @ExcludeMissing
            fun previousMessageInputMessageAccountabilityData(
                previousMessageInputMessageAccountabilityData: JsonField<String>
            ) = apply {
                this.previousMessageInputMessageAccountabilityData =
                    previousMessageInputMessageAccountabilityData
            }

            /**
             * The Fedwire cycle date for the wire transfer that is being reversed by this message.
             */
            fun previousMessageInputCycleDate(previousMessageInputCycleDate: LocalDate) =
                previousMessageInputCycleDate(JsonField.of(previousMessageInputCycleDate))

            /**
             * The Fedwire cycle date for the wire transfer that is being reversed by this message.
             */
            @JsonProperty("previous_message_input_cycle_date")
            @ExcludeMissing
            fun previousMessageInputCycleDate(previousMessageInputCycleDate: JsonField<LocalDate>) =
                apply {
                    this.previousMessageInputCycleDate = previousMessageInputCycleDate
                }

            /** The Fedwire sequence number for the wire transfer that was reversed. */
            fun previousMessageInputSequenceNumber(previousMessageInputSequenceNumber: String) =
                previousMessageInputSequenceNumber(JsonField.of(previousMessageInputSequenceNumber))

            /** The Fedwire sequence number for the wire transfer that was reversed. */
            @JsonProperty("previous_message_input_sequence_number")
            @ExcludeMissing
            fun previousMessageInputSequenceNumber(
                previousMessageInputSequenceNumber: JsonField<String>
            ) = apply {
                this.previousMessageInputSequenceNumber = previousMessageInputSequenceNumber
            }

            /** The Fedwire input source identifier for the wire transfer that was reversed. */
            fun previousMessageInputSource(previousMessageInputSource: String) =
                previousMessageInputSource(JsonField.of(previousMessageInputSource))

            /** The Fedwire input source identifier for the wire transfer that was reversed. */
            @JsonProperty("previous_message_input_source")
            @ExcludeMissing
            fun previousMessageInputSource(previousMessageInputSource: JsonField<String>) = apply {
                this.previousMessageInputSource = previousMessageInputSource
            }

            /**
             * Information included in the wire reversal for the receiving financial institution.
             */
            fun receiverFinancialInstitutionInformation(
                receiverFinancialInstitutionInformation: String
            ) =
                receiverFinancialInstitutionInformation(
                    JsonField.of(receiverFinancialInstitutionInformation)
                )

            /**
             * Information included in the wire reversal for the receiving financial institution.
             */
            @JsonProperty("receiver_financial_institution_information")
            @ExcludeMissing
            fun receiverFinancialInstitutionInformation(
                receiverFinancialInstitutionInformation: JsonField<String>
            ) = apply {
                this.receiverFinancialInstitutionInformation =
                    receiverFinancialInstitutionInformation
            }

            /** Additional financial institution information included in the wire reversal. */
            fun financialInstitutionToFinancialInstitutionInformation(
                financialInstitutionToFinancialInstitutionInformation: String
            ) =
                financialInstitutionToFinancialInstitutionInformation(
                    JsonField.of(financialInstitutionToFinancialInstitutionInformation)
                )

            /** Additional financial institution information included in the wire reversal. */
            @JsonProperty("financial_institution_to_financial_institution_information")
            @ExcludeMissing
            fun financialInstitutionToFinancialInstitutionInformation(
                financialInstitutionToFinancialInstitutionInformation: JsonField<String>
            ) = apply {
                this.financialInstitutionToFinancialInstitutionInformation =
                    financialInstitutionToFinancialInstitutionInformation
            }

            /** The ID for the Transaction associated with the transfer reversal. */
            fun transactionId(transactionId: String) = transactionId(JsonField.of(transactionId))

            /** The ID for the Transaction associated with the transfer reversal. */
            @JsonProperty("transaction_id")
            @ExcludeMissing
            fun transactionId(transactionId: JsonField<String>) = apply {
                this.transactionId = transactionId
            }

            /** The ID for the Wire Transfer that is being reversed. */
            fun wireTransferId(wireTransferId: String) =
                wireTransferId(JsonField.of(wireTransferId))

            /** The ID for the Wire Transfer that is being reversed. */
            @JsonProperty("wire_transfer_id")
            @ExcludeMissing
            fun wireTransferId(wireTransferId: JsonField<String>) = apply {
                this.wireTransferId = wireTransferId
            }

            /**
             * The American Banking Association (ABA) routing number of the bank originating the
             * transfer.
             */
            fun originatorRoutingNumber(originatorRoutingNumber: String) =
                originatorRoutingNumber(JsonField.of(originatorRoutingNumber))

            /**
             * The American Banking Association (ABA) routing number of the bank originating the
             * transfer.
             */
            @JsonProperty("originator_routing_number")
            @ExcludeMissing
            fun originatorRoutingNumber(originatorRoutingNumber: JsonField<String>) = apply {
                this.originatorRoutingNumber = originatorRoutingNumber
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

            fun build(): Reversal =
                Reversal(
                    amount,
                    createdAt,
                    description,
                    inputCycleDate,
                    inputSequenceNumber,
                    inputSource,
                    inputMessageAccountabilityData,
                    previousMessageInputMessageAccountabilityData,
                    previousMessageInputCycleDate,
                    previousMessageInputSequenceNumber,
                    previousMessageInputSource,
                    receiverFinancialInstitutionInformation,
                    financialInstitutionToFinancialInstitutionInformation,
                    transactionId,
                    wireTransferId,
                    originatorRoutingNumber,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Status && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val CANCELED = Status(JsonField.of("canceled"))

            @JvmField val REQUIRES_ATTENTION = Status(JsonField.of("requires_attention"))

            @JvmField val PENDING_REVIEWING = Status(JsonField.of("pending_reviewing"))

            @JvmField val PENDING_APPROVAL = Status(JsonField.of("pending_approval"))

            @JvmField val REJECTED = Status(JsonField.of("rejected"))

            @JvmField val REVERSED = Status(JsonField.of("reversed"))

            @JvmField val COMPLETE = Status(JsonField.of("complete"))

            @JvmField val PENDING_CREATING = Status(JsonField.of("pending_creating"))

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            CANCELED,
            REQUIRES_ATTENTION,
            PENDING_REVIEWING,
            PENDING_APPROVAL,
            REJECTED,
            REVERSED,
            COMPLETE,
            PENDING_CREATING,
        }

        enum class Value {
            CANCELED,
            REQUIRES_ATTENTION,
            PENDING_REVIEWING,
            PENDING_APPROVAL,
            REJECTED,
            REVERSED,
            COMPLETE,
            PENDING_CREATING,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                CANCELED -> Value.CANCELED
                REQUIRES_ATTENTION -> Value.REQUIRES_ATTENTION
                PENDING_REVIEWING -> Value.PENDING_REVIEWING
                PENDING_APPROVAL -> Value.PENDING_APPROVAL
                REJECTED -> Value.REJECTED
                REVERSED -> Value.REVERSED
                COMPLETE -> Value.COMPLETE
                PENDING_CREATING -> Value.PENDING_CREATING
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                CANCELED -> Known.CANCELED
                REQUIRES_ATTENTION -> Known.REQUIRES_ATTENTION
                PENDING_REVIEWING -> Known.PENDING_REVIEWING
                PENDING_APPROVAL -> Known.PENDING_APPROVAL
                REJECTED -> Known.REJECTED
                REVERSED -> Known.REVERSED
                COMPLETE -> Known.COMPLETE
                PENDING_CREATING -> Known.PENDING_CREATING
                else -> throw IncreaseInvalidDataException("Unknown Status: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    /** After the transfer is submitted to Fedwire, this will contain supplemental details. */
    @JsonDeserialize(builder = Submission.Builder::class)
    @NoAutoDetect
    class Submission
    private constructor(
        private val inputMessageAccountabilityData: JsonField<String>,
        private val submittedAt: JsonField<OffsetDateTime>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /** The accountability data for the submission. */
        fun inputMessageAccountabilityData(): String =
            inputMessageAccountabilityData.getRequired("input_message_accountability_data")

        /** When this wire transfer was submitted to Fedwire. */
        fun submittedAt(): OffsetDateTime = submittedAt.getRequired("submitted_at")

        /** The accountability data for the submission. */
        @JsonProperty("input_message_accountability_data")
        @ExcludeMissing
        fun _inputMessageAccountabilityData() = inputMessageAccountabilityData

        /** When this wire transfer was submitted to Fedwire. */
        @JsonProperty("submitted_at") @ExcludeMissing fun _submittedAt() = submittedAt

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Submission = apply {
            if (!validated) {
                inputMessageAccountabilityData()
                submittedAt()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Submission &&
                this.inputMessageAccountabilityData == other.inputMessageAccountabilityData &&
                this.submittedAt == other.submittedAt &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        inputMessageAccountabilityData,
                        submittedAt,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Submission{inputMessageAccountabilityData=$inputMessageAccountabilityData, submittedAt=$submittedAt, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var inputMessageAccountabilityData: JsonField<String> = JsonMissing.of()
            private var submittedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(submission: Submission) = apply {
                this.inputMessageAccountabilityData = submission.inputMessageAccountabilityData
                this.submittedAt = submission.submittedAt
                additionalProperties(submission.additionalProperties)
            }

            /** The accountability data for the submission. */
            fun inputMessageAccountabilityData(inputMessageAccountabilityData: String) =
                inputMessageAccountabilityData(JsonField.of(inputMessageAccountabilityData))

            /** The accountability data for the submission. */
            @JsonProperty("input_message_accountability_data")
            @ExcludeMissing
            fun inputMessageAccountabilityData(inputMessageAccountabilityData: JsonField<String>) =
                apply {
                    this.inputMessageAccountabilityData = inputMessageAccountabilityData
                }

            /** When this wire transfer was submitted to Fedwire. */
            fun submittedAt(submittedAt: OffsetDateTime) = submittedAt(JsonField.of(submittedAt))

            /** When this wire transfer was submitted to Fedwire. */
            @JsonProperty("submitted_at")
            @ExcludeMissing
            fun submittedAt(submittedAt: JsonField<OffsetDateTime>) = apply {
                this.submittedAt = submittedAt
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

            fun build(): Submission =
                Submission(
                    inputMessageAccountabilityData,
                    submittedAt,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Type && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val WIRE_TRANSFER = Type(JsonField.of("wire_transfer"))

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
    }
}
