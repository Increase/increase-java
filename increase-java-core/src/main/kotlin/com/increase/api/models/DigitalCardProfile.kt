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
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

/**
 * This contains artwork and metadata relating to a Card's appearance in digital wallet apps like
 * Apple Pay and Google Pay. For more information, see our guide on
 * [digital card artwork](https://increase.com/documentation/card-art).
 */
@JsonDeserialize(builder = DigitalCardProfile.Builder::class)
@NoAutoDetect
class DigitalCardProfile
private constructor(
    private val appIconFileId: JsonField<String>,
    private val backgroundImageFileId: JsonField<String>,
    private val cardDescription: JsonField<String>,
    private val contactEmail: JsonField<String>,
    private val contactPhone: JsonField<String>,
    private val contactWebsite: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val description: JsonField<String>,
    private val id: JsonField<String>,
    private val idempotencyKey: JsonField<String>,
    private val issuerName: JsonField<String>,
    private val status: JsonField<Status>,
    private val textColor: JsonField<TextColor>,
    private val type: JsonField<Type>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

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

    /** The Card Profile identifier. */
    fun id(): String = id.getRequired("id")

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

    /** The identifier of the File containing the card's icon image. */
    @JsonProperty("app_icon_file_id") @ExcludeMissing fun _appIconFileId() = appIconFileId

    /** The identifier of the File containing the card's front image. */
    @JsonProperty("background_image_file_id")
    @ExcludeMissing
    fun _backgroundImageFileId() = backgroundImageFileId

    /** A user-facing description for the card itself. */
    @JsonProperty("card_description") @ExcludeMissing fun _cardDescription() = cardDescription

    /** An email address the user can contact to receive support for their card. */
    @JsonProperty("contact_email") @ExcludeMissing fun _contactEmail() = contactEmail

    /** A phone number the user can contact to receive support for their card. */
    @JsonProperty("contact_phone") @ExcludeMissing fun _contactPhone() = contactPhone

    /** A website the user can visit to view and receive support for their card. */
    @JsonProperty("contact_website") @ExcludeMissing fun _contactWebsite() = contactWebsite

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the Card
     * Dispute was created.
     */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    /** A description you can use to identify the Card Profile. */
    @JsonProperty("description") @ExcludeMissing fun _description() = description

    /** The Card Profile identifier. */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /**
     * The idempotency key you chose for this object. This value is unique across Increase and is
     * used to ensure that a request is only processed once. Learn more about
     * [idempotency](https://increase.com/documentation/idempotency-keys).
     */
    @JsonProperty("idempotency_key") @ExcludeMissing fun _idempotencyKey() = idempotencyKey

    /** A user-facing description for whoever is issuing the card. */
    @JsonProperty("issuer_name") @ExcludeMissing fun _issuerName() = issuerName

    /** The status of the Card Profile. */
    @JsonProperty("status") @ExcludeMissing fun _status() = status

    /** The Card's text color, specified as an RGB triple. */
    @JsonProperty("text_color") @ExcludeMissing fun _textColor() = textColor

    /**
     * A constant representing the object's type. For this resource it will always be
     * `digital_card_profile`.
     */
    @JsonProperty("type") @ExcludeMissing fun _type() = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): DigitalCardProfile = apply {
        if (!validated) {
            appIconFileId()
            backgroundImageFileId()
            cardDescription()
            contactEmail()
            contactPhone()
            contactWebsite()
            createdAt()
            description()
            id()
            idempotencyKey()
            issuerName()
            status()
            textColor().validate()
            type()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var appIconFileId: JsonField<String> = JsonMissing.of()
        private var backgroundImageFileId: JsonField<String> = JsonMissing.of()
        private var cardDescription: JsonField<String> = JsonMissing.of()
        private var contactEmail: JsonField<String> = JsonMissing.of()
        private var contactPhone: JsonField<String> = JsonMissing.of()
        private var contactWebsite: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var id: JsonField<String> = JsonMissing.of()
        private var idempotencyKey: JsonField<String> = JsonMissing.of()
        private var issuerName: JsonField<String> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var textColor: JsonField<TextColor> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(digitalCardProfile: DigitalCardProfile) = apply {
            this.appIconFileId = digitalCardProfile.appIconFileId
            this.backgroundImageFileId = digitalCardProfile.backgroundImageFileId
            this.cardDescription = digitalCardProfile.cardDescription
            this.contactEmail = digitalCardProfile.contactEmail
            this.contactPhone = digitalCardProfile.contactPhone
            this.contactWebsite = digitalCardProfile.contactWebsite
            this.createdAt = digitalCardProfile.createdAt
            this.description = digitalCardProfile.description
            this.id = digitalCardProfile.id
            this.idempotencyKey = digitalCardProfile.idempotencyKey
            this.issuerName = digitalCardProfile.issuerName
            this.status = digitalCardProfile.status
            this.textColor = digitalCardProfile.textColor
            this.type = digitalCardProfile.type
            additionalProperties(digitalCardProfile.additionalProperties)
        }

        /** The identifier of the File containing the card's icon image. */
        fun appIconFileId(appIconFileId: String) = appIconFileId(JsonField.of(appIconFileId))

        /** The identifier of the File containing the card's icon image. */
        @JsonProperty("app_icon_file_id")
        @ExcludeMissing
        fun appIconFileId(appIconFileId: JsonField<String>) = apply {
            this.appIconFileId = appIconFileId
        }

        /** The identifier of the File containing the card's front image. */
        fun backgroundImageFileId(backgroundImageFileId: String) =
            backgroundImageFileId(JsonField.of(backgroundImageFileId))

        /** The identifier of the File containing the card's front image. */
        @JsonProperty("background_image_file_id")
        @ExcludeMissing
        fun backgroundImageFileId(backgroundImageFileId: JsonField<String>) = apply {
            this.backgroundImageFileId = backgroundImageFileId
        }

        /** A user-facing description for the card itself. */
        fun cardDescription(cardDescription: String) =
            cardDescription(JsonField.of(cardDescription))

        /** A user-facing description for the card itself. */
        @JsonProperty("card_description")
        @ExcludeMissing
        fun cardDescription(cardDescription: JsonField<String>) = apply {
            this.cardDescription = cardDescription
        }

        /** An email address the user can contact to receive support for their card. */
        fun contactEmail(contactEmail: String) = contactEmail(JsonField.of(contactEmail))

        /** An email address the user can contact to receive support for their card. */
        @JsonProperty("contact_email")
        @ExcludeMissing
        fun contactEmail(contactEmail: JsonField<String>) = apply {
            this.contactEmail = contactEmail
        }

        /** A phone number the user can contact to receive support for their card. */
        fun contactPhone(contactPhone: String) = contactPhone(JsonField.of(contactPhone))

        /** A phone number the user can contact to receive support for their card. */
        @JsonProperty("contact_phone")
        @ExcludeMissing
        fun contactPhone(contactPhone: JsonField<String>) = apply {
            this.contactPhone = contactPhone
        }

        /** A website the user can visit to view and receive support for their card. */
        fun contactWebsite(contactWebsite: String) = contactWebsite(JsonField.of(contactWebsite))

        /** A website the user can visit to view and receive support for their card. */
        @JsonProperty("contact_website")
        @ExcludeMissing
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
        @JsonProperty("created_at")
        @ExcludeMissing
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** A description you can use to identify the Card Profile. */
        fun description(description: String) = description(JsonField.of(description))

        /** A description you can use to identify the Card Profile. */
        @JsonProperty("description")
        @ExcludeMissing
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** The Card Profile identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The Card Profile identifier. */
        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * The idempotency key you chose for this object. This value is unique across Increase and
         * is used to ensure that a request is only processed once. Learn more about
         * [idempotency](https://increase.com/documentation/idempotency-keys).
         */
        fun idempotencyKey(idempotencyKey: String) = idempotencyKey(JsonField.of(idempotencyKey))

        /**
         * The idempotency key you chose for this object. This value is unique across Increase and
         * is used to ensure that a request is only processed once. Learn more about
         * [idempotency](https://increase.com/documentation/idempotency-keys).
         */
        @JsonProperty("idempotency_key")
        @ExcludeMissing
        fun idempotencyKey(idempotencyKey: JsonField<String>) = apply {
            this.idempotencyKey = idempotencyKey
        }

        /** A user-facing description for whoever is issuing the card. */
        fun issuerName(issuerName: String) = issuerName(JsonField.of(issuerName))

        /** A user-facing description for whoever is issuing the card. */
        @JsonProperty("issuer_name")
        @ExcludeMissing
        fun issuerName(issuerName: JsonField<String>) = apply { this.issuerName = issuerName }

        /** The status of the Card Profile. */
        fun status(status: Status) = status(JsonField.of(status))

        /** The status of the Card Profile. */
        @JsonProperty("status")
        @ExcludeMissing
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** The Card's text color, specified as an RGB triple. */
        fun textColor(textColor: TextColor) = textColor(JsonField.of(textColor))

        /** The Card's text color, specified as an RGB triple. */
        @JsonProperty("text_color")
        @ExcludeMissing
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

        fun build(): DigitalCardProfile =
            DigitalCardProfile(
                appIconFileId,
                backgroundImageFileId,
                cardDescription,
                contactEmail,
                contactPhone,
                contactWebsite,
                createdAt,
                description,
                id,
                idempotencyKey,
                issuerName,
                status,
                textColor,
                type,
                additionalProperties.toUnmodifiable(),
            )
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Status && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val PENDING = Status(JsonField.of("pending"))

            @JvmField val REJECTED = Status(JsonField.of("rejected"))

            @JvmField val ACTIVE = Status(JsonField.of("active"))

            @JvmField val ARCHIVED = Status(JsonField.of("archived"))

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            PENDING,
            REJECTED,
            ACTIVE,
            ARCHIVED,
        }

        enum class Value {
            PENDING,
            REJECTED,
            ACTIVE,
            ARCHIVED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                PENDING -> Value.PENDING
                REJECTED -> Value.REJECTED
                ACTIVE -> Value.ACTIVE
                ARCHIVED -> Value.ARCHIVED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                PENDING -> Known.PENDING
                REJECTED -> Known.REJECTED
                ACTIVE -> Known.ACTIVE
                ARCHIVED -> Known.ARCHIVED
                else -> throw IncreaseInvalidDataException("Unknown Status: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    /** The Card's text color, specified as an RGB triple. */
    @JsonDeserialize(builder = TextColor.Builder::class)
    @NoAutoDetect
    class TextColor
    private constructor(
        private val blue: JsonField<Long>,
        private val green: JsonField<Long>,
        private val red: JsonField<Long>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        /** The value of the blue channel in the RGB color. */
        fun blue(): Long = blue.getRequired("blue")

        /** The value of the green channel in the RGB color. */
        fun green(): Long = green.getRequired("green")

        /** The value of the red channel in the RGB color. */
        fun red(): Long = red.getRequired("red")

        /** The value of the blue channel in the RGB color. */
        @JsonProperty("blue") @ExcludeMissing fun _blue() = blue

        /** The value of the green channel in the RGB color. */
        @JsonProperty("green") @ExcludeMissing fun _green() = green

        /** The value of the red channel in the RGB color. */
        @JsonProperty("red") @ExcludeMissing fun _red() = red

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): TextColor = apply {
            if (!validated) {
                blue()
                green()
                red()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var blue: JsonField<Long> = JsonMissing.of()
            private var green: JsonField<Long> = JsonMissing.of()
            private var red: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(textColor: TextColor) = apply {
                this.blue = textColor.blue
                this.green = textColor.green
                this.red = textColor.red
                additionalProperties(textColor.additionalProperties)
            }

            /** The value of the blue channel in the RGB color. */
            fun blue(blue: Long) = blue(JsonField.of(blue))

            /** The value of the blue channel in the RGB color. */
            @JsonProperty("blue")
            @ExcludeMissing
            fun blue(blue: JsonField<Long>) = apply { this.blue = blue }

            /** The value of the green channel in the RGB color. */
            fun green(green: Long) = green(JsonField.of(green))

            /** The value of the green channel in the RGB color. */
            @JsonProperty("green")
            @ExcludeMissing
            fun green(green: JsonField<Long>) = apply { this.green = green }

            /** The value of the red channel in the RGB color. */
            fun red(red: Long) = red(JsonField.of(red))

            /** The value of the red channel in the RGB color. */
            @JsonProperty("red")
            @ExcludeMissing
            fun red(red: JsonField<Long>) = apply { this.red = red }

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

            fun build(): TextColor =
                TextColor(
                    blue,
                    green,
                    red,
                    additionalProperties.toUnmodifiable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is TextColor &&
                this.blue == other.blue &&
                this.green == other.green &&
                this.red == other.red &&
                this.additionalProperties == other.additionalProperties
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        blue,
                        green,
                        red,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "TextColor{blue=$blue, green=$green, red=$red, additionalProperties=$additionalProperties}"
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

            @JvmField val DIGITAL_CARD_PROFILE = Type(JsonField.of("digital_card_profile"))

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            DIGITAL_CARD_PROFILE,
        }

        enum class Value {
            DIGITAL_CARD_PROFILE,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                DIGITAL_CARD_PROFILE -> Value.DIGITAL_CARD_PROFILE
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                DIGITAL_CARD_PROFILE -> Known.DIGITAL_CARD_PROFILE
                else -> throw IncreaseInvalidDataException("Unknown Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DigitalCardProfile &&
            this.appIconFileId == other.appIconFileId &&
            this.backgroundImageFileId == other.backgroundImageFileId &&
            this.cardDescription == other.cardDescription &&
            this.contactEmail == other.contactEmail &&
            this.contactPhone == other.contactPhone &&
            this.contactWebsite == other.contactWebsite &&
            this.createdAt == other.createdAt &&
            this.description == other.description &&
            this.id == other.id &&
            this.idempotencyKey == other.idempotencyKey &&
            this.issuerName == other.issuerName &&
            this.status == other.status &&
            this.textColor == other.textColor &&
            this.type == other.type &&
            this.additionalProperties == other.additionalProperties
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    appIconFileId,
                    backgroundImageFileId,
                    cardDescription,
                    contactEmail,
                    contactPhone,
                    contactWebsite,
                    createdAt,
                    description,
                    id,
                    idempotencyKey,
                    issuerName,
                    status,
                    textColor,
                    type,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "DigitalCardProfile{appIconFileId=$appIconFileId, backgroundImageFileId=$backgroundImageFileId, cardDescription=$cardDescription, contactEmail=$contactEmail, contactPhone=$contactPhone, contactWebsite=$contactWebsite, createdAt=$createdAt, description=$description, id=$id, idempotencyKey=$idempotencyKey, issuerName=$issuerName, status=$status, textColor=$textColor, type=$type, additionalProperties=$additionalProperties}"
}
