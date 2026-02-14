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
 * Inbound wire drawdown requests are requests from someone else to send them a wire. For more
 * information, see our
 * [Wire Drawdown Requests documentation](/documentation/wire-drawdown-requests).
 */
class InboundWireDrawdownRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val amount: JsonField<Long>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val creditorAccountNumber: JsonField<String>,
    private val creditorAddressLine1: JsonField<String>,
    private val creditorAddressLine2: JsonField<String>,
    private val creditorAddressLine3: JsonField<String>,
    private val creditorName: JsonField<String>,
    private val creditorRoutingNumber: JsonField<String>,
    private val currency: JsonField<String>,
    private val debtorAddressLine1: JsonField<String>,
    private val debtorAddressLine2: JsonField<String>,
    private val debtorAddressLine3: JsonField<String>,
    private val debtorName: JsonField<String>,
    private val endToEndIdentification: JsonField<String>,
    private val inputMessageAccountabilityData: JsonField<String>,
    private val instructionIdentification: JsonField<String>,
    private val recipientAccountNumberId: JsonField<String>,
    private val type: JsonField<Type>,
    private val uniqueEndToEndTransactionReference: JsonField<String>,
    private val unstructuredRemittanceInformation: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("creditor_account_number")
        @ExcludeMissing
        creditorAccountNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("creditor_address_line1")
        @ExcludeMissing
        creditorAddressLine1: JsonField<String> = JsonMissing.of(),
        @JsonProperty("creditor_address_line2")
        @ExcludeMissing
        creditorAddressLine2: JsonField<String> = JsonMissing.of(),
        @JsonProperty("creditor_address_line3")
        @ExcludeMissing
        creditorAddressLine3: JsonField<String> = JsonMissing.of(),
        @JsonProperty("creditor_name")
        @ExcludeMissing
        creditorName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("creditor_routing_number")
        @ExcludeMissing
        creditorRoutingNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("currency") @ExcludeMissing currency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("debtor_address_line1")
        @ExcludeMissing
        debtorAddressLine1: JsonField<String> = JsonMissing.of(),
        @JsonProperty("debtor_address_line2")
        @ExcludeMissing
        debtorAddressLine2: JsonField<String> = JsonMissing.of(),
        @JsonProperty("debtor_address_line3")
        @ExcludeMissing
        debtorAddressLine3: JsonField<String> = JsonMissing.of(),
        @JsonProperty("debtor_name")
        @ExcludeMissing
        debtorName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("end_to_end_identification")
        @ExcludeMissing
        endToEndIdentification: JsonField<String> = JsonMissing.of(),
        @JsonProperty("input_message_accountability_data")
        @ExcludeMissing
        inputMessageAccountabilityData: JsonField<String> = JsonMissing.of(),
        @JsonProperty("instruction_identification")
        @ExcludeMissing
        instructionIdentification: JsonField<String> = JsonMissing.of(),
        @JsonProperty("recipient_account_number_id")
        @ExcludeMissing
        recipientAccountNumberId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("unique_end_to_end_transaction_reference")
        @ExcludeMissing
        uniqueEndToEndTransactionReference: JsonField<String> = JsonMissing.of(),
        @JsonProperty("unstructured_remittance_information")
        @ExcludeMissing
        unstructuredRemittanceInformation: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        amount,
        createdAt,
        creditorAccountNumber,
        creditorAddressLine1,
        creditorAddressLine2,
        creditorAddressLine3,
        creditorName,
        creditorRoutingNumber,
        currency,
        debtorAddressLine1,
        debtorAddressLine2,
        debtorAddressLine3,
        debtorName,
        endToEndIdentification,
        inputMessageAccountabilityData,
        instructionIdentification,
        recipientAccountNumberId,
        type,
        uniqueEndToEndTransactionReference,
        unstructuredRemittanceInformation,
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
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the inbound
     * wire drawdown request was created.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * The creditor's account number.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun creditorAccountNumber(): String =
        creditorAccountNumber.getRequired("creditor_account_number")

    /**
     * A free-form address field set by the sender.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun creditorAddressLine1(): Optional<String> =
        creditorAddressLine1.getOptional("creditor_address_line1")

    /**
     * A free-form address field set by the sender.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun creditorAddressLine2(): Optional<String> =
        creditorAddressLine2.getOptional("creditor_address_line2")

    /**
     * A free-form address field set by the sender.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun creditorAddressLine3(): Optional<String> =
        creditorAddressLine3.getOptional("creditor_address_line3")

    /**
     * A name set by the sender.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun creditorName(): Optional<String> = creditorName.getOptional("creditor_name")

    /**
     * The creditor's routing number.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun creditorRoutingNumber(): String =
        creditorRoutingNumber.getRequired("creditor_routing_number")

    /**
     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the amount being requested.
     * Will always be "USD".
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun currency(): String = currency.getRequired("currency")

    /**
     * A free-form address field set by the sender.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun debtorAddressLine1(): Optional<String> =
        debtorAddressLine1.getOptional("debtor_address_line1")

    /**
     * A free-form address field set by the sender.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun debtorAddressLine2(): Optional<String> =
        debtorAddressLine2.getOptional("debtor_address_line2")

    /**
     * A free-form address field set by the sender.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun debtorAddressLine3(): Optional<String> =
        debtorAddressLine3.getOptional("debtor_address_line3")

    /**
     * A name set by the sender.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun debtorName(): Optional<String> = debtorName.getOptional("debtor_name")

    /**
     * A free-form reference string set by the sender, to help identify the drawdown request.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun endToEndIdentification(): Optional<String> =
        endToEndIdentification.getOptional("end_to_end_identification")

    /**
     * A unique identifier available to the originating and receiving banks, commonly abbreviated as
     * IMAD. It is created when the wire is submitted to the Fedwire service and is helpful when
     * debugging wires with the originating bank.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun inputMessageAccountabilityData(): Optional<String> =
        inputMessageAccountabilityData.getOptional("input_message_accountability_data")

    /**
     * The sending bank's identifier for the drawdown request.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun instructionIdentification(): Optional<String> =
        instructionIdentification.getOptional("instruction_identification")

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
     * The Unique End-to-end Transaction Reference
     * ([UETR](https://www.swift.com/payments/what-unique-end-end-transaction-reference-uetr)) of
     * the drawdown request.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun uniqueEndToEndTransactionReference(): Optional<String> =
        uniqueEndToEndTransactionReference.getOptional("unique_end_to_end_transaction_reference")

    /**
     * A free-form message set by the sender.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun unstructuredRemittanceInformation(): Optional<String> =
        unstructuredRemittanceInformation.getOptional("unstructured_remittance_information")

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
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [creditorAccountNumber].
     *
     * Unlike [creditorAccountNumber], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("creditor_account_number")
    @ExcludeMissing
    fun _creditorAccountNumber(): JsonField<String> = creditorAccountNumber

    /**
     * Returns the raw JSON value of [creditorAddressLine1].
     *
     * Unlike [creditorAddressLine1], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("creditor_address_line1")
    @ExcludeMissing
    fun _creditorAddressLine1(): JsonField<String> = creditorAddressLine1

    /**
     * Returns the raw JSON value of [creditorAddressLine2].
     *
     * Unlike [creditorAddressLine2], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("creditor_address_line2")
    @ExcludeMissing
    fun _creditorAddressLine2(): JsonField<String> = creditorAddressLine2

    /**
     * Returns the raw JSON value of [creditorAddressLine3].
     *
     * Unlike [creditorAddressLine3], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("creditor_address_line3")
    @ExcludeMissing
    fun _creditorAddressLine3(): JsonField<String> = creditorAddressLine3

    /**
     * Returns the raw JSON value of [creditorName].
     *
     * Unlike [creditorName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("creditor_name")
    @ExcludeMissing
    fun _creditorName(): JsonField<String> = creditorName

    /**
     * Returns the raw JSON value of [creditorRoutingNumber].
     *
     * Unlike [creditorRoutingNumber], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("creditor_routing_number")
    @ExcludeMissing
    fun _creditorRoutingNumber(): JsonField<String> = creditorRoutingNumber

    /**
     * Returns the raw JSON value of [currency].
     *
     * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

    /**
     * Returns the raw JSON value of [debtorAddressLine1].
     *
     * Unlike [debtorAddressLine1], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("debtor_address_line1")
    @ExcludeMissing
    fun _debtorAddressLine1(): JsonField<String> = debtorAddressLine1

    /**
     * Returns the raw JSON value of [debtorAddressLine2].
     *
     * Unlike [debtorAddressLine2], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("debtor_address_line2")
    @ExcludeMissing
    fun _debtorAddressLine2(): JsonField<String> = debtorAddressLine2

    /**
     * Returns the raw JSON value of [debtorAddressLine3].
     *
     * Unlike [debtorAddressLine3], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("debtor_address_line3")
    @ExcludeMissing
    fun _debtorAddressLine3(): JsonField<String> = debtorAddressLine3

    /**
     * Returns the raw JSON value of [debtorName].
     *
     * Unlike [debtorName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("debtor_name") @ExcludeMissing fun _debtorName(): JsonField<String> = debtorName

    /**
     * Returns the raw JSON value of [endToEndIdentification].
     *
     * Unlike [endToEndIdentification], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("end_to_end_identification")
    @ExcludeMissing
    fun _endToEndIdentification(): JsonField<String> = endToEndIdentification

    /**
     * Returns the raw JSON value of [inputMessageAccountabilityData].
     *
     * Unlike [inputMessageAccountabilityData], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("input_message_accountability_data")
    @ExcludeMissing
    fun _inputMessageAccountabilityData(): JsonField<String> = inputMessageAccountabilityData

    /**
     * Returns the raw JSON value of [instructionIdentification].
     *
     * Unlike [instructionIdentification], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("instruction_identification")
    @ExcludeMissing
    fun _instructionIdentification(): JsonField<String> = instructionIdentification

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

    /**
     * Returns the raw JSON value of [uniqueEndToEndTransactionReference].
     *
     * Unlike [uniqueEndToEndTransactionReference], this method doesn't throw if the JSON field has
     * an unexpected type.
     */
    @JsonProperty("unique_end_to_end_transaction_reference")
    @ExcludeMissing
    fun _uniqueEndToEndTransactionReference(): JsonField<String> =
        uniqueEndToEndTransactionReference

    /**
     * Returns the raw JSON value of [unstructuredRemittanceInformation].
     *
     * Unlike [unstructuredRemittanceInformation], this method doesn't throw if the JSON field has
     * an unexpected type.
     */
    @JsonProperty("unstructured_remittance_information")
    @ExcludeMissing
    fun _unstructuredRemittanceInformation(): JsonField<String> = unstructuredRemittanceInformation

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
         * .createdAt()
         * .creditorAccountNumber()
         * .creditorAddressLine1()
         * .creditorAddressLine2()
         * .creditorAddressLine3()
         * .creditorName()
         * .creditorRoutingNumber()
         * .currency()
         * .debtorAddressLine1()
         * .debtorAddressLine2()
         * .debtorAddressLine3()
         * .debtorName()
         * .endToEndIdentification()
         * .inputMessageAccountabilityData()
         * .instructionIdentification()
         * .recipientAccountNumberId()
         * .type()
         * .uniqueEndToEndTransactionReference()
         * .unstructuredRemittanceInformation()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InboundWireDrawdownRequest]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var amount: JsonField<Long>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var creditorAccountNumber: JsonField<String>? = null
        private var creditorAddressLine1: JsonField<String>? = null
        private var creditorAddressLine2: JsonField<String>? = null
        private var creditorAddressLine3: JsonField<String>? = null
        private var creditorName: JsonField<String>? = null
        private var creditorRoutingNumber: JsonField<String>? = null
        private var currency: JsonField<String>? = null
        private var debtorAddressLine1: JsonField<String>? = null
        private var debtorAddressLine2: JsonField<String>? = null
        private var debtorAddressLine3: JsonField<String>? = null
        private var debtorName: JsonField<String>? = null
        private var endToEndIdentification: JsonField<String>? = null
        private var inputMessageAccountabilityData: JsonField<String>? = null
        private var instructionIdentification: JsonField<String>? = null
        private var recipientAccountNumberId: JsonField<String>? = null
        private var type: JsonField<Type>? = null
        private var uniqueEndToEndTransactionReference: JsonField<String>? = null
        private var unstructuredRemittanceInformation: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(inboundWireDrawdownRequest: InboundWireDrawdownRequest) = apply {
            id = inboundWireDrawdownRequest.id
            amount = inboundWireDrawdownRequest.amount
            createdAt = inboundWireDrawdownRequest.createdAt
            creditorAccountNumber = inboundWireDrawdownRequest.creditorAccountNumber
            creditorAddressLine1 = inboundWireDrawdownRequest.creditorAddressLine1
            creditorAddressLine2 = inboundWireDrawdownRequest.creditorAddressLine2
            creditorAddressLine3 = inboundWireDrawdownRequest.creditorAddressLine3
            creditorName = inboundWireDrawdownRequest.creditorName
            creditorRoutingNumber = inboundWireDrawdownRequest.creditorRoutingNumber
            currency = inboundWireDrawdownRequest.currency
            debtorAddressLine1 = inboundWireDrawdownRequest.debtorAddressLine1
            debtorAddressLine2 = inboundWireDrawdownRequest.debtorAddressLine2
            debtorAddressLine3 = inboundWireDrawdownRequest.debtorAddressLine3
            debtorName = inboundWireDrawdownRequest.debtorName
            endToEndIdentification = inboundWireDrawdownRequest.endToEndIdentification
            inputMessageAccountabilityData =
                inboundWireDrawdownRequest.inputMessageAccountabilityData
            instructionIdentification = inboundWireDrawdownRequest.instructionIdentification
            recipientAccountNumberId = inboundWireDrawdownRequest.recipientAccountNumberId
            type = inboundWireDrawdownRequest.type
            uniqueEndToEndTransactionReference =
                inboundWireDrawdownRequest.uniqueEndToEndTransactionReference
            unstructuredRemittanceInformation =
                inboundWireDrawdownRequest.unstructuredRemittanceInformation
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

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the inbound
         * wire drawdown request was created.
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

        /** The creditor's account number. */
        fun creditorAccountNumber(creditorAccountNumber: String) =
            creditorAccountNumber(JsonField.of(creditorAccountNumber))

        /**
         * Sets [Builder.creditorAccountNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.creditorAccountNumber] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun creditorAccountNumber(creditorAccountNumber: JsonField<String>) = apply {
            this.creditorAccountNumber = creditorAccountNumber
        }

        /** A free-form address field set by the sender. */
        fun creditorAddressLine1(creditorAddressLine1: String?) =
            creditorAddressLine1(JsonField.ofNullable(creditorAddressLine1))

        /**
         * Alias for calling [Builder.creditorAddressLine1] with
         * `creditorAddressLine1.orElse(null)`.
         */
        fun creditorAddressLine1(creditorAddressLine1: Optional<String>) =
            creditorAddressLine1(creditorAddressLine1.getOrNull())

        /**
         * Sets [Builder.creditorAddressLine1] to an arbitrary JSON value.
         *
         * You should usually call [Builder.creditorAddressLine1] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun creditorAddressLine1(creditorAddressLine1: JsonField<String>) = apply {
            this.creditorAddressLine1 = creditorAddressLine1
        }

        /** A free-form address field set by the sender. */
        fun creditorAddressLine2(creditorAddressLine2: String?) =
            creditorAddressLine2(JsonField.ofNullable(creditorAddressLine2))

        /**
         * Alias for calling [Builder.creditorAddressLine2] with
         * `creditorAddressLine2.orElse(null)`.
         */
        fun creditorAddressLine2(creditorAddressLine2: Optional<String>) =
            creditorAddressLine2(creditorAddressLine2.getOrNull())

        /**
         * Sets [Builder.creditorAddressLine2] to an arbitrary JSON value.
         *
         * You should usually call [Builder.creditorAddressLine2] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun creditorAddressLine2(creditorAddressLine2: JsonField<String>) = apply {
            this.creditorAddressLine2 = creditorAddressLine2
        }

        /** A free-form address field set by the sender. */
        fun creditorAddressLine3(creditorAddressLine3: String?) =
            creditorAddressLine3(JsonField.ofNullable(creditorAddressLine3))

        /**
         * Alias for calling [Builder.creditorAddressLine3] with
         * `creditorAddressLine3.orElse(null)`.
         */
        fun creditorAddressLine3(creditorAddressLine3: Optional<String>) =
            creditorAddressLine3(creditorAddressLine3.getOrNull())

        /**
         * Sets [Builder.creditorAddressLine3] to an arbitrary JSON value.
         *
         * You should usually call [Builder.creditorAddressLine3] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun creditorAddressLine3(creditorAddressLine3: JsonField<String>) = apply {
            this.creditorAddressLine3 = creditorAddressLine3
        }

        /** A name set by the sender. */
        fun creditorName(creditorName: String?) = creditorName(JsonField.ofNullable(creditorName))

        /** Alias for calling [Builder.creditorName] with `creditorName.orElse(null)`. */
        fun creditorName(creditorName: Optional<String>) = creditorName(creditorName.getOrNull())

        /**
         * Sets [Builder.creditorName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.creditorName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun creditorName(creditorName: JsonField<String>) = apply {
            this.creditorName = creditorName
        }

        /** The creditor's routing number. */
        fun creditorRoutingNumber(creditorRoutingNumber: String) =
            creditorRoutingNumber(JsonField.of(creditorRoutingNumber))

        /**
         * Sets [Builder.creditorRoutingNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.creditorRoutingNumber] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun creditorRoutingNumber(creditorRoutingNumber: JsonField<String>) = apply {
            this.creditorRoutingNumber = creditorRoutingNumber
        }

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

        /** A free-form address field set by the sender. */
        fun debtorAddressLine1(debtorAddressLine1: String?) =
            debtorAddressLine1(JsonField.ofNullable(debtorAddressLine1))

        /**
         * Alias for calling [Builder.debtorAddressLine1] with `debtorAddressLine1.orElse(null)`.
         */
        fun debtorAddressLine1(debtorAddressLine1: Optional<String>) =
            debtorAddressLine1(debtorAddressLine1.getOrNull())

        /**
         * Sets [Builder.debtorAddressLine1] to an arbitrary JSON value.
         *
         * You should usually call [Builder.debtorAddressLine1] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun debtorAddressLine1(debtorAddressLine1: JsonField<String>) = apply {
            this.debtorAddressLine1 = debtorAddressLine1
        }

        /** A free-form address field set by the sender. */
        fun debtorAddressLine2(debtorAddressLine2: String?) =
            debtorAddressLine2(JsonField.ofNullable(debtorAddressLine2))

        /**
         * Alias for calling [Builder.debtorAddressLine2] with `debtorAddressLine2.orElse(null)`.
         */
        fun debtorAddressLine2(debtorAddressLine2: Optional<String>) =
            debtorAddressLine2(debtorAddressLine2.getOrNull())

        /**
         * Sets [Builder.debtorAddressLine2] to an arbitrary JSON value.
         *
         * You should usually call [Builder.debtorAddressLine2] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun debtorAddressLine2(debtorAddressLine2: JsonField<String>) = apply {
            this.debtorAddressLine2 = debtorAddressLine2
        }

        /** A free-form address field set by the sender. */
        fun debtorAddressLine3(debtorAddressLine3: String?) =
            debtorAddressLine3(JsonField.ofNullable(debtorAddressLine3))

        /**
         * Alias for calling [Builder.debtorAddressLine3] with `debtorAddressLine3.orElse(null)`.
         */
        fun debtorAddressLine3(debtorAddressLine3: Optional<String>) =
            debtorAddressLine3(debtorAddressLine3.getOrNull())

        /**
         * Sets [Builder.debtorAddressLine3] to an arbitrary JSON value.
         *
         * You should usually call [Builder.debtorAddressLine3] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun debtorAddressLine3(debtorAddressLine3: JsonField<String>) = apply {
            this.debtorAddressLine3 = debtorAddressLine3
        }

        /** A name set by the sender. */
        fun debtorName(debtorName: String?) = debtorName(JsonField.ofNullable(debtorName))

        /** Alias for calling [Builder.debtorName] with `debtorName.orElse(null)`. */
        fun debtorName(debtorName: Optional<String>) = debtorName(debtorName.getOrNull())

        /**
         * Sets [Builder.debtorName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.debtorName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun debtorName(debtorName: JsonField<String>) = apply { this.debtorName = debtorName }

        /**
         * A free-form reference string set by the sender, to help identify the drawdown request.
         */
        fun endToEndIdentification(endToEndIdentification: String?) =
            endToEndIdentification(JsonField.ofNullable(endToEndIdentification))

        /**
         * Alias for calling [Builder.endToEndIdentification] with
         * `endToEndIdentification.orElse(null)`.
         */
        fun endToEndIdentification(endToEndIdentification: Optional<String>) =
            endToEndIdentification(endToEndIdentification.getOrNull())

        /**
         * Sets [Builder.endToEndIdentification] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endToEndIdentification] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun endToEndIdentification(endToEndIdentification: JsonField<String>) = apply {
            this.endToEndIdentification = endToEndIdentification
        }

        /**
         * A unique identifier available to the originating and receiving banks, commonly
         * abbreviated as IMAD. It is created when the wire is submitted to the Fedwire service and
         * is helpful when debugging wires with the originating bank.
         */
        fun inputMessageAccountabilityData(inputMessageAccountabilityData: String?) =
            inputMessageAccountabilityData(JsonField.ofNullable(inputMessageAccountabilityData))

        /**
         * Alias for calling [Builder.inputMessageAccountabilityData] with
         * `inputMessageAccountabilityData.orElse(null)`.
         */
        fun inputMessageAccountabilityData(inputMessageAccountabilityData: Optional<String>) =
            inputMessageAccountabilityData(inputMessageAccountabilityData.getOrNull())

        /**
         * Sets [Builder.inputMessageAccountabilityData] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inputMessageAccountabilityData] with a well-typed
         * [String] value instead. This method is primarily for setting the field to an undocumented
         * or not yet supported value.
         */
        fun inputMessageAccountabilityData(inputMessageAccountabilityData: JsonField<String>) =
            apply {
                this.inputMessageAccountabilityData = inputMessageAccountabilityData
            }

        /** The sending bank's identifier for the drawdown request. */
        fun instructionIdentification(instructionIdentification: String?) =
            instructionIdentification(JsonField.ofNullable(instructionIdentification))

        /**
         * Alias for calling [Builder.instructionIdentification] with
         * `instructionIdentification.orElse(null)`.
         */
        fun instructionIdentification(instructionIdentification: Optional<String>) =
            instructionIdentification(instructionIdentification.getOrNull())

        /**
         * Sets [Builder.instructionIdentification] to an arbitrary JSON value.
         *
         * You should usually call [Builder.instructionIdentification] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun instructionIdentification(instructionIdentification: JsonField<String>) = apply {
            this.instructionIdentification = instructionIdentification
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

        /**
         * The Unique End-to-end Transaction Reference
         * ([UETR](https://www.swift.com/payments/what-unique-end-end-transaction-reference-uetr))
         * of the drawdown request.
         */
        fun uniqueEndToEndTransactionReference(uniqueEndToEndTransactionReference: String?) =
            uniqueEndToEndTransactionReference(
                JsonField.ofNullable(uniqueEndToEndTransactionReference)
            )

        /**
         * Alias for calling [Builder.uniqueEndToEndTransactionReference] with
         * `uniqueEndToEndTransactionReference.orElse(null)`.
         */
        fun uniqueEndToEndTransactionReference(
            uniqueEndToEndTransactionReference: Optional<String>
        ) = uniqueEndToEndTransactionReference(uniqueEndToEndTransactionReference.getOrNull())

        /**
         * Sets [Builder.uniqueEndToEndTransactionReference] to an arbitrary JSON value.
         *
         * You should usually call [Builder.uniqueEndToEndTransactionReference] with a well-typed
         * [String] value instead. This method is primarily for setting the field to an undocumented
         * or not yet supported value.
         */
        fun uniqueEndToEndTransactionReference(
            uniqueEndToEndTransactionReference: JsonField<String>
        ) = apply { this.uniqueEndToEndTransactionReference = uniqueEndToEndTransactionReference }

        /** A free-form message set by the sender. */
        fun unstructuredRemittanceInformation(unstructuredRemittanceInformation: String?) =
            unstructuredRemittanceInformation(
                JsonField.ofNullable(unstructuredRemittanceInformation)
            )

        /**
         * Alias for calling [Builder.unstructuredRemittanceInformation] with
         * `unstructuredRemittanceInformation.orElse(null)`.
         */
        fun unstructuredRemittanceInformation(unstructuredRemittanceInformation: Optional<String>) =
            unstructuredRemittanceInformation(unstructuredRemittanceInformation.getOrNull())

        /**
         * Sets [Builder.unstructuredRemittanceInformation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.unstructuredRemittanceInformation] with a well-typed
         * [String] value instead. This method is primarily for setting the field to an undocumented
         * or not yet supported value.
         */
        fun unstructuredRemittanceInformation(
            unstructuredRemittanceInformation: JsonField<String>
        ) = apply { this.unstructuredRemittanceInformation = unstructuredRemittanceInformation }

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
         * .createdAt()
         * .creditorAccountNumber()
         * .creditorAddressLine1()
         * .creditorAddressLine2()
         * .creditorAddressLine3()
         * .creditorName()
         * .creditorRoutingNumber()
         * .currency()
         * .debtorAddressLine1()
         * .debtorAddressLine2()
         * .debtorAddressLine3()
         * .debtorName()
         * .endToEndIdentification()
         * .inputMessageAccountabilityData()
         * .instructionIdentification()
         * .recipientAccountNumberId()
         * .type()
         * .uniqueEndToEndTransactionReference()
         * .unstructuredRemittanceInformation()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): InboundWireDrawdownRequest =
            InboundWireDrawdownRequest(
                checkRequired("id", id),
                checkRequired("amount", amount),
                checkRequired("createdAt", createdAt),
                checkRequired("creditorAccountNumber", creditorAccountNumber),
                checkRequired("creditorAddressLine1", creditorAddressLine1),
                checkRequired("creditorAddressLine2", creditorAddressLine2),
                checkRequired("creditorAddressLine3", creditorAddressLine3),
                checkRequired("creditorName", creditorName),
                checkRequired("creditorRoutingNumber", creditorRoutingNumber),
                checkRequired("currency", currency),
                checkRequired("debtorAddressLine1", debtorAddressLine1),
                checkRequired("debtorAddressLine2", debtorAddressLine2),
                checkRequired("debtorAddressLine3", debtorAddressLine3),
                checkRequired("debtorName", debtorName),
                checkRequired("endToEndIdentification", endToEndIdentification),
                checkRequired("inputMessageAccountabilityData", inputMessageAccountabilityData),
                checkRequired("instructionIdentification", instructionIdentification),
                checkRequired("recipientAccountNumberId", recipientAccountNumberId),
                checkRequired("type", type),
                checkRequired(
                    "uniqueEndToEndTransactionReference",
                    uniqueEndToEndTransactionReference,
                ),
                checkRequired(
                    "unstructuredRemittanceInformation",
                    unstructuredRemittanceInformation,
                ),
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
        createdAt()
        creditorAccountNumber()
        creditorAddressLine1()
        creditorAddressLine2()
        creditorAddressLine3()
        creditorName()
        creditorRoutingNumber()
        currency()
        debtorAddressLine1()
        debtorAddressLine2()
        debtorAddressLine3()
        debtorName()
        endToEndIdentification()
        inputMessageAccountabilityData()
        instructionIdentification()
        recipientAccountNumberId()
        type().validate()
        uniqueEndToEndTransactionReference()
        unstructuredRemittanceInformation()
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
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (creditorAccountNumber.asKnown().isPresent) 1 else 0) +
            (if (creditorAddressLine1.asKnown().isPresent) 1 else 0) +
            (if (creditorAddressLine2.asKnown().isPresent) 1 else 0) +
            (if (creditorAddressLine3.asKnown().isPresent) 1 else 0) +
            (if (creditorName.asKnown().isPresent) 1 else 0) +
            (if (creditorRoutingNumber.asKnown().isPresent) 1 else 0) +
            (if (currency.asKnown().isPresent) 1 else 0) +
            (if (debtorAddressLine1.asKnown().isPresent) 1 else 0) +
            (if (debtorAddressLine2.asKnown().isPresent) 1 else 0) +
            (if (debtorAddressLine3.asKnown().isPresent) 1 else 0) +
            (if (debtorName.asKnown().isPresent) 1 else 0) +
            (if (endToEndIdentification.asKnown().isPresent) 1 else 0) +
            (if (inputMessageAccountabilityData.asKnown().isPresent) 1 else 0) +
            (if (instructionIdentification.asKnown().isPresent) 1 else 0) +
            (if (recipientAccountNumberId.asKnown().isPresent) 1 else 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0) +
            (if (uniqueEndToEndTransactionReference.asKnown().isPresent) 1 else 0) +
            (if (unstructuredRemittanceInformation.asKnown().isPresent) 1 else 0)

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

            return other is Type && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InboundWireDrawdownRequest &&
            id == other.id &&
            amount == other.amount &&
            createdAt == other.createdAt &&
            creditorAccountNumber == other.creditorAccountNumber &&
            creditorAddressLine1 == other.creditorAddressLine1 &&
            creditorAddressLine2 == other.creditorAddressLine2 &&
            creditorAddressLine3 == other.creditorAddressLine3 &&
            creditorName == other.creditorName &&
            creditorRoutingNumber == other.creditorRoutingNumber &&
            currency == other.currency &&
            debtorAddressLine1 == other.debtorAddressLine1 &&
            debtorAddressLine2 == other.debtorAddressLine2 &&
            debtorAddressLine3 == other.debtorAddressLine3 &&
            debtorName == other.debtorName &&
            endToEndIdentification == other.endToEndIdentification &&
            inputMessageAccountabilityData == other.inputMessageAccountabilityData &&
            instructionIdentification == other.instructionIdentification &&
            recipientAccountNumberId == other.recipientAccountNumberId &&
            type == other.type &&
            uniqueEndToEndTransactionReference == other.uniqueEndToEndTransactionReference &&
            unstructuredRemittanceInformation == other.unstructuredRemittanceInformation &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            amount,
            createdAt,
            creditorAccountNumber,
            creditorAddressLine1,
            creditorAddressLine2,
            creditorAddressLine3,
            creditorName,
            creditorRoutingNumber,
            currency,
            debtorAddressLine1,
            debtorAddressLine2,
            debtorAddressLine3,
            debtorName,
            endToEndIdentification,
            inputMessageAccountabilityData,
            instructionIdentification,
            recipientAccountNumberId,
            type,
            uniqueEndToEndTransactionReference,
            unstructuredRemittanceInformation,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InboundWireDrawdownRequest{id=$id, amount=$amount, createdAt=$createdAt, creditorAccountNumber=$creditorAccountNumber, creditorAddressLine1=$creditorAddressLine1, creditorAddressLine2=$creditorAddressLine2, creditorAddressLine3=$creditorAddressLine3, creditorName=$creditorName, creditorRoutingNumber=$creditorRoutingNumber, currency=$currency, debtorAddressLine1=$debtorAddressLine1, debtorAddressLine2=$debtorAddressLine2, debtorAddressLine3=$debtorAddressLine3, debtorName=$debtorName, endToEndIdentification=$endToEndIdentification, inputMessageAccountabilityData=$inputMessageAccountabilityData, instructionIdentification=$instructionIdentification, recipientAccountNumberId=$recipientAccountNumberId, type=$type, uniqueEndToEndTransactionReference=$uniqueEndToEndTransactionReference, unstructuredRemittanceInformation=$unstructuredRemittanceInformation, additionalProperties=$additionalProperties}"
}
