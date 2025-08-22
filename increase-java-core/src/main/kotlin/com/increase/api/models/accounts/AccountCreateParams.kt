// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.accounts

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

/** Create an Account */
class AccountCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The name you choose for the Account.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = body.name()

    /**
     * The identifier for the Entity that will own the Account.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun entityId(): Optional<String> = body.entityId()

    /**
     * The identifier of an Entity that, while not owning the Account, is associated with its
     * activity. Its relationship to your group must be `informational`.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun informationalEntityId(): Optional<String> = body.informationalEntityId()

    /**
     * The identifier for the Program that this Account falls under. Required if you operate more
     * than one Program.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun programId(): Optional<String> = body.programId()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [entityId].
     *
     * Unlike [entityId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _entityId(): JsonField<String> = body._entityId()

    /**
     * Returns the raw JSON value of [informationalEntityId].
     *
     * Unlike [informationalEntityId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _informationalEntityId(): JsonField<String> = body._informationalEntityId()

    /**
     * Returns the raw JSON value of [programId].
     *
     * Unlike [programId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _programId(): JsonField<String> = body._programId()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AccountCreateParams].
         *
         * The following fields are required:
         * ```java
         * .name()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AccountCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(accountCreateParams: AccountCreateParams) = apply {
            body = accountCreateParams.body.toBuilder()
            additionalHeaders = accountCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = accountCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [name]
         * - [entityId]
         * - [informationalEntityId]
         * - [programId]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The name you choose for the Account. */
        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /** The identifier for the Entity that will own the Account. */
        fun entityId(entityId: String) = apply { body.entityId(entityId) }

        /**
         * Sets [Builder.entityId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.entityId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun entityId(entityId: JsonField<String>) = apply { body.entityId(entityId) }

        /**
         * The identifier of an Entity that, while not owning the Account, is associated with its
         * activity. Its relationship to your group must be `informational`.
         */
        fun informationalEntityId(informationalEntityId: String) = apply {
            body.informationalEntityId(informationalEntityId)
        }

        /**
         * Sets [Builder.informationalEntityId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.informationalEntityId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun informationalEntityId(informationalEntityId: JsonField<String>) = apply {
            body.informationalEntityId(informationalEntityId)
        }

        /**
         * The identifier for the Program that this Account falls under. Required if you operate
         * more than one Program.
         */
        fun programId(programId: String) = apply { body.programId(programId) }

        /**
         * Sets [Builder.programId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.programId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun programId(programId: JsonField<String>) = apply { body.programId(programId) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAlladditional_body_properties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAlladditional_body_properties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAlladditional_body_properties(keys: Set<String>) = apply {
            body.removeAlladditional_body_properties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAlladditional_headers(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAlladditional_headers(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putadditional_headers(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAlladditional_headers(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAlladditional_headers(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceadditional_headers(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceadditional_headers(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAlladditional_headers(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAlladditional_headers(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeadditional_headers(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAlladditional_headers(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAlladditional_query_params(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAlladditional_query_params(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putadditional_query_params(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAlladditional_query_params(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAlladditional_query_params(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceadditional_query_params(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceadditional_query_params(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAlladditional_query_params(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAlladditional_query_params(
            additionalQueryParams: Map<String, Iterable<String>>
        ) = apply { this.additionalQueryParams.replaceAll(additionalQueryParams) }

        fun removeadditional_query_params(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAlladditional_query_params(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [AccountCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .name()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AccountCreateParams =
            AccountCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    private constructor(
        private val name: JsonField<String>,
        private val entityId: JsonField<String>,
        private val informationalEntityId: JsonField<String>,
        private val programId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("entity_id")
            @ExcludeMissing
            entityId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("informational_entity_id")
            @ExcludeMissing
            informationalEntityId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("program_id")
            @ExcludeMissing
            programId: JsonField<String> = JsonMissing.of(),
        ) : this(name, entityId, informationalEntityId, programId, mutableMapOf())

        /**
         * The name you choose for the Account.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * The identifier for the Entity that will own the Account.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun entityId(): Optional<String> = entityId.getOptional("entity_id")

        /**
         * The identifier of an Entity that, while not owning the Account, is associated with its
         * activity. Its relationship to your group must be `informational`.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun informationalEntityId(): Optional<String> =
            informationalEntityId.getOptional("informational_entity_id")

        /**
         * The identifier for the Program that this Account falls under. Required if you operate
         * more than one Program.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun programId(): Optional<String> = programId.getOptional("program_id")

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [entityId].
         *
         * Unlike [entityId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("entity_id") @ExcludeMissing fun _entityId(): JsonField<String> = entityId

        /**
         * Returns the raw JSON value of [informationalEntityId].
         *
         * Unlike [informationalEntityId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("informational_entity_id")
        @ExcludeMissing
        fun _informationalEntityId(): JsonField<String> = informationalEntityId

        /**
         * Returns the raw JSON value of [programId].
         *
         * Unlike [programId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("program_id") @ExcludeMissing fun _programId(): JsonField<String> = programId

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
             * .name()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var name: JsonField<String>? = null
            private var entityId: JsonField<String> = JsonMissing.of()
            private var informationalEntityId: JsonField<String> = JsonMissing.of()
            private var programId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                name = body.name
                entityId = body.entityId
                informationalEntityId = body.informationalEntityId
                programId = body.programId
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The name you choose for the Account. */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** The identifier for the Entity that will own the Account. */
            fun entityId(entityId: String) = entityId(JsonField.of(entityId))

            /**
             * Sets [Builder.entityId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.entityId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun entityId(entityId: JsonField<String>) = apply { this.entityId = entityId }

            /**
             * The identifier of an Entity that, while not owning the Account, is associated with
             * its activity. Its relationship to your group must be `informational`.
             */
            fun informationalEntityId(informationalEntityId: String) =
                informationalEntityId(JsonField.of(informationalEntityId))

            /**
             * Sets [Builder.informationalEntityId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.informationalEntityId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun informationalEntityId(informationalEntityId: JsonField<String>) = apply {
                this.informationalEntityId = informationalEntityId
            }

            /**
             * The identifier for the Program that this Account falls under. Required if you operate
             * more than one Program.
             */
            fun programId(programId: String) = programId(JsonField.of(programId))

            /**
             * Sets [Builder.programId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.programId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun programId(programId: JsonField<String>) = apply { this.programId = programId }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAlladditional_properties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAlladditional_properties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAlladditional_properties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .name()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("name", name),
                    entityId,
                    informationalEntityId,
                    programId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            name()
            entityId()
            informationalEntityId()
            programId()
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
            (if (name.asKnown().isPresent) 1 else 0) +
                (if (entityId.asKnown().isPresent) 1 else 0) +
                (if (informationalEntityId.asKnown().isPresent) 1 else 0) +
                (if (programId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                name == other.name &&
                entityId == other.entityId &&
                informationalEntityId == other.informationalEntityId &&
                programId == other.programId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(name, entityId, informationalEntityId, programId, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{name=$name, entityId=$entityId, informationalEntityId=$informationalEntityId, programId=$programId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AccountCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "AccountCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
