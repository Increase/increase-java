// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.increase.api.core.Enum
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.immutableEmptyMap
import com.increase.api.core.toImmutable
import com.increase.api.errors.IncreaseInvalidDataException
import java.util.Objects
import java.util.Optional

/** An Inbound Wire Transfer is a wire transfer initiated outside of Increase to your account. */
@NoAutoDetect
class InboundWireTransfer
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("account_id")
    @ExcludeMissing
    private val accountId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("account_number_id")
    @ExcludeMissing
    private val accountNumberId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("amount") @ExcludeMissing private val amount: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("beneficiary_address_line1")
    @ExcludeMissing
    private val beneficiaryAddressLine1: JsonField<String> = JsonMissing.of(),
    @JsonProperty("beneficiary_address_line2")
    @ExcludeMissing
    private val beneficiaryAddressLine2: JsonField<String> = JsonMissing.of(),
    @JsonProperty("beneficiary_address_line3")
    @ExcludeMissing
    private val beneficiaryAddressLine3: JsonField<String> = JsonMissing.of(),
    @JsonProperty("beneficiary_name")
    @ExcludeMissing
    private val beneficiaryName: JsonField<String> = JsonMissing.of(),
    @JsonProperty("beneficiary_reference")
    @ExcludeMissing
    private val beneficiaryReference: JsonField<String> = JsonMissing.of(),
    @JsonProperty("description")
    @ExcludeMissing
    private val description: JsonField<String> = JsonMissing.of(),
    @JsonProperty("input_message_accountability_data")
    @ExcludeMissing
    private val inputMessageAccountabilityData: JsonField<String> = JsonMissing.of(),
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
    @JsonProperty("originator_routing_number")
    @ExcludeMissing
    private val originatorRoutingNumber: JsonField<String> = JsonMissing.of(),
    @JsonProperty("originator_to_beneficiary_information")
    @ExcludeMissing
    private val originatorToBeneficiaryInformation: JsonField<String> = JsonMissing.of(),
    @JsonProperty("originator_to_beneficiary_information_line1")
    @ExcludeMissing
    private val originatorToBeneficiaryInformationLine1: JsonField<String> = JsonMissing.of(),
    @JsonProperty("originator_to_beneficiary_information_line2")
    @ExcludeMissing
    private val originatorToBeneficiaryInformationLine2: JsonField<String> = JsonMissing.of(),
    @JsonProperty("originator_to_beneficiary_information_line3")
    @ExcludeMissing
    private val originatorToBeneficiaryInformationLine3: JsonField<String> = JsonMissing.of(),
    @JsonProperty("originator_to_beneficiary_information_line4")
    @ExcludeMissing
    private val originatorToBeneficiaryInformationLine4: JsonField<String> = JsonMissing.of(),
    @JsonProperty("sender_reference")
    @ExcludeMissing
    private val senderReference: JsonField<String> = JsonMissing.of(),
    @JsonProperty("status")
    @ExcludeMissing
    private val status: JsonField<Status> = JsonMissing.of(),
    @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The inbound wire transfer's identifier. */
    fun id(): String = id.getRequired("id")

    /** The Account to which the transfer belongs. */
    fun accountId(): String = accountId.getRequired("account_id")

    /** The identifier of the Account Number to which this transfer was sent. */
    fun accountNumberId(): String = accountNumberId.getRequired("account_number_id")

    /** The amount in USD cents. */
    fun amount(): Long = amount.getRequired("amount")

    /** A free-form address field set by the sender. */
    fun beneficiaryAddressLine1(): Optional<String> =
        Optional.ofNullable(beneficiaryAddressLine1.getNullable("beneficiary_address_line1"))

    /** A free-form address field set by the sender. */
    fun beneficiaryAddressLine2(): Optional<String> =
        Optional.ofNullable(beneficiaryAddressLine2.getNullable("beneficiary_address_line2"))

    /** A free-form address field set by the sender. */
    fun beneficiaryAddressLine3(): Optional<String> =
        Optional.ofNullable(beneficiaryAddressLine3.getNullable("beneficiary_address_line3"))

    /** A name set by the sender. */
    fun beneficiaryName(): Optional<String> =
        Optional.ofNullable(beneficiaryName.getNullable("beneficiary_name"))

    /** A free-form reference string set by the sender, to help identify the transfer. */
    fun beneficiaryReference(): Optional<String> =
        Optional.ofNullable(beneficiaryReference.getNullable("beneficiary_reference"))

    /** An Increase-constructed description of the transfer. */
    fun description(): String = description.getRequired("description")

    /**
     * A unique identifier available to the originating and receiving banks, commonly abbreviated as
     * IMAD. It is created when the wire is submitted to the Fedwire service and is helpful when
     * debugging wires with the originating bank.
     */
    fun inputMessageAccountabilityData(): Optional<String> =
        Optional.ofNullable(
            inputMessageAccountabilityData.getNullable("input_message_accountability_data")
        )

    /** The address of the wire originator, set by the sending bank. */
    fun originatorAddressLine1(): Optional<String> =
        Optional.ofNullable(originatorAddressLine1.getNullable("originator_address_line1"))

    /** The address of the wire originator, set by the sending bank. */
    fun originatorAddressLine2(): Optional<String> =
        Optional.ofNullable(originatorAddressLine2.getNullable("originator_address_line2"))

    /** The address of the wire originator, set by the sending bank. */
    fun originatorAddressLine3(): Optional<String> =
        Optional.ofNullable(originatorAddressLine3.getNullable("originator_address_line3"))

    /** The originator of the wire, set by the sending bank. */
    fun originatorName(): Optional<String> =
        Optional.ofNullable(originatorName.getNullable("originator_name"))

    /**
     * The American Banking Association (ABA) routing number of the bank originating the transfer.
     */
    fun originatorRoutingNumber(): Optional<String> =
        Optional.ofNullable(originatorRoutingNumber.getNullable("originator_routing_number"))

    /** An Increase-created concatenation of the Originator-to-Beneficiary lines. */
    fun originatorToBeneficiaryInformation(): Optional<String> =
        Optional.ofNullable(
            originatorToBeneficiaryInformation.getNullable("originator_to_beneficiary_information")
        )

    /** A free-form message set by the wire originator. */
    fun originatorToBeneficiaryInformationLine1(): Optional<String> =
        Optional.ofNullable(
            originatorToBeneficiaryInformationLine1.getNullable(
                "originator_to_beneficiary_information_line1"
            )
        )

    /** A free-form message set by the wire originator. */
    fun originatorToBeneficiaryInformationLine2(): Optional<String> =
        Optional.ofNullable(
            originatorToBeneficiaryInformationLine2.getNullable(
                "originator_to_beneficiary_information_line2"
            )
        )

    /** A free-form message set by the wire originator. */
    fun originatorToBeneficiaryInformationLine3(): Optional<String> =
        Optional.ofNullable(
            originatorToBeneficiaryInformationLine3.getNullable(
                "originator_to_beneficiary_information_line3"
            )
        )

    /** A free-form message set by the wire originator. */
    fun originatorToBeneficiaryInformationLine4(): Optional<String> =
        Optional.ofNullable(
            originatorToBeneficiaryInformationLine4.getNullable(
                "originator_to_beneficiary_information_line4"
            )
        )

    /** The sending bank's reference number for the wire transfer. */
    fun senderReference(): Optional<String> =
        Optional.ofNullable(senderReference.getNullable("sender_reference"))

    /** The status of the transfer. */
    fun status(): Status = status.getRequired("status")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `inbound_wire_transfer`.
     */
    fun type(): Type = type.getRequired("type")

    /** The inbound wire transfer's identifier. */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /** The Account to which the transfer belongs. */
    @JsonProperty("account_id") @ExcludeMissing fun _accountId() = accountId

    /** The identifier of the Account Number to which this transfer was sent. */
    @JsonProperty("account_number_id") @ExcludeMissing fun _accountNumberId() = accountNumberId

    /** The amount in USD cents. */
    @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

    /** A free-form address field set by the sender. */
    @JsonProperty("beneficiary_address_line1")
    @ExcludeMissing
    fun _beneficiaryAddressLine1() = beneficiaryAddressLine1

    /** A free-form address field set by the sender. */
    @JsonProperty("beneficiary_address_line2")
    @ExcludeMissing
    fun _beneficiaryAddressLine2() = beneficiaryAddressLine2

    /** A free-form address field set by the sender. */
    @JsonProperty("beneficiary_address_line3")
    @ExcludeMissing
    fun _beneficiaryAddressLine3() = beneficiaryAddressLine3

    /** A name set by the sender. */
    @JsonProperty("beneficiary_name") @ExcludeMissing fun _beneficiaryName() = beneficiaryName

    /** A free-form reference string set by the sender, to help identify the transfer. */
    @JsonProperty("beneficiary_reference")
    @ExcludeMissing
    fun _beneficiaryReference() = beneficiaryReference

    /** An Increase-constructed description of the transfer. */
    @JsonProperty("description") @ExcludeMissing fun _description() = description

    /**
     * A unique identifier available to the originating and receiving banks, commonly abbreviated as
     * IMAD. It is created when the wire is submitted to the Fedwire service and is helpful when
     * debugging wires with the originating bank.
     */
    @JsonProperty("input_message_accountability_data")
    @ExcludeMissing
    fun _inputMessageAccountabilityData() = inputMessageAccountabilityData

    /** The address of the wire originator, set by the sending bank. */
    @JsonProperty("originator_address_line1")
    @ExcludeMissing
    fun _originatorAddressLine1() = originatorAddressLine1

    /** The address of the wire originator, set by the sending bank. */
    @JsonProperty("originator_address_line2")
    @ExcludeMissing
    fun _originatorAddressLine2() = originatorAddressLine2

    /** The address of the wire originator, set by the sending bank. */
    @JsonProperty("originator_address_line3")
    @ExcludeMissing
    fun _originatorAddressLine3() = originatorAddressLine3

    /** The originator of the wire, set by the sending bank. */
    @JsonProperty("originator_name") @ExcludeMissing fun _originatorName() = originatorName

    /**
     * The American Banking Association (ABA) routing number of the bank originating the transfer.
     */
    @JsonProperty("originator_routing_number")
    @ExcludeMissing
    fun _originatorRoutingNumber() = originatorRoutingNumber

    /** An Increase-created concatenation of the Originator-to-Beneficiary lines. */
    @JsonProperty("originator_to_beneficiary_information")
    @ExcludeMissing
    fun _originatorToBeneficiaryInformation() = originatorToBeneficiaryInformation

    /** A free-form message set by the wire originator. */
    @JsonProperty("originator_to_beneficiary_information_line1")
    @ExcludeMissing
    fun _originatorToBeneficiaryInformationLine1() = originatorToBeneficiaryInformationLine1

    /** A free-form message set by the wire originator. */
    @JsonProperty("originator_to_beneficiary_information_line2")
    @ExcludeMissing
    fun _originatorToBeneficiaryInformationLine2() = originatorToBeneficiaryInformationLine2

    /** A free-form message set by the wire originator. */
    @JsonProperty("originator_to_beneficiary_information_line3")
    @ExcludeMissing
    fun _originatorToBeneficiaryInformationLine3() = originatorToBeneficiaryInformationLine3

    /** A free-form message set by the wire originator. */
    @JsonProperty("originator_to_beneficiary_information_line4")
    @ExcludeMissing
    fun _originatorToBeneficiaryInformationLine4() = originatorToBeneficiaryInformationLine4

    /** The sending bank's reference number for the wire transfer. */
    @JsonProperty("sender_reference") @ExcludeMissing fun _senderReference() = senderReference

    /** The status of the transfer. */
    @JsonProperty("status") @ExcludeMissing fun _status() = status

    /**
     * A constant representing the object's type. For this resource it will always be
     * `inbound_wire_transfer`.
     */
    @JsonProperty("type") @ExcludeMissing fun _type() = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): InboundWireTransfer = apply {
        if (!validated) {
            id()
            accountId()
            accountNumberId()
            amount()
            beneficiaryAddressLine1()
            beneficiaryAddressLine2()
            beneficiaryAddressLine3()
            beneficiaryName()
            beneficiaryReference()
            description()
            inputMessageAccountabilityData()
            originatorAddressLine1()
            originatorAddressLine2()
            originatorAddressLine3()
            originatorName()
            originatorRoutingNumber()
            originatorToBeneficiaryInformation()
            originatorToBeneficiaryInformationLine1()
            originatorToBeneficiaryInformationLine2()
            originatorToBeneficiaryInformationLine3()
            originatorToBeneficiaryInformationLine4()
            senderReference()
            status()
            type()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var accountId: JsonField<String> = JsonMissing.of()
        private var accountNumberId: JsonField<String> = JsonMissing.of()
        private var amount: JsonField<Long> = JsonMissing.of()
        private var beneficiaryAddressLine1: JsonField<String> = JsonMissing.of()
        private var beneficiaryAddressLine2: JsonField<String> = JsonMissing.of()
        private var beneficiaryAddressLine3: JsonField<String> = JsonMissing.of()
        private var beneficiaryName: JsonField<String> = JsonMissing.of()
        private var beneficiaryReference: JsonField<String> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var inputMessageAccountabilityData: JsonField<String> = JsonMissing.of()
        private var originatorAddressLine1: JsonField<String> = JsonMissing.of()
        private var originatorAddressLine2: JsonField<String> = JsonMissing.of()
        private var originatorAddressLine3: JsonField<String> = JsonMissing.of()
        private var originatorName: JsonField<String> = JsonMissing.of()
        private var originatorRoutingNumber: JsonField<String> = JsonMissing.of()
        private var originatorToBeneficiaryInformation: JsonField<String> = JsonMissing.of()
        private var originatorToBeneficiaryInformationLine1: JsonField<String> = JsonMissing.of()
        private var originatorToBeneficiaryInformationLine2: JsonField<String> = JsonMissing.of()
        private var originatorToBeneficiaryInformationLine3: JsonField<String> = JsonMissing.of()
        private var originatorToBeneficiaryInformationLine4: JsonField<String> = JsonMissing.of()
        private var senderReference: JsonField<String> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(inboundWireTransfer: InboundWireTransfer) = apply {
            id = inboundWireTransfer.id
            accountId = inboundWireTransfer.accountId
            accountNumberId = inboundWireTransfer.accountNumberId
            amount = inboundWireTransfer.amount
            beneficiaryAddressLine1 = inboundWireTransfer.beneficiaryAddressLine1
            beneficiaryAddressLine2 = inboundWireTransfer.beneficiaryAddressLine2
            beneficiaryAddressLine3 = inboundWireTransfer.beneficiaryAddressLine3
            beneficiaryName = inboundWireTransfer.beneficiaryName
            beneficiaryReference = inboundWireTransfer.beneficiaryReference
            description = inboundWireTransfer.description
            inputMessageAccountabilityData = inboundWireTransfer.inputMessageAccountabilityData
            originatorAddressLine1 = inboundWireTransfer.originatorAddressLine1
            originatorAddressLine2 = inboundWireTransfer.originatorAddressLine2
            originatorAddressLine3 = inboundWireTransfer.originatorAddressLine3
            originatorName = inboundWireTransfer.originatorName
            originatorRoutingNumber = inboundWireTransfer.originatorRoutingNumber
            originatorToBeneficiaryInformation =
                inboundWireTransfer.originatorToBeneficiaryInformation
            originatorToBeneficiaryInformationLine1 =
                inboundWireTransfer.originatorToBeneficiaryInformationLine1
            originatorToBeneficiaryInformationLine2 =
                inboundWireTransfer.originatorToBeneficiaryInformationLine2
            originatorToBeneficiaryInformationLine3 =
                inboundWireTransfer.originatorToBeneficiaryInformationLine3
            originatorToBeneficiaryInformationLine4 =
                inboundWireTransfer.originatorToBeneficiaryInformationLine4
            senderReference = inboundWireTransfer.senderReference
            status = inboundWireTransfer.status
            type = inboundWireTransfer.type
            additionalProperties = inboundWireTransfer.additionalProperties.toMutableMap()
        }

        /** The inbound wire transfer's identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The inbound wire transfer's identifier. */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The Account to which the transfer belongs. */
        fun accountId(accountId: String) = accountId(JsonField.of(accountId))

        /** The Account to which the transfer belongs. */
        fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

        /** The identifier of the Account Number to which this transfer was sent. */
        fun accountNumberId(accountNumberId: String) =
            accountNumberId(JsonField.of(accountNumberId))

        /** The identifier of the Account Number to which this transfer was sent. */
        fun accountNumberId(accountNumberId: JsonField<String>) = apply {
            this.accountNumberId = accountNumberId
        }

        /** The amount in USD cents. */
        fun amount(amount: Long) = amount(JsonField.of(amount))

        /** The amount in USD cents. */
        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

        /** A free-form address field set by the sender. */
        fun beneficiaryAddressLine1(beneficiaryAddressLine1: String) =
            beneficiaryAddressLine1(JsonField.of(beneficiaryAddressLine1))

        /** A free-form address field set by the sender. */
        fun beneficiaryAddressLine1(beneficiaryAddressLine1: JsonField<String>) = apply {
            this.beneficiaryAddressLine1 = beneficiaryAddressLine1
        }

        /** A free-form address field set by the sender. */
        fun beneficiaryAddressLine2(beneficiaryAddressLine2: String) =
            beneficiaryAddressLine2(JsonField.of(beneficiaryAddressLine2))

        /** A free-form address field set by the sender. */
        fun beneficiaryAddressLine2(beneficiaryAddressLine2: JsonField<String>) = apply {
            this.beneficiaryAddressLine2 = beneficiaryAddressLine2
        }

        /** A free-form address field set by the sender. */
        fun beneficiaryAddressLine3(beneficiaryAddressLine3: String) =
            beneficiaryAddressLine3(JsonField.of(beneficiaryAddressLine3))

        /** A free-form address field set by the sender. */
        fun beneficiaryAddressLine3(beneficiaryAddressLine3: JsonField<String>) = apply {
            this.beneficiaryAddressLine3 = beneficiaryAddressLine3
        }

        /** A name set by the sender. */
        fun beneficiaryName(beneficiaryName: String) =
            beneficiaryName(JsonField.of(beneficiaryName))

        /** A name set by the sender. */
        fun beneficiaryName(beneficiaryName: JsonField<String>) = apply {
            this.beneficiaryName = beneficiaryName
        }

        /** A free-form reference string set by the sender, to help identify the transfer. */
        fun beneficiaryReference(beneficiaryReference: String) =
            beneficiaryReference(JsonField.of(beneficiaryReference))

        /** A free-form reference string set by the sender, to help identify the transfer. */
        fun beneficiaryReference(beneficiaryReference: JsonField<String>) = apply {
            this.beneficiaryReference = beneficiaryReference
        }

        /** An Increase-constructed description of the transfer. */
        fun description(description: String) = description(JsonField.of(description))

        /** An Increase-constructed description of the transfer. */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /**
         * A unique identifier available to the originating and receiving banks, commonly
         * abbreviated as IMAD. It is created when the wire is submitted to the Fedwire service and
         * is helpful when debugging wires with the originating bank.
         */
        fun inputMessageAccountabilityData(inputMessageAccountabilityData: String) =
            inputMessageAccountabilityData(JsonField.of(inputMessageAccountabilityData))

        /**
         * A unique identifier available to the originating and receiving banks, commonly
         * abbreviated as IMAD. It is created when the wire is submitted to the Fedwire service and
         * is helpful when debugging wires with the originating bank.
         */
        fun inputMessageAccountabilityData(inputMessageAccountabilityData: JsonField<String>) =
            apply {
                this.inputMessageAccountabilityData = inputMessageAccountabilityData
            }

        /** The address of the wire originator, set by the sending bank. */
        fun originatorAddressLine1(originatorAddressLine1: String) =
            originatorAddressLine1(JsonField.of(originatorAddressLine1))

        /** The address of the wire originator, set by the sending bank. */
        fun originatorAddressLine1(originatorAddressLine1: JsonField<String>) = apply {
            this.originatorAddressLine1 = originatorAddressLine1
        }

        /** The address of the wire originator, set by the sending bank. */
        fun originatorAddressLine2(originatorAddressLine2: String) =
            originatorAddressLine2(JsonField.of(originatorAddressLine2))

        /** The address of the wire originator, set by the sending bank. */
        fun originatorAddressLine2(originatorAddressLine2: JsonField<String>) = apply {
            this.originatorAddressLine2 = originatorAddressLine2
        }

        /** The address of the wire originator, set by the sending bank. */
        fun originatorAddressLine3(originatorAddressLine3: String) =
            originatorAddressLine3(JsonField.of(originatorAddressLine3))

        /** The address of the wire originator, set by the sending bank. */
        fun originatorAddressLine3(originatorAddressLine3: JsonField<String>) = apply {
            this.originatorAddressLine3 = originatorAddressLine3
        }

        /** The originator of the wire, set by the sending bank. */
        fun originatorName(originatorName: String) = originatorName(JsonField.of(originatorName))

        /** The originator of the wire, set by the sending bank. */
        fun originatorName(originatorName: JsonField<String>) = apply {
            this.originatorName = originatorName
        }

        /**
         * The American Banking Association (ABA) routing number of the bank originating the
         * transfer.
         */
        fun originatorRoutingNumber(originatorRoutingNumber: String) =
            originatorRoutingNumber(JsonField.of(originatorRoutingNumber))

        /**
         * The American Banking Association (ABA) routing number of the bank originating the
         * transfer.
         */
        fun originatorRoutingNumber(originatorRoutingNumber: JsonField<String>) = apply {
            this.originatorRoutingNumber = originatorRoutingNumber
        }

        /** An Increase-created concatenation of the Originator-to-Beneficiary lines. */
        fun originatorToBeneficiaryInformation(originatorToBeneficiaryInformation: String) =
            originatorToBeneficiaryInformation(JsonField.of(originatorToBeneficiaryInformation))

        /** An Increase-created concatenation of the Originator-to-Beneficiary lines. */
        fun originatorToBeneficiaryInformation(
            originatorToBeneficiaryInformation: JsonField<String>
        ) = apply { this.originatorToBeneficiaryInformation = originatorToBeneficiaryInformation }

        /** A free-form message set by the wire originator. */
        fun originatorToBeneficiaryInformationLine1(
            originatorToBeneficiaryInformationLine1: String
        ) =
            originatorToBeneficiaryInformationLine1(
                JsonField.of(originatorToBeneficiaryInformationLine1)
            )

        /** A free-form message set by the wire originator. */
        fun originatorToBeneficiaryInformationLine1(
            originatorToBeneficiaryInformationLine1: JsonField<String>
        ) = apply {
            this.originatorToBeneficiaryInformationLine1 = originatorToBeneficiaryInformationLine1
        }

        /** A free-form message set by the wire originator. */
        fun originatorToBeneficiaryInformationLine2(
            originatorToBeneficiaryInformationLine2: String
        ) =
            originatorToBeneficiaryInformationLine2(
                JsonField.of(originatorToBeneficiaryInformationLine2)
            )

        /** A free-form message set by the wire originator. */
        fun originatorToBeneficiaryInformationLine2(
            originatorToBeneficiaryInformationLine2: JsonField<String>
        ) = apply {
            this.originatorToBeneficiaryInformationLine2 = originatorToBeneficiaryInformationLine2
        }

        /** A free-form message set by the wire originator. */
        fun originatorToBeneficiaryInformationLine3(
            originatorToBeneficiaryInformationLine3: String
        ) =
            originatorToBeneficiaryInformationLine3(
                JsonField.of(originatorToBeneficiaryInformationLine3)
            )

        /** A free-form message set by the wire originator. */
        fun originatorToBeneficiaryInformationLine3(
            originatorToBeneficiaryInformationLine3: JsonField<String>
        ) = apply {
            this.originatorToBeneficiaryInformationLine3 = originatorToBeneficiaryInformationLine3
        }

        /** A free-form message set by the wire originator. */
        fun originatorToBeneficiaryInformationLine4(
            originatorToBeneficiaryInformationLine4: String
        ) =
            originatorToBeneficiaryInformationLine4(
                JsonField.of(originatorToBeneficiaryInformationLine4)
            )

        /** A free-form message set by the wire originator. */
        fun originatorToBeneficiaryInformationLine4(
            originatorToBeneficiaryInformationLine4: JsonField<String>
        ) = apply {
            this.originatorToBeneficiaryInformationLine4 = originatorToBeneficiaryInformationLine4
        }

        /** The sending bank's reference number for the wire transfer. */
        fun senderReference(senderReference: String) =
            senderReference(JsonField.of(senderReference))

        /** The sending bank's reference number for the wire transfer. */
        fun senderReference(senderReference: JsonField<String>) = apply {
            this.senderReference = senderReference
        }

        /** The status of the transfer. */
        fun status(status: Status) = status(JsonField.of(status))

        /** The status of the transfer. */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `inbound_wire_transfer`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * A constant representing the object's type. For this resource it will always be
         * `inbound_wire_transfer`.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

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

        fun build(): InboundWireTransfer =
            InboundWireTransfer(
                id,
                accountId,
                accountNumberId,
                amount,
                beneficiaryAddressLine1,
                beneficiaryAddressLine2,
                beneficiaryAddressLine3,
                beneficiaryName,
                beneficiaryReference,
                description,
                inputMessageAccountabilityData,
                originatorAddressLine1,
                originatorAddressLine2,
                originatorAddressLine3,
                originatorName,
                originatorRoutingNumber,
                originatorToBeneficiaryInformation,
                originatorToBeneficiaryInformationLine1,
                originatorToBeneficiaryInformationLine2,
                originatorToBeneficiaryInformationLine3,
                originatorToBeneficiaryInformationLine4,
                senderReference,
                status,
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

            @JvmField val PENDING = of("pending")

            @JvmField val ACCEPTED = of("accepted")

            @JvmField val DECLINED = of("declined")

            @JvmField val REVERSED = of("reversed")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            PENDING,
            ACCEPTED,
            DECLINED,
            REVERSED,
        }

        enum class Value {
            PENDING,
            ACCEPTED,
            DECLINED,
            REVERSED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                PENDING -> Value.PENDING
                ACCEPTED -> Value.ACCEPTED
                DECLINED -> Value.DECLINED
                REVERSED -> Value.REVERSED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                PENDING -> Known.PENDING
                ACCEPTED -> Known.ACCEPTED
                DECLINED -> Known.DECLINED
                REVERSED -> Known.REVERSED
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

    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val INBOUND_WIRE_TRANSFER = of("inbound_wire_transfer")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            INBOUND_WIRE_TRANSFER,
        }

        enum class Value {
            INBOUND_WIRE_TRANSFER,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                INBOUND_WIRE_TRANSFER -> Value.INBOUND_WIRE_TRANSFER
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                INBOUND_WIRE_TRANSFER -> Known.INBOUND_WIRE_TRANSFER
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

        return /* spotless:off */ other is InboundWireTransfer && id == other.id && accountId == other.accountId && accountNumberId == other.accountNumberId && amount == other.amount && beneficiaryAddressLine1 == other.beneficiaryAddressLine1 && beneficiaryAddressLine2 == other.beneficiaryAddressLine2 && beneficiaryAddressLine3 == other.beneficiaryAddressLine3 && beneficiaryName == other.beneficiaryName && beneficiaryReference == other.beneficiaryReference && description == other.description && inputMessageAccountabilityData == other.inputMessageAccountabilityData && originatorAddressLine1 == other.originatorAddressLine1 && originatorAddressLine2 == other.originatorAddressLine2 && originatorAddressLine3 == other.originatorAddressLine3 && originatorName == other.originatorName && originatorRoutingNumber == other.originatorRoutingNumber && originatorToBeneficiaryInformation == other.originatorToBeneficiaryInformation && originatorToBeneficiaryInformationLine1 == other.originatorToBeneficiaryInformationLine1 && originatorToBeneficiaryInformationLine2 == other.originatorToBeneficiaryInformationLine2 && originatorToBeneficiaryInformationLine3 == other.originatorToBeneficiaryInformationLine3 && originatorToBeneficiaryInformationLine4 == other.originatorToBeneficiaryInformationLine4 && senderReference == other.senderReference && status == other.status && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, accountId, accountNumberId, amount, beneficiaryAddressLine1, beneficiaryAddressLine2, beneficiaryAddressLine3, beneficiaryName, beneficiaryReference, description, inputMessageAccountabilityData, originatorAddressLine1, originatorAddressLine2, originatorAddressLine3, originatorName, originatorRoutingNumber, originatorToBeneficiaryInformation, originatorToBeneficiaryInformationLine1, originatorToBeneficiaryInformationLine2, originatorToBeneficiaryInformationLine3, originatorToBeneficiaryInformationLine4, senderReference, status, type, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InboundWireTransfer{id=$id, accountId=$accountId, accountNumberId=$accountNumberId, amount=$amount, beneficiaryAddressLine1=$beneficiaryAddressLine1, beneficiaryAddressLine2=$beneficiaryAddressLine2, beneficiaryAddressLine3=$beneficiaryAddressLine3, beneficiaryName=$beneficiaryName, beneficiaryReference=$beneficiaryReference, description=$description, inputMessageAccountabilityData=$inputMessageAccountabilityData, originatorAddressLine1=$originatorAddressLine1, originatorAddressLine2=$originatorAddressLine2, originatorAddressLine3=$originatorAddressLine3, originatorName=$originatorName, originatorRoutingNumber=$originatorRoutingNumber, originatorToBeneficiaryInformation=$originatorToBeneficiaryInformation, originatorToBeneficiaryInformationLine1=$originatorToBeneficiaryInformationLine1, originatorToBeneficiaryInformationLine2=$originatorToBeneficiaryInformationLine2, originatorToBeneficiaryInformationLine3=$originatorToBeneficiaryInformationLine3, originatorToBeneficiaryInformationLine4=$originatorToBeneficiaryInformationLine4, senderReference=$senderReference, status=$status, type=$type, additionalProperties=$additionalProperties}"
}
