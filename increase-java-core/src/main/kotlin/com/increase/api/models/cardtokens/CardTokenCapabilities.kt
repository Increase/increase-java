// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.cardtokens

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.increase.api.core.Enum
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.checkKnown
import com.increase.api.core.checkRequired
import com.increase.api.core.toImmutable
import com.increase.api.errors.IncreaseInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

/**
 * The capabilities of a Card Token describe whether the card can be used for specific operations,
 * such as Card Push Transfers. The capabilities can change over time based on the issuing bank's
 * configuration of the card range.
 */
class CardTokenCapabilities
private constructor(
    private val routes: JsonField<List<Route>>,
    private val type: JsonField<Type>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("routes") @ExcludeMissing routes: JsonField<List<Route>> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
    ) : this(routes, type, mutableMapOf())

    /**
     * Each route represent a path e.g., a push transfer can take.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun routes(): List<Route> = routes.getRequired("routes")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `card_token_capabilities`.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * Returns the raw JSON value of [routes].
     *
     * Unlike [routes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("routes") @ExcludeMissing fun _routes(): JsonField<List<Route>> = routes

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
         * Returns a mutable builder for constructing an instance of [CardTokenCapabilities].
         *
         * The following fields are required:
         * ```java
         * .routes()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CardTokenCapabilities]. */
    class Builder internal constructor() {

        private var routes: JsonField<MutableList<Route>>? = null
        private var type: JsonField<Type>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(cardTokenCapabilities: CardTokenCapabilities) = apply {
            routes = cardTokenCapabilities.routes.map { it.toMutableList() }
            type = cardTokenCapabilities.type
            additionalProperties = cardTokenCapabilities.additionalProperties.toMutableMap()
        }

        /** Each route represent a path e.g., a push transfer can take. */
        fun routes(routes: List<Route>) = routes(JsonField.of(routes))

        /**
         * Sets [Builder.routes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.routes] with a well-typed `List<Route>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun routes(routes: JsonField<List<Route>>) = apply {
            this.routes = routes.map { it.toMutableList() }
        }

        /**
         * Adds a single [Route] to [routes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRoute(route: Route) = apply {
            routes =
                (routes ?: JsonField.of(mutableListOf())).also {
                    checkKnown("routes", it).add(route)
                }
        }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `card_token_capabilities`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

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
         * Returns an immutable instance of [CardTokenCapabilities].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .routes()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CardTokenCapabilities =
            CardTokenCapabilities(
                checkRequired("routes", routes).map { it.toImmutable() },
                checkRequired("type", type),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CardTokenCapabilities = apply {
        if (validated) {
            return@apply
        }

        routes().forEach { it.validate() }
        type().validate()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (routes.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0)

    class Route
    private constructor(
        private val crossBorderPushTransfers: JsonField<CrossBorderPushTransfers>,
        private val domesticPushTransfers: JsonField<DomesticPushTransfers>,
        private val route: JsonField<InnerRoute>,
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
            @JsonProperty("route") @ExcludeMissing route: JsonField<InnerRoute> = JsonMissing.of(),
        ) : this(crossBorderPushTransfers, domesticPushTransfers, route, mutableMapOf())

        /**
         * Whether you can push funds to the card using cross-border Card Push Transfers.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun crossBorderPushTransfers(): CrossBorderPushTransfers =
            crossBorderPushTransfers.getRequired("cross_border_push_transfers")

        /**
         * Whether you can push funds to the card using domestic Card Push Transfers.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun domesticPushTransfers(): DomesticPushTransfers =
            domesticPushTransfers.getRequired("domestic_push_transfers")

        /**
         * The card network route the capabilities apply to.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun route(): InnerRoute = route.getRequired("route")

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
        @JsonProperty("route") @ExcludeMissing fun _route(): JsonField<InnerRoute> = route

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
             * Returns a mutable builder for constructing an instance of [Route].
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

        /** A builder for [Route]. */
        class Builder internal constructor() {

            private var crossBorderPushTransfers: JsonField<CrossBorderPushTransfers>? = null
            private var domesticPushTransfers: JsonField<DomesticPushTransfers>? = null
            private var route: JsonField<InnerRoute>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(route: Route) = apply {
                crossBorderPushTransfers = route.crossBorderPushTransfers
                domesticPushTransfers = route.domesticPushTransfers
                this.route = route.route
                additionalProperties = route.additionalProperties.toMutableMap()
            }

            /** Whether you can push funds to the card using cross-border Card Push Transfers. */
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

            /** Whether you can push funds to the card using domestic Card Push Transfers. */
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

            /** The card network route the capabilities apply to. */
            fun route(route: InnerRoute) = route(JsonField.of(route))

            /**
             * Sets [Builder.route] to an arbitrary JSON value.
             *
             * You should usually call [Builder.route] with a well-typed [InnerRoute] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun route(route: JsonField<InnerRoute>) = apply { this.route = route }

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
             * Returns an immutable instance of [Route].
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
            fun build(): Route =
                Route(
                    checkRequired("crossBorderPushTransfers", crossBorderPushTransfers),
                    checkRequired("domesticPushTransfers", domesticPushTransfers),
                    checkRequired("route", route),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Route = apply {
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

        /** Whether you can push funds to the card using cross-border Card Push Transfers. */
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

        /** Whether you can push funds to the card using domestic Card Push Transfers. */
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

        /** The card network route the capabilities apply to. */
        class InnerRoute @JsonCreator private constructor(private val value: JsonField<String>) :
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

                /** Visa and Interlink */
                @JvmField val VISA = of("visa")

                /** Mastercard and Maestro */
                @JvmField val MASTERCARD = of("mastercard")

                @JvmStatic fun of(value: String) = InnerRoute(JsonField.of(value))
            }

            /** An enum containing [InnerRoute]'s known values. */
            enum class Known {
                /** Visa and Interlink */
                VISA,
                /** Mastercard and Maestro */
                MASTERCARD,
            }

            /**
             * An enum containing [InnerRoute]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [InnerRoute] can contain an unknown value in a couple of cases:
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
                 * An enum member indicating that [InnerRoute] was instantiated with an unknown
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
                    else -> throw IncreaseInvalidDataException("Unknown InnerRoute: $value")
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

            fun validate(): InnerRoute = apply {
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

                return other is InnerRoute && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Route &&
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
            "Route{crossBorderPushTransfers=$crossBorderPushTransfers, domesticPushTransfers=$domesticPushTransfers, route=$route, additionalProperties=$additionalProperties}"
    }

    /**
     * A constant representing the object's type. For this resource it will always be
     * `card_token_capabilities`.
     */
    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val CARD_TOKEN_CAPABILITIES = of("card_token_capabilities")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            CARD_TOKEN_CAPABILITIES
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CARD_TOKEN_CAPABILITIES,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                CARD_TOKEN_CAPABILITIES -> Value.CARD_TOKEN_CAPABILITIES
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
                CARD_TOKEN_CAPABILITIES -> Known.CARD_TOKEN_CAPABILITIES
                else -> throw IncreaseInvalidDataException("Unknown Type: $value")
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

        fun validate(): Type = apply {
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

            return other is Type && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CardTokenCapabilities &&
            routes == other.routes &&
            type == other.type &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(routes, type, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CardTokenCapabilities{routes=$routes, type=$type, additionalProperties=$additionalProperties}"
}
