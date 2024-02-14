// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.toUnmodifiable
import com.increase.api.errors.IncreaseInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

/**
 * Real-Time Payments transfers move funds, within seconds, between your Increase account and any
 * other account on the Real-Time Payments network.
 */
@JsonDeserialize(builder = RealTimePaymentsTransfer.Builder::class)
@NoAutoDetect
class RealTimePaymentsTransfer
private constructor(
    private val type: JsonField<Type>,
    private val id: JsonField<String>,
    private val approval: JsonField<Approval>,
    private val cancellation: JsonField<Cancellation>,
    private val status: JsonField<Status>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val accountId: JsonField<String>,
    private val externalAccountId: JsonField<String>,
    private val sourceAccountNumberId: JsonField<String>,
    private val ultimateCreditorName: JsonField<String>,
    private val ultimateDebtorName: JsonField<String>,
    private val debtorName: JsonField<String>,
    private val creditorName: JsonField<String>,
    private val remittanceInformation: JsonField<String>,
    private val amount: JsonField<Long>,
    private val currency: JsonField<Currency>,
    private val destinationAccountNumber: JsonField<String>,
    private val destinationRoutingNumber: JsonField<String>,
    private val transactionId: JsonField<String>,
    private val pendingTransactionId: JsonField<String>,
    private val submission: JsonField<Submission>,
    private val rejection: JsonField<Rejection>,
    private val idempotencyKey: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /**
     * A constant representing the object's type. For this resource it will always be
     * `real_time_payments_transfer`.
     */
    fun type(): Type = type.getRequired("type")

    /** The Real-Time Payments Transfer's identifier. */
    fun id(): String = id.getRequired("id")

    /**
     * If your account requires approvals for transfers and the transfer was approved, this will
     * contain details of the approval.
     */
    fun approval(): Optional<Approval> = Optional.ofNullable(approval.getNullable("approval"))

    /**
     * If your account requires approvals for transfers and the transfer was not approved, this will
     * contain details of the cancellation.
     */
    fun cancellation(): Optional<Cancellation> =
        Optional.ofNullable(cancellation.getNullable("cancellation"))

    /** The lifecycle status of the transfer. */
    fun status(): Status = status.getRequired("status")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the transfer
     * was created.
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /** The Account from which the transfer was sent. */
    fun accountId(): String = accountId.getRequired("account_id")

    /** The identifier of the External Account the transfer was made to, if any. */
    fun externalAccountId(): Optional<String> =
        Optional.ofNullable(externalAccountId.getNullable("external_account_id"))

    /** The Account Number the recipient will see as having sent the transfer. */
    fun sourceAccountNumberId(): String =
        sourceAccountNumberId.getRequired("source_account_number_id")

    /** The name of the party on whose behalf the creditor is receiving the payment. */
    fun ultimateCreditorName(): Optional<String> =
        Optional.ofNullable(ultimateCreditorName.getNullable("ultimate_creditor_name"))

    /** The name of the the party on whose behalf the debtor is instructing the payment. */
    fun ultimateDebtorName(): Optional<String> =
        Optional.ofNullable(ultimateDebtorName.getNullable("ultimate_debtor_name"))

    /**
     * The name of the transfer's sender. If not provided, the account's entity name will be used.
     */
    fun debtorName(): Optional<String> = Optional.ofNullable(debtorName.getNullable("debtor_name"))

    /** The name of the transfer's recipient as provided by the sender. */
    fun creditorName(): String = creditorName.getRequired("creditor_name")

    /** Unstructured information that will show on the recipient's bank statement. */
    fun remittanceInformation(): String =
        remittanceInformation.getRequired("remittance_information")

    /** The transfer amount in USD cents. */
    fun amount(): Long = amount.getRequired("amount")

    /**
     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transfer's currency. For
     * real-time payments transfers this is always equal to `USD`.
     */
    fun currency(): Currency = currency.getRequired("currency")

    /** The destination account number. */
    fun destinationAccountNumber(): String =
        destinationAccountNumber.getRequired("destination_account_number")

    /** The destination American Bankers' Association (ABA) Routing Transit Number (RTN). */
    fun destinationRoutingNumber(): String =
        destinationRoutingNumber.getRequired("destination_routing_number")

    /** The Transaction funding the transfer once it is complete. */
    fun transactionId(): Optional<String> =
        Optional.ofNullable(transactionId.getNullable("transaction_id"))

    /**
     * The ID for the pending transaction representing the transfer. A pending transaction is
     * created when the transfer
     * [requires approval](https://increase.com/documentation/transfer-approvals#transfer-approvals)
     * by someone else in your organization.
     */
    fun pendingTransactionId(): Optional<String> =
        Optional.ofNullable(pendingTransactionId.getNullable("pending_transaction_id"))

    /**
     * After the transfer is submitted to Real-Time Payments, this will contain supplemental
     * details.
     */
    fun submission(): Optional<Submission> =
        Optional.ofNullable(submission.getNullable("submission"))

    /**
     * If the transfer is rejected by Real-Time Payments or the destination financial institution,
     * this will contain supplemental details.
     */
    fun rejection(): Optional<Rejection> = Optional.ofNullable(rejection.getNullable("rejection"))

    /**
     * The idempotency key you chose for this object. This value is unique across Increase and is
     * used to ensure that a request is only processed once. Learn more about
     * [idempotency](https://increase.com/documentation/idempotency-keys).
     */
    fun idempotencyKey(): Optional<String> =
        Optional.ofNullable(idempotencyKey.getNullable("idempotency_key"))

    /**
     * A constant representing the object's type. For this resource it will always be
     * `real_time_payments_transfer`.
     */
    @JsonProperty("type") @ExcludeMissing fun _type() = type

    /** The Real-Time Payments Transfer's identifier. */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /**
     * If your account requires approvals for transfers and the transfer was approved, this will
     * contain details of the approval.
     */
    @JsonProperty("approval") @ExcludeMissing fun _approval() = approval

    /**
     * If your account requires approvals for transfers and the transfer was not approved, this will
     * contain details of the cancellation.
     */
    @JsonProperty("cancellation") @ExcludeMissing fun _cancellation() = cancellation

    /** The lifecycle status of the transfer. */
    @JsonProperty("status") @ExcludeMissing fun _status() = status

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the transfer
     * was created.
     */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    /** The Account from which the transfer was sent. */
    @JsonProperty("account_id") @ExcludeMissing fun _accountId() = accountId

    /** The identifier of the External Account the transfer was made to, if any. */
    @JsonProperty("external_account_id")
    @ExcludeMissing
    fun _externalAccountId() = externalAccountId

    /** The Account Number the recipient will see as having sent the transfer. */
    @JsonProperty("source_account_number_id")
    @ExcludeMissing
    fun _sourceAccountNumberId() = sourceAccountNumberId

    /** The name of the party on whose behalf the creditor is receiving the payment. */
    @JsonProperty("ultimate_creditor_name")
    @ExcludeMissing
    fun _ultimateCreditorName() = ultimateCreditorName

    /** The name of the the party on whose behalf the debtor is instructing the payment. */
    @JsonProperty("ultimate_debtor_name")
    @ExcludeMissing
    fun _ultimateDebtorName() = ultimateDebtorName

    /**
     * The name of the transfer's sender. If not provided, the account's entity name will be used.
     */
    @JsonProperty("debtor_name") @ExcludeMissing fun _debtorName() = debtorName

    /** The name of the transfer's recipient as provided by the sender. */
    @JsonProperty("creditor_name") @ExcludeMissing fun _creditorName() = creditorName

    /** Unstructured information that will show on the recipient's bank statement. */
    @JsonProperty("remittance_information")
    @ExcludeMissing
    fun _remittanceInformation() = remittanceInformation

    /** The transfer amount in USD cents. */
    @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

    /**
     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transfer's currency. For
     * real-time payments transfers this is always equal to `USD`.
     */
    @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

    /** The destination account number. */
    @JsonProperty("destination_account_number")
    @ExcludeMissing
    fun _destinationAccountNumber() = destinationAccountNumber

    /** The destination American Bankers' Association (ABA) Routing Transit Number (RTN). */
    @JsonProperty("destination_routing_number")
    @ExcludeMissing
    fun _destinationRoutingNumber() = destinationRoutingNumber

    /** The Transaction funding the transfer once it is complete. */
    @JsonProperty("transaction_id") @ExcludeMissing fun _transactionId() = transactionId

    /**
     * The ID for the pending transaction representing the transfer. A pending transaction is
     * created when the transfer
     * [requires approval](https://increase.com/documentation/transfer-approvals#transfer-approvals)
     * by someone else in your organization.
     */
    @JsonProperty("pending_transaction_id")
    @ExcludeMissing
    fun _pendingTransactionId() = pendingTransactionId

    /**
     * After the transfer is submitted to Real-Time Payments, this will contain supplemental
     * details.
     */
    @JsonProperty("submission") @ExcludeMissing fun _submission() = submission

    /**
     * If the transfer is rejected by Real-Time Payments or the destination financial institution,
     * this will contain supplemental details.
     */
    @JsonProperty("rejection") @ExcludeMissing fun _rejection() = rejection

    /**
     * The idempotency key you chose for this object. This value is unique across Increase and is
     * used to ensure that a request is only processed once. Learn more about
     * [idempotency](https://increase.com/documentation/idempotency-keys).
     */
    @JsonProperty("idempotency_key") @ExcludeMissing fun _idempotencyKey() = idempotencyKey

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): RealTimePaymentsTransfer = apply {
        if (!validated) {
            type()
            id()
            approval().map { it.validate() }
            cancellation().map { it.validate() }
            status()
            createdAt()
            accountId()
            externalAccountId()
            sourceAccountNumberId()
            ultimateCreditorName()
            ultimateDebtorName()
            debtorName()
            creditorName()
            remittanceInformation()
            amount()
            currency()
            destinationAccountNumber()
            destinationRoutingNumber()
            transactionId()
            pendingTransactionId()
            submission().map { it.validate() }
            rejection().map { it.validate() }
            idempotencyKey()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RealTimePaymentsTransfer &&
            this.type == other.type &&
            this.id == other.id &&
            this.approval == other.approval &&
            this.cancellation == other.cancellation &&
            this.status == other.status &&
            this.createdAt == other.createdAt &&
            this.accountId == other.accountId &&
            this.externalAccountId == other.externalAccountId &&
            this.sourceAccountNumberId == other.sourceAccountNumberId &&
            this.ultimateCreditorName == other.ultimateCreditorName &&
            this.ultimateDebtorName == other.ultimateDebtorName &&
            this.debtorName == other.debtorName &&
            this.creditorName == other.creditorName &&
            this.remittanceInformation == other.remittanceInformation &&
            this.amount == other.amount &&
            this.currency == other.currency &&
            this.destinationAccountNumber == other.destinationAccountNumber &&
            this.destinationRoutingNumber == other.destinationRoutingNumber &&
            this.transactionId == other.transactionId &&
            this.pendingTransactionId == other.pendingTransactionId &&
            this.submission == other.submission &&
            this.rejection == other.rejection &&
            this.idempotencyKey == other.idempotencyKey &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    type,
                    id,
                    approval,
                    cancellation,
                    status,
                    createdAt,
                    accountId,
                    externalAccountId,
                    sourceAccountNumberId,
                    ultimateCreditorName,
                    ultimateDebtorName,
                    debtorName,
                    creditorName,
                    remittanceInformation,
                    amount,
                    currency,
                    destinationAccountNumber,
                    destinationRoutingNumber,
                    transactionId,
                    pendingTransactionId,
                    submission,
                    rejection,
                    idempotencyKey,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "RealTimePaymentsTransfer{type=$type, id=$id, approval=$approval, cancellation=$cancellation, status=$status, createdAt=$createdAt, accountId=$accountId, externalAccountId=$externalAccountId, sourceAccountNumberId=$sourceAccountNumberId, ultimateCreditorName=$ultimateCreditorName, ultimateDebtorName=$ultimateDebtorName, debtorName=$debtorName, creditorName=$creditorName, remittanceInformation=$remittanceInformation, amount=$amount, currency=$currency, destinationAccountNumber=$destinationAccountNumber, destinationRoutingNumber=$destinationRoutingNumber, transactionId=$transactionId, pendingTransactionId=$pendingTransactionId, submission=$submission, rejection=$rejection, idempotencyKey=$idempotencyKey, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var type: JsonField<Type> = JsonMissing.of()
        private var id: JsonField<String> = JsonMissing.of()
        private var approval: JsonField<Approval> = JsonMissing.of()
        private var cancellation: JsonField<Cancellation> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var accountId: JsonField<String> = JsonMissing.of()
        private var externalAccountId: JsonField<String> = JsonMissing.of()
        private var sourceAccountNumberId: JsonField<String> = JsonMissing.of()
        private var ultimateCreditorName: JsonField<String> = JsonMissing.of()
        private var ultimateDebtorName: JsonField<String> = JsonMissing.of()
        private var debtorName: JsonField<String> = JsonMissing.of()
        private var creditorName: JsonField<String> = JsonMissing.of()
        private var remittanceInformation: JsonField<String> = JsonMissing.of()
        private var amount: JsonField<Long> = JsonMissing.of()
        private var currency: JsonField<Currency> = JsonMissing.of()
        private var destinationAccountNumber: JsonField<String> = JsonMissing.of()
        private var destinationRoutingNumber: JsonField<String> = JsonMissing.of()
        private var transactionId: JsonField<String> = JsonMissing.of()
        private var pendingTransactionId: JsonField<String> = JsonMissing.of()
        private var submission: JsonField<Submission> = JsonMissing.of()
        private var rejection: JsonField<Rejection> = JsonMissing.of()
        private var idempotencyKey: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(realTimePaymentsTransfer: RealTimePaymentsTransfer) = apply {
            this.type = realTimePaymentsTransfer.type
            this.id = realTimePaymentsTransfer.id
            this.approval = realTimePaymentsTransfer.approval
            this.cancellation = realTimePaymentsTransfer.cancellation
            this.status = realTimePaymentsTransfer.status
            this.createdAt = realTimePaymentsTransfer.createdAt
            this.accountId = realTimePaymentsTransfer.accountId
            this.externalAccountId = realTimePaymentsTransfer.externalAccountId
            this.sourceAccountNumberId = realTimePaymentsTransfer.sourceAccountNumberId
            this.ultimateCreditorName = realTimePaymentsTransfer.ultimateCreditorName
            this.ultimateDebtorName = realTimePaymentsTransfer.ultimateDebtorName
            this.debtorName = realTimePaymentsTransfer.debtorName
            this.creditorName = realTimePaymentsTransfer.creditorName
            this.remittanceInformation = realTimePaymentsTransfer.remittanceInformation
            this.amount = realTimePaymentsTransfer.amount
            this.currency = realTimePaymentsTransfer.currency
            this.destinationAccountNumber = realTimePaymentsTransfer.destinationAccountNumber
            this.destinationRoutingNumber = realTimePaymentsTransfer.destinationRoutingNumber
            this.transactionId = realTimePaymentsTransfer.transactionId
            this.pendingTransactionId = realTimePaymentsTransfer.pendingTransactionId
            this.submission = realTimePaymentsTransfer.submission
            this.rejection = realTimePaymentsTransfer.rejection
            this.idempotencyKey = realTimePaymentsTransfer.idempotencyKey
            additionalProperties(realTimePaymentsTransfer.additionalProperties)
        }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `real_time_payments_transfer`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * A constant representing the object's type. For this resource it will always be
         * `real_time_payments_transfer`.
         */
        @JsonProperty("type")
        @ExcludeMissing
        fun type(type: JsonField<Type>) = apply { this.type = type }

        /** The Real-Time Payments Transfer's identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The Real-Time Payments Transfer's identifier. */
        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

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

        /** The lifecycle status of the transfer. */
        fun status(status: Status) = status(JsonField.of(status))

        /** The lifecycle status of the transfer. */
        @JsonProperty("status")
        @ExcludeMissing
        fun status(status: JsonField<Status>) = apply { this.status = status }

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

        /** The Account from which the transfer was sent. */
        fun accountId(accountId: String) = accountId(JsonField.of(accountId))

        /** The Account from which the transfer was sent. */
        @JsonProperty("account_id")
        @ExcludeMissing
        fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

        /** The identifier of the External Account the transfer was made to, if any. */
        fun externalAccountId(externalAccountId: String) =
            externalAccountId(JsonField.of(externalAccountId))

        /** The identifier of the External Account the transfer was made to, if any. */
        @JsonProperty("external_account_id")
        @ExcludeMissing
        fun externalAccountId(externalAccountId: JsonField<String>) = apply {
            this.externalAccountId = externalAccountId
        }

        /** The Account Number the recipient will see as having sent the transfer. */
        fun sourceAccountNumberId(sourceAccountNumberId: String) =
            sourceAccountNumberId(JsonField.of(sourceAccountNumberId))

        /** The Account Number the recipient will see as having sent the transfer. */
        @JsonProperty("source_account_number_id")
        @ExcludeMissing
        fun sourceAccountNumberId(sourceAccountNumberId: JsonField<String>) = apply {
            this.sourceAccountNumberId = sourceAccountNumberId
        }

        /** The name of the party on whose behalf the creditor is receiving the payment. */
        fun ultimateCreditorName(ultimateCreditorName: String) =
            ultimateCreditorName(JsonField.of(ultimateCreditorName))

        /** The name of the party on whose behalf the creditor is receiving the payment. */
        @JsonProperty("ultimate_creditor_name")
        @ExcludeMissing
        fun ultimateCreditorName(ultimateCreditorName: JsonField<String>) = apply {
            this.ultimateCreditorName = ultimateCreditorName
        }

        /** The name of the the party on whose behalf the debtor is instructing the payment. */
        fun ultimateDebtorName(ultimateDebtorName: String) =
            ultimateDebtorName(JsonField.of(ultimateDebtorName))

        /** The name of the the party on whose behalf the debtor is instructing the payment. */
        @JsonProperty("ultimate_debtor_name")
        @ExcludeMissing
        fun ultimateDebtorName(ultimateDebtorName: JsonField<String>) = apply {
            this.ultimateDebtorName = ultimateDebtorName
        }

        /**
         * The name of the transfer's sender. If not provided, the account's entity name will be
         * used.
         */
        fun debtorName(debtorName: String) = debtorName(JsonField.of(debtorName))

        /**
         * The name of the transfer's sender. If not provided, the account's entity name will be
         * used.
         */
        @JsonProperty("debtor_name")
        @ExcludeMissing
        fun debtorName(debtorName: JsonField<String>) = apply { this.debtorName = debtorName }

        /** The name of the transfer's recipient as provided by the sender. */
        fun creditorName(creditorName: String) = creditorName(JsonField.of(creditorName))

        /** The name of the transfer's recipient as provided by the sender. */
        @JsonProperty("creditor_name")
        @ExcludeMissing
        fun creditorName(creditorName: JsonField<String>) = apply {
            this.creditorName = creditorName
        }

        /** Unstructured information that will show on the recipient's bank statement. */
        fun remittanceInformation(remittanceInformation: String) =
            remittanceInformation(JsonField.of(remittanceInformation))

        /** Unstructured information that will show on the recipient's bank statement. */
        @JsonProperty("remittance_information")
        @ExcludeMissing
        fun remittanceInformation(remittanceInformation: JsonField<String>) = apply {
            this.remittanceInformation = remittanceInformation
        }

        /** The transfer amount in USD cents. */
        fun amount(amount: Long) = amount(JsonField.of(amount))

        /** The transfer amount in USD cents. */
        @JsonProperty("amount")
        @ExcludeMissing
        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transfer's currency.
         * For real-time payments transfers this is always equal to `USD`.
         */
        fun currency(currency: Currency) = currency(JsonField.of(currency))

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transfer's currency.
         * For real-time payments transfers this is always equal to `USD`.
         */
        @JsonProperty("currency")
        @ExcludeMissing
        fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

        /** The destination account number. */
        fun destinationAccountNumber(destinationAccountNumber: String) =
            destinationAccountNumber(JsonField.of(destinationAccountNumber))

        /** The destination account number. */
        @JsonProperty("destination_account_number")
        @ExcludeMissing
        fun destinationAccountNumber(destinationAccountNumber: JsonField<String>) = apply {
            this.destinationAccountNumber = destinationAccountNumber
        }

        /** The destination American Bankers' Association (ABA) Routing Transit Number (RTN). */
        fun destinationRoutingNumber(destinationRoutingNumber: String) =
            destinationRoutingNumber(JsonField.of(destinationRoutingNumber))

        /** The destination American Bankers' Association (ABA) Routing Transit Number (RTN). */
        @JsonProperty("destination_routing_number")
        @ExcludeMissing
        fun destinationRoutingNumber(destinationRoutingNumber: JsonField<String>) = apply {
            this.destinationRoutingNumber = destinationRoutingNumber
        }

        /** The Transaction funding the transfer once it is complete. */
        fun transactionId(transactionId: String) = transactionId(JsonField.of(transactionId))

        /** The Transaction funding the transfer once it is complete. */
        @JsonProperty("transaction_id")
        @ExcludeMissing
        fun transactionId(transactionId: JsonField<String>) = apply {
            this.transactionId = transactionId
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

        /**
         * After the transfer is submitted to Real-Time Payments, this will contain supplemental
         * details.
         */
        fun submission(submission: Submission) = submission(JsonField.of(submission))

        /**
         * After the transfer is submitted to Real-Time Payments, this will contain supplemental
         * details.
         */
        @JsonProperty("submission")
        @ExcludeMissing
        fun submission(submission: JsonField<Submission>) = apply { this.submission = submission }

        /**
         * If the transfer is rejected by Real-Time Payments or the destination financial
         * institution, this will contain supplemental details.
         */
        fun rejection(rejection: Rejection) = rejection(JsonField.of(rejection))

        /**
         * If the transfer is rejected by Real-Time Payments or the destination financial
         * institution, this will contain supplemental details.
         */
        @JsonProperty("rejection")
        @ExcludeMissing
        fun rejection(rejection: JsonField<Rejection>) = apply { this.rejection = rejection }

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

        fun build(): RealTimePaymentsTransfer =
            RealTimePaymentsTransfer(
                type,
                id,
                approval,
                cancellation,
                status,
                createdAt,
                accountId,
                externalAccountId,
                sourceAccountNumberId,
                ultimateCreditorName,
                ultimateDebtorName,
                debtorName,
                creditorName,
                remittanceInformation,
                amount,
                currency,
                destinationAccountNumber,
                destinationRoutingNumber,
                transactionId,
                pendingTransactionId,
                submission,
                rejection,
                idempotencyKey,
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

    class Currency
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

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

    /**
     * If the transfer is rejected by Real-Time Payments or the destination financial institution,
     * this will contain supplemental details.
     */
    @JsonDeserialize(builder = Rejection.Builder::class)
    @NoAutoDetect
    class Rejection
    private constructor(
        private val rejectedAt: JsonField<OffsetDateTime>,
        private val rejectReasonCode: JsonField<RejectReasonCode>,
        private val rejectReasonAdditionalInformation: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
         * transfer was rejected.
         */
        fun rejectedAt(): Optional<OffsetDateTime> =
            Optional.ofNullable(rejectedAt.getNullable("rejected_at"))

        /**
         * The reason the transfer was rejected as provided by the recipient bank or the Real-Time
         * Payments network.
         */
        fun rejectReasonCode(): RejectReasonCode =
            rejectReasonCode.getRequired("reject_reason_code")

        /**
         * Additional information about the rejection provided by the recipient bank when the
         * `reject_reason_code` is `NARRATIVE`.
         */
        fun rejectReasonAdditionalInformation(): Optional<String> =
            Optional.ofNullable(
                rejectReasonAdditionalInformation.getNullable(
                    "reject_reason_additional_information"
                )
            )

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
         * transfer was rejected.
         */
        @JsonProperty("rejected_at") @ExcludeMissing fun _rejectedAt() = rejectedAt

        /**
         * The reason the transfer was rejected as provided by the recipient bank or the Real-Time
         * Payments network.
         */
        @JsonProperty("reject_reason_code")
        @ExcludeMissing
        fun _rejectReasonCode() = rejectReasonCode

        /**
         * Additional information about the rejection provided by the recipient bank when the
         * `reject_reason_code` is `NARRATIVE`.
         */
        @JsonProperty("reject_reason_additional_information")
        @ExcludeMissing
        fun _rejectReasonAdditionalInformation() = rejectReasonAdditionalInformation

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Rejection = apply {
            if (!validated) {
                rejectedAt()
                rejectReasonCode()
                rejectReasonAdditionalInformation()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Rejection &&
                this.rejectedAt == other.rejectedAt &&
                this.rejectReasonCode == other.rejectReasonCode &&
                this.rejectReasonAdditionalInformation == other.rejectReasonAdditionalInformation &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        rejectedAt,
                        rejectReasonCode,
                        rejectReasonAdditionalInformation,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Rejection{rejectedAt=$rejectedAt, rejectReasonCode=$rejectReasonCode, rejectReasonAdditionalInformation=$rejectReasonAdditionalInformation, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var rejectedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var rejectReasonCode: JsonField<RejectReasonCode> = JsonMissing.of()
            private var rejectReasonAdditionalInformation: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(rejection: Rejection) = apply {
                this.rejectedAt = rejection.rejectedAt
                this.rejectReasonCode = rejection.rejectReasonCode
                this.rejectReasonAdditionalInformation = rejection.rejectReasonAdditionalInformation
                additionalProperties(rejection.additionalProperties)
            }

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * transfer was rejected.
             */
            fun rejectedAt(rejectedAt: OffsetDateTime) = rejectedAt(JsonField.of(rejectedAt))

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * transfer was rejected.
             */
            @JsonProperty("rejected_at")
            @ExcludeMissing
            fun rejectedAt(rejectedAt: JsonField<OffsetDateTime>) = apply {
                this.rejectedAt = rejectedAt
            }

            /**
             * The reason the transfer was rejected as provided by the recipient bank or the
             * Real-Time Payments network.
             */
            fun rejectReasonCode(rejectReasonCode: RejectReasonCode) =
                rejectReasonCode(JsonField.of(rejectReasonCode))

            /**
             * The reason the transfer was rejected as provided by the recipient bank or the
             * Real-Time Payments network.
             */
            @JsonProperty("reject_reason_code")
            @ExcludeMissing
            fun rejectReasonCode(rejectReasonCode: JsonField<RejectReasonCode>) = apply {
                this.rejectReasonCode = rejectReasonCode
            }

            /**
             * Additional information about the rejection provided by the recipient bank when the
             * `reject_reason_code` is `NARRATIVE`.
             */
            fun rejectReasonAdditionalInformation(rejectReasonAdditionalInformation: String) =
                rejectReasonAdditionalInformation(JsonField.of(rejectReasonAdditionalInformation))

            /**
             * Additional information about the rejection provided by the recipient bank when the
             * `reject_reason_code` is `NARRATIVE`.
             */
            @JsonProperty("reject_reason_additional_information")
            @ExcludeMissing
            fun rejectReasonAdditionalInformation(
                rejectReasonAdditionalInformation: JsonField<String>
            ) = apply { this.rejectReasonAdditionalInformation = rejectReasonAdditionalInformation }

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
                    rejectedAt,
                    rejectReasonCode,
                    rejectReasonAdditionalInformation,
                    additionalProperties.toUnmodifiable(),
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

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

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

            @JvmField val PENDING_APPROVAL = Status(JsonField.of("pending_approval"))

            @JvmField val CANCELED = Status(JsonField.of("canceled"))

            @JvmField val PENDING_SUBMISSION = Status(JsonField.of("pending_submission"))

            @JvmField val SUBMITTED = Status(JsonField.of("submitted"))

            @JvmField val COMPLETE = Status(JsonField.of("complete"))

            @JvmField val REJECTED = Status(JsonField.of("rejected"))

            @JvmField val REQUIRES_ATTENTION = Status(JsonField.of("requires_attention"))

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            PENDING_APPROVAL,
            CANCELED,
            PENDING_SUBMISSION,
            SUBMITTED,
            COMPLETE,
            REJECTED,
            REQUIRES_ATTENTION,
        }

        enum class Value {
            PENDING_APPROVAL,
            CANCELED,
            PENDING_SUBMISSION,
            SUBMITTED,
            COMPLETE,
            REJECTED,
            REQUIRES_ATTENTION,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                PENDING_APPROVAL -> Value.PENDING_APPROVAL
                CANCELED -> Value.CANCELED
                PENDING_SUBMISSION -> Value.PENDING_SUBMISSION
                SUBMITTED -> Value.SUBMITTED
                COMPLETE -> Value.COMPLETE
                REJECTED -> Value.REJECTED
                REQUIRES_ATTENTION -> Value.REQUIRES_ATTENTION
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                PENDING_APPROVAL -> Known.PENDING_APPROVAL
                CANCELED -> Known.CANCELED
                PENDING_SUBMISSION -> Known.PENDING_SUBMISSION
                SUBMITTED -> Known.SUBMITTED
                COMPLETE -> Known.COMPLETE
                REJECTED -> Known.REJECTED
                REQUIRES_ATTENTION -> Known.REQUIRES_ATTENTION
                else -> throw IncreaseInvalidDataException("Unknown Status: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    /**
     * After the transfer is submitted to Real-Time Payments, this will contain supplemental
     * details.
     */
    @JsonDeserialize(builder = Submission.Builder::class)
    @NoAutoDetect
    class Submission
    private constructor(
        private val submittedAt: JsonField<OffsetDateTime>,
        private val transactionIdentification: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
         * transfer was submitted to The Clearing House.
         */
        fun submittedAt(): Optional<OffsetDateTime> =
            Optional.ofNullable(submittedAt.getNullable("submitted_at"))

        /** The Real-Time Payments network identification of the transfer. */
        fun transactionIdentification(): String =
            transactionIdentification.getRequired("transaction_identification")

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
         * transfer was submitted to The Clearing House.
         */
        @JsonProperty("submitted_at") @ExcludeMissing fun _submittedAt() = submittedAt

        /** The Real-Time Payments network identification of the transfer. */
        @JsonProperty("transaction_identification")
        @ExcludeMissing
        fun _transactionIdentification() = transactionIdentification

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Submission = apply {
            if (!validated) {
                submittedAt()
                transactionIdentification()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Submission &&
                this.submittedAt == other.submittedAt &&
                this.transactionIdentification == other.transactionIdentification &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        submittedAt,
                        transactionIdentification,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Submission{submittedAt=$submittedAt, transactionIdentification=$transactionIdentification, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var submittedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var transactionIdentification: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(submission: Submission) = apply {
                this.submittedAt = submission.submittedAt
                this.transactionIdentification = submission.transactionIdentification
                additionalProperties(submission.additionalProperties)
            }

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * transfer was submitted to The Clearing House.
             */
            fun submittedAt(submittedAt: OffsetDateTime) = submittedAt(JsonField.of(submittedAt))

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * transfer was submitted to The Clearing House.
             */
            @JsonProperty("submitted_at")
            @ExcludeMissing
            fun submittedAt(submittedAt: JsonField<OffsetDateTime>) = apply {
                this.submittedAt = submittedAt
            }

            /** The Real-Time Payments network identification of the transfer. */
            fun transactionIdentification(transactionIdentification: String) =
                transactionIdentification(JsonField.of(transactionIdentification))

            /** The Real-Time Payments network identification of the transfer. */
            @JsonProperty("transaction_identification")
            @ExcludeMissing
            fun transactionIdentification(transactionIdentification: JsonField<String>) = apply {
                this.transactionIdentification = transactionIdentification
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
                    submittedAt,
                    transactionIdentification,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

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

            @JvmField
            val REAL_TIME_PAYMENTS_TRANSFER = Type(JsonField.of("real_time_payments_transfer"))

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            REAL_TIME_PAYMENTS_TRANSFER,
        }

        enum class Value {
            REAL_TIME_PAYMENTS_TRANSFER,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                REAL_TIME_PAYMENTS_TRANSFER -> Value.REAL_TIME_PAYMENTS_TRANSFER
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                REAL_TIME_PAYMENTS_TRANSFER -> Known.REAL_TIME_PAYMENTS_TRANSFER
                else -> throw IncreaseInvalidDataException("Unknown Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
