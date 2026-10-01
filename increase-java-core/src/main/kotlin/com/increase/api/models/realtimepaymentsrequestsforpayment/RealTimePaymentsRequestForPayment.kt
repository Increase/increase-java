// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.realtimepaymentsrequestsforpayment

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.increase.api.core.Enum
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.checkRequired
import com.increase.api.errors.IncreaseInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Real-Time Payments transfers move funds, within seconds, between your Increase account and any
 * other account on the Real-Time Payments network. A request for payment is a request to the
 * receiver to send funds to your account. The permitted uses of Requests For Payment are limited by
 * the Real-Time Payments network to business-to-business payments and transfers between two
 * accounts at different banks owned by the same individual. Please contact
 * [support@increase.com](mailto:support@increase.com) to enable this API for your team.
 */
class RealTimePaymentsRequestForPayment
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val accountId: JsonField<String>,
    private val accountNumberId: JsonField<String>,
    private val amount: JsonField<Long>,
    private val cancellation: JsonField<Cancellation>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val creditorName: JsonField<String>,
    private val currency: JsonField<Currency>,
    private val debtor: JsonField<Debtor>,
    private val debtorAccountNumber: JsonField<String>,
    private val debtorRoutingNumber: JsonField<String>,
    private val expiresAt: JsonField<OffsetDateTime>,
    private val fulfillmentInboundRealTimePaymentsTransferId: JsonField<String>,
    private val idempotencyKey: JsonField<String>,
    private val refusal: JsonField<Refusal>,
    private val rejection: JsonField<Rejection>,
    private val requestedExecutionAt: JsonField<OffsetDateTime>,
    private val status: JsonField<Status>,
    private val submission: JsonField<Submission>,
    private val type: JsonField<Type>,
    private val unstructuredRemittanceInformation: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("account_id") @ExcludeMissing accountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("account_number_id")
        @ExcludeMissing
        accountNumberId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("cancellation")
        @ExcludeMissing
        cancellation: JsonField<Cancellation> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("creditor_name")
        @ExcludeMissing
        creditorName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("currency") @ExcludeMissing currency: JsonField<Currency> = JsonMissing.of(),
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
        @JsonProperty("fulfillment_inbound_real_time_payments_transfer_id")
        @ExcludeMissing
        fulfillmentInboundRealTimePaymentsTransferId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("idempotency_key")
        @ExcludeMissing
        idempotencyKey: JsonField<String> = JsonMissing.of(),
        @JsonProperty("refusal") @ExcludeMissing refusal: JsonField<Refusal> = JsonMissing.of(),
        @JsonProperty("rejection")
        @ExcludeMissing
        rejection: JsonField<Rejection> = JsonMissing.of(),
        @JsonProperty("requested_execution_at")
        @ExcludeMissing
        requestedExecutionAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("submission")
        @ExcludeMissing
        submission: JsonField<Submission> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("unstructured_remittance_information")
        @ExcludeMissing
        unstructuredRemittanceInformation: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        accountId,
        accountNumberId,
        amount,
        cancellation,
        createdAt,
        creditorName,
        currency,
        debtor,
        debtorAccountNumber,
        debtorRoutingNumber,
        expiresAt,
        fulfillmentInboundRealTimePaymentsTransferId,
        idempotencyKey,
        refusal,
        rejection,
        requestedExecutionAt,
        status,
        submission,
        type,
        unstructuredRemittanceInformation,
        mutableMapOf(),
    )

    /**
     * The Real-Time Payments Request for Payment's identifier.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * The Account in which a successful transfer will arrive.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountId(): String = accountId.getRequired("account_id")

    /**
     * The Account Number in which a successful transfer will arrive.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountNumberId(): String = accountNumberId.getRequired("account_number_id")

    /**
     * The transfer amount in USD cents.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun amount(): Long = amount.getRequired("amount")

    /**
     * If a cancellation has been requested, this will contain supplemental details. The request for
     * payment moves to `canceled` once the recipient bank acknowledges the cancellation.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cancellation(): Optional<Cancellation> = cancellation.getOptional("cancellation")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the request for
     * payment was created.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * The name of the creditor requesting the payment.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun creditorName(): String = creditorName.getRequired("creditor_name")

    /**
     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transfer's currency. For
     * real-time payments transfers this is always equal to `USD`.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun currency(): Currency = currency.getRequired("currency")

    /**
     * Details of the person being requested to pay.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun debtor(): Debtor = debtor.getRequired("debtor")

    /**
     * The debtor's account number, which the request is sent to.
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
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time after which the request
     * for payment is no longer valid. After this time the debtor's bank should no longer allow the
     * debtor to pay it.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun expiresAt(): OffsetDateTime = expiresAt.getRequired("expires_at")

    /**
     * The identifier of the Inbound Real-Time Payments Transfer that fulfilled this request.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fulfillmentInboundRealTimePaymentsTransferId(): Optional<String> =
        fulfillmentInboundRealTimePaymentsTransferId.getOptional(
            "fulfillment_inbound_real_time_payments_transfer_id"
        )

    /**
     * The idempotency key you chose for this object. This value is unique across Increase and is
     * used to ensure that a request is only processed once. Learn more about
     * [idempotency](https://increase.com/documentation/idempotency-keys).
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun idempotencyKey(): Optional<String> = idempotencyKey.getOptional("idempotency_key")

    /**
     * If the request for payment is refused by the destination financial institution or the
     * receiving customer, this will contain supplemental details.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun refusal(): Optional<Refusal> = refusal.getOptional("refusal")

    /**
     * If the request for payment is rejected by Real-Time Payments or the destination financial
     * institution, this will contain supplemental details.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rejection(): Optional<Rejection> = rejection.getOptional("rejection")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time by which the payment was
     * requested to be made.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun requestedExecutionAt(): Optional<OffsetDateTime> =
        requestedExecutionAt.getOptional("requested_execution_at")

    /**
     * The lifecycle status of the request for payment.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * After the request for payment is submitted to Real-Time Payments, this will contain
     * supplemental details.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun submission(): Optional<Submission> = submission.getOptional("submission")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `real_time_payments_request_for_payment`.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * Unstructured information that will show on the recipient's bank statement.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun unstructuredRemittanceInformation(): String =
        unstructuredRemittanceInformation.getRequired("unstructured_remittance_information")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [accountId].
     *
     * Unlike [accountId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("account_id") @ExcludeMissing fun _accountId(): JsonField<String> = accountId

    /**
     * Returns the raw JSON value of [accountNumberId].
     *
     * Unlike [accountNumberId], this method doesn't throw if the JSON field has an unexpected type.
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
     * Returns the raw JSON value of [cancellation].
     *
     * Unlike [cancellation], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cancellation")
    @ExcludeMissing
    fun _cancellation(): JsonField<Cancellation> = cancellation

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [creditorName].
     *
     * Unlike [creditorName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("creditor_name")
    @ExcludeMissing
    fun _creditorName(): JsonField<String> = creditorName

    /**
     * Returns the raw JSON value of [currency].
     *
     * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<Currency> = currency

    /**
     * Returns the raw JSON value of [debtor].
     *
     * Unlike [debtor], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("debtor") @ExcludeMissing fun _debtor(): JsonField<Debtor> = debtor

    /**
     * Returns the raw JSON value of [debtorAccountNumber].
     *
     * Unlike [debtorAccountNumber], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("debtor_account_number")
    @ExcludeMissing
    fun _debtorAccountNumber(): JsonField<String> = debtorAccountNumber

    /**
     * Returns the raw JSON value of [debtorRoutingNumber].
     *
     * Unlike [debtorRoutingNumber], this method doesn't throw if the JSON field has an unexpected
     * type.
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
     * Returns the raw JSON value of [fulfillmentInboundRealTimePaymentsTransferId].
     *
     * Unlike [fulfillmentInboundRealTimePaymentsTransferId], this method doesn't throw if the JSON
     * field has an unexpected type.
     */
    @JsonProperty("fulfillment_inbound_real_time_payments_transfer_id")
    @ExcludeMissing
    fun _fulfillmentInboundRealTimePaymentsTransferId(): JsonField<String> =
        fulfillmentInboundRealTimePaymentsTransferId

    /**
     * Returns the raw JSON value of [idempotencyKey].
     *
     * Unlike [idempotencyKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idempotency_key")
    @ExcludeMissing
    fun _idempotencyKey(): JsonField<String> = idempotencyKey

    /**
     * Returns the raw JSON value of [refusal].
     *
     * Unlike [refusal], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("refusal") @ExcludeMissing fun _refusal(): JsonField<Refusal> = refusal

    /**
     * Returns the raw JSON value of [rejection].
     *
     * Unlike [rejection], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rejection") @ExcludeMissing fun _rejection(): JsonField<Rejection> = rejection

    /**
     * Returns the raw JSON value of [requestedExecutionAt].
     *
     * Unlike [requestedExecutionAt], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("requested_execution_at")
    @ExcludeMissing
    fun _requestedExecutionAt(): JsonField<OffsetDateTime> = requestedExecutionAt

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [submission].
     *
     * Unlike [submission], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("submission")
    @ExcludeMissing
    fun _submission(): JsonField<Submission> = submission

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    /**
     * Returns the raw JSON value of [unstructuredRemittanceInformation].
     *
     * Unlike [unstructuredRemittanceInformation], this method doesn't throw if the JSON field has
     * an unexpected type.
     */
    @JsonProperty("unstructured_remittance_information")
    @ExcludeMissing
    fun _unstructuredRemittanceInformation(): JsonField<String> = unstructuredRemittanceInformation

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
         * Returns a mutable builder for constructing an instance of
         * [RealTimePaymentsRequestForPayment].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .accountId()
         * .accountNumberId()
         * .amount()
         * .cancellation()
         * .createdAt()
         * .creditorName()
         * .currency()
         * .debtor()
         * .debtorAccountNumber()
         * .debtorRoutingNumber()
         * .expiresAt()
         * .fulfillmentInboundRealTimePaymentsTransferId()
         * .idempotencyKey()
         * .refusal()
         * .rejection()
         * .requestedExecutionAt()
         * .status()
         * .submission()
         * .type()
         * .unstructuredRemittanceInformation()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RealTimePaymentsRequestForPayment]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var accountId: JsonField<String>? = null
        private var accountNumberId: JsonField<String>? = null
        private var amount: JsonField<Long>? = null
        private var cancellation: JsonField<Cancellation>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var creditorName: JsonField<String>? = null
        private var currency: JsonField<Currency>? = null
        private var debtor: JsonField<Debtor>? = null
        private var debtorAccountNumber: JsonField<String>? = null
        private var debtorRoutingNumber: JsonField<String>? = null
        private var expiresAt: JsonField<OffsetDateTime>? = null
        private var fulfillmentInboundRealTimePaymentsTransferId: JsonField<String>? = null
        private var idempotencyKey: JsonField<String>? = null
        private var refusal: JsonField<Refusal>? = null
        private var rejection: JsonField<Rejection>? = null
        private var requestedExecutionAt: JsonField<OffsetDateTime>? = null
        private var status: JsonField<Status>? = null
        private var submission: JsonField<Submission>? = null
        private var type: JsonField<Type>? = null
        private var unstructuredRemittanceInformation: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(realTimePaymentsRequestForPayment: RealTimePaymentsRequestForPayment) =
            apply {
                id = realTimePaymentsRequestForPayment.id
                accountId = realTimePaymentsRequestForPayment.accountId
                accountNumberId = realTimePaymentsRequestForPayment.accountNumberId
                amount = realTimePaymentsRequestForPayment.amount
                cancellation = realTimePaymentsRequestForPayment.cancellation
                createdAt = realTimePaymentsRequestForPayment.createdAt
                creditorName = realTimePaymentsRequestForPayment.creditorName
                currency = realTimePaymentsRequestForPayment.currency
                debtor = realTimePaymentsRequestForPayment.debtor
                debtorAccountNumber = realTimePaymentsRequestForPayment.debtorAccountNumber
                debtorRoutingNumber = realTimePaymentsRequestForPayment.debtorRoutingNumber
                expiresAt = realTimePaymentsRequestForPayment.expiresAt
                fulfillmentInboundRealTimePaymentsTransferId =
                    realTimePaymentsRequestForPayment.fulfillmentInboundRealTimePaymentsTransferId
                idempotencyKey = realTimePaymentsRequestForPayment.idempotencyKey
                refusal = realTimePaymentsRequestForPayment.refusal
                rejection = realTimePaymentsRequestForPayment.rejection
                requestedExecutionAt = realTimePaymentsRequestForPayment.requestedExecutionAt
                status = realTimePaymentsRequestForPayment.status
                submission = realTimePaymentsRequestForPayment.submission
                type = realTimePaymentsRequestForPayment.type
                unstructuredRemittanceInformation =
                    realTimePaymentsRequestForPayment.unstructuredRemittanceInformation
                additionalProperties =
                    realTimePaymentsRequestForPayment.additionalProperties.toMutableMap()
            }

        /** The Real-Time Payments Request for Payment's identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The Account in which a successful transfer will arrive. */
        fun accountId(accountId: String) = accountId(JsonField.of(accountId))

        /**
         * Sets [Builder.accountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

        /** The Account Number in which a successful transfer will arrive. */
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

        /** The transfer amount in USD cents. */
        fun amount(amount: Long) = amount(JsonField.of(amount))

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

        /**
         * If a cancellation has been requested, this will contain supplemental details. The request
         * for payment moves to `canceled` once the recipient bank acknowledges the cancellation.
         */
        fun cancellation(cancellation: Cancellation?) =
            cancellation(JsonField.ofNullable(cancellation))

        /** Alias for calling [Builder.cancellation] with `cancellation.orElse(null)`. */
        fun cancellation(cancellation: Optional<Cancellation>) =
            cancellation(cancellation.getOrNull())

        /**
         * Sets [Builder.cancellation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cancellation] with a well-typed [Cancellation] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun cancellation(cancellation: JsonField<Cancellation>) = apply {
            this.cancellation = cancellation
        }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the request
         * for payment was created.
         */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** The name of the creditor requesting the payment. */
        fun creditorName(creditorName: String) = creditorName(JsonField.of(creditorName))

        /**
         * Sets [Builder.creditorName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.creditorName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun creditorName(creditorName: JsonField<String>) = apply {
            this.creditorName = creditorName
        }

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transfer's currency.
         * For real-time payments transfers this is always equal to `USD`.
         */
        fun currency(currency: Currency) = currency(JsonField.of(currency))

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [Currency] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

        /** Details of the person being requested to pay. */
        fun debtor(debtor: Debtor) = debtor(JsonField.of(debtor))

        /**
         * Sets [Builder.debtor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.debtor] with a well-typed [Debtor] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun debtor(debtor: JsonField<Debtor>) = apply { this.debtor = debtor }

        /** The debtor's account number, which the request is sent to. */
        fun debtorAccountNumber(debtorAccountNumber: String) =
            debtorAccountNumber(JsonField.of(debtorAccountNumber))

        /**
         * Sets [Builder.debtorAccountNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.debtorAccountNumber] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
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
         * You should usually call [Builder.debtorRoutingNumber] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun debtorRoutingNumber(debtorRoutingNumber: JsonField<String>) = apply {
            this.debtorRoutingNumber = debtorRoutingNumber
        }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time after which the
         * request for payment is no longer valid. After this time the debtor's bank should no
         * longer allow the debtor to pay it.
         */
        fun expiresAt(expiresAt: OffsetDateTime) = expiresAt(JsonField.of(expiresAt))

        /**
         * Sets [Builder.expiresAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expiresAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun expiresAt(expiresAt: JsonField<OffsetDateTime>) = apply { this.expiresAt = expiresAt }

        /**
         * The identifier of the Inbound Real-Time Payments Transfer that fulfilled this request.
         */
        fun fulfillmentInboundRealTimePaymentsTransferId(
            fulfillmentInboundRealTimePaymentsTransferId: String?
        ) =
            fulfillmentInboundRealTimePaymentsTransferId(
                JsonField.ofNullable(fulfillmentInboundRealTimePaymentsTransferId)
            )

        /**
         * Alias for calling [Builder.fulfillmentInboundRealTimePaymentsTransferId] with
         * `fulfillmentInboundRealTimePaymentsTransferId.orElse(null)`.
         */
        fun fulfillmentInboundRealTimePaymentsTransferId(
            fulfillmentInboundRealTimePaymentsTransferId: Optional<String>
        ) =
            fulfillmentInboundRealTimePaymentsTransferId(
                fulfillmentInboundRealTimePaymentsTransferId.getOrNull()
            )

        /**
         * Sets [Builder.fulfillmentInboundRealTimePaymentsTransferId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fulfillmentInboundRealTimePaymentsTransferId] with a
         * well-typed [String] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun fulfillmentInboundRealTimePaymentsTransferId(
            fulfillmentInboundRealTimePaymentsTransferId: JsonField<String>
        ) = apply {
            this.fulfillmentInboundRealTimePaymentsTransferId =
                fulfillmentInboundRealTimePaymentsTransferId
        }

        /**
         * The idempotency key you chose for this object. This value is unique across Increase and
         * is used to ensure that a request is only processed once. Learn more about
         * [idempotency](https://increase.com/documentation/idempotency-keys).
         */
        fun idempotencyKey(idempotencyKey: String?) =
            idempotencyKey(JsonField.ofNullable(idempotencyKey))

        /** Alias for calling [Builder.idempotencyKey] with `idempotencyKey.orElse(null)`. */
        fun idempotencyKey(idempotencyKey: Optional<String>) =
            idempotencyKey(idempotencyKey.getOrNull())

        /**
         * Sets [Builder.idempotencyKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idempotencyKey] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun idempotencyKey(idempotencyKey: JsonField<String>) = apply {
            this.idempotencyKey = idempotencyKey
        }

        /**
         * If the request for payment is refused by the destination financial institution or the
         * receiving customer, this will contain supplemental details.
         */
        fun refusal(refusal: Refusal?) = refusal(JsonField.ofNullable(refusal))

        /** Alias for calling [Builder.refusal] with `refusal.orElse(null)`. */
        fun refusal(refusal: Optional<Refusal>) = refusal(refusal.getOrNull())

        /**
         * Sets [Builder.refusal] to an arbitrary JSON value.
         *
         * You should usually call [Builder.refusal] with a well-typed [Refusal] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun refusal(refusal: JsonField<Refusal>) = apply { this.refusal = refusal }

        /**
         * If the request for payment is rejected by Real-Time Payments or the destination financial
         * institution, this will contain supplemental details.
         */
        fun rejection(rejection: Rejection?) = rejection(JsonField.ofNullable(rejection))

        /** Alias for calling [Builder.rejection] with `rejection.orElse(null)`. */
        fun rejection(rejection: Optional<Rejection>) = rejection(rejection.getOrNull())

        /**
         * Sets [Builder.rejection] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rejection] with a well-typed [Rejection] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun rejection(rejection: JsonField<Rejection>) = apply { this.rejection = rejection }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time by which the payment
         * was requested to be made.
         */
        fun requestedExecutionAt(requestedExecutionAt: OffsetDateTime?) =
            requestedExecutionAt(JsonField.ofNullable(requestedExecutionAt))

        /**
         * Alias for calling [Builder.requestedExecutionAt] with
         * `requestedExecutionAt.orElse(null)`.
         */
        fun requestedExecutionAt(requestedExecutionAt: Optional<OffsetDateTime>) =
            requestedExecutionAt(requestedExecutionAt.getOrNull())

        /**
         * Sets [Builder.requestedExecutionAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.requestedExecutionAt] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun requestedExecutionAt(requestedExecutionAt: JsonField<OffsetDateTime>) = apply {
            this.requestedExecutionAt = requestedExecutionAt
        }

        /** The lifecycle status of the request for payment. */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /**
         * After the request for payment is submitted to Real-Time Payments, this will contain
         * supplemental details.
         */
        fun submission(submission: Submission?) = submission(JsonField.ofNullable(submission))

        /** Alias for calling [Builder.submission] with `submission.orElse(null)`. */
        fun submission(submission: Optional<Submission>) = submission(submission.getOrNull())

        /**
         * Sets [Builder.submission] to an arbitrary JSON value.
         *
         * You should usually call [Builder.submission] with a well-typed [Submission] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun submission(submission: JsonField<Submission>) = apply { this.submission = submission }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `real_time_payments_request_for_payment`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        /** Unstructured information that will show on the recipient's bank statement. */
        fun unstructuredRemittanceInformation(unstructuredRemittanceInformation: String) =
            unstructuredRemittanceInformation(JsonField.of(unstructuredRemittanceInformation))

        /**
         * Sets [Builder.unstructuredRemittanceInformation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.unstructuredRemittanceInformation] with a well-typed
         * [String] value instead. This method is primarily for setting the field to an undocumented
         * or not yet supported value.
         */
        fun unstructuredRemittanceInformation(
            unstructuredRemittanceInformation: JsonField<String>
        ) = apply { this.unstructuredRemittanceInformation = unstructuredRemittanceInformation }

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
         * Returns an immutable instance of [RealTimePaymentsRequestForPayment].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .accountId()
         * .accountNumberId()
         * .amount()
         * .cancellation()
         * .createdAt()
         * .creditorName()
         * .currency()
         * .debtor()
         * .debtorAccountNumber()
         * .debtorRoutingNumber()
         * .expiresAt()
         * .fulfillmentInboundRealTimePaymentsTransferId()
         * .idempotencyKey()
         * .refusal()
         * .rejection()
         * .requestedExecutionAt()
         * .status()
         * .submission()
         * .type()
         * .unstructuredRemittanceInformation()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): RealTimePaymentsRequestForPayment =
            RealTimePaymentsRequestForPayment(
                checkRequired("id", id),
                checkRequired("accountId", accountId),
                checkRequired("accountNumberId", accountNumberId),
                checkRequired("amount", amount),
                checkRequired("cancellation", cancellation),
                checkRequired("createdAt", createdAt),
                checkRequired("creditorName", creditorName),
                checkRequired("currency", currency),
                checkRequired("debtor", debtor),
                checkRequired("debtorAccountNumber", debtorAccountNumber),
                checkRequired("debtorRoutingNumber", debtorRoutingNumber),
                checkRequired("expiresAt", expiresAt),
                checkRequired(
                    "fulfillmentInboundRealTimePaymentsTransferId",
                    fulfillmentInboundRealTimePaymentsTransferId,
                ),
                checkRequired("idempotencyKey", idempotencyKey),
                checkRequired("refusal", refusal),
                checkRequired("rejection", rejection),
                checkRequired("requestedExecutionAt", requestedExecutionAt),
                checkRequired("status", status),
                checkRequired("submission", submission),
                checkRequired("type", type),
                checkRequired(
                    "unstructuredRemittanceInformation",
                    unstructuredRemittanceInformation,
                ),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws IncreaseInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): RealTimePaymentsRequestForPayment = apply {
        if (validated) {
            return@apply
        }

        id()
        accountId()
        accountNumberId()
        amount()
        cancellation().ifPresent { it.validate() }
        createdAt()
        creditorName()
        currency().validate()
        debtor().validate()
        debtorAccountNumber()
        debtorRoutingNumber()
        expiresAt()
        fulfillmentInboundRealTimePaymentsTransferId()
        idempotencyKey()
        refusal().ifPresent { it.validate() }
        rejection().ifPresent { it.validate() }
        requestedExecutionAt()
        status().validate()
        submission().ifPresent { it.validate() }
        type().validate()
        unstructuredRemittanceInformation()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (accountId.asKnown().isPresent) 1 else 0) +
            (if (accountNumberId.asKnown().isPresent) 1 else 0) +
            (if (amount.asKnown().isPresent) 1 else 0) +
            (cancellation.asKnown().getOrNull()?.validity() ?: 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (creditorName.asKnown().isPresent) 1 else 0) +
            (currency.asKnown().getOrNull()?.validity() ?: 0) +
            (debtor.asKnown().getOrNull()?.validity() ?: 0) +
            (if (debtorAccountNumber.asKnown().isPresent) 1 else 0) +
            (if (debtorRoutingNumber.asKnown().isPresent) 1 else 0) +
            (if (expiresAt.asKnown().isPresent) 1 else 0) +
            (if (fulfillmentInboundRealTimePaymentsTransferId.asKnown().isPresent) 1 else 0) +
            (if (idempotencyKey.asKnown().isPresent) 1 else 0) +
            (refusal.asKnown().getOrNull()?.validity() ?: 0) +
            (rejection.asKnown().getOrNull()?.validity() ?: 0) +
            (if (requestedExecutionAt.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (submission.asKnown().getOrNull()?.validity() ?: 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0) +
            (if (unstructuredRemittanceInformation.asKnown().isPresent) 1 else 0)

    /**
     * If a cancellation has been requested, this will contain supplemental details. The request for
     * payment moves to `canceled` once the recipient bank acknowledges the cancellation.
     */
    class Cancellation
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val additionalInformation: JsonField<String>,
        private val canceledAt: JsonField<OffsetDateTime>,
        private val reason: JsonField<Reason>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("additional_information")
            @ExcludeMissing
            additionalInformation: JsonField<String> = JsonMissing.of(),
            @JsonProperty("canceled_at")
            @ExcludeMissing
            canceledAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("reason") @ExcludeMissing reason: JsonField<Reason> = JsonMissing.of(),
        ) : this(additionalInformation, canceledAt, reason, mutableMapOf())

        /**
         * Additional information about the cancellation, sent on to the recipient bank.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun additionalInformation(): Optional<String> =
            additionalInformation.getOptional("additional_information")

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
         * cancellation was requested.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun canceledAt(): OffsetDateTime = canceledAt.getRequired("canceled_at")

        /**
         * The reason the request for payment was canceled.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun reason(): Reason = reason.getRequired("reason")

        /**
         * Returns the raw JSON value of [additionalInformation].
         *
         * Unlike [additionalInformation], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("additional_information")
        @ExcludeMissing
        fun _additionalInformation(): JsonField<String> = additionalInformation

        /**
         * Returns the raw JSON value of [canceledAt].
         *
         * Unlike [canceledAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("canceled_at")
        @ExcludeMissing
        fun _canceledAt(): JsonField<OffsetDateTime> = canceledAt

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

            /**
             * Returns a mutable builder for constructing an instance of [Cancellation].
             *
             * The following fields are required:
             * ```java
             * .additionalInformation()
             * .canceledAt()
             * .reason()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Cancellation]. */
        class Builder internal constructor() {

            private var additionalInformation: JsonField<String>? = null
            private var canceledAt: JsonField<OffsetDateTime>? = null
            private var reason: JsonField<Reason>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(cancellation: Cancellation) = apply {
                additionalInformation = cancellation.additionalInformation
                canceledAt = cancellation.canceledAt
                reason = cancellation.reason
                additionalProperties = cancellation.additionalProperties.toMutableMap()
            }

            /** Additional information about the cancellation, sent on to the recipient bank. */
            fun additionalInformation(additionalInformation: String?) =
                additionalInformation(JsonField.ofNullable(additionalInformation))

            /**
             * Alias for calling [Builder.additionalInformation] with
             * `additionalInformation.orElse(null)`.
             */
            fun additionalInformation(additionalInformation: Optional<String>) =
                additionalInformation(additionalInformation.getOrNull())

            /**
             * Sets [Builder.additionalInformation] to an arbitrary JSON value.
             *
             * You should usually call [Builder.additionalInformation] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun additionalInformation(additionalInformation: JsonField<String>) = apply {
                this.additionalInformation = additionalInformation
            }

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * cancellation was requested.
             */
            fun canceledAt(canceledAt: OffsetDateTime) = canceledAt(JsonField.of(canceledAt))

            /**
             * Sets [Builder.canceledAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.canceledAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun canceledAt(canceledAt: JsonField<OffsetDateTime>) = apply {
                this.canceledAt = canceledAt
            }

            /** The reason the request for payment was canceled. */
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
             * Returns an immutable instance of [Cancellation].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .additionalInformation()
             * .canceledAt()
             * .reason()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Cancellation =
                Cancellation(
                    checkRequired("additionalInformation", additionalInformation),
                    checkRequired("canceledAt", canceledAt),
                    checkRequired("reason", reason),
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
        fun validate(): Cancellation = apply {
            if (validated) {
                return@apply
            }

            additionalInformation()
            canceledAt()
            reason().validate()
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
            (if (additionalInformation.asKnown().isPresent) 1 else 0) +
                (if (canceledAt.asKnown().isPresent) 1 else 0) +
                (reason.asKnown().getOrNull()?.validity() ?: 0)

        /** The reason the request for payment was canceled. */
        class Reason @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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
                 * The creditor no longer wants to be paid. Corresponds to the Real-Time Payments
                 * reason code `CUST`.
                 */
                @JvmField val REQUESTED_BY_CUSTOMER = of("requested_by_customer")

                /**
                 * The requested payment has already been made through another channel. Corresponds
                 * to the Real-Time Payments reason code `UPAY`.
                 */
                @JvmField val PAID_BY_OTHER_MEANS = of("paid_by_other_means")

                /**
                 * The request for payment duplicated another request for payment. Corresponds to
                 * the Real-Time Payments reason code `DUPL`.
                 */
                @JvmField val DUPLICATE = of("duplicate")

                /**
                 * The request for payment was sent for the wrong amount. Corresponds to the
                 * Real-Time Payments reason code `AM09`.
                 */
                @JvmField val WRONG_AMOUNT = of("wrong_amount")

                @JvmStatic fun of(value: String) = Reason(JsonField.of(value))
            }

            /** An enum containing [Reason]'s known values. */
            enum class Known {
                /**
                 * The creditor no longer wants to be paid. Corresponds to the Real-Time Payments
                 * reason code `CUST`.
                 */
                REQUESTED_BY_CUSTOMER,
                /**
                 * The requested payment has already been made through another channel. Corresponds
                 * to the Real-Time Payments reason code `UPAY`.
                 */
                PAID_BY_OTHER_MEANS,
                /**
                 * The request for payment duplicated another request for payment. Corresponds to
                 * the Real-Time Payments reason code `DUPL`.
                 */
                DUPLICATE,
                /**
                 * The request for payment was sent for the wrong amount. Corresponds to the
                 * Real-Time Payments reason code `AM09`.
                 */
                WRONG_AMOUNT,
            }

            /**
             * An enum containing [Reason]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Reason] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                /**
                 * The creditor no longer wants to be paid. Corresponds to the Real-Time Payments
                 * reason code `CUST`.
                 */
                REQUESTED_BY_CUSTOMER,
                /**
                 * The requested payment has already been made through another channel. Corresponds
                 * to the Real-Time Payments reason code `UPAY`.
                 */
                PAID_BY_OTHER_MEANS,
                /**
                 * The request for payment duplicated another request for payment. Corresponds to
                 * the Real-Time Payments reason code `DUPL`.
                 */
                DUPLICATE,
                /**
                 * The request for payment was sent for the wrong amount. Corresponds to the
                 * Real-Time Payments reason code `AM09`.
                 */
                WRONG_AMOUNT,
                /**
                 * An enum member indicating that [Reason] was instantiated with an unknown value.
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
                    REQUESTED_BY_CUSTOMER -> Value.REQUESTED_BY_CUSTOMER
                    PAID_BY_OTHER_MEANS -> Value.PAID_BY_OTHER_MEANS
                    DUPLICATE -> Value.DUPLICATE
                    WRONG_AMOUNT -> Value.WRONG_AMOUNT
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
                    REQUESTED_BY_CUSTOMER -> Known.REQUESTED_BY_CUSTOMER
                    PAID_BY_OTHER_MEANS -> Known.PAID_BY_OTHER_MEANS
                    DUPLICATE -> Known.DUPLICATE
                    WRONG_AMOUNT -> Known.WRONG_AMOUNT
                    else -> throw IncreaseInvalidDataException("Unknown Reason: $value")
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

            return other is Cancellation &&
                additionalInformation == other.additionalInformation &&
                canceledAt == other.canceledAt &&
                reason == other.reason &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(additionalInformation, canceledAt, reason, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Cancellation{additionalInformation=$additionalInformation, canceledAt=$canceledAt, reason=$reason, additionalProperties=$additionalProperties}"
    }

    /**
     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transfer's currency. For
     * real-time payments transfers this is always equal to `USD`.
     */
    class Currency @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            /** US Dollar (USD) */
            @JvmField val USD = of("USD")

            @JvmStatic fun of(value: String) = Currency(JsonField.of(value))
        }

        /** An enum containing [Currency]'s known values. */
        enum class Known {
            /** US Dollar (USD) */
            USD
        }

        /**
         * An enum containing [Currency]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Currency] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            /** US Dollar (USD) */
            USD,
            /** An enum member indicating that [Currency] was instantiated with an unknown value. */
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
                USD -> Value.USD
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
                USD -> Known.USD
                else -> throw IncreaseInvalidDataException("Unknown Currency: $value")
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws IncreaseInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Currency = apply {
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

            return other is Currency && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
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
            private val addressLine2: JsonField<String>,
            private val buildingNumber: JsonField<String>,
            private val city: JsonField<String>,
            private val country: JsonField<String>,
            private val postalCode: JsonField<String>,
            private val state: JsonField<String>,
            private val streetName: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("address_line2")
                @ExcludeMissing
                addressLine2: JsonField<String> = JsonMissing.of(),
                @JsonProperty("building_number")
                @ExcludeMissing
                buildingNumber: JsonField<String> = JsonMissing.of(),
                @JsonProperty("city") @ExcludeMissing city: JsonField<String> = JsonMissing.of(),
                @JsonProperty("country")
                @ExcludeMissing
                country: JsonField<String> = JsonMissing.of(),
                @JsonProperty("postal_code")
                @ExcludeMissing
                postalCode: JsonField<String> = JsonMissing.of(),
                @JsonProperty("state") @ExcludeMissing state: JsonField<String> = JsonMissing.of(),
                @JsonProperty("street_name")
                @ExcludeMissing
                streetName: JsonField<String> = JsonMissing.of(),
            ) : this(
                addressLine2,
                buildingNumber,
                city,
                country,
                postalCode,
                state,
                streetName,
                mutableMapOf(),
            )

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
             * The ISO 3166, Alpha-2 country code.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun country(): Optional<String> = country.getOptional("country")

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
             * Returns the raw JSON value of [country].
             *
             * Unlike [country], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

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
                 * .addressLine2()
                 * .buildingNumber()
                 * .city()
                 * .country()
                 * .postalCode()
                 * .state()
                 * .streetName()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Address]. */
            class Builder internal constructor() {

                private var addressLine2: JsonField<String>? = null
                private var buildingNumber: JsonField<String>? = null
                private var city: JsonField<String>? = null
                private var country: JsonField<String>? = null
                private var postalCode: JsonField<String>? = null
                private var state: JsonField<String>? = null
                private var streetName: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(address: Address) = apply {
                    addressLine2 = address.addressLine2
                    buildingNumber = address.buildingNumber
                    city = address.city
                    country = address.country
                    postalCode = address.postalCode
                    state = address.state
                    streetName = address.streetName
                    additionalProperties = address.additionalProperties.toMutableMap()
                }

                /**
                 * A second address line, such as an apartment or suite number. The first address
                 * line is separated into `building_number` and `street_name`.
                 */
                fun addressLine2(addressLine2: String?) =
                    addressLine2(JsonField.ofNullable(addressLine2))

                /** Alias for calling [Builder.addressLine2] with `addressLine2.orElse(null)`. */
                fun addressLine2(addressLine2: Optional<String>) =
                    addressLine2(addressLine2.getOrNull())

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
                fun buildingNumber(buildingNumber: String?) =
                    buildingNumber(JsonField.ofNullable(buildingNumber))

                /**
                 * Alias for calling [Builder.buildingNumber] with `buildingNumber.orElse(null)`.
                 */
                fun buildingNumber(buildingNumber: Optional<String>) =
                    buildingNumber(buildingNumber.getOrNull())

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
                fun city(city: String?) = city(JsonField.ofNullable(city))

                /** Alias for calling [Builder.city] with `city.orElse(null)`. */
                fun city(city: Optional<String>) = city(city.getOrNull())

                /**
                 * Sets [Builder.city] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.city] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun city(city: JsonField<String>) = apply { this.city = city }

                /** The ISO 3166, Alpha-2 country code. */
                fun country(country: String?) = country(JsonField.ofNullable(country))

                /** Alias for calling [Builder.country] with `country.orElse(null)`. */
                fun country(country: Optional<String>) = country(country.getOrNull())

                /**
                 * Sets [Builder.country] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.country] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun country(country: JsonField<String>) = apply { this.country = country }

                /** The postal code or zip. */
                fun postalCode(postalCode: String?) = postalCode(JsonField.ofNullable(postalCode))

                /** Alias for calling [Builder.postalCode] with `postalCode.orElse(null)`. */
                fun postalCode(postalCode: Optional<String>) = postalCode(postalCode.getOrNull())

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
                fun state(state: String?) = state(JsonField.ofNullable(state))

                /** Alias for calling [Builder.state] with `state.orElse(null)`. */
                fun state(state: Optional<String>) = state(state.getOrNull())

                /**
                 * Sets [Builder.state] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.state] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun state(state: JsonField<String>) = apply { this.state = state }

                /** The street name without the street number. */
                fun streetName(streetName: String?) = streetName(JsonField.ofNullable(streetName))

                /** Alias for calling [Builder.streetName] with `streetName.orElse(null)`. */
                fun streetName(streetName: Optional<String>) = streetName(streetName.getOrNull())

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
                 * .addressLine2()
                 * .buildingNumber()
                 * .city()
                 * .country()
                 * .postalCode()
                 * .state()
                 * .streetName()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Address =
                    Address(
                        checkRequired("addressLine2", addressLine2),
                        checkRequired("buildingNumber", buildingNumber),
                        checkRequired("city", city),
                        checkRequired("country", country),
                        checkRequired("postalCode", postalCode),
                        checkRequired("state", state),
                        checkRequired("streetName", streetName),
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

                addressLine2()
                buildingNumber()
                city()
                country()
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
                (if (addressLine2.asKnown().isPresent) 1 else 0) +
                    (if (buildingNumber.asKnown().isPresent) 1 else 0) +
                    (if (city.asKnown().isPresent) 1 else 0) +
                    (if (country.asKnown().isPresent) 1 else 0) +
                    (if (postalCode.asKnown().isPresent) 1 else 0) +
                    (if (state.asKnown().isPresent) 1 else 0) +
                    (if (streetName.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Address &&
                    addressLine2 == other.addressLine2 &&
                    buildingNumber == other.buildingNumber &&
                    city == other.city &&
                    country == other.country &&
                    postalCode == other.postalCode &&
                    state == other.state &&
                    streetName == other.streetName &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    addressLine2,
                    buildingNumber,
                    city,
                    country,
                    postalCode,
                    state,
                    streetName,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Address{addressLine2=$addressLine2, buildingNumber=$buildingNumber, city=$city, country=$country, postalCode=$postalCode, state=$state, streetName=$streetName, additionalProperties=$additionalProperties}"
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

    /**
     * If the request for payment is refused by the destination financial institution or the
     * receiving customer, this will contain supplemental details.
     */
    class Refusal
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val refusalReasonAdditionalInformation: JsonField<String>,
        private val refusalReasonCode: JsonField<RefusalReasonCode>,
        private val refusedAt: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("refusal_reason_additional_information")
            @ExcludeMissing
            refusalReasonAdditionalInformation: JsonField<String> = JsonMissing.of(),
            @JsonProperty("refusal_reason_code")
            @ExcludeMissing
            refusalReasonCode: JsonField<RefusalReasonCode> = JsonMissing.of(),
            @JsonProperty("refused_at")
            @ExcludeMissing
            refusedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(refusalReasonAdditionalInformation, refusalReasonCode, refusedAt, mutableMapOf())

        /**
         * Additional information about the refusal provided by the recipient bank or the customer.
         * This is typically present when the `refusal_reason_code` is `other`.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun refusalReasonAdditionalInformation(): Optional<String> =
            refusalReasonAdditionalInformation.getOptional("refusal_reason_additional_information")

        /**
         * The reason the request for payment was refused as provided by the recipient bank or the
         * customer.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun refusalReasonCode(): RefusalReasonCode =
            refusalReasonCode.getRequired("refusal_reason_code")

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the request
         * for payment was refused.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun refusedAt(): Optional<OffsetDateTime> = refusedAt.getOptional("refused_at")

        /**
         * Returns the raw JSON value of [refusalReasonAdditionalInformation].
         *
         * Unlike [refusalReasonAdditionalInformation], this method doesn't throw if the JSON field
         * has an unexpected type.
         */
        @JsonProperty("refusal_reason_additional_information")
        @ExcludeMissing
        fun _refusalReasonAdditionalInformation(): JsonField<String> =
            refusalReasonAdditionalInformation

        /**
         * Returns the raw JSON value of [refusalReasonCode].
         *
         * Unlike [refusalReasonCode], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("refusal_reason_code")
        @ExcludeMissing
        fun _refusalReasonCode(): JsonField<RefusalReasonCode> = refusalReasonCode

        /**
         * Returns the raw JSON value of [refusedAt].
         *
         * Unlike [refusedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("refused_at")
        @ExcludeMissing
        fun _refusedAt(): JsonField<OffsetDateTime> = refusedAt

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
             * Returns a mutable builder for constructing an instance of [Refusal].
             *
             * The following fields are required:
             * ```java
             * .refusalReasonAdditionalInformation()
             * .refusalReasonCode()
             * .refusedAt()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Refusal]. */
        class Builder internal constructor() {

            private var refusalReasonAdditionalInformation: JsonField<String>? = null
            private var refusalReasonCode: JsonField<RefusalReasonCode>? = null
            private var refusedAt: JsonField<OffsetDateTime>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(refusal: Refusal) = apply {
                refusalReasonAdditionalInformation = refusal.refusalReasonAdditionalInformation
                refusalReasonCode = refusal.refusalReasonCode
                refusedAt = refusal.refusedAt
                additionalProperties = refusal.additionalProperties.toMutableMap()
            }

            /**
             * Additional information about the refusal provided by the recipient bank or the
             * customer. This is typically present when the `refusal_reason_code` is `other`.
             */
            fun refusalReasonAdditionalInformation(refusalReasonAdditionalInformation: String?) =
                refusalReasonAdditionalInformation(
                    JsonField.ofNullable(refusalReasonAdditionalInformation)
                )

            /**
             * Alias for calling [Builder.refusalReasonAdditionalInformation] with
             * `refusalReasonAdditionalInformation.orElse(null)`.
             */
            fun refusalReasonAdditionalInformation(
                refusalReasonAdditionalInformation: Optional<String>
            ) = refusalReasonAdditionalInformation(refusalReasonAdditionalInformation.getOrNull())

            /**
             * Sets [Builder.refusalReasonAdditionalInformation] to an arbitrary JSON value.
             *
             * You should usually call [Builder.refusalReasonAdditionalInformation] with a
             * well-typed [String] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun refusalReasonAdditionalInformation(
                refusalReasonAdditionalInformation: JsonField<String>
            ) = apply {
                this.refusalReasonAdditionalInformation = refusalReasonAdditionalInformation
            }

            /**
             * The reason the request for payment was refused as provided by the recipient bank or
             * the customer.
             */
            fun refusalReasonCode(refusalReasonCode: RefusalReasonCode) =
                refusalReasonCode(JsonField.of(refusalReasonCode))

            /**
             * Sets [Builder.refusalReasonCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.refusalReasonCode] with a well-typed
             * [RefusalReasonCode] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun refusalReasonCode(refusalReasonCode: JsonField<RefusalReasonCode>) = apply {
                this.refusalReasonCode = refusalReasonCode
            }

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * request for payment was refused.
             */
            fun refusedAt(refusedAt: OffsetDateTime?) = refusedAt(JsonField.ofNullable(refusedAt))

            /** Alias for calling [Builder.refusedAt] with `refusedAt.orElse(null)`. */
            fun refusedAt(refusedAt: Optional<OffsetDateTime>) = refusedAt(refusedAt.getOrNull())

            /**
             * Sets [Builder.refusedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.refusedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun refusedAt(refusedAt: JsonField<OffsetDateTime>) = apply {
                this.refusedAt = refusedAt
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
             * Returns an immutable instance of [Refusal].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .refusalReasonAdditionalInformation()
             * .refusalReasonCode()
             * .refusedAt()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Refusal =
                Refusal(
                    checkRequired(
                        "refusalReasonAdditionalInformation",
                        refusalReasonAdditionalInformation,
                    ),
                    checkRequired("refusalReasonCode", refusalReasonCode),
                    checkRequired("refusedAt", refusedAt),
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
        fun validate(): Refusal = apply {
            if (validated) {
                return@apply
            }

            refusalReasonAdditionalInformation()
            refusalReasonCode().validate()
            refusedAt()
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
            (if (refusalReasonAdditionalInformation.asKnown().isPresent) 1 else 0) +
                (refusalReasonCode.asKnown().getOrNull()?.validity() ?: 0) +
                (if (refusedAt.asKnown().isPresent) 1 else 0)

        /**
         * The reason the request for payment was refused as provided by the recipient bank or the
         * customer.
         */
        class RefusalReasonCode
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
                 * The destination account is currently blocked from receiving transactions.
                 * Corresponds to the Real-Time Payments reason code `AC06`.
                 */
                @JvmField val ACCOUNT_BLOCKED = of("account_blocked")

                /**
                 * Real-Time Payments transfers are not allowed to the destination account.
                 * Corresponds to the Real-Time Payments reason code `AG01`.
                 */
                @JvmField val TRANSACTION_FORBIDDEN = of("transaction_forbidden")

                /**
                 * Real-Time Payments transfers are not enabled for the destination account.
                 * Corresponds to the Real-Time Payments reason code `AG03`.
                 */
                @JvmField val TRANSACTION_TYPE_NOT_SUPPORTED = of("transaction_type_not_supported")

                /**
                 * The amount of the transfer is different than expected by the recipient.
                 * Corresponds to the Real-Time Payments reason code `AM09`.
                 */
                @JvmField val UNEXPECTED_AMOUNT = of("unexpected_amount")

                /**
                 * The amount is higher than the recipient is authorized to send or receive.
                 * Corresponds to the Real-Time Payments reason code `AM14`.
                 */
                @JvmField val AMOUNT_EXCEEDS_BANK_LIMITS = of("amount_exceeds_bank_limits")

                /**
                 * The debtor's address is required, but missing or invalid. Corresponds to the
                 * Real-Time Payments reason code `BE07`.
                 */
                @JvmField val INVALID_DEBTOR_ADDRESS = of("invalid_debtor_address")

                /**
                 * The creditor's address is required, but missing or invalid. Corresponds to the
                 * Real-Time Payments reason code `BE04`.
                 */
                @JvmField val INVALID_CREDITOR_ADDRESS = of("invalid_creditor_address")

                /**
                 * Creditor identifier incorrect. Corresponds to the Real-Time Payments reason code
                 * `CH11`.
                 */
                @JvmField val CREDITOR_IDENTIFIER_INCORRECT = of("creditor_identifier_incorrect")

                /**
                 * The customer refused the request. Corresponds to the Real-Time Payments reason
                 * code `CUST`.
                 */
                @JvmField val REQUESTED_BY_CUSTOMER = of("requested_by_customer")

                /**
                 * The order was rejected. Corresponds to the Real-Time Payments reason code `DS04`.
                 */
                @JvmField val ORDER_REJECTED = of("order_rejected")

                /**
                 * The destination account holder is deceased. Corresponds to the Real-Time Payments
                 * reason code `MD07`.
                 */
                @JvmField val END_CUSTOMER_DECEASED = of("end_customer_deceased")

                /**
                 * The customer has opted out of receiving requests for payments from this creditor.
                 * Corresponds to the Real-Time Payments reason code `SL12`.
                 */
                @JvmField val CUSTOMER_HAS_OPTED_OUT = of("customer_has_opted_out")

                /** Some other error or issue has occurred. */
                @JvmField val OTHER = of("other")

                @JvmStatic fun of(value: String) = RefusalReasonCode(JsonField.of(value))
            }

            /** An enum containing [RefusalReasonCode]'s known values. */
            enum class Known {
                /**
                 * The destination account is currently blocked from receiving transactions.
                 * Corresponds to the Real-Time Payments reason code `AC06`.
                 */
                ACCOUNT_BLOCKED,
                /**
                 * Real-Time Payments transfers are not allowed to the destination account.
                 * Corresponds to the Real-Time Payments reason code `AG01`.
                 */
                TRANSACTION_FORBIDDEN,
                /**
                 * Real-Time Payments transfers are not enabled for the destination account.
                 * Corresponds to the Real-Time Payments reason code `AG03`.
                 */
                TRANSACTION_TYPE_NOT_SUPPORTED,
                /**
                 * The amount of the transfer is different than expected by the recipient.
                 * Corresponds to the Real-Time Payments reason code `AM09`.
                 */
                UNEXPECTED_AMOUNT,
                /**
                 * The amount is higher than the recipient is authorized to send or receive.
                 * Corresponds to the Real-Time Payments reason code `AM14`.
                 */
                AMOUNT_EXCEEDS_BANK_LIMITS,
                /**
                 * The debtor's address is required, but missing or invalid. Corresponds to the
                 * Real-Time Payments reason code `BE07`.
                 */
                INVALID_DEBTOR_ADDRESS,
                /**
                 * The creditor's address is required, but missing or invalid. Corresponds to the
                 * Real-Time Payments reason code `BE04`.
                 */
                INVALID_CREDITOR_ADDRESS,
                /**
                 * Creditor identifier incorrect. Corresponds to the Real-Time Payments reason code
                 * `CH11`.
                 */
                CREDITOR_IDENTIFIER_INCORRECT,
                /**
                 * The customer refused the request. Corresponds to the Real-Time Payments reason
                 * code `CUST`.
                 */
                REQUESTED_BY_CUSTOMER,
                /**
                 * The order was rejected. Corresponds to the Real-Time Payments reason code `DS04`.
                 */
                ORDER_REJECTED,
                /**
                 * The destination account holder is deceased. Corresponds to the Real-Time Payments
                 * reason code `MD07`.
                 */
                END_CUSTOMER_DECEASED,
                /**
                 * The customer has opted out of receiving requests for payments from this creditor.
                 * Corresponds to the Real-Time Payments reason code `SL12`.
                 */
                CUSTOMER_HAS_OPTED_OUT,
                /** Some other error or issue has occurred. */
                OTHER,
            }

            /**
             * An enum containing [RefusalReasonCode]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [RefusalReasonCode] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                /**
                 * The destination account is currently blocked from receiving transactions.
                 * Corresponds to the Real-Time Payments reason code `AC06`.
                 */
                ACCOUNT_BLOCKED,
                /**
                 * Real-Time Payments transfers are not allowed to the destination account.
                 * Corresponds to the Real-Time Payments reason code `AG01`.
                 */
                TRANSACTION_FORBIDDEN,
                /**
                 * Real-Time Payments transfers are not enabled for the destination account.
                 * Corresponds to the Real-Time Payments reason code `AG03`.
                 */
                TRANSACTION_TYPE_NOT_SUPPORTED,
                /**
                 * The amount of the transfer is different than expected by the recipient.
                 * Corresponds to the Real-Time Payments reason code `AM09`.
                 */
                UNEXPECTED_AMOUNT,
                /**
                 * The amount is higher than the recipient is authorized to send or receive.
                 * Corresponds to the Real-Time Payments reason code `AM14`.
                 */
                AMOUNT_EXCEEDS_BANK_LIMITS,
                /**
                 * The debtor's address is required, but missing or invalid. Corresponds to the
                 * Real-Time Payments reason code `BE07`.
                 */
                INVALID_DEBTOR_ADDRESS,
                /**
                 * The creditor's address is required, but missing or invalid. Corresponds to the
                 * Real-Time Payments reason code `BE04`.
                 */
                INVALID_CREDITOR_ADDRESS,
                /**
                 * Creditor identifier incorrect. Corresponds to the Real-Time Payments reason code
                 * `CH11`.
                 */
                CREDITOR_IDENTIFIER_INCORRECT,
                /**
                 * The customer refused the request. Corresponds to the Real-Time Payments reason
                 * code `CUST`.
                 */
                REQUESTED_BY_CUSTOMER,
                /**
                 * The order was rejected. Corresponds to the Real-Time Payments reason code `DS04`.
                 */
                ORDER_REJECTED,
                /**
                 * The destination account holder is deceased. Corresponds to the Real-Time Payments
                 * reason code `MD07`.
                 */
                END_CUSTOMER_DECEASED,
                /**
                 * The customer has opted out of receiving requests for payments from this creditor.
                 * Corresponds to the Real-Time Payments reason code `SL12`.
                 */
                CUSTOMER_HAS_OPTED_OUT,
                /** Some other error or issue has occurred. */
                OTHER,
                /**
                 * An enum member indicating that [RefusalReasonCode] was instantiated with an
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
                    ACCOUNT_BLOCKED -> Value.ACCOUNT_BLOCKED
                    TRANSACTION_FORBIDDEN -> Value.TRANSACTION_FORBIDDEN
                    TRANSACTION_TYPE_NOT_SUPPORTED -> Value.TRANSACTION_TYPE_NOT_SUPPORTED
                    UNEXPECTED_AMOUNT -> Value.UNEXPECTED_AMOUNT
                    AMOUNT_EXCEEDS_BANK_LIMITS -> Value.AMOUNT_EXCEEDS_BANK_LIMITS
                    INVALID_DEBTOR_ADDRESS -> Value.INVALID_DEBTOR_ADDRESS
                    INVALID_CREDITOR_ADDRESS -> Value.INVALID_CREDITOR_ADDRESS
                    CREDITOR_IDENTIFIER_INCORRECT -> Value.CREDITOR_IDENTIFIER_INCORRECT
                    REQUESTED_BY_CUSTOMER -> Value.REQUESTED_BY_CUSTOMER
                    ORDER_REJECTED -> Value.ORDER_REJECTED
                    END_CUSTOMER_DECEASED -> Value.END_CUSTOMER_DECEASED
                    CUSTOMER_HAS_OPTED_OUT -> Value.CUSTOMER_HAS_OPTED_OUT
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
                    ACCOUNT_BLOCKED -> Known.ACCOUNT_BLOCKED
                    TRANSACTION_FORBIDDEN -> Known.TRANSACTION_FORBIDDEN
                    TRANSACTION_TYPE_NOT_SUPPORTED -> Known.TRANSACTION_TYPE_NOT_SUPPORTED
                    UNEXPECTED_AMOUNT -> Known.UNEXPECTED_AMOUNT
                    AMOUNT_EXCEEDS_BANK_LIMITS -> Known.AMOUNT_EXCEEDS_BANK_LIMITS
                    INVALID_DEBTOR_ADDRESS -> Known.INVALID_DEBTOR_ADDRESS
                    INVALID_CREDITOR_ADDRESS -> Known.INVALID_CREDITOR_ADDRESS
                    CREDITOR_IDENTIFIER_INCORRECT -> Known.CREDITOR_IDENTIFIER_INCORRECT
                    REQUESTED_BY_CUSTOMER -> Known.REQUESTED_BY_CUSTOMER
                    ORDER_REJECTED -> Known.ORDER_REJECTED
                    END_CUSTOMER_DECEASED -> Known.END_CUSTOMER_DECEASED
                    CUSTOMER_HAS_OPTED_OUT -> Known.CUSTOMER_HAS_OPTED_OUT
                    OTHER -> Known.OTHER
                    else -> throw IncreaseInvalidDataException("Unknown RefusalReasonCode: $value")
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
            fun validate(): RefusalReasonCode = apply {
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

                return other is RefusalReasonCode && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Refusal &&
                refusalReasonAdditionalInformation == other.refusalReasonAdditionalInformation &&
                refusalReasonCode == other.refusalReasonCode &&
                refusedAt == other.refusedAt &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                refusalReasonAdditionalInformation,
                refusalReasonCode,
                refusedAt,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Refusal{refusalReasonAdditionalInformation=$refusalReasonAdditionalInformation, refusalReasonCode=$refusalReasonCode, refusedAt=$refusedAt, additionalProperties=$additionalProperties}"
    }

    /**
     * If the request for payment is rejected by Real-Time Payments or the destination financial
     * institution, this will contain supplemental details.
     */
    class Rejection
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val rejectReasonAdditionalInformation: JsonField<String>,
        private val rejectReasonCode: JsonField<RejectReasonCode>,
        private val rejectedAt: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("reject_reason_additional_information")
            @ExcludeMissing
            rejectReasonAdditionalInformation: JsonField<String> = JsonMissing.of(),
            @JsonProperty("reject_reason_code")
            @ExcludeMissing
            rejectReasonCode: JsonField<RejectReasonCode> = JsonMissing.of(),
            @JsonProperty("rejected_at")
            @ExcludeMissing
            rejectedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(rejectReasonAdditionalInformation, rejectReasonCode, rejectedAt, mutableMapOf())

        /**
         * Additional information about the rejection provided by the recipient bank or the
         * Real-Time Payments network. This is typically present when the `reject_reason_code` is
         * `narrative`.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun rejectReasonAdditionalInformation(): Optional<String> =
            rejectReasonAdditionalInformation.getOptional("reject_reason_additional_information")

        /**
         * The reason the request for payment was rejected as provided by the recipient bank or the
         * Real-Time Payments network.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun rejectReasonCode(): RejectReasonCode =
            rejectReasonCode.getRequired("reject_reason_code")

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the request
         * for payment was rejected.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun rejectedAt(): Optional<OffsetDateTime> = rejectedAt.getOptional("rejected_at")

        /**
         * Returns the raw JSON value of [rejectReasonAdditionalInformation].
         *
         * Unlike [rejectReasonAdditionalInformation], this method doesn't throw if the JSON field
         * has an unexpected type.
         */
        @JsonProperty("reject_reason_additional_information")
        @ExcludeMissing
        fun _rejectReasonAdditionalInformation(): JsonField<String> =
            rejectReasonAdditionalInformation

        /**
         * Returns the raw JSON value of [rejectReasonCode].
         *
         * Unlike [rejectReasonCode], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("reject_reason_code")
        @ExcludeMissing
        fun _rejectReasonCode(): JsonField<RejectReasonCode> = rejectReasonCode

        /**
         * Returns the raw JSON value of [rejectedAt].
         *
         * Unlike [rejectedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("rejected_at")
        @ExcludeMissing
        fun _rejectedAt(): JsonField<OffsetDateTime> = rejectedAt

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
             * .rejectReasonAdditionalInformation()
             * .rejectReasonCode()
             * .rejectedAt()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Rejection]. */
        class Builder internal constructor() {

            private var rejectReasonAdditionalInformation: JsonField<String>? = null
            private var rejectReasonCode: JsonField<RejectReasonCode>? = null
            private var rejectedAt: JsonField<OffsetDateTime>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(rejection: Rejection) = apply {
                rejectReasonAdditionalInformation = rejection.rejectReasonAdditionalInformation
                rejectReasonCode = rejection.rejectReasonCode
                rejectedAt = rejection.rejectedAt
                additionalProperties = rejection.additionalProperties.toMutableMap()
            }

            /**
             * Additional information about the rejection provided by the recipient bank or the
             * Real-Time Payments network. This is typically present when the `reject_reason_code`
             * is `narrative`.
             */
            fun rejectReasonAdditionalInformation(rejectReasonAdditionalInformation: String?) =
                rejectReasonAdditionalInformation(
                    JsonField.ofNullable(rejectReasonAdditionalInformation)
                )

            /**
             * Alias for calling [Builder.rejectReasonAdditionalInformation] with
             * `rejectReasonAdditionalInformation.orElse(null)`.
             */
            fun rejectReasonAdditionalInformation(
                rejectReasonAdditionalInformation: Optional<String>
            ) = rejectReasonAdditionalInformation(rejectReasonAdditionalInformation.getOrNull())

            /**
             * Sets [Builder.rejectReasonAdditionalInformation] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rejectReasonAdditionalInformation] with a well-typed
             * [String] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun rejectReasonAdditionalInformation(
                rejectReasonAdditionalInformation: JsonField<String>
            ) = apply { this.rejectReasonAdditionalInformation = rejectReasonAdditionalInformation }

            /**
             * The reason the request for payment was rejected as provided by the recipient bank or
             * the Real-Time Payments network.
             */
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

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * request for payment was rejected.
             */
            fun rejectedAt(rejectedAt: OffsetDateTime?) =
                rejectedAt(JsonField.ofNullable(rejectedAt))

            /** Alias for calling [Builder.rejectedAt] with `rejectedAt.orElse(null)`. */
            fun rejectedAt(rejectedAt: Optional<OffsetDateTime>) =
                rejectedAt(rejectedAt.getOrNull())

            /**
             * Sets [Builder.rejectedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rejectedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun rejectedAt(rejectedAt: JsonField<OffsetDateTime>) = apply {
                this.rejectedAt = rejectedAt
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
             * .rejectReasonAdditionalInformation()
             * .rejectReasonCode()
             * .rejectedAt()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Rejection =
                Rejection(
                    checkRequired(
                        "rejectReasonAdditionalInformation",
                        rejectReasonAdditionalInformation,
                    ),
                    checkRequired("rejectReasonCode", rejectReasonCode),
                    checkRequired("rejectedAt", rejectedAt),
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

            rejectReasonAdditionalInformation()
            rejectReasonCode().validate()
            rejectedAt()
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
            (if (rejectReasonAdditionalInformation.asKnown().isPresent) 1 else 0) +
                (rejectReasonCode.asKnown().getOrNull()?.validity() ?: 0) +
                (if (rejectedAt.asKnown().isPresent) 1 else 0)

        /**
         * The reason the request for payment was rejected as provided by the recipient bank or the
         * Real-Time Payments network.
         */
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
                 * The destination account is closed. Corresponds to the Real-Time Payments reason
                 * code "AC04".
                 */
                @JvmField val ACCOUNT_CLOSED = of("account_closed")

                /**
                 * The destination account is currently blocked from receiving transactions.
                 * Corresponds to the Real-Time Payments reason code "AC06".
                 */
                @JvmField val ACCOUNT_BLOCKED = of("account_blocked")

                /**
                 * The destination account is ineligible to receive Real-Time Payments transfers.
                 * Corresponds to the Real-Time Payments reason code "AC14".
                 */
                @JvmField val INVALID_CREDITOR_ACCOUNT_TYPE = of("invalid_creditor_account_type")

                /**
                 * The destination account does not exist. Corresponds to the Real-Time Payments
                 * reason code "AC03".
                 */
                @JvmField
                val INVALID_CREDITOR_ACCOUNT_NUMBER = of("invalid_creditor_account_number")

                /**
                 * The destination routing number is invalid. Corresponds to the Real-Time Payments
                 * reason code "RC04".
                 */
                @JvmField
                val INVALID_CREDITOR_FINANCIAL_INSTITUTION_IDENTIFIER =
                    of("invalid_creditor_financial_institution_identifier")

                /**
                 * The destination account holder is deceased. Corresponds to the Real-Time Payments
                 * reason code "MD07".
                 */
                @JvmField val END_CUSTOMER_DECEASED = of("end_customer_deceased")

                /**
                 * The reason is provided as narrative information in the additional information
                 * field.
                 */
                @JvmField val NARRATIVE = of("narrative")

                /**
                 * Real-Time Payments transfers are not allowed to the destination account.
                 * Corresponds to the Real-Time Payments reason code "AG01".
                 */
                @JvmField val TRANSACTION_FORBIDDEN = of("transaction_forbidden")

                /**
                 * Real-Time Payments transfers are not enabled for the destination account.
                 * Corresponds to the Real-Time Payments reason code "AG03".
                 */
                @JvmField val TRANSACTION_TYPE_NOT_SUPPORTED = of("transaction_type_not_supported")

                /**
                 * The amount of the transfer is different than expected by the recipient.
                 * Corresponds to the Real-Time Payments reason code "AM09".
                 */
                @JvmField val UNEXPECTED_AMOUNT = of("unexpected_amount")

                /**
                 * The amount is higher than the recipient is authorized to send or receive.
                 * Corresponds to the Real-Time Payments reason code "AM14".
                 */
                @JvmField val AMOUNT_EXCEEDS_BANK_LIMITS = of("amount_exceeds_bank_limits")

                /**
                 * The creditor's address is required, but missing or invalid. Corresponds to the
                 * Real-Time Payments reason code "BE04".
                 */
                @JvmField val INVALID_CREDITOR_ADDRESS = of("invalid_creditor_address")

                /**
                 * The specified creditor is unknown. Corresponds to the Real-Time Payments reason
                 * code "BE06".
                 */
                @JvmField val UNKNOWN_END_CUSTOMER = of("unknown_end_customer")

                /**
                 * The debtor's address is required, but missing or invalid. Corresponds to the
                 * Real-Time Payments reason code "BE07".
                 */
                @JvmField val INVALID_DEBTOR_ADDRESS = of("invalid_debtor_address")

                /**
                 * There was a timeout processing the transfer. Corresponds to the Real-Time
                 * Payments reason code "DS24".
                 */
                @JvmField val TIMEOUT = of("timeout")

                /**
                 * Real-Time Payments transfers are not enabled for the destination account.
                 * Corresponds to the Real-Time Payments reason code "NOAT".
                 */
                @JvmField
                val UNSUPPORTED_MESSAGE_FOR_RECIPIENT = of("unsupported_message_for_recipient")

                /**
                 * The destination financial institution is currently not connected to Real-Time
                 * Payments. Corresponds to the Real-Time Payments reason code "9912".
                 */
                @JvmField
                val RECIPIENT_CONNECTION_NOT_AVAILABLE = of("recipient_connection_not_available")

                /**
                 * Real-Time Payments is currently unavailable. Corresponds to the Real-Time
                 * Payments reason code "9948".
                 */
                @JvmField val REAL_TIME_PAYMENTS_SUSPENDED = of("real_time_payments_suspended")

                /**
                 * The destination financial institution is currently signed off of Real-Time
                 * Payments. Corresponds to the Real-Time Payments reason code "9910".
                 */
                @JvmField val INSTRUCTED_AGENT_SIGNED_OFF = of("instructed_agent_signed_off")

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
                 * The destination account is closed. Corresponds to the Real-Time Payments reason
                 * code "AC04".
                 */
                ACCOUNT_CLOSED,
                /**
                 * The destination account is currently blocked from receiving transactions.
                 * Corresponds to the Real-Time Payments reason code "AC06".
                 */
                ACCOUNT_BLOCKED,
                /**
                 * The destination account is ineligible to receive Real-Time Payments transfers.
                 * Corresponds to the Real-Time Payments reason code "AC14".
                 */
                INVALID_CREDITOR_ACCOUNT_TYPE,
                /**
                 * The destination account does not exist. Corresponds to the Real-Time Payments
                 * reason code "AC03".
                 */
                INVALID_CREDITOR_ACCOUNT_NUMBER,
                /**
                 * The destination routing number is invalid. Corresponds to the Real-Time Payments
                 * reason code "RC04".
                 */
                INVALID_CREDITOR_FINANCIAL_INSTITUTION_IDENTIFIER,
                /**
                 * The destination account holder is deceased. Corresponds to the Real-Time Payments
                 * reason code "MD07".
                 */
                END_CUSTOMER_DECEASED,
                /**
                 * The reason is provided as narrative information in the additional information
                 * field.
                 */
                NARRATIVE,
                /**
                 * Real-Time Payments transfers are not allowed to the destination account.
                 * Corresponds to the Real-Time Payments reason code "AG01".
                 */
                TRANSACTION_FORBIDDEN,
                /**
                 * Real-Time Payments transfers are not enabled for the destination account.
                 * Corresponds to the Real-Time Payments reason code "AG03".
                 */
                TRANSACTION_TYPE_NOT_SUPPORTED,
                /**
                 * The amount of the transfer is different than expected by the recipient.
                 * Corresponds to the Real-Time Payments reason code "AM09".
                 */
                UNEXPECTED_AMOUNT,
                /**
                 * The amount is higher than the recipient is authorized to send or receive.
                 * Corresponds to the Real-Time Payments reason code "AM14".
                 */
                AMOUNT_EXCEEDS_BANK_LIMITS,
                /**
                 * The creditor's address is required, but missing or invalid. Corresponds to the
                 * Real-Time Payments reason code "BE04".
                 */
                INVALID_CREDITOR_ADDRESS,
                /**
                 * The specified creditor is unknown. Corresponds to the Real-Time Payments reason
                 * code "BE06".
                 */
                UNKNOWN_END_CUSTOMER,
                /**
                 * The debtor's address is required, but missing or invalid. Corresponds to the
                 * Real-Time Payments reason code "BE07".
                 */
                INVALID_DEBTOR_ADDRESS,
                /**
                 * There was a timeout processing the transfer. Corresponds to the Real-Time
                 * Payments reason code "DS24".
                 */
                TIMEOUT,
                /**
                 * Real-Time Payments transfers are not enabled for the destination account.
                 * Corresponds to the Real-Time Payments reason code "NOAT".
                 */
                UNSUPPORTED_MESSAGE_FOR_RECIPIENT,
                /**
                 * The destination financial institution is currently not connected to Real-Time
                 * Payments. Corresponds to the Real-Time Payments reason code "9912".
                 */
                RECIPIENT_CONNECTION_NOT_AVAILABLE,
                /**
                 * Real-Time Payments is currently unavailable. Corresponds to the Real-Time
                 * Payments reason code "9948".
                 */
                REAL_TIME_PAYMENTS_SUSPENDED,
                /**
                 * The destination financial institution is currently signed off of Real-Time
                 * Payments. Corresponds to the Real-Time Payments reason code "9910".
                 */
                INSTRUCTED_AGENT_SIGNED_OFF,
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
                 * The destination account is closed. Corresponds to the Real-Time Payments reason
                 * code "AC04".
                 */
                ACCOUNT_CLOSED,
                /**
                 * The destination account is currently blocked from receiving transactions.
                 * Corresponds to the Real-Time Payments reason code "AC06".
                 */
                ACCOUNT_BLOCKED,
                /**
                 * The destination account is ineligible to receive Real-Time Payments transfers.
                 * Corresponds to the Real-Time Payments reason code "AC14".
                 */
                INVALID_CREDITOR_ACCOUNT_TYPE,
                /**
                 * The destination account does not exist. Corresponds to the Real-Time Payments
                 * reason code "AC03".
                 */
                INVALID_CREDITOR_ACCOUNT_NUMBER,
                /**
                 * The destination routing number is invalid. Corresponds to the Real-Time Payments
                 * reason code "RC04".
                 */
                INVALID_CREDITOR_FINANCIAL_INSTITUTION_IDENTIFIER,
                /**
                 * The destination account holder is deceased. Corresponds to the Real-Time Payments
                 * reason code "MD07".
                 */
                END_CUSTOMER_DECEASED,
                /**
                 * The reason is provided as narrative information in the additional information
                 * field.
                 */
                NARRATIVE,
                /**
                 * Real-Time Payments transfers are not allowed to the destination account.
                 * Corresponds to the Real-Time Payments reason code "AG01".
                 */
                TRANSACTION_FORBIDDEN,
                /**
                 * Real-Time Payments transfers are not enabled for the destination account.
                 * Corresponds to the Real-Time Payments reason code "AG03".
                 */
                TRANSACTION_TYPE_NOT_SUPPORTED,
                /**
                 * The amount of the transfer is different than expected by the recipient.
                 * Corresponds to the Real-Time Payments reason code "AM09".
                 */
                UNEXPECTED_AMOUNT,
                /**
                 * The amount is higher than the recipient is authorized to send or receive.
                 * Corresponds to the Real-Time Payments reason code "AM14".
                 */
                AMOUNT_EXCEEDS_BANK_LIMITS,
                /**
                 * The creditor's address is required, but missing or invalid. Corresponds to the
                 * Real-Time Payments reason code "BE04".
                 */
                INVALID_CREDITOR_ADDRESS,
                /**
                 * The specified creditor is unknown. Corresponds to the Real-Time Payments reason
                 * code "BE06".
                 */
                UNKNOWN_END_CUSTOMER,
                /**
                 * The debtor's address is required, but missing or invalid. Corresponds to the
                 * Real-Time Payments reason code "BE07".
                 */
                INVALID_DEBTOR_ADDRESS,
                /**
                 * There was a timeout processing the transfer. Corresponds to the Real-Time
                 * Payments reason code "DS24".
                 */
                TIMEOUT,
                /**
                 * Real-Time Payments transfers are not enabled for the destination account.
                 * Corresponds to the Real-Time Payments reason code "NOAT".
                 */
                UNSUPPORTED_MESSAGE_FOR_RECIPIENT,
                /**
                 * The destination financial institution is currently not connected to Real-Time
                 * Payments. Corresponds to the Real-Time Payments reason code "9912".
                 */
                RECIPIENT_CONNECTION_NOT_AVAILABLE,
                /**
                 * Real-Time Payments is currently unavailable. Corresponds to the Real-Time
                 * Payments reason code "9948".
                 */
                REAL_TIME_PAYMENTS_SUSPENDED,
                /**
                 * The destination financial institution is currently signed off of Real-Time
                 * Payments. Corresponds to the Real-Time Payments reason code "9910".
                 */
                INSTRUCTED_AGENT_SIGNED_OFF,
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
                    UNEXPECTED_AMOUNT -> Value.UNEXPECTED_AMOUNT
                    AMOUNT_EXCEEDS_BANK_LIMITS -> Value.AMOUNT_EXCEEDS_BANK_LIMITS
                    INVALID_CREDITOR_ADDRESS -> Value.INVALID_CREDITOR_ADDRESS
                    UNKNOWN_END_CUSTOMER -> Value.UNKNOWN_END_CUSTOMER
                    INVALID_DEBTOR_ADDRESS -> Value.INVALID_DEBTOR_ADDRESS
                    TIMEOUT -> Value.TIMEOUT
                    UNSUPPORTED_MESSAGE_FOR_RECIPIENT -> Value.UNSUPPORTED_MESSAGE_FOR_RECIPIENT
                    RECIPIENT_CONNECTION_NOT_AVAILABLE -> Value.RECIPIENT_CONNECTION_NOT_AVAILABLE
                    REAL_TIME_PAYMENTS_SUSPENDED -> Value.REAL_TIME_PAYMENTS_SUSPENDED
                    INSTRUCTED_AGENT_SIGNED_OFF -> Value.INSTRUCTED_AGENT_SIGNED_OFF
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
                    UNEXPECTED_AMOUNT -> Known.UNEXPECTED_AMOUNT
                    AMOUNT_EXCEEDS_BANK_LIMITS -> Known.AMOUNT_EXCEEDS_BANK_LIMITS
                    INVALID_CREDITOR_ADDRESS -> Known.INVALID_CREDITOR_ADDRESS
                    UNKNOWN_END_CUSTOMER -> Known.UNKNOWN_END_CUSTOMER
                    INVALID_DEBTOR_ADDRESS -> Known.INVALID_DEBTOR_ADDRESS
                    TIMEOUT -> Known.TIMEOUT
                    UNSUPPORTED_MESSAGE_FOR_RECIPIENT -> Known.UNSUPPORTED_MESSAGE_FOR_RECIPIENT
                    RECIPIENT_CONNECTION_NOT_AVAILABLE -> Known.RECIPIENT_CONNECTION_NOT_AVAILABLE
                    REAL_TIME_PAYMENTS_SUSPENDED -> Known.REAL_TIME_PAYMENTS_SUSPENDED
                    INSTRUCTED_AGENT_SIGNED_OFF -> Known.INSTRUCTED_AGENT_SIGNED_OFF
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
                rejectReasonAdditionalInformation == other.rejectReasonAdditionalInformation &&
                rejectReasonCode == other.rejectReasonCode &&
                rejectedAt == other.rejectedAt &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                rejectReasonAdditionalInformation,
                rejectReasonCode,
                rejectedAt,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Rejection{rejectReasonAdditionalInformation=$rejectReasonAdditionalInformation, rejectReasonCode=$rejectReasonCode, rejectedAt=$rejectedAt, additionalProperties=$additionalProperties}"
    }

    /** The lifecycle status of the request for payment. */
    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            /** The request for payment is queued to be submitted to Real-Time Payments. */
            @JvmField val PENDING_SUBMISSION = of("pending_submission")

            /**
             * The request for payment has been submitted and is pending a response from Real-Time
             * Payments.
             */
            @JvmField val PENDING_RESPONSE = of("pending_response")

            /** The request for payment was rejected by the network or the recipient. */
            @JvmField val REJECTED = of("rejected")

            /** The request for payment was accepted by the recipient but has not yet been paid. */
            @JvmField val ACCEPTED = of("accepted")

            /** The request for payment was refused by the recipient. */
            @JvmField val REFUSED = of("refused")

            /** The request for payment was fulfilled by the receiver. */
            @JvmField val FULFILLED = of("fulfilled")

            /** The request for payment was canceled and can no longer be paid. */
            @JvmField val CANCELED = of("canceled")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            /** The request for payment is queued to be submitted to Real-Time Payments. */
            PENDING_SUBMISSION,
            /**
             * The request for payment has been submitted and is pending a response from Real-Time
             * Payments.
             */
            PENDING_RESPONSE,
            /** The request for payment was rejected by the network or the recipient. */
            REJECTED,
            /** The request for payment was accepted by the recipient but has not yet been paid. */
            ACCEPTED,
            /** The request for payment was refused by the recipient. */
            REFUSED,
            /** The request for payment was fulfilled by the receiver. */
            FULFILLED,
            /** The request for payment was canceled and can no longer be paid. */
            CANCELED,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            /** The request for payment is queued to be submitted to Real-Time Payments. */
            PENDING_SUBMISSION,
            /**
             * The request for payment has been submitted and is pending a response from Real-Time
             * Payments.
             */
            PENDING_RESPONSE,
            /** The request for payment was rejected by the network or the recipient. */
            REJECTED,
            /** The request for payment was accepted by the recipient but has not yet been paid. */
            ACCEPTED,
            /** The request for payment was refused by the recipient. */
            REFUSED,
            /** The request for payment was fulfilled by the receiver. */
            FULFILLED,
            /** The request for payment was canceled and can no longer be paid. */
            CANCELED,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
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
                PENDING_SUBMISSION -> Value.PENDING_SUBMISSION
                PENDING_RESPONSE -> Value.PENDING_RESPONSE
                REJECTED -> Value.REJECTED
                ACCEPTED -> Value.ACCEPTED
                REFUSED -> Value.REFUSED
                FULFILLED -> Value.FULFILLED
                CANCELED -> Value.CANCELED
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
                PENDING_SUBMISSION -> Known.PENDING_SUBMISSION
                PENDING_RESPONSE -> Known.PENDING_RESPONSE
                REJECTED -> Known.REJECTED
                ACCEPTED -> Known.ACCEPTED
                REFUSED -> Known.REFUSED
                FULFILLED -> Known.FULFILLED
                CANCELED -> Known.CANCELED
                else -> throw IncreaseInvalidDataException("Unknown Status: $value")
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws IncreaseInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Status = apply {
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

            return other is Status && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * After the request for payment is submitted to Real-Time Payments, this will contain
     * supplemental details.
     */
    class Submission
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val paymentInformationIdentification: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("payment_information_identification")
            @ExcludeMissing
            paymentInformationIdentification: JsonField<String> = JsonMissing.of()
        ) : this(paymentInformationIdentification, mutableMapOf())

        /**
         * The Real-Time Payments payment information identification of the request.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun paymentInformationIdentification(): String =
            paymentInformationIdentification.getRequired("payment_information_identification")

        /**
         * Returns the raw JSON value of [paymentInformationIdentification].
         *
         * Unlike [paymentInformationIdentification], this method doesn't throw if the JSON field
         * has an unexpected type.
         */
        @JsonProperty("payment_information_identification")
        @ExcludeMissing
        fun _paymentInformationIdentification(): JsonField<String> =
            paymentInformationIdentification

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
             * Returns a mutable builder for constructing an instance of [Submission].
             *
             * The following fields are required:
             * ```java
             * .paymentInformationIdentification()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Submission]. */
        class Builder internal constructor() {

            private var paymentInformationIdentification: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(submission: Submission) = apply {
                paymentInformationIdentification = submission.paymentInformationIdentification
                additionalProperties = submission.additionalProperties.toMutableMap()
            }

            /** The Real-Time Payments payment information identification of the request. */
            fun paymentInformationIdentification(paymentInformationIdentification: String) =
                paymentInformationIdentification(JsonField.of(paymentInformationIdentification))

            /**
             * Sets [Builder.paymentInformationIdentification] to an arbitrary JSON value.
             *
             * You should usually call [Builder.paymentInformationIdentification] with a well-typed
             * [String] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun paymentInformationIdentification(
                paymentInformationIdentification: JsonField<String>
            ) = apply { this.paymentInformationIdentification = paymentInformationIdentification }

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
             * Returns an immutable instance of [Submission].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .paymentInformationIdentification()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Submission =
                Submission(
                    checkRequired(
                        "paymentInformationIdentification",
                        paymentInformationIdentification,
                    ),
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
        fun validate(): Submission = apply {
            if (validated) {
                return@apply
            }

            paymentInformationIdentification()
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
            (if (paymentInformationIdentification.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Submission &&
                paymentInformationIdentification == other.paymentInformationIdentification &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(paymentInformationIdentification, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Submission{paymentInformationIdentification=$paymentInformationIdentification, additionalProperties=$additionalProperties}"
    }

    /**
     * A constant representing the object's type. For this resource it will always be
     * `real_time_payments_request_for_payment`.
     */
    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField
            val REAL_TIME_PAYMENTS_REQUEST_FOR_PAYMENT =
                of("real_time_payments_request_for_payment")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            REAL_TIME_PAYMENTS_REQUEST_FOR_PAYMENT
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            REAL_TIME_PAYMENTS_REQUEST_FOR_PAYMENT,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                REAL_TIME_PAYMENTS_REQUEST_FOR_PAYMENT ->
                    Value.REAL_TIME_PAYMENTS_REQUEST_FOR_PAYMENT
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
                REAL_TIME_PAYMENTS_REQUEST_FOR_PAYMENT ->
                    Known.REAL_TIME_PAYMENTS_REQUEST_FOR_PAYMENT
                else -> throw IncreaseInvalidDataException("Unknown Type: $value")
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws IncreaseInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Type = apply {
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

            return other is Type && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RealTimePaymentsRequestForPayment &&
            id == other.id &&
            accountId == other.accountId &&
            accountNumberId == other.accountNumberId &&
            amount == other.amount &&
            cancellation == other.cancellation &&
            createdAt == other.createdAt &&
            creditorName == other.creditorName &&
            currency == other.currency &&
            debtor == other.debtor &&
            debtorAccountNumber == other.debtorAccountNumber &&
            debtorRoutingNumber == other.debtorRoutingNumber &&
            expiresAt == other.expiresAt &&
            fulfillmentInboundRealTimePaymentsTransferId ==
                other.fulfillmentInboundRealTimePaymentsTransferId &&
            idempotencyKey == other.idempotencyKey &&
            refusal == other.refusal &&
            rejection == other.rejection &&
            requestedExecutionAt == other.requestedExecutionAt &&
            status == other.status &&
            submission == other.submission &&
            type == other.type &&
            unstructuredRemittanceInformation == other.unstructuredRemittanceInformation &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            accountId,
            accountNumberId,
            amount,
            cancellation,
            createdAt,
            creditorName,
            currency,
            debtor,
            debtorAccountNumber,
            debtorRoutingNumber,
            expiresAt,
            fulfillmentInboundRealTimePaymentsTransferId,
            idempotencyKey,
            refusal,
            rejection,
            requestedExecutionAt,
            status,
            submission,
            type,
            unstructuredRemittanceInformation,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RealTimePaymentsRequestForPayment{id=$id, accountId=$accountId, accountNumberId=$accountNumberId, amount=$amount, cancellation=$cancellation, createdAt=$createdAt, creditorName=$creditorName, currency=$currency, debtor=$debtor, debtorAccountNumber=$debtorAccountNumber, debtorRoutingNumber=$debtorRoutingNumber, expiresAt=$expiresAt, fulfillmentInboundRealTimePaymentsTransferId=$fulfillmentInboundRealTimePaymentsTransferId, idempotencyKey=$idempotencyKey, refusal=$refusal, rejection=$rejection, requestedExecutionAt=$requestedExecutionAt, status=$status, submission=$submission, type=$type, unstructuredRemittanceInformation=$unstructuredRemittanceInformation, additionalProperties=$additionalProperties}"
}
