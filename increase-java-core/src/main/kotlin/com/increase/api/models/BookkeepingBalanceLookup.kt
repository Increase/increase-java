// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.increase.api.core.Enum
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.toUnmodifiable
import com.increase.api.errors.IncreaseInvalidDataException
import java.util.Objects

/**
 * Represents a request to lookup the balance of an Bookkeeping Account at a given point in time.
 */
@JsonDeserialize(builder = BookkeepingBalanceLookup.Builder::class)
@NoAutoDetect
class BookkeepingBalanceLookup
private constructor(
    private val balance: JsonField<Long>,
    private val bookkeepingAccountId: JsonField<String>,
    private val type: JsonField<Type>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

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
    @JsonProperty("balance") @ExcludeMissing fun _balance() = balance

    /** The identifier for the account for which the balance was queried. */
    @JsonProperty("bookkeeping_account_id")
    @ExcludeMissing
    fun _bookkeepingAccountId() = bookkeepingAccountId

    /**
     * A constant representing the object's type. For this resource it will always be
     * `bookkeeping_balance_lookup`.
     */
    @JsonProperty("type") @ExcludeMissing fun _type() = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

        private var balance: JsonField<Long> = JsonMissing.of()
        private var bookkeepingAccountId: JsonField<String> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(bookkeepingBalanceLookup: BookkeepingBalanceLookup) = apply {
            this.balance = bookkeepingBalanceLookup.balance
            this.bookkeepingAccountId = bookkeepingBalanceLookup.bookkeepingAccountId
            this.type = bookkeepingBalanceLookup.type
            additionalProperties(bookkeepingBalanceLookup.additionalProperties)
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
        @JsonProperty("balance")
        @ExcludeMissing
        fun balance(balance: JsonField<Long>) = apply { this.balance = balance }

        /** The identifier for the account for which the balance was queried. */
        fun bookkeepingAccountId(bookkeepingAccountId: String) =
            bookkeepingAccountId(JsonField.of(bookkeepingAccountId))

        /** The identifier for the account for which the balance was queried. */
        @JsonProperty("bookkeeping_account_id")
        @ExcludeMissing
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

        fun build(): BookkeepingBalanceLookup =
            BookkeepingBalanceLookup(
                balance,
                bookkeepingAccountId,
                type,
                additionalProperties.toUnmodifiable(),
            )
    }

    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

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

            @JvmField
            val BOOKKEEPING_BALANCE_LOOKUP = Type(JsonField.of("bookkeeping_balance_lookup"))

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
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BookkeepingBalanceLookup &&
            this.balance == other.balance &&
            this.bookkeepingAccountId == other.bookkeepingAccountId &&
            this.type == other.type &&
            this.additionalProperties == other.additionalProperties
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    balance,
                    bookkeepingAccountId,
                    type,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "BookkeepingBalanceLookup{balance=$balance, bookkeepingAccountId=$bookkeepingAccountId, type=$type, additionalProperties=$additionalProperties}"
}
