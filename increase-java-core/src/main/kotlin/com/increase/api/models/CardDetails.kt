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
import java.util.Objects

/** An object containing the sensitive details (card number, cvc, etc) for a Card. */
@NoAutoDetect
class CardDetails
@JsonCreator
private constructor(
    @JsonProperty("card_id")
    @ExcludeMissing
    private val cardId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("expiration_month")
    @ExcludeMissing
    private val expirationMonth: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("expiration_year")
    @ExcludeMissing
    private val expirationYear: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("primary_account_number")
    @ExcludeMissing
    private val primaryAccountNumber: JsonField<String> = JsonMissing.of(),
    @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
    @JsonProperty("verification_code")
    @ExcludeMissing
    private val verificationCode: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The identifier for the Card for which sensitive details have been returned. */
    fun cardId(): String = cardId.getRequired("card_id")

    /** The month the card expires in M format (e.g., August is 8). */
    fun expirationMonth(): Long = expirationMonth.getRequired("expiration_month")

    /** The year the card expires in YYYY format (e.g., 2025). */
    fun expirationYear(): Long = expirationYear.getRequired("expiration_year")

    /** The card number. */
    fun primaryAccountNumber(): String = primaryAccountNumber.getRequired("primary_account_number")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `card_details`.
     */
    fun type(): Type = type.getRequired("type")

    /**
     * The three-digit verification code for the card. It's also known as the Card Verification Code
     * (CVC), the Card Verification Value (CVV), or the Card Identification (CID).
     */
    fun verificationCode(): String = verificationCode.getRequired("verification_code")

    /** The identifier for the Card for which sensitive details have been returned. */
    @JsonProperty("card_id") @ExcludeMissing fun _cardId(): JsonField<String> = cardId

    /** The month the card expires in M format (e.g., August is 8). */
    @JsonProperty("expiration_month")
    @ExcludeMissing
    fun _expirationMonth(): JsonField<Long> = expirationMonth

    /** The year the card expires in YYYY format (e.g., 2025). */
    @JsonProperty("expiration_year")
    @ExcludeMissing
    fun _expirationYear(): JsonField<Long> = expirationYear

    /** The card number. */
    @JsonProperty("primary_account_number")
    @ExcludeMissing
    fun _primaryAccountNumber(): JsonField<String> = primaryAccountNumber

    /**
     * A constant representing the object's type. For this resource it will always be
     * `card_details`.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    /**
     * The three-digit verification code for the card. It's also known as the Card Verification Code
     * (CVC), the Card Verification Value (CVV), or the Card Identification (CID).
     */
    @JsonProperty("verification_code")
    @ExcludeMissing
    fun _verificationCode(): JsonField<String> = verificationCode

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): CardDetails = apply {
        if (validated) {
            return@apply
        }

        cardId()
        expirationMonth()
        expirationYear()
        primaryAccountNumber()
        type()
        verificationCode()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CardDetails]. */
    class Builder internal constructor() {

        private var cardId: JsonField<String>? = null
        private var expirationMonth: JsonField<Long>? = null
        private var expirationYear: JsonField<Long>? = null
        private var primaryAccountNumber: JsonField<String>? = null
        private var type: JsonField<Type>? = null
        private var verificationCode: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(cardDetails: CardDetails) = apply {
            cardId = cardDetails.cardId
            expirationMonth = cardDetails.expirationMonth
            expirationYear = cardDetails.expirationYear
            primaryAccountNumber = cardDetails.primaryAccountNumber
            type = cardDetails.type
            verificationCode = cardDetails.verificationCode
            additionalProperties = cardDetails.additionalProperties.toMutableMap()
        }

        /** The identifier for the Card for which sensitive details have been returned. */
        fun cardId(cardId: String) = cardId(JsonField.of(cardId))

        /** The identifier for the Card for which sensitive details have been returned. */
        fun cardId(cardId: JsonField<String>) = apply { this.cardId = cardId }

        /** The month the card expires in M format (e.g., August is 8). */
        fun expirationMonth(expirationMonth: Long) = expirationMonth(JsonField.of(expirationMonth))

        /** The month the card expires in M format (e.g., August is 8). */
        fun expirationMonth(expirationMonth: JsonField<Long>) = apply {
            this.expirationMonth = expirationMonth
        }

        /** The year the card expires in YYYY format (e.g., 2025). */
        fun expirationYear(expirationYear: Long) = expirationYear(JsonField.of(expirationYear))

        /** The year the card expires in YYYY format (e.g., 2025). */
        fun expirationYear(expirationYear: JsonField<Long>) = apply {
            this.expirationYear = expirationYear
        }

        /** The card number. */
        fun primaryAccountNumber(primaryAccountNumber: String) =
            primaryAccountNumber(JsonField.of(primaryAccountNumber))

        /** The card number. */
        fun primaryAccountNumber(primaryAccountNumber: JsonField<String>) = apply {
            this.primaryAccountNumber = primaryAccountNumber
        }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `card_details`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * A constant representing the object's type. For this resource it will always be
         * `card_details`.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        /**
         * The three-digit verification code for the card. It's also known as the Card Verification
         * Code (CVC), the Card Verification Value (CVV), or the Card Identification (CID).
         */
        fun verificationCode(verificationCode: String) =
            verificationCode(JsonField.of(verificationCode))

        /**
         * The three-digit verification code for the card. It's also known as the Card Verification
         * Code (CVC), the Card Verification Value (CVV), or the Card Identification (CID).
         */
        fun verificationCode(verificationCode: JsonField<String>) = apply {
            this.verificationCode = verificationCode
        }

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

        fun build(): CardDetails =
            CardDetails(
                checkRequired("cardId", cardId),
                checkRequired("expirationMonth", expirationMonth),
                checkRequired("expirationYear", expirationYear),
                checkRequired("primaryAccountNumber", primaryAccountNumber),
                checkRequired("type", type),
                checkRequired("verificationCode", verificationCode),
                additionalProperties.toImmutable(),
            )
    }

    /**
     * A constant representing the object's type. For this resource it will always be
     * `card_details`.
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

            @JvmField val CARD_DETAILS = of("card_details")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            CARD_DETAILS
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
            CARD_DETAILS,
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
                CARD_DETAILS -> Value.CARD_DETAILS
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
                CARD_DETAILS -> Known.CARD_DETAILS
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

        return /* spotless:off */ other is CardDetails && cardId == other.cardId && expirationMonth == other.expirationMonth && expirationYear == other.expirationYear && primaryAccountNumber == other.primaryAccountNumber && type == other.type && verificationCode == other.verificationCode && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(cardId, expirationMonth, expirationYear, primaryAccountNumber, type, verificationCode, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CardDetails{cardId=$cardId, expirationMonth=$expirationMonth, expirationYear=$expirationYear, primaryAccountNumber=$primaryAccountNumber, type=$type, verificationCode=$verificationCode, additionalProperties=$additionalProperties}"
}
