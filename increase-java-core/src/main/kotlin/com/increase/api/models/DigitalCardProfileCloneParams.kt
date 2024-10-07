// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.toUnmodifiable
import com.increase.api.models.*
import java.util.Objects
import java.util.Optional

class DigitalCardProfileCloneParams
constructor(
    private val digitalCardProfileId: String,
    private val appIconFileId: String?,
    private val backgroundImageFileId: String?,
    private val cardDescription: String?,
    private val contactEmail: String?,
    private val contactPhone: String?,
    private val contactWebsite: String?,
    private val description: String?,
    private val issuerName: String?,
    private val textColor: TextColor?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun digitalCardProfileId(): String = digitalCardProfileId

    fun appIconFileId(): Optional<String> = Optional.ofNullable(appIconFileId)

    fun backgroundImageFileId(): Optional<String> = Optional.ofNullable(backgroundImageFileId)

    fun cardDescription(): Optional<String> = Optional.ofNullable(cardDescription)

    fun contactEmail(): Optional<String> = Optional.ofNullable(contactEmail)

    fun contactPhone(): Optional<String> = Optional.ofNullable(contactPhone)

    fun contactWebsite(): Optional<String> = Optional.ofNullable(contactWebsite)

    fun description(): Optional<String> = Optional.ofNullable(description)

    fun issuerName(): Optional<String> = Optional.ofNullable(issuerName)

    fun textColor(): Optional<TextColor> = Optional.ofNullable(textColor)

    @JvmSynthetic
    internal fun getBody(): DigitalCardProfileCloneBody {
        return DigitalCardProfileCloneBody(
            appIconFileId,
            backgroundImageFileId,
            cardDescription,
            contactEmail,
            contactPhone,
            contactWebsite,
            description,
            issuerName,
            textColor,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> digitalCardProfileId
            else -> ""
        }
    }

    @JsonDeserialize(builder = DigitalCardProfileCloneBody.Builder::class)
    @NoAutoDetect
    class DigitalCardProfileCloneBody
    internal constructor(
        private val appIconFileId: String?,
        private val backgroundImageFileId: String?,
        private val cardDescription: String?,
        private val contactEmail: String?,
        private val contactPhone: String?,
        private val contactWebsite: String?,
        private val description: String?,
        private val issuerName: String?,
        private val textColor: TextColor?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The identifier of the File containing the card's icon image. */
        @JsonProperty("app_icon_file_id") fun appIconFileId(): String? = appIconFileId

        /** The identifier of the File containing the card's front image. */
        @JsonProperty("background_image_file_id")
        fun backgroundImageFileId(): String? = backgroundImageFileId

        /** A user-facing description for the card itself. */
        @JsonProperty("card_description") fun cardDescription(): String? = cardDescription

        /** An email address the user can contact to receive support for their card. */
        @JsonProperty("contact_email") fun contactEmail(): String? = contactEmail

        /** A phone number the user can contact to receive support for their card. */
        @JsonProperty("contact_phone") fun contactPhone(): String? = contactPhone

        /** A website the user can visit to view and receive support for their card. */
        @JsonProperty("contact_website") fun contactWebsite(): String? = contactWebsite

        /** A description you can use to identify the Card Profile. */
        @JsonProperty("description") fun description(): String? = description

        /** A user-facing description for whoever is issuing the card. */
        @JsonProperty("issuer_name") fun issuerName(): String? = issuerName

        /** The Card's text color, specified as an RGB triple. The default is white. */
        @JsonProperty("text_color") fun textColor(): TextColor? = textColor

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
                this.appIconFileId = digitalCardProfileCloneBody.appIconFileId
                this.backgroundImageFileId = digitalCardProfileCloneBody.backgroundImageFileId
                this.cardDescription = digitalCardProfileCloneBody.cardDescription
                this.contactEmail = digitalCardProfileCloneBody.contactEmail
                this.contactPhone = digitalCardProfileCloneBody.contactPhone
                this.contactWebsite = digitalCardProfileCloneBody.contactWebsite
                this.description = digitalCardProfileCloneBody.description
                this.issuerName = digitalCardProfileCloneBody.issuerName
                this.textColor = digitalCardProfileCloneBody.textColor
                additionalProperties(digitalCardProfileCloneBody.additionalProperties)
            }

            /** The identifier of the File containing the card's icon image. */
            @JsonProperty("app_icon_file_id")
            fun appIconFileId(appIconFileId: String) = apply { this.appIconFileId = appIconFileId }

            /** The identifier of the File containing the card's front image. */
            @JsonProperty("background_image_file_id")
            fun backgroundImageFileId(backgroundImageFileId: String) = apply {
                this.backgroundImageFileId = backgroundImageFileId
            }

            /** A user-facing description for the card itself. */
            @JsonProperty("card_description")
            fun cardDescription(cardDescription: String) = apply {
                this.cardDescription = cardDescription
            }

            /** An email address the user can contact to receive support for their card. */
            @JsonProperty("contact_email")
            fun contactEmail(contactEmail: String) = apply { this.contactEmail = contactEmail }

            /** A phone number the user can contact to receive support for their card. */
            @JsonProperty("contact_phone")
            fun contactPhone(contactPhone: String) = apply { this.contactPhone = contactPhone }

            /** A website the user can visit to view and receive support for their card. */
            @JsonProperty("contact_website")
            fun contactWebsite(contactWebsite: String) = apply {
                this.contactWebsite = contactWebsite
            }

            /** A description you can use to identify the Card Profile. */
            @JsonProperty("description")
            fun description(description: String) = apply { this.description = description }

            /** A user-facing description for whoever is issuing the card. */
            @JsonProperty("issuer_name")
            fun issuerName(issuerName: String) = apply { this.issuerName = issuerName }

            /** The Card's text color, specified as an RGB triple. The default is white. */
            @JsonProperty("text_color")
            fun textColor(textColor: TextColor) = apply { this.textColor = textColor }

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
                    additionalProperties.toUnmodifiable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is DigitalCardProfileCloneBody && this.appIconFileId == other.appIconFileId && this.backgroundImageFileId == other.backgroundImageFileId && this.cardDescription == other.cardDescription && this.contactEmail == other.contactEmail && this.contactPhone == other.contactPhone && this.contactWebsite == other.contactWebsite && this.description == other.description && this.issuerName == other.issuerName && this.textColor == other.textColor && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(appIconFileId, backgroundImageFileId, cardDescription, contactEmail, contactPhone, contactWebsite, description, issuerName, textColor, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "DigitalCardProfileCloneBody{appIconFileId=$appIconFileId, backgroundImageFileId=$backgroundImageFileId, cardDescription=$cardDescription, contactEmail=$contactEmail, contactPhone=$contactPhone, contactWebsite=$contactWebsite, description=$description, issuerName=$issuerName, textColor=$textColor, additionalProperties=$additionalProperties}"
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DigitalCardProfileCloneParams && this.digitalCardProfileId == other.digitalCardProfileId && this.appIconFileId == other.appIconFileId && this.backgroundImageFileId == other.backgroundImageFileId && this.cardDescription == other.cardDescription && this.contactEmail == other.contactEmail && this.contactPhone == other.contactPhone && this.contactWebsite == other.contactWebsite && this.description == other.description && this.issuerName == other.issuerName && this.textColor == other.textColor && this.additionalQueryParams == other.additionalQueryParams && this.additionalHeaders == other.additionalHeaders && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(digitalCardProfileId, appIconFileId, backgroundImageFileId, cardDescription, contactEmail, contactPhone, contactWebsite, description, issuerName, textColor, additionalQueryParams, additionalHeaders, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "DigitalCardProfileCloneParams{digitalCardProfileId=$digitalCardProfileId, appIconFileId=$appIconFileId, backgroundImageFileId=$backgroundImageFileId, cardDescription=$cardDescription, contactEmail=$contactEmail, contactPhone=$contactPhone, contactWebsite=$contactWebsite, description=$description, issuerName=$issuerName, textColor=$textColor, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var digitalCardProfileId: String? = null
        private var appIconFileId: String? = null
        private var backgroundImageFileId: String? = null
        private var cardDescription: String? = null
        private var contactEmail: String? = null
        private var contactPhone: String? = null
        private var contactWebsite: String? = null
        private var description: String? = null
        private var issuerName: String? = null
        private var textColor: TextColor? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(digitalCardProfileCloneParams: DigitalCardProfileCloneParams) = apply {
            this.digitalCardProfileId = digitalCardProfileCloneParams.digitalCardProfileId
            this.appIconFileId = digitalCardProfileCloneParams.appIconFileId
            this.backgroundImageFileId = digitalCardProfileCloneParams.backgroundImageFileId
            this.cardDescription = digitalCardProfileCloneParams.cardDescription
            this.contactEmail = digitalCardProfileCloneParams.contactEmail
            this.contactPhone = digitalCardProfileCloneParams.contactPhone
            this.contactWebsite = digitalCardProfileCloneParams.contactWebsite
            this.description = digitalCardProfileCloneParams.description
            this.issuerName = digitalCardProfileCloneParams.issuerName
            this.textColor = digitalCardProfileCloneParams.textColor
            additionalQueryParams(digitalCardProfileCloneParams.additionalQueryParams)
            additionalHeaders(digitalCardProfileCloneParams.additionalHeaders)
            additionalBodyProperties(digitalCardProfileCloneParams.additionalBodyProperties)
        }

        /** The identifier of the Digital Card Profile to clone. */
        fun digitalCardProfileId(digitalCardProfileId: String) = apply {
            this.digitalCardProfileId = digitalCardProfileId
        }

        /** The identifier of the File containing the card's icon image. */
        fun appIconFileId(appIconFileId: String) = apply { this.appIconFileId = appIconFileId }

        /** The identifier of the File containing the card's front image. */
        fun backgroundImageFileId(backgroundImageFileId: String) = apply {
            this.backgroundImageFileId = backgroundImageFileId
        }

        /** A user-facing description for the card itself. */
        fun cardDescription(cardDescription: String) = apply {
            this.cardDescription = cardDescription
        }

        /** An email address the user can contact to receive support for their card. */
        fun contactEmail(contactEmail: String) = apply { this.contactEmail = contactEmail }

        /** A phone number the user can contact to receive support for their card. */
        fun contactPhone(contactPhone: String) = apply { this.contactPhone = contactPhone }

        /** A website the user can visit to view and receive support for their card. */
        fun contactWebsite(contactWebsite: String) = apply { this.contactWebsite = contactWebsite }

        /** A description you can use to identify the Card Profile. */
        fun description(description: String) = apply { this.description = description }

        /** A user-facing description for whoever is issuing the card. */
        fun issuerName(issuerName: String) = apply { this.issuerName = issuerName }

        /** The Card's text color, specified as an RGB triple. The default is white. */
        fun textColor(textColor: TextColor) = apply { this.textColor = textColor }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun build(): DigitalCardProfileCloneParams =
            DigitalCardProfileCloneParams(
                checkNotNull(digitalCardProfileId) {
                    "`digitalCardProfileId` is required but was not set"
                },
                appIconFileId,
                backgroundImageFileId,
                cardDescription,
                contactEmail,
                contactPhone,
                contactWebsite,
                description,
                issuerName,
                textColor,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    /** The Card's text color, specified as an RGB triple. The default is white. */
    @JsonDeserialize(builder = TextColor.Builder::class)
    @NoAutoDetect
    class TextColor
    private constructor(
        private val blue: Long?,
        private val green: Long?,
        private val red: Long?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The value of the blue channel in the RGB color. */
        @JsonProperty("blue") fun blue(): Long? = blue

        /** The value of the green channel in the RGB color. */
        @JsonProperty("green") fun green(): Long? = green

        /** The value of the red channel in the RGB color. */
        @JsonProperty("red") fun red(): Long? = red

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
                this.blue = textColor.blue
                this.green = textColor.green
                this.red = textColor.red
                additionalProperties(textColor.additionalProperties)
            }

            /** The value of the blue channel in the RGB color. */
            @JsonProperty("blue") fun blue(blue: Long) = apply { this.blue = blue }

            /** The value of the green channel in the RGB color. */
            @JsonProperty("green") fun green(green: Long) = apply { this.green = green }

            /** The value of the red channel in the RGB color. */
            @JsonProperty("red") fun red(red: Long) = apply { this.red = red }

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
                    checkNotNull(blue) { "`blue` is required but was not set" },
                    checkNotNull(green) { "`green` is required but was not set" },
                    checkNotNull(red) { "`red` is required but was not set" },
                    additionalProperties.toUnmodifiable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is TextColor && this.blue == other.blue && this.green == other.green && this.red == other.red && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(blue, green, red, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "TextColor{blue=$blue, green=$green, red=$red, additionalProperties=$additionalProperties}"
    }
}
