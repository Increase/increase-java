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
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import com.increase.api.errors.IncreaseInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Update an Account */
class AccountUpdateParams
private constructor(
    private val accountId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** The identifier of the Account to update. */
    fun accountId(): Optional<String> = Optional.ofNullable(accountId)

    /**
     * The new credit limit of the Account, if and only if the Account is a loan account.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun creditLimit(): Optional<Long> = body.creditLimit()

    /**
     * The new name of the Account.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = body.name()

    /**
     * Returns the raw JSON value of [creditLimit].
     *
     * Unlike [creditLimit], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _creditLimit(): JsonField<Long> = body._creditLimit()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): AccountUpdateParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [AccountUpdateParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AccountUpdateParams]. */
    class Builder internal constructor() {

        private var accountId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(accountUpdateParams: AccountUpdateParams) = apply {
            accountId = accountUpdateParams.accountId
            body = accountUpdateParams.body.toBuilder()
            additionalHeaders = accountUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = accountUpdateParams.additionalQueryParams.toBuilder()
        }

        /** The identifier of the Account to update. */
        fun accountId(accountId: String?) = apply { this.accountId = accountId }

        /** Alias for calling [Builder.accountId] with `accountId.orElse(null)`. */
        fun accountId(accountId: Optional<String>) = accountId(accountId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [creditLimit]
         * - [name]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The new credit limit of the Account, if and only if the Account is a loan account. */
        fun creditLimit(creditLimit: Long) = apply { body.creditLimit(creditLimit) }

        /**
         * Sets [Builder.creditLimit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.creditLimit] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun creditLimit(creditLimit: JsonField<Long>) = apply { body.creditLimit(creditLimit) }

        /** The new name of the Account. */
        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

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
         * Returns an immutable instance of [AccountUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): AccountUpdateParams =
            AccountUpdateParams(
                accountId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> accountId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    private constructor(
        private val creditLimit: JsonField<Long>,
        private val name: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("credit_limit")
            @ExcludeMissing
            creditLimit: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        ) : this(creditLimit, name, mutableMapOf())

        /**
         * The new credit limit of the Account, if and only if the Account is a loan account.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun creditLimit(): Optional<Long> = creditLimit.getOptional("credit_limit")

        /**
         * The new name of the Account.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * Returns the raw JSON value of [creditLimit].
         *
         * Unlike [creditLimit], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("credit_limit")
        @ExcludeMissing
        fun _creditLimit(): JsonField<Long> = creditLimit

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var creditLimit: JsonField<Long> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                creditLimit = body.creditLimit
                name = body.name
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * The new credit limit of the Account, if and only if the Account is a loan account.
             */
            fun creditLimit(creditLimit: Long) = creditLimit(JsonField.of(creditLimit))

            /**
             * Sets [Builder.creditLimit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.creditLimit] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun creditLimit(creditLimit: JsonField<Long>) = apply { this.creditLimit = creditLimit }

            /** The new name of the Account. */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

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
             */
            fun build(): Body = Body(creditLimit, name, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            creditLimit()
            name()
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
            (if (creditLimit.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                creditLimit == other.creditLimit &&
                name == other.name &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(creditLimit, name, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{creditLimit=$creditLimit, name=$name, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AccountUpdateParams &&
            accountId == other.accountId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(accountId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "AccountUpdateParams{accountId=$accountId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
