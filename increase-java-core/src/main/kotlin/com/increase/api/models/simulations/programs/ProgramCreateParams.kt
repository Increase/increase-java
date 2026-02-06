// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.simulations.programs

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

/**
 * Simulates a [Program](#programs) being created in your group. By default, your group has one
 * program called Commercial Banking. Note that when your group operates more than one program,
 * `program_id` is a required field when creating accounts.
 */
class ProgramCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The name of the program being added.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = body.name()

    /**
     * The bank for the program's accounts, defaults to First Internet Bank.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun bank(): Optional<Bank> = body.bank()

    /**
     * The maximum extendable credit of the program being added.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lendingMaximumExtendableCredit(): Optional<Long> = body.lendingMaximumExtendableCredit()

    /**
     * The identifier of the Account the Program should be added to is for.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun reserveAccountId(): Optional<String> = body.reserveAccountId()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [bank].
     *
     * Unlike [bank], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _bank(): JsonField<Bank> = body._bank()

    /**
     * Returns the raw JSON value of [lendingMaximumExtendableCredit].
     *
     * Unlike [lendingMaximumExtendableCredit], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _lendingMaximumExtendableCredit(): JsonField<Long> = body._lendingMaximumExtendableCredit()

    /**
     * Returns the raw JSON value of [reserveAccountId].
     *
     * Unlike [reserveAccountId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _reserveAccountId(): JsonField<String> = body._reserveAccountId()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ProgramCreateParams].
         *
         * The following fields are required:
         * ```java
         * .name()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ProgramCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(programCreateParams: ProgramCreateParams) = apply {
            body = programCreateParams.body.toBuilder()
            additionalHeaders = programCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = programCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [name]
         * - [bank]
         * - [lendingMaximumExtendableCredit]
         * - [reserveAccountId]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The name of the program being added. */
        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /** The bank for the program's accounts, defaults to First Internet Bank. */
        fun bank(bank: Bank) = apply { body.bank(bank) }

        /**
         * Sets [Builder.bank] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bank] with a well-typed [Bank] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun bank(bank: JsonField<Bank>) = apply { body.bank(bank) }

        /** The maximum extendable credit of the program being added. */
        fun lendingMaximumExtendableCredit(lendingMaximumExtendableCredit: Long) = apply {
            body.lendingMaximumExtendableCredit(lendingMaximumExtendableCredit)
        }

        /**
         * Sets [Builder.lendingMaximumExtendableCredit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lendingMaximumExtendableCredit] with a well-typed [Long]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun lendingMaximumExtendableCredit(lendingMaximumExtendableCredit: JsonField<Long>) =
            apply {
                body.lendingMaximumExtendableCredit(lendingMaximumExtendableCredit)
            }

        /** The identifier of the Account the Program should be added to is for. */
        fun reserveAccountId(reserveAccountId: String) = apply {
            body.reserveAccountId(reserveAccountId)
        }

        /**
         * Sets [Builder.reserveAccountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reserveAccountId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun reserveAccountId(reserveAccountId: JsonField<String>) = apply {
            body.reserveAccountId(reserveAccountId)
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
         * Returns an immutable instance of [ProgramCreateParams].
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
        fun build(): ProgramCreateParams =
            ProgramCreateParams(
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
        private val bank: JsonField<Bank>,
        private val lendingMaximumExtendableCredit: JsonField<Long>,
        private val reserveAccountId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("bank") @ExcludeMissing bank: JsonField<Bank> = JsonMissing.of(),
            @JsonProperty("lending_maximum_extendable_credit")
            @ExcludeMissing
            lendingMaximumExtendableCredit: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("reserve_account_id")
            @ExcludeMissing
            reserveAccountId: JsonField<String> = JsonMissing.of(),
        ) : this(name, bank, lendingMaximumExtendableCredit, reserveAccountId, mutableMapOf())

        /**
         * The name of the program being added.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * The bank for the program's accounts, defaults to First Internet Bank.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun bank(): Optional<Bank> = bank.getOptional("bank")

        /**
         * The maximum extendable credit of the program being added.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun lendingMaximumExtendableCredit(): Optional<Long> =
            lendingMaximumExtendableCredit.getOptional("lending_maximum_extendable_credit")

        /**
         * The identifier of the Account the Program should be added to is for.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun reserveAccountId(): Optional<String> =
            reserveAccountId.getOptional("reserve_account_id")

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [bank].
         *
         * Unlike [bank], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("bank") @ExcludeMissing fun _bank(): JsonField<Bank> = bank

        /**
         * Returns the raw JSON value of [lendingMaximumExtendableCredit].
         *
         * Unlike [lendingMaximumExtendableCredit], this method doesn't throw if the JSON field has
         * an unexpected type.
         */
        @JsonProperty("lending_maximum_extendable_credit")
        @ExcludeMissing
        fun _lendingMaximumExtendableCredit(): JsonField<Long> = lendingMaximumExtendableCredit

        /**
         * Returns the raw JSON value of [reserveAccountId].
         *
         * Unlike [reserveAccountId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("reserve_account_id")
        @ExcludeMissing
        fun _reserveAccountId(): JsonField<String> = reserveAccountId

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
            private var bank: JsonField<Bank> = JsonMissing.of()
            private var lendingMaximumExtendableCredit: JsonField<Long> = JsonMissing.of()
            private var reserveAccountId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                name = body.name
                bank = body.bank
                lendingMaximumExtendableCredit = body.lendingMaximumExtendableCredit
                reserveAccountId = body.reserveAccountId
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The name of the program being added. */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** The bank for the program's accounts, defaults to First Internet Bank. */
            fun bank(bank: Bank) = bank(JsonField.of(bank))

            /**
             * Sets [Builder.bank] to an arbitrary JSON value.
             *
             * You should usually call [Builder.bank] with a well-typed [Bank] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun bank(bank: JsonField<Bank>) = apply { this.bank = bank }

            /** The maximum extendable credit of the program being added. */
            fun lendingMaximumExtendableCredit(lendingMaximumExtendableCredit: Long) =
                lendingMaximumExtendableCredit(JsonField.of(lendingMaximumExtendableCredit))

            /**
             * Sets [Builder.lendingMaximumExtendableCredit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lendingMaximumExtendableCredit] with a well-typed
             * [Long] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun lendingMaximumExtendableCredit(lendingMaximumExtendableCredit: JsonField<Long>) =
                apply {
                    this.lendingMaximumExtendableCredit = lendingMaximumExtendableCredit
                }

            /** The identifier of the Account the Program should be added to is for. */
            fun reserveAccountId(reserveAccountId: String) =
                reserveAccountId(JsonField.of(reserveAccountId))

            /**
             * Sets [Builder.reserveAccountId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reserveAccountId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun reserveAccountId(reserveAccountId: JsonField<String>) = apply {
                this.reserveAccountId = reserveAccountId
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
             * .name()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("name", name),
                    bank,
                    lendingMaximumExtendableCredit,
                    reserveAccountId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            name()
            bank().ifPresent { it.validate() }
            lendingMaximumExtendableCredit()
            reserveAccountId()
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
                (bank.asKnown().getOrNull()?.validity() ?: 0) +
                (if (lendingMaximumExtendableCredit.asKnown().isPresent) 1 else 0) +
                (if (reserveAccountId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                name == other.name &&
                bank == other.bank &&
                lendingMaximumExtendableCredit == other.lendingMaximumExtendableCredit &&
                reserveAccountId == other.reserveAccountId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                name,
                bank,
                lendingMaximumExtendableCredit,
                reserveAccountId,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{name=$name, bank=$bank, lendingMaximumExtendableCredit=$lendingMaximumExtendableCredit, reserveAccountId=$reserveAccountId, additionalProperties=$additionalProperties}"
    }

    /** The bank for the program's accounts, defaults to First Internet Bank. */
    class Bank @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            /** Core Bank */
            @JvmField val CORE_BANK = of("core_bank")

            /** First Internet Bank of Indiana */
            @JvmField val FIRST_INTERNET_BANK = of("first_internet_bank")

            /** Grasshopper Bank */
            @JvmField val GRASSHOPPER_BANK = of("grasshopper_bank")

            /** Twin City Bank */
            @JvmField val TWIN_CITY_BANK = of("twin_city_bank")

            @JvmStatic fun of(value: String) = Bank(JsonField.of(value))
        }

        /** An enum containing [Bank]'s known values. */
        enum class Known {
            /** Core Bank */
            CORE_BANK,
            /** First Internet Bank of Indiana */
            FIRST_INTERNET_BANK,
            /** Grasshopper Bank */
            GRASSHOPPER_BANK,
            /** Twin City Bank */
            TWIN_CITY_BANK,
        }

        /**
         * An enum containing [Bank]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Bank] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            /** Core Bank */
            CORE_BANK,
            /** First Internet Bank of Indiana */
            FIRST_INTERNET_BANK,
            /** Grasshopper Bank */
            GRASSHOPPER_BANK,
            /** Twin City Bank */
            TWIN_CITY_BANK,
            /** An enum member indicating that [Bank] was instantiated with an unknown value. */
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
                CORE_BANK -> Value.CORE_BANK
                FIRST_INTERNET_BANK -> Value.FIRST_INTERNET_BANK
                GRASSHOPPER_BANK -> Value.GRASSHOPPER_BANK
                TWIN_CITY_BANK -> Value.TWIN_CITY_BANK
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
                CORE_BANK -> Known.CORE_BANK
                FIRST_INTERNET_BANK -> Known.FIRST_INTERNET_BANK
                GRASSHOPPER_BANK -> Known.GRASSHOPPER_BANK
                TWIN_CITY_BANK -> Known.TWIN_CITY_BANK
                else -> throw IncreaseInvalidDataException("Unknown Bank: $value")
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

        fun validate(): Bank = apply {
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

            return other is Bank && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ProgramCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ProgramCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
