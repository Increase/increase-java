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
import java.util.Objects
import java.util.Optional

class SimulationAchTransferReturnParams
constructor(
    private val achTransferId: String,
    private val reason: Reason?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun achTransferId(): String = achTransferId

    fun reason(): Optional<Reason> = Optional.ofNullable(reason)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    @JvmSynthetic
    internal fun getBody(): SimulationAchTransferReturnBody {
        return SimulationAchTransferReturnBody(reason, additionalBodyProperties)
    }

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> achTransferId
            else -> ""
        }
    }

    @NoAutoDetect
    class SimulationAchTransferReturnBody
    @JsonCreator
    internal constructor(
        @JsonProperty("reason") private val reason: Reason?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * The reason why the Federal Reserve or destination bank returned this transfer. Defaults
         * to `no_account`.
         */
        @JsonProperty("reason") fun reason(): Optional<Reason> = Optional.ofNullable(reason)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var reason: Reason? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(simulationAchTransferReturnBody: SimulationAchTransferReturnBody) =
                apply {
                    reason = simulationAchTransferReturnBody.reason
                    additionalProperties =
                        simulationAchTransferReturnBody.additionalProperties.toMutableMap()
                }

            /**
             * The reason why the Federal Reserve or destination bank returned this transfer.
             * Defaults to `no_account`.
             */
            fun reason(reason: Reason) = apply { this.reason = reason }

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

            fun build(): SimulationAchTransferReturnBody =
                SimulationAchTransferReturnBody(reason, additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is SimulationAchTransferReturnBody && reason == other.reason && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(reason, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SimulationAchTransferReturnBody{reason=$reason, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var achTransferId: String? = null
        private var reason: Reason? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(simulationAchTransferReturnParams: SimulationAchTransferReturnParams) =
            apply {
                achTransferId = simulationAchTransferReturnParams.achTransferId
                reason = simulationAchTransferReturnParams.reason
                additionalHeaders = simulationAchTransferReturnParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    simulationAchTransferReturnParams.additionalQueryParams.toBuilder()
                additionalBodyProperties =
                    simulationAchTransferReturnParams.additionalBodyProperties.toMutableMap()
            }

        /** The identifier of the ACH Transfer you wish to return. */
        fun achTransferId(achTransferId: String) = apply { this.achTransferId = achTransferId }

        /**
         * The reason why the Federal Reserve or destination bank returned this transfer. Defaults
         * to `no_account`.
         */
        fun reason(reason: Reason) = apply { this.reason = reason }

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

        fun build(): SimulationAchTransferReturnParams =
            SimulationAchTransferReturnParams(
                checkNotNull(achTransferId) { "`achTransferId` is required but was not set" },
                reason,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    class Reason
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val INSUFFICIENT_FUND = of("insufficient_fund")

            @JvmField val NO_ACCOUNT = of("no_account")

            @JvmField val ACCOUNT_CLOSED = of("account_closed")

            @JvmField val INVALID_ACCOUNT_NUMBER_STRUCTURE = of("invalid_account_number_structure")

            @JvmField
            val ACCOUNT_FROZEN_ENTRY_RETURNED_PER_OFAC_INSTRUCTION =
                of("account_frozen_entry_returned_per_ofac_instruction")

            @JvmField val CREDIT_ENTRY_REFUSED_BY_RECEIVER = of("credit_entry_refused_by_receiver")

            @JvmField
            val UNAUTHORIZED_DEBIT_TO_CONSUMER_ACCOUNT_USING_CORPORATE_SEC_CODE =
                of("unauthorized_debit_to_consumer_account_using_corporate_sec_code")

            @JvmField
            val CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED =
                of("corporate_customer_advised_not_authorized")

            @JvmField val PAYMENT_STOPPED = of("payment_stopped")

            @JvmField val NON_TRANSACTION_ACCOUNT = of("non_transaction_account")

            @JvmField val UNCOLLECTED_FUNDS = of("uncollected_funds")

            @JvmField val ROUTING_NUMBER_CHECK_DIGIT_ERROR = of("routing_number_check_digit_error")

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

            @JvmField val ENR_INVALID_INDIVIDUAL_ID_NUMBER = of("enr_invalid_individual_id_number")

            @JvmField
            val ENR_INVALID_REPRESENTATIVE_PAYEE_INDICATOR =
                of("enr_invalid_representative_payee_indicator")

            @JvmField val ENR_INVALID_TRANSACTION_CODE = of("enr_invalid_transaction_code")

            @JvmField val ENR_RETURN_OF_ENR_ENTRY = of("enr_return_of_enr_entry")

            @JvmField
            val ENR_ROUTING_NUMBER_CHECK_DIGIT_ERROR = of("enr_routing_number_check_digit_error")

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
            val PERMISSIBLE_RETURN_ENTRY_NOT_ACCEPTED = of("permissible_return_entry_not_accepted")

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

            @JvmField val RETURN_OF_IMPROPER_CREDIT_ENTRY = of("return_of_improper_credit_entry")

            @JvmField val RETURN_OF_IMPROPER_DEBIT_ENTRY = of("return_of_improper_debit_entry")

            @JvmField val RETURN_OF_XCK_ENTRY = of("return_of_xck_entry")

            @JvmField
            val SOURCE_DOCUMENT_PRESENTED_FOR_PAYMENT = of("source_document_presented_for_payment")

            @JvmField
            val STATE_LAW_AFFECTING_RCK_ACCEPTANCE = of("state_law_affecting_rck_acceptance")

            @JvmField
            val STOP_PAYMENT_ON_ITEM_RELATED_TO_RCK_ENTRY =
                of("stop_payment_on_item_related_to_rck_entry")

            @JvmField val STOP_PAYMENT_ON_SOURCE_DOCUMENT = of("stop_payment_on_source_document")

            @JvmField val TIMELY_ORIGINAL_RETURN = of("timely_original_return")

            @JvmField val TRACE_NUMBER_ERROR = of("trace_number_error")

            @JvmField val UNTIMELY_DISHONORED_RETURN = of("untimely_dishonored_return")

            @JvmField val UNTIMELY_RETURN = of("untimely_return")

            @JvmStatic fun of(value: String) = Reason(JsonField.of(value))
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
                ENR_ROUTING_NUMBER_CHECK_DIGIT_ERROR -> Value.ENR_ROUTING_NUMBER_CHECK_DIGIT_ERROR
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
                PERMISSIBLE_RETURN_ENTRY_NOT_ACCEPTED -> Value.PERMISSIBLE_RETURN_ENTRY_NOT_ACCEPTED
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
                SOURCE_DOCUMENT_PRESENTED_FOR_PAYMENT -> Value.SOURCE_DOCUMENT_PRESENTED_FOR_PAYMENT
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
                ENR_ROUTING_NUMBER_CHECK_DIGIT_ERROR -> Known.ENR_ROUTING_NUMBER_CHECK_DIGIT_ERROR
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
                PERMISSIBLE_RETURN_ENTRY_NOT_ACCEPTED -> Known.PERMISSIBLE_RETURN_ENTRY_NOT_ACCEPTED
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
                SOURCE_DOCUMENT_PRESENTED_FOR_PAYMENT -> Known.SOURCE_DOCUMENT_PRESENTED_FOR_PAYMENT
                STATE_LAW_AFFECTING_RCK_ACCEPTANCE -> Known.STATE_LAW_AFFECTING_RCK_ACCEPTANCE
                STOP_PAYMENT_ON_ITEM_RELATED_TO_RCK_ENTRY ->
                    Known.STOP_PAYMENT_ON_ITEM_RELATED_TO_RCK_ENTRY
                STOP_PAYMENT_ON_SOURCE_DOCUMENT -> Known.STOP_PAYMENT_ON_SOURCE_DOCUMENT
                TIMELY_ORIGINAL_RETURN -> Known.TIMELY_ORIGINAL_RETURN
                TRACE_NUMBER_ERROR -> Known.TRACE_NUMBER_ERROR
                UNTIMELY_DISHONORED_RETURN -> Known.UNTIMELY_DISHONORED_RETURN
                UNTIMELY_RETURN -> Known.UNTIMELY_RETURN
                else -> throw IncreaseInvalidDataException("Unknown Reason: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Reason && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SimulationAchTransferReturnParams && achTransferId == other.achTransferId && reason == other.reason && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(achTransferId, reason, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "SimulationAchTransferReturnParams{achTransferId=$achTransferId, reason=$reason, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}
