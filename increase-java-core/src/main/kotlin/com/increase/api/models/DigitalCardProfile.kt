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
import kotlin.jvm.optionals.getOrNull

/**
 * This contains artwork and metadata relating to a Card's appearance in digital wallet apps like
 * Apple Pay and Google Pay. For more information, see our guide on
 * [digital card artwork](https://increase.com/documentation/card-art).
 */
@NoAutoDetect
class DigitalCardProfile
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("app_icon_file_id")
    @ExcludeMissing
    private val appIconFileId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("background_image_file_id")
    @ExcludeMissing
    private val backgroundImageFileId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("card_description")
    @ExcludeMissing
    private val cardDescription: JsonField<String> = JsonMissing.of(),
    @JsonProperty("contact_email")
    @ExcludeMissing
    private val contactEmail: JsonField<String> = JsonMissing.of(),
    @JsonProperty("contact_phone")
    @ExcludeMissing
    private val contactPhone: JsonField<String> = JsonMissing.of(),
    @JsonProperty("contact_website")
    @ExcludeMissing
    private val contactWebsite: JsonField<String> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("description")
    @ExcludeMissing
    private val description: JsonField<String> = JsonMissing.of(),
    @JsonProperty("idempotency_key")
    @ExcludeMissing
    private val idempotencyKey: JsonField<String> = JsonMissing.of(),
    @JsonProperty("issuer_name")
    @ExcludeMissing
    private val issuerName: JsonField<String> = JsonMissing.of(),
    @JsonProperty("status")
    @ExcludeMissing
    private val status: JsonField<Status> = JsonMissing.of(),
    @JsonProperty("text_color")
    @ExcludeMissing
    private val textColor: JsonField<TextColor> = JsonMissing.of(),
    @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The Card Profile identifier. */
    fun id(): String = id.getRequired("id")

    /** The identifier of the File containing the card's icon image. */
    fun appIconFileId(): String = appIconFileId.getRequired("app_icon_file_id")

    /** The identifier of the File containing the card's front image. */
    fun backgroundImageFileId(): String =
        backgroundImageFileId.getRequired("background_image_file_id")

    /** A user-facing description for the card itself. */
    fun cardDescription(): String = cardDescription.getRequired("card_description")

    /** An email address the user can contact to receive support for their card. */
    fun contactEmail(): Optional<String> =
        Optional.ofNullable(contactEmail.getNullable("contact_email"))

    /** A phone number the user can contact to receive support for their card. */
    fun contactPhone(): Optional<String> =
        Optional.ofNullable(contactPhone.getNullable("contact_phone"))

    /** A website the user can visit to view and receive support for their card. */
    fun contactWebsite(): Optional<String> =
        Optional.ofNullable(contactWebsite.getNullable("contact_website"))

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the Card
     * Dispute was created.
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /** A description you can use to identify the Card Profile. */
    fun description(): String = description.getRequired("description")

    /**
     * The idempotency key you chose for this object. This value is unique across Increase and is
     * used to ensure that a request is only processed once. Learn more about
     * [idempotency](https://increase.com/documentation/idempotency-keys).
     */
    fun idempotencyKey(): Optional<String> =
        Optional.ofNullable(idempotencyKey.getNullable("idempotency_key"))

    /** A user-facing description for whoever is issuing the card. */
    fun issuerName(): String = issuerName.getRequired("issuer_name")

    /** The status of the Card Profile. */
    fun status(): Status = status.getRequired("status")

    /** The Card's text color, specified as an RGB triple. */
    fun textColor(): TextColor = textColor.getRequired("text_color")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `digital_card_profile`.
     */
    fun type(): Type = type.getRequired("type")

    /** The Card Profile identifier. */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /** The identifier of the File containing the card's icon image. */
    @JsonProperty("app_icon_file_id")
    @ExcludeMissing
    fun _appIconFileId(): JsonField<String> = appIconFileId

    /** The identifier of the File containing the card's front image. */
    @JsonProperty("background_image_file_id")
    @ExcludeMissing
    fun _backgroundImageFileId(): JsonField<String> = backgroundImageFileId

    /** A user-facing description for the card itself. */
    @JsonProperty("card_description")
    @ExcludeMissing
    fun _cardDescription(): JsonField<String> = cardDescription

    /** An email address the user can contact to receive support for their card. */
    @JsonProperty("contact_email")
    @ExcludeMissing
    fun _contactEmail(): JsonField<String> = contactEmail

    /** A phone number the user can contact to receive support for their card. */
    @JsonProperty("contact_phone")
    @ExcludeMissing
    fun _contactPhone(): JsonField<String> = contactPhone

    /** A website the user can visit to view and receive support for their card. */
    @JsonProperty("contact_website")
    @ExcludeMissing
    fun _contactWebsite(): JsonField<String> = contactWebsite

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the Card
     * Dispute was created.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /** A description you can use to identify the Card Profile. */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * The idempotency key you chose for this object. This value is unique across Increase and is
     * used to ensure that a request is only processed once. Learn more about
     * [idempotency](https://increase.com/documentation/idempotency-keys).
     */
    @JsonProperty("idempotency_key")
    @ExcludeMissing
    fun _idempotencyKey(): JsonField<String> = idempotencyKey

    /** A user-facing description for whoever is issuing the card. */
    @JsonProperty("issuer_name") @ExcludeMissing fun _issuerName(): JsonField<String> = issuerName

    /** The status of the Card Profile. */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /** The Card's text color, specified as an RGB triple. */
    @JsonProperty("text_color") @ExcludeMissing fun _textColor(): JsonField<TextColor> = textColor

    /**
     * A constant representing the object's type. For this resource it will always be
     * `digital_card_profile`.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): DigitalCardProfile = apply {
        if (validated) {
            return@apply
        }

        id()
        appIconFileId()
        backgroundImageFileId()
        cardDescription()
        contactEmail()
        contactPhone()
        contactWebsite()
        createdAt()
        description()
        idempotencyKey()
        issuerName()
        status()
        textColor().validate()
        type()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DigitalCardProfile]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var appIconFileId: JsonField<String>? = null
        private var backgroundImageFileId: JsonField<String>? = null
        private var cardDescription: JsonField<String>? = null
        private var contactEmail: JsonField<String>? = null
        private var contactPhone: JsonField<String>? = null
        private var contactWebsite: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var description: JsonField<String>? = null
        private var idempotencyKey: JsonField<String>? = null
        private var issuerName: JsonField<String>? = null
        private var status: JsonField<Status>? = null
        private var textColor: JsonField<TextColor>? = null
        private var type: JsonField<Type>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(digitalCardProfile: DigitalCardProfile) = apply {
            id = digitalCardProfile.id
            appIconFileId = digitalCardProfile.appIconFileId
            backgroundImageFileId = digitalCardProfile.backgroundImageFileId
            cardDescription = digitalCardProfile.cardDescription
            contactEmail = digitalCardProfile.contactEmail
            contactPhone = digitalCardProfile.contactPhone
            contactWebsite = digitalCardProfile.contactWebsite
            createdAt = digitalCardProfile.createdAt
            description = digitalCardProfile.description
            idempotencyKey = digitalCardProfile.idempotencyKey
            issuerName = digitalCardProfile.issuerName
            status = digitalCardProfile.status
            textColor = digitalCardProfile.textColor
            type = digitalCardProfile.type
            additionalProperties = digitalCardProfile.additionalProperties.toMutableMap()
        }

        /** The Card Profile identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The Card Profile identifier. */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The identifier of the File containing the card's icon image. */
        fun appIconFileId(appIconFileId: String) = appIconFileId(JsonField.of(appIconFileId))

        /** The identifier of the File containing the card's icon image. */
        fun appIconFileId(appIconFileId: JsonField<String>) = apply {
            this.appIconFileId = appIconFileId
        }

        /** The identifier of the File containing the card's front image. */
        fun backgroundImageFileId(backgroundImageFileId: String) =
            backgroundImageFileId(JsonField.of(backgroundImageFileId))

        /** The identifier of the File containing the card's front image. */
        fun backgroundImageFileId(backgroundImageFileId: JsonField<String>) = apply {
            this.backgroundImageFileId = backgroundImageFileId
        }

        /** A user-facing description for the card itself. */
        fun cardDescription(cardDescription: String) =
            cardDescription(JsonField.of(cardDescription))

        /** A user-facing description for the card itself. */
        fun cardDescription(cardDescription: JsonField<String>) = apply {
            this.cardDescription = cardDescription
        }

        /** An email address the user can contact to receive support for their card. */
        fun contactEmail(contactEmail: String?) = contactEmail(JsonField.ofNullable(contactEmail))

        /** An email address the user can contact to receive support for their card. */
        fun contactEmail(contactEmail: Optional<String>) = contactEmail(contactEmail.getOrNull())

        /** An email address the user can contact to receive support for their card. */
        fun contactEmail(contactEmail: JsonField<String>) = apply {
            this.contactEmail = contactEmail
        }

        /** A phone number the user can contact to receive support for their card. */
        fun contactPhone(contactPhone: String?) = contactPhone(JsonField.ofNullable(contactPhone))

        /** A phone number the user can contact to receive support for their card. */
        fun contactPhone(contactPhone: Optional<String>) = contactPhone(contactPhone.getOrNull())

        /** A phone number the user can contact to receive support for their card. */
        fun contactPhone(contactPhone: JsonField<String>) = apply {
            this.contactPhone = contactPhone
        }

        /** A website the user can visit to view and receive support for their card. */
        fun contactWebsite(contactWebsite: String?) =
            contactWebsite(JsonField.ofNullable(contactWebsite))

        /** A website the user can visit to view and receive support for their card. */
        fun contactWebsite(contactWebsite: Optional<String>) =
            contactWebsite(contactWebsite.getOrNull())

        /** A website the user can visit to view and receive support for their card. */
        fun contactWebsite(contactWebsite: JsonField<String>) = apply {
            this.contactWebsite = contactWebsite
        }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the Card
         * Dispute was created.
         */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the Card
         * Dispute was created.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** A description you can use to identify the Card Profile. */
        fun description(description: String) = description(JsonField.of(description))

        /** A description you can use to identify the Card Profile. */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /**
         * The idempotency key you chose for this object. This value is unique across Increase and
         * is used to ensure that a request is only processed once. Learn more about
         * [idempotency](https://increase.com/documentation/idempotency-keys).
         */
        fun idempotencyKey(idempotencyKey: String?) =
            idempotencyKey(JsonField.ofNullable(idempotencyKey))

        /**
         * The idempotency key you chose for this object. This value is unique across Increase and
         * is used to ensure that a request is only processed once. Learn more about
         * [idempotency](https://increase.com/documentation/idempotency-keys).
         */
        fun idempotencyKey(idempotencyKey: Optional<String>) =
            idempotencyKey(idempotencyKey.getOrNull())

        /**
         * The idempotency key you chose for this object. This value is unique across Increase and
         * is used to ensure that a request is only processed once. Learn more about
         * [idempotency](https://increase.com/documentation/idempotency-keys).
         */
        fun idempotencyKey(idempotencyKey: JsonField<String>) = apply {
            this.idempotencyKey = idempotencyKey
        }

        /** A user-facing description for whoever is issuing the card. */
        fun issuerName(issuerName: String) = issuerName(JsonField.of(issuerName))

        /** A user-facing description for whoever is issuing the card. */
        fun issuerName(issuerName: JsonField<String>) = apply { this.issuerName = issuerName }

        /** The status of the Card Profile. */
        fun status(status: Status) = status(JsonField.of(status))

        /** The status of the Card Profile. */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** The Card's text color, specified as an RGB triple. */
        fun textColor(textColor: TextColor) = textColor(JsonField.of(textColor))

        /** The Card's text color, specified as an RGB triple. */
        fun textColor(textColor: JsonField<TextColor>) = apply { this.textColor = textColor }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `digital_card_profile`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * A constant representing the object's type. For this resource it will always be
         * `digital_card_profile`.
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

        fun build(): DigitalCardProfile =
            DigitalCardProfile(
                checkRequired("id", id),
                checkRequired("appIconFileId", appIconFileId),
                checkRequired("backgroundImageFileId", backgroundImageFileId),
                checkRequired("cardDescription", cardDescription),
                checkRequired("contactEmail", contactEmail),
                checkRequired("contactPhone", contactPhone),
                checkRequired("contactWebsite", contactWebsite),
                checkRequired("createdAt", createdAt),
                checkRequired("description", description),
                checkRequired("idempotencyKey", idempotencyKey),
                checkRequired("issuerName", issuerName),
                checkRequired("status", status),
                checkRequired("textColor", textColor),
                checkRequired("type", type),
                additionalProperties.toImmutable(),
            )
    }

    /** The status of the Card Profile. */
    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            /**
             * The Card Profile is awaiting review from Increase and/or processing by card networks.
             */
            @JvmField val PENDING = of("pending")

            /** There is an issue with the Card Profile preventing it from use. */
            @JvmField val REJECTED = of("rejected")

            /** The Card Profile can be assigned to Cards. */
            @JvmField val ACTIVE = of("active")

            /** The Card Profile is no longer in use. */
            @JvmField val ARCHIVED = of("archived")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            /**
             * The Card Profile is awaiting review from Increase and/or processing by card networks.
             */
            PENDING,
            /** There is an issue with the Card Profile preventing it from use. */
            REJECTED,
            /** The Card Profile can be assigned to Cards. */
            ACTIVE,
            /** The Card Profile is no longer in use. */
            ARCHIVED,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            /**
             * The Card Profile is awaiting review from Increase and/or processing by card networks.
             */
            PENDING,
            /** There is an issue with the Card Profile preventing it from use. */
            REJECTED,
            /** The Card Profile can be assigned to Cards. */
            ACTIVE,
            /** The Card Profile is no longer in use. */
            ARCHIVED,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
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
                PENDING -> Value.PENDING
                REJECTED -> Value.REJECTED
                ACTIVE -> Value.ACTIVE
                ARCHIVED -> Value.ARCHIVED
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
                PENDING -> Known.PENDING
                REJECTED -> Known.REJECTED
                ACTIVE -> Known.ACTIVE
                ARCHIVED -> Known.ARCHIVED
                else -> throw IncreaseInvalidDataException("Unknown Status: $value")
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

            return /* spotless:off */ other is Status && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The Card's text color, specified as an RGB triple. */
    @NoAutoDetect
    class TextColor
    @JsonCreator
    private constructor(
        @JsonProperty("blue") @ExcludeMissing private val blue: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("green")
        @ExcludeMissing
        private val green: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("red") @ExcludeMissing private val red: JsonField<Long> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The value of the blue channel in the RGB color. */
        fun blue(): Long = blue.getRequired("blue")

        /** The value of the green channel in the RGB color. */
        fun green(): Long = green.getRequired("green")

        /** The value of the red channel in the RGB color. */
        fun red(): Long = red.getRequired("red")

        /** The value of the blue channel in the RGB color. */
        @JsonProperty("blue") @ExcludeMissing fun _blue(): JsonField<Long> = blue

        /** The value of the green channel in the RGB color. */
        @JsonProperty("green") @ExcludeMissing fun _green(): JsonField<Long> = green

        /** The value of the red channel in the RGB color. */
        @JsonProperty("red") @ExcludeMissing fun _red(): JsonField<Long> = red

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): TextColor = apply {
            if (validated) {
                return@apply
            }

            blue()
            green()
            red()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [TextColor]. */
        class Builder internal constructor() {

            private var blue: JsonField<Long>? = null
            private var green: JsonField<Long>? = null
            private var red: JsonField<Long>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(textColor: TextColor) = apply {
                blue = textColor.blue
                green = textColor.green
                red = textColor.red
                additionalProperties = textColor.additionalProperties.toMutableMap()
            }

            /** The value of the blue channel in the RGB color. */
            fun blue(blue: Long) = blue(JsonField.of(blue))

            /** The value of the blue channel in the RGB color. */
            fun blue(blue: JsonField<Long>) = apply { this.blue = blue }

            /** The value of the green channel in the RGB color. */
            fun green(green: Long) = green(JsonField.of(green))

            /** The value of the green channel in the RGB color. */
            fun green(green: JsonField<Long>) = apply { this.green = green }

            /** The value of the red channel in the RGB color. */
            fun red(red: Long) = red(JsonField.of(red))

            /** The value of the red channel in the RGB color. */
            fun red(red: JsonField<Long>) = apply { this.red = red }

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

            fun build(): TextColor =
                TextColor(
                    checkRequired("blue", blue),
                    checkRequired("green", green),
                    checkRequired("red", red),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is TextColor && blue == other.blue && green == other.green && red == other.red && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(blue, green, red, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "TextColor{blue=$blue, green=$green, red=$red, additionalProperties=$additionalProperties}"
    }

    /**
     * A constant representing the object's type. For this resource it will always be
     * `digital_card_profile`.
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

            @JvmField val DIGITAL_CARD_PROFILE = of("digital_card_profile")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            DIGITAL_CARD_PROFILE
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
            DIGITAL_CARD_PROFILE,
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
                DIGITAL_CARD_PROFILE -> Value.DIGITAL_CARD_PROFILE
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
                DIGITAL_CARD_PROFILE -> Known.DIGITAL_CARD_PROFILE
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

        return /* spotless:off */ other is DigitalCardProfile && id == other.id && appIconFileId == other.appIconFileId && backgroundImageFileId == other.backgroundImageFileId && cardDescription == other.cardDescription && contactEmail == other.contactEmail && contactPhone == other.contactPhone && contactWebsite == other.contactWebsite && createdAt == other.createdAt && description == other.description && idempotencyKey == other.idempotencyKey && issuerName == other.issuerName && status == other.status && textColor == other.textColor && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, appIconFileId, backgroundImageFileId, cardDescription, contactEmail, contactPhone, contactWebsite, createdAt, description, idempotencyKey, issuerName, status, textColor, type, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DigitalCardProfile{id=$id, appIconFileId=$appIconFileId, backgroundImageFileId=$backgroundImageFileId, cardDescription=$cardDescription, contactEmail=$contactEmail, contactPhone=$contactPhone, contactWebsite=$contactWebsite, createdAt=$createdAt, description=$description, idempotencyKey=$idempotencyKey, issuerName=$issuerName, status=$status, textColor=$textColor, type=$type, additionalProperties=$additionalProperties}"
}
