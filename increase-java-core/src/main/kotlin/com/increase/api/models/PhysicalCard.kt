// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.toUnmodifiable
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
    private val id: JsonField<String>,
    private val cardId: JsonField<String>,
    private val cardProfileId: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val status: JsonField<Status>,
    private val cardholder: JsonField<Cardholder>,
    private val shipment: JsonField<Shipment>,
    private val type: JsonField<Type>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** The physical card identifier. */
    fun id(): String = id.getRequired("id")

    /** The identifier for the Card this Physical Card represents. */
    fun cardId(): String = cardId.getRequired("card_id")

    /** The Card Profile used for this Physical Card. */
    fun cardProfileId(): Optional<String> =
        Optional.ofNullable(cardProfileId.getNullable("card_profile_id"))

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the Physical
     * Card was created.
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /** The status of the Physical Card. */
    fun status(): Status = status.getRequired("status")

    /** Details about the cardholder, as it appears on the printed card. */
    fun cardholder(): Optional<Cardholder> =
        Optional.ofNullable(cardholder.getNullable("cardholder"))

    /** The details used to ship this physical card. */
    fun shipment(): Shipment = shipment.getRequired("shipment")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `physical_card`.
     */
    fun type(): Type = type.getRequired("type")

    /** The physical card identifier. */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /** The identifier for the Card this Physical Card represents. */
    @JsonProperty("card_id") @ExcludeMissing fun _cardId() = cardId

    /** The Card Profile used for this Physical Card. */
    @JsonProperty("card_profile_id") @ExcludeMissing fun _cardProfileId() = cardProfileId

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the Physical
     * Card was created.
     */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    /** The status of the Physical Card. */
    @JsonProperty("status") @ExcludeMissing fun _status() = status

    /** Details about the cardholder, as it appears on the printed card. */
    @JsonProperty("cardholder") @ExcludeMissing fun _cardholder() = cardholder

    /** The details used to ship this physical card. */
    @JsonProperty("shipment") @ExcludeMissing fun _shipment() = shipment

    /**
     * A constant representing the object's type. For this resource it will always be
     * `physical_card`.
     */
    @JsonProperty("type") @ExcludeMissing fun _type() = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): PhysicalCard = apply {
        if (!validated) {
            id()
            cardId()
            cardProfileId()
            createdAt()
            status()
            cardholder().map { it.validate() }
            shipment().validate()
            type()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PhysicalCard &&
            this.id == other.id &&
            this.cardId == other.cardId &&
            this.cardProfileId == other.cardProfileId &&
            this.createdAt == other.createdAt &&
            this.status == other.status &&
            this.cardholder == other.cardholder &&
            this.shipment == other.shipment &&
            this.type == other.type &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    id,
                    cardId,
                    cardProfileId,
                    createdAt,
                    status,
                    cardholder,
                    shipment,
                    type,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "PhysicalCard{id=$id, cardId=$cardId, cardProfileId=$cardProfileId, createdAt=$createdAt, status=$status, cardholder=$cardholder, shipment=$shipment, type=$type, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var cardId: JsonField<String> = JsonMissing.of()
        private var cardProfileId: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var cardholder: JsonField<Cardholder> = JsonMissing.of()
        private var shipment: JsonField<Shipment> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(physicalCard: PhysicalCard) = apply {
            this.id = physicalCard.id
            this.cardId = physicalCard.cardId
            this.cardProfileId = physicalCard.cardProfileId
            this.createdAt = physicalCard.createdAt
            this.status = physicalCard.status
            this.cardholder = physicalCard.cardholder
            this.shipment = physicalCard.shipment
            this.type = physicalCard.type
            additionalProperties(physicalCard.additionalProperties)
        }

        /** The physical card identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The physical card identifier. */
        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        /** The identifier for the Card this Physical Card represents. */
        fun cardId(cardId: String) = cardId(JsonField.of(cardId))

        /** The identifier for the Card this Physical Card represents. */
        @JsonProperty("card_id")
        @ExcludeMissing
        fun cardId(cardId: JsonField<String>) = apply { this.cardId = cardId }

        /** The Card Profile used for this Physical Card. */
        fun cardProfileId(cardProfileId: String) = cardProfileId(JsonField.of(cardProfileId))

        /** The Card Profile used for this Physical Card. */
        @JsonProperty("card_profile_id")
        @ExcludeMissing
        fun cardProfileId(cardProfileId: JsonField<String>) = apply {
            this.cardProfileId = cardProfileId
        }

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

        /** The status of the Physical Card. */
        fun status(status: Status) = status(JsonField.of(status))

        /** The status of the Physical Card. */
        @JsonProperty("status")
        @ExcludeMissing
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** Details about the cardholder, as it appears on the printed card. */
        fun cardholder(cardholder: Cardholder) = cardholder(JsonField.of(cardholder))

        /** Details about the cardholder, as it appears on the printed card. */
        @JsonProperty("cardholder")
        @ExcludeMissing
        fun cardholder(cardholder: JsonField<Cardholder>) = apply { this.cardholder = cardholder }

        /** The details used to ship this physical card. */
        fun shipment(shipment: Shipment) = shipment(JsonField.of(shipment))

        /** The details used to ship this physical card. */
        @JsonProperty("shipment")
        @ExcludeMissing
        fun shipment(shipment: JsonField<Shipment>) = apply { this.shipment = shipment }

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
            this.additionalProperties.putAll(additionalProperties)
        }

        @JsonAnySetter
        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            this.additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun build(): PhysicalCard =
            PhysicalCard(
                id,
                cardId,
                cardProfileId,
                createdAt,
                status,
                cardholder,
                shipment,
                type,
                additionalProperties.toUnmodifiable(),
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

        private var validated: Boolean = false

        private var hashCode: Int = 0

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

        fun validate(): Cardholder = apply {
            if (!validated) {
                firstName()
                lastName()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Cardholder &&
                this.firstName == other.firstName &&
                this.lastName == other.lastName &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        firstName,
                        lastName,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Cardholder{firstName=$firstName, lastName=$lastName, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var firstName: JsonField<String> = JsonMissing.of()
            private var lastName: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(cardholder: Cardholder) = apply {
                this.firstName = cardholder.firstName
                this.lastName = cardholder.lastName
                additionalProperties(cardholder.additionalProperties)
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
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): Cardholder =
                Cardholder(
                    firstName,
                    lastName,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    /** The details used to ship this physical card. */
    @JsonDeserialize(builder = Shipment.Builder::class)
    @NoAutoDetect
    class Shipment
    private constructor(
        private val method: JsonField<Method>,
        private val status: JsonField<Status>,
        private val tracking: JsonField<Tracking>,
        private val address: JsonField<Address>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /** The shipping method. */
        fun method(): Method = method.getRequired("method")

        /** The status of this shipment. */
        fun status(): Status = status.getRequired("status")

        /** Tracking details for the shipment. */
        fun tracking(): Optional<Tracking> = Optional.ofNullable(tracking.getNullable("tracking"))

        /** The location to where the card's packing label is addressed. */
        fun address(): Address = address.getRequired("address")

        /** The shipping method. */
        @JsonProperty("method") @ExcludeMissing fun _method() = method

        /** The status of this shipment. */
        @JsonProperty("status") @ExcludeMissing fun _status() = status

        /** Tracking details for the shipment. */
        @JsonProperty("tracking") @ExcludeMissing fun _tracking() = tracking

        /** The location to where the card's packing label is addressed. */
        @JsonProperty("address") @ExcludeMissing fun _address() = address

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Shipment = apply {
            if (!validated) {
                method()
                status()
                tracking().map { it.validate() }
                address().validate()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Shipment &&
                this.method == other.method &&
                this.status == other.status &&
                this.tracking == other.tracking &&
                this.address == other.address &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        method,
                        status,
                        tracking,
                        address,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Shipment{method=$method, status=$status, tracking=$tracking, address=$address, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var method: JsonField<Method> = JsonMissing.of()
            private var status: JsonField<Status> = JsonMissing.of()
            private var tracking: JsonField<Tracking> = JsonMissing.of()
            private var address: JsonField<Address> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(shipment: Shipment) = apply {
                this.method = shipment.method
                this.status = shipment.status
                this.tracking = shipment.tracking
                this.address = shipment.address
                additionalProperties(shipment.additionalProperties)
            }

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

            /** The location to where the card's packing label is addressed. */
            fun address(address: Address) = address(JsonField.of(address))

            /** The location to where the card's packing label is addressed. */
            @JsonProperty("address")
            @ExcludeMissing
            fun address(address: JsonField<Address>) = apply { this.address = address }

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

            fun build(): Shipment =
                Shipment(
                    method,
                    status,
                    tracking,
                    address,
                    additionalProperties.toUnmodifiable(),
                )
        }

        /** The location to where the card's packing label is addressed. */
        @JsonDeserialize(builder = Address.Builder::class)
        @NoAutoDetect
        class Address
        private constructor(
            private val name: JsonField<String>,
            private val line1: JsonField<String>,
            private val line2: JsonField<String>,
            private val line3: JsonField<String>,
            private val city: JsonField<String>,
            private val state: JsonField<String>,
            private val postalCode: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** The name of the recipient. */
            fun name(): String = name.getRequired("name")

            /** The first line of the shipping address. */
            fun line1(): String = line1.getRequired("line1")

            /** The second line of the shipping address. */
            fun line2(): Optional<String> = Optional.ofNullable(line2.getNullable("line2"))

            /** The third line of the shipping address. */
            fun line3(): Optional<String> = Optional.ofNullable(line3.getNullable("line3"))

            /** The city of the shipping address. */
            fun city(): String = city.getRequired("city")

            /** The US state of the shipping address. */
            fun state(): String = state.getRequired("state")

            /** The postal code of the shipping address. */
            fun postalCode(): String = postalCode.getRequired("postal_code")

            /** The name of the recipient. */
            @JsonProperty("name") @ExcludeMissing fun _name() = name

            /** The first line of the shipping address. */
            @JsonProperty("line1") @ExcludeMissing fun _line1() = line1

            /** The second line of the shipping address. */
            @JsonProperty("line2") @ExcludeMissing fun _line2() = line2

            /** The third line of the shipping address. */
            @JsonProperty("line3") @ExcludeMissing fun _line3() = line3

            /** The city of the shipping address. */
            @JsonProperty("city") @ExcludeMissing fun _city() = city

            /** The US state of the shipping address. */
            @JsonProperty("state") @ExcludeMissing fun _state() = state

            /** The postal code of the shipping address. */
            @JsonProperty("postal_code") @ExcludeMissing fun _postalCode() = postalCode

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Address = apply {
                if (!validated) {
                    name()
                    line1()
                    line2()
                    line3()
                    city()
                    state()
                    postalCode()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Address &&
                    this.name == other.name &&
                    this.line1 == other.line1 &&
                    this.line2 == other.line2 &&
                    this.line3 == other.line3 &&
                    this.city == other.city &&
                    this.state == other.state &&
                    this.postalCode == other.postalCode &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            name,
                            line1,
                            line2,
                            line3,
                            city,
                            state,
                            postalCode,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "Address{name=$name, line1=$line1, line2=$line2, line3=$line3, city=$city, state=$state, postalCode=$postalCode, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var name: JsonField<String> = JsonMissing.of()
                private var line1: JsonField<String> = JsonMissing.of()
                private var line2: JsonField<String> = JsonMissing.of()
                private var line3: JsonField<String> = JsonMissing.of()
                private var city: JsonField<String> = JsonMissing.of()
                private var state: JsonField<String> = JsonMissing.of()
                private var postalCode: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(address: Address) = apply {
                    this.name = address.name
                    this.line1 = address.line1
                    this.line2 = address.line2
                    this.line3 = address.line3
                    this.city = address.city
                    this.state = address.state
                    this.postalCode = address.postalCode
                    additionalProperties(address.additionalProperties)
                }

                /** The name of the recipient. */
                fun name(name: String) = name(JsonField.of(name))

                /** The name of the recipient. */
                @JsonProperty("name")
                @ExcludeMissing
                fun name(name: JsonField<String>) = apply { this.name = name }

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

                /** The city of the shipping address. */
                fun city(city: String) = city(JsonField.of(city))

                /** The city of the shipping address. */
                @JsonProperty("city")
                @ExcludeMissing
                fun city(city: JsonField<String>) = apply { this.city = city }

                /** The US state of the shipping address. */
                fun state(state: String) = state(JsonField.of(state))

                /** The US state of the shipping address. */
                @JsonProperty("state")
                @ExcludeMissing
                fun state(state: JsonField<String>) = apply { this.state = state }

                /** The postal code of the shipping address. */
                fun postalCode(postalCode: String) = postalCode(JsonField.of(postalCode))

                /** The postal code of the shipping address. */
                @JsonProperty("postal_code")
                @ExcludeMissing
                fun postalCode(postalCode: JsonField<String>) = apply {
                    this.postalCode = postalCode
                }

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

                fun build(): Address =
                    Address(
                        name,
                        line1,
                        line2,
                        line3,
                        city,
                        state,
                        postalCode,
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        class Method
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Method && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val USPS = Method(JsonField.of("usps"))

                @JvmField
                val FEDEX_PRIORITY_OVERNIGHT = Method(JsonField.of("fedex_priority_overnight"))

                @JvmField val FEDEX_2_DAY = Method(JsonField.of("fedex_2_day"))

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
        }

        class Status
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Status && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val PENDING = Status(JsonField.of("pending"))

                @JvmField val CANCELED = Status(JsonField.of("canceled"))

                @JvmField val SUBMITTED = Status(JsonField.of("submitted"))

                @JvmField val ACKNOWLEDGED = Status(JsonField.of("acknowledged"))

                @JvmField val REJECTED = Status(JsonField.of("rejected"))

                @JvmField val SHIPPED = Status(JsonField.of("shipped"))

                @JvmField val RETURNED = Status(JsonField.of("returned"))

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
        }

        /** Tracking details for the shipment. */
        @JsonDeserialize(builder = Tracking.Builder::class)
        @NoAutoDetect
        class Tracking
        private constructor(
            private val number: JsonField<String>,
            private val shippedAt: JsonField<OffsetDateTime>,
            private val returnReason: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** The tracking number. */
            fun number(): String = number.getRequired("number")

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * fulfillment provider marked the card as ready for pick-up by the shipment carrier.
             */
            fun shippedAt(): OffsetDateTime = shippedAt.getRequired("shipped_at")

            /** For returned shipments, this describes why the package was returned. */
            fun returnReason(): Optional<String> =
                Optional.ofNullable(returnReason.getNullable("return_reason"))

            /** The tracking number. */
            @JsonProperty("number") @ExcludeMissing fun _number() = number

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * fulfillment provider marked the card as ready for pick-up by the shipment carrier.
             */
            @JsonProperty("shipped_at") @ExcludeMissing fun _shippedAt() = shippedAt

            /** For returned shipments, this describes why the package was returned. */
            @JsonProperty("return_reason") @ExcludeMissing fun _returnReason() = returnReason

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Tracking = apply {
                if (!validated) {
                    number()
                    shippedAt()
                    returnReason()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Tracking &&
                    this.number == other.number &&
                    this.shippedAt == other.shippedAt &&
                    this.returnReason == other.returnReason &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            number,
                            shippedAt,
                            returnReason,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "Tracking{number=$number, shippedAt=$shippedAt, returnReason=$returnReason, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var number: JsonField<String> = JsonMissing.of()
                private var shippedAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var returnReason: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(tracking: Tracking) = apply {
                    this.number = tracking.number
                    this.shippedAt = tracking.shippedAt
                    this.returnReason = tracking.returnReason
                    additionalProperties(tracking.additionalProperties)
                }

                /** The tracking number. */
                fun number(number: String) = number(JsonField.of(number))

                /** The tracking number. */
                @JsonProperty("number")
                @ExcludeMissing
                fun number(number: JsonField<String>) = apply { this.number = number }

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

                /** For returned shipments, this describes why the package was returned. */
                fun returnReason(returnReason: String) = returnReason(JsonField.of(returnReason))

                /** For returned shipments, this describes why the package was returned. */
                @JsonProperty("return_reason")
                @ExcludeMissing
                fun returnReason(returnReason: JsonField<String>) = apply {
                    this.returnReason = returnReason
                }

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

                fun build(): Tracking =
                    Tracking(
                        number,
                        shippedAt,
                        returnReason,
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Status && this.value == other.value
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
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Type && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val PHYSICAL_CARD = Type(JsonField.of("physical_card"))

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
    }
}
