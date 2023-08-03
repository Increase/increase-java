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
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

class SimulationInterestPaymentCreateParams
constructor(
    private val accountId: String,
    private val amount: Long,
    private val periodStart: OffsetDateTime?,
    private val periodEnd: OffsetDateTime?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun accountId(): String = accountId

    fun amount(): Long = amount

    fun periodStart(): Optional<OffsetDateTime> = Optional.ofNullable(periodStart)

    fun periodEnd(): Optional<OffsetDateTime> = Optional.ofNullable(periodEnd)

    @JvmSynthetic
    internal fun getBody(): SimulationInterestPaymentCreateBody {
        return SimulationInterestPaymentCreateBody(
            accountId,
            amount,
            periodStart,
            periodEnd,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = SimulationInterestPaymentCreateBody.Builder::class)
    @NoAutoDetect
    class SimulationInterestPaymentCreateBody
    internal constructor(
        private val accountId: String?,
        private val amount: Long?,
        private val periodStart: OffsetDateTime?,
        private val periodEnd: OffsetDateTime?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** The identifier of the Account Number the Interest Payment is for. */
        @JsonProperty("account_id") fun accountId(): String? = accountId

        /** The interest amount in cents. Must be positive. */
        @JsonProperty("amount") fun amount(): Long? = amount

        /** The start of the interest period. If not provided, defaults to the current time. */
        @JsonProperty("period_start") fun periodStart(): OffsetDateTime? = periodStart

        /** The end of the interest period. If not provided, defaults to the current time. */
        @JsonProperty("period_end") fun periodEnd(): OffsetDateTime? = periodEnd

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is SimulationInterestPaymentCreateBody &&
                this.accountId == other.accountId &&
                this.amount == other.amount &&
                this.periodStart == other.periodStart &&
                this.periodEnd == other.periodEnd &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        accountId,
                        amount,
                        periodStart,
                        periodEnd,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "SimulationInterestPaymentCreateBody{accountId=$accountId, amount=$amount, periodStart=$periodStart, periodEnd=$periodEnd, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var accountId: String? = null
            private var amount: Long? = null
            private var periodStart: OffsetDateTime? = null
            private var periodEnd: OffsetDateTime? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                simulationInterestPaymentCreateBody: SimulationInterestPaymentCreateBody
            ) = apply {
                this.accountId = simulationInterestPaymentCreateBody.accountId
                this.amount = simulationInterestPaymentCreateBody.amount
                this.periodStart = simulationInterestPaymentCreateBody.periodStart
                this.periodEnd = simulationInterestPaymentCreateBody.periodEnd
                additionalProperties(simulationInterestPaymentCreateBody.additionalProperties)
            }

            /** The identifier of the Account Number the Interest Payment is for. */
            @JsonProperty("account_id")
            fun accountId(accountId: String) = apply { this.accountId = accountId }

            /** The interest amount in cents. Must be positive. */
            @JsonProperty("amount") fun amount(amount: Long) = apply { this.amount = amount }

            /** The start of the interest period. If not provided, defaults to the current time. */
            @JsonProperty("period_start")
            fun periodStart(periodStart: OffsetDateTime) = apply { this.periodStart = periodStart }

            /** The end of the interest period. If not provided, defaults to the current time. */
            @JsonProperty("period_end")
            fun periodEnd(periodEnd: OffsetDateTime) = apply { this.periodEnd = periodEnd }

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

            fun build(): SimulationInterestPaymentCreateBody =
                SimulationInterestPaymentCreateBody(
                    checkNotNull(accountId) { "`accountId` is required but was not set" },
                    checkNotNull(amount) { "`amount` is required but was not set" },
                    periodStart,
                    periodEnd,
                    additionalProperties.toUnmodifiable(),
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

        return other is SimulationInterestPaymentCreateParams &&
            this.accountId == other.accountId &&
            this.amount == other.amount &&
            this.periodStart == other.periodStart &&
            this.periodEnd == other.periodEnd &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            accountId,
            amount,
            periodStart,
            periodEnd,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "SimulationInterestPaymentCreateParams{accountId=$accountId, amount=$amount, periodStart=$periodStart, periodEnd=$periodEnd, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var accountId: String? = null
        private var amount: Long? = null
        private var periodStart: OffsetDateTime? = null
        private var periodEnd: OffsetDateTime? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            simulationInterestPaymentCreateParams: SimulationInterestPaymentCreateParams
        ) = apply {
            this.accountId = simulationInterestPaymentCreateParams.accountId
            this.amount = simulationInterestPaymentCreateParams.amount
            this.periodStart = simulationInterestPaymentCreateParams.periodStart
            this.periodEnd = simulationInterestPaymentCreateParams.periodEnd
            additionalQueryParams(simulationInterestPaymentCreateParams.additionalQueryParams)
            additionalHeaders(simulationInterestPaymentCreateParams.additionalHeaders)
            additionalBodyProperties(simulationInterestPaymentCreateParams.additionalBodyProperties)
        }

        /** The identifier of the Account Number the Interest Payment is for. */
        fun accountId(accountId: String) = apply { this.accountId = accountId }

        /** The interest amount in cents. Must be positive. */
        fun amount(amount: Long) = apply { this.amount = amount }

        /** The start of the interest period. If not provided, defaults to the current time. */
        fun periodStart(periodStart: OffsetDateTime) = apply { this.periodStart = periodStart }

        /** The end of the interest period. If not provided, defaults to the current time. */
        fun periodEnd(periodEnd: OffsetDateTime) = apply { this.periodEnd = periodEnd }

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

        fun build(): SimulationInterestPaymentCreateParams =
            SimulationInterestPaymentCreateParams(
                checkNotNull(accountId) { "`accountId` is required but was not set" },
                checkNotNull(amount) { "`amount` is required but was not set" },
                periodStart,
                periodEnd,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }
}
