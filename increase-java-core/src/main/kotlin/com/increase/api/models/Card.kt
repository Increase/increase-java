// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.increase.api.core.Enum
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.checkRequired
import com.increase.api.core.immutableEmptyMap
import com.increase.api.core.toImmutable
import com.increase.api.errors.IncreaseInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

/**
 * Cards are commercial credit cards. They'll immediately work for online purchases after you create
 * them. All cards maintain a credit limit of 100% of the Account’s available balance at the time of
 * transaction. Funds are deducted from the Account upon transaction settlement.
 */
@NoAutoDetect
class Card
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("account_id")
    @ExcludeMissing
    private val accountId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("billing_address")
    @ExcludeMissing
    private val billingAddress: JsonField<BillingAddress> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("description")
    @ExcludeMissing
    private val description: JsonField<String> = JsonMissing.of(),
    @JsonProperty("digital_wallet")
    @ExcludeMissing
    private val digitalWallet: JsonField<DigitalWallet> = JsonMissing.of(),
    @JsonProperty("entity_id")
    @ExcludeMissing
    private val entityId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("expiration_month")
    @ExcludeMissing
    private val expirationMonth: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("expiration_year")
    @ExcludeMissing
    private val expirationYear: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("idempotency_key")
    @ExcludeMissing
    private val idempotencyKey: JsonField<String> = JsonMissing.of(),
    @JsonProperty("last4") @ExcludeMissing private val last4: JsonField<String> = JsonMissing.of(),
    @JsonProperty("status")
    @ExcludeMissing
    private val status: JsonField<Status> = JsonMissing.of(),
    @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The card identifier. */
    fun id(): String = id.getRequired("id")

    /** The identifier for the account this card belongs to. */
    fun accountId(): String = accountId.getRequired("account_id")

    /** The Card's billing address. */
    fun billingAddress(): BillingAddress = billingAddress.getRequired("billing_address")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the Card was
     * created.
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /** The card's description for display purposes. */
    fun description(): Optional<String> =
        Optional.ofNullable(description.getNullable("description"))

    /**
     * The contact information used in the two-factor steps for digital wallet card creation. At
     * least one field must be present to complete the digital wallet steps.
     */
    fun digitalWallet(): Optional<DigitalWallet> =
        Optional.ofNullable(digitalWallet.getNullable("digital_wallet"))

    /** The identifier for the entity associated with this card. */
    fun entityId(): Optional<String> = Optional.ofNullable(entityId.getNullable("entity_id"))

    /** The month the card expires in M format (e.g., August is 8). */
    fun expirationMonth(): Long = expirationMonth.getRequired("expiration_month")

    /** The year the card expires in YYYY format (e.g., 2025). */
    fun expirationYear(): Long = expirationYear.getRequired("expiration_year")

    /**
     * The idempotency key you chose for this object. This value is unique across Increase and is
     * used to ensure that a request is only processed once. Learn more about
     * [idempotency](https://increase.com/documentation/idempotency-keys).
     */
    fun idempotencyKey(): Optional<String> =
        Optional.ofNullable(idempotencyKey.getNullable("idempotency_key"))

    /** The last 4 digits of the Card's Primary Account Number. */
    fun last4(): String = last4.getRequired("last4")

    /** This indicates if payments can be made with the card. */
    fun status(): Status = status.getRequired("status")

    /** A constant representing the object's type. For this resource it will always be `card`. */
    fun type(): Type = type.getRequired("type")

    /** The card identifier. */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /** The identifier for the account this card belongs to. */
    @JsonProperty("account_id") @ExcludeMissing fun _accountId(): JsonField<String> = accountId

    /** The Card's billing address. */
    @JsonProperty("billing_address")
    @ExcludeMissing
    fun _billingAddress(): JsonField<BillingAddress> = billingAddress

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the Card was
     * created.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /** The card's description for display purposes. */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * The contact information used in the two-factor steps for digital wallet card creation. At
     * least one field must be present to complete the digital wallet steps.
     */
    @JsonProperty("digital_wallet")
    @ExcludeMissing
    fun _digitalWallet(): JsonField<DigitalWallet> = digitalWallet

    /** The identifier for the entity associated with this card. */
    @JsonProperty("entity_id") @ExcludeMissing fun _entityId(): JsonField<String> = entityId

    /** The month the card expires in M format (e.g., August is 8). */
    @JsonProperty("expiration_month")
    @ExcludeMissing
    fun _expirationMonth(): JsonField<Long> = expirationMonth

    /** The year the card expires in YYYY format (e.g., 2025). */
    @JsonProperty("expiration_year")
    @ExcludeMissing
    fun _expirationYear(): JsonField<Long> = expirationYear

    /**
     * The idempotency key you chose for this object. This value is unique across Increase and is
     * used to ensure that a request is only processed once. Learn more about
     * [idempotency](https://increase.com/documentation/idempotency-keys).
     */
    @JsonProperty("idempotency_key")
    @ExcludeMissing
    fun _idempotencyKey(): JsonField<String> = idempotencyKey

    /** The last 4 digits of the Card's Primary Account Number. */
    @JsonProperty("last4") @ExcludeMissing fun _last4(): JsonField<String> = last4

    /** This indicates if payments can be made with the card. */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /** A constant representing the object's type. For this resource it will always be `card`. */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): Card = apply {
        if (validated) {
            return@apply
        }

        id()
        accountId()
        billingAddress().validate()
        createdAt()
        description()
        digitalWallet().ifPresent { it.validate() }
        entityId()
        expirationMonth()
        expirationYear()
        idempotencyKey()
        last4()
        status()
        type()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [Card].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .accountId()
         * .billingAddress()
         * .createdAt()
         * .description()
         * .digitalWallet()
         * .entityId()
         * .expirationMonth()
         * .expirationYear()
         * .idempotencyKey()
         * .last4()
         * .status()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Card]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var accountId: JsonField<String>? = null
        private var billingAddress: JsonField<BillingAddress>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var description: JsonField<String>? = null
        private var digitalWallet: JsonField<DigitalWallet>? = null
        private var entityId: JsonField<String>? = null
        private var expirationMonth: JsonField<Long>? = null
        private var expirationYear: JsonField<Long>? = null
        private var idempotencyKey: JsonField<String>? = null
        private var last4: JsonField<String>? = null
        private var status: JsonField<Status>? = null
        private var type: JsonField<Type>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(card: Card) = apply {
            id = card.id
            accountId = card.accountId
            billingAddress = card.billingAddress
            createdAt = card.createdAt
            description = card.description
            digitalWallet = card.digitalWallet
            entityId = card.entityId
            expirationMonth = card.expirationMonth
            expirationYear = card.expirationYear
            idempotencyKey = card.idempotencyKey
            last4 = card.last4
            status = card.status
            type = card.type
            additionalProperties = card.additionalProperties.toMutableMap()
        }

        /** The card identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The card identifier. */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The identifier for the account this card belongs to. */
        fun accountId(accountId: String) = accountId(JsonField.of(accountId))

        /** The identifier for the account this card belongs to. */
        fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

        /** The Card's billing address. */
        fun billingAddress(billingAddress: BillingAddress) =
            billingAddress(JsonField.of(billingAddress))

        /** The Card's billing address. */
        fun billingAddress(billingAddress: JsonField<BillingAddress>) = apply {
            this.billingAddress = billingAddress
        }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the Card
         * was created.
         */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the Card
         * was created.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** The card's description for display purposes. */
        fun description(description: String?) = description(JsonField.ofNullable(description))

        /** The card's description for display purposes. */
        fun description(description: Optional<String>) = description(description.orElse(null))

        /** The card's description for display purposes. */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /**
         * The contact information used in the two-factor steps for digital wallet card creation. At
         * least one field must be present to complete the digital wallet steps.
         */
        fun digitalWallet(digitalWallet: DigitalWallet?) =
            digitalWallet(JsonField.ofNullable(digitalWallet))

        /**
         * The contact information used in the two-factor steps for digital wallet card creation. At
         * least one field must be present to complete the digital wallet steps.
         */
        fun digitalWallet(digitalWallet: Optional<DigitalWallet>) =
            digitalWallet(digitalWallet.orElse(null))

        /**
         * The contact information used in the two-factor steps for digital wallet card creation. At
         * least one field must be present to complete the digital wallet steps.
         */
        fun digitalWallet(digitalWallet: JsonField<DigitalWallet>) = apply {
            this.digitalWallet = digitalWallet
        }

        /** The identifier for the entity associated with this card. */
        fun entityId(entityId: String?) = entityId(JsonField.ofNullable(entityId))

        /** The identifier for the entity associated with this card. */
        fun entityId(entityId: Optional<String>) = entityId(entityId.orElse(null))

        /** The identifier for the entity associated with this card. */
        fun entityId(entityId: JsonField<String>) = apply { this.entityId = entityId }

        /** The month the card expires in M format (e.g., August is 8). */
        fun expirationMonth(expirationMonth: Long) = expirationMonth(JsonField.of(expirationMonth))

        /** The month the card expires in M format (e.g., August is 8). */
        fun expirationMonth(expirationMonth: JsonField<Long>) = apply {
            this.expirationMonth = expirationMonth
        }

        /** The year the card expires in YYYY format (e.g., 2025). */
        fun expirationYear(expirationYear: Long) = expirationYear(JsonField.of(expirationYear))

        /** The year the card expires in YYYY format (e.g., 2025). */
        fun expirationYear(expirationYear: JsonField<Long>) = apply {
            this.expirationYear = expirationYear
        }

        /**
         * The idempotency key you chose for this object. This value is unique across Increase and
         * is used to ensure that a request is only processed once. Learn more about
         * [idempotency](https://increase.com/documentation/idempotency-keys).
         */
        fun idempotencyKey(idempotencyKey: String?) =
            idempotencyKey(JsonField.ofNullable(idempotencyKey))

        /**
         * The idempotency key you chose for this object. This value is unique across Increase and
         * is used to ensure that a request is only processed once. Learn more about
         * [idempotency](https://increase.com/documentation/idempotency-keys).
         */
        fun idempotencyKey(idempotencyKey: Optional<String>) =
            idempotencyKey(idempotencyKey.orElse(null))

        /**
         * The idempotency key you chose for this object. This value is unique across Increase and
         * is used to ensure that a request is only processed once. Learn more about
         * [idempotency](https://increase.com/documentation/idempotency-keys).
         */
        fun idempotencyKey(idempotencyKey: JsonField<String>) = apply {
            this.idempotencyKey = idempotencyKey
        }

        /** The last 4 digits of the Card's Primary Account Number. */
        fun last4(last4: String) = last4(JsonField.of(last4))

        /** The last 4 digits of the Card's Primary Account Number. */
        fun last4(last4: JsonField<String>) = apply { this.last4 = last4 }

        /** This indicates if payments can be made with the card. */
        fun status(status: Status) = status(JsonField.of(status))

        /** This indicates if payments can be made with the card. */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /**
         * A constant representing the object's type. For this resource it will always be `card`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * A constant representing the object's type. For this resource it will always be `card`.
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

        fun build(): Card =
            Card(
                checkRequired("id", id),
                checkRequired("accountId", accountId),
                checkRequired("billingAddress", billingAddress),
                checkRequired("createdAt", createdAt),
                checkRequired("description", description),
                checkRequired("digitalWallet", digitalWallet),
                checkRequired("entityId", entityId),
                checkRequired("expirationMonth", expirationMonth),
                checkRequired("expirationYear", expirationYear),
                checkRequired("idempotencyKey", idempotencyKey),
                checkRequired("last4", last4),
                checkRequired("status", status),
                checkRequired("type", type),
                additionalProperties.toImmutable(),
            )
    }

    /** The Card's billing address. */
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
        @JsonProperty("line2")
        @ExcludeMissing
        private val line2: JsonField<String> = JsonMissing.of(),
        @JsonProperty("postal_code")
        @ExcludeMissing
        private val postalCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("state")
        @ExcludeMissing
        private val state: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The city of the billing address. */
        fun city(): Optional<String> = Optional.ofNullable(city.getNullable("city"))

        /** The first line of the billing address. */
        fun line1(): Optional<String> = Optional.ofNullable(line1.getNullable("line1"))

        /** The second line of the billing address. */
        fun line2(): Optional<String> = Optional.ofNullable(line2.getNullable("line2"))

        /** The postal code of the billing address. */
        fun postalCode(): Optional<String> =
            Optional.ofNullable(postalCode.getNullable("postal_code"))

        /** The US state of the billing address. */
        fun state(): Optional<String> = Optional.ofNullable(state.getNullable("state"))

        /** The city of the billing address. */
        @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

        /** The first line of the billing address. */
        @JsonProperty("line1") @ExcludeMissing fun _line1(): JsonField<String> = line1

        /** The second line of the billing address. */
        @JsonProperty("line2") @ExcludeMissing fun _line2(): JsonField<String> = line2

        /** The postal code of the billing address. */
        @JsonProperty("postal_code")
        @ExcludeMissing
        fun _postalCode(): JsonField<String> = postalCode

        /** The US state of the billing address. */
        @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<String> = state

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
            line2()
            postalCode()
            state()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [BillingAddress].
             *
             * The following fields are required:
             * ```java
             * .city()
             * .line1()
             * .line2()
             * .postalCode()
             * .state()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [BillingAddress]. */
        class Builder internal constructor() {

            private var city: JsonField<String>? = null
            private var line1: JsonField<String>? = null
            private var line2: JsonField<String>? = null
            private var postalCode: JsonField<String>? = null
            private var state: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(billingAddress: BillingAddress) = apply {
                city = billingAddress.city
                line1 = billingAddress.line1
                line2 = billingAddress.line2
                postalCode = billingAddress.postalCode
                state = billingAddress.state
                additionalProperties = billingAddress.additionalProperties.toMutableMap()
            }

            /** The city of the billing address. */
            fun city(city: String?) = city(JsonField.ofNullable(city))

            /** The city of the billing address. */
            fun city(city: Optional<String>) = city(city.orElse(null))

            /** The city of the billing address. */
            fun city(city: JsonField<String>) = apply { this.city = city }

            /** The first line of the billing address. */
            fun line1(line1: String?) = line1(JsonField.ofNullable(line1))

            /** The first line of the billing address. */
            fun line1(line1: Optional<String>) = line1(line1.orElse(null))

            /** The first line of the billing address. */
            fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

            /** The second line of the billing address. */
            fun line2(line2: String?) = line2(JsonField.ofNullable(line2))

            /** The second line of the billing address. */
            fun line2(line2: Optional<String>) = line2(line2.orElse(null))

            /** The second line of the billing address. */
            fun line2(line2: JsonField<String>) = apply { this.line2 = line2 }

            /** The postal code of the billing address. */
            fun postalCode(postalCode: String?) = postalCode(JsonField.ofNullable(postalCode))

            /** The postal code of the billing address. */
            fun postalCode(postalCode: Optional<String>) = postalCode(postalCode.orElse(null))

            /** The postal code of the billing address. */
            fun postalCode(postalCode: JsonField<String>) = apply { this.postalCode = postalCode }

            /** The US state of the billing address. */
            fun state(state: String?) = state(JsonField.ofNullable(state))

            /** The US state of the billing address. */
            fun state(state: Optional<String>) = state(state.orElse(null))

            /** The US state of the billing address. */
            fun state(state: JsonField<String>) = apply { this.state = state }

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
                    checkRequired("line2", line2),
                    checkRequired("postalCode", postalCode),
                    checkRequired("state", state),
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

        /**
         * The digital card profile assigned to this digital card. Card profiles may also be
         * assigned at the program level.
         */
        fun digitalCardProfileId(): Optional<String> =
            Optional.ofNullable(digitalCardProfileId.getNullable("digital_card_profile_id"))

        /**
         * An email address that can be used to verify the cardholder via one-time passcode over
         * email.
         */
        fun email(): Optional<String> = Optional.ofNullable(email.getNullable("email"))

        /**
         * A phone number that can be used to verify the cardholder via one-time passcode over SMS.
         */
        fun phone(): Optional<String> = Optional.ofNullable(phone.getNullable("phone"))

        /**
         * The digital card profile assigned to this digital card. Card profiles may also be
         * assigned at the program level.
         */
        @JsonProperty("digital_card_profile_id")
        @ExcludeMissing
        fun _digitalCardProfileId(): JsonField<String> = digitalCardProfileId

        /**
         * An email address that can be used to verify the cardholder via one-time passcode over
         * email.
         */
        @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

        /**
         * A phone number that can be used to verify the cardholder via one-time passcode over SMS.
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

            /**
             * Returns a mutable builder for constructing an instance of [DigitalWallet].
             *
             * The following fields are required:
             * ```java
             * .digitalCardProfileId()
             * .email()
             * .phone()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [DigitalWallet]. */
        class Builder internal constructor() {

            private var digitalCardProfileId: JsonField<String>? = null
            private var email: JsonField<String>? = null
            private var phone: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(digitalWallet: DigitalWallet) = apply {
                digitalCardProfileId = digitalWallet.digitalCardProfileId
                email = digitalWallet.email
                phone = digitalWallet.phone
                additionalProperties = digitalWallet.additionalProperties.toMutableMap()
            }

            /**
             * The digital card profile assigned to this digital card. Card profiles may also be
             * assigned at the program level.
             */
            fun digitalCardProfileId(digitalCardProfileId: String?) =
                digitalCardProfileId(JsonField.ofNullable(digitalCardProfileId))

            /**
             * The digital card profile assigned to this digital card. Card profiles may also be
             * assigned at the program level.
             */
            fun digitalCardProfileId(digitalCardProfileId: Optional<String>) =
                digitalCardProfileId(digitalCardProfileId.orElse(null))

            /**
             * The digital card profile assigned to this digital card. Card profiles may also be
             * assigned at the program level.
             */
            fun digitalCardProfileId(digitalCardProfileId: JsonField<String>) = apply {
                this.digitalCardProfileId = digitalCardProfileId
            }

            /**
             * An email address that can be used to verify the cardholder via one-time passcode over
             * email.
             */
            fun email(email: String?) = email(JsonField.ofNullable(email))

            /**
             * An email address that can be used to verify the cardholder via one-time passcode over
             * email.
             */
            fun email(email: Optional<String>) = email(email.orElse(null))

            /**
             * An email address that can be used to verify the cardholder via one-time passcode over
             * email.
             */
            fun email(email: JsonField<String>) = apply { this.email = email }

            /**
             * A phone number that can be used to verify the cardholder via one-time passcode over
             * SMS.
             */
            fun phone(phone: String?) = phone(JsonField.ofNullable(phone))

            /**
             * A phone number that can be used to verify the cardholder via one-time passcode over
             * SMS.
             */
            fun phone(phone: Optional<String>) = phone(phone.orElse(null))

            /**
             * A phone number that can be used to verify the cardholder via one-time passcode over
             * SMS.
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
                    checkRequired("digitalCardProfileId", digitalCardProfileId),
                    checkRequired("email", email),
                    checkRequired("phone", phone),
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

    /** This indicates if payments can be made with the card. */
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

            /** The card is active. */
            @JvmField val ACTIVE = of("active")

            /** The card is temporarily disabled. */
            @JvmField val DISABLED = of("disabled")

            /** The card is permanently canceled. */
            @JvmField val CANCELED = of("canceled")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            /** The card is active. */
            ACTIVE,
            /** The card is temporarily disabled. */
            DISABLED,
            /** The card is permanently canceled. */
            CANCELED,
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
            /** The card is active. */
            ACTIVE,
            /** The card is temporarily disabled. */
            DISABLED,
            /** The card is permanently canceled. */
            CANCELED,
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
                ACTIVE -> Value.ACTIVE
                DISABLED -> Value.DISABLED
                CANCELED -> Value.CANCELED
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
                ACTIVE -> Known.ACTIVE
                DISABLED -> Known.DISABLED
                CANCELED -> Known.CANCELED
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Status && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** A constant representing the object's type. For this resource it will always be `card`. */
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

            @JvmField val CARD = of("card")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            CARD
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
            CARD,
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
                CARD -> Value.CARD
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
                CARD -> Known.CARD
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Type && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Card && id == other.id && accountId == other.accountId && billingAddress == other.billingAddress && createdAt == other.createdAt && description == other.description && digitalWallet == other.digitalWallet && entityId == other.entityId && expirationMonth == other.expirationMonth && expirationYear == other.expirationYear && idempotencyKey == other.idempotencyKey && last4 == other.last4 && status == other.status && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, accountId, billingAddress, createdAt, description, digitalWallet, entityId, expirationMonth, expirationYear, idempotencyKey, last4, status, type, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Card{id=$id, accountId=$accountId, billingAddress=$billingAddress, createdAt=$createdAt, description=$description, digitalWallet=$digitalWallet, entityId=$entityId, expirationMonth=$expirationMonth, expirationYear=$expirationYear, idempotencyKey=$idempotencyKey, last4=$last4, status=$status, type=$type, additionalProperties=$additionalProperties}"
}
