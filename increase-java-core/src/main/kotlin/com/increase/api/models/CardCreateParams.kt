// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.checkRequired
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import com.increase.api.core.immutableEmptyMap
import com.increase.api.core.toImmutable
import java.util.Objects
import java.util.Optional

/** Create a Card */
class CardCreateParams
private constructor(
    private val body: CardCreateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    /** The Account the card should belong to. */
    fun accountId(): String = body.accountId()

    /** The card's billing address. */
    fun billingAddress(): Optional<BillingAddress> = body.billingAddress()

    /** The description you choose to give the card. */
    fun description(): Optional<String> = body.description()

    /**
     * The contact information used in the two-factor steps for digital wallet card creation. To add
     * the card to a digital wallet, you may supply an email or phone number with this request.
     * Otherwise, subscribe and then action a Real Time Decision with the category
     * `digital_wallet_token_requested` or `digital_wallet_authentication_requested`.
     */
    fun digitalWallet(): Optional<DigitalWallet> = body.digitalWallet()

    /**
     * The Entity the card belongs to. You only need to supply this in rare situations when the card
     * is not for the Account holder.
     */
    fun entityId(): Optional<String> = body.entityId()

    /** The Account the card should belong to. */
    fun _accountId(): JsonField<String> = body._accountId()

    /** The card's billing address. */
    fun _billingAddress(): JsonField<BillingAddress> = body._billingAddress()

    /** The description you choose to give the card. */
    fun _description(): JsonField<String> = body._description()

    /**
     * The contact information used in the two-factor steps for digital wallet card creation. To add
     * the card to a digital wallet, you may supply an email or phone number with this request.
     * Otherwise, subscribe and then action a Real Time Decision with the category
     * `digital_wallet_token_requested` or `digital_wallet_authentication_requested`.
     */
    fun _digitalWallet(): JsonField<DigitalWallet> = body._digitalWallet()

    /**
     * The Entity the card belongs to. You only need to supply this in rare situations when the card
     * is not for the Account holder.
     */
    fun _entityId(): JsonField<String> = body._entityId()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun getBody(): CardCreateBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class CardCreateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("account_id")
        @ExcludeMissing
        private val accountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("billing_address")
        @ExcludeMissing
        private val billingAddress: JsonField<BillingAddress> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        private val description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("digital_wallet")
        @ExcludeMissing
        private val digitalWallet: JsonField<DigitalWallet> = JsonMissing.of(),
        @JsonProperty("entity_id")
        @ExcludeMissing
        private val entityId: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The Account the card should belong to. */
        fun accountId(): String = accountId.getRequired("account_id")

        /** The card's billing address. */
        fun billingAddress(): Optional<BillingAddress> =
            Optional.ofNullable(billingAddress.getNullable("billing_address"))

        /** The description you choose to give the card. */
        fun description(): Optional<String> =
            Optional.ofNullable(description.getNullable("description"))

        /**
         * The contact information used in the two-factor steps for digital wallet card creation. To
         * add the card to a digital wallet, you may supply an email or phone number with this
         * request. Otherwise, subscribe and then action a Real Time Decision with the category
         * `digital_wallet_token_requested` or `digital_wallet_authentication_requested`.
         */
        fun digitalWallet(): Optional<DigitalWallet> =
            Optional.ofNullable(digitalWallet.getNullable("digital_wallet"))

        /**
         * The Entity the card belongs to. You only need to supply this in rare situations when the
         * card is not for the Account holder.
         */
        fun entityId(): Optional<String> = Optional.ofNullable(entityId.getNullable("entity_id"))

        /** The Account the card should belong to. */
        @JsonProperty("account_id") @ExcludeMissing fun _accountId(): JsonField<String> = accountId

        /** The card's billing address. */
        @JsonProperty("billing_address")
        @ExcludeMissing
        fun _billingAddress(): JsonField<BillingAddress> = billingAddress

        /** The description you choose to give the card. */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * The contact information used in the two-factor steps for digital wallet card creation. To
         * add the card to a digital wallet, you may supply an email or phone number with this
         * request. Otherwise, subscribe and then action a Real Time Decision with the category
         * `digital_wallet_token_requested` or `digital_wallet_authentication_requested`.
         */
        @JsonProperty("digital_wallet")
        @ExcludeMissing
        fun _digitalWallet(): JsonField<DigitalWallet> = digitalWallet

        /**
         * The Entity the card belongs to. You only need to supply this in rare situations when the
         * card is not for the Account holder.
         */
        @JsonProperty("entity_id") @ExcludeMissing fun _entityId(): JsonField<String> = entityId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): CardCreateBody = apply {
            if (validated) {
                return@apply
            }

            accountId()
            billingAddress().ifPresent { it.validate() }
            description()
            digitalWallet().ifPresent { it.validate() }
            entityId()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder internal constructor() {

            private var accountId: JsonField<String>? = null
            private var billingAddress: JsonField<BillingAddress> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var digitalWallet: JsonField<DigitalWallet> = JsonMissing.of()
            private var entityId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(cardCreateBody: CardCreateBody) = apply {
                accountId = cardCreateBody.accountId
                billingAddress = cardCreateBody.billingAddress
                description = cardCreateBody.description
                digitalWallet = cardCreateBody.digitalWallet
                entityId = cardCreateBody.entityId
                additionalProperties = cardCreateBody.additionalProperties.toMutableMap()
            }

            /** The Account the card should belong to. */
            fun accountId(accountId: String) = accountId(JsonField.of(accountId))

            /** The Account the card should belong to. */
            fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

            /** The card's billing address. */
            fun billingAddress(billingAddress: BillingAddress) =
                billingAddress(JsonField.of(billingAddress))

            /** The card's billing address. */
            fun billingAddress(billingAddress: JsonField<BillingAddress>) = apply {
                this.billingAddress = billingAddress
            }

            /** The description you choose to give the card. */
            fun description(description: String) = description(JsonField.of(description))

            /** The description you choose to give the card. */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /**
             * The contact information used in the two-factor steps for digital wallet card
             * creation. To add the card to a digital wallet, you may supply an email or phone
             * number with this request. Otherwise, subscribe and then action a Real Time Decision
             * with the category `digital_wallet_token_requested` or
             * `digital_wallet_authentication_requested`.
             */
            fun digitalWallet(digitalWallet: DigitalWallet) =
                digitalWallet(JsonField.of(digitalWallet))

            /**
             * The contact information used in the two-factor steps for digital wallet card
             * creation. To add the card to a digital wallet, you may supply an email or phone
             * number with this request. Otherwise, subscribe and then action a Real Time Decision
             * with the category `digital_wallet_token_requested` or
             * `digital_wallet_authentication_requested`.
             */
            fun digitalWallet(digitalWallet: JsonField<DigitalWallet>) = apply {
                this.digitalWallet = digitalWallet
            }

            /**
             * The Entity the card belongs to. You only need to supply this in rare situations when
             * the card is not for the Account holder.
             */
            fun entityId(entityId: String) = entityId(JsonField.of(entityId))

            /**
             * The Entity the card belongs to. You only need to supply this in rare situations when
             * the card is not for the Account holder.
             */
            fun entityId(entityId: JsonField<String>) = apply { this.entityId = entityId }

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

            fun build(): CardCreateBody =
                CardCreateBody(
                    checkRequired("accountId", accountId),
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

            return /* spotless:off */ other is CardCreateBody && accountId == other.accountId && billingAddress == other.billingAddress && description == other.description && digitalWallet == other.digitalWallet && entityId == other.entityId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(accountId, billingAddress, description, digitalWallet, entityId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CardCreateBody{accountId=$accountId, billingAddress=$billingAddress, description=$description, digitalWallet=$digitalWallet, entityId=$entityId, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder internal constructor() {

        private var body: CardCreateBody.Builder = CardCreateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(cardCreateParams: CardCreateParams) = apply {
            body = cardCreateParams.body.toBuilder()
            additionalHeaders = cardCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = cardCreateParams.additionalQueryParams.toBuilder()
        }

        /** The Account the card should belong to. */
        fun accountId(accountId: String) = apply { body.accountId(accountId) }

        /** The Account the card should belong to. */
        fun accountId(accountId: JsonField<String>) = apply { body.accountId(accountId) }

        /** The card's billing address. */
        fun billingAddress(billingAddress: BillingAddress) = apply {
            body.billingAddress(billingAddress)
        }

        /** The card's billing address. */
        fun billingAddress(billingAddress: JsonField<BillingAddress>) = apply {
            body.billingAddress(billingAddress)
        }

        /** The description you choose to give the card. */
        fun description(description: String) = apply { body.description(description) }

        /** The description you choose to give the card. */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        /**
         * The contact information used in the two-factor steps for digital wallet card creation. To
         * add the card to a digital wallet, you may supply an email or phone number with this
         * request. Otherwise, subscribe and then action a Real Time Decision with the category
         * `digital_wallet_token_requested` or `digital_wallet_authentication_requested`.
         */
        fun digitalWallet(digitalWallet: DigitalWallet) = apply {
            body.digitalWallet(digitalWallet)
        }

        /**
         * The contact information used in the two-factor steps for digital wallet card creation. To
         * add the card to a digital wallet, you may supply an email or phone number with this
         * request. Otherwise, subscribe and then action a Real Time Decision with the category
         * `digital_wallet_token_requested` or `digital_wallet_authentication_requested`.
         */
        fun digitalWallet(digitalWallet: JsonField<DigitalWallet>) = apply {
            body.digitalWallet(digitalWallet)
        }

        /**
         * The Entity the card belongs to. You only need to supply this in rare situations when the
         * card is not for the Account holder.
         */
        fun entityId(entityId: String) = apply { body.entityId(entityId) }

        /**
         * The Entity the card belongs to. You only need to supply this in rare situations when the
         * card is not for the Account holder.
         */
        fun entityId(entityId: JsonField<String>) = apply { body.entityId(entityId) }

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

        fun build(): CardCreateParams =
            CardCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    /** The card's billing address. */
    @NoAutoDetect
    class BillingAddress
    @JsonCreator
    private constructor(
        @JsonProperty("city")
        @ExcludeMissing
        private val city: JsonField<String> = JsonMissing.of(),
        @JsonProperty("line1")
        @ExcludeMissing
        private val line1: JsonField<String> = JsonMissing.of(),
        @JsonProperty("postal_code")
        @ExcludeMissing
        private val postalCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("state")
        @ExcludeMissing
        private val state: JsonField<String> = JsonMissing.of(),
        @JsonProperty("line2")
        @ExcludeMissing
        private val line2: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The city of the billing address. */
        fun city(): String = city.getRequired("city")

        /** The first line of the billing address. */
        fun line1(): String = line1.getRequired("line1")

        /** The postal code of the billing address. */
        fun postalCode(): String = postalCode.getRequired("postal_code")

        /** The US state of the billing address. */
        fun state(): String = state.getRequired("state")

        /** The second line of the billing address. */
        fun line2(): Optional<String> = Optional.ofNullable(line2.getNullable("line2"))

        /** The city of the billing address. */
        @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

        /** The first line of the billing address. */
        @JsonProperty("line1") @ExcludeMissing fun _line1(): JsonField<String> = line1

        /** The postal code of the billing address. */
        @JsonProperty("postal_code")
        @ExcludeMissing
        fun _postalCode(): JsonField<String> = postalCode

        /** The US state of the billing address. */
        @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<String> = state

        /** The second line of the billing address. */
        @JsonProperty("line2") @ExcludeMissing fun _line2(): JsonField<String> = line2

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): BillingAddress = apply {
            if (validated) {
                return@apply
            }

            city()
            line1()
            postalCode()
            state()
            line2()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder internal constructor() {

            private var city: JsonField<String>? = null
            private var line1: JsonField<String>? = null
            private var postalCode: JsonField<String>? = null
            private var state: JsonField<String>? = null
            private var line2: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(billingAddress: BillingAddress) = apply {
                city = billingAddress.city
                line1 = billingAddress.line1
                postalCode = billingAddress.postalCode
                state = billingAddress.state
                line2 = billingAddress.line2
                additionalProperties = billingAddress.additionalProperties.toMutableMap()
            }

            /** The city of the billing address. */
            fun city(city: String) = city(JsonField.of(city))

            /** The city of the billing address. */
            fun city(city: JsonField<String>) = apply { this.city = city }

            /** The first line of the billing address. */
            fun line1(line1: String) = line1(JsonField.of(line1))

            /** The first line of the billing address. */
            fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

            /** The postal code of the billing address. */
            fun postalCode(postalCode: String) = postalCode(JsonField.of(postalCode))

            /** The postal code of the billing address. */
            fun postalCode(postalCode: JsonField<String>) = apply { this.postalCode = postalCode }

            /** The US state of the billing address. */
            fun state(state: String) = state(JsonField.of(state))

            /** The US state of the billing address. */
            fun state(state: JsonField<String>) = apply { this.state = state }

            /** The second line of the billing address. */
            fun line2(line2: String) = line2(JsonField.of(line2))

            /** The second line of the billing address. */
            fun line2(line2: JsonField<String>) = apply { this.line2 = line2 }

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

            fun build(): BillingAddress =
                BillingAddress(
                    checkRequired("city", city),
                    checkRequired("line1", line1),
                    checkRequired("postalCode", postalCode),
                    checkRequired("state", state),
                    line2,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is BillingAddress && city == other.city && line1 == other.line1 && postalCode == other.postalCode && state == other.state && line2 == other.line2 && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(city, line1, postalCode, state, line2, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "BillingAddress{city=$city, line1=$line1, postalCode=$postalCode, state=$state, line2=$line2, additionalProperties=$additionalProperties}"
    }

    /**
     * The contact information used in the two-factor steps for digital wallet card creation. To add
     * the card to a digital wallet, you may supply an email or phone number with this request.
     * Otherwise, subscribe and then action a Real Time Decision with the category
     * `digital_wallet_token_requested` or `digital_wallet_authentication_requested`.
     */
    @NoAutoDetect
    class DigitalWallet
    @JsonCreator
    private constructor(
        @JsonProperty("digital_card_profile_id")
        @ExcludeMissing
        private val digitalCardProfileId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("email")
        @ExcludeMissing
        private val email: JsonField<String> = JsonMissing.of(),
        @JsonProperty("phone")
        @ExcludeMissing
        private val phone: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The digital card profile assigned to this digital card. */
        fun digitalCardProfileId(): Optional<String> =
            Optional.ofNullable(digitalCardProfileId.getNullable("digital_card_profile_id"))

        /**
         * An email address that can be used to contact and verify the cardholder via one-time
         * passcode over email.
         */
        fun email(): Optional<String> = Optional.ofNullable(email.getNullable("email"))

        /**
         * A phone number that can be used to contact and verify the cardholder via one-time
         * passcode over SMS.
         */
        fun phone(): Optional<String> = Optional.ofNullable(phone.getNullable("phone"))

        /** The digital card profile assigned to this digital card. */
        @JsonProperty("digital_card_profile_id")
        @ExcludeMissing
        fun _digitalCardProfileId(): JsonField<String> = digitalCardProfileId

        /**
         * An email address that can be used to contact and verify the cardholder via one-time
         * passcode over email.
         */
        @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

        /**
         * A phone number that can be used to contact and verify the cardholder via one-time
         * passcode over SMS.
         */
        @JsonProperty("phone") @ExcludeMissing fun _phone(): JsonField<String> = phone

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): DigitalWallet = apply {
            if (validated) {
                return@apply
            }

            digitalCardProfileId()
            email()
            phone()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder internal constructor() {

            private var digitalCardProfileId: JsonField<String> = JsonMissing.of()
            private var email: JsonField<String> = JsonMissing.of()
            private var phone: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(digitalWallet: DigitalWallet) = apply {
                digitalCardProfileId = digitalWallet.digitalCardProfileId
                email = digitalWallet.email
                phone = digitalWallet.phone
                additionalProperties = digitalWallet.additionalProperties.toMutableMap()
            }

            /** The digital card profile assigned to this digital card. */
            fun digitalCardProfileId(digitalCardProfileId: String) =
                digitalCardProfileId(JsonField.of(digitalCardProfileId))

            /** The digital card profile assigned to this digital card. */
            fun digitalCardProfileId(digitalCardProfileId: JsonField<String>) = apply {
                this.digitalCardProfileId = digitalCardProfileId
            }

            /**
             * An email address that can be used to contact and verify the cardholder via one-time
             * passcode over email.
             */
            fun email(email: String) = email(JsonField.of(email))

            /**
             * An email address that can be used to contact and verify the cardholder via one-time
             * passcode over email.
             */
            fun email(email: JsonField<String>) = apply { this.email = email }

            /**
             * A phone number that can be used to contact and verify the cardholder via one-time
             * passcode over SMS.
             */
            fun phone(phone: String) = phone(JsonField.of(phone))

            /**
             * A phone number that can be used to contact and verify the cardholder via one-time
             * passcode over SMS.
             */
            fun phone(phone: JsonField<String>) = apply { this.phone = phone }

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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CardCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "CardCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
