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
import java.util.Objects
import java.util.Optional
import java.util.UUID
import com.increase.api.core.BaseDeserializer
import com.increase.api.core.BaseSerializer
import com.increase.api.core.getOrThrow
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.JsonField
import com.increase.api.core.toUnmodifiable
import com.increase.api.core.NoAutoDetect
import com.increase.api.errors.IncreaseInvalidDataException

/** Account transfers move funds between your own accounts at Increase. */
@JsonDeserialize(builder = AccountTransfer.Builder::class)
@NoAutoDetect
class AccountTransfer private constructor(private val id: JsonField<String>,private val amount: JsonField<Long>,private val accountId: JsonField<String>,private val currency: JsonField<Currency>,private val destinationAccountId: JsonField<String>,private val destinationTransactionId: JsonField<String>,private val createdAt: JsonField<OffsetDateTime>,private val description: JsonField<String>,private val network: JsonField<Network>,private val status: JsonField<Status>,private val templateId: JsonField<String>,private val transactionId: JsonField<String>,private val approval: JsonField<Approval>,private val cancellation: JsonField<Cancellation>,private val type: JsonField<Type>,private val additionalProperties: Map<String, JsonValue>,) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** The account transfer's identifier. */
    fun id(): String = id.getRequired("id")

    /**
     * The transfer amount in the minor unit of the destination account currency. For
     * dollars, for example, this is cents.
     */
    fun amount(): Long = amount.getRequired("amount")

    /** The Account to which the transfer belongs. */
    fun accountId(): String = accountId.getRequired("account_id")

    /**
     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the destination
     * account currency.
     */
    fun currency(): Currency = currency.getRequired("currency")

    /** The destination account's identifier. */
    fun destinationAccountId(): String = destinationAccountId.getRequired("destination_account_id")

    /** The ID for the transaction receiving the transfer. */
    fun destinationTransactionId(): Optional<String> = Optional.ofNullable(destinationTransactionId.getNullable("destination_transaction_id"))

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which
     * the transfer was created.
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /** The description that will show on the transactions. */
    fun description(): String = description.getRequired("description")

    /** The transfer's network. */
    fun network(): Network = network.getRequired("network")

    /** The lifecycle status of the transfer. */
    fun status(): Status = status.getRequired("status")

    /** If the transfer was created from a template, this will be the template's ID. */
    fun templateId(): Optional<String> = Optional.ofNullable(templateId.getNullable("template_id"))

    /** The ID for the transaction funding the transfer. */
    fun transactionId(): Optional<String> = Optional.ofNullable(transactionId.getNullable("transaction_id"))

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
     * A constant representing the object's type. For this resource it will always be
     * `account_transfer`.
     */
    fun type(): Type = type.getRequired("type")

    /** The account transfer's identifier. */
    @JsonProperty("id")
    @ExcludeMissing
    fun _id() = id

    /**
     * The transfer amount in the minor unit of the destination account currency. For
     * dollars, for example, this is cents.
     */
    @JsonProperty("amount")
    @ExcludeMissing
    fun _amount() = amount

    /** The Account to which the transfer belongs. */
    @JsonProperty("account_id")
    @ExcludeMissing
    fun _accountId() = accountId

    /**
     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the destination
     * account currency.
     */
    @JsonProperty("currency")
    @ExcludeMissing
    fun _currency() = currency

    /** The destination account's identifier. */
    @JsonProperty("destination_account_id")
    @ExcludeMissing
    fun _destinationAccountId() = destinationAccountId

    /** The ID for the transaction receiving the transfer. */
    @JsonProperty("destination_transaction_id")
    @ExcludeMissing
    fun _destinationTransactionId() = destinationTransactionId

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which
     * the transfer was created.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt() = createdAt

    /** The description that will show on the transactions. */
    @JsonProperty("description")
    @ExcludeMissing
    fun _description() = description

    /** The transfer's network. */
    @JsonProperty("network")
    @ExcludeMissing
    fun _network() = network

    /** The lifecycle status of the transfer. */
    @JsonProperty("status")
    @ExcludeMissing
    fun _status() = status

    /** If the transfer was created from a template, this will be the template's ID. */
    @JsonProperty("template_id")
    @ExcludeMissing
    fun _templateId() = templateId

    /** The ID for the transaction funding the transfer. */
    @JsonProperty("transaction_id")
    @ExcludeMissing
    fun _transactionId() = transactionId

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
     * A constant representing the object's type. For this resource it will always be
     * `account_transfer`.
     */
    @JsonProperty("type")
    @ExcludeMissing
    fun _type() = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate() = apply {
        if (!validated) {
          id()
          amount()
          accountId()
          currency()
          destinationAccountId()
          destinationTransactionId()
          createdAt()
          description()
          network()
          status()
          templateId()
          transactionId()
          approval().map { it.validate() }
          cancellation().map { it.validate() }
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
          this.id == other.id &&
          this.amount == other.amount &&
          this.accountId == other.accountId &&
          this.currency == other.currency &&
          this.destinationAccountId == other.destinationAccountId &&
          this.destinationTransactionId == other.destinationTransactionId &&
          this.createdAt == other.createdAt &&
          this.description == other.description &&
          this.network == other.network &&
          this.status == other.status &&
          this.templateId == other.templateId &&
          this.transactionId == other.transactionId &&
          this.approval == other.approval &&
          this.cancellation == other.cancellation &&
          this.type == other.type &&
          this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
      if (hashCode == 0) {
        hashCode = Objects.hash(
            id,
            amount,
            accountId,
            currency,
            destinationAccountId,
            destinationTransactionId,
            createdAt,
            description,
            network,
            status,
            templateId,
            transactionId,
            approval,
            cancellation,
            type,
            additionalProperties,
        )
      }
      return hashCode
    }

    override fun toString() = "AccountTransfer{id=$id, amount=$amount, accountId=$accountId, currency=$currency, destinationAccountId=$destinationAccountId, destinationTransactionId=$destinationTransactionId, createdAt=$createdAt, description=$description, network=$network, status=$status, templateId=$templateId, transactionId=$transactionId, approval=$approval, cancellation=$cancellation, type=$type, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic
        fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var amount: JsonField<Long> = JsonMissing.of()
        private var accountId: JsonField<String> = JsonMissing.of()
        private var currency: JsonField<Currency> = JsonMissing.of()
        private var destinationAccountId: JsonField<String> = JsonMissing.of()
        private var destinationTransactionId: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var network: JsonField<Network> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var templateId: JsonField<String> = JsonMissing.of()
        private var transactionId: JsonField<String> = JsonMissing.of()
        private var approval: JsonField<Approval> = JsonMissing.of()
        private var cancellation: JsonField<Cancellation> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(accountTransfer: AccountTransfer) = apply {
            this.id = accountTransfer.id
            this.amount = accountTransfer.amount
            this.accountId = accountTransfer.accountId
            this.currency = accountTransfer.currency
            this.destinationAccountId = accountTransfer.destinationAccountId
            this.destinationTransactionId = accountTransfer.destinationTransactionId
            this.createdAt = accountTransfer.createdAt
            this.description = accountTransfer.description
            this.network = accountTransfer.network
            this.status = accountTransfer.status
            this.templateId = accountTransfer.templateId
            this.transactionId = accountTransfer.transactionId
            this.approval = accountTransfer.approval
            this.cancellation = accountTransfer.cancellation
            this.type = accountTransfer.type
            additionalProperties(accountTransfer.additionalProperties)
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

        /** The Account to which the transfer belongs. */
        fun accountId(accountId: String) = accountId(JsonField.of(accountId))

        /** The Account to which the transfer belongs. */
        @JsonProperty("account_id")
        @ExcludeMissing
        fun accountId(accountId: JsonField<String>) = apply {
            this.accountId = accountId
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

        /** The description that will show on the transactions. */
        fun description(description: String) = description(JsonField.of(description))

        /** The description that will show on the transactions. */
        @JsonProperty("description")
        @ExcludeMissing
        fun description(description: JsonField<String>) = apply {
            this.description = description
        }

        /** The transfer's network. */
        fun network(network: Network) = network(JsonField.of(network))

        /** The transfer's network. */
        @JsonProperty("network")
        @ExcludeMissing
        fun network(network: JsonField<Network>) = apply {
            this.network = network
        }

        /** The lifecycle status of the transfer. */
        fun status(status: Status) = status(JsonField.of(status))

        /** The lifecycle status of the transfer. */
        @JsonProperty("status")
        @ExcludeMissing
        fun status(status: JsonField<Status>) = apply {
            this.status = status
        }

        /** If the transfer was created from a template, this will be the template's ID. */
        fun templateId(templateId: String) = templateId(JsonField.of(templateId))

        /** If the transfer was created from a template, this will be the template's ID. */
        @JsonProperty("template_id")
        @ExcludeMissing
        fun templateId(templateId: JsonField<String>) = apply {
            this.templateId = templateId
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
            id,
            amount,
            accountId,
            currency,
            destinationAccountId,
            destinationTransactionId,
            createdAt,
            description,
            network,
            status,
            templateId,
            transactionId,
            approval,
            cancellation,
            type,
            additionalProperties.toUnmodifiable(),
        )
    }

    class Currency @JsonCreator private constructor(private val value: JsonField<String>,) {

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

    class Network @JsonCreator private constructor(private val value: JsonField<String>,) {

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

    class Status @JsonCreator private constructor(private val value: JsonField<String>,) {

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

            @JvmField val PENDING_SUBMISSION = Status(JsonField.of("pending_submission"))

            @JvmField val PENDING_APPROVAL = Status(JsonField.of("pending_approval"))

            @JvmField val CANCELED = Status(JsonField.of("canceled"))

            @JvmField val REQUIRES_ATTENTION = Status(JsonField.of("requires_attention"))

            @JvmField val FLAGGED_BY_OPERATOR = Status(JsonField.of("flagged_by_operator"))

            @JvmField val COMPLETE = Status(JsonField.of("complete"))

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            PENDING_SUBMISSION,
            PENDING_APPROVAL,
            CANCELED,
            REQUIRES_ATTENTION,
            FLAGGED_BY_OPERATOR,
            COMPLETE,
        }

        enum class Value {
            PENDING_SUBMISSION,
            PENDING_APPROVAL,
            CANCELED,
            REQUIRES_ATTENTION,
            FLAGGED_BY_OPERATOR,
            COMPLETE,
            _UNKNOWN,
        }

        fun value(): Value = when (this) {
            PENDING_SUBMISSION -> Value.PENDING_SUBMISSION
            PENDING_APPROVAL -> Value.PENDING_APPROVAL
            CANCELED -> Value.CANCELED
            REQUIRES_ATTENTION -> Value.REQUIRES_ATTENTION
            FLAGGED_BY_OPERATOR -> Value.FLAGGED_BY_OPERATOR
            COMPLETE -> Value.COMPLETE
            else -> Value._UNKNOWN
        }

        fun known(): Known = when (this) {
            PENDING_SUBMISSION -> Known.PENDING_SUBMISSION
            PENDING_APPROVAL -> Known.PENDING_APPROVAL
            CANCELED -> Known.CANCELED
            REQUIRES_ATTENTION -> Known.REQUIRES_ATTENTION
            FLAGGED_BY_OPERATOR -> Known.FLAGGED_BY_OPERATOR
            COMPLETE -> Known.COMPLETE
            else -> throw IncreaseInvalidDataException("Unknown Status: $value")
        }

        fun asString(): String = _value().asStringOrThrow()
    }

    /**
     * If your account requires approvals for transfers and the transfer was approved,
     * this will contain details of the approval.
     */
    @JsonDeserialize(builder = Approval.Builder::class)
    @NoAutoDetect
    class Approval private constructor(private val approvedAt: JsonField<OffsetDateTime>,private val additionalProperties: Map<String, JsonValue>,) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which
         * the transfer was approved.
         */
        fun approvedAt(): OffsetDateTime = approvedAt.getRequired("approved_at")

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which
         * the transfer was approved.
         */
        @JsonProperty("approved_at")
        @ExcludeMissing
        fun _approvedAt() = approvedAt

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate() = apply {
            if (!validated) {
              approvedAt()
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
              this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
          if (hashCode == 0) {
            hashCode = Objects.hash(approvedAt, additionalProperties)
          }
          return hashCode
        }

        override fun toString() = "Approval{approvedAt=$approvedAt, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic
            fun builder() = Builder()
        }

        class Builder {

            private var approvedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(approval: Approval) = apply {
                this.approvedAt = approval.approvedAt
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

            fun build(): Approval = Approval(approvedAt, additionalProperties.toUnmodifiable())
        }
    }

    /**
     * If your account requires approvals for transfers and the transfer was not
     * approved, this will contain details of the cancellation.
     */
    @JsonDeserialize(builder = Cancellation.Builder::class)
    @NoAutoDetect
    class Cancellation private constructor(private val canceledAt: JsonField<OffsetDateTime>,private val additionalProperties: Map<String, JsonValue>,) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which
         * the Transfer was canceled.
         */
        fun canceledAt(): OffsetDateTime = canceledAt.getRequired("canceled_at")

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which
         * the Transfer was canceled.
         */
        @JsonProperty("canceled_at")
        @ExcludeMissing
        fun _canceledAt() = canceledAt

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate() = apply {
            if (!validated) {
              canceledAt()
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
              this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
          if (hashCode == 0) {
            hashCode = Objects.hash(canceledAt, additionalProperties)
          }
          return hashCode
        }

        override fun toString() = "Cancellation{canceledAt=$canceledAt, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic
            fun builder() = Builder()
        }

        class Builder {

            private var canceledAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(cancellation: Cancellation) = apply {
                this.canceledAt = cancellation.canceledAt
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

            fun build(): Cancellation = Cancellation(canceledAt, additionalProperties.toUnmodifiable())
        }
    }

    class Type @JsonCreator private constructor(private val value: JsonField<String>,) {

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
