// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.increase.api.core.Enum
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import com.increase.api.core.toImmutable
import com.increase.api.errors.IncreaseInvalidDataException
import java.time.LocalDate
import java.util.Objects
import java.util.Optional

class AchTransferCreateParams
constructor(
    private val accountId: String,
    private val amount: Long,
    private val statementDescriptor: String,
    private val accountNumber: String?,
    private val addenda: Addenda?,
    private val companyDescriptiveDate: String?,
    private val companyDiscretionaryData: String?,
    private val companyEntryDescription: String?,
    private val companyName: String?,
    private val destinationAccountHolder: DestinationAccountHolder?,
    private val externalAccountId: String?,
    private val funding: Funding?,
    private val individualId: String?,
    private val individualName: String?,
    private val preferredEffectiveDate: PreferredEffectiveDate?,
    private val requireApproval: Boolean?,
    private val routingNumber: String?,
    private val standardEntryClassCode: StandardEntryClassCode?,
    private val transactionTiming: TransactionTiming?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun accountId(): String = accountId

    fun amount(): Long = amount

    fun statementDescriptor(): String = statementDescriptor

    fun accountNumber(): Optional<String> = Optional.ofNullable(accountNumber)

    fun addenda(): Optional<Addenda> = Optional.ofNullable(addenda)

    fun companyDescriptiveDate(): Optional<String> = Optional.ofNullable(companyDescriptiveDate)

    fun companyDiscretionaryData(): Optional<String> = Optional.ofNullable(companyDiscretionaryData)

    fun companyEntryDescription(): Optional<String> = Optional.ofNullable(companyEntryDescription)

    fun companyName(): Optional<String> = Optional.ofNullable(companyName)

    fun destinationAccountHolder(): Optional<DestinationAccountHolder> =
        Optional.ofNullable(destinationAccountHolder)

    fun externalAccountId(): Optional<String> = Optional.ofNullable(externalAccountId)

    fun funding(): Optional<Funding> = Optional.ofNullable(funding)

    fun individualId(): Optional<String> = Optional.ofNullable(individualId)

    fun individualName(): Optional<String> = Optional.ofNullable(individualName)

    fun preferredEffectiveDate(): Optional<PreferredEffectiveDate> =
        Optional.ofNullable(preferredEffectiveDate)

    fun requireApproval(): Optional<Boolean> = Optional.ofNullable(requireApproval)

    fun routingNumber(): Optional<String> = Optional.ofNullable(routingNumber)

    fun standardEntryClassCode(): Optional<StandardEntryClassCode> =
        Optional.ofNullable(standardEntryClassCode)

    fun transactionTiming(): Optional<TransactionTiming> = Optional.ofNullable(transactionTiming)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    @JvmSynthetic
    internal fun getBody(): AchTransferCreateBody {
        return AchTransferCreateBody(
            accountId,
            amount,
            statementDescriptor,
            accountNumber,
            addenda,
            companyDescriptiveDate,
            companyDiscretionaryData,
            companyEntryDescription,
            companyName,
            destinationAccountHolder,
            externalAccountId,
            funding,
            individualId,
            individualName,
            preferredEffectiveDate,
            requireApproval,
            routingNumber,
            standardEntryClassCode,
            transactionTiming,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @JsonDeserialize(builder = AchTransferCreateBody.Builder::class)
    @NoAutoDetect
    class AchTransferCreateBody
    internal constructor(
        private val accountId: String,
        private val amount: Long,
        private val statementDescriptor: String,
        private val accountNumber: String?,
        private val addenda: Addenda?,
        private val companyDescriptiveDate: String?,
        private val companyDiscretionaryData: String?,
        private val companyEntryDescription: String?,
        private val companyName: String?,
        private val destinationAccountHolder: DestinationAccountHolder?,
        private val externalAccountId: String?,
        private val funding: Funding?,
        private val individualId: String?,
        private val individualName: String?,
        private val preferredEffectiveDate: PreferredEffectiveDate?,
        private val requireApproval: Boolean?,
        private val routingNumber: String?,
        private val standardEntryClassCode: StandardEntryClassCode?,
        private val transactionTiming: TransactionTiming?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The Increase identifier for the account that will send the transfer. */
        @JsonProperty("account_id") fun accountId(): String = accountId

        /**
         * The transfer amount in USD cents. A positive amount originates a credit transfer pushing
         * funds to the receiving account. A negative amount originates a debit transfer pulling
         * funds from the receiving account.
         */
        @JsonProperty("amount") fun amount(): Long = amount

        /**
         * A description you choose to give the transfer. This will be saved with the transfer
         * details, displayed in the dashboard, and returned by the API. If `individual_name` and
         * `company_name` are not explicitly set by this API, the `statement_descriptor` will be
         * sent in those fields to the receiving bank to help the customer recognize the transfer.
         * You are highly encouraged to pass `individual_name` and `company_name` instead of relying
         * on this fallback.
         */
        @JsonProperty("statement_descriptor")
        fun statementDescriptor(): String = statementDescriptor

        /** The account number for the destination account. */
        @JsonProperty("account_number")
        fun accountNumber(): Optional<String> = Optional.ofNullable(accountNumber)

        /**
         * Additional information that will be sent to the recipient. This is included in the
         * transfer data sent to the receiving bank.
         */
        @JsonProperty("addenda") fun addenda(): Optional<Addenda> = Optional.ofNullable(addenda)

        /**
         * The description of the date of the transfer, usually in the format `YYMMDD`. This is
         * included in the transfer data sent to the receiving bank.
         */
        @JsonProperty("company_descriptive_date")
        fun companyDescriptiveDate(): Optional<String> = Optional.ofNullable(companyDescriptiveDate)

        /**
         * The data you choose to associate with the transfer. This is included in the transfer data
         * sent to the receiving bank.
         */
        @JsonProperty("company_discretionary_data")
        fun companyDiscretionaryData(): Optional<String> =
            Optional.ofNullable(companyDiscretionaryData)

        /**
         * A description of the transfer. This is included in the transfer data sent to the
         * receiving bank.
         */
        @JsonProperty("company_entry_description")
        fun companyEntryDescription(): Optional<String> =
            Optional.ofNullable(companyEntryDescription)

        /**
         * The name by which the recipient knows you. This is included in the transfer data sent to
         * the receiving bank.
         */
        @JsonProperty("company_name")
        fun companyName(): Optional<String> = Optional.ofNullable(companyName)

        /** The type of entity that owns the account to which the ACH Transfer is being sent. */
        @JsonProperty("destination_account_holder")
        fun destinationAccountHolder(): Optional<DestinationAccountHolder> =
            Optional.ofNullable(destinationAccountHolder)

        /**
         * The ID of an External Account to initiate a transfer to. If this parameter is provided,
         * `account_number`, `routing_number`, and `funding` must be absent.
         */
        @JsonProperty("external_account_id")
        fun externalAccountId(): Optional<String> = Optional.ofNullable(externalAccountId)

        /** The type of the account to which the transfer will be sent. */
        @JsonProperty("funding") fun funding(): Optional<Funding> = Optional.ofNullable(funding)

        /** Your identifier for the transfer recipient. */
        @JsonProperty("individual_id")
        fun individualId(): Optional<String> = Optional.ofNullable(individualId)

        /**
         * The name of the transfer recipient. This value is informational and not verified by the
         * recipient's bank.
         */
        @JsonProperty("individual_name")
        fun individualName(): Optional<String> = Optional.ofNullable(individualName)

        /**
         * Configuration for how the effective date of the transfer will be set. This determines
         * same-day vs future-dated settlement timing. If not set, defaults to a
         * `settlement_schedule` of `same_day`. If set, exactly one of the child attributes must be
         * set.
         */
        @JsonProperty("preferred_effective_date")
        fun preferredEffectiveDate(): Optional<PreferredEffectiveDate> =
            Optional.ofNullable(preferredEffectiveDate)

        /** Whether the transfer requires explicit approval via the dashboard or API. */
        @JsonProperty("require_approval")
        fun requireApproval(): Optional<Boolean> = Optional.ofNullable(requireApproval)

        /**
         * The American Bankers' Association (ABA) Routing Transit Number (RTN) for the destination
         * account.
         */
        @JsonProperty("routing_number")
        fun routingNumber(): Optional<String> = Optional.ofNullable(routingNumber)

        /** The Standard Entry Class (SEC) code to use for the transfer. */
        @JsonProperty("standard_entry_class_code")
        fun standardEntryClassCode(): Optional<StandardEntryClassCode> =
            Optional.ofNullable(standardEntryClassCode)

        /** The timing of the transaction. */
        @JsonProperty("transaction_timing")
        fun transactionTiming(): Optional<TransactionTiming> =
            Optional.ofNullable(transactionTiming)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var accountId: String? = null
            private var amount: Long? = null
            private var statementDescriptor: String? = null
            private var accountNumber: String? = null
            private var addenda: Addenda? = null
            private var companyDescriptiveDate: String? = null
            private var companyDiscretionaryData: String? = null
            private var companyEntryDescription: String? = null
            private var companyName: String? = null
            private var destinationAccountHolder: DestinationAccountHolder? = null
            private var externalAccountId: String? = null
            private var funding: Funding? = null
            private var individualId: String? = null
            private var individualName: String? = null
            private var preferredEffectiveDate: PreferredEffectiveDate? = null
            private var requireApproval: Boolean? = null
            private var routingNumber: String? = null
            private var standardEntryClassCode: StandardEntryClassCode? = null
            private var transactionTiming: TransactionTiming? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(achTransferCreateBody: AchTransferCreateBody) = apply {
                accountId = achTransferCreateBody.accountId
                amount = achTransferCreateBody.amount
                statementDescriptor = achTransferCreateBody.statementDescriptor
                accountNumber = achTransferCreateBody.accountNumber
                addenda = achTransferCreateBody.addenda
                companyDescriptiveDate = achTransferCreateBody.companyDescriptiveDate
                companyDiscretionaryData = achTransferCreateBody.companyDiscretionaryData
                companyEntryDescription = achTransferCreateBody.companyEntryDescription
                companyName = achTransferCreateBody.companyName
                destinationAccountHolder = achTransferCreateBody.destinationAccountHolder
                externalAccountId = achTransferCreateBody.externalAccountId
                funding = achTransferCreateBody.funding
                individualId = achTransferCreateBody.individualId
                individualName = achTransferCreateBody.individualName
                preferredEffectiveDate = achTransferCreateBody.preferredEffectiveDate
                requireApproval = achTransferCreateBody.requireApproval
                routingNumber = achTransferCreateBody.routingNumber
                standardEntryClassCode = achTransferCreateBody.standardEntryClassCode
                transactionTiming = achTransferCreateBody.transactionTiming
                additionalProperties = achTransferCreateBody.additionalProperties.toMutableMap()
            }

            /** The Increase identifier for the account that will send the transfer. */
            @JsonProperty("account_id")
            fun accountId(accountId: String) = apply { this.accountId = accountId }

            /**
             * The transfer amount in USD cents. A positive amount originates a credit transfer
             * pushing funds to the receiving account. A negative amount originates a debit transfer
             * pulling funds from the receiving account.
             */
            @JsonProperty("amount") fun amount(amount: Long) = apply { this.amount = amount }

            /**
             * A description you choose to give the transfer. This will be saved with the transfer
             * details, displayed in the dashboard, and returned by the API. If `individual_name`
             * and `company_name` are not explicitly set by this API, the `statement_descriptor`
             * will be sent in those fields to the receiving bank to help the customer recognize the
             * transfer. You are highly encouraged to pass `individual_name` and `company_name`
             * instead of relying on this fallback.
             */
            @JsonProperty("statement_descriptor")
            fun statementDescriptor(statementDescriptor: String) = apply {
                this.statementDescriptor = statementDescriptor
            }

            /** The account number for the destination account. */
            @JsonProperty("account_number")
            fun accountNumber(accountNumber: String) = apply { this.accountNumber = accountNumber }

            /**
             * Additional information that will be sent to the recipient. This is included in the
             * transfer data sent to the receiving bank.
             */
            @JsonProperty("addenda")
            fun addenda(addenda: Addenda) = apply { this.addenda = addenda }

            /**
             * The description of the date of the transfer, usually in the format `YYMMDD`. This is
             * included in the transfer data sent to the receiving bank.
             */
            @JsonProperty("company_descriptive_date")
            fun companyDescriptiveDate(companyDescriptiveDate: String) = apply {
                this.companyDescriptiveDate = companyDescriptiveDate
            }

            /**
             * The data you choose to associate with the transfer. This is included in the transfer
             * data sent to the receiving bank.
             */
            @JsonProperty("company_discretionary_data")
            fun companyDiscretionaryData(companyDiscretionaryData: String) = apply {
                this.companyDiscretionaryData = companyDiscretionaryData
            }

            /**
             * A description of the transfer. This is included in the transfer data sent to the
             * receiving bank.
             */
            @JsonProperty("company_entry_description")
            fun companyEntryDescription(companyEntryDescription: String) = apply {
                this.companyEntryDescription = companyEntryDescription
            }

            /**
             * The name by which the recipient knows you. This is included in the transfer data sent
             * to the receiving bank.
             */
            @JsonProperty("company_name")
            fun companyName(companyName: String) = apply { this.companyName = companyName }

            /** The type of entity that owns the account to which the ACH Transfer is being sent. */
            @JsonProperty("destination_account_holder")
            fun destinationAccountHolder(destinationAccountHolder: DestinationAccountHolder) =
                apply {
                    this.destinationAccountHolder = destinationAccountHolder
                }

            /**
             * The ID of an External Account to initiate a transfer to. If this parameter is
             * provided, `account_number`, `routing_number`, and `funding` must be absent.
             */
            @JsonProperty("external_account_id")
            fun externalAccountId(externalAccountId: String) = apply {
                this.externalAccountId = externalAccountId
            }

            /** The type of the account to which the transfer will be sent. */
            @JsonProperty("funding")
            fun funding(funding: Funding) = apply { this.funding = funding }

            /** Your identifier for the transfer recipient. */
            @JsonProperty("individual_id")
            fun individualId(individualId: String) = apply { this.individualId = individualId }

            /**
             * The name of the transfer recipient. This value is informational and not verified by
             * the recipient's bank.
             */
            @JsonProperty("individual_name")
            fun individualName(individualName: String) = apply {
                this.individualName = individualName
            }

            /**
             * Configuration for how the effective date of the transfer will be set. This determines
             * same-day vs future-dated settlement timing. If not set, defaults to a
             * `settlement_schedule` of `same_day`. If set, exactly one of the child attributes must
             * be set.
             */
            @JsonProperty("preferred_effective_date")
            fun preferredEffectiveDate(preferredEffectiveDate: PreferredEffectiveDate) = apply {
                this.preferredEffectiveDate = preferredEffectiveDate
            }

            /** Whether the transfer requires explicit approval via the dashboard or API. */
            @JsonProperty("require_approval")
            fun requireApproval(requireApproval: Boolean) = apply {
                this.requireApproval = requireApproval
            }

            /**
             * The American Bankers' Association (ABA) Routing Transit Number (RTN) for the
             * destination account.
             */
            @JsonProperty("routing_number")
            fun routingNumber(routingNumber: String) = apply { this.routingNumber = routingNumber }

            /** The Standard Entry Class (SEC) code to use for the transfer. */
            @JsonProperty("standard_entry_class_code")
            fun standardEntryClassCode(standardEntryClassCode: StandardEntryClassCode) = apply {
                this.standardEntryClassCode = standardEntryClassCode
            }

            /** The timing of the transaction. */
            @JsonProperty("transaction_timing")
            fun transactionTiming(transactionTiming: TransactionTiming) = apply {
                this.transactionTiming = transactionTiming
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            @JsonAnySetter
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

            fun build(): AchTransferCreateBody =
                AchTransferCreateBody(
                    checkNotNull(accountId) { "`accountId` is required but was not set" },
                    checkNotNull(amount) { "`amount` is required but was not set" },
                    checkNotNull(statementDescriptor) {
                        "`statementDescriptor` is required but was not set"
                    },
                    accountNumber,
                    addenda,
                    companyDescriptiveDate,
                    companyDiscretionaryData,
                    companyEntryDescription,
                    companyName,
                    destinationAccountHolder,
                    externalAccountId,
                    funding,
                    individualId,
                    individualName,
                    preferredEffectiveDate,
                    requireApproval,
                    routingNumber,
                    standardEntryClassCode,
                    transactionTiming,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AchTransferCreateBody && accountId == other.accountId && amount == other.amount && statementDescriptor == other.statementDescriptor && accountNumber == other.accountNumber && addenda == other.addenda && companyDescriptiveDate == other.companyDescriptiveDate && companyDiscretionaryData == other.companyDiscretionaryData && companyEntryDescription == other.companyEntryDescription && companyName == other.companyName && destinationAccountHolder == other.destinationAccountHolder && externalAccountId == other.externalAccountId && funding == other.funding && individualId == other.individualId && individualName == other.individualName && preferredEffectiveDate == other.preferredEffectiveDate && requireApproval == other.requireApproval && routingNumber == other.routingNumber && standardEntryClassCode == other.standardEntryClassCode && transactionTiming == other.transactionTiming && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(accountId, amount, statementDescriptor, accountNumber, addenda, companyDescriptiveDate, companyDiscretionaryData, companyEntryDescription, companyName, destinationAccountHolder, externalAccountId, funding, individualId, individualName, preferredEffectiveDate, requireApproval, routingNumber, standardEntryClassCode, transactionTiming, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AchTransferCreateBody{accountId=$accountId, amount=$amount, statementDescriptor=$statementDescriptor, accountNumber=$accountNumber, addenda=$addenda, companyDescriptiveDate=$companyDescriptiveDate, companyDiscretionaryData=$companyDiscretionaryData, companyEntryDescription=$companyEntryDescription, companyName=$companyName, destinationAccountHolder=$destinationAccountHolder, externalAccountId=$externalAccountId, funding=$funding, individualId=$individualId, individualName=$individualName, preferredEffectiveDate=$preferredEffectiveDate, requireApproval=$requireApproval, routingNumber=$routingNumber, standardEntryClassCode=$standardEntryClassCode, transactionTiming=$transactionTiming, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var accountId: String? = null
        private var amount: Long? = null
        private var statementDescriptor: String? = null
        private var accountNumber: String? = null
        private var addenda: Addenda? = null
        private var companyDescriptiveDate: String? = null
        private var companyDiscretionaryData: String? = null
        private var companyEntryDescription: String? = null
        private var companyName: String? = null
        private var destinationAccountHolder: DestinationAccountHolder? = null
        private var externalAccountId: String? = null
        private var funding: Funding? = null
        private var individualId: String? = null
        private var individualName: String? = null
        private var preferredEffectiveDate: PreferredEffectiveDate? = null
        private var requireApproval: Boolean? = null
        private var routingNumber: String? = null
        private var standardEntryClassCode: StandardEntryClassCode? = null
        private var transactionTiming: TransactionTiming? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(achTransferCreateParams: AchTransferCreateParams) = apply {
            accountId = achTransferCreateParams.accountId
            amount = achTransferCreateParams.amount
            statementDescriptor = achTransferCreateParams.statementDescriptor
            accountNumber = achTransferCreateParams.accountNumber
            addenda = achTransferCreateParams.addenda
            companyDescriptiveDate = achTransferCreateParams.companyDescriptiveDate
            companyDiscretionaryData = achTransferCreateParams.companyDiscretionaryData
            companyEntryDescription = achTransferCreateParams.companyEntryDescription
            companyName = achTransferCreateParams.companyName
            destinationAccountHolder = achTransferCreateParams.destinationAccountHolder
            externalAccountId = achTransferCreateParams.externalAccountId
            funding = achTransferCreateParams.funding
            individualId = achTransferCreateParams.individualId
            individualName = achTransferCreateParams.individualName
            preferredEffectiveDate = achTransferCreateParams.preferredEffectiveDate
            requireApproval = achTransferCreateParams.requireApproval
            routingNumber = achTransferCreateParams.routingNumber
            standardEntryClassCode = achTransferCreateParams.standardEntryClassCode
            transactionTiming = achTransferCreateParams.transactionTiming
            additionalHeaders = achTransferCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = achTransferCreateParams.additionalQueryParams.toBuilder()
            additionalBodyProperties =
                achTransferCreateParams.additionalBodyProperties.toMutableMap()
        }

        /** The Increase identifier for the account that will send the transfer. */
        fun accountId(accountId: String) = apply { this.accountId = accountId }

        /**
         * The transfer amount in USD cents. A positive amount originates a credit transfer pushing
         * funds to the receiving account. A negative amount originates a debit transfer pulling
         * funds from the receiving account.
         */
        fun amount(amount: Long) = apply { this.amount = amount }

        /**
         * A description you choose to give the transfer. This will be saved with the transfer
         * details, displayed in the dashboard, and returned by the API. If `individual_name` and
         * `company_name` are not explicitly set by this API, the `statement_descriptor` will be
         * sent in those fields to the receiving bank to help the customer recognize the transfer.
         * You are highly encouraged to pass `individual_name` and `company_name` instead of relying
         * on this fallback.
         */
        fun statementDescriptor(statementDescriptor: String) = apply {
            this.statementDescriptor = statementDescriptor
        }

        /** The account number for the destination account. */
        fun accountNumber(accountNumber: String) = apply { this.accountNumber = accountNumber }

        /**
         * Additional information that will be sent to the recipient. This is included in the
         * transfer data sent to the receiving bank.
         */
        fun addenda(addenda: Addenda) = apply { this.addenda = addenda }

        /**
         * The description of the date of the transfer, usually in the format `YYMMDD`. This is
         * included in the transfer data sent to the receiving bank.
         */
        fun companyDescriptiveDate(companyDescriptiveDate: String) = apply {
            this.companyDescriptiveDate = companyDescriptiveDate
        }

        /**
         * The data you choose to associate with the transfer. This is included in the transfer data
         * sent to the receiving bank.
         */
        fun companyDiscretionaryData(companyDiscretionaryData: String) = apply {
            this.companyDiscretionaryData = companyDiscretionaryData
        }

        /**
         * A description of the transfer. This is included in the transfer data sent to the
         * receiving bank.
         */
        fun companyEntryDescription(companyEntryDescription: String) = apply {
            this.companyEntryDescription = companyEntryDescription
        }

        /**
         * The name by which the recipient knows you. This is included in the transfer data sent to
         * the receiving bank.
         */
        fun companyName(companyName: String) = apply { this.companyName = companyName }

        /** The type of entity that owns the account to which the ACH Transfer is being sent. */
        fun destinationAccountHolder(destinationAccountHolder: DestinationAccountHolder) = apply {
            this.destinationAccountHolder = destinationAccountHolder
        }

        /**
         * The ID of an External Account to initiate a transfer to. If this parameter is provided,
         * `account_number`, `routing_number`, and `funding` must be absent.
         */
        fun externalAccountId(externalAccountId: String) = apply {
            this.externalAccountId = externalAccountId
        }

        /** The type of the account to which the transfer will be sent. */
        fun funding(funding: Funding) = apply { this.funding = funding }

        /** Your identifier for the transfer recipient. */
        fun individualId(individualId: String) = apply { this.individualId = individualId }

        /**
         * The name of the transfer recipient. This value is informational and not verified by the
         * recipient's bank.
         */
        fun individualName(individualName: String) = apply { this.individualName = individualName }

        /**
         * Configuration for how the effective date of the transfer will be set. This determines
         * same-day vs future-dated settlement timing. If not set, defaults to a
         * `settlement_schedule` of `same_day`. If set, exactly one of the child attributes must be
         * set.
         */
        fun preferredEffectiveDate(preferredEffectiveDate: PreferredEffectiveDate) = apply {
            this.preferredEffectiveDate = preferredEffectiveDate
        }

        /** Whether the transfer requires explicit approval via the dashboard or API. */
        fun requireApproval(requireApproval: Boolean) = apply {
            this.requireApproval = requireApproval
        }

        /**
         * The American Bankers' Association (ABA) Routing Transit Number (RTN) for the destination
         * account.
         */
        fun routingNumber(routingNumber: String) = apply { this.routingNumber = routingNumber }

        /** The Standard Entry Class (SEC) code to use for the transfer. */
        fun standardEntryClassCode(standardEntryClassCode: StandardEntryClassCode) = apply {
            this.standardEntryClassCode = standardEntryClassCode
        }

        /** The timing of the transaction. */
        fun transactionTiming(transactionTiming: TransactionTiming) = apply {
            this.transactionTiming = transactionTiming
        }

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
            this.additionalBodyProperties.clear()
            putAllAdditionalBodyProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply {
            additionalBodyProperties.remove(key)
        }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalBodyProperty)
        }

        fun build(): AchTransferCreateParams =
            AchTransferCreateParams(
                checkNotNull(accountId) { "`accountId` is required but was not set" },
                checkNotNull(amount) { "`amount` is required but was not set" },
                checkNotNull(statementDescriptor) {
                    "`statementDescriptor` is required but was not set"
                },
                accountNumber,
                addenda,
                companyDescriptiveDate,
                companyDiscretionaryData,
                companyEntryDescription,
                companyName,
                destinationAccountHolder,
                externalAccountId,
                funding,
                individualId,
                individualName,
                preferredEffectiveDate,
                requireApproval,
                routingNumber,
                standardEntryClassCode,
                transactionTiming,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    /**
     * Additional information that will be sent to the recipient. This is included in the transfer
     * data sent to the receiving bank.
     */
    @JsonDeserialize(builder = Addenda.Builder::class)
    @NoAutoDetect
    class Addenda
    private constructor(
        private val category: Category,
        private val freeform: Freeform?,
        private val paymentOrderRemittanceAdvice: PaymentOrderRemittanceAdvice?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The type of addenda to pass with the transfer. */
        @JsonProperty("category") fun category(): Category = category

        /** Unstructured `payment_related_information` passed through with the transfer. */
        @JsonProperty("freeform") fun freeform(): Optional<Freeform> = Optional.ofNullable(freeform)

        /**
         * Structured ASC X12 820 remittance advice records. Please reach out to
         * [support@increase.com](mailto:support@increase.com) for more information.
         */
        @JsonProperty("payment_order_remittance_advice")
        fun paymentOrderRemittanceAdvice(): Optional<PaymentOrderRemittanceAdvice> =
            Optional.ofNullable(paymentOrderRemittanceAdvice)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var category: Category? = null
            private var freeform: Freeform? = null
            private var paymentOrderRemittanceAdvice: PaymentOrderRemittanceAdvice? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(addenda: Addenda) = apply {
                category = addenda.category
                freeform = addenda.freeform
                paymentOrderRemittanceAdvice = addenda.paymentOrderRemittanceAdvice
                additionalProperties = addenda.additionalProperties.toMutableMap()
            }

            /** The type of addenda to pass with the transfer. */
            @JsonProperty("category")
            fun category(category: Category) = apply { this.category = category }

            /** Unstructured `payment_related_information` passed through with the transfer. */
            @JsonProperty("freeform")
            fun freeform(freeform: Freeform) = apply { this.freeform = freeform }

            /**
             * Structured ASC X12 820 remittance advice records. Please reach out to
             * [support@increase.com](mailto:support@increase.com) for more information.
             */
            @JsonProperty("payment_order_remittance_advice")
            fun paymentOrderRemittanceAdvice(
                paymentOrderRemittanceAdvice: PaymentOrderRemittanceAdvice
            ) = apply { this.paymentOrderRemittanceAdvice = paymentOrderRemittanceAdvice }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            @JsonAnySetter
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

            fun build(): Addenda =
                Addenda(
                    checkNotNull(category) { "`category` is required but was not set" },
                    freeform,
                    paymentOrderRemittanceAdvice,
                    additionalProperties.toImmutable(),
                )
        }

        class Category
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val FREEFORM = of("freeform")

                @JvmField
                val PAYMENT_ORDER_REMITTANCE_ADVICE = of("payment_order_remittance_advice")

                @JvmStatic fun of(value: String) = Category(JsonField.of(value))
            }

            enum class Known {
                FREEFORM,
                PAYMENT_ORDER_REMITTANCE_ADVICE,
            }

            enum class Value {
                FREEFORM,
                PAYMENT_ORDER_REMITTANCE_ADVICE,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    FREEFORM -> Value.FREEFORM
                    PAYMENT_ORDER_REMITTANCE_ADVICE -> Value.PAYMENT_ORDER_REMITTANCE_ADVICE
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    FREEFORM -> Known.FREEFORM
                    PAYMENT_ORDER_REMITTANCE_ADVICE -> Known.PAYMENT_ORDER_REMITTANCE_ADVICE
                    else -> throw IncreaseInvalidDataException("Unknown Category: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Category && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Unstructured `payment_related_information` passed through with the transfer. */
        @JsonDeserialize(builder = Freeform.Builder::class)
        @NoAutoDetect
        class Freeform
        private constructor(
            private val entries: List<Entry>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /**
             * Each entry represents an addendum sent with the transfer. Please reach out to
             * [support@increase.com](mailto:support@increase.com) to send more than one addendum.
             */
            @JsonProperty("entries") fun entries(): List<Entry> = entries

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var entries: List<Entry>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(freeform: Freeform) = apply {
                    entries = freeform.entries.toMutableList()
                    additionalProperties = freeform.additionalProperties.toMutableMap()
                }

                /**
                 * Each entry represents an addendum sent with the transfer. Please reach out to
                 * [support@increase.com](mailto:support@increase.com) to send more than one
                 * addendum.
                 */
                @JsonProperty("entries")
                fun entries(entries: List<Entry>) = apply { this.entries = entries }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                @JsonAnySetter
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

                fun build(): Freeform =
                    Freeform(
                        checkNotNull(entries) { "`entries` is required but was not set" }
                            .toImmutable(),
                        additionalProperties.toImmutable()
                    )
            }

            @JsonDeserialize(builder = Entry.Builder::class)
            @NoAutoDetect
            class Entry
            private constructor(
                private val paymentRelatedInformation: String,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                /** The payment related information passed in the addendum. */
                @JsonProperty("payment_related_information")
                fun paymentRelatedInformation(): String = paymentRelatedInformation

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var paymentRelatedInformation: String? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(entry: Entry) = apply {
                        paymentRelatedInformation = entry.paymentRelatedInformation
                        additionalProperties = entry.additionalProperties.toMutableMap()
                    }

                    /** The payment related information passed in the addendum. */
                    @JsonProperty("payment_related_information")
                    fun paymentRelatedInformation(paymentRelatedInformation: String) = apply {
                        this.paymentRelatedInformation = paymentRelatedInformation
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    @JsonAnySetter
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

                    fun build(): Entry =
                        Entry(
                            checkNotNull(paymentRelatedInformation) {
                                "`paymentRelatedInformation` is required but was not set"
                            },
                            additionalProperties.toImmutable()
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Entry && paymentRelatedInformation == other.paymentRelatedInformation && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(paymentRelatedInformation, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Entry{paymentRelatedInformation=$paymentRelatedInformation, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Freeform && entries == other.entries && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(entries, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Freeform{entries=$entries, additionalProperties=$additionalProperties}"
        }

        /**
         * Structured ASC X12 820 remittance advice records. Please reach out to
         * [support@increase.com](mailto:support@increase.com) for more information.
         */
        @JsonDeserialize(builder = PaymentOrderRemittanceAdvice.Builder::class)
        @NoAutoDetect
        class PaymentOrderRemittanceAdvice
        private constructor(
            private val invoices: List<Invoice>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /** ASC X12 RMR records for this specific transfer. */
            @JsonProperty("invoices") fun invoices(): List<Invoice> = invoices

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var invoices: List<Invoice>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(paymentOrderRemittanceAdvice: PaymentOrderRemittanceAdvice) =
                    apply {
                        invoices = paymentOrderRemittanceAdvice.invoices.toMutableList()
                        additionalProperties =
                            paymentOrderRemittanceAdvice.additionalProperties.toMutableMap()
                    }

                /** ASC X12 RMR records for this specific transfer. */
                @JsonProperty("invoices")
                fun invoices(invoices: List<Invoice>) = apply { this.invoices = invoices }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                @JsonAnySetter
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

                fun build(): PaymentOrderRemittanceAdvice =
                    PaymentOrderRemittanceAdvice(
                        checkNotNull(invoices) { "`invoices` is required but was not set" }
                            .toImmutable(),
                        additionalProperties.toImmutable()
                    )
            }

            @JsonDeserialize(builder = Invoice.Builder::class)
            @NoAutoDetect
            class Invoice
            private constructor(
                private val invoiceNumber: String,
                private val paidAmount: Long,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                /**
                 * The invoice number for this reference, determined in advance with the receiver.
                 */
                @JsonProperty("invoice_number") fun invoiceNumber(): String = invoiceNumber

                /**
                 * The amount that was paid for this invoice in the minor unit of its currency. For
                 * dollars, for example, this is cents.
                 */
                @JsonProperty("paid_amount") fun paidAmount(): Long = paidAmount

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var invoiceNumber: String? = null
                    private var paidAmount: Long? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(invoice: Invoice) = apply {
                        invoiceNumber = invoice.invoiceNumber
                        paidAmount = invoice.paidAmount
                        additionalProperties = invoice.additionalProperties.toMutableMap()
                    }

                    /**
                     * The invoice number for this reference, determined in advance with the
                     * receiver.
                     */
                    @JsonProperty("invoice_number")
                    fun invoiceNumber(invoiceNumber: String) = apply {
                        this.invoiceNumber = invoiceNumber
                    }

                    /**
                     * The amount that was paid for this invoice in the minor unit of its currency.
                     * For dollars, for example, this is cents.
                     */
                    @JsonProperty("paid_amount")
                    fun paidAmount(paidAmount: Long) = apply { this.paidAmount = paidAmount }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    @JsonAnySetter
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

                    fun build(): Invoice =
                        Invoice(
                            checkNotNull(invoiceNumber) {
                                "`invoiceNumber` is required but was not set"
                            },
                            checkNotNull(paidAmount) { "`paidAmount` is required but was not set" },
                            additionalProperties.toImmutable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Invoice && invoiceNumber == other.invoiceNumber && paidAmount == other.paidAmount && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(invoiceNumber, paidAmount, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Invoice{invoiceNumber=$invoiceNumber, paidAmount=$paidAmount, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is PaymentOrderRemittanceAdvice && invoices == other.invoices && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(invoices, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PaymentOrderRemittanceAdvice{invoices=$invoices, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Addenda && category == other.category && freeform == other.freeform && paymentOrderRemittanceAdvice == other.paymentOrderRemittanceAdvice && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(category, freeform, paymentOrderRemittanceAdvice, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Addenda{category=$category, freeform=$freeform, paymentOrderRemittanceAdvice=$paymentOrderRemittanceAdvice, additionalProperties=$additionalProperties}"
    }

    class DestinationAccountHolder
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val BUSINESS = of("business")

            @JvmField val INDIVIDUAL = of("individual")

            @JvmField val UNKNOWN = of("unknown")

            @JvmStatic fun of(value: String) = DestinationAccountHolder(JsonField.of(value))
        }

        enum class Known {
            BUSINESS,
            INDIVIDUAL,
            UNKNOWN,
        }

        enum class Value {
            BUSINESS,
            INDIVIDUAL,
            UNKNOWN,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                BUSINESS -> Value.BUSINESS
                INDIVIDUAL -> Value.INDIVIDUAL
                UNKNOWN -> Value.UNKNOWN
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                BUSINESS -> Known.BUSINESS
                INDIVIDUAL -> Known.INDIVIDUAL
                UNKNOWN -> Known.UNKNOWN
                else ->
                    throw IncreaseInvalidDataException("Unknown DestinationAccountHolder: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is DestinationAccountHolder && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Funding
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val CHECKING = of("checking")

            @JvmField val SAVINGS = of("savings")

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

        fun value(): Value =
            when (this) {
                CHECKING -> Value.CHECKING
                SAVINGS -> Value.SAVINGS
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                CHECKING -> Known.CHECKING
                SAVINGS -> Known.SAVINGS
                else -> throw IncreaseInvalidDataException("Unknown Funding: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Funding && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Configuration for how the effective date of the transfer will be set. This determines
     * same-day vs future-dated settlement timing. If not set, defaults to a `settlement_schedule`
     * of `same_day`. If set, exactly one of the child attributes must be set.
     */
    @JsonDeserialize(builder = PreferredEffectiveDate.Builder::class)
    @NoAutoDetect
    class PreferredEffectiveDate
    private constructor(
        private val date: LocalDate?,
        private val settlementSchedule: SettlementSchedule?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /**
         * A specific date in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format to use as
         * the effective date when submitting this transfer.
         */
        @JsonProperty("date") fun date(): Optional<LocalDate> = Optional.ofNullable(date)

        /** A schedule by which Increase will choose an effective date for the transfer. */
        @JsonProperty("settlement_schedule")
        fun settlementSchedule(): Optional<SettlementSchedule> =
            Optional.ofNullable(settlementSchedule)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var date: LocalDate? = null
            private var settlementSchedule: SettlementSchedule? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(preferredEffectiveDate: PreferredEffectiveDate) = apply {
                date = preferredEffectiveDate.date
                settlementSchedule = preferredEffectiveDate.settlementSchedule
                additionalProperties = preferredEffectiveDate.additionalProperties.toMutableMap()
            }

            /**
             * A specific date in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format to use
             * as the effective date when submitting this transfer.
             */
            @JsonProperty("date") fun date(date: LocalDate) = apply { this.date = date }

            /** A schedule by which Increase will choose an effective date for the transfer. */
            @JsonProperty("settlement_schedule")
            fun settlementSchedule(settlementSchedule: SettlementSchedule) = apply {
                this.settlementSchedule = settlementSchedule
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            @JsonAnySetter
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

            fun build(): PreferredEffectiveDate =
                PreferredEffectiveDate(
                    date,
                    settlementSchedule,
                    additionalProperties.toImmutable(),
                )
        }

        class SettlementSchedule
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val SAME_DAY = of("same_day")

                @JvmField val FUTURE_DATED = of("future_dated")

                @JvmStatic fun of(value: String) = SettlementSchedule(JsonField.of(value))
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

            fun value(): Value =
                when (this) {
                    SAME_DAY -> Value.SAME_DAY
                    FUTURE_DATED -> Value.FUTURE_DATED
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    SAME_DAY -> Known.SAME_DAY
                    FUTURE_DATED -> Known.FUTURE_DATED
                    else -> throw IncreaseInvalidDataException("Unknown SettlementSchedule: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is SettlementSchedule && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PreferredEffectiveDate && date == other.date && settlementSchedule == other.settlementSchedule && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(date, settlementSchedule, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PreferredEffectiveDate{date=$date, settlementSchedule=$settlementSchedule, additionalProperties=$additionalProperties}"
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

    class TransactionTiming
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val SYNCHRONOUS = of("synchronous")

            @JvmField val ASYNCHRONOUS = of("asynchronous")

            @JvmStatic fun of(value: String) = TransactionTiming(JsonField.of(value))
        }

        enum class Known {
            SYNCHRONOUS,
            ASYNCHRONOUS,
        }

        enum class Value {
            SYNCHRONOUS,
            ASYNCHRONOUS,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                SYNCHRONOUS -> Value.SYNCHRONOUS
                ASYNCHRONOUS -> Value.ASYNCHRONOUS
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                SYNCHRONOUS -> Known.SYNCHRONOUS
                ASYNCHRONOUS -> Known.ASYNCHRONOUS
                else -> throw IncreaseInvalidDataException("Unknown TransactionTiming: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is TransactionTiming && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AchTransferCreateParams && accountId == other.accountId && amount == other.amount && statementDescriptor == other.statementDescriptor && accountNumber == other.accountNumber && addenda == other.addenda && companyDescriptiveDate == other.companyDescriptiveDate && companyDiscretionaryData == other.companyDiscretionaryData && companyEntryDescription == other.companyEntryDescription && companyName == other.companyName && destinationAccountHolder == other.destinationAccountHolder && externalAccountId == other.externalAccountId && funding == other.funding && individualId == other.individualId && individualName == other.individualName && preferredEffectiveDate == other.preferredEffectiveDate && requireApproval == other.requireApproval && routingNumber == other.routingNumber && standardEntryClassCode == other.standardEntryClassCode && transactionTiming == other.transactionTiming && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(accountId, amount, statementDescriptor, accountNumber, addenda, companyDescriptiveDate, companyDiscretionaryData, companyEntryDescription, companyName, destinationAccountHolder, externalAccountId, funding, individualId, individualName, preferredEffectiveDate, requireApproval, routingNumber, standardEntryClassCode, transactionTiming, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "AchTransferCreateParams{accountId=$accountId, amount=$amount, statementDescriptor=$statementDescriptor, accountNumber=$accountNumber, addenda=$addenda, companyDescriptiveDate=$companyDescriptiveDate, companyDiscretionaryData=$companyDiscretionaryData, companyEntryDescription=$companyEntryDescription, companyName=$companyName, destinationAccountHolder=$destinationAccountHolder, externalAccountId=$externalAccountId, funding=$funding, individualId=$individualId, individualName=$individualName, preferredEffectiveDate=$preferredEffectiveDate, requireApproval=$requireApproval, routingNumber=$routingNumber, standardEntryClassCode=$standardEntryClassCode, transactionTiming=$transactionTiming, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}
