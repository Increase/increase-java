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

class EntityUpdateIndustryCodeParams
constructor(
    private val entityId: String,
    private val industryCode: String,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun entityId(): String = entityId

    fun industryCode(): String = industryCode

    @JvmSynthetic
    internal fun getBody(): EntityUpdateIndustryCodeBody {
        return EntityUpdateIndustryCodeBody(industryCode, additionalBodyProperties)
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> entityId
            else -> ""
        }
    }

    @JsonDeserialize(builder = EntityUpdateIndustryCodeBody.Builder::class)
    @NoAutoDetect
    class EntityUpdateIndustryCodeBody
    internal constructor(
        private val industryCode: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /**
         * The North American Industry Classification System (NAICS) code for the corporation's
         * primary line of business. This is a number, like `5132` for `Software Publishers`. A full
         * list of classification codes is available
         * [here](https://increase.com/documentation/data-dictionary#north-american-industry-classification-system-codes).
         */
        @JsonProperty("industry_code") fun industryCode(): String? = industryCode

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is EntityUpdateIndustryCodeBody &&
                this.industryCode == other.industryCode &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = Objects.hash(industryCode, additionalProperties)
            }
            return hashCode
        }

        override fun toString() =
            "EntityUpdateIndustryCodeBody{industryCode=$industryCode, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var industryCode: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(entityUpdateIndustryCodeBody: EntityUpdateIndustryCodeBody) = apply {
                this.industryCode = entityUpdateIndustryCodeBody.industryCode
                additionalProperties(entityUpdateIndustryCodeBody.additionalProperties)
            }

            /**
             * The North American Industry Classification System (NAICS) code for the corporation's
             * primary line of business. This is a number, like `5132` for `Software Publishers`. A
             * full list of classification codes is available
             * [here](https://increase.com/documentation/data-dictionary#north-american-industry-classification-system-codes).
             */
            @JsonProperty("industry_code")
            fun industryCode(industryCode: String) = apply { this.industryCode = industryCode }

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

            fun build(): EntityUpdateIndustryCodeBody =
                EntityUpdateIndustryCodeBody(
                    checkNotNull(industryCode) { "`industryCode` is required but was not set" },
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

        return other is EntityUpdateIndustryCodeParams &&
            this.entityId == other.entityId &&
            this.industryCode == other.industryCode &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            entityId,
            industryCode,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "EntityUpdateIndustryCodeParams{entityId=$entityId, industryCode=$industryCode, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var entityId: String? = null
        private var industryCode: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(entityUpdateIndustryCodeParams: EntityUpdateIndustryCodeParams) = apply {
            this.entityId = entityUpdateIndustryCodeParams.entityId
            this.industryCode = entityUpdateIndustryCodeParams.industryCode
            additionalQueryParams(entityUpdateIndustryCodeParams.additionalQueryParams)
            additionalHeaders(entityUpdateIndustryCodeParams.additionalHeaders)
            additionalBodyProperties(entityUpdateIndustryCodeParams.additionalBodyProperties)
        }

        /**
         * The identifier of the Entity to update. This endpoint only accepts `corporation`
         * entities.
         */
        fun entityId(entityId: String) = apply { this.entityId = entityId }

        /**
         * The North American Industry Classification System (NAICS) code for the corporation's
         * primary line of business. This is a number, like `5132` for `Software Publishers`. A full
         * list of classification codes is available
         * [here](https://increase.com/documentation/data-dictionary#north-american-industry-classification-system-codes).
         */
        fun industryCode(industryCode: String) = apply { this.industryCode = industryCode }

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

        fun build(): EntityUpdateIndustryCodeParams =
            EntityUpdateIndustryCodeParams(
                checkNotNull(entityId) { "`entityId` is required but was not set" },
                checkNotNull(industryCode) { "`industryCode` is required but was not set" },
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }
}
