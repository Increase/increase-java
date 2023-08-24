package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.toUnmodifiable
import com.increase.api.errors.IncreaseInvalidDataException
import java.util.Objects

/** Routing numbers are used to identify your bank in a financial transaction. */
@JsonDeserialize(builder = RoutingNumber.Builder::class)
@NoAutoDetect
class RoutingNumber
private constructor(
    private val name: JsonField<String>,
    private val routingNumber: JsonField<String>,
    private val type: JsonField<Type>,
    private val achTransfers: JsonField<AchTransfers>,
    private val realTimePaymentsTransfers: JsonField<RealTimePaymentsTransfers>,
    private val wireTransfers: JsonField<WireTransfers>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** The name of the financial institution belonging to a routing number. */
    fun name(): String = name.getRequired("name")

    /** The nine digit routing number identifier. */
    fun routingNumber(): String = routingNumber.getRequired("routing_number")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `routing_number`.
     */
    fun type(): Type = type.getRequired("type")

    /** This routing number's support for ACH Transfers. */
    fun achTransfers(): AchTransfers = achTransfers.getRequired("ach_transfers")

    /** This routing number's support for Real-Time Payments Transfers. */
    fun realTimePaymentsTransfers(): RealTimePaymentsTransfers =
        realTimePaymentsTransfers.getRequired("real_time_payments_transfers")

    /** This routing number's support for Wire Transfers. */
    fun wireTransfers(): WireTransfers = wireTransfers.getRequired("wire_transfers")

    /** The name of the financial institution belonging to a routing number. */
    @JsonProperty("name") @ExcludeMissing fun _name() = name

    /** The nine digit routing number identifier. */
    @JsonProperty("routing_number") @ExcludeMissing fun _routingNumber() = routingNumber

    /**
     * A constant representing the object's type. For this resource it will always be
     * `routing_number`.
     */
    @JsonProperty("type") @ExcludeMissing fun _type() = type

    /** This routing number's support for ACH Transfers. */
    @JsonProperty("ach_transfers") @ExcludeMissing fun _achTransfers() = achTransfers

    /** This routing number's support for Real-Time Payments Transfers. */
    @JsonProperty("real_time_payments_transfers")
    @ExcludeMissing
    fun _realTimePaymentsTransfers() = realTimePaymentsTransfers

    /** This routing number's support for Wire Transfers. */
    @JsonProperty("wire_transfers") @ExcludeMissing fun _wireTransfers() = wireTransfers

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): RoutingNumber = apply {
        if (!validated) {
            name()
            routingNumber()
            type()
            achTransfers()
            realTimePaymentsTransfers()
            wireTransfers()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RoutingNumber &&
            this.name == other.name &&
            this.routingNumber == other.routingNumber &&
            this.type == other.type &&
            this.achTransfers == other.achTransfers &&
            this.realTimePaymentsTransfers == other.realTimePaymentsTransfers &&
            this.wireTransfers == other.wireTransfers &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    name,
                    routingNumber,
                    type,
                    achTransfers,
                    realTimePaymentsTransfers,
                    wireTransfers,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "RoutingNumber{name=$name, routingNumber=$routingNumber, type=$type, achTransfers=$achTransfers, realTimePaymentsTransfers=$realTimePaymentsTransfers, wireTransfers=$wireTransfers, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var name: JsonField<String> = JsonMissing.of()
        private var routingNumber: JsonField<String> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var achTransfers: JsonField<AchTransfers> = JsonMissing.of()
        private var realTimePaymentsTransfers: JsonField<RealTimePaymentsTransfers> =
            JsonMissing.of()
        private var wireTransfers: JsonField<WireTransfers> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(routingNumber: RoutingNumber) = apply {
            this.name = routingNumber.name
            this.routingNumber = routingNumber.routingNumber
            this.type = routingNumber.type
            this.achTransfers = routingNumber.achTransfers
            this.realTimePaymentsTransfers = routingNumber.realTimePaymentsTransfers
            this.wireTransfers = routingNumber.wireTransfers
            additionalProperties(routingNumber.additionalProperties)
        }

        /** The name of the financial institution belonging to a routing number. */
        fun name(name: String) = name(JsonField.of(name))

        /** The name of the financial institution belonging to a routing number. */
        @JsonProperty("name")
        @ExcludeMissing
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** The nine digit routing number identifier. */
        fun routingNumber(routingNumber: String) = routingNumber(JsonField.of(routingNumber))

        /** The nine digit routing number identifier. */
        @JsonProperty("routing_number")
        @ExcludeMissing
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
        @JsonProperty("type")
        @ExcludeMissing
        fun type(type: JsonField<Type>) = apply { this.type = type }

        /** This routing number's support for ACH Transfers. */
        fun achTransfers(achTransfers: AchTransfers) = achTransfers(JsonField.of(achTransfers))

        /** This routing number's support for ACH Transfers. */
        @JsonProperty("ach_transfers")
        @ExcludeMissing
        fun achTransfers(achTransfers: JsonField<AchTransfers>) = apply {
            this.achTransfers = achTransfers
        }

        /** This routing number's support for Real-Time Payments Transfers. */
        fun realTimePaymentsTransfers(realTimePaymentsTransfers: RealTimePaymentsTransfers) =
            realTimePaymentsTransfers(JsonField.of(realTimePaymentsTransfers))

        /** This routing number's support for Real-Time Payments Transfers. */
        @JsonProperty("real_time_payments_transfers")
        @ExcludeMissing
        fun realTimePaymentsTransfers(
            realTimePaymentsTransfers: JsonField<RealTimePaymentsTransfers>
        ) = apply { this.realTimePaymentsTransfers = realTimePaymentsTransfers }

        /** This routing number's support for Wire Transfers. */
        fun wireTransfers(wireTransfers: WireTransfers) = wireTransfers(JsonField.of(wireTransfers))

        /** This routing number's support for Wire Transfers. */
        @JsonProperty("wire_transfers")
        @ExcludeMissing
        fun wireTransfers(wireTransfers: JsonField<WireTransfers>) = apply {
            this.wireTransfers = wireTransfers
        }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            this.additionalProperties.putAll(additionalProperties)
        }

        @JsonAnySetter
        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            this.additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun build(): RoutingNumber =
            RoutingNumber(
                name,
                routingNumber,
                type,
                achTransfers,
                realTimePaymentsTransfers,
                wireTransfers,
                additionalProperties.toUnmodifiable(),
            )
    }

    class AchTransfers
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AchTransfers && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val SUPPORTED = AchTransfers(JsonField.of("supported"))

            @JvmField val NOT_SUPPORTED = AchTransfers(JsonField.of("not_supported"))

            @JvmStatic fun of(value: String) = AchTransfers(JsonField.of(value))
        }

        enum class Known {
            SUPPORTED,
            NOT_SUPPORTED,
        }

        enum class Value {
            SUPPORTED,
            NOT_SUPPORTED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                SUPPORTED -> Value.SUPPORTED
                NOT_SUPPORTED -> Value.NOT_SUPPORTED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                SUPPORTED -> Known.SUPPORTED
                NOT_SUPPORTED -> Known.NOT_SUPPORTED
                else -> throw IncreaseInvalidDataException("Unknown AchTransfers: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    class RealTimePaymentsTransfers
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is RealTimePaymentsTransfers && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val SUPPORTED = RealTimePaymentsTransfers(JsonField.of("supported"))

            @JvmField val NOT_SUPPORTED = RealTimePaymentsTransfers(JsonField.of("not_supported"))

            @JvmStatic fun of(value: String) = RealTimePaymentsTransfers(JsonField.of(value))
        }

        enum class Known {
            SUPPORTED,
            NOT_SUPPORTED,
        }

        enum class Value {
            SUPPORTED,
            NOT_SUPPORTED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                SUPPORTED -> Value.SUPPORTED
                NOT_SUPPORTED -> Value.NOT_SUPPORTED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                SUPPORTED -> Known.SUPPORTED
                NOT_SUPPORTED -> Known.NOT_SUPPORTED
                else ->
                    throw IncreaseInvalidDataException("Unknown RealTimePaymentsTransfers: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Type && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val ROUTING_NUMBER = Type(JsonField.of("routing_number"))

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            ROUTING_NUMBER,
        }

        enum class Value {
            ROUTING_NUMBER,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ROUTING_NUMBER -> Value.ROUTING_NUMBER
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ROUTING_NUMBER -> Known.ROUTING_NUMBER
                else -> throw IncreaseInvalidDataException("Unknown Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    class WireTransfers
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is WireTransfers && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val SUPPORTED = WireTransfers(JsonField.of("supported"))

            @JvmField val NOT_SUPPORTED = WireTransfers(JsonField.of("not_supported"))

            @JvmStatic fun of(value: String) = WireTransfers(JsonField.of(value))
        }

        enum class Known {
            SUPPORTED,
            NOT_SUPPORTED,
        }

        enum class Value {
            SUPPORTED,
            NOT_SUPPORTED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                SUPPORTED -> Value.SUPPORTED
                NOT_SUPPORTED -> Value.NOT_SUPPORTED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                SUPPORTED -> Known.SUPPORTED
                NOT_SUPPORTED -> Known.NOT_SUPPORTED
                else -> throw IncreaseInvalidDataException("Unknown WireTransfers: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
