// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.toUnmodifiable
import com.increase.api.errors.IncreaseInvalidDataException
import com.increase.api.models.*
import java.util.Objects
import java.util.Optional

class PhysicalCardCreateParams
constructor(
    private val cardId: String,
    private val cardholder: Cardholder,
    private val shipment: Shipment,
    private val physicalCardProfileId: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun cardId(): String = cardId

    fun cardholder(): Cardholder = cardholder

    fun shipment(): Shipment = shipment

    fun physicalCardProfileId(): Optional<String> = Optional.ofNullable(physicalCardProfileId)

    @JvmSynthetic
    internal fun getBody(): PhysicalCardCreateBody {
        return PhysicalCardCreateBody(
            cardId,
            cardholder,
            shipment,
            physicalCardProfileId,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = PhysicalCardCreateBody.Builder::class)
    @NoAutoDetect
    class PhysicalCardCreateBody
    internal constructor(
        private val cardId: String?,
        private val cardholder: Cardholder?,
        private val shipment: Shipment?,
        private val physicalCardProfileId: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** The underlying card representing this physical card. */
        @JsonProperty("card_id") fun cardId(): String? = cardId

        /** Details about the cardholder, as it will appear on the physical card. */
        @JsonProperty("cardholder") fun cardholder(): Cardholder? = cardholder

        /** The details used to ship this physical card. */
        @JsonProperty("shipment") fun shipment(): Shipment? = shipment

        /** The physical card profile to use for this physical card. */
        @JsonProperty("physical_card_profile_id")
        fun physicalCardProfileId(): String? = physicalCardProfileId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PhysicalCardCreateBody &&
                this.cardId == other.cardId &&
                this.cardholder == other.cardholder &&
                this.shipment == other.shipment &&
                this.physicalCardProfileId == other.physicalCardProfileId &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        cardId,
                        cardholder,
                        shipment,
                        physicalCardProfileId,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "PhysicalCardCreateBody{cardId=$cardId, cardholder=$cardholder, shipment=$shipment, physicalCardProfileId=$physicalCardProfileId, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var cardId: String? = null
            private var cardholder: Cardholder? = null
            private var shipment: Shipment? = null
            private var physicalCardProfileId: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(physicalCardCreateBody: PhysicalCardCreateBody) = apply {
                this.cardId = physicalCardCreateBody.cardId
                this.cardholder = physicalCardCreateBody.cardholder
                this.shipment = physicalCardCreateBody.shipment
                this.physicalCardProfileId = physicalCardCreateBody.physicalCardProfileId
                additionalProperties(physicalCardCreateBody.additionalProperties)
            }

            /** The underlying card representing this physical card. */
            @JsonProperty("card_id") fun cardId(cardId: String) = apply { this.cardId = cardId }

            /** Details about the cardholder, as it will appear on the physical card. */
            @JsonProperty("cardholder")
            fun cardholder(cardholder: Cardholder) = apply { this.cardholder = cardholder }

            /** The details used to ship this physical card. */
            @JsonProperty("shipment")
            fun shipment(shipment: Shipment) = apply { this.shipment = shipment }

            /** The physical card profile to use for this physical card. */
            @JsonProperty("physical_card_profile_id")
            fun physicalCardProfileId(physicalCardProfileId: String) = apply {
                this.physicalCardProfileId = physicalCardProfileId
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

            fun build(): PhysicalCardCreateBody =
                PhysicalCardCreateBody(
                    checkNotNull(cardId) { "`cardId` is required but was not set" },
                    checkNotNull(cardholder) { "`cardholder` is required but was not set" },
                    checkNotNull(shipment) { "`shipment` is required but was not set" },
                    physicalCardProfileId,
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

        return other is PhysicalCardCreateParams &&
            this.cardId == other.cardId &&
            this.cardholder == other.cardholder &&
            this.shipment == other.shipment &&
            this.physicalCardProfileId == other.physicalCardProfileId &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            cardId,
            cardholder,
            shipment,
            physicalCardProfileId,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "PhysicalCardCreateParams{cardId=$cardId, cardholder=$cardholder, shipment=$shipment, physicalCardProfileId=$physicalCardProfileId, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var cardId: String? = null
        private var cardholder: Cardholder? = null
        private var shipment: Shipment? = null
        private var physicalCardProfileId: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(physicalCardCreateParams: PhysicalCardCreateParams) = apply {
            this.cardId = physicalCardCreateParams.cardId
            this.cardholder = physicalCardCreateParams.cardholder
            this.shipment = physicalCardCreateParams.shipment
            this.physicalCardProfileId = physicalCardCreateParams.physicalCardProfileId
            additionalQueryParams(physicalCardCreateParams.additionalQueryParams)
            additionalHeaders(physicalCardCreateParams.additionalHeaders)
            additionalBodyProperties(physicalCardCreateParams.additionalBodyProperties)
        }

        /** The underlying card representing this physical card. */
        fun cardId(cardId: String) = apply { this.cardId = cardId }

        /** Details about the cardholder, as it will appear on the physical card. */
        fun cardholder(cardholder: Cardholder) = apply { this.cardholder = cardholder }

        /** The details used to ship this physical card. */
        fun shipment(shipment: Shipment) = apply { this.shipment = shipment }

        /** The physical card profile to use for this physical card. */
        fun physicalCardProfileId(physicalCardProfileId: String) = apply {
            this.physicalCardProfileId = physicalCardProfileId
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

        fun build(): PhysicalCardCreateParams =
            PhysicalCardCreateParams(
                checkNotNull(cardId) { "`cardId` is required but was not set" },
                checkNotNull(cardholder) { "`cardholder` is required but was not set" },
                checkNotNull(shipment) { "`shipment` is required but was not set" },
                physicalCardProfileId,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    /** Details about the cardholder, as it will appear on the physical card. */
    @JsonDeserialize(builder = Cardholder.Builder::class)
    @NoAutoDetect
    class Cardholder
    private constructor(
        private val firstName: String?,
        private val lastName: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** The cardholder's first name. */
        @JsonProperty("first_name") fun firstName(): String? = firstName

        /** The cardholder's last name. */
        @JsonProperty("last_name") fun lastName(): String? = lastName

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

            private var firstName: String? = null
            private var lastName: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(cardholder: Cardholder) = apply {
                this.firstName = cardholder.firstName
                this.lastName = cardholder.lastName
                additionalProperties(cardholder.additionalProperties)
            }

            /** The cardholder's first name. */
            @JsonProperty("first_name")
            fun firstName(firstName: String) = apply { this.firstName = firstName }

            /** The cardholder's last name. */
            @JsonProperty("last_name")
            fun lastName(lastName: String) = apply { this.lastName = lastName }

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
                    checkNotNull(firstName) { "`firstName` is required but was not set" },
                    checkNotNull(lastName) { "`lastName` is required but was not set" },
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    /** The details used to ship this physical card. */
    @JsonDeserialize(builder = Shipment.Builder::class)
    @NoAutoDetect
    class Shipment
    private constructor(
        private val method: Method?,
        private val address: Address?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** The shipping method to use. */
        @JsonProperty("method") fun method(): Method? = method

        /** The address to where the card should be shipped. */
        @JsonProperty("address") fun address(): Address? = address

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Shipment &&
                this.method == other.method &&
                this.address == other.address &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        method,
                        address,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Shipment{method=$method, address=$address, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var method: Method? = null
            private var address: Address? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(shipment: Shipment) = apply {
                this.method = shipment.method
                this.address = shipment.address
                additionalProperties(shipment.additionalProperties)
            }

            /** The shipping method to use. */
            @JsonProperty("method") fun method(method: Method) = apply { this.method = method }

            /** The address to where the card should be shipped. */
            @JsonProperty("address")
            fun address(address: Address) = apply { this.address = address }

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
                    checkNotNull(method) { "`method` is required but was not set" },
                    checkNotNull(address) { "`address` is required but was not set" },
                    additionalProperties.toUnmodifiable(),
                )
        }

        /** The address to where the card should be shipped. */
        @JsonDeserialize(builder = Address.Builder::class)
        @NoAutoDetect
        class Address
        private constructor(
            private val name: String?,
            private val line1: String?,
            private val line2: String?,
            private val line3: String?,
            private val phoneNumber: String?,
            private val city: String?,
            private val state: String?,
            private val postalCode: String?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var hashCode: Int = 0

            /** The name of the recipient. */
            @JsonProperty("name") fun name(): String? = name

            /** The first line of the shipping address. */
            @JsonProperty("line1") fun line1(): String? = line1

            /** The second line of the shipping address. */
            @JsonProperty("line2") fun line2(): String? = line2

            /** The third line of the shipping address. */
            @JsonProperty("line3") fun line3(): String? = line3

            /** The phone number of the recipient. */
            @JsonProperty("phone_number") fun phoneNumber(): String? = phoneNumber

            /** The city of the shipping address. */
            @JsonProperty("city") fun city(): String? = city

            /** The US state of the shipping address. */
            @JsonProperty("state") fun state(): String? = state

            /** The postal code of the shipping address. */
            @JsonProperty("postal_code") fun postalCode(): String? = postalCode

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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
                    this.phoneNumber == other.phoneNumber &&
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
                            phoneNumber,
                            city,
                            state,
                            postalCode,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "Address{name=$name, line1=$line1, line2=$line2, line3=$line3, phoneNumber=$phoneNumber, city=$city, state=$state, postalCode=$postalCode, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var name: String? = null
                private var line1: String? = null
                private var line2: String? = null
                private var line3: String? = null
                private var phoneNumber: String? = null
                private var city: String? = null
                private var state: String? = null
                private var postalCode: String? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(address: Address) = apply {
                    this.name = address.name
                    this.line1 = address.line1
                    this.line2 = address.line2
                    this.line3 = address.line3
                    this.phoneNumber = address.phoneNumber
                    this.city = address.city
                    this.state = address.state
                    this.postalCode = address.postalCode
                    additionalProperties(address.additionalProperties)
                }

                /** The name of the recipient. */
                @JsonProperty("name") fun name(name: String) = apply { this.name = name }

                /** The first line of the shipping address. */
                @JsonProperty("line1") fun line1(line1: String) = apply { this.line1 = line1 }

                /** The second line of the shipping address. */
                @JsonProperty("line2") fun line2(line2: String) = apply { this.line2 = line2 }

                /** The third line of the shipping address. */
                @JsonProperty("line3") fun line3(line3: String) = apply { this.line3 = line3 }

                /** The phone number of the recipient. */
                @JsonProperty("phone_number")
                fun phoneNumber(phoneNumber: String) = apply { this.phoneNumber = phoneNumber }

                /** The city of the shipping address. */
                @JsonProperty("city") fun city(city: String) = apply { this.city = city }

                /** The US state of the shipping address. */
                @JsonProperty("state") fun state(state: String) = apply { this.state = state }

                /** The postal code of the shipping address. */
                @JsonProperty("postal_code")
                fun postalCode(postalCode: String) = apply { this.postalCode = postalCode }

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
                        checkNotNull(name) { "`name` is required but was not set" },
                        checkNotNull(line1) { "`line1` is required but was not set" },
                        line2,
                        line3,
                        phoneNumber,
                        checkNotNull(city) { "`city` is required but was not set" },
                        checkNotNull(state) { "`state` is required but was not set" },
                        checkNotNull(postalCode) { "`postalCode` is required but was not set" },
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
    }
}
