// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
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
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalQueryParams: Map<String, List<String>>,
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

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

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

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is InboundAchTransferCreateNotificationOfChangeParams && this.inboundAchTransferId == other.inboundAchTransferId && this.updatedAccountNumber == other.updatedAccountNumber && this.updatedRoutingNumber == other.updatedRoutingNumber && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(inboundAchTransferId, updatedAccountNumber, updatedRoutingNumber, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "InboundAchTransferCreateNotificationOfChangeParams{inboundAchTransferId=$inboundAchTransferId, updatedAccountNumber=$updatedAccountNumber, updatedRoutingNumber=$updatedRoutingNumber, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var inboundAchTransferId: String? = null
        private var updatedAccountNumber: String? = null
        private var updatedRoutingNumber: String? = null
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()
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
            additionalHeaders(inboundAchTransferCreateNotificationOfChangeParams.additionalHeaders)
            additionalQueryParams(
                inboundAchTransferCreateNotificationOfChangeParams.additionalQueryParams
            )
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

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.putAll(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(::putAdditionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replaceValues(name, listOf(value))
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replaceValues(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(::replaceAdditionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.removeAll(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            names.forEach(::removeAdditionalHeaders)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.putAll(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                additionalQueryParams.forEach(::putAdditionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replaceValues(key, listOf(value))
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replaceValues(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                additionalQueryParams.forEach(::replaceAdditionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply {
            additionalQueryParams.removeAll(key)
        }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalQueryParams)
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

        fun build(): InboundAchTransferCreateNotificationOfChangeParams =
            InboundAchTransferCreateNotificationOfChangeParams(
                checkNotNull(inboundAchTransferId) {
                    "`inboundAchTransferId` is required but was not set"
                },
                updatedAccountNumber,
                updatedRoutingNumber,
                additionalHeaders
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
                additionalQueryParams
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
                additionalBodyProperties.toImmutable(),
            )
    }
}
