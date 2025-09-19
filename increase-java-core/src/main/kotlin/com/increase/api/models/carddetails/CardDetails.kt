// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.carddetails

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
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

/**
 * An object containing the sensitive details (card number, CVC, PIN, etc) for a Card. These details
 * are not included in the Card object. If you'd prefer to never access these details directly, you
 * can use the [embedded iframe](/documentation/embedded-card-component) to display the information
 * to your users.
 */
class CardDetails
private constructor(
    private val cardId: JsonField<String>,
    private val expirationMonth: JsonField<Long>,
    private val expirationYear: JsonField<Long>,
    private val pin: JsonField<String>,
    private val primaryAccountNumber: JsonField<String>,
    private val type: JsonField<Type>,
    private val verificationCode: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("card_id") @ExcludeMissing cardId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("expiration_month")
        @ExcludeMissing
        expirationMonth: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("expiration_year")
        @ExcludeMissing
        expirationYear: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("pin") @ExcludeMissing pin: JsonField<String> = JsonMissing.of(),
        @JsonProperty("primary_account_number")
        @ExcludeMissing
        primaryAccountNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("verification_code")
        @ExcludeMissing
        verificationCode: JsonField<String> = JsonMissing.of(),
    ) : this(
        cardId,
        expirationMonth,
        expirationYear,
        pin,
        primaryAccountNumber,
        type,
        verificationCode,
        mutableMapOf(),
    )

    /**
     * The identifier for the Card for which sensitive details have been returned.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun cardId(): String = cardId.getRequired("card_id")

    /**
     * The month the card expires in M format (e.g., August is 8).
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun expirationMonth(): Long = expirationMonth.getRequired("expiration_month")

    /**
     * The year the card expires in YYYY format (e.g., 2025).
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun expirationYear(): Long = expirationYear.getRequired("expiration_year")

    /**
     * The 4-digit PIN for the card, for use with ATMs.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun pin(): String = pin.getRequired("pin")

    /**
     * The card number.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun primaryAccountNumber(): String = primaryAccountNumber.getRequired("primary_account_number")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `card_details`.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * The three-digit verification code for the card. It's also known as the Card Verification Code
     * (CVC), the Card Verification Value (CVV), or the Card Identification (CID).
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun verificationCode(): String = verificationCode.getRequired("verification_code")

    /**
     * Returns the raw JSON value of [cardId].
     *
     * Unlike [cardId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("card_id") @ExcludeMissing fun _cardId(): JsonField<String> = cardId

    /**
     * Returns the raw JSON value of [expirationMonth].
     *
     * Unlike [expirationMonth], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("expiration_month")
    @ExcludeMissing
    fun _expirationMonth(): JsonField<Long> = expirationMonth

    /**
     * Returns the raw JSON value of [expirationYear].
     *
     * Unlike [expirationYear], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("expiration_year")
    @ExcludeMissing
    fun _expirationYear(): JsonField<Long> = expirationYear

    /**
     * Returns the raw JSON value of [pin].
     *
     * Unlike [pin], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pin") @ExcludeMissing fun _pin(): JsonField<String> = pin

    /**
     * Returns the raw JSON value of [primaryAccountNumber].
     *
     * Unlike [primaryAccountNumber], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("primary_account_number")
    @ExcludeMissing
    fun _primaryAccountNumber(): JsonField<String> = primaryAccountNumber

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    /**
     * Returns the raw JSON value of [verificationCode].
     *
     * Unlike [verificationCode], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("verification_code")
    @ExcludeMissing
    fun _verificationCode(): JsonField<String> = verificationCode

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
         * Returns a mutable builder for constructing an instance of [CardDetails].
         *
         * The following fields are required:
         * ```java
         * .cardId()
         * .expirationMonth()
         * .expirationYear()
         * .pin()
         * .primaryAccountNumber()
         * .type()
         * .verificationCode()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CardDetails]. */
    class Builder internal constructor() {

        private var cardId: JsonField<String>? = null
        private var expirationMonth: JsonField<Long>? = null
        private var expirationYear: JsonField<Long>? = null
        private var pin: JsonField<String>? = null
        private var primaryAccountNumber: JsonField<String>? = null
        private var type: JsonField<Type>? = null
        private var verificationCode: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(cardDetails: CardDetails) = apply {
            cardId = cardDetails.cardId
            expirationMonth = cardDetails.expirationMonth
            expirationYear = cardDetails.expirationYear
            pin = cardDetails.pin
            primaryAccountNumber = cardDetails.primaryAccountNumber
            type = cardDetails.type
            verificationCode = cardDetails.verificationCode
            additionalProperties = cardDetails.additionalProperties.toMutableMap()
        }

        /** The identifier for the Card for which sensitive details have been returned. */
        fun cardId(cardId: String) = cardId(JsonField.of(cardId))

        /**
         * Sets [Builder.cardId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cardId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun cardId(cardId: JsonField<String>) = apply { this.cardId = cardId }

        /** The month the card expires in M format (e.g., August is 8). */
        fun expirationMonth(expirationMonth: Long) = expirationMonth(JsonField.of(expirationMonth))

        /**
         * Sets [Builder.expirationMonth] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expirationMonth] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun expirationMonth(expirationMonth: JsonField<Long>) = apply {
            this.expirationMonth = expirationMonth
        }

        /** The year the card expires in YYYY format (e.g., 2025). */
        fun expirationYear(expirationYear: Long) = expirationYear(JsonField.of(expirationYear))

        /**
         * Sets [Builder.expirationYear] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expirationYear] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun expirationYear(expirationYear: JsonField<Long>) = apply {
            this.expirationYear = expirationYear
        }

        /** The 4-digit PIN for the card, for use with ATMs. */
        fun pin(pin: String) = pin(JsonField.of(pin))

        /**
         * Sets [Builder.pin] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pin] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun pin(pin: JsonField<String>) = apply { this.pin = pin }

        /** The card number. */
        fun primaryAccountNumber(primaryAccountNumber: String) =
            primaryAccountNumber(JsonField.of(primaryAccountNumber))

        /**
         * Sets [Builder.primaryAccountNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.primaryAccountNumber] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun primaryAccountNumber(primaryAccountNumber: JsonField<String>) = apply {
            this.primaryAccountNumber = primaryAccountNumber
        }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `card_details`.
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
         * The three-digit verification code for the card. It's also known as the Card Verification
         * Code (CVC), the Card Verification Value (CVV), or the Card Identification (CID).
         */
        fun verificationCode(verificationCode: String) =
            verificationCode(JsonField.of(verificationCode))

        /**
         * Sets [Builder.verificationCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.verificationCode] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
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

        /**
         * Returns an immutable instance of [CardDetails].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .cardId()
         * .expirationMonth()
         * .expirationYear()
         * .pin()
         * .primaryAccountNumber()
         * .type()
         * .verificationCode()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CardDetails =
            CardDetails(
                checkRequired("cardId", cardId),
                checkRequired("expirationMonth", expirationMonth),
                checkRequired("expirationYear", expirationYear),
                checkRequired("pin", pin),
                checkRequired("primaryAccountNumber", primaryAccountNumber),
                checkRequired("type", type),
                checkRequired("verificationCode", verificationCode),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CardDetails = apply {
        if (validated) {
            return@apply
        }

        cardId()
        expirationMonth()
        expirationYear()
        pin()
        primaryAccountNumber()
        type().validate()
        verificationCode()
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
        (if (cardId.asKnown().isPresent) 1 else 0) +
            (if (expirationMonth.asKnown().isPresent) 1 else 0) +
            (if (expirationYear.asKnown().isPresent) 1 else 0) +
            (if (pin.asKnown().isPresent) 1 else 0) +
            (if (primaryAccountNumber.asKnown().isPresent) 1 else 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0) +
            (if (verificationCode.asKnown().isPresent) 1 else 0)

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

            return other is Type && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CardDetails &&
            cardId == other.cardId &&
            expirationMonth == other.expirationMonth &&
            expirationYear == other.expirationYear &&
            pin == other.pin &&
            primaryAccountNumber == other.primaryAccountNumber &&
            type == other.type &&
            verificationCode == other.verificationCode &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            cardId,
            expirationMonth,
            expirationYear,
            pin,
            primaryAccountNumber,
            type,
            verificationCode,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CardDetails{cardId=$cardId, expirationMonth=$expirationMonth, expirationYear=$expirationYear, pin=$pin, primaryAccountNumber=$primaryAccountNumber, type=$type, verificationCode=$verificationCode, additionalProperties=$additionalProperties}"
}
