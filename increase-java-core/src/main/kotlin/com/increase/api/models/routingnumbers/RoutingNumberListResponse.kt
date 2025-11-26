// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.routingnumbers

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
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** A list of Routing Number objects. */
class RoutingNumberListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val data: JsonField<List<Data>>,
    private val nextCursor: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data") @ExcludeMissing data: JsonField<List<Data>> = JsonMissing.of(),
        @JsonProperty("next_cursor")
        @ExcludeMissing
        nextCursor: JsonField<String> = JsonMissing.of(),
    ) : this(data, nextCursor, mutableMapOf())

    /**
     * The contents of the list.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun data(): List<Data> = data.getRequired("data")

    /**
     * A pointer to a place in the list.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun nextCursor(): Optional<String> = nextCursor.getOptional("next_cursor")

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<List<Data>> = data

    /**
     * Returns the raw JSON value of [nextCursor].
     *
     * Unlike [nextCursor], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("next_cursor") @ExcludeMissing fun _nextCursor(): JsonField<String> = nextCursor

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
         * Returns a mutable builder for constructing an instance of [RoutingNumberListResponse].
         *
         * The following fields are required:
         * ```java
         * .data()
         * .nextCursor()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RoutingNumberListResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<MutableList<Data>>? = null
        private var nextCursor: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(routingNumberListResponse: RoutingNumberListResponse) = apply {
            data = routingNumberListResponse.data.map { it.toMutableList() }
            nextCursor = routingNumberListResponse.nextCursor
            additionalProperties = routingNumberListResponse.additionalProperties.toMutableMap()
        }

        /** The contents of the list. */
        fun data(data: List<Data>) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed `List<Data>` value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<List<Data>>) = apply {
            this.data = data.map { it.toMutableList() }
        }

        /**
         * Adds a single [Data] to [Builder.data].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addData(data: Data) = apply {
            this.data =
                (this.data ?: JsonField.of(mutableListOf())).also {
                    checkKnown("data", it).add(data)
                }
        }

        /** A pointer to a place in the list. */
        fun nextCursor(nextCursor: String?) = nextCursor(JsonField.ofNullable(nextCursor))

        /** Alias for calling [Builder.nextCursor] with `nextCursor.orElse(null)`. */
        fun nextCursor(nextCursor: Optional<String>) = nextCursor(nextCursor.getOrNull())

        /**
         * Sets [Builder.nextCursor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.nextCursor] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun nextCursor(nextCursor: JsonField<String>) = apply { this.nextCursor = nextCursor }

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
         * Returns an immutable instance of [RoutingNumberListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .data()
         * .nextCursor()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): RoutingNumberListResponse =
            RoutingNumberListResponse(
                checkRequired("data", data).map { it.toImmutable() },
                checkRequired("nextCursor", nextCursor),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): RoutingNumberListResponse = apply {
        if (validated) {
            return@apply
        }

        data().forEach { it.validate() }
        nextCursor()
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
        (data.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (nextCursor.asKnown().isPresent) 1 else 0)

    /** Routing numbers are used to identify your bank in a financial transaction. */
    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val achTransfers: JsonField<AchTransfers>,
        private val fednowTransfers: JsonField<FednowTransfers>,
        private val name: JsonField<String>,
        private val realTimePaymentsTransfers: JsonField<RealTimePaymentsTransfers>,
        private val routingNumber: JsonField<String>,
        private val type: JsonField<Type>,
        private val wireTransfers: JsonField<WireTransfers>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("ach_transfers")
            @ExcludeMissing
            achTransfers: JsonField<AchTransfers> = JsonMissing.of(),
            @JsonProperty("fednow_transfers")
            @ExcludeMissing
            fednowTransfers: JsonField<FednowTransfers> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("real_time_payments_transfers")
            @ExcludeMissing
            realTimePaymentsTransfers: JsonField<RealTimePaymentsTransfers> = JsonMissing.of(),
            @JsonProperty("routing_number")
            @ExcludeMissing
            routingNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            @JsonProperty("wire_transfers")
            @ExcludeMissing
            wireTransfers: JsonField<WireTransfers> = JsonMissing.of(),
        ) : this(
            achTransfers,
            fednowTransfers,
            name,
            realTimePaymentsTransfers,
            routingNumber,
            type,
            wireTransfers,
            mutableMapOf(),
        )

        /**
         * This routing number's support for ACH Transfers.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun achTransfers(): AchTransfers = achTransfers.getRequired("ach_transfers")

        /**
         * This routing number's support for FedNow Transfers.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun fednowTransfers(): FednowTransfers = fednowTransfers.getRequired("fednow_transfers")

        /**
         * The name of the financial institution belonging to a routing number.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * This routing number's support for Real-Time Payments Transfers.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun realTimePaymentsTransfers(): RealTimePaymentsTransfers =
            realTimePaymentsTransfers.getRequired("real_time_payments_transfers")

        /**
         * The nine digit routing number identifier.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun routingNumber(): String = routingNumber.getRequired("routing_number")

        /**
         * A constant representing the object's type. For this resource it will always be
         * `routing_number`.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): Type = type.getRequired("type")

        /**
         * This routing number's support for Wire Transfers.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun wireTransfers(): WireTransfers = wireTransfers.getRequired("wire_transfers")

        /**
         * Returns the raw JSON value of [achTransfers].
         *
         * Unlike [achTransfers], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("ach_transfers")
        @ExcludeMissing
        fun _achTransfers(): JsonField<AchTransfers> = achTransfers

        /**
         * Returns the raw JSON value of [fednowTransfers].
         *
         * Unlike [fednowTransfers], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("fednow_transfers")
        @ExcludeMissing
        fun _fednowTransfers(): JsonField<FednowTransfers> = fednowTransfers

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [realTimePaymentsTransfers].
         *
         * Unlike [realTimePaymentsTransfers], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("real_time_payments_transfers")
        @ExcludeMissing
        fun _realTimePaymentsTransfers(): JsonField<RealTimePaymentsTransfers> =
            realTimePaymentsTransfers

        /**
         * Returns the raw JSON value of [routingNumber].
         *
         * Unlike [routingNumber], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("routing_number")
        @ExcludeMissing
        fun _routingNumber(): JsonField<String> = routingNumber

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        /**
         * Returns the raw JSON value of [wireTransfers].
         *
         * Unlike [wireTransfers], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("wire_transfers")
        @ExcludeMissing
        fun _wireTransfers(): JsonField<WireTransfers> = wireTransfers

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
             * Returns a mutable builder for constructing an instance of [Data].
             *
             * The following fields are required:
             * ```java
             * .achTransfers()
             * .fednowTransfers()
             * .name()
             * .realTimePaymentsTransfers()
             * .routingNumber()
             * .type()
             * .wireTransfers()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var achTransfers: JsonField<AchTransfers>? = null
            private var fednowTransfers: JsonField<FednowTransfers>? = null
            private var name: JsonField<String>? = null
            private var realTimePaymentsTransfers: JsonField<RealTimePaymentsTransfers>? = null
            private var routingNumber: JsonField<String>? = null
            private var type: JsonField<Type>? = null
            private var wireTransfers: JsonField<WireTransfers>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                achTransfers = data.achTransfers
                fednowTransfers = data.fednowTransfers
                name = data.name
                realTimePaymentsTransfers = data.realTimePaymentsTransfers
                routingNumber = data.routingNumber
                type = data.type
                wireTransfers = data.wireTransfers
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** This routing number's support for ACH Transfers. */
            fun achTransfers(achTransfers: AchTransfers) = achTransfers(JsonField.of(achTransfers))

            /**
             * Sets [Builder.achTransfers] to an arbitrary JSON value.
             *
             * You should usually call [Builder.achTransfers] with a well-typed [AchTransfers] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun achTransfers(achTransfers: JsonField<AchTransfers>) = apply {
                this.achTransfers = achTransfers
            }

            /** This routing number's support for FedNow Transfers. */
            fun fednowTransfers(fednowTransfers: FednowTransfers) =
                fednowTransfers(JsonField.of(fednowTransfers))

            /**
             * Sets [Builder.fednowTransfers] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fednowTransfers] with a well-typed [FednowTransfers]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun fednowTransfers(fednowTransfers: JsonField<FednowTransfers>) = apply {
                this.fednowTransfers = fednowTransfers
            }

            /** The name of the financial institution belonging to a routing number. */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** This routing number's support for Real-Time Payments Transfers. */
            fun realTimePaymentsTransfers(realTimePaymentsTransfers: RealTimePaymentsTransfers) =
                realTimePaymentsTransfers(JsonField.of(realTimePaymentsTransfers))

            /**
             * Sets [Builder.realTimePaymentsTransfers] to an arbitrary JSON value.
             *
             * You should usually call [Builder.realTimePaymentsTransfers] with a well-typed
             * [RealTimePaymentsTransfers] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun realTimePaymentsTransfers(
                realTimePaymentsTransfers: JsonField<RealTimePaymentsTransfers>
            ) = apply { this.realTimePaymentsTransfers = realTimePaymentsTransfers }

            /** The nine digit routing number identifier. */
            fun routingNumber(routingNumber: String) = routingNumber(JsonField.of(routingNumber))

            /**
             * Sets [Builder.routingNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.routingNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun routingNumber(routingNumber: JsonField<String>) = apply {
                this.routingNumber = routingNumber
            }

            /**
             * A constant representing the object's type. For this resource it will always be
             * `routing_number`.
             */
            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

            /** This routing number's support for Wire Transfers. */
            fun wireTransfers(wireTransfers: WireTransfers) =
                wireTransfers(JsonField.of(wireTransfers))

            /**
             * Sets [Builder.wireTransfers] to an arbitrary JSON value.
             *
             * You should usually call [Builder.wireTransfers] with a well-typed [WireTransfers]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun wireTransfers(wireTransfers: JsonField<WireTransfers>) = apply {
                this.wireTransfers = wireTransfers
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
             * Returns an immutable instance of [Data].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .achTransfers()
             * .fednowTransfers()
             * .name()
             * .realTimePaymentsTransfers()
             * .routingNumber()
             * .type()
             * .wireTransfers()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Data =
                Data(
                    checkRequired("achTransfers", achTransfers),
                    checkRequired("fednowTransfers", fednowTransfers),
                    checkRequired("name", name),
                    checkRequired("realTimePaymentsTransfers", realTimePaymentsTransfers),
                    checkRequired("routingNumber", routingNumber),
                    checkRequired("type", type),
                    checkRequired("wireTransfers", wireTransfers),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            achTransfers().validate()
            fednowTransfers().validate()
            name()
            realTimePaymentsTransfers().validate()
            routingNumber()
            type().validate()
            wireTransfers().validate()
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
            (achTransfers.asKnown().getOrNull()?.validity() ?: 0) +
                (fednowTransfers.asKnown().getOrNull()?.validity() ?: 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (realTimePaymentsTransfers.asKnown().getOrNull()?.validity() ?: 0) +
                (if (routingNumber.asKnown().isPresent) 1 else 0) +
                (type.asKnown().getOrNull()?.validity() ?: 0) +
                (wireTransfers.asKnown().getOrNull()?.validity() ?: 0)

        /** This routing number's support for ACH Transfers. */
        class AchTransfers @JsonCreator private constructor(private val value: JsonField<String>) :
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

                /** The routing number can receive this transfer type. */
                @JvmField val SUPPORTED = of("supported")

                /** The routing number cannot receive this transfer type. */
                @JvmField val NOT_SUPPORTED = of("not_supported")

                @JvmStatic fun of(value: String) = AchTransfers(JsonField.of(value))
            }

            /** An enum containing [AchTransfers]'s known values. */
            enum class Known {
                /** The routing number can receive this transfer type. */
                SUPPORTED,
                /** The routing number cannot receive this transfer type. */
                NOT_SUPPORTED,
            }

            /**
             * An enum containing [AchTransfers]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [AchTransfers] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                /** The routing number can receive this transfer type. */
                SUPPORTED,
                /** The routing number cannot receive this transfer type. */
                NOT_SUPPORTED,
                /**
                 * An enum member indicating that [AchTransfers] was instantiated with an unknown
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
                    else -> throw IncreaseInvalidDataException("Unknown AchTransfers: $value")
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

            fun validate(): AchTransfers = apply {
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

                return other is AchTransfers && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** This routing number's support for FedNow Transfers. */
        class FednowTransfers
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

                /** The routing number can receive this transfer type. */
                @JvmField val SUPPORTED = of("supported")

                /** The routing number cannot receive this transfer type. */
                @JvmField val NOT_SUPPORTED = of("not_supported")

                @JvmStatic fun of(value: String) = FednowTransfers(JsonField.of(value))
            }

            /** An enum containing [FednowTransfers]'s known values. */
            enum class Known {
                /** The routing number can receive this transfer type. */
                SUPPORTED,
                /** The routing number cannot receive this transfer type. */
                NOT_SUPPORTED,
            }

            /**
             * An enum containing [FednowTransfers]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [FednowTransfers] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                /** The routing number can receive this transfer type. */
                SUPPORTED,
                /** The routing number cannot receive this transfer type. */
                NOT_SUPPORTED,
                /**
                 * An enum member indicating that [FednowTransfers] was instantiated with an unknown
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
                    else -> throw IncreaseInvalidDataException("Unknown FednowTransfers: $value")
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

            fun validate(): FednowTransfers = apply {
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

                return other is FednowTransfers && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** This routing number's support for Real-Time Payments Transfers. */
        class RealTimePaymentsTransfers
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

                /** The routing number can receive this transfer type. */
                @JvmField val SUPPORTED = of("supported")

                /** The routing number cannot receive this transfer type. */
                @JvmField val NOT_SUPPORTED = of("not_supported")

                @JvmStatic fun of(value: String) = RealTimePaymentsTransfers(JsonField.of(value))
            }

            /** An enum containing [RealTimePaymentsTransfers]'s known values. */
            enum class Known {
                /** The routing number can receive this transfer type. */
                SUPPORTED,
                /** The routing number cannot receive this transfer type. */
                NOT_SUPPORTED,
            }

            /**
             * An enum containing [RealTimePaymentsTransfers]'s known values, as well as an
             * [_UNKNOWN] member.
             *
             * An instance of [RealTimePaymentsTransfers] can contain an unknown value in a couple
             * of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                /** The routing number can receive this transfer type. */
                SUPPORTED,
                /** The routing number cannot receive this transfer type. */
                NOT_SUPPORTED,
                /**
                 * An enum member indicating that [RealTimePaymentsTransfers] was instantiated with
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
                            "Unknown RealTimePaymentsTransfers: $value"
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

            fun validate(): RealTimePaymentsTransfers = apply {
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

                return other is RealTimePaymentsTransfers && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `routing_number`.
         */
        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val ROUTING_NUMBER = of("routing_number")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                ROUTING_NUMBER
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                ROUTING_NUMBER,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                    ROUTING_NUMBER -> Value.ROUTING_NUMBER
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
                    ROUTING_NUMBER -> Known.ROUTING_NUMBER
                    else -> throw IncreaseInvalidDataException("Unknown Type: $value")
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

        /** This routing number's support for Wire Transfers. */
        class WireTransfers @JsonCreator private constructor(private val value: JsonField<String>) :
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

                /** The routing number can receive this transfer type. */
                @JvmField val SUPPORTED = of("supported")

                /** The routing number cannot receive this transfer type. */
                @JvmField val NOT_SUPPORTED = of("not_supported")

                @JvmStatic fun of(value: String) = WireTransfers(JsonField.of(value))
            }

            /** An enum containing [WireTransfers]'s known values. */
            enum class Known {
                /** The routing number can receive this transfer type. */
                SUPPORTED,
                /** The routing number cannot receive this transfer type. */
                NOT_SUPPORTED,
            }

            /**
             * An enum containing [WireTransfers]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [WireTransfers] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                /** The routing number can receive this transfer type. */
                SUPPORTED,
                /** The routing number cannot receive this transfer type. */
                NOT_SUPPORTED,
                /**
                 * An enum member indicating that [WireTransfers] was instantiated with an unknown
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
                    else -> throw IncreaseInvalidDataException("Unknown WireTransfers: $value")
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

            fun validate(): WireTransfers = apply {
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

                return other is WireTransfers && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                achTransfers == other.achTransfers &&
                fednowTransfers == other.fednowTransfers &&
                name == other.name &&
                realTimePaymentsTransfers == other.realTimePaymentsTransfers &&
                routingNumber == other.routingNumber &&
                type == other.type &&
                wireTransfers == other.wireTransfers &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                achTransfers,
                fednowTransfers,
                name,
                realTimePaymentsTransfers,
                routingNumber,
                type,
                wireTransfers,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{achTransfers=$achTransfers, fednowTransfers=$fednowTransfers, name=$name, realTimePaymentsTransfers=$realTimePaymentsTransfers, routingNumber=$routingNumber, type=$type, wireTransfers=$wireTransfers, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RoutingNumberListResponse &&
            data == other.data &&
            nextCursor == other.nextCursor &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, nextCursor, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RoutingNumberListResponse{data=$data, nextCursor=$nextCursor, additionalProperties=$additionalProperties}"
}
