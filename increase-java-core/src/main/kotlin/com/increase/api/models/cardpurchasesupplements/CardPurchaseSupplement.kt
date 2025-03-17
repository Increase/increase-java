// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.cardpurchasesupplements

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
import com.increase.api.core.checkKnown
import com.increase.api.core.checkRequired
import com.increase.api.core.immutableEmptyMap
import com.increase.api.core.toImmutable
import com.increase.api.errors.IncreaseInvalidDataException
import java.time.LocalDate
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Additional information about a card purchase (e.g., settlement or refund), such as level 3 line
 * item data.
 */
@NoAutoDetect
class CardPurchaseSupplement
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("card_payment_id")
    @ExcludeMissing
    private val cardPaymentId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("invoice")
    @ExcludeMissing
    private val invoice: JsonField<Invoice> = JsonMissing.of(),
    @JsonProperty("line_items")
    @ExcludeMissing
    private val lineItems: JsonField<List<LineItem>> = JsonMissing.of(),
    @JsonProperty("transaction_id")
    @ExcludeMissing
    private val transactionId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /**
     * The Card Purchase Supplement identifier.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * The ID of the Card Payment this transaction belongs to.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cardPaymentId(): Optional<String> =
        Optional.ofNullable(cardPaymentId.getNullable("card_payment_id"))

    /**
     * Invoice-level information about the payment.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun invoice(): Optional<Invoice> = Optional.ofNullable(invoice.getNullable("invoice"))

    /**
     * Line item information, such as individual products purchased.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lineItems(): Optional<List<LineItem>> =
        Optional.ofNullable(lineItems.getNullable("line_items"))

    /**
     * The ID of the transaction.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun transactionId(): String = transactionId.getRequired("transaction_id")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `card_purchase_supplement`.
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
     * Returns the raw JSON value of [cardPaymentId].
     *
     * Unlike [cardPaymentId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("card_payment_id")
    @ExcludeMissing
    fun _cardPaymentId(): JsonField<String> = cardPaymentId

    /**
     * Returns the raw JSON value of [invoice].
     *
     * Unlike [invoice], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("invoice") @ExcludeMissing fun _invoice(): JsonField<Invoice> = invoice

    /**
     * Returns the raw JSON value of [lineItems].
     *
     * Unlike [lineItems], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("line_items")
    @ExcludeMissing
    fun _lineItems(): JsonField<List<LineItem>> = lineItems

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

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): CardPurchaseSupplement = apply {
        if (validated) {
            return@apply
        }

        id()
        cardPaymentId()
        invoice().ifPresent { it.validate() }
        lineItems().ifPresent { it.forEach { it.validate() } }
        transactionId()
        type()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CardPurchaseSupplement].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .cardPaymentId()
         * .invoice()
         * .lineItems()
         * .transactionId()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CardPurchaseSupplement]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var cardPaymentId: JsonField<String>? = null
        private var invoice: JsonField<Invoice>? = null
        private var lineItems: JsonField<MutableList<LineItem>>? = null
        private var transactionId: JsonField<String>? = null
        private var type: JsonField<Type>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(cardPurchaseSupplement: CardPurchaseSupplement) = apply {
            id = cardPurchaseSupplement.id
            cardPaymentId = cardPurchaseSupplement.cardPaymentId
            invoice = cardPurchaseSupplement.invoice
            lineItems = cardPurchaseSupplement.lineItems.map { it.toMutableList() }
            transactionId = cardPurchaseSupplement.transactionId
            type = cardPurchaseSupplement.type
            additionalProperties = cardPurchaseSupplement.additionalProperties.toMutableMap()
        }

        /** The Card Purchase Supplement identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The ID of the Card Payment this transaction belongs to. */
        fun cardPaymentId(cardPaymentId: String?) =
            cardPaymentId(JsonField.ofNullable(cardPaymentId))

        /** Alias for calling [Builder.cardPaymentId] with `cardPaymentId.orElse(null)`. */
        fun cardPaymentId(cardPaymentId: Optional<String>) =
            cardPaymentId(cardPaymentId.getOrNull())

        /**
         * Sets [Builder.cardPaymentId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cardPaymentId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun cardPaymentId(cardPaymentId: JsonField<String>) = apply {
            this.cardPaymentId = cardPaymentId
        }

        /** Invoice-level information about the payment. */
        fun invoice(invoice: Invoice?) = invoice(JsonField.ofNullable(invoice))

        /** Alias for calling [Builder.invoice] with `invoice.orElse(null)`. */
        fun invoice(invoice: Optional<Invoice>) = invoice(invoice.getOrNull())

        /**
         * Sets [Builder.invoice] to an arbitrary JSON value.
         *
         * You should usually call [Builder.invoice] with a well-typed [Invoice] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun invoice(invoice: JsonField<Invoice>) = apply { this.invoice = invoice }

        /** Line item information, such as individual products purchased. */
        fun lineItems(lineItems: List<LineItem>?) = lineItems(JsonField.ofNullable(lineItems))

        /** Alias for calling [Builder.lineItems] with `lineItems.orElse(null)`. */
        fun lineItems(lineItems: Optional<List<LineItem>>) = lineItems(lineItems.getOrNull())

        /**
         * Sets [Builder.lineItems] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lineItems] with a well-typed `List<LineItem>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun lineItems(lineItems: JsonField<List<LineItem>>) = apply {
            this.lineItems = lineItems.map { it.toMutableList() }
        }

        /**
         * Adds a single [LineItem] to [lineItems].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addLineItem(lineItem: LineItem) = apply {
            lineItems =
                (lineItems ?: JsonField.of(mutableListOf())).also {
                    checkKnown("lineItems", it).add(lineItem)
                }
        }

        /** The ID of the transaction. */
        fun transactionId(transactionId: String) = transactionId(JsonField.of(transactionId))

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
         * `card_purchase_supplement`.
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
         * Returns an immutable instance of [CardPurchaseSupplement].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .cardPaymentId()
         * .invoice()
         * .lineItems()
         * .transactionId()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CardPurchaseSupplement =
            CardPurchaseSupplement(
                checkRequired("id", id),
                checkRequired("cardPaymentId", cardPaymentId),
                checkRequired("invoice", invoice),
                checkRequired("lineItems", lineItems).map { it.toImmutable() },
                checkRequired("transactionId", transactionId),
                checkRequired("type", type),
                additionalProperties.toImmutable(),
            )
    }

    /** Invoice-level information about the payment. */
    @NoAutoDetect
    class Invoice
    @JsonCreator
    private constructor(
        @JsonProperty("discount_amount")
        @ExcludeMissing
        private val discountAmount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("discount_currency")
        @ExcludeMissing
        private val discountCurrency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("discount_treatment_code")
        @ExcludeMissing
        private val discountTreatmentCode: JsonField<DiscountTreatmentCode> = JsonMissing.of(),
        @JsonProperty("duty_tax_amount")
        @ExcludeMissing
        private val dutyTaxAmount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("duty_tax_currency")
        @ExcludeMissing
        private val dutyTaxCurrency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("order_date")
        @ExcludeMissing
        private val orderDate: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("shipping_amount")
        @ExcludeMissing
        private val shippingAmount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("shipping_currency")
        @ExcludeMissing
        private val shippingCurrency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("shipping_destination_country_code")
        @ExcludeMissing
        private val shippingDestinationCountryCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("shipping_destination_postal_code")
        @ExcludeMissing
        private val shippingDestinationPostalCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("shipping_source_postal_code")
        @ExcludeMissing
        private val shippingSourcePostalCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("shipping_tax_amount")
        @ExcludeMissing
        private val shippingTaxAmount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("shipping_tax_currency")
        @ExcludeMissing
        private val shippingTaxCurrency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("shipping_tax_rate")
        @ExcludeMissing
        private val shippingTaxRate: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tax_treatments")
        @ExcludeMissing
        private val taxTreatments: JsonField<TaxTreatments> = JsonMissing.of(),
        @JsonProperty("unique_value_added_tax_invoice_reference")
        @ExcludeMissing
        private val uniqueValueAddedTaxInvoiceReference: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * Discount given to cardholder.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun discountAmount(): Optional<Long> =
            Optional.ofNullable(discountAmount.getNullable("discount_amount"))

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the discount.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun discountCurrency(): Optional<String> =
            Optional.ofNullable(discountCurrency.getNullable("discount_currency"))

        /**
         * Indicates how the merchant applied the discount.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun discountTreatmentCode(): Optional<DiscountTreatmentCode> =
            Optional.ofNullable(discountTreatmentCode.getNullable("discount_treatment_code"))

        /**
         * Amount of duty taxes.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun dutyTaxAmount(): Optional<Long> =
            Optional.ofNullable(dutyTaxAmount.getNullable("duty_tax_amount"))

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the duty tax.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun dutyTaxCurrency(): Optional<String> =
            Optional.ofNullable(dutyTaxCurrency.getNullable("duty_tax_currency"))

        /**
         * Date the order was taken.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun orderDate(): Optional<LocalDate> =
            Optional.ofNullable(orderDate.getNullable("order_date"))

        /**
         * The shipping cost.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun shippingAmount(): Optional<Long> =
            Optional.ofNullable(shippingAmount.getNullable("shipping_amount"))

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the shipping cost.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun shippingCurrency(): Optional<String> =
            Optional.ofNullable(shippingCurrency.getNullable("shipping_currency"))

        /**
         * Country code of the shipping destination.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun shippingDestinationCountryCode(): Optional<String> =
            Optional.ofNullable(
                shippingDestinationCountryCode.getNullable("shipping_destination_country_code")
            )

        /**
         * Postal code of the shipping destination.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun shippingDestinationPostalCode(): Optional<String> =
            Optional.ofNullable(
                shippingDestinationPostalCode.getNullable("shipping_destination_postal_code")
            )

        /**
         * Postal code of the location being shipped from.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun shippingSourcePostalCode(): Optional<String> =
            Optional.ofNullable(shippingSourcePostalCode.getNullable("shipping_source_postal_code"))

        /**
         * Taxes paid for freight and shipping.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun shippingTaxAmount(): Optional<Long> =
            Optional.ofNullable(shippingTaxAmount.getNullable("shipping_tax_amount"))

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the shipping tax.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun shippingTaxCurrency(): Optional<String> =
            Optional.ofNullable(shippingTaxCurrency.getNullable("shipping_tax_currency"))

        /**
         * Tax rate for freight and shipping.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun shippingTaxRate(): Optional<String> =
            Optional.ofNullable(shippingTaxRate.getNullable("shipping_tax_rate"))

        /**
         * Indicates how the merchant applied taxes.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun taxTreatments(): Optional<TaxTreatments> =
            Optional.ofNullable(taxTreatments.getNullable("tax_treatments"))

        /**
         * Value added tax invoice reference number.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun uniqueValueAddedTaxInvoiceReference(): Optional<String> =
            Optional.ofNullable(
                uniqueValueAddedTaxInvoiceReference.getNullable(
                    "unique_value_added_tax_invoice_reference"
                )
            )

        /**
         * Returns the raw JSON value of [discountAmount].
         *
         * Unlike [discountAmount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("discount_amount")
        @ExcludeMissing
        fun _discountAmount(): JsonField<Long> = discountAmount

        /**
         * Returns the raw JSON value of [discountCurrency].
         *
         * Unlike [discountCurrency], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("discount_currency")
        @ExcludeMissing
        fun _discountCurrency(): JsonField<String> = discountCurrency

        /**
         * Returns the raw JSON value of [discountTreatmentCode].
         *
         * Unlike [discountTreatmentCode], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("discount_treatment_code")
        @ExcludeMissing
        fun _discountTreatmentCode(): JsonField<DiscountTreatmentCode> = discountTreatmentCode

        /**
         * Returns the raw JSON value of [dutyTaxAmount].
         *
         * Unlike [dutyTaxAmount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("duty_tax_amount")
        @ExcludeMissing
        fun _dutyTaxAmount(): JsonField<Long> = dutyTaxAmount

        /**
         * Returns the raw JSON value of [dutyTaxCurrency].
         *
         * Unlike [dutyTaxCurrency], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("duty_tax_currency")
        @ExcludeMissing
        fun _dutyTaxCurrency(): JsonField<String> = dutyTaxCurrency

        /**
         * Returns the raw JSON value of [orderDate].
         *
         * Unlike [orderDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("order_date")
        @ExcludeMissing
        fun _orderDate(): JsonField<LocalDate> = orderDate

        /**
         * Returns the raw JSON value of [shippingAmount].
         *
         * Unlike [shippingAmount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("shipping_amount")
        @ExcludeMissing
        fun _shippingAmount(): JsonField<Long> = shippingAmount

        /**
         * Returns the raw JSON value of [shippingCurrency].
         *
         * Unlike [shippingCurrency], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("shipping_currency")
        @ExcludeMissing
        fun _shippingCurrency(): JsonField<String> = shippingCurrency

        /**
         * Returns the raw JSON value of [shippingDestinationCountryCode].
         *
         * Unlike [shippingDestinationCountryCode], this method doesn't throw if the JSON field has
         * an unexpected type.
         */
        @JsonProperty("shipping_destination_country_code")
        @ExcludeMissing
        fun _shippingDestinationCountryCode(): JsonField<String> = shippingDestinationCountryCode

        /**
         * Returns the raw JSON value of [shippingDestinationPostalCode].
         *
         * Unlike [shippingDestinationPostalCode], this method doesn't throw if the JSON field has
         * an unexpected type.
         */
        @JsonProperty("shipping_destination_postal_code")
        @ExcludeMissing
        fun _shippingDestinationPostalCode(): JsonField<String> = shippingDestinationPostalCode

        /**
         * Returns the raw JSON value of [shippingSourcePostalCode].
         *
         * Unlike [shippingSourcePostalCode], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("shipping_source_postal_code")
        @ExcludeMissing
        fun _shippingSourcePostalCode(): JsonField<String> = shippingSourcePostalCode

        /**
         * Returns the raw JSON value of [shippingTaxAmount].
         *
         * Unlike [shippingTaxAmount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("shipping_tax_amount")
        @ExcludeMissing
        fun _shippingTaxAmount(): JsonField<Long> = shippingTaxAmount

        /**
         * Returns the raw JSON value of [shippingTaxCurrency].
         *
         * Unlike [shippingTaxCurrency], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("shipping_tax_currency")
        @ExcludeMissing
        fun _shippingTaxCurrency(): JsonField<String> = shippingTaxCurrency

        /**
         * Returns the raw JSON value of [shippingTaxRate].
         *
         * Unlike [shippingTaxRate], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("shipping_tax_rate")
        @ExcludeMissing
        fun _shippingTaxRate(): JsonField<String> = shippingTaxRate

        /**
         * Returns the raw JSON value of [taxTreatments].
         *
         * Unlike [taxTreatments], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("tax_treatments")
        @ExcludeMissing
        fun _taxTreatments(): JsonField<TaxTreatments> = taxTreatments

        /**
         * Returns the raw JSON value of [uniqueValueAddedTaxInvoiceReference].
         *
         * Unlike [uniqueValueAddedTaxInvoiceReference], this method doesn't throw if the JSON field
         * has an unexpected type.
         */
        @JsonProperty("unique_value_added_tax_invoice_reference")
        @ExcludeMissing
        fun _uniqueValueAddedTaxInvoiceReference(): JsonField<String> =
            uniqueValueAddedTaxInvoiceReference

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Invoice = apply {
            if (validated) {
                return@apply
            }

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

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Invoice].
             *
             * The following fields are required:
             * ```java
             * .discountAmount()
             * .discountCurrency()
             * .discountTreatmentCode()
             * .dutyTaxAmount()
             * .dutyTaxCurrency()
             * .orderDate()
             * .shippingAmount()
             * .shippingCurrency()
             * .shippingDestinationCountryCode()
             * .shippingDestinationPostalCode()
             * .shippingSourcePostalCode()
             * .shippingTaxAmount()
             * .shippingTaxCurrency()
             * .shippingTaxRate()
             * .taxTreatments()
             * .uniqueValueAddedTaxInvoiceReference()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Invoice]. */
        class Builder internal constructor() {

            private var discountAmount: JsonField<Long>? = null
            private var discountCurrency: JsonField<String>? = null
            private var discountTreatmentCode: JsonField<DiscountTreatmentCode>? = null
            private var dutyTaxAmount: JsonField<Long>? = null
            private var dutyTaxCurrency: JsonField<String>? = null
            private var orderDate: JsonField<LocalDate>? = null
            private var shippingAmount: JsonField<Long>? = null
            private var shippingCurrency: JsonField<String>? = null
            private var shippingDestinationCountryCode: JsonField<String>? = null
            private var shippingDestinationPostalCode: JsonField<String>? = null
            private var shippingSourcePostalCode: JsonField<String>? = null
            private var shippingTaxAmount: JsonField<Long>? = null
            private var shippingTaxCurrency: JsonField<String>? = null
            private var shippingTaxRate: JsonField<String>? = null
            private var taxTreatments: JsonField<TaxTreatments>? = null
            private var uniqueValueAddedTaxInvoiceReference: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(invoice: Invoice) = apply {
                discountAmount = invoice.discountAmount
                discountCurrency = invoice.discountCurrency
                discountTreatmentCode = invoice.discountTreatmentCode
                dutyTaxAmount = invoice.dutyTaxAmount
                dutyTaxCurrency = invoice.dutyTaxCurrency
                orderDate = invoice.orderDate
                shippingAmount = invoice.shippingAmount
                shippingCurrency = invoice.shippingCurrency
                shippingDestinationCountryCode = invoice.shippingDestinationCountryCode
                shippingDestinationPostalCode = invoice.shippingDestinationPostalCode
                shippingSourcePostalCode = invoice.shippingSourcePostalCode
                shippingTaxAmount = invoice.shippingTaxAmount
                shippingTaxCurrency = invoice.shippingTaxCurrency
                shippingTaxRate = invoice.shippingTaxRate
                taxTreatments = invoice.taxTreatments
                uniqueValueAddedTaxInvoiceReference = invoice.uniqueValueAddedTaxInvoiceReference
                additionalProperties = invoice.additionalProperties.toMutableMap()
            }

            /** Discount given to cardholder. */
            fun discountAmount(discountAmount: Long?) =
                discountAmount(JsonField.ofNullable(discountAmount))

            /**
             * Alias for [Builder.discountAmount].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun discountAmount(discountAmount: Long) = discountAmount(discountAmount as Long?)

            /** Alias for calling [Builder.discountAmount] with `discountAmount.orElse(null)`. */
            fun discountAmount(discountAmount: Optional<Long>) =
                discountAmount(discountAmount.getOrNull())

            /**
             * Sets [Builder.discountAmount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.discountAmount] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun discountAmount(discountAmount: JsonField<Long>) = apply {
                this.discountAmount = discountAmount
            }

            /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the discount. */
            fun discountCurrency(discountCurrency: String?) =
                discountCurrency(JsonField.ofNullable(discountCurrency))

            /**
             * Alias for calling [Builder.discountCurrency] with `discountCurrency.orElse(null)`.
             */
            fun discountCurrency(discountCurrency: Optional<String>) =
                discountCurrency(discountCurrency.getOrNull())

            /**
             * Sets [Builder.discountCurrency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.discountCurrency] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun discountCurrency(discountCurrency: JsonField<String>) = apply {
                this.discountCurrency = discountCurrency
            }

            /** Indicates how the merchant applied the discount. */
            fun discountTreatmentCode(discountTreatmentCode: DiscountTreatmentCode?) =
                discountTreatmentCode(JsonField.ofNullable(discountTreatmentCode))

            /**
             * Alias for calling [Builder.discountTreatmentCode] with
             * `discountTreatmentCode.orElse(null)`.
             */
            fun discountTreatmentCode(discountTreatmentCode: Optional<DiscountTreatmentCode>) =
                discountTreatmentCode(discountTreatmentCode.getOrNull())

            /**
             * Sets [Builder.discountTreatmentCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.discountTreatmentCode] with a well-typed
             * [DiscountTreatmentCode] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun discountTreatmentCode(discountTreatmentCode: JsonField<DiscountTreatmentCode>) =
                apply {
                    this.discountTreatmentCode = discountTreatmentCode
                }

            /** Amount of duty taxes. */
            fun dutyTaxAmount(dutyTaxAmount: Long?) =
                dutyTaxAmount(JsonField.ofNullable(dutyTaxAmount))

            /**
             * Alias for [Builder.dutyTaxAmount].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun dutyTaxAmount(dutyTaxAmount: Long) = dutyTaxAmount(dutyTaxAmount as Long?)

            /** Alias for calling [Builder.dutyTaxAmount] with `dutyTaxAmount.orElse(null)`. */
            fun dutyTaxAmount(dutyTaxAmount: Optional<Long>) =
                dutyTaxAmount(dutyTaxAmount.getOrNull())

            /**
             * Sets [Builder.dutyTaxAmount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dutyTaxAmount] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dutyTaxAmount(dutyTaxAmount: JsonField<Long>) = apply {
                this.dutyTaxAmount = dutyTaxAmount
            }

            /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the duty tax. */
            fun dutyTaxCurrency(dutyTaxCurrency: String?) =
                dutyTaxCurrency(JsonField.ofNullable(dutyTaxCurrency))

            /** Alias for calling [Builder.dutyTaxCurrency] with `dutyTaxCurrency.orElse(null)`. */
            fun dutyTaxCurrency(dutyTaxCurrency: Optional<String>) =
                dutyTaxCurrency(dutyTaxCurrency.getOrNull())

            /**
             * Sets [Builder.dutyTaxCurrency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dutyTaxCurrency] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dutyTaxCurrency(dutyTaxCurrency: JsonField<String>) = apply {
                this.dutyTaxCurrency = dutyTaxCurrency
            }

            /** Date the order was taken. */
            fun orderDate(orderDate: LocalDate?) = orderDate(JsonField.ofNullable(orderDate))

            /** Alias for calling [Builder.orderDate] with `orderDate.orElse(null)`. */
            fun orderDate(orderDate: Optional<LocalDate>) = orderDate(orderDate.getOrNull())

            /**
             * Sets [Builder.orderDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.orderDate] with a well-typed [LocalDate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun orderDate(orderDate: JsonField<LocalDate>) = apply { this.orderDate = orderDate }

            /** The shipping cost. */
            fun shippingAmount(shippingAmount: Long?) =
                shippingAmount(JsonField.ofNullable(shippingAmount))

            /**
             * Alias for [Builder.shippingAmount].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun shippingAmount(shippingAmount: Long) = shippingAmount(shippingAmount as Long?)

            /** Alias for calling [Builder.shippingAmount] with `shippingAmount.orElse(null)`. */
            fun shippingAmount(shippingAmount: Optional<Long>) =
                shippingAmount(shippingAmount.getOrNull())

            /**
             * Sets [Builder.shippingAmount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.shippingAmount] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun shippingAmount(shippingAmount: JsonField<Long>) = apply {
                this.shippingAmount = shippingAmount
            }

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the shipping cost.
             */
            fun shippingCurrency(shippingCurrency: String?) =
                shippingCurrency(JsonField.ofNullable(shippingCurrency))

            /**
             * Alias for calling [Builder.shippingCurrency] with `shippingCurrency.orElse(null)`.
             */
            fun shippingCurrency(shippingCurrency: Optional<String>) =
                shippingCurrency(shippingCurrency.getOrNull())

            /**
             * Sets [Builder.shippingCurrency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.shippingCurrency] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun shippingCurrency(shippingCurrency: JsonField<String>) = apply {
                this.shippingCurrency = shippingCurrency
            }

            /** Country code of the shipping destination. */
            fun shippingDestinationCountryCode(shippingDestinationCountryCode: String?) =
                shippingDestinationCountryCode(JsonField.ofNullable(shippingDestinationCountryCode))

            /**
             * Alias for calling [Builder.shippingDestinationCountryCode] with
             * `shippingDestinationCountryCode.orElse(null)`.
             */
            fun shippingDestinationCountryCode(shippingDestinationCountryCode: Optional<String>) =
                shippingDestinationCountryCode(shippingDestinationCountryCode.getOrNull())

            /**
             * Sets [Builder.shippingDestinationCountryCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.shippingDestinationCountryCode] with a well-typed
             * [String] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun shippingDestinationCountryCode(shippingDestinationCountryCode: JsonField<String>) =
                apply {
                    this.shippingDestinationCountryCode = shippingDestinationCountryCode
                }

            /** Postal code of the shipping destination. */
            fun shippingDestinationPostalCode(shippingDestinationPostalCode: String?) =
                shippingDestinationPostalCode(JsonField.ofNullable(shippingDestinationPostalCode))

            /**
             * Alias for calling [Builder.shippingDestinationPostalCode] with
             * `shippingDestinationPostalCode.orElse(null)`.
             */
            fun shippingDestinationPostalCode(shippingDestinationPostalCode: Optional<String>) =
                shippingDestinationPostalCode(shippingDestinationPostalCode.getOrNull())

            /**
             * Sets [Builder.shippingDestinationPostalCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.shippingDestinationPostalCode] with a well-typed
             * [String] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun shippingDestinationPostalCode(shippingDestinationPostalCode: JsonField<String>) =
                apply {
                    this.shippingDestinationPostalCode = shippingDestinationPostalCode
                }

            /** Postal code of the location being shipped from. */
            fun shippingSourcePostalCode(shippingSourcePostalCode: String?) =
                shippingSourcePostalCode(JsonField.ofNullable(shippingSourcePostalCode))

            /**
             * Alias for calling [Builder.shippingSourcePostalCode] with
             * `shippingSourcePostalCode.orElse(null)`.
             */
            fun shippingSourcePostalCode(shippingSourcePostalCode: Optional<String>) =
                shippingSourcePostalCode(shippingSourcePostalCode.getOrNull())

            /**
             * Sets [Builder.shippingSourcePostalCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.shippingSourcePostalCode] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun shippingSourcePostalCode(shippingSourcePostalCode: JsonField<String>) = apply {
                this.shippingSourcePostalCode = shippingSourcePostalCode
            }

            /** Taxes paid for freight and shipping. */
            fun shippingTaxAmount(shippingTaxAmount: Long?) =
                shippingTaxAmount(JsonField.ofNullable(shippingTaxAmount))

            /**
             * Alias for [Builder.shippingTaxAmount].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun shippingTaxAmount(shippingTaxAmount: Long) =
                shippingTaxAmount(shippingTaxAmount as Long?)

            /**
             * Alias for calling [Builder.shippingTaxAmount] with `shippingTaxAmount.orElse(null)`.
             */
            fun shippingTaxAmount(shippingTaxAmount: Optional<Long>) =
                shippingTaxAmount(shippingTaxAmount.getOrNull())

            /**
             * Sets [Builder.shippingTaxAmount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.shippingTaxAmount] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun shippingTaxAmount(shippingTaxAmount: JsonField<Long>) = apply {
                this.shippingTaxAmount = shippingTaxAmount
            }

            /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the shipping tax. */
            fun shippingTaxCurrency(shippingTaxCurrency: String?) =
                shippingTaxCurrency(JsonField.ofNullable(shippingTaxCurrency))

            /**
             * Alias for calling [Builder.shippingTaxCurrency] with
             * `shippingTaxCurrency.orElse(null)`.
             */
            fun shippingTaxCurrency(shippingTaxCurrency: Optional<String>) =
                shippingTaxCurrency(shippingTaxCurrency.getOrNull())

            /**
             * Sets [Builder.shippingTaxCurrency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.shippingTaxCurrency] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun shippingTaxCurrency(shippingTaxCurrency: JsonField<String>) = apply {
                this.shippingTaxCurrency = shippingTaxCurrency
            }

            /** Tax rate for freight and shipping. */
            fun shippingTaxRate(shippingTaxRate: String?) =
                shippingTaxRate(JsonField.ofNullable(shippingTaxRate))

            /** Alias for calling [Builder.shippingTaxRate] with `shippingTaxRate.orElse(null)`. */
            fun shippingTaxRate(shippingTaxRate: Optional<String>) =
                shippingTaxRate(shippingTaxRate.getOrNull())

            /**
             * Sets [Builder.shippingTaxRate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.shippingTaxRate] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun shippingTaxRate(shippingTaxRate: JsonField<String>) = apply {
                this.shippingTaxRate = shippingTaxRate
            }

            /** Indicates how the merchant applied taxes. */
            fun taxTreatments(taxTreatments: TaxTreatments?) =
                taxTreatments(JsonField.ofNullable(taxTreatments))

            /** Alias for calling [Builder.taxTreatments] with `taxTreatments.orElse(null)`. */
            fun taxTreatments(taxTreatments: Optional<TaxTreatments>) =
                taxTreatments(taxTreatments.getOrNull())

            /**
             * Sets [Builder.taxTreatments] to an arbitrary JSON value.
             *
             * You should usually call [Builder.taxTreatments] with a well-typed [TaxTreatments]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun taxTreatments(taxTreatments: JsonField<TaxTreatments>) = apply {
                this.taxTreatments = taxTreatments
            }

            /** Value added tax invoice reference number. */
            fun uniqueValueAddedTaxInvoiceReference(uniqueValueAddedTaxInvoiceReference: String?) =
                uniqueValueAddedTaxInvoiceReference(
                    JsonField.ofNullable(uniqueValueAddedTaxInvoiceReference)
                )

            /**
             * Alias for calling [Builder.uniqueValueAddedTaxInvoiceReference] with
             * `uniqueValueAddedTaxInvoiceReference.orElse(null)`.
             */
            fun uniqueValueAddedTaxInvoiceReference(
                uniqueValueAddedTaxInvoiceReference: Optional<String>
            ) = uniqueValueAddedTaxInvoiceReference(uniqueValueAddedTaxInvoiceReference.getOrNull())

            /**
             * Sets [Builder.uniqueValueAddedTaxInvoiceReference] to an arbitrary JSON value.
             *
             * You should usually call [Builder.uniqueValueAddedTaxInvoiceReference] with a
             * well-typed [String] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun uniqueValueAddedTaxInvoiceReference(
                uniqueValueAddedTaxInvoiceReference: JsonField<String>
            ) = apply {
                this.uniqueValueAddedTaxInvoiceReference = uniqueValueAddedTaxInvoiceReference
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
             * Returns an immutable instance of [Invoice].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .discountAmount()
             * .discountCurrency()
             * .discountTreatmentCode()
             * .dutyTaxAmount()
             * .dutyTaxCurrency()
             * .orderDate()
             * .shippingAmount()
             * .shippingCurrency()
             * .shippingDestinationCountryCode()
             * .shippingDestinationPostalCode()
             * .shippingSourcePostalCode()
             * .shippingTaxAmount()
             * .shippingTaxCurrency()
             * .shippingTaxRate()
             * .taxTreatments()
             * .uniqueValueAddedTaxInvoiceReference()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Invoice =
                Invoice(
                    checkRequired("discountAmount", discountAmount),
                    checkRequired("discountCurrency", discountCurrency),
                    checkRequired("discountTreatmentCode", discountTreatmentCode),
                    checkRequired("dutyTaxAmount", dutyTaxAmount),
                    checkRequired("dutyTaxCurrency", dutyTaxCurrency),
                    checkRequired("orderDate", orderDate),
                    checkRequired("shippingAmount", shippingAmount),
                    checkRequired("shippingCurrency", shippingCurrency),
                    checkRequired("shippingDestinationCountryCode", shippingDestinationCountryCode),
                    checkRequired("shippingDestinationPostalCode", shippingDestinationPostalCode),
                    checkRequired("shippingSourcePostalCode", shippingSourcePostalCode),
                    checkRequired("shippingTaxAmount", shippingTaxAmount),
                    checkRequired("shippingTaxCurrency", shippingTaxCurrency),
                    checkRequired("shippingTaxRate", shippingTaxRate),
                    checkRequired("taxTreatments", taxTreatments),
                    checkRequired(
                        "uniqueValueAddedTaxInvoiceReference",
                        uniqueValueAddedTaxInvoiceReference,
                    ),
                    additionalProperties.toImmutable(),
                )
        }

        /** Indicates how the merchant applied the discount. */
        class DiscountTreatmentCode
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

                /** No invoice level discount provided */
                @JvmField
                val NO_INVOICE_LEVEL_DISCOUNT_PROVIDED = of("no_invoice_level_discount_provided")

                /** Tax calculated on post discount invoice total */
                @JvmField
                val TAX_CALCULATED_ON_POST_DISCOUNT_INVOICE_TOTAL =
                    of("tax_calculated_on_post_discount_invoice_total")

                /** Tax calculated on pre discount invoice total */
                @JvmField
                val TAX_CALCULATED_ON_PRE_DISCOUNT_INVOICE_TOTAL =
                    of("tax_calculated_on_pre_discount_invoice_total")

                @JvmStatic fun of(value: String) = DiscountTreatmentCode(JsonField.of(value))
            }

            /** An enum containing [DiscountTreatmentCode]'s known values. */
            enum class Known {
                /** No invoice level discount provided */
                NO_INVOICE_LEVEL_DISCOUNT_PROVIDED,
                /** Tax calculated on post discount invoice total */
                TAX_CALCULATED_ON_POST_DISCOUNT_INVOICE_TOTAL,
                /** Tax calculated on pre discount invoice total */
                TAX_CALCULATED_ON_PRE_DISCOUNT_INVOICE_TOTAL,
            }

            /**
             * An enum containing [DiscountTreatmentCode]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [DiscountTreatmentCode] can contain an unknown value in a couple of
             * cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                /** No invoice level discount provided */
                NO_INVOICE_LEVEL_DISCOUNT_PROVIDED,
                /** Tax calculated on post discount invoice total */
                TAX_CALCULATED_ON_POST_DISCOUNT_INVOICE_TOTAL,
                /** Tax calculated on pre discount invoice total */
                TAX_CALCULATED_ON_PRE_DISCOUNT_INVOICE_TOTAL,
                /**
                 * An enum member indicating that [DiscountTreatmentCode] was instantiated with an
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
                    NO_INVOICE_LEVEL_DISCOUNT_PROVIDED -> Value.NO_INVOICE_LEVEL_DISCOUNT_PROVIDED
                    TAX_CALCULATED_ON_POST_DISCOUNT_INVOICE_TOTAL ->
                        Value.TAX_CALCULATED_ON_POST_DISCOUNT_INVOICE_TOTAL
                    TAX_CALCULATED_ON_PRE_DISCOUNT_INVOICE_TOTAL ->
                        Value.TAX_CALCULATED_ON_PRE_DISCOUNT_INVOICE_TOTAL
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
                    NO_INVOICE_LEVEL_DISCOUNT_PROVIDED -> Known.NO_INVOICE_LEVEL_DISCOUNT_PROVIDED
                    TAX_CALCULATED_ON_POST_DISCOUNT_INVOICE_TOTAL ->
                        Known.TAX_CALCULATED_ON_POST_DISCOUNT_INVOICE_TOTAL
                    TAX_CALCULATED_ON_PRE_DISCOUNT_INVOICE_TOTAL ->
                        Known.TAX_CALCULATED_ON_PRE_DISCOUNT_INVOICE_TOTAL
                    else ->
                        throw IncreaseInvalidDataException("Unknown DiscountTreatmentCode: $value")
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

                return /* spotless:off */ other is DiscountTreatmentCode && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Indicates how the merchant applied taxes. */
        class TaxTreatments @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

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

                /** No tax applies */
                @JvmField val NO_TAX_APPLIES = of("no_tax_applies")

                /** Net price line item level */
                @JvmField val NET_PRICE_LINE_ITEM_LEVEL = of("net_price_line_item_level")

                /** Net price invoice level */
                @JvmField val NET_PRICE_INVOICE_LEVEL = of("net_price_invoice_level")

                /** Gross price line item level */
                @JvmField val GROSS_PRICE_LINE_ITEM_LEVEL = of("gross_price_line_item_level")

                /** Gross price invoice level */
                @JvmField val GROSS_PRICE_INVOICE_LEVEL = of("gross_price_invoice_level")

                @JvmStatic fun of(value: String) = TaxTreatments(JsonField.of(value))
            }

            /** An enum containing [TaxTreatments]'s known values. */
            enum class Known {
                /** No tax applies */
                NO_TAX_APPLIES,
                /** Net price line item level */
                NET_PRICE_LINE_ITEM_LEVEL,
                /** Net price invoice level */
                NET_PRICE_INVOICE_LEVEL,
                /** Gross price line item level */
                GROSS_PRICE_LINE_ITEM_LEVEL,
                /** Gross price invoice level */
                GROSS_PRICE_INVOICE_LEVEL,
            }

            /**
             * An enum containing [TaxTreatments]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [TaxTreatments] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                /** No tax applies */
                NO_TAX_APPLIES,
                /** Net price line item level */
                NET_PRICE_LINE_ITEM_LEVEL,
                /** Net price invoice level */
                NET_PRICE_INVOICE_LEVEL,
                /** Gross price line item level */
                GROSS_PRICE_LINE_ITEM_LEVEL,
                /** Gross price invoice level */
                GROSS_PRICE_INVOICE_LEVEL,
                /**
                 * An enum member indicating that [TaxTreatments] was instantiated with an unknown
                 * value.
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
                    NO_TAX_APPLIES -> Value.NO_TAX_APPLIES
                    NET_PRICE_LINE_ITEM_LEVEL -> Value.NET_PRICE_LINE_ITEM_LEVEL
                    NET_PRICE_INVOICE_LEVEL -> Value.NET_PRICE_INVOICE_LEVEL
                    GROSS_PRICE_LINE_ITEM_LEVEL -> Value.GROSS_PRICE_LINE_ITEM_LEVEL
                    GROSS_PRICE_INVOICE_LEVEL -> Value.GROSS_PRICE_INVOICE_LEVEL
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
                    NO_TAX_APPLIES -> Known.NO_TAX_APPLIES
                    NET_PRICE_LINE_ITEM_LEVEL -> Known.NET_PRICE_LINE_ITEM_LEVEL
                    NET_PRICE_INVOICE_LEVEL -> Known.NET_PRICE_INVOICE_LEVEL
                    GROSS_PRICE_LINE_ITEM_LEVEL -> Known.GROSS_PRICE_LINE_ITEM_LEVEL
                    GROSS_PRICE_INVOICE_LEVEL -> Known.GROSS_PRICE_INVOICE_LEVEL
                    else -> throw IncreaseInvalidDataException("Unknown TaxTreatments: $value")
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

                return /* spotless:off */ other is TaxTreatments && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
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

    @NoAutoDetect
    class LineItem
    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("detail_indicator")
        @ExcludeMissing
        private val detailIndicator: JsonField<DetailIndicator> = JsonMissing.of(),
        @JsonProperty("discount_amount")
        @ExcludeMissing
        private val discountAmount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("discount_currency")
        @ExcludeMissing
        private val discountCurrency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("discount_treatment_code")
        @ExcludeMissing
        private val discountTreatmentCode: JsonField<DiscountTreatmentCode> = JsonMissing.of(),
        @JsonProperty("item_commodity_code")
        @ExcludeMissing
        private val itemCommodityCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("item_descriptor")
        @ExcludeMissing
        private val itemDescriptor: JsonField<String> = JsonMissing.of(),
        @JsonProperty("item_quantity")
        @ExcludeMissing
        private val itemQuantity: JsonField<String> = JsonMissing.of(),
        @JsonProperty("product_code")
        @ExcludeMissing
        private val productCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sales_tax_amount")
        @ExcludeMissing
        private val salesTaxAmount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("sales_tax_currency")
        @ExcludeMissing
        private val salesTaxCurrency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sales_tax_rate")
        @ExcludeMissing
        private val salesTaxRate: JsonField<String> = JsonMissing.of(),
        @JsonProperty("total_amount")
        @ExcludeMissing
        private val totalAmount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("total_amount_currency")
        @ExcludeMissing
        private val totalAmountCurrency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("unit_cost")
        @ExcludeMissing
        private val unitCost: JsonField<String> = JsonMissing.of(),
        @JsonProperty("unit_cost_currency")
        @ExcludeMissing
        private val unitCostCurrency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("unit_of_measure_code")
        @ExcludeMissing
        private val unitOfMeasureCode: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * The Card Purchase Supplement Line Item identifier.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * Indicates the type of line item.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun detailIndicator(): Optional<DetailIndicator> =
            Optional.ofNullable(detailIndicator.getNullable("detail_indicator"))

        /**
         * Discount amount for this specific line item.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun discountAmount(): Optional<Long> =
            Optional.ofNullable(discountAmount.getNullable("discount_amount"))

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the discount.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun discountCurrency(): Optional<String> =
            Optional.ofNullable(discountCurrency.getNullable("discount_currency"))

        /**
         * Indicates how the merchant applied the discount for this specific line item.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun discountTreatmentCode(): Optional<DiscountTreatmentCode> =
            Optional.ofNullable(discountTreatmentCode.getNullable("discount_treatment_code"))

        /**
         * Code used to categorize the purchase item.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun itemCommodityCode(): Optional<String> =
            Optional.ofNullable(itemCommodityCode.getNullable("item_commodity_code"))

        /**
         * Description of the purchase item.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun itemDescriptor(): Optional<String> =
            Optional.ofNullable(itemDescriptor.getNullable("item_descriptor"))

        /**
         * The number of units of the product being purchased.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun itemQuantity(): Optional<String> =
            Optional.ofNullable(itemQuantity.getNullable("item_quantity"))

        /**
         * Code used to categorize the product being purchased.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun productCode(): Optional<String> =
            Optional.ofNullable(productCode.getNullable("product_code"))

        /**
         * Sales tax amount for this line item.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun salesTaxAmount(): Optional<Long> =
            Optional.ofNullable(salesTaxAmount.getNullable("sales_tax_amount"))

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the sales tax assessed.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun salesTaxCurrency(): Optional<String> =
            Optional.ofNullable(salesTaxCurrency.getNullable("sales_tax_currency"))

        /**
         * Sales tax rate for this line item.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun salesTaxRate(): Optional<String> =
            Optional.ofNullable(salesTaxRate.getNullable("sales_tax_rate"))

        /**
         * Total amount of all line items.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun totalAmount(): Optional<Long> =
            Optional.ofNullable(totalAmount.getNullable("total_amount"))

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the total amount.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun totalAmountCurrency(): Optional<String> =
            Optional.ofNullable(totalAmountCurrency.getNullable("total_amount_currency"))

        /**
         * Cost of line item per unit of measure, in major units.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun unitCost(): Optional<String> = Optional.ofNullable(unitCost.getNullable("unit_cost"))

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the unit cost.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun unitCostCurrency(): Optional<String> =
            Optional.ofNullable(unitCostCurrency.getNullable("unit_cost_currency"))

        /**
         * Code indicating unit of measure (gallons, etc.).
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun unitOfMeasureCode(): Optional<String> =
            Optional.ofNullable(unitOfMeasureCode.getNullable("unit_of_measure_code"))

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [detailIndicator].
         *
         * Unlike [detailIndicator], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("detail_indicator")
        @ExcludeMissing
        fun _detailIndicator(): JsonField<DetailIndicator> = detailIndicator

        /**
         * Returns the raw JSON value of [discountAmount].
         *
         * Unlike [discountAmount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("discount_amount")
        @ExcludeMissing
        fun _discountAmount(): JsonField<Long> = discountAmount

        /**
         * Returns the raw JSON value of [discountCurrency].
         *
         * Unlike [discountCurrency], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("discount_currency")
        @ExcludeMissing
        fun _discountCurrency(): JsonField<String> = discountCurrency

        /**
         * Returns the raw JSON value of [discountTreatmentCode].
         *
         * Unlike [discountTreatmentCode], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("discount_treatment_code")
        @ExcludeMissing
        fun _discountTreatmentCode(): JsonField<DiscountTreatmentCode> = discountTreatmentCode

        /**
         * Returns the raw JSON value of [itemCommodityCode].
         *
         * Unlike [itemCommodityCode], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("item_commodity_code")
        @ExcludeMissing
        fun _itemCommodityCode(): JsonField<String> = itemCommodityCode

        /**
         * Returns the raw JSON value of [itemDescriptor].
         *
         * Unlike [itemDescriptor], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("item_descriptor")
        @ExcludeMissing
        fun _itemDescriptor(): JsonField<String> = itemDescriptor

        /**
         * Returns the raw JSON value of [itemQuantity].
         *
         * Unlike [itemQuantity], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("item_quantity")
        @ExcludeMissing
        fun _itemQuantity(): JsonField<String> = itemQuantity

        /**
         * Returns the raw JSON value of [productCode].
         *
         * Unlike [productCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("product_code")
        @ExcludeMissing
        fun _productCode(): JsonField<String> = productCode

        /**
         * Returns the raw JSON value of [salesTaxAmount].
         *
         * Unlike [salesTaxAmount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("sales_tax_amount")
        @ExcludeMissing
        fun _salesTaxAmount(): JsonField<Long> = salesTaxAmount

        /**
         * Returns the raw JSON value of [salesTaxCurrency].
         *
         * Unlike [salesTaxCurrency], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("sales_tax_currency")
        @ExcludeMissing
        fun _salesTaxCurrency(): JsonField<String> = salesTaxCurrency

        /**
         * Returns the raw JSON value of [salesTaxRate].
         *
         * Unlike [salesTaxRate], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("sales_tax_rate")
        @ExcludeMissing
        fun _salesTaxRate(): JsonField<String> = salesTaxRate

        /**
         * Returns the raw JSON value of [totalAmount].
         *
         * Unlike [totalAmount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("total_amount")
        @ExcludeMissing
        fun _totalAmount(): JsonField<Long> = totalAmount

        /**
         * Returns the raw JSON value of [totalAmountCurrency].
         *
         * Unlike [totalAmountCurrency], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("total_amount_currency")
        @ExcludeMissing
        fun _totalAmountCurrency(): JsonField<String> = totalAmountCurrency

        /**
         * Returns the raw JSON value of [unitCost].
         *
         * Unlike [unitCost], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("unit_cost") @ExcludeMissing fun _unitCost(): JsonField<String> = unitCost

        /**
         * Returns the raw JSON value of [unitCostCurrency].
         *
         * Unlike [unitCostCurrency], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("unit_cost_currency")
        @ExcludeMissing
        fun _unitCostCurrency(): JsonField<String> = unitCostCurrency

        /**
         * Returns the raw JSON value of [unitOfMeasureCode].
         *
         * Unlike [unitOfMeasureCode], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("unit_of_measure_code")
        @ExcludeMissing
        fun _unitOfMeasureCode(): JsonField<String> = unitOfMeasureCode

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): LineItem = apply {
            if (validated) {
                return@apply
            }

            id()
            detailIndicator()
            discountAmount()
            discountCurrency()
            discountTreatmentCode()
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

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [LineItem].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .detailIndicator()
             * .discountAmount()
             * .discountCurrency()
             * .discountTreatmentCode()
             * .itemCommodityCode()
             * .itemDescriptor()
             * .itemQuantity()
             * .productCode()
             * .salesTaxAmount()
             * .salesTaxCurrency()
             * .salesTaxRate()
             * .totalAmount()
             * .totalAmountCurrency()
             * .unitCost()
             * .unitCostCurrency()
             * .unitOfMeasureCode()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [LineItem]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var detailIndicator: JsonField<DetailIndicator>? = null
            private var discountAmount: JsonField<Long>? = null
            private var discountCurrency: JsonField<String>? = null
            private var discountTreatmentCode: JsonField<DiscountTreatmentCode>? = null
            private var itemCommodityCode: JsonField<String>? = null
            private var itemDescriptor: JsonField<String>? = null
            private var itemQuantity: JsonField<String>? = null
            private var productCode: JsonField<String>? = null
            private var salesTaxAmount: JsonField<Long>? = null
            private var salesTaxCurrency: JsonField<String>? = null
            private var salesTaxRate: JsonField<String>? = null
            private var totalAmount: JsonField<Long>? = null
            private var totalAmountCurrency: JsonField<String>? = null
            private var unitCost: JsonField<String>? = null
            private var unitCostCurrency: JsonField<String>? = null
            private var unitOfMeasureCode: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(lineItem: LineItem) = apply {
                id = lineItem.id
                detailIndicator = lineItem.detailIndicator
                discountAmount = lineItem.discountAmount
                discountCurrency = lineItem.discountCurrency
                discountTreatmentCode = lineItem.discountTreatmentCode
                itemCommodityCode = lineItem.itemCommodityCode
                itemDescriptor = lineItem.itemDescriptor
                itemQuantity = lineItem.itemQuantity
                productCode = lineItem.productCode
                salesTaxAmount = lineItem.salesTaxAmount
                salesTaxCurrency = lineItem.salesTaxCurrency
                salesTaxRate = lineItem.salesTaxRate
                totalAmount = lineItem.totalAmount
                totalAmountCurrency = lineItem.totalAmountCurrency
                unitCost = lineItem.unitCost
                unitCostCurrency = lineItem.unitCostCurrency
                unitOfMeasureCode = lineItem.unitOfMeasureCode
                additionalProperties = lineItem.additionalProperties.toMutableMap()
            }

            /** The Card Purchase Supplement Line Item identifier. */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** Indicates the type of line item. */
            fun detailIndicator(detailIndicator: DetailIndicator?) =
                detailIndicator(JsonField.ofNullable(detailIndicator))

            /** Alias for calling [Builder.detailIndicator] with `detailIndicator.orElse(null)`. */
            fun detailIndicator(detailIndicator: Optional<DetailIndicator>) =
                detailIndicator(detailIndicator.getOrNull())

            /**
             * Sets [Builder.detailIndicator] to an arbitrary JSON value.
             *
             * You should usually call [Builder.detailIndicator] with a well-typed [DetailIndicator]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun detailIndicator(detailIndicator: JsonField<DetailIndicator>) = apply {
                this.detailIndicator = detailIndicator
            }

            /** Discount amount for this specific line item. */
            fun discountAmount(discountAmount: Long?) =
                discountAmount(JsonField.ofNullable(discountAmount))

            /**
             * Alias for [Builder.discountAmount].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun discountAmount(discountAmount: Long) = discountAmount(discountAmount as Long?)

            /** Alias for calling [Builder.discountAmount] with `discountAmount.orElse(null)`. */
            fun discountAmount(discountAmount: Optional<Long>) =
                discountAmount(discountAmount.getOrNull())

            /**
             * Sets [Builder.discountAmount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.discountAmount] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun discountAmount(discountAmount: JsonField<Long>) = apply {
                this.discountAmount = discountAmount
            }

            /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the discount. */
            fun discountCurrency(discountCurrency: String?) =
                discountCurrency(JsonField.ofNullable(discountCurrency))

            /**
             * Alias for calling [Builder.discountCurrency] with `discountCurrency.orElse(null)`.
             */
            fun discountCurrency(discountCurrency: Optional<String>) =
                discountCurrency(discountCurrency.getOrNull())

            /**
             * Sets [Builder.discountCurrency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.discountCurrency] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun discountCurrency(discountCurrency: JsonField<String>) = apply {
                this.discountCurrency = discountCurrency
            }

            /** Indicates how the merchant applied the discount for this specific line item. */
            fun discountTreatmentCode(discountTreatmentCode: DiscountTreatmentCode?) =
                discountTreatmentCode(JsonField.ofNullable(discountTreatmentCode))

            /**
             * Alias for calling [Builder.discountTreatmentCode] with
             * `discountTreatmentCode.orElse(null)`.
             */
            fun discountTreatmentCode(discountTreatmentCode: Optional<DiscountTreatmentCode>) =
                discountTreatmentCode(discountTreatmentCode.getOrNull())

            /**
             * Sets [Builder.discountTreatmentCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.discountTreatmentCode] with a well-typed
             * [DiscountTreatmentCode] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun discountTreatmentCode(discountTreatmentCode: JsonField<DiscountTreatmentCode>) =
                apply {
                    this.discountTreatmentCode = discountTreatmentCode
                }

            /** Code used to categorize the purchase item. */
            fun itemCommodityCode(itemCommodityCode: String?) =
                itemCommodityCode(JsonField.ofNullable(itemCommodityCode))

            /**
             * Alias for calling [Builder.itemCommodityCode] with `itemCommodityCode.orElse(null)`.
             */
            fun itemCommodityCode(itemCommodityCode: Optional<String>) =
                itemCommodityCode(itemCommodityCode.getOrNull())

            /**
             * Sets [Builder.itemCommodityCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.itemCommodityCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun itemCommodityCode(itemCommodityCode: JsonField<String>) = apply {
                this.itemCommodityCode = itemCommodityCode
            }

            /** Description of the purchase item. */
            fun itemDescriptor(itemDescriptor: String?) =
                itemDescriptor(JsonField.ofNullable(itemDescriptor))

            /** Alias for calling [Builder.itemDescriptor] with `itemDescriptor.orElse(null)`. */
            fun itemDescriptor(itemDescriptor: Optional<String>) =
                itemDescriptor(itemDescriptor.getOrNull())

            /**
             * Sets [Builder.itemDescriptor] to an arbitrary JSON value.
             *
             * You should usually call [Builder.itemDescriptor] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun itemDescriptor(itemDescriptor: JsonField<String>) = apply {
                this.itemDescriptor = itemDescriptor
            }

            /** The number of units of the product being purchased. */
            fun itemQuantity(itemQuantity: String?) =
                itemQuantity(JsonField.ofNullable(itemQuantity))

            /** Alias for calling [Builder.itemQuantity] with `itemQuantity.orElse(null)`. */
            fun itemQuantity(itemQuantity: Optional<String>) =
                itemQuantity(itemQuantity.getOrNull())

            /**
             * Sets [Builder.itemQuantity] to an arbitrary JSON value.
             *
             * You should usually call [Builder.itemQuantity] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun itemQuantity(itemQuantity: JsonField<String>) = apply {
                this.itemQuantity = itemQuantity
            }

            /** Code used to categorize the product being purchased. */
            fun productCode(productCode: String?) = productCode(JsonField.ofNullable(productCode))

            /** Alias for calling [Builder.productCode] with `productCode.orElse(null)`. */
            fun productCode(productCode: Optional<String>) = productCode(productCode.getOrNull())

            /**
             * Sets [Builder.productCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.productCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun productCode(productCode: JsonField<String>) = apply {
                this.productCode = productCode
            }

            /** Sales tax amount for this line item. */
            fun salesTaxAmount(salesTaxAmount: Long?) =
                salesTaxAmount(JsonField.ofNullable(salesTaxAmount))

            /**
             * Alias for [Builder.salesTaxAmount].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun salesTaxAmount(salesTaxAmount: Long) = salesTaxAmount(salesTaxAmount as Long?)

            /** Alias for calling [Builder.salesTaxAmount] with `salesTaxAmount.orElse(null)`. */
            fun salesTaxAmount(salesTaxAmount: Optional<Long>) =
                salesTaxAmount(salesTaxAmount.getOrNull())

            /**
             * Sets [Builder.salesTaxAmount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.salesTaxAmount] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun salesTaxAmount(salesTaxAmount: JsonField<Long>) = apply {
                this.salesTaxAmount = salesTaxAmount
            }

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the sales tax
             * assessed.
             */
            fun salesTaxCurrency(salesTaxCurrency: String?) =
                salesTaxCurrency(JsonField.ofNullable(salesTaxCurrency))

            /**
             * Alias for calling [Builder.salesTaxCurrency] with `salesTaxCurrency.orElse(null)`.
             */
            fun salesTaxCurrency(salesTaxCurrency: Optional<String>) =
                salesTaxCurrency(salesTaxCurrency.getOrNull())

            /**
             * Sets [Builder.salesTaxCurrency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.salesTaxCurrency] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun salesTaxCurrency(salesTaxCurrency: JsonField<String>) = apply {
                this.salesTaxCurrency = salesTaxCurrency
            }

            /** Sales tax rate for this line item. */
            fun salesTaxRate(salesTaxRate: String?) =
                salesTaxRate(JsonField.ofNullable(salesTaxRate))

            /** Alias for calling [Builder.salesTaxRate] with `salesTaxRate.orElse(null)`. */
            fun salesTaxRate(salesTaxRate: Optional<String>) =
                salesTaxRate(salesTaxRate.getOrNull())

            /**
             * Sets [Builder.salesTaxRate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.salesTaxRate] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun salesTaxRate(salesTaxRate: JsonField<String>) = apply {
                this.salesTaxRate = salesTaxRate
            }

            /** Total amount of all line items. */
            fun totalAmount(totalAmount: Long?) = totalAmount(JsonField.ofNullable(totalAmount))

            /**
             * Alias for [Builder.totalAmount].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun totalAmount(totalAmount: Long) = totalAmount(totalAmount as Long?)

            /** Alias for calling [Builder.totalAmount] with `totalAmount.orElse(null)`. */
            fun totalAmount(totalAmount: Optional<Long>) = totalAmount(totalAmount.getOrNull())

            /**
             * Sets [Builder.totalAmount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalAmount] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun totalAmount(totalAmount: JsonField<Long>) = apply { this.totalAmount = totalAmount }

            /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the total amount. */
            fun totalAmountCurrency(totalAmountCurrency: String?) =
                totalAmountCurrency(JsonField.ofNullable(totalAmountCurrency))

            /**
             * Alias for calling [Builder.totalAmountCurrency] with
             * `totalAmountCurrency.orElse(null)`.
             */
            fun totalAmountCurrency(totalAmountCurrency: Optional<String>) =
                totalAmountCurrency(totalAmountCurrency.getOrNull())

            /**
             * Sets [Builder.totalAmountCurrency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalAmountCurrency] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun totalAmountCurrency(totalAmountCurrency: JsonField<String>) = apply {
                this.totalAmountCurrency = totalAmountCurrency
            }

            /** Cost of line item per unit of measure, in major units. */
            fun unitCost(unitCost: String?) = unitCost(JsonField.ofNullable(unitCost))

            /** Alias for calling [Builder.unitCost] with `unitCost.orElse(null)`. */
            fun unitCost(unitCost: Optional<String>) = unitCost(unitCost.getOrNull())

            /**
             * Sets [Builder.unitCost] to an arbitrary JSON value.
             *
             * You should usually call [Builder.unitCost] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun unitCost(unitCost: JsonField<String>) = apply { this.unitCost = unitCost }

            /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the unit cost. */
            fun unitCostCurrency(unitCostCurrency: String?) =
                unitCostCurrency(JsonField.ofNullable(unitCostCurrency))

            /**
             * Alias for calling [Builder.unitCostCurrency] with `unitCostCurrency.orElse(null)`.
             */
            fun unitCostCurrency(unitCostCurrency: Optional<String>) =
                unitCostCurrency(unitCostCurrency.getOrNull())

            /**
             * Sets [Builder.unitCostCurrency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.unitCostCurrency] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun unitCostCurrency(unitCostCurrency: JsonField<String>) = apply {
                this.unitCostCurrency = unitCostCurrency
            }

            /** Code indicating unit of measure (gallons, etc.). */
            fun unitOfMeasureCode(unitOfMeasureCode: String?) =
                unitOfMeasureCode(JsonField.ofNullable(unitOfMeasureCode))

            /**
             * Alias for calling [Builder.unitOfMeasureCode] with `unitOfMeasureCode.orElse(null)`.
             */
            fun unitOfMeasureCode(unitOfMeasureCode: Optional<String>) =
                unitOfMeasureCode(unitOfMeasureCode.getOrNull())

            /**
             * Sets [Builder.unitOfMeasureCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.unitOfMeasureCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun unitOfMeasureCode(unitOfMeasureCode: JsonField<String>) = apply {
                this.unitOfMeasureCode = unitOfMeasureCode
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
             * Returns an immutable instance of [LineItem].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .detailIndicator()
             * .discountAmount()
             * .discountCurrency()
             * .discountTreatmentCode()
             * .itemCommodityCode()
             * .itemDescriptor()
             * .itemQuantity()
             * .productCode()
             * .salesTaxAmount()
             * .salesTaxCurrency()
             * .salesTaxRate()
             * .totalAmount()
             * .totalAmountCurrency()
             * .unitCost()
             * .unitCostCurrency()
             * .unitOfMeasureCode()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): LineItem =
                LineItem(
                    checkRequired("id", id),
                    checkRequired("detailIndicator", detailIndicator),
                    checkRequired("discountAmount", discountAmount),
                    checkRequired("discountCurrency", discountCurrency),
                    checkRequired("discountTreatmentCode", discountTreatmentCode),
                    checkRequired("itemCommodityCode", itemCommodityCode),
                    checkRequired("itemDescriptor", itemDescriptor),
                    checkRequired("itemQuantity", itemQuantity),
                    checkRequired("productCode", productCode),
                    checkRequired("salesTaxAmount", salesTaxAmount),
                    checkRequired("salesTaxCurrency", salesTaxCurrency),
                    checkRequired("salesTaxRate", salesTaxRate),
                    checkRequired("totalAmount", totalAmount),
                    checkRequired("totalAmountCurrency", totalAmountCurrency),
                    checkRequired("unitCost", unitCost),
                    checkRequired("unitCostCurrency", unitCostCurrency),
                    checkRequired("unitOfMeasureCode", unitOfMeasureCode),
                    additionalProperties.toImmutable(),
                )
        }

        /** Indicates the type of line item. */
        class DetailIndicator
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

                /** Normal */
                @JvmField val NORMAL = of("normal")

                /** Credit */
                @JvmField val CREDIT = of("credit")

                /** Purchase */
                @JvmField val PAYMENT = of("payment")

                @JvmStatic fun of(value: String) = DetailIndicator(JsonField.of(value))
            }

            /** An enum containing [DetailIndicator]'s known values. */
            enum class Known {
                /** Normal */
                NORMAL,
                /** Credit */
                CREDIT,
                /** Purchase */
                PAYMENT,
            }

            /**
             * An enum containing [DetailIndicator]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [DetailIndicator] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                /** Normal */
                NORMAL,
                /** Credit */
                CREDIT,
                /** Purchase */
                PAYMENT,
                /**
                 * An enum member indicating that [DetailIndicator] was instantiated with an unknown
                 * value.
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
                    NORMAL -> Value.NORMAL
                    CREDIT -> Value.CREDIT
                    PAYMENT -> Value.PAYMENT
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
                    NORMAL -> Known.NORMAL
                    CREDIT -> Known.CREDIT
                    PAYMENT -> Known.PAYMENT
                    else -> throw IncreaseInvalidDataException("Unknown DetailIndicator: $value")
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

                return /* spotless:off */ other is DetailIndicator && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Indicates how the merchant applied the discount for this specific line item. */
        class DiscountTreatmentCode
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

                /** No line item level discount provided */
                @JvmField
                val NO_LINE_ITEM_LEVEL_DISCOUNT_PROVIDED =
                    of("no_line_item_level_discount_provided")

                /** Tax calculated on post discount line item total */
                @JvmField
                val TAX_CALCULATED_ON_POST_DISCOUNT_LINE_ITEM_TOTAL =
                    of("tax_calculated_on_post_discount_line_item_total")

                /** Tax calculated on pre discount line item total */
                @JvmField
                val TAX_CALCULATED_ON_PRE_DISCOUNT_LINE_ITEM_TOTAL =
                    of("tax_calculated_on_pre_discount_line_item_total")

                @JvmStatic fun of(value: String) = DiscountTreatmentCode(JsonField.of(value))
            }

            /** An enum containing [DiscountTreatmentCode]'s known values. */
            enum class Known {
                /** No line item level discount provided */
                NO_LINE_ITEM_LEVEL_DISCOUNT_PROVIDED,
                /** Tax calculated on post discount line item total */
                TAX_CALCULATED_ON_POST_DISCOUNT_LINE_ITEM_TOTAL,
                /** Tax calculated on pre discount line item total */
                TAX_CALCULATED_ON_PRE_DISCOUNT_LINE_ITEM_TOTAL,
            }

            /**
             * An enum containing [DiscountTreatmentCode]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [DiscountTreatmentCode] can contain an unknown value in a couple of
             * cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                /** No line item level discount provided */
                NO_LINE_ITEM_LEVEL_DISCOUNT_PROVIDED,
                /** Tax calculated on post discount line item total */
                TAX_CALCULATED_ON_POST_DISCOUNT_LINE_ITEM_TOTAL,
                /** Tax calculated on pre discount line item total */
                TAX_CALCULATED_ON_PRE_DISCOUNT_LINE_ITEM_TOTAL,
                /**
                 * An enum member indicating that [DiscountTreatmentCode] was instantiated with an
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
                    NO_LINE_ITEM_LEVEL_DISCOUNT_PROVIDED ->
                        Value.NO_LINE_ITEM_LEVEL_DISCOUNT_PROVIDED
                    TAX_CALCULATED_ON_POST_DISCOUNT_LINE_ITEM_TOTAL ->
                        Value.TAX_CALCULATED_ON_POST_DISCOUNT_LINE_ITEM_TOTAL
                    TAX_CALCULATED_ON_PRE_DISCOUNT_LINE_ITEM_TOTAL ->
                        Value.TAX_CALCULATED_ON_PRE_DISCOUNT_LINE_ITEM_TOTAL
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
                    NO_LINE_ITEM_LEVEL_DISCOUNT_PROVIDED ->
                        Known.NO_LINE_ITEM_LEVEL_DISCOUNT_PROVIDED
                    TAX_CALCULATED_ON_POST_DISCOUNT_LINE_ITEM_TOTAL ->
                        Known.TAX_CALCULATED_ON_POST_DISCOUNT_LINE_ITEM_TOTAL
                    TAX_CALCULATED_ON_PRE_DISCOUNT_LINE_ITEM_TOTAL ->
                        Known.TAX_CALCULATED_ON_PRE_DISCOUNT_LINE_ITEM_TOTAL
                    else ->
                        throw IncreaseInvalidDataException("Unknown DiscountTreatmentCode: $value")
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

                return /* spotless:off */ other is DiscountTreatmentCode && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is LineItem && id == other.id && detailIndicator == other.detailIndicator && discountAmount == other.discountAmount && discountCurrency == other.discountCurrency && discountTreatmentCode == other.discountTreatmentCode && itemCommodityCode == other.itemCommodityCode && itemDescriptor == other.itemDescriptor && itemQuantity == other.itemQuantity && productCode == other.productCode && salesTaxAmount == other.salesTaxAmount && salesTaxCurrency == other.salesTaxCurrency && salesTaxRate == other.salesTaxRate && totalAmount == other.totalAmount && totalAmountCurrency == other.totalAmountCurrency && unitCost == other.unitCost && unitCostCurrency == other.unitCostCurrency && unitOfMeasureCode == other.unitOfMeasureCode && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, detailIndicator, discountAmount, discountCurrency, discountTreatmentCode, itemCommodityCode, itemDescriptor, itemQuantity, productCode, salesTaxAmount, salesTaxCurrency, salesTaxRate, totalAmount, totalAmountCurrency, unitCost, unitCostCurrency, unitOfMeasureCode, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "LineItem{id=$id, detailIndicator=$detailIndicator, discountAmount=$discountAmount, discountCurrency=$discountCurrency, discountTreatmentCode=$discountTreatmentCode, itemCommodityCode=$itemCommodityCode, itemDescriptor=$itemDescriptor, itemQuantity=$itemQuantity, productCode=$productCode, salesTaxAmount=$salesTaxAmount, salesTaxCurrency=$salesTaxCurrency, salesTaxRate=$salesTaxRate, totalAmount=$totalAmount, totalAmountCurrency=$totalAmountCurrency, unitCost=$unitCost, unitCostCurrency=$unitCostCurrency, unitOfMeasureCode=$unitOfMeasureCode, additionalProperties=$additionalProperties}"
    }

    /**
     * A constant representing the object's type. For this resource it will always be
     * `card_purchase_supplement`.
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

            @JvmField val CARD_PURCHASE_SUPPLEMENT = of("card_purchase_supplement")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            CARD_PURCHASE_SUPPLEMENT
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
            CARD_PURCHASE_SUPPLEMENT,
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
                CARD_PURCHASE_SUPPLEMENT -> Value.CARD_PURCHASE_SUPPLEMENT
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
                CARD_PURCHASE_SUPPLEMENT -> Known.CARD_PURCHASE_SUPPLEMENT
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

        return /* spotless:off */ other is CardPurchaseSupplement && id == other.id && cardPaymentId == other.cardPaymentId && invoice == other.invoice && lineItems == other.lineItems && transactionId == other.transactionId && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, cardPaymentId, invoice, lineItems, transactionId, type, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CardPurchaseSupplement{id=$id, cardPaymentId=$cardPaymentId, invoice=$invoice, lineItems=$lineItems, transactionId=$transactionId, type=$type, additionalProperties=$additionalProperties}"
}
