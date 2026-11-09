// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.accountnumbers

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
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Create an Account Number */
class AccountNumberCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The Account the Account Number should belong to.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountId(): String = body.accountId()

    /**
     * The name you choose for the Account Number.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = body.name()

    /**
     * Whether inbound ACH debits are allowed against this Account Number. Note that ACH debits will
     * be declined if this is `allowed` but the Account Number is not active. If you do not specify
     * this field, the default is `allowed`.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun inboundAchDebits(): Optional<InboundAchDebits> = body.inboundAchDebits()

    /**
     * Whether unregistered inbound checks for this Account Number can be deposited. If you do not
     * specify this field, the default is `blocked`.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun unregisteredInboundChecks(): Optional<UnregisteredInboundChecks> =
        body.unregisteredInboundChecks()

    /**
     * Returns the raw JSON value of [accountId].
     *
     * Unlike [accountId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _accountId(): JsonField<String> = body._accountId()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [inboundAchDebits].
     *
     * Unlike [inboundAchDebits], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _inboundAchDebits(): JsonField<InboundAchDebits> = body._inboundAchDebits()

    /**
     * Returns the raw JSON value of [unregisteredInboundChecks].
     *
     * Unlike [unregisteredInboundChecks], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _unregisteredInboundChecks(): JsonField<UnregisteredInboundChecks> =
        body._unregisteredInboundChecks()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AccountNumberCreateParams].
         *
         * The following fields are required:
         * ```java
         * .accountId()
         * .name()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AccountNumberCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(accountNumberCreateParams: AccountNumberCreateParams) = apply {
            body = accountNumberCreateParams.body.toBuilder()
            additionalHeaders = accountNumberCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = accountNumberCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [accountId]
         * - [name]
         * - [inboundAchDebits]
         * - [unregisteredInboundChecks]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The Account the Account Number should belong to. */
        fun accountId(accountId: String) = apply { body.accountId(accountId) }

        /**
         * Sets [Builder.accountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun accountId(accountId: JsonField<String>) = apply { body.accountId(accountId) }

        /** The name you choose for the Account Number. */
        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /**
         * Whether inbound ACH debits are allowed against this Account Number. Note that ACH debits
         * will be declined if this is `allowed` but the Account Number is not active. If you do not
         * specify this field, the default is `allowed`.
         */
        fun inboundAchDebits(inboundAchDebits: InboundAchDebits) = apply {
            body.inboundAchDebits(inboundAchDebits)
        }

        /**
         * Sets [Builder.inboundAchDebits] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inboundAchDebits] with a well-typed [InboundAchDebits]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun inboundAchDebits(inboundAchDebits: JsonField<InboundAchDebits>) = apply {
            body.inboundAchDebits(inboundAchDebits)
        }

        /**
         * Whether unregistered inbound checks for this Account Number can be deposited. If you do
         * not specify this field, the default is `blocked`.
         */
        fun unregisteredInboundChecks(unregisteredInboundChecks: UnregisteredInboundChecks) =
            apply {
                body.unregisteredInboundChecks(unregisteredInboundChecks)
            }

        /**
         * Sets [Builder.unregisteredInboundChecks] to an arbitrary JSON value.
         *
         * You should usually call [Builder.unregisteredInboundChecks] with a well-typed
         * [UnregisteredInboundChecks] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun unregisteredInboundChecks(
            unregisteredInboundChecks: JsonField<UnregisteredInboundChecks>
        ) = apply { body.unregisteredInboundChecks(unregisteredInboundChecks) }

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
         * Returns an immutable instance of [AccountNumberCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .accountId()
         * .name()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AccountNumberCreateParams =
            AccountNumberCreateParams(
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
        private val accountId: JsonField<String>,
        private val name: JsonField<String>,
        private val inboundAchDebits: JsonField<InboundAchDebits>,
        private val unregisteredInboundChecks: JsonField<UnregisteredInboundChecks>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("account_id")
            @ExcludeMissing
            accountId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("inbound_ach_debits")
            @ExcludeMissing
            inboundAchDebits: JsonField<InboundAchDebits> = JsonMissing.of(),
            @JsonProperty("unregistered_inbound_checks")
            @ExcludeMissing
            unregisteredInboundChecks: JsonField<UnregisteredInboundChecks> = JsonMissing.of(),
        ) : this(accountId, name, inboundAchDebits, unregisteredInboundChecks, mutableMapOf())

        /**
         * The Account the Account Number should belong to.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun accountId(): String = accountId.getRequired("account_id")

        /**
         * The name you choose for the Account Number.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * Whether inbound ACH debits are allowed against this Account Number. Note that ACH debits
         * will be declined if this is `allowed` but the Account Number is not active. If you do not
         * specify this field, the default is `allowed`.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun inboundAchDebits(): Optional<InboundAchDebits> =
            inboundAchDebits.getOptional("inbound_ach_debits")

        /**
         * Whether unregistered inbound checks for this Account Number can be deposited. If you do
         * not specify this field, the default is `blocked`.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun unregisteredInboundChecks(): Optional<UnregisteredInboundChecks> =
            unregisteredInboundChecks.getOptional("unregistered_inbound_checks")

        /**
         * Returns the raw JSON value of [accountId].
         *
         * Unlike [accountId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("account_id") @ExcludeMissing fun _accountId(): JsonField<String> = accountId

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [inboundAchDebits].
         *
         * Unlike [inboundAchDebits], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("inbound_ach_debits")
        @ExcludeMissing
        fun _inboundAchDebits(): JsonField<InboundAchDebits> = inboundAchDebits

        /**
         * Returns the raw JSON value of [unregisteredInboundChecks].
         *
         * Unlike [unregisteredInboundChecks], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("unregistered_inbound_checks")
        @ExcludeMissing
        fun _unregisteredInboundChecks(): JsonField<UnregisteredInboundChecks> =
            unregisteredInboundChecks

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
             * .accountId()
             * .name()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var accountId: JsonField<String>? = null
            private var name: JsonField<String>? = null
            private var inboundAchDebits: JsonField<InboundAchDebits> = JsonMissing.of()
            private var unregisteredInboundChecks: JsonField<UnregisteredInboundChecks> =
                JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                accountId = body.accountId
                name = body.name
                inboundAchDebits = body.inboundAchDebits
                unregisteredInboundChecks = body.unregisteredInboundChecks
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The Account the Account Number should belong to. */
            fun accountId(accountId: String) = accountId(JsonField.of(accountId))

            /**
             * Sets [Builder.accountId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

            /** The name you choose for the Account Number. */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /**
             * Whether inbound ACH debits are allowed against this Account Number. Note that ACH
             * debits will be declined if this is `allowed` but the Account Number is not active. If
             * you do not specify this field, the default is `allowed`.
             */
            fun inboundAchDebits(inboundAchDebits: InboundAchDebits) =
                inboundAchDebits(JsonField.of(inboundAchDebits))

            /**
             * Sets [Builder.inboundAchDebits] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inboundAchDebits] with a well-typed
             * [InboundAchDebits] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun inboundAchDebits(inboundAchDebits: JsonField<InboundAchDebits>) = apply {
                this.inboundAchDebits = inboundAchDebits
            }

            /**
             * Whether unregistered inbound checks for this Account Number can be deposited. If you
             * do not specify this field, the default is `blocked`.
             */
            fun unregisteredInboundChecks(unregisteredInboundChecks: UnregisteredInboundChecks) =
                unregisteredInboundChecks(JsonField.of(unregisteredInboundChecks))

            /**
             * Sets [Builder.unregisteredInboundChecks] to an arbitrary JSON value.
             *
             * You should usually call [Builder.unregisteredInboundChecks] with a well-typed
             * [UnregisteredInboundChecks] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun unregisteredInboundChecks(
                unregisteredInboundChecks: JsonField<UnregisteredInboundChecks>
            ) = apply { this.unregisteredInboundChecks = unregisteredInboundChecks }

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
             * .accountId()
             * .name()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("accountId", accountId),
                    checkRequired("name", name),
                    inboundAchDebits,
                    unregisteredInboundChecks,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws IncreaseInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            accountId()
            name()
            inboundAchDebits().ifPresent { it.validate() }
            unregisteredInboundChecks().ifPresent { it.validate() }
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
            (if (accountId.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (inboundAchDebits.asKnown().getOrNull()?.validity() ?: 0) +
                (unregisteredInboundChecks.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                accountId == other.accountId &&
                name == other.name &&
                inboundAchDebits == other.inboundAchDebits &&
                unregisteredInboundChecks == other.unregisteredInboundChecks &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                accountId,
                name,
                inboundAchDebits,
                unregisteredInboundChecks,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{accountId=$accountId, name=$name, inboundAchDebits=$inboundAchDebits, unregisteredInboundChecks=$unregisteredInboundChecks, additionalProperties=$additionalProperties}"
    }

    /**
     * Whether inbound ACH debits are allowed against this Account Number. Note that ACH debits will
     * be declined if this is `allowed` but the Account Number is not active. If you do not specify
     * this field, the default is `allowed`.
     */
    class InboundAchDebits @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            /** ACH Debits are allowed. */
            @JvmField val ALLOWED = of("allowed")

            /**
             * ACH Debits are blocked. Received debits will be declined and returned with code `R20`
             * (non-transaction account).
             */
            @JvmField val BLOCKED = of("blocked")

            @JvmStatic fun of(value: String) = InboundAchDebits(JsonField.of(value))
        }

        /** An enum containing [InboundAchDebits]'s known values. */
        enum class Known {
            /** ACH Debits are allowed. */
            ALLOWED,
            /**
             * ACH Debits are blocked. Received debits will be declined and returned with code `R20`
             * (non-transaction account).
             */
            BLOCKED,
        }

        /**
         * An enum containing [InboundAchDebits]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [InboundAchDebits] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            /** ACH Debits are allowed. */
            ALLOWED,
            /**
             * ACH Debits are blocked. Received debits will be declined and returned with code `R20`
             * (non-transaction account).
             */
            BLOCKED,
            /**
             * An enum member indicating that [InboundAchDebits] was instantiated with an unknown
             * value.
             */
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
                ALLOWED -> Value.ALLOWED
                BLOCKED -> Value.BLOCKED
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
                ALLOWED -> Known.ALLOWED
                BLOCKED -> Known.BLOCKED
                else -> throw IncreaseInvalidDataException("Unknown InboundAchDebits: $value")
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws IncreaseInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): InboundAchDebits = apply {
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

            return other is InboundAchDebits && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Whether unregistered inbound checks for this Account Number can be deposited. If you do not
     * specify this field, the default is `blocked`.
     */
    class UnregisteredInboundChecks
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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
             * Accept all Inbound Check Deposits, even if they are not associated with a Check
             * Transfer or Checkbook Check.
             */
            @JvmField val ALLOWED = of("allowed")

            /**
             * Only accept Inbound Check Deposits if they can be matched to a Check Transfer or
             * Checkbook Check.
             */
            @JvmField val BLOCKED = of("blocked")

            @JvmStatic fun of(value: String) = UnregisteredInboundChecks(JsonField.of(value))
        }

        /** An enum containing [UnregisteredInboundChecks]'s known values. */
        enum class Known {
            /**
             * Accept all Inbound Check Deposits, even if they are not associated with a Check
             * Transfer or Checkbook Check.
             */
            ALLOWED,
            /**
             * Only accept Inbound Check Deposits if they can be matched to a Check Transfer or
             * Checkbook Check.
             */
            BLOCKED,
        }

        /**
         * An enum containing [UnregisteredInboundChecks]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [UnregisteredInboundChecks] can contain an unknown value in a couple of
         * cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            /**
             * Accept all Inbound Check Deposits, even if they are not associated with a Check
             * Transfer or Checkbook Check.
             */
            ALLOWED,
            /**
             * Only accept Inbound Check Deposits if they can be matched to a Check Transfer or
             * Checkbook Check.
             */
            BLOCKED,
            /**
             * An enum member indicating that [UnregisteredInboundChecks] was instantiated with an
             * unknown value.
             */
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
                ALLOWED -> Value.ALLOWED
                BLOCKED -> Value.BLOCKED
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
                ALLOWED -> Known.ALLOWED
                BLOCKED -> Known.BLOCKED
                else ->
                    throw IncreaseInvalidDataException("Unknown UnregisteredInboundChecks: $value")
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws IncreaseInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): UnregisteredInboundChecks = apply {
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

            return other is UnregisteredInboundChecks && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AccountNumberCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "AccountNumberCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
