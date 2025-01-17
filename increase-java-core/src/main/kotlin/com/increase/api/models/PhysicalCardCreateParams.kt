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
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import com.increase.api.core.immutableEmptyMap
import com.increase.api.core.toImmutable
import com.increase.api.errors.IncreaseInvalidDataException
import java.util.Objects
import java.util.Optional

/** Create a Physical Card */
class PhysicalCardCreateParams
constructor(
    private val body: PhysicalCardCreateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    /** The underlying card representing this physical card. */
    fun cardId(): String = body.cardId()

    /** Details about the cardholder, as it will appear on the physical card. */
    fun cardholder(): Cardholder = body.cardholder()

    /** The details used to ship this physical card. */
    fun shipment(): Shipment = body.shipment()

    /**
     * The physical card profile to use for this physical card. The latest default physical card
     * profile will be used if not provided.
     */
    fun physicalCardProfileId(): Optional<String> = body.physicalCardProfileId()

    /** The underlying card representing this physical card. */
    fun _cardId(): JsonField<String> = body._cardId()

    /** Details about the cardholder, as it will appear on the physical card. */
    fun _cardholder(): JsonField<Cardholder> = body._cardholder()

    /** The details used to ship this physical card. */
    fun _shipment(): JsonField<Shipment> = body._shipment()

    /**
     * The physical card profile to use for this physical card. The latest default physical card
     * profile will be used if not provided.
     */
    fun _physicalCardProfileId(): JsonField<String> = body._physicalCardProfileId()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun getBody(): PhysicalCardCreateBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class PhysicalCardCreateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("card_id")
        @ExcludeMissing
        private val cardId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("cardholder")
        @ExcludeMissing
        private val cardholder: JsonField<Cardholder> = JsonMissing.of(),
        @JsonProperty("shipment")
        @ExcludeMissing
        private val shipment: JsonField<Shipment> = JsonMissing.of(),
        @JsonProperty("physical_card_profile_id")
        @ExcludeMissing
        private val physicalCardProfileId: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The underlying card representing this physical card. */
        fun cardId(): String = cardId.getRequired("card_id")

        /** Details about the cardholder, as it will appear on the physical card. */
        fun cardholder(): Cardholder = cardholder.getRequired("cardholder")

        /** The details used to ship this physical card. */
        fun shipment(): Shipment = shipment.getRequired("shipment")

        /**
         * The physical card profile to use for this physical card. The latest default physical card
         * profile will be used if not provided.
         */
        fun physicalCardProfileId(): Optional<String> =
            Optional.ofNullable(physicalCardProfileId.getNullable("physical_card_profile_id"))

        /** The underlying card representing this physical card. */
        @JsonProperty("card_id") @ExcludeMissing fun _cardId(): JsonField<String> = cardId

        /** Details about the cardholder, as it will appear on the physical card. */
        @JsonProperty("cardholder")
        @ExcludeMissing
        fun _cardholder(): JsonField<Cardholder> = cardholder

        /** The details used to ship this physical card. */
        @JsonProperty("shipment") @ExcludeMissing fun _shipment(): JsonField<Shipment> = shipment

        /**
         * The physical card profile to use for this physical card. The latest default physical card
         * profile will be used if not provided.
         */
        @JsonProperty("physical_card_profile_id")
        @ExcludeMissing
        fun _physicalCardProfileId(): JsonField<String> = physicalCardProfileId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): PhysicalCardCreateBody = apply {
            if (validated) {
                return@apply
            }

            cardId()
            cardholder().validate()
            shipment().validate()
            physicalCardProfileId()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var cardId: JsonField<String>? = null
            private var cardholder: JsonField<Cardholder>? = null
            private var shipment: JsonField<Shipment>? = null
            private var physicalCardProfileId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(physicalCardCreateBody: PhysicalCardCreateBody) = apply {
                cardId = physicalCardCreateBody.cardId
                cardholder = physicalCardCreateBody.cardholder
                shipment = physicalCardCreateBody.shipment
                physicalCardProfileId = physicalCardCreateBody.physicalCardProfileId
                additionalProperties = physicalCardCreateBody.additionalProperties.toMutableMap()
            }

            /** The underlying card representing this physical card. */
            fun cardId(cardId: String) = cardId(JsonField.of(cardId))

            /** The underlying card representing this physical card. */
            fun cardId(cardId: JsonField<String>) = apply { this.cardId = cardId }

            /** Details about the cardholder, as it will appear on the physical card. */
            fun cardholder(cardholder: Cardholder) = cardholder(JsonField.of(cardholder))

            /** Details about the cardholder, as it will appear on the physical card. */
            fun cardholder(cardholder: JsonField<Cardholder>) = apply {
                this.cardholder = cardholder
            }

            /** The details used to ship this physical card. */
            fun shipment(shipment: Shipment) = shipment(JsonField.of(shipment))

            /** The details used to ship this physical card. */
            fun shipment(shipment: JsonField<Shipment>) = apply { this.shipment = shipment }

            /**
             * The physical card profile to use for this physical card. The latest default physical
             * card profile will be used if not provided.
             */
            fun physicalCardProfileId(physicalCardProfileId: String) =
                physicalCardProfileId(JsonField.of(physicalCardProfileId))

            /**
             * The physical card profile to use for this physical card. The latest default physical
             * card profile will be used if not provided.
             */
            fun physicalCardProfileId(physicalCardProfileId: JsonField<String>) = apply {
                this.physicalCardProfileId = physicalCardProfileId
            }

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

            fun build(): PhysicalCardCreateBody =
                PhysicalCardCreateBody(
                    checkRequired("cardId", cardId),
                    checkRequired("cardholder", cardholder),
                    checkRequired("shipment", shipment),
                    physicalCardProfileId,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PhysicalCardCreateBody && cardId == other.cardId && cardholder == other.cardholder && shipment == other.shipment && physicalCardProfileId == other.physicalCardProfileId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(cardId, cardholder, shipment, physicalCardProfileId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PhysicalCardCreateBody{cardId=$cardId, cardholder=$cardholder, shipment=$shipment, physicalCardProfileId=$physicalCardProfileId, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var body: PhysicalCardCreateBody.Builder = PhysicalCardCreateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(physicalCardCreateParams: PhysicalCardCreateParams) = apply {
            body = physicalCardCreateParams.body.toBuilder()
            additionalHeaders = physicalCardCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = physicalCardCreateParams.additionalQueryParams.toBuilder()
        }

        /** The underlying card representing this physical card. */
        fun cardId(cardId: String) = apply { body.cardId(cardId) }

        /** The underlying card representing this physical card. */
        fun cardId(cardId: JsonField<String>) = apply { body.cardId(cardId) }

        /** Details about the cardholder, as it will appear on the physical card. */
        fun cardholder(cardholder: Cardholder) = apply { body.cardholder(cardholder) }

        /** Details about the cardholder, as it will appear on the physical card. */
        fun cardholder(cardholder: JsonField<Cardholder>) = apply { body.cardholder(cardholder) }

        /** The details used to ship this physical card. */
        fun shipment(shipment: Shipment) = apply { body.shipment(shipment) }

        /** The details used to ship this physical card. */
        fun shipment(shipment: JsonField<Shipment>) = apply { body.shipment(shipment) }

        /**
         * The physical card profile to use for this physical card. The latest default physical card
         * profile will be used if not provided.
         */
        fun physicalCardProfileId(physicalCardProfileId: String) = apply {
            body.physicalCardProfileId(physicalCardProfileId)
        }

        /**
         * The physical card profile to use for this physical card. The latest default physical card
         * profile will be used if not provided.
         */
        fun physicalCardProfileId(physicalCardProfileId: JsonField<String>) = apply {
            body.physicalCardProfileId(physicalCardProfileId)
        }

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

        fun build(): PhysicalCardCreateParams =
            PhysicalCardCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    /** Details about the cardholder, as it will appear on the physical card. */
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

        class Builder {

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
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The address to where the card should be shipped. */
        fun address(): Address = address.getRequired("address")

        /** The shipping method to use. */
        fun method(): Method = method.getRequired("method")

        /** The address to where the card should be shipped. */
        @JsonProperty("address") @ExcludeMissing fun _address(): JsonField<Address> = address

        /** The shipping method to use. */
        @JsonProperty("method") @ExcludeMissing fun _method(): JsonField<Method> = method

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
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var address: JsonField<Address>? = null
            private var method: JsonField<Method>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(shipment: Shipment) = apply {
                address = shipment.address
                method = shipment.method
                additionalProperties = shipment.additionalProperties.toMutableMap()
            }

            /** The address to where the card should be shipped. */
            fun address(address: Address) = address(JsonField.of(address))

            /** The address to where the card should be shipped. */
            fun address(address: JsonField<Address>) = apply { this.address = address }

            /** The shipping method to use. */
            fun method(method: Method) = method(JsonField.of(method))

            /** The shipping method to use. */
            fun method(method: JsonField<Method>) = apply { this.method = method }

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
                    additionalProperties.toImmutable(),
                )
        }

        /** The address to where the card should be shipped. */
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
            @JsonProperty("name")
            @ExcludeMissing
            private val name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("postal_code")
            @ExcludeMissing
            private val postalCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("state")
            @ExcludeMissing
            private val state: JsonField<String> = JsonMissing.of(),
            @JsonProperty("line2")
            @ExcludeMissing
            private val line2: JsonField<String> = JsonMissing.of(),
            @JsonProperty("line3")
            @ExcludeMissing
            private val line3: JsonField<String> = JsonMissing.of(),
            @JsonProperty("phone_number")
            @ExcludeMissing
            private val phoneNumber: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The city of the shipping address. */
            fun city(): String = city.getRequired("city")

            /** The first line of the shipping address. */
            fun line1(): String = line1.getRequired("line1")

            /** The name of the recipient. */
            fun name(): String = name.getRequired("name")

            /** The postal code of the shipping address. */
            fun postalCode(): String = postalCode.getRequired("postal_code")

            /** The US state of the shipping address. */
            fun state(): String = state.getRequired("state")

            /** The second line of the shipping address. */
            fun line2(): Optional<String> = Optional.ofNullable(line2.getNullable("line2"))

            /** The third line of the shipping address. */
            fun line3(): Optional<String> = Optional.ofNullable(line3.getNullable("line3"))

            /** The phone number of the recipient. */
            fun phoneNumber(): Optional<String> =
                Optional.ofNullable(phoneNumber.getNullable("phone_number"))

            /** The city of the shipping address. */
            @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

            /** The first line of the shipping address. */
            @JsonProperty("line1") @ExcludeMissing fun _line1(): JsonField<String> = line1

            /** The name of the recipient. */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /** The postal code of the shipping address. */
            @JsonProperty("postal_code")
            @ExcludeMissing
            fun _postalCode(): JsonField<String> = postalCode

            /** The US state of the shipping address. */
            @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<String> = state

            /** The second line of the shipping address. */
            @JsonProperty("line2") @ExcludeMissing fun _line2(): JsonField<String> = line2

            /** The third line of the shipping address. */
            @JsonProperty("line3") @ExcludeMissing fun _line3(): JsonField<String> = line3

            /** The phone number of the recipient. */
            @JsonProperty("phone_number")
            @ExcludeMissing
            fun _phoneNumber(): JsonField<String> = phoneNumber

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
                name()
                postalCode()
                state()
                line2()
                line3()
                phoneNumber()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var city: JsonField<String>? = null
                private var line1: JsonField<String>? = null
                private var name: JsonField<String>? = null
                private var postalCode: JsonField<String>? = null
                private var state: JsonField<String>? = null
                private var line2: JsonField<String> = JsonMissing.of()
                private var line3: JsonField<String> = JsonMissing.of()
                private var phoneNumber: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(address: Address) = apply {
                    city = address.city
                    line1 = address.line1
                    name = address.name
                    postalCode = address.postalCode
                    state = address.state
                    line2 = address.line2
                    line3 = address.line3
                    phoneNumber = address.phoneNumber
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

                /** The second line of the shipping address. */
                fun line2(line2: String) = line2(JsonField.of(line2))

                /** The second line of the shipping address. */
                fun line2(line2: JsonField<String>) = apply { this.line2 = line2 }

                /** The third line of the shipping address. */
                fun line3(line3: String) = line3(JsonField.of(line3))

                /** The third line of the shipping address. */
                fun line3(line3: JsonField<String>) = apply { this.line3 = line3 }

                /** The phone number of the recipient. */
                fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

                /** The phone number of the recipient. */
                fun phoneNumber(phoneNumber: JsonField<String>) = apply {
                    this.phoneNumber = phoneNumber
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

                fun build(): Address =
                    Address(
                        checkRequired("city", city),
                        checkRequired("line1", line1),
                        checkRequired("name", name),
                        checkRequired("postalCode", postalCode),
                        checkRequired("state", state),
                        line2,
                        line3,
                        phoneNumber,
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Address && city == other.city && line1 == other.line1 && name == other.name && postalCode == other.postalCode && state == other.state && line2 == other.line2 && line3 == other.line3 && phoneNumber == other.phoneNumber && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(city, line1, name, postalCode, state, line2, line3, phoneNumber, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Address{city=$city, line1=$line1, name=$name, postalCode=$postalCode, state=$state, line2=$line2, line3=$line3, phoneNumber=$phoneNumber, additionalProperties=$additionalProperties}"
        }

        /** The shipping method to use. */
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
                /** USPS Post with tracking. */
                USPS,
                /** FedEx Priority Overnight, no signature. */
                FEDEX_PRIORITY_OVERNIGHT,
                /** FedEx 2-day. */
                FEDEX_2_DAY,
            }

            enum class Value {
                /** USPS Post with tracking. */
                USPS,
                /** FedEx Priority Overnight, no signature. */
                FEDEX_PRIORITY_OVERNIGHT,
                /** FedEx 2-day. */
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Shipment && address == other.address && method == other.method && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(address, method, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Shipment{address=$address, method=$method, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PhysicalCardCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "PhysicalCardCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
