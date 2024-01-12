// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.toUnmodifiable
import com.increase.api.models.*
import java.util.Objects

class EntityUpdateAddressParams
constructor(
    private val entityId: String,
    private val address: Address,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun entityId(): String = entityId

    fun address(): Address = address

    @JvmSynthetic
    internal fun getBody(): EntityUpdateAddressBody {
        return EntityUpdateAddressBody(address, additionalBodyProperties)
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> entityId
            else -> ""
        }
    }

    @JsonDeserialize(builder = EntityUpdateAddressBody.Builder::class)
    @NoAutoDetect
    class EntityUpdateAddressBody
    internal constructor(
        private val address: Address?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /**
         * The entity's physical address. Mail receiving locations like PO Boxes and PMB's are
         * disallowed.
         */
        @JsonProperty("address") fun address(): Address? = address

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is EntityUpdateAddressBody &&
                this.address == other.address &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = Objects.hash(address, additionalProperties)
            }
            return hashCode
        }

        override fun toString() =
            "EntityUpdateAddressBody{address=$address, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var address: Address? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(entityUpdateAddressBody: EntityUpdateAddressBody) = apply {
                this.address = entityUpdateAddressBody.address
                additionalProperties(entityUpdateAddressBody.additionalProperties)
            }

            /**
             * The entity's physical address. Mail receiving locations like PO Boxes and PMB's are
             * disallowed.
             */
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

            fun build(): EntityUpdateAddressBody =
                EntityUpdateAddressBody(
                    checkNotNull(address) { "`address` is required but was not set" },
                    additionalProperties.toUnmodifiable()
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

        return other is EntityUpdateAddressParams &&
            this.entityId == other.entityId &&
            this.address == other.address &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            entityId,
            address,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "EntityUpdateAddressParams{entityId=$entityId, address=$address, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var entityId: String? = null
        private var address: Address? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(entityUpdateAddressParams: EntityUpdateAddressParams) = apply {
            this.entityId = entityUpdateAddressParams.entityId
            this.address = entityUpdateAddressParams.address
            additionalQueryParams(entityUpdateAddressParams.additionalQueryParams)
            additionalHeaders(entityUpdateAddressParams.additionalHeaders)
            additionalBodyProperties(entityUpdateAddressParams.additionalBodyProperties)
        }

        /** The identifier of the Entity to archive. */
        fun entityId(entityId: String) = apply { this.entityId = entityId }

        /**
         * The entity's physical address. Mail receiving locations like PO Boxes and PMB's are
         * disallowed.
         */
        fun address(address: Address) = apply { this.address = address }

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

        fun build(): EntityUpdateAddressParams =
            EntityUpdateAddressParams(
                checkNotNull(entityId) { "`entityId` is required but was not set" },
                checkNotNull(address) { "`address` is required but was not set" },
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    /**
     * The entity's physical address. Mail receiving locations like PO Boxes and PMB's are
     * disallowed.
     */
    @JsonDeserialize(builder = Address.Builder::class)
    @NoAutoDetect
    class Address
    private constructor(
        private val line1: String?,
        private val line2: String?,
        private val city: String?,
        private val state: String?,
        private val zip: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** The first line of the address. This is usually the street number and street. */
        @JsonProperty("line1") fun line1(): String? = line1

        /** The second line of the address. This might be the floor or room number. */
        @JsonProperty("line2") fun line2(): String? = line2

        /** The city of the address. */
        @JsonProperty("city") fun city(): String? = city

        /**
         * The two-letter United States Postal Service (USPS) abbreviation for the state of the
         * address.
         */
        @JsonProperty("state") fun state(): String? = state

        /** The ZIP code of the address. */
        @JsonProperty("zip") fun zip(): String? = zip

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Address &&
                this.line1 == other.line1 &&
                this.line2 == other.line2 &&
                this.city == other.city &&
                this.state == other.state &&
                this.zip == other.zip &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        line1,
                        line2,
                        city,
                        state,
                        zip,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Address{line1=$line1, line2=$line2, city=$city, state=$state, zip=$zip, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var line1: String? = null
            private var line2: String? = null
            private var city: String? = null
            private var state: String? = null
            private var zip: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(address: Address) = apply {
                this.line1 = address.line1
                this.line2 = address.line2
                this.city = address.city
                this.state = address.state
                this.zip = address.zip
                additionalProperties(address.additionalProperties)
            }

            /** The first line of the address. This is usually the street number and street. */
            @JsonProperty("line1") fun line1(line1: String) = apply { this.line1 = line1 }

            /** The second line of the address. This might be the floor or room number. */
            @JsonProperty("line2") fun line2(line2: String) = apply { this.line2 = line2 }

            /** The city of the address. */
            @JsonProperty("city") fun city(city: String) = apply { this.city = city }

            /**
             * The two-letter United States Postal Service (USPS) abbreviation for the state of the
             * address.
             */
            @JsonProperty("state") fun state(state: String) = apply { this.state = state }

            /** The ZIP code of the address. */
            @JsonProperty("zip") fun zip(zip: String) = apply { this.zip = zip }

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

            fun build(): Address =
                Address(
                    checkNotNull(line1) { "`line1` is required but was not set" },
                    line2,
                    checkNotNull(city) { "`city` is required but was not set" },
                    checkNotNull(state) { "`state` is required but was not set" },
                    checkNotNull(zip) { "`zip` is required but was not set" },
                    additionalProperties.toUnmodifiable(),
                )
        }
    }
}
