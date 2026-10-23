// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.digitalcardprofiles

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.Params
import com.increase.api.core.checkKnown
import com.increase.api.core.checkRequired
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import com.increase.api.core.toImmutable
import com.increase.api.errors.IncreaseInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Clone a Digital Card Profile */
class DigitalCardProfileCloneParams
private constructor(
    private val digitalCardProfileId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** The identifier of the Digital Card Profile to clone. */
    fun digitalCardProfileId(): Optional<String> = Optional.ofNullable(digitalCardProfileId)

    /**
     * The identifier of the File containing the card's icon image.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun appIconFileId(): Optional<String> = body.appIconFileId()

    /**
     * Apple Pay specific settings for the Card Profile. Each list you leave out is copied from the
     * original Card Profile.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun applePay(): Optional<ApplePay> = body.applePay()

    /**
     * The identifier of the File containing the card's front image.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun backgroundImageFileId(): Optional<String> = body.backgroundImageFileId()

    /**
     * A user-facing description for the card itself.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cardDescription(): Optional<String> = body.cardDescription()

    /**
     * An email address the user can contact to receive support for their card.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun contactEmail(): Optional<String> = body.contactEmail()

    /**
     * The name of your company or card program, shown to the user as who to contact for support
     * with their card.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun contactName(): Optional<String> = body.contactName()

    /**
     * A phone number the user can contact to receive support for their card.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun contactPhone(): Optional<String> = body.contactPhone()

    /**
     * A website the user can visit to view and receive support for their card.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun contactWebsite(): Optional<String> = body.contactWebsite()

    /**
     * A description you can use to identify the Card Profile.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = body.description()

    /**
     * The Card's text color, specified as an RGB triple. The default is white.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun textColor(): Optional<TextColor> = body.textColor()

    /**
     * Returns the raw JSON value of [appIconFileId].
     *
     * Unlike [appIconFileId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _appIconFileId(): JsonField<String> = body._appIconFileId()

    /**
     * Returns the raw JSON value of [applePay].
     *
     * Unlike [applePay], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _applePay(): JsonField<ApplePay> = body._applePay()

    /**
     * Returns the raw JSON value of [backgroundImageFileId].
     *
     * Unlike [backgroundImageFileId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _backgroundImageFileId(): JsonField<String> = body._backgroundImageFileId()

    /**
     * Returns the raw JSON value of [cardDescription].
     *
     * Unlike [cardDescription], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _cardDescription(): JsonField<String> = body._cardDescription()

    /**
     * Returns the raw JSON value of [contactEmail].
     *
     * Unlike [contactEmail], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _contactEmail(): JsonField<String> = body._contactEmail()

    /**
     * Returns the raw JSON value of [contactName].
     *
     * Unlike [contactName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _contactName(): JsonField<String> = body._contactName()

    /**
     * Returns the raw JSON value of [contactPhone].
     *
     * Unlike [contactPhone], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _contactPhone(): JsonField<String> = body._contactPhone()

    /**
     * Returns the raw JSON value of [contactWebsite].
     *
     * Unlike [contactWebsite], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _contactWebsite(): JsonField<String> = body._contactWebsite()

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _description(): JsonField<String> = body._description()

    /**
     * Returns the raw JSON value of [textColor].
     *
     * Unlike [textColor], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _textColor(): JsonField<TextColor> = body._textColor()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): DigitalCardProfileCloneParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [DigitalCardProfileCloneParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DigitalCardProfileCloneParams]. */
    class Builder internal constructor() {

        private var digitalCardProfileId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(digitalCardProfileCloneParams: DigitalCardProfileCloneParams) = apply {
            digitalCardProfileId = digitalCardProfileCloneParams.digitalCardProfileId
            body = digitalCardProfileCloneParams.body.toBuilder()
            additionalHeaders = digitalCardProfileCloneParams.additionalHeaders.toBuilder()
            additionalQueryParams = digitalCardProfileCloneParams.additionalQueryParams.toBuilder()
        }

        /** The identifier of the Digital Card Profile to clone. */
        fun digitalCardProfileId(digitalCardProfileId: String?) = apply {
            this.digitalCardProfileId = digitalCardProfileId
        }

        /**
         * Alias for calling [Builder.digitalCardProfileId] with
         * `digitalCardProfileId.orElse(null)`.
         */
        fun digitalCardProfileId(digitalCardProfileId: Optional<String>) =
            digitalCardProfileId(digitalCardProfileId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [appIconFileId]
         * - [applePay]
         * - [backgroundImageFileId]
         * - [cardDescription]
         * - [contactEmail]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The identifier of the File containing the card's icon image. */
        fun appIconFileId(appIconFileId: String) = apply { body.appIconFileId(appIconFileId) }

        /**
         * Sets [Builder.appIconFileId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.appIconFileId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun appIconFileId(appIconFileId: JsonField<String>) = apply {
            body.appIconFileId(appIconFileId)
        }

        /**
         * Apple Pay specific settings for the Card Profile. Each list you leave out is copied from
         * the original Card Profile.
         */
        fun applePay(applePay: ApplePay) = apply { body.applePay(applePay) }

        /**
         * Sets [Builder.applePay] to an arbitrary JSON value.
         *
         * You should usually call [Builder.applePay] with a well-typed [ApplePay] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun applePay(applePay: JsonField<ApplePay>) = apply { body.applePay(applePay) }

        /** The identifier of the File containing the card's front image. */
        fun backgroundImageFileId(backgroundImageFileId: String) = apply {
            body.backgroundImageFileId(backgroundImageFileId)
        }

        /**
         * Sets [Builder.backgroundImageFileId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.backgroundImageFileId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun backgroundImageFileId(backgroundImageFileId: JsonField<String>) = apply {
            body.backgroundImageFileId(backgroundImageFileId)
        }

        /** A user-facing description for the card itself. */
        fun cardDescription(cardDescription: String) = apply {
            body.cardDescription(cardDescription)
        }

        /**
         * Sets [Builder.cardDescription] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cardDescription] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun cardDescription(cardDescription: JsonField<String>) = apply {
            body.cardDescription(cardDescription)
        }

        /** An email address the user can contact to receive support for their card. */
        fun contactEmail(contactEmail: String) = apply { body.contactEmail(contactEmail) }

        /**
         * Sets [Builder.contactEmail] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contactEmail] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun contactEmail(contactEmail: JsonField<String>) = apply {
            body.contactEmail(contactEmail)
        }

        /**
         * The name of your company or card program, shown to the user as who to contact for support
         * with their card.
         */
        fun contactName(contactName: String) = apply { body.contactName(contactName) }

        /**
         * Sets [Builder.contactName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contactName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun contactName(contactName: JsonField<String>) = apply { body.contactName(contactName) }

        /** A phone number the user can contact to receive support for their card. */
        fun contactPhone(contactPhone: String) = apply { body.contactPhone(contactPhone) }

        /**
         * Sets [Builder.contactPhone] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contactPhone] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun contactPhone(contactPhone: JsonField<String>) = apply {
            body.contactPhone(contactPhone)
        }

        /** A website the user can visit to view and receive support for their card. */
        fun contactWebsite(contactWebsite: String) = apply { body.contactWebsite(contactWebsite) }

        /**
         * Sets [Builder.contactWebsite] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contactWebsite] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun contactWebsite(contactWebsite: JsonField<String>) = apply {
            body.contactWebsite(contactWebsite)
        }

        /** A description you can use to identify the Card Profile. */
        fun description(description: String) = apply { body.description(description) }

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        /** The Card's text color, specified as an RGB triple. The default is white. */
        fun textColor(textColor: TextColor) = apply { body.textColor(textColor) }

        /**
         * Sets [Builder.textColor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.textColor] with a well-typed [TextColor] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun textColor(textColor: JsonField<TextColor>) = apply { body.textColor(textColor) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [DigitalCardProfileCloneParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): DigitalCardProfileCloneParams =
            DigitalCardProfileCloneParams(
                digitalCardProfileId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> digitalCardProfileId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val appIconFileId: JsonField<String>,
        private val applePay: JsonField<ApplePay>,
        private val backgroundImageFileId: JsonField<String>,
        private val cardDescription: JsonField<String>,
        private val contactEmail: JsonField<String>,
        private val contactName: JsonField<String>,
        private val contactPhone: JsonField<String>,
        private val contactWebsite: JsonField<String>,
        private val description: JsonField<String>,
        private val textColor: JsonField<TextColor>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("app_icon_file_id")
            @ExcludeMissing
            appIconFileId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("apple_pay")
            @ExcludeMissing
            applePay: JsonField<ApplePay> = JsonMissing.of(),
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
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("text_color")
            @ExcludeMissing
            textColor: JsonField<TextColor> = JsonMissing.of(),
        ) : this(
            appIconFileId,
            applePay,
            backgroundImageFileId,
            cardDescription,
            contactEmail,
            contactName,
            contactPhone,
            contactWebsite,
            description,
            textColor,
            mutableMapOf(),
        )

        /**
         * The identifier of the File containing the card's icon image.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun appIconFileId(): Optional<String> = appIconFileId.getOptional("app_icon_file_id")

        /**
         * Apple Pay specific settings for the Card Profile. Each list you leave out is copied from
         * the original Card Profile.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun applePay(): Optional<ApplePay> = applePay.getOptional("apple_pay")

        /**
         * The identifier of the File containing the card's front image.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun backgroundImageFileId(): Optional<String> =
            backgroundImageFileId.getOptional("background_image_file_id")

        /**
         * A user-facing description for the card itself.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun cardDescription(): Optional<String> = cardDescription.getOptional("card_description")

        /**
         * An email address the user can contact to receive support for their card.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun contactEmail(): Optional<String> = contactEmail.getOptional("contact_email")

        /**
         * The name of your company or card program, shown to the user as who to contact for support
         * with their card.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun contactName(): Optional<String> = contactName.getOptional("contact_name")

        /**
         * A phone number the user can contact to receive support for their card.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun contactPhone(): Optional<String> = contactPhone.getOptional("contact_phone")

        /**
         * A website the user can visit to view and receive support for their card.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun contactWebsite(): Optional<String> = contactWebsite.getOptional("contact_website")

        /**
         * A description you can use to identify the Card Profile.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * The Card's text color, specified as an RGB triple. The default is white.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun textColor(): Optional<TextColor> = textColor.getOptional("text_color")

        /**
         * Returns the raw JSON value of [appIconFileId].
         *
         * Unlike [appIconFileId], this method doesn't throw if the JSON field has an unexpected
         * type.
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
         * Unlike [backgroundImageFileId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("background_image_file_id")
        @ExcludeMissing
        fun _backgroundImageFileId(): JsonField<String> = backgroundImageFileId

        /**
         * Returns the raw JSON value of [cardDescription].
         *
         * Unlike [cardDescription], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("card_description")
        @ExcludeMissing
        fun _cardDescription(): JsonField<String> = cardDescription

        /**
         * Returns the raw JSON value of [contactEmail].
         *
         * Unlike [contactEmail], this method doesn't throw if the JSON field has an unexpected
         * type.
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
         * Unlike [contactPhone], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("contact_phone")
        @ExcludeMissing
        fun _contactPhone(): JsonField<String> = contactPhone

        /**
         * Returns the raw JSON value of [contactWebsite].
         *
         * Unlike [contactWebsite], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("contact_website")
        @ExcludeMissing
        fun _contactWebsite(): JsonField<String> = contactWebsite

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [textColor].
         *
         * Unlike [textColor], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("text_color")
        @ExcludeMissing
        fun _textColor(): JsonField<TextColor> = textColor

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var appIconFileId: JsonField<String> = JsonMissing.of()
            private var applePay: JsonField<ApplePay> = JsonMissing.of()
            private var backgroundImageFileId: JsonField<String> = JsonMissing.of()
            private var cardDescription: JsonField<String> = JsonMissing.of()
            private var contactEmail: JsonField<String> = JsonMissing.of()
            private var contactName: JsonField<String> = JsonMissing.of()
            private var contactPhone: JsonField<String> = JsonMissing.of()
            private var contactWebsite: JsonField<String> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var textColor: JsonField<TextColor> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                appIconFileId = body.appIconFileId
                applePay = body.applePay
                backgroundImageFileId = body.backgroundImageFileId
                cardDescription = body.cardDescription
                contactEmail = body.contactEmail
                contactName = body.contactName
                contactPhone = body.contactPhone
                contactWebsite = body.contactWebsite
                description = body.description
                textColor = body.textColor
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The identifier of the File containing the card's icon image. */
            fun appIconFileId(appIconFileId: String) = appIconFileId(JsonField.of(appIconFileId))

            /**
             * Sets [Builder.appIconFileId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.appIconFileId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun appIconFileId(appIconFileId: JsonField<String>) = apply {
                this.appIconFileId = appIconFileId
            }

            /**
             * Apple Pay specific settings for the Card Profile. Each list you leave out is copied
             * from the original Card Profile.
             */
            fun applePay(applePay: ApplePay) = applePay(JsonField.of(applePay))

            /**
             * Sets [Builder.applePay] to an arbitrary JSON value.
             *
             * You should usually call [Builder.applePay] with a well-typed [ApplePay] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun applePay(applePay: JsonField<ApplePay>) = apply { this.applePay = applePay }

            /** The identifier of the File containing the card's front image. */
            fun backgroundImageFileId(backgroundImageFileId: String) =
                backgroundImageFileId(JsonField.of(backgroundImageFileId))

            /**
             * Sets [Builder.backgroundImageFileId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.backgroundImageFileId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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
            fun contactEmail(contactEmail: String) = contactEmail(JsonField.of(contactEmail))

            /**
             * Sets [Builder.contactEmail] to an arbitrary JSON value.
             *
             * You should usually call [Builder.contactEmail] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun contactEmail(contactEmail: JsonField<String>) = apply {
                this.contactEmail = contactEmail
            }

            /**
             * The name of your company or card program, shown to the user as who to contact for
             * support with their card.
             */
            fun contactName(contactName: String) = contactName(JsonField.of(contactName))

            /**
             * Sets [Builder.contactName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.contactName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun contactName(contactName: JsonField<String>) = apply {
                this.contactName = contactName
            }

            /** A phone number the user can contact to receive support for their card. */
            fun contactPhone(contactPhone: String) = contactPhone(JsonField.of(contactPhone))

            /**
             * Sets [Builder.contactPhone] to an arbitrary JSON value.
             *
             * You should usually call [Builder.contactPhone] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun contactPhone(contactPhone: JsonField<String>) = apply {
                this.contactPhone = contactPhone
            }

            /** A website the user can visit to view and receive support for their card. */
            fun contactWebsite(contactWebsite: String) =
                contactWebsite(JsonField.of(contactWebsite))

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

            /** A description you can use to identify the Card Profile. */
            fun description(description: String) = description(JsonField.of(description))

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /** The Card's text color, specified as an RGB triple. The default is white. */
            fun textColor(textColor: TextColor) = textColor(JsonField.of(textColor))

            /**
             * Sets [Builder.textColor] to an arbitrary JSON value.
             *
             * You should usually call [Builder.textColor] with a well-typed [TextColor] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun textColor(textColor: JsonField<TextColor>) = apply { this.textColor = textColor }

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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Body =
                Body(
                    appIconFileId,
                    applePay,
                    backgroundImageFileId,
                    cardDescription,
                    contactEmail,
                    contactName,
                    contactPhone,
                    contactWebsite,
                    description,
                    textColor,
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
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            appIconFileId()
            applePay().ifPresent { it.validate() }
            backgroundImageFileId()
            cardDescription()
            contactEmail()
            contactName()
            contactPhone()
            contactWebsite()
            description()
            textColor().ifPresent { it.validate() }
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
            (if (appIconFileId.asKnown().isPresent) 1 else 0) +
                (applePay.asKnown().getOrNull()?.validity() ?: 0) +
                (if (backgroundImageFileId.asKnown().isPresent) 1 else 0) +
                (if (cardDescription.asKnown().isPresent) 1 else 0) +
                (if (contactEmail.asKnown().isPresent) 1 else 0) +
                (if (contactName.asKnown().isPresent) 1 else 0) +
                (if (contactPhone.asKnown().isPresent) 1 else 0) +
                (if (contactWebsite.asKnown().isPresent) 1 else 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (textColor.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                appIconFileId == other.appIconFileId &&
                applePay == other.applePay &&
                backgroundImageFileId == other.backgroundImageFileId &&
                cardDescription == other.cardDescription &&
                contactEmail == other.contactEmail &&
                contactName == other.contactName &&
                contactPhone == other.contactPhone &&
                contactWebsite == other.contactWebsite &&
                description == other.description &&
                textColor == other.textColor &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                appIconFileId,
                applePay,
                backgroundImageFileId,
                cardDescription,
                contactEmail,
                contactName,
                contactPhone,
                contactWebsite,
                description,
                textColor,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{appIconFileId=$appIconFileId, applePay=$applePay, backgroundImageFileId=$backgroundImageFileId, cardDescription=$cardDescription, contactEmail=$contactEmail, contactName=$contactName, contactPhone=$contactPhone, contactWebsite=$contactWebsite, description=$description, textColor=$textColor, additionalProperties=$additionalProperties}"
    }

    /**
     * Apple Pay specific settings for the Card Profile. Each list you leave out is copied from the
     * original Card Profile.
     */
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
         * The applications to associate with cards using this Card Profile.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun associatedApplicationIdentifiers(): Optional<List<AssociatedApplicationIdentifier>> =
            associatedApplicationIdentifiers.getOptional("associated_application_identifiers")

        /**
         * The App Store listings of the applications to associate with cards using this Card
         * Profile.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun associatedStoreIdentifiers(): Optional<List<AssociatedStoreIdentifier>> =
            associatedStoreIdentifiers.getOptional("associated_store_identifiers")

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

            /** Returns a mutable builder for constructing an instance of [ApplePay]. */
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

            /** The applications to associate with cards using this Card Profile. */
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
             * The App Store listings of the applications to associate with cards using this Card
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
             */
            fun build(): ApplePay =
                ApplePay(
                    (associatedApplicationIdentifiers ?: JsonMissing.of()).map { it.toImmutable() },
                    (associatedStoreIdentifiers ?: JsonMissing.of()).map { it.toImmutable() },
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

            associatedApplicationIdentifiers().ifPresent { it.forEach { it.validate() } }
            associatedStoreIdentifiers().ifPresent { it.forEach { it.validate() } }
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

    /** The Card's text color, specified as an RGB triple. The default is white. */
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DigitalCardProfileCloneParams &&
            digitalCardProfileId == other.digitalCardProfileId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(digitalCardProfileId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "DigitalCardProfileCloneParams{digitalCardProfileId=$digitalCardProfileId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
