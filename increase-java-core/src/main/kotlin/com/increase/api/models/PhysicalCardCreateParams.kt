// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.increase.api.core.Enum
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import com.increase.api.core.immutableEmptyMap
import com.increase.api.core.toImmutable
import com.increase.api.errors.IncreaseInvalidDataException
import java.util.Objects
import java.util.Optional

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

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    @JvmSynthetic internal fun getBody(): PhysicalCardCreateBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class PhysicalCardCreateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("card_id") private val cardId: String,
        @JsonProperty("cardholder") private val cardholder: Cardholder,
        @JsonProperty("shipment") private val shipment: Shipment,
        @JsonProperty("physical_card_profile_id") private val physicalCardProfileId: String?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The underlying card representing this physical card. */
        @JsonProperty("card_id") fun cardId(): String = cardId

        /** Details about the cardholder, as it will appear on the physical card. */
        @JsonProperty("cardholder") fun cardholder(): Cardholder = cardholder

        /** The details used to ship this physical card. */
        @JsonProperty("shipment") fun shipment(): Shipment = shipment

        /**
         * The physical card profile to use for this physical card. The latest default physical card
         * profile will be used if not provided.
         */
        @JsonProperty("physical_card_profile_id")
        fun physicalCardProfileId(): Optional<String> = Optional.ofNullable(physicalCardProfileId)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

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
                cardId = physicalCardCreateBody.cardId
                cardholder = physicalCardCreateBody.cardholder
                shipment = physicalCardCreateBody.shipment
                physicalCardProfileId = physicalCardCreateBody.physicalCardProfileId
                additionalProperties = physicalCardCreateBody.additionalProperties.toMutableMap()
            }

            /** The underlying card representing this physical card. */
            fun cardId(cardId: String) = apply { this.cardId = cardId }

            /** Details about the cardholder, as it will appear on the physical card. */
            fun cardholder(cardholder: Cardholder) = apply { this.cardholder = cardholder }

            /** The details used to ship this physical card. */
            fun shipment(shipment: Shipment) = apply { this.shipment = shipment }

            /**
             * The physical card profile to use for this physical card. The latest default physical
             * card profile will be used if not provided.
             */
            fun physicalCardProfileId(physicalCardProfileId: String) = apply {
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
                    checkNotNull(cardId) { "`cardId` is required but was not set" },
                    checkNotNull(cardholder) { "`cardholder` is required but was not set" },
                    checkNotNull(shipment) { "`shipment` is required but was not set" },
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

        /** Details about the cardholder, as it will appear on the physical card. */
        fun cardholder(cardholder: Cardholder) = apply { body.cardholder(cardholder) }

        /** The details used to ship this physical card. */
        fun shipment(shipment: Shipment) = apply { body.shipment(shipment) }

        /**
         * The physical card profile to use for this physical card. The latest default physical card
         * profile will be used if not provided.
         */
        fun physicalCardProfileId(physicalCardProfileId: String) = apply {
            body.physicalCardProfileId(physicalCardProfileId)
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
        @JsonProperty("first_name") private val firstName: String,
        @JsonProperty("last_name") private val lastName: String,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The cardholder's first name. */
        @JsonProperty("first_name") fun firstName(): String = firstName

        /** The cardholder's last name. */
        @JsonProperty("last_name") fun lastName(): String = lastName

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var firstName: String? = null
            private var lastName: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(cardholder: Cardholder) = apply {
                firstName = cardholder.firstName
                lastName = cardholder.lastName
                additionalProperties = cardholder.additionalProperties.toMutableMap()
            }

            /** The cardholder's first name. */
            fun firstName(firstName: String) = apply { this.firstName = firstName }

            /** The cardholder's last name. */
            fun lastName(lastName: String) = apply { this.lastName = lastName }

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
                    checkNotNull(firstName) { "`firstName` is required but was not set" },
                    checkNotNull(lastName) { "`lastName` is required but was not set" },
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
        @JsonProperty("address") private val address: Address,
        @JsonProperty("method") private val method: Method,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The address to where the card should be shipped. */
        @JsonProperty("address") fun address(): Address = address

        /** The shipping method to use. */
        @JsonProperty("method") fun method(): Method = method

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var address: Address? = null
            private var method: Method? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(shipment: Shipment) = apply {
                address = shipment.address
                method = shipment.method
                additionalProperties = shipment.additionalProperties.toMutableMap()
            }

            /** The address to where the card should be shipped. */
            fun address(address: Address) = apply { this.address = address }

            /** The shipping method to use. */
            fun method(method: Method) = apply { this.method = method }

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
                    checkNotNull(address) { "`address` is required but was not set" },
                    checkNotNull(method) { "`method` is required but was not set" },
                    additionalProperties.toImmutable(),
                )
        }

        /** The address to where the card should be shipped. */
        @NoAutoDetect
        class Address
        @JsonCreator
        private constructor(
            @JsonProperty("city") private val city: String,
            @JsonProperty("line1") private val line1: String,
            @JsonProperty("name") private val name: String,
            @JsonProperty("postal_code") private val postalCode: String,
            @JsonProperty("state") private val state: String,
            @JsonProperty("line2") private val line2: String?,
            @JsonProperty("line3") private val line3: String?,
            @JsonProperty("phone_number") private val phoneNumber: String?,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The city of the shipping address. */
            @JsonProperty("city") fun city(): String = city

            /** The first line of the shipping address. */
            @JsonProperty("line1") fun line1(): String = line1

            /** The name of the recipient. */
            @JsonProperty("name") fun name(): String = name

            /** The postal code of the shipping address. */
            @JsonProperty("postal_code") fun postalCode(): String = postalCode

            /** The US state of the shipping address. */
            @JsonProperty("state") fun state(): String = state

            /** The second line of the shipping address. */
            @JsonProperty("line2") fun line2(): Optional<String> = Optional.ofNullable(line2)

            /** The third line of the shipping address. */
            @JsonProperty("line3") fun line3(): Optional<String> = Optional.ofNullable(line3)

            /** The phone number of the recipient. */
            @JsonProperty("phone_number")
            fun phoneNumber(): Optional<String> = Optional.ofNullable(phoneNumber)

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
                private var name: String? = null
                private var postalCode: String? = null
                private var state: String? = null
                private var line2: String? = null
                private var line3: String? = null
                private var phoneNumber: String? = null
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
                fun city(city: String) = apply { this.city = city }

                /** The first line of the shipping address. */
                fun line1(line1: String) = apply { this.line1 = line1 }

                /** The name of the recipient. */
                fun name(name: String) = apply { this.name = name }

                /** The postal code of the shipping address. */
                fun postalCode(postalCode: String) = apply { this.postalCode = postalCode }

                /** The US state of the shipping address. */
                fun state(state: String) = apply { this.state = state }

                /** The second line of the shipping address. */
                fun line2(line2: String) = apply { this.line2 = line2 }

                /** The third line of the shipping address. */
                fun line3(line3: String) = apply { this.line3 = line3 }

                /** The phone number of the recipient. */
                fun phoneNumber(phoneNumber: String) = apply { this.phoneNumber = phoneNumber }

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
                        checkNotNull(city) { "`city` is required but was not set" },
                        checkNotNull(line1) { "`line1` is required but was not set" },
                        checkNotNull(name) { "`name` is required but was not set" },
                        checkNotNull(postalCode) { "`postalCode` is required but was not set" },
                        checkNotNull(state) { "`state` is required but was not set" },
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
