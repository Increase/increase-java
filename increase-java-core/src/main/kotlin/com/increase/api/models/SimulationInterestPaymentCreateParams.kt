// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.Params
import com.increase.api.core.checkRequired
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import com.increase.api.core.immutableEmptyMap
import com.increase.api.core.toImmutable
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

/**
 * Simulates an interest payment to your account. In production, this happens automatically on the
 * first of each month.
 */
class SimulationInterestPaymentCreateParams
private constructor(
    private val body: SimulationInterestPaymentCreateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** The identifier of the Account Number the Interest Payment is for. */
    fun accountId(): String = body.accountId()

    /** The interest amount in cents. Must be positive. */
    fun amount(): Long = body.amount()

    /** The end of the interest period. If not provided, defaults to the current time. */
    fun periodEnd(): Optional<OffsetDateTime> = body.periodEnd()

    /** The start of the interest period. If not provided, defaults to the current time. */
    fun periodStart(): Optional<OffsetDateTime> = body.periodStart()

    /** The identifier of the Account Number the Interest Payment is for. */
    fun _accountId(): JsonField<String> = body._accountId()

    /** The interest amount in cents. Must be positive. */
    fun _amount(): JsonField<Long> = body._amount()

    /** The end of the interest period. If not provided, defaults to the current time. */
    fun _periodEnd(): JsonField<OffsetDateTime> = body._periodEnd()

    /** The start of the interest period. If not provided, defaults to the current time. */
    fun _periodStart(): JsonField<OffsetDateTime> = body._periodStart()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun _body(): SimulationInterestPaymentCreateBody = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class SimulationInterestPaymentCreateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("account_id")
        @ExcludeMissing
        private val accountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("amount")
        @ExcludeMissing
        private val amount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("period_end")
        @ExcludeMissing
        private val periodEnd: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("period_start")
        @ExcludeMissing
        private val periodStart: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The identifier of the Account Number the Interest Payment is for. */
        fun accountId(): String = accountId.getRequired("account_id")

        /** The interest amount in cents. Must be positive. */
        fun amount(): Long = amount.getRequired("amount")

        /** The end of the interest period. If not provided, defaults to the current time. */
        fun periodEnd(): Optional<OffsetDateTime> =
            Optional.ofNullable(periodEnd.getNullable("period_end"))

        /** The start of the interest period. If not provided, defaults to the current time. */
        fun periodStart(): Optional<OffsetDateTime> =
            Optional.ofNullable(periodStart.getNullable("period_start"))

        /** The identifier of the Account Number the Interest Payment is for. */
        @JsonProperty("account_id") @ExcludeMissing fun _accountId(): JsonField<String> = accountId

        /** The interest amount in cents. Must be positive. */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

        /** The end of the interest period. If not provided, defaults to the current time. */
        @JsonProperty("period_end")
        @ExcludeMissing
        fun _periodEnd(): JsonField<OffsetDateTime> = periodEnd

        /** The start of the interest period. If not provided, defaults to the current time. */
        @JsonProperty("period_start")
        @ExcludeMissing
        fun _periodStart(): JsonField<OffsetDateTime> = periodStart

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): SimulationInterestPaymentCreateBody = apply {
            if (validated) {
                return@apply
            }

            accountId()
            amount()
            periodEnd()
            periodStart()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [SimulationInterestPaymentCreateBody]. */
        class Builder internal constructor() {

            private var accountId: JsonField<String>? = null
            private var amount: JsonField<Long>? = null
            private var periodEnd: JsonField<OffsetDateTime> = JsonMissing.of()
            private var periodStart: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                simulationInterestPaymentCreateBody: SimulationInterestPaymentCreateBody
            ) = apply {
                accountId = simulationInterestPaymentCreateBody.accountId
                amount = simulationInterestPaymentCreateBody.amount
                periodEnd = simulationInterestPaymentCreateBody.periodEnd
                periodStart = simulationInterestPaymentCreateBody.periodStart
                additionalProperties =
                    simulationInterestPaymentCreateBody.additionalProperties.toMutableMap()
            }

            /** The identifier of the Account Number the Interest Payment is for. */
            fun accountId(accountId: String) = accountId(JsonField.of(accountId))

            /** The identifier of the Account Number the Interest Payment is for. */
            fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

            /** The interest amount in cents. Must be positive. */
            fun amount(amount: Long) = amount(JsonField.of(amount))

            /** The interest amount in cents. Must be positive. */
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            /** The end of the interest period. If not provided, defaults to the current time. */
            fun periodEnd(periodEnd: OffsetDateTime) = periodEnd(JsonField.of(periodEnd))

            /** The end of the interest period. If not provided, defaults to the current time. */
            fun periodEnd(periodEnd: JsonField<OffsetDateTime>) = apply {
                this.periodEnd = periodEnd
            }

            /** The start of the interest period. If not provided, defaults to the current time. */
            fun periodStart(periodStart: OffsetDateTime) = periodStart(JsonField.of(periodStart))

            /** The start of the interest period. If not provided, defaults to the current time. */
            fun periodStart(periodStart: JsonField<OffsetDateTime>) = apply {
                this.periodStart = periodStart
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

            fun build(): SimulationInterestPaymentCreateBody =
                SimulationInterestPaymentCreateBody(
                    checkRequired("accountId", accountId),
                    checkRequired("amount", amount),
                    periodEnd,
                    periodStart,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is SimulationInterestPaymentCreateBody && accountId == other.accountId && amount == other.amount && periodEnd == other.periodEnd && periodStart == other.periodStart && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(accountId, amount, periodEnd, periodStart, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SimulationInterestPaymentCreateBody{accountId=$accountId, amount=$amount, periodEnd=$periodEnd, periodStart=$periodStart, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SimulationInterestPaymentCreateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var body: SimulationInterestPaymentCreateBody.Builder =
            SimulationInterestPaymentCreateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            simulationInterestPaymentCreateParams: SimulationInterestPaymentCreateParams
        ) = apply {
            body = simulationInterestPaymentCreateParams.body.toBuilder()
            additionalHeaders = simulationInterestPaymentCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                simulationInterestPaymentCreateParams.additionalQueryParams.toBuilder()
        }

        /** The identifier of the Account Number the Interest Payment is for. */
        fun accountId(accountId: String) = apply { body.accountId(accountId) }

        /** The identifier of the Account Number the Interest Payment is for. */
        fun accountId(accountId: JsonField<String>) = apply { body.accountId(accountId) }

        /** The interest amount in cents. Must be positive. */
        fun amount(amount: Long) = apply { body.amount(amount) }

        /** The interest amount in cents. Must be positive. */
        fun amount(amount: JsonField<Long>) = apply { body.amount(amount) }

        /** The end of the interest period. If not provided, defaults to the current time. */
        fun periodEnd(periodEnd: OffsetDateTime) = apply { body.periodEnd(periodEnd) }

        /** The end of the interest period. If not provided, defaults to the current time. */
        fun periodEnd(periodEnd: JsonField<OffsetDateTime>) = apply { body.periodEnd(periodEnd) }

        /** The start of the interest period. If not provided, defaults to the current time. */
        fun periodStart(periodStart: OffsetDateTime) = apply { body.periodStart(periodStart) }

        /** The start of the interest period. If not provided, defaults to the current time. */
        fun periodStart(periodStart: JsonField<OffsetDateTime>) = apply {
            body.periodStart(periodStart)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
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

        fun build(): SimulationInterestPaymentCreateParams =
            SimulationInterestPaymentCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SimulationInterestPaymentCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "SimulationInterestPaymentCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
