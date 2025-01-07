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
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import com.increase.api.core.immutableEmptyMap
import com.increase.api.core.toImmutable
import com.increase.api.errors.IncreaseInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

/**
 * Simulates an inbound ACH transfer to your account. This imitates initiating a transfer to an
 * Increase account from a different financial institution. The transfer may be either a credit or a
 * debit depending on if the `amount` is positive or negative. The result of calling this API will
 * contain the created transfer. You can pass a `resolve_at` parameter to allow for a window to
 * [action on the Inbound ACH Transfer](https://increase.com/documentation/receiving-ach-transfers).
 * Alternatively, if you don't pass the `resolve_at` parameter the result will contain either a
 * [Transaction](#transactions) or a [Declined Transaction](#declined-transactions) depending on
 * whether or not the transfer is allowed.
 */
class SimulationInboundAchTransferCreateParams
constructor(
    private val body: SimulationInboundAchTransferCreateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    /** The identifier of the Account Number the inbound ACH Transfer is for. */
    fun accountNumberId(): String = body.accountNumberId()

    /**
     * The transfer amount in cents. A positive amount originates a credit transfer pushing funds to
     * the receiving account. A negative amount originates a debit transfer pulling funds from the
     * receiving account.
     */
    fun amount(): Long = body.amount()

    /** The description of the date of the transfer. */
    fun companyDescriptiveDate(): Optional<String> = body.companyDescriptiveDate()

    /** Data associated with the transfer set by the sender. */
    fun companyDiscretionaryData(): Optional<String> = body.companyDiscretionaryData()

    /** The description of the transfer set by the sender. */
    fun companyEntryDescription(): Optional<String> = body.companyEntryDescription()

    /** The sender's company ID. */
    fun companyId(): Optional<String> = body.companyId()

    /** The name of the sender. */
    fun companyName(): Optional<String> = body.companyName()

    /** The ID of the receiver of the transfer. */
    fun receiverIdNumber(): Optional<String> = body.receiverIdNumber()

    /** The name of the receiver of the transfer. */
    fun receiverName(): Optional<String> = body.receiverName()

    /**
     * The time at which the transfer should be resolved. If not provided will resolve immediately.
     */
    fun resolveAt(): Optional<OffsetDateTime> = body.resolveAt()

    /** The standard entry class code for the transfer. */
    fun standardEntryClassCode(): Optional<StandardEntryClassCode> = body.standardEntryClassCode()

    /** The identifier of the Account Number the inbound ACH Transfer is for. */
    fun _accountNumberId(): JsonField<String> = body._accountNumberId()

    /**
     * The transfer amount in cents. A positive amount originates a credit transfer pushing funds to
     * the receiving account. A negative amount originates a debit transfer pulling funds from the
     * receiving account.
     */
    fun _amount(): JsonField<Long> = body._amount()

    /** The description of the date of the transfer. */
    fun _companyDescriptiveDate(): JsonField<String> = body._companyDescriptiveDate()

    /** Data associated with the transfer set by the sender. */
    fun _companyDiscretionaryData(): JsonField<String> = body._companyDiscretionaryData()

    /** The description of the transfer set by the sender. */
    fun _companyEntryDescription(): JsonField<String> = body._companyEntryDescription()

    /** The sender's company ID. */
    fun _companyId(): JsonField<String> = body._companyId()

    /** The name of the sender. */
    fun _companyName(): JsonField<String> = body._companyName()

    /** The ID of the receiver of the transfer. */
    fun _receiverIdNumber(): JsonField<String> = body._receiverIdNumber()

    /** The name of the receiver of the transfer. */
    fun _receiverName(): JsonField<String> = body._receiverName()

    /**
     * The time at which the transfer should be resolved. If not provided will resolve immediately.
     */
    fun _resolveAt(): JsonField<OffsetDateTime> = body._resolveAt()

    /** The standard entry class code for the transfer. */
    fun _standardEntryClassCode(): JsonField<StandardEntryClassCode> =
        body._standardEntryClassCode()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun getBody(): SimulationInboundAchTransferCreateBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class SimulationInboundAchTransferCreateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("account_number_id")
        @ExcludeMissing
        private val accountNumberId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("amount")
        @ExcludeMissing
        private val amount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("company_descriptive_date")
        @ExcludeMissing
        private val companyDescriptiveDate: JsonField<String> = JsonMissing.of(),
        @JsonProperty("company_discretionary_data")
        @ExcludeMissing
        private val companyDiscretionaryData: JsonField<String> = JsonMissing.of(),
        @JsonProperty("company_entry_description")
        @ExcludeMissing
        private val companyEntryDescription: JsonField<String> = JsonMissing.of(),
        @JsonProperty("company_id")
        @ExcludeMissing
        private val companyId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("company_name")
        @ExcludeMissing
        private val companyName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("receiver_id_number")
        @ExcludeMissing
        private val receiverIdNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("receiver_name")
        @ExcludeMissing
        private val receiverName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("resolve_at")
        @ExcludeMissing
        private val resolveAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("standard_entry_class_code")
        @ExcludeMissing
        private val standardEntryClassCode: JsonField<StandardEntryClassCode> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The identifier of the Account Number the inbound ACH Transfer is for. */
        fun accountNumberId(): String = accountNumberId.getRequired("account_number_id")

        /**
         * The transfer amount in cents. A positive amount originates a credit transfer pushing
         * funds to the receiving account. A negative amount originates a debit transfer pulling
         * funds from the receiving account.
         */
        fun amount(): Long = amount.getRequired("amount")

        /** The description of the date of the transfer. */
        fun companyDescriptiveDate(): Optional<String> =
            Optional.ofNullable(companyDescriptiveDate.getNullable("company_descriptive_date"))

        /** Data associated with the transfer set by the sender. */
        fun companyDiscretionaryData(): Optional<String> =
            Optional.ofNullable(companyDiscretionaryData.getNullable("company_discretionary_data"))

        /** The description of the transfer set by the sender. */
        fun companyEntryDescription(): Optional<String> =
            Optional.ofNullable(companyEntryDescription.getNullable("company_entry_description"))

        /** The sender's company ID. */
        fun companyId(): Optional<String> = Optional.ofNullable(companyId.getNullable("company_id"))

        /** The name of the sender. */
        fun companyName(): Optional<String> =
            Optional.ofNullable(companyName.getNullable("company_name"))

        /** The ID of the receiver of the transfer. */
        fun receiverIdNumber(): Optional<String> =
            Optional.ofNullable(receiverIdNumber.getNullable("receiver_id_number"))

        /** The name of the receiver of the transfer. */
        fun receiverName(): Optional<String> =
            Optional.ofNullable(receiverName.getNullable("receiver_name"))

        /**
         * The time at which the transfer should be resolved. If not provided will resolve
         * immediately.
         */
        fun resolveAt(): Optional<OffsetDateTime> =
            Optional.ofNullable(resolveAt.getNullable("resolve_at"))

        /** The standard entry class code for the transfer. */
        fun standardEntryClassCode(): Optional<StandardEntryClassCode> =
            Optional.ofNullable(standardEntryClassCode.getNullable("standard_entry_class_code"))

        /** The identifier of the Account Number the inbound ACH Transfer is for. */
        @JsonProperty("account_number_id")
        @ExcludeMissing
        fun _accountNumberId(): JsonField<String> = accountNumberId

        /**
         * The transfer amount in cents. A positive amount originates a credit transfer pushing
         * funds to the receiving account. A negative amount originates a debit transfer pulling
         * funds from the receiving account.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

        /** The description of the date of the transfer. */
        @JsonProperty("company_descriptive_date")
        @ExcludeMissing
        fun _companyDescriptiveDate(): JsonField<String> = companyDescriptiveDate

        /** Data associated with the transfer set by the sender. */
        @JsonProperty("company_discretionary_data")
        @ExcludeMissing
        fun _companyDiscretionaryData(): JsonField<String> = companyDiscretionaryData

        /** The description of the transfer set by the sender. */
        @JsonProperty("company_entry_description")
        @ExcludeMissing
        fun _companyEntryDescription(): JsonField<String> = companyEntryDescription

        /** The sender's company ID. */
        @JsonProperty("company_id") @ExcludeMissing fun _companyId(): JsonField<String> = companyId

        /** The name of the sender. */
        @JsonProperty("company_name")
        @ExcludeMissing
        fun _companyName(): JsonField<String> = companyName

        /** The ID of the receiver of the transfer. */
        @JsonProperty("receiver_id_number")
        @ExcludeMissing
        fun _receiverIdNumber(): JsonField<String> = receiverIdNumber

        /** The name of the receiver of the transfer. */
        @JsonProperty("receiver_name")
        @ExcludeMissing
        fun _receiverName(): JsonField<String> = receiverName

        /**
         * The time at which the transfer should be resolved. If not provided will resolve
         * immediately.
         */
        @JsonProperty("resolve_at")
        @ExcludeMissing
        fun _resolveAt(): JsonField<OffsetDateTime> = resolveAt

        /** The standard entry class code for the transfer. */
        @JsonProperty("standard_entry_class_code")
        @ExcludeMissing
        fun _standardEntryClassCode(): JsonField<StandardEntryClassCode> = standardEntryClassCode

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): SimulationInboundAchTransferCreateBody = apply {
            if (!validated) {
                accountNumberId()
                amount()
                companyDescriptiveDate()
                companyDiscretionaryData()
                companyEntryDescription()
                companyId()
                companyName()
                receiverIdNumber()
                receiverName()
                resolveAt()
                standardEntryClassCode()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var accountNumberId: JsonField<String>? = null
            private var amount: JsonField<Long>? = null
            private var companyDescriptiveDate: JsonField<String> = JsonMissing.of()
            private var companyDiscretionaryData: JsonField<String> = JsonMissing.of()
            private var companyEntryDescription: JsonField<String> = JsonMissing.of()
            private var companyId: JsonField<String> = JsonMissing.of()
            private var companyName: JsonField<String> = JsonMissing.of()
            private var receiverIdNumber: JsonField<String> = JsonMissing.of()
            private var receiverName: JsonField<String> = JsonMissing.of()
            private var resolveAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var standardEntryClassCode: JsonField<StandardEntryClassCode> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                simulationInboundAchTransferCreateBody: SimulationInboundAchTransferCreateBody
            ) = apply {
                accountNumberId = simulationInboundAchTransferCreateBody.accountNumberId
                amount = simulationInboundAchTransferCreateBody.amount
                companyDescriptiveDate =
                    simulationInboundAchTransferCreateBody.companyDescriptiveDate
                companyDiscretionaryData =
                    simulationInboundAchTransferCreateBody.companyDiscretionaryData
                companyEntryDescription =
                    simulationInboundAchTransferCreateBody.companyEntryDescription
                companyId = simulationInboundAchTransferCreateBody.companyId
                companyName = simulationInboundAchTransferCreateBody.companyName
                receiverIdNumber = simulationInboundAchTransferCreateBody.receiverIdNumber
                receiverName = simulationInboundAchTransferCreateBody.receiverName
                resolveAt = simulationInboundAchTransferCreateBody.resolveAt
                standardEntryClassCode =
                    simulationInboundAchTransferCreateBody.standardEntryClassCode
                additionalProperties =
                    simulationInboundAchTransferCreateBody.additionalProperties.toMutableMap()
            }

            /** The identifier of the Account Number the inbound ACH Transfer is for. */
            fun accountNumberId(accountNumberId: String) =
                accountNumberId(JsonField.of(accountNumberId))

            /** The identifier of the Account Number the inbound ACH Transfer is for. */
            fun accountNumberId(accountNumberId: JsonField<String>) = apply {
                this.accountNumberId = accountNumberId
            }

            /**
             * The transfer amount in cents. A positive amount originates a credit transfer pushing
             * funds to the receiving account. A negative amount originates a debit transfer pulling
             * funds from the receiving account.
             */
            fun amount(amount: Long) = amount(JsonField.of(amount))

            /**
             * The transfer amount in cents. A positive amount originates a credit transfer pushing
             * funds to the receiving account. A negative amount originates a debit transfer pulling
             * funds from the receiving account.
             */
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            /** The description of the date of the transfer. */
            fun companyDescriptiveDate(companyDescriptiveDate: String) =
                companyDescriptiveDate(JsonField.of(companyDescriptiveDate))

            /** The description of the date of the transfer. */
            fun companyDescriptiveDate(companyDescriptiveDate: JsonField<String>) = apply {
                this.companyDescriptiveDate = companyDescriptiveDate
            }

            /** Data associated with the transfer set by the sender. */
            fun companyDiscretionaryData(companyDiscretionaryData: String) =
                companyDiscretionaryData(JsonField.of(companyDiscretionaryData))

            /** Data associated with the transfer set by the sender. */
            fun companyDiscretionaryData(companyDiscretionaryData: JsonField<String>) = apply {
                this.companyDiscretionaryData = companyDiscretionaryData
            }

            /** The description of the transfer set by the sender. */
            fun companyEntryDescription(companyEntryDescription: String) =
                companyEntryDescription(JsonField.of(companyEntryDescription))

            /** The description of the transfer set by the sender. */
            fun companyEntryDescription(companyEntryDescription: JsonField<String>) = apply {
                this.companyEntryDescription = companyEntryDescription
            }

            /** The sender's company ID. */
            fun companyId(companyId: String) = companyId(JsonField.of(companyId))

            /** The sender's company ID. */
            fun companyId(companyId: JsonField<String>) = apply { this.companyId = companyId }

            /** The name of the sender. */
            fun companyName(companyName: String) = companyName(JsonField.of(companyName))

            /** The name of the sender. */
            fun companyName(companyName: JsonField<String>) = apply {
                this.companyName = companyName
            }

            /** The ID of the receiver of the transfer. */
            fun receiverIdNumber(receiverIdNumber: String) =
                receiverIdNumber(JsonField.of(receiverIdNumber))

            /** The ID of the receiver of the transfer. */
            fun receiverIdNumber(receiverIdNumber: JsonField<String>) = apply {
                this.receiverIdNumber = receiverIdNumber
            }

            /** The name of the receiver of the transfer. */
            fun receiverName(receiverName: String) = receiverName(JsonField.of(receiverName))

            /** The name of the receiver of the transfer. */
            fun receiverName(receiverName: JsonField<String>) = apply {
                this.receiverName = receiverName
            }

            /**
             * The time at which the transfer should be resolved. If not provided will resolve
             * immediately.
             */
            fun resolveAt(resolveAt: OffsetDateTime) = resolveAt(JsonField.of(resolveAt))

            /**
             * The time at which the transfer should be resolved. If not provided will resolve
             * immediately.
             */
            fun resolveAt(resolveAt: JsonField<OffsetDateTime>) = apply {
                this.resolveAt = resolveAt
            }

            /** The standard entry class code for the transfer. */
            fun standardEntryClassCode(standardEntryClassCode: StandardEntryClassCode) =
                standardEntryClassCode(JsonField.of(standardEntryClassCode))

            /** The standard entry class code for the transfer. */
            fun standardEntryClassCode(standardEntryClassCode: JsonField<StandardEntryClassCode>) =
                apply {
                    this.standardEntryClassCode = standardEntryClassCode
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

        private var body: SimulationInboundAchTransferCreateBody.Builder =
            SimulationInboundAchTransferCreateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            simulationInboundAchTransferCreateParams: SimulationInboundAchTransferCreateParams
        ) = apply {
            body = simulationInboundAchTransferCreateParams.body.toBuilder()
            additionalHeaders =
                simulationInboundAchTransferCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                simulationInboundAchTransferCreateParams.additionalQueryParams.toBuilder()
        }

        /** The identifier of the Account Number the inbound ACH Transfer is for. */
        fun accountNumberId(accountNumberId: String) = apply {
            body.accountNumberId(accountNumberId)
        }

        /** The identifier of the Account Number the inbound ACH Transfer is for. */
        fun accountNumberId(accountNumberId: JsonField<String>) = apply {
            body.accountNumberId(accountNumberId)
        }

        /**
         * The transfer amount in cents. A positive amount originates a credit transfer pushing
         * funds to the receiving account. A negative amount originates a debit transfer pulling
         * funds from the receiving account.
         */
        fun amount(amount: Long) = apply { body.amount(amount) }

        /**
         * The transfer amount in cents. A positive amount originates a credit transfer pushing
         * funds to the receiving account. A negative amount originates a debit transfer pulling
         * funds from the receiving account.
         */
        fun amount(amount: JsonField<Long>) = apply { body.amount(amount) }

        /** The description of the date of the transfer. */
        fun companyDescriptiveDate(companyDescriptiveDate: String) = apply {
            body.companyDescriptiveDate(companyDescriptiveDate)
        }

        /** The description of the date of the transfer. */
        fun companyDescriptiveDate(companyDescriptiveDate: JsonField<String>) = apply {
            body.companyDescriptiveDate(companyDescriptiveDate)
        }

        /** Data associated with the transfer set by the sender. */
        fun companyDiscretionaryData(companyDiscretionaryData: String) = apply {
            body.companyDiscretionaryData(companyDiscretionaryData)
        }

        /** Data associated with the transfer set by the sender. */
        fun companyDiscretionaryData(companyDiscretionaryData: JsonField<String>) = apply {
            body.companyDiscretionaryData(companyDiscretionaryData)
        }

        /** The description of the transfer set by the sender. */
        fun companyEntryDescription(companyEntryDescription: String) = apply {
            body.companyEntryDescription(companyEntryDescription)
        }

        /** The description of the transfer set by the sender. */
        fun companyEntryDescription(companyEntryDescription: JsonField<String>) = apply {
            body.companyEntryDescription(companyEntryDescription)
        }

        /** The sender's company ID. */
        fun companyId(companyId: String) = apply { body.companyId(companyId) }

        /** The sender's company ID. */
        fun companyId(companyId: JsonField<String>) = apply { body.companyId(companyId) }

        /** The name of the sender. */
        fun companyName(companyName: String) = apply { body.companyName(companyName) }

        /** The name of the sender. */
        fun companyName(companyName: JsonField<String>) = apply { body.companyName(companyName) }

        /** The ID of the receiver of the transfer. */
        fun receiverIdNumber(receiverIdNumber: String) = apply {
            body.receiverIdNumber(receiverIdNumber)
        }

        /** The ID of the receiver of the transfer. */
        fun receiverIdNumber(receiverIdNumber: JsonField<String>) = apply {
            body.receiverIdNumber(receiverIdNumber)
        }

        /** The name of the receiver of the transfer. */
        fun receiverName(receiverName: String) = apply { body.receiverName(receiverName) }

        /** The name of the receiver of the transfer. */
        fun receiverName(receiverName: JsonField<String>) = apply {
            body.receiverName(receiverName)
        }

        /**
         * The time at which the transfer should be resolved. If not provided will resolve
         * immediately.
         */
        fun resolveAt(resolveAt: OffsetDateTime) = apply { body.resolveAt(resolveAt) }

        /**
         * The time at which the transfer should be resolved. If not provided will resolve
         * immediately.
         */
        fun resolveAt(resolveAt: JsonField<OffsetDateTime>) = apply { body.resolveAt(resolveAt) }

        /** The standard entry class code for the transfer. */
        fun standardEntryClassCode(standardEntryClassCode: StandardEntryClassCode) = apply {
            body.standardEntryClassCode(standardEntryClassCode)
        }

        /** The standard entry class code for the transfer. */
        fun standardEntryClassCode(standardEntryClassCode: JsonField<StandardEntryClassCode>) =
            apply {
                body.standardEntryClassCode(standardEntryClassCode)
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

        fun build(): SimulationInboundAchTransferCreateParams =
            SimulationInboundAchTransferCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
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

        return /* spotless:off */ other is SimulationInboundAchTransferCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "SimulationInboundAchTransferCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
