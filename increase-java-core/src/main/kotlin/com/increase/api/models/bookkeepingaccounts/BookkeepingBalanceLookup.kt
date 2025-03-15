// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.bookkeepingaccounts

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
import java.util.Objects

/**
 * Represents a request to lookup the balance of an Bookkeeping Account at a given point in time.
 */
@NoAutoDetect
class BookkeepingBalanceLookup
@JsonCreator
private constructor(
    @JsonProperty("balance")
    @ExcludeMissing
    private val balance: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("bookkeeping_account_id")
    @ExcludeMissing
    private val bookkeepingAccountId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /**
     * The Bookkeeping Account's current balance, representing the sum of all Bookkeeping Entries on
     * the Bookkeeping Account.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun balance(): Long = balance.getRequired("balance")

    /**
     * The identifier for the account for which the balance was queried.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun bookkeepingAccountId(): String = bookkeepingAccountId.getRequired("bookkeeping_account_id")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `bookkeeping_balance_lookup`.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * Returns the raw JSON value of [balance].
     *
     * Unlike [balance], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("balance") @ExcludeMissing fun _balance(): JsonField<Long> = balance

    /**
     * Returns the raw JSON value of [bookkeepingAccountId].
     *
     * Unlike [bookkeepingAccountId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("bookkeeping_account_id")
    @ExcludeMissing
    fun _bookkeepingAccountId(): JsonField<String> = bookkeepingAccountId

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): BookkeepingBalanceLookup = apply {
        if (validated) {
            return@apply
        }

        balance()
        bookkeepingAccountId()
        type()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BookkeepingBalanceLookup].
         *
         * The following fields are required:
         * ```java
         * .balance()
         * .bookkeepingAccountId()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BookkeepingBalanceLookup]. */
    class Builder internal constructor() {

        private var balance: JsonField<Long>? = null
        private var bookkeepingAccountId: JsonField<String>? = null
        private var type: JsonField<Type>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(bookkeepingBalanceLookup: BookkeepingBalanceLookup) = apply {
            balance = bookkeepingBalanceLookup.balance
            bookkeepingAccountId = bookkeepingBalanceLookup.bookkeepingAccountId
            type = bookkeepingBalanceLookup.type
            additionalProperties = bookkeepingBalanceLookup.additionalProperties.toMutableMap()
        }

        /**
         * The Bookkeeping Account's current balance, representing the sum of all Bookkeeping
         * Entries on the Bookkeeping Account.
         */
        fun balance(balance: Long) = balance(JsonField.of(balance))

        /**
         * Sets [Builder.balance] to an arbitrary JSON value.
         *
         * You should usually call [Builder.balance] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun balance(balance: JsonField<Long>) = apply { this.balance = balance }

        /** The identifier for the account for which the balance was queried. */
        fun bookkeepingAccountId(bookkeepingAccountId: String) =
            bookkeepingAccountId(JsonField.of(bookkeepingAccountId))

        /**
         * Sets [Builder.bookkeepingAccountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bookkeepingAccountId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun bookkeepingAccountId(bookkeepingAccountId: JsonField<String>) = apply {
            this.bookkeepingAccountId = bookkeepingAccountId
        }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `bookkeeping_balance_lookup`.
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

        fun build(): BookkeepingBalanceLookup =
            BookkeepingBalanceLookup(
                checkRequired("balance", balance),
                checkRequired("bookkeepingAccountId", bookkeepingAccountId),
                checkRequired("type", type),
                additionalProperties.toImmutable(),
            )
    }

    /**
     * A constant representing the object's type. For this resource it will always be
     * `bookkeeping_balance_lookup`.
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

            @JvmField val BOOKKEEPING_BALANCE_LOOKUP = of("bookkeeping_balance_lookup")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            BOOKKEEPING_BALANCE_LOOKUP
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
            BOOKKEEPING_BALANCE_LOOKUP,
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
                BOOKKEEPING_BALANCE_LOOKUP -> Value.BOOKKEEPING_BALANCE_LOOKUP
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
                BOOKKEEPING_BALANCE_LOOKUP -> Known.BOOKKEEPING_BALANCE_LOOKUP
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

        return /* spotless:off */ other is BookkeepingBalanceLookup && balance == other.balance && bookkeepingAccountId == other.bookkeepingAccountId && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(balance, bookkeepingAccountId, type, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BookkeepingBalanceLookup{balance=$balance, bookkeepingAccountId=$bookkeepingAccountId, type=$type, additionalProperties=$additionalProperties}"
}
