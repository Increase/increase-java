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
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Real-Time Payments transfers move funds, within seconds, between your Increase account and any
 * other account on the Real-Time Payments network.
 */
@NoAutoDetect
class RealTimePaymentsTransfer
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("account_id")
    @ExcludeMissing
    private val accountId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("acknowledgement")
    @ExcludeMissing
    private val acknowledgement: JsonField<Acknowledgement> = JsonMissing.of(),
    @JsonProperty("amount") @ExcludeMissing private val amount: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("approval")
    @ExcludeMissing
    private val approval: JsonField<Approval> = JsonMissing.of(),
    @JsonProperty("cancellation")
    @ExcludeMissing
    private val cancellation: JsonField<Cancellation> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("created_by")
    @ExcludeMissing
    private val createdBy: JsonField<CreatedBy> = JsonMissing.of(),
    @JsonProperty("creditor_name")
    @ExcludeMissing
    private val creditorName: JsonField<String> = JsonMissing.of(),
    @JsonProperty("currency")
    @ExcludeMissing
    private val currency: JsonField<Currency> = JsonMissing.of(),
    @JsonProperty("debtor_name")
    @ExcludeMissing
    private val debtorName: JsonField<String> = JsonMissing.of(),
    @JsonProperty("destination_account_number")
    @ExcludeMissing
    private val destinationAccountNumber: JsonField<String> = JsonMissing.of(),
    @JsonProperty("destination_routing_number")
    @ExcludeMissing
    private val destinationRoutingNumber: JsonField<String> = JsonMissing.of(),
    @JsonProperty("external_account_id")
    @ExcludeMissing
    private val externalAccountId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("idempotency_key")
    @ExcludeMissing
    private val idempotencyKey: JsonField<String> = JsonMissing.of(),
    @JsonProperty("pending_transaction_id")
    @ExcludeMissing
    private val pendingTransactionId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("rejection")
    @ExcludeMissing
    private val rejection: JsonField<Rejection> = JsonMissing.of(),
    @JsonProperty("remittance_information")
    @ExcludeMissing
    private val remittanceInformation: JsonField<String> = JsonMissing.of(),
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
    @JsonProperty("ultimate_creditor_name")
    @ExcludeMissing
    private val ultimateCreditorName: JsonField<String> = JsonMissing.of(),
    @JsonProperty("ultimate_debtor_name")
    @ExcludeMissing
    private val ultimateDebtorName: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The Real-Time Payments Transfer's identifier. */
    fun id(): String = id.getRequired("id")

    /** The Account from which the transfer was sent. */
    fun accountId(): String = accountId.getRequired("account_id")

    /**
     * If the transfer is acknowledged by the recipient bank, this will contain supplemental
     * details.
     */
    fun acknowledgement(): Optional<Acknowledgement> =
        Optional.ofNullable(acknowledgement.getNullable("acknowledgement"))

    /** The transfer amount in USD cents. */
    fun amount(): Long = amount.getRequired("amount")

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

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the transfer
     * was created.
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /** What object created the transfer, either via the API or the dashboard. */
    fun createdBy(): Optional<CreatedBy> = Optional.ofNullable(createdBy.getNullable("created_by"))

    /**
     * The name of the transfer's recipient. This is set by the sender when creating the transfer.
     */
    fun creditorName(): String = creditorName.getRequired("creditor_name")

    /**
     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transfer's currency. For
     * real-time payments transfers this is always equal to `USD`.
     */
    fun currency(): Currency = currency.getRequired("currency")

    /**
     * The name of the transfer's sender. If not provided, defaults to the name of the account's
     * entity.
     */
    fun debtorName(): Optional<String> = Optional.ofNullable(debtorName.getNullable("debtor_name"))

    /** The destination account number. */
    fun destinationAccountNumber(): String =
        destinationAccountNumber.getRequired("destination_account_number")

    /** The destination American Bankers' Association (ABA) Routing Transit Number (RTN). */
    fun destinationRoutingNumber(): String =
        destinationRoutingNumber.getRequired("destination_routing_number")

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

    /**
     * The ID for the pending transaction representing the transfer. A pending transaction is
     * created when the transfer
     * [requires approval](https://increase.com/documentation/transfer-approvals#transfer-approvals)
     * by someone else in your organization.
     */
    fun pendingTransactionId(): Optional<String> =
        Optional.ofNullable(pendingTransactionId.getNullable("pending_transaction_id"))

    /**
     * If the transfer is rejected by Real-Time Payments or the destination financial institution,
     * this will contain supplemental details.
     */
    fun rejection(): Optional<Rejection> = Optional.ofNullable(rejection.getNullable("rejection"))

    /** Unstructured information that will show on the recipient's bank statement. */
    fun remittanceInformation(): String =
        remittanceInformation.getRequired("remittance_information")

    /** The Account Number the recipient will see as having sent the transfer. */
    fun sourceAccountNumberId(): String =
        sourceAccountNumberId.getRequired("source_account_number_id")

    /** The lifecycle status of the transfer. */
    fun status(): Status = status.getRequired("status")

    /**
     * After the transfer is submitted to Real-Time Payments, this will contain supplemental
     * details.
     */
    fun submission(): Optional<Submission> =
        Optional.ofNullable(submission.getNullable("submission"))

    /** The Transaction funding the transfer once it is complete. */
    fun transactionId(): Optional<String> =
        Optional.ofNullable(transactionId.getNullable("transaction_id"))

    /**
     * A constant representing the object's type. For this resource it will always be
     * `real_time_payments_transfer`.
     */
    fun type(): Type = type.getRequired("type")

    /**
     * The name of the ultimate recipient of the transfer. Set this if the creditor is an
     * intermediary receiving the payment for someone else.
     */
    fun ultimateCreditorName(): Optional<String> =
        Optional.ofNullable(ultimateCreditorName.getNullable("ultimate_creditor_name"))

    /**
     * The name of the ultimate sender of the transfer. Set this if the funds are being sent on
     * behalf of someone who is not the account holder at Increase.
     */
    fun ultimateDebtorName(): Optional<String> =
        Optional.ofNullable(ultimateDebtorName.getNullable("ultimate_debtor_name"))

    /** The Real-Time Payments Transfer's identifier. */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /** The Account from which the transfer was sent. */
    @JsonProperty("account_id") @ExcludeMissing fun _accountId(): JsonField<String> = accountId

    /**
     * If the transfer is acknowledged by the recipient bank, this will contain supplemental
     * details.
     */
    @JsonProperty("acknowledgement")
    @ExcludeMissing
    fun _acknowledgement(): JsonField<Acknowledgement> = acknowledgement

    /** The transfer amount in USD cents. */
    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

    /**
     * If your account requires approvals for transfers and the transfer was approved, this will
     * contain details of the approval.
     */
    @JsonProperty("approval") @ExcludeMissing fun _approval(): JsonField<Approval> = approval

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
     * The name of the transfer's recipient. This is set by the sender when creating the transfer.
     */
    @JsonProperty("creditor_name")
    @ExcludeMissing
    fun _creditorName(): JsonField<String> = creditorName

    /**
     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transfer's currency. For
     * real-time payments transfers this is always equal to `USD`.
     */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<Currency> = currency

    /**
     * The name of the transfer's sender. If not provided, defaults to the name of the account's
     * entity.
     */
    @JsonProperty("debtor_name") @ExcludeMissing fun _debtorName(): JsonField<String> = debtorName

    /** The destination account number. */
    @JsonProperty("destination_account_number")
    @ExcludeMissing
    fun _destinationAccountNumber(): JsonField<String> = destinationAccountNumber

    /** The destination American Bankers' Association (ABA) Routing Transit Number (RTN). */
    @JsonProperty("destination_routing_number")
    @ExcludeMissing
    fun _destinationRoutingNumber(): JsonField<String> = destinationRoutingNumber

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

    /**
     * The ID for the pending transaction representing the transfer. A pending transaction is
     * created when the transfer
     * [requires approval](https://increase.com/documentation/transfer-approvals#transfer-approvals)
     * by someone else in your organization.
     */
    @JsonProperty("pending_transaction_id")
    @ExcludeMissing
    fun _pendingTransactionId(): JsonField<String> = pendingTransactionId

    /**
     * If the transfer is rejected by Real-Time Payments or the destination financial institution,
     * this will contain supplemental details.
     */
    @JsonProperty("rejection") @ExcludeMissing fun _rejection(): JsonField<Rejection> = rejection

    /** Unstructured information that will show on the recipient's bank statement. */
    @JsonProperty("remittance_information")
    @ExcludeMissing
    fun _remittanceInformation(): JsonField<String> = remittanceInformation

    /** The Account Number the recipient will see as having sent the transfer. */
    @JsonProperty("source_account_number_id")
    @ExcludeMissing
    fun _sourceAccountNumberId(): JsonField<String> = sourceAccountNumberId

    /** The lifecycle status of the transfer. */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * After the transfer is submitted to Real-Time Payments, this will contain supplemental
     * details.
     */
    @JsonProperty("submission")
    @ExcludeMissing
    fun _submission(): JsonField<Submission> = submission

    /** The Transaction funding the transfer once it is complete. */
    @JsonProperty("transaction_id")
    @ExcludeMissing
    fun _transactionId(): JsonField<String> = transactionId

    /**
     * A constant representing the object's type. For this resource it will always be
     * `real_time_payments_transfer`.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    /**
     * The name of the ultimate recipient of the transfer. Set this if the creditor is an
     * intermediary receiving the payment for someone else.
     */
    @JsonProperty("ultimate_creditor_name")
    @ExcludeMissing
    fun _ultimateCreditorName(): JsonField<String> = ultimateCreditorName

    /**
     * The name of the ultimate sender of the transfer. Set this if the funds are being sent on
     * behalf of someone who is not the account holder at Increase.
     */
    @JsonProperty("ultimate_debtor_name")
    @ExcludeMissing
    fun _ultimateDebtorName(): JsonField<String> = ultimateDebtorName

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): RealTimePaymentsTransfer = apply {
        if (validated) {
            return@apply
        }

        id()
        accountId()
        acknowledgement().ifPresent { it.validate() }
        amount()
        approval().ifPresent { it.validate() }
        cancellation().ifPresent { it.validate() }
        createdAt()
        createdBy().ifPresent { it.validate() }
        creditorName()
        currency()
        debtorName()
        destinationAccountNumber()
        destinationRoutingNumber()
        externalAccountId()
        idempotencyKey()
        pendingTransactionId()
        rejection().ifPresent { it.validate() }
        remittanceInformation()
        sourceAccountNumberId()
        status()
        submission().ifPresent { it.validate() }
        transactionId()
        type()
        ultimateCreditorName()
        ultimateDebtorName()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [RealTimePaymentsTransfer].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .accountId()
         * .acknowledgement()
         * .amount()
         * .approval()
         * .cancellation()
         * .createdAt()
         * .createdBy()
         * .creditorName()
         * .currency()
         * .debtorName()
         * .destinationAccountNumber()
         * .destinationRoutingNumber()
         * .externalAccountId()
         * .idempotencyKey()
         * .pendingTransactionId()
         * .rejection()
         * .remittanceInformation()
         * .sourceAccountNumberId()
         * .status()
         * .submission()
         * .transactionId()
         * .type()
         * .ultimateCreditorName()
         * .ultimateDebtorName()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RealTimePaymentsTransfer]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var accountId: JsonField<String>? = null
        private var acknowledgement: JsonField<Acknowledgement>? = null
        private var amount: JsonField<Long>? = null
        private var approval: JsonField<Approval>? = null
        private var cancellation: JsonField<Cancellation>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var createdBy: JsonField<CreatedBy>? = null
        private var creditorName: JsonField<String>? = null
        private var currency: JsonField<Currency>? = null
        private var debtorName: JsonField<String>? = null
        private var destinationAccountNumber: JsonField<String>? = null
        private var destinationRoutingNumber: JsonField<String>? = null
        private var externalAccountId: JsonField<String>? = null
        private var idempotencyKey: JsonField<String>? = null
        private var pendingTransactionId: JsonField<String>? = null
        private var rejection: JsonField<Rejection>? = null
        private var remittanceInformation: JsonField<String>? = null
        private var sourceAccountNumberId: JsonField<String>? = null
        private var status: JsonField<Status>? = null
        private var submission: JsonField<Submission>? = null
        private var transactionId: JsonField<String>? = null
        private var type: JsonField<Type>? = null
        private var ultimateCreditorName: JsonField<String>? = null
        private var ultimateDebtorName: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(realTimePaymentsTransfer: RealTimePaymentsTransfer) = apply {
            id = realTimePaymentsTransfer.id
            accountId = realTimePaymentsTransfer.accountId
            acknowledgement = realTimePaymentsTransfer.acknowledgement
            amount = realTimePaymentsTransfer.amount
            approval = realTimePaymentsTransfer.approval
            cancellation = realTimePaymentsTransfer.cancellation
            createdAt = realTimePaymentsTransfer.createdAt
            createdBy = realTimePaymentsTransfer.createdBy
            creditorName = realTimePaymentsTransfer.creditorName
            currency = realTimePaymentsTransfer.currency
            debtorName = realTimePaymentsTransfer.debtorName
            destinationAccountNumber = realTimePaymentsTransfer.destinationAccountNumber
            destinationRoutingNumber = realTimePaymentsTransfer.destinationRoutingNumber
            externalAccountId = realTimePaymentsTransfer.externalAccountId
            idempotencyKey = realTimePaymentsTransfer.idempotencyKey
            pendingTransactionId = realTimePaymentsTransfer.pendingTransactionId
            rejection = realTimePaymentsTransfer.rejection
            remittanceInformation = realTimePaymentsTransfer.remittanceInformation
            sourceAccountNumberId = realTimePaymentsTransfer.sourceAccountNumberId
            status = realTimePaymentsTransfer.status
            submission = realTimePaymentsTransfer.submission
            transactionId = realTimePaymentsTransfer.transactionId
            type = realTimePaymentsTransfer.type
            ultimateCreditorName = realTimePaymentsTransfer.ultimateCreditorName
            ultimateDebtorName = realTimePaymentsTransfer.ultimateDebtorName
            additionalProperties = realTimePaymentsTransfer.additionalProperties.toMutableMap()
        }

        /** The Real-Time Payments Transfer's identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The Real-Time Payments Transfer's identifier. */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The Account from which the transfer was sent. */
        fun accountId(accountId: String) = accountId(JsonField.of(accountId))

        /** The Account from which the transfer was sent. */
        fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

        /**
         * If the transfer is acknowledged by the recipient bank, this will contain supplemental
         * details.
         */
        fun acknowledgement(acknowledgement: Acknowledgement?) =
            acknowledgement(JsonField.ofNullable(acknowledgement))

        /**
         * If the transfer is acknowledged by the recipient bank, this will contain supplemental
         * details.
         */
        fun acknowledgement(acknowledgement: Optional<Acknowledgement>) =
            acknowledgement(acknowledgement.getOrNull())

        /**
         * If the transfer is acknowledged by the recipient bank, this will contain supplemental
         * details.
         */
        fun acknowledgement(acknowledgement: JsonField<Acknowledgement>) = apply {
            this.acknowledgement = acknowledgement
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
        fun approval(approval: Optional<Approval>) = approval(approval.getOrNull())

        /**
         * If your account requires approvals for transfers and the transfer was approved, this will
         * contain details of the approval.
         */
        fun approval(approval: JsonField<Approval>) = apply { this.approval = approval }

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
            cancellation(cancellation.getOrNull())

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
        fun createdBy(createdBy: Optional<CreatedBy>) = createdBy(createdBy.getOrNull())

        /** What object created the transfer, either via the API or the dashboard. */
        fun createdBy(createdBy: JsonField<CreatedBy>) = apply { this.createdBy = createdBy }

        /**
         * The name of the transfer's recipient. This is set by the sender when creating the
         * transfer.
         */
        fun creditorName(creditorName: String) = creditorName(JsonField.of(creditorName))

        /**
         * The name of the transfer's recipient. This is set by the sender when creating the
         * transfer.
         */
        fun creditorName(creditorName: JsonField<String>) = apply {
            this.creditorName = creditorName
        }

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transfer's currency.
         * For real-time payments transfers this is always equal to `USD`.
         */
        fun currency(currency: Currency) = currency(JsonField.of(currency))

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transfer's currency.
         * For real-time payments transfers this is always equal to `USD`.
         */
        fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

        /**
         * The name of the transfer's sender. If not provided, defaults to the name of the account's
         * entity.
         */
        fun debtorName(debtorName: String?) = debtorName(JsonField.ofNullable(debtorName))

        /**
         * The name of the transfer's sender. If not provided, defaults to the name of the account's
         * entity.
         */
        fun debtorName(debtorName: Optional<String>) = debtorName(debtorName.getOrNull())

        /**
         * The name of the transfer's sender. If not provided, defaults to the name of the account's
         * entity.
         */
        fun debtorName(debtorName: JsonField<String>) = apply { this.debtorName = debtorName }

        /** The destination account number. */
        fun destinationAccountNumber(destinationAccountNumber: String) =
            destinationAccountNumber(JsonField.of(destinationAccountNumber))

        /** The destination account number. */
        fun destinationAccountNumber(destinationAccountNumber: JsonField<String>) = apply {
            this.destinationAccountNumber = destinationAccountNumber
        }

        /** The destination American Bankers' Association (ABA) Routing Transit Number (RTN). */
        fun destinationRoutingNumber(destinationRoutingNumber: String) =
            destinationRoutingNumber(JsonField.of(destinationRoutingNumber))

        /** The destination American Bankers' Association (ABA) Routing Transit Number (RTN). */
        fun destinationRoutingNumber(destinationRoutingNumber: JsonField<String>) = apply {
            this.destinationRoutingNumber = destinationRoutingNumber
        }

        /** The identifier of the External Account the transfer was made to, if any. */
        fun externalAccountId(externalAccountId: String?) =
            externalAccountId(JsonField.ofNullable(externalAccountId))

        /** The identifier of the External Account the transfer was made to, if any. */
        fun externalAccountId(externalAccountId: Optional<String>) =
            externalAccountId(externalAccountId.getOrNull())

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
            idempotencyKey(idempotencyKey.getOrNull())

        /**
         * The idempotency key you chose for this object. This value is unique across Increase and
         * is used to ensure that a request is only processed once. Learn more about
         * [idempotency](https://increase.com/documentation/idempotency-keys).
         */
        fun idempotencyKey(idempotencyKey: JsonField<String>) = apply {
            this.idempotencyKey = idempotencyKey
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
            pendingTransactionId(pendingTransactionId.getOrNull())

        /**
         * The ID for the pending transaction representing the transfer. A pending transaction is
         * created when the transfer
         * [requires approval](https://increase.com/documentation/transfer-approvals#transfer-approvals)
         * by someone else in your organization.
         */
        fun pendingTransactionId(pendingTransactionId: JsonField<String>) = apply {
            this.pendingTransactionId = pendingTransactionId
        }

        /**
         * If the transfer is rejected by Real-Time Payments or the destination financial
         * institution, this will contain supplemental details.
         */
        fun rejection(rejection: Rejection?) = rejection(JsonField.ofNullable(rejection))

        /**
         * If the transfer is rejected by Real-Time Payments or the destination financial
         * institution, this will contain supplemental details.
         */
        fun rejection(rejection: Optional<Rejection>) = rejection(rejection.getOrNull())

        /**
         * If the transfer is rejected by Real-Time Payments or the destination financial
         * institution, this will contain supplemental details.
         */
        fun rejection(rejection: JsonField<Rejection>) = apply { this.rejection = rejection }

        /** Unstructured information that will show on the recipient's bank statement. */
        fun remittanceInformation(remittanceInformation: String) =
            remittanceInformation(JsonField.of(remittanceInformation))

        /** Unstructured information that will show on the recipient's bank statement. */
        fun remittanceInformation(remittanceInformation: JsonField<String>) = apply {
            this.remittanceInformation = remittanceInformation
        }

        /** The Account Number the recipient will see as having sent the transfer. */
        fun sourceAccountNumberId(sourceAccountNumberId: String) =
            sourceAccountNumberId(JsonField.of(sourceAccountNumberId))

        /** The Account Number the recipient will see as having sent the transfer. */
        fun sourceAccountNumberId(sourceAccountNumberId: JsonField<String>) = apply {
            this.sourceAccountNumberId = sourceAccountNumberId
        }

        /** The lifecycle status of the transfer. */
        fun status(status: Status) = status(JsonField.of(status))

        /** The lifecycle status of the transfer. */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /**
         * After the transfer is submitted to Real-Time Payments, this will contain supplemental
         * details.
         */
        fun submission(submission: Submission?) = submission(JsonField.ofNullable(submission))

        /**
         * After the transfer is submitted to Real-Time Payments, this will contain supplemental
         * details.
         */
        fun submission(submission: Optional<Submission>) = submission(submission.getOrNull())

        /**
         * After the transfer is submitted to Real-Time Payments, this will contain supplemental
         * details.
         */
        fun submission(submission: JsonField<Submission>) = apply { this.submission = submission }

        /** The Transaction funding the transfer once it is complete. */
        fun transactionId(transactionId: String?) =
            transactionId(JsonField.ofNullable(transactionId))

        /** The Transaction funding the transfer once it is complete. */
        fun transactionId(transactionId: Optional<String>) =
            transactionId(transactionId.getOrNull())

        /** The Transaction funding the transfer once it is complete. */
        fun transactionId(transactionId: JsonField<String>) = apply {
            this.transactionId = transactionId
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
        fun type(type: JsonField<Type>) = apply { this.type = type }

        /**
         * The name of the ultimate recipient of the transfer. Set this if the creditor is an
         * intermediary receiving the payment for someone else.
         */
        fun ultimateCreditorName(ultimateCreditorName: String?) =
            ultimateCreditorName(JsonField.ofNullable(ultimateCreditorName))

        /**
         * The name of the ultimate recipient of the transfer. Set this if the creditor is an
         * intermediary receiving the payment for someone else.
         */
        fun ultimateCreditorName(ultimateCreditorName: Optional<String>) =
            ultimateCreditorName(ultimateCreditorName.getOrNull())

        /**
         * The name of the ultimate recipient of the transfer. Set this if the creditor is an
         * intermediary receiving the payment for someone else.
         */
        fun ultimateCreditorName(ultimateCreditorName: JsonField<String>) = apply {
            this.ultimateCreditorName = ultimateCreditorName
        }

        /**
         * The name of the ultimate sender of the transfer. Set this if the funds are being sent on
         * behalf of someone who is not the account holder at Increase.
         */
        fun ultimateDebtorName(ultimateDebtorName: String?) =
            ultimateDebtorName(JsonField.ofNullable(ultimateDebtorName))

        /**
         * The name of the ultimate sender of the transfer. Set this if the funds are being sent on
         * behalf of someone who is not the account holder at Increase.
         */
        fun ultimateDebtorName(ultimateDebtorName: Optional<String>) =
            ultimateDebtorName(ultimateDebtorName.getOrNull())

        /**
         * The name of the ultimate sender of the transfer. Set this if the funds are being sent on
         * behalf of someone who is not the account holder at Increase.
         */
        fun ultimateDebtorName(ultimateDebtorName: JsonField<String>) = apply {
            this.ultimateDebtorName = ultimateDebtorName
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

        fun build(): RealTimePaymentsTransfer =
            RealTimePaymentsTransfer(
                checkRequired("id", id),
                checkRequired("accountId", accountId),
                checkRequired("acknowledgement", acknowledgement),
                checkRequired("amount", amount),
                checkRequired("approval", approval),
                checkRequired("cancellation", cancellation),
                checkRequired("createdAt", createdAt),
                checkRequired("createdBy", createdBy),
                checkRequired("creditorName", creditorName),
                checkRequired("currency", currency),
                checkRequired("debtorName", debtorName),
                checkRequired("destinationAccountNumber", destinationAccountNumber),
                checkRequired("destinationRoutingNumber", destinationRoutingNumber),
                checkRequired("externalAccountId", externalAccountId),
                checkRequired("idempotencyKey", idempotencyKey),
                checkRequired("pendingTransactionId", pendingTransactionId),
                checkRequired("rejection", rejection),
                checkRequired("remittanceInformation", remittanceInformation),
                checkRequired("sourceAccountNumberId", sourceAccountNumberId),
                checkRequired("status", status),
                checkRequired("submission", submission),
                checkRequired("transactionId", transactionId),
                checkRequired("type", type),
                checkRequired("ultimateCreditorName", ultimateCreditorName),
                checkRequired("ultimateDebtorName", ultimateDebtorName),
                additionalProperties.toImmutable(),
            )
    }

    /**
     * If the transfer is acknowledged by the recipient bank, this will contain supplemental
     * details.
     */
    @NoAutoDetect
    class Acknowledgement
    @JsonCreator
    private constructor(
        @JsonProperty("acknowledged_at")
        @ExcludeMissing
        private val acknowledgedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** When the transfer was acknowledged. */
        fun acknowledgedAt(): OffsetDateTime = acknowledgedAt.getRequired("acknowledged_at")

        /** When the transfer was acknowledged. */
        @JsonProperty("acknowledged_at")
        @ExcludeMissing
        fun _acknowledgedAt(): JsonField<OffsetDateTime> = acknowledgedAt

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Acknowledgement = apply {
            if (validated) {
                return@apply
            }

            acknowledgedAt()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Acknowledgement].
             *
             * The following fields are required:
             * ```java
             * .acknowledgedAt()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Acknowledgement]. */
        class Builder internal constructor() {

            private var acknowledgedAt: JsonField<OffsetDateTime>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(acknowledgement: Acknowledgement) = apply {
                acknowledgedAt = acknowledgement.acknowledgedAt
                additionalProperties = acknowledgement.additionalProperties.toMutableMap()
            }

            /** When the transfer was acknowledged. */
            fun acknowledgedAt(acknowledgedAt: OffsetDateTime) =
                acknowledgedAt(JsonField.of(acknowledgedAt))

            /** When the transfer was acknowledged. */
            fun acknowledgedAt(acknowledgedAt: JsonField<OffsetDateTime>) = apply {
                this.acknowledgedAt = acknowledgedAt
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

            fun build(): Acknowledgement =
                Acknowledgement(
                    checkRequired("acknowledgedAt", acknowledgedAt),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Acknowledgement && acknowledgedAt == other.acknowledgedAt && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(acknowledgedAt, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Acknowledgement{acknowledgedAt=$acknowledgedAt, additionalProperties=$additionalProperties}"
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

            /**
             * Returns a mutable builder for constructing an instance of [Approval].
             *
             * The following fields are required:
             * ```java
             * .approvedAt()
             * .approvedBy()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Approval]. */
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
            fun approvedBy(approvedBy: Optional<String>) = approvedBy(approvedBy.getOrNull())

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

            /**
             * Returns a mutable builder for constructing an instance of [Cancellation].
             *
             * The following fields are required:
             * ```java
             * .canceledAt()
             * .canceledBy()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Cancellation]. */
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
            fun canceledBy(canceledBy: Optional<String>) = canceledBy(canceledBy.getOrNull())

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

            /**
             * Returns a mutable builder for constructing an instance of [CreatedBy].
             *
             * The following fields are required:
             * ```java
             * .apiKey()
             * .category()
             * .oauthApplication()
             * .user()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CreatedBy]. */
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
            fun apiKey(apiKey: Optional<ApiKey>) = apiKey(apiKey.getOrNull())

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
                oauthApplication(oauthApplication.getOrNull())

            /** If present, details about the OAuth Application that created the transfer. */
            fun oauthApplication(oauthApplication: JsonField<OAuthApplication>) = apply {
                this.oauthApplication = oauthApplication
            }

            /** If present, details about the User that created the transfer. */
            fun user(user: User?) = user(JsonField.ofNullable(user))

            /** If present, details about the User that created the transfer. */
            fun user(user: Optional<User>) = user(user.getOrNull())

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

                /**
                 * Returns a mutable builder for constructing an instance of [ApiKey].
                 *
                 * The following fields are required:
                 * ```java
                 * .description()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ApiKey]. */
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
                    description(description.getOrNull())

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
                        additionalProperties.toImmutable(),
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
        class Category @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

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

            /** An enum containing [Category]'s known values. */
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

            /**
             * An enum containing [Category]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Category] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
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
                /**
                 * An enum member indicating that [Category] was instantiated with an unknown value.
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
                    API_KEY -> Value.API_KEY
                    OAUTH_APPLICATION -> Value.OAUTH_APPLICATION
                    USER -> Value.USER
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
                    API_KEY -> Known.API_KEY
                    OAUTH_APPLICATION -> Known.OAUTH_APPLICATION
                    USER -> Known.USER
                    else -> throw IncreaseInvalidDataException("Unknown Category: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws IncreaseInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    IncreaseInvalidDataException("Value is not a String")
                }

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

                /**
                 * Returns a mutable builder for constructing an instance of [OAuthApplication].
                 *
                 * The following fields are required:
                 * ```java
                 * .name()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [OAuthApplication]. */
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
                        additionalProperties.toImmutable(),
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

                /**
                 * Returns a mutable builder for constructing an instance of [User].
                 *
                 * The following fields are required:
                 * ```java
                 * .email()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [User]. */
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
     * real-time payments transfers this is always equal to `USD`.
     */
    class Currency @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
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

        /** An enum containing [Currency]'s known values. */
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

        /**
         * An enum containing [Currency]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Currency] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
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
            /** An enum member indicating that [Currency] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
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

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws IncreaseInvalidDataException if this class instance's value is a not a known
         *   member.
         */
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

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws IncreaseInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                IncreaseInvalidDataException("Value is not a String")
            }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Currency && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * If the transfer is rejected by Real-Time Payments or the destination financial institution,
     * this will contain supplemental details.
     */
    @NoAutoDetect
    class Rejection
    @JsonCreator
    private constructor(
        @JsonProperty("reject_reason_additional_information")
        @ExcludeMissing
        private val rejectReasonAdditionalInformation: JsonField<String> = JsonMissing.of(),
        @JsonProperty("reject_reason_code")
        @ExcludeMissing
        private val rejectReasonCode: JsonField<RejectReasonCode> = JsonMissing.of(),
        @JsonProperty("rejected_at")
        @ExcludeMissing
        private val rejectedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

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
         * The reason the transfer was rejected as provided by the recipient bank or the Real-Time
         * Payments network.
         */
        fun rejectReasonCode(): RejectReasonCode =
            rejectReasonCode.getRequired("reject_reason_code")

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
         * transfer was rejected.
         */
        fun rejectedAt(): Optional<OffsetDateTime> =
            Optional.ofNullable(rejectedAt.getNullable("rejected_at"))

        /**
         * Additional information about the rejection provided by the recipient bank when the
         * `reject_reason_code` is `NARRATIVE`.
         */
        @JsonProperty("reject_reason_additional_information")
        @ExcludeMissing
        fun _rejectReasonAdditionalInformation(): JsonField<String> =
            rejectReasonAdditionalInformation

        /**
         * The reason the transfer was rejected as provided by the recipient bank or the Real-Time
         * Payments network.
         */
        @JsonProperty("reject_reason_code")
        @ExcludeMissing
        fun _rejectReasonCode(): JsonField<RejectReasonCode> = rejectReasonCode

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
         * transfer was rejected.
         */
        @JsonProperty("rejected_at")
        @ExcludeMissing
        fun _rejectedAt(): JsonField<OffsetDateTime> = rejectedAt

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Rejection = apply {
            if (validated) {
                return@apply
            }

            rejectReasonAdditionalInformation()
            rejectReasonCode()
            rejectedAt()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Rejection].
             *
             * The following fields are required:
             * ```java
             * .rejectReasonAdditionalInformation()
             * .rejectReasonCode()
             * .rejectedAt()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Rejection]. */
        class Builder internal constructor() {

            private var rejectReasonAdditionalInformation: JsonField<String>? = null
            private var rejectReasonCode: JsonField<RejectReasonCode>? = null
            private var rejectedAt: JsonField<OffsetDateTime>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(rejection: Rejection) = apply {
                rejectReasonAdditionalInformation = rejection.rejectReasonAdditionalInformation
                rejectReasonCode = rejection.rejectReasonCode
                rejectedAt = rejection.rejectedAt
                additionalProperties = rejection.additionalProperties.toMutableMap()
            }

            /**
             * Additional information about the rejection provided by the recipient bank when the
             * `reject_reason_code` is `NARRATIVE`.
             */
            fun rejectReasonAdditionalInformation(rejectReasonAdditionalInformation: String?) =
                rejectReasonAdditionalInformation(
                    JsonField.ofNullable(rejectReasonAdditionalInformation)
                )

            /**
             * Additional information about the rejection provided by the recipient bank when the
             * `reject_reason_code` is `NARRATIVE`.
             */
            fun rejectReasonAdditionalInformation(
                rejectReasonAdditionalInformation: Optional<String>
            ) = rejectReasonAdditionalInformation(rejectReasonAdditionalInformation.getOrNull())

            /**
             * Additional information about the rejection provided by the recipient bank when the
             * `reject_reason_code` is `NARRATIVE`.
             */
            fun rejectReasonAdditionalInformation(
                rejectReasonAdditionalInformation: JsonField<String>
            ) = apply { this.rejectReasonAdditionalInformation = rejectReasonAdditionalInformation }

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
            fun rejectReasonCode(rejectReasonCode: JsonField<RejectReasonCode>) = apply {
                this.rejectReasonCode = rejectReasonCode
            }

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * transfer was rejected.
             */
            fun rejectedAt(rejectedAt: OffsetDateTime?) =
                rejectedAt(JsonField.ofNullable(rejectedAt))

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * transfer was rejected.
             */
            fun rejectedAt(rejectedAt: Optional<OffsetDateTime>) =
                rejectedAt(rejectedAt.getOrNull())

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * transfer was rejected.
             */
            fun rejectedAt(rejectedAt: JsonField<OffsetDateTime>) = apply {
                this.rejectedAt = rejectedAt
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
                    checkRequired(
                        "rejectReasonAdditionalInformation",
                        rejectReasonAdditionalInformation,
                    ),
                    checkRequired("rejectReasonCode", rejectReasonCode),
                    checkRequired("rejectedAt", rejectedAt),
                    additionalProperties.toImmutable(),
                )
        }

        /**
         * The reason the transfer was rejected as provided by the recipient bank or the Real-Time
         * Payments network.
         */
        class RejectReasonCode
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

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

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws IncreaseInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    IncreaseInvalidDataException("Value is not a String")
                }

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

            return /* spotless:off */ other is Rejection && rejectReasonAdditionalInformation == other.rejectReasonAdditionalInformation && rejectReasonCode == other.rejectReasonCode && rejectedAt == other.rejectedAt && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(rejectReasonAdditionalInformation, rejectReasonCode, rejectedAt, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Rejection{rejectReasonAdditionalInformation=$rejectReasonAdditionalInformation, rejectReasonCode=$rejectReasonCode, rejectedAt=$rejectedAt, additionalProperties=$additionalProperties}"
    }

    /** The lifecycle status of the transfer. */
    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            /** The transfer is pending approval. */
            @JvmField val PENDING_APPROVAL = of("pending_approval")

            /** The transfer has been canceled. */
            @JvmField val CANCELED = of("canceled")

            /** The transfer is pending review by Increase. */
            @JvmField val PENDING_REVIEWING = of("pending_reviewing")

            /** The transfer requires attention from an Increase operator. */
            @JvmField val REQUIRES_ATTENTION = of("requires_attention")

            /** The transfer was rejected by the network or the recipient's bank. */
            @JvmField val REJECTED = of("rejected")

            /** The transfer is queued to be submitted to Real-Time Payments. */
            @JvmField val PENDING_SUBMISSION = of("pending_submission")

            /**
             * The transfer has been submitted and is pending a response from Real-Time Payments.
             */
            @JvmField val SUBMITTED = of("submitted")

            /** The transfer has been sent successfully and is complete. */
            @JvmField val COMPLETE = of("complete")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            /** The transfer is pending approval. */
            PENDING_APPROVAL,
            /** The transfer has been canceled. */
            CANCELED,
            /** The transfer is pending review by Increase. */
            PENDING_REVIEWING,
            /** The transfer requires attention from an Increase operator. */
            REQUIRES_ATTENTION,
            /** The transfer was rejected by the network or the recipient's bank. */
            REJECTED,
            /** The transfer is queued to be submitted to Real-Time Payments. */
            PENDING_SUBMISSION,
            /**
             * The transfer has been submitted and is pending a response from Real-Time Payments.
             */
            SUBMITTED,
            /** The transfer has been sent successfully and is complete. */
            COMPLETE,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            /** The transfer is pending approval. */
            PENDING_APPROVAL,
            /** The transfer has been canceled. */
            CANCELED,
            /** The transfer is pending review by Increase. */
            PENDING_REVIEWING,
            /** The transfer requires attention from an Increase operator. */
            REQUIRES_ATTENTION,
            /** The transfer was rejected by the network or the recipient's bank. */
            REJECTED,
            /** The transfer is queued to be submitted to Real-Time Payments. */
            PENDING_SUBMISSION,
            /**
             * The transfer has been submitted and is pending a response from Real-Time Payments.
             */
            SUBMITTED,
            /** The transfer has been sent successfully and is complete. */
            COMPLETE,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                PENDING_APPROVAL -> Value.PENDING_APPROVAL
                CANCELED -> Value.CANCELED
                PENDING_REVIEWING -> Value.PENDING_REVIEWING
                REQUIRES_ATTENTION -> Value.REQUIRES_ATTENTION
                REJECTED -> Value.REJECTED
                PENDING_SUBMISSION -> Value.PENDING_SUBMISSION
                SUBMITTED -> Value.SUBMITTED
                COMPLETE -> Value.COMPLETE
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws IncreaseInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                PENDING_APPROVAL -> Known.PENDING_APPROVAL
                CANCELED -> Known.CANCELED
                PENDING_REVIEWING -> Known.PENDING_REVIEWING
                REQUIRES_ATTENTION -> Known.REQUIRES_ATTENTION
                REJECTED -> Known.REJECTED
                PENDING_SUBMISSION -> Known.PENDING_SUBMISSION
                SUBMITTED -> Known.SUBMITTED
                COMPLETE -> Known.COMPLETE
                else -> throw IncreaseInvalidDataException("Unknown Status: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws IncreaseInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                IncreaseInvalidDataException("Value is not a String")
            }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Status && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * After the transfer is submitted to Real-Time Payments, this will contain supplemental
     * details.
     */
    @NoAutoDetect
    class Submission
    @JsonCreator
    private constructor(
        @JsonProperty("submitted_at")
        @ExcludeMissing
        private val submittedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("transaction_identification")
        @ExcludeMissing
        private val transactionIdentification: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

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
        @JsonProperty("submitted_at")
        @ExcludeMissing
        fun _submittedAt(): JsonField<OffsetDateTime> = submittedAt

        /** The Real-Time Payments network identification of the transfer. */
        @JsonProperty("transaction_identification")
        @ExcludeMissing
        fun _transactionIdentification(): JsonField<String> = transactionIdentification

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Submission = apply {
            if (validated) {
                return@apply
            }

            submittedAt()
            transactionIdentification()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Submission].
             *
             * The following fields are required:
             * ```java
             * .submittedAt()
             * .transactionIdentification()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Submission]. */
        class Builder internal constructor() {

            private var submittedAt: JsonField<OffsetDateTime>? = null
            private var transactionIdentification: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(submission: Submission) = apply {
                submittedAt = submission.submittedAt
                transactionIdentification = submission.transactionIdentification
                additionalProperties = submission.additionalProperties.toMutableMap()
            }

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * transfer was submitted to The Clearing House.
             */
            fun submittedAt(submittedAt: OffsetDateTime?) =
                submittedAt(JsonField.ofNullable(submittedAt))

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * transfer was submitted to The Clearing House.
             */
            fun submittedAt(submittedAt: Optional<OffsetDateTime>) =
                submittedAt(submittedAt.getOrNull())

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * transfer was submitted to The Clearing House.
             */
            fun submittedAt(submittedAt: JsonField<OffsetDateTime>) = apply {
                this.submittedAt = submittedAt
            }

            /** The Real-Time Payments network identification of the transfer. */
            fun transactionIdentification(transactionIdentification: String) =
                transactionIdentification(JsonField.of(transactionIdentification))

            /** The Real-Time Payments network identification of the transfer. */
            fun transactionIdentification(transactionIdentification: JsonField<String>) = apply {
                this.transactionIdentification = transactionIdentification
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
                    checkRequired("submittedAt", submittedAt),
                    checkRequired("transactionIdentification", transactionIdentification),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Submission && submittedAt == other.submittedAt && transactionIdentification == other.transactionIdentification && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(submittedAt, transactionIdentification, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Submission{submittedAt=$submittedAt, transactionIdentification=$transactionIdentification, additionalProperties=$additionalProperties}"
    }

    /**
     * A constant representing the object's type. For this resource it will always be
     * `real_time_payments_transfer`.
     */
    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val REAL_TIME_PAYMENTS_TRANSFER = of("real_time_payments_transfer")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            REAL_TIME_PAYMENTS_TRANSFER
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            REAL_TIME_PAYMENTS_TRANSFER,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                REAL_TIME_PAYMENTS_TRANSFER -> Value.REAL_TIME_PAYMENTS_TRANSFER
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws IncreaseInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                REAL_TIME_PAYMENTS_TRANSFER -> Known.REAL_TIME_PAYMENTS_TRANSFER
                else -> throw IncreaseInvalidDataException("Unknown Type: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws IncreaseInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                IncreaseInvalidDataException("Value is not a String")
            }

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

        return /* spotless:off */ other is RealTimePaymentsTransfer && id == other.id && accountId == other.accountId && acknowledgement == other.acknowledgement && amount == other.amount && approval == other.approval && cancellation == other.cancellation && createdAt == other.createdAt && createdBy == other.createdBy && creditorName == other.creditorName && currency == other.currency && debtorName == other.debtorName && destinationAccountNumber == other.destinationAccountNumber && destinationRoutingNumber == other.destinationRoutingNumber && externalAccountId == other.externalAccountId && idempotencyKey == other.idempotencyKey && pendingTransactionId == other.pendingTransactionId && rejection == other.rejection && remittanceInformation == other.remittanceInformation && sourceAccountNumberId == other.sourceAccountNumberId && status == other.status && submission == other.submission && transactionId == other.transactionId && type == other.type && ultimateCreditorName == other.ultimateCreditorName && ultimateDebtorName == other.ultimateDebtorName && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, accountId, acknowledgement, amount, approval, cancellation, createdAt, createdBy, creditorName, currency, debtorName, destinationAccountNumber, destinationRoutingNumber, externalAccountId, idempotencyKey, pendingTransactionId, rejection, remittanceInformation, sourceAccountNumberId, status, submission, transactionId, type, ultimateCreditorName, ultimateDebtorName, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RealTimePaymentsTransfer{id=$id, accountId=$accountId, acknowledgement=$acknowledgement, amount=$amount, approval=$approval, cancellation=$cancellation, createdAt=$createdAt, createdBy=$createdBy, creditorName=$creditorName, currency=$currency, debtorName=$debtorName, destinationAccountNumber=$destinationAccountNumber, destinationRoutingNumber=$destinationRoutingNumber, externalAccountId=$externalAccountId, idempotencyKey=$idempotencyKey, pendingTransactionId=$pendingTransactionId, rejection=$rejection, remittanceInformation=$remittanceInformation, sourceAccountNumberId=$sourceAccountNumberId, status=$status, submission=$submission, transactionId=$transactionId, type=$type, ultimateCreditorName=$ultimateCreditorName, ultimateDebtorName=$ultimateDebtorName, additionalProperties=$additionalProperties}"
}
