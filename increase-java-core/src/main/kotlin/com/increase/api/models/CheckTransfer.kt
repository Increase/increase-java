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
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

/** Check Transfers move funds from your Increase account by mailing a physical check. */
@JsonDeserialize(builder = CheckTransfer.Builder::class)
@NoAutoDetect
class CheckTransfer
private constructor(
    private val accountId: JsonField<String>,
    private val accountNumber: JsonField<String>,
    private val amount: JsonField<Long>,
    private val approval: JsonField<Approval>,
    private val approvedInboundCheckDepositId: JsonField<String>,
    private val cancellation: JsonField<Cancellation>,
    private val checkNumber: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<CreatedBy>,
    private val currency: JsonField<Currency>,
    private val fulfillmentMethod: JsonField<FulfillmentMethod>,
    private val id: JsonField<String>,
    private val idempotencyKey: JsonField<String>,
    private val mailing: JsonField<Mailing>,
    private val pendingTransactionId: JsonField<String>,
    private val physicalCheck: JsonField<PhysicalCheck>,
    private val routingNumber: JsonField<String>,
    private val sourceAccountNumberId: JsonField<String>,
    private val status: JsonField<Status>,
    private val stopPaymentRequest: JsonField<StopPaymentRequest>,
    private val submission: JsonField<Submission>,
    private val thirdParty: JsonField<ThirdParty>,
    private val type: JsonField<Type>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

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

    /** The Check transfer's identifier. */
    fun id(): String = id.getRequired("id")

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

    /** The identifier of the Account from which funds will be transferred. */
    @JsonProperty("account_id") @ExcludeMissing fun _accountId() = accountId

    /** The account number printed on the check. */
    @JsonProperty("account_number") @ExcludeMissing fun _accountNumber() = accountNumber

    /** The transfer amount in USD cents. */
    @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

    /**
     * If your account requires approvals for transfers and the transfer was approved, this will
     * contain details of the approval.
     */
    @JsonProperty("approval") @ExcludeMissing fun _approval() = approval

    /**
     * If the Check Transfer was successfully deposited, this will contain the identifier of the
     * Inbound Check Deposit object with details of the deposit.
     */
    @JsonProperty("approved_inbound_check_deposit_id")
    @ExcludeMissing
    fun _approvedInboundCheckDepositId() = approvedInboundCheckDepositId

    /**
     * If your account requires approvals for transfers and the transfer was not approved, this will
     * contain details of the cancellation.
     */
    @JsonProperty("cancellation") @ExcludeMissing fun _cancellation() = cancellation

    /** The check number printed on the check. */
    @JsonProperty("check_number") @ExcludeMissing fun _checkNumber() = checkNumber

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the transfer
     * was created.
     */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    /** What object created the transfer, either via the API or the dashboard. */
    @JsonProperty("created_by") @ExcludeMissing fun _createdBy() = createdBy

    /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the check's currency. */
    @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

    /** Whether Increase will print and mail the check or if you will do it yourself. */
    @JsonProperty("fulfillment_method") @ExcludeMissing fun _fulfillmentMethod() = fulfillmentMethod

    /** The Check transfer's identifier. */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /**
     * The idempotency key you chose for this object. This value is unique across Increase and is
     * used to ensure that a request is only processed once. Learn more about
     * [idempotency](https://increase.com/documentation/idempotency-keys).
     */
    @JsonProperty("idempotency_key") @ExcludeMissing fun _idempotencyKey() = idempotencyKey

    /** If the check has been mailed by Increase, this will contain details of the shipment. */
    @JsonProperty("mailing") @ExcludeMissing fun _mailing() = mailing

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
     * Details relating to the physical check that Increase will print and mail. Will be present if
     * and only if `fulfillment_method` is equal to `physical_check`.
     */
    @JsonProperty("physical_check") @ExcludeMissing fun _physicalCheck() = physicalCheck

    /** The routing number printed on the check. */
    @JsonProperty("routing_number") @ExcludeMissing fun _routingNumber() = routingNumber

    /**
     * The identifier of the Account Number from which to send the transfer and print on the check.
     */
    @JsonProperty("source_account_number_id")
    @ExcludeMissing
    fun _sourceAccountNumberId() = sourceAccountNumberId

    /** The lifecycle status of the transfer. */
    @JsonProperty("status") @ExcludeMissing fun _status() = status

    /** After a stop-payment is requested on the check, this will contain supplemental details. */
    @JsonProperty("stop_payment_request")
    @ExcludeMissing
    fun _stopPaymentRequest() = stopPaymentRequest

    /** After the transfer is submitted, this will contain supplemental details. */
    @JsonProperty("submission") @ExcludeMissing fun _submission() = submission

    /**
     * Details relating to the custom fulfillment you will perform. Will be present if and only if
     * `fulfillment_method` is equal to `third_party`.
     */
    @JsonProperty("third_party") @ExcludeMissing fun _thirdParty() = thirdParty

    /**
     * A constant representing the object's type. For this resource it will always be
     * `check_transfer`.
     */
    @JsonProperty("type") @ExcludeMissing fun _type() = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): CheckTransfer = apply {
        if (!validated) {
            accountId()
            accountNumber()
            amount()
            approval().map { it.validate() }
            approvedInboundCheckDepositId()
            cancellation().map { it.validate() }
            checkNumber()
            createdAt()
            createdBy().map { it.validate() }
            currency()
            fulfillmentMethod()
            id()
            idempotencyKey()
            mailing().map { it.validate() }
            pendingTransactionId()
            physicalCheck().map { it.validate() }
            routingNumber()
            sourceAccountNumberId()
            status()
            stopPaymentRequest().map { it.validate() }
            submission().map { it.validate() }
            thirdParty().map { it.validate() }
            type()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var accountId: JsonField<String> = JsonMissing.of()
        private var accountNumber: JsonField<String> = JsonMissing.of()
        private var amount: JsonField<Long> = JsonMissing.of()
        private var approval: JsonField<Approval> = JsonMissing.of()
        private var approvedInboundCheckDepositId: JsonField<String> = JsonMissing.of()
        private var cancellation: JsonField<Cancellation> = JsonMissing.of()
        private var checkNumber: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdBy: JsonField<CreatedBy> = JsonMissing.of()
        private var currency: JsonField<Currency> = JsonMissing.of()
        private var fulfillmentMethod: JsonField<FulfillmentMethod> = JsonMissing.of()
        private var id: JsonField<String> = JsonMissing.of()
        private var idempotencyKey: JsonField<String> = JsonMissing.of()
        private var mailing: JsonField<Mailing> = JsonMissing.of()
        private var pendingTransactionId: JsonField<String> = JsonMissing.of()
        private var physicalCheck: JsonField<PhysicalCheck> = JsonMissing.of()
        private var routingNumber: JsonField<String> = JsonMissing.of()
        private var sourceAccountNumberId: JsonField<String> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var stopPaymentRequest: JsonField<StopPaymentRequest> = JsonMissing.of()
        private var submission: JsonField<Submission> = JsonMissing.of()
        private var thirdParty: JsonField<ThirdParty> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(checkTransfer: CheckTransfer) = apply {
            this.accountId = checkTransfer.accountId
            this.accountNumber = checkTransfer.accountNumber
            this.amount = checkTransfer.amount
            this.approval = checkTransfer.approval
            this.approvedInboundCheckDepositId = checkTransfer.approvedInboundCheckDepositId
            this.cancellation = checkTransfer.cancellation
            this.checkNumber = checkTransfer.checkNumber
            this.createdAt = checkTransfer.createdAt
            this.createdBy = checkTransfer.createdBy
            this.currency = checkTransfer.currency
            this.fulfillmentMethod = checkTransfer.fulfillmentMethod
            this.id = checkTransfer.id
            this.idempotencyKey = checkTransfer.idempotencyKey
            this.mailing = checkTransfer.mailing
            this.pendingTransactionId = checkTransfer.pendingTransactionId
            this.physicalCheck = checkTransfer.physicalCheck
            this.routingNumber = checkTransfer.routingNumber
            this.sourceAccountNumberId = checkTransfer.sourceAccountNumberId
            this.status = checkTransfer.status
            this.stopPaymentRequest = checkTransfer.stopPaymentRequest
            this.submission = checkTransfer.submission
            this.thirdParty = checkTransfer.thirdParty
            this.type = checkTransfer.type
            additionalProperties(checkTransfer.additionalProperties)
        }

        /** The identifier of the Account from which funds will be transferred. */
        fun accountId(accountId: String) = accountId(JsonField.of(accountId))

        /** The identifier of the Account from which funds will be transferred. */
        @JsonProperty("account_id")
        @ExcludeMissing
        fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

        /** The account number printed on the check. */
        fun accountNumber(accountNumber: String) = accountNumber(JsonField.of(accountNumber))

        /** The account number printed on the check. */
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

        /**
         * If the Check Transfer was successfully deposited, this will contain the identifier of the
         * Inbound Check Deposit object with details of the deposit.
         */
        fun approvedInboundCheckDepositId(approvedInboundCheckDepositId: String) =
            approvedInboundCheckDepositId(JsonField.of(approvedInboundCheckDepositId))

        /**
         * If the Check Transfer was successfully deposited, this will contain the identifier of the
         * Inbound Check Deposit object with details of the deposit.
         */
        @JsonProperty("approved_inbound_check_deposit_id")
        @ExcludeMissing
        fun approvedInboundCheckDepositId(approvedInboundCheckDepositId: JsonField<String>) =
            apply {
                this.approvedInboundCheckDepositId = approvedInboundCheckDepositId
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

        /** The check number printed on the check. */
        fun checkNumber(checkNumber: String) = checkNumber(JsonField.of(checkNumber))

        /** The check number printed on the check. */
        @JsonProperty("check_number")
        @ExcludeMissing
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
        @JsonProperty("created_at")
        @ExcludeMissing
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** What object created the transfer, either via the API or the dashboard. */
        fun createdBy(createdBy: CreatedBy) = createdBy(JsonField.of(createdBy))

        /** What object created the transfer, either via the API or the dashboard. */
        @JsonProperty("created_by")
        @ExcludeMissing
        fun createdBy(createdBy: JsonField<CreatedBy>) = apply { this.createdBy = createdBy }

        /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the check's currency. */
        fun currency(currency: Currency) = currency(JsonField.of(currency))

        /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the check's currency. */
        @JsonProperty("currency")
        @ExcludeMissing
        fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

        /** Whether Increase will print and mail the check or if you will do it yourself. */
        fun fulfillmentMethod(fulfillmentMethod: FulfillmentMethod) =
            fulfillmentMethod(JsonField.of(fulfillmentMethod))

        /** Whether Increase will print and mail the check or if you will do it yourself. */
        @JsonProperty("fulfillment_method")
        @ExcludeMissing
        fun fulfillmentMethod(fulfillmentMethod: JsonField<FulfillmentMethod>) = apply {
            this.fulfillmentMethod = fulfillmentMethod
        }

        /** The Check transfer's identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The Check transfer's identifier. */
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

        /** If the check has been mailed by Increase, this will contain details of the shipment. */
        fun mailing(mailing: Mailing) = mailing(JsonField.of(mailing))

        /** If the check has been mailed by Increase, this will contain details of the shipment. */
        @JsonProperty("mailing")
        @ExcludeMissing
        fun mailing(mailing: JsonField<Mailing>) = apply { this.mailing = mailing }

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
         * Details relating to the physical check that Increase will print and mail. Will be present
         * if and only if `fulfillment_method` is equal to `physical_check`.
         */
        fun physicalCheck(physicalCheck: PhysicalCheck) = physicalCheck(JsonField.of(physicalCheck))

        /**
         * Details relating to the physical check that Increase will print and mail. Will be present
         * if and only if `fulfillment_method` is equal to `physical_check`.
         */
        @JsonProperty("physical_check")
        @ExcludeMissing
        fun physicalCheck(physicalCheck: JsonField<PhysicalCheck>) = apply {
            this.physicalCheck = physicalCheck
        }

        /** The routing number printed on the check. */
        fun routingNumber(routingNumber: String) = routingNumber(JsonField.of(routingNumber))

        /** The routing number printed on the check. */
        @JsonProperty("routing_number")
        @ExcludeMissing
        fun routingNumber(routingNumber: JsonField<String>) = apply {
            this.routingNumber = routingNumber
        }

        /**
         * The identifier of the Account Number from which to send the transfer and print on the
         * check.
         */
        fun sourceAccountNumberId(sourceAccountNumberId: String) =
            sourceAccountNumberId(JsonField.of(sourceAccountNumberId))

        /**
         * The identifier of the Account Number from which to send the transfer and print on the
         * check.
         */
        @JsonProperty("source_account_number_id")
        @ExcludeMissing
        fun sourceAccountNumberId(sourceAccountNumberId: JsonField<String>) = apply {
            this.sourceAccountNumberId = sourceAccountNumberId
        }

        /** The lifecycle status of the transfer. */
        fun status(status: Status) = status(JsonField.of(status))

        /** The lifecycle status of the transfer. */
        @JsonProperty("status")
        @ExcludeMissing
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /**
         * After a stop-payment is requested on the check, this will contain supplemental details.
         */
        fun stopPaymentRequest(stopPaymentRequest: StopPaymentRequest) =
            stopPaymentRequest(JsonField.of(stopPaymentRequest))

        /**
         * After a stop-payment is requested on the check, this will contain supplemental details.
         */
        @JsonProperty("stop_payment_request")
        @ExcludeMissing
        fun stopPaymentRequest(stopPaymentRequest: JsonField<StopPaymentRequest>) = apply {
            this.stopPaymentRequest = stopPaymentRequest
        }

        /** After the transfer is submitted, this will contain supplemental details. */
        fun submission(submission: Submission) = submission(JsonField.of(submission))

        /** After the transfer is submitted, this will contain supplemental details. */
        @JsonProperty("submission")
        @ExcludeMissing
        fun submission(submission: JsonField<Submission>) = apply { this.submission = submission }

        /**
         * Details relating to the custom fulfillment you will perform. Will be present if and only
         * if `fulfillment_method` is equal to `third_party`.
         */
        fun thirdParty(thirdParty: ThirdParty) = thirdParty(JsonField.of(thirdParty))

        /**
         * Details relating to the custom fulfillment you will perform. Will be present if and only
         * if `fulfillment_method` is equal to `third_party`.
         */
        @JsonProperty("third_party")
        @ExcludeMissing
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

        fun build(): CheckTransfer =
            CheckTransfer(
                accountId,
                accountNumber,
                amount,
                approval,
                approvedInboundCheckDepositId,
                cancellation,
                checkNumber,
                createdAt,
                createdBy,
                currency,
                fulfillmentMethod,
                id,
                idempotencyKey,
                mailing,
                pendingTransactionId,
                physicalCheck,
                routingNumber,
                sourceAccountNumberId,
                status,
                stopPaymentRequest,
                submission,
                thirdParty,
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Approval && this.approvedAt == other.approvedAt && this.approvedBy == other.approvedBy && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(approvedAt, approvedBy, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "Approval{approvedAt=$approvedAt, approvedBy=$approvedBy, additionalProperties=$additionalProperties}"
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Cancellation && this.canceledAt == other.canceledAt && this.canceledBy == other.canceledBy && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(canceledAt, canceledBy, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "Cancellation{canceledAt=$canceledAt, canceledBy=$canceledBy, additionalProperties=$additionalProperties}"
    }

    /** What object created the transfer, either via the API or the dashboard. */
    @JsonDeserialize(builder = CreatedBy.Builder::class)
    @NoAutoDetect
    class CreatedBy
    private constructor(
        private val apiKey: JsonField<ApiKey>,
        private val category: JsonField<Category>,
        private val oauthApplication: JsonField<OAuthApplication>,
        private val user: JsonField<User>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

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
        @JsonProperty("api_key") @ExcludeMissing fun _apiKey() = apiKey

        /** The type of object that created this transfer. */
        @JsonProperty("category") @ExcludeMissing fun _category() = category

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
                apiKey().map { it.validate() }
                category()
                oauthApplication().map { it.validate() }
                user().map { it.validate() }
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var apiKey: JsonField<ApiKey> = JsonMissing.of()
            private var category: JsonField<Category> = JsonMissing.of()
            private var oauthApplication: JsonField<OAuthApplication> = JsonMissing.of()
            private var user: JsonField<User> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(createdBy: CreatedBy) = apply {
                this.apiKey = createdBy.apiKey
                this.category = createdBy.category
                this.oauthApplication = createdBy.oauthApplication
                this.user = createdBy.user
                additionalProperties(createdBy.additionalProperties)
            }

            /** If present, details about the API key that created the transfer. */
            fun apiKey(apiKey: ApiKey) = apiKey(JsonField.of(apiKey))

            /** If present, details about the API key that created the transfer. */
            @JsonProperty("api_key")
            @ExcludeMissing
            fun apiKey(apiKey: JsonField<ApiKey>) = apply { this.apiKey = apiKey }

            /** The type of object that created this transfer. */
            fun category(category: Category) = category(JsonField.of(category))

            /** The type of object that created this transfer. */
            @JsonProperty("category")
            @ExcludeMissing
            fun category(category: JsonField<Category>) = apply { this.category = category }

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
                    apiKey,
                    category,
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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ApiKey && this.description == other.description && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(description, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "ApiKey{description=$description, additionalProperties=$additionalProperties}"
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

                return /* spotless:off */ other is Category && this.value == other.value /* spotless:on */
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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is OAuthApplication && this.name == other.name && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(name, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "OAuthApplication{name=$name, additionalProperties=$additionalProperties}"
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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is User && this.email == other.email && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(email, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "User{email=$email, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CreatedBy && this.apiKey == other.apiKey && this.category == other.category && this.oauthApplication == other.oauthApplication && this.user == other.user && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(apiKey, category, oauthApplication, user, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "CreatedBy{apiKey=$apiKey, category=$category, oauthApplication=$oauthApplication, user=$user, additionalProperties=$additionalProperties}"
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

            return /* spotless:off */ other is Currency && this.value == other.value /* spotless:on */
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

    class FulfillmentMethod
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is FulfillmentMethod && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val PHYSICAL_CHECK = FulfillmentMethod(JsonField.of("physical_check"))

            @JvmField val THIRD_PARTY = FulfillmentMethod(JsonField.of("third_party"))

            @JvmStatic fun of(value: String) = FulfillmentMethod(JsonField.of(value))
        }

        enum class Known {
            PHYSICAL_CHECK,
            THIRD_PARTY,
        }

        enum class Value {
            PHYSICAL_CHECK,
            THIRD_PARTY,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                PHYSICAL_CHECK -> Value.PHYSICAL_CHECK
                THIRD_PARTY -> Value.THIRD_PARTY
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                PHYSICAL_CHECK -> Known.PHYSICAL_CHECK
                THIRD_PARTY -> Known.THIRD_PARTY
                else -> throw IncreaseInvalidDataException("Unknown FulfillmentMethod: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    /** If the check has been mailed by Increase, this will contain details of the shipment. */
    @JsonDeserialize(builder = Mailing.Builder::class)
    @NoAutoDetect
    class Mailing
    private constructor(
        private val imageId: JsonField<String>,
        private val mailedAt: JsonField<OffsetDateTime>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        /**
         * The ID of the file corresponding to an image of the check that was mailed, if available.
         */
        fun imageId(): Optional<String> = Optional.ofNullable(imageId.getNullable("image_id"))

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the check
         * was mailed.
         */
        fun mailedAt(): OffsetDateTime = mailedAt.getRequired("mailed_at")

        /**
         * The ID of the file corresponding to an image of the check that was mailed, if available.
         */
        @JsonProperty("image_id") @ExcludeMissing fun _imageId() = imageId

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the check
         * was mailed.
         */
        @JsonProperty("mailed_at") @ExcludeMissing fun _mailedAt() = mailedAt

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Mailing = apply {
            if (!validated) {
                imageId()
                mailedAt()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var imageId: JsonField<String> = JsonMissing.of()
            private var mailedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(mailing: Mailing) = apply {
                this.imageId = mailing.imageId
                this.mailedAt = mailing.mailedAt
                additionalProperties(mailing.additionalProperties)
            }

            /**
             * The ID of the file corresponding to an image of the check that was mailed, if
             * available.
             */
            fun imageId(imageId: String) = imageId(JsonField.of(imageId))

            /**
             * The ID of the file corresponding to an image of the check that was mailed, if
             * available.
             */
            @JsonProperty("image_id")
            @ExcludeMissing
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
            @JsonProperty("mailed_at")
            @ExcludeMissing
            fun mailedAt(mailedAt: JsonField<OffsetDateTime>) = apply { this.mailedAt = mailedAt }

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

            fun build(): Mailing =
                Mailing(
                    imageId,
                    mailedAt,
                    additionalProperties.toUnmodifiable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Mailing && this.imageId == other.imageId && this.mailedAt == other.mailedAt && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(imageId, mailedAt, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "Mailing{imageId=$imageId, mailedAt=$mailedAt, additionalProperties=$additionalProperties}"
    }

    /**
     * Details relating to the physical check that Increase will print and mail. Will be present if
     * and only if `fulfillment_method` is equal to `physical_check`.
     */
    @JsonDeserialize(builder = PhysicalCheck.Builder::class)
    @NoAutoDetect
    class PhysicalCheck
    private constructor(
        private val mailingAddress: JsonField<MailingAddress>,
        private val memo: JsonField<String>,
        private val note: JsonField<String>,
        private val recipientName: JsonField<String>,
        private val returnAddress: JsonField<ReturnAddress>,
        private val signatureText: JsonField<String>,
        private val trackingUpdates: JsonField<List<TrackingUpdate>>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

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
        @JsonProperty("mailing_address") @ExcludeMissing fun _mailingAddress() = mailingAddress

        /** The descriptor that will be printed on the memo field on the check. */
        @JsonProperty("memo") @ExcludeMissing fun _memo() = memo

        /** The descriptor that will be printed on the letter included with the check. */
        @JsonProperty("note") @ExcludeMissing fun _note() = note

        /** The name that will be printed on the check. */
        @JsonProperty("recipient_name") @ExcludeMissing fun _recipientName() = recipientName

        /** The return address to be printed on the check. */
        @JsonProperty("return_address") @ExcludeMissing fun _returnAddress() = returnAddress

        /**
         * The text that will appear as the signature on the check in cursive font. If blank, the
         * check will be printed with 'No signature required'.
         */
        @JsonProperty("signature_text") @ExcludeMissing fun _signatureText() = signatureText

        /** Tracking updates relating to the physical check's delivery. */
        @JsonProperty("tracking_updates") @ExcludeMissing fun _trackingUpdates() = trackingUpdates

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): PhysicalCheck = apply {
            if (!validated) {
                mailingAddress().validate()
                memo()
                note()
                recipientName()
                returnAddress().map { it.validate() }
                signatureText()
                trackingUpdates().forEach { it.validate() }
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var mailingAddress: JsonField<MailingAddress> = JsonMissing.of()
            private var memo: JsonField<String> = JsonMissing.of()
            private var note: JsonField<String> = JsonMissing.of()
            private var recipientName: JsonField<String> = JsonMissing.of()
            private var returnAddress: JsonField<ReturnAddress> = JsonMissing.of()
            private var signatureText: JsonField<String> = JsonMissing.of()
            private var trackingUpdates: JsonField<List<TrackingUpdate>> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(physicalCheck: PhysicalCheck) = apply {
                this.mailingAddress = physicalCheck.mailingAddress
                this.memo = physicalCheck.memo
                this.note = physicalCheck.note
                this.recipientName = physicalCheck.recipientName
                this.returnAddress = physicalCheck.returnAddress
                this.signatureText = physicalCheck.signatureText
                this.trackingUpdates = physicalCheck.trackingUpdates
                additionalProperties(physicalCheck.additionalProperties)
            }

            /** Details for where Increase will mail the check. */
            fun mailingAddress(mailingAddress: MailingAddress) =
                mailingAddress(JsonField.of(mailingAddress))

            /** Details for where Increase will mail the check. */
            @JsonProperty("mailing_address")
            @ExcludeMissing
            fun mailingAddress(mailingAddress: JsonField<MailingAddress>) = apply {
                this.mailingAddress = mailingAddress
            }

            /** The descriptor that will be printed on the memo field on the check. */
            fun memo(memo: String) = memo(JsonField.of(memo))

            /** The descriptor that will be printed on the memo field on the check. */
            @JsonProperty("memo")
            @ExcludeMissing
            fun memo(memo: JsonField<String>) = apply { this.memo = memo }

            /** The descriptor that will be printed on the letter included with the check. */
            fun note(note: String) = note(JsonField.of(note))

            /** The descriptor that will be printed on the letter included with the check. */
            @JsonProperty("note")
            @ExcludeMissing
            fun note(note: JsonField<String>) = apply { this.note = note }

            /** The name that will be printed on the check. */
            fun recipientName(recipientName: String) = recipientName(JsonField.of(recipientName))

            /** The name that will be printed on the check. */
            @JsonProperty("recipient_name")
            @ExcludeMissing
            fun recipientName(recipientName: JsonField<String>) = apply {
                this.recipientName = recipientName
            }

            /** The return address to be printed on the check. */
            fun returnAddress(returnAddress: ReturnAddress) =
                returnAddress(JsonField.of(returnAddress))

            /** The return address to be printed on the check. */
            @JsonProperty("return_address")
            @ExcludeMissing
            fun returnAddress(returnAddress: JsonField<ReturnAddress>) = apply {
                this.returnAddress = returnAddress
            }

            /**
             * The text that will appear as the signature on the check in cursive font. If blank,
             * the check will be printed with 'No signature required'.
             */
            fun signatureText(signatureText: String) = signatureText(JsonField.of(signatureText))

            /**
             * The text that will appear as the signature on the check in cursive font. If blank,
             * the check will be printed with 'No signature required'.
             */
            @JsonProperty("signature_text")
            @ExcludeMissing
            fun signatureText(signatureText: JsonField<String>) = apply {
                this.signatureText = signatureText
            }

            /** Tracking updates relating to the physical check's delivery. */
            fun trackingUpdates(trackingUpdates: List<TrackingUpdate>) =
                trackingUpdates(JsonField.of(trackingUpdates))

            /** Tracking updates relating to the physical check's delivery. */
            @JsonProperty("tracking_updates")
            @ExcludeMissing
            fun trackingUpdates(trackingUpdates: JsonField<List<TrackingUpdate>>) = apply {
                this.trackingUpdates = trackingUpdates
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

            fun build(): PhysicalCheck =
                PhysicalCheck(
                    mailingAddress,
                    memo,
                    note,
                    recipientName,
                    returnAddress,
                    signatureText,
                    trackingUpdates.map { it.toUnmodifiable() },
                    additionalProperties.toUnmodifiable(),
                )
        }

        /** Details for where Increase will mail the check. */
        @JsonDeserialize(builder = MailingAddress.Builder::class)
        @NoAutoDetect
        class MailingAddress
        private constructor(
            private val city: JsonField<String>,
            private val line1: JsonField<String>,
            private val line2: JsonField<String>,
            private val name: JsonField<String>,
            private val postalCode: JsonField<String>,
            private val state: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

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
            @JsonProperty("city") @ExcludeMissing fun _city() = city

            /** The street address of the check's destination. */
            @JsonProperty("line1") @ExcludeMissing fun _line1() = line1

            /** The second line of the address of the check's destination. */
            @JsonProperty("line2") @ExcludeMissing fun _line2() = line2

            /** The name component of the check's mailing address. */
            @JsonProperty("name") @ExcludeMissing fun _name() = name

            /** The postal code of the check's destination. */
            @JsonProperty("postal_code") @ExcludeMissing fun _postalCode() = postalCode

            /** The state of the check's destination. */
            @JsonProperty("state") @ExcludeMissing fun _state() = state

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): MailingAddress = apply {
                if (!validated) {
                    city()
                    line1()
                    line2()
                    name()
                    postalCode()
                    state()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var city: JsonField<String> = JsonMissing.of()
                private var line1: JsonField<String> = JsonMissing.of()
                private var line2: JsonField<String> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var postalCode: JsonField<String> = JsonMissing.of()
                private var state: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(mailingAddress: MailingAddress) = apply {
                    this.city = mailingAddress.city
                    this.line1 = mailingAddress.line1
                    this.line2 = mailingAddress.line2
                    this.name = mailingAddress.name
                    this.postalCode = mailingAddress.postalCode
                    this.state = mailingAddress.state
                    additionalProperties(mailingAddress.additionalProperties)
                }

                /** The city of the check's destination. */
                fun city(city: String) = city(JsonField.of(city))

                /** The city of the check's destination. */
                @JsonProperty("city")
                @ExcludeMissing
                fun city(city: JsonField<String>) = apply { this.city = city }

                /** The street address of the check's destination. */
                fun line1(line1: String) = line1(JsonField.of(line1))

                /** The street address of the check's destination. */
                @JsonProperty("line1")
                @ExcludeMissing
                fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

                /** The second line of the address of the check's destination. */
                fun line2(line2: String) = line2(JsonField.of(line2))

                /** The second line of the address of the check's destination. */
                @JsonProperty("line2")
                @ExcludeMissing
                fun line2(line2: JsonField<String>) = apply { this.line2 = line2 }

                /** The name component of the check's mailing address. */
                fun name(name: String) = name(JsonField.of(name))

                /** The name component of the check's mailing address. */
                @JsonProperty("name")
                @ExcludeMissing
                fun name(name: JsonField<String>) = apply { this.name = name }

                /** The postal code of the check's destination. */
                fun postalCode(postalCode: String) = postalCode(JsonField.of(postalCode))

                /** The postal code of the check's destination. */
                @JsonProperty("postal_code")
                @ExcludeMissing
                fun postalCode(postalCode: JsonField<String>) = apply {
                    this.postalCode = postalCode
                }

                /** The state of the check's destination. */
                fun state(state: String) = state(JsonField.of(state))

                /** The state of the check's destination. */
                @JsonProperty("state")
                @ExcludeMissing
                fun state(state: JsonField<String>) = apply { this.state = state }

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

                fun build(): MailingAddress =
                    MailingAddress(
                        city,
                        line1,
                        line2,
                        name,
                        postalCode,
                        state,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is MailingAddress && this.city == other.city && this.line1 == other.line1 && this.line2 == other.line2 && this.name == other.name && this.postalCode == other.postalCode && this.state == other.state && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(city, line1, line2, name, postalCode, state, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "MailingAddress{city=$city, line1=$line1, line2=$line2, name=$name, postalCode=$postalCode, state=$state, additionalProperties=$additionalProperties}"
        }

        /** The return address to be printed on the check. */
        @JsonDeserialize(builder = ReturnAddress.Builder::class)
        @NoAutoDetect
        class ReturnAddress
        private constructor(
            private val city: JsonField<String>,
            private val line1: JsonField<String>,
            private val line2: JsonField<String>,
            private val name: JsonField<String>,
            private val postalCode: JsonField<String>,
            private val state: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

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
            @JsonProperty("city") @ExcludeMissing fun _city() = city

            /** The street address of the check's destination. */
            @JsonProperty("line1") @ExcludeMissing fun _line1() = line1

            /** The second line of the address of the check's destination. */
            @JsonProperty("line2") @ExcludeMissing fun _line2() = line2

            /** The name component of the check's return address. */
            @JsonProperty("name") @ExcludeMissing fun _name() = name

            /** The postal code of the check's destination. */
            @JsonProperty("postal_code") @ExcludeMissing fun _postalCode() = postalCode

            /** The state of the check's destination. */
            @JsonProperty("state") @ExcludeMissing fun _state() = state

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): ReturnAddress = apply {
                if (!validated) {
                    city()
                    line1()
                    line2()
                    name()
                    postalCode()
                    state()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var city: JsonField<String> = JsonMissing.of()
                private var line1: JsonField<String> = JsonMissing.of()
                private var line2: JsonField<String> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var postalCode: JsonField<String> = JsonMissing.of()
                private var state: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(returnAddress: ReturnAddress) = apply {
                    this.city = returnAddress.city
                    this.line1 = returnAddress.line1
                    this.line2 = returnAddress.line2
                    this.name = returnAddress.name
                    this.postalCode = returnAddress.postalCode
                    this.state = returnAddress.state
                    additionalProperties(returnAddress.additionalProperties)
                }

                /** The city of the check's destination. */
                fun city(city: String) = city(JsonField.of(city))

                /** The city of the check's destination. */
                @JsonProperty("city")
                @ExcludeMissing
                fun city(city: JsonField<String>) = apply { this.city = city }

                /** The street address of the check's destination. */
                fun line1(line1: String) = line1(JsonField.of(line1))

                /** The street address of the check's destination. */
                @JsonProperty("line1")
                @ExcludeMissing
                fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

                /** The second line of the address of the check's destination. */
                fun line2(line2: String) = line2(JsonField.of(line2))

                /** The second line of the address of the check's destination. */
                @JsonProperty("line2")
                @ExcludeMissing
                fun line2(line2: JsonField<String>) = apply { this.line2 = line2 }

                /** The name component of the check's return address. */
                fun name(name: String) = name(JsonField.of(name))

                /** The name component of the check's return address. */
                @JsonProperty("name")
                @ExcludeMissing
                fun name(name: JsonField<String>) = apply { this.name = name }

                /** The postal code of the check's destination. */
                fun postalCode(postalCode: String) = postalCode(JsonField.of(postalCode))

                /** The postal code of the check's destination. */
                @JsonProperty("postal_code")
                @ExcludeMissing
                fun postalCode(postalCode: JsonField<String>) = apply {
                    this.postalCode = postalCode
                }

                /** The state of the check's destination. */
                fun state(state: String) = state(JsonField.of(state))

                /** The state of the check's destination. */
                @JsonProperty("state")
                @ExcludeMissing
                fun state(state: JsonField<String>) = apply { this.state = state }

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

                fun build(): ReturnAddress =
                    ReturnAddress(
                        city,
                        line1,
                        line2,
                        name,
                        postalCode,
                        state,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ReturnAddress && this.city == other.city && this.line1 == other.line1 && this.line2 == other.line2 && this.name == other.name && this.postalCode == other.postalCode && this.state == other.state && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(city, line1, line2, name, postalCode, state, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "ReturnAddress{city=$city, line1=$line1, line2=$line2, name=$name, postalCode=$postalCode, state=$state, additionalProperties=$additionalProperties}"
        }

        @JsonDeserialize(builder = TrackingUpdate.Builder::class)
        @NoAutoDetect
        class TrackingUpdate
        private constructor(
            private val category: JsonField<Category>,
            private val createdAt: JsonField<OffsetDateTime>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            /** The type of tracking event. */
            fun category(): Category = category.getRequired("category")

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * tracking event took place.
             */
            fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

            /** The type of tracking event. */
            @JsonProperty("category") @ExcludeMissing fun _category() = category

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * tracking event took place.
             */
            @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): TrackingUpdate = apply {
                if (!validated) {
                    category()
                    createdAt()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var category: JsonField<Category> = JsonMissing.of()
                private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(trackingUpdate: TrackingUpdate) = apply {
                    this.category = trackingUpdate.category
                    this.createdAt = trackingUpdate.createdAt
                    additionalProperties(trackingUpdate.additionalProperties)
                }

                /** The type of tracking event. */
                fun category(category: Category) = category(JsonField.of(category))

                /** The type of tracking event. */
                @JsonProperty("category")
                @ExcludeMissing
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
                @JsonProperty("created_at")
                @ExcludeMissing
                fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                    this.createdAt = createdAt
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

                fun build(): TrackingUpdate =
                    TrackingUpdate(
                        category,
                        createdAt,
                        additionalProperties.toUnmodifiable(),
                    )
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

                    return /* spotless:off */ other is Category && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    @JvmField val IN_TRANSIT = Category(JsonField.of("in_transit"))

                    @JvmField
                    val PROCESSED_FOR_DELIVERY = Category(JsonField.of("processed_for_delivery"))

                    @JvmField val DELIVERED = Category(JsonField.of("delivered"))

                    @JvmField val RETURNED_TO_SENDER = Category(JsonField.of("returned_to_sender"))

                    @JvmStatic fun of(value: String) = Category(JsonField.of(value))
                }

                enum class Known {
                    IN_TRANSIT,
                    PROCESSED_FOR_DELIVERY,
                    DELIVERED,
                    RETURNED_TO_SENDER,
                }

                enum class Value {
                    IN_TRANSIT,
                    PROCESSED_FOR_DELIVERY,
                    DELIVERED,
                    RETURNED_TO_SENDER,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        IN_TRANSIT -> Value.IN_TRANSIT
                        PROCESSED_FOR_DELIVERY -> Value.PROCESSED_FOR_DELIVERY
                        DELIVERED -> Value.DELIVERED
                        RETURNED_TO_SENDER -> Value.RETURNED_TO_SENDER
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        IN_TRANSIT -> Known.IN_TRANSIT
                        PROCESSED_FOR_DELIVERY -> Known.PROCESSED_FOR_DELIVERY
                        DELIVERED -> Known.DELIVERED
                        RETURNED_TO_SENDER -> Known.RETURNED_TO_SENDER
                        else -> throw IncreaseInvalidDataException("Unknown Category: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is TrackingUpdate && this.category == other.category && this.createdAt == other.createdAt && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(category, createdAt, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "TrackingUpdate{category=$category, createdAt=$createdAt, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PhysicalCheck && this.mailingAddress == other.mailingAddress && this.memo == other.memo && this.note == other.note && this.recipientName == other.recipientName && this.returnAddress == other.returnAddress && this.signatureText == other.signatureText && this.trackingUpdates == other.trackingUpdates && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(mailingAddress, memo, note, recipientName, returnAddress, signatureText, trackingUpdates, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "PhysicalCheck{mailingAddress=$mailingAddress, memo=$memo, note=$note, recipientName=$recipientName, returnAddress=$returnAddress, signatureText=$signatureText, trackingUpdates=$trackingUpdates, additionalProperties=$additionalProperties}"
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

            return /* spotless:off */ other is Status && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val PENDING_APPROVAL = Status(JsonField.of("pending_approval"))

            @JvmField val PENDING_SUBMISSION = Status(JsonField.of("pending_submission"))

            @JvmField val PENDING_MAILING = Status(JsonField.of("pending_mailing"))

            @JvmField val MAILED = Status(JsonField.of("mailed"))

            @JvmField val CANCELED = Status(JsonField.of("canceled"))

            @JvmField val DEPOSITED = Status(JsonField.of("deposited"))

            @JvmField val STOPPED = Status(JsonField.of("stopped"))

            @JvmField val REJECTED = Status(JsonField.of("rejected"))

            @JvmField val REQUIRES_ATTENTION = Status(JsonField.of("requires_attention"))

            @JvmField val RETURNED = Status(JsonField.of("returned"))

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            PENDING_APPROVAL,
            PENDING_SUBMISSION,
            PENDING_MAILING,
            MAILED,
            CANCELED,
            DEPOSITED,
            STOPPED,
            REJECTED,
            REQUIRES_ATTENTION,
            RETURNED,
        }

        enum class Value {
            PENDING_APPROVAL,
            PENDING_SUBMISSION,
            PENDING_MAILING,
            MAILED,
            CANCELED,
            DEPOSITED,
            STOPPED,
            REJECTED,
            REQUIRES_ATTENTION,
            RETURNED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                PENDING_APPROVAL -> Value.PENDING_APPROVAL
                PENDING_SUBMISSION -> Value.PENDING_SUBMISSION
                PENDING_MAILING -> Value.PENDING_MAILING
                MAILED -> Value.MAILED
                CANCELED -> Value.CANCELED
                DEPOSITED -> Value.DEPOSITED
                STOPPED -> Value.STOPPED
                REJECTED -> Value.REJECTED
                REQUIRES_ATTENTION -> Value.REQUIRES_ATTENTION
                RETURNED -> Value.RETURNED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                PENDING_APPROVAL -> Known.PENDING_APPROVAL
                PENDING_SUBMISSION -> Known.PENDING_SUBMISSION
                PENDING_MAILING -> Known.PENDING_MAILING
                MAILED -> Known.MAILED
                CANCELED -> Known.CANCELED
                DEPOSITED -> Known.DEPOSITED
                STOPPED -> Known.STOPPED
                REJECTED -> Known.REJECTED
                REQUIRES_ATTENTION -> Known.REQUIRES_ATTENTION
                RETURNED -> Known.RETURNED
                else -> throw IncreaseInvalidDataException("Unknown Status: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    /** After a stop-payment is requested on the check, this will contain supplemental details. */
    @JsonDeserialize(builder = StopPaymentRequest.Builder::class)
    @NoAutoDetect
    class StopPaymentRequest
    private constructor(
        private val reason: JsonField<Reason>,
        private val requestedAt: JsonField<OffsetDateTime>,
        private val transferId: JsonField<String>,
        private val type: JsonField<Type>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

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
        @JsonProperty("reason") @ExcludeMissing fun _reason() = reason

        /** The time the stop-payment was requested. */
        @JsonProperty("requested_at") @ExcludeMissing fun _requestedAt() = requestedAt

        /** The ID of the check transfer that was stopped. */
        @JsonProperty("transfer_id") @ExcludeMissing fun _transferId() = transferId

        /**
         * A constant representing the object's type. For this resource it will always be
         * `check_transfer_stop_payment_request`.
         */
        @JsonProperty("type") @ExcludeMissing fun _type() = type

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): StopPaymentRequest = apply {
            if (!validated) {
                reason()
                requestedAt()
                transferId()
                type()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var reason: JsonField<Reason> = JsonMissing.of()
            private var requestedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var transferId: JsonField<String> = JsonMissing.of()
            private var type: JsonField<Type> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(stopPaymentRequest: StopPaymentRequest) = apply {
                this.reason = stopPaymentRequest.reason
                this.requestedAt = stopPaymentRequest.requestedAt
                this.transferId = stopPaymentRequest.transferId
                this.type = stopPaymentRequest.type
                additionalProperties(stopPaymentRequest.additionalProperties)
            }

            /** The reason why this transfer was stopped. */
            fun reason(reason: Reason) = reason(JsonField.of(reason))

            /** The reason why this transfer was stopped. */
            @JsonProperty("reason")
            @ExcludeMissing
            fun reason(reason: JsonField<Reason>) = apply { this.reason = reason }

            /** The time the stop-payment was requested. */
            fun requestedAt(requestedAt: OffsetDateTime) = requestedAt(JsonField.of(requestedAt))

            /** The time the stop-payment was requested. */
            @JsonProperty("requested_at")
            @ExcludeMissing
            fun requestedAt(requestedAt: JsonField<OffsetDateTime>) = apply {
                this.requestedAt = requestedAt
            }

            /** The ID of the check transfer that was stopped. */
            fun transferId(transferId: String) = transferId(JsonField.of(transferId))

            /** The ID of the check transfer that was stopped. */
            @JsonProperty("transfer_id")
            @ExcludeMissing
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

            fun build(): StopPaymentRequest =
                StopPaymentRequest(
                    reason,
                    requestedAt,
                    transferId,
                    type,
                    additionalProperties.toUnmodifiable(),
                )
        }

        class Reason
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Reason && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val MAIL_DELIVERY_FAILED = Reason(JsonField.of("mail_delivery_failed"))

                @JvmField val REJECTED_BY_INCREASE = Reason(JsonField.of("rejected_by_increase"))

                @JvmField val NOT_AUTHORIZED = Reason(JsonField.of("not_authorized"))

                @JvmField val UNKNOWN = Reason(JsonField.of("unknown"))

                @JvmStatic fun of(value: String) = Reason(JsonField.of(value))
            }

            enum class Known {
                MAIL_DELIVERY_FAILED,
                REJECTED_BY_INCREASE,
                NOT_AUTHORIZED,
                UNKNOWN,
            }

            enum class Value {
                MAIL_DELIVERY_FAILED,
                REJECTED_BY_INCREASE,
                NOT_AUTHORIZED,
                UNKNOWN,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    MAIL_DELIVERY_FAILED -> Value.MAIL_DELIVERY_FAILED
                    REJECTED_BY_INCREASE -> Value.REJECTED_BY_INCREASE
                    NOT_AUTHORIZED -> Value.NOT_AUTHORIZED
                    UNKNOWN -> Value.UNKNOWN
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    MAIL_DELIVERY_FAILED -> Known.MAIL_DELIVERY_FAILED
                    REJECTED_BY_INCREASE -> Known.REJECTED_BY_INCREASE
                    NOT_AUTHORIZED -> Known.NOT_AUTHORIZED
                    UNKNOWN -> Known.UNKNOWN
                    else -> throw IncreaseInvalidDataException("Unknown Reason: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
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

                return /* spotless:off */ other is Type && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField
                val CHECK_TRANSFER_STOP_PAYMENT_REQUEST =
                    Type(JsonField.of("check_transfer_stop_payment_request"))

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            enum class Known {
                CHECK_TRANSFER_STOP_PAYMENT_REQUEST,
            }

            enum class Value {
                CHECK_TRANSFER_STOP_PAYMENT_REQUEST,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    CHECK_TRANSFER_STOP_PAYMENT_REQUEST -> Value.CHECK_TRANSFER_STOP_PAYMENT_REQUEST
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    CHECK_TRANSFER_STOP_PAYMENT_REQUEST -> Known.CHECK_TRANSFER_STOP_PAYMENT_REQUEST
                    else -> throw IncreaseInvalidDataException("Unknown Type: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is StopPaymentRequest && this.reason == other.reason && this.requestedAt == other.requestedAt && this.transferId == other.transferId && this.type == other.type && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(reason, requestedAt, transferId, type, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "StopPaymentRequest{reason=$reason, requestedAt=$requestedAt, transferId=$transferId, type=$type, additionalProperties=$additionalProperties}"
    }

    /** After the transfer is submitted, this will contain supplemental details. */
    @JsonDeserialize(builder = Submission.Builder::class)
    @NoAutoDetect
    class Submission
    private constructor(
        private val submittedAt: JsonField<OffsetDateTime>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        /** When this check transfer was submitted to our check printer. */
        fun submittedAt(): OffsetDateTime = submittedAt.getRequired("submitted_at")

        /** When this check transfer was submitted to our check printer. */
        @JsonProperty("submitted_at") @ExcludeMissing fun _submittedAt() = submittedAt

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Submission = apply {
            if (!validated) {
                submittedAt()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var submittedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(submission: Submission) = apply {
                this.submittedAt = submission.submittedAt
                additionalProperties(submission.additionalProperties)
            }

            /** When this check transfer was submitted to our check printer. */
            fun submittedAt(submittedAt: OffsetDateTime) = submittedAt(JsonField.of(submittedAt))

            /** When this check transfer was submitted to our check printer. */
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

            fun build(): Submission = Submission(submittedAt, additionalProperties.toUnmodifiable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Submission && this.submittedAt == other.submittedAt && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(submittedAt, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "Submission{submittedAt=$submittedAt, additionalProperties=$additionalProperties}"
    }

    /**
     * Details relating to the custom fulfillment you will perform. Will be present if and only if
     * `fulfillment_method` is equal to `third_party`.
     */
    @JsonDeserialize(builder = ThirdParty.Builder::class)
    @NoAutoDetect
    class ThirdParty
    private constructor(
        private val checkNumber: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        /** The check number that will be printed on the check. */
        fun checkNumber(): Optional<String> =
            Optional.ofNullable(checkNumber.getNullable("check_number"))

        /** The check number that will be printed on the check. */
        @JsonProperty("check_number") @ExcludeMissing fun _checkNumber() = checkNumber

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): ThirdParty = apply {
            if (!validated) {
                checkNumber()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var checkNumber: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(thirdParty: ThirdParty) = apply {
                this.checkNumber = thirdParty.checkNumber
                additionalProperties(thirdParty.additionalProperties)
            }

            /** The check number that will be printed on the check. */
            fun checkNumber(checkNumber: String) = checkNumber(JsonField.of(checkNumber))

            /** The check number that will be printed on the check. */
            @JsonProperty("check_number")
            @ExcludeMissing
            fun checkNumber(checkNumber: JsonField<String>) = apply {
                this.checkNumber = checkNumber
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

            fun build(): ThirdParty = ThirdParty(checkNumber, additionalProperties.toUnmodifiable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ThirdParty && this.checkNumber == other.checkNumber && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(checkNumber, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "ThirdParty{checkNumber=$checkNumber, additionalProperties=$additionalProperties}"
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

            return /* spotless:off */ other is Type && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val CHECK_TRANSFER = Type(JsonField.of("check_transfer"))

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            CHECK_TRANSFER,
        }

        enum class Value {
            CHECK_TRANSFER,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                CHECK_TRANSFER -> Value.CHECK_TRANSFER
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                CHECK_TRANSFER -> Known.CHECK_TRANSFER
                else -> throw IncreaseInvalidDataException("Unknown Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CheckTransfer && this.accountId == other.accountId && this.accountNumber == other.accountNumber && this.amount == other.amount && this.approval == other.approval && this.approvedInboundCheckDepositId == other.approvedInboundCheckDepositId && this.cancellation == other.cancellation && this.checkNumber == other.checkNumber && this.createdAt == other.createdAt && this.createdBy == other.createdBy && this.currency == other.currency && this.fulfillmentMethod == other.fulfillmentMethod && this.id == other.id && this.idempotencyKey == other.idempotencyKey && this.mailing == other.mailing && this.pendingTransactionId == other.pendingTransactionId && this.physicalCheck == other.physicalCheck && this.routingNumber == other.routingNumber && this.sourceAccountNumberId == other.sourceAccountNumberId && this.status == other.status && this.stopPaymentRequest == other.stopPaymentRequest && this.submission == other.submission && this.thirdParty == other.thirdParty && this.type == other.type && this.additionalProperties == other.additionalProperties /* spotless:on */
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = /* spotless:off */ Objects.hash(accountId, accountNumber, amount, approval, approvedInboundCheckDepositId, cancellation, checkNumber, createdAt, createdBy, currency, fulfillmentMethod, id, idempotencyKey, mailing, pendingTransactionId, physicalCheck, routingNumber, sourceAccountNumberId, status, stopPaymentRequest, submission, thirdParty, type, additionalProperties) /* spotless:on */
        }
        return hashCode
    }

    override fun toString() =
        "CheckTransfer{accountId=$accountId, accountNumber=$accountNumber, amount=$amount, approval=$approval, approvedInboundCheckDepositId=$approvedInboundCheckDepositId, cancellation=$cancellation, checkNumber=$checkNumber, createdAt=$createdAt, createdBy=$createdBy, currency=$currency, fulfillmentMethod=$fulfillmentMethod, id=$id, idempotencyKey=$idempotencyKey, mailing=$mailing, pendingTransactionId=$pendingTransactionId, physicalCheck=$physicalCheck, routingNumber=$routingNumber, sourceAccountNumberId=$sourceAccountNumberId, status=$status, stopPaymentRequest=$stopPaymentRequest, submission=$submission, thirdParty=$thirdParty, type=$type, additionalProperties=$additionalProperties}"
}
