// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import com.increase.api.core.toImmutable
import com.increase.api.models.*
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

class SimulationInterestPaymentCreateParams
constructor(
    private val accountId: String,
    private val amount: Long,
    private val periodEnd: OffsetDateTime?,
    private val periodStart: OffsetDateTime?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun accountId(): String = accountId

    fun amount(): Long = amount

    fun periodEnd(): Optional<OffsetDateTime> = Optional.ofNullable(periodEnd)

    fun periodStart(): Optional<OffsetDateTime> = Optional.ofNullable(periodStart)

    @JvmSynthetic
    internal fun getBody(): SimulationInterestPaymentCreateBody {
        return SimulationInterestPaymentCreateBody(
            accountId,
            amount,
            periodEnd,
            periodStart,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @JsonDeserialize(builder = SimulationInterestPaymentCreateBody.Builder::class)
    @NoAutoDetect
    class SimulationInterestPaymentCreateBody
    internal constructor(
        private val accountId: String?,
        private val amount: Long?,
        private val periodEnd: OffsetDateTime?,
        private val periodStart: OffsetDateTime?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The identifier of the Account Number the Interest Payment is for. */
        @JsonProperty("account_id") fun accountId(): String? = accountId

        /** The interest amount in cents. Must be positive. */
        @JsonProperty("amount") fun amount(): Long? = amount

        /** The end of the interest period. If not provided, defaults to the current time. */
        @JsonProperty("period_end") fun periodEnd(): OffsetDateTime? = periodEnd

        /** The start of the interest period. If not provided, defaults to the current time. */
        @JsonProperty("period_start") fun periodStart(): OffsetDateTime? = periodStart

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var accountId: String? = null
            private var amount: Long? = null
            private var periodEnd: OffsetDateTime? = null
            private var periodStart: OffsetDateTime? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                simulationInterestPaymentCreateBody: SimulationInterestPaymentCreateBody
            ) = apply {
                this.accountId = simulationInterestPaymentCreateBody.accountId
                this.amount = simulationInterestPaymentCreateBody.amount
                this.periodEnd = simulationInterestPaymentCreateBody.periodEnd
                this.periodStart = simulationInterestPaymentCreateBody.periodStart
                additionalProperties(simulationInterestPaymentCreateBody.additionalProperties)
            }

            /** The identifier of the Account Number the Interest Payment is for. */
            @JsonProperty("account_id")
            fun accountId(accountId: String) = apply { this.accountId = accountId }

            /** The interest amount in cents. Must be positive. */
            @JsonProperty("amount") fun amount(amount: Long) = apply { this.amount = amount }

            /** The end of the interest period. If not provided, defaults to the current time. */
            @JsonProperty("period_end")
            fun periodEnd(periodEnd: OffsetDateTime) = apply { this.periodEnd = periodEnd }

            /** The start of the interest period. If not provided, defaults to the current time. */
            @JsonProperty("period_start")
            fun periodStart(periodStart: OffsetDateTime) = apply { this.periodStart = periodStart }

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
                    periodEnd,
                    periodStart,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is SimulationInterestPaymentCreateBody && this.accountId == other.accountId && this.amount == other.amount && this.periodEnd == other.periodEnd && this.periodStart == other.periodStart && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(accountId, amount, periodEnd, periodStart, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "SimulationInterestPaymentCreateBody{accountId=$accountId, amount=$amount, periodEnd=$periodEnd, periodStart=$periodStart, additionalProperties=$additionalProperties}"
    }

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SimulationInterestPaymentCreateParams && this.accountId == other.accountId && this.amount == other.amount && this.periodEnd == other.periodEnd && this.periodStart == other.periodStart && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(accountId, amount, periodEnd, periodStart, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "SimulationInterestPaymentCreateParams{accountId=$accountId, amount=$amount, periodEnd=$periodEnd, periodStart=$periodStart, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var accountId: String? = null
        private var amount: Long? = null
        private var periodEnd: OffsetDateTime? = null
        private var periodStart: OffsetDateTime? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            simulationInterestPaymentCreateParams: SimulationInterestPaymentCreateParams
        ) = apply {
            this.accountId = simulationInterestPaymentCreateParams.accountId
            this.amount = simulationInterestPaymentCreateParams.amount
            this.periodEnd = simulationInterestPaymentCreateParams.periodEnd
            this.periodStart = simulationInterestPaymentCreateParams.periodStart
            additionalHeaders(simulationInterestPaymentCreateParams.additionalHeaders)
            additionalQueryParams(simulationInterestPaymentCreateParams.additionalQueryParams)
            additionalBodyProperties(simulationInterestPaymentCreateParams.additionalBodyProperties)
        }

        /** The identifier of the Account Number the Interest Payment is for. */
        fun accountId(accountId: String) = apply { this.accountId = accountId }

        /** The interest amount in cents. Must be positive. */
        fun amount(amount: Long) = apply { this.amount = amount }

        /** The end of the interest period. If not provided, defaults to the current time. */
        fun periodEnd(periodEnd: OffsetDateTime) = apply { this.periodEnd = periodEnd }

        /** The start of the interest period. If not provided, defaults to the current time. */
        fun periodStart(periodStart: OffsetDateTime) = apply { this.periodStart = periodStart }

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
                periodEnd,
                periodStart,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }
}
