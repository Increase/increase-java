// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.wiredrawdownrequests

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
 * Wire drawdown requests enable you to request that someone else send you a wire. This feature is
 * in beta; reach out to [support@increase.com](mailto:support@increase.com) to learn more.
 */
class WireDrawdownRequest
private constructor(
    private val id: JsonField<String>,
    private val accountNumberId: JsonField<String>,
    private val amount: JsonField<Long>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val currency: JsonField<String>,
    private val fulfillmentInboundWireTransferId: JsonField<String>,
    private val idempotencyKey: JsonField<String>,
    private val messageToRecipient: JsonField<String>,
    private val originatorAddressLine1: JsonField<String>,
    private val originatorAddressLine2: JsonField<String>,
    private val originatorAddressLine3: JsonField<String>,
    private val originatorName: JsonField<String>,
    private val recipientAccountNumber: JsonField<String>,
    private val recipientAddressLine1: JsonField<String>,
    private val recipientAddressLine2: JsonField<String>,
    private val recipientAddressLine3: JsonField<String>,
    private val recipientName: JsonField<String>,
    private val recipientRoutingNumber: JsonField<String>,
    private val status: JsonField<Status>,
    private val submission: JsonField<Submission>,
    private val type: JsonField<Type>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("account_number_id")
        @ExcludeMissing
        accountNumberId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("currency") @ExcludeMissing currency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("fulfillment_inbound_wire_transfer_id")
        @ExcludeMissing
        fulfillmentInboundWireTransferId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("idempotency_key")
        @ExcludeMissing
        idempotencyKey: JsonField<String> = JsonMissing.of(),
        @JsonProperty("message_to_recipient")
        @ExcludeMissing
        messageToRecipient: JsonField<String> = JsonMissing.of(),
        @JsonProperty("originator_address_line1")
        @ExcludeMissing
        originatorAddressLine1: JsonField<String> = JsonMissing.of(),
        @JsonProperty("originator_address_line2")
        @ExcludeMissing
        originatorAddressLine2: JsonField<String> = JsonMissing.of(),
        @JsonProperty("originator_address_line3")
        @ExcludeMissing
        originatorAddressLine3: JsonField<String> = JsonMissing.of(),
        @JsonProperty("originator_name")
        @ExcludeMissing
        originatorName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("recipient_account_number")
        @ExcludeMissing
        recipientAccountNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("recipient_address_line1")
        @ExcludeMissing
        recipientAddressLine1: JsonField<String> = JsonMissing.of(),
        @JsonProperty("recipient_address_line2")
        @ExcludeMissing
        recipientAddressLine2: JsonField<String> = JsonMissing.of(),
        @JsonProperty("recipient_address_line3")
        @ExcludeMissing
        recipientAddressLine3: JsonField<String> = JsonMissing.of(),
        @JsonProperty("recipient_name")
        @ExcludeMissing
        recipientName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("recipient_routing_number")
        @ExcludeMissing
        recipientRoutingNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("submission")
        @ExcludeMissing
        submission: JsonField<Submission> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
    ) : this(
        id,
        accountNumberId,
        amount,
        createdAt,
        currency,
        fulfillmentInboundWireTransferId,
        idempotencyKey,
        messageToRecipient,
        originatorAddressLine1,
        originatorAddressLine2,
        originatorAddressLine3,
        originatorName,
        recipientAccountNumber,
        recipientAddressLine1,
        recipientAddressLine2,
        recipientAddressLine3,
        recipientName,
        recipientRoutingNumber,
        status,
        submission,
        type,
        mutableMapOf(),
    )

    /**
     * The Wire drawdown request identifier.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * The Account Number to which the recipient of this request is being requested to send funds.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountNumberId(): String = accountNumberId.getRequired("account_number_id")

    /**
     * The amount being requested in cents.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun amount(): Long = amount.getRequired("amount")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the wire
     * drawdown request was created.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the amount being requested.
     * Will always be "USD".
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun currency(): String = currency.getRequired("currency")

    /**
     * If the recipient fulfills the drawdown request by sending funds, then this will be the
     * identifier of the corresponding Transaction.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fulfillmentInboundWireTransferId(): Optional<String> =
        Optional.ofNullable(
            fulfillmentInboundWireTransferId.getNullable("fulfillment_inbound_wire_transfer_id")
        )

    /**
     * The idempotency key you chose for this object. This value is unique across Increase and is
     * used to ensure that a request is only processed once. Learn more about
     * [idempotency](https://increase.com/documentation/idempotency-keys).
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun idempotencyKey(): Optional<String> =
        Optional.ofNullable(idempotencyKey.getNullable("idempotency_key"))

    /**
     * The message the recipient will see as part of the drawdown request.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun messageToRecipient(): String = messageToRecipient.getRequired("message_to_recipient")

    /**
     * The originator's address line 1.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun originatorAddressLine1(): Optional<String> =
        Optional.ofNullable(originatorAddressLine1.getNullable("originator_address_line1"))

    /**
     * The originator's address line 2.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun originatorAddressLine2(): Optional<String> =
        Optional.ofNullable(originatorAddressLine2.getNullable("originator_address_line2"))

    /**
     * The originator's address line 3.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun originatorAddressLine3(): Optional<String> =
        Optional.ofNullable(originatorAddressLine3.getNullable("originator_address_line3"))

    /**
     * The originator's name.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun originatorName(): Optional<String> =
        Optional.ofNullable(originatorName.getNullable("originator_name"))

    /**
     * The drawdown request's recipient's account number.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun recipientAccountNumber(): String =
        recipientAccountNumber.getRequired("recipient_account_number")

    /**
     * Line 1 of the drawdown request's recipient's address.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recipientAddressLine1(): Optional<String> =
        Optional.ofNullable(recipientAddressLine1.getNullable("recipient_address_line1"))

    /**
     * Line 2 of the drawdown request's recipient's address.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recipientAddressLine2(): Optional<String> =
        Optional.ofNullable(recipientAddressLine2.getNullable("recipient_address_line2"))

    /**
     * Line 3 of the drawdown request's recipient's address.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recipientAddressLine3(): Optional<String> =
        Optional.ofNullable(recipientAddressLine3.getNullable("recipient_address_line3"))

    /**
     * The drawdown request's recipient's name.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recipientName(): Optional<String> =
        Optional.ofNullable(recipientName.getNullable("recipient_name"))

    /**
     * The drawdown request's recipient's routing number.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun recipientRoutingNumber(): String =
        recipientRoutingNumber.getRequired("recipient_routing_number")

    /**
     * The lifecycle status of the drawdown request.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * After the drawdown request is submitted to Fedwire, this will contain supplemental details.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun submission(): Optional<Submission> =
        Optional.ofNullable(submission.getNullable("submission"))

    /**
     * A constant representing the object's type. For this resource it will always be
     * `wire_drawdown_request`.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

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
     * Returns the raw JSON value of [currency].
     *
     * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

    /**
     * Returns the raw JSON value of [fulfillmentInboundWireTransferId].
     *
     * Unlike [fulfillmentInboundWireTransferId], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("fulfillment_inbound_wire_transfer_id")
    @ExcludeMissing
    fun _fulfillmentInboundWireTransferId(): JsonField<String> = fulfillmentInboundWireTransferId

    /**
     * Returns the raw JSON value of [idempotencyKey].
     *
     * Unlike [idempotencyKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idempotency_key")
    @ExcludeMissing
    fun _idempotencyKey(): JsonField<String> = idempotencyKey

    /**
     * Returns the raw JSON value of [messageToRecipient].
     *
     * Unlike [messageToRecipient], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("message_to_recipient")
    @ExcludeMissing
    fun _messageToRecipient(): JsonField<String> = messageToRecipient

    /**
     * Returns the raw JSON value of [originatorAddressLine1].
     *
     * Unlike [originatorAddressLine1], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("originator_address_line1")
    @ExcludeMissing
    fun _originatorAddressLine1(): JsonField<String> = originatorAddressLine1

    /**
     * Returns the raw JSON value of [originatorAddressLine2].
     *
     * Unlike [originatorAddressLine2], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("originator_address_line2")
    @ExcludeMissing
    fun _originatorAddressLine2(): JsonField<String> = originatorAddressLine2

    /**
     * Returns the raw JSON value of [originatorAddressLine3].
     *
     * Unlike [originatorAddressLine3], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("originator_address_line3")
    @ExcludeMissing
    fun _originatorAddressLine3(): JsonField<String> = originatorAddressLine3

    /**
     * Returns the raw JSON value of [originatorName].
     *
     * Unlike [originatorName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("originator_name")
    @ExcludeMissing
    fun _originatorName(): JsonField<String> = originatorName

    /**
     * Returns the raw JSON value of [recipientAccountNumber].
     *
     * Unlike [recipientAccountNumber], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("recipient_account_number")
    @ExcludeMissing
    fun _recipientAccountNumber(): JsonField<String> = recipientAccountNumber

    /**
     * Returns the raw JSON value of [recipientAddressLine1].
     *
     * Unlike [recipientAddressLine1], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("recipient_address_line1")
    @ExcludeMissing
    fun _recipientAddressLine1(): JsonField<String> = recipientAddressLine1

    /**
     * Returns the raw JSON value of [recipientAddressLine2].
     *
     * Unlike [recipientAddressLine2], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("recipient_address_line2")
    @ExcludeMissing
    fun _recipientAddressLine2(): JsonField<String> = recipientAddressLine2

    /**
     * Returns the raw JSON value of [recipientAddressLine3].
     *
     * Unlike [recipientAddressLine3], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("recipient_address_line3")
    @ExcludeMissing
    fun _recipientAddressLine3(): JsonField<String> = recipientAddressLine3

    /**
     * Returns the raw JSON value of [recipientName].
     *
     * Unlike [recipientName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("recipient_name")
    @ExcludeMissing
    fun _recipientName(): JsonField<String> = recipientName

    /**
     * Returns the raw JSON value of [recipientRoutingNumber].
     *
     * Unlike [recipientRoutingNumber], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("recipient_routing_number")
    @ExcludeMissing
    fun _recipientRoutingNumber(): JsonField<String> = recipientRoutingNumber

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
         * Returns a mutable builder for constructing an instance of [WireDrawdownRequest].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .accountNumberId()
         * .amount()
         * .createdAt()
         * .currency()
         * .fulfillmentInboundWireTransferId()
         * .idempotencyKey()
         * .messageToRecipient()
         * .originatorAddressLine1()
         * .originatorAddressLine2()
         * .originatorAddressLine3()
         * .originatorName()
         * .recipientAccountNumber()
         * .recipientAddressLine1()
         * .recipientAddressLine2()
         * .recipientAddressLine3()
         * .recipientName()
         * .recipientRoutingNumber()
         * .status()
         * .submission()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [WireDrawdownRequest]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var accountNumberId: JsonField<String>? = null
        private var amount: JsonField<Long>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var currency: JsonField<String>? = null
        private var fulfillmentInboundWireTransferId: JsonField<String>? = null
        private var idempotencyKey: JsonField<String>? = null
        private var messageToRecipient: JsonField<String>? = null
        private var originatorAddressLine1: JsonField<String>? = null
        private var originatorAddressLine2: JsonField<String>? = null
        private var originatorAddressLine3: JsonField<String>? = null
        private var originatorName: JsonField<String>? = null
        private var recipientAccountNumber: JsonField<String>? = null
        private var recipientAddressLine1: JsonField<String>? = null
        private var recipientAddressLine2: JsonField<String>? = null
        private var recipientAddressLine3: JsonField<String>? = null
        private var recipientName: JsonField<String>? = null
        private var recipientRoutingNumber: JsonField<String>? = null
        private var status: JsonField<Status>? = null
        private var submission: JsonField<Submission>? = null
        private var type: JsonField<Type>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(wireDrawdownRequest: WireDrawdownRequest) = apply {
            id = wireDrawdownRequest.id
            accountNumberId = wireDrawdownRequest.accountNumberId
            amount = wireDrawdownRequest.amount
            createdAt = wireDrawdownRequest.createdAt
            currency = wireDrawdownRequest.currency
            fulfillmentInboundWireTransferId = wireDrawdownRequest.fulfillmentInboundWireTransferId
            idempotencyKey = wireDrawdownRequest.idempotencyKey
            messageToRecipient = wireDrawdownRequest.messageToRecipient
            originatorAddressLine1 = wireDrawdownRequest.originatorAddressLine1
            originatorAddressLine2 = wireDrawdownRequest.originatorAddressLine2
            originatorAddressLine3 = wireDrawdownRequest.originatorAddressLine3
            originatorName = wireDrawdownRequest.originatorName
            recipientAccountNumber = wireDrawdownRequest.recipientAccountNumber
            recipientAddressLine1 = wireDrawdownRequest.recipientAddressLine1
            recipientAddressLine2 = wireDrawdownRequest.recipientAddressLine2
            recipientAddressLine3 = wireDrawdownRequest.recipientAddressLine3
            recipientName = wireDrawdownRequest.recipientName
            recipientRoutingNumber = wireDrawdownRequest.recipientRoutingNumber
            status = wireDrawdownRequest.status
            submission = wireDrawdownRequest.submission
            type = wireDrawdownRequest.type
            additionalProperties = wireDrawdownRequest.additionalProperties.toMutableMap()
        }

        /** The Wire drawdown request identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * The Account Number to which the recipient of this request is being requested to send
         * funds.
         */
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

        /** The amount being requested in cents. */
        fun amount(amount: Long) = amount(JsonField.of(amount))

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the wire
         * drawdown request was created.
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

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the amount being
         * requested. Will always be "USD".
         */
        fun currency(currency: String) = currency(JsonField.of(currency))

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

        /**
         * If the recipient fulfills the drawdown request by sending funds, then this will be the
         * identifier of the corresponding Transaction.
         */
        fun fulfillmentInboundWireTransferId(fulfillmentInboundWireTransferId: String?) =
            fulfillmentInboundWireTransferId(JsonField.ofNullable(fulfillmentInboundWireTransferId))

        /**
         * Alias for calling [Builder.fulfillmentInboundWireTransferId] with
         * `fulfillmentInboundWireTransferId.orElse(null)`.
         */
        fun fulfillmentInboundWireTransferId(fulfillmentInboundWireTransferId: Optional<String>) =
            fulfillmentInboundWireTransferId(fulfillmentInboundWireTransferId.getOrNull())

        /**
         * Sets [Builder.fulfillmentInboundWireTransferId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fulfillmentInboundWireTransferId] with a well-typed
         * [String] value instead. This method is primarily for setting the field to an undocumented
         * or not yet supported value.
         */
        fun fulfillmentInboundWireTransferId(fulfillmentInboundWireTransferId: JsonField<String>) =
            apply {
                this.fulfillmentInboundWireTransferId = fulfillmentInboundWireTransferId
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

        /** The message the recipient will see as part of the drawdown request. */
        fun messageToRecipient(messageToRecipient: String) =
            messageToRecipient(JsonField.of(messageToRecipient))

        /**
         * Sets [Builder.messageToRecipient] to an arbitrary JSON value.
         *
         * You should usually call [Builder.messageToRecipient] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun messageToRecipient(messageToRecipient: JsonField<String>) = apply {
            this.messageToRecipient = messageToRecipient
        }

        /** The originator's address line 1. */
        fun originatorAddressLine1(originatorAddressLine1: String?) =
            originatorAddressLine1(JsonField.ofNullable(originatorAddressLine1))

        /**
         * Alias for calling [Builder.originatorAddressLine1] with
         * `originatorAddressLine1.orElse(null)`.
         */
        fun originatorAddressLine1(originatorAddressLine1: Optional<String>) =
            originatorAddressLine1(originatorAddressLine1.getOrNull())

        /**
         * Sets [Builder.originatorAddressLine1] to an arbitrary JSON value.
         *
         * You should usually call [Builder.originatorAddressLine1] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun originatorAddressLine1(originatorAddressLine1: JsonField<String>) = apply {
            this.originatorAddressLine1 = originatorAddressLine1
        }

        /** The originator's address line 2. */
        fun originatorAddressLine2(originatorAddressLine2: String?) =
            originatorAddressLine2(JsonField.ofNullable(originatorAddressLine2))

        /**
         * Alias for calling [Builder.originatorAddressLine2] with
         * `originatorAddressLine2.orElse(null)`.
         */
        fun originatorAddressLine2(originatorAddressLine2: Optional<String>) =
            originatorAddressLine2(originatorAddressLine2.getOrNull())

        /**
         * Sets [Builder.originatorAddressLine2] to an arbitrary JSON value.
         *
         * You should usually call [Builder.originatorAddressLine2] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun originatorAddressLine2(originatorAddressLine2: JsonField<String>) = apply {
            this.originatorAddressLine2 = originatorAddressLine2
        }

        /** The originator's address line 3. */
        fun originatorAddressLine3(originatorAddressLine3: String?) =
            originatorAddressLine3(JsonField.ofNullable(originatorAddressLine3))

        /**
         * Alias for calling [Builder.originatorAddressLine3] with
         * `originatorAddressLine3.orElse(null)`.
         */
        fun originatorAddressLine3(originatorAddressLine3: Optional<String>) =
            originatorAddressLine3(originatorAddressLine3.getOrNull())

        /**
         * Sets [Builder.originatorAddressLine3] to an arbitrary JSON value.
         *
         * You should usually call [Builder.originatorAddressLine3] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun originatorAddressLine3(originatorAddressLine3: JsonField<String>) = apply {
            this.originatorAddressLine3 = originatorAddressLine3
        }

        /** The originator's name. */
        fun originatorName(originatorName: String?) =
            originatorName(JsonField.ofNullable(originatorName))

        /** Alias for calling [Builder.originatorName] with `originatorName.orElse(null)`. */
        fun originatorName(originatorName: Optional<String>) =
            originatorName(originatorName.getOrNull())

        /**
         * Sets [Builder.originatorName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.originatorName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun originatorName(originatorName: JsonField<String>) = apply {
            this.originatorName = originatorName
        }

        /** The drawdown request's recipient's account number. */
        fun recipientAccountNumber(recipientAccountNumber: String) =
            recipientAccountNumber(JsonField.of(recipientAccountNumber))

        /**
         * Sets [Builder.recipientAccountNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recipientAccountNumber] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun recipientAccountNumber(recipientAccountNumber: JsonField<String>) = apply {
            this.recipientAccountNumber = recipientAccountNumber
        }

        /** Line 1 of the drawdown request's recipient's address. */
        fun recipientAddressLine1(recipientAddressLine1: String?) =
            recipientAddressLine1(JsonField.ofNullable(recipientAddressLine1))

        /**
         * Alias for calling [Builder.recipientAddressLine1] with
         * `recipientAddressLine1.orElse(null)`.
         */
        fun recipientAddressLine1(recipientAddressLine1: Optional<String>) =
            recipientAddressLine1(recipientAddressLine1.getOrNull())

        /**
         * Sets [Builder.recipientAddressLine1] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recipientAddressLine1] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun recipientAddressLine1(recipientAddressLine1: JsonField<String>) = apply {
            this.recipientAddressLine1 = recipientAddressLine1
        }

        /** Line 2 of the drawdown request's recipient's address. */
        fun recipientAddressLine2(recipientAddressLine2: String?) =
            recipientAddressLine2(JsonField.ofNullable(recipientAddressLine2))

        /**
         * Alias for calling [Builder.recipientAddressLine2] with
         * `recipientAddressLine2.orElse(null)`.
         */
        fun recipientAddressLine2(recipientAddressLine2: Optional<String>) =
            recipientAddressLine2(recipientAddressLine2.getOrNull())

        /**
         * Sets [Builder.recipientAddressLine2] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recipientAddressLine2] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun recipientAddressLine2(recipientAddressLine2: JsonField<String>) = apply {
            this.recipientAddressLine2 = recipientAddressLine2
        }

        /** Line 3 of the drawdown request's recipient's address. */
        fun recipientAddressLine3(recipientAddressLine3: String?) =
            recipientAddressLine3(JsonField.ofNullable(recipientAddressLine3))

        /**
         * Alias for calling [Builder.recipientAddressLine3] with
         * `recipientAddressLine3.orElse(null)`.
         */
        fun recipientAddressLine3(recipientAddressLine3: Optional<String>) =
            recipientAddressLine3(recipientAddressLine3.getOrNull())

        /**
         * Sets [Builder.recipientAddressLine3] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recipientAddressLine3] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun recipientAddressLine3(recipientAddressLine3: JsonField<String>) = apply {
            this.recipientAddressLine3 = recipientAddressLine3
        }

        /** The drawdown request's recipient's name. */
        fun recipientName(recipientName: String?) =
            recipientName(JsonField.ofNullable(recipientName))

        /** Alias for calling [Builder.recipientName] with `recipientName.orElse(null)`. */
        fun recipientName(recipientName: Optional<String>) =
            recipientName(recipientName.getOrNull())

        /**
         * Sets [Builder.recipientName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recipientName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun recipientName(recipientName: JsonField<String>) = apply {
            this.recipientName = recipientName
        }

        /** The drawdown request's recipient's routing number. */
        fun recipientRoutingNumber(recipientRoutingNumber: String) =
            recipientRoutingNumber(JsonField.of(recipientRoutingNumber))

        /**
         * Sets [Builder.recipientRoutingNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recipientRoutingNumber] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun recipientRoutingNumber(recipientRoutingNumber: JsonField<String>) = apply {
            this.recipientRoutingNumber = recipientRoutingNumber
        }

        /** The lifecycle status of the drawdown request. */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /**
         * After the drawdown request is submitted to Fedwire, this will contain supplemental
         * details.
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
         * `wire_drawdown_request`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
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

        /**
         * Returns an immutable instance of [WireDrawdownRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .accountNumberId()
         * .amount()
         * .createdAt()
         * .currency()
         * .fulfillmentInboundWireTransferId()
         * .idempotencyKey()
         * .messageToRecipient()
         * .originatorAddressLine1()
         * .originatorAddressLine2()
         * .originatorAddressLine3()
         * .originatorName()
         * .recipientAccountNumber()
         * .recipientAddressLine1()
         * .recipientAddressLine2()
         * .recipientAddressLine3()
         * .recipientName()
         * .recipientRoutingNumber()
         * .status()
         * .submission()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): WireDrawdownRequest =
            WireDrawdownRequest(
                checkRequired("id", id),
                checkRequired("accountNumberId", accountNumberId),
                checkRequired("amount", amount),
                checkRequired("createdAt", createdAt),
                checkRequired("currency", currency),
                checkRequired("fulfillmentInboundWireTransferId", fulfillmentInboundWireTransferId),
                checkRequired("idempotencyKey", idempotencyKey),
                checkRequired("messageToRecipient", messageToRecipient),
                checkRequired("originatorAddressLine1", originatorAddressLine1),
                checkRequired("originatorAddressLine2", originatorAddressLine2),
                checkRequired("originatorAddressLine3", originatorAddressLine3),
                checkRequired("originatorName", originatorName),
                checkRequired("recipientAccountNumber", recipientAccountNumber),
                checkRequired("recipientAddressLine1", recipientAddressLine1),
                checkRequired("recipientAddressLine2", recipientAddressLine2),
                checkRequired("recipientAddressLine3", recipientAddressLine3),
                checkRequired("recipientName", recipientName),
                checkRequired("recipientRoutingNumber", recipientRoutingNumber),
                checkRequired("status", status),
                checkRequired("submission", submission),
                checkRequired("type", type),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): WireDrawdownRequest = apply {
        if (validated) {
            return@apply
        }

        id()
        accountNumberId()
        amount()
        createdAt()
        currency()
        fulfillmentInboundWireTransferId()
        idempotencyKey()
        messageToRecipient()
        originatorAddressLine1()
        originatorAddressLine2()
        originatorAddressLine3()
        originatorName()
        recipientAccountNumber()
        recipientAddressLine1()
        recipientAddressLine2()
        recipientAddressLine3()
        recipientName()
        recipientRoutingNumber()
        status()
        submission().ifPresent { it.validate() }
        type()
        validated = true
    }

    /** The lifecycle status of the drawdown request. */
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

            /** The drawdown request is queued to be submitted to Fedwire. */
            @JvmField val PENDING_SUBMISSION = of("pending_submission")

            /** The drawdown request has been sent and the recipient should respond in some way. */
            @JvmField val PENDING_RESPONSE = of("pending_response")

            /** The drawdown request has been fulfilled by the recipient. */
            @JvmField val FULFILLED = of("fulfilled")

            /** The drawdown request has been refused by the recipient. */
            @JvmField val REFUSED = of("refused")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            /** The drawdown request is queued to be submitted to Fedwire. */
            PENDING_SUBMISSION,
            /** The drawdown request has been sent and the recipient should respond in some way. */
            PENDING_RESPONSE,
            /** The drawdown request has been fulfilled by the recipient. */
            FULFILLED,
            /** The drawdown request has been refused by the recipient. */
            REFUSED,
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
            /** The drawdown request is queued to be submitted to Fedwire. */
            PENDING_SUBMISSION,
            /** The drawdown request has been sent and the recipient should respond in some way. */
            PENDING_RESPONSE,
            /** The drawdown request has been fulfilled by the recipient. */
            FULFILLED,
            /** The drawdown request has been refused by the recipient. */
            REFUSED,
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
                FULFILLED -> Value.FULFILLED
                REFUSED -> Value.REFUSED
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
                FULFILLED -> Known.FULFILLED
                REFUSED -> Known.REFUSED
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
     * After the drawdown request is submitted to Fedwire, this will contain supplemental details.
     */
    class Submission
    private constructor(
        private val inputMessageAccountabilityData: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("input_message_accountability_data")
            @ExcludeMissing
            inputMessageAccountabilityData: JsonField<String> = JsonMissing.of()
        ) : this(inputMessageAccountabilityData, mutableMapOf())

        /**
         * The input message accountability data (IMAD) uniquely identifying the submission with
         * Fedwire.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun inputMessageAccountabilityData(): String =
            inputMessageAccountabilityData.getRequired("input_message_accountability_data")

        /**
         * Returns the raw JSON value of [inputMessageAccountabilityData].
         *
         * Unlike [inputMessageAccountabilityData], this method doesn't throw if the JSON field has
         * an unexpected type.
         */
        @JsonProperty("input_message_accountability_data")
        @ExcludeMissing
        fun _inputMessageAccountabilityData(): JsonField<String> = inputMessageAccountabilityData

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
             * .inputMessageAccountabilityData()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Submission]. */
        class Builder internal constructor() {

            private var inputMessageAccountabilityData: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(submission: Submission) = apply {
                inputMessageAccountabilityData = submission.inputMessageAccountabilityData
                additionalProperties = submission.additionalProperties.toMutableMap()
            }

            /**
             * The input message accountability data (IMAD) uniquely identifying the submission with
             * Fedwire.
             */
            fun inputMessageAccountabilityData(inputMessageAccountabilityData: String) =
                inputMessageAccountabilityData(JsonField.of(inputMessageAccountabilityData))

            /**
             * Sets [Builder.inputMessageAccountabilityData] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inputMessageAccountabilityData] with a well-typed
             * [String] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun inputMessageAccountabilityData(inputMessageAccountabilityData: JsonField<String>) =
                apply {
                    this.inputMessageAccountabilityData = inputMessageAccountabilityData
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
             * Returns an immutable instance of [Submission].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .inputMessageAccountabilityData()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Submission =
                Submission(
                    checkRequired("inputMessageAccountabilityData", inputMessageAccountabilityData),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Submission = apply {
            if (validated) {
                return@apply
            }

            inputMessageAccountabilityData()
            validated = true
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Submission && inputMessageAccountabilityData == other.inputMessageAccountabilityData && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(inputMessageAccountabilityData, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Submission{inputMessageAccountabilityData=$inputMessageAccountabilityData, additionalProperties=$additionalProperties}"
    }

    /**
     * A constant representing the object's type. For this resource it will always be
     * `wire_drawdown_request`.
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

            @JvmField val WIRE_DRAWDOWN_REQUEST = of("wire_drawdown_request")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            WIRE_DRAWDOWN_REQUEST
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
            WIRE_DRAWDOWN_REQUEST,
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
                WIRE_DRAWDOWN_REQUEST -> Value.WIRE_DRAWDOWN_REQUEST
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
                WIRE_DRAWDOWN_REQUEST -> Known.WIRE_DRAWDOWN_REQUEST
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

        return /* spotless:off */ other is WireDrawdownRequest && id == other.id && accountNumberId == other.accountNumberId && amount == other.amount && createdAt == other.createdAt && currency == other.currency && fulfillmentInboundWireTransferId == other.fulfillmentInboundWireTransferId && idempotencyKey == other.idempotencyKey && messageToRecipient == other.messageToRecipient && originatorAddressLine1 == other.originatorAddressLine1 && originatorAddressLine2 == other.originatorAddressLine2 && originatorAddressLine3 == other.originatorAddressLine3 && originatorName == other.originatorName && recipientAccountNumber == other.recipientAccountNumber && recipientAddressLine1 == other.recipientAddressLine1 && recipientAddressLine2 == other.recipientAddressLine2 && recipientAddressLine3 == other.recipientAddressLine3 && recipientName == other.recipientName && recipientRoutingNumber == other.recipientRoutingNumber && status == other.status && submission == other.submission && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, accountNumberId, amount, createdAt, currency, fulfillmentInboundWireTransferId, idempotencyKey, messageToRecipient, originatorAddressLine1, originatorAddressLine2, originatorAddressLine3, originatorName, recipientAccountNumber, recipientAddressLine1, recipientAddressLine2, recipientAddressLine3, recipientName, recipientRoutingNumber, status, submission, type, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "WireDrawdownRequest{id=$id, accountNumberId=$accountNumberId, amount=$amount, createdAt=$createdAt, currency=$currency, fulfillmentInboundWireTransferId=$fulfillmentInboundWireTransferId, idempotencyKey=$idempotencyKey, messageToRecipient=$messageToRecipient, originatorAddressLine1=$originatorAddressLine1, originatorAddressLine2=$originatorAddressLine2, originatorAddressLine3=$originatorAddressLine3, originatorName=$originatorName, recipientAccountNumber=$recipientAccountNumber, recipientAddressLine1=$recipientAddressLine1, recipientAddressLine2=$recipientAddressLine2, recipientAddressLine3=$recipientAddressLine3, recipientName=$recipientName, recipientRoutingNumber=$recipientRoutingNumber, status=$status, submission=$submission, type=$type, additionalProperties=$additionalProperties}"
}
