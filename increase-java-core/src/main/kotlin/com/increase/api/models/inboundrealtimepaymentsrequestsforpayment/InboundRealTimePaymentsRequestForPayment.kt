// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.inboundrealtimepaymentsrequestsforpayment

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
 * An Inbound Real-Time Payments Request for Payment is a request initiated outside of Increase for
 * one of your accounts to send a Real-Time Payments transfer.
 */
class InboundRealTimePaymentsRequestForPayment
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val accountId: JsonField<String>,
    private val accountNumberId: JsonField<String>,
    private val amount: JsonField<Long>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val creditor: JsonField<Creditor>,
    private val creditorAccountNumber: JsonField<String>,
    private val creditorRoutingNumber: JsonField<String>,
    private val currency: JsonField<Currency>,
    private val debtorName: JsonField<String>,
    private val endToEndIdentification: JsonField<String>,
    private val expiresAt: JsonField<OffsetDateTime>,
    private val fulfillmentRealTimePaymentsTransferId: JsonField<String>,
    private val invoicerIdentification: JsonField<String>,
    private val paymentInformationIdentification: JsonField<String>,
    private val requestedExecutionAt: JsonField<OffsetDateTime>,
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
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("creditor") @ExcludeMissing creditor: JsonField<Creditor> = JsonMissing.of(),
        @JsonProperty("creditor_account_number")
        @ExcludeMissing
        creditorAccountNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("creditor_routing_number")
        @ExcludeMissing
        creditorRoutingNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("currency") @ExcludeMissing currency: JsonField<Currency> = JsonMissing.of(),
        @JsonProperty("debtor_name")
        @ExcludeMissing
        debtorName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("end_to_end_identification")
        @ExcludeMissing
        endToEndIdentification: JsonField<String> = JsonMissing.of(),
        @JsonProperty("expires_at")
        @ExcludeMissing
        expiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("fulfillment_real_time_payments_transfer_id")
        @ExcludeMissing
        fulfillmentRealTimePaymentsTransferId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("invoicer_identification")
        @ExcludeMissing
        invoicerIdentification: JsonField<String> = JsonMissing.of(),
        @JsonProperty("payment_information_identification")
        @ExcludeMissing
        paymentInformationIdentification: JsonField<String> = JsonMissing.of(),
        @JsonProperty("requested_execution_at")
        @ExcludeMissing
        requestedExecutionAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("unstructured_remittance_information")
        @ExcludeMissing
        unstructuredRemittanceInformation: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        accountId,
        accountNumberId,
        amount,
        createdAt,
        creditor,
        creditorAccountNumber,
        creditorRoutingNumber,
        currency,
        debtorName,
        endToEndIdentification,
        expiresAt,
        fulfillmentRealTimePaymentsTransferId,
        invoicerIdentification,
        paymentInformationIdentification,
        requestedExecutionAt,
        type,
        unstructuredRemittanceInformation,
        mutableMapOf(),
    )

    /**
     * The inbound Real-Time Payments request for payment's identifier.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * The Account the request for payment is for.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountId(): String = accountId.getRequired("account_id")

    /**
     * The identifier of the Account Number the request for payment is for.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountNumberId(): String = accountNumberId.getRequired("account_number_id")

    /**
     * The requested amount in USD cents.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun amount(): Long = amount.getRequired("amount")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the request for
     * payment was created.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * Details of the party requesting payment.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun creditor(): Creditor = creditor.getRequired("creditor")

    /**
     * The creditor's account number.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun creditorAccountNumber(): String =
        creditorAccountNumber.getRequired("creditor_account_number")

    /**
     * The creditor's American Bankers' Association (ABA) Routing Transit Number (RTN).
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun creditorRoutingNumber(): String =
        creditorRoutingNumber.getRequired("creditor_routing_number")

    /**
     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code of the requested currency. This
     * will always be "USD" for a Real-Time Payments request for payment.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun currency(): Currency = currency.getRequired("currency")

    /**
     * The name of the account holder the payment is requested from, as provided by the creditor.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun debtorName(): String = debtorName.getRequired("debtor_name")

    /**
     * A free-form reference string set by the creditor, to help identify the request for payment.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun endToEndIdentification(): String =
        endToEndIdentification.getRequired("end_to_end_identification")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time after which the request
     * for payment is no longer valid and should no longer be paid.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun expiresAt(): OffsetDateTime = expiresAt.getRequired("expires_at")

    /**
     * The identifier of the Real-Time Payments Transfer that fulfilled this request for payment.
     * This is set once a transfer sent in response to the request for payment has been acknowledged
     * by the Real-Time Payments network.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fulfillmentRealTimePaymentsTransferId(): Optional<String> =
        fulfillmentRealTimePaymentsTransferId.getOptional(
            "fulfillment_real_time_payments_transfer_id"
        )

    /**
     * An identifier for the party that issued the invoice, for requests for payment sent on behalf
     * of another party.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun invoicerIdentification(): Optional<String> =
        invoicerIdentification.getOptional("invoicer_identification")

    /**
     * The Real-Time Payments network identification of the request for payment.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun paymentInformationIdentification(): String =
        paymentInformationIdentification.getRequired("payment_information_identification")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time by which the creditor
     * requests the payment to be made.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun requestedExecutionAt(): Optional<OffsetDateTime> =
        requestedExecutionAt.getOptional("requested_execution_at")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `inbound_real_time_payments_request_for_payment`.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * Unstructured information included with the request for payment.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun unstructuredRemittanceInformation(): Optional<String> =
        unstructuredRemittanceInformation.getOptional("unstructured_remittance_information")

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
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [creditor].
     *
     * Unlike [creditor], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("creditor") @ExcludeMissing fun _creditor(): JsonField<Creditor> = creditor

    /**
     * Returns the raw JSON value of [creditorAccountNumber].
     *
     * Unlike [creditorAccountNumber], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("creditor_account_number")
    @ExcludeMissing
    fun _creditorAccountNumber(): JsonField<String> = creditorAccountNumber

    /**
     * Returns the raw JSON value of [creditorRoutingNumber].
     *
     * Unlike [creditorRoutingNumber], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("creditor_routing_number")
    @ExcludeMissing
    fun _creditorRoutingNumber(): JsonField<String> = creditorRoutingNumber

    /**
     * Returns the raw JSON value of [currency].
     *
     * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<Currency> = currency

    /**
     * Returns the raw JSON value of [debtorName].
     *
     * Unlike [debtorName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("debtor_name") @ExcludeMissing fun _debtorName(): JsonField<String> = debtorName

    /**
     * Returns the raw JSON value of [endToEndIdentification].
     *
     * Unlike [endToEndIdentification], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("end_to_end_identification")
    @ExcludeMissing
    fun _endToEndIdentification(): JsonField<String> = endToEndIdentification

    /**
     * Returns the raw JSON value of [expiresAt].
     *
     * Unlike [expiresAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("expires_at")
    @ExcludeMissing
    fun _expiresAt(): JsonField<OffsetDateTime> = expiresAt

    /**
     * Returns the raw JSON value of [fulfillmentRealTimePaymentsTransferId].
     *
     * Unlike [fulfillmentRealTimePaymentsTransferId], this method doesn't throw if the JSON field
     * has an unexpected type.
     */
    @JsonProperty("fulfillment_real_time_payments_transfer_id")
    @ExcludeMissing
    fun _fulfillmentRealTimePaymentsTransferId(): JsonField<String> =
        fulfillmentRealTimePaymentsTransferId

    /**
     * Returns the raw JSON value of [invoicerIdentification].
     *
     * Unlike [invoicerIdentification], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("invoicer_identification")
    @ExcludeMissing
    fun _invoicerIdentification(): JsonField<String> = invoicerIdentification

    /**
     * Returns the raw JSON value of [paymentInformationIdentification].
     *
     * Unlike [paymentInformationIdentification], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("payment_information_identification")
    @ExcludeMissing
    fun _paymentInformationIdentification(): JsonField<String> = paymentInformationIdentification

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
         * [InboundRealTimePaymentsRequestForPayment].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .accountId()
         * .accountNumberId()
         * .amount()
         * .createdAt()
         * .creditor()
         * .creditorAccountNumber()
         * .creditorRoutingNumber()
         * .currency()
         * .debtorName()
         * .endToEndIdentification()
         * .expiresAt()
         * .fulfillmentRealTimePaymentsTransferId()
         * .invoicerIdentification()
         * .paymentInformationIdentification()
         * .requestedExecutionAt()
         * .type()
         * .unstructuredRemittanceInformation()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InboundRealTimePaymentsRequestForPayment]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var accountId: JsonField<String>? = null
        private var accountNumberId: JsonField<String>? = null
        private var amount: JsonField<Long>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var creditor: JsonField<Creditor>? = null
        private var creditorAccountNumber: JsonField<String>? = null
        private var creditorRoutingNumber: JsonField<String>? = null
        private var currency: JsonField<Currency>? = null
        private var debtorName: JsonField<String>? = null
        private var endToEndIdentification: JsonField<String>? = null
        private var expiresAt: JsonField<OffsetDateTime>? = null
        private var fulfillmentRealTimePaymentsTransferId: JsonField<String>? = null
        private var invoicerIdentification: JsonField<String>? = null
        private var paymentInformationIdentification: JsonField<String>? = null
        private var requestedExecutionAt: JsonField<OffsetDateTime>? = null
        private var type: JsonField<Type>? = null
        private var unstructuredRemittanceInformation: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            inboundRealTimePaymentsRequestForPayment: InboundRealTimePaymentsRequestForPayment
        ) = apply {
            id = inboundRealTimePaymentsRequestForPayment.id
            accountId = inboundRealTimePaymentsRequestForPayment.accountId
            accountNumberId = inboundRealTimePaymentsRequestForPayment.accountNumberId
            amount = inboundRealTimePaymentsRequestForPayment.amount
            createdAt = inboundRealTimePaymentsRequestForPayment.createdAt
            creditor = inboundRealTimePaymentsRequestForPayment.creditor
            creditorAccountNumber = inboundRealTimePaymentsRequestForPayment.creditorAccountNumber
            creditorRoutingNumber = inboundRealTimePaymentsRequestForPayment.creditorRoutingNumber
            currency = inboundRealTimePaymentsRequestForPayment.currency
            debtorName = inboundRealTimePaymentsRequestForPayment.debtorName
            endToEndIdentification = inboundRealTimePaymentsRequestForPayment.endToEndIdentification
            expiresAt = inboundRealTimePaymentsRequestForPayment.expiresAt
            fulfillmentRealTimePaymentsTransferId =
                inboundRealTimePaymentsRequestForPayment.fulfillmentRealTimePaymentsTransferId
            invoicerIdentification = inboundRealTimePaymentsRequestForPayment.invoicerIdentification
            paymentInformationIdentification =
                inboundRealTimePaymentsRequestForPayment.paymentInformationIdentification
            requestedExecutionAt = inboundRealTimePaymentsRequestForPayment.requestedExecutionAt
            type = inboundRealTimePaymentsRequestForPayment.type
            unstructuredRemittanceInformation =
                inboundRealTimePaymentsRequestForPayment.unstructuredRemittanceInformation
            additionalProperties =
                inboundRealTimePaymentsRequestForPayment.additionalProperties.toMutableMap()
        }

        /** The inbound Real-Time Payments request for payment's identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The Account the request for payment is for. */
        fun accountId(accountId: String) = accountId(JsonField.of(accountId))

        /**
         * Sets [Builder.accountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

        /** The identifier of the Account Number the request for payment is for. */
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

        /** The requested amount in USD cents. */
        fun amount(amount: Long) = amount(JsonField.of(amount))

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

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

        /** Details of the party requesting payment. */
        fun creditor(creditor: Creditor) = creditor(JsonField.of(creditor))

        /**
         * Sets [Builder.creditor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.creditor] with a well-typed [Creditor] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun creditor(creditor: JsonField<Creditor>) = apply { this.creditor = creditor }

        /** The creditor's account number. */
        fun creditorAccountNumber(creditorAccountNumber: String) =
            creditorAccountNumber(JsonField.of(creditorAccountNumber))

        /**
         * Sets [Builder.creditorAccountNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.creditorAccountNumber] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun creditorAccountNumber(creditorAccountNumber: JsonField<String>) = apply {
            this.creditorAccountNumber = creditorAccountNumber
        }

        /** The creditor's American Bankers' Association (ABA) Routing Transit Number (RTN). */
        fun creditorRoutingNumber(creditorRoutingNumber: String) =
            creditorRoutingNumber(JsonField.of(creditorRoutingNumber))

        /**
         * Sets [Builder.creditorRoutingNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.creditorRoutingNumber] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun creditorRoutingNumber(creditorRoutingNumber: JsonField<String>) = apply {
            this.creditorRoutingNumber = creditorRoutingNumber
        }

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code of the requested currency.
         * This will always be "USD" for a Real-Time Payments request for payment.
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

        /**
         * The name of the account holder the payment is requested from, as provided by the
         * creditor.
         */
        fun debtorName(debtorName: String) = debtorName(JsonField.of(debtorName))

        /**
         * Sets [Builder.debtorName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.debtorName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun debtorName(debtorName: JsonField<String>) = apply { this.debtorName = debtorName }

        /**
         * A free-form reference string set by the creditor, to help identify the request for
         * payment.
         */
        fun endToEndIdentification(endToEndIdentification: String) =
            endToEndIdentification(JsonField.of(endToEndIdentification))

        /**
         * Sets [Builder.endToEndIdentification] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endToEndIdentification] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun endToEndIdentification(endToEndIdentification: JsonField<String>) = apply {
            this.endToEndIdentification = endToEndIdentification
        }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time after which the
         * request for payment is no longer valid and should no longer be paid.
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
         * The identifier of the Real-Time Payments Transfer that fulfilled this request for
         * payment. This is set once a transfer sent in response to the request for payment has been
         * acknowledged by the Real-Time Payments network.
         */
        fun fulfillmentRealTimePaymentsTransferId(fulfillmentRealTimePaymentsTransferId: String?) =
            fulfillmentRealTimePaymentsTransferId(
                JsonField.ofNullable(fulfillmentRealTimePaymentsTransferId)
            )

        /**
         * Alias for calling [Builder.fulfillmentRealTimePaymentsTransferId] with
         * `fulfillmentRealTimePaymentsTransferId.orElse(null)`.
         */
        fun fulfillmentRealTimePaymentsTransferId(
            fulfillmentRealTimePaymentsTransferId: Optional<String>
        ) = fulfillmentRealTimePaymentsTransferId(fulfillmentRealTimePaymentsTransferId.getOrNull())

        /**
         * Sets [Builder.fulfillmentRealTimePaymentsTransferId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fulfillmentRealTimePaymentsTransferId] with a well-typed
         * [String] value instead. This method is primarily for setting the field to an undocumented
         * or not yet supported value.
         */
        fun fulfillmentRealTimePaymentsTransferId(
            fulfillmentRealTimePaymentsTransferId: JsonField<String>
        ) = apply {
            this.fulfillmentRealTimePaymentsTransferId = fulfillmentRealTimePaymentsTransferId
        }

        /**
         * An identifier for the party that issued the invoice, for requests for payment sent on
         * behalf of another party.
         */
        fun invoicerIdentification(invoicerIdentification: String?) =
            invoicerIdentification(JsonField.ofNullable(invoicerIdentification))

        /**
         * Alias for calling [Builder.invoicerIdentification] with
         * `invoicerIdentification.orElse(null)`.
         */
        fun invoicerIdentification(invoicerIdentification: Optional<String>) =
            invoicerIdentification(invoicerIdentification.getOrNull())

        /**
         * Sets [Builder.invoicerIdentification] to an arbitrary JSON value.
         *
         * You should usually call [Builder.invoicerIdentification] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun invoicerIdentification(invoicerIdentification: JsonField<String>) = apply {
            this.invoicerIdentification = invoicerIdentification
        }

        /** The Real-Time Payments network identification of the request for payment. */
        fun paymentInformationIdentification(paymentInformationIdentification: String) =
            paymentInformationIdentification(JsonField.of(paymentInformationIdentification))

        /**
         * Sets [Builder.paymentInformationIdentification] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paymentInformationIdentification] with a well-typed
         * [String] value instead. This method is primarily for setting the field to an undocumented
         * or not yet supported value.
         */
        fun paymentInformationIdentification(paymentInformationIdentification: JsonField<String>) =
            apply {
                this.paymentInformationIdentification = paymentInformationIdentification
            }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time by which the
         * creditor requests the payment to be made.
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

        /**
         * A constant representing the object's type. For this resource it will always be
         * `inbound_real_time_payments_request_for_payment`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        /** Unstructured information included with the request for payment. */
        fun unstructuredRemittanceInformation(unstructuredRemittanceInformation: String?) =
            unstructuredRemittanceInformation(
                JsonField.ofNullable(unstructuredRemittanceInformation)
            )

        /**
         * Alias for calling [Builder.unstructuredRemittanceInformation] with
         * `unstructuredRemittanceInformation.orElse(null)`.
         */
        fun unstructuredRemittanceInformation(unstructuredRemittanceInformation: Optional<String>) =
            unstructuredRemittanceInformation(unstructuredRemittanceInformation.getOrNull())

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
         * Returns an immutable instance of [InboundRealTimePaymentsRequestForPayment].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .accountId()
         * .accountNumberId()
         * .amount()
         * .createdAt()
         * .creditor()
         * .creditorAccountNumber()
         * .creditorRoutingNumber()
         * .currency()
         * .debtorName()
         * .endToEndIdentification()
         * .expiresAt()
         * .fulfillmentRealTimePaymentsTransferId()
         * .invoicerIdentification()
         * .paymentInformationIdentification()
         * .requestedExecutionAt()
         * .type()
         * .unstructuredRemittanceInformation()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): InboundRealTimePaymentsRequestForPayment =
            InboundRealTimePaymentsRequestForPayment(
                checkRequired("id", id),
                checkRequired("accountId", accountId),
                checkRequired("accountNumberId", accountNumberId),
                checkRequired("amount", amount),
                checkRequired("createdAt", createdAt),
                checkRequired("creditor", creditor),
                checkRequired("creditorAccountNumber", creditorAccountNumber),
                checkRequired("creditorRoutingNumber", creditorRoutingNumber),
                checkRequired("currency", currency),
                checkRequired("debtorName", debtorName),
                checkRequired("endToEndIdentification", endToEndIdentification),
                checkRequired("expiresAt", expiresAt),
                checkRequired(
                    "fulfillmentRealTimePaymentsTransferId",
                    fulfillmentRealTimePaymentsTransferId,
                ),
                checkRequired("invoicerIdentification", invoicerIdentification),
                checkRequired("paymentInformationIdentification", paymentInformationIdentification),
                checkRequired("requestedExecutionAt", requestedExecutionAt),
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
    fun validate(): InboundRealTimePaymentsRequestForPayment = apply {
        if (validated) {
            return@apply
        }

        id()
        accountId()
        accountNumberId()
        amount()
        createdAt()
        creditor().validate()
        creditorAccountNumber()
        creditorRoutingNumber()
        currency().validate()
        debtorName()
        endToEndIdentification()
        expiresAt()
        fulfillmentRealTimePaymentsTransferId()
        invoicerIdentification()
        paymentInformationIdentification()
        requestedExecutionAt()
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
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (creditor.asKnown().getOrNull()?.validity() ?: 0) +
            (if (creditorAccountNumber.asKnown().isPresent) 1 else 0) +
            (if (creditorRoutingNumber.asKnown().isPresent) 1 else 0) +
            (currency.asKnown().getOrNull()?.validity() ?: 0) +
            (if (debtorName.asKnown().isPresent) 1 else 0) +
            (if (endToEndIdentification.asKnown().isPresent) 1 else 0) +
            (if (expiresAt.asKnown().isPresent) 1 else 0) +
            (if (fulfillmentRealTimePaymentsTransferId.asKnown().isPresent) 1 else 0) +
            (if (invoicerIdentification.asKnown().isPresent) 1 else 0) +
            (if (paymentInformationIdentification.asKnown().isPresent) 1 else 0) +
            (if (requestedExecutionAt.asKnown().isPresent) 1 else 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0) +
            (if (unstructuredRemittanceInformation.asKnown().isPresent) 1 else 0)

    /** Details of the party requesting payment. */
    class Creditor
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val accountName: JsonField<String>,
        private val address: JsonField<Address>,
        private val name: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("account_name")
            @ExcludeMissing
            accountName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("address") @ExcludeMissing address: JsonField<Address> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        ) : this(accountName, address, name, mutableMapOf())

        /**
         * The name of the account that would receive the payment, as provided by the creditor.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun accountName(): Optional<String> = accountName.getOptional("account_name")

        /**
         * Address of the creditor.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun address(): Address = address.getRequired("address")

        /**
         * The name of the creditor.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * Returns the raw JSON value of [accountName].
         *
         * Unlike [accountName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("account_name")
        @ExcludeMissing
        fun _accountName(): JsonField<String> = accountName

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
             * Returns a mutable builder for constructing an instance of [Creditor].
             *
             * The following fields are required:
             * ```java
             * .accountName()
             * .address()
             * .name()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Creditor]. */
        class Builder internal constructor() {

            private var accountName: JsonField<String>? = null
            private var address: JsonField<Address>? = null
            private var name: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(creditor: Creditor) = apply {
                accountName = creditor.accountName
                address = creditor.address
                name = creditor.name
                additionalProperties = creditor.additionalProperties.toMutableMap()
            }

            /**
             * The name of the account that would receive the payment, as provided by the creditor.
             */
            fun accountName(accountName: String?) = accountName(JsonField.ofNullable(accountName))

            /** Alias for calling [Builder.accountName] with `accountName.orElse(null)`. */
            fun accountName(accountName: Optional<String>) = accountName(accountName.getOrNull())

            /**
             * Sets [Builder.accountName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun accountName(accountName: JsonField<String>) = apply {
                this.accountName = accountName
            }

            /** Address of the creditor. */
            fun address(address: Address) = address(JsonField.of(address))

            /**
             * Sets [Builder.address] to an arbitrary JSON value.
             *
             * You should usually call [Builder.address] with a well-typed [Address] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun address(address: JsonField<Address>) = apply { this.address = address }

            /** The name of the creditor. */
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
             * Returns an immutable instance of [Creditor].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .accountName()
             * .address()
             * .name()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Creditor =
                Creditor(
                    checkRequired("accountName", accountName),
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
        fun validate(): Creditor = apply {
            if (validated) {
                return@apply
            }

            accountName()
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
            (if (accountName.asKnown().isPresent) 1 else 0) +
                (address.asKnown().getOrNull()?.validity() ?: 0) +
                (if (name.asKnown().isPresent) 1 else 0)

        /** Address of the creditor. */
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

            return other is Creditor &&
                accountName == other.accountName &&
                address == other.address &&
                name == other.name &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(accountName, address, name, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Creditor{accountName=$accountName, address=$address, name=$name, additionalProperties=$additionalProperties}"
    }

    /**
     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code of the requested currency. This
     * will always be "USD" for a Real-Time Payments request for payment.
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

    /**
     * A constant representing the object's type. For this resource it will always be
     * `inbound_real_time_payments_request_for_payment`.
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
            val INBOUND_REAL_TIME_PAYMENTS_REQUEST_FOR_PAYMENT =
                of("inbound_real_time_payments_request_for_payment")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            INBOUND_REAL_TIME_PAYMENTS_REQUEST_FOR_PAYMENT
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
            INBOUND_REAL_TIME_PAYMENTS_REQUEST_FOR_PAYMENT,
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
                INBOUND_REAL_TIME_PAYMENTS_REQUEST_FOR_PAYMENT ->
                    Value.INBOUND_REAL_TIME_PAYMENTS_REQUEST_FOR_PAYMENT
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
                INBOUND_REAL_TIME_PAYMENTS_REQUEST_FOR_PAYMENT ->
                    Known.INBOUND_REAL_TIME_PAYMENTS_REQUEST_FOR_PAYMENT
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

        return other is InboundRealTimePaymentsRequestForPayment &&
            id == other.id &&
            accountId == other.accountId &&
            accountNumberId == other.accountNumberId &&
            amount == other.amount &&
            createdAt == other.createdAt &&
            creditor == other.creditor &&
            creditorAccountNumber == other.creditorAccountNumber &&
            creditorRoutingNumber == other.creditorRoutingNumber &&
            currency == other.currency &&
            debtorName == other.debtorName &&
            endToEndIdentification == other.endToEndIdentification &&
            expiresAt == other.expiresAt &&
            fulfillmentRealTimePaymentsTransferId == other.fulfillmentRealTimePaymentsTransferId &&
            invoicerIdentification == other.invoicerIdentification &&
            paymentInformationIdentification == other.paymentInformationIdentification &&
            requestedExecutionAt == other.requestedExecutionAt &&
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
            createdAt,
            creditor,
            creditorAccountNumber,
            creditorRoutingNumber,
            currency,
            debtorName,
            endToEndIdentification,
            expiresAt,
            fulfillmentRealTimePaymentsTransferId,
            invoicerIdentification,
            paymentInformationIdentification,
            requestedExecutionAt,
            type,
            unstructuredRemittanceInformation,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InboundRealTimePaymentsRequestForPayment{id=$id, accountId=$accountId, accountNumberId=$accountNumberId, amount=$amount, createdAt=$createdAt, creditor=$creditor, creditorAccountNumber=$creditorAccountNumber, creditorRoutingNumber=$creditorRoutingNumber, currency=$currency, debtorName=$debtorName, endToEndIdentification=$endToEndIdentification, expiresAt=$expiresAt, fulfillmentRealTimePaymentsTransferId=$fulfillmentRealTimePaymentsTransferId, invoicerIdentification=$invoicerIdentification, paymentInformationIdentification=$paymentInformationIdentification, requestedExecutionAt=$requestedExecutionAt, type=$type, unstructuredRemittanceInformation=$unstructuredRemittanceInformation, additionalProperties=$additionalProperties}"
}
