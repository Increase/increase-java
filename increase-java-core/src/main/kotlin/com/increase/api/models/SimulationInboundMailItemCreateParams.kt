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
import java.util.Objects
import java.util.Optional

/**
 * Simulates an inbound mail item to your account, as if someone had mailed a physical check to one
 * of your account's Lockboxes.
 */
class SimulationInboundMailItemCreateParams
private constructor(
    private val body: SimulationInboundMailItemCreateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** The amount of the check to be simulated, in cents. */
    fun amount(): Long = body.amount()

    /** The identifier of the Lockbox to simulate inbound mail to. */
    fun lockboxId(): String = body.lockboxId()

    /**
     * The file containing the PDF contents. If not present, a default check image file will be
     * used.
     */
    fun contentsFileId(): Optional<String> = body.contentsFileId()

    /** The amount of the check to be simulated, in cents. */
    fun _amount(): JsonField<Long> = body._amount()

    /** The identifier of the Lockbox to simulate inbound mail to. */
    fun _lockboxId(): JsonField<String> = body._lockboxId()

    /**
     * The file containing the PDF contents. If not present, a default check image file will be
     * used.
     */
    fun _contentsFileId(): JsonField<String> = body._contentsFileId()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun _body(): SimulationInboundMailItemCreateBody = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class SimulationInboundMailItemCreateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("amount")
        @ExcludeMissing
        private val amount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("lockbox_id")
        @ExcludeMissing
        private val lockboxId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("contents_file_id")
        @ExcludeMissing
        private val contentsFileId: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The amount of the check to be simulated, in cents. */
        fun amount(): Long = amount.getRequired("amount")

        /** The identifier of the Lockbox to simulate inbound mail to. */
        fun lockboxId(): String = lockboxId.getRequired("lockbox_id")

        /**
         * The file containing the PDF contents. If not present, a default check image file will be
         * used.
         */
        fun contentsFileId(): Optional<String> =
            Optional.ofNullable(contentsFileId.getNullable("contents_file_id"))

        /** The amount of the check to be simulated, in cents. */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

        /** The identifier of the Lockbox to simulate inbound mail to. */
        @JsonProperty("lockbox_id") @ExcludeMissing fun _lockboxId(): JsonField<String> = lockboxId

        /**
         * The file containing the PDF contents. If not present, a default check image file will be
         * used.
         */
        @JsonProperty("contents_file_id")
        @ExcludeMissing
        fun _contentsFileId(): JsonField<String> = contentsFileId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): SimulationInboundMailItemCreateBody = apply {
            if (validated) {
                return@apply
            }

            amount()
            lockboxId()
            contentsFileId()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [SimulationInboundMailItemCreateBody]. */
        class Builder internal constructor() {

            private var amount: JsonField<Long>? = null
            private var lockboxId: JsonField<String>? = null
            private var contentsFileId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                simulationInboundMailItemCreateBody: SimulationInboundMailItemCreateBody
            ) = apply {
                amount = simulationInboundMailItemCreateBody.amount
                lockboxId = simulationInboundMailItemCreateBody.lockboxId
                contentsFileId = simulationInboundMailItemCreateBody.contentsFileId
                additionalProperties =
                    simulationInboundMailItemCreateBody.additionalProperties.toMutableMap()
            }

            /** The amount of the check to be simulated, in cents. */
            fun amount(amount: Long) = amount(JsonField.of(amount))

            /** The amount of the check to be simulated, in cents. */
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            /** The identifier of the Lockbox to simulate inbound mail to. */
            fun lockboxId(lockboxId: String) = lockboxId(JsonField.of(lockboxId))

            /** The identifier of the Lockbox to simulate inbound mail to. */
            fun lockboxId(lockboxId: JsonField<String>) = apply { this.lockboxId = lockboxId }

            /**
             * The file containing the PDF contents. If not present, a default check image file will
             * be used.
             */
            fun contentsFileId(contentsFileId: String) =
                contentsFileId(JsonField.of(contentsFileId))

            /**
             * The file containing the PDF contents. If not present, a default check image file will
             * be used.
             */
            fun contentsFileId(contentsFileId: JsonField<String>) = apply {
                this.contentsFileId = contentsFileId
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

            fun build(): SimulationInboundMailItemCreateBody =
                SimulationInboundMailItemCreateBody(
                    checkRequired("amount", amount),
                    checkRequired("lockboxId", lockboxId),
                    contentsFileId,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is SimulationInboundMailItemCreateBody && amount == other.amount && lockboxId == other.lockboxId && contentsFileId == other.contentsFileId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(amount, lockboxId, contentsFileId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SimulationInboundMailItemCreateBody{amount=$amount, lockboxId=$lockboxId, contentsFileId=$contentsFileId, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SimulationInboundMailItemCreateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var body: SimulationInboundMailItemCreateBody.Builder =
            SimulationInboundMailItemCreateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            simulationInboundMailItemCreateParams: SimulationInboundMailItemCreateParams
        ) = apply {
            body = simulationInboundMailItemCreateParams.body.toBuilder()
            additionalHeaders = simulationInboundMailItemCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                simulationInboundMailItemCreateParams.additionalQueryParams.toBuilder()
        }

        /** The amount of the check to be simulated, in cents. */
        fun amount(amount: Long) = apply { body.amount(amount) }

        /** The amount of the check to be simulated, in cents. */
        fun amount(amount: JsonField<Long>) = apply { body.amount(amount) }

        /** The identifier of the Lockbox to simulate inbound mail to. */
        fun lockboxId(lockboxId: String) = apply { body.lockboxId(lockboxId) }

        /** The identifier of the Lockbox to simulate inbound mail to. */
        fun lockboxId(lockboxId: JsonField<String>) = apply { body.lockboxId(lockboxId) }

        /**
         * The file containing the PDF contents. If not present, a default check image file will be
         * used.
         */
        fun contentsFileId(contentsFileId: String) = apply { body.contentsFileId(contentsFileId) }

        /**
         * The file containing the PDF contents. If not present, a default check image file will be
         * used.
         */
        fun contentsFileId(contentsFileId: JsonField<String>) = apply {
            body.contentsFileId(contentsFileId)
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

        fun build(): SimulationInboundMailItemCreateParams =
            SimulationInboundMailItemCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SimulationInboundMailItemCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "SimulationInboundMailItemCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
