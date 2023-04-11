package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional
import java.util.UUID
import com.increase.api.core.BaseDeserializer
import com.increase.api.core.BaseSerializer
import com.increase.api.core.getOrThrow
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.JsonField
import com.increase.api.core.toUnmodifiable
import com.increase.api.core.NoAutoDetect
import com.increase.api.errors.IncreaseInvalidDataException

/**
 * This contains artwork and metadata relating to a Card's appearance in digital
 * wallet apps like Apple Pay and Google Pay. For more information, see our guide
 * on [digital card artwork](https://increase.com/documentation/card-art)
 */
@JsonDeserialize(builder = CardProfile.Builder::class)
@NoAutoDetect
class CardProfile private constructor(private val id: JsonField<String>,private val createdAt: JsonField<OffsetDateTime>,private val status: JsonField<Status>,private val description: JsonField<String>,private val digitalWallets: JsonField<DigitalWallets>,private val type: JsonField<Type>,private val additionalProperties: Map<String, JsonValue>,) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** The Card Profile identifier. */
    fun id(): String = id.getRequired("id")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which
     * the Card Dispute was created.
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /** The status of the Card Profile. */
    fun status(): Status = status.getRequired("status")

    /** A description you can use to identify the Card Profile. */
    fun description(): String = description.getRequired("description")

    /**
     * How Cards should appear in digital wallets such as Apple Pay. Different wallets
     * will use these values to render card artwork appropriately for their app.
     */
    fun digitalWallets(): DigitalWallets = digitalWallets.getRequired("digital_wallets")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `card_profile`.
     */
    fun type(): Type = type.getRequired("type")

    /** The Card Profile identifier. */
    @JsonProperty("id")
    @ExcludeMissing
    fun _id() = id

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which
     * the Card Dispute was created.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt() = createdAt

    /** The status of the Card Profile. */
    @JsonProperty("status")
    @ExcludeMissing
    fun _status() = status

    /** A description you can use to identify the Card Profile. */
    @JsonProperty("description")
    @ExcludeMissing
    fun _description() = description

    /**
     * How Cards should appear in digital wallets such as Apple Pay. Different wallets
     * will use these values to render card artwork appropriately for their app.
     */
    @JsonProperty("digital_wallets")
    @ExcludeMissing
    fun _digitalWallets() = digitalWallets

    /**
     * A constant representing the object's type. For this resource it will always be
     * `card_profile`.
     */
    @JsonProperty("type")
    @ExcludeMissing
    fun _type() = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate() = apply {
        if (!validated) {
          id()
          createdAt()
          status()
          description()
          digitalWallets().validate()
          type()
          validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return other is CardProfile &&
          this.id == other.id &&
          this.createdAt == other.createdAt &&
          this.status == other.status &&
          this.description == other.description &&
          this.digitalWallets == other.digitalWallets &&
          this.type == other.type &&
          this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
      if (hashCode == 0) {
        hashCode = Objects.hash(
            id,
            createdAt,
            status,
            description,
            digitalWallets,
            type,
            additionalProperties,
        )
      }
      return hashCode
    }

    override fun toString() = "CardProfile{id=$id, createdAt=$createdAt, status=$status, description=$description, digitalWallets=$digitalWallets, type=$type, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic
        fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var digitalWallets: JsonField<DigitalWallets> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(cardProfile: CardProfile) = apply {
            this.id = cardProfile.id
            this.createdAt = cardProfile.createdAt
            this.status = cardProfile.status
            this.description = cardProfile.description
            this.digitalWallets = cardProfile.digitalWallets
            this.type = cardProfile.type
            additionalProperties(cardProfile.additionalProperties)
        }

        /** The Card Profile identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The Card Profile identifier. */
        @JsonProperty("id")
        @ExcludeMissing
        fun id(id: JsonField<String>) = apply {
            this.id = id
        }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which
         * the Card Dispute was created.
         */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which
         * the Card Dispute was created.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
            this.createdAt = createdAt
        }

        /** The status of the Card Profile. */
        fun status(status: Status) = status(JsonField.of(status))

        /** The status of the Card Profile. */
        @JsonProperty("status")
        @ExcludeMissing
        fun status(status: JsonField<Status>) = apply {
            this.status = status
        }

        /** A description you can use to identify the Card Profile. */
        fun description(description: String) = description(JsonField.of(description))

        /** A description you can use to identify the Card Profile. */
        @JsonProperty("description")
        @ExcludeMissing
        fun description(description: JsonField<String>) = apply {
            this.description = description
        }

        /**
         * How Cards should appear in digital wallets such as Apple Pay. Different wallets
         * will use these values to render card artwork appropriately for their app.
         */
        fun digitalWallets(digitalWallets: DigitalWallets) = digitalWallets(JsonField.of(digitalWallets))

        /**
         * How Cards should appear in digital wallets such as Apple Pay. Different wallets
         * will use these values to render card artwork appropriately for their app.
         */
        @JsonProperty("digital_wallets")
        @ExcludeMissing
        fun digitalWallets(digitalWallets: JsonField<DigitalWallets>) = apply {
            this.digitalWallets = digitalWallets
        }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `card_profile`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * A constant representing the object's type. For this resource it will always be
         * `card_profile`.
         */
        @JsonProperty("type")
        @ExcludeMissing
        fun type(type: JsonField<Type>) = apply {
            this.type = type
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

        fun build(): CardProfile = CardProfile(
            id,
            createdAt,
            status,
            description,
            digitalWallets,
            type,
            additionalProperties.toUnmodifiable(),
        )
    }

    class Status @JsonCreator private constructor(private val value: JsonField<String>,) {

        @com.fasterxml.jackson.annotation.JsonValue
        fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is Status &&
              this.value == other.value
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

        fun value(): Value = when (this) {
            PENDING -> Value.PENDING
            REJECTED -> Value.REJECTED
            ACTIVE -> Value.ACTIVE
            ARCHIVED -> Value.ARCHIVED
            else -> Value._UNKNOWN
        }

        fun known(): Known = when (this) {
            PENDING -> Known.PENDING
            REJECTED -> Known.REJECTED
            ACTIVE -> Known.ACTIVE
            ARCHIVED -> Known.ARCHIVED
            else -> throw IncreaseInvalidDataException("Unknown Status: $value")
        }

        fun asString(): String = _value().asStringOrThrow()
    }

    /**
     * How Cards should appear in digital wallets such as Apple Pay. Different wallets
     * will use these values to render card artwork appropriately for their app.
     */
    @JsonDeserialize(builder = DigitalWallets.Builder::class)
    @NoAutoDetect
    class DigitalWallets private constructor(private val textColor: JsonField<TextColor>,private val issuerName: JsonField<String>,private val cardDescription: JsonField<String>,private val contactWebsite: JsonField<String>,private val contactEmail: JsonField<String>,private val contactPhone: JsonField<String>,private val backgroundImageFileId: JsonField<String>,private val appIconFileId: JsonField<String>,private val additionalProperties: Map<String, JsonValue>,) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /** The Card's text color, specified as an RGB triple. */
        fun textColor(): TextColor = textColor.getRequired("text_color")

        /** A user-facing description for whoever is issuing the card. */
        fun issuerName(): String = issuerName.getRequired("issuer_name")

        /** A user-facing description for the card itself. */
        fun cardDescription(): String = cardDescription.getRequired("card_description")

        /** A website the user can visit to view and receive support for their card. */
        fun contactWebsite(): Optional<String> = Optional.ofNullable(contactWebsite.getNullable("contact_website"))

        /** An email address the user can contact to receive support for their card. */
        fun contactEmail(): Optional<String> = Optional.ofNullable(contactEmail.getNullable("contact_email"))

        /** A phone number the user can contact to receive support for their card. */
        fun contactPhone(): Optional<String> = Optional.ofNullable(contactPhone.getNullable("contact_phone"))

        /** The identifier of the File containing the card's front image. */
        fun backgroundImageFileId(): String = backgroundImageFileId.getRequired("background_image_file_id")

        /** The identifier of the File containing the card's icon image. */
        fun appIconFileId(): String = appIconFileId.getRequired("app_icon_file_id")

        /** The Card's text color, specified as an RGB triple. */
        @JsonProperty("text_color")
        @ExcludeMissing
        fun _textColor() = textColor

        /** A user-facing description for whoever is issuing the card. */
        @JsonProperty("issuer_name")
        @ExcludeMissing
        fun _issuerName() = issuerName

        /** A user-facing description for the card itself. */
        @JsonProperty("card_description")
        @ExcludeMissing
        fun _cardDescription() = cardDescription

        /** A website the user can visit to view and receive support for their card. */
        @JsonProperty("contact_website")
        @ExcludeMissing
        fun _contactWebsite() = contactWebsite

        /** An email address the user can contact to receive support for their card. */
        @JsonProperty("contact_email")
        @ExcludeMissing
        fun _contactEmail() = contactEmail

        /** A phone number the user can contact to receive support for their card. */
        @JsonProperty("contact_phone")
        @ExcludeMissing
        fun _contactPhone() = contactPhone

        /** The identifier of the File containing the card's front image. */
        @JsonProperty("background_image_file_id")
        @ExcludeMissing
        fun _backgroundImageFileId() = backgroundImageFileId

        /** The identifier of the File containing the card's icon image. */
        @JsonProperty("app_icon_file_id")
        @ExcludeMissing
        fun _appIconFileId() = appIconFileId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate() = apply {
            if (!validated) {
              textColor().validate()
              issuerName()
              cardDescription()
              contactWebsite()
              contactEmail()
              contactPhone()
              backgroundImageFileId()
              appIconFileId()
              validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is DigitalWallets &&
              this.textColor == other.textColor &&
              this.issuerName == other.issuerName &&
              this.cardDescription == other.cardDescription &&
              this.contactWebsite == other.contactWebsite &&
              this.contactEmail == other.contactEmail &&
              this.contactPhone == other.contactPhone &&
              this.backgroundImageFileId == other.backgroundImageFileId &&
              this.appIconFileId == other.appIconFileId &&
              this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
          if (hashCode == 0) {
            hashCode = Objects.hash(
                textColor,
                issuerName,
                cardDescription,
                contactWebsite,
                contactEmail,
                contactPhone,
                backgroundImageFileId,
                appIconFileId,
                additionalProperties,
            )
          }
          return hashCode
        }

        override fun toString() = "DigitalWallets{textColor=$textColor, issuerName=$issuerName, cardDescription=$cardDescription, contactWebsite=$contactWebsite, contactEmail=$contactEmail, contactPhone=$contactPhone, backgroundImageFileId=$backgroundImageFileId, appIconFileId=$appIconFileId, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic
            fun builder() = Builder()
        }

        class Builder {

            private var textColor: JsonField<TextColor> = JsonMissing.of()
            private var issuerName: JsonField<String> = JsonMissing.of()
            private var cardDescription: JsonField<String> = JsonMissing.of()
            private var contactWebsite: JsonField<String> = JsonMissing.of()
            private var contactEmail: JsonField<String> = JsonMissing.of()
            private var contactPhone: JsonField<String> = JsonMissing.of()
            private var backgroundImageFileId: JsonField<String> = JsonMissing.of()
            private var appIconFileId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(digitalWallets: DigitalWallets) = apply {
                this.textColor = digitalWallets.textColor
                this.issuerName = digitalWallets.issuerName
                this.cardDescription = digitalWallets.cardDescription
                this.contactWebsite = digitalWallets.contactWebsite
                this.contactEmail = digitalWallets.contactEmail
                this.contactPhone = digitalWallets.contactPhone
                this.backgroundImageFileId = digitalWallets.backgroundImageFileId
                this.appIconFileId = digitalWallets.appIconFileId
                additionalProperties(digitalWallets.additionalProperties)
            }

            /** The Card's text color, specified as an RGB triple. */
            fun textColor(textColor: TextColor) = textColor(JsonField.of(textColor))

            /** The Card's text color, specified as an RGB triple. */
            @JsonProperty("text_color")
            @ExcludeMissing
            fun textColor(textColor: JsonField<TextColor>) = apply {
                this.textColor = textColor
            }

            /** A user-facing description for whoever is issuing the card. */
            fun issuerName(issuerName: String) = issuerName(JsonField.of(issuerName))

            /** A user-facing description for whoever is issuing the card. */
            @JsonProperty("issuer_name")
            @ExcludeMissing
            fun issuerName(issuerName: JsonField<String>) = apply {
                this.issuerName = issuerName
            }

            /** A user-facing description for the card itself. */
            fun cardDescription(cardDescription: String) = cardDescription(JsonField.of(cardDescription))

            /** A user-facing description for the card itself. */
            @JsonProperty("card_description")
            @ExcludeMissing
            fun cardDescription(cardDescription: JsonField<String>) = apply {
                this.cardDescription = cardDescription
            }

            /** A website the user can visit to view and receive support for their card. */
            fun contactWebsite(contactWebsite: String) = contactWebsite(JsonField.of(contactWebsite))

            /** A website the user can visit to view and receive support for their card. */
            @JsonProperty("contact_website")
            @ExcludeMissing
            fun contactWebsite(contactWebsite: JsonField<String>) = apply {
                this.contactWebsite = contactWebsite
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

            /** The identifier of the File containing the card's front image. */
            fun backgroundImageFileId(backgroundImageFileId: String) = backgroundImageFileId(JsonField.of(backgroundImageFileId))

            /** The identifier of the File containing the card's front image. */
            @JsonProperty("background_image_file_id")
            @ExcludeMissing
            fun backgroundImageFileId(backgroundImageFileId: JsonField<String>) = apply {
                this.backgroundImageFileId = backgroundImageFileId
            }

            /** The identifier of the File containing the card's icon image. */
            fun appIconFileId(appIconFileId: String) = appIconFileId(JsonField.of(appIconFileId))

            /** The identifier of the File containing the card's icon image. */
            @JsonProperty("app_icon_file_id")
            @ExcludeMissing
            fun appIconFileId(appIconFileId: JsonField<String>) = apply {
                this.appIconFileId = appIconFileId
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

            fun build(): DigitalWallets = DigitalWallets(
                textColor,
                issuerName,
                cardDescription,
                contactWebsite,
                contactEmail,
                contactPhone,
                backgroundImageFileId,
                appIconFileId,
                additionalProperties.toUnmodifiable(),
            )
        }

        /** The Card's text color, specified as an RGB triple. */
        @JsonDeserialize(builder = TextColor.Builder::class)
        @NoAutoDetect
        class TextColor private constructor(private val red: JsonField<Long>,private val green: JsonField<Long>,private val blue: JsonField<Long>,private val additionalProperties: Map<String, JsonValue>,) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** The value of the red channel in the RGB color. */
            fun red(): Long = red.getRequired("red")

            /** The value of the green channel in the RGB color. */
            fun green(): Long = green.getRequired("green")

            /** The value of the blue channel in the RGB color. */
            fun blue(): Long = blue.getRequired("blue")

            /** The value of the red channel in the RGB color. */
            @JsonProperty("red")
            @ExcludeMissing
            fun _red() = red

            /** The value of the green channel in the RGB color. */
            @JsonProperty("green")
            @ExcludeMissing
            fun _green() = green

            /** The value of the blue channel in the RGB color. */
            @JsonProperty("blue")
            @ExcludeMissing
            fun _blue() = blue

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate() = apply {
                if (!validated) {
                  red()
                  green()
                  blue()
                  validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
              if (this === other) {
                  return true
              }

              return other is TextColor &&
                  this.red == other.red &&
                  this.green == other.green &&
                  this.blue == other.blue &&
                  this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
              if (hashCode == 0) {
                hashCode = Objects.hash(
                    red,
                    green,
                    blue,
                    additionalProperties,
                )
              }
              return hashCode
            }

            override fun toString() = "TextColor{red=$red, green=$green, blue=$blue, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic
                fun builder() = Builder()
            }

            class Builder {

                private var red: JsonField<Long> = JsonMissing.of()
                private var green: JsonField<Long> = JsonMissing.of()
                private var blue: JsonField<Long> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(textColor: TextColor) = apply {
                    this.red = textColor.red
                    this.green = textColor.green
                    this.blue = textColor.blue
                    additionalProperties(textColor.additionalProperties)
                }

                /** The value of the red channel in the RGB color. */
                fun red(red: Long) = red(JsonField.of(red))

                /** The value of the red channel in the RGB color. */
                @JsonProperty("red")
                @ExcludeMissing
                fun red(red: JsonField<Long>) = apply {
                    this.red = red
                }

                /** The value of the green channel in the RGB color. */
                fun green(green: Long) = green(JsonField.of(green))

                /** The value of the green channel in the RGB color. */
                @JsonProperty("green")
                @ExcludeMissing
                fun green(green: JsonField<Long>) = apply {
                    this.green = green
                }

                /** The value of the blue channel in the RGB color. */
                fun blue(blue: Long) = blue(JsonField.of(blue))

                /** The value of the blue channel in the RGB color. */
                @JsonProperty("blue")
                @ExcludeMissing
                fun blue(blue: JsonField<Long>) = apply {
                    this.blue = blue
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

                fun build(): TextColor = TextColor(
                    red,
                    green,
                    blue,
                    additionalProperties.toUnmodifiable(),
                )
            }
        }
    }

    class Type @JsonCreator private constructor(private val value: JsonField<String>,) {

        @com.fasterxml.jackson.annotation.JsonValue
        fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is Type &&
              this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val CARD_PROFILE = Type(JsonField.of("card_profile"))

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            CARD_PROFILE,
        }

        enum class Value {
            CARD_PROFILE,
            _UNKNOWN,
        }

        fun value(): Value = when (this) {
            CARD_PROFILE -> Value.CARD_PROFILE
            else -> Value._UNKNOWN
        }

        fun known(): Known = when (this) {
            CARD_PROFILE -> Known.CARD_PROFILE
            else -> throw IncreaseInvalidDataException("Unknown Type: $value")
        }

        fun asString(): String = _value().asStringOrThrow()
    }
}
