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
import java.util.Optional

class WireDrawdownRequestCreateParams
constructor(
    private val accountNumberId: String,
    private val amount: Long,
    private val messageToRecipient: String,
    private val recipientAccountNumber: String,
    private val recipientName: String,
    private val recipientRoutingNumber: String,
    private val recipientAddressLine1: String?,
    private val recipientAddressLine2: String?,
    private val recipientAddressLine3: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun accountNumberId(): String = accountNumberId

    fun amount(): Long = amount

    fun messageToRecipient(): String = messageToRecipient

    fun recipientAccountNumber(): String = recipientAccountNumber

    fun recipientName(): String = recipientName

    fun recipientRoutingNumber(): String = recipientRoutingNumber

    fun recipientAddressLine1(): Optional<String> = Optional.ofNullable(recipientAddressLine1)

    fun recipientAddressLine2(): Optional<String> = Optional.ofNullable(recipientAddressLine2)

    fun recipientAddressLine3(): Optional<String> = Optional.ofNullable(recipientAddressLine3)

    @JvmSynthetic
    internal fun getBody(): WireDrawdownRequestCreateBody {
        return WireDrawdownRequestCreateBody(
            accountNumberId,
            amount,
            messageToRecipient,
            recipientAccountNumber,
            recipientName,
            recipientRoutingNumber,
            recipientAddressLine1,
            recipientAddressLine2,
            recipientAddressLine3,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = WireDrawdownRequestCreateBody.Builder::class)
    @NoAutoDetect
    class WireDrawdownRequestCreateBody
    internal constructor(
        private val accountNumberId: String?,
        private val amount: Long?,
        private val messageToRecipient: String?,
        private val recipientAccountNumber: String?,
        private val recipientName: String?,
        private val recipientRoutingNumber: String?,
        private val recipientAddressLine1: String?,
        private val recipientAddressLine2: String?,
        private val recipientAddressLine3: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** The Account Number to which the recipient should send funds. */
        @JsonProperty("account_number_id") fun accountNumberId(): String? = accountNumberId

        /** The amount requested from the recipient, in cents. */
        @JsonProperty("amount") fun amount(): Long? = amount

        /** A message the recipient will see as part of the request. */
        @JsonProperty("message_to_recipient") fun messageToRecipient(): String? = messageToRecipient

        /** The drawdown request's recipient's account number. */
        @JsonProperty("recipient_account_number")
        fun recipientAccountNumber(): String? = recipientAccountNumber

        /** The drawdown request's recipient's name. */
        @JsonProperty("recipient_name") fun recipientName(): String? = recipientName

        /** The drawdown request's recipient's routing number. */
        @JsonProperty("recipient_routing_number")
        fun recipientRoutingNumber(): String? = recipientRoutingNumber

        /** Line 1 of the drawdown request's recipient's address. */
        @JsonProperty("recipient_address_line1")
        fun recipientAddressLine1(): String? = recipientAddressLine1

        /** Line 2 of the drawdown request's recipient's address. */
        @JsonProperty("recipient_address_line2")
        fun recipientAddressLine2(): String? = recipientAddressLine2

        /** Line 3 of the drawdown request's recipient's address. */
        @JsonProperty("recipient_address_line3")
        fun recipientAddressLine3(): String? = recipientAddressLine3

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is WireDrawdownRequestCreateBody &&
                this.accountNumberId == other.accountNumberId &&
                this.amount == other.amount &&
                this.messageToRecipient == other.messageToRecipient &&
                this.recipientAccountNumber == other.recipientAccountNumber &&
                this.recipientName == other.recipientName &&
                this.recipientRoutingNumber == other.recipientRoutingNumber &&
                this.recipientAddressLine1 == other.recipientAddressLine1 &&
                this.recipientAddressLine2 == other.recipientAddressLine2 &&
                this.recipientAddressLine3 == other.recipientAddressLine3 &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        accountNumberId,
                        amount,
                        messageToRecipient,
                        recipientAccountNumber,
                        recipientName,
                        recipientRoutingNumber,
                        recipientAddressLine1,
                        recipientAddressLine2,
                        recipientAddressLine3,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "WireDrawdownRequestCreateBody{accountNumberId=$accountNumberId, amount=$amount, messageToRecipient=$messageToRecipient, recipientAccountNumber=$recipientAccountNumber, recipientName=$recipientName, recipientRoutingNumber=$recipientRoutingNumber, recipientAddressLine1=$recipientAddressLine1, recipientAddressLine2=$recipientAddressLine2, recipientAddressLine3=$recipientAddressLine3, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var accountNumberId: String? = null
            private var amount: Long? = null
            private var messageToRecipient: String? = null
            private var recipientAccountNumber: String? = null
            private var recipientName: String? = null
            private var recipientRoutingNumber: String? = null
            private var recipientAddressLine1: String? = null
            private var recipientAddressLine2: String? = null
            private var recipientAddressLine3: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(wireDrawdownRequestCreateBody: WireDrawdownRequestCreateBody) =
                apply {
                    this.accountNumberId = wireDrawdownRequestCreateBody.accountNumberId
                    this.amount = wireDrawdownRequestCreateBody.amount
                    this.messageToRecipient = wireDrawdownRequestCreateBody.messageToRecipient
                    this.recipientAccountNumber =
                        wireDrawdownRequestCreateBody.recipientAccountNumber
                    this.recipientName = wireDrawdownRequestCreateBody.recipientName
                    this.recipientRoutingNumber =
                        wireDrawdownRequestCreateBody.recipientRoutingNumber
                    this.recipientAddressLine1 = wireDrawdownRequestCreateBody.recipientAddressLine1
                    this.recipientAddressLine2 = wireDrawdownRequestCreateBody.recipientAddressLine2
                    this.recipientAddressLine3 = wireDrawdownRequestCreateBody.recipientAddressLine3
                    additionalProperties(wireDrawdownRequestCreateBody.additionalProperties)
                }

            /** The Account Number to which the recipient should send funds. */
            @JsonProperty("account_number_id")
            fun accountNumberId(accountNumberId: String) = apply {
                this.accountNumberId = accountNumberId
            }

            /** The amount requested from the recipient, in cents. */
            @JsonProperty("amount") fun amount(amount: Long) = apply { this.amount = amount }

            /** A message the recipient will see as part of the request. */
            @JsonProperty("message_to_recipient")
            fun messageToRecipient(messageToRecipient: String) = apply {
                this.messageToRecipient = messageToRecipient
            }

            /** The drawdown request's recipient's account number. */
            @JsonProperty("recipient_account_number")
            fun recipientAccountNumber(recipientAccountNumber: String) = apply {
                this.recipientAccountNumber = recipientAccountNumber
            }

            /** The drawdown request's recipient's name. */
            @JsonProperty("recipient_name")
            fun recipientName(recipientName: String) = apply { this.recipientName = recipientName }

            /** The drawdown request's recipient's routing number. */
            @JsonProperty("recipient_routing_number")
            fun recipientRoutingNumber(recipientRoutingNumber: String) = apply {
                this.recipientRoutingNumber = recipientRoutingNumber
            }

            /** Line 1 of the drawdown request's recipient's address. */
            @JsonProperty("recipient_address_line1")
            fun recipientAddressLine1(recipientAddressLine1: String) = apply {
                this.recipientAddressLine1 = recipientAddressLine1
            }

            /** Line 2 of the drawdown request's recipient's address. */
            @JsonProperty("recipient_address_line2")
            fun recipientAddressLine2(recipientAddressLine2: String) = apply {
                this.recipientAddressLine2 = recipientAddressLine2
            }

            /** Line 3 of the drawdown request's recipient's address. */
            @JsonProperty("recipient_address_line3")
            fun recipientAddressLine3(recipientAddressLine3: String) = apply {
                this.recipientAddressLine3 = recipientAddressLine3
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

            fun build(): WireDrawdownRequestCreateBody =
                WireDrawdownRequestCreateBody(
                    checkNotNull(accountNumberId) {
                        "`accountNumberId` is required but was not set"
                    },
                    checkNotNull(amount) { "`amount` is required but was not set" },
                    checkNotNull(messageToRecipient) {
                        "`messageToRecipient` is required but was not set"
                    },
                    checkNotNull(recipientAccountNumber) {
                        "`recipientAccountNumber` is required but was not set"
                    },
                    checkNotNull(recipientName) { "`recipientName` is required but was not set" },
                    checkNotNull(recipientRoutingNumber) {
                        "`recipientRoutingNumber` is required but was not set"
                    },
                    recipientAddressLine1,
                    recipientAddressLine2,
                    recipientAddressLine3,
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

        return other is WireDrawdownRequestCreateParams &&
            this.accountNumberId == other.accountNumberId &&
            this.amount == other.amount &&
            this.messageToRecipient == other.messageToRecipient &&
            this.recipientAccountNumber == other.recipientAccountNumber &&
            this.recipientName == other.recipientName &&
            this.recipientRoutingNumber == other.recipientRoutingNumber &&
            this.recipientAddressLine1 == other.recipientAddressLine1 &&
            this.recipientAddressLine2 == other.recipientAddressLine2 &&
            this.recipientAddressLine3 == other.recipientAddressLine3 &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            accountNumberId,
            amount,
            messageToRecipient,
            recipientAccountNumber,
            recipientName,
            recipientRoutingNumber,
            recipientAddressLine1,
            recipientAddressLine2,
            recipientAddressLine3,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "WireDrawdownRequestCreateParams{accountNumberId=$accountNumberId, amount=$amount, messageToRecipient=$messageToRecipient, recipientAccountNumber=$recipientAccountNumber, recipientName=$recipientName, recipientRoutingNumber=$recipientRoutingNumber, recipientAddressLine1=$recipientAddressLine1, recipientAddressLine2=$recipientAddressLine2, recipientAddressLine3=$recipientAddressLine3, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var accountNumberId: String? = null
        private var amount: Long? = null
        private var messageToRecipient: String? = null
        private var recipientAccountNumber: String? = null
        private var recipientName: String? = null
        private var recipientRoutingNumber: String? = null
        private var recipientAddressLine1: String? = null
        private var recipientAddressLine2: String? = null
        private var recipientAddressLine3: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(wireDrawdownRequestCreateParams: WireDrawdownRequestCreateParams) =
            apply {
                this.accountNumberId = wireDrawdownRequestCreateParams.accountNumberId
                this.amount = wireDrawdownRequestCreateParams.amount
                this.messageToRecipient = wireDrawdownRequestCreateParams.messageToRecipient
                this.recipientAccountNumber = wireDrawdownRequestCreateParams.recipientAccountNumber
                this.recipientName = wireDrawdownRequestCreateParams.recipientName
                this.recipientRoutingNumber = wireDrawdownRequestCreateParams.recipientRoutingNumber
                this.recipientAddressLine1 = wireDrawdownRequestCreateParams.recipientAddressLine1
                this.recipientAddressLine2 = wireDrawdownRequestCreateParams.recipientAddressLine2
                this.recipientAddressLine3 = wireDrawdownRequestCreateParams.recipientAddressLine3
                additionalQueryParams(wireDrawdownRequestCreateParams.additionalQueryParams)
                additionalHeaders(wireDrawdownRequestCreateParams.additionalHeaders)
                additionalBodyProperties(wireDrawdownRequestCreateParams.additionalBodyProperties)
            }

        /** The Account Number to which the recipient should send funds. */
        fun accountNumberId(accountNumberId: String) = apply {
            this.accountNumberId = accountNumberId
        }

        /** The amount requested from the recipient, in cents. */
        fun amount(amount: Long) = apply { this.amount = amount }

        /** A message the recipient will see as part of the request. */
        fun messageToRecipient(messageToRecipient: String) = apply {
            this.messageToRecipient = messageToRecipient
        }

        /** The drawdown request's recipient's account number. */
        fun recipientAccountNumber(recipientAccountNumber: String) = apply {
            this.recipientAccountNumber = recipientAccountNumber
        }

        /** The drawdown request's recipient's name. */
        fun recipientName(recipientName: String) = apply { this.recipientName = recipientName }

        /** The drawdown request's recipient's routing number. */
        fun recipientRoutingNumber(recipientRoutingNumber: String) = apply {
            this.recipientRoutingNumber = recipientRoutingNumber
        }

        /** Line 1 of the drawdown request's recipient's address. */
        fun recipientAddressLine1(recipientAddressLine1: String) = apply {
            this.recipientAddressLine1 = recipientAddressLine1
        }

        /** Line 2 of the drawdown request's recipient's address. */
        fun recipientAddressLine2(recipientAddressLine2: String) = apply {
            this.recipientAddressLine2 = recipientAddressLine2
        }

        /** Line 3 of the drawdown request's recipient's address. */
        fun recipientAddressLine3(recipientAddressLine3: String) = apply {
            this.recipientAddressLine3 = recipientAddressLine3
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

        fun build(): WireDrawdownRequestCreateParams =
            WireDrawdownRequestCreateParams(
                checkNotNull(accountNumberId) { "`accountNumberId` is required but was not set" },
                checkNotNull(amount) { "`amount` is required but was not set" },
                checkNotNull(messageToRecipient) {
                    "`messageToRecipient` is required but was not set"
                },
                checkNotNull(recipientAccountNumber) {
                    "`recipientAccountNumber` is required but was not set"
                },
                checkNotNull(recipientName) { "`recipientName` is required but was not set" },
                checkNotNull(recipientRoutingNumber) {
                    "`recipientRoutingNumber` is required but was not set"
                },
                recipientAddressLine1,
                recipientAddressLine2,
                recipientAddressLine3,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }
}
