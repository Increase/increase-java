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

/** Account transfers move funds between your own accounts at Increase. */
@JsonDeserialize(builder = AccountTransfer.Builder::class)
@NoAutoDetect
class AccountTransfer private constructor(
  private val accountId: JsonField<String>,
  private val amount: JsonField<Long>,
  private val approval: JsonField<Approval>,
  private val cancellation: JsonField<Cancellation>,
  private val createdAt: JsonField<OffsetDateTime>,
  private val createdBy: JsonField<CreatedBy>,
  private val currency: JsonField<Currency>,
  private val description: JsonField<String>,
  private val destinationAccountId: JsonField<String>,
  private val destinationTransactionId: JsonField<String>,
  private val id: JsonField<String>,
  private val idempotencyKey: JsonField<String>,
  private val network: JsonField<Network>,
  private val pendingTransactionId: JsonField<String>,
  private val status: JsonField<Status>,
  private val transactionId: JsonField<String>,
  private val type: JsonField<Type>,
  private val additionalProperties: Map<String, JsonValue>,

) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** The Account to which the transfer belongs. */
    fun accountId(): String = accountId.getRequired("account_id")

    /**
     * The transfer amount in the minor unit of the destination account currency. For
     * dollars, for example, this is cents.
     */
    fun amount(): Long = amount.getRequired("amount")

    /**
     * If your account requires approvals for transfers and the transfer was approved,
     * this will contain details of the approval.
     */
    fun approval(): Optional<Approval> = Optional.ofNullable(approval.getNullable("approval"))

    /**
     * If your account requires approvals for transfers and the transfer was not
     * approved, this will contain details of the cancellation.
     */
    fun cancellation(): Optional<Cancellation> = Optional.ofNullable(cancellation.getNullable("cancellation"))

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which
     * the transfer was created.
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /** What object created the transfer, either via the API or the dashboard. */
    fun createdBy(): Optional<CreatedBy> = Optional.ofNullable(createdBy.getNullable("created_by"))

    /**
     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the destination
     * account currency.
     */
    fun currency(): Currency = currency.getRequired("currency")

    /** The description that will show on the transactions. */
    fun description(): String = description.getRequired("description")

    /** The destination account's identifier. */
    fun destinationAccountId(): String = destinationAccountId.getRequired("destination_account_id")

    /** The ID for the transaction receiving the transfer. */
    fun destinationTransactionId(): Optional<String> = Optional.ofNullable(destinationTransactionId.getNullable("destination_transaction_id"))

    /** The account transfer's identifier. */
    fun id(): String = id.getRequired("id")

    /**
     * The idempotency key you chose for this object. This value is unique across
     * Increase and is used to ensure that a request is only processed once. Learn more
     * about [idempotency](https://increase.com/documentation/idempotency-keys).
     */
    fun idempotencyKey(): Optional<String> = Optional.ofNullable(idempotencyKey.getNullable("idempotency_key"))

    /** The transfer's network. */
    fun network(): Network = network.getRequired("network")

    /**
     * The ID for the pending transaction representing the transfer. A pending
     * transaction is created when the transfer
     * [requires approval](https://increase.com/documentation/transfer-approvals#transfer-approvals)
     * by someone else in your organization.
     */
    fun pendingTransactionId(): Optional<String> = Optional.ofNullable(pendingTransactionId.getNullable("pending_transaction_id"))

    /** The lifecycle status of the transfer. */
    fun status(): Status = status.getRequired("status")

    /** The ID for the transaction funding the transfer. */
    fun transactionId(): Optional<String> = Optional.ofNullable(transactionId.getNullable("transaction_id"))

    /**
     * A constant representing the object's type. For this resource it will always be
     * `account_transfer`.
     */
    fun type(): Type = type.getRequired("type")

    /** The Account to which the transfer belongs. */
    @JsonProperty("account_id")
    @ExcludeMissing
    fun _accountId() = accountId

    /**
     * The transfer amount in the minor unit of the destination account currency. For
     * dollars, for example, this is cents.
     */
    @JsonProperty("amount")
    @ExcludeMissing
    fun _amount() = amount

    /**
     * If your account requires approvals for transfers and the transfer was approved,
     * this will contain details of the approval.
     */
    @JsonProperty("approval")
    @ExcludeMissing
    fun _approval() = approval

    /**
     * If your account requires approvals for transfers and the transfer was not
     * approved, this will contain details of the cancellation.
     */
    @JsonProperty("cancellation")
    @ExcludeMissing
    fun _cancellation() = cancellation

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which
     * the transfer was created.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt() = createdAt

    /** What object created the transfer, either via the API or the dashboard. */
    @JsonProperty("created_by")
    @ExcludeMissing
    fun _createdBy() = createdBy

    /**
     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the destination
     * account currency.
     */
    @JsonProperty("currency")
    @ExcludeMissing
    fun _currency() = currency

    /** The description that will show on the transactions. */
    @JsonProperty("description")
    @ExcludeMissing
    fun _description() = description

    /** The destination account's identifier. */
    @JsonProperty("destination_account_id")
    @ExcludeMissing
    fun _destinationAccountId() = destinationAccountId

    /** The ID for the transaction receiving the transfer. */
    @JsonProperty("destination_transaction_id")
    @ExcludeMissing
    fun _destinationTransactionId() = destinationTransactionId

    /** The account transfer's identifier. */
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

    /** The transfer's network. */
    @JsonProperty("network")
    @ExcludeMissing
    fun _network() = network

    /**
     * The ID for the pending transaction representing the transfer. A pending
     * transaction is created when the transfer
     * [requires approval](https://increase.com/documentation/transfer-approvals#transfer-approvals)
     * by someone else in your organization.
     */
    @JsonProperty("pending_transaction_id")
    @ExcludeMissing
    fun _pendingTransactionId() = pendingTransactionId

    /** The lifecycle status of the transfer. */
    @JsonProperty("status")
    @ExcludeMissing
    fun _status() = status

    /** The ID for the transaction funding the transfer. */
    @JsonProperty("transaction_id")
    @ExcludeMissing
    fun _transactionId() = transactionId

    /**
     * A constant representing the object's type. For this resource it will always be
     * `account_transfer`.
     */
    @JsonProperty("type")
    @ExcludeMissing
    fun _type() = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): AccountTransfer = apply {
        if (!validated) {
          accountId()
          amount()
          approval().map { it.validate() }
          cancellation().map { it.validate() }
          createdAt()
          createdBy().map { it.validate() }
          currency()
          description()
          destinationAccountId()
          destinationTransactionId()
          id()
          idempotencyKey()
          network()
          pendingTransactionId()
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

      return other is AccountTransfer &&
          this.accountId == other.accountId &&
          this.amount == other.amount &&
          this.approval == other.approval &&
          this.cancellation == other.cancellation &&
          this.createdAt == other.createdAt &&
          this.createdBy == other.createdBy &&
          this.currency == other.currency &&
          this.description == other.description &&
          this.destinationAccountId == other.destinationAccountId &&
          this.destinationTransactionId == other.destinationTransactionId &&
          this.id == other.id &&
          this.idempotencyKey == other.idempotencyKey &&
          this.network == other.network &&
          this.pendingTransactionId == other.pendingTransactionId &&
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
            approval,
            cancellation,
            createdAt,
            createdBy,
            currency,
            description,
            destinationAccountId,
            destinationTransactionId,
            id,
            idempotencyKey,
            network,
            pendingTransactionId,
            status,
            transactionId,
            type,
            additionalProperties,
        )
      }
      return hashCode
    }

    override fun toString() = "AccountTransfer{accountId=$accountId, amount=$amount, approval=$approval, cancellation=$cancellation, createdAt=$createdAt, createdBy=$createdBy, currency=$currency, description=$description, destinationAccountId=$destinationAccountId, destinationTransactionId=$destinationTransactionId, id=$id, idempotencyKey=$idempotencyKey, network=$network, pendingTransactionId=$pendingTransactionId, status=$status, transactionId=$transactionId, type=$type, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic
        fun builder() = Builder()
    }

    class Builder {

        private var accountId: JsonField<String> = JsonMissing.of()
        private var amount: JsonField<Long> = JsonMissing.of()
        private var approval: JsonField<Approval> = JsonMissing.of()
        private var cancellation: JsonField<Cancellation> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdBy: JsonField<CreatedBy> = JsonMissing.of()
        private var currency: JsonField<Currency> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var destinationAccountId: JsonField<String> = JsonMissing.of()
        private var destinationTransactionId: JsonField<String> = JsonMissing.of()
        private var id: JsonField<String> = JsonMissing.of()
        private var idempotencyKey: JsonField<String> = JsonMissing.of()
        private var network: JsonField<Network> = JsonMissing.of()
        private var pendingTransactionId: JsonField<String> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var transactionId: JsonField<String> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(accountTransfer: AccountTransfer) = apply {
            this.accountId = accountTransfer.accountId
            this.amount = accountTransfer.amount
            this.approval = accountTransfer.approval
            this.cancellation = accountTransfer.cancellation
            this.createdAt = accountTransfer.createdAt
            this.createdBy = accountTransfer.createdBy
            this.currency = accountTransfer.currency
            this.description = accountTransfer.description
            this.destinationAccountId = accountTransfer.destinationAccountId
            this.destinationTransactionId = accountTransfer.destinationTransactionId
            this.id = accountTransfer.id
            this.idempotencyKey = accountTransfer.idempotencyKey
            this.network = accountTransfer.network
            this.pendingTransactionId = accountTransfer.pendingTransactionId
            this.status = accountTransfer.status
            this.transactionId = accountTransfer.transactionId
            this.type = accountTransfer.type
            additionalProperties(accountTransfer.additionalProperties)
        }

        /** The Account to which the transfer belongs. */
        fun accountId(accountId: String) = accountId(JsonField.of(accountId))

        /** The Account to which the transfer belongs. */
        @JsonProperty("account_id")
        @ExcludeMissing
        fun accountId(accountId: JsonField<String>) = apply {
            this.accountId = accountId
        }

        /**
         * The transfer amount in the minor unit of the destination account currency. For
         * dollars, for example, this is cents.
         */
        fun amount(amount: Long) = amount(JsonField.of(amount))

        /**
         * The transfer amount in the minor unit of the destination account currency. For
         * dollars, for example, this is cents.
         */
        @JsonProperty("amount")
        @ExcludeMissing
        fun amount(amount: JsonField<Long>) = apply {
            this.amount = amount
        }

        /**
         * If your account requires approvals for transfers and the transfer was approved,
         * this will contain details of the approval.
         */
        fun approval(approval: Approval) = approval(JsonField.of(approval))

        /**
         * If your account requires approvals for transfers and the transfer was approved,
         * this will contain details of the approval.
         */
        @JsonProperty("approval")
        @ExcludeMissing
        fun approval(approval: JsonField<Approval>) = apply {
            this.approval = approval
        }

        /**
         * If your account requires approvals for transfers and the transfer was not
         * approved, this will contain details of the cancellation.
         */
        fun cancellation(cancellation: Cancellation) = cancellation(JsonField.of(cancellation))

        /**
         * If your account requires approvals for transfers and the transfer was not
         * approved, this will contain details of the cancellation.
         */
        @JsonProperty("cancellation")
        @ExcludeMissing
        fun cancellation(cancellation: JsonField<Cancellation>) = apply {
            this.cancellation = cancellation
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

        /** What object created the transfer, either via the API or the dashboard. */
        fun createdBy(createdBy: CreatedBy) = createdBy(JsonField.of(createdBy))

        /** What object created the transfer, either via the API or the dashboard. */
        @JsonProperty("created_by")
        @ExcludeMissing
        fun createdBy(createdBy: JsonField<CreatedBy>) = apply {
            this.createdBy = createdBy
        }

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the destination
         * account currency.
         */
        fun currency(currency: Currency) = currency(JsonField.of(currency))

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the destination
         * account currency.
         */
        @JsonProperty("currency")
        @ExcludeMissing
        fun currency(currency: JsonField<Currency>) = apply {
            this.currency = currency
        }

        /** The description that will show on the transactions. */
        fun description(description: String) = description(JsonField.of(description))

        /** The description that will show on the transactions. */
        @JsonProperty("description")
        @ExcludeMissing
        fun description(description: JsonField<String>) = apply {
            this.description = description
        }

        /** The destination account's identifier. */
        fun destinationAccountId(destinationAccountId: String) = destinationAccountId(JsonField.of(destinationAccountId))

        /** The destination account's identifier. */
        @JsonProperty("destination_account_id")
        @ExcludeMissing
        fun destinationAccountId(destinationAccountId: JsonField<String>) = apply {
            this.destinationAccountId = destinationAccountId
        }

        /** The ID for the transaction receiving the transfer. */
        fun destinationTransactionId(destinationTransactionId: String) = destinationTransactionId(JsonField.of(destinationTransactionId))

        /** The ID for the transaction receiving the transfer. */
        @JsonProperty("destination_transaction_id")
        @ExcludeMissing
        fun destinationTransactionId(destinationTransactionId: JsonField<String>) = apply {
            this.destinationTransactionId = destinationTransactionId
        }

        /** The account transfer's identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The account transfer's identifier. */
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

        /** The transfer's network. */
        fun network(network: Network) = network(JsonField.of(network))

        /** The transfer's network. */
        @JsonProperty("network")
        @ExcludeMissing
        fun network(network: JsonField<Network>) = apply {
            this.network = network
        }

        /**
         * The ID for the pending transaction representing the transfer. A pending
         * transaction is created when the transfer
         * [requires approval](https://increase.com/documentation/transfer-approvals#transfer-approvals)
         * by someone else in your organization.
         */
        fun pendingTransactionId(pendingTransactionId: String) = pendingTransactionId(JsonField.of(pendingTransactionId))

        /**
         * The ID for the pending transaction representing the transfer. A pending
         * transaction is created when the transfer
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
        fun status(status: JsonField<Status>) = apply {
            this.status = status
        }

        /** The ID for the transaction funding the transfer. */
        fun transactionId(transactionId: String) = transactionId(JsonField.of(transactionId))

        /** The ID for the transaction funding the transfer. */
        @JsonProperty("transaction_id")
        @ExcludeMissing
        fun transactionId(transactionId: JsonField<String>) = apply {
            this.transactionId = transactionId
        }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `account_transfer`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * A constant representing the object's type. For this resource it will always be
         * `account_transfer`.
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

        fun build(): AccountTransfer = AccountTransfer(
            accountId,
            amount,
            approval,
            cancellation,
            createdAt,
            createdBy,
            currency,
            description,
            destinationAccountId,
            destinationTransactionId,
            id,
            idempotencyKey,
            network,
            pendingTransactionId,
            status,
            transactionId,
            type,
            additionalProperties.toUnmodifiable(),
        )
    }

    /**
     * If your account requires approvals for transfers and the transfer was approved,
     * this will contain details of the approval.
     */
    @JsonDeserialize(builder = Approval.Builder::class)
    @NoAutoDetect
    class Approval private constructor(private val approvedAt: JsonField<OffsetDateTime>, private val approvedBy: JsonField<String>, private val additionalProperties: Map<String, JsonValue>, ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which
         * the transfer was approved.
         */
        fun approvedAt(): OffsetDateTime = approvedAt.getRequired("approved_at")

        /**
         * If the Transfer was approved by a user in the dashboard, the email address of
         * that user.
         */
        fun approvedBy(): Optional<String> = Optional.ofNullable(approvedBy.getNullable("approved_by"))

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which
         * the transfer was approved.
         */
        @JsonProperty("approved_at")
        @ExcludeMissing
        fun _approvedAt() = approvedAt

        /**
         * If the Transfer was approved by a user in the dashboard, the email address of
         * that user.
         */
        @JsonProperty("approved_by")
        @ExcludeMissing
        fun _approvedBy() = approvedBy

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
            hashCode = Objects.hash(
                approvedAt,
                approvedBy,
                additionalProperties,
            )
          }
          return hashCode
        }

        override fun toString() = "Approval{approvedAt=$approvedAt, approvedBy=$approvedBy, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic
            fun builder() = Builder()
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
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which
             * the transfer was approved.
             */
            fun approvedAt(approvedAt: OffsetDateTime) = approvedAt(JsonField.of(approvedAt))

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which
             * the transfer was approved.
             */
            @JsonProperty("approved_at")
            @ExcludeMissing
            fun approvedAt(approvedAt: JsonField<OffsetDateTime>) = apply {
                this.approvedAt = approvedAt
            }

            /**
             * If the Transfer was approved by a user in the dashboard, the email address of
             * that user.
             */
            fun approvedBy(approvedBy: String) = approvedBy(JsonField.of(approvedBy))

            /**
             * If the Transfer was approved by a user in the dashboard, the email address of
             * that user.
             */
            @JsonProperty("approved_by")
            @ExcludeMissing
            fun approvedBy(approvedBy: JsonField<String>) = apply {
                this.approvedBy = approvedBy
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

            fun build(): Approval = Approval(
                approvedAt,
                approvedBy,
                additionalProperties.toUnmodifiable(),
            )
        }
    }

    /**
     * If your account requires approvals for transfers and the transfer was not
     * approved, this will contain details of the cancellation.
     */
    @JsonDeserialize(builder = Cancellation.Builder::class)
    @NoAutoDetect
    class Cancellation private constructor(private val canceledAt: JsonField<OffsetDateTime>, private val canceledBy: JsonField<String>, private val additionalProperties: Map<String, JsonValue>, ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which
         * the Transfer was canceled.
         */
        fun canceledAt(): OffsetDateTime = canceledAt.getRequired("canceled_at")

        /**
         * If the Transfer was canceled by a user in the dashboard, the email address of
         * that user.
         */
        fun canceledBy(): Optional<String> = Optional.ofNullable(canceledBy.getNullable("canceled_by"))

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which
         * the Transfer was canceled.
         */
        @JsonProperty("canceled_at")
        @ExcludeMissing
        fun _canceledAt() = canceledAt

        /**
         * If the Transfer was canceled by a user in the dashboard, the email address of
         * that user.
         */
        @JsonProperty("canceled_by")
        @ExcludeMissing
        fun _canceledBy() = canceledBy

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
            hashCode = Objects.hash(
                canceledAt,
                canceledBy,
                additionalProperties,
            )
          }
          return hashCode
        }

        override fun toString() = "Cancellation{canceledAt=$canceledAt, canceledBy=$canceledBy, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic
            fun builder() = Builder()
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
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which
             * the Transfer was canceled.
             */
            fun canceledAt(canceledAt: OffsetDateTime) = canceledAt(JsonField.of(canceledAt))

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which
             * the Transfer was canceled.
             */
            @JsonProperty("canceled_at")
            @ExcludeMissing
            fun canceledAt(canceledAt: JsonField<OffsetDateTime>) = apply {
                this.canceledAt = canceledAt
            }

            /**
             * If the Transfer was canceled by a user in the dashboard, the email address of
             * that user.
             */
            fun canceledBy(canceledBy: String) = canceledBy(JsonField.of(canceledBy))

            /**
             * If the Transfer was canceled by a user in the dashboard, the email address of
             * that user.
             */
            @JsonProperty("canceled_by")
            @ExcludeMissing
            fun canceledBy(canceledBy: JsonField<String>) = apply {
                this.canceledBy = canceledBy
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

            fun build(): Cancellation = Cancellation(
                canceledAt,
                canceledBy,
                additionalProperties.toUnmodifiable(),
            )
        }
    }

    /** What object created the transfer, either via the API or the dashboard. */
    @JsonDeserialize(builder = CreatedBy.Builder::class)
    @NoAutoDetect
    class CreatedBy private constructor(
      private val apiKey: JsonField<ApiKey>,
      private val category: JsonField<Category>,
      private val oauthApplication: JsonField<OAuthApplication>,
      private val user: JsonField<User>,
      private val additionalProperties: Map<String, JsonValue>,

    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /** If present, details about the API key that created the transfer. */
        fun apiKey(): Optional<ApiKey> = Optional.ofNullable(apiKey.getNullable("api_key"))

        /** The type of object that created this transfer. */
        fun category(): Category = category.getRequired("category")

        /** If present, details about the OAuth Application that created the transfer. */
        fun oauthApplication(): Optional<OAuthApplication> = Optional.ofNullable(oauthApplication.getNullable("oauth_application"))

        /** If present, details about the User that created the transfer. */
        fun user(): Optional<User> = Optional.ofNullable(user.getNullable("user"))

        /** If present, details about the API key that created the transfer. */
        @JsonProperty("api_key")
        @ExcludeMissing
        fun _apiKey() = apiKey

        /** The type of object that created this transfer. */
        @JsonProperty("category")
        @ExcludeMissing
        fun _category() = category

        /** If present, details about the OAuth Application that created the transfer. */
        @JsonProperty("oauth_application")
        @ExcludeMissing
        fun _oauthApplication() = oauthApplication

        /** If present, details about the User that created the transfer. */
        @JsonProperty("user")
        @ExcludeMissing
        fun _user() = user

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

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is CreatedBy &&
              this.apiKey == other.apiKey &&
              this.category == other.category &&
              this.oauthApplication == other.oauthApplication &&
              this.user == other.user &&
              this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
          if (hashCode == 0) {
            hashCode = Objects.hash(
                apiKey,
                category,
                oauthApplication,
                user,
                additionalProperties,
            )
          }
          return hashCode
        }

        override fun toString() = "CreatedBy{apiKey=$apiKey, category=$category, oauthApplication=$oauthApplication, user=$user, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic
            fun builder() = Builder()
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
            fun apiKey(apiKey: JsonField<ApiKey>) = apply {
                this.apiKey = apiKey
            }

            /** The type of object that created this transfer. */
            fun category(category: Category) = category(JsonField.of(category))

            /** The type of object that created this transfer. */
            @JsonProperty("category")
            @ExcludeMissing
            fun category(category: JsonField<Category>) = apply {
                this.category = category
            }

            /** If present, details about the OAuth Application that created the transfer. */
            fun oauthApplication(oauthApplication: OAuthApplication) = oauthApplication(JsonField.of(oauthApplication))

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
            fun user(user: JsonField<User>) = apply {
                this.user = user
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

            fun build(): CreatedBy = CreatedBy(
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
        class ApiKey private constructor(private val description: JsonField<String>, private val additionalProperties: Map<String, JsonValue>, ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** The description set for the API key when it was created. */
            fun description(): Optional<String> = Optional.ofNullable(description.getNullable("description"))

            /** The description set for the API key when it was created. */
            @JsonProperty("description")
            @ExcludeMissing
            fun _description() = description

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

            override fun equals(other: Any?): Boolean {
              if (this === other) {
                  return true
              }

              return other is ApiKey &&
                  this.description == other.description &&
                  this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
              if (hashCode == 0) {
                hashCode = Objects.hash(description, additionalProperties)
              }
              return hashCode
            }

            override fun toString() = "ApiKey{description=$description, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic
                fun builder() = Builder()
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

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

                fun build(): ApiKey = ApiKey(description, additionalProperties.toUnmodifiable())
            }
        }

        class Category @JsonCreator private constructor(private val value: JsonField<String>, ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue
            fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
              if (this === other) {
                  return true
              }

              return other is Category &&
                  this.value == other.value
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

            fun value(): Value = when (this) {
                API_KEY -> Value.API_KEY
                OAUTH_APPLICATION -> Value.OAUTH_APPLICATION
                USER -> Value.USER
                else -> Value._UNKNOWN
            }

            fun known(): Known = when (this) {
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
        class OAuthApplication private constructor(private val name: JsonField<String>, private val additionalProperties: Map<String, JsonValue>, ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** The name of the OAuth Application. */
            fun name(): String = name.getRequired("name")

            /** The name of the OAuth Application. */
            @JsonProperty("name")
            @ExcludeMissing
            fun _name() = name

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

            override fun equals(other: Any?): Boolean {
              if (this === other) {
                  return true
              }

              return other is OAuthApplication &&
                  this.name == other.name &&
                  this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
              if (hashCode == 0) {
                hashCode = Objects.hash(name, additionalProperties)
              }
              return hashCode
            }

            override fun toString() = "OAuthApplication{name=$name, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic
                fun builder() = Builder()
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
                fun name(name: JsonField<String>) = apply {
                    this.name = name
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

                fun build(): OAuthApplication = OAuthApplication(name, additionalProperties.toUnmodifiable())
            }
        }

        /** If present, details about the User that created the transfer. */
        @JsonDeserialize(builder = User.Builder::class)
        @NoAutoDetect
        class User private constructor(private val email: JsonField<String>, private val additionalProperties: Map<String, JsonValue>, ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** The email address of the User. */
            fun email(): String = email.getRequired("email")

            /** The email address of the User. */
            @JsonProperty("email")
            @ExcludeMissing
            fun _email() = email

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

            override fun equals(other: Any?): Boolean {
              if (this === other) {
                  return true
              }

              return other is User &&
                  this.email == other.email &&
                  this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
              if (hashCode == 0) {
                hashCode = Objects.hash(email, additionalProperties)
              }
              return hashCode
            }

            override fun toString() = "User{email=$email, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic
                fun builder() = Builder()
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
                fun email(email: JsonField<String>) = apply {
                    this.email = email
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

                fun build(): User = User(email, additionalProperties.toUnmodifiable())
            }
        }
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

    class Network @JsonCreator private constructor(private val value: JsonField<String>, ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue
        fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is Network &&
              this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val ACCOUNT = Network(JsonField.of("account"))

            @JvmStatic fun of(value: String) = Network(JsonField.of(value))
        }

        enum class Known {
            ACCOUNT,
        }

        enum class Value {
            ACCOUNT,
            _UNKNOWN,
        }

        fun value(): Value = when (this) {
            ACCOUNT -> Value.ACCOUNT
            else -> Value._UNKNOWN
        }

        fun known(): Known = when (this) {
            ACCOUNT -> Known.ACCOUNT
            else -> throw IncreaseInvalidDataException("Unknown Network: $value")
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

            @JvmField val PENDING_APPROVAL = Status(JsonField.of("pending_approval"))

            @JvmField val CANCELED = Status(JsonField.of("canceled"))

            @JvmField val COMPLETE = Status(JsonField.of("complete"))

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            PENDING_APPROVAL,
            CANCELED,
            COMPLETE,
        }

        enum class Value {
            PENDING_APPROVAL,
            CANCELED,
            COMPLETE,
            _UNKNOWN,
        }

        fun value(): Value = when (this) {
            PENDING_APPROVAL -> Value.PENDING_APPROVAL
            CANCELED -> Value.CANCELED
            COMPLETE -> Value.COMPLETE
            else -> Value._UNKNOWN
        }

        fun known(): Known = when (this) {
            PENDING_APPROVAL -> Known.PENDING_APPROVAL
            CANCELED -> Known.CANCELED
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

            @JvmField val ACCOUNT_TRANSFER = Type(JsonField.of("account_transfer"))

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            ACCOUNT_TRANSFER,
        }

        enum class Value {
            ACCOUNT_TRANSFER,
            _UNKNOWN,
        }

        fun value(): Value = when (this) {
            ACCOUNT_TRANSFER -> Value.ACCOUNT_TRANSFER
            else -> Value._UNKNOWN
        }

        fun known(): Known = when (this) {
            ACCOUNT_TRANSFER -> Known.ACCOUNT_TRANSFER
            else -> throw IncreaseInvalidDataException("Unknown Type: $value")
        }

        fun asString(): String = _value().asStringOrThrow()
    }
}
