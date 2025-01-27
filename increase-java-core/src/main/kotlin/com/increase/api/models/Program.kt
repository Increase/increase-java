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

/**
 * Programs determine the compliance and commercial terms of Accounts. By default, you have a
 * Commercial Banking program for managing your own funds. If you are lending or managing funds on
 * behalf of your customers, or otherwise engaged in regulated activity, we will work together to
 * create additional Programs for you.
 */
@NoAutoDetect
class Program
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("bank") @ExcludeMissing private val bank: JsonField<Bank> = JsonMissing.of(),
    @JsonProperty("billing_account_id")
    @ExcludeMissing
    private val billingAccountId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("default_digital_card_profile_id")
    @ExcludeMissing
    private val defaultDigitalCardProfileId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("interest_rate")
    @ExcludeMissing
    private val interestRate: JsonField<String> = JsonMissing.of(),
    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
    @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
    @JsonProperty("updated_at")
    @ExcludeMissing
    private val updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The Program identifier. */
    fun id(): String = id.getRequired("id")

    /** The Bank the Program is with. */
    fun bank(): Bank = bank.getRequired("bank")

    /** The Program billing account. */
    fun billingAccountId(): Optional<String> =
        Optional.ofNullable(billingAccountId.getNullable("billing_account_id"))

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Program was created.
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /** The default configuration for digital cards attached to this Program. */
    fun defaultDigitalCardProfileId(): Optional<String> =
        Optional.ofNullable(
            defaultDigitalCardProfileId.getNullable("default_digital_card_profile_id")
        )

    /**
     * The Interest Rate currently being earned on the accounts in this program, as a string
     * containing a decimal number. For example, a 1% interest rate would be represented as "0.01".
     */
    fun interestRate(): String = interestRate.getRequired("interest_rate")

    /** The name of the Program. */
    fun name(): String = name.getRequired("name")

    /** A constant representing the object's type. For this resource it will always be `program`. */
    fun type(): Type = type.getRequired("type")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Program was last
     * updated.
     */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    /** The Program identifier. */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /** The Bank the Program is with. */
    @JsonProperty("bank") @ExcludeMissing fun _bank(): JsonField<Bank> = bank

    /** The Program billing account. */
    @JsonProperty("billing_account_id")
    @ExcludeMissing
    fun _billingAccountId(): JsonField<String> = billingAccountId

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Program was created.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /** The default configuration for digital cards attached to this Program. */
    @JsonProperty("default_digital_card_profile_id")
    @ExcludeMissing
    fun _defaultDigitalCardProfileId(): JsonField<String> = defaultDigitalCardProfileId

    /**
     * The Interest Rate currently being earned on the accounts in this program, as a string
     * containing a decimal number. For example, a 1% interest rate would be represented as "0.01".
     */
    @JsonProperty("interest_rate")
    @ExcludeMissing
    fun _interestRate(): JsonField<String> = interestRate

    /** The name of the Program. */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /** A constant representing the object's type. For this resource it will always be `program`. */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Program was last
     * updated.
     */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): Program = apply {
        if (validated) {
            return@apply
        }

        id()
        bank()
        billingAccountId()
        createdAt()
        defaultDigitalCardProfileId()
        interestRate()
        name()
        type()
        updatedAt()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Program]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var bank: JsonField<Bank>? = null
        private var billingAccountId: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var defaultDigitalCardProfileId: JsonField<String>? = null
        private var interestRate: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var type: JsonField<Type>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(program: Program) = apply {
            id = program.id
            bank = program.bank
            billingAccountId = program.billingAccountId
            createdAt = program.createdAt
            defaultDigitalCardProfileId = program.defaultDigitalCardProfileId
            interestRate = program.interestRate
            name = program.name
            type = program.type
            updatedAt = program.updatedAt
            additionalProperties = program.additionalProperties.toMutableMap()
        }

        /** The Program identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The Program identifier. */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The Bank the Program is with. */
        fun bank(bank: Bank) = bank(JsonField.of(bank))

        /** The Bank the Program is with. */
        fun bank(bank: JsonField<Bank>) = apply { this.bank = bank }

        /** The Program billing account. */
        fun billingAccountId(billingAccountId: String?) =
            billingAccountId(JsonField.ofNullable(billingAccountId))

        /** The Program billing account. */
        fun billingAccountId(billingAccountId: Optional<String>) =
            billingAccountId(billingAccountId.orElse(null))

        /** The Program billing account. */
        fun billingAccountId(billingAccountId: JsonField<String>) = apply {
            this.billingAccountId = billingAccountId
        }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Program was
         * created.
         */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Program was
         * created.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** The default configuration for digital cards attached to this Program. */
        fun defaultDigitalCardProfileId(defaultDigitalCardProfileId: String?) =
            defaultDigitalCardProfileId(JsonField.ofNullable(defaultDigitalCardProfileId))

        /** The default configuration for digital cards attached to this Program. */
        fun defaultDigitalCardProfileId(defaultDigitalCardProfileId: Optional<String>) =
            defaultDigitalCardProfileId(defaultDigitalCardProfileId.orElse(null))

        /** The default configuration for digital cards attached to this Program. */
        fun defaultDigitalCardProfileId(defaultDigitalCardProfileId: JsonField<String>) = apply {
            this.defaultDigitalCardProfileId = defaultDigitalCardProfileId
        }

        /**
         * The Interest Rate currently being earned on the accounts in this program, as a string
         * containing a decimal number. For example, a 1% interest rate would be represented as
         * "0.01".
         */
        fun interestRate(interestRate: String) = interestRate(JsonField.of(interestRate))

        /**
         * The Interest Rate currently being earned on the accounts in this program, as a string
         * containing a decimal number. For example, a 1% interest rate would be represented as
         * "0.01".
         */
        fun interestRate(interestRate: JsonField<String>) = apply {
            this.interestRate = interestRate
        }

        /** The name of the Program. */
        fun name(name: String) = name(JsonField.of(name))

        /** The name of the Program. */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /**
         * A constant representing the object's type. For this resource it will always be `program`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * A constant representing the object's type. For this resource it will always be `program`.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Program was last
         * updated.
         */
        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Program was last
         * updated.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

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

        fun build(): Program =
            Program(
                checkRequired("id", id),
                checkRequired("bank", bank),
                checkRequired("billingAccountId", billingAccountId),
                checkRequired("createdAt", createdAt),
                checkRequired("defaultDigitalCardProfileId", defaultDigitalCardProfileId),
                checkRequired("interestRate", interestRate),
                checkRequired("name", name),
                checkRequired("type", type),
                checkRequired("updatedAt", updatedAt),
                additionalProperties.toImmutable(),
            )
    }

    /** The Bank the Program is with. */
    class Bank
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

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

            /** Blue Ridge Bank, N.A. */
            @JvmField val BLUE_RIDGE_BANK = of("blue_ridge_bank")

            /** First Internet Bank of Indiana */
            @JvmField val FIRST_INTERNET_BANK = of("first_internet_bank")

            /** Grasshopper Bank */
            @JvmField val GRASSHOPPER_BANK = of("grasshopper_bank")

            @JvmStatic fun of(value: String) = Bank(JsonField.of(value))
        }

        /** An enum containing [Bank]'s known values. */
        enum class Known {
            /** Blue Ridge Bank, N.A. */
            BLUE_RIDGE_BANK,
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
            /** Blue Ridge Bank, N.A. */
            BLUE_RIDGE_BANK,
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
                BLUE_RIDGE_BANK -> Value.BLUE_RIDGE_BANK
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
                BLUE_RIDGE_BANK -> Known.BLUE_RIDGE_BANK
                FIRST_INTERNET_BANK -> Known.FIRST_INTERNET_BANK
                GRASSHOPPER_BANK -> Known.GRASSHOPPER_BANK
                else -> throw IncreaseInvalidDataException("Unknown Bank: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Bank && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** A constant representing the object's type. For this resource it will always be `program`. */
    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

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

            @JvmField val PROGRAM = of("program")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            PROGRAM,
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
            PROGRAM,
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
                PROGRAM -> Value.PROGRAM
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
                PROGRAM -> Known.PROGRAM
                else -> throw IncreaseInvalidDataException("Unknown Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

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

        return /* spotless:off */ other is Program && id == other.id && bank == other.bank && billingAccountId == other.billingAccountId && createdAt == other.createdAt && defaultDigitalCardProfileId == other.defaultDigitalCardProfileId && interestRate == other.interestRate && name == other.name && type == other.type && updatedAt == other.updatedAt && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, bank, billingAccountId, createdAt, defaultDigitalCardProfileId, interestRate, name, type, updatedAt, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Program{id=$id, bank=$bank, billingAccountId=$billingAccountId, createdAt=$createdAt, defaultDigitalCardProfileId=$defaultDigitalCardProfileId, interestRate=$interestRate, name=$name, type=$type, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
