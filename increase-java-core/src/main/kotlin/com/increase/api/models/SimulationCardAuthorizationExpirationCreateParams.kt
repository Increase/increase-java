// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.toUnmodifiable
import com.increase.api.models.*
import java.util.Objects

class SimulationCardAuthorizationExpirationCreateParams
constructor(
    private val cardPaymentId: String,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun cardPaymentId(): String = cardPaymentId

    @JvmSynthetic
    internal fun getBody(): SimulationCardAuthorizationExpirationCreateBody {
        return SimulationCardAuthorizationExpirationCreateBody(
            cardPaymentId,
            additionalBodyProperties
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = SimulationCardAuthorizationExpirationCreateBody.Builder::class)
    @NoAutoDetect
    class SimulationCardAuthorizationExpirationCreateBody
    internal constructor(
        private val cardPaymentId: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The identifier of the Card Payment to expire. */
        @JsonProperty("card_payment_id") fun cardPaymentId(): String? = cardPaymentId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var cardPaymentId: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                simulationCardAuthorizationExpirationCreateBody:
                    SimulationCardAuthorizationExpirationCreateBody
            ) = apply {
                this.cardPaymentId = simulationCardAuthorizationExpirationCreateBody.cardPaymentId
                additionalProperties(
                    simulationCardAuthorizationExpirationCreateBody.additionalProperties
                )
            }

            /** The identifier of the Card Payment to expire. */
            @JsonProperty("card_payment_id")
            fun cardPaymentId(cardPaymentId: String) = apply { this.cardPaymentId = cardPaymentId }

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

            fun build(): SimulationCardAuthorizationExpirationCreateBody =
                SimulationCardAuthorizationExpirationCreateBody(
                    checkNotNull(cardPaymentId) { "`cardPaymentId` is required but was not set" },
                    additionalProperties.toUnmodifiable()
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is SimulationCardAuthorizationExpirationCreateBody &&
                this.cardPaymentId == other.cardPaymentId &&
                this.additionalProperties == other.additionalProperties
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = Objects.hash(cardPaymentId, additionalProperties)
            }
            return hashCode
        }

        override fun toString() =
            "SimulationCardAuthorizationExpirationCreateBody{cardPaymentId=$cardPaymentId, additionalProperties=$additionalProperties}"
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SimulationCardAuthorizationExpirationCreateParams &&
            this.cardPaymentId == other.cardPaymentId &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            cardPaymentId,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "SimulationCardAuthorizationExpirationCreateParams{cardPaymentId=$cardPaymentId, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var cardPaymentId: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            simulationCardAuthorizationExpirationCreateParams:
                SimulationCardAuthorizationExpirationCreateParams
        ) = apply {
            this.cardPaymentId = simulationCardAuthorizationExpirationCreateParams.cardPaymentId
            additionalQueryParams(
                simulationCardAuthorizationExpirationCreateParams.additionalQueryParams
            )
            additionalHeaders(simulationCardAuthorizationExpirationCreateParams.additionalHeaders)
            additionalBodyProperties(
                simulationCardAuthorizationExpirationCreateParams.additionalBodyProperties
            )
        }

        /** The identifier of the Card Payment to expire. */
        fun cardPaymentId(cardPaymentId: String) = apply { this.cardPaymentId = cardPaymentId }

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

        fun build(): SimulationCardAuthorizationExpirationCreateParams =
            SimulationCardAuthorizationExpirationCreateParams(
                checkNotNull(cardPaymentId) { "`cardPaymentId` is required but was not set" },
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }
}
