// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.inboundwiretransfers

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

/** An Inbound Wire Transfer is a wire transfer initiated outside of Increase to your account. */
class InboundWireTransfer
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val acceptance: JsonField<Acceptance>,
    private val accountId: JsonField<String>,
    private val accountNumberId: JsonField<String>,
    private val amount: JsonField<Long>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val creditorAddressLine1: JsonField<String>,
    private val creditorAddressLine2: JsonField<String>,
    private val creditorAddressLine3: JsonField<String>,
    private val creditorName: JsonField<String>,
    private val debtorAddressLine1: JsonField<String>,
    private val debtorAddressLine2: JsonField<String>,
    private val debtorAddressLine3: JsonField<String>,
    private val debtorName: JsonField<String>,
    private val description: JsonField<String>,
    private val endToEndIdentification: JsonField<String>,
    private val inputMessageAccountabilityData: JsonField<String>,
    private val instructingAgentRoutingNumber: JsonField<String>,
    private val instructionIdentification: JsonField<String>,
    private val reversal: JsonField<Reversal>,
    private val status: JsonField<Status>,
    private val type: JsonField<Type>,
    private val uniqueEndToEndTransactionReference: JsonField<String>,
    private val unstructuredRemittanceInformation: JsonField<String>,
    private val wireDrawdownRequestId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("acceptance")
        @ExcludeMissing
        acceptance: JsonField<Acceptance> = JsonMissing.of(),
        @JsonProperty("account_id") @ExcludeMissing accountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("account_number_id")
        @ExcludeMissing
        accountNumberId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
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
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("end_to_end_identification")
        @ExcludeMissing
        endToEndIdentification: JsonField<String> = JsonMissing.of(),
        @JsonProperty("input_message_accountability_data")
        @ExcludeMissing
        inputMessageAccountabilityData: JsonField<String> = JsonMissing.of(),
        @JsonProperty("instructing_agent_routing_number")
        @ExcludeMissing
        instructingAgentRoutingNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("instruction_identification")
        @ExcludeMissing
        instructionIdentification: JsonField<String> = JsonMissing.of(),
        @JsonProperty("reversal") @ExcludeMissing reversal: JsonField<Reversal> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("unique_end_to_end_transaction_reference")
        @ExcludeMissing
        uniqueEndToEndTransactionReference: JsonField<String> = JsonMissing.of(),
        @JsonProperty("unstructured_remittance_information")
        @ExcludeMissing
        unstructuredRemittanceInformation: JsonField<String> = JsonMissing.of(),
        @JsonProperty("wire_drawdown_request_id")
        @ExcludeMissing
        wireDrawdownRequestId: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        acceptance,
        accountId,
        accountNumberId,
        amount,
        createdAt,
        creditorAddressLine1,
        creditorAddressLine2,
        creditorAddressLine3,
        creditorName,
        debtorAddressLine1,
        debtorAddressLine2,
        debtorAddressLine3,
        debtorName,
        description,
        endToEndIdentification,
        inputMessageAccountabilityData,
        instructingAgentRoutingNumber,
        instructionIdentification,
        reversal,
        status,
        type,
        uniqueEndToEndTransactionReference,
        unstructuredRemittanceInformation,
        wireDrawdownRequestId,
        mutableMapOf(),
    )

    /**
     * The inbound wire transfer's identifier.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * If the transfer is accepted, this will contain details of the acceptance.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun acceptance(): Optional<Acceptance> = acceptance.getOptional("acceptance")

    /**
     * The Account to which the transfer belongs.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountId(): String = accountId.getRequired("account_id")

    /**
     * The identifier of the Account Number to which this transfer was sent.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountNumberId(): String = accountNumberId.getRequired("account_number_id")

    /**
     * The amount in USD cents.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun amount(): Long = amount.getRequired("amount")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the inbound
     * wire transfer was created.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

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
     * An Increase-constructed description of the transfer.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun description(): String = description.getRequired("description")

    /**
     * A free-form reference string set by the sender, to help identify the transfer.
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
     * The American Banking Association (ABA) routing number of the bank that sent the wire.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun instructingAgentRoutingNumber(): Optional<String> =
        instructingAgentRoutingNumber.getOptional("instructing_agent_routing_number")

    /**
     * The sending bank's identifier for the wire transfer.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun instructionIdentification(): Optional<String> =
        instructionIdentification.getOptional("instruction_identification")

    /**
     * If the transfer is reversed, this will contain details of the reversal.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun reversal(): Optional<Reversal> = reversal.getOptional("reversal")

    /**
     * The status of the transfer.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `inbound_wire_transfer`.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * The Unique End-to-end Transaction Reference
     * ([UETR](https://www.swift.com/payments/what-unique-end-end-transaction-reference-uetr)) of
     * the transfer.
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
     * The wire drawdown request the inbound wire transfer is fulfilling.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun wireDrawdownRequestId(): Optional<String> =
        wireDrawdownRequestId.getOptional("wire_drawdown_request_id")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [acceptance].
     *
     * Unlike [acceptance], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("acceptance")
    @ExcludeMissing
    fun _acceptance(): JsonField<Acceptance> = acceptance

    /**
     * Returns the raw JSON value of [accountId].
     *
     * Unlike [accountId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("account_id") @ExcludeMissing fun _accountId(): JsonField<String> = accountId

    /**
     * Returns the raw JSON value of [accountNumberId].
     *
     * Unlike [accountNumberId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("account_number_id")
    @ExcludeMissing
    fun _accountNumberId(): JsonField<String> = accountNumberId

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
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

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
     * Returns the raw JSON value of [instructingAgentRoutingNumber].
     *
     * Unlike [instructingAgentRoutingNumber], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("instructing_agent_routing_number")
    @ExcludeMissing
    fun _instructingAgentRoutingNumber(): JsonField<String> = instructingAgentRoutingNumber

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
     * Returns the raw JSON value of [reversal].
     *
     * Unlike [reversal], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reversal") @ExcludeMissing fun _reversal(): JsonField<Reversal> = reversal

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

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

    /**
     * Returns the raw JSON value of [wireDrawdownRequestId].
     *
     * Unlike [wireDrawdownRequestId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("wire_drawdown_request_id")
    @ExcludeMissing
    fun _wireDrawdownRequestId(): JsonField<String> = wireDrawdownRequestId

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
         * Returns a mutable builder for constructing an instance of [InboundWireTransfer].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .acceptance()
         * .accountId()
         * .accountNumberId()
         * .amount()
         * .createdAt()
         * .creditorAddressLine1()
         * .creditorAddressLine2()
         * .creditorAddressLine3()
         * .creditorName()
         * .debtorAddressLine1()
         * .debtorAddressLine2()
         * .debtorAddressLine3()
         * .debtorName()
         * .description()
         * .endToEndIdentification()
         * .inputMessageAccountabilityData()
         * .instructingAgentRoutingNumber()
         * .instructionIdentification()
         * .reversal()
         * .status()
         * .type()
         * .uniqueEndToEndTransactionReference()
         * .unstructuredRemittanceInformation()
         * .wireDrawdownRequestId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InboundWireTransfer]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var acceptance: JsonField<Acceptance>? = null
        private var accountId: JsonField<String>? = null
        private var accountNumberId: JsonField<String>? = null
        private var amount: JsonField<Long>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var creditorAddressLine1: JsonField<String>? = null
        private var creditorAddressLine2: JsonField<String>? = null
        private var creditorAddressLine3: JsonField<String>? = null
        private var creditorName: JsonField<String>? = null
        private var debtorAddressLine1: JsonField<String>? = null
        private var debtorAddressLine2: JsonField<String>? = null
        private var debtorAddressLine3: JsonField<String>? = null
        private var debtorName: JsonField<String>? = null
        private var description: JsonField<String>? = null
        private var endToEndIdentification: JsonField<String>? = null
        private var inputMessageAccountabilityData: JsonField<String>? = null
        private var instructingAgentRoutingNumber: JsonField<String>? = null
        private var instructionIdentification: JsonField<String>? = null
        private var reversal: JsonField<Reversal>? = null
        private var status: JsonField<Status>? = null
        private var type: JsonField<Type>? = null
        private var uniqueEndToEndTransactionReference: JsonField<String>? = null
        private var unstructuredRemittanceInformation: JsonField<String>? = null
        private var wireDrawdownRequestId: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(inboundWireTransfer: InboundWireTransfer) = apply {
            id = inboundWireTransfer.id
            acceptance = inboundWireTransfer.acceptance
            accountId = inboundWireTransfer.accountId
            accountNumberId = inboundWireTransfer.accountNumberId
            amount = inboundWireTransfer.amount
            createdAt = inboundWireTransfer.createdAt
            creditorAddressLine1 = inboundWireTransfer.creditorAddressLine1
            creditorAddressLine2 = inboundWireTransfer.creditorAddressLine2
            creditorAddressLine3 = inboundWireTransfer.creditorAddressLine3
            creditorName = inboundWireTransfer.creditorName
            debtorAddressLine1 = inboundWireTransfer.debtorAddressLine1
            debtorAddressLine2 = inboundWireTransfer.debtorAddressLine2
            debtorAddressLine3 = inboundWireTransfer.debtorAddressLine3
            debtorName = inboundWireTransfer.debtorName
            description = inboundWireTransfer.description
            endToEndIdentification = inboundWireTransfer.endToEndIdentification
            inputMessageAccountabilityData = inboundWireTransfer.inputMessageAccountabilityData
            instructingAgentRoutingNumber = inboundWireTransfer.instructingAgentRoutingNumber
            instructionIdentification = inboundWireTransfer.instructionIdentification
            reversal = inboundWireTransfer.reversal
            status = inboundWireTransfer.status
            type = inboundWireTransfer.type
            uniqueEndToEndTransactionReference =
                inboundWireTransfer.uniqueEndToEndTransactionReference
            unstructuredRemittanceInformation =
                inboundWireTransfer.unstructuredRemittanceInformation
            wireDrawdownRequestId = inboundWireTransfer.wireDrawdownRequestId
            additionalProperties = inboundWireTransfer.additionalProperties.toMutableMap()
        }

        /** The inbound wire transfer's identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** If the transfer is accepted, this will contain details of the acceptance. */
        fun acceptance(acceptance: Acceptance?) = acceptance(JsonField.ofNullable(acceptance))

        /** Alias for calling [Builder.acceptance] with `acceptance.orElse(null)`. */
        fun acceptance(acceptance: Optional<Acceptance>) = acceptance(acceptance.getOrNull())

        /**
         * Sets [Builder.acceptance] to an arbitrary JSON value.
         *
         * You should usually call [Builder.acceptance] with a well-typed [Acceptance] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun acceptance(acceptance: JsonField<Acceptance>) = apply { this.acceptance = acceptance }

        /** The Account to which the transfer belongs. */
        fun accountId(accountId: String) = accountId(JsonField.of(accountId))

        /**
         * Sets [Builder.accountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

        /** The identifier of the Account Number to which this transfer was sent. */
        fun accountNumberId(accountNumberId: String) =
            accountNumberId(JsonField.of(accountNumberId))

        /**
         * Sets [Builder.accountNumberId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountNumberId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun accountNumberId(accountNumberId: JsonField<String>) = apply {
            this.accountNumberId = accountNumberId
        }

        /** The amount in USD cents. */
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
         * wire transfer was created.
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

        /** An Increase-constructed description of the transfer. */
        fun description(description: String) = description(JsonField.of(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** A free-form reference string set by the sender, to help identify the transfer. */
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

        /** The American Banking Association (ABA) routing number of the bank that sent the wire. */
        fun instructingAgentRoutingNumber(instructingAgentRoutingNumber: String?) =
            instructingAgentRoutingNumber(JsonField.ofNullable(instructingAgentRoutingNumber))

        /**
         * Alias for calling [Builder.instructingAgentRoutingNumber] with
         * `instructingAgentRoutingNumber.orElse(null)`.
         */
        fun instructingAgentRoutingNumber(instructingAgentRoutingNumber: Optional<String>) =
            instructingAgentRoutingNumber(instructingAgentRoutingNumber.getOrNull())

        /**
         * Sets [Builder.instructingAgentRoutingNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.instructingAgentRoutingNumber] with a well-typed
         * [String] value instead. This method is primarily for setting the field to an undocumented
         * or not yet supported value.
         */
        fun instructingAgentRoutingNumber(instructingAgentRoutingNumber: JsonField<String>) =
            apply {
                this.instructingAgentRoutingNumber = instructingAgentRoutingNumber
            }

        /** The sending bank's identifier for the wire transfer. */
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

        /** If the transfer is reversed, this will contain details of the reversal. */
        fun reversal(reversal: Reversal?) = reversal(JsonField.ofNullable(reversal))

        /** Alias for calling [Builder.reversal] with `reversal.orElse(null)`. */
        fun reversal(reversal: Optional<Reversal>) = reversal(reversal.getOrNull())

        /**
         * Sets [Builder.reversal] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reversal] with a well-typed [Reversal] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun reversal(reversal: JsonField<Reversal>) = apply { this.reversal = reversal }

        /** The status of the transfer. */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `inbound_wire_transfer`.
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
         * of the transfer.
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

        /** The wire drawdown request the inbound wire transfer is fulfilling. */
        fun wireDrawdownRequestId(wireDrawdownRequestId: String?) =
            wireDrawdownRequestId(JsonField.ofNullable(wireDrawdownRequestId))

        /**
         * Alias for calling [Builder.wireDrawdownRequestId] with
         * `wireDrawdownRequestId.orElse(null)`.
         */
        fun wireDrawdownRequestId(wireDrawdownRequestId: Optional<String>) =
            wireDrawdownRequestId(wireDrawdownRequestId.getOrNull())

        /**
         * Sets [Builder.wireDrawdownRequestId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.wireDrawdownRequestId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun wireDrawdownRequestId(wireDrawdownRequestId: JsonField<String>) = apply {
            this.wireDrawdownRequestId = wireDrawdownRequestId
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
         * Returns an immutable instance of [InboundWireTransfer].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .acceptance()
         * .accountId()
         * .accountNumberId()
         * .amount()
         * .createdAt()
         * .creditorAddressLine1()
         * .creditorAddressLine2()
         * .creditorAddressLine3()
         * .creditorName()
         * .debtorAddressLine1()
         * .debtorAddressLine2()
         * .debtorAddressLine3()
         * .debtorName()
         * .description()
         * .endToEndIdentification()
         * .inputMessageAccountabilityData()
         * .instructingAgentRoutingNumber()
         * .instructionIdentification()
         * .reversal()
         * .status()
         * .type()
         * .uniqueEndToEndTransactionReference()
         * .unstructuredRemittanceInformation()
         * .wireDrawdownRequestId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): InboundWireTransfer =
            InboundWireTransfer(
                checkRequired("id", id),
                checkRequired("acceptance", acceptance),
                checkRequired("accountId", accountId),
                checkRequired("accountNumberId", accountNumberId),
                checkRequired("amount", amount),
                checkRequired("createdAt", createdAt),
                checkRequired("creditorAddressLine1", creditorAddressLine1),
                checkRequired("creditorAddressLine2", creditorAddressLine2),
                checkRequired("creditorAddressLine3", creditorAddressLine3),
                checkRequired("creditorName", creditorName),
                checkRequired("debtorAddressLine1", debtorAddressLine1),
                checkRequired("debtorAddressLine2", debtorAddressLine2),
                checkRequired("debtorAddressLine3", debtorAddressLine3),
                checkRequired("debtorName", debtorName),
                checkRequired("description", description),
                checkRequired("endToEndIdentification", endToEndIdentification),
                checkRequired("inputMessageAccountabilityData", inputMessageAccountabilityData),
                checkRequired("instructingAgentRoutingNumber", instructingAgentRoutingNumber),
                checkRequired("instructionIdentification", instructionIdentification),
                checkRequired("reversal", reversal),
                checkRequired("status", status),
                checkRequired("type", type),
                checkRequired(
                    "uniqueEndToEndTransactionReference",
                    uniqueEndToEndTransactionReference,
                ),
                checkRequired(
                    "unstructuredRemittanceInformation",
                    unstructuredRemittanceInformation,
                ),
                checkRequired("wireDrawdownRequestId", wireDrawdownRequestId),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): InboundWireTransfer = apply {
        if (validated) {
            return@apply
        }

        id()
        acceptance().ifPresent { it.validate() }
        accountId()
        accountNumberId()
        amount()
        createdAt()
        creditorAddressLine1()
        creditorAddressLine2()
        creditorAddressLine3()
        creditorName()
        debtorAddressLine1()
        debtorAddressLine2()
        debtorAddressLine3()
        debtorName()
        description()
        endToEndIdentification()
        inputMessageAccountabilityData()
        instructingAgentRoutingNumber()
        instructionIdentification()
        reversal().ifPresent { it.validate() }
        status().validate()
        type().validate()
        uniqueEndToEndTransactionReference()
        unstructuredRemittanceInformation()
        wireDrawdownRequestId()
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
            (acceptance.asKnown().getOrNull()?.validity() ?: 0) +
            (if (accountId.asKnown().isPresent) 1 else 0) +
            (if (accountNumberId.asKnown().isPresent) 1 else 0) +
            (if (amount.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (creditorAddressLine1.asKnown().isPresent) 1 else 0) +
            (if (creditorAddressLine2.asKnown().isPresent) 1 else 0) +
            (if (creditorAddressLine3.asKnown().isPresent) 1 else 0) +
            (if (creditorName.asKnown().isPresent) 1 else 0) +
            (if (debtorAddressLine1.asKnown().isPresent) 1 else 0) +
            (if (debtorAddressLine2.asKnown().isPresent) 1 else 0) +
            (if (debtorAddressLine3.asKnown().isPresent) 1 else 0) +
            (if (debtorName.asKnown().isPresent) 1 else 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (if (endToEndIdentification.asKnown().isPresent) 1 else 0) +
            (if (inputMessageAccountabilityData.asKnown().isPresent) 1 else 0) +
            (if (instructingAgentRoutingNumber.asKnown().isPresent) 1 else 0) +
            (if (instructionIdentification.asKnown().isPresent) 1 else 0) +
            (reversal.asKnown().getOrNull()?.validity() ?: 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0) +
            (if (uniqueEndToEndTransactionReference.asKnown().isPresent) 1 else 0) +
            (if (unstructuredRemittanceInformation.asKnown().isPresent) 1 else 0) +
            (if (wireDrawdownRequestId.asKnown().isPresent) 1 else 0)

    /** If the transfer is accepted, this will contain details of the acceptance. */
    class Acceptance
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val acceptedAt: JsonField<OffsetDateTime>,
        private val transactionId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("accepted_at")
            @ExcludeMissing
            acceptedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("transaction_id")
            @ExcludeMissing
            transactionId: JsonField<String> = JsonMissing.of(),
        ) : this(acceptedAt, transactionId, mutableMapOf())

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
         * transfer was accepted.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun acceptedAt(): OffsetDateTime = acceptedAt.getRequired("accepted_at")

        /**
         * The identifier of the transaction for the accepted transfer.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun transactionId(): String = transactionId.getRequired("transaction_id")

        /**
         * Returns the raw JSON value of [acceptedAt].
         *
         * Unlike [acceptedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("accepted_at")
        @ExcludeMissing
        fun _acceptedAt(): JsonField<OffsetDateTime> = acceptedAt

        /**
         * Returns the raw JSON value of [transactionId].
         *
         * Unlike [transactionId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("transaction_id")
        @ExcludeMissing
        fun _transactionId(): JsonField<String> = transactionId

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
             * Returns a mutable builder for constructing an instance of [Acceptance].
             *
             * The following fields are required:
             * ```java
             * .acceptedAt()
             * .transactionId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Acceptance]. */
        class Builder internal constructor() {

            private var acceptedAt: JsonField<OffsetDateTime>? = null
            private var transactionId: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(acceptance: Acceptance) = apply {
                acceptedAt = acceptance.acceptedAt
                transactionId = acceptance.transactionId
                additionalProperties = acceptance.additionalProperties.toMutableMap()
            }

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * transfer was accepted.
             */
            fun acceptedAt(acceptedAt: OffsetDateTime) = acceptedAt(JsonField.of(acceptedAt))

            /**
             * Sets [Builder.acceptedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.acceptedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun acceptedAt(acceptedAt: JsonField<OffsetDateTime>) = apply {
                this.acceptedAt = acceptedAt
            }

            /** The identifier of the transaction for the accepted transfer. */
            fun transactionId(transactionId: String) = transactionId(JsonField.of(transactionId))

            /**
             * Sets [Builder.transactionId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.transactionId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun transactionId(transactionId: JsonField<String>) = apply {
                this.transactionId = transactionId
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
             * Returns an immutable instance of [Acceptance].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .acceptedAt()
             * .transactionId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Acceptance =
                Acceptance(
                    checkRequired("acceptedAt", acceptedAt),
                    checkRequired("transactionId", transactionId),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Acceptance = apply {
            if (validated) {
                return@apply
            }

            acceptedAt()
            transactionId()
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
        @JvmSynthetic
        internal fun validity(): Int =
            (if (acceptedAt.asKnown().isPresent) 1 else 0) +
                (if (transactionId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Acceptance &&
                acceptedAt == other.acceptedAt &&
                transactionId == other.transactionId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(acceptedAt, transactionId, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Acceptance{acceptedAt=$acceptedAt, transactionId=$transactionId, additionalProperties=$additionalProperties}"
    }

    /** If the transfer is reversed, this will contain details of the reversal. */
    class Reversal
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val reason: JsonField<Reason>,
        private val reversedAt: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("reason") @ExcludeMissing reason: JsonField<Reason> = JsonMissing.of(),
            @JsonProperty("reversed_at")
            @ExcludeMissing
            reversedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(reason, reversedAt, mutableMapOf())

        /**
         * The reason for the reversal.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun reason(): Reason = reason.getRequired("reason")

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
         * transfer was reversed.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun reversedAt(): OffsetDateTime = reversedAt.getRequired("reversed_at")

        /**
         * Returns the raw JSON value of [reason].
         *
         * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<Reason> = reason

        /**
         * Returns the raw JSON value of [reversedAt].
         *
         * Unlike [reversedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("reversed_at")
        @ExcludeMissing
        fun _reversedAt(): JsonField<OffsetDateTime> = reversedAt

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
             * Returns a mutable builder for constructing an instance of [Reversal].
             *
             * The following fields are required:
             * ```java
             * .reason()
             * .reversedAt()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Reversal]. */
        class Builder internal constructor() {

            private var reason: JsonField<Reason>? = null
            private var reversedAt: JsonField<OffsetDateTime>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(reversal: Reversal) = apply {
                reason = reversal.reason
                reversedAt = reversal.reversedAt
                additionalProperties = reversal.additionalProperties.toMutableMap()
            }

            /** The reason for the reversal. */
            fun reason(reason: Reason) = reason(JsonField.of(reason))

            /**
             * Sets [Builder.reason] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reason] with a well-typed [Reason] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun reason(reason: JsonField<Reason>) = apply { this.reason = reason }

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * transfer was reversed.
             */
            fun reversedAt(reversedAt: OffsetDateTime) = reversedAt(JsonField.of(reversedAt))

            /**
             * Sets [Builder.reversedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reversedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun reversedAt(reversedAt: JsonField<OffsetDateTime>) = apply {
                this.reversedAt = reversedAt
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
             * Returns an immutable instance of [Reversal].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .reason()
             * .reversedAt()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Reversal =
                Reversal(
                    checkRequired("reason", reason),
                    checkRequired("reversedAt", reversedAt),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Reversal = apply {
            if (validated) {
                return@apply
            }

            reason().validate()
            reversedAt()
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
        @JvmSynthetic
        internal fun validity(): Int =
            (reason.asKnown().getOrNull()?.validity() ?: 0) +
                (if (reversedAt.asKnown().isPresent) 1 else 0)

        /** The reason for the reversal. */
        class Reason @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                /** The inbound wire transfer was a duplicate. */
                @JvmField val DUPLICATE = of("duplicate")

                /**
                 * The recipient of the wire transfer requested the funds be returned to the sender.
                 */
                @JvmField val CREDITOR_REQUEST = of("creditor_request")

                /** The account cannot currently receive inbound wires. */
                @JvmField val TRANSACTION_FORBIDDEN = of("transaction_forbidden")

                @JvmStatic fun of(value: String) = Reason(JsonField.of(value))
            }

            /** An enum containing [Reason]'s known values. */
            enum class Known {
                /** The inbound wire transfer was a duplicate. */
                DUPLICATE,
                /**
                 * The recipient of the wire transfer requested the funds be returned to the sender.
                 */
                CREDITOR_REQUEST,
                /** The account cannot currently receive inbound wires. */
                TRANSACTION_FORBIDDEN,
            }

            /**
             * An enum containing [Reason]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Reason] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                /** The inbound wire transfer was a duplicate. */
                DUPLICATE,
                /**
                 * The recipient of the wire transfer requested the funds be returned to the sender.
                 */
                CREDITOR_REQUEST,
                /** The account cannot currently receive inbound wires. */
                TRANSACTION_FORBIDDEN,
                /**
                 * An enum member indicating that [Reason] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    DUPLICATE -> Value.DUPLICATE
                    CREDITOR_REQUEST -> Value.CREDITOR_REQUEST
                    TRANSACTION_FORBIDDEN -> Value.TRANSACTION_FORBIDDEN
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws IncreaseInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    DUPLICATE -> Known.DUPLICATE
                    CREDITOR_REQUEST -> Known.CREDITOR_REQUEST
                    TRANSACTION_FORBIDDEN -> Known.TRANSACTION_FORBIDDEN
                    else -> throw IncreaseInvalidDataException("Unknown Reason: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws IncreaseInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    IncreaseInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): Reason = apply {
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

                return other is Reason && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Reversal &&
                reason == other.reason &&
                reversedAt == other.reversedAt &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(reason, reversedAt, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Reversal{reason=$reason, reversedAt=$reversedAt, additionalProperties=$additionalProperties}"
    }

    /** The status of the transfer. */
    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            /**
             * The Inbound Wire Transfer is awaiting action, will transition automatically if no
             * action is taken.
             */
            @JvmField val PENDING = of("pending")

            /** The Inbound Wire Transfer is accepted. */
            @JvmField val ACCEPTED = of("accepted")

            /** The Inbound Wire Transfer was declined. */
            @JvmField val DECLINED = of("declined")

            /** The Inbound Wire Transfer was reversed. */
            @JvmField val REVERSED = of("reversed")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            /**
             * The Inbound Wire Transfer is awaiting action, will transition automatically if no
             * action is taken.
             */
            PENDING,
            /** The Inbound Wire Transfer is accepted. */
            ACCEPTED,
            /** The Inbound Wire Transfer was declined. */
            DECLINED,
            /** The Inbound Wire Transfer was reversed. */
            REVERSED,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            /**
             * The Inbound Wire Transfer is awaiting action, will transition automatically if no
             * action is taken.
             */
            PENDING,
            /** The Inbound Wire Transfer is accepted. */
            ACCEPTED,
            /** The Inbound Wire Transfer was declined. */
            DECLINED,
            /** The Inbound Wire Transfer was reversed. */
            REVERSED,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
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
                PENDING -> Value.PENDING
                ACCEPTED -> Value.ACCEPTED
                DECLINED -> Value.DECLINED
                REVERSED -> Value.REVERSED
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
                PENDING -> Known.PENDING
                ACCEPTED -> Known.ACCEPTED
                DECLINED -> Known.DECLINED
                REVERSED -> Known.REVERSED
                else -> throw IncreaseInvalidDataException("Unknown Status: $value")
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

        fun validate(): Status = apply {
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

            return other is Status && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * A constant representing the object's type. For this resource it will always be
     * `inbound_wire_transfer`.
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

            @JvmField val INBOUND_WIRE_TRANSFER = of("inbound_wire_transfer")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            INBOUND_WIRE_TRANSFER
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
            INBOUND_WIRE_TRANSFER,
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
                INBOUND_WIRE_TRANSFER -> Value.INBOUND_WIRE_TRANSFER
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
                INBOUND_WIRE_TRANSFER -> Known.INBOUND_WIRE_TRANSFER
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

        return other is InboundWireTransfer &&
            id == other.id &&
            acceptance == other.acceptance &&
            accountId == other.accountId &&
            accountNumberId == other.accountNumberId &&
            amount == other.amount &&
            createdAt == other.createdAt &&
            creditorAddressLine1 == other.creditorAddressLine1 &&
            creditorAddressLine2 == other.creditorAddressLine2 &&
            creditorAddressLine3 == other.creditorAddressLine3 &&
            creditorName == other.creditorName &&
            debtorAddressLine1 == other.debtorAddressLine1 &&
            debtorAddressLine2 == other.debtorAddressLine2 &&
            debtorAddressLine3 == other.debtorAddressLine3 &&
            debtorName == other.debtorName &&
            description == other.description &&
            endToEndIdentification == other.endToEndIdentification &&
            inputMessageAccountabilityData == other.inputMessageAccountabilityData &&
            instructingAgentRoutingNumber == other.instructingAgentRoutingNumber &&
            instructionIdentification == other.instructionIdentification &&
            reversal == other.reversal &&
            status == other.status &&
            type == other.type &&
            uniqueEndToEndTransactionReference == other.uniqueEndToEndTransactionReference &&
            unstructuredRemittanceInformation == other.unstructuredRemittanceInformation &&
            wireDrawdownRequestId == other.wireDrawdownRequestId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            acceptance,
            accountId,
            accountNumberId,
            amount,
            createdAt,
            creditorAddressLine1,
            creditorAddressLine2,
            creditorAddressLine3,
            creditorName,
            debtorAddressLine1,
            debtorAddressLine2,
            debtorAddressLine3,
            debtorName,
            description,
            endToEndIdentification,
            inputMessageAccountabilityData,
            instructingAgentRoutingNumber,
            instructionIdentification,
            reversal,
            status,
            type,
            uniqueEndToEndTransactionReference,
            unstructuredRemittanceInformation,
            wireDrawdownRequestId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InboundWireTransfer{id=$id, acceptance=$acceptance, accountId=$accountId, accountNumberId=$accountNumberId, amount=$amount, createdAt=$createdAt, creditorAddressLine1=$creditorAddressLine1, creditorAddressLine2=$creditorAddressLine2, creditorAddressLine3=$creditorAddressLine3, creditorName=$creditorName, debtorAddressLine1=$debtorAddressLine1, debtorAddressLine2=$debtorAddressLine2, debtorAddressLine3=$debtorAddressLine3, debtorName=$debtorName, description=$description, endToEndIdentification=$endToEndIdentification, inputMessageAccountabilityData=$inputMessageAccountabilityData, instructingAgentRoutingNumber=$instructingAgentRoutingNumber, instructionIdentification=$instructionIdentification, reversal=$reversal, status=$status, type=$type, uniqueEndToEndTransactionReference=$uniqueEndToEndTransactionReference, unstructuredRemittanceInformation=$unstructuredRemittanceInformation, wireDrawdownRequestId=$wireDrawdownRequestId, additionalProperties=$additionalProperties}"
}
