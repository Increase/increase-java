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
 * ACH Prenotifications are one way you can verify account and routing numbers by
 * Automated Clearing House (ACH).
 */
@JsonDeserialize(builder = AchPrenotification.Builder::class)
@NoAutoDetect
class AchPrenotification private constructor(private val id: JsonField<String>,private val accountNumber: JsonField<String>,private val addendum: JsonField<String>,private val companyDescriptiveDate: JsonField<String>,private val companyDiscretionaryData: JsonField<String>,private val companyEntryDescription: JsonField<String>,private val companyName: JsonField<String>,private val creditDebitIndicator: JsonField<CreditDebitIndicator>,private val effectiveDate: JsonField<OffsetDateTime>,private val routingNumber: JsonField<String>,private val prenotificationReturn: JsonField<PrenotificationReturn>,private val createdAt: JsonField<OffsetDateTime>,private val status: JsonField<Status>,private val type: JsonField<Type>,private val additionalProperties: Map<String, JsonValue>,) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** The ACH Prenotification's identifier. */
    fun id(): String = id.getRequired("id")

    /** The destination account number. */
    fun accountNumber(): String = accountNumber.getRequired("account_number")

    /** Additional information for the recipient. */
    fun addendum(): Optional<String> = Optional.ofNullable(addendum.getNullable("addendum"))

    /** The description of the date of the notification. */
    fun companyDescriptiveDate(): Optional<String> = Optional.ofNullable(companyDescriptiveDate.getNullable("company_descriptive_date"))

    /** Optional data associated with the notification. */
    fun companyDiscretionaryData(): Optional<String> = Optional.ofNullable(companyDiscretionaryData.getNullable("company_discretionary_data"))

    /** The description of the notification. */
    fun companyEntryDescription(): Optional<String> = Optional.ofNullable(companyEntryDescription.getNullable("company_entry_description"))

    /** The name by which you know the company. */
    fun companyName(): Optional<String> = Optional.ofNullable(companyName.getNullable("company_name"))

    /** If the notification is for a future credit or debit. */
    fun creditDebitIndicator(): Optional<CreditDebitIndicator> = Optional.ofNullable(creditDebitIndicator.getNullable("credit_debit_indicator"))

    /** The effective date in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format. */
    fun effectiveDate(): Optional<OffsetDateTime> = Optional.ofNullable(effectiveDate.getNullable("effective_date"))

    /** The American Bankers' Association (ABA) Routing Transit Number (RTN). */
    fun routingNumber(): String = routingNumber.getRequired("routing_number")

    /** If your prenotification is returned, this will contain details of the return. */
    fun prenotificationReturn(): Optional<PrenotificationReturn> = Optional.ofNullable(prenotificationReturn.getNullable("prenotification_return"))

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which
     * the prenotification was created.
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /** The lifecycle status of the ACH Prenotification. */
    fun status(): Status = status.getRequired("status")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `ach_prenotification`.
     */
    fun type(): Type = type.getRequired("type")

    /** The ACH Prenotification's identifier. */
    @JsonProperty("id")
    @ExcludeMissing
    fun _id() = id

    /** The destination account number. */
    @JsonProperty("account_number")
    @ExcludeMissing
    fun _accountNumber() = accountNumber

    /** Additional information for the recipient. */
    @JsonProperty("addendum")
    @ExcludeMissing
    fun _addendum() = addendum

    /** The description of the date of the notification. */
    @JsonProperty("company_descriptive_date")
    @ExcludeMissing
    fun _companyDescriptiveDate() = companyDescriptiveDate

    /** Optional data associated with the notification. */
    @JsonProperty("company_discretionary_data")
    @ExcludeMissing
    fun _companyDiscretionaryData() = companyDiscretionaryData

    /** The description of the notification. */
    @JsonProperty("company_entry_description")
    @ExcludeMissing
    fun _companyEntryDescription() = companyEntryDescription

    /** The name by which you know the company. */
    @JsonProperty("company_name")
    @ExcludeMissing
    fun _companyName() = companyName

    /** If the notification is for a future credit or debit. */
    @JsonProperty("credit_debit_indicator")
    @ExcludeMissing
    fun _creditDebitIndicator() = creditDebitIndicator

    /** The effective date in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format. */
    @JsonProperty("effective_date")
    @ExcludeMissing
    fun _effectiveDate() = effectiveDate

    /** The American Bankers' Association (ABA) Routing Transit Number (RTN). */
    @JsonProperty("routing_number")
    @ExcludeMissing
    fun _routingNumber() = routingNumber

    /** If your prenotification is returned, this will contain details of the return. */
    @JsonProperty("prenotification_return")
    @ExcludeMissing
    fun _prenotificationReturn() = prenotificationReturn

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which
     * the prenotification was created.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt() = createdAt

    /** The lifecycle status of the ACH Prenotification. */
    @JsonProperty("status")
    @ExcludeMissing
    fun _status() = status

    /**
     * A constant representing the object's type. For this resource it will always be
     * `ach_prenotification`.
     */
    @JsonProperty("type")
    @ExcludeMissing
    fun _type() = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate() = apply {
        if (!validated) {
          id()
          accountNumber()
          addendum()
          companyDescriptiveDate()
          companyDiscretionaryData()
          companyEntryDescription()
          companyName()
          creditDebitIndicator()
          effectiveDate()
          routingNumber()
          prenotificationReturn().map { it.validate() }
          createdAt()
          status()
          type()
          validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return other is AchPrenotification &&
          this.id == other.id &&
          this.accountNumber == other.accountNumber &&
          this.addendum == other.addendum &&
          this.companyDescriptiveDate == other.companyDescriptiveDate &&
          this.companyDiscretionaryData == other.companyDiscretionaryData &&
          this.companyEntryDescription == other.companyEntryDescription &&
          this.companyName == other.companyName &&
          this.creditDebitIndicator == other.creditDebitIndicator &&
          this.effectiveDate == other.effectiveDate &&
          this.routingNumber == other.routingNumber &&
          this.prenotificationReturn == other.prenotificationReturn &&
          this.createdAt == other.createdAt &&
          this.status == other.status &&
          this.type == other.type &&
          this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
      if (hashCode == 0) {
        hashCode = Objects.hash(
            id,
            accountNumber,
            addendum,
            companyDescriptiveDate,
            companyDiscretionaryData,
            companyEntryDescription,
            companyName,
            creditDebitIndicator,
            effectiveDate,
            routingNumber,
            prenotificationReturn,
            createdAt,
            status,
            type,
            additionalProperties,
        )
      }
      return hashCode
    }

    override fun toString() = "AchPrenotification{id=$id, accountNumber=$accountNumber, addendum=$addendum, companyDescriptiveDate=$companyDescriptiveDate, companyDiscretionaryData=$companyDiscretionaryData, companyEntryDescription=$companyEntryDescription, companyName=$companyName, creditDebitIndicator=$creditDebitIndicator, effectiveDate=$effectiveDate, routingNumber=$routingNumber, prenotificationReturn=$prenotificationReturn, createdAt=$createdAt, status=$status, type=$type, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic
        fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var accountNumber: JsonField<String> = JsonMissing.of()
        private var addendum: JsonField<String> = JsonMissing.of()
        private var companyDescriptiveDate: JsonField<String> = JsonMissing.of()
        private var companyDiscretionaryData: JsonField<String> = JsonMissing.of()
        private var companyEntryDescription: JsonField<String> = JsonMissing.of()
        private var companyName: JsonField<String> = JsonMissing.of()
        private var creditDebitIndicator: JsonField<CreditDebitIndicator> = JsonMissing.of()
        private var effectiveDate: JsonField<OffsetDateTime> = JsonMissing.of()
        private var routingNumber: JsonField<String> = JsonMissing.of()
        private var prenotificationReturn: JsonField<PrenotificationReturn> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(achPrenotification: AchPrenotification) = apply {
            this.id = achPrenotification.id
            this.accountNumber = achPrenotification.accountNumber
            this.addendum = achPrenotification.addendum
            this.companyDescriptiveDate = achPrenotification.companyDescriptiveDate
            this.companyDiscretionaryData = achPrenotification.companyDiscretionaryData
            this.companyEntryDescription = achPrenotification.companyEntryDescription
            this.companyName = achPrenotification.companyName
            this.creditDebitIndicator = achPrenotification.creditDebitIndicator
            this.effectiveDate = achPrenotification.effectiveDate
            this.routingNumber = achPrenotification.routingNumber
            this.prenotificationReturn = achPrenotification.prenotificationReturn
            this.createdAt = achPrenotification.createdAt
            this.status = achPrenotification.status
            this.type = achPrenotification.type
            additionalProperties(achPrenotification.additionalProperties)
        }

        /** The ACH Prenotification's identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The ACH Prenotification's identifier. */
        @JsonProperty("id")
        @ExcludeMissing
        fun id(id: JsonField<String>) = apply {
            this.id = id
        }

        /** The destination account number. */
        fun accountNumber(accountNumber: String) = accountNumber(JsonField.of(accountNumber))

        /** The destination account number. */
        @JsonProperty("account_number")
        @ExcludeMissing
        fun accountNumber(accountNumber: JsonField<String>) = apply {
            this.accountNumber = accountNumber
        }

        /** Additional information for the recipient. */
        fun addendum(addendum: String) = addendum(JsonField.of(addendum))

        /** Additional information for the recipient. */
        @JsonProperty("addendum")
        @ExcludeMissing
        fun addendum(addendum: JsonField<String>) = apply {
            this.addendum = addendum
        }

        /** The description of the date of the notification. */
        fun companyDescriptiveDate(companyDescriptiveDate: String) = companyDescriptiveDate(JsonField.of(companyDescriptiveDate))

        /** The description of the date of the notification. */
        @JsonProperty("company_descriptive_date")
        @ExcludeMissing
        fun companyDescriptiveDate(companyDescriptiveDate: JsonField<String>) = apply {
            this.companyDescriptiveDate = companyDescriptiveDate
        }

        /** Optional data associated with the notification. */
        fun companyDiscretionaryData(companyDiscretionaryData: String) = companyDiscretionaryData(JsonField.of(companyDiscretionaryData))

        /** Optional data associated with the notification. */
        @JsonProperty("company_discretionary_data")
        @ExcludeMissing
        fun companyDiscretionaryData(companyDiscretionaryData: JsonField<String>) = apply {
            this.companyDiscretionaryData = companyDiscretionaryData
        }

        /** The description of the notification. */
        fun companyEntryDescription(companyEntryDescription: String) = companyEntryDescription(JsonField.of(companyEntryDescription))

        /** The description of the notification. */
        @JsonProperty("company_entry_description")
        @ExcludeMissing
        fun companyEntryDescription(companyEntryDescription: JsonField<String>) = apply {
            this.companyEntryDescription = companyEntryDescription
        }

        /** The name by which you know the company. */
        fun companyName(companyName: String) = companyName(JsonField.of(companyName))

        /** The name by which you know the company. */
        @JsonProperty("company_name")
        @ExcludeMissing
        fun companyName(companyName: JsonField<String>) = apply {
            this.companyName = companyName
        }

        /** If the notification is for a future credit or debit. */
        fun creditDebitIndicator(creditDebitIndicator: CreditDebitIndicator) = creditDebitIndicator(JsonField.of(creditDebitIndicator))

        /** If the notification is for a future credit or debit. */
        @JsonProperty("credit_debit_indicator")
        @ExcludeMissing
        fun creditDebitIndicator(creditDebitIndicator: JsonField<CreditDebitIndicator>) = apply {
            this.creditDebitIndicator = creditDebitIndicator
        }

        /** The effective date in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format. */
        fun effectiveDate(effectiveDate: OffsetDateTime) = effectiveDate(JsonField.of(effectiveDate))

        /** The effective date in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format. */
        @JsonProperty("effective_date")
        @ExcludeMissing
        fun effectiveDate(effectiveDate: JsonField<OffsetDateTime>) = apply {
            this.effectiveDate = effectiveDate
        }

        /** The American Bankers' Association (ABA) Routing Transit Number (RTN). */
        fun routingNumber(routingNumber: String) = routingNumber(JsonField.of(routingNumber))

        /** The American Bankers' Association (ABA) Routing Transit Number (RTN). */
        @JsonProperty("routing_number")
        @ExcludeMissing
        fun routingNumber(routingNumber: JsonField<String>) = apply {
            this.routingNumber = routingNumber
        }

        /** If your prenotification is returned, this will contain details of the return. */
        fun prenotificationReturn(prenotificationReturn: PrenotificationReturn) = prenotificationReturn(JsonField.of(prenotificationReturn))

        /** If your prenotification is returned, this will contain details of the return. */
        @JsonProperty("prenotification_return")
        @ExcludeMissing
        fun prenotificationReturn(prenotificationReturn: JsonField<PrenotificationReturn>) = apply {
            this.prenotificationReturn = prenotificationReturn
        }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which
         * the prenotification was created.
         */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which
         * the prenotification was created.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
            this.createdAt = createdAt
        }

        /** The lifecycle status of the ACH Prenotification. */
        fun status(status: Status) = status(JsonField.of(status))

        /** The lifecycle status of the ACH Prenotification. */
        @JsonProperty("status")
        @ExcludeMissing
        fun status(status: JsonField<Status>) = apply {
            this.status = status
        }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `ach_prenotification`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * A constant representing the object's type. For this resource it will always be
         * `ach_prenotification`.
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

        fun build(): AchPrenotification = AchPrenotification(
            id,
            accountNumber,
            addendum,
            companyDescriptiveDate,
            companyDiscretionaryData,
            companyEntryDescription,
            companyName,
            creditDebitIndicator,
            effectiveDate,
            routingNumber,
            prenotificationReturn,
            createdAt,
            status,
            type,
            additionalProperties.toUnmodifiable(),
        )
    }

    class CreditDebitIndicator @JsonCreator private constructor(private val value: JsonField<String>,) {

        @com.fasterxml.jackson.annotation.JsonValue
        fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is CreditDebitIndicator &&
              this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val CREDIT = CreditDebitIndicator(JsonField.of("credit"))

            @JvmField val DEBIT = CreditDebitIndicator(JsonField.of("debit"))

            @JvmStatic fun of(value: String) = CreditDebitIndicator(JsonField.of(value))
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
            else -> throw IncreaseInvalidDataException("Unknown CreditDebitIndicator: $value")
        }

        fun asString(): String = _value().asStringOrThrow()
    }

    /** If your prenotification is returned, this will contain details of the return. */
    @JsonDeserialize(builder = PrenotificationReturn.Builder::class)
    @NoAutoDetect
    class PrenotificationReturn private constructor(private val createdAt: JsonField<OffsetDateTime>,private val returnReasonCode: JsonField<String>,private val additionalProperties: Map<String, JsonValue>,) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which
         * the Prenotification was returned.
         */
        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        /** Why the Prenotification was returned. */
        fun returnReasonCode(): String = returnReasonCode.getRequired("return_reason_code")

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which
         * the Prenotification was returned.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt() = createdAt

        /** Why the Prenotification was returned. */
        @JsonProperty("return_reason_code")
        @ExcludeMissing
        fun _returnReasonCode() = returnReasonCode

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate() = apply {
            if (!validated) {
              createdAt()
              returnReasonCode()
              validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is PrenotificationReturn &&
              this.createdAt == other.createdAt &&
              this.returnReasonCode == other.returnReasonCode &&
              this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
          if (hashCode == 0) {
            hashCode = Objects.hash(
                createdAt,
                returnReasonCode,
                additionalProperties,
            )
          }
          return hashCode
        }

        override fun toString() = "PrenotificationReturn{createdAt=$createdAt, returnReasonCode=$returnReasonCode, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic
            fun builder() = Builder()
        }

        class Builder {

            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var returnReasonCode: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(prenotificationReturn: PrenotificationReturn) = apply {
                this.createdAt = prenotificationReturn.createdAt
                this.returnReasonCode = prenotificationReturn.returnReasonCode
                additionalProperties(prenotificationReturn.additionalProperties)
            }

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which
             * the Prenotification was returned.
             */
            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which
             * the Prenotification was returned.
             */
            @JsonProperty("created_at")
            @ExcludeMissing
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            /** Why the Prenotification was returned. */
            fun returnReasonCode(returnReasonCode: String) = returnReasonCode(JsonField.of(returnReasonCode))

            /** Why the Prenotification was returned. */
            @JsonProperty("return_reason_code")
            @ExcludeMissing
            fun returnReasonCode(returnReasonCode: JsonField<String>) = apply {
                this.returnReasonCode = returnReasonCode
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

            fun build(): PrenotificationReturn = PrenotificationReturn(
                createdAt,
                returnReasonCode,
                additionalProperties.toUnmodifiable(),
            )
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

            @JvmField val PENDING_SUBMITTING = Status(JsonField.of("pending_submitting"))

            @JvmField val REQUIRES_ATTENTION = Status(JsonField.of("requires_attention"))

            @JvmField val RETURNED = Status(JsonField.of("returned"))

            @JvmField val SUBMITTED = Status(JsonField.of("submitted"))

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            PENDING_SUBMITTING,
            REQUIRES_ATTENTION,
            RETURNED,
            SUBMITTED,
        }

        enum class Value {
            PENDING_SUBMITTING,
            REQUIRES_ATTENTION,
            RETURNED,
            SUBMITTED,
            _UNKNOWN,
        }

        fun value(): Value = when (this) {
            PENDING_SUBMITTING -> Value.PENDING_SUBMITTING
            REQUIRES_ATTENTION -> Value.REQUIRES_ATTENTION
            RETURNED -> Value.RETURNED
            SUBMITTED -> Value.SUBMITTED
            else -> Value._UNKNOWN
        }

        fun known(): Known = when (this) {
            PENDING_SUBMITTING -> Known.PENDING_SUBMITTING
            REQUIRES_ATTENTION -> Known.REQUIRES_ATTENTION
            RETURNED -> Known.RETURNED
            SUBMITTED -> Known.SUBMITTED
            else -> throw IncreaseInvalidDataException("Unknown Status: $value")
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

            @JvmField val ACH_PRENOTIFICATION = Type(JsonField.of("ach_prenotification"))

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            ACH_PRENOTIFICATION,
        }

        enum class Value {
            ACH_PRENOTIFICATION,
            _UNKNOWN,
        }

        fun value(): Value = when (this) {
            ACH_PRENOTIFICATION -> Value.ACH_PRENOTIFICATION
            else -> Value._UNKNOWN
        }

        fun known(): Known = when (this) {
            ACH_PRENOTIFICATION -> Known.ACH_PRENOTIFICATION
            else -> throw IncreaseInvalidDataException("Unknown Type: $value")
        }

        fun asString(): String = _value().asStringOrThrow()
    }
}
