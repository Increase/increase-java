// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.entityonboardingsessions

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.Params
import com.increase.api.core.checkRequired
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import com.increase.api.errors.IncreaseInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

/** Create an Entity Onboarding Session */
class EntityOnboardingSessionCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The identifier of the Program the Entity will be onboarded to.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun programId(): String = body.programId()

    /**
     * The URL to redirect the customer to after they complete the onboarding form. The redirect
     * will include `entity_onboarding_session_id` and `entity_id` query parameters.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun redirectUrl(): String = body.redirectUrl()

    /**
     * The identifier of an existing Entity to associate with the onboarding session. If provided,
     * the onboarding form will display any outstanding tasks required to complete the Entity's
     * onboarding.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun entityId(): Optional<String> = body.entityId()

    /**
     * Returns the raw JSON value of [programId].
     *
     * Unlike [programId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _programId(): JsonField<String> = body._programId()

    /**
     * Returns the raw JSON value of [redirectUrl].
     *
     * Unlike [redirectUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _redirectUrl(): JsonField<String> = body._redirectUrl()

    /**
     * Returns the raw JSON value of [entityId].
     *
     * Unlike [entityId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _entityId(): JsonField<String> = body._entityId()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [EntityOnboardingSessionCreateParams].
         *
         * The following fields are required:
         * ```java
         * .programId()
         * .redirectUrl()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EntityOnboardingSessionCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            entityOnboardingSessionCreateParams: EntityOnboardingSessionCreateParams
        ) = apply {
            body = entityOnboardingSessionCreateParams.body.toBuilder()
            additionalHeaders = entityOnboardingSessionCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                entityOnboardingSessionCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [programId]
         * - [redirectUrl]
         * - [entityId]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The identifier of the Program the Entity will be onboarded to. */
        fun programId(programId: String) = apply { body.programId(programId) }

        /**
         * Sets [Builder.programId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.programId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun programId(programId: JsonField<String>) = apply { body.programId(programId) }

        /**
         * The URL to redirect the customer to after they complete the onboarding form. The redirect
         * will include `entity_onboarding_session_id` and `entity_id` query parameters.
         */
        fun redirectUrl(redirectUrl: String) = apply { body.redirectUrl(redirectUrl) }

        /**
         * Sets [Builder.redirectUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.redirectUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun redirectUrl(redirectUrl: JsonField<String>) = apply { body.redirectUrl(redirectUrl) }

        /**
         * The identifier of an existing Entity to associate with the onboarding session. If
         * provided, the onboarding form will display any outstanding tasks required to complete the
         * Entity's onboarding.
         */
        fun entityId(entityId: String) = apply { body.entityId(entityId) }

        /**
         * Sets [Builder.entityId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.entityId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun entityId(entityId: JsonField<String>) = apply { body.entityId(entityId) }

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

        /**
         * Returns an immutable instance of [EntityOnboardingSessionCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .programId()
         * .redirectUrl()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EntityOnboardingSessionCreateParams =
            EntityOnboardingSessionCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val programId: JsonField<String>,
        private val redirectUrl: JsonField<String>,
        private val entityId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("program_id")
            @ExcludeMissing
            programId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("redirect_url")
            @ExcludeMissing
            redirectUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("entity_id")
            @ExcludeMissing
            entityId: JsonField<String> = JsonMissing.of(),
        ) : this(programId, redirectUrl, entityId, mutableMapOf())

        /**
         * The identifier of the Program the Entity will be onboarded to.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun programId(): String = programId.getRequired("program_id")

        /**
         * The URL to redirect the customer to after they complete the onboarding form. The redirect
         * will include `entity_onboarding_session_id` and `entity_id` query parameters.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun redirectUrl(): String = redirectUrl.getRequired("redirect_url")

        /**
         * The identifier of an existing Entity to associate with the onboarding session. If
         * provided, the onboarding form will display any outstanding tasks required to complete the
         * Entity's onboarding.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun entityId(): Optional<String> = entityId.getOptional("entity_id")

        /**
         * Returns the raw JSON value of [programId].
         *
         * Unlike [programId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("program_id") @ExcludeMissing fun _programId(): JsonField<String> = programId

        /**
         * Returns the raw JSON value of [redirectUrl].
         *
         * Unlike [redirectUrl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("redirect_url")
        @ExcludeMissing
        fun _redirectUrl(): JsonField<String> = redirectUrl

        /**
         * Returns the raw JSON value of [entityId].
         *
         * Unlike [entityId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("entity_id") @ExcludeMissing fun _entityId(): JsonField<String> = entityId

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .programId()
             * .redirectUrl()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var programId: JsonField<String>? = null
            private var redirectUrl: JsonField<String>? = null
            private var entityId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                programId = body.programId
                redirectUrl = body.redirectUrl
                entityId = body.entityId
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The identifier of the Program the Entity will be onboarded to. */
            fun programId(programId: String) = programId(JsonField.of(programId))

            /**
             * Sets [Builder.programId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.programId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun programId(programId: JsonField<String>) = apply { this.programId = programId }

            /**
             * The URL to redirect the customer to after they complete the onboarding form. The
             * redirect will include `entity_onboarding_session_id` and `entity_id` query
             * parameters.
             */
            fun redirectUrl(redirectUrl: String) = redirectUrl(JsonField.of(redirectUrl))

            /**
             * Sets [Builder.redirectUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.redirectUrl] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun redirectUrl(redirectUrl: JsonField<String>) = apply {
                this.redirectUrl = redirectUrl
            }

            /**
             * The identifier of an existing Entity to associate with the onboarding session. If
             * provided, the onboarding form will display any outstanding tasks required to complete
             * the Entity's onboarding.
             */
            fun entityId(entityId: String) = entityId(JsonField.of(entityId))

            /**
             * Sets [Builder.entityId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.entityId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun entityId(entityId: JsonField<String>) = apply { this.entityId = entityId }

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

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .programId()
             * .redirectUrl()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("programId", programId),
                    checkRequired("redirectUrl", redirectUrl),
                    entityId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            programId()
            redirectUrl()
            entityId()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: IncreaseInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (programId.asKnown().isPresent) 1 else 0) +
                (if (redirectUrl.asKnown().isPresent) 1 else 0) +
                (if (entityId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                programId == other.programId &&
                redirectUrl == other.redirectUrl &&
                entityId == other.entityId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(programId, redirectUrl, entityId, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{programId=$programId, redirectUrl=$redirectUrl, entityId=$entityId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EntityOnboardingSessionCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "EntityOnboardingSessionCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
