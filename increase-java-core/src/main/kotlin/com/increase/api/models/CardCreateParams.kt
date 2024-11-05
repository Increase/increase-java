// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.toImmutable
import com.increase.api.models.*
import java.util.Objects
import java.util.Optional

class CardCreateParams
constructor(
    private val accountId: String,
    private val billingAddress: BillingAddress?,
    private val description: String?,
    private val digitalWallet: DigitalWallet?,
    private val entityId: String?,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun accountId(): String = accountId

    fun billingAddress(): Optional<BillingAddress> = Optional.ofNullable(billingAddress)

    fun description(): Optional<String> = Optional.ofNullable(description)

    fun digitalWallet(): Optional<DigitalWallet> = Optional.ofNullable(digitalWallet)

    fun entityId(): Optional<String> = Optional.ofNullable(entityId)

    @JvmSynthetic
    internal fun getBody(): CardCreateBody {
        return CardCreateBody(
            accountId,
            billingAddress,
            description,
            digitalWallet,
            entityId,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JsonDeserialize(builder = CardCreateBody.Builder::class)
    @NoAutoDetect
    class CardCreateBody
    internal constructor(
        private val accountId: String?,
        private val billingAddress: BillingAddress?,
        private val description: String?,
        private val digitalWallet: DigitalWallet?,
        private val entityId: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The Account the card should belong to. */
        @JsonProperty("account_id") fun accountId(): String? = accountId

        /** The card's billing address. */
        @JsonProperty("billing_address") fun billingAddress(): BillingAddress? = billingAddress

        /** The description you choose to give the card. */
        @JsonProperty("description") fun description(): String? = description

        /**
         * The contact information used in the two-factor steps for digital wallet card creation. To
         * add the card to a digital wallet, you may supply an email or phone number with this
         * request. Otherwise, subscribe and then action a Real Time Decision with the category
         * `digital_wallet_token_requested` or `digital_wallet_authentication_requested`.
         */
        @JsonProperty("digital_wallet") fun digitalWallet(): DigitalWallet? = digitalWallet

        /**
         * The Entity the card belongs to. You only need to supply this in rare situations when the
         * card is not for the Account holder.
         */
        @JsonProperty("entity_id") fun entityId(): String? = entityId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var accountId: String? = null
            private var billingAddress: BillingAddress? = null
            private var description: String? = null
            private var digitalWallet: DigitalWallet? = null
            private var entityId: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(cardCreateBody: CardCreateBody) = apply {
                this.accountId = cardCreateBody.accountId
                this.billingAddress = cardCreateBody.billingAddress
                this.description = cardCreateBody.description
                this.digitalWallet = cardCreateBody.digitalWallet
                this.entityId = cardCreateBody.entityId
                additionalProperties(cardCreateBody.additionalProperties)
            }

            /** The Account the card should belong to. */
            @JsonProperty("account_id")
            fun accountId(accountId: String) = apply { this.accountId = accountId }

            /** The card's billing address. */
            @JsonProperty("billing_address")
            fun billingAddress(billingAddress: BillingAddress) = apply {
                this.billingAddress = billingAddress
            }

            /** The description you choose to give the card. */
            @JsonProperty("description")
            fun description(description: String) = apply { this.description = description }

            /**
             * The contact information used in the two-factor steps for digital wallet card
             * creation. To add the card to a digital wallet, you may supply an email or phone
             * number with this request. Otherwise, subscribe and then action a Real Time Decision
             * with the category `digital_wallet_token_requested` or
             * `digital_wallet_authentication_requested`.
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

            fun build(): CardCreateBody =
                CardCreateBody(
                    checkNotNull(accountId) { "`accountId` is required but was not set" },
                    billingAddress,
                    description,
                    digitalWallet,
                    entityId,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CardCreateBody && this.accountId == other.accountId && this.billingAddress == other.billingAddress && this.description == other.description && this.digitalWallet == other.digitalWallet && this.entityId == other.entityId && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(accountId, billingAddress, description, digitalWallet, entityId, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "CardCreateBody{accountId=$accountId, billingAddress=$billingAddress, description=$description, digitalWallet=$digitalWallet, entityId=$entityId, additionalProperties=$additionalProperties}"
    }

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CardCreateParams && this.accountId == other.accountId && this.billingAddress == other.billingAddress && this.description == other.description && this.digitalWallet == other.digitalWallet && this.entityId == other.entityId && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(accountId, billingAddress, description, digitalWallet, entityId, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "CardCreateParams{accountId=$accountId, billingAddress=$billingAddress, description=$description, digitalWallet=$digitalWallet, entityId=$entityId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var accountId: String? = null
        private var billingAddress: BillingAddress? = null
        private var description: String? = null
        private var digitalWallet: DigitalWallet? = null
        private var entityId: String? = null
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(cardCreateParams: CardCreateParams) = apply {
            this.accountId = cardCreateParams.accountId
            this.billingAddress = cardCreateParams.billingAddress
            this.description = cardCreateParams.description
            this.digitalWallet = cardCreateParams.digitalWallet
            this.entityId = cardCreateParams.entityId
            additionalHeaders(cardCreateParams.additionalHeaders)
            additionalQueryParams(cardCreateParams.additionalQueryParams)
            additionalBodyProperties(cardCreateParams.additionalBodyProperties)
        }

        /** The Account the card should belong to. */
        fun accountId(accountId: String) = apply { this.accountId = accountId }

        /** The card's billing address. */
        fun billingAddress(billingAddress: BillingAddress) = apply {
            this.billingAddress = billingAddress
        }

        /** The description you choose to give the card. */
        fun description(description: String) = apply { this.description = description }

        /**
         * The contact information used in the two-factor steps for digital wallet card creation. To
         * add the card to a digital wallet, you may supply an email or phone number with this
         * request. Otherwise, subscribe and then action a Real Time Decision with the category
         * `digital_wallet_token_requested` or `digital_wallet_authentication_requested`.
         */
        fun digitalWallet(digitalWallet: DigitalWallet) = apply {
            this.digitalWallet = digitalWallet
        }

        /**
         * The Entity the card belongs to. You only need to supply this in rare situations when the
         * card is not for the Account holder.
         */
        fun entityId(entityId: String) = apply { this.entityId = entityId }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.putAll(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(::putAdditionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replaceValues(name, listOf(value))
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replaceValues(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(::replaceAdditionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.removeAll(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            names.forEach(::removeAdditionalHeaders)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.putAll(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                additionalQueryParams.forEach(::putAdditionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replaceValues(key, listOf(value))
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replaceValues(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                additionalQueryParams.forEach(::replaceAdditionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply {
            additionalQueryParams.removeAll(key)
        }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalQueryParams)
        }

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

        fun build(): CardCreateParams =
            CardCreateParams(
                checkNotNull(accountId) { "`accountId` is required but was not set" },
                billingAddress,
                description,
                digitalWallet,
                entityId,
                additionalHeaders
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
                additionalQueryParams
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
                additionalBodyProperties.toImmutable(),
            )
    }

    /** The card's billing address. */
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

            return /* spotless:off */ other is BillingAddress && this.city == other.city && this.line1 == other.line1 && this.line2 == other.line2 && this.postalCode == other.postalCode && this.state == other.state && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(city, line1, line2, postalCode, state, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "BillingAddress{city=$city, line1=$line1, line2=$line2, postalCode=$postalCode, state=$state, additionalProperties=$additionalProperties}"
    }

    /**
     * The contact information used in the two-factor steps for digital wallet card creation. To add
     * the card to a digital wallet, you may supply an email or phone number with this request.
     * Otherwise, subscribe and then action a Real Time Decision with the category
     * `digital_wallet_token_requested` or `digital_wallet_authentication_requested`.
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
         * An email address that can be used to contact and verify the cardholder via one-time
         * passcode over email.
         */
        @JsonProperty("email") fun email(): String? = email

        /**
         * A phone number that can be used to contact and verify the cardholder via one-time
         * passcode over SMS.
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
             * An email address that can be used to contact and verify the cardholder via one-time
             * passcode over email.
             */
            @JsonProperty("email") fun email(email: String) = apply { this.email = email }

            /**
             * A phone number that can be used to contact and verify the cardholder via one-time
             * passcode over SMS.
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

            return /* spotless:off */ other is DigitalWallet && this.digitalCardProfileId == other.digitalCardProfileId && this.email == other.email && this.phone == other.phone && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(digitalCardProfileId, email, phone, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "DigitalWallet{digitalCardProfileId=$digitalCardProfileId, email=$email, phone=$phone, additionalProperties=$additionalProperties}"
    }
}
