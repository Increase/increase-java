// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.increase.api.core.Enum
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.immutableEmptyMap
import com.increase.api.core.toImmutable
import com.increase.api.errors.IncreaseInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

/**
 * ACH Prenotifications are one way you can verify account and routing numbers by Automated Clearing
 * House (ACH).
 */
@NoAutoDetect
class AchPrenotification
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("account_number")
    @ExcludeMissing
    private val accountNumber: JsonField<String> = JsonMissing.of(),
    @JsonProperty("addendum")
    @ExcludeMissing
    private val addendum: JsonField<String> = JsonMissing.of(),
    @JsonProperty("company_descriptive_date")
    @ExcludeMissing
    private val companyDescriptiveDate: JsonField<String> = JsonMissing.of(),
    @JsonProperty("company_discretionary_data")
    @ExcludeMissing
    private val companyDiscretionaryData: JsonField<String> = JsonMissing.of(),
    @JsonProperty("company_entry_description")
    @ExcludeMissing
    private val companyEntryDescription: JsonField<String> = JsonMissing.of(),
    @JsonProperty("company_name")
    @ExcludeMissing
    private val companyName: JsonField<String> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("credit_debit_indicator")
    @ExcludeMissing
    private val creditDebitIndicator: JsonField<CreditDebitIndicator> = JsonMissing.of(),
    @JsonProperty("effective_date")
    @ExcludeMissing
    private val effectiveDate: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("idempotency_key")
    @ExcludeMissing
    private val idempotencyKey: JsonField<String> = JsonMissing.of(),
    @JsonProperty("notifications_of_change")
    @ExcludeMissing
    private val notificationsOfChange: JsonField<List<NotificationsOfChange>> = JsonMissing.of(),
    @JsonProperty("prenotification_return")
    @ExcludeMissing
    private val prenotificationReturn: JsonField<PrenotificationReturn> = JsonMissing.of(),
    @JsonProperty("routing_number")
    @ExcludeMissing
    private val routingNumber: JsonField<String> = JsonMissing.of(),
    @JsonProperty("status")
    @ExcludeMissing
    private val status: JsonField<Status> = JsonMissing.of(),
    @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

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

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
     * prenotification was created.
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /** If the notification is for a future credit or debit. */
    fun creditDebitIndicator(): Optional<CreditDebitIndicator> =
        Optional.ofNullable(creditDebitIndicator.getNullable("credit_debit_indicator"))

    /** The effective date in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format. */
    fun effectiveDate(): Optional<OffsetDateTime> =
        Optional.ofNullable(effectiveDate.getNullable("effective_date"))

    /**
     * The idempotency key you chose for this object. This value is unique across Increase and is
     * used to ensure that a request is only processed once. Learn more about
     * [idempotency](https://increase.com/documentation/idempotency-keys).
     */
    fun idempotencyKey(): Optional<String> =
        Optional.ofNullable(idempotencyKey.getNullable("idempotency_key"))

    /**
     * If the receiving bank notifies that future transfers should use different details, this will
     * contain those details.
     */
    fun notificationsOfChange(): List<NotificationsOfChange> =
        notificationsOfChange.getRequired("notifications_of_change")

    /** If your prenotification is returned, this will contain details of the return. */
    fun prenotificationReturn(): Optional<PrenotificationReturn> =
        Optional.ofNullable(prenotificationReturn.getNullable("prenotification_return"))

    /** The American Bankers' Association (ABA) Routing Transit Number (RTN). */
    fun routingNumber(): String = routingNumber.getRequired("routing_number")

    /** The lifecycle status of the ACH Prenotification. */
    fun status(): Status = status.getRequired("status")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `ach_prenotification`.
     */
    fun type(): Type = type.getRequired("type")

    /** The ACH Prenotification's identifier. */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /** The destination account number. */
    @JsonProperty("account_number")
    @ExcludeMissing
    fun _accountNumber(): JsonField<String> = accountNumber

    /** Additional information for the recipient. */
    @JsonProperty("addendum") @ExcludeMissing fun _addendum(): JsonField<String> = addendum

    /** The description of the date of the notification. */
    @JsonProperty("company_descriptive_date")
    @ExcludeMissing
    fun _companyDescriptiveDate(): JsonField<String> = companyDescriptiveDate

    /** Optional data associated with the notification. */
    @JsonProperty("company_discretionary_data")
    @ExcludeMissing
    fun _companyDiscretionaryData(): JsonField<String> = companyDiscretionaryData

    /** The description of the notification. */
    @JsonProperty("company_entry_description")
    @ExcludeMissing
    fun _companyEntryDescription(): JsonField<String> = companyEntryDescription

    /** The name by which you know the company. */
    @JsonProperty("company_name")
    @ExcludeMissing
    fun _companyName(): JsonField<String> = companyName

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
     * prenotification was created.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /** If the notification is for a future credit or debit. */
    @JsonProperty("credit_debit_indicator")
    @ExcludeMissing
    fun _creditDebitIndicator(): JsonField<CreditDebitIndicator> = creditDebitIndicator

    /** The effective date in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format. */
    @JsonProperty("effective_date")
    @ExcludeMissing
    fun _effectiveDate(): JsonField<OffsetDateTime> = effectiveDate

    /**
     * The idempotency key you chose for this object. This value is unique across Increase and is
     * used to ensure that a request is only processed once. Learn more about
     * [idempotency](https://increase.com/documentation/idempotency-keys).
     */
    @JsonProperty("idempotency_key")
    @ExcludeMissing
    fun _idempotencyKey(): JsonField<String> = idempotencyKey

    /**
     * If the receiving bank notifies that future transfers should use different details, this will
     * contain those details.
     */
    @JsonProperty("notifications_of_change")
    @ExcludeMissing
    fun _notificationsOfChange(): JsonField<List<NotificationsOfChange>> = notificationsOfChange

    /** If your prenotification is returned, this will contain details of the return. */
    @JsonProperty("prenotification_return")
    @ExcludeMissing
    fun _prenotificationReturn(): JsonField<PrenotificationReturn> = prenotificationReturn

    /** The American Bankers' Association (ABA) Routing Transit Number (RTN). */
    @JsonProperty("routing_number")
    @ExcludeMissing
    fun _routingNumber(): JsonField<String> = routingNumber

    /** The lifecycle status of the ACH Prenotification. */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * A constant representing the object's type. For this resource it will always be
     * `ach_prenotification`.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): AchPrenotification = apply {
        if (validated) {
            return@apply
        }

        id()
        accountNumber()
        addendum()
        companyDescriptiveDate()
        companyDiscretionaryData()
        companyEntryDescription()
        companyName()
        createdAt()
        creditDebitIndicator()
        effectiveDate()
        idempotencyKey()
        notificationsOfChange().forEach { it.validate() }
        prenotificationReturn().ifPresent { it.validate() }
        routingNumber()
        status()
        type()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String>? = null
        private var accountNumber: JsonField<String>? = null
        private var addendum: JsonField<String>? = null
        private var companyDescriptiveDate: JsonField<String>? = null
        private var companyDiscretionaryData: JsonField<String>? = null
        private var companyEntryDescription: JsonField<String>? = null
        private var companyName: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var creditDebitIndicator: JsonField<CreditDebitIndicator>? = null
        private var effectiveDate: JsonField<OffsetDateTime>? = null
        private var idempotencyKey: JsonField<String>? = null
        private var notificationsOfChange: JsonField<MutableList<NotificationsOfChange>>? = null
        private var prenotificationReturn: JsonField<PrenotificationReturn>? = null
        private var routingNumber: JsonField<String>? = null
        private var status: JsonField<Status>? = null
        private var type: JsonField<Type>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(achPrenotification: AchPrenotification) = apply {
            id = achPrenotification.id
            accountNumber = achPrenotification.accountNumber
            addendum = achPrenotification.addendum
            companyDescriptiveDate = achPrenotification.companyDescriptiveDate
            companyDiscretionaryData = achPrenotification.companyDiscretionaryData
            companyEntryDescription = achPrenotification.companyEntryDescription
            companyName = achPrenotification.companyName
            createdAt = achPrenotification.createdAt
            creditDebitIndicator = achPrenotification.creditDebitIndicator
            effectiveDate = achPrenotification.effectiveDate
            idempotencyKey = achPrenotification.idempotencyKey
            notificationsOfChange =
                achPrenotification.notificationsOfChange.map { it.toMutableList() }
            prenotificationReturn = achPrenotification.prenotificationReturn
            routingNumber = achPrenotification.routingNumber
            status = achPrenotification.status
            type = achPrenotification.type
            additionalProperties = achPrenotification.additionalProperties.toMutableMap()
        }

        /** The ACH Prenotification's identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The ACH Prenotification's identifier. */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The destination account number. */
        fun accountNumber(accountNumber: String) = accountNumber(JsonField.of(accountNumber))

        /** The destination account number. */
        fun accountNumber(accountNumber: JsonField<String>) = apply {
            this.accountNumber = accountNumber
        }

        /** Additional information for the recipient. */
        fun addendum(addendum: String?) = addendum(JsonField.ofNullable(addendum))

        /** Additional information for the recipient. */
        fun addendum(addendum: Optional<String>) = addendum(addendum.orElse(null))

        /** Additional information for the recipient. */
        fun addendum(addendum: JsonField<String>) = apply { this.addendum = addendum }

        /** The description of the date of the notification. */
        fun companyDescriptiveDate(companyDescriptiveDate: String?) =
            companyDescriptiveDate(JsonField.ofNullable(companyDescriptiveDate))

        /** The description of the date of the notification. */
        fun companyDescriptiveDate(companyDescriptiveDate: Optional<String>) =
            companyDescriptiveDate(companyDescriptiveDate.orElse(null))

        /** The description of the date of the notification. */
        fun companyDescriptiveDate(companyDescriptiveDate: JsonField<String>) = apply {
            this.companyDescriptiveDate = companyDescriptiveDate
        }

        /** Optional data associated with the notification. */
        fun companyDiscretionaryData(companyDiscretionaryData: String?) =
            companyDiscretionaryData(JsonField.ofNullable(companyDiscretionaryData))

        /** Optional data associated with the notification. */
        fun companyDiscretionaryData(companyDiscretionaryData: Optional<String>) =
            companyDiscretionaryData(companyDiscretionaryData.orElse(null))

        /** Optional data associated with the notification. */
        fun companyDiscretionaryData(companyDiscretionaryData: JsonField<String>) = apply {
            this.companyDiscretionaryData = companyDiscretionaryData
        }

        /** The description of the notification. */
        fun companyEntryDescription(companyEntryDescription: String?) =
            companyEntryDescription(JsonField.ofNullable(companyEntryDescription))

        /** The description of the notification. */
        fun companyEntryDescription(companyEntryDescription: Optional<String>) =
            companyEntryDescription(companyEntryDescription.orElse(null))

        /** The description of the notification. */
        fun companyEntryDescription(companyEntryDescription: JsonField<String>) = apply {
            this.companyEntryDescription = companyEntryDescription
        }

        /** The name by which you know the company. */
        fun companyName(companyName: String?) = companyName(JsonField.ofNullable(companyName))

        /** The name by which you know the company. */
        fun companyName(companyName: Optional<String>) = companyName(companyName.orElse(null))

        /** The name by which you know the company. */
        fun companyName(companyName: JsonField<String>) = apply { this.companyName = companyName }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
         * prenotification was created.
         */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
         * prenotification was created.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** If the notification is for a future credit or debit. */
        fun creditDebitIndicator(creditDebitIndicator: CreditDebitIndicator?) =
            creditDebitIndicator(JsonField.ofNullable(creditDebitIndicator))

        /** If the notification is for a future credit or debit. */
        fun creditDebitIndicator(creditDebitIndicator: Optional<CreditDebitIndicator>) =
            creditDebitIndicator(creditDebitIndicator.orElse(null))

        /** If the notification is for a future credit or debit. */
        fun creditDebitIndicator(creditDebitIndicator: JsonField<CreditDebitIndicator>) = apply {
            this.creditDebitIndicator = creditDebitIndicator
        }

        /** The effective date in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format. */
        fun effectiveDate(effectiveDate: OffsetDateTime?) =
            effectiveDate(JsonField.ofNullable(effectiveDate))

        /** The effective date in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format. */
        fun effectiveDate(effectiveDate: Optional<OffsetDateTime>) =
            effectiveDate(effectiveDate.orElse(null))

        /** The effective date in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format. */
        fun effectiveDate(effectiveDate: JsonField<OffsetDateTime>) = apply {
            this.effectiveDate = effectiveDate
        }

        /**
         * The idempotency key you chose for this object. This value is unique across Increase and
         * is used to ensure that a request is only processed once. Learn more about
         * [idempotency](https://increase.com/documentation/idempotency-keys).
         */
        fun idempotencyKey(idempotencyKey: String?) =
            idempotencyKey(JsonField.ofNullable(idempotencyKey))

        /**
         * The idempotency key you chose for this object. This value is unique across Increase and
         * is used to ensure that a request is only processed once. Learn more about
         * [idempotency](https://increase.com/documentation/idempotency-keys).
         */
        fun idempotencyKey(idempotencyKey: Optional<String>) =
            idempotencyKey(idempotencyKey.orElse(null))

        /**
         * The idempotency key you chose for this object. This value is unique across Increase and
         * is used to ensure that a request is only processed once. Learn more about
         * [idempotency](https://increase.com/documentation/idempotency-keys).
         */
        fun idempotencyKey(idempotencyKey: JsonField<String>) = apply {
            this.idempotencyKey = idempotencyKey
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
        fun notificationsOfChange(notificationsOfChange: JsonField<List<NotificationsOfChange>>) =
            apply {
                this.notificationsOfChange = notificationsOfChange.map { it.toMutableList() }
            }

        /**
         * If the receiving bank notifies that future transfers should use different details, this
         * will contain those details.
         */
        fun addNotificationsOfChange(notificationsOfChange: NotificationsOfChange) = apply {
            this.notificationsOfChange =
                (this.notificationsOfChange ?: JsonField.of(mutableListOf())).apply {
                    asKnown()
                        .orElseThrow {
                            IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            )
                        }
                        .add(notificationsOfChange)
                }
        }

        /** If your prenotification is returned, this will contain details of the return. */
        fun prenotificationReturn(prenotificationReturn: PrenotificationReturn?) =
            prenotificationReturn(JsonField.ofNullable(prenotificationReturn))

        /** If your prenotification is returned, this will contain details of the return. */
        fun prenotificationReturn(prenotificationReturn: Optional<PrenotificationReturn>) =
            prenotificationReturn(prenotificationReturn.orElse(null))

        /** If your prenotification is returned, this will contain details of the return. */
        fun prenotificationReturn(prenotificationReturn: JsonField<PrenotificationReturn>) = apply {
            this.prenotificationReturn = prenotificationReturn
        }

        /** The American Bankers' Association (ABA) Routing Transit Number (RTN). */
        fun routingNumber(routingNumber: String) = routingNumber(JsonField.of(routingNumber))

        /** The American Bankers' Association (ABA) Routing Transit Number (RTN). */
        fun routingNumber(routingNumber: JsonField<String>) = apply {
            this.routingNumber = routingNumber
        }

        /** The lifecycle status of the ACH Prenotification. */
        fun status(status: Status) = status(JsonField.of(status))

        /** The lifecycle status of the ACH Prenotification. */
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

        fun build(): AchPrenotification =
            AchPrenotification(
                checkNotNull(id) { "`id` is required but was not set" },
                checkNotNull(accountNumber) { "`accountNumber` is required but was not set" },
                checkNotNull(addendum) { "`addendum` is required but was not set" },
                checkNotNull(companyDescriptiveDate) {
                    "`companyDescriptiveDate` is required but was not set"
                },
                checkNotNull(companyDiscretionaryData) {
                    "`companyDiscretionaryData` is required but was not set"
                },
                checkNotNull(companyEntryDescription) {
                    "`companyEntryDescription` is required but was not set"
                },
                checkNotNull(companyName) { "`companyName` is required but was not set" },
                checkNotNull(createdAt) { "`createdAt` is required but was not set" },
                checkNotNull(creditDebitIndicator) {
                    "`creditDebitIndicator` is required but was not set"
                },
                checkNotNull(effectiveDate) { "`effectiveDate` is required but was not set" },
                checkNotNull(idempotencyKey) { "`idempotencyKey` is required but was not set" },
                checkNotNull(notificationsOfChange) {
                        "`notificationsOfChange` is required but was not set"
                    }
                    .map { it.toImmutable() },
                checkNotNull(prenotificationReturn) {
                    "`prenotificationReturn` is required but was not set"
                },
                checkNotNull(routingNumber) { "`routingNumber` is required but was not set" },
                checkNotNull(status) { "`status` is required but was not set" },
                checkNotNull(type) { "`type` is required but was not set" },
                additionalProperties.toImmutable(),
            )
    }

    class CreditDebitIndicator
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val CREDIT = of("credit")

            @JvmField val DEBIT = of("debit")

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CreditDebitIndicator && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    @NoAutoDetect
    class NotificationsOfChange
    @JsonCreator
    private constructor(
        @JsonProperty("change_code")
        @ExcludeMissing
        private val changeCode: JsonField<ChangeCode> = JsonMissing.of(),
        @JsonProperty("corrected_data")
        @ExcludeMissing
        private val correctedData: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

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
        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        /**
         * The required type of change that is being signaled by the receiving financial
         * institution.
         */
        @JsonProperty("change_code")
        @ExcludeMissing
        fun _changeCode(): JsonField<ChangeCode> = changeCode

        /**
         * The corrected data that should be used in future ACHs to this account. This may contain
         * the suggested new account number or routing number. When the `change_code` is
         * `incorrect_transaction_code`, this field contains an integer. Numbers starting with a 2
         * encourage changing the `funding` parameter to checking; numbers starting with a 3
         * encourage changing to savings.
         */
        @JsonProperty("corrected_data")
        @ExcludeMissing
        fun _correctedData(): JsonField<String> = correctedData

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
         * notification occurred.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): NotificationsOfChange = apply {
            if (validated) {
                return@apply
            }

            changeCode()
            correctedData()
            createdAt()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var changeCode: JsonField<ChangeCode>? = null
            private var correctedData: JsonField<String>? = null
            private var createdAt: JsonField<OffsetDateTime>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(notificationsOfChange: NotificationsOfChange) = apply {
                changeCode = notificationsOfChange.changeCode
                correctedData = notificationsOfChange.correctedData
                createdAt = notificationsOfChange.createdAt
                additionalProperties = notificationsOfChange.additionalProperties.toMutableMap()
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
            fun correctedData(correctedData: JsonField<String>) = apply {
                this.correctedData = correctedData
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
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
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

            fun build(): NotificationsOfChange =
                NotificationsOfChange(
                    checkNotNull(changeCode) { "`changeCode` is required but was not set" },
                    checkNotNull(correctedData) { "`correctedData` is required but was not set" },
                    checkNotNull(createdAt) { "`createdAt` is required but was not set" },
                    additionalProperties.toImmutable(),
                )
        }

        class ChangeCode
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val INCORRECT_ACCOUNT_NUMBER = of("incorrect_account_number")

                @JvmField val INCORRECT_ROUTING_NUMBER = of("incorrect_routing_number")

                @JvmField
                val INCORRECT_ROUTING_NUMBER_AND_ACCOUNT_NUMBER =
                    of("incorrect_routing_number_and_account_number")

                @JvmField val INCORRECT_TRANSACTION_CODE = of("incorrect_transaction_code")

                @JvmField
                val INCORRECT_ACCOUNT_NUMBER_AND_TRANSACTION_CODE =
                    of("incorrect_account_number_and_transaction_code")

                @JvmField
                val INCORRECT_ROUTING_NUMBER_ACCOUNT_NUMBER_AND_TRANSACTION_CODE =
                    of("incorrect_routing_number_account_number_and_transaction_code")

                @JvmField
                val INCORRECT_RECEIVING_DEPOSITORY_FINANCIAL_INSTITUTION_IDENTIFICATION =
                    of("incorrect_receiving_depository_financial_institution_identification")

                @JvmField
                val INCORRECT_INDIVIDUAL_IDENTIFICATION_NUMBER =
                    of("incorrect_individual_identification_number")

                @JvmField val ADDENDA_FORMAT_ERROR = of("addenda_format_error")

                @JvmField
                val INCORRECT_STANDARD_ENTRY_CLASS_CODE_FOR_OUTBOUND_INTERNATIONAL_PAYMENT =
                    of("incorrect_standard_entry_class_code_for_outbound_international_payment")

                @JvmField
                val MISROUTED_NOTIFICATION_OF_CHANGE = of("misrouted_notification_of_change")

                @JvmField val INCORRECT_TRACE_NUMBER = of("incorrect_trace_number")

                @JvmField
                val INCORRECT_COMPANY_IDENTIFICATION_NUMBER =
                    of("incorrect_company_identification_number")

                @JvmField
                val INCORRECT_IDENTIFICATION_NUMBER = of("incorrect_identification_number")

                @JvmField
                val INCORRECTLY_FORMATTED_CORRECTED_DATA =
                    of("incorrectly_formatted_corrected_data")

                @JvmField val INCORRECT_DISCRETIONARY_DATA = of("incorrect_discretionary_data")

                @JvmField
                val ROUTING_NUMBER_NOT_FROM_ORIGINAL_ENTRY_DETAIL_RECORD =
                    of("routing_number_not_from_original_entry_detail_record")

                @JvmField
                val DEPOSITORY_FINANCIAL_INSTITUTION_ACCOUNT_NUMBER_NOT_FROM_ORIGINAL_ENTRY_DETAIL_RECORD =
                    of(
                        "depository_financial_institution_account_number_not_from_original_entry_detail_record"
                    )

                @JvmField
                val INCORRECT_TRANSACTION_CODE_BY_ORIGINATING_DEPOSITORY_FINANCIAL_INSTITUTION =
                    of("incorrect_transaction_code_by_originating_depository_financial_institution")

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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ChangeCode && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is NotificationsOfChange && changeCode == other.changeCode && correctedData == other.correctedData && createdAt == other.createdAt && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(changeCode, correctedData, createdAt, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "NotificationsOfChange{changeCode=$changeCode, correctedData=$correctedData, createdAt=$createdAt, additionalProperties=$additionalProperties}"
    }

    /** If your prenotification is returned, this will contain details of the return. */
    @NoAutoDetect
    class PrenotificationReturn
    @JsonCreator
    private constructor(
        @JsonProperty("created_at")
        @ExcludeMissing
        private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("return_reason_code")
        @ExcludeMissing
        private val returnReasonCode: JsonField<ReturnReasonCode> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

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
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /** Why the Prenotification was returned. */
        @JsonProperty("return_reason_code")
        @ExcludeMissing
        fun _returnReasonCode(): JsonField<ReturnReasonCode> = returnReasonCode

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): PrenotificationReturn = apply {
            if (validated) {
                return@apply
            }

            createdAt()
            returnReasonCode()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var createdAt: JsonField<OffsetDateTime>? = null
            private var returnReasonCode: JsonField<ReturnReasonCode>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(prenotificationReturn: PrenotificationReturn) = apply {
                createdAt = prenotificationReturn.createdAt
                returnReasonCode = prenotificationReturn.returnReasonCode
                additionalProperties = prenotificationReturn.additionalProperties.toMutableMap()
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
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            /** Why the Prenotification was returned. */
            fun returnReasonCode(returnReasonCode: ReturnReasonCode) =
                returnReasonCode(JsonField.of(returnReasonCode))

            /** Why the Prenotification was returned. */
            fun returnReasonCode(returnReasonCode: JsonField<ReturnReasonCode>) = apply {
                this.returnReasonCode = returnReasonCode
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

            fun build(): PrenotificationReturn =
                PrenotificationReturn(
                    checkNotNull(createdAt) { "`createdAt` is required but was not set" },
                    checkNotNull(returnReasonCode) {
                        "`returnReasonCode` is required but was not set"
                    },
                    additionalProperties.toImmutable(),
                )
        }

        class ReturnReasonCode
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val INSUFFICIENT_FUND = of("insufficient_fund")

                @JvmField val NO_ACCOUNT = of("no_account")

                @JvmField val ACCOUNT_CLOSED = of("account_closed")

                @JvmField
                val INVALID_ACCOUNT_NUMBER_STRUCTURE = of("invalid_account_number_structure")

                @JvmField
                val ACCOUNT_FROZEN_ENTRY_RETURNED_PER_OFAC_INSTRUCTION =
                    of("account_frozen_entry_returned_per_ofac_instruction")

                @JvmField
                val CREDIT_ENTRY_REFUSED_BY_RECEIVER = of("credit_entry_refused_by_receiver")

                @JvmField
                val UNAUTHORIZED_DEBIT_TO_CONSUMER_ACCOUNT_USING_CORPORATE_SEC_CODE =
                    of("unauthorized_debit_to_consumer_account_using_corporate_sec_code")

                @JvmField
                val CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED =
                    of("corporate_customer_advised_not_authorized")

                @JvmField val PAYMENT_STOPPED = of("payment_stopped")

                @JvmField val NON_TRANSACTION_ACCOUNT = of("non_transaction_account")

                @JvmField val UNCOLLECTED_FUNDS = of("uncollected_funds")

                @JvmField
                val ROUTING_NUMBER_CHECK_DIGIT_ERROR = of("routing_number_check_digit_error")

                @JvmField
                val CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE =
                    of("customer_advised_unauthorized_improper_ineligible_or_incomplete")

                @JvmField val AMOUNT_FIELD_ERROR = of("amount_field_error")

                @JvmField
                val AUTHORIZATION_REVOKED_BY_CUSTOMER = of("authorization_revoked_by_customer")

                @JvmField val INVALID_ACH_ROUTING_NUMBER = of("invalid_ach_routing_number")

                @JvmField val FILE_RECORD_EDIT_CRITERIA = of("file_record_edit_criteria")

                @JvmField val ENR_INVALID_INDIVIDUAL_NAME = of("enr_invalid_individual_name")

                @JvmField val RETURNED_PER_ODFI_REQUEST = of("returned_per_odfi_request")

                @JvmField val LIMITED_PARTICIPATION_DFI = of("limited_participation_dfi")

                @JvmField
                val INCORRECTLY_CODED_OUTBOUND_INTERNATIONAL_PAYMENT =
                    of("incorrectly_coded_outbound_international_payment")

                @JvmField val ACCOUNT_SOLD_TO_ANOTHER_DFI = of("account_sold_to_another_dfi")

                @JvmField val ADDENDA_ERROR = of("addenda_error")

                @JvmField
                val BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED =
                    of("beneficiary_or_account_holder_deceased")

                @JvmField
                val CUSTOMER_ADVISED_NOT_WITHIN_AUTHORIZATION_TERMS =
                    of("customer_advised_not_within_authorization_terms")

                @JvmField val CORRECTED_RETURN = of("corrected_return")

                @JvmField val DUPLICATE_ENTRY = of("duplicate_entry")

                @JvmField val DUPLICATE_RETURN = of("duplicate_return")

                @JvmField val ENR_DUPLICATE_ENROLLMENT = of("enr_duplicate_enrollment")

                @JvmField val ENR_INVALID_DFI_ACCOUNT_NUMBER = of("enr_invalid_dfi_account_number")

                @JvmField
                val ENR_INVALID_INDIVIDUAL_ID_NUMBER = of("enr_invalid_individual_id_number")

                @JvmField
                val ENR_INVALID_REPRESENTATIVE_PAYEE_INDICATOR =
                    of("enr_invalid_representative_payee_indicator")

                @JvmField val ENR_INVALID_TRANSACTION_CODE = of("enr_invalid_transaction_code")

                @JvmField val ENR_RETURN_OF_ENR_ENTRY = of("enr_return_of_enr_entry")

                @JvmField
                val ENR_ROUTING_NUMBER_CHECK_DIGIT_ERROR =
                    of("enr_routing_number_check_digit_error")

                @JvmField val ENTRY_NOT_PROCESSED_BY_GATEWAY = of("entry_not_processed_by_gateway")

                @JvmField val FIELD_ERROR = of("field_error")

                @JvmField
                val FOREIGN_RECEIVING_DFI_UNABLE_TO_SETTLE =
                    of("foreign_receiving_dfi_unable_to_settle")

                @JvmField val IAT_ENTRY_CODING_ERROR = of("iat_entry_coding_error")

                @JvmField val IMPROPER_EFFECTIVE_ENTRY_DATE = of("improper_effective_entry_date")

                @JvmField
                val IMPROPER_SOURCE_DOCUMENT_SOURCE_DOCUMENT_PRESENTED =
                    of("improper_source_document_source_document_presented")

                @JvmField val INVALID_COMPANY_ID = of("invalid_company_id")

                @JvmField
                val INVALID_FOREIGN_RECEIVING_DFI_IDENTIFICATION =
                    of("invalid_foreign_receiving_dfi_identification")

                @JvmField val INVALID_INDIVIDUAL_ID_NUMBER = of("invalid_individual_id_number")

                @JvmField
                val ITEM_AND_RCK_ENTRY_PRESENTED_FOR_PAYMENT =
                    of("item_and_rck_entry_presented_for_payment")

                @JvmField
                val ITEM_RELATED_TO_RCK_ENTRY_IS_INELIGIBLE =
                    of("item_related_to_rck_entry_is_ineligible")

                @JvmField val MANDATORY_FIELD_ERROR = of("mandatory_field_error")

                @JvmField val MISROUTED_DISHONORED_RETURN = of("misrouted_dishonored_return")

                @JvmField val MISROUTED_RETURN = of("misrouted_return")

                @JvmField val NO_ERRORS_FOUND = of("no_errors_found")

                @JvmField
                val NON_ACCEPTANCE_OF_R62_DISHONORED_RETURN =
                    of("non_acceptance_of_r62_dishonored_return")

                @JvmField val NON_PARTICIPANT_IN_IAT_PROGRAM = of("non_participant_in_iat_program")

                @JvmField val PERMISSIBLE_RETURN_ENTRY = of("permissible_return_entry")

                @JvmField
                val PERMISSIBLE_RETURN_ENTRY_NOT_ACCEPTED =
                    of("permissible_return_entry_not_accepted")

                @JvmField val RDFI_NON_SETTLEMENT = of("rdfi_non_settlement")

                @JvmField
                val RDFI_PARTICIPANT_IN_CHECK_TRUNCATION_PROGRAM =
                    of("rdfi_participant_in_check_truncation_program")

                @JvmField
                val REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY =
                    of("representative_payee_deceased_or_unable_to_continue_in_that_capacity")

                @JvmField val RETURN_NOT_A_DUPLICATE = of("return_not_a_duplicate")

                @JvmField
                val RETURN_OF_ERRONEOUS_OR_REVERSING_DEBIT =
                    of("return_of_erroneous_or_reversing_debit")

                @JvmField
                val RETURN_OF_IMPROPER_CREDIT_ENTRY = of("return_of_improper_credit_entry")

                @JvmField val RETURN_OF_IMPROPER_DEBIT_ENTRY = of("return_of_improper_debit_entry")

                @JvmField val RETURN_OF_XCK_ENTRY = of("return_of_xck_entry")

                @JvmField
                val SOURCE_DOCUMENT_PRESENTED_FOR_PAYMENT =
                    of("source_document_presented_for_payment")

                @JvmField
                val STATE_LAW_AFFECTING_RCK_ACCEPTANCE = of("state_law_affecting_rck_acceptance")

                @JvmField
                val STOP_PAYMENT_ON_ITEM_RELATED_TO_RCK_ENTRY =
                    of("stop_payment_on_item_related_to_rck_entry")

                @JvmField
                val STOP_PAYMENT_ON_SOURCE_DOCUMENT = of("stop_payment_on_source_document")

                @JvmField val TIMELY_ORIGINAL_RETURN = of("timely_original_return")

                @JvmField val TRACE_NUMBER_ERROR = of("trace_number_error")

                @JvmField val UNTIMELY_DISHONORED_RETURN = of("untimely_dishonored_return")

                @JvmField val UNTIMELY_RETURN = of("untimely_return")

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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ReturnReasonCode && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PrenotificationReturn && createdAt == other.createdAt && returnReasonCode == other.returnReasonCode && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(createdAt, returnReasonCode, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PrenotificationReturn{createdAt=$createdAt, returnReasonCode=$returnReasonCode, additionalProperties=$additionalProperties}"
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val PENDING_SUBMITTING = of("pending_submitting")

            @JvmField val REQUIRES_ATTENTION = of("requires_attention")

            @JvmField val RETURNED = of("returned")

            @JvmField val SUBMITTED = of("submitted")

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Status && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val ACH_PRENOTIFICATION = of("ach_prenotification")

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

        return /* spotless:off */ other is AchPrenotification && id == other.id && accountNumber == other.accountNumber && addendum == other.addendum && companyDescriptiveDate == other.companyDescriptiveDate && companyDiscretionaryData == other.companyDiscretionaryData && companyEntryDescription == other.companyEntryDescription && companyName == other.companyName && createdAt == other.createdAt && creditDebitIndicator == other.creditDebitIndicator && effectiveDate == other.effectiveDate && idempotencyKey == other.idempotencyKey && notificationsOfChange == other.notificationsOfChange && prenotificationReturn == other.prenotificationReturn && routingNumber == other.routingNumber && status == other.status && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, accountNumber, addendum, companyDescriptiveDate, companyDiscretionaryData, companyEntryDescription, companyName, createdAt, creditDebitIndicator, effectiveDate, idempotencyKey, notificationsOfChange, prenotificationReturn, routingNumber, status, type, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AchPrenotification{id=$id, accountNumber=$accountNumber, addendum=$addendum, companyDescriptiveDate=$companyDescriptiveDate, companyDiscretionaryData=$companyDiscretionaryData, companyEntryDescription=$companyEntryDescription, companyName=$companyName, createdAt=$createdAt, creditDebitIndicator=$creditDebitIndicator, effectiveDate=$effectiveDate, idempotencyKey=$idempotencyKey, notificationsOfChange=$notificationsOfChange, prenotificationReturn=$prenotificationReturn, routingNumber=$routingNumber, status=$status, type=$type, additionalProperties=$additionalProperties}"
}
