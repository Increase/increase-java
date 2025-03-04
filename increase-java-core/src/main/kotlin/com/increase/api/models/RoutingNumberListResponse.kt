// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.increase.api.core.Enum
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.checkRequired
import com.increase.api.core.immutableEmptyMap
import com.increase.api.core.toImmutable
import com.increase.api.errors.IncreaseInvalidDataException
import java.util.Objects

/** Routing numbers are used to identify your bank in a financial transaction. */
@NoAutoDetect
class RoutingNumberListResponse
@JsonCreator
private constructor(
    @JsonProperty("ach_transfers")
    @ExcludeMissing
    private val achTransfers: JsonField<AchTransfers> = JsonMissing.of(),
    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
    @JsonProperty("real_time_payments_transfers")
    @ExcludeMissing
    private val realTimePaymentsTransfers: JsonField<RealTimePaymentsTransfers> = JsonMissing.of(),
    @JsonProperty("routing_number")
    @ExcludeMissing
    private val routingNumber: JsonField<String> = JsonMissing.of(),
    @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
    @JsonProperty("wire_transfers")
    @ExcludeMissing
    private val wireTransfers: JsonField<WireTransfers> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** This routing number's support for ACH Transfers. */
    fun achTransfers(): AchTransfers = achTransfers.getRequired("ach_transfers")

    /** The name of the financial institution belonging to a routing number. */
    fun name(): String = name.getRequired("name")

    /** This routing number's support for Real-Time Payments Transfers. */
    fun realTimePaymentsTransfers(): RealTimePaymentsTransfers =
        realTimePaymentsTransfers.getRequired("real_time_payments_transfers")

    /** The nine digit routing number identifier. */
    fun routingNumber(): String = routingNumber.getRequired("routing_number")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `routing_number`.
     */
    fun type(): Type = type.getRequired("type")

    /** This routing number's support for Wire Transfers. */
    fun wireTransfers(): WireTransfers = wireTransfers.getRequired("wire_transfers")

    /** This routing number's support for ACH Transfers. */
    @JsonProperty("ach_transfers")
    @ExcludeMissing
    fun _achTransfers(): JsonField<AchTransfers> = achTransfers

    /** The name of the financial institution belonging to a routing number. */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /** This routing number's support for Real-Time Payments Transfers. */
    @JsonProperty("real_time_payments_transfers")
    @ExcludeMissing
    fun _realTimePaymentsTransfers(): JsonField<RealTimePaymentsTransfers> =
        realTimePaymentsTransfers

    /** The nine digit routing number identifier. */
    @JsonProperty("routing_number")
    @ExcludeMissing
    fun _routingNumber(): JsonField<String> = routingNumber

    /**
     * A constant representing the object's type. For this resource it will always be
     * `routing_number`.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    /** This routing number's support for Wire Transfers. */
    @JsonProperty("wire_transfers")
    @ExcludeMissing
    fun _wireTransfers(): JsonField<WireTransfers> = wireTransfers

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): RoutingNumberListResponse = apply {
        if (validated) {
            return@apply
        }

        achTransfers()
        name()
        realTimePaymentsTransfers()
        routingNumber()
        type()
        wireTransfers()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [RoutingNumberListResponse].
         *
         * The following fields are required:
         * ```java
         * .achTransfers()
         * .name()
         * .realTimePaymentsTransfers()
         * .routingNumber()
         * .type()
         * .wireTransfers()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RoutingNumberListResponse]. */
    class Builder internal constructor() {

        private var achTransfers: JsonField<AchTransfers>? = null
        private var name: JsonField<String>? = null
        private var realTimePaymentsTransfers: JsonField<RealTimePaymentsTransfers>? = null
        private var routingNumber: JsonField<String>? = null
        private var type: JsonField<Type>? = null
        private var wireTransfers: JsonField<WireTransfers>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(routingNumberListResponse: RoutingNumberListResponse) = apply {
            achTransfers = routingNumberListResponse.achTransfers
            name = routingNumberListResponse.name
            realTimePaymentsTransfers = routingNumberListResponse.realTimePaymentsTransfers
            routingNumber = routingNumberListResponse.routingNumber
            type = routingNumberListResponse.type
            wireTransfers = routingNumberListResponse.wireTransfers
            additionalProperties = routingNumberListResponse.additionalProperties.toMutableMap()
        }

        /** This routing number's support for ACH Transfers. */
        fun achTransfers(achTransfers: AchTransfers) = achTransfers(JsonField.of(achTransfers))

        /** This routing number's support for ACH Transfers. */
        fun achTransfers(achTransfers: JsonField<AchTransfers>) = apply {
            this.achTransfers = achTransfers
        }

        /** The name of the financial institution belonging to a routing number. */
        fun name(name: String) = name(JsonField.of(name))

        /** The name of the financial institution belonging to a routing number. */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** This routing number's support for Real-Time Payments Transfers. */
        fun realTimePaymentsTransfers(realTimePaymentsTransfers: RealTimePaymentsTransfers) =
            realTimePaymentsTransfers(JsonField.of(realTimePaymentsTransfers))

        /** This routing number's support for Real-Time Payments Transfers. */
        fun realTimePaymentsTransfers(
            realTimePaymentsTransfers: JsonField<RealTimePaymentsTransfers>
        ) = apply { this.realTimePaymentsTransfers = realTimePaymentsTransfers }

        /** The nine digit routing number identifier. */
        fun routingNumber(routingNumber: String) = routingNumber(JsonField.of(routingNumber))

        /** The nine digit routing number identifier. */
        fun routingNumber(routingNumber: JsonField<String>) = apply {
            this.routingNumber = routingNumber
        }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `routing_number`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * A constant representing the object's type. For this resource it will always be
         * `routing_number`.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        /** This routing number's support for Wire Transfers. */
        fun wireTransfers(wireTransfers: WireTransfers) = wireTransfers(JsonField.of(wireTransfers))

        /** This routing number's support for Wire Transfers. */
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

        fun build(): RoutingNumberListResponse =
            RoutingNumberListResponse(
                checkRequired("achTransfers", achTransfers),
                checkRequired("name", name),
                checkRequired("realTimePaymentsTransfers", realTimePaymentsTransfers),
                checkRequired("routingNumber", routingNumber),
                checkRequired("type", type),
                checkRequired("wireTransfers", wireTransfers),
                additionalProperties.toImmutable(),
            )
    }

    /** This routing number's support for ACH Transfers. */
    class AchTransfers @JsonCreator private constructor(private val value: JsonField<String>) :
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
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            /** The routing number can receive this transfer type. */
            SUPPORTED,
            /** The routing number cannot receive this transfer type. */
            NOT_SUPPORTED,
            /**
             * An enum member indicating that [AchTransfers] was instantiated with an unknown value.
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
                SUPPORTED -> Value.SUPPORTED
                NOT_SUPPORTED -> Value.NOT_SUPPORTED
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
                SUPPORTED -> Known.SUPPORTED
                NOT_SUPPORTED -> Known.NOT_SUPPORTED
                else -> throw IncreaseInvalidDataException("Unknown AchTransfers: $value")
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AchTransfers && value == other.value /* spotless:on */
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
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
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
         * An enum containing [RealTimePaymentsTransfers]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [RealTimePaymentsTransfers] can contain an unknown value in a couple of
         * cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            /** The routing number can receive this transfer type. */
            SUPPORTED,
            /** The routing number cannot receive this transfer type. */
            NOT_SUPPORTED,
            /**
             * An enum member indicating that [RealTimePaymentsTransfers] was instantiated with an
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
                SUPPORTED -> Value.SUPPORTED
                NOT_SUPPORTED -> Value.NOT_SUPPORTED
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
                SUPPORTED -> Known.SUPPORTED
                NOT_SUPPORTED -> Known.NOT_SUPPORTED
                else ->
                    throw IncreaseInvalidDataException("Unknown RealTimePaymentsTransfers: $value")
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is RealTimePaymentsTransfers && value == other.value /* spotless:on */
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
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
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
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ROUTING_NUMBER,
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
                ROUTING_NUMBER -> Value.ROUTING_NUMBER
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
                ROUTING_NUMBER -> Known.ROUTING_NUMBER
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Type && value == other.value /* spotless:on */
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
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
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
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
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
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
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
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is WireTransfers && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is RoutingNumberListResponse && achTransfers == other.achTransfers && name == other.name && realTimePaymentsTransfers == other.realTimePaymentsTransfers && routingNumber == other.routingNumber && type == other.type && wireTransfers == other.wireTransfers && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(achTransfers, name, realTimePaymentsTransfers, routingNumber, type, wireTransfers, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RoutingNumberListResponse{achTransfers=$achTransfers, name=$name, realTimePaymentsTransfers=$realTimePaymentsTransfers, routingNumber=$routingNumber, type=$type, wireTransfers=$wireTransfers, additionalProperties=$additionalProperties}"
}
