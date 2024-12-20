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
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import com.increase.api.core.toImmutable
import com.increase.api.errors.IncreaseInvalidDataException
import java.util.Objects

class SimulationPhysicalCardAdvanceShipmentParams
constructor(
    private val physicalCardId: String,
    private val shipmentStatus: ShipmentStatus,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun physicalCardId(): String = physicalCardId

    fun shipmentStatus(): ShipmentStatus = shipmentStatus

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    @JvmSynthetic
    internal fun getBody(): SimulationPhysicalCardAdvanceShipmentBody {
        return SimulationPhysicalCardAdvanceShipmentBody(shipmentStatus, additionalBodyProperties)
    }

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> physicalCardId
            else -> ""
        }
    }

    @JsonDeserialize(builder = SimulationPhysicalCardAdvanceShipmentBody.Builder::class)
    @NoAutoDetect
    class SimulationPhysicalCardAdvanceShipmentBody
    internal constructor(
        private val shipmentStatus: ShipmentStatus,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The shipment status to move the Physical Card to. */
        @JsonProperty("shipment_status") fun shipmentStatus(): ShipmentStatus = shipmentStatus

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var shipmentStatus: ShipmentStatus? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                simulationPhysicalCardAdvanceShipmentBody: SimulationPhysicalCardAdvanceShipmentBody
            ) = apply {
                shipmentStatus = simulationPhysicalCardAdvanceShipmentBody.shipmentStatus
                additionalProperties =
                    simulationPhysicalCardAdvanceShipmentBody.additionalProperties.toMutableMap()
            }

            /** The shipment status to move the Physical Card to. */
            @JsonProperty("shipment_status")
            fun shipmentStatus(shipmentStatus: ShipmentStatus) = apply {
                this.shipmentStatus = shipmentStatus
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            @JsonAnySetter
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

            fun build(): SimulationPhysicalCardAdvanceShipmentBody =
                SimulationPhysicalCardAdvanceShipmentBody(
                    checkNotNull(shipmentStatus) { "`shipmentStatus` is required but was not set" },
                    additionalProperties.toImmutable()
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is SimulationPhysicalCardAdvanceShipmentBody && shipmentStatus == other.shipmentStatus && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(shipmentStatus, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SimulationPhysicalCardAdvanceShipmentBody{shipmentStatus=$shipmentStatus, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var physicalCardId: String? = null
        private var shipmentStatus: ShipmentStatus? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            simulationPhysicalCardAdvanceShipmentParams: SimulationPhysicalCardAdvanceShipmentParams
        ) = apply {
            physicalCardId = simulationPhysicalCardAdvanceShipmentParams.physicalCardId
            shipmentStatus = simulationPhysicalCardAdvanceShipmentParams.shipmentStatus
            additionalHeaders =
                simulationPhysicalCardAdvanceShipmentParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                simulationPhysicalCardAdvanceShipmentParams.additionalQueryParams.toBuilder()
            additionalBodyProperties =
                simulationPhysicalCardAdvanceShipmentParams.additionalBodyProperties.toMutableMap()
        }

        /** The Physical Card you would like to action. */
        fun physicalCardId(physicalCardId: String) = apply { this.physicalCardId = physicalCardId }

        /** The shipment status to move the Physical Card to. */
        fun shipmentStatus(shipmentStatus: ShipmentStatus) = apply {
            this.shipmentStatus = shipmentStatus
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

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            putAllAdditionalBodyProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply {
            additionalBodyProperties.remove(key)
        }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalBodyProperty)
        }

        fun build(): SimulationPhysicalCardAdvanceShipmentParams =
            SimulationPhysicalCardAdvanceShipmentParams(
                checkNotNull(physicalCardId) { "`physicalCardId` is required but was not set" },
                checkNotNull(shipmentStatus) { "`shipmentStatus` is required but was not set" },
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    class ShipmentStatus
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val PENDING = of("pending")

            @JvmField val CANCELED = of("canceled")

            @JvmField val SUBMITTED = of("submitted")

            @JvmField val ACKNOWLEDGED = of("acknowledged")

            @JvmField val REJECTED = of("rejected")

            @JvmField val SHIPPED = of("shipped")

            @JvmField val RETURNED = of("returned")

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ShipmentStatus && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SimulationPhysicalCardAdvanceShipmentParams && physicalCardId == other.physicalCardId && shipmentStatus == other.shipmentStatus && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(physicalCardId, shipmentStatus, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "SimulationPhysicalCardAdvanceShipmentParams{physicalCardId=$physicalCardId, shipmentStatus=$shipmentStatus, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}
