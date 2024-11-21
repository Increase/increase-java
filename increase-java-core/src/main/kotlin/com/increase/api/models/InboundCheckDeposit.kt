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
import com.increase.api.core.toImmutable
import com.increase.api.errors.IncreaseInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

/**
 * Inbound Check Deposits are records of third-parties attempting to deposit checks against your
 * account.
 */
@JsonDeserialize(builder = InboundCheckDeposit.Builder::class)
@NoAutoDetect
class InboundCheckDeposit
private constructor(
    private val acceptedAt: JsonField<OffsetDateTime>,
    private val accountId: JsonField<String>,
    private val accountNumberId: JsonField<String>,
    private val adjustments: JsonField<List<Adjustment>>,
    private val amount: JsonField<Long>,
    private val backImageFileId: JsonField<String>,
    private val bankOfFirstDepositRoutingNumber: JsonField<String>,
    private val checkNumber: JsonField<String>,
    private val checkTransferId: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val currency: JsonField<Currency>,
    private val declinedAt: JsonField<OffsetDateTime>,
    private val declinedTransactionId: JsonField<String>,
    private val depositReturn: JsonField<DepositReturn>,
    private val frontImageFileId: JsonField<String>,
    private val id: JsonField<String>,
    private val payeeNameAnalysis: JsonField<PayeeNameAnalysis>,
    private val status: JsonField<Status>,
    private val transactionId: JsonField<String>,
    private val type: JsonField<Type>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /**
     * If the Inbound Check Deposit was accepted, the
     * [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which this took place.
     */
    fun acceptedAt(): Optional<OffsetDateTime> =
        Optional.ofNullable(acceptedAt.getNullable("accepted_at"))

    /** The Account the check is being deposited against. */
    fun accountId(): String = accountId.getRequired("account_id")

    /** The Account Number the check is being deposited against. */
    fun accountNumberId(): Optional<String> =
        Optional.ofNullable(accountNumberId.getNullable("account_number_id"))

    /**
     * If the deposit or the return was adjusted by the sending institution, this will contain
     * details of the adjustments.
     */
    fun adjustments(): List<Adjustment> = adjustments.getRequired("adjustments")

    /** The deposited amount in USD cents. */
    fun amount(): Long = amount.getRequired("amount")

    /** The ID for the File containing the image of the back of the check. */
    fun backImageFileId(): Optional<String> =
        Optional.ofNullable(backImageFileId.getNullable("back_image_file_id"))

    /**
     * The American Bankers' Association (ABA) Routing Transit Number (RTN) for the bank depositing
     * this check. In some rare cases, this is not transmitted via Check21 and the value will be
     * null.
     */
    fun bankOfFirstDepositRoutingNumber(): Optional<String> =
        Optional.ofNullable(
            bankOfFirstDepositRoutingNumber.getNullable("bank_of_first_deposit_routing_number")
        )

    /** The check number printed on the check being deposited. */
    fun checkNumber(): Optional<String> =
        Optional.ofNullable(checkNumber.getNullable("check_number"))

    /** If this deposit is for an existing Check Transfer, the identifier of that Check Transfer. */
    fun checkTransferId(): Optional<String> =
        Optional.ofNullable(checkTransferId.getNullable("check_transfer_id"))

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the deposit was
     * attempted.
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the deposit. */
    fun currency(): Currency = currency.getRequired("currency")

    /**
     * If the Inbound Check Deposit was declined, the
     * [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which this took place.
     */
    fun declinedAt(): Optional<OffsetDateTime> =
        Optional.ofNullable(declinedAt.getNullable("declined_at"))

    /**
     * If the deposit attempt has been rejected, the identifier of the Declined Transaction object
     * created as a result of the failed deposit.
     */
    fun declinedTransactionId(): Optional<String> =
        Optional.ofNullable(declinedTransactionId.getNullable("declined_transaction_id"))

    /** If you requested a return of this deposit, this will contain details of the return. */
    fun depositReturn(): Optional<DepositReturn> =
        Optional.ofNullable(depositReturn.getNullable("deposit_return"))

    /** The ID for the File containing the image of the front of the check. */
    fun frontImageFileId(): Optional<String> =
        Optional.ofNullable(frontImageFileId.getNullable("front_image_file_id"))

    /** The deposit's identifier. */
    fun id(): String = id.getRequired("id")

    /**
     * Whether the details on the check match the recipient name of the check transfer. This is an
     * optional feature, contact sales to enable.
     */
    fun payeeNameAnalysis(): PayeeNameAnalysis =
        payeeNameAnalysis.getRequired("payee_name_analysis")

    /** The status of the Inbound Check Deposit. */
    fun status(): Status = status.getRequired("status")

    /**
     * If the deposit attempt has been accepted, the identifier of the Transaction object created as
     * a result of the successful deposit.
     */
    fun transactionId(): Optional<String> =
        Optional.ofNullable(transactionId.getNullable("transaction_id"))

    /**
     * A constant representing the object's type. For this resource it will always be
     * `inbound_check_deposit`.
     */
    fun type(): Type = type.getRequired("type")

    /**
     * If the Inbound Check Deposit was accepted, the
     * [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which this took place.
     */
    @JsonProperty("accepted_at") @ExcludeMissing fun _acceptedAt() = acceptedAt

    /** The Account the check is being deposited against. */
    @JsonProperty("account_id") @ExcludeMissing fun _accountId() = accountId

    /** The Account Number the check is being deposited against. */
    @JsonProperty("account_number_id") @ExcludeMissing fun _accountNumberId() = accountNumberId

    /**
     * If the deposit or the return was adjusted by the sending institution, this will contain
     * details of the adjustments.
     */
    @JsonProperty("adjustments") @ExcludeMissing fun _adjustments() = adjustments

    /** The deposited amount in USD cents. */
    @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

    /** The ID for the File containing the image of the back of the check. */
    @JsonProperty("back_image_file_id") @ExcludeMissing fun _backImageFileId() = backImageFileId

    /**
     * The American Bankers' Association (ABA) Routing Transit Number (RTN) for the bank depositing
     * this check. In some rare cases, this is not transmitted via Check21 and the value will be
     * null.
     */
    @JsonProperty("bank_of_first_deposit_routing_number")
    @ExcludeMissing
    fun _bankOfFirstDepositRoutingNumber() = bankOfFirstDepositRoutingNumber

    /** The check number printed on the check being deposited. */
    @JsonProperty("check_number") @ExcludeMissing fun _checkNumber() = checkNumber

    /** If this deposit is for an existing Check Transfer, the identifier of that Check Transfer. */
    @JsonProperty("check_transfer_id") @ExcludeMissing fun _checkTransferId() = checkTransferId

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the deposit was
     * attempted.
     */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the deposit. */
    @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

    /**
     * If the Inbound Check Deposit was declined, the
     * [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which this took place.
     */
    @JsonProperty("declined_at") @ExcludeMissing fun _declinedAt() = declinedAt

    /**
     * If the deposit attempt has been rejected, the identifier of the Declined Transaction object
     * created as a result of the failed deposit.
     */
    @JsonProperty("declined_transaction_id")
    @ExcludeMissing
    fun _declinedTransactionId() = declinedTransactionId

    /** If you requested a return of this deposit, this will contain details of the return. */
    @JsonProperty("deposit_return") @ExcludeMissing fun _depositReturn() = depositReturn

    /** The ID for the File containing the image of the front of the check. */
    @JsonProperty("front_image_file_id") @ExcludeMissing fun _frontImageFileId() = frontImageFileId

    /** The deposit's identifier. */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /**
     * Whether the details on the check match the recipient name of the check transfer. This is an
     * optional feature, contact sales to enable.
     */
    @JsonProperty("payee_name_analysis")
    @ExcludeMissing
    fun _payeeNameAnalysis() = payeeNameAnalysis

    /** The status of the Inbound Check Deposit. */
    @JsonProperty("status") @ExcludeMissing fun _status() = status

    /**
     * If the deposit attempt has been accepted, the identifier of the Transaction object created as
     * a result of the successful deposit.
     */
    @JsonProperty("transaction_id") @ExcludeMissing fun _transactionId() = transactionId

    /**
     * A constant representing the object's type. For this resource it will always be
     * `inbound_check_deposit`.
     */
    @JsonProperty("type") @ExcludeMissing fun _type() = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): InboundCheckDeposit = apply {
        if (!validated) {
            acceptedAt()
            accountId()
            accountNumberId()
            adjustments().forEach { it.validate() }
            amount()
            backImageFileId()
            bankOfFirstDepositRoutingNumber()
            checkNumber()
            checkTransferId()
            createdAt()
            currency()
            declinedAt()
            declinedTransactionId()
            depositReturn().map { it.validate() }
            frontImageFileId()
            id()
            payeeNameAnalysis()
            status()
            transactionId()
            type()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var acceptedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var accountId: JsonField<String> = JsonMissing.of()
        private var accountNumberId: JsonField<String> = JsonMissing.of()
        private var adjustments: JsonField<List<Adjustment>> = JsonMissing.of()
        private var amount: JsonField<Long> = JsonMissing.of()
        private var backImageFileId: JsonField<String> = JsonMissing.of()
        private var bankOfFirstDepositRoutingNumber: JsonField<String> = JsonMissing.of()
        private var checkNumber: JsonField<String> = JsonMissing.of()
        private var checkTransferId: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var currency: JsonField<Currency> = JsonMissing.of()
        private var declinedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var declinedTransactionId: JsonField<String> = JsonMissing.of()
        private var depositReturn: JsonField<DepositReturn> = JsonMissing.of()
        private var frontImageFileId: JsonField<String> = JsonMissing.of()
        private var id: JsonField<String> = JsonMissing.of()
        private var payeeNameAnalysis: JsonField<PayeeNameAnalysis> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var transactionId: JsonField<String> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(inboundCheckDeposit: InboundCheckDeposit) = apply {
            this.acceptedAt = inboundCheckDeposit.acceptedAt
            this.accountId = inboundCheckDeposit.accountId
            this.accountNumberId = inboundCheckDeposit.accountNumberId
            this.adjustments = inboundCheckDeposit.adjustments
            this.amount = inboundCheckDeposit.amount
            this.backImageFileId = inboundCheckDeposit.backImageFileId
            this.bankOfFirstDepositRoutingNumber =
                inboundCheckDeposit.bankOfFirstDepositRoutingNumber
            this.checkNumber = inboundCheckDeposit.checkNumber
            this.checkTransferId = inboundCheckDeposit.checkTransferId
            this.createdAt = inboundCheckDeposit.createdAt
            this.currency = inboundCheckDeposit.currency
            this.declinedAt = inboundCheckDeposit.declinedAt
            this.declinedTransactionId = inboundCheckDeposit.declinedTransactionId
            this.depositReturn = inboundCheckDeposit.depositReturn
            this.frontImageFileId = inboundCheckDeposit.frontImageFileId
            this.id = inboundCheckDeposit.id
            this.payeeNameAnalysis = inboundCheckDeposit.payeeNameAnalysis
            this.status = inboundCheckDeposit.status
            this.transactionId = inboundCheckDeposit.transactionId
            this.type = inboundCheckDeposit.type
            additionalProperties(inboundCheckDeposit.additionalProperties)
        }

        /**
         * If the Inbound Check Deposit was accepted, the
         * [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which this took
         * place.
         */
        fun acceptedAt(acceptedAt: OffsetDateTime) = acceptedAt(JsonField.of(acceptedAt))

        /**
         * If the Inbound Check Deposit was accepted, the
         * [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which this took
         * place.
         */
        @JsonProperty("accepted_at")
        @ExcludeMissing
        fun acceptedAt(acceptedAt: JsonField<OffsetDateTime>) = apply {
            this.acceptedAt = acceptedAt
        }

        /** The Account the check is being deposited against. */
        fun accountId(accountId: String) = accountId(JsonField.of(accountId))

        /** The Account the check is being deposited against. */
        @JsonProperty("account_id")
        @ExcludeMissing
        fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

        /** The Account Number the check is being deposited against. */
        fun accountNumberId(accountNumberId: String) =
            accountNumberId(JsonField.of(accountNumberId))

        /** The Account Number the check is being deposited against. */
        @JsonProperty("account_number_id")
        @ExcludeMissing
        fun accountNumberId(accountNumberId: JsonField<String>) = apply {
            this.accountNumberId = accountNumberId
        }

        /**
         * If the deposit or the return was adjusted by the sending institution, this will contain
         * details of the adjustments.
         */
        fun adjustments(adjustments: List<Adjustment>) = adjustments(JsonField.of(adjustments))

        /**
         * If the deposit or the return was adjusted by the sending institution, this will contain
         * details of the adjustments.
         */
        @JsonProperty("adjustments")
        @ExcludeMissing
        fun adjustments(adjustments: JsonField<List<Adjustment>>) = apply {
            this.adjustments = adjustments
        }

        /** The deposited amount in USD cents. */
        fun amount(amount: Long) = amount(JsonField.of(amount))

        /** The deposited amount in USD cents. */
        @JsonProperty("amount")
        @ExcludeMissing
        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

        /** The ID for the File containing the image of the back of the check. */
        fun backImageFileId(backImageFileId: String) =
            backImageFileId(JsonField.of(backImageFileId))

        /** The ID for the File containing the image of the back of the check. */
        @JsonProperty("back_image_file_id")
        @ExcludeMissing
        fun backImageFileId(backImageFileId: JsonField<String>) = apply {
            this.backImageFileId = backImageFileId
        }

        /**
         * The American Bankers' Association (ABA) Routing Transit Number (RTN) for the bank
         * depositing this check. In some rare cases, this is not transmitted via Check21 and the
         * value will be null.
         */
        fun bankOfFirstDepositRoutingNumber(bankOfFirstDepositRoutingNumber: String) =
            bankOfFirstDepositRoutingNumber(JsonField.of(bankOfFirstDepositRoutingNumber))

        /**
         * The American Bankers' Association (ABA) Routing Transit Number (RTN) for the bank
         * depositing this check. In some rare cases, this is not transmitted via Check21 and the
         * value will be null.
         */
        @JsonProperty("bank_of_first_deposit_routing_number")
        @ExcludeMissing
        fun bankOfFirstDepositRoutingNumber(bankOfFirstDepositRoutingNumber: JsonField<String>) =
            apply {
                this.bankOfFirstDepositRoutingNumber = bankOfFirstDepositRoutingNumber
            }

        /** The check number printed on the check being deposited. */
        fun checkNumber(checkNumber: String) = checkNumber(JsonField.of(checkNumber))

        /** The check number printed on the check being deposited. */
        @JsonProperty("check_number")
        @ExcludeMissing
        fun checkNumber(checkNumber: JsonField<String>) = apply { this.checkNumber = checkNumber }

        /**
         * If this deposit is for an existing Check Transfer, the identifier of that Check Transfer.
         */
        fun checkTransferId(checkTransferId: String) =
            checkTransferId(JsonField.of(checkTransferId))

        /**
         * If this deposit is for an existing Check Transfer, the identifier of that Check Transfer.
         */
        @JsonProperty("check_transfer_id")
        @ExcludeMissing
        fun checkTransferId(checkTransferId: JsonField<String>) = apply {
            this.checkTransferId = checkTransferId
        }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the deposit
         * was attempted.
         */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the deposit
         * was attempted.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the deposit. */
        fun currency(currency: Currency) = currency(JsonField.of(currency))

        /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the deposit. */
        @JsonProperty("currency")
        @ExcludeMissing
        fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

        /**
         * If the Inbound Check Deposit was declined, the
         * [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which this took
         * place.
         */
        fun declinedAt(declinedAt: OffsetDateTime) = declinedAt(JsonField.of(declinedAt))

        /**
         * If the Inbound Check Deposit was declined, the
         * [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which this took
         * place.
         */
        @JsonProperty("declined_at")
        @ExcludeMissing
        fun declinedAt(declinedAt: JsonField<OffsetDateTime>) = apply {
            this.declinedAt = declinedAt
        }

        /**
         * If the deposit attempt has been rejected, the identifier of the Declined Transaction
         * object created as a result of the failed deposit.
         */
        fun declinedTransactionId(declinedTransactionId: String) =
            declinedTransactionId(JsonField.of(declinedTransactionId))

        /**
         * If the deposit attempt has been rejected, the identifier of the Declined Transaction
         * object created as a result of the failed deposit.
         */
        @JsonProperty("declined_transaction_id")
        @ExcludeMissing
        fun declinedTransactionId(declinedTransactionId: JsonField<String>) = apply {
            this.declinedTransactionId = declinedTransactionId
        }

        /** If you requested a return of this deposit, this will contain details of the return. */
        fun depositReturn(depositReturn: DepositReturn) = depositReturn(JsonField.of(depositReturn))

        /** If you requested a return of this deposit, this will contain details of the return. */
        @JsonProperty("deposit_return")
        @ExcludeMissing
        fun depositReturn(depositReturn: JsonField<DepositReturn>) = apply {
            this.depositReturn = depositReturn
        }

        /** The ID for the File containing the image of the front of the check. */
        fun frontImageFileId(frontImageFileId: String) =
            frontImageFileId(JsonField.of(frontImageFileId))

        /** The ID for the File containing the image of the front of the check. */
        @JsonProperty("front_image_file_id")
        @ExcludeMissing
        fun frontImageFileId(frontImageFileId: JsonField<String>) = apply {
            this.frontImageFileId = frontImageFileId
        }

        /** The deposit's identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The deposit's identifier. */
        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * Whether the details on the check match the recipient name of the check transfer. This is
         * an optional feature, contact sales to enable.
         */
        fun payeeNameAnalysis(payeeNameAnalysis: PayeeNameAnalysis) =
            payeeNameAnalysis(JsonField.of(payeeNameAnalysis))

        /**
         * Whether the details on the check match the recipient name of the check transfer. This is
         * an optional feature, contact sales to enable.
         */
        @JsonProperty("payee_name_analysis")
        @ExcludeMissing
        fun payeeNameAnalysis(payeeNameAnalysis: JsonField<PayeeNameAnalysis>) = apply {
            this.payeeNameAnalysis = payeeNameAnalysis
        }

        /** The status of the Inbound Check Deposit. */
        fun status(status: Status) = status(JsonField.of(status))

        /** The status of the Inbound Check Deposit. */
        @JsonProperty("status")
        @ExcludeMissing
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /**
         * If the deposit attempt has been accepted, the identifier of the Transaction object
         * created as a result of the successful deposit.
         */
        fun transactionId(transactionId: String) = transactionId(JsonField.of(transactionId))

        /**
         * If the deposit attempt has been accepted, the identifier of the Transaction object
         * created as a result of the successful deposit.
         */
        @JsonProperty("transaction_id")
        @ExcludeMissing
        fun transactionId(transactionId: JsonField<String>) = apply {
            this.transactionId = transactionId
        }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `inbound_check_deposit`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * A constant representing the object's type. For this resource it will always be
         * `inbound_check_deposit`.
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

        fun build(): InboundCheckDeposit =
            InboundCheckDeposit(
                acceptedAt,
                accountId,
                accountNumberId,
                adjustments.map { it.toImmutable() },
                amount,
                backImageFileId,
                bankOfFirstDepositRoutingNumber,
                checkNumber,
                checkTransferId,
                createdAt,
                currency,
                declinedAt,
                declinedTransactionId,
                depositReturn,
                frontImageFileId,
                id,
                payeeNameAnalysis,
                status,
                transactionId,
                type,
                additionalProperties.toImmutable(),
            )
    }

    @JsonDeserialize(builder = Adjustment.Builder::class)
    @NoAutoDetect
    class Adjustment
    private constructor(
        private val adjustedAt: JsonField<OffsetDateTime>,
        private val amount: JsonField<Long>,
        private val reason: JsonField<Reason>,
        private val transactionId: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        /** The time at which the return adjustment was received. */
        fun adjustedAt(): OffsetDateTime = adjustedAt.getRequired("adjusted_at")

        /** The amount of the adjustment. */
        fun amount(): Long = amount.getRequired("amount")

        /** The reason for the adjustment. */
        fun reason(): Reason = reason.getRequired("reason")

        /** The id of the transaction for the adjustment. */
        fun transactionId(): String = transactionId.getRequired("transaction_id")

        /** The time at which the return adjustment was received. */
        @JsonProperty("adjusted_at") @ExcludeMissing fun _adjustedAt() = adjustedAt

        /** The amount of the adjustment. */
        @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

        /** The reason for the adjustment. */
        @JsonProperty("reason") @ExcludeMissing fun _reason() = reason

        /** The id of the transaction for the adjustment. */
        @JsonProperty("transaction_id") @ExcludeMissing fun _transactionId() = transactionId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Adjustment = apply {
            if (!validated) {
                adjustedAt()
                amount()
                reason()
                transactionId()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var adjustedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var amount: JsonField<Long> = JsonMissing.of()
            private var reason: JsonField<Reason> = JsonMissing.of()
            private var transactionId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(adjustment: Adjustment) = apply {
                this.adjustedAt = adjustment.adjustedAt
                this.amount = adjustment.amount
                this.reason = adjustment.reason
                this.transactionId = adjustment.transactionId
                additionalProperties(adjustment.additionalProperties)
            }

            /** The time at which the return adjustment was received. */
            fun adjustedAt(adjustedAt: OffsetDateTime) = adjustedAt(JsonField.of(adjustedAt))

            /** The time at which the return adjustment was received. */
            @JsonProperty("adjusted_at")
            @ExcludeMissing
            fun adjustedAt(adjustedAt: JsonField<OffsetDateTime>) = apply {
                this.adjustedAt = adjustedAt
            }

            /** The amount of the adjustment. */
            fun amount(amount: Long) = amount(JsonField.of(amount))

            /** The amount of the adjustment. */
            @JsonProperty("amount")
            @ExcludeMissing
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            /** The reason for the adjustment. */
            fun reason(reason: Reason) = reason(JsonField.of(reason))

            /** The reason for the adjustment. */
            @JsonProperty("reason")
            @ExcludeMissing
            fun reason(reason: JsonField<Reason>) = apply { this.reason = reason }

            /** The id of the transaction for the adjustment. */
            fun transactionId(transactionId: String) = transactionId(JsonField.of(transactionId))

            /** The id of the transaction for the adjustment. */
            @JsonProperty("transaction_id")
            @ExcludeMissing
            fun transactionId(transactionId: JsonField<String>) = apply {
                this.transactionId = transactionId
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

            fun build(): Adjustment =
                Adjustment(
                    adjustedAt,
                    amount,
                    reason,
                    transactionId,
                    additionalProperties.toImmutable(),
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

                return /* spotless:off */ other is Reason && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val LATE_RETURN = Reason(JsonField.of("late_return"))

                @JvmField val WRONG_PAYEE_CREDIT = Reason(JsonField.of("wrong_payee_credit"))

                @JvmField val ADJUSTED_AMOUNT = Reason(JsonField.of("adjusted_amount"))

                @JvmStatic fun of(value: String) = Reason(JsonField.of(value))
            }

            enum class Known {
                LATE_RETURN,
                WRONG_PAYEE_CREDIT,
                ADJUSTED_AMOUNT,
            }

            enum class Value {
                LATE_RETURN,
                WRONG_PAYEE_CREDIT,
                ADJUSTED_AMOUNT,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    LATE_RETURN -> Value.LATE_RETURN
                    WRONG_PAYEE_CREDIT -> Value.WRONG_PAYEE_CREDIT
                    ADJUSTED_AMOUNT -> Value.ADJUSTED_AMOUNT
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    LATE_RETURN -> Known.LATE_RETURN
                    WRONG_PAYEE_CREDIT -> Known.WRONG_PAYEE_CREDIT
                    ADJUSTED_AMOUNT -> Known.ADJUSTED_AMOUNT
                    else -> throw IncreaseInvalidDataException("Unknown Reason: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Adjustment && adjustedAt == other.adjustedAt && amount == other.amount && reason == other.reason && transactionId == other.transactionId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(adjustedAt, amount, reason, transactionId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Adjustment{adjustedAt=$adjustedAt, amount=$amount, reason=$reason, transactionId=$transactionId, additionalProperties=$additionalProperties}"
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

            return /* spotless:off */ other is Currency && value == other.value /* spotless:on */
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

    /** If you requested a return of this deposit, this will contain details of the return. */
    @JsonDeserialize(builder = DepositReturn.Builder::class)
    @NoAutoDetect
    class DepositReturn
    private constructor(
        private val reason: JsonField<Reason>,
        private val returnedAt: JsonField<OffsetDateTime>,
        private val transactionId: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        /** The reason the deposit was returned. */
        fun reason(): Reason = reason.getRequired("reason")

        /** The time at which the deposit was returned. */
        fun returnedAt(): OffsetDateTime = returnedAt.getRequired("returned_at")

        /** The id of the transaction for the returned deposit. */
        fun transactionId(): String = transactionId.getRequired("transaction_id")

        /** The reason the deposit was returned. */
        @JsonProperty("reason") @ExcludeMissing fun _reason() = reason

        /** The time at which the deposit was returned. */
        @JsonProperty("returned_at") @ExcludeMissing fun _returnedAt() = returnedAt

        /** The id of the transaction for the returned deposit. */
        @JsonProperty("transaction_id") @ExcludeMissing fun _transactionId() = transactionId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): DepositReturn = apply {
            if (!validated) {
                reason()
                returnedAt()
                transactionId()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var reason: JsonField<Reason> = JsonMissing.of()
            private var returnedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var transactionId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(depositReturn: DepositReturn) = apply {
                this.reason = depositReturn.reason
                this.returnedAt = depositReturn.returnedAt
                this.transactionId = depositReturn.transactionId
                additionalProperties(depositReturn.additionalProperties)
            }

            /** The reason the deposit was returned. */
            fun reason(reason: Reason) = reason(JsonField.of(reason))

            /** The reason the deposit was returned. */
            @JsonProperty("reason")
            @ExcludeMissing
            fun reason(reason: JsonField<Reason>) = apply { this.reason = reason }

            /** The time at which the deposit was returned. */
            fun returnedAt(returnedAt: OffsetDateTime) = returnedAt(JsonField.of(returnedAt))

            /** The time at which the deposit was returned. */
            @JsonProperty("returned_at")
            @ExcludeMissing
            fun returnedAt(returnedAt: JsonField<OffsetDateTime>) = apply {
                this.returnedAt = returnedAt
            }

            /** The id of the transaction for the returned deposit. */
            fun transactionId(transactionId: String) = transactionId(JsonField.of(transactionId))

            /** The id of the transaction for the returned deposit. */
            @JsonProperty("transaction_id")
            @ExcludeMissing
            fun transactionId(transactionId: JsonField<String>) = apply {
                this.transactionId = transactionId
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

            fun build(): DepositReturn =
                DepositReturn(
                    reason,
                    returnedAt,
                    transactionId,
                    additionalProperties.toImmutable(),
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

                return /* spotless:off */ other is Reason && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val ALTERED_OR_FICTITIOUS = Reason(JsonField.of("altered_or_fictitious"))

                @JvmField val NOT_AUTHORIZED = Reason(JsonField.of("not_authorized"))

                @JvmField val DUPLICATE_PRESENTMENT = Reason(JsonField.of("duplicate_presentment"))

                @JvmField val ENDORSEMENT_MISSING = Reason(JsonField.of("endorsement_missing"))

                @JvmField val ENDORSEMENT_IRREGULAR = Reason(JsonField.of("endorsement_irregular"))

                @JvmStatic fun of(value: String) = Reason(JsonField.of(value))
            }

            enum class Known {
                ALTERED_OR_FICTITIOUS,
                NOT_AUTHORIZED,
                DUPLICATE_PRESENTMENT,
                ENDORSEMENT_MISSING,
                ENDORSEMENT_IRREGULAR,
            }

            enum class Value {
                ALTERED_OR_FICTITIOUS,
                NOT_AUTHORIZED,
                DUPLICATE_PRESENTMENT,
                ENDORSEMENT_MISSING,
                ENDORSEMENT_IRREGULAR,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    ALTERED_OR_FICTITIOUS -> Value.ALTERED_OR_FICTITIOUS
                    NOT_AUTHORIZED -> Value.NOT_AUTHORIZED
                    DUPLICATE_PRESENTMENT -> Value.DUPLICATE_PRESENTMENT
                    ENDORSEMENT_MISSING -> Value.ENDORSEMENT_MISSING
                    ENDORSEMENT_IRREGULAR -> Value.ENDORSEMENT_IRREGULAR
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    ALTERED_OR_FICTITIOUS -> Known.ALTERED_OR_FICTITIOUS
                    NOT_AUTHORIZED -> Known.NOT_AUTHORIZED
                    DUPLICATE_PRESENTMENT -> Known.DUPLICATE_PRESENTMENT
                    ENDORSEMENT_MISSING -> Known.ENDORSEMENT_MISSING
                    ENDORSEMENT_IRREGULAR -> Known.ENDORSEMENT_IRREGULAR
                    else -> throw IncreaseInvalidDataException("Unknown Reason: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is DepositReturn && reason == other.reason && returnedAt == other.returnedAt && transactionId == other.transactionId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(reason, returnedAt, transactionId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "DepositReturn{reason=$reason, returnedAt=$returnedAt, transactionId=$transactionId, additionalProperties=$additionalProperties}"
    }

    class PayeeNameAnalysis
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PayeeNameAnalysis && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val NAME_MATCHES = PayeeNameAnalysis(JsonField.of("name_matches"))

            @JvmField val DOES_NOT_MATCH = PayeeNameAnalysis(JsonField.of("does_not_match"))

            @JvmField val NOT_EVALUATED = PayeeNameAnalysis(JsonField.of("not_evaluated"))

            @JvmStatic fun of(value: String) = PayeeNameAnalysis(JsonField.of(value))
        }

        enum class Known {
            NAME_MATCHES,
            DOES_NOT_MATCH,
            NOT_EVALUATED,
        }

        enum class Value {
            NAME_MATCHES,
            DOES_NOT_MATCH,
            NOT_EVALUATED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                NAME_MATCHES -> Value.NAME_MATCHES
                DOES_NOT_MATCH -> Value.DOES_NOT_MATCH
                NOT_EVALUATED -> Value.NOT_EVALUATED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                NAME_MATCHES -> Known.NAME_MATCHES
                DOES_NOT_MATCH -> Known.DOES_NOT_MATCH
                NOT_EVALUATED -> Known.NOT_EVALUATED
                else -> throw IncreaseInvalidDataException("Unknown PayeeNameAnalysis: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
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

            return /* spotless:off */ other is Status && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val PENDING = Status(JsonField.of("pending"))

            @JvmField val ACCEPTED = Status(JsonField.of("accepted"))

            @JvmField val DECLINED = Status(JsonField.of("declined"))

            @JvmField val RETURNED = Status(JsonField.of("returned"))

            @JvmField val REQUIRES_ATTENTION = Status(JsonField.of("requires_attention"))

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            PENDING,
            ACCEPTED,
            DECLINED,
            RETURNED,
            REQUIRES_ATTENTION,
        }

        enum class Value {
            PENDING,
            ACCEPTED,
            DECLINED,
            RETURNED,
            REQUIRES_ATTENTION,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                PENDING -> Value.PENDING
                ACCEPTED -> Value.ACCEPTED
                DECLINED -> Value.DECLINED
                RETURNED -> Value.RETURNED
                REQUIRES_ATTENTION -> Value.REQUIRES_ATTENTION
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                PENDING -> Known.PENDING
                ACCEPTED -> Known.ACCEPTED
                DECLINED -> Known.DECLINED
                RETURNED -> Known.RETURNED
                REQUIRES_ATTENTION -> Known.REQUIRES_ATTENTION
                else -> throw IncreaseInvalidDataException("Unknown Status: $value")
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

            return /* spotless:off */ other is Type && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val INBOUND_CHECK_DEPOSIT = Type(JsonField.of("inbound_check_deposit"))

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            INBOUND_CHECK_DEPOSIT,
        }

        enum class Value {
            INBOUND_CHECK_DEPOSIT,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                INBOUND_CHECK_DEPOSIT -> Value.INBOUND_CHECK_DEPOSIT
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                INBOUND_CHECK_DEPOSIT -> Known.INBOUND_CHECK_DEPOSIT
                else -> throw IncreaseInvalidDataException("Unknown Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is InboundCheckDeposit && acceptedAt == other.acceptedAt && accountId == other.accountId && accountNumberId == other.accountNumberId && adjustments == other.adjustments && amount == other.amount && backImageFileId == other.backImageFileId && bankOfFirstDepositRoutingNumber == other.bankOfFirstDepositRoutingNumber && checkNumber == other.checkNumber && checkTransferId == other.checkTransferId && createdAt == other.createdAt && currency == other.currency && declinedAt == other.declinedAt && declinedTransactionId == other.declinedTransactionId && depositReturn == other.depositReturn && frontImageFileId == other.frontImageFileId && id == other.id && payeeNameAnalysis == other.payeeNameAnalysis && status == other.status && transactionId == other.transactionId && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(acceptedAt, accountId, accountNumberId, adjustments, amount, backImageFileId, bankOfFirstDepositRoutingNumber, checkNumber, checkTransferId, createdAt, currency, declinedAt, declinedTransactionId, depositReturn, frontImageFileId, id, payeeNameAnalysis, status, transactionId, type, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InboundCheckDeposit{acceptedAt=$acceptedAt, accountId=$accountId, accountNumberId=$accountNumberId, adjustments=$adjustments, amount=$amount, backImageFileId=$backImageFileId, bankOfFirstDepositRoutingNumber=$bankOfFirstDepositRoutingNumber, checkNumber=$checkNumber, checkTransferId=$checkTransferId, createdAt=$createdAt, currency=$currency, declinedAt=$declinedAt, declinedTransactionId=$declinedTransactionId, depositReturn=$depositReturn, frontImageFileId=$frontImageFileId, id=$id, payeeNameAnalysis=$payeeNameAnalysis, status=$status, transactionId=$transactionId, type=$type, additionalProperties=$additionalProperties}"
}
