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
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import com.increase.api.core.immutableEmptyMap
import com.increase.api.core.toImmutable
import java.util.Objects
import java.util.Optional

/** Create a Wire Drawdown Request */
class WireDrawdownRequestCreateParams
constructor(
    private val body: WireDrawdownRequestCreateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    /** The Account Number to which the recipient should send funds. */
    fun accountNumberId(): String = body.accountNumberId()

    /** The amount requested from the recipient, in USD cents. */
    fun amount(): Long = body.amount()

    /** A message the recipient will see as part of the request. */
    fun messageToRecipient(): String = body.messageToRecipient()

    /** The drawdown request's recipient's account number. */
    fun recipientAccountNumber(): String = body.recipientAccountNumber()

    /** The drawdown request's recipient's name. */
    fun recipientName(): String = body.recipientName()

    /** The drawdown request's recipient's routing number. */
    fun recipientRoutingNumber(): String = body.recipientRoutingNumber()

    /**
     * The drawdown request originator's address line 1. This is only necessary if you're requesting
     * a payment to a commingled account. Otherwise, we'll use the associated entity's details.
     */
    fun originatorAddressLine1(): Optional<String> = body.originatorAddressLine1()

    /**
     * The drawdown request originator's address line 2. This is only necessary if you're requesting
     * a payment to a commingled account. Otherwise, we'll use the associated entity's details.
     */
    fun originatorAddressLine2(): Optional<String> = body.originatorAddressLine2()

    /**
     * The drawdown request originator's address line 3. This is only necessary if you're requesting
     * a payment to a commingled account. Otherwise, we'll use the associated entity's details.
     */
    fun originatorAddressLine3(): Optional<String> = body.originatorAddressLine3()

    /**
     * The drawdown request originator's name. This is only necessary if you're requesting a payment
     * to a commingled account. Otherwise, we'll use the associated entity's details.
     */
    fun originatorName(): Optional<String> = body.originatorName()

    /** Line 1 of the drawdown request's recipient's address. */
    fun recipientAddressLine1(): Optional<String> = body.recipientAddressLine1()

    /** Line 2 of the drawdown request's recipient's address. */
    fun recipientAddressLine2(): Optional<String> = body.recipientAddressLine2()

    /** Line 3 of the drawdown request's recipient's address. */
    fun recipientAddressLine3(): Optional<String> = body.recipientAddressLine3()

    /** The Account Number to which the recipient should send funds. */
    fun _accountNumberId(): JsonField<String> = body._accountNumberId()

    /** The amount requested from the recipient, in USD cents. */
    fun _amount(): JsonField<Long> = body._amount()

    /** A message the recipient will see as part of the request. */
    fun _messageToRecipient(): JsonField<String> = body._messageToRecipient()

    /** The drawdown request's recipient's account number. */
    fun _recipientAccountNumber(): JsonField<String> = body._recipientAccountNumber()

    /** The drawdown request's recipient's name. */
    fun _recipientName(): JsonField<String> = body._recipientName()

    /** The drawdown request's recipient's routing number. */
    fun _recipientRoutingNumber(): JsonField<String> = body._recipientRoutingNumber()

    /**
     * The drawdown request originator's address line 1. This is only necessary if you're requesting
     * a payment to a commingled account. Otherwise, we'll use the associated entity's details.
     */
    fun _originatorAddressLine1(): JsonField<String> = body._originatorAddressLine1()

    /**
     * The drawdown request originator's address line 2. This is only necessary if you're requesting
     * a payment to a commingled account. Otherwise, we'll use the associated entity's details.
     */
    fun _originatorAddressLine2(): JsonField<String> = body._originatorAddressLine2()

    /**
     * The drawdown request originator's address line 3. This is only necessary if you're requesting
     * a payment to a commingled account. Otherwise, we'll use the associated entity's details.
     */
    fun _originatorAddressLine3(): JsonField<String> = body._originatorAddressLine3()

    /**
     * The drawdown request originator's name. This is only necessary if you're requesting a payment
     * to a commingled account. Otherwise, we'll use the associated entity's details.
     */
    fun _originatorName(): JsonField<String> = body._originatorName()

    /** Line 1 of the drawdown request's recipient's address. */
    fun _recipientAddressLine1(): JsonField<String> = body._recipientAddressLine1()

    /** Line 2 of the drawdown request's recipient's address. */
    fun _recipientAddressLine2(): JsonField<String> = body._recipientAddressLine2()

    /** Line 3 of the drawdown request's recipient's address. */
    fun _recipientAddressLine3(): JsonField<String> = body._recipientAddressLine3()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun getBody(): WireDrawdownRequestCreateBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class WireDrawdownRequestCreateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("account_number_id")
        @ExcludeMissing
        private val accountNumberId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("amount")
        @ExcludeMissing
        private val amount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("message_to_recipient")
        @ExcludeMissing
        private val messageToRecipient: JsonField<String> = JsonMissing.of(),
        @JsonProperty("recipient_account_number")
        @ExcludeMissing
        private val recipientAccountNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("recipient_name")
        @ExcludeMissing
        private val recipientName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("recipient_routing_number")
        @ExcludeMissing
        private val recipientRoutingNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("originator_address_line1")
        @ExcludeMissing
        private val originatorAddressLine1: JsonField<String> = JsonMissing.of(),
        @JsonProperty("originator_address_line2")
        @ExcludeMissing
        private val originatorAddressLine2: JsonField<String> = JsonMissing.of(),
        @JsonProperty("originator_address_line3")
        @ExcludeMissing
        private val originatorAddressLine3: JsonField<String> = JsonMissing.of(),
        @JsonProperty("originator_name")
        @ExcludeMissing
        private val originatorName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("recipient_address_line1")
        @ExcludeMissing
        private val recipientAddressLine1: JsonField<String> = JsonMissing.of(),
        @JsonProperty("recipient_address_line2")
        @ExcludeMissing
        private val recipientAddressLine2: JsonField<String> = JsonMissing.of(),
        @JsonProperty("recipient_address_line3")
        @ExcludeMissing
        private val recipientAddressLine3: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The Account Number to which the recipient should send funds. */
        fun accountNumberId(): String = accountNumberId.getRequired("account_number_id")

        /** The amount requested from the recipient, in USD cents. */
        fun amount(): Long = amount.getRequired("amount")

        /** A message the recipient will see as part of the request. */
        fun messageToRecipient(): String = messageToRecipient.getRequired("message_to_recipient")

        /** The drawdown request's recipient's account number. */
        fun recipientAccountNumber(): String =
            recipientAccountNumber.getRequired("recipient_account_number")

        /** The drawdown request's recipient's name. */
        fun recipientName(): String = recipientName.getRequired("recipient_name")

        /** The drawdown request's recipient's routing number. */
        fun recipientRoutingNumber(): String =
            recipientRoutingNumber.getRequired("recipient_routing_number")

        /**
         * The drawdown request originator's address line 1. This is only necessary if you're
         * requesting a payment to a commingled account. Otherwise, we'll use the associated
         * entity's details.
         */
        fun originatorAddressLine1(): Optional<String> =
            Optional.ofNullable(originatorAddressLine1.getNullable("originator_address_line1"))

        /**
         * The drawdown request originator's address line 2. This is only necessary if you're
         * requesting a payment to a commingled account. Otherwise, we'll use the associated
         * entity's details.
         */
        fun originatorAddressLine2(): Optional<String> =
            Optional.ofNullable(originatorAddressLine2.getNullable("originator_address_line2"))

        /**
         * The drawdown request originator's address line 3. This is only necessary if you're
         * requesting a payment to a commingled account. Otherwise, we'll use the associated
         * entity's details.
         */
        fun originatorAddressLine3(): Optional<String> =
            Optional.ofNullable(originatorAddressLine3.getNullable("originator_address_line3"))

        /**
         * The drawdown request originator's name. This is only necessary if you're requesting a
         * payment to a commingled account. Otherwise, we'll use the associated entity's details.
         */
        fun originatorName(): Optional<String> =
            Optional.ofNullable(originatorName.getNullable("originator_name"))

        /** Line 1 of the drawdown request's recipient's address. */
        fun recipientAddressLine1(): Optional<String> =
            Optional.ofNullable(recipientAddressLine1.getNullable("recipient_address_line1"))

        /** Line 2 of the drawdown request's recipient's address. */
        fun recipientAddressLine2(): Optional<String> =
            Optional.ofNullable(recipientAddressLine2.getNullable("recipient_address_line2"))

        /** Line 3 of the drawdown request's recipient's address. */
        fun recipientAddressLine3(): Optional<String> =
            Optional.ofNullable(recipientAddressLine3.getNullable("recipient_address_line3"))

        /** The Account Number to which the recipient should send funds. */
        @JsonProperty("account_number_id")
        @ExcludeMissing
        fun _accountNumberId(): JsonField<String> = accountNumberId

        /** The amount requested from the recipient, in USD cents. */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

        /** A message the recipient will see as part of the request. */
        @JsonProperty("message_to_recipient")
        @ExcludeMissing
        fun _messageToRecipient(): JsonField<String> = messageToRecipient

        /** The drawdown request's recipient's account number. */
        @JsonProperty("recipient_account_number")
        @ExcludeMissing
        fun _recipientAccountNumber(): JsonField<String> = recipientAccountNumber

        /** The drawdown request's recipient's name. */
        @JsonProperty("recipient_name")
        @ExcludeMissing
        fun _recipientName(): JsonField<String> = recipientName

        /** The drawdown request's recipient's routing number. */
        @JsonProperty("recipient_routing_number")
        @ExcludeMissing
        fun _recipientRoutingNumber(): JsonField<String> = recipientRoutingNumber

        /**
         * The drawdown request originator's address line 1. This is only necessary if you're
         * requesting a payment to a commingled account. Otherwise, we'll use the associated
         * entity's details.
         */
        @JsonProperty("originator_address_line1")
        @ExcludeMissing
        fun _originatorAddressLine1(): JsonField<String> = originatorAddressLine1

        /**
         * The drawdown request originator's address line 2. This is only necessary if you're
         * requesting a payment to a commingled account. Otherwise, we'll use the associated
         * entity's details.
         */
        @JsonProperty("originator_address_line2")
        @ExcludeMissing
        fun _originatorAddressLine2(): JsonField<String> = originatorAddressLine2

        /**
         * The drawdown request originator's address line 3. This is only necessary if you're
         * requesting a payment to a commingled account. Otherwise, we'll use the associated
         * entity's details.
         */
        @JsonProperty("originator_address_line3")
        @ExcludeMissing
        fun _originatorAddressLine3(): JsonField<String> = originatorAddressLine3

        /**
         * The drawdown request originator's name. This is only necessary if you're requesting a
         * payment to a commingled account. Otherwise, we'll use the associated entity's details.
         */
        @JsonProperty("originator_name")
        @ExcludeMissing
        fun _originatorName(): JsonField<String> = originatorName

        /** Line 1 of the drawdown request's recipient's address. */
        @JsonProperty("recipient_address_line1")
        @ExcludeMissing
        fun _recipientAddressLine1(): JsonField<String> = recipientAddressLine1

        /** Line 2 of the drawdown request's recipient's address. */
        @JsonProperty("recipient_address_line2")
        @ExcludeMissing
        fun _recipientAddressLine2(): JsonField<String> = recipientAddressLine2

        /** Line 3 of the drawdown request's recipient's address. */
        @JsonProperty("recipient_address_line3")
        @ExcludeMissing
        fun _recipientAddressLine3(): JsonField<String> = recipientAddressLine3

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): WireDrawdownRequestCreateBody = apply {
            if (validated) {
                return@apply
            }

            accountNumberId()
            amount()
            messageToRecipient()
            recipientAccountNumber()
            recipientName()
            recipientRoutingNumber()
            originatorAddressLine1()
            originatorAddressLine2()
            originatorAddressLine3()
            originatorName()
            recipientAddressLine1()
            recipientAddressLine2()
            recipientAddressLine3()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var accountNumberId: JsonField<String>? = null
            private var amount: JsonField<Long>? = null
            private var messageToRecipient: JsonField<String>? = null
            private var recipientAccountNumber: JsonField<String>? = null
            private var recipientName: JsonField<String>? = null
            private var recipientRoutingNumber: JsonField<String>? = null
            private var originatorAddressLine1: JsonField<String> = JsonMissing.of()
            private var originatorAddressLine2: JsonField<String> = JsonMissing.of()
            private var originatorAddressLine3: JsonField<String> = JsonMissing.of()
            private var originatorName: JsonField<String> = JsonMissing.of()
            private var recipientAddressLine1: JsonField<String> = JsonMissing.of()
            private var recipientAddressLine2: JsonField<String> = JsonMissing.of()
            private var recipientAddressLine3: JsonField<String> = JsonMissing.of()
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
            fun accountNumberId(accountNumberId: String) =
                accountNumberId(JsonField.of(accountNumberId))

            /** The Account Number to which the recipient should send funds. */
            fun accountNumberId(accountNumberId: JsonField<String>) = apply {
                this.accountNumberId = accountNumberId
            }

            /** The amount requested from the recipient, in USD cents. */
            fun amount(amount: Long) = amount(JsonField.of(amount))

            /** The amount requested from the recipient, in USD cents. */
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            /** A message the recipient will see as part of the request. */
            fun messageToRecipient(messageToRecipient: String) =
                messageToRecipient(JsonField.of(messageToRecipient))

            /** A message the recipient will see as part of the request. */
            fun messageToRecipient(messageToRecipient: JsonField<String>) = apply {
                this.messageToRecipient = messageToRecipient
            }

            /** The drawdown request's recipient's account number. */
            fun recipientAccountNumber(recipientAccountNumber: String) =
                recipientAccountNumber(JsonField.of(recipientAccountNumber))

            /** The drawdown request's recipient's account number. */
            fun recipientAccountNumber(recipientAccountNumber: JsonField<String>) = apply {
                this.recipientAccountNumber = recipientAccountNumber
            }

            /** The drawdown request's recipient's name. */
            fun recipientName(recipientName: String) = recipientName(JsonField.of(recipientName))

            /** The drawdown request's recipient's name. */
            fun recipientName(recipientName: JsonField<String>) = apply {
                this.recipientName = recipientName
            }

            /** The drawdown request's recipient's routing number. */
            fun recipientRoutingNumber(recipientRoutingNumber: String) =
                recipientRoutingNumber(JsonField.of(recipientRoutingNumber))

            /** The drawdown request's recipient's routing number. */
            fun recipientRoutingNumber(recipientRoutingNumber: JsonField<String>) = apply {
                this.recipientRoutingNumber = recipientRoutingNumber
            }

            /**
             * The drawdown request originator's address line 1. This is only necessary if you're
             * requesting a payment to a commingled account. Otherwise, we'll use the associated
             * entity's details.
             */
            fun originatorAddressLine1(originatorAddressLine1: String) =
                originatorAddressLine1(JsonField.of(originatorAddressLine1))

            /**
             * The drawdown request originator's address line 1. This is only necessary if you're
             * requesting a payment to a commingled account. Otherwise, we'll use the associated
             * entity's details.
             */
            fun originatorAddressLine1(originatorAddressLine1: JsonField<String>) = apply {
                this.originatorAddressLine1 = originatorAddressLine1
            }

            /**
             * The drawdown request originator's address line 2. This is only necessary if you're
             * requesting a payment to a commingled account. Otherwise, we'll use the associated
             * entity's details.
             */
            fun originatorAddressLine2(originatorAddressLine2: String) =
                originatorAddressLine2(JsonField.of(originatorAddressLine2))

            /**
             * The drawdown request originator's address line 2. This is only necessary if you're
             * requesting a payment to a commingled account. Otherwise, we'll use the associated
             * entity's details.
             */
            fun originatorAddressLine2(originatorAddressLine2: JsonField<String>) = apply {
                this.originatorAddressLine2 = originatorAddressLine2
            }

            /**
             * The drawdown request originator's address line 3. This is only necessary if you're
             * requesting a payment to a commingled account. Otherwise, we'll use the associated
             * entity's details.
             */
            fun originatorAddressLine3(originatorAddressLine3: String) =
                originatorAddressLine3(JsonField.of(originatorAddressLine3))

            /**
             * The drawdown request originator's address line 3. This is only necessary if you're
             * requesting a payment to a commingled account. Otherwise, we'll use the associated
             * entity's details.
             */
            fun originatorAddressLine3(originatorAddressLine3: JsonField<String>) = apply {
                this.originatorAddressLine3 = originatorAddressLine3
            }

            /**
             * The drawdown request originator's name. This is only necessary if you're requesting a
             * payment to a commingled account. Otherwise, we'll use the associated entity's
             * details.
             */
            fun originatorName(originatorName: String) =
                originatorName(JsonField.of(originatorName))

            /**
             * The drawdown request originator's name. This is only necessary if you're requesting a
             * payment to a commingled account. Otherwise, we'll use the associated entity's
             * details.
             */
            fun originatorName(originatorName: JsonField<String>) = apply {
                this.originatorName = originatorName
            }

            /** Line 1 of the drawdown request's recipient's address. */
            fun recipientAddressLine1(recipientAddressLine1: String) =
                recipientAddressLine1(JsonField.of(recipientAddressLine1))

            /** Line 1 of the drawdown request's recipient's address. */
            fun recipientAddressLine1(recipientAddressLine1: JsonField<String>) = apply {
                this.recipientAddressLine1 = recipientAddressLine1
            }

            /** Line 2 of the drawdown request's recipient's address. */
            fun recipientAddressLine2(recipientAddressLine2: String) =
                recipientAddressLine2(JsonField.of(recipientAddressLine2))

            /** Line 2 of the drawdown request's recipient's address. */
            fun recipientAddressLine2(recipientAddressLine2: JsonField<String>) = apply {
                this.recipientAddressLine2 = recipientAddressLine2
            }

            /** Line 3 of the drawdown request's recipient's address. */
            fun recipientAddressLine3(recipientAddressLine3: String) =
                recipientAddressLine3(JsonField.of(recipientAddressLine3))

            /** Line 3 of the drawdown request's recipient's address. */
            fun recipientAddressLine3(recipientAddressLine3: JsonField<String>) = apply {
                this.recipientAddressLine3 = recipientAddressLine3
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

        private var body: WireDrawdownRequestCreateBody.Builder =
            WireDrawdownRequestCreateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(wireDrawdownRequestCreateParams: WireDrawdownRequestCreateParams) =
            apply {
                body = wireDrawdownRequestCreateParams.body.toBuilder()
                additionalHeaders = wireDrawdownRequestCreateParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    wireDrawdownRequestCreateParams.additionalQueryParams.toBuilder()
            }

        /** The Account Number to which the recipient should send funds. */
        fun accountNumberId(accountNumberId: String) = apply {
            body.accountNumberId(accountNumberId)
        }

        /** The Account Number to which the recipient should send funds. */
        fun accountNumberId(accountNumberId: JsonField<String>) = apply {
            body.accountNumberId(accountNumberId)
        }

        /** The amount requested from the recipient, in USD cents. */
        fun amount(amount: Long) = apply { body.amount(amount) }

        /** The amount requested from the recipient, in USD cents. */
        fun amount(amount: JsonField<Long>) = apply { body.amount(amount) }

        /** A message the recipient will see as part of the request. */
        fun messageToRecipient(messageToRecipient: String) = apply {
            body.messageToRecipient(messageToRecipient)
        }

        /** A message the recipient will see as part of the request. */
        fun messageToRecipient(messageToRecipient: JsonField<String>) = apply {
            body.messageToRecipient(messageToRecipient)
        }

        /** The drawdown request's recipient's account number. */
        fun recipientAccountNumber(recipientAccountNumber: String) = apply {
            body.recipientAccountNumber(recipientAccountNumber)
        }

        /** The drawdown request's recipient's account number. */
        fun recipientAccountNumber(recipientAccountNumber: JsonField<String>) = apply {
            body.recipientAccountNumber(recipientAccountNumber)
        }

        /** The drawdown request's recipient's name. */
        fun recipientName(recipientName: String) = apply { body.recipientName(recipientName) }

        /** The drawdown request's recipient's name. */
        fun recipientName(recipientName: JsonField<String>) = apply {
            body.recipientName(recipientName)
        }

        /** The drawdown request's recipient's routing number. */
        fun recipientRoutingNumber(recipientRoutingNumber: String) = apply {
            body.recipientRoutingNumber(recipientRoutingNumber)
        }

        /** The drawdown request's recipient's routing number. */
        fun recipientRoutingNumber(recipientRoutingNumber: JsonField<String>) = apply {
            body.recipientRoutingNumber(recipientRoutingNumber)
        }

        /**
         * The drawdown request originator's address line 1. This is only necessary if you're
         * requesting a payment to a commingled account. Otherwise, we'll use the associated
         * entity's details.
         */
        fun originatorAddressLine1(originatorAddressLine1: String) = apply {
            body.originatorAddressLine1(originatorAddressLine1)
        }

        /**
         * The drawdown request originator's address line 1. This is only necessary if you're
         * requesting a payment to a commingled account. Otherwise, we'll use the associated
         * entity's details.
         */
        fun originatorAddressLine1(originatorAddressLine1: JsonField<String>) = apply {
            body.originatorAddressLine1(originatorAddressLine1)
        }

        /**
         * The drawdown request originator's address line 2. This is only necessary if you're
         * requesting a payment to a commingled account. Otherwise, we'll use the associated
         * entity's details.
         */
        fun originatorAddressLine2(originatorAddressLine2: String) = apply {
            body.originatorAddressLine2(originatorAddressLine2)
        }

        /**
         * The drawdown request originator's address line 2. This is only necessary if you're
         * requesting a payment to a commingled account. Otherwise, we'll use the associated
         * entity's details.
         */
        fun originatorAddressLine2(originatorAddressLine2: JsonField<String>) = apply {
            body.originatorAddressLine2(originatorAddressLine2)
        }

        /**
         * The drawdown request originator's address line 3. This is only necessary if you're
         * requesting a payment to a commingled account. Otherwise, we'll use the associated
         * entity's details.
         */
        fun originatorAddressLine3(originatorAddressLine3: String) = apply {
            body.originatorAddressLine3(originatorAddressLine3)
        }

        /**
         * The drawdown request originator's address line 3. This is only necessary if you're
         * requesting a payment to a commingled account. Otherwise, we'll use the associated
         * entity's details.
         */
        fun originatorAddressLine3(originatorAddressLine3: JsonField<String>) = apply {
            body.originatorAddressLine3(originatorAddressLine3)
        }

        /**
         * The drawdown request originator's name. This is only necessary if you're requesting a
         * payment to a commingled account. Otherwise, we'll use the associated entity's details.
         */
        fun originatorName(originatorName: String) = apply { body.originatorName(originatorName) }

        /**
         * The drawdown request originator's name. This is only necessary if you're requesting a
         * payment to a commingled account. Otherwise, we'll use the associated entity's details.
         */
        fun originatorName(originatorName: JsonField<String>) = apply {
            body.originatorName(originatorName)
        }

        /** Line 1 of the drawdown request's recipient's address. */
        fun recipientAddressLine1(recipientAddressLine1: String) = apply {
            body.recipientAddressLine1(recipientAddressLine1)
        }

        /** Line 1 of the drawdown request's recipient's address. */
        fun recipientAddressLine1(recipientAddressLine1: JsonField<String>) = apply {
            body.recipientAddressLine1(recipientAddressLine1)
        }

        /** Line 2 of the drawdown request's recipient's address. */
        fun recipientAddressLine2(recipientAddressLine2: String) = apply {
            body.recipientAddressLine2(recipientAddressLine2)
        }

        /** Line 2 of the drawdown request's recipient's address. */
        fun recipientAddressLine2(recipientAddressLine2: JsonField<String>) = apply {
            body.recipientAddressLine2(recipientAddressLine2)
        }

        /** Line 3 of the drawdown request's recipient's address. */
        fun recipientAddressLine3(recipientAddressLine3: String) = apply {
            body.recipientAddressLine3(recipientAddressLine3)
        }

        /** Line 3 of the drawdown request's recipient's address. */
        fun recipientAddressLine3(recipientAddressLine3: JsonField<String>) = apply {
            body.recipientAddressLine3(recipientAddressLine3)
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

        fun build(): WireDrawdownRequestCreateParams =
            WireDrawdownRequestCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is WireDrawdownRequestCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "WireDrawdownRequestCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
