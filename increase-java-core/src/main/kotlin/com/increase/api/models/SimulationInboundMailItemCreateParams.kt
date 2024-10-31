// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.toImmutable
import com.increase.api.models.*
import java.util.Objects
import java.util.Optional

class SimulationInboundMailItemCreateParams
constructor(
    private val amount: Long,
    private val lockboxId: String,
    private val contentsFileId: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun amount(): Long = amount

    fun lockboxId(): String = lockboxId

    fun contentsFileId(): Optional<String> = Optional.ofNullable(contentsFileId)

    @JvmSynthetic
    internal fun getBody(): SimulationInboundMailItemCreateBody {
        return SimulationInboundMailItemCreateBody(
            amount,
            lockboxId,
            contentsFileId,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = SimulationInboundMailItemCreateBody.Builder::class)
    @NoAutoDetect
    class SimulationInboundMailItemCreateBody
    internal constructor(
        private val amount: Long?,
        private val lockboxId: String?,
        private val contentsFileId: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The amount of the check to be simulated, in cents. */
        @JsonProperty("amount") fun amount(): Long? = amount

        /** The identifier of the Lockbox to simulate inbound mail to. */
        @JsonProperty("lockbox_id") fun lockboxId(): String? = lockboxId

        /**
         * The file containing the PDF contents. If not present, a default check image file will be
         * used.
         */
        @JsonProperty("contents_file_id") fun contentsFileId(): String? = contentsFileId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var amount: Long? = null
            private var lockboxId: String? = null
            private var contentsFileId: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                simulationInboundMailItemCreateBody: SimulationInboundMailItemCreateBody
            ) = apply {
                this.amount = simulationInboundMailItemCreateBody.amount
                this.lockboxId = simulationInboundMailItemCreateBody.lockboxId
                this.contentsFileId = simulationInboundMailItemCreateBody.contentsFileId
                additionalProperties(simulationInboundMailItemCreateBody.additionalProperties)
            }

            /** The amount of the check to be simulated, in cents. */
            @JsonProperty("amount") fun amount(amount: Long) = apply { this.amount = amount }

            /** The identifier of the Lockbox to simulate inbound mail to. */
            @JsonProperty("lockbox_id")
            fun lockboxId(lockboxId: String) = apply { this.lockboxId = lockboxId }

            /**
             * The file containing the PDF contents. If not present, a default check image file will
             * be used.
             */
            @JsonProperty("contents_file_id")
            fun contentsFileId(contentsFileId: String) = apply {
                this.contentsFileId = contentsFileId
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

            fun build(): SimulationInboundMailItemCreateBody =
                SimulationInboundMailItemCreateBody(
                    checkNotNull(amount) { "`amount` is required but was not set" },
                    checkNotNull(lockboxId) { "`lockboxId` is required but was not set" },
                    contentsFileId,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is SimulationInboundMailItemCreateBody && this.amount == other.amount && this.lockboxId == other.lockboxId && this.contentsFileId == other.contentsFileId && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(amount, lockboxId, contentsFileId, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "SimulationInboundMailItemCreateBody{amount=$amount, lockboxId=$lockboxId, contentsFileId=$contentsFileId, additionalProperties=$additionalProperties}"
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SimulationInboundMailItemCreateParams && this.amount == other.amount && this.lockboxId == other.lockboxId && this.contentsFileId == other.contentsFileId && this.additionalQueryParams == other.additionalQueryParams && this.additionalHeaders == other.additionalHeaders && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(amount, lockboxId, contentsFileId, additionalQueryParams, additionalHeaders, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "SimulationInboundMailItemCreateParams{amount=$amount, lockboxId=$lockboxId, contentsFileId=$contentsFileId, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var amount: Long? = null
        private var lockboxId: String? = null
        private var contentsFileId: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            simulationInboundMailItemCreateParams: SimulationInboundMailItemCreateParams
        ) = apply {
            this.amount = simulationInboundMailItemCreateParams.amount
            this.lockboxId = simulationInboundMailItemCreateParams.lockboxId
            this.contentsFileId = simulationInboundMailItemCreateParams.contentsFileId
            additionalQueryParams(simulationInboundMailItemCreateParams.additionalQueryParams)
            additionalHeaders(simulationInboundMailItemCreateParams.additionalHeaders)
            additionalBodyProperties(simulationInboundMailItemCreateParams.additionalBodyProperties)
        }

        /** The amount of the check to be simulated, in cents. */
        fun amount(amount: Long) = apply { this.amount = amount }

        /** The identifier of the Lockbox to simulate inbound mail to. */
        fun lockboxId(lockboxId: String) = apply { this.lockboxId = lockboxId }

        /**
         * The file containing the PDF contents. If not present, a default check image file will be
         * used.
         */
        fun contentsFileId(contentsFileId: String) = apply { this.contentsFileId = contentsFileId }

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

        fun build(): SimulationInboundMailItemCreateParams =
            SimulationInboundMailItemCreateParams(
                checkNotNull(amount) { "`amount` is required but was not set" },
                checkNotNull(lockboxId) { "`lockboxId` is required but was not set" },
                contentsFileId,
                additionalQueryParams.mapValues { it.value.toImmutable() }.toImmutable(),
                additionalHeaders.mapValues { it.value.toImmutable() }.toImmutable(),
                additionalBodyProperties.toImmutable(),
            )
    }
}
