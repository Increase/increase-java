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
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

class SimulationInboundAchTransferCreateParams
constructor(
    private val accountNumberId: String,
    private val amount: Long,
    private val companyDescriptiveDate: String?,
    private val companyDiscretionaryData: String?,
    private val companyEntryDescription: String?,
    private val companyId: String?,
    private val companyName: String?,
    private val receiverIdNumber: String?,
    private val receiverName: String?,
    private val resolveAt: OffsetDateTime?,
    private val standardEntryClassCode: StandardEntryClassCode?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun accountNumberId(): String = accountNumberId

    fun amount(): Long = amount

    fun companyDescriptiveDate(): Optional<String> = Optional.ofNullable(companyDescriptiveDate)

    fun companyDiscretionaryData(): Optional<String> = Optional.ofNullable(companyDiscretionaryData)

    fun companyEntryDescription(): Optional<String> = Optional.ofNullable(companyEntryDescription)

    fun companyId(): Optional<String> = Optional.ofNullable(companyId)

    fun companyName(): Optional<String> = Optional.ofNullable(companyName)

    fun receiverIdNumber(): Optional<String> = Optional.ofNullable(receiverIdNumber)

    fun receiverName(): Optional<String> = Optional.ofNullable(receiverName)

    fun resolveAt(): Optional<OffsetDateTime> = Optional.ofNullable(resolveAt)

    fun standardEntryClassCode(): Optional<StandardEntryClassCode> =
        Optional.ofNullable(standardEntryClassCode)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    @JvmSynthetic
    internal fun getBody(): SimulationInboundAchTransferCreateBody {
        return SimulationInboundAchTransferCreateBody(
            accountNumberId,
            amount,
            companyDescriptiveDate,
            companyDiscretionaryData,
            companyEntryDescription,
            companyId,
            companyName,
            receiverIdNumber,
            receiverName,
            resolveAt,
            standardEntryClassCode,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @JsonDeserialize(builder = SimulationInboundAchTransferCreateBody.Builder::class)
    @NoAutoDetect
    class SimulationInboundAchTransferCreateBody
    internal constructor(
        private val accountNumberId: String?,
        private val amount: Long?,
        private val companyDescriptiveDate: String?,
        private val companyDiscretionaryData: String?,
        private val companyEntryDescription: String?,
        private val companyId: String?,
        private val companyName: String?,
        private val receiverIdNumber: String?,
        private val receiverName: String?,
        private val resolveAt: OffsetDateTime?,
        private val standardEntryClassCode: StandardEntryClassCode?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The identifier of the Account Number the inbound ACH Transfer is for. */
        @JsonProperty("account_number_id") fun accountNumberId(): String? = accountNumberId

        /**
         * The transfer amount in cents. A positive amount originates a credit transfer pushing
         * funds to the receiving account. A negative amount originates a debit transfer pulling
         * funds from the receiving account.
         */
        @JsonProperty("amount") fun amount(): Long? = amount

        /** The description of the date of the transfer. */
        @JsonProperty("company_descriptive_date")
        fun companyDescriptiveDate(): String? = companyDescriptiveDate

        /** Data associated with the transfer set by the sender. */
        @JsonProperty("company_discretionary_data")
        fun companyDiscretionaryData(): String? = companyDiscretionaryData

        /** The description of the transfer set by the sender. */
        @JsonProperty("company_entry_description")
        fun companyEntryDescription(): String? = companyEntryDescription

        /** The sender's company ID. */
        @JsonProperty("company_id") fun companyId(): String? = companyId

        /** The name of the sender. */
        @JsonProperty("company_name") fun companyName(): String? = companyName

        /** The ID of the receiver of the transfer. */
        @JsonProperty("receiver_id_number") fun receiverIdNumber(): String? = receiverIdNumber

        /** The name of the receiver of the transfer. */
        @JsonProperty("receiver_name") fun receiverName(): String? = receiverName

        /**
         * The time at which the transfer should be resolved. If not provided will resolve
         * immediately.
         */
        @JsonProperty("resolve_at") fun resolveAt(): OffsetDateTime? = resolveAt

        /** The standard entry class code for the transfer. */
        @JsonProperty("standard_entry_class_code")
        fun standardEntryClassCode(): StandardEntryClassCode? = standardEntryClassCode

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var accountNumberId: String? = null
            private var amount: Long? = null
            private var companyDescriptiveDate: String? = null
            private var companyDiscretionaryData: String? = null
            private var companyEntryDescription: String? = null
            private var companyId: String? = null
            private var companyName: String? = null
            private var receiverIdNumber: String? = null
            private var receiverName: String? = null
            private var resolveAt: OffsetDateTime? = null
            private var standardEntryClassCode: StandardEntryClassCode? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                simulationInboundAchTransferCreateBody: SimulationInboundAchTransferCreateBody
            ) = apply {
                this.accountNumberId = simulationInboundAchTransferCreateBody.accountNumberId
                this.amount = simulationInboundAchTransferCreateBody.amount
                this.companyDescriptiveDate =
                    simulationInboundAchTransferCreateBody.companyDescriptiveDate
                this.companyDiscretionaryData =
                    simulationInboundAchTransferCreateBody.companyDiscretionaryData
                this.companyEntryDescription =
                    simulationInboundAchTransferCreateBody.companyEntryDescription
                this.companyId = simulationInboundAchTransferCreateBody.companyId
                this.companyName = simulationInboundAchTransferCreateBody.companyName
                this.receiverIdNumber = simulationInboundAchTransferCreateBody.receiverIdNumber
                this.receiverName = simulationInboundAchTransferCreateBody.receiverName
                this.resolveAt = simulationInboundAchTransferCreateBody.resolveAt
                this.standardEntryClassCode =
                    simulationInboundAchTransferCreateBody.standardEntryClassCode
                additionalProperties(simulationInboundAchTransferCreateBody.additionalProperties)
            }

            /** The identifier of the Account Number the inbound ACH Transfer is for. */
            @JsonProperty("account_number_id")
            fun accountNumberId(accountNumberId: String) = apply {
                this.accountNumberId = accountNumberId
            }

            /**
             * The transfer amount in cents. A positive amount originates a credit transfer pushing
             * funds to the receiving account. A negative amount originates a debit transfer pulling
             * funds from the receiving account.
             */
            @JsonProperty("amount") fun amount(amount: Long) = apply { this.amount = amount }

            /** The description of the date of the transfer. */
            @JsonProperty("company_descriptive_date")
            fun companyDescriptiveDate(companyDescriptiveDate: String) = apply {
                this.companyDescriptiveDate = companyDescriptiveDate
            }

            /** Data associated with the transfer set by the sender. */
            @JsonProperty("company_discretionary_data")
            fun companyDiscretionaryData(companyDiscretionaryData: String) = apply {
                this.companyDiscretionaryData = companyDiscretionaryData
            }

            /** The description of the transfer set by the sender. */
            @JsonProperty("company_entry_description")
            fun companyEntryDescription(companyEntryDescription: String) = apply {
                this.companyEntryDescription = companyEntryDescription
            }

            /** The sender's company ID. */
            @JsonProperty("company_id")
            fun companyId(companyId: String) = apply { this.companyId = companyId }

            /** The name of the sender. */
            @JsonProperty("company_name")
            fun companyName(companyName: String) = apply { this.companyName = companyName }

            /** The ID of the receiver of the transfer. */
            @JsonProperty("receiver_id_number")
            fun receiverIdNumber(receiverIdNumber: String) = apply {
                this.receiverIdNumber = receiverIdNumber
            }

            /** The name of the receiver of the transfer. */
            @JsonProperty("receiver_name")
            fun receiverName(receiverName: String) = apply { this.receiverName = receiverName }

            /**
             * The time at which the transfer should be resolved. If not provided will resolve
             * immediately.
             */
            @JsonProperty("resolve_at")
            fun resolveAt(resolveAt: OffsetDateTime) = apply { this.resolveAt = resolveAt }

            /** The standard entry class code for the transfer. */
            @JsonProperty("standard_entry_class_code")
            fun standardEntryClassCode(standardEntryClassCode: StandardEntryClassCode) = apply {
                this.standardEntryClassCode = standardEntryClassCode
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

            fun build(): SimulationInboundAchTransferCreateBody =
                SimulationInboundAchTransferCreateBody(
                    checkNotNull(accountNumberId) {
                        "`accountNumberId` is required but was not set"
                    },
                    checkNotNull(amount) { "`amount` is required but was not set" },
                    companyDescriptiveDate,
                    companyDiscretionaryData,
                    companyEntryDescription,
                    companyId,
                    companyName,
                    receiverIdNumber,
                    receiverName,
                    resolveAt,
                    standardEntryClassCode,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is SimulationInboundAchTransferCreateBody && accountNumberId == other.accountNumberId && amount == other.amount && companyDescriptiveDate == other.companyDescriptiveDate && companyDiscretionaryData == other.companyDiscretionaryData && companyEntryDescription == other.companyEntryDescription && companyId == other.companyId && companyName == other.companyName && receiverIdNumber == other.receiverIdNumber && receiverName == other.receiverName && resolveAt == other.resolveAt && standardEntryClassCode == other.standardEntryClassCode && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(accountNumberId, amount, companyDescriptiveDate, companyDiscretionaryData, companyEntryDescription, companyId, companyName, receiverIdNumber, receiverName, resolveAt, standardEntryClassCode, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SimulationInboundAchTransferCreateBody{accountNumberId=$accountNumberId, amount=$amount, companyDescriptiveDate=$companyDescriptiveDate, companyDiscretionaryData=$companyDiscretionaryData, companyEntryDescription=$companyEntryDescription, companyId=$companyId, companyName=$companyName, receiverIdNumber=$receiverIdNumber, receiverName=$receiverName, resolveAt=$resolveAt, standardEntryClassCode=$standardEntryClassCode, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var accountNumberId: String? = null
        private var amount: Long? = null
        private var companyDescriptiveDate: String? = null
        private var companyDiscretionaryData: String? = null
        private var companyEntryDescription: String? = null
        private var companyId: String? = null
        private var companyName: String? = null
        private var receiverIdNumber: String? = null
        private var receiverName: String? = null
        private var resolveAt: OffsetDateTime? = null
        private var standardEntryClassCode: StandardEntryClassCode? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            simulationInboundAchTransferCreateParams: SimulationInboundAchTransferCreateParams
        ) = apply {
            accountNumberId = simulationInboundAchTransferCreateParams.accountNumberId
            amount = simulationInboundAchTransferCreateParams.amount
            companyDescriptiveDate = simulationInboundAchTransferCreateParams.companyDescriptiveDate
            companyDiscretionaryData =
                simulationInboundAchTransferCreateParams.companyDiscretionaryData
            companyEntryDescription =
                simulationInboundAchTransferCreateParams.companyEntryDescription
            companyId = simulationInboundAchTransferCreateParams.companyId
            companyName = simulationInboundAchTransferCreateParams.companyName
            receiverIdNumber = simulationInboundAchTransferCreateParams.receiverIdNumber
            receiverName = simulationInboundAchTransferCreateParams.receiverName
            resolveAt = simulationInboundAchTransferCreateParams.resolveAt
            standardEntryClassCode = simulationInboundAchTransferCreateParams.standardEntryClassCode
            additionalHeaders =
                simulationInboundAchTransferCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                simulationInboundAchTransferCreateParams.additionalQueryParams.toBuilder()
            additionalBodyProperties =
                simulationInboundAchTransferCreateParams.additionalBodyProperties.toMutableMap()
        }

        /** The identifier of the Account Number the inbound ACH Transfer is for. */
        fun accountNumberId(accountNumberId: String) = apply {
            this.accountNumberId = accountNumberId
        }

        /**
         * The transfer amount in cents. A positive amount originates a credit transfer pushing
         * funds to the receiving account. A negative amount originates a debit transfer pulling
         * funds from the receiving account.
         */
        fun amount(amount: Long) = apply { this.amount = amount }

        /** The description of the date of the transfer. */
        fun companyDescriptiveDate(companyDescriptiveDate: String) = apply {
            this.companyDescriptiveDate = companyDescriptiveDate
        }

        /** Data associated with the transfer set by the sender. */
        fun companyDiscretionaryData(companyDiscretionaryData: String) = apply {
            this.companyDiscretionaryData = companyDiscretionaryData
        }

        /** The description of the transfer set by the sender. */
        fun companyEntryDescription(companyEntryDescription: String) = apply {
            this.companyEntryDescription = companyEntryDescription
        }

        /** The sender's company ID. */
        fun companyId(companyId: String) = apply { this.companyId = companyId }

        /** The name of the sender. */
        fun companyName(companyName: String) = apply { this.companyName = companyName }

        /** The ID of the receiver of the transfer. */
        fun receiverIdNumber(receiverIdNumber: String) = apply {
            this.receiverIdNumber = receiverIdNumber
        }

        /** The name of the receiver of the transfer. */
        fun receiverName(receiverName: String) = apply { this.receiverName = receiverName }

        /**
         * The time at which the transfer should be resolved. If not provided will resolve
         * immediately.
         */
        fun resolveAt(resolveAt: OffsetDateTime) = apply { this.resolveAt = resolveAt }

        /** The standard entry class code for the transfer. */
        fun standardEntryClassCode(standardEntryClassCode: StandardEntryClassCode) = apply {
            this.standardEntryClassCode = standardEntryClassCode
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

        fun build(): SimulationInboundAchTransferCreateParams =
            SimulationInboundAchTransferCreateParams(
                checkNotNull(accountNumberId) { "`accountNumberId` is required but was not set" },
                checkNotNull(amount) { "`amount` is required but was not set" },
                companyDescriptiveDate,
                companyDiscretionaryData,
                companyEntryDescription,
                companyId,
                companyName,
                receiverIdNumber,
                receiverName,
                resolveAt,
                standardEntryClassCode,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
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

            @JvmField val POINT_OF_SALE = of("point_of_sale")

            @JvmField val TELEPHONE_INITIATED = of("telephone_initiated")

            @JvmField val CUSTOMER_INITIATED = of("customer_initiated")

            @JvmField val ACCOUNTS_RECEIVABLE = of("accounts_receivable")

            @JvmField val MACHINE_TRANSFER = of("machine_transfer")

            @JvmField val SHARED_NETWORK_TRANSACTION = of("shared_network_transaction")

            @JvmField val REPRESENTED_CHECK = of("represented_check")

            @JvmField val BACK_OFFICE_CONVERSION = of("back_office_conversion")

            @JvmField val POINT_OF_PURCHASE = of("point_of_purchase")

            @JvmField val CHECK_TRUNCATION = of("check_truncation")

            @JvmField val DESTROYED_CHECK = of("destroyed_check")

            @JvmField val INTERNATIONAL_ACH_TRANSACTION = of("international_ach_transaction")

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

        return /* spotless:off */ other is SimulationInboundAchTransferCreateParams && accountNumberId == other.accountNumberId && amount == other.amount && companyDescriptiveDate == other.companyDescriptiveDate && companyDiscretionaryData == other.companyDiscretionaryData && companyEntryDescription == other.companyEntryDescription && companyId == other.companyId && companyName == other.companyName && receiverIdNumber == other.receiverIdNumber && receiverName == other.receiverName && resolveAt == other.resolveAt && standardEntryClassCode == other.standardEntryClassCode && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(accountNumberId, amount, companyDescriptiveDate, companyDiscretionaryData, companyEntryDescription, companyId, companyName, receiverIdNumber, receiverName, resolveAt, standardEntryClassCode, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "SimulationInboundAchTransferCreateParams{accountNumberId=$accountNumberId, amount=$amount, companyDescriptiveDate=$companyDescriptiveDate, companyDiscretionaryData=$companyDiscretionaryData, companyEntryDescription=$companyEntryDescription, companyId=$companyId, companyName=$companyName, receiverIdNumber=$receiverIdNumber, receiverName=$receiverName, resolveAt=$resolveAt, standardEntryClassCode=$standardEntryClassCode, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}
