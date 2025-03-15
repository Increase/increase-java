// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.accounts

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

/** Represents a request to lookup the balance of an Account at a given point in time. */
@NoAutoDetect
class BalanceLookup
@JsonCreator
private constructor(
    @JsonProperty("account_id")
    @ExcludeMissing
    private val accountId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("available_balance")
    @ExcludeMissing
    private val availableBalance: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("current_balance")
    @ExcludeMissing
    private val currentBalance: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /**
     * The identifier for the account for which the balance was queried.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountId(): String = accountId.getRequired("account_id")

    /**
     * The Account's available balance, representing the current balance less any open Pending
     * Transactions on the Account.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun availableBalance(): Long = availableBalance.getRequired("available_balance")

    /**
     * The Account's current balance, representing the sum of all posted Transactions on the
     * Account.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun currentBalance(): Long = currentBalance.getRequired("current_balance")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `balance_lookup`.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * Returns the raw JSON value of [accountId].
     *
     * Unlike [accountId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("account_id") @ExcludeMissing fun _accountId(): JsonField<String> = accountId

    /**
     * Returns the raw JSON value of [availableBalance].
     *
     * Unlike [availableBalance], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("available_balance")
    @ExcludeMissing
    fun _availableBalance(): JsonField<Long> = availableBalance

    /**
     * Returns the raw JSON value of [currentBalance].
     *
     * Unlike [currentBalance], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("current_balance")
    @ExcludeMissing
    fun _currentBalance(): JsonField<Long> = currentBalance

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

    fun validate(): BalanceLookup = apply {
        if (validated) {
            return@apply
        }

        accountId()
        availableBalance()
        currentBalance()
        type()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BalanceLookup].
         *
         * The following fields are required:
         * ```java
         * .accountId()
         * .availableBalance()
         * .currentBalance()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BalanceLookup]. */
    class Builder internal constructor() {

        private var accountId: JsonField<String>? = null
        private var availableBalance: JsonField<Long>? = null
        private var currentBalance: JsonField<Long>? = null
        private var type: JsonField<Type>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(balanceLookup: BalanceLookup) = apply {
            accountId = balanceLookup.accountId
            availableBalance = balanceLookup.availableBalance
            currentBalance = balanceLookup.currentBalance
            type = balanceLookup.type
            additionalProperties = balanceLookup.additionalProperties.toMutableMap()
        }

        /** The identifier for the account for which the balance was queried. */
        fun accountId(accountId: String) = accountId(JsonField.of(accountId))

        /**
         * Sets [Builder.accountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

        /**
         * The Account's available balance, representing the current balance less any open Pending
         * Transactions on the Account.
         */
        fun availableBalance(availableBalance: Long) =
            availableBalance(JsonField.of(availableBalance))

        /**
         * Sets [Builder.availableBalance] to an arbitrary JSON value.
         *
         * You should usually call [Builder.availableBalance] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun availableBalance(availableBalance: JsonField<Long>) = apply {
            this.availableBalance = availableBalance
        }

        /**
         * The Account's current balance, representing the sum of all posted Transactions on the
         * Account.
         */
        fun currentBalance(currentBalance: Long) = currentBalance(JsonField.of(currentBalance))

        /**
         * Sets [Builder.currentBalance] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currentBalance] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun currentBalance(currentBalance: JsonField<Long>) = apply {
            this.currentBalance = currentBalance
        }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `balance_lookup`.
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

        fun build(): BalanceLookup =
            BalanceLookup(
                checkRequired("accountId", accountId),
                checkRequired("availableBalance", availableBalance),
                checkRequired("currentBalance", currentBalance),
                checkRequired("type", type),
                additionalProperties.toImmutable(),
            )
    }

    /**
     * A constant representing the object's type. For this resource it will always be
     * `balance_lookup`.
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

            @JvmField val BALANCE_LOOKUP = of("balance_lookup")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            BALANCE_LOOKUP
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
            BALANCE_LOOKUP,
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
                BALANCE_LOOKUP -> Value.BALANCE_LOOKUP
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
                BALANCE_LOOKUP -> Known.BALANCE_LOOKUP
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

        return /* spotless:off */ other is BalanceLookup && accountId == other.accountId && availableBalance == other.availableBalance && currentBalance == other.currentBalance && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(accountId, availableBalance, currentBalance, type, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BalanceLookup{accountId=$accountId, availableBalance=$availableBalance, currentBalance=$currentBalance, type=$type, additionalProperties=$additionalProperties}"
}
