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

/** Check Deposits allow you to deposit images of paper checks into your account. */
@NoAutoDetect
class CheckDeposit
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("account_id")
    @ExcludeMissing
    private val accountId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("amount") @ExcludeMissing private val amount: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("back_image_file_id")
    @ExcludeMissing
    private val backImageFileId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("deposit_acceptance")
    @ExcludeMissing
    private val depositAcceptance: JsonField<DepositAcceptance> = JsonMissing.of(),
    @JsonProperty("deposit_rejection")
    @ExcludeMissing
    private val depositRejection: JsonField<DepositRejection> = JsonMissing.of(),
    @JsonProperty("deposit_return")
    @ExcludeMissing
    private val depositReturn: JsonField<DepositReturn> = JsonMissing.of(),
    @JsonProperty("deposit_submission")
    @ExcludeMissing
    private val depositSubmission: JsonField<DepositSubmission> = JsonMissing.of(),
    @JsonProperty("description")
    @ExcludeMissing
    private val description: JsonField<String> = JsonMissing.of(),
    @JsonProperty("front_image_file_id")
    @ExcludeMissing
    private val frontImageFileId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("idempotency_key")
    @ExcludeMissing
    private val idempotencyKey: JsonField<String> = JsonMissing.of(),
    @JsonProperty("inbound_funds_hold")
    @ExcludeMissing
    private val inboundFundsHold: JsonField<InboundFundsHold> = JsonMissing.of(),
    @JsonProperty("inbound_mail_item_id")
    @ExcludeMissing
    private val inboundMailItemId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("lockbox_id")
    @ExcludeMissing
    private val lockboxId: JsonField<String> = JsonMissing.of(),
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

    /** The Account the check was deposited into. */
    fun accountId(): String = accountId.getRequired("account_id")

    /** The deposited amount in USD cents. */
    fun amount(): Long = amount.getRequired("amount")

    /** The ID for the File containing the image of the back of the check. */
    fun backImageFileId(): Optional<String> =
        Optional.ofNullable(backImageFileId.getNullable("back_image_file_id"))

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the transfer
     * was created.
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * If your deposit is successfully parsed and accepted by Increase, this will contain details of
     * the parsed check.
     */
    fun depositAcceptance(): Optional<DepositAcceptance> =
        Optional.ofNullable(depositAcceptance.getNullable("deposit_acceptance"))

    /**
     * If your deposit is rejected by Increase, this will contain details as to why it was rejected.
     */
    fun depositRejection(): Optional<DepositRejection> =
        Optional.ofNullable(depositRejection.getNullable("deposit_rejection"))

    /** If your deposit is returned, this will contain details as to why it was returned. */
    fun depositReturn(): Optional<DepositReturn> =
        Optional.ofNullable(depositReturn.getNullable("deposit_return"))

    /**
     * After the check is parsed, it is submitted to the Check21 network for processing. This will
     * contain details of the submission.
     */
    fun depositSubmission(): Optional<DepositSubmission> =
        Optional.ofNullable(depositSubmission.getNullable("deposit_submission"))

    /** The description of the Check Deposit, for display purposes only. */
    fun description(): Optional<String> =
        Optional.ofNullable(description.getNullable("description"))

    /** The ID for the File containing the image of the front of the check. */
    fun frontImageFileId(): String = frontImageFileId.getRequired("front_image_file_id")

    /**
     * The idempotency key you chose for this object. This value is unique across Increase and is
     * used to ensure that a request is only processed once. Learn more about
     * [idempotency](https://increase.com/documentation/idempotency-keys).
     */
    fun idempotencyKey(): Optional<String> =
        Optional.ofNullable(idempotencyKey.getNullable("idempotency_key"))

    /**
     * Increase will sometimes hold the funds for Check Deposits. If funds are held, this sub-object
     * will contain details of the hold.
     */
    fun inboundFundsHold(): Optional<InboundFundsHold> =
        Optional.ofNullable(inboundFundsHold.getNullable("inbound_funds_hold"))

    /**
     * If the Check Deposit was the result of an Inbound Mail Item, this will contain the identifier
     * of the Inbound Mail Item.
     */
    fun inboundMailItemId(): Optional<String> =
        Optional.ofNullable(inboundMailItemId.getNullable("inbound_mail_item_id"))

    /**
     * If the Check Deposit was the result of an Inbound Mail Item, this will contain the identifier
     * of the Lockbox that received it.
     */
    fun lockboxId(): Optional<String> = Optional.ofNullable(lockboxId.getNullable("lockbox_id"))

    /** The status of the Check Deposit. */
    fun status(): Status = status.getRequired("status")

    /** The ID for the Transaction created by the deposit. */
    fun transactionId(): Optional<String> =
        Optional.ofNullable(transactionId.getNullable("transaction_id"))

    /**
     * A constant representing the object's type. For this resource it will always be
     * `check_deposit`.
     */
    fun type(): Type = type.getRequired("type")

    /** The deposit's identifier. */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /** The Account the check was deposited into. */
    @JsonProperty("account_id") @ExcludeMissing fun _accountId(): JsonField<String> = accountId

    /** The deposited amount in USD cents. */
    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

    /** The ID for the File containing the image of the back of the check. */
    @JsonProperty("back_image_file_id")
    @ExcludeMissing
    fun _backImageFileId(): JsonField<String> = backImageFileId

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the transfer
     * was created.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * If your deposit is successfully parsed and accepted by Increase, this will contain details of
     * the parsed check.
     */
    @JsonProperty("deposit_acceptance")
    @ExcludeMissing
    fun _depositAcceptance(): JsonField<DepositAcceptance> = depositAcceptance

    /**
     * If your deposit is rejected by Increase, this will contain details as to why it was rejected.
     */
    @JsonProperty("deposit_rejection")
    @ExcludeMissing
    fun _depositRejection(): JsonField<DepositRejection> = depositRejection

    /** If your deposit is returned, this will contain details as to why it was returned. */
    @JsonProperty("deposit_return")
    @ExcludeMissing
    fun _depositReturn(): JsonField<DepositReturn> = depositReturn

    /**
     * After the check is parsed, it is submitted to the Check21 network for processing. This will
     * contain details of the submission.
     */
    @JsonProperty("deposit_submission")
    @ExcludeMissing
    fun _depositSubmission(): JsonField<DepositSubmission> = depositSubmission

    /** The description of the Check Deposit, for display purposes only. */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /** The ID for the File containing the image of the front of the check. */
    @JsonProperty("front_image_file_id")
    @ExcludeMissing
    fun _frontImageFileId(): JsonField<String> = frontImageFileId

    /**
     * The idempotency key you chose for this object. This value is unique across Increase and is
     * used to ensure that a request is only processed once. Learn more about
     * [idempotency](https://increase.com/documentation/idempotency-keys).
     */
    @JsonProperty("idempotency_key")
    @ExcludeMissing
    fun _idempotencyKey(): JsonField<String> = idempotencyKey

    /**
     * Increase will sometimes hold the funds for Check Deposits. If funds are held, this sub-object
     * will contain details of the hold.
     */
    @JsonProperty("inbound_funds_hold")
    @ExcludeMissing
    fun _inboundFundsHold(): JsonField<InboundFundsHold> = inboundFundsHold

    /**
     * If the Check Deposit was the result of an Inbound Mail Item, this will contain the identifier
     * of the Inbound Mail Item.
     */
    @JsonProperty("inbound_mail_item_id")
    @ExcludeMissing
    fun _inboundMailItemId(): JsonField<String> = inboundMailItemId

    /**
     * If the Check Deposit was the result of an Inbound Mail Item, this will contain the identifier
     * of the Lockbox that received it.
     */
    @JsonProperty("lockbox_id") @ExcludeMissing fun _lockboxId(): JsonField<String> = lockboxId

    /** The status of the Check Deposit. */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /** The ID for the Transaction created by the deposit. */
    @JsonProperty("transaction_id")
    @ExcludeMissing
    fun _transactionId(): JsonField<String> = transactionId

    /**
     * A constant representing the object's type. For this resource it will always be
     * `check_deposit`.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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
        status()
        transactionId()
        type()
        validated = true
    }

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

        /** The deposit's identifier. */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The Account the check was deposited into. */
        fun accountId(accountId: String) = accountId(JsonField.of(accountId))

        /** The Account the check was deposited into. */
        fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

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
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
         * transfer was created.
         */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
         * transfer was created.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /**
         * If your deposit is successfully parsed and accepted by Increase, this will contain
         * details of the parsed check.
         */
        fun depositAcceptance(depositAcceptance: DepositAcceptance?) =
            depositAcceptance(JsonField.ofNullable(depositAcceptance))

        /**
         * If your deposit is successfully parsed and accepted by Increase, this will contain
         * details of the parsed check.
         */
        fun depositAcceptance(depositAcceptance: Optional<DepositAcceptance>) =
            depositAcceptance(depositAcceptance.getOrNull())

        /**
         * If your deposit is successfully parsed and accepted by Increase, this will contain
         * details of the parsed check.
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

        /**
         * If your deposit is rejected by Increase, this will contain details as to why it was
         * rejected.
         */
        fun depositRejection(depositRejection: Optional<DepositRejection>) =
            depositRejection(depositRejection.getOrNull())

        /**
         * If your deposit is rejected by Increase, this will contain details as to why it was
         * rejected.
         */
        fun depositRejection(depositRejection: JsonField<DepositRejection>) = apply {
            this.depositRejection = depositRejection
        }

        /** If your deposit is returned, this will contain details as to why it was returned. */
        fun depositReturn(depositReturn: DepositReturn?) =
            depositReturn(JsonField.ofNullable(depositReturn))

        /** If your deposit is returned, this will contain details as to why it was returned. */
        fun depositReturn(depositReturn: Optional<DepositReturn>) =
            depositReturn(depositReturn.getOrNull())

        /** If your deposit is returned, this will contain details as to why it was returned. */
        fun depositReturn(depositReturn: JsonField<DepositReturn>) = apply {
            this.depositReturn = depositReturn
        }

        /**
         * After the check is parsed, it is submitted to the Check21 network for processing. This
         * will contain details of the submission.
         */
        fun depositSubmission(depositSubmission: DepositSubmission?) =
            depositSubmission(JsonField.ofNullable(depositSubmission))

        /**
         * After the check is parsed, it is submitted to the Check21 network for processing. This
         * will contain details of the submission.
         */
        fun depositSubmission(depositSubmission: Optional<DepositSubmission>) =
            depositSubmission(depositSubmission.getOrNull())

        /**
         * After the check is parsed, it is submitted to the Check21 network for processing. This
         * will contain details of the submission.
         */
        fun depositSubmission(depositSubmission: JsonField<DepositSubmission>) = apply {
            this.depositSubmission = depositSubmission
        }

        /** The description of the Check Deposit, for display purposes only. */
        fun description(description: String?) = description(JsonField.ofNullable(description))

        /** The description of the Check Deposit, for display purposes only. */
        fun description(description: Optional<String>) = description(description.getOrNull())

        /** The description of the Check Deposit, for display purposes only. */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** The ID for the File containing the image of the front of the check. */
        fun frontImageFileId(frontImageFileId: String) =
            frontImageFileId(JsonField.of(frontImageFileId))

        /** The ID for the File containing the image of the front of the check. */
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
         * Increase will sometimes hold the funds for Check Deposits. If funds are held, this
         * sub-object will contain details of the hold.
         */
        fun inboundFundsHold(inboundFundsHold: InboundFundsHold?) =
            inboundFundsHold(JsonField.ofNullable(inboundFundsHold))

        /**
         * Increase will sometimes hold the funds for Check Deposits. If funds are held, this
         * sub-object will contain details of the hold.
         */
        fun inboundFundsHold(inboundFundsHold: Optional<InboundFundsHold>) =
            inboundFundsHold(inboundFundsHold.getOrNull())

        /**
         * Increase will sometimes hold the funds for Check Deposits. If funds are held, this
         * sub-object will contain details of the hold.
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

        /**
         * If the Check Deposit was the result of an Inbound Mail Item, this will contain the
         * identifier of the Inbound Mail Item.
         */
        fun inboundMailItemId(inboundMailItemId: Optional<String>) =
            inboundMailItemId(inboundMailItemId.getOrNull())

        /**
         * If the Check Deposit was the result of an Inbound Mail Item, this will contain the
         * identifier of the Inbound Mail Item.
         */
        fun inboundMailItemId(inboundMailItemId: JsonField<String>) = apply {
            this.inboundMailItemId = inboundMailItemId
        }

        /**
         * If the Check Deposit was the result of an Inbound Mail Item, this will contain the
         * identifier of the Lockbox that received it.
         */
        fun lockboxId(lockboxId: String?) = lockboxId(JsonField.ofNullable(lockboxId))

        /**
         * If the Check Deposit was the result of an Inbound Mail Item, this will contain the
         * identifier of the Lockbox that received it.
         */
        fun lockboxId(lockboxId: Optional<String>) = lockboxId(lockboxId.getOrNull())

        /**
         * If the Check Deposit was the result of an Inbound Mail Item, this will contain the
         * identifier of the Lockbox that received it.
         */
        fun lockboxId(lockboxId: JsonField<String>) = apply { this.lockboxId = lockboxId }

        /** The status of the Check Deposit. */
        fun status(status: Status) = status(JsonField.of(status))

        /** The status of the Check Deposit. */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** The ID for the Transaction created by the deposit. */
        fun transactionId(transactionId: String?) =
            transactionId(JsonField.ofNullable(transactionId))

        /** The ID for the Transaction created by the deposit. */
        fun transactionId(transactionId: Optional<String>) =
            transactionId(transactionId.getOrNull())

        /** The ID for the Transaction created by the deposit. */
        fun transactionId(transactionId: JsonField<String>) = apply {
            this.transactionId = transactionId
        }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `check_deposit`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * A constant representing the object's type. For this resource it will always be
         * `check_deposit`.
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
                additionalProperties.toImmutable(),
            )
    }

    /**
     * If your deposit is successfully parsed and accepted by Increase, this will contain details of
     * the parsed check.
     */
    @NoAutoDetect
    class DepositAcceptance
    @JsonCreator
    private constructor(
        @JsonProperty("account_number")
        @ExcludeMissing
        private val accountNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("amount")
        @ExcludeMissing
        private val amount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("auxiliary_on_us")
        @ExcludeMissing
        private val auxiliaryOnUs: JsonField<String> = JsonMissing.of(),
        @JsonProperty("check_deposit_id")
        @ExcludeMissing
        private val checkDepositId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("currency")
        @ExcludeMissing
        private val currency: JsonField<Currency> = JsonMissing.of(),
        @JsonProperty("routing_number")
        @ExcludeMissing
        private val routingNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("serial_number")
        @ExcludeMissing
        private val serialNumber: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The account number printed on the check. */
        fun accountNumber(): String = accountNumber.getRequired("account_number")

        /**
         * The amount to be deposited in the minor unit of the transaction's currency. For dollars,
         * for example, this is cents.
         */
        fun amount(): Long = amount.getRequired("amount")

        /**
         * An additional line of metadata printed on the check. This typically includes the check
         * number for business checks.
         */
        fun auxiliaryOnUs(): Optional<String> =
            Optional.ofNullable(auxiliaryOnUs.getNullable("auxiliary_on_us"))

        /** The ID of the Check Deposit that was accepted. */
        fun checkDepositId(): String = checkDepositId.getRequired("check_deposit_id")

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
         * currency.
         */
        fun currency(): Currency = currency.getRequired("currency")

        /** The routing number printed on the check. */
        fun routingNumber(): String = routingNumber.getRequired("routing_number")

        /**
         * The check serial number, if present, for consumer checks. For business checks, the serial
         * number is usually in the `auxiliary_on_us` field.
         */
        fun serialNumber(): Optional<String> =
            Optional.ofNullable(serialNumber.getNullable("serial_number"))

        /** The account number printed on the check. */
        @JsonProperty("account_number")
        @ExcludeMissing
        fun _accountNumber(): JsonField<String> = accountNumber

        /**
         * The amount to be deposited in the minor unit of the transaction's currency. For dollars,
         * for example, this is cents.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

        /**
         * An additional line of metadata printed on the check. This typically includes the check
         * number for business checks.
         */
        @JsonProperty("auxiliary_on_us")
        @ExcludeMissing
        fun _auxiliaryOnUs(): JsonField<String> = auxiliaryOnUs

        /** The ID of the Check Deposit that was accepted. */
        @JsonProperty("check_deposit_id")
        @ExcludeMissing
        fun _checkDepositId(): JsonField<String> = checkDepositId

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
         * currency.
         */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<Currency> = currency

        /** The routing number printed on the check. */
        @JsonProperty("routing_number")
        @ExcludeMissing
        fun _routingNumber(): JsonField<String> = routingNumber

        /**
         * The check serial number, if present, for consumer checks. For business checks, the serial
         * number is usually in the `auxiliary_on_us` field.
         */
        @JsonProperty("serial_number")
        @ExcludeMissing
        fun _serialNumber(): JsonField<String> = serialNumber

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): DepositAcceptance = apply {
            if (validated) {
                return@apply
            }

            accountNumber()
            amount()
            auxiliaryOnUs()
            checkDepositId()
            currency()
            routingNumber()
            serialNumber()
            validated = true
        }

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

            /** The account number printed on the check. */
            fun accountNumber(accountNumber: JsonField<String>) = apply {
                this.accountNumber = accountNumber
            }

            /**
             * The amount to be deposited in the minor unit of the transaction's currency. For
             * dollars, for example, this is cents.
             */
            fun amount(amount: Long) = amount(JsonField.of(amount))

            /**
             * The amount to be deposited in the minor unit of the transaction's currency. For
             * dollars, for example, this is cents.
             */
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            /**
             * An additional line of metadata printed on the check. This typically includes the
             * check number for business checks.
             */
            fun auxiliaryOnUs(auxiliaryOnUs: String?) =
                auxiliaryOnUs(JsonField.ofNullable(auxiliaryOnUs))

            /**
             * An additional line of metadata printed on the check. This typically includes the
             * check number for business checks.
             */
            fun auxiliaryOnUs(auxiliaryOnUs: Optional<String>) =
                auxiliaryOnUs(auxiliaryOnUs.getOrNull())

            /**
             * An additional line of metadata printed on the check. This typically includes the
             * check number for business checks.
             */
            fun auxiliaryOnUs(auxiliaryOnUs: JsonField<String>) = apply {
                this.auxiliaryOnUs = auxiliaryOnUs
            }

            /** The ID of the Check Deposit that was accepted. */
            fun checkDepositId(checkDepositId: String) =
                checkDepositId(JsonField.of(checkDepositId))

            /** The ID of the Check Deposit that was accepted. */
            fun checkDepositId(checkDepositId: JsonField<String>) = apply {
                this.checkDepositId = checkDepositId
            }

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
             * currency.
             */
            fun currency(currency: Currency) = currency(JsonField.of(currency))

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
             * currency.
             */
            fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

            /** The routing number printed on the check. */
            fun routingNumber(routingNumber: String) = routingNumber(JsonField.of(routingNumber))

            /** The routing number printed on the check. */
            fun routingNumber(routingNumber: JsonField<String>) = apply {
                this.routingNumber = routingNumber
            }

            /**
             * The check serial number, if present, for consumer checks. For business checks, the
             * serial number is usually in the `auxiliary_on_us` field.
             */
            fun serialNumber(serialNumber: String?) =
                serialNumber(JsonField.ofNullable(serialNumber))

            /**
             * The check serial number, if present, for consumer checks. For business checks, the
             * serial number is usually in the `auxiliary_on_us` field.
             */
            fun serialNumber(serialNumber: Optional<String>) =
                serialNumber(serialNumber.getOrNull())

            /**
             * The check serial number, if present, for consumer checks. For business checks, the
             * serial number is usually in the `auxiliary_on_us` field.
             */
            fun serialNumber(serialNumber: JsonField<String>) = apply {
                this.serialNumber = serialNumber
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

            fun build(): DepositAcceptance =
                DepositAcceptance(
                    checkRequired("accountNumber", accountNumber),
                    checkRequired("amount", amount),
                    checkRequired("auxiliaryOnUs", auxiliaryOnUs),
                    checkRequired("checkDepositId", checkDepositId),
                    checkRequired("currency", currency),
                    checkRequired("routingNumber", routingNumber),
                    checkRequired("serialNumber", serialNumber),
                    additionalProperties.toImmutable(),
                )
        }

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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Currency && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is DepositAcceptance && accountNumber == other.accountNumber && amount == other.amount && auxiliaryOnUs == other.auxiliaryOnUs && checkDepositId == other.checkDepositId && currency == other.currency && routingNumber == other.routingNumber && serialNumber == other.serialNumber && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(accountNumber, amount, auxiliaryOnUs, checkDepositId, currency, routingNumber, serialNumber, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "DepositAcceptance{accountNumber=$accountNumber, amount=$amount, auxiliaryOnUs=$auxiliaryOnUs, checkDepositId=$checkDepositId, currency=$currency, routingNumber=$routingNumber, serialNumber=$serialNumber, additionalProperties=$additionalProperties}"
    }

    /**
     * If your deposit is rejected by Increase, this will contain details as to why it was rejected.
     */
    @NoAutoDetect
    class DepositRejection
    @JsonCreator
    private constructor(
        @JsonProperty("amount")
        @ExcludeMissing
        private val amount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("check_deposit_id")
        @ExcludeMissing
        private val checkDepositId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("currency")
        @ExcludeMissing
        private val currency: JsonField<Currency> = JsonMissing.of(),
        @JsonProperty("declined_transaction_id")
        @ExcludeMissing
        private val declinedTransactionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("reason")
        @ExcludeMissing
        private val reason: JsonField<Reason> = JsonMissing.of(),
        @JsonProperty("rejected_at")
        @ExcludeMissing
        private val rejectedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * The rejected amount in the minor unit of check's currency. For dollars, for example, this
         * is cents.
         */
        fun amount(): Long = amount.getRequired("amount")

        /** The identifier of the Check Deposit that was rejected. */
        fun checkDepositId(): String = checkDepositId.getRequired("check_deposit_id")

        /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the check's currency. */
        fun currency(): Currency = currency.getRequired("currency")

        /** The identifier of the associated declined transaction. */
        fun declinedTransactionId(): String =
            declinedTransactionId.getRequired("declined_transaction_id")

        /** Why the check deposit was rejected. */
        fun reason(): Reason = reason.getRequired("reason")

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the check
         * deposit was rejected.
         */
        fun rejectedAt(): OffsetDateTime = rejectedAt.getRequired("rejected_at")

        /**
         * The rejected amount in the minor unit of check's currency. For dollars, for example, this
         * is cents.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

        /** The identifier of the Check Deposit that was rejected. */
        @JsonProperty("check_deposit_id")
        @ExcludeMissing
        fun _checkDepositId(): JsonField<String> = checkDepositId

        /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the check's currency. */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<Currency> = currency

        /** The identifier of the associated declined transaction. */
        @JsonProperty("declined_transaction_id")
        @ExcludeMissing
        fun _declinedTransactionId(): JsonField<String> = declinedTransactionId

        /** Why the check deposit was rejected. */
        @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<Reason> = reason

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the check
         * deposit was rejected.
         */
        @JsonProperty("rejected_at")
        @ExcludeMissing
        fun _rejectedAt(): JsonField<OffsetDateTime> = rejectedAt

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): DepositRejection = apply {
            if (validated) {
                return@apply
            }

            amount()
            checkDepositId()
            currency()
            declinedTransactionId()
            reason()
            rejectedAt()
            validated = true
        }

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
             * The rejected amount in the minor unit of check's currency. For dollars, for example,
             * this is cents.
             */
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            /** The identifier of the Check Deposit that was rejected. */
            fun checkDepositId(checkDepositId: String) =
                checkDepositId(JsonField.of(checkDepositId))

            /** The identifier of the Check Deposit that was rejected. */
            fun checkDepositId(checkDepositId: JsonField<String>) = apply {
                this.checkDepositId = checkDepositId
            }

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the check's currency.
             */
            fun currency(currency: Currency) = currency(JsonField.of(currency))

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the check's currency.
             */
            fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

            /** The identifier of the associated declined transaction. */
            fun declinedTransactionId(declinedTransactionId: String) =
                declinedTransactionId(JsonField.of(declinedTransactionId))

            /** The identifier of the associated declined transaction. */
            fun declinedTransactionId(declinedTransactionId: JsonField<String>) = apply {
                this.declinedTransactionId = declinedTransactionId
            }

            /** Why the check deposit was rejected. */
            fun reason(reason: Reason) = reason(JsonField.of(reason))

            /** Why the check deposit was rejected. */
            fun reason(reason: JsonField<Reason>) = apply { this.reason = reason }

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * check deposit was rejected.
             */
            fun rejectedAt(rejectedAt: OffsetDateTime) = rejectedAt(JsonField.of(rejectedAt))

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * check deposit was rejected.
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

            fun build(): DepositRejection =
                DepositRejection(
                    checkRequired("amount", amount),
                    checkRequired("checkDepositId", checkDepositId),
                    checkRequired("currency", currency),
                    checkRequired("declinedTransactionId", declinedTransactionId),
                    checkRequired("reason", reason),
                    checkRequired("rejectedAt", rejectedAt),
                    additionalProperties.toImmutable(),
                )
        }

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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Currency && value == other.value /* spotless:on */
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

            return /* spotless:off */ other is DepositRejection && amount == other.amount && checkDepositId == other.checkDepositId && currency == other.currency && declinedTransactionId == other.declinedTransactionId && reason == other.reason && rejectedAt == other.rejectedAt && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(amount, checkDepositId, currency, declinedTransactionId, reason, rejectedAt, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "DepositRejection{amount=$amount, checkDepositId=$checkDepositId, currency=$currency, declinedTransactionId=$declinedTransactionId, reason=$reason, rejectedAt=$rejectedAt, additionalProperties=$additionalProperties}"
    }

    /** If your deposit is returned, this will contain details as to why it was returned. */
    @NoAutoDetect
    class DepositReturn
    @JsonCreator
    private constructor(
        @JsonProperty("amount")
        @ExcludeMissing
        private val amount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("check_deposit_id")
        @ExcludeMissing
        private val checkDepositId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("currency")
        @ExcludeMissing
        private val currency: JsonField<Currency> = JsonMissing.of(),
        @JsonProperty("return_reason")
        @ExcludeMissing
        private val returnReason: JsonField<ReturnReason> = JsonMissing.of(),
        @JsonProperty("returned_at")
        @ExcludeMissing
        private val returnedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("transaction_id")
        @ExcludeMissing
        private val transactionId: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The returned amount in USD cents. */
        fun amount(): Long = amount.getRequired("amount")

        /** The identifier of the Check Deposit that was returned. */
        fun checkDepositId(): String = checkDepositId.getRequired("check_deposit_id")

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
         * currency.
         */
        fun currency(): Currency = currency.getRequired("currency")

        /** Why this check was returned by the bank holding the account it was drawn against. */
        fun returnReason(): ReturnReason = returnReason.getRequired("return_reason")

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the check
         * deposit was returned.
         */
        fun returnedAt(): OffsetDateTime = returnedAt.getRequired("returned_at")

        /**
         * The identifier of the transaction that reversed the original check deposit transaction.
         */
        fun transactionId(): String = transactionId.getRequired("transaction_id")

        /** The returned amount in USD cents. */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

        /** The identifier of the Check Deposit that was returned. */
        @JsonProperty("check_deposit_id")
        @ExcludeMissing
        fun _checkDepositId(): JsonField<String> = checkDepositId

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
         * currency.
         */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<Currency> = currency

        /** Why this check was returned by the bank holding the account it was drawn against. */
        @JsonProperty("return_reason")
        @ExcludeMissing
        fun _returnReason(): JsonField<ReturnReason> = returnReason

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the check
         * deposit was returned.
         */
        @JsonProperty("returned_at")
        @ExcludeMissing
        fun _returnedAt(): JsonField<OffsetDateTime> = returnedAt

        /**
         * The identifier of the transaction that reversed the original check deposit transaction.
         */
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

            amount()
            checkDepositId()
            currency()
            returnReason()
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

            /** The returned amount in USD cents. */
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            /** The identifier of the Check Deposit that was returned. */
            fun checkDepositId(checkDepositId: String) =
                checkDepositId(JsonField.of(checkDepositId))

            /** The identifier of the Check Deposit that was returned. */
            fun checkDepositId(checkDepositId: JsonField<String>) = apply {
                this.checkDepositId = checkDepositId
            }

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
             * currency.
             */
            fun currency(currency: Currency) = currency(JsonField.of(currency))

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
             * currency.
             */
            fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

            /** Why this check was returned by the bank holding the account it was drawn against. */
            fun returnReason(returnReason: ReturnReason) = returnReason(JsonField.of(returnReason))

            /** Why this check was returned by the bank holding the account it was drawn against. */
            fun returnReason(returnReason: JsonField<ReturnReason>) = apply {
                this.returnReason = returnReason
            }

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * check deposit was returned.
             */
            fun returnedAt(returnedAt: OffsetDateTime) = returnedAt(JsonField.of(returnedAt))

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * check deposit was returned.
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
             * The identifier of the transaction that reversed the original check deposit
             * transaction.
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

            fun build(): DepositReturn =
                DepositReturn(
                    checkRequired("amount", amount),
                    checkRequired("checkDepositId", checkDepositId),
                    checkRequired("currency", currency),
                    checkRequired("returnReason", returnReason),
                    checkRequired("returnedAt", returnedAt),
                    checkRequired("transactionId", transactionId),
                    additionalProperties.toImmutable(),
                )
        }

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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Currency && value == other.value /* spotless:on */
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

                /** The account is closed. */
                @JvmField val CLOSED_ACCOUNT = of("closed_account")

                /** The check has already been deposited. */
                @JvmField val DUPLICATE_SUBMISSION = of("duplicate_submission")

                /** Insufficient funds */
                @JvmField val INSUFFICIENT_FUNDS = of("insufficient_funds")

                /** No account was found matching the check details. */
                @JvmField val NO_ACCOUNT = of("no_account")

                /** The check was not authorized. */
                @JvmField val NOT_AUTHORIZED = of("not_authorized")

                /** The check is too old. */
                @JvmField val STALE_DATED = of("stale_dated")

                /** The payment has been stopped by the account holder. */
                @JvmField val STOP_PAYMENT = of("stop_payment")

                /** The reason for the return is unknown. */
                @JvmField val UNKNOWN_REASON = of("unknown_reason")

                /** The image doesn't match the details submitted. */
                @JvmField val UNMATCHED_DETAILS = of("unmatched_details")

                /** The image could not be read. */
                @JvmField val UNREADABLE_IMAGE = of("unreadable_image")

                /** The check endorsement was irregular. */
                @JvmField val ENDORSEMENT_IRREGULAR = of("endorsement_irregular")

                /** The check present was either altered or fake. */
                @JvmField val ALTERED_OR_FICTITIOUS_ITEM = of("altered_or_fictitious_item")

                /** The account this check is drawn on is frozen. */
                @JvmField val FROZEN_OR_BLOCKED_ACCOUNT = of("frozen_or_blocked_account")

                /** The check is post dated. */
                @JvmField val POST_DATED = of("post_dated")

                /** The endorsement was missing. */
                @JvmField val ENDORSEMENT_MISSING = of("endorsement_missing")

                /** The check signature was missing. */
                @JvmField val SIGNATURE_MISSING = of("signature_missing")

                /** The bank suspects a stop payment will be placed. */
                @JvmField val STOP_PAYMENT_SUSPECT = of("stop_payment_suspect")

                /** The bank cannot read the image. */
                @JvmField val UNUSABLE_IMAGE = of("unusable_image")

                /** The check image fails the bank's security check. */
                @JvmField val IMAGE_FAILS_SECURITY_CHECK = of("image_fails_security_check")

                /** The bank cannot determine the amount. */
                @JvmField val CANNOT_DETERMINE_AMOUNT = of("cannot_determine_amount")

                /** The signature is inconsistent with prior signatures. */
                @JvmField val SIGNATURE_IRREGULAR = of("signature_irregular")

                /** The check is a non-cash item and cannot be drawn against the account. */
                @JvmField val NON_CASH_ITEM = of("non_cash_item")

                /** The bank is unable to process this check. */
                @JvmField val UNABLE_TO_PROCESS = of("unable_to_process")

                /** The check exceeds the bank or customer's limit. */
                @JvmField val ITEM_EXCEEDS_DOLLAR_LIMIT = of("item_exceeds_dollar_limit")

                /** The bank sold this account and no longer services this customer. */
                @JvmField val BRANCH_OR_ACCOUNT_SOLD = of("branch_or_account_sold")

                @JvmStatic fun of(value: String) = ReturnReason(JsonField.of(value))
            }

            /** An enum containing [ReturnReason]'s known values. */
            enum class Known {
                /** The check doesn't allow ACH conversion. */
                ACH_CONVERSION_NOT_SUPPORTED,
                /** The account is closed. */
                CLOSED_ACCOUNT,
                /** The check has already been deposited. */
                DUPLICATE_SUBMISSION,
                /** Insufficient funds */
                INSUFFICIENT_FUNDS,
                /** No account was found matching the check details. */
                NO_ACCOUNT,
                /** The check was not authorized. */
                NOT_AUTHORIZED,
                /** The check is too old. */
                STALE_DATED,
                /** The payment has been stopped by the account holder. */
                STOP_PAYMENT,
                /** The reason for the return is unknown. */
                UNKNOWN_REASON,
                /** The image doesn't match the details submitted. */
                UNMATCHED_DETAILS,
                /** The image could not be read. */
                UNREADABLE_IMAGE,
                /** The check endorsement was irregular. */
                ENDORSEMENT_IRREGULAR,
                /** The check present was either altered or fake. */
                ALTERED_OR_FICTITIOUS_ITEM,
                /** The account this check is drawn on is frozen. */
                FROZEN_OR_BLOCKED_ACCOUNT,
                /** The check is post dated. */
                POST_DATED,
                /** The endorsement was missing. */
                ENDORSEMENT_MISSING,
                /** The check signature was missing. */
                SIGNATURE_MISSING,
                /** The bank suspects a stop payment will be placed. */
                STOP_PAYMENT_SUSPECT,
                /** The bank cannot read the image. */
                UNUSABLE_IMAGE,
                /** The check image fails the bank's security check. */
                IMAGE_FAILS_SECURITY_CHECK,
                /** The bank cannot determine the amount. */
                CANNOT_DETERMINE_AMOUNT,
                /** The signature is inconsistent with prior signatures. */
                SIGNATURE_IRREGULAR,
                /** The check is a non-cash item and cannot be drawn against the account. */
                NON_CASH_ITEM,
                /** The bank is unable to process this check. */
                UNABLE_TO_PROCESS,
                /** The check exceeds the bank or customer's limit. */
                ITEM_EXCEEDS_DOLLAR_LIMIT,
                /** The bank sold this account and no longer services this customer. */
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
                /** The account is closed. */
                CLOSED_ACCOUNT,
                /** The check has already been deposited. */
                DUPLICATE_SUBMISSION,
                /** Insufficient funds */
                INSUFFICIENT_FUNDS,
                /** No account was found matching the check details. */
                NO_ACCOUNT,
                /** The check was not authorized. */
                NOT_AUTHORIZED,
                /** The check is too old. */
                STALE_DATED,
                /** The payment has been stopped by the account holder. */
                STOP_PAYMENT,
                /** The reason for the return is unknown. */
                UNKNOWN_REASON,
                /** The image doesn't match the details submitted. */
                UNMATCHED_DETAILS,
                /** The image could not be read. */
                UNREADABLE_IMAGE,
                /** The check endorsement was irregular. */
                ENDORSEMENT_IRREGULAR,
                /** The check present was either altered or fake. */
                ALTERED_OR_FICTITIOUS_ITEM,
                /** The account this check is drawn on is frozen. */
                FROZEN_OR_BLOCKED_ACCOUNT,
                /** The check is post dated. */
                POST_DATED,
                /** The endorsement was missing. */
                ENDORSEMENT_MISSING,
                /** The check signature was missing. */
                SIGNATURE_MISSING,
                /** The bank suspects a stop payment will be placed. */
                STOP_PAYMENT_SUSPECT,
                /** The bank cannot read the image. */
                UNUSABLE_IMAGE,
                /** The check image fails the bank's security check. */
                IMAGE_FAILS_SECURITY_CHECK,
                /** The bank cannot determine the amount. */
                CANNOT_DETERMINE_AMOUNT,
                /** The signature is inconsistent with prior signatures. */
                SIGNATURE_IRREGULAR,
                /** The check is a non-cash item and cannot be drawn against the account. */
                NON_CASH_ITEM,
                /** The bank is unable to process this check. */
                UNABLE_TO_PROCESS,
                /** The check exceeds the bank or customer's limit. */
                ITEM_EXCEEDS_DOLLAR_LIMIT,
                /** The bank sold this account and no longer services this customer. */
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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ReturnReason && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is DepositReturn && amount == other.amount && checkDepositId == other.checkDepositId && currency == other.currency && returnReason == other.returnReason && returnedAt == other.returnedAt && transactionId == other.transactionId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(amount, checkDepositId, currency, returnReason, returnedAt, transactionId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "DepositReturn{amount=$amount, checkDepositId=$checkDepositId, currency=$currency, returnReason=$returnReason, returnedAt=$returnedAt, transactionId=$transactionId, additionalProperties=$additionalProperties}"
    }

    /**
     * After the check is parsed, it is submitted to the Check21 network for processing. This will
     * contain details of the submission.
     */
    @NoAutoDetect
    class DepositSubmission
    @JsonCreator
    private constructor(
        @JsonProperty("back_file_id")
        @ExcludeMissing
        private val backFileId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("front_file_id")
        @ExcludeMissing
        private val frontFileId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("submitted_at")
        @ExcludeMissing
        private val submittedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * The ID for the File containing the check back image that was submitted to the Check21
         * network.
         */
        fun backFileId(): String = backFileId.getRequired("back_file_id")

        /**
         * The ID for the File containing the check front image that was submitted to the Check21
         * network.
         */
        fun frontFileId(): String = frontFileId.getRequired("front_file_id")

        /**
         * When the check deposit was submitted to the Check21 network for processing. During
         * business days, this happens within a few hours of the check being accepted by Increase.
         */
        fun submittedAt(): OffsetDateTime = submittedAt.getRequired("submitted_at")

        /**
         * The ID for the File containing the check back image that was submitted to the Check21
         * network.
         */
        @JsonProperty("back_file_id")
        @ExcludeMissing
        fun _backFileId(): JsonField<String> = backFileId

        /**
         * The ID for the File containing the check front image that was submitted to the Check21
         * network.
         */
        @JsonProperty("front_file_id")
        @ExcludeMissing
        fun _frontFileId(): JsonField<String> = frontFileId

        /**
         * When the check deposit was submitted to the Check21 network for processing. During
         * business days, this happens within a few hours of the check being accepted by Increase.
         */
        @JsonProperty("submitted_at")
        @ExcludeMissing
        fun _submittedAt(): JsonField<OffsetDateTime> = submittedAt

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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
             * The ID for the File containing the check back image that was submitted to the Check21
             * network.
             */
            fun backFileId(backFileId: JsonField<String>) = apply { this.backFileId = backFileId }

            /**
             * The ID for the File containing the check front image that was submitted to the
             * Check21 network.
             */
            fun frontFileId(frontFileId: String) = frontFileId(JsonField.of(frontFileId))

            /**
             * The ID for the File containing the check front image that was submitted to the
             * Check21 network.
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
             * When the check deposit was submitted to the Check21 network for processing. During
             * business days, this happens within a few hours of the check being accepted by
             * Increase.
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

            fun build(): DepositSubmission =
                DepositSubmission(
                    checkRequired("backFileId", backFileId),
                    checkRequired("frontFileId", frontFileId),
                    checkRequired("submittedAt", submittedAt),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is DepositSubmission && backFileId == other.backFileId && frontFileId == other.frontFileId && submittedAt == other.submittedAt && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(backFileId, frontFileId, submittedAt, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "DepositSubmission{backFileId=$backFileId, frontFileId=$frontFileId, submittedAt=$submittedAt, additionalProperties=$additionalProperties}"
    }

    /**
     * Increase will sometimes hold the funds for Check Deposits. If funds are held, this sub-object
     * will contain details of the hold.
     */
    @NoAutoDetect
    class InboundFundsHold
    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("amount")
        @ExcludeMissing
        private val amount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("automatically_releases_at")
        @ExcludeMissing
        private val automaticallyReleasesAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("currency")
        @ExcludeMissing
        private val currency: JsonField<Currency> = JsonMissing.of(),
        @JsonProperty("held_transaction_id")
        @ExcludeMissing
        private val heldTransactionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pending_transaction_id")
        @ExcludeMissing
        private val pendingTransactionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("released_at")
        @ExcludeMissing
        private val releasedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("status")
        @ExcludeMissing
        private val status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The Inbound Funds Hold identifier. */
        fun id(): String = id.getRequired("id")

        /**
         * The held amount in the minor unit of the account's currency. For dollars, for example,
         * this is cents.
         */
        fun amount(): Long = amount.getRequired("amount")

        /**
         * When the hold will be released automatically. Certain conditions may cause it to be
         * released before this time.
         */
        fun automaticallyReleasesAt(): OffsetDateTime =
            automaticallyReleasesAt.getRequired("automatically_releases_at")

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the hold was
         * created.
         */
        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the hold's currency. */
        fun currency(): Currency = currency.getRequired("currency")

        /** The ID of the Transaction for which funds were held. */
        fun heldTransactionId(): Optional<String> =
            Optional.ofNullable(heldTransactionId.getNullable("held_transaction_id"))

        /** The ID of the Pending Transaction representing the held funds. */
        fun pendingTransactionId(): Optional<String> =
            Optional.ofNullable(pendingTransactionId.getNullable("pending_transaction_id"))

        /** When the hold was released (if it has been released). */
        fun releasedAt(): Optional<OffsetDateTime> =
            Optional.ofNullable(releasedAt.getNullable("released_at"))

        /** The status of the hold. */
        fun status(): Status = status.getRequired("status")

        /**
         * A constant representing the object's type. For this resource it will always be
         * `inbound_funds_hold`.
         */
        fun type(): Type = type.getRequired("type")

        /** The Inbound Funds Hold identifier. */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * The held amount in the minor unit of the account's currency. For dollars, for example,
         * this is cents.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

        /**
         * When the hold will be released automatically. Certain conditions may cause it to be
         * released before this time.
         */
        @JsonProperty("automatically_releases_at")
        @ExcludeMissing
        fun _automaticallyReleasesAt(): JsonField<OffsetDateTime> = automaticallyReleasesAt

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the hold was
         * created.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the hold's currency. */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<Currency> = currency

        /** The ID of the Transaction for which funds were held. */
        @JsonProperty("held_transaction_id")
        @ExcludeMissing
        fun _heldTransactionId(): JsonField<String> = heldTransactionId

        /** The ID of the Pending Transaction representing the held funds. */
        @JsonProperty("pending_transaction_id")
        @ExcludeMissing
        fun _pendingTransactionId(): JsonField<String> = pendingTransactionId

        /** When the hold was released (if it has been released). */
        @JsonProperty("released_at")
        @ExcludeMissing
        fun _releasedAt(): JsonField<OffsetDateTime> = releasedAt

        /** The status of the hold. */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

        /**
         * A constant representing the object's type. For this resource it will always be
         * `inbound_funds_hold`.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): InboundFundsHold = apply {
            if (validated) {
                return@apply
            }

            id()
            amount()
            automaticallyReleasesAt()
            createdAt()
            currency()
            heldTransactionId()
            pendingTransactionId()
            releasedAt()
            status()
            type()
            validated = true
        }

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

            /** The Inbound Funds Hold identifier. */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /**
             * The held amount in the minor unit of the account's currency. For dollars, for
             * example, this is cents.
             */
            fun amount(amount: Long) = amount(JsonField.of(amount))

            /**
             * The held amount in the minor unit of the account's currency. For dollars, for
             * example, this is cents.
             */
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            /**
             * When the hold will be released automatically. Certain conditions may cause it to be
             * released before this time.
             */
            fun automaticallyReleasesAt(automaticallyReleasesAt: OffsetDateTime) =
                automaticallyReleasesAt(JsonField.of(automaticallyReleasesAt))

            /**
             * When the hold will be released automatically. Certain conditions may cause it to be
             * released before this time.
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
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the hold was
             * created.
             */
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the hold's currency.
             */
            fun currency(currency: Currency) = currency(JsonField.of(currency))

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the hold's currency.
             */
            fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

            /** The ID of the Transaction for which funds were held. */
            fun heldTransactionId(heldTransactionId: String?) =
                heldTransactionId(JsonField.ofNullable(heldTransactionId))

            /** The ID of the Transaction for which funds were held. */
            fun heldTransactionId(heldTransactionId: Optional<String>) =
                heldTransactionId(heldTransactionId.getOrNull())

            /** The ID of the Transaction for which funds were held. */
            fun heldTransactionId(heldTransactionId: JsonField<String>) = apply {
                this.heldTransactionId = heldTransactionId
            }

            /** The ID of the Pending Transaction representing the held funds. */
            fun pendingTransactionId(pendingTransactionId: String?) =
                pendingTransactionId(JsonField.ofNullable(pendingTransactionId))

            /** The ID of the Pending Transaction representing the held funds. */
            fun pendingTransactionId(pendingTransactionId: Optional<String>) =
                pendingTransactionId(pendingTransactionId.getOrNull())

            /** The ID of the Pending Transaction representing the held funds. */
            fun pendingTransactionId(pendingTransactionId: JsonField<String>) = apply {
                this.pendingTransactionId = pendingTransactionId
            }

            /** When the hold was released (if it has been released). */
            fun releasedAt(releasedAt: OffsetDateTime?) =
                releasedAt(JsonField.ofNullable(releasedAt))

            /** When the hold was released (if it has been released). */
            fun releasedAt(releasedAt: Optional<OffsetDateTime>) =
                releasedAt(releasedAt.getOrNull())

            /** When the hold was released (if it has been released). */
            fun releasedAt(releasedAt: JsonField<OffsetDateTime>) = apply {
                this.releasedAt = releasedAt
            }

            /** The status of the hold. */
            fun status(status: Status) = status(JsonField.of(status))

            /** The status of the hold. */
            fun status(status: JsonField<Status>) = apply { this.status = status }

            /**
             * A constant representing the object's type. For this resource it will always be
             * `inbound_funds_hold`.
             */
            fun type(type: Type) = type(JsonField.of(type))

            /**
             * A constant representing the object's type. For this resource it will always be
             * `inbound_funds_hold`.
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
                    additionalProperties.toImmutable(),
                )
        }

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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Currency && value == other.value /* spotless:on */
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

            return /* spotless:off */ other is InboundFundsHold && id == other.id && amount == other.amount && automaticallyReleasesAt == other.automaticallyReleasesAt && createdAt == other.createdAt && currency == other.currency && heldTransactionId == other.heldTransactionId && pendingTransactionId == other.pendingTransactionId && releasedAt == other.releasedAt && status == other.status && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, amount, automaticallyReleasesAt, createdAt, currency, heldTransactionId, pendingTransactionId, releasedAt, status, type, additionalProperties) }
        /* spotless:on */

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

        return /* spotless:off */ other is CheckDeposit && id == other.id && accountId == other.accountId && amount == other.amount && backImageFileId == other.backImageFileId && createdAt == other.createdAt && depositAcceptance == other.depositAcceptance && depositRejection == other.depositRejection && depositReturn == other.depositReturn && depositSubmission == other.depositSubmission && description == other.description && frontImageFileId == other.frontImageFileId && idempotencyKey == other.idempotencyKey && inboundFundsHold == other.inboundFundsHold && inboundMailItemId == other.inboundMailItemId && lockboxId == other.lockboxId && status == other.status && transactionId == other.transactionId && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, accountId, amount, backImageFileId, createdAt, depositAcceptance, depositRejection, depositReturn, depositSubmission, description, frontImageFileId, idempotencyKey, inboundFundsHold, inboundMailItemId, lockboxId, status, transactionId, type, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CheckDeposit{id=$id, accountId=$accountId, amount=$amount, backImageFileId=$backImageFileId, createdAt=$createdAt, depositAcceptance=$depositAcceptance, depositRejection=$depositRejection, depositReturn=$depositReturn, depositSubmission=$depositSubmission, description=$description, frontImageFileId=$frontImageFileId, idempotencyKey=$idempotencyKey, inboundFundsHold=$inboundFundsHold, inboundMailItemId=$inboundMailItemId, lockboxId=$lockboxId, status=$status, transactionId=$transactionId, type=$type, additionalProperties=$additionalProperties}"
}
