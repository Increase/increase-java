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
import com.increase.api.core.toImmutable
import com.increase.api.errors.IncreaseInvalidDataException
import java.time.LocalDate
import java.util.Objects
import java.util.Optional

/**
 * Additional information about a card purchase (e.g., settlement or refund), such as level 3 line
 * item data.
 */
@JsonDeserialize(builder = CardPurchaseSupplement.Builder::class)
@NoAutoDetect
class CardPurchaseSupplement
private constructor(
    private val cardPaymentId: JsonField<String>,
    private val id: JsonField<String>,
    private val invoice: JsonField<Invoice>,
    private val lineItems: JsonField<List<LineItem>>,
    private val transactionId: JsonField<String>,
    private val type: JsonField<Type>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /** The ID of the Card Payment this transaction belongs to. */
    fun cardPaymentId(): Optional<String> =
        Optional.ofNullable(cardPaymentId.getNullable("card_payment_id"))

    /** The Card Purchase Supplement identifier. */
    fun id(): String = id.getRequired("id")

    /** Invoice-level information about the payment. */
    fun invoice(): Optional<Invoice> = Optional.ofNullable(invoice.getNullable("invoice"))

    /** Line item information, such as individual products purchased. */
    fun lineItems(): Optional<List<LineItem>> =
        Optional.ofNullable(lineItems.getNullable("line_items"))

    /** The ID of the transaction. */
    fun transactionId(): String = transactionId.getRequired("transaction_id")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `card_purchase_supplement`.
     */
    fun type(): Type = type.getRequired("type")

    /** The ID of the Card Payment this transaction belongs to. */
    @JsonProperty("card_payment_id") @ExcludeMissing fun _cardPaymentId() = cardPaymentId

    /** The Card Purchase Supplement identifier. */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /** Invoice-level information about the payment. */
    @JsonProperty("invoice") @ExcludeMissing fun _invoice() = invoice

    /** Line item information, such as individual products purchased. */
    @JsonProperty("line_items") @ExcludeMissing fun _lineItems() = lineItems

    /** The ID of the transaction. */
    @JsonProperty("transaction_id") @ExcludeMissing fun _transactionId() = transactionId

    /**
     * A constant representing the object's type. For this resource it will always be
     * `card_purchase_supplement`.
     */
    @JsonProperty("type") @ExcludeMissing fun _type() = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): CardPurchaseSupplement = apply {
        if (!validated) {
            cardPaymentId()
            id()
            invoice().map { it.validate() }
            lineItems().map { it.forEach { it.validate() } }
            transactionId()
            type()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var cardPaymentId: JsonField<String> = JsonMissing.of()
        private var id: JsonField<String> = JsonMissing.of()
        private var invoice: JsonField<Invoice> = JsonMissing.of()
        private var lineItems: JsonField<List<LineItem>> = JsonMissing.of()
        private var transactionId: JsonField<String> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(cardPurchaseSupplement: CardPurchaseSupplement) = apply {
            this.cardPaymentId = cardPurchaseSupplement.cardPaymentId
            this.id = cardPurchaseSupplement.id
            this.invoice = cardPurchaseSupplement.invoice
            this.lineItems = cardPurchaseSupplement.lineItems
            this.transactionId = cardPurchaseSupplement.transactionId
            this.type = cardPurchaseSupplement.type
            additionalProperties(cardPurchaseSupplement.additionalProperties)
        }

        /** The ID of the Card Payment this transaction belongs to. */
        fun cardPaymentId(cardPaymentId: String) = cardPaymentId(JsonField.of(cardPaymentId))

        /** The ID of the Card Payment this transaction belongs to. */
        @JsonProperty("card_payment_id")
        @ExcludeMissing
        fun cardPaymentId(cardPaymentId: JsonField<String>) = apply {
            this.cardPaymentId = cardPaymentId
        }

        /** The Card Purchase Supplement identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The Card Purchase Supplement identifier. */
        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        /** Invoice-level information about the payment. */
        fun invoice(invoice: Invoice) = invoice(JsonField.of(invoice))

        /** Invoice-level information about the payment. */
        @JsonProperty("invoice")
        @ExcludeMissing
        fun invoice(invoice: JsonField<Invoice>) = apply { this.invoice = invoice }

        /** Line item information, such as individual products purchased. */
        fun lineItems(lineItems: List<LineItem>) = lineItems(JsonField.of(lineItems))

        /** Line item information, such as individual products purchased. */
        @JsonProperty("line_items")
        @ExcludeMissing
        fun lineItems(lineItems: JsonField<List<LineItem>>) = apply { this.lineItems = lineItems }

        /** The ID of the transaction. */
        fun transactionId(transactionId: String) = transactionId(JsonField.of(transactionId))

        /** The ID of the transaction. */
        @JsonProperty("transaction_id")
        @ExcludeMissing
        fun transactionId(transactionId: JsonField<String>) = apply {
            this.transactionId = transactionId
        }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `card_purchase_supplement`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * A constant representing the object's type. For this resource it will always be
         * `card_purchase_supplement`.
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

        fun build(): CardPurchaseSupplement =
            CardPurchaseSupplement(
                cardPaymentId,
                id,
                invoice,
                lineItems.map { it.toImmutable() },
                transactionId,
                type,
                additionalProperties.toImmutable(),
            )
    }

    /** Invoice-level information about the payment. */
    @JsonDeserialize(builder = Invoice.Builder::class)
    @NoAutoDetect
    class Invoice
    private constructor(
        private val discountAmount: JsonField<Long>,
        private val discountCurrency: JsonField<String>,
        private val discountTreatmentCode: JsonField<DiscountTreatmentCode>,
        private val dutyTaxAmount: JsonField<Long>,
        private val dutyTaxCurrency: JsonField<String>,
        private val orderDate: JsonField<LocalDate>,
        private val shippingAmount: JsonField<Long>,
        private val shippingCurrency: JsonField<String>,
        private val shippingDestinationCountryCode: JsonField<String>,
        private val shippingDestinationPostalCode: JsonField<String>,
        private val shippingSourcePostalCode: JsonField<String>,
        private val shippingTaxAmount: JsonField<Long>,
        private val shippingTaxCurrency: JsonField<String>,
        private val shippingTaxRate: JsonField<String>,
        private val taxTreatments: JsonField<TaxTreatments>,
        private val uniqueValueAddedTaxInvoiceReference: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        /** Discount given to cardholder. */
        fun discountAmount(): Optional<Long> =
            Optional.ofNullable(discountAmount.getNullable("discount_amount"))

        /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the discount. */
        fun discountCurrency(): Optional<String> =
            Optional.ofNullable(discountCurrency.getNullable("discount_currency"))

        /** Indicates how the merchant applied the discount. */
        fun discountTreatmentCode(): Optional<DiscountTreatmentCode> =
            Optional.ofNullable(discountTreatmentCode.getNullable("discount_treatment_code"))

        /** Amount of duty taxes. */
        fun dutyTaxAmount(): Optional<Long> =
            Optional.ofNullable(dutyTaxAmount.getNullable("duty_tax_amount"))

        /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the duty tax. */
        fun dutyTaxCurrency(): Optional<String> =
            Optional.ofNullable(dutyTaxCurrency.getNullable("duty_tax_currency"))

        /** Date the order was taken. */
        fun orderDate(): Optional<LocalDate> =
            Optional.ofNullable(orderDate.getNullable("order_date"))

        /** The shipping cost. */
        fun shippingAmount(): Optional<Long> =
            Optional.ofNullable(shippingAmount.getNullable("shipping_amount"))

        /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the shipping cost. */
        fun shippingCurrency(): Optional<String> =
            Optional.ofNullable(shippingCurrency.getNullable("shipping_currency"))

        /** Country code of the shipping destination. */
        fun shippingDestinationCountryCode(): Optional<String> =
            Optional.ofNullable(
                shippingDestinationCountryCode.getNullable("shipping_destination_country_code")
            )

        /** Postal code of the shipping destination. */
        fun shippingDestinationPostalCode(): Optional<String> =
            Optional.ofNullable(
                shippingDestinationPostalCode.getNullable("shipping_destination_postal_code")
            )

        /** Postal code of the location being shipped from. */
        fun shippingSourcePostalCode(): Optional<String> =
            Optional.ofNullable(shippingSourcePostalCode.getNullable("shipping_source_postal_code"))

        /** Taxes paid for freight and shipping. */
        fun shippingTaxAmount(): Optional<Long> =
            Optional.ofNullable(shippingTaxAmount.getNullable("shipping_tax_amount"))

        /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the shipping tax. */
        fun shippingTaxCurrency(): Optional<String> =
            Optional.ofNullable(shippingTaxCurrency.getNullable("shipping_tax_currency"))

        /** Tax rate for freight and shipping. */
        fun shippingTaxRate(): Optional<String> =
            Optional.ofNullable(shippingTaxRate.getNullable("shipping_tax_rate"))

        /** Indicates how the merchant applied taxes. */
        fun taxTreatments(): Optional<TaxTreatments> =
            Optional.ofNullable(taxTreatments.getNullable("tax_treatments"))

        /** Value added tax invoice reference number. */
        fun uniqueValueAddedTaxInvoiceReference(): Optional<String> =
            Optional.ofNullable(
                uniqueValueAddedTaxInvoiceReference.getNullable(
                    "unique_value_added_tax_invoice_reference"
                )
            )

        /** Discount given to cardholder. */
        @JsonProperty("discount_amount") @ExcludeMissing fun _discountAmount() = discountAmount

        /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the discount. */
        @JsonProperty("discount_currency")
        @ExcludeMissing
        fun _discountCurrency() = discountCurrency

        /** Indicates how the merchant applied the discount. */
        @JsonProperty("discount_treatment_code")
        @ExcludeMissing
        fun _discountTreatmentCode() = discountTreatmentCode

        /** Amount of duty taxes. */
        @JsonProperty("duty_tax_amount") @ExcludeMissing fun _dutyTaxAmount() = dutyTaxAmount

        /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the duty tax. */
        @JsonProperty("duty_tax_currency") @ExcludeMissing fun _dutyTaxCurrency() = dutyTaxCurrency

        /** Date the order was taken. */
        @JsonProperty("order_date") @ExcludeMissing fun _orderDate() = orderDate

        /** The shipping cost. */
        @JsonProperty("shipping_amount") @ExcludeMissing fun _shippingAmount() = shippingAmount

        /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the shipping cost. */
        @JsonProperty("shipping_currency")
        @ExcludeMissing
        fun _shippingCurrency() = shippingCurrency

        /** Country code of the shipping destination. */
        @JsonProperty("shipping_destination_country_code")
        @ExcludeMissing
        fun _shippingDestinationCountryCode() = shippingDestinationCountryCode

        /** Postal code of the shipping destination. */
        @JsonProperty("shipping_destination_postal_code")
        @ExcludeMissing
        fun _shippingDestinationPostalCode() = shippingDestinationPostalCode

        /** Postal code of the location being shipped from. */
        @JsonProperty("shipping_source_postal_code")
        @ExcludeMissing
        fun _shippingSourcePostalCode() = shippingSourcePostalCode

        /** Taxes paid for freight and shipping. */
        @JsonProperty("shipping_tax_amount")
        @ExcludeMissing
        fun _shippingTaxAmount() = shippingTaxAmount

        /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the shipping tax. */
        @JsonProperty("shipping_tax_currency")
        @ExcludeMissing
        fun _shippingTaxCurrency() = shippingTaxCurrency

        /** Tax rate for freight and shipping. */
        @JsonProperty("shipping_tax_rate") @ExcludeMissing fun _shippingTaxRate() = shippingTaxRate

        /** Indicates how the merchant applied taxes. */
        @JsonProperty("tax_treatments") @ExcludeMissing fun _taxTreatments() = taxTreatments

        /** Value added tax invoice reference number. */
        @JsonProperty("unique_value_added_tax_invoice_reference")
        @ExcludeMissing
        fun _uniqueValueAddedTaxInvoiceReference() = uniqueValueAddedTaxInvoiceReference

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Invoice = apply {
            if (!validated) {
                discountAmount()
                discountCurrency()
                discountTreatmentCode()
                dutyTaxAmount()
                dutyTaxCurrency()
                orderDate()
                shippingAmount()
                shippingCurrency()
                shippingDestinationCountryCode()
                shippingDestinationPostalCode()
                shippingSourcePostalCode()
                shippingTaxAmount()
                shippingTaxCurrency()
                shippingTaxRate()
                taxTreatments()
                uniqueValueAddedTaxInvoiceReference()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var discountAmount: JsonField<Long> = JsonMissing.of()
            private var discountCurrency: JsonField<String> = JsonMissing.of()
            private var discountTreatmentCode: JsonField<DiscountTreatmentCode> = JsonMissing.of()
            private var dutyTaxAmount: JsonField<Long> = JsonMissing.of()
            private var dutyTaxCurrency: JsonField<String> = JsonMissing.of()
            private var orderDate: JsonField<LocalDate> = JsonMissing.of()
            private var shippingAmount: JsonField<Long> = JsonMissing.of()
            private var shippingCurrency: JsonField<String> = JsonMissing.of()
            private var shippingDestinationCountryCode: JsonField<String> = JsonMissing.of()
            private var shippingDestinationPostalCode: JsonField<String> = JsonMissing.of()
            private var shippingSourcePostalCode: JsonField<String> = JsonMissing.of()
            private var shippingTaxAmount: JsonField<Long> = JsonMissing.of()
            private var shippingTaxCurrency: JsonField<String> = JsonMissing.of()
            private var shippingTaxRate: JsonField<String> = JsonMissing.of()
            private var taxTreatments: JsonField<TaxTreatments> = JsonMissing.of()
            private var uniqueValueAddedTaxInvoiceReference: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(invoice: Invoice) = apply {
                this.discountAmount = invoice.discountAmount
                this.discountCurrency = invoice.discountCurrency
                this.discountTreatmentCode = invoice.discountTreatmentCode
                this.dutyTaxAmount = invoice.dutyTaxAmount
                this.dutyTaxCurrency = invoice.dutyTaxCurrency
                this.orderDate = invoice.orderDate
                this.shippingAmount = invoice.shippingAmount
                this.shippingCurrency = invoice.shippingCurrency
                this.shippingDestinationCountryCode = invoice.shippingDestinationCountryCode
                this.shippingDestinationPostalCode = invoice.shippingDestinationPostalCode
                this.shippingSourcePostalCode = invoice.shippingSourcePostalCode
                this.shippingTaxAmount = invoice.shippingTaxAmount
                this.shippingTaxCurrency = invoice.shippingTaxCurrency
                this.shippingTaxRate = invoice.shippingTaxRate
                this.taxTreatments = invoice.taxTreatments
                this.uniqueValueAddedTaxInvoiceReference =
                    invoice.uniqueValueAddedTaxInvoiceReference
                additionalProperties(invoice.additionalProperties)
            }

            /** Discount given to cardholder. */
            fun discountAmount(discountAmount: Long) = discountAmount(JsonField.of(discountAmount))

            /** Discount given to cardholder. */
            @JsonProperty("discount_amount")
            @ExcludeMissing
            fun discountAmount(discountAmount: JsonField<Long>) = apply {
                this.discountAmount = discountAmount
            }

            /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the discount. */
            fun discountCurrency(discountCurrency: String) =
                discountCurrency(JsonField.of(discountCurrency))

            /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the discount. */
            @JsonProperty("discount_currency")
            @ExcludeMissing
            fun discountCurrency(discountCurrency: JsonField<String>) = apply {
                this.discountCurrency = discountCurrency
            }

            /** Indicates how the merchant applied the discount. */
            fun discountTreatmentCode(discountTreatmentCode: DiscountTreatmentCode) =
                discountTreatmentCode(JsonField.of(discountTreatmentCode))

            /** Indicates how the merchant applied the discount. */
            @JsonProperty("discount_treatment_code")
            @ExcludeMissing
            fun discountTreatmentCode(discountTreatmentCode: JsonField<DiscountTreatmentCode>) =
                apply {
                    this.discountTreatmentCode = discountTreatmentCode
                }

            /** Amount of duty taxes. */
            fun dutyTaxAmount(dutyTaxAmount: Long) = dutyTaxAmount(JsonField.of(dutyTaxAmount))

            /** Amount of duty taxes. */
            @JsonProperty("duty_tax_amount")
            @ExcludeMissing
            fun dutyTaxAmount(dutyTaxAmount: JsonField<Long>) = apply {
                this.dutyTaxAmount = dutyTaxAmount
            }

            /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the duty tax. */
            fun dutyTaxCurrency(dutyTaxCurrency: String) =
                dutyTaxCurrency(JsonField.of(dutyTaxCurrency))

            /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the duty tax. */
            @JsonProperty("duty_tax_currency")
            @ExcludeMissing
            fun dutyTaxCurrency(dutyTaxCurrency: JsonField<String>) = apply {
                this.dutyTaxCurrency = dutyTaxCurrency
            }

            /** Date the order was taken. */
            fun orderDate(orderDate: LocalDate) = orderDate(JsonField.of(orderDate))

            /** Date the order was taken. */
            @JsonProperty("order_date")
            @ExcludeMissing
            fun orderDate(orderDate: JsonField<LocalDate>) = apply { this.orderDate = orderDate }

            /** The shipping cost. */
            fun shippingAmount(shippingAmount: Long) = shippingAmount(JsonField.of(shippingAmount))

            /** The shipping cost. */
            @JsonProperty("shipping_amount")
            @ExcludeMissing
            fun shippingAmount(shippingAmount: JsonField<Long>) = apply {
                this.shippingAmount = shippingAmount
            }

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the shipping cost.
             */
            fun shippingCurrency(shippingCurrency: String) =
                shippingCurrency(JsonField.of(shippingCurrency))

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the shipping cost.
             */
            @JsonProperty("shipping_currency")
            @ExcludeMissing
            fun shippingCurrency(shippingCurrency: JsonField<String>) = apply {
                this.shippingCurrency = shippingCurrency
            }

            /** Country code of the shipping destination. */
            fun shippingDestinationCountryCode(shippingDestinationCountryCode: String) =
                shippingDestinationCountryCode(JsonField.of(shippingDestinationCountryCode))

            /** Country code of the shipping destination. */
            @JsonProperty("shipping_destination_country_code")
            @ExcludeMissing
            fun shippingDestinationCountryCode(shippingDestinationCountryCode: JsonField<String>) =
                apply {
                    this.shippingDestinationCountryCode = shippingDestinationCountryCode
                }

            /** Postal code of the shipping destination. */
            fun shippingDestinationPostalCode(shippingDestinationPostalCode: String) =
                shippingDestinationPostalCode(JsonField.of(shippingDestinationPostalCode))

            /** Postal code of the shipping destination. */
            @JsonProperty("shipping_destination_postal_code")
            @ExcludeMissing
            fun shippingDestinationPostalCode(shippingDestinationPostalCode: JsonField<String>) =
                apply {
                    this.shippingDestinationPostalCode = shippingDestinationPostalCode
                }

            /** Postal code of the location being shipped from. */
            fun shippingSourcePostalCode(shippingSourcePostalCode: String) =
                shippingSourcePostalCode(JsonField.of(shippingSourcePostalCode))

            /** Postal code of the location being shipped from. */
            @JsonProperty("shipping_source_postal_code")
            @ExcludeMissing
            fun shippingSourcePostalCode(shippingSourcePostalCode: JsonField<String>) = apply {
                this.shippingSourcePostalCode = shippingSourcePostalCode
            }

            /** Taxes paid for freight and shipping. */
            fun shippingTaxAmount(shippingTaxAmount: Long) =
                shippingTaxAmount(JsonField.of(shippingTaxAmount))

            /** Taxes paid for freight and shipping. */
            @JsonProperty("shipping_tax_amount")
            @ExcludeMissing
            fun shippingTaxAmount(shippingTaxAmount: JsonField<Long>) = apply {
                this.shippingTaxAmount = shippingTaxAmount
            }

            /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the shipping tax. */
            fun shippingTaxCurrency(shippingTaxCurrency: String) =
                shippingTaxCurrency(JsonField.of(shippingTaxCurrency))

            /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the shipping tax. */
            @JsonProperty("shipping_tax_currency")
            @ExcludeMissing
            fun shippingTaxCurrency(shippingTaxCurrency: JsonField<String>) = apply {
                this.shippingTaxCurrency = shippingTaxCurrency
            }

            /** Tax rate for freight and shipping. */
            fun shippingTaxRate(shippingTaxRate: String) =
                shippingTaxRate(JsonField.of(shippingTaxRate))

            /** Tax rate for freight and shipping. */
            @JsonProperty("shipping_tax_rate")
            @ExcludeMissing
            fun shippingTaxRate(shippingTaxRate: JsonField<String>) = apply {
                this.shippingTaxRate = shippingTaxRate
            }

            /** Indicates how the merchant applied taxes. */
            fun taxTreatments(taxTreatments: TaxTreatments) =
                taxTreatments(JsonField.of(taxTreatments))

            /** Indicates how the merchant applied taxes. */
            @JsonProperty("tax_treatments")
            @ExcludeMissing
            fun taxTreatments(taxTreatments: JsonField<TaxTreatments>) = apply {
                this.taxTreatments = taxTreatments
            }

            /** Value added tax invoice reference number. */
            fun uniqueValueAddedTaxInvoiceReference(uniqueValueAddedTaxInvoiceReference: String) =
                uniqueValueAddedTaxInvoiceReference(
                    JsonField.of(uniqueValueAddedTaxInvoiceReference)
                )

            /** Value added tax invoice reference number. */
            @JsonProperty("unique_value_added_tax_invoice_reference")
            @ExcludeMissing
            fun uniqueValueAddedTaxInvoiceReference(
                uniqueValueAddedTaxInvoiceReference: JsonField<String>
            ) = apply {
                this.uniqueValueAddedTaxInvoiceReference = uniqueValueAddedTaxInvoiceReference
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

            fun build(): Invoice =
                Invoice(
                    discountAmount,
                    discountCurrency,
                    discountTreatmentCode,
                    dutyTaxAmount,
                    dutyTaxCurrency,
                    orderDate,
                    shippingAmount,
                    shippingCurrency,
                    shippingDestinationCountryCode,
                    shippingDestinationPostalCode,
                    shippingSourcePostalCode,
                    shippingTaxAmount,
                    shippingTaxCurrency,
                    shippingTaxRate,
                    taxTreatments,
                    uniqueValueAddedTaxInvoiceReference,
                    additionalProperties.toImmutable(),
                )
        }

        class DiscountTreatmentCode
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is DiscountTreatmentCode && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField
                val NO_INVOICE_LEVEL_DISCOUNT_PROVIDED =
                    DiscountTreatmentCode(JsonField.of("no_invoice_level_discount_provided"))

                @JvmField
                val TAX_CALCULATED_ON_POST_DISCOUNT_INVOICE_TOTAL =
                    DiscountTreatmentCode(
                        JsonField.of("tax_calculated_on_post_discount_invoice_total")
                    )

                @JvmField
                val TAX_CALCULATED_ON_PRE_DISCOUNT_INVOICE_TOTAL =
                    DiscountTreatmentCode(
                        JsonField.of("tax_calculated_on_pre_discount_invoice_total")
                    )

                @JvmStatic fun of(value: String) = DiscountTreatmentCode(JsonField.of(value))
            }

            enum class Known {
                NO_INVOICE_LEVEL_DISCOUNT_PROVIDED,
                TAX_CALCULATED_ON_POST_DISCOUNT_INVOICE_TOTAL,
                TAX_CALCULATED_ON_PRE_DISCOUNT_INVOICE_TOTAL,
            }

            enum class Value {
                NO_INVOICE_LEVEL_DISCOUNT_PROVIDED,
                TAX_CALCULATED_ON_POST_DISCOUNT_INVOICE_TOTAL,
                TAX_CALCULATED_ON_PRE_DISCOUNT_INVOICE_TOTAL,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    NO_INVOICE_LEVEL_DISCOUNT_PROVIDED -> Value.NO_INVOICE_LEVEL_DISCOUNT_PROVIDED
                    TAX_CALCULATED_ON_POST_DISCOUNT_INVOICE_TOTAL ->
                        Value.TAX_CALCULATED_ON_POST_DISCOUNT_INVOICE_TOTAL
                    TAX_CALCULATED_ON_PRE_DISCOUNT_INVOICE_TOTAL ->
                        Value.TAX_CALCULATED_ON_PRE_DISCOUNT_INVOICE_TOTAL
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    NO_INVOICE_LEVEL_DISCOUNT_PROVIDED -> Known.NO_INVOICE_LEVEL_DISCOUNT_PROVIDED
                    TAX_CALCULATED_ON_POST_DISCOUNT_INVOICE_TOTAL ->
                        Known.TAX_CALCULATED_ON_POST_DISCOUNT_INVOICE_TOTAL
                    TAX_CALCULATED_ON_PRE_DISCOUNT_INVOICE_TOTAL ->
                        Known.TAX_CALCULATED_ON_PRE_DISCOUNT_INVOICE_TOTAL
                    else ->
                        throw IncreaseInvalidDataException("Unknown DiscountTreatmentCode: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        class TaxTreatments
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is TaxTreatments && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val NO_TAX_APPLIES = TaxTreatments(JsonField.of("no_tax_applies"))

                @JvmField
                val NET_PRICE_LINE_ITEM_LEVEL =
                    TaxTreatments(JsonField.of("net_price_line_item_level"))

                @JvmField
                val NET_PRICE_INVOICE_LEVEL = TaxTreatments(JsonField.of("net_price_invoice_level"))

                @JvmField
                val GROSS_PRICE_LINE_ITEM_LEVEL =
                    TaxTreatments(JsonField.of("gross_price_line_item_level"))

                @JvmField
                val GROSS_PRICE_INVOICE_LEVEL =
                    TaxTreatments(JsonField.of("gross_price_invoice_level"))

                @JvmStatic fun of(value: String) = TaxTreatments(JsonField.of(value))
            }

            enum class Known {
                NO_TAX_APPLIES,
                NET_PRICE_LINE_ITEM_LEVEL,
                NET_PRICE_INVOICE_LEVEL,
                GROSS_PRICE_LINE_ITEM_LEVEL,
                GROSS_PRICE_INVOICE_LEVEL,
            }

            enum class Value {
                NO_TAX_APPLIES,
                NET_PRICE_LINE_ITEM_LEVEL,
                NET_PRICE_INVOICE_LEVEL,
                GROSS_PRICE_LINE_ITEM_LEVEL,
                GROSS_PRICE_INVOICE_LEVEL,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    NO_TAX_APPLIES -> Value.NO_TAX_APPLIES
                    NET_PRICE_LINE_ITEM_LEVEL -> Value.NET_PRICE_LINE_ITEM_LEVEL
                    NET_PRICE_INVOICE_LEVEL -> Value.NET_PRICE_INVOICE_LEVEL
                    GROSS_PRICE_LINE_ITEM_LEVEL -> Value.GROSS_PRICE_LINE_ITEM_LEVEL
                    GROSS_PRICE_INVOICE_LEVEL -> Value.GROSS_PRICE_INVOICE_LEVEL
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    NO_TAX_APPLIES -> Known.NO_TAX_APPLIES
                    NET_PRICE_LINE_ITEM_LEVEL -> Known.NET_PRICE_LINE_ITEM_LEVEL
                    NET_PRICE_INVOICE_LEVEL -> Known.NET_PRICE_INVOICE_LEVEL
                    GROSS_PRICE_LINE_ITEM_LEVEL -> Known.GROSS_PRICE_LINE_ITEM_LEVEL
                    GROSS_PRICE_INVOICE_LEVEL -> Known.GROSS_PRICE_INVOICE_LEVEL
                    else -> throw IncreaseInvalidDataException("Unknown TaxTreatments: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Invoice && discountAmount == other.discountAmount && discountCurrency == other.discountCurrency && discountTreatmentCode == other.discountTreatmentCode && dutyTaxAmount == other.dutyTaxAmount && dutyTaxCurrency == other.dutyTaxCurrency && orderDate == other.orderDate && shippingAmount == other.shippingAmount && shippingCurrency == other.shippingCurrency && shippingDestinationCountryCode == other.shippingDestinationCountryCode && shippingDestinationPostalCode == other.shippingDestinationPostalCode && shippingSourcePostalCode == other.shippingSourcePostalCode && shippingTaxAmount == other.shippingTaxAmount && shippingTaxCurrency == other.shippingTaxCurrency && shippingTaxRate == other.shippingTaxRate && taxTreatments == other.taxTreatments && uniqueValueAddedTaxInvoiceReference == other.uniqueValueAddedTaxInvoiceReference && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(discountAmount, discountCurrency, discountTreatmentCode, dutyTaxAmount, dutyTaxCurrency, orderDate, shippingAmount, shippingCurrency, shippingDestinationCountryCode, shippingDestinationPostalCode, shippingSourcePostalCode, shippingTaxAmount, shippingTaxCurrency, shippingTaxRate, taxTreatments, uniqueValueAddedTaxInvoiceReference, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Invoice{discountAmount=$discountAmount, discountCurrency=$discountCurrency, discountTreatmentCode=$discountTreatmentCode, dutyTaxAmount=$dutyTaxAmount, dutyTaxCurrency=$dutyTaxCurrency, orderDate=$orderDate, shippingAmount=$shippingAmount, shippingCurrency=$shippingCurrency, shippingDestinationCountryCode=$shippingDestinationCountryCode, shippingDestinationPostalCode=$shippingDestinationPostalCode, shippingSourcePostalCode=$shippingSourcePostalCode, shippingTaxAmount=$shippingTaxAmount, shippingTaxCurrency=$shippingTaxCurrency, shippingTaxRate=$shippingTaxRate, taxTreatments=$taxTreatments, uniqueValueAddedTaxInvoiceReference=$uniqueValueAddedTaxInvoiceReference, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = LineItem.Builder::class)
    @NoAutoDetect
    class LineItem
    private constructor(
        private val detailIndicator: JsonField<DetailIndicator>,
        private val discountAmount: JsonField<Long>,
        private val discountCurrency: JsonField<String>,
        private val discountTreatmentCode: JsonField<DiscountTreatmentCode>,
        private val id: JsonField<String>,
        private val itemCommodityCode: JsonField<String>,
        private val itemDescriptor: JsonField<String>,
        private val itemQuantity: JsonField<String>,
        private val productCode: JsonField<String>,
        private val salesTaxAmount: JsonField<Long>,
        private val salesTaxCurrency: JsonField<String>,
        private val salesTaxRate: JsonField<String>,
        private val totalAmount: JsonField<Long>,
        private val totalAmountCurrency: JsonField<String>,
        private val unitCost: JsonField<String>,
        private val unitCostCurrency: JsonField<String>,
        private val unitOfMeasureCode: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        /** Indicates the type of line item. */
        fun detailIndicator(): Optional<DetailIndicator> =
            Optional.ofNullable(detailIndicator.getNullable("detail_indicator"))

        /** Discount amount for this specific line item. */
        fun discountAmount(): Optional<Long> =
            Optional.ofNullable(discountAmount.getNullable("discount_amount"))

        /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the discount. */
        fun discountCurrency(): Optional<String> =
            Optional.ofNullable(discountCurrency.getNullable("discount_currency"))

        /** Indicates how the merchant applied the discount for this specific line item. */
        fun discountTreatmentCode(): Optional<DiscountTreatmentCode> =
            Optional.ofNullable(discountTreatmentCode.getNullable("discount_treatment_code"))

        /** The Card Purchase Supplement Line Item identifier. */
        fun id(): String = id.getRequired("id")

        /** Code used to categorize the purchase item. */
        fun itemCommodityCode(): Optional<String> =
            Optional.ofNullable(itemCommodityCode.getNullable("item_commodity_code"))

        /** Description of the purchase item. */
        fun itemDescriptor(): Optional<String> =
            Optional.ofNullable(itemDescriptor.getNullable("item_descriptor"))

        /** The number of units of the product being purchased. */
        fun itemQuantity(): Optional<String> =
            Optional.ofNullable(itemQuantity.getNullable("item_quantity"))

        /** Code used to categorize the product being purchased. */
        fun productCode(): Optional<String> =
            Optional.ofNullable(productCode.getNullable("product_code"))

        /** Sales tax amount for this line item. */
        fun salesTaxAmount(): Optional<Long> =
            Optional.ofNullable(salesTaxAmount.getNullable("sales_tax_amount"))

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the sales tax assessed.
         */
        fun salesTaxCurrency(): Optional<String> =
            Optional.ofNullable(salesTaxCurrency.getNullable("sales_tax_currency"))

        /** Sales tax rate for this line item. */
        fun salesTaxRate(): Optional<String> =
            Optional.ofNullable(salesTaxRate.getNullable("sales_tax_rate"))

        /** Total amount of all line items. */
        fun totalAmount(): Optional<Long> =
            Optional.ofNullable(totalAmount.getNullable("total_amount"))

        /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the total amount. */
        fun totalAmountCurrency(): Optional<String> =
            Optional.ofNullable(totalAmountCurrency.getNullable("total_amount_currency"))

        /** Cost of line item per unit of measure, in major units. */
        fun unitCost(): Optional<String> = Optional.ofNullable(unitCost.getNullable("unit_cost"))

        /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the unit cost. */
        fun unitCostCurrency(): Optional<String> =
            Optional.ofNullable(unitCostCurrency.getNullable("unit_cost_currency"))

        /** Code indicating unit of measure (gallons, etc.). */
        fun unitOfMeasureCode(): Optional<String> =
            Optional.ofNullable(unitOfMeasureCode.getNullable("unit_of_measure_code"))

        /** Indicates the type of line item. */
        @JsonProperty("detail_indicator") @ExcludeMissing fun _detailIndicator() = detailIndicator

        /** Discount amount for this specific line item. */
        @JsonProperty("discount_amount") @ExcludeMissing fun _discountAmount() = discountAmount

        /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the discount. */
        @JsonProperty("discount_currency")
        @ExcludeMissing
        fun _discountCurrency() = discountCurrency

        /** Indicates how the merchant applied the discount for this specific line item. */
        @JsonProperty("discount_treatment_code")
        @ExcludeMissing
        fun _discountTreatmentCode() = discountTreatmentCode

        /** The Card Purchase Supplement Line Item identifier. */
        @JsonProperty("id") @ExcludeMissing fun _id() = id

        /** Code used to categorize the purchase item. */
        @JsonProperty("item_commodity_code")
        @ExcludeMissing
        fun _itemCommodityCode() = itemCommodityCode

        /** Description of the purchase item. */
        @JsonProperty("item_descriptor") @ExcludeMissing fun _itemDescriptor() = itemDescriptor

        /** The number of units of the product being purchased. */
        @JsonProperty("item_quantity") @ExcludeMissing fun _itemQuantity() = itemQuantity

        /** Code used to categorize the product being purchased. */
        @JsonProperty("product_code") @ExcludeMissing fun _productCode() = productCode

        /** Sales tax amount for this line item. */
        @JsonProperty("sales_tax_amount") @ExcludeMissing fun _salesTaxAmount() = salesTaxAmount

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the sales tax assessed.
         */
        @JsonProperty("sales_tax_currency")
        @ExcludeMissing
        fun _salesTaxCurrency() = salesTaxCurrency

        /** Sales tax rate for this line item. */
        @JsonProperty("sales_tax_rate") @ExcludeMissing fun _salesTaxRate() = salesTaxRate

        /** Total amount of all line items. */
        @JsonProperty("total_amount") @ExcludeMissing fun _totalAmount() = totalAmount

        /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the total amount. */
        @JsonProperty("total_amount_currency")
        @ExcludeMissing
        fun _totalAmountCurrency() = totalAmountCurrency

        /** Cost of line item per unit of measure, in major units. */
        @JsonProperty("unit_cost") @ExcludeMissing fun _unitCost() = unitCost

        /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the unit cost. */
        @JsonProperty("unit_cost_currency")
        @ExcludeMissing
        fun _unitCostCurrency() = unitCostCurrency

        /** Code indicating unit of measure (gallons, etc.). */
        @JsonProperty("unit_of_measure_code")
        @ExcludeMissing
        fun _unitOfMeasureCode() = unitOfMeasureCode

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): LineItem = apply {
            if (!validated) {
                detailIndicator()
                discountAmount()
                discountCurrency()
                discountTreatmentCode()
                id()
                itemCommodityCode()
                itemDescriptor()
                itemQuantity()
                productCode()
                salesTaxAmount()
                salesTaxCurrency()
                salesTaxRate()
                totalAmount()
                totalAmountCurrency()
                unitCost()
                unitCostCurrency()
                unitOfMeasureCode()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var detailIndicator: JsonField<DetailIndicator> = JsonMissing.of()
            private var discountAmount: JsonField<Long> = JsonMissing.of()
            private var discountCurrency: JsonField<String> = JsonMissing.of()
            private var discountTreatmentCode: JsonField<DiscountTreatmentCode> = JsonMissing.of()
            private var id: JsonField<String> = JsonMissing.of()
            private var itemCommodityCode: JsonField<String> = JsonMissing.of()
            private var itemDescriptor: JsonField<String> = JsonMissing.of()
            private var itemQuantity: JsonField<String> = JsonMissing.of()
            private var productCode: JsonField<String> = JsonMissing.of()
            private var salesTaxAmount: JsonField<Long> = JsonMissing.of()
            private var salesTaxCurrency: JsonField<String> = JsonMissing.of()
            private var salesTaxRate: JsonField<String> = JsonMissing.of()
            private var totalAmount: JsonField<Long> = JsonMissing.of()
            private var totalAmountCurrency: JsonField<String> = JsonMissing.of()
            private var unitCost: JsonField<String> = JsonMissing.of()
            private var unitCostCurrency: JsonField<String> = JsonMissing.of()
            private var unitOfMeasureCode: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(lineItem: LineItem) = apply {
                this.detailIndicator = lineItem.detailIndicator
                this.discountAmount = lineItem.discountAmount
                this.discountCurrency = lineItem.discountCurrency
                this.discountTreatmentCode = lineItem.discountTreatmentCode
                this.id = lineItem.id
                this.itemCommodityCode = lineItem.itemCommodityCode
                this.itemDescriptor = lineItem.itemDescriptor
                this.itemQuantity = lineItem.itemQuantity
                this.productCode = lineItem.productCode
                this.salesTaxAmount = lineItem.salesTaxAmount
                this.salesTaxCurrency = lineItem.salesTaxCurrency
                this.salesTaxRate = lineItem.salesTaxRate
                this.totalAmount = lineItem.totalAmount
                this.totalAmountCurrency = lineItem.totalAmountCurrency
                this.unitCost = lineItem.unitCost
                this.unitCostCurrency = lineItem.unitCostCurrency
                this.unitOfMeasureCode = lineItem.unitOfMeasureCode
                additionalProperties(lineItem.additionalProperties)
            }

            /** Indicates the type of line item. */
            fun detailIndicator(detailIndicator: DetailIndicator) =
                detailIndicator(JsonField.of(detailIndicator))

            /** Indicates the type of line item. */
            @JsonProperty("detail_indicator")
            @ExcludeMissing
            fun detailIndicator(detailIndicator: JsonField<DetailIndicator>) = apply {
                this.detailIndicator = detailIndicator
            }

            /** Discount amount for this specific line item. */
            fun discountAmount(discountAmount: Long) = discountAmount(JsonField.of(discountAmount))

            /** Discount amount for this specific line item. */
            @JsonProperty("discount_amount")
            @ExcludeMissing
            fun discountAmount(discountAmount: JsonField<Long>) = apply {
                this.discountAmount = discountAmount
            }

            /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the discount. */
            fun discountCurrency(discountCurrency: String) =
                discountCurrency(JsonField.of(discountCurrency))

            /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the discount. */
            @JsonProperty("discount_currency")
            @ExcludeMissing
            fun discountCurrency(discountCurrency: JsonField<String>) = apply {
                this.discountCurrency = discountCurrency
            }

            /** Indicates how the merchant applied the discount for this specific line item. */
            fun discountTreatmentCode(discountTreatmentCode: DiscountTreatmentCode) =
                discountTreatmentCode(JsonField.of(discountTreatmentCode))

            /** Indicates how the merchant applied the discount for this specific line item. */
            @JsonProperty("discount_treatment_code")
            @ExcludeMissing
            fun discountTreatmentCode(discountTreatmentCode: JsonField<DiscountTreatmentCode>) =
                apply {
                    this.discountTreatmentCode = discountTreatmentCode
                }

            /** The Card Purchase Supplement Line Item identifier. */
            fun id(id: String) = id(JsonField.of(id))

            /** The Card Purchase Supplement Line Item identifier. */
            @JsonProperty("id")
            @ExcludeMissing
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** Code used to categorize the purchase item. */
            fun itemCommodityCode(itemCommodityCode: String) =
                itemCommodityCode(JsonField.of(itemCommodityCode))

            /** Code used to categorize the purchase item. */
            @JsonProperty("item_commodity_code")
            @ExcludeMissing
            fun itemCommodityCode(itemCommodityCode: JsonField<String>) = apply {
                this.itemCommodityCode = itemCommodityCode
            }

            /** Description of the purchase item. */
            fun itemDescriptor(itemDescriptor: String) =
                itemDescriptor(JsonField.of(itemDescriptor))

            /** Description of the purchase item. */
            @JsonProperty("item_descriptor")
            @ExcludeMissing
            fun itemDescriptor(itemDescriptor: JsonField<String>) = apply {
                this.itemDescriptor = itemDescriptor
            }

            /** The number of units of the product being purchased. */
            fun itemQuantity(itemQuantity: String) = itemQuantity(JsonField.of(itemQuantity))

            /** The number of units of the product being purchased. */
            @JsonProperty("item_quantity")
            @ExcludeMissing
            fun itemQuantity(itemQuantity: JsonField<String>) = apply {
                this.itemQuantity = itemQuantity
            }

            /** Code used to categorize the product being purchased. */
            fun productCode(productCode: String) = productCode(JsonField.of(productCode))

            /** Code used to categorize the product being purchased. */
            @JsonProperty("product_code")
            @ExcludeMissing
            fun productCode(productCode: JsonField<String>) = apply {
                this.productCode = productCode
            }

            /** Sales tax amount for this line item. */
            fun salesTaxAmount(salesTaxAmount: Long) = salesTaxAmount(JsonField.of(salesTaxAmount))

            /** Sales tax amount for this line item. */
            @JsonProperty("sales_tax_amount")
            @ExcludeMissing
            fun salesTaxAmount(salesTaxAmount: JsonField<Long>) = apply {
                this.salesTaxAmount = salesTaxAmount
            }

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the sales tax
             * assessed.
             */
            fun salesTaxCurrency(salesTaxCurrency: String) =
                salesTaxCurrency(JsonField.of(salesTaxCurrency))

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the sales tax
             * assessed.
             */
            @JsonProperty("sales_tax_currency")
            @ExcludeMissing
            fun salesTaxCurrency(salesTaxCurrency: JsonField<String>) = apply {
                this.salesTaxCurrency = salesTaxCurrency
            }

            /** Sales tax rate for this line item. */
            fun salesTaxRate(salesTaxRate: String) = salesTaxRate(JsonField.of(salesTaxRate))

            /** Sales tax rate for this line item. */
            @JsonProperty("sales_tax_rate")
            @ExcludeMissing
            fun salesTaxRate(salesTaxRate: JsonField<String>) = apply {
                this.salesTaxRate = salesTaxRate
            }

            /** Total amount of all line items. */
            fun totalAmount(totalAmount: Long) = totalAmount(JsonField.of(totalAmount))

            /** Total amount of all line items. */
            @JsonProperty("total_amount")
            @ExcludeMissing
            fun totalAmount(totalAmount: JsonField<Long>) = apply { this.totalAmount = totalAmount }

            /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the total amount. */
            fun totalAmountCurrency(totalAmountCurrency: String) =
                totalAmountCurrency(JsonField.of(totalAmountCurrency))

            /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the total amount. */
            @JsonProperty("total_amount_currency")
            @ExcludeMissing
            fun totalAmountCurrency(totalAmountCurrency: JsonField<String>) = apply {
                this.totalAmountCurrency = totalAmountCurrency
            }

            /** Cost of line item per unit of measure, in major units. */
            fun unitCost(unitCost: String) = unitCost(JsonField.of(unitCost))

            /** Cost of line item per unit of measure, in major units. */
            @JsonProperty("unit_cost")
            @ExcludeMissing
            fun unitCost(unitCost: JsonField<String>) = apply { this.unitCost = unitCost }

            /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the unit cost. */
            fun unitCostCurrency(unitCostCurrency: String) =
                unitCostCurrency(JsonField.of(unitCostCurrency))

            /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the unit cost. */
            @JsonProperty("unit_cost_currency")
            @ExcludeMissing
            fun unitCostCurrency(unitCostCurrency: JsonField<String>) = apply {
                this.unitCostCurrency = unitCostCurrency
            }

            /** Code indicating unit of measure (gallons, etc.). */
            fun unitOfMeasureCode(unitOfMeasureCode: String) =
                unitOfMeasureCode(JsonField.of(unitOfMeasureCode))

            /** Code indicating unit of measure (gallons, etc.). */
            @JsonProperty("unit_of_measure_code")
            @ExcludeMissing
            fun unitOfMeasureCode(unitOfMeasureCode: JsonField<String>) = apply {
                this.unitOfMeasureCode = unitOfMeasureCode
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

            fun build(): LineItem =
                LineItem(
                    detailIndicator,
                    discountAmount,
                    discountCurrency,
                    discountTreatmentCode,
                    id,
                    itemCommodityCode,
                    itemDescriptor,
                    itemQuantity,
                    productCode,
                    salesTaxAmount,
                    salesTaxCurrency,
                    salesTaxRate,
                    totalAmount,
                    totalAmountCurrency,
                    unitCost,
                    unitCostCurrency,
                    unitOfMeasureCode,
                    additionalProperties.toImmutable(),
                )
        }

        class DetailIndicator
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is DetailIndicator && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val NORMAL = DetailIndicator(JsonField.of("normal"))

                @JvmField val CREDIT = DetailIndicator(JsonField.of("credit"))

                @JvmField val PAYMENT = DetailIndicator(JsonField.of("payment"))

                @JvmStatic fun of(value: String) = DetailIndicator(JsonField.of(value))
            }

            enum class Known {
                NORMAL,
                CREDIT,
                PAYMENT,
            }

            enum class Value {
                NORMAL,
                CREDIT,
                PAYMENT,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    NORMAL -> Value.NORMAL
                    CREDIT -> Value.CREDIT
                    PAYMENT -> Value.PAYMENT
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    NORMAL -> Known.NORMAL
                    CREDIT -> Known.CREDIT
                    PAYMENT -> Known.PAYMENT
                    else -> throw IncreaseInvalidDataException("Unknown DetailIndicator: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        class DiscountTreatmentCode
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is DiscountTreatmentCode && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField
                val NO_LINE_ITEM_LEVEL_DISCOUNT_PROVIDED =
                    DiscountTreatmentCode(JsonField.of("no_line_item_level_discount_provided"))

                @JvmField
                val TAX_CALCULATED_ON_POST_DISCOUNT_LINE_ITEM_TOTAL =
                    DiscountTreatmentCode(
                        JsonField.of("tax_calculated_on_post_discount_line_item_total")
                    )

                @JvmField
                val TAX_CALCULATED_ON_PRE_DISCOUNT_LINE_ITEM_TOTAL =
                    DiscountTreatmentCode(
                        JsonField.of("tax_calculated_on_pre_discount_line_item_total")
                    )

                @JvmStatic fun of(value: String) = DiscountTreatmentCode(JsonField.of(value))
            }

            enum class Known {
                NO_LINE_ITEM_LEVEL_DISCOUNT_PROVIDED,
                TAX_CALCULATED_ON_POST_DISCOUNT_LINE_ITEM_TOTAL,
                TAX_CALCULATED_ON_PRE_DISCOUNT_LINE_ITEM_TOTAL,
            }

            enum class Value {
                NO_LINE_ITEM_LEVEL_DISCOUNT_PROVIDED,
                TAX_CALCULATED_ON_POST_DISCOUNT_LINE_ITEM_TOTAL,
                TAX_CALCULATED_ON_PRE_DISCOUNT_LINE_ITEM_TOTAL,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    NO_LINE_ITEM_LEVEL_DISCOUNT_PROVIDED ->
                        Value.NO_LINE_ITEM_LEVEL_DISCOUNT_PROVIDED
                    TAX_CALCULATED_ON_POST_DISCOUNT_LINE_ITEM_TOTAL ->
                        Value.TAX_CALCULATED_ON_POST_DISCOUNT_LINE_ITEM_TOTAL
                    TAX_CALCULATED_ON_PRE_DISCOUNT_LINE_ITEM_TOTAL ->
                        Value.TAX_CALCULATED_ON_PRE_DISCOUNT_LINE_ITEM_TOTAL
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    NO_LINE_ITEM_LEVEL_DISCOUNT_PROVIDED ->
                        Known.NO_LINE_ITEM_LEVEL_DISCOUNT_PROVIDED
                    TAX_CALCULATED_ON_POST_DISCOUNT_LINE_ITEM_TOTAL ->
                        Known.TAX_CALCULATED_ON_POST_DISCOUNT_LINE_ITEM_TOTAL
                    TAX_CALCULATED_ON_PRE_DISCOUNT_LINE_ITEM_TOTAL ->
                        Known.TAX_CALCULATED_ON_PRE_DISCOUNT_LINE_ITEM_TOTAL
                    else ->
                        throw IncreaseInvalidDataException("Unknown DiscountTreatmentCode: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is LineItem && detailIndicator == other.detailIndicator && discountAmount == other.discountAmount && discountCurrency == other.discountCurrency && discountTreatmentCode == other.discountTreatmentCode && id == other.id && itemCommodityCode == other.itemCommodityCode && itemDescriptor == other.itemDescriptor && itemQuantity == other.itemQuantity && productCode == other.productCode && salesTaxAmount == other.salesTaxAmount && salesTaxCurrency == other.salesTaxCurrency && salesTaxRate == other.salesTaxRate && totalAmount == other.totalAmount && totalAmountCurrency == other.totalAmountCurrency && unitCost == other.unitCost && unitCostCurrency == other.unitCostCurrency && unitOfMeasureCode == other.unitOfMeasureCode && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(detailIndicator, discountAmount, discountCurrency, discountTreatmentCode, id, itemCommodityCode, itemDescriptor, itemQuantity, productCode, salesTaxAmount, salesTaxCurrency, salesTaxRate, totalAmount, totalAmountCurrency, unitCost, unitCostCurrency, unitOfMeasureCode, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "LineItem{detailIndicator=$detailIndicator, discountAmount=$discountAmount, discountCurrency=$discountCurrency, discountTreatmentCode=$discountTreatmentCode, id=$id, itemCommodityCode=$itemCommodityCode, itemDescriptor=$itemDescriptor, itemQuantity=$itemQuantity, productCode=$productCode, salesTaxAmount=$salesTaxAmount, salesTaxCurrency=$salesTaxCurrency, salesTaxRate=$salesTaxRate, totalAmount=$totalAmount, totalAmountCurrency=$totalAmountCurrency, unitCost=$unitCost, unitCostCurrency=$unitCostCurrency, unitOfMeasureCode=$unitOfMeasureCode, additionalProperties=$additionalProperties}"
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

            return /* spotless:off */ other is Type && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val CARD_PURCHASE_SUPPLEMENT = Type(JsonField.of("card_purchase_supplement"))

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            CARD_PURCHASE_SUPPLEMENT,
        }

        enum class Value {
            CARD_PURCHASE_SUPPLEMENT,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                CARD_PURCHASE_SUPPLEMENT -> Value.CARD_PURCHASE_SUPPLEMENT
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                CARD_PURCHASE_SUPPLEMENT -> Known.CARD_PURCHASE_SUPPLEMENT
                else -> throw IncreaseInvalidDataException("Unknown Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CardPurchaseSupplement && cardPaymentId == other.cardPaymentId && id == other.id && invoice == other.invoice && lineItems == other.lineItems && transactionId == other.transactionId && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(cardPaymentId, id, invoice, lineItems, transactionId, type, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CardPurchaseSupplement{cardPaymentId=$cardPaymentId, id=$id, invoice=$invoice, lineItems=$lineItems, transactionId=$transactionId, type=$type, additionalProperties=$additionalProperties}"
}
