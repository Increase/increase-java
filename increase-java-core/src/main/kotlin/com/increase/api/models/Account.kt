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
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Accounts are your bank accounts with Increase. They store money, receive transfers, and send
 * payments. They earn interest and have depository insurance.
 */
@NoAutoDetect
class Account
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("bank") @ExcludeMissing private val bank: JsonField<Bank> = JsonMissing.of(),
    @JsonProperty("closed_at")
    @ExcludeMissing
    private val closedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("currency")
    @ExcludeMissing
    private val currency: JsonField<Currency> = JsonMissing.of(),
    @JsonProperty("entity_id")
    @ExcludeMissing
    private val entityId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("idempotency_key")
    @ExcludeMissing
    private val idempotencyKey: JsonField<String> = JsonMissing.of(),
    @JsonProperty("informational_entity_id")
    @ExcludeMissing
    private val informationalEntityId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("interest_accrued")
    @ExcludeMissing
    private val interestAccrued: JsonField<String> = JsonMissing.of(),
    @JsonProperty("interest_accrued_at")
    @ExcludeMissing
    private val interestAccruedAt: JsonField<LocalDate> = JsonMissing.of(),
    @JsonProperty("interest_rate")
    @ExcludeMissing
    private val interestRate: JsonField<String> = JsonMissing.of(),
    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
    @JsonProperty("program_id")
    @ExcludeMissing
    private val programId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("status")
    @ExcludeMissing
    private val status: JsonField<Status> = JsonMissing.of(),
    @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The Account identifier. */
    fun id(): String = id.getRequired("id")

    /** The bank the Account is with. */
    fun bank(): Bank = bank.getRequired("bank")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Account was closed.
     */
    fun closedAt(): Optional<OffsetDateTime> =
        Optional.ofNullable(closedAt.getNullable("closed_at"))

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Account was created.
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the Account currency. */
    fun currency(): Currency = currency.getRequired("currency")

    /** The identifier for the Entity the Account belongs to. */
    fun entityId(): Optional<String> = Optional.ofNullable(entityId.getNullable("entity_id"))

    /**
     * The idempotency key you chose for this object. This value is unique across Increase and is
     * used to ensure that a request is only processed once. Learn more about
     * [idempotency](https://increase.com/documentation/idempotency-keys).
     */
    fun idempotencyKey(): Optional<String> =
        Optional.ofNullable(idempotencyKey.getNullable("idempotency_key"))

    /**
     * The identifier of an Entity that, while not owning the Account, is associated with its
     * activity.
     */
    fun informationalEntityId(): Optional<String> =
        Optional.ofNullable(informationalEntityId.getNullable("informational_entity_id"))

    /**
     * The interest accrued but not yet paid, expressed as a string containing a floating-point
     * value.
     */
    fun interestAccrued(): String = interestAccrued.getRequired("interest_accrued")

    /**
     * The latest [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date on which interest was
     * accrued.
     */
    fun interestAccruedAt(): Optional<LocalDate> =
        Optional.ofNullable(interestAccruedAt.getNullable("interest_accrued_at"))

    /**
     * The Interest Rate currently being earned on the account, as a string containing a decimal
     * number. For example, a 1% interest rate would be represented as "0.01".
     */
    fun interestRate(): String = interestRate.getRequired("interest_rate")

    /** The name you choose for the Account. */
    fun name(): String = name.getRequired("name")

    /**
     * The identifier of the Program determining the compliance and commercial terms of this
     * Account.
     */
    fun programId(): String = programId.getRequired("program_id")

    /** The status of the Account. */
    fun status(): Status = status.getRequired("status")

    /** A constant representing the object's type. For this resource it will always be `account`. */
    fun type(): Type = type.getRequired("type")

    /** The Account identifier. */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /** The bank the Account is with. */
    @JsonProperty("bank") @ExcludeMissing fun _bank(): JsonField<Bank> = bank

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Account was closed.
     */
    @JsonProperty("closed_at") @ExcludeMissing fun _closedAt(): JsonField<OffsetDateTime> = closedAt

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Account was created.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the Account currency. */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<Currency> = currency

    /** The identifier for the Entity the Account belongs to. */
    @JsonProperty("entity_id") @ExcludeMissing fun _entityId(): JsonField<String> = entityId

    /**
     * The idempotency key you chose for this object. This value is unique across Increase and is
     * used to ensure that a request is only processed once. Learn more about
     * [idempotency](https://increase.com/documentation/idempotency-keys).
     */
    @JsonProperty("idempotency_key")
    @ExcludeMissing
    fun _idempotencyKey(): JsonField<String> = idempotencyKey

    /**
     * The identifier of an Entity that, while not owning the Account, is associated with its
     * activity.
     */
    @JsonProperty("informational_entity_id")
    @ExcludeMissing
    fun _informationalEntityId(): JsonField<String> = informationalEntityId

    /**
     * The interest accrued but not yet paid, expressed as a string containing a floating-point
     * value.
     */
    @JsonProperty("interest_accrued")
    @ExcludeMissing
    fun _interestAccrued(): JsonField<String> = interestAccrued

    /**
     * The latest [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date on which interest was
     * accrued.
     */
    @JsonProperty("interest_accrued_at")
    @ExcludeMissing
    fun _interestAccruedAt(): JsonField<LocalDate> = interestAccruedAt

    /**
     * The Interest Rate currently being earned on the account, as a string containing a decimal
     * number. For example, a 1% interest rate would be represented as "0.01".
     */
    @JsonProperty("interest_rate")
    @ExcludeMissing
    fun _interestRate(): JsonField<String> = interestRate

    /** The name you choose for the Account. */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * The identifier of the Program determining the compliance and commercial terms of this
     * Account.
     */
    @JsonProperty("program_id") @ExcludeMissing fun _programId(): JsonField<String> = programId

    /** The status of the Account. */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /** A constant representing the object's type. For this resource it will always be `account`. */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): Account = apply {
        if (validated) {
            return@apply
        }

        id()
        bank()
        closedAt()
        createdAt()
        currency()
        entityId()
        idempotencyKey()
        informationalEntityId()
        interestAccrued()
        interestAccruedAt()
        interestRate()
        name()
        programId()
        status()
        type()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [Account].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .bank()
         * .closedAt()
         * .createdAt()
         * .currency()
         * .entityId()
         * .idempotencyKey()
         * .informationalEntityId()
         * .interestAccrued()
         * .interestAccruedAt()
         * .interestRate()
         * .name()
         * .programId()
         * .status()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Account]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var bank: JsonField<Bank>? = null
        private var closedAt: JsonField<OffsetDateTime>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var currency: JsonField<Currency>? = null
        private var entityId: JsonField<String>? = null
        private var idempotencyKey: JsonField<String>? = null
        private var informationalEntityId: JsonField<String>? = null
        private var interestAccrued: JsonField<String>? = null
        private var interestAccruedAt: JsonField<LocalDate>? = null
        private var interestRate: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var programId: JsonField<String>? = null
        private var status: JsonField<Status>? = null
        private var type: JsonField<Type>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(account: Account) = apply {
            id = account.id
            bank = account.bank
            closedAt = account.closedAt
            createdAt = account.createdAt
            currency = account.currency
            entityId = account.entityId
            idempotencyKey = account.idempotencyKey
            informationalEntityId = account.informationalEntityId
            interestAccrued = account.interestAccrued
            interestAccruedAt = account.interestAccruedAt
            interestRate = account.interestRate
            name = account.name
            programId = account.programId
            status = account.status
            type = account.type
            additionalProperties = account.additionalProperties.toMutableMap()
        }

        /** The Account identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The Account identifier. */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The bank the Account is with. */
        fun bank(bank: Bank) = bank(JsonField.of(bank))

        /** The bank the Account is with. */
        fun bank(bank: JsonField<Bank>) = apply { this.bank = bank }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Account was
         * closed.
         */
        fun closedAt(closedAt: OffsetDateTime?) = closedAt(JsonField.ofNullable(closedAt))

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Account was
         * closed.
         */
        fun closedAt(closedAt: Optional<OffsetDateTime>) = closedAt(closedAt.getOrNull())

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Account was
         * closed.
         */
        fun closedAt(closedAt: JsonField<OffsetDateTime>) = apply { this.closedAt = closedAt }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Account was
         * created.
         */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Account was
         * created.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the Account currency. */
        fun currency(currency: Currency) = currency(JsonField.of(currency))

        /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the Account currency. */
        fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

        /** The identifier for the Entity the Account belongs to. */
        fun entityId(entityId: String?) = entityId(JsonField.ofNullable(entityId))

        /** The identifier for the Entity the Account belongs to. */
        fun entityId(entityId: Optional<String>) = entityId(entityId.getOrNull())

        /** The identifier for the Entity the Account belongs to. */
        fun entityId(entityId: JsonField<String>) = apply { this.entityId = entityId }

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
         * The identifier of an Entity that, while not owning the Account, is associated with its
         * activity.
         */
        fun informationalEntityId(informationalEntityId: String?) =
            informationalEntityId(JsonField.ofNullable(informationalEntityId))

        /**
         * The identifier of an Entity that, while not owning the Account, is associated with its
         * activity.
         */
        fun informationalEntityId(informationalEntityId: Optional<String>) =
            informationalEntityId(informationalEntityId.getOrNull())

        /**
         * The identifier of an Entity that, while not owning the Account, is associated with its
         * activity.
         */
        fun informationalEntityId(informationalEntityId: JsonField<String>) = apply {
            this.informationalEntityId = informationalEntityId
        }

        /**
         * The interest accrued but not yet paid, expressed as a string containing a floating-point
         * value.
         */
        fun interestAccrued(interestAccrued: String) =
            interestAccrued(JsonField.of(interestAccrued))

        /**
         * The interest accrued but not yet paid, expressed as a string containing a floating-point
         * value.
         */
        fun interestAccrued(interestAccrued: JsonField<String>) = apply {
            this.interestAccrued = interestAccrued
        }

        /**
         * The latest [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date on which interest was
         * accrued.
         */
        fun interestAccruedAt(interestAccruedAt: LocalDate?) =
            interestAccruedAt(JsonField.ofNullable(interestAccruedAt))

        /**
         * The latest [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date on which interest was
         * accrued.
         */
        fun interestAccruedAt(interestAccruedAt: Optional<LocalDate>) =
            interestAccruedAt(interestAccruedAt.getOrNull())

        /**
         * The latest [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date on which interest was
         * accrued.
         */
        fun interestAccruedAt(interestAccruedAt: JsonField<LocalDate>) = apply {
            this.interestAccruedAt = interestAccruedAt
        }

        /**
         * The Interest Rate currently being earned on the account, as a string containing a decimal
         * number. For example, a 1% interest rate would be represented as "0.01".
         */
        fun interestRate(interestRate: String) = interestRate(JsonField.of(interestRate))

        /**
         * The Interest Rate currently being earned on the account, as a string containing a decimal
         * number. For example, a 1% interest rate would be represented as "0.01".
         */
        fun interestRate(interestRate: JsonField<String>) = apply {
            this.interestRate = interestRate
        }

        /** The name you choose for the Account. */
        fun name(name: String) = name(JsonField.of(name))

        /** The name you choose for the Account. */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /**
         * The identifier of the Program determining the compliance and commercial terms of this
         * Account.
         */
        fun programId(programId: String) = programId(JsonField.of(programId))

        /**
         * The identifier of the Program determining the compliance and commercial terms of this
         * Account.
         */
        fun programId(programId: JsonField<String>) = apply { this.programId = programId }

        /** The status of the Account. */
        fun status(status: Status) = status(JsonField.of(status))

        /** The status of the Account. */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /**
         * A constant representing the object's type. For this resource it will always be `account`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * A constant representing the object's type. For this resource it will always be `account`.
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

        fun build(): Account =
            Account(
                checkRequired("id", id),
                checkRequired("bank", bank),
                checkRequired("closedAt", closedAt),
                checkRequired("createdAt", createdAt),
                checkRequired("currency", currency),
                checkRequired("entityId", entityId),
                checkRequired("idempotencyKey", idempotencyKey),
                checkRequired("informationalEntityId", informationalEntityId),
                checkRequired("interestAccrued", interestAccrued),
                checkRequired("interestAccruedAt", interestAccruedAt),
                checkRequired("interestRate", interestRate),
                checkRequired("name", name),
                checkRequired("programId", programId),
                checkRequired("status", status),
                checkRequired("type", type),
                additionalProperties.toImmutable(),
            )
    }

    /** The bank the Account is with. */
    class Bank @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            /** Core Bank */
            @JvmField val CORE_BANK = of("core_bank")

            /** First Internet Bank of Indiana */
            @JvmField val FIRST_INTERNET_BANK = of("first_internet_bank")

            /** Grasshopper Bank */
            @JvmField val GRASSHOPPER_BANK = of("grasshopper_bank")

            @JvmStatic fun of(value: String) = Bank(JsonField.of(value))
        }

        /** An enum containing [Bank]'s known values. */
        enum class Known {
            /** Core Bank */
            CORE_BANK,
            /** First Internet Bank of Indiana */
            FIRST_INTERNET_BANK,
            /** Grasshopper Bank */
            GRASSHOPPER_BANK,
        }

        /**
         * An enum containing [Bank]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Bank] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            /** Core Bank */
            CORE_BANK,
            /** First Internet Bank of Indiana */
            FIRST_INTERNET_BANK,
            /** Grasshopper Bank */
            GRASSHOPPER_BANK,
            /** An enum member indicating that [Bank] was instantiated with an unknown value. */
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
                CORE_BANK -> Value.CORE_BANK
                FIRST_INTERNET_BANK -> Value.FIRST_INTERNET_BANK
                GRASSHOPPER_BANK -> Value.GRASSHOPPER_BANK
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
                CORE_BANK -> Known.CORE_BANK
                FIRST_INTERNET_BANK -> Known.FIRST_INTERNET_BANK
                GRASSHOPPER_BANK -> Known.GRASSHOPPER_BANK
                else -> throw IncreaseInvalidDataException("Unknown Bank: $value")
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

            return /* spotless:off */ other is Bank && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the Account currency. */
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

    /** The status of the Account. */
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

            /** Closed Accounts on which no new activity can occur. */
            @JvmField val CLOSED = of("closed")

            /** Open Accounts that are ready to use. */
            @JvmField val OPEN = of("open")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            /** Closed Accounts on which no new activity can occur. */
            CLOSED,
            /** Open Accounts that are ready to use. */
            OPEN,
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
            /** Closed Accounts on which no new activity can occur. */
            CLOSED,
            /** Open Accounts that are ready to use. */
            OPEN,
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
                CLOSED -> Value.CLOSED
                OPEN -> Value.OPEN
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
                CLOSED -> Known.CLOSED
                OPEN -> Known.OPEN
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

    /** A constant representing the object's type. For this resource it will always be `account`. */
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

            @JvmField val ACCOUNT = of("account")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            ACCOUNT
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
            ACCOUNT,
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
                ACCOUNT -> Value.ACCOUNT
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
                ACCOUNT -> Known.ACCOUNT
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

        return /* spotless:off */ other is Account && id == other.id && bank == other.bank && closedAt == other.closedAt && createdAt == other.createdAt && currency == other.currency && entityId == other.entityId && idempotencyKey == other.idempotencyKey && informationalEntityId == other.informationalEntityId && interestAccrued == other.interestAccrued && interestAccruedAt == other.interestAccruedAt && interestRate == other.interestRate && name == other.name && programId == other.programId && status == other.status && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, bank, closedAt, createdAt, currency, entityId, idempotencyKey, informationalEntityId, interestAccrued, interestAccruedAt, interestRate, name, programId, status, type, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Account{id=$id, bank=$bank, closedAt=$closedAt, createdAt=$createdAt, currency=$currency, entityId=$entityId, idempotencyKey=$idempotencyKey, informationalEntityId=$informationalEntityId, interestAccrued=$interestAccrued, interestAccruedAt=$interestAccruedAt, interestRate=$interestRate, name=$name, programId=$programId, status=$status, type=$type, additionalProperties=$additionalProperties}"
}
