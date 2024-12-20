// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.increase.api.core.Enum
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.toImmutable
import com.increase.api.errors.IncreaseInvalidDataException
import java.util.Objects
import java.util.Optional

/**
 * Wire drawdown requests enable you to request that someone else send you a wire. This feature is
 * in beta; reach out to [support@increase.com](mailto:support@increase.com) to learn more.
 */
@JsonDeserialize(builder = WireDrawdownRequest.Builder::class)
@NoAutoDetect
class WireDrawdownRequest
private constructor(
    private val accountNumberId: JsonField<String>,
    private val amount: JsonField<Long>,
    private val currency: JsonField<String>,
    private val fulfillmentInboundWireTransferId: JsonField<String>,
    private val id: JsonField<String>,
    private val idempotencyKey: JsonField<String>,
    private val messageToRecipient: JsonField<String>,
    private val originatorAddressLine1: JsonField<String>,
    private val originatorAddressLine2: JsonField<String>,
    private val originatorAddressLine3: JsonField<String>,
    private val originatorName: JsonField<String>,
    private val recipientAccountNumber: JsonField<String>,
    private val recipientAddressLine1: JsonField<String>,
    private val recipientAddressLine2: JsonField<String>,
    private val recipientAddressLine3: JsonField<String>,
    private val recipientName: JsonField<String>,
    private val recipientRoutingNumber: JsonField<String>,
    private val status: JsonField<Status>,
    private val submission: JsonField<Submission>,
    private val type: JsonField<Type>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    /**
     * The Account Number to which the recipient of this request is being requested to send funds.
     */
    fun accountNumberId(): String = accountNumberId.getRequired("account_number_id")

    /** The amount being requested in cents. */
    fun amount(): Long = amount.getRequired("amount")

    /**
     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the amount being requested.
     * Will always be "USD".
     */
    fun currency(): String = currency.getRequired("currency")

    /**
     * If the recipient fulfills the drawdown request by sending funds, then this will be the
     * identifier of the corresponding Transaction.
     */
    fun fulfillmentInboundWireTransferId(): Optional<String> =
        Optional.ofNullable(
            fulfillmentInboundWireTransferId.getNullable("fulfillment_inbound_wire_transfer_id")
        )

    /** The Wire drawdown request identifier. */
    fun id(): String = id.getRequired("id")

    /**
     * The idempotency key you chose for this object. This value is unique across Increase and is
     * used to ensure that a request is only processed once. Learn more about
     * [idempotency](https://increase.com/documentation/idempotency-keys).
     */
    fun idempotencyKey(): Optional<String> =
        Optional.ofNullable(idempotencyKey.getNullable("idempotency_key"))

    /** The message the recipient will see as part of the drawdown request. */
    fun messageToRecipient(): String = messageToRecipient.getRequired("message_to_recipient")

    /** The originator's address line 1. */
    fun originatorAddressLine1(): Optional<String> =
        Optional.ofNullable(originatorAddressLine1.getNullable("originator_address_line1"))

    /** The originator's address line 2. */
    fun originatorAddressLine2(): Optional<String> =
        Optional.ofNullable(originatorAddressLine2.getNullable("originator_address_line2"))

    /** The originator's address line 3. */
    fun originatorAddressLine3(): Optional<String> =
        Optional.ofNullable(originatorAddressLine3.getNullable("originator_address_line3"))

    /** The originator's name. */
    fun originatorName(): Optional<String> =
        Optional.ofNullable(originatorName.getNullable("originator_name"))

    /** The drawdown request's recipient's account number. */
    fun recipientAccountNumber(): String =
        recipientAccountNumber.getRequired("recipient_account_number")

    /** Line 1 of the drawdown request's recipient's address. */
    fun recipientAddressLine1(): Optional<String> =
        Optional.ofNullable(recipientAddressLine1.getNullable("recipient_address_line1"))

    /** Line 2 of the drawdown request's recipient's address. */
    fun recipientAddressLine2(): Optional<String> =
        Optional.ofNullable(recipientAddressLine2.getNullable("recipient_address_line2"))

    /** Line 3 of the drawdown request's recipient's address. */
    fun recipientAddressLine3(): Optional<String> =
        Optional.ofNullable(recipientAddressLine3.getNullable("recipient_address_line3"))

    /** The drawdown request's recipient's name. */
    fun recipientName(): Optional<String> =
        Optional.ofNullable(recipientName.getNullable("recipient_name"))

    /** The drawdown request's recipient's routing number. */
    fun recipientRoutingNumber(): String =
        recipientRoutingNumber.getRequired("recipient_routing_number")

    /** The lifecycle status of the drawdown request. */
    fun status(): Status = status.getRequired("status")

    /**
     * After the drawdown request is submitted to Fedwire, this will contain supplemental details.
     */
    fun submission(): Optional<Submission> =
        Optional.ofNullable(submission.getNullable("submission"))

    /**
     * A constant representing the object's type. For this resource it will always be
     * `wire_drawdown_request`.
     */
    fun type(): Type = type.getRequired("type")

    /**
     * The Account Number to which the recipient of this request is being requested to send funds.
     */
    @JsonProperty("account_number_id") @ExcludeMissing fun _accountNumberId() = accountNumberId

    /** The amount being requested in cents. */
    @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

    /**
     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the amount being requested.
     * Will always be "USD".
     */
    @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

    /**
     * If the recipient fulfills the drawdown request by sending funds, then this will be the
     * identifier of the corresponding Transaction.
     */
    @JsonProperty("fulfillment_inbound_wire_transfer_id")
    @ExcludeMissing
    fun _fulfillmentInboundWireTransferId() = fulfillmentInboundWireTransferId

    /** The Wire drawdown request identifier. */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /**
     * The idempotency key you chose for this object. This value is unique across Increase and is
     * used to ensure that a request is only processed once. Learn more about
     * [idempotency](https://increase.com/documentation/idempotency-keys).
     */
    @JsonProperty("idempotency_key") @ExcludeMissing fun _idempotencyKey() = idempotencyKey

    /** The message the recipient will see as part of the drawdown request. */
    @JsonProperty("message_to_recipient")
    @ExcludeMissing
    fun _messageToRecipient() = messageToRecipient

    /** The originator's address line 1. */
    @JsonProperty("originator_address_line1")
    @ExcludeMissing
    fun _originatorAddressLine1() = originatorAddressLine1

    /** The originator's address line 2. */
    @JsonProperty("originator_address_line2")
    @ExcludeMissing
    fun _originatorAddressLine2() = originatorAddressLine2

    /** The originator's address line 3. */
    @JsonProperty("originator_address_line3")
    @ExcludeMissing
    fun _originatorAddressLine3() = originatorAddressLine3

    /** The originator's name. */
    @JsonProperty("originator_name") @ExcludeMissing fun _originatorName() = originatorName

    /** The drawdown request's recipient's account number. */
    @JsonProperty("recipient_account_number")
    @ExcludeMissing
    fun _recipientAccountNumber() = recipientAccountNumber

    /** Line 1 of the drawdown request's recipient's address. */
    @JsonProperty("recipient_address_line1")
    @ExcludeMissing
    fun _recipientAddressLine1() = recipientAddressLine1

    /** Line 2 of the drawdown request's recipient's address. */
    @JsonProperty("recipient_address_line2")
    @ExcludeMissing
    fun _recipientAddressLine2() = recipientAddressLine2

    /** Line 3 of the drawdown request's recipient's address. */
    @JsonProperty("recipient_address_line3")
    @ExcludeMissing
    fun _recipientAddressLine3() = recipientAddressLine3

    /** The drawdown request's recipient's name. */
    @JsonProperty("recipient_name") @ExcludeMissing fun _recipientName() = recipientName

    /** The drawdown request's recipient's routing number. */
    @JsonProperty("recipient_routing_number")
    @ExcludeMissing
    fun _recipientRoutingNumber() = recipientRoutingNumber

    /** The lifecycle status of the drawdown request. */
    @JsonProperty("status") @ExcludeMissing fun _status() = status

    /**
     * After the drawdown request is submitted to Fedwire, this will contain supplemental details.
     */
    @JsonProperty("submission") @ExcludeMissing fun _submission() = submission

    /**
     * A constant representing the object's type. For this resource it will always be
     * `wire_drawdown_request`.
     */
    @JsonProperty("type") @ExcludeMissing fun _type() = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): WireDrawdownRequest = apply {
        if (!validated) {
            accountNumberId()
            amount()
            currency()
            fulfillmentInboundWireTransferId()
            id()
            idempotencyKey()
            messageToRecipient()
            originatorAddressLine1()
            originatorAddressLine2()
            originatorAddressLine3()
            originatorName()
            recipientAccountNumber()
            recipientAddressLine1()
            recipientAddressLine2()
            recipientAddressLine3()
            recipientName()
            recipientRoutingNumber()
            status()
            submission().map { it.validate() }
            type()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var accountNumberId: JsonField<String> = JsonMissing.of()
        private var amount: JsonField<Long> = JsonMissing.of()
        private var currency: JsonField<String> = JsonMissing.of()
        private var fulfillmentInboundWireTransferId: JsonField<String> = JsonMissing.of()
        private var id: JsonField<String> = JsonMissing.of()
        private var idempotencyKey: JsonField<String> = JsonMissing.of()
        private var messageToRecipient: JsonField<String> = JsonMissing.of()
        private var originatorAddressLine1: JsonField<String> = JsonMissing.of()
        private var originatorAddressLine2: JsonField<String> = JsonMissing.of()
        private var originatorAddressLine3: JsonField<String> = JsonMissing.of()
        private var originatorName: JsonField<String> = JsonMissing.of()
        private var recipientAccountNumber: JsonField<String> = JsonMissing.of()
        private var recipientAddressLine1: JsonField<String> = JsonMissing.of()
        private var recipientAddressLine2: JsonField<String> = JsonMissing.of()
        private var recipientAddressLine3: JsonField<String> = JsonMissing.of()
        private var recipientName: JsonField<String> = JsonMissing.of()
        private var recipientRoutingNumber: JsonField<String> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var submission: JsonField<Submission> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(wireDrawdownRequest: WireDrawdownRequest) = apply {
            accountNumberId = wireDrawdownRequest.accountNumberId
            amount = wireDrawdownRequest.amount
            currency = wireDrawdownRequest.currency
            fulfillmentInboundWireTransferId = wireDrawdownRequest.fulfillmentInboundWireTransferId
            id = wireDrawdownRequest.id
            idempotencyKey = wireDrawdownRequest.idempotencyKey
            messageToRecipient = wireDrawdownRequest.messageToRecipient
            originatorAddressLine1 = wireDrawdownRequest.originatorAddressLine1
            originatorAddressLine2 = wireDrawdownRequest.originatorAddressLine2
            originatorAddressLine3 = wireDrawdownRequest.originatorAddressLine3
            originatorName = wireDrawdownRequest.originatorName
            recipientAccountNumber = wireDrawdownRequest.recipientAccountNumber
            recipientAddressLine1 = wireDrawdownRequest.recipientAddressLine1
            recipientAddressLine2 = wireDrawdownRequest.recipientAddressLine2
            recipientAddressLine3 = wireDrawdownRequest.recipientAddressLine3
            recipientName = wireDrawdownRequest.recipientName
            recipientRoutingNumber = wireDrawdownRequest.recipientRoutingNumber
            status = wireDrawdownRequest.status
            submission = wireDrawdownRequest.submission
            type = wireDrawdownRequest.type
            additionalProperties = wireDrawdownRequest.additionalProperties.toMutableMap()
        }

        /**
         * The Account Number to which the recipient of this request is being requested to send
         * funds.
         */
        fun accountNumberId(accountNumberId: String) =
            accountNumberId(JsonField.of(accountNumberId))

        /**
         * The Account Number to which the recipient of this request is being requested to send
         * funds.
         */
        @JsonProperty("account_number_id")
        @ExcludeMissing
        fun accountNumberId(accountNumberId: JsonField<String>) = apply {
            this.accountNumberId = accountNumberId
        }

        /** The amount being requested in cents. */
        fun amount(amount: Long) = amount(JsonField.of(amount))

        /** The amount being requested in cents. */
        @JsonProperty("amount")
        @ExcludeMissing
        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the amount being
         * requested. Will always be "USD".
         */
        fun currency(currency: String) = currency(JsonField.of(currency))

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the amount being
         * requested. Will always be "USD".
         */
        @JsonProperty("currency")
        @ExcludeMissing
        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

        /**
         * If the recipient fulfills the drawdown request by sending funds, then this will be the
         * identifier of the corresponding Transaction.
         */
        fun fulfillmentInboundWireTransferId(fulfillmentInboundWireTransferId: String) =
            fulfillmentInboundWireTransferId(JsonField.of(fulfillmentInboundWireTransferId))

        /**
         * If the recipient fulfills the drawdown request by sending funds, then this will be the
         * identifier of the corresponding Transaction.
         */
        @JsonProperty("fulfillment_inbound_wire_transfer_id")
        @ExcludeMissing
        fun fulfillmentInboundWireTransferId(fulfillmentInboundWireTransferId: JsonField<String>) =
            apply {
                this.fulfillmentInboundWireTransferId = fulfillmentInboundWireTransferId
            }

        /** The Wire drawdown request identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The Wire drawdown request identifier. */
        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * The idempotency key you chose for this object. This value is unique across Increase and
         * is used to ensure that a request is only processed once. Learn more about
         * [idempotency](https://increase.com/documentation/idempotency-keys).
         */
        fun idempotencyKey(idempotencyKey: String) = idempotencyKey(JsonField.of(idempotencyKey))

        /**
         * The idempotency key you chose for this object. This value is unique across Increase and
         * is used to ensure that a request is only processed once. Learn more about
         * [idempotency](https://increase.com/documentation/idempotency-keys).
         */
        @JsonProperty("idempotency_key")
        @ExcludeMissing
        fun idempotencyKey(idempotencyKey: JsonField<String>) = apply {
            this.idempotencyKey = idempotencyKey
        }

        /** The message the recipient will see as part of the drawdown request. */
        fun messageToRecipient(messageToRecipient: String) =
            messageToRecipient(JsonField.of(messageToRecipient))

        /** The message the recipient will see as part of the drawdown request. */
        @JsonProperty("message_to_recipient")
        @ExcludeMissing
        fun messageToRecipient(messageToRecipient: JsonField<String>) = apply {
            this.messageToRecipient = messageToRecipient
        }

        /** The originator's address line 1. */
        fun originatorAddressLine1(originatorAddressLine1: String) =
            originatorAddressLine1(JsonField.of(originatorAddressLine1))

        /** The originator's address line 1. */
        @JsonProperty("originator_address_line1")
        @ExcludeMissing
        fun originatorAddressLine1(originatorAddressLine1: JsonField<String>) = apply {
            this.originatorAddressLine1 = originatorAddressLine1
        }

        /** The originator's address line 2. */
        fun originatorAddressLine2(originatorAddressLine2: String) =
            originatorAddressLine2(JsonField.of(originatorAddressLine2))

        /** The originator's address line 2. */
        @JsonProperty("originator_address_line2")
        @ExcludeMissing
        fun originatorAddressLine2(originatorAddressLine2: JsonField<String>) = apply {
            this.originatorAddressLine2 = originatorAddressLine2
        }

        /** The originator's address line 3. */
        fun originatorAddressLine3(originatorAddressLine3: String) =
            originatorAddressLine3(JsonField.of(originatorAddressLine3))

        /** The originator's address line 3. */
        @JsonProperty("originator_address_line3")
        @ExcludeMissing
        fun originatorAddressLine3(originatorAddressLine3: JsonField<String>) = apply {
            this.originatorAddressLine3 = originatorAddressLine3
        }

        /** The originator's name. */
        fun originatorName(originatorName: String) = originatorName(JsonField.of(originatorName))

        /** The originator's name. */
        @JsonProperty("originator_name")
        @ExcludeMissing
        fun originatorName(originatorName: JsonField<String>) = apply {
            this.originatorName = originatorName
        }

        /** The drawdown request's recipient's account number. */
        fun recipientAccountNumber(recipientAccountNumber: String) =
            recipientAccountNumber(JsonField.of(recipientAccountNumber))

        /** The drawdown request's recipient's account number. */
        @JsonProperty("recipient_account_number")
        @ExcludeMissing
        fun recipientAccountNumber(recipientAccountNumber: JsonField<String>) = apply {
            this.recipientAccountNumber = recipientAccountNumber
        }

        /** Line 1 of the drawdown request's recipient's address. */
        fun recipientAddressLine1(recipientAddressLine1: String) =
            recipientAddressLine1(JsonField.of(recipientAddressLine1))

        /** Line 1 of the drawdown request's recipient's address. */
        @JsonProperty("recipient_address_line1")
        @ExcludeMissing
        fun recipientAddressLine1(recipientAddressLine1: JsonField<String>) = apply {
            this.recipientAddressLine1 = recipientAddressLine1
        }

        /** Line 2 of the drawdown request's recipient's address. */
        fun recipientAddressLine2(recipientAddressLine2: String) =
            recipientAddressLine2(JsonField.of(recipientAddressLine2))

        /** Line 2 of the drawdown request's recipient's address. */
        @JsonProperty("recipient_address_line2")
        @ExcludeMissing
        fun recipientAddressLine2(recipientAddressLine2: JsonField<String>) = apply {
            this.recipientAddressLine2 = recipientAddressLine2
        }

        /** Line 3 of the drawdown request's recipient's address. */
        fun recipientAddressLine3(recipientAddressLine3: String) =
            recipientAddressLine3(JsonField.of(recipientAddressLine3))

        /** Line 3 of the drawdown request's recipient's address. */
        @JsonProperty("recipient_address_line3")
        @ExcludeMissing
        fun recipientAddressLine3(recipientAddressLine3: JsonField<String>) = apply {
            this.recipientAddressLine3 = recipientAddressLine3
        }

        /** The drawdown request's recipient's name. */
        fun recipientName(recipientName: String) = recipientName(JsonField.of(recipientName))

        /** The drawdown request's recipient's name. */
        @JsonProperty("recipient_name")
        @ExcludeMissing
        fun recipientName(recipientName: JsonField<String>) = apply {
            this.recipientName = recipientName
        }

        /** The drawdown request's recipient's routing number. */
        fun recipientRoutingNumber(recipientRoutingNumber: String) =
            recipientRoutingNumber(JsonField.of(recipientRoutingNumber))

        /** The drawdown request's recipient's routing number. */
        @JsonProperty("recipient_routing_number")
        @ExcludeMissing
        fun recipientRoutingNumber(recipientRoutingNumber: JsonField<String>) = apply {
            this.recipientRoutingNumber = recipientRoutingNumber
        }

        /** The lifecycle status of the drawdown request. */
        fun status(status: Status) = status(JsonField.of(status))

        /** The lifecycle status of the drawdown request. */
        @JsonProperty("status")
        @ExcludeMissing
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /**
         * After the drawdown request is submitted to Fedwire, this will contain supplemental
         * details.
         */
        fun submission(submission: Submission) = submission(JsonField.of(submission))

        /**
         * After the drawdown request is submitted to Fedwire, this will contain supplemental
         * details.
         */
        @JsonProperty("submission")
        @ExcludeMissing
        fun submission(submission: JsonField<Submission>) = apply { this.submission = submission }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `wire_drawdown_request`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * A constant representing the object's type. For this resource it will always be
         * `wire_drawdown_request`.
         */
        @JsonProperty("type")
        @ExcludeMissing
        fun type(type: JsonField<Type>) = apply { this.type = type }

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

        fun build(): WireDrawdownRequest =
            WireDrawdownRequest(
                accountNumberId,
                amount,
                currency,
                fulfillmentInboundWireTransferId,
                id,
                idempotencyKey,
                messageToRecipient,
                originatorAddressLine1,
                originatorAddressLine2,
                originatorAddressLine3,
                originatorName,
                recipientAccountNumber,
                recipientAddressLine1,
                recipientAddressLine2,
                recipientAddressLine3,
                recipientName,
                recipientRoutingNumber,
                status,
                submission,
                type,
                additionalProperties.toImmutable(),
            )
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val PENDING_SUBMISSION = of("pending_submission")

            @JvmField val PENDING_RESPONSE = of("pending_response")

            @JvmField val FULFILLED = of("fulfilled")

            @JvmField val REFUSED = of("refused")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            PENDING_SUBMISSION,
            PENDING_RESPONSE,
            FULFILLED,
            REFUSED,
        }

        enum class Value {
            PENDING_SUBMISSION,
            PENDING_RESPONSE,
            FULFILLED,
            REFUSED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                PENDING_SUBMISSION -> Value.PENDING_SUBMISSION
                PENDING_RESPONSE -> Value.PENDING_RESPONSE
                FULFILLED -> Value.FULFILLED
                REFUSED -> Value.REFUSED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                PENDING_SUBMISSION -> Known.PENDING_SUBMISSION
                PENDING_RESPONSE -> Known.PENDING_RESPONSE
                FULFILLED -> Known.FULFILLED
                REFUSED -> Known.REFUSED
                else -> throw IncreaseInvalidDataException("Unknown Status: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Status && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * After the drawdown request is submitted to Fedwire, this will contain supplemental details.
     */
    @JsonDeserialize(builder = Submission.Builder::class)
    @NoAutoDetect
    class Submission
    private constructor(
        private val inputMessageAccountabilityData: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /**
         * The input message accountability data (IMAD) uniquely identifying the submission with
         * Fedwire.
         */
        fun inputMessageAccountabilityData(): String =
            inputMessageAccountabilityData.getRequired("input_message_accountability_data")

        /**
         * The input message accountability data (IMAD) uniquely identifying the submission with
         * Fedwire.
         */
        @JsonProperty("input_message_accountability_data")
        @ExcludeMissing
        fun _inputMessageAccountabilityData() = inputMessageAccountabilityData

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Submission = apply {
            if (!validated) {
                inputMessageAccountabilityData()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var inputMessageAccountabilityData: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(submission: Submission) = apply {
                inputMessageAccountabilityData = submission.inputMessageAccountabilityData
                additionalProperties = submission.additionalProperties.toMutableMap()
            }

            /**
             * The input message accountability data (IMAD) uniquely identifying the submission with
             * Fedwire.
             */
            fun inputMessageAccountabilityData(inputMessageAccountabilityData: String) =
                inputMessageAccountabilityData(JsonField.of(inputMessageAccountabilityData))

            /**
             * The input message accountability data (IMAD) uniquely identifying the submission with
             * Fedwire.
             */
            @JsonProperty("input_message_accountability_data")
            @ExcludeMissing
            fun inputMessageAccountabilityData(inputMessageAccountabilityData: JsonField<String>) =
                apply {
                    this.inputMessageAccountabilityData = inputMessageAccountabilityData
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

            fun build(): Submission =
                Submission(inputMessageAccountabilityData, additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Submission && inputMessageAccountabilityData == other.inputMessageAccountabilityData && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(inputMessageAccountabilityData, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Submission{inputMessageAccountabilityData=$inputMessageAccountabilityData, additionalProperties=$additionalProperties}"
    }

    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val WIRE_DRAWDOWN_REQUEST = of("wire_drawdown_request")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            WIRE_DRAWDOWN_REQUEST,
        }

        enum class Value {
            WIRE_DRAWDOWN_REQUEST,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                WIRE_DRAWDOWN_REQUEST -> Value.WIRE_DRAWDOWN_REQUEST
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                WIRE_DRAWDOWN_REQUEST -> Known.WIRE_DRAWDOWN_REQUEST
                else -> throw IncreaseInvalidDataException("Unknown Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Type && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is WireDrawdownRequest && accountNumberId == other.accountNumberId && amount == other.amount && currency == other.currency && fulfillmentInboundWireTransferId == other.fulfillmentInboundWireTransferId && id == other.id && idempotencyKey == other.idempotencyKey && messageToRecipient == other.messageToRecipient && originatorAddressLine1 == other.originatorAddressLine1 && originatorAddressLine2 == other.originatorAddressLine2 && originatorAddressLine3 == other.originatorAddressLine3 && originatorName == other.originatorName && recipientAccountNumber == other.recipientAccountNumber && recipientAddressLine1 == other.recipientAddressLine1 && recipientAddressLine2 == other.recipientAddressLine2 && recipientAddressLine3 == other.recipientAddressLine3 && recipientName == other.recipientName && recipientRoutingNumber == other.recipientRoutingNumber && status == other.status && submission == other.submission && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(accountNumberId, amount, currency, fulfillmentInboundWireTransferId, id, idempotencyKey, messageToRecipient, originatorAddressLine1, originatorAddressLine2, originatorAddressLine3, originatorName, recipientAccountNumber, recipientAddressLine1, recipientAddressLine2, recipientAddressLine3, recipientName, recipientRoutingNumber, status, submission, type, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "WireDrawdownRequest{accountNumberId=$accountNumberId, amount=$amount, currency=$currency, fulfillmentInboundWireTransferId=$fulfillmentInboundWireTransferId, id=$id, idempotencyKey=$idempotencyKey, messageToRecipient=$messageToRecipient, originatorAddressLine1=$originatorAddressLine1, originatorAddressLine2=$originatorAddressLine2, originatorAddressLine3=$originatorAddressLine3, originatorName=$originatorName, recipientAccountNumber=$recipientAccountNumber, recipientAddressLine1=$recipientAddressLine1, recipientAddressLine2=$recipientAddressLine2, recipientAddressLine3=$recipientAddressLine3, recipientName=$recipientName, recipientRoutingNumber=$recipientRoutingNumber, status=$status, submission=$submission, type=$type, additionalProperties=$additionalProperties}"
}
