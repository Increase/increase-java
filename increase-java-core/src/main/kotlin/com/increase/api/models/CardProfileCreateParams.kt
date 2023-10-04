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

class CardProfileCreateParams
constructor(
    private val description: String,
    private val digitalWallets: DigitalWallets,
    private val physicalCards: PhysicalCards?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun description(): String = description

    fun digitalWallets(): DigitalWallets = digitalWallets

    fun physicalCards(): Optional<PhysicalCards> = Optional.ofNullable(physicalCards)

    @JvmSynthetic
    internal fun getBody(): CardProfileCreateBody {
        return CardProfileCreateBody(
            description,
            digitalWallets,
            physicalCards,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = CardProfileCreateBody.Builder::class)
    @NoAutoDetect
    class CardProfileCreateBody
    internal constructor(
        private val description: String?,
        private val digitalWallets: DigitalWallets?,
        private val physicalCards: PhysicalCards?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** A description you can use to identify the Card Profile. */
        @JsonProperty("description") fun description(): String? = description

        /**
         * How Cards should appear in digital wallets such as Apple Pay. Different wallets will use
         * these values to render card artwork appropriately for their app.
         */
        @JsonProperty("digital_wallets") fun digitalWallets(): DigitalWallets? = digitalWallets

        /** How physical cards should be designed and shipped. */
        @JsonProperty("physical_cards") fun physicalCards(): PhysicalCards? = physicalCards

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CardProfileCreateBody &&
                this.description == other.description &&
                this.digitalWallets == other.digitalWallets &&
                this.physicalCards == other.physicalCards &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        description,
                        digitalWallets,
                        physicalCards,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "CardProfileCreateBody{description=$description, digitalWallets=$digitalWallets, physicalCards=$physicalCards, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var description: String? = null
            private var digitalWallets: DigitalWallets? = null
            private var physicalCards: PhysicalCards? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(cardProfileCreateBody: CardProfileCreateBody) = apply {
                this.description = cardProfileCreateBody.description
                this.digitalWallets = cardProfileCreateBody.digitalWallets
                this.physicalCards = cardProfileCreateBody.physicalCards
                additionalProperties(cardProfileCreateBody.additionalProperties)
            }

            /** A description you can use to identify the Card Profile. */
            @JsonProperty("description")
            fun description(description: String) = apply { this.description = description }

            /**
             * How Cards should appear in digital wallets such as Apple Pay. Different wallets will
             * use these values to render card artwork appropriately for their app.
             */
            @JsonProperty("digital_wallets")
            fun digitalWallets(digitalWallets: DigitalWallets) = apply {
                this.digitalWallets = digitalWallets
            }

            /** How physical cards should be designed and shipped. */
            @JsonProperty("physical_cards")
            fun physicalCards(physicalCards: PhysicalCards) = apply {
                this.physicalCards = physicalCards
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

            fun build(): CardProfileCreateBody =
                CardProfileCreateBody(
                    checkNotNull(description) { "`description` is required but was not set" },
                    checkNotNull(digitalWallets) { "`digitalWallets` is required but was not set" },
                    physicalCards,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CardProfileCreateParams &&
            this.description == other.description &&
            this.digitalWallets == other.digitalWallets &&
            this.physicalCards == other.physicalCards &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            description,
            digitalWallets,
            physicalCards,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "CardProfileCreateParams{description=$description, digitalWallets=$digitalWallets, physicalCards=$physicalCards, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var description: String? = null
        private var digitalWallets: DigitalWallets? = null
        private var physicalCards: PhysicalCards? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(cardProfileCreateParams: CardProfileCreateParams) = apply {
            this.description = cardProfileCreateParams.description
            this.digitalWallets = cardProfileCreateParams.digitalWallets
            this.physicalCards = cardProfileCreateParams.physicalCards
            additionalQueryParams(cardProfileCreateParams.additionalQueryParams)
            additionalHeaders(cardProfileCreateParams.additionalHeaders)
            additionalBodyProperties(cardProfileCreateParams.additionalBodyProperties)
        }

        /** A description you can use to identify the Card Profile. */
        fun description(description: String) = apply { this.description = description }

        /**
         * How Cards should appear in digital wallets such as Apple Pay. Different wallets will use
         * these values to render card artwork appropriately for their app.
         */
        fun digitalWallets(digitalWallets: DigitalWallets) = apply {
            this.digitalWallets = digitalWallets
        }

        /** How physical cards should be designed and shipped. */
        fun physicalCards(physicalCards: PhysicalCards) = apply {
            this.physicalCards = physicalCards
        }

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

        fun build(): CardProfileCreateParams =
            CardProfileCreateParams(
                checkNotNull(description) { "`description` is required but was not set" },
                checkNotNull(digitalWallets) { "`digitalWallets` is required but was not set" },
                physicalCards,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    /**
     * How Cards should appear in digital wallets such as Apple Pay. Different wallets will use
     * these values to render card artwork appropriately for their app.
     */
    @JsonDeserialize(builder = DigitalWallets.Builder::class)
    @NoAutoDetect
    class DigitalWallets
    private constructor(
        private val textColor: TextColor?,
        private val issuerName: String?,
        private val cardDescription: String?,
        private val contactWebsite: String?,
        private val contactEmail: String?,
        private val contactPhone: String?,
        private val backgroundImageFileId: String?,
        private val appIconFileId: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** The Card's text color, specified as an RGB triple. The default is white. */
        @JsonProperty("text_color") fun textColor(): TextColor? = textColor

        /** A user-facing description for whoever is issuing the card. */
        @JsonProperty("issuer_name") fun issuerName(): String? = issuerName

        /** A user-facing description for the card itself. */
        @JsonProperty("card_description") fun cardDescription(): String? = cardDescription

        /** A website the user can visit to view and receive support for their card. */
        @JsonProperty("contact_website") fun contactWebsite(): String? = contactWebsite

        /** An email address the user can contact to receive support for their card. */
        @JsonProperty("contact_email") fun contactEmail(): String? = contactEmail

        /** A phone number the user can contact to receive support for their card. */
        @JsonProperty("contact_phone") fun contactPhone(): String? = contactPhone

        /** The identifier of the File containing the card's front image. */
        @JsonProperty("background_image_file_id")
        fun backgroundImageFileId(): String? = backgroundImageFileId

        /** The identifier of the File containing the card's icon image. */
        @JsonProperty("app_icon_file_id") fun appIconFileId(): String? = appIconFileId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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
                hashCode =
                    Objects.hash(
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

        override fun toString() =
            "DigitalWallets{textColor=$textColor, issuerName=$issuerName, cardDescription=$cardDescription, contactWebsite=$contactWebsite, contactEmail=$contactEmail, contactPhone=$contactPhone, backgroundImageFileId=$backgroundImageFileId, appIconFileId=$appIconFileId, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var textColor: TextColor? = null
            private var issuerName: String? = null
            private var cardDescription: String? = null
            private var contactWebsite: String? = null
            private var contactEmail: String? = null
            private var contactPhone: String? = null
            private var backgroundImageFileId: String? = null
            private var appIconFileId: String? = null
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

            /** The Card's text color, specified as an RGB triple. The default is white. */
            @JsonProperty("text_color")
            fun textColor(textColor: TextColor) = apply { this.textColor = textColor }

            /** A user-facing description for whoever is issuing the card. */
            @JsonProperty("issuer_name")
            fun issuerName(issuerName: String) = apply { this.issuerName = issuerName }

            /** A user-facing description for the card itself. */
            @JsonProperty("card_description")
            fun cardDescription(cardDescription: String) = apply {
                this.cardDescription = cardDescription
            }

            /** A website the user can visit to view and receive support for their card. */
            @JsonProperty("contact_website")
            fun contactWebsite(contactWebsite: String) = apply {
                this.contactWebsite = contactWebsite
            }

            /** An email address the user can contact to receive support for their card. */
            @JsonProperty("contact_email")
            fun contactEmail(contactEmail: String) = apply { this.contactEmail = contactEmail }

            /** A phone number the user can contact to receive support for their card. */
            @JsonProperty("contact_phone")
            fun contactPhone(contactPhone: String) = apply { this.contactPhone = contactPhone }

            /** The identifier of the File containing the card's front image. */
            @JsonProperty("background_image_file_id")
            fun backgroundImageFileId(backgroundImageFileId: String) = apply {
                this.backgroundImageFileId = backgroundImageFileId
            }

            /** The identifier of the File containing the card's icon image. */
            @JsonProperty("app_icon_file_id")
            fun appIconFileId(appIconFileId: String) = apply { this.appIconFileId = appIconFileId }

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

            fun build(): DigitalWallets =
                DigitalWallets(
                    textColor,
                    checkNotNull(issuerName) { "`issuerName` is required but was not set" },
                    checkNotNull(cardDescription) {
                        "`cardDescription` is required but was not set"
                    },
                    contactWebsite,
                    contactEmail,
                    contactPhone,
                    checkNotNull(backgroundImageFileId) {
                        "`backgroundImageFileId` is required but was not set"
                    },
                    checkNotNull(appIconFileId) { "`appIconFileId` is required but was not set" },
                    additionalProperties.toUnmodifiable(),
                )
        }

        /** The Card's text color, specified as an RGB triple. The default is white. */
        @JsonDeserialize(builder = TextColor.Builder::class)
        @NoAutoDetect
        class TextColor
        private constructor(
            private val red: Long?,
            private val green: Long?,
            private val blue: Long?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var hashCode: Int = 0

            /** The value of the red channel in the RGB color. */
            @JsonProperty("red") fun red(): Long? = red

            /** The value of the green channel in the RGB color. */
            @JsonProperty("green") fun green(): Long? = green

            /** The value of the blue channel in the RGB color. */
            @JsonProperty("blue") fun blue(): Long? = blue

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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
                    hashCode =
                        Objects.hash(
                            red,
                            green,
                            blue,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "TextColor{red=$red, green=$green, blue=$blue, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var red: Long? = null
                private var green: Long? = null
                private var blue: Long? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(textColor: TextColor) = apply {
                    this.red = textColor.red
                    this.green = textColor.green
                    this.blue = textColor.blue
                    additionalProperties(textColor.additionalProperties)
                }

                /** The value of the red channel in the RGB color. */
                @JsonProperty("red") fun red(red: Long) = apply { this.red = red }

                /** The value of the green channel in the RGB color. */
                @JsonProperty("green") fun green(green: Long) = apply { this.green = green }

                /** The value of the blue channel in the RGB color. */
                @JsonProperty("blue") fun blue(blue: Long) = apply { this.blue = blue }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): TextColor =
                    TextColor(
                        checkNotNull(red) { "`red` is required but was not set" },
                        checkNotNull(green) { "`green` is required but was not set" },
                        checkNotNull(blue) { "`blue` is required but was not set" },
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }
    }

    /** How physical cards should be designed and shipped. */
    @JsonDeserialize(builder = PhysicalCards.Builder::class)
    @NoAutoDetect
    class PhysicalCards
    private constructor(
        private val contactPhone: String?,
        private val frontImageFileId: String?,
        private val carrierImageFileId: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** A phone number the user can contact to receive support for their card. */
        @JsonProperty("contact_phone") fun contactPhone(): String? = contactPhone

        /** The identifier of the File containing the physical card's front image. */
        @JsonProperty("front_image_file_id") fun frontImageFileId(): String? = frontImageFileId

        /** The identifier of the File containing the physical card's carrier image. */
        @JsonProperty("carrier_image_file_id")
        fun carrierImageFileId(): String? = carrierImageFileId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PhysicalCards &&
                this.contactPhone == other.contactPhone &&
                this.frontImageFileId == other.frontImageFileId &&
                this.carrierImageFileId == other.carrierImageFileId &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        contactPhone,
                        frontImageFileId,
                        carrierImageFileId,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "PhysicalCards{contactPhone=$contactPhone, frontImageFileId=$frontImageFileId, carrierImageFileId=$carrierImageFileId, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var contactPhone: String? = null
            private var frontImageFileId: String? = null
            private var carrierImageFileId: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(physicalCards: PhysicalCards) = apply {
                this.contactPhone = physicalCards.contactPhone
                this.frontImageFileId = physicalCards.frontImageFileId
                this.carrierImageFileId = physicalCards.carrierImageFileId
                additionalProperties(physicalCards.additionalProperties)
            }

            /** A phone number the user can contact to receive support for their card. */
            @JsonProperty("contact_phone")
            fun contactPhone(contactPhone: String) = apply { this.contactPhone = contactPhone }

            /** The identifier of the File containing the physical card's front image. */
            @JsonProperty("front_image_file_id")
            fun frontImageFileId(frontImageFileId: String) = apply {
                this.frontImageFileId = frontImageFileId
            }

            /** The identifier of the File containing the physical card's carrier image. */
            @JsonProperty("carrier_image_file_id")
            fun carrierImageFileId(carrierImageFileId: String) = apply {
                this.carrierImageFileId = carrierImageFileId
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

            fun build(): PhysicalCards =
                PhysicalCards(
                    checkNotNull(contactPhone) { "`contactPhone` is required but was not set" },
                    checkNotNull(frontImageFileId) {
                        "`frontImageFileId` is required but was not set"
                    },
                    checkNotNull(carrierImageFileId) {
                        "`carrierImageFileId` is required but was not set"
                    },
                    additionalProperties.toUnmodifiable(),
                )
        }
    }
}
