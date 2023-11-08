// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.toUnmodifiable
import com.increase.api.errors.IncreaseInvalidDataException
import java.util.Objects

/** Represents a request to lookup the balance of an Account at a given point in time. */
@JsonDeserialize(builder = BalanceLookup.Builder::class)
@NoAutoDetect
class BalanceLookup
private constructor(
    private val accountId: JsonField<String>,
    private val currentBalance: JsonField<Long>,
    private val availableBalance: JsonField<Long>,
    private val type: JsonField<Type>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** The identifier for the account for which the balance was queried. */
    fun accountId(): String = accountId.getRequired("account_id")

    /**
     * The Account's current balance, representing the sum of all posted Transactions on the
     * Account.
     */
    fun currentBalance(): Long = currentBalance.getRequired("current_balance")

    /**
     * The Account's available balance, representing the current balance less any open Pending
     * Transactions on the Account.
     */
    fun availableBalance(): Long = availableBalance.getRequired("available_balance")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `balance_lookup`.
     */
    fun type(): Type = type.getRequired("type")

    /** The identifier for the account for which the balance was queried. */
    @JsonProperty("account_id") @ExcludeMissing fun _accountId() = accountId

    /**
     * The Account's current balance, representing the sum of all posted Transactions on the
     * Account.
     */
    @JsonProperty("current_balance") @ExcludeMissing fun _currentBalance() = currentBalance

    /**
     * The Account's available balance, representing the current balance less any open Pending
     * Transactions on the Account.
     */
    @JsonProperty("available_balance") @ExcludeMissing fun _availableBalance() = availableBalance

    /**
     * A constant representing the object's type. For this resource it will always be
     * `balance_lookup`.
     */
    @JsonProperty("type") @ExcludeMissing fun _type() = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): BalanceLookup = apply {
        if (!validated) {
            accountId()
            currentBalance()
            availableBalance()
            type()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BalanceLookup &&
            this.accountId == other.accountId &&
            this.currentBalance == other.currentBalance &&
            this.availableBalance == other.availableBalance &&
            this.type == other.type &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    accountId,
                    currentBalance,
                    availableBalance,
                    type,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "BalanceLookup{accountId=$accountId, currentBalance=$currentBalance, availableBalance=$availableBalance, type=$type, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var accountId: JsonField<String> = JsonMissing.of()
        private var currentBalance: JsonField<Long> = JsonMissing.of()
        private var availableBalance: JsonField<Long> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(balanceLookup: BalanceLookup) = apply {
            this.accountId = balanceLookup.accountId
            this.currentBalance = balanceLookup.currentBalance
            this.availableBalance = balanceLookup.availableBalance
            this.type = balanceLookup.type
            additionalProperties(balanceLookup.additionalProperties)
        }

        /** The identifier for the account for which the balance was queried. */
        fun accountId(accountId: String) = accountId(JsonField.of(accountId))

        /** The identifier for the account for which the balance was queried. */
        @JsonProperty("account_id")
        @ExcludeMissing
        fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

        /**
         * The Account's current balance, representing the sum of all posted Transactions on the
         * Account.
         */
        fun currentBalance(currentBalance: Long) = currentBalance(JsonField.of(currentBalance))

        /**
         * The Account's current balance, representing the sum of all posted Transactions on the
         * Account.
         */
        @JsonProperty("current_balance")
        @ExcludeMissing
        fun currentBalance(currentBalance: JsonField<Long>) = apply {
            this.currentBalance = currentBalance
        }

        /**
         * The Account's available balance, representing the current balance less any open Pending
         * Transactions on the Account.
         */
        fun availableBalance(availableBalance: Long) =
            availableBalance(JsonField.of(availableBalance))

        /**
         * The Account's available balance, representing the current balance less any open Pending
         * Transactions on the Account.
         */
        @JsonProperty("available_balance")
        @ExcludeMissing
        fun availableBalance(availableBalance: JsonField<Long>) = apply {
            this.availableBalance = availableBalance
        }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `balance_lookup`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * A constant representing the object's type. For this resource it will always be
         * `balance_lookup`.
         */
        @JsonProperty("type")
        @ExcludeMissing
        fun type(type: JsonField<Type>) = apply { this.type = type }

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

        fun build(): BalanceLookup =
            BalanceLookup(
                accountId,
                currentBalance,
                availableBalance,
                type,
                additionalProperties.toUnmodifiable(),
            )
    }

    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Type && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val BALANCE_LOOKUP = Type(JsonField.of("balance_lookup"))

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            BALANCE_LOOKUP,
        }

        enum class Value {
            BALANCE_LOOKUP,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                BALANCE_LOOKUP -> Value.BALANCE_LOOKUP
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                BALANCE_LOOKUP -> Known.BALANCE_LOOKUP
                else -> throw IncreaseInvalidDataException("Unknown Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
