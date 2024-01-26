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

/** Check Transfers move funds from your Increase account by mailing a physical check. */
@JsonDeserialize(builder = CheckTransfer.Builder::class)
@NoAutoDetect
class CheckTransfer
private constructor(
    private val accountId: JsonField<String>,
    private val sourceAccountNumberId: JsonField<String>,
    private val accountNumber: JsonField<String>,
    private val routingNumber: JsonField<String>,
    private val checkNumber: JsonField<String>,
    private val fulfillmentMethod: JsonField<FulfillmentMethod>,
    private val physicalCheck: JsonField<PhysicalCheck>,
    private val amount: JsonField<Long>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val currency: JsonField<Currency>,
    private val approval: JsonField<Approval>,
    private val cancellation: JsonField<Cancellation>,
    private val id: JsonField<String>,
    private val mailing: JsonField<Mailing>,
    private val pendingTransactionId: JsonField<String>,
    private val status: JsonField<Status>,
    private val submission: JsonField<Submission>,
    private val stopPaymentRequest: JsonField<StopPaymentRequest>,
    private val deposit: JsonField<Deposit>,
    private val uniqueIdentifier: JsonField<String>,
    private val type: JsonField<Type>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** The identifier of the Account from which funds will be transferred. */
    fun accountId(): String = accountId.getRequired("account_id")

    /**
     * The identifier of the Account Number from which to send the transfer and print on the check.
     */
    fun sourceAccountNumberId(): Optional<String> =
        Optional.ofNullable(sourceAccountNumberId.getNullable("source_account_number_id"))

    /** The account number printed on the check. */
    fun accountNumber(): String = accountNumber.getRequired("account_number")

    /** The routing number printed on the check. */
    fun routingNumber(): String = routingNumber.getRequired("routing_number")

    /** The check number printed on the check. */
    fun checkNumber(): String = checkNumber.getRequired("check_number")

    /** Whether Increase will print and mail the check or if you will do it yourself. */
    fun fulfillmentMethod(): FulfillmentMethod = fulfillmentMethod.getRequired("fulfillment_method")

    /**
     * Details relating to the physical check that Increase will print and mail. Will be present if
     * and only if `fulfillment_method` is equal to `physical_check`.
     */
    fun physicalCheck(): Optional<PhysicalCheck> =
        Optional.ofNullable(physicalCheck.getNullable("physical_check"))

    /** The transfer amount in USD cents. */
    fun amount(): Long = amount.getRequired("amount")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the transfer
     * was created.
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the check's currency. */
    fun currency(): Currency = currency.getRequired("currency")

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

    /** The Check transfer's identifier. */
    fun id(): String = id.getRequired("id")

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

    /** The lifecycle status of the transfer. */
    fun status(): Status = status.getRequired("status")

    /** After the transfer is submitted, this will contain supplemental details. */
    fun submission(): Optional<Submission> =
        Optional.ofNullable(submission.getNullable("submission"))

    /** After a stop-payment is requested on the check, this will contain supplemental details. */
    fun stopPaymentRequest(): Optional<StopPaymentRequest> =
        Optional.ofNullable(stopPaymentRequest.getNullable("stop_payment_request"))

    /** After a check transfer is deposited, this will contain supplemental details. */
    fun deposit(): Optional<Deposit> = Optional.ofNullable(deposit.getNullable("deposit"))

    /** The unique identifier you chose for this object. */
    fun uniqueIdentifier(): Optional<String> =
        Optional.ofNullable(uniqueIdentifier.getNullable("unique_identifier"))

    /**
     * A constant representing the object's type. For this resource it will always be
     * `check_transfer`.
     */
    fun type(): Type = type.getRequired("type")

    /** The identifier of the Account from which funds will be transferred. */
    @JsonProperty("account_id") @ExcludeMissing fun _accountId() = accountId

    /**
     * The identifier of the Account Number from which to send the transfer and print on the check.
     */
    @JsonProperty("source_account_number_id")
    @ExcludeMissing
    fun _sourceAccountNumberId() = sourceAccountNumberId

    /** The account number printed on the check. */
    @JsonProperty("account_number") @ExcludeMissing fun _accountNumber() = accountNumber

    /** The routing number printed on the check. */
    @JsonProperty("routing_number") @ExcludeMissing fun _routingNumber() = routingNumber

    /** The check number printed on the check. */
    @JsonProperty("check_number") @ExcludeMissing fun _checkNumber() = checkNumber

    /** Whether Increase will print and mail the check or if you will do it yourself. */
    @JsonProperty("fulfillment_method") @ExcludeMissing fun _fulfillmentMethod() = fulfillmentMethod

    /**
     * Details relating to the physical check that Increase will print and mail. Will be present if
     * and only if `fulfillment_method` is equal to `physical_check`.
     */
    @JsonProperty("physical_check") @ExcludeMissing fun _physicalCheck() = physicalCheck

    /** The transfer amount in USD cents. */
    @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the transfer
     * was created.
     */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the check's currency. */
    @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

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

    /** The Check transfer's identifier. */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

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

    /** The lifecycle status of the transfer. */
    @JsonProperty("status") @ExcludeMissing fun _status() = status

    /** After the transfer is submitted, this will contain supplemental details. */
    @JsonProperty("submission") @ExcludeMissing fun _submission() = submission

    /** After a stop-payment is requested on the check, this will contain supplemental details. */
    @JsonProperty("stop_payment_request")
    @ExcludeMissing
    fun _stopPaymentRequest() = stopPaymentRequest

    /** After a check transfer is deposited, this will contain supplemental details. */
    @JsonProperty("deposit") @ExcludeMissing fun _deposit() = deposit

    /** The unique identifier you chose for this object. */
    @JsonProperty("unique_identifier") @ExcludeMissing fun _uniqueIdentifier() = uniqueIdentifier

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
            sourceAccountNumberId()
            accountNumber()
            routingNumber()
            checkNumber()
            fulfillmentMethod()
            physicalCheck().map { it.validate() }
            amount()
            createdAt()
            currency()
            approval().map { it.validate() }
            cancellation().map { it.validate() }
            id()
            mailing().map { it.validate() }
            pendingTransactionId()
            status()
            submission().map { it.validate() }
            stopPaymentRequest().map { it.validate() }
            deposit().map { it.validate() }
            uniqueIdentifier()
            type()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CheckTransfer &&
            this.accountId == other.accountId &&
            this.sourceAccountNumberId == other.sourceAccountNumberId &&
            this.accountNumber == other.accountNumber &&
            this.routingNumber == other.routingNumber &&
            this.checkNumber == other.checkNumber &&
            this.fulfillmentMethod == other.fulfillmentMethod &&
            this.physicalCheck == other.physicalCheck &&
            this.amount == other.amount &&
            this.createdAt == other.createdAt &&
            this.currency == other.currency &&
            this.approval == other.approval &&
            this.cancellation == other.cancellation &&
            this.id == other.id &&
            this.mailing == other.mailing &&
            this.pendingTransactionId == other.pendingTransactionId &&
            this.status == other.status &&
            this.submission == other.submission &&
            this.stopPaymentRequest == other.stopPaymentRequest &&
            this.deposit == other.deposit &&
            this.uniqueIdentifier == other.uniqueIdentifier &&
            this.type == other.type &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    accountId,
                    sourceAccountNumberId,
                    accountNumber,
                    routingNumber,
                    checkNumber,
                    fulfillmentMethod,
                    physicalCheck,
                    amount,
                    createdAt,
                    currency,
                    approval,
                    cancellation,
                    id,
                    mailing,
                    pendingTransactionId,
                    status,
                    submission,
                    stopPaymentRequest,
                    deposit,
                    uniqueIdentifier,
                    type,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "CheckTransfer{accountId=$accountId, sourceAccountNumberId=$sourceAccountNumberId, accountNumber=$accountNumber, routingNumber=$routingNumber, checkNumber=$checkNumber, fulfillmentMethod=$fulfillmentMethod, physicalCheck=$physicalCheck, amount=$amount, createdAt=$createdAt, currency=$currency, approval=$approval, cancellation=$cancellation, id=$id, mailing=$mailing, pendingTransactionId=$pendingTransactionId, status=$status, submission=$submission, stopPaymentRequest=$stopPaymentRequest, deposit=$deposit, uniqueIdentifier=$uniqueIdentifier, type=$type, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var accountId: JsonField<String> = JsonMissing.of()
        private var sourceAccountNumberId: JsonField<String> = JsonMissing.of()
        private var accountNumber: JsonField<String> = JsonMissing.of()
        private var routingNumber: JsonField<String> = JsonMissing.of()
        private var checkNumber: JsonField<String> = JsonMissing.of()
        private var fulfillmentMethod: JsonField<FulfillmentMethod> = JsonMissing.of()
        private var physicalCheck: JsonField<PhysicalCheck> = JsonMissing.of()
        private var amount: JsonField<Long> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var currency: JsonField<Currency> = JsonMissing.of()
        private var approval: JsonField<Approval> = JsonMissing.of()
        private var cancellation: JsonField<Cancellation> = JsonMissing.of()
        private var id: JsonField<String> = JsonMissing.of()
        private var mailing: JsonField<Mailing> = JsonMissing.of()
        private var pendingTransactionId: JsonField<String> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var submission: JsonField<Submission> = JsonMissing.of()
        private var stopPaymentRequest: JsonField<StopPaymentRequest> = JsonMissing.of()
        private var deposit: JsonField<Deposit> = JsonMissing.of()
        private var uniqueIdentifier: JsonField<String> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(checkTransfer: CheckTransfer) = apply {
            this.accountId = checkTransfer.accountId
            this.sourceAccountNumberId = checkTransfer.sourceAccountNumberId
            this.accountNumber = checkTransfer.accountNumber
            this.routingNumber = checkTransfer.routingNumber
            this.checkNumber = checkTransfer.checkNumber
            this.fulfillmentMethod = checkTransfer.fulfillmentMethod
            this.physicalCheck = checkTransfer.physicalCheck
            this.amount = checkTransfer.amount
            this.createdAt = checkTransfer.createdAt
            this.currency = checkTransfer.currency
            this.approval = checkTransfer.approval
            this.cancellation = checkTransfer.cancellation
            this.id = checkTransfer.id
            this.mailing = checkTransfer.mailing
            this.pendingTransactionId = checkTransfer.pendingTransactionId
            this.status = checkTransfer.status
            this.submission = checkTransfer.submission
            this.stopPaymentRequest = checkTransfer.stopPaymentRequest
            this.deposit = checkTransfer.deposit
            this.uniqueIdentifier = checkTransfer.uniqueIdentifier
            this.type = checkTransfer.type
            additionalProperties(checkTransfer.additionalProperties)
        }

        /** The identifier of the Account from which funds will be transferred. */
        fun accountId(accountId: String) = accountId(JsonField.of(accountId))

        /** The identifier of the Account from which funds will be transferred. */
        @JsonProperty("account_id")
        @ExcludeMissing
        fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

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

        /** The account number printed on the check. */
        fun accountNumber(accountNumber: String) = accountNumber(JsonField.of(accountNumber))

        /** The account number printed on the check. */
        @JsonProperty("account_number")
        @ExcludeMissing
        fun accountNumber(accountNumber: JsonField<String>) = apply {
            this.accountNumber = accountNumber
        }

        /** The routing number printed on the check. */
        fun routingNumber(routingNumber: String) = routingNumber(JsonField.of(routingNumber))

        /** The routing number printed on the check. */
        @JsonProperty("routing_number")
        @ExcludeMissing
        fun routingNumber(routingNumber: JsonField<String>) = apply {
            this.routingNumber = routingNumber
        }

        /** The check number printed on the check. */
        fun checkNumber(checkNumber: String) = checkNumber(JsonField.of(checkNumber))

        /** The check number printed on the check. */
        @JsonProperty("check_number")
        @ExcludeMissing
        fun checkNumber(checkNumber: JsonField<String>) = apply { this.checkNumber = checkNumber }

        /** Whether Increase will print and mail the check or if you will do it yourself. */
        fun fulfillmentMethod(fulfillmentMethod: FulfillmentMethod) =
            fulfillmentMethod(JsonField.of(fulfillmentMethod))

        /** Whether Increase will print and mail the check or if you will do it yourself. */
        @JsonProperty("fulfillment_method")
        @ExcludeMissing
        fun fulfillmentMethod(fulfillmentMethod: JsonField<FulfillmentMethod>) = apply {
            this.fulfillmentMethod = fulfillmentMethod
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

        /** The transfer amount in USD cents. */
        fun amount(amount: Long) = amount(JsonField.of(amount))

        /** The transfer amount in USD cents. */
        @JsonProperty("amount")
        @ExcludeMissing
        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

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

        /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the check's currency. */
        fun currency(currency: Currency) = currency(JsonField.of(currency))

        /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the check's currency. */
        @JsonProperty("currency")
        @ExcludeMissing
        fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

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

        /** The Check transfer's identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The Check transfer's identifier. */
        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

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

        /** The lifecycle status of the transfer. */
        fun status(status: Status) = status(JsonField.of(status))

        /** The lifecycle status of the transfer. */
        @JsonProperty("status")
        @ExcludeMissing
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** After the transfer is submitted, this will contain supplemental details. */
        fun submission(submission: Submission) = submission(JsonField.of(submission))

        /** After the transfer is submitted, this will contain supplemental details. */
        @JsonProperty("submission")
        @ExcludeMissing
        fun submission(submission: JsonField<Submission>) = apply { this.submission = submission }

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

        /** After a check transfer is deposited, this will contain supplemental details. */
        fun deposit(deposit: Deposit) = deposit(JsonField.of(deposit))

        /** After a check transfer is deposited, this will contain supplemental details. */
        @JsonProperty("deposit")
        @ExcludeMissing
        fun deposit(deposit: JsonField<Deposit>) = apply { this.deposit = deposit }

        /** The unique identifier you chose for this object. */
        fun uniqueIdentifier(uniqueIdentifier: String) =
            uniqueIdentifier(JsonField.of(uniqueIdentifier))

        /** The unique identifier you chose for this object. */
        @JsonProperty("unique_identifier")
        @ExcludeMissing
        fun uniqueIdentifier(uniqueIdentifier: JsonField<String>) = apply {
            this.uniqueIdentifier = uniqueIdentifier
        }

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
                sourceAccountNumberId,
                accountNumber,
                routingNumber,
                checkNumber,
                fulfillmentMethod,
                physicalCheck,
                amount,
                createdAt,
                currency,
                approval,
                cancellation,
                id,
                mailing,
                pendingTransactionId,
                status,
                submission,
                stopPaymentRequest,
                deposit,
                uniqueIdentifier,
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

    /** After a check transfer is deposited, this will contain supplemental details. */
    @JsonDeserialize(builder = Deposit.Builder::class)
    @NoAutoDetect
    class Deposit
    private constructor(
        private val depositedAt: JsonField<OffsetDateTime>,
        private val transactionId: JsonField<String>,
        private val frontImageFileId: JsonField<String>,
        private val backImageFileId: JsonField<String>,
        private val bankOfFirstDepositRoutingNumber: JsonField<String>,
        private val transferId: JsonField<String>,
        private val type: JsonField<Type>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /** When the check was deposited. */
        fun depositedAt(): OffsetDateTime = depositedAt.getRequired("deposited_at")

        /** The identifier of the Transaction object created when the check was deposited. */
        fun transactionId(): Optional<String> =
            Optional.ofNullable(transactionId.getNullable("transaction_id"))

        /**
         * The identifier of the API File object containing an image of the front of the deposited
         * check.
         */
        fun frontImageFileId(): Optional<String> =
            Optional.ofNullable(frontImageFileId.getNullable("front_image_file_id"))

        /**
         * The identifier of the API File object containing an image of the back of the deposited
         * check.
         */
        fun backImageFileId(): Optional<String> =
            Optional.ofNullable(backImageFileId.getNullable("back_image_file_id"))

        /**
         * The American Bankers' Association (ABA) Routing Transit Number (RTN) for the bank
         * depositing this check. In some rare cases, this is not transmitted via Check21 and the
         * value will be null.
         */
        fun bankOfFirstDepositRoutingNumber(): Optional<String> =
            Optional.ofNullable(
                bankOfFirstDepositRoutingNumber.getNullable("bank_of_first_deposit_routing_number")
            )

        /** The identifier of the Check Transfer object that was deposited. */
        fun transferId(): String = transferId.getRequired("transfer_id")

        /**
         * A constant representing the object's type. For this resource it will always be
         * `check_transfer_deposit`.
         */
        fun type(): Type = type.getRequired("type")

        /** When the check was deposited. */
        @JsonProperty("deposited_at") @ExcludeMissing fun _depositedAt() = depositedAt

        /** The identifier of the Transaction object created when the check was deposited. */
        @JsonProperty("transaction_id") @ExcludeMissing fun _transactionId() = transactionId

        /**
         * The identifier of the API File object containing an image of the front of the deposited
         * check.
         */
        @JsonProperty("front_image_file_id")
        @ExcludeMissing
        fun _frontImageFileId() = frontImageFileId

        /**
         * The identifier of the API File object containing an image of the back of the deposited
         * check.
         */
        @JsonProperty("back_image_file_id") @ExcludeMissing fun _backImageFileId() = backImageFileId

        /**
         * The American Bankers' Association (ABA) Routing Transit Number (RTN) for the bank
         * depositing this check. In some rare cases, this is not transmitted via Check21 and the
         * value will be null.
         */
        @JsonProperty("bank_of_first_deposit_routing_number")
        @ExcludeMissing
        fun _bankOfFirstDepositRoutingNumber() = bankOfFirstDepositRoutingNumber

        /** The identifier of the Check Transfer object that was deposited. */
        @JsonProperty("transfer_id") @ExcludeMissing fun _transferId() = transferId

        /**
         * A constant representing the object's type. For this resource it will always be
         * `check_transfer_deposit`.
         */
        @JsonProperty("type") @ExcludeMissing fun _type() = type

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Deposit = apply {
            if (!validated) {
                depositedAt()
                transactionId()
                frontImageFileId()
                backImageFileId()
                bankOfFirstDepositRoutingNumber()
                transferId()
                type()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Deposit &&
                this.depositedAt == other.depositedAt &&
                this.transactionId == other.transactionId &&
                this.frontImageFileId == other.frontImageFileId &&
                this.backImageFileId == other.backImageFileId &&
                this.bankOfFirstDepositRoutingNumber == other.bankOfFirstDepositRoutingNumber &&
                this.transferId == other.transferId &&
                this.type == other.type &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        depositedAt,
                        transactionId,
                        frontImageFileId,
                        backImageFileId,
                        bankOfFirstDepositRoutingNumber,
                        transferId,
                        type,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Deposit{depositedAt=$depositedAt, transactionId=$transactionId, frontImageFileId=$frontImageFileId, backImageFileId=$backImageFileId, bankOfFirstDepositRoutingNumber=$bankOfFirstDepositRoutingNumber, transferId=$transferId, type=$type, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var depositedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var transactionId: JsonField<String> = JsonMissing.of()
            private var frontImageFileId: JsonField<String> = JsonMissing.of()
            private var backImageFileId: JsonField<String> = JsonMissing.of()
            private var bankOfFirstDepositRoutingNumber: JsonField<String> = JsonMissing.of()
            private var transferId: JsonField<String> = JsonMissing.of()
            private var type: JsonField<Type> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(deposit: Deposit) = apply {
                this.depositedAt = deposit.depositedAt
                this.transactionId = deposit.transactionId
                this.frontImageFileId = deposit.frontImageFileId
                this.backImageFileId = deposit.backImageFileId
                this.bankOfFirstDepositRoutingNumber = deposit.bankOfFirstDepositRoutingNumber
                this.transferId = deposit.transferId
                this.type = deposit.type
                additionalProperties(deposit.additionalProperties)
            }

            /** When the check was deposited. */
            fun depositedAt(depositedAt: OffsetDateTime) = depositedAt(JsonField.of(depositedAt))

            /** When the check was deposited. */
            @JsonProperty("deposited_at")
            @ExcludeMissing
            fun depositedAt(depositedAt: JsonField<OffsetDateTime>) = apply {
                this.depositedAt = depositedAt
            }

            /** The identifier of the Transaction object created when the check was deposited. */
            fun transactionId(transactionId: String) = transactionId(JsonField.of(transactionId))

            /** The identifier of the Transaction object created when the check was deposited. */
            @JsonProperty("transaction_id")
            @ExcludeMissing
            fun transactionId(transactionId: JsonField<String>) = apply {
                this.transactionId = transactionId
            }

            /**
             * The identifier of the API File object containing an image of the front of the
             * deposited check.
             */
            fun frontImageFileId(frontImageFileId: String) =
                frontImageFileId(JsonField.of(frontImageFileId))

            /**
             * The identifier of the API File object containing an image of the front of the
             * deposited check.
             */
            @JsonProperty("front_image_file_id")
            @ExcludeMissing
            fun frontImageFileId(frontImageFileId: JsonField<String>) = apply {
                this.frontImageFileId = frontImageFileId
            }

            /**
             * The identifier of the API File object containing an image of the back of the
             * deposited check.
             */
            fun backImageFileId(backImageFileId: String) =
                backImageFileId(JsonField.of(backImageFileId))

            /**
             * The identifier of the API File object containing an image of the back of the
             * deposited check.
             */
            @JsonProperty("back_image_file_id")
            @ExcludeMissing
            fun backImageFileId(backImageFileId: JsonField<String>) = apply {
                this.backImageFileId = backImageFileId
            }

            /**
             * The American Bankers' Association (ABA) Routing Transit Number (RTN) for the bank
             * depositing this check. In some rare cases, this is not transmitted via Check21 and
             * the value will be null.
             */
            fun bankOfFirstDepositRoutingNumber(bankOfFirstDepositRoutingNumber: String) =
                bankOfFirstDepositRoutingNumber(JsonField.of(bankOfFirstDepositRoutingNumber))

            /**
             * The American Bankers' Association (ABA) Routing Transit Number (RTN) for the bank
             * depositing this check. In some rare cases, this is not transmitted via Check21 and
             * the value will be null.
             */
            @JsonProperty("bank_of_first_deposit_routing_number")
            @ExcludeMissing
            fun bankOfFirstDepositRoutingNumber(
                bankOfFirstDepositRoutingNumber: JsonField<String>
            ) = apply { this.bankOfFirstDepositRoutingNumber = bankOfFirstDepositRoutingNumber }

            /** The identifier of the Check Transfer object that was deposited. */
            fun transferId(transferId: String) = transferId(JsonField.of(transferId))

            /** The identifier of the Check Transfer object that was deposited. */
            @JsonProperty("transfer_id")
            @ExcludeMissing
            fun transferId(transferId: JsonField<String>) = apply { this.transferId = transferId }

            /**
             * A constant representing the object's type. For this resource it will always be
             * `check_transfer_deposit`.
             */
            fun type(type: Type) = type(JsonField.of(type))

            /**
             * A constant representing the object's type. For this resource it will always be
             * `check_transfer_deposit`.
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

            fun build(): Deposit =
                Deposit(
                    depositedAt,
                    transactionId,
                    frontImageFileId,
                    backImageFileId,
                    bankOfFirstDepositRoutingNumber,
                    transferId,
                    type,
                    additionalProperties.toUnmodifiable(),
                )
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

                @JvmField val CHECK_TRANSFER_DEPOSIT = Type(JsonField.of("check_transfer_deposit"))

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            enum class Known {
                CHECK_TRANSFER_DEPOSIT,
            }

            enum class Value {
                CHECK_TRANSFER_DEPOSIT,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    CHECK_TRANSFER_DEPOSIT -> Value.CHECK_TRANSFER_DEPOSIT
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    CHECK_TRANSFER_DEPOSIT -> Known.CHECK_TRANSFER_DEPOSIT
                    else -> throw IncreaseInvalidDataException("Unknown Type: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }
    }

    class FulfillmentMethod
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is FulfillmentMethod && this.value == other.value
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
        private val mailedAt: JsonField<OffsetDateTime>,
        private val imageId: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the check
         * was mailed.
         */
        fun mailedAt(): OffsetDateTime = mailedAt.getRequired("mailed_at")

        /**
         * The ID of the file corresponding to an image of the check that was mailed, if available.
         */
        fun imageId(): Optional<String> = Optional.ofNullable(imageId.getNullable("image_id"))

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the check
         * was mailed.
         */
        @JsonProperty("mailed_at") @ExcludeMissing fun _mailedAt() = mailedAt

        /**
         * The ID of the file corresponding to an image of the check that was mailed, if available.
         */
        @JsonProperty("image_id") @ExcludeMissing fun _imageId() = imageId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Mailing = apply {
            if (!validated) {
                mailedAt()
                imageId()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Mailing &&
                this.mailedAt == other.mailedAt &&
                this.imageId == other.imageId &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        mailedAt,
                        imageId,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Mailing{mailedAt=$mailedAt, imageId=$imageId, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var mailedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var imageId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(mailing: Mailing) = apply {
                this.mailedAt = mailing.mailedAt
                this.imageId = mailing.imageId
                additionalProperties(mailing.additionalProperties)
            }

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
                    mailedAt,
                    imageId,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    /**
     * Details relating to the physical check that Increase will print and mail. Will be present if
     * and only if `fulfillment_method` is equal to `physical_check`.
     */
    @JsonDeserialize(builder = PhysicalCheck.Builder::class)
    @NoAutoDetect
    class PhysicalCheck
    private constructor(
        private val memo: JsonField<String>,
        private val note: JsonField<String>,
        private val recipientName: JsonField<String>,
        private val mailingAddress: JsonField<MailingAddress>,
        private val returnAddress: JsonField<ReturnAddress>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /** The descriptor that will be printed on the memo field on the check. */
        fun memo(): Optional<String> = Optional.ofNullable(memo.getNullable("memo"))

        /** The descriptor that will be printed on the letter included with the check. */
        fun note(): Optional<String> = Optional.ofNullable(note.getNullable("note"))

        /** The name that will be printed on the check. */
        fun recipientName(): String = recipientName.getRequired("recipient_name")

        /** Details for where Increase will mail the check. */
        fun mailingAddress(): MailingAddress = mailingAddress.getRequired("mailing_address")

        /** The return address to be printed on the check. */
        fun returnAddress(): Optional<ReturnAddress> =
            Optional.ofNullable(returnAddress.getNullable("return_address"))

        /** The descriptor that will be printed on the memo field on the check. */
        @JsonProperty("memo") @ExcludeMissing fun _memo() = memo

        /** The descriptor that will be printed on the letter included with the check. */
        @JsonProperty("note") @ExcludeMissing fun _note() = note

        /** The name that will be printed on the check. */
        @JsonProperty("recipient_name") @ExcludeMissing fun _recipientName() = recipientName

        /** Details for where Increase will mail the check. */
        @JsonProperty("mailing_address") @ExcludeMissing fun _mailingAddress() = mailingAddress

        /** The return address to be printed on the check. */
        @JsonProperty("return_address") @ExcludeMissing fun _returnAddress() = returnAddress

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): PhysicalCheck = apply {
            if (!validated) {
                memo()
                note()
                recipientName()
                mailingAddress().validate()
                returnAddress().map { it.validate() }
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PhysicalCheck &&
                this.memo == other.memo &&
                this.note == other.note &&
                this.recipientName == other.recipientName &&
                this.mailingAddress == other.mailingAddress &&
                this.returnAddress == other.returnAddress &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        memo,
                        note,
                        recipientName,
                        mailingAddress,
                        returnAddress,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "PhysicalCheck{memo=$memo, note=$note, recipientName=$recipientName, mailingAddress=$mailingAddress, returnAddress=$returnAddress, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var memo: JsonField<String> = JsonMissing.of()
            private var note: JsonField<String> = JsonMissing.of()
            private var recipientName: JsonField<String> = JsonMissing.of()
            private var mailingAddress: JsonField<MailingAddress> = JsonMissing.of()
            private var returnAddress: JsonField<ReturnAddress> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(physicalCheck: PhysicalCheck) = apply {
                this.memo = physicalCheck.memo
                this.note = physicalCheck.note
                this.recipientName = physicalCheck.recipientName
                this.mailingAddress = physicalCheck.mailingAddress
                this.returnAddress = physicalCheck.returnAddress
                additionalProperties(physicalCheck.additionalProperties)
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

            /** Details for where Increase will mail the check. */
            fun mailingAddress(mailingAddress: MailingAddress) =
                mailingAddress(JsonField.of(mailingAddress))

            /** Details for where Increase will mail the check. */
            @JsonProperty("mailing_address")
            @ExcludeMissing
            fun mailingAddress(mailingAddress: JsonField<MailingAddress>) = apply {
                this.mailingAddress = mailingAddress
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
                    memo,
                    note,
                    recipientName,
                    mailingAddress,
                    returnAddress,
                    additionalProperties.toUnmodifiable(),
                )
        }

        /** Details for where Increase will mail the check. */
        @JsonDeserialize(builder = MailingAddress.Builder::class)
        @NoAutoDetect
        class MailingAddress
        private constructor(
            private val name: JsonField<String>,
            private val line1: JsonField<String>,
            private val line2: JsonField<String>,
            private val city: JsonField<String>,
            private val state: JsonField<String>,
            private val postalCode: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** The name component of the check's mailing address. */
            fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

            /** The street address of the check's destination. */
            fun line1(): Optional<String> = Optional.ofNullable(line1.getNullable("line1"))

            /** The second line of the address of the check's destination. */
            fun line2(): Optional<String> = Optional.ofNullable(line2.getNullable("line2"))

            /** The city of the check's destination. */
            fun city(): Optional<String> = Optional.ofNullable(city.getNullable("city"))

            /** The state of the check's destination. */
            fun state(): Optional<String> = Optional.ofNullable(state.getNullable("state"))

            /** The postal code of the check's destination. */
            fun postalCode(): Optional<String> =
                Optional.ofNullable(postalCode.getNullable("postal_code"))

            /** The name component of the check's mailing address. */
            @JsonProperty("name") @ExcludeMissing fun _name() = name

            /** The street address of the check's destination. */
            @JsonProperty("line1") @ExcludeMissing fun _line1() = line1

            /** The second line of the address of the check's destination. */
            @JsonProperty("line2") @ExcludeMissing fun _line2() = line2

            /** The city of the check's destination. */
            @JsonProperty("city") @ExcludeMissing fun _city() = city

            /** The state of the check's destination. */
            @JsonProperty("state") @ExcludeMissing fun _state() = state

            /** The postal code of the check's destination. */
            @JsonProperty("postal_code") @ExcludeMissing fun _postalCode() = postalCode

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): MailingAddress = apply {
                if (!validated) {
                    name()
                    line1()
                    line2()
                    city()
                    state()
                    postalCode()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is MailingAddress &&
                    this.name == other.name &&
                    this.line1 == other.line1 &&
                    this.line2 == other.line2 &&
                    this.city == other.city &&
                    this.state == other.state &&
                    this.postalCode == other.postalCode &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            name,
                            line1,
                            line2,
                            city,
                            state,
                            postalCode,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "MailingAddress{name=$name, line1=$line1, line2=$line2, city=$city, state=$state, postalCode=$postalCode, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var name: JsonField<String> = JsonMissing.of()
                private var line1: JsonField<String> = JsonMissing.of()
                private var line2: JsonField<String> = JsonMissing.of()
                private var city: JsonField<String> = JsonMissing.of()
                private var state: JsonField<String> = JsonMissing.of()
                private var postalCode: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(mailingAddress: MailingAddress) = apply {
                    this.name = mailingAddress.name
                    this.line1 = mailingAddress.line1
                    this.line2 = mailingAddress.line2
                    this.city = mailingAddress.city
                    this.state = mailingAddress.state
                    this.postalCode = mailingAddress.postalCode
                    additionalProperties(mailingAddress.additionalProperties)
                }

                /** The name component of the check's mailing address. */
                fun name(name: String) = name(JsonField.of(name))

                /** The name component of the check's mailing address. */
                @JsonProperty("name")
                @ExcludeMissing
                fun name(name: JsonField<String>) = apply { this.name = name }

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

                /** The city of the check's destination. */
                fun city(city: String) = city(JsonField.of(city))

                /** The city of the check's destination. */
                @JsonProperty("city")
                @ExcludeMissing
                fun city(city: JsonField<String>) = apply { this.city = city }

                /** The state of the check's destination. */
                fun state(state: String) = state(JsonField.of(state))

                /** The state of the check's destination. */
                @JsonProperty("state")
                @ExcludeMissing
                fun state(state: JsonField<String>) = apply { this.state = state }

                /** The postal code of the check's destination. */
                fun postalCode(postalCode: String) = postalCode(JsonField.of(postalCode))

                /** The postal code of the check's destination. */
                @JsonProperty("postal_code")
                @ExcludeMissing
                fun postalCode(postalCode: JsonField<String>) = apply {
                    this.postalCode = postalCode
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

                fun build(): MailingAddress =
                    MailingAddress(
                        name,
                        line1,
                        line2,
                        city,
                        state,
                        postalCode,
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        /** The return address to be printed on the check. */
        @JsonDeserialize(builder = ReturnAddress.Builder::class)
        @NoAutoDetect
        class ReturnAddress
        private constructor(
            private val name: JsonField<String>,
            private val line1: JsonField<String>,
            private val line2: JsonField<String>,
            private val city: JsonField<String>,
            private val state: JsonField<String>,
            private val postalCode: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** The name component of the check's return address. */
            fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

            /** The street address of the check's destination. */
            fun line1(): Optional<String> = Optional.ofNullable(line1.getNullable("line1"))

            /** The second line of the address of the check's destination. */
            fun line2(): Optional<String> = Optional.ofNullable(line2.getNullable("line2"))

            /** The city of the check's destination. */
            fun city(): Optional<String> = Optional.ofNullable(city.getNullable("city"))

            /** The state of the check's destination. */
            fun state(): Optional<String> = Optional.ofNullable(state.getNullable("state"))

            /** The postal code of the check's destination. */
            fun postalCode(): Optional<String> =
                Optional.ofNullable(postalCode.getNullable("postal_code"))

            /** The name component of the check's return address. */
            @JsonProperty("name") @ExcludeMissing fun _name() = name

            /** The street address of the check's destination. */
            @JsonProperty("line1") @ExcludeMissing fun _line1() = line1

            /** The second line of the address of the check's destination. */
            @JsonProperty("line2") @ExcludeMissing fun _line2() = line2

            /** The city of the check's destination. */
            @JsonProperty("city") @ExcludeMissing fun _city() = city

            /** The state of the check's destination. */
            @JsonProperty("state") @ExcludeMissing fun _state() = state

            /** The postal code of the check's destination. */
            @JsonProperty("postal_code") @ExcludeMissing fun _postalCode() = postalCode

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): ReturnAddress = apply {
                if (!validated) {
                    name()
                    line1()
                    line2()
                    city()
                    state()
                    postalCode()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ReturnAddress &&
                    this.name == other.name &&
                    this.line1 == other.line1 &&
                    this.line2 == other.line2 &&
                    this.city == other.city &&
                    this.state == other.state &&
                    this.postalCode == other.postalCode &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            name,
                            line1,
                            line2,
                            city,
                            state,
                            postalCode,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "ReturnAddress{name=$name, line1=$line1, line2=$line2, city=$city, state=$state, postalCode=$postalCode, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var name: JsonField<String> = JsonMissing.of()
                private var line1: JsonField<String> = JsonMissing.of()
                private var line2: JsonField<String> = JsonMissing.of()
                private var city: JsonField<String> = JsonMissing.of()
                private var state: JsonField<String> = JsonMissing.of()
                private var postalCode: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(returnAddress: ReturnAddress) = apply {
                    this.name = returnAddress.name
                    this.line1 = returnAddress.line1
                    this.line2 = returnAddress.line2
                    this.city = returnAddress.city
                    this.state = returnAddress.state
                    this.postalCode = returnAddress.postalCode
                    additionalProperties(returnAddress.additionalProperties)
                }

                /** The name component of the check's return address. */
                fun name(name: String) = name(JsonField.of(name))

                /** The name component of the check's return address. */
                @JsonProperty("name")
                @ExcludeMissing
                fun name(name: JsonField<String>) = apply { this.name = name }

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

                /** The city of the check's destination. */
                fun city(city: String) = city(JsonField.of(city))

                /** The city of the check's destination. */
                @JsonProperty("city")
                @ExcludeMissing
                fun city(city: JsonField<String>) = apply { this.city = city }

                /** The state of the check's destination. */
                fun state(state: String) = state(JsonField.of(state))

                /** The state of the check's destination. */
                @JsonProperty("state")
                @ExcludeMissing
                fun state(state: JsonField<String>) = apply { this.state = state }

                /** The postal code of the check's destination. */
                fun postalCode(postalCode: String) = postalCode(JsonField.of(postalCode))

                /** The postal code of the check's destination. */
                @JsonProperty("postal_code")
                @ExcludeMissing
                fun postalCode(postalCode: JsonField<String>) = apply {
                    this.postalCode = postalCode
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

                fun build(): ReturnAddress =
                    ReturnAddress(
                        name,
                        line1,
                        line2,
                        city,
                        state,
                        postalCode,
                        additionalProperties.toUnmodifiable(),
                    )
            }
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

            @JvmField val PENDING_SUBMISSION = Status(JsonField.of("pending_submission"))

            @JvmField val SUBMITTED = Status(JsonField.of("submitted"))

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
            SUBMITTED,
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
            SUBMITTED,
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
                SUBMITTED -> Value.SUBMITTED
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
                SUBMITTED -> Known.SUBMITTED
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
        private val transferId: JsonField<String>,
        private val reason: JsonField<Reason>,
        private val requestedAt: JsonField<OffsetDateTime>,
        private val type: JsonField<Type>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /** The ID of the check transfer that was stopped. */
        fun transferId(): String = transferId.getRequired("transfer_id")

        /** The reason why this transfer was stopped. */
        fun reason(): Reason = reason.getRequired("reason")

        /** The time the stop-payment was requested. */
        fun requestedAt(): OffsetDateTime = requestedAt.getRequired("requested_at")

        /**
         * A constant representing the object's type. For this resource it will always be
         * `check_transfer_stop_payment_request`.
         */
        fun type(): Type = type.getRequired("type")

        /** The ID of the check transfer that was stopped. */
        @JsonProperty("transfer_id") @ExcludeMissing fun _transferId() = transferId

        /** The reason why this transfer was stopped. */
        @JsonProperty("reason") @ExcludeMissing fun _reason() = reason

        /** The time the stop-payment was requested. */
        @JsonProperty("requested_at") @ExcludeMissing fun _requestedAt() = requestedAt

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
                transferId()
                reason()
                requestedAt()
                type()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is StopPaymentRequest &&
                this.transferId == other.transferId &&
                this.reason == other.reason &&
                this.requestedAt == other.requestedAt &&
                this.type == other.type &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        transferId,
                        reason,
                        requestedAt,
                        type,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "StopPaymentRequest{transferId=$transferId, reason=$reason, requestedAt=$requestedAt, type=$type, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var transferId: JsonField<String> = JsonMissing.of()
            private var reason: JsonField<Reason> = JsonMissing.of()
            private var requestedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var type: JsonField<Type> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(stopPaymentRequest: StopPaymentRequest) = apply {
                this.transferId = stopPaymentRequest.transferId
                this.reason = stopPaymentRequest.reason
                this.requestedAt = stopPaymentRequest.requestedAt
                this.type = stopPaymentRequest.type
                additionalProperties(stopPaymentRequest.additionalProperties)
            }

            /** The ID of the check transfer that was stopped. */
            fun transferId(transferId: String) = transferId(JsonField.of(transferId))

            /** The ID of the check transfer that was stopped. */
            @JsonProperty("transfer_id")
            @ExcludeMissing
            fun transferId(transferId: JsonField<String>) = apply { this.transferId = transferId }

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
                    transferId,
                    reason,
                    requestedAt,
                    type,
                    additionalProperties.toUnmodifiable(),
                )
        }

        class Reason
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Reason && this.value == other.value
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

        private var hashCode: Int = 0

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Submission &&
                this.submittedAt == other.submittedAt &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = Objects.hash(submittedAt, additionalProperties)
            }
            return hashCode
        }

        override fun toString() =
            "Submission{submittedAt=$submittedAt, additionalProperties=$additionalProperties}"

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
}
