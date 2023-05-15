package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
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

/** Check Deposits allow you to deposit images of paper checks into your account. */
@JsonDeserialize(builder = CheckDeposit.Builder::class)
@NoAutoDetect
class CheckDeposit
private constructor(
    private val id: JsonField<String>,
    private val amount: JsonField<Long>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val currency: JsonField<Currency>,
    private val status: JsonField<Status>,
    private val accountId: JsonField<String>,
    private val frontImageFileId: JsonField<String>,
    private val backImageFileId: JsonField<String>,
    private val transactionId: JsonField<String>,
    private val depositAcceptance: JsonField<DepositAcceptance>,
    private val depositRejection: JsonField<DepositRejection>,
    private val depositReturn: JsonField<DepositReturn>,
    private val type: JsonField<Type>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** The deposit's identifier. */
    fun id(): String = id.getRequired("id")

    /**
     * The deposited amount in the minor unit of the destination account currency. For dollars, for
     * example, this is cents.
     */
    fun amount(): Long = amount.getRequired("amount")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the transfer
     * was created.
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the deposit. */
    fun currency(): Currency = currency.getRequired("currency")

    /** The status of the Check Deposit. */
    fun status(): Status = status.getRequired("status")

    /** The Account the check was deposited into. */
    fun accountId(): String = accountId.getRequired("account_id")

    /** The ID for the File containing the image of the front of the check. */
    fun frontImageFileId(): String = frontImageFileId.getRequired("front_image_file_id")

    /** The ID for the File containing the image of the back of the check. */
    fun backImageFileId(): Optional<String> =
        Optional.ofNullable(backImageFileId.getNullable("back_image_file_id"))

    /** The ID for the Transaction created by the deposit. */
    fun transactionId(): Optional<String> =
        Optional.ofNullable(transactionId.getNullable("transaction_id"))

    /**
     * If your deposit is successfully parsed and accepted by Increase, this will contain details of
     * the parsed check.
     */
    fun depositAcceptance(): Optional<DepositAcceptance> =
        Optional.ofNullable(depositAcceptance.getNullable("deposit_acceptance"))

    /**
     * If your deposit is rejected by Increase, this will contain details as to why it was rejected.
     */
    fun depositRejection(): Optional<DepositRejection> =
        Optional.ofNullable(depositRejection.getNullable("deposit_rejection"))

    /** If your deposit is returned, this will contain details as to why it was returned. */
    fun depositReturn(): Optional<DepositReturn> =
        Optional.ofNullable(depositReturn.getNullable("deposit_return"))

    /**
     * A constant representing the object's type. For this resource it will always be
     * `check_deposit`.
     */
    fun type(): Type = type.getRequired("type")

    /** The deposit's identifier. */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /**
     * The deposited amount in the minor unit of the destination account currency. For dollars, for
     * example, this is cents.
     */
    @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the transfer
     * was created.
     */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the deposit. */
    @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

    /** The status of the Check Deposit. */
    @JsonProperty("status") @ExcludeMissing fun _status() = status

    /** The Account the check was deposited into. */
    @JsonProperty("account_id") @ExcludeMissing fun _accountId() = accountId

    /** The ID for the File containing the image of the front of the check. */
    @JsonProperty("front_image_file_id") @ExcludeMissing fun _frontImageFileId() = frontImageFileId

    /** The ID for the File containing the image of the back of the check. */
    @JsonProperty("back_image_file_id") @ExcludeMissing fun _backImageFileId() = backImageFileId

    /** The ID for the Transaction created by the deposit. */
    @JsonProperty("transaction_id") @ExcludeMissing fun _transactionId() = transactionId

    /**
     * If your deposit is successfully parsed and accepted by Increase, this will contain details of
     * the parsed check.
     */
    @JsonProperty("deposit_acceptance") @ExcludeMissing fun _depositAcceptance() = depositAcceptance

    /**
     * If your deposit is rejected by Increase, this will contain details as to why it was rejected.
     */
    @JsonProperty("deposit_rejection") @ExcludeMissing fun _depositRejection() = depositRejection

    /** If your deposit is returned, this will contain details as to why it was returned. */
    @JsonProperty("deposit_return") @ExcludeMissing fun _depositReturn() = depositReturn

    /**
     * A constant representing the object's type. For this resource it will always be
     * `check_deposit`.
     */
    @JsonProperty("type") @ExcludeMissing fun _type() = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): CheckDeposit = apply {
        if (!validated) {
            id()
            amount()
            createdAt()
            currency()
            status()
            accountId()
            frontImageFileId()
            backImageFileId()
            transactionId()
            depositAcceptance().map { it.validate() }
            depositRejection().map { it.validate() }
            depositReturn().map { it.validate() }
            type()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CheckDeposit &&
            this.id == other.id &&
            this.amount == other.amount &&
            this.createdAt == other.createdAt &&
            this.currency == other.currency &&
            this.status == other.status &&
            this.accountId == other.accountId &&
            this.frontImageFileId == other.frontImageFileId &&
            this.backImageFileId == other.backImageFileId &&
            this.transactionId == other.transactionId &&
            this.depositAcceptance == other.depositAcceptance &&
            this.depositRejection == other.depositRejection &&
            this.depositReturn == other.depositReturn &&
            this.type == other.type &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    id,
                    amount,
                    createdAt,
                    currency,
                    status,
                    accountId,
                    frontImageFileId,
                    backImageFileId,
                    transactionId,
                    depositAcceptance,
                    depositRejection,
                    depositReturn,
                    type,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "CheckDeposit{id=$id, amount=$amount, createdAt=$createdAt, currency=$currency, status=$status, accountId=$accountId, frontImageFileId=$frontImageFileId, backImageFileId=$backImageFileId, transactionId=$transactionId, depositAcceptance=$depositAcceptance, depositRejection=$depositRejection, depositReturn=$depositReturn, type=$type, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var amount: JsonField<Long> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var currency: JsonField<Currency> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var accountId: JsonField<String> = JsonMissing.of()
        private var frontImageFileId: JsonField<String> = JsonMissing.of()
        private var backImageFileId: JsonField<String> = JsonMissing.of()
        private var transactionId: JsonField<String> = JsonMissing.of()
        private var depositAcceptance: JsonField<DepositAcceptance> = JsonMissing.of()
        private var depositRejection: JsonField<DepositRejection> = JsonMissing.of()
        private var depositReturn: JsonField<DepositReturn> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(checkDeposit: CheckDeposit) = apply {
            this.id = checkDeposit.id
            this.amount = checkDeposit.amount
            this.createdAt = checkDeposit.createdAt
            this.currency = checkDeposit.currency
            this.status = checkDeposit.status
            this.accountId = checkDeposit.accountId
            this.frontImageFileId = checkDeposit.frontImageFileId
            this.backImageFileId = checkDeposit.backImageFileId
            this.transactionId = checkDeposit.transactionId
            this.depositAcceptance = checkDeposit.depositAcceptance
            this.depositRejection = checkDeposit.depositRejection
            this.depositReturn = checkDeposit.depositReturn
            this.type = checkDeposit.type
            additionalProperties(checkDeposit.additionalProperties)
        }

        /** The deposit's identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The deposit's identifier. */
        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * The deposited amount in the minor unit of the destination account currency. For dollars,
         * for example, this is cents.
         */
        fun amount(amount: Long) = amount(JsonField.of(amount))

        /**
         * The deposited amount in the minor unit of the destination account currency. For dollars,
         * for example, this is cents.
         */
        @JsonProperty("amount")
        @ExcludeMissing
        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

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

        /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the deposit. */
        fun currency(currency: Currency) = currency(JsonField.of(currency))

        /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the deposit. */
        @JsonProperty("currency")
        @ExcludeMissing
        fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

        /** The status of the Check Deposit. */
        fun status(status: Status) = status(JsonField.of(status))

        /** The status of the Check Deposit. */
        @JsonProperty("status")
        @ExcludeMissing
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** The Account the check was deposited into. */
        fun accountId(accountId: String) = accountId(JsonField.of(accountId))

        /** The Account the check was deposited into. */
        @JsonProperty("account_id")
        @ExcludeMissing
        fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

        /** The ID for the File containing the image of the front of the check. */
        fun frontImageFileId(frontImageFileId: String) =
            frontImageFileId(JsonField.of(frontImageFileId))

        /** The ID for the File containing the image of the front of the check. */
        @JsonProperty("front_image_file_id")
        @ExcludeMissing
        fun frontImageFileId(frontImageFileId: JsonField<String>) = apply {
            this.frontImageFileId = frontImageFileId
        }

        /** The ID for the File containing the image of the back of the check. */
        fun backImageFileId(backImageFileId: String) =
            backImageFileId(JsonField.of(backImageFileId))

        /** The ID for the File containing the image of the back of the check. */
        @JsonProperty("back_image_file_id")
        @ExcludeMissing
        fun backImageFileId(backImageFileId: JsonField<String>) = apply {
            this.backImageFileId = backImageFileId
        }

        /** The ID for the Transaction created by the deposit. */
        fun transactionId(transactionId: String) = transactionId(JsonField.of(transactionId))

        /** The ID for the Transaction created by the deposit. */
        @JsonProperty("transaction_id")
        @ExcludeMissing
        fun transactionId(transactionId: JsonField<String>) = apply {
            this.transactionId = transactionId
        }

        /**
         * If your deposit is successfully parsed and accepted by Increase, this will contain
         * details of the parsed check.
         */
        fun depositAcceptance(depositAcceptance: DepositAcceptance) =
            depositAcceptance(JsonField.of(depositAcceptance))

        /**
         * If your deposit is successfully parsed and accepted by Increase, this will contain
         * details of the parsed check.
         */
        @JsonProperty("deposit_acceptance")
        @ExcludeMissing
        fun depositAcceptance(depositAcceptance: JsonField<DepositAcceptance>) = apply {
            this.depositAcceptance = depositAcceptance
        }

        /**
         * If your deposit is rejected by Increase, this will contain details as to why it was
         * rejected.
         */
        fun depositRejection(depositRejection: DepositRejection) =
            depositRejection(JsonField.of(depositRejection))

        /**
         * If your deposit is rejected by Increase, this will contain details as to why it was
         * rejected.
         */
        @JsonProperty("deposit_rejection")
        @ExcludeMissing
        fun depositRejection(depositRejection: JsonField<DepositRejection>) = apply {
            this.depositRejection = depositRejection
        }

        /** If your deposit is returned, this will contain details as to why it was returned. */
        fun depositReturn(depositReturn: DepositReturn) = depositReturn(JsonField.of(depositReturn))

        /** If your deposit is returned, this will contain details as to why it was returned. */
        @JsonProperty("deposit_return")
        @ExcludeMissing
        fun depositReturn(depositReturn: JsonField<DepositReturn>) = apply {
            this.depositReturn = depositReturn
        }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `check_deposit`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * A constant representing the object's type. For this resource it will always be
         * `check_deposit`.
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

        fun build(): CheckDeposit =
            CheckDeposit(
                id,
                amount,
                createdAt,
                currency,
                status,
                accountId,
                frontImageFileId,
                backImageFileId,
                transactionId,
                depositAcceptance,
                depositRejection,
                depositReturn,
                type,
                additionalProperties.toUnmodifiable(),
            )
    }

    class Currency
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

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

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

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

            @JvmField val PENDING = Status(JsonField.of("pending"))

            @JvmField val SUBMITTED = Status(JsonField.of("submitted"))

            @JvmField val REJECTED = Status(JsonField.of("rejected"))

            @JvmField val RETURNED = Status(JsonField.of("returned"))

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            PENDING,
            SUBMITTED,
            REJECTED,
            RETURNED,
        }

        enum class Value {
            PENDING,
            SUBMITTED,
            REJECTED,
            RETURNED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                PENDING -> Value.PENDING
                SUBMITTED -> Value.SUBMITTED
                REJECTED -> Value.REJECTED
                RETURNED -> Value.RETURNED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                PENDING -> Known.PENDING
                SUBMITTED -> Known.SUBMITTED
                REJECTED -> Known.REJECTED
                RETURNED -> Known.RETURNED
                else -> throw IncreaseInvalidDataException("Unknown Status: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    /**
     * If your deposit is successfully parsed and accepted by Increase, this will contain details of
     * the parsed check.
     */
    @JsonDeserialize(builder = DepositAcceptance.Builder::class)
    @NoAutoDetect
    class DepositAcceptance
    private constructor(
        private val amount: JsonField<Long>,
        private val currency: JsonField<Currency>,
        private val accountNumber: JsonField<String>,
        private val routingNumber: JsonField<String>,
        private val auxiliaryOnUs: JsonField<String>,
        private val serialNumber: JsonField<String>,
        private val checkDepositId: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /**
         * The amount to be deposited in the minor unit of the transaction's currency. For dollars,
         * for example, this is cents.
         */
        fun amount(): Long = amount.getRequired("amount")

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
         * currency.
         */
        fun currency(): Currency = currency.getRequired("currency")

        /** The account number printed on the check. */
        fun accountNumber(): String = accountNumber.getRequired("account_number")

        /** The routing number printed on the check. */
        fun routingNumber(): String = routingNumber.getRequired("routing_number")

        /**
         * An additional line of metadata printed on the check. This typically includes the check
         * number for business checks.
         */
        fun auxiliaryOnUs(): Optional<String> =
            Optional.ofNullable(auxiliaryOnUs.getNullable("auxiliary_on_us"))

        /**
         * The check serial number, if present, for consumer checks. For business checks, the serial
         * number is usually in the `auxiliary_on_us` field.
         */
        fun serialNumber(): Optional<String> =
            Optional.ofNullable(serialNumber.getNullable("serial_number"))

        /** The ID of the Check Deposit that was accepted. */
        fun checkDepositId(): String = checkDepositId.getRequired("check_deposit_id")

        /**
         * The amount to be deposited in the minor unit of the transaction's currency. For dollars,
         * for example, this is cents.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
         * currency.
         */
        @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

        /** The account number printed on the check. */
        @JsonProperty("account_number") @ExcludeMissing fun _accountNumber() = accountNumber

        /** The routing number printed on the check. */
        @JsonProperty("routing_number") @ExcludeMissing fun _routingNumber() = routingNumber

        /**
         * An additional line of metadata printed on the check. This typically includes the check
         * number for business checks.
         */
        @JsonProperty("auxiliary_on_us") @ExcludeMissing fun _auxiliaryOnUs() = auxiliaryOnUs

        /**
         * The check serial number, if present, for consumer checks. For business checks, the serial
         * number is usually in the `auxiliary_on_us` field.
         */
        @JsonProperty("serial_number") @ExcludeMissing fun _serialNumber() = serialNumber

        /** The ID of the Check Deposit that was accepted. */
        @JsonProperty("check_deposit_id") @ExcludeMissing fun _checkDepositId() = checkDepositId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): DepositAcceptance = apply {
            if (!validated) {
                amount()
                currency()
                accountNumber()
                routingNumber()
                auxiliaryOnUs()
                serialNumber()
                checkDepositId()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is DepositAcceptance &&
                this.amount == other.amount &&
                this.currency == other.currency &&
                this.accountNumber == other.accountNumber &&
                this.routingNumber == other.routingNumber &&
                this.auxiliaryOnUs == other.auxiliaryOnUs &&
                this.serialNumber == other.serialNumber &&
                this.checkDepositId == other.checkDepositId &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        amount,
                        currency,
                        accountNumber,
                        routingNumber,
                        auxiliaryOnUs,
                        serialNumber,
                        checkDepositId,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "DepositAcceptance{amount=$amount, currency=$currency, accountNumber=$accountNumber, routingNumber=$routingNumber, auxiliaryOnUs=$auxiliaryOnUs, serialNumber=$serialNumber, checkDepositId=$checkDepositId, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var amount: JsonField<Long> = JsonMissing.of()
            private var currency: JsonField<Currency> = JsonMissing.of()
            private var accountNumber: JsonField<String> = JsonMissing.of()
            private var routingNumber: JsonField<String> = JsonMissing.of()
            private var auxiliaryOnUs: JsonField<String> = JsonMissing.of()
            private var serialNumber: JsonField<String> = JsonMissing.of()
            private var checkDepositId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(depositAcceptance: DepositAcceptance) = apply {
                this.amount = depositAcceptance.amount
                this.currency = depositAcceptance.currency
                this.accountNumber = depositAcceptance.accountNumber
                this.routingNumber = depositAcceptance.routingNumber
                this.auxiliaryOnUs = depositAcceptance.auxiliaryOnUs
                this.serialNumber = depositAcceptance.serialNumber
                this.checkDepositId = depositAcceptance.checkDepositId
                additionalProperties(depositAcceptance.additionalProperties)
            }

            /**
             * The amount to be deposited in the minor unit of the transaction's currency. For
             * dollars, for example, this is cents.
             */
            fun amount(amount: Long) = amount(JsonField.of(amount))

            /**
             * The amount to be deposited in the minor unit of the transaction's currency. For
             * dollars, for example, this is cents.
             */
            @JsonProperty("amount")
            @ExcludeMissing
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
             * currency.
             */
            fun currency(currency: Currency) = currency(JsonField.of(currency))

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
             * currency.
             */
            @JsonProperty("currency")
            @ExcludeMissing
            fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

            /** The account number printed on the check. */
            fun accountNumber(accountNumber: String) = accountNumber(JsonField.of(accountNumber))

            /** The account number printed on the check. */
            @JsonProperty("account_number")
            @ExcludeMissing
            fun accountNumber(accountNumber: JsonField<String>) = apply {
                this.accountNumber = accountNumber
            }

            /** The routing number printed on the check. */
            fun routingNumber(routingNumber: String) = routingNumber(JsonField.of(routingNumber))

            /** The routing number printed on the check. */
            @JsonProperty("routing_number")
            @ExcludeMissing
            fun routingNumber(routingNumber: JsonField<String>) = apply {
                this.routingNumber = routingNumber
            }

            /**
             * An additional line of metadata printed on the check. This typically includes the
             * check number for business checks.
             */
            fun auxiliaryOnUs(auxiliaryOnUs: String) = auxiliaryOnUs(JsonField.of(auxiliaryOnUs))

            /**
             * An additional line of metadata printed on the check. This typically includes the
             * check number for business checks.
             */
            @JsonProperty("auxiliary_on_us")
            @ExcludeMissing
            fun auxiliaryOnUs(auxiliaryOnUs: JsonField<String>) = apply {
                this.auxiliaryOnUs = auxiliaryOnUs
            }

            /**
             * The check serial number, if present, for consumer checks. For business checks, the
             * serial number is usually in the `auxiliary_on_us` field.
             */
            fun serialNumber(serialNumber: String) = serialNumber(JsonField.of(serialNumber))

            /**
             * The check serial number, if present, for consumer checks. For business checks, the
             * serial number is usually in the `auxiliary_on_us` field.
             */
            @JsonProperty("serial_number")
            @ExcludeMissing
            fun serialNumber(serialNumber: JsonField<String>) = apply {
                this.serialNumber = serialNumber
            }

            /** The ID of the Check Deposit that was accepted. */
            fun checkDepositId(checkDepositId: String) =
                checkDepositId(JsonField.of(checkDepositId))

            /** The ID of the Check Deposit that was accepted. */
            @JsonProperty("check_deposit_id")
            @ExcludeMissing
            fun checkDepositId(checkDepositId: JsonField<String>) = apply {
                this.checkDepositId = checkDepositId
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

            fun build(): DepositAcceptance =
                DepositAcceptance(
                    amount,
                    currency,
                    accountNumber,
                    routingNumber,
                    auxiliaryOnUs,
                    serialNumber,
                    checkDepositId,
                    additionalProperties.toUnmodifiable(),
                )
        }

        class Currency
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) {

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
    }

    /**
     * If your deposit is rejected by Increase, this will contain details as to why it was rejected.
     */
    @JsonDeserialize(builder = DepositRejection.Builder::class)
    @NoAutoDetect
    class DepositRejection
    private constructor(
        private val amount: JsonField<Long>,
        private val currency: JsonField<Currency>,
        private val reason: JsonField<Reason>,
        private val rejectedAt: JsonField<OffsetDateTime>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /**
         * The rejected amount in the minor unit of check's currency. For dollars, for example, this
         * is cents.
         */
        fun amount(): Long = amount.getRequired("amount")

        /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the check's currency. */
        fun currency(): Currency = currency.getRequired("currency")

        /** Why the check deposit was rejected. */
        fun reason(): Reason = reason.getRequired("reason")

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the check
         * deposit was rejected.
         */
        fun rejectedAt(): OffsetDateTime = rejectedAt.getRequired("rejected_at")

        /**
         * The rejected amount in the minor unit of check's currency. For dollars, for example, this
         * is cents.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

        /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the check's currency. */
        @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

        /** Why the check deposit was rejected. */
        @JsonProperty("reason") @ExcludeMissing fun _reason() = reason

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the check
         * deposit was rejected.
         */
        @JsonProperty("rejected_at") @ExcludeMissing fun _rejectedAt() = rejectedAt

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): DepositRejection = apply {
            if (!validated) {
                amount()
                currency()
                reason()
                rejectedAt()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is DepositRejection &&
                this.amount == other.amount &&
                this.currency == other.currency &&
                this.reason == other.reason &&
                this.rejectedAt == other.rejectedAt &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        amount,
                        currency,
                        reason,
                        rejectedAt,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "DepositRejection{amount=$amount, currency=$currency, reason=$reason, rejectedAt=$rejectedAt, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var amount: JsonField<Long> = JsonMissing.of()
            private var currency: JsonField<Currency> = JsonMissing.of()
            private var reason: JsonField<Reason> = JsonMissing.of()
            private var rejectedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(depositRejection: DepositRejection) = apply {
                this.amount = depositRejection.amount
                this.currency = depositRejection.currency
                this.reason = depositRejection.reason
                this.rejectedAt = depositRejection.rejectedAt
                additionalProperties(depositRejection.additionalProperties)
            }

            /**
             * The rejected amount in the minor unit of check's currency. For dollars, for example,
             * this is cents.
             */
            fun amount(amount: Long) = amount(JsonField.of(amount))

            /**
             * The rejected amount in the minor unit of check's currency. For dollars, for example,
             * this is cents.
             */
            @JsonProperty("amount")
            @ExcludeMissing
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the check's currency.
             */
            fun currency(currency: Currency) = currency(JsonField.of(currency))

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the check's currency.
             */
            @JsonProperty("currency")
            @ExcludeMissing
            fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

            /** Why the check deposit was rejected. */
            fun reason(reason: Reason) = reason(JsonField.of(reason))

            /** Why the check deposit was rejected. */
            @JsonProperty("reason")
            @ExcludeMissing
            fun reason(reason: JsonField<Reason>) = apply { this.reason = reason }

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * check deposit was rejected.
             */
            fun rejectedAt(rejectedAt: OffsetDateTime) = rejectedAt(JsonField.of(rejectedAt))

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * check deposit was rejected.
             */
            @JsonProperty("rejected_at")
            @ExcludeMissing
            fun rejectedAt(rejectedAt: JsonField<OffsetDateTime>) = apply {
                this.rejectedAt = rejectedAt
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

            fun build(): DepositRejection =
                DepositRejection(
                    amount,
                    currency,
                    reason,
                    rejectedAt,
                    additionalProperties.toUnmodifiable(),
                )
        }

        class Currency
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) {

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

        class Reason
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) {

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

                @JvmField val INCOMPLETE_IMAGE = Reason(JsonField.of("incomplete_image"))

                @JvmField val DUPLICATE = Reason(JsonField.of("duplicate"))

                @JvmField val POOR_IMAGE_QUALITY = Reason(JsonField.of("poor_image_quality"))

                @JvmField val INCORRECT_AMOUNT = Reason(JsonField.of("incorrect_amount"))

                @JvmField val INCORRECT_RECIPIENT = Reason(JsonField.of("incorrect_recipient"))

                @JvmField
                val NOT_ELIGIBLE_FOR_MOBILE_DEPOSIT =
                    Reason(JsonField.of("not_eligible_for_mobile_deposit"))

                @JvmField
                val MISSING_REQUIRED_DATA_ELEMENTS =
                    Reason(JsonField.of("missing_required_data_elements"))

                @JvmField val UNKNOWN = Reason(JsonField.of("unknown"))

                @JvmStatic fun of(value: String) = Reason(JsonField.of(value))
            }

            enum class Known {
                INCOMPLETE_IMAGE,
                DUPLICATE,
                POOR_IMAGE_QUALITY,
                INCORRECT_AMOUNT,
                INCORRECT_RECIPIENT,
                NOT_ELIGIBLE_FOR_MOBILE_DEPOSIT,
                MISSING_REQUIRED_DATA_ELEMENTS,
                UNKNOWN,
            }

            enum class Value {
                INCOMPLETE_IMAGE,
                DUPLICATE,
                POOR_IMAGE_QUALITY,
                INCORRECT_AMOUNT,
                INCORRECT_RECIPIENT,
                NOT_ELIGIBLE_FOR_MOBILE_DEPOSIT,
                MISSING_REQUIRED_DATA_ELEMENTS,
                UNKNOWN,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    INCOMPLETE_IMAGE -> Value.INCOMPLETE_IMAGE
                    DUPLICATE -> Value.DUPLICATE
                    POOR_IMAGE_QUALITY -> Value.POOR_IMAGE_QUALITY
                    INCORRECT_AMOUNT -> Value.INCORRECT_AMOUNT
                    INCORRECT_RECIPIENT -> Value.INCORRECT_RECIPIENT
                    NOT_ELIGIBLE_FOR_MOBILE_DEPOSIT -> Value.NOT_ELIGIBLE_FOR_MOBILE_DEPOSIT
                    MISSING_REQUIRED_DATA_ELEMENTS -> Value.MISSING_REQUIRED_DATA_ELEMENTS
                    UNKNOWN -> Value.UNKNOWN
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    INCOMPLETE_IMAGE -> Known.INCOMPLETE_IMAGE
                    DUPLICATE -> Known.DUPLICATE
                    POOR_IMAGE_QUALITY -> Known.POOR_IMAGE_QUALITY
                    INCORRECT_AMOUNT -> Known.INCORRECT_AMOUNT
                    INCORRECT_RECIPIENT -> Known.INCORRECT_RECIPIENT
                    NOT_ELIGIBLE_FOR_MOBILE_DEPOSIT -> Known.NOT_ELIGIBLE_FOR_MOBILE_DEPOSIT
                    MISSING_REQUIRED_DATA_ELEMENTS -> Known.MISSING_REQUIRED_DATA_ELEMENTS
                    UNKNOWN -> Known.UNKNOWN
                    else -> throw IncreaseInvalidDataException("Unknown Reason: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }
    }

    /** If your deposit is returned, this will contain details as to why it was returned. */
    @JsonDeserialize(builder = DepositReturn.Builder::class)
    @NoAutoDetect
    class DepositReturn
    private constructor(
        private val amount: JsonField<Long>,
        private val returnedAt: JsonField<OffsetDateTime>,
        private val currency: JsonField<Currency>,
        private val checkDepositId: JsonField<String>,
        private val transactionId: JsonField<String>,
        private val returnReason: JsonField<ReturnReason>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /**
         * The amount in the minor unit of the transaction's currency. For dollars, for example,
         * this is cents.
         */
        fun amount(): Long = amount.getRequired("amount")

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the check
         * deposit was returned.
         */
        fun returnedAt(): OffsetDateTime = returnedAt.getRequired("returned_at")

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
         * currency.
         */
        fun currency(): Currency = currency.getRequired("currency")

        /** The identifier of the Check Deposit that was returned. */
        fun checkDepositId(): String = checkDepositId.getRequired("check_deposit_id")

        /**
         * The identifier of the transaction that reversed the original check deposit transaction.
         */
        fun transactionId(): String = transactionId.getRequired("transaction_id")

        fun returnReason(): ReturnReason = returnReason.getRequired("return_reason")

        /**
         * The amount in the minor unit of the transaction's currency. For dollars, for example,
         * this is cents.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the check
         * deposit was returned.
         */
        @JsonProperty("returned_at") @ExcludeMissing fun _returnedAt() = returnedAt

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
         * currency.
         */
        @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

        /** The identifier of the Check Deposit that was returned. */
        @JsonProperty("check_deposit_id") @ExcludeMissing fun _checkDepositId() = checkDepositId

        /**
         * The identifier of the transaction that reversed the original check deposit transaction.
         */
        @JsonProperty("transaction_id") @ExcludeMissing fun _transactionId() = transactionId

        @JsonProperty("return_reason") @ExcludeMissing fun _returnReason() = returnReason

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): DepositReturn = apply {
            if (!validated) {
                amount()
                returnedAt()
                currency()
                checkDepositId()
                transactionId()
                returnReason()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is DepositReturn &&
                this.amount == other.amount &&
                this.returnedAt == other.returnedAt &&
                this.currency == other.currency &&
                this.checkDepositId == other.checkDepositId &&
                this.transactionId == other.transactionId &&
                this.returnReason == other.returnReason &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        amount,
                        returnedAt,
                        currency,
                        checkDepositId,
                        transactionId,
                        returnReason,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "DepositReturn{amount=$amount, returnedAt=$returnedAt, currency=$currency, checkDepositId=$checkDepositId, transactionId=$transactionId, returnReason=$returnReason, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var amount: JsonField<Long> = JsonMissing.of()
            private var returnedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var currency: JsonField<Currency> = JsonMissing.of()
            private var checkDepositId: JsonField<String> = JsonMissing.of()
            private var transactionId: JsonField<String> = JsonMissing.of()
            private var returnReason: JsonField<ReturnReason> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(depositReturn: DepositReturn) = apply {
                this.amount = depositReturn.amount
                this.returnedAt = depositReturn.returnedAt
                this.currency = depositReturn.currency
                this.checkDepositId = depositReturn.checkDepositId
                this.transactionId = depositReturn.transactionId
                this.returnReason = depositReturn.returnReason
                additionalProperties(depositReturn.additionalProperties)
            }

            /**
             * The amount in the minor unit of the transaction's currency. For dollars, for example,
             * this is cents.
             */
            fun amount(amount: Long) = amount(JsonField.of(amount))

            /**
             * The amount in the minor unit of the transaction's currency. For dollars, for example,
             * this is cents.
             */
            @JsonProperty("amount")
            @ExcludeMissing
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * check deposit was returned.
             */
            fun returnedAt(returnedAt: OffsetDateTime) = returnedAt(JsonField.of(returnedAt))

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * check deposit was returned.
             */
            @JsonProperty("returned_at")
            @ExcludeMissing
            fun returnedAt(returnedAt: JsonField<OffsetDateTime>) = apply {
                this.returnedAt = returnedAt
            }

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
             * currency.
             */
            fun currency(currency: Currency) = currency(JsonField.of(currency))

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
             * currency.
             */
            @JsonProperty("currency")
            @ExcludeMissing
            fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

            /** The identifier of the Check Deposit that was returned. */
            fun checkDepositId(checkDepositId: String) =
                checkDepositId(JsonField.of(checkDepositId))

            /** The identifier of the Check Deposit that was returned. */
            @JsonProperty("check_deposit_id")
            @ExcludeMissing
            fun checkDepositId(checkDepositId: JsonField<String>) = apply {
                this.checkDepositId = checkDepositId
            }

            /**
             * The identifier of the transaction that reversed the original check deposit
             * transaction.
             */
            fun transactionId(transactionId: String) = transactionId(JsonField.of(transactionId))

            /**
             * The identifier of the transaction that reversed the original check deposit
             * transaction.
             */
            @JsonProperty("transaction_id")
            @ExcludeMissing
            fun transactionId(transactionId: JsonField<String>) = apply {
                this.transactionId = transactionId
            }

            fun returnReason(returnReason: ReturnReason) = returnReason(JsonField.of(returnReason))

            @JsonProperty("return_reason")
            @ExcludeMissing
            fun returnReason(returnReason: JsonField<ReturnReason>) = apply {
                this.returnReason = returnReason
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

            fun build(): DepositReturn =
                DepositReturn(
                    amount,
                    returnedAt,
                    currency,
                    checkDepositId,
                    transactionId,
                    returnReason,
                    additionalProperties.toUnmodifiable(),
                )
        }

        class Currency
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) {

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

        class ReturnReason
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ReturnReason && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField
                val ACH_CONVERSION_NOT_SUPPORTED =
                    ReturnReason(JsonField.of("ach_conversion_not_supported"))

                @JvmField val CLOSED_ACCOUNT = ReturnReason(JsonField.of("closed_account"))

                @JvmField
                val DUPLICATE_SUBMISSION = ReturnReason(JsonField.of("duplicate_submission"))

                @JvmField val INSUFFICIENT_FUNDS = ReturnReason(JsonField.of("insufficient_funds"))

                @JvmField val NO_ACCOUNT = ReturnReason(JsonField.of("no_account"))

                @JvmField val NOT_AUTHORIZED = ReturnReason(JsonField.of("not_authorized"))

                @JvmField val STALE_DATED = ReturnReason(JsonField.of("stale_dated"))

                @JvmField val STOP_PAYMENT = ReturnReason(JsonField.of("stop_payment"))

                @JvmField val UNKNOWN_REASON = ReturnReason(JsonField.of("unknown_reason"))

                @JvmField val UNMATCHED_DETAILS = ReturnReason(JsonField.of("unmatched_details"))

                @JvmField val UNREADABLE_IMAGE = ReturnReason(JsonField.of("unreadable_image"))

                @JvmStatic fun of(value: String) = ReturnReason(JsonField.of(value))
            }

            enum class Known {
                ACH_CONVERSION_NOT_SUPPORTED,
                CLOSED_ACCOUNT,
                DUPLICATE_SUBMISSION,
                INSUFFICIENT_FUNDS,
                NO_ACCOUNT,
                NOT_AUTHORIZED,
                STALE_DATED,
                STOP_PAYMENT,
                UNKNOWN_REASON,
                UNMATCHED_DETAILS,
                UNREADABLE_IMAGE,
            }

            enum class Value {
                ACH_CONVERSION_NOT_SUPPORTED,
                CLOSED_ACCOUNT,
                DUPLICATE_SUBMISSION,
                INSUFFICIENT_FUNDS,
                NO_ACCOUNT,
                NOT_AUTHORIZED,
                STALE_DATED,
                STOP_PAYMENT,
                UNKNOWN_REASON,
                UNMATCHED_DETAILS,
                UNREADABLE_IMAGE,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    ACH_CONVERSION_NOT_SUPPORTED -> Value.ACH_CONVERSION_NOT_SUPPORTED
                    CLOSED_ACCOUNT -> Value.CLOSED_ACCOUNT
                    DUPLICATE_SUBMISSION -> Value.DUPLICATE_SUBMISSION
                    INSUFFICIENT_FUNDS -> Value.INSUFFICIENT_FUNDS
                    NO_ACCOUNT -> Value.NO_ACCOUNT
                    NOT_AUTHORIZED -> Value.NOT_AUTHORIZED
                    STALE_DATED -> Value.STALE_DATED
                    STOP_PAYMENT -> Value.STOP_PAYMENT
                    UNKNOWN_REASON -> Value.UNKNOWN_REASON
                    UNMATCHED_DETAILS -> Value.UNMATCHED_DETAILS
                    UNREADABLE_IMAGE -> Value.UNREADABLE_IMAGE
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    ACH_CONVERSION_NOT_SUPPORTED -> Known.ACH_CONVERSION_NOT_SUPPORTED
                    CLOSED_ACCOUNT -> Known.CLOSED_ACCOUNT
                    DUPLICATE_SUBMISSION -> Known.DUPLICATE_SUBMISSION
                    INSUFFICIENT_FUNDS -> Known.INSUFFICIENT_FUNDS
                    NO_ACCOUNT -> Known.NO_ACCOUNT
                    NOT_AUTHORIZED -> Known.NOT_AUTHORIZED
                    STALE_DATED -> Known.STALE_DATED
                    STOP_PAYMENT -> Known.STOP_PAYMENT
                    UNKNOWN_REASON -> Known.UNKNOWN_REASON
                    UNMATCHED_DETAILS -> Known.UNMATCHED_DETAILS
                    UNREADABLE_IMAGE -> Known.UNREADABLE_IMAGE
                    else -> throw IncreaseInvalidDataException("Unknown ReturnReason: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }
    }

    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

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

            @JvmField val CHECK_DEPOSIT = Type(JsonField.of("check_deposit"))

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            CHECK_DEPOSIT,
        }

        enum class Value {
            CHECK_DEPOSIT,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                CHECK_DEPOSIT -> Value.CHECK_DEPOSIT
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                CHECK_DEPOSIT -> Known.CHECK_DEPOSIT
                else -> throw IncreaseInvalidDataException("Unknown Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
