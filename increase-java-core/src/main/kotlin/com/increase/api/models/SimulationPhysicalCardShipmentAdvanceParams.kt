// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.increase.api.core.Enum
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.toUnmodifiable
import com.increase.api.errors.IncreaseInvalidDataException
import com.increase.api.models.*
import java.util.Objects

class SimulationPhysicalCardShipmentAdvanceParams
constructor(
    private val physicalCardId: String,
    private val shipmentStatus: ShipmentStatus,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun physicalCardId(): String = physicalCardId

    fun shipmentStatus(): ShipmentStatus = shipmentStatus

    @JvmSynthetic
    internal fun getBody(): SimulationPhysicalCardShipmentAdvanceBody {
        return SimulationPhysicalCardShipmentAdvanceBody(shipmentStatus, additionalBodyProperties)
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> physicalCardId
            else -> ""
        }
    }

    @JsonDeserialize(builder = SimulationPhysicalCardShipmentAdvanceBody.Builder::class)
    @NoAutoDetect
    class SimulationPhysicalCardShipmentAdvanceBody
    internal constructor(
        private val shipmentStatus: ShipmentStatus?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** The shipment status to move the Physical Card to. */
        @JsonProperty("shipment_status") fun shipmentStatus(): ShipmentStatus? = shipmentStatus

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is SimulationPhysicalCardShipmentAdvanceBody &&
                this.shipmentStatus == other.shipmentStatus &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = Objects.hash(shipmentStatus, additionalProperties)
            }
            return hashCode
        }

        override fun toString() =
            "SimulationPhysicalCardShipmentAdvanceBody{shipmentStatus=$shipmentStatus, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var shipmentStatus: ShipmentStatus? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                simulationPhysicalCardShipmentAdvanceBody: SimulationPhysicalCardShipmentAdvanceBody
            ) = apply {
                this.shipmentStatus = simulationPhysicalCardShipmentAdvanceBody.shipmentStatus
                additionalProperties(simulationPhysicalCardShipmentAdvanceBody.additionalProperties)
            }

            /** The shipment status to move the Physical Card to. */
            @JsonProperty("shipment_status")
            fun shipmentStatus(shipmentStatus: ShipmentStatus) = apply {
                this.shipmentStatus = shipmentStatus
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

            fun build(): SimulationPhysicalCardShipmentAdvanceBody =
                SimulationPhysicalCardShipmentAdvanceBody(
                    checkNotNull(shipmentStatus) { "`shipmentStatus` is required but was not set" },
                    additionalProperties.toUnmodifiable()
                )
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SimulationPhysicalCardShipmentAdvanceParams &&
            this.physicalCardId == other.physicalCardId &&
            this.shipmentStatus == other.shipmentStatus &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            physicalCardId,
            shipmentStatus,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "SimulationPhysicalCardShipmentAdvanceParams{physicalCardId=$physicalCardId, shipmentStatus=$shipmentStatus, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var physicalCardId: String? = null
        private var shipmentStatus: ShipmentStatus? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            simulationPhysicalCardShipmentAdvanceParams: SimulationPhysicalCardShipmentAdvanceParams
        ) = apply {
            this.physicalCardId = simulationPhysicalCardShipmentAdvanceParams.physicalCardId
            this.shipmentStatus = simulationPhysicalCardShipmentAdvanceParams.shipmentStatus
            additionalQueryParams(simulationPhysicalCardShipmentAdvanceParams.additionalQueryParams)
            additionalHeaders(simulationPhysicalCardShipmentAdvanceParams.additionalHeaders)
            additionalBodyProperties(
                simulationPhysicalCardShipmentAdvanceParams.additionalBodyProperties
            )
        }

        /** The Physical Card you would like to action. */
        fun physicalCardId(physicalCardId: String) = apply { this.physicalCardId = physicalCardId }

        /** The shipment status to move the Physical Card to. */
        fun shipmentStatus(shipmentStatus: ShipmentStatus) = apply {
            this.shipmentStatus = shipmentStatus
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun build(): SimulationPhysicalCardShipmentAdvanceParams =
            SimulationPhysicalCardShipmentAdvanceParams(
                checkNotNull(physicalCardId) { "`physicalCardId` is required but was not set" },
                checkNotNull(shipmentStatus) { "`shipmentStatus` is required but was not set" },
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    class ShipmentStatus
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ShipmentStatus && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val PENDING = ShipmentStatus(JsonField.of("pending"))

            @JvmField val CANCELED = ShipmentStatus(JsonField.of("canceled"))

            @JvmField val SUBMITTED = ShipmentStatus(JsonField.of("submitted"))

            @JvmField val ACKNOWLEDGED = ShipmentStatus(JsonField.of("acknowledged"))

            @JvmField val REJECTED = ShipmentStatus(JsonField.of("rejected"))

            @JvmField val SHIPPED = ShipmentStatus(JsonField.of("shipped"))

            @JvmField val RETURNED = ShipmentStatus(JsonField.of("returned"))

            @JvmStatic fun of(value: String) = ShipmentStatus(JsonField.of(value))
        }

        enum class Known {
            PENDING,
            CANCELED,
            SUBMITTED,
            ACKNOWLEDGED,
            REJECTED,
            SHIPPED,
            RETURNED,
        }

        enum class Value {
            PENDING,
            CANCELED,
            SUBMITTED,
            ACKNOWLEDGED,
            REJECTED,
            SHIPPED,
            RETURNED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                PENDING -> Value.PENDING
                CANCELED -> Value.CANCELED
                SUBMITTED -> Value.SUBMITTED
                ACKNOWLEDGED -> Value.ACKNOWLEDGED
                REJECTED -> Value.REJECTED
                SHIPPED -> Value.SHIPPED
                RETURNED -> Value.RETURNED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                PENDING -> Known.PENDING
                CANCELED -> Known.CANCELED
                SUBMITTED -> Known.SUBMITTED
                ACKNOWLEDGED -> Known.ACKNOWLEDGED
                REJECTED -> Known.REJECTED
                SHIPPED -> Known.SHIPPED
                RETURNED -> Known.RETURNED
                else -> throw IncreaseInvalidDataException("Unknown ShipmentStatus: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
