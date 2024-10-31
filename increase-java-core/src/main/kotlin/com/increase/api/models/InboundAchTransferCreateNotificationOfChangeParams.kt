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

class InboundAchTransferCreateNotificationOfChangeParams
constructor(
    private val inboundAchTransferId: String,
    private val updatedAccountNumber: String?,
    private val updatedRoutingNumber: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun inboundAchTransferId(): String = inboundAchTransferId

    fun updatedAccountNumber(): Optional<String> = Optional.ofNullable(updatedAccountNumber)

    fun updatedRoutingNumber(): Optional<String> = Optional.ofNullable(updatedRoutingNumber)

    @JvmSynthetic
    internal fun getBody(): InboundAchTransferCreateNotificationOfChangeBody {
        return InboundAchTransferCreateNotificationOfChangeBody(
            updatedAccountNumber,
            updatedRoutingNumber,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> inboundAchTransferId
            else -> ""
        }
    }

    @JsonDeserialize(builder = InboundAchTransferCreateNotificationOfChangeBody.Builder::class)
    @NoAutoDetect
    class InboundAchTransferCreateNotificationOfChangeBody
    internal constructor(
        private val updatedAccountNumber: String?,
        private val updatedRoutingNumber: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The updated account number to send in the notification of change. */
        @JsonProperty("updated_account_number")
        fun updatedAccountNumber(): String? = updatedAccountNumber

        /** The updated routing number to send in the notification of change. */
        @JsonProperty("updated_routing_number")
        fun updatedRoutingNumber(): String? = updatedRoutingNumber

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
                this.updatedAccountNumber =
                    inboundAchTransferCreateNotificationOfChangeBody.updatedAccountNumber
                this.updatedRoutingNumber =
                    inboundAchTransferCreateNotificationOfChangeBody.updatedRoutingNumber
                additionalProperties(
                    inboundAchTransferCreateNotificationOfChangeBody.additionalProperties
                )
            }

            /** The updated account number to send in the notification of change. */
            @JsonProperty("updated_account_number")
            fun updatedAccountNumber(updatedAccountNumber: String) = apply {
                this.updatedAccountNumber = updatedAccountNumber
            }

            /** The updated routing number to send in the notification of change. */
            @JsonProperty("updated_routing_number")
            fun updatedRoutingNumber(updatedRoutingNumber: String) = apply {
                this.updatedRoutingNumber = updatedRoutingNumber
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

            return /* spotless:off */ other is InboundAchTransferCreateNotificationOfChangeBody && this.updatedAccountNumber == other.updatedAccountNumber && this.updatedRoutingNumber == other.updatedRoutingNumber && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(updatedAccountNumber, updatedRoutingNumber, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "InboundAchTransferCreateNotificationOfChangeBody{updatedAccountNumber=$updatedAccountNumber, updatedRoutingNumber=$updatedRoutingNumber, additionalProperties=$additionalProperties}"
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is InboundAchTransferCreateNotificationOfChangeParams && this.inboundAchTransferId == other.inboundAchTransferId && this.updatedAccountNumber == other.updatedAccountNumber && this.updatedRoutingNumber == other.updatedRoutingNumber && this.additionalQueryParams == other.additionalQueryParams && this.additionalHeaders == other.additionalHeaders && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(inboundAchTransferId, updatedAccountNumber, updatedRoutingNumber, additionalQueryParams, additionalHeaders, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "InboundAchTransferCreateNotificationOfChangeParams{inboundAchTransferId=$inboundAchTransferId, updatedAccountNumber=$updatedAccountNumber, updatedRoutingNumber=$updatedRoutingNumber, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var inboundAchTransferId: String? = null
        private var updatedAccountNumber: String? = null
        private var updatedRoutingNumber: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            inboundAchTransferCreateNotificationOfChangeParams:
                InboundAchTransferCreateNotificationOfChangeParams
        ) = apply {
            this.inboundAchTransferId =
                inboundAchTransferCreateNotificationOfChangeParams.inboundAchTransferId
            this.updatedAccountNumber =
                inboundAchTransferCreateNotificationOfChangeParams.updatedAccountNumber
            this.updatedRoutingNumber =
                inboundAchTransferCreateNotificationOfChangeParams.updatedRoutingNumber
            additionalQueryParams(
                inboundAchTransferCreateNotificationOfChangeParams.additionalQueryParams
            )
            additionalHeaders(inboundAchTransferCreateNotificationOfChangeParams.additionalHeaders)
            additionalBodyProperties(
                inboundAchTransferCreateNotificationOfChangeParams.additionalBodyProperties
            )
        }

        /**
         * The identifier of the Inbound ACH Transfer for which to create a notification of change.
         */
        fun inboundAchTransferId(inboundAchTransferId: String) = apply {
            this.inboundAchTransferId = inboundAchTransferId
        }

        /** The updated account number to send in the notification of change. */
        fun updatedAccountNumber(updatedAccountNumber: String) = apply {
            this.updatedAccountNumber = updatedAccountNumber
        }

        /** The updated routing number to send in the notification of change. */
        fun updatedRoutingNumber(updatedRoutingNumber: String) = apply {
            this.updatedRoutingNumber = updatedRoutingNumber
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

        fun build(): InboundAchTransferCreateNotificationOfChangeParams =
            InboundAchTransferCreateNotificationOfChangeParams(
                checkNotNull(inboundAchTransferId) {
                    "`inboundAchTransferId` is required but was not set"
                },
                updatedAccountNumber,
                updatedRoutingNumber,
                additionalQueryParams.mapValues { it.value.toImmutable() }.toImmutable(),
                additionalHeaders.mapValues { it.value.toImmutable() }.toImmutable(),
                additionalBodyProperties.toImmutable(),
            )
    }
}
