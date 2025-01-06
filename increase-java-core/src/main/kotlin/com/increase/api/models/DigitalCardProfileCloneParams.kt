// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import com.increase.api.core.immutableEmptyMap
import com.increase.api.core.toImmutable
import java.util.Objects
import java.util.Optional

class DigitalCardProfileCloneParams
constructor(
    private val digitalCardProfileId: String,
    private val body: DigitalCardProfileCloneBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    /** The identifier of the Digital Card Profile to clone. */
    fun digitalCardProfileId(): String = digitalCardProfileId

    /** The identifier of the File containing the card's icon image. */
    fun appIconFileId(): Optional<String> = body.appIconFileId()

    /** The identifier of the File containing the card's front image. */
    fun backgroundImageFileId(): Optional<String> = body.backgroundImageFileId()

    /** A user-facing description for the card itself. */
    fun cardDescription(): Optional<String> = body.cardDescription()

    /** An email address the user can contact to receive support for their card. */
    fun contactEmail(): Optional<String> = body.contactEmail()

    /** A phone number the user can contact to receive support for their card. */
    fun contactPhone(): Optional<String> = body.contactPhone()

    /** A website the user can visit to view and receive support for their card. */
    fun contactWebsite(): Optional<String> = body.contactWebsite()

    /** A description you can use to identify the Card Profile. */
    fun description(): Optional<String> = body.description()

    /** A user-facing description for whoever is issuing the card. */
    fun issuerName(): Optional<String> = body.issuerName()

    /** The Card's text color, specified as an RGB triple. The default is white. */
    fun textColor(): Optional<TextColor> = body.textColor()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    @JvmSynthetic internal fun getBody(): DigitalCardProfileCloneBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> digitalCardProfileId
            else -> ""
        }
    }

    @NoAutoDetect
    class DigitalCardProfileCloneBody
    @JsonCreator
    internal constructor(
        @JsonProperty("app_icon_file_id") private val appIconFileId: String?,
        @JsonProperty("background_image_file_id") private val backgroundImageFileId: String?,
        @JsonProperty("card_description") private val cardDescription: String?,
        @JsonProperty("contact_email") private val contactEmail: String?,
        @JsonProperty("contact_phone") private val contactPhone: String?,
        @JsonProperty("contact_website") private val contactWebsite: String?,
        @JsonProperty("description") private val description: String?,
        @JsonProperty("issuer_name") private val issuerName: String?,
        @JsonProperty("text_color") private val textColor: TextColor?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The identifier of the File containing the card's icon image. */
        @JsonProperty("app_icon_file_id")
        fun appIconFileId(): Optional<String> = Optional.ofNullable(appIconFileId)

        /** The identifier of the File containing the card's front image. */
        @JsonProperty("background_image_file_id")
        fun backgroundImageFileId(): Optional<String> = Optional.ofNullable(backgroundImageFileId)

        /** A user-facing description for the card itself. */
        @JsonProperty("card_description")
        fun cardDescription(): Optional<String> = Optional.ofNullable(cardDescription)

        /** An email address the user can contact to receive support for their card. */
        @JsonProperty("contact_email")
        fun contactEmail(): Optional<String> = Optional.ofNullable(contactEmail)

        /** A phone number the user can contact to receive support for their card. */
        @JsonProperty("contact_phone")
        fun contactPhone(): Optional<String> = Optional.ofNullable(contactPhone)

        /** A website the user can visit to view and receive support for their card. */
        @JsonProperty("contact_website")
        fun contactWebsite(): Optional<String> = Optional.ofNullable(contactWebsite)

        /** A description you can use to identify the Card Profile. */
        @JsonProperty("description")
        fun description(): Optional<String> = Optional.ofNullable(description)

        /** A user-facing description for whoever is issuing the card. */
        @JsonProperty("issuer_name")
        fun issuerName(): Optional<String> = Optional.ofNullable(issuerName)

        /** The Card's text color, specified as an RGB triple. The default is white. */
        @JsonProperty("text_color")
        fun textColor(): Optional<TextColor> = Optional.ofNullable(textColor)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var appIconFileId: String? = null
            private var backgroundImageFileId: String? = null
            private var cardDescription: String? = null
            private var contactEmail: String? = null
            private var contactPhone: String? = null
            private var contactWebsite: String? = null
            private var description: String? = null
            private var issuerName: String? = null
            private var textColor: TextColor? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(digitalCardProfileCloneBody: DigitalCardProfileCloneBody) = apply {
                appIconFileId = digitalCardProfileCloneBody.appIconFileId
                backgroundImageFileId = digitalCardProfileCloneBody.backgroundImageFileId
                cardDescription = digitalCardProfileCloneBody.cardDescription
                contactEmail = digitalCardProfileCloneBody.contactEmail
                contactPhone = digitalCardProfileCloneBody.contactPhone
                contactWebsite = digitalCardProfileCloneBody.contactWebsite
                description = digitalCardProfileCloneBody.description
                issuerName = digitalCardProfileCloneBody.issuerName
                textColor = digitalCardProfileCloneBody.textColor
                additionalProperties =
                    digitalCardProfileCloneBody.additionalProperties.toMutableMap()
            }

            /** The identifier of the File containing the card's icon image. */
            fun appIconFileId(appIconFileId: String?) = apply { this.appIconFileId = appIconFileId }

            /** The identifier of the File containing the card's icon image. */
            fun appIconFileId(appIconFileId: Optional<String>) =
                appIconFileId(appIconFileId.orElse(null))

            /** The identifier of the File containing the card's front image. */
            fun backgroundImageFileId(backgroundImageFileId: String?) = apply {
                this.backgroundImageFileId = backgroundImageFileId
            }

            /** The identifier of the File containing the card's front image. */
            fun backgroundImageFileId(backgroundImageFileId: Optional<String>) =
                backgroundImageFileId(backgroundImageFileId.orElse(null))

            /** A user-facing description for the card itself. */
            fun cardDescription(cardDescription: String?) = apply {
                this.cardDescription = cardDescription
            }

            /** A user-facing description for the card itself. */
            fun cardDescription(cardDescription: Optional<String>) =
                cardDescription(cardDescription.orElse(null))

            /** An email address the user can contact to receive support for their card. */
            fun contactEmail(contactEmail: String?) = apply { this.contactEmail = contactEmail }

            /** An email address the user can contact to receive support for their card. */
            fun contactEmail(contactEmail: Optional<String>) =
                contactEmail(contactEmail.orElse(null))

            /** A phone number the user can contact to receive support for their card. */
            fun contactPhone(contactPhone: String?) = apply { this.contactPhone = contactPhone }

            /** A phone number the user can contact to receive support for their card. */
            fun contactPhone(contactPhone: Optional<String>) =
                contactPhone(contactPhone.orElse(null))

            /** A website the user can visit to view and receive support for their card. */
            fun contactWebsite(contactWebsite: String?) = apply {
                this.contactWebsite = contactWebsite
            }

            /** A website the user can visit to view and receive support for their card. */
            fun contactWebsite(contactWebsite: Optional<String>) =
                contactWebsite(contactWebsite.orElse(null))

            /** A description you can use to identify the Card Profile. */
            fun description(description: String?) = apply { this.description = description }

            /** A description you can use to identify the Card Profile. */
            fun description(description: Optional<String>) = description(description.orElse(null))

            /** A user-facing description for whoever is issuing the card. */
            fun issuerName(issuerName: String?) = apply { this.issuerName = issuerName }

            /** A user-facing description for whoever is issuing the card. */
            fun issuerName(issuerName: Optional<String>) = issuerName(issuerName.orElse(null))

            /** The Card's text color, specified as an RGB triple. The default is white. */
            fun textColor(textColor: TextColor?) = apply { this.textColor = textColor }

            /** The Card's text color, specified as an RGB triple. The default is white. */
            fun textColor(textColor: Optional<TextColor>) = textColor(textColor.orElse(null))

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

            fun build(): DigitalCardProfileCloneBody =
                DigitalCardProfileCloneBody(
                    appIconFileId,
                    backgroundImageFileId,
                    cardDescription,
                    contactEmail,
                    contactPhone,
                    contactWebsite,
                    description,
                    issuerName,
                    textColor,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is DigitalCardProfileCloneBody && appIconFileId == other.appIconFileId && backgroundImageFileId == other.backgroundImageFileId && cardDescription == other.cardDescription && contactEmail == other.contactEmail && contactPhone == other.contactPhone && contactWebsite == other.contactWebsite && description == other.description && issuerName == other.issuerName && textColor == other.textColor && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(appIconFileId, backgroundImageFileId, cardDescription, contactEmail, contactPhone, contactWebsite, description, issuerName, textColor, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "DigitalCardProfileCloneBody{appIconFileId=$appIconFileId, backgroundImageFileId=$backgroundImageFileId, cardDescription=$cardDescription, contactEmail=$contactEmail, contactPhone=$contactPhone, contactWebsite=$contactWebsite, description=$description, issuerName=$issuerName, textColor=$textColor, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var digitalCardProfileId: String? = null
        private var body: DigitalCardProfileCloneBody.Builder =
            DigitalCardProfileCloneBody.builder()
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
        fun digitalCardProfileId(digitalCardProfileId: String) = apply {
            this.digitalCardProfileId = digitalCardProfileId
        }

        /** The identifier of the File containing the card's icon image. */
        fun appIconFileId(appIconFileId: String?) = apply { body.appIconFileId(appIconFileId) }

        /** The identifier of the File containing the card's icon image. */
        fun appIconFileId(appIconFileId: Optional<String>) =
            appIconFileId(appIconFileId.orElse(null))

        /** The identifier of the File containing the card's front image. */
        fun backgroundImageFileId(backgroundImageFileId: String?) = apply {
            body.backgroundImageFileId(backgroundImageFileId)
        }

        /** The identifier of the File containing the card's front image. */
        fun backgroundImageFileId(backgroundImageFileId: Optional<String>) =
            backgroundImageFileId(backgroundImageFileId.orElse(null))

        /** A user-facing description for the card itself. */
        fun cardDescription(cardDescription: String?) = apply {
            body.cardDescription(cardDescription)
        }

        /** A user-facing description for the card itself. */
        fun cardDescription(cardDescription: Optional<String>) =
            cardDescription(cardDescription.orElse(null))

        /** An email address the user can contact to receive support for their card. */
        fun contactEmail(contactEmail: String?) = apply { body.contactEmail(contactEmail) }

        /** An email address the user can contact to receive support for their card. */
        fun contactEmail(contactEmail: Optional<String>) = contactEmail(contactEmail.orElse(null))

        /** A phone number the user can contact to receive support for their card. */
        fun contactPhone(contactPhone: String?) = apply { body.contactPhone(contactPhone) }

        /** A phone number the user can contact to receive support for their card. */
        fun contactPhone(contactPhone: Optional<String>) = contactPhone(contactPhone.orElse(null))

        /** A website the user can visit to view and receive support for their card. */
        fun contactWebsite(contactWebsite: String?) = apply { body.contactWebsite(contactWebsite) }

        /** A website the user can visit to view and receive support for their card. */
        fun contactWebsite(contactWebsite: Optional<String>) =
            contactWebsite(contactWebsite.orElse(null))

        /** A description you can use to identify the Card Profile. */
        fun description(description: String?) = apply { body.description(description) }

        /** A description you can use to identify the Card Profile. */
        fun description(description: Optional<String>) = description(description.orElse(null))

        /** A user-facing description for whoever is issuing the card. */
        fun issuerName(issuerName: String?) = apply { body.issuerName(issuerName) }

        /** A user-facing description for whoever is issuing the card. */
        fun issuerName(issuerName: Optional<String>) = issuerName(issuerName.orElse(null))

        /** The Card's text color, specified as an RGB triple. The default is white. */
        fun textColor(textColor: TextColor?) = apply { body.textColor(textColor) }

        /** The Card's text color, specified as an RGB triple. The default is white. */
        fun textColor(textColor: Optional<TextColor>) = textColor(textColor.orElse(null))

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

        fun build(): DigitalCardProfileCloneParams =
            DigitalCardProfileCloneParams(
                checkNotNull(digitalCardProfileId) {
                    "`digitalCardProfileId` is required but was not set"
                },
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    /** The Card's text color, specified as an RGB triple. The default is white. */
    @NoAutoDetect
    class TextColor
    @JsonCreator
    private constructor(
        @JsonProperty("blue") private val blue: Long,
        @JsonProperty("green") private val green: Long,
        @JsonProperty("red") private val red: Long,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The value of the blue channel in the RGB color. */
        @JsonProperty("blue") fun blue(): Long = blue

        /** The value of the green channel in the RGB color. */
        @JsonProperty("green") fun green(): Long = green

        /** The value of the red channel in the RGB color. */
        @JsonProperty("red") fun red(): Long = red

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var blue: Long? = null
            private var green: Long? = null
            private var red: Long? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(textColor: TextColor) = apply {
                blue = textColor.blue
                green = textColor.green
                red = textColor.red
                additionalProperties = textColor.additionalProperties.toMutableMap()
            }

            /** The value of the blue channel in the RGB color. */
            fun blue(blue: Long) = apply { this.blue = blue }

            /** The value of the green channel in the RGB color. */
            fun green(green: Long) = apply { this.green = green }

            /** The value of the red channel in the RGB color. */
            fun red(red: Long) = apply { this.red = red }

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
                    checkNotNull(blue) { "`blue` is required but was not set" },
                    checkNotNull(green) { "`green` is required but was not set" },
                    checkNotNull(red) { "`red` is required but was not set" },
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DigitalCardProfileCloneParams && digitalCardProfileId == other.digitalCardProfileId && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(digitalCardProfileId, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "DigitalCardProfileCloneParams{digitalCardProfileId=$digitalCardProfileId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
