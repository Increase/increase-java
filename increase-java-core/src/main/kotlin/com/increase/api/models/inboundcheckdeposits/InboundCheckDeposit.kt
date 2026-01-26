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
import com.increase.api.core.checkKnown
import com.increase.api.core.checkRequired
import com.increase.api.core.toImmutable
import com.increase.api.errors.IncreaseInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Inbound Check Deposits are records of third-parties attempting to deposit checks against your
 * account.
 */
class InboundCheckDeposit
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
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
    private val payeeNameAnalysis: JsonField<PayeeNameAnalysis>,
    private val status: JsonField<Status>,
    private val transactionId: JsonField<String>,
    private val type: JsonField<Type>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("accepted_at")
        @ExcludeMissing
        acceptedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("account_id") @ExcludeMissing accountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("account_number_id")
        @ExcludeMissing
        accountNumberId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("adjustments")
        @ExcludeMissing
        adjustments: JsonField<List<Adjustment>> = JsonMissing.of(),
        @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("back_image_file_id")
        @ExcludeMissing
        backImageFileId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("bank_of_first_deposit_routing_number")
        @ExcludeMissing
        bankOfFirstDepositRoutingNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("check_number")
        @ExcludeMissing
        checkNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("check_transfer_id")
        @ExcludeMissing
        checkTransferId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("currency") @ExcludeMissing currency: JsonField<Currency> = JsonMissing.of(),
        @JsonProperty("declined_at")
        @ExcludeMissing
        declinedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("declined_transaction_id")
        @ExcludeMissing
        declinedTransactionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("deposit_return")
        @ExcludeMissing
        depositReturn: JsonField<DepositReturn> = JsonMissing.of(),
        @JsonProperty("front_image_file_id")
        @ExcludeMissing
        frontImageFileId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("payee_name_analysis")
        @ExcludeMissing
        payeeNameAnalysis: JsonField<PayeeNameAnalysis> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("transaction_id")
        @ExcludeMissing
        transactionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
    ) : this(
        id,
        acceptedAt,
        accountId,
        accountNumberId,
        adjustments,
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
        payeeNameAnalysis,
        status,
        transactionId,
        type,
        mutableMapOf(),
    )

    /**
     * The deposit's identifier.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * If the Inbound Check Deposit was accepted, the
     * [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which this took place.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun acceptedAt(): Optional<OffsetDateTime> = acceptedAt.getOptional("accepted_at")

    /**
     * The Account the check is being deposited against.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountId(): String = accountId.getRequired("account_id")

    /**
     * The Account Number the check is being deposited against.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun accountNumberId(): Optional<String> = accountNumberId.getOptional("account_number_id")

    /**
     * If the deposit or the return was adjusted by the sending institution, this will contain
     * details of the adjustments.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun adjustments(): List<Adjustment> = adjustments.getRequired("adjustments")

    /**
     * The deposited amount in USD cents.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun amount(): Long = amount.getRequired("amount")

    /**
     * The ID for the File containing the image of the back of the check.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun backImageFileId(): Optional<String> = backImageFileId.getOptional("back_image_file_id")

    /**
     * The American Bankers' Association (ABA) Routing Transit Number (RTN) for the bank depositing
     * this check. In some rare cases, this is not transmitted via Check21 and the value will be
     * null.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun bankOfFirstDepositRoutingNumber(): Optional<String> =
        bankOfFirstDepositRoutingNumber.getOptional("bank_of_first_deposit_routing_number")

    /**
     * The check number printed on the check being deposited.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun checkNumber(): Optional<String> = checkNumber.getOptional("check_number")

    /**
     * If this deposit is for an existing Check Transfer, the identifier of that Check Transfer.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun checkTransferId(): Optional<String> = checkTransferId.getOptional("check_transfer_id")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the deposit was
     * attempted.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the deposit.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun currency(): Currency = currency.getRequired("currency")

    /**
     * If the Inbound Check Deposit was declined, the
     * [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which this took place.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun declinedAt(): Optional<OffsetDateTime> = declinedAt.getOptional("declined_at")

    /**
     * If the deposit attempt has been rejected, the identifier of the Declined Transaction object
     * created as a result of the failed deposit.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun declinedTransactionId(): Optional<String> =
        declinedTransactionId.getOptional("declined_transaction_id")

    /**
     * If you requested a return of this deposit, this will contain details of the return.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun depositReturn(): Optional<DepositReturn> = depositReturn.getOptional("deposit_return")

    /**
     * The ID for the File containing the image of the front of the check.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun frontImageFileId(): Optional<String> = frontImageFileId.getOptional("front_image_file_id")

    /**
     * Whether the details on the check match the recipient name of the check transfer. This is an
     * optional feature, contact sales to enable.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun payeeNameAnalysis(): PayeeNameAnalysis =
        payeeNameAnalysis.getRequired("payee_name_analysis")

    /**
     * The status of the Inbound Check Deposit.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * If the deposit attempt has been accepted, the identifier of the Transaction object created as
     * a result of the successful deposit.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun transactionId(): Optional<String> = transactionId.getOptional("transaction_id")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `inbound_check_deposit`.
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
     * Returns the raw JSON value of [acceptedAt].
     *
     * Unlike [acceptedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("accepted_at")
    @ExcludeMissing
    fun _acceptedAt(): JsonField<OffsetDateTime> = acceptedAt

    /**
     * Returns the raw JSON value of [accountId].
     *
     * Unlike [accountId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("account_id") @ExcludeMissing fun _accountId(): JsonField<String> = accountId

    /**
     * Returns the raw JSON value of [accountNumberId].
     *
     * Unlike [accountNumberId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("account_number_id")
    @ExcludeMissing
    fun _accountNumberId(): JsonField<String> = accountNumberId

    /**
     * Returns the raw JSON value of [adjustments].
     *
     * Unlike [adjustments], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("adjustments")
    @ExcludeMissing
    fun _adjustments(): JsonField<List<Adjustment>> = adjustments

    /**
     * Returns the raw JSON value of [amount].
     *
     * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

    /**
     * Returns the raw JSON value of [backImageFileId].
     *
     * Unlike [backImageFileId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("back_image_file_id")
    @ExcludeMissing
    fun _backImageFileId(): JsonField<String> = backImageFileId

    /**
     * Returns the raw JSON value of [bankOfFirstDepositRoutingNumber].
     *
     * Unlike [bankOfFirstDepositRoutingNumber], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("bank_of_first_deposit_routing_number")
    @ExcludeMissing
    fun _bankOfFirstDepositRoutingNumber(): JsonField<String> = bankOfFirstDepositRoutingNumber

    /**
     * Returns the raw JSON value of [checkNumber].
     *
     * Unlike [checkNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("check_number")
    @ExcludeMissing
    fun _checkNumber(): JsonField<String> = checkNumber

    /**
     * Returns the raw JSON value of [checkTransferId].
     *
     * Unlike [checkTransferId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("check_transfer_id")
    @ExcludeMissing
    fun _checkTransferId(): JsonField<String> = checkTransferId

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [currency].
     *
     * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<Currency> = currency

    /**
     * Returns the raw JSON value of [declinedAt].
     *
     * Unlike [declinedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("declined_at")
    @ExcludeMissing
    fun _declinedAt(): JsonField<OffsetDateTime> = declinedAt

    /**
     * Returns the raw JSON value of [declinedTransactionId].
     *
     * Unlike [declinedTransactionId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("declined_transaction_id")
    @ExcludeMissing
    fun _declinedTransactionId(): JsonField<String> = declinedTransactionId

    /**
     * Returns the raw JSON value of [depositReturn].
     *
     * Unlike [depositReturn], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("deposit_return")
    @ExcludeMissing
    fun _depositReturn(): JsonField<DepositReturn> = depositReturn

    /**
     * Returns the raw JSON value of [frontImageFileId].
     *
     * Unlike [frontImageFileId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("front_image_file_id")
    @ExcludeMissing
    fun _frontImageFileId(): JsonField<String> = frontImageFileId

    /**
     * Returns the raw JSON value of [payeeNameAnalysis].
     *
     * Unlike [payeeNameAnalysis], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("payee_name_analysis")
    @ExcludeMissing
    fun _payeeNameAnalysis(): JsonField<PayeeNameAnalysis> = payeeNameAnalysis

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

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

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * If the Inbound Check Deposit was accepted, the
         * [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which this took
         * place.
         */
        fun acceptedAt(acceptedAt: OffsetDateTime?) = acceptedAt(JsonField.ofNullable(acceptedAt))

        /** Alias for calling [Builder.acceptedAt] with `acceptedAt.orElse(null)`. */
        fun acceptedAt(acceptedAt: Optional<OffsetDateTime>) = acceptedAt(acceptedAt.getOrNull())

        /**
         * Sets [Builder.acceptedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.acceptedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun acceptedAt(acceptedAt: JsonField<OffsetDateTime>) = apply {
            this.acceptedAt = acceptedAt
        }

        /** The Account the check is being deposited against. */
        fun accountId(accountId: String) = accountId(JsonField.of(accountId))

        /**
         * Sets [Builder.accountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

        /** The Account Number the check is being deposited against. */
        fun accountNumberId(accountNumberId: String?) =
            accountNumberId(JsonField.ofNullable(accountNumberId))

        /** Alias for calling [Builder.accountNumberId] with `accountNumberId.orElse(null)`. */
        fun accountNumberId(accountNumberId: Optional<String>) =
            accountNumberId(accountNumberId.getOrNull())

        /**
         * Sets [Builder.accountNumberId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountNumberId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun accountNumberId(accountNumberId: JsonField<String>) = apply {
            this.accountNumberId = accountNumberId
        }

        /**
         * If the deposit or the return was adjusted by the sending institution, this will contain
         * details of the adjustments.
         */
        fun adjustments(adjustments: List<Adjustment>) = adjustments(JsonField.of(adjustments))

        /**
         * Sets [Builder.adjustments] to an arbitrary JSON value.
         *
         * You should usually call [Builder.adjustments] with a well-typed `List<Adjustment>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun adjustments(adjustments: JsonField<List<Adjustment>>) = apply {
            this.adjustments = adjustments.map { it.toMutableList() }
        }

        /**
         * Adds a single [Adjustment] to [adjustments].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAdjustment(adjustment: Adjustment) = apply {
            adjustments =
                (adjustments ?: JsonField.of(mutableListOf())).also {
                    checkKnown("adjustments", it).add(adjustment)
                }
        }

        /** The deposited amount in USD cents. */
        fun amount(amount: Long) = amount(JsonField.of(amount))

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

        /** The ID for the File containing the image of the back of the check. */
        fun backImageFileId(backImageFileId: String?) =
            backImageFileId(JsonField.ofNullable(backImageFileId))

        /** Alias for calling [Builder.backImageFileId] with `backImageFileId.orElse(null)`. */
        fun backImageFileId(backImageFileId: Optional<String>) =
            backImageFileId(backImageFileId.getOrNull())

        /**
         * Sets [Builder.backImageFileId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.backImageFileId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
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
         * Alias for calling [Builder.bankOfFirstDepositRoutingNumber] with
         * `bankOfFirstDepositRoutingNumber.orElse(null)`.
         */
        fun bankOfFirstDepositRoutingNumber(bankOfFirstDepositRoutingNumber: Optional<String>) =
            bankOfFirstDepositRoutingNumber(bankOfFirstDepositRoutingNumber.getOrNull())

        /**
         * Sets [Builder.bankOfFirstDepositRoutingNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bankOfFirstDepositRoutingNumber] with a well-typed
         * [String] value instead. This method is primarily for setting the field to an undocumented
         * or not yet supported value.
         */
        fun bankOfFirstDepositRoutingNumber(bankOfFirstDepositRoutingNumber: JsonField<String>) =
            apply {
                this.bankOfFirstDepositRoutingNumber = bankOfFirstDepositRoutingNumber
            }

        /** The check number printed on the check being deposited. */
        fun checkNumber(checkNumber: String?) = checkNumber(JsonField.ofNullable(checkNumber))

        /** Alias for calling [Builder.checkNumber] with `checkNumber.orElse(null)`. */
        fun checkNumber(checkNumber: Optional<String>) = checkNumber(checkNumber.getOrNull())

        /**
         * Sets [Builder.checkNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.checkNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun checkNumber(checkNumber: JsonField<String>) = apply { this.checkNumber = checkNumber }

        /**
         * If this deposit is for an existing Check Transfer, the identifier of that Check Transfer.
         */
        fun checkTransferId(checkTransferId: String?) =
            checkTransferId(JsonField.ofNullable(checkTransferId))

        /** Alias for calling [Builder.checkTransferId] with `checkTransferId.orElse(null)`. */
        fun checkTransferId(checkTransferId: Optional<String>) =
            checkTransferId(checkTransferId.getOrNull())

        /**
         * Sets [Builder.checkTransferId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.checkTransferId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
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
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the deposit. */
        fun currency(currency: Currency) = currency(JsonField.of(currency))

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [Currency] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

        /**
         * If the Inbound Check Deposit was declined, the
         * [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which this took
         * place.
         */
        fun declinedAt(declinedAt: OffsetDateTime?) = declinedAt(JsonField.ofNullable(declinedAt))

        /** Alias for calling [Builder.declinedAt] with `declinedAt.orElse(null)`. */
        fun declinedAt(declinedAt: Optional<OffsetDateTime>) = declinedAt(declinedAt.getOrNull())

        /**
         * Sets [Builder.declinedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.declinedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
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
         * Alias for calling [Builder.declinedTransactionId] with
         * `declinedTransactionId.orElse(null)`.
         */
        fun declinedTransactionId(declinedTransactionId: Optional<String>) =
            declinedTransactionId(declinedTransactionId.getOrNull())

        /**
         * Sets [Builder.declinedTransactionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.declinedTransactionId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun declinedTransactionId(declinedTransactionId: JsonField<String>) = apply {
            this.declinedTransactionId = declinedTransactionId
        }

        /** If you requested a return of this deposit, this will contain details of the return. */
        fun depositReturn(depositReturn: DepositReturn?) =
            depositReturn(JsonField.ofNullable(depositReturn))

        /** Alias for calling [Builder.depositReturn] with `depositReturn.orElse(null)`. */
        fun depositReturn(depositReturn: Optional<DepositReturn>) =
            depositReturn(depositReturn.getOrNull())

        /**
         * Sets [Builder.depositReturn] to an arbitrary JSON value.
         *
         * You should usually call [Builder.depositReturn] with a well-typed [DepositReturn] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun depositReturn(depositReturn: JsonField<DepositReturn>) = apply {
            this.depositReturn = depositReturn
        }

        /** The ID for the File containing the image of the front of the check. */
        fun frontImageFileId(frontImageFileId: String?) =
            frontImageFileId(JsonField.ofNullable(frontImageFileId))

        /** Alias for calling [Builder.frontImageFileId] with `frontImageFileId.orElse(null)`. */
        fun frontImageFileId(frontImageFileId: Optional<String>) =
            frontImageFileId(frontImageFileId.getOrNull())

        /**
         * Sets [Builder.frontImageFileId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.frontImageFileId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
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
         * Sets [Builder.payeeNameAnalysis] to an arbitrary JSON value.
         *
         * You should usually call [Builder.payeeNameAnalysis] with a well-typed [PayeeNameAnalysis]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun payeeNameAnalysis(payeeNameAnalysis: JsonField<PayeeNameAnalysis>) = apply {
            this.payeeNameAnalysis = payeeNameAnalysis
        }

        /** The status of the Inbound Check Deposit. */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /**
         * If the deposit attempt has been accepted, the identifier of the Transaction object
         * created as a result of the successful deposit.
         */
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
         * `inbound_check_deposit`.
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
         * Returns an immutable instance of [InboundCheckDeposit].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
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
         *
         * @throws IllegalStateException if any required field is unset.
         */
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
                additionalProperties.toMutableMap(),
            )
    }

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
        currency().validate()
        declinedAt()
        declinedTransactionId()
        depositReturn().ifPresent { it.validate() }
        frontImageFileId()
        payeeNameAnalysis().validate()
        status().validate()
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
            (if (acceptedAt.asKnown().isPresent) 1 else 0) +
            (if (accountId.asKnown().isPresent) 1 else 0) +
            (if (accountNumberId.asKnown().isPresent) 1 else 0) +
            (adjustments.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (amount.asKnown().isPresent) 1 else 0) +
            (if (backImageFileId.asKnown().isPresent) 1 else 0) +
            (if (bankOfFirstDepositRoutingNumber.asKnown().isPresent) 1 else 0) +
            (if (checkNumber.asKnown().isPresent) 1 else 0) +
            (if (checkTransferId.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (currency.asKnown().getOrNull()?.validity() ?: 0) +
            (if (declinedAt.asKnown().isPresent) 1 else 0) +
            (if (declinedTransactionId.asKnown().isPresent) 1 else 0) +
            (depositReturn.asKnown().getOrNull()?.validity() ?: 0) +
            (if (frontImageFileId.asKnown().isPresent) 1 else 0) +
            (payeeNameAnalysis.asKnown().getOrNull()?.validity() ?: 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (transactionId.asKnown().isPresent) 1 else 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0)

    class Adjustment
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val adjustedAt: JsonField<OffsetDateTime>,
        private val amount: JsonField<Long>,
        private val reason: JsonField<Reason>,
        private val transactionId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("adjusted_at")
            @ExcludeMissing
            adjustedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("reason") @ExcludeMissing reason: JsonField<Reason> = JsonMissing.of(),
            @JsonProperty("transaction_id")
            @ExcludeMissing
            transactionId: JsonField<String> = JsonMissing.of(),
        ) : this(adjustedAt, amount, reason, transactionId, mutableMapOf())

        /**
         * The time at which the return adjustment was received.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun adjustedAt(): OffsetDateTime = adjustedAt.getRequired("adjusted_at")

        /**
         * The amount of the adjustment.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun amount(): Long = amount.getRequired("amount")

        /**
         * The reason for the adjustment.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun reason(): Reason = reason.getRequired("reason")

        /**
         * The id of the transaction for the adjustment.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun transactionId(): String = transactionId.getRequired("transaction_id")

        /**
         * Returns the raw JSON value of [adjustedAt].
         *
         * Unlike [adjustedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("adjusted_at")
        @ExcludeMissing
        fun _adjustedAt(): JsonField<OffsetDateTime> = adjustedAt

        /**
         * Returns the raw JSON value of [amount].
         *
         * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

        /**
         * Returns the raw JSON value of [reason].
         *
         * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<Reason> = reason

        /**
         * Returns the raw JSON value of [transactionId].
         *
         * Unlike [transactionId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("transaction_id")
        @ExcludeMissing
        fun _transactionId(): JsonField<String> = transactionId

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

            /**
             * Sets [Builder.adjustedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.adjustedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun adjustedAt(adjustedAt: JsonField<OffsetDateTime>) = apply {
                this.adjustedAt = adjustedAt
            }

            /** The amount of the adjustment. */
            fun amount(amount: Long) = amount(JsonField.of(amount))

            /**
             * Sets [Builder.amount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amount] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            /** The reason for the adjustment. */
            fun reason(reason: Reason) = reason(JsonField.of(reason))

            /**
             * Sets [Builder.reason] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reason] with a well-typed [Reason] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun reason(reason: JsonField<Reason>) = apply { this.reason = reason }

            /** The id of the transaction for the adjustment. */
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
             * Returns an immutable instance of [Adjustment].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .adjustedAt()
             * .amount()
             * .reason()
             * .transactionId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Adjustment =
                Adjustment(
                    checkRequired("adjustedAt", adjustedAt),
                    checkRequired("amount", amount),
                    checkRequired("reason", reason),
                    checkRequired("transactionId", transactionId),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Adjustment = apply {
            if (validated) {
                return@apply
            }

            adjustedAt()
            amount()
            reason().validate()
            transactionId()
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
            (if (adjustedAt.asKnown().isPresent) 1 else 0) +
                (if (amount.asKnown().isPresent) 1 else 0) +
                (reason.asKnown().getOrNull()?.validity() ?: 0) +
                (if (transactionId.asKnown().isPresent) 1 else 0)

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

                /** The check has already been deposited elsewhere and so this is a duplicate. */
                @JvmField val PAID = of("paid")

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
                /** The check has already been deposited elsewhere and so this is a duplicate. */
                PAID,
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
                /** The check has already been deposited elsewhere and so this is a duplicate. */
                PAID,
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
                    PAID -> Value.PAID
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
                    PAID -> Known.PAID
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

            private var validated: Boolean = false

            fun validate(): Reason = apply {
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

                return other is Reason && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Adjustment &&
                adjustedAt == other.adjustedAt &&
                amount == other.amount &&
                reason == other.reason &&
                transactionId == other.transactionId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(adjustedAt, amount, reason, transactionId, additionalProperties)
        }

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

    /** If you requested a return of this deposit, this will contain details of the return. */
    class DepositReturn
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val reason: JsonField<Reason>,
        private val returnedAt: JsonField<OffsetDateTime>,
        private val transactionId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("reason") @ExcludeMissing reason: JsonField<Reason> = JsonMissing.of(),
            @JsonProperty("returned_at")
            @ExcludeMissing
            returnedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("transaction_id")
            @ExcludeMissing
            transactionId: JsonField<String> = JsonMissing.of(),
        ) : this(reason, returnedAt, transactionId, mutableMapOf())

        /**
         * The reason the deposit was returned.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun reason(): Reason = reason.getRequired("reason")

        /**
         * The time at which the deposit was returned.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun returnedAt(): OffsetDateTime = returnedAt.getRequired("returned_at")

        /**
         * The id of the transaction for the returned deposit.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun transactionId(): String = transactionId.getRequired("transaction_id")

        /**
         * Returns the raw JSON value of [reason].
         *
         * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<Reason> = reason

        /**
         * Returns the raw JSON value of [returnedAt].
         *
         * Unlike [returnedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("returned_at")
        @ExcludeMissing
        fun _returnedAt(): JsonField<OffsetDateTime> = returnedAt

        /**
         * Returns the raw JSON value of [transactionId].
         *
         * Unlike [transactionId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("transaction_id")
        @ExcludeMissing
        fun _transactionId(): JsonField<String> = transactionId

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

            /**
             * Sets [Builder.reason] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reason] with a well-typed [Reason] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun reason(reason: JsonField<Reason>) = apply { this.reason = reason }

            /** The time at which the deposit was returned. */
            fun returnedAt(returnedAt: OffsetDateTime) = returnedAt(JsonField.of(returnedAt))

            /**
             * Sets [Builder.returnedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.returnedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun returnedAt(returnedAt: JsonField<OffsetDateTime>) = apply {
                this.returnedAt = returnedAt
            }

            /** The id of the transaction for the returned deposit. */
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
             * Returns an immutable instance of [DepositReturn].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .reason()
             * .returnedAt()
             * .transactionId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): DepositReturn =
                DepositReturn(
                    checkRequired("reason", reason),
                    checkRequired("returnedAt", returnedAt),
                    checkRequired("transactionId", transactionId),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): DepositReturn = apply {
            if (validated) {
                return@apply
            }

            reason().validate()
            returnedAt()
            transactionId()
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
            (reason.asKnown().getOrNull()?.validity() ?: 0) +
                (if (returnedAt.asKnown().isPresent) 1 else 0) +
                (if (transactionId.asKnown().isPresent) 1 else 0)

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

                /** The maker of the check requested its return. */
                @JvmField val REFER_TO_MAKER = of("refer_to_maker")

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
                /** The maker of the check requested its return. */
                REFER_TO_MAKER,
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
                /** The maker of the check requested its return. */
                REFER_TO_MAKER,
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
                    REFER_TO_MAKER -> Value.REFER_TO_MAKER
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
                    REFER_TO_MAKER -> Known.REFER_TO_MAKER
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

            private var validated: Boolean = false

            fun validate(): Reason = apply {
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

                return other is Reason && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is DepositReturn &&
                reason == other.reason &&
                returnedAt == other.returnedAt &&
                transactionId == other.transactionId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(reason, returnedAt, transactionId, additionalProperties)
        }

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

        private var validated: Boolean = false

        fun validate(): PayeeNameAnalysis = apply {
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

            return other is PayeeNameAnalysis && value == other.value
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

        return other is InboundCheckDeposit &&
            id == other.id &&
            acceptedAt == other.acceptedAt &&
            accountId == other.accountId &&
            accountNumberId == other.accountNumberId &&
            adjustments == other.adjustments &&
            amount == other.amount &&
            backImageFileId == other.backImageFileId &&
            bankOfFirstDepositRoutingNumber == other.bankOfFirstDepositRoutingNumber &&
            checkNumber == other.checkNumber &&
            checkTransferId == other.checkTransferId &&
            createdAt == other.createdAt &&
            currency == other.currency &&
            declinedAt == other.declinedAt &&
            declinedTransactionId == other.declinedTransactionId &&
            depositReturn == other.depositReturn &&
            frontImageFileId == other.frontImageFileId &&
            payeeNameAnalysis == other.payeeNameAnalysis &&
            status == other.status &&
            transactionId == other.transactionId &&
            type == other.type &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            acceptedAt,
            accountId,
            accountNumberId,
            adjustments,
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
            payeeNameAnalysis,
            status,
            transactionId,
            type,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InboundCheckDeposit{id=$id, acceptedAt=$acceptedAt, accountId=$accountId, accountNumberId=$accountNumberId, adjustments=$adjustments, amount=$amount, backImageFileId=$backImageFileId, bankOfFirstDepositRoutingNumber=$bankOfFirstDepositRoutingNumber, checkNumber=$checkNumber, checkTransferId=$checkTransferId, createdAt=$createdAt, currency=$currency, declinedAt=$declinedAt, declinedTransactionId=$declinedTransactionId, depositReturn=$depositReturn, frontImageFileId=$frontImageFileId, payeeNameAnalysis=$payeeNameAnalysis, status=$status, transactionId=$transactionId, type=$type, additionalProperties=$additionalProperties}"
}
