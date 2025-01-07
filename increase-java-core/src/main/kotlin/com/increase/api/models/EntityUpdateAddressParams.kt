// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import com.increase.api.core.immutableEmptyMap
import com.increase.api.core.toImmutable
import java.util.Objects
import java.util.Optional

/** Update a Natural Person or Corporation's address */
class EntityUpdateAddressParams
constructor(
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

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

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
        @JsonProperty("address") private val address: Address,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * The entity's physical address. Mail receiving locations like PO Boxes and PMB's are
         * disallowed.
         */
        @JsonProperty("address") fun address(): Address = address

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var address: Address? = null
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
            fun address(address: Address) = apply { this.address = address }

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
                    checkNotNull(address) { "`address` is required but was not set" },
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
    class Builder {

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

        fun build(): EntityUpdateAddressParams =
            EntityUpdateAddressParams(
                checkNotNull(entityId) { "`entityId` is required but was not set" },
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
        @JsonProperty("city") private val city: String,
        @JsonProperty("line1") private val line1: String,
        @JsonProperty("state") private val state: String,
        @JsonProperty("zip") private val zip: String,
        @JsonProperty("line2") private val line2: String?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The city of the address. */
        @JsonProperty("city") fun city(): String = city

        /** The first line of the address. This is usually the street number and street. */
        @JsonProperty("line1") fun line1(): String = line1

        /**
         * The two-letter United States Postal Service (USPS) abbreviation for the state of the
         * address.
         */
        @JsonProperty("state") fun state(): String = state

        /** The ZIP code of the address. */
        @JsonProperty("zip") fun zip(): String = zip

        /** The second line of the address. This might be the floor or room number. */
        @JsonProperty("line2") fun line2(): Optional<String> = Optional.ofNullable(line2)

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
            private var state: String? = null
            private var zip: String? = null
            private var line2: String? = null
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
            fun city(city: String) = apply { this.city = city }

            /** The first line of the address. This is usually the street number and street. */
            fun line1(line1: String) = apply { this.line1 = line1 }

            /**
             * The two-letter United States Postal Service (USPS) abbreviation for the state of the
             * address.
             */
            fun state(state: String) = apply { this.state = state }

            /** The ZIP code of the address. */
            fun zip(zip: String) = apply { this.zip = zip }

            /** The second line of the address. This might be the floor or room number. */
            fun line2(line2: String?) = apply { this.line2 = line2 }

            /** The second line of the address. This might be the floor or room number. */
            fun line2(line2: Optional<String>) = line2(line2.orElse(null))

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
                    checkNotNull(city) { "`city` is required but was not set" },
                    checkNotNull(line1) { "`line1` is required but was not set" },
                    checkNotNull(state) { "`state` is required but was not set" },
                    checkNotNull(zip) { "`zip` is required but was not set" },
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
