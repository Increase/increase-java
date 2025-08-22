// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.checkdeposits

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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Check Deposits allow you to deposit images of paper checks into your account. */
class CheckDeposit
private constructor(
    private val id: JsonField<String>,
    private val accountId: JsonField<String>,
    private val amount: JsonField<Long>,
    private val backImageFileId: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val depositAcceptance: JsonField<DepositAcceptance>,
    private val depositRejection: JsonField<DepositRejection>,
    private val depositReturn: JsonField<DepositReturn>,
    private val depositSubmission: JsonField<DepositSubmission>,
    private val description: JsonField<String>,
    private val frontImageFileId: JsonField<String>,
    private val idempotencyKey: JsonField<String>,
    private val inboundFundsHold: JsonField<InboundFundsHold>,
    private val inboundMailItemId: JsonField<String>,
    private val lockboxId: JsonField<String>,
    private val status: JsonField<Status>,
    private val transactionId: JsonField<String>,
    private val type: JsonField<Type>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("account_id") @ExcludeMissing accountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("back_image_file_id")
        @ExcludeMissing
        backImageFileId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("deposit_acceptance")
        @ExcludeMissing
        depositAcceptance: JsonField<DepositAcceptance> = JsonMissing.of(),
        @JsonProperty("deposit_rejection")
        @ExcludeMissing
        depositRejection: JsonField<DepositRejection> = JsonMissing.of(),
        @JsonProperty("deposit_return")
        @ExcludeMissing
        depositReturn: JsonField<DepositReturn> = JsonMissing.of(),
        @JsonProperty("deposit_submission")
        @ExcludeMissing
        depositSubmission: JsonField<DepositSubmission> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("front_image_file_id")
        @ExcludeMissing
        frontImageFileId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("idempotency_key")
        @ExcludeMissing
        idempotencyKey: JsonField<String> = JsonMissing.of(),
        @JsonProperty("inbound_funds_hold")
        @ExcludeMissing
        inboundFundsHold: JsonField<InboundFundsHold> = JsonMissing.of(),
        @JsonProperty("inbound_mail_item_id")
        @ExcludeMissing
        inboundMailItemId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("lockbox_id") @ExcludeMissing lockboxId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("transaction_id")
        @ExcludeMissing
        transactionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
    ) : this(
        id,
        accountId,
        amount,
        backImageFileId,
        createdAt,
        depositAcceptance,
        depositRejection,
        depositReturn,
        depositSubmission,
        description,
        frontImageFileId,
        idempotencyKey,
        inboundFundsHold,
        inboundMailItemId,
        lockboxId,
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
     * The Account the check was deposited into.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountId(): String = accountId.getRequired("account_id")

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
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the transfer
     * was created.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * If your deposit is successfully parsed and accepted by Increase, this will contain details of
     * the parsed check.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun depositAcceptance(): Optional<DepositAcceptance> =
        depositAcceptance.getOptional("deposit_acceptance")

    /**
     * If your deposit is rejected by Increase, this will contain details as to why it was rejected.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun depositRejection(): Optional<DepositRejection> =
        depositRejection.getOptional("deposit_rejection")

    /**
     * If your deposit is returned, this will contain details as to why it was returned.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun depositReturn(): Optional<DepositReturn> = depositReturn.getOptional("deposit_return")

    /**
     * After the check is parsed, it is submitted to the Check21 network for processing. This will
     * contain details of the submission.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun depositSubmission(): Optional<DepositSubmission> =
        depositSubmission.getOptional("deposit_submission")

    /**
     * The description of the Check Deposit, for display purposes only.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * The ID for the File containing the image of the front of the check.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun frontImageFileId(): String = frontImageFileId.getRequired("front_image_file_id")

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
     * Increase will sometimes hold the funds for Check Deposits. If funds are held, this sub-object
     * will contain details of the hold.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun inboundFundsHold(): Optional<InboundFundsHold> =
        inboundFundsHold.getOptional("inbound_funds_hold")

    /**
     * If the Check Deposit was the result of an Inbound Mail Item, this will contain the identifier
     * of the Inbound Mail Item.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun inboundMailItemId(): Optional<String> =
        inboundMailItemId.getOptional("inbound_mail_item_id")

    /**
     * If the Check Deposit was the result of an Inbound Mail Item, this will contain the identifier
     * of the Lockbox that received it.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lockboxId(): Optional<String> = lockboxId.getOptional("lockbox_id")

    /**
     * The status of the Check Deposit.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * The ID for the Transaction created by the deposit.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun transactionId(): Optional<String> = transactionId.getOptional("transaction_id")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `check_deposit`.
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
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [depositAcceptance].
     *
     * Unlike [depositAcceptance], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("deposit_acceptance")
    @ExcludeMissing
    fun _depositAcceptance(): JsonField<DepositAcceptance> = depositAcceptance

    /**
     * Returns the raw JSON value of [depositRejection].
     *
     * Unlike [depositRejection], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("deposit_rejection")
    @ExcludeMissing
    fun _depositRejection(): JsonField<DepositRejection> = depositRejection

    /**
     * Returns the raw JSON value of [depositReturn].
     *
     * Unlike [depositReturn], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("deposit_return")
    @ExcludeMissing
    fun _depositReturn(): JsonField<DepositReturn> = depositReturn

    /**
     * Returns the raw JSON value of [depositSubmission].
     *
     * Unlike [depositSubmission], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("deposit_submission")
    @ExcludeMissing
    fun _depositSubmission(): JsonField<DepositSubmission> = depositSubmission

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

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
     * Returns the raw JSON value of [idempotencyKey].
     *
     * Unlike [idempotencyKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idempotency_key")
    @ExcludeMissing
    fun _idempotencyKey(): JsonField<String> = idempotencyKey

    /**
     * Returns the raw JSON value of [inboundFundsHold].
     *
     * Unlike [inboundFundsHold], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("inbound_funds_hold")
    @ExcludeMissing
    fun _inboundFundsHold(): JsonField<InboundFundsHold> = inboundFundsHold

    /**
     * Returns the raw JSON value of [inboundMailItemId].
     *
     * Unlike [inboundMailItemId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("inbound_mail_item_id")
    @ExcludeMissing
    fun _inboundMailItemId(): JsonField<String> = inboundMailItemId

    /**
     * Returns the raw JSON value of [lockboxId].
     *
     * Unlike [lockboxId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lockbox_id") @ExcludeMissing fun _lockboxId(): JsonField<String> = lockboxId

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
         * Returns a mutable builder for constructing an instance of [CheckDeposit].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .accountId()
         * .amount()
         * .backImageFileId()
         * .createdAt()
         * .depositAcceptance()
         * .depositRejection()
         * .depositReturn()
         * .depositSubmission()
         * .description()
         * .frontImageFileId()
         * .idempotencyKey()
         * .inboundFundsHold()
         * .inboundMailItemId()
         * .lockboxId()
         * .status()
         * .transactionId()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CheckDeposit]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var accountId: JsonField<String>? = null
        private var amount: JsonField<Long>? = null
        private var backImageFileId: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var depositAcceptance: JsonField<DepositAcceptance>? = null
        private var depositRejection: JsonField<DepositRejection>? = null
        private var depositReturn: JsonField<DepositReturn>? = null
        private var depositSubmission: JsonField<DepositSubmission>? = null
        private var description: JsonField<String>? = null
        private var frontImageFileId: JsonField<String>? = null
        private var idempotencyKey: JsonField<String>? = null
        private var inboundFundsHold: JsonField<InboundFundsHold>? = null
        private var inboundMailItemId: JsonField<String>? = null
        private var lockboxId: JsonField<String>? = null
        private var status: JsonField<Status>? = null
        private var transactionId: JsonField<String>? = null
        private var type: JsonField<Type>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(checkDeposit: CheckDeposit) = apply {
            id = checkDeposit.id
            accountId = checkDeposit.accountId
            amount = checkDeposit.amount
            backImageFileId = checkDeposit.backImageFileId
            createdAt = checkDeposit.createdAt
            depositAcceptance = checkDeposit.depositAcceptance
            depositRejection = checkDeposit.depositRejection
            depositReturn = checkDeposit.depositReturn
            depositSubmission = checkDeposit.depositSubmission
            description = checkDeposit.description
            frontImageFileId = checkDeposit.frontImageFileId
            idempotencyKey = checkDeposit.idempotencyKey
            inboundFundsHold = checkDeposit.inboundFundsHold
            inboundMailItemId = checkDeposit.inboundMailItemId
            lockboxId = checkDeposit.lockboxId
            status = checkDeposit.status
            transactionId = checkDeposit.transactionId
            type = checkDeposit.type
            additionalProperties = checkDeposit.additionalProperties.toMutableMap()
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

        /** The Account the check was deposited into. */
        fun accountId(accountId: String) = accountId(JsonField.of(accountId))

        /**
         * Sets [Builder.accountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

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

        /**
         * If your deposit is successfully parsed and accepted by Increase, this will contain
         * details of the parsed check.
         */
        fun depositAcceptance(depositAcceptance: DepositAcceptance?) =
            depositAcceptance(JsonField.ofNullable(depositAcceptance))

        /** Alias for calling [Builder.depositAcceptance] with `depositAcceptance.orElse(null)`. */
        fun depositAcceptance(depositAcceptance: Optional<DepositAcceptance>) =
            depositAcceptance(depositAcceptance.getOrNull())

        /**
         * Sets [Builder.depositAcceptance] to an arbitrary JSON value.
         *
         * You should usually call [Builder.depositAcceptance] with a well-typed [DepositAcceptance]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun depositAcceptance(depositAcceptance: JsonField<DepositAcceptance>) = apply {
            this.depositAcceptance = depositAcceptance
        }

        /**
         * If your deposit is rejected by Increase, this will contain details as to why it was
         * rejected.
         */
        fun depositRejection(depositRejection: DepositRejection?) =
            depositRejection(JsonField.ofNullable(depositRejection))

        /** Alias for calling [Builder.depositRejection] with `depositRejection.orElse(null)`. */
        fun depositRejection(depositRejection: Optional<DepositRejection>) =
            depositRejection(depositRejection.getOrNull())

        /**
         * Sets [Builder.depositRejection] to an arbitrary JSON value.
         *
         * You should usually call [Builder.depositRejection] with a well-typed [DepositRejection]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun depositRejection(depositRejection: JsonField<DepositRejection>) = apply {
            this.depositRejection = depositRejection
        }

        /** If your deposit is returned, this will contain details as to why it was returned. */
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

        /**
         * After the check is parsed, it is submitted to the Check21 network for processing. This
         * will contain details of the submission.
         */
        fun depositSubmission(depositSubmission: DepositSubmission?) =
            depositSubmission(JsonField.ofNullable(depositSubmission))

        /** Alias for calling [Builder.depositSubmission] with `depositSubmission.orElse(null)`. */
        fun depositSubmission(depositSubmission: Optional<DepositSubmission>) =
            depositSubmission(depositSubmission.getOrNull())

        /**
         * Sets [Builder.depositSubmission] to an arbitrary JSON value.
         *
         * You should usually call [Builder.depositSubmission] with a well-typed [DepositSubmission]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun depositSubmission(depositSubmission: JsonField<DepositSubmission>) = apply {
            this.depositSubmission = depositSubmission
        }

        /** The description of the Check Deposit, for display purposes only. */
        fun description(description: String?) = description(JsonField.ofNullable(description))

        /** Alias for calling [Builder.description] with `description.orElse(null)`. */
        fun description(description: Optional<String>) = description(description.getOrNull())

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** The ID for the File containing the image of the front of the check. */
        fun frontImageFileId(frontImageFileId: String) =
            frontImageFileId(JsonField.of(frontImageFileId))

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
         * Increase will sometimes hold the funds for Check Deposits. If funds are held, this
         * sub-object will contain details of the hold.
         */
        fun inboundFundsHold(inboundFundsHold: InboundFundsHold?) =
            inboundFundsHold(JsonField.ofNullable(inboundFundsHold))

        /** Alias for calling [Builder.inboundFundsHold] with `inboundFundsHold.orElse(null)`. */
        fun inboundFundsHold(inboundFundsHold: Optional<InboundFundsHold>) =
            inboundFundsHold(inboundFundsHold.getOrNull())

        /**
         * Sets [Builder.inboundFundsHold] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inboundFundsHold] with a well-typed [InboundFundsHold]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun inboundFundsHold(inboundFundsHold: JsonField<InboundFundsHold>) = apply {
            this.inboundFundsHold = inboundFundsHold
        }

        /**
         * If the Check Deposit was the result of an Inbound Mail Item, this will contain the
         * identifier of the Inbound Mail Item.
         */
        fun inboundMailItemId(inboundMailItemId: String?) =
            inboundMailItemId(JsonField.ofNullable(inboundMailItemId))

        /** Alias for calling [Builder.inboundMailItemId] with `inboundMailItemId.orElse(null)`. */
        fun inboundMailItemId(inboundMailItemId: Optional<String>) =
            inboundMailItemId(inboundMailItemId.getOrNull())

        /**
         * Sets [Builder.inboundMailItemId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inboundMailItemId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun inboundMailItemId(inboundMailItemId: JsonField<String>) = apply {
            this.inboundMailItemId = inboundMailItemId
        }

        /**
         * If the Check Deposit was the result of an Inbound Mail Item, this will contain the
         * identifier of the Lockbox that received it.
         */
        fun lockboxId(lockboxId: String?) = lockboxId(JsonField.ofNullable(lockboxId))

        /** Alias for calling [Builder.lockboxId] with `lockboxId.orElse(null)`. */
        fun lockboxId(lockboxId: Optional<String>) = lockboxId(lockboxId.getOrNull())

        /**
         * Sets [Builder.lockboxId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lockboxId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun lockboxId(lockboxId: JsonField<String>) = apply { this.lockboxId = lockboxId }

        /** The status of the Check Deposit. */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** The ID for the Transaction created by the deposit. */
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
         * `check_deposit`.
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
            putAlladditional_properties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAlladditional_properties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAlladditional_properties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        /**
         * Returns an immutable instance of [CheckDeposit].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .accountId()
         * .amount()
         * .backImageFileId()
         * .createdAt()
         * .depositAcceptance()
         * .depositRejection()
         * .depositReturn()
         * .depositSubmission()
         * .description()
         * .frontImageFileId()
         * .idempotencyKey()
         * .inboundFundsHold()
         * .inboundMailItemId()
         * .lockboxId()
         * .status()
         * .transactionId()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CheckDeposit =
            CheckDeposit(
                checkRequired("id", id),
                checkRequired("accountId", accountId),
                checkRequired("amount", amount),
                checkRequired("backImageFileId", backImageFileId),
                checkRequired("createdAt", createdAt),
                checkRequired("depositAcceptance", depositAcceptance),
                checkRequired("depositRejection", depositRejection),
                checkRequired("depositReturn", depositReturn),
                checkRequired("depositSubmission", depositSubmission),
                checkRequired("description", description),
                checkRequired("frontImageFileId", frontImageFileId),
                checkRequired("idempotencyKey", idempotencyKey),
                checkRequired("inboundFundsHold", inboundFundsHold),
                checkRequired("inboundMailItemId", inboundMailItemId),
                checkRequired("lockboxId", lockboxId),
                checkRequired("status", status),
                checkRequired("transactionId", transactionId),
                checkRequired("type", type),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CheckDeposit = apply {
        if (validated) {
            return@apply
        }

        id()
        accountId()
        amount()
        backImageFileId()
        createdAt()
        depositAcceptance().ifPresent { it.validate() }
        depositRejection().ifPresent { it.validate() }
        depositReturn().ifPresent { it.validate() }
        depositSubmission().ifPresent { it.validate() }
        description()
        frontImageFileId()
        idempotencyKey()
        inboundFundsHold().ifPresent { it.validate() }
        inboundMailItemId()
        lockboxId()
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
            (if (accountId.asKnown().isPresent) 1 else 0) +
            (if (amount.asKnown().isPresent) 1 else 0) +
            (if (backImageFileId.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (depositAcceptance.asKnown().getOrNull()?.validity() ?: 0) +
            (depositRejection.asKnown().getOrNull()?.validity() ?: 0) +
            (depositReturn.asKnown().getOrNull()?.validity() ?: 0) +
            (depositSubmission.asKnown().getOrNull()?.validity() ?: 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (if (frontImageFileId.asKnown().isPresent) 1 else 0) +
            (if (idempotencyKey.asKnown().isPresent) 1 else 0) +
            (inboundFundsHold.asKnown().getOrNull()?.validity() ?: 0) +
            (if (inboundMailItemId.asKnown().isPresent) 1 else 0) +
            (if (lockboxId.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (transactionId.asKnown().isPresent) 1 else 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0)

    /**
     * If your deposit is successfully parsed and accepted by Increase, this will contain details of
     * the parsed check.
     */
    class DepositAcceptance
    private constructor(
        private val accountNumber: JsonField<String>,
        private val amount: JsonField<Long>,
        private val auxiliaryOnUs: JsonField<String>,
        private val checkDepositId: JsonField<String>,
        private val currency: JsonField<Currency>,
        private val routingNumber: JsonField<String>,
        private val serialNumber: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("account_number")
            @ExcludeMissing
            accountNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("auxiliary_on_us")
            @ExcludeMissing
            auxiliaryOnUs: JsonField<String> = JsonMissing.of(),
            @JsonProperty("check_deposit_id")
            @ExcludeMissing
            checkDepositId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("currency")
            @ExcludeMissing
            currency: JsonField<Currency> = JsonMissing.of(),
            @JsonProperty("routing_number")
            @ExcludeMissing
            routingNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("serial_number")
            @ExcludeMissing
            serialNumber: JsonField<String> = JsonMissing.of(),
        ) : this(
            accountNumber,
            amount,
            auxiliaryOnUs,
            checkDepositId,
            currency,
            routingNumber,
            serialNumber,
            mutableMapOf(),
        )

        /**
         * The account number printed on the check.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun accountNumber(): String = accountNumber.getRequired("account_number")

        /**
         * The amount to be deposited in the minor unit of the transaction's currency. For dollars,
         * for example, this is cents.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun amount(): Long = amount.getRequired("amount")

        /**
         * An additional line of metadata printed on the check. This typically includes the check
         * number for business checks.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun auxiliaryOnUs(): Optional<String> = auxiliaryOnUs.getOptional("auxiliary_on_us")

        /**
         * The ID of the Check Deposit that was accepted.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun checkDepositId(): String = checkDepositId.getRequired("check_deposit_id")

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
         * currency.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun currency(): Currency = currency.getRequired("currency")

        /**
         * The routing number printed on the check.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun routingNumber(): String = routingNumber.getRequired("routing_number")

        /**
         * The check serial number, if present, for consumer checks. For business checks, the serial
         * number is usually in the `auxiliary_on_us` field.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun serialNumber(): Optional<String> = serialNumber.getOptional("serial_number")

        /**
         * Returns the raw JSON value of [accountNumber].
         *
         * Unlike [accountNumber], this method doesn't throw if the JSON field has an unexpected
         * type.
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
         * Returns the raw JSON value of [auxiliaryOnUs].
         *
         * Unlike [auxiliaryOnUs], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("auxiliary_on_us")
        @ExcludeMissing
        fun _auxiliaryOnUs(): JsonField<String> = auxiliaryOnUs

        /**
         * Returns the raw JSON value of [checkDepositId].
         *
         * Unlike [checkDepositId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("check_deposit_id")
        @ExcludeMissing
        fun _checkDepositId(): JsonField<String> = checkDepositId

        /**
         * Returns the raw JSON value of [currency].
         *
         * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<Currency> = currency

        /**
         * Returns the raw JSON value of [routingNumber].
         *
         * Unlike [routingNumber], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("routing_number")
        @ExcludeMissing
        fun _routingNumber(): JsonField<String> = routingNumber

        /**
         * Returns the raw JSON value of [serialNumber].
         *
         * Unlike [serialNumber], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("serial_number")
        @ExcludeMissing
        fun _serialNumber(): JsonField<String> = serialNumber

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
             * Returns a mutable builder for constructing an instance of [DepositAcceptance].
             *
             * The following fields are required:
             * ```java
             * .accountNumber()
             * .amount()
             * .auxiliaryOnUs()
             * .checkDepositId()
             * .currency()
             * .routingNumber()
             * .serialNumber()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [DepositAcceptance]. */
        class Builder internal constructor() {

            private var accountNumber: JsonField<String>? = null
            private var amount: JsonField<Long>? = null
            private var auxiliaryOnUs: JsonField<String>? = null
            private var checkDepositId: JsonField<String>? = null
            private var currency: JsonField<Currency>? = null
            private var routingNumber: JsonField<String>? = null
            private var serialNumber: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(depositAcceptance: DepositAcceptance) = apply {
                accountNumber = depositAcceptance.accountNumber
                amount = depositAcceptance.amount
                auxiliaryOnUs = depositAcceptance.auxiliaryOnUs
                checkDepositId = depositAcceptance.checkDepositId
                currency = depositAcceptance.currency
                routingNumber = depositAcceptance.routingNumber
                serialNumber = depositAcceptance.serialNumber
                additionalProperties = depositAcceptance.additionalProperties.toMutableMap()
            }

            /** The account number printed on the check. */
            fun accountNumber(accountNumber: String) = accountNumber(JsonField.of(accountNumber))

            /**
             * Sets [Builder.accountNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun accountNumber(accountNumber: JsonField<String>) = apply {
                this.accountNumber = accountNumber
            }

            /**
             * The amount to be deposited in the minor unit of the transaction's currency. For
             * dollars, for example, this is cents.
             */
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
             * An additional line of metadata printed on the check. This typically includes the
             * check number for business checks.
             */
            fun auxiliaryOnUs(auxiliaryOnUs: String?) =
                auxiliaryOnUs(JsonField.ofNullable(auxiliaryOnUs))

            /** Alias for calling [Builder.auxiliaryOnUs] with `auxiliaryOnUs.orElse(null)`. */
            fun auxiliaryOnUs(auxiliaryOnUs: Optional<String>) =
                auxiliaryOnUs(auxiliaryOnUs.getOrNull())

            /**
             * Sets [Builder.auxiliaryOnUs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.auxiliaryOnUs] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun auxiliaryOnUs(auxiliaryOnUs: JsonField<String>) = apply {
                this.auxiliaryOnUs = auxiliaryOnUs
            }

            /** The ID of the Check Deposit that was accepted. */
            fun checkDepositId(checkDepositId: String) =
                checkDepositId(JsonField.of(checkDepositId))

            /**
             * Sets [Builder.checkDepositId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.checkDepositId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun checkDepositId(checkDepositId: JsonField<String>) = apply {
                this.checkDepositId = checkDepositId
            }

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
             * currency.
             */
            fun currency(currency: Currency) = currency(JsonField.of(currency))

            /**
             * Sets [Builder.currency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currency] with a well-typed [Currency] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

            /** The routing number printed on the check. */
            fun routingNumber(routingNumber: String) = routingNumber(JsonField.of(routingNumber))

            /**
             * Sets [Builder.routingNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.routingNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun routingNumber(routingNumber: JsonField<String>) = apply {
                this.routingNumber = routingNumber
            }

            /**
             * The check serial number, if present, for consumer checks. For business checks, the
             * serial number is usually in the `auxiliary_on_us` field.
             */
            fun serialNumber(serialNumber: String?) =
                serialNumber(JsonField.ofNullable(serialNumber))

            /** Alias for calling [Builder.serialNumber] with `serialNumber.orElse(null)`. */
            fun serialNumber(serialNumber: Optional<String>) =
                serialNumber(serialNumber.getOrNull())

            /**
             * Sets [Builder.serialNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.serialNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun serialNumber(serialNumber: JsonField<String>) = apply {
                this.serialNumber = serialNumber
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAlladditional_properties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAlladditional_properties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAlladditional_properties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [DepositAcceptance].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .accountNumber()
             * .amount()
             * .auxiliaryOnUs()
             * .checkDepositId()
             * .currency()
             * .routingNumber()
             * .serialNumber()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): DepositAcceptance =
                DepositAcceptance(
                    checkRequired("accountNumber", accountNumber),
                    checkRequired("amount", amount),
                    checkRequired("auxiliaryOnUs", auxiliaryOnUs),
                    checkRequired("checkDepositId", checkDepositId),
                    checkRequired("currency", currency),
                    checkRequired("routingNumber", routingNumber),
                    checkRequired("serialNumber", serialNumber),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): DepositAcceptance = apply {
            if (validated) {
                return@apply
            }

            accountNumber()
            amount()
            auxiliaryOnUs()
            checkDepositId()
            currency().validate()
            routingNumber()
            serialNumber()
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
            (if (accountNumber.asKnown().isPresent) 1 else 0) +
                (if (amount.asKnown().isPresent) 1 else 0) +
                (if (auxiliaryOnUs.asKnown().isPresent) 1 else 0) +
                (if (checkDepositId.asKnown().isPresent) 1 else 0) +
                (currency.asKnown().getOrNull()?.validity() ?: 0) +
                (if (routingNumber.asKnown().isPresent) 1 else 0) +
                (if (serialNumber.asKnown().isPresent) 1 else 0)

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
         * currency.
         */
        class Currency @JsonCreator private constructor(private val value: JsonField<String>) :
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
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
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
                /**
                 * An enum member indicating that [Currency] was instantiated with an unknown value.
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
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is DepositAcceptance &&
                accountNumber == other.accountNumber &&
                amount == other.amount &&
                auxiliaryOnUs == other.auxiliaryOnUs &&
                checkDepositId == other.checkDepositId &&
                currency == other.currency &&
                routingNumber == other.routingNumber &&
                serialNumber == other.serialNumber &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                accountNumber,
                amount,
                auxiliaryOnUs,
                checkDepositId,
                currency,
                routingNumber,
                serialNumber,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "DepositAcceptance{accountNumber=$accountNumber, amount=$amount, auxiliaryOnUs=$auxiliaryOnUs, checkDepositId=$checkDepositId, currency=$currency, routingNumber=$routingNumber, serialNumber=$serialNumber, additionalProperties=$additionalProperties}"
    }

    /**
     * If your deposit is rejected by Increase, this will contain details as to why it was rejected.
     */
    class DepositRejection
    private constructor(
        private val amount: JsonField<Long>,
        private val checkDepositId: JsonField<String>,
        private val currency: JsonField<Currency>,
        private val declinedTransactionId: JsonField<String>,
        private val reason: JsonField<Reason>,
        private val rejectedAt: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("check_deposit_id")
            @ExcludeMissing
            checkDepositId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("currency")
            @ExcludeMissing
            currency: JsonField<Currency> = JsonMissing.of(),
            @JsonProperty("declined_transaction_id")
            @ExcludeMissing
            declinedTransactionId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("reason") @ExcludeMissing reason: JsonField<Reason> = JsonMissing.of(),
            @JsonProperty("rejected_at")
            @ExcludeMissing
            rejectedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(
            amount,
            checkDepositId,
            currency,
            declinedTransactionId,
            reason,
            rejectedAt,
            mutableMapOf(),
        )

        /**
         * The rejected amount in the minor unit of check's currency. For dollars, for example, this
         * is cents.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun amount(): Long = amount.getRequired("amount")

        /**
         * The identifier of the Check Deposit that was rejected.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun checkDepositId(): String = checkDepositId.getRequired("check_deposit_id")

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the check's currency.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun currency(): Currency = currency.getRequired("currency")

        /**
         * The identifier of the associated declined transaction.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun declinedTransactionId(): String =
            declinedTransactionId.getRequired("declined_transaction_id")

        /**
         * Why the check deposit was rejected.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun reason(): Reason = reason.getRequired("reason")

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the check
         * deposit was rejected.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun rejectedAt(): OffsetDateTime = rejectedAt.getRequired("rejected_at")

        /**
         * Returns the raw JSON value of [amount].
         *
         * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

        /**
         * Returns the raw JSON value of [checkDepositId].
         *
         * Unlike [checkDepositId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("check_deposit_id")
        @ExcludeMissing
        fun _checkDepositId(): JsonField<String> = checkDepositId

        /**
         * Returns the raw JSON value of [currency].
         *
         * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<Currency> = currency

        /**
         * Returns the raw JSON value of [declinedTransactionId].
         *
         * Unlike [declinedTransactionId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("declined_transaction_id")
        @ExcludeMissing
        fun _declinedTransactionId(): JsonField<String> = declinedTransactionId

        /**
         * Returns the raw JSON value of [reason].
         *
         * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<Reason> = reason

        /**
         * Returns the raw JSON value of [rejectedAt].
         *
         * Unlike [rejectedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("rejected_at")
        @ExcludeMissing
        fun _rejectedAt(): JsonField<OffsetDateTime> = rejectedAt

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
             * Returns a mutable builder for constructing an instance of [DepositRejection].
             *
             * The following fields are required:
             * ```java
             * .amount()
             * .checkDepositId()
             * .currency()
             * .declinedTransactionId()
             * .reason()
             * .rejectedAt()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [DepositRejection]. */
        class Builder internal constructor() {

            private var amount: JsonField<Long>? = null
            private var checkDepositId: JsonField<String>? = null
            private var currency: JsonField<Currency>? = null
            private var declinedTransactionId: JsonField<String>? = null
            private var reason: JsonField<Reason>? = null
            private var rejectedAt: JsonField<OffsetDateTime>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(depositRejection: DepositRejection) = apply {
                amount = depositRejection.amount
                checkDepositId = depositRejection.checkDepositId
                currency = depositRejection.currency
                declinedTransactionId = depositRejection.declinedTransactionId
                reason = depositRejection.reason
                rejectedAt = depositRejection.rejectedAt
                additionalProperties = depositRejection.additionalProperties.toMutableMap()
            }

            /**
             * The rejected amount in the minor unit of check's currency. For dollars, for example,
             * this is cents.
             */
            fun amount(amount: Long) = amount(JsonField.of(amount))

            /**
             * Sets [Builder.amount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amount] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            /** The identifier of the Check Deposit that was rejected. */
            fun checkDepositId(checkDepositId: String) =
                checkDepositId(JsonField.of(checkDepositId))

            /**
             * Sets [Builder.checkDepositId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.checkDepositId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun checkDepositId(checkDepositId: JsonField<String>) = apply {
                this.checkDepositId = checkDepositId
            }

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the check's currency.
             */
            fun currency(currency: Currency) = currency(JsonField.of(currency))

            /**
             * Sets [Builder.currency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currency] with a well-typed [Currency] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

            /** The identifier of the associated declined transaction. */
            fun declinedTransactionId(declinedTransactionId: String) =
                declinedTransactionId(JsonField.of(declinedTransactionId))

            /**
             * Sets [Builder.declinedTransactionId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.declinedTransactionId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun declinedTransactionId(declinedTransactionId: JsonField<String>) = apply {
                this.declinedTransactionId = declinedTransactionId
            }

            /** Why the check deposit was rejected. */
            fun reason(reason: Reason) = reason(JsonField.of(reason))

            /**
             * Sets [Builder.reason] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reason] with a well-typed [Reason] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun reason(reason: JsonField<Reason>) = apply { this.reason = reason }

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * check deposit was rejected.
             */
            fun rejectedAt(rejectedAt: OffsetDateTime) = rejectedAt(JsonField.of(rejectedAt))

            /**
             * Sets [Builder.rejectedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rejectedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun rejectedAt(rejectedAt: JsonField<OffsetDateTime>) = apply {
                this.rejectedAt = rejectedAt
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAlladditional_properties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAlladditional_properties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAlladditional_properties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [DepositRejection].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .amount()
             * .checkDepositId()
             * .currency()
             * .declinedTransactionId()
             * .reason()
             * .rejectedAt()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): DepositRejection =
                DepositRejection(
                    checkRequired("amount", amount),
                    checkRequired("checkDepositId", checkDepositId),
                    checkRequired("currency", currency),
                    checkRequired("declinedTransactionId", declinedTransactionId),
                    checkRequired("reason", reason),
                    checkRequired("rejectedAt", rejectedAt),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): DepositRejection = apply {
            if (validated) {
                return@apply
            }

            amount()
            checkDepositId()
            currency().validate()
            declinedTransactionId()
            reason().validate()
            rejectedAt()
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
                (if (checkDepositId.asKnown().isPresent) 1 else 0) +
                (currency.asKnown().getOrNull()?.validity() ?: 0) +
                (if (declinedTransactionId.asKnown().isPresent) 1 else 0) +
                (reason.asKnown().getOrNull()?.validity() ?: 0) +
                (if (rejectedAt.asKnown().isPresent) 1 else 0)

        /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the check's currency. */
        class Currency @JsonCreator private constructor(private val value: JsonField<String>) :
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
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
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
                /**
                 * An enum member indicating that [Currency] was instantiated with an unknown value.
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
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
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

        /** Why the check deposit was rejected. */
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

                /** The check's image is incomplete. */
                @JvmField val INCOMPLETE_IMAGE = of("incomplete_image")

                /** This is a duplicate check submission. */
                @JvmField val DUPLICATE = of("duplicate")

                /** This check has poor image quality. */
                @JvmField val POOR_IMAGE_QUALITY = of("poor_image_quality")

                /** The check was deposited with the incorrect amount. */
                @JvmField val INCORRECT_AMOUNT = of("incorrect_amount")

                /** The check is made out to someone other than the account holder. */
                @JvmField val INCORRECT_RECIPIENT = of("incorrect_recipient")

                /** This check was not eligible for mobile deposit. */
                @JvmField
                val NOT_ELIGIBLE_FOR_MOBILE_DEPOSIT = of("not_eligible_for_mobile_deposit")

                /** This check is missing at least one required field. */
                @JvmField val MISSING_REQUIRED_DATA_ELEMENTS = of("missing_required_data_elements")

                /** This check is suspected to be fraudulent. */
                @JvmField val SUSPECTED_FRAUD = of("suspected_fraud")

                /** This check's deposit window has expired. */
                @JvmField val DEPOSIT_WINDOW_EXPIRED = of("deposit_window_expired")

                /** The check was rejected at the user's request. */
                @JvmField val REQUESTED_BY_USER = of("requested_by_user")

                /** The check was rejected for an unknown reason. */
                @JvmField val UNKNOWN = of("unknown")

                @JvmStatic fun of(value: String) = Reason(JsonField.of(value))
            }

            /** An enum containing [Reason]'s known values. */
            enum class Known {
                /** The check's image is incomplete. */
                INCOMPLETE_IMAGE,
                /** This is a duplicate check submission. */
                DUPLICATE,
                /** This check has poor image quality. */
                POOR_IMAGE_QUALITY,
                /** The check was deposited with the incorrect amount. */
                INCORRECT_AMOUNT,
                /** The check is made out to someone other than the account holder. */
                INCORRECT_RECIPIENT,
                /** This check was not eligible for mobile deposit. */
                NOT_ELIGIBLE_FOR_MOBILE_DEPOSIT,
                /** This check is missing at least one required field. */
                MISSING_REQUIRED_DATA_ELEMENTS,
                /** This check is suspected to be fraudulent. */
                SUSPECTED_FRAUD,
                /** This check's deposit window has expired. */
                DEPOSIT_WINDOW_EXPIRED,
                /** The check was rejected at the user's request. */
                REQUESTED_BY_USER,
                /** The check was rejected for an unknown reason. */
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
                /** The check's image is incomplete. */
                INCOMPLETE_IMAGE,
                /** This is a duplicate check submission. */
                DUPLICATE,
                /** This check has poor image quality. */
                POOR_IMAGE_QUALITY,
                /** The check was deposited with the incorrect amount. */
                INCORRECT_AMOUNT,
                /** The check is made out to someone other than the account holder. */
                INCORRECT_RECIPIENT,
                /** This check was not eligible for mobile deposit. */
                NOT_ELIGIBLE_FOR_MOBILE_DEPOSIT,
                /** This check is missing at least one required field. */
                MISSING_REQUIRED_DATA_ELEMENTS,
                /** This check is suspected to be fraudulent. */
                SUSPECTED_FRAUD,
                /** This check's deposit window has expired. */
                DEPOSIT_WINDOW_EXPIRED,
                /** The check was rejected at the user's request. */
                REQUESTED_BY_USER,
                /** The check was rejected for an unknown reason. */
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
                    INCOMPLETE_IMAGE -> Value.INCOMPLETE_IMAGE
                    DUPLICATE -> Value.DUPLICATE
                    POOR_IMAGE_QUALITY -> Value.POOR_IMAGE_QUALITY
                    INCORRECT_AMOUNT -> Value.INCORRECT_AMOUNT
                    INCORRECT_RECIPIENT -> Value.INCORRECT_RECIPIENT
                    NOT_ELIGIBLE_FOR_MOBILE_DEPOSIT -> Value.NOT_ELIGIBLE_FOR_MOBILE_DEPOSIT
                    MISSING_REQUIRED_DATA_ELEMENTS -> Value.MISSING_REQUIRED_DATA_ELEMENTS
                    SUSPECTED_FRAUD -> Value.SUSPECTED_FRAUD
                    DEPOSIT_WINDOW_EXPIRED -> Value.DEPOSIT_WINDOW_EXPIRED
                    REQUESTED_BY_USER -> Value.REQUESTED_BY_USER
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
                    INCOMPLETE_IMAGE -> Known.INCOMPLETE_IMAGE
                    DUPLICATE -> Known.DUPLICATE
                    POOR_IMAGE_QUALITY -> Known.POOR_IMAGE_QUALITY
                    INCORRECT_AMOUNT -> Known.INCORRECT_AMOUNT
                    INCORRECT_RECIPIENT -> Known.INCORRECT_RECIPIENT
                    NOT_ELIGIBLE_FOR_MOBILE_DEPOSIT -> Known.NOT_ELIGIBLE_FOR_MOBILE_DEPOSIT
                    MISSING_REQUIRED_DATA_ELEMENTS -> Known.MISSING_REQUIRED_DATA_ELEMENTS
                    SUSPECTED_FRAUD -> Known.SUSPECTED_FRAUD
                    DEPOSIT_WINDOW_EXPIRED -> Known.DEPOSIT_WINDOW_EXPIRED
                    REQUESTED_BY_USER -> Known.REQUESTED_BY_USER
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

            return other is DepositRejection &&
                amount == other.amount &&
                checkDepositId == other.checkDepositId &&
                currency == other.currency &&
                declinedTransactionId == other.declinedTransactionId &&
                reason == other.reason &&
                rejectedAt == other.rejectedAt &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                amount,
                checkDepositId,
                currency,
                declinedTransactionId,
                reason,
                rejectedAt,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "DepositRejection{amount=$amount, checkDepositId=$checkDepositId, currency=$currency, declinedTransactionId=$declinedTransactionId, reason=$reason, rejectedAt=$rejectedAt, additionalProperties=$additionalProperties}"
    }

    /** If your deposit is returned, this will contain details as to why it was returned. */
    class DepositReturn
    private constructor(
        private val amount: JsonField<Long>,
        private val checkDepositId: JsonField<String>,
        private val currency: JsonField<Currency>,
        private val returnReason: JsonField<ReturnReason>,
        private val returnedAt: JsonField<OffsetDateTime>,
        private val transactionId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("check_deposit_id")
            @ExcludeMissing
            checkDepositId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("currency")
            @ExcludeMissing
            currency: JsonField<Currency> = JsonMissing.of(),
            @JsonProperty("return_reason")
            @ExcludeMissing
            returnReason: JsonField<ReturnReason> = JsonMissing.of(),
            @JsonProperty("returned_at")
            @ExcludeMissing
            returnedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("transaction_id")
            @ExcludeMissing
            transactionId: JsonField<String> = JsonMissing.of(),
        ) : this(
            amount,
            checkDepositId,
            currency,
            returnReason,
            returnedAt,
            transactionId,
            mutableMapOf(),
        )

        /**
         * The returned amount in USD cents.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun amount(): Long = amount.getRequired("amount")

        /**
         * The identifier of the Check Deposit that was returned.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun checkDepositId(): String = checkDepositId.getRequired("check_deposit_id")

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
         * currency.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun currency(): Currency = currency.getRequired("currency")

        /**
         * Why this check was returned by the bank holding the account it was drawn against.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun returnReason(): ReturnReason = returnReason.getRequired("return_reason")

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the check
         * deposit was returned.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun returnedAt(): OffsetDateTime = returnedAt.getRequired("returned_at")

        /**
         * The identifier of the transaction that reversed the original check deposit transaction.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun transactionId(): String = transactionId.getRequired("transaction_id")

        /**
         * Returns the raw JSON value of [amount].
         *
         * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

        /**
         * Returns the raw JSON value of [checkDepositId].
         *
         * Unlike [checkDepositId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("check_deposit_id")
        @ExcludeMissing
        fun _checkDepositId(): JsonField<String> = checkDepositId

        /**
         * Returns the raw JSON value of [currency].
         *
         * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<Currency> = currency

        /**
         * Returns the raw JSON value of [returnReason].
         *
         * Unlike [returnReason], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("return_reason")
        @ExcludeMissing
        fun _returnReason(): JsonField<ReturnReason> = returnReason

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
             * .amount()
             * .checkDepositId()
             * .currency()
             * .returnReason()
             * .returnedAt()
             * .transactionId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [DepositReturn]. */
        class Builder internal constructor() {

            private var amount: JsonField<Long>? = null
            private var checkDepositId: JsonField<String>? = null
            private var currency: JsonField<Currency>? = null
            private var returnReason: JsonField<ReturnReason>? = null
            private var returnedAt: JsonField<OffsetDateTime>? = null
            private var transactionId: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(depositReturn: DepositReturn) = apply {
                amount = depositReturn.amount
                checkDepositId = depositReturn.checkDepositId
                currency = depositReturn.currency
                returnReason = depositReturn.returnReason
                returnedAt = depositReturn.returnedAt
                transactionId = depositReturn.transactionId
                additionalProperties = depositReturn.additionalProperties.toMutableMap()
            }

            /** The returned amount in USD cents. */
            fun amount(amount: Long) = amount(JsonField.of(amount))

            /**
             * Sets [Builder.amount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amount] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            /** The identifier of the Check Deposit that was returned. */
            fun checkDepositId(checkDepositId: String) =
                checkDepositId(JsonField.of(checkDepositId))

            /**
             * Sets [Builder.checkDepositId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.checkDepositId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun checkDepositId(checkDepositId: JsonField<String>) = apply {
                this.checkDepositId = checkDepositId
            }

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
             * currency.
             */
            fun currency(currency: Currency) = currency(JsonField.of(currency))

            /**
             * Sets [Builder.currency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currency] with a well-typed [Currency] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

            /** Why this check was returned by the bank holding the account it was drawn against. */
            fun returnReason(returnReason: ReturnReason) = returnReason(JsonField.of(returnReason))

            /**
             * Sets [Builder.returnReason] to an arbitrary JSON value.
             *
             * You should usually call [Builder.returnReason] with a well-typed [ReturnReason] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun returnReason(returnReason: JsonField<ReturnReason>) = apply {
                this.returnReason = returnReason
            }

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * check deposit was returned.
             */
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

            /**
             * The identifier of the transaction that reversed the original check deposit
             * transaction.
             */
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
                putAlladditional_properties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAlladditional_properties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAlladditional_properties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [DepositReturn].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .amount()
             * .checkDepositId()
             * .currency()
             * .returnReason()
             * .returnedAt()
             * .transactionId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): DepositReturn =
                DepositReturn(
                    checkRequired("amount", amount),
                    checkRequired("checkDepositId", checkDepositId),
                    checkRequired("currency", currency),
                    checkRequired("returnReason", returnReason),
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

            amount()
            checkDepositId()
            currency().validate()
            returnReason().validate()
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
            (if (amount.asKnown().isPresent) 1 else 0) +
                (if (checkDepositId.asKnown().isPresent) 1 else 0) +
                (currency.asKnown().getOrNull()?.validity() ?: 0) +
                (returnReason.asKnown().getOrNull()?.validity() ?: 0) +
                (if (returnedAt.asKnown().isPresent) 1 else 0) +
                (if (transactionId.asKnown().isPresent) 1 else 0)

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
         * currency.
         */
        class Currency @JsonCreator private constructor(private val value: JsonField<String>) :
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
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
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
                /**
                 * An enum member indicating that [Currency] was instantiated with an unknown value.
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
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
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

        /** Why this check was returned by the bank holding the account it was drawn against. */
        class ReturnReason @JsonCreator private constructor(private val value: JsonField<String>) :
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

                /** The check doesn't allow ACH conversion. */
                @JvmField val ACH_CONVERSION_NOT_SUPPORTED = of("ach_conversion_not_supported")

                /** The account is closed. (Check21 return code `D`) */
                @JvmField val CLOSED_ACCOUNT = of("closed_account")

                /** The check has already been deposited. (Check21 return code `Y`) */
                @JvmField val DUPLICATE_SUBMISSION = of("duplicate_submission")

                /** Insufficient funds (Check21 return code `A`) */
                @JvmField val INSUFFICIENT_FUNDS = of("insufficient_funds")

                /** No account was found matching the check details. (Check21 return code `E`) */
                @JvmField val NO_ACCOUNT = of("no_account")

                /** The check was not authorized. (Check21 return code `Q`) */
                @JvmField val NOT_AUTHORIZED = of("not_authorized")

                /** The check is too old. (Check21 return code `G`) */
                @JvmField val STALE_DATED = of("stale_dated")

                /** The payment has been stopped by the account holder. (Check21 return code `C`) */
                @JvmField val STOP_PAYMENT = of("stop_payment")

                /** The reason for the return is unknown. */
                @JvmField val UNKNOWN_REASON = of("unknown_reason")

                /** The image doesn't match the details submitted. */
                @JvmField val UNMATCHED_DETAILS = of("unmatched_details")

                /** The image could not be read. (Check21 return code `U`) */
                @JvmField val UNREADABLE_IMAGE = of("unreadable_image")

                /** The check endorsement was irregular. (Check21 return code `J`) */
                @JvmField val ENDORSEMENT_IRREGULAR = of("endorsement_irregular")

                /** The check present was either altered or fake. (Check21 return code `N`) */
                @JvmField val ALTERED_OR_FICTITIOUS_ITEM = of("altered_or_fictitious_item")

                /** The account this check is drawn on is frozen. (Check21 return code `F`) */
                @JvmField val FROZEN_OR_BLOCKED_ACCOUNT = of("frozen_or_blocked_account")

                /** The check is post dated. (Check21 return code `H`) */
                @JvmField val POST_DATED = of("post_dated")

                /** The endorsement was missing. (Check21 return code `I`) */
                @JvmField val ENDORSEMENT_MISSING = of("endorsement_missing")

                /** The check signature was missing. (Check21 return code `K`) */
                @JvmField val SIGNATURE_MISSING = of("signature_missing")

                /** The bank suspects a stop payment will be placed. (Check21 return code `T`) */
                @JvmField val STOP_PAYMENT_SUSPECT = of("stop_payment_suspect")

                /** The bank cannot read the image. (Check21 return code `U`) */
                @JvmField val UNUSABLE_IMAGE = of("unusable_image")

                /** The check image fails the bank's security check. (Check21 return code `V`) */
                @JvmField val IMAGE_FAILS_SECURITY_CHECK = of("image_fails_security_check")

                /** The bank cannot determine the amount. (Check21 return code `W`) */
                @JvmField val CANNOT_DETERMINE_AMOUNT = of("cannot_determine_amount")

                /**
                 * The signature is inconsistent with prior signatures. (Check21 return code `L`)
                 */
                @JvmField val SIGNATURE_IRREGULAR = of("signature_irregular")

                /**
                 * The check is a non-cash item and cannot be drawn against the account. (Check21
                 * return code `M`)
                 */
                @JvmField val NON_CASH_ITEM = of("non_cash_item")

                /** The bank is unable to process this check. (Check21 return code `O`) */
                @JvmField val UNABLE_TO_PROCESS = of("unable_to_process")

                /** The check exceeds the bank or customer's limit. (Check21 return code `P`) */
                @JvmField val ITEM_EXCEEDS_DOLLAR_LIMIT = of("item_exceeds_dollar_limit")

                /**
                 * The bank sold this account and no longer services this customer. (Check21 return
                 * code `R`)
                 */
                @JvmField val BRANCH_OR_ACCOUNT_SOLD = of("branch_or_account_sold")

                @JvmStatic fun of(value: String) = ReturnReason(JsonField.of(value))
            }

            /** An enum containing [ReturnReason]'s known values. */
            enum class Known {
                /** The check doesn't allow ACH conversion. */
                ACH_CONVERSION_NOT_SUPPORTED,
                /** The account is closed. (Check21 return code `D`) */
                CLOSED_ACCOUNT,
                /** The check has already been deposited. (Check21 return code `Y`) */
                DUPLICATE_SUBMISSION,
                /** Insufficient funds (Check21 return code `A`) */
                INSUFFICIENT_FUNDS,
                /** No account was found matching the check details. (Check21 return code `E`) */
                NO_ACCOUNT,
                /** The check was not authorized. (Check21 return code `Q`) */
                NOT_AUTHORIZED,
                /** The check is too old. (Check21 return code `G`) */
                STALE_DATED,
                /** The payment has been stopped by the account holder. (Check21 return code `C`) */
                STOP_PAYMENT,
                /** The reason for the return is unknown. */
                UNKNOWN_REASON,
                /** The image doesn't match the details submitted. */
                UNMATCHED_DETAILS,
                /** The image could not be read. (Check21 return code `U`) */
                UNREADABLE_IMAGE,
                /** The check endorsement was irregular. (Check21 return code `J`) */
                ENDORSEMENT_IRREGULAR,
                /** The check present was either altered or fake. (Check21 return code `N`) */
                ALTERED_OR_FICTITIOUS_ITEM,
                /** The account this check is drawn on is frozen. (Check21 return code `F`) */
                FROZEN_OR_BLOCKED_ACCOUNT,
                /** The check is post dated. (Check21 return code `H`) */
                POST_DATED,
                /** The endorsement was missing. (Check21 return code `I`) */
                ENDORSEMENT_MISSING,
                /** The check signature was missing. (Check21 return code `K`) */
                SIGNATURE_MISSING,
                /** The bank suspects a stop payment will be placed. (Check21 return code `T`) */
                STOP_PAYMENT_SUSPECT,
                /** The bank cannot read the image. (Check21 return code `U`) */
                UNUSABLE_IMAGE,
                /** The check image fails the bank's security check. (Check21 return code `V`) */
                IMAGE_FAILS_SECURITY_CHECK,
                /** The bank cannot determine the amount. (Check21 return code `W`) */
                CANNOT_DETERMINE_AMOUNT,
                /**
                 * The signature is inconsistent with prior signatures. (Check21 return code `L`)
                 */
                SIGNATURE_IRREGULAR,
                /**
                 * The check is a non-cash item and cannot be drawn against the account. (Check21
                 * return code `M`)
                 */
                NON_CASH_ITEM,
                /** The bank is unable to process this check. (Check21 return code `O`) */
                UNABLE_TO_PROCESS,
                /** The check exceeds the bank or customer's limit. (Check21 return code `P`) */
                ITEM_EXCEEDS_DOLLAR_LIMIT,
                /**
                 * The bank sold this account and no longer services this customer. (Check21 return
                 * code `R`)
                 */
                BRANCH_OR_ACCOUNT_SOLD,
            }

            /**
             * An enum containing [ReturnReason]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [ReturnReason] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                /** The check doesn't allow ACH conversion. */
                ACH_CONVERSION_NOT_SUPPORTED,
                /** The account is closed. (Check21 return code `D`) */
                CLOSED_ACCOUNT,
                /** The check has already been deposited. (Check21 return code `Y`) */
                DUPLICATE_SUBMISSION,
                /** Insufficient funds (Check21 return code `A`) */
                INSUFFICIENT_FUNDS,
                /** No account was found matching the check details. (Check21 return code `E`) */
                NO_ACCOUNT,
                /** The check was not authorized. (Check21 return code `Q`) */
                NOT_AUTHORIZED,
                /** The check is too old. (Check21 return code `G`) */
                STALE_DATED,
                /** The payment has been stopped by the account holder. (Check21 return code `C`) */
                STOP_PAYMENT,
                /** The reason for the return is unknown. */
                UNKNOWN_REASON,
                /** The image doesn't match the details submitted. */
                UNMATCHED_DETAILS,
                /** The image could not be read. (Check21 return code `U`) */
                UNREADABLE_IMAGE,
                /** The check endorsement was irregular. (Check21 return code `J`) */
                ENDORSEMENT_IRREGULAR,
                /** The check present was either altered or fake. (Check21 return code `N`) */
                ALTERED_OR_FICTITIOUS_ITEM,
                /** The account this check is drawn on is frozen. (Check21 return code `F`) */
                FROZEN_OR_BLOCKED_ACCOUNT,
                /** The check is post dated. (Check21 return code `H`) */
                POST_DATED,
                /** The endorsement was missing. (Check21 return code `I`) */
                ENDORSEMENT_MISSING,
                /** The check signature was missing. (Check21 return code `K`) */
                SIGNATURE_MISSING,
                /** The bank suspects a stop payment will be placed. (Check21 return code `T`) */
                STOP_PAYMENT_SUSPECT,
                /** The bank cannot read the image. (Check21 return code `U`) */
                UNUSABLE_IMAGE,
                /** The check image fails the bank's security check. (Check21 return code `V`) */
                IMAGE_FAILS_SECURITY_CHECK,
                /** The bank cannot determine the amount. (Check21 return code `W`) */
                CANNOT_DETERMINE_AMOUNT,
                /**
                 * The signature is inconsistent with prior signatures. (Check21 return code `L`)
                 */
                SIGNATURE_IRREGULAR,
                /**
                 * The check is a non-cash item and cannot be drawn against the account. (Check21
                 * return code `M`)
                 */
                NON_CASH_ITEM,
                /** The bank is unable to process this check. (Check21 return code `O`) */
                UNABLE_TO_PROCESS,
                /** The check exceeds the bank or customer's limit. (Check21 return code `P`) */
                ITEM_EXCEEDS_DOLLAR_LIMIT,
                /**
                 * The bank sold this account and no longer services this customer. (Check21 return
                 * code `R`)
                 */
                BRANCH_OR_ACCOUNT_SOLD,
                /**
                 * An enum member indicating that [ReturnReason] was instantiated with an unknown
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
                    ACH_CONVERSION_NOT_SUPPORTED -> Value.ACH_CONVERSION_NOT_SUPPORTED
                    CLOSED_ACCOUNT -> Value.CLOSED_ACCOUNT
                    DUPLICATE_SUBMISSION -> Value.DUPLICATE_SUBMISSION
                    INSUFFICIENT_FUNDS -> Value.INSUFFICIENT_FUNDS
                    NO_ACCOUNT -> Value.NO_ACCOUNT
                    NOT_AUTHORIZED -> Value.NOT_AUTHORIZED
                    STALE_DATED -> Value.STALE_DATED
                    STOP_PAYMENT -> Value.STOP_PAYMENT
                    UNKNOWN_REASON -> Value.UNKNOWN_REASON
                    UNMATCHED_DETAILS -> Value.UNMATCHED_DETAILS
                    UNREADABLE_IMAGE -> Value.UNREADABLE_IMAGE
                    ENDORSEMENT_IRREGULAR -> Value.ENDORSEMENT_IRREGULAR
                    ALTERED_OR_FICTITIOUS_ITEM -> Value.ALTERED_OR_FICTITIOUS_ITEM
                    FROZEN_OR_BLOCKED_ACCOUNT -> Value.FROZEN_OR_BLOCKED_ACCOUNT
                    POST_DATED -> Value.POST_DATED
                    ENDORSEMENT_MISSING -> Value.ENDORSEMENT_MISSING
                    SIGNATURE_MISSING -> Value.SIGNATURE_MISSING
                    STOP_PAYMENT_SUSPECT -> Value.STOP_PAYMENT_SUSPECT
                    UNUSABLE_IMAGE -> Value.UNUSABLE_IMAGE
                    IMAGE_FAILS_SECURITY_CHECK -> Value.IMAGE_FAILS_SECURITY_CHECK
                    CANNOT_DETERMINE_AMOUNT -> Value.CANNOT_DETERMINE_AMOUNT
                    SIGNATURE_IRREGULAR -> Value.SIGNATURE_IRREGULAR
                    NON_CASH_ITEM -> Value.NON_CASH_ITEM
                    UNABLE_TO_PROCESS -> Value.UNABLE_TO_PROCESS
                    ITEM_EXCEEDS_DOLLAR_LIMIT -> Value.ITEM_EXCEEDS_DOLLAR_LIMIT
                    BRANCH_OR_ACCOUNT_SOLD -> Value.BRANCH_OR_ACCOUNT_SOLD
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
                    ACH_CONVERSION_NOT_SUPPORTED -> Known.ACH_CONVERSION_NOT_SUPPORTED
                    CLOSED_ACCOUNT -> Known.CLOSED_ACCOUNT
                    DUPLICATE_SUBMISSION -> Known.DUPLICATE_SUBMISSION
                    INSUFFICIENT_FUNDS -> Known.INSUFFICIENT_FUNDS
                    NO_ACCOUNT -> Known.NO_ACCOUNT
                    NOT_AUTHORIZED -> Known.NOT_AUTHORIZED
                    STALE_DATED -> Known.STALE_DATED
                    STOP_PAYMENT -> Known.STOP_PAYMENT
                    UNKNOWN_REASON -> Known.UNKNOWN_REASON
                    UNMATCHED_DETAILS -> Known.UNMATCHED_DETAILS
                    UNREADABLE_IMAGE -> Known.UNREADABLE_IMAGE
                    ENDORSEMENT_IRREGULAR -> Known.ENDORSEMENT_IRREGULAR
                    ALTERED_OR_FICTITIOUS_ITEM -> Known.ALTERED_OR_FICTITIOUS_ITEM
                    FROZEN_OR_BLOCKED_ACCOUNT -> Known.FROZEN_OR_BLOCKED_ACCOUNT
                    POST_DATED -> Known.POST_DATED
                    ENDORSEMENT_MISSING -> Known.ENDORSEMENT_MISSING
                    SIGNATURE_MISSING -> Known.SIGNATURE_MISSING
                    STOP_PAYMENT_SUSPECT -> Known.STOP_PAYMENT_SUSPECT
                    UNUSABLE_IMAGE -> Known.UNUSABLE_IMAGE
                    IMAGE_FAILS_SECURITY_CHECK -> Known.IMAGE_FAILS_SECURITY_CHECK
                    CANNOT_DETERMINE_AMOUNT -> Known.CANNOT_DETERMINE_AMOUNT
                    SIGNATURE_IRREGULAR -> Known.SIGNATURE_IRREGULAR
                    NON_CASH_ITEM -> Known.NON_CASH_ITEM
                    UNABLE_TO_PROCESS -> Known.UNABLE_TO_PROCESS
                    ITEM_EXCEEDS_DOLLAR_LIMIT -> Known.ITEM_EXCEEDS_DOLLAR_LIMIT
                    BRANCH_OR_ACCOUNT_SOLD -> Known.BRANCH_OR_ACCOUNT_SOLD
                    else -> throw IncreaseInvalidDataException("Unknown ReturnReason: $value")
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

            fun validate(): ReturnReason = apply {
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

                return other is ReturnReason && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is DepositReturn &&
                amount == other.amount &&
                checkDepositId == other.checkDepositId &&
                currency == other.currency &&
                returnReason == other.returnReason &&
                returnedAt == other.returnedAt &&
                transactionId == other.transactionId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                amount,
                checkDepositId,
                currency,
                returnReason,
                returnedAt,
                transactionId,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "DepositReturn{amount=$amount, checkDepositId=$checkDepositId, currency=$currency, returnReason=$returnReason, returnedAt=$returnedAt, transactionId=$transactionId, additionalProperties=$additionalProperties}"
    }

    /**
     * After the check is parsed, it is submitted to the Check21 network for processing. This will
     * contain details of the submission.
     */
    class DepositSubmission
    private constructor(
        private val backFileId: JsonField<String>,
        private val frontFileId: JsonField<String>,
        private val submittedAt: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("back_file_id")
            @ExcludeMissing
            backFileId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("front_file_id")
            @ExcludeMissing
            frontFileId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("submitted_at")
            @ExcludeMissing
            submittedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(backFileId, frontFileId, submittedAt, mutableMapOf())

        /**
         * The ID for the File containing the check back image that was submitted to the Check21
         * network.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun backFileId(): String = backFileId.getRequired("back_file_id")

        /**
         * The ID for the File containing the check front image that was submitted to the Check21
         * network.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun frontFileId(): String = frontFileId.getRequired("front_file_id")

        /**
         * When the check deposit was submitted to the Check21 network for processing. During
         * business days, this happens within a few hours of the check being accepted by Increase.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun submittedAt(): OffsetDateTime = submittedAt.getRequired("submitted_at")

        /**
         * Returns the raw JSON value of [backFileId].
         *
         * Unlike [backFileId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("back_file_id")
        @ExcludeMissing
        fun _backFileId(): JsonField<String> = backFileId

        /**
         * Returns the raw JSON value of [frontFileId].
         *
         * Unlike [frontFileId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("front_file_id")
        @ExcludeMissing
        fun _frontFileId(): JsonField<String> = frontFileId

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
             * Returns a mutable builder for constructing an instance of [DepositSubmission].
             *
             * The following fields are required:
             * ```java
             * .backFileId()
             * .frontFileId()
             * .submittedAt()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [DepositSubmission]. */
        class Builder internal constructor() {

            private var backFileId: JsonField<String>? = null
            private var frontFileId: JsonField<String>? = null
            private var submittedAt: JsonField<OffsetDateTime>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(depositSubmission: DepositSubmission) = apply {
                backFileId = depositSubmission.backFileId
                frontFileId = depositSubmission.frontFileId
                submittedAt = depositSubmission.submittedAt
                additionalProperties = depositSubmission.additionalProperties.toMutableMap()
            }

            /**
             * The ID for the File containing the check back image that was submitted to the Check21
             * network.
             */
            fun backFileId(backFileId: String) = backFileId(JsonField.of(backFileId))

            /**
             * Sets [Builder.backFileId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.backFileId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun backFileId(backFileId: JsonField<String>) = apply { this.backFileId = backFileId }

            /**
             * The ID for the File containing the check front image that was submitted to the
             * Check21 network.
             */
            fun frontFileId(frontFileId: String) = frontFileId(JsonField.of(frontFileId))

            /**
             * Sets [Builder.frontFileId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.frontFileId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun frontFileId(frontFileId: JsonField<String>) = apply {
                this.frontFileId = frontFileId
            }

            /**
             * When the check deposit was submitted to the Check21 network for processing. During
             * business days, this happens within a few hours of the check being accepted by
             * Increase.
             */
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
                putAlladditional_properties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAlladditional_properties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAlladditional_properties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [DepositSubmission].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .backFileId()
             * .frontFileId()
             * .submittedAt()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): DepositSubmission =
                DepositSubmission(
                    checkRequired("backFileId", backFileId),
                    checkRequired("frontFileId", frontFileId),
                    checkRequired("submittedAt", submittedAt),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): DepositSubmission = apply {
            if (validated) {
                return@apply
            }

            backFileId()
            frontFileId()
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
            (if (backFileId.asKnown().isPresent) 1 else 0) +
                (if (frontFileId.asKnown().isPresent) 1 else 0) +
                (if (submittedAt.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is DepositSubmission &&
                backFileId == other.backFileId &&
                frontFileId == other.frontFileId &&
                submittedAt == other.submittedAt &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(backFileId, frontFileId, submittedAt, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "DepositSubmission{backFileId=$backFileId, frontFileId=$frontFileId, submittedAt=$submittedAt, additionalProperties=$additionalProperties}"
    }

    /**
     * Increase will sometimes hold the funds for Check Deposits. If funds are held, this sub-object
     * will contain details of the hold.
     */
    class InboundFundsHold
    private constructor(
        private val id: JsonField<String>,
        private val amount: JsonField<Long>,
        private val automaticallyReleasesAt: JsonField<OffsetDateTime>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val currency: JsonField<Currency>,
        private val heldTransactionId: JsonField<String>,
        private val pendingTransactionId: JsonField<String>,
        private val releasedAt: JsonField<OffsetDateTime>,
        private val status: JsonField<Status>,
        private val type: JsonField<Type>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("automatically_releases_at")
            @ExcludeMissing
            automaticallyReleasesAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("currency")
            @ExcludeMissing
            currency: JsonField<Currency> = JsonMissing.of(),
            @JsonProperty("held_transaction_id")
            @ExcludeMissing
            heldTransactionId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("pending_transaction_id")
            @ExcludeMissing
            pendingTransactionId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("released_at")
            @ExcludeMissing
            releasedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        ) : this(
            id,
            amount,
            automaticallyReleasesAt,
            createdAt,
            currency,
            heldTransactionId,
            pendingTransactionId,
            releasedAt,
            status,
            type,
            mutableMapOf(),
        )

        /**
         * The Inbound Funds Hold identifier.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * The held amount in the minor unit of the account's currency. For dollars, for example,
         * this is cents.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun amount(): Long = amount.getRequired("amount")

        /**
         * When the hold will be released automatically. Certain conditions may cause it to be
         * released before this time.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun automaticallyReleasesAt(): OffsetDateTime =
            automaticallyReleasesAt.getRequired("automatically_releases_at")

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the hold was
         * created.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the hold's currency.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun currency(): Currency = currency.getRequired("currency")

        /**
         * The ID of the Transaction for which funds were held.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun heldTransactionId(): Optional<String> =
            heldTransactionId.getOptional("held_transaction_id")

        /**
         * The ID of the Pending Transaction representing the held funds.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun pendingTransactionId(): Optional<String> =
            pendingTransactionId.getOptional("pending_transaction_id")

        /**
         * When the hold was released (if it has been released).
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun releasedAt(): Optional<OffsetDateTime> = releasedAt.getOptional("released_at")

        /**
         * The status of the hold.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun status(): Status = status.getRequired("status")

        /**
         * A constant representing the object's type. For this resource it will always be
         * `inbound_funds_hold`.
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
         * Returns the raw JSON value of [amount].
         *
         * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

        /**
         * Returns the raw JSON value of [automaticallyReleasesAt].
         *
         * Unlike [automaticallyReleasesAt], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("automatically_releases_at")
        @ExcludeMissing
        fun _automaticallyReleasesAt(): JsonField<OffsetDateTime> = automaticallyReleasesAt

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
         * Returns the raw JSON value of [heldTransactionId].
         *
         * Unlike [heldTransactionId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("held_transaction_id")
        @ExcludeMissing
        fun _heldTransactionId(): JsonField<String> = heldTransactionId

        /**
         * Returns the raw JSON value of [pendingTransactionId].
         *
         * Unlike [pendingTransactionId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("pending_transaction_id")
        @ExcludeMissing
        fun _pendingTransactionId(): JsonField<String> = pendingTransactionId

        /**
         * Returns the raw JSON value of [releasedAt].
         *
         * Unlike [releasedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("released_at")
        @ExcludeMissing
        fun _releasedAt(): JsonField<OffsetDateTime> = releasedAt

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

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
             * Returns a mutable builder for constructing an instance of [InboundFundsHold].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .amount()
             * .automaticallyReleasesAt()
             * .createdAt()
             * .currency()
             * .heldTransactionId()
             * .pendingTransactionId()
             * .releasedAt()
             * .status()
             * .type()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [InboundFundsHold]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var amount: JsonField<Long>? = null
            private var automaticallyReleasesAt: JsonField<OffsetDateTime>? = null
            private var createdAt: JsonField<OffsetDateTime>? = null
            private var currency: JsonField<Currency>? = null
            private var heldTransactionId: JsonField<String>? = null
            private var pendingTransactionId: JsonField<String>? = null
            private var releasedAt: JsonField<OffsetDateTime>? = null
            private var status: JsonField<Status>? = null
            private var type: JsonField<Type>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(inboundFundsHold: InboundFundsHold) = apply {
                id = inboundFundsHold.id
                amount = inboundFundsHold.amount
                automaticallyReleasesAt = inboundFundsHold.automaticallyReleasesAt
                createdAt = inboundFundsHold.createdAt
                currency = inboundFundsHold.currency
                heldTransactionId = inboundFundsHold.heldTransactionId
                pendingTransactionId = inboundFundsHold.pendingTransactionId
                releasedAt = inboundFundsHold.releasedAt
                status = inboundFundsHold.status
                type = inboundFundsHold.type
                additionalProperties = inboundFundsHold.additionalProperties.toMutableMap()
            }

            /** The Inbound Funds Hold identifier. */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /**
             * The held amount in the minor unit of the account's currency. For dollars, for
             * example, this is cents.
             */
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
             * When the hold will be released automatically. Certain conditions may cause it to be
             * released before this time.
             */
            fun automaticallyReleasesAt(automaticallyReleasesAt: OffsetDateTime) =
                automaticallyReleasesAt(JsonField.of(automaticallyReleasesAt))

            /**
             * Sets [Builder.automaticallyReleasesAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.automaticallyReleasesAt] with a well-typed
             * [OffsetDateTime] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun automaticallyReleasesAt(automaticallyReleasesAt: JsonField<OffsetDateTime>) =
                apply {
                    this.automaticallyReleasesAt = automaticallyReleasesAt
                }

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the hold was
             * created.
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

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the hold's currency.
             */
            fun currency(currency: Currency) = currency(JsonField.of(currency))

            /**
             * Sets [Builder.currency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currency] with a well-typed [Currency] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

            /** The ID of the Transaction for which funds were held. */
            fun heldTransactionId(heldTransactionId: String?) =
                heldTransactionId(JsonField.ofNullable(heldTransactionId))

            /**
             * Alias for calling [Builder.heldTransactionId] with `heldTransactionId.orElse(null)`.
             */
            fun heldTransactionId(heldTransactionId: Optional<String>) =
                heldTransactionId(heldTransactionId.getOrNull())

            /**
             * Sets [Builder.heldTransactionId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.heldTransactionId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun heldTransactionId(heldTransactionId: JsonField<String>) = apply {
                this.heldTransactionId = heldTransactionId
            }

            /** The ID of the Pending Transaction representing the held funds. */
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
             * You should usually call [Builder.pendingTransactionId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun pendingTransactionId(pendingTransactionId: JsonField<String>) = apply {
                this.pendingTransactionId = pendingTransactionId
            }

            /** When the hold was released (if it has been released). */
            fun releasedAt(releasedAt: OffsetDateTime?) =
                releasedAt(JsonField.ofNullable(releasedAt))

            /** Alias for calling [Builder.releasedAt] with `releasedAt.orElse(null)`. */
            fun releasedAt(releasedAt: Optional<OffsetDateTime>) =
                releasedAt(releasedAt.getOrNull())

            /**
             * Sets [Builder.releasedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.releasedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun releasedAt(releasedAt: JsonField<OffsetDateTime>) = apply {
                this.releasedAt = releasedAt
            }

            /** The status of the hold. */
            fun status(status: Status) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [Status] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<Status>) = apply { this.status = status }

            /**
             * A constant representing the object's type. For this resource it will always be
             * `inbound_funds_hold`.
             */
            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAlladditional_properties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAlladditional_properties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAlladditional_properties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [InboundFundsHold].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .amount()
             * .automaticallyReleasesAt()
             * .createdAt()
             * .currency()
             * .heldTransactionId()
             * .pendingTransactionId()
             * .releasedAt()
             * .status()
             * .type()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): InboundFundsHold =
                InboundFundsHold(
                    checkRequired("id", id),
                    checkRequired("amount", amount),
                    checkRequired("automaticallyReleasesAt", automaticallyReleasesAt),
                    checkRequired("createdAt", createdAt),
                    checkRequired("currency", currency),
                    checkRequired("heldTransactionId", heldTransactionId),
                    checkRequired("pendingTransactionId", pendingTransactionId),
                    checkRequired("releasedAt", releasedAt),
                    checkRequired("status", status),
                    checkRequired("type", type),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): InboundFundsHold = apply {
            if (validated) {
                return@apply
            }

            id()
            amount()
            automaticallyReleasesAt()
            createdAt()
            currency().validate()
            heldTransactionId()
            pendingTransactionId()
            releasedAt()
            status().validate()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (id.asKnown().isPresent) 1 else 0) +
                (if (amount.asKnown().isPresent) 1 else 0) +
                (if (automaticallyReleasesAt.asKnown().isPresent) 1 else 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (currency.asKnown().getOrNull()?.validity() ?: 0) +
                (if (heldTransactionId.asKnown().isPresent) 1 else 0) +
                (if (pendingTransactionId.asKnown().isPresent) 1 else 0) +
                (if (releasedAt.asKnown().isPresent) 1 else 0) +
                (status.asKnown().getOrNull()?.validity() ?: 0) +
                (type.asKnown().getOrNull()?.validity() ?: 0)

        /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the hold's currency. */
        class Currency @JsonCreator private constructor(private val value: JsonField<String>) :
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
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
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
                /**
                 * An enum member indicating that [Currency] was instantiated with an unknown value.
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
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
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

        /** The status of the hold. */
        class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                /** Funds are still being held. */
                @JvmField val HELD = of("held")

                /** Funds have been released. */
                @JvmField val COMPLETE = of("complete")

                @JvmStatic fun of(value: String) = Status(JsonField.of(value))
            }

            /** An enum containing [Status]'s known values. */
            enum class Known {
                /** Funds are still being held. */
                HELD,
                /** Funds have been released. */
                COMPLETE,
            }

            /**
             * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Status] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                /** Funds are still being held. */
                HELD,
                /** Funds have been released. */
                COMPLETE,
                /**
                 * An enum member indicating that [Status] was instantiated with an unknown value.
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
                    HELD -> Value.HELD
                    COMPLETE -> Value.COMPLETE
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
                    HELD -> Known.HELD
                    COMPLETE -> Known.COMPLETE
                    else -> throw IncreaseInvalidDataException("Unknown Status: $value")
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
         * `inbound_funds_hold`.
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

                @JvmField val INBOUND_FUNDS_HOLD = of("inbound_funds_hold")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                INBOUND_FUNDS_HOLD
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
                INBOUND_FUNDS_HOLD,
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
                    INBOUND_FUNDS_HOLD -> Value.INBOUND_FUNDS_HOLD
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
                    INBOUND_FUNDS_HOLD -> Known.INBOUND_FUNDS_HOLD
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

            return other is InboundFundsHold &&
                id == other.id &&
                amount == other.amount &&
                automaticallyReleasesAt == other.automaticallyReleasesAt &&
                createdAt == other.createdAt &&
                currency == other.currency &&
                heldTransactionId == other.heldTransactionId &&
                pendingTransactionId == other.pendingTransactionId &&
                releasedAt == other.releasedAt &&
                status == other.status &&
                type == other.type &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                amount,
                automaticallyReleasesAt,
                createdAt,
                currency,
                heldTransactionId,
                pendingTransactionId,
                releasedAt,
                status,
                type,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "InboundFundsHold{id=$id, amount=$amount, automaticallyReleasesAt=$automaticallyReleasesAt, createdAt=$createdAt, currency=$currency, heldTransactionId=$heldTransactionId, pendingTransactionId=$pendingTransactionId, releasedAt=$releasedAt, status=$status, type=$type, additionalProperties=$additionalProperties}"
    }

    /** The status of the Check Deposit. */
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

            /** The Check Deposit is pending review. */
            @JvmField val PENDING = of("pending")

            /** The Check Deposit has been deposited. */
            @JvmField val SUBMITTED = of("submitted")

            /** The Check Deposit has been rejected. */
            @JvmField val REJECTED = of("rejected")

            /** The Check Deposit has been returned. */
            @JvmField val RETURNED = of("returned")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            /** The Check Deposit is pending review. */
            PENDING,
            /** The Check Deposit has been deposited. */
            SUBMITTED,
            /** The Check Deposit has been rejected. */
            REJECTED,
            /** The Check Deposit has been returned. */
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
            /** The Check Deposit is pending review. */
            PENDING,
            /** The Check Deposit has been deposited. */
            SUBMITTED,
            /** The Check Deposit has been rejected. */
            REJECTED,
            /** The Check Deposit has been returned. */
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
                PENDING -> Value.PENDING
                SUBMITTED -> Value.SUBMITTED
                REJECTED -> Value.REJECTED
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
                PENDING -> Known.PENDING
                SUBMITTED -> Known.SUBMITTED
                REJECTED -> Known.REJECTED
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
     * `check_deposit`.
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

            @JvmField val CHECK_DEPOSIT = of("check_deposit")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            CHECK_DEPOSIT
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
            CHECK_DEPOSIT,
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
                CHECK_DEPOSIT -> Value.CHECK_DEPOSIT
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
                CHECK_DEPOSIT -> Known.CHECK_DEPOSIT
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

        return other is CheckDeposit &&
            id == other.id &&
            accountId == other.accountId &&
            amount == other.amount &&
            backImageFileId == other.backImageFileId &&
            createdAt == other.createdAt &&
            depositAcceptance == other.depositAcceptance &&
            depositRejection == other.depositRejection &&
            depositReturn == other.depositReturn &&
            depositSubmission == other.depositSubmission &&
            description == other.description &&
            frontImageFileId == other.frontImageFileId &&
            idempotencyKey == other.idempotencyKey &&
            inboundFundsHold == other.inboundFundsHold &&
            inboundMailItemId == other.inboundMailItemId &&
            lockboxId == other.lockboxId &&
            status == other.status &&
            transactionId == other.transactionId &&
            type == other.type &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            accountId,
            amount,
            backImageFileId,
            createdAt,
            depositAcceptance,
            depositRejection,
            depositReturn,
            depositSubmission,
            description,
            frontImageFileId,
            idempotencyKey,
            inboundFundsHold,
            inboundMailItemId,
            lockboxId,
            status,
            transactionId,
            type,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CheckDeposit{id=$id, accountId=$accountId, amount=$amount, backImageFileId=$backImageFileId, createdAt=$createdAt, depositAcceptance=$depositAcceptance, depositRejection=$depositRejection, depositReturn=$depositReturn, depositSubmission=$depositSubmission, description=$description, frontImageFileId=$frontImageFileId, idempotencyKey=$idempotencyKey, inboundFundsHold=$inboundFundsHold, inboundMailItemId=$inboundMailItemId, lockboxId=$lockboxId, status=$status, transactionId=$transactionId, type=$type, additionalProperties=$additionalProperties}"
}
