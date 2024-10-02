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

class IntrafiExclusionCreateParams
constructor(
    private val bankName: String,
    private val entityId: String,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun bankName(): String = bankName

    fun entityId(): String = entityId

    @JvmSynthetic
    internal fun getBody(): IntrafiExclusionCreateBody {
        return IntrafiExclusionCreateBody(
            bankName,
            entityId,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = IntrafiExclusionCreateBody.Builder::class)
    @NoAutoDetect
    class IntrafiExclusionCreateBody
    internal constructor(
        private val bankName: String?,
        private val entityId: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The name of the financial institution to be excluded. */
        @JsonProperty("bank_name") fun bankName(): String? = bankName

        /** The identifier of the Entity whose deposits will be excluded. */
        @JsonProperty("entity_id") fun entityId(): String? = entityId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var bankName: String? = null
            private var entityId: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(intrafiExclusionCreateBody: IntrafiExclusionCreateBody) = apply {
                this.bankName = intrafiExclusionCreateBody.bankName
                this.entityId = intrafiExclusionCreateBody.entityId
                additionalProperties(intrafiExclusionCreateBody.additionalProperties)
            }

            /** The name of the financial institution to be excluded. */
            @JsonProperty("bank_name")
            fun bankName(bankName: String) = apply { this.bankName = bankName }

            /** The identifier of the Entity whose deposits will be excluded. */
            @JsonProperty("entity_id")
            fun entityId(entityId: String) = apply { this.entityId = entityId }

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

            fun build(): IntrafiExclusionCreateBody =
                IntrafiExclusionCreateBody(
                    checkNotNull(bankName) { "`bankName` is required but was not set" },
                    checkNotNull(entityId) { "`entityId` is required but was not set" },
                    additionalProperties.toUnmodifiable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is IntrafiExclusionCreateBody &&
                this.bankName == other.bankName &&
                this.entityId == other.entityId &&
                this.additionalProperties == other.additionalProperties
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        bankName,
                        entityId,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "IntrafiExclusionCreateBody{bankName=$bankName, entityId=$entityId, additionalProperties=$additionalProperties}"
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is IntrafiExclusionCreateParams &&
            this.bankName == other.bankName &&
            this.entityId == other.entityId &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            bankName,
            entityId,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "IntrafiExclusionCreateParams{bankName=$bankName, entityId=$entityId, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var bankName: String? = null
        private var entityId: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(intrafiExclusionCreateParams: IntrafiExclusionCreateParams) = apply {
            this.bankName = intrafiExclusionCreateParams.bankName
            this.entityId = intrafiExclusionCreateParams.entityId
            additionalQueryParams(intrafiExclusionCreateParams.additionalQueryParams)
            additionalHeaders(intrafiExclusionCreateParams.additionalHeaders)
            additionalBodyProperties(intrafiExclusionCreateParams.additionalBodyProperties)
        }

        /** The name of the financial institution to be excluded. */
        fun bankName(bankName: String) = apply { this.bankName = bankName }

        /** The identifier of the Entity whose deposits will be excluded. */
        fun entityId(entityId: String) = apply { this.entityId = entityId }

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

        fun build(): IntrafiExclusionCreateParams =
            IntrafiExclusionCreateParams(
                checkNotNull(bankName) { "`bankName` is required but was not set" },
                checkNotNull(entityId) { "`entityId` is required but was not set" },
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }
}
