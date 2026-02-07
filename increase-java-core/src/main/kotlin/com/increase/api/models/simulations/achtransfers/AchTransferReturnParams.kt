// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.simulations.achtransfers

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.increase.api.core.Enum
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.Params
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import com.increase.api.errors.IncreaseInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Simulates the return of an [ACH Transfer](#ach-transfers) by the Federal Reserve due to an error
 * condition. This will also create a Transaction to account for the returned funds. This transfer
 * must first have a `status` of `submitted`.
 */
class AchTransferReturnParams
private constructor(
    private val achTransferId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** The identifier of the ACH Transfer you wish to return. */
    fun achTransferId(): Optional<String> = Optional.ofNullable(achTransferId)

    /**
     * The reason why the Federal Reserve or destination bank returned this transfer. Defaults to
     * `no_account`.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun reason(): Optional<Reason> = body.reason()

    /**
     * Returns the raw JSON value of [reason].
     *
     * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _reason(): JsonField<Reason> = body._reason()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): AchTransferReturnParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [AchTransferReturnParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AchTransferReturnParams]. */
    class Builder internal constructor() {

        private var achTransferId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(achTransferReturnParams: AchTransferReturnParams) = apply {
            achTransferId = achTransferReturnParams.achTransferId
            body = achTransferReturnParams.body.toBuilder()
            additionalHeaders = achTransferReturnParams.additionalHeaders.toBuilder()
            additionalQueryParams = achTransferReturnParams.additionalQueryParams.toBuilder()
        }

        /** The identifier of the ACH Transfer you wish to return. */
        fun achTransferId(achTransferId: String?) = apply { this.achTransferId = achTransferId }

        /** Alias for calling [Builder.achTransferId] with `achTransferId.orElse(null)`. */
        fun achTransferId(achTransferId: Optional<String>) =
            achTransferId(achTransferId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [reason]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * The reason why the Federal Reserve or destination bank returned this transfer. Defaults
         * to `no_account`.
         */
        fun reason(reason: Reason) = apply { body.reason(reason) }

        /**
         * Sets [Builder.reason] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reason] with a well-typed [Reason] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun reason(reason: JsonField<Reason>) = apply { body.reason(reason) }

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

        /**
         * Returns an immutable instance of [AchTransferReturnParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): AchTransferReturnParams =
            AchTransferReturnParams(
                achTransferId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> achTransferId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val reason: JsonField<Reason>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("reason") @ExcludeMissing reason: JsonField<Reason> = JsonMissing.of()
        ) : this(reason, mutableMapOf())

        /**
         * The reason why the Federal Reserve or destination bank returned this transfer. Defaults
         * to `no_account`.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun reason(): Optional<Reason> = reason.getOptional("reason")

        /**
         * Returns the raw JSON value of [reason].
         *
         * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<Reason> = reason

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var reason: JsonField<Reason> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                reason = body.reason
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * The reason why the Federal Reserve or destination bank returned this transfer.
             * Defaults to `no_account`.
             */
            fun reason(reason: Reason) = reason(JsonField.of(reason))

            /**
             * Sets [Builder.reason] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reason] with a well-typed [Reason] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun reason(reason: JsonField<Reason>) = apply { this.reason = reason }

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

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Body = Body(reason, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            reason().ifPresent { it.validate() }
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: IncreaseInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = (reason.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                reason == other.reason &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(reason, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Body{reason=$reason, additionalProperties=$additionalProperties}"
    }

    /**
     * The reason why the Federal Reserve or destination bank returned this transfer. Defaults to
     * `no_account`.
     */
    class Reason @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            /**
             * Code R01. Insufficient funds in the receiving account. Sometimes abbreviated to
             * "NSF."
             */
            @JvmField val INSUFFICIENT_FUND = of("insufficient_fund")

            /**
             * Code R03. The account does not exist or the receiving bank was unable to locate it.
             */
            @JvmField val NO_ACCOUNT = of("no_account")

            /** Code R02. The account is closed at the receiving bank. */
            @JvmField val ACCOUNT_CLOSED = of("account_closed")

            /** Code R04. The account number is invalid at the receiving bank. */
            @JvmField val INVALID_ACCOUNT_NUMBER_STRUCTURE = of("invalid_account_number_structure")

            /**
             * Code R16. This return code has two separate meanings. (1) The receiving bank froze
             * the account or (2) the Office of Foreign Assets Control (OFAC) instructed the
             * receiving bank to return the entry.
             */
            @JvmField
            val ACCOUNT_FROZEN_ENTRY_RETURNED_PER_OFAC_INSTRUCTION =
                of("account_frozen_entry_returned_per_ofac_instruction")

            /** Code R23. The receiving bank refused the credit transfer. */
            @JvmField val CREDIT_ENTRY_REFUSED_BY_RECEIVER = of("credit_entry_refused_by_receiver")

            /**
             * Code R05. The receiving bank rejected because of an incorrect Standard Entry Class
             * code. Consumer accounts cannot be debited as `corporate_credit_or_debit` or
             * `corporate_trade_exchange`.
             */
            @JvmField
            val UNAUTHORIZED_DEBIT_TO_CONSUMER_ACCOUNT_USING_CORPORATE_SEC_CODE =
                of("unauthorized_debit_to_consumer_account_using_corporate_sec_code")

            /** Code R29. The corporate customer at the receiving bank reversed the transfer. */
            @JvmField
            val CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED =
                of("corporate_customer_advised_not_authorized")

            /** Code R08. The receiving bank stopped payment on this transfer. */
            @JvmField val PAYMENT_STOPPED = of("payment_stopped")

            /**
             * Code R20. The account is not eligible for ACH, such as a savings account with
             * transaction limits.
             */
            @JvmField val NON_TRANSACTION_ACCOUNT = of("non_transaction_account")

            /**
             * Code R09. The receiving bank account does not have enough available balance for the
             * transfer.
             */
            @JvmField val UNCOLLECTED_FUNDS = of("uncollected_funds")

            /** Code R28. The routing number is incorrect. */
            @JvmField val ROUTING_NUMBER_CHECK_DIGIT_ERROR = of("routing_number_check_digit_error")

            /** Code R10. The customer at the receiving bank reversed the transfer. */
            @JvmField
            val CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE =
                of("customer_advised_unauthorized_improper_ineligible_or_incomplete")

            /** Code R19. The amount field is incorrect or too large. */
            @JvmField val AMOUNT_FIELD_ERROR = of("amount_field_error")

            /**
             * Code R07. The customer revoked their authorization for a previously authorized
             * transfer.
             */
            @JvmField
            val AUTHORIZATION_REVOKED_BY_CUSTOMER = of("authorization_revoked_by_customer")

            /** Code R13. The routing number is invalid. */
            @JvmField val INVALID_ACH_ROUTING_NUMBER = of("invalid_ach_routing_number")

            /** Code R17. The receiving bank is unable to process a field in the transfer. */
            @JvmField val FILE_RECORD_EDIT_CRITERIA = of("file_record_edit_criteria")

            /** Code R45. A rare return reason. The individual name field was invalid. */
            @JvmField val ENR_INVALID_INDIVIDUAL_NAME = of("enr_invalid_individual_name")

            /**
             * Code R06. The originating financial institution asked for this transfer to be
             * returned. The receiving bank is complying with the request.
             */
            @JvmField val RETURNED_PER_ODFI_REQUEST = of("returned_per_odfi_request")

            /**
             * Code R34. The receiving bank's regulatory supervisor has limited their participation
             * in the ACH network.
             */
            @JvmField val LIMITED_PARTICIPATION_DFI = of("limited_participation_dfi")

            /** Code R85. The outbound international ACH transfer was incorrect. */
            @JvmField
            val INCORRECTLY_CODED_OUTBOUND_INTERNATIONAL_PAYMENT =
                of("incorrectly_coded_outbound_international_payment")

            /** Code R12. A rare return reason. The account was sold to another bank. */
            @JvmField val ACCOUNT_SOLD_TO_ANOTHER_DFI = of("account_sold_to_another_dfi")

            /** Code R25. The addenda record is incorrect or missing. */
            @JvmField val ADDENDA_ERROR = of("addenda_error")

            /** Code R15. A rare return reason. The account holder is deceased. */
            @JvmField
            val BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED =
                of("beneficiary_or_account_holder_deceased")

            /**
             * Code R11. A rare return reason. The customer authorized some payment to the sender,
             * but this payment was not in error.
             */
            @JvmField
            val CUSTOMER_ADVISED_NOT_WITHIN_AUTHORIZATION_TERMS =
                of("customer_advised_not_within_authorization_terms")

            /**
             * Code R74. A rare return reason. Sent in response to a return that was returned with
             * code `field_error`. The latest return should include the corrected field(s).
             */
            @JvmField val CORRECTED_RETURN = of("corrected_return")

            /**
             * Code R24. A rare return reason. The receiving bank received an exact duplicate entry
             * with the same trace number and amount.
             */
            @JvmField val DUPLICATE_ENTRY = of("duplicate_entry")

            /**
             * Code R67. A rare return reason. The return this message refers to was a duplicate.
             */
            @JvmField val DUPLICATE_RETURN = of("duplicate_return")

            /**
             * Code R47. A rare return reason. Only used for US Government agency non-monetary
             * automatic enrollment messages.
             */
            @JvmField val ENR_DUPLICATE_ENROLLMENT = of("enr_duplicate_enrollment")

            /**
             * Code R43. A rare return reason. Only used for US Government agency non-monetary
             * automatic enrollment messages.
             */
            @JvmField val ENR_INVALID_DFI_ACCOUNT_NUMBER = of("enr_invalid_dfi_account_number")

            /**
             * Code R44. A rare return reason. Only used for US Government agency non-monetary
             * automatic enrollment messages.
             */
            @JvmField val ENR_INVALID_INDIVIDUAL_ID_NUMBER = of("enr_invalid_individual_id_number")

            /**
             * Code R46. A rare return reason. Only used for US Government agency non-monetary
             * automatic enrollment messages.
             */
            @JvmField
            val ENR_INVALID_REPRESENTATIVE_PAYEE_INDICATOR =
                of("enr_invalid_representative_payee_indicator")

            /**
             * Code R41. A rare return reason. Only used for US Government agency non-monetary
             * automatic enrollment messages.
             */
            @JvmField val ENR_INVALID_TRANSACTION_CODE = of("enr_invalid_transaction_code")

            /**
             * Code R40. A rare return reason. Only used for US Government agency non-monetary
             * automatic enrollment messages.
             */
            @JvmField val ENR_RETURN_OF_ENR_ENTRY = of("enr_return_of_enr_entry")

            /**
             * Code R42. A rare return reason. Only used for US Government agency non-monetary
             * automatic enrollment messages.
             */
            @JvmField
            val ENR_ROUTING_NUMBER_CHECK_DIGIT_ERROR = of("enr_routing_number_check_digit_error")

            /**
             * Code R84. A rare return reason. The International ACH Transfer cannot be processed by
             * the gateway.
             */
            @JvmField val ENTRY_NOT_PROCESSED_BY_GATEWAY = of("entry_not_processed_by_gateway")

            /**
             * Code R69. A rare return reason. One or more of the fields in the ACH were malformed.
             */
            @JvmField val FIELD_ERROR = of("field_error")

            /**
             * Code R83. A rare return reason. The Foreign receiving bank was unable to settle this
             * ACH transfer.
             */
            @JvmField
            val FOREIGN_RECEIVING_DFI_UNABLE_TO_SETTLE =
                of("foreign_receiving_dfi_unable_to_settle")

            /** Code R80. A rare return reason. The International ACH Transfer is malformed. */
            @JvmField val IAT_ENTRY_CODING_ERROR = of("iat_entry_coding_error")

            /**
             * Code R18. A rare return reason. The ACH has an improper effective entry date field.
             */
            @JvmField val IMPROPER_EFFECTIVE_ENTRY_DATE = of("improper_effective_entry_date")

            /**
             * Code R39. A rare return reason. The source document related to this ACH, usually an
             * ACH check conversion, was presented to the bank.
             */
            @JvmField
            val IMPROPER_SOURCE_DOCUMENT_SOURCE_DOCUMENT_PRESENTED =
                of("improper_source_document_source_document_presented")

            /** Code R21. A rare return reason. The Company ID field of the ACH was invalid. */
            @JvmField val INVALID_COMPANY_ID = of("invalid_company_id")

            /**
             * Code R82. A rare return reason. The foreign receiving bank identifier for an
             * International ACH Transfer was invalid.
             */
            @JvmField
            val INVALID_FOREIGN_RECEIVING_DFI_IDENTIFICATION =
                of("invalid_foreign_receiving_dfi_identification")

            /**
             * Code R22. A rare return reason. The Individual ID number field of the ACH was
             * invalid.
             */
            @JvmField val INVALID_INDIVIDUAL_ID_NUMBER = of("invalid_individual_id_number")

            /**
             * Code R53. A rare return reason. Both the Represented Check ("RCK") entry and the
             * original check were presented to the bank.
             */
            @JvmField
            val ITEM_AND_RCK_ENTRY_PRESENTED_FOR_PAYMENT =
                of("item_and_rck_entry_presented_for_payment")

            /**
             * Code R51. A rare return reason. The Represented Check ("RCK") entry is ineligible.
             */
            @JvmField
            val ITEM_RELATED_TO_RCK_ENTRY_IS_INELIGIBLE =
                of("item_related_to_rck_entry_is_ineligible")

            /** Code R26. A rare return reason. The ACH is missing a required field. */
            @JvmField val MANDATORY_FIELD_ERROR = of("mandatory_field_error")

            /**
             * Code R71. A rare return reason. The receiving bank does not recognize the routing
             * number in a dishonored return entry.
             */
            @JvmField val MISROUTED_DISHONORED_RETURN = of("misrouted_dishonored_return")

            /**
             * Code R61. A rare return reason. The receiving bank does not recognize the routing
             * number in a return entry.
             */
            @JvmField val MISROUTED_RETURN = of("misrouted_return")

            /**
             * Code R76. A rare return reason. Sent in response to a return, the bank does not find
             * the errors alleged by the returning bank.
             */
            @JvmField val NO_ERRORS_FOUND = of("no_errors_found")

            /**
             * Code R77. A rare return reason. The receiving bank does not accept the return of the
             * erroneous debit. The funds are not available at the receiving bank.
             */
            @JvmField
            val NON_ACCEPTANCE_OF_R62_DISHONORED_RETURN =
                of("non_acceptance_of_r62_dishonored_return")

            /**
             * Code R81. A rare return reason. The receiving bank does not accept International ACH
             * Transfers.
             */
            @JvmField val NON_PARTICIPANT_IN_IAT_PROGRAM = of("non_participant_in_iat_program")

            /**
             * Code R31. A rare return reason. A return that has been agreed to be accepted by the
             * receiving bank, despite falling outside of the usual return timeframe.
             */
            @JvmField val PERMISSIBLE_RETURN_ENTRY = of("permissible_return_entry")

            /** Code R70. A rare return reason. The receiving bank had not approved this return. */
            @JvmField
            val PERMISSIBLE_RETURN_ENTRY_NOT_ACCEPTED = of("permissible_return_entry_not_accepted")

            /**
             * Code R32. A rare return reason. The receiving bank could not settle this transaction.
             */
            @JvmField val RDFI_NON_SETTLEMENT = of("rdfi_non_settlement")

            /**
             * Code R30. A rare return reason. The receiving bank does not accept Check Truncation
             * ACH transfers.
             */
            @JvmField
            val RDFI_PARTICIPANT_IN_CHECK_TRUNCATION_PROGRAM =
                of("rdfi_participant_in_check_truncation_program")

            /** Code R14. A rare return reason. The payee is deceased. */
            @JvmField
            val REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY =
                of("representative_payee_deceased_or_unable_to_continue_in_that_capacity")

            /**
             * Code R75. A rare return reason. The originating bank disputes that an earlier
             * `duplicate_entry` return was actually a duplicate.
             */
            @JvmField val RETURN_NOT_A_DUPLICATE = of("return_not_a_duplicate")

            /**
             * Code R62. A rare return reason. The originating financial institution made a mistake
             * and this return corrects it.
             */
            @JvmField
            val RETURN_OF_ERRONEOUS_OR_REVERSING_DEBIT =
                of("return_of_erroneous_or_reversing_debit")

            /** Code R36. A rare return reason. Return of a malformed credit entry. */
            @JvmField val RETURN_OF_IMPROPER_CREDIT_ENTRY = of("return_of_improper_credit_entry")

            /** Code R35. A rare return reason. Return of a malformed debit entry. */
            @JvmField val RETURN_OF_IMPROPER_DEBIT_ENTRY = of("return_of_improper_debit_entry")

            /** Code R33. A rare return reason. Return of a destroyed check ("XCK") entry. */
            @JvmField val RETURN_OF_XCK_ENTRY = of("return_of_xck_entry")

            /**
             * Code R37. A rare return reason. The source document related to this ACH, usually an
             * ACH check conversion, was presented to the bank.
             */
            @JvmField
            val SOURCE_DOCUMENT_PRESENTED_FOR_PAYMENT = of("source_document_presented_for_payment")

            /**
             * Code R50. A rare return reason. State law prevents the bank from accepting the
             * Represented Check ("RCK") entry.
             */
            @JvmField
            val STATE_LAW_AFFECTING_RCK_ACCEPTANCE = of("state_law_affecting_rck_acceptance")

            /**
             * Code R52. A rare return reason. A stop payment was issued on a Represented Check
             * ("RCK") entry.
             */
            @JvmField
            val STOP_PAYMENT_ON_ITEM_RELATED_TO_RCK_ENTRY =
                of("stop_payment_on_item_related_to_rck_entry")

            /**
             * Code R38. A rare return reason. The source attached to the ACH, usually an ACH check
             * conversion, includes a stop payment.
             */
            @JvmField val STOP_PAYMENT_ON_SOURCE_DOCUMENT = of("stop_payment_on_source_document")

            /**
             * Code R73. A rare return reason. The bank receiving an `untimely_return` believes it
             * was on time.
             */
            @JvmField val TIMELY_ORIGINAL_RETURN = of("timely_original_return")

            /**
             * Code R27. A rare return reason. An ACH return's trace number does not match an
             * originated ACH.
             */
            @JvmField val TRACE_NUMBER_ERROR = of("trace_number_error")

            /** Code R72. A rare return reason. The dishonored return was sent too late. */
            @JvmField val UNTIMELY_DISHONORED_RETURN = of("untimely_dishonored_return")

            /** Code R68. A rare return reason. The return was sent too late. */
            @JvmField val UNTIMELY_RETURN = of("untimely_return")

            @JvmStatic fun of(value: String) = Reason(JsonField.of(value))
        }

        /** An enum containing [Reason]'s known values. */
        enum class Known {
            /**
             * Code R01. Insufficient funds in the receiving account. Sometimes abbreviated to
             * "NSF."
             */
            INSUFFICIENT_FUND,
            /**
             * Code R03. The account does not exist or the receiving bank was unable to locate it.
             */
            NO_ACCOUNT,
            /** Code R02. The account is closed at the receiving bank. */
            ACCOUNT_CLOSED,
            /** Code R04. The account number is invalid at the receiving bank. */
            INVALID_ACCOUNT_NUMBER_STRUCTURE,
            /**
             * Code R16. This return code has two separate meanings. (1) The receiving bank froze
             * the account or (2) the Office of Foreign Assets Control (OFAC) instructed the
             * receiving bank to return the entry.
             */
            ACCOUNT_FROZEN_ENTRY_RETURNED_PER_OFAC_INSTRUCTION,
            /** Code R23. The receiving bank refused the credit transfer. */
            CREDIT_ENTRY_REFUSED_BY_RECEIVER,
            /**
             * Code R05. The receiving bank rejected because of an incorrect Standard Entry Class
             * code. Consumer accounts cannot be debited as `corporate_credit_or_debit` or
             * `corporate_trade_exchange`.
             */
            UNAUTHORIZED_DEBIT_TO_CONSUMER_ACCOUNT_USING_CORPORATE_SEC_CODE,
            /** Code R29. The corporate customer at the receiving bank reversed the transfer. */
            CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED,
            /** Code R08. The receiving bank stopped payment on this transfer. */
            PAYMENT_STOPPED,
            /**
             * Code R20. The account is not eligible for ACH, such as a savings account with
             * transaction limits.
             */
            NON_TRANSACTION_ACCOUNT,
            /**
             * Code R09. The receiving bank account does not have enough available balance for the
             * transfer.
             */
            UNCOLLECTED_FUNDS,
            /** Code R28. The routing number is incorrect. */
            ROUTING_NUMBER_CHECK_DIGIT_ERROR,
            /** Code R10. The customer at the receiving bank reversed the transfer. */
            CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE,
            /** Code R19. The amount field is incorrect or too large. */
            AMOUNT_FIELD_ERROR,
            /**
             * Code R07. The customer revoked their authorization for a previously authorized
             * transfer.
             */
            AUTHORIZATION_REVOKED_BY_CUSTOMER,
            /** Code R13. The routing number is invalid. */
            INVALID_ACH_ROUTING_NUMBER,
            /** Code R17. The receiving bank is unable to process a field in the transfer. */
            FILE_RECORD_EDIT_CRITERIA,
            /** Code R45. A rare return reason. The individual name field was invalid. */
            ENR_INVALID_INDIVIDUAL_NAME,
            /**
             * Code R06. The originating financial institution asked for this transfer to be
             * returned. The receiving bank is complying with the request.
             */
            RETURNED_PER_ODFI_REQUEST,
            /**
             * Code R34. The receiving bank's regulatory supervisor has limited their participation
             * in the ACH network.
             */
            LIMITED_PARTICIPATION_DFI,
            /** Code R85. The outbound international ACH transfer was incorrect. */
            INCORRECTLY_CODED_OUTBOUND_INTERNATIONAL_PAYMENT,
            /** Code R12. A rare return reason. The account was sold to another bank. */
            ACCOUNT_SOLD_TO_ANOTHER_DFI,
            /** Code R25. The addenda record is incorrect or missing. */
            ADDENDA_ERROR,
            /** Code R15. A rare return reason. The account holder is deceased. */
            BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED,
            /**
             * Code R11. A rare return reason. The customer authorized some payment to the sender,
             * but this payment was not in error.
             */
            CUSTOMER_ADVISED_NOT_WITHIN_AUTHORIZATION_TERMS,
            /**
             * Code R74. A rare return reason. Sent in response to a return that was returned with
             * code `field_error`. The latest return should include the corrected field(s).
             */
            CORRECTED_RETURN,
            /**
             * Code R24. A rare return reason. The receiving bank received an exact duplicate entry
             * with the same trace number and amount.
             */
            DUPLICATE_ENTRY,
            /**
             * Code R67. A rare return reason. The return this message refers to was a duplicate.
             */
            DUPLICATE_RETURN,
            /**
             * Code R47. A rare return reason. Only used for US Government agency non-monetary
             * automatic enrollment messages.
             */
            ENR_DUPLICATE_ENROLLMENT,
            /**
             * Code R43. A rare return reason. Only used for US Government agency non-monetary
             * automatic enrollment messages.
             */
            ENR_INVALID_DFI_ACCOUNT_NUMBER,
            /**
             * Code R44. A rare return reason. Only used for US Government agency non-monetary
             * automatic enrollment messages.
             */
            ENR_INVALID_INDIVIDUAL_ID_NUMBER,
            /**
             * Code R46. A rare return reason. Only used for US Government agency non-monetary
             * automatic enrollment messages.
             */
            ENR_INVALID_REPRESENTATIVE_PAYEE_INDICATOR,
            /**
             * Code R41. A rare return reason. Only used for US Government agency non-monetary
             * automatic enrollment messages.
             */
            ENR_INVALID_TRANSACTION_CODE,
            /**
             * Code R40. A rare return reason. Only used for US Government agency non-monetary
             * automatic enrollment messages.
             */
            ENR_RETURN_OF_ENR_ENTRY,
            /**
             * Code R42. A rare return reason. Only used for US Government agency non-monetary
             * automatic enrollment messages.
             */
            ENR_ROUTING_NUMBER_CHECK_DIGIT_ERROR,
            /**
             * Code R84. A rare return reason. The International ACH Transfer cannot be processed by
             * the gateway.
             */
            ENTRY_NOT_PROCESSED_BY_GATEWAY,
            /**
             * Code R69. A rare return reason. One or more of the fields in the ACH were malformed.
             */
            FIELD_ERROR,
            /**
             * Code R83. A rare return reason. The Foreign receiving bank was unable to settle this
             * ACH transfer.
             */
            FOREIGN_RECEIVING_DFI_UNABLE_TO_SETTLE,
            /** Code R80. A rare return reason. The International ACH Transfer is malformed. */
            IAT_ENTRY_CODING_ERROR,
            /**
             * Code R18. A rare return reason. The ACH has an improper effective entry date field.
             */
            IMPROPER_EFFECTIVE_ENTRY_DATE,
            /**
             * Code R39. A rare return reason. The source document related to this ACH, usually an
             * ACH check conversion, was presented to the bank.
             */
            IMPROPER_SOURCE_DOCUMENT_SOURCE_DOCUMENT_PRESENTED,
            /** Code R21. A rare return reason. The Company ID field of the ACH was invalid. */
            INVALID_COMPANY_ID,
            /**
             * Code R82. A rare return reason. The foreign receiving bank identifier for an
             * International ACH Transfer was invalid.
             */
            INVALID_FOREIGN_RECEIVING_DFI_IDENTIFICATION,
            /**
             * Code R22. A rare return reason. The Individual ID number field of the ACH was
             * invalid.
             */
            INVALID_INDIVIDUAL_ID_NUMBER,
            /**
             * Code R53. A rare return reason. Both the Represented Check ("RCK") entry and the
             * original check were presented to the bank.
             */
            ITEM_AND_RCK_ENTRY_PRESENTED_FOR_PAYMENT,
            /**
             * Code R51. A rare return reason. The Represented Check ("RCK") entry is ineligible.
             */
            ITEM_RELATED_TO_RCK_ENTRY_IS_INELIGIBLE,
            /** Code R26. A rare return reason. The ACH is missing a required field. */
            MANDATORY_FIELD_ERROR,
            /**
             * Code R71. A rare return reason. The receiving bank does not recognize the routing
             * number in a dishonored return entry.
             */
            MISROUTED_DISHONORED_RETURN,
            /**
             * Code R61. A rare return reason. The receiving bank does not recognize the routing
             * number in a return entry.
             */
            MISROUTED_RETURN,
            /**
             * Code R76. A rare return reason. Sent in response to a return, the bank does not find
             * the errors alleged by the returning bank.
             */
            NO_ERRORS_FOUND,
            /**
             * Code R77. A rare return reason. The receiving bank does not accept the return of the
             * erroneous debit. The funds are not available at the receiving bank.
             */
            NON_ACCEPTANCE_OF_R62_DISHONORED_RETURN,
            /**
             * Code R81. A rare return reason. The receiving bank does not accept International ACH
             * Transfers.
             */
            NON_PARTICIPANT_IN_IAT_PROGRAM,
            /**
             * Code R31. A rare return reason. A return that has been agreed to be accepted by the
             * receiving bank, despite falling outside of the usual return timeframe.
             */
            PERMISSIBLE_RETURN_ENTRY,
            /** Code R70. A rare return reason. The receiving bank had not approved this return. */
            PERMISSIBLE_RETURN_ENTRY_NOT_ACCEPTED,
            /**
             * Code R32. A rare return reason. The receiving bank could not settle this transaction.
             */
            RDFI_NON_SETTLEMENT,
            /**
             * Code R30. A rare return reason. The receiving bank does not accept Check Truncation
             * ACH transfers.
             */
            RDFI_PARTICIPANT_IN_CHECK_TRUNCATION_PROGRAM,
            /** Code R14. A rare return reason. The payee is deceased. */
            REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY,
            /**
             * Code R75. A rare return reason. The originating bank disputes that an earlier
             * `duplicate_entry` return was actually a duplicate.
             */
            RETURN_NOT_A_DUPLICATE,
            /**
             * Code R62. A rare return reason. The originating financial institution made a mistake
             * and this return corrects it.
             */
            RETURN_OF_ERRONEOUS_OR_REVERSING_DEBIT,
            /** Code R36. A rare return reason. Return of a malformed credit entry. */
            RETURN_OF_IMPROPER_CREDIT_ENTRY,
            /** Code R35. A rare return reason. Return of a malformed debit entry. */
            RETURN_OF_IMPROPER_DEBIT_ENTRY,
            /** Code R33. A rare return reason. Return of a destroyed check ("XCK") entry. */
            RETURN_OF_XCK_ENTRY,
            /**
             * Code R37. A rare return reason. The source document related to this ACH, usually an
             * ACH check conversion, was presented to the bank.
             */
            SOURCE_DOCUMENT_PRESENTED_FOR_PAYMENT,
            /**
             * Code R50. A rare return reason. State law prevents the bank from accepting the
             * Represented Check ("RCK") entry.
             */
            STATE_LAW_AFFECTING_RCK_ACCEPTANCE,
            /**
             * Code R52. A rare return reason. A stop payment was issued on a Represented Check
             * ("RCK") entry.
             */
            STOP_PAYMENT_ON_ITEM_RELATED_TO_RCK_ENTRY,
            /**
             * Code R38. A rare return reason. The source attached to the ACH, usually an ACH check
             * conversion, includes a stop payment.
             */
            STOP_PAYMENT_ON_SOURCE_DOCUMENT,
            /**
             * Code R73. A rare return reason. The bank receiving an `untimely_return` believes it
             * was on time.
             */
            TIMELY_ORIGINAL_RETURN,
            /**
             * Code R27. A rare return reason. An ACH return's trace number does not match an
             * originated ACH.
             */
            TRACE_NUMBER_ERROR,
            /** Code R72. A rare return reason. The dishonored return was sent too late. */
            UNTIMELY_DISHONORED_RETURN,
            /** Code R68. A rare return reason. The return was sent too late. */
            UNTIMELY_RETURN,
        }

        /**
         * An enum containing [Reason]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Reason] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            /**
             * Code R01. Insufficient funds in the receiving account. Sometimes abbreviated to
             * "NSF."
             */
            INSUFFICIENT_FUND,
            /**
             * Code R03. The account does not exist or the receiving bank was unable to locate it.
             */
            NO_ACCOUNT,
            /** Code R02. The account is closed at the receiving bank. */
            ACCOUNT_CLOSED,
            /** Code R04. The account number is invalid at the receiving bank. */
            INVALID_ACCOUNT_NUMBER_STRUCTURE,
            /**
             * Code R16. This return code has two separate meanings. (1) The receiving bank froze
             * the account or (2) the Office of Foreign Assets Control (OFAC) instructed the
             * receiving bank to return the entry.
             */
            ACCOUNT_FROZEN_ENTRY_RETURNED_PER_OFAC_INSTRUCTION,
            /** Code R23. The receiving bank refused the credit transfer. */
            CREDIT_ENTRY_REFUSED_BY_RECEIVER,
            /**
             * Code R05. The receiving bank rejected because of an incorrect Standard Entry Class
             * code. Consumer accounts cannot be debited as `corporate_credit_or_debit` or
             * `corporate_trade_exchange`.
             */
            UNAUTHORIZED_DEBIT_TO_CONSUMER_ACCOUNT_USING_CORPORATE_SEC_CODE,
            /** Code R29. The corporate customer at the receiving bank reversed the transfer. */
            CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED,
            /** Code R08. The receiving bank stopped payment on this transfer. */
            PAYMENT_STOPPED,
            /**
             * Code R20. The account is not eligible for ACH, such as a savings account with
             * transaction limits.
             */
            NON_TRANSACTION_ACCOUNT,
            /**
             * Code R09. The receiving bank account does not have enough available balance for the
             * transfer.
             */
            UNCOLLECTED_FUNDS,
            /** Code R28. The routing number is incorrect. */
            ROUTING_NUMBER_CHECK_DIGIT_ERROR,
            /** Code R10. The customer at the receiving bank reversed the transfer. */
            CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE,
            /** Code R19. The amount field is incorrect or too large. */
            AMOUNT_FIELD_ERROR,
            /**
             * Code R07. The customer revoked their authorization for a previously authorized
             * transfer.
             */
            AUTHORIZATION_REVOKED_BY_CUSTOMER,
            /** Code R13. The routing number is invalid. */
            INVALID_ACH_ROUTING_NUMBER,
            /** Code R17. The receiving bank is unable to process a field in the transfer. */
            FILE_RECORD_EDIT_CRITERIA,
            /** Code R45. A rare return reason. The individual name field was invalid. */
            ENR_INVALID_INDIVIDUAL_NAME,
            /**
             * Code R06. The originating financial institution asked for this transfer to be
             * returned. The receiving bank is complying with the request.
             */
            RETURNED_PER_ODFI_REQUEST,
            /**
             * Code R34. The receiving bank's regulatory supervisor has limited their participation
             * in the ACH network.
             */
            LIMITED_PARTICIPATION_DFI,
            /** Code R85. The outbound international ACH transfer was incorrect. */
            INCORRECTLY_CODED_OUTBOUND_INTERNATIONAL_PAYMENT,
            /** Code R12. A rare return reason. The account was sold to another bank. */
            ACCOUNT_SOLD_TO_ANOTHER_DFI,
            /** Code R25. The addenda record is incorrect or missing. */
            ADDENDA_ERROR,
            /** Code R15. A rare return reason. The account holder is deceased. */
            BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED,
            /**
             * Code R11. A rare return reason. The customer authorized some payment to the sender,
             * but this payment was not in error.
             */
            CUSTOMER_ADVISED_NOT_WITHIN_AUTHORIZATION_TERMS,
            /**
             * Code R74. A rare return reason. Sent in response to a return that was returned with
             * code `field_error`. The latest return should include the corrected field(s).
             */
            CORRECTED_RETURN,
            /**
             * Code R24. A rare return reason. The receiving bank received an exact duplicate entry
             * with the same trace number and amount.
             */
            DUPLICATE_ENTRY,
            /**
             * Code R67. A rare return reason. The return this message refers to was a duplicate.
             */
            DUPLICATE_RETURN,
            /**
             * Code R47. A rare return reason. Only used for US Government agency non-monetary
             * automatic enrollment messages.
             */
            ENR_DUPLICATE_ENROLLMENT,
            /**
             * Code R43. A rare return reason. Only used for US Government agency non-monetary
             * automatic enrollment messages.
             */
            ENR_INVALID_DFI_ACCOUNT_NUMBER,
            /**
             * Code R44. A rare return reason. Only used for US Government agency non-monetary
             * automatic enrollment messages.
             */
            ENR_INVALID_INDIVIDUAL_ID_NUMBER,
            /**
             * Code R46. A rare return reason. Only used for US Government agency non-monetary
             * automatic enrollment messages.
             */
            ENR_INVALID_REPRESENTATIVE_PAYEE_INDICATOR,
            /**
             * Code R41. A rare return reason. Only used for US Government agency non-monetary
             * automatic enrollment messages.
             */
            ENR_INVALID_TRANSACTION_CODE,
            /**
             * Code R40. A rare return reason. Only used for US Government agency non-monetary
             * automatic enrollment messages.
             */
            ENR_RETURN_OF_ENR_ENTRY,
            /**
             * Code R42. A rare return reason. Only used for US Government agency non-monetary
             * automatic enrollment messages.
             */
            ENR_ROUTING_NUMBER_CHECK_DIGIT_ERROR,
            /**
             * Code R84. A rare return reason. The International ACH Transfer cannot be processed by
             * the gateway.
             */
            ENTRY_NOT_PROCESSED_BY_GATEWAY,
            /**
             * Code R69. A rare return reason. One or more of the fields in the ACH were malformed.
             */
            FIELD_ERROR,
            /**
             * Code R83. A rare return reason. The Foreign receiving bank was unable to settle this
             * ACH transfer.
             */
            FOREIGN_RECEIVING_DFI_UNABLE_TO_SETTLE,
            /** Code R80. A rare return reason. The International ACH Transfer is malformed. */
            IAT_ENTRY_CODING_ERROR,
            /**
             * Code R18. A rare return reason. The ACH has an improper effective entry date field.
             */
            IMPROPER_EFFECTIVE_ENTRY_DATE,
            /**
             * Code R39. A rare return reason. The source document related to this ACH, usually an
             * ACH check conversion, was presented to the bank.
             */
            IMPROPER_SOURCE_DOCUMENT_SOURCE_DOCUMENT_PRESENTED,
            /** Code R21. A rare return reason. The Company ID field of the ACH was invalid. */
            INVALID_COMPANY_ID,
            /**
             * Code R82. A rare return reason. The foreign receiving bank identifier for an
             * International ACH Transfer was invalid.
             */
            INVALID_FOREIGN_RECEIVING_DFI_IDENTIFICATION,
            /**
             * Code R22. A rare return reason. The Individual ID number field of the ACH was
             * invalid.
             */
            INVALID_INDIVIDUAL_ID_NUMBER,
            /**
             * Code R53. A rare return reason. Both the Represented Check ("RCK") entry and the
             * original check were presented to the bank.
             */
            ITEM_AND_RCK_ENTRY_PRESENTED_FOR_PAYMENT,
            /**
             * Code R51. A rare return reason. The Represented Check ("RCK") entry is ineligible.
             */
            ITEM_RELATED_TO_RCK_ENTRY_IS_INELIGIBLE,
            /** Code R26. A rare return reason. The ACH is missing a required field. */
            MANDATORY_FIELD_ERROR,
            /**
             * Code R71. A rare return reason. The receiving bank does not recognize the routing
             * number in a dishonored return entry.
             */
            MISROUTED_DISHONORED_RETURN,
            /**
             * Code R61. A rare return reason. The receiving bank does not recognize the routing
             * number in a return entry.
             */
            MISROUTED_RETURN,
            /**
             * Code R76. A rare return reason. Sent in response to a return, the bank does not find
             * the errors alleged by the returning bank.
             */
            NO_ERRORS_FOUND,
            /**
             * Code R77. A rare return reason. The receiving bank does not accept the return of the
             * erroneous debit. The funds are not available at the receiving bank.
             */
            NON_ACCEPTANCE_OF_R62_DISHONORED_RETURN,
            /**
             * Code R81. A rare return reason. The receiving bank does not accept International ACH
             * Transfers.
             */
            NON_PARTICIPANT_IN_IAT_PROGRAM,
            /**
             * Code R31. A rare return reason. A return that has been agreed to be accepted by the
             * receiving bank, despite falling outside of the usual return timeframe.
             */
            PERMISSIBLE_RETURN_ENTRY,
            /** Code R70. A rare return reason. The receiving bank had not approved this return. */
            PERMISSIBLE_RETURN_ENTRY_NOT_ACCEPTED,
            /**
             * Code R32. A rare return reason. The receiving bank could not settle this transaction.
             */
            RDFI_NON_SETTLEMENT,
            /**
             * Code R30. A rare return reason. The receiving bank does not accept Check Truncation
             * ACH transfers.
             */
            RDFI_PARTICIPANT_IN_CHECK_TRUNCATION_PROGRAM,
            /** Code R14. A rare return reason. The payee is deceased. */
            REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY,
            /**
             * Code R75. A rare return reason. The originating bank disputes that an earlier
             * `duplicate_entry` return was actually a duplicate.
             */
            RETURN_NOT_A_DUPLICATE,
            /**
             * Code R62. A rare return reason. The originating financial institution made a mistake
             * and this return corrects it.
             */
            RETURN_OF_ERRONEOUS_OR_REVERSING_DEBIT,
            /** Code R36. A rare return reason. Return of a malformed credit entry. */
            RETURN_OF_IMPROPER_CREDIT_ENTRY,
            /** Code R35. A rare return reason. Return of a malformed debit entry. */
            RETURN_OF_IMPROPER_DEBIT_ENTRY,
            /** Code R33. A rare return reason. Return of a destroyed check ("XCK") entry. */
            RETURN_OF_XCK_ENTRY,
            /**
             * Code R37. A rare return reason. The source document related to this ACH, usually an
             * ACH check conversion, was presented to the bank.
             */
            SOURCE_DOCUMENT_PRESENTED_FOR_PAYMENT,
            /**
             * Code R50. A rare return reason. State law prevents the bank from accepting the
             * Represented Check ("RCK") entry.
             */
            STATE_LAW_AFFECTING_RCK_ACCEPTANCE,
            /**
             * Code R52. A rare return reason. A stop payment was issued on a Represented Check
             * ("RCK") entry.
             */
            STOP_PAYMENT_ON_ITEM_RELATED_TO_RCK_ENTRY,
            /**
             * Code R38. A rare return reason. The source attached to the ACH, usually an ACH check
             * conversion, includes a stop payment.
             */
            STOP_PAYMENT_ON_SOURCE_DOCUMENT,
            /**
             * Code R73. A rare return reason. The bank receiving an `untimely_return` believes it
             * was on time.
             */
            TIMELY_ORIGINAL_RETURN,
            /**
             * Code R27. A rare return reason. An ACH return's trace number does not match an
             * originated ACH.
             */
            TRACE_NUMBER_ERROR,
            /** Code R72. A rare return reason. The dishonored return was sent too late. */
            UNTIMELY_DISHONORED_RETURN,
            /** Code R68. A rare return reason. The return was sent too late. */
            UNTIMELY_RETURN,
            /** An enum member indicating that [Reason] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
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

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws IncreaseInvalidDataException if this class instance's value is a not a known
         *   member.
         */
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

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws IncreaseInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                IncreaseInvalidDataException("Value is not a String")
            }

        private var validated: Boolean = false

        fun validate(): Reason = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: IncreaseInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Reason && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AchTransferReturnParams &&
            achTransferId == other.achTransferId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(achTransferId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "AchTransferReturnParams{achTransferId=$achTransferId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
