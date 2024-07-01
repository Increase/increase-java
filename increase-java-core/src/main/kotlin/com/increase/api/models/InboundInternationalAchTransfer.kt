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
import com.increase.api.core.toUnmodifiable
import com.increase.api.errors.IncreaseInvalidDataException
import java.util.Objects
import java.util.Optional

/**
 * An Inbound International ACH Transfer is created when an "IAT" ACH transfer is initiated at
 * another bank and received by Increase. There are additional fields on this object that are not
 * present on all Inbound ACH Transfer object.
 */
@JsonDeserialize(builder = InboundInternationalAchTransfer.Builder::class)
@NoAutoDetect
class InboundInternationalAchTransfer
private constructor(
    private val amount: JsonField<Long>,
    private val destinationCountryCode: JsonField<String>,
    private val destinationCurrencyCode: JsonField<String>,
    private val foreignExchangeIndicator: JsonField<ForeignExchangeIndicator>,
    private val foreignExchangeReference: JsonField<String>,
    private val foreignExchangeReferenceIndicator: JsonField<ForeignExchangeReferenceIndicator>,
    private val foreignPaymentAmount: JsonField<Long>,
    private val foreignTraceNumber: JsonField<String>,
    private val internationalTransactionTypeCode: JsonField<InternationalTransactionTypeCode>,
    private val originatingCurrencyCode: JsonField<String>,
    private val originatingDepositoryFinancialInstitutionBranchCountry: JsonField<String>,
    private val originatingDepositoryFinancialInstitutionId: JsonField<String>,
    private val originatingDepositoryFinancialInstitutionIdQualifier:
        JsonField<OriginatingDepositoryFinancialInstitutionIdQualifier>,
    private val originatingDepositoryFinancialInstitutionName: JsonField<String>,
    private val originatorCity: JsonField<String>,
    private val originatorCompanyEntryDescription: JsonField<String>,
    private val originatorCountry: JsonField<String>,
    private val originatorIdentification: JsonField<String>,
    private val originatorName: JsonField<String>,
    private val originatorPostalCode: JsonField<String>,
    private val originatorStateOrProvince: JsonField<String>,
    private val originatorStreetAddress: JsonField<String>,
    private val paymentRelatedInformation: JsonField<String>,
    private val paymentRelatedInformation2: JsonField<String>,
    private val receiverCity: JsonField<String>,
    private val receiverCountry: JsonField<String>,
    private val receiverIdentificationNumber: JsonField<String>,
    private val receiverPostalCode: JsonField<String>,
    private val receiverStateOrProvince: JsonField<String>,
    private val receiverStreetAddress: JsonField<String>,
    private val receivingCompanyOrIndividualName: JsonField<String>,
    private val receivingDepositoryFinancialInstitutionCountry: JsonField<String>,
    private val receivingDepositoryFinancialInstitutionId: JsonField<String>,
    private val receivingDepositoryFinancialInstitutionIdQualifier:
        JsonField<ReceivingDepositoryFinancialInstitutionIdQualifier>,
    private val receivingDepositoryFinancialInstitutionName: JsonField<String>,
    private val traceNumber: JsonField<String>,
    private val type: JsonField<Type>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /**
     * The amount in the minor unit of the destination account currency. For dollars, for example,
     * this is cents.
     */
    fun amount(): Long = amount.getRequired("amount")

    /**
     * The [ISO 3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), Alpha-2 country code of the
     * destination country.
     */
    fun destinationCountryCode(): String =
        destinationCountryCode.getRequired("destination_country_code")

    /**
     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code for the destination bank
     * account.
     */
    fun destinationCurrencyCode(): String =
        destinationCurrencyCode.getRequired("destination_currency_code")

    /** A description of how the foreign exchange rate was calculated. */
    fun foreignExchangeIndicator(): ForeignExchangeIndicator =
        foreignExchangeIndicator.getRequired("foreign_exchange_indicator")

    /**
     * Depending on the `foreign_exchange_reference_indicator`, an exchange rate or a reference to a
     * well-known rate.
     */
    fun foreignExchangeReference(): Optional<String> =
        Optional.ofNullable(foreignExchangeReference.getNullable("foreign_exchange_reference"))

    /**
     * An instruction of how to interpret the `foreign_exchange_reference` field for this
     * Transaction.
     */
    fun foreignExchangeReferenceIndicator(): ForeignExchangeReferenceIndicator =
        foreignExchangeReferenceIndicator.getRequired("foreign_exchange_reference_indicator")

    /**
     * The amount in the minor unit of the foreign payment currency. For dollars, for example, this
     * is cents.
     */
    fun foreignPaymentAmount(): Long = foreignPaymentAmount.getRequired("foreign_payment_amount")

    /** A reference number in the foreign banking infrastructure. */
    fun foreignTraceNumber(): Optional<String> =
        Optional.ofNullable(foreignTraceNumber.getNullable("foreign_trace_number"))

    /** The type of transfer. Set by the originator. */
    fun internationalTransactionTypeCode(): InternationalTransactionTypeCode =
        internationalTransactionTypeCode.getRequired("international_transaction_type_code")

    /**
     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code for the originating bank
     * account.
     */
    fun originatingCurrencyCode(): String =
        originatingCurrencyCode.getRequired("originating_currency_code")

    /**
     * The [ISO 3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), Alpha-2 country code of the
     * originating branch country.
     */
    fun originatingDepositoryFinancialInstitutionBranchCountry(): String =
        originatingDepositoryFinancialInstitutionBranchCountry.getRequired(
            "originating_depository_financial_institution_branch_country"
        )

    /**
     * An identifier for the originating bank. One of an International Bank Account Number (IBAN)
     * bank identifier, SWIFT Bank Identification Code (BIC), or a domestic identifier like a US
     * Routing Number.
     */
    fun originatingDepositoryFinancialInstitutionId(): String =
        originatingDepositoryFinancialInstitutionId.getRequired(
            "originating_depository_financial_institution_id"
        )

    /**
     * An instruction of how to interpret the `originating_depository_financial_institution_id`
     * field for this Transaction.
     */
    fun originatingDepositoryFinancialInstitutionIdQualifier():
        OriginatingDepositoryFinancialInstitutionIdQualifier =
        originatingDepositoryFinancialInstitutionIdQualifier.getRequired(
            "originating_depository_financial_institution_id_qualifier"
        )

    /**
     * The name of the originating bank. Sometimes this will refer to an American bank and obscure
     * the correspondent foreign bank.
     */
    fun originatingDepositoryFinancialInstitutionName(): String =
        originatingDepositoryFinancialInstitutionName.getRequired(
            "originating_depository_financial_institution_name"
        )

    /** A portion of the originator address. This may be incomplete. */
    fun originatorCity(): String = originatorCity.getRequired("originator_city")

    /** A description field set by the originator. */
    fun originatorCompanyEntryDescription(): String =
        originatorCompanyEntryDescription.getRequired("originator_company_entry_description")

    /**
     * A portion of the originator address. The
     * [ISO 3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), Alpha-2 country code of the
     * originator country.
     */
    fun originatorCountry(): String = originatorCountry.getRequired("originator_country")

    /**
     * An identifier for the originating company. This is generally stable across multiple ACH
     * transfers.
     */
    fun originatorIdentification(): String =
        originatorIdentification.getRequired("originator_identification")

    /** Either the name of the originator or an intermediary money transmitter. */
    fun originatorName(): String = originatorName.getRequired("originator_name")

    /** A portion of the originator address. This may be incomplete. */
    fun originatorPostalCode(): Optional<String> =
        Optional.ofNullable(originatorPostalCode.getNullable("originator_postal_code"))

    /** A portion of the originator address. This may be incomplete. */
    fun originatorStateOrProvince(): Optional<String> =
        Optional.ofNullable(originatorStateOrProvince.getNullable("originator_state_or_province"))

    /** A portion of the originator address. This may be incomplete. */
    fun originatorStreetAddress(): String =
        originatorStreetAddress.getRequired("originator_street_address")

    /** A description field set by the originator. */
    fun paymentRelatedInformation(): Optional<String> =
        Optional.ofNullable(paymentRelatedInformation.getNullable("payment_related_information"))

    /** A description field set by the originator. */
    fun paymentRelatedInformation2(): Optional<String> =
        Optional.ofNullable(paymentRelatedInformation2.getNullable("payment_related_information2"))

    /** A portion of the receiver address. This may be incomplete. */
    fun receiverCity(): String = receiverCity.getRequired("receiver_city")

    /**
     * A portion of the receiver address. The
     * [ISO 3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), Alpha-2 country code of the
     * receiver country.
     */
    fun receiverCountry(): String = receiverCountry.getRequired("receiver_country")

    /** An identification number the originator uses for the receiver. */
    fun receiverIdentificationNumber(): Optional<String> =
        Optional.ofNullable(
            receiverIdentificationNumber.getNullable("receiver_identification_number")
        )

    /** A portion of the receiver address. This may be incomplete. */
    fun receiverPostalCode(): Optional<String> =
        Optional.ofNullable(receiverPostalCode.getNullable("receiver_postal_code"))

    /** A portion of the receiver address. This may be incomplete. */
    fun receiverStateOrProvince(): Optional<String> =
        Optional.ofNullable(receiverStateOrProvince.getNullable("receiver_state_or_province"))

    /** A portion of the receiver address. This may be incomplete. */
    fun receiverStreetAddress(): String =
        receiverStreetAddress.getRequired("receiver_street_address")

    /** The name of the receiver of the transfer. This is not verified by Increase. */
    fun receivingCompanyOrIndividualName(): String =
        receivingCompanyOrIndividualName.getRequired("receiving_company_or_individual_name")

    /**
     * The [ISO 3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), Alpha-2 country code of the
     * receiving bank country.
     */
    fun receivingDepositoryFinancialInstitutionCountry(): String =
        receivingDepositoryFinancialInstitutionCountry.getRequired(
            "receiving_depository_financial_institution_country"
        )

    /**
     * An identifier for the receiving bank. One of an International Bank Account Number (IBAN) bank
     * identifier, SWIFT Bank Identification Code (BIC), or a domestic identifier like a US Routing
     * Number.
     */
    fun receivingDepositoryFinancialInstitutionId(): String =
        receivingDepositoryFinancialInstitutionId.getRequired(
            "receiving_depository_financial_institution_id"
        )

    /**
     * An instruction of how to interpret the `receiving_depository_financial_institution_id` field
     * for this Transaction.
     */
    fun receivingDepositoryFinancialInstitutionIdQualifier():
        ReceivingDepositoryFinancialInstitutionIdQualifier =
        receivingDepositoryFinancialInstitutionIdQualifier.getRequired(
            "receiving_depository_financial_institution_id_qualifier"
        )

    /** The name of the receiving bank, as set by the sending financial institution. */
    fun receivingDepositoryFinancialInstitutionName(): String =
        receivingDepositoryFinancialInstitutionName.getRequired(
            "receiving_depository_financial_institution_name"
        )

    /**
     * A 15 digit number recorded in the Nacha file and available to both the originating and
     * receiving bank. Along with the amount, date, and originating routing number, this can be used
     * to identify the ACH transfer at either bank. ACH trace numbers are not unique, but are
     * [used to correlate returns](https://increase.com/documentation/ach-returns#ach-returns).
     */
    fun traceNumber(): String = traceNumber.getRequired("trace_number")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `inbound_international_ach_transfer`.
     */
    fun type(): Type = type.getRequired("type")

    /**
     * The amount in the minor unit of the destination account currency. For dollars, for example,
     * this is cents.
     */
    @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

    /**
     * The [ISO 3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), Alpha-2 country code of the
     * destination country.
     */
    @JsonProperty("destination_country_code")
    @ExcludeMissing
    fun _destinationCountryCode() = destinationCountryCode

    /**
     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code for the destination bank
     * account.
     */
    @JsonProperty("destination_currency_code")
    @ExcludeMissing
    fun _destinationCurrencyCode() = destinationCurrencyCode

    /** A description of how the foreign exchange rate was calculated. */
    @JsonProperty("foreign_exchange_indicator")
    @ExcludeMissing
    fun _foreignExchangeIndicator() = foreignExchangeIndicator

    /**
     * Depending on the `foreign_exchange_reference_indicator`, an exchange rate or a reference to a
     * well-known rate.
     */
    @JsonProperty("foreign_exchange_reference")
    @ExcludeMissing
    fun _foreignExchangeReference() = foreignExchangeReference

    /**
     * An instruction of how to interpret the `foreign_exchange_reference` field for this
     * Transaction.
     */
    @JsonProperty("foreign_exchange_reference_indicator")
    @ExcludeMissing
    fun _foreignExchangeReferenceIndicator() = foreignExchangeReferenceIndicator

    /**
     * The amount in the minor unit of the foreign payment currency. For dollars, for example, this
     * is cents.
     */
    @JsonProperty("foreign_payment_amount")
    @ExcludeMissing
    fun _foreignPaymentAmount() = foreignPaymentAmount

    /** A reference number in the foreign banking infrastructure. */
    @JsonProperty("foreign_trace_number")
    @ExcludeMissing
    fun _foreignTraceNumber() = foreignTraceNumber

    /** The type of transfer. Set by the originator. */
    @JsonProperty("international_transaction_type_code")
    @ExcludeMissing
    fun _internationalTransactionTypeCode() = internationalTransactionTypeCode

    /**
     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code for the originating bank
     * account.
     */
    @JsonProperty("originating_currency_code")
    @ExcludeMissing
    fun _originatingCurrencyCode() = originatingCurrencyCode

    /**
     * The [ISO 3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), Alpha-2 country code of the
     * originating branch country.
     */
    @JsonProperty("originating_depository_financial_institution_branch_country")
    @ExcludeMissing
    fun _originatingDepositoryFinancialInstitutionBranchCountry() =
        originatingDepositoryFinancialInstitutionBranchCountry

    /**
     * An identifier for the originating bank. One of an International Bank Account Number (IBAN)
     * bank identifier, SWIFT Bank Identification Code (BIC), or a domestic identifier like a US
     * Routing Number.
     */
    @JsonProperty("originating_depository_financial_institution_id")
    @ExcludeMissing
    fun _originatingDepositoryFinancialInstitutionId() = originatingDepositoryFinancialInstitutionId

    /**
     * An instruction of how to interpret the `originating_depository_financial_institution_id`
     * field for this Transaction.
     */
    @JsonProperty("originating_depository_financial_institution_id_qualifier")
    @ExcludeMissing
    fun _originatingDepositoryFinancialInstitutionIdQualifier() =
        originatingDepositoryFinancialInstitutionIdQualifier

    /**
     * The name of the originating bank. Sometimes this will refer to an American bank and obscure
     * the correspondent foreign bank.
     */
    @JsonProperty("originating_depository_financial_institution_name")
    @ExcludeMissing
    fun _originatingDepositoryFinancialInstitutionName() =
        originatingDepositoryFinancialInstitutionName

    /** A portion of the originator address. This may be incomplete. */
    @JsonProperty("originator_city") @ExcludeMissing fun _originatorCity() = originatorCity

    /** A description field set by the originator. */
    @JsonProperty("originator_company_entry_description")
    @ExcludeMissing
    fun _originatorCompanyEntryDescription() = originatorCompanyEntryDescription

    /**
     * A portion of the originator address. The
     * [ISO 3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), Alpha-2 country code of the
     * originator country.
     */
    @JsonProperty("originator_country") @ExcludeMissing fun _originatorCountry() = originatorCountry

    /**
     * An identifier for the originating company. This is generally stable across multiple ACH
     * transfers.
     */
    @JsonProperty("originator_identification")
    @ExcludeMissing
    fun _originatorIdentification() = originatorIdentification

    /** Either the name of the originator or an intermediary money transmitter. */
    @JsonProperty("originator_name") @ExcludeMissing fun _originatorName() = originatorName

    /** A portion of the originator address. This may be incomplete. */
    @JsonProperty("originator_postal_code")
    @ExcludeMissing
    fun _originatorPostalCode() = originatorPostalCode

    /** A portion of the originator address. This may be incomplete. */
    @JsonProperty("originator_state_or_province")
    @ExcludeMissing
    fun _originatorStateOrProvince() = originatorStateOrProvince

    /** A portion of the originator address. This may be incomplete. */
    @JsonProperty("originator_street_address")
    @ExcludeMissing
    fun _originatorStreetAddress() = originatorStreetAddress

    /** A description field set by the originator. */
    @JsonProperty("payment_related_information")
    @ExcludeMissing
    fun _paymentRelatedInformation() = paymentRelatedInformation

    /** A description field set by the originator. */
    @JsonProperty("payment_related_information2")
    @ExcludeMissing
    fun _paymentRelatedInformation2() = paymentRelatedInformation2

    /** A portion of the receiver address. This may be incomplete. */
    @JsonProperty("receiver_city") @ExcludeMissing fun _receiverCity() = receiverCity

    /**
     * A portion of the receiver address. The
     * [ISO 3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), Alpha-2 country code of the
     * receiver country.
     */
    @JsonProperty("receiver_country") @ExcludeMissing fun _receiverCountry() = receiverCountry

    /** An identification number the originator uses for the receiver. */
    @JsonProperty("receiver_identification_number")
    @ExcludeMissing
    fun _receiverIdentificationNumber() = receiverIdentificationNumber

    /** A portion of the receiver address. This may be incomplete. */
    @JsonProperty("receiver_postal_code")
    @ExcludeMissing
    fun _receiverPostalCode() = receiverPostalCode

    /** A portion of the receiver address. This may be incomplete. */
    @JsonProperty("receiver_state_or_province")
    @ExcludeMissing
    fun _receiverStateOrProvince() = receiverStateOrProvince

    /** A portion of the receiver address. This may be incomplete. */
    @JsonProperty("receiver_street_address")
    @ExcludeMissing
    fun _receiverStreetAddress() = receiverStreetAddress

    /** The name of the receiver of the transfer. This is not verified by Increase. */
    @JsonProperty("receiving_company_or_individual_name")
    @ExcludeMissing
    fun _receivingCompanyOrIndividualName() = receivingCompanyOrIndividualName

    /**
     * The [ISO 3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), Alpha-2 country code of the
     * receiving bank country.
     */
    @JsonProperty("receiving_depository_financial_institution_country")
    @ExcludeMissing
    fun _receivingDepositoryFinancialInstitutionCountry() =
        receivingDepositoryFinancialInstitutionCountry

    /**
     * An identifier for the receiving bank. One of an International Bank Account Number (IBAN) bank
     * identifier, SWIFT Bank Identification Code (BIC), or a domestic identifier like a US Routing
     * Number.
     */
    @JsonProperty("receiving_depository_financial_institution_id")
    @ExcludeMissing
    fun _receivingDepositoryFinancialInstitutionId() = receivingDepositoryFinancialInstitutionId

    /**
     * An instruction of how to interpret the `receiving_depository_financial_institution_id` field
     * for this Transaction.
     */
    @JsonProperty("receiving_depository_financial_institution_id_qualifier")
    @ExcludeMissing
    fun _receivingDepositoryFinancialInstitutionIdQualifier() =
        receivingDepositoryFinancialInstitutionIdQualifier

    /** The name of the receiving bank, as set by the sending financial institution. */
    @JsonProperty("receiving_depository_financial_institution_name")
    @ExcludeMissing
    fun _receivingDepositoryFinancialInstitutionName() = receivingDepositoryFinancialInstitutionName

    /**
     * A 15 digit number recorded in the Nacha file and available to both the originating and
     * receiving bank. Along with the amount, date, and originating routing number, this can be used
     * to identify the ACH transfer at either bank. ACH trace numbers are not unique, but are
     * [used to correlate returns](https://increase.com/documentation/ach-returns#ach-returns).
     */
    @JsonProperty("trace_number") @ExcludeMissing fun _traceNumber() = traceNumber

    /**
     * A constant representing the object's type. For this resource it will always be
     * `inbound_international_ach_transfer`.
     */
    @JsonProperty("type") @ExcludeMissing fun _type() = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): InboundInternationalAchTransfer = apply {
        if (!validated) {
            amount()
            destinationCountryCode()
            destinationCurrencyCode()
            foreignExchangeIndicator()
            foreignExchangeReference()
            foreignExchangeReferenceIndicator()
            foreignPaymentAmount()
            foreignTraceNumber()
            internationalTransactionTypeCode()
            originatingCurrencyCode()
            originatingDepositoryFinancialInstitutionBranchCountry()
            originatingDepositoryFinancialInstitutionId()
            originatingDepositoryFinancialInstitutionIdQualifier()
            originatingDepositoryFinancialInstitutionName()
            originatorCity()
            originatorCompanyEntryDescription()
            originatorCountry()
            originatorIdentification()
            originatorName()
            originatorPostalCode()
            originatorStateOrProvince()
            originatorStreetAddress()
            paymentRelatedInformation()
            paymentRelatedInformation2()
            receiverCity()
            receiverCountry()
            receiverIdentificationNumber()
            receiverPostalCode()
            receiverStateOrProvince()
            receiverStreetAddress()
            receivingCompanyOrIndividualName()
            receivingDepositoryFinancialInstitutionCountry()
            receivingDepositoryFinancialInstitutionId()
            receivingDepositoryFinancialInstitutionIdQualifier()
            receivingDepositoryFinancialInstitutionName()
            traceNumber()
            type()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InboundInternationalAchTransfer &&
            this.amount == other.amount &&
            this.destinationCountryCode == other.destinationCountryCode &&
            this.destinationCurrencyCode == other.destinationCurrencyCode &&
            this.foreignExchangeIndicator == other.foreignExchangeIndicator &&
            this.foreignExchangeReference == other.foreignExchangeReference &&
            this.foreignExchangeReferenceIndicator == other.foreignExchangeReferenceIndicator &&
            this.foreignPaymentAmount == other.foreignPaymentAmount &&
            this.foreignTraceNumber == other.foreignTraceNumber &&
            this.internationalTransactionTypeCode == other.internationalTransactionTypeCode &&
            this.originatingCurrencyCode == other.originatingCurrencyCode &&
            this.originatingDepositoryFinancialInstitutionBranchCountry ==
                other.originatingDepositoryFinancialInstitutionBranchCountry &&
            this.originatingDepositoryFinancialInstitutionId ==
                other.originatingDepositoryFinancialInstitutionId &&
            this.originatingDepositoryFinancialInstitutionIdQualifier ==
                other.originatingDepositoryFinancialInstitutionIdQualifier &&
            this.originatingDepositoryFinancialInstitutionName ==
                other.originatingDepositoryFinancialInstitutionName &&
            this.originatorCity == other.originatorCity &&
            this.originatorCompanyEntryDescription == other.originatorCompanyEntryDescription &&
            this.originatorCountry == other.originatorCountry &&
            this.originatorIdentification == other.originatorIdentification &&
            this.originatorName == other.originatorName &&
            this.originatorPostalCode == other.originatorPostalCode &&
            this.originatorStateOrProvince == other.originatorStateOrProvince &&
            this.originatorStreetAddress == other.originatorStreetAddress &&
            this.paymentRelatedInformation == other.paymentRelatedInformation &&
            this.paymentRelatedInformation2 == other.paymentRelatedInformation2 &&
            this.receiverCity == other.receiverCity &&
            this.receiverCountry == other.receiverCountry &&
            this.receiverIdentificationNumber == other.receiverIdentificationNumber &&
            this.receiverPostalCode == other.receiverPostalCode &&
            this.receiverStateOrProvince == other.receiverStateOrProvince &&
            this.receiverStreetAddress == other.receiverStreetAddress &&
            this.receivingCompanyOrIndividualName == other.receivingCompanyOrIndividualName &&
            this.receivingDepositoryFinancialInstitutionCountry ==
                other.receivingDepositoryFinancialInstitutionCountry &&
            this.receivingDepositoryFinancialInstitutionId ==
                other.receivingDepositoryFinancialInstitutionId &&
            this.receivingDepositoryFinancialInstitutionIdQualifier ==
                other.receivingDepositoryFinancialInstitutionIdQualifier &&
            this.receivingDepositoryFinancialInstitutionName ==
                other.receivingDepositoryFinancialInstitutionName &&
            this.traceNumber == other.traceNumber &&
            this.type == other.type &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    amount,
                    destinationCountryCode,
                    destinationCurrencyCode,
                    foreignExchangeIndicator,
                    foreignExchangeReference,
                    foreignExchangeReferenceIndicator,
                    foreignPaymentAmount,
                    foreignTraceNumber,
                    internationalTransactionTypeCode,
                    originatingCurrencyCode,
                    originatingDepositoryFinancialInstitutionBranchCountry,
                    originatingDepositoryFinancialInstitutionId,
                    originatingDepositoryFinancialInstitutionIdQualifier,
                    originatingDepositoryFinancialInstitutionName,
                    originatorCity,
                    originatorCompanyEntryDescription,
                    originatorCountry,
                    originatorIdentification,
                    originatorName,
                    originatorPostalCode,
                    originatorStateOrProvince,
                    originatorStreetAddress,
                    paymentRelatedInformation,
                    paymentRelatedInformation2,
                    receiverCity,
                    receiverCountry,
                    receiverIdentificationNumber,
                    receiverPostalCode,
                    receiverStateOrProvince,
                    receiverStreetAddress,
                    receivingCompanyOrIndividualName,
                    receivingDepositoryFinancialInstitutionCountry,
                    receivingDepositoryFinancialInstitutionId,
                    receivingDepositoryFinancialInstitutionIdQualifier,
                    receivingDepositoryFinancialInstitutionName,
                    traceNumber,
                    type,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "InboundInternationalAchTransfer{amount=$amount, destinationCountryCode=$destinationCountryCode, destinationCurrencyCode=$destinationCurrencyCode, foreignExchangeIndicator=$foreignExchangeIndicator, foreignExchangeReference=$foreignExchangeReference, foreignExchangeReferenceIndicator=$foreignExchangeReferenceIndicator, foreignPaymentAmount=$foreignPaymentAmount, foreignTraceNumber=$foreignTraceNumber, internationalTransactionTypeCode=$internationalTransactionTypeCode, originatingCurrencyCode=$originatingCurrencyCode, originatingDepositoryFinancialInstitutionBranchCountry=$originatingDepositoryFinancialInstitutionBranchCountry, originatingDepositoryFinancialInstitutionId=$originatingDepositoryFinancialInstitutionId, originatingDepositoryFinancialInstitutionIdQualifier=$originatingDepositoryFinancialInstitutionIdQualifier, originatingDepositoryFinancialInstitutionName=$originatingDepositoryFinancialInstitutionName, originatorCity=$originatorCity, originatorCompanyEntryDescription=$originatorCompanyEntryDescription, originatorCountry=$originatorCountry, originatorIdentification=$originatorIdentification, originatorName=$originatorName, originatorPostalCode=$originatorPostalCode, originatorStateOrProvince=$originatorStateOrProvince, originatorStreetAddress=$originatorStreetAddress, paymentRelatedInformation=$paymentRelatedInformation, paymentRelatedInformation2=$paymentRelatedInformation2, receiverCity=$receiverCity, receiverCountry=$receiverCountry, receiverIdentificationNumber=$receiverIdentificationNumber, receiverPostalCode=$receiverPostalCode, receiverStateOrProvince=$receiverStateOrProvince, receiverStreetAddress=$receiverStreetAddress, receivingCompanyOrIndividualName=$receivingCompanyOrIndividualName, receivingDepositoryFinancialInstitutionCountry=$receivingDepositoryFinancialInstitutionCountry, receivingDepositoryFinancialInstitutionId=$receivingDepositoryFinancialInstitutionId, receivingDepositoryFinancialInstitutionIdQualifier=$receivingDepositoryFinancialInstitutionIdQualifier, receivingDepositoryFinancialInstitutionName=$receivingDepositoryFinancialInstitutionName, traceNumber=$traceNumber, type=$type, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var amount: JsonField<Long> = JsonMissing.of()
        private var destinationCountryCode: JsonField<String> = JsonMissing.of()
        private var destinationCurrencyCode: JsonField<String> = JsonMissing.of()
        private var foreignExchangeIndicator: JsonField<ForeignExchangeIndicator> = JsonMissing.of()
        private var foreignExchangeReference: JsonField<String> = JsonMissing.of()
        private var foreignExchangeReferenceIndicator:
            JsonField<ForeignExchangeReferenceIndicator> =
            JsonMissing.of()
        private var foreignPaymentAmount: JsonField<Long> = JsonMissing.of()
        private var foreignTraceNumber: JsonField<String> = JsonMissing.of()
        private var internationalTransactionTypeCode: JsonField<InternationalTransactionTypeCode> =
            JsonMissing.of()
        private var originatingCurrencyCode: JsonField<String> = JsonMissing.of()
        private var originatingDepositoryFinancialInstitutionBranchCountry: JsonField<String> =
            JsonMissing.of()
        private var originatingDepositoryFinancialInstitutionId: JsonField<String> =
            JsonMissing.of()
        private var originatingDepositoryFinancialInstitutionIdQualifier:
            JsonField<OriginatingDepositoryFinancialInstitutionIdQualifier> =
            JsonMissing.of()
        private var originatingDepositoryFinancialInstitutionName: JsonField<String> =
            JsonMissing.of()
        private var originatorCity: JsonField<String> = JsonMissing.of()
        private var originatorCompanyEntryDescription: JsonField<String> = JsonMissing.of()
        private var originatorCountry: JsonField<String> = JsonMissing.of()
        private var originatorIdentification: JsonField<String> = JsonMissing.of()
        private var originatorName: JsonField<String> = JsonMissing.of()
        private var originatorPostalCode: JsonField<String> = JsonMissing.of()
        private var originatorStateOrProvince: JsonField<String> = JsonMissing.of()
        private var originatorStreetAddress: JsonField<String> = JsonMissing.of()
        private var paymentRelatedInformation: JsonField<String> = JsonMissing.of()
        private var paymentRelatedInformation2: JsonField<String> = JsonMissing.of()
        private var receiverCity: JsonField<String> = JsonMissing.of()
        private var receiverCountry: JsonField<String> = JsonMissing.of()
        private var receiverIdentificationNumber: JsonField<String> = JsonMissing.of()
        private var receiverPostalCode: JsonField<String> = JsonMissing.of()
        private var receiverStateOrProvince: JsonField<String> = JsonMissing.of()
        private var receiverStreetAddress: JsonField<String> = JsonMissing.of()
        private var receivingCompanyOrIndividualName: JsonField<String> = JsonMissing.of()
        private var receivingDepositoryFinancialInstitutionCountry: JsonField<String> =
            JsonMissing.of()
        private var receivingDepositoryFinancialInstitutionId: JsonField<String> = JsonMissing.of()
        private var receivingDepositoryFinancialInstitutionIdQualifier:
            JsonField<ReceivingDepositoryFinancialInstitutionIdQualifier> =
            JsonMissing.of()
        private var receivingDepositoryFinancialInstitutionName: JsonField<String> =
            JsonMissing.of()
        private var traceNumber: JsonField<String> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(inboundInternationalAchTransfer: InboundInternationalAchTransfer) =
            apply {
                this.amount = inboundInternationalAchTransfer.amount
                this.destinationCountryCode = inboundInternationalAchTransfer.destinationCountryCode
                this.destinationCurrencyCode =
                    inboundInternationalAchTransfer.destinationCurrencyCode
                this.foreignExchangeIndicator =
                    inboundInternationalAchTransfer.foreignExchangeIndicator
                this.foreignExchangeReference =
                    inboundInternationalAchTransfer.foreignExchangeReference
                this.foreignExchangeReferenceIndicator =
                    inboundInternationalAchTransfer.foreignExchangeReferenceIndicator
                this.foreignPaymentAmount = inboundInternationalAchTransfer.foreignPaymentAmount
                this.foreignTraceNumber = inboundInternationalAchTransfer.foreignTraceNumber
                this.internationalTransactionTypeCode =
                    inboundInternationalAchTransfer.internationalTransactionTypeCode
                this.originatingCurrencyCode =
                    inboundInternationalAchTransfer.originatingCurrencyCode
                this.originatingDepositoryFinancialInstitutionBranchCountry =
                    inboundInternationalAchTransfer
                        .originatingDepositoryFinancialInstitutionBranchCountry
                this.originatingDepositoryFinancialInstitutionId =
                    inboundInternationalAchTransfer.originatingDepositoryFinancialInstitutionId
                this.originatingDepositoryFinancialInstitutionIdQualifier =
                    inboundInternationalAchTransfer
                        .originatingDepositoryFinancialInstitutionIdQualifier
                this.originatingDepositoryFinancialInstitutionName =
                    inboundInternationalAchTransfer.originatingDepositoryFinancialInstitutionName
                this.originatorCity = inboundInternationalAchTransfer.originatorCity
                this.originatorCompanyEntryDescription =
                    inboundInternationalAchTransfer.originatorCompanyEntryDescription
                this.originatorCountry = inboundInternationalAchTransfer.originatorCountry
                this.originatorIdentification =
                    inboundInternationalAchTransfer.originatorIdentification
                this.originatorName = inboundInternationalAchTransfer.originatorName
                this.originatorPostalCode = inboundInternationalAchTransfer.originatorPostalCode
                this.originatorStateOrProvince =
                    inboundInternationalAchTransfer.originatorStateOrProvince
                this.originatorStreetAddress =
                    inboundInternationalAchTransfer.originatorStreetAddress
                this.paymentRelatedInformation =
                    inboundInternationalAchTransfer.paymentRelatedInformation
                this.paymentRelatedInformation2 =
                    inboundInternationalAchTransfer.paymentRelatedInformation2
                this.receiverCity = inboundInternationalAchTransfer.receiverCity
                this.receiverCountry = inboundInternationalAchTransfer.receiverCountry
                this.receiverIdentificationNumber =
                    inboundInternationalAchTransfer.receiverIdentificationNumber
                this.receiverPostalCode = inboundInternationalAchTransfer.receiverPostalCode
                this.receiverStateOrProvince =
                    inboundInternationalAchTransfer.receiverStateOrProvince
                this.receiverStreetAddress = inboundInternationalAchTransfer.receiverStreetAddress
                this.receivingCompanyOrIndividualName =
                    inboundInternationalAchTransfer.receivingCompanyOrIndividualName
                this.receivingDepositoryFinancialInstitutionCountry =
                    inboundInternationalAchTransfer.receivingDepositoryFinancialInstitutionCountry
                this.receivingDepositoryFinancialInstitutionId =
                    inboundInternationalAchTransfer.receivingDepositoryFinancialInstitutionId
                this.receivingDepositoryFinancialInstitutionIdQualifier =
                    inboundInternationalAchTransfer
                        .receivingDepositoryFinancialInstitutionIdQualifier
                this.receivingDepositoryFinancialInstitutionName =
                    inboundInternationalAchTransfer.receivingDepositoryFinancialInstitutionName
                this.traceNumber = inboundInternationalAchTransfer.traceNumber
                this.type = inboundInternationalAchTransfer.type
                additionalProperties(inboundInternationalAchTransfer.additionalProperties)
            }

        /**
         * The amount in the minor unit of the destination account currency. For dollars, for
         * example, this is cents.
         */
        fun amount(amount: Long) = amount(JsonField.of(amount))

        /**
         * The amount in the minor unit of the destination account currency. For dollars, for
         * example, this is cents.
         */
        @JsonProperty("amount")
        @ExcludeMissing
        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

        /**
         * The [ISO 3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), Alpha-2 country code of
         * the destination country.
         */
        fun destinationCountryCode(destinationCountryCode: String) =
            destinationCountryCode(JsonField.of(destinationCountryCode))

        /**
         * The [ISO 3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), Alpha-2 country code of
         * the destination country.
         */
        @JsonProperty("destination_country_code")
        @ExcludeMissing
        fun destinationCountryCode(destinationCountryCode: JsonField<String>) = apply {
            this.destinationCountryCode = destinationCountryCode
        }

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code for the destination
         * bank account.
         */
        fun destinationCurrencyCode(destinationCurrencyCode: String) =
            destinationCurrencyCode(JsonField.of(destinationCurrencyCode))

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code for the destination
         * bank account.
         */
        @JsonProperty("destination_currency_code")
        @ExcludeMissing
        fun destinationCurrencyCode(destinationCurrencyCode: JsonField<String>) = apply {
            this.destinationCurrencyCode = destinationCurrencyCode
        }

        /** A description of how the foreign exchange rate was calculated. */
        fun foreignExchangeIndicator(foreignExchangeIndicator: ForeignExchangeIndicator) =
            foreignExchangeIndicator(JsonField.of(foreignExchangeIndicator))

        /** A description of how the foreign exchange rate was calculated. */
        @JsonProperty("foreign_exchange_indicator")
        @ExcludeMissing
        fun foreignExchangeIndicator(
            foreignExchangeIndicator: JsonField<ForeignExchangeIndicator>
        ) = apply { this.foreignExchangeIndicator = foreignExchangeIndicator }

        /**
         * Depending on the `foreign_exchange_reference_indicator`, an exchange rate or a reference
         * to a well-known rate.
         */
        fun foreignExchangeReference(foreignExchangeReference: String) =
            foreignExchangeReference(JsonField.of(foreignExchangeReference))

        /**
         * Depending on the `foreign_exchange_reference_indicator`, an exchange rate or a reference
         * to a well-known rate.
         */
        @JsonProperty("foreign_exchange_reference")
        @ExcludeMissing
        fun foreignExchangeReference(foreignExchangeReference: JsonField<String>) = apply {
            this.foreignExchangeReference = foreignExchangeReference
        }

        /**
         * An instruction of how to interpret the `foreign_exchange_reference` field for this
         * Transaction.
         */
        fun foreignExchangeReferenceIndicator(
            foreignExchangeReferenceIndicator: ForeignExchangeReferenceIndicator
        ) = foreignExchangeReferenceIndicator(JsonField.of(foreignExchangeReferenceIndicator))

        /**
         * An instruction of how to interpret the `foreign_exchange_reference` field for this
         * Transaction.
         */
        @JsonProperty("foreign_exchange_reference_indicator")
        @ExcludeMissing
        fun foreignExchangeReferenceIndicator(
            foreignExchangeReferenceIndicator: JsonField<ForeignExchangeReferenceIndicator>
        ) = apply { this.foreignExchangeReferenceIndicator = foreignExchangeReferenceIndicator }

        /**
         * The amount in the minor unit of the foreign payment currency. For dollars, for example,
         * this is cents.
         */
        fun foreignPaymentAmount(foreignPaymentAmount: Long) =
            foreignPaymentAmount(JsonField.of(foreignPaymentAmount))

        /**
         * The amount in the minor unit of the foreign payment currency. For dollars, for example,
         * this is cents.
         */
        @JsonProperty("foreign_payment_amount")
        @ExcludeMissing
        fun foreignPaymentAmount(foreignPaymentAmount: JsonField<Long>) = apply {
            this.foreignPaymentAmount = foreignPaymentAmount
        }

        /** A reference number in the foreign banking infrastructure. */
        fun foreignTraceNumber(foreignTraceNumber: String) =
            foreignTraceNumber(JsonField.of(foreignTraceNumber))

        /** A reference number in the foreign banking infrastructure. */
        @JsonProperty("foreign_trace_number")
        @ExcludeMissing
        fun foreignTraceNumber(foreignTraceNumber: JsonField<String>) = apply {
            this.foreignTraceNumber = foreignTraceNumber
        }

        /** The type of transfer. Set by the originator. */
        fun internationalTransactionTypeCode(
            internationalTransactionTypeCode: InternationalTransactionTypeCode
        ) = internationalTransactionTypeCode(JsonField.of(internationalTransactionTypeCode))

        /** The type of transfer. Set by the originator. */
        @JsonProperty("international_transaction_type_code")
        @ExcludeMissing
        fun internationalTransactionTypeCode(
            internationalTransactionTypeCode: JsonField<InternationalTransactionTypeCode>
        ) = apply { this.internationalTransactionTypeCode = internationalTransactionTypeCode }

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code for the originating
         * bank account.
         */
        fun originatingCurrencyCode(originatingCurrencyCode: String) =
            originatingCurrencyCode(JsonField.of(originatingCurrencyCode))

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code for the originating
         * bank account.
         */
        @JsonProperty("originating_currency_code")
        @ExcludeMissing
        fun originatingCurrencyCode(originatingCurrencyCode: JsonField<String>) = apply {
            this.originatingCurrencyCode = originatingCurrencyCode
        }

        /**
         * The [ISO 3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), Alpha-2 country code of
         * the originating branch country.
         */
        fun originatingDepositoryFinancialInstitutionBranchCountry(
            originatingDepositoryFinancialInstitutionBranchCountry: String
        ) =
            originatingDepositoryFinancialInstitutionBranchCountry(
                JsonField.of(originatingDepositoryFinancialInstitutionBranchCountry)
            )

        /**
         * The [ISO 3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), Alpha-2 country code of
         * the originating branch country.
         */
        @JsonProperty("originating_depository_financial_institution_branch_country")
        @ExcludeMissing
        fun originatingDepositoryFinancialInstitutionBranchCountry(
            originatingDepositoryFinancialInstitutionBranchCountry: JsonField<String>
        ) = apply {
            this.originatingDepositoryFinancialInstitutionBranchCountry =
                originatingDepositoryFinancialInstitutionBranchCountry
        }

        /**
         * An identifier for the originating bank. One of an International Bank Account Number
         * (IBAN) bank identifier, SWIFT Bank Identification Code (BIC), or a domestic identifier
         * like a US Routing Number.
         */
        fun originatingDepositoryFinancialInstitutionId(
            originatingDepositoryFinancialInstitutionId: String
        ) =
            originatingDepositoryFinancialInstitutionId(
                JsonField.of(originatingDepositoryFinancialInstitutionId)
            )

        /**
         * An identifier for the originating bank. One of an International Bank Account Number
         * (IBAN) bank identifier, SWIFT Bank Identification Code (BIC), or a domestic identifier
         * like a US Routing Number.
         */
        @JsonProperty("originating_depository_financial_institution_id")
        @ExcludeMissing
        fun originatingDepositoryFinancialInstitutionId(
            originatingDepositoryFinancialInstitutionId: JsonField<String>
        ) = apply {
            this.originatingDepositoryFinancialInstitutionId =
                originatingDepositoryFinancialInstitutionId
        }

        /**
         * An instruction of how to interpret the `originating_depository_financial_institution_id`
         * field for this Transaction.
         */
        fun originatingDepositoryFinancialInstitutionIdQualifier(
            originatingDepositoryFinancialInstitutionIdQualifier:
                OriginatingDepositoryFinancialInstitutionIdQualifier
        ) =
            originatingDepositoryFinancialInstitutionIdQualifier(
                JsonField.of(originatingDepositoryFinancialInstitutionIdQualifier)
            )

        /**
         * An instruction of how to interpret the `originating_depository_financial_institution_id`
         * field for this Transaction.
         */
        @JsonProperty("originating_depository_financial_institution_id_qualifier")
        @ExcludeMissing
        fun originatingDepositoryFinancialInstitutionIdQualifier(
            originatingDepositoryFinancialInstitutionIdQualifier:
                JsonField<OriginatingDepositoryFinancialInstitutionIdQualifier>
        ) = apply {
            this.originatingDepositoryFinancialInstitutionIdQualifier =
                originatingDepositoryFinancialInstitutionIdQualifier
        }

        /**
         * The name of the originating bank. Sometimes this will refer to an American bank and
         * obscure the correspondent foreign bank.
         */
        fun originatingDepositoryFinancialInstitutionName(
            originatingDepositoryFinancialInstitutionName: String
        ) =
            originatingDepositoryFinancialInstitutionName(
                JsonField.of(originatingDepositoryFinancialInstitutionName)
            )

        /**
         * The name of the originating bank. Sometimes this will refer to an American bank and
         * obscure the correspondent foreign bank.
         */
        @JsonProperty("originating_depository_financial_institution_name")
        @ExcludeMissing
        fun originatingDepositoryFinancialInstitutionName(
            originatingDepositoryFinancialInstitutionName: JsonField<String>
        ) = apply {
            this.originatingDepositoryFinancialInstitutionName =
                originatingDepositoryFinancialInstitutionName
        }

        /** A portion of the originator address. This may be incomplete. */
        fun originatorCity(originatorCity: String) = originatorCity(JsonField.of(originatorCity))

        /** A portion of the originator address. This may be incomplete. */
        @JsonProperty("originator_city")
        @ExcludeMissing
        fun originatorCity(originatorCity: JsonField<String>) = apply {
            this.originatorCity = originatorCity
        }

        /** A description field set by the originator. */
        fun originatorCompanyEntryDescription(originatorCompanyEntryDescription: String) =
            originatorCompanyEntryDescription(JsonField.of(originatorCompanyEntryDescription))

        /** A description field set by the originator. */
        @JsonProperty("originator_company_entry_description")
        @ExcludeMissing
        fun originatorCompanyEntryDescription(
            originatorCompanyEntryDescription: JsonField<String>
        ) = apply { this.originatorCompanyEntryDescription = originatorCompanyEntryDescription }

        /**
         * A portion of the originator address. The
         * [ISO 3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), Alpha-2 country code of the
         * originator country.
         */
        fun originatorCountry(originatorCountry: String) =
            originatorCountry(JsonField.of(originatorCountry))

        /**
         * A portion of the originator address. The
         * [ISO 3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), Alpha-2 country code of the
         * originator country.
         */
        @JsonProperty("originator_country")
        @ExcludeMissing
        fun originatorCountry(originatorCountry: JsonField<String>) = apply {
            this.originatorCountry = originatorCountry
        }

        /**
         * An identifier for the originating company. This is generally stable across multiple ACH
         * transfers.
         */
        fun originatorIdentification(originatorIdentification: String) =
            originatorIdentification(JsonField.of(originatorIdentification))

        /**
         * An identifier for the originating company. This is generally stable across multiple ACH
         * transfers.
         */
        @JsonProperty("originator_identification")
        @ExcludeMissing
        fun originatorIdentification(originatorIdentification: JsonField<String>) = apply {
            this.originatorIdentification = originatorIdentification
        }

        /** Either the name of the originator or an intermediary money transmitter. */
        fun originatorName(originatorName: String) = originatorName(JsonField.of(originatorName))

        /** Either the name of the originator or an intermediary money transmitter. */
        @JsonProperty("originator_name")
        @ExcludeMissing
        fun originatorName(originatorName: JsonField<String>) = apply {
            this.originatorName = originatorName
        }

        /** A portion of the originator address. This may be incomplete. */
        fun originatorPostalCode(originatorPostalCode: String) =
            originatorPostalCode(JsonField.of(originatorPostalCode))

        /** A portion of the originator address. This may be incomplete. */
        @JsonProperty("originator_postal_code")
        @ExcludeMissing
        fun originatorPostalCode(originatorPostalCode: JsonField<String>) = apply {
            this.originatorPostalCode = originatorPostalCode
        }

        /** A portion of the originator address. This may be incomplete. */
        fun originatorStateOrProvince(originatorStateOrProvince: String) =
            originatorStateOrProvince(JsonField.of(originatorStateOrProvince))

        /** A portion of the originator address. This may be incomplete. */
        @JsonProperty("originator_state_or_province")
        @ExcludeMissing
        fun originatorStateOrProvince(originatorStateOrProvince: JsonField<String>) = apply {
            this.originatorStateOrProvince = originatorStateOrProvince
        }

        /** A portion of the originator address. This may be incomplete. */
        fun originatorStreetAddress(originatorStreetAddress: String) =
            originatorStreetAddress(JsonField.of(originatorStreetAddress))

        /** A portion of the originator address. This may be incomplete. */
        @JsonProperty("originator_street_address")
        @ExcludeMissing
        fun originatorStreetAddress(originatorStreetAddress: JsonField<String>) = apply {
            this.originatorStreetAddress = originatorStreetAddress
        }

        /** A description field set by the originator. */
        fun paymentRelatedInformation(paymentRelatedInformation: String) =
            paymentRelatedInformation(JsonField.of(paymentRelatedInformation))

        /** A description field set by the originator. */
        @JsonProperty("payment_related_information")
        @ExcludeMissing
        fun paymentRelatedInformation(paymentRelatedInformation: JsonField<String>) = apply {
            this.paymentRelatedInformation = paymentRelatedInformation
        }

        /** A description field set by the originator. */
        fun paymentRelatedInformation2(paymentRelatedInformation2: String) =
            paymentRelatedInformation2(JsonField.of(paymentRelatedInformation2))

        /** A description field set by the originator. */
        @JsonProperty("payment_related_information2")
        @ExcludeMissing
        fun paymentRelatedInformation2(paymentRelatedInformation2: JsonField<String>) = apply {
            this.paymentRelatedInformation2 = paymentRelatedInformation2
        }

        /** A portion of the receiver address. This may be incomplete. */
        fun receiverCity(receiverCity: String) = receiverCity(JsonField.of(receiverCity))

        /** A portion of the receiver address. This may be incomplete. */
        @JsonProperty("receiver_city")
        @ExcludeMissing
        fun receiverCity(receiverCity: JsonField<String>) = apply {
            this.receiverCity = receiverCity
        }

        /**
         * A portion of the receiver address. The
         * [ISO 3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), Alpha-2 country code of the
         * receiver country.
         */
        fun receiverCountry(receiverCountry: String) =
            receiverCountry(JsonField.of(receiverCountry))

        /**
         * A portion of the receiver address. The
         * [ISO 3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), Alpha-2 country code of the
         * receiver country.
         */
        @JsonProperty("receiver_country")
        @ExcludeMissing
        fun receiverCountry(receiverCountry: JsonField<String>) = apply {
            this.receiverCountry = receiverCountry
        }

        /** An identification number the originator uses for the receiver. */
        fun receiverIdentificationNumber(receiverIdentificationNumber: String) =
            receiverIdentificationNumber(JsonField.of(receiverIdentificationNumber))

        /** An identification number the originator uses for the receiver. */
        @JsonProperty("receiver_identification_number")
        @ExcludeMissing
        fun receiverIdentificationNumber(receiverIdentificationNumber: JsonField<String>) = apply {
            this.receiverIdentificationNumber = receiverIdentificationNumber
        }

        /** A portion of the receiver address. This may be incomplete. */
        fun receiverPostalCode(receiverPostalCode: String) =
            receiverPostalCode(JsonField.of(receiverPostalCode))

        /** A portion of the receiver address. This may be incomplete. */
        @JsonProperty("receiver_postal_code")
        @ExcludeMissing
        fun receiverPostalCode(receiverPostalCode: JsonField<String>) = apply {
            this.receiverPostalCode = receiverPostalCode
        }

        /** A portion of the receiver address. This may be incomplete. */
        fun receiverStateOrProvince(receiverStateOrProvince: String) =
            receiverStateOrProvince(JsonField.of(receiverStateOrProvince))

        /** A portion of the receiver address. This may be incomplete. */
        @JsonProperty("receiver_state_or_province")
        @ExcludeMissing
        fun receiverStateOrProvince(receiverStateOrProvince: JsonField<String>) = apply {
            this.receiverStateOrProvince = receiverStateOrProvince
        }

        /** A portion of the receiver address. This may be incomplete. */
        fun receiverStreetAddress(receiverStreetAddress: String) =
            receiverStreetAddress(JsonField.of(receiverStreetAddress))

        /** A portion of the receiver address. This may be incomplete. */
        @JsonProperty("receiver_street_address")
        @ExcludeMissing
        fun receiverStreetAddress(receiverStreetAddress: JsonField<String>) = apply {
            this.receiverStreetAddress = receiverStreetAddress
        }

        /** The name of the receiver of the transfer. This is not verified by Increase. */
        fun receivingCompanyOrIndividualName(receivingCompanyOrIndividualName: String) =
            receivingCompanyOrIndividualName(JsonField.of(receivingCompanyOrIndividualName))

        /** The name of the receiver of the transfer. This is not verified by Increase. */
        @JsonProperty("receiving_company_or_individual_name")
        @ExcludeMissing
        fun receivingCompanyOrIndividualName(receivingCompanyOrIndividualName: JsonField<String>) =
            apply {
                this.receivingCompanyOrIndividualName = receivingCompanyOrIndividualName
            }

        /**
         * The [ISO 3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), Alpha-2 country code of
         * the receiving bank country.
         */
        fun receivingDepositoryFinancialInstitutionCountry(
            receivingDepositoryFinancialInstitutionCountry: String
        ) =
            receivingDepositoryFinancialInstitutionCountry(
                JsonField.of(receivingDepositoryFinancialInstitutionCountry)
            )

        /**
         * The [ISO 3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), Alpha-2 country code of
         * the receiving bank country.
         */
        @JsonProperty("receiving_depository_financial_institution_country")
        @ExcludeMissing
        fun receivingDepositoryFinancialInstitutionCountry(
            receivingDepositoryFinancialInstitutionCountry: JsonField<String>
        ) = apply {
            this.receivingDepositoryFinancialInstitutionCountry =
                receivingDepositoryFinancialInstitutionCountry
        }

        /**
         * An identifier for the receiving bank. One of an International Bank Account Number (IBAN)
         * bank identifier, SWIFT Bank Identification Code (BIC), or a domestic identifier like a US
         * Routing Number.
         */
        fun receivingDepositoryFinancialInstitutionId(
            receivingDepositoryFinancialInstitutionId: String
        ) =
            receivingDepositoryFinancialInstitutionId(
                JsonField.of(receivingDepositoryFinancialInstitutionId)
            )

        /**
         * An identifier for the receiving bank. One of an International Bank Account Number (IBAN)
         * bank identifier, SWIFT Bank Identification Code (BIC), or a domestic identifier like a US
         * Routing Number.
         */
        @JsonProperty("receiving_depository_financial_institution_id")
        @ExcludeMissing
        fun receivingDepositoryFinancialInstitutionId(
            receivingDepositoryFinancialInstitutionId: JsonField<String>
        ) = apply {
            this.receivingDepositoryFinancialInstitutionId =
                receivingDepositoryFinancialInstitutionId
        }

        /**
         * An instruction of how to interpret the `receiving_depository_financial_institution_id`
         * field for this Transaction.
         */
        fun receivingDepositoryFinancialInstitutionIdQualifier(
            receivingDepositoryFinancialInstitutionIdQualifier:
                ReceivingDepositoryFinancialInstitutionIdQualifier
        ) =
            receivingDepositoryFinancialInstitutionIdQualifier(
                JsonField.of(receivingDepositoryFinancialInstitutionIdQualifier)
            )

        /**
         * An instruction of how to interpret the `receiving_depository_financial_institution_id`
         * field for this Transaction.
         */
        @JsonProperty("receiving_depository_financial_institution_id_qualifier")
        @ExcludeMissing
        fun receivingDepositoryFinancialInstitutionIdQualifier(
            receivingDepositoryFinancialInstitutionIdQualifier:
                JsonField<ReceivingDepositoryFinancialInstitutionIdQualifier>
        ) = apply {
            this.receivingDepositoryFinancialInstitutionIdQualifier =
                receivingDepositoryFinancialInstitutionIdQualifier
        }

        /** The name of the receiving bank, as set by the sending financial institution. */
        fun receivingDepositoryFinancialInstitutionName(
            receivingDepositoryFinancialInstitutionName: String
        ) =
            receivingDepositoryFinancialInstitutionName(
                JsonField.of(receivingDepositoryFinancialInstitutionName)
            )

        /** The name of the receiving bank, as set by the sending financial institution. */
        @JsonProperty("receiving_depository_financial_institution_name")
        @ExcludeMissing
        fun receivingDepositoryFinancialInstitutionName(
            receivingDepositoryFinancialInstitutionName: JsonField<String>
        ) = apply {
            this.receivingDepositoryFinancialInstitutionName =
                receivingDepositoryFinancialInstitutionName
        }

        /**
         * A 15 digit number recorded in the Nacha file and available to both the originating and
         * receiving bank. Along with the amount, date, and originating routing number, this can be
         * used to identify the ACH transfer at either bank. ACH trace numbers are not unique, but
         * are
         * [used to correlate returns](https://increase.com/documentation/ach-returns#ach-returns).
         */
        fun traceNumber(traceNumber: String) = traceNumber(JsonField.of(traceNumber))

        /**
         * A 15 digit number recorded in the Nacha file and available to both the originating and
         * receiving bank. Along with the amount, date, and originating routing number, this can be
         * used to identify the ACH transfer at either bank. ACH trace numbers are not unique, but
         * are
         * [used to correlate returns](https://increase.com/documentation/ach-returns#ach-returns).
         */
        @JsonProperty("trace_number")
        @ExcludeMissing
        fun traceNumber(traceNumber: JsonField<String>) = apply { this.traceNumber = traceNumber }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `inbound_international_ach_transfer`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * A constant representing the object's type. For this resource it will always be
         * `inbound_international_ach_transfer`.
         */
        @JsonProperty("type")
        @ExcludeMissing
        fun type(type: JsonField<Type>) = apply { this.type = type }

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

        fun build(): InboundInternationalAchTransfer =
            InboundInternationalAchTransfer(
                amount,
                destinationCountryCode,
                destinationCurrencyCode,
                foreignExchangeIndicator,
                foreignExchangeReference,
                foreignExchangeReferenceIndicator,
                foreignPaymentAmount,
                foreignTraceNumber,
                internationalTransactionTypeCode,
                originatingCurrencyCode,
                originatingDepositoryFinancialInstitutionBranchCountry,
                originatingDepositoryFinancialInstitutionId,
                originatingDepositoryFinancialInstitutionIdQualifier,
                originatingDepositoryFinancialInstitutionName,
                originatorCity,
                originatorCompanyEntryDescription,
                originatorCountry,
                originatorIdentification,
                originatorName,
                originatorPostalCode,
                originatorStateOrProvince,
                originatorStreetAddress,
                paymentRelatedInformation,
                paymentRelatedInformation2,
                receiverCity,
                receiverCountry,
                receiverIdentificationNumber,
                receiverPostalCode,
                receiverStateOrProvince,
                receiverStreetAddress,
                receivingCompanyOrIndividualName,
                receivingDepositoryFinancialInstitutionCountry,
                receivingDepositoryFinancialInstitutionId,
                receivingDepositoryFinancialInstitutionIdQualifier,
                receivingDepositoryFinancialInstitutionName,
                traceNumber,
                type,
                additionalProperties.toUnmodifiable(),
            )
    }

    class ForeignExchangeIndicator
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ForeignExchangeIndicator && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField
            val FIXED_TO_VARIABLE = ForeignExchangeIndicator(JsonField.of("fixed_to_variable"))

            @JvmField
            val VARIABLE_TO_FIXED = ForeignExchangeIndicator(JsonField.of("variable_to_fixed"))

            @JvmField val FIXED_TO_FIXED = ForeignExchangeIndicator(JsonField.of("fixed_to_fixed"))

            @JvmStatic fun of(value: String) = ForeignExchangeIndicator(JsonField.of(value))
        }

        enum class Known {
            FIXED_TO_VARIABLE,
            VARIABLE_TO_FIXED,
            FIXED_TO_FIXED,
        }

        enum class Value {
            FIXED_TO_VARIABLE,
            VARIABLE_TO_FIXED,
            FIXED_TO_FIXED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                FIXED_TO_VARIABLE -> Value.FIXED_TO_VARIABLE
                VARIABLE_TO_FIXED -> Value.VARIABLE_TO_FIXED
                FIXED_TO_FIXED -> Value.FIXED_TO_FIXED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                FIXED_TO_VARIABLE -> Known.FIXED_TO_VARIABLE
                VARIABLE_TO_FIXED -> Known.VARIABLE_TO_FIXED
                FIXED_TO_FIXED -> Known.FIXED_TO_FIXED
                else ->
                    throw IncreaseInvalidDataException("Unknown ForeignExchangeIndicator: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    class ForeignExchangeReferenceIndicator
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ForeignExchangeReferenceIndicator && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField
            val FOREIGN_EXCHANGE_RATE =
                ForeignExchangeReferenceIndicator(JsonField.of("foreign_exchange_rate"))

            @JvmField
            val FOREIGN_EXCHANGE_REFERENCE_NUMBER =
                ForeignExchangeReferenceIndicator(JsonField.of("foreign_exchange_reference_number"))

            @JvmField val BLANK = ForeignExchangeReferenceIndicator(JsonField.of("blank"))

            @JvmStatic
            fun of(value: String) = ForeignExchangeReferenceIndicator(JsonField.of(value))
        }

        enum class Known {
            FOREIGN_EXCHANGE_RATE,
            FOREIGN_EXCHANGE_REFERENCE_NUMBER,
            BLANK,
        }

        enum class Value {
            FOREIGN_EXCHANGE_RATE,
            FOREIGN_EXCHANGE_REFERENCE_NUMBER,
            BLANK,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                FOREIGN_EXCHANGE_RATE -> Value.FOREIGN_EXCHANGE_RATE
                FOREIGN_EXCHANGE_REFERENCE_NUMBER -> Value.FOREIGN_EXCHANGE_REFERENCE_NUMBER
                BLANK -> Value.BLANK
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                FOREIGN_EXCHANGE_RATE -> Known.FOREIGN_EXCHANGE_RATE
                FOREIGN_EXCHANGE_REFERENCE_NUMBER -> Known.FOREIGN_EXCHANGE_REFERENCE_NUMBER
                BLANK -> Known.BLANK
                else ->
                    throw IncreaseInvalidDataException(
                        "Unknown ForeignExchangeReferenceIndicator: $value"
                    )
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    class InternationalTransactionTypeCode
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is InternationalTransactionTypeCode && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val ANNUITY = InternationalTransactionTypeCode(JsonField.of("annuity"))

            @JvmField
            val BUSINESS_OR_COMMERCIAL =
                InternationalTransactionTypeCode(JsonField.of("business_or_commercial"))

            @JvmField val DEPOSIT = InternationalTransactionTypeCode(JsonField.of("deposit"))

            @JvmField val LOAN = InternationalTransactionTypeCode(JsonField.of("loan"))

            @JvmField
            val MISCELLANEOUS = InternationalTransactionTypeCode(JsonField.of("miscellaneous"))

            @JvmField val MORTGAGE = InternationalTransactionTypeCode(JsonField.of("mortgage"))

            @JvmField val PENSION = InternationalTransactionTypeCode(JsonField.of("pension"))

            @JvmField val REMITTANCE = InternationalTransactionTypeCode(JsonField.of("remittance"))

            @JvmField
            val RENT_OR_LEASE = InternationalTransactionTypeCode(JsonField.of("rent_or_lease"))

            @JvmField
            val SALARY_OR_PAYROLL =
                InternationalTransactionTypeCode(JsonField.of("salary_or_payroll"))

            @JvmField val TAX = InternationalTransactionTypeCode(JsonField.of("tax"))

            @JvmField
            val ACCOUNTS_RECEIVABLE =
                InternationalTransactionTypeCode(JsonField.of("accounts_receivable"))

            @JvmField
            val BACK_OFFICE_CONVERSION =
                InternationalTransactionTypeCode(JsonField.of("back_office_conversion"))

            @JvmField
            val MACHINE_TRANSFER =
                InternationalTransactionTypeCode(JsonField.of("machine_transfer"))

            @JvmField
            val POINT_OF_PURCHASE =
                InternationalTransactionTypeCode(JsonField.of("point_of_purchase"))

            @JvmField
            val POINT_OF_SALE = InternationalTransactionTypeCode(JsonField.of("point_of_sale"))

            @JvmField
            val REPRESENTED_CHECK =
                InternationalTransactionTypeCode(JsonField.of("represented_check"))

            @JvmField
            val SHARED_NETWORK_TRANSACTION =
                InternationalTransactionTypeCode(JsonField.of("shared_network_transaction"))

            @JvmField
            val TELPHONE_INITIATED =
                InternationalTransactionTypeCode(JsonField.of("telphone_initiated"))

            @JvmField
            val INTERNET_INITIATED =
                InternationalTransactionTypeCode(JsonField.of("internet_initiated"))

            @JvmStatic fun of(value: String) = InternationalTransactionTypeCode(JsonField.of(value))
        }

        enum class Known {
            ANNUITY,
            BUSINESS_OR_COMMERCIAL,
            DEPOSIT,
            LOAN,
            MISCELLANEOUS,
            MORTGAGE,
            PENSION,
            REMITTANCE,
            RENT_OR_LEASE,
            SALARY_OR_PAYROLL,
            TAX,
            ACCOUNTS_RECEIVABLE,
            BACK_OFFICE_CONVERSION,
            MACHINE_TRANSFER,
            POINT_OF_PURCHASE,
            POINT_OF_SALE,
            REPRESENTED_CHECK,
            SHARED_NETWORK_TRANSACTION,
            TELPHONE_INITIATED,
            INTERNET_INITIATED,
        }

        enum class Value {
            ANNUITY,
            BUSINESS_OR_COMMERCIAL,
            DEPOSIT,
            LOAN,
            MISCELLANEOUS,
            MORTGAGE,
            PENSION,
            REMITTANCE,
            RENT_OR_LEASE,
            SALARY_OR_PAYROLL,
            TAX,
            ACCOUNTS_RECEIVABLE,
            BACK_OFFICE_CONVERSION,
            MACHINE_TRANSFER,
            POINT_OF_PURCHASE,
            POINT_OF_SALE,
            REPRESENTED_CHECK,
            SHARED_NETWORK_TRANSACTION,
            TELPHONE_INITIATED,
            INTERNET_INITIATED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ANNUITY -> Value.ANNUITY
                BUSINESS_OR_COMMERCIAL -> Value.BUSINESS_OR_COMMERCIAL
                DEPOSIT -> Value.DEPOSIT
                LOAN -> Value.LOAN
                MISCELLANEOUS -> Value.MISCELLANEOUS
                MORTGAGE -> Value.MORTGAGE
                PENSION -> Value.PENSION
                REMITTANCE -> Value.REMITTANCE
                RENT_OR_LEASE -> Value.RENT_OR_LEASE
                SALARY_OR_PAYROLL -> Value.SALARY_OR_PAYROLL
                TAX -> Value.TAX
                ACCOUNTS_RECEIVABLE -> Value.ACCOUNTS_RECEIVABLE
                BACK_OFFICE_CONVERSION -> Value.BACK_OFFICE_CONVERSION
                MACHINE_TRANSFER -> Value.MACHINE_TRANSFER
                POINT_OF_PURCHASE -> Value.POINT_OF_PURCHASE
                POINT_OF_SALE -> Value.POINT_OF_SALE
                REPRESENTED_CHECK -> Value.REPRESENTED_CHECK
                SHARED_NETWORK_TRANSACTION -> Value.SHARED_NETWORK_TRANSACTION
                TELPHONE_INITIATED -> Value.TELPHONE_INITIATED
                INTERNET_INITIATED -> Value.INTERNET_INITIATED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ANNUITY -> Known.ANNUITY
                BUSINESS_OR_COMMERCIAL -> Known.BUSINESS_OR_COMMERCIAL
                DEPOSIT -> Known.DEPOSIT
                LOAN -> Known.LOAN
                MISCELLANEOUS -> Known.MISCELLANEOUS
                MORTGAGE -> Known.MORTGAGE
                PENSION -> Known.PENSION
                REMITTANCE -> Known.REMITTANCE
                RENT_OR_LEASE -> Known.RENT_OR_LEASE
                SALARY_OR_PAYROLL -> Known.SALARY_OR_PAYROLL
                TAX -> Known.TAX
                ACCOUNTS_RECEIVABLE -> Known.ACCOUNTS_RECEIVABLE
                BACK_OFFICE_CONVERSION -> Known.BACK_OFFICE_CONVERSION
                MACHINE_TRANSFER -> Known.MACHINE_TRANSFER
                POINT_OF_PURCHASE -> Known.POINT_OF_PURCHASE
                POINT_OF_SALE -> Known.POINT_OF_SALE
                REPRESENTED_CHECK -> Known.REPRESENTED_CHECK
                SHARED_NETWORK_TRANSACTION -> Known.SHARED_NETWORK_TRANSACTION
                TELPHONE_INITIATED -> Known.TELPHONE_INITIATED
                INTERNET_INITIATED -> Known.INTERNET_INITIATED
                else ->
                    throw IncreaseInvalidDataException(
                        "Unknown InternationalTransactionTypeCode: $value"
                    )
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    class OriginatingDepositoryFinancialInstitutionIdQualifier
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is OriginatingDepositoryFinancialInstitutionIdQualifier &&
                this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField
            val NATIONAL_CLEARING_SYSTEM_NUMBER =
                OriginatingDepositoryFinancialInstitutionIdQualifier(
                    JsonField.of("national_clearing_system_number")
                )

            @JvmField
            val BIC_CODE =
                OriginatingDepositoryFinancialInstitutionIdQualifier(JsonField.of("bic_code"))

            @JvmField
            val IBAN = OriginatingDepositoryFinancialInstitutionIdQualifier(JsonField.of("iban"))

            @JvmStatic
            fun of(value: String) =
                OriginatingDepositoryFinancialInstitutionIdQualifier(JsonField.of(value))
        }

        enum class Known {
            NATIONAL_CLEARING_SYSTEM_NUMBER,
            BIC_CODE,
            IBAN,
        }

        enum class Value {
            NATIONAL_CLEARING_SYSTEM_NUMBER,
            BIC_CODE,
            IBAN,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                NATIONAL_CLEARING_SYSTEM_NUMBER -> Value.NATIONAL_CLEARING_SYSTEM_NUMBER
                BIC_CODE -> Value.BIC_CODE
                IBAN -> Value.IBAN
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                NATIONAL_CLEARING_SYSTEM_NUMBER -> Known.NATIONAL_CLEARING_SYSTEM_NUMBER
                BIC_CODE -> Known.BIC_CODE
                IBAN -> Known.IBAN
                else ->
                    throw IncreaseInvalidDataException(
                        "Unknown OriginatingDepositoryFinancialInstitutionIdQualifier: $value"
                    )
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    class ReceivingDepositoryFinancialInstitutionIdQualifier
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ReceivingDepositoryFinancialInstitutionIdQualifier &&
                this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField
            val NATIONAL_CLEARING_SYSTEM_NUMBER =
                ReceivingDepositoryFinancialInstitutionIdQualifier(
                    JsonField.of("national_clearing_system_number")
                )

            @JvmField
            val BIC_CODE =
                ReceivingDepositoryFinancialInstitutionIdQualifier(JsonField.of("bic_code"))

            @JvmField
            val IBAN = ReceivingDepositoryFinancialInstitutionIdQualifier(JsonField.of("iban"))

            @JvmStatic
            fun of(value: String) =
                ReceivingDepositoryFinancialInstitutionIdQualifier(JsonField.of(value))
        }

        enum class Known {
            NATIONAL_CLEARING_SYSTEM_NUMBER,
            BIC_CODE,
            IBAN,
        }

        enum class Value {
            NATIONAL_CLEARING_SYSTEM_NUMBER,
            BIC_CODE,
            IBAN,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                NATIONAL_CLEARING_SYSTEM_NUMBER -> Value.NATIONAL_CLEARING_SYSTEM_NUMBER
                BIC_CODE -> Value.BIC_CODE
                IBAN -> Value.IBAN
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                NATIONAL_CLEARING_SYSTEM_NUMBER -> Known.NATIONAL_CLEARING_SYSTEM_NUMBER
                BIC_CODE -> Known.BIC_CODE
                IBAN -> Known.IBAN
                else ->
                    throw IncreaseInvalidDataException(
                        "Unknown ReceivingDepositoryFinancialInstitutionIdQualifier: $value"
                    )
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

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
            val INBOUND_INTERNATIONAL_ACH_TRANSFER =
                Type(JsonField.of("inbound_international_ach_transfer"))

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            INBOUND_INTERNATIONAL_ACH_TRANSFER,
        }

        enum class Value {
            INBOUND_INTERNATIONAL_ACH_TRANSFER,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                INBOUND_INTERNATIONAL_ACH_TRANSFER -> Value.INBOUND_INTERNATIONAL_ACH_TRANSFER
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                INBOUND_INTERNATIONAL_ACH_TRANSFER -> Known.INBOUND_INTERNATIONAL_ACH_TRANSFER
                else -> throw IncreaseInvalidDataException("Unknown Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
