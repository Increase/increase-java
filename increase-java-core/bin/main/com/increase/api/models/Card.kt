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
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
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
@JsonDeserialize(builder = Card.Builder::class)
@NoAutoDetect
class Card
private constructor(
    private val accountId: JsonField<String>,
    private val billingAddress: JsonField<BillingAddress>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val description: JsonField<String>,
    private val digitalWallet: JsonField<DigitalWallet>,
    private val entityId: JsonField<String>,
    private val expirationMonth: JsonField<Long>,
    private val expirationYear: JsonField<Long>,
    private val id: JsonField<String>,
    private val idempotencyKey: JsonField<String>,
    private val last4: JsonField<String>,
    private val status: JsonField<Status>,
    private val type: JsonField<Type>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

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

    /** The card identifier. */
    fun id(): String = id.getRequired("id")

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

    /** The identifier for the account this card belongs to. */
    @JsonProperty("account_id") @ExcludeMissing fun _accountId() = accountId

    /** The Card's billing address. */
    @JsonProperty("billing_address") @ExcludeMissing fun _billingAddress() = billingAddress

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the Card was
     * created.
     */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    /** The card's description for display purposes. */
    @JsonProperty("description") @ExcludeMissing fun _description() = description

    /**
     * The contact information used in the two-factor steps for digital wallet card creation. At
     * least one field must be present to complete the digital wallet steps.
     */
    @JsonProperty("digital_wallet") @ExcludeMissing fun _digitalWallet() = digitalWallet

    /** The identifier for the entity associated with this card. */
    @JsonProperty("entity_id") @ExcludeMissing fun _entityId() = entityId

    /** The month the card expires in M format (e.g., August is 8). */
    @JsonProperty("expiration_month") @ExcludeMissing fun _expirationMonth() = expirationMonth

    /** The year the card expires in YYYY format (e.g., 2025). */
    @JsonProperty("expiration_year") @ExcludeMissing fun _expirationYear() = expirationYear

    /** The card identifier. */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /**
     * The idempotency key you chose for this object. This value is unique across Increase and is
     * used to ensure that a request is only processed once. Learn more about
     * [idempotency](https://increase.com/documentation/idempotency-keys).
     */
    @JsonProperty("idempotency_key") @ExcludeMissing fun _idempotencyKey() = idempotencyKey

    /** The last 4 digits of the Card's Primary Account Number. */
    @JsonProperty("last4") @ExcludeMissing fun _last4() = last4

    /** This indicates if payments can be made with the card. */
    @JsonProperty("status") @ExcludeMissing fun _status() = status

    /** A constant representing the object's type. For this resource it will always be `card`. */
    @JsonProperty("type") @ExcludeMissing fun _type() = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): Card = apply {
        if (!validated) {
            accountId()
            billingAddress().validate()
            createdAt()
            description()
            digitalWallet().map { it.validate() }
            entityId()
            expirationMonth()
            expirationYear()
            id()
            idempotencyKey()
            last4()
            status()
            type()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var accountId: JsonField<String> = JsonMissing.of()
        private var billingAddress: JsonField<BillingAddress> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var digitalWallet: JsonField<DigitalWallet> = JsonMissing.of()
        private var entityId: JsonField<String> = JsonMissing.of()
        private var expirationMonth: JsonField<Long> = JsonMissing.of()
        private var expirationYear: JsonField<Long> = JsonMissing.of()
        private var id: JsonField<String> = JsonMissing.of()
        private var idempotencyKey: JsonField<String> = JsonMissing.of()
        private var last4: JsonField<String> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(card: Card) = apply {
            this.accountId = card.accountId
            this.billingAddress = card.billingAddress
            this.createdAt = card.createdAt
            this.description = card.description
            this.digitalWallet = card.digitalWallet
            this.entityId = card.entityId
            this.expirationMonth = card.expirationMonth
            this.expirationYear = card.expirationYear
            this.id = card.id
            this.idempotencyKey = card.idempotencyKey
            this.last4 = card.last4
            this.status = card.status
            this.type = card.type
            additionalProperties(card.additionalProperties)
        }

        /** The identifier for the account this card belongs to. */
        fun accountId(accountId: String) = accountId(JsonField.of(accountId))

        /** The identifier for the account this card belongs to. */
        @JsonProperty("account_id")
        @ExcludeMissing
        fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

        /** The Card's billing address. */
        fun billingAddress(billingAddress: BillingAddress) =
            billingAddress(JsonField.of(billingAddress))

        /** The Card's billing address. */
        @JsonProperty("billing_address")
        @ExcludeMissing
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
        @JsonProperty("created_at")
        @ExcludeMissing
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** The card's description for display purposes. */
        fun description(description: String) = description(JsonField.of(description))

        /** The card's description for display purposes. */
        @JsonProperty("description")
        @ExcludeMissing
        fun description(description: JsonField<String>) = apply { this.description = description }

        /**
         * The contact information used in the two-factor steps for digital wallet card creation. At
         * least one field must be present to complete the digital wallet steps.
         */
        fun digitalWallet(digitalWallet: DigitalWallet) = digitalWallet(JsonField.of(digitalWallet))

        /**
         * The contact information used in the two-factor steps for digital wallet card creation. At
         * least one field must be present to complete the digital wallet steps.
         */
        @JsonProperty("digital_wallet")
        @ExcludeMissing
        fun digitalWallet(digitalWallet: JsonField<DigitalWallet>) = apply {
            this.digitalWallet = digitalWallet
        }

        /** The identifier for the entity associated with this card. */
        fun entityId(entityId: String) = entityId(JsonField.of(entityId))

        /** The identifier for the entity associated with this card. */
        @JsonProperty("entity_id")
        @ExcludeMissing
        fun entityId(entityId: JsonField<String>) = apply { this.entityId = entityId }

        /** The month the card expires in M format (e.g., August is 8). */
        fun expirationMonth(expirationMonth: Long) = expirationMonth(JsonField.of(expirationMonth))

        /** The month the card expires in M format (e.g., August is 8). */
        @JsonProperty("expiration_month")
        @ExcludeMissing
        fun expirationMonth(expirationMonth: JsonField<Long>) = apply {
            this.expirationMonth = expirationMonth
        }

        /** The year the card expires in YYYY format (e.g., 2025). */
        fun expirationYear(expirationYear: Long) = expirationYear(JsonField.of(expirationYear))

        /** The year the card expires in YYYY format (e.g., 2025). */
        @JsonProperty("expiration_year")
        @ExcludeMissing
        fun expirationYear(expirationYear: JsonField<Long>) = apply {
            this.expirationYear = expirationYear
        }

        /** The card identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The card identifier. */
        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * The idempotency key you chose for this object. This value is unique across Increase and
         * is used to ensure that a request is only processed once. Learn more about
         * [idempotency](https://increase.com/documentation/idempotency-keys).
         */
        fun idempotencyKey(idempotencyKey: String) = idempotencyKey(JsonField.of(idempotencyKey))

        /**
         * The idempotency key you chose for this object. This value is unique across Increase and
         * is used to ensure that a request is only processed once. Learn more about
         * [idempotency](https://increase.com/documentation/idempotency-keys).
         */
        @JsonProperty("idempotency_key")
        @ExcludeMissing
        fun idempotencyKey(idempotencyKey: JsonField<String>) = apply {
            this.idempotencyKey = idempotencyKey
        }

        /** The last 4 digits of the Card's Primary Account Number. */
        fun last4(last4: String) = last4(JsonField.of(last4))

        /** The last 4 digits of the Card's Primary Account Number. */
        @JsonProperty("last4")
        @ExcludeMissing
        fun last4(last4: JsonField<String>) = apply { this.last4 = last4 }

        /** This indicates if payments can be made with the card. */
        fun status(status: Status) = status(JsonField.of(status))

        /** This indicates if payments can be made with the card. */
        @JsonProperty("status")
        @ExcludeMissing
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /**
         * A constant representing the object's type. For this resource it will always be `card`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * A constant representing the object's type. For this resource it will always be `card`.
         */
        @JsonProperty("type")
        @ExcludeMissing
        fun type(type: JsonField<Type>) = apply { this.type = type }

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

        fun build(): Card =
            Card(
                accountId,
                billingAddress,
                createdAt,
                description,
                digitalWallet,
                entityId,
                expirationMonth,
                expirationYear,
                id,
                idempotencyKey,
                last4,
                status,
                type,
                additionalProperties.toImmutable(),
            )
    }

    /** The Card's billing address. */
    @JsonDeserialize(builder = BillingAddress.Builder::class)
    @NoAutoDetect
    class BillingAddress
    private constructor(
        private val city: JsonField<String>,
        private val line1: JsonField<String>,
        private val line2: JsonField<String>,
        private val postalCode: JsonField<String>,
        private val state: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

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
        @JsonProperty("city") @ExcludeMissing fun _city() = city

        /** The first line of the billing address. */
        @JsonProperty("line1") @ExcludeMissing fun _line1() = line1

        /** The second line of the billing address. */
        @JsonProperty("line2") @ExcludeMissing fun _line2() = line2

        /** The postal code of the billing address. */
        @JsonProperty("postal_code") @ExcludeMissing fun _postalCode() = postalCode

        /** The US state of the billing address. */
        @JsonProperty("state") @ExcludeMissing fun _state() = state

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): BillingAddress = apply {
            if (!validated) {
                city()
                line1()
                line2()
                postalCode()
                state()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var city: JsonField<String> = JsonMissing.of()
            private var line1: JsonField<String> = JsonMissing.of()
            private var line2: JsonField<String> = JsonMissing.of()
            private var postalCode: JsonField<String> = JsonMissing.of()
            private var state: JsonField<String> = JsonMissing.of()
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
            fun city(city: String) = city(JsonField.of(city))

            /** The city of the billing address. */
            @JsonProperty("city")
            @ExcludeMissing
            fun city(city: JsonField<String>) = apply { this.city = city }

            /** The first line of the billing address. */
            fun line1(line1: String) = line1(JsonField.of(line1))

            /** The first line of the billing address. */
            @JsonProperty("line1")
            @ExcludeMissing
            fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

            /** The second line of the billing address. */
            fun line2(line2: String) = line2(JsonField.of(line2))

            /** The second line of the billing address. */
            @JsonProperty("line2")
            @ExcludeMissing
            fun line2(line2: JsonField<String>) = apply { this.line2 = line2 }

            /** The postal code of the billing address. */
            fun postalCode(postalCode: String) = postalCode(JsonField.of(postalCode))

            /** The postal code of the billing address. */
            @JsonProperty("postal_code")
            @ExcludeMissing
            fun postalCode(postalCode: JsonField<String>) = apply { this.postalCode = postalCode }

            /** The US state of the billing address. */
            fun state(state: String) = state(JsonField.of(state))

            /** The US state of the billing address. */
            @JsonProperty("state")
            @ExcludeMissing
            fun state(state: JsonField<String>) = apply { this.state = state }

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
                    city,
                    line1,
                    line2,
                    postalCode,
                    state,
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
     * The contact information used in the two-factor steps for digital wallet card creation. At
     * least one field must be present to complete the digital wallet steps.
     */
    @JsonDeserialize(builder = DigitalWallet.Builder::class)
    @NoAutoDetect
    class DigitalWallet
    private constructor(
        private val digitalCardProfileId: JsonField<String>,
        private val email: JsonField<String>,
        private val phone: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

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
        fun _digitalCardProfileId() = digitalCardProfileId

        /**
         * An email address that can be used to verify the cardholder via one-time passcode over
         * email.
         */
        @JsonProperty("email") @ExcludeMissing fun _email() = email

        /**
         * A phone number that can be used to verify the cardholder via one-time passcode over SMS.
         */
        @JsonProperty("phone") @ExcludeMissing fun _phone() = phone

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): DigitalWallet = apply {
            if (!validated) {
                digitalCardProfileId()
                email()
                phone()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var digitalCardProfileId: JsonField<String> = JsonMissing.of()
            private var email: JsonField<String> = JsonMissing.of()
            private var phone: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(digitalWallet: DigitalWallet) = apply {
                this.digitalCardProfileId = digitalWallet.digitalCardProfileId
                this.email = digitalWallet.email
                this.phone = digitalWallet.phone
                additionalProperties(digitalWallet.additionalProperties)
            }

            /**
             * The digital card profile assigned to this digital card. Card profiles may also be
             * assigned at the program level.
             */
            fun digitalCardProfileId(digitalCardProfileId: String) =
                digitalCardProfileId(JsonField.of(digitalCardProfileId))

            /**
             * The digital card profile assigned to this digital card. Card profiles may also be
             * assigned at the program level.
             */
            @JsonProperty("digital_card_profile_id")
            @ExcludeMissing
            fun digitalCardProfileId(digitalCardProfileId: JsonField<String>) = apply {
                this.digitalCardProfileId = digitalCardProfileId
            }

            /**
             * An email address that can be used to verify the cardholder via one-time passcode over
             * email.
             */
            fun email(email: String) = email(JsonField.of(email))

            /**
             * An email address that can be used to verify the cardholder via one-time passcode over
             * email.
             */
            @JsonProperty("email")
            @ExcludeMissing
            fun email(email: JsonField<String>) = apply { this.email = email }

            /**
             * A phone number that can be used to verify the cardholder via one-time passcode over
             * SMS.
             */
            fun phone(phone: String) = phone(JsonField.of(phone))

            /**
             * A phone number that can be used to verify the cardholder via one-time passcode over
             * SMS.
             */
            @JsonProperty("phone")
            @ExcludeMissing
            fun phone(phone: JsonField<String>) = apply { this.phone = phone }

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

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Status && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val ACTIVE = Status(JsonField.of("active"))

            @JvmField val DISABLED = Status(JsonField.of("disabled"))

            @JvmField val CANCELED = Status(JsonField.of("canceled"))

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
    }

    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Type && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val CARD = Type(JsonField.of("card"))

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            CARD,
        }

        enum class Value {
            CARD,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                CARD -> Value.CARD
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                CARD -> Known.CARD
                else -> throw IncreaseInvalidDataException("Unknown Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Card && this.accountId == other.accountId && this.billingAddress == other.billingAddress && this.createdAt == other.createdAt && this.description == other.description && this.digitalWallet == other.digitalWallet && this.entityId == other.entityId && this.expirationMonth == other.expirationMonth && this.expirationYear == other.expirationYear && this.id == other.id && this.idempotencyKey == other.idempotencyKey && this.last4 == other.last4 && this.status == other.status && this.type == other.type && this.additionalProperties == other.additionalProperties /* spotless:on */
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = /* spotless:off */ Objects.hash(accountId, billingAddress, createdAt, description, digitalWallet, entityId, expirationMonth, expirationYear, id, idempotencyKey, last4, status, type, additionalProperties) /* spotless:on */
        }
        return hashCode
    }

    override fun toString() =
        "Card{accountId=$accountId, billingAddress=$billingAddress, createdAt=$createdAt, description=$description, digitalWallet=$digitalWallet, entityId=$entityId, expirationMonth=$expirationMonth, expirationYear=$expirationYear, id=$id, idempotencyKey=$idempotencyKey, last4=$last4, status=$status, type=$type, additionalProperties=$additionalProperties}"
}
