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
     */
    fun balance(): Long = balance.getRequired("balance")

    /** The identifier for the account for which the balance was queried. */
    fun bookkeepingAccountId(): String = bookkeepingAccountId.getRequired("bookkeeping_account_id")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `bookkeeping_balance_lookup`.
     */
    fun type(): Type = type.getRequired("type")

    /**
     * The Bookkeeping Account's current balance, representing the sum of all Bookkeeping Entries on
     * the Bookkeeping Account.
     */
    @JsonProperty("balance") @ExcludeMissing fun _balance(): JsonField<Long> = balance

    /** The identifier for the account for which the balance was queried. */
    @JsonProperty("bookkeeping_account_id")
    @ExcludeMissing
    fun _bookkeepingAccountId(): JsonField<String> = bookkeepingAccountId

    /**
     * A constant representing the object's type. For this resource it will always be
     * `bookkeeping_balance_lookup`.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): BookkeepingBalanceLookup = apply {
        if (!validated) {
            balance()
            bookkeepingAccountId()
            type()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

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
         * The Bookkeeping Account's current balance, representing the sum of all Bookkeeping
         * Entries on the Bookkeeping Account.
         */
        fun balance(balance: JsonField<Long>) = apply { this.balance = balance }

        /** The identifier for the account for which the balance was queried. */
        fun bookkeepingAccountId(bookkeepingAccountId: String) =
            bookkeepingAccountId(JsonField.of(bookkeepingAccountId))

        /** The identifier for the account for which the balance was queried. */
        fun bookkeepingAccountId(bookkeepingAccountId: JsonField<String>) = apply {
            this.bookkeepingAccountId = bookkeepingAccountId
        }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `bookkeeping_balance_lookup`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * A constant representing the object's type. For this resource it will always be
         * `bookkeeping_balance_lookup`.
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
                checkNotNull(balance) { "`balance` is required but was not set" },
                checkNotNull(bookkeepingAccountId) {
                    "`bookkeepingAccountId` is required but was not set"
                },
                checkNotNull(type) { "`type` is required but was not set" },
                additionalProperties.toImmutable(),
            )
    }

    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val BOOKKEEPING_BALANCE_LOOKUP = of("bookkeeping_balance_lookup")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            BOOKKEEPING_BALANCE_LOOKUP,
        }

        enum class Value {
            BOOKKEEPING_BALANCE_LOOKUP,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                BOOKKEEPING_BALANCE_LOOKUP -> Value.BOOKKEEPING_BALANCE_LOOKUP
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                BOOKKEEPING_BALANCE_LOOKUP -> Known.BOOKKEEPING_BALANCE_LOOKUP
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

        return /* spotless:off */ other is BookkeepingBalanceLookup && balance == other.balance && bookkeepingAccountId == other.bookkeepingAccountId && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(balance, bookkeepingAccountId, type, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BookkeepingBalanceLookup{balance=$balance, bookkeepingAccountId=$bookkeepingAccountId, type=$type, additionalProperties=$additionalProperties}"
}
