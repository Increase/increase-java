// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.simulations.entities

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.increase.api.core.Enum
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.Params
import com.increase.api.core.checkKnown
import com.increase.api.core.checkRequired
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import com.increase.api.core.toImmutable
import com.increase.api.errors.IncreaseInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Simulate updates to an
 * [Entity's validation](/documentation/api/entities#entity-object.validation). In production, Know
 * Your Customer validations [run automatically](/documentation/entity-validation#entity-validation)
 * for eligible programs. While developing, use this API to simulate issues with information
 * submissions.
 */
class EntityUpdateValidationParams
private constructor(
    private val entityId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** The identifier of the Entity whose validation status to update. */
    fun entityId(): Optional<String> = Optional.ofNullable(entityId)

    /**
     * The validation issues to attach. If no issues are provided, the validation status will be set
     * to `valid`.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun issues(): List<Issue> = body.issues()

    /**
     * Returns the raw JSON value of [issues].
     *
     * Unlike [issues], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _issues(): JsonField<List<Issue>> = body._issues()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EntityUpdateValidationParams].
         *
         * The following fields are required:
         * ```java
         * .issues()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EntityUpdateValidationParams]. */
    class Builder internal constructor() {

        private var entityId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(entityUpdateValidationParams: EntityUpdateValidationParams) = apply {
            entityId = entityUpdateValidationParams.entityId
            body = entityUpdateValidationParams.body.toBuilder()
            additionalHeaders = entityUpdateValidationParams.additionalHeaders.toBuilder()
            additionalQueryParams = entityUpdateValidationParams.additionalQueryParams.toBuilder()
        }

        /** The identifier of the Entity whose validation status to update. */
        fun entityId(entityId: String?) = apply { this.entityId = entityId }

        /** Alias for calling [Builder.entityId] with `entityId.orElse(null)`. */
        fun entityId(entityId: Optional<String>) = entityId(entityId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [issues]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * The validation issues to attach. If no issues are provided, the validation status will be
         * set to `valid`.
         */
        fun issues(issues: List<Issue>) = apply { body.issues(issues) }

        /**
         * Sets [Builder.issues] to an arbitrary JSON value.
         *
         * You should usually call [Builder.issues] with a well-typed `List<Issue>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun issues(issues: JsonField<List<Issue>>) = apply { body.issues(issues) }

        /**
         * Adds a single [Issue] to [issues].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addIssue(issue: Issue) = apply { body.addIssue(issue) }

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
         * Returns an immutable instance of [EntityUpdateValidationParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .issues()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EntityUpdateValidationParams =
            EntityUpdateValidationParams(
                entityId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> entityId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val issues: JsonField<List<Issue>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("issues")
            @ExcludeMissing
            issues: JsonField<List<Issue>> = JsonMissing.of()
        ) : this(issues, mutableMapOf())

        /**
         * The validation issues to attach. If no issues are provided, the validation status will be
         * set to `valid`.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun issues(): List<Issue> = issues.getRequired("issues")

        /**
         * Returns the raw JSON value of [issues].
         *
         * Unlike [issues], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("issues") @ExcludeMissing fun _issues(): JsonField<List<Issue>> = issues

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
             * .issues()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var issues: JsonField<MutableList<Issue>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                issues = body.issues.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * The validation issues to attach. If no issues are provided, the validation status
             * will be set to `valid`.
             */
            fun issues(issues: List<Issue>) = issues(JsonField.of(issues))

            /**
             * Sets [Builder.issues] to an arbitrary JSON value.
             *
             * You should usually call [Builder.issues] with a well-typed `List<Issue>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun issues(issues: JsonField<List<Issue>>) = apply {
                this.issues = issues.map { it.toMutableList() }
            }

            /**
             * Adds a single [Issue] to [issues].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addIssue(issue: Issue) = apply {
                issues =
                    (issues ?: JsonField.of(mutableListOf())).also {
                        checkKnown("issues", it).add(issue)
                    }
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

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .issues()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("issues", issues).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            issues().forEach { it.validate() }
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
            (issues.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                issues == other.issues &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(issues, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Body{issues=$issues, additionalProperties=$additionalProperties}"
    }

    class Issue
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val category: JsonField<Category>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("category")
            @ExcludeMissing
            category: JsonField<Category> = JsonMissing.of()
        ) : this(category, mutableMapOf())

        /**
         * The type of issue.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun category(): Category = category.getRequired("category")

        /**
         * Returns the raw JSON value of [category].
         *
         * Unlike [category], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("category") @ExcludeMissing fun _category(): JsonField<Category> = category

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
             * Returns a mutable builder for constructing an instance of [Issue].
             *
             * The following fields are required:
             * ```java
             * .category()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Issue]. */
        class Builder internal constructor() {

            private var category: JsonField<Category>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(issue: Issue) = apply {
                category = issue.category
                additionalProperties = issue.additionalProperties.toMutableMap()
            }

            /** The type of issue. */
            fun category(category: Category) = category(JsonField.of(category))

            /**
             * Sets [Builder.category] to an arbitrary JSON value.
             *
             * You should usually call [Builder.category] with a well-typed [Category] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun category(category: JsonField<Category>) = apply { this.category = category }

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
             * Returns an immutable instance of [Issue].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .category()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Issue =
                Issue(checkRequired("category", category), additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Issue = apply {
            if (validated) {
                return@apply
            }

            category().validate()
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
        internal fun validity(): Int = (category.asKnown().getOrNull()?.validity() ?: 0)

        /** The type of issue. */
        class Category @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                /**
                 * The entity's tax identifier could not be validated. Update the tax ID with the
                 * [update an entity API](/documentation/api/entities#update-an-entity.corporation.legal_identifier).
                 */
                @JvmField val ENTITY_TAX_IDENTIFIER = of("entity_tax_identifier")

                /**
                 * The entity's address could not be validated. Update the address with the
                 * [update an entity API](/documentation/api/entities#update-an-entity.corporation.address).
                 */
                @JvmField val ENTITY_ADDRESS = of("entity_address")

                /**
                 * A beneficial owner's identity could not be verified. Update the identification
                 * with the
                 * [update a beneficial owner API](/documentation/api/beneficial-owners#update-a-beneficial-owner).
                 */
                @JvmField val BENEFICIAL_OWNER_IDENTITY = of("beneficial_owner_identity")

                /**
                 * A beneficial owner's address could not be validated. Update the address with the
                 * [update a beneficial owner API](/documentation/api/beneficial-owners#update-a-beneficial-owner).
                 */
                @JvmField val BENEFICIAL_OWNER_ADDRESS = of("beneficial_owner_address")

                @JvmStatic fun of(value: String) = Category(JsonField.of(value))
            }

            /** An enum containing [Category]'s known values. */
            enum class Known {
                /**
                 * The entity's tax identifier could not be validated. Update the tax ID with the
                 * [update an entity API](/documentation/api/entities#update-an-entity.corporation.legal_identifier).
                 */
                ENTITY_TAX_IDENTIFIER,
                /**
                 * The entity's address could not be validated. Update the address with the
                 * [update an entity API](/documentation/api/entities#update-an-entity.corporation.address).
                 */
                ENTITY_ADDRESS,
                /**
                 * A beneficial owner's identity could not be verified. Update the identification
                 * with the
                 * [update a beneficial owner API](/documentation/api/beneficial-owners#update-a-beneficial-owner).
                 */
                BENEFICIAL_OWNER_IDENTITY,
                /**
                 * A beneficial owner's address could not be validated. Update the address with the
                 * [update a beneficial owner API](/documentation/api/beneficial-owners#update-a-beneficial-owner).
                 */
                BENEFICIAL_OWNER_ADDRESS,
            }

            /**
             * An enum containing [Category]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Category] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                /**
                 * The entity's tax identifier could not be validated. Update the tax ID with the
                 * [update an entity API](/documentation/api/entities#update-an-entity.corporation.legal_identifier).
                 */
                ENTITY_TAX_IDENTIFIER,
                /**
                 * The entity's address could not be validated. Update the address with the
                 * [update an entity API](/documentation/api/entities#update-an-entity.corporation.address).
                 */
                ENTITY_ADDRESS,
                /**
                 * A beneficial owner's identity could not be verified. Update the identification
                 * with the
                 * [update a beneficial owner API](/documentation/api/beneficial-owners#update-a-beneficial-owner).
                 */
                BENEFICIAL_OWNER_IDENTITY,
                /**
                 * A beneficial owner's address could not be validated. Update the address with the
                 * [update a beneficial owner API](/documentation/api/beneficial-owners#update-a-beneficial-owner).
                 */
                BENEFICIAL_OWNER_ADDRESS,
                /**
                 * An enum member indicating that [Category] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    ENTITY_TAX_IDENTIFIER -> Value.ENTITY_TAX_IDENTIFIER
                    ENTITY_ADDRESS -> Value.ENTITY_ADDRESS
                    BENEFICIAL_OWNER_IDENTITY -> Value.BENEFICIAL_OWNER_IDENTITY
                    BENEFICIAL_OWNER_ADDRESS -> Value.BENEFICIAL_OWNER_ADDRESS
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws IncreaseInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    ENTITY_TAX_IDENTIFIER -> Known.ENTITY_TAX_IDENTIFIER
                    ENTITY_ADDRESS -> Known.ENTITY_ADDRESS
                    BENEFICIAL_OWNER_IDENTITY -> Known.BENEFICIAL_OWNER_IDENTITY
                    BENEFICIAL_OWNER_ADDRESS -> Known.BENEFICIAL_OWNER_ADDRESS
                    else -> throw IncreaseInvalidDataException("Unknown Category: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws IncreaseInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    IncreaseInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): Category = apply {
                if (validated) {
                    return@apply
                }

                known()
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
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Category && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Issue &&
                category == other.category &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(category, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Issue{category=$category, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EntityUpdateValidationParams &&
            entityId == other.entityId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(entityId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "EntityUpdateValidationParams{entityId=$entityId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
