// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.realtimepaymentsrequestsforpayment

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.Params
import com.increase.api.core.checkRequired
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import com.increase.api.errors.IncreaseInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Create a Real-Time Payments Request for Payment */
class RealTimePaymentsRequestsForPaymentCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The identifier of the Account Number where the funds will land.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountNumberId(): String = body.accountNumberId()

    /**
     * The requested amount in USD cents. Must be positive.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun amount(): Long = body.amount()

    /**
     * Details of the person being requested to pay.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun debtor(): Debtor = body.debtor()

    /**
     * The debtor's account number, which the funds will be requested from.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun debtorAccountNumber(): String = body.debtorAccountNumber()

    /**
     * The debtor's American Bankers' Association (ABA) Routing Transit Number (RTN).
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun debtorRoutingNumber(): String = body.debtorRoutingNumber()

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time after which the request
     * for payment is no longer valid. After this time the debtor's bank should no longer allow the
     * debtor to pay it. Must not be before `requested_execution_at`.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun expiresAt(): OffsetDateTime = body.expiresAt()

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time by which you are
     * requesting the payment to be made.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun requestedExecutionAt(): OffsetDateTime = body.requestedExecutionAt()

    /**
     * Unstructured information that will show on the recipient's bank statement.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun unstructuredRemittanceInformation(): String = body.unstructuredRemittanceInformation()

    /**
     * The name of the creditor requesting the payment. If not provided, defaults to the name of the
     * account's entity.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun creditorName(): Optional<String> = body.creditorName()

    /**
     * Returns the raw JSON value of [accountNumberId].
     *
     * Unlike [accountNumberId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _accountNumberId(): JsonField<String> = body._accountNumberId()

    /**
     * Returns the raw JSON value of [amount].
     *
     * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _amount(): JsonField<Long> = body._amount()

    /**
     * Returns the raw JSON value of [debtor].
     *
     * Unlike [debtor], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _debtor(): JsonField<Debtor> = body._debtor()

    /**
     * Returns the raw JSON value of [debtorAccountNumber].
     *
     * Unlike [debtorAccountNumber], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _debtorAccountNumber(): JsonField<String> = body._debtorAccountNumber()

    /**
     * Returns the raw JSON value of [debtorRoutingNumber].
     *
     * Unlike [debtorRoutingNumber], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _debtorRoutingNumber(): JsonField<String> = body._debtorRoutingNumber()

    /**
     * Returns the raw JSON value of [expiresAt].
     *
     * Unlike [expiresAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _expiresAt(): JsonField<OffsetDateTime> = body._expiresAt()

    /**
     * Returns the raw JSON value of [requestedExecutionAt].
     *
     * Unlike [requestedExecutionAt], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _requestedExecutionAt(): JsonField<OffsetDateTime> = body._requestedExecutionAt()

    /**
     * Returns the raw JSON value of [unstructuredRemittanceInformation].
     *
     * Unlike [unstructuredRemittanceInformation], this method doesn't throw if the JSON field has
     * an unexpected type.
     */
    fun _unstructuredRemittanceInformation(): JsonField<String> =
        body._unstructuredRemittanceInformation()

    /**
     * Returns the raw JSON value of [creditorName].
     *
     * Unlike [creditorName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _creditorName(): JsonField<String> = body._creditorName()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [RealTimePaymentsRequestsForPaymentCreateParams].
         *
         * The following fields are required:
         * ```java
         * .accountNumberId()
         * .amount()
         * .debtor()
         * .debtorAccountNumber()
         * .debtorRoutingNumber()
         * .expiresAt()
         * .requestedExecutionAt()
         * .unstructuredRemittanceInformation()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RealTimePaymentsRequestsForPaymentCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            realTimePaymentsRequestsForPaymentCreateParams:
                RealTimePaymentsRequestsForPaymentCreateParams
        ) = apply {
            body = realTimePaymentsRequestsForPaymentCreateParams.body.toBuilder()
            additionalHeaders =
                realTimePaymentsRequestsForPaymentCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                realTimePaymentsRequestsForPaymentCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [accountNumberId]
         * - [amount]
         * - [debtor]
         * - [debtorAccountNumber]
         * - [debtorRoutingNumber]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The identifier of the Account Number where the funds will land. */
        fun accountNumberId(accountNumberId: String) = apply {
            body.accountNumberId(accountNumberId)
        }

        /**
         * Sets [Builder.accountNumberId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountNumberId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun accountNumberId(accountNumberId: JsonField<String>) = apply {
            body.accountNumberId(accountNumberId)
        }

        /** The requested amount in USD cents. Must be positive. */
        fun amount(amount: Long) = apply { body.amount(amount) }

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amount(amount: JsonField<Long>) = apply { body.amount(amount) }

        /** Details of the person being requested to pay. */
        fun debtor(debtor: Debtor) = apply { body.debtor(debtor) }

        /**
         * Sets [Builder.debtor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.debtor] with a well-typed [Debtor] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun debtor(debtor: JsonField<Debtor>) = apply { body.debtor(debtor) }

        /** The debtor's account number, which the funds will be requested from. */
        fun debtorAccountNumber(debtorAccountNumber: String) = apply {
            body.debtorAccountNumber(debtorAccountNumber)
        }

        /**
         * Sets [Builder.debtorAccountNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.debtorAccountNumber] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun debtorAccountNumber(debtorAccountNumber: JsonField<String>) = apply {
            body.debtorAccountNumber(debtorAccountNumber)
        }

        /** The debtor's American Bankers' Association (ABA) Routing Transit Number (RTN). */
        fun debtorRoutingNumber(debtorRoutingNumber: String) = apply {
            body.debtorRoutingNumber(debtorRoutingNumber)
        }

        /**
         * Sets [Builder.debtorRoutingNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.debtorRoutingNumber] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun debtorRoutingNumber(debtorRoutingNumber: JsonField<String>) = apply {
            body.debtorRoutingNumber(debtorRoutingNumber)
        }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time after which the
         * request for payment is no longer valid. After this time the debtor's bank should no
         * longer allow the debtor to pay it. Must not be before `requested_execution_at`.
         */
        fun expiresAt(expiresAt: OffsetDateTime) = apply { body.expiresAt(expiresAt) }

        /**
         * Sets [Builder.expiresAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expiresAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun expiresAt(expiresAt: JsonField<OffsetDateTime>) = apply { body.expiresAt(expiresAt) }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time by which you are
         * requesting the payment to be made.
         */
        fun requestedExecutionAt(requestedExecutionAt: OffsetDateTime) = apply {
            body.requestedExecutionAt(requestedExecutionAt)
        }

        /**
         * Sets [Builder.requestedExecutionAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.requestedExecutionAt] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun requestedExecutionAt(requestedExecutionAt: JsonField<OffsetDateTime>) = apply {
            body.requestedExecutionAt(requestedExecutionAt)
        }

        /** Unstructured information that will show on the recipient's bank statement. */
        fun unstructuredRemittanceInformation(unstructuredRemittanceInformation: String) = apply {
            body.unstructuredRemittanceInformation(unstructuredRemittanceInformation)
        }

        /**
         * Sets [Builder.unstructuredRemittanceInformation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.unstructuredRemittanceInformation] with a well-typed
         * [String] value instead. This method is primarily for setting the field to an undocumented
         * or not yet supported value.
         */
        fun unstructuredRemittanceInformation(
            unstructuredRemittanceInformation: JsonField<String>
        ) = apply { body.unstructuredRemittanceInformation(unstructuredRemittanceInformation) }

        /**
         * The name of the creditor requesting the payment. If not provided, defaults to the name of
         * the account's entity.
         */
        fun creditorName(creditorName: String) = apply { body.creditorName(creditorName) }

        /**
         * Sets [Builder.creditorName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.creditorName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun creditorName(creditorName: JsonField<String>) = apply {
            body.creditorName(creditorName)
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
         * Returns an immutable instance of [RealTimePaymentsRequestsForPaymentCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .accountNumberId()
         * .amount()
         * .debtor()
         * .debtorAccountNumber()
         * .debtorRoutingNumber()
         * .expiresAt()
         * .requestedExecutionAt()
         * .unstructuredRemittanceInformation()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): RealTimePaymentsRequestsForPaymentCreateParams =
            RealTimePaymentsRequestsForPaymentCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val accountNumberId: JsonField<String>,
        private val amount: JsonField<Long>,
        private val debtor: JsonField<Debtor>,
        private val debtorAccountNumber: JsonField<String>,
        private val debtorRoutingNumber: JsonField<String>,
        private val expiresAt: JsonField<OffsetDateTime>,
        private val requestedExecutionAt: JsonField<OffsetDateTime>,
        private val unstructuredRemittanceInformation: JsonField<String>,
        private val creditorName: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("account_number_id")
            @ExcludeMissing
            accountNumberId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("debtor") @ExcludeMissing debtor: JsonField<Debtor> = JsonMissing.of(),
            @JsonProperty("debtor_account_number")
            @ExcludeMissing
            debtorAccountNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("debtor_routing_number")
            @ExcludeMissing
            debtorRoutingNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("expires_at")
            @ExcludeMissing
            expiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("requested_execution_at")
            @ExcludeMissing
            requestedExecutionAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("unstructured_remittance_information")
            @ExcludeMissing
            unstructuredRemittanceInformation: JsonField<String> = JsonMissing.of(),
            @JsonProperty("creditor_name")
            @ExcludeMissing
            creditorName: JsonField<String> = JsonMissing.of(),
        ) : this(
            accountNumberId,
            amount,
            debtor,
            debtorAccountNumber,
            debtorRoutingNumber,
            expiresAt,
            requestedExecutionAt,
            unstructuredRemittanceInformation,
            creditorName,
            mutableMapOf(),
        )

        /**
         * The identifier of the Account Number where the funds will land.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun accountNumberId(): String = accountNumberId.getRequired("account_number_id")

        /**
         * The requested amount in USD cents. Must be positive.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun amount(): Long = amount.getRequired("amount")

        /**
         * Details of the person being requested to pay.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun debtor(): Debtor = debtor.getRequired("debtor")

        /**
         * The debtor's account number, which the funds will be requested from.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun debtorAccountNumber(): String = debtorAccountNumber.getRequired("debtor_account_number")

        /**
         * The debtor's American Bankers' Association (ABA) Routing Transit Number (RTN).
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun debtorRoutingNumber(): String = debtorRoutingNumber.getRequired("debtor_routing_number")

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time after which the
         * request for payment is no longer valid. After this time the debtor's bank should no
         * longer allow the debtor to pay it. Must not be before `requested_execution_at`.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun expiresAt(): OffsetDateTime = expiresAt.getRequired("expires_at")

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time by which you are
         * requesting the payment to be made.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun requestedExecutionAt(): OffsetDateTime =
            requestedExecutionAt.getRequired("requested_execution_at")

        /**
         * Unstructured information that will show on the recipient's bank statement.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun unstructuredRemittanceInformation(): String =
            unstructuredRemittanceInformation.getRequired("unstructured_remittance_information")

        /**
         * The name of the creditor requesting the payment. If not provided, defaults to the name of
         * the account's entity.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun creditorName(): Optional<String> = creditorName.getOptional("creditor_name")

        /**
         * Returns the raw JSON value of [accountNumberId].
         *
         * Unlike [accountNumberId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("account_number_id")
        @ExcludeMissing
        fun _accountNumberId(): JsonField<String> = accountNumberId

        /**
         * Returns the raw JSON value of [amount].
         *
         * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

        /**
         * Returns the raw JSON value of [debtor].
         *
         * Unlike [debtor], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("debtor") @ExcludeMissing fun _debtor(): JsonField<Debtor> = debtor

        /**
         * Returns the raw JSON value of [debtorAccountNumber].
         *
         * Unlike [debtorAccountNumber], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("debtor_account_number")
        @ExcludeMissing
        fun _debtorAccountNumber(): JsonField<String> = debtorAccountNumber

        /**
         * Returns the raw JSON value of [debtorRoutingNumber].
         *
         * Unlike [debtorRoutingNumber], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("debtor_routing_number")
        @ExcludeMissing
        fun _debtorRoutingNumber(): JsonField<String> = debtorRoutingNumber

        /**
         * Returns the raw JSON value of [expiresAt].
         *
         * Unlike [expiresAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("expires_at")
        @ExcludeMissing
        fun _expiresAt(): JsonField<OffsetDateTime> = expiresAt

        /**
         * Returns the raw JSON value of [requestedExecutionAt].
         *
         * Unlike [requestedExecutionAt], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("requested_execution_at")
        @ExcludeMissing
        fun _requestedExecutionAt(): JsonField<OffsetDateTime> = requestedExecutionAt

        /**
         * Returns the raw JSON value of [unstructuredRemittanceInformation].
         *
         * Unlike [unstructuredRemittanceInformation], this method doesn't throw if the JSON field
         * has an unexpected type.
         */
        @JsonProperty("unstructured_remittance_information")
        @ExcludeMissing
        fun _unstructuredRemittanceInformation(): JsonField<String> =
            unstructuredRemittanceInformation

        /**
         * Returns the raw JSON value of [creditorName].
         *
         * Unlike [creditorName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("creditor_name")
        @ExcludeMissing
        fun _creditorName(): JsonField<String> = creditorName

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
             * .accountNumberId()
             * .amount()
             * .debtor()
             * .debtorAccountNumber()
             * .debtorRoutingNumber()
             * .expiresAt()
             * .requestedExecutionAt()
             * .unstructuredRemittanceInformation()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var accountNumberId: JsonField<String>? = null
            private var amount: JsonField<Long>? = null
            private var debtor: JsonField<Debtor>? = null
            private var debtorAccountNumber: JsonField<String>? = null
            private var debtorRoutingNumber: JsonField<String>? = null
            private var expiresAt: JsonField<OffsetDateTime>? = null
            private var requestedExecutionAt: JsonField<OffsetDateTime>? = null
            private var unstructuredRemittanceInformation: JsonField<String>? = null
            private var creditorName: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                accountNumberId = body.accountNumberId
                amount = body.amount
                debtor = body.debtor
                debtorAccountNumber = body.debtorAccountNumber
                debtorRoutingNumber = body.debtorRoutingNumber
                expiresAt = body.expiresAt
                requestedExecutionAt = body.requestedExecutionAt
                unstructuredRemittanceInformation = body.unstructuredRemittanceInformation
                creditorName = body.creditorName
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The identifier of the Account Number where the funds will land. */
            fun accountNumberId(accountNumberId: String) =
                accountNumberId(JsonField.of(accountNumberId))

            /**
             * Sets [Builder.accountNumberId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountNumberId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun accountNumberId(accountNumberId: JsonField<String>) = apply {
                this.accountNumberId = accountNumberId
            }

            /** The requested amount in USD cents. Must be positive. */
            fun amount(amount: Long) = amount(JsonField.of(amount))

            /**
             * Sets [Builder.amount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amount] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            /** Details of the person being requested to pay. */
            fun debtor(debtor: Debtor) = debtor(JsonField.of(debtor))

            /**
             * Sets [Builder.debtor] to an arbitrary JSON value.
             *
             * You should usually call [Builder.debtor] with a well-typed [Debtor] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun debtor(debtor: JsonField<Debtor>) = apply { this.debtor = debtor }

            /** The debtor's account number, which the funds will be requested from. */
            fun debtorAccountNumber(debtorAccountNumber: String) =
                debtorAccountNumber(JsonField.of(debtorAccountNumber))

            /**
             * Sets [Builder.debtorAccountNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.debtorAccountNumber] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun debtorAccountNumber(debtorAccountNumber: JsonField<String>) = apply {
                this.debtorAccountNumber = debtorAccountNumber
            }

            /** The debtor's American Bankers' Association (ABA) Routing Transit Number (RTN). */
            fun debtorRoutingNumber(debtorRoutingNumber: String) =
                debtorRoutingNumber(JsonField.of(debtorRoutingNumber))

            /**
             * Sets [Builder.debtorRoutingNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.debtorRoutingNumber] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun debtorRoutingNumber(debtorRoutingNumber: JsonField<String>) = apply {
                this.debtorRoutingNumber = debtorRoutingNumber
            }

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time after which the
             * request for payment is no longer valid. After this time the debtor's bank should no
             * longer allow the debtor to pay it. Must not be before `requested_execution_at`.
             */
            fun expiresAt(expiresAt: OffsetDateTime) = expiresAt(JsonField.of(expiresAt))

            /**
             * Sets [Builder.expiresAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.expiresAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun expiresAt(expiresAt: JsonField<OffsetDateTime>) = apply {
                this.expiresAt = expiresAt
            }

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time by which you are
             * requesting the payment to be made.
             */
            fun requestedExecutionAt(requestedExecutionAt: OffsetDateTime) =
                requestedExecutionAt(JsonField.of(requestedExecutionAt))

            /**
             * Sets [Builder.requestedExecutionAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.requestedExecutionAt] with a well-typed
             * [OffsetDateTime] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun requestedExecutionAt(requestedExecutionAt: JsonField<OffsetDateTime>) = apply {
                this.requestedExecutionAt = requestedExecutionAt
            }

            /** Unstructured information that will show on the recipient's bank statement. */
            fun unstructuredRemittanceInformation(unstructuredRemittanceInformation: String) =
                unstructuredRemittanceInformation(JsonField.of(unstructuredRemittanceInformation))

            /**
             * Sets [Builder.unstructuredRemittanceInformation] to an arbitrary JSON value.
             *
             * You should usually call [Builder.unstructuredRemittanceInformation] with a well-typed
             * [String] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun unstructuredRemittanceInformation(
                unstructuredRemittanceInformation: JsonField<String>
            ) = apply { this.unstructuredRemittanceInformation = unstructuredRemittanceInformation }

            /**
             * The name of the creditor requesting the payment. If not provided, defaults to the
             * name of the account's entity.
             */
            fun creditorName(creditorName: String) = creditorName(JsonField.of(creditorName))

            /**
             * Sets [Builder.creditorName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.creditorName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun creditorName(creditorName: JsonField<String>) = apply {
                this.creditorName = creditorName
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
             * .accountNumberId()
             * .amount()
             * .debtor()
             * .debtorAccountNumber()
             * .debtorRoutingNumber()
             * .expiresAt()
             * .requestedExecutionAt()
             * .unstructuredRemittanceInformation()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("accountNumberId", accountNumberId),
                    checkRequired("amount", amount),
                    checkRequired("debtor", debtor),
                    checkRequired("debtorAccountNumber", debtorAccountNumber),
                    checkRequired("debtorRoutingNumber", debtorRoutingNumber),
                    checkRequired("expiresAt", expiresAt),
                    checkRequired("requestedExecutionAt", requestedExecutionAt),
                    checkRequired(
                        "unstructuredRemittanceInformation",
                        unstructuredRemittanceInformation,
                    ),
                    creditorName,
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
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            accountNumberId()
            amount()
            debtor().validate()
            debtorAccountNumber()
            debtorRoutingNumber()
            expiresAt()
            requestedExecutionAt()
            unstructuredRemittanceInformation()
            creditorName()
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
            (if (accountNumberId.asKnown().isPresent) 1 else 0) +
                (if (amount.asKnown().isPresent) 1 else 0) +
                (debtor.asKnown().getOrNull()?.validity() ?: 0) +
                (if (debtorAccountNumber.asKnown().isPresent) 1 else 0) +
                (if (debtorRoutingNumber.asKnown().isPresent) 1 else 0) +
                (if (expiresAt.asKnown().isPresent) 1 else 0) +
                (if (requestedExecutionAt.asKnown().isPresent) 1 else 0) +
                (if (unstructuredRemittanceInformation.asKnown().isPresent) 1 else 0) +
                (if (creditorName.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                accountNumberId == other.accountNumberId &&
                amount == other.amount &&
                debtor == other.debtor &&
                debtorAccountNumber == other.debtorAccountNumber &&
                debtorRoutingNumber == other.debtorRoutingNumber &&
                expiresAt == other.expiresAt &&
                requestedExecutionAt == other.requestedExecutionAt &&
                unstructuredRemittanceInformation == other.unstructuredRemittanceInformation &&
                creditorName == other.creditorName &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                accountNumberId,
                amount,
                debtor,
                debtorAccountNumber,
                debtorRoutingNumber,
                expiresAt,
                requestedExecutionAt,
                unstructuredRemittanceInformation,
                creditorName,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{accountNumberId=$accountNumberId, amount=$amount, debtor=$debtor, debtorAccountNumber=$debtorAccountNumber, debtorRoutingNumber=$debtorRoutingNumber, expiresAt=$expiresAt, requestedExecutionAt=$requestedExecutionAt, unstructuredRemittanceInformation=$unstructuredRemittanceInformation, creditorName=$creditorName, additionalProperties=$additionalProperties}"
    }

    /** Details of the person being requested to pay. */
    class Debtor
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val address: JsonField<Address>,
        private val name: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("address") @ExcludeMissing address: JsonField<Address> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        ) : this(address, name, mutableMapOf())

        /**
         * Address of the debtor.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun address(): Address = address.getRequired("address")

        /**
         * The name of the debtor.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * Returns the raw JSON value of [address].
         *
         * Unlike [address], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("address") @ExcludeMissing fun _address(): JsonField<Address> = address

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
             * Returns a mutable builder for constructing an instance of [Debtor].
             *
             * The following fields are required:
             * ```java
             * .address()
             * .name()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Debtor]. */
        class Builder internal constructor() {

            private var address: JsonField<Address>? = null
            private var name: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(debtor: Debtor) = apply {
                address = debtor.address
                name = debtor.name
                additionalProperties = debtor.additionalProperties.toMutableMap()
            }

            /** Address of the debtor. */
            fun address(address: Address) = address(JsonField.of(address))

            /**
             * Sets [Builder.address] to an arbitrary JSON value.
             *
             * You should usually call [Builder.address] with a well-typed [Address] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun address(address: JsonField<Address>) = apply { this.address = address }

            /** The name of the debtor. */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

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
             * Returns an immutable instance of [Debtor].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .address()
             * .name()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Debtor =
                Debtor(
                    checkRequired("address", address),
                    checkRequired("name", name),
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
        fun validate(): Debtor = apply {
            if (validated) {
                return@apply
            }

            address().validate()
            name()
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
            (address.asKnown().getOrNull()?.validity() ?: 0) +
                (if (name.asKnown().isPresent) 1 else 0)

        /** Address of the debtor. */
        class Address
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val country: JsonField<String>,
            private val addressLine2: JsonField<String>,
            private val buildingNumber: JsonField<String>,
            private val city: JsonField<String>,
            private val postalCode: JsonField<String>,
            private val state: JsonField<String>,
            private val streetName: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("country")
                @ExcludeMissing
                country: JsonField<String> = JsonMissing.of(),
                @JsonProperty("address_line2")
                @ExcludeMissing
                addressLine2: JsonField<String> = JsonMissing.of(),
                @JsonProperty("building_number")
                @ExcludeMissing
                buildingNumber: JsonField<String> = JsonMissing.of(),
                @JsonProperty("city") @ExcludeMissing city: JsonField<String> = JsonMissing.of(),
                @JsonProperty("postal_code")
                @ExcludeMissing
                postalCode: JsonField<String> = JsonMissing.of(),
                @JsonProperty("state") @ExcludeMissing state: JsonField<String> = JsonMissing.of(),
                @JsonProperty("street_name")
                @ExcludeMissing
                streetName: JsonField<String> = JsonMissing.of(),
            ) : this(
                country,
                addressLine2,
                buildingNumber,
                city,
                postalCode,
                state,
                streetName,
                mutableMapOf(),
            )

            /**
             * The ISO 3166, Alpha-2 country code.
             *
             * Defaults to `US`.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun country(): String = country.getRequired("country")

            /**
             * A second address line, such as an apartment or suite number. The first address line
             * is separated into `building_number` and `street_name`.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun addressLine2(): Optional<String> = addressLine2.getOptional("address_line2")

            /**
             * The number identifying the position of the building on the street.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun buildingNumber(): Optional<String> = buildingNumber.getOptional("building_number")

            /**
             * The town or city.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun city(): Optional<String> = city.getOptional("city")

            /**
             * The postal code or zip.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun postalCode(): Optional<String> = postalCode.getOptional("postal_code")

            /**
             * The US state component of the address.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun state(): Optional<String> = state.getOptional("state")

            /**
             * The street name without the street number.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun streetName(): Optional<String> = streetName.getOptional("street_name")

            /**
             * Returns the raw JSON value of [country].
             *
             * Unlike [country], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

            /**
             * Returns the raw JSON value of [addressLine2].
             *
             * Unlike [addressLine2], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("address_line2")
            @ExcludeMissing
            fun _addressLine2(): JsonField<String> = addressLine2

            /**
             * Returns the raw JSON value of [buildingNumber].
             *
             * Unlike [buildingNumber], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("building_number")
            @ExcludeMissing
            fun _buildingNumber(): JsonField<String> = buildingNumber

            /**
             * Returns the raw JSON value of [city].
             *
             * Unlike [city], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

            /**
             * Returns the raw JSON value of [postalCode].
             *
             * Unlike [postalCode], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("postal_code")
            @ExcludeMissing
            fun _postalCode(): JsonField<String> = postalCode

            /**
             * Returns the raw JSON value of [state].
             *
             * Unlike [state], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<String> = state

            /**
             * Returns the raw JSON value of [streetName].
             *
             * Unlike [streetName], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("street_name")
            @ExcludeMissing
            fun _streetName(): JsonField<String> = streetName

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
                 * Returns a mutable builder for constructing an instance of [Address].
                 *
                 * The following fields are required:
                 * ```java
                 * .country()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Address]. */
            class Builder internal constructor() {

                private var country: JsonField<String>? = null
                private var addressLine2: JsonField<String> = JsonMissing.of()
                private var buildingNumber: JsonField<String> = JsonMissing.of()
                private var city: JsonField<String> = JsonMissing.of()
                private var postalCode: JsonField<String> = JsonMissing.of()
                private var state: JsonField<String> = JsonMissing.of()
                private var streetName: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(address: Address) = apply {
                    country = address.country
                    addressLine2 = address.addressLine2
                    buildingNumber = address.buildingNumber
                    city = address.city
                    postalCode = address.postalCode
                    state = address.state
                    streetName = address.streetName
                    additionalProperties = address.additionalProperties.toMutableMap()
                }

                /**
                 * The ISO 3166, Alpha-2 country code.
                 *
                 * Defaults to `US`.
                 */
                fun country(country: String) = country(JsonField.of(country))

                /**
                 * Sets [Builder.country] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.country] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun country(country: JsonField<String>) = apply { this.country = country }

                /**
                 * A second address line, such as an apartment or suite number. The first address
                 * line is separated into `building_number` and `street_name`.
                 */
                fun addressLine2(addressLine2: String) = addressLine2(JsonField.of(addressLine2))

                /**
                 * Sets [Builder.addressLine2] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.addressLine2] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun addressLine2(addressLine2: JsonField<String>) = apply {
                    this.addressLine2 = addressLine2
                }

                /** The number identifying the position of the building on the street. */
                fun buildingNumber(buildingNumber: String) =
                    buildingNumber(JsonField.of(buildingNumber))

                /**
                 * Sets [Builder.buildingNumber] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.buildingNumber] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun buildingNumber(buildingNumber: JsonField<String>) = apply {
                    this.buildingNumber = buildingNumber
                }

                /** The town or city. */
                fun city(city: String) = city(JsonField.of(city))

                /**
                 * Sets [Builder.city] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.city] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun city(city: JsonField<String>) = apply { this.city = city }

                /** The postal code or zip. */
                fun postalCode(postalCode: String) = postalCode(JsonField.of(postalCode))

                /**
                 * Sets [Builder.postalCode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.postalCode] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun postalCode(postalCode: JsonField<String>) = apply {
                    this.postalCode = postalCode
                }

                /** The US state component of the address. */
                fun state(state: String) = state(JsonField.of(state))

                /**
                 * Sets [Builder.state] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.state] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun state(state: JsonField<String>) = apply { this.state = state }

                /** The street name without the street number. */
                fun streetName(streetName: String) = streetName(JsonField.of(streetName))

                /**
                 * Sets [Builder.streetName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.streetName] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun streetName(streetName: JsonField<String>) = apply {
                    this.streetName = streetName
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

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

                /**
                 * Returns an immutable instance of [Address].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .country()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Address =
                    Address(
                        checkRequired("country", country),
                        addressLine2,
                        buildingNumber,
                        city,
                        postalCode,
                        state,
                        streetName,
                        additionalProperties.toMutableMap(),
                    )
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
            fun validate(): Address = apply {
                if (validated) {
                    return@apply
                }

                country()
                addressLine2()
                buildingNumber()
                city()
                postalCode()
                state()
                streetName()
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
                (if (country.asKnown().isPresent) 1 else 0) +
                    (if (addressLine2.asKnown().isPresent) 1 else 0) +
                    (if (buildingNumber.asKnown().isPresent) 1 else 0) +
                    (if (city.asKnown().isPresent) 1 else 0) +
                    (if (postalCode.asKnown().isPresent) 1 else 0) +
                    (if (state.asKnown().isPresent) 1 else 0) +
                    (if (streetName.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Address &&
                    country == other.country &&
                    addressLine2 == other.addressLine2 &&
                    buildingNumber == other.buildingNumber &&
                    city == other.city &&
                    postalCode == other.postalCode &&
                    state == other.state &&
                    streetName == other.streetName &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    country,
                    addressLine2,
                    buildingNumber,
                    city,
                    postalCode,
                    state,
                    streetName,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Address{country=$country, addressLine2=$addressLine2, buildingNumber=$buildingNumber, city=$city, postalCode=$postalCode, state=$state, streetName=$streetName, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Debtor &&
                address == other.address &&
                name == other.name &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(address, name, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Debtor{address=$address, name=$name, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RealTimePaymentsRequestsForPaymentCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "RealTimePaymentsRequestsForPaymentCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
