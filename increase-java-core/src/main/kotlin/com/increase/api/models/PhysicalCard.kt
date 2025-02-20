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
 * Custom physical Visa cards that are shipped to your customers. The artwork is configurable by a
 * connected [Card Profile](/documentation/api#card-profiles). The same Card can be used for
 * multiple Physical Cards. Printing cards incurs a fee. Please contact
 * [support@increase.com](mailto:support@increase.com) for pricing!
 */
@NoAutoDetect
class PhysicalCard
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("card_id")
    @ExcludeMissing
    private val cardId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("cardholder")
    @ExcludeMissing
    private val cardholder: JsonField<Cardholder> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("idempotency_key")
    @ExcludeMissing
    private val idempotencyKey: JsonField<String> = JsonMissing.of(),
    @JsonProperty("physical_card_profile_id")
    @ExcludeMissing
    private val physicalCardProfileId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("shipment")
    @ExcludeMissing
    private val shipment: JsonField<Shipment> = JsonMissing.of(),
    @JsonProperty("status")
    @ExcludeMissing
    private val status: JsonField<Status> = JsonMissing.of(),
    @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The physical card identifier. */
    fun id(): String = id.getRequired("id")

    /** The identifier for the Card this Physical Card represents. */
    fun cardId(): String = cardId.getRequired("card_id")

    /** Details about the cardholder, as it appears on the printed card. */
    fun cardholder(): Cardholder = cardholder.getRequired("cardholder")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the Physical
     * Card was created.
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * The idempotency key you chose for this object. This value is unique across Increase and is
     * used to ensure that a request is only processed once. Learn more about
     * [idempotency](https://increase.com/documentation/idempotency-keys).
     */
    fun idempotencyKey(): Optional<String> =
        Optional.ofNullable(idempotencyKey.getNullable("idempotency_key"))

    /** The Physical Card Profile used for this Physical Card. */
    fun physicalCardProfileId(): Optional<String> =
        Optional.ofNullable(physicalCardProfileId.getNullable("physical_card_profile_id"))

    /** The details used to ship this physical card. */
    fun shipment(): Shipment = shipment.getRequired("shipment")

    /** The status of the Physical Card. */
    fun status(): Status = status.getRequired("status")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `physical_card`.
     */
    fun type(): Type = type.getRequired("type")

    /** The physical card identifier. */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /** The identifier for the Card this Physical Card represents. */
    @JsonProperty("card_id") @ExcludeMissing fun _cardId(): JsonField<String> = cardId

    /** Details about the cardholder, as it appears on the printed card. */
    @JsonProperty("cardholder")
    @ExcludeMissing
    fun _cardholder(): JsonField<Cardholder> = cardholder

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the Physical
     * Card was created.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * The idempotency key you chose for this object. This value is unique across Increase and is
     * used to ensure that a request is only processed once. Learn more about
     * [idempotency](https://increase.com/documentation/idempotency-keys).
     */
    @JsonProperty("idempotency_key")
    @ExcludeMissing
    fun _idempotencyKey(): JsonField<String> = idempotencyKey

    /** The Physical Card Profile used for this Physical Card. */
    @JsonProperty("physical_card_profile_id")
    @ExcludeMissing
    fun _physicalCardProfileId(): JsonField<String> = physicalCardProfileId

    /** The details used to ship this physical card. */
    @JsonProperty("shipment") @ExcludeMissing fun _shipment(): JsonField<Shipment> = shipment

    /** The status of the Physical Card. */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * A constant representing the object's type. For this resource it will always be
     * `physical_card`.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): PhysicalCard = apply {
        if (validated) {
            return@apply
        }

        id()
        cardId()
        cardholder().validate()
        createdAt()
        idempotencyKey()
        physicalCardProfileId()
        shipment().validate()
        status()
        type()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PhysicalCard]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var cardId: JsonField<String>? = null
        private var cardholder: JsonField<Cardholder>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var idempotencyKey: JsonField<String>? = null
        private var physicalCardProfileId: JsonField<String>? = null
        private var shipment: JsonField<Shipment>? = null
        private var status: JsonField<Status>? = null
        private var type: JsonField<Type>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(physicalCard: PhysicalCard) = apply {
            id = physicalCard.id
            cardId = physicalCard.cardId
            cardholder = physicalCard.cardholder
            createdAt = physicalCard.createdAt
            idempotencyKey = physicalCard.idempotencyKey
            physicalCardProfileId = physicalCard.physicalCardProfileId
            shipment = physicalCard.shipment
            status = physicalCard.status
            type = physicalCard.type
            additionalProperties = physicalCard.additionalProperties.toMutableMap()
        }

        /** The physical card identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The physical card identifier. */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The identifier for the Card this Physical Card represents. */
        fun cardId(cardId: String) = cardId(JsonField.of(cardId))

        /** The identifier for the Card this Physical Card represents. */
        fun cardId(cardId: JsonField<String>) = apply { this.cardId = cardId }

        /** Details about the cardholder, as it appears on the printed card. */
        fun cardholder(cardholder: Cardholder) = cardholder(JsonField.of(cardholder))

        /** Details about the cardholder, as it appears on the printed card. */
        fun cardholder(cardholder: JsonField<Cardholder>) = apply { this.cardholder = cardholder }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
         * Physical Card was created.
         */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
         * Physical Card was created.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

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

        /** The Physical Card Profile used for this Physical Card. */
        fun physicalCardProfileId(physicalCardProfileId: String?) =
            physicalCardProfileId(JsonField.ofNullable(physicalCardProfileId))

        /** The Physical Card Profile used for this Physical Card. */
        fun physicalCardProfileId(physicalCardProfileId: Optional<String>) =
            physicalCardProfileId(physicalCardProfileId.orElse(null))

        /** The Physical Card Profile used for this Physical Card. */
        fun physicalCardProfileId(physicalCardProfileId: JsonField<String>) = apply {
            this.physicalCardProfileId = physicalCardProfileId
        }

        /** The details used to ship this physical card. */
        fun shipment(shipment: Shipment) = shipment(JsonField.of(shipment))

        /** The details used to ship this physical card. */
        fun shipment(shipment: JsonField<Shipment>) = apply { this.shipment = shipment }

        /** The status of the Physical Card. */
        fun status(status: Status) = status(JsonField.of(status))

        /** The status of the Physical Card. */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `physical_card`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * A constant representing the object's type. For this resource it will always be
         * `physical_card`.
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

        fun build(): PhysicalCard =
            PhysicalCard(
                checkRequired("id", id),
                checkRequired("cardId", cardId),
                checkRequired("cardholder", cardholder),
                checkRequired("createdAt", createdAt),
                checkRequired("idempotencyKey", idempotencyKey),
                checkRequired("physicalCardProfileId", physicalCardProfileId),
                checkRequired("shipment", shipment),
                checkRequired("status", status),
                checkRequired("type", type),
                additionalProperties.toImmutable(),
            )
    }

    /** Details about the cardholder, as it appears on the printed card. */
    @NoAutoDetect
    class Cardholder
    @JsonCreator
    private constructor(
        @JsonProperty("first_name")
        @ExcludeMissing
        private val firstName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("last_name")
        @ExcludeMissing
        private val lastName: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The cardholder's first name. */
        fun firstName(): String = firstName.getRequired("first_name")

        /** The cardholder's last name. */
        fun lastName(): String = lastName.getRequired("last_name")

        /** The cardholder's first name. */
        @JsonProperty("first_name") @ExcludeMissing fun _firstName(): JsonField<String> = firstName

        /** The cardholder's last name. */
        @JsonProperty("last_name") @ExcludeMissing fun _lastName(): JsonField<String> = lastName

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Cardholder = apply {
            if (validated) {
                return@apply
            }

            firstName()
            lastName()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Cardholder]. */
        class Builder internal constructor() {

            private var firstName: JsonField<String>? = null
            private var lastName: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(cardholder: Cardholder) = apply {
                firstName = cardholder.firstName
                lastName = cardholder.lastName
                additionalProperties = cardholder.additionalProperties.toMutableMap()
            }

            /** The cardholder's first name. */
            fun firstName(firstName: String) = firstName(JsonField.of(firstName))

            /** The cardholder's first name. */
            fun firstName(firstName: JsonField<String>) = apply { this.firstName = firstName }

            /** The cardholder's last name. */
            fun lastName(lastName: String) = lastName(JsonField.of(lastName))

            /** The cardholder's last name. */
            fun lastName(lastName: JsonField<String>) = apply { this.lastName = lastName }

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

            fun build(): Cardholder =
                Cardholder(
                    checkRequired("firstName", firstName),
                    checkRequired("lastName", lastName),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Cardholder && firstName == other.firstName && lastName == other.lastName && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(firstName, lastName, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Cardholder{firstName=$firstName, lastName=$lastName, additionalProperties=$additionalProperties}"
    }

    /** The details used to ship this physical card. */
    @NoAutoDetect
    class Shipment
    @JsonCreator
    private constructor(
        @JsonProperty("address")
        @ExcludeMissing
        private val address: JsonField<Address> = JsonMissing.of(),
        @JsonProperty("method")
        @ExcludeMissing
        private val method: JsonField<Method> = JsonMissing.of(),
        @JsonProperty("status")
        @ExcludeMissing
        private val status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("tracking")
        @ExcludeMissing
        private val tracking: JsonField<Tracking> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The location to where the card's packing label is addressed. */
        fun address(): Address = address.getRequired("address")

        /** The shipping method. */
        fun method(): Method = method.getRequired("method")

        /** The status of this shipment. */
        fun status(): Status = status.getRequired("status")

        /** Tracking details for the shipment. */
        fun tracking(): Optional<Tracking> = Optional.ofNullable(tracking.getNullable("tracking"))

        /** The location to where the card's packing label is addressed. */
        @JsonProperty("address") @ExcludeMissing fun _address(): JsonField<Address> = address

        /** The shipping method. */
        @JsonProperty("method") @ExcludeMissing fun _method(): JsonField<Method> = method

        /** The status of this shipment. */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

        /** Tracking details for the shipment. */
        @JsonProperty("tracking") @ExcludeMissing fun _tracking(): JsonField<Tracking> = tracking

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Shipment = apply {
            if (validated) {
                return@apply
            }

            address().validate()
            method()
            status()
            tracking().ifPresent { it.validate() }
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Shipment]. */
        class Builder internal constructor() {

            private var address: JsonField<Address>? = null
            private var method: JsonField<Method>? = null
            private var status: JsonField<Status>? = null
            private var tracking: JsonField<Tracking>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(shipment: Shipment) = apply {
                address = shipment.address
                method = shipment.method
                status = shipment.status
                tracking = shipment.tracking
                additionalProperties = shipment.additionalProperties.toMutableMap()
            }

            /** The location to where the card's packing label is addressed. */
            fun address(address: Address) = address(JsonField.of(address))

            /** The location to where the card's packing label is addressed. */
            fun address(address: JsonField<Address>) = apply { this.address = address }

            /** The shipping method. */
            fun method(method: Method) = method(JsonField.of(method))

            /** The shipping method. */
            fun method(method: JsonField<Method>) = apply { this.method = method }

            /** The status of this shipment. */
            fun status(status: Status) = status(JsonField.of(status))

            /** The status of this shipment. */
            fun status(status: JsonField<Status>) = apply { this.status = status }

            /** Tracking details for the shipment. */
            fun tracking(tracking: Tracking?) = tracking(JsonField.ofNullable(tracking))

            /** Tracking details for the shipment. */
            fun tracking(tracking: Optional<Tracking>) = tracking(tracking.orElse(null))

            /** Tracking details for the shipment. */
            fun tracking(tracking: JsonField<Tracking>) = apply { this.tracking = tracking }

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

            fun build(): Shipment =
                Shipment(
                    checkRequired("address", address),
                    checkRequired("method", method),
                    checkRequired("status", status),
                    checkRequired("tracking", tracking),
                    additionalProperties.toImmutable(),
                )
        }

        /** The location to where the card's packing label is addressed. */
        @NoAutoDetect
        class Address
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
            @JsonProperty("line3")
            @ExcludeMissing
            private val line3: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name")
            @ExcludeMissing
            private val name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("postal_code")
            @ExcludeMissing
            private val postalCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("state")
            @ExcludeMissing
            private val state: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The city of the shipping address. */
            fun city(): String = city.getRequired("city")

            /** The first line of the shipping address. */
            fun line1(): String = line1.getRequired("line1")

            /** The second line of the shipping address. */
            fun line2(): Optional<String> = Optional.ofNullable(line2.getNullable("line2"))

            /** The third line of the shipping address. */
            fun line3(): Optional<String> = Optional.ofNullable(line3.getNullable("line3"))

            /** The name of the recipient. */
            fun name(): String = name.getRequired("name")

            /** The postal code of the shipping address. */
            fun postalCode(): String = postalCode.getRequired("postal_code")

            /** The US state of the shipping address. */
            fun state(): String = state.getRequired("state")

            /** The city of the shipping address. */
            @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

            /** The first line of the shipping address. */
            @JsonProperty("line1") @ExcludeMissing fun _line1(): JsonField<String> = line1

            /** The second line of the shipping address. */
            @JsonProperty("line2") @ExcludeMissing fun _line2(): JsonField<String> = line2

            /** The third line of the shipping address. */
            @JsonProperty("line3") @ExcludeMissing fun _line3(): JsonField<String> = line3

            /** The name of the recipient. */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /** The postal code of the shipping address. */
            @JsonProperty("postal_code")
            @ExcludeMissing
            fun _postalCode(): JsonField<String> = postalCode

            /** The US state of the shipping address. */
            @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<String> = state

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Address = apply {
                if (validated) {
                    return@apply
                }

                city()
                line1()
                line2()
                line3()
                name()
                postalCode()
                state()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Address]. */
            class Builder internal constructor() {

                private var city: JsonField<String>? = null
                private var line1: JsonField<String>? = null
                private var line2: JsonField<String>? = null
                private var line3: JsonField<String>? = null
                private var name: JsonField<String>? = null
                private var postalCode: JsonField<String>? = null
                private var state: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(address: Address) = apply {
                    city = address.city
                    line1 = address.line1
                    line2 = address.line2
                    line3 = address.line3
                    name = address.name
                    postalCode = address.postalCode
                    state = address.state
                    additionalProperties = address.additionalProperties.toMutableMap()
                }

                /** The city of the shipping address. */
                fun city(city: String) = city(JsonField.of(city))

                /** The city of the shipping address. */
                fun city(city: JsonField<String>) = apply { this.city = city }

                /** The first line of the shipping address. */
                fun line1(line1: String) = line1(JsonField.of(line1))

                /** The first line of the shipping address. */
                fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

                /** The second line of the shipping address. */
                fun line2(line2: String?) = line2(JsonField.ofNullable(line2))

                /** The second line of the shipping address. */
                fun line2(line2: Optional<String>) = line2(line2.orElse(null))

                /** The second line of the shipping address. */
                fun line2(line2: JsonField<String>) = apply { this.line2 = line2 }

                /** The third line of the shipping address. */
                fun line3(line3: String?) = line3(JsonField.ofNullable(line3))

                /** The third line of the shipping address. */
                fun line3(line3: Optional<String>) = line3(line3.orElse(null))

                /** The third line of the shipping address. */
                fun line3(line3: JsonField<String>) = apply { this.line3 = line3 }

                /** The name of the recipient. */
                fun name(name: String) = name(JsonField.of(name))

                /** The name of the recipient. */
                fun name(name: JsonField<String>) = apply { this.name = name }

                /** The postal code of the shipping address. */
                fun postalCode(postalCode: String) = postalCode(JsonField.of(postalCode))

                /** The postal code of the shipping address. */
                fun postalCode(postalCode: JsonField<String>) = apply {
                    this.postalCode = postalCode
                }

                /** The US state of the shipping address. */
                fun state(state: String) = state(JsonField.of(state))

                /** The US state of the shipping address. */
                fun state(state: JsonField<String>) = apply { this.state = state }

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

                fun build(): Address =
                    Address(
                        checkRequired("city", city),
                        checkRequired("line1", line1),
                        checkRequired("line2", line2),
                        checkRequired("line3", line3),
                        checkRequired("name", name),
                        checkRequired("postalCode", postalCode),
                        checkRequired("state", state),
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Address && city == other.city && line1 == other.line1 && line2 == other.line2 && line3 == other.line3 && name == other.name && postalCode == other.postalCode && state == other.state && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(city, line1, line2, line3, name, postalCode, state, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Address{city=$city, line1=$line1, line2=$line2, line3=$line3, name=$name, postalCode=$postalCode, state=$state, additionalProperties=$additionalProperties}"
        }

        /** The shipping method. */
        class Method @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                /** USPS Post with tracking. */
                @JvmField val USPS = of("usps")

                /** FedEx Priority Overnight, no signature. */
                @JvmField val FEDEX_PRIORITY_OVERNIGHT = of("fedex_priority_overnight")

                /** FedEx 2-day. */
                @JvmField val FEDEX_2_DAY = of("fedex_2_day")

                @JvmStatic fun of(value: String) = Method(JsonField.of(value))
            }

            /** An enum containing [Method]'s known values. */
            enum class Known {
                /** USPS Post with tracking. */
                USPS,
                /** FedEx Priority Overnight, no signature. */
                FEDEX_PRIORITY_OVERNIGHT,
                /** FedEx 2-day. */
                FEDEX_2_DAY,
            }

            /**
             * An enum containing [Method]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Method] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                /** USPS Post with tracking. */
                USPS,
                /** FedEx Priority Overnight, no signature. */
                FEDEX_PRIORITY_OVERNIGHT,
                /** FedEx 2-day. */
                FEDEX_2_DAY,
                /**
                 * An enum member indicating that [Method] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    USPS -> Value.USPS
                    FEDEX_PRIORITY_OVERNIGHT -> Value.FEDEX_PRIORITY_OVERNIGHT
                    FEDEX_2_DAY -> Value.FEDEX_2_DAY
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws IncreaseInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    USPS -> Known.USPS
                    FEDEX_PRIORITY_OVERNIGHT -> Known.FEDEX_PRIORITY_OVERNIGHT
                    FEDEX_2_DAY -> Known.FEDEX_2_DAY
                    else -> throw IncreaseInvalidDataException("Unknown Method: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Method && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** The status of this shipment. */
        class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                /** The physical card has not yet been shipped. */
                @JvmField val PENDING = of("pending")

                /** The physical card shipment was canceled prior to submission. */
                @JvmField val CANCELED = of("canceled")

                /**
                 * The physical card shipment has been submitted to the card fulfillment provider.
                 */
                @JvmField val SUBMITTED = of("submitted")

                /**
                 * The physical card shipment has been acknowledged by the card fulfillment provider
                 * and will be processed in their next batch.
                 */
                @JvmField val ACKNOWLEDGED = of("acknowledged")

                /** The physical card shipment was rejected by the card printer due to an error. */
                @JvmField val REJECTED = of("rejected")

                /** The physical card has been shipped. */
                @JvmField val SHIPPED = of("shipped")

                /**
                 * The physical card shipment was returned to the sender and destroyed by the
                 * production facility.
                 */
                @JvmField val RETURNED = of("returned")

                @JvmStatic fun of(value: String) = Status(JsonField.of(value))
            }

            /** An enum containing [Status]'s known values. */
            enum class Known {
                /** The physical card has not yet been shipped. */
                PENDING,
                /** The physical card shipment was canceled prior to submission. */
                CANCELED,
                /**
                 * The physical card shipment has been submitted to the card fulfillment provider.
                 */
                SUBMITTED,
                /**
                 * The physical card shipment has been acknowledged by the card fulfillment provider
                 * and will be processed in their next batch.
                 */
                ACKNOWLEDGED,
                /** The physical card shipment was rejected by the card printer due to an error. */
                REJECTED,
                /** The physical card has been shipped. */
                SHIPPED,
                /**
                 * The physical card shipment was returned to the sender and destroyed by the
                 * production facility.
                 */
                RETURNED,
            }

            /**
             * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Status] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                /** The physical card has not yet been shipped. */
                PENDING,
                /** The physical card shipment was canceled prior to submission. */
                CANCELED,
                /**
                 * The physical card shipment has been submitted to the card fulfillment provider.
                 */
                SUBMITTED,
                /**
                 * The physical card shipment has been acknowledged by the card fulfillment provider
                 * and will be processed in their next batch.
                 */
                ACKNOWLEDGED,
                /** The physical card shipment was rejected by the card printer due to an error. */
                REJECTED,
                /** The physical card has been shipped. */
                SHIPPED,
                /**
                 * The physical card shipment was returned to the sender and destroyed by the
                 * production facility.
                 */
                RETURNED,
                /**
                 * An enum member indicating that [Status] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    PENDING -> Value.PENDING
                    CANCELED -> Value.CANCELED
                    SUBMITTED -> Value.SUBMITTED
                    ACKNOWLEDGED -> Value.ACKNOWLEDGED
                    REJECTED -> Value.REJECTED
                    SHIPPED -> Value.SHIPPED
                    RETURNED -> Value.RETURNED
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws IncreaseInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    PENDING -> Known.PENDING
                    CANCELED -> Known.CANCELED
                    SUBMITTED -> Known.SUBMITTED
                    ACKNOWLEDGED -> Known.ACKNOWLEDGED
                    REJECTED -> Known.REJECTED
                    SHIPPED -> Known.SHIPPED
                    RETURNED -> Known.RETURNED
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

        /** Tracking details for the shipment. */
        @NoAutoDetect
        class Tracking
        @JsonCreator
        private constructor(
            @JsonProperty("number")
            @ExcludeMissing
            private val number: JsonField<String> = JsonMissing.of(),
            @JsonProperty("return_number")
            @ExcludeMissing
            private val returnNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("return_reason")
            @ExcludeMissing
            private val returnReason: JsonField<String> = JsonMissing.of(),
            @JsonProperty("shipped_at")
            @ExcludeMissing
            private val shippedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The tracking number. */
            fun number(): String = number.getRequired("number")

            /** For returned shipments, the tracking number of the return shipment. */
            fun returnNumber(): Optional<String> =
                Optional.ofNullable(returnNumber.getNullable("return_number"))

            /** For returned shipments, this describes why the package was returned. */
            fun returnReason(): Optional<String> =
                Optional.ofNullable(returnReason.getNullable("return_reason"))

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * fulfillment provider marked the card as ready for pick-up by the shipment carrier.
             */
            fun shippedAt(): OffsetDateTime = shippedAt.getRequired("shipped_at")

            /** The tracking number. */
            @JsonProperty("number") @ExcludeMissing fun _number(): JsonField<String> = number

            /** For returned shipments, the tracking number of the return shipment. */
            @JsonProperty("return_number")
            @ExcludeMissing
            fun _returnNumber(): JsonField<String> = returnNumber

            /** For returned shipments, this describes why the package was returned. */
            @JsonProperty("return_reason")
            @ExcludeMissing
            fun _returnReason(): JsonField<String> = returnReason

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * fulfillment provider marked the card as ready for pick-up by the shipment carrier.
             */
            @JsonProperty("shipped_at")
            @ExcludeMissing
            fun _shippedAt(): JsonField<OffsetDateTime> = shippedAt

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Tracking = apply {
                if (validated) {
                    return@apply
                }

                number()
                returnNumber()
                returnReason()
                shippedAt()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Tracking]. */
            class Builder internal constructor() {

                private var number: JsonField<String>? = null
                private var returnNumber: JsonField<String>? = null
                private var returnReason: JsonField<String>? = null
                private var shippedAt: JsonField<OffsetDateTime>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(tracking: Tracking) = apply {
                    number = tracking.number
                    returnNumber = tracking.returnNumber
                    returnReason = tracking.returnReason
                    shippedAt = tracking.shippedAt
                    additionalProperties = tracking.additionalProperties.toMutableMap()
                }

                /** The tracking number. */
                fun number(number: String) = number(JsonField.of(number))

                /** The tracking number. */
                fun number(number: JsonField<String>) = apply { this.number = number }

                /** For returned shipments, the tracking number of the return shipment. */
                fun returnNumber(returnNumber: String?) =
                    returnNumber(JsonField.ofNullable(returnNumber))

                /** For returned shipments, the tracking number of the return shipment. */
                fun returnNumber(returnNumber: Optional<String>) =
                    returnNumber(returnNumber.orElse(null))

                /** For returned shipments, the tracking number of the return shipment. */
                fun returnNumber(returnNumber: JsonField<String>) = apply {
                    this.returnNumber = returnNumber
                }

                /** For returned shipments, this describes why the package was returned. */
                fun returnReason(returnReason: String?) =
                    returnReason(JsonField.ofNullable(returnReason))

                /** For returned shipments, this describes why the package was returned. */
                fun returnReason(returnReason: Optional<String>) =
                    returnReason(returnReason.orElse(null))

                /** For returned shipments, this describes why the package was returned. */
                fun returnReason(returnReason: JsonField<String>) = apply {
                    this.returnReason = returnReason
                }

                /**
                 * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
                 * fulfillment provider marked the card as ready for pick-up by the shipment
                 * carrier.
                 */
                fun shippedAt(shippedAt: OffsetDateTime) = shippedAt(JsonField.of(shippedAt))

                /**
                 * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
                 * fulfillment provider marked the card as ready for pick-up by the shipment
                 * carrier.
                 */
                fun shippedAt(shippedAt: JsonField<OffsetDateTime>) = apply {
                    this.shippedAt = shippedAt
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

                fun build(): Tracking =
                    Tracking(
                        checkRequired("number", number),
                        checkRequired("returnNumber", returnNumber),
                        checkRequired("returnReason", returnReason),
                        checkRequired("shippedAt", shippedAt),
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Tracking && number == other.number && returnNumber == other.returnNumber && returnReason == other.returnReason && shippedAt == other.shippedAt && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(number, returnNumber, returnReason, shippedAt, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Tracking{number=$number, returnNumber=$returnNumber, returnReason=$returnReason, shippedAt=$shippedAt, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Shipment && address == other.address && method == other.method && status == other.status && tracking == other.tracking && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(address, method, status, tracking, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Shipment{address=$address, method=$method, status=$status, tracking=$tracking, additionalProperties=$additionalProperties}"
    }

    /** The status of the Physical Card. */
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

            /** The physical card is active. */
            @JvmField val ACTIVE = of("active")

            /** The physical card is temporarily disabled. */
            @JvmField val DISABLED = of("disabled")

            /** The physical card is permanently canceled. */
            @JvmField val CANCELED = of("canceled")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            /** The physical card is active. */
            ACTIVE,
            /** The physical card is temporarily disabled. */
            DISABLED,
            /** The physical card is permanently canceled. */
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
            /** The physical card is active. */
            ACTIVE,
            /** The physical card is temporarily disabled. */
            DISABLED,
            /** The physical card is permanently canceled. */
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

    /**
     * A constant representing the object's type. For this resource it will always be
     * `physical_card`.
     */
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

            @JvmField val PHYSICAL_CARD = of("physical_card")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            PHYSICAL_CARD
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
            PHYSICAL_CARD,
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
                PHYSICAL_CARD -> Value.PHYSICAL_CARD
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
                PHYSICAL_CARD -> Known.PHYSICAL_CARD
                else -> throw IncreaseInvalidDataException("Unknown Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

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

        return /* spotless:off */ other is PhysicalCard && id == other.id && cardId == other.cardId && cardholder == other.cardholder && createdAt == other.createdAt && idempotencyKey == other.idempotencyKey && physicalCardProfileId == other.physicalCardProfileId && shipment == other.shipment && status == other.status && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, cardId, cardholder, createdAt, idempotencyKey, physicalCardProfileId, shipment, status, type, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PhysicalCard{id=$id, cardId=$cardId, cardholder=$cardholder, createdAt=$createdAt, idempotencyKey=$idempotencyKey, physicalCardProfileId=$physicalCardProfileId, shipment=$shipment, status=$status, type=$type, additionalProperties=$additionalProperties}"
}
