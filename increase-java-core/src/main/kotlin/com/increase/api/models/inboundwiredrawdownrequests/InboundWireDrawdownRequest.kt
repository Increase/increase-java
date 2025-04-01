// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.inboundwiredrawdownrequests

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.increase.api.core.Enum
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.checkRequired
import com.increase.api.errors.IncreaseInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Inbound wire drawdown requests are requests from someone else to send them a wire. This feature
 * is in beta; reach out to [support@increase.com](mailto:support@increase.com) to learn more.
 */
class InboundWireDrawdownRequest
private constructor(
    private val id: JsonField<String>,
    private val amount: JsonField<Long>,
    private val beneficiaryAccountNumber: JsonField<String>,
    private val beneficiaryAddressLine1: JsonField<String>,
    private val beneficiaryAddressLine2: JsonField<String>,
    private val beneficiaryAddressLine3: JsonField<String>,
    private val beneficiaryName: JsonField<String>,
    private val beneficiaryRoutingNumber: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val currency: JsonField<String>,
    private val messageToRecipient: JsonField<String>,
    private val originatorAccountNumber: JsonField<String>,
    private val originatorAddressLine1: JsonField<String>,
    private val originatorAddressLine2: JsonField<String>,
    private val originatorAddressLine3: JsonField<String>,
    private val originatorName: JsonField<String>,
    private val originatorRoutingNumber: JsonField<String>,
    private val originatorToBeneficiaryInformationLine1: JsonField<String>,
    private val originatorToBeneficiaryInformationLine2: JsonField<String>,
    private val originatorToBeneficiaryInformationLine3: JsonField<String>,
    private val originatorToBeneficiaryInformationLine4: JsonField<String>,
    private val recipientAccountNumberId: JsonField<String>,
    private val type: JsonField<Type>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("beneficiary_account_number")
        @ExcludeMissing
        beneficiaryAccountNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("beneficiary_address_line1")
        @ExcludeMissing
        beneficiaryAddressLine1: JsonField<String> = JsonMissing.of(),
        @JsonProperty("beneficiary_address_line2")
        @ExcludeMissing
        beneficiaryAddressLine2: JsonField<String> = JsonMissing.of(),
        @JsonProperty("beneficiary_address_line3")
        @ExcludeMissing
        beneficiaryAddressLine3: JsonField<String> = JsonMissing.of(),
        @JsonProperty("beneficiary_name")
        @ExcludeMissing
        beneficiaryName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("beneficiary_routing_number")
        @ExcludeMissing
        beneficiaryRoutingNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("currency") @ExcludeMissing currency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("message_to_recipient")
        @ExcludeMissing
        messageToRecipient: JsonField<String> = JsonMissing.of(),
        @JsonProperty("originator_account_number")
        @ExcludeMissing
        originatorAccountNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("originator_address_line1")
        @ExcludeMissing
        originatorAddressLine1: JsonField<String> = JsonMissing.of(),
        @JsonProperty("originator_address_line2")
        @ExcludeMissing
        originatorAddressLine2: JsonField<String> = JsonMissing.of(),
        @JsonProperty("originator_address_line3")
        @ExcludeMissing
        originatorAddressLine3: JsonField<String> = JsonMissing.of(),
        @JsonProperty("originator_name")
        @ExcludeMissing
        originatorName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("originator_routing_number")
        @ExcludeMissing
        originatorRoutingNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("originator_to_beneficiary_information_line1")
        @ExcludeMissing
        originatorToBeneficiaryInformationLine1: JsonField<String> = JsonMissing.of(),
        @JsonProperty("originator_to_beneficiary_information_line2")
        @ExcludeMissing
        originatorToBeneficiaryInformationLine2: JsonField<String> = JsonMissing.of(),
        @JsonProperty("originator_to_beneficiary_information_line3")
        @ExcludeMissing
        originatorToBeneficiaryInformationLine3: JsonField<String> = JsonMissing.of(),
        @JsonProperty("originator_to_beneficiary_information_line4")
        @ExcludeMissing
        originatorToBeneficiaryInformationLine4: JsonField<String> = JsonMissing.of(),
        @JsonProperty("recipient_account_number_id")
        @ExcludeMissing
        recipientAccountNumberId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
    ) : this(
        id,
        amount,
        beneficiaryAccountNumber,
        beneficiaryAddressLine1,
        beneficiaryAddressLine2,
        beneficiaryAddressLine3,
        beneficiaryName,
        beneficiaryRoutingNumber,
        createdAt,
        currency,
        messageToRecipient,
        originatorAccountNumber,
        originatorAddressLine1,
        originatorAddressLine2,
        originatorAddressLine3,
        originatorName,
        originatorRoutingNumber,
        originatorToBeneficiaryInformationLine1,
        originatorToBeneficiaryInformationLine2,
        originatorToBeneficiaryInformationLine3,
        originatorToBeneficiaryInformationLine4,
        recipientAccountNumberId,
        type,
        mutableMapOf(),
    )

    /**
     * The Wire drawdown request identifier.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

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
     * Line 1 of the drawdown request's beneficiary's address.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun beneficiaryAddressLine1(): Optional<String> =
        Optional.ofNullable(beneficiaryAddressLine1.getNullable("beneficiary_address_line1"))

    /**
     * Line 2 of the drawdown request's beneficiary's address.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun beneficiaryAddressLine2(): Optional<String> =
        Optional.ofNullable(beneficiaryAddressLine2.getNullable("beneficiary_address_line2"))

    /**
     * Line 3 of the drawdown request's beneficiary's address.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun beneficiaryAddressLine3(): Optional<String> =
        Optional.ofNullable(beneficiaryAddressLine3.getNullable("beneficiary_address_line3"))

    /**
     * The drawdown request's beneficiary's name.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun beneficiaryName(): Optional<String> =
        Optional.ofNullable(beneficiaryName.getNullable("beneficiary_name"))

    /**
     * The drawdown request's beneficiary's routing number.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun beneficiaryRoutingNumber(): String =
        beneficiaryRoutingNumber.getRequired("beneficiary_routing_number")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the inbound
     * wire drawdown requested was created.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the amount being requested.
     * Will always be "USD".
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun currency(): String = currency.getRequired("currency")

    /**
     * A message from the drawdown request's originator.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun messageToRecipient(): Optional<String> =
        Optional.ofNullable(messageToRecipient.getNullable("message_to_recipient"))

    /**
     * The drawdown request's originator's account number.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun originatorAccountNumber(): String =
        originatorAccountNumber.getRequired("originator_account_number")

    /**
     * Line 1 of the drawdown request's originator's address.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun originatorAddressLine1(): Optional<String> =
        Optional.ofNullable(originatorAddressLine1.getNullable("originator_address_line1"))

    /**
     * Line 2 of the drawdown request's originator's address.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun originatorAddressLine2(): Optional<String> =
        Optional.ofNullable(originatorAddressLine2.getNullable("originator_address_line2"))

    /**
     * Line 3 of the drawdown request's originator's address.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun originatorAddressLine3(): Optional<String> =
        Optional.ofNullable(originatorAddressLine3.getNullable("originator_address_line3"))

    /**
     * The drawdown request's originator's name.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun originatorName(): Optional<String> =
        Optional.ofNullable(originatorName.getNullable("originator_name"))

    /**
     * The drawdown request's originator's routing number.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun originatorRoutingNumber(): String =
        originatorRoutingNumber.getRequired("originator_routing_number")

    /**
     * Line 1 of the information conveyed from the originator of the message to the beneficiary.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
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
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
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
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
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
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun originatorToBeneficiaryInformationLine4(): Optional<String> =
        Optional.ofNullable(
            originatorToBeneficiaryInformationLine4.getNullable(
                "originator_to_beneficiary_information_line4"
            )
        )

    /**
     * The Account Number from which the recipient of this request is being requested to send funds.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun recipientAccountNumberId(): String =
        recipientAccountNumberId.getRequired("recipient_account_number_id")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `inbound_wire_drawdown_request`.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

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
     * Unlike [beneficiaryName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("beneficiary_name")
    @ExcludeMissing
    fun _beneficiaryName(): JsonField<String> = beneficiaryName

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
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [currency].
     *
     * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

    /**
     * Returns the raw JSON value of [messageToRecipient].
     *
     * Unlike [messageToRecipient], this method doesn't throw if the JSON field has an unexpected
     * type.
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
     * Unlike [originatorName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("originator_name")
    @ExcludeMissing
    fun _originatorName(): JsonField<String> = originatorName

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
     * Returns the raw JSON value of [originatorToBeneficiaryInformationLine1].
     *
     * Unlike [originatorToBeneficiaryInformationLine1], this method doesn't throw if the JSON field
     * has an unexpected type.
     */
    @JsonProperty("originator_to_beneficiary_information_line1")
    @ExcludeMissing
    fun _originatorToBeneficiaryInformationLine1(): JsonField<String> =
        originatorToBeneficiaryInformationLine1

    /**
     * Returns the raw JSON value of [originatorToBeneficiaryInformationLine2].
     *
     * Unlike [originatorToBeneficiaryInformationLine2], this method doesn't throw if the JSON field
     * has an unexpected type.
     */
    @JsonProperty("originator_to_beneficiary_information_line2")
    @ExcludeMissing
    fun _originatorToBeneficiaryInformationLine2(): JsonField<String> =
        originatorToBeneficiaryInformationLine2

    /**
     * Returns the raw JSON value of [originatorToBeneficiaryInformationLine3].
     *
     * Unlike [originatorToBeneficiaryInformationLine3], this method doesn't throw if the JSON field
     * has an unexpected type.
     */
    @JsonProperty("originator_to_beneficiary_information_line3")
    @ExcludeMissing
    fun _originatorToBeneficiaryInformationLine3(): JsonField<String> =
        originatorToBeneficiaryInformationLine3

    /**
     * Returns the raw JSON value of [originatorToBeneficiaryInformationLine4].
     *
     * Unlike [originatorToBeneficiaryInformationLine4], this method doesn't throw if the JSON field
     * has an unexpected type.
     */
    @JsonProperty("originator_to_beneficiary_information_line4")
    @ExcludeMissing
    fun _originatorToBeneficiaryInformationLine4(): JsonField<String> =
        originatorToBeneficiaryInformationLine4

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
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [InboundWireDrawdownRequest].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .amount()
         * .beneficiaryAccountNumber()
         * .beneficiaryAddressLine1()
         * .beneficiaryAddressLine2()
         * .beneficiaryAddressLine3()
         * .beneficiaryName()
         * .beneficiaryRoutingNumber()
         * .createdAt()
         * .currency()
         * .messageToRecipient()
         * .originatorAccountNumber()
         * .originatorAddressLine1()
         * .originatorAddressLine2()
         * .originatorAddressLine3()
         * .originatorName()
         * .originatorRoutingNumber()
         * .originatorToBeneficiaryInformationLine1()
         * .originatorToBeneficiaryInformationLine2()
         * .originatorToBeneficiaryInformationLine3()
         * .originatorToBeneficiaryInformationLine4()
         * .recipientAccountNumberId()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InboundWireDrawdownRequest]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var amount: JsonField<Long>? = null
        private var beneficiaryAccountNumber: JsonField<String>? = null
        private var beneficiaryAddressLine1: JsonField<String>? = null
        private var beneficiaryAddressLine2: JsonField<String>? = null
        private var beneficiaryAddressLine3: JsonField<String>? = null
        private var beneficiaryName: JsonField<String>? = null
        private var beneficiaryRoutingNumber: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var currency: JsonField<String>? = null
        private var messageToRecipient: JsonField<String>? = null
        private var originatorAccountNumber: JsonField<String>? = null
        private var originatorAddressLine1: JsonField<String>? = null
        private var originatorAddressLine2: JsonField<String>? = null
        private var originatorAddressLine3: JsonField<String>? = null
        private var originatorName: JsonField<String>? = null
        private var originatorRoutingNumber: JsonField<String>? = null
        private var originatorToBeneficiaryInformationLine1: JsonField<String>? = null
        private var originatorToBeneficiaryInformationLine2: JsonField<String>? = null
        private var originatorToBeneficiaryInformationLine3: JsonField<String>? = null
        private var originatorToBeneficiaryInformationLine4: JsonField<String>? = null
        private var recipientAccountNumberId: JsonField<String>? = null
        private var type: JsonField<Type>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(inboundWireDrawdownRequest: InboundWireDrawdownRequest) = apply {
            id = inboundWireDrawdownRequest.id
            amount = inboundWireDrawdownRequest.amount
            beneficiaryAccountNumber = inboundWireDrawdownRequest.beneficiaryAccountNumber
            beneficiaryAddressLine1 = inboundWireDrawdownRequest.beneficiaryAddressLine1
            beneficiaryAddressLine2 = inboundWireDrawdownRequest.beneficiaryAddressLine2
            beneficiaryAddressLine3 = inboundWireDrawdownRequest.beneficiaryAddressLine3
            beneficiaryName = inboundWireDrawdownRequest.beneficiaryName
            beneficiaryRoutingNumber = inboundWireDrawdownRequest.beneficiaryRoutingNumber
            createdAt = inboundWireDrawdownRequest.createdAt
            currency = inboundWireDrawdownRequest.currency
            messageToRecipient = inboundWireDrawdownRequest.messageToRecipient
            originatorAccountNumber = inboundWireDrawdownRequest.originatorAccountNumber
            originatorAddressLine1 = inboundWireDrawdownRequest.originatorAddressLine1
            originatorAddressLine2 = inboundWireDrawdownRequest.originatorAddressLine2
            originatorAddressLine3 = inboundWireDrawdownRequest.originatorAddressLine3
            originatorName = inboundWireDrawdownRequest.originatorName
            originatorRoutingNumber = inboundWireDrawdownRequest.originatorRoutingNumber
            originatorToBeneficiaryInformationLine1 =
                inboundWireDrawdownRequest.originatorToBeneficiaryInformationLine1
            originatorToBeneficiaryInformationLine2 =
                inboundWireDrawdownRequest.originatorToBeneficiaryInformationLine2
            originatorToBeneficiaryInformationLine3 =
                inboundWireDrawdownRequest.originatorToBeneficiaryInformationLine3
            originatorToBeneficiaryInformationLine4 =
                inboundWireDrawdownRequest.originatorToBeneficiaryInformationLine4
            recipientAccountNumberId = inboundWireDrawdownRequest.recipientAccountNumberId
            type = inboundWireDrawdownRequest.type
            additionalProperties = inboundWireDrawdownRequest.additionalProperties.toMutableMap()
        }

        /** The Wire drawdown request identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The amount being requested in cents. */
        fun amount(amount: Long) = amount(JsonField.of(amount))

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

        /** The drawdown request's beneficiary's account number. */
        fun beneficiaryAccountNumber(beneficiaryAccountNumber: String) =
            beneficiaryAccountNumber(JsonField.of(beneficiaryAccountNumber))

        /**
         * Sets [Builder.beneficiaryAccountNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.beneficiaryAccountNumber] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun beneficiaryAccountNumber(beneficiaryAccountNumber: JsonField<String>) = apply {
            this.beneficiaryAccountNumber = beneficiaryAccountNumber
        }

        /** Line 1 of the drawdown request's beneficiary's address. */
        fun beneficiaryAddressLine1(beneficiaryAddressLine1: String?) =
            beneficiaryAddressLine1(JsonField.ofNullable(beneficiaryAddressLine1))

        /**
         * Alias for calling [Builder.beneficiaryAddressLine1] with
         * `beneficiaryAddressLine1.orElse(null)`.
         */
        fun beneficiaryAddressLine1(beneficiaryAddressLine1: Optional<String>) =
            beneficiaryAddressLine1(beneficiaryAddressLine1.getOrNull())

        /**
         * Sets [Builder.beneficiaryAddressLine1] to an arbitrary JSON value.
         *
         * You should usually call [Builder.beneficiaryAddressLine1] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun beneficiaryAddressLine1(beneficiaryAddressLine1: JsonField<String>) = apply {
            this.beneficiaryAddressLine1 = beneficiaryAddressLine1
        }

        /** Line 2 of the drawdown request's beneficiary's address. */
        fun beneficiaryAddressLine2(beneficiaryAddressLine2: String?) =
            beneficiaryAddressLine2(JsonField.ofNullable(beneficiaryAddressLine2))

        /**
         * Alias for calling [Builder.beneficiaryAddressLine2] with
         * `beneficiaryAddressLine2.orElse(null)`.
         */
        fun beneficiaryAddressLine2(beneficiaryAddressLine2: Optional<String>) =
            beneficiaryAddressLine2(beneficiaryAddressLine2.getOrNull())

        /**
         * Sets [Builder.beneficiaryAddressLine2] to an arbitrary JSON value.
         *
         * You should usually call [Builder.beneficiaryAddressLine2] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun beneficiaryAddressLine2(beneficiaryAddressLine2: JsonField<String>) = apply {
            this.beneficiaryAddressLine2 = beneficiaryAddressLine2
        }

        /** Line 3 of the drawdown request's beneficiary's address. */
        fun beneficiaryAddressLine3(beneficiaryAddressLine3: String?) =
            beneficiaryAddressLine3(JsonField.ofNullable(beneficiaryAddressLine3))

        /**
         * Alias for calling [Builder.beneficiaryAddressLine3] with
         * `beneficiaryAddressLine3.orElse(null)`.
         */
        fun beneficiaryAddressLine3(beneficiaryAddressLine3: Optional<String>) =
            beneficiaryAddressLine3(beneficiaryAddressLine3.getOrNull())

        /**
         * Sets [Builder.beneficiaryAddressLine3] to an arbitrary JSON value.
         *
         * You should usually call [Builder.beneficiaryAddressLine3] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun beneficiaryAddressLine3(beneficiaryAddressLine3: JsonField<String>) = apply {
            this.beneficiaryAddressLine3 = beneficiaryAddressLine3
        }

        /** The drawdown request's beneficiary's name. */
        fun beneficiaryName(beneficiaryName: String?) =
            beneficiaryName(JsonField.ofNullable(beneficiaryName))

        /** Alias for calling [Builder.beneficiaryName] with `beneficiaryName.orElse(null)`. */
        fun beneficiaryName(beneficiaryName: Optional<String>) =
            beneficiaryName(beneficiaryName.getOrNull())

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

        /** The drawdown request's beneficiary's routing number. */
        fun beneficiaryRoutingNumber(beneficiaryRoutingNumber: String) =
            beneficiaryRoutingNumber(JsonField.of(beneficiaryRoutingNumber))

        /**
         * Sets [Builder.beneficiaryRoutingNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.beneficiaryRoutingNumber] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun beneficiaryRoutingNumber(beneficiaryRoutingNumber: JsonField<String>) = apply {
            this.beneficiaryRoutingNumber = beneficiaryRoutingNumber
        }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the inbound
         * wire drawdown requested was created.
         */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the amount being
         * requested. Will always be "USD".
         */
        fun currency(currency: String) = currency(JsonField.of(currency))

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

        /** A message from the drawdown request's originator. */
        fun messageToRecipient(messageToRecipient: String?) =
            messageToRecipient(JsonField.ofNullable(messageToRecipient))

        /**
         * Alias for calling [Builder.messageToRecipient] with `messageToRecipient.orElse(null)`.
         */
        fun messageToRecipient(messageToRecipient: Optional<String>) =
            messageToRecipient(messageToRecipient.getOrNull())

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
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun originatorAccountNumber(originatorAccountNumber: JsonField<String>) = apply {
            this.originatorAccountNumber = originatorAccountNumber
        }

        /** Line 1 of the drawdown request's originator's address. */
        fun originatorAddressLine1(originatorAddressLine1: String?) =
            originatorAddressLine1(JsonField.ofNullable(originatorAddressLine1))

        /**
         * Alias for calling [Builder.originatorAddressLine1] with
         * `originatorAddressLine1.orElse(null)`.
         */
        fun originatorAddressLine1(originatorAddressLine1: Optional<String>) =
            originatorAddressLine1(originatorAddressLine1.getOrNull())

        /**
         * Sets [Builder.originatorAddressLine1] to an arbitrary JSON value.
         *
         * You should usually call [Builder.originatorAddressLine1] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun originatorAddressLine1(originatorAddressLine1: JsonField<String>) = apply {
            this.originatorAddressLine1 = originatorAddressLine1
        }

        /** Line 2 of the drawdown request's originator's address. */
        fun originatorAddressLine2(originatorAddressLine2: String?) =
            originatorAddressLine2(JsonField.ofNullable(originatorAddressLine2))

        /**
         * Alias for calling [Builder.originatorAddressLine2] with
         * `originatorAddressLine2.orElse(null)`.
         */
        fun originatorAddressLine2(originatorAddressLine2: Optional<String>) =
            originatorAddressLine2(originatorAddressLine2.getOrNull())

        /**
         * Sets [Builder.originatorAddressLine2] to an arbitrary JSON value.
         *
         * You should usually call [Builder.originatorAddressLine2] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun originatorAddressLine2(originatorAddressLine2: JsonField<String>) = apply {
            this.originatorAddressLine2 = originatorAddressLine2
        }

        /** Line 3 of the drawdown request's originator's address. */
        fun originatorAddressLine3(originatorAddressLine3: String?) =
            originatorAddressLine3(JsonField.ofNullable(originatorAddressLine3))

        /**
         * Alias for calling [Builder.originatorAddressLine3] with
         * `originatorAddressLine3.orElse(null)`.
         */
        fun originatorAddressLine3(originatorAddressLine3: Optional<String>) =
            originatorAddressLine3(originatorAddressLine3.getOrNull())

        /**
         * Sets [Builder.originatorAddressLine3] to an arbitrary JSON value.
         *
         * You should usually call [Builder.originatorAddressLine3] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun originatorAddressLine3(originatorAddressLine3: JsonField<String>) = apply {
            this.originatorAddressLine3 = originatorAddressLine3
        }

        /** The drawdown request's originator's name. */
        fun originatorName(originatorName: String?) =
            originatorName(JsonField.ofNullable(originatorName))

        /** Alias for calling [Builder.originatorName] with `originatorName.orElse(null)`. */
        fun originatorName(originatorName: Optional<String>) =
            originatorName(originatorName.getOrNull())

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

        /** The drawdown request's originator's routing number. */
        fun originatorRoutingNumber(originatorRoutingNumber: String) =
            originatorRoutingNumber(JsonField.of(originatorRoutingNumber))

        /**
         * Sets [Builder.originatorRoutingNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.originatorRoutingNumber] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun originatorRoutingNumber(originatorRoutingNumber: JsonField<String>) = apply {
            this.originatorRoutingNumber = originatorRoutingNumber
        }

        /**
         * Line 1 of the information conveyed from the originator of the message to the beneficiary.
         */
        fun originatorToBeneficiaryInformationLine1(
            originatorToBeneficiaryInformationLine1: String?
        ) =
            originatorToBeneficiaryInformationLine1(
                JsonField.ofNullable(originatorToBeneficiaryInformationLine1)
            )

        /**
         * Alias for calling [Builder.originatorToBeneficiaryInformationLine1] with
         * `originatorToBeneficiaryInformationLine1.orElse(null)`.
         */
        fun originatorToBeneficiaryInformationLine1(
            originatorToBeneficiaryInformationLine1: Optional<String>
        ) =
            originatorToBeneficiaryInformationLine1(
                originatorToBeneficiaryInformationLine1.getOrNull()
            )

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
            this.originatorToBeneficiaryInformationLine1 = originatorToBeneficiaryInformationLine1
        }

        /**
         * Line 2 of the information conveyed from the originator of the message to the beneficiary.
         */
        fun originatorToBeneficiaryInformationLine2(
            originatorToBeneficiaryInformationLine2: String?
        ) =
            originatorToBeneficiaryInformationLine2(
                JsonField.ofNullable(originatorToBeneficiaryInformationLine2)
            )

        /**
         * Alias for calling [Builder.originatorToBeneficiaryInformationLine2] with
         * `originatorToBeneficiaryInformationLine2.orElse(null)`.
         */
        fun originatorToBeneficiaryInformationLine2(
            originatorToBeneficiaryInformationLine2: Optional<String>
        ) =
            originatorToBeneficiaryInformationLine2(
                originatorToBeneficiaryInformationLine2.getOrNull()
            )

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
            this.originatorToBeneficiaryInformationLine2 = originatorToBeneficiaryInformationLine2
        }

        /**
         * Line 3 of the information conveyed from the originator of the message to the beneficiary.
         */
        fun originatorToBeneficiaryInformationLine3(
            originatorToBeneficiaryInformationLine3: String?
        ) =
            originatorToBeneficiaryInformationLine3(
                JsonField.ofNullable(originatorToBeneficiaryInformationLine3)
            )

        /**
         * Alias for calling [Builder.originatorToBeneficiaryInformationLine3] with
         * `originatorToBeneficiaryInformationLine3.orElse(null)`.
         */
        fun originatorToBeneficiaryInformationLine3(
            originatorToBeneficiaryInformationLine3: Optional<String>
        ) =
            originatorToBeneficiaryInformationLine3(
                originatorToBeneficiaryInformationLine3.getOrNull()
            )

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
            this.originatorToBeneficiaryInformationLine3 = originatorToBeneficiaryInformationLine3
        }

        /**
         * Line 4 of the information conveyed from the originator of the message to the beneficiary.
         */
        fun originatorToBeneficiaryInformationLine4(
            originatorToBeneficiaryInformationLine4: String?
        ) =
            originatorToBeneficiaryInformationLine4(
                JsonField.ofNullable(originatorToBeneficiaryInformationLine4)
            )

        /**
         * Alias for calling [Builder.originatorToBeneficiaryInformationLine4] with
         * `originatorToBeneficiaryInformationLine4.orElse(null)`.
         */
        fun originatorToBeneficiaryInformationLine4(
            originatorToBeneficiaryInformationLine4: Optional<String>
        ) =
            originatorToBeneficiaryInformationLine4(
                originatorToBeneficiaryInformationLine4.getOrNull()
            )

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
            this.originatorToBeneficiaryInformationLine4 = originatorToBeneficiaryInformationLine4
        }

        /**
         * The Account Number from which the recipient of this request is being requested to send
         * funds.
         */
        fun recipientAccountNumberId(recipientAccountNumberId: String) =
            recipientAccountNumberId(JsonField.of(recipientAccountNumberId))

        /**
         * Sets [Builder.recipientAccountNumberId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recipientAccountNumberId] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun recipientAccountNumberId(recipientAccountNumberId: JsonField<String>) = apply {
            this.recipientAccountNumberId = recipientAccountNumberId
        }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `inbound_wire_drawdown_request`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
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

        /**
         * Returns an immutable instance of [InboundWireDrawdownRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .amount()
         * .beneficiaryAccountNumber()
         * .beneficiaryAddressLine1()
         * .beneficiaryAddressLine2()
         * .beneficiaryAddressLine3()
         * .beneficiaryName()
         * .beneficiaryRoutingNumber()
         * .createdAt()
         * .currency()
         * .messageToRecipient()
         * .originatorAccountNumber()
         * .originatorAddressLine1()
         * .originatorAddressLine2()
         * .originatorAddressLine3()
         * .originatorName()
         * .originatorRoutingNumber()
         * .originatorToBeneficiaryInformationLine1()
         * .originatorToBeneficiaryInformationLine2()
         * .originatorToBeneficiaryInformationLine3()
         * .originatorToBeneficiaryInformationLine4()
         * .recipientAccountNumberId()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): InboundWireDrawdownRequest =
            InboundWireDrawdownRequest(
                checkRequired("id", id),
                checkRequired("amount", amount),
                checkRequired("beneficiaryAccountNumber", beneficiaryAccountNumber),
                checkRequired("beneficiaryAddressLine1", beneficiaryAddressLine1),
                checkRequired("beneficiaryAddressLine2", beneficiaryAddressLine2),
                checkRequired("beneficiaryAddressLine3", beneficiaryAddressLine3),
                checkRequired("beneficiaryName", beneficiaryName),
                checkRequired("beneficiaryRoutingNumber", beneficiaryRoutingNumber),
                checkRequired("createdAt", createdAt),
                checkRequired("currency", currency),
                checkRequired("messageToRecipient", messageToRecipient),
                checkRequired("originatorAccountNumber", originatorAccountNumber),
                checkRequired("originatorAddressLine1", originatorAddressLine1),
                checkRequired("originatorAddressLine2", originatorAddressLine2),
                checkRequired("originatorAddressLine3", originatorAddressLine3),
                checkRequired("originatorName", originatorName),
                checkRequired("originatorRoutingNumber", originatorRoutingNumber),
                checkRequired(
                    "originatorToBeneficiaryInformationLine1",
                    originatorToBeneficiaryInformationLine1,
                ),
                checkRequired(
                    "originatorToBeneficiaryInformationLine2",
                    originatorToBeneficiaryInformationLine2,
                ),
                checkRequired(
                    "originatorToBeneficiaryInformationLine3",
                    originatorToBeneficiaryInformationLine3,
                ),
                checkRequired(
                    "originatorToBeneficiaryInformationLine4",
                    originatorToBeneficiaryInformationLine4,
                ),
                checkRequired("recipientAccountNumberId", recipientAccountNumberId),
                checkRequired("type", type),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): InboundWireDrawdownRequest = apply {
        if (validated) {
            return@apply
        }

        id()
        amount()
        beneficiaryAccountNumber()
        beneficiaryAddressLine1()
        beneficiaryAddressLine2()
        beneficiaryAddressLine3()
        beneficiaryName()
        beneficiaryRoutingNumber()
        createdAt()
        currency()
        messageToRecipient()
        originatorAccountNumber()
        originatorAddressLine1()
        originatorAddressLine2()
        originatorAddressLine3()
        originatorName()
        originatorRoutingNumber()
        originatorToBeneficiaryInformationLine1()
        originatorToBeneficiaryInformationLine2()
        originatorToBeneficiaryInformationLine3()
        originatorToBeneficiaryInformationLine4()
        recipientAccountNumberId()
        type().validate()
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: IncreaseInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (amount.asKnown().isPresent) 1 else 0) +
            (if (beneficiaryAccountNumber.asKnown().isPresent) 1 else 0) +
            (if (beneficiaryAddressLine1.asKnown().isPresent) 1 else 0) +
            (if (beneficiaryAddressLine2.asKnown().isPresent) 1 else 0) +
            (if (beneficiaryAddressLine3.asKnown().isPresent) 1 else 0) +
            (if (beneficiaryName.asKnown().isPresent) 1 else 0) +
            (if (beneficiaryRoutingNumber.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (currency.asKnown().isPresent) 1 else 0) +
            (if (messageToRecipient.asKnown().isPresent) 1 else 0) +
            (if (originatorAccountNumber.asKnown().isPresent) 1 else 0) +
            (if (originatorAddressLine1.asKnown().isPresent) 1 else 0) +
            (if (originatorAddressLine2.asKnown().isPresent) 1 else 0) +
            (if (originatorAddressLine3.asKnown().isPresent) 1 else 0) +
            (if (originatorName.asKnown().isPresent) 1 else 0) +
            (if (originatorRoutingNumber.asKnown().isPresent) 1 else 0) +
            (if (originatorToBeneficiaryInformationLine1.asKnown().isPresent) 1 else 0) +
            (if (originatorToBeneficiaryInformationLine2.asKnown().isPresent) 1 else 0) +
            (if (originatorToBeneficiaryInformationLine3.asKnown().isPresent) 1 else 0) +
            (if (originatorToBeneficiaryInformationLine4.asKnown().isPresent) 1 else 0) +
            (if (recipientAccountNumberId.asKnown().isPresent) 1 else 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0)

    /**
     * A constant representing the object's type. For this resource it will always be
     * `inbound_wire_drawdown_request`.
     */
    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val INBOUND_WIRE_DRAWDOWN_REQUEST = of("inbound_wire_drawdown_request")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            INBOUND_WIRE_DRAWDOWN_REQUEST
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            INBOUND_WIRE_DRAWDOWN_REQUEST,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                INBOUND_WIRE_DRAWDOWN_REQUEST -> Value.INBOUND_WIRE_DRAWDOWN_REQUEST
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws IncreaseInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                INBOUND_WIRE_DRAWDOWN_REQUEST -> Known.INBOUND_WIRE_DRAWDOWN_REQUEST
                else -> throw IncreaseInvalidDataException("Unknown Type: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws IncreaseInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                IncreaseInvalidDataException("Value is not a String")
            }

        private var validated: Boolean = false

        fun validate(): Type = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: IncreaseInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

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

        return /* spotless:off */ other is InboundWireDrawdownRequest && id == other.id && amount == other.amount && beneficiaryAccountNumber == other.beneficiaryAccountNumber && beneficiaryAddressLine1 == other.beneficiaryAddressLine1 && beneficiaryAddressLine2 == other.beneficiaryAddressLine2 && beneficiaryAddressLine3 == other.beneficiaryAddressLine3 && beneficiaryName == other.beneficiaryName && beneficiaryRoutingNumber == other.beneficiaryRoutingNumber && createdAt == other.createdAt && currency == other.currency && messageToRecipient == other.messageToRecipient && originatorAccountNumber == other.originatorAccountNumber && originatorAddressLine1 == other.originatorAddressLine1 && originatorAddressLine2 == other.originatorAddressLine2 && originatorAddressLine3 == other.originatorAddressLine3 && originatorName == other.originatorName && originatorRoutingNumber == other.originatorRoutingNumber && originatorToBeneficiaryInformationLine1 == other.originatorToBeneficiaryInformationLine1 && originatorToBeneficiaryInformationLine2 == other.originatorToBeneficiaryInformationLine2 && originatorToBeneficiaryInformationLine3 == other.originatorToBeneficiaryInformationLine3 && originatorToBeneficiaryInformationLine4 == other.originatorToBeneficiaryInformationLine4 && recipientAccountNumberId == other.recipientAccountNumberId && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, amount, beneficiaryAccountNumber, beneficiaryAddressLine1, beneficiaryAddressLine2, beneficiaryAddressLine3, beneficiaryName, beneficiaryRoutingNumber, createdAt, currency, messageToRecipient, originatorAccountNumber, originatorAddressLine1, originatorAddressLine2, originatorAddressLine3, originatorName, originatorRoutingNumber, originatorToBeneficiaryInformationLine1, originatorToBeneficiaryInformationLine2, originatorToBeneficiaryInformationLine3, originatorToBeneficiaryInformationLine4, recipientAccountNumberId, type, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InboundWireDrawdownRequest{id=$id, amount=$amount, beneficiaryAccountNumber=$beneficiaryAccountNumber, beneficiaryAddressLine1=$beneficiaryAddressLine1, beneficiaryAddressLine2=$beneficiaryAddressLine2, beneficiaryAddressLine3=$beneficiaryAddressLine3, beneficiaryName=$beneficiaryName, beneficiaryRoutingNumber=$beneficiaryRoutingNumber, createdAt=$createdAt, currency=$currency, messageToRecipient=$messageToRecipient, originatorAccountNumber=$originatorAccountNumber, originatorAddressLine1=$originatorAddressLine1, originatorAddressLine2=$originatorAddressLine2, originatorAddressLine3=$originatorAddressLine3, originatorName=$originatorName, originatorRoutingNumber=$originatorRoutingNumber, originatorToBeneficiaryInformationLine1=$originatorToBeneficiaryInformationLine1, originatorToBeneficiaryInformationLine2=$originatorToBeneficiaryInformationLine2, originatorToBeneficiaryInformationLine3=$originatorToBeneficiaryInformationLine3, originatorToBeneficiaryInformationLine4=$originatorToBeneficiaryInformationLine4, recipientAccountNumberId=$recipientAccountNumberId, type=$type, additionalProperties=$additionalProperties}"
}
