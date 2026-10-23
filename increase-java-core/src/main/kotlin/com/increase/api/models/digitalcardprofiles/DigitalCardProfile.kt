// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.digitalcardprofiles

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.increase.api.core.Enum
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.checkKnown
import com.increase.api.core.checkRequired
import com.increase.api.core.toImmutable
import com.increase.api.errors.IncreaseInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * This contains artwork and metadata relating to a Card's appearance in digital wallet apps like
 * Apple Pay and Google Pay. For more information, see our guide on
 * [digital card artwork](https://increase.com/documentation/card-art).
 */
class DigitalCardProfile
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val appIconFileId: JsonField<String>,
    private val applePay: JsonField<ApplePay>,
    private val backgroundImageFileId: JsonField<String>,
    private val cardDescription: JsonField<String>,
    private val contactEmail: JsonField<String>,
    private val contactName: JsonField<String>,
    private val contactPhone: JsonField<String>,
    private val contactWebsite: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val description: JsonField<String>,
    private val idempotencyKey: JsonField<String>,
    private val status: JsonField<Status>,
    private val textColor: JsonField<TextColor>,
    private val type: JsonField<Type>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("app_icon_file_id")
        @ExcludeMissing
        appIconFileId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("apple_pay") @ExcludeMissing applePay: JsonField<ApplePay> = JsonMissing.of(),
        @JsonProperty("background_image_file_id")
        @ExcludeMissing
        backgroundImageFileId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("card_description")
        @ExcludeMissing
        cardDescription: JsonField<String> = JsonMissing.of(),
        @JsonProperty("contact_email")
        @ExcludeMissing
        contactEmail: JsonField<String> = JsonMissing.of(),
        @JsonProperty("contact_name")
        @ExcludeMissing
        contactName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("contact_phone")
        @ExcludeMissing
        contactPhone: JsonField<String> = JsonMissing.of(),
        @JsonProperty("contact_website")
        @ExcludeMissing
        contactWebsite: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("idempotency_key")
        @ExcludeMissing
        idempotencyKey: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("text_color")
        @ExcludeMissing
        textColor: JsonField<TextColor> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
    ) : this(
        id,
        appIconFileId,
        applePay,
        backgroundImageFileId,
        cardDescription,
        contactEmail,
        contactName,
        contactPhone,
        contactWebsite,
        createdAt,
        description,
        idempotencyKey,
        status,
        textColor,
        type,
        mutableMapOf(),
    )

    /**
     * The Card Profile identifier.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * The identifier of the File containing the card's icon image.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun appIconFileId(): String = appIconFileId.getRequired("app_icon_file_id")

    /**
     * Apple Pay specific settings for the Card Profile.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun applePay(): Optional<ApplePay> = applePay.getOptional("apple_pay")

    /**
     * The identifier of the File containing the card's front image.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun backgroundImageFileId(): String =
        backgroundImageFileId.getRequired("background_image_file_id")

    /**
     * A user-facing description for the card itself.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun cardDescription(): String = cardDescription.getRequired("card_description")

    /**
     * An email address the user can contact to receive support for their card.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun contactEmail(): Optional<String> = contactEmail.getOptional("contact_email")

    /**
     * The name of your company or card program, shown to the user as who to contact for support
     * with their card.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun contactName(): String = contactName.getRequired("contact_name")

    /**
     * A phone number the user can contact to receive support for their card.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun contactPhone(): Optional<String> = contactPhone.getOptional("contact_phone")

    /**
     * A website the user can visit to view and receive support for their card.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun contactWebsite(): Optional<String> = contactWebsite.getOptional("contact_website")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the Digital
     * Card Profile was created.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * A description you can use to identify the Card Profile.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun description(): String = description.getRequired("description")

    /**
     * The idempotency key you chose for this object. This value is unique across Increase and is
     * used to ensure that a request is only processed once. Learn more about
     * [idempotency](https://increase.com/documentation/idempotency-keys).
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun idempotencyKey(): Optional<String> = idempotencyKey.getOptional("idempotency_key")

    /**
     * The status of the Card Profile.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * The Card's text color, specified as an RGB triple.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun textColor(): TextColor = textColor.getRequired("text_color")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `digital_card_profile`.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [appIconFileId].
     *
     * Unlike [appIconFileId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("app_icon_file_id")
    @ExcludeMissing
    fun _appIconFileId(): JsonField<String> = appIconFileId

    /**
     * Returns the raw JSON value of [applePay].
     *
     * Unlike [applePay], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("apple_pay") @ExcludeMissing fun _applePay(): JsonField<ApplePay> = applePay

    /**
     * Returns the raw JSON value of [backgroundImageFileId].
     *
     * Unlike [backgroundImageFileId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("background_image_file_id")
    @ExcludeMissing
    fun _backgroundImageFileId(): JsonField<String> = backgroundImageFileId

    /**
     * Returns the raw JSON value of [cardDescription].
     *
     * Unlike [cardDescription], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("card_description")
    @ExcludeMissing
    fun _cardDescription(): JsonField<String> = cardDescription

    /**
     * Returns the raw JSON value of [contactEmail].
     *
     * Unlike [contactEmail], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("contact_email")
    @ExcludeMissing
    fun _contactEmail(): JsonField<String> = contactEmail

    /**
     * Returns the raw JSON value of [contactName].
     *
     * Unlike [contactName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("contact_name")
    @ExcludeMissing
    fun _contactName(): JsonField<String> = contactName

    /**
     * Returns the raw JSON value of [contactPhone].
     *
     * Unlike [contactPhone], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("contact_phone")
    @ExcludeMissing
    fun _contactPhone(): JsonField<String> = contactPhone

    /**
     * Returns the raw JSON value of [contactWebsite].
     *
     * Unlike [contactWebsite], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("contact_website")
    @ExcludeMissing
    fun _contactWebsite(): JsonField<String> = contactWebsite

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [idempotencyKey].
     *
     * Unlike [idempotencyKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idempotency_key")
    @ExcludeMissing
    fun _idempotencyKey(): JsonField<String> = idempotencyKey

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [textColor].
     *
     * Unlike [textColor], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("text_color") @ExcludeMissing fun _textColor(): JsonField<TextColor> = textColor

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
         * Returns a mutable builder for constructing an instance of [DigitalCardProfile].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .appIconFileId()
         * .applePay()
         * .backgroundImageFileId()
         * .cardDescription()
         * .contactEmail()
         * .contactName()
         * .contactPhone()
         * .contactWebsite()
         * .createdAt()
         * .description()
         * .idempotencyKey()
         * .status()
         * .textColor()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DigitalCardProfile]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var appIconFileId: JsonField<String>? = null
        private var applePay: JsonField<ApplePay>? = null
        private var backgroundImageFileId: JsonField<String>? = null
        private var cardDescription: JsonField<String>? = null
        private var contactEmail: JsonField<String>? = null
        private var contactName: JsonField<String>? = null
        private var contactPhone: JsonField<String>? = null
        private var contactWebsite: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var description: JsonField<String>? = null
        private var idempotencyKey: JsonField<String>? = null
        private var status: JsonField<Status>? = null
        private var textColor: JsonField<TextColor>? = null
        private var type: JsonField<Type>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(digitalCardProfile: DigitalCardProfile) = apply {
            id = digitalCardProfile.id
            appIconFileId = digitalCardProfile.appIconFileId
            applePay = digitalCardProfile.applePay
            backgroundImageFileId = digitalCardProfile.backgroundImageFileId
            cardDescription = digitalCardProfile.cardDescription
            contactEmail = digitalCardProfile.contactEmail
            contactName = digitalCardProfile.contactName
            contactPhone = digitalCardProfile.contactPhone
            contactWebsite = digitalCardProfile.contactWebsite
            createdAt = digitalCardProfile.createdAt
            description = digitalCardProfile.description
            idempotencyKey = digitalCardProfile.idempotencyKey
            status = digitalCardProfile.status
            textColor = digitalCardProfile.textColor
            type = digitalCardProfile.type
            additionalProperties = digitalCardProfile.additionalProperties.toMutableMap()
        }

        /** The Card Profile identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The identifier of the File containing the card's icon image. */
        fun appIconFileId(appIconFileId: String) = appIconFileId(JsonField.of(appIconFileId))

        /**
         * Sets [Builder.appIconFileId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.appIconFileId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun appIconFileId(appIconFileId: JsonField<String>) = apply {
            this.appIconFileId = appIconFileId
        }

        /** Apple Pay specific settings for the Card Profile. */
        fun applePay(applePay: ApplePay?) = applePay(JsonField.ofNullable(applePay))

        /** Alias for calling [Builder.applePay] with `applePay.orElse(null)`. */
        fun applePay(applePay: Optional<ApplePay>) = applePay(applePay.getOrNull())

        /**
         * Sets [Builder.applePay] to an arbitrary JSON value.
         *
         * You should usually call [Builder.applePay] with a well-typed [ApplePay] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun applePay(applePay: JsonField<ApplePay>) = apply { this.applePay = applePay }

        /** The identifier of the File containing the card's front image. */
        fun backgroundImageFileId(backgroundImageFileId: String) =
            backgroundImageFileId(JsonField.of(backgroundImageFileId))

        /**
         * Sets [Builder.backgroundImageFileId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.backgroundImageFileId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun backgroundImageFileId(backgroundImageFileId: JsonField<String>) = apply {
            this.backgroundImageFileId = backgroundImageFileId
        }

        /** A user-facing description for the card itself. */
        fun cardDescription(cardDescription: String) =
            cardDescription(JsonField.of(cardDescription))

        /**
         * Sets [Builder.cardDescription] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cardDescription] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun cardDescription(cardDescription: JsonField<String>) = apply {
            this.cardDescription = cardDescription
        }

        /** An email address the user can contact to receive support for their card. */
        fun contactEmail(contactEmail: String?) = contactEmail(JsonField.ofNullable(contactEmail))

        /** Alias for calling [Builder.contactEmail] with `contactEmail.orElse(null)`. */
        fun contactEmail(contactEmail: Optional<String>) = contactEmail(contactEmail.getOrNull())

        /**
         * Sets [Builder.contactEmail] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contactEmail] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun contactEmail(contactEmail: JsonField<String>) = apply {
            this.contactEmail = contactEmail
        }

        /**
         * The name of your company or card program, shown to the user as who to contact for support
         * with their card.
         */
        fun contactName(contactName: String) = contactName(JsonField.of(contactName))

        /**
         * Sets [Builder.contactName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contactName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun contactName(contactName: JsonField<String>) = apply { this.contactName = contactName }

        /** A phone number the user can contact to receive support for their card. */
        fun contactPhone(contactPhone: String?) = contactPhone(JsonField.ofNullable(contactPhone))

        /** Alias for calling [Builder.contactPhone] with `contactPhone.orElse(null)`. */
        fun contactPhone(contactPhone: Optional<String>) = contactPhone(contactPhone.getOrNull())

        /**
         * Sets [Builder.contactPhone] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contactPhone] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun contactPhone(contactPhone: JsonField<String>) = apply {
            this.contactPhone = contactPhone
        }

        /** A website the user can visit to view and receive support for their card. */
        fun contactWebsite(contactWebsite: String?) =
            contactWebsite(JsonField.ofNullable(contactWebsite))

        /** Alias for calling [Builder.contactWebsite] with `contactWebsite.orElse(null)`. */
        fun contactWebsite(contactWebsite: Optional<String>) =
            contactWebsite(contactWebsite.getOrNull())

        /**
         * Sets [Builder.contactWebsite] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contactWebsite] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun contactWebsite(contactWebsite: JsonField<String>) = apply {
            this.contactWebsite = contactWebsite
        }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the Digital
         * Card Profile was created.
         */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** A description you can use to identify the Card Profile. */
        fun description(description: String) = description(JsonField.of(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /**
         * The idempotency key you chose for this object. This value is unique across Increase and
         * is used to ensure that a request is only processed once. Learn more about
         * [idempotency](https://increase.com/documentation/idempotency-keys).
         */
        fun idempotencyKey(idempotencyKey: String?) =
            idempotencyKey(JsonField.ofNullable(idempotencyKey))

        /** Alias for calling [Builder.idempotencyKey] with `idempotencyKey.orElse(null)`. */
        fun idempotencyKey(idempotencyKey: Optional<String>) =
            idempotencyKey(idempotencyKey.getOrNull())

        /**
         * Sets [Builder.idempotencyKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idempotencyKey] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun idempotencyKey(idempotencyKey: JsonField<String>) = apply {
            this.idempotencyKey = idempotencyKey
        }

        /** The status of the Card Profile. */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** The Card's text color, specified as an RGB triple. */
        fun textColor(textColor: TextColor) = textColor(JsonField.of(textColor))

        /**
         * Sets [Builder.textColor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.textColor] with a well-typed [TextColor] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun textColor(textColor: JsonField<TextColor>) = apply { this.textColor = textColor }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `digital_card_profile`.
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

        /**
         * Returns an immutable instance of [DigitalCardProfile].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .appIconFileId()
         * .applePay()
         * .backgroundImageFileId()
         * .cardDescription()
         * .contactEmail()
         * .contactName()
         * .contactPhone()
         * .contactWebsite()
         * .createdAt()
         * .description()
         * .idempotencyKey()
         * .status()
         * .textColor()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DigitalCardProfile =
            DigitalCardProfile(
                checkRequired("id", id),
                checkRequired("appIconFileId", appIconFileId),
                checkRequired("applePay", applePay),
                checkRequired("backgroundImageFileId", backgroundImageFileId),
                checkRequired("cardDescription", cardDescription),
                checkRequired("contactEmail", contactEmail),
                checkRequired("contactName", contactName),
                checkRequired("contactPhone", contactPhone),
                checkRequired("contactWebsite", contactWebsite),
                checkRequired("createdAt", createdAt),
                checkRequired("description", description),
                checkRequired("idempotencyKey", idempotencyKey),
                checkRequired("status", status),
                checkRequired("textColor", textColor),
                checkRequired("type", type),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws IncreaseInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): DigitalCardProfile = apply {
        if (validated) {
            return@apply
        }

        id()
        appIconFileId()
        applePay().ifPresent { it.validate() }
        backgroundImageFileId()
        cardDescription()
        contactEmail()
        contactName()
        contactPhone()
        contactWebsite()
        createdAt()
        description()
        idempotencyKey()
        status().validate()
        textColor().validate()
        type().validate()
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (appIconFileId.asKnown().isPresent) 1 else 0) +
            (applePay.asKnown().getOrNull()?.validity() ?: 0) +
            (if (backgroundImageFileId.asKnown().isPresent) 1 else 0) +
            (if (cardDescription.asKnown().isPresent) 1 else 0) +
            (if (contactEmail.asKnown().isPresent) 1 else 0) +
            (if (contactName.asKnown().isPresent) 1 else 0) +
            (if (contactPhone.asKnown().isPresent) 1 else 0) +
            (if (contactWebsite.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (if (idempotencyKey.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (textColor.asKnown().getOrNull()?.validity() ?: 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0)

    /** Apple Pay specific settings for the Card Profile. */
    class ApplePay
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val associatedApplicationIdentifiers:
            JsonField<List<AssociatedApplicationIdentifier>>,
        private val associatedStoreIdentifiers: JsonField<List<AssociatedStoreIdentifier>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("associated_application_identifiers")
            @ExcludeMissing
            associatedApplicationIdentifiers: JsonField<List<AssociatedApplicationIdentifier>> =
                JsonMissing.of(),
            @JsonProperty("associated_store_identifiers")
            @ExcludeMissing
            associatedStoreIdentifiers: JsonField<List<AssociatedStoreIdentifier>> =
                JsonMissing.of(),
        ) : this(associatedApplicationIdentifiers, associatedStoreIdentifiers, mutableMapOf())

        /**
         * The applications associated with cards using this Card Profile.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun associatedApplicationIdentifiers(): List<AssociatedApplicationIdentifier> =
            associatedApplicationIdentifiers.getRequired("associated_application_identifiers")

        /**
         * The App Store listings of the applications associated with cards using this Card Profile.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun associatedStoreIdentifiers(): List<AssociatedStoreIdentifier> =
            associatedStoreIdentifiers.getRequired("associated_store_identifiers")

        /**
         * Returns the raw JSON value of [associatedApplicationIdentifiers].
         *
         * Unlike [associatedApplicationIdentifiers], this method doesn't throw if the JSON field
         * has an unexpected type.
         */
        @JsonProperty("associated_application_identifiers")
        @ExcludeMissing
        fun _associatedApplicationIdentifiers(): JsonField<List<AssociatedApplicationIdentifier>> =
            associatedApplicationIdentifiers

        /**
         * Returns the raw JSON value of [associatedStoreIdentifiers].
         *
         * Unlike [associatedStoreIdentifiers], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("associated_store_identifiers")
        @ExcludeMissing
        fun _associatedStoreIdentifiers(): JsonField<List<AssociatedStoreIdentifier>> =
            associatedStoreIdentifiers

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
             * Returns a mutable builder for constructing an instance of [ApplePay].
             *
             * The following fields are required:
             * ```java
             * .associatedApplicationIdentifiers()
             * .associatedStoreIdentifiers()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ApplePay]. */
        class Builder internal constructor() {

            private var associatedApplicationIdentifiers:
                JsonField<MutableList<AssociatedApplicationIdentifier>>? =
                null
            private var associatedStoreIdentifiers:
                JsonField<MutableList<AssociatedStoreIdentifier>>? =
                null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(applePay: ApplePay) = apply {
                associatedApplicationIdentifiers =
                    applePay.associatedApplicationIdentifiers.map { it.toMutableList() }
                associatedStoreIdentifiers =
                    applePay.associatedStoreIdentifiers.map { it.toMutableList() }
                additionalProperties = applePay.additionalProperties.toMutableMap()
            }

            /** The applications associated with cards using this Card Profile. */
            fun associatedApplicationIdentifiers(
                associatedApplicationIdentifiers: List<AssociatedApplicationIdentifier>
            ) = associatedApplicationIdentifiers(JsonField.of(associatedApplicationIdentifiers))

            /**
             * Sets [Builder.associatedApplicationIdentifiers] to an arbitrary JSON value.
             *
             * You should usually call [Builder.associatedApplicationIdentifiers] with a well-typed
             * `List<AssociatedApplicationIdentifier>` value instead. This method is primarily for
             * setting the field to an undocumented or not yet supported value.
             */
            fun associatedApplicationIdentifiers(
                associatedApplicationIdentifiers: JsonField<List<AssociatedApplicationIdentifier>>
            ) = apply {
                this.associatedApplicationIdentifiers =
                    associatedApplicationIdentifiers.map { it.toMutableList() }
            }

            /**
             * Adds a single [AssociatedApplicationIdentifier] to
             * [associatedApplicationIdentifiers].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAssociatedApplicationIdentifier(
                associatedApplicationIdentifier: AssociatedApplicationIdentifier
            ) = apply {
                associatedApplicationIdentifiers =
                    (associatedApplicationIdentifiers ?: JsonField.of(mutableListOf())).also {
                        checkKnown("associatedApplicationIdentifiers", it)
                            .add(associatedApplicationIdentifier)
                    }
            }

            /**
             * The App Store listings of the applications associated with cards using this Card
             * Profile.
             */
            fun associatedStoreIdentifiers(
                associatedStoreIdentifiers: List<AssociatedStoreIdentifier>
            ) = associatedStoreIdentifiers(JsonField.of(associatedStoreIdentifiers))

            /**
             * Sets [Builder.associatedStoreIdentifiers] to an arbitrary JSON value.
             *
             * You should usually call [Builder.associatedStoreIdentifiers] with a well-typed
             * `List<AssociatedStoreIdentifier>` value instead. This method is primarily for setting
             * the field to an undocumented or not yet supported value.
             */
            fun associatedStoreIdentifiers(
                associatedStoreIdentifiers: JsonField<List<AssociatedStoreIdentifier>>
            ) = apply {
                this.associatedStoreIdentifiers =
                    associatedStoreIdentifiers.map { it.toMutableList() }
            }

            /**
             * Adds a single [AssociatedStoreIdentifier] to [associatedStoreIdentifiers].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAssociatedStoreIdentifier(associatedStoreIdentifier: AssociatedStoreIdentifier) =
                apply {
                    associatedStoreIdentifiers =
                        (associatedStoreIdentifiers ?: JsonField.of(mutableListOf())).also {
                            checkKnown("associatedStoreIdentifiers", it)
                                .add(associatedStoreIdentifier)
                        }
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
             * Returns an immutable instance of [ApplePay].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .associatedApplicationIdentifiers()
             * .associatedStoreIdentifiers()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ApplePay =
                ApplePay(
                    checkRequired(
                            "associatedApplicationIdentifiers",
                            associatedApplicationIdentifiers,
                        )
                        .map { it.toImmutable() },
                    checkRequired("associatedStoreIdentifiers", associatedStoreIdentifiers).map {
                        it.toImmutable()
                    },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws IncreaseInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): ApplePay = apply {
            if (validated) {
                return@apply
            }

            associatedApplicationIdentifiers().forEach { it.validate() }
            associatedStoreIdentifiers().forEach { it.validate() }
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
        @JvmSynthetic
        internal fun validity(): Int =
            (associatedApplicationIdentifiers.asKnown().getOrNull()?.sumOf { it.validity().toInt() }
                ?: 0) +
                (associatedStoreIdentifiers.asKnown().getOrNull()?.sumOf { it.validity().toInt() }
                    ?: 0)

        class AssociatedApplicationIdentifier
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val identifier: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("identifier")
                @ExcludeMissing
                identifier: JsonField<String> = JsonMissing.of()
            ) : this(identifier, mutableMapOf())

            /**
             * The application identifier, composed of your Apple Developer Team ID and the
             * application's bundle identifier, like `ABCDE12345.com.example.app`.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun identifier(): String = identifier.getRequired("identifier")

            /**
             * Returns the raw JSON value of [identifier].
             *
             * Unlike [identifier], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("identifier")
            @ExcludeMissing
            fun _identifier(): JsonField<String> = identifier

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
                 * Returns a mutable builder for constructing an instance of
                 * [AssociatedApplicationIdentifier].
                 *
                 * The following fields are required:
                 * ```java
                 * .identifier()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [AssociatedApplicationIdentifier]. */
            class Builder internal constructor() {

                private var identifier: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(
                    associatedApplicationIdentifier: AssociatedApplicationIdentifier
                ) = apply {
                    identifier = associatedApplicationIdentifier.identifier
                    additionalProperties =
                        associatedApplicationIdentifier.additionalProperties.toMutableMap()
                }

                /**
                 * The application identifier, composed of your Apple Developer Team ID and the
                 * application's bundle identifier, like `ABCDE12345.com.example.app`.
                 */
                fun identifier(identifier: String) = identifier(JsonField.of(identifier))

                /**
                 * Sets [Builder.identifier] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.identifier] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun identifier(identifier: JsonField<String>) = apply {
                    this.identifier = identifier
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [AssociatedApplicationIdentifier].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .identifier()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): AssociatedApplicationIdentifier =
                    AssociatedApplicationIdentifier(
                        checkRequired("identifier", identifier),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws IncreaseInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): AssociatedApplicationIdentifier = apply {
                if (validated) {
                    return@apply
                }

                identifier()
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
            @JvmSynthetic
            internal fun validity(): Int = (if (identifier.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is AssociatedApplicationIdentifier &&
                    identifier == other.identifier &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(identifier, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "AssociatedApplicationIdentifier{identifier=$identifier, additionalProperties=$additionalProperties}"
        }

        class AssociatedStoreIdentifier
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val identifier: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("identifier")
                @ExcludeMissing
                identifier: JsonField<String> = JsonMissing.of()
            ) : this(identifier, mutableMapOf())

            /**
             * The numeric App Store identifier.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun identifier(): String = identifier.getRequired("identifier")

            /**
             * Returns the raw JSON value of [identifier].
             *
             * Unlike [identifier], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("identifier")
            @ExcludeMissing
            fun _identifier(): JsonField<String> = identifier

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
                 * Returns a mutable builder for constructing an instance of
                 * [AssociatedStoreIdentifier].
                 *
                 * The following fields are required:
                 * ```java
                 * .identifier()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [AssociatedStoreIdentifier]. */
            class Builder internal constructor() {

                private var identifier: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(associatedStoreIdentifier: AssociatedStoreIdentifier) = apply {
                    identifier = associatedStoreIdentifier.identifier
                    additionalProperties =
                        associatedStoreIdentifier.additionalProperties.toMutableMap()
                }

                /** The numeric App Store identifier. */
                fun identifier(identifier: String) = identifier(JsonField.of(identifier))

                /**
                 * Sets [Builder.identifier] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.identifier] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun identifier(identifier: JsonField<String>) = apply {
                    this.identifier = identifier
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [AssociatedStoreIdentifier].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .identifier()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): AssociatedStoreIdentifier =
                    AssociatedStoreIdentifier(
                        checkRequired("identifier", identifier),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws IncreaseInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): AssociatedStoreIdentifier = apply {
                if (validated) {
                    return@apply
                }

                identifier()
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
            @JvmSynthetic
            internal fun validity(): Int = (if (identifier.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is AssociatedStoreIdentifier &&
                    identifier == other.identifier &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(identifier, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "AssociatedStoreIdentifier{identifier=$identifier, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ApplePay &&
                associatedApplicationIdentifiers == other.associatedApplicationIdentifiers &&
                associatedStoreIdentifiers == other.associatedStoreIdentifiers &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                associatedApplicationIdentifiers,
                associatedStoreIdentifiers,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ApplePay{associatedApplicationIdentifiers=$associatedApplicationIdentifiers, associatedStoreIdentifiers=$associatedStoreIdentifiers, additionalProperties=$additionalProperties}"
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

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws IncreaseInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Status = apply {
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

            return other is Status && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The Card's text color, specified as an RGB triple. */
    class TextColor
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val blue: JsonField<Long>,
        private val green: JsonField<Long>,
        private val red: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("blue") @ExcludeMissing blue: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("green") @ExcludeMissing green: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("red") @ExcludeMissing red: JsonField<Long> = JsonMissing.of(),
        ) : this(blue, green, red, mutableMapOf())

        /**
         * The value of the blue channel in the RGB color.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun blue(): Long = blue.getRequired("blue")

        /**
         * The value of the green channel in the RGB color.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun green(): Long = green.getRequired("green")

        /**
         * The value of the red channel in the RGB color.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun red(): Long = red.getRequired("red")

        /**
         * Returns the raw JSON value of [blue].
         *
         * Unlike [blue], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("blue") @ExcludeMissing fun _blue(): JsonField<Long> = blue

        /**
         * Returns the raw JSON value of [green].
         *
         * Unlike [green], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("green") @ExcludeMissing fun _green(): JsonField<Long> = green

        /**
         * Returns the raw JSON value of [red].
         *
         * Unlike [red], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("red") @ExcludeMissing fun _red(): JsonField<Long> = red

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
             * Returns a mutable builder for constructing an instance of [TextColor].
             *
             * The following fields are required:
             * ```java
             * .blue()
             * .green()
             * .red()
             * ```
             */
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

            /**
             * Sets [Builder.blue] to an arbitrary JSON value.
             *
             * You should usually call [Builder.blue] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun blue(blue: JsonField<Long>) = apply { this.blue = blue }

            /** The value of the green channel in the RGB color. */
            fun green(green: Long) = green(JsonField.of(green))

            /**
             * Sets [Builder.green] to an arbitrary JSON value.
             *
             * You should usually call [Builder.green] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun green(green: JsonField<Long>) = apply { this.green = green }

            /** The value of the red channel in the RGB color. */
            fun red(red: Long) = red(JsonField.of(red))

            /**
             * Sets [Builder.red] to an arbitrary JSON value.
             *
             * You should usually call [Builder.red] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
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

            /**
             * Returns an immutable instance of [TextColor].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .blue()
             * .green()
             * .red()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): TextColor =
                TextColor(
                    checkRequired("blue", blue),
                    checkRequired("green", green),
                    checkRequired("red", red),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws IncreaseInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): TextColor = apply {
            if (validated) {
                return@apply
            }

            blue()
            green()
            red()
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
        @JvmSynthetic
        internal fun validity(): Int =
            (if (blue.asKnown().isPresent) 1 else 0) +
                (if (green.asKnown().isPresent) 1 else 0) +
                (if (red.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is TextColor &&
                blue == other.blue &&
                green == other.green &&
                red == other.red &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(blue, green, red, additionalProperties) }

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

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws IncreaseInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
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

        return other is DigitalCardProfile &&
            id == other.id &&
            appIconFileId == other.appIconFileId &&
            applePay == other.applePay &&
            backgroundImageFileId == other.backgroundImageFileId &&
            cardDescription == other.cardDescription &&
            contactEmail == other.contactEmail &&
            contactName == other.contactName &&
            contactPhone == other.contactPhone &&
            contactWebsite == other.contactWebsite &&
            createdAt == other.createdAt &&
            description == other.description &&
            idempotencyKey == other.idempotencyKey &&
            status == other.status &&
            textColor == other.textColor &&
            type == other.type &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            appIconFileId,
            applePay,
            backgroundImageFileId,
            cardDescription,
            contactEmail,
            contactName,
            contactPhone,
            contactWebsite,
            createdAt,
            description,
            idempotencyKey,
            status,
            textColor,
            type,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DigitalCardProfile{id=$id, appIconFileId=$appIconFileId, applePay=$applePay, backgroundImageFileId=$backgroundImageFileId, cardDescription=$cardDescription, contactEmail=$contactEmail, contactName=$contactName, contactPhone=$contactPhone, contactWebsite=$contactWebsite, createdAt=$createdAt, description=$description, idempotencyKey=$idempotencyKey, status=$status, textColor=$textColor, type=$type, additionalProperties=$additionalProperties}"
}
