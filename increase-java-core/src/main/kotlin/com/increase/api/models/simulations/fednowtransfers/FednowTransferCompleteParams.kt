// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.simulations.fednowtransfers

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

/**
 * Simulates submission of a [FedNow Transfer](#fednow-transfers) and handling the response from the
 * destination financial institution. This transfer must first have a `status` of
 * `pending_submitting`.
 */
class FednowTransferCompleteParams
private constructor(
    private val fednowTransferId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** The identifier of the FedNow Transfer you wish to complete. */
    fun fednowTransferId(): Optional<String> = Optional.ofNullable(fednowTransferId)

    /**
     * If set, the simulation will reject the transfer.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rejection(): Optional<Rejection> = body.rejection()

    /**
     * Returns the raw JSON value of [rejection].
     *
     * Unlike [rejection], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _rejection(): JsonField<Rejection> = body._rejection()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): FednowTransferCompleteParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of [FednowTransferCompleteParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FednowTransferCompleteParams]. */
    class Builder internal constructor() {

        private var fednowTransferId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(fednowTransferCompleteParams: FednowTransferCompleteParams) = apply {
            fednowTransferId = fednowTransferCompleteParams.fednowTransferId
            body = fednowTransferCompleteParams.body.toBuilder()
            additionalHeaders = fednowTransferCompleteParams.additionalHeaders.toBuilder()
            additionalQueryParams = fednowTransferCompleteParams.additionalQueryParams.toBuilder()
        }

        /** The identifier of the FedNow Transfer you wish to complete. */
        fun fednowTransferId(fednowTransferId: String?) = apply {
            this.fednowTransferId = fednowTransferId
        }

        /** Alias for calling [Builder.fednowTransferId] with `fednowTransferId.orElse(null)`. */
        fun fednowTransferId(fednowTransferId: Optional<String>) =
            fednowTransferId(fednowTransferId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [rejection]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** If set, the simulation will reject the transfer. */
        fun rejection(rejection: Rejection) = apply { body.rejection(rejection) }

        /**
         * Sets [Builder.rejection] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rejection] with a well-typed [Rejection] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun rejection(rejection: JsonField<Rejection>) = apply { body.rejection(rejection) }

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
         * Returns an immutable instance of [FednowTransferCompleteParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): FednowTransferCompleteParams =
            FednowTransferCompleteParams(
                fednowTransferId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> fednowTransferId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val rejection: JsonField<Rejection>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("rejection")
            @ExcludeMissing
            rejection: JsonField<Rejection> = JsonMissing.of()
        ) : this(rejection, mutableMapOf())

        /**
         * If set, the simulation will reject the transfer.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun rejection(): Optional<Rejection> = rejection.getOptional("rejection")

        /**
         * Returns the raw JSON value of [rejection].
         *
         * Unlike [rejection], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("rejection")
        @ExcludeMissing
        fun _rejection(): JsonField<Rejection> = rejection

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

            private var rejection: JsonField<Rejection> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                rejection = body.rejection
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** If set, the simulation will reject the transfer. */
            fun rejection(rejection: Rejection) = rejection(JsonField.of(rejection))

            /**
             * Sets [Builder.rejection] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rejection] with a well-typed [Rejection] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun rejection(rejection: JsonField<Rejection>) = apply { this.rejection = rejection }

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
            fun build(): Body = Body(rejection, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws IncreaseInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            rejection().ifPresent { it.validate() }
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
        internal fun validity(): Int = (rejection.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                rejection == other.rejection &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(rejection, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{rejection=$rejection, additionalProperties=$additionalProperties}"
    }

    /** If set, the simulation will reject the transfer. */
    class Rejection
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val rejectReasonCode: JsonField<RejectReasonCode>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("reject_reason_code")
            @ExcludeMissing
            rejectReasonCode: JsonField<RejectReasonCode> = JsonMissing.of()
        ) : this(rejectReasonCode, mutableMapOf())

        /**
         * The reason code that the simulated rejection will have.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun rejectReasonCode(): RejectReasonCode =
            rejectReasonCode.getRequired("reject_reason_code")

        /**
         * Returns the raw JSON value of [rejectReasonCode].
         *
         * Unlike [rejectReasonCode], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("reject_reason_code")
        @ExcludeMissing
        fun _rejectReasonCode(): JsonField<RejectReasonCode> = rejectReasonCode

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
             * Returns a mutable builder for constructing an instance of [Rejection].
             *
             * The following fields are required:
             * ```java
             * .rejectReasonCode()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Rejection]. */
        class Builder internal constructor() {

            private var rejectReasonCode: JsonField<RejectReasonCode>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(rejection: Rejection) = apply {
                rejectReasonCode = rejection.rejectReasonCode
                additionalProperties = rejection.additionalProperties.toMutableMap()
            }

            /** The reason code that the simulated rejection will have. */
            fun rejectReasonCode(rejectReasonCode: RejectReasonCode) =
                rejectReasonCode(JsonField.of(rejectReasonCode))

            /**
             * Sets [Builder.rejectReasonCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rejectReasonCode] with a well-typed
             * [RejectReasonCode] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun rejectReasonCode(rejectReasonCode: JsonField<RejectReasonCode>) = apply {
                this.rejectReasonCode = rejectReasonCode
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
             * Returns an immutable instance of [Rejection].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .rejectReasonCode()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Rejection =
                Rejection(
                    checkRequired("rejectReasonCode", rejectReasonCode),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws IncreaseInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Rejection = apply {
            if (validated) {
                return@apply
            }

            rejectReasonCode().validate()
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
        internal fun validity(): Int = (rejectReasonCode.asKnown().getOrNull()?.validity() ?: 0)

        /** The reason code that the simulated rejection will have. */
        class RejectReasonCode
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                /**
                 * The destination account is closed. Corresponds to the FedNow reason code `AC04`.
                 */
                @JvmField val ACCOUNT_CLOSED = of("account_closed")

                /**
                 * The destination account is currently blocked from receiving transactions.
                 * Corresponds to the FedNow reason code `AC06`.
                 */
                @JvmField val ACCOUNT_BLOCKED = of("account_blocked")

                /**
                 * The destination account is ineligible to receive FedNow transfers. Corresponds to
                 * the FedNow reason code `AC14`.
                 */
                @JvmField val INVALID_CREDITOR_ACCOUNT_TYPE = of("invalid_creditor_account_type")

                /**
                 * The destination account does not exist. Corresponds to the FedNow reason code
                 * `AC03`.
                 */
                @JvmField
                val INVALID_CREDITOR_ACCOUNT_NUMBER = of("invalid_creditor_account_number")

                /**
                 * The destination routing number is invalid. Corresponds to the FedNow reason code
                 * `RC04`.
                 */
                @JvmField
                val INVALID_CREDITOR_FINANCIAL_INSTITUTION_IDENTIFIER =
                    of("invalid_creditor_financial_institution_identifier")

                /**
                 * The destination account holder is deceased. Corresponds to the FedNow reason code
                 * `MD07`.
                 */
                @JvmField val END_CUSTOMER_DECEASED = of("end_customer_deceased")

                /**
                 * The reason is provided as narrative information in the additional information
                 * field. Corresponds to the FedNow reason code `NARR`.
                 */
                @JvmField val NARRATIVE = of("narrative")

                /**
                 * FedNow transfers are not allowed to the destination account. Corresponds to the
                 * FedNow reason code `AG01`.
                 */
                @JvmField val TRANSACTION_FORBIDDEN = of("transaction_forbidden")

                /**
                 * FedNow transfers are not enabled for the destination account. Corresponds to the
                 * FedNow reason code `AG03`.
                 */
                @JvmField val TRANSACTION_TYPE_NOT_SUPPORTED = of("transaction_type_not_supported")

                /**
                 * The amount is higher than the recipient is authorized to send or receive.
                 * Corresponds to the FedNow reason code `E990`.
                 */
                @JvmField val AMOUNT_EXCEEDS_BANK_LIMITS = of("amount_exceeds_bank_limits")

                /**
                 * The creditor's address is required, but missing or invalid. Corresponds to the
                 * FedNow reason code `BE04`.
                 */
                @JvmField val INVALID_CREDITOR_ADDRESS = of("invalid_creditor_address")

                /**
                 * The debtor's address is required, but missing or invalid. Corresponds to the
                 * FedNow reason code `BE07`.
                 */
                @JvmField val INVALID_DEBTOR_ADDRESS = of("invalid_debtor_address")

                /**
                 * There was a timeout processing the transfer. Corresponds to the FedNow reason
                 * code `E997`.
                 */
                @JvmField val TIMEOUT = of("timeout")

                /**
                 * The transfer was rejected due to an internal Increase issue. We have been
                 * notified.
                 */
                @JvmField val PROCESSING_ERROR = of("processing_error")

                /** Some other error or issue has occurred. */
                @JvmField val OTHER = of("other")

                @JvmStatic fun of(value: String) = RejectReasonCode(JsonField.of(value))
            }

            /** An enum containing [RejectReasonCode]'s known values. */
            enum class Known {
                /**
                 * The destination account is closed. Corresponds to the FedNow reason code `AC04`.
                 */
                ACCOUNT_CLOSED,
                /**
                 * The destination account is currently blocked from receiving transactions.
                 * Corresponds to the FedNow reason code `AC06`.
                 */
                ACCOUNT_BLOCKED,
                /**
                 * The destination account is ineligible to receive FedNow transfers. Corresponds to
                 * the FedNow reason code `AC14`.
                 */
                INVALID_CREDITOR_ACCOUNT_TYPE,
                /**
                 * The destination account does not exist. Corresponds to the FedNow reason code
                 * `AC03`.
                 */
                INVALID_CREDITOR_ACCOUNT_NUMBER,
                /**
                 * The destination routing number is invalid. Corresponds to the FedNow reason code
                 * `RC04`.
                 */
                INVALID_CREDITOR_FINANCIAL_INSTITUTION_IDENTIFIER,
                /**
                 * The destination account holder is deceased. Corresponds to the FedNow reason code
                 * `MD07`.
                 */
                END_CUSTOMER_DECEASED,
                /**
                 * The reason is provided as narrative information in the additional information
                 * field. Corresponds to the FedNow reason code `NARR`.
                 */
                NARRATIVE,
                /**
                 * FedNow transfers are not allowed to the destination account. Corresponds to the
                 * FedNow reason code `AG01`.
                 */
                TRANSACTION_FORBIDDEN,
                /**
                 * FedNow transfers are not enabled for the destination account. Corresponds to the
                 * FedNow reason code `AG03`.
                 */
                TRANSACTION_TYPE_NOT_SUPPORTED,
                /**
                 * The amount is higher than the recipient is authorized to send or receive.
                 * Corresponds to the FedNow reason code `E990`.
                 */
                AMOUNT_EXCEEDS_BANK_LIMITS,
                /**
                 * The creditor's address is required, but missing or invalid. Corresponds to the
                 * FedNow reason code `BE04`.
                 */
                INVALID_CREDITOR_ADDRESS,
                /**
                 * The debtor's address is required, but missing or invalid. Corresponds to the
                 * FedNow reason code `BE07`.
                 */
                INVALID_DEBTOR_ADDRESS,
                /**
                 * There was a timeout processing the transfer. Corresponds to the FedNow reason
                 * code `E997`.
                 */
                TIMEOUT,
                /**
                 * The transfer was rejected due to an internal Increase issue. We have been
                 * notified.
                 */
                PROCESSING_ERROR,
                /** Some other error or issue has occurred. */
                OTHER,
            }

            /**
             * An enum containing [RejectReasonCode]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [RejectReasonCode] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                /**
                 * The destination account is closed. Corresponds to the FedNow reason code `AC04`.
                 */
                ACCOUNT_CLOSED,
                /**
                 * The destination account is currently blocked from receiving transactions.
                 * Corresponds to the FedNow reason code `AC06`.
                 */
                ACCOUNT_BLOCKED,
                /**
                 * The destination account is ineligible to receive FedNow transfers. Corresponds to
                 * the FedNow reason code `AC14`.
                 */
                INVALID_CREDITOR_ACCOUNT_TYPE,
                /**
                 * The destination account does not exist. Corresponds to the FedNow reason code
                 * `AC03`.
                 */
                INVALID_CREDITOR_ACCOUNT_NUMBER,
                /**
                 * The destination routing number is invalid. Corresponds to the FedNow reason code
                 * `RC04`.
                 */
                INVALID_CREDITOR_FINANCIAL_INSTITUTION_IDENTIFIER,
                /**
                 * The destination account holder is deceased. Corresponds to the FedNow reason code
                 * `MD07`.
                 */
                END_CUSTOMER_DECEASED,
                /**
                 * The reason is provided as narrative information in the additional information
                 * field. Corresponds to the FedNow reason code `NARR`.
                 */
                NARRATIVE,
                /**
                 * FedNow transfers are not allowed to the destination account. Corresponds to the
                 * FedNow reason code `AG01`.
                 */
                TRANSACTION_FORBIDDEN,
                /**
                 * FedNow transfers are not enabled for the destination account. Corresponds to the
                 * FedNow reason code `AG03`.
                 */
                TRANSACTION_TYPE_NOT_SUPPORTED,
                /**
                 * The amount is higher than the recipient is authorized to send or receive.
                 * Corresponds to the FedNow reason code `E990`.
                 */
                AMOUNT_EXCEEDS_BANK_LIMITS,
                /**
                 * The creditor's address is required, but missing or invalid. Corresponds to the
                 * FedNow reason code `BE04`.
                 */
                INVALID_CREDITOR_ADDRESS,
                /**
                 * The debtor's address is required, but missing or invalid. Corresponds to the
                 * FedNow reason code `BE07`.
                 */
                INVALID_DEBTOR_ADDRESS,
                /**
                 * There was a timeout processing the transfer. Corresponds to the FedNow reason
                 * code `E997`.
                 */
                TIMEOUT,
                /**
                 * The transfer was rejected due to an internal Increase issue. We have been
                 * notified.
                 */
                PROCESSING_ERROR,
                /** Some other error or issue has occurred. */
                OTHER,
                /**
                 * An enum member indicating that [RejectReasonCode] was instantiated with an
                 * unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    ACCOUNT_CLOSED -> Value.ACCOUNT_CLOSED
                    ACCOUNT_BLOCKED -> Value.ACCOUNT_BLOCKED
                    INVALID_CREDITOR_ACCOUNT_TYPE -> Value.INVALID_CREDITOR_ACCOUNT_TYPE
                    INVALID_CREDITOR_ACCOUNT_NUMBER -> Value.INVALID_CREDITOR_ACCOUNT_NUMBER
                    INVALID_CREDITOR_FINANCIAL_INSTITUTION_IDENTIFIER ->
                        Value.INVALID_CREDITOR_FINANCIAL_INSTITUTION_IDENTIFIER
                    END_CUSTOMER_DECEASED -> Value.END_CUSTOMER_DECEASED
                    NARRATIVE -> Value.NARRATIVE
                    TRANSACTION_FORBIDDEN -> Value.TRANSACTION_FORBIDDEN
                    TRANSACTION_TYPE_NOT_SUPPORTED -> Value.TRANSACTION_TYPE_NOT_SUPPORTED
                    AMOUNT_EXCEEDS_BANK_LIMITS -> Value.AMOUNT_EXCEEDS_BANK_LIMITS
                    INVALID_CREDITOR_ADDRESS -> Value.INVALID_CREDITOR_ADDRESS
                    INVALID_DEBTOR_ADDRESS -> Value.INVALID_DEBTOR_ADDRESS
                    TIMEOUT -> Value.TIMEOUT
                    PROCESSING_ERROR -> Value.PROCESSING_ERROR
                    OTHER -> Value.OTHER
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws IncreaseInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    ACCOUNT_CLOSED -> Known.ACCOUNT_CLOSED
                    ACCOUNT_BLOCKED -> Known.ACCOUNT_BLOCKED
                    INVALID_CREDITOR_ACCOUNT_TYPE -> Known.INVALID_CREDITOR_ACCOUNT_TYPE
                    INVALID_CREDITOR_ACCOUNT_NUMBER -> Known.INVALID_CREDITOR_ACCOUNT_NUMBER
                    INVALID_CREDITOR_FINANCIAL_INSTITUTION_IDENTIFIER ->
                        Known.INVALID_CREDITOR_FINANCIAL_INSTITUTION_IDENTIFIER
                    END_CUSTOMER_DECEASED -> Known.END_CUSTOMER_DECEASED
                    NARRATIVE -> Known.NARRATIVE
                    TRANSACTION_FORBIDDEN -> Known.TRANSACTION_FORBIDDEN
                    TRANSACTION_TYPE_NOT_SUPPORTED -> Known.TRANSACTION_TYPE_NOT_SUPPORTED
                    AMOUNT_EXCEEDS_BANK_LIMITS -> Known.AMOUNT_EXCEEDS_BANK_LIMITS
                    INVALID_CREDITOR_ADDRESS -> Known.INVALID_CREDITOR_ADDRESS
                    INVALID_DEBTOR_ADDRESS -> Known.INVALID_DEBTOR_ADDRESS
                    TIMEOUT -> Known.TIMEOUT
                    PROCESSING_ERROR -> Known.PROCESSING_ERROR
                    OTHER -> Known.OTHER
                    else -> throw IncreaseInvalidDataException("Unknown RejectReasonCode: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws IncreaseInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    IncreaseInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws IncreaseInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): RejectReasonCode = apply {
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

                return other is RejectReasonCode && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Rejection &&
                rejectReasonCode == other.rejectReasonCode &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(rejectReasonCode, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Rejection{rejectReasonCode=$rejectReasonCode, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FednowTransferCompleteParams &&
            fednowTransferId == other.fednowTransferId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(fednowTransferId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "FednowTransferCompleteParams{fednowTransferId=$fednowTransferId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
