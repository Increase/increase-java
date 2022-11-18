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
 * Inbound wire drawdown requests are requests from someone else to send them a wire. This feature
 * is in beta; reach out to [support@increase.com](mailto:support@increase.com) to learn more.
 */
@JsonDeserialize(builder = InboundWireDrawdownRequest.Builder::class)
@NoAutoDetect
class InboundWireDrawdownRequest
private constructor(
    private val type: JsonField<Type>,
    private val id: JsonField<String>,
    private val recipientAccountNumberId: JsonField<String>,
    private val originatorAccountNumber: JsonField<String>,
    private val originatorRoutingNumber: JsonField<String>,
    private val beneficiaryAccountNumber: JsonField<String>,
    private val beneficiaryRoutingNumber: JsonField<String>,
    private val amount: JsonField<Long>,
    private val currency: JsonField<String>,
    private val messageToRecipient: JsonField<String>,
    private val originatorToBeneficiaryInformationLine1: JsonField<String>,
    private val originatorToBeneficiaryInformationLine2: JsonField<String>,
    private val originatorToBeneficiaryInformationLine3: JsonField<String>,
    private val originatorToBeneficiaryInformationLine4: JsonField<String>,
    private val originatorName: JsonField<String>,
    private val originatorAddressLine1: JsonField<String>,
    private val originatorAddressLine2: JsonField<String>,
    private val originatorAddressLine3: JsonField<String>,
    private val beneficiaryName: JsonField<String>,
    private val beneficiaryAddressLine1: JsonField<String>,
    private val beneficiaryAddressLine2: JsonField<String>,
    private val beneficiaryAddressLine3: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /**
     * A constant representing the object's type. For this resource it will always be
     * `inbound_wire_drawdown_request`.
     */
    fun type(): Type = type.getRequired("type")

    /** The Wire drawdown request identifier. */
    fun id(): String = id.getRequired("id")

    /**
     * The Account Number from which the recipient of this request is being requested to send funds.
     */
    fun recipientAccountNumberId(): String =
        recipientAccountNumberId.getRequired("recipient_account_number_id")

    /** The drawdown request's originator's account number. */
    fun originatorAccountNumber(): String =
        originatorAccountNumber.getRequired("originator_account_number")

    /** The drawdown request's originator's routing number. */
    fun originatorRoutingNumber(): String =
        originatorRoutingNumber.getRequired("originator_routing_number")

    /** The drawdown request's beneficiary's account number. */
    fun beneficiaryAccountNumber(): String =
        beneficiaryAccountNumber.getRequired("beneficiary_account_number")

    /** The drawdown request's beneficiary's routing number. */
    fun beneficiaryRoutingNumber(): String =
        beneficiaryRoutingNumber.getRequired("beneficiary_routing_number")

    /** The amount being requested in cents. */
    fun amount(): Long = amount.getRequired("amount")

    /**
     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the amount being requested.
     * Will always be "USD".
     */
    fun currency(): String = currency.getRequired("currency")

    /** A message from the drawdown request's originator. */
    fun messageToRecipient(): Optional<String> =
        Optional.ofNullable(messageToRecipient.getNullable("message_to_recipient"))

    /** Line 1 of the information conveyed from the originator of the message to the beneficiary. */
    fun originatorToBeneficiaryInformationLine1(): Optional<String> =
        Optional.ofNullable(
            originatorToBeneficiaryInformationLine1.getNullable(
                "originator_to_beneficiary_information_line1"
            )
        )

    /** Line 2 of the information conveyed from the originator of the message to the beneficiary. */
    fun originatorToBeneficiaryInformationLine2(): Optional<String> =
        Optional.ofNullable(
            originatorToBeneficiaryInformationLine2.getNullable(
                "originator_to_beneficiary_information_line2"
            )
        )

    /** Line 3 of the information conveyed from the originator of the message to the beneficiary. */
    fun originatorToBeneficiaryInformationLine3(): Optional<String> =
        Optional.ofNullable(
            originatorToBeneficiaryInformationLine3.getNullable(
                "originator_to_beneficiary_information_line3"
            )
        )

    /** Line 4 of the information conveyed from the originator of the message to the beneficiary. */
    fun originatorToBeneficiaryInformationLine4(): Optional<String> =
        Optional.ofNullable(
            originatorToBeneficiaryInformationLine4.getNullable(
                "originator_to_beneficiary_information_line4"
            )
        )

    /** The drawdown request's originator's name. */
    fun originatorName(): Optional<String> =
        Optional.ofNullable(originatorName.getNullable("originator_name"))

    /** Line 1 of the drawdown request's originator's address. */
    fun originatorAddressLine1(): Optional<String> =
        Optional.ofNullable(originatorAddressLine1.getNullable("originator_address_line1"))

    /** Line 2 of the drawdown request's originator's address. */
    fun originatorAddressLine2(): Optional<String> =
        Optional.ofNullable(originatorAddressLine2.getNullable("originator_address_line2"))

    /** Line 3 of the drawdown request's originator's address. */
    fun originatorAddressLine3(): Optional<String> =
        Optional.ofNullable(originatorAddressLine3.getNullable("originator_address_line3"))

    /** The drawdown request's beneficiary's name. */
    fun beneficiaryName(): Optional<String> =
        Optional.ofNullable(beneficiaryName.getNullable("beneficiary_name"))

    /** Line 1 of the drawdown request's beneficiary's address. */
    fun beneficiaryAddressLine1(): Optional<String> =
        Optional.ofNullable(beneficiaryAddressLine1.getNullable("beneficiary_address_line1"))

    /** Line 2 of the drawdown request's beneficiary's address. */
    fun beneficiaryAddressLine2(): Optional<String> =
        Optional.ofNullable(beneficiaryAddressLine2.getNullable("beneficiary_address_line2"))

    /** Line 3 of the drawdown request's beneficiary's address. */
    fun beneficiaryAddressLine3(): Optional<String> =
        Optional.ofNullable(beneficiaryAddressLine3.getNullable("beneficiary_address_line3"))

    /**
     * A constant representing the object's type. For this resource it will always be
     * `inbound_wire_drawdown_request`.
     */
    @JsonProperty("type") @ExcludeMissing fun _type() = type

    /** The Wire drawdown request identifier. */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /**
     * The Account Number from which the recipient of this request is being requested to send funds.
     */
    @JsonProperty("recipient_account_number_id")
    @ExcludeMissing
    fun _recipientAccountNumberId() = recipientAccountNumberId

    /** The drawdown request's originator's account number. */
    @JsonProperty("originator_account_number")
    @ExcludeMissing
    fun _originatorAccountNumber() = originatorAccountNumber

    /** The drawdown request's originator's routing number. */
    @JsonProperty("originator_routing_number")
    @ExcludeMissing
    fun _originatorRoutingNumber() = originatorRoutingNumber

    /** The drawdown request's beneficiary's account number. */
    @JsonProperty("beneficiary_account_number")
    @ExcludeMissing
    fun _beneficiaryAccountNumber() = beneficiaryAccountNumber

    /** The drawdown request's beneficiary's routing number. */
    @JsonProperty("beneficiary_routing_number")
    @ExcludeMissing
    fun _beneficiaryRoutingNumber() = beneficiaryRoutingNumber

    /** The amount being requested in cents. */
    @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

    /**
     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the amount being requested.
     * Will always be "USD".
     */
    @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

    /** A message from the drawdown request's originator. */
    @JsonProperty("message_to_recipient")
    @ExcludeMissing
    fun _messageToRecipient() = messageToRecipient

    /** Line 1 of the information conveyed from the originator of the message to the beneficiary. */
    @JsonProperty("originator_to_beneficiary_information_line1")
    @ExcludeMissing
    fun _originatorToBeneficiaryInformationLine1() = originatorToBeneficiaryInformationLine1

    /** Line 2 of the information conveyed from the originator of the message to the beneficiary. */
    @JsonProperty("originator_to_beneficiary_information_line2")
    @ExcludeMissing
    fun _originatorToBeneficiaryInformationLine2() = originatorToBeneficiaryInformationLine2

    /** Line 3 of the information conveyed from the originator of the message to the beneficiary. */
    @JsonProperty("originator_to_beneficiary_information_line3")
    @ExcludeMissing
    fun _originatorToBeneficiaryInformationLine3() = originatorToBeneficiaryInformationLine3

    /** Line 4 of the information conveyed from the originator of the message to the beneficiary. */
    @JsonProperty("originator_to_beneficiary_information_line4")
    @ExcludeMissing
    fun _originatorToBeneficiaryInformationLine4() = originatorToBeneficiaryInformationLine4

    /** The drawdown request's originator's name. */
    @JsonProperty("originator_name") @ExcludeMissing fun _originatorName() = originatorName

    /** Line 1 of the drawdown request's originator's address. */
    @JsonProperty("originator_address_line1")
    @ExcludeMissing
    fun _originatorAddressLine1() = originatorAddressLine1

    /** Line 2 of the drawdown request's originator's address. */
    @JsonProperty("originator_address_line2")
    @ExcludeMissing
    fun _originatorAddressLine2() = originatorAddressLine2

    /** Line 3 of the drawdown request's originator's address. */
    @JsonProperty("originator_address_line3")
    @ExcludeMissing
    fun _originatorAddressLine3() = originatorAddressLine3

    /** The drawdown request's beneficiary's name. */
    @JsonProperty("beneficiary_name") @ExcludeMissing fun _beneficiaryName() = beneficiaryName

    /** Line 1 of the drawdown request's beneficiary's address. */
    @JsonProperty("beneficiary_address_line1")
    @ExcludeMissing
    fun _beneficiaryAddressLine1() = beneficiaryAddressLine1

    /** Line 2 of the drawdown request's beneficiary's address. */
    @JsonProperty("beneficiary_address_line2")
    @ExcludeMissing
    fun _beneficiaryAddressLine2() = beneficiaryAddressLine2

    /** Line 3 of the drawdown request's beneficiary's address. */
    @JsonProperty("beneficiary_address_line3")
    @ExcludeMissing
    fun _beneficiaryAddressLine3() = beneficiaryAddressLine3

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate() = apply {
        if (!validated) {
            type()
            id()
            recipientAccountNumberId()
            originatorAccountNumber()
            originatorRoutingNumber()
            beneficiaryAccountNumber()
            beneficiaryRoutingNumber()
            amount()
            currency()
            messageToRecipient()
            originatorToBeneficiaryInformationLine1()
            originatorToBeneficiaryInformationLine2()
            originatorToBeneficiaryInformationLine3()
            originatorToBeneficiaryInformationLine4()
            originatorName()
            originatorAddressLine1()
            originatorAddressLine2()
            originatorAddressLine3()
            beneficiaryName()
            beneficiaryAddressLine1()
            beneficiaryAddressLine2()
            beneficiaryAddressLine3()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InboundWireDrawdownRequest &&
            this.type == other.type &&
            this.id == other.id &&
            this.recipientAccountNumberId == other.recipientAccountNumberId &&
            this.originatorAccountNumber == other.originatorAccountNumber &&
            this.originatorRoutingNumber == other.originatorRoutingNumber &&
            this.beneficiaryAccountNumber == other.beneficiaryAccountNumber &&
            this.beneficiaryRoutingNumber == other.beneficiaryRoutingNumber &&
            this.amount == other.amount &&
            this.currency == other.currency &&
            this.messageToRecipient == other.messageToRecipient &&
            this.originatorToBeneficiaryInformationLine1 ==
                other.originatorToBeneficiaryInformationLine1 &&
            this.originatorToBeneficiaryInformationLine2 ==
                other.originatorToBeneficiaryInformationLine2 &&
            this.originatorToBeneficiaryInformationLine3 ==
                other.originatorToBeneficiaryInformationLine3 &&
            this.originatorToBeneficiaryInformationLine4 ==
                other.originatorToBeneficiaryInformationLine4 &&
            this.originatorName == other.originatorName &&
            this.originatorAddressLine1 == other.originatorAddressLine1 &&
            this.originatorAddressLine2 == other.originatorAddressLine2 &&
            this.originatorAddressLine3 == other.originatorAddressLine3 &&
            this.beneficiaryName == other.beneficiaryName &&
            this.beneficiaryAddressLine1 == other.beneficiaryAddressLine1 &&
            this.beneficiaryAddressLine2 == other.beneficiaryAddressLine2 &&
            this.beneficiaryAddressLine3 == other.beneficiaryAddressLine3 &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    type,
                    id,
                    recipientAccountNumberId,
                    originatorAccountNumber,
                    originatorRoutingNumber,
                    beneficiaryAccountNumber,
                    beneficiaryRoutingNumber,
                    amount,
                    currency,
                    messageToRecipient,
                    originatorToBeneficiaryInformationLine1,
                    originatorToBeneficiaryInformationLine2,
                    originatorToBeneficiaryInformationLine3,
                    originatorToBeneficiaryInformationLine4,
                    originatorName,
                    originatorAddressLine1,
                    originatorAddressLine2,
                    originatorAddressLine3,
                    beneficiaryName,
                    beneficiaryAddressLine1,
                    beneficiaryAddressLine2,
                    beneficiaryAddressLine3,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "InboundWireDrawdownRequest{type=$type, id=$id, recipientAccountNumberId=$recipientAccountNumberId, originatorAccountNumber=$originatorAccountNumber, originatorRoutingNumber=$originatorRoutingNumber, beneficiaryAccountNumber=$beneficiaryAccountNumber, beneficiaryRoutingNumber=$beneficiaryRoutingNumber, amount=$amount, currency=$currency, messageToRecipient=$messageToRecipient, originatorToBeneficiaryInformationLine1=$originatorToBeneficiaryInformationLine1, originatorToBeneficiaryInformationLine2=$originatorToBeneficiaryInformationLine2, originatorToBeneficiaryInformationLine3=$originatorToBeneficiaryInformationLine3, originatorToBeneficiaryInformationLine4=$originatorToBeneficiaryInformationLine4, originatorName=$originatorName, originatorAddressLine1=$originatorAddressLine1, originatorAddressLine2=$originatorAddressLine2, originatorAddressLine3=$originatorAddressLine3, beneficiaryName=$beneficiaryName, beneficiaryAddressLine1=$beneficiaryAddressLine1, beneficiaryAddressLine2=$beneficiaryAddressLine2, beneficiaryAddressLine3=$beneficiaryAddressLine3, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var type: JsonField<Type> = JsonMissing.of()
        private var id: JsonField<String> = JsonMissing.of()
        private var recipientAccountNumberId: JsonField<String> = JsonMissing.of()
        private var originatorAccountNumber: JsonField<String> = JsonMissing.of()
        private var originatorRoutingNumber: JsonField<String> = JsonMissing.of()
        private var beneficiaryAccountNumber: JsonField<String> = JsonMissing.of()
        private var beneficiaryRoutingNumber: JsonField<String> = JsonMissing.of()
        private var amount: JsonField<Long> = JsonMissing.of()
        private var currency: JsonField<String> = JsonMissing.of()
        private var messageToRecipient: JsonField<String> = JsonMissing.of()
        private var originatorToBeneficiaryInformationLine1: JsonField<String> = JsonMissing.of()
        private var originatorToBeneficiaryInformationLine2: JsonField<String> = JsonMissing.of()
        private var originatorToBeneficiaryInformationLine3: JsonField<String> = JsonMissing.of()
        private var originatorToBeneficiaryInformationLine4: JsonField<String> = JsonMissing.of()
        private var originatorName: JsonField<String> = JsonMissing.of()
        private var originatorAddressLine1: JsonField<String> = JsonMissing.of()
        private var originatorAddressLine2: JsonField<String> = JsonMissing.of()
        private var originatorAddressLine3: JsonField<String> = JsonMissing.of()
        private var beneficiaryName: JsonField<String> = JsonMissing.of()
        private var beneficiaryAddressLine1: JsonField<String> = JsonMissing.of()
        private var beneficiaryAddressLine2: JsonField<String> = JsonMissing.of()
        private var beneficiaryAddressLine3: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(inboundWireDrawdownRequest: InboundWireDrawdownRequest) = apply {
            this.type = inboundWireDrawdownRequest.type
            this.id = inboundWireDrawdownRequest.id
            this.recipientAccountNumberId = inboundWireDrawdownRequest.recipientAccountNumberId
            this.originatorAccountNumber = inboundWireDrawdownRequest.originatorAccountNumber
            this.originatorRoutingNumber = inboundWireDrawdownRequest.originatorRoutingNumber
            this.beneficiaryAccountNumber = inboundWireDrawdownRequest.beneficiaryAccountNumber
            this.beneficiaryRoutingNumber = inboundWireDrawdownRequest.beneficiaryRoutingNumber
            this.amount = inboundWireDrawdownRequest.amount
            this.currency = inboundWireDrawdownRequest.currency
            this.messageToRecipient = inboundWireDrawdownRequest.messageToRecipient
            this.originatorToBeneficiaryInformationLine1 =
                inboundWireDrawdownRequest.originatorToBeneficiaryInformationLine1
            this.originatorToBeneficiaryInformationLine2 =
                inboundWireDrawdownRequest.originatorToBeneficiaryInformationLine2
            this.originatorToBeneficiaryInformationLine3 =
                inboundWireDrawdownRequest.originatorToBeneficiaryInformationLine3
            this.originatorToBeneficiaryInformationLine4 =
                inboundWireDrawdownRequest.originatorToBeneficiaryInformationLine4
            this.originatorName = inboundWireDrawdownRequest.originatorName
            this.originatorAddressLine1 = inboundWireDrawdownRequest.originatorAddressLine1
            this.originatorAddressLine2 = inboundWireDrawdownRequest.originatorAddressLine2
            this.originatorAddressLine3 = inboundWireDrawdownRequest.originatorAddressLine3
            this.beneficiaryName = inboundWireDrawdownRequest.beneficiaryName
            this.beneficiaryAddressLine1 = inboundWireDrawdownRequest.beneficiaryAddressLine1
            this.beneficiaryAddressLine2 = inboundWireDrawdownRequest.beneficiaryAddressLine2
            this.beneficiaryAddressLine3 = inboundWireDrawdownRequest.beneficiaryAddressLine3
            additionalProperties(inboundWireDrawdownRequest.additionalProperties)
        }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `inbound_wire_drawdown_request`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * A constant representing the object's type. For this resource it will always be
         * `inbound_wire_drawdown_request`.
         */
        @JsonProperty("type")
        @ExcludeMissing
        fun type(type: JsonField<Type>) = apply { this.type = type }

        /** The Wire drawdown request identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The Wire drawdown request identifier. */
        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * The Account Number from which the recipient of this request is being requested to send
         * funds.
         */
        fun recipientAccountNumberId(recipientAccountNumberId: String) =
            recipientAccountNumberId(JsonField.of(recipientAccountNumberId))

        /**
         * The Account Number from which the recipient of this request is being requested to send
         * funds.
         */
        @JsonProperty("recipient_account_number_id")
        @ExcludeMissing
        fun recipientAccountNumberId(recipientAccountNumberId: JsonField<String>) = apply {
            this.recipientAccountNumberId = recipientAccountNumberId
        }

        /** The drawdown request's originator's account number. */
        fun originatorAccountNumber(originatorAccountNumber: String) =
            originatorAccountNumber(JsonField.of(originatorAccountNumber))

        /** The drawdown request's originator's account number. */
        @JsonProperty("originator_account_number")
        @ExcludeMissing
        fun originatorAccountNumber(originatorAccountNumber: JsonField<String>) = apply {
            this.originatorAccountNumber = originatorAccountNumber
        }

        /** The drawdown request's originator's routing number. */
        fun originatorRoutingNumber(originatorRoutingNumber: String) =
            originatorRoutingNumber(JsonField.of(originatorRoutingNumber))

        /** The drawdown request's originator's routing number. */
        @JsonProperty("originator_routing_number")
        @ExcludeMissing
        fun originatorRoutingNumber(originatorRoutingNumber: JsonField<String>) = apply {
            this.originatorRoutingNumber = originatorRoutingNumber
        }

        /** The drawdown request's beneficiary's account number. */
        fun beneficiaryAccountNumber(beneficiaryAccountNumber: String) =
            beneficiaryAccountNumber(JsonField.of(beneficiaryAccountNumber))

        /** The drawdown request's beneficiary's account number. */
        @JsonProperty("beneficiary_account_number")
        @ExcludeMissing
        fun beneficiaryAccountNumber(beneficiaryAccountNumber: JsonField<String>) = apply {
            this.beneficiaryAccountNumber = beneficiaryAccountNumber
        }

        /** The drawdown request's beneficiary's routing number. */
        fun beneficiaryRoutingNumber(beneficiaryRoutingNumber: String) =
            beneficiaryRoutingNumber(JsonField.of(beneficiaryRoutingNumber))

        /** The drawdown request's beneficiary's routing number. */
        @JsonProperty("beneficiary_routing_number")
        @ExcludeMissing
        fun beneficiaryRoutingNumber(beneficiaryRoutingNumber: JsonField<String>) = apply {
            this.beneficiaryRoutingNumber = beneficiaryRoutingNumber
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

        /** A message from the drawdown request's originator. */
        fun messageToRecipient(messageToRecipient: String) =
            messageToRecipient(JsonField.of(messageToRecipient))

        /** A message from the drawdown request's originator. */
        @JsonProperty("message_to_recipient")
        @ExcludeMissing
        fun messageToRecipient(messageToRecipient: JsonField<String>) = apply {
            this.messageToRecipient = messageToRecipient
        }

        /**
         * Line 1 of the information conveyed from the originator of the message to the beneficiary.
         */
        fun originatorToBeneficiaryInformationLine1(
            originatorToBeneficiaryInformationLine1: String
        ) =
            originatorToBeneficiaryInformationLine1(
                JsonField.of(originatorToBeneficiaryInformationLine1)
            )

        /**
         * Line 1 of the information conveyed from the originator of the message to the beneficiary.
         */
        @JsonProperty("originator_to_beneficiary_information_line1")
        @ExcludeMissing
        fun originatorToBeneficiaryInformationLine1(
            originatorToBeneficiaryInformationLine1: JsonField<String>
        ) = apply {
            this.originatorToBeneficiaryInformationLine1 = originatorToBeneficiaryInformationLine1
        }

        /**
         * Line 2 of the information conveyed from the originator of the message to the beneficiary.
         */
        fun originatorToBeneficiaryInformationLine2(
            originatorToBeneficiaryInformationLine2: String
        ) =
            originatorToBeneficiaryInformationLine2(
                JsonField.of(originatorToBeneficiaryInformationLine2)
            )

        /**
         * Line 2 of the information conveyed from the originator of the message to the beneficiary.
         */
        @JsonProperty("originator_to_beneficiary_information_line2")
        @ExcludeMissing
        fun originatorToBeneficiaryInformationLine2(
            originatorToBeneficiaryInformationLine2: JsonField<String>
        ) = apply {
            this.originatorToBeneficiaryInformationLine2 = originatorToBeneficiaryInformationLine2
        }

        /**
         * Line 3 of the information conveyed from the originator of the message to the beneficiary.
         */
        fun originatorToBeneficiaryInformationLine3(
            originatorToBeneficiaryInformationLine3: String
        ) =
            originatorToBeneficiaryInformationLine3(
                JsonField.of(originatorToBeneficiaryInformationLine3)
            )

        /**
         * Line 3 of the information conveyed from the originator of the message to the beneficiary.
         */
        @JsonProperty("originator_to_beneficiary_information_line3")
        @ExcludeMissing
        fun originatorToBeneficiaryInformationLine3(
            originatorToBeneficiaryInformationLine3: JsonField<String>
        ) = apply {
            this.originatorToBeneficiaryInformationLine3 = originatorToBeneficiaryInformationLine3
        }

        /**
         * Line 4 of the information conveyed from the originator of the message to the beneficiary.
         */
        fun originatorToBeneficiaryInformationLine4(
            originatorToBeneficiaryInformationLine4: String
        ) =
            originatorToBeneficiaryInformationLine4(
                JsonField.of(originatorToBeneficiaryInformationLine4)
            )

        /**
         * Line 4 of the information conveyed from the originator of the message to the beneficiary.
         */
        @JsonProperty("originator_to_beneficiary_information_line4")
        @ExcludeMissing
        fun originatorToBeneficiaryInformationLine4(
            originatorToBeneficiaryInformationLine4: JsonField<String>
        ) = apply {
            this.originatorToBeneficiaryInformationLine4 = originatorToBeneficiaryInformationLine4
        }

        /** The drawdown request's originator's name. */
        fun originatorName(originatorName: String) = originatorName(JsonField.of(originatorName))

        /** The drawdown request's originator's name. */
        @JsonProperty("originator_name")
        @ExcludeMissing
        fun originatorName(originatorName: JsonField<String>) = apply {
            this.originatorName = originatorName
        }

        /** Line 1 of the drawdown request's originator's address. */
        fun originatorAddressLine1(originatorAddressLine1: String) =
            originatorAddressLine1(JsonField.of(originatorAddressLine1))

        /** Line 1 of the drawdown request's originator's address. */
        @JsonProperty("originator_address_line1")
        @ExcludeMissing
        fun originatorAddressLine1(originatorAddressLine1: JsonField<String>) = apply {
            this.originatorAddressLine1 = originatorAddressLine1
        }

        /** Line 2 of the drawdown request's originator's address. */
        fun originatorAddressLine2(originatorAddressLine2: String) =
            originatorAddressLine2(JsonField.of(originatorAddressLine2))

        /** Line 2 of the drawdown request's originator's address. */
        @JsonProperty("originator_address_line2")
        @ExcludeMissing
        fun originatorAddressLine2(originatorAddressLine2: JsonField<String>) = apply {
            this.originatorAddressLine2 = originatorAddressLine2
        }

        /** Line 3 of the drawdown request's originator's address. */
        fun originatorAddressLine3(originatorAddressLine3: String) =
            originatorAddressLine3(JsonField.of(originatorAddressLine3))

        /** Line 3 of the drawdown request's originator's address. */
        @JsonProperty("originator_address_line3")
        @ExcludeMissing
        fun originatorAddressLine3(originatorAddressLine3: JsonField<String>) = apply {
            this.originatorAddressLine3 = originatorAddressLine3
        }

        /** The drawdown request's beneficiary's name. */
        fun beneficiaryName(beneficiaryName: String) =
            beneficiaryName(JsonField.of(beneficiaryName))

        /** The drawdown request's beneficiary's name. */
        @JsonProperty("beneficiary_name")
        @ExcludeMissing
        fun beneficiaryName(beneficiaryName: JsonField<String>) = apply {
            this.beneficiaryName = beneficiaryName
        }

        /** Line 1 of the drawdown request's beneficiary's address. */
        fun beneficiaryAddressLine1(beneficiaryAddressLine1: String) =
            beneficiaryAddressLine1(JsonField.of(beneficiaryAddressLine1))

        /** Line 1 of the drawdown request's beneficiary's address. */
        @JsonProperty("beneficiary_address_line1")
        @ExcludeMissing
        fun beneficiaryAddressLine1(beneficiaryAddressLine1: JsonField<String>) = apply {
            this.beneficiaryAddressLine1 = beneficiaryAddressLine1
        }

        /** Line 2 of the drawdown request's beneficiary's address. */
        fun beneficiaryAddressLine2(beneficiaryAddressLine2: String) =
            beneficiaryAddressLine2(JsonField.of(beneficiaryAddressLine2))

        /** Line 2 of the drawdown request's beneficiary's address. */
        @JsonProperty("beneficiary_address_line2")
        @ExcludeMissing
        fun beneficiaryAddressLine2(beneficiaryAddressLine2: JsonField<String>) = apply {
            this.beneficiaryAddressLine2 = beneficiaryAddressLine2
        }

        /** Line 3 of the drawdown request's beneficiary's address. */
        fun beneficiaryAddressLine3(beneficiaryAddressLine3: String) =
            beneficiaryAddressLine3(JsonField.of(beneficiaryAddressLine3))

        /** Line 3 of the drawdown request's beneficiary's address. */
        @JsonProperty("beneficiary_address_line3")
        @ExcludeMissing
        fun beneficiaryAddressLine3(beneficiaryAddressLine3: JsonField<String>) = apply {
            this.beneficiaryAddressLine3 = beneficiaryAddressLine3
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

        fun build(): InboundWireDrawdownRequest =
            InboundWireDrawdownRequest(
                type,
                id,
                recipientAccountNumberId,
                originatorAccountNumber,
                originatorRoutingNumber,
                beneficiaryAccountNumber,
                beneficiaryRoutingNumber,
                amount,
                currency,
                messageToRecipient,
                originatorToBeneficiaryInformationLine1,
                originatorToBeneficiaryInformationLine2,
                originatorToBeneficiaryInformationLine3,
                originatorToBeneficiaryInformationLine4,
                originatorName,
                originatorAddressLine1,
                originatorAddressLine2,
                originatorAddressLine3,
                beneficiaryName,
                beneficiaryAddressLine1,
                beneficiaryAddressLine2,
                beneficiaryAddressLine3,
                additionalProperties.toUnmodifiable(),
            )
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

            @JvmField
            val INBOUND_WIRE_DRAWDOWN_REQUEST = Type(JsonField.of("inbound_wire_drawdown_request"))

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            INBOUND_WIRE_DRAWDOWN_REQUEST,
        }

        enum class Value {
            INBOUND_WIRE_DRAWDOWN_REQUEST,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                INBOUND_WIRE_DRAWDOWN_REQUEST -> Value.INBOUND_WIRE_DRAWDOWN_REQUEST
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                INBOUND_WIRE_DRAWDOWN_REQUEST -> Known.INBOUND_WIRE_DRAWDOWN_REQUEST
                else -> throw IncreaseInvalidDataException("Unknown Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
