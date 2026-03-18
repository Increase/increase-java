// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.simulations.cardtokens

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
import java.time.LocalDate
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Simulates tokenizing a card in the sandbox environment. */
class CardTokenCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The capabilities of the outbound card token.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun capabilities(): Optional<List<Capability>> = body.capabilities()

    /**
     * The expiration date of the card.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun expiration(): Optional<LocalDate> = body.expiration()

    /**
     * The last 4 digits of the card number.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun last4(): Optional<String> = body.last4()

    /**
     * The outcome to simulate for card push transfers using this token.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun outcome(): Optional<Outcome> = body.outcome()

    /**
     * The prefix of the card number, usually the first 8 digits.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun prefix(): Optional<String> = body.prefix()

    /**
     * The total length of the card number, including prefix and last4.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun primaryAccountNumberLength(): Optional<Long> = body.primaryAccountNumberLength()

    /**
     * Returns the raw JSON value of [capabilities].
     *
     * Unlike [capabilities], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _capabilities(): JsonField<List<Capability>> = body._capabilities()

    /**
     * Returns the raw JSON value of [expiration].
     *
     * Unlike [expiration], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _expiration(): JsonField<LocalDate> = body._expiration()

    /**
     * Returns the raw JSON value of [last4].
     *
     * Unlike [last4], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _last4(): JsonField<String> = body._last4()

    /**
     * Returns the raw JSON value of [outcome].
     *
     * Unlike [outcome], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _outcome(): JsonField<Outcome> = body._outcome()

    /**
     * Returns the raw JSON value of [prefix].
     *
     * Unlike [prefix], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _prefix(): JsonField<String> = body._prefix()

    /**
     * Returns the raw JSON value of [primaryAccountNumberLength].
     *
     * Unlike [primaryAccountNumberLength], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _primaryAccountNumberLength(): JsonField<Long> = body._primaryAccountNumberLength()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): CardTokenCreateParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [CardTokenCreateParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CardTokenCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(cardTokenCreateParams: CardTokenCreateParams) = apply {
            body = cardTokenCreateParams.body.toBuilder()
            additionalHeaders = cardTokenCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = cardTokenCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [capabilities]
         * - [expiration]
         * - [last4]
         * - [outcome]
         * - [prefix]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The capabilities of the outbound card token. */
        fun capabilities(capabilities: List<Capability>) = apply { body.capabilities(capabilities) }

        /**
         * Sets [Builder.capabilities] to an arbitrary JSON value.
         *
         * You should usually call [Builder.capabilities] with a well-typed `List<Capability>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun capabilities(capabilities: JsonField<List<Capability>>) = apply {
            body.capabilities(capabilities)
        }

        /**
         * Adds a single [Capability] to [capabilities].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCapability(capability: Capability) = apply { body.addCapability(capability) }

        /** The expiration date of the card. */
        fun expiration(expiration: LocalDate) = apply { body.expiration(expiration) }

        /**
         * Sets [Builder.expiration] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expiration] with a well-typed [LocalDate] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun expiration(expiration: JsonField<LocalDate>) = apply { body.expiration(expiration) }

        /** The last 4 digits of the card number. */
        fun last4(last4: String) = apply { body.last4(last4) }

        /**
         * Sets [Builder.last4] to an arbitrary JSON value.
         *
         * You should usually call [Builder.last4] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun last4(last4: JsonField<String>) = apply { body.last4(last4) }

        /** The outcome to simulate for card push transfers using this token. */
        fun outcome(outcome: Outcome) = apply { body.outcome(outcome) }

        /**
         * Sets [Builder.outcome] to an arbitrary JSON value.
         *
         * You should usually call [Builder.outcome] with a well-typed [Outcome] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun outcome(outcome: JsonField<Outcome>) = apply { body.outcome(outcome) }

        /** The prefix of the card number, usually the first 8 digits. */
        fun prefix(prefix: String) = apply { body.prefix(prefix) }

        /**
         * Sets [Builder.prefix] to an arbitrary JSON value.
         *
         * You should usually call [Builder.prefix] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun prefix(prefix: JsonField<String>) = apply { body.prefix(prefix) }

        /** The total length of the card number, including prefix and last4. */
        fun primaryAccountNumberLength(primaryAccountNumberLength: Long) = apply {
            body.primaryAccountNumberLength(primaryAccountNumberLength)
        }

        /**
         * Sets [Builder.primaryAccountNumberLength] to an arbitrary JSON value.
         *
         * You should usually call [Builder.primaryAccountNumberLength] with a well-typed [Long]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun primaryAccountNumberLength(primaryAccountNumberLength: JsonField<Long>) = apply {
            body.primaryAccountNumberLength(primaryAccountNumberLength)
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
         * Returns an immutable instance of [CardTokenCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CardTokenCreateParams =
            CardTokenCreateParams(
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
        private val capabilities: JsonField<List<Capability>>,
        private val expiration: JsonField<LocalDate>,
        private val last4: JsonField<String>,
        private val outcome: JsonField<Outcome>,
        private val prefix: JsonField<String>,
        private val primaryAccountNumberLength: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("capabilities")
            @ExcludeMissing
            capabilities: JsonField<List<Capability>> = JsonMissing.of(),
            @JsonProperty("expiration")
            @ExcludeMissing
            expiration: JsonField<LocalDate> = JsonMissing.of(),
            @JsonProperty("last4") @ExcludeMissing last4: JsonField<String> = JsonMissing.of(),
            @JsonProperty("outcome") @ExcludeMissing outcome: JsonField<Outcome> = JsonMissing.of(),
            @JsonProperty("prefix") @ExcludeMissing prefix: JsonField<String> = JsonMissing.of(),
            @JsonProperty("primary_account_number_length")
            @ExcludeMissing
            primaryAccountNumberLength: JsonField<Long> = JsonMissing.of(),
        ) : this(
            capabilities,
            expiration,
            last4,
            outcome,
            prefix,
            primaryAccountNumberLength,
            mutableMapOf(),
        )

        /**
         * The capabilities of the outbound card token.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun capabilities(): Optional<List<Capability>> = capabilities.getOptional("capabilities")

        /**
         * The expiration date of the card.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun expiration(): Optional<LocalDate> = expiration.getOptional("expiration")

        /**
         * The last 4 digits of the card number.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun last4(): Optional<String> = last4.getOptional("last4")

        /**
         * The outcome to simulate for card push transfers using this token.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun outcome(): Optional<Outcome> = outcome.getOptional("outcome")

        /**
         * The prefix of the card number, usually the first 8 digits.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun prefix(): Optional<String> = prefix.getOptional("prefix")

        /**
         * The total length of the card number, including prefix and last4.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun primaryAccountNumberLength(): Optional<Long> =
            primaryAccountNumberLength.getOptional("primary_account_number_length")

        /**
         * Returns the raw JSON value of [capabilities].
         *
         * Unlike [capabilities], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("capabilities")
        @ExcludeMissing
        fun _capabilities(): JsonField<List<Capability>> = capabilities

        /**
         * Returns the raw JSON value of [expiration].
         *
         * Unlike [expiration], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("expiration")
        @ExcludeMissing
        fun _expiration(): JsonField<LocalDate> = expiration

        /**
         * Returns the raw JSON value of [last4].
         *
         * Unlike [last4], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("last4") @ExcludeMissing fun _last4(): JsonField<String> = last4

        /**
         * Returns the raw JSON value of [outcome].
         *
         * Unlike [outcome], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("outcome") @ExcludeMissing fun _outcome(): JsonField<Outcome> = outcome

        /**
         * Returns the raw JSON value of [prefix].
         *
         * Unlike [prefix], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("prefix") @ExcludeMissing fun _prefix(): JsonField<String> = prefix

        /**
         * Returns the raw JSON value of [primaryAccountNumberLength].
         *
         * Unlike [primaryAccountNumberLength], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("primary_account_number_length")
        @ExcludeMissing
        fun _primaryAccountNumberLength(): JsonField<Long> = primaryAccountNumberLength

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

            private var capabilities: JsonField<MutableList<Capability>>? = null
            private var expiration: JsonField<LocalDate> = JsonMissing.of()
            private var last4: JsonField<String> = JsonMissing.of()
            private var outcome: JsonField<Outcome> = JsonMissing.of()
            private var prefix: JsonField<String> = JsonMissing.of()
            private var primaryAccountNumberLength: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                capabilities = body.capabilities.map { it.toMutableList() }
                expiration = body.expiration
                last4 = body.last4
                outcome = body.outcome
                prefix = body.prefix
                primaryAccountNumberLength = body.primaryAccountNumberLength
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The capabilities of the outbound card token. */
            fun capabilities(capabilities: List<Capability>) =
                capabilities(JsonField.of(capabilities))

            /**
             * Sets [Builder.capabilities] to an arbitrary JSON value.
             *
             * You should usually call [Builder.capabilities] with a well-typed `List<Capability>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun capabilities(capabilities: JsonField<List<Capability>>) = apply {
                this.capabilities = capabilities.map { it.toMutableList() }
            }

            /**
             * Adds a single [Capability] to [capabilities].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addCapability(capability: Capability) = apply {
                capabilities =
                    (capabilities ?: JsonField.of(mutableListOf())).also {
                        checkKnown("capabilities", it).add(capability)
                    }
            }

            /** The expiration date of the card. */
            fun expiration(expiration: LocalDate) = expiration(JsonField.of(expiration))

            /**
             * Sets [Builder.expiration] to an arbitrary JSON value.
             *
             * You should usually call [Builder.expiration] with a well-typed [LocalDate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun expiration(expiration: JsonField<LocalDate>) = apply {
                this.expiration = expiration
            }

            /** The last 4 digits of the card number. */
            fun last4(last4: String) = last4(JsonField.of(last4))

            /**
             * Sets [Builder.last4] to an arbitrary JSON value.
             *
             * You should usually call [Builder.last4] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun last4(last4: JsonField<String>) = apply { this.last4 = last4 }

            /** The outcome to simulate for card push transfers using this token. */
            fun outcome(outcome: Outcome) = outcome(JsonField.of(outcome))

            /**
             * Sets [Builder.outcome] to an arbitrary JSON value.
             *
             * You should usually call [Builder.outcome] with a well-typed [Outcome] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun outcome(outcome: JsonField<Outcome>) = apply { this.outcome = outcome }

            /** The prefix of the card number, usually the first 8 digits. */
            fun prefix(prefix: String) = prefix(JsonField.of(prefix))

            /**
             * Sets [Builder.prefix] to an arbitrary JSON value.
             *
             * You should usually call [Builder.prefix] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun prefix(prefix: JsonField<String>) = apply { this.prefix = prefix }

            /** The total length of the card number, including prefix and last4. */
            fun primaryAccountNumberLength(primaryAccountNumberLength: Long) =
                primaryAccountNumberLength(JsonField.of(primaryAccountNumberLength))

            /**
             * Sets [Builder.primaryAccountNumberLength] to an arbitrary JSON value.
             *
             * You should usually call [Builder.primaryAccountNumberLength] with a well-typed [Long]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun primaryAccountNumberLength(primaryAccountNumberLength: JsonField<Long>) = apply {
                this.primaryAccountNumberLength = primaryAccountNumberLength
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
             */
            fun build(): Body =
                Body(
                    (capabilities ?: JsonMissing.of()).map { it.toImmutable() },
                    expiration,
                    last4,
                    outcome,
                    prefix,
                    primaryAccountNumberLength,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            capabilities().ifPresent { it.forEach { it.validate() } }
            expiration()
            last4()
            outcome().ifPresent { it.validate() }
            prefix()
            primaryAccountNumberLength()
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
            (capabilities.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (expiration.asKnown().isPresent) 1 else 0) +
                (if (last4.asKnown().isPresent) 1 else 0) +
                (outcome.asKnown().getOrNull()?.validity() ?: 0) +
                (if (prefix.asKnown().isPresent) 1 else 0) +
                (if (primaryAccountNumberLength.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                capabilities == other.capabilities &&
                expiration == other.expiration &&
                last4 == other.last4 &&
                outcome == other.outcome &&
                prefix == other.prefix &&
                primaryAccountNumberLength == other.primaryAccountNumberLength &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                capabilities,
                expiration,
                last4,
                outcome,
                prefix,
                primaryAccountNumberLength,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{capabilities=$capabilities, expiration=$expiration, last4=$last4, outcome=$outcome, prefix=$prefix, primaryAccountNumberLength=$primaryAccountNumberLength, additionalProperties=$additionalProperties}"
    }

    class Capability
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val crossBorderPushTransfers: JsonField<CrossBorderPushTransfers>,
        private val domesticPushTransfers: JsonField<DomesticPushTransfers>,
        private val route: JsonField<Route>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("cross_border_push_transfers")
            @ExcludeMissing
            crossBorderPushTransfers: JsonField<CrossBorderPushTransfers> = JsonMissing.of(),
            @JsonProperty("domestic_push_transfers")
            @ExcludeMissing
            domesticPushTransfers: JsonField<DomesticPushTransfers> = JsonMissing.of(),
            @JsonProperty("route") @ExcludeMissing route: JsonField<Route> = JsonMissing.of(),
        ) : this(crossBorderPushTransfers, domesticPushTransfers, route, mutableMapOf())

        /**
         * The cross-border push transfers capability.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun crossBorderPushTransfers(): CrossBorderPushTransfers =
            crossBorderPushTransfers.getRequired("cross_border_push_transfers")

        /**
         * The domestic push transfers capability.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun domesticPushTransfers(): DomesticPushTransfers =
            domesticPushTransfers.getRequired("domestic_push_transfers")

        /**
         * The route of the capability.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun route(): Route = route.getRequired("route")

        /**
         * Returns the raw JSON value of [crossBorderPushTransfers].
         *
         * Unlike [crossBorderPushTransfers], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("cross_border_push_transfers")
        @ExcludeMissing
        fun _crossBorderPushTransfers(): JsonField<CrossBorderPushTransfers> =
            crossBorderPushTransfers

        /**
         * Returns the raw JSON value of [domesticPushTransfers].
         *
         * Unlike [domesticPushTransfers], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("domestic_push_transfers")
        @ExcludeMissing
        fun _domesticPushTransfers(): JsonField<DomesticPushTransfers> = domesticPushTransfers

        /**
         * Returns the raw JSON value of [route].
         *
         * Unlike [route], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("route") @ExcludeMissing fun _route(): JsonField<Route> = route

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
             * Returns a mutable builder for constructing an instance of [Capability].
             *
             * The following fields are required:
             * ```java
             * .crossBorderPushTransfers()
             * .domesticPushTransfers()
             * .route()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Capability]. */
        class Builder internal constructor() {

            private var crossBorderPushTransfers: JsonField<CrossBorderPushTransfers>? = null
            private var domesticPushTransfers: JsonField<DomesticPushTransfers>? = null
            private var route: JsonField<Route>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(capability: Capability) = apply {
                crossBorderPushTransfers = capability.crossBorderPushTransfers
                domesticPushTransfers = capability.domesticPushTransfers
                route = capability.route
                additionalProperties = capability.additionalProperties.toMutableMap()
            }

            /** The cross-border push transfers capability. */
            fun crossBorderPushTransfers(crossBorderPushTransfers: CrossBorderPushTransfers) =
                crossBorderPushTransfers(JsonField.of(crossBorderPushTransfers))

            /**
             * Sets [Builder.crossBorderPushTransfers] to an arbitrary JSON value.
             *
             * You should usually call [Builder.crossBorderPushTransfers] with a well-typed
             * [CrossBorderPushTransfers] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun crossBorderPushTransfers(
                crossBorderPushTransfers: JsonField<CrossBorderPushTransfers>
            ) = apply { this.crossBorderPushTransfers = crossBorderPushTransfers }

            /** The domestic push transfers capability. */
            fun domesticPushTransfers(domesticPushTransfers: DomesticPushTransfers) =
                domesticPushTransfers(JsonField.of(domesticPushTransfers))

            /**
             * Sets [Builder.domesticPushTransfers] to an arbitrary JSON value.
             *
             * You should usually call [Builder.domesticPushTransfers] with a well-typed
             * [DomesticPushTransfers] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun domesticPushTransfers(domesticPushTransfers: JsonField<DomesticPushTransfers>) =
                apply {
                    this.domesticPushTransfers = domesticPushTransfers
                }

            /** The route of the capability. */
            fun route(route: Route) = route(JsonField.of(route))

            /**
             * Sets [Builder.route] to an arbitrary JSON value.
             *
             * You should usually call [Builder.route] with a well-typed [Route] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun route(route: JsonField<Route>) = apply { this.route = route }

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
             * Returns an immutable instance of [Capability].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .crossBorderPushTransfers()
             * .domesticPushTransfers()
             * .route()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Capability =
                Capability(
                    checkRequired("crossBorderPushTransfers", crossBorderPushTransfers),
                    checkRequired("domesticPushTransfers", domesticPushTransfers),
                    checkRequired("route", route),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Capability = apply {
            if (validated) {
                return@apply
            }

            crossBorderPushTransfers().validate()
            domesticPushTransfers().validate()
            route().validate()
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
            (crossBorderPushTransfers.asKnown().getOrNull()?.validity() ?: 0) +
                (domesticPushTransfers.asKnown().getOrNull()?.validity() ?: 0) +
                (route.asKnown().getOrNull()?.validity() ?: 0)

        /** The cross-border push transfers capability. */
        class CrossBorderPushTransfers
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

                /** The capability is supported. */
                @JvmField val SUPPORTED = of("supported")

                /** The capability is not supported. */
                @JvmField val NOT_SUPPORTED = of("not_supported")

                @JvmStatic fun of(value: String) = CrossBorderPushTransfers(JsonField.of(value))
            }

            /** An enum containing [CrossBorderPushTransfers]'s known values. */
            enum class Known {
                /** The capability is supported. */
                SUPPORTED,
                /** The capability is not supported. */
                NOT_SUPPORTED,
            }

            /**
             * An enum containing [CrossBorderPushTransfers]'s known values, as well as an
             * [_UNKNOWN] member.
             *
             * An instance of [CrossBorderPushTransfers] can contain an unknown value in a couple of
             * cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                /** The capability is supported. */
                SUPPORTED,
                /** The capability is not supported. */
                NOT_SUPPORTED,
                /**
                 * An enum member indicating that [CrossBorderPushTransfers] was instantiated with
                 * an unknown value.
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
                    SUPPORTED -> Value.SUPPORTED
                    NOT_SUPPORTED -> Value.NOT_SUPPORTED
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
                    SUPPORTED -> Known.SUPPORTED
                    NOT_SUPPORTED -> Known.NOT_SUPPORTED
                    else ->
                        throw IncreaseInvalidDataException(
                            "Unknown CrossBorderPushTransfers: $value"
                        )
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

            fun validate(): CrossBorderPushTransfers = apply {
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

                return other is CrossBorderPushTransfers && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** The domestic push transfers capability. */
        class DomesticPushTransfers
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

                /** The capability is supported. */
                @JvmField val SUPPORTED = of("supported")

                /** The capability is not supported. */
                @JvmField val NOT_SUPPORTED = of("not_supported")

                @JvmStatic fun of(value: String) = DomesticPushTransfers(JsonField.of(value))
            }

            /** An enum containing [DomesticPushTransfers]'s known values. */
            enum class Known {
                /** The capability is supported. */
                SUPPORTED,
                /** The capability is not supported. */
                NOT_SUPPORTED,
            }

            /**
             * An enum containing [DomesticPushTransfers]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [DomesticPushTransfers] can contain an unknown value in a couple of
             * cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                /** The capability is supported. */
                SUPPORTED,
                /** The capability is not supported. */
                NOT_SUPPORTED,
                /**
                 * An enum member indicating that [DomesticPushTransfers] was instantiated with an
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
                    SUPPORTED -> Value.SUPPORTED
                    NOT_SUPPORTED -> Value.NOT_SUPPORTED
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
                    SUPPORTED -> Known.SUPPORTED
                    NOT_SUPPORTED -> Known.NOT_SUPPORTED
                    else ->
                        throw IncreaseInvalidDataException("Unknown DomesticPushTransfers: $value")
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

            fun validate(): DomesticPushTransfers = apply {
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

                return other is DomesticPushTransfers && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** The route of the capability. */
        class Route @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                /** Visa and Interlink */
                @JvmField val VISA = of("visa")

                /** Mastercard and Maestro */
                @JvmField val MASTERCARD = of("mastercard")

                @JvmStatic fun of(value: String) = Route(JsonField.of(value))
            }

            /** An enum containing [Route]'s known values. */
            enum class Known {
                /** Visa and Interlink */
                VISA,
                /** Mastercard and Maestro */
                MASTERCARD,
            }

            /**
             * An enum containing [Route]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Route] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                /** Visa and Interlink */
                VISA,
                /** Mastercard and Maestro */
                MASTERCARD,
                /**
                 * An enum member indicating that [Route] was instantiated with an unknown value.
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
                    VISA -> Value.VISA
                    MASTERCARD -> Value.MASTERCARD
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
                    VISA -> Known.VISA
                    MASTERCARD -> Known.MASTERCARD
                    else -> throw IncreaseInvalidDataException("Unknown Route: $value")
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

            fun validate(): Route = apply {
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

                return other is Route && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Capability &&
                crossBorderPushTransfers == other.crossBorderPushTransfers &&
                domesticPushTransfers == other.domesticPushTransfers &&
                route == other.route &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                crossBorderPushTransfers,
                domesticPushTransfers,
                route,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Capability{crossBorderPushTransfers=$crossBorderPushTransfers, domesticPushTransfers=$domesticPushTransfers, route=$route, additionalProperties=$additionalProperties}"
    }

    /** The outcome to simulate for card push transfers using this token. */
    class Outcome
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val result: JsonField<Result>,
        private val decline: JsonField<Decline>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("result") @ExcludeMissing result: JsonField<Result> = JsonMissing.of(),
            @JsonProperty("decline") @ExcludeMissing decline: JsonField<Decline> = JsonMissing.of(),
        ) : this(result, decline, mutableMapOf())

        /**
         * Whether card push transfers or validations will be approved or declined.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun result(): Result = result.getRequired("result")

        /**
         * If the result is declined, the details of the decline.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun decline(): Optional<Decline> = decline.getOptional("decline")

        /**
         * Returns the raw JSON value of [result].
         *
         * Unlike [result], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("result") @ExcludeMissing fun _result(): JsonField<Result> = result

        /**
         * Returns the raw JSON value of [decline].
         *
         * Unlike [decline], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("decline") @ExcludeMissing fun _decline(): JsonField<Decline> = decline

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
             * Returns a mutable builder for constructing an instance of [Outcome].
             *
             * The following fields are required:
             * ```java
             * .result()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Outcome]. */
        class Builder internal constructor() {

            private var result: JsonField<Result>? = null
            private var decline: JsonField<Decline> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(outcome: Outcome) = apply {
                result = outcome.result
                decline = outcome.decline
                additionalProperties = outcome.additionalProperties.toMutableMap()
            }

            /** Whether card push transfers or validations will be approved or declined. */
            fun result(result: Result) = result(JsonField.of(result))

            /**
             * Sets [Builder.result] to an arbitrary JSON value.
             *
             * You should usually call [Builder.result] with a well-typed [Result] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun result(result: JsonField<Result>) = apply { this.result = result }

            /** If the result is declined, the details of the decline. */
            fun decline(decline: Decline) = decline(JsonField.of(decline))

            /**
             * Sets [Builder.decline] to an arbitrary JSON value.
             *
             * You should usually call [Builder.decline] with a well-typed [Decline] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun decline(decline: JsonField<Decline>) = apply { this.decline = decline }

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
             * Returns an immutable instance of [Outcome].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .result()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Outcome =
                Outcome(
                    checkRequired("result", result),
                    decline,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Outcome = apply {
            if (validated) {
                return@apply
            }

            result().validate()
            decline().ifPresent { it.validate() }
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
            (result.asKnown().getOrNull()?.validity() ?: 0) +
                (decline.asKnown().getOrNull()?.validity() ?: 0)

        /** Whether card push transfers or validations will be approved or declined. */
        class Result @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                /** Any card push transfers or validations will be approved. */
                @JvmField val APPROVE = of("approve")

                /** Any card push transfers or validations will be declined. */
                @JvmField val DECLINE = of("decline")

                @JvmStatic fun of(value: String) = Result(JsonField.of(value))
            }

            /** An enum containing [Result]'s known values. */
            enum class Known {
                /** Any card push transfers or validations will be approved. */
                APPROVE,
                /** Any card push transfers or validations will be declined. */
                DECLINE,
            }

            /**
             * An enum containing [Result]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Result] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                /** Any card push transfers or validations will be approved. */
                APPROVE,
                /** Any card push transfers or validations will be declined. */
                DECLINE,
                /**
                 * An enum member indicating that [Result] was instantiated with an unknown value.
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
                    APPROVE -> Value.APPROVE
                    DECLINE -> Value.DECLINE
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
                    APPROVE -> Known.APPROVE
                    DECLINE -> Known.DECLINE
                    else -> throw IncreaseInvalidDataException("Unknown Result: $value")
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

            fun validate(): Result = apply {
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

                return other is Result && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** If the result is declined, the details of the decline. */
        class Decline
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val reason: JsonField<Reason>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("reason") @ExcludeMissing reason: JsonField<Reason> = JsonMissing.of()
            ) : this(reason, mutableMapOf())

            /**
             * The reason for the decline.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun reason(): Optional<Reason> = reason.getOptional("reason")

            /**
             * Returns the raw JSON value of [reason].
             *
             * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<Reason> = reason

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

                /** Returns a mutable builder for constructing an instance of [Decline]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Decline]. */
            class Builder internal constructor() {

                private var reason: JsonField<Reason> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(decline: Decline) = apply {
                    reason = decline.reason
                    additionalProperties = decline.additionalProperties.toMutableMap()
                }

                /** The reason for the decline. */
                fun reason(reason: Reason) = reason(JsonField.of(reason))

                /**
                 * Sets [Builder.reason] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.reason] with a well-typed [Reason] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun reason(reason: JsonField<Reason>) = apply { this.reason = reason }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Decline].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Decline = Decline(reason, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Decline = apply {
                if (validated) {
                    return@apply
                }

                reason().ifPresent { it.validate() }
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
            internal fun validity(): Int = (reason.asKnown().getOrNull()?.validity() ?: 0)

            /** The reason for the decline. */
            class Reason @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    /**
                     * The card issuer has declined the transaction without providing a specific
                     * reason.
                     */
                    @JvmField val DO_NOT_HONOR = of("do_not_honor")

                    /**
                     * The number of transactions for the card has exceeded the limit set by the
                     * issuer.
                     */
                    @JvmField
                    val ACTIVITY_COUNT_LIMIT_EXCEEDED = of("activity_count_limit_exceeded")

                    /**
                     * The card issuer requires the cardholder to contact them for further
                     * information regarding the transaction.
                     */
                    @JvmField val REFER_TO_CARD_ISSUER = of("refer_to_card_issuer")

                    /**
                     * The card issuer requires the cardholder to contact them due to a special
                     * condition related to the transaction.
                     */
                    @JvmField
                    val REFER_TO_CARD_ISSUER_SPECIAL_CONDITION =
                        of("refer_to_card_issuer_special_condition")

                    /** The merchant is not valid for this transaction. */
                    @JvmField val INVALID_MERCHANT = of("invalid_merchant")

                    /** The card should be retained by the terminal. */
                    @JvmField val PICK_UP_CARD = of("pick_up_card")

                    /** An error occurred during processing of the transaction. */
                    @JvmField val ERROR = of("error")

                    /** The card should be retained by the terminal due to a special condition. */
                    @JvmField val PICK_UP_CARD_SPECIAL = of("pick_up_card_special")

                    /** The transaction is invalid and cannot be processed. */
                    @JvmField val INVALID_TRANSACTION = of("invalid_transaction")

                    /** The amount of the transaction is invalid. */
                    @JvmField val INVALID_AMOUNT = of("invalid_amount")

                    /** The account number provided is invalid. */
                    @JvmField val INVALID_ACCOUNT_NUMBER = of("invalid_account_number")

                    /** The issuer of the card could not be found. */
                    @JvmField val NO_SUCH_ISSUER = of("no_such_issuer")

                    /** The transaction should be re-entered for processing. */
                    @JvmField val RE_ENTER_TRANSACTION = of("re_enter_transaction")

                    /** There is no credit account associated with the card. */
                    @JvmField val NO_CREDIT_ACCOUNT = of("no_credit_account")

                    /**
                     * The card should be retained by the terminal because it has been reported
                     * lost.
                     */
                    @JvmField val PICK_UP_CARD_LOST = of("pick_up_card_lost")

                    /**
                     * The card should be retained by the terminal because it has been reported
                     * stolen.
                     */
                    @JvmField val PICK_UP_CARD_STOLEN = of("pick_up_card_stolen")

                    /** The account associated with the card has been closed. */
                    @JvmField val CLOSED_ACCOUNT = of("closed_account")

                    /** There are insufficient funds in the account to complete the transaction. */
                    @JvmField val INSUFFICIENT_FUNDS = of("insufficient_funds")

                    /** There is no checking account associated with the card. */
                    @JvmField val NO_CHECKING_ACCOUNT = of("no_checking_account")

                    /** There is no savings account associated with the card. */
                    @JvmField val NO_SAVINGS_ACCOUNT = of("no_savings_account")

                    /** The card has expired and cannot be used for transactions. */
                    @JvmField val EXPIRED_CARD = of("expired_card")

                    /** The transaction is not permitted for this cardholder. */
                    @JvmField
                    val TRANSACTION_NOT_PERMITTED_TO_CARDHOLDER =
                        of("transaction_not_permitted_to_cardholder")

                    /** The transaction is not allowed at this terminal. */
                    @JvmField
                    val TRANSACTION_NOT_ALLOWED_AT_TERMINAL =
                        of("transaction_not_allowed_at_terminal")

                    /** The transaction is not supported or has been blocked by the issuer. */
                    @JvmField
                    val TRANSACTION_NOT_SUPPORTED_OR_BLOCKED_BY_ISSUER =
                        of("transaction_not_supported_or_blocked_by_issuer")

                    /**
                     * The transaction has been flagged as suspected fraud and cannot be processed.
                     */
                    @JvmField val SUSPECTED_FRAUD = of("suspected_fraud")

                    /**
                     * The amount of activity on the card has exceeded the limit set by the issuer.
                     */
                    @JvmField
                    val ACTIVITY_AMOUNT_LIMIT_EXCEEDED = of("activity_amount_limit_exceeded")

                    /**
                     * The card has restrictions that prevent it from being used for this
                     * transaction.
                     */
                    @JvmField val RESTRICTED_CARD = of("restricted_card")

                    /**
                     * A security violation has occurred, preventing the transaction from being
                     * processed.
                     */
                    @JvmField val SECURITY_VIOLATION = of("security_violation")

                    /**
                     * The transaction does not meet the anti-money laundering requirements set by
                     * the issuer.
                     */
                    @JvmField
                    val TRANSACTION_DOES_NOT_FULFILL_ANTI_MONEY_LAUNDERING_REQUIREMENT =
                        of("transaction_does_not_fulfill_anti_money_laundering_requirement")

                    /** The transaction was blocked by the cardholder. */
                    @JvmField val BLOCKED_BY_CARDHOLDER = of("blocked_by_cardholder")

                    /** The first use of the card has been blocked by the issuer. */
                    @JvmField val BLOCKED_FIRST_USE = of("blocked_first_use")

                    /** The credit issuer is currently unavailable to process the transaction. */
                    @JvmField val CREDIT_ISSUER_UNAVAILABLE = of("credit_issuer_unavailable")

                    /**
                     * The card verification value (CVV) results were negative, indicating a
                     * potential issue with the card.
                     */
                    @JvmField
                    val NEGATIVE_CARD_VERIFICATION_VALUE_RESULTS =
                        of("negative_card_verification_value_results")

                    /**
                     * The issuer of the card is currently unavailable to process the transaction.
                     */
                    @JvmField val ISSUER_UNAVAILABLE = of("issuer_unavailable")

                    /** The financial institution associated with the card could not be found. */
                    @JvmField
                    val FINANCIAL_INSTITUTION_CANNOT_BE_FOUND =
                        of("financial_institution_cannot_be_found")

                    /** The transaction cannot be completed due to an unspecified reason. */
                    @JvmField
                    val TRANSACTION_CANNOT_BE_COMPLETED = of("transaction_cannot_be_completed")

                    /**
                     * The transaction is a duplicate of a previous transaction and cannot be
                     * processed again.
                     */
                    @JvmField val DUPLICATE_TRANSACTION = of("duplicate_transaction")

                    /**
                     * A system malfunction occurred, preventing the transaction from being
                     * processed.
                     */
                    @JvmField val SYSTEM_MALFUNCTION = of("system_malfunction")

                    /**
                     * Additional customer authentication is required to complete the transaction.
                     */
                    @JvmField
                    val ADDITIONAL_CUSTOMER_AUTHENTICATION_REQUIRED =
                        of("additional_customer_authentication_required")

                    /**
                     * The surcharge amount applied to the transaction is not permitted by the
                     * issuer.
                     */
                    @JvmField
                    val SURCHARGE_AMOUNT_NOT_PERMITTED = of("surcharge_amount_not_permitted")

                    /** The transaction was declined due to a failure in verifying the CVV2 code. */
                    @JvmField val DECLINE_FOR_CVV2_FAILURE = of("decline_for_cvv2_failure")

                    /** A stop payment order has been placed on this transaction. */
                    @JvmField val STOP_PAYMENT_ORDER = of("stop_payment_order")

                    /** An order has been placed to revoke authorization for this transaction. */
                    @JvmField
                    val REVOCATION_OF_AUTHORIZATION_ORDER = of("revocation_of_authorization_order")

                    /**
                     * An order has been placed to revoke all authorizations for this cardholder.
                     */
                    @JvmField
                    val REVOCATION_OF_ALL_AUTHORIZATIONS_ORDER =
                        of("revocation_of_all_authorizations_order")

                    @JvmStatic fun of(value: String) = Reason(JsonField.of(value))
                }

                /** An enum containing [Reason]'s known values. */
                enum class Known {
                    /**
                     * The card issuer has declined the transaction without providing a specific
                     * reason.
                     */
                    DO_NOT_HONOR,
                    /**
                     * The number of transactions for the card has exceeded the limit set by the
                     * issuer.
                     */
                    ACTIVITY_COUNT_LIMIT_EXCEEDED,
                    /**
                     * The card issuer requires the cardholder to contact them for further
                     * information regarding the transaction.
                     */
                    REFER_TO_CARD_ISSUER,
                    /**
                     * The card issuer requires the cardholder to contact them due to a special
                     * condition related to the transaction.
                     */
                    REFER_TO_CARD_ISSUER_SPECIAL_CONDITION,
                    /** The merchant is not valid for this transaction. */
                    INVALID_MERCHANT,
                    /** The card should be retained by the terminal. */
                    PICK_UP_CARD,
                    /** An error occurred during processing of the transaction. */
                    ERROR,
                    /** The card should be retained by the terminal due to a special condition. */
                    PICK_UP_CARD_SPECIAL,
                    /** The transaction is invalid and cannot be processed. */
                    INVALID_TRANSACTION,
                    /** The amount of the transaction is invalid. */
                    INVALID_AMOUNT,
                    /** The account number provided is invalid. */
                    INVALID_ACCOUNT_NUMBER,
                    /** The issuer of the card could not be found. */
                    NO_SUCH_ISSUER,
                    /** The transaction should be re-entered for processing. */
                    RE_ENTER_TRANSACTION,
                    /** There is no credit account associated with the card. */
                    NO_CREDIT_ACCOUNT,
                    /**
                     * The card should be retained by the terminal because it has been reported
                     * lost.
                     */
                    PICK_UP_CARD_LOST,
                    /**
                     * The card should be retained by the terminal because it has been reported
                     * stolen.
                     */
                    PICK_UP_CARD_STOLEN,
                    /** The account associated with the card has been closed. */
                    CLOSED_ACCOUNT,
                    /** There are insufficient funds in the account to complete the transaction. */
                    INSUFFICIENT_FUNDS,
                    /** There is no checking account associated with the card. */
                    NO_CHECKING_ACCOUNT,
                    /** There is no savings account associated with the card. */
                    NO_SAVINGS_ACCOUNT,
                    /** The card has expired and cannot be used for transactions. */
                    EXPIRED_CARD,
                    /** The transaction is not permitted for this cardholder. */
                    TRANSACTION_NOT_PERMITTED_TO_CARDHOLDER,
                    /** The transaction is not allowed at this terminal. */
                    TRANSACTION_NOT_ALLOWED_AT_TERMINAL,
                    /** The transaction is not supported or has been blocked by the issuer. */
                    TRANSACTION_NOT_SUPPORTED_OR_BLOCKED_BY_ISSUER,
                    /**
                     * The transaction has been flagged as suspected fraud and cannot be processed.
                     */
                    SUSPECTED_FRAUD,
                    /**
                     * The amount of activity on the card has exceeded the limit set by the issuer.
                     */
                    ACTIVITY_AMOUNT_LIMIT_EXCEEDED,
                    /**
                     * The card has restrictions that prevent it from being used for this
                     * transaction.
                     */
                    RESTRICTED_CARD,
                    /**
                     * A security violation has occurred, preventing the transaction from being
                     * processed.
                     */
                    SECURITY_VIOLATION,
                    /**
                     * The transaction does not meet the anti-money laundering requirements set by
                     * the issuer.
                     */
                    TRANSACTION_DOES_NOT_FULFILL_ANTI_MONEY_LAUNDERING_REQUIREMENT,
                    /** The transaction was blocked by the cardholder. */
                    BLOCKED_BY_CARDHOLDER,
                    /** The first use of the card has been blocked by the issuer. */
                    BLOCKED_FIRST_USE,
                    /** The credit issuer is currently unavailable to process the transaction. */
                    CREDIT_ISSUER_UNAVAILABLE,
                    /**
                     * The card verification value (CVV) results were negative, indicating a
                     * potential issue with the card.
                     */
                    NEGATIVE_CARD_VERIFICATION_VALUE_RESULTS,
                    /**
                     * The issuer of the card is currently unavailable to process the transaction.
                     */
                    ISSUER_UNAVAILABLE,
                    /** The financial institution associated with the card could not be found. */
                    FINANCIAL_INSTITUTION_CANNOT_BE_FOUND,
                    /** The transaction cannot be completed due to an unspecified reason. */
                    TRANSACTION_CANNOT_BE_COMPLETED,
                    /**
                     * The transaction is a duplicate of a previous transaction and cannot be
                     * processed again.
                     */
                    DUPLICATE_TRANSACTION,
                    /**
                     * A system malfunction occurred, preventing the transaction from being
                     * processed.
                     */
                    SYSTEM_MALFUNCTION,
                    /**
                     * Additional customer authentication is required to complete the transaction.
                     */
                    ADDITIONAL_CUSTOMER_AUTHENTICATION_REQUIRED,
                    /**
                     * The surcharge amount applied to the transaction is not permitted by the
                     * issuer.
                     */
                    SURCHARGE_AMOUNT_NOT_PERMITTED,
                    /** The transaction was declined due to a failure in verifying the CVV2 code. */
                    DECLINE_FOR_CVV2_FAILURE,
                    /** A stop payment order has been placed on this transaction. */
                    STOP_PAYMENT_ORDER,
                    /** An order has been placed to revoke authorization for this transaction. */
                    REVOCATION_OF_AUTHORIZATION_ORDER,
                    /**
                     * An order has been placed to revoke all authorizations for this cardholder.
                     */
                    REVOCATION_OF_ALL_AUTHORIZATIONS_ORDER,
                }

                /**
                 * An enum containing [Reason]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Reason] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    /**
                     * The card issuer has declined the transaction without providing a specific
                     * reason.
                     */
                    DO_NOT_HONOR,
                    /**
                     * The number of transactions for the card has exceeded the limit set by the
                     * issuer.
                     */
                    ACTIVITY_COUNT_LIMIT_EXCEEDED,
                    /**
                     * The card issuer requires the cardholder to contact them for further
                     * information regarding the transaction.
                     */
                    REFER_TO_CARD_ISSUER,
                    /**
                     * The card issuer requires the cardholder to contact them due to a special
                     * condition related to the transaction.
                     */
                    REFER_TO_CARD_ISSUER_SPECIAL_CONDITION,
                    /** The merchant is not valid for this transaction. */
                    INVALID_MERCHANT,
                    /** The card should be retained by the terminal. */
                    PICK_UP_CARD,
                    /** An error occurred during processing of the transaction. */
                    ERROR,
                    /** The card should be retained by the terminal due to a special condition. */
                    PICK_UP_CARD_SPECIAL,
                    /** The transaction is invalid and cannot be processed. */
                    INVALID_TRANSACTION,
                    /** The amount of the transaction is invalid. */
                    INVALID_AMOUNT,
                    /** The account number provided is invalid. */
                    INVALID_ACCOUNT_NUMBER,
                    /** The issuer of the card could not be found. */
                    NO_SUCH_ISSUER,
                    /** The transaction should be re-entered for processing. */
                    RE_ENTER_TRANSACTION,
                    /** There is no credit account associated with the card. */
                    NO_CREDIT_ACCOUNT,
                    /**
                     * The card should be retained by the terminal because it has been reported
                     * lost.
                     */
                    PICK_UP_CARD_LOST,
                    /**
                     * The card should be retained by the terminal because it has been reported
                     * stolen.
                     */
                    PICK_UP_CARD_STOLEN,
                    /** The account associated with the card has been closed. */
                    CLOSED_ACCOUNT,
                    /** There are insufficient funds in the account to complete the transaction. */
                    INSUFFICIENT_FUNDS,
                    /** There is no checking account associated with the card. */
                    NO_CHECKING_ACCOUNT,
                    /** There is no savings account associated with the card. */
                    NO_SAVINGS_ACCOUNT,
                    /** The card has expired and cannot be used for transactions. */
                    EXPIRED_CARD,
                    /** The transaction is not permitted for this cardholder. */
                    TRANSACTION_NOT_PERMITTED_TO_CARDHOLDER,
                    /** The transaction is not allowed at this terminal. */
                    TRANSACTION_NOT_ALLOWED_AT_TERMINAL,
                    /** The transaction is not supported or has been blocked by the issuer. */
                    TRANSACTION_NOT_SUPPORTED_OR_BLOCKED_BY_ISSUER,
                    /**
                     * The transaction has been flagged as suspected fraud and cannot be processed.
                     */
                    SUSPECTED_FRAUD,
                    /**
                     * The amount of activity on the card has exceeded the limit set by the issuer.
                     */
                    ACTIVITY_AMOUNT_LIMIT_EXCEEDED,
                    /**
                     * The card has restrictions that prevent it from being used for this
                     * transaction.
                     */
                    RESTRICTED_CARD,
                    /**
                     * A security violation has occurred, preventing the transaction from being
                     * processed.
                     */
                    SECURITY_VIOLATION,
                    /**
                     * The transaction does not meet the anti-money laundering requirements set by
                     * the issuer.
                     */
                    TRANSACTION_DOES_NOT_FULFILL_ANTI_MONEY_LAUNDERING_REQUIREMENT,
                    /** The transaction was blocked by the cardholder. */
                    BLOCKED_BY_CARDHOLDER,
                    /** The first use of the card has been blocked by the issuer. */
                    BLOCKED_FIRST_USE,
                    /** The credit issuer is currently unavailable to process the transaction. */
                    CREDIT_ISSUER_UNAVAILABLE,
                    /**
                     * The card verification value (CVV) results were negative, indicating a
                     * potential issue with the card.
                     */
                    NEGATIVE_CARD_VERIFICATION_VALUE_RESULTS,
                    /**
                     * The issuer of the card is currently unavailable to process the transaction.
                     */
                    ISSUER_UNAVAILABLE,
                    /** The financial institution associated with the card could not be found. */
                    FINANCIAL_INSTITUTION_CANNOT_BE_FOUND,
                    /** The transaction cannot be completed due to an unspecified reason. */
                    TRANSACTION_CANNOT_BE_COMPLETED,
                    /**
                     * The transaction is a duplicate of a previous transaction and cannot be
                     * processed again.
                     */
                    DUPLICATE_TRANSACTION,
                    /**
                     * A system malfunction occurred, preventing the transaction from being
                     * processed.
                     */
                    SYSTEM_MALFUNCTION,
                    /**
                     * Additional customer authentication is required to complete the transaction.
                     */
                    ADDITIONAL_CUSTOMER_AUTHENTICATION_REQUIRED,
                    /**
                     * The surcharge amount applied to the transaction is not permitted by the
                     * issuer.
                     */
                    SURCHARGE_AMOUNT_NOT_PERMITTED,
                    /** The transaction was declined due to a failure in verifying the CVV2 code. */
                    DECLINE_FOR_CVV2_FAILURE,
                    /** A stop payment order has been placed on this transaction. */
                    STOP_PAYMENT_ORDER,
                    /** An order has been placed to revoke authorization for this transaction. */
                    REVOCATION_OF_AUTHORIZATION_ORDER,
                    /**
                     * An order has been placed to revoke all authorizations for this cardholder.
                     */
                    REVOCATION_OF_ALL_AUTHORIZATIONS_ORDER,
                    /**
                     * An enum member indicating that [Reason] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        DO_NOT_HONOR -> Value.DO_NOT_HONOR
                        ACTIVITY_COUNT_LIMIT_EXCEEDED -> Value.ACTIVITY_COUNT_LIMIT_EXCEEDED
                        REFER_TO_CARD_ISSUER -> Value.REFER_TO_CARD_ISSUER
                        REFER_TO_CARD_ISSUER_SPECIAL_CONDITION ->
                            Value.REFER_TO_CARD_ISSUER_SPECIAL_CONDITION
                        INVALID_MERCHANT -> Value.INVALID_MERCHANT
                        PICK_UP_CARD -> Value.PICK_UP_CARD
                        ERROR -> Value.ERROR
                        PICK_UP_CARD_SPECIAL -> Value.PICK_UP_CARD_SPECIAL
                        INVALID_TRANSACTION -> Value.INVALID_TRANSACTION
                        INVALID_AMOUNT -> Value.INVALID_AMOUNT
                        INVALID_ACCOUNT_NUMBER -> Value.INVALID_ACCOUNT_NUMBER
                        NO_SUCH_ISSUER -> Value.NO_SUCH_ISSUER
                        RE_ENTER_TRANSACTION -> Value.RE_ENTER_TRANSACTION
                        NO_CREDIT_ACCOUNT -> Value.NO_CREDIT_ACCOUNT
                        PICK_UP_CARD_LOST -> Value.PICK_UP_CARD_LOST
                        PICK_UP_CARD_STOLEN -> Value.PICK_UP_CARD_STOLEN
                        CLOSED_ACCOUNT -> Value.CLOSED_ACCOUNT
                        INSUFFICIENT_FUNDS -> Value.INSUFFICIENT_FUNDS
                        NO_CHECKING_ACCOUNT -> Value.NO_CHECKING_ACCOUNT
                        NO_SAVINGS_ACCOUNT -> Value.NO_SAVINGS_ACCOUNT
                        EXPIRED_CARD -> Value.EXPIRED_CARD
                        TRANSACTION_NOT_PERMITTED_TO_CARDHOLDER ->
                            Value.TRANSACTION_NOT_PERMITTED_TO_CARDHOLDER
                        TRANSACTION_NOT_ALLOWED_AT_TERMINAL ->
                            Value.TRANSACTION_NOT_ALLOWED_AT_TERMINAL
                        TRANSACTION_NOT_SUPPORTED_OR_BLOCKED_BY_ISSUER ->
                            Value.TRANSACTION_NOT_SUPPORTED_OR_BLOCKED_BY_ISSUER
                        SUSPECTED_FRAUD -> Value.SUSPECTED_FRAUD
                        ACTIVITY_AMOUNT_LIMIT_EXCEEDED -> Value.ACTIVITY_AMOUNT_LIMIT_EXCEEDED
                        RESTRICTED_CARD -> Value.RESTRICTED_CARD
                        SECURITY_VIOLATION -> Value.SECURITY_VIOLATION
                        TRANSACTION_DOES_NOT_FULFILL_ANTI_MONEY_LAUNDERING_REQUIREMENT ->
                            Value.TRANSACTION_DOES_NOT_FULFILL_ANTI_MONEY_LAUNDERING_REQUIREMENT
                        BLOCKED_BY_CARDHOLDER -> Value.BLOCKED_BY_CARDHOLDER
                        BLOCKED_FIRST_USE -> Value.BLOCKED_FIRST_USE
                        CREDIT_ISSUER_UNAVAILABLE -> Value.CREDIT_ISSUER_UNAVAILABLE
                        NEGATIVE_CARD_VERIFICATION_VALUE_RESULTS ->
                            Value.NEGATIVE_CARD_VERIFICATION_VALUE_RESULTS
                        ISSUER_UNAVAILABLE -> Value.ISSUER_UNAVAILABLE
                        FINANCIAL_INSTITUTION_CANNOT_BE_FOUND ->
                            Value.FINANCIAL_INSTITUTION_CANNOT_BE_FOUND
                        TRANSACTION_CANNOT_BE_COMPLETED -> Value.TRANSACTION_CANNOT_BE_COMPLETED
                        DUPLICATE_TRANSACTION -> Value.DUPLICATE_TRANSACTION
                        SYSTEM_MALFUNCTION -> Value.SYSTEM_MALFUNCTION
                        ADDITIONAL_CUSTOMER_AUTHENTICATION_REQUIRED ->
                            Value.ADDITIONAL_CUSTOMER_AUTHENTICATION_REQUIRED
                        SURCHARGE_AMOUNT_NOT_PERMITTED -> Value.SURCHARGE_AMOUNT_NOT_PERMITTED
                        DECLINE_FOR_CVV2_FAILURE -> Value.DECLINE_FOR_CVV2_FAILURE
                        STOP_PAYMENT_ORDER -> Value.STOP_PAYMENT_ORDER
                        REVOCATION_OF_AUTHORIZATION_ORDER -> Value.REVOCATION_OF_AUTHORIZATION_ORDER
                        REVOCATION_OF_ALL_AUTHORIZATIONS_ORDER ->
                            Value.REVOCATION_OF_ALL_AUTHORIZATIONS_ORDER
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws IncreaseInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        DO_NOT_HONOR -> Known.DO_NOT_HONOR
                        ACTIVITY_COUNT_LIMIT_EXCEEDED -> Known.ACTIVITY_COUNT_LIMIT_EXCEEDED
                        REFER_TO_CARD_ISSUER -> Known.REFER_TO_CARD_ISSUER
                        REFER_TO_CARD_ISSUER_SPECIAL_CONDITION ->
                            Known.REFER_TO_CARD_ISSUER_SPECIAL_CONDITION
                        INVALID_MERCHANT -> Known.INVALID_MERCHANT
                        PICK_UP_CARD -> Known.PICK_UP_CARD
                        ERROR -> Known.ERROR
                        PICK_UP_CARD_SPECIAL -> Known.PICK_UP_CARD_SPECIAL
                        INVALID_TRANSACTION -> Known.INVALID_TRANSACTION
                        INVALID_AMOUNT -> Known.INVALID_AMOUNT
                        INVALID_ACCOUNT_NUMBER -> Known.INVALID_ACCOUNT_NUMBER
                        NO_SUCH_ISSUER -> Known.NO_SUCH_ISSUER
                        RE_ENTER_TRANSACTION -> Known.RE_ENTER_TRANSACTION
                        NO_CREDIT_ACCOUNT -> Known.NO_CREDIT_ACCOUNT
                        PICK_UP_CARD_LOST -> Known.PICK_UP_CARD_LOST
                        PICK_UP_CARD_STOLEN -> Known.PICK_UP_CARD_STOLEN
                        CLOSED_ACCOUNT -> Known.CLOSED_ACCOUNT
                        INSUFFICIENT_FUNDS -> Known.INSUFFICIENT_FUNDS
                        NO_CHECKING_ACCOUNT -> Known.NO_CHECKING_ACCOUNT
                        NO_SAVINGS_ACCOUNT -> Known.NO_SAVINGS_ACCOUNT
                        EXPIRED_CARD -> Known.EXPIRED_CARD
                        TRANSACTION_NOT_PERMITTED_TO_CARDHOLDER ->
                            Known.TRANSACTION_NOT_PERMITTED_TO_CARDHOLDER
                        TRANSACTION_NOT_ALLOWED_AT_TERMINAL ->
                            Known.TRANSACTION_NOT_ALLOWED_AT_TERMINAL
                        TRANSACTION_NOT_SUPPORTED_OR_BLOCKED_BY_ISSUER ->
                            Known.TRANSACTION_NOT_SUPPORTED_OR_BLOCKED_BY_ISSUER
                        SUSPECTED_FRAUD -> Known.SUSPECTED_FRAUD
                        ACTIVITY_AMOUNT_LIMIT_EXCEEDED -> Known.ACTIVITY_AMOUNT_LIMIT_EXCEEDED
                        RESTRICTED_CARD -> Known.RESTRICTED_CARD
                        SECURITY_VIOLATION -> Known.SECURITY_VIOLATION
                        TRANSACTION_DOES_NOT_FULFILL_ANTI_MONEY_LAUNDERING_REQUIREMENT ->
                            Known.TRANSACTION_DOES_NOT_FULFILL_ANTI_MONEY_LAUNDERING_REQUIREMENT
                        BLOCKED_BY_CARDHOLDER -> Known.BLOCKED_BY_CARDHOLDER
                        BLOCKED_FIRST_USE -> Known.BLOCKED_FIRST_USE
                        CREDIT_ISSUER_UNAVAILABLE -> Known.CREDIT_ISSUER_UNAVAILABLE
                        NEGATIVE_CARD_VERIFICATION_VALUE_RESULTS ->
                            Known.NEGATIVE_CARD_VERIFICATION_VALUE_RESULTS
                        ISSUER_UNAVAILABLE -> Known.ISSUER_UNAVAILABLE
                        FINANCIAL_INSTITUTION_CANNOT_BE_FOUND ->
                            Known.FINANCIAL_INSTITUTION_CANNOT_BE_FOUND
                        TRANSACTION_CANNOT_BE_COMPLETED -> Known.TRANSACTION_CANNOT_BE_COMPLETED
                        DUPLICATE_TRANSACTION -> Known.DUPLICATE_TRANSACTION
                        SYSTEM_MALFUNCTION -> Known.SYSTEM_MALFUNCTION
                        ADDITIONAL_CUSTOMER_AUTHENTICATION_REQUIRED ->
                            Known.ADDITIONAL_CUSTOMER_AUTHENTICATION_REQUIRED
                        SURCHARGE_AMOUNT_NOT_PERMITTED -> Known.SURCHARGE_AMOUNT_NOT_PERMITTED
                        DECLINE_FOR_CVV2_FAILURE -> Known.DECLINE_FOR_CVV2_FAILURE
                        STOP_PAYMENT_ORDER -> Known.STOP_PAYMENT_ORDER
                        REVOCATION_OF_AUTHORIZATION_ORDER -> Known.REVOCATION_OF_AUTHORIZATION_ORDER
                        REVOCATION_OF_ALL_AUTHORIZATIONS_ORDER ->
                            Known.REVOCATION_OF_ALL_AUTHORIZATIONS_ORDER
                        else -> throw IncreaseInvalidDataException("Unknown Reason: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws IncreaseInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        IncreaseInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): Reason = apply {
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

                    return other is Reason && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Decline &&
                    reason == other.reason &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(reason, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Decline{reason=$reason, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Outcome &&
                result == other.result &&
                decline == other.decline &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(result, decline, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Outcome{result=$result, decline=$decline, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CardTokenCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "CardTokenCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
