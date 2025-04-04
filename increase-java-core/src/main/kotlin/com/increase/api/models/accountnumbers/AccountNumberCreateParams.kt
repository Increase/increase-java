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
     * Options related to how this Account Number should handle inbound ACH transfers.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun inboundAch(): Optional<InboundAch> = body.inboundAch()

    /**
     * Options related to how this Account Number should handle inbound check withdrawals.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun inboundChecks(): Optional<InboundChecks> = body.inboundChecks()

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
     * Returns the raw JSON value of [inboundAch].
     *
     * Unlike [inboundAch], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _inboundAch(): JsonField<InboundAch> = body._inboundAch()

    /**
     * Returns the raw JSON value of [inboundChecks].
     *
     * Unlike [inboundChecks], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _inboundChecks(): JsonField<InboundChecks> = body._inboundChecks()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

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
         * - [inboundAch]
         * - [inboundChecks]
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

        /** Options related to how this Account Number should handle inbound ACH transfers. */
        fun inboundAch(inboundAch: InboundAch) = apply { body.inboundAch(inboundAch) }

        /**
         * Sets [Builder.inboundAch] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inboundAch] with a well-typed [InboundAch] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun inboundAch(inboundAch: JsonField<InboundAch>) = apply { body.inboundAch(inboundAch) }

        /** Options related to how this Account Number should handle inbound check withdrawals. */
        fun inboundChecks(inboundChecks: InboundChecks) = apply {
            body.inboundChecks(inboundChecks)
        }

        /**
         * Sets [Builder.inboundChecks] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inboundChecks] with a well-typed [InboundChecks] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun inboundChecks(inboundChecks: JsonField<InboundChecks>) = apply {
            body.inboundChecks(inboundChecks)
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
    private constructor(
        private val accountId: JsonField<String>,
        private val name: JsonField<String>,
        private val inboundAch: JsonField<InboundAch>,
        private val inboundChecks: JsonField<InboundChecks>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("account_id")
            @ExcludeMissing
            accountId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("inbound_ach")
            @ExcludeMissing
            inboundAch: JsonField<InboundAch> = JsonMissing.of(),
            @JsonProperty("inbound_checks")
            @ExcludeMissing
            inboundChecks: JsonField<InboundChecks> = JsonMissing.of(),
        ) : this(accountId, name, inboundAch, inboundChecks, mutableMapOf())

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
         * Options related to how this Account Number should handle inbound ACH transfers.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun inboundAch(): Optional<InboundAch> = inboundAch.getOptional("inbound_ach")

        /**
         * Options related to how this Account Number should handle inbound check withdrawals.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun inboundChecks(): Optional<InboundChecks> = inboundChecks.getOptional("inbound_checks")

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
         * Returns the raw JSON value of [inboundAch].
         *
         * Unlike [inboundAch], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("inbound_ach")
        @ExcludeMissing
        fun _inboundAch(): JsonField<InboundAch> = inboundAch

        /**
         * Returns the raw JSON value of [inboundChecks].
         *
         * Unlike [inboundChecks], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("inbound_checks")
        @ExcludeMissing
        fun _inboundChecks(): JsonField<InboundChecks> = inboundChecks

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
            private var inboundAch: JsonField<InboundAch> = JsonMissing.of()
            private var inboundChecks: JsonField<InboundChecks> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                accountId = body.accountId
                name = body.name
                inboundAch = body.inboundAch
                inboundChecks = body.inboundChecks
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

            /** Options related to how this Account Number should handle inbound ACH transfers. */
            fun inboundAch(inboundAch: InboundAch) = inboundAch(JsonField.of(inboundAch))

            /**
             * Sets [Builder.inboundAch] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inboundAch] with a well-typed [InboundAch] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun inboundAch(inboundAch: JsonField<InboundAch>) = apply {
                this.inboundAch = inboundAch
            }

            /**
             * Options related to how this Account Number should handle inbound check withdrawals.
             */
            fun inboundChecks(inboundChecks: InboundChecks) =
                inboundChecks(JsonField.of(inboundChecks))

            /**
             * Sets [Builder.inboundChecks] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inboundChecks] with a well-typed [InboundChecks]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun inboundChecks(inboundChecks: JsonField<InboundChecks>) = apply {
                this.inboundChecks = inboundChecks
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
                    inboundAch,
                    inboundChecks,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            accountId()
            name()
            inboundAch().ifPresent { it.validate() }
            inboundChecks().ifPresent { it.validate() }
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
                (inboundAch.asKnown().getOrNull()?.validity() ?: 0) +
                (inboundChecks.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && accountId == other.accountId && name == other.name && inboundAch == other.inboundAch && inboundChecks == other.inboundChecks && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(accountId, name, inboundAch, inboundChecks, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{accountId=$accountId, name=$name, inboundAch=$inboundAch, inboundChecks=$inboundChecks, additionalProperties=$additionalProperties}"
    }

    /** Options related to how this Account Number should handle inbound ACH transfers. */
    class InboundAch
    private constructor(
        private val debitStatus: JsonField<DebitStatus>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("debit_status")
            @ExcludeMissing
            debitStatus: JsonField<DebitStatus> = JsonMissing.of()
        ) : this(debitStatus, mutableMapOf())

        /**
         * Whether ACH debits are allowed against this Account Number. Note that ACH debits will be
         * declined if this is `allowed` but the Account Number is not active. If you do not specify
         * this field, the default is `allowed`.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun debitStatus(): DebitStatus = debitStatus.getRequired("debit_status")

        /**
         * Returns the raw JSON value of [debitStatus].
         *
         * Unlike [debitStatus], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("debit_status")
        @ExcludeMissing
        fun _debitStatus(): JsonField<DebitStatus> = debitStatus

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
             * Returns a mutable builder for constructing an instance of [InboundAch].
             *
             * The following fields are required:
             * ```java
             * .debitStatus()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [InboundAch]. */
        class Builder internal constructor() {

            private var debitStatus: JsonField<DebitStatus>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(inboundAch: InboundAch) = apply {
                debitStatus = inboundAch.debitStatus
                additionalProperties = inboundAch.additionalProperties.toMutableMap()
            }

            /**
             * Whether ACH debits are allowed against this Account Number. Note that ACH debits will
             * be declined if this is `allowed` but the Account Number is not active. If you do not
             * specify this field, the default is `allowed`.
             */
            fun debitStatus(debitStatus: DebitStatus) = debitStatus(JsonField.of(debitStatus))

            /**
             * Sets [Builder.debitStatus] to an arbitrary JSON value.
             *
             * You should usually call [Builder.debitStatus] with a well-typed [DebitStatus] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun debitStatus(debitStatus: JsonField<DebitStatus>) = apply {
                this.debitStatus = debitStatus
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
             * Returns an immutable instance of [InboundAch].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .debitStatus()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): InboundAch =
                InboundAch(
                    checkRequired("debitStatus", debitStatus),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): InboundAch = apply {
            if (validated) {
                return@apply
            }

            debitStatus().validate()
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
        internal fun validity(): Int = (debitStatus.asKnown().getOrNull()?.validity() ?: 0)

        /**
         * Whether ACH debits are allowed against this Account Number. Note that ACH debits will be
         * declined if this is `allowed` but the Account Number is not active. If you do not specify
         * this field, the default is `allowed`.
         */
        class DebitStatus @JsonCreator private constructor(private val value: JsonField<String>) :
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

                /** ACH Debits are allowed. */
                @JvmField val ALLOWED = of("allowed")

                /** ACH Debits are blocked. */
                @JvmField val BLOCKED = of("blocked")

                @JvmStatic fun of(value: String) = DebitStatus(JsonField.of(value))
            }

            /** An enum containing [DebitStatus]'s known values. */
            enum class Known {
                /** ACH Debits are allowed. */
                ALLOWED,
                /** ACH Debits are blocked. */
                BLOCKED,
            }

            /**
             * An enum containing [DebitStatus]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [DebitStatus] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                /** ACH Debits are allowed. */
                ALLOWED,
                /** ACH Debits are blocked. */
                BLOCKED,
                /**
                 * An enum member indicating that [DebitStatus] was instantiated with an unknown
                 * value.
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
                    ALLOWED -> Value.ALLOWED
                    BLOCKED -> Value.BLOCKED
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
                    ALLOWED -> Known.ALLOWED
                    BLOCKED -> Known.BLOCKED
                    else -> throw IncreaseInvalidDataException("Unknown DebitStatus: $value")
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

            fun validate(): DebitStatus = apply {
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

                return /* spotless:off */ other is DebitStatus && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is InboundAch && debitStatus == other.debitStatus && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(debitStatus, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "InboundAch{debitStatus=$debitStatus, additionalProperties=$additionalProperties}"
    }

    /** Options related to how this Account Number should handle inbound check withdrawals. */
    class InboundChecks
    private constructor(
        private val status: JsonField<Status>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of()
        ) : this(status, mutableMapOf())

        /**
         * How Increase should process checks with this account number printed on them. If you do
         * not specify this field, the default is `check_transfers_only`.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun status(): Status = status.getRequired("status")

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

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
             * Returns a mutable builder for constructing an instance of [InboundChecks].
             *
             * The following fields are required:
             * ```java
             * .status()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [InboundChecks]. */
        class Builder internal constructor() {

            private var status: JsonField<Status>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(inboundChecks: InboundChecks) = apply {
                status = inboundChecks.status
                additionalProperties = inboundChecks.additionalProperties.toMutableMap()
            }

            /**
             * How Increase should process checks with this account number printed on them. If you
             * do not specify this field, the default is `check_transfers_only`.
             */
            fun status(status: Status) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [Status] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<Status>) = apply { this.status = status }

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
             * Returns an immutable instance of [InboundChecks].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .status()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): InboundChecks =
                InboundChecks(checkRequired("status", status), additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): InboundChecks = apply {
            if (validated) {
                return@apply
            }

            status().validate()
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
        @JvmSynthetic internal fun validity(): Int = (status.asKnown().getOrNull()?.validity() ?: 0)

        /**
         * How Increase should process checks with this account number printed on them. If you do
         * not specify this field, the default is `check_transfers_only`.
         */
        class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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
                 * Checks with this Account Number will be processed even if they are not associated
                 * with a Check Transfer.
                 */
                @JvmField val ALLOWED = of("allowed")

                /**
                 * Checks with this Account Number will be processed only if they can be matched to
                 * an existing Check Transfer.
                 */
                @JvmField val CHECK_TRANSFERS_ONLY = of("check_transfers_only")

                @JvmStatic fun of(value: String) = Status(JsonField.of(value))
            }

            /** An enum containing [Status]'s known values. */
            enum class Known {
                /**
                 * Checks with this Account Number will be processed even if they are not associated
                 * with a Check Transfer.
                 */
                ALLOWED,
                /**
                 * Checks with this Account Number will be processed only if they can be matched to
                 * an existing Check Transfer.
                 */
                CHECK_TRANSFERS_ONLY,
            }

            /**
             * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Status] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                /**
                 * Checks with this Account Number will be processed even if they are not associated
                 * with a Check Transfer.
                 */
                ALLOWED,
                /**
                 * Checks with this Account Number will be processed only if they can be matched to
                 * an existing Check Transfer.
                 */
                CHECK_TRANSFERS_ONLY,
                /**
                 * An enum member indicating that [Status] was instantiated with an unknown value.
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
                    ALLOWED -> Value.ALLOWED
                    CHECK_TRANSFERS_ONLY -> Value.CHECK_TRANSFERS_ONLY
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
                    ALLOWED -> Known.ALLOWED
                    CHECK_TRANSFERS_ONLY -> Known.CHECK_TRANSFERS_ONLY
                    else -> throw IncreaseInvalidDataException("Unknown Status: $value")
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

            fun validate(): Status = apply {
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

                return /* spotless:off */ other is Status && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is InboundChecks && status == other.status && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(status, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "InboundChecks{status=$status, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AccountNumberCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "AccountNumberCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
