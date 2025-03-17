// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.simulations.inboundwiredrawdownrequests

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.Params
import com.increase.api.core.checkRequired
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import com.increase.api.core.immutableEmptyMap
import com.increase.api.core.toImmutable
import com.increase.api.errors.IncreaseInvalidDataException
import java.util.Objects
import java.util.Optional

/** Simulates receiving an [Inbound Wire Drawdown Request](#inbound-wire-drawdown-requests). */
class InboundWireDrawdownRequestCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The amount being requested in cents.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun amount(): Long = body.amount()

    /**
     * The drawdown request's beneficiary's account number.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun beneficiaryAccountNumber(): String = body.beneficiaryAccountNumber()

    /**
     * The drawdown request's beneficiary's routing number.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun beneficiaryRoutingNumber(): String = body.beneficiaryRoutingNumber()

    /**
     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the amount being requested.
     * Will always be "USD".
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun currency(): String = body.currency()

    /**
     * A message from the drawdown request's originator.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun messageToRecipient(): String = body.messageToRecipient()

    /**
     * The drawdown request's originator's account number.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun originatorAccountNumber(): String = body.originatorAccountNumber()

    /**
     * The drawdown request's originator's routing number.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun originatorRoutingNumber(): String = body.originatorRoutingNumber()

    /**
     * The Account Number to which the recipient of this request is being requested to send funds
     * from.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun recipientAccountNumberId(): String = body.recipientAccountNumberId()

    /**
     * Line 1 of the drawdown request's beneficiary's address.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun beneficiaryAddressLine1(): Optional<String> = body.beneficiaryAddressLine1()

    /**
     * Line 2 of the drawdown request's beneficiary's address.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun beneficiaryAddressLine2(): Optional<String> = body.beneficiaryAddressLine2()

    /**
     * Line 3 of the drawdown request's beneficiary's address.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun beneficiaryAddressLine3(): Optional<String> = body.beneficiaryAddressLine3()

    /**
     * The drawdown request's beneficiary's name.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun beneficiaryName(): Optional<String> = body.beneficiaryName()

    /**
     * Line 1 of the drawdown request's originator's address.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun originatorAddressLine1(): Optional<String> = body.originatorAddressLine1()

    /**
     * Line 2 of the drawdown request's originator's address.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun originatorAddressLine2(): Optional<String> = body.originatorAddressLine2()

    /**
     * Line 3 of the drawdown request's originator's address.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun originatorAddressLine3(): Optional<String> = body.originatorAddressLine3()

    /**
     * The drawdown request's originator's name.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun originatorName(): Optional<String> = body.originatorName()

    /**
     * Line 1 of the information conveyed from the originator of the message to the beneficiary.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun originatorToBeneficiaryInformationLine1(): Optional<String> =
        body.originatorToBeneficiaryInformationLine1()

    /**
     * Line 2 of the information conveyed from the originator of the message to the beneficiary.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun originatorToBeneficiaryInformationLine2(): Optional<String> =
        body.originatorToBeneficiaryInformationLine2()

    /**
     * Line 3 of the information conveyed from the originator of the message to the beneficiary.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun originatorToBeneficiaryInformationLine3(): Optional<String> =
        body.originatorToBeneficiaryInformationLine3()

    /**
     * Line 4 of the information conveyed from the originator of the message to the beneficiary.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun originatorToBeneficiaryInformationLine4(): Optional<String> =
        body.originatorToBeneficiaryInformationLine4()

    /**
     * Returns the raw JSON value of [amount].
     *
     * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _amount(): JsonField<Long> = body._amount()

    /**
     * Returns the raw JSON value of [beneficiaryAccountNumber].
     *
     * Unlike [beneficiaryAccountNumber], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _beneficiaryAccountNumber(): JsonField<String> = body._beneficiaryAccountNumber()

    /**
     * Returns the raw JSON value of [beneficiaryRoutingNumber].
     *
     * Unlike [beneficiaryRoutingNumber], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _beneficiaryRoutingNumber(): JsonField<String> = body._beneficiaryRoutingNumber()

    /**
     * Returns the raw JSON value of [currency].
     *
     * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _currency(): JsonField<String> = body._currency()

    /**
     * Returns the raw JSON value of [messageToRecipient].
     *
     * Unlike [messageToRecipient], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _messageToRecipient(): JsonField<String> = body._messageToRecipient()

    /**
     * Returns the raw JSON value of [originatorAccountNumber].
     *
     * Unlike [originatorAccountNumber], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _originatorAccountNumber(): JsonField<String> = body._originatorAccountNumber()

    /**
     * Returns the raw JSON value of [originatorRoutingNumber].
     *
     * Unlike [originatorRoutingNumber], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _originatorRoutingNumber(): JsonField<String> = body._originatorRoutingNumber()

    /**
     * Returns the raw JSON value of [recipientAccountNumberId].
     *
     * Unlike [recipientAccountNumberId], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _recipientAccountNumberId(): JsonField<String> = body._recipientAccountNumberId()

    /**
     * Returns the raw JSON value of [beneficiaryAddressLine1].
     *
     * Unlike [beneficiaryAddressLine1], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _beneficiaryAddressLine1(): JsonField<String> = body._beneficiaryAddressLine1()

    /**
     * Returns the raw JSON value of [beneficiaryAddressLine2].
     *
     * Unlike [beneficiaryAddressLine2], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _beneficiaryAddressLine2(): JsonField<String> = body._beneficiaryAddressLine2()

    /**
     * Returns the raw JSON value of [beneficiaryAddressLine3].
     *
     * Unlike [beneficiaryAddressLine3], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _beneficiaryAddressLine3(): JsonField<String> = body._beneficiaryAddressLine3()

    /**
     * Returns the raw JSON value of [beneficiaryName].
     *
     * Unlike [beneficiaryName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _beneficiaryName(): JsonField<String> = body._beneficiaryName()

    /**
     * Returns the raw JSON value of [originatorAddressLine1].
     *
     * Unlike [originatorAddressLine1], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _originatorAddressLine1(): JsonField<String> = body._originatorAddressLine1()

    /**
     * Returns the raw JSON value of [originatorAddressLine2].
     *
     * Unlike [originatorAddressLine2], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _originatorAddressLine2(): JsonField<String> = body._originatorAddressLine2()

    /**
     * Returns the raw JSON value of [originatorAddressLine3].
     *
     * Unlike [originatorAddressLine3], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _originatorAddressLine3(): JsonField<String> = body._originatorAddressLine3()

    /**
     * Returns the raw JSON value of [originatorName].
     *
     * Unlike [originatorName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _originatorName(): JsonField<String> = body._originatorName()

    /**
     * Returns the raw JSON value of [originatorToBeneficiaryInformationLine1].
     *
     * Unlike [originatorToBeneficiaryInformationLine1], this method doesn't throw if the JSON field
     * has an unexpected type.
     */
    fun _originatorToBeneficiaryInformationLine1(): JsonField<String> =
        body._originatorToBeneficiaryInformationLine1()

    /**
     * Returns the raw JSON value of [originatorToBeneficiaryInformationLine2].
     *
     * Unlike [originatorToBeneficiaryInformationLine2], this method doesn't throw if the JSON field
     * has an unexpected type.
     */
    fun _originatorToBeneficiaryInformationLine2(): JsonField<String> =
        body._originatorToBeneficiaryInformationLine2()

    /**
     * Returns the raw JSON value of [originatorToBeneficiaryInformationLine3].
     *
     * Unlike [originatorToBeneficiaryInformationLine3], this method doesn't throw if the JSON field
     * has an unexpected type.
     */
    fun _originatorToBeneficiaryInformationLine3(): JsonField<String> =
        body._originatorToBeneficiaryInformationLine3()

    /**
     * Returns the raw JSON value of [originatorToBeneficiaryInformationLine4].
     *
     * Unlike [originatorToBeneficiaryInformationLine4], this method doesn't throw if the JSON field
     * has an unexpected type.
     */
    fun _originatorToBeneficiaryInformationLine4(): JsonField<String> =
        body._originatorToBeneficiaryInformationLine4()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class Body
    @JsonCreator
    private constructor(
        @JsonProperty("amount")
        @ExcludeMissing
        private val amount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("beneficiary_account_number")
        @ExcludeMissing
        private val beneficiaryAccountNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("beneficiary_routing_number")
        @ExcludeMissing
        private val beneficiaryRoutingNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("currency")
        @ExcludeMissing
        private val currency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("message_to_recipient")
        @ExcludeMissing
        private val messageToRecipient: JsonField<String> = JsonMissing.of(),
        @JsonProperty("originator_account_number")
        @ExcludeMissing
        private val originatorAccountNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("originator_routing_number")
        @ExcludeMissing
        private val originatorRoutingNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("recipient_account_number_id")
        @ExcludeMissing
        private val recipientAccountNumberId: JsonField<String> = JsonMissing.of(),
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
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * The amount being requested in cents.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun amount(): Long = amount.getRequired("amount")

        /**
         * The drawdown request's beneficiary's account number.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun beneficiaryAccountNumber(): String =
            beneficiaryAccountNumber.getRequired("beneficiary_account_number")

        /**
         * The drawdown request's beneficiary's routing number.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun beneficiaryRoutingNumber(): String =
            beneficiaryRoutingNumber.getRequired("beneficiary_routing_number")

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the amount being
         * requested. Will always be "USD".
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun currency(): String = currency.getRequired("currency")

        /**
         * A message from the drawdown request's originator.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun messageToRecipient(): String = messageToRecipient.getRequired("message_to_recipient")

        /**
         * The drawdown request's originator's account number.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun originatorAccountNumber(): String =
            originatorAccountNumber.getRequired("originator_account_number")

        /**
         * The drawdown request's originator's routing number.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun originatorRoutingNumber(): String =
            originatorRoutingNumber.getRequired("originator_routing_number")

        /**
         * The Account Number to which the recipient of this request is being requested to send
         * funds from.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun recipientAccountNumberId(): String =
            recipientAccountNumberId.getRequired("recipient_account_number_id")

        /**
         * Line 1 of the drawdown request's beneficiary's address.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun beneficiaryAddressLine1(): Optional<String> =
            Optional.ofNullable(beneficiaryAddressLine1.getNullable("beneficiary_address_line1"))

        /**
         * Line 2 of the drawdown request's beneficiary's address.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun beneficiaryAddressLine2(): Optional<String> =
            Optional.ofNullable(beneficiaryAddressLine2.getNullable("beneficiary_address_line2"))

        /**
         * Line 3 of the drawdown request's beneficiary's address.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun beneficiaryAddressLine3(): Optional<String> =
            Optional.ofNullable(beneficiaryAddressLine3.getNullable("beneficiary_address_line3"))

        /**
         * The drawdown request's beneficiary's name.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun beneficiaryName(): Optional<String> =
            Optional.ofNullable(beneficiaryName.getNullable("beneficiary_name"))

        /**
         * Line 1 of the drawdown request's originator's address.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun originatorAddressLine1(): Optional<String> =
            Optional.ofNullable(originatorAddressLine1.getNullable("originator_address_line1"))

        /**
         * Line 2 of the drawdown request's originator's address.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun originatorAddressLine2(): Optional<String> =
            Optional.ofNullable(originatorAddressLine2.getNullable("originator_address_line2"))

        /**
         * Line 3 of the drawdown request's originator's address.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun originatorAddressLine3(): Optional<String> =
            Optional.ofNullable(originatorAddressLine3.getNullable("originator_address_line3"))

        /**
         * The drawdown request's originator's name.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun originatorName(): Optional<String> =
            Optional.ofNullable(originatorName.getNullable("originator_name"))

        /**
         * Line 1 of the information conveyed from the originator of the message to the beneficiary.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun originatorToBeneficiaryInformationLine1(): Optional<String> =
            Optional.ofNullable(
                originatorToBeneficiaryInformationLine1.getNullable(
                    "originator_to_beneficiary_information_line1"
                )
            )

        /**
         * Line 2 of the information conveyed from the originator of the message to the beneficiary.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun originatorToBeneficiaryInformationLine2(): Optional<String> =
            Optional.ofNullable(
                originatorToBeneficiaryInformationLine2.getNullable(
                    "originator_to_beneficiary_information_line2"
                )
            )

        /**
         * Line 3 of the information conveyed from the originator of the message to the beneficiary.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun originatorToBeneficiaryInformationLine3(): Optional<String> =
            Optional.ofNullable(
                originatorToBeneficiaryInformationLine3.getNullable(
                    "originator_to_beneficiary_information_line3"
                )
            )

        /**
         * Line 4 of the information conveyed from the originator of the message to the beneficiary.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun originatorToBeneficiaryInformationLine4(): Optional<String> =
            Optional.ofNullable(
                originatorToBeneficiaryInformationLine4.getNullable(
                    "originator_to_beneficiary_information_line4"
                )
            )

        /**
         * Returns the raw JSON value of [amount].
         *
         * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

        /**
         * Returns the raw JSON value of [beneficiaryAccountNumber].
         *
         * Unlike [beneficiaryAccountNumber], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("beneficiary_account_number")
        @ExcludeMissing
        fun _beneficiaryAccountNumber(): JsonField<String> = beneficiaryAccountNumber

        /**
         * Returns the raw JSON value of [beneficiaryRoutingNumber].
         *
         * Unlike [beneficiaryRoutingNumber], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("beneficiary_routing_number")
        @ExcludeMissing
        fun _beneficiaryRoutingNumber(): JsonField<String> = beneficiaryRoutingNumber

        /**
         * Returns the raw JSON value of [currency].
         *
         * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

        /**
         * Returns the raw JSON value of [messageToRecipient].
         *
         * Unlike [messageToRecipient], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("message_to_recipient")
        @ExcludeMissing
        fun _messageToRecipient(): JsonField<String> = messageToRecipient

        /**
         * Returns the raw JSON value of [originatorAccountNumber].
         *
         * Unlike [originatorAccountNumber], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("originator_account_number")
        @ExcludeMissing
        fun _originatorAccountNumber(): JsonField<String> = originatorAccountNumber

        /**
         * Returns the raw JSON value of [originatorRoutingNumber].
         *
         * Unlike [originatorRoutingNumber], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("originator_routing_number")
        @ExcludeMissing
        fun _originatorRoutingNumber(): JsonField<String> = originatorRoutingNumber

        /**
         * Returns the raw JSON value of [recipientAccountNumberId].
         *
         * Unlike [recipientAccountNumberId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("recipient_account_number_id")
        @ExcludeMissing
        fun _recipientAccountNumberId(): JsonField<String> = recipientAccountNumberId

        /**
         * Returns the raw JSON value of [beneficiaryAddressLine1].
         *
         * Unlike [beneficiaryAddressLine1], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("beneficiary_address_line1")
        @ExcludeMissing
        fun _beneficiaryAddressLine1(): JsonField<String> = beneficiaryAddressLine1

        /**
         * Returns the raw JSON value of [beneficiaryAddressLine2].
         *
         * Unlike [beneficiaryAddressLine2], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("beneficiary_address_line2")
        @ExcludeMissing
        fun _beneficiaryAddressLine2(): JsonField<String> = beneficiaryAddressLine2

        /**
         * Returns the raw JSON value of [beneficiaryAddressLine3].
         *
         * Unlike [beneficiaryAddressLine3], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("beneficiary_address_line3")
        @ExcludeMissing
        fun _beneficiaryAddressLine3(): JsonField<String> = beneficiaryAddressLine3

        /**
         * Returns the raw JSON value of [beneficiaryName].
         *
         * Unlike [beneficiaryName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("beneficiary_name")
        @ExcludeMissing
        fun _beneficiaryName(): JsonField<String> = beneficiaryName

        /**
         * Returns the raw JSON value of [originatorAddressLine1].
         *
         * Unlike [originatorAddressLine1], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("originator_address_line1")
        @ExcludeMissing
        fun _originatorAddressLine1(): JsonField<String> = originatorAddressLine1

        /**
         * Returns the raw JSON value of [originatorAddressLine2].
         *
         * Unlike [originatorAddressLine2], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("originator_address_line2")
        @ExcludeMissing
        fun _originatorAddressLine2(): JsonField<String> = originatorAddressLine2

        /**
         * Returns the raw JSON value of [originatorAddressLine3].
         *
         * Unlike [originatorAddressLine3], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("originator_address_line3")
        @ExcludeMissing
        fun _originatorAddressLine3(): JsonField<String> = originatorAddressLine3

        /**
         * Returns the raw JSON value of [originatorName].
         *
         * Unlike [originatorName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("originator_name")
        @ExcludeMissing
        fun _originatorName(): JsonField<String> = originatorName

        /**
         * Returns the raw JSON value of [originatorToBeneficiaryInformationLine1].
         *
         * Unlike [originatorToBeneficiaryInformationLine1], this method doesn't throw if the JSON
         * field has an unexpected type.
         */
        @JsonProperty("originator_to_beneficiary_information_line1")
        @ExcludeMissing
        fun _originatorToBeneficiaryInformationLine1(): JsonField<String> =
            originatorToBeneficiaryInformationLine1

        /**
         * Returns the raw JSON value of [originatorToBeneficiaryInformationLine2].
         *
         * Unlike [originatorToBeneficiaryInformationLine2], this method doesn't throw if the JSON
         * field has an unexpected type.
         */
        @JsonProperty("originator_to_beneficiary_information_line2")
        @ExcludeMissing
        fun _originatorToBeneficiaryInformationLine2(): JsonField<String> =
            originatorToBeneficiaryInformationLine2

        /**
         * Returns the raw JSON value of [originatorToBeneficiaryInformationLine3].
         *
         * Unlike [originatorToBeneficiaryInformationLine3], this method doesn't throw if the JSON
         * field has an unexpected type.
         */
        @JsonProperty("originator_to_beneficiary_information_line3")
        @ExcludeMissing
        fun _originatorToBeneficiaryInformationLine3(): JsonField<String> =
            originatorToBeneficiaryInformationLine3

        /**
         * Returns the raw JSON value of [originatorToBeneficiaryInformationLine4].
         *
         * Unlike [originatorToBeneficiaryInformationLine4], this method doesn't throw if the JSON
         * field has an unexpected type.
         */
        @JsonProperty("originator_to_beneficiary_information_line4")
        @ExcludeMissing
        fun _originatorToBeneficiaryInformationLine4(): JsonField<String> =
            originatorToBeneficiaryInformationLine4

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            amount()
            beneficiaryAccountNumber()
            beneficiaryRoutingNumber()
            currency()
            messageToRecipient()
            originatorAccountNumber()
            originatorRoutingNumber()
            recipientAccountNumberId()
            beneficiaryAddressLine1()
            beneficiaryAddressLine2()
            beneficiaryAddressLine3()
            beneficiaryName()
            originatorAddressLine1()
            originatorAddressLine2()
            originatorAddressLine3()
            originatorName()
            originatorToBeneficiaryInformationLine1()
            originatorToBeneficiaryInformationLine2()
            originatorToBeneficiaryInformationLine3()
            originatorToBeneficiaryInformationLine4()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .amount()
             * .beneficiaryAccountNumber()
             * .beneficiaryRoutingNumber()
             * .currency()
             * .messageToRecipient()
             * .originatorAccountNumber()
             * .originatorRoutingNumber()
             * .recipientAccountNumberId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var amount: JsonField<Long>? = null
            private var beneficiaryAccountNumber: JsonField<String>? = null
            private var beneficiaryRoutingNumber: JsonField<String>? = null
            private var currency: JsonField<String>? = null
            private var messageToRecipient: JsonField<String>? = null
            private var originatorAccountNumber: JsonField<String>? = null
            private var originatorRoutingNumber: JsonField<String>? = null
            private var recipientAccountNumberId: JsonField<String>? = null
            private var beneficiaryAddressLine1: JsonField<String> = JsonMissing.of()
            private var beneficiaryAddressLine2: JsonField<String> = JsonMissing.of()
            private var beneficiaryAddressLine3: JsonField<String> = JsonMissing.of()
            private var beneficiaryName: JsonField<String> = JsonMissing.of()
            private var originatorAddressLine1: JsonField<String> = JsonMissing.of()
            private var originatorAddressLine2: JsonField<String> = JsonMissing.of()
            private var originatorAddressLine3: JsonField<String> = JsonMissing.of()
            private var originatorName: JsonField<String> = JsonMissing.of()
            private var originatorToBeneficiaryInformationLine1: JsonField<String> =
                JsonMissing.of()
            private var originatorToBeneficiaryInformationLine2: JsonField<String> =
                JsonMissing.of()
            private var originatorToBeneficiaryInformationLine3: JsonField<String> =
                JsonMissing.of()
            private var originatorToBeneficiaryInformationLine4: JsonField<String> =
                JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                amount = body.amount
                beneficiaryAccountNumber = body.beneficiaryAccountNumber
                beneficiaryRoutingNumber = body.beneficiaryRoutingNumber
                currency = body.currency
                messageToRecipient = body.messageToRecipient
                originatorAccountNumber = body.originatorAccountNumber
                originatorRoutingNumber = body.originatorRoutingNumber
                recipientAccountNumberId = body.recipientAccountNumberId
                beneficiaryAddressLine1 = body.beneficiaryAddressLine1
                beneficiaryAddressLine2 = body.beneficiaryAddressLine2
                beneficiaryAddressLine3 = body.beneficiaryAddressLine3
                beneficiaryName = body.beneficiaryName
                originatorAddressLine1 = body.originatorAddressLine1
                originatorAddressLine2 = body.originatorAddressLine2
                originatorAddressLine3 = body.originatorAddressLine3
                originatorName = body.originatorName
                originatorToBeneficiaryInformationLine1 =
                    body.originatorToBeneficiaryInformationLine1
                originatorToBeneficiaryInformationLine2 =
                    body.originatorToBeneficiaryInformationLine2
                originatorToBeneficiaryInformationLine3 =
                    body.originatorToBeneficiaryInformationLine3
                originatorToBeneficiaryInformationLine4 =
                    body.originatorToBeneficiaryInformationLine4
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The amount being requested in cents. */
            fun amount(amount: Long) = amount(JsonField.of(amount))

            /**
             * Sets [Builder.amount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amount] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            /** The drawdown request's beneficiary's account number. */
            fun beneficiaryAccountNumber(beneficiaryAccountNumber: String) =
                beneficiaryAccountNumber(JsonField.of(beneficiaryAccountNumber))

            /**
             * Sets [Builder.beneficiaryAccountNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.beneficiaryAccountNumber] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun beneficiaryAccountNumber(beneficiaryAccountNumber: JsonField<String>) = apply {
                this.beneficiaryAccountNumber = beneficiaryAccountNumber
            }

            /** The drawdown request's beneficiary's routing number. */
            fun beneficiaryRoutingNumber(beneficiaryRoutingNumber: String) =
                beneficiaryRoutingNumber(JsonField.of(beneficiaryRoutingNumber))

            /**
             * Sets [Builder.beneficiaryRoutingNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.beneficiaryRoutingNumber] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun beneficiaryRoutingNumber(beneficiaryRoutingNumber: JsonField<String>) = apply {
                this.beneficiaryRoutingNumber = beneficiaryRoutingNumber
            }

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the amount being
             * requested. Will always be "USD".
             */
            fun currency(currency: String) = currency(JsonField.of(currency))

            /**
             * Sets [Builder.currency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currency] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            /** A message from the drawdown request's originator. */
            fun messageToRecipient(messageToRecipient: String) =
                messageToRecipient(JsonField.of(messageToRecipient))

            /**
             * Sets [Builder.messageToRecipient] to an arbitrary JSON value.
             *
             * You should usually call [Builder.messageToRecipient] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun messageToRecipient(messageToRecipient: JsonField<String>) = apply {
                this.messageToRecipient = messageToRecipient
            }

            /** The drawdown request's originator's account number. */
            fun originatorAccountNumber(originatorAccountNumber: String) =
                originatorAccountNumber(JsonField.of(originatorAccountNumber))

            /**
             * Sets [Builder.originatorAccountNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.originatorAccountNumber] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun originatorAccountNumber(originatorAccountNumber: JsonField<String>) = apply {
                this.originatorAccountNumber = originatorAccountNumber
            }

            /** The drawdown request's originator's routing number. */
            fun originatorRoutingNumber(originatorRoutingNumber: String) =
                originatorRoutingNumber(JsonField.of(originatorRoutingNumber))

            /**
             * Sets [Builder.originatorRoutingNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.originatorRoutingNumber] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun originatorRoutingNumber(originatorRoutingNumber: JsonField<String>) = apply {
                this.originatorRoutingNumber = originatorRoutingNumber
            }

            /**
             * The Account Number to which the recipient of this request is being requested to send
             * funds from.
             */
            fun recipientAccountNumberId(recipientAccountNumberId: String) =
                recipientAccountNumberId(JsonField.of(recipientAccountNumberId))

            /**
             * Sets [Builder.recipientAccountNumberId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recipientAccountNumberId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun recipientAccountNumberId(recipientAccountNumberId: JsonField<String>) = apply {
                this.recipientAccountNumberId = recipientAccountNumberId
            }

            /** Line 1 of the drawdown request's beneficiary's address. */
            fun beneficiaryAddressLine1(beneficiaryAddressLine1: String) =
                beneficiaryAddressLine1(JsonField.of(beneficiaryAddressLine1))

            /**
             * Sets [Builder.beneficiaryAddressLine1] to an arbitrary JSON value.
             *
             * You should usually call [Builder.beneficiaryAddressLine1] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun beneficiaryAddressLine1(beneficiaryAddressLine1: JsonField<String>) = apply {
                this.beneficiaryAddressLine1 = beneficiaryAddressLine1
            }

            /** Line 2 of the drawdown request's beneficiary's address. */
            fun beneficiaryAddressLine2(beneficiaryAddressLine2: String) =
                beneficiaryAddressLine2(JsonField.of(beneficiaryAddressLine2))

            /**
             * Sets [Builder.beneficiaryAddressLine2] to an arbitrary JSON value.
             *
             * You should usually call [Builder.beneficiaryAddressLine2] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun beneficiaryAddressLine2(beneficiaryAddressLine2: JsonField<String>) = apply {
                this.beneficiaryAddressLine2 = beneficiaryAddressLine2
            }

            /** Line 3 of the drawdown request's beneficiary's address. */
            fun beneficiaryAddressLine3(beneficiaryAddressLine3: String) =
                beneficiaryAddressLine3(JsonField.of(beneficiaryAddressLine3))

            /**
             * Sets [Builder.beneficiaryAddressLine3] to an arbitrary JSON value.
             *
             * You should usually call [Builder.beneficiaryAddressLine3] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun beneficiaryAddressLine3(beneficiaryAddressLine3: JsonField<String>) = apply {
                this.beneficiaryAddressLine3 = beneficiaryAddressLine3
            }

            /** The drawdown request's beneficiary's name. */
            fun beneficiaryName(beneficiaryName: String) =
                beneficiaryName(JsonField.of(beneficiaryName))

            /**
             * Sets [Builder.beneficiaryName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.beneficiaryName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun beneficiaryName(beneficiaryName: JsonField<String>) = apply {
                this.beneficiaryName = beneficiaryName
            }

            /** Line 1 of the drawdown request's originator's address. */
            fun originatorAddressLine1(originatorAddressLine1: String) =
                originatorAddressLine1(JsonField.of(originatorAddressLine1))

            /**
             * Sets [Builder.originatorAddressLine1] to an arbitrary JSON value.
             *
             * You should usually call [Builder.originatorAddressLine1] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun originatorAddressLine1(originatorAddressLine1: JsonField<String>) = apply {
                this.originatorAddressLine1 = originatorAddressLine1
            }

            /** Line 2 of the drawdown request's originator's address. */
            fun originatorAddressLine2(originatorAddressLine2: String) =
                originatorAddressLine2(JsonField.of(originatorAddressLine2))

            /**
             * Sets [Builder.originatorAddressLine2] to an arbitrary JSON value.
             *
             * You should usually call [Builder.originatorAddressLine2] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun originatorAddressLine2(originatorAddressLine2: JsonField<String>) = apply {
                this.originatorAddressLine2 = originatorAddressLine2
            }

            /** Line 3 of the drawdown request's originator's address. */
            fun originatorAddressLine3(originatorAddressLine3: String) =
                originatorAddressLine3(JsonField.of(originatorAddressLine3))

            /**
             * Sets [Builder.originatorAddressLine3] to an arbitrary JSON value.
             *
             * You should usually call [Builder.originatorAddressLine3] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun originatorAddressLine3(originatorAddressLine3: JsonField<String>) = apply {
                this.originatorAddressLine3 = originatorAddressLine3
            }

            /** The drawdown request's originator's name. */
            fun originatorName(originatorName: String) =
                originatorName(JsonField.of(originatorName))

            /**
             * Sets [Builder.originatorName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.originatorName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun originatorName(originatorName: JsonField<String>) = apply {
                this.originatorName = originatorName
            }

            /**
             * Line 1 of the information conveyed from the originator of the message to the
             * beneficiary.
             */
            fun originatorToBeneficiaryInformationLine1(
                originatorToBeneficiaryInformationLine1: String
            ) =
                originatorToBeneficiaryInformationLine1(
                    JsonField.of(originatorToBeneficiaryInformationLine1)
                )

            /**
             * Sets [Builder.originatorToBeneficiaryInformationLine1] to an arbitrary JSON value.
             *
             * You should usually call [Builder.originatorToBeneficiaryInformationLine1] with a
             * well-typed [String] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun originatorToBeneficiaryInformationLine1(
                originatorToBeneficiaryInformationLine1: JsonField<String>
            ) = apply {
                this.originatorToBeneficiaryInformationLine1 =
                    originatorToBeneficiaryInformationLine1
            }

            /**
             * Line 2 of the information conveyed from the originator of the message to the
             * beneficiary.
             */
            fun originatorToBeneficiaryInformationLine2(
                originatorToBeneficiaryInformationLine2: String
            ) =
                originatorToBeneficiaryInformationLine2(
                    JsonField.of(originatorToBeneficiaryInformationLine2)
                )

            /**
             * Sets [Builder.originatorToBeneficiaryInformationLine2] to an arbitrary JSON value.
             *
             * You should usually call [Builder.originatorToBeneficiaryInformationLine2] with a
             * well-typed [String] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun originatorToBeneficiaryInformationLine2(
                originatorToBeneficiaryInformationLine2: JsonField<String>
            ) = apply {
                this.originatorToBeneficiaryInformationLine2 =
                    originatorToBeneficiaryInformationLine2
            }

            /**
             * Line 3 of the information conveyed from the originator of the message to the
             * beneficiary.
             */
            fun originatorToBeneficiaryInformationLine3(
                originatorToBeneficiaryInformationLine3: String
            ) =
                originatorToBeneficiaryInformationLine3(
                    JsonField.of(originatorToBeneficiaryInformationLine3)
                )

            /**
             * Sets [Builder.originatorToBeneficiaryInformationLine3] to an arbitrary JSON value.
             *
             * You should usually call [Builder.originatorToBeneficiaryInformationLine3] with a
             * well-typed [String] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun originatorToBeneficiaryInformationLine3(
                originatorToBeneficiaryInformationLine3: JsonField<String>
            ) = apply {
                this.originatorToBeneficiaryInformationLine3 =
                    originatorToBeneficiaryInformationLine3
            }

            /**
             * Line 4 of the information conveyed from the originator of the message to the
             * beneficiary.
             */
            fun originatorToBeneficiaryInformationLine4(
                originatorToBeneficiaryInformationLine4: String
            ) =
                originatorToBeneficiaryInformationLine4(
                    JsonField.of(originatorToBeneficiaryInformationLine4)
                )

            /**
             * Sets [Builder.originatorToBeneficiaryInformationLine4] to an arbitrary JSON value.
             *
             * You should usually call [Builder.originatorToBeneficiaryInformationLine4] with a
             * well-typed [String] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun originatorToBeneficiaryInformationLine4(
                originatorToBeneficiaryInformationLine4: JsonField<String>
            ) = apply {
                this.originatorToBeneficiaryInformationLine4 =
                    originatorToBeneficiaryInformationLine4
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

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .amount()
             * .beneficiaryAccountNumber()
             * .beneficiaryRoutingNumber()
             * .currency()
             * .messageToRecipient()
             * .originatorAccountNumber()
             * .originatorRoutingNumber()
             * .recipientAccountNumberId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("amount", amount),
                    checkRequired("beneficiaryAccountNumber", beneficiaryAccountNumber),
                    checkRequired("beneficiaryRoutingNumber", beneficiaryRoutingNumber),
                    checkRequired("currency", currency),
                    checkRequired("messageToRecipient", messageToRecipient),
                    checkRequired("originatorAccountNumber", originatorAccountNumber),
                    checkRequired("originatorRoutingNumber", originatorRoutingNumber),
                    checkRequired("recipientAccountNumberId", recipientAccountNumberId),
                    beneficiaryAddressLine1,
                    beneficiaryAddressLine2,
                    beneficiaryAddressLine3,
                    beneficiaryName,
                    originatorAddressLine1,
                    originatorAddressLine2,
                    originatorAddressLine3,
                    originatorName,
                    originatorToBeneficiaryInformationLine1,
                    originatorToBeneficiaryInformationLine2,
                    originatorToBeneficiaryInformationLine3,
                    originatorToBeneficiaryInformationLine4,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && amount == other.amount && beneficiaryAccountNumber == other.beneficiaryAccountNumber && beneficiaryRoutingNumber == other.beneficiaryRoutingNumber && currency == other.currency && messageToRecipient == other.messageToRecipient && originatorAccountNumber == other.originatorAccountNumber && originatorRoutingNumber == other.originatorRoutingNumber && recipientAccountNumberId == other.recipientAccountNumberId && beneficiaryAddressLine1 == other.beneficiaryAddressLine1 && beneficiaryAddressLine2 == other.beneficiaryAddressLine2 && beneficiaryAddressLine3 == other.beneficiaryAddressLine3 && beneficiaryName == other.beneficiaryName && originatorAddressLine1 == other.originatorAddressLine1 && originatorAddressLine2 == other.originatorAddressLine2 && originatorAddressLine3 == other.originatorAddressLine3 && originatorName == other.originatorName && originatorToBeneficiaryInformationLine1 == other.originatorToBeneficiaryInformationLine1 && originatorToBeneficiaryInformationLine2 == other.originatorToBeneficiaryInformationLine2 && originatorToBeneficiaryInformationLine3 == other.originatorToBeneficiaryInformationLine3 && originatorToBeneficiaryInformationLine4 == other.originatorToBeneficiaryInformationLine4 && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(amount, beneficiaryAccountNumber, beneficiaryRoutingNumber, currency, messageToRecipient, originatorAccountNumber, originatorRoutingNumber, recipientAccountNumberId, beneficiaryAddressLine1, beneficiaryAddressLine2, beneficiaryAddressLine3, beneficiaryName, originatorAddressLine1, originatorAddressLine2, originatorAddressLine3, originatorName, originatorToBeneficiaryInformationLine1, originatorToBeneficiaryInformationLine2, originatorToBeneficiaryInformationLine3, originatorToBeneficiaryInformationLine4, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{amount=$amount, beneficiaryAccountNumber=$beneficiaryAccountNumber, beneficiaryRoutingNumber=$beneficiaryRoutingNumber, currency=$currency, messageToRecipient=$messageToRecipient, originatorAccountNumber=$originatorAccountNumber, originatorRoutingNumber=$originatorRoutingNumber, recipientAccountNumberId=$recipientAccountNumberId, beneficiaryAddressLine1=$beneficiaryAddressLine1, beneficiaryAddressLine2=$beneficiaryAddressLine2, beneficiaryAddressLine3=$beneficiaryAddressLine3, beneficiaryName=$beneficiaryName, originatorAddressLine1=$originatorAddressLine1, originatorAddressLine2=$originatorAddressLine2, originatorAddressLine3=$originatorAddressLine3, originatorName=$originatorName, originatorToBeneficiaryInformationLine1=$originatorToBeneficiaryInformationLine1, originatorToBeneficiaryInformationLine2=$originatorToBeneficiaryInformationLine2, originatorToBeneficiaryInformationLine3=$originatorToBeneficiaryInformationLine3, originatorToBeneficiaryInformationLine4=$originatorToBeneficiaryInformationLine4, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [InboundWireDrawdownRequestCreateParams].
         *
         * The following fields are required:
         * ```java
         * .amount()
         * .beneficiaryAccountNumber()
         * .beneficiaryRoutingNumber()
         * .currency()
         * .messageToRecipient()
         * .originatorAccountNumber()
         * .originatorRoutingNumber()
         * .recipientAccountNumberId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InboundWireDrawdownRequestCreateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            inboundWireDrawdownRequestCreateParams: InboundWireDrawdownRequestCreateParams
        ) = apply {
            body = inboundWireDrawdownRequestCreateParams.body.toBuilder()
            additionalHeaders = inboundWireDrawdownRequestCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                inboundWireDrawdownRequestCreateParams.additionalQueryParams.toBuilder()
        }

        /** The amount being requested in cents. */
        fun amount(amount: Long) = apply { body.amount(amount) }

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amount(amount: JsonField<Long>) = apply { body.amount(amount) }

        /** The drawdown request's beneficiary's account number. */
        fun beneficiaryAccountNumber(beneficiaryAccountNumber: String) = apply {
            body.beneficiaryAccountNumber(beneficiaryAccountNumber)
        }

        /**
         * Sets [Builder.beneficiaryAccountNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.beneficiaryAccountNumber] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun beneficiaryAccountNumber(beneficiaryAccountNumber: JsonField<String>) = apply {
            body.beneficiaryAccountNumber(beneficiaryAccountNumber)
        }

        /** The drawdown request's beneficiary's routing number. */
        fun beneficiaryRoutingNumber(beneficiaryRoutingNumber: String) = apply {
            body.beneficiaryRoutingNumber(beneficiaryRoutingNumber)
        }

        /**
         * Sets [Builder.beneficiaryRoutingNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.beneficiaryRoutingNumber] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun beneficiaryRoutingNumber(beneficiaryRoutingNumber: JsonField<String>) = apply {
            body.beneficiaryRoutingNumber(beneficiaryRoutingNumber)
        }

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the amount being
         * requested. Will always be "USD".
         */
        fun currency(currency: String) = apply { body.currency(currency) }

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun currency(currency: JsonField<String>) = apply { body.currency(currency) }

        /** A message from the drawdown request's originator. */
        fun messageToRecipient(messageToRecipient: String) = apply {
            body.messageToRecipient(messageToRecipient)
        }

        /**
         * Sets [Builder.messageToRecipient] to an arbitrary JSON value.
         *
         * You should usually call [Builder.messageToRecipient] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun messageToRecipient(messageToRecipient: JsonField<String>) = apply {
            body.messageToRecipient(messageToRecipient)
        }

        /** The drawdown request's originator's account number. */
        fun originatorAccountNumber(originatorAccountNumber: String) = apply {
            body.originatorAccountNumber(originatorAccountNumber)
        }

        /**
         * Sets [Builder.originatorAccountNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.originatorAccountNumber] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun originatorAccountNumber(originatorAccountNumber: JsonField<String>) = apply {
            body.originatorAccountNumber(originatorAccountNumber)
        }

        /** The drawdown request's originator's routing number. */
        fun originatorRoutingNumber(originatorRoutingNumber: String) = apply {
            body.originatorRoutingNumber(originatorRoutingNumber)
        }

        /**
         * Sets [Builder.originatorRoutingNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.originatorRoutingNumber] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun originatorRoutingNumber(originatorRoutingNumber: JsonField<String>) = apply {
            body.originatorRoutingNumber(originatorRoutingNumber)
        }

        /**
         * The Account Number to which the recipient of this request is being requested to send
         * funds from.
         */
        fun recipientAccountNumberId(recipientAccountNumberId: String) = apply {
            body.recipientAccountNumberId(recipientAccountNumberId)
        }

        /**
         * Sets [Builder.recipientAccountNumberId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recipientAccountNumberId] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun recipientAccountNumberId(recipientAccountNumberId: JsonField<String>) = apply {
            body.recipientAccountNumberId(recipientAccountNumberId)
        }

        /** Line 1 of the drawdown request's beneficiary's address. */
        fun beneficiaryAddressLine1(beneficiaryAddressLine1: String) = apply {
            body.beneficiaryAddressLine1(beneficiaryAddressLine1)
        }

        /**
         * Sets [Builder.beneficiaryAddressLine1] to an arbitrary JSON value.
         *
         * You should usually call [Builder.beneficiaryAddressLine1] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun beneficiaryAddressLine1(beneficiaryAddressLine1: JsonField<String>) = apply {
            body.beneficiaryAddressLine1(beneficiaryAddressLine1)
        }

        /** Line 2 of the drawdown request's beneficiary's address. */
        fun beneficiaryAddressLine2(beneficiaryAddressLine2: String) = apply {
            body.beneficiaryAddressLine2(beneficiaryAddressLine2)
        }

        /**
         * Sets [Builder.beneficiaryAddressLine2] to an arbitrary JSON value.
         *
         * You should usually call [Builder.beneficiaryAddressLine2] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun beneficiaryAddressLine2(beneficiaryAddressLine2: JsonField<String>) = apply {
            body.beneficiaryAddressLine2(beneficiaryAddressLine2)
        }

        /** Line 3 of the drawdown request's beneficiary's address. */
        fun beneficiaryAddressLine3(beneficiaryAddressLine3: String) = apply {
            body.beneficiaryAddressLine3(beneficiaryAddressLine3)
        }

        /**
         * Sets [Builder.beneficiaryAddressLine3] to an arbitrary JSON value.
         *
         * You should usually call [Builder.beneficiaryAddressLine3] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun beneficiaryAddressLine3(beneficiaryAddressLine3: JsonField<String>) = apply {
            body.beneficiaryAddressLine3(beneficiaryAddressLine3)
        }

        /** The drawdown request's beneficiary's name. */
        fun beneficiaryName(beneficiaryName: String) = apply {
            body.beneficiaryName(beneficiaryName)
        }

        /**
         * Sets [Builder.beneficiaryName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.beneficiaryName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun beneficiaryName(beneficiaryName: JsonField<String>) = apply {
            body.beneficiaryName(beneficiaryName)
        }

        /** Line 1 of the drawdown request's originator's address. */
        fun originatorAddressLine1(originatorAddressLine1: String) = apply {
            body.originatorAddressLine1(originatorAddressLine1)
        }

        /**
         * Sets [Builder.originatorAddressLine1] to an arbitrary JSON value.
         *
         * You should usually call [Builder.originatorAddressLine1] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun originatorAddressLine1(originatorAddressLine1: JsonField<String>) = apply {
            body.originatorAddressLine1(originatorAddressLine1)
        }

        /** Line 2 of the drawdown request's originator's address. */
        fun originatorAddressLine2(originatorAddressLine2: String) = apply {
            body.originatorAddressLine2(originatorAddressLine2)
        }

        /**
         * Sets [Builder.originatorAddressLine2] to an arbitrary JSON value.
         *
         * You should usually call [Builder.originatorAddressLine2] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun originatorAddressLine2(originatorAddressLine2: JsonField<String>) = apply {
            body.originatorAddressLine2(originatorAddressLine2)
        }

        /** Line 3 of the drawdown request's originator's address. */
        fun originatorAddressLine3(originatorAddressLine3: String) = apply {
            body.originatorAddressLine3(originatorAddressLine3)
        }

        /**
         * Sets [Builder.originatorAddressLine3] to an arbitrary JSON value.
         *
         * You should usually call [Builder.originatorAddressLine3] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun originatorAddressLine3(originatorAddressLine3: JsonField<String>) = apply {
            body.originatorAddressLine3(originatorAddressLine3)
        }

        /** The drawdown request's originator's name. */
        fun originatorName(originatorName: String) = apply { body.originatorName(originatorName) }

        /**
         * Sets [Builder.originatorName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.originatorName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun originatorName(originatorName: JsonField<String>) = apply {
            body.originatorName(originatorName)
        }

        /**
         * Line 1 of the information conveyed from the originator of the message to the beneficiary.
         */
        fun originatorToBeneficiaryInformationLine1(
            originatorToBeneficiaryInformationLine1: String
        ) = apply {
            body.originatorToBeneficiaryInformationLine1(originatorToBeneficiaryInformationLine1)
        }

        /**
         * Sets [Builder.originatorToBeneficiaryInformationLine1] to an arbitrary JSON value.
         *
         * You should usually call [Builder.originatorToBeneficiaryInformationLine1] with a
         * well-typed [String] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun originatorToBeneficiaryInformationLine1(
            originatorToBeneficiaryInformationLine1: JsonField<String>
        ) = apply {
            body.originatorToBeneficiaryInformationLine1(originatorToBeneficiaryInformationLine1)
        }

        /**
         * Line 2 of the information conveyed from the originator of the message to the beneficiary.
         */
        fun originatorToBeneficiaryInformationLine2(
            originatorToBeneficiaryInformationLine2: String
        ) = apply {
            body.originatorToBeneficiaryInformationLine2(originatorToBeneficiaryInformationLine2)
        }

        /**
         * Sets [Builder.originatorToBeneficiaryInformationLine2] to an arbitrary JSON value.
         *
         * You should usually call [Builder.originatorToBeneficiaryInformationLine2] with a
         * well-typed [String] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun originatorToBeneficiaryInformationLine2(
            originatorToBeneficiaryInformationLine2: JsonField<String>
        ) = apply {
            body.originatorToBeneficiaryInformationLine2(originatorToBeneficiaryInformationLine2)
        }

        /**
         * Line 3 of the information conveyed from the originator of the message to the beneficiary.
         */
        fun originatorToBeneficiaryInformationLine3(
            originatorToBeneficiaryInformationLine3: String
        ) = apply {
            body.originatorToBeneficiaryInformationLine3(originatorToBeneficiaryInformationLine3)
        }

        /**
         * Sets [Builder.originatorToBeneficiaryInformationLine3] to an arbitrary JSON value.
         *
         * You should usually call [Builder.originatorToBeneficiaryInformationLine3] with a
         * well-typed [String] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun originatorToBeneficiaryInformationLine3(
            originatorToBeneficiaryInformationLine3: JsonField<String>
        ) = apply {
            body.originatorToBeneficiaryInformationLine3(originatorToBeneficiaryInformationLine3)
        }

        /**
         * Line 4 of the information conveyed from the originator of the message to the beneficiary.
         */
        fun originatorToBeneficiaryInformationLine4(
            originatorToBeneficiaryInformationLine4: String
        ) = apply {
            body.originatorToBeneficiaryInformationLine4(originatorToBeneficiaryInformationLine4)
        }

        /**
         * Sets [Builder.originatorToBeneficiaryInformationLine4] to an arbitrary JSON value.
         *
         * You should usually call [Builder.originatorToBeneficiaryInformationLine4] with a
         * well-typed [String] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun originatorToBeneficiaryInformationLine4(
            originatorToBeneficiaryInformationLine4: JsonField<String>
        ) = apply {
            body.originatorToBeneficiaryInformationLine4(originatorToBeneficiaryInformationLine4)
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

        /**
         * Returns an immutable instance of [InboundWireDrawdownRequestCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .amount()
         * .beneficiaryAccountNumber()
         * .beneficiaryRoutingNumber()
         * .currency()
         * .messageToRecipient()
         * .originatorAccountNumber()
         * .originatorRoutingNumber()
         * .recipientAccountNumberId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): InboundWireDrawdownRequestCreateParams =
            InboundWireDrawdownRequestCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is InboundWireDrawdownRequestCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "InboundWireDrawdownRequestCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
