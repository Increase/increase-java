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
import com.increase.api.core.checkRequired
import com.increase.api.core.immutableEmptyMap
import com.increase.api.core.toImmutable
import com.increase.api.errors.IncreaseInvalidDataException
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

/**
 * Real-Time Payments transfers move funds, within seconds, between your Increase account and any
 * other account on the Real-Time Payments network. A request for payment is a request to the
 * receiver to send funds to your account. The permitted uses of Requests For Payment are limited by
 * the Real-Time Payments network to business-to-business payments and transfers between two
 * accounts at different banks owned by the same individual. Please contact
 * [support@increase.com](mailto:support@increase.com) to enable this API for your team.
 */
@NoAutoDetect
class RealTimePaymentsRequestForPayment
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("amount") @ExcludeMissing private val amount: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("currency")
    @ExcludeMissing
    private val currency: JsonField<Currency> = JsonMissing.of(),
    @JsonProperty("debtor_name")
    @ExcludeMissing
    private val debtorName: JsonField<String> = JsonMissing.of(),
    @JsonProperty("destination_account_number_id")
    @ExcludeMissing
    private val destinationAccountNumberId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("expires_at")
    @ExcludeMissing
    private val expiresAt: JsonField<LocalDate> = JsonMissing.of(),
    @JsonProperty("fulfillment_transaction_id")
    @ExcludeMissing
    private val fulfillmentTransactionId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("idempotency_key")
    @ExcludeMissing
    private val idempotencyKey: JsonField<String> = JsonMissing.of(),
    @JsonProperty("refusal")
    @ExcludeMissing
    private val refusal: JsonField<Refusal> = JsonMissing.of(),
    @JsonProperty("rejection")
    @ExcludeMissing
    private val rejection: JsonField<Rejection> = JsonMissing.of(),
    @JsonProperty("remittance_information")
    @ExcludeMissing
    private val remittanceInformation: JsonField<String> = JsonMissing.of(),
    @JsonProperty("source_account_number")
    @ExcludeMissing
    private val sourceAccountNumber: JsonField<String> = JsonMissing.of(),
    @JsonProperty("source_routing_number")
    @ExcludeMissing
    private val sourceRoutingNumber: JsonField<String> = JsonMissing.of(),
    @JsonProperty("status")
    @ExcludeMissing
    private val status: JsonField<Status> = JsonMissing.of(),
    @JsonProperty("submission")
    @ExcludeMissing
    private val submission: JsonField<Submission> = JsonMissing.of(),
    @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The Real-Time Payments Request for Payment's identifier. */
    fun id(): String = id.getRequired("id")

    /** The transfer amount in USD cents. */
    fun amount(): Long = amount.getRequired("amount")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the request for
     * payment was created.
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transfer's currency. For
     * real-time payments transfers this is always equal to `USD`.
     */
    fun currency(): Currency = currency.getRequired("currency")

    /** The name of the recipient the sender is requesting a transfer from. */
    fun debtorName(): String = debtorName.getRequired("debtor_name")

    /** The Account Number in which a successful transfer will arrive. */
    fun destinationAccountNumberId(): String =
        destinationAccountNumberId.getRequired("destination_account_number_id")

    /**
     * The expiration time for this request, in UTC. The requestee will not be able to pay after
     * this date.
     */
    fun expiresAt(): LocalDate = expiresAt.getRequired("expires_at")

    /** The transaction that fulfilled this request. */
    fun fulfillmentTransactionId(): Optional<String> =
        Optional.ofNullable(fulfillmentTransactionId.getNullable("fulfillment_transaction_id"))

    /**
     * The idempotency key you chose for this object. This value is unique across Increase and is
     * used to ensure that a request is only processed once. Learn more about
     * [idempotency](https://increase.com/documentation/idempotency-keys).
     */
    fun idempotencyKey(): Optional<String> =
        Optional.ofNullable(idempotencyKey.getNullable("idempotency_key"))

    /**
     * If the request for payment is refused by the destination financial institution or the
     * receiving customer, this will contain supplemental details.
     */
    fun refusal(): Optional<Refusal> = Optional.ofNullable(refusal.getNullable("refusal"))

    /**
     * If the request for payment is rejected by Real-Time Payments or the destination financial
     * institution, this will contain supplemental details.
     */
    fun rejection(): Optional<Rejection> = Optional.ofNullable(rejection.getNullable("rejection"))

    /** Unstructured information that will show on the recipient's bank statement. */
    fun remittanceInformation(): String =
        remittanceInformation.getRequired("remittance_information")

    /** The account number the request is sent to. */
    fun sourceAccountNumber(): String = sourceAccountNumber.getRequired("source_account_number")

    /** The receiver's American Bankers' Association (ABA) Routing Transit Number (RTN). */
    fun sourceRoutingNumber(): String = sourceRoutingNumber.getRequired("source_routing_number")

    /** The lifecycle status of the request for payment. */
    fun status(): Status = status.getRequired("status")

    /**
     * After the request for payment is submitted to Real-Time Payments, this will contain
     * supplemental details.
     */
    fun submission(): Optional<Submission> =
        Optional.ofNullable(submission.getNullable("submission"))

    /**
     * A constant representing the object's type. For this resource it will always be
     * `real_time_payments_request_for_payment`.
     */
    fun type(): Type = type.getRequired("type")

    /** The Real-Time Payments Request for Payment's identifier. */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /** The transfer amount in USD cents. */
    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the request for
     * payment was created.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transfer's currency. For
     * real-time payments transfers this is always equal to `USD`.
     */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<Currency> = currency

    /** The name of the recipient the sender is requesting a transfer from. */
    @JsonProperty("debtor_name") @ExcludeMissing fun _debtorName(): JsonField<String> = debtorName

    /** The Account Number in which a successful transfer will arrive. */
    @JsonProperty("destination_account_number_id")
    @ExcludeMissing
    fun _destinationAccountNumberId(): JsonField<String> = destinationAccountNumberId

    /**
     * The expiration time for this request, in UTC. The requestee will not be able to pay after
     * this date.
     */
    @JsonProperty("expires_at") @ExcludeMissing fun _expiresAt(): JsonField<LocalDate> = expiresAt

    /** The transaction that fulfilled this request. */
    @JsonProperty("fulfillment_transaction_id")
    @ExcludeMissing
    fun _fulfillmentTransactionId(): JsonField<String> = fulfillmentTransactionId

    /**
     * The idempotency key you chose for this object. This value is unique across Increase and is
     * used to ensure that a request is only processed once. Learn more about
     * [idempotency](https://increase.com/documentation/idempotency-keys).
     */
    @JsonProperty("idempotency_key")
    @ExcludeMissing
    fun _idempotencyKey(): JsonField<String> = idempotencyKey

    /**
     * If the request for payment is refused by the destination financial institution or the
     * receiving customer, this will contain supplemental details.
     */
    @JsonProperty("refusal") @ExcludeMissing fun _refusal(): JsonField<Refusal> = refusal

    /**
     * If the request for payment is rejected by Real-Time Payments or the destination financial
     * institution, this will contain supplemental details.
     */
    @JsonProperty("rejection") @ExcludeMissing fun _rejection(): JsonField<Rejection> = rejection

    /** Unstructured information that will show on the recipient's bank statement. */
    @JsonProperty("remittance_information")
    @ExcludeMissing
    fun _remittanceInformation(): JsonField<String> = remittanceInformation

    /** The account number the request is sent to. */
    @JsonProperty("source_account_number")
    @ExcludeMissing
    fun _sourceAccountNumber(): JsonField<String> = sourceAccountNumber

    /** The receiver's American Bankers' Association (ABA) Routing Transit Number (RTN). */
    @JsonProperty("source_routing_number")
    @ExcludeMissing
    fun _sourceRoutingNumber(): JsonField<String> = sourceRoutingNumber

    /** The lifecycle status of the request for payment. */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * After the request for payment is submitted to Real-Time Payments, this will contain
     * supplemental details.
     */
    @JsonProperty("submission")
    @ExcludeMissing
    fun _submission(): JsonField<Submission> = submission

    /**
     * A constant representing the object's type. For this resource it will always be
     * `real_time_payments_request_for_payment`.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): RealTimePaymentsRequestForPayment = apply {
        if (validated) {
            return@apply
        }

        id()
        amount()
        createdAt()
        currency()
        debtorName()
        destinationAccountNumberId()
        expiresAt()
        fulfillmentTransactionId()
        idempotencyKey()
        refusal().ifPresent { it.validate() }
        rejection().ifPresent { it.validate() }
        remittanceInformation()
        sourceAccountNumber()
        sourceRoutingNumber()
        status()
        submission().ifPresent { it.validate() }
        type()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [RealTimePaymentsRequestForPayment].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .amount()
         * .createdAt()
         * .currency()
         * .debtorName()
         * .destinationAccountNumberId()
         * .expiresAt()
         * .fulfillmentTransactionId()
         * .idempotencyKey()
         * .refusal()
         * .rejection()
         * .remittanceInformation()
         * .sourceAccountNumber()
         * .sourceRoutingNumber()
         * .status()
         * .submission()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RealTimePaymentsRequestForPayment]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var amount: JsonField<Long>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var currency: JsonField<Currency>? = null
        private var debtorName: JsonField<String>? = null
        private var destinationAccountNumberId: JsonField<String>? = null
        private var expiresAt: JsonField<LocalDate>? = null
        private var fulfillmentTransactionId: JsonField<String>? = null
        private var idempotencyKey: JsonField<String>? = null
        private var refusal: JsonField<Refusal>? = null
        private var rejection: JsonField<Rejection>? = null
        private var remittanceInformation: JsonField<String>? = null
        private var sourceAccountNumber: JsonField<String>? = null
        private var sourceRoutingNumber: JsonField<String>? = null
        private var status: JsonField<Status>? = null
        private var submission: JsonField<Submission>? = null
        private var type: JsonField<Type>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(realTimePaymentsRequestForPayment: RealTimePaymentsRequestForPayment) =
            apply {
                id = realTimePaymentsRequestForPayment.id
                amount = realTimePaymentsRequestForPayment.amount
                createdAt = realTimePaymentsRequestForPayment.createdAt
                currency = realTimePaymentsRequestForPayment.currency
                debtorName = realTimePaymentsRequestForPayment.debtorName
                destinationAccountNumberId =
                    realTimePaymentsRequestForPayment.destinationAccountNumberId
                expiresAt = realTimePaymentsRequestForPayment.expiresAt
                fulfillmentTransactionId =
                    realTimePaymentsRequestForPayment.fulfillmentTransactionId
                idempotencyKey = realTimePaymentsRequestForPayment.idempotencyKey
                refusal = realTimePaymentsRequestForPayment.refusal
                rejection = realTimePaymentsRequestForPayment.rejection
                remittanceInformation = realTimePaymentsRequestForPayment.remittanceInformation
                sourceAccountNumber = realTimePaymentsRequestForPayment.sourceAccountNumber
                sourceRoutingNumber = realTimePaymentsRequestForPayment.sourceRoutingNumber
                status = realTimePaymentsRequestForPayment.status
                submission = realTimePaymentsRequestForPayment.submission
                type = realTimePaymentsRequestForPayment.type
                additionalProperties =
                    realTimePaymentsRequestForPayment.additionalProperties.toMutableMap()
            }

        /** The Real-Time Payments Request for Payment's identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The Real-Time Payments Request for Payment's identifier. */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The transfer amount in USD cents. */
        fun amount(amount: Long) = amount(JsonField.of(amount))

        /** The transfer amount in USD cents. */
        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the request
         * for payment was created.
         */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the request
         * for payment was created.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transfer's currency.
         * For real-time payments transfers this is always equal to `USD`.
         */
        fun currency(currency: Currency) = currency(JsonField.of(currency))

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transfer's currency.
         * For real-time payments transfers this is always equal to `USD`.
         */
        fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

        /** The name of the recipient the sender is requesting a transfer from. */
        fun debtorName(debtorName: String) = debtorName(JsonField.of(debtorName))

        /** The name of the recipient the sender is requesting a transfer from. */
        fun debtorName(debtorName: JsonField<String>) = apply { this.debtorName = debtorName }

        /** The Account Number in which a successful transfer will arrive. */
        fun destinationAccountNumberId(destinationAccountNumberId: String) =
            destinationAccountNumberId(JsonField.of(destinationAccountNumberId))

        /** The Account Number in which a successful transfer will arrive. */
        fun destinationAccountNumberId(destinationAccountNumberId: JsonField<String>) = apply {
            this.destinationAccountNumberId = destinationAccountNumberId
        }

        /**
         * The expiration time for this request, in UTC. The requestee will not be able to pay after
         * this date.
         */
        fun expiresAt(expiresAt: LocalDate) = expiresAt(JsonField.of(expiresAt))

        /**
         * The expiration time for this request, in UTC. The requestee will not be able to pay after
         * this date.
         */
        fun expiresAt(expiresAt: JsonField<LocalDate>) = apply { this.expiresAt = expiresAt }

        /** The transaction that fulfilled this request. */
        fun fulfillmentTransactionId(fulfillmentTransactionId: String?) =
            fulfillmentTransactionId(JsonField.ofNullable(fulfillmentTransactionId))

        /** The transaction that fulfilled this request. */
        fun fulfillmentTransactionId(fulfillmentTransactionId: Optional<String>) =
            fulfillmentTransactionId(fulfillmentTransactionId.orElse(null))

        /** The transaction that fulfilled this request. */
        fun fulfillmentTransactionId(fulfillmentTransactionId: JsonField<String>) = apply {
            this.fulfillmentTransactionId = fulfillmentTransactionId
        }

        /**
         * The idempotency key you chose for this object. This value is unique across Increase and
         * is used to ensure that a request is only processed once. Learn more about
         * [idempotency](https://increase.com/documentation/idempotency-keys).
         */
        fun idempotencyKey(idempotencyKey: String?) =
            idempotencyKey(JsonField.ofNullable(idempotencyKey))

        /**
         * The idempotency key you chose for this object. This value is unique across Increase and
         * is used to ensure that a request is only processed once. Learn more about
         * [idempotency](https://increase.com/documentation/idempotency-keys).
         */
        fun idempotencyKey(idempotencyKey: Optional<String>) =
            idempotencyKey(idempotencyKey.orElse(null))

        /**
         * The idempotency key you chose for this object. This value is unique across Increase and
         * is used to ensure that a request is only processed once. Learn more about
         * [idempotency](https://increase.com/documentation/idempotency-keys).
         */
        fun idempotencyKey(idempotencyKey: JsonField<String>) = apply {
            this.idempotencyKey = idempotencyKey
        }

        /**
         * If the request for payment is refused by the destination financial institution or the
         * receiving customer, this will contain supplemental details.
         */
        fun refusal(refusal: Refusal?) = refusal(JsonField.ofNullable(refusal))

        /**
         * If the request for payment is refused by the destination financial institution or the
         * receiving customer, this will contain supplemental details.
         */
        fun refusal(refusal: Optional<Refusal>) = refusal(refusal.orElse(null))

        /**
         * If the request for payment is refused by the destination financial institution or the
         * receiving customer, this will contain supplemental details.
         */
        fun refusal(refusal: JsonField<Refusal>) = apply { this.refusal = refusal }

        /**
         * If the request for payment is rejected by Real-Time Payments or the destination financial
         * institution, this will contain supplemental details.
         */
        fun rejection(rejection: Rejection?) = rejection(JsonField.ofNullable(rejection))

        /**
         * If the request for payment is rejected by Real-Time Payments or the destination financial
         * institution, this will contain supplemental details.
         */
        fun rejection(rejection: Optional<Rejection>) = rejection(rejection.orElse(null))

        /**
         * If the request for payment is rejected by Real-Time Payments or the destination financial
         * institution, this will contain supplemental details.
         */
        fun rejection(rejection: JsonField<Rejection>) = apply { this.rejection = rejection }

        /** Unstructured information that will show on the recipient's bank statement. */
        fun remittanceInformation(remittanceInformation: String) =
            remittanceInformation(JsonField.of(remittanceInformation))

        /** Unstructured information that will show on the recipient's bank statement. */
        fun remittanceInformation(remittanceInformation: JsonField<String>) = apply {
            this.remittanceInformation = remittanceInformation
        }

        /** The account number the request is sent to. */
        fun sourceAccountNumber(sourceAccountNumber: String) =
            sourceAccountNumber(JsonField.of(sourceAccountNumber))

        /** The account number the request is sent to. */
        fun sourceAccountNumber(sourceAccountNumber: JsonField<String>) = apply {
            this.sourceAccountNumber = sourceAccountNumber
        }

        /** The receiver's American Bankers' Association (ABA) Routing Transit Number (RTN). */
        fun sourceRoutingNumber(sourceRoutingNumber: String) =
            sourceRoutingNumber(JsonField.of(sourceRoutingNumber))

        /** The receiver's American Bankers' Association (ABA) Routing Transit Number (RTN). */
        fun sourceRoutingNumber(sourceRoutingNumber: JsonField<String>) = apply {
            this.sourceRoutingNumber = sourceRoutingNumber
        }

        /** The lifecycle status of the request for payment. */
        fun status(status: Status) = status(JsonField.of(status))

        /** The lifecycle status of the request for payment. */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /**
         * After the request for payment is submitted to Real-Time Payments, this will contain
         * supplemental details.
         */
        fun submission(submission: Submission?) = submission(JsonField.ofNullable(submission))

        /**
         * After the request for payment is submitted to Real-Time Payments, this will contain
         * supplemental details.
         */
        fun submission(submission: Optional<Submission>) = submission(submission.orElse(null))

        /**
         * After the request for payment is submitted to Real-Time Payments, this will contain
         * supplemental details.
         */
        fun submission(submission: JsonField<Submission>) = apply { this.submission = submission }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `real_time_payments_request_for_payment`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * A constant representing the object's type. For this resource it will always be
         * `real_time_payments_request_for_payment`.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

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

        fun build(): RealTimePaymentsRequestForPayment =
            RealTimePaymentsRequestForPayment(
                checkRequired("id", id),
                checkRequired("amount", amount),
                checkRequired("createdAt", createdAt),
                checkRequired("currency", currency),
                checkRequired("debtorName", debtorName),
                checkRequired("destinationAccountNumberId", destinationAccountNumberId),
                checkRequired("expiresAt", expiresAt),
                checkRequired("fulfillmentTransactionId", fulfillmentTransactionId),
                checkRequired("idempotencyKey", idempotencyKey),
                checkRequired("refusal", refusal),
                checkRequired("rejection", rejection),
                checkRequired("remittanceInformation", remittanceInformation),
                checkRequired("sourceAccountNumber", sourceAccountNumber),
                checkRequired("sourceRoutingNumber", sourceRoutingNumber),
                checkRequired("status", status),
                checkRequired("submission", submission),
                checkRequired("type", type),
                additionalProperties.toImmutable(),
            )
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

            /** Canadian Dollar (CAD) */
            @JvmField val CAD = of("CAD")

            /** Swiss Franc (CHF) */
            @JvmField val CHF = of("CHF")

            /** Euro (EUR) */
            @JvmField val EUR = of("EUR")

            /** British Pound (GBP) */
            @JvmField val GBP = of("GBP")

            /** Japanese Yen (JPY) */
            @JvmField val JPY = of("JPY")

            /** US Dollar (USD) */
            @JvmField val USD = of("USD")

            @JvmStatic fun of(value: String) = Currency(JsonField.of(value))
        }

        /** An enum containing [Currency]'s known values. */
        enum class Known {
            /** Canadian Dollar (CAD) */
            CAD,
            /** Swiss Franc (CHF) */
            CHF,
            /** Euro (EUR) */
            EUR,
            /** British Pound (GBP) */
            GBP,
            /** Japanese Yen (JPY) */
            JPY,
            /** US Dollar (USD) */
            USD,
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
            /** Canadian Dollar (CAD) */
            CAD,
            /** Swiss Franc (CHF) */
            CHF,
            /** Euro (EUR) */
            EUR,
            /** British Pound (GBP) */
            GBP,
            /** Japanese Yen (JPY) */
            JPY,
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
                CAD -> Value.CAD
                CHF -> Value.CHF
                EUR -> Value.EUR
                GBP -> Value.GBP
                JPY -> Value.JPY
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
                CAD -> Known.CAD
                CHF -> Known.CHF
                EUR -> Known.EUR
                GBP -> Known.GBP
                JPY -> Known.JPY
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Currency && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * If the request for payment is refused by the destination financial institution or the
     * receiving customer, this will contain supplemental details.
     */
    @NoAutoDetect
    class Refusal
    @JsonCreator
    private constructor(
        @JsonProperty("refusal_reason_code")
        @ExcludeMissing
        private val refusalReasonCode: JsonField<RefusalReasonCode> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * The reason the request for payment was refused as provided by the recipient bank or the
         * customer.
         */
        fun refusalReasonCode(): RefusalReasonCode =
            refusalReasonCode.getRequired("refusal_reason_code")

        /**
         * The reason the request for payment was refused as provided by the recipient bank or the
         * customer.
         */
        @JsonProperty("refusal_reason_code")
        @ExcludeMissing
        fun _refusalReasonCode(): JsonField<RefusalReasonCode> = refusalReasonCode

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Refusal = apply {
            if (validated) {
                return@apply
            }

            refusalReasonCode()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Refusal].
             *
             * The following fields are required:
             * ```java
             * .refusalReasonCode()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Refusal]. */
        class Builder internal constructor() {

            private var refusalReasonCode: JsonField<RefusalReasonCode>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(refusal: Refusal) = apply {
                refusalReasonCode = refusal.refusalReasonCode
                additionalProperties = refusal.additionalProperties.toMutableMap()
            }

            /**
             * The reason the request for payment was refused as provided by the recipient bank or
             * the customer.
             */
            fun refusalReasonCode(refusalReasonCode: RefusalReasonCode) =
                refusalReasonCode(JsonField.of(refusalReasonCode))

            /**
             * The reason the request for payment was refused as provided by the recipient bank or
             * the customer.
             */
            fun refusalReasonCode(refusalReasonCode: JsonField<RefusalReasonCode>) = apply {
                this.refusalReasonCode = refusalReasonCode
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

            fun build(): Refusal =
                Refusal(
                    checkRequired("refusalReasonCode", refusalReasonCode),
                    additionalProperties.toImmutable(),
                )
        }

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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is RefusalReasonCode && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Refusal && refusalReasonCode == other.refusalReasonCode && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(refusalReasonCode, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Refusal{refusalReasonCode=$refusalReasonCode, additionalProperties=$additionalProperties}"
    }

    /**
     * If the request for payment is rejected by Real-Time Payments or the destination financial
     * institution, this will contain supplemental details.
     */
    @NoAutoDetect
    class Rejection
    @JsonCreator
    private constructor(
        @JsonProperty("reject_reason_code")
        @ExcludeMissing
        private val rejectReasonCode: JsonField<RejectReasonCode> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * The reason the request for payment was rejected as provided by the recipient bank or the
         * Real-Time Payments network.
         */
        fun rejectReasonCode(): RejectReasonCode =
            rejectReasonCode.getRequired("reject_reason_code")

        /**
         * The reason the request for payment was rejected as provided by the recipient bank or the
         * Real-Time Payments network.
         */
        @JsonProperty("reject_reason_code")
        @ExcludeMissing
        fun _rejectReasonCode(): JsonField<RejectReasonCode> = rejectReasonCode

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Rejection = apply {
            if (validated) {
                return@apply
            }

            rejectReasonCode()
            validated = true
        }

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

            /**
             * The reason the request for payment was rejected as provided by the recipient bank or
             * the Real-Time Payments network.
             */
            fun rejectReasonCode(rejectReasonCode: RejectReasonCode) =
                rejectReasonCode(JsonField.of(rejectReasonCode))

            /**
             * The reason the request for payment was rejected as provided by the recipient bank or
             * the Real-Time Payments network.
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

            fun build(): Rejection =
                Rejection(
                    checkRequired("rejectReasonCode", rejectReasonCode),
                    additionalProperties.toImmutable(),
                )
        }

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
                 * code `AC04`.
                 */
                @JvmField val ACCOUNT_CLOSED = of("account_closed")

                /**
                 * The destination account is currently blocked from receiving transactions.
                 * Corresponds to the Real-Time Payments reason code `AC06`.
                 */
                @JvmField val ACCOUNT_BLOCKED = of("account_blocked")

                /**
                 * The destination account is ineligible to receive Real-Time Payments transfers.
                 * Corresponds to the Real-Time Payments reason code `AC14`.
                 */
                @JvmField val INVALID_CREDITOR_ACCOUNT_TYPE = of("invalid_creditor_account_type")

                /**
                 * The destination account does not exist. Corresponds to the Real-Time Payments
                 * reason code `AC03`.
                 */
                @JvmField
                val INVALID_CREDITOR_ACCOUNT_NUMBER = of("invalid_creditor_account_number")

                /**
                 * The destination routing number is invalid. Corresponds to the Real-Time Payments
                 * reason code `RC04`.
                 */
                @JvmField
                val INVALID_CREDITOR_FINANCIAL_INSTITUTION_IDENTIFIER =
                    of("invalid_creditor_financial_institution_identifier")

                /**
                 * The destination account holder is deceased. Corresponds to the Real-Time Payments
                 * reason code `MD07`.
                 */
                @JvmField val END_CUSTOMER_DECEASED = of("end_customer_deceased")

                /**
                 * The reason is provided as narrative information in the additional information
                 * field.
                 */
                @JvmField val NARRATIVE = of("narrative")

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
                 * The creditor's address is required, but missing or invalid. Corresponds to the
                 * Real-Time Payments reason code `BE04`.
                 */
                @JvmField val INVALID_CREDITOR_ADDRESS = of("invalid_creditor_address")

                /**
                 * The specified creditor is unknown. Corresponds to the Real-Time Payments reason
                 * code `BE06`.
                 */
                @JvmField val UNKNOWN_END_CUSTOMER = of("unknown_end_customer")

                /**
                 * The debtor's address is required, but missing or invalid. Corresponds to the
                 * Real-Time Payments reason code `BE07`.
                 */
                @JvmField val INVALID_DEBTOR_ADDRESS = of("invalid_debtor_address")

                /**
                 * There was a timeout processing the transfer. Corresponds to the Real-Time
                 * Payments reason code `DS24`.
                 */
                @JvmField val TIMEOUT = of("timeout")

                /**
                 * Real-Time Payments transfers are not enabled for the destination account.
                 * Corresponds to the Real-Time Payments reason code `NOAT`.
                 */
                @JvmField
                val UNSUPPORTED_MESSAGE_FOR_RECIPIENT = of("unsupported_message_for_recipient")

                /**
                 * The destination financial institution is currently not connected to Real-Time
                 * Payments. Corresponds to the Real-Time Payments reason code `9912`.
                 */
                @JvmField
                val RECIPIENT_CONNECTION_NOT_AVAILABLE = of("recipient_connection_not_available")

                /**
                 * Real-Time Payments is currently unavailable. Corresponds to the Real-Time
                 * Payments reason code `9948`.
                 */
                @JvmField val REAL_TIME_PAYMENTS_SUSPENDED = of("real_time_payments_suspended")

                /**
                 * The destination financial institution is currently signed off of Real-Time
                 * Payments. Corresponds to the Real-Time Payments reason code `9910`.
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
                 * code `AC04`.
                 */
                ACCOUNT_CLOSED,
                /**
                 * The destination account is currently blocked from receiving transactions.
                 * Corresponds to the Real-Time Payments reason code `AC06`.
                 */
                ACCOUNT_BLOCKED,
                /**
                 * The destination account is ineligible to receive Real-Time Payments transfers.
                 * Corresponds to the Real-Time Payments reason code `AC14`.
                 */
                INVALID_CREDITOR_ACCOUNT_TYPE,
                /**
                 * The destination account does not exist. Corresponds to the Real-Time Payments
                 * reason code `AC03`.
                 */
                INVALID_CREDITOR_ACCOUNT_NUMBER,
                /**
                 * The destination routing number is invalid. Corresponds to the Real-Time Payments
                 * reason code `RC04`.
                 */
                INVALID_CREDITOR_FINANCIAL_INSTITUTION_IDENTIFIER,
                /**
                 * The destination account holder is deceased. Corresponds to the Real-Time Payments
                 * reason code `MD07`.
                 */
                END_CUSTOMER_DECEASED,
                /**
                 * The reason is provided as narrative information in the additional information
                 * field.
                 */
                NARRATIVE,
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
                 * The creditor's address is required, but missing or invalid. Corresponds to the
                 * Real-Time Payments reason code `BE04`.
                 */
                INVALID_CREDITOR_ADDRESS,
                /**
                 * The specified creditor is unknown. Corresponds to the Real-Time Payments reason
                 * code `BE06`.
                 */
                UNKNOWN_END_CUSTOMER,
                /**
                 * The debtor's address is required, but missing or invalid. Corresponds to the
                 * Real-Time Payments reason code `BE07`.
                 */
                INVALID_DEBTOR_ADDRESS,
                /**
                 * There was a timeout processing the transfer. Corresponds to the Real-Time
                 * Payments reason code `DS24`.
                 */
                TIMEOUT,
                /**
                 * Real-Time Payments transfers are not enabled for the destination account.
                 * Corresponds to the Real-Time Payments reason code `NOAT`.
                 */
                UNSUPPORTED_MESSAGE_FOR_RECIPIENT,
                /**
                 * The destination financial institution is currently not connected to Real-Time
                 * Payments. Corresponds to the Real-Time Payments reason code `9912`.
                 */
                RECIPIENT_CONNECTION_NOT_AVAILABLE,
                /**
                 * Real-Time Payments is currently unavailable. Corresponds to the Real-Time
                 * Payments reason code `9948`.
                 */
                REAL_TIME_PAYMENTS_SUSPENDED,
                /**
                 * The destination financial institution is currently signed off of Real-Time
                 * Payments. Corresponds to the Real-Time Payments reason code `9910`.
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
                 * code `AC04`.
                 */
                ACCOUNT_CLOSED,
                /**
                 * The destination account is currently blocked from receiving transactions.
                 * Corresponds to the Real-Time Payments reason code `AC06`.
                 */
                ACCOUNT_BLOCKED,
                /**
                 * The destination account is ineligible to receive Real-Time Payments transfers.
                 * Corresponds to the Real-Time Payments reason code `AC14`.
                 */
                INVALID_CREDITOR_ACCOUNT_TYPE,
                /**
                 * The destination account does not exist. Corresponds to the Real-Time Payments
                 * reason code `AC03`.
                 */
                INVALID_CREDITOR_ACCOUNT_NUMBER,
                /**
                 * The destination routing number is invalid. Corresponds to the Real-Time Payments
                 * reason code `RC04`.
                 */
                INVALID_CREDITOR_FINANCIAL_INSTITUTION_IDENTIFIER,
                /**
                 * The destination account holder is deceased. Corresponds to the Real-Time Payments
                 * reason code `MD07`.
                 */
                END_CUSTOMER_DECEASED,
                /**
                 * The reason is provided as narrative information in the additional information
                 * field.
                 */
                NARRATIVE,
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
                 * The creditor's address is required, but missing or invalid. Corresponds to the
                 * Real-Time Payments reason code `BE04`.
                 */
                INVALID_CREDITOR_ADDRESS,
                /**
                 * The specified creditor is unknown. Corresponds to the Real-Time Payments reason
                 * code `BE06`.
                 */
                UNKNOWN_END_CUSTOMER,
                /**
                 * The debtor's address is required, but missing or invalid. Corresponds to the
                 * Real-Time Payments reason code `BE07`.
                 */
                INVALID_DEBTOR_ADDRESS,
                /**
                 * There was a timeout processing the transfer. Corresponds to the Real-Time
                 * Payments reason code `DS24`.
                 */
                TIMEOUT,
                /**
                 * Real-Time Payments transfers are not enabled for the destination account.
                 * Corresponds to the Real-Time Payments reason code `NOAT`.
                 */
                UNSUPPORTED_MESSAGE_FOR_RECIPIENT,
                /**
                 * The destination financial institution is currently not connected to Real-Time
                 * Payments. Corresponds to the Real-Time Payments reason code `9912`.
                 */
                RECIPIENT_CONNECTION_NOT_AVAILABLE,
                /**
                 * Real-Time Payments is currently unavailable. Corresponds to the Real-Time
                 * Payments reason code `9948`.
                 */
                REAL_TIME_PAYMENTS_SUSPENDED,
                /**
                 * The destination financial institution is currently signed off of Real-Time
                 * Payments. Corresponds to the Real-Time Payments reason code `9910`.
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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is RejectReasonCode && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Rejection && rejectReasonCode == other.rejectReasonCode && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(rejectReasonCode, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Rejection{rejectReasonCode=$rejectReasonCode, additionalProperties=$additionalProperties}"
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Status && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * After the request for payment is submitted to Real-Time Payments, this will contain
     * supplemental details.
     */
    @NoAutoDetect
    class Submission
    @JsonCreator
    private constructor(
        @JsonProperty("payment_information_identification")
        @ExcludeMissing
        private val paymentInformationIdentification: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The Real-Time Payments payment information identification of the request. */
        fun paymentInformationIdentification(): String =
            paymentInformationIdentification.getRequired("payment_information_identification")

        /** The Real-Time Payments payment information identification of the request. */
        @JsonProperty("payment_information_identification")
        @ExcludeMissing
        fun _paymentInformationIdentification(): JsonField<String> =
            paymentInformationIdentification

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Submission = apply {
            if (validated) {
                return@apply
            }

            paymentInformationIdentification()
            validated = true
        }

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

            /** The Real-Time Payments payment information identification of the request. */
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

            fun build(): Submission =
                Submission(
                    checkRequired(
                        "paymentInformationIdentification",
                        paymentInformationIdentification,
                    ),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Submission && paymentInformationIdentification == other.paymentInformationIdentification && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(paymentInformationIdentification, additionalProperties) }
        /* spotless:on */

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Type && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is RealTimePaymentsRequestForPayment && id == other.id && amount == other.amount && createdAt == other.createdAt && currency == other.currency && debtorName == other.debtorName && destinationAccountNumberId == other.destinationAccountNumberId && expiresAt == other.expiresAt && fulfillmentTransactionId == other.fulfillmentTransactionId && idempotencyKey == other.idempotencyKey && refusal == other.refusal && rejection == other.rejection && remittanceInformation == other.remittanceInformation && sourceAccountNumber == other.sourceAccountNumber && sourceRoutingNumber == other.sourceRoutingNumber && status == other.status && submission == other.submission && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, amount, createdAt, currency, debtorName, destinationAccountNumberId, expiresAt, fulfillmentTransactionId, idempotencyKey, refusal, rejection, remittanceInformation, sourceAccountNumber, sourceRoutingNumber, status, submission, type, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RealTimePaymentsRequestForPayment{id=$id, amount=$amount, createdAt=$createdAt, currency=$currency, debtorName=$debtorName, destinationAccountNumberId=$destinationAccountNumberId, expiresAt=$expiresAt, fulfillmentTransactionId=$fulfillmentTransactionId, idempotencyKey=$idempotencyKey, refusal=$refusal, rejection=$rejection, remittanceInformation=$remittanceInformation, sourceAccountNumber=$sourceAccountNumber, sourceRoutingNumber=$sourceRoutingNumber, status=$status, submission=$submission, type=$type, additionalProperties=$additionalProperties}"
}
