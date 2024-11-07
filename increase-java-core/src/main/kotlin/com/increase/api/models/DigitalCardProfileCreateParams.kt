// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import com.increase.api.core.toImmutable
import com.increase.api.models.*
import java.util.Objects
import java.util.Optional

class DigitalCardProfileCreateParams
constructor(
    private val appIconFileId: String,
    private val backgroundImageFileId: String,
    private val cardDescription: String,
    private val description: String,
    private val issuerName: String,
    private val contactEmail: String?,
    private val contactPhone: String?,
    private val contactWebsite: String?,
    private val textColor: TextColor?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun appIconFileId(): String = appIconFileId

    fun backgroundImageFileId(): String = backgroundImageFileId

    fun cardDescription(): String = cardDescription

    fun description(): String = description

    fun issuerName(): String = issuerName

    fun contactEmail(): Optional<String> = Optional.ofNullable(contactEmail)

    fun contactPhone(): Optional<String> = Optional.ofNullable(contactPhone)

    fun contactWebsite(): Optional<String> = Optional.ofNullable(contactWebsite)

    fun textColor(): Optional<TextColor> = Optional.ofNullable(textColor)

    @JvmSynthetic
    internal fun getBody(): DigitalCardProfileCreateBody {
        return DigitalCardProfileCreateBody(
            appIconFileId,
            backgroundImageFileId,
            cardDescription,
            description,
            issuerName,
            contactEmail,
            contactPhone,
            contactWebsite,
            textColor,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @JsonDeserialize(builder = DigitalCardProfileCreateBody.Builder::class)
    @NoAutoDetect
    class DigitalCardProfileCreateBody
    internal constructor(
        private val appIconFileId: String?,
        private val backgroundImageFileId: String?,
        private val cardDescription: String?,
        private val description: String?,
        private val issuerName: String?,
        private val contactEmail: String?,
        private val contactPhone: String?,
        private val contactWebsite: String?,
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

        /** A description you can use to identify the Card Profile. */
        @JsonProperty("description") fun description(): String? = description

        /** A user-facing description for whoever is issuing the card. */
        @JsonProperty("issuer_name") fun issuerName(): String? = issuerName

        /** An email address the user can contact to receive support for their card. */
        @JsonProperty("contact_email") fun contactEmail(): String? = contactEmail

        /** A phone number the user can contact to receive support for their card. */
        @JsonProperty("contact_phone") fun contactPhone(): String? = contactPhone

        /** A website the user can visit to view and receive support for their card. */
        @JsonProperty("contact_website") fun contactWebsite(): String? = contactWebsite

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
            private var description: String? = null
            private var issuerName: String? = null
            private var contactEmail: String? = null
            private var contactPhone: String? = null
            private var contactWebsite: String? = null
            private var textColor: TextColor? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(digitalCardProfileCreateBody: DigitalCardProfileCreateBody) = apply {
                this.appIconFileId = digitalCardProfileCreateBody.appIconFileId
                this.backgroundImageFileId = digitalCardProfileCreateBody.backgroundImageFileId
                this.cardDescription = digitalCardProfileCreateBody.cardDescription
                this.description = digitalCardProfileCreateBody.description
                this.issuerName = digitalCardProfileCreateBody.issuerName
                this.contactEmail = digitalCardProfileCreateBody.contactEmail
                this.contactPhone = digitalCardProfileCreateBody.contactPhone
                this.contactWebsite = digitalCardProfileCreateBody.contactWebsite
                this.textColor = digitalCardProfileCreateBody.textColor
                additionalProperties(digitalCardProfileCreateBody.additionalProperties)
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

            /** A description you can use to identify the Card Profile. */
            @JsonProperty("description")
            fun description(description: String) = apply { this.description = description }

            /** A user-facing description for whoever is issuing the card. */
            @JsonProperty("issuer_name")
            fun issuerName(issuerName: String) = apply { this.issuerName = issuerName }

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

            fun build(): DigitalCardProfileCreateBody =
                DigitalCardProfileCreateBody(
                    checkNotNull(appIconFileId) { "`appIconFileId` is required but was not set" },
                    checkNotNull(backgroundImageFileId) {
                        "`backgroundImageFileId` is required but was not set"
                    },
                    checkNotNull(cardDescription) {
                        "`cardDescription` is required but was not set"
                    },
                    checkNotNull(description) { "`description` is required but was not set" },
                    checkNotNull(issuerName) { "`issuerName` is required but was not set" },
                    contactEmail,
                    contactPhone,
                    contactWebsite,
                    textColor,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is DigitalCardProfileCreateBody && this.appIconFileId == other.appIconFileId && this.backgroundImageFileId == other.backgroundImageFileId && this.cardDescription == other.cardDescription && this.description == other.description && this.issuerName == other.issuerName && this.contactEmail == other.contactEmail && this.contactPhone == other.contactPhone && this.contactWebsite == other.contactWebsite && this.textColor == other.textColor && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(appIconFileId, backgroundImageFileId, cardDescription, description, issuerName, contactEmail, contactPhone, contactWebsite, textColor, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "DigitalCardProfileCreateBody{appIconFileId=$appIconFileId, backgroundImageFileId=$backgroundImageFileId, cardDescription=$cardDescription, description=$description, issuerName=$issuerName, contactEmail=$contactEmail, contactPhone=$contactPhone, contactWebsite=$contactWebsite, textColor=$textColor, additionalProperties=$additionalProperties}"
    }

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DigitalCardProfileCreateParams && this.appIconFileId == other.appIconFileId && this.backgroundImageFileId == other.backgroundImageFileId && this.cardDescription == other.cardDescription && this.description == other.description && this.issuerName == other.issuerName && this.contactEmail == other.contactEmail && this.contactPhone == other.contactPhone && this.contactWebsite == other.contactWebsite && this.textColor == other.textColor && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(appIconFileId, backgroundImageFileId, cardDescription, description, issuerName, contactEmail, contactPhone, contactWebsite, textColor, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "DigitalCardProfileCreateParams{appIconFileId=$appIconFileId, backgroundImageFileId=$backgroundImageFileId, cardDescription=$cardDescription, description=$description, issuerName=$issuerName, contactEmail=$contactEmail, contactPhone=$contactPhone, contactWebsite=$contactWebsite, textColor=$textColor, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var appIconFileId: String? = null
        private var backgroundImageFileId: String? = null
        private var cardDescription: String? = null
        private var description: String? = null
        private var issuerName: String? = null
        private var contactEmail: String? = null
        private var contactPhone: String? = null
        private var contactWebsite: String? = null
        private var textColor: TextColor? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(digitalCardProfileCreateParams: DigitalCardProfileCreateParams) = apply {
            this.appIconFileId = digitalCardProfileCreateParams.appIconFileId
            this.backgroundImageFileId = digitalCardProfileCreateParams.backgroundImageFileId
            this.cardDescription = digitalCardProfileCreateParams.cardDescription
            this.description = digitalCardProfileCreateParams.description
            this.issuerName = digitalCardProfileCreateParams.issuerName
            this.contactEmail = digitalCardProfileCreateParams.contactEmail
            this.contactPhone = digitalCardProfileCreateParams.contactPhone
            this.contactWebsite = digitalCardProfileCreateParams.contactWebsite
            this.textColor = digitalCardProfileCreateParams.textColor
            additionalHeaders(digitalCardProfileCreateParams.additionalHeaders)
            additionalQueryParams(digitalCardProfileCreateParams.additionalQueryParams)
            additionalBodyProperties(digitalCardProfileCreateParams.additionalBodyProperties)
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

        /** A description you can use to identify the Card Profile. */
        fun description(description: String) = apply { this.description = description }

        /** A user-facing description for whoever is issuing the card. */
        fun issuerName(issuerName: String) = apply { this.issuerName = issuerName }

        /** An email address the user can contact to receive support for their card. */
        fun contactEmail(contactEmail: String) = apply { this.contactEmail = contactEmail }

        /** A phone number the user can contact to receive support for their card. */
        fun contactPhone(contactPhone: String) = apply { this.contactPhone = contactPhone }

        /** A website the user can visit to view and receive support for their card. */
        fun contactWebsite(contactWebsite: String) = apply { this.contactWebsite = contactWebsite }

        /** The Card's text color, specified as an RGB triple. The default is white. */
        fun textColor(textColor: TextColor) = apply { this.textColor = textColor }

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
            this.additionalBodyProperties.clear()
            putAllAdditionalBodyProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply {
            additionalBodyProperties.remove(key)
        }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalBodyProperty)
        }

        fun build(): DigitalCardProfileCreateParams =
            DigitalCardProfileCreateParams(
                checkNotNull(appIconFileId) { "`appIconFileId` is required but was not set" },
                checkNotNull(backgroundImageFileId) {
                    "`backgroundImageFileId` is required but was not set"
                },
                checkNotNull(cardDescription) { "`cardDescription` is required but was not set" },
                checkNotNull(description) { "`description` is required but was not set" },
                checkNotNull(issuerName) { "`issuerName` is required but was not set" },
                contactEmail,
                contactPhone,
                contactWebsite,
                textColor,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
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
                    additionalProperties.toImmutable(),
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
