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

/**
 * Accounts are your bank accounts with Increase. They store money, receive
 * transfers, and send payments. They earn interest and have depository insurance.
 */
@JsonDeserialize(builder = Account.Builder::class)
@NoAutoDetect
class Account private constructor(private val balances: JsonField<Balances>,private val createdAt: JsonField<OffsetDateTime>,private val currency: JsonField<Currency>,private val entityId: JsonField<String>,private val informationalEntityId: JsonField<String>,private val id: JsonField<String>,private val interestAccrued: JsonField<String>,private val interestAccruedAt: JsonField<LocalDate>,private val name: JsonField<String>,private val status: JsonField<Status>,private val type: JsonField<Type>,private val additionalProperties: Map<String, JsonValue>,) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /**
     * The Account's balances in the minor unit of its currency. For dollars, for
     * example, these values will represent cents.
     */
    fun balances(): Balances = balances.getRequired("balances")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Account
     * was created.
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the Account
     * currency.
     */
    fun currency(): Currency = currency.getRequired("currency")

    /** The identifier for the Entity the Account belongs to. */
    fun entityId(): Optional<String> = Optional.ofNullable(entityId.getNullable("entity_id"))

    /**
     * The identifier of an Entity that, while not owning the Account, is associated
     * with its activity.
     */
    fun informationalEntityId(): Optional<String> = Optional.ofNullable(informationalEntityId.getNullable("informational_entity_id"))

    /** The Account identifier. */
    fun id(): String = id.getRequired("id")

    /**
     * The interest accrued but not yet paid, expressed as a string containing a
     * floating-point value.
     */
    fun interestAccrued(): String = interestAccrued.getRequired("interest_accrued")

    /**
     * The latest [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date on which
     * interest was accrued.
     */
    fun interestAccruedAt(): Optional<LocalDate> = Optional.ofNullable(interestAccruedAt.getNullable("interest_accrued_at"))

    /** The name you choose for the Account. */
    fun name(): String = name.getRequired("name")

    /** The status of the Account. */
    fun status(): Status = status.getRequired("status")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `account`.
     */
    fun type(): Type = type.getRequired("type")

    /**
     * The Account's balances in the minor unit of its currency. For dollars, for
     * example, these values will represent cents.
     */
    @JsonProperty("balances")
    @ExcludeMissing
    fun _balances() = balances

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Account
     * was created.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt() = createdAt

    /**
     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the Account
     * currency.
     */
    @JsonProperty("currency")
    @ExcludeMissing
    fun _currency() = currency

    /** The identifier for the Entity the Account belongs to. */
    @JsonProperty("entity_id")
    @ExcludeMissing
    fun _entityId() = entityId

    /**
     * The identifier of an Entity that, while not owning the Account, is associated
     * with its activity.
     */
    @JsonProperty("informational_entity_id")
    @ExcludeMissing
    fun _informationalEntityId() = informationalEntityId

    /** The Account identifier. */
    @JsonProperty("id")
    @ExcludeMissing
    fun _id() = id

    /**
     * The interest accrued but not yet paid, expressed as a string containing a
     * floating-point value.
     */
    @JsonProperty("interest_accrued")
    @ExcludeMissing
    fun _interestAccrued() = interestAccrued

    /**
     * The latest [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date on which
     * interest was accrued.
     */
    @JsonProperty("interest_accrued_at")
    @ExcludeMissing
    fun _interestAccruedAt() = interestAccruedAt

    /** The name you choose for the Account. */
    @JsonProperty("name")
    @ExcludeMissing
    fun _name() = name

    /** The status of the Account. */
    @JsonProperty("status")
    @ExcludeMissing
    fun _status() = status

    /**
     * A constant representing the object's type. For this resource it will always be
     * `account`.
     */
    @JsonProperty("type")
    @ExcludeMissing
    fun _type() = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate() = apply {
        if (!validated) {
          balances().validate()
          createdAt()
          currency()
          entityId()
          informationalEntityId()
          id()
          interestAccrued()
          interestAccruedAt()
          name()
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

      return other is Account &&
          this.balances == other.balances &&
          this.createdAt == other.createdAt &&
          this.currency == other.currency &&
          this.entityId == other.entityId &&
          this.informationalEntityId == other.informationalEntityId &&
          this.id == other.id &&
          this.interestAccrued == other.interestAccrued &&
          this.interestAccruedAt == other.interestAccruedAt &&
          this.name == other.name &&
          this.status == other.status &&
          this.type == other.type &&
          this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
      if (hashCode == 0) {
        hashCode = Objects.hash(
            balances,
            createdAt,
            currency,
            entityId,
            informationalEntityId,
            id,
            interestAccrued,
            interestAccruedAt,
            name,
            status,
            type,
            additionalProperties,
        )
      }
      return hashCode
    }

    override fun toString() = "Account{balances=$balances, createdAt=$createdAt, currency=$currency, entityId=$entityId, informationalEntityId=$informationalEntityId, id=$id, interestAccrued=$interestAccrued, interestAccruedAt=$interestAccruedAt, name=$name, status=$status, type=$type, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic
        fun builder() = Builder()
    }

    class Builder {

        private var balances: JsonField<Balances> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var currency: JsonField<Currency> = JsonMissing.of()
        private var entityId: JsonField<String> = JsonMissing.of()
        private var informationalEntityId: JsonField<String> = JsonMissing.of()
        private var id: JsonField<String> = JsonMissing.of()
        private var interestAccrued: JsonField<String> = JsonMissing.of()
        private var interestAccruedAt: JsonField<LocalDate> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(account: Account) = apply {
            this.balances = account.balances
            this.createdAt = account.createdAt
            this.currency = account.currency
            this.entityId = account.entityId
            this.informationalEntityId = account.informationalEntityId
            this.id = account.id
            this.interestAccrued = account.interestAccrued
            this.interestAccruedAt = account.interestAccruedAt
            this.name = account.name
            this.status = account.status
            this.type = account.type
            additionalProperties(account.additionalProperties)
        }

        /**
         * The Account's balances in the minor unit of its currency. For dollars, for
         * example, these values will represent cents.
         */
        fun balances(balances: Balances) = balances(JsonField.of(balances))

        /**
         * The Account's balances in the minor unit of its currency. For dollars, for
         * example, these values will represent cents.
         */
        @JsonProperty("balances")
        @ExcludeMissing
        fun balances(balances: JsonField<Balances>) = apply {
            this.balances = balances
        }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Account
         * was created.
         */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Account
         * was created.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
            this.createdAt = createdAt
        }

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the Account
         * currency.
         */
        fun currency(currency: Currency) = currency(JsonField.of(currency))

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the Account
         * currency.
         */
        @JsonProperty("currency")
        @ExcludeMissing
        fun currency(currency: JsonField<Currency>) = apply {
            this.currency = currency
        }

        /** The identifier for the Entity the Account belongs to. */
        fun entityId(entityId: String) = entityId(JsonField.of(entityId))

        /** The identifier for the Entity the Account belongs to. */
        @JsonProperty("entity_id")
        @ExcludeMissing
        fun entityId(entityId: JsonField<String>) = apply {
            this.entityId = entityId
        }

        /**
         * The identifier of an Entity that, while not owning the Account, is associated
         * with its activity.
         */
        fun informationalEntityId(informationalEntityId: String) = informationalEntityId(JsonField.of(informationalEntityId))

        /**
         * The identifier of an Entity that, while not owning the Account, is associated
         * with its activity.
         */
        @JsonProperty("informational_entity_id")
        @ExcludeMissing
        fun informationalEntityId(informationalEntityId: JsonField<String>) = apply {
            this.informationalEntityId = informationalEntityId
        }

        /** The Account identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The Account identifier. */
        @JsonProperty("id")
        @ExcludeMissing
        fun id(id: JsonField<String>) = apply {
            this.id = id
        }

        /**
         * The interest accrued but not yet paid, expressed as a string containing a
         * floating-point value.
         */
        fun interestAccrued(interestAccrued: String) = interestAccrued(JsonField.of(interestAccrued))

        /**
         * The interest accrued but not yet paid, expressed as a string containing a
         * floating-point value.
         */
        @JsonProperty("interest_accrued")
        @ExcludeMissing
        fun interestAccrued(interestAccrued: JsonField<String>) = apply {
            this.interestAccrued = interestAccrued
        }

        /**
         * The latest [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date on which
         * interest was accrued.
         */
        fun interestAccruedAt(interestAccruedAt: LocalDate) = interestAccruedAt(JsonField.of(interestAccruedAt))

        /**
         * The latest [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date on which
         * interest was accrued.
         */
        @JsonProperty("interest_accrued_at")
        @ExcludeMissing
        fun interestAccruedAt(interestAccruedAt: JsonField<LocalDate>) = apply {
            this.interestAccruedAt = interestAccruedAt
        }

        /** The name you choose for the Account. */
        fun name(name: String) = name(JsonField.of(name))

        /** The name you choose for the Account. */
        @JsonProperty("name")
        @ExcludeMissing
        fun name(name: JsonField<String>) = apply {
            this.name = name
        }

        /** The status of the Account. */
        fun status(status: Status) = status(JsonField.of(status))

        /** The status of the Account. */
        @JsonProperty("status")
        @ExcludeMissing
        fun status(status: JsonField<Status>) = apply {
            this.status = status
        }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `account`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * A constant representing the object's type. For this resource it will always be
         * `account`.
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

        fun build(): Account = Account(
            balances,
            createdAt,
            currency,
            entityId,
            informationalEntityId,
            id,
            interestAccrued,
            interestAccruedAt,
            name,
            status,
            type,
            additionalProperties.toUnmodifiable(),
        )
    }

    /**
     * The Account's balances in the minor unit of its currency. For dollars, for
     * example, these values will represent cents.
     */
    @JsonDeserialize(builder = Balances.Builder::class)
    @NoAutoDetect
    class Balances private constructor(private val currentBalance: JsonField<Long>,private val availableBalance: JsonField<Long>,private val additionalProperties: Map<String, JsonValue>,) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /**
         * The Account's current balance, representing the sum of all posted Transactions
         * on the Account.
         */
        fun currentBalance(): Long = currentBalance.getRequired("current_balance")

        /**
         * The Account's available balance, representing the current balance less any open
         * Pending Transactions on the Account.
         */
        fun availableBalance(): Long = availableBalance.getRequired("available_balance")

        /**
         * The Account's current balance, representing the sum of all posted Transactions
         * on the Account.
         */
        @JsonProperty("current_balance")
        @ExcludeMissing
        fun _currentBalance() = currentBalance

        /**
         * The Account's available balance, representing the current balance less any open
         * Pending Transactions on the Account.
         */
        @JsonProperty("available_balance")
        @ExcludeMissing
        fun _availableBalance() = availableBalance

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate() = apply {
            if (!validated) {
              currentBalance()
              availableBalance()
              validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is Balances &&
              this.currentBalance == other.currentBalance &&
              this.availableBalance == other.availableBalance &&
              this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
          if (hashCode == 0) {
            hashCode = Objects.hash(
                currentBalance,
                availableBalance,
                additionalProperties,
            )
          }
          return hashCode
        }

        override fun toString() = "Balances{currentBalance=$currentBalance, availableBalance=$availableBalance, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic
            fun builder() = Builder()
        }

        class Builder {

            private var currentBalance: JsonField<Long> = JsonMissing.of()
            private var availableBalance: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(balances: Balances) = apply {
                this.currentBalance = balances.currentBalance
                this.availableBalance = balances.availableBalance
                additionalProperties(balances.additionalProperties)
            }

            /**
             * The Account's current balance, representing the sum of all posted Transactions
             * on the Account.
             */
            fun currentBalance(currentBalance: Long) = currentBalance(JsonField.of(currentBalance))

            /**
             * The Account's current balance, representing the sum of all posted Transactions
             * on the Account.
             */
            @JsonProperty("current_balance")
            @ExcludeMissing
            fun currentBalance(currentBalance: JsonField<Long>) = apply {
                this.currentBalance = currentBalance
            }

            /**
             * The Account's available balance, representing the current balance less any open
             * Pending Transactions on the Account.
             */
            fun availableBalance(availableBalance: Long) = availableBalance(JsonField.of(availableBalance))

            /**
             * The Account's available balance, representing the current balance less any open
             * Pending Transactions on the Account.
             */
            @JsonProperty("available_balance")
            @ExcludeMissing
            fun availableBalance(availableBalance: JsonField<Long>) = apply {
                this.availableBalance = availableBalance
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

            fun build(): Balances = Balances(
                currentBalance,
                availableBalance,
                additionalProperties.toUnmodifiable(),
            )
        }
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

            @JvmField val OPEN = Status(JsonField.of("open"))

            @JvmField val CLOSED = Status(JsonField.of("closed"))

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            OPEN,
            CLOSED,
        }

        enum class Value {
            OPEN,
            CLOSED,
            _UNKNOWN,
        }

        fun value(): Value = when (this) {
            OPEN -> Value.OPEN
            CLOSED -> Value.CLOSED
            else -> Value._UNKNOWN
        }

        fun known(): Known = when (this) {
            OPEN -> Known.OPEN
            CLOSED -> Known.CLOSED
            else -> throw IncreaseInvalidDataException("Unknown Status: $value")
        }

        fun asString(): String = _value().asStringOrThrow()
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

            @JvmField val ACCOUNT = Type(JsonField.of("account"))

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
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
            else -> throw IncreaseInvalidDataException("Unknown Type: $value")
        }

        fun asString(): String = _value().asStringOrThrow()
    }
}
