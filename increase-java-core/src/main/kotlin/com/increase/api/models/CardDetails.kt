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

/** An object containing the sensitive details (card number, cvc, etc) for a Card. */
@JsonDeserialize(builder = CardDetails.Builder::class)
@NoAutoDetect
class CardDetails
private constructor(
    private val cardId: JsonField<String>,
    private val expirationMonth: JsonField<Long>,
    private val expirationYear: JsonField<Long>,
    private val primaryAccountNumber: JsonField<String>,
    private val type: JsonField<Type>,
    private val verificationCode: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

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
    @JsonProperty("card_id") @ExcludeMissing fun _cardId() = cardId

    /** The month the card expires in M format (e.g., August is 8). */
    @JsonProperty("expiration_month") @ExcludeMissing fun _expirationMonth() = expirationMonth

    /** The year the card expires in YYYY format (e.g., 2025). */
    @JsonProperty("expiration_year") @ExcludeMissing fun _expirationYear() = expirationYear

    /** The card number. */
    @JsonProperty("primary_account_number")
    @ExcludeMissing
    fun _primaryAccountNumber() = primaryAccountNumber

    /**
     * A constant representing the object's type. For this resource it will always be
     * `card_details`.
     */
    @JsonProperty("type") @ExcludeMissing fun _type() = type

    /**
     * The three-digit verification code for the card. It's also known as the Card Verification Code
     * (CVC), the Card Verification Value (CVV), or the Card Identification (CID).
     */
    @JsonProperty("verification_code") @ExcludeMissing fun _verificationCode() = verificationCode

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): CardDetails = apply {
        if (!validated) {
            cardId()
            expirationMonth()
            expirationYear()
            primaryAccountNumber()
            type()
            verificationCode()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var cardId: JsonField<String> = JsonMissing.of()
        private var expirationMonth: JsonField<Long> = JsonMissing.of()
        private var expirationYear: JsonField<Long> = JsonMissing.of()
        private var primaryAccountNumber: JsonField<String> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var verificationCode: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(cardDetails: CardDetails) = apply {
            this.cardId = cardDetails.cardId
            this.expirationMonth = cardDetails.expirationMonth
            this.expirationYear = cardDetails.expirationYear
            this.primaryAccountNumber = cardDetails.primaryAccountNumber
            this.type = cardDetails.type
            this.verificationCode = cardDetails.verificationCode
            additionalProperties(cardDetails.additionalProperties)
        }

        /** The identifier for the Card for which sensitive details have been returned. */
        fun cardId(cardId: String) = cardId(JsonField.of(cardId))

        /** The identifier for the Card for which sensitive details have been returned. */
        @JsonProperty("card_id")
        @ExcludeMissing
        fun cardId(cardId: JsonField<String>) = apply { this.cardId = cardId }

        /** The month the card expires in M format (e.g., August is 8). */
        fun expirationMonth(expirationMonth: Long) = expirationMonth(JsonField.of(expirationMonth))

        /** The month the card expires in M format (e.g., August is 8). */
        @JsonProperty("expiration_month")
        @ExcludeMissing
        fun expirationMonth(expirationMonth: JsonField<Long>) = apply {
            this.expirationMonth = expirationMonth
        }

        /** The year the card expires in YYYY format (e.g., 2025). */
        fun expirationYear(expirationYear: Long) = expirationYear(JsonField.of(expirationYear))

        /** The year the card expires in YYYY format (e.g., 2025). */
        @JsonProperty("expiration_year")
        @ExcludeMissing
        fun expirationYear(expirationYear: JsonField<Long>) = apply {
            this.expirationYear = expirationYear
        }

        /** The card number. */
        fun primaryAccountNumber(primaryAccountNumber: String) =
            primaryAccountNumber(JsonField.of(primaryAccountNumber))

        /** The card number. */
        @JsonProperty("primary_account_number")
        @ExcludeMissing
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
        @JsonProperty("type")
        @ExcludeMissing
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
        @JsonProperty("verification_code")
        @ExcludeMissing
        fun verificationCode(verificationCode: JsonField<String>) = apply {
            this.verificationCode = verificationCode
        }

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

        fun build(): CardDetails =
            CardDetails(
                cardId,
                expirationMonth,
                expirationYear,
                primaryAccountNumber,
                type,
                verificationCode,
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

            @JvmField val CARD_DETAILS = Type(JsonField.of("card_details"))

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            CARD_DETAILS,
        }

        enum class Value {
            CARD_DETAILS,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                CARD_DETAILS -> Value.CARD_DETAILS
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                CARD_DETAILS -> Known.CARD_DETAILS
                else -> throw IncreaseInvalidDataException("Unknown Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CardDetails &&
            this.cardId == other.cardId &&
            this.expirationMonth == other.expirationMonth &&
            this.expirationYear == other.expirationYear &&
            this.primaryAccountNumber == other.primaryAccountNumber &&
            this.type == other.type &&
            this.verificationCode == other.verificationCode &&
            this.additionalProperties == other.additionalProperties
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    cardId,
                    expirationMonth,
                    expirationYear,
                    primaryAccountNumber,
                    type,
                    verificationCode,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "CardDetails{cardId=$cardId, expirationMonth=$expirationMonth, expirationYear=$expirationYear, primaryAccountNumber=$primaryAccountNumber, type=$type, verificationCode=$verificationCode, additionalProperties=$additionalProperties}"
}
