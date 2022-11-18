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
import java.util.Optional

class AccountCreateParams
constructor(
    private val entityId: String?,
    private val informationalEntityId: String?,
    private val name: String,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun entityId(): Optional<String> = Optional.ofNullable(entityId)

    fun informationalEntityId(): Optional<String> = Optional.ofNullable(informationalEntityId)

    fun name(): String = name

    @JvmSynthetic
    internal fun getBody(): AccountCreateBody {
        return AccountCreateBody(
            entityId,
            informationalEntityId,
            name,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = AccountCreateBody.Builder::class)
    @NoAutoDetect
    class AccountCreateBody
    internal constructor(
        private val entityId: String?,
        private val informationalEntityId: String?,
        private val name: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** The identifier for the Entity that will own the Account. */
        @JsonProperty("entity_id") fun entityId(): String? = entityId

        /**
         * The identifier of an Entity that, while not owning the Account, is associated with its
         * activity. Its relationship to your group must be `informational`.
         */
        @JsonProperty("informational_entity_id")
        fun informationalEntityId(): String? = informationalEntityId

        /** The name you choose for the Account. */
        @JsonProperty("name") fun name(): String? = name

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AccountCreateBody &&
                this.entityId == other.entityId &&
                this.informationalEntityId == other.informationalEntityId &&
                this.name == other.name &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        entityId,
                        informationalEntityId,
                        name,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "AccountCreateBody{entityId=$entityId, informationalEntityId=$informationalEntityId, name=$name, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var entityId: String? = null
            private var informationalEntityId: String? = null
            private var name: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(accountCreateBody: AccountCreateBody) = apply {
                this.entityId = accountCreateBody.entityId
                this.informationalEntityId = accountCreateBody.informationalEntityId
                this.name = accountCreateBody.name
                additionalProperties(accountCreateBody.additionalProperties)
            }

            /** The identifier for the Entity that will own the Account. */
            @JsonProperty("entity_id")
            fun entityId(entityId: String) = apply { this.entityId = entityId }

            /**
             * The identifier of an Entity that, while not owning the Account, is associated with
             * its activity. Its relationship to your group must be `informational`.
             */
            @JsonProperty("informational_entity_id")
            fun informationalEntityId(informationalEntityId: String) = apply {
                this.informationalEntityId = informationalEntityId
            }

            /** The name you choose for the Account. */
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

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

            fun build(): AccountCreateBody =
                AccountCreateBody(
                    entityId,
                    informationalEntityId,
                    checkNotNull(name) { "`name` is required but was not set" },
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

        return other is AccountCreateParams &&
            this.entityId == other.entityId &&
            this.informationalEntityId == other.informationalEntityId &&
            this.name == other.name &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            entityId,
            informationalEntityId,
            name,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "AccountCreateParams{entityId=$entityId, informationalEntityId=$informationalEntityId, name=$name, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var entityId: String? = null
        private var informationalEntityId: String? = null
        private var name: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(accountCreateParams: AccountCreateParams) = apply {
            this.entityId = accountCreateParams.entityId
            this.informationalEntityId = accountCreateParams.informationalEntityId
            this.name = accountCreateParams.name
            additionalQueryParams(accountCreateParams.additionalQueryParams)
            additionalHeaders(accountCreateParams.additionalHeaders)
            additionalBodyProperties(accountCreateParams.additionalBodyProperties)
        }

        /** The identifier for the Entity that will own the Account. */
        fun entityId(entityId: String) = apply { this.entityId = entityId }

        /**
         * The identifier of an Entity that, while not owning the Account, is associated with its
         * activity. Its relationship to your group must be `informational`.
         */
        fun informationalEntityId(informationalEntityId: String) = apply {
            this.informationalEntityId = informationalEntityId
        }

        /** The name you choose for the Account. */
        fun name(name: String) = apply { this.name = name }

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

        fun build(): AccountCreateParams =
            AccountCreateParams(
                entityId,
                informationalEntityId,
                checkNotNull(name) { "`name` is required but was not set" },
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }
}
