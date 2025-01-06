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

class AccountCreateParams
constructor(
    private val body: AccountCreateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    /** The name you choose for the Account. */
    fun name(): String = body.name()

    /** The identifier for the Entity that will own the Account. */
    fun entityId(): Optional<String> = body.entityId()

    /**
     * The identifier of an Entity that, while not owning the Account, is associated with its
     * activity. Its relationship to your group must be `informational`.
     */
    fun informationalEntityId(): Optional<String> = body.informationalEntityId()

    /**
     * The identifier for the Program that this Account falls under. Required if you operate more
     * than one Program.
     */
    fun programId(): Optional<String> = body.programId()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    @JvmSynthetic internal fun getBody(): AccountCreateBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class AccountCreateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("name") private val name: String,
        @JsonProperty("entity_id") private val entityId: String?,
        @JsonProperty("informational_entity_id") private val informationalEntityId: String?,
        @JsonProperty("program_id") private val programId: String?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The name you choose for the Account. */
        @JsonProperty("name") fun name(): String = name

        /** The identifier for the Entity that will own the Account. */
        @JsonProperty("entity_id") fun entityId(): Optional<String> = Optional.ofNullable(entityId)

        /**
         * The identifier of an Entity that, while not owning the Account, is associated with its
         * activity. Its relationship to your group must be `informational`.
         */
        @JsonProperty("informational_entity_id")
        fun informationalEntityId(): Optional<String> = Optional.ofNullable(informationalEntityId)

        /**
         * The identifier for the Program that this Account falls under. Required if you operate
         * more than one Program.
         */
        @JsonProperty("program_id")
        fun programId(): Optional<String> = Optional.ofNullable(programId)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var name: String? = null
            private var entityId: String? = null
            private var informationalEntityId: String? = null
            private var programId: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(accountCreateBody: AccountCreateBody) = apply {
                name = accountCreateBody.name
                entityId = accountCreateBody.entityId
                informationalEntityId = accountCreateBody.informationalEntityId
                programId = accountCreateBody.programId
                additionalProperties = accountCreateBody.additionalProperties.toMutableMap()
            }

            /** The name you choose for the Account. */
            fun name(name: String) = apply { this.name = name }

            /** The identifier for the Entity that will own the Account. */
            fun entityId(entityId: String?) = apply { this.entityId = entityId }

            /** The identifier for the Entity that will own the Account. */
            fun entityId(entityId: Optional<String>) = entityId(entityId.orElse(null))

            /**
             * The identifier of an Entity that, while not owning the Account, is associated with
             * its activity. Its relationship to your group must be `informational`.
             */
            fun informationalEntityId(informationalEntityId: String?) = apply {
                this.informationalEntityId = informationalEntityId
            }

            /**
             * The identifier of an Entity that, while not owning the Account, is associated with
             * its activity. Its relationship to your group must be `informational`.
             */
            fun informationalEntityId(informationalEntityId: Optional<String>) =
                informationalEntityId(informationalEntityId.orElse(null))

            /**
             * The identifier for the Program that this Account falls under. Required if you operate
             * more than one Program.
             */
            fun programId(programId: String?) = apply { this.programId = programId }

            /**
             * The identifier for the Program that this Account falls under. Required if you operate
             * more than one Program.
             */
            fun programId(programId: Optional<String>) = programId(programId.orElse(null))

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

            fun build(): AccountCreateBody =
                AccountCreateBody(
                    checkNotNull(name) { "`name` is required but was not set" },
                    entityId,
                    informationalEntityId,
                    programId,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AccountCreateBody && name == other.name && entityId == other.entityId && informationalEntityId == other.informationalEntityId && programId == other.programId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(name, entityId, informationalEntityId, programId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AccountCreateBody{name=$name, entityId=$entityId, informationalEntityId=$informationalEntityId, programId=$programId, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var body: AccountCreateBody.Builder = AccountCreateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(accountCreateParams: AccountCreateParams) = apply {
            body = accountCreateParams.body.toBuilder()
            additionalHeaders = accountCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = accountCreateParams.additionalQueryParams.toBuilder()
        }

        /** The name you choose for the Account. */
        fun name(name: String) = apply { body.name(name) }

        /** The identifier for the Entity that will own the Account. */
        fun entityId(entityId: String?) = apply { body.entityId(entityId) }

        /** The identifier for the Entity that will own the Account. */
        fun entityId(entityId: Optional<String>) = entityId(entityId.orElse(null))

        /**
         * The identifier of an Entity that, while not owning the Account, is associated with its
         * activity. Its relationship to your group must be `informational`.
         */
        fun informationalEntityId(informationalEntityId: String?) = apply {
            body.informationalEntityId(informationalEntityId)
        }

        /**
         * The identifier of an Entity that, while not owning the Account, is associated with its
         * activity. Its relationship to your group must be `informational`.
         */
        fun informationalEntityId(informationalEntityId: Optional<String>) =
            informationalEntityId(informationalEntityId.orElse(null))

        /**
         * The identifier for the Program that this Account falls under. Required if you operate
         * more than one Program.
         */
        fun programId(programId: String?) = apply { body.programId(programId) }

        /**
         * The identifier for the Program that this Account falls under. Required if you operate
         * more than one Program.
         */
        fun programId(programId: Optional<String>) = programId(programId.orElse(null))

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

        fun build(): AccountCreateParams =
            AccountCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AccountCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "AccountCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
