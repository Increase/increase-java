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
import java.util.Objects
import java.util.Optional

/**
 * When using IntraFi, each account's balance over the standard FDIC insurance amount are swept to
 * various other institutions. Funds are rebalanced across banks as needed once per business day.
 */
@NoAutoDetect
class IntrafiBalance
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("balances")
    @ExcludeMissing
    private val balances: JsonField<List<Balance>> = JsonMissing.of(),
    @JsonProperty("currency")
    @ExcludeMissing
    private val currency: JsonField<Currency> = JsonMissing.of(),
    @JsonProperty("effective_date")
    @ExcludeMissing
    private val effectiveDate: JsonField<LocalDate> = JsonMissing.of(),
    @JsonProperty("total_balance")
    @ExcludeMissing
    private val totalBalance: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The identifier of this balance. */
    fun id(): String = id.getRequired("id")

    /**
     * Each entry represents a balance held at a different bank. IntraFi separates the total balance
     * across many participating banks in the network.
     */
    fun balances(): List<Balance> = balances.getRequired("balances")

    /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the account currency. */
    fun currency(): Currency = currency.getRequired("currency")

    /** The date this balance reflects. */
    fun effectiveDate(): LocalDate = effectiveDate.getRequired("effective_date")

    /**
     * The total balance, in minor units of `currency`. Increase reports this balance to IntraFi
     * daily.
     */
    fun totalBalance(): Long = totalBalance.getRequired("total_balance")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `intrafi_balance`.
     */
    fun type(): Type = type.getRequired("type")

    /** The identifier of this balance. */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Each entry represents a balance held at a different bank. IntraFi separates the total balance
     * across many participating banks in the network.
     */
    @JsonProperty("balances") @ExcludeMissing fun _balances(): JsonField<List<Balance>> = balances

    /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the account currency. */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<Currency> = currency

    /** The date this balance reflects. */
    @JsonProperty("effective_date")
    @ExcludeMissing
    fun _effectiveDate(): JsonField<LocalDate> = effectiveDate

    /**
     * The total balance, in minor units of `currency`. Increase reports this balance to IntraFi
     * daily.
     */
    @JsonProperty("total_balance")
    @ExcludeMissing
    fun _totalBalance(): JsonField<Long> = totalBalance

    /**
     * A constant representing the object's type. For this resource it will always be
     * `intrafi_balance`.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): IntrafiBalance = apply {
        if (validated) {
            return@apply
        }

        id()
        balances().forEach { it.validate() }
        currency()
        effectiveDate()
        totalBalance()
        type()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String>? = null
        private var balances: JsonField<MutableList<Balance>>? = null
        private var currency: JsonField<Currency>? = null
        private var effectiveDate: JsonField<LocalDate>? = null
        private var totalBalance: JsonField<Long>? = null
        private var type: JsonField<Type>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(intrafiBalance: IntrafiBalance) = apply {
            id = intrafiBalance.id
            balances = intrafiBalance.balances.map { it.toMutableList() }
            currency = intrafiBalance.currency
            effectiveDate = intrafiBalance.effectiveDate
            totalBalance = intrafiBalance.totalBalance
            type = intrafiBalance.type
            additionalProperties = intrafiBalance.additionalProperties.toMutableMap()
        }

        /** The identifier of this balance. */
        fun id(id: String) = id(JsonField.of(id))

        /** The identifier of this balance. */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * Each entry represents a balance held at a different bank. IntraFi separates the total
         * balance across many participating banks in the network.
         */
        fun balances(balances: List<Balance>) = balances(JsonField.of(balances))

        /**
         * Each entry represents a balance held at a different bank. IntraFi separates the total
         * balance across many participating banks in the network.
         */
        fun balances(balances: JsonField<List<Balance>>) = apply {
            this.balances = balances.map { it.toMutableList() }
        }

        /**
         * Each entry represents a balance held at a different bank. IntraFi separates the total
         * balance across many participating banks in the network.
         */
        fun addBalance(balance: Balance) = apply {
            balances =
                (balances ?: JsonField.of(mutableListOf())).apply {
                    asKnown()
                        .orElseThrow {
                            IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            )
                        }
                        .add(balance)
                }
        }

        /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the account currency. */
        fun currency(currency: Currency) = currency(JsonField.of(currency))

        /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the account currency. */
        fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

        /** The date this balance reflects. */
        fun effectiveDate(effectiveDate: LocalDate) = effectiveDate(JsonField.of(effectiveDate))

        /** The date this balance reflects. */
        fun effectiveDate(effectiveDate: JsonField<LocalDate>) = apply {
            this.effectiveDate = effectiveDate
        }

        /**
         * The total balance, in minor units of `currency`. Increase reports this balance to IntraFi
         * daily.
         */
        fun totalBalance(totalBalance: Long) = totalBalance(JsonField.of(totalBalance))

        /**
         * The total balance, in minor units of `currency`. Increase reports this balance to IntraFi
         * daily.
         */
        fun totalBalance(totalBalance: JsonField<Long>) = apply { this.totalBalance = totalBalance }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `intrafi_balance`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * A constant representing the object's type. For this resource it will always be
         * `intrafi_balance`.
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

        fun build(): IntrafiBalance =
            IntrafiBalance(
                checkRequired("id", id),
                checkRequired("balances", balances).map { it.toImmutable() },
                checkRequired("currency", currency),
                checkRequired("effectiveDate", effectiveDate),
                checkRequired("totalBalance", totalBalance),
                checkRequired("type", type),
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class Balance
    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("balance")
        @ExcludeMissing
        private val balance: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("bank")
        @ExcludeMissing
        private val bank: JsonField<String> = JsonMissing.of(),
        @JsonProperty("bank_location")
        @ExcludeMissing
        private val bankLocation: JsonField<BankLocation> = JsonMissing.of(),
        @JsonProperty("fdic_certificate_number")
        @ExcludeMissing
        private val fdicCertificateNumber: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The identifier of this balance. */
        fun id(): String = id.getRequired("id")

        /** The balance, in minor units of `currency`, held with this bank. */
        fun balance(): Long = balance.getRequired("balance")

        /** The name of the bank holding these funds. */
        fun bank(): String = bank.getRequired("bank")

        /** The primary location of the bank. */
        fun bankLocation(): Optional<BankLocation> =
            Optional.ofNullable(bankLocation.getNullable("bank_location"))

        /**
         * The Federal Deposit Insurance Corporation (FDIC) certificate number of the bank. Because
         * many banks have the same or similar names, this can be used to uniquely identify the
         * institution.
         */
        fun fdicCertificateNumber(): String =
            fdicCertificateNumber.getRequired("fdic_certificate_number")

        /** The identifier of this balance. */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /** The balance, in minor units of `currency`, held with this bank. */
        @JsonProperty("balance") @ExcludeMissing fun _balance(): JsonField<Long> = balance

        /** The name of the bank holding these funds. */
        @JsonProperty("bank") @ExcludeMissing fun _bank(): JsonField<String> = bank

        /** The primary location of the bank. */
        @JsonProperty("bank_location")
        @ExcludeMissing
        fun _bankLocation(): JsonField<BankLocation> = bankLocation

        /**
         * The Federal Deposit Insurance Corporation (FDIC) certificate number of the bank. Because
         * many banks have the same or similar names, this can be used to uniquely identify the
         * institution.
         */
        @JsonProperty("fdic_certificate_number")
        @ExcludeMissing
        fun _fdicCertificateNumber(): JsonField<String> = fdicCertificateNumber

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Balance = apply {
            if (validated) {
                return@apply
            }

            id()
            balance()
            bank()
            bankLocation().ifPresent { it.validate() }
            fdicCertificateNumber()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var id: JsonField<String>? = null
            private var balance: JsonField<Long>? = null
            private var bank: JsonField<String>? = null
            private var bankLocation: JsonField<BankLocation>? = null
            private var fdicCertificateNumber: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(balance: Balance) = apply {
                id = balance.id
                this.balance = balance.balance
                bank = balance.bank
                bankLocation = balance.bankLocation
                fdicCertificateNumber = balance.fdicCertificateNumber
                additionalProperties = balance.additionalProperties.toMutableMap()
            }

            /** The identifier of this balance. */
            fun id(id: String) = id(JsonField.of(id))

            /** The identifier of this balance. */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** The balance, in minor units of `currency`, held with this bank. */
            fun balance(balance: Long) = balance(JsonField.of(balance))

            /** The balance, in minor units of `currency`, held with this bank. */
            fun balance(balance: JsonField<Long>) = apply { this.balance = balance }

            /** The name of the bank holding these funds. */
            fun bank(bank: String) = bank(JsonField.of(bank))

            /** The name of the bank holding these funds. */
            fun bank(bank: JsonField<String>) = apply { this.bank = bank }

            /** The primary location of the bank. */
            fun bankLocation(bankLocation: BankLocation?) =
                bankLocation(JsonField.ofNullable(bankLocation))

            /** The primary location of the bank. */
            fun bankLocation(bankLocation: Optional<BankLocation>) =
                bankLocation(bankLocation.orElse(null))

            /** The primary location of the bank. */
            fun bankLocation(bankLocation: JsonField<BankLocation>) = apply {
                this.bankLocation = bankLocation
            }

            /**
             * The Federal Deposit Insurance Corporation (FDIC) certificate number of the bank.
             * Because many banks have the same or similar names, this can be used to uniquely
             * identify the institution.
             */
            fun fdicCertificateNumber(fdicCertificateNumber: String) =
                fdicCertificateNumber(JsonField.of(fdicCertificateNumber))

            /**
             * The Federal Deposit Insurance Corporation (FDIC) certificate number of the bank.
             * Because many banks have the same or similar names, this can be used to uniquely
             * identify the institution.
             */
            fun fdicCertificateNumber(fdicCertificateNumber: JsonField<String>) = apply {
                this.fdicCertificateNumber = fdicCertificateNumber
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

            fun build(): Balance =
                Balance(
                    checkRequired("id", id),
                    checkRequired("balance", balance),
                    checkRequired("bank", bank),
                    checkRequired("bankLocation", bankLocation),
                    checkRequired("fdicCertificateNumber", fdicCertificateNumber),
                    additionalProperties.toImmutable(),
                )
        }

        /** The primary location of the bank. */
        @NoAutoDetect
        class BankLocation
        @JsonCreator
        private constructor(
            @JsonProperty("city")
            @ExcludeMissing
            private val city: JsonField<String> = JsonMissing.of(),
            @JsonProperty("state")
            @ExcludeMissing
            private val state: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The bank's city. */
            fun city(): String = city.getRequired("city")

            /** The bank's state. */
            fun state(): String = state.getRequired("state")

            /** The bank's city. */
            @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

            /** The bank's state. */
            @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<String> = state

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): BankLocation = apply {
                if (validated) {
                    return@apply
                }

                city()
                state()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var city: JsonField<String>? = null
                private var state: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(bankLocation: BankLocation) = apply {
                    city = bankLocation.city
                    state = bankLocation.state
                    additionalProperties = bankLocation.additionalProperties.toMutableMap()
                }

                /** The bank's city. */
                fun city(city: String) = city(JsonField.of(city))

                /** The bank's city. */
                fun city(city: JsonField<String>) = apply { this.city = city }

                /** The bank's state. */
                fun state(state: String) = state(JsonField.of(state))

                /** The bank's state. */
                fun state(state: JsonField<String>) = apply { this.state = state }

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

                fun build(): BankLocation =
                    BankLocation(
                        checkRequired("city", city),
                        checkRequired("state", state),
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is BankLocation && city == other.city && state == other.state && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(city, state, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "BankLocation{city=$city, state=$state, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Balance && id == other.id && balance == other.balance && bank == other.bank && bankLocation == other.bankLocation && fdicCertificateNumber == other.fdicCertificateNumber && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, balance, bank, bankLocation, fdicCertificateNumber, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Balance{id=$id, balance=$balance, bank=$bank, bankLocation=$bankLocation, fdicCertificateNumber=$fdicCertificateNumber, additionalProperties=$additionalProperties}"
    }

    /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the account currency. */
    class Currency
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val CAD = of("CAD")

            @JvmField val CHF = of("CHF")

            @JvmField val EUR = of("EUR")

            @JvmField val GBP = of("GBP")

            @JvmField val JPY = of("JPY")

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

    /**
     * A constant representing the object's type. For this resource it will always be
     * `intrafi_balance`.
     */
    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val INTRAFI_BALANCE = of("intrafi_balance")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            INTRAFI_BALANCE,
        }

        enum class Value {
            INTRAFI_BALANCE,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                INTRAFI_BALANCE -> Value.INTRAFI_BALANCE
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                INTRAFI_BALANCE -> Known.INTRAFI_BALANCE
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

        return /* spotless:off */ other is IntrafiBalance && id == other.id && balances == other.balances && currency == other.currency && effectiveDate == other.effectiveDate && totalBalance == other.totalBalance && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, balances, currency, effectiveDate, totalBalance, type, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "IntrafiBalance{id=$id, balances=$balances, currency=$currency, effectiveDate=$effectiveDate, totalBalance=$totalBalance, type=$type, additionalProperties=$additionalProperties}"
}
