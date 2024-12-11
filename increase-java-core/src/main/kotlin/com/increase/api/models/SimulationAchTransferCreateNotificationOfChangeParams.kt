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
import com.increase.api.models.*
import java.util.Objects

class SimulationAchTransferCreateNotificationOfChangeParams
constructor(
    private val achTransferId: String,
    private val changeCode: ChangeCode,
    private val correctedData: String,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun achTransferId(): String = achTransferId

    fun changeCode(): ChangeCode = changeCode

    fun correctedData(): String = correctedData

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    @JvmSynthetic
    internal fun getBody(): SimulationAchTransferCreateNotificationOfChangeBody {
        return SimulationAchTransferCreateNotificationOfChangeBody(
            changeCode,
            correctedData,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> achTransferId
            else -> ""
        }
    }

    @JsonDeserialize(builder = SimulationAchTransferCreateNotificationOfChangeBody.Builder::class)
    @NoAutoDetect
    class SimulationAchTransferCreateNotificationOfChangeBody
    internal constructor(
        private val changeCode: ChangeCode?,
        private val correctedData: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The reason for the notification of change. */
        @JsonProperty("change_code") fun changeCode(): ChangeCode? = changeCode

        /** The corrected data for the notification of change (e.g., a new routing number). */
        @JsonProperty("corrected_data") fun correctedData(): String? = correctedData

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var changeCode: ChangeCode? = null
            private var correctedData: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                simulationAchTransferCreateNotificationOfChangeBody:
                    SimulationAchTransferCreateNotificationOfChangeBody
            ) = apply {
                this.changeCode = simulationAchTransferCreateNotificationOfChangeBody.changeCode
                this.correctedData =
                    simulationAchTransferCreateNotificationOfChangeBody.correctedData
                additionalProperties(
                    simulationAchTransferCreateNotificationOfChangeBody.additionalProperties
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

            fun build(): SimulationAchTransferCreateNotificationOfChangeBody =
                SimulationAchTransferCreateNotificationOfChangeBody(
                    checkNotNull(changeCode) { "`changeCode` is required but was not set" },
                    checkNotNull(correctedData) { "`correctedData` is required but was not set" },
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is SimulationAchTransferCreateNotificationOfChangeBody && changeCode == other.changeCode && correctedData == other.correctedData && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(changeCode, correctedData, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SimulationAchTransferCreateNotificationOfChangeBody{changeCode=$changeCode, correctedData=$correctedData, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var achTransferId: String? = null
        private var changeCode: ChangeCode? = null
        private var correctedData: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            simulationAchTransferCreateNotificationOfChangeParams:
                SimulationAchTransferCreateNotificationOfChangeParams
        ) = apply {
            achTransferId = simulationAchTransferCreateNotificationOfChangeParams.achTransferId
            changeCode = simulationAchTransferCreateNotificationOfChangeParams.changeCode
            correctedData = simulationAchTransferCreateNotificationOfChangeParams.correctedData
            additionalHeaders =
                simulationAchTransferCreateNotificationOfChangeParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                simulationAchTransferCreateNotificationOfChangeParams.additionalQueryParams
                    .toBuilder()
            additionalBodyProperties =
                simulationAchTransferCreateNotificationOfChangeParams.additionalBodyProperties
                    .toMutableMap()
        }

        /** The identifier of the ACH Transfer you wish to create a notification of change for. */
        fun achTransferId(achTransferId: String) = apply { this.achTransferId = achTransferId }

        /** The reason for the notification of change. */
        fun changeCode(changeCode: ChangeCode) = apply { this.changeCode = changeCode }

        /** The corrected data for the notification of change (e.g., a new routing number). */
        fun correctedData(correctedData: String) = apply { this.correctedData = correctedData }

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

        fun build(): SimulationAchTransferCreateNotificationOfChangeParams =
            SimulationAchTransferCreateNotificationOfChangeParams(
                checkNotNull(achTransferId) { "`achTransferId` is required but was not set" },
                checkNotNull(changeCode) { "`changeCode` is required but was not set" },
                checkNotNull(correctedData) { "`correctedData` is required but was not set" },
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
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

            return /* spotless:off */ other is ChangeCode && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

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

            @JvmField val MISROUTED_NOTIFICATION_OF_CHANGE = of("misrouted_notification_of_change")

            @JvmField val INCORRECT_TRACE_NUMBER = of("incorrect_trace_number")

            @JvmField
            val INCORRECT_COMPANY_IDENTIFICATION_NUMBER =
                of("incorrect_company_identification_number")

            @JvmField val INCORRECT_IDENTIFICATION_NUMBER = of("incorrect_identification_number")

            @JvmField
            val INCORRECTLY_FORMATTED_CORRECTED_DATA = of("incorrectly_formatted_corrected_data")

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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SimulationAchTransferCreateNotificationOfChangeParams && achTransferId == other.achTransferId && changeCode == other.changeCode && correctedData == other.correctedData && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(achTransferId, changeCode, correctedData, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "SimulationAchTransferCreateNotificationOfChangeParams{achTransferId=$achTransferId, changeCode=$changeCode, correctedData=$correctedData, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}
