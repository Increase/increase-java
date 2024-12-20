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
    private val originatorAddressLine1: String?,
    private val originatorAddressLine2: String?,
    private val originatorAddressLine3: String?,
    private val originatorName: String?,
    private val recipientAddressLine1: String?,
    private val recipientAddressLine2: String?,
    private val recipientAddressLine3: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun accountNumberId(): String = accountNumberId

    fun amount(): Long = amount

    fun messageToRecipient(): String = messageToRecipient

    fun recipientAccountNumber(): String = recipientAccountNumber

    fun recipientName(): String = recipientName

    fun recipientRoutingNumber(): String = recipientRoutingNumber

    fun originatorAddressLine1(): Optional<String> = Optional.ofNullable(originatorAddressLine1)

    fun originatorAddressLine2(): Optional<String> = Optional.ofNullable(originatorAddressLine2)

    fun originatorAddressLine3(): Optional<String> = Optional.ofNullable(originatorAddressLine3)

    fun originatorName(): Optional<String> = Optional.ofNullable(originatorName)

    fun recipientAddressLine1(): Optional<String> = Optional.ofNullable(recipientAddressLine1)

    fun recipientAddressLine2(): Optional<String> = Optional.ofNullable(recipientAddressLine2)

    fun recipientAddressLine3(): Optional<String> = Optional.ofNullable(recipientAddressLine3)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    @JvmSynthetic
    internal fun getBody(): WireDrawdownRequestCreateBody {
        return WireDrawdownRequestCreateBody(
            accountNumberId,
            amount,
            messageToRecipient,
            recipientAccountNumber,
            recipientName,
            recipientRoutingNumber,
            originatorAddressLine1,
            originatorAddressLine2,
            originatorAddressLine3,
            originatorName,
            recipientAddressLine1,
            recipientAddressLine2,
            recipientAddressLine3,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @JsonDeserialize(builder = WireDrawdownRequestCreateBody.Builder::class)
    @NoAutoDetect
    class WireDrawdownRequestCreateBody
    internal constructor(
        private val accountNumberId: String,
        private val amount: Long,
        private val messageToRecipient: String,
        private val recipientAccountNumber: String,
        private val recipientName: String,
        private val recipientRoutingNumber: String,
        private val originatorAddressLine1: String?,
        private val originatorAddressLine2: String?,
        private val originatorAddressLine3: String?,
        private val originatorName: String?,
        private val recipientAddressLine1: String?,
        private val recipientAddressLine2: String?,
        private val recipientAddressLine3: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The Account Number to which the recipient should send funds. */
        @JsonProperty("account_number_id") fun accountNumberId(): String = accountNumberId

        /** The amount requested from the recipient, in USD cents. */
        @JsonProperty("amount") fun amount(): Long = amount

        /** A message the recipient will see as part of the request. */
        @JsonProperty("message_to_recipient") fun messageToRecipient(): String = messageToRecipient

        /** The drawdown request's recipient's account number. */
        @JsonProperty("recipient_account_number")
        fun recipientAccountNumber(): String = recipientAccountNumber

        /** The drawdown request's recipient's name. */
        @JsonProperty("recipient_name") fun recipientName(): String = recipientName

        /** The drawdown request's recipient's routing number. */
        @JsonProperty("recipient_routing_number")
        fun recipientRoutingNumber(): String = recipientRoutingNumber

        /**
         * The drawdown request originator's address line 1. This is only necessary if you're
         * requesting a payment to a commingled account. Otherwise, we'll use the associated
         * entity's details.
         */
        @JsonProperty("originator_address_line1")
        fun originatorAddressLine1(): Optional<String> = Optional.ofNullable(originatorAddressLine1)

        /**
         * The drawdown request originator's address line 2. This is only necessary if you're
         * requesting a payment to a commingled account. Otherwise, we'll use the associated
         * entity's details.
         */
        @JsonProperty("originator_address_line2")
        fun originatorAddressLine2(): Optional<String> = Optional.ofNullable(originatorAddressLine2)

        /**
         * The drawdown request originator's address line 3. This is only necessary if you're
         * requesting a payment to a commingled account. Otherwise, we'll use the associated
         * entity's details.
         */
        @JsonProperty("originator_address_line3")
        fun originatorAddressLine3(): Optional<String> = Optional.ofNullable(originatorAddressLine3)

        /**
         * The drawdown request originator's name. This is only necessary if you're requesting a
         * payment to a commingled account. Otherwise, we'll use the associated entity's details.
         */
        @JsonProperty("originator_name")
        fun originatorName(): Optional<String> = Optional.ofNullable(originatorName)

        /** Line 1 of the drawdown request's recipient's address. */
        @JsonProperty("recipient_address_line1")
        fun recipientAddressLine1(): Optional<String> = Optional.ofNullable(recipientAddressLine1)

        /** Line 2 of the drawdown request's recipient's address. */
        @JsonProperty("recipient_address_line2")
        fun recipientAddressLine2(): Optional<String> = Optional.ofNullable(recipientAddressLine2)

        /** Line 3 of the drawdown request's recipient's address. */
        @JsonProperty("recipient_address_line3")
        fun recipientAddressLine3(): Optional<String> = Optional.ofNullable(recipientAddressLine3)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

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
            private var originatorAddressLine1: String? = null
            private var originatorAddressLine2: String? = null
            private var originatorAddressLine3: String? = null
            private var originatorName: String? = null
            private var recipientAddressLine1: String? = null
            private var recipientAddressLine2: String? = null
            private var recipientAddressLine3: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(wireDrawdownRequestCreateBody: WireDrawdownRequestCreateBody) =
                apply {
                    accountNumberId = wireDrawdownRequestCreateBody.accountNumberId
                    amount = wireDrawdownRequestCreateBody.amount
                    messageToRecipient = wireDrawdownRequestCreateBody.messageToRecipient
                    recipientAccountNumber = wireDrawdownRequestCreateBody.recipientAccountNumber
                    recipientName = wireDrawdownRequestCreateBody.recipientName
                    recipientRoutingNumber = wireDrawdownRequestCreateBody.recipientRoutingNumber
                    originatorAddressLine1 = wireDrawdownRequestCreateBody.originatorAddressLine1
                    originatorAddressLine2 = wireDrawdownRequestCreateBody.originatorAddressLine2
                    originatorAddressLine3 = wireDrawdownRequestCreateBody.originatorAddressLine3
                    originatorName = wireDrawdownRequestCreateBody.originatorName
                    recipientAddressLine1 = wireDrawdownRequestCreateBody.recipientAddressLine1
                    recipientAddressLine2 = wireDrawdownRequestCreateBody.recipientAddressLine2
                    recipientAddressLine3 = wireDrawdownRequestCreateBody.recipientAddressLine3
                    additionalProperties =
                        wireDrawdownRequestCreateBody.additionalProperties.toMutableMap()
                }

            /** The Account Number to which the recipient should send funds. */
            @JsonProperty("account_number_id")
            fun accountNumberId(accountNumberId: String) = apply {
                this.accountNumberId = accountNumberId
            }

            /** The amount requested from the recipient, in USD cents. */
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

            /**
             * The drawdown request originator's address line 1. This is only necessary if you're
             * requesting a payment to a commingled account. Otherwise, we'll use the associated
             * entity's details.
             */
            @JsonProperty("originator_address_line1")
            fun originatorAddressLine1(originatorAddressLine1: String) = apply {
                this.originatorAddressLine1 = originatorAddressLine1
            }

            /**
             * The drawdown request originator's address line 2. This is only necessary if you're
             * requesting a payment to a commingled account. Otherwise, we'll use the associated
             * entity's details.
             */
            @JsonProperty("originator_address_line2")
            fun originatorAddressLine2(originatorAddressLine2: String) = apply {
                this.originatorAddressLine2 = originatorAddressLine2
            }

            /**
             * The drawdown request originator's address line 3. This is only necessary if you're
             * requesting a payment to a commingled account. Otherwise, we'll use the associated
             * entity's details.
             */
            @JsonProperty("originator_address_line3")
            fun originatorAddressLine3(originatorAddressLine3: String) = apply {
                this.originatorAddressLine3 = originatorAddressLine3
            }

            /**
             * The drawdown request originator's name. This is only necessary if you're requesting a
             * payment to a commingled account. Otherwise, we'll use the associated entity's
             * details.
             */
            @JsonProperty("originator_name")
            fun originatorName(originatorName: String) = apply {
                this.originatorName = originatorName
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
                putAllAdditionalProperties(additionalProperties)
            }

            @JsonAnySetter
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
                    originatorAddressLine1,
                    originatorAddressLine2,
                    originatorAddressLine3,
                    originatorName,
                    recipientAddressLine1,
                    recipientAddressLine2,
                    recipientAddressLine3,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is WireDrawdownRequestCreateBody && accountNumberId == other.accountNumberId && amount == other.amount && messageToRecipient == other.messageToRecipient && recipientAccountNumber == other.recipientAccountNumber && recipientName == other.recipientName && recipientRoutingNumber == other.recipientRoutingNumber && originatorAddressLine1 == other.originatorAddressLine1 && originatorAddressLine2 == other.originatorAddressLine2 && originatorAddressLine3 == other.originatorAddressLine3 && originatorName == other.originatorName && recipientAddressLine1 == other.recipientAddressLine1 && recipientAddressLine2 == other.recipientAddressLine2 && recipientAddressLine3 == other.recipientAddressLine3 && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(accountNumberId, amount, messageToRecipient, recipientAccountNumber, recipientName, recipientRoutingNumber, originatorAddressLine1, originatorAddressLine2, originatorAddressLine3, originatorName, recipientAddressLine1, recipientAddressLine2, recipientAddressLine3, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "WireDrawdownRequestCreateBody{accountNumberId=$accountNumberId, amount=$amount, messageToRecipient=$messageToRecipient, recipientAccountNumber=$recipientAccountNumber, recipientName=$recipientName, recipientRoutingNumber=$recipientRoutingNumber, originatorAddressLine1=$originatorAddressLine1, originatorAddressLine2=$originatorAddressLine2, originatorAddressLine3=$originatorAddressLine3, originatorName=$originatorName, recipientAddressLine1=$recipientAddressLine1, recipientAddressLine2=$recipientAddressLine2, recipientAddressLine3=$recipientAddressLine3, additionalProperties=$additionalProperties}"
    }

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
        private var originatorAddressLine1: String? = null
        private var originatorAddressLine2: String? = null
        private var originatorAddressLine3: String? = null
        private var originatorName: String? = null
        private var recipientAddressLine1: String? = null
        private var recipientAddressLine2: String? = null
        private var recipientAddressLine3: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(wireDrawdownRequestCreateParams: WireDrawdownRequestCreateParams) =
            apply {
                accountNumberId = wireDrawdownRequestCreateParams.accountNumberId
                amount = wireDrawdownRequestCreateParams.amount
                messageToRecipient = wireDrawdownRequestCreateParams.messageToRecipient
                recipientAccountNumber = wireDrawdownRequestCreateParams.recipientAccountNumber
                recipientName = wireDrawdownRequestCreateParams.recipientName
                recipientRoutingNumber = wireDrawdownRequestCreateParams.recipientRoutingNumber
                originatorAddressLine1 = wireDrawdownRequestCreateParams.originatorAddressLine1
                originatorAddressLine2 = wireDrawdownRequestCreateParams.originatorAddressLine2
                originatorAddressLine3 = wireDrawdownRequestCreateParams.originatorAddressLine3
                originatorName = wireDrawdownRequestCreateParams.originatorName
                recipientAddressLine1 = wireDrawdownRequestCreateParams.recipientAddressLine1
                recipientAddressLine2 = wireDrawdownRequestCreateParams.recipientAddressLine2
                recipientAddressLine3 = wireDrawdownRequestCreateParams.recipientAddressLine3
                additionalHeaders = wireDrawdownRequestCreateParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    wireDrawdownRequestCreateParams.additionalQueryParams.toBuilder()
                additionalBodyProperties =
                    wireDrawdownRequestCreateParams.additionalBodyProperties.toMutableMap()
            }

        /** The Account Number to which the recipient should send funds. */
        fun accountNumberId(accountNumberId: String) = apply {
            this.accountNumberId = accountNumberId
        }

        /** The amount requested from the recipient, in USD cents. */
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

        /**
         * The drawdown request originator's address line 1. This is only necessary if you're
         * requesting a payment to a commingled account. Otherwise, we'll use the associated
         * entity's details.
         */
        fun originatorAddressLine1(originatorAddressLine1: String) = apply {
            this.originatorAddressLine1 = originatorAddressLine1
        }

        /**
         * The drawdown request originator's address line 2. This is only necessary if you're
         * requesting a payment to a commingled account. Otherwise, we'll use the associated
         * entity's details.
         */
        fun originatorAddressLine2(originatorAddressLine2: String) = apply {
            this.originatorAddressLine2 = originatorAddressLine2
        }

        /**
         * The drawdown request originator's address line 3. This is only necessary if you're
         * requesting a payment to a commingled account. Otherwise, we'll use the associated
         * entity's details.
         */
        fun originatorAddressLine3(originatorAddressLine3: String) = apply {
            this.originatorAddressLine3 = originatorAddressLine3
        }

        /**
         * The drawdown request originator's name. This is only necessary if you're requesting a
         * payment to a commingled account. Otherwise, we'll use the associated entity's details.
         */
        fun originatorName(originatorName: String) = apply { this.originatorName = originatorName }

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
            putAllAdditionalBodyProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply {
            additionalBodyProperties.remove(key)
        }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalBodyProperty)
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
                originatorAddressLine1,
                originatorAddressLine2,
                originatorAddressLine3,
                originatorName,
                recipientAddressLine1,
                recipientAddressLine2,
                recipientAddressLine3,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is WireDrawdownRequestCreateParams && accountNumberId == other.accountNumberId && amount == other.amount && messageToRecipient == other.messageToRecipient && recipientAccountNumber == other.recipientAccountNumber && recipientName == other.recipientName && recipientRoutingNumber == other.recipientRoutingNumber && originatorAddressLine1 == other.originatorAddressLine1 && originatorAddressLine2 == other.originatorAddressLine2 && originatorAddressLine3 == other.originatorAddressLine3 && originatorName == other.originatorName && recipientAddressLine1 == other.recipientAddressLine1 && recipientAddressLine2 == other.recipientAddressLine2 && recipientAddressLine3 == other.recipientAddressLine3 && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(accountNumberId, amount, messageToRecipient, recipientAccountNumber, recipientName, recipientRoutingNumber, originatorAddressLine1, originatorAddressLine2, originatorAddressLine3, originatorName, recipientAddressLine1, recipientAddressLine2, recipientAddressLine3, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "WireDrawdownRequestCreateParams{accountNumberId=$accountNumberId, amount=$amount, messageToRecipient=$messageToRecipient, recipientAccountNumber=$recipientAccountNumber, recipientName=$recipientName, recipientRoutingNumber=$recipientRoutingNumber, originatorAddressLine1=$originatorAddressLine1, originatorAddressLine2=$originatorAddressLine2, originatorAddressLine3=$originatorAddressLine3, originatorName=$originatorName, recipientAddressLine1=$recipientAddressLine1, recipientAddressLine2=$recipientAddressLine2, recipientAddressLine3=$recipientAddressLine3, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}
