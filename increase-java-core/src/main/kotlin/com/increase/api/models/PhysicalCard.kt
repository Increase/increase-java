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
 * Custom physical Visa cards that are shipped to your customers. The artwork is configurable by a
 * connected [Card Profile](/documentation/api#card-profiles). The same Card can be used for
 * multiple Physical Cards. Printing cards incurs a fee. Please contact
 * [support@increase.com](mailto:support@increase.com) for pricing!
 */
@JsonDeserialize(builder = PhysicalCard.Builder::class)
@NoAutoDetect
class PhysicalCard
private constructor(
    private val cardId: JsonField<String>,
    private val cardholder: JsonField<Cardholder>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val id: JsonField<String>,
    private val idempotencyKey: JsonField<String>,
    private val physicalCardProfileId: JsonField<String>,
    private val shipment: JsonField<Shipment>,
    private val status: JsonField<Status>,
    private val type: JsonField<Type>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    /** The identifier for the Card this Physical Card represents. */
    fun cardId(): String = cardId.getRequired("card_id")

    /** Details about the cardholder, as it appears on the printed card. */
    fun cardholder(): Cardholder = cardholder.getRequired("cardholder")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the Physical
     * Card was created.
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /** The physical card identifier. */
    fun id(): String = id.getRequired("id")

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

    /** The identifier for the Card this Physical Card represents. */
    @JsonProperty("card_id") @ExcludeMissing fun _cardId() = cardId

    /** Details about the cardholder, as it appears on the printed card. */
    @JsonProperty("cardholder") @ExcludeMissing fun _cardholder() = cardholder

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the Physical
     * Card was created.
     */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    /** The physical card identifier. */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /**
     * The idempotency key you chose for this object. This value is unique across Increase and is
     * used to ensure that a request is only processed once. Learn more about
     * [idempotency](https://increase.com/documentation/idempotency-keys).
     */
    @JsonProperty("idempotency_key") @ExcludeMissing fun _idempotencyKey() = idempotencyKey

    /** The Physical Card Profile used for this Physical Card. */
    @JsonProperty("physical_card_profile_id")
    @ExcludeMissing
    fun _physicalCardProfileId() = physicalCardProfileId

    /** The details used to ship this physical card. */
    @JsonProperty("shipment") @ExcludeMissing fun _shipment() = shipment

    /** The status of the Physical Card. */
    @JsonProperty("status") @ExcludeMissing fun _status() = status

    /**
     * A constant representing the object's type. For this resource it will always be
     * `physical_card`.
     */
    @JsonProperty("type") @ExcludeMissing fun _type() = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): PhysicalCard = apply {
        if (!validated) {
            cardId()
            cardholder().validate()
            createdAt()
            id()
            idempotencyKey()
            physicalCardProfileId()
            shipment().validate()
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

        private var cardId: JsonField<String> = JsonMissing.of()
        private var cardholder: JsonField<Cardholder> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var id: JsonField<String> = JsonMissing.of()
        private var idempotencyKey: JsonField<String> = JsonMissing.of()
        private var physicalCardProfileId: JsonField<String> = JsonMissing.of()
        private var shipment: JsonField<Shipment> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(physicalCard: PhysicalCard) = apply {
            cardId = physicalCard.cardId
            cardholder = physicalCard.cardholder
            createdAt = physicalCard.createdAt
            id = physicalCard.id
            idempotencyKey = physicalCard.idempotencyKey
            physicalCardProfileId = physicalCard.physicalCardProfileId
            shipment = physicalCard.shipment
            status = physicalCard.status
            type = physicalCard.type
            additionalProperties = physicalCard.additionalProperties.toMutableMap()
        }

        /** The identifier for the Card this Physical Card represents. */
        fun cardId(cardId: String) = cardId(JsonField.of(cardId))

        /** The identifier for the Card this Physical Card represents. */
        @JsonProperty("card_id")
        @ExcludeMissing
        fun cardId(cardId: JsonField<String>) = apply { this.cardId = cardId }

        /** Details about the cardholder, as it appears on the printed card. */
        fun cardholder(cardholder: Cardholder) = cardholder(JsonField.of(cardholder))

        /** Details about the cardholder, as it appears on the printed card. */
        @JsonProperty("cardholder")
        @ExcludeMissing
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
        @JsonProperty("created_at")
        @ExcludeMissing
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** The physical card identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The physical card identifier. */
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

        /** The Physical Card Profile used for this Physical Card. */
        fun physicalCardProfileId(physicalCardProfileId: String) =
            physicalCardProfileId(JsonField.of(physicalCardProfileId))

        /** The Physical Card Profile used for this Physical Card. */
        @JsonProperty("physical_card_profile_id")
        @ExcludeMissing
        fun physicalCardProfileId(physicalCardProfileId: JsonField<String>) = apply {
            this.physicalCardProfileId = physicalCardProfileId
        }

        /** The details used to ship this physical card. */
        fun shipment(shipment: Shipment) = shipment(JsonField.of(shipment))

        /** The details used to ship this physical card. */
        @JsonProperty("shipment")
        @ExcludeMissing
        fun shipment(shipment: JsonField<Shipment>) = apply { this.shipment = shipment }

        /** The status of the Physical Card. */
        fun status(status: Status) = status(JsonField.of(status))

        /** The status of the Physical Card. */
        @JsonProperty("status")
        @ExcludeMissing
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
        @JsonProperty("type")
        @ExcludeMissing
        fun type(type: JsonField<Type>) = apply { this.type = type }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        @JsonAnySetter
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
                cardId,
                cardholder,
                createdAt,
                id,
                idempotencyKey,
                physicalCardProfileId,
                shipment,
                status,
                type,
                additionalProperties.toImmutable(),
            )
    }

    /** Details about the cardholder, as it appears on the printed card. */
    @JsonDeserialize(builder = Cardholder.Builder::class)
    @NoAutoDetect
    class Cardholder
    private constructor(
        private val firstName: JsonField<String>,
        private val lastName: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The cardholder's first name. */
        fun firstName(): String = firstName.getRequired("first_name")

        /** The cardholder's last name. */
        fun lastName(): String = lastName.getRequired("last_name")

        /** The cardholder's first name. */
        @JsonProperty("first_name") @ExcludeMissing fun _firstName() = firstName

        /** The cardholder's last name. */
        @JsonProperty("last_name") @ExcludeMissing fun _lastName() = lastName

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Cardholder = apply {
            if (!validated) {
                firstName()
                lastName()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var firstName: JsonField<String> = JsonMissing.of()
            private var lastName: JsonField<String> = JsonMissing.of()
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
            @JsonProperty("first_name")
            @ExcludeMissing
            fun firstName(firstName: JsonField<String>) = apply { this.firstName = firstName }

            /** The cardholder's last name. */
            fun lastName(lastName: String) = lastName(JsonField.of(lastName))

            /** The cardholder's last name. */
            @JsonProperty("last_name")
            @ExcludeMissing
            fun lastName(lastName: JsonField<String>) = apply { this.lastName = lastName }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            @JsonAnySetter
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
                    firstName,
                    lastName,
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
    @JsonDeserialize(builder = Shipment.Builder::class)
    @NoAutoDetect
    class Shipment
    private constructor(
        private val address: JsonField<Address>,
        private val method: JsonField<Method>,
        private val status: JsonField<Status>,
        private val tracking: JsonField<Tracking>,
        private val additionalProperties: Map<String, JsonValue>,
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
        @JsonProperty("address") @ExcludeMissing fun _address() = address

        /** The shipping method. */
        @JsonProperty("method") @ExcludeMissing fun _method() = method

        /** The status of this shipment. */
        @JsonProperty("status") @ExcludeMissing fun _status() = status

        /** Tracking details for the shipment. */
        @JsonProperty("tracking") @ExcludeMissing fun _tracking() = tracking

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Shipment = apply {
            if (!validated) {
                address().validate()
                method()
                status()
                tracking().map { it.validate() }
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var address: JsonField<Address> = JsonMissing.of()
            private var method: JsonField<Method> = JsonMissing.of()
            private var status: JsonField<Status> = JsonMissing.of()
            private var tracking: JsonField<Tracking> = JsonMissing.of()
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
            @JsonProperty("address")
            @ExcludeMissing
            fun address(address: JsonField<Address>) = apply { this.address = address }

            /** The shipping method. */
            fun method(method: Method) = method(JsonField.of(method))

            /** The shipping method. */
            @JsonProperty("method")
            @ExcludeMissing
            fun method(method: JsonField<Method>) = apply { this.method = method }

            /** The status of this shipment. */
            fun status(status: Status) = status(JsonField.of(status))

            /** The status of this shipment. */
            @JsonProperty("status")
            @ExcludeMissing
            fun status(status: JsonField<Status>) = apply { this.status = status }

            /** Tracking details for the shipment. */
            fun tracking(tracking: Tracking) = tracking(JsonField.of(tracking))

            /** Tracking details for the shipment. */
            @JsonProperty("tracking")
            @ExcludeMissing
            fun tracking(tracking: JsonField<Tracking>) = apply { this.tracking = tracking }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            @JsonAnySetter
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
                    address,
                    method,
                    status,
                    tracking,
                    additionalProperties.toImmutable(),
                )
        }

        /** The location to where the card's packing label is addressed. */
        @JsonDeserialize(builder = Address.Builder::class)
        @NoAutoDetect
        class Address
        private constructor(
            private val city: JsonField<String>,
            private val line1: JsonField<String>,
            private val line2: JsonField<String>,
            private val line3: JsonField<String>,
            private val name: JsonField<String>,
            private val postalCode: JsonField<String>,
            private val state: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
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
            @JsonProperty("city") @ExcludeMissing fun _city() = city

            /** The first line of the shipping address. */
            @JsonProperty("line1") @ExcludeMissing fun _line1() = line1

            /** The second line of the shipping address. */
            @JsonProperty("line2") @ExcludeMissing fun _line2() = line2

            /** The third line of the shipping address. */
            @JsonProperty("line3") @ExcludeMissing fun _line3() = line3

            /** The name of the recipient. */
            @JsonProperty("name") @ExcludeMissing fun _name() = name

            /** The postal code of the shipping address. */
            @JsonProperty("postal_code") @ExcludeMissing fun _postalCode() = postalCode

            /** The US state of the shipping address. */
            @JsonProperty("state") @ExcludeMissing fun _state() = state

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Address = apply {
                if (!validated) {
                    city()
                    line1()
                    line2()
                    line3()
                    name()
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
                private var line3: JsonField<String> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var postalCode: JsonField<String> = JsonMissing.of()
                private var state: JsonField<String> = JsonMissing.of()
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
                @JsonProperty("city")
                @ExcludeMissing
                fun city(city: JsonField<String>) = apply { this.city = city }

                /** The first line of the shipping address. */
                fun line1(line1: String) = line1(JsonField.of(line1))

                /** The first line of the shipping address. */
                @JsonProperty("line1")
                @ExcludeMissing
                fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

                /** The second line of the shipping address. */
                fun line2(line2: String) = line2(JsonField.of(line2))

                /** The second line of the shipping address. */
                @JsonProperty("line2")
                @ExcludeMissing
                fun line2(line2: JsonField<String>) = apply { this.line2 = line2 }

                /** The third line of the shipping address. */
                fun line3(line3: String) = line3(JsonField.of(line3))

                /** The third line of the shipping address. */
                @JsonProperty("line3")
                @ExcludeMissing
                fun line3(line3: JsonField<String>) = apply { this.line3 = line3 }

                /** The name of the recipient. */
                fun name(name: String) = name(JsonField.of(name))

                /** The name of the recipient. */
                @JsonProperty("name")
                @ExcludeMissing
                fun name(name: JsonField<String>) = apply { this.name = name }

                /** The postal code of the shipping address. */
                fun postalCode(postalCode: String) = postalCode(JsonField.of(postalCode))

                /** The postal code of the shipping address. */
                @JsonProperty("postal_code")
                @ExcludeMissing
                fun postalCode(postalCode: JsonField<String>) = apply {
                    this.postalCode = postalCode
                }

                /** The US state of the shipping address. */
                fun state(state: String) = state(JsonField.of(state))

                /** The US state of the shipping address. */
                @JsonProperty("state")
                @ExcludeMissing
                fun state(state: JsonField<String>) = apply { this.state = state }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                @JsonAnySetter
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
                        city,
                        line1,
                        line2,
                        line3,
                        name,
                        postalCode,
                        state,
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

        class Method
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val USPS = of("usps")

                @JvmField val FEDEX_PRIORITY_OVERNIGHT = of("fedex_priority_overnight")

                @JvmField val FEDEX_2_DAY = of("fedex_2_day")

                @JvmStatic fun of(value: String) = Method(JsonField.of(value))
            }

            enum class Known {
                USPS,
                FEDEX_PRIORITY_OVERNIGHT,
                FEDEX_2_DAY,
            }

            enum class Value {
                USPS,
                FEDEX_PRIORITY_OVERNIGHT,
                FEDEX_2_DAY,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    USPS -> Value.USPS
                    FEDEX_PRIORITY_OVERNIGHT -> Value.FEDEX_PRIORITY_OVERNIGHT
                    FEDEX_2_DAY -> Value.FEDEX_2_DAY
                    else -> Value._UNKNOWN
                }

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

        class Status
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val PENDING = of("pending")

                @JvmField val CANCELED = of("canceled")

                @JvmField val SUBMITTED = of("submitted")

                @JvmField val ACKNOWLEDGED = of("acknowledged")

                @JvmField val REJECTED = of("rejected")

                @JvmField val SHIPPED = of("shipped")

                @JvmField val RETURNED = of("returned")

                @JvmStatic fun of(value: String) = Status(JsonField.of(value))
            }

            enum class Known {
                PENDING,
                CANCELED,
                SUBMITTED,
                ACKNOWLEDGED,
                REJECTED,
                SHIPPED,
                RETURNED,
            }

            enum class Value {
                PENDING,
                CANCELED,
                SUBMITTED,
                ACKNOWLEDGED,
                REJECTED,
                SHIPPED,
                RETURNED,
                _UNKNOWN,
            }

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
        @JsonDeserialize(builder = Tracking.Builder::class)
        @NoAutoDetect
        class Tracking
        private constructor(
            private val number: JsonField<String>,
            private val returnNumber: JsonField<String>,
            private val returnReason: JsonField<String>,
            private val shippedAt: JsonField<OffsetDateTime>,
            private val additionalProperties: Map<String, JsonValue>,
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
            @JsonProperty("number") @ExcludeMissing fun _number() = number

            /** For returned shipments, the tracking number of the return shipment. */
            @JsonProperty("return_number") @ExcludeMissing fun _returnNumber() = returnNumber

            /** For returned shipments, this describes why the package was returned. */
            @JsonProperty("return_reason") @ExcludeMissing fun _returnReason() = returnReason

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * fulfillment provider marked the card as ready for pick-up by the shipment carrier.
             */
            @JsonProperty("shipped_at") @ExcludeMissing fun _shippedAt() = shippedAt

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Tracking = apply {
                if (!validated) {
                    number()
                    returnNumber()
                    returnReason()
                    shippedAt()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var number: JsonField<String> = JsonMissing.of()
                private var returnNumber: JsonField<String> = JsonMissing.of()
                private var returnReason: JsonField<String> = JsonMissing.of()
                private var shippedAt: JsonField<OffsetDateTime> = JsonMissing.of()
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
                @JsonProperty("number")
                @ExcludeMissing
                fun number(number: JsonField<String>) = apply { this.number = number }

                /** For returned shipments, the tracking number of the return shipment. */
                fun returnNumber(returnNumber: String) = returnNumber(JsonField.of(returnNumber))

                /** For returned shipments, the tracking number of the return shipment. */
                @JsonProperty("return_number")
                @ExcludeMissing
                fun returnNumber(returnNumber: JsonField<String>) = apply {
                    this.returnNumber = returnNumber
                }

                /** For returned shipments, this describes why the package was returned. */
                fun returnReason(returnReason: String) = returnReason(JsonField.of(returnReason))

                /** For returned shipments, this describes why the package was returned. */
                @JsonProperty("return_reason")
                @ExcludeMissing
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
                @JsonProperty("shipped_at")
                @ExcludeMissing
                fun shippedAt(shippedAt: JsonField<OffsetDateTime>) = apply {
                    this.shippedAt = shippedAt
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                @JsonAnySetter
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
                        number,
                        returnNumber,
                        returnReason,
                        shippedAt,
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

    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val PHYSICAL_CARD = of("physical_card")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            PHYSICAL_CARD,
        }

        enum class Value {
            PHYSICAL_CARD,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                PHYSICAL_CARD -> Value.PHYSICAL_CARD
                else -> Value._UNKNOWN
            }

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

        return /* spotless:off */ other is PhysicalCard && cardId == other.cardId && cardholder == other.cardholder && createdAt == other.createdAt && id == other.id && idempotencyKey == other.idempotencyKey && physicalCardProfileId == other.physicalCardProfileId && shipment == other.shipment && status == other.status && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(cardId, cardholder, createdAt, id, idempotencyKey, physicalCardProfileId, shipment, status, type, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PhysicalCard{cardId=$cardId, cardholder=$cardholder, createdAt=$createdAt, id=$id, idempotencyKey=$idempotencyKey, physicalCardProfileId=$physicalCardProfileId, shipment=$shipment, status=$status, type=$type, additionalProperties=$additionalProperties}"
}
