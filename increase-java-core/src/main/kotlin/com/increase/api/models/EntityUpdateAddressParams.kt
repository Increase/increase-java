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

/** Update a Natural Person or Corporation's address */
class EntityUpdateAddressParams
private constructor(
    private val entityId: String,
    private val body: EntityUpdateAddressBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    /** The identifier of the Entity whose address is being updated. */
    fun entityId(): String = entityId

    /**
     * The entity's physical address. Mail receiving locations like PO Boxes and PMB's are
     * disallowed.
     */
    fun address(): Address = body.address()

    /**
     * The entity's physical address. Mail receiving locations like PO Boxes and PMB's are
     * disallowed.
     */
    fun _address(): JsonField<Address> = body._address()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun getBody(): EntityUpdateAddressBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> entityId
            else -> ""
        }
    }

    @NoAutoDetect
    class EntityUpdateAddressBody
    @JsonCreator
    internal constructor(
        @JsonProperty("address")
        @ExcludeMissing
        private val address: JsonField<Address> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * The entity's physical address. Mail receiving locations like PO Boxes and PMB's are
         * disallowed.
         */
        fun address(): Address = address.getRequired("address")

        /**
         * The entity's physical address. Mail receiving locations like PO Boxes and PMB's are
         * disallowed.
         */
        @JsonProperty("address") @ExcludeMissing fun _address(): JsonField<Address> = address

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): EntityUpdateAddressBody = apply {
            if (validated) {
                return@apply
            }

            address().validate()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder internal constructor() {

            private var address: JsonField<Address>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(entityUpdateAddressBody: EntityUpdateAddressBody) = apply {
                address = entityUpdateAddressBody.address
                additionalProperties = entityUpdateAddressBody.additionalProperties.toMutableMap()
            }

            /**
             * The entity's physical address. Mail receiving locations like PO Boxes and PMB's are
             * disallowed.
             */
            fun address(address: Address) = address(JsonField.of(address))

            /**
             * The entity's physical address. Mail receiving locations like PO Boxes and PMB's are
             * disallowed.
             */
            fun address(address: JsonField<Address>) = apply { this.address = address }

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

            fun build(): EntityUpdateAddressBody =
                EntityUpdateAddressBody(
                    checkRequired("address", address),
                    additionalProperties.toImmutable()
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is EntityUpdateAddressBody && address == other.address && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(address, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "EntityUpdateAddressBody{address=$address, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder internal constructor() {

        private var entityId: String? = null
        private var body: EntityUpdateAddressBody.Builder = EntityUpdateAddressBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(entityUpdateAddressParams: EntityUpdateAddressParams) = apply {
            entityId = entityUpdateAddressParams.entityId
            body = entityUpdateAddressParams.body.toBuilder()
            additionalHeaders = entityUpdateAddressParams.additionalHeaders.toBuilder()
            additionalQueryParams = entityUpdateAddressParams.additionalQueryParams.toBuilder()
        }

        /** The identifier of the Entity whose address is being updated. */
        fun entityId(entityId: String) = apply { this.entityId = entityId }

        /**
         * The entity's physical address. Mail receiving locations like PO Boxes and PMB's are
         * disallowed.
         */
        fun address(address: Address) = apply { body.address(address) }

        /**
         * The entity's physical address. Mail receiving locations like PO Boxes and PMB's are
         * disallowed.
         */
        fun address(address: JsonField<Address>) = apply { body.address(address) }

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

        fun build(): EntityUpdateAddressParams =
            EntityUpdateAddressParams(
                checkRequired("entityId", entityId),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    /**
     * The entity's physical address. Mail receiving locations like PO Boxes and PMB's are
     * disallowed.
     */
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
        @JsonProperty("state")
        @ExcludeMissing
        private val state: JsonField<String> = JsonMissing.of(),
        @JsonProperty("zip") @ExcludeMissing private val zip: JsonField<String> = JsonMissing.of(),
        @JsonProperty("line2")
        @ExcludeMissing
        private val line2: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The city of the address. */
        fun city(): String = city.getRequired("city")

        /** The first line of the address. This is usually the street number and street. */
        fun line1(): String = line1.getRequired("line1")

        /**
         * The two-letter United States Postal Service (USPS) abbreviation for the state of the
         * address.
         */
        fun state(): String = state.getRequired("state")

        /** The ZIP code of the address. */
        fun zip(): String = zip.getRequired("zip")

        /** The second line of the address. This might be the floor or room number. */
        fun line2(): Optional<String> = Optional.ofNullable(line2.getNullable("line2"))

        /** The city of the address. */
        @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

        /** The first line of the address. This is usually the street number and street. */
        @JsonProperty("line1") @ExcludeMissing fun _line1(): JsonField<String> = line1

        /**
         * The two-letter United States Postal Service (USPS) abbreviation for the state of the
         * address.
         */
        @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<String> = state

        /** The ZIP code of the address. */
        @JsonProperty("zip") @ExcludeMissing fun _zip(): JsonField<String> = zip

        /** The second line of the address. This might be the floor or room number. */
        @JsonProperty("line2") @ExcludeMissing fun _line2(): JsonField<String> = line2

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
            state()
            zip()
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
            private var state: JsonField<String>? = null
            private var zip: JsonField<String>? = null
            private var line2: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(address: Address) = apply {
                city = address.city
                line1 = address.line1
                state = address.state
                zip = address.zip
                line2 = address.line2
                additionalProperties = address.additionalProperties.toMutableMap()
            }

            /** The city of the address. */
            fun city(city: String) = city(JsonField.of(city))

            /** The city of the address. */
            fun city(city: JsonField<String>) = apply { this.city = city }

            /** The first line of the address. This is usually the street number and street. */
            fun line1(line1: String) = line1(JsonField.of(line1))

            /** The first line of the address. This is usually the street number and street. */
            fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

            /**
             * The two-letter United States Postal Service (USPS) abbreviation for the state of the
             * address.
             */
            fun state(state: String) = state(JsonField.of(state))

            /**
             * The two-letter United States Postal Service (USPS) abbreviation for the state of the
             * address.
             */
            fun state(state: JsonField<String>) = apply { this.state = state }

            /** The ZIP code of the address. */
            fun zip(zip: String) = zip(JsonField.of(zip))

            /** The ZIP code of the address. */
            fun zip(zip: JsonField<String>) = apply { this.zip = zip }

            /** The second line of the address. This might be the floor or room number. */
            fun line2(line2: String) = line2(JsonField.of(line2))

            /** The second line of the address. This might be the floor or room number. */
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

            fun build(): Address =
                Address(
                    checkRequired("city", city),
                    checkRequired("line1", line1),
                    checkRequired("state", state),
                    checkRequired("zip", zip),
                    line2,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Address && city == other.city && line1 == other.line1 && state == other.state && zip == other.zip && line2 == other.line2 && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(city, line1, state, zip, line2, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Address{city=$city, line1=$line1, state=$state, zip=$zip, line2=$line2, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is EntityUpdateAddressParams && entityId == other.entityId && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(entityId, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "EntityUpdateAddressParams{entityId=$entityId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
