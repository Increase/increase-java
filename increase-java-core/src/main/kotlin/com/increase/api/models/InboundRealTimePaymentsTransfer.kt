// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.increase.api.core.Enum
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.toUnmodifiable
import com.increase.api.errors.IncreaseInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

/**
 * An Inbound Real-Time Payments Transfer is a Real-Time Payments transfer initiated outside of
 * Increase to your account.
 */
@JsonDeserialize(builder = InboundRealTimePaymentsTransfer.Builder::class)
@NoAutoDetect
class InboundRealTimePaymentsTransfer
private constructor(
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
    private val id: JsonField<String>,
    private val remittanceInformation: JsonField<String>,
    private val status: JsonField<Status>,
    private val transactionIdentification: JsonField<String>,
    private val type: JsonField<Type>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

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

    /** The inbound Real-Time Payments transfer's identifier. */
    fun id(): String = id.getRequired("id")

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

    /** The Account to which the transfer was sent. */
    @JsonProperty("account_id") @ExcludeMissing fun _accountId() = accountId

    /** The identifier of the Account Number to which this transfer was sent. */
    @JsonProperty("account_number_id") @ExcludeMissing fun _accountNumberId() = accountNumberId

    /** The amount in USD cents. */
    @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

    /** If your transfer is confirmed, this will contain details of the confirmation. */
    @JsonProperty("confirmation") @ExcludeMissing fun _confirmation() = confirmation

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the transfer
     * was created.
     */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    /** The name the sender of the transfer specified as the recipient of the transfer. */
    @JsonProperty("creditor_name") @ExcludeMissing fun _creditorName() = creditorName

    /**
     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code of the transfer's currency. This
     * will always be "USD" for a Real-Time Payments transfer.
     */
    @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

    /** The account number of the account that sent the transfer. */
    @JsonProperty("debtor_account_number")
    @ExcludeMissing
    fun _debtorAccountNumber() = debtorAccountNumber

    /** The name provided by the sender of the transfer. */
    @JsonProperty("debtor_name") @ExcludeMissing fun _debtorName() = debtorName

    /** The routing number of the account that sent the transfer. */
    @JsonProperty("debtor_routing_number")
    @ExcludeMissing
    fun _debtorRoutingNumber() = debtorRoutingNumber

    /** If your transfer is declined, this will contain details of the decline. */
    @JsonProperty("decline") @ExcludeMissing fun _decline() = decline

    /** The inbound Real-Time Payments transfer's identifier. */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /** Additional information included with the transfer. */
    @JsonProperty("remittance_information")
    @ExcludeMissing
    fun _remittanceInformation() = remittanceInformation

    /** The lifecycle status of the transfer. */
    @JsonProperty("status") @ExcludeMissing fun _status() = status

    /** The Real-Time Payments network identification of the transfer. */
    @JsonProperty("transaction_identification")
    @ExcludeMissing
    fun _transactionIdentification() = transactionIdentification

    /**
     * A constant representing the object's type. For this resource it will always be
     * `inbound_real_time_payments_transfer`.
     */
    @JsonProperty("type") @ExcludeMissing fun _type() = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): InboundRealTimePaymentsTransfer = apply {
        if (!validated) {
            accountId()
            accountNumberId()
            amount()
            confirmation().map { it.validate() }
            createdAt()
            creditorName()
            currency()
            debtorAccountNumber()
            debtorName()
            debtorRoutingNumber()
            decline().map { it.validate() }
            id()
            remittanceInformation()
            status()
            transactionIdentification()
            type()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InboundRealTimePaymentsTransfer &&
            this.accountId == other.accountId &&
            this.accountNumberId == other.accountNumberId &&
            this.amount == other.amount &&
            this.confirmation == other.confirmation &&
            this.createdAt == other.createdAt &&
            this.creditorName == other.creditorName &&
            this.currency == other.currency &&
            this.debtorAccountNumber == other.debtorAccountNumber &&
            this.debtorName == other.debtorName &&
            this.debtorRoutingNumber == other.debtorRoutingNumber &&
            this.decline == other.decline &&
            this.id == other.id &&
            this.remittanceInformation == other.remittanceInformation &&
            this.status == other.status &&
            this.transactionIdentification == other.transactionIdentification &&
            this.type == other.type &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
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
                    id,
                    remittanceInformation,
                    status,
                    transactionIdentification,
                    type,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "InboundRealTimePaymentsTransfer{accountId=$accountId, accountNumberId=$accountNumberId, amount=$amount, confirmation=$confirmation, createdAt=$createdAt, creditorName=$creditorName, currency=$currency, debtorAccountNumber=$debtorAccountNumber, debtorName=$debtorName, debtorRoutingNumber=$debtorRoutingNumber, decline=$decline, id=$id, remittanceInformation=$remittanceInformation, status=$status, transactionIdentification=$transactionIdentification, type=$type, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var accountId: JsonField<String> = JsonMissing.of()
        private var accountNumberId: JsonField<String> = JsonMissing.of()
        private var amount: JsonField<Long> = JsonMissing.of()
        private var confirmation: JsonField<Confirmation> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var creditorName: JsonField<String> = JsonMissing.of()
        private var currency: JsonField<Currency> = JsonMissing.of()
        private var debtorAccountNumber: JsonField<String> = JsonMissing.of()
        private var debtorName: JsonField<String> = JsonMissing.of()
        private var debtorRoutingNumber: JsonField<String> = JsonMissing.of()
        private var decline: JsonField<Decline> = JsonMissing.of()
        private var id: JsonField<String> = JsonMissing.of()
        private var remittanceInformation: JsonField<String> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var transactionIdentification: JsonField<String> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(inboundRealTimePaymentsTransfer: InboundRealTimePaymentsTransfer) =
            apply {
                this.accountId = inboundRealTimePaymentsTransfer.accountId
                this.accountNumberId = inboundRealTimePaymentsTransfer.accountNumberId
                this.amount = inboundRealTimePaymentsTransfer.amount
                this.confirmation = inboundRealTimePaymentsTransfer.confirmation
                this.createdAt = inboundRealTimePaymentsTransfer.createdAt
                this.creditorName = inboundRealTimePaymentsTransfer.creditorName
                this.currency = inboundRealTimePaymentsTransfer.currency
                this.debtorAccountNumber = inboundRealTimePaymentsTransfer.debtorAccountNumber
                this.debtorName = inboundRealTimePaymentsTransfer.debtorName
                this.debtorRoutingNumber = inboundRealTimePaymentsTransfer.debtorRoutingNumber
                this.decline = inboundRealTimePaymentsTransfer.decline
                this.id = inboundRealTimePaymentsTransfer.id
                this.remittanceInformation = inboundRealTimePaymentsTransfer.remittanceInformation
                this.status = inboundRealTimePaymentsTransfer.status
                this.transactionIdentification =
                    inboundRealTimePaymentsTransfer.transactionIdentification
                this.type = inboundRealTimePaymentsTransfer.type
                additionalProperties(inboundRealTimePaymentsTransfer.additionalProperties)
            }

        /** The Account to which the transfer was sent. */
        fun accountId(accountId: String) = accountId(JsonField.of(accountId))

        /** The Account to which the transfer was sent. */
        @JsonProperty("account_id")
        @ExcludeMissing
        fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

        /** The identifier of the Account Number to which this transfer was sent. */
        fun accountNumberId(accountNumberId: String) =
            accountNumberId(JsonField.of(accountNumberId))

        /** The identifier of the Account Number to which this transfer was sent. */
        @JsonProperty("account_number_id")
        @ExcludeMissing
        fun accountNumberId(accountNumberId: JsonField<String>) = apply {
            this.accountNumberId = accountNumberId
        }

        /** The amount in USD cents. */
        fun amount(amount: Long) = amount(JsonField.of(amount))

        /** The amount in USD cents. */
        @JsonProperty("amount")
        @ExcludeMissing
        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

        /** If your transfer is confirmed, this will contain details of the confirmation. */
        fun confirmation(confirmation: Confirmation) = confirmation(JsonField.of(confirmation))

        /** If your transfer is confirmed, this will contain details of the confirmation. */
        @JsonProperty("confirmation")
        @ExcludeMissing
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
        @JsonProperty("created_at")
        @ExcludeMissing
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** The name the sender of the transfer specified as the recipient of the transfer. */
        fun creditorName(creditorName: String) = creditorName(JsonField.of(creditorName))

        /** The name the sender of the transfer specified as the recipient of the transfer. */
        @JsonProperty("creditor_name")
        @ExcludeMissing
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
        @JsonProperty("currency")
        @ExcludeMissing
        fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

        /** The account number of the account that sent the transfer. */
        fun debtorAccountNumber(debtorAccountNumber: String) =
            debtorAccountNumber(JsonField.of(debtorAccountNumber))

        /** The account number of the account that sent the transfer. */
        @JsonProperty("debtor_account_number")
        @ExcludeMissing
        fun debtorAccountNumber(debtorAccountNumber: JsonField<String>) = apply {
            this.debtorAccountNumber = debtorAccountNumber
        }

        /** The name provided by the sender of the transfer. */
        fun debtorName(debtorName: String) = debtorName(JsonField.of(debtorName))

        /** The name provided by the sender of the transfer. */
        @JsonProperty("debtor_name")
        @ExcludeMissing
        fun debtorName(debtorName: JsonField<String>) = apply { this.debtorName = debtorName }

        /** The routing number of the account that sent the transfer. */
        fun debtorRoutingNumber(debtorRoutingNumber: String) =
            debtorRoutingNumber(JsonField.of(debtorRoutingNumber))

        /** The routing number of the account that sent the transfer. */
        @JsonProperty("debtor_routing_number")
        @ExcludeMissing
        fun debtorRoutingNumber(debtorRoutingNumber: JsonField<String>) = apply {
            this.debtorRoutingNumber = debtorRoutingNumber
        }

        /** If your transfer is declined, this will contain details of the decline. */
        fun decline(decline: Decline) = decline(JsonField.of(decline))

        /** If your transfer is declined, this will contain details of the decline. */
        @JsonProperty("decline")
        @ExcludeMissing
        fun decline(decline: JsonField<Decline>) = apply { this.decline = decline }

        /** The inbound Real-Time Payments transfer's identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The inbound Real-Time Payments transfer's identifier. */
        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        /** Additional information included with the transfer. */
        fun remittanceInformation(remittanceInformation: String) =
            remittanceInformation(JsonField.of(remittanceInformation))

        /** Additional information included with the transfer. */
        @JsonProperty("remittance_information")
        @ExcludeMissing
        fun remittanceInformation(remittanceInformation: JsonField<String>) = apply {
            this.remittanceInformation = remittanceInformation
        }

        /** The lifecycle status of the transfer. */
        fun status(status: Status) = status(JsonField.of(status))

        /** The lifecycle status of the transfer. */
        @JsonProperty("status")
        @ExcludeMissing
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** The Real-Time Payments network identification of the transfer. */
        fun transactionIdentification(transactionIdentification: String) =
            transactionIdentification(JsonField.of(transactionIdentification))

        /** The Real-Time Payments network identification of the transfer. */
        @JsonProperty("transaction_identification")
        @ExcludeMissing
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
        @JsonProperty("type")
        @ExcludeMissing
        fun type(type: JsonField<Type>) = apply { this.type = type }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            this.additionalProperties.putAll(additionalProperties)
        }

        @JsonAnySetter
        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            this.additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun build(): InboundRealTimePaymentsTransfer =
            InboundRealTimePaymentsTransfer(
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
                id,
                remittanceInformation,
                status,
                transactionIdentification,
                type,
                additionalProperties.toUnmodifiable(),
            )
    }

    /** If your transfer is confirmed, this will contain details of the confirmation. */
    @JsonDeserialize(builder = Confirmation.Builder::class)
    @NoAutoDetect
    class Confirmation
    private constructor(
        private val confirmedAt: JsonField<OffsetDateTime>,
        private val transactionId: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /** The time at which the transfer was confirmed. */
        fun confirmedAt(): OffsetDateTime = confirmedAt.getRequired("confirmed_at")

        /** The id of the transaction for the confirmed transfer. */
        fun transactionId(): String = transactionId.getRequired("transaction_id")

        /** The time at which the transfer was confirmed. */
        @JsonProperty("confirmed_at") @ExcludeMissing fun _confirmedAt() = confirmedAt

        /** The id of the transaction for the confirmed transfer. */
        @JsonProperty("transaction_id") @ExcludeMissing fun _transactionId() = transactionId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Confirmation = apply {
            if (!validated) {
                confirmedAt()
                transactionId()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Confirmation &&
                this.confirmedAt == other.confirmedAt &&
                this.transactionId == other.transactionId &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        confirmedAt,
                        transactionId,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Confirmation{confirmedAt=$confirmedAt, transactionId=$transactionId, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var confirmedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var transactionId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(confirmation: Confirmation) = apply {
                this.confirmedAt = confirmation.confirmedAt
                this.transactionId = confirmation.transactionId
                additionalProperties(confirmation.additionalProperties)
            }

            /** The time at which the transfer was confirmed. */
            fun confirmedAt(confirmedAt: OffsetDateTime) = confirmedAt(JsonField.of(confirmedAt))

            /** The time at which the transfer was confirmed. */
            @JsonProperty("confirmed_at")
            @ExcludeMissing
            fun confirmedAt(confirmedAt: JsonField<OffsetDateTime>) = apply {
                this.confirmedAt = confirmedAt
            }

            /** The id of the transaction for the confirmed transfer. */
            fun transactionId(transactionId: String) = transactionId(JsonField.of(transactionId))

            /** The id of the transaction for the confirmed transfer. */
            @JsonProperty("transaction_id")
            @ExcludeMissing
            fun transactionId(transactionId: JsonField<String>) = apply {
                this.transactionId = transactionId
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): Confirmation =
                Confirmation(
                    confirmedAt,
                    transactionId,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    class Currency
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Currency && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val CAD = Currency(JsonField.of("CAD"))

            @JvmField val CHF = Currency(JsonField.of("CHF"))

            @JvmField val EUR = Currency(JsonField.of("EUR"))

            @JvmField val GBP = Currency(JsonField.of("GBP"))

            @JvmField val JPY = Currency(JsonField.of("JPY"))

            @JvmField val USD = Currency(JsonField.of("USD"))

            @JvmStatic fun of(value: String) = Currency(JsonField.of(value))
        }

        enum class Known {
            CAD,
            CHF,
            EUR,
            GBP,
            JPY,
            USD,
        }

        enum class Value {
            CAD,
            CHF,
            EUR,
            GBP,
            JPY,
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
    }

    /** If your transfer is declined, this will contain details of the decline. */
    @JsonDeserialize(builder = Decline.Builder::class)
    @NoAutoDetect
    class Decline
    private constructor(
        private val declinedAt: JsonField<OffsetDateTime>,
        private val declinedTransactionId: JsonField<String>,
        private val reason: JsonField<Reason>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /** The time at which the transfer was declined. */
        fun declinedAt(): OffsetDateTime = declinedAt.getRequired("declined_at")

        /** The id of the transaction for the declined transfer. */
        fun declinedTransactionId(): String =
            declinedTransactionId.getRequired("declined_transaction_id")

        /** The reason for the transfer decline. */
        fun reason(): Reason = reason.getRequired("reason")

        /** The time at which the transfer was declined. */
        @JsonProperty("declined_at") @ExcludeMissing fun _declinedAt() = declinedAt

        /** The id of the transaction for the declined transfer. */
        @JsonProperty("declined_transaction_id")
        @ExcludeMissing
        fun _declinedTransactionId() = declinedTransactionId

        /** The reason for the transfer decline. */
        @JsonProperty("reason") @ExcludeMissing fun _reason() = reason

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Decline = apply {
            if (!validated) {
                declinedAt()
                declinedTransactionId()
                reason()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Decline &&
                this.declinedAt == other.declinedAt &&
                this.declinedTransactionId == other.declinedTransactionId &&
                this.reason == other.reason &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        declinedAt,
                        declinedTransactionId,
                        reason,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Decline{declinedAt=$declinedAt, declinedTransactionId=$declinedTransactionId, reason=$reason, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var declinedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var declinedTransactionId: JsonField<String> = JsonMissing.of()
            private var reason: JsonField<Reason> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(decline: Decline) = apply {
                this.declinedAt = decline.declinedAt
                this.declinedTransactionId = decline.declinedTransactionId
                this.reason = decline.reason
                additionalProperties(decline.additionalProperties)
            }

            /** The time at which the transfer was declined. */
            fun declinedAt(declinedAt: OffsetDateTime) = declinedAt(JsonField.of(declinedAt))

            /** The time at which the transfer was declined. */
            @JsonProperty("declined_at")
            @ExcludeMissing
            fun declinedAt(declinedAt: JsonField<OffsetDateTime>) = apply {
                this.declinedAt = declinedAt
            }

            /** The id of the transaction for the declined transfer. */
            fun declinedTransactionId(declinedTransactionId: String) =
                declinedTransactionId(JsonField.of(declinedTransactionId))

            /** The id of the transaction for the declined transfer. */
            @JsonProperty("declined_transaction_id")
            @ExcludeMissing
            fun declinedTransactionId(declinedTransactionId: JsonField<String>) = apply {
                this.declinedTransactionId = declinedTransactionId
            }

            /** The reason for the transfer decline. */
            fun reason(reason: Reason) = reason(JsonField.of(reason))

            /** The reason for the transfer decline. */
            @JsonProperty("reason")
            @ExcludeMissing
            fun reason(reason: JsonField<Reason>) = apply { this.reason = reason }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): Decline =
                Decline(
                    declinedAt,
                    declinedTransactionId,
                    reason,
                    additionalProperties.toUnmodifiable(),
                )
        }

        class Reason
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Reason && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField
                val ACCOUNT_NUMBER_CANCELED = Reason(JsonField.of("account_number_canceled"))

                @JvmField
                val ACCOUNT_NUMBER_DISABLED = Reason(JsonField.of("account_number_disabled"))

                @JvmField val ACCOUNT_RESTRICTED = Reason(JsonField.of("account_restricted"))

                @JvmField val GROUP_LOCKED = Reason(JsonField.of("group_locked"))

                @JvmField val ENTITY_NOT_ACTIVE = Reason(JsonField.of("entity_not_active"))

                @JvmField
                val REAL_TIME_PAYMENTS_NOT_ENABLED =
                    Reason(JsonField.of("real_time_payments_not_enabled"))

                @JvmStatic fun of(value: String) = Reason(JsonField.of(value))
            }

            enum class Known {
                ACCOUNT_NUMBER_CANCELED,
                ACCOUNT_NUMBER_DISABLED,
                ACCOUNT_RESTRICTED,
                GROUP_LOCKED,
                ENTITY_NOT_ACTIVE,
                REAL_TIME_PAYMENTS_NOT_ENABLED,
            }

            enum class Value {
                ACCOUNT_NUMBER_CANCELED,
                ACCOUNT_NUMBER_DISABLED,
                ACCOUNT_RESTRICTED,
                GROUP_LOCKED,
                ENTITY_NOT_ACTIVE,
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
        }
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Status && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val PENDING_CONFIRMING = Status(JsonField.of("pending_confirming"))

            @JvmField val TIMED_OUT = Status(JsonField.of("timed_out"))

            @JvmField val CONFIRMED = Status(JsonField.of("confirmed"))

            @JvmField val DECLINED = Status(JsonField.of("declined"))

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            PENDING_CONFIRMING,
            TIMED_OUT,
            CONFIRMED,
            DECLINED,
        }

        enum class Value {
            PENDING_CONFIRMING,
            TIMED_OUT,
            CONFIRMED,
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
    }

    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Type && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField
            val INBOUND_REAL_TIME_PAYMENTS_TRANSFER =
                Type(JsonField.of("inbound_real_time_payments_transfer"))

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
    }
}
