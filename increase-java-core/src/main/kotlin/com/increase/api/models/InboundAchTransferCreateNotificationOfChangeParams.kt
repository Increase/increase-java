// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import com.increase.api.core.immutableEmptyMap
import com.increase.api.core.toImmutable
import java.util.Objects
import java.util.Optional

/** Create a notification of change for an Inbound ACH Transfer */
class InboundAchTransferCreateNotificationOfChangeParams
constructor(
    private val inboundAchTransferId: String,
    private val body: InboundAchTransferCreateNotificationOfChangeBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    /** The identifier of the Inbound ACH Transfer for which to create a notification of change. */
    fun inboundAchTransferId(): String = inboundAchTransferId

    /** The updated account number to send in the notification of change. */
    fun updatedAccountNumber(): Optional<String> = body.updatedAccountNumber()

    /** The updated routing number to send in the notification of change. */
    fun updatedRoutingNumber(): Optional<String> = body.updatedRoutingNumber()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    @JvmSynthetic internal fun getBody(): InboundAchTransferCreateNotificationOfChangeBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> inboundAchTransferId
            else -> ""
        }
    }

    @NoAutoDetect
    class InboundAchTransferCreateNotificationOfChangeBody
    @JsonCreator
    internal constructor(
        @JsonProperty("updated_account_number") private val updatedAccountNumber: String?,
        @JsonProperty("updated_routing_number") private val updatedRoutingNumber: String?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The updated account number to send in the notification of change. */
        @JsonProperty("updated_account_number")
        fun updatedAccountNumber(): Optional<String> = Optional.ofNullable(updatedAccountNumber)

        /** The updated routing number to send in the notification of change. */
        @JsonProperty("updated_routing_number")
        fun updatedRoutingNumber(): Optional<String> = Optional.ofNullable(updatedRoutingNumber)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var updatedAccountNumber: String? = null
            private var updatedRoutingNumber: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                inboundAchTransferCreateNotificationOfChangeBody:
                    InboundAchTransferCreateNotificationOfChangeBody
            ) = apply {
                updatedAccountNumber =
                    inboundAchTransferCreateNotificationOfChangeBody.updatedAccountNumber
                updatedRoutingNumber =
                    inboundAchTransferCreateNotificationOfChangeBody.updatedRoutingNumber
                additionalProperties =
                    inboundAchTransferCreateNotificationOfChangeBody.additionalProperties
                        .toMutableMap()
            }

            /** The updated account number to send in the notification of change. */
            fun updatedAccountNumber(updatedAccountNumber: String?) = apply {
                this.updatedAccountNumber = updatedAccountNumber
            }

            /** The updated account number to send in the notification of change. */
            fun updatedAccountNumber(updatedAccountNumber: Optional<String>) =
                updatedAccountNumber(updatedAccountNumber.orElse(null))

            /** The updated routing number to send in the notification of change. */
            fun updatedRoutingNumber(updatedRoutingNumber: String?) = apply {
                this.updatedRoutingNumber = updatedRoutingNumber
            }

            /** The updated routing number to send in the notification of change. */
            fun updatedRoutingNumber(updatedRoutingNumber: Optional<String>) =
                updatedRoutingNumber(updatedRoutingNumber.orElse(null))

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

            fun build(): InboundAchTransferCreateNotificationOfChangeBody =
                InboundAchTransferCreateNotificationOfChangeBody(
                    updatedAccountNumber,
                    updatedRoutingNumber,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is InboundAchTransferCreateNotificationOfChangeBody && updatedAccountNumber == other.updatedAccountNumber && updatedRoutingNumber == other.updatedRoutingNumber && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(updatedAccountNumber, updatedRoutingNumber, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "InboundAchTransferCreateNotificationOfChangeBody{updatedAccountNumber=$updatedAccountNumber, updatedRoutingNumber=$updatedRoutingNumber, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var inboundAchTransferId: String? = null
        private var body: InboundAchTransferCreateNotificationOfChangeBody.Builder =
            InboundAchTransferCreateNotificationOfChangeBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            inboundAchTransferCreateNotificationOfChangeParams:
                InboundAchTransferCreateNotificationOfChangeParams
        ) = apply {
            inboundAchTransferId =
                inboundAchTransferCreateNotificationOfChangeParams.inboundAchTransferId
            body = inboundAchTransferCreateNotificationOfChangeParams.body.toBuilder()
            additionalHeaders =
                inboundAchTransferCreateNotificationOfChangeParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                inboundAchTransferCreateNotificationOfChangeParams.additionalQueryParams.toBuilder()
        }

        /**
         * The identifier of the Inbound ACH Transfer for which to create a notification of change.
         */
        fun inboundAchTransferId(inboundAchTransferId: String) = apply {
            this.inboundAchTransferId = inboundAchTransferId
        }

        /** The updated account number to send in the notification of change. */
        fun updatedAccountNumber(updatedAccountNumber: String?) = apply {
            body.updatedAccountNumber(updatedAccountNumber)
        }

        /** The updated account number to send in the notification of change. */
        fun updatedAccountNumber(updatedAccountNumber: Optional<String>) =
            updatedAccountNumber(updatedAccountNumber.orElse(null))

        /** The updated routing number to send in the notification of change. */
        fun updatedRoutingNumber(updatedRoutingNumber: String?) = apply {
            body.updatedRoutingNumber(updatedRoutingNumber)
        }

        /** The updated routing number to send in the notification of change. */
        fun updatedRoutingNumber(updatedRoutingNumber: Optional<String>) =
            updatedRoutingNumber(updatedRoutingNumber.orElse(null))

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

        fun build(): InboundAchTransferCreateNotificationOfChangeParams =
            InboundAchTransferCreateNotificationOfChangeParams(
                checkNotNull(inboundAchTransferId) {
                    "`inboundAchTransferId` is required but was not set"
                },
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is InboundAchTransferCreateNotificationOfChangeParams && inboundAchTransferId == other.inboundAchTransferId && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(inboundAchTransferId, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "InboundAchTransferCreateNotificationOfChangeParams{inboundAchTransferId=$inboundAchTransferId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
