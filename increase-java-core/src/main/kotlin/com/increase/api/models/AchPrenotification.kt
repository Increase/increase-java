// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.toUnmodifiable
import com.increase.api.errors.IncreaseInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

/**
 * ACH Prenotifications are one way you can verify account and routing numbers by Automated Clearing
 * House (ACH).
 */
@JsonDeserialize(builder = AchPrenotification.Builder::class)
@NoAutoDetect
class AchPrenotification
private constructor(
    private val id: JsonField<String>,
    private val accountNumber: JsonField<String>,
    private val addendum: JsonField<String>,
    private val companyDescriptiveDate: JsonField<String>,
    private val companyDiscretionaryData: JsonField<String>,
    private val companyEntryDescription: JsonField<String>,
    private val companyName: JsonField<String>,
    private val creditDebitIndicator: JsonField<CreditDebitIndicator>,
    private val effectiveDate: JsonField<OffsetDateTime>,
    private val routingNumber: JsonField<String>,
    private val prenotificationReturn: JsonField<PrenotificationReturn>,
    private val notificationsOfChange: JsonField<List<NotificationsOfChange>>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val status: JsonField<Status>,
    private val type: JsonField<Type>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** The ACH Prenotification's identifier. */
    fun id(): String = id.getRequired("id")

    /** The destination account number. */
    fun accountNumber(): String = accountNumber.getRequired("account_number")

    /** Additional information for the recipient. */
    fun addendum(): Optional<String> = Optional.ofNullable(addendum.getNullable("addendum"))

    /** The description of the date of the notification. */
    fun companyDescriptiveDate(): Optional<String> =
        Optional.ofNullable(companyDescriptiveDate.getNullable("company_descriptive_date"))

    /** Optional data associated with the notification. */
    fun companyDiscretionaryData(): Optional<String> =
        Optional.ofNullable(companyDiscretionaryData.getNullable("company_discretionary_data"))

    /** The description of the notification. */
    fun companyEntryDescription(): Optional<String> =
        Optional.ofNullable(companyEntryDescription.getNullable("company_entry_description"))

    /** The name by which you know the company. */
    fun companyName(): Optional<String> =
        Optional.ofNullable(companyName.getNullable("company_name"))

    /** If the notification is for a future credit or debit. */
    fun creditDebitIndicator(): Optional<CreditDebitIndicator> =
        Optional.ofNullable(creditDebitIndicator.getNullable("credit_debit_indicator"))

    /** The effective date in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format. */
    fun effectiveDate(): Optional<OffsetDateTime> =
        Optional.ofNullable(effectiveDate.getNullable("effective_date"))

    /** The American Bankers' Association (ABA) Routing Transit Number (RTN). */
    fun routingNumber(): String = routingNumber.getRequired("routing_number")

    /** If your prenotification is returned, this will contain details of the return. */
    fun prenotificationReturn(): Optional<PrenotificationReturn> =
        Optional.ofNullable(prenotificationReturn.getNullable("prenotification_return"))

    /**
     * If the receiving bank notifies that future transfers should use different details, this will
     * contain those details.
     */
    fun notificationsOfChange(): List<NotificationsOfChange> =
        notificationsOfChange.getRequired("notifications_of_change")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
     * prenotification was created.
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
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /** The destination account number. */
    @JsonProperty("account_number") @ExcludeMissing fun _accountNumber() = accountNumber

    /** Additional information for the recipient. */
    @JsonProperty("addendum") @ExcludeMissing fun _addendum() = addendum

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
    @JsonProperty("company_name") @ExcludeMissing fun _companyName() = companyName

    /** If the notification is for a future credit or debit. */
    @JsonProperty("credit_debit_indicator")
    @ExcludeMissing
    fun _creditDebitIndicator() = creditDebitIndicator

    /** The effective date in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format. */
    @JsonProperty("effective_date") @ExcludeMissing fun _effectiveDate() = effectiveDate

    /** The American Bankers' Association (ABA) Routing Transit Number (RTN). */
    @JsonProperty("routing_number") @ExcludeMissing fun _routingNumber() = routingNumber

    /** If your prenotification is returned, this will contain details of the return. */
    @JsonProperty("prenotification_return")
    @ExcludeMissing
    fun _prenotificationReturn() = prenotificationReturn

    /**
     * If the receiving bank notifies that future transfers should use different details, this will
     * contain those details.
     */
    @JsonProperty("notifications_of_change")
    @ExcludeMissing
    fun _notificationsOfChange() = notificationsOfChange

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
     * prenotification was created.
     */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    /** The lifecycle status of the ACH Prenotification. */
    @JsonProperty("status") @ExcludeMissing fun _status() = status

    /**
     * A constant representing the object's type. For this resource it will always be
     * `ach_prenotification`.
     */
    @JsonProperty("type") @ExcludeMissing fun _type() = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): AchPrenotification = apply {
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
            notificationsOfChange().forEach { it.validate() }
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
            this.notificationsOfChange == other.notificationsOfChange &&
            this.createdAt == other.createdAt &&
            this.status == other.status &&
            this.type == other.type &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
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
                    notificationsOfChange,
                    createdAt,
                    status,
                    type,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "AchPrenotification{id=$id, accountNumber=$accountNumber, addendum=$addendum, companyDescriptiveDate=$companyDescriptiveDate, companyDiscretionaryData=$companyDiscretionaryData, companyEntryDescription=$companyEntryDescription, companyName=$companyName, creditDebitIndicator=$creditDebitIndicator, effectiveDate=$effectiveDate, routingNumber=$routingNumber, prenotificationReturn=$prenotificationReturn, notificationsOfChange=$notificationsOfChange, createdAt=$createdAt, status=$status, type=$type, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
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
        private var notificationsOfChange: JsonField<List<NotificationsOfChange>> = JsonMissing.of()
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
            this.notificationsOfChange = achPrenotification.notificationsOfChange
            this.createdAt = achPrenotification.createdAt
            this.status = achPrenotification.status
            this.type = achPrenotification.type
            additionalProperties(achPrenotification.additionalProperties)
        }

        /** The ACH Prenotification's identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The ACH Prenotification's identifier. */
        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

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
        fun addendum(addendum: JsonField<String>) = apply { this.addendum = addendum }

        /** The description of the date of the notification. */
        fun companyDescriptiveDate(companyDescriptiveDate: String) =
            companyDescriptiveDate(JsonField.of(companyDescriptiveDate))

        /** The description of the date of the notification. */
        @JsonProperty("company_descriptive_date")
        @ExcludeMissing
        fun companyDescriptiveDate(companyDescriptiveDate: JsonField<String>) = apply {
            this.companyDescriptiveDate = companyDescriptiveDate
        }

        /** Optional data associated with the notification. */
        fun companyDiscretionaryData(companyDiscretionaryData: String) =
            companyDiscretionaryData(JsonField.of(companyDiscretionaryData))

        /** Optional data associated with the notification. */
        @JsonProperty("company_discretionary_data")
        @ExcludeMissing
        fun companyDiscretionaryData(companyDiscretionaryData: JsonField<String>) = apply {
            this.companyDiscretionaryData = companyDiscretionaryData
        }

        /** The description of the notification. */
        fun companyEntryDescription(companyEntryDescription: String) =
            companyEntryDescription(JsonField.of(companyEntryDescription))

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
        fun companyName(companyName: JsonField<String>) = apply { this.companyName = companyName }

        /** If the notification is for a future credit or debit. */
        fun creditDebitIndicator(creditDebitIndicator: CreditDebitIndicator) =
            creditDebitIndicator(JsonField.of(creditDebitIndicator))

        /** If the notification is for a future credit or debit. */
        @JsonProperty("credit_debit_indicator")
        @ExcludeMissing
        fun creditDebitIndicator(creditDebitIndicator: JsonField<CreditDebitIndicator>) = apply {
            this.creditDebitIndicator = creditDebitIndicator
        }

        /** The effective date in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format. */
        fun effectiveDate(effectiveDate: OffsetDateTime) =
            effectiveDate(JsonField.of(effectiveDate))

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
        fun prenotificationReturn(prenotificationReturn: PrenotificationReturn) =
            prenotificationReturn(JsonField.of(prenotificationReturn))

        /** If your prenotification is returned, this will contain details of the return. */
        @JsonProperty("prenotification_return")
        @ExcludeMissing
        fun prenotificationReturn(prenotificationReturn: JsonField<PrenotificationReturn>) = apply {
            this.prenotificationReturn = prenotificationReturn
        }

        /**
         * If the receiving bank notifies that future transfers should use different details, this
         * will contain those details.
         */
        fun notificationsOfChange(notificationsOfChange: List<NotificationsOfChange>) =
            notificationsOfChange(JsonField.of(notificationsOfChange))

        /**
         * If the receiving bank notifies that future transfers should use different details, this
         * will contain those details.
         */
        @JsonProperty("notifications_of_change")
        @ExcludeMissing
        fun notificationsOfChange(notificationsOfChange: JsonField<List<NotificationsOfChange>>) =
            apply {
                this.notificationsOfChange = notificationsOfChange
            }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
         * prenotification was created.
         */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
         * prenotification was created.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** The lifecycle status of the ACH Prenotification. */
        fun status(status: Status) = status(JsonField.of(status))

        /** The lifecycle status of the ACH Prenotification. */
        @JsonProperty("status")
        @ExcludeMissing
        fun status(status: JsonField<Status>) = apply { this.status = status }

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

        fun build(): AchPrenotification =
            AchPrenotification(
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
                notificationsOfChange.map { it.toUnmodifiable() },
                createdAt,
                status,
                type,
                additionalProperties.toUnmodifiable(),
            )
    }

    class CreditDebitIndicator
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CreditDebitIndicator && this.value == other.value
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

        fun value(): Value =
            when (this) {
                CREDIT -> Value.CREDIT
                DEBIT -> Value.DEBIT
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                CREDIT -> Known.CREDIT
                DEBIT -> Known.DEBIT
                else -> throw IncreaseInvalidDataException("Unknown CreditDebitIndicator: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    @JsonDeserialize(builder = NotificationsOfChange.Builder::class)
    @NoAutoDetect
    class NotificationsOfChange
    private constructor(
        private val createdAt: JsonField<OffsetDateTime>,
        private val changeCode: JsonField<ChangeCode>,
        private val correctedData: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
         * notification occurred.
         */
        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        /**
         * The required type of change that is being signaled by the receiving financial
         * institution.
         */
        fun changeCode(): ChangeCode = changeCode.getRequired("change_code")

        /**
         * The corrected data that should be used in future ACHs to this account. This may contain
         * the suggested new account number or routing number. When the `change_code` is
         * `incorrect_transaction_code`, this field contains an integer. Numbers starting with a 2
         * encourage changing the `funding` parameter to checking; numbers starting with a 3
         * encourage changing to savings.
         */
        fun correctedData(): String = correctedData.getRequired("corrected_data")

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
         * notification occurred.
         */
        @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

        /**
         * The required type of change that is being signaled by the receiving financial
         * institution.
         */
        @JsonProperty("change_code") @ExcludeMissing fun _changeCode() = changeCode

        /**
         * The corrected data that should be used in future ACHs to this account. This may contain
         * the suggested new account number or routing number. When the `change_code` is
         * `incorrect_transaction_code`, this field contains an integer. Numbers starting with a 2
         * encourage changing the `funding` parameter to checking; numbers starting with a 3
         * encourage changing to savings.
         */
        @JsonProperty("corrected_data") @ExcludeMissing fun _correctedData() = correctedData

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): NotificationsOfChange = apply {
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

            return other is NotificationsOfChange &&
                this.createdAt == other.createdAt &&
                this.changeCode == other.changeCode &&
                this.correctedData == other.correctedData &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        createdAt,
                        changeCode,
                        correctedData,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "NotificationsOfChange{createdAt=$createdAt, changeCode=$changeCode, correctedData=$correctedData, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var changeCode: JsonField<ChangeCode> = JsonMissing.of()
            private var correctedData: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(notificationsOfChange: NotificationsOfChange) = apply {
                this.createdAt = notificationsOfChange.createdAt
                this.changeCode = notificationsOfChange.changeCode
                this.correctedData = notificationsOfChange.correctedData
                additionalProperties(notificationsOfChange.additionalProperties)
            }

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * notification occurred.
             */
            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * notification occurred.
             */
            @JsonProperty("created_at")
            @ExcludeMissing
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            /**
             * The required type of change that is being signaled by the receiving financial
             * institution.
             */
            fun changeCode(changeCode: ChangeCode) = changeCode(JsonField.of(changeCode))

            /**
             * The required type of change that is being signaled by the receiving financial
             * institution.
             */
            @JsonProperty("change_code")
            @ExcludeMissing
            fun changeCode(changeCode: JsonField<ChangeCode>) = apply {
                this.changeCode = changeCode
            }

            /**
             * The corrected data that should be used in future ACHs to this account. This may
             * contain the suggested new account number or routing number. When the `change_code` is
             * `incorrect_transaction_code`, this field contains an integer. Numbers starting with a
             * 2 encourage changing the `funding` parameter to checking; numbers starting with a 3
             * encourage changing to savings.
             */
            fun correctedData(correctedData: String) = correctedData(JsonField.of(correctedData))

            /**
             * The corrected data that should be used in future ACHs to this account. This may
             * contain the suggested new account number or routing number. When the `change_code` is
             * `incorrect_transaction_code`, this field contains an integer. Numbers starting with a
             * 2 encourage changing the `funding` parameter to checking; numbers starting with a 3
             * encourage changing to savings.
             */
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

            fun build(): NotificationsOfChange =
                NotificationsOfChange(
                    createdAt,
                    changeCode,
                    correctedData,
                    additionalProperties.toUnmodifiable(),
                )
        }

        class ChangeCode
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ChangeCode && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField
                val INCORRECT_ACCOUNT_NUMBER = ChangeCode(JsonField.of("incorrect_account_number"))

                @JvmField
                val INCORRECT_ROUTING_NUMBER = ChangeCode(JsonField.of("incorrect_routing_number"))

                @JvmField
                val INCORRECT_ROUTING_NUMBER_AND_ACCOUNT_NUMBER =
                    ChangeCode(JsonField.of("incorrect_routing_number_and_account_number"))

                @JvmField
                val INCORRECT_TRANSACTION_CODE =
                    ChangeCode(JsonField.of("incorrect_transaction_code"))

                @JvmField
                val INCORRECT_ACCOUNT_NUMBER_AND_TRANSACTION_CODE =
                    ChangeCode(JsonField.of("incorrect_account_number_and_transaction_code"))

                @JvmField
                val INCORRECT_ROUTING_NUMBER_ACCOUNT_NUMBER_AND_TRANSACTION_CODE =
                    ChangeCode(
                        JsonField.of("incorrect_routing_number_account_number_and_transaction_code")
                    )

                @JvmField
                val INCORRECT_RECEIVING_DEPOSITORY_FINANCIAL_INSTITUTION_IDENTIFICATION =
                    ChangeCode(
                        JsonField.of(
                            "incorrect_receiving_depository_financial_institution_identification"
                        )
                    )

                @JvmField
                val INCORRECT_INDIVIDUAL_IDENTIFICATION_NUMBER =
                    ChangeCode(JsonField.of("incorrect_individual_identification_number"))

                @JvmField
                val ADDENDA_FORMAT_ERROR = ChangeCode(JsonField.of("addenda_format_error"))

                @JvmField
                val INCORRECT_STANDARD_ENTRY_CLASS_CODE_FOR_OUTBOUND_INTERNATIONAL_PAYMENT =
                    ChangeCode(
                        JsonField.of(
                            "incorrect_standard_entry_class_code_for_outbound_international_payment"
                        )
                    )

                @JvmField
                val MISROUTED_NOTIFICATION_OF_CHANGE =
                    ChangeCode(JsonField.of("misrouted_notification_of_change"))

                @JvmField
                val INCORRECT_TRACE_NUMBER = ChangeCode(JsonField.of("incorrect_trace_number"))

                @JvmField
                val INCORRECT_COMPANY_IDENTIFICATION_NUMBER =
                    ChangeCode(JsonField.of("incorrect_company_identification_number"))

                @JvmField
                val INCORRECT_IDENTIFICATION_NUMBER =
                    ChangeCode(JsonField.of("incorrect_identification_number"))

                @JvmField
                val INCORRECTLY_FORMATTED_CORRECTED_DATA =
                    ChangeCode(JsonField.of("incorrectly_formatted_corrected_data"))

                @JvmField
                val INCORRECT_DISCRETIONARY_DATA =
                    ChangeCode(JsonField.of("incorrect_discretionary_data"))

                @JvmField
                val ROUTING_NUMBER_NOT_FROM_ORIGINAL_ENTRY_DETAIL_RECORD =
                    ChangeCode(JsonField.of("routing_number_not_from_original_entry_detail_record"))

                @JvmField
                val DEPOSITORY_FINANCIAL_INSTITUTION_ACCOUNT_NUMBER_NOT_FROM_ORIGINAL_ENTRY_DETAIL_RECORD =
                    ChangeCode(
                        JsonField.of(
                            "depository_financial_institution_account_number_not_from_original_entry_detail_record"
                        )
                    )

                @JvmField
                val INCORRECT_TRANSACTION_CODE_BY_ORIGINATING_DEPOSITORY_FINANCIAL_INSTITUTION =
                    ChangeCode(
                        JsonField.of(
                            "incorrect_transaction_code_by_originating_depository_financial_institution"
                        )
                    )

                @JvmStatic fun of(value: String) = ChangeCode(JsonField.of(value))
            }

            enum class Known {
                INCORRECT_ACCOUNT_NUMBER,
                INCORRECT_ROUTING_NUMBER,
                INCORRECT_ROUTING_NUMBER_AND_ACCOUNT_NUMBER,
                INCORRECT_TRANSACTION_CODE,
                INCORRECT_ACCOUNT_NUMBER_AND_TRANSACTION_CODE,
                INCORRECT_ROUTING_NUMBER_ACCOUNT_NUMBER_AND_TRANSACTION_CODE,
                INCORRECT_RECEIVING_DEPOSITORY_FINANCIAL_INSTITUTION_IDENTIFICATION,
                INCORRECT_INDIVIDUAL_IDENTIFICATION_NUMBER,
                ADDENDA_FORMAT_ERROR,
                INCORRECT_STANDARD_ENTRY_CLASS_CODE_FOR_OUTBOUND_INTERNATIONAL_PAYMENT,
                MISROUTED_NOTIFICATION_OF_CHANGE,
                INCORRECT_TRACE_NUMBER,
                INCORRECT_COMPANY_IDENTIFICATION_NUMBER,
                INCORRECT_IDENTIFICATION_NUMBER,
                INCORRECTLY_FORMATTED_CORRECTED_DATA,
                INCORRECT_DISCRETIONARY_DATA,
                ROUTING_NUMBER_NOT_FROM_ORIGINAL_ENTRY_DETAIL_RECORD,
                DEPOSITORY_FINANCIAL_INSTITUTION_ACCOUNT_NUMBER_NOT_FROM_ORIGINAL_ENTRY_DETAIL_RECORD,
                INCORRECT_TRANSACTION_CODE_BY_ORIGINATING_DEPOSITORY_FINANCIAL_INSTITUTION,
            }

            enum class Value {
                INCORRECT_ACCOUNT_NUMBER,
                INCORRECT_ROUTING_NUMBER,
                INCORRECT_ROUTING_NUMBER_AND_ACCOUNT_NUMBER,
                INCORRECT_TRANSACTION_CODE,
                INCORRECT_ACCOUNT_NUMBER_AND_TRANSACTION_CODE,
                INCORRECT_ROUTING_NUMBER_ACCOUNT_NUMBER_AND_TRANSACTION_CODE,
                INCORRECT_RECEIVING_DEPOSITORY_FINANCIAL_INSTITUTION_IDENTIFICATION,
                INCORRECT_INDIVIDUAL_IDENTIFICATION_NUMBER,
                ADDENDA_FORMAT_ERROR,
                INCORRECT_STANDARD_ENTRY_CLASS_CODE_FOR_OUTBOUND_INTERNATIONAL_PAYMENT,
                MISROUTED_NOTIFICATION_OF_CHANGE,
                INCORRECT_TRACE_NUMBER,
                INCORRECT_COMPANY_IDENTIFICATION_NUMBER,
                INCORRECT_IDENTIFICATION_NUMBER,
                INCORRECTLY_FORMATTED_CORRECTED_DATA,
                INCORRECT_DISCRETIONARY_DATA,
                ROUTING_NUMBER_NOT_FROM_ORIGINAL_ENTRY_DETAIL_RECORD,
                DEPOSITORY_FINANCIAL_INSTITUTION_ACCOUNT_NUMBER_NOT_FROM_ORIGINAL_ENTRY_DETAIL_RECORD,
                INCORRECT_TRANSACTION_CODE_BY_ORIGINATING_DEPOSITORY_FINANCIAL_INSTITUTION,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    INCORRECT_ACCOUNT_NUMBER -> Value.INCORRECT_ACCOUNT_NUMBER
                    INCORRECT_ROUTING_NUMBER -> Value.INCORRECT_ROUTING_NUMBER
                    INCORRECT_ROUTING_NUMBER_AND_ACCOUNT_NUMBER ->
                        Value.INCORRECT_ROUTING_NUMBER_AND_ACCOUNT_NUMBER
                    INCORRECT_TRANSACTION_CODE -> Value.INCORRECT_TRANSACTION_CODE
                    INCORRECT_ACCOUNT_NUMBER_AND_TRANSACTION_CODE ->
                        Value.INCORRECT_ACCOUNT_NUMBER_AND_TRANSACTION_CODE
                    INCORRECT_ROUTING_NUMBER_ACCOUNT_NUMBER_AND_TRANSACTION_CODE ->
                        Value.INCORRECT_ROUTING_NUMBER_ACCOUNT_NUMBER_AND_TRANSACTION_CODE
                    INCORRECT_RECEIVING_DEPOSITORY_FINANCIAL_INSTITUTION_IDENTIFICATION ->
                        Value.INCORRECT_RECEIVING_DEPOSITORY_FINANCIAL_INSTITUTION_IDENTIFICATION
                    INCORRECT_INDIVIDUAL_IDENTIFICATION_NUMBER ->
                        Value.INCORRECT_INDIVIDUAL_IDENTIFICATION_NUMBER
                    ADDENDA_FORMAT_ERROR -> Value.ADDENDA_FORMAT_ERROR
                    INCORRECT_STANDARD_ENTRY_CLASS_CODE_FOR_OUTBOUND_INTERNATIONAL_PAYMENT ->
                        Value.INCORRECT_STANDARD_ENTRY_CLASS_CODE_FOR_OUTBOUND_INTERNATIONAL_PAYMENT
                    MISROUTED_NOTIFICATION_OF_CHANGE -> Value.MISROUTED_NOTIFICATION_OF_CHANGE
                    INCORRECT_TRACE_NUMBER -> Value.INCORRECT_TRACE_NUMBER
                    INCORRECT_COMPANY_IDENTIFICATION_NUMBER ->
                        Value.INCORRECT_COMPANY_IDENTIFICATION_NUMBER
                    INCORRECT_IDENTIFICATION_NUMBER -> Value.INCORRECT_IDENTIFICATION_NUMBER
                    INCORRECTLY_FORMATTED_CORRECTED_DATA ->
                        Value.INCORRECTLY_FORMATTED_CORRECTED_DATA
                    INCORRECT_DISCRETIONARY_DATA -> Value.INCORRECT_DISCRETIONARY_DATA
                    ROUTING_NUMBER_NOT_FROM_ORIGINAL_ENTRY_DETAIL_RECORD ->
                        Value.ROUTING_NUMBER_NOT_FROM_ORIGINAL_ENTRY_DETAIL_RECORD
                    DEPOSITORY_FINANCIAL_INSTITUTION_ACCOUNT_NUMBER_NOT_FROM_ORIGINAL_ENTRY_DETAIL_RECORD ->
                        Value
                            .DEPOSITORY_FINANCIAL_INSTITUTION_ACCOUNT_NUMBER_NOT_FROM_ORIGINAL_ENTRY_DETAIL_RECORD
                    INCORRECT_TRANSACTION_CODE_BY_ORIGINATING_DEPOSITORY_FINANCIAL_INSTITUTION ->
                        Value
                            .INCORRECT_TRANSACTION_CODE_BY_ORIGINATING_DEPOSITORY_FINANCIAL_INSTITUTION
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    INCORRECT_ACCOUNT_NUMBER -> Known.INCORRECT_ACCOUNT_NUMBER
                    INCORRECT_ROUTING_NUMBER -> Known.INCORRECT_ROUTING_NUMBER
                    INCORRECT_ROUTING_NUMBER_AND_ACCOUNT_NUMBER ->
                        Known.INCORRECT_ROUTING_NUMBER_AND_ACCOUNT_NUMBER
                    INCORRECT_TRANSACTION_CODE -> Known.INCORRECT_TRANSACTION_CODE
                    INCORRECT_ACCOUNT_NUMBER_AND_TRANSACTION_CODE ->
                        Known.INCORRECT_ACCOUNT_NUMBER_AND_TRANSACTION_CODE
                    INCORRECT_ROUTING_NUMBER_ACCOUNT_NUMBER_AND_TRANSACTION_CODE ->
                        Known.INCORRECT_ROUTING_NUMBER_ACCOUNT_NUMBER_AND_TRANSACTION_CODE
                    INCORRECT_RECEIVING_DEPOSITORY_FINANCIAL_INSTITUTION_IDENTIFICATION ->
                        Known.INCORRECT_RECEIVING_DEPOSITORY_FINANCIAL_INSTITUTION_IDENTIFICATION
                    INCORRECT_INDIVIDUAL_IDENTIFICATION_NUMBER ->
                        Known.INCORRECT_INDIVIDUAL_IDENTIFICATION_NUMBER
                    ADDENDA_FORMAT_ERROR -> Known.ADDENDA_FORMAT_ERROR
                    INCORRECT_STANDARD_ENTRY_CLASS_CODE_FOR_OUTBOUND_INTERNATIONAL_PAYMENT ->
                        Known.INCORRECT_STANDARD_ENTRY_CLASS_CODE_FOR_OUTBOUND_INTERNATIONAL_PAYMENT
                    MISROUTED_NOTIFICATION_OF_CHANGE -> Known.MISROUTED_NOTIFICATION_OF_CHANGE
                    INCORRECT_TRACE_NUMBER -> Known.INCORRECT_TRACE_NUMBER
                    INCORRECT_COMPANY_IDENTIFICATION_NUMBER ->
                        Known.INCORRECT_COMPANY_IDENTIFICATION_NUMBER
                    INCORRECT_IDENTIFICATION_NUMBER -> Known.INCORRECT_IDENTIFICATION_NUMBER
                    INCORRECTLY_FORMATTED_CORRECTED_DATA ->
                        Known.INCORRECTLY_FORMATTED_CORRECTED_DATA
                    INCORRECT_DISCRETIONARY_DATA -> Known.INCORRECT_DISCRETIONARY_DATA
                    ROUTING_NUMBER_NOT_FROM_ORIGINAL_ENTRY_DETAIL_RECORD ->
                        Known.ROUTING_NUMBER_NOT_FROM_ORIGINAL_ENTRY_DETAIL_RECORD
                    DEPOSITORY_FINANCIAL_INSTITUTION_ACCOUNT_NUMBER_NOT_FROM_ORIGINAL_ENTRY_DETAIL_RECORD ->
                        Known
                            .DEPOSITORY_FINANCIAL_INSTITUTION_ACCOUNT_NUMBER_NOT_FROM_ORIGINAL_ENTRY_DETAIL_RECORD
                    INCORRECT_TRANSACTION_CODE_BY_ORIGINATING_DEPOSITORY_FINANCIAL_INSTITUTION ->
                        Known
                            .INCORRECT_TRANSACTION_CODE_BY_ORIGINATING_DEPOSITORY_FINANCIAL_INSTITUTION
                    else -> throw IncreaseInvalidDataException("Unknown ChangeCode: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }
    }

    /** If your prenotification is returned, this will contain details of the return. */
    @JsonDeserialize(builder = PrenotificationReturn.Builder::class)
    @NoAutoDetect
    class PrenotificationReturn
    private constructor(
        private val createdAt: JsonField<OffsetDateTime>,
        private val returnReasonCode: JsonField<ReturnReasonCode>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
         * Prenotification was returned.
         */
        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        /** Why the Prenotification was returned. */
        fun returnReasonCode(): ReturnReasonCode =
            returnReasonCode.getRequired("return_reason_code")

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
         * Prenotification was returned.
         */
        @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

        /** Why the Prenotification was returned. */
        @JsonProperty("return_reason_code")
        @ExcludeMissing
        fun _returnReasonCode() = returnReasonCode

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): PrenotificationReturn = apply {
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
                hashCode =
                    Objects.hash(
                        createdAt,
                        returnReasonCode,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "PrenotificationReturn{createdAt=$createdAt, returnReasonCode=$returnReasonCode, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var returnReasonCode: JsonField<ReturnReasonCode> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(prenotificationReturn: PrenotificationReturn) = apply {
                this.createdAt = prenotificationReturn.createdAt
                this.returnReasonCode = prenotificationReturn.returnReasonCode
                additionalProperties(prenotificationReturn.additionalProperties)
            }

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * Prenotification was returned.
             */
            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * Prenotification was returned.
             */
            @JsonProperty("created_at")
            @ExcludeMissing
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            /** Why the Prenotification was returned. */
            fun returnReasonCode(returnReasonCode: ReturnReasonCode) =
                returnReasonCode(JsonField.of(returnReasonCode))

            /** Why the Prenotification was returned. */
            @JsonProperty("return_reason_code")
            @ExcludeMissing
            fun returnReasonCode(returnReasonCode: JsonField<ReturnReasonCode>) = apply {
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

            fun build(): PrenotificationReturn =
                PrenotificationReturn(
                    createdAt,
                    returnReasonCode,
                    additionalProperties.toUnmodifiable(),
                )
        }

        class ReturnReasonCode
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ReturnReasonCode && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField
                val INSUFFICIENT_FUND = ReturnReasonCode(JsonField.of("insufficient_fund"))

                @JvmField val NO_ACCOUNT = ReturnReasonCode(JsonField.of("no_account"))

                @JvmField val ACCOUNT_CLOSED = ReturnReasonCode(JsonField.of("account_closed"))

                @JvmField
                val INVALID_ACCOUNT_NUMBER_STRUCTURE =
                    ReturnReasonCode(JsonField.of("invalid_account_number_structure"))

                @JvmField
                val ACCOUNT_FROZEN_ENTRY_RETURNED_PER_OFAC_INSTRUCTION =
                    ReturnReasonCode(
                        JsonField.of("account_frozen_entry_returned_per_ofac_instruction")
                    )

                @JvmField
                val CREDIT_ENTRY_REFUSED_BY_RECEIVER =
                    ReturnReasonCode(JsonField.of("credit_entry_refused_by_receiver"))

                @JvmField
                val UNAUTHORIZED_DEBIT_TO_CONSUMER_ACCOUNT_USING_CORPORATE_SEC_CODE =
                    ReturnReasonCode(
                        JsonField.of(
                            "unauthorized_debit_to_consumer_account_using_corporate_sec_code"
                        )
                    )

                @JvmField
                val CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED =
                    ReturnReasonCode(JsonField.of("corporate_customer_advised_not_authorized"))

                @JvmField val PAYMENT_STOPPED = ReturnReasonCode(JsonField.of("payment_stopped"))

                @JvmField
                val NON_TRANSACTION_ACCOUNT =
                    ReturnReasonCode(JsonField.of("non_transaction_account"))

                @JvmField
                val UNCOLLECTED_FUNDS = ReturnReasonCode(JsonField.of("uncollected_funds"))

                @JvmField
                val ROUTING_NUMBER_CHECK_DIGIT_ERROR =
                    ReturnReasonCode(JsonField.of("routing_number_check_digit_error"))

                @JvmField
                val CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE =
                    ReturnReasonCode(
                        JsonField.of(
                            "customer_advised_unauthorized_improper_ineligible_or_incomplete"
                        )
                    )

                @JvmField
                val AMOUNT_FIELD_ERROR = ReturnReasonCode(JsonField.of("amount_field_error"))

                @JvmField
                val AUTHORIZATION_REVOKED_BY_CUSTOMER =
                    ReturnReasonCode(JsonField.of("authorization_revoked_by_customer"))

                @JvmField
                val INVALID_ACH_ROUTING_NUMBER =
                    ReturnReasonCode(JsonField.of("invalid_ach_routing_number"))

                @JvmField
                val FILE_RECORD_EDIT_CRITERIA =
                    ReturnReasonCode(JsonField.of("file_record_edit_criteria"))

                @JvmField
                val ENR_INVALID_INDIVIDUAL_NAME =
                    ReturnReasonCode(JsonField.of("enr_invalid_individual_name"))

                @JvmField
                val RETURNED_PER_ODFI_REQUEST =
                    ReturnReasonCode(JsonField.of("returned_per_odfi_request"))

                @JvmField
                val LIMITED_PARTICIPATION_DFI =
                    ReturnReasonCode(JsonField.of("limited_participation_dfi"))

                @JvmField
                val INCORRECTLY_CODED_OUTBOUND_INTERNATIONAL_PAYMENT =
                    ReturnReasonCode(
                        JsonField.of("incorrectly_coded_outbound_international_payment")
                    )

                @JvmField
                val ACCOUNT_SOLD_TO_ANOTHER_DFI =
                    ReturnReasonCode(JsonField.of("account_sold_to_another_dfi"))

                @JvmField val ADDENDA_ERROR = ReturnReasonCode(JsonField.of("addenda_error"))

                @JvmField
                val BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED =
                    ReturnReasonCode(JsonField.of("beneficiary_or_account_holder_deceased"))

                @JvmField
                val CUSTOMER_ADVISED_NOT_WITHIN_AUTHORIZATION_TERMS =
                    ReturnReasonCode(
                        JsonField.of("customer_advised_not_within_authorization_terms")
                    )

                @JvmField val CORRECTED_RETURN = ReturnReasonCode(JsonField.of("corrected_return"))

                @JvmField val DUPLICATE_ENTRY = ReturnReasonCode(JsonField.of("duplicate_entry"))

                @JvmField val DUPLICATE_RETURN = ReturnReasonCode(JsonField.of("duplicate_return"))

                @JvmField
                val ENR_DUPLICATE_ENROLLMENT =
                    ReturnReasonCode(JsonField.of("enr_duplicate_enrollment"))

                @JvmField
                val ENR_INVALID_DFI_ACCOUNT_NUMBER =
                    ReturnReasonCode(JsonField.of("enr_invalid_dfi_account_number"))

                @JvmField
                val ENR_INVALID_INDIVIDUAL_ID_NUMBER =
                    ReturnReasonCode(JsonField.of("enr_invalid_individual_id_number"))

                @JvmField
                val ENR_INVALID_REPRESENTATIVE_PAYEE_INDICATOR =
                    ReturnReasonCode(JsonField.of("enr_invalid_representative_payee_indicator"))

                @JvmField
                val ENR_INVALID_TRANSACTION_CODE =
                    ReturnReasonCode(JsonField.of("enr_invalid_transaction_code"))

                @JvmField
                val ENR_RETURN_OF_ENR_ENTRY =
                    ReturnReasonCode(JsonField.of("enr_return_of_enr_entry"))

                @JvmField
                val ENR_ROUTING_NUMBER_CHECK_DIGIT_ERROR =
                    ReturnReasonCode(JsonField.of("enr_routing_number_check_digit_error"))

                @JvmField
                val ENTRY_NOT_PROCESSED_BY_GATEWAY =
                    ReturnReasonCode(JsonField.of("entry_not_processed_by_gateway"))

                @JvmField val FIELD_ERROR = ReturnReasonCode(JsonField.of("field_error"))

                @JvmField
                val FOREIGN_RECEIVING_DFI_UNABLE_TO_SETTLE =
                    ReturnReasonCode(JsonField.of("foreign_receiving_dfi_unable_to_settle"))

                @JvmField
                val IAT_ENTRY_CODING_ERROR =
                    ReturnReasonCode(JsonField.of("iat_entry_coding_error"))

                @JvmField
                val IMPROPER_EFFECTIVE_ENTRY_DATE =
                    ReturnReasonCode(JsonField.of("improper_effective_entry_date"))

                @JvmField
                val IMPROPER_SOURCE_DOCUMENT_SOURCE_DOCUMENT_PRESENTED =
                    ReturnReasonCode(
                        JsonField.of("improper_source_document_source_document_presented")
                    )

                @JvmField
                val INVALID_COMPANY_ID = ReturnReasonCode(JsonField.of("invalid_company_id"))

                @JvmField
                val INVALID_FOREIGN_RECEIVING_DFI_IDENTIFICATION =
                    ReturnReasonCode(JsonField.of("invalid_foreign_receiving_dfi_identification"))

                @JvmField
                val INVALID_INDIVIDUAL_ID_NUMBER =
                    ReturnReasonCode(JsonField.of("invalid_individual_id_number"))

                @JvmField
                val ITEM_AND_RCK_ENTRY_PRESENTED_FOR_PAYMENT =
                    ReturnReasonCode(JsonField.of("item_and_rck_entry_presented_for_payment"))

                @JvmField
                val ITEM_RELATED_TO_RCK_ENTRY_IS_INELIGIBLE =
                    ReturnReasonCode(JsonField.of("item_related_to_rck_entry_is_ineligible"))

                @JvmField
                val MANDATORY_FIELD_ERROR = ReturnReasonCode(JsonField.of("mandatory_field_error"))

                @JvmField
                val MISROUTED_DISHONORED_RETURN =
                    ReturnReasonCode(JsonField.of("misrouted_dishonored_return"))

                @JvmField val MISROUTED_RETURN = ReturnReasonCode(JsonField.of("misrouted_return"))

                @JvmField val NO_ERRORS_FOUND = ReturnReasonCode(JsonField.of("no_errors_found"))

                @JvmField
                val NON_ACCEPTANCE_OF_R62_DISHONORED_RETURN =
                    ReturnReasonCode(JsonField.of("non_acceptance_of_r62_dishonored_return"))

                @JvmField
                val NON_PARTICIPANT_IN_IAT_PROGRAM =
                    ReturnReasonCode(JsonField.of("non_participant_in_iat_program"))

                @JvmField
                val PERMISSIBLE_RETURN_ENTRY =
                    ReturnReasonCode(JsonField.of("permissible_return_entry"))

                @JvmField
                val PERMISSIBLE_RETURN_ENTRY_NOT_ACCEPTED =
                    ReturnReasonCode(JsonField.of("permissible_return_entry_not_accepted"))

                @JvmField
                val RDFI_NON_SETTLEMENT = ReturnReasonCode(JsonField.of("rdfi_non_settlement"))

                @JvmField
                val RDFI_PARTICIPANT_IN_CHECK_TRUNCATION_PROGRAM =
                    ReturnReasonCode(JsonField.of("rdfi_participant_in_check_truncation_program"))

                @JvmField
                val REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY =
                    ReturnReasonCode(
                        JsonField.of(
                            "representative_payee_deceased_or_unable_to_continue_in_that_capacity"
                        )
                    )

                @JvmField
                val RETURN_NOT_A_DUPLICATE =
                    ReturnReasonCode(JsonField.of("return_not_a_duplicate"))

                @JvmField
                val RETURN_OF_ERRONEOUS_OR_REVERSING_DEBIT =
                    ReturnReasonCode(JsonField.of("return_of_erroneous_or_reversing_debit"))

                @JvmField
                val RETURN_OF_IMPROPER_CREDIT_ENTRY =
                    ReturnReasonCode(JsonField.of("return_of_improper_credit_entry"))

                @JvmField
                val RETURN_OF_IMPROPER_DEBIT_ENTRY =
                    ReturnReasonCode(JsonField.of("return_of_improper_debit_entry"))

                @JvmField
                val RETURN_OF_XCK_ENTRY = ReturnReasonCode(JsonField.of("return_of_xck_entry"))

                @JvmField
                val SOURCE_DOCUMENT_PRESENTED_FOR_PAYMENT =
                    ReturnReasonCode(JsonField.of("source_document_presented_for_payment"))

                @JvmField
                val STATE_LAW_AFFECTING_RCK_ACCEPTANCE =
                    ReturnReasonCode(JsonField.of("state_law_affecting_rck_acceptance"))

                @JvmField
                val STOP_PAYMENT_ON_ITEM_RELATED_TO_RCK_ENTRY =
                    ReturnReasonCode(JsonField.of("stop_payment_on_item_related_to_rck_entry"))

                @JvmField
                val STOP_PAYMENT_ON_SOURCE_DOCUMENT =
                    ReturnReasonCode(JsonField.of("stop_payment_on_source_document"))

                @JvmField
                val TIMELY_ORIGINAL_RETURN =
                    ReturnReasonCode(JsonField.of("timely_original_return"))

                @JvmField
                val TRACE_NUMBER_ERROR = ReturnReasonCode(JsonField.of("trace_number_error"))

                @JvmField
                val UNTIMELY_DISHONORED_RETURN =
                    ReturnReasonCode(JsonField.of("untimely_dishonored_return"))

                @JvmField val UNTIMELY_RETURN = ReturnReasonCode(JsonField.of("untimely_return"))

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
                LIMITED_PARTICIPATION_DFI,
                INCORRECTLY_CODED_OUTBOUND_INTERNATIONAL_PAYMENT,
                ACCOUNT_SOLD_TO_ANOTHER_DFI,
                ADDENDA_ERROR,
                BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED,
                CUSTOMER_ADVISED_NOT_WITHIN_AUTHORIZATION_TERMS,
                CORRECTED_RETURN,
                DUPLICATE_ENTRY,
                DUPLICATE_RETURN,
                ENR_DUPLICATE_ENROLLMENT,
                ENR_INVALID_DFI_ACCOUNT_NUMBER,
                ENR_INVALID_INDIVIDUAL_ID_NUMBER,
                ENR_INVALID_REPRESENTATIVE_PAYEE_INDICATOR,
                ENR_INVALID_TRANSACTION_CODE,
                ENR_RETURN_OF_ENR_ENTRY,
                ENR_ROUTING_NUMBER_CHECK_DIGIT_ERROR,
                ENTRY_NOT_PROCESSED_BY_GATEWAY,
                FIELD_ERROR,
                FOREIGN_RECEIVING_DFI_UNABLE_TO_SETTLE,
                IAT_ENTRY_CODING_ERROR,
                IMPROPER_EFFECTIVE_ENTRY_DATE,
                IMPROPER_SOURCE_DOCUMENT_SOURCE_DOCUMENT_PRESENTED,
                INVALID_COMPANY_ID,
                INVALID_FOREIGN_RECEIVING_DFI_IDENTIFICATION,
                INVALID_INDIVIDUAL_ID_NUMBER,
                ITEM_AND_RCK_ENTRY_PRESENTED_FOR_PAYMENT,
                ITEM_RELATED_TO_RCK_ENTRY_IS_INELIGIBLE,
                MANDATORY_FIELD_ERROR,
                MISROUTED_DISHONORED_RETURN,
                MISROUTED_RETURN,
                NO_ERRORS_FOUND,
                NON_ACCEPTANCE_OF_R62_DISHONORED_RETURN,
                NON_PARTICIPANT_IN_IAT_PROGRAM,
                PERMISSIBLE_RETURN_ENTRY,
                PERMISSIBLE_RETURN_ENTRY_NOT_ACCEPTED,
                RDFI_NON_SETTLEMENT,
                RDFI_PARTICIPANT_IN_CHECK_TRUNCATION_PROGRAM,
                REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY,
                RETURN_NOT_A_DUPLICATE,
                RETURN_OF_ERRONEOUS_OR_REVERSING_DEBIT,
                RETURN_OF_IMPROPER_CREDIT_ENTRY,
                RETURN_OF_IMPROPER_DEBIT_ENTRY,
                RETURN_OF_XCK_ENTRY,
                SOURCE_DOCUMENT_PRESENTED_FOR_PAYMENT,
                STATE_LAW_AFFECTING_RCK_ACCEPTANCE,
                STOP_PAYMENT_ON_ITEM_RELATED_TO_RCK_ENTRY,
                STOP_PAYMENT_ON_SOURCE_DOCUMENT,
                TIMELY_ORIGINAL_RETURN,
                TRACE_NUMBER_ERROR,
                UNTIMELY_DISHONORED_RETURN,
                UNTIMELY_RETURN,
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
                LIMITED_PARTICIPATION_DFI,
                INCORRECTLY_CODED_OUTBOUND_INTERNATIONAL_PAYMENT,
                ACCOUNT_SOLD_TO_ANOTHER_DFI,
                ADDENDA_ERROR,
                BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED,
                CUSTOMER_ADVISED_NOT_WITHIN_AUTHORIZATION_TERMS,
                CORRECTED_RETURN,
                DUPLICATE_ENTRY,
                DUPLICATE_RETURN,
                ENR_DUPLICATE_ENROLLMENT,
                ENR_INVALID_DFI_ACCOUNT_NUMBER,
                ENR_INVALID_INDIVIDUAL_ID_NUMBER,
                ENR_INVALID_REPRESENTATIVE_PAYEE_INDICATOR,
                ENR_INVALID_TRANSACTION_CODE,
                ENR_RETURN_OF_ENR_ENTRY,
                ENR_ROUTING_NUMBER_CHECK_DIGIT_ERROR,
                ENTRY_NOT_PROCESSED_BY_GATEWAY,
                FIELD_ERROR,
                FOREIGN_RECEIVING_DFI_UNABLE_TO_SETTLE,
                IAT_ENTRY_CODING_ERROR,
                IMPROPER_EFFECTIVE_ENTRY_DATE,
                IMPROPER_SOURCE_DOCUMENT_SOURCE_DOCUMENT_PRESENTED,
                INVALID_COMPANY_ID,
                INVALID_FOREIGN_RECEIVING_DFI_IDENTIFICATION,
                INVALID_INDIVIDUAL_ID_NUMBER,
                ITEM_AND_RCK_ENTRY_PRESENTED_FOR_PAYMENT,
                ITEM_RELATED_TO_RCK_ENTRY_IS_INELIGIBLE,
                MANDATORY_FIELD_ERROR,
                MISROUTED_DISHONORED_RETURN,
                MISROUTED_RETURN,
                NO_ERRORS_FOUND,
                NON_ACCEPTANCE_OF_R62_DISHONORED_RETURN,
                NON_PARTICIPANT_IN_IAT_PROGRAM,
                PERMISSIBLE_RETURN_ENTRY,
                PERMISSIBLE_RETURN_ENTRY_NOT_ACCEPTED,
                RDFI_NON_SETTLEMENT,
                RDFI_PARTICIPANT_IN_CHECK_TRUNCATION_PROGRAM,
                REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY,
                RETURN_NOT_A_DUPLICATE,
                RETURN_OF_ERRONEOUS_OR_REVERSING_DEBIT,
                RETURN_OF_IMPROPER_CREDIT_ENTRY,
                RETURN_OF_IMPROPER_DEBIT_ENTRY,
                RETURN_OF_XCK_ENTRY,
                SOURCE_DOCUMENT_PRESENTED_FOR_PAYMENT,
                STATE_LAW_AFFECTING_RCK_ACCEPTANCE,
                STOP_PAYMENT_ON_ITEM_RELATED_TO_RCK_ENTRY,
                STOP_PAYMENT_ON_SOURCE_DOCUMENT,
                TIMELY_ORIGINAL_RETURN,
                TRACE_NUMBER_ERROR,
                UNTIMELY_DISHONORED_RETURN,
                UNTIMELY_RETURN,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    INSUFFICIENT_FUND -> Value.INSUFFICIENT_FUND
                    NO_ACCOUNT -> Value.NO_ACCOUNT
                    ACCOUNT_CLOSED -> Value.ACCOUNT_CLOSED
                    INVALID_ACCOUNT_NUMBER_STRUCTURE -> Value.INVALID_ACCOUNT_NUMBER_STRUCTURE
                    ACCOUNT_FROZEN_ENTRY_RETURNED_PER_OFAC_INSTRUCTION ->
                        Value.ACCOUNT_FROZEN_ENTRY_RETURNED_PER_OFAC_INSTRUCTION
                    CREDIT_ENTRY_REFUSED_BY_RECEIVER -> Value.CREDIT_ENTRY_REFUSED_BY_RECEIVER
                    UNAUTHORIZED_DEBIT_TO_CONSUMER_ACCOUNT_USING_CORPORATE_SEC_CODE ->
                        Value.UNAUTHORIZED_DEBIT_TO_CONSUMER_ACCOUNT_USING_CORPORATE_SEC_CODE
                    CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED ->
                        Value.CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED
                    PAYMENT_STOPPED -> Value.PAYMENT_STOPPED
                    NON_TRANSACTION_ACCOUNT -> Value.NON_TRANSACTION_ACCOUNT
                    UNCOLLECTED_FUNDS -> Value.UNCOLLECTED_FUNDS
                    ROUTING_NUMBER_CHECK_DIGIT_ERROR -> Value.ROUTING_NUMBER_CHECK_DIGIT_ERROR
                    CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE ->
                        Value.CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE
                    AMOUNT_FIELD_ERROR -> Value.AMOUNT_FIELD_ERROR
                    AUTHORIZATION_REVOKED_BY_CUSTOMER -> Value.AUTHORIZATION_REVOKED_BY_CUSTOMER
                    INVALID_ACH_ROUTING_NUMBER -> Value.INVALID_ACH_ROUTING_NUMBER
                    FILE_RECORD_EDIT_CRITERIA -> Value.FILE_RECORD_EDIT_CRITERIA
                    ENR_INVALID_INDIVIDUAL_NAME -> Value.ENR_INVALID_INDIVIDUAL_NAME
                    RETURNED_PER_ODFI_REQUEST -> Value.RETURNED_PER_ODFI_REQUEST
                    LIMITED_PARTICIPATION_DFI -> Value.LIMITED_PARTICIPATION_DFI
                    INCORRECTLY_CODED_OUTBOUND_INTERNATIONAL_PAYMENT ->
                        Value.INCORRECTLY_CODED_OUTBOUND_INTERNATIONAL_PAYMENT
                    ACCOUNT_SOLD_TO_ANOTHER_DFI -> Value.ACCOUNT_SOLD_TO_ANOTHER_DFI
                    ADDENDA_ERROR -> Value.ADDENDA_ERROR
                    BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED ->
                        Value.BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED
                    CUSTOMER_ADVISED_NOT_WITHIN_AUTHORIZATION_TERMS ->
                        Value.CUSTOMER_ADVISED_NOT_WITHIN_AUTHORIZATION_TERMS
                    CORRECTED_RETURN -> Value.CORRECTED_RETURN
                    DUPLICATE_ENTRY -> Value.DUPLICATE_ENTRY
                    DUPLICATE_RETURN -> Value.DUPLICATE_RETURN
                    ENR_DUPLICATE_ENROLLMENT -> Value.ENR_DUPLICATE_ENROLLMENT
                    ENR_INVALID_DFI_ACCOUNT_NUMBER -> Value.ENR_INVALID_DFI_ACCOUNT_NUMBER
                    ENR_INVALID_INDIVIDUAL_ID_NUMBER -> Value.ENR_INVALID_INDIVIDUAL_ID_NUMBER
                    ENR_INVALID_REPRESENTATIVE_PAYEE_INDICATOR ->
                        Value.ENR_INVALID_REPRESENTATIVE_PAYEE_INDICATOR
                    ENR_INVALID_TRANSACTION_CODE -> Value.ENR_INVALID_TRANSACTION_CODE
                    ENR_RETURN_OF_ENR_ENTRY -> Value.ENR_RETURN_OF_ENR_ENTRY
                    ENR_ROUTING_NUMBER_CHECK_DIGIT_ERROR ->
                        Value.ENR_ROUTING_NUMBER_CHECK_DIGIT_ERROR
                    ENTRY_NOT_PROCESSED_BY_GATEWAY -> Value.ENTRY_NOT_PROCESSED_BY_GATEWAY
                    FIELD_ERROR -> Value.FIELD_ERROR
                    FOREIGN_RECEIVING_DFI_UNABLE_TO_SETTLE ->
                        Value.FOREIGN_RECEIVING_DFI_UNABLE_TO_SETTLE
                    IAT_ENTRY_CODING_ERROR -> Value.IAT_ENTRY_CODING_ERROR
                    IMPROPER_EFFECTIVE_ENTRY_DATE -> Value.IMPROPER_EFFECTIVE_ENTRY_DATE
                    IMPROPER_SOURCE_DOCUMENT_SOURCE_DOCUMENT_PRESENTED ->
                        Value.IMPROPER_SOURCE_DOCUMENT_SOURCE_DOCUMENT_PRESENTED
                    INVALID_COMPANY_ID -> Value.INVALID_COMPANY_ID
                    INVALID_FOREIGN_RECEIVING_DFI_IDENTIFICATION ->
                        Value.INVALID_FOREIGN_RECEIVING_DFI_IDENTIFICATION
                    INVALID_INDIVIDUAL_ID_NUMBER -> Value.INVALID_INDIVIDUAL_ID_NUMBER
                    ITEM_AND_RCK_ENTRY_PRESENTED_FOR_PAYMENT ->
                        Value.ITEM_AND_RCK_ENTRY_PRESENTED_FOR_PAYMENT
                    ITEM_RELATED_TO_RCK_ENTRY_IS_INELIGIBLE ->
                        Value.ITEM_RELATED_TO_RCK_ENTRY_IS_INELIGIBLE
                    MANDATORY_FIELD_ERROR -> Value.MANDATORY_FIELD_ERROR
                    MISROUTED_DISHONORED_RETURN -> Value.MISROUTED_DISHONORED_RETURN
                    MISROUTED_RETURN -> Value.MISROUTED_RETURN
                    NO_ERRORS_FOUND -> Value.NO_ERRORS_FOUND
                    NON_ACCEPTANCE_OF_R62_DISHONORED_RETURN ->
                        Value.NON_ACCEPTANCE_OF_R62_DISHONORED_RETURN
                    NON_PARTICIPANT_IN_IAT_PROGRAM -> Value.NON_PARTICIPANT_IN_IAT_PROGRAM
                    PERMISSIBLE_RETURN_ENTRY -> Value.PERMISSIBLE_RETURN_ENTRY
                    PERMISSIBLE_RETURN_ENTRY_NOT_ACCEPTED ->
                        Value.PERMISSIBLE_RETURN_ENTRY_NOT_ACCEPTED
                    RDFI_NON_SETTLEMENT -> Value.RDFI_NON_SETTLEMENT
                    RDFI_PARTICIPANT_IN_CHECK_TRUNCATION_PROGRAM ->
                        Value.RDFI_PARTICIPANT_IN_CHECK_TRUNCATION_PROGRAM
                    REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY ->
                        Value.REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY
                    RETURN_NOT_A_DUPLICATE -> Value.RETURN_NOT_A_DUPLICATE
                    RETURN_OF_ERRONEOUS_OR_REVERSING_DEBIT ->
                        Value.RETURN_OF_ERRONEOUS_OR_REVERSING_DEBIT
                    RETURN_OF_IMPROPER_CREDIT_ENTRY -> Value.RETURN_OF_IMPROPER_CREDIT_ENTRY
                    RETURN_OF_IMPROPER_DEBIT_ENTRY -> Value.RETURN_OF_IMPROPER_DEBIT_ENTRY
                    RETURN_OF_XCK_ENTRY -> Value.RETURN_OF_XCK_ENTRY
                    SOURCE_DOCUMENT_PRESENTED_FOR_PAYMENT ->
                        Value.SOURCE_DOCUMENT_PRESENTED_FOR_PAYMENT
                    STATE_LAW_AFFECTING_RCK_ACCEPTANCE -> Value.STATE_LAW_AFFECTING_RCK_ACCEPTANCE
                    STOP_PAYMENT_ON_ITEM_RELATED_TO_RCK_ENTRY ->
                        Value.STOP_PAYMENT_ON_ITEM_RELATED_TO_RCK_ENTRY
                    STOP_PAYMENT_ON_SOURCE_DOCUMENT -> Value.STOP_PAYMENT_ON_SOURCE_DOCUMENT
                    TIMELY_ORIGINAL_RETURN -> Value.TIMELY_ORIGINAL_RETURN
                    TRACE_NUMBER_ERROR -> Value.TRACE_NUMBER_ERROR
                    UNTIMELY_DISHONORED_RETURN -> Value.UNTIMELY_DISHONORED_RETURN
                    UNTIMELY_RETURN -> Value.UNTIMELY_RETURN
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    INSUFFICIENT_FUND -> Known.INSUFFICIENT_FUND
                    NO_ACCOUNT -> Known.NO_ACCOUNT
                    ACCOUNT_CLOSED -> Known.ACCOUNT_CLOSED
                    INVALID_ACCOUNT_NUMBER_STRUCTURE -> Known.INVALID_ACCOUNT_NUMBER_STRUCTURE
                    ACCOUNT_FROZEN_ENTRY_RETURNED_PER_OFAC_INSTRUCTION ->
                        Known.ACCOUNT_FROZEN_ENTRY_RETURNED_PER_OFAC_INSTRUCTION
                    CREDIT_ENTRY_REFUSED_BY_RECEIVER -> Known.CREDIT_ENTRY_REFUSED_BY_RECEIVER
                    UNAUTHORIZED_DEBIT_TO_CONSUMER_ACCOUNT_USING_CORPORATE_SEC_CODE ->
                        Known.UNAUTHORIZED_DEBIT_TO_CONSUMER_ACCOUNT_USING_CORPORATE_SEC_CODE
                    CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED ->
                        Known.CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED
                    PAYMENT_STOPPED -> Known.PAYMENT_STOPPED
                    NON_TRANSACTION_ACCOUNT -> Known.NON_TRANSACTION_ACCOUNT
                    UNCOLLECTED_FUNDS -> Known.UNCOLLECTED_FUNDS
                    ROUTING_NUMBER_CHECK_DIGIT_ERROR -> Known.ROUTING_NUMBER_CHECK_DIGIT_ERROR
                    CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE ->
                        Known.CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE
                    AMOUNT_FIELD_ERROR -> Known.AMOUNT_FIELD_ERROR
                    AUTHORIZATION_REVOKED_BY_CUSTOMER -> Known.AUTHORIZATION_REVOKED_BY_CUSTOMER
                    INVALID_ACH_ROUTING_NUMBER -> Known.INVALID_ACH_ROUTING_NUMBER
                    FILE_RECORD_EDIT_CRITERIA -> Known.FILE_RECORD_EDIT_CRITERIA
                    ENR_INVALID_INDIVIDUAL_NAME -> Known.ENR_INVALID_INDIVIDUAL_NAME
                    RETURNED_PER_ODFI_REQUEST -> Known.RETURNED_PER_ODFI_REQUEST
                    LIMITED_PARTICIPATION_DFI -> Known.LIMITED_PARTICIPATION_DFI
                    INCORRECTLY_CODED_OUTBOUND_INTERNATIONAL_PAYMENT ->
                        Known.INCORRECTLY_CODED_OUTBOUND_INTERNATIONAL_PAYMENT
                    ACCOUNT_SOLD_TO_ANOTHER_DFI -> Known.ACCOUNT_SOLD_TO_ANOTHER_DFI
                    ADDENDA_ERROR -> Known.ADDENDA_ERROR
                    BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED ->
                        Known.BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED
                    CUSTOMER_ADVISED_NOT_WITHIN_AUTHORIZATION_TERMS ->
                        Known.CUSTOMER_ADVISED_NOT_WITHIN_AUTHORIZATION_TERMS
                    CORRECTED_RETURN -> Known.CORRECTED_RETURN
                    DUPLICATE_ENTRY -> Known.DUPLICATE_ENTRY
                    DUPLICATE_RETURN -> Known.DUPLICATE_RETURN
                    ENR_DUPLICATE_ENROLLMENT -> Known.ENR_DUPLICATE_ENROLLMENT
                    ENR_INVALID_DFI_ACCOUNT_NUMBER -> Known.ENR_INVALID_DFI_ACCOUNT_NUMBER
                    ENR_INVALID_INDIVIDUAL_ID_NUMBER -> Known.ENR_INVALID_INDIVIDUAL_ID_NUMBER
                    ENR_INVALID_REPRESENTATIVE_PAYEE_INDICATOR ->
                        Known.ENR_INVALID_REPRESENTATIVE_PAYEE_INDICATOR
                    ENR_INVALID_TRANSACTION_CODE -> Known.ENR_INVALID_TRANSACTION_CODE
                    ENR_RETURN_OF_ENR_ENTRY -> Known.ENR_RETURN_OF_ENR_ENTRY
                    ENR_ROUTING_NUMBER_CHECK_DIGIT_ERROR ->
                        Known.ENR_ROUTING_NUMBER_CHECK_DIGIT_ERROR
                    ENTRY_NOT_PROCESSED_BY_GATEWAY -> Known.ENTRY_NOT_PROCESSED_BY_GATEWAY
                    FIELD_ERROR -> Known.FIELD_ERROR
                    FOREIGN_RECEIVING_DFI_UNABLE_TO_SETTLE ->
                        Known.FOREIGN_RECEIVING_DFI_UNABLE_TO_SETTLE
                    IAT_ENTRY_CODING_ERROR -> Known.IAT_ENTRY_CODING_ERROR
                    IMPROPER_EFFECTIVE_ENTRY_DATE -> Known.IMPROPER_EFFECTIVE_ENTRY_DATE
                    IMPROPER_SOURCE_DOCUMENT_SOURCE_DOCUMENT_PRESENTED ->
                        Known.IMPROPER_SOURCE_DOCUMENT_SOURCE_DOCUMENT_PRESENTED
                    INVALID_COMPANY_ID -> Known.INVALID_COMPANY_ID
                    INVALID_FOREIGN_RECEIVING_DFI_IDENTIFICATION ->
                        Known.INVALID_FOREIGN_RECEIVING_DFI_IDENTIFICATION
                    INVALID_INDIVIDUAL_ID_NUMBER -> Known.INVALID_INDIVIDUAL_ID_NUMBER
                    ITEM_AND_RCK_ENTRY_PRESENTED_FOR_PAYMENT ->
                        Known.ITEM_AND_RCK_ENTRY_PRESENTED_FOR_PAYMENT
                    ITEM_RELATED_TO_RCK_ENTRY_IS_INELIGIBLE ->
                        Known.ITEM_RELATED_TO_RCK_ENTRY_IS_INELIGIBLE
                    MANDATORY_FIELD_ERROR -> Known.MANDATORY_FIELD_ERROR
                    MISROUTED_DISHONORED_RETURN -> Known.MISROUTED_DISHONORED_RETURN
                    MISROUTED_RETURN -> Known.MISROUTED_RETURN
                    NO_ERRORS_FOUND -> Known.NO_ERRORS_FOUND
                    NON_ACCEPTANCE_OF_R62_DISHONORED_RETURN ->
                        Known.NON_ACCEPTANCE_OF_R62_DISHONORED_RETURN
                    NON_PARTICIPANT_IN_IAT_PROGRAM -> Known.NON_PARTICIPANT_IN_IAT_PROGRAM
                    PERMISSIBLE_RETURN_ENTRY -> Known.PERMISSIBLE_RETURN_ENTRY
                    PERMISSIBLE_RETURN_ENTRY_NOT_ACCEPTED ->
                        Known.PERMISSIBLE_RETURN_ENTRY_NOT_ACCEPTED
                    RDFI_NON_SETTLEMENT -> Known.RDFI_NON_SETTLEMENT
                    RDFI_PARTICIPANT_IN_CHECK_TRUNCATION_PROGRAM ->
                        Known.RDFI_PARTICIPANT_IN_CHECK_TRUNCATION_PROGRAM
                    REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY ->
                        Known.REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY
                    RETURN_NOT_A_DUPLICATE -> Known.RETURN_NOT_A_DUPLICATE
                    RETURN_OF_ERRONEOUS_OR_REVERSING_DEBIT ->
                        Known.RETURN_OF_ERRONEOUS_OR_REVERSING_DEBIT
                    RETURN_OF_IMPROPER_CREDIT_ENTRY -> Known.RETURN_OF_IMPROPER_CREDIT_ENTRY
                    RETURN_OF_IMPROPER_DEBIT_ENTRY -> Known.RETURN_OF_IMPROPER_DEBIT_ENTRY
                    RETURN_OF_XCK_ENTRY -> Known.RETURN_OF_XCK_ENTRY
                    SOURCE_DOCUMENT_PRESENTED_FOR_PAYMENT ->
                        Known.SOURCE_DOCUMENT_PRESENTED_FOR_PAYMENT
                    STATE_LAW_AFFECTING_RCK_ACCEPTANCE -> Known.STATE_LAW_AFFECTING_RCK_ACCEPTANCE
                    STOP_PAYMENT_ON_ITEM_RELATED_TO_RCK_ENTRY ->
                        Known.STOP_PAYMENT_ON_ITEM_RELATED_TO_RCK_ENTRY
                    STOP_PAYMENT_ON_SOURCE_DOCUMENT -> Known.STOP_PAYMENT_ON_SOURCE_DOCUMENT
                    TIMELY_ORIGINAL_RETURN -> Known.TIMELY_ORIGINAL_RETURN
                    TRACE_NUMBER_ERROR -> Known.TRACE_NUMBER_ERROR
                    UNTIMELY_DISHONORED_RETURN -> Known.UNTIMELY_DISHONORED_RETURN
                    UNTIMELY_RETURN -> Known.UNTIMELY_RETURN
                    else -> throw IncreaseInvalidDataException("Unknown ReturnReasonCode: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Status && this.value == other.value
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

        fun value(): Value =
            when (this) {
                PENDING_SUBMITTING -> Value.PENDING_SUBMITTING
                REQUIRES_ATTENTION -> Value.REQUIRES_ATTENTION
                RETURNED -> Value.RETURNED
                SUBMITTED -> Value.SUBMITTED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                PENDING_SUBMITTING -> Known.PENDING_SUBMITTING
                REQUIRES_ATTENTION -> Known.REQUIRES_ATTENTION
                RETURNED -> Known.RETURNED
                SUBMITTED -> Known.SUBMITTED
                else -> throw IncreaseInvalidDataException("Unknown Status: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

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

        fun value(): Value =
            when (this) {
                ACH_PRENOTIFICATION -> Value.ACH_PRENOTIFICATION
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ACH_PRENOTIFICATION -> Known.ACH_PRENOTIFICATION
                else -> throw IncreaseInvalidDataException("Unknown Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
