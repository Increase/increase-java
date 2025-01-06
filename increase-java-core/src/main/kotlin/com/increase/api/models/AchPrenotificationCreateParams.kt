// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.increase.api.core.Enum
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import com.increase.api.core.immutableEmptyMap
import com.increase.api.core.toImmutable
import com.increase.api.errors.IncreaseInvalidDataException
import java.time.LocalDate
import java.util.Objects
import java.util.Optional

class AchPrenotificationCreateParams
constructor(
    private val body: AchPrenotificationCreateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    /** The Increase identifier for the account that will send the transfer. */
    fun accountId(): String = body.accountId()

    /** The account number for the destination account. */
    fun accountNumber(): String = body.accountNumber()

    /**
     * The American Bankers' Association (ABA) Routing Transit Number (RTN) for the destination
     * account.
     */
    fun routingNumber(): String = body.routingNumber()

    /** Additional information that will be sent to the recipient. */
    fun addendum(): Optional<String> = body.addendum()

    /** The description of the date of the transfer. */
    fun companyDescriptiveDate(): Optional<String> = body.companyDescriptiveDate()

    /** The data you choose to associate with the transfer. */
    fun companyDiscretionaryData(): Optional<String> = body.companyDiscretionaryData()

    /** The description of the transfer you wish to be shown to the recipient. */
    fun companyEntryDescription(): Optional<String> = body.companyEntryDescription()

    /** The name by which the recipient knows you. */
    fun companyName(): Optional<String> = body.companyName()

    /** Whether the Prenotification is for a future debit or credit. */
    fun creditDebitIndicator(): Optional<CreditDebitIndicator> = body.creditDebitIndicator()

    /** The transfer effective date in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format. */
    fun effectiveDate(): Optional<LocalDate> = body.effectiveDate()

    /** Your identifier for the transfer recipient. */
    fun individualId(): Optional<String> = body.individualId()

    /**
     * The name of the transfer recipient. This value is information and not verified by the
     * recipient's bank.
     */
    fun individualName(): Optional<String> = body.individualName()

    /** The Standard Entry Class (SEC) code to use for the ACH Prenotification. */
    fun standardEntryClassCode(): Optional<StandardEntryClassCode> = body.standardEntryClassCode()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    @JvmSynthetic internal fun getBody(): AchPrenotificationCreateBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class AchPrenotificationCreateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("account_id") private val accountId: String,
        @JsonProperty("account_number") private val accountNumber: String,
        @JsonProperty("routing_number") private val routingNumber: String,
        @JsonProperty("addendum") private val addendum: String?,
        @JsonProperty("company_descriptive_date") private val companyDescriptiveDate: String?,
        @JsonProperty("company_discretionary_data") private val companyDiscretionaryData: String?,
        @JsonProperty("company_entry_description") private val companyEntryDescription: String?,
        @JsonProperty("company_name") private val companyName: String?,
        @JsonProperty("credit_debit_indicator")
        private val creditDebitIndicator: CreditDebitIndicator?,
        @JsonProperty("effective_date") private val effectiveDate: LocalDate?,
        @JsonProperty("individual_id") private val individualId: String?,
        @JsonProperty("individual_name") private val individualName: String?,
        @JsonProperty("standard_entry_class_code")
        private val standardEntryClassCode: StandardEntryClassCode?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The Increase identifier for the account that will send the transfer. */
        @JsonProperty("account_id") fun accountId(): String = accountId

        /** The account number for the destination account. */
        @JsonProperty("account_number") fun accountNumber(): String = accountNumber

        /**
         * The American Bankers' Association (ABA) Routing Transit Number (RTN) for the destination
         * account.
         */
        @JsonProperty("routing_number") fun routingNumber(): String = routingNumber

        /** Additional information that will be sent to the recipient. */
        @JsonProperty("addendum") fun addendum(): Optional<String> = Optional.ofNullable(addendum)

        /** The description of the date of the transfer. */
        @JsonProperty("company_descriptive_date")
        fun companyDescriptiveDate(): Optional<String> = Optional.ofNullable(companyDescriptiveDate)

        /** The data you choose to associate with the transfer. */
        @JsonProperty("company_discretionary_data")
        fun companyDiscretionaryData(): Optional<String> =
            Optional.ofNullable(companyDiscretionaryData)

        /** The description of the transfer you wish to be shown to the recipient. */
        @JsonProperty("company_entry_description")
        fun companyEntryDescription(): Optional<String> =
            Optional.ofNullable(companyEntryDescription)

        /** The name by which the recipient knows you. */
        @JsonProperty("company_name")
        fun companyName(): Optional<String> = Optional.ofNullable(companyName)

        /** Whether the Prenotification is for a future debit or credit. */
        @JsonProperty("credit_debit_indicator")
        fun creditDebitIndicator(): Optional<CreditDebitIndicator> =
            Optional.ofNullable(creditDebitIndicator)

        /**
         * The transfer effective date in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format.
         */
        @JsonProperty("effective_date")
        fun effectiveDate(): Optional<LocalDate> = Optional.ofNullable(effectiveDate)

        /** Your identifier for the transfer recipient. */
        @JsonProperty("individual_id")
        fun individualId(): Optional<String> = Optional.ofNullable(individualId)

        /**
         * The name of the transfer recipient. This value is information and not verified by the
         * recipient's bank.
         */
        @JsonProperty("individual_name")
        fun individualName(): Optional<String> = Optional.ofNullable(individualName)

        /** The Standard Entry Class (SEC) code to use for the ACH Prenotification. */
        @JsonProperty("standard_entry_class_code")
        fun standardEntryClassCode(): Optional<StandardEntryClassCode> =
            Optional.ofNullable(standardEntryClassCode)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var accountId: String? = null
            private var accountNumber: String? = null
            private var routingNumber: String? = null
            private var addendum: String? = null
            private var companyDescriptiveDate: String? = null
            private var companyDiscretionaryData: String? = null
            private var companyEntryDescription: String? = null
            private var companyName: String? = null
            private var creditDebitIndicator: CreditDebitIndicator? = null
            private var effectiveDate: LocalDate? = null
            private var individualId: String? = null
            private var individualName: String? = null
            private var standardEntryClassCode: StandardEntryClassCode? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(achPrenotificationCreateBody: AchPrenotificationCreateBody) = apply {
                accountId = achPrenotificationCreateBody.accountId
                accountNumber = achPrenotificationCreateBody.accountNumber
                routingNumber = achPrenotificationCreateBody.routingNumber
                addendum = achPrenotificationCreateBody.addendum
                companyDescriptiveDate = achPrenotificationCreateBody.companyDescriptiveDate
                companyDiscretionaryData = achPrenotificationCreateBody.companyDiscretionaryData
                companyEntryDescription = achPrenotificationCreateBody.companyEntryDescription
                companyName = achPrenotificationCreateBody.companyName
                creditDebitIndicator = achPrenotificationCreateBody.creditDebitIndicator
                effectiveDate = achPrenotificationCreateBody.effectiveDate
                individualId = achPrenotificationCreateBody.individualId
                individualName = achPrenotificationCreateBody.individualName
                standardEntryClassCode = achPrenotificationCreateBody.standardEntryClassCode
                additionalProperties =
                    achPrenotificationCreateBody.additionalProperties.toMutableMap()
            }

            /** The Increase identifier for the account that will send the transfer. */
            fun accountId(accountId: String) = apply { this.accountId = accountId }

            /** The account number for the destination account. */
            fun accountNumber(accountNumber: String) = apply { this.accountNumber = accountNumber }

            /**
             * The American Bankers' Association (ABA) Routing Transit Number (RTN) for the
             * destination account.
             */
            fun routingNumber(routingNumber: String) = apply { this.routingNumber = routingNumber }

            /** Additional information that will be sent to the recipient. */
            fun addendum(addendum: String?) = apply { this.addendum = addendum }

            /** Additional information that will be sent to the recipient. */
            fun addendum(addendum: Optional<String>) = addendum(addendum.orElse(null))

            /** The description of the date of the transfer. */
            fun companyDescriptiveDate(companyDescriptiveDate: String?) = apply {
                this.companyDescriptiveDate = companyDescriptiveDate
            }

            /** The description of the date of the transfer. */
            fun companyDescriptiveDate(companyDescriptiveDate: Optional<String>) =
                companyDescriptiveDate(companyDescriptiveDate.orElse(null))

            /** The data you choose to associate with the transfer. */
            fun companyDiscretionaryData(companyDiscretionaryData: String?) = apply {
                this.companyDiscretionaryData = companyDiscretionaryData
            }

            /** The data you choose to associate with the transfer. */
            fun companyDiscretionaryData(companyDiscretionaryData: Optional<String>) =
                companyDiscretionaryData(companyDiscretionaryData.orElse(null))

            /** The description of the transfer you wish to be shown to the recipient. */
            fun companyEntryDescription(companyEntryDescription: String?) = apply {
                this.companyEntryDescription = companyEntryDescription
            }

            /** The description of the transfer you wish to be shown to the recipient. */
            fun companyEntryDescription(companyEntryDescription: Optional<String>) =
                companyEntryDescription(companyEntryDescription.orElse(null))

            /** The name by which the recipient knows you. */
            fun companyName(companyName: String?) = apply { this.companyName = companyName }

            /** The name by which the recipient knows you. */
            fun companyName(companyName: Optional<String>) = companyName(companyName.orElse(null))

            /** Whether the Prenotification is for a future debit or credit. */
            fun creditDebitIndicator(creditDebitIndicator: CreditDebitIndicator?) = apply {
                this.creditDebitIndicator = creditDebitIndicator
            }

            /** Whether the Prenotification is for a future debit or credit. */
            fun creditDebitIndicator(creditDebitIndicator: Optional<CreditDebitIndicator>) =
                creditDebitIndicator(creditDebitIndicator.orElse(null))

            /**
             * The transfer effective date in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * format.
             */
            fun effectiveDate(effectiveDate: LocalDate?) = apply {
                this.effectiveDate = effectiveDate
            }

            /**
             * The transfer effective date in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * format.
             */
            fun effectiveDate(effectiveDate: Optional<LocalDate>) =
                effectiveDate(effectiveDate.orElse(null))

            /** Your identifier for the transfer recipient. */
            fun individualId(individualId: String?) = apply { this.individualId = individualId }

            /** Your identifier for the transfer recipient. */
            fun individualId(individualId: Optional<String>) =
                individualId(individualId.orElse(null))

            /**
             * The name of the transfer recipient. This value is information and not verified by the
             * recipient's bank.
             */
            fun individualName(individualName: String?) = apply {
                this.individualName = individualName
            }

            /**
             * The name of the transfer recipient. This value is information and not verified by the
             * recipient's bank.
             */
            fun individualName(individualName: Optional<String>) =
                individualName(individualName.orElse(null))

            /** The Standard Entry Class (SEC) code to use for the ACH Prenotification. */
            fun standardEntryClassCode(standardEntryClassCode: StandardEntryClassCode?) = apply {
                this.standardEntryClassCode = standardEntryClassCode
            }

            /** The Standard Entry Class (SEC) code to use for the ACH Prenotification. */
            fun standardEntryClassCode(standardEntryClassCode: Optional<StandardEntryClassCode>) =
                standardEntryClassCode(standardEntryClassCode.orElse(null))

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

            fun build(): AchPrenotificationCreateBody =
                AchPrenotificationCreateBody(
                    checkNotNull(accountId) { "`accountId` is required but was not set" },
                    checkNotNull(accountNumber) { "`accountNumber` is required but was not set" },
                    checkNotNull(routingNumber) { "`routingNumber` is required but was not set" },
                    addendum,
                    companyDescriptiveDate,
                    companyDiscretionaryData,
                    companyEntryDescription,
                    companyName,
                    creditDebitIndicator,
                    effectiveDate,
                    individualId,
                    individualName,
                    standardEntryClassCode,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AchPrenotificationCreateBody && accountId == other.accountId && accountNumber == other.accountNumber && routingNumber == other.routingNumber && addendum == other.addendum && companyDescriptiveDate == other.companyDescriptiveDate && companyDiscretionaryData == other.companyDiscretionaryData && companyEntryDescription == other.companyEntryDescription && companyName == other.companyName && creditDebitIndicator == other.creditDebitIndicator && effectiveDate == other.effectiveDate && individualId == other.individualId && individualName == other.individualName && standardEntryClassCode == other.standardEntryClassCode && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(accountId, accountNumber, routingNumber, addendum, companyDescriptiveDate, companyDiscretionaryData, companyEntryDescription, companyName, creditDebitIndicator, effectiveDate, individualId, individualName, standardEntryClassCode, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AchPrenotificationCreateBody{accountId=$accountId, accountNumber=$accountNumber, routingNumber=$routingNumber, addendum=$addendum, companyDescriptiveDate=$companyDescriptiveDate, companyDiscretionaryData=$companyDiscretionaryData, companyEntryDescription=$companyEntryDescription, companyName=$companyName, creditDebitIndicator=$creditDebitIndicator, effectiveDate=$effectiveDate, individualId=$individualId, individualName=$individualName, standardEntryClassCode=$standardEntryClassCode, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var body: AchPrenotificationCreateBody.Builder =
            AchPrenotificationCreateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(achPrenotificationCreateParams: AchPrenotificationCreateParams) = apply {
            body = achPrenotificationCreateParams.body.toBuilder()
            additionalHeaders = achPrenotificationCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = achPrenotificationCreateParams.additionalQueryParams.toBuilder()
        }

        /** The Increase identifier for the account that will send the transfer. */
        fun accountId(accountId: String) = apply { body.accountId(accountId) }

        /** The account number for the destination account. */
        fun accountNumber(accountNumber: String) = apply { body.accountNumber(accountNumber) }

        /**
         * The American Bankers' Association (ABA) Routing Transit Number (RTN) for the destination
         * account.
         */
        fun routingNumber(routingNumber: String) = apply { body.routingNumber(routingNumber) }

        /** Additional information that will be sent to the recipient. */
        fun addendum(addendum: String?) = apply { body.addendum(addendum) }

        /** Additional information that will be sent to the recipient. */
        fun addendum(addendum: Optional<String>) = addendum(addendum.orElse(null))

        /** The description of the date of the transfer. */
        fun companyDescriptiveDate(companyDescriptiveDate: String?) = apply {
            body.companyDescriptiveDate(companyDescriptiveDate)
        }

        /** The description of the date of the transfer. */
        fun companyDescriptiveDate(companyDescriptiveDate: Optional<String>) =
            companyDescriptiveDate(companyDescriptiveDate.orElse(null))

        /** The data you choose to associate with the transfer. */
        fun companyDiscretionaryData(companyDiscretionaryData: String?) = apply {
            body.companyDiscretionaryData(companyDiscretionaryData)
        }

        /** The data you choose to associate with the transfer. */
        fun companyDiscretionaryData(companyDiscretionaryData: Optional<String>) =
            companyDiscretionaryData(companyDiscretionaryData.orElse(null))

        /** The description of the transfer you wish to be shown to the recipient. */
        fun companyEntryDescription(companyEntryDescription: String?) = apply {
            body.companyEntryDescription(companyEntryDescription)
        }

        /** The description of the transfer you wish to be shown to the recipient. */
        fun companyEntryDescription(companyEntryDescription: Optional<String>) =
            companyEntryDescription(companyEntryDescription.orElse(null))

        /** The name by which the recipient knows you. */
        fun companyName(companyName: String?) = apply { body.companyName(companyName) }

        /** The name by which the recipient knows you. */
        fun companyName(companyName: Optional<String>) = companyName(companyName.orElse(null))

        /** Whether the Prenotification is for a future debit or credit. */
        fun creditDebitIndicator(creditDebitIndicator: CreditDebitIndicator?) = apply {
            body.creditDebitIndicator(creditDebitIndicator)
        }

        /** Whether the Prenotification is for a future debit or credit. */
        fun creditDebitIndicator(creditDebitIndicator: Optional<CreditDebitIndicator>) =
            creditDebitIndicator(creditDebitIndicator.orElse(null))

        /**
         * The transfer effective date in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format.
         */
        fun effectiveDate(effectiveDate: LocalDate?) = apply { body.effectiveDate(effectiveDate) }

        /**
         * The transfer effective date in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format.
         */
        fun effectiveDate(effectiveDate: Optional<LocalDate>) =
            effectiveDate(effectiveDate.orElse(null))

        /** Your identifier for the transfer recipient. */
        fun individualId(individualId: String?) = apply { body.individualId(individualId) }

        /** Your identifier for the transfer recipient. */
        fun individualId(individualId: Optional<String>) = individualId(individualId.orElse(null))

        /**
         * The name of the transfer recipient. This value is information and not verified by the
         * recipient's bank.
         */
        fun individualName(individualName: String?) = apply { body.individualName(individualName) }

        /**
         * The name of the transfer recipient. This value is information and not verified by the
         * recipient's bank.
         */
        fun individualName(individualName: Optional<String>) =
            individualName(individualName.orElse(null))

        /** The Standard Entry Class (SEC) code to use for the ACH Prenotification. */
        fun standardEntryClassCode(standardEntryClassCode: StandardEntryClassCode?) = apply {
            body.standardEntryClassCode(standardEntryClassCode)
        }

        /** The Standard Entry Class (SEC) code to use for the ACH Prenotification. */
        fun standardEntryClassCode(standardEntryClassCode: Optional<StandardEntryClassCode>) =
            standardEntryClassCode(standardEntryClassCode.orElse(null))

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

        fun build(): AchPrenotificationCreateParams =
            AchPrenotificationCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
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

    class StandardEntryClassCode
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val CORPORATE_CREDIT_OR_DEBIT = of("corporate_credit_or_debit")

            @JvmField val CORPORATE_TRADE_EXCHANGE = of("corporate_trade_exchange")

            @JvmField val PREARRANGED_PAYMENTS_AND_DEPOSIT = of("prearranged_payments_and_deposit")

            @JvmField val INTERNET_INITIATED = of("internet_initiated")

            @JvmStatic fun of(value: String) = StandardEntryClassCode(JsonField.of(value))
        }

        enum class Known {
            CORPORATE_CREDIT_OR_DEBIT,
            CORPORATE_TRADE_EXCHANGE,
            PREARRANGED_PAYMENTS_AND_DEPOSIT,
            INTERNET_INITIATED,
        }

        enum class Value {
            CORPORATE_CREDIT_OR_DEBIT,
            CORPORATE_TRADE_EXCHANGE,
            PREARRANGED_PAYMENTS_AND_DEPOSIT,
            INTERNET_INITIATED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                CORPORATE_CREDIT_OR_DEBIT -> Value.CORPORATE_CREDIT_OR_DEBIT
                CORPORATE_TRADE_EXCHANGE -> Value.CORPORATE_TRADE_EXCHANGE
                PREARRANGED_PAYMENTS_AND_DEPOSIT -> Value.PREARRANGED_PAYMENTS_AND_DEPOSIT
                INTERNET_INITIATED -> Value.INTERNET_INITIATED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                CORPORATE_CREDIT_OR_DEBIT -> Known.CORPORATE_CREDIT_OR_DEBIT
                CORPORATE_TRADE_EXCHANGE -> Known.CORPORATE_TRADE_EXCHANGE
                PREARRANGED_PAYMENTS_AND_DEPOSIT -> Known.PREARRANGED_PAYMENTS_AND_DEPOSIT
                INTERNET_INITIATED -> Known.INTERNET_INITIATED
                else -> throw IncreaseInvalidDataException("Unknown StandardEntryClassCode: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is StandardEntryClassCode && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AchPrenotificationCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "AchPrenotificationCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
