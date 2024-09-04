// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import java.util.UUID
import com.increase.api.core.BaseDeserializer
import com.increase.api.core.BaseSerializer
import com.increase.api.core.getOrThrow
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.JsonNull
import com.increase.api.core.JsonField
import com.increase.api.core.Enum
import com.increase.api.core.toUnmodifiable
import com.increase.api.core.NoAutoDetect
import com.increase.api.errors.IncreaseInvalidDataException

/**
 * An Inbound ACH Transfer is an ACH transfer initiated outside of Increase to your
 * account.
 */
@JsonDeserialize(builder = InboundAchTransfer.Builder::class)
@NoAutoDetect
class InboundAchTransfer private constructor(
  private val acceptance: JsonField<Acceptance>,
  private val accountId: JsonField<String>,
  private val accountNumberId: JsonField<String>,
  private val addenda: JsonField<Addenda>,
  private val amount: JsonField<Long>,
  private val automaticallyResolvesAt: JsonField<OffsetDateTime>,
  private val decline: JsonField<Decline>,
  private val direction: JsonField<Direction>,
  private val expectedSettlementSchedule: JsonField<ExpectedSettlementSchedule>,
  private val id: JsonField<String>,
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
  private val standardEntryClassCode: JsonField<StandardEntryClassCode>,
  private val status: JsonField<Status>,
  private val traceNumber: JsonField<String>,
  private val transferReturn: JsonField<TransferReturn>,
  private val type: JsonField<Type>,
  private val additionalProperties: Map<String, JsonValue>,

) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** If your transfer is accepted, this will contain details of the acceptance. */
    fun acceptance(): Optional<Acceptance> = Optional.ofNullable(acceptance.getNullable("acceptance"))

    /** The Account to which the transfer belongs. */
    fun accountId(): String = accountId.getRequired("account_id")

    /** The identifier of the Account Number to which this transfer was sent. */
    fun accountNumberId(): String = accountNumberId.getRequired("account_number_id")

    /** Additional information sent from the originator. */
    fun addenda(): Optional<Addenda> = Optional.ofNullable(addenda.getNullable("addenda"))

    /** The transfer amount in USD cents. */
    fun amount(): Long = amount.getRequired("amount")

    /** The time at which the transfer will be automatically resolved. */
    fun automaticallyResolvesAt(): OffsetDateTime = automaticallyResolvesAt.getRequired("automatically_resolves_at")

    /** If your transfer is declined, this will contain details of the decline. */
    fun decline(): Optional<Decline> = Optional.ofNullable(decline.getNullable("decline"))

    /** The direction of the transfer. */
    fun direction(): Direction = direction.getRequired("direction")

    /** The settlement schedule the transfer is expected to follow. */
    fun expectedSettlementSchedule(): ExpectedSettlementSchedule = expectedSettlementSchedule.getRequired("expected_settlement_schedule")

    /** The inbound ACH transfer's identifier. */
    fun id(): String = id.getRequired("id")

    /**
     * If the Inbound ACH Transfer has a Standard Entry Class Code of IAT, this will
     * contain fields pertaining to the International ACH Transaction.
     */
    fun internationalAddenda(): Optional<InternationalAddenda> = Optional.ofNullable(internationalAddenda.getNullable("international_addenda"))

    /**
     * If you initiate a notification of change in response to the transfer, this will
     * contain its details.
     */
    fun notificationOfChange(): Optional<NotificationOfChange> = Optional.ofNullable(notificationOfChange.getNullable("notification_of_change"))

    /** The descriptive date of the transfer. */
    fun originatorCompanyDescriptiveDate(): Optional<String> = Optional.ofNullable(originatorCompanyDescriptiveDate.getNullable("originator_company_descriptive_date"))

    /** The additional information included with the transfer. */
    fun originatorCompanyDiscretionaryData(): Optional<String> = Optional.ofNullable(originatorCompanyDiscretionaryData.getNullable("originator_company_discretionary_data"))

    /** The description of the transfer. */
    fun originatorCompanyEntryDescription(): String = originatorCompanyEntryDescription.getRequired("originator_company_entry_description")

    /** The id of the company that initiated the transfer. */
    fun originatorCompanyId(): String = originatorCompanyId.getRequired("originator_company_id")

    /** The name of the company that initiated the transfer. */
    fun originatorCompanyName(): String = originatorCompanyName.getRequired("originator_company_name")

    /**
     * The American Banking Association (ABA) routing number of the bank originating
     * the transfer.
     */
    fun originatorRoutingNumber(): String = originatorRoutingNumber.getRequired("originator_routing_number")

    /** The id of the receiver of the transfer. */
    fun receiverIdNumber(): Optional<String> = Optional.ofNullable(receiverIdNumber.getNullable("receiver_id_number"))

    /** The name of the receiver of the transfer. */
    fun receiverName(): Optional<String> = Optional.ofNullable(receiverName.getNullable("receiver_name"))

    /** The Standard Entry Class (SEC) code of the transfer. */
    fun standardEntryClassCode(): StandardEntryClassCode = standardEntryClassCode.getRequired("standard_entry_class_code")

    /** The status of the transfer. */
    fun status(): Status = status.getRequired("status")

    /** The trace number of the transfer. */
    fun traceNumber(): String = traceNumber.getRequired("trace_number")

    /** If your transfer is returned, this will contain details of the return. */
    fun transferReturn(): Optional<TransferReturn> = Optional.ofNullable(transferReturn.getNullable("transfer_return"))

    /**
     * A constant representing the object's type. For this resource it will always be
     * `inbound_ach_transfer`.
     */
    fun type(): Type = type.getRequired("type")

    /** If your transfer is accepted, this will contain details of the acceptance. */
    @JsonProperty("acceptance")
    @ExcludeMissing
    fun _acceptance() = acceptance

    /** The Account to which the transfer belongs. */
    @JsonProperty("account_id")
    @ExcludeMissing
    fun _accountId() = accountId

    /** The identifier of the Account Number to which this transfer was sent. */
    @JsonProperty("account_number_id")
    @ExcludeMissing
    fun _accountNumberId() = accountNumberId

    /** Additional information sent from the originator. */
    @JsonProperty("addenda")
    @ExcludeMissing
    fun _addenda() = addenda

    /** The transfer amount in USD cents. */
    @JsonProperty("amount")
    @ExcludeMissing
    fun _amount() = amount

    /** The time at which the transfer will be automatically resolved. */
    @JsonProperty("automatically_resolves_at")
    @ExcludeMissing
    fun _automaticallyResolvesAt() = automaticallyResolvesAt

    /** If your transfer is declined, this will contain details of the decline. */
    @JsonProperty("decline")
    @ExcludeMissing
    fun _decline() = decline

    /** The direction of the transfer. */
    @JsonProperty("direction")
    @ExcludeMissing
    fun _direction() = direction

    /** The settlement schedule the transfer is expected to follow. */
    @JsonProperty("expected_settlement_schedule")
    @ExcludeMissing
    fun _expectedSettlementSchedule() = expectedSettlementSchedule

    /** The inbound ACH transfer's identifier. */
    @JsonProperty("id")
    @ExcludeMissing
    fun _id() = id

    /**
     * If the Inbound ACH Transfer has a Standard Entry Class Code of IAT, this will
     * contain fields pertaining to the International ACH Transaction.
     */
    @JsonProperty("international_addenda")
    @ExcludeMissing
    fun _internationalAddenda() = internationalAddenda

    /**
     * If you initiate a notification of change in response to the transfer, this will
     * contain its details.
     */
    @JsonProperty("notification_of_change")
    @ExcludeMissing
    fun _notificationOfChange() = notificationOfChange

    /** The descriptive date of the transfer. */
    @JsonProperty("originator_company_descriptive_date")
    @ExcludeMissing
    fun _originatorCompanyDescriptiveDate() = originatorCompanyDescriptiveDate

    /** The additional information included with the transfer. */
    @JsonProperty("originator_company_discretionary_data")
    @ExcludeMissing
    fun _originatorCompanyDiscretionaryData() = originatorCompanyDiscretionaryData

    /** The description of the transfer. */
    @JsonProperty("originator_company_entry_description")
    @ExcludeMissing
    fun _originatorCompanyEntryDescription() = originatorCompanyEntryDescription

    /** The id of the company that initiated the transfer. */
    @JsonProperty("originator_company_id")
    @ExcludeMissing
    fun _originatorCompanyId() = originatorCompanyId

    /** The name of the company that initiated the transfer. */
    @JsonProperty("originator_company_name")
    @ExcludeMissing
    fun _originatorCompanyName() = originatorCompanyName

    /**
     * The American Banking Association (ABA) routing number of the bank originating
     * the transfer.
     */
    @JsonProperty("originator_routing_number")
    @ExcludeMissing
    fun _originatorRoutingNumber() = originatorRoutingNumber

    /** The id of the receiver of the transfer. */
    @JsonProperty("receiver_id_number")
    @ExcludeMissing
    fun _receiverIdNumber() = receiverIdNumber

    /** The name of the receiver of the transfer. */
    @JsonProperty("receiver_name")
    @ExcludeMissing
    fun _receiverName() = receiverName

    /** The Standard Entry Class (SEC) code of the transfer. */
    @JsonProperty("standard_entry_class_code")
    @ExcludeMissing
    fun _standardEntryClassCode() = standardEntryClassCode

    /** The status of the transfer. */
    @JsonProperty("status")
    @ExcludeMissing
    fun _status() = status

    /** The trace number of the transfer. */
    @JsonProperty("trace_number")
    @ExcludeMissing
    fun _traceNumber() = traceNumber

    /** If your transfer is returned, this will contain details of the return. */
    @JsonProperty("transfer_return")
    @ExcludeMissing
    fun _transferReturn() = transferReturn

    /**
     * A constant representing the object's type. For this resource it will always be
     * `inbound_ach_transfer`.
     */
    @JsonProperty("type")
    @ExcludeMissing
    fun _type() = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): InboundAchTransfer = apply {
        if (!validated) {
          acceptance().map { it.validate() }
          accountId()
          accountNumberId()
          addenda().map { it.validate() }
          amount()
          automaticallyResolvesAt()
          decline().map { it.validate() }
          direction()
          expectedSettlementSchedule()
          id()
          internationalAddenda().map { it.validate() }
          notificationOfChange().map { it.validate() }
          originatorCompanyDescriptiveDate()
          originatorCompanyDiscretionaryData()
          originatorCompanyEntryDescription()
          originatorCompanyId()
          originatorCompanyName()
          originatorRoutingNumber()
          receiverIdNumber()
          receiverName()
          standardEntryClassCode()
          status()
          traceNumber()
          transferReturn().map { it.validate() }
          type()
          validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return other is InboundAchTransfer &&
          this.acceptance == other.acceptance &&
          this.accountId == other.accountId &&
          this.accountNumberId == other.accountNumberId &&
          this.addenda == other.addenda &&
          this.amount == other.amount &&
          this.automaticallyResolvesAt == other.automaticallyResolvesAt &&
          this.decline == other.decline &&
          this.direction == other.direction &&
          this.expectedSettlementSchedule == other.expectedSettlementSchedule &&
          this.id == other.id &&
          this.internationalAddenda == other.internationalAddenda &&
          this.notificationOfChange == other.notificationOfChange &&
          this.originatorCompanyDescriptiveDate == other.originatorCompanyDescriptiveDate &&
          this.originatorCompanyDiscretionaryData == other.originatorCompanyDiscretionaryData &&
          this.originatorCompanyEntryDescription == other.originatorCompanyEntryDescription &&
          this.originatorCompanyId == other.originatorCompanyId &&
          this.originatorCompanyName == other.originatorCompanyName &&
          this.originatorRoutingNumber == other.originatorRoutingNumber &&
          this.receiverIdNumber == other.receiverIdNumber &&
          this.receiverName == other.receiverName &&
          this.standardEntryClassCode == other.standardEntryClassCode &&
          this.status == other.status &&
          this.traceNumber == other.traceNumber &&
          this.transferReturn == other.transferReturn &&
          this.type == other.type &&
          this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
      if (hashCode == 0) {
        hashCode = Objects.hash(
            acceptance,
            accountId,
            accountNumberId,
            addenda,
            amount,
            automaticallyResolvesAt,
            decline,
            direction,
            expectedSettlementSchedule,
            id,
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
            standardEntryClassCode,
            status,
            traceNumber,
            transferReturn,
            type,
            additionalProperties,
        )
      }
      return hashCode
    }

    override fun toString() = "InboundAchTransfer{acceptance=$acceptance, accountId=$accountId, accountNumberId=$accountNumberId, addenda=$addenda, amount=$amount, automaticallyResolvesAt=$automaticallyResolvesAt, decline=$decline, direction=$direction, expectedSettlementSchedule=$expectedSettlementSchedule, id=$id, internationalAddenda=$internationalAddenda, notificationOfChange=$notificationOfChange, originatorCompanyDescriptiveDate=$originatorCompanyDescriptiveDate, originatorCompanyDiscretionaryData=$originatorCompanyDiscretionaryData, originatorCompanyEntryDescription=$originatorCompanyEntryDescription, originatorCompanyId=$originatorCompanyId, originatorCompanyName=$originatorCompanyName, originatorRoutingNumber=$originatorRoutingNumber, receiverIdNumber=$receiverIdNumber, receiverName=$receiverName, standardEntryClassCode=$standardEntryClassCode, status=$status, traceNumber=$traceNumber, transferReturn=$transferReturn, type=$type, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic
        fun builder() = Builder()
    }

    class Builder {

        private var acceptance: JsonField<Acceptance> = JsonMissing.of()
        private var accountId: JsonField<String> = JsonMissing.of()
        private var accountNumberId: JsonField<String> = JsonMissing.of()
        private var addenda: JsonField<Addenda> = JsonMissing.of()
        private var amount: JsonField<Long> = JsonMissing.of()
        private var automaticallyResolvesAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var decline: JsonField<Decline> = JsonMissing.of()
        private var direction: JsonField<Direction> = JsonMissing.of()
        private var expectedSettlementSchedule: JsonField<ExpectedSettlementSchedule> = JsonMissing.of()
        private var id: JsonField<String> = JsonMissing.of()
        private var internationalAddenda: JsonField<InternationalAddenda> = JsonMissing.of()
        private var notificationOfChange: JsonField<NotificationOfChange> = JsonMissing.of()
        private var originatorCompanyDescriptiveDate: JsonField<String> = JsonMissing.of()
        private var originatorCompanyDiscretionaryData: JsonField<String> = JsonMissing.of()
        private var originatorCompanyEntryDescription: JsonField<String> = JsonMissing.of()
        private var originatorCompanyId: JsonField<String> = JsonMissing.of()
        private var originatorCompanyName: JsonField<String> = JsonMissing.of()
        private var originatorRoutingNumber: JsonField<String> = JsonMissing.of()
        private var receiverIdNumber: JsonField<String> = JsonMissing.of()
        private var receiverName: JsonField<String> = JsonMissing.of()
        private var standardEntryClassCode: JsonField<StandardEntryClassCode> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var traceNumber: JsonField<String> = JsonMissing.of()
        private var transferReturn: JsonField<TransferReturn> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(inboundAchTransfer: InboundAchTransfer) = apply {
            this.acceptance = inboundAchTransfer.acceptance
            this.accountId = inboundAchTransfer.accountId
            this.accountNumberId = inboundAchTransfer.accountNumberId
            this.addenda = inboundAchTransfer.addenda
            this.amount = inboundAchTransfer.amount
            this.automaticallyResolvesAt = inboundAchTransfer.automaticallyResolvesAt
            this.decline = inboundAchTransfer.decline
            this.direction = inboundAchTransfer.direction
            this.expectedSettlementSchedule = inboundAchTransfer.expectedSettlementSchedule
            this.id = inboundAchTransfer.id
            this.internationalAddenda = inboundAchTransfer.internationalAddenda
            this.notificationOfChange = inboundAchTransfer.notificationOfChange
            this.originatorCompanyDescriptiveDate = inboundAchTransfer.originatorCompanyDescriptiveDate
            this.originatorCompanyDiscretionaryData = inboundAchTransfer.originatorCompanyDiscretionaryData
            this.originatorCompanyEntryDescription = inboundAchTransfer.originatorCompanyEntryDescription
            this.originatorCompanyId = inboundAchTransfer.originatorCompanyId
            this.originatorCompanyName = inboundAchTransfer.originatorCompanyName
            this.originatorRoutingNumber = inboundAchTransfer.originatorRoutingNumber
            this.receiverIdNumber = inboundAchTransfer.receiverIdNumber
            this.receiverName = inboundAchTransfer.receiverName
            this.standardEntryClassCode = inboundAchTransfer.standardEntryClassCode
            this.status = inboundAchTransfer.status
            this.traceNumber = inboundAchTransfer.traceNumber
            this.transferReturn = inboundAchTransfer.transferReturn
            this.type = inboundAchTransfer.type
            additionalProperties(inboundAchTransfer.additionalProperties)
        }

        /** If your transfer is accepted, this will contain details of the acceptance. */
        fun acceptance(acceptance: Acceptance) = acceptance(JsonField.of(acceptance))

        /** If your transfer is accepted, this will contain details of the acceptance. */
        @JsonProperty("acceptance")
        @ExcludeMissing
        fun acceptance(acceptance: JsonField<Acceptance>) = apply {
            this.acceptance = acceptance
        }

        /** The Account to which the transfer belongs. */
        fun accountId(accountId: String) = accountId(JsonField.of(accountId))

        /** The Account to which the transfer belongs. */
        @JsonProperty("account_id")
        @ExcludeMissing
        fun accountId(accountId: JsonField<String>) = apply {
            this.accountId = accountId
        }

        /** The identifier of the Account Number to which this transfer was sent. */
        fun accountNumberId(accountNumberId: String) = accountNumberId(JsonField.of(accountNumberId))

        /** The identifier of the Account Number to which this transfer was sent. */
        @JsonProperty("account_number_id")
        @ExcludeMissing
        fun accountNumberId(accountNumberId: JsonField<String>) = apply {
            this.accountNumberId = accountNumberId
        }

        /** Additional information sent from the originator. */
        fun addenda(addenda: Addenda) = addenda(JsonField.of(addenda))

        /** Additional information sent from the originator. */
        @JsonProperty("addenda")
        @ExcludeMissing
        fun addenda(addenda: JsonField<Addenda>) = apply {
            this.addenda = addenda
        }

        /** The transfer amount in USD cents. */
        fun amount(amount: Long) = amount(JsonField.of(amount))

        /** The transfer amount in USD cents. */
        @JsonProperty("amount")
        @ExcludeMissing
        fun amount(amount: JsonField<Long>) = apply {
            this.amount = amount
        }

        /** The time at which the transfer will be automatically resolved. */
        fun automaticallyResolvesAt(automaticallyResolvesAt: OffsetDateTime) = automaticallyResolvesAt(JsonField.of(automaticallyResolvesAt))

        /** The time at which the transfer will be automatically resolved. */
        @JsonProperty("automatically_resolves_at")
        @ExcludeMissing
        fun automaticallyResolvesAt(automaticallyResolvesAt: JsonField<OffsetDateTime>) = apply {
            this.automaticallyResolvesAt = automaticallyResolvesAt
        }

        /** If your transfer is declined, this will contain details of the decline. */
        fun decline(decline: Decline) = decline(JsonField.of(decline))

        /** If your transfer is declined, this will contain details of the decline. */
        @JsonProperty("decline")
        @ExcludeMissing
        fun decline(decline: JsonField<Decline>) = apply {
            this.decline = decline
        }

        /** The direction of the transfer. */
        fun direction(direction: Direction) = direction(JsonField.of(direction))

        /** The direction of the transfer. */
        @JsonProperty("direction")
        @ExcludeMissing
        fun direction(direction: JsonField<Direction>) = apply {
            this.direction = direction
        }

        /** The settlement schedule the transfer is expected to follow. */
        fun expectedSettlementSchedule(expectedSettlementSchedule: ExpectedSettlementSchedule) = expectedSettlementSchedule(JsonField.of(expectedSettlementSchedule))

        /** The settlement schedule the transfer is expected to follow. */
        @JsonProperty("expected_settlement_schedule")
        @ExcludeMissing
        fun expectedSettlementSchedule(expectedSettlementSchedule: JsonField<ExpectedSettlementSchedule>) = apply {
            this.expectedSettlementSchedule = expectedSettlementSchedule
        }

        /** The inbound ACH transfer's identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The inbound ACH transfer's identifier. */
        @JsonProperty("id")
        @ExcludeMissing
        fun id(id: JsonField<String>) = apply {
            this.id = id
        }

        /**
         * If the Inbound ACH Transfer has a Standard Entry Class Code of IAT, this will
         * contain fields pertaining to the International ACH Transaction.
         */
        fun internationalAddenda(internationalAddenda: InternationalAddenda) = internationalAddenda(JsonField.of(internationalAddenda))

        /**
         * If the Inbound ACH Transfer has a Standard Entry Class Code of IAT, this will
         * contain fields pertaining to the International ACH Transaction.
         */
        @JsonProperty("international_addenda")
        @ExcludeMissing
        fun internationalAddenda(internationalAddenda: JsonField<InternationalAddenda>) = apply {
            this.internationalAddenda = internationalAddenda
        }

        /**
         * If you initiate a notification of change in response to the transfer, this will
         * contain its details.
         */
        fun notificationOfChange(notificationOfChange: NotificationOfChange) = notificationOfChange(JsonField.of(notificationOfChange))

        /**
         * If you initiate a notification of change in response to the transfer, this will
         * contain its details.
         */
        @JsonProperty("notification_of_change")
        @ExcludeMissing
        fun notificationOfChange(notificationOfChange: JsonField<NotificationOfChange>) = apply {
            this.notificationOfChange = notificationOfChange
        }

        /** The descriptive date of the transfer. */
        fun originatorCompanyDescriptiveDate(originatorCompanyDescriptiveDate: String) = originatorCompanyDescriptiveDate(JsonField.of(originatorCompanyDescriptiveDate))

        /** The descriptive date of the transfer. */
        @JsonProperty("originator_company_descriptive_date")
        @ExcludeMissing
        fun originatorCompanyDescriptiveDate(originatorCompanyDescriptiveDate: JsonField<String>) = apply {
            this.originatorCompanyDescriptiveDate = originatorCompanyDescriptiveDate
        }

        /** The additional information included with the transfer. */
        fun originatorCompanyDiscretionaryData(originatorCompanyDiscretionaryData: String) = originatorCompanyDiscretionaryData(JsonField.of(originatorCompanyDiscretionaryData))

        /** The additional information included with the transfer. */
        @JsonProperty("originator_company_discretionary_data")
        @ExcludeMissing
        fun originatorCompanyDiscretionaryData(originatorCompanyDiscretionaryData: JsonField<String>) = apply {
            this.originatorCompanyDiscretionaryData = originatorCompanyDiscretionaryData
        }

        /** The description of the transfer. */
        fun originatorCompanyEntryDescription(originatorCompanyEntryDescription: String) = originatorCompanyEntryDescription(JsonField.of(originatorCompanyEntryDescription))

        /** The description of the transfer. */
        @JsonProperty("originator_company_entry_description")
        @ExcludeMissing
        fun originatorCompanyEntryDescription(originatorCompanyEntryDescription: JsonField<String>) = apply {
            this.originatorCompanyEntryDescription = originatorCompanyEntryDescription
        }

        /** The id of the company that initiated the transfer. */
        fun originatorCompanyId(originatorCompanyId: String) = originatorCompanyId(JsonField.of(originatorCompanyId))

        /** The id of the company that initiated the transfer. */
        @JsonProperty("originator_company_id")
        @ExcludeMissing
        fun originatorCompanyId(originatorCompanyId: JsonField<String>) = apply {
            this.originatorCompanyId = originatorCompanyId
        }

        /** The name of the company that initiated the transfer. */
        fun originatorCompanyName(originatorCompanyName: String) = originatorCompanyName(JsonField.of(originatorCompanyName))

        /** The name of the company that initiated the transfer. */
        @JsonProperty("originator_company_name")
        @ExcludeMissing
        fun originatorCompanyName(originatorCompanyName: JsonField<String>) = apply {
            this.originatorCompanyName = originatorCompanyName
        }

        /**
         * The American Banking Association (ABA) routing number of the bank originating
         * the transfer.
         */
        fun originatorRoutingNumber(originatorRoutingNumber: String) = originatorRoutingNumber(JsonField.of(originatorRoutingNumber))

        /**
         * The American Banking Association (ABA) routing number of the bank originating
         * the transfer.
         */
        @JsonProperty("originator_routing_number")
        @ExcludeMissing
        fun originatorRoutingNumber(originatorRoutingNumber: JsonField<String>) = apply {
            this.originatorRoutingNumber = originatorRoutingNumber
        }

        /** The id of the receiver of the transfer. */
        fun receiverIdNumber(receiverIdNumber: String) = receiverIdNumber(JsonField.of(receiverIdNumber))

        /** The id of the receiver of the transfer. */
        @JsonProperty("receiver_id_number")
        @ExcludeMissing
        fun receiverIdNumber(receiverIdNumber: JsonField<String>) = apply {
            this.receiverIdNumber = receiverIdNumber
        }

        /** The name of the receiver of the transfer. */
        fun receiverName(receiverName: String) = receiverName(JsonField.of(receiverName))

        /** The name of the receiver of the transfer. */
        @JsonProperty("receiver_name")
        @ExcludeMissing
        fun receiverName(receiverName: JsonField<String>) = apply {
            this.receiverName = receiverName
        }

        /** The Standard Entry Class (SEC) code of the transfer. */
        fun standardEntryClassCode(standardEntryClassCode: StandardEntryClassCode) = standardEntryClassCode(JsonField.of(standardEntryClassCode))

        /** The Standard Entry Class (SEC) code of the transfer. */
        @JsonProperty("standard_entry_class_code")
        @ExcludeMissing
        fun standardEntryClassCode(standardEntryClassCode: JsonField<StandardEntryClassCode>) = apply {
            this.standardEntryClassCode = standardEntryClassCode
        }

        /** The status of the transfer. */
        fun status(status: Status) = status(JsonField.of(status))

        /** The status of the transfer. */
        @JsonProperty("status")
        @ExcludeMissing
        fun status(status: JsonField<Status>) = apply {
            this.status = status
        }

        /** The trace number of the transfer. */
        fun traceNumber(traceNumber: String) = traceNumber(JsonField.of(traceNumber))

        /** The trace number of the transfer. */
        @JsonProperty("trace_number")
        @ExcludeMissing
        fun traceNumber(traceNumber: JsonField<String>) = apply {
            this.traceNumber = traceNumber
        }

        /** If your transfer is returned, this will contain details of the return. */
        fun transferReturn(transferReturn: TransferReturn) = transferReturn(JsonField.of(transferReturn))

        /** If your transfer is returned, this will contain details of the return. */
        @JsonProperty("transfer_return")
        @ExcludeMissing
        fun transferReturn(transferReturn: JsonField<TransferReturn>) = apply {
            this.transferReturn = transferReturn
        }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `inbound_ach_transfer`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * A constant representing the object's type. For this resource it will always be
         * `inbound_ach_transfer`.
         */
        @JsonProperty("type")
        @ExcludeMissing
        fun type(type: JsonField<Type>) = apply {
            this.type = type
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

        fun build(): InboundAchTransfer = InboundAchTransfer(
            acceptance,
            accountId,
            accountNumberId,
            addenda,
            amount,
            automaticallyResolvesAt,
            decline,
            direction,
            expectedSettlementSchedule,
            id,
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
            standardEntryClassCode,
            status,
            traceNumber,
            transferReturn,
            type,
            additionalProperties.toUnmodifiable(),
        )
    }

    /** If your transfer is accepted, this will contain details of the acceptance. */
    @JsonDeserialize(builder = Acceptance.Builder::class)
    @NoAutoDetect
    class Acceptance private constructor(private val acceptedAt: JsonField<OffsetDateTime>, private val transactionId: JsonField<String>, private val additionalProperties: Map<String, JsonValue>, ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /** The time at which the transfer was accepted. */
        fun acceptedAt(): OffsetDateTime = acceptedAt.getRequired("accepted_at")

        /** The id of the transaction for the accepted transfer. */
        fun transactionId(): String = transactionId.getRequired("transaction_id")

        /** The time at which the transfer was accepted. */
        @JsonProperty("accepted_at")
        @ExcludeMissing
        fun _acceptedAt() = acceptedAt

        /** The id of the transaction for the accepted transfer. */
        @JsonProperty("transaction_id")
        @ExcludeMissing
        fun _transactionId() = transactionId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Acceptance = apply {
            if (!validated) {
              acceptedAt()
              transactionId()
              validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is Acceptance &&
              this.acceptedAt == other.acceptedAt &&
              this.transactionId == other.transactionId &&
              this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
          if (hashCode == 0) {
            hashCode = Objects.hash(
                acceptedAt,
                transactionId,
                additionalProperties,
            )
          }
          return hashCode
        }

        override fun toString() = "Acceptance{acceptedAt=$acceptedAt, transactionId=$transactionId, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic
            fun builder() = Builder()
        }

        class Builder {

            private var acceptedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var transactionId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(acceptance: Acceptance) = apply {
                this.acceptedAt = acceptance.acceptedAt
                this.transactionId = acceptance.transactionId
                additionalProperties(acceptance.additionalProperties)
            }

            /** The time at which the transfer was accepted. */
            fun acceptedAt(acceptedAt: OffsetDateTime) = acceptedAt(JsonField.of(acceptedAt))

            /** The time at which the transfer was accepted. */
            @JsonProperty("accepted_at")
            @ExcludeMissing
            fun acceptedAt(acceptedAt: JsonField<OffsetDateTime>) = apply {
                this.acceptedAt = acceptedAt
            }

            /** The id of the transaction for the accepted transfer. */
            fun transactionId(transactionId: String) = transactionId(JsonField.of(transactionId))

            /** The id of the transaction for the accepted transfer. */
            @JsonProperty("transaction_id")
            @ExcludeMissing
            fun transactionId(transactionId: JsonField<String>) = apply {
                this.transactionId = transactionId
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

            fun build(): Acceptance = Acceptance(
                acceptedAt,
                transactionId,
                additionalProperties.toUnmodifiable(),
            )
        }
    }

    /** Additional information sent from the originator. */
    @JsonDeserialize(builder = Addenda.Builder::class)
    @NoAutoDetect
    class Addenda private constructor(private val category: JsonField<Category>, private val freeform: JsonField<Freeform>, private val additionalProperties: Map<String, JsonValue>, ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /** The type of addendum. */
        fun category(): Category = category.getRequired("category")

        /** Unstructured `payment_related_information` passed through by the originator. */
        fun freeform(): Optional<Freeform> = Optional.ofNullable(freeform.getNullable("freeform"))

        /** The type of addendum. */
        @JsonProperty("category")
        @ExcludeMissing
        fun _category() = category

        /** Unstructured `payment_related_information` passed through by the originator. */
        @JsonProperty("freeform")
        @ExcludeMissing
        fun _freeform() = freeform

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Addenda = apply {
            if (!validated) {
              category()
              freeform().map { it.validate() }
              validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is Addenda &&
              this.category == other.category &&
              this.freeform == other.freeform &&
              this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
          if (hashCode == 0) {
            hashCode = Objects.hash(
                category,
                freeform,
                additionalProperties,
            )
          }
          return hashCode
        }

        override fun toString() = "Addenda{category=$category, freeform=$freeform, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic
            fun builder() = Builder()
        }

        class Builder {

            private var category: JsonField<Category> = JsonMissing.of()
            private var freeform: JsonField<Freeform> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(addenda: Addenda) = apply {
                this.category = addenda.category
                this.freeform = addenda.freeform
                additionalProperties(addenda.additionalProperties)
            }

            /** The type of addendum. */
            fun category(category: Category) = category(JsonField.of(category))

            /** The type of addendum. */
            @JsonProperty("category")
            @ExcludeMissing
            fun category(category: JsonField<Category>) = apply {
                this.category = category
            }

            /** Unstructured `payment_related_information` passed through by the originator. */
            fun freeform(freeform: Freeform) = freeform(JsonField.of(freeform))

            /** Unstructured `payment_related_information` passed through by the originator. */
            @JsonProperty("freeform")
            @ExcludeMissing
            fun freeform(freeform: JsonField<Freeform>) = apply {
                this.freeform = freeform
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

            fun build(): Addenda = Addenda(
                category,
                freeform,
                additionalProperties.toUnmodifiable(),
            )
        }

        class Category @JsonCreator private constructor(private val value: JsonField<String>, ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue
            fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
              if (this === other) {
                  return true
              }

              return other is Category &&
                  this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val FREEFORM = Category(JsonField.of("freeform"))

                @JvmStatic fun of(value: String) = Category(JsonField.of(value))
            }

            enum class Known {
                FREEFORM,
            }

            enum class Value {
                FREEFORM,
                _UNKNOWN,
            }

            fun value(): Value = when (this) {
                FREEFORM -> Value.FREEFORM
                else -> Value._UNKNOWN
            }

            fun known(): Known = when (this) {
                FREEFORM -> Known.FREEFORM
                else -> throw IncreaseInvalidDataException("Unknown Category: $value")
            }

            fun asString(): String = _value().asStringOrThrow()
        }

        /** Unstructured `payment_related_information` passed through by the originator. */
        @JsonDeserialize(builder = Freeform.Builder::class)
        @NoAutoDetect
        class Freeform private constructor(private val entries: JsonField<List<Entry>>, private val additionalProperties: Map<String, JsonValue>, ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** Each entry represents an addendum received from the originator. */
            fun entries(): List<Entry> = entries.getRequired("entries")

            /** Each entry represents an addendum received from the originator. */
            @JsonProperty("entries")
            @ExcludeMissing
            fun _entries() = entries

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Freeform = apply {
                if (!validated) {
                  entries().forEach { it.validate() }
                  validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
              if (this === other) {
                  return true
              }

              return other is Freeform &&
                  this.entries == other.entries &&
                  this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
              if (hashCode == 0) {
                hashCode = Objects.hash(entries, additionalProperties)
              }
              return hashCode
            }

            override fun toString() = "Freeform{entries=$entries, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic
                fun builder() = Builder()
            }

            class Builder {

                private var entries: JsonField<List<Entry>> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(freeform: Freeform) = apply {
                    this.entries = freeform.entries
                    additionalProperties(freeform.additionalProperties)
                }

                /** Each entry represents an addendum received from the originator. */
                fun entries(entries: List<Entry>) = entries(JsonField.of(entries))

                /** Each entry represents an addendum received from the originator. */
                @JsonProperty("entries")
                @ExcludeMissing
                fun entries(entries: JsonField<List<Entry>>) = apply {
                    this.entries = entries
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

                fun build(): Freeform = Freeform(entries.map { it.toUnmodifiable() }, additionalProperties.toUnmodifiable())
            }

            @JsonDeserialize(builder = Entry.Builder::class)
            @NoAutoDetect
            class Entry private constructor(private val paymentRelatedInformation: JsonField<String>, private val additionalProperties: Map<String, JsonValue>, ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /** The payment related information passed in the addendum. */
                fun paymentRelatedInformation(): String = paymentRelatedInformation.getRequired("payment_related_information")

                /** The payment related information passed in the addendum. */
                @JsonProperty("payment_related_information")
                @ExcludeMissing
                fun _paymentRelatedInformation() = paymentRelatedInformation

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): Entry = apply {
                    if (!validated) {
                      paymentRelatedInformation()
                      validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                  if (this === other) {
                      return true
                  }

                  return other is Entry &&
                      this.paymentRelatedInformation == other.paymentRelatedInformation &&
                      this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                  if (hashCode == 0) {
                    hashCode = Objects.hash(paymentRelatedInformation, additionalProperties)
                  }
                  return hashCode
                }

                override fun toString() = "Entry{paymentRelatedInformation=$paymentRelatedInformation, additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic
                    fun builder() = Builder()
                }

                class Builder {

                    private var paymentRelatedInformation: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(entry: Entry) = apply {
                        this.paymentRelatedInformation = entry.paymentRelatedInformation
                        additionalProperties(entry.additionalProperties)
                    }

                    /** The payment related information passed in the addendum. */
                    fun paymentRelatedInformation(paymentRelatedInformation: String) = paymentRelatedInformation(JsonField.of(paymentRelatedInformation))

                    /** The payment related information passed in the addendum. */
                    @JsonProperty("payment_related_information")
                    @ExcludeMissing
                    fun paymentRelatedInformation(paymentRelatedInformation: JsonField<String>) = apply {
                        this.paymentRelatedInformation = paymentRelatedInformation
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

                    fun build(): Entry = Entry(paymentRelatedInformation, additionalProperties.toUnmodifiable())
                }
            }
        }
    }

    /** If your transfer is declined, this will contain details of the decline. */
    @JsonDeserialize(builder = Decline.Builder::class)
    @NoAutoDetect
    class Decline private constructor(
      private val declinedAt: JsonField<OffsetDateTime>,
      private val declinedTransactionId: JsonField<String>,
      private val reason: JsonField<Reason>,
      private val additionalProperties: Map<String, JsonValue>,

    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /** The time at which the transfer was declined. */
        fun declinedAt(): OffsetDateTime = declinedAt.getRequired("declined_at")

        /** The id of the transaction for the declined transfer. */
        fun declinedTransactionId(): String = declinedTransactionId.getRequired("declined_transaction_id")

        /** The reason for the transfer decline. */
        fun reason(): Reason = reason.getRequired("reason")

        /** The time at which the transfer was declined. */
        @JsonProperty("declined_at")
        @ExcludeMissing
        fun _declinedAt() = declinedAt

        /** The id of the transaction for the declined transfer. */
        @JsonProperty("declined_transaction_id")
        @ExcludeMissing
        fun _declinedTransactionId() = declinedTransactionId

        /** The reason for the transfer decline. */
        @JsonProperty("reason")
        @ExcludeMissing
        fun _reason() = reason

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Decline = apply {
            if (!validated) {
              declinedAt()
              declinedTransactionId()
              reason()
              validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is Decline &&
              this.declinedAt == other.declinedAt &&
              this.declinedTransactionId == other.declinedTransactionId &&
              this.reason == other.reason &&
              this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
          if (hashCode == 0) {
            hashCode = Objects.hash(
                declinedAt,
                declinedTransactionId,
                reason,
                additionalProperties,
            )
          }
          return hashCode
        }

        override fun toString() = "Decline{declinedAt=$declinedAt, declinedTransactionId=$declinedTransactionId, reason=$reason, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic
            fun builder() = Builder()
        }

        class Builder {

            private var declinedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var declinedTransactionId: JsonField<String> = JsonMissing.of()
            private var reason: JsonField<Reason> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(decline: Decline) = apply {
                this.declinedAt = decline.declinedAt
                this.declinedTransactionId = decline.declinedTransactionId
                this.reason = decline.reason
                additionalProperties(decline.additionalProperties)
            }

            /** The time at which the transfer was declined. */
            fun declinedAt(declinedAt: OffsetDateTime) = declinedAt(JsonField.of(declinedAt))

            /** The time at which the transfer was declined. */
            @JsonProperty("declined_at")
            @ExcludeMissing
            fun declinedAt(declinedAt: JsonField<OffsetDateTime>) = apply {
                this.declinedAt = declinedAt
            }

            /** The id of the transaction for the declined transfer. */
            fun declinedTransactionId(declinedTransactionId: String) = declinedTransactionId(JsonField.of(declinedTransactionId))

            /** The id of the transaction for the declined transfer. */
            @JsonProperty("declined_transaction_id")
            @ExcludeMissing
            fun declinedTransactionId(declinedTransactionId: JsonField<String>) = apply {
                this.declinedTransactionId = declinedTransactionId
            }

            /** The reason for the transfer decline. */
            fun reason(reason: Reason) = reason(JsonField.of(reason))

            /** The reason for the transfer decline. */
            @JsonProperty("reason")
            @ExcludeMissing
            fun reason(reason: JsonField<Reason>) = apply {
                this.reason = reason
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

            fun build(): Decline = Decline(
                declinedAt,
                declinedTransactionId,
                reason,
                additionalProperties.toUnmodifiable(),
            )
        }

        class Reason @JsonCreator private constructor(private val value: JsonField<String>, ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue
            fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
              if (this === other) {
                  return true
              }

              return other is Reason &&
                  this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val ACH_ROUTE_CANCELED = Reason(JsonField.of("ach_route_canceled"))

                @JvmField val ACH_ROUTE_DISABLED = Reason(JsonField.of("ach_route_disabled"))

                @JvmField val BREACHES_LIMIT = Reason(JsonField.of("breaches_limit"))

                @JvmField val CREDIT_ENTRY_REFUSED_BY_RECEIVER = Reason(JsonField.of("credit_entry_refused_by_receiver"))

                @JvmField val DUPLICATE_RETURN = Reason(JsonField.of("duplicate_return"))

                @JvmField val ENTITY_NOT_ACTIVE = Reason(JsonField.of("entity_not_active"))

                @JvmField val FIELD_ERROR = Reason(JsonField.of("field_error"))

                @JvmField val GROUP_LOCKED = Reason(JsonField.of("group_locked"))

                @JvmField val INSUFFICIENT_FUNDS = Reason(JsonField.of("insufficient_funds"))

                @JvmField val MISROUTED_RETURN = Reason(JsonField.of("misrouted_return"))

                @JvmField val RETURN_OF_ERRONEOUS_OR_REVERSING_DEBIT = Reason(JsonField.of("return_of_erroneous_or_reversing_debit"))

                @JvmField val NO_ACH_ROUTE = Reason(JsonField.of("no_ach_route"))

                @JvmField val ORIGINATOR_REQUEST = Reason(JsonField.of("originator_request"))

                @JvmField val TRANSACTION_NOT_ALLOWED = Reason(JsonField.of("transaction_not_allowed"))

                @JvmField val USER_INITIATED = Reason(JsonField.of("user_initiated"))

                @JvmStatic fun of(value: String) = Reason(JsonField.of(value))
            }

            enum class Known {
                ACH_ROUTE_CANCELED,
                ACH_ROUTE_DISABLED,
                BREACHES_LIMIT,
                CREDIT_ENTRY_REFUSED_BY_RECEIVER,
                DUPLICATE_RETURN,
                ENTITY_NOT_ACTIVE,
                FIELD_ERROR,
                GROUP_LOCKED,
                INSUFFICIENT_FUNDS,
                MISROUTED_RETURN,
                RETURN_OF_ERRONEOUS_OR_REVERSING_DEBIT,
                NO_ACH_ROUTE,
                ORIGINATOR_REQUEST,
                TRANSACTION_NOT_ALLOWED,
                USER_INITIATED,
            }

            enum class Value {
                ACH_ROUTE_CANCELED,
                ACH_ROUTE_DISABLED,
                BREACHES_LIMIT,
                CREDIT_ENTRY_REFUSED_BY_RECEIVER,
                DUPLICATE_RETURN,
                ENTITY_NOT_ACTIVE,
                FIELD_ERROR,
                GROUP_LOCKED,
                INSUFFICIENT_FUNDS,
                MISROUTED_RETURN,
                RETURN_OF_ERRONEOUS_OR_REVERSING_DEBIT,
                NO_ACH_ROUTE,
                ORIGINATOR_REQUEST,
                TRANSACTION_NOT_ALLOWED,
                USER_INITIATED,
                _UNKNOWN,
            }

            fun value(): Value = when (this) {
                ACH_ROUTE_CANCELED -> Value.ACH_ROUTE_CANCELED
                ACH_ROUTE_DISABLED -> Value.ACH_ROUTE_DISABLED
                BREACHES_LIMIT -> Value.BREACHES_LIMIT
                CREDIT_ENTRY_REFUSED_BY_RECEIVER -> Value.CREDIT_ENTRY_REFUSED_BY_RECEIVER
                DUPLICATE_RETURN -> Value.DUPLICATE_RETURN
                ENTITY_NOT_ACTIVE -> Value.ENTITY_NOT_ACTIVE
                FIELD_ERROR -> Value.FIELD_ERROR
                GROUP_LOCKED -> Value.GROUP_LOCKED
                INSUFFICIENT_FUNDS -> Value.INSUFFICIENT_FUNDS
                MISROUTED_RETURN -> Value.MISROUTED_RETURN
                RETURN_OF_ERRONEOUS_OR_REVERSING_DEBIT -> Value.RETURN_OF_ERRONEOUS_OR_REVERSING_DEBIT
                NO_ACH_ROUTE -> Value.NO_ACH_ROUTE
                ORIGINATOR_REQUEST -> Value.ORIGINATOR_REQUEST
                TRANSACTION_NOT_ALLOWED -> Value.TRANSACTION_NOT_ALLOWED
                USER_INITIATED -> Value.USER_INITIATED
                else -> Value._UNKNOWN
            }

            fun known(): Known = when (this) {
                ACH_ROUTE_CANCELED -> Known.ACH_ROUTE_CANCELED
                ACH_ROUTE_DISABLED -> Known.ACH_ROUTE_DISABLED
                BREACHES_LIMIT -> Known.BREACHES_LIMIT
                CREDIT_ENTRY_REFUSED_BY_RECEIVER -> Known.CREDIT_ENTRY_REFUSED_BY_RECEIVER
                DUPLICATE_RETURN -> Known.DUPLICATE_RETURN
                ENTITY_NOT_ACTIVE -> Known.ENTITY_NOT_ACTIVE
                FIELD_ERROR -> Known.FIELD_ERROR
                GROUP_LOCKED -> Known.GROUP_LOCKED
                INSUFFICIENT_FUNDS -> Known.INSUFFICIENT_FUNDS
                MISROUTED_RETURN -> Known.MISROUTED_RETURN
                RETURN_OF_ERRONEOUS_OR_REVERSING_DEBIT -> Known.RETURN_OF_ERRONEOUS_OR_REVERSING_DEBIT
                NO_ACH_ROUTE -> Known.NO_ACH_ROUTE
                ORIGINATOR_REQUEST -> Known.ORIGINATOR_REQUEST
                TRANSACTION_NOT_ALLOWED -> Known.TRANSACTION_NOT_ALLOWED
                USER_INITIATED -> Known.USER_INITIATED
                else -> throw IncreaseInvalidDataException("Unknown Reason: $value")
            }

            fun asString(): String = _value().asStringOrThrow()
        }
    }

    class Direction @JsonCreator private constructor(private val value: JsonField<String>, ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue
        fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is Direction &&
              this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val CREDIT = Direction(JsonField.of("credit"))

            @JvmField val DEBIT = Direction(JsonField.of("debit"))

            @JvmStatic fun of(value: String) = Direction(JsonField.of(value))
        }

        enum class Known {
            CREDIT,
            DEBIT,
        }

        enum class Value {
            CREDIT,
            DEBIT,
            _UNKNOWN,
        }

        fun value(): Value = when (this) {
            CREDIT -> Value.CREDIT
            DEBIT -> Value.DEBIT
            else -> Value._UNKNOWN
        }

        fun known(): Known = when (this) {
            CREDIT -> Known.CREDIT
            DEBIT -> Known.DEBIT
            else -> throw IncreaseInvalidDataException("Unknown Direction: $value")
        }

        fun asString(): String = _value().asStringOrThrow()
    }

    class ExpectedSettlementSchedule @JsonCreator private constructor(private val value: JsonField<String>, ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue
        fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is ExpectedSettlementSchedule &&
              this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val SAME_DAY = ExpectedSettlementSchedule(JsonField.of("same_day"))

            @JvmField val FUTURE_DATED = ExpectedSettlementSchedule(JsonField.of("future_dated"))

            @JvmStatic fun of(value: String) = ExpectedSettlementSchedule(JsonField.of(value))
        }

        enum class Known {
            SAME_DAY,
            FUTURE_DATED,
        }

        enum class Value {
            SAME_DAY,
            FUTURE_DATED,
            _UNKNOWN,
        }

        fun value(): Value = when (this) {
            SAME_DAY -> Value.SAME_DAY
            FUTURE_DATED -> Value.FUTURE_DATED
            else -> Value._UNKNOWN
        }

        fun known(): Known = when (this) {
            SAME_DAY -> Known.SAME_DAY
            FUTURE_DATED -> Known.FUTURE_DATED
            else -> throw IncreaseInvalidDataException("Unknown ExpectedSettlementSchedule: $value")
        }

        fun asString(): String = _value().asStringOrThrow()
    }

    /**
     * If the Inbound ACH Transfer has a Standard Entry Class Code of IAT, this will
     * contain fields pertaining to the International ACH Transaction.
     */
    @JsonDeserialize(builder = InternationalAddenda.Builder::class)
    @NoAutoDetect
    class InternationalAddenda private constructor(
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
      private val originatingDepositoryFinancialInstitutionIdQualifier: JsonField<OriginatingDepositoryFinancialInstitutionIdQualifier>,
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
      private val receivingDepositoryFinancialInstitutionIdQualifier: JsonField<ReceivingDepositoryFinancialInstitutionIdQualifier>,
      private val receivingDepositoryFinancialInstitutionName: JsonField<String>,
      private val additionalProperties: Map<String, JsonValue>,

    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /**
         * The [ISO 3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), Alpha-2
         * country code of the destination country.
         */
        fun destinationCountryCode(): String = destinationCountryCode.getRequired("destination_country_code")

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code for the
         * destination bank account.
         */
        fun destinationCurrencyCode(): String = destinationCurrencyCode.getRequired("destination_currency_code")

        /** A description of how the foreign exchange rate was calculated. */
        fun foreignExchangeIndicator(): ForeignExchangeIndicator = foreignExchangeIndicator.getRequired("foreign_exchange_indicator")

        /**
         * Depending on the `foreign_exchange_reference_indicator`, an exchange rate or a
         * reference to a well-known rate.
         */
        fun foreignExchangeReference(): Optional<String> = Optional.ofNullable(foreignExchangeReference.getNullable("foreign_exchange_reference"))

        /**
         * An instruction of how to interpret the `foreign_exchange_reference` field for
         * this Transaction.
         */
        fun foreignExchangeReferenceIndicator(): ForeignExchangeReferenceIndicator = foreignExchangeReferenceIndicator.getRequired("foreign_exchange_reference_indicator")

        /**
         * The amount in the minor unit of the foreign payment currency. For dollars, for
         * example, this is cents.
         */
        fun foreignPaymentAmount(): Long = foreignPaymentAmount.getRequired("foreign_payment_amount")

        /** A reference number in the foreign banking infrastructure. */
        fun foreignTraceNumber(): Optional<String> = Optional.ofNullable(foreignTraceNumber.getNullable("foreign_trace_number"))

        /** The type of transfer. Set by the originator. */
        fun internationalTransactionTypeCode(): InternationalTransactionTypeCode = internationalTransactionTypeCode.getRequired("international_transaction_type_code")

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code for the
         * originating bank account.
         */
        fun originatingCurrencyCode(): String = originatingCurrencyCode.getRequired("originating_currency_code")

        /**
         * The [ISO 3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), Alpha-2
         * country code of the originating branch country.
         */
        fun originatingDepositoryFinancialInstitutionBranchCountry(): String = originatingDepositoryFinancialInstitutionBranchCountry.getRequired("originating_depository_financial_institution_branch_country")

        /**
         * An identifier for the originating bank. One of an International Bank Account
         * Number (IBAN) bank identifier, SWIFT Bank Identification Code (BIC), or a
         * domestic identifier like a US Routing Number.
         */
        fun originatingDepositoryFinancialInstitutionId(): String = originatingDepositoryFinancialInstitutionId.getRequired("originating_depository_financial_institution_id")

        /**
         * An instruction of how to interpret the
         * `originating_depository_financial_institution_id` field for this Transaction.
         */
        fun originatingDepositoryFinancialInstitutionIdQualifier(): OriginatingDepositoryFinancialInstitutionIdQualifier = originatingDepositoryFinancialInstitutionIdQualifier.getRequired("originating_depository_financial_institution_id_qualifier")

        /**
         * The name of the originating bank. Sometimes this will refer to an American bank
         * and obscure the correspondent foreign bank.
         */
        fun originatingDepositoryFinancialInstitutionName(): String = originatingDepositoryFinancialInstitutionName.getRequired("originating_depository_financial_institution_name")

        /** A portion of the originator address. This may be incomplete. */
        fun originatorCity(): String = originatorCity.getRequired("originator_city")

        /**
         * A portion of the originator address. The
         * [ISO 3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), Alpha-2 country
         * code of the originator country.
         */
        fun originatorCountry(): String = originatorCountry.getRequired("originator_country")

        /**
         * An identifier for the originating company. This is generally stable across
         * multiple ACH transfers.
         */
        fun originatorIdentification(): String = originatorIdentification.getRequired("originator_identification")

        /** Either the name of the originator or an intermediary money transmitter. */
        fun originatorName(): String = originatorName.getRequired("originator_name")

        /** A portion of the originator address. This may be incomplete. */
        fun originatorPostalCode(): Optional<String> = Optional.ofNullable(originatorPostalCode.getNullable("originator_postal_code"))

        /** A portion of the originator address. This may be incomplete. */
        fun originatorStateOrProvince(): Optional<String> = Optional.ofNullable(originatorStateOrProvince.getNullable("originator_state_or_province"))

        /** A portion of the originator address. This may be incomplete. */
        fun originatorStreetAddress(): String = originatorStreetAddress.getRequired("originator_street_address")

        /** A description field set by the originator. */
        fun paymentRelatedInformation(): Optional<String> = Optional.ofNullable(paymentRelatedInformation.getNullable("payment_related_information"))

        /** A description field set by the originator. */
        fun paymentRelatedInformation2(): Optional<String> = Optional.ofNullable(paymentRelatedInformation2.getNullable("payment_related_information2"))

        /** A portion of the receiver address. This may be incomplete. */
        fun receiverCity(): String = receiverCity.getRequired("receiver_city")

        /**
         * A portion of the receiver address. The
         * [ISO 3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), Alpha-2 country
         * code of the receiver country.
         */
        fun receiverCountry(): String = receiverCountry.getRequired("receiver_country")

        /** An identification number the originator uses for the receiver. */
        fun receiverIdentificationNumber(): Optional<String> = Optional.ofNullable(receiverIdentificationNumber.getNullable("receiver_identification_number"))

        /** A portion of the receiver address. This may be incomplete. */
        fun receiverPostalCode(): Optional<String> = Optional.ofNullable(receiverPostalCode.getNullable("receiver_postal_code"))

        /** A portion of the receiver address. This may be incomplete. */
        fun receiverStateOrProvince(): Optional<String> = Optional.ofNullable(receiverStateOrProvince.getNullable("receiver_state_or_province"))

        /** A portion of the receiver address. This may be incomplete. */
        fun receiverStreetAddress(): String = receiverStreetAddress.getRequired("receiver_street_address")

        /** The name of the receiver of the transfer. This is not verified by Increase. */
        fun receivingCompanyOrIndividualName(): String = receivingCompanyOrIndividualName.getRequired("receiving_company_or_individual_name")

        /**
         * The [ISO 3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), Alpha-2
         * country code of the receiving bank country.
         */
        fun receivingDepositoryFinancialInstitutionCountry(): String = receivingDepositoryFinancialInstitutionCountry.getRequired("receiving_depository_financial_institution_country")

        /**
         * An identifier for the receiving bank. One of an International Bank Account
         * Number (IBAN) bank identifier, SWIFT Bank Identification Code (BIC), or a
         * domestic identifier like a US Routing Number.
         */
        fun receivingDepositoryFinancialInstitutionId(): String = receivingDepositoryFinancialInstitutionId.getRequired("receiving_depository_financial_institution_id")

        /**
         * An instruction of how to interpret the
         * `receiving_depository_financial_institution_id` field for this Transaction.
         */
        fun receivingDepositoryFinancialInstitutionIdQualifier(): ReceivingDepositoryFinancialInstitutionIdQualifier = receivingDepositoryFinancialInstitutionIdQualifier.getRequired("receiving_depository_financial_institution_id_qualifier")

        /** The name of the receiving bank, as set by the sending financial institution. */
        fun receivingDepositoryFinancialInstitutionName(): String = receivingDepositoryFinancialInstitutionName.getRequired("receiving_depository_financial_institution_name")

        /**
         * The [ISO 3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), Alpha-2
         * country code of the destination country.
         */
        @JsonProperty("destination_country_code")
        @ExcludeMissing
        fun _destinationCountryCode() = destinationCountryCode

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code for the
         * destination bank account.
         */
        @JsonProperty("destination_currency_code")
        @ExcludeMissing
        fun _destinationCurrencyCode() = destinationCurrencyCode

        /** A description of how the foreign exchange rate was calculated. */
        @JsonProperty("foreign_exchange_indicator")
        @ExcludeMissing
        fun _foreignExchangeIndicator() = foreignExchangeIndicator

        /**
         * Depending on the `foreign_exchange_reference_indicator`, an exchange rate or a
         * reference to a well-known rate.
         */
        @JsonProperty("foreign_exchange_reference")
        @ExcludeMissing
        fun _foreignExchangeReference() = foreignExchangeReference

        /**
         * An instruction of how to interpret the `foreign_exchange_reference` field for
         * this Transaction.
         */
        @JsonProperty("foreign_exchange_reference_indicator")
        @ExcludeMissing
        fun _foreignExchangeReferenceIndicator() = foreignExchangeReferenceIndicator

        /**
         * The amount in the minor unit of the foreign payment currency. For dollars, for
         * example, this is cents.
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
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code for the
         * originating bank account.
         */
        @JsonProperty("originating_currency_code")
        @ExcludeMissing
        fun _originatingCurrencyCode() = originatingCurrencyCode

        /**
         * The [ISO 3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), Alpha-2
         * country code of the originating branch country.
         */
        @JsonProperty("originating_depository_financial_institution_branch_country")
        @ExcludeMissing
        fun _originatingDepositoryFinancialInstitutionBranchCountry() = originatingDepositoryFinancialInstitutionBranchCountry

        /**
         * An identifier for the originating bank. One of an International Bank Account
         * Number (IBAN) bank identifier, SWIFT Bank Identification Code (BIC), or a
         * domestic identifier like a US Routing Number.
         */
        @JsonProperty("originating_depository_financial_institution_id")
        @ExcludeMissing
        fun _originatingDepositoryFinancialInstitutionId() = originatingDepositoryFinancialInstitutionId

        /**
         * An instruction of how to interpret the
         * `originating_depository_financial_institution_id` field for this Transaction.
         */
        @JsonProperty("originating_depository_financial_institution_id_qualifier")
        @ExcludeMissing
        fun _originatingDepositoryFinancialInstitutionIdQualifier() = originatingDepositoryFinancialInstitutionIdQualifier

        /**
         * The name of the originating bank. Sometimes this will refer to an American bank
         * and obscure the correspondent foreign bank.
         */
        @JsonProperty("originating_depository_financial_institution_name")
        @ExcludeMissing
        fun _originatingDepositoryFinancialInstitutionName() = originatingDepositoryFinancialInstitutionName

        /** A portion of the originator address. This may be incomplete. */
        @JsonProperty("originator_city")
        @ExcludeMissing
        fun _originatorCity() = originatorCity

        /**
         * A portion of the originator address. The
         * [ISO 3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), Alpha-2 country
         * code of the originator country.
         */
        @JsonProperty("originator_country")
        @ExcludeMissing
        fun _originatorCountry() = originatorCountry

        /**
         * An identifier for the originating company. This is generally stable across
         * multiple ACH transfers.
         */
        @JsonProperty("originator_identification")
        @ExcludeMissing
        fun _originatorIdentification() = originatorIdentification

        /** Either the name of the originator or an intermediary money transmitter. */
        @JsonProperty("originator_name")
        @ExcludeMissing
        fun _originatorName() = originatorName

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
        @JsonProperty("receiver_city")
        @ExcludeMissing
        fun _receiverCity() = receiverCity

        /**
         * A portion of the receiver address. The
         * [ISO 3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), Alpha-2 country
         * code of the receiver country.
         */
        @JsonProperty("receiver_country")
        @ExcludeMissing
        fun _receiverCountry() = receiverCountry

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
         * The [ISO 3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), Alpha-2
         * country code of the receiving bank country.
         */
        @JsonProperty("receiving_depository_financial_institution_country")
        @ExcludeMissing
        fun _receivingDepositoryFinancialInstitutionCountry() = receivingDepositoryFinancialInstitutionCountry

        /**
         * An identifier for the receiving bank. One of an International Bank Account
         * Number (IBAN) bank identifier, SWIFT Bank Identification Code (BIC), or a
         * domestic identifier like a US Routing Number.
         */
        @JsonProperty("receiving_depository_financial_institution_id")
        @ExcludeMissing
        fun _receivingDepositoryFinancialInstitutionId() = receivingDepositoryFinancialInstitutionId

        /**
         * An instruction of how to interpret the
         * `receiving_depository_financial_institution_id` field for this Transaction.
         */
        @JsonProperty("receiving_depository_financial_institution_id_qualifier")
        @ExcludeMissing
        fun _receivingDepositoryFinancialInstitutionIdQualifier() = receivingDepositoryFinancialInstitutionIdQualifier

        /** The name of the receiving bank, as set by the sending financial institution. */
        @JsonProperty("receiving_depository_financial_institution_name")
        @ExcludeMissing
        fun _receivingDepositoryFinancialInstitutionName() = receivingDepositoryFinancialInstitutionName

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): InternationalAddenda = apply {
            if (!validated) {
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
              validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is InternationalAddenda &&
              this.destinationCountryCode == other.destinationCountryCode &&
              this.destinationCurrencyCode == other.destinationCurrencyCode &&
              this.foreignExchangeIndicator == other.foreignExchangeIndicator &&
              this.foreignExchangeReference == other.foreignExchangeReference &&
              this.foreignExchangeReferenceIndicator == other.foreignExchangeReferenceIndicator &&
              this.foreignPaymentAmount == other.foreignPaymentAmount &&
              this.foreignTraceNumber == other.foreignTraceNumber &&
              this.internationalTransactionTypeCode == other.internationalTransactionTypeCode &&
              this.originatingCurrencyCode == other.originatingCurrencyCode &&
              this.originatingDepositoryFinancialInstitutionBranchCountry == other.originatingDepositoryFinancialInstitutionBranchCountry &&
              this.originatingDepositoryFinancialInstitutionId == other.originatingDepositoryFinancialInstitutionId &&
              this.originatingDepositoryFinancialInstitutionIdQualifier == other.originatingDepositoryFinancialInstitutionIdQualifier &&
              this.originatingDepositoryFinancialInstitutionName == other.originatingDepositoryFinancialInstitutionName &&
              this.originatorCity == other.originatorCity &&
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
              this.receivingDepositoryFinancialInstitutionCountry == other.receivingDepositoryFinancialInstitutionCountry &&
              this.receivingDepositoryFinancialInstitutionId == other.receivingDepositoryFinancialInstitutionId &&
              this.receivingDepositoryFinancialInstitutionIdQualifier == other.receivingDepositoryFinancialInstitutionIdQualifier &&
              this.receivingDepositoryFinancialInstitutionName == other.receivingDepositoryFinancialInstitutionName &&
              this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
          if (hashCode == 0) {
            hashCode = Objects.hash(
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
          return hashCode
        }

        override fun toString() = "InternationalAddenda{destinationCountryCode=$destinationCountryCode, destinationCurrencyCode=$destinationCurrencyCode, foreignExchangeIndicator=$foreignExchangeIndicator, foreignExchangeReference=$foreignExchangeReference, foreignExchangeReferenceIndicator=$foreignExchangeReferenceIndicator, foreignPaymentAmount=$foreignPaymentAmount, foreignTraceNumber=$foreignTraceNumber, internationalTransactionTypeCode=$internationalTransactionTypeCode, originatingCurrencyCode=$originatingCurrencyCode, originatingDepositoryFinancialInstitutionBranchCountry=$originatingDepositoryFinancialInstitutionBranchCountry, originatingDepositoryFinancialInstitutionId=$originatingDepositoryFinancialInstitutionId, originatingDepositoryFinancialInstitutionIdQualifier=$originatingDepositoryFinancialInstitutionIdQualifier, originatingDepositoryFinancialInstitutionName=$originatingDepositoryFinancialInstitutionName, originatorCity=$originatorCity, originatorCountry=$originatorCountry, originatorIdentification=$originatorIdentification, originatorName=$originatorName, originatorPostalCode=$originatorPostalCode, originatorStateOrProvince=$originatorStateOrProvince, originatorStreetAddress=$originatorStreetAddress, paymentRelatedInformation=$paymentRelatedInformation, paymentRelatedInformation2=$paymentRelatedInformation2, receiverCity=$receiverCity, receiverCountry=$receiverCountry, receiverIdentificationNumber=$receiverIdentificationNumber, receiverPostalCode=$receiverPostalCode, receiverStateOrProvince=$receiverStateOrProvince, receiverStreetAddress=$receiverStreetAddress, receivingCompanyOrIndividualName=$receivingCompanyOrIndividualName, receivingDepositoryFinancialInstitutionCountry=$receivingDepositoryFinancialInstitutionCountry, receivingDepositoryFinancialInstitutionId=$receivingDepositoryFinancialInstitutionId, receivingDepositoryFinancialInstitutionIdQualifier=$receivingDepositoryFinancialInstitutionIdQualifier, receivingDepositoryFinancialInstitutionName=$receivingDepositoryFinancialInstitutionName, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic
            fun builder() = Builder()
        }

        class Builder {

            private var destinationCountryCode: JsonField<String> = JsonMissing.of()
            private var destinationCurrencyCode: JsonField<String> = JsonMissing.of()
            private var foreignExchangeIndicator: JsonField<ForeignExchangeIndicator> = JsonMissing.of()
            private var foreignExchangeReference: JsonField<String> = JsonMissing.of()
            private var foreignExchangeReferenceIndicator: JsonField<ForeignExchangeReferenceIndicator> = JsonMissing.of()
            private var foreignPaymentAmount: JsonField<Long> = JsonMissing.of()
            private var foreignTraceNumber: JsonField<String> = JsonMissing.of()
            private var internationalTransactionTypeCode: JsonField<InternationalTransactionTypeCode> = JsonMissing.of()
            private var originatingCurrencyCode: JsonField<String> = JsonMissing.of()
            private var originatingDepositoryFinancialInstitutionBranchCountry: JsonField<String> = JsonMissing.of()
            private var originatingDepositoryFinancialInstitutionId: JsonField<String> = JsonMissing.of()
            private var originatingDepositoryFinancialInstitutionIdQualifier: JsonField<OriginatingDepositoryFinancialInstitutionIdQualifier> = JsonMissing.of()
            private var originatingDepositoryFinancialInstitutionName: JsonField<String> = JsonMissing.of()
            private var originatorCity: JsonField<String> = JsonMissing.of()
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
            private var receivingDepositoryFinancialInstitutionCountry: JsonField<String> = JsonMissing.of()
            private var receivingDepositoryFinancialInstitutionId: JsonField<String> = JsonMissing.of()
            private var receivingDepositoryFinancialInstitutionIdQualifier: JsonField<ReceivingDepositoryFinancialInstitutionIdQualifier> = JsonMissing.of()
            private var receivingDepositoryFinancialInstitutionName: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(internationalAddenda: InternationalAddenda) = apply {
                this.destinationCountryCode = internationalAddenda.destinationCountryCode
                this.destinationCurrencyCode = internationalAddenda.destinationCurrencyCode
                this.foreignExchangeIndicator = internationalAddenda.foreignExchangeIndicator
                this.foreignExchangeReference = internationalAddenda.foreignExchangeReference
                this.foreignExchangeReferenceIndicator = internationalAddenda.foreignExchangeReferenceIndicator
                this.foreignPaymentAmount = internationalAddenda.foreignPaymentAmount
                this.foreignTraceNumber = internationalAddenda.foreignTraceNumber
                this.internationalTransactionTypeCode = internationalAddenda.internationalTransactionTypeCode
                this.originatingCurrencyCode = internationalAddenda.originatingCurrencyCode
                this.originatingDepositoryFinancialInstitutionBranchCountry = internationalAddenda.originatingDepositoryFinancialInstitutionBranchCountry
                this.originatingDepositoryFinancialInstitutionId = internationalAddenda.originatingDepositoryFinancialInstitutionId
                this.originatingDepositoryFinancialInstitutionIdQualifier = internationalAddenda.originatingDepositoryFinancialInstitutionIdQualifier
                this.originatingDepositoryFinancialInstitutionName = internationalAddenda.originatingDepositoryFinancialInstitutionName
                this.originatorCity = internationalAddenda.originatorCity
                this.originatorCountry = internationalAddenda.originatorCountry
                this.originatorIdentification = internationalAddenda.originatorIdentification
                this.originatorName = internationalAddenda.originatorName
                this.originatorPostalCode = internationalAddenda.originatorPostalCode
                this.originatorStateOrProvince = internationalAddenda.originatorStateOrProvince
                this.originatorStreetAddress = internationalAddenda.originatorStreetAddress
                this.paymentRelatedInformation = internationalAddenda.paymentRelatedInformation
                this.paymentRelatedInformation2 = internationalAddenda.paymentRelatedInformation2
                this.receiverCity = internationalAddenda.receiverCity
                this.receiverCountry = internationalAddenda.receiverCountry
                this.receiverIdentificationNumber = internationalAddenda.receiverIdentificationNumber
                this.receiverPostalCode = internationalAddenda.receiverPostalCode
                this.receiverStateOrProvince = internationalAddenda.receiverStateOrProvince
                this.receiverStreetAddress = internationalAddenda.receiverStreetAddress
                this.receivingCompanyOrIndividualName = internationalAddenda.receivingCompanyOrIndividualName
                this.receivingDepositoryFinancialInstitutionCountry = internationalAddenda.receivingDepositoryFinancialInstitutionCountry
                this.receivingDepositoryFinancialInstitutionId = internationalAddenda.receivingDepositoryFinancialInstitutionId
                this.receivingDepositoryFinancialInstitutionIdQualifier = internationalAddenda.receivingDepositoryFinancialInstitutionIdQualifier
                this.receivingDepositoryFinancialInstitutionName = internationalAddenda.receivingDepositoryFinancialInstitutionName
                additionalProperties(internationalAddenda.additionalProperties)
            }

            /**
             * The [ISO 3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), Alpha-2
             * country code of the destination country.
             */
            fun destinationCountryCode(destinationCountryCode: String) = destinationCountryCode(JsonField.of(destinationCountryCode))

            /**
             * The [ISO 3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), Alpha-2
             * country code of the destination country.
             */
            @JsonProperty("destination_country_code")
            @ExcludeMissing
            fun destinationCountryCode(destinationCountryCode: JsonField<String>) = apply {
                this.destinationCountryCode = destinationCountryCode
            }

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code for the
             * destination bank account.
             */
            fun destinationCurrencyCode(destinationCurrencyCode: String) = destinationCurrencyCode(JsonField.of(destinationCurrencyCode))

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code for the
             * destination bank account.
             */
            @JsonProperty("destination_currency_code")
            @ExcludeMissing
            fun destinationCurrencyCode(destinationCurrencyCode: JsonField<String>) = apply {
                this.destinationCurrencyCode = destinationCurrencyCode
            }

            /** A description of how the foreign exchange rate was calculated. */
            fun foreignExchangeIndicator(foreignExchangeIndicator: ForeignExchangeIndicator) = foreignExchangeIndicator(JsonField.of(foreignExchangeIndicator))

            /** A description of how the foreign exchange rate was calculated. */
            @JsonProperty("foreign_exchange_indicator")
            @ExcludeMissing
            fun foreignExchangeIndicator(foreignExchangeIndicator: JsonField<ForeignExchangeIndicator>) = apply {
                this.foreignExchangeIndicator = foreignExchangeIndicator
            }

            /**
             * Depending on the `foreign_exchange_reference_indicator`, an exchange rate or a
             * reference to a well-known rate.
             */
            fun foreignExchangeReference(foreignExchangeReference: String) = foreignExchangeReference(JsonField.of(foreignExchangeReference))

            /**
             * Depending on the `foreign_exchange_reference_indicator`, an exchange rate or a
             * reference to a well-known rate.
             */
            @JsonProperty("foreign_exchange_reference")
            @ExcludeMissing
            fun foreignExchangeReference(foreignExchangeReference: JsonField<String>) = apply {
                this.foreignExchangeReference = foreignExchangeReference
            }

            /**
             * An instruction of how to interpret the `foreign_exchange_reference` field for
             * this Transaction.
             */
            fun foreignExchangeReferenceIndicator(foreignExchangeReferenceIndicator: ForeignExchangeReferenceIndicator) = foreignExchangeReferenceIndicator(JsonField.of(foreignExchangeReferenceIndicator))

            /**
             * An instruction of how to interpret the `foreign_exchange_reference` field for
             * this Transaction.
             */
            @JsonProperty("foreign_exchange_reference_indicator")
            @ExcludeMissing
            fun foreignExchangeReferenceIndicator(foreignExchangeReferenceIndicator: JsonField<ForeignExchangeReferenceIndicator>) = apply {
                this.foreignExchangeReferenceIndicator = foreignExchangeReferenceIndicator
            }

            /**
             * The amount in the minor unit of the foreign payment currency. For dollars, for
             * example, this is cents.
             */
            fun foreignPaymentAmount(foreignPaymentAmount: Long) = foreignPaymentAmount(JsonField.of(foreignPaymentAmount))

            /**
             * The amount in the minor unit of the foreign payment currency. For dollars, for
             * example, this is cents.
             */
            @JsonProperty("foreign_payment_amount")
            @ExcludeMissing
            fun foreignPaymentAmount(foreignPaymentAmount: JsonField<Long>) = apply {
                this.foreignPaymentAmount = foreignPaymentAmount
            }

            /** A reference number in the foreign banking infrastructure. */
            fun foreignTraceNumber(foreignTraceNumber: String) = foreignTraceNumber(JsonField.of(foreignTraceNumber))

            /** A reference number in the foreign banking infrastructure. */
            @JsonProperty("foreign_trace_number")
            @ExcludeMissing
            fun foreignTraceNumber(foreignTraceNumber: JsonField<String>) = apply {
                this.foreignTraceNumber = foreignTraceNumber
            }

            /** The type of transfer. Set by the originator. */
            fun internationalTransactionTypeCode(internationalTransactionTypeCode: InternationalTransactionTypeCode) = internationalTransactionTypeCode(JsonField.of(internationalTransactionTypeCode))

            /** The type of transfer. Set by the originator. */
            @JsonProperty("international_transaction_type_code")
            @ExcludeMissing
            fun internationalTransactionTypeCode(internationalTransactionTypeCode: JsonField<InternationalTransactionTypeCode>) = apply {
                this.internationalTransactionTypeCode = internationalTransactionTypeCode
            }

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code for the
             * originating bank account.
             */
            fun originatingCurrencyCode(originatingCurrencyCode: String) = originatingCurrencyCode(JsonField.of(originatingCurrencyCode))

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code for the
             * originating bank account.
             */
            @JsonProperty("originating_currency_code")
            @ExcludeMissing
            fun originatingCurrencyCode(originatingCurrencyCode: JsonField<String>) = apply {
                this.originatingCurrencyCode = originatingCurrencyCode
            }

            /**
             * The [ISO 3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), Alpha-2
             * country code of the originating branch country.
             */
            fun originatingDepositoryFinancialInstitutionBranchCountry(originatingDepositoryFinancialInstitutionBranchCountry: String) = originatingDepositoryFinancialInstitutionBranchCountry(JsonField.of(originatingDepositoryFinancialInstitutionBranchCountry))

            /**
             * The [ISO 3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), Alpha-2
             * country code of the originating branch country.
             */
            @JsonProperty("originating_depository_financial_institution_branch_country")
            @ExcludeMissing
            fun originatingDepositoryFinancialInstitutionBranchCountry(originatingDepositoryFinancialInstitutionBranchCountry: JsonField<String>) = apply {
                this.originatingDepositoryFinancialInstitutionBranchCountry = originatingDepositoryFinancialInstitutionBranchCountry
            }

            /**
             * An identifier for the originating bank. One of an International Bank Account
             * Number (IBAN) bank identifier, SWIFT Bank Identification Code (BIC), or a
             * domestic identifier like a US Routing Number.
             */
            fun originatingDepositoryFinancialInstitutionId(originatingDepositoryFinancialInstitutionId: String) = originatingDepositoryFinancialInstitutionId(JsonField.of(originatingDepositoryFinancialInstitutionId))

            /**
             * An identifier for the originating bank. One of an International Bank Account
             * Number (IBAN) bank identifier, SWIFT Bank Identification Code (BIC), or a
             * domestic identifier like a US Routing Number.
             */
            @JsonProperty("originating_depository_financial_institution_id")
            @ExcludeMissing
            fun originatingDepositoryFinancialInstitutionId(originatingDepositoryFinancialInstitutionId: JsonField<String>) = apply {
                this.originatingDepositoryFinancialInstitutionId = originatingDepositoryFinancialInstitutionId
            }

            /**
             * An instruction of how to interpret the
             * `originating_depository_financial_institution_id` field for this Transaction.
             */
            fun originatingDepositoryFinancialInstitutionIdQualifier(originatingDepositoryFinancialInstitutionIdQualifier: OriginatingDepositoryFinancialInstitutionIdQualifier) = originatingDepositoryFinancialInstitutionIdQualifier(JsonField.of(originatingDepositoryFinancialInstitutionIdQualifier))

            /**
             * An instruction of how to interpret the
             * `originating_depository_financial_institution_id` field for this Transaction.
             */
            @JsonProperty("originating_depository_financial_institution_id_qualifier")
            @ExcludeMissing
            fun originatingDepositoryFinancialInstitutionIdQualifier(originatingDepositoryFinancialInstitutionIdQualifier: JsonField<OriginatingDepositoryFinancialInstitutionIdQualifier>) = apply {
                this.originatingDepositoryFinancialInstitutionIdQualifier = originatingDepositoryFinancialInstitutionIdQualifier
            }

            /**
             * The name of the originating bank. Sometimes this will refer to an American bank
             * and obscure the correspondent foreign bank.
             */
            fun originatingDepositoryFinancialInstitutionName(originatingDepositoryFinancialInstitutionName: String) = originatingDepositoryFinancialInstitutionName(JsonField.of(originatingDepositoryFinancialInstitutionName))

            /**
             * The name of the originating bank. Sometimes this will refer to an American bank
             * and obscure the correspondent foreign bank.
             */
            @JsonProperty("originating_depository_financial_institution_name")
            @ExcludeMissing
            fun originatingDepositoryFinancialInstitutionName(originatingDepositoryFinancialInstitutionName: JsonField<String>) = apply {
                this.originatingDepositoryFinancialInstitutionName = originatingDepositoryFinancialInstitutionName
            }

            /** A portion of the originator address. This may be incomplete. */
            fun originatorCity(originatorCity: String) = originatorCity(JsonField.of(originatorCity))

            /** A portion of the originator address. This may be incomplete. */
            @JsonProperty("originator_city")
            @ExcludeMissing
            fun originatorCity(originatorCity: JsonField<String>) = apply {
                this.originatorCity = originatorCity
            }

            /**
             * A portion of the originator address. The
             * [ISO 3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), Alpha-2 country
             * code of the originator country.
             */
            fun originatorCountry(originatorCountry: String) = originatorCountry(JsonField.of(originatorCountry))

            /**
             * A portion of the originator address. The
             * [ISO 3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), Alpha-2 country
             * code of the originator country.
             */
            @JsonProperty("originator_country")
            @ExcludeMissing
            fun originatorCountry(originatorCountry: JsonField<String>) = apply {
                this.originatorCountry = originatorCountry
            }

            /**
             * An identifier for the originating company. This is generally stable across
             * multiple ACH transfers.
             */
            fun originatorIdentification(originatorIdentification: String) = originatorIdentification(JsonField.of(originatorIdentification))

            /**
             * An identifier for the originating company. This is generally stable across
             * multiple ACH transfers.
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
            fun originatorPostalCode(originatorPostalCode: String) = originatorPostalCode(JsonField.of(originatorPostalCode))

            /** A portion of the originator address. This may be incomplete. */
            @JsonProperty("originator_postal_code")
            @ExcludeMissing
            fun originatorPostalCode(originatorPostalCode: JsonField<String>) = apply {
                this.originatorPostalCode = originatorPostalCode
            }

            /** A portion of the originator address. This may be incomplete. */
            fun originatorStateOrProvince(originatorStateOrProvince: String) = originatorStateOrProvince(JsonField.of(originatorStateOrProvince))

            /** A portion of the originator address. This may be incomplete. */
            @JsonProperty("originator_state_or_province")
            @ExcludeMissing
            fun originatorStateOrProvince(originatorStateOrProvince: JsonField<String>) = apply {
                this.originatorStateOrProvince = originatorStateOrProvince
            }

            /** A portion of the originator address. This may be incomplete. */
            fun originatorStreetAddress(originatorStreetAddress: String) = originatorStreetAddress(JsonField.of(originatorStreetAddress))

            /** A portion of the originator address. This may be incomplete. */
            @JsonProperty("originator_street_address")
            @ExcludeMissing
            fun originatorStreetAddress(originatorStreetAddress: JsonField<String>) = apply {
                this.originatorStreetAddress = originatorStreetAddress
            }

            /** A description field set by the originator. */
            fun paymentRelatedInformation(paymentRelatedInformation: String) = paymentRelatedInformation(JsonField.of(paymentRelatedInformation))

            /** A description field set by the originator. */
            @JsonProperty("payment_related_information")
            @ExcludeMissing
            fun paymentRelatedInformation(paymentRelatedInformation: JsonField<String>) = apply {
                this.paymentRelatedInformation = paymentRelatedInformation
            }

            /** A description field set by the originator. */
            fun paymentRelatedInformation2(paymentRelatedInformation2: String) = paymentRelatedInformation2(JsonField.of(paymentRelatedInformation2))

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
             * [ISO 3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), Alpha-2 country
             * code of the receiver country.
             */
            fun receiverCountry(receiverCountry: String) = receiverCountry(JsonField.of(receiverCountry))

            /**
             * A portion of the receiver address. The
             * [ISO 3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), Alpha-2 country
             * code of the receiver country.
             */
            @JsonProperty("receiver_country")
            @ExcludeMissing
            fun receiverCountry(receiverCountry: JsonField<String>) = apply {
                this.receiverCountry = receiverCountry
            }

            /** An identification number the originator uses for the receiver. */
            fun receiverIdentificationNumber(receiverIdentificationNumber: String) = receiverIdentificationNumber(JsonField.of(receiverIdentificationNumber))

            /** An identification number the originator uses for the receiver. */
            @JsonProperty("receiver_identification_number")
            @ExcludeMissing
            fun receiverIdentificationNumber(receiverIdentificationNumber: JsonField<String>) = apply {
                this.receiverIdentificationNumber = receiverIdentificationNumber
            }

            /** A portion of the receiver address. This may be incomplete. */
            fun receiverPostalCode(receiverPostalCode: String) = receiverPostalCode(JsonField.of(receiverPostalCode))

            /** A portion of the receiver address. This may be incomplete. */
            @JsonProperty("receiver_postal_code")
            @ExcludeMissing
            fun receiverPostalCode(receiverPostalCode: JsonField<String>) = apply {
                this.receiverPostalCode = receiverPostalCode
            }

            /** A portion of the receiver address. This may be incomplete. */
            fun receiverStateOrProvince(receiverStateOrProvince: String) = receiverStateOrProvince(JsonField.of(receiverStateOrProvince))

            /** A portion of the receiver address. This may be incomplete. */
            @JsonProperty("receiver_state_or_province")
            @ExcludeMissing
            fun receiverStateOrProvince(receiverStateOrProvince: JsonField<String>) = apply {
                this.receiverStateOrProvince = receiverStateOrProvince
            }

            /** A portion of the receiver address. This may be incomplete. */
            fun receiverStreetAddress(receiverStreetAddress: String) = receiverStreetAddress(JsonField.of(receiverStreetAddress))

            /** A portion of the receiver address. This may be incomplete. */
            @JsonProperty("receiver_street_address")
            @ExcludeMissing
            fun receiverStreetAddress(receiverStreetAddress: JsonField<String>) = apply {
                this.receiverStreetAddress = receiverStreetAddress
            }

            /** The name of the receiver of the transfer. This is not verified by Increase. */
            fun receivingCompanyOrIndividualName(receivingCompanyOrIndividualName: String) = receivingCompanyOrIndividualName(JsonField.of(receivingCompanyOrIndividualName))

            /** The name of the receiver of the transfer. This is not verified by Increase. */
            @JsonProperty("receiving_company_or_individual_name")
            @ExcludeMissing
            fun receivingCompanyOrIndividualName(receivingCompanyOrIndividualName: JsonField<String>) = apply {
                this.receivingCompanyOrIndividualName = receivingCompanyOrIndividualName
            }

            /**
             * The [ISO 3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), Alpha-2
             * country code of the receiving bank country.
             */
            fun receivingDepositoryFinancialInstitutionCountry(receivingDepositoryFinancialInstitutionCountry: String) = receivingDepositoryFinancialInstitutionCountry(JsonField.of(receivingDepositoryFinancialInstitutionCountry))

            /**
             * The [ISO 3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), Alpha-2
             * country code of the receiving bank country.
             */
            @JsonProperty("receiving_depository_financial_institution_country")
            @ExcludeMissing
            fun receivingDepositoryFinancialInstitutionCountry(receivingDepositoryFinancialInstitutionCountry: JsonField<String>) = apply {
                this.receivingDepositoryFinancialInstitutionCountry = receivingDepositoryFinancialInstitutionCountry
            }

            /**
             * An identifier for the receiving bank. One of an International Bank Account
             * Number (IBAN) bank identifier, SWIFT Bank Identification Code (BIC), or a
             * domestic identifier like a US Routing Number.
             */
            fun receivingDepositoryFinancialInstitutionId(receivingDepositoryFinancialInstitutionId: String) = receivingDepositoryFinancialInstitutionId(JsonField.of(receivingDepositoryFinancialInstitutionId))

            /**
             * An identifier for the receiving bank. One of an International Bank Account
             * Number (IBAN) bank identifier, SWIFT Bank Identification Code (BIC), or a
             * domestic identifier like a US Routing Number.
             */
            @JsonProperty("receiving_depository_financial_institution_id")
            @ExcludeMissing
            fun receivingDepositoryFinancialInstitutionId(receivingDepositoryFinancialInstitutionId: JsonField<String>) = apply {
                this.receivingDepositoryFinancialInstitutionId = receivingDepositoryFinancialInstitutionId
            }

            /**
             * An instruction of how to interpret the
             * `receiving_depository_financial_institution_id` field for this Transaction.
             */
            fun receivingDepositoryFinancialInstitutionIdQualifier(receivingDepositoryFinancialInstitutionIdQualifier: ReceivingDepositoryFinancialInstitutionIdQualifier) = receivingDepositoryFinancialInstitutionIdQualifier(JsonField.of(receivingDepositoryFinancialInstitutionIdQualifier))

            /**
             * An instruction of how to interpret the
             * `receiving_depository_financial_institution_id` field for this Transaction.
             */
            @JsonProperty("receiving_depository_financial_institution_id_qualifier")
            @ExcludeMissing
            fun receivingDepositoryFinancialInstitutionIdQualifier(receivingDepositoryFinancialInstitutionIdQualifier: JsonField<ReceivingDepositoryFinancialInstitutionIdQualifier>) = apply {
                this.receivingDepositoryFinancialInstitutionIdQualifier = receivingDepositoryFinancialInstitutionIdQualifier
            }

            /** The name of the receiving bank, as set by the sending financial institution. */
            fun receivingDepositoryFinancialInstitutionName(receivingDepositoryFinancialInstitutionName: String) = receivingDepositoryFinancialInstitutionName(JsonField.of(receivingDepositoryFinancialInstitutionName))

            /** The name of the receiving bank, as set by the sending financial institution. */
            @JsonProperty("receiving_depository_financial_institution_name")
            @ExcludeMissing
            fun receivingDepositoryFinancialInstitutionName(receivingDepositoryFinancialInstitutionName: JsonField<String>) = apply {
                this.receivingDepositoryFinancialInstitutionName = receivingDepositoryFinancialInstitutionName
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

            fun build(): InternationalAddenda = InternationalAddenda(
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
                additionalProperties.toUnmodifiable(),
            )
        }

        class ForeignExchangeIndicator @JsonCreator private constructor(private val value: JsonField<String>, ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue
            fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
              if (this === other) {
                  return true
              }

              return other is ForeignExchangeIndicator &&
                  this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val FIXED_TO_VARIABLE = ForeignExchangeIndicator(JsonField.of("fixed_to_variable"))

                @JvmField val VARIABLE_TO_FIXED = ForeignExchangeIndicator(JsonField.of("variable_to_fixed"))

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

            fun value(): Value = when (this) {
                FIXED_TO_VARIABLE -> Value.FIXED_TO_VARIABLE
                VARIABLE_TO_FIXED -> Value.VARIABLE_TO_FIXED
                FIXED_TO_FIXED -> Value.FIXED_TO_FIXED
                else -> Value._UNKNOWN
            }

            fun known(): Known = when (this) {
                FIXED_TO_VARIABLE -> Known.FIXED_TO_VARIABLE
                VARIABLE_TO_FIXED -> Known.VARIABLE_TO_FIXED
                FIXED_TO_FIXED -> Known.FIXED_TO_FIXED
                else -> throw IncreaseInvalidDataException("Unknown ForeignExchangeIndicator: $value")
            }

            fun asString(): String = _value().asStringOrThrow()
        }

        class ForeignExchangeReferenceIndicator @JsonCreator private constructor(private val value: JsonField<String>, ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue
            fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
              if (this === other) {
                  return true
              }

              return other is ForeignExchangeReferenceIndicator &&
                  this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val FOREIGN_EXCHANGE_RATE = ForeignExchangeReferenceIndicator(JsonField.of("foreign_exchange_rate"))

                @JvmField val FOREIGN_EXCHANGE_REFERENCE_NUMBER = ForeignExchangeReferenceIndicator(JsonField.of("foreign_exchange_reference_number"))

                @JvmField val BLANK = ForeignExchangeReferenceIndicator(JsonField.of("blank"))

                @JvmStatic fun of(value: String) = ForeignExchangeReferenceIndicator(JsonField.of(value))
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

            fun value(): Value = when (this) {
                FOREIGN_EXCHANGE_RATE -> Value.FOREIGN_EXCHANGE_RATE
                FOREIGN_EXCHANGE_REFERENCE_NUMBER -> Value.FOREIGN_EXCHANGE_REFERENCE_NUMBER
                BLANK -> Value.BLANK
                else -> Value._UNKNOWN
            }

            fun known(): Known = when (this) {
                FOREIGN_EXCHANGE_RATE -> Known.FOREIGN_EXCHANGE_RATE
                FOREIGN_EXCHANGE_REFERENCE_NUMBER -> Known.FOREIGN_EXCHANGE_REFERENCE_NUMBER
                BLANK -> Known.BLANK
                else -> throw IncreaseInvalidDataException("Unknown ForeignExchangeReferenceIndicator: $value")
            }

            fun asString(): String = _value().asStringOrThrow()
        }

        class InternationalTransactionTypeCode @JsonCreator private constructor(private val value: JsonField<String>, ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue
            fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
              if (this === other) {
                  return true
              }

              return other is InternationalTransactionTypeCode &&
                  this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val ANNUITY = InternationalTransactionTypeCode(JsonField.of("annuity"))

                @JvmField val BUSINESS_OR_COMMERCIAL = InternationalTransactionTypeCode(JsonField.of("business_or_commercial"))

                @JvmField val DEPOSIT = InternationalTransactionTypeCode(JsonField.of("deposit"))

                @JvmField val LOAN = InternationalTransactionTypeCode(JsonField.of("loan"))

                @JvmField val MISCELLANEOUS = InternationalTransactionTypeCode(JsonField.of("miscellaneous"))

                @JvmField val MORTGAGE = InternationalTransactionTypeCode(JsonField.of("mortgage"))

                @JvmField val PENSION = InternationalTransactionTypeCode(JsonField.of("pension"))

                @JvmField val REMITTANCE = InternationalTransactionTypeCode(JsonField.of("remittance"))

                @JvmField val RENT_OR_LEASE = InternationalTransactionTypeCode(JsonField.of("rent_or_lease"))

                @JvmField val SALARY_OR_PAYROLL = InternationalTransactionTypeCode(JsonField.of("salary_or_payroll"))

                @JvmField val TAX = InternationalTransactionTypeCode(JsonField.of("tax"))

                @JvmField val ACCOUNTS_RECEIVABLE = InternationalTransactionTypeCode(JsonField.of("accounts_receivable"))

                @JvmField val BACK_OFFICE_CONVERSION = InternationalTransactionTypeCode(JsonField.of("back_office_conversion"))

                @JvmField val MACHINE_TRANSFER = InternationalTransactionTypeCode(JsonField.of("machine_transfer"))

                @JvmField val POINT_OF_PURCHASE = InternationalTransactionTypeCode(JsonField.of("point_of_purchase"))

                @JvmField val POINT_OF_SALE = InternationalTransactionTypeCode(JsonField.of("point_of_sale"))

                @JvmField val REPRESENTED_CHECK = InternationalTransactionTypeCode(JsonField.of("represented_check"))

                @JvmField val SHARED_NETWORK_TRANSACTION = InternationalTransactionTypeCode(JsonField.of("shared_network_transaction"))

                @JvmField val TELPHONE_INITIATED = InternationalTransactionTypeCode(JsonField.of("telphone_initiated"))

                @JvmField val INTERNET_INITIATED = InternationalTransactionTypeCode(JsonField.of("internet_initiated"))

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

            fun value(): Value = when (this) {
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

            fun known(): Known = when (this) {
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
                else -> throw IncreaseInvalidDataException("Unknown InternationalTransactionTypeCode: $value")
            }

            fun asString(): String = _value().asStringOrThrow()
        }

        class OriginatingDepositoryFinancialInstitutionIdQualifier @JsonCreator private constructor(private val value: JsonField<String>, ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue
            fun _value(): JsonField<String> = value

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

                @JvmField val NATIONAL_CLEARING_SYSTEM_NUMBER = OriginatingDepositoryFinancialInstitutionIdQualifier(JsonField.of("national_clearing_system_number"))

                @JvmField val BIC_CODE = OriginatingDepositoryFinancialInstitutionIdQualifier(JsonField.of("bic_code"))

                @JvmField val IBAN = OriginatingDepositoryFinancialInstitutionIdQualifier(JsonField.of("iban"))

                @JvmStatic fun of(value: String) = OriginatingDepositoryFinancialInstitutionIdQualifier(JsonField.of(value))
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

            fun value(): Value = when (this) {
                NATIONAL_CLEARING_SYSTEM_NUMBER -> Value.NATIONAL_CLEARING_SYSTEM_NUMBER
                BIC_CODE -> Value.BIC_CODE
                IBAN -> Value.IBAN
                else -> Value._UNKNOWN
            }

            fun known(): Known = when (this) {
                NATIONAL_CLEARING_SYSTEM_NUMBER -> Known.NATIONAL_CLEARING_SYSTEM_NUMBER
                BIC_CODE -> Known.BIC_CODE
                IBAN -> Known.IBAN
                else -> throw IncreaseInvalidDataException("Unknown OriginatingDepositoryFinancialInstitutionIdQualifier: $value")
            }

            fun asString(): String = _value().asStringOrThrow()
        }

        class ReceivingDepositoryFinancialInstitutionIdQualifier @JsonCreator private constructor(private val value: JsonField<String>, ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue
            fun _value(): JsonField<String> = value

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

                @JvmField val NATIONAL_CLEARING_SYSTEM_NUMBER = ReceivingDepositoryFinancialInstitutionIdQualifier(JsonField.of("national_clearing_system_number"))

                @JvmField val BIC_CODE = ReceivingDepositoryFinancialInstitutionIdQualifier(JsonField.of("bic_code"))

                @JvmField val IBAN = ReceivingDepositoryFinancialInstitutionIdQualifier(JsonField.of("iban"))

                @JvmStatic fun of(value: String) = ReceivingDepositoryFinancialInstitutionIdQualifier(JsonField.of(value))
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

            fun value(): Value = when (this) {
                NATIONAL_CLEARING_SYSTEM_NUMBER -> Value.NATIONAL_CLEARING_SYSTEM_NUMBER
                BIC_CODE -> Value.BIC_CODE
                IBAN -> Value.IBAN
                else -> Value._UNKNOWN
            }

            fun known(): Known = when (this) {
                NATIONAL_CLEARING_SYSTEM_NUMBER -> Known.NATIONAL_CLEARING_SYSTEM_NUMBER
                BIC_CODE -> Known.BIC_CODE
                IBAN -> Known.IBAN
                else -> throw IncreaseInvalidDataException("Unknown ReceivingDepositoryFinancialInstitutionIdQualifier: $value")
            }

            fun asString(): String = _value().asStringOrThrow()
        }
    }

    /**
     * If you initiate a notification of change in response to the transfer, this will
     * contain its details.
     */
    @JsonDeserialize(builder = NotificationOfChange.Builder::class)
    @NoAutoDetect
    class NotificationOfChange private constructor(private val updatedAccountNumber: JsonField<String>, private val updatedRoutingNumber: JsonField<String>, private val additionalProperties: Map<String, JsonValue>, ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /** The new account number provided in the notification of change. */
        fun updatedAccountNumber(): Optional<String> = Optional.ofNullable(updatedAccountNumber.getNullable("updated_account_number"))

        /** The new account number provided in the notification of change. */
        fun updatedRoutingNumber(): Optional<String> = Optional.ofNullable(updatedRoutingNumber.getNullable("updated_routing_number"))

        /** The new account number provided in the notification of change. */
        @JsonProperty("updated_account_number")
        @ExcludeMissing
        fun _updatedAccountNumber() = updatedAccountNumber

        /** The new account number provided in the notification of change. */
        @JsonProperty("updated_routing_number")
        @ExcludeMissing
        fun _updatedRoutingNumber() = updatedRoutingNumber

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): NotificationOfChange = apply {
            if (!validated) {
              updatedAccountNumber()
              updatedRoutingNumber()
              validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is NotificationOfChange &&
              this.updatedAccountNumber == other.updatedAccountNumber &&
              this.updatedRoutingNumber == other.updatedRoutingNumber &&
              this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
          if (hashCode == 0) {
            hashCode = Objects.hash(
                updatedAccountNumber,
                updatedRoutingNumber,
                additionalProperties,
            )
          }
          return hashCode
        }

        override fun toString() = "NotificationOfChange{updatedAccountNumber=$updatedAccountNumber, updatedRoutingNumber=$updatedRoutingNumber, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic
            fun builder() = Builder()
        }

        class Builder {

            private var updatedAccountNumber: JsonField<String> = JsonMissing.of()
            private var updatedRoutingNumber: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(notificationOfChange: NotificationOfChange) = apply {
                this.updatedAccountNumber = notificationOfChange.updatedAccountNumber
                this.updatedRoutingNumber = notificationOfChange.updatedRoutingNumber
                additionalProperties(notificationOfChange.additionalProperties)
            }

            /** The new account number provided in the notification of change. */
            fun updatedAccountNumber(updatedAccountNumber: String) = updatedAccountNumber(JsonField.of(updatedAccountNumber))

            /** The new account number provided in the notification of change. */
            @JsonProperty("updated_account_number")
            @ExcludeMissing
            fun updatedAccountNumber(updatedAccountNumber: JsonField<String>) = apply {
                this.updatedAccountNumber = updatedAccountNumber
            }

            /** The new account number provided in the notification of change. */
            fun updatedRoutingNumber(updatedRoutingNumber: String) = updatedRoutingNumber(JsonField.of(updatedRoutingNumber))

            /** The new account number provided in the notification of change. */
            @JsonProperty("updated_routing_number")
            @ExcludeMissing
            fun updatedRoutingNumber(updatedRoutingNumber: JsonField<String>) = apply {
                this.updatedRoutingNumber = updatedRoutingNumber
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

            fun build(): NotificationOfChange = NotificationOfChange(
                updatedAccountNumber,
                updatedRoutingNumber,
                additionalProperties.toUnmodifiable(),
            )
        }
    }

    class StandardEntryClassCode @JsonCreator private constructor(private val value: JsonField<String>, ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue
        fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is StandardEntryClassCode &&
              this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val CORPORATE_CREDIT_OR_DEBIT = StandardEntryClassCode(JsonField.of("corporate_credit_or_debit"))

            @JvmField val CORPORATE_TRADE_EXCHANGE = StandardEntryClassCode(JsonField.of("corporate_trade_exchange"))

            @JvmField val PREARRANGED_PAYMENTS_AND_DEPOSIT = StandardEntryClassCode(JsonField.of("prearranged_payments_and_deposit"))

            @JvmField val INTERNET_INITIATED = StandardEntryClassCode(JsonField.of("internet_initiated"))

            @JvmField val POINT_OF_SALE = StandardEntryClassCode(JsonField.of("point_of_sale"))

            @JvmField val TELEPHONE_INITIATED = StandardEntryClassCode(JsonField.of("telephone_initiated"))

            @JvmField val CUSTOMER_INITIATED = StandardEntryClassCode(JsonField.of("customer_initiated"))

            @JvmField val ACCOUNTS_RECEIVABLE = StandardEntryClassCode(JsonField.of("accounts_receivable"))

            @JvmField val MACHINE_TRANSFER = StandardEntryClassCode(JsonField.of("machine_transfer"))

            @JvmField val SHARED_NETWORK_TRANSACTION = StandardEntryClassCode(JsonField.of("shared_network_transaction"))

            @JvmField val REPRESENTED_CHECK = StandardEntryClassCode(JsonField.of("represented_check"))

            @JvmField val BACK_OFFICE_CONVERSION = StandardEntryClassCode(JsonField.of("back_office_conversion"))

            @JvmField val POINT_OF_PURCHASE = StandardEntryClassCode(JsonField.of("point_of_purchase"))

            @JvmField val CHECK_TRUNCATION = StandardEntryClassCode(JsonField.of("check_truncation"))

            @JvmField val DESTROYED_CHECK = StandardEntryClassCode(JsonField.of("destroyed_check"))

            @JvmField val INTERNATIONAL_ACH_TRANSACTION = StandardEntryClassCode(JsonField.of("international_ach_transaction"))

            @JvmStatic fun of(value: String) = StandardEntryClassCode(JsonField.of(value))
        }

        enum class Known {
            CORPORATE_CREDIT_OR_DEBIT,
            CORPORATE_TRADE_EXCHANGE,
            PREARRANGED_PAYMENTS_AND_DEPOSIT,
            INTERNET_INITIATED,
            POINT_OF_SALE,
            TELEPHONE_INITIATED,
            CUSTOMER_INITIATED,
            ACCOUNTS_RECEIVABLE,
            MACHINE_TRANSFER,
            SHARED_NETWORK_TRANSACTION,
            REPRESENTED_CHECK,
            BACK_OFFICE_CONVERSION,
            POINT_OF_PURCHASE,
            CHECK_TRUNCATION,
            DESTROYED_CHECK,
            INTERNATIONAL_ACH_TRANSACTION,
        }

        enum class Value {
            CORPORATE_CREDIT_OR_DEBIT,
            CORPORATE_TRADE_EXCHANGE,
            PREARRANGED_PAYMENTS_AND_DEPOSIT,
            INTERNET_INITIATED,
            POINT_OF_SALE,
            TELEPHONE_INITIATED,
            CUSTOMER_INITIATED,
            ACCOUNTS_RECEIVABLE,
            MACHINE_TRANSFER,
            SHARED_NETWORK_TRANSACTION,
            REPRESENTED_CHECK,
            BACK_OFFICE_CONVERSION,
            POINT_OF_PURCHASE,
            CHECK_TRUNCATION,
            DESTROYED_CHECK,
            INTERNATIONAL_ACH_TRANSACTION,
            _UNKNOWN,
        }

        fun value(): Value = when (this) {
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

        fun known(): Known = when (this) {
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

        fun asString(): String = _value().asStringOrThrow()
    }

    class Status @JsonCreator private constructor(private val value: JsonField<String>, ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue
        fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is Status &&
              this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val PENDING = Status(JsonField.of("pending"))

            @JvmField val DECLINED = Status(JsonField.of("declined"))

            @JvmField val ACCEPTED = Status(JsonField.of("accepted"))

            @JvmField val RETURNED = Status(JsonField.of("returned"))

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            PENDING,
            DECLINED,
            ACCEPTED,
            RETURNED,
        }

        enum class Value {
            PENDING,
            DECLINED,
            ACCEPTED,
            RETURNED,
            _UNKNOWN,
        }

        fun value(): Value = when (this) {
            PENDING -> Value.PENDING
            DECLINED -> Value.DECLINED
            ACCEPTED -> Value.ACCEPTED
            RETURNED -> Value.RETURNED
            else -> Value._UNKNOWN
        }

        fun known(): Known = when (this) {
            PENDING -> Known.PENDING
            DECLINED -> Known.DECLINED
            ACCEPTED -> Known.ACCEPTED
            RETURNED -> Known.RETURNED
            else -> throw IncreaseInvalidDataException("Unknown Status: $value")
        }

        fun asString(): String = _value().asStringOrThrow()
    }

    /** If your transfer is returned, this will contain details of the return. */
    @JsonDeserialize(builder = TransferReturn.Builder::class)
    @NoAutoDetect
    class TransferReturn private constructor(
      private val reason: JsonField<Reason>,
      private val returnedAt: JsonField<OffsetDateTime>,
      private val transactionId: JsonField<String>,
      private val additionalProperties: Map<String, JsonValue>,

    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /** The reason for the transfer return. */
        fun reason(): Reason = reason.getRequired("reason")

        /** The time at which the transfer was returned. */
        fun returnedAt(): OffsetDateTime = returnedAt.getRequired("returned_at")

        /** The id of the transaction for the returned transfer. */
        fun transactionId(): String = transactionId.getRequired("transaction_id")

        /** The reason for the transfer return. */
        @JsonProperty("reason")
        @ExcludeMissing
        fun _reason() = reason

        /** The time at which the transfer was returned. */
        @JsonProperty("returned_at")
        @ExcludeMissing
        fun _returnedAt() = returnedAt

        /** The id of the transaction for the returned transfer. */
        @JsonProperty("transaction_id")
        @ExcludeMissing
        fun _transactionId() = transactionId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): TransferReturn = apply {
            if (!validated) {
              reason()
              returnedAt()
              transactionId()
              validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is TransferReturn &&
              this.reason == other.reason &&
              this.returnedAt == other.returnedAt &&
              this.transactionId == other.transactionId &&
              this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
          if (hashCode == 0) {
            hashCode = Objects.hash(
                reason,
                returnedAt,
                transactionId,
                additionalProperties,
            )
          }
          return hashCode
        }

        override fun toString() = "TransferReturn{reason=$reason, returnedAt=$returnedAt, transactionId=$transactionId, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic
            fun builder() = Builder()
        }

        class Builder {

            private var reason: JsonField<Reason> = JsonMissing.of()
            private var returnedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var transactionId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(transferReturn: TransferReturn) = apply {
                this.reason = transferReturn.reason
                this.returnedAt = transferReturn.returnedAt
                this.transactionId = transferReturn.transactionId
                additionalProperties(transferReturn.additionalProperties)
            }

            /** The reason for the transfer return. */
            fun reason(reason: Reason) = reason(JsonField.of(reason))

            /** The reason for the transfer return. */
            @JsonProperty("reason")
            @ExcludeMissing
            fun reason(reason: JsonField<Reason>) = apply {
                this.reason = reason
            }

            /** The time at which the transfer was returned. */
            fun returnedAt(returnedAt: OffsetDateTime) = returnedAt(JsonField.of(returnedAt))

            /** The time at which the transfer was returned. */
            @JsonProperty("returned_at")
            @ExcludeMissing
            fun returnedAt(returnedAt: JsonField<OffsetDateTime>) = apply {
                this.returnedAt = returnedAt
            }

            /** The id of the transaction for the returned transfer. */
            fun transactionId(transactionId: String) = transactionId(JsonField.of(transactionId))

            /** The id of the transaction for the returned transfer. */
            @JsonProperty("transaction_id")
            @ExcludeMissing
            fun transactionId(transactionId: JsonField<String>) = apply {
                this.transactionId = transactionId
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

            fun build(): TransferReturn = TransferReturn(
                reason,
                returnedAt,
                transactionId,
                additionalProperties.toUnmodifiable(),
            )
        }

        class Reason @JsonCreator private constructor(private val value: JsonField<String>, ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue
            fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
              if (this === other) {
                  return true
              }

              return other is Reason &&
                  this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val INSUFFICIENT_FUNDS = Reason(JsonField.of("insufficient_funds"))

                @JvmField val RETURNED_PER_ODFI_REQUEST = Reason(JsonField.of("returned_per_odfi_request"))

                @JvmField val AUTHORIZATION_REVOKED_BY_CUSTOMER = Reason(JsonField.of("authorization_revoked_by_customer"))

                @JvmField val PAYMENT_STOPPED = Reason(JsonField.of("payment_stopped"))

                @JvmField val CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE = Reason(JsonField.of("customer_advised_unauthorized_improper_ineligible_or_incomplete"))

                @JvmField val REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY = Reason(JsonField.of("representative_payee_deceased_or_unable_to_continue_in_that_capacity"))

                @JvmField val BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED = Reason(JsonField.of("beneficiary_or_account_holder_deceased"))

                @JvmField val CREDIT_ENTRY_REFUSED_BY_RECEIVER = Reason(JsonField.of("credit_entry_refused_by_receiver"))

                @JvmField val DUPLICATE_ENTRY = Reason(JsonField.of("duplicate_entry"))

                @JvmField val CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED = Reason(JsonField.of("corporate_customer_advised_not_authorized"))

                @JvmStatic fun of(value: String) = Reason(JsonField.of(value))
            }

            enum class Known {
                INSUFFICIENT_FUNDS,
                RETURNED_PER_ODFI_REQUEST,
                AUTHORIZATION_REVOKED_BY_CUSTOMER,
                PAYMENT_STOPPED,
                CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE,
                REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY,
                BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED,
                CREDIT_ENTRY_REFUSED_BY_RECEIVER,
                DUPLICATE_ENTRY,
                CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED,
            }

            enum class Value {
                INSUFFICIENT_FUNDS,
                RETURNED_PER_ODFI_REQUEST,
                AUTHORIZATION_REVOKED_BY_CUSTOMER,
                PAYMENT_STOPPED,
                CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE,
                REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY,
                BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED,
                CREDIT_ENTRY_REFUSED_BY_RECEIVER,
                DUPLICATE_ENTRY,
                CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED,
                _UNKNOWN,
            }

            fun value(): Value = when (this) {
                INSUFFICIENT_FUNDS -> Value.INSUFFICIENT_FUNDS
                RETURNED_PER_ODFI_REQUEST -> Value.RETURNED_PER_ODFI_REQUEST
                AUTHORIZATION_REVOKED_BY_CUSTOMER -> Value.AUTHORIZATION_REVOKED_BY_CUSTOMER
                PAYMENT_STOPPED -> Value.PAYMENT_STOPPED
                CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE -> Value.CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE
                REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY -> Value.REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY
                BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED -> Value.BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED
                CREDIT_ENTRY_REFUSED_BY_RECEIVER -> Value.CREDIT_ENTRY_REFUSED_BY_RECEIVER
                DUPLICATE_ENTRY -> Value.DUPLICATE_ENTRY
                CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED -> Value.CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED
                else -> Value._UNKNOWN
            }

            fun known(): Known = when (this) {
                INSUFFICIENT_FUNDS -> Known.INSUFFICIENT_FUNDS
                RETURNED_PER_ODFI_REQUEST -> Known.RETURNED_PER_ODFI_REQUEST
                AUTHORIZATION_REVOKED_BY_CUSTOMER -> Known.AUTHORIZATION_REVOKED_BY_CUSTOMER
                PAYMENT_STOPPED -> Known.PAYMENT_STOPPED
                CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE -> Known.CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE
                REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY -> Known.REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY
                BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED -> Known.BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED
                CREDIT_ENTRY_REFUSED_BY_RECEIVER -> Known.CREDIT_ENTRY_REFUSED_BY_RECEIVER
                DUPLICATE_ENTRY -> Known.DUPLICATE_ENTRY
                CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED -> Known.CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED
                else -> throw IncreaseInvalidDataException("Unknown Reason: $value")
            }

            fun asString(): String = _value().asStringOrThrow()
        }
    }

    class Type @JsonCreator private constructor(private val value: JsonField<String>, ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue
        fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is Type &&
              this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val INBOUND_ACH_TRANSFER = Type(JsonField.of("inbound_ach_transfer"))

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            INBOUND_ACH_TRANSFER,
        }

        enum class Value {
            INBOUND_ACH_TRANSFER,
            _UNKNOWN,
        }

        fun value(): Value = when (this) {
            INBOUND_ACH_TRANSFER -> Value.INBOUND_ACH_TRANSFER
            else -> Value._UNKNOWN
        }

        fun known(): Known = when (this) {
            INBOUND_ACH_TRANSFER -> Known.INBOUND_ACH_TRANSFER
            else -> throw IncreaseInvalidDataException("Unknown Type: $value")
        }

        fun asString(): String = _value().asStringOrThrow()
    }
}
