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
         * - [prefix]
         * - [primaryAccountNumberLength]
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
            @JsonProperty("prefix") @ExcludeMissing prefix: JsonField<String> = JsonMissing.of(),
            @JsonProperty("primary_account_number_length")
            @ExcludeMissing
            primaryAccountNumberLength: JsonField<Long> = JsonMissing.of(),
        ) : this(
            capabilities,
            expiration,
            last4,
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
            private var prefix: JsonField<String> = JsonMissing.of()
            private var primaryAccountNumberLength: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                capabilities = body.capabilities.map { it.toMutableList() }
                expiration = body.expiration
                last4 = body.last4
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
                prefix == other.prefix &&
                primaryAccountNumberLength == other.primaryAccountNumberLength &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                capabilities,
                expiration,
                last4,
                prefix,
                primaryAccountNumberLength,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{capabilities=$capabilities, expiration=$expiration, last4=$last4, prefix=$prefix, primaryAccountNumberLength=$primaryAccountNumberLength, additionalProperties=$additionalProperties}"
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
