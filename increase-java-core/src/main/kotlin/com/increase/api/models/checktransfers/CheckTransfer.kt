// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.checktransfers

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
import com.increase.api.core.checkKnown
import com.increase.api.core.checkRequired
import com.increase.api.core.immutableEmptyMap
import com.increase.api.core.toImmutable
import com.increase.api.errors.IncreaseInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Check Transfers move funds from your Increase account by mailing a physical check. */
@NoAutoDetect
class CheckTransfer
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
    @JsonProperty("approved_inbound_check_deposit_id")
    @ExcludeMissing
    private val approvedInboundCheckDepositId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("cancellation")
    @ExcludeMissing
    private val cancellation: JsonField<Cancellation> = JsonMissing.of(),
    @JsonProperty("check_number")
    @ExcludeMissing
    private val checkNumber: JsonField<String> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("created_by")
    @ExcludeMissing
    private val createdBy: JsonField<CreatedBy> = JsonMissing.of(),
    @JsonProperty("currency")
    @ExcludeMissing
    private val currency: JsonField<Currency> = JsonMissing.of(),
    @JsonProperty("fulfillment_method")
    @ExcludeMissing
    private val fulfillmentMethod: JsonField<FulfillmentMethod> = JsonMissing.of(),
    @JsonProperty("idempotency_key")
    @ExcludeMissing
    private val idempotencyKey: JsonField<String> = JsonMissing.of(),
    @JsonProperty("mailing")
    @ExcludeMissing
    private val mailing: JsonField<Mailing> = JsonMissing.of(),
    @JsonProperty("pending_transaction_id")
    @ExcludeMissing
    private val pendingTransactionId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("physical_check")
    @ExcludeMissing
    private val physicalCheck: JsonField<PhysicalCheck> = JsonMissing.of(),
    @JsonProperty("routing_number")
    @ExcludeMissing
    private val routingNumber: JsonField<String> = JsonMissing.of(),
    @JsonProperty("source_account_number_id")
    @ExcludeMissing
    private val sourceAccountNumberId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("status")
    @ExcludeMissing
    private val status: JsonField<Status> = JsonMissing.of(),
    @JsonProperty("stop_payment_request")
    @ExcludeMissing
    private val stopPaymentRequest: JsonField<StopPaymentRequest> = JsonMissing.of(),
    @JsonProperty("submission")
    @ExcludeMissing
    private val submission: JsonField<Submission> = JsonMissing.of(),
    @JsonProperty("third_party")
    @ExcludeMissing
    private val thirdParty: JsonField<ThirdParty> = JsonMissing.of(),
    @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The Check transfer's identifier. */
    fun id(): String = id.getRequired("id")

    /** The identifier of the Account from which funds will be transferred. */
    fun accountId(): String = accountId.getRequired("account_id")

    /** The account number printed on the check. */
    fun accountNumber(): String = accountNumber.getRequired("account_number")

    /** The transfer amount in USD cents. */
    fun amount(): Long = amount.getRequired("amount")

    /**
     * If your account requires approvals for transfers and the transfer was approved, this will
     * contain details of the approval.
     */
    fun approval(): Optional<Approval> = Optional.ofNullable(approval.getNullable("approval"))

    /**
     * If the Check Transfer was successfully deposited, this will contain the identifier of the
     * Inbound Check Deposit object with details of the deposit.
     */
    fun approvedInboundCheckDepositId(): Optional<String> =
        Optional.ofNullable(
            approvedInboundCheckDepositId.getNullable("approved_inbound_check_deposit_id")
        )

    /**
     * If your account requires approvals for transfers and the transfer was not approved, this will
     * contain details of the cancellation.
     */
    fun cancellation(): Optional<Cancellation> =
        Optional.ofNullable(cancellation.getNullable("cancellation"))

    /** The check number printed on the check. */
    fun checkNumber(): String = checkNumber.getRequired("check_number")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the transfer
     * was created.
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /** What object created the transfer, either via the API or the dashboard. */
    fun createdBy(): Optional<CreatedBy> = Optional.ofNullable(createdBy.getNullable("created_by"))

    /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the check's currency. */
    fun currency(): Currency = currency.getRequired("currency")

    /** Whether Increase will print and mail the check or if you will do it yourself. */
    fun fulfillmentMethod(): FulfillmentMethod = fulfillmentMethod.getRequired("fulfillment_method")

    /**
     * The idempotency key you chose for this object. This value is unique across Increase and is
     * used to ensure that a request is only processed once. Learn more about
     * [idempotency](https://increase.com/documentation/idempotency-keys).
     */
    fun idempotencyKey(): Optional<String> =
        Optional.ofNullable(idempotencyKey.getNullable("idempotency_key"))

    /** If the check has been mailed by Increase, this will contain details of the shipment. */
    fun mailing(): Optional<Mailing> = Optional.ofNullable(mailing.getNullable("mailing"))

    /**
     * The ID for the pending transaction representing the transfer. A pending transaction is
     * created when the transfer
     * [requires approval](https://increase.com/documentation/transfer-approvals#transfer-approvals)
     * by someone else in your organization.
     */
    fun pendingTransactionId(): Optional<String> =
        Optional.ofNullable(pendingTransactionId.getNullable("pending_transaction_id"))

    /**
     * Details relating to the physical check that Increase will print and mail. Will be present if
     * and only if `fulfillment_method` is equal to `physical_check`.
     */
    fun physicalCheck(): Optional<PhysicalCheck> =
        Optional.ofNullable(physicalCheck.getNullable("physical_check"))

    /** The routing number printed on the check. */
    fun routingNumber(): String = routingNumber.getRequired("routing_number")

    /**
     * The identifier of the Account Number from which to send the transfer and print on the check.
     */
    fun sourceAccountNumberId(): Optional<String> =
        Optional.ofNullable(sourceAccountNumberId.getNullable("source_account_number_id"))

    /** The lifecycle status of the transfer. */
    fun status(): Status = status.getRequired("status")

    /** After a stop-payment is requested on the check, this will contain supplemental details. */
    fun stopPaymentRequest(): Optional<StopPaymentRequest> =
        Optional.ofNullable(stopPaymentRequest.getNullable("stop_payment_request"))

    /** After the transfer is submitted, this will contain supplemental details. */
    fun submission(): Optional<Submission> =
        Optional.ofNullable(submission.getNullable("submission"))

    /**
     * Details relating to the custom fulfillment you will perform. Will be present if and only if
     * `fulfillment_method` is equal to `third_party`.
     */
    fun thirdParty(): Optional<ThirdParty> =
        Optional.ofNullable(thirdParty.getNullable("third_party"))

    /**
     * A constant representing the object's type. For this resource it will always be
     * `check_transfer`.
     */
    fun type(): Type = type.getRequired("type")

    /** The Check transfer's identifier. */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /** The identifier of the Account from which funds will be transferred. */
    @JsonProperty("account_id") @ExcludeMissing fun _accountId(): JsonField<String> = accountId

    /** The account number printed on the check. */
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

    /**
     * If the Check Transfer was successfully deposited, this will contain the identifier of the
     * Inbound Check Deposit object with details of the deposit.
     */
    @JsonProperty("approved_inbound_check_deposit_id")
    @ExcludeMissing
    fun _approvedInboundCheckDepositId(): JsonField<String> = approvedInboundCheckDepositId

    /**
     * If your account requires approvals for transfers and the transfer was not approved, this will
     * contain details of the cancellation.
     */
    @JsonProperty("cancellation")
    @ExcludeMissing
    fun _cancellation(): JsonField<Cancellation> = cancellation

    /** The check number printed on the check. */
    @JsonProperty("check_number")
    @ExcludeMissing
    fun _checkNumber(): JsonField<String> = checkNumber

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the transfer
     * was created.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /** What object created the transfer, either via the API or the dashboard. */
    @JsonProperty("created_by") @ExcludeMissing fun _createdBy(): JsonField<CreatedBy> = createdBy

    /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the check's currency. */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<Currency> = currency

    /** Whether Increase will print and mail the check or if you will do it yourself. */
    @JsonProperty("fulfillment_method")
    @ExcludeMissing
    fun _fulfillmentMethod(): JsonField<FulfillmentMethod> = fulfillmentMethod

    /**
     * The idempotency key you chose for this object. This value is unique across Increase and is
     * used to ensure that a request is only processed once. Learn more about
     * [idempotency](https://increase.com/documentation/idempotency-keys).
     */
    @JsonProperty("idempotency_key")
    @ExcludeMissing
    fun _idempotencyKey(): JsonField<String> = idempotencyKey

    /** If the check has been mailed by Increase, this will contain details of the shipment. */
    @JsonProperty("mailing") @ExcludeMissing fun _mailing(): JsonField<Mailing> = mailing

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
     * Details relating to the physical check that Increase will print and mail. Will be present if
     * and only if `fulfillment_method` is equal to `physical_check`.
     */
    @JsonProperty("physical_check")
    @ExcludeMissing
    fun _physicalCheck(): JsonField<PhysicalCheck> = physicalCheck

    /** The routing number printed on the check. */
    @JsonProperty("routing_number")
    @ExcludeMissing
    fun _routingNumber(): JsonField<String> = routingNumber

    /**
     * The identifier of the Account Number from which to send the transfer and print on the check.
     */
    @JsonProperty("source_account_number_id")
    @ExcludeMissing
    fun _sourceAccountNumberId(): JsonField<String> = sourceAccountNumberId

    /** The lifecycle status of the transfer. */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /** After a stop-payment is requested on the check, this will contain supplemental details. */
    @JsonProperty("stop_payment_request")
    @ExcludeMissing
    fun _stopPaymentRequest(): JsonField<StopPaymentRequest> = stopPaymentRequest

    /** After the transfer is submitted, this will contain supplemental details. */
    @JsonProperty("submission")
    @ExcludeMissing
    fun _submission(): JsonField<Submission> = submission

    /**
     * Details relating to the custom fulfillment you will perform. Will be present if and only if
     * `fulfillment_method` is equal to `third_party`.
     */
    @JsonProperty("third_party")
    @ExcludeMissing
    fun _thirdParty(): JsonField<ThirdParty> = thirdParty

    /**
     * A constant representing the object's type. For this resource it will always be
     * `check_transfer`.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): CheckTransfer = apply {
        if (validated) {
            return@apply
        }

        id()
        accountId()
        accountNumber()
        amount()
        approval().ifPresent { it.validate() }
        approvedInboundCheckDepositId()
        cancellation().ifPresent { it.validate() }
        checkNumber()
        createdAt()
        createdBy().ifPresent { it.validate() }
        currency()
        fulfillmentMethod()
        idempotencyKey()
        mailing().ifPresent { it.validate() }
        pendingTransactionId()
        physicalCheck().ifPresent { it.validate() }
        routingNumber()
        sourceAccountNumberId()
        status()
        stopPaymentRequest().ifPresent { it.validate() }
        submission().ifPresent { it.validate() }
        thirdParty().ifPresent { it.validate() }
        type()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CheckTransfer].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .accountId()
         * .accountNumber()
         * .amount()
         * .approval()
         * .approvedInboundCheckDepositId()
         * .cancellation()
         * .checkNumber()
         * .createdAt()
         * .createdBy()
         * .currency()
         * .fulfillmentMethod()
         * .idempotencyKey()
         * .mailing()
         * .pendingTransactionId()
         * .physicalCheck()
         * .routingNumber()
         * .sourceAccountNumberId()
         * .status()
         * .stopPaymentRequest()
         * .submission()
         * .thirdParty()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CheckTransfer]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var accountId: JsonField<String>? = null
        private var accountNumber: JsonField<String>? = null
        private var amount: JsonField<Long>? = null
        private var approval: JsonField<Approval>? = null
        private var approvedInboundCheckDepositId: JsonField<String>? = null
        private var cancellation: JsonField<Cancellation>? = null
        private var checkNumber: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var createdBy: JsonField<CreatedBy>? = null
        private var currency: JsonField<Currency>? = null
        private var fulfillmentMethod: JsonField<FulfillmentMethod>? = null
        private var idempotencyKey: JsonField<String>? = null
        private var mailing: JsonField<Mailing>? = null
        private var pendingTransactionId: JsonField<String>? = null
        private var physicalCheck: JsonField<PhysicalCheck>? = null
        private var routingNumber: JsonField<String>? = null
        private var sourceAccountNumberId: JsonField<String>? = null
        private var status: JsonField<Status>? = null
        private var stopPaymentRequest: JsonField<StopPaymentRequest>? = null
        private var submission: JsonField<Submission>? = null
        private var thirdParty: JsonField<ThirdParty>? = null
        private var type: JsonField<Type>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(checkTransfer: CheckTransfer) = apply {
            id = checkTransfer.id
            accountId = checkTransfer.accountId
            accountNumber = checkTransfer.accountNumber
            amount = checkTransfer.amount
            approval = checkTransfer.approval
            approvedInboundCheckDepositId = checkTransfer.approvedInboundCheckDepositId
            cancellation = checkTransfer.cancellation
            checkNumber = checkTransfer.checkNumber
            createdAt = checkTransfer.createdAt
            createdBy = checkTransfer.createdBy
            currency = checkTransfer.currency
            fulfillmentMethod = checkTransfer.fulfillmentMethod
            idempotencyKey = checkTransfer.idempotencyKey
            mailing = checkTransfer.mailing
            pendingTransactionId = checkTransfer.pendingTransactionId
            physicalCheck = checkTransfer.physicalCheck
            routingNumber = checkTransfer.routingNumber
            sourceAccountNumberId = checkTransfer.sourceAccountNumberId
            status = checkTransfer.status
            stopPaymentRequest = checkTransfer.stopPaymentRequest
            submission = checkTransfer.submission
            thirdParty = checkTransfer.thirdParty
            type = checkTransfer.type
            additionalProperties = checkTransfer.additionalProperties.toMutableMap()
        }

        /** The Check transfer's identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The Check transfer's identifier. */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The identifier of the Account from which funds will be transferred. */
        fun accountId(accountId: String) = accountId(JsonField.of(accountId))

        /** The identifier of the Account from which funds will be transferred. */
        fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

        /** The account number printed on the check. */
        fun accountNumber(accountNumber: String) = accountNumber(JsonField.of(accountNumber))

        /** The account number printed on the check. */
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
        fun approval(approval: Optional<Approval>) = approval(approval.getOrNull())

        /**
         * If your account requires approvals for transfers and the transfer was approved, this will
         * contain details of the approval.
         */
        fun approval(approval: JsonField<Approval>) = apply { this.approval = approval }

        /**
         * If the Check Transfer was successfully deposited, this will contain the identifier of the
         * Inbound Check Deposit object with details of the deposit.
         */
        fun approvedInboundCheckDepositId(approvedInboundCheckDepositId: String?) =
            approvedInboundCheckDepositId(JsonField.ofNullable(approvedInboundCheckDepositId))

        /**
         * If the Check Transfer was successfully deposited, this will contain the identifier of the
         * Inbound Check Deposit object with details of the deposit.
         */
        fun approvedInboundCheckDepositId(approvedInboundCheckDepositId: Optional<String>) =
            approvedInboundCheckDepositId(approvedInboundCheckDepositId.getOrNull())

        /**
         * If the Check Transfer was successfully deposited, this will contain the identifier of the
         * Inbound Check Deposit object with details of the deposit.
         */
        fun approvedInboundCheckDepositId(approvedInboundCheckDepositId: JsonField<String>) =
            apply {
                this.approvedInboundCheckDepositId = approvedInboundCheckDepositId
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
            cancellation(cancellation.getOrNull())

        /**
         * If your account requires approvals for transfers and the transfer was not approved, this
         * will contain details of the cancellation.
         */
        fun cancellation(cancellation: JsonField<Cancellation>) = apply {
            this.cancellation = cancellation
        }

        /** The check number printed on the check. */
        fun checkNumber(checkNumber: String) = checkNumber(JsonField.of(checkNumber))

        /** The check number printed on the check. */
        fun checkNumber(checkNumber: JsonField<String>) = apply { this.checkNumber = checkNumber }

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

        /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the check's currency. */
        fun currency(currency: Currency) = currency(JsonField.of(currency))

        /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the check's currency. */
        fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

        /** Whether Increase will print and mail the check or if you will do it yourself. */
        fun fulfillmentMethod(fulfillmentMethod: FulfillmentMethod) =
            fulfillmentMethod(JsonField.of(fulfillmentMethod))

        /** Whether Increase will print and mail the check or if you will do it yourself. */
        fun fulfillmentMethod(fulfillmentMethod: JsonField<FulfillmentMethod>) = apply {
            this.fulfillmentMethod = fulfillmentMethod
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

        /** If the check has been mailed by Increase, this will contain details of the shipment. */
        fun mailing(mailing: Mailing?) = mailing(JsonField.ofNullable(mailing))

        /** If the check has been mailed by Increase, this will contain details of the shipment. */
        fun mailing(mailing: Optional<Mailing>) = mailing(mailing.getOrNull())

        /** If the check has been mailed by Increase, this will contain details of the shipment. */
        fun mailing(mailing: JsonField<Mailing>) = apply { this.mailing = mailing }

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
         * Details relating to the physical check that Increase will print and mail. Will be present
         * if and only if `fulfillment_method` is equal to `physical_check`.
         */
        fun physicalCheck(physicalCheck: PhysicalCheck?) =
            physicalCheck(JsonField.ofNullable(physicalCheck))

        /**
         * Details relating to the physical check that Increase will print and mail. Will be present
         * if and only if `fulfillment_method` is equal to `physical_check`.
         */
        fun physicalCheck(physicalCheck: Optional<PhysicalCheck>) =
            physicalCheck(physicalCheck.getOrNull())

        /**
         * Details relating to the physical check that Increase will print and mail. Will be present
         * if and only if `fulfillment_method` is equal to `physical_check`.
         */
        fun physicalCheck(physicalCheck: JsonField<PhysicalCheck>) = apply {
            this.physicalCheck = physicalCheck
        }

        /** The routing number printed on the check. */
        fun routingNumber(routingNumber: String) = routingNumber(JsonField.of(routingNumber))

        /** The routing number printed on the check. */
        fun routingNumber(routingNumber: JsonField<String>) = apply {
            this.routingNumber = routingNumber
        }

        /**
         * The identifier of the Account Number from which to send the transfer and print on the
         * check.
         */
        fun sourceAccountNumberId(sourceAccountNumberId: String?) =
            sourceAccountNumberId(JsonField.ofNullable(sourceAccountNumberId))

        /**
         * The identifier of the Account Number from which to send the transfer and print on the
         * check.
         */
        fun sourceAccountNumberId(sourceAccountNumberId: Optional<String>) =
            sourceAccountNumberId(sourceAccountNumberId.getOrNull())

        /**
         * The identifier of the Account Number from which to send the transfer and print on the
         * check.
         */
        fun sourceAccountNumberId(sourceAccountNumberId: JsonField<String>) = apply {
            this.sourceAccountNumberId = sourceAccountNumberId
        }

        /** The lifecycle status of the transfer. */
        fun status(status: Status) = status(JsonField.of(status))

        /** The lifecycle status of the transfer. */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /**
         * After a stop-payment is requested on the check, this will contain supplemental details.
         */
        fun stopPaymentRequest(stopPaymentRequest: StopPaymentRequest?) =
            stopPaymentRequest(JsonField.ofNullable(stopPaymentRequest))

        /**
         * After a stop-payment is requested on the check, this will contain supplemental details.
         */
        fun stopPaymentRequest(stopPaymentRequest: Optional<StopPaymentRequest>) =
            stopPaymentRequest(stopPaymentRequest.getOrNull())

        /**
         * After a stop-payment is requested on the check, this will contain supplemental details.
         */
        fun stopPaymentRequest(stopPaymentRequest: JsonField<StopPaymentRequest>) = apply {
            this.stopPaymentRequest = stopPaymentRequest
        }

        /** After the transfer is submitted, this will contain supplemental details. */
        fun submission(submission: Submission?) = submission(JsonField.ofNullable(submission))

        /** After the transfer is submitted, this will contain supplemental details. */
        fun submission(submission: Optional<Submission>) = submission(submission.getOrNull())

        /** After the transfer is submitted, this will contain supplemental details. */
        fun submission(submission: JsonField<Submission>) = apply { this.submission = submission }

        /**
         * Details relating to the custom fulfillment you will perform. Will be present if and only
         * if `fulfillment_method` is equal to `third_party`.
         */
        fun thirdParty(thirdParty: ThirdParty?) = thirdParty(JsonField.ofNullable(thirdParty))

        /**
         * Details relating to the custom fulfillment you will perform. Will be present if and only
         * if `fulfillment_method` is equal to `third_party`.
         */
        fun thirdParty(thirdParty: Optional<ThirdParty>) = thirdParty(thirdParty.getOrNull())

        /**
         * Details relating to the custom fulfillment you will perform. Will be present if and only
         * if `fulfillment_method` is equal to `third_party`.
         */
        fun thirdParty(thirdParty: JsonField<ThirdParty>) = apply { this.thirdParty = thirdParty }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `check_transfer`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * A constant representing the object's type. For this resource it will always be
         * `check_transfer`.
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

        fun build(): CheckTransfer =
            CheckTransfer(
                checkRequired("id", id),
                checkRequired("accountId", accountId),
                checkRequired("accountNumber", accountNumber),
                checkRequired("amount", amount),
                checkRequired("approval", approval),
                checkRequired("approvedInboundCheckDepositId", approvedInboundCheckDepositId),
                checkRequired("cancellation", cancellation),
                checkRequired("checkNumber", checkNumber),
                checkRequired("createdAt", createdAt),
                checkRequired("createdBy", createdBy),
                checkRequired("currency", currency),
                checkRequired("fulfillmentMethod", fulfillmentMethod),
                checkRequired("idempotencyKey", idempotencyKey),
                checkRequired("mailing", mailing),
                checkRequired("pendingTransactionId", pendingTransactionId),
                checkRequired("physicalCheck", physicalCheck),
                checkRequired("routingNumber", routingNumber),
                checkRequired("sourceAccountNumberId", sourceAccountNumberId),
                checkRequired("status", status),
                checkRequired("stopPaymentRequest", stopPaymentRequest),
                checkRequired("submission", submission),
                checkRequired("thirdParty", thirdParty),
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

    /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the check's currency. */
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

    /** Whether Increase will print and mail the check or if you will do it yourself. */
    class FulfillmentMethod @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            /** Increase will print and mail a physical check. */
            @JvmField val PHYSICAL_CHECK = of("physical_check")

            /**
             * Increase will not print a check; you are responsible for printing and mailing a check
             * with the provided account number, routing number, check number, and amount.
             */
            @JvmField val THIRD_PARTY = of("third_party")

            @JvmStatic fun of(value: String) = FulfillmentMethod(JsonField.of(value))
        }

        /** An enum containing [FulfillmentMethod]'s known values. */
        enum class Known {
            /** Increase will print and mail a physical check. */
            PHYSICAL_CHECK,
            /**
             * Increase will not print a check; you are responsible for printing and mailing a check
             * with the provided account number, routing number, check number, and amount.
             */
            THIRD_PARTY,
        }

        /**
         * An enum containing [FulfillmentMethod]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [FulfillmentMethod] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            /** Increase will print and mail a physical check. */
            PHYSICAL_CHECK,
            /**
             * Increase will not print a check; you are responsible for printing and mailing a check
             * with the provided account number, routing number, check number, and amount.
             */
            THIRD_PARTY,
            /**
             * An enum member indicating that [FulfillmentMethod] was instantiated with an unknown
             * value.
             */
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
                PHYSICAL_CHECK -> Value.PHYSICAL_CHECK
                THIRD_PARTY -> Value.THIRD_PARTY
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
                PHYSICAL_CHECK -> Known.PHYSICAL_CHECK
                THIRD_PARTY -> Known.THIRD_PARTY
                else -> throw IncreaseInvalidDataException("Unknown FulfillmentMethod: $value")
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

            return /* spotless:off */ other is FulfillmentMethod && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** If the check has been mailed by Increase, this will contain details of the shipment. */
    @NoAutoDetect
    class Mailing
    @JsonCreator
    private constructor(
        @JsonProperty("image_id")
        @ExcludeMissing
        private val imageId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("mailed_at")
        @ExcludeMissing
        private val mailedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("tracking_number")
        @ExcludeMissing
        private val trackingNumber: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * The ID of the file corresponding to an image of the check that was mailed, if available.
         */
        fun imageId(): Optional<String> = Optional.ofNullable(imageId.getNullable("image_id"))

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the check
         * was mailed.
         */
        fun mailedAt(): OffsetDateTime = mailedAt.getRequired("mailed_at")

        /** The tracking number of the shipment, if available for the shipping method. */
        fun trackingNumber(): Optional<String> =
            Optional.ofNullable(trackingNumber.getNullable("tracking_number"))

        /**
         * The ID of the file corresponding to an image of the check that was mailed, if available.
         */
        @JsonProperty("image_id") @ExcludeMissing fun _imageId(): JsonField<String> = imageId

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the check
         * was mailed.
         */
        @JsonProperty("mailed_at")
        @ExcludeMissing
        fun _mailedAt(): JsonField<OffsetDateTime> = mailedAt

        /** The tracking number of the shipment, if available for the shipping method. */
        @JsonProperty("tracking_number")
        @ExcludeMissing
        fun _trackingNumber(): JsonField<String> = trackingNumber

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Mailing = apply {
            if (validated) {
                return@apply
            }

            imageId()
            mailedAt()
            trackingNumber()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Mailing].
             *
             * The following fields are required:
             * ```java
             * .imageId()
             * .mailedAt()
             * .trackingNumber()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Mailing]. */
        class Builder internal constructor() {

            private var imageId: JsonField<String>? = null
            private var mailedAt: JsonField<OffsetDateTime>? = null
            private var trackingNumber: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(mailing: Mailing) = apply {
                imageId = mailing.imageId
                mailedAt = mailing.mailedAt
                trackingNumber = mailing.trackingNumber
                additionalProperties = mailing.additionalProperties.toMutableMap()
            }

            /**
             * The ID of the file corresponding to an image of the check that was mailed, if
             * available.
             */
            fun imageId(imageId: String?) = imageId(JsonField.ofNullable(imageId))

            /**
             * The ID of the file corresponding to an image of the check that was mailed, if
             * available.
             */
            fun imageId(imageId: Optional<String>) = imageId(imageId.getOrNull())

            /**
             * The ID of the file corresponding to an image of the check that was mailed, if
             * available.
             */
            fun imageId(imageId: JsonField<String>) = apply { this.imageId = imageId }

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * check was mailed.
             */
            fun mailedAt(mailedAt: OffsetDateTime) = mailedAt(JsonField.of(mailedAt))

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * check was mailed.
             */
            fun mailedAt(mailedAt: JsonField<OffsetDateTime>) = apply { this.mailedAt = mailedAt }

            /** The tracking number of the shipment, if available for the shipping method. */
            fun trackingNumber(trackingNumber: String?) =
                trackingNumber(JsonField.ofNullable(trackingNumber))

            /** The tracking number of the shipment, if available for the shipping method. */
            fun trackingNumber(trackingNumber: Optional<String>) =
                trackingNumber(trackingNumber.getOrNull())

            /** The tracking number of the shipment, if available for the shipping method. */
            fun trackingNumber(trackingNumber: JsonField<String>) = apply {
                this.trackingNumber = trackingNumber
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

            fun build(): Mailing =
                Mailing(
                    checkRequired("imageId", imageId),
                    checkRequired("mailedAt", mailedAt),
                    checkRequired("trackingNumber", trackingNumber),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Mailing && imageId == other.imageId && mailedAt == other.mailedAt && trackingNumber == other.trackingNumber && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(imageId, mailedAt, trackingNumber, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Mailing{imageId=$imageId, mailedAt=$mailedAt, trackingNumber=$trackingNumber, additionalProperties=$additionalProperties}"
    }

    /**
     * Details relating to the physical check that Increase will print and mail. Will be present if
     * and only if `fulfillment_method` is equal to `physical_check`.
     */
    @NoAutoDetect
    class PhysicalCheck
    @JsonCreator
    private constructor(
        @JsonProperty("mailing_address")
        @ExcludeMissing
        private val mailingAddress: JsonField<MailingAddress> = JsonMissing.of(),
        @JsonProperty("memo")
        @ExcludeMissing
        private val memo: JsonField<String> = JsonMissing.of(),
        @JsonProperty("note")
        @ExcludeMissing
        private val note: JsonField<String> = JsonMissing.of(),
        @JsonProperty("recipient_name")
        @ExcludeMissing
        private val recipientName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("return_address")
        @ExcludeMissing
        private val returnAddress: JsonField<ReturnAddress> = JsonMissing.of(),
        @JsonProperty("shipping_method")
        @ExcludeMissing
        private val shippingMethod: JsonField<ShippingMethod> = JsonMissing.of(),
        @JsonProperty("signature_text")
        @ExcludeMissing
        private val signatureText: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tracking_updates")
        @ExcludeMissing
        private val trackingUpdates: JsonField<List<TrackingUpdate>> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Details for where Increase will mail the check. */
        fun mailingAddress(): MailingAddress = mailingAddress.getRequired("mailing_address")

        /** The descriptor that will be printed on the memo field on the check. */
        fun memo(): Optional<String> = Optional.ofNullable(memo.getNullable("memo"))

        /** The descriptor that will be printed on the letter included with the check. */
        fun note(): Optional<String> = Optional.ofNullable(note.getNullable("note"))

        /** The name that will be printed on the check. */
        fun recipientName(): String = recipientName.getRequired("recipient_name")

        /** The return address to be printed on the check. */
        fun returnAddress(): Optional<ReturnAddress> =
            Optional.ofNullable(returnAddress.getNullable("return_address"))

        /** The shipping method for the check. */
        fun shippingMethod(): Optional<ShippingMethod> =
            Optional.ofNullable(shippingMethod.getNullable("shipping_method"))

        /**
         * The text that will appear as the signature on the check in cursive font. If blank, the
         * check will be printed with 'No signature required'.
         */
        fun signatureText(): Optional<String> =
            Optional.ofNullable(signatureText.getNullable("signature_text"))

        /** Tracking updates relating to the physical check's delivery. */
        fun trackingUpdates(): List<TrackingUpdate> =
            trackingUpdates.getRequired("tracking_updates")

        /** Details for where Increase will mail the check. */
        @JsonProperty("mailing_address")
        @ExcludeMissing
        fun _mailingAddress(): JsonField<MailingAddress> = mailingAddress

        /** The descriptor that will be printed on the memo field on the check. */
        @JsonProperty("memo") @ExcludeMissing fun _memo(): JsonField<String> = memo

        /** The descriptor that will be printed on the letter included with the check. */
        @JsonProperty("note") @ExcludeMissing fun _note(): JsonField<String> = note

        /** The name that will be printed on the check. */
        @JsonProperty("recipient_name")
        @ExcludeMissing
        fun _recipientName(): JsonField<String> = recipientName

        /** The return address to be printed on the check. */
        @JsonProperty("return_address")
        @ExcludeMissing
        fun _returnAddress(): JsonField<ReturnAddress> = returnAddress

        /** The shipping method for the check. */
        @JsonProperty("shipping_method")
        @ExcludeMissing
        fun _shippingMethod(): JsonField<ShippingMethod> = shippingMethod

        /**
         * The text that will appear as the signature on the check in cursive font. If blank, the
         * check will be printed with 'No signature required'.
         */
        @JsonProperty("signature_text")
        @ExcludeMissing
        fun _signatureText(): JsonField<String> = signatureText

        /** Tracking updates relating to the physical check's delivery. */
        @JsonProperty("tracking_updates")
        @ExcludeMissing
        fun _trackingUpdates(): JsonField<List<TrackingUpdate>> = trackingUpdates

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): PhysicalCheck = apply {
            if (validated) {
                return@apply
            }

            mailingAddress().validate()
            memo()
            note()
            recipientName()
            returnAddress().ifPresent { it.validate() }
            shippingMethod()
            signatureText()
            trackingUpdates().forEach { it.validate() }
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [PhysicalCheck].
             *
             * The following fields are required:
             * ```java
             * .mailingAddress()
             * .memo()
             * .note()
             * .recipientName()
             * .returnAddress()
             * .shippingMethod()
             * .signatureText()
             * .trackingUpdates()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [PhysicalCheck]. */
        class Builder internal constructor() {

            private var mailingAddress: JsonField<MailingAddress>? = null
            private var memo: JsonField<String>? = null
            private var note: JsonField<String>? = null
            private var recipientName: JsonField<String>? = null
            private var returnAddress: JsonField<ReturnAddress>? = null
            private var shippingMethod: JsonField<ShippingMethod>? = null
            private var signatureText: JsonField<String>? = null
            private var trackingUpdates: JsonField<MutableList<TrackingUpdate>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(physicalCheck: PhysicalCheck) = apply {
                mailingAddress = physicalCheck.mailingAddress
                memo = physicalCheck.memo
                note = physicalCheck.note
                recipientName = physicalCheck.recipientName
                returnAddress = physicalCheck.returnAddress
                shippingMethod = physicalCheck.shippingMethod
                signatureText = physicalCheck.signatureText
                trackingUpdates = physicalCheck.trackingUpdates.map { it.toMutableList() }
                additionalProperties = physicalCheck.additionalProperties.toMutableMap()
            }

            /** Details for where Increase will mail the check. */
            fun mailingAddress(mailingAddress: MailingAddress) =
                mailingAddress(JsonField.of(mailingAddress))

            /** Details for where Increase will mail the check. */
            fun mailingAddress(mailingAddress: JsonField<MailingAddress>) = apply {
                this.mailingAddress = mailingAddress
            }

            /** The descriptor that will be printed on the memo field on the check. */
            fun memo(memo: String?) = memo(JsonField.ofNullable(memo))

            /** The descriptor that will be printed on the memo field on the check. */
            fun memo(memo: Optional<String>) = memo(memo.getOrNull())

            /** The descriptor that will be printed on the memo field on the check. */
            fun memo(memo: JsonField<String>) = apply { this.memo = memo }

            /** The descriptor that will be printed on the letter included with the check. */
            fun note(note: String?) = note(JsonField.ofNullable(note))

            /** The descriptor that will be printed on the letter included with the check. */
            fun note(note: Optional<String>) = note(note.getOrNull())

            /** The descriptor that will be printed on the letter included with the check. */
            fun note(note: JsonField<String>) = apply { this.note = note }

            /** The name that will be printed on the check. */
            fun recipientName(recipientName: String) = recipientName(JsonField.of(recipientName))

            /** The name that will be printed on the check. */
            fun recipientName(recipientName: JsonField<String>) = apply {
                this.recipientName = recipientName
            }

            /** The return address to be printed on the check. */
            fun returnAddress(returnAddress: ReturnAddress?) =
                returnAddress(JsonField.ofNullable(returnAddress))

            /** The return address to be printed on the check. */
            fun returnAddress(returnAddress: Optional<ReturnAddress>) =
                returnAddress(returnAddress.getOrNull())

            /** The return address to be printed on the check. */
            fun returnAddress(returnAddress: JsonField<ReturnAddress>) = apply {
                this.returnAddress = returnAddress
            }

            /** The shipping method for the check. */
            fun shippingMethod(shippingMethod: ShippingMethod?) =
                shippingMethod(JsonField.ofNullable(shippingMethod))

            /** The shipping method for the check. */
            fun shippingMethod(shippingMethod: Optional<ShippingMethod>) =
                shippingMethod(shippingMethod.getOrNull())

            /** The shipping method for the check. */
            fun shippingMethod(shippingMethod: JsonField<ShippingMethod>) = apply {
                this.shippingMethod = shippingMethod
            }

            /**
             * The text that will appear as the signature on the check in cursive font. If blank,
             * the check will be printed with 'No signature required'.
             */
            fun signatureText(signatureText: String?) =
                signatureText(JsonField.ofNullable(signatureText))

            /**
             * The text that will appear as the signature on the check in cursive font. If blank,
             * the check will be printed with 'No signature required'.
             */
            fun signatureText(signatureText: Optional<String>) =
                signatureText(signatureText.getOrNull())

            /**
             * The text that will appear as the signature on the check in cursive font. If blank,
             * the check will be printed with 'No signature required'.
             */
            fun signatureText(signatureText: JsonField<String>) = apply {
                this.signatureText = signatureText
            }

            /** Tracking updates relating to the physical check's delivery. */
            fun trackingUpdates(trackingUpdates: List<TrackingUpdate>) =
                trackingUpdates(JsonField.of(trackingUpdates))

            /** Tracking updates relating to the physical check's delivery. */
            fun trackingUpdates(trackingUpdates: JsonField<List<TrackingUpdate>>) = apply {
                this.trackingUpdates = trackingUpdates.map { it.toMutableList() }
            }

            /** Tracking updates relating to the physical check's delivery. */
            fun addTrackingUpdate(trackingUpdate: TrackingUpdate) = apply {
                trackingUpdates =
                    (trackingUpdates ?: JsonField.of(mutableListOf())).also {
                        checkKnown("trackingUpdates", it).add(trackingUpdate)
                    }
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

            fun build(): PhysicalCheck =
                PhysicalCheck(
                    checkRequired("mailingAddress", mailingAddress),
                    checkRequired("memo", memo),
                    checkRequired("note", note),
                    checkRequired("recipientName", recipientName),
                    checkRequired("returnAddress", returnAddress),
                    checkRequired("shippingMethod", shippingMethod),
                    checkRequired("signatureText", signatureText),
                    checkRequired("trackingUpdates", trackingUpdates).map { it.toImmutable() },
                    additionalProperties.toImmutable(),
                )
        }

        /** Details for where Increase will mail the check. */
        @NoAutoDetect
        class MailingAddress
        @JsonCreator
        private constructor(
            @JsonProperty("city")
            @ExcludeMissing
            private val city: JsonField<String> = JsonMissing.of(),
            @JsonProperty("line1")
            @ExcludeMissing
            private val line1: JsonField<String> = JsonMissing.of(),
            @JsonProperty("line2")
            @ExcludeMissing
            private val line2: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name")
            @ExcludeMissing
            private val name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("postal_code")
            @ExcludeMissing
            private val postalCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("state")
            @ExcludeMissing
            private val state: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The city of the check's destination. */
            fun city(): Optional<String> = Optional.ofNullable(city.getNullable("city"))

            /** The street address of the check's destination. */
            fun line1(): Optional<String> = Optional.ofNullable(line1.getNullable("line1"))

            /** The second line of the address of the check's destination. */
            fun line2(): Optional<String> = Optional.ofNullable(line2.getNullable("line2"))

            /** The name component of the check's mailing address. */
            fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

            /** The postal code of the check's destination. */
            fun postalCode(): Optional<String> =
                Optional.ofNullable(postalCode.getNullable("postal_code"))

            /** The state of the check's destination. */
            fun state(): Optional<String> = Optional.ofNullable(state.getNullable("state"))

            /** The city of the check's destination. */
            @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

            /** The street address of the check's destination. */
            @JsonProperty("line1") @ExcludeMissing fun _line1(): JsonField<String> = line1

            /** The second line of the address of the check's destination. */
            @JsonProperty("line2") @ExcludeMissing fun _line2(): JsonField<String> = line2

            /** The name component of the check's mailing address. */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /** The postal code of the check's destination. */
            @JsonProperty("postal_code")
            @ExcludeMissing
            fun _postalCode(): JsonField<String> = postalCode

            /** The state of the check's destination. */
            @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<String> = state

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): MailingAddress = apply {
                if (validated) {
                    return@apply
                }

                city()
                line1()
                line2()
                name()
                postalCode()
                state()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [MailingAddress].
                 *
                 * The following fields are required:
                 * ```java
                 * .city()
                 * .line1()
                 * .line2()
                 * .name()
                 * .postalCode()
                 * .state()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [MailingAddress]. */
            class Builder internal constructor() {

                private var city: JsonField<String>? = null
                private var line1: JsonField<String>? = null
                private var line2: JsonField<String>? = null
                private var name: JsonField<String>? = null
                private var postalCode: JsonField<String>? = null
                private var state: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(mailingAddress: MailingAddress) = apply {
                    city = mailingAddress.city
                    line1 = mailingAddress.line1
                    line2 = mailingAddress.line2
                    name = mailingAddress.name
                    postalCode = mailingAddress.postalCode
                    state = mailingAddress.state
                    additionalProperties = mailingAddress.additionalProperties.toMutableMap()
                }

                /** The city of the check's destination. */
                fun city(city: String?) = city(JsonField.ofNullable(city))

                /** The city of the check's destination. */
                fun city(city: Optional<String>) = city(city.getOrNull())

                /** The city of the check's destination. */
                fun city(city: JsonField<String>) = apply { this.city = city }

                /** The street address of the check's destination. */
                fun line1(line1: String?) = line1(JsonField.ofNullable(line1))

                /** The street address of the check's destination. */
                fun line1(line1: Optional<String>) = line1(line1.getOrNull())

                /** The street address of the check's destination. */
                fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

                /** The second line of the address of the check's destination. */
                fun line2(line2: String?) = line2(JsonField.ofNullable(line2))

                /** The second line of the address of the check's destination. */
                fun line2(line2: Optional<String>) = line2(line2.getOrNull())

                /** The second line of the address of the check's destination. */
                fun line2(line2: JsonField<String>) = apply { this.line2 = line2 }

                /** The name component of the check's mailing address. */
                fun name(name: String?) = name(JsonField.ofNullable(name))

                /** The name component of the check's mailing address. */
                fun name(name: Optional<String>) = name(name.getOrNull())

                /** The name component of the check's mailing address. */
                fun name(name: JsonField<String>) = apply { this.name = name }

                /** The postal code of the check's destination. */
                fun postalCode(postalCode: String?) = postalCode(JsonField.ofNullable(postalCode))

                /** The postal code of the check's destination. */
                fun postalCode(postalCode: Optional<String>) = postalCode(postalCode.getOrNull())

                /** The postal code of the check's destination. */
                fun postalCode(postalCode: JsonField<String>) = apply {
                    this.postalCode = postalCode
                }

                /** The state of the check's destination. */
                fun state(state: String?) = state(JsonField.ofNullable(state))

                /** The state of the check's destination. */
                fun state(state: Optional<String>) = state(state.getOrNull())

                /** The state of the check's destination. */
                fun state(state: JsonField<String>) = apply { this.state = state }

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

                fun build(): MailingAddress =
                    MailingAddress(
                        checkRequired("city", city),
                        checkRequired("line1", line1),
                        checkRequired("line2", line2),
                        checkRequired("name", name),
                        checkRequired("postalCode", postalCode),
                        checkRequired("state", state),
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is MailingAddress && city == other.city && line1 == other.line1 && line2 == other.line2 && name == other.name && postalCode == other.postalCode && state == other.state && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(city, line1, line2, name, postalCode, state, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "MailingAddress{city=$city, line1=$line1, line2=$line2, name=$name, postalCode=$postalCode, state=$state, additionalProperties=$additionalProperties}"
        }

        /** The return address to be printed on the check. */
        @NoAutoDetect
        class ReturnAddress
        @JsonCreator
        private constructor(
            @JsonProperty("city")
            @ExcludeMissing
            private val city: JsonField<String> = JsonMissing.of(),
            @JsonProperty("line1")
            @ExcludeMissing
            private val line1: JsonField<String> = JsonMissing.of(),
            @JsonProperty("line2")
            @ExcludeMissing
            private val line2: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name")
            @ExcludeMissing
            private val name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("postal_code")
            @ExcludeMissing
            private val postalCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("state")
            @ExcludeMissing
            private val state: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The city of the check's destination. */
            fun city(): Optional<String> = Optional.ofNullable(city.getNullable("city"))

            /** The street address of the check's destination. */
            fun line1(): Optional<String> = Optional.ofNullable(line1.getNullable("line1"))

            /** The second line of the address of the check's destination. */
            fun line2(): Optional<String> = Optional.ofNullable(line2.getNullable("line2"))

            /** The name component of the check's return address. */
            fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

            /** The postal code of the check's destination. */
            fun postalCode(): Optional<String> =
                Optional.ofNullable(postalCode.getNullable("postal_code"))

            /** The state of the check's destination. */
            fun state(): Optional<String> = Optional.ofNullable(state.getNullable("state"))

            /** The city of the check's destination. */
            @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

            /** The street address of the check's destination. */
            @JsonProperty("line1") @ExcludeMissing fun _line1(): JsonField<String> = line1

            /** The second line of the address of the check's destination. */
            @JsonProperty("line2") @ExcludeMissing fun _line2(): JsonField<String> = line2

            /** The name component of the check's return address. */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /** The postal code of the check's destination. */
            @JsonProperty("postal_code")
            @ExcludeMissing
            fun _postalCode(): JsonField<String> = postalCode

            /** The state of the check's destination. */
            @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<String> = state

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): ReturnAddress = apply {
                if (validated) {
                    return@apply
                }

                city()
                line1()
                line2()
                name()
                postalCode()
                state()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [ReturnAddress].
                 *
                 * The following fields are required:
                 * ```java
                 * .city()
                 * .line1()
                 * .line2()
                 * .name()
                 * .postalCode()
                 * .state()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ReturnAddress]. */
            class Builder internal constructor() {

                private var city: JsonField<String>? = null
                private var line1: JsonField<String>? = null
                private var line2: JsonField<String>? = null
                private var name: JsonField<String>? = null
                private var postalCode: JsonField<String>? = null
                private var state: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(returnAddress: ReturnAddress) = apply {
                    city = returnAddress.city
                    line1 = returnAddress.line1
                    line2 = returnAddress.line2
                    name = returnAddress.name
                    postalCode = returnAddress.postalCode
                    state = returnAddress.state
                    additionalProperties = returnAddress.additionalProperties.toMutableMap()
                }

                /** The city of the check's destination. */
                fun city(city: String?) = city(JsonField.ofNullable(city))

                /** The city of the check's destination. */
                fun city(city: Optional<String>) = city(city.getOrNull())

                /** The city of the check's destination. */
                fun city(city: JsonField<String>) = apply { this.city = city }

                /** The street address of the check's destination. */
                fun line1(line1: String?) = line1(JsonField.ofNullable(line1))

                /** The street address of the check's destination. */
                fun line1(line1: Optional<String>) = line1(line1.getOrNull())

                /** The street address of the check's destination. */
                fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

                /** The second line of the address of the check's destination. */
                fun line2(line2: String?) = line2(JsonField.ofNullable(line2))

                /** The second line of the address of the check's destination. */
                fun line2(line2: Optional<String>) = line2(line2.getOrNull())

                /** The second line of the address of the check's destination. */
                fun line2(line2: JsonField<String>) = apply { this.line2 = line2 }

                /** The name component of the check's return address. */
                fun name(name: String?) = name(JsonField.ofNullable(name))

                /** The name component of the check's return address. */
                fun name(name: Optional<String>) = name(name.getOrNull())

                /** The name component of the check's return address. */
                fun name(name: JsonField<String>) = apply { this.name = name }

                /** The postal code of the check's destination. */
                fun postalCode(postalCode: String?) = postalCode(JsonField.ofNullable(postalCode))

                /** The postal code of the check's destination. */
                fun postalCode(postalCode: Optional<String>) = postalCode(postalCode.getOrNull())

                /** The postal code of the check's destination. */
                fun postalCode(postalCode: JsonField<String>) = apply {
                    this.postalCode = postalCode
                }

                /** The state of the check's destination. */
                fun state(state: String?) = state(JsonField.ofNullable(state))

                /** The state of the check's destination. */
                fun state(state: Optional<String>) = state(state.getOrNull())

                /** The state of the check's destination. */
                fun state(state: JsonField<String>) = apply { this.state = state }

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

                fun build(): ReturnAddress =
                    ReturnAddress(
                        checkRequired("city", city),
                        checkRequired("line1", line1),
                        checkRequired("line2", line2),
                        checkRequired("name", name),
                        checkRequired("postalCode", postalCode),
                        checkRequired("state", state),
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ReturnAddress && city == other.city && line1 == other.line1 && line2 == other.line2 && name == other.name && postalCode == other.postalCode && state == other.state && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(city, line1, line2, name, postalCode, state, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ReturnAddress{city=$city, line1=$line1, line2=$line2, name=$name, postalCode=$postalCode, state=$state, additionalProperties=$additionalProperties}"
        }

        /** The shipping method for the check. */
        class ShippingMethod
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

                /** USPS First Class */
                @JvmField val USPS_FIRST_CLASS = of("usps_first_class")

                /** FedEx Overnight */
                @JvmField val FEDEX_OVERNIGHT = of("fedex_overnight")

                @JvmStatic fun of(value: String) = ShippingMethod(JsonField.of(value))
            }

            /** An enum containing [ShippingMethod]'s known values. */
            enum class Known {
                /** USPS First Class */
                USPS_FIRST_CLASS,
                /** FedEx Overnight */
                FEDEX_OVERNIGHT,
            }

            /**
             * An enum containing [ShippingMethod]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [ShippingMethod] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                /** USPS First Class */
                USPS_FIRST_CLASS,
                /** FedEx Overnight */
                FEDEX_OVERNIGHT,
                /**
                 * An enum member indicating that [ShippingMethod] was instantiated with an unknown
                 * value.
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
                    USPS_FIRST_CLASS -> Value.USPS_FIRST_CLASS
                    FEDEX_OVERNIGHT -> Value.FEDEX_OVERNIGHT
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
                    USPS_FIRST_CLASS -> Known.USPS_FIRST_CLASS
                    FEDEX_OVERNIGHT -> Known.FEDEX_OVERNIGHT
                    else -> throw IncreaseInvalidDataException("Unknown ShippingMethod: $value")
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

                return /* spotless:off */ other is ShippingMethod && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        @NoAutoDetect
        class TrackingUpdate
        @JsonCreator
        private constructor(
            @JsonProperty("category")
            @ExcludeMissing
            private val category: JsonField<Category> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("postal_code")
            @ExcludeMissing
            private val postalCode: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The type of tracking event. */
            fun category(): Category = category.getRequired("category")

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * tracking event took place.
             */
            fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

            /** The postal code where the event took place. */
            fun postalCode(): String = postalCode.getRequired("postal_code")

            /** The type of tracking event. */
            @JsonProperty("category")
            @ExcludeMissing
            fun _category(): JsonField<Category> = category

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * tracking event took place.
             */
            @JsonProperty("created_at")
            @ExcludeMissing
            fun _createdAt(): JsonField<OffsetDateTime> = createdAt

            /** The postal code where the event took place. */
            @JsonProperty("postal_code")
            @ExcludeMissing
            fun _postalCode(): JsonField<String> = postalCode

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): TrackingUpdate = apply {
                if (validated) {
                    return@apply
                }

                category()
                createdAt()
                postalCode()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [TrackingUpdate].
                 *
                 * The following fields are required:
                 * ```java
                 * .category()
                 * .createdAt()
                 * .postalCode()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [TrackingUpdate]. */
            class Builder internal constructor() {

                private var category: JsonField<Category>? = null
                private var createdAt: JsonField<OffsetDateTime>? = null
                private var postalCode: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(trackingUpdate: TrackingUpdate) = apply {
                    category = trackingUpdate.category
                    createdAt = trackingUpdate.createdAt
                    postalCode = trackingUpdate.postalCode
                    additionalProperties = trackingUpdate.additionalProperties.toMutableMap()
                }

                /** The type of tracking event. */
                fun category(category: Category) = category(JsonField.of(category))

                /** The type of tracking event. */
                fun category(category: JsonField<Category>) = apply { this.category = category }

                /**
                 * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
                 * tracking event took place.
                 */
                fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

                /**
                 * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
                 * tracking event took place.
                 */
                fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                    this.createdAt = createdAt
                }

                /** The postal code where the event took place. */
                fun postalCode(postalCode: String) = postalCode(JsonField.of(postalCode))

                /** The postal code where the event took place. */
                fun postalCode(postalCode: JsonField<String>) = apply {
                    this.postalCode = postalCode
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

                fun build(): TrackingUpdate =
                    TrackingUpdate(
                        checkRequired("category", category),
                        checkRequired("createdAt", createdAt),
                        checkRequired("postalCode", postalCode),
                        additionalProperties.toImmutable(),
                    )
            }

            /** The type of tracking event. */
            class Category @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    /** The check is in transit. */
                    @JvmField val IN_TRANSIT = of("in_transit")

                    /** The check has been processed for delivery. */
                    @JvmField val PROCESSED_FOR_DELIVERY = of("processed_for_delivery")

                    /** The check has been delivered. */
                    @JvmField val DELIVERED = of("delivered")

                    /** Delivery failed and the check was returned to sender. */
                    @JvmField val RETURNED_TO_SENDER = of("returned_to_sender")

                    @JvmStatic fun of(value: String) = Category(JsonField.of(value))
                }

                /** An enum containing [Category]'s known values. */
                enum class Known {
                    /** The check is in transit. */
                    IN_TRANSIT,
                    /** The check has been processed for delivery. */
                    PROCESSED_FOR_DELIVERY,
                    /** The check has been delivered. */
                    DELIVERED,
                    /** Delivery failed and the check was returned to sender. */
                    RETURNED_TO_SENDER,
                }

                /**
                 * An enum containing [Category]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Category] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    /** The check is in transit. */
                    IN_TRANSIT,
                    /** The check has been processed for delivery. */
                    PROCESSED_FOR_DELIVERY,
                    /** The check has been delivered. */
                    DELIVERED,
                    /** Delivery failed and the check was returned to sender. */
                    RETURNED_TO_SENDER,
                    /**
                     * An enum member indicating that [Category] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        IN_TRANSIT -> Value.IN_TRANSIT
                        PROCESSED_FOR_DELIVERY -> Value.PROCESSED_FOR_DELIVERY
                        DELIVERED -> Value.DELIVERED
                        RETURNED_TO_SENDER -> Value.RETURNED_TO_SENDER
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws IncreaseInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        IN_TRANSIT -> Known.IN_TRANSIT
                        PROCESSED_FOR_DELIVERY -> Known.PROCESSED_FOR_DELIVERY
                        DELIVERED -> Known.DELIVERED
                        RETURNED_TO_SENDER -> Known.RETURNED_TO_SENDER
                        else -> throw IncreaseInvalidDataException("Unknown Category: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws IncreaseInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is TrackingUpdate && category == other.category && createdAt == other.createdAt && postalCode == other.postalCode && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(category, createdAt, postalCode, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "TrackingUpdate{category=$category, createdAt=$createdAt, postalCode=$postalCode, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PhysicalCheck && mailingAddress == other.mailingAddress && memo == other.memo && note == other.note && recipientName == other.recipientName && returnAddress == other.returnAddress && shippingMethod == other.shippingMethod && signatureText == other.signatureText && trackingUpdates == other.trackingUpdates && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(mailingAddress, memo, note, recipientName, returnAddress, shippingMethod, signatureText, trackingUpdates, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PhysicalCheck{mailingAddress=$mailingAddress, memo=$memo, note=$note, recipientName=$recipientName, returnAddress=$returnAddress, shippingMethod=$shippingMethod, signatureText=$signatureText, trackingUpdates=$trackingUpdates, additionalProperties=$additionalProperties}"
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

            /** The transfer is awaiting approval. */
            @JvmField val PENDING_APPROVAL = of("pending_approval")

            /** The transfer has been canceled. */
            @JvmField val CANCELED = of("canceled")

            /** The transfer is pending submission. */
            @JvmField val PENDING_SUBMISSION = of("pending_submission")

            /** The transfer requires attention from an Increase operator. */
            @JvmField val REQUIRES_ATTENTION = of("requires_attention")

            /** The transfer has been rejected. */
            @JvmField val REJECTED = of("rejected")

            /** The check is queued for mailing. */
            @JvmField val PENDING_MAILING = of("pending_mailing")

            /** The check has been mailed. */
            @JvmField val MAILED = of("mailed")

            /** The check has been deposited. */
            @JvmField val DEPOSITED = of("deposited")

            /** A stop-payment was requested for this check. */
            @JvmField val STOPPED = of("stopped")

            /** The transfer has been returned. */
            @JvmField val RETURNED = of("returned")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            /** The transfer is awaiting approval. */
            PENDING_APPROVAL,
            /** The transfer has been canceled. */
            CANCELED,
            /** The transfer is pending submission. */
            PENDING_SUBMISSION,
            /** The transfer requires attention from an Increase operator. */
            REQUIRES_ATTENTION,
            /** The transfer has been rejected. */
            REJECTED,
            /** The check is queued for mailing. */
            PENDING_MAILING,
            /** The check has been mailed. */
            MAILED,
            /** The check has been deposited. */
            DEPOSITED,
            /** A stop-payment was requested for this check. */
            STOPPED,
            /** The transfer has been returned. */
            RETURNED,
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
            /** The transfer is awaiting approval. */
            PENDING_APPROVAL,
            /** The transfer has been canceled. */
            CANCELED,
            /** The transfer is pending submission. */
            PENDING_SUBMISSION,
            /** The transfer requires attention from an Increase operator. */
            REQUIRES_ATTENTION,
            /** The transfer has been rejected. */
            REJECTED,
            /** The check is queued for mailing. */
            PENDING_MAILING,
            /** The check has been mailed. */
            MAILED,
            /** The check has been deposited. */
            DEPOSITED,
            /** A stop-payment was requested for this check. */
            STOPPED,
            /** The transfer has been returned. */
            RETURNED,
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
                PENDING_SUBMISSION -> Value.PENDING_SUBMISSION
                REQUIRES_ATTENTION -> Value.REQUIRES_ATTENTION
                REJECTED -> Value.REJECTED
                PENDING_MAILING -> Value.PENDING_MAILING
                MAILED -> Value.MAILED
                DEPOSITED -> Value.DEPOSITED
                STOPPED -> Value.STOPPED
                RETURNED -> Value.RETURNED
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
                PENDING_SUBMISSION -> Known.PENDING_SUBMISSION
                REQUIRES_ATTENTION -> Known.REQUIRES_ATTENTION
                REJECTED -> Known.REJECTED
                PENDING_MAILING -> Known.PENDING_MAILING
                MAILED -> Known.MAILED
                DEPOSITED -> Known.DEPOSITED
                STOPPED -> Known.STOPPED
                RETURNED -> Known.RETURNED
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

    /** After a stop-payment is requested on the check, this will contain supplemental details. */
    @NoAutoDetect
    class StopPaymentRequest
    @JsonCreator
    private constructor(
        @JsonProperty("reason")
        @ExcludeMissing
        private val reason: JsonField<Reason> = JsonMissing.of(),
        @JsonProperty("requested_at")
        @ExcludeMissing
        private val requestedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("transfer_id")
        @ExcludeMissing
        private val transferId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The reason why this transfer was stopped. */
        fun reason(): Reason = reason.getRequired("reason")

        /** The time the stop-payment was requested. */
        fun requestedAt(): OffsetDateTime = requestedAt.getRequired("requested_at")

        /** The ID of the check transfer that was stopped. */
        fun transferId(): String = transferId.getRequired("transfer_id")

        /**
         * A constant representing the object's type. For this resource it will always be
         * `check_transfer_stop_payment_request`.
         */
        fun type(): Type = type.getRequired("type")

        /** The reason why this transfer was stopped. */
        @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<Reason> = reason

        /** The time the stop-payment was requested. */
        @JsonProperty("requested_at")
        @ExcludeMissing
        fun _requestedAt(): JsonField<OffsetDateTime> = requestedAt

        /** The ID of the check transfer that was stopped. */
        @JsonProperty("transfer_id")
        @ExcludeMissing
        fun _transferId(): JsonField<String> = transferId

        /**
         * A constant representing the object's type. For this resource it will always be
         * `check_transfer_stop_payment_request`.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): StopPaymentRequest = apply {
            if (validated) {
                return@apply
            }

            reason()
            requestedAt()
            transferId()
            type()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [StopPaymentRequest].
             *
             * The following fields are required:
             * ```java
             * .reason()
             * .requestedAt()
             * .transferId()
             * .type()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [StopPaymentRequest]. */
        class Builder internal constructor() {

            private var reason: JsonField<Reason>? = null
            private var requestedAt: JsonField<OffsetDateTime>? = null
            private var transferId: JsonField<String>? = null
            private var type: JsonField<Type>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(stopPaymentRequest: StopPaymentRequest) = apply {
                reason = stopPaymentRequest.reason
                requestedAt = stopPaymentRequest.requestedAt
                transferId = stopPaymentRequest.transferId
                type = stopPaymentRequest.type
                additionalProperties = stopPaymentRequest.additionalProperties.toMutableMap()
            }

            /** The reason why this transfer was stopped. */
            fun reason(reason: Reason) = reason(JsonField.of(reason))

            /** The reason why this transfer was stopped. */
            fun reason(reason: JsonField<Reason>) = apply { this.reason = reason }

            /** The time the stop-payment was requested. */
            fun requestedAt(requestedAt: OffsetDateTime) = requestedAt(JsonField.of(requestedAt))

            /** The time the stop-payment was requested. */
            fun requestedAt(requestedAt: JsonField<OffsetDateTime>) = apply {
                this.requestedAt = requestedAt
            }

            /** The ID of the check transfer that was stopped. */
            fun transferId(transferId: String) = transferId(JsonField.of(transferId))

            /** The ID of the check transfer that was stopped. */
            fun transferId(transferId: JsonField<String>) = apply { this.transferId = transferId }

            /**
             * A constant representing the object's type. For this resource it will always be
             * `check_transfer_stop_payment_request`.
             */
            fun type(type: Type) = type(JsonField.of(type))

            /**
             * A constant representing the object's type. For this resource it will always be
             * `check_transfer_stop_payment_request`.
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

            fun build(): StopPaymentRequest =
                StopPaymentRequest(
                    checkRequired("reason", reason),
                    checkRequired("requestedAt", requestedAt),
                    checkRequired("transferId", transferId),
                    checkRequired("type", type),
                    additionalProperties.toImmutable(),
                )
        }

        /** The reason why this transfer was stopped. */
        class Reason @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                /** The check could not be delivered. */
                @JvmField val MAIL_DELIVERY_FAILED = of("mail_delivery_failed")

                /**
                 * The check was canceled by an Increase operator who will provide details
                 * out-of-band.
                 */
                @JvmField val REJECTED_BY_INCREASE = of("rejected_by_increase")

                /** The check was not authorized. */
                @JvmField val NOT_AUTHORIZED = of("not_authorized")

                /** The check was stopped for another reason. */
                @JvmField val UNKNOWN = of("unknown")

                @JvmStatic fun of(value: String) = Reason(JsonField.of(value))
            }

            /** An enum containing [Reason]'s known values. */
            enum class Known {
                /** The check could not be delivered. */
                MAIL_DELIVERY_FAILED,
                /**
                 * The check was canceled by an Increase operator who will provide details
                 * out-of-band.
                 */
                REJECTED_BY_INCREASE,
                /** The check was not authorized. */
                NOT_AUTHORIZED,
                /** The check was stopped for another reason. */
                UNKNOWN,
            }

            /**
             * An enum containing [Reason]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Reason] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                /** The check could not be delivered. */
                MAIL_DELIVERY_FAILED,
                /**
                 * The check was canceled by an Increase operator who will provide details
                 * out-of-band.
                 */
                REJECTED_BY_INCREASE,
                /** The check was not authorized. */
                NOT_AUTHORIZED,
                /** The check was stopped for another reason. */
                UNKNOWN,
                /**
                 * An enum member indicating that [Reason] was instantiated with an unknown value.
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
                    MAIL_DELIVERY_FAILED -> Value.MAIL_DELIVERY_FAILED
                    REJECTED_BY_INCREASE -> Value.REJECTED_BY_INCREASE
                    NOT_AUTHORIZED -> Value.NOT_AUTHORIZED
                    UNKNOWN -> Value.UNKNOWN
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
                    MAIL_DELIVERY_FAILED -> Known.MAIL_DELIVERY_FAILED
                    REJECTED_BY_INCREASE -> Known.REJECTED_BY_INCREASE
                    NOT_AUTHORIZED -> Known.NOT_AUTHORIZED
                    UNKNOWN -> Known.UNKNOWN
                    else -> throw IncreaseInvalidDataException("Unknown Reason: $value")
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

                return /* spotless:off */ other is Reason && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `check_transfer_stop_payment_request`.
         */
        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField
                val CHECK_TRANSFER_STOP_PAYMENT_REQUEST = of("check_transfer_stop_payment_request")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                CHECK_TRANSFER_STOP_PAYMENT_REQUEST
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                CHECK_TRANSFER_STOP_PAYMENT_REQUEST,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                    CHECK_TRANSFER_STOP_PAYMENT_REQUEST -> Value.CHECK_TRANSFER_STOP_PAYMENT_REQUEST
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
                    CHECK_TRANSFER_STOP_PAYMENT_REQUEST -> Known.CHECK_TRANSFER_STOP_PAYMENT_REQUEST
                    else -> throw IncreaseInvalidDataException("Unknown Type: $value")
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

                return /* spotless:off */ other is Type && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is StopPaymentRequest && reason == other.reason && requestedAt == other.requestedAt && transferId == other.transferId && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(reason, requestedAt, transferId, type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "StopPaymentRequest{reason=$reason, requestedAt=$requestedAt, transferId=$transferId, type=$type, additionalProperties=$additionalProperties}"
    }

    /** After the transfer is submitted, this will contain supplemental details. */
    @NoAutoDetect
    class Submission
    @JsonCreator
    private constructor(
        @JsonProperty("submitted_at")
        @ExcludeMissing
        private val submittedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** When this check transfer was submitted to our check printer. */
        fun submittedAt(): OffsetDateTime = submittedAt.getRequired("submitted_at")

        /** When this check transfer was submitted to our check printer. */
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

            submittedAt()
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
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Submission]. */
        class Builder internal constructor() {

            private var submittedAt: JsonField<OffsetDateTime>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(submission: Submission) = apply {
                submittedAt = submission.submittedAt
                additionalProperties = submission.additionalProperties.toMutableMap()
            }

            /** When this check transfer was submitted to our check printer. */
            fun submittedAt(submittedAt: OffsetDateTime) = submittedAt(JsonField.of(submittedAt))

            /** When this check transfer was submitted to our check printer. */
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
                    checkRequired("submittedAt", submittedAt),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Submission && submittedAt == other.submittedAt && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(submittedAt, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Submission{submittedAt=$submittedAt, additionalProperties=$additionalProperties}"
    }

    /**
     * Details relating to the custom fulfillment you will perform. Will be present if and only if
     * `fulfillment_method` is equal to `third_party`.
     */
    @NoAutoDetect
    class ThirdParty
    @JsonCreator
    private constructor(
        @JsonProperty("check_number")
        @ExcludeMissing
        private val checkNumber: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The check number that will be printed on the check. */
        fun checkNumber(): Optional<String> =
            Optional.ofNullable(checkNumber.getNullable("check_number"))

        /** The check number that will be printed on the check. */
        @JsonProperty("check_number")
        @ExcludeMissing
        fun _checkNumber(): JsonField<String> = checkNumber

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): ThirdParty = apply {
            if (validated) {
                return@apply
            }

            checkNumber()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [ThirdParty].
             *
             * The following fields are required:
             * ```java
             * .checkNumber()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ThirdParty]. */
        class Builder internal constructor() {

            private var checkNumber: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(thirdParty: ThirdParty) = apply {
                checkNumber = thirdParty.checkNumber
                additionalProperties = thirdParty.additionalProperties.toMutableMap()
            }

            /** The check number that will be printed on the check. */
            fun checkNumber(checkNumber: String?) = checkNumber(JsonField.ofNullable(checkNumber))

            /** The check number that will be printed on the check. */
            fun checkNumber(checkNumber: Optional<String>) = checkNumber(checkNumber.getOrNull())

            /** The check number that will be printed on the check. */
            fun checkNumber(checkNumber: JsonField<String>) = apply {
                this.checkNumber = checkNumber
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

            fun build(): ThirdParty =
                ThirdParty(
                    checkRequired("checkNumber", checkNumber),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ThirdParty && checkNumber == other.checkNumber && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(checkNumber, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ThirdParty{checkNumber=$checkNumber, additionalProperties=$additionalProperties}"
    }

    /**
     * A constant representing the object's type. For this resource it will always be
     * `check_transfer`.
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

            @JvmField val CHECK_TRANSFER = of("check_transfer")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            CHECK_TRANSFER
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
            CHECK_TRANSFER,
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
                CHECK_TRANSFER -> Value.CHECK_TRANSFER
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
                CHECK_TRANSFER -> Known.CHECK_TRANSFER
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

        return /* spotless:off */ other is CheckTransfer && id == other.id && accountId == other.accountId && accountNumber == other.accountNumber && amount == other.amount && approval == other.approval && approvedInboundCheckDepositId == other.approvedInboundCheckDepositId && cancellation == other.cancellation && checkNumber == other.checkNumber && createdAt == other.createdAt && createdBy == other.createdBy && currency == other.currency && fulfillmentMethod == other.fulfillmentMethod && idempotencyKey == other.idempotencyKey && mailing == other.mailing && pendingTransactionId == other.pendingTransactionId && physicalCheck == other.physicalCheck && routingNumber == other.routingNumber && sourceAccountNumberId == other.sourceAccountNumberId && status == other.status && stopPaymentRequest == other.stopPaymentRequest && submission == other.submission && thirdParty == other.thirdParty && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, accountId, accountNumber, amount, approval, approvedInboundCheckDepositId, cancellation, checkNumber, createdAt, createdBy, currency, fulfillmentMethod, idempotencyKey, mailing, pendingTransactionId, physicalCheck, routingNumber, sourceAccountNumberId, status, stopPaymentRequest, submission, thirdParty, type, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CheckTransfer{id=$id, accountId=$accountId, accountNumber=$accountNumber, amount=$amount, approval=$approval, approvedInboundCheckDepositId=$approvedInboundCheckDepositId, cancellation=$cancellation, checkNumber=$checkNumber, createdAt=$createdAt, createdBy=$createdBy, currency=$currency, fulfillmentMethod=$fulfillmentMethod, idempotencyKey=$idempotencyKey, mailing=$mailing, pendingTransactionId=$pendingTransactionId, physicalCheck=$physicalCheck, routingNumber=$routingNumber, sourceAccountNumberId=$sourceAccountNumberId, status=$status, stopPaymentRequest=$stopPaymentRequest, submission=$submission, thirdParty=$thirdParty, type=$type, additionalProperties=$additionalProperties}"
}
