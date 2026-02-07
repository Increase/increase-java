// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.wiretransfers

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.increase.api.core.Enum
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.checkRequired
import com.increase.api.errors.IncreaseInvalidDataException
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Wire transfers move funds between your Increase account and any other account accessible by
 * Fedwire.
 */
class WireTransfer
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val accountId: JsonField<String>,
    private val accountNumber: JsonField<String>,
    private val amount: JsonField<Long>,
    private val approval: JsonField<Approval>,
    private val cancellation: JsonField<Cancellation>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<CreatedBy>,
    private val creditor: JsonField<Creditor>,
    private val currency: JsonField<Currency>,
    private val debtor: JsonField<Debtor>,
    private val externalAccountId: JsonField<String>,
    private val idempotencyKey: JsonField<String>,
    private val inboundWireDrawdownRequestId: JsonField<String>,
    private val network: JsonField<Network>,
    private val pendingTransactionId: JsonField<String>,
    private val remittance: JsonField<Remittance>,
    private val reversal: JsonField<Reversal>,
    private val routingNumber: JsonField<String>,
    private val sourceAccountNumberId: JsonField<String>,
    private val status: JsonField<Status>,
    private val submission: JsonField<Submission>,
    private val transactionId: JsonField<String>,
    private val type: JsonField<Type>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("account_id") @ExcludeMissing accountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("account_number")
        @ExcludeMissing
        accountNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("approval") @ExcludeMissing approval: JsonField<Approval> = JsonMissing.of(),
        @JsonProperty("cancellation")
        @ExcludeMissing
        cancellation: JsonField<Cancellation> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("created_by")
        @ExcludeMissing
        createdBy: JsonField<CreatedBy> = JsonMissing.of(),
        @JsonProperty("creditor") @ExcludeMissing creditor: JsonField<Creditor> = JsonMissing.of(),
        @JsonProperty("currency") @ExcludeMissing currency: JsonField<Currency> = JsonMissing.of(),
        @JsonProperty("debtor") @ExcludeMissing debtor: JsonField<Debtor> = JsonMissing.of(),
        @JsonProperty("external_account_id")
        @ExcludeMissing
        externalAccountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("idempotency_key")
        @ExcludeMissing
        idempotencyKey: JsonField<String> = JsonMissing.of(),
        @JsonProperty("inbound_wire_drawdown_request_id")
        @ExcludeMissing
        inboundWireDrawdownRequestId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("network") @ExcludeMissing network: JsonField<Network> = JsonMissing.of(),
        @JsonProperty("pending_transaction_id")
        @ExcludeMissing
        pendingTransactionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("remittance")
        @ExcludeMissing
        remittance: JsonField<Remittance> = JsonMissing.of(),
        @JsonProperty("reversal") @ExcludeMissing reversal: JsonField<Reversal> = JsonMissing.of(),
        @JsonProperty("routing_number")
        @ExcludeMissing
        routingNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("source_account_number_id")
        @ExcludeMissing
        sourceAccountNumberId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("submission")
        @ExcludeMissing
        submission: JsonField<Submission> = JsonMissing.of(),
        @JsonProperty("transaction_id")
        @ExcludeMissing
        transactionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
    ) : this(
        id,
        accountId,
        accountNumber,
        amount,
        approval,
        cancellation,
        createdAt,
        createdBy,
        creditor,
        currency,
        debtor,
        externalAccountId,
        idempotencyKey,
        inboundWireDrawdownRequestId,
        network,
        pendingTransactionId,
        remittance,
        reversal,
        routingNumber,
        sourceAccountNumberId,
        status,
        submission,
        transactionId,
        type,
        mutableMapOf(),
    )

    /**
     * The wire transfer's identifier.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * The Account to which the transfer belongs.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountId(): String = accountId.getRequired("account_id")

    /**
     * The destination account number.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountNumber(): String = accountNumber.getRequired("account_number")

    /**
     * The transfer amount in USD cents.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun amount(): Long = amount.getRequired("amount")

    /**
     * If your account requires approvals for transfers and the transfer was approved, this will
     * contain details of the approval.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun approval(): Optional<Approval> = approval.getOptional("approval")

    /**
     * If your account requires approvals for transfers and the transfer was not approved, this will
     * contain details of the cancellation.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cancellation(): Optional<Cancellation> = cancellation.getOptional("cancellation")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the transfer
     * was created.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * What object created the transfer, either via the API or the dashboard.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdBy(): Optional<CreatedBy> = createdBy.getOptional("created_by")

    /**
     * The person or business that is receiving the funds from the transfer.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun creditor(): Optional<Creditor> = creditor.getOptional("creditor")

    /**
     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transfer's currency. For
     * wire transfers this is always equal to `usd`.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun currency(): Currency = currency.getRequired("currency")

    /**
     * The person or business whose funds are being transferred.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun debtor(): Optional<Debtor> = debtor.getOptional("debtor")

    /**
     * The identifier of the External Account the transfer was made to, if any.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun externalAccountId(): Optional<String> = externalAccountId.getOptional("external_account_id")

    /**
     * The idempotency key you chose for this object. This value is unique across Increase and is
     * used to ensure that a request is only processed once. Learn more about
     * [idempotency](https://increase.com/documentation/idempotency-keys).
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun idempotencyKey(): Optional<String> = idempotencyKey.getOptional("idempotency_key")

    /**
     * The ID of an Inbound Wire Drawdown Request in response to which this transfer was sent.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun inboundWireDrawdownRequestId(): Optional<String> =
        inboundWireDrawdownRequestId.getOptional("inbound_wire_drawdown_request_id")

    /**
     * The transfer's network.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun network(): Network = network.getRequired("network")

    /**
     * The ID for the pending transaction representing the transfer. A pending transaction is
     * created when the transfer
     * [requires approval](https://increase.com/documentation/transfer-approvals#transfer-approvals)
     * by someone else in your organization.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pendingTransactionId(): Optional<String> =
        pendingTransactionId.getOptional("pending_transaction_id")

    /**
     * Remittance information sent with the wire transfer.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun remittance(): Optional<Remittance> = remittance.getOptional("remittance")

    /**
     * If your transfer is reversed, this will contain details of the reversal.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun reversal(): Optional<Reversal> = reversal.getOptional("reversal")

    /**
     * The American Bankers' Association (ABA) Routing Transit Number (RTN).
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun routingNumber(): String = routingNumber.getRequired("routing_number")

    /**
     * The Account Number that was passed to the wire's recipient.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sourceAccountNumberId(): Optional<String> =
        sourceAccountNumberId.getOptional("source_account_number_id")

    /**
     * The lifecycle status of the transfer.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * After the transfer is submitted to Fedwire, this will contain supplemental details.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun submission(): Optional<Submission> = submission.getOptional("submission")

    /**
     * The ID for the transaction funding the transfer.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun transactionId(): Optional<String> = transactionId.getOptional("transaction_id")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `wire_transfer`.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [accountId].
     *
     * Unlike [accountId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("account_id") @ExcludeMissing fun _accountId(): JsonField<String> = accountId

    /**
     * Returns the raw JSON value of [accountNumber].
     *
     * Unlike [accountNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("account_number")
    @ExcludeMissing
    fun _accountNumber(): JsonField<String> = accountNumber

    /**
     * Returns the raw JSON value of [amount].
     *
     * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

    /**
     * Returns the raw JSON value of [approval].
     *
     * Unlike [approval], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("approval") @ExcludeMissing fun _approval(): JsonField<Approval> = approval

    /**
     * Returns the raw JSON value of [cancellation].
     *
     * Unlike [cancellation], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cancellation")
    @ExcludeMissing
    fun _cancellation(): JsonField<Cancellation> = cancellation

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [createdBy].
     *
     * Unlike [createdBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_by") @ExcludeMissing fun _createdBy(): JsonField<CreatedBy> = createdBy

    /**
     * Returns the raw JSON value of [creditor].
     *
     * Unlike [creditor], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("creditor") @ExcludeMissing fun _creditor(): JsonField<Creditor> = creditor

    /**
     * Returns the raw JSON value of [currency].
     *
     * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<Currency> = currency

    /**
     * Returns the raw JSON value of [debtor].
     *
     * Unlike [debtor], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("debtor") @ExcludeMissing fun _debtor(): JsonField<Debtor> = debtor

    /**
     * Returns the raw JSON value of [externalAccountId].
     *
     * Unlike [externalAccountId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("external_account_id")
    @ExcludeMissing
    fun _externalAccountId(): JsonField<String> = externalAccountId

    /**
     * Returns the raw JSON value of [idempotencyKey].
     *
     * Unlike [idempotencyKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idempotency_key")
    @ExcludeMissing
    fun _idempotencyKey(): JsonField<String> = idempotencyKey

    /**
     * Returns the raw JSON value of [inboundWireDrawdownRequestId].
     *
     * Unlike [inboundWireDrawdownRequestId], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("inbound_wire_drawdown_request_id")
    @ExcludeMissing
    fun _inboundWireDrawdownRequestId(): JsonField<String> = inboundWireDrawdownRequestId

    /**
     * Returns the raw JSON value of [network].
     *
     * Unlike [network], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("network") @ExcludeMissing fun _network(): JsonField<Network> = network

    /**
     * Returns the raw JSON value of [pendingTransactionId].
     *
     * Unlike [pendingTransactionId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("pending_transaction_id")
    @ExcludeMissing
    fun _pendingTransactionId(): JsonField<String> = pendingTransactionId

    /**
     * Returns the raw JSON value of [remittance].
     *
     * Unlike [remittance], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("remittance")
    @ExcludeMissing
    fun _remittance(): JsonField<Remittance> = remittance

    /**
     * Returns the raw JSON value of [reversal].
     *
     * Unlike [reversal], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reversal") @ExcludeMissing fun _reversal(): JsonField<Reversal> = reversal

    /**
     * Returns the raw JSON value of [routingNumber].
     *
     * Unlike [routingNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("routing_number")
    @ExcludeMissing
    fun _routingNumber(): JsonField<String> = routingNumber

    /**
     * Returns the raw JSON value of [sourceAccountNumberId].
     *
     * Unlike [sourceAccountNumberId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("source_account_number_id")
    @ExcludeMissing
    fun _sourceAccountNumberId(): JsonField<String> = sourceAccountNumberId

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [submission].
     *
     * Unlike [submission], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("submission")
    @ExcludeMissing
    fun _submission(): JsonField<Submission> = submission

    /**
     * Returns the raw JSON value of [transactionId].
     *
     * Unlike [transactionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("transaction_id")
    @ExcludeMissing
    fun _transactionId(): JsonField<String> = transactionId

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [WireTransfer].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .accountId()
         * .accountNumber()
         * .amount()
         * .approval()
         * .cancellation()
         * .createdAt()
         * .createdBy()
         * .creditor()
         * .currency()
         * .debtor()
         * .externalAccountId()
         * .idempotencyKey()
         * .inboundWireDrawdownRequestId()
         * .network()
         * .pendingTransactionId()
         * .remittance()
         * .reversal()
         * .routingNumber()
         * .sourceAccountNumberId()
         * .status()
         * .submission()
         * .transactionId()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [WireTransfer]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var accountId: JsonField<String>? = null
        private var accountNumber: JsonField<String>? = null
        private var amount: JsonField<Long>? = null
        private var approval: JsonField<Approval>? = null
        private var cancellation: JsonField<Cancellation>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var createdBy: JsonField<CreatedBy>? = null
        private var creditor: JsonField<Creditor>? = null
        private var currency: JsonField<Currency>? = null
        private var debtor: JsonField<Debtor>? = null
        private var externalAccountId: JsonField<String>? = null
        private var idempotencyKey: JsonField<String>? = null
        private var inboundWireDrawdownRequestId: JsonField<String>? = null
        private var network: JsonField<Network>? = null
        private var pendingTransactionId: JsonField<String>? = null
        private var remittance: JsonField<Remittance>? = null
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
            cancellation = wireTransfer.cancellation
            createdAt = wireTransfer.createdAt
            createdBy = wireTransfer.createdBy
            creditor = wireTransfer.creditor
            currency = wireTransfer.currency
            debtor = wireTransfer.debtor
            externalAccountId = wireTransfer.externalAccountId
            idempotencyKey = wireTransfer.idempotencyKey
            inboundWireDrawdownRequestId = wireTransfer.inboundWireDrawdownRequestId
            network = wireTransfer.network
            pendingTransactionId = wireTransfer.pendingTransactionId
            remittance = wireTransfer.remittance
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

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The Account to which the transfer belongs. */
        fun accountId(accountId: String) = accountId(JsonField.of(accountId))

        /**
         * Sets [Builder.accountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

        /** The destination account number. */
        fun accountNumber(accountNumber: String) = accountNumber(JsonField.of(accountNumber))

        /**
         * Sets [Builder.accountNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun accountNumber(accountNumber: JsonField<String>) = apply {
            this.accountNumber = accountNumber
        }

        /** The transfer amount in USD cents. */
        fun amount(amount: Long) = amount(JsonField.of(amount))

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

        /**
         * If your account requires approvals for transfers and the transfer was approved, this will
         * contain details of the approval.
         */
        fun approval(approval: Approval?) = approval(JsonField.ofNullable(approval))

        /** Alias for calling [Builder.approval] with `approval.orElse(null)`. */
        fun approval(approval: Optional<Approval>) = approval(approval.getOrNull())

        /**
         * Sets [Builder.approval] to an arbitrary JSON value.
         *
         * You should usually call [Builder.approval] with a well-typed [Approval] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun approval(approval: JsonField<Approval>) = apply { this.approval = approval }

        /**
         * If your account requires approvals for transfers and the transfer was not approved, this
         * will contain details of the cancellation.
         */
        fun cancellation(cancellation: Cancellation?) =
            cancellation(JsonField.ofNullable(cancellation))

        /** Alias for calling [Builder.cancellation] with `cancellation.orElse(null)`. */
        fun cancellation(cancellation: Optional<Cancellation>) =
            cancellation(cancellation.getOrNull())

        /**
         * Sets [Builder.cancellation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cancellation] with a well-typed [Cancellation] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
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
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** What object created the transfer, either via the API or the dashboard. */
        fun createdBy(createdBy: CreatedBy?) = createdBy(JsonField.ofNullable(createdBy))

        /** Alias for calling [Builder.createdBy] with `createdBy.orElse(null)`. */
        fun createdBy(createdBy: Optional<CreatedBy>) = createdBy(createdBy.getOrNull())

        /**
         * Sets [Builder.createdBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdBy] with a well-typed [CreatedBy] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun createdBy(createdBy: JsonField<CreatedBy>) = apply { this.createdBy = createdBy }

        /** The person or business that is receiving the funds from the transfer. */
        fun creditor(creditor: Creditor?) = creditor(JsonField.ofNullable(creditor))

        /** Alias for calling [Builder.creditor] with `creditor.orElse(null)`. */
        fun creditor(creditor: Optional<Creditor>) = creditor(creditor.getOrNull())

        /**
         * Sets [Builder.creditor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.creditor] with a well-typed [Creditor] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun creditor(creditor: JsonField<Creditor>) = apply { this.creditor = creditor }

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transfer's currency.
         * For wire transfers this is always equal to `usd`.
         */
        fun currency(currency: Currency) = currency(JsonField.of(currency))

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [Currency] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

        /** The person or business whose funds are being transferred. */
        fun debtor(debtor: Debtor?) = debtor(JsonField.ofNullable(debtor))

        /** Alias for calling [Builder.debtor] with `debtor.orElse(null)`. */
        fun debtor(debtor: Optional<Debtor>) = debtor(debtor.getOrNull())

        /**
         * Sets [Builder.debtor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.debtor] with a well-typed [Debtor] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun debtor(debtor: JsonField<Debtor>) = apply { this.debtor = debtor }

        /** The identifier of the External Account the transfer was made to, if any. */
        fun externalAccountId(externalAccountId: String?) =
            externalAccountId(JsonField.ofNullable(externalAccountId))

        /** Alias for calling [Builder.externalAccountId] with `externalAccountId.orElse(null)`. */
        fun externalAccountId(externalAccountId: Optional<String>) =
            externalAccountId(externalAccountId.getOrNull())

        /**
         * Sets [Builder.externalAccountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.externalAccountId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
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

        /** Alias for calling [Builder.idempotencyKey] with `idempotencyKey.orElse(null)`. */
        fun idempotencyKey(idempotencyKey: Optional<String>) =
            idempotencyKey(idempotencyKey.getOrNull())

        /**
         * Sets [Builder.idempotencyKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idempotencyKey] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun idempotencyKey(idempotencyKey: JsonField<String>) = apply {
            this.idempotencyKey = idempotencyKey
        }

        /**
         * The ID of an Inbound Wire Drawdown Request in response to which this transfer was sent.
         */
        fun inboundWireDrawdownRequestId(inboundWireDrawdownRequestId: String?) =
            inboundWireDrawdownRequestId(JsonField.ofNullable(inboundWireDrawdownRequestId))

        /**
         * Alias for calling [Builder.inboundWireDrawdownRequestId] with
         * `inboundWireDrawdownRequestId.orElse(null)`.
         */
        fun inboundWireDrawdownRequestId(inboundWireDrawdownRequestId: Optional<String>) =
            inboundWireDrawdownRequestId(inboundWireDrawdownRequestId.getOrNull())

        /**
         * Sets [Builder.inboundWireDrawdownRequestId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inboundWireDrawdownRequestId] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun inboundWireDrawdownRequestId(inboundWireDrawdownRequestId: JsonField<String>) = apply {
            this.inboundWireDrawdownRequestId = inboundWireDrawdownRequestId
        }

        /** The transfer's network. */
        fun network(network: Network) = network(JsonField.of(network))

        /**
         * Sets [Builder.network] to an arbitrary JSON value.
         *
         * You should usually call [Builder.network] with a well-typed [Network] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun network(network: JsonField<Network>) = apply { this.network = network }

        /**
         * The ID for the pending transaction representing the transfer. A pending transaction is
         * created when the transfer
         * [requires approval](https://increase.com/documentation/transfer-approvals#transfer-approvals)
         * by someone else in your organization.
         */
        fun pendingTransactionId(pendingTransactionId: String?) =
            pendingTransactionId(JsonField.ofNullable(pendingTransactionId))

        /**
         * Alias for calling [Builder.pendingTransactionId] with
         * `pendingTransactionId.orElse(null)`.
         */
        fun pendingTransactionId(pendingTransactionId: Optional<String>) =
            pendingTransactionId(pendingTransactionId.getOrNull())

        /**
         * Sets [Builder.pendingTransactionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pendingTransactionId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun pendingTransactionId(pendingTransactionId: JsonField<String>) = apply {
            this.pendingTransactionId = pendingTransactionId
        }

        /** Remittance information sent with the wire transfer. */
        fun remittance(remittance: Remittance?) = remittance(JsonField.ofNullable(remittance))

        /** Alias for calling [Builder.remittance] with `remittance.orElse(null)`. */
        fun remittance(remittance: Optional<Remittance>) = remittance(remittance.getOrNull())

        /**
         * Sets [Builder.remittance] to an arbitrary JSON value.
         *
         * You should usually call [Builder.remittance] with a well-typed [Remittance] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun remittance(remittance: JsonField<Remittance>) = apply { this.remittance = remittance }

        /** If your transfer is reversed, this will contain details of the reversal. */
        fun reversal(reversal: Reversal?) = reversal(JsonField.ofNullable(reversal))

        /** Alias for calling [Builder.reversal] with `reversal.orElse(null)`. */
        fun reversal(reversal: Optional<Reversal>) = reversal(reversal.getOrNull())

        /**
         * Sets [Builder.reversal] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reversal] with a well-typed [Reversal] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun reversal(reversal: JsonField<Reversal>) = apply { this.reversal = reversal }

        /** The American Bankers' Association (ABA) Routing Transit Number (RTN). */
        fun routingNumber(routingNumber: String) = routingNumber(JsonField.of(routingNumber))

        /**
         * Sets [Builder.routingNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.routingNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun routingNumber(routingNumber: JsonField<String>) = apply {
            this.routingNumber = routingNumber
        }

        /** The Account Number that was passed to the wire's recipient. */
        fun sourceAccountNumberId(sourceAccountNumberId: String?) =
            sourceAccountNumberId(JsonField.ofNullable(sourceAccountNumberId))

        /**
         * Alias for calling [Builder.sourceAccountNumberId] with
         * `sourceAccountNumberId.orElse(null)`.
         */
        fun sourceAccountNumberId(sourceAccountNumberId: Optional<String>) =
            sourceAccountNumberId(sourceAccountNumberId.getOrNull())

        /**
         * Sets [Builder.sourceAccountNumberId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sourceAccountNumberId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sourceAccountNumberId(sourceAccountNumberId: JsonField<String>) = apply {
            this.sourceAccountNumberId = sourceAccountNumberId
        }

        /** The lifecycle status of the transfer. */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** After the transfer is submitted to Fedwire, this will contain supplemental details. */
        fun submission(submission: Submission?) = submission(JsonField.ofNullable(submission))

        /** Alias for calling [Builder.submission] with `submission.orElse(null)`. */
        fun submission(submission: Optional<Submission>) = submission(submission.getOrNull())

        /**
         * Sets [Builder.submission] to an arbitrary JSON value.
         *
         * You should usually call [Builder.submission] with a well-typed [Submission] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun submission(submission: JsonField<Submission>) = apply { this.submission = submission }

        /** The ID for the transaction funding the transfer. */
        fun transactionId(transactionId: String?) =
            transactionId(JsonField.ofNullable(transactionId))

        /** Alias for calling [Builder.transactionId] with `transactionId.orElse(null)`. */
        fun transactionId(transactionId: Optional<String>) =
            transactionId(transactionId.getOrNull())

        /**
         * Sets [Builder.transactionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transactionId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun transactionId(transactionId: JsonField<String>) = apply {
            this.transactionId = transactionId
        }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `wire_transfer`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
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

        /**
         * Returns an immutable instance of [WireTransfer].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .accountId()
         * .accountNumber()
         * .amount()
         * .approval()
         * .cancellation()
         * .createdAt()
         * .createdBy()
         * .creditor()
         * .currency()
         * .debtor()
         * .externalAccountId()
         * .idempotencyKey()
         * .inboundWireDrawdownRequestId()
         * .network()
         * .pendingTransactionId()
         * .remittance()
         * .reversal()
         * .routingNumber()
         * .sourceAccountNumberId()
         * .status()
         * .submission()
         * .transactionId()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): WireTransfer =
            WireTransfer(
                checkRequired("id", id),
                checkRequired("accountId", accountId),
                checkRequired("accountNumber", accountNumber),
                checkRequired("amount", amount),
                checkRequired("approval", approval),
                checkRequired("cancellation", cancellation),
                checkRequired("createdAt", createdAt),
                checkRequired("createdBy", createdBy),
                checkRequired("creditor", creditor),
                checkRequired("currency", currency),
                checkRequired("debtor", debtor),
                checkRequired("externalAccountId", externalAccountId),
                checkRequired("idempotencyKey", idempotencyKey),
                checkRequired("inboundWireDrawdownRequestId", inboundWireDrawdownRequestId),
                checkRequired("network", network),
                checkRequired("pendingTransactionId", pendingTransactionId),
                checkRequired("remittance", remittance),
                checkRequired("reversal", reversal),
                checkRequired("routingNumber", routingNumber),
                checkRequired("sourceAccountNumberId", sourceAccountNumberId),
                checkRequired("status", status),
                checkRequired("submission", submission),
                checkRequired("transactionId", transactionId),
                checkRequired("type", type),
                additionalProperties.toMutableMap(),
            )
    }

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
        cancellation().ifPresent { it.validate() }
        createdAt()
        createdBy().ifPresent { it.validate() }
        creditor().ifPresent { it.validate() }
        currency().validate()
        debtor().ifPresent { it.validate() }
        externalAccountId()
        idempotencyKey()
        inboundWireDrawdownRequestId()
        network().validate()
        pendingTransactionId()
        remittance().ifPresent { it.validate() }
        reversal().ifPresent { it.validate() }
        routingNumber()
        sourceAccountNumberId()
        status().validate()
        submission().ifPresent { it.validate() }
        transactionId()
        type().validate()
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: IncreaseInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (accountId.asKnown().isPresent) 1 else 0) +
            (if (accountNumber.asKnown().isPresent) 1 else 0) +
            (if (amount.asKnown().isPresent) 1 else 0) +
            (approval.asKnown().getOrNull()?.validity() ?: 0) +
            (cancellation.asKnown().getOrNull()?.validity() ?: 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (createdBy.asKnown().getOrNull()?.validity() ?: 0) +
            (creditor.asKnown().getOrNull()?.validity() ?: 0) +
            (currency.asKnown().getOrNull()?.validity() ?: 0) +
            (debtor.asKnown().getOrNull()?.validity() ?: 0) +
            (if (externalAccountId.asKnown().isPresent) 1 else 0) +
            (if (idempotencyKey.asKnown().isPresent) 1 else 0) +
            (if (inboundWireDrawdownRequestId.asKnown().isPresent) 1 else 0) +
            (network.asKnown().getOrNull()?.validity() ?: 0) +
            (if (pendingTransactionId.asKnown().isPresent) 1 else 0) +
            (remittance.asKnown().getOrNull()?.validity() ?: 0) +
            (reversal.asKnown().getOrNull()?.validity() ?: 0) +
            (if (routingNumber.asKnown().isPresent) 1 else 0) +
            (if (sourceAccountNumberId.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (submission.asKnown().getOrNull()?.validity() ?: 0) +
            (if (transactionId.asKnown().isPresent) 1 else 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0)

    /**
     * If your account requires approvals for transfers and the transfer was approved, this will
     * contain details of the approval.
     */
    class Approval
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val approvedAt: JsonField<OffsetDateTime>,
        private val approvedBy: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("approved_at")
            @ExcludeMissing
            approvedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("approved_by")
            @ExcludeMissing
            approvedBy: JsonField<String> = JsonMissing.of(),
        ) : this(approvedAt, approvedBy, mutableMapOf())

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
         * transfer was approved.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun approvedAt(): OffsetDateTime = approvedAt.getRequired("approved_at")

        /**
         * If the Transfer was approved by a user in the dashboard, the email address of that user.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun approvedBy(): Optional<String> = approvedBy.getOptional("approved_by")

        /**
         * Returns the raw JSON value of [approvedAt].
         *
         * Unlike [approvedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("approved_at")
        @ExcludeMissing
        fun _approvedAt(): JsonField<OffsetDateTime> = approvedAt

        /**
         * Returns the raw JSON value of [approvedBy].
         *
         * Unlike [approvedBy], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("approved_by")
        @ExcludeMissing
        fun _approvedBy(): JsonField<String> = approvedBy

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

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
             * Sets [Builder.approvedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.approvedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun approvedAt(approvedAt: JsonField<OffsetDateTime>) = apply {
                this.approvedAt = approvedAt
            }

            /**
             * If the Transfer was approved by a user in the dashboard, the email address of that
             * user.
             */
            fun approvedBy(approvedBy: String?) = approvedBy(JsonField.ofNullable(approvedBy))

            /** Alias for calling [Builder.approvedBy] with `approvedBy.orElse(null)`. */
            fun approvedBy(approvedBy: Optional<String>) = approvedBy(approvedBy.getOrNull())

            /**
             * Sets [Builder.approvedBy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.approvedBy] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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

            /**
             * Returns an immutable instance of [Approval].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .approvedAt()
             * .approvedBy()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Approval =
                Approval(
                    checkRequired("approvedAt", approvedAt),
                    checkRequired("approvedBy", approvedBy),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Approval = apply {
            if (validated) {
                return@apply
            }

            approvedAt()
            approvedBy()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: IncreaseInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (approvedAt.asKnown().isPresent) 1 else 0) +
                (if (approvedBy.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Approval &&
                approvedAt == other.approvedAt &&
                approvedBy == other.approvedBy &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(approvedAt, approvedBy, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Approval{approvedAt=$approvedAt, approvedBy=$approvedBy, additionalProperties=$additionalProperties}"
    }

    /**
     * If your account requires approvals for transfers and the transfer was not approved, this will
     * contain details of the cancellation.
     */
    class Cancellation
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val canceledAt: JsonField<OffsetDateTime>,
        private val canceledBy: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("canceled_at")
            @ExcludeMissing
            canceledAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("canceled_by")
            @ExcludeMissing
            canceledBy: JsonField<String> = JsonMissing.of(),
        ) : this(canceledAt, canceledBy, mutableMapOf())

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
         * Transfer was canceled.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun canceledAt(): OffsetDateTime = canceledAt.getRequired("canceled_at")

        /**
         * If the Transfer was canceled by a user in the dashboard, the email address of that user.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun canceledBy(): Optional<String> = canceledBy.getOptional("canceled_by")

        /**
         * Returns the raw JSON value of [canceledAt].
         *
         * Unlike [canceledAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("canceled_at")
        @ExcludeMissing
        fun _canceledAt(): JsonField<OffsetDateTime> = canceledAt

        /**
         * Returns the raw JSON value of [canceledBy].
         *
         * Unlike [canceledBy], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("canceled_by")
        @ExcludeMissing
        fun _canceledBy(): JsonField<String> = canceledBy

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

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
             * Sets [Builder.canceledAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.canceledAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun canceledAt(canceledAt: JsonField<OffsetDateTime>) = apply {
                this.canceledAt = canceledAt
            }

            /**
             * If the Transfer was canceled by a user in the dashboard, the email address of that
             * user.
             */
            fun canceledBy(canceledBy: String?) = canceledBy(JsonField.ofNullable(canceledBy))

            /** Alias for calling [Builder.canceledBy] with `canceledBy.orElse(null)`. */
            fun canceledBy(canceledBy: Optional<String>) = canceledBy(canceledBy.getOrNull())

            /**
             * Sets [Builder.canceledBy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.canceledBy] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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

            /**
             * Returns an immutable instance of [Cancellation].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .canceledAt()
             * .canceledBy()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Cancellation =
                Cancellation(
                    checkRequired("canceledAt", canceledAt),
                    checkRequired("canceledBy", canceledBy),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Cancellation = apply {
            if (validated) {
                return@apply
            }

            canceledAt()
            canceledBy()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: IncreaseInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (canceledAt.asKnown().isPresent) 1 else 0) +
                (if (canceledBy.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Cancellation &&
                canceledAt == other.canceledAt &&
                canceledBy == other.canceledBy &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(canceledAt, canceledBy, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Cancellation{canceledAt=$canceledAt, canceledBy=$canceledBy, additionalProperties=$additionalProperties}"
    }

    /** What object created the transfer, either via the API or the dashboard. */
    class CreatedBy
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val category: JsonField<Category>,
        private val apiKey: JsonField<ApiKey>,
        private val oauthApplication: JsonField<OAuthApplication>,
        private val user: JsonField<User>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("category")
            @ExcludeMissing
            category: JsonField<Category> = JsonMissing.of(),
            @JsonProperty("api_key") @ExcludeMissing apiKey: JsonField<ApiKey> = JsonMissing.of(),
            @JsonProperty("oauth_application")
            @ExcludeMissing
            oauthApplication: JsonField<OAuthApplication> = JsonMissing.of(),
            @JsonProperty("user") @ExcludeMissing user: JsonField<User> = JsonMissing.of(),
        ) : this(category, apiKey, oauthApplication, user, mutableMapOf())

        /**
         * The type of object that created this transfer.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun category(): Category = category.getRequired("category")

        /**
         * If present, details about the API key that created the transfer.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun apiKey(): Optional<ApiKey> = apiKey.getOptional("api_key")

        /**
         * If present, details about the OAuth Application that created the transfer.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun oauthApplication(): Optional<OAuthApplication> =
            oauthApplication.getOptional("oauth_application")

        /**
         * If present, details about the User that created the transfer.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun user(): Optional<User> = user.getOptional("user")

        /**
         * Returns the raw JSON value of [category].
         *
         * Unlike [category], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("category") @ExcludeMissing fun _category(): JsonField<Category> = category

        /**
         * Returns the raw JSON value of [apiKey].
         *
         * Unlike [apiKey], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("api_key") @ExcludeMissing fun _apiKey(): JsonField<ApiKey> = apiKey

        /**
         * Returns the raw JSON value of [oauthApplication].
         *
         * Unlike [oauthApplication], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("oauth_application")
        @ExcludeMissing
        fun _oauthApplication(): JsonField<OAuthApplication> = oauthApplication

        /**
         * Returns the raw JSON value of [user].
         *
         * Unlike [user], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("user") @ExcludeMissing fun _user(): JsonField<User> = user

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [CreatedBy].
             *
             * The following fields are required:
             * ```java
             * .category()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CreatedBy]. */
        class Builder internal constructor() {

            private var category: JsonField<Category>? = null
            private var apiKey: JsonField<ApiKey> = JsonMissing.of()
            private var oauthApplication: JsonField<OAuthApplication> = JsonMissing.of()
            private var user: JsonField<User> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(createdBy: CreatedBy) = apply {
                category = createdBy.category
                apiKey = createdBy.apiKey
                oauthApplication = createdBy.oauthApplication
                user = createdBy.user
                additionalProperties = createdBy.additionalProperties.toMutableMap()
            }

            /** The type of object that created this transfer. */
            fun category(category: Category) = category(JsonField.of(category))

            /**
             * Sets [Builder.category] to an arbitrary JSON value.
             *
             * You should usually call [Builder.category] with a well-typed [Category] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun category(category: JsonField<Category>) = apply { this.category = category }

            /** If present, details about the API key that created the transfer. */
            fun apiKey(apiKey: ApiKey?) = apiKey(JsonField.ofNullable(apiKey))

            /** Alias for calling [Builder.apiKey] with `apiKey.orElse(null)`. */
            fun apiKey(apiKey: Optional<ApiKey>) = apiKey(apiKey.getOrNull())

            /**
             * Sets [Builder.apiKey] to an arbitrary JSON value.
             *
             * You should usually call [Builder.apiKey] with a well-typed [ApiKey] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun apiKey(apiKey: JsonField<ApiKey>) = apply { this.apiKey = apiKey }

            /** If present, details about the OAuth Application that created the transfer. */
            fun oauthApplication(oauthApplication: OAuthApplication?) =
                oauthApplication(JsonField.ofNullable(oauthApplication))

            /**
             * Alias for calling [Builder.oauthApplication] with `oauthApplication.orElse(null)`.
             */
            fun oauthApplication(oauthApplication: Optional<OAuthApplication>) =
                oauthApplication(oauthApplication.getOrNull())

            /**
             * Sets [Builder.oauthApplication] to an arbitrary JSON value.
             *
             * You should usually call [Builder.oauthApplication] with a well-typed
             * [OAuthApplication] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun oauthApplication(oauthApplication: JsonField<OAuthApplication>) = apply {
                this.oauthApplication = oauthApplication
            }

            /** If present, details about the User that created the transfer. */
            fun user(user: User?) = user(JsonField.ofNullable(user))

            /** Alias for calling [Builder.user] with `user.orElse(null)`. */
            fun user(user: Optional<User>) = user(user.getOrNull())

            /**
             * Sets [Builder.user] to an arbitrary JSON value.
             *
             * You should usually call [Builder.user] with a well-typed [User] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
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

            /**
             * Returns an immutable instance of [CreatedBy].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .category()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): CreatedBy =
                CreatedBy(
                    checkRequired("category", category),
                    apiKey,
                    oauthApplication,
                    user,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): CreatedBy = apply {
            if (validated) {
                return@apply
            }

            category().validate()
            apiKey().ifPresent { it.validate() }
            oauthApplication().ifPresent { it.validate() }
            user().ifPresent { it.validate() }
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: IncreaseInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (category.asKnown().getOrNull()?.validity() ?: 0) +
                (apiKey.asKnown().getOrNull()?.validity() ?: 0) +
                (oauthApplication.asKnown().getOrNull()?.validity() ?: 0) +
                (user.asKnown().getOrNull()?.validity() ?: 0)

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

            private var validated: Boolean = false

            fun validate(): Category = apply {
                if (validated) {
                    return@apply
                }

                known()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: IncreaseInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Category && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** If present, details about the API key that created the transfer. */
        class ApiKey
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val description: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("description")
                @ExcludeMissing
                description: JsonField<String> = JsonMissing.of()
            ) : this(description, mutableMapOf())

            /**
             * The description set for the API key when it was created.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun description(): Optional<String> = description.getOptional("description")

            /**
             * Returns the raw JSON value of [description].
             *
             * Unlike [description], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("description")
            @ExcludeMissing
            fun _description(): JsonField<String> = description

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

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

                /** Alias for calling [Builder.description] with `description.orElse(null)`. */
                fun description(description: Optional<String>) =
                    description(description.getOrNull())

                /**
                 * Sets [Builder.description] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.description] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
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

                /**
                 * Returns an immutable instance of [ApiKey].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .description()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): ApiKey =
                    ApiKey(
                        checkRequired("description", description),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): ApiKey = apply {
                if (validated) {
                    return@apply
                }

                description()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: IncreaseInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int = (if (description.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ApiKey &&
                    description == other.description &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(description, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ApiKey{description=$description, additionalProperties=$additionalProperties}"
        }

        /** If present, details about the OAuth Application that created the transfer. */
        class OAuthApplication
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val name: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of()
            ) : this(name, mutableMapOf())

            /**
             * The name of the OAuth Application.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun name(): String = name.getRequired("name")

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

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

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
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

                /**
                 * Returns an immutable instance of [OAuthApplication].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .name()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): OAuthApplication =
                    OAuthApplication(
                        checkRequired("name", name),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): OAuthApplication = apply {
                if (validated) {
                    return@apply
                }

                name()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: IncreaseInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = (if (name.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is OAuthApplication &&
                    name == other.name &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(name, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "OAuthApplication{name=$name, additionalProperties=$additionalProperties}"
        }

        /** If present, details about the User that created the transfer. */
        class User
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val email: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of()
            ) : this(email, mutableMapOf())

            /**
             * The email address of the User.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun email(): String = email.getRequired("email")

            /**
             * Returns the raw JSON value of [email].
             *
             * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

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

                /**
                 * Sets [Builder.email] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.email] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
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

                /**
                 * Returns an immutable instance of [User].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .email()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): User =
                    User(checkRequired("email", email), additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): User = apply {
                if (validated) {
                    return@apply
                }

                email()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: IncreaseInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = (if (email.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is User &&
                    email == other.email &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(email, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "User{email=$email, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CreatedBy &&
                category == other.category &&
                apiKey == other.apiKey &&
                oauthApplication == other.oauthApplication &&
                user == other.user &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(category, apiKey, oauthApplication, user, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CreatedBy{category=$category, apiKey=$apiKey, oauthApplication=$oauthApplication, user=$user, additionalProperties=$additionalProperties}"
    }

    /** The person or business that is receiving the funds from the transfer. */
    class Creditor
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val address: JsonField<Address>,
        private val name: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("address") @ExcludeMissing address: JsonField<Address> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        ) : this(address, name, mutableMapOf())

        /**
         * The person or business's address.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun address(): Optional<Address> = address.getOptional("address")

        /**
         * The person or business's name.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * Returns the raw JSON value of [address].
         *
         * Unlike [address], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("address") @ExcludeMissing fun _address(): JsonField<Address> = address

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Creditor].
             *
             * The following fields are required:
             * ```java
             * .address()
             * .name()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Creditor]. */
        class Builder internal constructor() {

            private var address: JsonField<Address>? = null
            private var name: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(creditor: Creditor) = apply {
                address = creditor.address
                name = creditor.name
                additionalProperties = creditor.additionalProperties.toMutableMap()
            }

            /** The person or business's address. */
            fun address(address: Address?) = address(JsonField.ofNullable(address))

            /** Alias for calling [Builder.address] with `address.orElse(null)`. */
            fun address(address: Optional<Address>) = address(address.getOrNull())

            /**
             * Sets [Builder.address] to an arbitrary JSON value.
             *
             * You should usually call [Builder.address] with a well-typed [Address] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun address(address: JsonField<Address>) = apply { this.address = address }

            /** The person or business's name. */
            fun name(name: String?) = name(JsonField.ofNullable(name))

            /** Alias for calling [Builder.name] with `name.orElse(null)`. */
            fun name(name: Optional<String>) = name(name.getOrNull())

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

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

            /**
             * Returns an immutable instance of [Creditor].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .address()
             * .name()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Creditor =
                Creditor(
                    checkRequired("address", address),
                    checkRequired("name", name),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Creditor = apply {
            if (validated) {
                return@apply
            }

            address().ifPresent { it.validate() }
            name()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: IncreaseInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (address.asKnown().getOrNull()?.validity() ?: 0) +
                (if (name.asKnown().isPresent) 1 else 0)

        /** The person or business's address. */
        class Address
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val unstructured: JsonField<Unstructured>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("unstructured")
                @ExcludeMissing
                unstructured: JsonField<Unstructured> = JsonMissing.of()
            ) : this(unstructured, mutableMapOf())

            /**
             * Unstructured address lines.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun unstructured(): Optional<Unstructured> = unstructured.getOptional("unstructured")

            /**
             * Returns the raw JSON value of [unstructured].
             *
             * Unlike [unstructured], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("unstructured")
            @ExcludeMissing
            fun _unstructured(): JsonField<Unstructured> = unstructured

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [Address].
                 *
                 * The following fields are required:
                 * ```java
                 * .unstructured()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Address]. */
            class Builder internal constructor() {

                private var unstructured: JsonField<Unstructured>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(address: Address) = apply {
                    unstructured = address.unstructured
                    additionalProperties = address.additionalProperties.toMutableMap()
                }

                /** Unstructured address lines. */
                fun unstructured(unstructured: Unstructured?) =
                    unstructured(JsonField.ofNullable(unstructured))

                /** Alias for calling [Builder.unstructured] with `unstructured.orElse(null)`. */
                fun unstructured(unstructured: Optional<Unstructured>) =
                    unstructured(unstructured.getOrNull())

                /**
                 * Sets [Builder.unstructured] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.unstructured] with a well-typed [Unstructured]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun unstructured(unstructured: JsonField<Unstructured>) = apply {
                    this.unstructured = unstructured
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

                /**
                 * Returns an immutable instance of [Address].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .unstructured()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Address =
                    Address(
                        checkRequired("unstructured", unstructured),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Address = apply {
                if (validated) {
                    return@apply
                }

                unstructured().ifPresent { it.validate() }
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: IncreaseInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int = (unstructured.asKnown().getOrNull()?.validity() ?: 0)

            /** Unstructured address lines. */
            class Unstructured
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val line1: JsonField<String>,
                private val line2: JsonField<String>,
                private val line3: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("line1")
                    @ExcludeMissing
                    line1: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("line2")
                    @ExcludeMissing
                    line2: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("line3")
                    @ExcludeMissing
                    line3: JsonField<String> = JsonMissing.of(),
                ) : this(line1, line2, line3, mutableMapOf())

                /**
                 * The first line.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun line1(): Optional<String> = line1.getOptional("line1")

                /**
                 * The second line.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun line2(): Optional<String> = line2.getOptional("line2")

                /**
                 * The third line.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun line3(): Optional<String> = line3.getOptional("line3")

                /**
                 * Returns the raw JSON value of [line1].
                 *
                 * Unlike [line1], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("line1") @ExcludeMissing fun _line1(): JsonField<String> = line1

                /**
                 * Returns the raw JSON value of [line2].
                 *
                 * Unlike [line2], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("line2") @ExcludeMissing fun _line2(): JsonField<String> = line2

                /**
                 * Returns the raw JSON value of [line3].
                 *
                 * Unlike [line3], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("line3") @ExcludeMissing fun _line3(): JsonField<String> = line3

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [Unstructured].
                     *
                     * The following fields are required:
                     * ```java
                     * .line1()
                     * .line2()
                     * .line3()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Unstructured]. */
                class Builder internal constructor() {

                    private var line1: JsonField<String>? = null
                    private var line2: JsonField<String>? = null
                    private var line3: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(unstructured: Unstructured) = apply {
                        line1 = unstructured.line1
                        line2 = unstructured.line2
                        line3 = unstructured.line3
                        additionalProperties = unstructured.additionalProperties.toMutableMap()
                    }

                    /** The first line. */
                    fun line1(line1: String?) = line1(JsonField.ofNullable(line1))

                    /** Alias for calling [Builder.line1] with `line1.orElse(null)`. */
                    fun line1(line1: Optional<String>) = line1(line1.getOrNull())

                    /**
                     * Sets [Builder.line1] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.line1] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

                    /** The second line. */
                    fun line2(line2: String?) = line2(JsonField.ofNullable(line2))

                    /** Alias for calling [Builder.line2] with `line2.orElse(null)`. */
                    fun line2(line2: Optional<String>) = line2(line2.getOrNull())

                    /**
                     * Sets [Builder.line2] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.line2] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun line2(line2: JsonField<String>) = apply { this.line2 = line2 }

                    /** The third line. */
                    fun line3(line3: String?) = line3(JsonField.ofNullable(line3))

                    /** Alias for calling [Builder.line3] with `line3.orElse(null)`. */
                    fun line3(line3: Optional<String>) = line3(line3.getOrNull())

                    /**
                     * Sets [Builder.line3] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.line3] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun line3(line3: JsonField<String>) = apply { this.line3 = line3 }

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

                    /**
                     * Returns an immutable instance of [Unstructured].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .line1()
                     * .line2()
                     * .line3()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Unstructured =
                        Unstructured(
                            checkRequired("line1", line1),
                            checkRequired("line2", line2),
                            checkRequired("line3", line3),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Unstructured = apply {
                    if (validated) {
                        return@apply
                    }

                    line1()
                    line2()
                    line3()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: IncreaseInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    (if (line1.asKnown().isPresent) 1 else 0) +
                        (if (line2.asKnown().isPresent) 1 else 0) +
                        (if (line3.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Unstructured &&
                        line1 == other.line1 &&
                        line2 == other.line2 &&
                        line3 == other.line3 &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(line1, line2, line3, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Unstructured{line1=$line1, line2=$line2, line3=$line3, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Address &&
                    unstructured == other.unstructured &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(unstructured, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Address{unstructured=$unstructured, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Creditor &&
                address == other.address &&
                name == other.name &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(address, name, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Creditor{address=$address, name=$name, additionalProperties=$additionalProperties}"
    }

    /**
     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transfer's currency. For
     * wire transfers this is always equal to `usd`.
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

            /** US Dollar (USD) */
            @JvmField val USD = of("USD")

            @JvmStatic fun of(value: String) = Currency(JsonField.of(value))
        }

        /** An enum containing [Currency]'s known values. */
        enum class Known {
            /** US Dollar (USD) */
            USD
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

        private var validated: Boolean = false

        fun validate(): Currency = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: IncreaseInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Currency && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The person or business whose funds are being transferred. */
    class Debtor
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val address: JsonField<Address>,
        private val name: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("address") @ExcludeMissing address: JsonField<Address> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        ) : this(address, name, mutableMapOf())

        /**
         * The person or business's address.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun address(): Optional<Address> = address.getOptional("address")

        /**
         * The person or business's name.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * Returns the raw JSON value of [address].
         *
         * Unlike [address], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("address") @ExcludeMissing fun _address(): JsonField<Address> = address

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Debtor].
             *
             * The following fields are required:
             * ```java
             * .address()
             * .name()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Debtor]. */
        class Builder internal constructor() {

            private var address: JsonField<Address>? = null
            private var name: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(debtor: Debtor) = apply {
                address = debtor.address
                name = debtor.name
                additionalProperties = debtor.additionalProperties.toMutableMap()
            }

            /** The person or business's address. */
            fun address(address: Address?) = address(JsonField.ofNullable(address))

            /** Alias for calling [Builder.address] with `address.orElse(null)`. */
            fun address(address: Optional<Address>) = address(address.getOrNull())

            /**
             * Sets [Builder.address] to an arbitrary JSON value.
             *
             * You should usually call [Builder.address] with a well-typed [Address] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun address(address: JsonField<Address>) = apply { this.address = address }

            /** The person or business's name. */
            fun name(name: String?) = name(JsonField.ofNullable(name))

            /** Alias for calling [Builder.name] with `name.orElse(null)`. */
            fun name(name: Optional<String>) = name(name.getOrNull())

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

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

            /**
             * Returns an immutable instance of [Debtor].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .address()
             * .name()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Debtor =
                Debtor(
                    checkRequired("address", address),
                    checkRequired("name", name),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Debtor = apply {
            if (validated) {
                return@apply
            }

            address().ifPresent { it.validate() }
            name()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: IncreaseInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (address.asKnown().getOrNull()?.validity() ?: 0) +
                (if (name.asKnown().isPresent) 1 else 0)

        /** The person or business's address. */
        class Address
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val unstructured: JsonField<Unstructured>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("unstructured")
                @ExcludeMissing
                unstructured: JsonField<Unstructured> = JsonMissing.of()
            ) : this(unstructured, mutableMapOf())

            /**
             * Unstructured address lines.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun unstructured(): Optional<Unstructured> = unstructured.getOptional("unstructured")

            /**
             * Returns the raw JSON value of [unstructured].
             *
             * Unlike [unstructured], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("unstructured")
            @ExcludeMissing
            fun _unstructured(): JsonField<Unstructured> = unstructured

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [Address].
                 *
                 * The following fields are required:
                 * ```java
                 * .unstructured()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Address]. */
            class Builder internal constructor() {

                private var unstructured: JsonField<Unstructured>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(address: Address) = apply {
                    unstructured = address.unstructured
                    additionalProperties = address.additionalProperties.toMutableMap()
                }

                /** Unstructured address lines. */
                fun unstructured(unstructured: Unstructured?) =
                    unstructured(JsonField.ofNullable(unstructured))

                /** Alias for calling [Builder.unstructured] with `unstructured.orElse(null)`. */
                fun unstructured(unstructured: Optional<Unstructured>) =
                    unstructured(unstructured.getOrNull())

                /**
                 * Sets [Builder.unstructured] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.unstructured] with a well-typed [Unstructured]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun unstructured(unstructured: JsonField<Unstructured>) = apply {
                    this.unstructured = unstructured
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

                /**
                 * Returns an immutable instance of [Address].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .unstructured()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Address =
                    Address(
                        checkRequired("unstructured", unstructured),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Address = apply {
                if (validated) {
                    return@apply
                }

                unstructured().ifPresent { it.validate() }
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: IncreaseInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int = (unstructured.asKnown().getOrNull()?.validity() ?: 0)

            /** Unstructured address lines. */
            class Unstructured
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val line1: JsonField<String>,
                private val line2: JsonField<String>,
                private val line3: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("line1")
                    @ExcludeMissing
                    line1: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("line2")
                    @ExcludeMissing
                    line2: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("line3")
                    @ExcludeMissing
                    line3: JsonField<String> = JsonMissing.of(),
                ) : this(line1, line2, line3, mutableMapOf())

                /**
                 * The first line.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun line1(): Optional<String> = line1.getOptional("line1")

                /**
                 * The second line.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun line2(): Optional<String> = line2.getOptional("line2")

                /**
                 * The third line.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun line3(): Optional<String> = line3.getOptional("line3")

                /**
                 * Returns the raw JSON value of [line1].
                 *
                 * Unlike [line1], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("line1") @ExcludeMissing fun _line1(): JsonField<String> = line1

                /**
                 * Returns the raw JSON value of [line2].
                 *
                 * Unlike [line2], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("line2") @ExcludeMissing fun _line2(): JsonField<String> = line2

                /**
                 * Returns the raw JSON value of [line3].
                 *
                 * Unlike [line3], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("line3") @ExcludeMissing fun _line3(): JsonField<String> = line3

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [Unstructured].
                     *
                     * The following fields are required:
                     * ```java
                     * .line1()
                     * .line2()
                     * .line3()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Unstructured]. */
                class Builder internal constructor() {

                    private var line1: JsonField<String>? = null
                    private var line2: JsonField<String>? = null
                    private var line3: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(unstructured: Unstructured) = apply {
                        line1 = unstructured.line1
                        line2 = unstructured.line2
                        line3 = unstructured.line3
                        additionalProperties = unstructured.additionalProperties.toMutableMap()
                    }

                    /** The first line. */
                    fun line1(line1: String?) = line1(JsonField.ofNullable(line1))

                    /** Alias for calling [Builder.line1] with `line1.orElse(null)`. */
                    fun line1(line1: Optional<String>) = line1(line1.getOrNull())

                    /**
                     * Sets [Builder.line1] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.line1] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

                    /** The second line. */
                    fun line2(line2: String?) = line2(JsonField.ofNullable(line2))

                    /** Alias for calling [Builder.line2] with `line2.orElse(null)`. */
                    fun line2(line2: Optional<String>) = line2(line2.getOrNull())

                    /**
                     * Sets [Builder.line2] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.line2] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun line2(line2: JsonField<String>) = apply { this.line2 = line2 }

                    /** The third line. */
                    fun line3(line3: String?) = line3(JsonField.ofNullable(line3))

                    /** Alias for calling [Builder.line3] with `line3.orElse(null)`. */
                    fun line3(line3: Optional<String>) = line3(line3.getOrNull())

                    /**
                     * Sets [Builder.line3] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.line3] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun line3(line3: JsonField<String>) = apply { this.line3 = line3 }

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

                    /**
                     * Returns an immutable instance of [Unstructured].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .line1()
                     * .line2()
                     * .line3()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Unstructured =
                        Unstructured(
                            checkRequired("line1", line1),
                            checkRequired("line2", line2),
                            checkRequired("line3", line3),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Unstructured = apply {
                    if (validated) {
                        return@apply
                    }

                    line1()
                    line2()
                    line3()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: IncreaseInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    (if (line1.asKnown().isPresent) 1 else 0) +
                        (if (line2.asKnown().isPresent) 1 else 0) +
                        (if (line3.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Unstructured &&
                        line1 == other.line1 &&
                        line2 == other.line2 &&
                        line3 == other.line3 &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(line1, line2, line3, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Unstructured{line1=$line1, line2=$line2, line3=$line3, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Address &&
                    unstructured == other.unstructured &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(unstructured, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Address{unstructured=$unstructured, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Debtor &&
                address == other.address &&
                name == other.name &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(address, name, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Debtor{address=$address, name=$name, additionalProperties=$additionalProperties}"
    }

    /** The transfer's network. */
    class Network @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val WIRE = of("wire")

            @JvmStatic fun of(value: String) = Network(JsonField.of(value))
        }

        /** An enum containing [Network]'s known values. */
        enum class Known {
            WIRE
        }

        /**
         * An enum containing [Network]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Network] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            WIRE,
            /** An enum member indicating that [Network] was instantiated with an unknown value. */
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
                WIRE -> Value.WIRE
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
                WIRE -> Known.WIRE
                else -> throw IncreaseInvalidDataException("Unknown Network: $value")
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

        private var validated: Boolean = false

        fun validate(): Network = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: IncreaseInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Network && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Remittance information sent with the wire transfer. */
    class Remittance
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val category: JsonField<Category>,
        private val tax: JsonField<Tax>,
        private val unstructured: JsonField<Unstructured>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("category")
            @ExcludeMissing
            category: JsonField<Category> = JsonMissing.of(),
            @JsonProperty("tax") @ExcludeMissing tax: JsonField<Tax> = JsonMissing.of(),
            @JsonProperty("unstructured")
            @ExcludeMissing
            unstructured: JsonField<Unstructured> = JsonMissing.of(),
        ) : this(category, tax, unstructured, mutableMapOf())

        /**
         * The type of remittance information being passed.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun category(): Category = category.getRequired("category")

        /**
         * Internal Revenue Service (IRS) tax repayment information. Required if `category` is equal
         * to `tax`.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun tax(): Optional<Tax> = tax.getOptional("tax")

        /**
         * Unstructured remittance information. Required if `category` is equal to `unstructured`.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun unstructured(): Optional<Unstructured> = unstructured.getOptional("unstructured")

        /**
         * Returns the raw JSON value of [category].
         *
         * Unlike [category], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("category") @ExcludeMissing fun _category(): JsonField<Category> = category

        /**
         * Returns the raw JSON value of [tax].
         *
         * Unlike [tax], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tax") @ExcludeMissing fun _tax(): JsonField<Tax> = tax

        /**
         * Returns the raw JSON value of [unstructured].
         *
         * Unlike [unstructured], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("unstructured")
        @ExcludeMissing
        fun _unstructured(): JsonField<Unstructured> = unstructured

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Remittance].
             *
             * The following fields are required:
             * ```java
             * .category()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Remittance]. */
        class Builder internal constructor() {

            private var category: JsonField<Category>? = null
            private var tax: JsonField<Tax> = JsonMissing.of()
            private var unstructured: JsonField<Unstructured> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(remittance: Remittance) = apply {
                category = remittance.category
                tax = remittance.tax
                unstructured = remittance.unstructured
                additionalProperties = remittance.additionalProperties.toMutableMap()
            }

            /** The type of remittance information being passed. */
            fun category(category: Category) = category(JsonField.of(category))

            /**
             * Sets [Builder.category] to an arbitrary JSON value.
             *
             * You should usually call [Builder.category] with a well-typed [Category] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun category(category: JsonField<Category>) = apply { this.category = category }

            /**
             * Internal Revenue Service (IRS) tax repayment information. Required if `category` is
             * equal to `tax`.
             */
            fun tax(tax: Tax?) = tax(JsonField.ofNullable(tax))

            /** Alias for calling [Builder.tax] with `tax.orElse(null)`. */
            fun tax(tax: Optional<Tax>) = tax(tax.getOrNull())

            /**
             * Sets [Builder.tax] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tax] with a well-typed [Tax] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun tax(tax: JsonField<Tax>) = apply { this.tax = tax }

            /**
             * Unstructured remittance information. Required if `category` is equal to
             * `unstructured`.
             */
            fun unstructured(unstructured: Unstructured?) =
                unstructured(JsonField.ofNullable(unstructured))

            /** Alias for calling [Builder.unstructured] with `unstructured.orElse(null)`. */
            fun unstructured(unstructured: Optional<Unstructured>) =
                unstructured(unstructured.getOrNull())

            /**
             * Sets [Builder.unstructured] to an arbitrary JSON value.
             *
             * You should usually call [Builder.unstructured] with a well-typed [Unstructured] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun unstructured(unstructured: JsonField<Unstructured>) = apply {
                this.unstructured = unstructured
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

            /**
             * Returns an immutable instance of [Remittance].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .category()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Remittance =
                Remittance(
                    checkRequired("category", category),
                    tax,
                    unstructured,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Remittance = apply {
            if (validated) {
                return@apply
            }

            category().validate()
            tax().ifPresent { it.validate() }
            unstructured().ifPresent { it.validate() }
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: IncreaseInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (category.asKnown().getOrNull()?.validity() ?: 0) +
                (tax.asKnown().getOrNull()?.validity() ?: 0) +
                (unstructured.asKnown().getOrNull()?.validity() ?: 0)

        /** The type of remittance information being passed. */
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

                /** The wire transfer contains unstructured remittance information. */
                @JvmField val UNSTRUCTURED = of("unstructured")

                /**
                 * The wire transfer is for tax payment purposes to the Internal Revenue Service
                 * (IRS).
                 */
                @JvmField val TAX = of("tax")

                @JvmStatic fun of(value: String) = Category(JsonField.of(value))
            }

            /** An enum containing [Category]'s known values. */
            enum class Known {
                /** The wire transfer contains unstructured remittance information. */
                UNSTRUCTURED,
                /**
                 * The wire transfer is for tax payment purposes to the Internal Revenue Service
                 * (IRS).
                 */
                TAX,
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
                /** The wire transfer contains unstructured remittance information. */
                UNSTRUCTURED,
                /**
                 * The wire transfer is for tax payment purposes to the Internal Revenue Service
                 * (IRS).
                 */
                TAX,
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
                    UNSTRUCTURED -> Value.UNSTRUCTURED
                    TAX -> Value.TAX
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
                    UNSTRUCTURED -> Known.UNSTRUCTURED
                    TAX -> Known.TAX
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

            private var validated: Boolean = false

            fun validate(): Category = apply {
                if (validated) {
                    return@apply
                }

                known()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: IncreaseInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Category && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * Internal Revenue Service (IRS) tax repayment information. Required if `category` is equal
         * to `tax`.
         */
        class Tax
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val date: JsonField<LocalDate>,
            private val identificationNumber: JsonField<String>,
            private val typeCode: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("date") @ExcludeMissing date: JsonField<LocalDate> = JsonMissing.of(),
                @JsonProperty("identification_number")
                @ExcludeMissing
                identificationNumber: JsonField<String> = JsonMissing.of(),
                @JsonProperty("type_code")
                @ExcludeMissing
                typeCode: JsonField<String> = JsonMissing.of(),
            ) : this(date, identificationNumber, typeCode, mutableMapOf())

            /**
             * The month and year the tax payment is for, in YYYY-MM-DD format. The day is ignored.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun date(): LocalDate = date.getRequired("date")

            /**
             * The 9-digit Tax Identification Number (TIN) or Employer Identification Number (EIN).
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun identificationNumber(): String =
                identificationNumber.getRequired("identification_number")

            /**
             * The 5-character tax type code.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun typeCode(): String = typeCode.getRequired("type_code")

            /**
             * Returns the raw JSON value of [date].
             *
             * Unlike [date], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("date") @ExcludeMissing fun _date(): JsonField<LocalDate> = date

            /**
             * Returns the raw JSON value of [identificationNumber].
             *
             * Unlike [identificationNumber], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("identification_number")
            @ExcludeMissing
            fun _identificationNumber(): JsonField<String> = identificationNumber

            /**
             * Returns the raw JSON value of [typeCode].
             *
             * Unlike [typeCode], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("type_code") @ExcludeMissing fun _typeCode(): JsonField<String> = typeCode

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [Tax].
                 *
                 * The following fields are required:
                 * ```java
                 * .date()
                 * .identificationNumber()
                 * .typeCode()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Tax]. */
            class Builder internal constructor() {

                private var date: JsonField<LocalDate>? = null
                private var identificationNumber: JsonField<String>? = null
                private var typeCode: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(tax: Tax) = apply {
                    date = tax.date
                    identificationNumber = tax.identificationNumber
                    typeCode = tax.typeCode
                    additionalProperties = tax.additionalProperties.toMutableMap()
                }

                /**
                 * The month and year the tax payment is for, in YYYY-MM-DD format. The day is
                 * ignored.
                 */
                fun date(date: LocalDate) = date(JsonField.of(date))

                /**
                 * Sets [Builder.date] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.date] with a well-typed [LocalDate] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun date(date: JsonField<LocalDate>) = apply { this.date = date }

                /**
                 * The 9-digit Tax Identification Number (TIN) or Employer Identification Number
                 * (EIN).
                 */
                fun identificationNumber(identificationNumber: String) =
                    identificationNumber(JsonField.of(identificationNumber))

                /**
                 * Sets [Builder.identificationNumber] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.identificationNumber] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun identificationNumber(identificationNumber: JsonField<String>) = apply {
                    this.identificationNumber = identificationNumber
                }

                /** The 5-character tax type code. */
                fun typeCode(typeCode: String) = typeCode(JsonField.of(typeCode))

                /**
                 * Sets [Builder.typeCode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.typeCode] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun typeCode(typeCode: JsonField<String>) = apply { this.typeCode = typeCode }

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

                /**
                 * Returns an immutable instance of [Tax].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .date()
                 * .identificationNumber()
                 * .typeCode()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Tax =
                    Tax(
                        checkRequired("date", date),
                        checkRequired("identificationNumber", identificationNumber),
                        checkRequired("typeCode", typeCode),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Tax = apply {
                if (validated) {
                    return@apply
                }

                date()
                identificationNumber()
                typeCode()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: IncreaseInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (date.asKnown().isPresent) 1 else 0) +
                    (if (identificationNumber.asKnown().isPresent) 1 else 0) +
                    (if (typeCode.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Tax &&
                    date == other.date &&
                    identificationNumber == other.identificationNumber &&
                    typeCode == other.typeCode &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(date, identificationNumber, typeCode, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Tax{date=$date, identificationNumber=$identificationNumber, typeCode=$typeCode, additionalProperties=$additionalProperties}"
        }

        /**
         * Unstructured remittance information. Required if `category` is equal to `unstructured`.
         */
        class Unstructured
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val message: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("message")
                @ExcludeMissing
                message: JsonField<String> = JsonMissing.of()
            ) : this(message, mutableMapOf())

            /**
             * The message to the beneficiary.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun message(): String = message.getRequired("message")

            /**
             * Returns the raw JSON value of [message].
             *
             * Unlike [message], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<String> = message

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [Unstructured].
                 *
                 * The following fields are required:
                 * ```java
                 * .message()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Unstructured]. */
            class Builder internal constructor() {

                private var message: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(unstructured: Unstructured) = apply {
                    message = unstructured.message
                    additionalProperties = unstructured.additionalProperties.toMutableMap()
                }

                /** The message to the beneficiary. */
                fun message(message: String) = message(JsonField.of(message))

                /**
                 * Sets [Builder.message] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.message] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun message(message: JsonField<String>) = apply { this.message = message }

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

                /**
                 * Returns an immutable instance of [Unstructured].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .message()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Unstructured =
                    Unstructured(
                        checkRequired("message", message),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Unstructured = apply {
                if (validated) {
                    return@apply
                }

                message()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: IncreaseInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = (if (message.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Unstructured &&
                    message == other.message &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(message, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Unstructured{message=$message, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Remittance &&
                category == other.category &&
                tax == other.tax &&
                unstructured == other.unstructured &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(category, tax, unstructured, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Remittance{category=$category, tax=$tax, unstructured=$unstructured, additionalProperties=$additionalProperties}"
    }

    /** If your transfer is reversed, this will contain details of the reversal. */
    class Reversal
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val amount: JsonField<Long>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val debtorRoutingNumber: JsonField<String>,
        private val description: JsonField<String>,
        private val inputCycleDate: JsonField<LocalDate>,
        private val inputMessageAccountabilityData: JsonField<String>,
        private val inputSequenceNumber: JsonField<String>,
        private val inputSource: JsonField<String>,
        private val instructionIdentification: JsonField<String>,
        private val returnReasonAdditionalInformation: JsonField<String>,
        private val returnReasonCode: JsonField<String>,
        private val returnReasonCodeDescription: JsonField<String>,
        private val transactionId: JsonField<String>,
        private val wireTransferId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("debtor_routing_number")
            @ExcludeMissing
            debtorRoutingNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("input_cycle_date")
            @ExcludeMissing
            inputCycleDate: JsonField<LocalDate> = JsonMissing.of(),
            @JsonProperty("input_message_accountability_data")
            @ExcludeMissing
            inputMessageAccountabilityData: JsonField<String> = JsonMissing.of(),
            @JsonProperty("input_sequence_number")
            @ExcludeMissing
            inputSequenceNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("input_source")
            @ExcludeMissing
            inputSource: JsonField<String> = JsonMissing.of(),
            @JsonProperty("instruction_identification")
            @ExcludeMissing
            instructionIdentification: JsonField<String> = JsonMissing.of(),
            @JsonProperty("return_reason_additional_information")
            @ExcludeMissing
            returnReasonAdditionalInformation: JsonField<String> = JsonMissing.of(),
            @JsonProperty("return_reason_code")
            @ExcludeMissing
            returnReasonCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("return_reason_code_description")
            @ExcludeMissing
            returnReasonCodeDescription: JsonField<String> = JsonMissing.of(),
            @JsonProperty("transaction_id")
            @ExcludeMissing
            transactionId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("wire_transfer_id")
            @ExcludeMissing
            wireTransferId: JsonField<String> = JsonMissing.of(),
        ) : this(
            amount,
            createdAt,
            debtorRoutingNumber,
            description,
            inputCycleDate,
            inputMessageAccountabilityData,
            inputSequenceNumber,
            inputSource,
            instructionIdentification,
            returnReasonAdditionalInformation,
            returnReasonCode,
            returnReasonCodeDescription,
            transactionId,
            wireTransferId,
            mutableMapOf(),
        )

        /**
         * The amount that was reversed in USD cents.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun amount(): Long = amount.getRequired("amount")

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
         * reversal was created.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        /**
         * The debtor's routing number.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun debtorRoutingNumber(): Optional<String> =
            debtorRoutingNumber.getOptional("debtor_routing_number")

        /**
         * The description on the reversal message from Fedwire, set by the reversing bank.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun description(): String = description.getRequired("description")

        /**
         * The Fedwire cycle date for the wire reversal. The "Fedwire day" begins at 9:00 PM Eastern
         * Time on the evening before the `cycle date`.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun inputCycleDate(): LocalDate = inputCycleDate.getRequired("input_cycle_date")

        /**
         * The Fedwire transaction identifier.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun inputMessageAccountabilityData(): String =
            inputMessageAccountabilityData.getRequired("input_message_accountability_data")

        /**
         * The Fedwire sequence number.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun inputSequenceNumber(): String = inputSequenceNumber.getRequired("input_sequence_number")

        /**
         * The Fedwire input source identifier.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun inputSource(): String = inputSource.getRequired("input_source")

        /**
         * The sending bank's identifier for the reversal.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun instructionIdentification(): Optional<String> =
            instructionIdentification.getOptional("instruction_identification")

        /**
         * Additional information about the reason for the reversal.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun returnReasonAdditionalInformation(): Optional<String> =
            returnReasonAdditionalInformation.getOptional("return_reason_additional_information")

        /**
         * A code provided by the sending bank giving a reason for the reversal. The common return
         * reason codes are [documented here](/documentation/wire-reversals#reversal-reason-codes).
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun returnReasonCode(): Optional<String> =
            returnReasonCode.getOptional("return_reason_code")

        /**
         * An Increase-generated description of the `return_reason_code`.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun returnReasonCodeDescription(): Optional<String> =
            returnReasonCodeDescription.getOptional("return_reason_code_description")

        /**
         * The ID for the Transaction associated with the transfer reversal.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun transactionId(): String = transactionId.getRequired("transaction_id")

        /**
         * The ID for the Wire Transfer that is being reversed.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun wireTransferId(): String = wireTransferId.getRequired("wire_transfer_id")

        /**
         * Returns the raw JSON value of [amount].
         *
         * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /**
         * Returns the raw JSON value of [debtorRoutingNumber].
         *
         * Unlike [debtorRoutingNumber], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("debtor_routing_number")
        @ExcludeMissing
        fun _debtorRoutingNumber(): JsonField<String> = debtorRoutingNumber

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [inputCycleDate].
         *
         * Unlike [inputCycleDate], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("input_cycle_date")
        @ExcludeMissing
        fun _inputCycleDate(): JsonField<LocalDate> = inputCycleDate

        /**
         * Returns the raw JSON value of [inputMessageAccountabilityData].
         *
         * Unlike [inputMessageAccountabilityData], this method doesn't throw if the JSON field has
         * an unexpected type.
         */
        @JsonProperty("input_message_accountability_data")
        @ExcludeMissing
        fun _inputMessageAccountabilityData(): JsonField<String> = inputMessageAccountabilityData

        /**
         * Returns the raw JSON value of [inputSequenceNumber].
         *
         * Unlike [inputSequenceNumber], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("input_sequence_number")
        @ExcludeMissing
        fun _inputSequenceNumber(): JsonField<String> = inputSequenceNumber

        /**
         * Returns the raw JSON value of [inputSource].
         *
         * Unlike [inputSource], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("input_source")
        @ExcludeMissing
        fun _inputSource(): JsonField<String> = inputSource

        /**
         * Returns the raw JSON value of [instructionIdentification].
         *
         * Unlike [instructionIdentification], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("instruction_identification")
        @ExcludeMissing
        fun _instructionIdentification(): JsonField<String> = instructionIdentification

        /**
         * Returns the raw JSON value of [returnReasonAdditionalInformation].
         *
         * Unlike [returnReasonAdditionalInformation], this method doesn't throw if the JSON field
         * has an unexpected type.
         */
        @JsonProperty("return_reason_additional_information")
        @ExcludeMissing
        fun _returnReasonAdditionalInformation(): JsonField<String> =
            returnReasonAdditionalInformation

        /**
         * Returns the raw JSON value of [returnReasonCode].
         *
         * Unlike [returnReasonCode], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("return_reason_code")
        @ExcludeMissing
        fun _returnReasonCode(): JsonField<String> = returnReasonCode

        /**
         * Returns the raw JSON value of [returnReasonCodeDescription].
         *
         * Unlike [returnReasonCodeDescription], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("return_reason_code_description")
        @ExcludeMissing
        fun _returnReasonCodeDescription(): JsonField<String> = returnReasonCodeDescription

        /**
         * Returns the raw JSON value of [transactionId].
         *
         * Unlike [transactionId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("transaction_id")
        @ExcludeMissing
        fun _transactionId(): JsonField<String> = transactionId

        /**
         * Returns the raw JSON value of [wireTransferId].
         *
         * Unlike [wireTransferId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("wire_transfer_id")
        @ExcludeMissing
        fun _wireTransferId(): JsonField<String> = wireTransferId

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Reversal].
             *
             * The following fields are required:
             * ```java
             * .amount()
             * .createdAt()
             * .debtorRoutingNumber()
             * .description()
             * .inputCycleDate()
             * .inputMessageAccountabilityData()
             * .inputSequenceNumber()
             * .inputSource()
             * .instructionIdentification()
             * .returnReasonAdditionalInformation()
             * .returnReasonCode()
             * .returnReasonCodeDescription()
             * .transactionId()
             * .wireTransferId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Reversal]. */
        class Builder internal constructor() {

            private var amount: JsonField<Long>? = null
            private var createdAt: JsonField<OffsetDateTime>? = null
            private var debtorRoutingNumber: JsonField<String>? = null
            private var description: JsonField<String>? = null
            private var inputCycleDate: JsonField<LocalDate>? = null
            private var inputMessageAccountabilityData: JsonField<String>? = null
            private var inputSequenceNumber: JsonField<String>? = null
            private var inputSource: JsonField<String>? = null
            private var instructionIdentification: JsonField<String>? = null
            private var returnReasonAdditionalInformation: JsonField<String>? = null
            private var returnReasonCode: JsonField<String>? = null
            private var returnReasonCodeDescription: JsonField<String>? = null
            private var transactionId: JsonField<String>? = null
            private var wireTransferId: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(reversal: Reversal) = apply {
                amount = reversal.amount
                createdAt = reversal.createdAt
                debtorRoutingNumber = reversal.debtorRoutingNumber
                description = reversal.description
                inputCycleDate = reversal.inputCycleDate
                inputMessageAccountabilityData = reversal.inputMessageAccountabilityData
                inputSequenceNumber = reversal.inputSequenceNumber
                inputSource = reversal.inputSource
                instructionIdentification = reversal.instructionIdentification
                returnReasonAdditionalInformation = reversal.returnReasonAdditionalInformation
                returnReasonCode = reversal.returnReasonCode
                returnReasonCodeDescription = reversal.returnReasonCodeDescription
                transactionId = reversal.transactionId
                wireTransferId = reversal.wireTransferId
                additionalProperties = reversal.additionalProperties.toMutableMap()
            }

            /** The amount that was reversed in USD cents. */
            fun amount(amount: Long) = amount(JsonField.of(amount))

            /**
             * Sets [Builder.amount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amount] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * reversal was created.
             */
            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            /** The debtor's routing number. */
            fun debtorRoutingNumber(debtorRoutingNumber: String?) =
                debtorRoutingNumber(JsonField.ofNullable(debtorRoutingNumber))

            /**
             * Alias for calling [Builder.debtorRoutingNumber] with
             * `debtorRoutingNumber.orElse(null)`.
             */
            fun debtorRoutingNumber(debtorRoutingNumber: Optional<String>) =
                debtorRoutingNumber(debtorRoutingNumber.getOrNull())

            /**
             * Sets [Builder.debtorRoutingNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.debtorRoutingNumber] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun debtorRoutingNumber(debtorRoutingNumber: JsonField<String>) = apply {
                this.debtorRoutingNumber = debtorRoutingNumber
            }

            /** The description on the reversal message from Fedwire, set by the reversing bank. */
            fun description(description: String) = description(JsonField.of(description))

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
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
             * Sets [Builder.inputCycleDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inputCycleDate] with a well-typed [LocalDate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun inputCycleDate(inputCycleDate: JsonField<LocalDate>) = apply {
                this.inputCycleDate = inputCycleDate
            }

            /** The Fedwire transaction identifier. */
            fun inputMessageAccountabilityData(inputMessageAccountabilityData: String) =
                inputMessageAccountabilityData(JsonField.of(inputMessageAccountabilityData))

            /**
             * Sets [Builder.inputMessageAccountabilityData] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inputMessageAccountabilityData] with a well-typed
             * [String] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun inputMessageAccountabilityData(inputMessageAccountabilityData: JsonField<String>) =
                apply {
                    this.inputMessageAccountabilityData = inputMessageAccountabilityData
                }

            /** The Fedwire sequence number. */
            fun inputSequenceNumber(inputSequenceNumber: String) =
                inputSequenceNumber(JsonField.of(inputSequenceNumber))

            /**
             * Sets [Builder.inputSequenceNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inputSequenceNumber] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun inputSequenceNumber(inputSequenceNumber: JsonField<String>) = apply {
                this.inputSequenceNumber = inputSequenceNumber
            }

            /** The Fedwire input source identifier. */
            fun inputSource(inputSource: String) = inputSource(JsonField.of(inputSource))

            /**
             * Sets [Builder.inputSource] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inputSource] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun inputSource(inputSource: JsonField<String>) = apply {
                this.inputSource = inputSource
            }

            /** The sending bank's identifier for the reversal. */
            fun instructionIdentification(instructionIdentification: String?) =
                instructionIdentification(JsonField.ofNullable(instructionIdentification))

            /**
             * Alias for calling [Builder.instructionIdentification] with
             * `instructionIdentification.orElse(null)`.
             */
            fun instructionIdentification(instructionIdentification: Optional<String>) =
                instructionIdentification(instructionIdentification.getOrNull())

            /**
             * Sets [Builder.instructionIdentification] to an arbitrary JSON value.
             *
             * You should usually call [Builder.instructionIdentification] with a well-typed
             * [String] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun instructionIdentification(instructionIdentification: JsonField<String>) = apply {
                this.instructionIdentification = instructionIdentification
            }

            /** Additional information about the reason for the reversal. */
            fun returnReasonAdditionalInformation(returnReasonAdditionalInformation: String?) =
                returnReasonAdditionalInformation(
                    JsonField.ofNullable(returnReasonAdditionalInformation)
                )

            /**
             * Alias for calling [Builder.returnReasonAdditionalInformation] with
             * `returnReasonAdditionalInformation.orElse(null)`.
             */
            fun returnReasonAdditionalInformation(
                returnReasonAdditionalInformation: Optional<String>
            ) = returnReasonAdditionalInformation(returnReasonAdditionalInformation.getOrNull())

            /**
             * Sets [Builder.returnReasonAdditionalInformation] to an arbitrary JSON value.
             *
             * You should usually call [Builder.returnReasonAdditionalInformation] with a well-typed
             * [String] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun returnReasonAdditionalInformation(
                returnReasonAdditionalInformation: JsonField<String>
            ) = apply { this.returnReasonAdditionalInformation = returnReasonAdditionalInformation }

            /**
             * A code provided by the sending bank giving a reason for the reversal. The common
             * return reason codes are
             * [documented here](/documentation/wire-reversals#reversal-reason-codes).
             */
            fun returnReasonCode(returnReasonCode: String?) =
                returnReasonCode(JsonField.ofNullable(returnReasonCode))

            /**
             * Alias for calling [Builder.returnReasonCode] with `returnReasonCode.orElse(null)`.
             */
            fun returnReasonCode(returnReasonCode: Optional<String>) =
                returnReasonCode(returnReasonCode.getOrNull())

            /**
             * Sets [Builder.returnReasonCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.returnReasonCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun returnReasonCode(returnReasonCode: JsonField<String>) = apply {
                this.returnReasonCode = returnReasonCode
            }

            /** An Increase-generated description of the `return_reason_code`. */
            fun returnReasonCodeDescription(returnReasonCodeDescription: String?) =
                returnReasonCodeDescription(JsonField.ofNullable(returnReasonCodeDescription))

            /**
             * Alias for calling [Builder.returnReasonCodeDescription] with
             * `returnReasonCodeDescription.orElse(null)`.
             */
            fun returnReasonCodeDescription(returnReasonCodeDescription: Optional<String>) =
                returnReasonCodeDescription(returnReasonCodeDescription.getOrNull())

            /**
             * Sets [Builder.returnReasonCodeDescription] to an arbitrary JSON value.
             *
             * You should usually call [Builder.returnReasonCodeDescription] with a well-typed
             * [String] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun returnReasonCodeDescription(returnReasonCodeDescription: JsonField<String>) =
                apply {
                    this.returnReasonCodeDescription = returnReasonCodeDescription
                }

            /** The ID for the Transaction associated with the transfer reversal. */
            fun transactionId(transactionId: String) = transactionId(JsonField.of(transactionId))

            /**
             * Sets [Builder.transactionId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.transactionId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun transactionId(transactionId: JsonField<String>) = apply {
                this.transactionId = transactionId
            }

            /** The ID for the Wire Transfer that is being reversed. */
            fun wireTransferId(wireTransferId: String) =
                wireTransferId(JsonField.of(wireTransferId))

            /**
             * Sets [Builder.wireTransferId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.wireTransferId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
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

            /**
             * Returns an immutable instance of [Reversal].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .amount()
             * .createdAt()
             * .debtorRoutingNumber()
             * .description()
             * .inputCycleDate()
             * .inputMessageAccountabilityData()
             * .inputSequenceNumber()
             * .inputSource()
             * .instructionIdentification()
             * .returnReasonAdditionalInformation()
             * .returnReasonCode()
             * .returnReasonCodeDescription()
             * .transactionId()
             * .wireTransferId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Reversal =
                Reversal(
                    checkRequired("amount", amount),
                    checkRequired("createdAt", createdAt),
                    checkRequired("debtorRoutingNumber", debtorRoutingNumber),
                    checkRequired("description", description),
                    checkRequired("inputCycleDate", inputCycleDate),
                    checkRequired("inputMessageAccountabilityData", inputMessageAccountabilityData),
                    checkRequired("inputSequenceNumber", inputSequenceNumber),
                    checkRequired("inputSource", inputSource),
                    checkRequired("instructionIdentification", instructionIdentification),
                    checkRequired(
                        "returnReasonAdditionalInformation",
                        returnReasonAdditionalInformation,
                    ),
                    checkRequired("returnReasonCode", returnReasonCode),
                    checkRequired("returnReasonCodeDescription", returnReasonCodeDescription),
                    checkRequired("transactionId", transactionId),
                    checkRequired("wireTransferId", wireTransferId),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Reversal = apply {
            if (validated) {
                return@apply
            }

            amount()
            createdAt()
            debtorRoutingNumber()
            description()
            inputCycleDate()
            inputMessageAccountabilityData()
            inputSequenceNumber()
            inputSource()
            instructionIdentification()
            returnReasonAdditionalInformation()
            returnReasonCode()
            returnReasonCodeDescription()
            transactionId()
            wireTransferId()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: IncreaseInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (amount.asKnown().isPresent) 1 else 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (debtorRoutingNumber.asKnown().isPresent) 1 else 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (if (inputCycleDate.asKnown().isPresent) 1 else 0) +
                (if (inputMessageAccountabilityData.asKnown().isPresent) 1 else 0) +
                (if (inputSequenceNumber.asKnown().isPresent) 1 else 0) +
                (if (inputSource.asKnown().isPresent) 1 else 0) +
                (if (instructionIdentification.asKnown().isPresent) 1 else 0) +
                (if (returnReasonAdditionalInformation.asKnown().isPresent) 1 else 0) +
                (if (returnReasonCode.asKnown().isPresent) 1 else 0) +
                (if (returnReasonCodeDescription.asKnown().isPresent) 1 else 0) +
                (if (transactionId.asKnown().isPresent) 1 else 0) +
                (if (wireTransferId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Reversal &&
                amount == other.amount &&
                createdAt == other.createdAt &&
                debtorRoutingNumber == other.debtorRoutingNumber &&
                description == other.description &&
                inputCycleDate == other.inputCycleDate &&
                inputMessageAccountabilityData == other.inputMessageAccountabilityData &&
                inputSequenceNumber == other.inputSequenceNumber &&
                inputSource == other.inputSource &&
                instructionIdentification == other.instructionIdentification &&
                returnReasonAdditionalInformation == other.returnReasonAdditionalInformation &&
                returnReasonCode == other.returnReasonCode &&
                returnReasonCodeDescription == other.returnReasonCodeDescription &&
                transactionId == other.transactionId &&
                wireTransferId == other.wireTransferId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                amount,
                createdAt,
                debtorRoutingNumber,
                description,
                inputCycleDate,
                inputMessageAccountabilityData,
                inputSequenceNumber,
                inputSource,
                instructionIdentification,
                returnReasonAdditionalInformation,
                returnReasonCode,
                returnReasonCodeDescription,
                transactionId,
                wireTransferId,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Reversal{amount=$amount, createdAt=$createdAt, debtorRoutingNumber=$debtorRoutingNumber, description=$description, inputCycleDate=$inputCycleDate, inputMessageAccountabilityData=$inputMessageAccountabilityData, inputSequenceNumber=$inputSequenceNumber, inputSource=$inputSource, instructionIdentification=$instructionIdentification, returnReasonAdditionalInformation=$returnReasonAdditionalInformation, returnReasonCode=$returnReasonCode, returnReasonCodeDescription=$returnReasonCodeDescription, transactionId=$transactionId, wireTransferId=$wireTransferId, additionalProperties=$additionalProperties}"
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

        /** An enum containing [Status]'s known values. */
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
                REJECTED -> Value.REJECTED
                REQUIRES_ATTENTION -> Value.REQUIRES_ATTENTION
                PENDING_CREATING -> Value.PENDING_CREATING
                REVERSED -> Value.REVERSED
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
                REJECTED -> Known.REJECTED
                REQUIRES_ATTENTION -> Known.REQUIRES_ATTENTION
                PENDING_CREATING -> Known.PENDING_CREATING
                REVERSED -> Known.REVERSED
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

        private var validated: Boolean = false

        fun validate(): Status = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: IncreaseInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Status && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** After the transfer is submitted to Fedwire, this will contain supplemental details. */
    class Submission
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val inputMessageAccountabilityData: JsonField<String>,
        private val submittedAt: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("input_message_accountability_data")
            @ExcludeMissing
            inputMessageAccountabilityData: JsonField<String> = JsonMissing.of(),
            @JsonProperty("submitted_at")
            @ExcludeMissing
            submittedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(inputMessageAccountabilityData, submittedAt, mutableMapOf())

        /**
         * The accountability data for the submission.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun inputMessageAccountabilityData(): String =
            inputMessageAccountabilityData.getRequired("input_message_accountability_data")

        /**
         * When this wire transfer was submitted to Fedwire.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun submittedAt(): OffsetDateTime = submittedAt.getRequired("submitted_at")

        /**
         * Returns the raw JSON value of [inputMessageAccountabilityData].
         *
         * Unlike [inputMessageAccountabilityData], this method doesn't throw if the JSON field has
         * an unexpected type.
         */
        @JsonProperty("input_message_accountability_data")
        @ExcludeMissing
        fun _inputMessageAccountabilityData(): JsonField<String> = inputMessageAccountabilityData

        /**
         * Returns the raw JSON value of [submittedAt].
         *
         * Unlike [submittedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("submitted_at")
        @ExcludeMissing
        fun _submittedAt(): JsonField<OffsetDateTime> = submittedAt

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Submission].
             *
             * The following fields are required:
             * ```java
             * .inputMessageAccountabilityData()
             * .submittedAt()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Submission]. */
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

            /**
             * Sets [Builder.inputMessageAccountabilityData] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inputMessageAccountabilityData] with a well-typed
             * [String] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun inputMessageAccountabilityData(inputMessageAccountabilityData: JsonField<String>) =
                apply {
                    this.inputMessageAccountabilityData = inputMessageAccountabilityData
                }

            /** When this wire transfer was submitted to Fedwire. */
            fun submittedAt(submittedAt: OffsetDateTime) = submittedAt(JsonField.of(submittedAt))

            /**
             * Sets [Builder.submittedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.submittedAt] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
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

            /**
             * Returns an immutable instance of [Submission].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .inputMessageAccountabilityData()
             * .submittedAt()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Submission =
                Submission(
                    checkRequired("inputMessageAccountabilityData", inputMessageAccountabilityData),
                    checkRequired("submittedAt", submittedAt),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Submission = apply {
            if (validated) {
                return@apply
            }

            inputMessageAccountabilityData()
            submittedAt()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: IncreaseInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (inputMessageAccountabilityData.asKnown().isPresent) 1 else 0) +
                (if (submittedAt.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Submission &&
                inputMessageAccountabilityData == other.inputMessageAccountabilityData &&
                submittedAt == other.submittedAt &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(inputMessageAccountabilityData, submittedAt, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Submission{inputMessageAccountabilityData=$inputMessageAccountabilityData, submittedAt=$submittedAt, additionalProperties=$additionalProperties}"
    }

    /**
     * A constant representing the object's type. For this resource it will always be
     * `wire_transfer`.
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

            @JvmField val WIRE_TRANSFER = of("wire_transfer")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            WIRE_TRANSFER
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
            WIRE_TRANSFER,
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
                WIRE_TRANSFER -> Value.WIRE_TRANSFER
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
                WIRE_TRANSFER -> Known.WIRE_TRANSFER
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

        private var validated: Boolean = false

        fun validate(): Type = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: IncreaseInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Type && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is WireTransfer &&
            id == other.id &&
            accountId == other.accountId &&
            accountNumber == other.accountNumber &&
            amount == other.amount &&
            approval == other.approval &&
            cancellation == other.cancellation &&
            createdAt == other.createdAt &&
            createdBy == other.createdBy &&
            creditor == other.creditor &&
            currency == other.currency &&
            debtor == other.debtor &&
            externalAccountId == other.externalAccountId &&
            idempotencyKey == other.idempotencyKey &&
            inboundWireDrawdownRequestId == other.inboundWireDrawdownRequestId &&
            network == other.network &&
            pendingTransactionId == other.pendingTransactionId &&
            remittance == other.remittance &&
            reversal == other.reversal &&
            routingNumber == other.routingNumber &&
            sourceAccountNumberId == other.sourceAccountNumberId &&
            status == other.status &&
            submission == other.submission &&
            transactionId == other.transactionId &&
            type == other.type &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            accountId,
            accountNumber,
            amount,
            approval,
            cancellation,
            createdAt,
            createdBy,
            creditor,
            currency,
            debtor,
            externalAccountId,
            idempotencyKey,
            inboundWireDrawdownRequestId,
            network,
            pendingTransactionId,
            remittance,
            reversal,
            routingNumber,
            sourceAccountNumberId,
            status,
            submission,
            transactionId,
            type,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "WireTransfer{id=$id, accountId=$accountId, accountNumber=$accountNumber, amount=$amount, approval=$approval, cancellation=$cancellation, createdAt=$createdAt, createdBy=$createdBy, creditor=$creditor, currency=$currency, debtor=$debtor, externalAccountId=$externalAccountId, idempotencyKey=$idempotencyKey, inboundWireDrawdownRequestId=$inboundWireDrawdownRequestId, network=$network, pendingTransactionId=$pendingTransactionId, remittance=$remittance, reversal=$reversal, routingNumber=$routingNumber, sourceAccountNumberId=$sourceAccountNumberId, status=$status, submission=$submission, transactionId=$transactionId, type=$type, additionalProperties=$additionalProperties}"
}
