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
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import com.increase.api.core.toImmutable
import com.increase.api.errors.IncreaseInvalidDataException
import java.util.Objects
import java.util.Optional

class CardUpdateParams
constructor(
    private val cardId: String,
    private val billingAddress: BillingAddress?,
    private val description: String?,
    private val digitalWallet: DigitalWallet?,
    private val entityId: String?,
    private val status: Status?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun cardId(): String = cardId

    fun billingAddress(): Optional<BillingAddress> = Optional.ofNullable(billingAddress)

    fun description(): Optional<String> = Optional.ofNullable(description)

    fun digitalWallet(): Optional<DigitalWallet> = Optional.ofNullable(digitalWallet)

    fun entityId(): Optional<String> = Optional.ofNullable(entityId)

    fun status(): Optional<Status> = Optional.ofNullable(status)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    @JvmSynthetic
    internal fun getBody(): CardUpdateBody {
        return CardUpdateBody(
            billingAddress,
            description,
            digitalWallet,
            entityId,
            status,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> cardId
            else -> ""
        }
    }

    @JsonDeserialize(builder = CardUpdateBody.Builder::class)
    @NoAutoDetect
    class CardUpdateBody
    internal constructor(
        private val billingAddress: BillingAddress?,
        private val description: String?,
        private val digitalWallet: DigitalWallet?,
        private val entityId: String?,
        private val status: Status?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The card's updated billing address. */
        @JsonProperty("billing_address") fun billingAddress(): BillingAddress? = billingAddress

        /** The description you choose to give the card. */
        @JsonProperty("description") fun description(): String? = description

        /**
         * The contact information used in the two-factor steps for digital wallet card creation. At
         * least one field must be present to complete the digital wallet steps.
         */
        @JsonProperty("digital_wallet") fun digitalWallet(): DigitalWallet? = digitalWallet

        /**
         * The Entity the card belongs to. You only need to supply this in rare situations when the
         * card is not for the Account holder.
         */
        @JsonProperty("entity_id") fun entityId(): String? = entityId

        /** The status to update the Card with. */
        @JsonProperty("status") fun status(): Status? = status

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var billingAddress: BillingAddress? = null
            private var description: String? = null
            private var digitalWallet: DigitalWallet? = null
            private var entityId: String? = null
            private var status: Status? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(cardUpdateBody: CardUpdateBody) = apply {
                this.billingAddress = cardUpdateBody.billingAddress
                this.description = cardUpdateBody.description
                this.digitalWallet = cardUpdateBody.digitalWallet
                this.entityId = cardUpdateBody.entityId
                this.status = cardUpdateBody.status
                additionalProperties(cardUpdateBody.additionalProperties)
            }

            /** The card's updated billing address. */
            @JsonProperty("billing_address")
            fun billingAddress(billingAddress: BillingAddress) = apply {
                this.billingAddress = billingAddress
            }

            /** The description you choose to give the card. */
            @JsonProperty("description")
            fun description(description: String) = apply { this.description = description }

            /**
             * The contact information used in the two-factor steps for digital wallet card
             * creation. At least one field must be present to complete the digital wallet steps.
             */
            @JsonProperty("digital_wallet")
            fun digitalWallet(digitalWallet: DigitalWallet) = apply {
                this.digitalWallet = digitalWallet
            }

            /**
             * The Entity the card belongs to. You only need to supply this in rare situations when
             * the card is not for the Account holder.
             */
            @JsonProperty("entity_id")
            fun entityId(entityId: String) = apply { this.entityId = entityId }

            /** The status to update the Card with. */
            @JsonProperty("status") fun status(status: Status) = apply { this.status = status }

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

            fun build(): CardUpdateBody =
                CardUpdateBody(
                    billingAddress,
                    description,
                    digitalWallet,
                    entityId,
                    status,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CardUpdateBody && billingAddress == other.billingAddress && description == other.description && digitalWallet == other.digitalWallet && entityId == other.entityId && status == other.status && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(billingAddress, description, digitalWallet, entityId, status, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CardUpdateBody{billingAddress=$billingAddress, description=$description, digitalWallet=$digitalWallet, entityId=$entityId, status=$status, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var cardId: String? = null
        private var billingAddress: BillingAddress? = null
        private var description: String? = null
        private var digitalWallet: DigitalWallet? = null
        private var entityId: String? = null
        private var status: Status? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(cardUpdateParams: CardUpdateParams) = apply {
            cardId = cardUpdateParams.cardId
            billingAddress = cardUpdateParams.billingAddress
            description = cardUpdateParams.description
            digitalWallet = cardUpdateParams.digitalWallet
            entityId = cardUpdateParams.entityId
            status = cardUpdateParams.status
            additionalHeaders = cardUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = cardUpdateParams.additionalQueryParams.toBuilder()
            additionalBodyProperties = cardUpdateParams.additionalBodyProperties.toMutableMap()
        }

        /** The card identifier. */
        fun cardId(cardId: String) = apply { this.cardId = cardId }

        /** The card's updated billing address. */
        fun billingAddress(billingAddress: BillingAddress) = apply {
            this.billingAddress = billingAddress
        }

        /** The description you choose to give the card. */
        fun description(description: String) = apply { this.description = description }

        /**
         * The contact information used in the two-factor steps for digital wallet card creation. At
         * least one field must be present to complete the digital wallet steps.
         */
        fun digitalWallet(digitalWallet: DigitalWallet) = apply {
            this.digitalWallet = digitalWallet
        }

        /**
         * The Entity the card belongs to. You only need to supply this in rare situations when the
         * card is not for the Account holder.
         */
        fun entityId(entityId: String) = apply { this.entityId = entityId }

        /** The status to update the Card with. */
        fun status(status: Status) = apply { this.status = status }

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

        fun build(): CardUpdateParams =
            CardUpdateParams(
                checkNotNull(cardId) { "`cardId` is required but was not set" },
                billingAddress,
                description,
                digitalWallet,
                entityId,
                status,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    /** The card's updated billing address. */
    @JsonDeserialize(builder = BillingAddress.Builder::class)
    @NoAutoDetect
    class BillingAddress
    private constructor(
        private val city: String?,
        private val line1: String?,
        private val line2: String?,
        private val postalCode: String?,
        private val state: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The city of the billing address. */
        @JsonProperty("city") fun city(): String? = city

        /** The first line of the billing address. */
        @JsonProperty("line1") fun line1(): String? = line1

        /** The second line of the billing address. */
        @JsonProperty("line2") fun line2(): String? = line2

        /** The postal code of the billing address. */
        @JsonProperty("postal_code") fun postalCode(): String? = postalCode

        /** The US state of the billing address. */
        @JsonProperty("state") fun state(): String? = state

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var city: String? = null
            private var line1: String? = null
            private var line2: String? = null
            private var postalCode: String? = null
            private var state: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(billingAddress: BillingAddress) = apply {
                this.city = billingAddress.city
                this.line1 = billingAddress.line1
                this.line2 = billingAddress.line2
                this.postalCode = billingAddress.postalCode
                this.state = billingAddress.state
                additionalProperties(billingAddress.additionalProperties)
            }

            /** The city of the billing address. */
            @JsonProperty("city") fun city(city: String) = apply { this.city = city }

            /** The first line of the billing address. */
            @JsonProperty("line1") fun line1(line1: String) = apply { this.line1 = line1 }

            /** The second line of the billing address. */
            @JsonProperty("line2") fun line2(line2: String) = apply { this.line2 = line2 }

            /** The postal code of the billing address. */
            @JsonProperty("postal_code")
            fun postalCode(postalCode: String) = apply { this.postalCode = postalCode }

            /** The US state of the billing address. */
            @JsonProperty("state") fun state(state: String) = apply { this.state = state }

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

            fun build(): BillingAddress =
                BillingAddress(
                    checkNotNull(city) { "`city` is required but was not set" },
                    checkNotNull(line1) { "`line1` is required but was not set" },
                    line2,
                    checkNotNull(postalCode) { "`postalCode` is required but was not set" },
                    checkNotNull(state) { "`state` is required but was not set" },
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is BillingAddress && city == other.city && line1 == other.line1 && line2 == other.line2 && postalCode == other.postalCode && state == other.state && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(city, line1, line2, postalCode, state, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "BillingAddress{city=$city, line1=$line1, line2=$line2, postalCode=$postalCode, state=$state, additionalProperties=$additionalProperties}"
    }

    /**
     * The contact information used in the two-factor steps for digital wallet card creation. At
     * least one field must be present to complete the digital wallet steps.
     */
    @JsonDeserialize(builder = DigitalWallet.Builder::class)
    @NoAutoDetect
    class DigitalWallet
    private constructor(
        private val digitalCardProfileId: String?,
        private val email: String?,
        private val phone: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The digital card profile assigned to this digital card. */
        @JsonProperty("digital_card_profile_id")
        fun digitalCardProfileId(): String? = digitalCardProfileId

        /**
         * An email address that can be used to verify the cardholder via one-time passcode over
         * email.
         */
        @JsonProperty("email") fun email(): String? = email

        /**
         * A phone number that can be used to verify the cardholder via one-time passcode over SMS.
         */
        @JsonProperty("phone") fun phone(): String? = phone

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var digitalCardProfileId: String? = null
            private var email: String? = null
            private var phone: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(digitalWallet: DigitalWallet) = apply {
                this.digitalCardProfileId = digitalWallet.digitalCardProfileId
                this.email = digitalWallet.email
                this.phone = digitalWallet.phone
                additionalProperties(digitalWallet.additionalProperties)
            }

            /** The digital card profile assigned to this digital card. */
            @JsonProperty("digital_card_profile_id")
            fun digitalCardProfileId(digitalCardProfileId: String) = apply {
                this.digitalCardProfileId = digitalCardProfileId
            }

            /**
             * An email address that can be used to verify the cardholder via one-time passcode over
             * email.
             */
            @JsonProperty("email") fun email(email: String) = apply { this.email = email }

            /**
             * A phone number that can be used to verify the cardholder via one-time passcode over
             * SMS.
             */
            @JsonProperty("phone") fun phone(phone: String) = apply { this.phone = phone }

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

            fun build(): DigitalWallet =
                DigitalWallet(
                    digitalCardProfileId,
                    email,
                    phone,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is DigitalWallet && digitalCardProfileId == other.digitalCardProfileId && email == other.email && phone == other.phone && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(digitalCardProfileId, email, phone, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "DigitalWallet{digitalCardProfileId=$digitalCardProfileId, email=$email, phone=$phone, additionalProperties=$additionalProperties}"
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val ACTIVE = of("active")

            @JvmField val DISABLED = of("disabled")

            @JvmField val CANCELED = of("canceled")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            ACTIVE,
            DISABLED,
            CANCELED,
        }

        enum class Value {
            ACTIVE,
            DISABLED,
            CANCELED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ACTIVE -> Value.ACTIVE
                DISABLED -> Value.DISABLED
                CANCELED -> Value.CANCELED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ACTIVE -> Known.ACTIVE
                DISABLED -> Known.DISABLED
                CANCELED -> Known.CANCELED
                else -> throw IncreaseInvalidDataException("Unknown Status: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Status && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CardUpdateParams && cardId == other.cardId && billingAddress == other.billingAddress && description == other.description && digitalWallet == other.digitalWallet && entityId == other.entityId && status == other.status && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(cardId, billingAddress, description, digitalWallet, entityId, status, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "CardUpdateParams{cardId=$cardId, billingAddress=$billingAddress, description=$description, digitalWallet=$digitalWallet, entityId=$entityId, status=$status, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}
