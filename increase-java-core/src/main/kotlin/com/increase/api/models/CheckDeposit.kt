// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import java.util.UUID
import com.increase.api.core.BaseDeserializer
import com.increase.api.core.BaseSerializer
import com.increase.api.core.getOrThrow
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.JsonNull
import com.increase.api.core.JsonField
import com.increase.api.core.Enum
import com.increase.api.core.toUnmodifiable
import com.increase.api.core.NoAutoDetect
import com.increase.api.errors.IncreaseInvalidDataException

/** Check Deposits allow you to deposit images of paper checks into your account. */
@JsonDeserialize(builder = CheckDeposit.Builder::class)
@NoAutoDetect
class CheckDeposit private constructor(
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
  private val id: JsonField<String>,
  private val idempotencyKey: JsonField<String>,
  private val inboundFundsHold: JsonField<InboundFundsHold>,
  private val inboundMailItemId: JsonField<String>,
  private val lockboxId: JsonField<String>,
  private val status: JsonField<Status>,
  private val transactionId: JsonField<String>,
  private val type: JsonField<Type>,
  private val additionalProperties: Map<String, JsonValue>,

) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** The Account the check was deposited into. */
    fun accountId(): String = accountId.getRequired("account_id")

    /**
     * The deposited amount in the minor unit of the destination account currency. For
     * dollars, for example, this is cents.
     */
    fun amount(): Long = amount.getRequired("amount")

    /** The ID for the File containing the image of the back of the check. */
    fun backImageFileId(): Optional<String> = Optional.ofNullable(backImageFileId.getNullable("back_image_file_id"))

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which
     * the transfer was created.
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * If your deposit is successfully parsed and accepted by Increase, this will
     * contain details of the parsed check.
     */
    fun depositAcceptance(): Optional<DepositAcceptance> = Optional.ofNullable(depositAcceptance.getNullable("deposit_acceptance"))

    /**
     * If your deposit is rejected by Increase, this will contain details as to why it
     * was rejected.
     */
    fun depositRejection(): Optional<DepositRejection> = Optional.ofNullable(depositRejection.getNullable("deposit_rejection"))

    /**
     * If your deposit is returned, this will contain details as to why it was
     * returned.
     */
    fun depositReturn(): Optional<DepositReturn> = Optional.ofNullable(depositReturn.getNullable("deposit_return"))

    /**
     * After the check is parsed, it is submitted to the Check21 network for
     * processing. This will contain details of the submission.
     */
    fun depositSubmission(): Optional<DepositSubmission> = Optional.ofNullable(depositSubmission.getNullable("deposit_submission"))

    /** The description of the Check Deposit, for display purposes only. */
    fun description(): Optional<String> = Optional.ofNullable(description.getNullable("description"))

    /** The ID for the File containing the image of the front of the check. */
    fun frontImageFileId(): String = frontImageFileId.getRequired("front_image_file_id")

    /** The deposit's identifier. */
    fun id(): String = id.getRequired("id")

    /**
     * The idempotency key you chose for this object. This value is unique across
     * Increase and is used to ensure that a request is only processed once. Learn more
     * about [idempotency](https://increase.com/documentation/idempotency-keys).
     */
    fun idempotencyKey(): Optional<String> = Optional.ofNullable(idempotencyKey.getNullable("idempotency_key"))

    /**
     * Increase will sometimes hold the funds for Check Deposits. If funds are held,
     * this sub-object will contain details of the hold.
     */
    fun inboundFundsHold(): Optional<InboundFundsHold> = Optional.ofNullable(inboundFundsHold.getNullable("inbound_funds_hold"))

    /**
     * If the Check Deposit was the result of an Inbound Mail Item, this will contain
     * the identifier of the Inbound Mail Item.
     */
    fun inboundMailItemId(): Optional<String> = Optional.ofNullable(inboundMailItemId.getNullable("inbound_mail_item_id"))

    /**
     * If the Check Deposit was the result of an Inbound Mail Item, this will contain
     * the identifier of the Lockbox that received it.
     */
    fun lockboxId(): Optional<String> = Optional.ofNullable(lockboxId.getNullable("lockbox_id"))

    /** The status of the Check Deposit. */
    fun status(): Status = status.getRequired("status")

    /** The ID for the Transaction created by the deposit. */
    fun transactionId(): Optional<String> = Optional.ofNullable(transactionId.getNullable("transaction_id"))

    /**
     * A constant representing the object's type. For this resource it will always be
     * `check_deposit`.
     */
    fun type(): Type = type.getRequired("type")

    /** The Account the check was deposited into. */
    @JsonProperty("account_id")
    @ExcludeMissing
    fun _accountId() = accountId

    /**
     * The deposited amount in the minor unit of the destination account currency. For
     * dollars, for example, this is cents.
     */
    @JsonProperty("amount")
    @ExcludeMissing
    fun _amount() = amount

    /** The ID for the File containing the image of the back of the check. */
    @JsonProperty("back_image_file_id")
    @ExcludeMissing
    fun _backImageFileId() = backImageFileId

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which
     * the transfer was created.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt() = createdAt

    /**
     * If your deposit is successfully parsed and accepted by Increase, this will
     * contain details of the parsed check.
     */
    @JsonProperty("deposit_acceptance")
    @ExcludeMissing
    fun _depositAcceptance() = depositAcceptance

    /**
     * If your deposit is rejected by Increase, this will contain details as to why it
     * was rejected.
     */
    @JsonProperty("deposit_rejection")
    @ExcludeMissing
    fun _depositRejection() = depositRejection

    /**
     * If your deposit is returned, this will contain details as to why it was
     * returned.
     */
    @JsonProperty("deposit_return")
    @ExcludeMissing
    fun _depositReturn() = depositReturn

    /**
     * After the check is parsed, it is submitted to the Check21 network for
     * processing. This will contain details of the submission.
     */
    @JsonProperty("deposit_submission")
    @ExcludeMissing
    fun _depositSubmission() = depositSubmission

    /** The description of the Check Deposit, for display purposes only. */
    @JsonProperty("description")
    @ExcludeMissing
    fun _description() = description

    /** The ID for the File containing the image of the front of the check. */
    @JsonProperty("front_image_file_id")
    @ExcludeMissing
    fun _frontImageFileId() = frontImageFileId

    /** The deposit's identifier. */
    @JsonProperty("id")
    @ExcludeMissing
    fun _id() = id

    /**
     * The idempotency key you chose for this object. This value is unique across
     * Increase and is used to ensure that a request is only processed once. Learn more
     * about [idempotency](https://increase.com/documentation/idempotency-keys).
     */
    @JsonProperty("idempotency_key")
    @ExcludeMissing
    fun _idempotencyKey() = idempotencyKey

    /**
     * Increase will sometimes hold the funds for Check Deposits. If funds are held,
     * this sub-object will contain details of the hold.
     */
    @JsonProperty("inbound_funds_hold")
    @ExcludeMissing
    fun _inboundFundsHold() = inboundFundsHold

    /**
     * If the Check Deposit was the result of an Inbound Mail Item, this will contain
     * the identifier of the Inbound Mail Item.
     */
    @JsonProperty("inbound_mail_item_id")
    @ExcludeMissing
    fun _inboundMailItemId() = inboundMailItemId

    /**
     * If the Check Deposit was the result of an Inbound Mail Item, this will contain
     * the identifier of the Lockbox that received it.
     */
    @JsonProperty("lockbox_id")
    @ExcludeMissing
    fun _lockboxId() = lockboxId

    /** The status of the Check Deposit. */
    @JsonProperty("status")
    @ExcludeMissing
    fun _status() = status

    /** The ID for the Transaction created by the deposit. */
    @JsonProperty("transaction_id")
    @ExcludeMissing
    fun _transactionId() = transactionId

    /**
     * A constant representing the object's type. For this resource it will always be
     * `check_deposit`.
     */
    @JsonProperty("type")
    @ExcludeMissing
    fun _type() = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): CheckDeposit = apply {
        if (!validated) {
          accountId()
          amount()
          backImageFileId()
          createdAt()
          depositAcceptance().map { it.validate() }
          depositRejection().map { it.validate() }
          depositReturn().map { it.validate() }
          depositSubmission().map { it.validate() }
          description()
          frontImageFileId()
          id()
          idempotencyKey()
          inboundFundsHold().map { it.validate() }
          inboundMailItemId()
          lockboxId()
          status()
          transactionId()
          type()
          validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return other is CheckDeposit &&
          this.accountId == other.accountId &&
          this.amount == other.amount &&
          this.backImageFileId == other.backImageFileId &&
          this.createdAt == other.createdAt &&
          this.depositAcceptance == other.depositAcceptance &&
          this.depositRejection == other.depositRejection &&
          this.depositReturn == other.depositReturn &&
          this.depositSubmission == other.depositSubmission &&
          this.description == other.description &&
          this.frontImageFileId == other.frontImageFileId &&
          this.id == other.id &&
          this.idempotencyKey == other.idempotencyKey &&
          this.inboundFundsHold == other.inboundFundsHold &&
          this.inboundMailItemId == other.inboundMailItemId &&
          this.lockboxId == other.lockboxId &&
          this.status == other.status &&
          this.transactionId == other.transactionId &&
          this.type == other.type &&
          this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
      if (hashCode == 0) {
        hashCode = Objects.hash(
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
            id,
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
      return hashCode
    }

    override fun toString() = "CheckDeposit{accountId=$accountId, amount=$amount, backImageFileId=$backImageFileId, createdAt=$createdAt, depositAcceptance=$depositAcceptance, depositRejection=$depositRejection, depositReturn=$depositReturn, depositSubmission=$depositSubmission, description=$description, frontImageFileId=$frontImageFileId, id=$id, idempotencyKey=$idempotencyKey, inboundFundsHold=$inboundFundsHold, inboundMailItemId=$inboundMailItemId, lockboxId=$lockboxId, status=$status, transactionId=$transactionId, type=$type, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic
        fun builder() = Builder()
    }

    class Builder {

        private var accountId: JsonField<String> = JsonMissing.of()
        private var amount: JsonField<Long> = JsonMissing.of()
        private var backImageFileId: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var depositAcceptance: JsonField<DepositAcceptance> = JsonMissing.of()
        private var depositRejection: JsonField<DepositRejection> = JsonMissing.of()
        private var depositReturn: JsonField<DepositReturn> = JsonMissing.of()
        private var depositSubmission: JsonField<DepositSubmission> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var frontImageFileId: JsonField<String> = JsonMissing.of()
        private var id: JsonField<String> = JsonMissing.of()
        private var idempotencyKey: JsonField<String> = JsonMissing.of()
        private var inboundFundsHold: JsonField<InboundFundsHold> = JsonMissing.of()
        private var inboundMailItemId: JsonField<String> = JsonMissing.of()
        private var lockboxId: JsonField<String> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var transactionId: JsonField<String> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(checkDeposit: CheckDeposit) = apply {
            this.accountId = checkDeposit.accountId
            this.amount = checkDeposit.amount
            this.backImageFileId = checkDeposit.backImageFileId
            this.createdAt = checkDeposit.createdAt
            this.depositAcceptance = checkDeposit.depositAcceptance
            this.depositRejection = checkDeposit.depositRejection
            this.depositReturn = checkDeposit.depositReturn
            this.depositSubmission = checkDeposit.depositSubmission
            this.description = checkDeposit.description
            this.frontImageFileId = checkDeposit.frontImageFileId
            this.id = checkDeposit.id
            this.idempotencyKey = checkDeposit.idempotencyKey
            this.inboundFundsHold = checkDeposit.inboundFundsHold
            this.inboundMailItemId = checkDeposit.inboundMailItemId
            this.lockboxId = checkDeposit.lockboxId
            this.status = checkDeposit.status
            this.transactionId = checkDeposit.transactionId
            this.type = checkDeposit.type
            additionalProperties(checkDeposit.additionalProperties)
        }

        /** The Account the check was deposited into. */
        fun accountId(accountId: String) = accountId(JsonField.of(accountId))

        /** The Account the check was deposited into. */
        @JsonProperty("account_id")
        @ExcludeMissing
        fun accountId(accountId: JsonField<String>) = apply {
            this.accountId = accountId
        }

        /**
         * The deposited amount in the minor unit of the destination account currency. For
         * dollars, for example, this is cents.
         */
        fun amount(amount: Long) = amount(JsonField.of(amount))

        /**
         * The deposited amount in the minor unit of the destination account currency. For
         * dollars, for example, this is cents.
         */
        @JsonProperty("amount")
        @ExcludeMissing
        fun amount(amount: JsonField<Long>) = apply {
            this.amount = amount
        }

        /** The ID for the File containing the image of the back of the check. */
        fun backImageFileId(backImageFileId: String) = backImageFileId(JsonField.of(backImageFileId))

        /** The ID for the File containing the image of the back of the check. */
        @JsonProperty("back_image_file_id")
        @ExcludeMissing
        fun backImageFileId(backImageFileId: JsonField<String>) = apply {
            this.backImageFileId = backImageFileId
        }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which
         * the transfer was created.
         */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which
         * the transfer was created.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
            this.createdAt = createdAt
        }

        /**
         * If your deposit is successfully parsed and accepted by Increase, this will
         * contain details of the parsed check.
         */
        fun depositAcceptance(depositAcceptance: DepositAcceptance) = depositAcceptance(JsonField.of(depositAcceptance))

        /**
         * If your deposit is successfully parsed and accepted by Increase, this will
         * contain details of the parsed check.
         */
        @JsonProperty("deposit_acceptance")
        @ExcludeMissing
        fun depositAcceptance(depositAcceptance: JsonField<DepositAcceptance>) = apply {
            this.depositAcceptance = depositAcceptance
        }

        /**
         * If your deposit is rejected by Increase, this will contain details as to why it
         * was rejected.
         */
        fun depositRejection(depositRejection: DepositRejection) = depositRejection(JsonField.of(depositRejection))

        /**
         * If your deposit is rejected by Increase, this will contain details as to why it
         * was rejected.
         */
        @JsonProperty("deposit_rejection")
        @ExcludeMissing
        fun depositRejection(depositRejection: JsonField<DepositRejection>) = apply {
            this.depositRejection = depositRejection
        }

        /**
         * If your deposit is returned, this will contain details as to why it was
         * returned.
         */
        fun depositReturn(depositReturn: DepositReturn) = depositReturn(JsonField.of(depositReturn))

        /**
         * If your deposit is returned, this will contain details as to why it was
         * returned.
         */
        @JsonProperty("deposit_return")
        @ExcludeMissing
        fun depositReturn(depositReturn: JsonField<DepositReturn>) = apply {
            this.depositReturn = depositReturn
        }

        /**
         * After the check is parsed, it is submitted to the Check21 network for
         * processing. This will contain details of the submission.
         */
        fun depositSubmission(depositSubmission: DepositSubmission) = depositSubmission(JsonField.of(depositSubmission))

        /**
         * After the check is parsed, it is submitted to the Check21 network for
         * processing. This will contain details of the submission.
         */
        @JsonProperty("deposit_submission")
        @ExcludeMissing
        fun depositSubmission(depositSubmission: JsonField<DepositSubmission>) = apply {
            this.depositSubmission = depositSubmission
        }

        /** The description of the Check Deposit, for display purposes only. */
        fun description(description: String) = description(JsonField.of(description))

        /** The description of the Check Deposit, for display purposes only. */
        @JsonProperty("description")
        @ExcludeMissing
        fun description(description: JsonField<String>) = apply {
            this.description = description
        }

        /** The ID for the File containing the image of the front of the check. */
        fun frontImageFileId(frontImageFileId: String) = frontImageFileId(JsonField.of(frontImageFileId))

        /** The ID for the File containing the image of the front of the check. */
        @JsonProperty("front_image_file_id")
        @ExcludeMissing
        fun frontImageFileId(frontImageFileId: JsonField<String>) = apply {
            this.frontImageFileId = frontImageFileId
        }

        /** The deposit's identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The deposit's identifier. */
        @JsonProperty("id")
        @ExcludeMissing
        fun id(id: JsonField<String>) = apply {
            this.id = id
        }

        /**
         * The idempotency key you chose for this object. This value is unique across
         * Increase and is used to ensure that a request is only processed once. Learn more
         * about [idempotency](https://increase.com/documentation/idempotency-keys).
         */
        fun idempotencyKey(idempotencyKey: String) = idempotencyKey(JsonField.of(idempotencyKey))

        /**
         * The idempotency key you chose for this object. This value is unique across
         * Increase and is used to ensure that a request is only processed once. Learn more
         * about [idempotency](https://increase.com/documentation/idempotency-keys).
         */
        @JsonProperty("idempotency_key")
        @ExcludeMissing
        fun idempotencyKey(idempotencyKey: JsonField<String>) = apply {
            this.idempotencyKey = idempotencyKey
        }

        /**
         * Increase will sometimes hold the funds for Check Deposits. If funds are held,
         * this sub-object will contain details of the hold.
         */
        fun inboundFundsHold(inboundFundsHold: InboundFundsHold) = inboundFundsHold(JsonField.of(inboundFundsHold))

        /**
         * Increase will sometimes hold the funds for Check Deposits. If funds are held,
         * this sub-object will contain details of the hold.
         */
        @JsonProperty("inbound_funds_hold")
        @ExcludeMissing
        fun inboundFundsHold(inboundFundsHold: JsonField<InboundFundsHold>) = apply {
            this.inboundFundsHold = inboundFundsHold
        }

        /**
         * If the Check Deposit was the result of an Inbound Mail Item, this will contain
         * the identifier of the Inbound Mail Item.
         */
        fun inboundMailItemId(inboundMailItemId: String) = inboundMailItemId(JsonField.of(inboundMailItemId))

        /**
         * If the Check Deposit was the result of an Inbound Mail Item, this will contain
         * the identifier of the Inbound Mail Item.
         */
        @JsonProperty("inbound_mail_item_id")
        @ExcludeMissing
        fun inboundMailItemId(inboundMailItemId: JsonField<String>) = apply {
            this.inboundMailItemId = inboundMailItemId
        }

        /**
         * If the Check Deposit was the result of an Inbound Mail Item, this will contain
         * the identifier of the Lockbox that received it.
         */
        fun lockboxId(lockboxId: String) = lockboxId(JsonField.of(lockboxId))

        /**
         * If the Check Deposit was the result of an Inbound Mail Item, this will contain
         * the identifier of the Lockbox that received it.
         */
        @JsonProperty("lockbox_id")
        @ExcludeMissing
        fun lockboxId(lockboxId: JsonField<String>) = apply {
            this.lockboxId = lockboxId
        }

        /** The status of the Check Deposit. */
        fun status(status: Status) = status(JsonField.of(status))

        /** The status of the Check Deposit. */
        @JsonProperty("status")
        @ExcludeMissing
        fun status(status: JsonField<Status>) = apply {
            this.status = status
        }

        /** The ID for the Transaction created by the deposit. */
        fun transactionId(transactionId: String) = transactionId(JsonField.of(transactionId))

        /** The ID for the Transaction created by the deposit. */
        @JsonProperty("transaction_id")
        @ExcludeMissing
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
        @JsonProperty("type")
        @ExcludeMissing
        fun type(type: JsonField<Type>) = apply {
            this.type = type
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

        fun build(): CheckDeposit = CheckDeposit(
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
            id,
            idempotencyKey,
            inboundFundsHold,
            inboundMailItemId,
            lockboxId,
            status,
            transactionId,
            type,
            additionalProperties.toUnmodifiable(),
        )
    }

    /**
     * If your deposit is successfully parsed and accepted by Increase, this will
     * contain details of the parsed check.
     */
    @JsonDeserialize(builder = DepositAcceptance.Builder::class)
    @NoAutoDetect
    class DepositAcceptance private constructor(
      private val accountNumber: JsonField<String>,
      private val amount: JsonField<Long>,
      private val auxiliaryOnUs: JsonField<String>,
      private val checkDepositId: JsonField<String>,
      private val currency: JsonField<Currency>,
      private val routingNumber: JsonField<String>,
      private val serialNumber: JsonField<String>,
      private val additionalProperties: Map<String, JsonValue>,

    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /** The account number printed on the check. */
        fun accountNumber(): String = accountNumber.getRequired("account_number")

        /**
         * The amount to be deposited in the minor unit of the transaction's currency. For
         * dollars, for example, this is cents.
         */
        fun amount(): Long = amount.getRequired("amount")

        /**
         * An additional line of metadata printed on the check. This typically includes the
         * check number for business checks.
         */
        fun auxiliaryOnUs(): Optional<String> = Optional.ofNullable(auxiliaryOnUs.getNullable("auxiliary_on_us"))

        /** The ID of the Check Deposit that was accepted. */
        fun checkDepositId(): String = checkDepositId.getRequired("check_deposit_id")

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
         * transaction's currency.
         */
        fun currency(): Currency = currency.getRequired("currency")

        /** The routing number printed on the check. */
        fun routingNumber(): String = routingNumber.getRequired("routing_number")

        /**
         * The check serial number, if present, for consumer checks. For business checks,
         * the serial number is usually in the `auxiliary_on_us` field.
         */
        fun serialNumber(): Optional<String> = Optional.ofNullable(serialNumber.getNullable("serial_number"))

        /** The account number printed on the check. */
        @JsonProperty("account_number")
        @ExcludeMissing
        fun _accountNumber() = accountNumber

        /**
         * The amount to be deposited in the minor unit of the transaction's currency. For
         * dollars, for example, this is cents.
         */
        @JsonProperty("amount")
        @ExcludeMissing
        fun _amount() = amount

        /**
         * An additional line of metadata printed on the check. This typically includes the
         * check number for business checks.
         */
        @JsonProperty("auxiliary_on_us")
        @ExcludeMissing
        fun _auxiliaryOnUs() = auxiliaryOnUs

        /** The ID of the Check Deposit that was accepted. */
        @JsonProperty("check_deposit_id")
        @ExcludeMissing
        fun _checkDepositId() = checkDepositId

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
         * transaction's currency.
         */
        @JsonProperty("currency")
        @ExcludeMissing
        fun _currency() = currency

        /** The routing number printed on the check. */
        @JsonProperty("routing_number")
        @ExcludeMissing
        fun _routingNumber() = routingNumber

        /**
         * The check serial number, if present, for consumer checks. For business checks,
         * the serial number is usually in the `auxiliary_on_us` field.
         */
        @JsonProperty("serial_number")
        @ExcludeMissing
        fun _serialNumber() = serialNumber

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): DepositAcceptance = apply {
            if (!validated) {
              accountNumber()
              amount()
              auxiliaryOnUs()
              checkDepositId()
              currency()
              routingNumber()
              serialNumber()
              validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is DepositAcceptance &&
              this.accountNumber == other.accountNumber &&
              this.amount == other.amount &&
              this.auxiliaryOnUs == other.auxiliaryOnUs &&
              this.checkDepositId == other.checkDepositId &&
              this.currency == other.currency &&
              this.routingNumber == other.routingNumber &&
              this.serialNumber == other.serialNumber &&
              this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
          if (hashCode == 0) {
            hashCode = Objects.hash(
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
          return hashCode
        }

        override fun toString() = "DepositAcceptance{accountNumber=$accountNumber, amount=$amount, auxiliaryOnUs=$auxiliaryOnUs, checkDepositId=$checkDepositId, currency=$currency, routingNumber=$routingNumber, serialNumber=$serialNumber, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic
            fun builder() = Builder()
        }

        class Builder {

            private var accountNumber: JsonField<String> = JsonMissing.of()
            private var amount: JsonField<Long> = JsonMissing.of()
            private var auxiliaryOnUs: JsonField<String> = JsonMissing.of()
            private var checkDepositId: JsonField<String> = JsonMissing.of()
            private var currency: JsonField<Currency> = JsonMissing.of()
            private var routingNumber: JsonField<String> = JsonMissing.of()
            private var serialNumber: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(depositAcceptance: DepositAcceptance) = apply {
                this.accountNumber = depositAcceptance.accountNumber
                this.amount = depositAcceptance.amount
                this.auxiliaryOnUs = depositAcceptance.auxiliaryOnUs
                this.checkDepositId = depositAcceptance.checkDepositId
                this.currency = depositAcceptance.currency
                this.routingNumber = depositAcceptance.routingNumber
                this.serialNumber = depositAcceptance.serialNumber
                additionalProperties(depositAcceptance.additionalProperties)
            }

            /** The account number printed on the check. */
            fun accountNumber(accountNumber: String) = accountNumber(JsonField.of(accountNumber))

            /** The account number printed on the check. */
            @JsonProperty("account_number")
            @ExcludeMissing
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
            @JsonProperty("amount")
            @ExcludeMissing
            fun amount(amount: JsonField<Long>) = apply {
                this.amount = amount
            }

            /**
             * An additional line of metadata printed on the check. This typically includes the
             * check number for business checks.
             */
            fun auxiliaryOnUs(auxiliaryOnUs: String) = auxiliaryOnUs(JsonField.of(auxiliaryOnUs))

            /**
             * An additional line of metadata printed on the check. This typically includes the
             * check number for business checks.
             */
            @JsonProperty("auxiliary_on_us")
            @ExcludeMissing
            fun auxiliaryOnUs(auxiliaryOnUs: JsonField<String>) = apply {
                this.auxiliaryOnUs = auxiliaryOnUs
            }

            /** The ID of the Check Deposit that was accepted. */
            fun checkDepositId(checkDepositId: String) = checkDepositId(JsonField.of(checkDepositId))

            /** The ID of the Check Deposit that was accepted. */
            @JsonProperty("check_deposit_id")
            @ExcludeMissing
            fun checkDepositId(checkDepositId: JsonField<String>) = apply {
                this.checkDepositId = checkDepositId
            }

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
             * transaction's currency.
             */
            fun currency(currency: Currency) = currency(JsonField.of(currency))

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
             * transaction's currency.
             */
            @JsonProperty("currency")
            @ExcludeMissing
            fun currency(currency: JsonField<Currency>) = apply {
                this.currency = currency
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
             * The check serial number, if present, for consumer checks. For business checks,
             * the serial number is usually in the `auxiliary_on_us` field.
             */
            fun serialNumber(serialNumber: String) = serialNumber(JsonField.of(serialNumber))

            /**
             * The check serial number, if present, for consumer checks. For business checks,
             * the serial number is usually in the `auxiliary_on_us` field.
             */
            @JsonProperty("serial_number")
            @ExcludeMissing
            fun serialNumber(serialNumber: JsonField<String>) = apply {
                this.serialNumber = serialNumber
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

            fun build(): DepositAcceptance = DepositAcceptance(
                accountNumber,
                amount,
                auxiliaryOnUs,
                checkDepositId,
                currency,
                routingNumber,
                serialNumber,
                additionalProperties.toUnmodifiable(),
            )
        }

        class Currency @JsonCreator private constructor(private val value: JsonField<String>, ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue
            fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
              if (this === other) {
                  return true
              }

              return other is Currency &&
                  this.value == other.value
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

            fun value(): Value = when (this) {
                CAD -> Value.CAD
                CHF -> Value.CHF
                EUR -> Value.EUR
                GBP -> Value.GBP
                JPY -> Value.JPY
                USD -> Value.USD
                else -> Value._UNKNOWN
            }

            fun known(): Known = when (this) {
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
    }

    /**
     * If your deposit is rejected by Increase, this will contain details as to why it
     * was rejected.
     */
    @JsonDeserialize(builder = DepositRejection.Builder::class)
    @NoAutoDetect
    class DepositRejection private constructor(
      private val amount: JsonField<Long>,
      private val checkDepositId: JsonField<String>,
      private val currency: JsonField<Currency>,
      private val reason: JsonField<Reason>,
      private val rejectedAt: JsonField<OffsetDateTime>,
      private val additionalProperties: Map<String, JsonValue>,

    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /**
         * The rejected amount in the minor unit of check's currency. For dollars, for
         * example, this is cents.
         */
        fun amount(): Long = amount.getRequired("amount")

        /** The identifier of the Check Deposit that was rejected. */
        fun checkDepositId(): String = checkDepositId.getRequired("check_deposit_id")

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the check's
         * currency.
         */
        fun currency(): Currency = currency.getRequired("currency")

        /** Why the check deposit was rejected. */
        fun reason(): Reason = reason.getRequired("reason")

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which
         * the check deposit was rejected.
         */
        fun rejectedAt(): OffsetDateTime = rejectedAt.getRequired("rejected_at")

        /**
         * The rejected amount in the minor unit of check's currency. For dollars, for
         * example, this is cents.
         */
        @JsonProperty("amount")
        @ExcludeMissing
        fun _amount() = amount

        /** The identifier of the Check Deposit that was rejected. */
        @JsonProperty("check_deposit_id")
        @ExcludeMissing
        fun _checkDepositId() = checkDepositId

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the check's
         * currency.
         */
        @JsonProperty("currency")
        @ExcludeMissing
        fun _currency() = currency

        /** Why the check deposit was rejected. */
        @JsonProperty("reason")
        @ExcludeMissing
        fun _reason() = reason

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which
         * the check deposit was rejected.
         */
        @JsonProperty("rejected_at")
        @ExcludeMissing
        fun _rejectedAt() = rejectedAt

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): DepositRejection = apply {
            if (!validated) {
              amount()
              checkDepositId()
              currency()
              reason()
              rejectedAt()
              validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is DepositRejection &&
              this.amount == other.amount &&
              this.checkDepositId == other.checkDepositId &&
              this.currency == other.currency &&
              this.reason == other.reason &&
              this.rejectedAt == other.rejectedAt &&
              this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
          if (hashCode == 0) {
            hashCode = Objects.hash(
                amount,
                checkDepositId,
                currency,
                reason,
                rejectedAt,
                additionalProperties,
            )
          }
          return hashCode
        }

        override fun toString() = "DepositRejection{amount=$amount, checkDepositId=$checkDepositId, currency=$currency, reason=$reason, rejectedAt=$rejectedAt, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic
            fun builder() = Builder()
        }

        class Builder {

            private var amount: JsonField<Long> = JsonMissing.of()
            private var checkDepositId: JsonField<String> = JsonMissing.of()
            private var currency: JsonField<Currency> = JsonMissing.of()
            private var reason: JsonField<Reason> = JsonMissing.of()
            private var rejectedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(depositRejection: DepositRejection) = apply {
                this.amount = depositRejection.amount
                this.checkDepositId = depositRejection.checkDepositId
                this.currency = depositRejection.currency
                this.reason = depositRejection.reason
                this.rejectedAt = depositRejection.rejectedAt
                additionalProperties(depositRejection.additionalProperties)
            }

            /**
             * The rejected amount in the minor unit of check's currency. For dollars, for
             * example, this is cents.
             */
            fun amount(amount: Long) = amount(JsonField.of(amount))

            /**
             * The rejected amount in the minor unit of check's currency. For dollars, for
             * example, this is cents.
             */
            @JsonProperty("amount")
            @ExcludeMissing
            fun amount(amount: JsonField<Long>) = apply {
                this.amount = amount
            }

            /** The identifier of the Check Deposit that was rejected. */
            fun checkDepositId(checkDepositId: String) = checkDepositId(JsonField.of(checkDepositId))

            /** The identifier of the Check Deposit that was rejected. */
            @JsonProperty("check_deposit_id")
            @ExcludeMissing
            fun checkDepositId(checkDepositId: JsonField<String>) = apply {
                this.checkDepositId = checkDepositId
            }

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the check's
             * currency.
             */
            fun currency(currency: Currency) = currency(JsonField.of(currency))

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the check's
             * currency.
             */
            @JsonProperty("currency")
            @ExcludeMissing
            fun currency(currency: JsonField<Currency>) = apply {
                this.currency = currency
            }

            /** Why the check deposit was rejected. */
            fun reason(reason: Reason) = reason(JsonField.of(reason))

            /** Why the check deposit was rejected. */
            @JsonProperty("reason")
            @ExcludeMissing
            fun reason(reason: JsonField<Reason>) = apply {
                this.reason = reason
            }

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which
             * the check deposit was rejected.
             */
            fun rejectedAt(rejectedAt: OffsetDateTime) = rejectedAt(JsonField.of(rejectedAt))

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which
             * the check deposit was rejected.
             */
            @JsonProperty("rejected_at")
            @ExcludeMissing
            fun rejectedAt(rejectedAt: JsonField<OffsetDateTime>) = apply {
                this.rejectedAt = rejectedAt
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

            fun build(): DepositRejection = DepositRejection(
                amount,
                checkDepositId,
                currency,
                reason,
                rejectedAt,
                additionalProperties.toUnmodifiable(),
            )
        }

        class Currency @JsonCreator private constructor(private val value: JsonField<String>, ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue
            fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
              if (this === other) {
                  return true
              }

              return other is Currency &&
                  this.value == other.value
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

            fun value(): Value = when (this) {
                CAD -> Value.CAD
                CHF -> Value.CHF
                EUR -> Value.EUR
                GBP -> Value.GBP
                JPY -> Value.JPY
                USD -> Value.USD
                else -> Value._UNKNOWN
            }

            fun known(): Known = when (this) {
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

        class Reason @JsonCreator private constructor(private val value: JsonField<String>, ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue
            fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
              if (this === other) {
                  return true
              }

              return other is Reason &&
                  this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val INCOMPLETE_IMAGE = Reason(JsonField.of("incomplete_image"))

                @JvmField val DUPLICATE = Reason(JsonField.of("duplicate"))

                @JvmField val POOR_IMAGE_QUALITY = Reason(JsonField.of("poor_image_quality"))

                @JvmField val INCORRECT_AMOUNT = Reason(JsonField.of("incorrect_amount"))

                @JvmField val INCORRECT_RECIPIENT = Reason(JsonField.of("incorrect_recipient"))

                @JvmField val NOT_ELIGIBLE_FOR_MOBILE_DEPOSIT = Reason(JsonField.of("not_eligible_for_mobile_deposit"))

                @JvmField val MISSING_REQUIRED_DATA_ELEMENTS = Reason(JsonField.of("missing_required_data_elements"))

                @JvmField val SUSPECTED_FRAUD = Reason(JsonField.of("suspected_fraud"))

                @JvmField val DEPOSIT_WINDOW_EXPIRED = Reason(JsonField.of("deposit_window_expired"))

                @JvmField val UNKNOWN = Reason(JsonField.of("unknown"))

                @JvmStatic fun of(value: String) = Reason(JsonField.of(value))
            }

            enum class Known {
                INCOMPLETE_IMAGE,
                DUPLICATE,
                POOR_IMAGE_QUALITY,
                INCORRECT_AMOUNT,
                INCORRECT_RECIPIENT,
                NOT_ELIGIBLE_FOR_MOBILE_DEPOSIT,
                MISSING_REQUIRED_DATA_ELEMENTS,
                SUSPECTED_FRAUD,
                DEPOSIT_WINDOW_EXPIRED,
                UNKNOWN,
            }

            enum class Value {
                INCOMPLETE_IMAGE,
                DUPLICATE,
                POOR_IMAGE_QUALITY,
                INCORRECT_AMOUNT,
                INCORRECT_RECIPIENT,
                NOT_ELIGIBLE_FOR_MOBILE_DEPOSIT,
                MISSING_REQUIRED_DATA_ELEMENTS,
                SUSPECTED_FRAUD,
                DEPOSIT_WINDOW_EXPIRED,
                UNKNOWN,
                _UNKNOWN,
            }

            fun value(): Value = when (this) {
                INCOMPLETE_IMAGE -> Value.INCOMPLETE_IMAGE
                DUPLICATE -> Value.DUPLICATE
                POOR_IMAGE_QUALITY -> Value.POOR_IMAGE_QUALITY
                INCORRECT_AMOUNT -> Value.INCORRECT_AMOUNT
                INCORRECT_RECIPIENT -> Value.INCORRECT_RECIPIENT
                NOT_ELIGIBLE_FOR_MOBILE_DEPOSIT -> Value.NOT_ELIGIBLE_FOR_MOBILE_DEPOSIT
                MISSING_REQUIRED_DATA_ELEMENTS -> Value.MISSING_REQUIRED_DATA_ELEMENTS
                SUSPECTED_FRAUD -> Value.SUSPECTED_FRAUD
                DEPOSIT_WINDOW_EXPIRED -> Value.DEPOSIT_WINDOW_EXPIRED
                UNKNOWN -> Value.UNKNOWN
                else -> Value._UNKNOWN
            }

            fun known(): Known = when (this) {
                INCOMPLETE_IMAGE -> Known.INCOMPLETE_IMAGE
                DUPLICATE -> Known.DUPLICATE
                POOR_IMAGE_QUALITY -> Known.POOR_IMAGE_QUALITY
                INCORRECT_AMOUNT -> Known.INCORRECT_AMOUNT
                INCORRECT_RECIPIENT -> Known.INCORRECT_RECIPIENT
                NOT_ELIGIBLE_FOR_MOBILE_DEPOSIT -> Known.NOT_ELIGIBLE_FOR_MOBILE_DEPOSIT
                MISSING_REQUIRED_DATA_ELEMENTS -> Known.MISSING_REQUIRED_DATA_ELEMENTS
                SUSPECTED_FRAUD -> Known.SUSPECTED_FRAUD
                DEPOSIT_WINDOW_EXPIRED -> Known.DEPOSIT_WINDOW_EXPIRED
                UNKNOWN -> Known.UNKNOWN
                else -> throw IncreaseInvalidDataException("Unknown Reason: $value")
            }

            fun asString(): String = _value().asStringOrThrow()
        }
    }

    /**
     * If your deposit is returned, this will contain details as to why it was
     * returned.
     */
    @JsonDeserialize(builder = DepositReturn.Builder::class)
    @NoAutoDetect
    class DepositReturn private constructor(
      private val amount: JsonField<Long>,
      private val checkDepositId: JsonField<String>,
      private val currency: JsonField<Currency>,
      private val returnReason: JsonField<ReturnReason>,
      private val returnedAt: JsonField<OffsetDateTime>,
      private val transactionId: JsonField<String>,
      private val additionalProperties: Map<String, JsonValue>,

    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /**
         * The amount in the minor unit of the transaction's currency. For dollars, for
         * example, this is cents.
         */
        fun amount(): Long = amount.getRequired("amount")

        /** The identifier of the Check Deposit that was returned. */
        fun checkDepositId(): String = checkDepositId.getRequired("check_deposit_id")

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
         * transaction's currency.
         */
        fun currency(): Currency = currency.getRequired("currency")

        /**
         * Why this check was returned by the bank holding the account it was drawn
         * against.
         */
        fun returnReason(): ReturnReason = returnReason.getRequired("return_reason")

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which
         * the check deposit was returned.
         */
        fun returnedAt(): OffsetDateTime = returnedAt.getRequired("returned_at")

        /**
         * The identifier of the transaction that reversed the original check deposit
         * transaction.
         */
        fun transactionId(): String = transactionId.getRequired("transaction_id")

        /**
         * The amount in the minor unit of the transaction's currency. For dollars, for
         * example, this is cents.
         */
        @JsonProperty("amount")
        @ExcludeMissing
        fun _amount() = amount

        /** The identifier of the Check Deposit that was returned. */
        @JsonProperty("check_deposit_id")
        @ExcludeMissing
        fun _checkDepositId() = checkDepositId

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
         * transaction's currency.
         */
        @JsonProperty("currency")
        @ExcludeMissing
        fun _currency() = currency

        /**
         * Why this check was returned by the bank holding the account it was drawn
         * against.
         */
        @JsonProperty("return_reason")
        @ExcludeMissing
        fun _returnReason() = returnReason

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which
         * the check deposit was returned.
         */
        @JsonProperty("returned_at")
        @ExcludeMissing
        fun _returnedAt() = returnedAt

        /**
         * The identifier of the transaction that reversed the original check deposit
         * transaction.
         */
        @JsonProperty("transaction_id")
        @ExcludeMissing
        fun _transactionId() = transactionId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): DepositReturn = apply {
            if (!validated) {
              amount()
              checkDepositId()
              currency()
              returnReason()
              returnedAt()
              transactionId()
              validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is DepositReturn &&
              this.amount == other.amount &&
              this.checkDepositId == other.checkDepositId &&
              this.currency == other.currency &&
              this.returnReason == other.returnReason &&
              this.returnedAt == other.returnedAt &&
              this.transactionId == other.transactionId &&
              this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
          if (hashCode == 0) {
            hashCode = Objects.hash(
                amount,
                checkDepositId,
                currency,
                returnReason,
                returnedAt,
                transactionId,
                additionalProperties,
            )
          }
          return hashCode
        }

        override fun toString() = "DepositReturn{amount=$amount, checkDepositId=$checkDepositId, currency=$currency, returnReason=$returnReason, returnedAt=$returnedAt, transactionId=$transactionId, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic
            fun builder() = Builder()
        }

        class Builder {

            private var amount: JsonField<Long> = JsonMissing.of()
            private var checkDepositId: JsonField<String> = JsonMissing.of()
            private var currency: JsonField<Currency> = JsonMissing.of()
            private var returnReason: JsonField<ReturnReason> = JsonMissing.of()
            private var returnedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var transactionId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(depositReturn: DepositReturn) = apply {
                this.amount = depositReturn.amount
                this.checkDepositId = depositReturn.checkDepositId
                this.currency = depositReturn.currency
                this.returnReason = depositReturn.returnReason
                this.returnedAt = depositReturn.returnedAt
                this.transactionId = depositReturn.transactionId
                additionalProperties(depositReturn.additionalProperties)
            }

            /**
             * The amount in the minor unit of the transaction's currency. For dollars, for
             * example, this is cents.
             */
            fun amount(amount: Long) = amount(JsonField.of(amount))

            /**
             * The amount in the minor unit of the transaction's currency. For dollars, for
             * example, this is cents.
             */
            @JsonProperty("amount")
            @ExcludeMissing
            fun amount(amount: JsonField<Long>) = apply {
                this.amount = amount
            }

            /** The identifier of the Check Deposit that was returned. */
            fun checkDepositId(checkDepositId: String) = checkDepositId(JsonField.of(checkDepositId))

            /** The identifier of the Check Deposit that was returned. */
            @JsonProperty("check_deposit_id")
            @ExcludeMissing
            fun checkDepositId(checkDepositId: JsonField<String>) = apply {
                this.checkDepositId = checkDepositId
            }

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
             * transaction's currency.
             */
            fun currency(currency: Currency) = currency(JsonField.of(currency))

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
             * transaction's currency.
             */
            @JsonProperty("currency")
            @ExcludeMissing
            fun currency(currency: JsonField<Currency>) = apply {
                this.currency = currency
            }

            /**
             * Why this check was returned by the bank holding the account it was drawn
             * against.
             */
            fun returnReason(returnReason: ReturnReason) = returnReason(JsonField.of(returnReason))

            /**
             * Why this check was returned by the bank holding the account it was drawn
             * against.
             */
            @JsonProperty("return_reason")
            @ExcludeMissing
            fun returnReason(returnReason: JsonField<ReturnReason>) = apply {
                this.returnReason = returnReason
            }

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which
             * the check deposit was returned.
             */
            fun returnedAt(returnedAt: OffsetDateTime) = returnedAt(JsonField.of(returnedAt))

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which
             * the check deposit was returned.
             */
            @JsonProperty("returned_at")
            @ExcludeMissing
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

            fun build(): DepositReturn = DepositReturn(
                amount,
                checkDepositId,
                currency,
                returnReason,
                returnedAt,
                transactionId,
                additionalProperties.toUnmodifiable(),
            )
        }

        class Currency @JsonCreator private constructor(private val value: JsonField<String>, ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue
            fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
              if (this === other) {
                  return true
              }

              return other is Currency &&
                  this.value == other.value
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

            fun value(): Value = when (this) {
                CAD -> Value.CAD
                CHF -> Value.CHF
                EUR -> Value.EUR
                GBP -> Value.GBP
                JPY -> Value.JPY
                USD -> Value.USD
                else -> Value._UNKNOWN
            }

            fun known(): Known = when (this) {
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

        class ReturnReason @JsonCreator private constructor(private val value: JsonField<String>, ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue
            fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
              if (this === other) {
                  return true
              }

              return other is ReturnReason &&
                  this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val ACH_CONVERSION_NOT_SUPPORTED = ReturnReason(JsonField.of("ach_conversion_not_supported"))

                @JvmField val CLOSED_ACCOUNT = ReturnReason(JsonField.of("closed_account"))

                @JvmField val DUPLICATE_SUBMISSION = ReturnReason(JsonField.of("duplicate_submission"))

                @JvmField val INSUFFICIENT_FUNDS = ReturnReason(JsonField.of("insufficient_funds"))

                @JvmField val NO_ACCOUNT = ReturnReason(JsonField.of("no_account"))

                @JvmField val NOT_AUTHORIZED = ReturnReason(JsonField.of("not_authorized"))

                @JvmField val STALE_DATED = ReturnReason(JsonField.of("stale_dated"))

                @JvmField val STOP_PAYMENT = ReturnReason(JsonField.of("stop_payment"))

                @JvmField val UNKNOWN_REASON = ReturnReason(JsonField.of("unknown_reason"))

                @JvmField val UNMATCHED_DETAILS = ReturnReason(JsonField.of("unmatched_details"))

                @JvmField val UNREADABLE_IMAGE = ReturnReason(JsonField.of("unreadable_image"))

                @JvmField val ENDORSEMENT_IRREGULAR = ReturnReason(JsonField.of("endorsement_irregular"))

                @JvmField val ALTERED_OR_FICTITIOUS_ITEM = ReturnReason(JsonField.of("altered_or_fictitious_item"))

                @JvmField val FROZEN_OR_BLOCKED_ACCOUNT = ReturnReason(JsonField.of("frozen_or_blocked_account"))

                @JvmField val POST_DATED = ReturnReason(JsonField.of("post_dated"))

                @JvmField val ENDORSEMENT_MISSING = ReturnReason(JsonField.of("endorsement_missing"))

                @JvmField val SIGNATURE_MISSING = ReturnReason(JsonField.of("signature_missing"))

                @JvmField val STOP_PAYMENT_SUSPECT = ReturnReason(JsonField.of("stop_payment_suspect"))

                @JvmField val UNUSABLE_IMAGE = ReturnReason(JsonField.of("unusable_image"))

                @JvmField val IMAGE_FAILS_SECURITY_CHECK = ReturnReason(JsonField.of("image_fails_security_check"))

                @JvmField val CANNOT_DETERMINE_AMOUNT = ReturnReason(JsonField.of("cannot_determine_amount"))

                @JvmField val SIGNATURE_IRREGULAR = ReturnReason(JsonField.of("signature_irregular"))

                @JvmField val NON_CASH_ITEM = ReturnReason(JsonField.of("non_cash_item"))

                @JvmField val UNABLE_TO_PROCESS = ReturnReason(JsonField.of("unable_to_process"))

                @JvmField val ITEM_EXCEEDS_DOLLAR_LIMIT = ReturnReason(JsonField.of("item_exceeds_dollar_limit"))

                @JvmField val BRANCH_OR_ACCOUNT_SOLD = ReturnReason(JsonField.of("branch_or_account_sold"))

                @JvmStatic fun of(value: String) = ReturnReason(JsonField.of(value))
            }

            enum class Known {
                ACH_CONVERSION_NOT_SUPPORTED,
                CLOSED_ACCOUNT,
                DUPLICATE_SUBMISSION,
                INSUFFICIENT_FUNDS,
                NO_ACCOUNT,
                NOT_AUTHORIZED,
                STALE_DATED,
                STOP_PAYMENT,
                UNKNOWN_REASON,
                UNMATCHED_DETAILS,
                UNREADABLE_IMAGE,
                ENDORSEMENT_IRREGULAR,
                ALTERED_OR_FICTITIOUS_ITEM,
                FROZEN_OR_BLOCKED_ACCOUNT,
                POST_DATED,
                ENDORSEMENT_MISSING,
                SIGNATURE_MISSING,
                STOP_PAYMENT_SUSPECT,
                UNUSABLE_IMAGE,
                IMAGE_FAILS_SECURITY_CHECK,
                CANNOT_DETERMINE_AMOUNT,
                SIGNATURE_IRREGULAR,
                NON_CASH_ITEM,
                UNABLE_TO_PROCESS,
                ITEM_EXCEEDS_DOLLAR_LIMIT,
                BRANCH_OR_ACCOUNT_SOLD,
            }

            enum class Value {
                ACH_CONVERSION_NOT_SUPPORTED,
                CLOSED_ACCOUNT,
                DUPLICATE_SUBMISSION,
                INSUFFICIENT_FUNDS,
                NO_ACCOUNT,
                NOT_AUTHORIZED,
                STALE_DATED,
                STOP_PAYMENT,
                UNKNOWN_REASON,
                UNMATCHED_DETAILS,
                UNREADABLE_IMAGE,
                ENDORSEMENT_IRREGULAR,
                ALTERED_OR_FICTITIOUS_ITEM,
                FROZEN_OR_BLOCKED_ACCOUNT,
                POST_DATED,
                ENDORSEMENT_MISSING,
                SIGNATURE_MISSING,
                STOP_PAYMENT_SUSPECT,
                UNUSABLE_IMAGE,
                IMAGE_FAILS_SECURITY_CHECK,
                CANNOT_DETERMINE_AMOUNT,
                SIGNATURE_IRREGULAR,
                NON_CASH_ITEM,
                UNABLE_TO_PROCESS,
                ITEM_EXCEEDS_DOLLAR_LIMIT,
                BRANCH_OR_ACCOUNT_SOLD,
                _UNKNOWN,
            }

            fun value(): Value = when (this) {
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

            fun known(): Known = when (this) {
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

            fun asString(): String = _value().asStringOrThrow()
        }
    }

    /**
     * After the check is parsed, it is submitted to the Check21 network for
     * processing. This will contain details of the submission.
     */
    @JsonDeserialize(builder = DepositSubmission.Builder::class)
    @NoAutoDetect
    class DepositSubmission private constructor(
      private val backFileId: JsonField<String>,
      private val frontFileId: JsonField<String>,
      private val submittedAt: JsonField<OffsetDateTime>,
      private val additionalProperties: Map<String, JsonValue>,

    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /**
         * The ID for the File containing the check back image that was submitted to the
         * Check21 network.
         */
        fun backFileId(): String = backFileId.getRequired("back_file_id")

        /**
         * The ID for the File containing the check front image that was submitted to the
         * Check21 network.
         */
        fun frontFileId(): String = frontFileId.getRequired("front_file_id")

        /**
         * When the check deposit was submitted to the Check21 network for processing.
         * During business days, this happens within a few hours of the check being
         * accepted by Increase.
         */
        fun submittedAt(): OffsetDateTime = submittedAt.getRequired("submitted_at")

        /**
         * The ID for the File containing the check back image that was submitted to the
         * Check21 network.
         */
        @JsonProperty("back_file_id")
        @ExcludeMissing
        fun _backFileId() = backFileId

        /**
         * The ID for the File containing the check front image that was submitted to the
         * Check21 network.
         */
        @JsonProperty("front_file_id")
        @ExcludeMissing
        fun _frontFileId() = frontFileId

        /**
         * When the check deposit was submitted to the Check21 network for processing.
         * During business days, this happens within a few hours of the check being
         * accepted by Increase.
         */
        @JsonProperty("submitted_at")
        @ExcludeMissing
        fun _submittedAt() = submittedAt

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): DepositSubmission = apply {
            if (!validated) {
              backFileId()
              frontFileId()
              submittedAt()
              validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is DepositSubmission &&
              this.backFileId == other.backFileId &&
              this.frontFileId == other.frontFileId &&
              this.submittedAt == other.submittedAt &&
              this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
          if (hashCode == 0) {
            hashCode = Objects.hash(
                backFileId,
                frontFileId,
                submittedAt,
                additionalProperties,
            )
          }
          return hashCode
        }

        override fun toString() = "DepositSubmission{backFileId=$backFileId, frontFileId=$frontFileId, submittedAt=$submittedAt, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic
            fun builder() = Builder()
        }

        class Builder {

            private var backFileId: JsonField<String> = JsonMissing.of()
            private var frontFileId: JsonField<String> = JsonMissing.of()
            private var submittedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(depositSubmission: DepositSubmission) = apply {
                this.backFileId = depositSubmission.backFileId
                this.frontFileId = depositSubmission.frontFileId
                this.submittedAt = depositSubmission.submittedAt
                additionalProperties(depositSubmission.additionalProperties)
            }

            /**
             * The ID for the File containing the check back image that was submitted to the
             * Check21 network.
             */
            fun backFileId(backFileId: String) = backFileId(JsonField.of(backFileId))

            /**
             * The ID for the File containing the check back image that was submitted to the
             * Check21 network.
             */
            @JsonProperty("back_file_id")
            @ExcludeMissing
            fun backFileId(backFileId: JsonField<String>) = apply {
                this.backFileId = backFileId
            }

            /**
             * The ID for the File containing the check front image that was submitted to the
             * Check21 network.
             */
            fun frontFileId(frontFileId: String) = frontFileId(JsonField.of(frontFileId))

            /**
             * The ID for the File containing the check front image that was submitted to the
             * Check21 network.
             */
            @JsonProperty("front_file_id")
            @ExcludeMissing
            fun frontFileId(frontFileId: JsonField<String>) = apply {
                this.frontFileId = frontFileId
            }

            /**
             * When the check deposit was submitted to the Check21 network for processing.
             * During business days, this happens within a few hours of the check being
             * accepted by Increase.
             */
            fun submittedAt(submittedAt: OffsetDateTime) = submittedAt(JsonField.of(submittedAt))

            /**
             * When the check deposit was submitted to the Check21 network for processing.
             * During business days, this happens within a few hours of the check being
             * accepted by Increase.
             */
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

            fun build(): DepositSubmission = DepositSubmission(
                backFileId,
                frontFileId,
                submittedAt,
                additionalProperties.toUnmodifiable(),
            )
        }
    }

    /**
     * Increase will sometimes hold the funds for Check Deposits. If funds are held,
     * this sub-object will contain details of the hold.
     */
    @JsonDeserialize(builder = InboundFundsHold.Builder::class)
    @NoAutoDetect
    class InboundFundsHold private constructor(
      private val amount: JsonField<Long>,
      private val automaticallyReleasesAt: JsonField<OffsetDateTime>,
      private val createdAt: JsonField<OffsetDateTime>,
      private val currency: JsonField<Currency>,
      private val heldTransactionId: JsonField<String>,
      private val id: JsonField<String>,
      private val pendingTransactionId: JsonField<String>,
      private val releasedAt: JsonField<OffsetDateTime>,
      private val status: JsonField<Status>,
      private val type: JsonField<Type>,
      private val additionalProperties: Map<String, JsonValue>,

    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /**
         * The held amount in the minor unit of the account's currency. For dollars, for
         * example, this is cents.
         */
        fun amount(): Long = amount.getRequired("amount")

        /**
         * When the hold will be released automatically. Certain conditions may cause it to
         * be released before this time.
         */
        fun automaticallyReleasesAt(): OffsetDateTime = automaticallyReleasesAt.getRequired("automatically_releases_at")

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the hold
         * was created.
         */
        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the hold's
         * currency.
         */
        fun currency(): Currency = currency.getRequired("currency")

        /** The ID of the Transaction for which funds were held. */
        fun heldTransactionId(): Optional<String> = Optional.ofNullable(heldTransactionId.getNullable("held_transaction_id"))

        /** The Inbound Funds Hold identifier. */
        fun id(): String = id.getRequired("id")

        /** The ID of the Pending Transaction representing the held funds. */
        fun pendingTransactionId(): Optional<String> = Optional.ofNullable(pendingTransactionId.getNullable("pending_transaction_id"))

        /** When the hold was released (if it has been released). */
        fun releasedAt(): Optional<OffsetDateTime> = Optional.ofNullable(releasedAt.getNullable("released_at"))

        /** The status of the hold. */
        fun status(): Status = status.getRequired("status")

        /**
         * A constant representing the object's type. For this resource it will always be
         * `inbound_funds_hold`.
         */
        fun type(): Type = type.getRequired("type")

        /**
         * The held amount in the minor unit of the account's currency. For dollars, for
         * example, this is cents.
         */
        @JsonProperty("amount")
        @ExcludeMissing
        fun _amount() = amount

        /**
         * When the hold will be released automatically. Certain conditions may cause it to
         * be released before this time.
         */
        @JsonProperty("automatically_releases_at")
        @ExcludeMissing
        fun _automaticallyReleasesAt() = automaticallyReleasesAt

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the hold
         * was created.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt() = createdAt

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the hold's
         * currency.
         */
        @JsonProperty("currency")
        @ExcludeMissing
        fun _currency() = currency

        /** The ID of the Transaction for which funds were held. */
        @JsonProperty("held_transaction_id")
        @ExcludeMissing
        fun _heldTransactionId() = heldTransactionId

        /** The Inbound Funds Hold identifier. */
        @JsonProperty("id")
        @ExcludeMissing
        fun _id() = id

        /** The ID of the Pending Transaction representing the held funds. */
        @JsonProperty("pending_transaction_id")
        @ExcludeMissing
        fun _pendingTransactionId() = pendingTransactionId

        /** When the hold was released (if it has been released). */
        @JsonProperty("released_at")
        @ExcludeMissing
        fun _releasedAt() = releasedAt

        /** The status of the hold. */
        @JsonProperty("status")
        @ExcludeMissing
        fun _status() = status

        /**
         * A constant representing the object's type. For this resource it will always be
         * `inbound_funds_hold`.
         */
        @JsonProperty("type")
        @ExcludeMissing
        fun _type() = type

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): InboundFundsHold = apply {
            if (!validated) {
              amount()
              automaticallyReleasesAt()
              createdAt()
              currency()
              heldTransactionId()
              id()
              pendingTransactionId()
              releasedAt()
              status()
              type()
              validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is InboundFundsHold &&
              this.amount == other.amount &&
              this.automaticallyReleasesAt == other.automaticallyReleasesAt &&
              this.createdAt == other.createdAt &&
              this.currency == other.currency &&
              this.heldTransactionId == other.heldTransactionId &&
              this.id == other.id &&
              this.pendingTransactionId == other.pendingTransactionId &&
              this.releasedAt == other.releasedAt &&
              this.status == other.status &&
              this.type == other.type &&
              this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
          if (hashCode == 0) {
            hashCode = Objects.hash(
                amount,
                automaticallyReleasesAt,
                createdAt,
                currency,
                heldTransactionId,
                id,
                pendingTransactionId,
                releasedAt,
                status,
                type,
                additionalProperties,
            )
          }
          return hashCode
        }

        override fun toString() = "InboundFundsHold{amount=$amount, automaticallyReleasesAt=$automaticallyReleasesAt, createdAt=$createdAt, currency=$currency, heldTransactionId=$heldTransactionId, id=$id, pendingTransactionId=$pendingTransactionId, releasedAt=$releasedAt, status=$status, type=$type, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic
            fun builder() = Builder()
        }

        class Builder {

            private var amount: JsonField<Long> = JsonMissing.of()
            private var automaticallyReleasesAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var currency: JsonField<Currency> = JsonMissing.of()
            private var heldTransactionId: JsonField<String> = JsonMissing.of()
            private var id: JsonField<String> = JsonMissing.of()
            private var pendingTransactionId: JsonField<String> = JsonMissing.of()
            private var releasedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var status: JsonField<Status> = JsonMissing.of()
            private var type: JsonField<Type> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(inboundFundsHold: InboundFundsHold) = apply {
                this.amount = inboundFundsHold.amount
                this.automaticallyReleasesAt = inboundFundsHold.automaticallyReleasesAt
                this.createdAt = inboundFundsHold.createdAt
                this.currency = inboundFundsHold.currency
                this.heldTransactionId = inboundFundsHold.heldTransactionId
                this.id = inboundFundsHold.id
                this.pendingTransactionId = inboundFundsHold.pendingTransactionId
                this.releasedAt = inboundFundsHold.releasedAt
                this.status = inboundFundsHold.status
                this.type = inboundFundsHold.type
                additionalProperties(inboundFundsHold.additionalProperties)
            }

            /**
             * The held amount in the minor unit of the account's currency. For dollars, for
             * example, this is cents.
             */
            fun amount(amount: Long) = amount(JsonField.of(amount))

            /**
             * The held amount in the minor unit of the account's currency. For dollars, for
             * example, this is cents.
             */
            @JsonProperty("amount")
            @ExcludeMissing
            fun amount(amount: JsonField<Long>) = apply {
                this.amount = amount
            }

            /**
             * When the hold will be released automatically. Certain conditions may cause it to
             * be released before this time.
             */
            fun automaticallyReleasesAt(automaticallyReleasesAt: OffsetDateTime) = automaticallyReleasesAt(JsonField.of(automaticallyReleasesAt))

            /**
             * When the hold will be released automatically. Certain conditions may cause it to
             * be released before this time.
             */
            @JsonProperty("automatically_releases_at")
            @ExcludeMissing
            fun automaticallyReleasesAt(automaticallyReleasesAt: JsonField<OffsetDateTime>) = apply {
                this.automaticallyReleasesAt = automaticallyReleasesAt
            }

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the hold
             * was created.
             */
            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the hold
             * was created.
             */
            @JsonProperty("created_at")
            @ExcludeMissing
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the hold's
             * currency.
             */
            fun currency(currency: Currency) = currency(JsonField.of(currency))

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the hold's
             * currency.
             */
            @JsonProperty("currency")
            @ExcludeMissing
            fun currency(currency: JsonField<Currency>) = apply {
                this.currency = currency
            }

            /** The ID of the Transaction for which funds were held. */
            fun heldTransactionId(heldTransactionId: String) = heldTransactionId(JsonField.of(heldTransactionId))

            /** The ID of the Transaction for which funds were held. */
            @JsonProperty("held_transaction_id")
            @ExcludeMissing
            fun heldTransactionId(heldTransactionId: JsonField<String>) = apply {
                this.heldTransactionId = heldTransactionId
            }

            /** The Inbound Funds Hold identifier. */
            fun id(id: String) = id(JsonField.of(id))

            /** The Inbound Funds Hold identifier. */
            @JsonProperty("id")
            @ExcludeMissing
            fun id(id: JsonField<String>) = apply {
                this.id = id
            }

            /** The ID of the Pending Transaction representing the held funds. */
            fun pendingTransactionId(pendingTransactionId: String) = pendingTransactionId(JsonField.of(pendingTransactionId))

            /** The ID of the Pending Transaction representing the held funds. */
            @JsonProperty("pending_transaction_id")
            @ExcludeMissing
            fun pendingTransactionId(pendingTransactionId: JsonField<String>) = apply {
                this.pendingTransactionId = pendingTransactionId
            }

            /** When the hold was released (if it has been released). */
            fun releasedAt(releasedAt: OffsetDateTime) = releasedAt(JsonField.of(releasedAt))

            /** When the hold was released (if it has been released). */
            @JsonProperty("released_at")
            @ExcludeMissing
            fun releasedAt(releasedAt: JsonField<OffsetDateTime>) = apply {
                this.releasedAt = releasedAt
            }

            /** The status of the hold. */
            fun status(status: Status) = status(JsonField.of(status))

            /** The status of the hold. */
            @JsonProperty("status")
            @ExcludeMissing
            fun status(status: JsonField<Status>) = apply {
                this.status = status
            }

            /**
             * A constant representing the object's type. For this resource it will always be
             * `inbound_funds_hold`.
             */
            fun type(type: Type) = type(JsonField.of(type))

            /**
             * A constant representing the object's type. For this resource it will always be
             * `inbound_funds_hold`.
             */
            @JsonProperty("type")
            @ExcludeMissing
            fun type(type: JsonField<Type>) = apply {
                this.type = type
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

            fun build(): InboundFundsHold = InboundFundsHold(
                amount,
                automaticallyReleasesAt,
                createdAt,
                currency,
                heldTransactionId,
                id,
                pendingTransactionId,
                releasedAt,
                status,
                type,
                additionalProperties.toUnmodifiable(),
            )
        }

        class Currency @JsonCreator private constructor(private val value: JsonField<String>, ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue
            fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
              if (this === other) {
                  return true
              }

              return other is Currency &&
                  this.value == other.value
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

            fun value(): Value = when (this) {
                CAD -> Value.CAD
                CHF -> Value.CHF
                EUR -> Value.EUR
                GBP -> Value.GBP
                JPY -> Value.JPY
                USD -> Value.USD
                else -> Value._UNKNOWN
            }

            fun known(): Known = when (this) {
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

        class Status @JsonCreator private constructor(private val value: JsonField<String>, ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue
            fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
              if (this === other) {
                  return true
              }

              return other is Status &&
                  this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val HELD = Status(JsonField.of("held"))

                @JvmField val COMPLETE = Status(JsonField.of("complete"))

                @JvmStatic fun of(value: String) = Status(JsonField.of(value))
            }

            enum class Known {
                HELD,
                COMPLETE,
            }

            enum class Value {
                HELD,
                COMPLETE,
                _UNKNOWN,
            }

            fun value(): Value = when (this) {
                HELD -> Value.HELD
                COMPLETE -> Value.COMPLETE
                else -> Value._UNKNOWN
            }

            fun known(): Known = when (this) {
                HELD -> Known.HELD
                COMPLETE -> Known.COMPLETE
                else -> throw IncreaseInvalidDataException("Unknown Status: $value")
            }

            fun asString(): String = _value().asStringOrThrow()
        }

        class Type @JsonCreator private constructor(private val value: JsonField<String>, ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue
            fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
              if (this === other) {
                  return true
              }

              return other is Type &&
                  this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val INBOUND_FUNDS_HOLD = Type(JsonField.of("inbound_funds_hold"))

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            enum class Known {
                INBOUND_FUNDS_HOLD,
            }

            enum class Value {
                INBOUND_FUNDS_HOLD,
                _UNKNOWN,
            }

            fun value(): Value = when (this) {
                INBOUND_FUNDS_HOLD -> Value.INBOUND_FUNDS_HOLD
                else -> Value._UNKNOWN
            }

            fun known(): Known = when (this) {
                INBOUND_FUNDS_HOLD -> Known.INBOUND_FUNDS_HOLD
                else -> throw IncreaseInvalidDataException("Unknown Type: $value")
            }

            fun asString(): String = _value().asStringOrThrow()
        }
    }

    class Status @JsonCreator private constructor(private val value: JsonField<String>, ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue
        fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is Status &&
              this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val PENDING = Status(JsonField.of("pending"))

            @JvmField val SUBMITTED = Status(JsonField.of("submitted"))

            @JvmField val REJECTED = Status(JsonField.of("rejected"))

            @JvmField val RETURNED = Status(JsonField.of("returned"))

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            PENDING,
            SUBMITTED,
            REJECTED,
            RETURNED,
        }

        enum class Value {
            PENDING,
            SUBMITTED,
            REJECTED,
            RETURNED,
            _UNKNOWN,
        }

        fun value(): Value = when (this) {
            PENDING -> Value.PENDING
            SUBMITTED -> Value.SUBMITTED
            REJECTED -> Value.REJECTED
            RETURNED -> Value.RETURNED
            else -> Value._UNKNOWN
        }

        fun known(): Known = when (this) {
            PENDING -> Known.PENDING
            SUBMITTED -> Known.SUBMITTED
            REJECTED -> Known.REJECTED
            RETURNED -> Known.RETURNED
            else -> throw IncreaseInvalidDataException("Unknown Status: $value")
        }

        fun asString(): String = _value().asStringOrThrow()
    }

    class Type @JsonCreator private constructor(private val value: JsonField<String>, ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue
        fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is Type &&
              this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val CHECK_DEPOSIT = Type(JsonField.of("check_deposit"))

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            CHECK_DEPOSIT,
        }

        enum class Value {
            CHECK_DEPOSIT,
            _UNKNOWN,
        }

        fun value(): Value = when (this) {
            CHECK_DEPOSIT -> Value.CHECK_DEPOSIT
            else -> Value._UNKNOWN
        }

        fun known(): Known = when (this) {
            CHECK_DEPOSIT -> Known.CHECK_DEPOSIT
            else -> throw IncreaseInvalidDataException("Unknown Type: $value")
        }

        fun asString(): String = _value().asStringOrThrow()
    }
}
