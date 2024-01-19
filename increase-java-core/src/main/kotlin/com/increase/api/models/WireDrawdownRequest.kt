// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.toUnmodifiable
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
    private val type: JsonField<Type>,
    private val id: JsonField<String>,
    private val accountNumberId: JsonField<String>,
    private val recipientAccountNumber: JsonField<String>,
    private val recipientRoutingNumber: JsonField<String>,
    private val amount: JsonField<Long>,
    private val currency: JsonField<String>,
    private val messageToRecipient: JsonField<String>,
    private val recipientName: JsonField<String>,
    private val recipientAddressLine1: JsonField<String>,
    private val recipientAddressLine2: JsonField<String>,
    private val recipientAddressLine3: JsonField<String>,
    private val originatorName: JsonField<String>,
    private val originatorAddressLine1: JsonField<String>,
    private val originatorAddressLine2: JsonField<String>,
    private val originatorAddressLine3: JsonField<String>,
    private val submission: JsonField<Submission>,
    private val fulfillmentTransactionId: JsonField<String>,
    private val status: JsonField<Status>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /**
     * A constant representing the object's type. For this resource it will always be
     * `wire_drawdown_request`.
     */
    fun type(): Type = type.getRequired("type")

    /** The Wire drawdown request identifier. */
    fun id(): String = id.getRequired("id")

    /**
     * The Account Number to which the recipient of this request is being requested to send funds.
     */
    fun accountNumberId(): String = accountNumberId.getRequired("account_number_id")

    /** The drawdown request's recipient's account number. */
    fun recipientAccountNumber(): String =
        recipientAccountNumber.getRequired("recipient_account_number")

    /** The drawdown request's recipient's routing number. */
    fun recipientRoutingNumber(): String =
        recipientRoutingNumber.getRequired("recipient_routing_number")

    /** The amount being requested in cents. */
    fun amount(): Long = amount.getRequired("amount")

    /**
     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the amount being requested.
     * Will always be "USD".
     */
    fun currency(): String = currency.getRequired("currency")

    /** The message the recipient will see as part of the drawdown request. */
    fun messageToRecipient(): String = messageToRecipient.getRequired("message_to_recipient")

    /** The drawdown request's recipient's name. */
    fun recipientName(): Optional<String> =
        Optional.ofNullable(recipientName.getNullable("recipient_name"))

    /** Line 1 of the drawdown request's recipient's address. */
    fun recipientAddressLine1(): Optional<String> =
        Optional.ofNullable(recipientAddressLine1.getNullable("recipient_address_line1"))

    /** Line 2 of the drawdown request's recipient's address. */
    fun recipientAddressLine2(): Optional<String> =
        Optional.ofNullable(recipientAddressLine2.getNullable("recipient_address_line2"))

    /** Line 3 of the drawdown request's recipient's address. */
    fun recipientAddressLine3(): Optional<String> =
        Optional.ofNullable(recipientAddressLine3.getNullable("recipient_address_line3"))

    /** The originator's name. */
    fun originatorName(): Optional<String> =
        Optional.ofNullable(originatorName.getNullable("originator_name"))

    /** The originator's address line 1. */
    fun originatorAddressLine1(): Optional<String> =
        Optional.ofNullable(originatorAddressLine1.getNullable("originator_address_line1"))

    /** The originator's address line 2. */
    fun originatorAddressLine2(): Optional<String> =
        Optional.ofNullable(originatorAddressLine2.getNullable("originator_address_line2"))

    /** The originator's address line 3. */
    fun originatorAddressLine3(): Optional<String> =
        Optional.ofNullable(originatorAddressLine3.getNullable("originator_address_line3"))

    /**
     * After the drawdown request is submitted to Fedwire, this will contain supplemental details.
     */
    fun submission(): Optional<Submission> =
        Optional.ofNullable(submission.getNullable("submission"))

    /**
     * If the recipient fulfills the drawdown request by sending funds, then this will be the
     * identifier of the corresponding Transaction.
     */
    fun fulfillmentTransactionId(): Optional<String> =
        Optional.ofNullable(fulfillmentTransactionId.getNullable("fulfillment_transaction_id"))

    /** The lifecycle status of the drawdown request. */
    fun status(): Status = status.getRequired("status")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `wire_drawdown_request`.
     */
    @JsonProperty("type") @ExcludeMissing fun _type() = type

    /** The Wire drawdown request identifier. */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /**
     * The Account Number to which the recipient of this request is being requested to send funds.
     */
    @JsonProperty("account_number_id") @ExcludeMissing fun _accountNumberId() = accountNumberId

    /** The drawdown request's recipient's account number. */
    @JsonProperty("recipient_account_number")
    @ExcludeMissing
    fun _recipientAccountNumber() = recipientAccountNumber

    /** The drawdown request's recipient's routing number. */
    @JsonProperty("recipient_routing_number")
    @ExcludeMissing
    fun _recipientRoutingNumber() = recipientRoutingNumber

    /** The amount being requested in cents. */
    @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

    /**
     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the amount being requested.
     * Will always be "USD".
     */
    @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

    /** The message the recipient will see as part of the drawdown request. */
    @JsonProperty("message_to_recipient")
    @ExcludeMissing
    fun _messageToRecipient() = messageToRecipient

    /** The drawdown request's recipient's name. */
    @JsonProperty("recipient_name") @ExcludeMissing fun _recipientName() = recipientName

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

    /** The originator's name. */
    @JsonProperty("originator_name") @ExcludeMissing fun _originatorName() = originatorName

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

    /**
     * After the drawdown request is submitted to Fedwire, this will contain supplemental details.
     */
    @JsonProperty("submission") @ExcludeMissing fun _submission() = submission

    /**
     * If the recipient fulfills the drawdown request by sending funds, then this will be the
     * identifier of the corresponding Transaction.
     */
    @JsonProperty("fulfillment_transaction_id")
    @ExcludeMissing
    fun _fulfillmentTransactionId() = fulfillmentTransactionId

    /** The lifecycle status of the drawdown request. */
    @JsonProperty("status") @ExcludeMissing fun _status() = status

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): WireDrawdownRequest = apply {
        if (!validated) {
            type()
            id()
            accountNumberId()
            recipientAccountNumber()
            recipientRoutingNumber()
            amount()
            currency()
            messageToRecipient()
            recipientName()
            recipientAddressLine1()
            recipientAddressLine2()
            recipientAddressLine3()
            originatorName()
            originatorAddressLine1()
            originatorAddressLine2()
            originatorAddressLine3()
            submission().map { it.validate() }
            fulfillmentTransactionId()
            status()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is WireDrawdownRequest &&
            this.type == other.type &&
            this.id == other.id &&
            this.accountNumberId == other.accountNumberId &&
            this.recipientAccountNumber == other.recipientAccountNumber &&
            this.recipientRoutingNumber == other.recipientRoutingNumber &&
            this.amount == other.amount &&
            this.currency == other.currency &&
            this.messageToRecipient == other.messageToRecipient &&
            this.recipientName == other.recipientName &&
            this.recipientAddressLine1 == other.recipientAddressLine1 &&
            this.recipientAddressLine2 == other.recipientAddressLine2 &&
            this.recipientAddressLine3 == other.recipientAddressLine3 &&
            this.originatorName == other.originatorName &&
            this.originatorAddressLine1 == other.originatorAddressLine1 &&
            this.originatorAddressLine2 == other.originatorAddressLine2 &&
            this.originatorAddressLine3 == other.originatorAddressLine3 &&
            this.submission == other.submission &&
            this.fulfillmentTransactionId == other.fulfillmentTransactionId &&
            this.status == other.status &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    type,
                    id,
                    accountNumberId,
                    recipientAccountNumber,
                    recipientRoutingNumber,
                    amount,
                    currency,
                    messageToRecipient,
                    recipientName,
                    recipientAddressLine1,
                    recipientAddressLine2,
                    recipientAddressLine3,
                    originatorName,
                    originatorAddressLine1,
                    originatorAddressLine2,
                    originatorAddressLine3,
                    submission,
                    fulfillmentTransactionId,
                    status,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "WireDrawdownRequest{type=$type, id=$id, accountNumberId=$accountNumberId, recipientAccountNumber=$recipientAccountNumber, recipientRoutingNumber=$recipientRoutingNumber, amount=$amount, currency=$currency, messageToRecipient=$messageToRecipient, recipientName=$recipientName, recipientAddressLine1=$recipientAddressLine1, recipientAddressLine2=$recipientAddressLine2, recipientAddressLine3=$recipientAddressLine3, originatorName=$originatorName, originatorAddressLine1=$originatorAddressLine1, originatorAddressLine2=$originatorAddressLine2, originatorAddressLine3=$originatorAddressLine3, submission=$submission, fulfillmentTransactionId=$fulfillmentTransactionId, status=$status, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var type: JsonField<Type> = JsonMissing.of()
        private var id: JsonField<String> = JsonMissing.of()
        private var accountNumberId: JsonField<String> = JsonMissing.of()
        private var recipientAccountNumber: JsonField<String> = JsonMissing.of()
        private var recipientRoutingNumber: JsonField<String> = JsonMissing.of()
        private var amount: JsonField<Long> = JsonMissing.of()
        private var currency: JsonField<String> = JsonMissing.of()
        private var messageToRecipient: JsonField<String> = JsonMissing.of()
        private var recipientName: JsonField<String> = JsonMissing.of()
        private var recipientAddressLine1: JsonField<String> = JsonMissing.of()
        private var recipientAddressLine2: JsonField<String> = JsonMissing.of()
        private var recipientAddressLine3: JsonField<String> = JsonMissing.of()
        private var originatorName: JsonField<String> = JsonMissing.of()
        private var originatorAddressLine1: JsonField<String> = JsonMissing.of()
        private var originatorAddressLine2: JsonField<String> = JsonMissing.of()
        private var originatorAddressLine3: JsonField<String> = JsonMissing.of()
        private var submission: JsonField<Submission> = JsonMissing.of()
        private var fulfillmentTransactionId: JsonField<String> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(wireDrawdownRequest: WireDrawdownRequest) = apply {
            this.type = wireDrawdownRequest.type
            this.id = wireDrawdownRequest.id
            this.accountNumberId = wireDrawdownRequest.accountNumberId
            this.recipientAccountNumber = wireDrawdownRequest.recipientAccountNumber
            this.recipientRoutingNumber = wireDrawdownRequest.recipientRoutingNumber
            this.amount = wireDrawdownRequest.amount
            this.currency = wireDrawdownRequest.currency
            this.messageToRecipient = wireDrawdownRequest.messageToRecipient
            this.recipientName = wireDrawdownRequest.recipientName
            this.recipientAddressLine1 = wireDrawdownRequest.recipientAddressLine1
            this.recipientAddressLine2 = wireDrawdownRequest.recipientAddressLine2
            this.recipientAddressLine3 = wireDrawdownRequest.recipientAddressLine3
            this.originatorName = wireDrawdownRequest.originatorName
            this.originatorAddressLine1 = wireDrawdownRequest.originatorAddressLine1
            this.originatorAddressLine2 = wireDrawdownRequest.originatorAddressLine2
            this.originatorAddressLine3 = wireDrawdownRequest.originatorAddressLine3
            this.submission = wireDrawdownRequest.submission
            this.fulfillmentTransactionId = wireDrawdownRequest.fulfillmentTransactionId
            this.status = wireDrawdownRequest.status
            additionalProperties(wireDrawdownRequest.additionalProperties)
        }

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

        /** The Wire drawdown request identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The Wire drawdown request identifier. */
        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

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

        /** The drawdown request's recipient's account number. */
        fun recipientAccountNumber(recipientAccountNumber: String) =
            recipientAccountNumber(JsonField.of(recipientAccountNumber))

        /** The drawdown request's recipient's account number. */
        @JsonProperty("recipient_account_number")
        @ExcludeMissing
        fun recipientAccountNumber(recipientAccountNumber: JsonField<String>) = apply {
            this.recipientAccountNumber = recipientAccountNumber
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

        /** The message the recipient will see as part of the drawdown request. */
        fun messageToRecipient(messageToRecipient: String) =
            messageToRecipient(JsonField.of(messageToRecipient))

        /** The message the recipient will see as part of the drawdown request. */
        @JsonProperty("message_to_recipient")
        @ExcludeMissing
        fun messageToRecipient(messageToRecipient: JsonField<String>) = apply {
            this.messageToRecipient = messageToRecipient
        }

        /** The drawdown request's recipient's name. */
        fun recipientName(recipientName: String) = recipientName(JsonField.of(recipientName))

        /** The drawdown request's recipient's name. */
        @JsonProperty("recipient_name")
        @ExcludeMissing
        fun recipientName(recipientName: JsonField<String>) = apply {
            this.recipientName = recipientName
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

        /** The originator's name. */
        fun originatorName(originatorName: String) = originatorName(JsonField.of(originatorName))

        /** The originator's name. */
        @JsonProperty("originator_name")
        @ExcludeMissing
        fun originatorName(originatorName: JsonField<String>) = apply {
            this.originatorName = originatorName
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
         * If the recipient fulfills the drawdown request by sending funds, then this will be the
         * identifier of the corresponding Transaction.
         */
        fun fulfillmentTransactionId(fulfillmentTransactionId: String) =
            fulfillmentTransactionId(JsonField.of(fulfillmentTransactionId))

        /**
         * If the recipient fulfills the drawdown request by sending funds, then this will be the
         * identifier of the corresponding Transaction.
         */
        @JsonProperty("fulfillment_transaction_id")
        @ExcludeMissing
        fun fulfillmentTransactionId(fulfillmentTransactionId: JsonField<String>) = apply {
            this.fulfillmentTransactionId = fulfillmentTransactionId
        }

        /** The lifecycle status of the drawdown request. */
        fun status(status: Status) = status(JsonField.of(status))

        /** The lifecycle status of the drawdown request. */
        @JsonProperty("status")
        @ExcludeMissing
        fun status(status: JsonField<Status>) = apply { this.status = status }

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

        fun build(): WireDrawdownRequest =
            WireDrawdownRequest(
                type,
                id,
                accountNumberId,
                recipientAccountNumber,
                recipientRoutingNumber,
                amount,
                currency,
                messageToRecipient,
                recipientName,
                recipientAddressLine1,
                recipientAddressLine2,
                recipientAddressLine3,
                originatorName,
                originatorAddressLine1,
                originatorAddressLine2,
                originatorAddressLine3,
                submission,
                fulfillmentTransactionId,
                status,
                additionalProperties.toUnmodifiable(),
            )
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Status && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val PENDING_SUBMISSION = Status(JsonField.of("pending_submission"))

            @JvmField val PENDING_RESPONSE = Status(JsonField.of("pending_response"))

            @JvmField val FULFILLED = Status(JsonField.of("fulfilled"))

            @JvmField val REFUSED = Status(JsonField.of("refused"))

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

        private var validated: Boolean = false

        private var hashCode: Int = 0

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

        fun validate(): Submission = apply {
            if (!validated) {
                inputMessageAccountabilityData()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Submission &&
                this.inputMessageAccountabilityData == other.inputMessageAccountabilityData &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = Objects.hash(inputMessageAccountabilityData, additionalProperties)
            }
            return hashCode
        }

        override fun toString() =
            "Submission{inputMessageAccountabilityData=$inputMessageAccountabilityData, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var inputMessageAccountabilityData: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(submission: Submission) = apply {
                this.inputMessageAccountabilityData = submission.inputMessageAccountabilityData
                additionalProperties(submission.additionalProperties)
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
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): Submission =
                Submission(inputMessageAccountabilityData, additionalProperties.toUnmodifiable())
        }
    }

    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Type && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val WIRE_DRAWDOWN_REQUEST = Type(JsonField.of("wire_drawdown_request"))

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
    }
}
