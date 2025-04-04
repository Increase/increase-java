// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.programs

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

/**
 * Programs determine the compliance and commercial terms of Accounts. By default, you have a
 * Commercial Banking program for managing your own funds. If you are lending or managing funds on
 * behalf of your customers, or otherwise engaged in regulated activity, we will work together to
 * create additional Programs for you.
 */
class Program
private constructor(
    private val id: JsonField<String>,
    private val bank: JsonField<Bank>,
    private val billingAccountId: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val defaultDigitalCardProfileId: JsonField<String>,
    private val interestRate: JsonField<String>,
    private val name: JsonField<String>,
    private val type: JsonField<Type>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("bank") @ExcludeMissing bank: JsonField<Bank> = JsonMissing.of(),
        @JsonProperty("billing_account_id")
        @ExcludeMissing
        billingAccountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("default_digital_card_profile_id")
        @ExcludeMissing
        defaultDigitalCardProfileId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("interest_rate")
        @ExcludeMissing
        interestRate: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        id,
        bank,
        billingAccountId,
        createdAt,
        defaultDigitalCardProfileId,
        interestRate,
        name,
        type,
        updatedAt,
        mutableMapOf(),
    )

    /**
     * The Program identifier.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * The Bank the Program is with.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun bank(): Bank = bank.getRequired("bank")

    /**
     * The Program billing account.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun billingAccountId(): Optional<String> = billingAccountId.getOptional("billing_account_id")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Program was created.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * The default configuration for digital cards attached to this Program.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun defaultDigitalCardProfileId(): Optional<String> =
        defaultDigitalCardProfileId.getOptional("default_digital_card_profile_id")

    /**
     * The Interest Rate currently being earned on the accounts in this program, as a string
     * containing a decimal number. For example, a 1% interest rate would be represented as "0.01".
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun interestRate(): String = interestRate.getRequired("interest_rate")

    /**
     * The name of the Program.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * A constant representing the object's type. For this resource it will always be `program`.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Program was last
     * updated.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [bank].
     *
     * Unlike [bank], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("bank") @ExcludeMissing fun _bank(): JsonField<Bank> = bank

    /**
     * Returns the raw JSON value of [billingAccountId].
     *
     * Unlike [billingAccountId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("billing_account_id")
    @ExcludeMissing
    fun _billingAccountId(): JsonField<String> = billingAccountId

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [defaultDigitalCardProfileId].
     *
     * Unlike [defaultDigitalCardProfileId], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("default_digital_card_profile_id")
    @ExcludeMissing
    fun _defaultDigitalCardProfileId(): JsonField<String> = defaultDigitalCardProfileId

    /**
     * Returns the raw JSON value of [interestRate].
     *
     * Unlike [interestRate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("interest_rate")
    @ExcludeMissing
    fun _interestRate(): JsonField<String> = interestRate

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

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
         * Returns a mutable builder for constructing an instance of [Program].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .bank()
         * .billingAccountId()
         * .createdAt()
         * .defaultDigitalCardProfileId()
         * .interestRate()
         * .name()
         * .type()
         * .updatedAt()
         * ```
         */
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

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The Bank the Program is with. */
        fun bank(bank: Bank) = bank(JsonField.of(bank))

        /**
         * Sets [Builder.bank] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bank] with a well-typed [Bank] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun bank(bank: JsonField<Bank>) = apply { this.bank = bank }

        /** The Program billing account. */
        fun billingAccountId(billingAccountId: String?) =
            billingAccountId(JsonField.ofNullable(billingAccountId))

        /** Alias for calling [Builder.billingAccountId] with `billingAccountId.orElse(null)`. */
        fun billingAccountId(billingAccountId: Optional<String>) =
            billingAccountId(billingAccountId.getOrNull())

        /**
         * Sets [Builder.billingAccountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billingAccountId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun billingAccountId(billingAccountId: JsonField<String>) = apply {
            this.billingAccountId = billingAccountId
        }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Program was
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
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** The default configuration for digital cards attached to this Program. */
        fun defaultDigitalCardProfileId(defaultDigitalCardProfileId: String?) =
            defaultDigitalCardProfileId(JsonField.ofNullable(defaultDigitalCardProfileId))

        /**
         * Alias for calling [Builder.defaultDigitalCardProfileId] with
         * `defaultDigitalCardProfileId.orElse(null)`.
         */
        fun defaultDigitalCardProfileId(defaultDigitalCardProfileId: Optional<String>) =
            defaultDigitalCardProfileId(defaultDigitalCardProfileId.getOrNull())

        /**
         * Sets [Builder.defaultDigitalCardProfileId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.defaultDigitalCardProfileId] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
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
         * Sets [Builder.interestRate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.interestRate] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun interestRate(interestRate: JsonField<String>) = apply {
            this.interestRate = interestRate
        }

        /** The name of the Program. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /**
         * A constant representing the object's type. For this resource it will always be `program`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Program was last
         * updated.
         */
        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
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

        /**
         * Returns an immutable instance of [Program].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .bank()
         * .billingAccountId()
         * .createdAt()
         * .defaultDigitalCardProfileId()
         * .interestRate()
         * .name()
         * .type()
         * .updatedAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
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
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Program = apply {
        if (validated) {
            return@apply
        }

        id()
        bank().validate()
        billingAccountId()
        createdAt()
        defaultDigitalCardProfileId()
        interestRate()
        name()
        type().validate()
        updatedAt()
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
            (bank.asKnown().getOrNull()?.validity() ?: 0) +
            (if (billingAccountId.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (defaultDigitalCardProfileId.asKnown().isPresent) 1 else 0) +
            (if (interestRate.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0)

    /** The Bank the Program is with. */
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

        private var validated: Boolean = false

        fun validate(): Bank = apply {
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

            return /* spotless:off */ other is Bank && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** A constant representing the object's type. For this resource it will always be `program`. */
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

            @JvmField val PROGRAM = of("program")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            PROGRAM
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
