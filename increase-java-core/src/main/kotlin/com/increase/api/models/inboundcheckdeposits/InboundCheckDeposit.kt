// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.inboundcheckdeposits

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

/**
 * Inbound Check Deposits are records of third-parties attempting to deposit checks against your
 * account.
 */
@NoAutoDetect
class InboundCheckDeposit
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("accepted_at")
    @ExcludeMissing
    private val acceptedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("account_id")
    @ExcludeMissing
    private val accountId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("account_number_id")
    @ExcludeMissing
    private val accountNumberId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("adjustments")
    @ExcludeMissing
    private val adjustments: JsonField<List<Adjustment>> = JsonMissing.of(),
    @JsonProperty("amount") @ExcludeMissing private val amount: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("back_image_file_id")
    @ExcludeMissing
    private val backImageFileId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("bank_of_first_deposit_routing_number")
    @ExcludeMissing
    private val bankOfFirstDepositRoutingNumber: JsonField<String> = JsonMissing.of(),
    @JsonProperty("check_number")
    @ExcludeMissing
    private val checkNumber: JsonField<String> = JsonMissing.of(),
    @JsonProperty("check_transfer_id")
    @ExcludeMissing
    private val checkTransferId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("currency")
    @ExcludeMissing
    private val currency: JsonField<Currency> = JsonMissing.of(),
    @JsonProperty("declined_at")
    @ExcludeMissing
    private val declinedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("declined_transaction_id")
    @ExcludeMissing
    private val declinedTransactionId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("deposit_return")
    @ExcludeMissing
    private val depositReturn: JsonField<DepositReturn> = JsonMissing.of(),
    @JsonProperty("front_image_file_id")
    @ExcludeMissing
    private val frontImageFileId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("payee_name_analysis")
    @ExcludeMissing
    private val payeeNameAnalysis: JsonField<PayeeNameAnalysis> = JsonMissing.of(),
    @JsonProperty("status")
    @ExcludeMissing
    private val status: JsonField<Status> = JsonMissing.of(),
    @JsonProperty("transaction_id")
    @ExcludeMissing
    private val transactionId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The deposit's identifier. */
    fun id(): String = id.getRequired("id")

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

    /** The deposit's identifier. */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * If the Inbound Check Deposit was accepted, the
     * [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which this took place.
     */
    @JsonProperty("accepted_at")
    @ExcludeMissing
    fun _acceptedAt(): JsonField<OffsetDateTime> = acceptedAt

    /** The Account the check is being deposited against. */
    @JsonProperty("account_id") @ExcludeMissing fun _accountId(): JsonField<String> = accountId

    /** The Account Number the check is being deposited against. */
    @JsonProperty("account_number_id")
    @ExcludeMissing
    fun _accountNumberId(): JsonField<String> = accountNumberId

    /**
     * If the deposit or the return was adjusted by the sending institution, this will contain
     * details of the adjustments.
     */
    @JsonProperty("adjustments")
    @ExcludeMissing
    fun _adjustments(): JsonField<List<Adjustment>> = adjustments

    /** The deposited amount in USD cents. */
    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

    /** The ID for the File containing the image of the back of the check. */
    @JsonProperty("back_image_file_id")
    @ExcludeMissing
    fun _backImageFileId(): JsonField<String> = backImageFileId

    /**
     * The American Bankers' Association (ABA) Routing Transit Number (RTN) for the bank depositing
     * this check. In some rare cases, this is not transmitted via Check21 and the value will be
     * null.
     */
    @JsonProperty("bank_of_first_deposit_routing_number")
    @ExcludeMissing
    fun _bankOfFirstDepositRoutingNumber(): JsonField<String> = bankOfFirstDepositRoutingNumber

    /** The check number printed on the check being deposited. */
    @JsonProperty("check_number")
    @ExcludeMissing
    fun _checkNumber(): JsonField<String> = checkNumber

    /** If this deposit is for an existing Check Transfer, the identifier of that Check Transfer. */
    @JsonProperty("check_transfer_id")
    @ExcludeMissing
    fun _checkTransferId(): JsonField<String> = checkTransferId

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the deposit was
     * attempted.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the deposit. */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<Currency> = currency

    /**
     * If the Inbound Check Deposit was declined, the
     * [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which this took place.
     */
    @JsonProperty("declined_at")
    @ExcludeMissing
    fun _declinedAt(): JsonField<OffsetDateTime> = declinedAt

    /**
     * If the deposit attempt has been rejected, the identifier of the Declined Transaction object
     * created as a result of the failed deposit.
     */
    @JsonProperty("declined_transaction_id")
    @ExcludeMissing
    fun _declinedTransactionId(): JsonField<String> = declinedTransactionId

    /** If you requested a return of this deposit, this will contain details of the return. */
    @JsonProperty("deposit_return")
    @ExcludeMissing
    fun _depositReturn(): JsonField<DepositReturn> = depositReturn

    /** The ID for the File containing the image of the front of the check. */
    @JsonProperty("front_image_file_id")
    @ExcludeMissing
    fun _frontImageFileId(): JsonField<String> = frontImageFileId

    /**
     * Whether the details on the check match the recipient name of the check transfer. This is an
     * optional feature, contact sales to enable.
     */
    @JsonProperty("payee_name_analysis")
    @ExcludeMissing
    fun _payeeNameAnalysis(): JsonField<PayeeNameAnalysis> = payeeNameAnalysis

    /** The status of the Inbound Check Deposit. */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * If the deposit attempt has been accepted, the identifier of the Transaction object created as
     * a result of the successful deposit.
     */
    @JsonProperty("transaction_id")
    @ExcludeMissing
    fun _transactionId(): JsonField<String> = transactionId

    /**
     * A constant representing the object's type. For this resource it will always be
     * `inbound_check_deposit`.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): InboundCheckDeposit = apply {
        if (validated) {
            return@apply
        }

        id()
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
        depositReturn().ifPresent { it.validate() }
        frontImageFileId()
        payeeNameAnalysis()
        status()
        transactionId()
        type()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [InboundCheckDeposit].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .acceptedAt()
         * .accountId()
         * .accountNumberId()
         * .adjustments()
         * .amount()
         * .backImageFileId()
         * .bankOfFirstDepositRoutingNumber()
         * .checkNumber()
         * .checkTransferId()
         * .createdAt()
         * .currency()
         * .declinedAt()
         * .declinedTransactionId()
         * .depositReturn()
         * .frontImageFileId()
         * .payeeNameAnalysis()
         * .status()
         * .transactionId()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InboundCheckDeposit]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var acceptedAt: JsonField<OffsetDateTime>? = null
        private var accountId: JsonField<String>? = null
        private var accountNumberId: JsonField<String>? = null
        private var adjustments: JsonField<MutableList<Adjustment>>? = null
        private var amount: JsonField<Long>? = null
        private var backImageFileId: JsonField<String>? = null
        private var bankOfFirstDepositRoutingNumber: JsonField<String>? = null
        private var checkNumber: JsonField<String>? = null
        private var checkTransferId: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var currency: JsonField<Currency>? = null
        private var declinedAt: JsonField<OffsetDateTime>? = null
        private var declinedTransactionId: JsonField<String>? = null
        private var depositReturn: JsonField<DepositReturn>? = null
        private var frontImageFileId: JsonField<String>? = null
        private var payeeNameAnalysis: JsonField<PayeeNameAnalysis>? = null
        private var status: JsonField<Status>? = null
        private var transactionId: JsonField<String>? = null
        private var type: JsonField<Type>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(inboundCheckDeposit: InboundCheckDeposit) = apply {
            id = inboundCheckDeposit.id
            acceptedAt = inboundCheckDeposit.acceptedAt
            accountId = inboundCheckDeposit.accountId
            accountNumberId = inboundCheckDeposit.accountNumberId
            adjustments = inboundCheckDeposit.adjustments.map { it.toMutableList() }
            amount = inboundCheckDeposit.amount
            backImageFileId = inboundCheckDeposit.backImageFileId
            bankOfFirstDepositRoutingNumber = inboundCheckDeposit.bankOfFirstDepositRoutingNumber
            checkNumber = inboundCheckDeposit.checkNumber
            checkTransferId = inboundCheckDeposit.checkTransferId
            createdAt = inboundCheckDeposit.createdAt
            currency = inboundCheckDeposit.currency
            declinedAt = inboundCheckDeposit.declinedAt
            declinedTransactionId = inboundCheckDeposit.declinedTransactionId
            depositReturn = inboundCheckDeposit.depositReturn
            frontImageFileId = inboundCheckDeposit.frontImageFileId
            payeeNameAnalysis = inboundCheckDeposit.payeeNameAnalysis
            status = inboundCheckDeposit.status
            transactionId = inboundCheckDeposit.transactionId
            type = inboundCheckDeposit.type
            additionalProperties = inboundCheckDeposit.additionalProperties.toMutableMap()
        }

        /** The deposit's identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The deposit's identifier. */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * If the Inbound Check Deposit was accepted, the
         * [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which this took
         * place.
         */
        fun acceptedAt(acceptedAt: OffsetDateTime?) = acceptedAt(JsonField.ofNullable(acceptedAt))

        /**
         * If the Inbound Check Deposit was accepted, the
         * [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which this took
         * place.
         */
        fun acceptedAt(acceptedAt: Optional<OffsetDateTime>) = acceptedAt(acceptedAt.getOrNull())

        /**
         * If the Inbound Check Deposit was accepted, the
         * [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which this took
         * place.
         */
        fun acceptedAt(acceptedAt: JsonField<OffsetDateTime>) = apply {
            this.acceptedAt = acceptedAt
        }

        /** The Account the check is being deposited against. */
        fun accountId(accountId: String) = accountId(JsonField.of(accountId))

        /** The Account the check is being deposited against. */
        fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

        /** The Account Number the check is being deposited against. */
        fun accountNumberId(accountNumberId: String?) =
            accountNumberId(JsonField.ofNullable(accountNumberId))

        /** The Account Number the check is being deposited against. */
        fun accountNumberId(accountNumberId: Optional<String>) =
            accountNumberId(accountNumberId.getOrNull())

        /** The Account Number the check is being deposited against. */
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
        fun adjustments(adjustments: JsonField<List<Adjustment>>) = apply {
            this.adjustments = adjustments.map { it.toMutableList() }
        }

        /**
         * If the deposit or the return was adjusted by the sending institution, this will contain
         * details of the adjustments.
         */
        fun addAdjustment(adjustment: Adjustment) = apply {
            adjustments =
                (adjustments ?: JsonField.of(mutableListOf())).also {
                    checkKnown("adjustments", it).add(adjustment)
                }
        }

        /** The deposited amount in USD cents. */
        fun amount(amount: Long) = amount(JsonField.of(amount))

        /** The deposited amount in USD cents. */
        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

        /** The ID for the File containing the image of the back of the check. */
        fun backImageFileId(backImageFileId: String?) =
            backImageFileId(JsonField.ofNullable(backImageFileId))

        /** The ID for the File containing the image of the back of the check. */
        fun backImageFileId(backImageFileId: Optional<String>) =
            backImageFileId(backImageFileId.getOrNull())

        /** The ID for the File containing the image of the back of the check. */
        fun backImageFileId(backImageFileId: JsonField<String>) = apply {
            this.backImageFileId = backImageFileId
        }

        /**
         * The American Bankers' Association (ABA) Routing Transit Number (RTN) for the bank
         * depositing this check. In some rare cases, this is not transmitted via Check21 and the
         * value will be null.
         */
        fun bankOfFirstDepositRoutingNumber(bankOfFirstDepositRoutingNumber: String?) =
            bankOfFirstDepositRoutingNumber(JsonField.ofNullable(bankOfFirstDepositRoutingNumber))

        /**
         * The American Bankers' Association (ABA) Routing Transit Number (RTN) for the bank
         * depositing this check. In some rare cases, this is not transmitted via Check21 and the
         * value will be null.
         */
        fun bankOfFirstDepositRoutingNumber(bankOfFirstDepositRoutingNumber: Optional<String>) =
            bankOfFirstDepositRoutingNumber(bankOfFirstDepositRoutingNumber.getOrNull())

        /**
         * The American Bankers' Association (ABA) Routing Transit Number (RTN) for the bank
         * depositing this check. In some rare cases, this is not transmitted via Check21 and the
         * value will be null.
         */
        fun bankOfFirstDepositRoutingNumber(bankOfFirstDepositRoutingNumber: JsonField<String>) =
            apply {
                this.bankOfFirstDepositRoutingNumber = bankOfFirstDepositRoutingNumber
            }

        /** The check number printed on the check being deposited. */
        fun checkNumber(checkNumber: String?) = checkNumber(JsonField.ofNullable(checkNumber))

        /** The check number printed on the check being deposited. */
        fun checkNumber(checkNumber: Optional<String>) = checkNumber(checkNumber.getOrNull())

        /** The check number printed on the check being deposited. */
        fun checkNumber(checkNumber: JsonField<String>) = apply { this.checkNumber = checkNumber }

        /**
         * If this deposit is for an existing Check Transfer, the identifier of that Check Transfer.
         */
        fun checkTransferId(checkTransferId: String?) =
            checkTransferId(JsonField.ofNullable(checkTransferId))

        /**
         * If this deposit is for an existing Check Transfer, the identifier of that Check Transfer.
         */
        fun checkTransferId(checkTransferId: Optional<String>) =
            checkTransferId(checkTransferId.getOrNull())

        /**
         * If this deposit is for an existing Check Transfer, the identifier of that Check Transfer.
         */
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
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the deposit. */
        fun currency(currency: Currency) = currency(JsonField.of(currency))

        /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the deposit. */
        fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

        /**
         * If the Inbound Check Deposit was declined, the
         * [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which this took
         * place.
         */
        fun declinedAt(declinedAt: OffsetDateTime?) = declinedAt(JsonField.ofNullable(declinedAt))

        /**
         * If the Inbound Check Deposit was declined, the
         * [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which this took
         * place.
         */
        fun declinedAt(declinedAt: Optional<OffsetDateTime>) = declinedAt(declinedAt.getOrNull())

        /**
         * If the Inbound Check Deposit was declined, the
         * [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which this took
         * place.
         */
        fun declinedAt(declinedAt: JsonField<OffsetDateTime>) = apply {
            this.declinedAt = declinedAt
        }

        /**
         * If the deposit attempt has been rejected, the identifier of the Declined Transaction
         * object created as a result of the failed deposit.
         */
        fun declinedTransactionId(declinedTransactionId: String?) =
            declinedTransactionId(JsonField.ofNullable(declinedTransactionId))

        /**
         * If the deposit attempt has been rejected, the identifier of the Declined Transaction
         * object created as a result of the failed deposit.
         */
        fun declinedTransactionId(declinedTransactionId: Optional<String>) =
            declinedTransactionId(declinedTransactionId.getOrNull())

        /**
         * If the deposit attempt has been rejected, the identifier of the Declined Transaction
         * object created as a result of the failed deposit.
         */
        fun declinedTransactionId(declinedTransactionId: JsonField<String>) = apply {
            this.declinedTransactionId = declinedTransactionId
        }

        /** If you requested a return of this deposit, this will contain details of the return. */
        fun depositReturn(depositReturn: DepositReturn?) =
            depositReturn(JsonField.ofNullable(depositReturn))

        /** If you requested a return of this deposit, this will contain details of the return. */
        fun depositReturn(depositReturn: Optional<DepositReturn>) =
            depositReturn(depositReturn.getOrNull())

        /** If you requested a return of this deposit, this will contain details of the return. */
        fun depositReturn(depositReturn: JsonField<DepositReturn>) = apply {
            this.depositReturn = depositReturn
        }

        /** The ID for the File containing the image of the front of the check. */
        fun frontImageFileId(frontImageFileId: String?) =
            frontImageFileId(JsonField.ofNullable(frontImageFileId))

        /** The ID for the File containing the image of the front of the check. */
        fun frontImageFileId(frontImageFileId: Optional<String>) =
            frontImageFileId(frontImageFileId.getOrNull())

        /** The ID for the File containing the image of the front of the check. */
        fun frontImageFileId(frontImageFileId: JsonField<String>) = apply {
            this.frontImageFileId = frontImageFileId
        }

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
        fun payeeNameAnalysis(payeeNameAnalysis: JsonField<PayeeNameAnalysis>) = apply {
            this.payeeNameAnalysis = payeeNameAnalysis
        }

        /** The status of the Inbound Check Deposit. */
        fun status(status: Status) = status(JsonField.of(status))

        /** The status of the Inbound Check Deposit. */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /**
         * If the deposit attempt has been accepted, the identifier of the Transaction object
         * created as a result of the successful deposit.
         */
        fun transactionId(transactionId: String?) =
            transactionId(JsonField.ofNullable(transactionId))

        /**
         * If the deposit attempt has been accepted, the identifier of the Transaction object
         * created as a result of the successful deposit.
         */
        fun transactionId(transactionId: Optional<String>) =
            transactionId(transactionId.getOrNull())

        /**
         * If the deposit attempt has been accepted, the identifier of the Transaction object
         * created as a result of the successful deposit.
         */
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

        fun build(): InboundCheckDeposit =
            InboundCheckDeposit(
                checkRequired("id", id),
                checkRequired("acceptedAt", acceptedAt),
                checkRequired("accountId", accountId),
                checkRequired("accountNumberId", accountNumberId),
                checkRequired("adjustments", adjustments).map { it.toImmutable() },
                checkRequired("amount", amount),
                checkRequired("backImageFileId", backImageFileId),
                checkRequired("bankOfFirstDepositRoutingNumber", bankOfFirstDepositRoutingNumber),
                checkRequired("checkNumber", checkNumber),
                checkRequired("checkTransferId", checkTransferId),
                checkRequired("createdAt", createdAt),
                checkRequired("currency", currency),
                checkRequired("declinedAt", declinedAt),
                checkRequired("declinedTransactionId", declinedTransactionId),
                checkRequired("depositReturn", depositReturn),
                checkRequired("frontImageFileId", frontImageFileId),
                checkRequired("payeeNameAnalysis", payeeNameAnalysis),
                checkRequired("status", status),
                checkRequired("transactionId", transactionId),
                checkRequired("type", type),
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class Adjustment
    @JsonCreator
    private constructor(
        @JsonProperty("adjusted_at")
        @ExcludeMissing
        private val adjustedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("amount")
        @ExcludeMissing
        private val amount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("reason")
        @ExcludeMissing
        private val reason: JsonField<Reason> = JsonMissing.of(),
        @JsonProperty("transaction_id")
        @ExcludeMissing
        private val transactionId: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The time at which the return adjustment was received. */
        fun adjustedAt(): OffsetDateTime = adjustedAt.getRequired("adjusted_at")

        /** The amount of the adjustment. */
        fun amount(): Long = amount.getRequired("amount")

        /** The reason for the adjustment. */
        fun reason(): Reason = reason.getRequired("reason")

        /** The id of the transaction for the adjustment. */
        fun transactionId(): String = transactionId.getRequired("transaction_id")

        /** The time at which the return adjustment was received. */
        @JsonProperty("adjusted_at")
        @ExcludeMissing
        fun _adjustedAt(): JsonField<OffsetDateTime> = adjustedAt

        /** The amount of the adjustment. */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

        /** The reason for the adjustment. */
        @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<Reason> = reason

        /** The id of the transaction for the adjustment. */
        @JsonProperty("transaction_id")
        @ExcludeMissing
        fun _transactionId(): JsonField<String> = transactionId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Adjustment = apply {
            if (validated) {
                return@apply
            }

            adjustedAt()
            amount()
            reason()
            transactionId()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Adjustment].
             *
             * The following fields are required:
             * ```java
             * .adjustedAt()
             * .amount()
             * .reason()
             * .transactionId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Adjustment]. */
        class Builder internal constructor() {

            private var adjustedAt: JsonField<OffsetDateTime>? = null
            private var amount: JsonField<Long>? = null
            private var reason: JsonField<Reason>? = null
            private var transactionId: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(adjustment: Adjustment) = apply {
                adjustedAt = adjustment.adjustedAt
                amount = adjustment.amount
                reason = adjustment.reason
                transactionId = adjustment.transactionId
                additionalProperties = adjustment.additionalProperties.toMutableMap()
            }

            /** The time at which the return adjustment was received. */
            fun adjustedAt(adjustedAt: OffsetDateTime) = adjustedAt(JsonField.of(adjustedAt))

            /** The time at which the return adjustment was received. */
            fun adjustedAt(adjustedAt: JsonField<OffsetDateTime>) = apply {
                this.adjustedAt = adjustedAt
            }

            /** The amount of the adjustment. */
            fun amount(amount: Long) = amount(JsonField.of(amount))

            /** The amount of the adjustment. */
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            /** The reason for the adjustment. */
            fun reason(reason: Reason) = reason(JsonField.of(reason))

            /** The reason for the adjustment. */
            fun reason(reason: JsonField<Reason>) = apply { this.reason = reason }

            /** The id of the transaction for the adjustment. */
            fun transactionId(transactionId: String) = transactionId(JsonField.of(transactionId))

            /** The id of the transaction for the adjustment. */
            fun transactionId(transactionId: JsonField<String>) = apply {
                this.transactionId = transactionId
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

            fun build(): Adjustment =
                Adjustment(
                    checkRequired("adjustedAt", adjustedAt),
                    checkRequired("amount", amount),
                    checkRequired("reason", reason),
                    checkRequired("transactionId", transactionId),
                    additionalProperties.toImmutable(),
                )
        }

        /** The reason for the adjustment. */
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

                /**
                 * The return was initiated too late and the receiving institution has responded
                 * with a Late Return Claim.
                 */
                @JvmField val LATE_RETURN = of("late_return")

                /**
                 * The check was deposited to the wrong payee and the depositing institution has
                 * reimbursed the funds with a Wrong Payee Credit.
                 */
                @JvmField val WRONG_PAYEE_CREDIT = of("wrong_payee_credit")

                /**
                 * The check was deposited with a different amount than what was written on the
                 * check.
                 */
                @JvmField val ADJUSTED_AMOUNT = of("adjusted_amount")

                /**
                 * The recipient was not able to process the check. This usually happens for e.g.,
                 * low quality images.
                 */
                @JvmField val NON_CONFORMING_ITEM = of("non_conforming_item")

                @JvmStatic fun of(value: String) = Reason(JsonField.of(value))
            }

            /** An enum containing [Reason]'s known values. */
            enum class Known {
                /**
                 * The return was initiated too late and the receiving institution has responded
                 * with a Late Return Claim.
                 */
                LATE_RETURN,
                /**
                 * The check was deposited to the wrong payee and the depositing institution has
                 * reimbursed the funds with a Wrong Payee Credit.
                 */
                WRONG_PAYEE_CREDIT,
                /**
                 * The check was deposited with a different amount than what was written on the
                 * check.
                 */
                ADJUSTED_AMOUNT,
                /**
                 * The recipient was not able to process the check. This usually happens for e.g.,
                 * low quality images.
                 */
                NON_CONFORMING_ITEM,
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
                /**
                 * The return was initiated too late and the receiving institution has responded
                 * with a Late Return Claim.
                 */
                LATE_RETURN,
                /**
                 * The check was deposited to the wrong payee and the depositing institution has
                 * reimbursed the funds with a Wrong Payee Credit.
                 */
                WRONG_PAYEE_CREDIT,
                /**
                 * The check was deposited with a different amount than what was written on the
                 * check.
                 */
                ADJUSTED_AMOUNT,
                /**
                 * The recipient was not able to process the check. This usually happens for e.g.,
                 * low quality images.
                 */
                NON_CONFORMING_ITEM,
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
                    LATE_RETURN -> Value.LATE_RETURN
                    WRONG_PAYEE_CREDIT -> Value.WRONG_PAYEE_CREDIT
                    ADJUSTED_AMOUNT -> Value.ADJUSTED_AMOUNT
                    NON_CONFORMING_ITEM -> Value.NON_CONFORMING_ITEM
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
                    LATE_RETURN -> Known.LATE_RETURN
                    WRONG_PAYEE_CREDIT -> Known.WRONG_PAYEE_CREDIT
                    ADJUSTED_AMOUNT -> Known.ADJUSTED_AMOUNT
                    NON_CONFORMING_ITEM -> Known.NON_CONFORMING_ITEM
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

    /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the deposit. */
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

    /** If you requested a return of this deposit, this will contain details of the return. */
    @NoAutoDetect
    class DepositReturn
    @JsonCreator
    private constructor(
        @JsonProperty("reason")
        @ExcludeMissing
        private val reason: JsonField<Reason> = JsonMissing.of(),
        @JsonProperty("returned_at")
        @ExcludeMissing
        private val returnedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("transaction_id")
        @ExcludeMissing
        private val transactionId: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The reason the deposit was returned. */
        fun reason(): Reason = reason.getRequired("reason")

        /** The time at which the deposit was returned. */
        fun returnedAt(): OffsetDateTime = returnedAt.getRequired("returned_at")

        /** The id of the transaction for the returned deposit. */
        fun transactionId(): String = transactionId.getRequired("transaction_id")

        /** The reason the deposit was returned. */
        @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<Reason> = reason

        /** The time at which the deposit was returned. */
        @JsonProperty("returned_at")
        @ExcludeMissing
        fun _returnedAt(): JsonField<OffsetDateTime> = returnedAt

        /** The id of the transaction for the returned deposit. */
        @JsonProperty("transaction_id")
        @ExcludeMissing
        fun _transactionId(): JsonField<String> = transactionId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): DepositReturn = apply {
            if (validated) {
                return@apply
            }

            reason()
            returnedAt()
            transactionId()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [DepositReturn].
             *
             * The following fields are required:
             * ```java
             * .reason()
             * .returnedAt()
             * .transactionId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [DepositReturn]. */
        class Builder internal constructor() {

            private var reason: JsonField<Reason>? = null
            private var returnedAt: JsonField<OffsetDateTime>? = null
            private var transactionId: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(depositReturn: DepositReturn) = apply {
                reason = depositReturn.reason
                returnedAt = depositReturn.returnedAt
                transactionId = depositReturn.transactionId
                additionalProperties = depositReturn.additionalProperties.toMutableMap()
            }

            /** The reason the deposit was returned. */
            fun reason(reason: Reason) = reason(JsonField.of(reason))

            /** The reason the deposit was returned. */
            fun reason(reason: JsonField<Reason>) = apply { this.reason = reason }

            /** The time at which the deposit was returned. */
            fun returnedAt(returnedAt: OffsetDateTime) = returnedAt(JsonField.of(returnedAt))

            /** The time at which the deposit was returned. */
            fun returnedAt(returnedAt: JsonField<OffsetDateTime>) = apply {
                this.returnedAt = returnedAt
            }

            /** The id of the transaction for the returned deposit. */
            fun transactionId(transactionId: String) = transactionId(JsonField.of(transactionId))

            /** The id of the transaction for the returned deposit. */
            fun transactionId(transactionId: JsonField<String>) = apply {
                this.transactionId = transactionId
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

            fun build(): DepositReturn =
                DepositReturn(
                    checkRequired("reason", reason),
                    checkRequired("returnedAt", returnedAt),
                    checkRequired("transactionId", transactionId),
                    additionalProperties.toImmutable(),
                )
        }

        /** The reason the deposit was returned. */
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

                /** The check was altered or fictitious. */
                @JvmField val ALTERED_OR_FICTITIOUS = of("altered_or_fictitious")

                /** The check was not authorized. */
                @JvmField val NOT_AUTHORIZED = of("not_authorized")

                /** The check was a duplicate presentment. */
                @JvmField val DUPLICATE_PRESENTMENT = of("duplicate_presentment")

                /** The check was not endorsed. */
                @JvmField val ENDORSEMENT_MISSING = of("endorsement_missing")

                /** The check was not endorsed by the payee. */
                @JvmField val ENDORSEMENT_IRREGULAR = of("endorsement_irregular")

                @JvmStatic fun of(value: String) = Reason(JsonField.of(value))
            }

            /** An enum containing [Reason]'s known values. */
            enum class Known {
                /** The check was altered or fictitious. */
                ALTERED_OR_FICTITIOUS,
                /** The check was not authorized. */
                NOT_AUTHORIZED,
                /** The check was a duplicate presentment. */
                DUPLICATE_PRESENTMENT,
                /** The check was not endorsed. */
                ENDORSEMENT_MISSING,
                /** The check was not endorsed by the payee. */
                ENDORSEMENT_IRREGULAR,
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
                /** The check was altered or fictitious. */
                ALTERED_OR_FICTITIOUS,
                /** The check was not authorized. */
                NOT_AUTHORIZED,
                /** The check was a duplicate presentment. */
                DUPLICATE_PRESENTMENT,
                /** The check was not endorsed. */
                ENDORSEMENT_MISSING,
                /** The check was not endorsed by the payee. */
                ENDORSEMENT_IRREGULAR,
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
                    ALTERED_OR_FICTITIOUS -> Value.ALTERED_OR_FICTITIOUS
                    NOT_AUTHORIZED -> Value.NOT_AUTHORIZED
                    DUPLICATE_PRESENTMENT -> Value.DUPLICATE_PRESENTMENT
                    ENDORSEMENT_MISSING -> Value.ENDORSEMENT_MISSING
                    ENDORSEMENT_IRREGULAR -> Value.ENDORSEMENT_IRREGULAR
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
                    ALTERED_OR_FICTITIOUS -> Known.ALTERED_OR_FICTITIOUS
                    NOT_AUTHORIZED -> Known.NOT_AUTHORIZED
                    DUPLICATE_PRESENTMENT -> Known.DUPLICATE_PRESENTMENT
                    ENDORSEMENT_MISSING -> Known.ENDORSEMENT_MISSING
                    ENDORSEMENT_IRREGULAR -> Known.ENDORSEMENT_IRREGULAR
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

    /**
     * Whether the details on the check match the recipient name of the check transfer. This is an
     * optional feature, contact sales to enable.
     */
    class PayeeNameAnalysis @JsonCreator private constructor(private val value: JsonField<String>) :
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

            /** The details on the check match the recipient name of the check transfer. */
            @JvmField val NAME_MATCHES = of("name_matches")

            /** The details on the check do not match the recipient name of the check transfer. */
            @JvmField val DOES_NOT_MATCH = of("does_not_match")

            /** The payee name analysis was not evaluated. */
            @JvmField val NOT_EVALUATED = of("not_evaluated")

            @JvmStatic fun of(value: String) = PayeeNameAnalysis(JsonField.of(value))
        }

        /** An enum containing [PayeeNameAnalysis]'s known values. */
        enum class Known {
            /** The details on the check match the recipient name of the check transfer. */
            NAME_MATCHES,
            /** The details on the check do not match the recipient name of the check transfer. */
            DOES_NOT_MATCH,
            /** The payee name analysis was not evaluated. */
            NOT_EVALUATED,
        }

        /**
         * An enum containing [PayeeNameAnalysis]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [PayeeNameAnalysis] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            /** The details on the check match the recipient name of the check transfer. */
            NAME_MATCHES,
            /** The details on the check do not match the recipient name of the check transfer. */
            DOES_NOT_MATCH,
            /** The payee name analysis was not evaluated. */
            NOT_EVALUATED,
            /**
             * An enum member indicating that [PayeeNameAnalysis] was instantiated with an unknown
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
                NAME_MATCHES -> Value.NAME_MATCHES
                DOES_NOT_MATCH -> Value.DOES_NOT_MATCH
                NOT_EVALUATED -> Value.NOT_EVALUATED
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
                NAME_MATCHES -> Known.NAME_MATCHES
                DOES_NOT_MATCH -> Known.DOES_NOT_MATCH
                NOT_EVALUATED -> Known.NOT_EVALUATED
                else -> throw IncreaseInvalidDataException("Unknown PayeeNameAnalysis: $value")
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

            return /* spotless:off */ other is PayeeNameAnalysis && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The status of the Inbound Check Deposit. */
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

            /** The Inbound Check Deposit is pending. */
            @JvmField val PENDING = of("pending")

            /** The Inbound Check Deposit was accepted. */
            @JvmField val ACCEPTED = of("accepted")

            /** The Inbound Check Deposit was rejected. */
            @JvmField val DECLINED = of("declined")

            /** The Inbound Check Deposit was returned. */
            @JvmField val RETURNED = of("returned")

            /** The Inbound Check Deposit requires attention from an Increase operator. */
            @JvmField val REQUIRES_ATTENTION = of("requires_attention")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            /** The Inbound Check Deposit is pending. */
            PENDING,
            /** The Inbound Check Deposit was accepted. */
            ACCEPTED,
            /** The Inbound Check Deposit was rejected. */
            DECLINED,
            /** The Inbound Check Deposit was returned. */
            RETURNED,
            /** The Inbound Check Deposit requires attention from an Increase operator. */
            REQUIRES_ATTENTION,
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
            /** The Inbound Check Deposit is pending. */
            PENDING,
            /** The Inbound Check Deposit was accepted. */
            ACCEPTED,
            /** The Inbound Check Deposit was rejected. */
            DECLINED,
            /** The Inbound Check Deposit was returned. */
            RETURNED,
            /** The Inbound Check Deposit requires attention from an Increase operator. */
            REQUIRES_ATTENTION,
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
                PENDING -> Value.PENDING
                ACCEPTED -> Value.ACCEPTED
                DECLINED -> Value.DECLINED
                RETURNED -> Value.RETURNED
                REQUIRES_ATTENTION -> Value.REQUIRES_ATTENTION
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
                PENDING -> Known.PENDING
                ACCEPTED -> Known.ACCEPTED
                DECLINED -> Known.DECLINED
                RETURNED -> Known.RETURNED
                REQUIRES_ATTENTION -> Known.REQUIRES_ATTENTION
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
     * A constant representing the object's type. For this resource it will always be
     * `inbound_check_deposit`.
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

            @JvmField val INBOUND_CHECK_DEPOSIT = of("inbound_check_deposit")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            INBOUND_CHECK_DEPOSIT
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
            INBOUND_CHECK_DEPOSIT,
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
                INBOUND_CHECK_DEPOSIT -> Value.INBOUND_CHECK_DEPOSIT
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
                INBOUND_CHECK_DEPOSIT -> Known.INBOUND_CHECK_DEPOSIT
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

        return /* spotless:off */ other is InboundCheckDeposit && id == other.id && acceptedAt == other.acceptedAt && accountId == other.accountId && accountNumberId == other.accountNumberId && adjustments == other.adjustments && amount == other.amount && backImageFileId == other.backImageFileId && bankOfFirstDepositRoutingNumber == other.bankOfFirstDepositRoutingNumber && checkNumber == other.checkNumber && checkTransferId == other.checkTransferId && createdAt == other.createdAt && currency == other.currency && declinedAt == other.declinedAt && declinedTransactionId == other.declinedTransactionId && depositReturn == other.depositReturn && frontImageFileId == other.frontImageFileId && payeeNameAnalysis == other.payeeNameAnalysis && status == other.status && transactionId == other.transactionId && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, acceptedAt, accountId, accountNumberId, adjustments, amount, backImageFileId, bankOfFirstDepositRoutingNumber, checkNumber, checkTransferId, createdAt, currency, declinedAt, declinedTransactionId, depositReturn, frontImageFileId, payeeNameAnalysis, status, transactionId, type, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InboundCheckDeposit{id=$id, acceptedAt=$acceptedAt, accountId=$accountId, accountNumberId=$accountNumberId, adjustments=$adjustments, amount=$amount, backImageFileId=$backImageFileId, bankOfFirstDepositRoutingNumber=$bankOfFirstDepositRoutingNumber, checkNumber=$checkNumber, checkTransferId=$checkTransferId, createdAt=$createdAt, currency=$currency, declinedAt=$declinedAt, declinedTransactionId=$declinedTransactionId, depositReturn=$depositReturn, frontImageFileId=$frontImageFileId, payeeNameAnalysis=$payeeNameAnalysis, status=$status, transactionId=$transactionId, type=$type, additionalProperties=$additionalProperties}"
}
