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
import java.util.Objects
import java.util.Optional
import java.util.UUID
import com.increase.api.core.BaseDeserializer
import com.increase.api.core.BaseSerializer
import com.increase.api.core.getOrThrow
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.JsonField
import com.increase.api.core.toUnmodifiable
import com.increase.api.core.NoAutoDetect
import com.increase.api.errors.IncreaseInvalidDataException

/**
 * ACH transfers move funds between your Increase account and any other account
 * accessible by the Automated Clearing House (ACH).
 */
@JsonDeserialize(builder = AchTransfer.Builder::class)
@NoAutoDetect
class AchTransfer private constructor(private val accountId: JsonField<String>,private val accountNumber: JsonField<String>,private val addendum: JsonField<String>,private val amount: JsonField<Long>,private val currency: JsonField<Currency>,private val approval: JsonField<Approval>,private val cancellation: JsonField<Cancellation>,private val createdAt: JsonField<OffsetDateTime>,private val externalAccountId: JsonField<String>,private val id: JsonField<String>,private val network: JsonField<Network>,private val notificationOfChange: JsonField<NotificationOfChange>,private val return_: JsonField<Return>,private val routingNumber: JsonField<String>,private val statementDescriptor: JsonField<String>,private val status: JsonField<Status>,private val submission: JsonField<Submission>,private val templateId: JsonField<String>,private val transactionId: JsonField<String>,private val companyDescriptiveDate: JsonField<String>,private val companyDiscretionaryData: JsonField<String>,private val companyEntryDescription: JsonField<String>,private val companyName: JsonField<String>,private val funding: JsonField<Funding>,private val individualId: JsonField<String>,private val individualName: JsonField<String>,private val effectiveDate: JsonField<LocalDate>,private val standardEntryClassCode: JsonField<StandardEntryClassCode>,private val type: JsonField<Type>,private val additionalProperties: Map<String, JsonValue>,) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** The Account to which the transfer belongs. */
    fun accountId(): String = accountId.getRequired("account_id")

    /** The destination account number. */
    fun accountNumber(): String = accountNumber.getRequired("account_number")

    /** Additional information that will be sent to the recipient. */
    fun addendum(): Optional<String> = Optional.ofNullable(addendum.getNullable("addendum"))

    /**
     * The transfer amount in USD cents. A positive amount indicates a credit transfer
     * pushing funds to the receiving account. A negative amount indicates a debit
     * transfer pulling funds from the receiving account.
     */
    fun amount(): Long = amount.getRequired("amount")

    /**
     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transfer's
     * currency. For ACH transfers this is always equal to `usd`.
     */
    fun currency(): Currency = currency.getRequired("currency")

    /**
     * If your account requires approvals for transfers and the transfer was approved,
     * this will contain details of the approval.
     */
    fun approval(): Optional<Approval> = Optional.ofNullable(approval.getNullable("approval"))

    /**
     * If your account requires approvals for transfers and the transfer was not
     * approved, this will contain details of the cancellation.
     */
    fun cancellation(): Optional<Cancellation> = Optional.ofNullable(cancellation.getNullable("cancellation"))

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which
     * the transfer was created.
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /** The identifier of the External Account the transfer was made to, if any. */
    fun externalAccountId(): Optional<String> = Optional.ofNullable(externalAccountId.getNullable("external_account_id"))

    /** The ACH transfer's identifier. */
    fun id(): String = id.getRequired("id")

    /** The transfer's network. */
    fun network(): Network = network.getRequired("network")

    /**
     * If the receiving bank accepts the transfer but notifies that future transfers
     * should use different details, this will contain those details.
     */
    fun notificationOfChange(): Optional<NotificationOfChange> = Optional.ofNullable(notificationOfChange.getNullable("notification_of_change"))

    /** If your transfer is returned, this will contain details of the return. */
    fun return_(): Optional<Return> = Optional.ofNullable(return_.getNullable("return"))

    /** The American Bankers' Association (ABA) Routing Transit Number (RTN). */
    fun routingNumber(): String = routingNumber.getRequired("routing_number")

    /** The descriptor that will show on the recipient's bank statement. */
    fun statementDescriptor(): String = statementDescriptor.getRequired("statement_descriptor")

    /** The lifecycle status of the transfer. */
    fun status(): Status = status.getRequired("status")

    /**
     * After the transfer is submitted to FedACH, this will contain supplemental
     * details.
     */
    fun submission(): Optional<Submission> = Optional.ofNullable(submission.getNullable("submission"))

    /** If the transfer was created from a template, this will be the template's ID. */
    fun templateId(): Optional<String> = Optional.ofNullable(templateId.getNullable("template_id"))

    /** The ID for the transaction funding the transfer. */
    fun transactionId(): Optional<String> = Optional.ofNullable(transactionId.getNullable("transaction_id"))

    /** The description of the date of the transfer. */
    fun companyDescriptiveDate(): Optional<String> = Optional.ofNullable(companyDescriptiveDate.getNullable("company_descriptive_date"))

    /** The data you chose to associate with the transfer. */
    fun companyDiscretionaryData(): Optional<String> = Optional.ofNullable(companyDiscretionaryData.getNullable("company_discretionary_data"))

    /** The description of the transfer you set to be shown to the recipient. */
    fun companyEntryDescription(): Optional<String> = Optional.ofNullable(companyEntryDescription.getNullable("company_entry_description"))

    /** The name by which the recipient knows you. */
    fun companyName(): Optional<String> = Optional.ofNullable(companyName.getNullable("company_name"))

    /** The type of the account to which the transfer will be sent. */
    fun funding(): Funding = funding.getRequired("funding")

    /** Your identifer for the transfer recipient. */
    fun individualId(): Optional<String> = Optional.ofNullable(individualId.getNullable("individual_id"))

    /**
     * The name of the transfer recipient. This value is information and not verified
     * by the recipient's bank.
     */
    fun individualName(): Optional<String> = Optional.ofNullable(individualName.getNullable("individual_name"))

    /**
     * The transfer effective date in
     * [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format.
     */
    fun effectiveDate(): Optional<LocalDate> = Optional.ofNullable(effectiveDate.getNullable("effective_date"))

    /** The Standard Entry Class (SEC) code to use for the transfer. */
    fun standardEntryClassCode(): StandardEntryClassCode = standardEntryClassCode.getRequired("standard_entry_class_code")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `ach_transfer`.
     */
    fun type(): Type = type.getRequired("type")

    /** The Account to which the transfer belongs. */
    @JsonProperty("account_id")
    @ExcludeMissing
    fun _accountId() = accountId

    /** The destination account number. */
    @JsonProperty("account_number")
    @ExcludeMissing
    fun _accountNumber() = accountNumber

    /** Additional information that will be sent to the recipient. */
    @JsonProperty("addendum")
    @ExcludeMissing
    fun _addendum() = addendum

    /**
     * The transfer amount in USD cents. A positive amount indicates a credit transfer
     * pushing funds to the receiving account. A negative amount indicates a debit
     * transfer pulling funds from the receiving account.
     */
    @JsonProperty("amount")
    @ExcludeMissing
    fun _amount() = amount

    /**
     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transfer's
     * currency. For ACH transfers this is always equal to `usd`.
     */
    @JsonProperty("currency")
    @ExcludeMissing
    fun _currency() = currency

    /**
     * If your account requires approvals for transfers and the transfer was approved,
     * this will contain details of the approval.
     */
    @JsonProperty("approval")
    @ExcludeMissing
    fun _approval() = approval

    /**
     * If your account requires approvals for transfers and the transfer was not
     * approved, this will contain details of the cancellation.
     */
    @JsonProperty("cancellation")
    @ExcludeMissing
    fun _cancellation() = cancellation

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which
     * the transfer was created.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt() = createdAt

    /** The identifier of the External Account the transfer was made to, if any. */
    @JsonProperty("external_account_id")
    @ExcludeMissing
    fun _externalAccountId() = externalAccountId

    /** The ACH transfer's identifier. */
    @JsonProperty("id")
    @ExcludeMissing
    fun _id() = id

    /** The transfer's network. */
    @JsonProperty("network")
    @ExcludeMissing
    fun _network() = network

    /**
     * If the receiving bank accepts the transfer but notifies that future transfers
     * should use different details, this will contain those details.
     */
    @JsonProperty("notification_of_change")
    @ExcludeMissing
    fun _notificationOfChange() = notificationOfChange

    /** If your transfer is returned, this will contain details of the return. */
    @JsonProperty("return")
    @ExcludeMissing
    fun _return_() = return_

    /** The American Bankers' Association (ABA) Routing Transit Number (RTN). */
    @JsonProperty("routing_number")
    @ExcludeMissing
    fun _routingNumber() = routingNumber

    /** The descriptor that will show on the recipient's bank statement. */
    @JsonProperty("statement_descriptor")
    @ExcludeMissing
    fun _statementDescriptor() = statementDescriptor

    /** The lifecycle status of the transfer. */
    @JsonProperty("status")
    @ExcludeMissing
    fun _status() = status

    /**
     * After the transfer is submitted to FedACH, this will contain supplemental
     * details.
     */
    @JsonProperty("submission")
    @ExcludeMissing
    fun _submission() = submission

    /** If the transfer was created from a template, this will be the template's ID. */
    @JsonProperty("template_id")
    @ExcludeMissing
    fun _templateId() = templateId

    /** The ID for the transaction funding the transfer. */
    @JsonProperty("transaction_id")
    @ExcludeMissing
    fun _transactionId() = transactionId

    /** The description of the date of the transfer. */
    @JsonProperty("company_descriptive_date")
    @ExcludeMissing
    fun _companyDescriptiveDate() = companyDescriptiveDate

    /** The data you chose to associate with the transfer. */
    @JsonProperty("company_discretionary_data")
    @ExcludeMissing
    fun _companyDiscretionaryData() = companyDiscretionaryData

    /** The description of the transfer you set to be shown to the recipient. */
    @JsonProperty("company_entry_description")
    @ExcludeMissing
    fun _companyEntryDescription() = companyEntryDescription

    /** The name by which the recipient knows you. */
    @JsonProperty("company_name")
    @ExcludeMissing
    fun _companyName() = companyName

    /** The type of the account to which the transfer will be sent. */
    @JsonProperty("funding")
    @ExcludeMissing
    fun _funding() = funding

    /** Your identifer for the transfer recipient. */
    @JsonProperty("individual_id")
    @ExcludeMissing
    fun _individualId() = individualId

    /**
     * The name of the transfer recipient. This value is information and not verified
     * by the recipient's bank.
     */
    @JsonProperty("individual_name")
    @ExcludeMissing
    fun _individualName() = individualName

    /**
     * The transfer effective date in
     * [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format.
     */
    @JsonProperty("effective_date")
    @ExcludeMissing
    fun _effectiveDate() = effectiveDate

    /** The Standard Entry Class (SEC) code to use for the transfer. */
    @JsonProperty("standard_entry_class_code")
    @ExcludeMissing
    fun _standardEntryClassCode() = standardEntryClassCode

    /**
     * A constant representing the object's type. For this resource it will always be
     * `ach_transfer`.
     */
    @JsonProperty("type")
    @ExcludeMissing
    fun _type() = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate() = apply {
        if (!validated) {
          accountId()
          accountNumber()
          addendum()
          amount()
          currency()
          approval().map { it.validate() }
          cancellation().map { it.validate() }
          createdAt()
          externalAccountId()
          id()
          network()
          notificationOfChange().map { it.validate() }
          return_().map { it.validate() }
          routingNumber()
          statementDescriptor()
          status()
          submission().map { it.validate() }
          templateId()
          transactionId()
          companyDescriptiveDate()
          companyDiscretionaryData()
          companyEntryDescription()
          companyName()
          funding()
          individualId()
          individualName()
          effectiveDate()
          standardEntryClassCode()
          type()
          validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return other is AchTransfer &&
          this.accountId == other.accountId &&
          this.accountNumber == other.accountNumber &&
          this.addendum == other.addendum &&
          this.amount == other.amount &&
          this.currency == other.currency &&
          this.approval == other.approval &&
          this.cancellation == other.cancellation &&
          this.createdAt == other.createdAt &&
          this.externalAccountId == other.externalAccountId &&
          this.id == other.id &&
          this.network == other.network &&
          this.notificationOfChange == other.notificationOfChange &&
          this.return_ == other.return_ &&
          this.routingNumber == other.routingNumber &&
          this.statementDescriptor == other.statementDescriptor &&
          this.status == other.status &&
          this.submission == other.submission &&
          this.templateId == other.templateId &&
          this.transactionId == other.transactionId &&
          this.companyDescriptiveDate == other.companyDescriptiveDate &&
          this.companyDiscretionaryData == other.companyDiscretionaryData &&
          this.companyEntryDescription == other.companyEntryDescription &&
          this.companyName == other.companyName &&
          this.funding == other.funding &&
          this.individualId == other.individualId &&
          this.individualName == other.individualName &&
          this.effectiveDate == other.effectiveDate &&
          this.standardEntryClassCode == other.standardEntryClassCode &&
          this.type == other.type &&
          this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
      if (hashCode == 0) {
        hashCode = Objects.hash(
            accountId,
            accountNumber,
            addendum,
            amount,
            currency,
            approval,
            cancellation,
            createdAt,
            externalAccountId,
            id,
            network,
            notificationOfChange,
            return_,
            routingNumber,
            statementDescriptor,
            status,
            submission,
            templateId,
            transactionId,
            companyDescriptiveDate,
            companyDiscretionaryData,
            companyEntryDescription,
            companyName,
            funding,
            individualId,
            individualName,
            effectiveDate,
            standardEntryClassCode,
            type,
            additionalProperties,
        )
      }
      return hashCode
    }

    override fun toString() = "AchTransfer{accountId=$accountId, accountNumber=$accountNumber, addendum=$addendum, amount=$amount, currency=$currency, approval=$approval, cancellation=$cancellation, createdAt=$createdAt, externalAccountId=$externalAccountId, id=$id, network=$network, notificationOfChange=$notificationOfChange, return_=$return_, routingNumber=$routingNumber, statementDescriptor=$statementDescriptor, status=$status, submission=$submission, templateId=$templateId, transactionId=$transactionId, companyDescriptiveDate=$companyDescriptiveDate, companyDiscretionaryData=$companyDiscretionaryData, companyEntryDescription=$companyEntryDescription, companyName=$companyName, funding=$funding, individualId=$individualId, individualName=$individualName, effectiveDate=$effectiveDate, standardEntryClassCode=$standardEntryClassCode, type=$type, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic
        fun builder() = Builder()
    }

    class Builder {

        private var accountId: JsonField<String> = JsonMissing.of()
        private var accountNumber: JsonField<String> = JsonMissing.of()
        private var addendum: JsonField<String> = JsonMissing.of()
        private var amount: JsonField<Long> = JsonMissing.of()
        private var currency: JsonField<Currency> = JsonMissing.of()
        private var approval: JsonField<Approval> = JsonMissing.of()
        private var cancellation: JsonField<Cancellation> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var externalAccountId: JsonField<String> = JsonMissing.of()
        private var id: JsonField<String> = JsonMissing.of()
        private var network: JsonField<Network> = JsonMissing.of()
        private var notificationOfChange: JsonField<NotificationOfChange> = JsonMissing.of()
        private var return_: JsonField<Return> = JsonMissing.of()
        private var routingNumber: JsonField<String> = JsonMissing.of()
        private var statementDescriptor: JsonField<String> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var submission: JsonField<Submission> = JsonMissing.of()
        private var templateId: JsonField<String> = JsonMissing.of()
        private var transactionId: JsonField<String> = JsonMissing.of()
        private var companyDescriptiveDate: JsonField<String> = JsonMissing.of()
        private var companyDiscretionaryData: JsonField<String> = JsonMissing.of()
        private var companyEntryDescription: JsonField<String> = JsonMissing.of()
        private var companyName: JsonField<String> = JsonMissing.of()
        private var funding: JsonField<Funding> = JsonMissing.of()
        private var individualId: JsonField<String> = JsonMissing.of()
        private var individualName: JsonField<String> = JsonMissing.of()
        private var effectiveDate: JsonField<LocalDate> = JsonMissing.of()
        private var standardEntryClassCode: JsonField<StandardEntryClassCode> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(achTransfer: AchTransfer) = apply {
            this.accountId = achTransfer.accountId
            this.accountNumber = achTransfer.accountNumber
            this.addendum = achTransfer.addendum
            this.amount = achTransfer.amount
            this.currency = achTransfer.currency
            this.approval = achTransfer.approval
            this.cancellation = achTransfer.cancellation
            this.createdAt = achTransfer.createdAt
            this.externalAccountId = achTransfer.externalAccountId
            this.id = achTransfer.id
            this.network = achTransfer.network
            this.notificationOfChange = achTransfer.notificationOfChange
            this.return_ = achTransfer.return_
            this.routingNumber = achTransfer.routingNumber
            this.statementDescriptor = achTransfer.statementDescriptor
            this.status = achTransfer.status
            this.submission = achTransfer.submission
            this.templateId = achTransfer.templateId
            this.transactionId = achTransfer.transactionId
            this.companyDescriptiveDate = achTransfer.companyDescriptiveDate
            this.companyDiscretionaryData = achTransfer.companyDiscretionaryData
            this.companyEntryDescription = achTransfer.companyEntryDescription
            this.companyName = achTransfer.companyName
            this.funding = achTransfer.funding
            this.individualId = achTransfer.individualId
            this.individualName = achTransfer.individualName
            this.effectiveDate = achTransfer.effectiveDate
            this.standardEntryClassCode = achTransfer.standardEntryClassCode
            this.type = achTransfer.type
            additionalProperties(achTransfer.additionalProperties)
        }

        /** The Account to which the transfer belongs. */
        fun accountId(accountId: String) = accountId(JsonField.of(accountId))

        /** The Account to which the transfer belongs. */
        @JsonProperty("account_id")
        @ExcludeMissing
        fun accountId(accountId: JsonField<String>) = apply {
            this.accountId = accountId
        }

        /** The destination account number. */
        fun accountNumber(accountNumber: String) = accountNumber(JsonField.of(accountNumber))

        /** The destination account number. */
        @JsonProperty("account_number")
        @ExcludeMissing
        fun accountNumber(accountNumber: JsonField<String>) = apply {
            this.accountNumber = accountNumber
        }

        /** Additional information that will be sent to the recipient. */
        fun addendum(addendum: String) = addendum(JsonField.of(addendum))

        /** Additional information that will be sent to the recipient. */
        @JsonProperty("addendum")
        @ExcludeMissing
        fun addendum(addendum: JsonField<String>) = apply {
            this.addendum = addendum
        }

        /**
         * The transfer amount in USD cents. A positive amount indicates a credit transfer
         * pushing funds to the receiving account. A negative amount indicates a debit
         * transfer pulling funds from the receiving account.
         */
        fun amount(amount: Long) = amount(JsonField.of(amount))

        /**
         * The transfer amount in USD cents. A positive amount indicates a credit transfer
         * pushing funds to the receiving account. A negative amount indicates a debit
         * transfer pulling funds from the receiving account.
         */
        @JsonProperty("amount")
        @ExcludeMissing
        fun amount(amount: JsonField<Long>) = apply {
            this.amount = amount
        }

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transfer's
         * currency. For ACH transfers this is always equal to `usd`.
         */
        fun currency(currency: Currency) = currency(JsonField.of(currency))

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transfer's
         * currency. For ACH transfers this is always equal to `usd`.
         */
        @JsonProperty("currency")
        @ExcludeMissing
        fun currency(currency: JsonField<Currency>) = apply {
            this.currency = currency
        }

        /**
         * If your account requires approvals for transfers and the transfer was approved,
         * this will contain details of the approval.
         */
        fun approval(approval: Approval) = approval(JsonField.of(approval))

        /**
         * If your account requires approvals for transfers and the transfer was approved,
         * this will contain details of the approval.
         */
        @JsonProperty("approval")
        @ExcludeMissing
        fun approval(approval: JsonField<Approval>) = apply {
            this.approval = approval
        }

        /**
         * If your account requires approvals for transfers and the transfer was not
         * approved, this will contain details of the cancellation.
         */
        fun cancellation(cancellation: Cancellation) = cancellation(JsonField.of(cancellation))

        /**
         * If your account requires approvals for transfers and the transfer was not
         * approved, this will contain details of the cancellation.
         */
        @JsonProperty("cancellation")
        @ExcludeMissing
        fun cancellation(cancellation: JsonField<Cancellation>) = apply {
            this.cancellation = cancellation
        }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which
         * the transfer was created.
         */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which
         * the transfer was created.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
            this.createdAt = createdAt
        }

        /** The identifier of the External Account the transfer was made to, if any. */
        fun externalAccountId(externalAccountId: String) = externalAccountId(JsonField.of(externalAccountId))

        /** The identifier of the External Account the transfer was made to, if any. */
        @JsonProperty("external_account_id")
        @ExcludeMissing
        fun externalAccountId(externalAccountId: JsonField<String>) = apply {
            this.externalAccountId = externalAccountId
        }

        /** The ACH transfer's identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The ACH transfer's identifier. */
        @JsonProperty("id")
        @ExcludeMissing
        fun id(id: JsonField<String>) = apply {
            this.id = id
        }

        /** The transfer's network. */
        fun network(network: Network) = network(JsonField.of(network))

        /** The transfer's network. */
        @JsonProperty("network")
        @ExcludeMissing
        fun network(network: JsonField<Network>) = apply {
            this.network = network
        }

        /**
         * If the receiving bank accepts the transfer but notifies that future transfers
         * should use different details, this will contain those details.
         */
        fun notificationOfChange(notificationOfChange: NotificationOfChange) = notificationOfChange(JsonField.of(notificationOfChange))

        /**
         * If the receiving bank accepts the transfer but notifies that future transfers
         * should use different details, this will contain those details.
         */
        @JsonProperty("notification_of_change")
        @ExcludeMissing
        fun notificationOfChange(notificationOfChange: JsonField<NotificationOfChange>) = apply {
            this.notificationOfChange = notificationOfChange
        }

        /** If your transfer is returned, this will contain details of the return. */
        fun return_(return_: Return) = return_(JsonField.of(return_))

        /** If your transfer is returned, this will contain details of the return. */
        @JsonProperty("return")
        @ExcludeMissing
        fun return_(return_: JsonField<Return>) = apply {
            this.return_ = return_
        }

        /** The American Bankers' Association (ABA) Routing Transit Number (RTN). */
        fun routingNumber(routingNumber: String) = routingNumber(JsonField.of(routingNumber))

        /** The American Bankers' Association (ABA) Routing Transit Number (RTN). */
        @JsonProperty("routing_number")
        @ExcludeMissing
        fun routingNumber(routingNumber: JsonField<String>) = apply {
            this.routingNumber = routingNumber
        }

        /** The descriptor that will show on the recipient's bank statement. */
        fun statementDescriptor(statementDescriptor: String) = statementDescriptor(JsonField.of(statementDescriptor))

        /** The descriptor that will show on the recipient's bank statement. */
        @JsonProperty("statement_descriptor")
        @ExcludeMissing
        fun statementDescriptor(statementDescriptor: JsonField<String>) = apply {
            this.statementDescriptor = statementDescriptor
        }

        /** The lifecycle status of the transfer. */
        fun status(status: Status) = status(JsonField.of(status))

        /** The lifecycle status of the transfer. */
        @JsonProperty("status")
        @ExcludeMissing
        fun status(status: JsonField<Status>) = apply {
            this.status = status
        }

        /**
         * After the transfer is submitted to FedACH, this will contain supplemental
         * details.
         */
        fun submission(submission: Submission) = submission(JsonField.of(submission))

        /**
         * After the transfer is submitted to FedACH, this will contain supplemental
         * details.
         */
        @JsonProperty("submission")
        @ExcludeMissing
        fun submission(submission: JsonField<Submission>) = apply {
            this.submission = submission
        }

        /** If the transfer was created from a template, this will be the template's ID. */
        fun templateId(templateId: String) = templateId(JsonField.of(templateId))

        /** If the transfer was created from a template, this will be the template's ID. */
        @JsonProperty("template_id")
        @ExcludeMissing
        fun templateId(templateId: JsonField<String>) = apply {
            this.templateId = templateId
        }

        /** The ID for the transaction funding the transfer. */
        fun transactionId(transactionId: String) = transactionId(JsonField.of(transactionId))

        /** The ID for the transaction funding the transfer. */
        @JsonProperty("transaction_id")
        @ExcludeMissing
        fun transactionId(transactionId: JsonField<String>) = apply {
            this.transactionId = transactionId
        }

        /** The description of the date of the transfer. */
        fun companyDescriptiveDate(companyDescriptiveDate: String) = companyDescriptiveDate(JsonField.of(companyDescriptiveDate))

        /** The description of the date of the transfer. */
        @JsonProperty("company_descriptive_date")
        @ExcludeMissing
        fun companyDescriptiveDate(companyDescriptiveDate: JsonField<String>) = apply {
            this.companyDescriptiveDate = companyDescriptiveDate
        }

        /** The data you chose to associate with the transfer. */
        fun companyDiscretionaryData(companyDiscretionaryData: String) = companyDiscretionaryData(JsonField.of(companyDiscretionaryData))

        /** The data you chose to associate with the transfer. */
        @JsonProperty("company_discretionary_data")
        @ExcludeMissing
        fun companyDiscretionaryData(companyDiscretionaryData: JsonField<String>) = apply {
            this.companyDiscretionaryData = companyDiscretionaryData
        }

        /** The description of the transfer you set to be shown to the recipient. */
        fun companyEntryDescription(companyEntryDescription: String) = companyEntryDescription(JsonField.of(companyEntryDescription))

        /** The description of the transfer you set to be shown to the recipient. */
        @JsonProperty("company_entry_description")
        @ExcludeMissing
        fun companyEntryDescription(companyEntryDescription: JsonField<String>) = apply {
            this.companyEntryDescription = companyEntryDescription
        }

        /** The name by which the recipient knows you. */
        fun companyName(companyName: String) = companyName(JsonField.of(companyName))

        /** The name by which the recipient knows you. */
        @JsonProperty("company_name")
        @ExcludeMissing
        fun companyName(companyName: JsonField<String>) = apply {
            this.companyName = companyName
        }

        /** The type of the account to which the transfer will be sent. */
        fun funding(funding: Funding) = funding(JsonField.of(funding))

        /** The type of the account to which the transfer will be sent. */
        @JsonProperty("funding")
        @ExcludeMissing
        fun funding(funding: JsonField<Funding>) = apply {
            this.funding = funding
        }

        /** Your identifer for the transfer recipient. */
        fun individualId(individualId: String) = individualId(JsonField.of(individualId))

        /** Your identifer for the transfer recipient. */
        @JsonProperty("individual_id")
        @ExcludeMissing
        fun individualId(individualId: JsonField<String>) = apply {
            this.individualId = individualId
        }

        /**
         * The name of the transfer recipient. This value is information and not verified
         * by the recipient's bank.
         */
        fun individualName(individualName: String) = individualName(JsonField.of(individualName))

        /**
         * The name of the transfer recipient. This value is information and not verified
         * by the recipient's bank.
         */
        @JsonProperty("individual_name")
        @ExcludeMissing
        fun individualName(individualName: JsonField<String>) = apply {
            this.individualName = individualName
        }

        /**
         * The transfer effective date in
         * [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format.
         */
        fun effectiveDate(effectiveDate: LocalDate) = effectiveDate(JsonField.of(effectiveDate))

        /**
         * The transfer effective date in
         * [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format.
         */
        @JsonProperty("effective_date")
        @ExcludeMissing
        fun effectiveDate(effectiveDate: JsonField<LocalDate>) = apply {
            this.effectiveDate = effectiveDate
        }

        /** The Standard Entry Class (SEC) code to use for the transfer. */
        fun standardEntryClassCode(standardEntryClassCode: StandardEntryClassCode) = standardEntryClassCode(JsonField.of(standardEntryClassCode))

        /** The Standard Entry Class (SEC) code to use for the transfer. */
        @JsonProperty("standard_entry_class_code")
        @ExcludeMissing
        fun standardEntryClassCode(standardEntryClassCode: JsonField<StandardEntryClassCode>) = apply {
            this.standardEntryClassCode = standardEntryClassCode
        }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `ach_transfer`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * A constant representing the object's type. For this resource it will always be
         * `ach_transfer`.
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

        fun build(): AchTransfer = AchTransfer(
            accountId,
            accountNumber,
            addendum,
            amount,
            currency,
            approval,
            cancellation,
            createdAt,
            externalAccountId,
            id,
            network,
            notificationOfChange,
            return_,
            routingNumber,
            statementDescriptor,
            status,
            submission,
            templateId,
            transactionId,
            companyDescriptiveDate,
            companyDiscretionaryData,
            companyEntryDescription,
            companyName,
            funding,
            individualId,
            individualName,
            effectiveDate,
            standardEntryClassCode,
            type,
            additionalProperties.toUnmodifiable(),
        )
    }

    class Currency @JsonCreator private constructor(private val value: JsonField<String>,) {

        @com.fasterxml.jackson.annotation.JsonValue
        fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is Currency &&
              this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val CAD = Currency(JsonField.of("CAD"))

            @JvmField val CHF = Currency(JsonField.of("CHF"))

            @JvmField val EUR = Currency(JsonField.of("EUR"))

            @JvmField val GBP = Currency(JsonField.of("GBP"))

            @JvmField val JPY = Currency(JsonField.of("JPY"))

            @JvmField val USD = Currency(JsonField.of("USD"))

            @JvmStatic fun of(value: String) = Currency(JsonField.of(value))
        }

        enum class Known {
            CAD,
            CHF,
            EUR,
            GBP,
            JPY,
            USD,
        }

        enum class Value {
            CAD,
            CHF,
            EUR,
            GBP,
            JPY,
            USD,
            _UNKNOWN,
        }

        fun value(): Value = when (this) {
            CAD -> Value.CAD
            CHF -> Value.CHF
            EUR -> Value.EUR
            GBP -> Value.GBP
            JPY -> Value.JPY
            USD -> Value.USD
            else -> Value._UNKNOWN
        }

        fun known(): Known = when (this) {
            CAD -> Known.CAD
            CHF -> Known.CHF
            EUR -> Known.EUR
            GBP -> Known.GBP
            JPY -> Known.JPY
            USD -> Known.USD
            else -> throw IncreaseInvalidDataException("Unknown Currency: $value")
        }

        fun asString(): String = _value().asStringOrThrow()
    }

    /**
     * If your account requires approvals for transfers and the transfer was approved,
     * this will contain details of the approval.
     */
    @JsonDeserialize(builder = Approval.Builder::class)
    @NoAutoDetect
    class Approval private constructor(private val approvedAt: JsonField<OffsetDateTime>,private val additionalProperties: Map<String, JsonValue>,) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which
         * the transfer was approved.
         */
        fun approvedAt(): OffsetDateTime = approvedAt.getRequired("approved_at")

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which
         * the transfer was approved.
         */
        @JsonProperty("approved_at")
        @ExcludeMissing
        fun _approvedAt() = approvedAt

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate() = apply {
            if (!validated) {
              approvedAt()
              validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is Approval &&
              this.approvedAt == other.approvedAt &&
              this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
          if (hashCode == 0) {
            hashCode = Objects.hash(approvedAt, additionalProperties)
          }
          return hashCode
        }

        override fun toString() = "Approval{approvedAt=$approvedAt, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic
            fun builder() = Builder()
        }

        class Builder {

            private var approvedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(approval: Approval) = apply {
                this.approvedAt = approval.approvedAt
                additionalProperties(approval.additionalProperties)
            }

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which
             * the transfer was approved.
             */
            fun approvedAt(approvedAt: OffsetDateTime) = approvedAt(JsonField.of(approvedAt))

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which
             * the transfer was approved.
             */
            @JsonProperty("approved_at")
            @ExcludeMissing
            fun approvedAt(approvedAt: JsonField<OffsetDateTime>) = apply {
                this.approvedAt = approvedAt
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

            fun build(): Approval = Approval(approvedAt, additionalProperties.toUnmodifiable())
        }
    }

    /**
     * If your account requires approvals for transfers and the transfer was not
     * approved, this will contain details of the cancellation.
     */
    @JsonDeserialize(builder = Cancellation.Builder::class)
    @NoAutoDetect
    class Cancellation private constructor(private val canceledAt: JsonField<OffsetDateTime>,private val additionalProperties: Map<String, JsonValue>,) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which
         * the Transfer was canceled.
         */
        fun canceledAt(): OffsetDateTime = canceledAt.getRequired("canceled_at")

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which
         * the Transfer was canceled.
         */
        @JsonProperty("canceled_at")
        @ExcludeMissing
        fun _canceledAt() = canceledAt

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate() = apply {
            if (!validated) {
              canceledAt()
              validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is Cancellation &&
              this.canceledAt == other.canceledAt &&
              this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
          if (hashCode == 0) {
            hashCode = Objects.hash(canceledAt, additionalProperties)
          }
          return hashCode
        }

        override fun toString() = "Cancellation{canceledAt=$canceledAt, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic
            fun builder() = Builder()
        }

        class Builder {

            private var canceledAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(cancellation: Cancellation) = apply {
                this.canceledAt = cancellation.canceledAt
                additionalProperties(cancellation.additionalProperties)
            }

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which
             * the Transfer was canceled.
             */
            fun canceledAt(canceledAt: OffsetDateTime) = canceledAt(JsonField.of(canceledAt))

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which
             * the Transfer was canceled.
             */
            @JsonProperty("canceled_at")
            @ExcludeMissing
            fun canceledAt(canceledAt: JsonField<OffsetDateTime>) = apply {
                this.canceledAt = canceledAt
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

            fun build(): Cancellation = Cancellation(canceledAt, additionalProperties.toUnmodifiable())
        }
    }

    class Network @JsonCreator private constructor(private val value: JsonField<String>,) {

        @com.fasterxml.jackson.annotation.JsonValue
        fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is Network &&
              this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val ACH = Network(JsonField.of("ach"))

            @JvmStatic fun of(value: String) = Network(JsonField.of(value))
        }

        enum class Known {
            ACH,
        }

        enum class Value {
            ACH,
            _UNKNOWN,
        }

        fun value(): Value = when (this) {
            ACH -> Value.ACH
            else -> Value._UNKNOWN
        }

        fun known(): Known = when (this) {
            ACH -> Known.ACH
            else -> throw IncreaseInvalidDataException("Unknown Network: $value")
        }

        fun asString(): String = _value().asStringOrThrow()
    }

    /**
     * If the receiving bank accepts the transfer but notifies that future transfers
     * should use different details, this will contain those details.
     */
    @JsonDeserialize(builder = NotificationOfChange.Builder::class)
    @NoAutoDetect
    class NotificationOfChange private constructor(private val createdAt: JsonField<OffsetDateTime>,private val changeCode: JsonField<String>,private val correctedData: JsonField<String>,private val additionalProperties: Map<String, JsonValue>,) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which
         * the notification occurred.
         */
        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        /** The type of change that occurred. */
        fun changeCode(): String = changeCode.getRequired("change_code")

        /** The corrected data. */
        fun correctedData(): String = correctedData.getRequired("corrected_data")

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which
         * the notification occurred.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt() = createdAt

        /** The type of change that occurred. */
        @JsonProperty("change_code")
        @ExcludeMissing
        fun _changeCode() = changeCode

        /** The corrected data. */
        @JsonProperty("corrected_data")
        @ExcludeMissing
        fun _correctedData() = correctedData

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate() = apply {
            if (!validated) {
              createdAt()
              changeCode()
              correctedData()
              validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is NotificationOfChange &&
              this.createdAt == other.createdAt &&
              this.changeCode == other.changeCode &&
              this.correctedData == other.correctedData &&
              this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
          if (hashCode == 0) {
            hashCode = Objects.hash(
                createdAt,
                changeCode,
                correctedData,
                additionalProperties,
            )
          }
          return hashCode
        }

        override fun toString() = "NotificationOfChange{createdAt=$createdAt, changeCode=$changeCode, correctedData=$correctedData, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic
            fun builder() = Builder()
        }

        class Builder {

            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var changeCode: JsonField<String> = JsonMissing.of()
            private var correctedData: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(notificationOfChange: NotificationOfChange) = apply {
                this.createdAt = notificationOfChange.createdAt
                this.changeCode = notificationOfChange.changeCode
                this.correctedData = notificationOfChange.correctedData
                additionalProperties(notificationOfChange.additionalProperties)
            }

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which
             * the notification occurred.
             */
            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which
             * the notification occurred.
             */
            @JsonProperty("created_at")
            @ExcludeMissing
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            /** The type of change that occurred. */
            fun changeCode(changeCode: String) = changeCode(JsonField.of(changeCode))

            /** The type of change that occurred. */
            @JsonProperty("change_code")
            @ExcludeMissing
            fun changeCode(changeCode: JsonField<String>) = apply {
                this.changeCode = changeCode
            }

            /** The corrected data. */
            fun correctedData(correctedData: String) = correctedData(JsonField.of(correctedData))

            /** The corrected data. */
            @JsonProperty("corrected_data")
            @ExcludeMissing
            fun correctedData(correctedData: JsonField<String>) = apply {
                this.correctedData = correctedData
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
                createdAt,
                changeCode,
                correctedData,
                additionalProperties.toUnmodifiable(),
            )
        }
    }

    /** If your transfer is returned, this will contain details of the return. */
    @JsonDeserialize(builder = Return.Builder::class)
    @NoAutoDetect
    class Return private constructor(private val createdAt: JsonField<OffsetDateTime>,private val returnReasonCode: JsonField<ReturnReasonCode>,private val transferId: JsonField<String>,private val transactionId: JsonField<String>,private val additionalProperties: Map<String, JsonValue>,) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which
         * the transfer was created.
         */
        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        /** Why the ACH Transfer was returned. */
        fun returnReasonCode(): ReturnReasonCode = returnReasonCode.getRequired("return_reason_code")

        /** The identifier of the ACH Transfer associated with this return. */
        fun transferId(): String = transferId.getRequired("transfer_id")

        /** The identifier of the Tranasaction associated with this return. */
        fun transactionId(): String = transactionId.getRequired("transaction_id")

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which
         * the transfer was created.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt() = createdAt

        /** Why the ACH Transfer was returned. */
        @JsonProperty("return_reason_code")
        @ExcludeMissing
        fun _returnReasonCode() = returnReasonCode

        /** The identifier of the ACH Transfer associated with this return. */
        @JsonProperty("transfer_id")
        @ExcludeMissing
        fun _transferId() = transferId

        /** The identifier of the Tranasaction associated with this return. */
        @JsonProperty("transaction_id")
        @ExcludeMissing
        fun _transactionId() = transactionId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate() = apply {
            if (!validated) {
              createdAt()
              returnReasonCode()
              transferId()
              transactionId()
              validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is Return &&
              this.createdAt == other.createdAt &&
              this.returnReasonCode == other.returnReasonCode &&
              this.transferId == other.transferId &&
              this.transactionId == other.transactionId &&
              this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
          if (hashCode == 0) {
            hashCode = Objects.hash(
                createdAt,
                returnReasonCode,
                transferId,
                transactionId,
                additionalProperties,
            )
          }
          return hashCode
        }

        override fun toString() = "Return{createdAt=$createdAt, returnReasonCode=$returnReasonCode, transferId=$transferId, transactionId=$transactionId, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic
            fun builder() = Builder()
        }

        class Builder {

            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var returnReasonCode: JsonField<ReturnReasonCode> = JsonMissing.of()
            private var transferId: JsonField<String> = JsonMissing.of()
            private var transactionId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(return_: Return) = apply {
                this.createdAt = return_.createdAt
                this.returnReasonCode = return_.returnReasonCode
                this.transferId = return_.transferId
                this.transactionId = return_.transactionId
                additionalProperties(return_.additionalProperties)
            }

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which
             * the transfer was created.
             */
            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which
             * the transfer was created.
             */
            @JsonProperty("created_at")
            @ExcludeMissing
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            /** Why the ACH Transfer was returned. */
            fun returnReasonCode(returnReasonCode: ReturnReasonCode) = returnReasonCode(JsonField.of(returnReasonCode))

            /** Why the ACH Transfer was returned. */
            @JsonProperty("return_reason_code")
            @ExcludeMissing
            fun returnReasonCode(returnReasonCode: JsonField<ReturnReasonCode>) = apply {
                this.returnReasonCode = returnReasonCode
            }

            /** The identifier of the ACH Transfer associated with this return. */
            fun transferId(transferId: String) = transferId(JsonField.of(transferId))

            /** The identifier of the ACH Transfer associated with this return. */
            @JsonProperty("transfer_id")
            @ExcludeMissing
            fun transferId(transferId: JsonField<String>) = apply {
                this.transferId = transferId
            }

            /** The identifier of the Tranasaction associated with this return. */
            fun transactionId(transactionId: String) = transactionId(JsonField.of(transactionId))

            /** The identifier of the Tranasaction associated with this return. */
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

            fun build(): Return = Return(
                createdAt,
                returnReasonCode,
                transferId,
                transactionId,
                additionalProperties.toUnmodifiable(),
            )
        }

        class ReturnReasonCode @JsonCreator private constructor(private val value: JsonField<String>,) {

            @com.fasterxml.jackson.annotation.JsonValue
            fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
              if (this === other) {
                  return true
              }

              return other is ReturnReasonCode &&
                  this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val INSUFFICIENT_FUND = ReturnReasonCode(JsonField.of("insufficient_fund"))

                @JvmField val NO_ACCOUNT = ReturnReasonCode(JsonField.of("no_account"))

                @JvmField val ACCOUNT_CLOSED = ReturnReasonCode(JsonField.of("account_closed"))

                @JvmField val INVALID_ACCOUNT_NUMBER_STRUCTURE = ReturnReasonCode(JsonField.of("invalid_account_number_structure"))

                @JvmField val ACCOUNT_FROZEN_ENTRY_RETURNED_PER_OFAC_INSTRUCTION = ReturnReasonCode(JsonField.of("account_frozen_entry_returned_per_ofac_instruction"))

                @JvmField val CREDIT_ENTRY_REFUSED_BY_RECEIVER = ReturnReasonCode(JsonField.of("credit_entry_refused_by_receiver"))

                @JvmField val UNAUTHORIZED_DEBIT_TO_CONSUMER_ACCOUNT_USING_CORPORATE_SEC_CODE = ReturnReasonCode(JsonField.of("unauthorized_debit_to_consumer_account_using_corporate_sec_code"))

                @JvmField val CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED = ReturnReasonCode(JsonField.of("corporate_customer_advised_not_authorized"))

                @JvmField val PAYMENT_STOPPED = ReturnReasonCode(JsonField.of("payment_stopped"))

                @JvmField val NON_TRANSACTION_ACCOUNT = ReturnReasonCode(JsonField.of("non_transaction_account"))

                @JvmField val UNCOLLECTED_FUNDS = ReturnReasonCode(JsonField.of("uncollected_funds"))

                @JvmField val ROUTING_NUMBER_CHECK_DIGIT_ERROR = ReturnReasonCode(JsonField.of("routing_number_check_digit_error"))

                @JvmField val CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE = ReturnReasonCode(JsonField.of("customer_advised_unauthorized_improper_ineligible_or_incomplete"))

                @JvmField val AMOUNT_FIELD_ERROR = ReturnReasonCode(JsonField.of("amount_field_error"))

                @JvmField val AUTHORIZATION_REVOKED_BY_CUSTOMER = ReturnReasonCode(JsonField.of("authorization_revoked_by_customer"))

                @JvmField val INVALID_ACH_ROUTING_NUMBER = ReturnReasonCode(JsonField.of("invalid_ach_routing_number"))

                @JvmField val FILE_RECORD_EDIT_CRITERIA = ReturnReasonCode(JsonField.of("file_record_edit_criteria"))

                @JvmField val ENR_INVALID_INDIVIDUAL_NAME = ReturnReasonCode(JsonField.of("enr_invalid_individual_name"))

                @JvmField val RETURNED_PER_ODFI_REQUEST = ReturnReasonCode(JsonField.of("returned_per_odfi_request"))

                @JvmField val ADDENDA_ERROR = ReturnReasonCode(JsonField.of("addenda_error"))

                @JvmField val LIMITED_PARTICIPATION_DFI = ReturnReasonCode(JsonField.of("limited_participation_dfi"))

                @JvmField val INCORRECTLY_CODED_OUTBOUND_INTERNATIONAL_PAYMENT = ReturnReasonCode(JsonField.of("incorrectly_coded_outbound_international_payment"))

                @JvmField val OTHER = ReturnReasonCode(JsonField.of("other"))

                @JvmStatic fun of(value: String) = ReturnReasonCode(JsonField.of(value))
            }

            enum class Known {
                INSUFFICIENT_FUND,
                NO_ACCOUNT,
                ACCOUNT_CLOSED,
                INVALID_ACCOUNT_NUMBER_STRUCTURE,
                ACCOUNT_FROZEN_ENTRY_RETURNED_PER_OFAC_INSTRUCTION,
                CREDIT_ENTRY_REFUSED_BY_RECEIVER,
                UNAUTHORIZED_DEBIT_TO_CONSUMER_ACCOUNT_USING_CORPORATE_SEC_CODE,
                CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED,
                PAYMENT_STOPPED,
                NON_TRANSACTION_ACCOUNT,
                UNCOLLECTED_FUNDS,
                ROUTING_NUMBER_CHECK_DIGIT_ERROR,
                CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE,
                AMOUNT_FIELD_ERROR,
                AUTHORIZATION_REVOKED_BY_CUSTOMER,
                INVALID_ACH_ROUTING_NUMBER,
                FILE_RECORD_EDIT_CRITERIA,
                ENR_INVALID_INDIVIDUAL_NAME,
                RETURNED_PER_ODFI_REQUEST,
                ADDENDA_ERROR,
                LIMITED_PARTICIPATION_DFI,
                INCORRECTLY_CODED_OUTBOUND_INTERNATIONAL_PAYMENT,
                OTHER,
            }

            enum class Value {
                INSUFFICIENT_FUND,
                NO_ACCOUNT,
                ACCOUNT_CLOSED,
                INVALID_ACCOUNT_NUMBER_STRUCTURE,
                ACCOUNT_FROZEN_ENTRY_RETURNED_PER_OFAC_INSTRUCTION,
                CREDIT_ENTRY_REFUSED_BY_RECEIVER,
                UNAUTHORIZED_DEBIT_TO_CONSUMER_ACCOUNT_USING_CORPORATE_SEC_CODE,
                CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED,
                PAYMENT_STOPPED,
                NON_TRANSACTION_ACCOUNT,
                UNCOLLECTED_FUNDS,
                ROUTING_NUMBER_CHECK_DIGIT_ERROR,
                CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE,
                AMOUNT_FIELD_ERROR,
                AUTHORIZATION_REVOKED_BY_CUSTOMER,
                INVALID_ACH_ROUTING_NUMBER,
                FILE_RECORD_EDIT_CRITERIA,
                ENR_INVALID_INDIVIDUAL_NAME,
                RETURNED_PER_ODFI_REQUEST,
                ADDENDA_ERROR,
                LIMITED_PARTICIPATION_DFI,
                INCORRECTLY_CODED_OUTBOUND_INTERNATIONAL_PAYMENT,
                OTHER,
                _UNKNOWN,
            }

            fun value(): Value = when (this) {
                INSUFFICIENT_FUND -> Value.INSUFFICIENT_FUND
                NO_ACCOUNT -> Value.NO_ACCOUNT
                ACCOUNT_CLOSED -> Value.ACCOUNT_CLOSED
                INVALID_ACCOUNT_NUMBER_STRUCTURE -> Value.INVALID_ACCOUNT_NUMBER_STRUCTURE
                ACCOUNT_FROZEN_ENTRY_RETURNED_PER_OFAC_INSTRUCTION -> Value.ACCOUNT_FROZEN_ENTRY_RETURNED_PER_OFAC_INSTRUCTION
                CREDIT_ENTRY_REFUSED_BY_RECEIVER -> Value.CREDIT_ENTRY_REFUSED_BY_RECEIVER
                UNAUTHORIZED_DEBIT_TO_CONSUMER_ACCOUNT_USING_CORPORATE_SEC_CODE -> Value.UNAUTHORIZED_DEBIT_TO_CONSUMER_ACCOUNT_USING_CORPORATE_SEC_CODE
                CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED -> Value.CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED
                PAYMENT_STOPPED -> Value.PAYMENT_STOPPED
                NON_TRANSACTION_ACCOUNT -> Value.NON_TRANSACTION_ACCOUNT
                UNCOLLECTED_FUNDS -> Value.UNCOLLECTED_FUNDS
                ROUTING_NUMBER_CHECK_DIGIT_ERROR -> Value.ROUTING_NUMBER_CHECK_DIGIT_ERROR
                CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE -> Value.CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE
                AMOUNT_FIELD_ERROR -> Value.AMOUNT_FIELD_ERROR
                AUTHORIZATION_REVOKED_BY_CUSTOMER -> Value.AUTHORIZATION_REVOKED_BY_CUSTOMER
                INVALID_ACH_ROUTING_NUMBER -> Value.INVALID_ACH_ROUTING_NUMBER
                FILE_RECORD_EDIT_CRITERIA -> Value.FILE_RECORD_EDIT_CRITERIA
                ENR_INVALID_INDIVIDUAL_NAME -> Value.ENR_INVALID_INDIVIDUAL_NAME
                RETURNED_PER_ODFI_REQUEST -> Value.RETURNED_PER_ODFI_REQUEST
                ADDENDA_ERROR -> Value.ADDENDA_ERROR
                LIMITED_PARTICIPATION_DFI -> Value.LIMITED_PARTICIPATION_DFI
                INCORRECTLY_CODED_OUTBOUND_INTERNATIONAL_PAYMENT -> Value.INCORRECTLY_CODED_OUTBOUND_INTERNATIONAL_PAYMENT
                OTHER -> Value.OTHER
                else -> Value._UNKNOWN
            }

            fun known(): Known = when (this) {
                INSUFFICIENT_FUND -> Known.INSUFFICIENT_FUND
                NO_ACCOUNT -> Known.NO_ACCOUNT
                ACCOUNT_CLOSED -> Known.ACCOUNT_CLOSED
                INVALID_ACCOUNT_NUMBER_STRUCTURE -> Known.INVALID_ACCOUNT_NUMBER_STRUCTURE
                ACCOUNT_FROZEN_ENTRY_RETURNED_PER_OFAC_INSTRUCTION -> Known.ACCOUNT_FROZEN_ENTRY_RETURNED_PER_OFAC_INSTRUCTION
                CREDIT_ENTRY_REFUSED_BY_RECEIVER -> Known.CREDIT_ENTRY_REFUSED_BY_RECEIVER
                UNAUTHORIZED_DEBIT_TO_CONSUMER_ACCOUNT_USING_CORPORATE_SEC_CODE -> Known.UNAUTHORIZED_DEBIT_TO_CONSUMER_ACCOUNT_USING_CORPORATE_SEC_CODE
                CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED -> Known.CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED
                PAYMENT_STOPPED -> Known.PAYMENT_STOPPED
                NON_TRANSACTION_ACCOUNT -> Known.NON_TRANSACTION_ACCOUNT
                UNCOLLECTED_FUNDS -> Known.UNCOLLECTED_FUNDS
                ROUTING_NUMBER_CHECK_DIGIT_ERROR -> Known.ROUTING_NUMBER_CHECK_DIGIT_ERROR
                CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE -> Known.CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE
                AMOUNT_FIELD_ERROR -> Known.AMOUNT_FIELD_ERROR
                AUTHORIZATION_REVOKED_BY_CUSTOMER -> Known.AUTHORIZATION_REVOKED_BY_CUSTOMER
                INVALID_ACH_ROUTING_NUMBER -> Known.INVALID_ACH_ROUTING_NUMBER
                FILE_RECORD_EDIT_CRITERIA -> Known.FILE_RECORD_EDIT_CRITERIA
                ENR_INVALID_INDIVIDUAL_NAME -> Known.ENR_INVALID_INDIVIDUAL_NAME
                RETURNED_PER_ODFI_REQUEST -> Known.RETURNED_PER_ODFI_REQUEST
                ADDENDA_ERROR -> Known.ADDENDA_ERROR
                LIMITED_PARTICIPATION_DFI -> Known.LIMITED_PARTICIPATION_DFI
                INCORRECTLY_CODED_OUTBOUND_INTERNATIONAL_PAYMENT -> Known.INCORRECTLY_CODED_OUTBOUND_INTERNATIONAL_PAYMENT
                OTHER -> Known.OTHER
                else -> throw IncreaseInvalidDataException("Unknown ReturnReasonCode: $value")
            }

            fun asString(): String = _value().asStringOrThrow()
        }
    }

    class Status @JsonCreator private constructor(private val value: JsonField<String>,) {

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

            @JvmField val PENDING_APPROVAL = Status(JsonField.of("pending_approval"))

            @JvmField val CANCELED = Status(JsonField.of("canceled"))

            @JvmField val PENDING_SUBMISSION = Status(JsonField.of("pending_submission"))

            @JvmField val SUBMITTED = Status(JsonField.of("submitted"))

            @JvmField val RETURNED = Status(JsonField.of("returned"))

            @JvmField val REQUIRES_ATTENTION = Status(JsonField.of("requires_attention"))

            @JvmField val REJECTED = Status(JsonField.of("rejected"))

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            PENDING_APPROVAL,
            CANCELED,
            PENDING_SUBMISSION,
            SUBMITTED,
            RETURNED,
            REQUIRES_ATTENTION,
            REJECTED,
        }

        enum class Value {
            PENDING_APPROVAL,
            CANCELED,
            PENDING_SUBMISSION,
            SUBMITTED,
            RETURNED,
            REQUIRES_ATTENTION,
            REJECTED,
            _UNKNOWN,
        }

        fun value(): Value = when (this) {
            PENDING_APPROVAL -> Value.PENDING_APPROVAL
            CANCELED -> Value.CANCELED
            PENDING_SUBMISSION -> Value.PENDING_SUBMISSION
            SUBMITTED -> Value.SUBMITTED
            RETURNED -> Value.RETURNED
            REQUIRES_ATTENTION -> Value.REQUIRES_ATTENTION
            REJECTED -> Value.REJECTED
            else -> Value._UNKNOWN
        }

        fun known(): Known = when (this) {
            PENDING_APPROVAL -> Known.PENDING_APPROVAL
            CANCELED -> Known.CANCELED
            PENDING_SUBMISSION -> Known.PENDING_SUBMISSION
            SUBMITTED -> Known.SUBMITTED
            RETURNED -> Known.RETURNED
            REQUIRES_ATTENTION -> Known.REQUIRES_ATTENTION
            REJECTED -> Known.REJECTED
            else -> throw IncreaseInvalidDataException("Unknown Status: $value")
        }

        fun asString(): String = _value().asStringOrThrow()
    }

    /**
     * After the transfer is submitted to FedACH, this will contain supplemental
     * details.
     */
    @JsonDeserialize(builder = Submission.Builder::class)
    @NoAutoDetect
    class Submission private constructor(private val traceNumber: JsonField<String>,private val submittedAt: JsonField<OffsetDateTime>,private val additionalProperties: Map<String, JsonValue>,) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /** The trace number for the submission. */
        fun traceNumber(): String = traceNumber.getRequired("trace_number")

        /** When the ACH transfer was sent to FedACH. */
        fun submittedAt(): OffsetDateTime = submittedAt.getRequired("submitted_at")

        /** The trace number for the submission. */
        @JsonProperty("trace_number")
        @ExcludeMissing
        fun _traceNumber() = traceNumber

        /** When the ACH transfer was sent to FedACH. */
        @JsonProperty("submitted_at")
        @ExcludeMissing
        fun _submittedAt() = submittedAt

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate() = apply {
            if (!validated) {
              traceNumber()
              submittedAt()
              validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is Submission &&
              this.traceNumber == other.traceNumber &&
              this.submittedAt == other.submittedAt &&
              this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
          if (hashCode == 0) {
            hashCode = Objects.hash(
                traceNumber,
                submittedAt,
                additionalProperties,
            )
          }
          return hashCode
        }

        override fun toString() = "Submission{traceNumber=$traceNumber, submittedAt=$submittedAt, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic
            fun builder() = Builder()
        }

        class Builder {

            private var traceNumber: JsonField<String> = JsonMissing.of()
            private var submittedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(submission: Submission) = apply {
                this.traceNumber = submission.traceNumber
                this.submittedAt = submission.submittedAt
                additionalProperties(submission.additionalProperties)
            }

            /** The trace number for the submission. */
            fun traceNumber(traceNumber: String) = traceNumber(JsonField.of(traceNumber))

            /** The trace number for the submission. */
            @JsonProperty("trace_number")
            @ExcludeMissing
            fun traceNumber(traceNumber: JsonField<String>) = apply {
                this.traceNumber = traceNumber
            }

            /** When the ACH transfer was sent to FedACH. */
            fun submittedAt(submittedAt: OffsetDateTime) = submittedAt(JsonField.of(submittedAt))

            /** When the ACH transfer was sent to FedACH. */
            @JsonProperty("submitted_at")
            @ExcludeMissing
            fun submittedAt(submittedAt: JsonField<OffsetDateTime>) = apply {
                this.submittedAt = submittedAt
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

            fun build(): Submission = Submission(
                traceNumber,
                submittedAt,
                additionalProperties.toUnmodifiable(),
            )
        }
    }

    class Funding @JsonCreator private constructor(private val value: JsonField<String>,) {

        @com.fasterxml.jackson.annotation.JsonValue
        fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is Funding &&
              this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val CHECKING = Funding(JsonField.of("checking"))

            @JvmField val SAVINGS = Funding(JsonField.of("savings"))

            @JvmStatic fun of(value: String) = Funding(JsonField.of(value))
        }

        enum class Known {
            CHECKING,
            SAVINGS,
        }

        enum class Value {
            CHECKING,
            SAVINGS,
            _UNKNOWN,
        }

        fun value(): Value = when (this) {
            CHECKING -> Value.CHECKING
            SAVINGS -> Value.SAVINGS
            else -> Value._UNKNOWN
        }

        fun known(): Known = when (this) {
            CHECKING -> Known.CHECKING
            SAVINGS -> Known.SAVINGS
            else -> throw IncreaseInvalidDataException("Unknown Funding: $value")
        }

        fun asString(): String = _value().asStringOrThrow()
    }

    class StandardEntryClassCode @JsonCreator private constructor(private val value: JsonField<String>,) {

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

            @JvmField val PREARRANGED_PAYMENTS_AND_DEPOSIT = StandardEntryClassCode(JsonField.of("prearranged_payments_and_deposit"))

            @JvmField val INTERNET_INITIATED = StandardEntryClassCode(JsonField.of("internet_initiated"))

            @JvmStatic fun of(value: String) = StandardEntryClassCode(JsonField.of(value))
        }

        enum class Known {
            CORPORATE_CREDIT_OR_DEBIT,
            PREARRANGED_PAYMENTS_AND_DEPOSIT,
            INTERNET_INITIATED,
        }

        enum class Value {
            CORPORATE_CREDIT_OR_DEBIT,
            PREARRANGED_PAYMENTS_AND_DEPOSIT,
            INTERNET_INITIATED,
            _UNKNOWN,
        }

        fun value(): Value = when (this) {
            CORPORATE_CREDIT_OR_DEBIT -> Value.CORPORATE_CREDIT_OR_DEBIT
            PREARRANGED_PAYMENTS_AND_DEPOSIT -> Value.PREARRANGED_PAYMENTS_AND_DEPOSIT
            INTERNET_INITIATED -> Value.INTERNET_INITIATED
            else -> Value._UNKNOWN
        }

        fun known(): Known = when (this) {
            CORPORATE_CREDIT_OR_DEBIT -> Known.CORPORATE_CREDIT_OR_DEBIT
            PREARRANGED_PAYMENTS_AND_DEPOSIT -> Known.PREARRANGED_PAYMENTS_AND_DEPOSIT
            INTERNET_INITIATED -> Known.INTERNET_INITIATED
            else -> throw IncreaseInvalidDataException("Unknown StandardEntryClassCode: $value")
        }

        fun asString(): String = _value().asStringOrThrow()
    }

    class Type @JsonCreator private constructor(private val value: JsonField<String>,) {

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

            @JvmField val ACH_TRANSFER = Type(JsonField.of("ach_transfer"))

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            ACH_TRANSFER,
        }

        enum class Value {
            ACH_TRANSFER,
            _UNKNOWN,
        }

        fun value(): Value = when (this) {
            ACH_TRANSFER -> Value.ACH_TRANSFER
            else -> Value._UNKNOWN
        }

        fun known(): Known = when (this) {
            ACH_TRANSFER -> Known.ACH_TRANSFER
            else -> throw IncreaseInvalidDataException("Unknown Type: $value")
        }

        fun asString(): String = _value().asStringOrThrow()
    }
}
