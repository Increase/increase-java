// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.inboundachtransfers

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.increase.api.core.Enum
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.checkKnown
import com.increase.api.core.checkRequired
import com.increase.api.core.toImmutable
import com.increase.api.errors.IncreaseInvalidDataException
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** An Inbound ACH Transfer is an ACH transfer initiated outside of Increase to your account. */
class InboundAchTransfer
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val acceptance: JsonField<Acceptance>,
    private val accountId: JsonField<String>,
    private val accountNumberId: JsonField<String>,
    private val addenda: JsonField<Addenda>,
    private val amount: JsonField<Long>,
    private val automaticallyResolvesAt: JsonField<OffsetDateTime>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val decline: JsonField<Decline>,
    private val direction: JsonField<Direction>,
    private val effectiveDate: JsonField<LocalDate>,
    private val internationalAddenda: JsonField<InternationalAddenda>,
    private val notificationOfChange: JsonField<NotificationOfChange>,
    private val originatorCompanyDescriptiveDate: JsonField<String>,
    private val originatorCompanyDiscretionaryData: JsonField<String>,
    private val originatorCompanyEntryDescription: JsonField<String>,
    private val originatorCompanyId: JsonField<String>,
    private val originatorCompanyName: JsonField<String>,
    private val originatorRoutingNumber: JsonField<String>,
    private val receiverIdNumber: JsonField<String>,
    private val receiverName: JsonField<String>,
    private val settlement: JsonField<Settlement>,
    private val standardEntryClassCode: JsonField<StandardEntryClassCode>,
    private val status: JsonField<Status>,
    private val traceNumber: JsonField<String>,
    private val transferReturn: JsonField<TransferReturn>,
    private val type: JsonField<Type>,
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
        @JsonProperty("addenda") @ExcludeMissing addenda: JsonField<Addenda> = JsonMissing.of(),
        @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("automatically_resolves_at")
        @ExcludeMissing
        automaticallyResolvesAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("decline") @ExcludeMissing decline: JsonField<Decline> = JsonMissing.of(),
        @JsonProperty("direction")
        @ExcludeMissing
        direction: JsonField<Direction> = JsonMissing.of(),
        @JsonProperty("effective_date")
        @ExcludeMissing
        effectiveDate: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("international_addenda")
        @ExcludeMissing
        internationalAddenda: JsonField<InternationalAddenda> = JsonMissing.of(),
        @JsonProperty("notification_of_change")
        @ExcludeMissing
        notificationOfChange: JsonField<NotificationOfChange> = JsonMissing.of(),
        @JsonProperty("originator_company_descriptive_date")
        @ExcludeMissing
        originatorCompanyDescriptiveDate: JsonField<String> = JsonMissing.of(),
        @JsonProperty("originator_company_discretionary_data")
        @ExcludeMissing
        originatorCompanyDiscretionaryData: JsonField<String> = JsonMissing.of(),
        @JsonProperty("originator_company_entry_description")
        @ExcludeMissing
        originatorCompanyEntryDescription: JsonField<String> = JsonMissing.of(),
        @JsonProperty("originator_company_id")
        @ExcludeMissing
        originatorCompanyId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("originator_company_name")
        @ExcludeMissing
        originatorCompanyName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("originator_routing_number")
        @ExcludeMissing
        originatorRoutingNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("receiver_id_number")
        @ExcludeMissing
        receiverIdNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("receiver_name")
        @ExcludeMissing
        receiverName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("settlement")
        @ExcludeMissing
        settlement: JsonField<Settlement> = JsonMissing.of(),
        @JsonProperty("standard_entry_class_code")
        @ExcludeMissing
        standardEntryClassCode: JsonField<StandardEntryClassCode> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("trace_number")
        @ExcludeMissing
        traceNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("transfer_return")
        @ExcludeMissing
        transferReturn: JsonField<TransferReturn> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
    ) : this(
        id,
        acceptance,
        accountId,
        accountNumberId,
        addenda,
        amount,
        automaticallyResolvesAt,
        createdAt,
        decline,
        direction,
        effectiveDate,
        internationalAddenda,
        notificationOfChange,
        originatorCompanyDescriptiveDate,
        originatorCompanyDiscretionaryData,
        originatorCompanyEntryDescription,
        originatorCompanyId,
        originatorCompanyName,
        originatorRoutingNumber,
        receiverIdNumber,
        receiverName,
        settlement,
        standardEntryClassCode,
        status,
        traceNumber,
        transferReturn,
        type,
        mutableMapOf(),
    )

    /**
     * The inbound ACH transfer's identifier.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * If your transfer is accepted, this will contain details of the acceptance.
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
     * Additional information sent from the originator.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun addenda(): Optional<Addenda> = addenda.getOptional("addenda")

    /**
     * The transfer amount in USD cents.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun amount(): Long = amount.getRequired("amount")

    /**
     * The time at which the transfer will be automatically resolved.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun automaticallyResolvesAt(): OffsetDateTime =
        automaticallyResolvesAt.getRequired("automatically_resolves_at")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the inbound ACH
     * transfer was created.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * If your transfer is declined, this will contain details of the decline.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun decline(): Optional<Decline> = decline.getOptional("decline")

    /**
     * The direction of the transfer.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun direction(): Direction = direction.getRequired("direction")

    /**
     * The effective date of the transfer. This is sent by the sending bank and is a factor in
     * determining funds availability.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun effectiveDate(): LocalDate = effectiveDate.getRequired("effective_date")

    /**
     * If the Inbound ACH Transfer has a Standard Entry Class Code of IAT, this will contain fields
     * pertaining to the International ACH Transaction.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun internationalAddenda(): Optional<InternationalAddenda> =
        internationalAddenda.getOptional("international_addenda")

    /**
     * If you initiate a notification of change in response to the transfer, this will contain its
     * details.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun notificationOfChange(): Optional<NotificationOfChange> =
        notificationOfChange.getOptional("notification_of_change")

    /**
     * The descriptive date of the transfer.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun originatorCompanyDescriptiveDate(): Optional<String> =
        originatorCompanyDescriptiveDate.getOptional("originator_company_descriptive_date")

    /**
     * The additional information included with the transfer.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun originatorCompanyDiscretionaryData(): Optional<String> =
        originatorCompanyDiscretionaryData.getOptional("originator_company_discretionary_data")

    /**
     * The description of the transfer.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun originatorCompanyEntryDescription(): String =
        originatorCompanyEntryDescription.getRequired("originator_company_entry_description")

    /**
     * The id of the company that initiated the transfer.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun originatorCompanyId(): String = originatorCompanyId.getRequired("originator_company_id")

    /**
     * The name of the company that initiated the transfer.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun originatorCompanyName(): String =
        originatorCompanyName.getRequired("originator_company_name")

    /**
     * The American Banking Association (ABA) routing number of the bank originating the transfer.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun originatorRoutingNumber(): String =
        originatorRoutingNumber.getRequired("originator_routing_number")

    /**
     * The id of the receiver of the transfer.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun receiverIdNumber(): Optional<String> = receiverIdNumber.getOptional("receiver_id_number")

    /**
     * The name of the receiver of the transfer.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun receiverName(): Optional<String> = receiverName.getOptional("receiver_name")

    /**
     * A subhash containing information about when and how the transfer settled at the Federal
     * Reserve.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun settlement(): Settlement = settlement.getRequired("settlement")

    /**
     * The Standard Entry Class (SEC) code of the transfer.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun standardEntryClassCode(): StandardEntryClassCode =
        standardEntryClassCode.getRequired("standard_entry_class_code")

    /**
     * The status of the transfer.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * A 15 digit number set by the sending bank and transmitted to the receiving bank. Along with
     * the amount, date, and originating routing number, this can be used to identify the ACH
     * transfer. ACH trace numbers are not unique, but are
     * [used to correlate returns](https://increase.com/documentation/ach-returns#ach-returns).
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun traceNumber(): String = traceNumber.getRequired("trace_number")

    /**
     * If your transfer is returned, this will contain details of the return.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun transferReturn(): Optional<TransferReturn> = transferReturn.getOptional("transfer_return")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `inbound_ach_transfer`.
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
     * Returns the raw JSON value of [addenda].
     *
     * Unlike [addenda], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("addenda") @ExcludeMissing fun _addenda(): JsonField<Addenda> = addenda

    /**
     * Returns the raw JSON value of [amount].
     *
     * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

    /**
     * Returns the raw JSON value of [automaticallyResolvesAt].
     *
     * Unlike [automaticallyResolvesAt], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("automatically_resolves_at")
    @ExcludeMissing
    fun _automaticallyResolvesAt(): JsonField<OffsetDateTime> = automaticallyResolvesAt

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [decline].
     *
     * Unlike [decline], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("decline") @ExcludeMissing fun _decline(): JsonField<Decline> = decline

    /**
     * Returns the raw JSON value of [direction].
     *
     * Unlike [direction], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("direction") @ExcludeMissing fun _direction(): JsonField<Direction> = direction

    /**
     * Returns the raw JSON value of [effectiveDate].
     *
     * Unlike [effectiveDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("effective_date")
    @ExcludeMissing
    fun _effectiveDate(): JsonField<LocalDate> = effectiveDate

    /**
     * Returns the raw JSON value of [internationalAddenda].
     *
     * Unlike [internationalAddenda], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("international_addenda")
    @ExcludeMissing
    fun _internationalAddenda(): JsonField<InternationalAddenda> = internationalAddenda

    /**
     * Returns the raw JSON value of [notificationOfChange].
     *
     * Unlike [notificationOfChange], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("notification_of_change")
    @ExcludeMissing
    fun _notificationOfChange(): JsonField<NotificationOfChange> = notificationOfChange

    /**
     * Returns the raw JSON value of [originatorCompanyDescriptiveDate].
     *
     * Unlike [originatorCompanyDescriptiveDate], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("originator_company_descriptive_date")
    @ExcludeMissing
    fun _originatorCompanyDescriptiveDate(): JsonField<String> = originatorCompanyDescriptiveDate

    /**
     * Returns the raw JSON value of [originatorCompanyDiscretionaryData].
     *
     * Unlike [originatorCompanyDiscretionaryData], this method doesn't throw if the JSON field has
     * an unexpected type.
     */
    @JsonProperty("originator_company_discretionary_data")
    @ExcludeMissing
    fun _originatorCompanyDiscretionaryData(): JsonField<String> =
        originatorCompanyDiscretionaryData

    /**
     * Returns the raw JSON value of [originatorCompanyEntryDescription].
     *
     * Unlike [originatorCompanyEntryDescription], this method doesn't throw if the JSON field has
     * an unexpected type.
     */
    @JsonProperty("originator_company_entry_description")
    @ExcludeMissing
    fun _originatorCompanyEntryDescription(): JsonField<String> = originatorCompanyEntryDescription

    /**
     * Returns the raw JSON value of [originatorCompanyId].
     *
     * Unlike [originatorCompanyId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("originator_company_id")
    @ExcludeMissing
    fun _originatorCompanyId(): JsonField<String> = originatorCompanyId

    /**
     * Returns the raw JSON value of [originatorCompanyName].
     *
     * Unlike [originatorCompanyName], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("originator_company_name")
    @ExcludeMissing
    fun _originatorCompanyName(): JsonField<String> = originatorCompanyName

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
     * Returns the raw JSON value of [receiverIdNumber].
     *
     * Unlike [receiverIdNumber], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("receiver_id_number")
    @ExcludeMissing
    fun _receiverIdNumber(): JsonField<String> = receiverIdNumber

    /**
     * Returns the raw JSON value of [receiverName].
     *
     * Unlike [receiverName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("receiver_name")
    @ExcludeMissing
    fun _receiverName(): JsonField<String> = receiverName

    /**
     * Returns the raw JSON value of [settlement].
     *
     * Unlike [settlement], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("settlement")
    @ExcludeMissing
    fun _settlement(): JsonField<Settlement> = settlement

    /**
     * Returns the raw JSON value of [standardEntryClassCode].
     *
     * Unlike [standardEntryClassCode], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("standard_entry_class_code")
    @ExcludeMissing
    fun _standardEntryClassCode(): JsonField<StandardEntryClassCode> = standardEntryClassCode

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [traceNumber].
     *
     * Unlike [traceNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("trace_number")
    @ExcludeMissing
    fun _traceNumber(): JsonField<String> = traceNumber

    /**
     * Returns the raw JSON value of [transferReturn].
     *
     * Unlike [transferReturn], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("transfer_return")
    @ExcludeMissing
    fun _transferReturn(): JsonField<TransferReturn> = transferReturn

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
         * Returns a mutable builder for constructing an instance of [InboundAchTransfer].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .acceptance()
         * .accountId()
         * .accountNumberId()
         * .addenda()
         * .amount()
         * .automaticallyResolvesAt()
         * .createdAt()
         * .decline()
         * .direction()
         * .effectiveDate()
         * .internationalAddenda()
         * .notificationOfChange()
         * .originatorCompanyDescriptiveDate()
         * .originatorCompanyDiscretionaryData()
         * .originatorCompanyEntryDescription()
         * .originatorCompanyId()
         * .originatorCompanyName()
         * .originatorRoutingNumber()
         * .receiverIdNumber()
         * .receiverName()
         * .settlement()
         * .standardEntryClassCode()
         * .status()
         * .traceNumber()
         * .transferReturn()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InboundAchTransfer]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var acceptance: JsonField<Acceptance>? = null
        private var accountId: JsonField<String>? = null
        private var accountNumberId: JsonField<String>? = null
        private var addenda: JsonField<Addenda>? = null
        private var amount: JsonField<Long>? = null
        private var automaticallyResolvesAt: JsonField<OffsetDateTime>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var decline: JsonField<Decline>? = null
        private var direction: JsonField<Direction>? = null
        private var effectiveDate: JsonField<LocalDate>? = null
        private var internationalAddenda: JsonField<InternationalAddenda>? = null
        private var notificationOfChange: JsonField<NotificationOfChange>? = null
        private var originatorCompanyDescriptiveDate: JsonField<String>? = null
        private var originatorCompanyDiscretionaryData: JsonField<String>? = null
        private var originatorCompanyEntryDescription: JsonField<String>? = null
        private var originatorCompanyId: JsonField<String>? = null
        private var originatorCompanyName: JsonField<String>? = null
        private var originatorRoutingNumber: JsonField<String>? = null
        private var receiverIdNumber: JsonField<String>? = null
        private var receiverName: JsonField<String>? = null
        private var settlement: JsonField<Settlement>? = null
        private var standardEntryClassCode: JsonField<StandardEntryClassCode>? = null
        private var status: JsonField<Status>? = null
        private var traceNumber: JsonField<String>? = null
        private var transferReturn: JsonField<TransferReturn>? = null
        private var type: JsonField<Type>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(inboundAchTransfer: InboundAchTransfer) = apply {
            id = inboundAchTransfer.id
            acceptance = inboundAchTransfer.acceptance
            accountId = inboundAchTransfer.accountId
            accountNumberId = inboundAchTransfer.accountNumberId
            addenda = inboundAchTransfer.addenda
            amount = inboundAchTransfer.amount
            automaticallyResolvesAt = inboundAchTransfer.automaticallyResolvesAt
            createdAt = inboundAchTransfer.createdAt
            decline = inboundAchTransfer.decline
            direction = inboundAchTransfer.direction
            effectiveDate = inboundAchTransfer.effectiveDate
            internationalAddenda = inboundAchTransfer.internationalAddenda
            notificationOfChange = inboundAchTransfer.notificationOfChange
            originatorCompanyDescriptiveDate = inboundAchTransfer.originatorCompanyDescriptiveDate
            originatorCompanyDiscretionaryData =
                inboundAchTransfer.originatorCompanyDiscretionaryData
            originatorCompanyEntryDescription = inboundAchTransfer.originatorCompanyEntryDescription
            originatorCompanyId = inboundAchTransfer.originatorCompanyId
            originatorCompanyName = inboundAchTransfer.originatorCompanyName
            originatorRoutingNumber = inboundAchTransfer.originatorRoutingNumber
            receiverIdNumber = inboundAchTransfer.receiverIdNumber
            receiverName = inboundAchTransfer.receiverName
            settlement = inboundAchTransfer.settlement
            standardEntryClassCode = inboundAchTransfer.standardEntryClassCode
            status = inboundAchTransfer.status
            traceNumber = inboundAchTransfer.traceNumber
            transferReturn = inboundAchTransfer.transferReturn
            type = inboundAchTransfer.type
            additionalProperties = inboundAchTransfer.additionalProperties.toMutableMap()
        }

        /** The inbound ACH transfer's identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** If your transfer is accepted, this will contain details of the acceptance. */
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

        /** Additional information sent from the originator. */
        fun addenda(addenda: Addenda?) = addenda(JsonField.ofNullable(addenda))

        /** Alias for calling [Builder.addenda] with `addenda.orElse(null)`. */
        fun addenda(addenda: Optional<Addenda>) = addenda(addenda.getOrNull())

        /**
         * Sets [Builder.addenda] to an arbitrary JSON value.
         *
         * You should usually call [Builder.addenda] with a well-typed [Addenda] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun addenda(addenda: JsonField<Addenda>) = apply { this.addenda = addenda }

        /** The transfer amount in USD cents. */
        fun amount(amount: Long) = amount(JsonField.of(amount))

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

        /** The time at which the transfer will be automatically resolved. */
        fun automaticallyResolvesAt(automaticallyResolvesAt: OffsetDateTime) =
            automaticallyResolvesAt(JsonField.of(automaticallyResolvesAt))

        /**
         * Sets [Builder.automaticallyResolvesAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.automaticallyResolvesAt] with a well-typed
         * [OffsetDateTime] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun automaticallyResolvesAt(automaticallyResolvesAt: JsonField<OffsetDateTime>) = apply {
            this.automaticallyResolvesAt = automaticallyResolvesAt
        }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the inbound
         * ACH transfer was created.
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

        /** If your transfer is declined, this will contain details of the decline. */
        fun decline(decline: Decline?) = decline(JsonField.ofNullable(decline))

        /** Alias for calling [Builder.decline] with `decline.orElse(null)`. */
        fun decline(decline: Optional<Decline>) = decline(decline.getOrNull())

        /**
         * Sets [Builder.decline] to an arbitrary JSON value.
         *
         * You should usually call [Builder.decline] with a well-typed [Decline] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun decline(decline: JsonField<Decline>) = apply { this.decline = decline }

        /** The direction of the transfer. */
        fun direction(direction: Direction) = direction(JsonField.of(direction))

        /**
         * Sets [Builder.direction] to an arbitrary JSON value.
         *
         * You should usually call [Builder.direction] with a well-typed [Direction] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun direction(direction: JsonField<Direction>) = apply { this.direction = direction }

        /**
         * The effective date of the transfer. This is sent by the sending bank and is a factor in
         * determining funds availability.
         */
        fun effectiveDate(effectiveDate: LocalDate) = effectiveDate(JsonField.of(effectiveDate))

        /**
         * Sets [Builder.effectiveDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.effectiveDate] with a well-typed [LocalDate] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun effectiveDate(effectiveDate: JsonField<LocalDate>) = apply {
            this.effectiveDate = effectiveDate
        }

        /**
         * If the Inbound ACH Transfer has a Standard Entry Class Code of IAT, this will contain
         * fields pertaining to the International ACH Transaction.
         */
        fun internationalAddenda(internationalAddenda: InternationalAddenda?) =
            internationalAddenda(JsonField.ofNullable(internationalAddenda))

        /**
         * Alias for calling [Builder.internationalAddenda] with
         * `internationalAddenda.orElse(null)`.
         */
        fun internationalAddenda(internationalAddenda: Optional<InternationalAddenda>) =
            internationalAddenda(internationalAddenda.getOrNull())

        /**
         * Sets [Builder.internationalAddenda] to an arbitrary JSON value.
         *
         * You should usually call [Builder.internationalAddenda] with a well-typed
         * [InternationalAddenda] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun internationalAddenda(internationalAddenda: JsonField<InternationalAddenda>) = apply {
            this.internationalAddenda = internationalAddenda
        }

        /**
         * If you initiate a notification of change in response to the transfer, this will contain
         * its details.
         */
        fun notificationOfChange(notificationOfChange: NotificationOfChange?) =
            notificationOfChange(JsonField.ofNullable(notificationOfChange))

        /**
         * Alias for calling [Builder.notificationOfChange] with
         * `notificationOfChange.orElse(null)`.
         */
        fun notificationOfChange(notificationOfChange: Optional<NotificationOfChange>) =
            notificationOfChange(notificationOfChange.getOrNull())

        /**
         * Sets [Builder.notificationOfChange] to an arbitrary JSON value.
         *
         * You should usually call [Builder.notificationOfChange] with a well-typed
         * [NotificationOfChange] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun notificationOfChange(notificationOfChange: JsonField<NotificationOfChange>) = apply {
            this.notificationOfChange = notificationOfChange
        }

        /** The descriptive date of the transfer. */
        fun originatorCompanyDescriptiveDate(originatorCompanyDescriptiveDate: String?) =
            originatorCompanyDescriptiveDate(JsonField.ofNullable(originatorCompanyDescriptiveDate))

        /**
         * Alias for calling [Builder.originatorCompanyDescriptiveDate] with
         * `originatorCompanyDescriptiveDate.orElse(null)`.
         */
        fun originatorCompanyDescriptiveDate(originatorCompanyDescriptiveDate: Optional<String>) =
            originatorCompanyDescriptiveDate(originatorCompanyDescriptiveDate.getOrNull())

        /**
         * Sets [Builder.originatorCompanyDescriptiveDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.originatorCompanyDescriptiveDate] with a well-typed
         * [String] value instead. This method is primarily for setting the field to an undocumented
         * or not yet supported value.
         */
        fun originatorCompanyDescriptiveDate(originatorCompanyDescriptiveDate: JsonField<String>) =
            apply {
                this.originatorCompanyDescriptiveDate = originatorCompanyDescriptiveDate
            }

        /** The additional information included with the transfer. */
        fun originatorCompanyDiscretionaryData(originatorCompanyDiscretionaryData: String?) =
            originatorCompanyDiscretionaryData(
                JsonField.ofNullable(originatorCompanyDiscretionaryData)
            )

        /**
         * Alias for calling [Builder.originatorCompanyDiscretionaryData] with
         * `originatorCompanyDiscretionaryData.orElse(null)`.
         */
        fun originatorCompanyDiscretionaryData(
            originatorCompanyDiscretionaryData: Optional<String>
        ) = originatorCompanyDiscretionaryData(originatorCompanyDiscretionaryData.getOrNull())

        /**
         * Sets [Builder.originatorCompanyDiscretionaryData] to an arbitrary JSON value.
         *
         * You should usually call [Builder.originatorCompanyDiscretionaryData] with a well-typed
         * [String] value instead. This method is primarily for setting the field to an undocumented
         * or not yet supported value.
         */
        fun originatorCompanyDiscretionaryData(
            originatorCompanyDiscretionaryData: JsonField<String>
        ) = apply { this.originatorCompanyDiscretionaryData = originatorCompanyDiscretionaryData }

        /** The description of the transfer. */
        fun originatorCompanyEntryDescription(originatorCompanyEntryDescription: String) =
            originatorCompanyEntryDescription(JsonField.of(originatorCompanyEntryDescription))

        /**
         * Sets [Builder.originatorCompanyEntryDescription] to an arbitrary JSON value.
         *
         * You should usually call [Builder.originatorCompanyEntryDescription] with a well-typed
         * [String] value instead. This method is primarily for setting the field to an undocumented
         * or not yet supported value.
         */
        fun originatorCompanyEntryDescription(
            originatorCompanyEntryDescription: JsonField<String>
        ) = apply { this.originatorCompanyEntryDescription = originatorCompanyEntryDescription }

        /** The id of the company that initiated the transfer. */
        fun originatorCompanyId(originatorCompanyId: String) =
            originatorCompanyId(JsonField.of(originatorCompanyId))

        /**
         * Sets [Builder.originatorCompanyId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.originatorCompanyId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun originatorCompanyId(originatorCompanyId: JsonField<String>) = apply {
            this.originatorCompanyId = originatorCompanyId
        }

        /** The name of the company that initiated the transfer. */
        fun originatorCompanyName(originatorCompanyName: String) =
            originatorCompanyName(JsonField.of(originatorCompanyName))

        /**
         * Sets [Builder.originatorCompanyName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.originatorCompanyName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun originatorCompanyName(originatorCompanyName: JsonField<String>) = apply {
            this.originatorCompanyName = originatorCompanyName
        }

        /**
         * The American Banking Association (ABA) routing number of the bank originating the
         * transfer.
         */
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

        /** The id of the receiver of the transfer. */
        fun receiverIdNumber(receiverIdNumber: String?) =
            receiverIdNumber(JsonField.ofNullable(receiverIdNumber))

        /** Alias for calling [Builder.receiverIdNumber] with `receiverIdNumber.orElse(null)`. */
        fun receiverIdNumber(receiverIdNumber: Optional<String>) =
            receiverIdNumber(receiverIdNumber.getOrNull())

        /**
         * Sets [Builder.receiverIdNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.receiverIdNumber] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun receiverIdNumber(receiverIdNumber: JsonField<String>) = apply {
            this.receiverIdNumber = receiverIdNumber
        }

        /** The name of the receiver of the transfer. */
        fun receiverName(receiverName: String?) = receiverName(JsonField.ofNullable(receiverName))

        /** Alias for calling [Builder.receiverName] with `receiverName.orElse(null)`. */
        fun receiverName(receiverName: Optional<String>) = receiverName(receiverName.getOrNull())

        /**
         * Sets [Builder.receiverName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.receiverName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun receiverName(receiverName: JsonField<String>) = apply {
            this.receiverName = receiverName
        }

        /**
         * A subhash containing information about when and how the transfer settled at the Federal
         * Reserve.
         */
        fun settlement(settlement: Settlement) = settlement(JsonField.of(settlement))

        /**
         * Sets [Builder.settlement] to an arbitrary JSON value.
         *
         * You should usually call [Builder.settlement] with a well-typed [Settlement] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun settlement(settlement: JsonField<Settlement>) = apply { this.settlement = settlement }

        /** The Standard Entry Class (SEC) code of the transfer. */
        fun standardEntryClassCode(standardEntryClassCode: StandardEntryClassCode) =
            standardEntryClassCode(JsonField.of(standardEntryClassCode))

        /**
         * Sets [Builder.standardEntryClassCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.standardEntryClassCode] with a well-typed
         * [StandardEntryClassCode] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun standardEntryClassCode(standardEntryClassCode: JsonField<StandardEntryClassCode>) =
            apply {
                this.standardEntryClassCode = standardEntryClassCode
            }

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
         * A 15 digit number set by the sending bank and transmitted to the receiving bank. Along
         * with the amount, date, and originating routing number, this can be used to identify the
         * ACH transfer. ACH trace numbers are not unique, but are
         * [used to correlate returns](https://increase.com/documentation/ach-returns#ach-returns).
         */
        fun traceNumber(traceNumber: String) = traceNumber(JsonField.of(traceNumber))

        /**
         * Sets [Builder.traceNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.traceNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun traceNumber(traceNumber: JsonField<String>) = apply { this.traceNumber = traceNumber }

        /** If your transfer is returned, this will contain details of the return. */
        fun transferReturn(transferReturn: TransferReturn?) =
            transferReturn(JsonField.ofNullable(transferReturn))

        /** Alias for calling [Builder.transferReturn] with `transferReturn.orElse(null)`. */
        fun transferReturn(transferReturn: Optional<TransferReturn>) =
            transferReturn(transferReturn.getOrNull())

        /**
         * Sets [Builder.transferReturn] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transferReturn] with a well-typed [TransferReturn] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun transferReturn(transferReturn: JsonField<TransferReturn>) = apply {
            this.transferReturn = transferReturn
        }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `inbound_ach_transfer`.
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
         * Returns an immutable instance of [InboundAchTransfer].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .acceptance()
         * .accountId()
         * .accountNumberId()
         * .addenda()
         * .amount()
         * .automaticallyResolvesAt()
         * .createdAt()
         * .decline()
         * .direction()
         * .effectiveDate()
         * .internationalAddenda()
         * .notificationOfChange()
         * .originatorCompanyDescriptiveDate()
         * .originatorCompanyDiscretionaryData()
         * .originatorCompanyEntryDescription()
         * .originatorCompanyId()
         * .originatorCompanyName()
         * .originatorRoutingNumber()
         * .receiverIdNumber()
         * .receiverName()
         * .settlement()
         * .standardEntryClassCode()
         * .status()
         * .traceNumber()
         * .transferReturn()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): InboundAchTransfer =
            InboundAchTransfer(
                checkRequired("id", id),
                checkRequired("acceptance", acceptance),
                checkRequired("accountId", accountId),
                checkRequired("accountNumberId", accountNumberId),
                checkRequired("addenda", addenda),
                checkRequired("amount", amount),
                checkRequired("automaticallyResolvesAt", automaticallyResolvesAt),
                checkRequired("createdAt", createdAt),
                checkRequired("decline", decline),
                checkRequired("direction", direction),
                checkRequired("effectiveDate", effectiveDate),
                checkRequired("internationalAddenda", internationalAddenda),
                checkRequired("notificationOfChange", notificationOfChange),
                checkRequired("originatorCompanyDescriptiveDate", originatorCompanyDescriptiveDate),
                checkRequired(
                    "originatorCompanyDiscretionaryData",
                    originatorCompanyDiscretionaryData,
                ),
                checkRequired(
                    "originatorCompanyEntryDescription",
                    originatorCompanyEntryDescription,
                ),
                checkRequired("originatorCompanyId", originatorCompanyId),
                checkRequired("originatorCompanyName", originatorCompanyName),
                checkRequired("originatorRoutingNumber", originatorRoutingNumber),
                checkRequired("receiverIdNumber", receiverIdNumber),
                checkRequired("receiverName", receiverName),
                checkRequired("settlement", settlement),
                checkRequired("standardEntryClassCode", standardEntryClassCode),
                checkRequired("status", status),
                checkRequired("traceNumber", traceNumber),
                checkRequired("transferReturn", transferReturn),
                checkRequired("type", type),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): InboundAchTransfer = apply {
        if (validated) {
            return@apply
        }

        id()
        acceptance().ifPresent { it.validate() }
        accountId()
        accountNumberId()
        addenda().ifPresent { it.validate() }
        amount()
        automaticallyResolvesAt()
        createdAt()
        decline().ifPresent { it.validate() }
        direction().validate()
        effectiveDate()
        internationalAddenda().ifPresent { it.validate() }
        notificationOfChange().ifPresent { it.validate() }
        originatorCompanyDescriptiveDate()
        originatorCompanyDiscretionaryData()
        originatorCompanyEntryDescription()
        originatorCompanyId()
        originatorCompanyName()
        originatorRoutingNumber()
        receiverIdNumber()
        receiverName()
        settlement().validate()
        standardEntryClassCode().validate()
        status().validate()
        traceNumber()
        transferReturn().ifPresent { it.validate() }
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
            (acceptance.asKnown().getOrNull()?.validity() ?: 0) +
            (if (accountId.asKnown().isPresent) 1 else 0) +
            (if (accountNumberId.asKnown().isPresent) 1 else 0) +
            (addenda.asKnown().getOrNull()?.validity() ?: 0) +
            (if (amount.asKnown().isPresent) 1 else 0) +
            (if (automaticallyResolvesAt.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (decline.asKnown().getOrNull()?.validity() ?: 0) +
            (direction.asKnown().getOrNull()?.validity() ?: 0) +
            (if (effectiveDate.asKnown().isPresent) 1 else 0) +
            (internationalAddenda.asKnown().getOrNull()?.validity() ?: 0) +
            (notificationOfChange.asKnown().getOrNull()?.validity() ?: 0) +
            (if (originatorCompanyDescriptiveDate.asKnown().isPresent) 1 else 0) +
            (if (originatorCompanyDiscretionaryData.asKnown().isPresent) 1 else 0) +
            (if (originatorCompanyEntryDescription.asKnown().isPresent) 1 else 0) +
            (if (originatorCompanyId.asKnown().isPresent) 1 else 0) +
            (if (originatorCompanyName.asKnown().isPresent) 1 else 0) +
            (if (originatorRoutingNumber.asKnown().isPresent) 1 else 0) +
            (if (receiverIdNumber.asKnown().isPresent) 1 else 0) +
            (if (receiverName.asKnown().isPresent) 1 else 0) +
            (settlement.asKnown().getOrNull()?.validity() ?: 0) +
            (standardEntryClassCode.asKnown().getOrNull()?.validity() ?: 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (traceNumber.asKnown().isPresent) 1 else 0) +
            (transferReturn.asKnown().getOrNull()?.validity() ?: 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0)

    /** If your transfer is accepted, this will contain details of the acceptance. */
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
         * The time at which the transfer was accepted.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun acceptedAt(): OffsetDateTime = acceptedAt.getRequired("accepted_at")

        /**
         * The id of the transaction for the accepted transfer.
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

            /** The time at which the transfer was accepted. */
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

            /** The id of the transaction for the accepted transfer. */
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

    /** Additional information sent from the originator. */
    class Addenda
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val category: JsonField<Category>,
        private val freeform: JsonField<Freeform>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("category")
            @ExcludeMissing
            category: JsonField<Category> = JsonMissing.of(),
            @JsonProperty("freeform")
            @ExcludeMissing
            freeform: JsonField<Freeform> = JsonMissing.of(),
        ) : this(category, freeform, mutableMapOf())

        /**
         * The type of addendum.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun category(): Category = category.getRequired("category")

        /**
         * Unstructured `payment_related_information` passed through by the originator.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun freeform(): Optional<Freeform> = freeform.getOptional("freeform")

        /**
         * Returns the raw JSON value of [category].
         *
         * Unlike [category], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("category") @ExcludeMissing fun _category(): JsonField<Category> = category

        /**
         * Returns the raw JSON value of [freeform].
         *
         * Unlike [freeform], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("freeform") @ExcludeMissing fun _freeform(): JsonField<Freeform> = freeform

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
             * Returns a mutable builder for constructing an instance of [Addenda].
             *
             * The following fields are required:
             * ```java
             * .category()
             * .freeform()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Addenda]. */
        class Builder internal constructor() {

            private var category: JsonField<Category>? = null
            private var freeform: JsonField<Freeform>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(addenda: Addenda) = apply {
                category = addenda.category
                freeform = addenda.freeform
                additionalProperties = addenda.additionalProperties.toMutableMap()
            }

            /** The type of addendum. */
            fun category(category: Category) = category(JsonField.of(category))

            /**
             * Sets [Builder.category] to an arbitrary JSON value.
             *
             * You should usually call [Builder.category] with a well-typed [Category] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun category(category: JsonField<Category>) = apply { this.category = category }

            /** Unstructured `payment_related_information` passed through by the originator. */
            fun freeform(freeform: Freeform?) = freeform(JsonField.ofNullable(freeform))

            /** Alias for calling [Builder.freeform] with `freeform.orElse(null)`. */
            fun freeform(freeform: Optional<Freeform>) = freeform(freeform.getOrNull())

            /**
             * Sets [Builder.freeform] to an arbitrary JSON value.
             *
             * You should usually call [Builder.freeform] with a well-typed [Freeform] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun freeform(freeform: JsonField<Freeform>) = apply { this.freeform = freeform }

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
             * Returns an immutable instance of [Addenda].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .category()
             * .freeform()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Addenda =
                Addenda(
                    checkRequired("category", category),
                    checkRequired("freeform", freeform),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Addenda = apply {
            if (validated) {
                return@apply
            }

            category().validate()
            freeform().ifPresent { it.validate() }
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
            (category.asKnown().getOrNull()?.validity() ?: 0) +
                (freeform.asKnown().getOrNull()?.validity() ?: 0)

        /** The type of addendum. */
        class Category @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

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

                /** Unstructured addendum. */
                @JvmField val FREEFORM = of("freeform")

                @JvmStatic fun of(value: String) = Category(JsonField.of(value))
            }

            /** An enum containing [Category]'s known values. */
            enum class Known {
                /** Unstructured addendum. */
                FREEFORM
            }

            /**
             * An enum containing [Category]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Category] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                /** Unstructured addendum. */
                FREEFORM,
                /**
                 * An enum member indicating that [Category] was instantiated with an unknown value.
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
                    FREEFORM -> Value.FREEFORM
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
                    FREEFORM -> Known.FREEFORM
                    else -> throw IncreaseInvalidDataException("Unknown Category: $value")
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

            fun validate(): Category = apply {
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

                return other is Category && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Unstructured `payment_related_information` passed through by the originator. */
        class Freeform
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val entries: JsonField<List<Entry>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("entries")
                @ExcludeMissing
                entries: JsonField<List<Entry>> = JsonMissing.of()
            ) : this(entries, mutableMapOf())

            /**
             * Each entry represents an addendum received from the originator.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun entries(): List<Entry> = entries.getRequired("entries")

            /**
             * Returns the raw JSON value of [entries].
             *
             * Unlike [entries], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("entries")
            @ExcludeMissing
            fun _entries(): JsonField<List<Entry>> = entries

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
                 * Returns a mutable builder for constructing an instance of [Freeform].
                 *
                 * The following fields are required:
                 * ```java
                 * .entries()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Freeform]. */
            class Builder internal constructor() {

                private var entries: JsonField<MutableList<Entry>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(freeform: Freeform) = apply {
                    entries = freeform.entries.map { it.toMutableList() }
                    additionalProperties = freeform.additionalProperties.toMutableMap()
                }

                /** Each entry represents an addendum received from the originator. */
                fun entries(entries: List<Entry>) = entries(JsonField.of(entries))

                /**
                 * Sets [Builder.entries] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.entries] with a well-typed `List<Entry>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun entries(entries: JsonField<List<Entry>>) = apply {
                    this.entries = entries.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Entry] to [entries].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addEntry(entry: Entry) = apply {
                    entries =
                        (entries ?: JsonField.of(mutableListOf())).also {
                            checkKnown("entries", it).add(entry)
                        }
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Freeform].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .entries()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Freeform =
                    Freeform(
                        checkRequired("entries", entries).map { it.toImmutable() },
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Freeform = apply {
                if (validated) {
                    return@apply
                }

                entries().forEach { it.validate() }
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
                (entries.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

            class Entry
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val paymentRelatedInformation: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("payment_related_information")
                    @ExcludeMissing
                    paymentRelatedInformation: JsonField<String> = JsonMissing.of()
                ) : this(paymentRelatedInformation, mutableMapOf())

                /**
                 * The payment related information passed in the addendum.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun paymentRelatedInformation(): String =
                    paymentRelatedInformation.getRequired("payment_related_information")

                /**
                 * Returns the raw JSON value of [paymentRelatedInformation].
                 *
                 * Unlike [paymentRelatedInformation], this method doesn't throw if the JSON field
                 * has an unexpected type.
                 */
                @JsonProperty("payment_related_information")
                @ExcludeMissing
                fun _paymentRelatedInformation(): JsonField<String> = paymentRelatedInformation

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
                     * Returns a mutable builder for constructing an instance of [Entry].
                     *
                     * The following fields are required:
                     * ```java
                     * .paymentRelatedInformation()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Entry]. */
                class Builder internal constructor() {

                    private var paymentRelatedInformation: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(entry: Entry) = apply {
                        paymentRelatedInformation = entry.paymentRelatedInformation
                        additionalProperties = entry.additionalProperties.toMutableMap()
                    }

                    /** The payment related information passed in the addendum. */
                    fun paymentRelatedInformation(paymentRelatedInformation: String) =
                        paymentRelatedInformation(JsonField.of(paymentRelatedInformation))

                    /**
                     * Sets [Builder.paymentRelatedInformation] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.paymentRelatedInformation] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun paymentRelatedInformation(paymentRelatedInformation: JsonField<String>) =
                        apply {
                            this.paymentRelatedInformation = paymentRelatedInformation
                        }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [Entry].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .paymentRelatedInformation()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Entry =
                        Entry(
                            checkRequired("paymentRelatedInformation", paymentRelatedInformation),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Entry = apply {
                    if (validated) {
                        return@apply
                    }

                    paymentRelatedInformation()
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
                    (if (paymentRelatedInformation.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Entry &&
                        paymentRelatedInformation == other.paymentRelatedInformation &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(paymentRelatedInformation, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Entry{paymentRelatedInformation=$paymentRelatedInformation, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Freeform &&
                    entries == other.entries &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(entries, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Freeform{entries=$entries, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Addenda &&
                category == other.category &&
                freeform == other.freeform &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(category, freeform, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Addenda{category=$category, freeform=$freeform, additionalProperties=$additionalProperties}"
    }

    /** If your transfer is declined, this will contain details of the decline. */
    class Decline
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val declinedAt: JsonField<OffsetDateTime>,
        private val declinedTransactionId: JsonField<String>,
        private val reason: JsonField<Reason>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("declined_at")
            @ExcludeMissing
            declinedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("declined_transaction_id")
            @ExcludeMissing
            declinedTransactionId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("reason") @ExcludeMissing reason: JsonField<Reason> = JsonMissing.of(),
        ) : this(declinedAt, declinedTransactionId, reason, mutableMapOf())

        /**
         * The time at which the transfer was declined.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun declinedAt(): OffsetDateTime = declinedAt.getRequired("declined_at")

        /**
         * The id of the transaction for the declined transfer.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun declinedTransactionId(): String =
            declinedTransactionId.getRequired("declined_transaction_id")

        /**
         * The reason for the transfer decline.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun reason(): Reason = reason.getRequired("reason")

        /**
         * Returns the raw JSON value of [declinedAt].
         *
         * Unlike [declinedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("declined_at")
        @ExcludeMissing
        fun _declinedAt(): JsonField<OffsetDateTime> = declinedAt

        /**
         * Returns the raw JSON value of [declinedTransactionId].
         *
         * Unlike [declinedTransactionId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("declined_transaction_id")
        @ExcludeMissing
        fun _declinedTransactionId(): JsonField<String> = declinedTransactionId

        /**
         * Returns the raw JSON value of [reason].
         *
         * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<Reason> = reason

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
             * Returns a mutable builder for constructing an instance of [Decline].
             *
             * The following fields are required:
             * ```java
             * .declinedAt()
             * .declinedTransactionId()
             * .reason()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Decline]. */
        class Builder internal constructor() {

            private var declinedAt: JsonField<OffsetDateTime>? = null
            private var declinedTransactionId: JsonField<String>? = null
            private var reason: JsonField<Reason>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(decline: Decline) = apply {
                declinedAt = decline.declinedAt
                declinedTransactionId = decline.declinedTransactionId
                reason = decline.reason
                additionalProperties = decline.additionalProperties.toMutableMap()
            }

            /** The time at which the transfer was declined. */
            fun declinedAt(declinedAt: OffsetDateTime) = declinedAt(JsonField.of(declinedAt))

            /**
             * Sets [Builder.declinedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.declinedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun declinedAt(declinedAt: JsonField<OffsetDateTime>) = apply {
                this.declinedAt = declinedAt
            }

            /** The id of the transaction for the declined transfer. */
            fun declinedTransactionId(declinedTransactionId: String) =
                declinedTransactionId(JsonField.of(declinedTransactionId))

            /**
             * Sets [Builder.declinedTransactionId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.declinedTransactionId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun declinedTransactionId(declinedTransactionId: JsonField<String>) = apply {
                this.declinedTransactionId = declinedTransactionId
            }

            /** The reason for the transfer decline. */
            fun reason(reason: Reason) = reason(JsonField.of(reason))

            /**
             * Sets [Builder.reason] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reason] with a well-typed [Reason] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun reason(reason: JsonField<Reason>) = apply { this.reason = reason }

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
             * Returns an immutable instance of [Decline].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .declinedAt()
             * .declinedTransactionId()
             * .reason()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Decline =
                Decline(
                    checkRequired("declinedAt", declinedAt),
                    checkRequired("declinedTransactionId", declinedTransactionId),
                    checkRequired("reason", reason),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Decline = apply {
            if (validated) {
                return@apply
            }

            declinedAt()
            declinedTransactionId()
            reason().validate()
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
            (if (declinedAt.asKnown().isPresent) 1 else 0) +
                (if (declinedTransactionId.asKnown().isPresent) 1 else 0) +
                (reason.asKnown().getOrNull()?.validity() ?: 0)

        /** The reason for the transfer decline. */
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

                /** The account number is canceled. */
                @JvmField val ACH_ROUTE_CANCELED = of("ach_route_canceled")

                /** The account number is disabled. */
                @JvmField val ACH_ROUTE_DISABLED = of("ach_route_disabled")

                /** The transaction would cause an Increase limit to be exceeded. */
                @JvmField val BREACHES_LIMIT = of("breaches_limit")

                /** The account's entity is not active. */
                @JvmField val ENTITY_NOT_ACTIVE = of("entity_not_active")

                /** Your account is inactive. */
                @JvmField val GROUP_LOCKED = of("group_locked")

                /** The transaction is not allowed per Increase's terms. */
                @JvmField val TRANSACTION_NOT_ALLOWED = of("transaction_not_allowed")

                /** Your integration declined this transfer via the API. */
                @JvmField val USER_INITIATED = of("user_initiated")

                /** Your account contains insufficient funds. */
                @JvmField val INSUFFICIENT_FUNDS = of("insufficient_funds")

                /**
                 * The originating financial institution asked for this transfer to be returned. The
                 * receiving bank is complying with the request.
                 */
                @JvmField val RETURNED_PER_ODFI_REQUEST = of("returned_per_odfi_request")

                /** The customer no longer authorizes this transaction. */
                @JvmField
                val AUTHORIZATION_REVOKED_BY_CUSTOMER = of("authorization_revoked_by_customer")

                /** The customer asked for the payment to be stopped. */
                @JvmField val PAYMENT_STOPPED = of("payment_stopped")

                /** The customer advises that the debit was unauthorized. */
                @JvmField
                val CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE =
                    of("customer_advised_unauthorized_improper_ineligible_or_incomplete")

                /** The payee is deceased. */
                @JvmField
                val REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY =
                    of("representative_payee_deceased_or_unable_to_continue_in_that_capacity")

                /** The account holder is deceased. */
                @JvmField
                val BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED =
                    of("beneficiary_or_account_holder_deceased")

                /** The customer refused a credit entry. */
                @JvmField
                val CREDIT_ENTRY_REFUSED_BY_RECEIVER = of("credit_entry_refused_by_receiver")

                /** The account holder identified this transaction as a duplicate. */
                @JvmField val DUPLICATE_ENTRY = of("duplicate_entry")

                /** The corporate customer no longer authorizes this transaction. */
                @JvmField
                val CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED =
                    of("corporate_customer_advised_not_authorized")

                @JvmStatic fun of(value: String) = Reason(JsonField.of(value))
            }

            /** An enum containing [Reason]'s known values. */
            enum class Known {
                /** The account number is canceled. */
                ACH_ROUTE_CANCELED,
                /** The account number is disabled. */
                ACH_ROUTE_DISABLED,
                /** The transaction would cause an Increase limit to be exceeded. */
                BREACHES_LIMIT,
                /** The account's entity is not active. */
                ENTITY_NOT_ACTIVE,
                /** Your account is inactive. */
                GROUP_LOCKED,
                /** The transaction is not allowed per Increase's terms. */
                TRANSACTION_NOT_ALLOWED,
                /** Your integration declined this transfer via the API. */
                USER_INITIATED,
                /** Your account contains insufficient funds. */
                INSUFFICIENT_FUNDS,
                /**
                 * The originating financial institution asked for this transfer to be returned. The
                 * receiving bank is complying with the request.
                 */
                RETURNED_PER_ODFI_REQUEST,
                /** The customer no longer authorizes this transaction. */
                AUTHORIZATION_REVOKED_BY_CUSTOMER,
                /** The customer asked for the payment to be stopped. */
                PAYMENT_STOPPED,
                /** The customer advises that the debit was unauthorized. */
                CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE,
                /** The payee is deceased. */
                REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY,
                /** The account holder is deceased. */
                BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED,
                /** The customer refused a credit entry. */
                CREDIT_ENTRY_REFUSED_BY_RECEIVER,
                /** The account holder identified this transaction as a duplicate. */
                DUPLICATE_ENTRY,
                /** The corporate customer no longer authorizes this transaction. */
                CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED,
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
                /** The account number is canceled. */
                ACH_ROUTE_CANCELED,
                /** The account number is disabled. */
                ACH_ROUTE_DISABLED,
                /** The transaction would cause an Increase limit to be exceeded. */
                BREACHES_LIMIT,
                /** The account's entity is not active. */
                ENTITY_NOT_ACTIVE,
                /** Your account is inactive. */
                GROUP_LOCKED,
                /** The transaction is not allowed per Increase's terms. */
                TRANSACTION_NOT_ALLOWED,
                /** Your integration declined this transfer via the API. */
                USER_INITIATED,
                /** Your account contains insufficient funds. */
                INSUFFICIENT_FUNDS,
                /**
                 * The originating financial institution asked for this transfer to be returned. The
                 * receiving bank is complying with the request.
                 */
                RETURNED_PER_ODFI_REQUEST,
                /** The customer no longer authorizes this transaction. */
                AUTHORIZATION_REVOKED_BY_CUSTOMER,
                /** The customer asked for the payment to be stopped. */
                PAYMENT_STOPPED,
                /** The customer advises that the debit was unauthorized. */
                CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE,
                /** The payee is deceased. */
                REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY,
                /** The account holder is deceased. */
                BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED,
                /** The customer refused a credit entry. */
                CREDIT_ENTRY_REFUSED_BY_RECEIVER,
                /** The account holder identified this transaction as a duplicate. */
                DUPLICATE_ENTRY,
                /** The corporate customer no longer authorizes this transaction. */
                CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED,
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
                    ACH_ROUTE_CANCELED -> Value.ACH_ROUTE_CANCELED
                    ACH_ROUTE_DISABLED -> Value.ACH_ROUTE_DISABLED
                    BREACHES_LIMIT -> Value.BREACHES_LIMIT
                    ENTITY_NOT_ACTIVE -> Value.ENTITY_NOT_ACTIVE
                    GROUP_LOCKED -> Value.GROUP_LOCKED
                    TRANSACTION_NOT_ALLOWED -> Value.TRANSACTION_NOT_ALLOWED
                    USER_INITIATED -> Value.USER_INITIATED
                    INSUFFICIENT_FUNDS -> Value.INSUFFICIENT_FUNDS
                    RETURNED_PER_ODFI_REQUEST -> Value.RETURNED_PER_ODFI_REQUEST
                    AUTHORIZATION_REVOKED_BY_CUSTOMER -> Value.AUTHORIZATION_REVOKED_BY_CUSTOMER
                    PAYMENT_STOPPED -> Value.PAYMENT_STOPPED
                    CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE ->
                        Value.CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE
                    REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY ->
                        Value.REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY
                    BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED ->
                        Value.BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED
                    CREDIT_ENTRY_REFUSED_BY_RECEIVER -> Value.CREDIT_ENTRY_REFUSED_BY_RECEIVER
                    DUPLICATE_ENTRY -> Value.DUPLICATE_ENTRY
                    CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED ->
                        Value.CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED
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
                    ACH_ROUTE_CANCELED -> Known.ACH_ROUTE_CANCELED
                    ACH_ROUTE_DISABLED -> Known.ACH_ROUTE_DISABLED
                    BREACHES_LIMIT -> Known.BREACHES_LIMIT
                    ENTITY_NOT_ACTIVE -> Known.ENTITY_NOT_ACTIVE
                    GROUP_LOCKED -> Known.GROUP_LOCKED
                    TRANSACTION_NOT_ALLOWED -> Known.TRANSACTION_NOT_ALLOWED
                    USER_INITIATED -> Known.USER_INITIATED
                    INSUFFICIENT_FUNDS -> Known.INSUFFICIENT_FUNDS
                    RETURNED_PER_ODFI_REQUEST -> Known.RETURNED_PER_ODFI_REQUEST
                    AUTHORIZATION_REVOKED_BY_CUSTOMER -> Known.AUTHORIZATION_REVOKED_BY_CUSTOMER
                    PAYMENT_STOPPED -> Known.PAYMENT_STOPPED
                    CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE ->
                        Known.CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE
                    REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY ->
                        Known.REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY
                    BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED ->
                        Known.BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED
                    CREDIT_ENTRY_REFUSED_BY_RECEIVER -> Known.CREDIT_ENTRY_REFUSED_BY_RECEIVER
                    DUPLICATE_ENTRY -> Known.DUPLICATE_ENTRY
                    CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED ->
                        Known.CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED
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

            return other is Decline &&
                declinedAt == other.declinedAt &&
                declinedTransactionId == other.declinedTransactionId &&
                reason == other.reason &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(declinedAt, declinedTransactionId, reason, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Decline{declinedAt=$declinedAt, declinedTransactionId=$declinedTransactionId, reason=$reason, additionalProperties=$additionalProperties}"
    }

    /** The direction of the transfer. */
    class Direction @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            /** Credit */
            @JvmField val CREDIT = of("credit")

            /** Debit */
            @JvmField val DEBIT = of("debit")

            @JvmStatic fun of(value: String) = Direction(JsonField.of(value))
        }

        /** An enum containing [Direction]'s known values. */
        enum class Known {
            /** Credit */
            CREDIT,
            /** Debit */
            DEBIT,
        }

        /**
         * An enum containing [Direction]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Direction] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            /** Credit */
            CREDIT,
            /** Debit */
            DEBIT,
            /**
             * An enum member indicating that [Direction] was instantiated with an unknown value.
             */
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
                CREDIT -> Value.CREDIT
                DEBIT -> Value.DEBIT
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
                CREDIT -> Known.CREDIT
                DEBIT -> Known.DEBIT
                else -> throw IncreaseInvalidDataException("Unknown Direction: $value")
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

        fun validate(): Direction = apply {
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

            return other is Direction && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * If the Inbound ACH Transfer has a Standard Entry Class Code of IAT, this will contain fields
     * pertaining to the International ACH Transaction.
     */
    class InternationalAddenda
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
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
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("destination_country_code")
            @ExcludeMissing
            destinationCountryCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("destination_currency_code")
            @ExcludeMissing
            destinationCurrencyCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("foreign_exchange_indicator")
            @ExcludeMissing
            foreignExchangeIndicator: JsonField<ForeignExchangeIndicator> = JsonMissing.of(),
            @JsonProperty("foreign_exchange_reference")
            @ExcludeMissing
            foreignExchangeReference: JsonField<String> = JsonMissing.of(),
            @JsonProperty("foreign_exchange_reference_indicator")
            @ExcludeMissing
            foreignExchangeReferenceIndicator: JsonField<ForeignExchangeReferenceIndicator> =
                JsonMissing.of(),
            @JsonProperty("foreign_payment_amount")
            @ExcludeMissing
            foreignPaymentAmount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("foreign_trace_number")
            @ExcludeMissing
            foreignTraceNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("international_transaction_type_code")
            @ExcludeMissing
            internationalTransactionTypeCode: JsonField<InternationalTransactionTypeCode> =
                JsonMissing.of(),
            @JsonProperty("originating_currency_code")
            @ExcludeMissing
            originatingCurrencyCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("originating_depository_financial_institution_branch_country")
            @ExcludeMissing
            originatingDepositoryFinancialInstitutionBranchCountry: JsonField<String> =
                JsonMissing.of(),
            @JsonProperty("originating_depository_financial_institution_id")
            @ExcludeMissing
            originatingDepositoryFinancialInstitutionId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("originating_depository_financial_institution_id_qualifier")
            @ExcludeMissing
            originatingDepositoryFinancialInstitutionIdQualifier:
                JsonField<OriginatingDepositoryFinancialInstitutionIdQualifier> =
                JsonMissing.of(),
            @JsonProperty("originating_depository_financial_institution_name")
            @ExcludeMissing
            originatingDepositoryFinancialInstitutionName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("originator_city")
            @ExcludeMissing
            originatorCity: JsonField<String> = JsonMissing.of(),
            @JsonProperty("originator_country")
            @ExcludeMissing
            originatorCountry: JsonField<String> = JsonMissing.of(),
            @JsonProperty("originator_identification")
            @ExcludeMissing
            originatorIdentification: JsonField<String> = JsonMissing.of(),
            @JsonProperty("originator_name")
            @ExcludeMissing
            originatorName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("originator_postal_code")
            @ExcludeMissing
            originatorPostalCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("originator_state_or_province")
            @ExcludeMissing
            originatorStateOrProvince: JsonField<String> = JsonMissing.of(),
            @JsonProperty("originator_street_address")
            @ExcludeMissing
            originatorStreetAddress: JsonField<String> = JsonMissing.of(),
            @JsonProperty("payment_related_information")
            @ExcludeMissing
            paymentRelatedInformation: JsonField<String> = JsonMissing.of(),
            @JsonProperty("payment_related_information2")
            @ExcludeMissing
            paymentRelatedInformation2: JsonField<String> = JsonMissing.of(),
            @JsonProperty("receiver_city")
            @ExcludeMissing
            receiverCity: JsonField<String> = JsonMissing.of(),
            @JsonProperty("receiver_country")
            @ExcludeMissing
            receiverCountry: JsonField<String> = JsonMissing.of(),
            @JsonProperty("receiver_identification_number")
            @ExcludeMissing
            receiverIdentificationNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("receiver_postal_code")
            @ExcludeMissing
            receiverPostalCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("receiver_state_or_province")
            @ExcludeMissing
            receiverStateOrProvince: JsonField<String> = JsonMissing.of(),
            @JsonProperty("receiver_street_address")
            @ExcludeMissing
            receiverStreetAddress: JsonField<String> = JsonMissing.of(),
            @JsonProperty("receiving_company_or_individual_name")
            @ExcludeMissing
            receivingCompanyOrIndividualName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("receiving_depository_financial_institution_country")
            @ExcludeMissing
            receivingDepositoryFinancialInstitutionCountry: JsonField<String> = JsonMissing.of(),
            @JsonProperty("receiving_depository_financial_institution_id")
            @ExcludeMissing
            receivingDepositoryFinancialInstitutionId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("receiving_depository_financial_institution_id_qualifier")
            @ExcludeMissing
            receivingDepositoryFinancialInstitutionIdQualifier:
                JsonField<ReceivingDepositoryFinancialInstitutionIdQualifier> =
                JsonMissing.of(),
            @JsonProperty("receiving_depository_financial_institution_name")
            @ExcludeMissing
            receivingDepositoryFinancialInstitutionName: JsonField<String> = JsonMissing.of(),
        ) : this(
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
            mutableMapOf(),
        )

        /**
         * The [ISO 3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), Alpha-2 country code of
         * the destination country.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun destinationCountryCode(): String =
            destinationCountryCode.getRequired("destination_country_code")

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code for the destination
         * bank account.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun destinationCurrencyCode(): String =
            destinationCurrencyCode.getRequired("destination_currency_code")

        /**
         * A description of how the foreign exchange rate was calculated.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun foreignExchangeIndicator(): ForeignExchangeIndicator =
            foreignExchangeIndicator.getRequired("foreign_exchange_indicator")

        /**
         * Depending on the `foreign_exchange_reference_indicator`, an exchange rate or a reference
         * to a well-known rate.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun foreignExchangeReference(): Optional<String> =
            foreignExchangeReference.getOptional("foreign_exchange_reference")

        /**
         * An instruction of how to interpret the `foreign_exchange_reference` field for this
         * Transaction.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun foreignExchangeReferenceIndicator(): ForeignExchangeReferenceIndicator =
            foreignExchangeReferenceIndicator.getRequired("foreign_exchange_reference_indicator")

        /**
         * The amount in the minor unit of the foreign payment currency. For dollars, for example,
         * this is cents.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun foreignPaymentAmount(): Long =
            foreignPaymentAmount.getRequired("foreign_payment_amount")

        /**
         * A reference number in the foreign banking infrastructure.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun foreignTraceNumber(): Optional<String> =
            foreignTraceNumber.getOptional("foreign_trace_number")

        /**
         * The type of transfer. Set by the originator.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun internationalTransactionTypeCode(): InternationalTransactionTypeCode =
            internationalTransactionTypeCode.getRequired("international_transaction_type_code")

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code for the originating
         * bank account.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun originatingCurrencyCode(): String =
            originatingCurrencyCode.getRequired("originating_currency_code")

        /**
         * The [ISO 3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), Alpha-2 country code of
         * the originating branch country.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun originatingDepositoryFinancialInstitutionBranchCountry(): String =
            originatingDepositoryFinancialInstitutionBranchCountry.getRequired(
                "originating_depository_financial_institution_branch_country"
            )

        /**
         * An identifier for the originating bank. One of an International Bank Account Number
         * (IBAN) bank identifier, SWIFT Bank Identification Code (BIC), or a domestic identifier
         * like a US Routing Number.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun originatingDepositoryFinancialInstitutionId(): String =
            originatingDepositoryFinancialInstitutionId.getRequired(
                "originating_depository_financial_institution_id"
            )

        /**
         * An instruction of how to interpret the `originating_depository_financial_institution_id`
         * field for this Transaction.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun originatingDepositoryFinancialInstitutionIdQualifier():
            OriginatingDepositoryFinancialInstitutionIdQualifier =
            originatingDepositoryFinancialInstitutionIdQualifier.getRequired(
                "originating_depository_financial_institution_id_qualifier"
            )

        /**
         * The name of the originating bank. Sometimes this will refer to an American bank and
         * obscure the correspondent foreign bank.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun originatingDepositoryFinancialInstitutionName(): String =
            originatingDepositoryFinancialInstitutionName.getRequired(
                "originating_depository_financial_institution_name"
            )

        /**
         * A portion of the originator address. This may be incomplete.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun originatorCity(): String = originatorCity.getRequired("originator_city")

        /**
         * A portion of the originator address. The
         * [ISO 3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), Alpha-2 country code of the
         * originator country.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun originatorCountry(): String = originatorCountry.getRequired("originator_country")

        /**
         * An identifier for the originating company. This is generally stable across multiple ACH
         * transfers.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun originatorIdentification(): String =
            originatorIdentification.getRequired("originator_identification")

        /**
         * Either the name of the originator or an intermediary money transmitter.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun originatorName(): String = originatorName.getRequired("originator_name")

        /**
         * A portion of the originator address. This may be incomplete.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun originatorPostalCode(): Optional<String> =
            originatorPostalCode.getOptional("originator_postal_code")

        /**
         * A portion of the originator address. This may be incomplete.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun originatorStateOrProvince(): Optional<String> =
            originatorStateOrProvince.getOptional("originator_state_or_province")

        /**
         * A portion of the originator address. This may be incomplete.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun originatorStreetAddress(): String =
            originatorStreetAddress.getRequired("originator_street_address")

        /**
         * A description field set by the originator.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun paymentRelatedInformation(): Optional<String> =
            paymentRelatedInformation.getOptional("payment_related_information")

        /**
         * A description field set by the originator.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun paymentRelatedInformation2(): Optional<String> =
            paymentRelatedInformation2.getOptional("payment_related_information2")

        /**
         * A portion of the receiver address. This may be incomplete.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun receiverCity(): String = receiverCity.getRequired("receiver_city")

        /**
         * A portion of the receiver address. The
         * [ISO 3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), Alpha-2 country code of the
         * receiver country.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun receiverCountry(): String = receiverCountry.getRequired("receiver_country")

        /**
         * An identification number the originator uses for the receiver.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun receiverIdentificationNumber(): Optional<String> =
            receiverIdentificationNumber.getOptional("receiver_identification_number")

        /**
         * A portion of the receiver address. This may be incomplete.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun receiverPostalCode(): Optional<String> =
            receiverPostalCode.getOptional("receiver_postal_code")

        /**
         * A portion of the receiver address. This may be incomplete.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun receiverStateOrProvince(): Optional<String> =
            receiverStateOrProvince.getOptional("receiver_state_or_province")

        /**
         * A portion of the receiver address. This may be incomplete.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun receiverStreetAddress(): String =
            receiverStreetAddress.getRequired("receiver_street_address")

        /**
         * The name of the receiver of the transfer. This is not verified by Increase.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun receivingCompanyOrIndividualName(): String =
            receivingCompanyOrIndividualName.getRequired("receiving_company_or_individual_name")

        /**
         * The [ISO 3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), Alpha-2 country code of
         * the receiving bank country.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun receivingDepositoryFinancialInstitutionCountry(): String =
            receivingDepositoryFinancialInstitutionCountry.getRequired(
                "receiving_depository_financial_institution_country"
            )

        /**
         * An identifier for the receiving bank. One of an International Bank Account Number (IBAN)
         * bank identifier, SWIFT Bank Identification Code (BIC), or a domestic identifier like a US
         * Routing Number.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun receivingDepositoryFinancialInstitutionId(): String =
            receivingDepositoryFinancialInstitutionId.getRequired(
                "receiving_depository_financial_institution_id"
            )

        /**
         * An instruction of how to interpret the `receiving_depository_financial_institution_id`
         * field for this Transaction.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun receivingDepositoryFinancialInstitutionIdQualifier():
            ReceivingDepositoryFinancialInstitutionIdQualifier =
            receivingDepositoryFinancialInstitutionIdQualifier.getRequired(
                "receiving_depository_financial_institution_id_qualifier"
            )

        /**
         * The name of the receiving bank, as set by the sending financial institution.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun receivingDepositoryFinancialInstitutionName(): String =
            receivingDepositoryFinancialInstitutionName.getRequired(
                "receiving_depository_financial_institution_name"
            )

        /**
         * Returns the raw JSON value of [destinationCountryCode].
         *
         * Unlike [destinationCountryCode], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("destination_country_code")
        @ExcludeMissing
        fun _destinationCountryCode(): JsonField<String> = destinationCountryCode

        /**
         * Returns the raw JSON value of [destinationCurrencyCode].
         *
         * Unlike [destinationCurrencyCode], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("destination_currency_code")
        @ExcludeMissing
        fun _destinationCurrencyCode(): JsonField<String> = destinationCurrencyCode

        /**
         * Returns the raw JSON value of [foreignExchangeIndicator].
         *
         * Unlike [foreignExchangeIndicator], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("foreign_exchange_indicator")
        @ExcludeMissing
        fun _foreignExchangeIndicator(): JsonField<ForeignExchangeIndicator> =
            foreignExchangeIndicator

        /**
         * Returns the raw JSON value of [foreignExchangeReference].
         *
         * Unlike [foreignExchangeReference], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("foreign_exchange_reference")
        @ExcludeMissing
        fun _foreignExchangeReference(): JsonField<String> = foreignExchangeReference

        /**
         * Returns the raw JSON value of [foreignExchangeReferenceIndicator].
         *
         * Unlike [foreignExchangeReferenceIndicator], this method doesn't throw if the JSON field
         * has an unexpected type.
         */
        @JsonProperty("foreign_exchange_reference_indicator")
        @ExcludeMissing
        fun _foreignExchangeReferenceIndicator(): JsonField<ForeignExchangeReferenceIndicator> =
            foreignExchangeReferenceIndicator

        /**
         * Returns the raw JSON value of [foreignPaymentAmount].
         *
         * Unlike [foreignPaymentAmount], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("foreign_payment_amount")
        @ExcludeMissing
        fun _foreignPaymentAmount(): JsonField<Long> = foreignPaymentAmount

        /**
         * Returns the raw JSON value of [foreignTraceNumber].
         *
         * Unlike [foreignTraceNumber], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("foreign_trace_number")
        @ExcludeMissing
        fun _foreignTraceNumber(): JsonField<String> = foreignTraceNumber

        /**
         * Returns the raw JSON value of [internationalTransactionTypeCode].
         *
         * Unlike [internationalTransactionTypeCode], this method doesn't throw if the JSON field
         * has an unexpected type.
         */
        @JsonProperty("international_transaction_type_code")
        @ExcludeMissing
        fun _internationalTransactionTypeCode(): JsonField<InternationalTransactionTypeCode> =
            internationalTransactionTypeCode

        /**
         * Returns the raw JSON value of [originatingCurrencyCode].
         *
         * Unlike [originatingCurrencyCode], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("originating_currency_code")
        @ExcludeMissing
        fun _originatingCurrencyCode(): JsonField<String> = originatingCurrencyCode

        /**
         * Returns the raw JSON value of [originatingDepositoryFinancialInstitutionBranchCountry].
         *
         * Unlike [originatingDepositoryFinancialInstitutionBranchCountry], this method doesn't
         * throw if the JSON field has an unexpected type.
         */
        @JsonProperty("originating_depository_financial_institution_branch_country")
        @ExcludeMissing
        fun _originatingDepositoryFinancialInstitutionBranchCountry(): JsonField<String> =
            originatingDepositoryFinancialInstitutionBranchCountry

        /**
         * Returns the raw JSON value of [originatingDepositoryFinancialInstitutionId].
         *
         * Unlike [originatingDepositoryFinancialInstitutionId], this method doesn't throw if the
         * JSON field has an unexpected type.
         */
        @JsonProperty("originating_depository_financial_institution_id")
        @ExcludeMissing
        fun _originatingDepositoryFinancialInstitutionId(): JsonField<String> =
            originatingDepositoryFinancialInstitutionId

        /**
         * Returns the raw JSON value of [originatingDepositoryFinancialInstitutionIdQualifier].
         *
         * Unlike [originatingDepositoryFinancialInstitutionIdQualifier], this method doesn't throw
         * if the JSON field has an unexpected type.
         */
        @JsonProperty("originating_depository_financial_institution_id_qualifier")
        @ExcludeMissing
        fun _originatingDepositoryFinancialInstitutionIdQualifier():
            JsonField<OriginatingDepositoryFinancialInstitutionIdQualifier> =
            originatingDepositoryFinancialInstitutionIdQualifier

        /**
         * Returns the raw JSON value of [originatingDepositoryFinancialInstitutionName].
         *
         * Unlike [originatingDepositoryFinancialInstitutionName], this method doesn't throw if the
         * JSON field has an unexpected type.
         */
        @JsonProperty("originating_depository_financial_institution_name")
        @ExcludeMissing
        fun _originatingDepositoryFinancialInstitutionName(): JsonField<String> =
            originatingDepositoryFinancialInstitutionName

        /**
         * Returns the raw JSON value of [originatorCity].
         *
         * Unlike [originatorCity], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("originator_city")
        @ExcludeMissing
        fun _originatorCity(): JsonField<String> = originatorCity

        /**
         * Returns the raw JSON value of [originatorCountry].
         *
         * Unlike [originatorCountry], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("originator_country")
        @ExcludeMissing
        fun _originatorCountry(): JsonField<String> = originatorCountry

        /**
         * Returns the raw JSON value of [originatorIdentification].
         *
         * Unlike [originatorIdentification], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("originator_identification")
        @ExcludeMissing
        fun _originatorIdentification(): JsonField<String> = originatorIdentification

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
         * Returns the raw JSON value of [originatorPostalCode].
         *
         * Unlike [originatorPostalCode], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("originator_postal_code")
        @ExcludeMissing
        fun _originatorPostalCode(): JsonField<String> = originatorPostalCode

        /**
         * Returns the raw JSON value of [originatorStateOrProvince].
         *
         * Unlike [originatorStateOrProvince], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("originator_state_or_province")
        @ExcludeMissing
        fun _originatorStateOrProvince(): JsonField<String> = originatorStateOrProvince

        /**
         * Returns the raw JSON value of [originatorStreetAddress].
         *
         * Unlike [originatorStreetAddress], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("originator_street_address")
        @ExcludeMissing
        fun _originatorStreetAddress(): JsonField<String> = originatorStreetAddress

        /**
         * Returns the raw JSON value of [paymentRelatedInformation].
         *
         * Unlike [paymentRelatedInformation], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("payment_related_information")
        @ExcludeMissing
        fun _paymentRelatedInformation(): JsonField<String> = paymentRelatedInformation

        /**
         * Returns the raw JSON value of [paymentRelatedInformation2].
         *
         * Unlike [paymentRelatedInformation2], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("payment_related_information2")
        @ExcludeMissing
        fun _paymentRelatedInformation2(): JsonField<String> = paymentRelatedInformation2

        /**
         * Returns the raw JSON value of [receiverCity].
         *
         * Unlike [receiverCity], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("receiver_city")
        @ExcludeMissing
        fun _receiverCity(): JsonField<String> = receiverCity

        /**
         * Returns the raw JSON value of [receiverCountry].
         *
         * Unlike [receiverCountry], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("receiver_country")
        @ExcludeMissing
        fun _receiverCountry(): JsonField<String> = receiverCountry

        /**
         * Returns the raw JSON value of [receiverIdentificationNumber].
         *
         * Unlike [receiverIdentificationNumber], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("receiver_identification_number")
        @ExcludeMissing
        fun _receiverIdentificationNumber(): JsonField<String> = receiverIdentificationNumber

        /**
         * Returns the raw JSON value of [receiverPostalCode].
         *
         * Unlike [receiverPostalCode], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("receiver_postal_code")
        @ExcludeMissing
        fun _receiverPostalCode(): JsonField<String> = receiverPostalCode

        /**
         * Returns the raw JSON value of [receiverStateOrProvince].
         *
         * Unlike [receiverStateOrProvince], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("receiver_state_or_province")
        @ExcludeMissing
        fun _receiverStateOrProvince(): JsonField<String> = receiverStateOrProvince

        /**
         * Returns the raw JSON value of [receiverStreetAddress].
         *
         * Unlike [receiverStreetAddress], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("receiver_street_address")
        @ExcludeMissing
        fun _receiverStreetAddress(): JsonField<String> = receiverStreetAddress

        /**
         * Returns the raw JSON value of [receivingCompanyOrIndividualName].
         *
         * Unlike [receivingCompanyOrIndividualName], this method doesn't throw if the JSON field
         * has an unexpected type.
         */
        @JsonProperty("receiving_company_or_individual_name")
        @ExcludeMissing
        fun _receivingCompanyOrIndividualName(): JsonField<String> =
            receivingCompanyOrIndividualName

        /**
         * Returns the raw JSON value of [receivingDepositoryFinancialInstitutionCountry].
         *
         * Unlike [receivingDepositoryFinancialInstitutionCountry], this method doesn't throw if the
         * JSON field has an unexpected type.
         */
        @JsonProperty("receiving_depository_financial_institution_country")
        @ExcludeMissing
        fun _receivingDepositoryFinancialInstitutionCountry(): JsonField<String> =
            receivingDepositoryFinancialInstitutionCountry

        /**
         * Returns the raw JSON value of [receivingDepositoryFinancialInstitutionId].
         *
         * Unlike [receivingDepositoryFinancialInstitutionId], this method doesn't throw if the JSON
         * field has an unexpected type.
         */
        @JsonProperty("receiving_depository_financial_institution_id")
        @ExcludeMissing
        fun _receivingDepositoryFinancialInstitutionId(): JsonField<String> =
            receivingDepositoryFinancialInstitutionId

        /**
         * Returns the raw JSON value of [receivingDepositoryFinancialInstitutionIdQualifier].
         *
         * Unlike [receivingDepositoryFinancialInstitutionIdQualifier], this method doesn't throw if
         * the JSON field has an unexpected type.
         */
        @JsonProperty("receiving_depository_financial_institution_id_qualifier")
        @ExcludeMissing
        fun _receivingDepositoryFinancialInstitutionIdQualifier():
            JsonField<ReceivingDepositoryFinancialInstitutionIdQualifier> =
            receivingDepositoryFinancialInstitutionIdQualifier

        /**
         * Returns the raw JSON value of [receivingDepositoryFinancialInstitutionName].
         *
         * Unlike [receivingDepositoryFinancialInstitutionName], this method doesn't throw if the
         * JSON field has an unexpected type.
         */
        @JsonProperty("receiving_depository_financial_institution_name")
        @ExcludeMissing
        fun _receivingDepositoryFinancialInstitutionName(): JsonField<String> =
            receivingDepositoryFinancialInstitutionName

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
             * Returns a mutable builder for constructing an instance of [InternationalAddenda].
             *
             * The following fields are required:
             * ```java
             * .destinationCountryCode()
             * .destinationCurrencyCode()
             * .foreignExchangeIndicator()
             * .foreignExchangeReference()
             * .foreignExchangeReferenceIndicator()
             * .foreignPaymentAmount()
             * .foreignTraceNumber()
             * .internationalTransactionTypeCode()
             * .originatingCurrencyCode()
             * .originatingDepositoryFinancialInstitutionBranchCountry()
             * .originatingDepositoryFinancialInstitutionId()
             * .originatingDepositoryFinancialInstitutionIdQualifier()
             * .originatingDepositoryFinancialInstitutionName()
             * .originatorCity()
             * .originatorCountry()
             * .originatorIdentification()
             * .originatorName()
             * .originatorPostalCode()
             * .originatorStateOrProvince()
             * .originatorStreetAddress()
             * .paymentRelatedInformation()
             * .paymentRelatedInformation2()
             * .receiverCity()
             * .receiverCountry()
             * .receiverIdentificationNumber()
             * .receiverPostalCode()
             * .receiverStateOrProvince()
             * .receiverStreetAddress()
             * .receivingCompanyOrIndividualName()
             * .receivingDepositoryFinancialInstitutionCountry()
             * .receivingDepositoryFinancialInstitutionId()
             * .receivingDepositoryFinancialInstitutionIdQualifier()
             * .receivingDepositoryFinancialInstitutionName()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [InternationalAddenda]. */
        class Builder internal constructor() {

            private var destinationCountryCode: JsonField<String>? = null
            private var destinationCurrencyCode: JsonField<String>? = null
            private var foreignExchangeIndicator: JsonField<ForeignExchangeIndicator>? = null
            private var foreignExchangeReference: JsonField<String>? = null
            private var foreignExchangeReferenceIndicator:
                JsonField<ForeignExchangeReferenceIndicator>? =
                null
            private var foreignPaymentAmount: JsonField<Long>? = null
            private var foreignTraceNumber: JsonField<String>? = null
            private var internationalTransactionTypeCode:
                JsonField<InternationalTransactionTypeCode>? =
                null
            private var originatingCurrencyCode: JsonField<String>? = null
            private var originatingDepositoryFinancialInstitutionBranchCountry: JsonField<String>? =
                null
            private var originatingDepositoryFinancialInstitutionId: JsonField<String>? = null
            private var originatingDepositoryFinancialInstitutionIdQualifier:
                JsonField<OriginatingDepositoryFinancialInstitutionIdQualifier>? =
                null
            private var originatingDepositoryFinancialInstitutionName: JsonField<String>? = null
            private var originatorCity: JsonField<String>? = null
            private var originatorCountry: JsonField<String>? = null
            private var originatorIdentification: JsonField<String>? = null
            private var originatorName: JsonField<String>? = null
            private var originatorPostalCode: JsonField<String>? = null
            private var originatorStateOrProvince: JsonField<String>? = null
            private var originatorStreetAddress: JsonField<String>? = null
            private var paymentRelatedInformation: JsonField<String>? = null
            private var paymentRelatedInformation2: JsonField<String>? = null
            private var receiverCity: JsonField<String>? = null
            private var receiverCountry: JsonField<String>? = null
            private var receiverIdentificationNumber: JsonField<String>? = null
            private var receiverPostalCode: JsonField<String>? = null
            private var receiverStateOrProvince: JsonField<String>? = null
            private var receiverStreetAddress: JsonField<String>? = null
            private var receivingCompanyOrIndividualName: JsonField<String>? = null
            private var receivingDepositoryFinancialInstitutionCountry: JsonField<String>? = null
            private var receivingDepositoryFinancialInstitutionId: JsonField<String>? = null
            private var receivingDepositoryFinancialInstitutionIdQualifier:
                JsonField<ReceivingDepositoryFinancialInstitutionIdQualifier>? =
                null
            private var receivingDepositoryFinancialInstitutionName: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(internationalAddenda: InternationalAddenda) = apply {
                destinationCountryCode = internationalAddenda.destinationCountryCode
                destinationCurrencyCode = internationalAddenda.destinationCurrencyCode
                foreignExchangeIndicator = internationalAddenda.foreignExchangeIndicator
                foreignExchangeReference = internationalAddenda.foreignExchangeReference
                foreignExchangeReferenceIndicator =
                    internationalAddenda.foreignExchangeReferenceIndicator
                foreignPaymentAmount = internationalAddenda.foreignPaymentAmount
                foreignTraceNumber = internationalAddenda.foreignTraceNumber
                internationalTransactionTypeCode =
                    internationalAddenda.internationalTransactionTypeCode
                originatingCurrencyCode = internationalAddenda.originatingCurrencyCode
                originatingDepositoryFinancialInstitutionBranchCountry =
                    internationalAddenda.originatingDepositoryFinancialInstitutionBranchCountry
                originatingDepositoryFinancialInstitutionId =
                    internationalAddenda.originatingDepositoryFinancialInstitutionId
                originatingDepositoryFinancialInstitutionIdQualifier =
                    internationalAddenda.originatingDepositoryFinancialInstitutionIdQualifier
                originatingDepositoryFinancialInstitutionName =
                    internationalAddenda.originatingDepositoryFinancialInstitutionName
                originatorCity = internationalAddenda.originatorCity
                originatorCountry = internationalAddenda.originatorCountry
                originatorIdentification = internationalAddenda.originatorIdentification
                originatorName = internationalAddenda.originatorName
                originatorPostalCode = internationalAddenda.originatorPostalCode
                originatorStateOrProvince = internationalAddenda.originatorStateOrProvince
                originatorStreetAddress = internationalAddenda.originatorStreetAddress
                paymentRelatedInformation = internationalAddenda.paymentRelatedInformation
                paymentRelatedInformation2 = internationalAddenda.paymentRelatedInformation2
                receiverCity = internationalAddenda.receiverCity
                receiverCountry = internationalAddenda.receiverCountry
                receiverIdentificationNumber = internationalAddenda.receiverIdentificationNumber
                receiverPostalCode = internationalAddenda.receiverPostalCode
                receiverStateOrProvince = internationalAddenda.receiverStateOrProvince
                receiverStreetAddress = internationalAddenda.receiverStreetAddress
                receivingCompanyOrIndividualName =
                    internationalAddenda.receivingCompanyOrIndividualName
                receivingDepositoryFinancialInstitutionCountry =
                    internationalAddenda.receivingDepositoryFinancialInstitutionCountry
                receivingDepositoryFinancialInstitutionId =
                    internationalAddenda.receivingDepositoryFinancialInstitutionId
                receivingDepositoryFinancialInstitutionIdQualifier =
                    internationalAddenda.receivingDepositoryFinancialInstitutionIdQualifier
                receivingDepositoryFinancialInstitutionName =
                    internationalAddenda.receivingDepositoryFinancialInstitutionName
                additionalProperties = internationalAddenda.additionalProperties.toMutableMap()
            }

            /**
             * The [ISO 3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), Alpha-2 country
             * code of the destination country.
             */
            fun destinationCountryCode(destinationCountryCode: String) =
                destinationCountryCode(JsonField.of(destinationCountryCode))

            /**
             * Sets [Builder.destinationCountryCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.destinationCountryCode] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun destinationCountryCode(destinationCountryCode: JsonField<String>) = apply {
                this.destinationCountryCode = destinationCountryCode
            }

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code for the
             * destination bank account.
             */
            fun destinationCurrencyCode(destinationCurrencyCode: String) =
                destinationCurrencyCode(JsonField.of(destinationCurrencyCode))

            /**
             * Sets [Builder.destinationCurrencyCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.destinationCurrencyCode] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun destinationCurrencyCode(destinationCurrencyCode: JsonField<String>) = apply {
                this.destinationCurrencyCode = destinationCurrencyCode
            }

            /** A description of how the foreign exchange rate was calculated. */
            fun foreignExchangeIndicator(foreignExchangeIndicator: ForeignExchangeIndicator) =
                foreignExchangeIndicator(JsonField.of(foreignExchangeIndicator))

            /**
             * Sets [Builder.foreignExchangeIndicator] to an arbitrary JSON value.
             *
             * You should usually call [Builder.foreignExchangeIndicator] with a well-typed
             * [ForeignExchangeIndicator] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun foreignExchangeIndicator(
                foreignExchangeIndicator: JsonField<ForeignExchangeIndicator>
            ) = apply { this.foreignExchangeIndicator = foreignExchangeIndicator }

            /**
             * Depending on the `foreign_exchange_reference_indicator`, an exchange rate or a
             * reference to a well-known rate.
             */
            fun foreignExchangeReference(foreignExchangeReference: String?) =
                foreignExchangeReference(JsonField.ofNullable(foreignExchangeReference))

            /**
             * Alias for calling [Builder.foreignExchangeReference] with
             * `foreignExchangeReference.orElse(null)`.
             */
            fun foreignExchangeReference(foreignExchangeReference: Optional<String>) =
                foreignExchangeReference(foreignExchangeReference.getOrNull())

            /**
             * Sets [Builder.foreignExchangeReference] to an arbitrary JSON value.
             *
             * You should usually call [Builder.foreignExchangeReference] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
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
             * Sets [Builder.foreignExchangeReferenceIndicator] to an arbitrary JSON value.
             *
             * You should usually call [Builder.foreignExchangeReferenceIndicator] with a well-typed
             * [ForeignExchangeReferenceIndicator] value instead. This method is primarily for
             * setting the field to an undocumented or not yet supported value.
             */
            fun foreignExchangeReferenceIndicator(
                foreignExchangeReferenceIndicator: JsonField<ForeignExchangeReferenceIndicator>
            ) = apply { this.foreignExchangeReferenceIndicator = foreignExchangeReferenceIndicator }

            /**
             * The amount in the minor unit of the foreign payment currency. For dollars, for
             * example, this is cents.
             */
            fun foreignPaymentAmount(foreignPaymentAmount: Long) =
                foreignPaymentAmount(JsonField.of(foreignPaymentAmount))

            /**
             * Sets [Builder.foreignPaymentAmount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.foreignPaymentAmount] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun foreignPaymentAmount(foreignPaymentAmount: JsonField<Long>) = apply {
                this.foreignPaymentAmount = foreignPaymentAmount
            }

            /** A reference number in the foreign banking infrastructure. */
            fun foreignTraceNumber(foreignTraceNumber: String?) =
                foreignTraceNumber(JsonField.ofNullable(foreignTraceNumber))

            /**
             * Alias for calling [Builder.foreignTraceNumber] with
             * `foreignTraceNumber.orElse(null)`.
             */
            fun foreignTraceNumber(foreignTraceNumber: Optional<String>) =
                foreignTraceNumber(foreignTraceNumber.getOrNull())

            /**
             * Sets [Builder.foreignTraceNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.foreignTraceNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun foreignTraceNumber(foreignTraceNumber: JsonField<String>) = apply {
                this.foreignTraceNumber = foreignTraceNumber
            }

            /** The type of transfer. Set by the originator. */
            fun internationalTransactionTypeCode(
                internationalTransactionTypeCode: InternationalTransactionTypeCode
            ) = internationalTransactionTypeCode(JsonField.of(internationalTransactionTypeCode))

            /**
             * Sets [Builder.internationalTransactionTypeCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.internationalTransactionTypeCode] with a well-typed
             * [InternationalTransactionTypeCode] value instead. This method is primarily for
             * setting the field to an undocumented or not yet supported value.
             */
            fun internationalTransactionTypeCode(
                internationalTransactionTypeCode: JsonField<InternationalTransactionTypeCode>
            ) = apply { this.internationalTransactionTypeCode = internationalTransactionTypeCode }

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code for the
             * originating bank account.
             */
            fun originatingCurrencyCode(originatingCurrencyCode: String) =
                originatingCurrencyCode(JsonField.of(originatingCurrencyCode))

            /**
             * Sets [Builder.originatingCurrencyCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.originatingCurrencyCode] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun originatingCurrencyCode(originatingCurrencyCode: JsonField<String>) = apply {
                this.originatingCurrencyCode = originatingCurrencyCode
            }

            /**
             * The [ISO 3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), Alpha-2 country
             * code of the originating branch country.
             */
            fun originatingDepositoryFinancialInstitutionBranchCountry(
                originatingDepositoryFinancialInstitutionBranchCountry: String
            ) =
                originatingDepositoryFinancialInstitutionBranchCountry(
                    JsonField.of(originatingDepositoryFinancialInstitutionBranchCountry)
                )

            /**
             * Sets [Builder.originatingDepositoryFinancialInstitutionBranchCountry] to an arbitrary
             * JSON value.
             *
             * You should usually call
             * [Builder.originatingDepositoryFinancialInstitutionBranchCountry] with a well-typed
             * [String] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun originatingDepositoryFinancialInstitutionBranchCountry(
                originatingDepositoryFinancialInstitutionBranchCountry: JsonField<String>
            ) = apply {
                this.originatingDepositoryFinancialInstitutionBranchCountry =
                    originatingDepositoryFinancialInstitutionBranchCountry
            }

            /**
             * An identifier for the originating bank. One of an International Bank Account Number
             * (IBAN) bank identifier, SWIFT Bank Identification Code (BIC), or a domestic
             * identifier like a US Routing Number.
             */
            fun originatingDepositoryFinancialInstitutionId(
                originatingDepositoryFinancialInstitutionId: String
            ) =
                originatingDepositoryFinancialInstitutionId(
                    JsonField.of(originatingDepositoryFinancialInstitutionId)
                )

            /**
             * Sets [Builder.originatingDepositoryFinancialInstitutionId] to an arbitrary JSON
             * value.
             *
             * You should usually call [Builder.originatingDepositoryFinancialInstitutionId] with a
             * well-typed [String] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun originatingDepositoryFinancialInstitutionId(
                originatingDepositoryFinancialInstitutionId: JsonField<String>
            ) = apply {
                this.originatingDepositoryFinancialInstitutionId =
                    originatingDepositoryFinancialInstitutionId
            }

            /**
             * An instruction of how to interpret the
             * `originating_depository_financial_institution_id` field for this Transaction.
             */
            fun originatingDepositoryFinancialInstitutionIdQualifier(
                originatingDepositoryFinancialInstitutionIdQualifier:
                    OriginatingDepositoryFinancialInstitutionIdQualifier
            ) =
                originatingDepositoryFinancialInstitutionIdQualifier(
                    JsonField.of(originatingDepositoryFinancialInstitutionIdQualifier)
                )

            /**
             * Sets [Builder.originatingDepositoryFinancialInstitutionIdQualifier] to an arbitrary
             * JSON value.
             *
             * You should usually call
             * [Builder.originatingDepositoryFinancialInstitutionIdQualifier] with a well-typed
             * [OriginatingDepositoryFinancialInstitutionIdQualifier] value instead. This method is
             * primarily for setting the field to an undocumented or not yet supported value.
             */
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
             * Sets [Builder.originatingDepositoryFinancialInstitutionName] to an arbitrary JSON
             * value.
             *
             * You should usually call [Builder.originatingDepositoryFinancialInstitutionName] with
             * a well-typed [String] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun originatingDepositoryFinancialInstitutionName(
                originatingDepositoryFinancialInstitutionName: JsonField<String>
            ) = apply {
                this.originatingDepositoryFinancialInstitutionName =
                    originatingDepositoryFinancialInstitutionName
            }

            /** A portion of the originator address. This may be incomplete. */
            fun originatorCity(originatorCity: String) =
                originatorCity(JsonField.of(originatorCity))

            /**
             * Sets [Builder.originatorCity] to an arbitrary JSON value.
             *
             * You should usually call [Builder.originatorCity] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun originatorCity(originatorCity: JsonField<String>) = apply {
                this.originatorCity = originatorCity
            }

            /**
             * A portion of the originator address. The
             * [ISO 3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), Alpha-2 country code of
             * the originator country.
             */
            fun originatorCountry(originatorCountry: String) =
                originatorCountry(JsonField.of(originatorCountry))

            /**
             * Sets [Builder.originatorCountry] to an arbitrary JSON value.
             *
             * You should usually call [Builder.originatorCountry] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun originatorCountry(originatorCountry: JsonField<String>) = apply {
                this.originatorCountry = originatorCountry
            }

            /**
             * An identifier for the originating company. This is generally stable across multiple
             * ACH transfers.
             */
            fun originatorIdentification(originatorIdentification: String) =
                originatorIdentification(JsonField.of(originatorIdentification))

            /**
             * Sets [Builder.originatorIdentification] to an arbitrary JSON value.
             *
             * You should usually call [Builder.originatorIdentification] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun originatorIdentification(originatorIdentification: JsonField<String>) = apply {
                this.originatorIdentification = originatorIdentification
            }

            /** Either the name of the originator or an intermediary money transmitter. */
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

            /** A portion of the originator address. This may be incomplete. */
            fun originatorPostalCode(originatorPostalCode: String?) =
                originatorPostalCode(JsonField.ofNullable(originatorPostalCode))

            /**
             * Alias for calling [Builder.originatorPostalCode] with
             * `originatorPostalCode.orElse(null)`.
             */
            fun originatorPostalCode(originatorPostalCode: Optional<String>) =
                originatorPostalCode(originatorPostalCode.getOrNull())

            /**
             * Sets [Builder.originatorPostalCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.originatorPostalCode] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun originatorPostalCode(originatorPostalCode: JsonField<String>) = apply {
                this.originatorPostalCode = originatorPostalCode
            }

            /** A portion of the originator address. This may be incomplete. */
            fun originatorStateOrProvince(originatorStateOrProvince: String?) =
                originatorStateOrProvince(JsonField.ofNullable(originatorStateOrProvince))

            /**
             * Alias for calling [Builder.originatorStateOrProvince] with
             * `originatorStateOrProvince.orElse(null)`.
             */
            fun originatorStateOrProvince(originatorStateOrProvince: Optional<String>) =
                originatorStateOrProvince(originatorStateOrProvince.getOrNull())

            /**
             * Sets [Builder.originatorStateOrProvince] to an arbitrary JSON value.
             *
             * You should usually call [Builder.originatorStateOrProvince] with a well-typed
             * [String] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun originatorStateOrProvince(originatorStateOrProvince: JsonField<String>) = apply {
                this.originatorStateOrProvince = originatorStateOrProvince
            }

            /** A portion of the originator address. This may be incomplete. */
            fun originatorStreetAddress(originatorStreetAddress: String) =
                originatorStreetAddress(JsonField.of(originatorStreetAddress))

            /**
             * Sets [Builder.originatorStreetAddress] to an arbitrary JSON value.
             *
             * You should usually call [Builder.originatorStreetAddress] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun originatorStreetAddress(originatorStreetAddress: JsonField<String>) = apply {
                this.originatorStreetAddress = originatorStreetAddress
            }

            /** A description field set by the originator. */
            fun paymentRelatedInformation(paymentRelatedInformation: String?) =
                paymentRelatedInformation(JsonField.ofNullable(paymentRelatedInformation))

            /**
             * Alias for calling [Builder.paymentRelatedInformation] with
             * `paymentRelatedInformation.orElse(null)`.
             */
            fun paymentRelatedInformation(paymentRelatedInformation: Optional<String>) =
                paymentRelatedInformation(paymentRelatedInformation.getOrNull())

            /**
             * Sets [Builder.paymentRelatedInformation] to an arbitrary JSON value.
             *
             * You should usually call [Builder.paymentRelatedInformation] with a well-typed
             * [String] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun paymentRelatedInformation(paymentRelatedInformation: JsonField<String>) = apply {
                this.paymentRelatedInformation = paymentRelatedInformation
            }

            /** A description field set by the originator. */
            fun paymentRelatedInformation2(paymentRelatedInformation2: String?) =
                paymentRelatedInformation2(JsonField.ofNullable(paymentRelatedInformation2))

            /**
             * Alias for calling [Builder.paymentRelatedInformation2] with
             * `paymentRelatedInformation2.orElse(null)`.
             */
            fun paymentRelatedInformation2(paymentRelatedInformation2: Optional<String>) =
                paymentRelatedInformation2(paymentRelatedInformation2.getOrNull())

            /**
             * Sets [Builder.paymentRelatedInformation2] to an arbitrary JSON value.
             *
             * You should usually call [Builder.paymentRelatedInformation2] with a well-typed
             * [String] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun paymentRelatedInformation2(paymentRelatedInformation2: JsonField<String>) = apply {
                this.paymentRelatedInformation2 = paymentRelatedInformation2
            }

            /** A portion of the receiver address. This may be incomplete. */
            fun receiverCity(receiverCity: String) = receiverCity(JsonField.of(receiverCity))

            /**
             * Sets [Builder.receiverCity] to an arbitrary JSON value.
             *
             * You should usually call [Builder.receiverCity] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun receiverCity(receiverCity: JsonField<String>) = apply {
                this.receiverCity = receiverCity
            }

            /**
             * A portion of the receiver address. The
             * [ISO 3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), Alpha-2 country code of
             * the receiver country.
             */
            fun receiverCountry(receiverCountry: String) =
                receiverCountry(JsonField.of(receiverCountry))

            /**
             * Sets [Builder.receiverCountry] to an arbitrary JSON value.
             *
             * You should usually call [Builder.receiverCountry] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun receiverCountry(receiverCountry: JsonField<String>) = apply {
                this.receiverCountry = receiverCountry
            }

            /** An identification number the originator uses for the receiver. */
            fun receiverIdentificationNumber(receiverIdentificationNumber: String?) =
                receiverIdentificationNumber(JsonField.ofNullable(receiverIdentificationNumber))

            /**
             * Alias for calling [Builder.receiverIdentificationNumber] with
             * `receiverIdentificationNumber.orElse(null)`.
             */
            fun receiverIdentificationNumber(receiverIdentificationNumber: Optional<String>) =
                receiverIdentificationNumber(receiverIdentificationNumber.getOrNull())

            /**
             * Sets [Builder.receiverIdentificationNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.receiverIdentificationNumber] with a well-typed
             * [String] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun receiverIdentificationNumber(receiverIdentificationNumber: JsonField<String>) =
                apply {
                    this.receiverIdentificationNumber = receiverIdentificationNumber
                }

            /** A portion of the receiver address. This may be incomplete. */
            fun receiverPostalCode(receiverPostalCode: String?) =
                receiverPostalCode(JsonField.ofNullable(receiverPostalCode))

            /**
             * Alias for calling [Builder.receiverPostalCode] with
             * `receiverPostalCode.orElse(null)`.
             */
            fun receiverPostalCode(receiverPostalCode: Optional<String>) =
                receiverPostalCode(receiverPostalCode.getOrNull())

            /**
             * Sets [Builder.receiverPostalCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.receiverPostalCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun receiverPostalCode(receiverPostalCode: JsonField<String>) = apply {
                this.receiverPostalCode = receiverPostalCode
            }

            /** A portion of the receiver address. This may be incomplete. */
            fun receiverStateOrProvince(receiverStateOrProvince: String?) =
                receiverStateOrProvince(JsonField.ofNullable(receiverStateOrProvince))

            /**
             * Alias for calling [Builder.receiverStateOrProvince] with
             * `receiverStateOrProvince.orElse(null)`.
             */
            fun receiverStateOrProvince(receiverStateOrProvince: Optional<String>) =
                receiverStateOrProvince(receiverStateOrProvince.getOrNull())

            /**
             * Sets [Builder.receiverStateOrProvince] to an arbitrary JSON value.
             *
             * You should usually call [Builder.receiverStateOrProvince] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun receiverStateOrProvince(receiverStateOrProvince: JsonField<String>) = apply {
                this.receiverStateOrProvince = receiverStateOrProvince
            }

            /** A portion of the receiver address. This may be incomplete. */
            fun receiverStreetAddress(receiverStreetAddress: String) =
                receiverStreetAddress(JsonField.of(receiverStreetAddress))

            /**
             * Sets [Builder.receiverStreetAddress] to an arbitrary JSON value.
             *
             * You should usually call [Builder.receiverStreetAddress] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun receiverStreetAddress(receiverStreetAddress: JsonField<String>) = apply {
                this.receiverStreetAddress = receiverStreetAddress
            }

            /** The name of the receiver of the transfer. This is not verified by Increase. */
            fun receivingCompanyOrIndividualName(receivingCompanyOrIndividualName: String) =
                receivingCompanyOrIndividualName(JsonField.of(receivingCompanyOrIndividualName))

            /**
             * Sets [Builder.receivingCompanyOrIndividualName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.receivingCompanyOrIndividualName] with a well-typed
             * [String] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun receivingCompanyOrIndividualName(
                receivingCompanyOrIndividualName: JsonField<String>
            ) = apply { this.receivingCompanyOrIndividualName = receivingCompanyOrIndividualName }

            /**
             * The [ISO 3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), Alpha-2 country
             * code of the receiving bank country.
             */
            fun receivingDepositoryFinancialInstitutionCountry(
                receivingDepositoryFinancialInstitutionCountry: String
            ) =
                receivingDepositoryFinancialInstitutionCountry(
                    JsonField.of(receivingDepositoryFinancialInstitutionCountry)
                )

            /**
             * Sets [Builder.receivingDepositoryFinancialInstitutionCountry] to an arbitrary JSON
             * value.
             *
             * You should usually call [Builder.receivingDepositoryFinancialInstitutionCountry] with
             * a well-typed [String] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun receivingDepositoryFinancialInstitutionCountry(
                receivingDepositoryFinancialInstitutionCountry: JsonField<String>
            ) = apply {
                this.receivingDepositoryFinancialInstitutionCountry =
                    receivingDepositoryFinancialInstitutionCountry
            }

            /**
             * An identifier for the receiving bank. One of an International Bank Account Number
             * (IBAN) bank identifier, SWIFT Bank Identification Code (BIC), or a domestic
             * identifier like a US Routing Number.
             */
            fun receivingDepositoryFinancialInstitutionId(
                receivingDepositoryFinancialInstitutionId: String
            ) =
                receivingDepositoryFinancialInstitutionId(
                    JsonField.of(receivingDepositoryFinancialInstitutionId)
                )

            /**
             * Sets [Builder.receivingDepositoryFinancialInstitutionId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.receivingDepositoryFinancialInstitutionId] with a
             * well-typed [String] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun receivingDepositoryFinancialInstitutionId(
                receivingDepositoryFinancialInstitutionId: JsonField<String>
            ) = apply {
                this.receivingDepositoryFinancialInstitutionId =
                    receivingDepositoryFinancialInstitutionId
            }

            /**
             * An instruction of how to interpret the
             * `receiving_depository_financial_institution_id` field for this Transaction.
             */
            fun receivingDepositoryFinancialInstitutionIdQualifier(
                receivingDepositoryFinancialInstitutionIdQualifier:
                    ReceivingDepositoryFinancialInstitutionIdQualifier
            ) =
                receivingDepositoryFinancialInstitutionIdQualifier(
                    JsonField.of(receivingDepositoryFinancialInstitutionIdQualifier)
                )

            /**
             * Sets [Builder.receivingDepositoryFinancialInstitutionIdQualifier] to an arbitrary
             * JSON value.
             *
             * You should usually call [Builder.receivingDepositoryFinancialInstitutionIdQualifier]
             * with a well-typed [ReceivingDepositoryFinancialInstitutionIdQualifier] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
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

            /**
             * Sets [Builder.receivingDepositoryFinancialInstitutionName] to an arbitrary JSON
             * value.
             *
             * You should usually call [Builder.receivingDepositoryFinancialInstitutionName] with a
             * well-typed [String] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun receivingDepositoryFinancialInstitutionName(
                receivingDepositoryFinancialInstitutionName: JsonField<String>
            ) = apply {
                this.receivingDepositoryFinancialInstitutionName =
                    receivingDepositoryFinancialInstitutionName
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
             * Returns an immutable instance of [InternationalAddenda].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .destinationCountryCode()
             * .destinationCurrencyCode()
             * .foreignExchangeIndicator()
             * .foreignExchangeReference()
             * .foreignExchangeReferenceIndicator()
             * .foreignPaymentAmount()
             * .foreignTraceNumber()
             * .internationalTransactionTypeCode()
             * .originatingCurrencyCode()
             * .originatingDepositoryFinancialInstitutionBranchCountry()
             * .originatingDepositoryFinancialInstitutionId()
             * .originatingDepositoryFinancialInstitutionIdQualifier()
             * .originatingDepositoryFinancialInstitutionName()
             * .originatorCity()
             * .originatorCountry()
             * .originatorIdentification()
             * .originatorName()
             * .originatorPostalCode()
             * .originatorStateOrProvince()
             * .originatorStreetAddress()
             * .paymentRelatedInformation()
             * .paymentRelatedInformation2()
             * .receiverCity()
             * .receiverCountry()
             * .receiverIdentificationNumber()
             * .receiverPostalCode()
             * .receiverStateOrProvince()
             * .receiverStreetAddress()
             * .receivingCompanyOrIndividualName()
             * .receivingDepositoryFinancialInstitutionCountry()
             * .receivingDepositoryFinancialInstitutionId()
             * .receivingDepositoryFinancialInstitutionIdQualifier()
             * .receivingDepositoryFinancialInstitutionName()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): InternationalAddenda =
                InternationalAddenda(
                    checkRequired("destinationCountryCode", destinationCountryCode),
                    checkRequired("destinationCurrencyCode", destinationCurrencyCode),
                    checkRequired("foreignExchangeIndicator", foreignExchangeIndicator),
                    checkRequired("foreignExchangeReference", foreignExchangeReference),
                    checkRequired(
                        "foreignExchangeReferenceIndicator",
                        foreignExchangeReferenceIndicator,
                    ),
                    checkRequired("foreignPaymentAmount", foreignPaymentAmount),
                    checkRequired("foreignTraceNumber", foreignTraceNumber),
                    checkRequired(
                        "internationalTransactionTypeCode",
                        internationalTransactionTypeCode,
                    ),
                    checkRequired("originatingCurrencyCode", originatingCurrencyCode),
                    checkRequired(
                        "originatingDepositoryFinancialInstitutionBranchCountry",
                        originatingDepositoryFinancialInstitutionBranchCountry,
                    ),
                    checkRequired(
                        "originatingDepositoryFinancialInstitutionId",
                        originatingDepositoryFinancialInstitutionId,
                    ),
                    checkRequired(
                        "originatingDepositoryFinancialInstitutionIdQualifier",
                        originatingDepositoryFinancialInstitutionIdQualifier,
                    ),
                    checkRequired(
                        "originatingDepositoryFinancialInstitutionName",
                        originatingDepositoryFinancialInstitutionName,
                    ),
                    checkRequired("originatorCity", originatorCity),
                    checkRequired("originatorCountry", originatorCountry),
                    checkRequired("originatorIdentification", originatorIdentification),
                    checkRequired("originatorName", originatorName),
                    checkRequired("originatorPostalCode", originatorPostalCode),
                    checkRequired("originatorStateOrProvince", originatorStateOrProvince),
                    checkRequired("originatorStreetAddress", originatorStreetAddress),
                    checkRequired("paymentRelatedInformation", paymentRelatedInformation),
                    checkRequired("paymentRelatedInformation2", paymentRelatedInformation2),
                    checkRequired("receiverCity", receiverCity),
                    checkRequired("receiverCountry", receiverCountry),
                    checkRequired("receiverIdentificationNumber", receiverIdentificationNumber),
                    checkRequired("receiverPostalCode", receiverPostalCode),
                    checkRequired("receiverStateOrProvince", receiverStateOrProvince),
                    checkRequired("receiverStreetAddress", receiverStreetAddress),
                    checkRequired(
                        "receivingCompanyOrIndividualName",
                        receivingCompanyOrIndividualName,
                    ),
                    checkRequired(
                        "receivingDepositoryFinancialInstitutionCountry",
                        receivingDepositoryFinancialInstitutionCountry,
                    ),
                    checkRequired(
                        "receivingDepositoryFinancialInstitutionId",
                        receivingDepositoryFinancialInstitutionId,
                    ),
                    checkRequired(
                        "receivingDepositoryFinancialInstitutionIdQualifier",
                        receivingDepositoryFinancialInstitutionIdQualifier,
                    ),
                    checkRequired(
                        "receivingDepositoryFinancialInstitutionName",
                        receivingDepositoryFinancialInstitutionName,
                    ),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): InternationalAddenda = apply {
            if (validated) {
                return@apply
            }

            destinationCountryCode()
            destinationCurrencyCode()
            foreignExchangeIndicator().validate()
            foreignExchangeReference()
            foreignExchangeReferenceIndicator().validate()
            foreignPaymentAmount()
            foreignTraceNumber()
            internationalTransactionTypeCode().validate()
            originatingCurrencyCode()
            originatingDepositoryFinancialInstitutionBranchCountry()
            originatingDepositoryFinancialInstitutionId()
            originatingDepositoryFinancialInstitutionIdQualifier().validate()
            originatingDepositoryFinancialInstitutionName()
            originatorCity()
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
            receivingDepositoryFinancialInstitutionIdQualifier().validate()
            receivingDepositoryFinancialInstitutionName()
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
            (if (destinationCountryCode.asKnown().isPresent) 1 else 0) +
                (if (destinationCurrencyCode.asKnown().isPresent) 1 else 0) +
                (foreignExchangeIndicator.asKnown().getOrNull()?.validity() ?: 0) +
                (if (foreignExchangeReference.asKnown().isPresent) 1 else 0) +
                (foreignExchangeReferenceIndicator.asKnown().getOrNull()?.validity() ?: 0) +
                (if (foreignPaymentAmount.asKnown().isPresent) 1 else 0) +
                (if (foreignTraceNumber.asKnown().isPresent) 1 else 0) +
                (internationalTransactionTypeCode.asKnown().getOrNull()?.validity() ?: 0) +
                (if (originatingCurrencyCode.asKnown().isPresent) 1 else 0) +
                (if (originatingDepositoryFinancialInstitutionBranchCountry.asKnown().isPresent) 1
                else 0) +
                (if (originatingDepositoryFinancialInstitutionId.asKnown().isPresent) 1 else 0) +
                (originatingDepositoryFinancialInstitutionIdQualifier
                    .asKnown()
                    .getOrNull()
                    ?.validity() ?: 0) +
                (if (originatingDepositoryFinancialInstitutionName.asKnown().isPresent) 1 else 0) +
                (if (originatorCity.asKnown().isPresent) 1 else 0) +
                (if (originatorCountry.asKnown().isPresent) 1 else 0) +
                (if (originatorIdentification.asKnown().isPresent) 1 else 0) +
                (if (originatorName.asKnown().isPresent) 1 else 0) +
                (if (originatorPostalCode.asKnown().isPresent) 1 else 0) +
                (if (originatorStateOrProvince.asKnown().isPresent) 1 else 0) +
                (if (originatorStreetAddress.asKnown().isPresent) 1 else 0) +
                (if (paymentRelatedInformation.asKnown().isPresent) 1 else 0) +
                (if (paymentRelatedInformation2.asKnown().isPresent) 1 else 0) +
                (if (receiverCity.asKnown().isPresent) 1 else 0) +
                (if (receiverCountry.asKnown().isPresent) 1 else 0) +
                (if (receiverIdentificationNumber.asKnown().isPresent) 1 else 0) +
                (if (receiverPostalCode.asKnown().isPresent) 1 else 0) +
                (if (receiverStateOrProvince.asKnown().isPresent) 1 else 0) +
                (if (receiverStreetAddress.asKnown().isPresent) 1 else 0) +
                (if (receivingCompanyOrIndividualName.asKnown().isPresent) 1 else 0) +
                (if (receivingDepositoryFinancialInstitutionCountry.asKnown().isPresent) 1 else 0) +
                (if (receivingDepositoryFinancialInstitutionId.asKnown().isPresent) 1 else 0) +
                (receivingDepositoryFinancialInstitutionIdQualifier
                    .asKnown()
                    .getOrNull()
                    ?.validity() ?: 0) +
                (if (receivingDepositoryFinancialInstitutionName.asKnown().isPresent) 1 else 0)

        /** A description of how the foreign exchange rate was calculated. */
        class ForeignExchangeIndicator
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

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

                /**
                 * The originator chose an amount in their own currency. The settled amount in USD
                 * was converted using the exchange rate.
                 */
                @JvmField val FIXED_TO_VARIABLE = of("fixed_to_variable")

                /**
                 * The originator chose an amount to settle in USD. The originator's amount was
                 * variable; known only after the foreign exchange conversion.
                 */
                @JvmField val VARIABLE_TO_FIXED = of("variable_to_fixed")

                /**
                 * The amount was originated and settled as a fixed amount in USD. There is no
                 * foreign exchange conversion.
                 */
                @JvmField val FIXED_TO_FIXED = of("fixed_to_fixed")

                @JvmStatic fun of(value: String) = ForeignExchangeIndicator(JsonField.of(value))
            }

            /** An enum containing [ForeignExchangeIndicator]'s known values. */
            enum class Known {
                /**
                 * The originator chose an amount in their own currency. The settled amount in USD
                 * was converted using the exchange rate.
                 */
                FIXED_TO_VARIABLE,
                /**
                 * The originator chose an amount to settle in USD. The originator's amount was
                 * variable; known only after the foreign exchange conversion.
                 */
                VARIABLE_TO_FIXED,
                /**
                 * The amount was originated and settled as a fixed amount in USD. There is no
                 * foreign exchange conversion.
                 */
                FIXED_TO_FIXED,
            }

            /**
             * An enum containing [ForeignExchangeIndicator]'s known values, as well as an
             * [_UNKNOWN] member.
             *
             * An instance of [ForeignExchangeIndicator] can contain an unknown value in a couple of
             * cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                /**
                 * The originator chose an amount in their own currency. The settled amount in USD
                 * was converted using the exchange rate.
                 */
                FIXED_TO_VARIABLE,
                /**
                 * The originator chose an amount to settle in USD. The originator's amount was
                 * variable; known only after the foreign exchange conversion.
                 */
                VARIABLE_TO_FIXED,
                /**
                 * The amount was originated and settled as a fixed amount in USD. There is no
                 * foreign exchange conversion.
                 */
                FIXED_TO_FIXED,
                /**
                 * An enum member indicating that [ForeignExchangeIndicator] was instantiated with
                 * an unknown value.
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
                    FIXED_TO_VARIABLE -> Value.FIXED_TO_VARIABLE
                    VARIABLE_TO_FIXED -> Value.VARIABLE_TO_FIXED
                    FIXED_TO_FIXED -> Value.FIXED_TO_FIXED
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
                    FIXED_TO_VARIABLE -> Known.FIXED_TO_VARIABLE
                    VARIABLE_TO_FIXED -> Known.VARIABLE_TO_FIXED
                    FIXED_TO_FIXED -> Known.FIXED_TO_FIXED
                    else ->
                        throw IncreaseInvalidDataException(
                            "Unknown ForeignExchangeIndicator: $value"
                        )
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

            fun validate(): ForeignExchangeIndicator = apply {
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

                return other is ForeignExchangeIndicator && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * An instruction of how to interpret the `foreign_exchange_reference` field for this
         * Transaction.
         */
        class ForeignExchangeReferenceIndicator
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

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

                /** The ACH file contains a foreign exchange rate. */
                @JvmField val FOREIGN_EXCHANGE_RATE = of("foreign_exchange_rate")

                /** The ACH file contains a reference to a well-known foreign exchange rate. */
                @JvmField
                val FOREIGN_EXCHANGE_REFERENCE_NUMBER = of("foreign_exchange_reference_number")

                /**
                 * There is no foreign exchange for this transfer, so the
                 * `foreign_exchange_reference` field is blank.
                 */
                @JvmField val BLANK = of("blank")

                @JvmStatic
                fun of(value: String) = ForeignExchangeReferenceIndicator(JsonField.of(value))
            }

            /** An enum containing [ForeignExchangeReferenceIndicator]'s known values. */
            enum class Known {
                /** The ACH file contains a foreign exchange rate. */
                FOREIGN_EXCHANGE_RATE,
                /** The ACH file contains a reference to a well-known foreign exchange rate. */
                FOREIGN_EXCHANGE_REFERENCE_NUMBER,
                /**
                 * There is no foreign exchange for this transfer, so the
                 * `foreign_exchange_reference` field is blank.
                 */
                BLANK,
            }

            /**
             * An enum containing [ForeignExchangeReferenceIndicator]'s known values, as well as an
             * [_UNKNOWN] member.
             *
             * An instance of [ForeignExchangeReferenceIndicator] can contain an unknown value in a
             * couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                /** The ACH file contains a foreign exchange rate. */
                FOREIGN_EXCHANGE_RATE,
                /** The ACH file contains a reference to a well-known foreign exchange rate. */
                FOREIGN_EXCHANGE_REFERENCE_NUMBER,
                /**
                 * There is no foreign exchange for this transfer, so the
                 * `foreign_exchange_reference` field is blank.
                 */
                BLANK,
                /**
                 * An enum member indicating that [ForeignExchangeReferenceIndicator] was
                 * instantiated with an unknown value.
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
                    FOREIGN_EXCHANGE_RATE -> Value.FOREIGN_EXCHANGE_RATE
                    FOREIGN_EXCHANGE_REFERENCE_NUMBER -> Value.FOREIGN_EXCHANGE_REFERENCE_NUMBER
                    BLANK -> Value.BLANK
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
                    FOREIGN_EXCHANGE_RATE -> Known.FOREIGN_EXCHANGE_RATE
                    FOREIGN_EXCHANGE_REFERENCE_NUMBER -> Known.FOREIGN_EXCHANGE_REFERENCE_NUMBER
                    BLANK -> Known.BLANK
                    else ->
                        throw IncreaseInvalidDataException(
                            "Unknown ForeignExchangeReferenceIndicator: $value"
                        )
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

            fun validate(): ForeignExchangeReferenceIndicator = apply {
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

                return other is ForeignExchangeReferenceIndicator && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** The type of transfer. Set by the originator. */
        class InternationalTransactionTypeCode
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

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

                /** Sent as `ANN` in the Nacha file. */
                @JvmField val ANNUITY = of("annuity")

                /** Sent as `BUS` in the Nacha file. */
                @JvmField val BUSINESS_OR_COMMERCIAL = of("business_or_commercial")

                /** Sent as `DEP` in the Nacha file. */
                @JvmField val DEPOSIT = of("deposit")

                /** Sent as `LOA` in the Nacha file. */
                @JvmField val LOAN = of("loan")

                /** Sent as `MIS` in the Nacha file. */
                @JvmField val MISCELLANEOUS = of("miscellaneous")

                /** Sent as `MOR` in the Nacha file. */
                @JvmField val MORTGAGE = of("mortgage")

                /** Sent as `PEN` in the Nacha file. */
                @JvmField val PENSION = of("pension")

                /** Sent as `REM` in the Nacha file. */
                @JvmField val REMITTANCE = of("remittance")

                /** Sent as `RLS` in the Nacha file. */
                @JvmField val RENT_OR_LEASE = of("rent_or_lease")

                /** Sent as `SAL` in the Nacha file. */
                @JvmField val SALARY_OR_PAYROLL = of("salary_or_payroll")

                /** Sent as `TAX` in the Nacha file. */
                @JvmField val TAX = of("tax")

                /** Sent as `ARC` in the Nacha file. */
                @JvmField val ACCOUNTS_RECEIVABLE = of("accounts_receivable")

                /** Sent as `BOC` in the Nacha file. */
                @JvmField val BACK_OFFICE_CONVERSION = of("back_office_conversion")

                /** Sent as `MTE` in the Nacha file. */
                @JvmField val MACHINE_TRANSFER = of("machine_transfer")

                /** Sent as `POP` in the Nacha file. */
                @JvmField val POINT_OF_PURCHASE = of("point_of_purchase")

                /** Sent as `POS` in the Nacha file. */
                @JvmField val POINT_OF_SALE = of("point_of_sale")

                /** Sent as `RCK` in the Nacha file. */
                @JvmField val REPRESENTED_CHECK = of("represented_check")

                /** Sent as `SHR` in the Nacha file. */
                @JvmField val SHARED_NETWORK_TRANSACTION = of("shared_network_transaction")

                /** Sent as `TEL` in the Nacha file. */
                @JvmField val TELPHONE_INITIATED = of("telphone_initiated")

                /** Sent as `WEB` in the Nacha file. */
                @JvmField val INTERNET_INITIATED = of("internet_initiated")

                @JvmStatic
                fun of(value: String) = InternationalTransactionTypeCode(JsonField.of(value))
            }

            /** An enum containing [InternationalTransactionTypeCode]'s known values. */
            enum class Known {
                /** Sent as `ANN` in the Nacha file. */
                ANNUITY,
                /** Sent as `BUS` in the Nacha file. */
                BUSINESS_OR_COMMERCIAL,
                /** Sent as `DEP` in the Nacha file. */
                DEPOSIT,
                /** Sent as `LOA` in the Nacha file. */
                LOAN,
                /** Sent as `MIS` in the Nacha file. */
                MISCELLANEOUS,
                /** Sent as `MOR` in the Nacha file. */
                MORTGAGE,
                /** Sent as `PEN` in the Nacha file. */
                PENSION,
                /** Sent as `REM` in the Nacha file. */
                REMITTANCE,
                /** Sent as `RLS` in the Nacha file. */
                RENT_OR_LEASE,
                /** Sent as `SAL` in the Nacha file. */
                SALARY_OR_PAYROLL,
                /** Sent as `TAX` in the Nacha file. */
                TAX,
                /** Sent as `ARC` in the Nacha file. */
                ACCOUNTS_RECEIVABLE,
                /** Sent as `BOC` in the Nacha file. */
                BACK_OFFICE_CONVERSION,
                /** Sent as `MTE` in the Nacha file. */
                MACHINE_TRANSFER,
                /** Sent as `POP` in the Nacha file. */
                POINT_OF_PURCHASE,
                /** Sent as `POS` in the Nacha file. */
                POINT_OF_SALE,
                /** Sent as `RCK` in the Nacha file. */
                REPRESENTED_CHECK,
                /** Sent as `SHR` in the Nacha file. */
                SHARED_NETWORK_TRANSACTION,
                /** Sent as `TEL` in the Nacha file. */
                TELPHONE_INITIATED,
                /** Sent as `WEB` in the Nacha file. */
                INTERNET_INITIATED,
            }

            /**
             * An enum containing [InternationalTransactionTypeCode]'s known values, as well as an
             * [_UNKNOWN] member.
             *
             * An instance of [InternationalTransactionTypeCode] can contain an unknown value in a
             * couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                /** Sent as `ANN` in the Nacha file. */
                ANNUITY,
                /** Sent as `BUS` in the Nacha file. */
                BUSINESS_OR_COMMERCIAL,
                /** Sent as `DEP` in the Nacha file. */
                DEPOSIT,
                /** Sent as `LOA` in the Nacha file. */
                LOAN,
                /** Sent as `MIS` in the Nacha file. */
                MISCELLANEOUS,
                /** Sent as `MOR` in the Nacha file. */
                MORTGAGE,
                /** Sent as `PEN` in the Nacha file. */
                PENSION,
                /** Sent as `REM` in the Nacha file. */
                REMITTANCE,
                /** Sent as `RLS` in the Nacha file. */
                RENT_OR_LEASE,
                /** Sent as `SAL` in the Nacha file. */
                SALARY_OR_PAYROLL,
                /** Sent as `TAX` in the Nacha file. */
                TAX,
                /** Sent as `ARC` in the Nacha file. */
                ACCOUNTS_RECEIVABLE,
                /** Sent as `BOC` in the Nacha file. */
                BACK_OFFICE_CONVERSION,
                /** Sent as `MTE` in the Nacha file. */
                MACHINE_TRANSFER,
                /** Sent as `POP` in the Nacha file. */
                POINT_OF_PURCHASE,
                /** Sent as `POS` in the Nacha file. */
                POINT_OF_SALE,
                /** Sent as `RCK` in the Nacha file. */
                REPRESENTED_CHECK,
                /** Sent as `SHR` in the Nacha file. */
                SHARED_NETWORK_TRANSACTION,
                /** Sent as `TEL` in the Nacha file. */
                TELPHONE_INITIATED,
                /** Sent as `WEB` in the Nacha file. */
                INTERNET_INITIATED,
                /**
                 * An enum member indicating that [InternationalTransactionTypeCode] was
                 * instantiated with an unknown value.
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

            fun validate(): InternationalTransactionTypeCode = apply {
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

                return other is InternationalTransactionTypeCode && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * An instruction of how to interpret the `originating_depository_financial_institution_id`
         * field for this Transaction.
         */
        class OriginatingDepositoryFinancialInstitutionIdQualifier
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

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

                /**
                 * A domestic clearing system number. In the US, for example, this is the American
                 * Banking Association (ABA) routing number.
                 */
                @JvmField
                val NATIONAL_CLEARING_SYSTEM_NUMBER = of("national_clearing_system_number")

                /** The SWIFT Bank Identifier Code (BIC) of the bank. */
                @JvmField val BIC_CODE = of("bic_code")

                /** An International Bank Account Number. */
                @JvmField val IBAN = of("iban")

                @JvmStatic
                fun of(value: String) =
                    OriginatingDepositoryFinancialInstitutionIdQualifier(JsonField.of(value))
            }

            /**
             * An enum containing [OriginatingDepositoryFinancialInstitutionIdQualifier]'s known
             * values.
             */
            enum class Known {
                /**
                 * A domestic clearing system number. In the US, for example, this is the American
                 * Banking Association (ABA) routing number.
                 */
                NATIONAL_CLEARING_SYSTEM_NUMBER,
                /** The SWIFT Bank Identifier Code (BIC) of the bank. */
                BIC_CODE,
                /** An International Bank Account Number. */
                IBAN,
            }

            /**
             * An enum containing [OriginatingDepositoryFinancialInstitutionIdQualifier]'s known
             * values, as well as an [_UNKNOWN] member.
             *
             * An instance of [OriginatingDepositoryFinancialInstitutionIdQualifier] can contain an
             * unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                /**
                 * A domestic clearing system number. In the US, for example, this is the American
                 * Banking Association (ABA) routing number.
                 */
                NATIONAL_CLEARING_SYSTEM_NUMBER,
                /** The SWIFT Bank Identifier Code (BIC) of the bank. */
                BIC_CODE,
                /** An International Bank Account Number. */
                IBAN,
                /**
                 * An enum member indicating that
                 * [OriginatingDepositoryFinancialInstitutionIdQualifier] was instantiated with an
                 * unknown value.
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
                    NATIONAL_CLEARING_SYSTEM_NUMBER -> Value.NATIONAL_CLEARING_SYSTEM_NUMBER
                    BIC_CODE -> Value.BIC_CODE
                    IBAN -> Value.IBAN
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
                    NATIONAL_CLEARING_SYSTEM_NUMBER -> Known.NATIONAL_CLEARING_SYSTEM_NUMBER
                    BIC_CODE -> Known.BIC_CODE
                    IBAN -> Known.IBAN
                    else ->
                        throw IncreaseInvalidDataException(
                            "Unknown OriginatingDepositoryFinancialInstitutionIdQualifier: $value"
                        )
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

            fun validate(): OriginatingDepositoryFinancialInstitutionIdQualifier = apply {
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

                return other is OriginatingDepositoryFinancialInstitutionIdQualifier &&
                    value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * An instruction of how to interpret the `receiving_depository_financial_institution_id`
         * field for this Transaction.
         */
        class ReceivingDepositoryFinancialInstitutionIdQualifier
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

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

                /**
                 * A domestic clearing system number. In the US, for example, this is the American
                 * Banking Association (ABA) routing number.
                 */
                @JvmField
                val NATIONAL_CLEARING_SYSTEM_NUMBER = of("national_clearing_system_number")

                /** The SWIFT Bank Identifier Code (BIC) of the bank. */
                @JvmField val BIC_CODE = of("bic_code")

                /** An International Bank Account Number. */
                @JvmField val IBAN = of("iban")

                @JvmStatic
                fun of(value: String) =
                    ReceivingDepositoryFinancialInstitutionIdQualifier(JsonField.of(value))
            }

            /**
             * An enum containing [ReceivingDepositoryFinancialInstitutionIdQualifier]'s known
             * values.
             */
            enum class Known {
                /**
                 * A domestic clearing system number. In the US, for example, this is the American
                 * Banking Association (ABA) routing number.
                 */
                NATIONAL_CLEARING_SYSTEM_NUMBER,
                /** The SWIFT Bank Identifier Code (BIC) of the bank. */
                BIC_CODE,
                /** An International Bank Account Number. */
                IBAN,
            }

            /**
             * An enum containing [ReceivingDepositoryFinancialInstitutionIdQualifier]'s known
             * values, as well as an [_UNKNOWN] member.
             *
             * An instance of [ReceivingDepositoryFinancialInstitutionIdQualifier] can contain an
             * unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                /**
                 * A domestic clearing system number. In the US, for example, this is the American
                 * Banking Association (ABA) routing number.
                 */
                NATIONAL_CLEARING_SYSTEM_NUMBER,
                /** The SWIFT Bank Identifier Code (BIC) of the bank. */
                BIC_CODE,
                /** An International Bank Account Number. */
                IBAN,
                /**
                 * An enum member indicating that
                 * [ReceivingDepositoryFinancialInstitutionIdQualifier] was instantiated with an
                 * unknown value.
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
                    NATIONAL_CLEARING_SYSTEM_NUMBER -> Value.NATIONAL_CLEARING_SYSTEM_NUMBER
                    BIC_CODE -> Value.BIC_CODE
                    IBAN -> Value.IBAN
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
                    NATIONAL_CLEARING_SYSTEM_NUMBER -> Known.NATIONAL_CLEARING_SYSTEM_NUMBER
                    BIC_CODE -> Known.BIC_CODE
                    IBAN -> Known.IBAN
                    else ->
                        throw IncreaseInvalidDataException(
                            "Unknown ReceivingDepositoryFinancialInstitutionIdQualifier: $value"
                        )
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

            fun validate(): ReceivingDepositoryFinancialInstitutionIdQualifier = apply {
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

                return other is ReceivingDepositoryFinancialInstitutionIdQualifier &&
                    value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is InternationalAddenda &&
                destinationCountryCode == other.destinationCountryCode &&
                destinationCurrencyCode == other.destinationCurrencyCode &&
                foreignExchangeIndicator == other.foreignExchangeIndicator &&
                foreignExchangeReference == other.foreignExchangeReference &&
                foreignExchangeReferenceIndicator == other.foreignExchangeReferenceIndicator &&
                foreignPaymentAmount == other.foreignPaymentAmount &&
                foreignTraceNumber == other.foreignTraceNumber &&
                internationalTransactionTypeCode == other.internationalTransactionTypeCode &&
                originatingCurrencyCode == other.originatingCurrencyCode &&
                originatingDepositoryFinancialInstitutionBranchCountry ==
                    other.originatingDepositoryFinancialInstitutionBranchCountry &&
                originatingDepositoryFinancialInstitutionId ==
                    other.originatingDepositoryFinancialInstitutionId &&
                originatingDepositoryFinancialInstitutionIdQualifier ==
                    other.originatingDepositoryFinancialInstitutionIdQualifier &&
                originatingDepositoryFinancialInstitutionName ==
                    other.originatingDepositoryFinancialInstitutionName &&
                originatorCity == other.originatorCity &&
                originatorCountry == other.originatorCountry &&
                originatorIdentification == other.originatorIdentification &&
                originatorName == other.originatorName &&
                originatorPostalCode == other.originatorPostalCode &&
                originatorStateOrProvince == other.originatorStateOrProvince &&
                originatorStreetAddress == other.originatorStreetAddress &&
                paymentRelatedInformation == other.paymentRelatedInformation &&
                paymentRelatedInformation2 == other.paymentRelatedInformation2 &&
                receiverCity == other.receiverCity &&
                receiverCountry == other.receiverCountry &&
                receiverIdentificationNumber == other.receiverIdentificationNumber &&
                receiverPostalCode == other.receiverPostalCode &&
                receiverStateOrProvince == other.receiverStateOrProvince &&
                receiverStreetAddress == other.receiverStreetAddress &&
                receivingCompanyOrIndividualName == other.receivingCompanyOrIndividualName &&
                receivingDepositoryFinancialInstitutionCountry ==
                    other.receivingDepositoryFinancialInstitutionCountry &&
                receivingDepositoryFinancialInstitutionId ==
                    other.receivingDepositoryFinancialInstitutionId &&
                receivingDepositoryFinancialInstitutionIdQualifier ==
                    other.receivingDepositoryFinancialInstitutionIdQualifier &&
                receivingDepositoryFinancialInstitutionName ==
                    other.receivingDepositoryFinancialInstitutionName &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
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
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "InternationalAddenda{destinationCountryCode=$destinationCountryCode, destinationCurrencyCode=$destinationCurrencyCode, foreignExchangeIndicator=$foreignExchangeIndicator, foreignExchangeReference=$foreignExchangeReference, foreignExchangeReferenceIndicator=$foreignExchangeReferenceIndicator, foreignPaymentAmount=$foreignPaymentAmount, foreignTraceNumber=$foreignTraceNumber, internationalTransactionTypeCode=$internationalTransactionTypeCode, originatingCurrencyCode=$originatingCurrencyCode, originatingDepositoryFinancialInstitutionBranchCountry=$originatingDepositoryFinancialInstitutionBranchCountry, originatingDepositoryFinancialInstitutionId=$originatingDepositoryFinancialInstitutionId, originatingDepositoryFinancialInstitutionIdQualifier=$originatingDepositoryFinancialInstitutionIdQualifier, originatingDepositoryFinancialInstitutionName=$originatingDepositoryFinancialInstitutionName, originatorCity=$originatorCity, originatorCountry=$originatorCountry, originatorIdentification=$originatorIdentification, originatorName=$originatorName, originatorPostalCode=$originatorPostalCode, originatorStateOrProvince=$originatorStateOrProvince, originatorStreetAddress=$originatorStreetAddress, paymentRelatedInformation=$paymentRelatedInformation, paymentRelatedInformation2=$paymentRelatedInformation2, receiverCity=$receiverCity, receiverCountry=$receiverCountry, receiverIdentificationNumber=$receiverIdentificationNumber, receiverPostalCode=$receiverPostalCode, receiverStateOrProvince=$receiverStateOrProvince, receiverStreetAddress=$receiverStreetAddress, receivingCompanyOrIndividualName=$receivingCompanyOrIndividualName, receivingDepositoryFinancialInstitutionCountry=$receivingDepositoryFinancialInstitutionCountry, receivingDepositoryFinancialInstitutionId=$receivingDepositoryFinancialInstitutionId, receivingDepositoryFinancialInstitutionIdQualifier=$receivingDepositoryFinancialInstitutionIdQualifier, receivingDepositoryFinancialInstitutionName=$receivingDepositoryFinancialInstitutionName, additionalProperties=$additionalProperties}"
    }

    /**
     * If you initiate a notification of change in response to the transfer, this will contain its
     * details.
     */
    class NotificationOfChange
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val updatedAccountNumber: JsonField<String>,
        private val updatedRoutingNumber: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("updated_account_number")
            @ExcludeMissing
            updatedAccountNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("updated_routing_number")
            @ExcludeMissing
            updatedRoutingNumber: JsonField<String> = JsonMissing.of(),
        ) : this(updatedAccountNumber, updatedRoutingNumber, mutableMapOf())

        /**
         * The new account number provided in the notification of change.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun updatedAccountNumber(): Optional<String> =
            updatedAccountNumber.getOptional("updated_account_number")

        /**
         * The new routing number provided in the notification of change.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun updatedRoutingNumber(): Optional<String> =
            updatedRoutingNumber.getOptional("updated_routing_number")

        /**
         * Returns the raw JSON value of [updatedAccountNumber].
         *
         * Unlike [updatedAccountNumber], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("updated_account_number")
        @ExcludeMissing
        fun _updatedAccountNumber(): JsonField<String> = updatedAccountNumber

        /**
         * Returns the raw JSON value of [updatedRoutingNumber].
         *
         * Unlike [updatedRoutingNumber], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("updated_routing_number")
        @ExcludeMissing
        fun _updatedRoutingNumber(): JsonField<String> = updatedRoutingNumber

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
             * Returns a mutable builder for constructing an instance of [NotificationOfChange].
             *
             * The following fields are required:
             * ```java
             * .updatedAccountNumber()
             * .updatedRoutingNumber()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [NotificationOfChange]. */
        class Builder internal constructor() {

            private var updatedAccountNumber: JsonField<String>? = null
            private var updatedRoutingNumber: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(notificationOfChange: NotificationOfChange) = apply {
                updatedAccountNumber = notificationOfChange.updatedAccountNumber
                updatedRoutingNumber = notificationOfChange.updatedRoutingNumber
                additionalProperties = notificationOfChange.additionalProperties.toMutableMap()
            }

            /** The new account number provided in the notification of change. */
            fun updatedAccountNumber(updatedAccountNumber: String?) =
                updatedAccountNumber(JsonField.ofNullable(updatedAccountNumber))

            /**
             * Alias for calling [Builder.updatedAccountNumber] with
             * `updatedAccountNumber.orElse(null)`.
             */
            fun updatedAccountNumber(updatedAccountNumber: Optional<String>) =
                updatedAccountNumber(updatedAccountNumber.getOrNull())

            /**
             * Sets [Builder.updatedAccountNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updatedAccountNumber] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun updatedAccountNumber(updatedAccountNumber: JsonField<String>) = apply {
                this.updatedAccountNumber = updatedAccountNumber
            }

            /** The new routing number provided in the notification of change. */
            fun updatedRoutingNumber(updatedRoutingNumber: String?) =
                updatedRoutingNumber(JsonField.ofNullable(updatedRoutingNumber))

            /**
             * Alias for calling [Builder.updatedRoutingNumber] with
             * `updatedRoutingNumber.orElse(null)`.
             */
            fun updatedRoutingNumber(updatedRoutingNumber: Optional<String>) =
                updatedRoutingNumber(updatedRoutingNumber.getOrNull())

            /**
             * Sets [Builder.updatedRoutingNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updatedRoutingNumber] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun updatedRoutingNumber(updatedRoutingNumber: JsonField<String>) = apply {
                this.updatedRoutingNumber = updatedRoutingNumber
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
             * Returns an immutable instance of [NotificationOfChange].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .updatedAccountNumber()
             * .updatedRoutingNumber()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): NotificationOfChange =
                NotificationOfChange(
                    checkRequired("updatedAccountNumber", updatedAccountNumber),
                    checkRequired("updatedRoutingNumber", updatedRoutingNumber),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): NotificationOfChange = apply {
            if (validated) {
                return@apply
            }

            updatedAccountNumber()
            updatedRoutingNumber()
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
            (if (updatedAccountNumber.asKnown().isPresent) 1 else 0) +
                (if (updatedRoutingNumber.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is NotificationOfChange &&
                updatedAccountNumber == other.updatedAccountNumber &&
                updatedRoutingNumber == other.updatedRoutingNumber &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(updatedAccountNumber, updatedRoutingNumber, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "NotificationOfChange{updatedAccountNumber=$updatedAccountNumber, updatedRoutingNumber=$updatedRoutingNumber, additionalProperties=$additionalProperties}"
    }

    /**
     * A subhash containing information about when and how the transfer settled at the Federal
     * Reserve.
     */
    class Settlement
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val settledAt: JsonField<OffsetDateTime>,
        private val settlementSchedule: JsonField<SettlementSchedule>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("settled_at")
            @ExcludeMissing
            settledAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("settlement_schedule")
            @ExcludeMissing
            settlementSchedule: JsonField<SettlementSchedule> = JsonMissing.of(),
        ) : this(settledAt, settlementSchedule, mutableMapOf())

        /**
         * When the funds for this transfer settle at the recipient bank at the Federal Reserve.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun settledAt(): OffsetDateTime = settledAt.getRequired("settled_at")

        /**
         * The settlement schedule this transfer follows.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun settlementSchedule(): SettlementSchedule =
            settlementSchedule.getRequired("settlement_schedule")

        /**
         * Returns the raw JSON value of [settledAt].
         *
         * Unlike [settledAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("settled_at")
        @ExcludeMissing
        fun _settledAt(): JsonField<OffsetDateTime> = settledAt

        /**
         * Returns the raw JSON value of [settlementSchedule].
         *
         * Unlike [settlementSchedule], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("settlement_schedule")
        @ExcludeMissing
        fun _settlementSchedule(): JsonField<SettlementSchedule> = settlementSchedule

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
             * Returns a mutable builder for constructing an instance of [Settlement].
             *
             * The following fields are required:
             * ```java
             * .settledAt()
             * .settlementSchedule()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Settlement]. */
        class Builder internal constructor() {

            private var settledAt: JsonField<OffsetDateTime>? = null
            private var settlementSchedule: JsonField<SettlementSchedule>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(settlement: Settlement) = apply {
                settledAt = settlement.settledAt
                settlementSchedule = settlement.settlementSchedule
                additionalProperties = settlement.additionalProperties.toMutableMap()
            }

            /**
             * When the funds for this transfer settle at the recipient bank at the Federal Reserve.
             */
            fun settledAt(settledAt: OffsetDateTime) = settledAt(JsonField.of(settledAt))

            /**
             * Sets [Builder.settledAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.settledAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun settledAt(settledAt: JsonField<OffsetDateTime>) = apply {
                this.settledAt = settledAt
            }

            /** The settlement schedule this transfer follows. */
            fun settlementSchedule(settlementSchedule: SettlementSchedule) =
                settlementSchedule(JsonField.of(settlementSchedule))

            /**
             * Sets [Builder.settlementSchedule] to an arbitrary JSON value.
             *
             * You should usually call [Builder.settlementSchedule] with a well-typed
             * [SettlementSchedule] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun settlementSchedule(settlementSchedule: JsonField<SettlementSchedule>) = apply {
                this.settlementSchedule = settlementSchedule
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
             * Returns an immutable instance of [Settlement].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .settledAt()
             * .settlementSchedule()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Settlement =
                Settlement(
                    checkRequired("settledAt", settledAt),
                    checkRequired("settlementSchedule", settlementSchedule),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Settlement = apply {
            if (validated) {
                return@apply
            }

            settledAt()
            settlementSchedule().validate()
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
            (if (settledAt.asKnown().isPresent) 1 else 0) +
                (settlementSchedule.asKnown().getOrNull()?.validity() ?: 0)

        /** The settlement schedule this transfer follows. */
        class SettlementSchedule
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

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

                /** The transfer is expected to settle same-day. */
                @JvmField val SAME_DAY = of("same_day")

                /** The transfer is expected to settle on a future date. */
                @JvmField val FUTURE_DATED = of("future_dated")

                @JvmStatic fun of(value: String) = SettlementSchedule(JsonField.of(value))
            }

            /** An enum containing [SettlementSchedule]'s known values. */
            enum class Known {
                /** The transfer is expected to settle same-day. */
                SAME_DAY,
                /** The transfer is expected to settle on a future date. */
                FUTURE_DATED,
            }

            /**
             * An enum containing [SettlementSchedule]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [SettlementSchedule] can contain an unknown value in a couple of
             * cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                /** The transfer is expected to settle same-day. */
                SAME_DAY,
                /** The transfer is expected to settle on a future date. */
                FUTURE_DATED,
                /**
                 * An enum member indicating that [SettlementSchedule] was instantiated with an
                 * unknown value.
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
                    SAME_DAY -> Value.SAME_DAY
                    FUTURE_DATED -> Value.FUTURE_DATED
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
                    SAME_DAY -> Known.SAME_DAY
                    FUTURE_DATED -> Known.FUTURE_DATED
                    else -> throw IncreaseInvalidDataException("Unknown SettlementSchedule: $value")
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

            fun validate(): SettlementSchedule = apply {
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

                return other is SettlementSchedule && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Settlement &&
                settledAt == other.settledAt &&
                settlementSchedule == other.settlementSchedule &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(settledAt, settlementSchedule, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Settlement{settledAt=$settledAt, settlementSchedule=$settlementSchedule, additionalProperties=$additionalProperties}"
    }

    /** The Standard Entry Class (SEC) code of the transfer. */
    class StandardEntryClassCode
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            /** Corporate Credit and Debit (CCD). */
            @JvmField val CORPORATE_CREDIT_OR_DEBIT = of("corporate_credit_or_debit")

            /** Corporate Trade Exchange (CTX). */
            @JvmField val CORPORATE_TRADE_EXCHANGE = of("corporate_trade_exchange")

            /** Prearranged Payments and Deposits (PPD). */
            @JvmField val PREARRANGED_PAYMENTS_AND_DEPOSIT = of("prearranged_payments_and_deposit")

            /** Internet Initiated (WEB). */
            @JvmField val INTERNET_INITIATED = of("internet_initiated")

            /** Point of Sale (POS). */
            @JvmField val POINT_OF_SALE = of("point_of_sale")

            /** Telephone Initiated (TEL). */
            @JvmField val TELEPHONE_INITIATED = of("telephone_initiated")

            /** Customer Initiated (CIE). */
            @JvmField val CUSTOMER_INITIATED = of("customer_initiated")

            /** Accounts Receivable (ARC). */
            @JvmField val ACCOUNTS_RECEIVABLE = of("accounts_receivable")

            /** Machine Transfer (MTE). */
            @JvmField val MACHINE_TRANSFER = of("machine_transfer")

            /** Shared Network Transaction (SHR). */
            @JvmField val SHARED_NETWORK_TRANSACTION = of("shared_network_transaction")

            /** Represented Check (RCK). */
            @JvmField val REPRESENTED_CHECK = of("represented_check")

            /** Back Office Conversion (BOC). */
            @JvmField val BACK_OFFICE_CONVERSION = of("back_office_conversion")

            /** Point of Purchase (POP). */
            @JvmField val POINT_OF_PURCHASE = of("point_of_purchase")

            /** Check Truncation (TRC). */
            @JvmField val CHECK_TRUNCATION = of("check_truncation")

            /** Destroyed Check (XCK). */
            @JvmField val DESTROYED_CHECK = of("destroyed_check")

            /** International ACH Transaction (IAT). */
            @JvmField val INTERNATIONAL_ACH_TRANSACTION = of("international_ach_transaction")

            @JvmStatic fun of(value: String) = StandardEntryClassCode(JsonField.of(value))
        }

        /** An enum containing [StandardEntryClassCode]'s known values. */
        enum class Known {
            /** Corporate Credit and Debit (CCD). */
            CORPORATE_CREDIT_OR_DEBIT,
            /** Corporate Trade Exchange (CTX). */
            CORPORATE_TRADE_EXCHANGE,
            /** Prearranged Payments and Deposits (PPD). */
            PREARRANGED_PAYMENTS_AND_DEPOSIT,
            /** Internet Initiated (WEB). */
            INTERNET_INITIATED,
            /** Point of Sale (POS). */
            POINT_OF_SALE,
            /** Telephone Initiated (TEL). */
            TELEPHONE_INITIATED,
            /** Customer Initiated (CIE). */
            CUSTOMER_INITIATED,
            /** Accounts Receivable (ARC). */
            ACCOUNTS_RECEIVABLE,
            /** Machine Transfer (MTE). */
            MACHINE_TRANSFER,
            /** Shared Network Transaction (SHR). */
            SHARED_NETWORK_TRANSACTION,
            /** Represented Check (RCK). */
            REPRESENTED_CHECK,
            /** Back Office Conversion (BOC). */
            BACK_OFFICE_CONVERSION,
            /** Point of Purchase (POP). */
            POINT_OF_PURCHASE,
            /** Check Truncation (TRC). */
            CHECK_TRUNCATION,
            /** Destroyed Check (XCK). */
            DESTROYED_CHECK,
            /** International ACH Transaction (IAT). */
            INTERNATIONAL_ACH_TRANSACTION,
        }

        /**
         * An enum containing [StandardEntryClassCode]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [StandardEntryClassCode] can contain an unknown value in a couple of
         * cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            /** Corporate Credit and Debit (CCD). */
            CORPORATE_CREDIT_OR_DEBIT,
            /** Corporate Trade Exchange (CTX). */
            CORPORATE_TRADE_EXCHANGE,
            /** Prearranged Payments and Deposits (PPD). */
            PREARRANGED_PAYMENTS_AND_DEPOSIT,
            /** Internet Initiated (WEB). */
            INTERNET_INITIATED,
            /** Point of Sale (POS). */
            POINT_OF_SALE,
            /** Telephone Initiated (TEL). */
            TELEPHONE_INITIATED,
            /** Customer Initiated (CIE). */
            CUSTOMER_INITIATED,
            /** Accounts Receivable (ARC). */
            ACCOUNTS_RECEIVABLE,
            /** Machine Transfer (MTE). */
            MACHINE_TRANSFER,
            /** Shared Network Transaction (SHR). */
            SHARED_NETWORK_TRANSACTION,
            /** Represented Check (RCK). */
            REPRESENTED_CHECK,
            /** Back Office Conversion (BOC). */
            BACK_OFFICE_CONVERSION,
            /** Point of Purchase (POP). */
            POINT_OF_PURCHASE,
            /** Check Truncation (TRC). */
            CHECK_TRUNCATION,
            /** Destroyed Check (XCK). */
            DESTROYED_CHECK,
            /** International ACH Transaction (IAT). */
            INTERNATIONAL_ACH_TRANSACTION,
            /**
             * An enum member indicating that [StandardEntryClassCode] was instantiated with an
             * unknown value.
             */
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
                CORPORATE_CREDIT_OR_DEBIT -> Value.CORPORATE_CREDIT_OR_DEBIT
                CORPORATE_TRADE_EXCHANGE -> Value.CORPORATE_TRADE_EXCHANGE
                PREARRANGED_PAYMENTS_AND_DEPOSIT -> Value.PREARRANGED_PAYMENTS_AND_DEPOSIT
                INTERNET_INITIATED -> Value.INTERNET_INITIATED
                POINT_OF_SALE -> Value.POINT_OF_SALE
                TELEPHONE_INITIATED -> Value.TELEPHONE_INITIATED
                CUSTOMER_INITIATED -> Value.CUSTOMER_INITIATED
                ACCOUNTS_RECEIVABLE -> Value.ACCOUNTS_RECEIVABLE
                MACHINE_TRANSFER -> Value.MACHINE_TRANSFER
                SHARED_NETWORK_TRANSACTION -> Value.SHARED_NETWORK_TRANSACTION
                REPRESENTED_CHECK -> Value.REPRESENTED_CHECK
                BACK_OFFICE_CONVERSION -> Value.BACK_OFFICE_CONVERSION
                POINT_OF_PURCHASE -> Value.POINT_OF_PURCHASE
                CHECK_TRUNCATION -> Value.CHECK_TRUNCATION
                DESTROYED_CHECK -> Value.DESTROYED_CHECK
                INTERNATIONAL_ACH_TRANSACTION -> Value.INTERNATIONAL_ACH_TRANSACTION
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
                CORPORATE_CREDIT_OR_DEBIT -> Known.CORPORATE_CREDIT_OR_DEBIT
                CORPORATE_TRADE_EXCHANGE -> Known.CORPORATE_TRADE_EXCHANGE
                PREARRANGED_PAYMENTS_AND_DEPOSIT -> Known.PREARRANGED_PAYMENTS_AND_DEPOSIT
                INTERNET_INITIATED -> Known.INTERNET_INITIATED
                POINT_OF_SALE -> Known.POINT_OF_SALE
                TELEPHONE_INITIATED -> Known.TELEPHONE_INITIATED
                CUSTOMER_INITIATED -> Known.CUSTOMER_INITIATED
                ACCOUNTS_RECEIVABLE -> Known.ACCOUNTS_RECEIVABLE
                MACHINE_TRANSFER -> Known.MACHINE_TRANSFER
                SHARED_NETWORK_TRANSACTION -> Known.SHARED_NETWORK_TRANSACTION
                REPRESENTED_CHECK -> Known.REPRESENTED_CHECK
                BACK_OFFICE_CONVERSION -> Known.BACK_OFFICE_CONVERSION
                POINT_OF_PURCHASE -> Known.POINT_OF_PURCHASE
                CHECK_TRUNCATION -> Known.CHECK_TRUNCATION
                DESTROYED_CHECK -> Known.DESTROYED_CHECK
                INTERNATIONAL_ACH_TRANSACTION -> Known.INTERNATIONAL_ACH_TRANSACTION
                else -> throw IncreaseInvalidDataException("Unknown StandardEntryClassCode: $value")
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

        fun validate(): StandardEntryClassCode = apply {
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

            return other is StandardEntryClassCode && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
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
             * The Inbound ACH Transfer is awaiting action, will transition automatically if no
             * action is taken.
             */
            @JvmField val PENDING = of("pending")

            /** The Inbound ACH Transfer has been declined. */
            @JvmField val DECLINED = of("declined")

            /** The Inbound ACH Transfer is accepted. */
            @JvmField val ACCEPTED = of("accepted")

            /** The Inbound ACH Transfer has been returned. */
            @JvmField val RETURNED = of("returned")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            /**
             * The Inbound ACH Transfer is awaiting action, will transition automatically if no
             * action is taken.
             */
            PENDING,
            /** The Inbound ACH Transfer has been declined. */
            DECLINED,
            /** The Inbound ACH Transfer is accepted. */
            ACCEPTED,
            /** The Inbound ACH Transfer has been returned. */
            RETURNED,
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
             * The Inbound ACH Transfer is awaiting action, will transition automatically if no
             * action is taken.
             */
            PENDING,
            /** The Inbound ACH Transfer has been declined. */
            DECLINED,
            /** The Inbound ACH Transfer is accepted. */
            ACCEPTED,
            /** The Inbound ACH Transfer has been returned. */
            RETURNED,
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
                DECLINED -> Value.DECLINED
                ACCEPTED -> Value.ACCEPTED
                RETURNED -> Value.RETURNED
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
                DECLINED -> Known.DECLINED
                ACCEPTED -> Known.ACCEPTED
                RETURNED -> Known.RETURNED
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

    /** If your transfer is returned, this will contain details of the return. */
    class TransferReturn
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val reason: JsonField<Reason>,
        private val returnedAt: JsonField<OffsetDateTime>,
        private val transactionId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("reason") @ExcludeMissing reason: JsonField<Reason> = JsonMissing.of(),
            @JsonProperty("returned_at")
            @ExcludeMissing
            returnedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("transaction_id")
            @ExcludeMissing
            transactionId: JsonField<String> = JsonMissing.of(),
        ) : this(reason, returnedAt, transactionId, mutableMapOf())

        /**
         * The reason for the transfer return.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun reason(): Reason = reason.getRequired("reason")

        /**
         * The time at which the transfer was returned.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun returnedAt(): OffsetDateTime = returnedAt.getRequired("returned_at")

        /**
         * The id of the transaction for the returned transfer.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun transactionId(): String = transactionId.getRequired("transaction_id")

        /**
         * Returns the raw JSON value of [reason].
         *
         * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<Reason> = reason

        /**
         * Returns the raw JSON value of [returnedAt].
         *
         * Unlike [returnedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("returned_at")
        @ExcludeMissing
        fun _returnedAt(): JsonField<OffsetDateTime> = returnedAt

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
             * Returns a mutable builder for constructing an instance of [TransferReturn].
             *
             * The following fields are required:
             * ```java
             * .reason()
             * .returnedAt()
             * .transactionId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [TransferReturn]. */
        class Builder internal constructor() {

            private var reason: JsonField<Reason>? = null
            private var returnedAt: JsonField<OffsetDateTime>? = null
            private var transactionId: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(transferReturn: TransferReturn) = apply {
                reason = transferReturn.reason
                returnedAt = transferReturn.returnedAt
                transactionId = transferReturn.transactionId
                additionalProperties = transferReturn.additionalProperties.toMutableMap()
            }

            /** The reason for the transfer return. */
            fun reason(reason: Reason) = reason(JsonField.of(reason))

            /**
             * Sets [Builder.reason] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reason] with a well-typed [Reason] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun reason(reason: JsonField<Reason>) = apply { this.reason = reason }

            /** The time at which the transfer was returned. */
            fun returnedAt(returnedAt: OffsetDateTime) = returnedAt(JsonField.of(returnedAt))

            /**
             * Sets [Builder.returnedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.returnedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun returnedAt(returnedAt: JsonField<OffsetDateTime>) = apply {
                this.returnedAt = returnedAt
            }

            /** The id of the transaction for the returned transfer. */
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
             * Returns an immutable instance of [TransferReturn].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .reason()
             * .returnedAt()
             * .transactionId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): TransferReturn =
                TransferReturn(
                    checkRequired("reason", reason),
                    checkRequired("returnedAt", returnedAt),
                    checkRequired("transactionId", transactionId),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): TransferReturn = apply {
            if (validated) {
                return@apply
            }

            reason().validate()
            returnedAt()
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
            (reason.asKnown().getOrNull()?.validity() ?: 0) +
                (if (returnedAt.asKnown().isPresent) 1 else 0) +
                (if (transactionId.asKnown().isPresent) 1 else 0)

        /** The reason for the transfer return. */
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

                /**
                 * The customer's account has insufficient funds. This reason is only allowed for
                 * debits. The Nacha return code is R01.
                 */
                @JvmField val INSUFFICIENT_FUNDS = of("insufficient_funds")

                /**
                 * The originating financial institution asked for this transfer to be returned. The
                 * receiving bank is complying with the request. The Nacha return code is R06.
                 */
                @JvmField val RETURNED_PER_ODFI_REQUEST = of("returned_per_odfi_request")

                /**
                 * The customer no longer authorizes this transaction. The Nacha return code is R07.
                 */
                @JvmField
                val AUTHORIZATION_REVOKED_BY_CUSTOMER = of("authorization_revoked_by_customer")

                /**
                 * The customer asked for the payment to be stopped. This reason is only allowed for
                 * debits. The Nacha return code is R08.
                 */
                @JvmField val PAYMENT_STOPPED = of("payment_stopped")

                /**
                 * The customer advises that the debit was unauthorized. The Nacha return code is
                 * R10.
                 */
                @JvmField
                val CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE =
                    of("customer_advised_unauthorized_improper_ineligible_or_incomplete")

                /** The payee is deceased. The Nacha return code is R14. */
                @JvmField
                val REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY =
                    of("representative_payee_deceased_or_unable_to_continue_in_that_capacity")

                /** The account holder is deceased. The Nacha return code is R15. */
                @JvmField
                val BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED =
                    of("beneficiary_or_account_holder_deceased")

                /**
                 * The customer refused a credit entry. This reason is only allowed for credits. The
                 * Nacha return code is R23.
                 */
                @JvmField
                val CREDIT_ENTRY_REFUSED_BY_RECEIVER = of("credit_entry_refused_by_receiver")

                /**
                 * The account holder identified this transaction as a duplicate. The Nacha return
                 * code is R24.
                 */
                @JvmField val DUPLICATE_ENTRY = of("duplicate_entry")

                /**
                 * The corporate customer no longer authorizes this transaction. The Nacha return
                 * code is R29.
                 */
                @JvmField
                val CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED =
                    of("corporate_customer_advised_not_authorized")

                @JvmStatic fun of(value: String) = Reason(JsonField.of(value))
            }

            /** An enum containing [Reason]'s known values. */
            enum class Known {
                /**
                 * The customer's account has insufficient funds. This reason is only allowed for
                 * debits. The Nacha return code is R01.
                 */
                INSUFFICIENT_FUNDS,
                /**
                 * The originating financial institution asked for this transfer to be returned. The
                 * receiving bank is complying with the request. The Nacha return code is R06.
                 */
                RETURNED_PER_ODFI_REQUEST,
                /**
                 * The customer no longer authorizes this transaction. The Nacha return code is R07.
                 */
                AUTHORIZATION_REVOKED_BY_CUSTOMER,
                /**
                 * The customer asked for the payment to be stopped. This reason is only allowed for
                 * debits. The Nacha return code is R08.
                 */
                PAYMENT_STOPPED,
                /**
                 * The customer advises that the debit was unauthorized. The Nacha return code is
                 * R10.
                 */
                CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE,
                /** The payee is deceased. The Nacha return code is R14. */
                REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY,
                /** The account holder is deceased. The Nacha return code is R15. */
                BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED,
                /**
                 * The customer refused a credit entry. This reason is only allowed for credits. The
                 * Nacha return code is R23.
                 */
                CREDIT_ENTRY_REFUSED_BY_RECEIVER,
                /**
                 * The account holder identified this transaction as a duplicate. The Nacha return
                 * code is R24.
                 */
                DUPLICATE_ENTRY,
                /**
                 * The corporate customer no longer authorizes this transaction. The Nacha return
                 * code is R29.
                 */
                CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED,
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
                /**
                 * The customer's account has insufficient funds. This reason is only allowed for
                 * debits. The Nacha return code is R01.
                 */
                INSUFFICIENT_FUNDS,
                /**
                 * The originating financial institution asked for this transfer to be returned. The
                 * receiving bank is complying with the request. The Nacha return code is R06.
                 */
                RETURNED_PER_ODFI_REQUEST,
                /**
                 * The customer no longer authorizes this transaction. The Nacha return code is R07.
                 */
                AUTHORIZATION_REVOKED_BY_CUSTOMER,
                /**
                 * The customer asked for the payment to be stopped. This reason is only allowed for
                 * debits. The Nacha return code is R08.
                 */
                PAYMENT_STOPPED,
                /**
                 * The customer advises that the debit was unauthorized. The Nacha return code is
                 * R10.
                 */
                CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE,
                /** The payee is deceased. The Nacha return code is R14. */
                REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY,
                /** The account holder is deceased. The Nacha return code is R15. */
                BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED,
                /**
                 * The customer refused a credit entry. This reason is only allowed for credits. The
                 * Nacha return code is R23.
                 */
                CREDIT_ENTRY_REFUSED_BY_RECEIVER,
                /**
                 * The account holder identified this transaction as a duplicate. The Nacha return
                 * code is R24.
                 */
                DUPLICATE_ENTRY,
                /**
                 * The corporate customer no longer authorizes this transaction. The Nacha return
                 * code is R29.
                 */
                CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED,
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
                    INSUFFICIENT_FUNDS -> Value.INSUFFICIENT_FUNDS
                    RETURNED_PER_ODFI_REQUEST -> Value.RETURNED_PER_ODFI_REQUEST
                    AUTHORIZATION_REVOKED_BY_CUSTOMER -> Value.AUTHORIZATION_REVOKED_BY_CUSTOMER
                    PAYMENT_STOPPED -> Value.PAYMENT_STOPPED
                    CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE ->
                        Value.CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE
                    REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY ->
                        Value.REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY
                    BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED ->
                        Value.BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED
                    CREDIT_ENTRY_REFUSED_BY_RECEIVER -> Value.CREDIT_ENTRY_REFUSED_BY_RECEIVER
                    DUPLICATE_ENTRY -> Value.DUPLICATE_ENTRY
                    CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED ->
                        Value.CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED
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
                    INSUFFICIENT_FUNDS -> Known.INSUFFICIENT_FUNDS
                    RETURNED_PER_ODFI_REQUEST -> Known.RETURNED_PER_ODFI_REQUEST
                    AUTHORIZATION_REVOKED_BY_CUSTOMER -> Known.AUTHORIZATION_REVOKED_BY_CUSTOMER
                    PAYMENT_STOPPED -> Known.PAYMENT_STOPPED
                    CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE ->
                        Known.CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE
                    REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY ->
                        Known.REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY
                    BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED ->
                        Known.BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED
                    CREDIT_ENTRY_REFUSED_BY_RECEIVER -> Known.CREDIT_ENTRY_REFUSED_BY_RECEIVER
                    DUPLICATE_ENTRY -> Known.DUPLICATE_ENTRY
                    CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED ->
                        Known.CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED
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

            return other is TransferReturn &&
                reason == other.reason &&
                returnedAt == other.returnedAt &&
                transactionId == other.transactionId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(reason, returnedAt, transactionId, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "TransferReturn{reason=$reason, returnedAt=$returnedAt, transactionId=$transactionId, additionalProperties=$additionalProperties}"
    }

    /**
     * A constant representing the object's type. For this resource it will always be
     * `inbound_ach_transfer`.
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

            @JvmField val INBOUND_ACH_TRANSFER = of("inbound_ach_transfer")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            INBOUND_ACH_TRANSFER
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
            INBOUND_ACH_TRANSFER,
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
                INBOUND_ACH_TRANSFER -> Value.INBOUND_ACH_TRANSFER
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
                INBOUND_ACH_TRANSFER -> Known.INBOUND_ACH_TRANSFER
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

        return other is InboundAchTransfer &&
            id == other.id &&
            acceptance == other.acceptance &&
            accountId == other.accountId &&
            accountNumberId == other.accountNumberId &&
            addenda == other.addenda &&
            amount == other.amount &&
            automaticallyResolvesAt == other.automaticallyResolvesAt &&
            createdAt == other.createdAt &&
            decline == other.decline &&
            direction == other.direction &&
            effectiveDate == other.effectiveDate &&
            internationalAddenda == other.internationalAddenda &&
            notificationOfChange == other.notificationOfChange &&
            originatorCompanyDescriptiveDate == other.originatorCompanyDescriptiveDate &&
            originatorCompanyDiscretionaryData == other.originatorCompanyDiscretionaryData &&
            originatorCompanyEntryDescription == other.originatorCompanyEntryDescription &&
            originatorCompanyId == other.originatorCompanyId &&
            originatorCompanyName == other.originatorCompanyName &&
            originatorRoutingNumber == other.originatorRoutingNumber &&
            receiverIdNumber == other.receiverIdNumber &&
            receiverName == other.receiverName &&
            settlement == other.settlement &&
            standardEntryClassCode == other.standardEntryClassCode &&
            status == other.status &&
            traceNumber == other.traceNumber &&
            transferReturn == other.transferReturn &&
            type == other.type &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            acceptance,
            accountId,
            accountNumberId,
            addenda,
            amount,
            automaticallyResolvesAt,
            createdAt,
            decline,
            direction,
            effectiveDate,
            internationalAddenda,
            notificationOfChange,
            originatorCompanyDescriptiveDate,
            originatorCompanyDiscretionaryData,
            originatorCompanyEntryDescription,
            originatorCompanyId,
            originatorCompanyName,
            originatorRoutingNumber,
            receiverIdNumber,
            receiverName,
            settlement,
            standardEntryClassCode,
            status,
            traceNumber,
            transferReturn,
            type,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InboundAchTransfer{id=$id, acceptance=$acceptance, accountId=$accountId, accountNumberId=$accountNumberId, addenda=$addenda, amount=$amount, automaticallyResolvesAt=$automaticallyResolvesAt, createdAt=$createdAt, decline=$decline, direction=$direction, effectiveDate=$effectiveDate, internationalAddenda=$internationalAddenda, notificationOfChange=$notificationOfChange, originatorCompanyDescriptiveDate=$originatorCompanyDescriptiveDate, originatorCompanyDiscretionaryData=$originatorCompanyDiscretionaryData, originatorCompanyEntryDescription=$originatorCompanyEntryDescription, originatorCompanyId=$originatorCompanyId, originatorCompanyName=$originatorCompanyName, originatorRoutingNumber=$originatorRoutingNumber, receiverIdNumber=$receiverIdNumber, receiverName=$receiverName, settlement=$settlement, standardEntryClassCode=$standardEntryClassCode, status=$status, traceNumber=$traceNumber, transferReturn=$transferReturn, type=$type, additionalProperties=$additionalProperties}"
}
