// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.accounts

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
import com.increase.api.core.checkRequired
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import com.increase.api.errors.IncreaseInvalidDataException
import java.time.LocalDate
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

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
     * Whether the Account is funded by a loan or by deposits.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun funding(): Optional<Funding> = body.funding()

    /**
     * The identifier of an Entity that, while not owning the Account, is associated with its
     * activity. This is generally the beneficiary of the funds.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun informationalEntityId(): Optional<String> = body.informationalEntityId()

    /**
     * The loan details for the account.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun loan(): Optional<Loan> = body.loan()

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
     * Returns the raw JSON value of [funding].
     *
     * Unlike [funding], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _funding(): JsonField<Funding> = body._funding()

    /**
     * Returns the raw JSON value of [informationalEntityId].
     *
     * Unlike [informationalEntityId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _informationalEntityId(): JsonField<String> = body._informationalEntityId()

    /**
     * Returns the raw JSON value of [loan].
     *
     * Unlike [loan], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _loan(): JsonField<Loan> = body._loan()

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
         * - [funding]
         * - [informationalEntityId]
         * - [loan]
         * - etc.
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

        /** Whether the Account is funded by a loan or by deposits. */
        fun funding(funding: Funding) = apply { body.funding(funding) }

        /**
         * Sets [Builder.funding] to an arbitrary JSON value.
         *
         * You should usually call [Builder.funding] with a well-typed [Funding] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun funding(funding: JsonField<Funding>) = apply { body.funding(funding) }

        /**
         * The identifier of an Entity that, while not owning the Account, is associated with its
         * activity. This is generally the beneficiary of the funds.
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

        /** The loan details for the account. */
        fun loan(loan: Loan) = apply { body.loan(loan) }

        /**
         * Sets [Builder.loan] to an arbitrary JSON value.
         *
         * You should usually call [Builder.loan] with a well-typed [Loan] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun loan(loan: JsonField<Loan>) = apply { body.loan(loan) }

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
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val name: JsonField<String>,
        private val entityId: JsonField<String>,
        private val funding: JsonField<Funding>,
        private val informationalEntityId: JsonField<String>,
        private val loan: JsonField<Loan>,
        private val programId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("entity_id")
            @ExcludeMissing
            entityId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("funding") @ExcludeMissing funding: JsonField<Funding> = JsonMissing.of(),
            @JsonProperty("informational_entity_id")
            @ExcludeMissing
            informationalEntityId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("loan") @ExcludeMissing loan: JsonField<Loan> = JsonMissing.of(),
            @JsonProperty("program_id")
            @ExcludeMissing
            programId: JsonField<String> = JsonMissing.of(),
        ) : this(name, entityId, funding, informationalEntityId, loan, programId, mutableMapOf())

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
         * Whether the Account is funded by a loan or by deposits.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun funding(): Optional<Funding> = funding.getOptional("funding")

        /**
         * The identifier of an Entity that, while not owning the Account, is associated with its
         * activity. This is generally the beneficiary of the funds.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun informationalEntityId(): Optional<String> =
            informationalEntityId.getOptional("informational_entity_id")

        /**
         * The loan details for the account.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun loan(): Optional<Loan> = loan.getOptional("loan")

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
         * Returns the raw JSON value of [funding].
         *
         * Unlike [funding], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("funding") @ExcludeMissing fun _funding(): JsonField<Funding> = funding

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
         * Returns the raw JSON value of [loan].
         *
         * Unlike [loan], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("loan") @ExcludeMissing fun _loan(): JsonField<Loan> = loan

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
            private var funding: JsonField<Funding> = JsonMissing.of()
            private var informationalEntityId: JsonField<String> = JsonMissing.of()
            private var loan: JsonField<Loan> = JsonMissing.of()
            private var programId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                name = body.name
                entityId = body.entityId
                funding = body.funding
                informationalEntityId = body.informationalEntityId
                loan = body.loan
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

            /** Whether the Account is funded by a loan or by deposits. */
            fun funding(funding: Funding) = funding(JsonField.of(funding))

            /**
             * Sets [Builder.funding] to an arbitrary JSON value.
             *
             * You should usually call [Builder.funding] with a well-typed [Funding] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun funding(funding: JsonField<Funding>) = apply { this.funding = funding }

            /**
             * The identifier of an Entity that, while not owning the Account, is associated with
             * its activity. This is generally the beneficiary of the funds.
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

            /** The loan details for the account. */
            fun loan(loan: Loan) = loan(JsonField.of(loan))

            /**
             * Sets [Builder.loan] to an arbitrary JSON value.
             *
             * You should usually call [Builder.loan] with a well-typed [Loan] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun loan(loan: JsonField<Loan>) = apply { this.loan = loan }

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
             * .name()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("name", name),
                    entityId,
                    funding,
                    informationalEntityId,
                    loan,
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
            funding().ifPresent { it.validate() }
            informationalEntityId()
            loan().ifPresent { it.validate() }
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
                (funding.asKnown().getOrNull()?.validity() ?: 0) +
                (if (informationalEntityId.asKnown().isPresent) 1 else 0) +
                (loan.asKnown().getOrNull()?.validity() ?: 0) +
                (if (programId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                name == other.name &&
                entityId == other.entityId &&
                funding == other.funding &&
                informationalEntityId == other.informationalEntityId &&
                loan == other.loan &&
                programId == other.programId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                name,
                entityId,
                funding,
                informationalEntityId,
                loan,
                programId,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{name=$name, entityId=$entityId, funding=$funding, informationalEntityId=$informationalEntityId, loan=$loan, programId=$programId, additionalProperties=$additionalProperties}"
    }

    /** Whether the Account is funded by a loan or by deposits. */
    class Funding @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            /**
             * An account funded by a loan. Before opening a loan account, contact
             * support@increase.com to set up a loan program.
             */
            @JvmField val LOAN = of("loan")

            /** An account funded by deposits. */
            @JvmField val DEPOSITS = of("deposits")

            @JvmStatic fun of(value: String) = Funding(JsonField.of(value))
        }

        /** An enum containing [Funding]'s known values. */
        enum class Known {
            /**
             * An account funded by a loan. Before opening a loan account, contact
             * support@increase.com to set up a loan program.
             */
            LOAN,
            /** An account funded by deposits. */
            DEPOSITS,
        }

        /**
         * An enum containing [Funding]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Funding] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            /**
             * An account funded by a loan. Before opening a loan account, contact
             * support@increase.com to set up a loan program.
             */
            LOAN,
            /** An account funded by deposits. */
            DEPOSITS,
            /** An enum member indicating that [Funding] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                LOAN -> Value.LOAN
                DEPOSITS -> Value.DEPOSITS
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws IncreaseInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                LOAN -> Known.LOAN
                DEPOSITS -> Known.DEPOSITS
                else -> throw IncreaseInvalidDataException("Unknown Funding: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws IncreaseInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                IncreaseInvalidDataException("Value is not a String")
            }

        private var validated: Boolean = false

        fun validate(): Funding = apply {
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

            return other is Funding && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The loan details for the account. */
    class Loan
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val creditLimit: JsonField<Long>,
        private val gracePeriodDays: JsonField<Long>,
        private val statementDayOfMonth: JsonField<Long>,
        private val statementPaymentType: JsonField<StatementPaymentType>,
        private val maturityDate: JsonField<LocalDate>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("credit_limit")
            @ExcludeMissing
            creditLimit: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("grace_period_days")
            @ExcludeMissing
            gracePeriodDays: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("statement_day_of_month")
            @ExcludeMissing
            statementDayOfMonth: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("statement_payment_type")
            @ExcludeMissing
            statementPaymentType: JsonField<StatementPaymentType> = JsonMissing.of(),
            @JsonProperty("maturity_date")
            @ExcludeMissing
            maturityDate: JsonField<LocalDate> = JsonMissing.of(),
        ) : this(
            creditLimit,
            gracePeriodDays,
            statementDayOfMonth,
            statementPaymentType,
            maturityDate,
            mutableMapOf(),
        )

        /**
         * The maximum amount of money that can be drawn from the Account.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun creditLimit(): Long = creditLimit.getRequired("credit_limit")

        /**
         * The number of days after the statement date that the Account can be past due before being
         * considered delinquent.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun gracePeriodDays(): Long = gracePeriodDays.getRequired("grace_period_days")

        /**
         * The day of the month on which the loan statement is generated.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun statementDayOfMonth(): Long = statementDayOfMonth.getRequired("statement_day_of_month")

        /**
         * The type of statement payment for the account.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun statementPaymentType(): StatementPaymentType =
            statementPaymentType.getRequired("statement_payment_type")

        /**
         * The date on which the loan matures.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun maturityDate(): Optional<LocalDate> = maturityDate.getOptional("maturity_date")

        /**
         * Returns the raw JSON value of [creditLimit].
         *
         * Unlike [creditLimit], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("credit_limit")
        @ExcludeMissing
        fun _creditLimit(): JsonField<Long> = creditLimit

        /**
         * Returns the raw JSON value of [gracePeriodDays].
         *
         * Unlike [gracePeriodDays], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("grace_period_days")
        @ExcludeMissing
        fun _gracePeriodDays(): JsonField<Long> = gracePeriodDays

        /**
         * Returns the raw JSON value of [statementDayOfMonth].
         *
         * Unlike [statementDayOfMonth], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("statement_day_of_month")
        @ExcludeMissing
        fun _statementDayOfMonth(): JsonField<Long> = statementDayOfMonth

        /**
         * Returns the raw JSON value of [statementPaymentType].
         *
         * Unlike [statementPaymentType], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("statement_payment_type")
        @ExcludeMissing
        fun _statementPaymentType(): JsonField<StatementPaymentType> = statementPaymentType

        /**
         * Returns the raw JSON value of [maturityDate].
         *
         * Unlike [maturityDate], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("maturity_date")
        @ExcludeMissing
        fun _maturityDate(): JsonField<LocalDate> = maturityDate

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
             * Returns a mutable builder for constructing an instance of [Loan].
             *
             * The following fields are required:
             * ```java
             * .creditLimit()
             * .gracePeriodDays()
             * .statementDayOfMonth()
             * .statementPaymentType()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Loan]. */
        class Builder internal constructor() {

            private var creditLimit: JsonField<Long>? = null
            private var gracePeriodDays: JsonField<Long>? = null
            private var statementDayOfMonth: JsonField<Long>? = null
            private var statementPaymentType: JsonField<StatementPaymentType>? = null
            private var maturityDate: JsonField<LocalDate> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(loan: Loan) = apply {
                creditLimit = loan.creditLimit
                gracePeriodDays = loan.gracePeriodDays
                statementDayOfMonth = loan.statementDayOfMonth
                statementPaymentType = loan.statementPaymentType
                maturityDate = loan.maturityDate
                additionalProperties = loan.additionalProperties.toMutableMap()
            }

            /** The maximum amount of money that can be drawn from the Account. */
            fun creditLimit(creditLimit: Long) = creditLimit(JsonField.of(creditLimit))

            /**
             * Sets [Builder.creditLimit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.creditLimit] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun creditLimit(creditLimit: JsonField<Long>) = apply { this.creditLimit = creditLimit }

            /**
             * The number of days after the statement date that the Account can be past due before
             * being considered delinquent.
             */
            fun gracePeriodDays(gracePeriodDays: Long) =
                gracePeriodDays(JsonField.of(gracePeriodDays))

            /**
             * Sets [Builder.gracePeriodDays] to an arbitrary JSON value.
             *
             * You should usually call [Builder.gracePeriodDays] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun gracePeriodDays(gracePeriodDays: JsonField<Long>) = apply {
                this.gracePeriodDays = gracePeriodDays
            }

            /** The day of the month on which the loan statement is generated. */
            fun statementDayOfMonth(statementDayOfMonth: Long) =
                statementDayOfMonth(JsonField.of(statementDayOfMonth))

            /**
             * Sets [Builder.statementDayOfMonth] to an arbitrary JSON value.
             *
             * You should usually call [Builder.statementDayOfMonth] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun statementDayOfMonth(statementDayOfMonth: JsonField<Long>) = apply {
                this.statementDayOfMonth = statementDayOfMonth
            }

            /** The type of statement payment for the account. */
            fun statementPaymentType(statementPaymentType: StatementPaymentType) =
                statementPaymentType(JsonField.of(statementPaymentType))

            /**
             * Sets [Builder.statementPaymentType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.statementPaymentType] with a well-typed
             * [StatementPaymentType] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun statementPaymentType(statementPaymentType: JsonField<StatementPaymentType>) =
                apply {
                    this.statementPaymentType = statementPaymentType
                }

            /** The date on which the loan matures. */
            fun maturityDate(maturityDate: LocalDate) = maturityDate(JsonField.of(maturityDate))

            /**
             * Sets [Builder.maturityDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maturityDate] with a well-typed [LocalDate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maturityDate(maturityDate: JsonField<LocalDate>) = apply {
                this.maturityDate = maturityDate
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
             * Returns an immutable instance of [Loan].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .creditLimit()
             * .gracePeriodDays()
             * .statementDayOfMonth()
             * .statementPaymentType()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Loan =
                Loan(
                    checkRequired("creditLimit", creditLimit),
                    checkRequired("gracePeriodDays", gracePeriodDays),
                    checkRequired("statementDayOfMonth", statementDayOfMonth),
                    checkRequired("statementPaymentType", statementPaymentType),
                    maturityDate,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Loan = apply {
            if (validated) {
                return@apply
            }

            creditLimit()
            gracePeriodDays()
            statementDayOfMonth()
            statementPaymentType().validate()
            maturityDate()
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
                (if (gracePeriodDays.asKnown().isPresent) 1 else 0) +
                (if (statementDayOfMonth.asKnown().isPresent) 1 else 0) +
                (statementPaymentType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (maturityDate.asKnown().isPresent) 1 else 0)

        /** The type of statement payment for the account. */
        class StatementPaymentType
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

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
                 * The borrower must pay the full balance of the loan at the end of the statement
                 * period.
                 */
                @JvmField val BALANCE = of("balance")

                /**
                 * The borrower must pay the accrued interest at the end of the statement period.
                 */
                @JvmField val INTEREST_UNTIL_MATURITY = of("interest_until_maturity")

                @JvmStatic fun of(value: String) = StatementPaymentType(JsonField.of(value))
            }

            /** An enum containing [StatementPaymentType]'s known values. */
            enum class Known {
                /**
                 * The borrower must pay the full balance of the loan at the end of the statement
                 * period.
                 */
                BALANCE,
                /**
                 * The borrower must pay the accrued interest at the end of the statement period.
                 */
                INTEREST_UNTIL_MATURITY,
            }

            /**
             * An enum containing [StatementPaymentType]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [StatementPaymentType] can contain an unknown value in a couple of
             * cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                /**
                 * The borrower must pay the full balance of the loan at the end of the statement
                 * period.
                 */
                BALANCE,
                /**
                 * The borrower must pay the accrued interest at the end of the statement period.
                 */
                INTEREST_UNTIL_MATURITY,
                /**
                 * An enum member indicating that [StatementPaymentType] was instantiated with an
                 * unknown value.
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
                    BALANCE -> Value.BALANCE
                    INTEREST_UNTIL_MATURITY -> Value.INTEREST_UNTIL_MATURITY
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
                    BALANCE -> Known.BALANCE
                    INTEREST_UNTIL_MATURITY -> Known.INTEREST_UNTIL_MATURITY
                    else ->
                        throw IncreaseInvalidDataException("Unknown StatementPaymentType: $value")
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

            fun validate(): StatementPaymentType = apply {
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

                return other is StatementPaymentType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Loan &&
                creditLimit == other.creditLimit &&
                gracePeriodDays == other.gracePeriodDays &&
                statementDayOfMonth == other.statementDayOfMonth &&
                statementPaymentType == other.statementPaymentType &&
                maturityDate == other.maturityDate &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                creditLimit,
                gracePeriodDays,
                statementDayOfMonth,
                statementPaymentType,
                maturityDate,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Loan{creditLimit=$creditLimit, gracePeriodDays=$gracePeriodDays, statementDayOfMonth=$statementDayOfMonth, statementPaymentType=$statementPaymentType, maturityDate=$maturityDate, additionalProperties=$additionalProperties}"
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
