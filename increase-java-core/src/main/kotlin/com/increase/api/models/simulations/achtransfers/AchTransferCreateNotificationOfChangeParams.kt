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
import com.increase.api.core.checkRequired
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import com.increase.api.errors.IncreaseInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Simulates receiving a Notification of Change for an [ACH Transfer](#ach-transfers). */
class AchTransferCreateNotificationOfChangeParams
private constructor(
    private val achTransferId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** The identifier of the ACH Transfer you wish to create a notification of change for. */
    fun achTransferId(): Optional<String> = Optional.ofNullable(achTransferId)

    /**
     * The reason for the notification of change.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun changeCode(): ChangeCode = body.changeCode()

    /**
     * The corrected data for the notification of change (e.g., a new routing number).
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun correctedData(): String = body.correctedData()

    /**
     * Returns the raw JSON value of [changeCode].
     *
     * Unlike [changeCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _changeCode(): JsonField<ChangeCode> = body._changeCode()

    /**
     * Returns the raw JSON value of [correctedData].
     *
     * Unlike [correctedData], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _correctedData(): JsonField<String> = body._correctedData()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [AchTransferCreateNotificationOfChangeParams].
         *
         * The following fields are required:
         * ```java
         * .changeCode()
         * .correctedData()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AchTransferCreateNotificationOfChangeParams]. */
    class Builder internal constructor() {

        private var achTransferId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            achTransferCreateNotificationOfChangeParams: AchTransferCreateNotificationOfChangeParams
        ) = apply {
            achTransferId = achTransferCreateNotificationOfChangeParams.achTransferId
            body = achTransferCreateNotificationOfChangeParams.body.toBuilder()
            additionalHeaders =
                achTransferCreateNotificationOfChangeParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                achTransferCreateNotificationOfChangeParams.additionalQueryParams.toBuilder()
        }

        /** The identifier of the ACH Transfer you wish to create a notification of change for. */
        fun achTransferId(achTransferId: String?) = apply { this.achTransferId = achTransferId }

        /** Alias for calling [Builder.achTransferId] with `achTransferId.orElse(null)`. */
        fun achTransferId(achTransferId: Optional<String>) =
            achTransferId(achTransferId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [changeCode]
         * - [correctedData]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The reason for the notification of change. */
        fun changeCode(changeCode: ChangeCode) = apply { body.changeCode(changeCode) }

        /**
         * Sets [Builder.changeCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.changeCode] with a well-typed [ChangeCode] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun changeCode(changeCode: JsonField<ChangeCode>) = apply { body.changeCode(changeCode) }

        /** The corrected data for the notification of change (e.g., a new routing number). */
        fun correctedData(correctedData: String) = apply { body.correctedData(correctedData) }

        /**
         * Sets [Builder.correctedData] to an arbitrary JSON value.
         *
         * You should usually call [Builder.correctedData] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun correctedData(correctedData: JsonField<String>) = apply {
            body.correctedData(correctedData)
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

        /**
         * Returns an immutable instance of [AchTransferCreateNotificationOfChangeParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .changeCode()
         * .correctedData()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AchTransferCreateNotificationOfChangeParams =
            AchTransferCreateNotificationOfChangeParams(
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
    private constructor(
        private val changeCode: JsonField<ChangeCode>,
        private val correctedData: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("change_code")
            @ExcludeMissing
            changeCode: JsonField<ChangeCode> = JsonMissing.of(),
            @JsonProperty("corrected_data")
            @ExcludeMissing
            correctedData: JsonField<String> = JsonMissing.of(),
        ) : this(changeCode, correctedData, mutableMapOf())

        /**
         * The reason for the notification of change.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun changeCode(): ChangeCode = changeCode.getRequired("change_code")

        /**
         * The corrected data for the notification of change (e.g., a new routing number).
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun correctedData(): String = correctedData.getRequired("corrected_data")

        /**
         * Returns the raw JSON value of [changeCode].
         *
         * Unlike [changeCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("change_code")
        @ExcludeMissing
        fun _changeCode(): JsonField<ChangeCode> = changeCode

        /**
         * Returns the raw JSON value of [correctedData].
         *
         * Unlike [correctedData], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("corrected_data")
        @ExcludeMissing
        fun _correctedData(): JsonField<String> = correctedData

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

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .changeCode()
             * .correctedData()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var changeCode: JsonField<ChangeCode>? = null
            private var correctedData: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                changeCode = body.changeCode
                correctedData = body.correctedData
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The reason for the notification of change. */
            fun changeCode(changeCode: ChangeCode) = changeCode(JsonField.of(changeCode))

            /**
             * Sets [Builder.changeCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.changeCode] with a well-typed [ChangeCode] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun changeCode(changeCode: JsonField<ChangeCode>) = apply {
                this.changeCode = changeCode
            }

            /** The corrected data for the notification of change (e.g., a new routing number). */
            fun correctedData(correctedData: String) = correctedData(JsonField.of(correctedData))

            /**
             * Sets [Builder.correctedData] to an arbitrary JSON value.
             *
             * You should usually call [Builder.correctedData] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun correctedData(correctedData: JsonField<String>) = apply {
                this.correctedData = correctedData
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

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .changeCode()
             * .correctedData()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("changeCode", changeCode),
                    checkRequired("correctedData", correctedData),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            changeCode().validate()
            correctedData()
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
        @JvmSynthetic
        internal fun validity(): Int =
            (changeCode.asKnown().getOrNull()?.validity() ?: 0) +
                (if (correctedData.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && changeCode == other.changeCode && correctedData == other.correctedData && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(changeCode, correctedData, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{changeCode=$changeCode, correctedData=$correctedData, additionalProperties=$additionalProperties}"
    }

    /** The reason for the notification of change. */
    class ChangeCode @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            /** The account number was incorrect. */
            @JvmField val INCORRECT_ACCOUNT_NUMBER = of("incorrect_account_number")

            /** The routing number was incorrect. */
            @JvmField val INCORRECT_ROUTING_NUMBER = of("incorrect_routing_number")

            /** Both the routing number and the account number were incorrect. */
            @JvmField
            val INCORRECT_ROUTING_NUMBER_AND_ACCOUNT_NUMBER =
                of("incorrect_routing_number_and_account_number")

            /**
             * The transaction code was incorrect. Try changing the `funding` parameter from
             * checking to savings or vice-versa.
             */
            @JvmField val INCORRECT_TRANSACTION_CODE = of("incorrect_transaction_code")

            /** The account number and the transaction code were incorrect. */
            @JvmField
            val INCORRECT_ACCOUNT_NUMBER_AND_TRANSACTION_CODE =
                of("incorrect_account_number_and_transaction_code")

            /** The routing number, account number, and transaction code were incorrect. */
            @JvmField
            val INCORRECT_ROUTING_NUMBER_ACCOUNT_NUMBER_AND_TRANSACTION_CODE =
                of("incorrect_routing_number_account_number_and_transaction_code")

            /** The receiving depository financial institution identification was incorrect. */
            @JvmField
            val INCORRECT_RECEIVING_DEPOSITORY_FINANCIAL_INSTITUTION_IDENTIFICATION =
                of("incorrect_receiving_depository_financial_institution_identification")

            /** The individual identification number was incorrect. */
            @JvmField
            val INCORRECT_INDIVIDUAL_IDENTIFICATION_NUMBER =
                of("incorrect_individual_identification_number")

            /** The addenda had an incorrect format. */
            @JvmField val ADDENDA_FORMAT_ERROR = of("addenda_format_error")

            /**
             * The standard entry class code was incorrect for an outbound international payment.
             */
            @JvmField
            val INCORRECT_STANDARD_ENTRY_CLASS_CODE_FOR_OUTBOUND_INTERNATIONAL_PAYMENT =
                of("incorrect_standard_entry_class_code_for_outbound_international_payment")

            /** The notification of change was misrouted. */
            @JvmField val MISROUTED_NOTIFICATION_OF_CHANGE = of("misrouted_notification_of_change")

            /** The trace number was incorrect. */
            @JvmField val INCORRECT_TRACE_NUMBER = of("incorrect_trace_number")

            /** The company identification number was incorrect. */
            @JvmField
            val INCORRECT_COMPANY_IDENTIFICATION_NUMBER =
                of("incorrect_company_identification_number")

            /** The individual identification number or identification number was incorrect. */
            @JvmField val INCORRECT_IDENTIFICATION_NUMBER = of("incorrect_identification_number")

            /** The corrected data was incorrectly formatted. */
            @JvmField
            val INCORRECTLY_FORMATTED_CORRECTED_DATA = of("incorrectly_formatted_corrected_data")

            /** The discretionary data was incorrect. */
            @JvmField val INCORRECT_DISCRETIONARY_DATA = of("incorrect_discretionary_data")

            /** The routing number was not from the original entry detail record. */
            @JvmField
            val ROUTING_NUMBER_NOT_FROM_ORIGINAL_ENTRY_DETAIL_RECORD =
                of("routing_number_not_from_original_entry_detail_record")

            /**
             * The depository financial institution account number was not from the original entry
             * detail record.
             */
            @JvmField
            val DEPOSITORY_FINANCIAL_INSTITUTION_ACCOUNT_NUMBER_NOT_FROM_ORIGINAL_ENTRY_DETAIL_RECORD =
                of(
                    "depository_financial_institution_account_number_not_from_original_entry_detail_record"
                )

            /**
             * The transaction code was incorrect, initiated by the originating depository financial
             * institution.
             */
            @JvmField
            val INCORRECT_TRANSACTION_CODE_BY_ORIGINATING_DEPOSITORY_FINANCIAL_INSTITUTION =
                of("incorrect_transaction_code_by_originating_depository_financial_institution")

            @JvmStatic fun of(value: String) = ChangeCode(JsonField.of(value))
        }

        /** An enum containing [ChangeCode]'s known values. */
        enum class Known {
            /** The account number was incorrect. */
            INCORRECT_ACCOUNT_NUMBER,
            /** The routing number was incorrect. */
            INCORRECT_ROUTING_NUMBER,
            /** Both the routing number and the account number were incorrect. */
            INCORRECT_ROUTING_NUMBER_AND_ACCOUNT_NUMBER,
            /**
             * The transaction code was incorrect. Try changing the `funding` parameter from
             * checking to savings or vice-versa.
             */
            INCORRECT_TRANSACTION_CODE,
            /** The account number and the transaction code were incorrect. */
            INCORRECT_ACCOUNT_NUMBER_AND_TRANSACTION_CODE,
            /** The routing number, account number, and transaction code were incorrect. */
            INCORRECT_ROUTING_NUMBER_ACCOUNT_NUMBER_AND_TRANSACTION_CODE,
            /** The receiving depository financial institution identification was incorrect. */
            INCORRECT_RECEIVING_DEPOSITORY_FINANCIAL_INSTITUTION_IDENTIFICATION,
            /** The individual identification number was incorrect. */
            INCORRECT_INDIVIDUAL_IDENTIFICATION_NUMBER,
            /** The addenda had an incorrect format. */
            ADDENDA_FORMAT_ERROR,
            /**
             * The standard entry class code was incorrect for an outbound international payment.
             */
            INCORRECT_STANDARD_ENTRY_CLASS_CODE_FOR_OUTBOUND_INTERNATIONAL_PAYMENT,
            /** The notification of change was misrouted. */
            MISROUTED_NOTIFICATION_OF_CHANGE,
            /** The trace number was incorrect. */
            INCORRECT_TRACE_NUMBER,
            /** The company identification number was incorrect. */
            INCORRECT_COMPANY_IDENTIFICATION_NUMBER,
            /** The individual identification number or identification number was incorrect. */
            INCORRECT_IDENTIFICATION_NUMBER,
            /** The corrected data was incorrectly formatted. */
            INCORRECTLY_FORMATTED_CORRECTED_DATA,
            /** The discretionary data was incorrect. */
            INCORRECT_DISCRETIONARY_DATA,
            /** The routing number was not from the original entry detail record. */
            ROUTING_NUMBER_NOT_FROM_ORIGINAL_ENTRY_DETAIL_RECORD,
            /**
             * The depository financial institution account number was not from the original entry
             * detail record.
             */
            DEPOSITORY_FINANCIAL_INSTITUTION_ACCOUNT_NUMBER_NOT_FROM_ORIGINAL_ENTRY_DETAIL_RECORD,
            /**
             * The transaction code was incorrect, initiated by the originating depository financial
             * institution.
             */
            INCORRECT_TRANSACTION_CODE_BY_ORIGINATING_DEPOSITORY_FINANCIAL_INSTITUTION,
        }

        /**
         * An enum containing [ChangeCode]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ChangeCode] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            /** The account number was incorrect. */
            INCORRECT_ACCOUNT_NUMBER,
            /** The routing number was incorrect. */
            INCORRECT_ROUTING_NUMBER,
            /** Both the routing number and the account number were incorrect. */
            INCORRECT_ROUTING_NUMBER_AND_ACCOUNT_NUMBER,
            /**
             * The transaction code was incorrect. Try changing the `funding` parameter from
             * checking to savings or vice-versa.
             */
            INCORRECT_TRANSACTION_CODE,
            /** The account number and the transaction code were incorrect. */
            INCORRECT_ACCOUNT_NUMBER_AND_TRANSACTION_CODE,
            /** The routing number, account number, and transaction code were incorrect. */
            INCORRECT_ROUTING_NUMBER_ACCOUNT_NUMBER_AND_TRANSACTION_CODE,
            /** The receiving depository financial institution identification was incorrect. */
            INCORRECT_RECEIVING_DEPOSITORY_FINANCIAL_INSTITUTION_IDENTIFICATION,
            /** The individual identification number was incorrect. */
            INCORRECT_INDIVIDUAL_IDENTIFICATION_NUMBER,
            /** The addenda had an incorrect format. */
            ADDENDA_FORMAT_ERROR,
            /**
             * The standard entry class code was incorrect for an outbound international payment.
             */
            INCORRECT_STANDARD_ENTRY_CLASS_CODE_FOR_OUTBOUND_INTERNATIONAL_PAYMENT,
            /** The notification of change was misrouted. */
            MISROUTED_NOTIFICATION_OF_CHANGE,
            /** The trace number was incorrect. */
            INCORRECT_TRACE_NUMBER,
            /** The company identification number was incorrect. */
            INCORRECT_COMPANY_IDENTIFICATION_NUMBER,
            /** The individual identification number or identification number was incorrect. */
            INCORRECT_IDENTIFICATION_NUMBER,
            /** The corrected data was incorrectly formatted. */
            INCORRECTLY_FORMATTED_CORRECTED_DATA,
            /** The discretionary data was incorrect. */
            INCORRECT_DISCRETIONARY_DATA,
            /** The routing number was not from the original entry detail record. */
            ROUTING_NUMBER_NOT_FROM_ORIGINAL_ENTRY_DETAIL_RECORD,
            /**
             * The depository financial institution account number was not from the original entry
             * detail record.
             */
            DEPOSITORY_FINANCIAL_INSTITUTION_ACCOUNT_NUMBER_NOT_FROM_ORIGINAL_ENTRY_DETAIL_RECORD,
            /**
             * The transaction code was incorrect, initiated by the originating depository financial
             * institution.
             */
            INCORRECT_TRANSACTION_CODE_BY_ORIGINATING_DEPOSITORY_FINANCIAL_INSTITUTION,
            /**
             * An enum member indicating that [ChangeCode] was instantiated with an unknown value.
             */
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

        fun validate(): ChangeCode = apply {
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

            return /* spotless:off */ other is ChangeCode && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AchTransferCreateNotificationOfChangeParams && achTransferId == other.achTransferId && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(achTransferId, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "AchTransferCreateNotificationOfChangeParams{achTransferId=$achTransferId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
