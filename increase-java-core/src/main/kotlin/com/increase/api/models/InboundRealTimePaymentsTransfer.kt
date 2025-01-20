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
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

/**
 * An Inbound Real-Time Payments Transfer is a Real-Time Payments transfer initiated outside of
 * Increase to your account.
 */
@NoAutoDetect
class InboundRealTimePaymentsTransfer
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("account_id")
    @ExcludeMissing
    private val accountId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("account_number_id")
    @ExcludeMissing
    private val accountNumberId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("amount") @ExcludeMissing private val amount: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("confirmation")
    @ExcludeMissing
    private val confirmation: JsonField<Confirmation> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("creditor_name")
    @ExcludeMissing
    private val creditorName: JsonField<String> = JsonMissing.of(),
    @JsonProperty("currency")
    @ExcludeMissing
    private val currency: JsonField<Currency> = JsonMissing.of(),
    @JsonProperty("debtor_account_number")
    @ExcludeMissing
    private val debtorAccountNumber: JsonField<String> = JsonMissing.of(),
    @JsonProperty("debtor_name")
    @ExcludeMissing
    private val debtorName: JsonField<String> = JsonMissing.of(),
    @JsonProperty("debtor_routing_number")
    @ExcludeMissing
    private val debtorRoutingNumber: JsonField<String> = JsonMissing.of(),
    @JsonProperty("decline")
    @ExcludeMissing
    private val decline: JsonField<Decline> = JsonMissing.of(),
    @JsonProperty("remittance_information")
    @ExcludeMissing
    private val remittanceInformation: JsonField<String> = JsonMissing.of(),
    @JsonProperty("status")
    @ExcludeMissing
    private val status: JsonField<Status> = JsonMissing.of(),
    @JsonProperty("transaction_identification")
    @ExcludeMissing
    private val transactionIdentification: JsonField<String> = JsonMissing.of(),
    @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The inbound Real-Time Payments transfer's identifier. */
    fun id(): String = id.getRequired("id")

    /** The Account to which the transfer was sent. */
    fun accountId(): String = accountId.getRequired("account_id")

    /** The identifier of the Account Number to which this transfer was sent. */
    fun accountNumberId(): String = accountNumberId.getRequired("account_number_id")

    /** The amount in USD cents. */
    fun amount(): Long = amount.getRequired("amount")

    /** If your transfer is confirmed, this will contain details of the confirmation. */
    fun confirmation(): Optional<Confirmation> =
        Optional.ofNullable(confirmation.getNullable("confirmation"))

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the transfer
     * was created.
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /** The name the sender of the transfer specified as the recipient of the transfer. */
    fun creditorName(): String = creditorName.getRequired("creditor_name")

    /**
     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code of the transfer's currency. This
     * will always be "USD" for a Real-Time Payments transfer.
     */
    fun currency(): Currency = currency.getRequired("currency")

    /** The account number of the account that sent the transfer. */
    fun debtorAccountNumber(): String = debtorAccountNumber.getRequired("debtor_account_number")

    /** The name provided by the sender of the transfer. */
    fun debtorName(): String = debtorName.getRequired("debtor_name")

    /** The routing number of the account that sent the transfer. */
    fun debtorRoutingNumber(): String = debtorRoutingNumber.getRequired("debtor_routing_number")

    /** If your transfer is declined, this will contain details of the decline. */
    fun decline(): Optional<Decline> = Optional.ofNullable(decline.getNullable("decline"))

    /** Additional information included with the transfer. */
    fun remittanceInformation(): Optional<String> =
        Optional.ofNullable(remittanceInformation.getNullable("remittance_information"))

    /** The lifecycle status of the transfer. */
    fun status(): Status = status.getRequired("status")

    /** The Real-Time Payments network identification of the transfer. */
    fun transactionIdentification(): String =
        transactionIdentification.getRequired("transaction_identification")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `inbound_real_time_payments_transfer`.
     */
    fun type(): Type = type.getRequired("type")

    /** The inbound Real-Time Payments transfer's identifier. */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /** The Account to which the transfer was sent. */
    @JsonProperty("account_id") @ExcludeMissing fun _accountId(): JsonField<String> = accountId

    /** The identifier of the Account Number to which this transfer was sent. */
    @JsonProperty("account_number_id")
    @ExcludeMissing
    fun _accountNumberId(): JsonField<String> = accountNumberId

    /** The amount in USD cents. */
    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

    /** If your transfer is confirmed, this will contain details of the confirmation. */
    @JsonProperty("confirmation")
    @ExcludeMissing
    fun _confirmation(): JsonField<Confirmation> = confirmation

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the transfer
     * was created.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /** The name the sender of the transfer specified as the recipient of the transfer. */
    @JsonProperty("creditor_name")
    @ExcludeMissing
    fun _creditorName(): JsonField<String> = creditorName

    /**
     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code of the transfer's currency. This
     * will always be "USD" for a Real-Time Payments transfer.
     */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<Currency> = currency

    /** The account number of the account that sent the transfer. */
    @JsonProperty("debtor_account_number")
    @ExcludeMissing
    fun _debtorAccountNumber(): JsonField<String> = debtorAccountNumber

    /** The name provided by the sender of the transfer. */
    @JsonProperty("debtor_name") @ExcludeMissing fun _debtorName(): JsonField<String> = debtorName

    /** The routing number of the account that sent the transfer. */
    @JsonProperty("debtor_routing_number")
    @ExcludeMissing
    fun _debtorRoutingNumber(): JsonField<String> = debtorRoutingNumber

    /** If your transfer is declined, this will contain details of the decline. */
    @JsonProperty("decline") @ExcludeMissing fun _decline(): JsonField<Decline> = decline

    /** Additional information included with the transfer. */
    @JsonProperty("remittance_information")
    @ExcludeMissing
    fun _remittanceInformation(): JsonField<String> = remittanceInformation

    /** The lifecycle status of the transfer. */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /** The Real-Time Payments network identification of the transfer. */
    @JsonProperty("transaction_identification")
    @ExcludeMissing
    fun _transactionIdentification(): JsonField<String> = transactionIdentification

    /**
     * A constant representing the object's type. For this resource it will always be
     * `inbound_real_time_payments_transfer`.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): InboundRealTimePaymentsTransfer = apply {
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
        currency()
        debtorAccountNumber()
        debtorName()
        debtorRoutingNumber()
        decline().ifPresent { it.validate() }
        remittanceInformation()
        status()
        transactionIdentification()
        type()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

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
        private var remittanceInformation: JsonField<String>? = null
        private var status: JsonField<Status>? = null
        private var transactionIdentification: JsonField<String>? = null
        private var type: JsonField<Type>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(inboundRealTimePaymentsTransfer: InboundRealTimePaymentsTransfer) =
            apply {
                id = inboundRealTimePaymentsTransfer.id
                accountId = inboundRealTimePaymentsTransfer.accountId
                accountNumberId = inboundRealTimePaymentsTransfer.accountNumberId
                amount = inboundRealTimePaymentsTransfer.amount
                confirmation = inboundRealTimePaymentsTransfer.confirmation
                createdAt = inboundRealTimePaymentsTransfer.createdAt
                creditorName = inboundRealTimePaymentsTransfer.creditorName
                currency = inboundRealTimePaymentsTransfer.currency
                debtorAccountNumber = inboundRealTimePaymentsTransfer.debtorAccountNumber
                debtorName = inboundRealTimePaymentsTransfer.debtorName
                debtorRoutingNumber = inboundRealTimePaymentsTransfer.debtorRoutingNumber
                decline = inboundRealTimePaymentsTransfer.decline
                remittanceInformation = inboundRealTimePaymentsTransfer.remittanceInformation
                status = inboundRealTimePaymentsTransfer.status
                transactionIdentification =
                    inboundRealTimePaymentsTransfer.transactionIdentification
                type = inboundRealTimePaymentsTransfer.type
                additionalProperties =
                    inboundRealTimePaymentsTransfer.additionalProperties.toMutableMap()
            }

        /** The inbound Real-Time Payments transfer's identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The inbound Real-Time Payments transfer's identifier. */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The Account to which the transfer was sent. */
        fun accountId(accountId: String) = accountId(JsonField.of(accountId))

        /** The Account to which the transfer was sent. */
        fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

        /** The identifier of the Account Number to which this transfer was sent. */
        fun accountNumberId(accountNumberId: String) =
            accountNumberId(JsonField.of(accountNumberId))

        /** The identifier of the Account Number to which this transfer was sent. */
        fun accountNumberId(accountNumberId: JsonField<String>) = apply {
            this.accountNumberId = accountNumberId
        }

        /** The amount in USD cents. */
        fun amount(amount: Long) = amount(JsonField.of(amount))

        /** The amount in USD cents. */
        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

        /** If your transfer is confirmed, this will contain details of the confirmation. */
        fun confirmation(confirmation: Confirmation?) =
            confirmation(JsonField.ofNullable(confirmation))

        /** If your transfer is confirmed, this will contain details of the confirmation. */
        fun confirmation(confirmation: Optional<Confirmation>) =
            confirmation(confirmation.orElse(null))

        /** If your transfer is confirmed, this will contain details of the confirmation. */
        fun confirmation(confirmation: JsonField<Confirmation>) = apply {
            this.confirmation = confirmation
        }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
         * transfer was created.
         */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
         * transfer was created.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** The name the sender of the transfer specified as the recipient of the transfer. */
        fun creditorName(creditorName: String) = creditorName(JsonField.of(creditorName))

        /** The name the sender of the transfer specified as the recipient of the transfer. */
        fun creditorName(creditorName: JsonField<String>) = apply {
            this.creditorName = creditorName
        }

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code of the transfer's currency.
         * This will always be "USD" for a Real-Time Payments transfer.
         */
        fun currency(currency: Currency) = currency(JsonField.of(currency))

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code of the transfer's currency.
         * This will always be "USD" for a Real-Time Payments transfer.
         */
        fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

        /** The account number of the account that sent the transfer. */
        fun debtorAccountNumber(debtorAccountNumber: String) =
            debtorAccountNumber(JsonField.of(debtorAccountNumber))

        /** The account number of the account that sent the transfer. */
        fun debtorAccountNumber(debtorAccountNumber: JsonField<String>) = apply {
            this.debtorAccountNumber = debtorAccountNumber
        }

        /** The name provided by the sender of the transfer. */
        fun debtorName(debtorName: String) = debtorName(JsonField.of(debtorName))

        /** The name provided by the sender of the transfer. */
        fun debtorName(debtorName: JsonField<String>) = apply { this.debtorName = debtorName }

        /** The routing number of the account that sent the transfer. */
        fun debtorRoutingNumber(debtorRoutingNumber: String) =
            debtorRoutingNumber(JsonField.of(debtorRoutingNumber))

        /** The routing number of the account that sent the transfer. */
        fun debtorRoutingNumber(debtorRoutingNumber: JsonField<String>) = apply {
            this.debtorRoutingNumber = debtorRoutingNumber
        }

        /** If your transfer is declined, this will contain details of the decline. */
        fun decline(decline: Decline?) = decline(JsonField.ofNullable(decline))

        /** If your transfer is declined, this will contain details of the decline. */
        fun decline(decline: Optional<Decline>) = decline(decline.orElse(null))

        /** If your transfer is declined, this will contain details of the decline. */
        fun decline(decline: JsonField<Decline>) = apply { this.decline = decline }

        /** Additional information included with the transfer. */
        fun remittanceInformation(remittanceInformation: String?) =
            remittanceInformation(JsonField.ofNullable(remittanceInformation))

        /** Additional information included with the transfer. */
        fun remittanceInformation(remittanceInformation: Optional<String>) =
            remittanceInformation(remittanceInformation.orElse(null))

        /** Additional information included with the transfer. */
        fun remittanceInformation(remittanceInformation: JsonField<String>) = apply {
            this.remittanceInformation = remittanceInformation
        }

        /** The lifecycle status of the transfer. */
        fun status(status: Status) = status(JsonField.of(status))

        /** The lifecycle status of the transfer. */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** The Real-Time Payments network identification of the transfer. */
        fun transactionIdentification(transactionIdentification: String) =
            transactionIdentification(JsonField.of(transactionIdentification))

        /** The Real-Time Payments network identification of the transfer. */
        fun transactionIdentification(transactionIdentification: JsonField<String>) = apply {
            this.transactionIdentification = transactionIdentification
        }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `inbound_real_time_payments_transfer`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * A constant representing the object's type. For this resource it will always be
         * `inbound_real_time_payments_transfer`.
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

        fun build(): InboundRealTimePaymentsTransfer =
            InboundRealTimePaymentsTransfer(
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
                checkRequired("remittanceInformation", remittanceInformation),
                checkRequired("status", status),
                checkRequired("transactionIdentification", transactionIdentification),
                checkRequired("type", type),
                additionalProperties.toImmutable(),
            )
    }

    /** If your transfer is confirmed, this will contain details of the confirmation. */
    @NoAutoDetect
    class Confirmation
    @JsonCreator
    private constructor(
        @JsonProperty("confirmed_at")
        @ExcludeMissing
        private val confirmedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("transaction_id")
        @ExcludeMissing
        private val transactionId: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The time at which the transfer was confirmed. */
        fun confirmedAt(): OffsetDateTime = confirmedAt.getRequired("confirmed_at")

        /** The id of the transaction for the confirmed transfer. */
        fun transactionId(): String = transactionId.getRequired("transaction_id")

        /** The time at which the transfer was confirmed. */
        @JsonProperty("confirmed_at")
        @ExcludeMissing
        fun _confirmedAt(): JsonField<OffsetDateTime> = confirmedAt

        /** The id of the transaction for the confirmed transfer. */
        @JsonProperty("transaction_id")
        @ExcludeMissing
        fun _transactionId(): JsonField<String> = transactionId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Confirmation = apply {
            if (validated) {
                return@apply
            }

            confirmedAt()
            transactionId()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var confirmedAt: JsonField<OffsetDateTime>? = null
            private var transactionId: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(confirmation: Confirmation) = apply {
                confirmedAt = confirmation.confirmedAt
                transactionId = confirmation.transactionId
                additionalProperties = confirmation.additionalProperties.toMutableMap()
            }

            /** The time at which the transfer was confirmed. */
            fun confirmedAt(confirmedAt: OffsetDateTime) = confirmedAt(JsonField.of(confirmedAt))

            /** The time at which the transfer was confirmed. */
            fun confirmedAt(confirmedAt: JsonField<OffsetDateTime>) = apply {
                this.confirmedAt = confirmedAt
            }

            /** The id of the transaction for the confirmed transfer. */
            fun transactionId(transactionId: String) = transactionId(JsonField.of(transactionId))

            /** The id of the transaction for the confirmed transfer. */
            fun transactionId(transactionId: JsonField<String>) = apply {
                this.transactionId = transactionId
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

            fun build(): Confirmation =
                Confirmation(
                    checkRequired("confirmedAt", confirmedAt),
                    checkRequired("transactionId", transactionId),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Confirmation && confirmedAt == other.confirmedAt && transactionId == other.transactionId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(confirmedAt, transactionId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Confirmation{confirmedAt=$confirmedAt, transactionId=$transactionId, additionalProperties=$additionalProperties}"
    }

    /**
     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code of the transfer's currency. This
     * will always be "USD" for a Real-Time Payments transfer.
     */
    class Currency
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

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
            _UNKNOWN,
        }

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

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Currency && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** If your transfer is declined, this will contain details of the decline. */
    @NoAutoDetect
    class Decline
    @JsonCreator
    private constructor(
        @JsonProperty("declined_at")
        @ExcludeMissing
        private val declinedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("declined_transaction_id")
        @ExcludeMissing
        private val declinedTransactionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("reason")
        @ExcludeMissing
        private val reason: JsonField<Reason> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The time at which the transfer was declined. */
        fun declinedAt(): OffsetDateTime = declinedAt.getRequired("declined_at")

        /** The id of the transaction for the declined transfer. */
        fun declinedTransactionId(): String =
            declinedTransactionId.getRequired("declined_transaction_id")

        /** The reason for the transfer decline. */
        fun reason(): Reason = reason.getRequired("reason")

        /** The time at which the transfer was declined. */
        @JsonProperty("declined_at")
        @ExcludeMissing
        fun _declinedAt(): JsonField<OffsetDateTime> = declinedAt

        /** The id of the transaction for the declined transfer. */
        @JsonProperty("declined_transaction_id")
        @ExcludeMissing
        fun _declinedTransactionId(): JsonField<String> = declinedTransactionId

        /** The reason for the transfer decline. */
        @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<Reason> = reason

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Decline = apply {
            if (validated) {
                return@apply
            }

            declinedAt()
            declinedTransactionId()
            reason()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var declinedAt: JsonField<OffsetDateTime>? = null
            private var declinedTransactionId: JsonField<String>? = null
            private var reason: JsonField<Reason>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(decline: Decline) = apply {
                declinedAt = decline.declinedAt
                declinedTransactionId = decline.declinedTransactionId
                reason = decline.reason
                additionalProperties = decline.additionalProperties.toMutableMap()
            }

            /** The time at which the transfer was declined. */
            fun declinedAt(declinedAt: OffsetDateTime) = declinedAt(JsonField.of(declinedAt))

            /** The time at which the transfer was declined. */
            fun declinedAt(declinedAt: JsonField<OffsetDateTime>) = apply {
                this.declinedAt = declinedAt
            }

            /** The id of the transaction for the declined transfer. */
            fun declinedTransactionId(declinedTransactionId: String) =
                declinedTransactionId(JsonField.of(declinedTransactionId))

            /** The id of the transaction for the declined transfer. */
            fun declinedTransactionId(declinedTransactionId: JsonField<String>) = apply {
                this.declinedTransactionId = declinedTransactionId
            }

            /** The reason for the transfer decline. */
            fun reason(reason: Reason) = reason(JsonField.of(reason))

            /** The reason for the transfer decline. */
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

            fun build(): Decline =
                Decline(
                    checkRequired("declinedAt", declinedAt),
                    checkRequired("declinedTransactionId", declinedTransactionId),
                    checkRequired("reason", reason),
                    additionalProperties.toImmutable(),
                )
        }

        /** The reason for the transfer decline. */
        class Reason
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

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

                /** Your account is not enabled to receive Real-Time Payments transfers. */
                @JvmField val REAL_TIME_PAYMENTS_NOT_ENABLED = of("real_time_payments_not_enabled")

                @JvmStatic fun of(value: String) = Reason(JsonField.of(value))
            }

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
                /** Your account is not enabled to receive Real-Time Payments transfers. */
                REAL_TIME_PAYMENTS_NOT_ENABLED,
            }

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
                /** Your account is not enabled to receive Real-Time Payments transfers. */
                REAL_TIME_PAYMENTS_NOT_ENABLED,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    ACCOUNT_NUMBER_CANCELED -> Value.ACCOUNT_NUMBER_CANCELED
                    ACCOUNT_NUMBER_DISABLED -> Value.ACCOUNT_NUMBER_DISABLED
                    ACCOUNT_RESTRICTED -> Value.ACCOUNT_RESTRICTED
                    GROUP_LOCKED -> Value.GROUP_LOCKED
                    ENTITY_NOT_ACTIVE -> Value.ENTITY_NOT_ACTIVE
                    REAL_TIME_PAYMENTS_NOT_ENABLED -> Value.REAL_TIME_PAYMENTS_NOT_ENABLED
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    ACCOUNT_NUMBER_CANCELED -> Known.ACCOUNT_NUMBER_CANCELED
                    ACCOUNT_NUMBER_DISABLED -> Known.ACCOUNT_NUMBER_DISABLED
                    ACCOUNT_RESTRICTED -> Known.ACCOUNT_RESTRICTED
                    GROUP_LOCKED -> Known.GROUP_LOCKED
                    ENTITY_NOT_ACTIVE -> Known.ENTITY_NOT_ACTIVE
                    REAL_TIME_PAYMENTS_NOT_ENABLED -> Known.REAL_TIME_PAYMENTS_NOT_ENABLED
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

            return /* spotless:off */ other is Decline && declinedAt == other.declinedAt && declinedTransactionId == other.declinedTransactionId && reason == other.reason && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(declinedAt, declinedTransactionId, reason, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Decline{declinedAt=$declinedAt, declinedTransactionId=$declinedTransactionId, reason=$reason, additionalProperties=$additionalProperties}"
    }

    /** The lifecycle status of the transfer. */
    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

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

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            /** The transfer is pending confirmation. */
            PENDING_CONFIRMING,
            /** The transfer was not responded to in time. */
            TIMED_OUT,
            /** The transfer has been received successfully and is confirmed. */
            CONFIRMED,
            /** The transfer has been declined. */
            DECLINED,
        }

        enum class Value {
            /** The transfer is pending confirmation. */
            PENDING_CONFIRMING,
            /** The transfer was not responded to in time. */
            TIMED_OUT,
            /** The transfer has been received successfully and is confirmed. */
            CONFIRMED,
            /** The transfer has been declined. */
            DECLINED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                PENDING_CONFIRMING -> Value.PENDING_CONFIRMING
                TIMED_OUT -> Value.TIMED_OUT
                CONFIRMED -> Value.CONFIRMED
                DECLINED -> Value.DECLINED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                PENDING_CONFIRMING -> Known.PENDING_CONFIRMING
                TIMED_OUT -> Known.TIMED_OUT
                CONFIRMED -> Known.CONFIRMED
                DECLINED -> Known.DECLINED
                else -> throw IncreaseInvalidDataException("Unknown Status: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

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
     * A constant representing the object's type. For this resource it will always be
     * `inbound_real_time_payments_transfer`.
     */
    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField
            val INBOUND_REAL_TIME_PAYMENTS_TRANSFER = of("inbound_real_time_payments_transfer")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            INBOUND_REAL_TIME_PAYMENTS_TRANSFER,
        }

        enum class Value {
            INBOUND_REAL_TIME_PAYMENTS_TRANSFER,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                INBOUND_REAL_TIME_PAYMENTS_TRANSFER -> Value.INBOUND_REAL_TIME_PAYMENTS_TRANSFER
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                INBOUND_REAL_TIME_PAYMENTS_TRANSFER -> Known.INBOUND_REAL_TIME_PAYMENTS_TRANSFER
                else -> throw IncreaseInvalidDataException("Unknown Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

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

        return /* spotless:off */ other is InboundRealTimePaymentsTransfer && id == other.id && accountId == other.accountId && accountNumberId == other.accountNumberId && amount == other.amount && confirmation == other.confirmation && createdAt == other.createdAt && creditorName == other.creditorName && currency == other.currency && debtorAccountNumber == other.debtorAccountNumber && debtorName == other.debtorName && debtorRoutingNumber == other.debtorRoutingNumber && decline == other.decline && remittanceInformation == other.remittanceInformation && status == other.status && transactionIdentification == other.transactionIdentification && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, accountId, accountNumberId, amount, confirmation, createdAt, creditorName, currency, debtorAccountNumber, debtorName, debtorRoutingNumber, decline, remittanceInformation, status, transactionIdentification, type, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InboundRealTimePaymentsTransfer{id=$id, accountId=$accountId, accountNumberId=$accountNumberId, amount=$amount, confirmation=$confirmation, createdAt=$createdAt, creditorName=$creditorName, currency=$currency, debtorAccountNumber=$debtorAccountNumber, debtorName=$debtorName, debtorRoutingNumber=$debtorRoutingNumber, decline=$decline, remittanceInformation=$remittanceInformation, status=$status, transactionIdentification=$transactionIdentification, type=$type, additionalProperties=$additionalProperties}"
}
