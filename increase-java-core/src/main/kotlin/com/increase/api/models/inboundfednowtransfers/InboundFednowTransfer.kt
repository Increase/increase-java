// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.inboundfednowtransfers

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
 * An Inbound FedNow Transfer is a FedNow transfer initiated outside of Increase to your account.
 */
class InboundFednowTransfer
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val accountId: JsonField<String>,
    private val accountNumberId: JsonField<String>,
    private val amount: JsonField<Long>,
    private val confirmation: JsonField<Confirmation>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val creditorName: JsonField<String>,
    private val currency: JsonField<Currency>,
    private val debtorAccountNumber: JsonField<String>,
    private val debtorName: JsonField<String>,
    private val debtorRoutingNumber: JsonField<String>,
    private val decline: JsonField<Decline>,
    private val status: JsonField<Status>,
    private val transactionId: JsonField<String>,
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
        @JsonProperty("confirmation")
        @ExcludeMissing
        confirmation: JsonField<Confirmation> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("creditor_name")
        @ExcludeMissing
        creditorName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("currency") @ExcludeMissing currency: JsonField<Currency> = JsonMissing.of(),
        @JsonProperty("debtor_account_number")
        @ExcludeMissing
        debtorAccountNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("debtor_name")
        @ExcludeMissing
        debtorName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("debtor_routing_number")
        @ExcludeMissing
        debtorRoutingNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("decline") @ExcludeMissing decline: JsonField<Decline> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("transaction_id")
        @ExcludeMissing
        transactionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("unstructured_remittance_information")
        @ExcludeMissing
        unstructuredRemittanceInformation: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        accountId,
        accountNumberId,
        amount,
        confirmation,
        createdAt,
        creditorName,
        currency,
        debtorAccountNumber,
        debtorName,
        debtorRoutingNumber,
        decline,
        status,
        transactionId,
        type,
        unstructuredRemittanceInformation,
        mutableMapOf(),
    )

    /**
     * The inbound FedNow transfer's identifier.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * The Account to which the transfer was sent.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountId(): String = accountId.getRequired("account_id")

    /**
     * The identifier of the Account Number to which this transfer was sent.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountNumberId(): String = accountNumberId.getRequired("account_number_id")

    /**
     * The amount in USD cents.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun amount(): Long = amount.getRequired("amount")

    /**
     * If your transfer is confirmed, this will contain details of the confirmation.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun confirmation(): Optional<Confirmation> = confirmation.getOptional("confirmation")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the transfer
     * was created.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * The name the sender of the transfer specified as the recipient of the transfer.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun creditorName(): String = creditorName.getRequired("creditor_name")

    /**
     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code of the transfer's currency. This
     * will always be "USD" for a FedNow transfer.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun currency(): Currency = currency.getRequired("currency")

    /**
     * The account number of the account that sent the transfer.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun debtorAccountNumber(): String = debtorAccountNumber.getRequired("debtor_account_number")

    /**
     * The name provided by the sender of the transfer.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun debtorName(): String = debtorName.getRequired("debtor_name")

    /**
     * The routing number of the account that sent the transfer.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun debtorRoutingNumber(): String = debtorRoutingNumber.getRequired("debtor_routing_number")

    /**
     * If your transfer is declined, this will contain details of the decline.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun decline(): Optional<Decline> = decline.getOptional("decline")

    /**
     * The lifecycle status of the transfer.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * The identifier of the Transaction object created when the transfer was confirmed.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun transactionId(): Optional<String> = transactionId.getOptional("transaction_id")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `inbound_fednow_transfer`.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * Additional information included with the transfer.
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
     * Returns the raw JSON value of [confirmation].
     *
     * Unlike [confirmation], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("confirmation")
    @ExcludeMissing
    fun _confirmation(): JsonField<Confirmation> = confirmation

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
     * Returns the raw JSON value of [debtorAccountNumber].
     *
     * Unlike [debtorAccountNumber], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("debtor_account_number")
    @ExcludeMissing
    fun _debtorAccountNumber(): JsonField<String> = debtorAccountNumber

    /**
     * Returns the raw JSON value of [debtorName].
     *
     * Unlike [debtorName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("debtor_name") @ExcludeMissing fun _debtorName(): JsonField<String> = debtorName

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
     * Returns the raw JSON value of [decline].
     *
     * Unlike [decline], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("decline") @ExcludeMissing fun _decline(): JsonField<Decline> = decline

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [transactionId].
     *
     * Unlike [transactionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("transaction_id")
    @ExcludeMissing
    fun _transactionId(): JsonField<String> = transactionId

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
         * Returns a mutable builder for constructing an instance of [InboundFednowTransfer].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .accountId()
         * .accountNumberId()
         * .amount()
         * .confirmation()
         * .createdAt()
         * .creditorName()
         * .currency()
         * .debtorAccountNumber()
         * .debtorName()
         * .debtorRoutingNumber()
         * .decline()
         * .status()
         * .transactionId()
         * .type()
         * .unstructuredRemittanceInformation()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InboundFednowTransfer]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var accountId: JsonField<String>? = null
        private var accountNumberId: JsonField<String>? = null
        private var amount: JsonField<Long>? = null
        private var confirmation: JsonField<Confirmation>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var creditorName: JsonField<String>? = null
        private var currency: JsonField<Currency>? = null
        private var debtorAccountNumber: JsonField<String>? = null
        private var debtorName: JsonField<String>? = null
        private var debtorRoutingNumber: JsonField<String>? = null
        private var decline: JsonField<Decline>? = null
        private var status: JsonField<Status>? = null
        private var transactionId: JsonField<String>? = null
        private var type: JsonField<Type>? = null
        private var unstructuredRemittanceInformation: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(inboundFednowTransfer: InboundFednowTransfer) = apply {
            id = inboundFednowTransfer.id
            accountId = inboundFednowTransfer.accountId
            accountNumberId = inboundFednowTransfer.accountNumberId
            amount = inboundFednowTransfer.amount
            confirmation = inboundFednowTransfer.confirmation
            createdAt = inboundFednowTransfer.createdAt
            creditorName = inboundFednowTransfer.creditorName
            currency = inboundFednowTransfer.currency
            debtorAccountNumber = inboundFednowTransfer.debtorAccountNumber
            debtorName = inboundFednowTransfer.debtorName
            debtorRoutingNumber = inboundFednowTransfer.debtorRoutingNumber
            decline = inboundFednowTransfer.decline
            status = inboundFednowTransfer.status
            transactionId = inboundFednowTransfer.transactionId
            type = inboundFednowTransfer.type
            unstructuredRemittanceInformation =
                inboundFednowTransfer.unstructuredRemittanceInformation
            additionalProperties = inboundFednowTransfer.additionalProperties.toMutableMap()
        }

        /** The inbound FedNow transfer's identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The Account to which the transfer was sent. */
        fun accountId(accountId: String) = accountId(JsonField.of(accountId))

        /**
         * Sets [Builder.accountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

        /** The identifier of the Account Number to which this transfer was sent. */
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

        /** The amount in USD cents. */
        fun amount(amount: Long) = amount(JsonField.of(amount))

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

        /** If your transfer is confirmed, this will contain details of the confirmation. */
        fun confirmation(confirmation: Confirmation?) =
            confirmation(JsonField.ofNullable(confirmation))

        /** Alias for calling [Builder.confirmation] with `confirmation.orElse(null)`. */
        fun confirmation(confirmation: Optional<Confirmation>) =
            confirmation(confirmation.getOrNull())

        /**
         * Sets [Builder.confirmation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.confirmation] with a well-typed [Confirmation] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun confirmation(confirmation: JsonField<Confirmation>) = apply {
            this.confirmation = confirmation
        }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
         * transfer was created.
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

        /** The name the sender of the transfer specified as the recipient of the transfer. */
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
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code of the transfer's currency.
         * This will always be "USD" for a FedNow transfer.
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

        /** The account number of the account that sent the transfer. */
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

        /** The name provided by the sender of the transfer. */
        fun debtorName(debtorName: String) = debtorName(JsonField.of(debtorName))

        /**
         * Sets [Builder.debtorName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.debtorName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun debtorName(debtorName: JsonField<String>) = apply { this.debtorName = debtorName }

        /** The routing number of the account that sent the transfer. */
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

        /** If your transfer is declined, this will contain details of the decline. */
        fun decline(decline: Decline?) = decline(JsonField.ofNullable(decline))

        /** Alias for calling [Builder.decline] with `decline.orElse(null)`. */
        fun decline(decline: Optional<Decline>) = decline(decline.getOrNull())

        /**
         * Sets [Builder.decline] to an arbitrary JSON value.
         *
         * You should usually call [Builder.decline] with a well-typed [Decline] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun decline(decline: JsonField<Decline>) = apply { this.decline = decline }

        /** The lifecycle status of the transfer. */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** The identifier of the Transaction object created when the transfer was confirmed. */
        fun transactionId(transactionId: String?) =
            transactionId(JsonField.ofNullable(transactionId))

        /** Alias for calling [Builder.transactionId] with `transactionId.orElse(null)`. */
        fun transactionId(transactionId: Optional<String>) =
            transactionId(transactionId.getOrNull())

        /**
         * Sets [Builder.transactionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transactionId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun transactionId(transactionId: JsonField<String>) = apply {
            this.transactionId = transactionId
        }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `inbound_fednow_transfer`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        /** Additional information included with the transfer. */
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
         * Returns an immutable instance of [InboundFednowTransfer].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .accountId()
         * .accountNumberId()
         * .amount()
         * .confirmation()
         * .createdAt()
         * .creditorName()
         * .currency()
         * .debtorAccountNumber()
         * .debtorName()
         * .debtorRoutingNumber()
         * .decline()
         * .status()
         * .transactionId()
         * .type()
         * .unstructuredRemittanceInformation()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): InboundFednowTransfer =
            InboundFednowTransfer(
                checkRequired("id", id),
                checkRequired("accountId", accountId),
                checkRequired("accountNumberId", accountNumberId),
                checkRequired("amount", amount),
                checkRequired("confirmation", confirmation),
                checkRequired("createdAt", createdAt),
                checkRequired("creditorName", creditorName),
                checkRequired("currency", currency),
                checkRequired("debtorAccountNumber", debtorAccountNumber),
                checkRequired("debtorName", debtorName),
                checkRequired("debtorRoutingNumber", debtorRoutingNumber),
                checkRequired("decline", decline),
                checkRequired("status", status),
                checkRequired("transactionId", transactionId),
                checkRequired("type", type),
                checkRequired(
                    "unstructuredRemittanceInformation",
                    unstructuredRemittanceInformation,
                ),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): InboundFednowTransfer = apply {
        if (validated) {
            return@apply
        }

        id()
        accountId()
        accountNumberId()
        amount()
        confirmation().ifPresent { it.validate() }
        createdAt()
        creditorName()
        currency().validate()
        debtorAccountNumber()
        debtorName()
        debtorRoutingNumber()
        decline().ifPresent { it.validate() }
        status().validate()
        transactionId()
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
            (confirmation.asKnown().getOrNull()?.validity() ?: 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (creditorName.asKnown().isPresent) 1 else 0) +
            (currency.asKnown().getOrNull()?.validity() ?: 0) +
            (if (debtorAccountNumber.asKnown().isPresent) 1 else 0) +
            (if (debtorName.asKnown().isPresent) 1 else 0) +
            (if (debtorRoutingNumber.asKnown().isPresent) 1 else 0) +
            (decline.asKnown().getOrNull()?.validity() ?: 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (transactionId.asKnown().isPresent) 1 else 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0) +
            (if (unstructuredRemittanceInformation.asKnown().isPresent) 1 else 0)

    /** If your transfer is confirmed, this will contain details of the confirmation. */
    class Confirmation
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val transferId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("transfer_id")
            @ExcludeMissing
            transferId: JsonField<String> = JsonMissing.of()
        ) : this(transferId, mutableMapOf())

        /**
         * The identifier of the FedNow Transfer that led to this Transaction.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun transferId(): String = transferId.getRequired("transfer_id")

        /**
         * Returns the raw JSON value of [transferId].
         *
         * Unlike [transferId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("transfer_id")
        @ExcludeMissing
        fun _transferId(): JsonField<String> = transferId

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
             * Returns a mutable builder for constructing an instance of [Confirmation].
             *
             * The following fields are required:
             * ```java
             * .transferId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Confirmation]. */
        class Builder internal constructor() {

            private var transferId: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(confirmation: Confirmation) = apply {
                transferId = confirmation.transferId
                additionalProperties = confirmation.additionalProperties.toMutableMap()
            }

            /** The identifier of the FedNow Transfer that led to this Transaction. */
            fun transferId(transferId: String) = transferId(JsonField.of(transferId))

            /**
             * Sets [Builder.transferId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.transferId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun transferId(transferId: JsonField<String>) = apply { this.transferId = transferId }

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
             * Returns an immutable instance of [Confirmation].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .transferId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Confirmation =
                Confirmation(
                    checkRequired("transferId", transferId),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Confirmation = apply {
            if (validated) {
                return@apply
            }

            transferId()
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
        @JvmSynthetic internal fun validity(): Int = (if (transferId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Confirmation &&
                transferId == other.transferId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(transferId, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Confirmation{transferId=$transferId, additionalProperties=$additionalProperties}"
    }

    /**
     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code of the transfer's currency. This
     * will always be "USD" for a FedNow transfer.
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

    /** If your transfer is declined, this will contain details of the decline. */
    class Decline
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val reason: JsonField<Reason>,
        private val transferId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("reason") @ExcludeMissing reason: JsonField<Reason> = JsonMissing.of(),
            @JsonProperty("transfer_id")
            @ExcludeMissing
            transferId: JsonField<String> = JsonMissing.of(),
        ) : this(reason, transferId, mutableMapOf())

        /**
         * Why the transfer was declined.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun reason(): Reason = reason.getRequired("reason")

        /**
         * The identifier of the FedNow Transfer that led to this declined transaction.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun transferId(): String = transferId.getRequired("transfer_id")

        /**
         * Returns the raw JSON value of [reason].
         *
         * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<Reason> = reason

        /**
         * Returns the raw JSON value of [transferId].
         *
         * Unlike [transferId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("transfer_id")
        @ExcludeMissing
        fun _transferId(): JsonField<String> = transferId

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
             * Returns a mutable builder for constructing an instance of [Decline].
             *
             * The following fields are required:
             * ```java
             * .reason()
             * .transferId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Decline]. */
        class Builder internal constructor() {

            private var reason: JsonField<Reason>? = null
            private var transferId: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(decline: Decline) = apply {
                reason = decline.reason
                transferId = decline.transferId
                additionalProperties = decline.additionalProperties.toMutableMap()
            }

            /** Why the transfer was declined. */
            fun reason(reason: Reason) = reason(JsonField.of(reason))

            /**
             * Sets [Builder.reason] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reason] with a well-typed [Reason] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun reason(reason: JsonField<Reason>) = apply { this.reason = reason }

            /** The identifier of the FedNow Transfer that led to this declined transaction. */
            fun transferId(transferId: String) = transferId(JsonField.of(transferId))

            /**
             * Sets [Builder.transferId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.transferId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun transferId(transferId: JsonField<String>) = apply { this.transferId = transferId }

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
             * Returns an immutable instance of [Decline].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .reason()
             * .transferId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Decline =
                Decline(
                    checkRequired("reason", reason),
                    checkRequired("transferId", transferId),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Decline = apply {
            if (validated) {
                return@apply
            }

            reason().validate()
            transferId()
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
            (reason.asKnown().getOrNull()?.validity() ?: 0) +
                (if (transferId.asKnown().isPresent) 1 else 0)

        /** Why the transfer was declined. */
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

                /** The account number is canceled. */
                @JvmField val ACCOUNT_NUMBER_CANCELED = of("account_number_canceled")

                /** The account number is disabled. */
                @JvmField val ACCOUNT_NUMBER_DISABLED = of("account_number_disabled")

                /** Your account is restricted. */
                @JvmField val ACCOUNT_RESTRICTED = of("account_restricted")

                /** Your account is inactive. */
                @JvmField val GROUP_LOCKED = of("group_locked")

                /** The account's entity is not active. */
                @JvmField val ENTITY_NOT_ACTIVE = of("entity_not_active")

                /** Your account is not enabled to receive FedNow transfers. */
                @JvmField val FEDNOW_NOT_ENABLED = of("fednow_not_enabled")

                @JvmStatic fun of(value: String) = Reason(JsonField.of(value))
            }

            /** An enum containing [Reason]'s known values. */
            enum class Known {
                /** The account number is canceled. */
                ACCOUNT_NUMBER_CANCELED,
                /** The account number is disabled. */
                ACCOUNT_NUMBER_DISABLED,
                /** Your account is restricted. */
                ACCOUNT_RESTRICTED,
                /** Your account is inactive. */
                GROUP_LOCKED,
                /** The account's entity is not active. */
                ENTITY_NOT_ACTIVE,
                /** Your account is not enabled to receive FedNow transfers. */
                FEDNOW_NOT_ENABLED,
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
                /** The account number is canceled. */
                ACCOUNT_NUMBER_CANCELED,
                /** The account number is disabled. */
                ACCOUNT_NUMBER_DISABLED,
                /** Your account is restricted. */
                ACCOUNT_RESTRICTED,
                /** Your account is inactive. */
                GROUP_LOCKED,
                /** The account's entity is not active. */
                ENTITY_NOT_ACTIVE,
                /** Your account is not enabled to receive FedNow transfers. */
                FEDNOW_NOT_ENABLED,
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
                    ACCOUNT_NUMBER_CANCELED -> Value.ACCOUNT_NUMBER_CANCELED
                    ACCOUNT_NUMBER_DISABLED -> Value.ACCOUNT_NUMBER_DISABLED
                    ACCOUNT_RESTRICTED -> Value.ACCOUNT_RESTRICTED
                    GROUP_LOCKED -> Value.GROUP_LOCKED
                    ENTITY_NOT_ACTIVE -> Value.ENTITY_NOT_ACTIVE
                    FEDNOW_NOT_ENABLED -> Value.FEDNOW_NOT_ENABLED
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
                    ACCOUNT_NUMBER_CANCELED -> Known.ACCOUNT_NUMBER_CANCELED
                    ACCOUNT_NUMBER_DISABLED -> Known.ACCOUNT_NUMBER_DISABLED
                    ACCOUNT_RESTRICTED -> Known.ACCOUNT_RESTRICTED
                    GROUP_LOCKED -> Known.GROUP_LOCKED
                    ENTITY_NOT_ACTIVE -> Known.ENTITY_NOT_ACTIVE
                    FEDNOW_NOT_ENABLED -> Known.FEDNOW_NOT_ENABLED
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

            return other is Decline &&
                reason == other.reason &&
                transferId == other.transferId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(reason, transferId, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Decline{reason=$reason, transferId=$transferId, additionalProperties=$additionalProperties}"
    }

    /** The lifecycle status of the transfer. */
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

            /** The transfer is pending confirmation. */
            @JvmField val PENDING_CONFIRMING = of("pending_confirming")

            /** The transfer was not responded to in time. */
            @JvmField val TIMED_OUT = of("timed_out")

            /** The transfer has been received successfully and is confirmed. */
            @JvmField val CONFIRMED = of("confirmed")

            /** The transfer has been declined. */
            @JvmField val DECLINED = of("declined")

            /** The transfer requires attention from an Increase operator. */
            @JvmField val REQUIRES_ATTENTION = of("requires_attention")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            /** The transfer is pending confirmation. */
            PENDING_CONFIRMING,
            /** The transfer was not responded to in time. */
            TIMED_OUT,
            /** The transfer has been received successfully and is confirmed. */
            CONFIRMED,
            /** The transfer has been declined. */
            DECLINED,
            /** The transfer requires attention from an Increase operator. */
            REQUIRES_ATTENTION,
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
            /** The transfer is pending confirmation. */
            PENDING_CONFIRMING,
            /** The transfer was not responded to in time. */
            TIMED_OUT,
            /** The transfer has been received successfully and is confirmed. */
            CONFIRMED,
            /** The transfer has been declined. */
            DECLINED,
            /** The transfer requires attention from an Increase operator. */
            REQUIRES_ATTENTION,
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
                PENDING_CONFIRMING -> Value.PENDING_CONFIRMING
                TIMED_OUT -> Value.TIMED_OUT
                CONFIRMED -> Value.CONFIRMED
                DECLINED -> Value.DECLINED
                REQUIRES_ATTENTION -> Value.REQUIRES_ATTENTION
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
                PENDING_CONFIRMING -> Known.PENDING_CONFIRMING
                TIMED_OUT -> Known.TIMED_OUT
                CONFIRMED -> Known.CONFIRMED
                DECLINED -> Known.DECLINED
                REQUIRES_ATTENTION -> Known.REQUIRES_ATTENTION
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
     * A constant representing the object's type. For this resource it will always be
     * `inbound_fednow_transfer`.
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

            @JvmField val INBOUND_FEDNOW_TRANSFER = of("inbound_fednow_transfer")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            INBOUND_FEDNOW_TRANSFER
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
            INBOUND_FEDNOW_TRANSFER,
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
                INBOUND_FEDNOW_TRANSFER -> Value.INBOUND_FEDNOW_TRANSFER
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
                INBOUND_FEDNOW_TRANSFER -> Known.INBOUND_FEDNOW_TRANSFER
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

        return other is InboundFednowTransfer &&
            id == other.id &&
            accountId == other.accountId &&
            accountNumberId == other.accountNumberId &&
            amount == other.amount &&
            confirmation == other.confirmation &&
            createdAt == other.createdAt &&
            creditorName == other.creditorName &&
            currency == other.currency &&
            debtorAccountNumber == other.debtorAccountNumber &&
            debtorName == other.debtorName &&
            debtorRoutingNumber == other.debtorRoutingNumber &&
            decline == other.decline &&
            status == other.status &&
            transactionId == other.transactionId &&
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
            confirmation,
            createdAt,
            creditorName,
            currency,
            debtorAccountNumber,
            debtorName,
            debtorRoutingNumber,
            decline,
            status,
            transactionId,
            type,
            unstructuredRemittanceInformation,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InboundFednowTransfer{id=$id, accountId=$accountId, accountNumberId=$accountNumberId, amount=$amount, confirmation=$confirmation, createdAt=$createdAt, creditorName=$creditorName, currency=$currency, debtorAccountNumber=$debtorAccountNumber, debtorName=$debtorName, debtorRoutingNumber=$debtorRoutingNumber, decline=$decline, status=$status, transactionId=$transactionId, type=$type, unstructuredRemittanceInformation=$unstructuredRemittanceInformation, additionalProperties=$additionalProperties}"
}
