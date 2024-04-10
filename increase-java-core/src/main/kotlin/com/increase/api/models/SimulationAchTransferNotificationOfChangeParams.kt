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
import com.increase.api.core.toUnmodifiable
import com.increase.api.errors.IncreaseInvalidDataException
import com.increase.api.models.*
import java.util.Objects

class SimulationAchTransferNotificationOfChangeParams
constructor(
    private val achTransferId: String,
    private val changeCode: ChangeCode,
    private val correctedData: String,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun achTransferId(): String = achTransferId

    fun changeCode(): ChangeCode = changeCode

    fun correctedData(): String = correctedData

    @JvmSynthetic
    internal fun getBody(): SimulationAchTransferNotificationOfChangeBody {
        return SimulationAchTransferNotificationOfChangeBody(
            changeCode,
            correctedData,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> achTransferId
            else -> ""
        }
    }

    @JsonDeserialize(builder = SimulationAchTransferNotificationOfChangeBody.Builder::class)
    @NoAutoDetect
    class SimulationAchTransferNotificationOfChangeBody
    internal constructor(
        private val changeCode: ChangeCode?,
        private val correctedData: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** The reason for the notification of change. */
        @JsonProperty("change_code") fun changeCode(): ChangeCode? = changeCode

        /** The corrected data for the notification of change (e.g., a new routing number). */
        @JsonProperty("corrected_data") fun correctedData(): String? = correctedData

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is SimulationAchTransferNotificationOfChangeBody &&
                this.changeCode == other.changeCode &&
                this.correctedData == other.correctedData &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        changeCode,
                        correctedData,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "SimulationAchTransferNotificationOfChangeBody{changeCode=$changeCode, correctedData=$correctedData, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var changeCode: ChangeCode? = null
            private var correctedData: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                simulationAchTransferNotificationOfChangeBody:
                    SimulationAchTransferNotificationOfChangeBody
            ) = apply {
                this.changeCode = simulationAchTransferNotificationOfChangeBody.changeCode
                this.correctedData = simulationAchTransferNotificationOfChangeBody.correctedData
                additionalProperties(
                    simulationAchTransferNotificationOfChangeBody.additionalProperties
                )
            }

            /** The reason for the notification of change. */
            @JsonProperty("change_code")
            fun changeCode(changeCode: ChangeCode) = apply { this.changeCode = changeCode }

            /** The corrected data for the notification of change (e.g., a new routing number). */
            @JsonProperty("corrected_data")
            fun correctedData(correctedData: String) = apply { this.correctedData = correctedData }

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

            fun build(): SimulationAchTransferNotificationOfChangeBody =
                SimulationAchTransferNotificationOfChangeBody(
                    checkNotNull(changeCode) { "`changeCode` is required but was not set" },
                    checkNotNull(correctedData) { "`correctedData` is required but was not set" },
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SimulationAchTransferNotificationOfChangeParams &&
            this.achTransferId == other.achTransferId &&
            this.changeCode == other.changeCode &&
            this.correctedData == other.correctedData &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            achTransferId,
            changeCode,
            correctedData,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "SimulationAchTransferNotificationOfChangeParams{achTransferId=$achTransferId, changeCode=$changeCode, correctedData=$correctedData, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var achTransferId: String? = null
        private var changeCode: ChangeCode? = null
        private var correctedData: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            simulationAchTransferNotificationOfChangeParams:
                SimulationAchTransferNotificationOfChangeParams
        ) = apply {
            this.achTransferId = simulationAchTransferNotificationOfChangeParams.achTransferId
            this.changeCode = simulationAchTransferNotificationOfChangeParams.changeCode
            this.correctedData = simulationAchTransferNotificationOfChangeParams.correctedData
            additionalQueryParams(
                simulationAchTransferNotificationOfChangeParams.additionalQueryParams
            )
            additionalHeaders(simulationAchTransferNotificationOfChangeParams.additionalHeaders)
            additionalBodyProperties(
                simulationAchTransferNotificationOfChangeParams.additionalBodyProperties
            )
        }

        /** The identifier of the ACH Transfer you wish to create a notification of change for. */
        fun achTransferId(achTransferId: String) = apply { this.achTransferId = achTransferId }

        /** The reason for the notification of change. */
        fun changeCode(changeCode: ChangeCode) = apply { this.changeCode = changeCode }

        /** The corrected data for the notification of change (e.g., a new routing number). */
        fun correctedData(correctedData: String) = apply { this.correctedData = correctedData }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun build(): SimulationAchTransferNotificationOfChangeParams =
            SimulationAchTransferNotificationOfChangeParams(
                checkNotNull(achTransferId) { "`achTransferId` is required but was not set" },
                checkNotNull(changeCode) { "`changeCode` is required but was not set" },
                checkNotNull(correctedData) { "`correctedData` is required but was not set" },
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    class ChangeCode
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

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
            val INCORRECT_TRANSACTION_CODE = ChangeCode(JsonField.of("incorrect_transaction_code"))

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

            @JvmField val ADDENDA_FORMAT_ERROR = ChangeCode(JsonField.of("addenda_format_error"))

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
                INCORRECTLY_FORMATTED_CORRECTED_DATA -> Value.INCORRECTLY_FORMATTED_CORRECTED_DATA
                INCORRECT_DISCRETIONARY_DATA -> Value.INCORRECT_DISCRETIONARY_DATA
                ROUTING_NUMBER_NOT_FROM_ORIGINAL_ENTRY_DETAIL_RECORD ->
                    Value.ROUTING_NUMBER_NOT_FROM_ORIGINAL_ENTRY_DETAIL_RECORD
                DEPOSITORY_FINANCIAL_INSTITUTION_ACCOUNT_NUMBER_NOT_FROM_ORIGINAL_ENTRY_DETAIL_RECORD ->
                    Value
                        .DEPOSITORY_FINANCIAL_INSTITUTION_ACCOUNT_NUMBER_NOT_FROM_ORIGINAL_ENTRY_DETAIL_RECORD
                INCORRECT_TRANSACTION_CODE_BY_ORIGINATING_DEPOSITORY_FINANCIAL_INSTITUTION ->
                    Value.INCORRECT_TRANSACTION_CODE_BY_ORIGINATING_DEPOSITORY_FINANCIAL_INSTITUTION
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
                INCORRECTLY_FORMATTED_CORRECTED_DATA -> Known.INCORRECTLY_FORMATTED_CORRECTED_DATA
                INCORRECT_DISCRETIONARY_DATA -> Known.INCORRECT_DISCRETIONARY_DATA
                ROUTING_NUMBER_NOT_FROM_ORIGINAL_ENTRY_DETAIL_RECORD ->
                    Known.ROUTING_NUMBER_NOT_FROM_ORIGINAL_ENTRY_DETAIL_RECORD
                DEPOSITORY_FINANCIAL_INSTITUTION_ACCOUNT_NUMBER_NOT_FROM_ORIGINAL_ENTRY_DETAIL_RECORD ->
                    Known
                        .DEPOSITORY_FINANCIAL_INSTITUTION_ACCOUNT_NUMBER_NOT_FROM_ORIGINAL_ENTRY_DETAIL_RECORD
                INCORRECT_TRANSACTION_CODE_BY_ORIGINATING_DEPOSITORY_FINANCIAL_INSTITUTION ->
                    Known.INCORRECT_TRANSACTION_CODE_BY_ORIGINATING_DEPOSITORY_FINANCIAL_INSTITUTION
                else -> throw IncreaseInvalidDataException("Unknown ChangeCode: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
