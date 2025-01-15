// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CardPurchaseSupplementTest {

    @Test
    fun createCardPurchaseSupplement() {
        val cardPurchaseSupplement =
            CardPurchaseSupplement.builder()
                .id("card_purchase_supplement_ijuc45iym4jchnh2sfk3")
                .cardPaymentId("card_payment_nd3k2kacrqjli8482ave")
                .invoice(
                    CardPurchaseSupplement.Invoice.builder()
                        .discountAmount(100L)
                        .discountCurrency("USD")
                        .discountTreatmentCode(
                            CardPurchaseSupplement.Invoice.DiscountTreatmentCode
                                .NO_INVOICE_LEVEL_DISCOUNT_PROVIDED
                        )
                        .dutyTaxAmount(200L)
                        .dutyTaxCurrency("USD")
                        .orderDate(LocalDate.parse("2023-07-20"))
                        .shippingAmount(300L)
                        .shippingCurrency("USD")
                        .shippingDestinationCountryCode("US")
                        .shippingDestinationPostalCode("10045")
                        .shippingSourcePostalCode("10045")
                        .shippingTaxAmount(400L)
                        .shippingTaxCurrency("USD")
                        .shippingTaxRate("0.2")
                        .taxTreatments(CardPurchaseSupplement.Invoice.TaxTreatments.NO_TAX_APPLIES)
                        .uniqueValueAddedTaxInvoiceReference("12302")
                        .build()
                )
                .addLineItem(
                    CardPurchaseSupplement.LineItem.builder()
                        .id("card_purchase_supplement_invoice_line_item_nf9760lz0apqy5retmqh")
                        .detailIndicator(CardPurchaseSupplement.LineItem.DetailIndicator.NORMAL)
                        .discountAmount(null)
                        .discountCurrency(null)
                        .discountTreatmentCode(
                            CardPurchaseSupplement.LineItem.DiscountTreatmentCode
                                .NO_LINE_ITEM_LEVEL_DISCOUNT_PROVIDED
                        )
                        .itemCommodityCode("001")
                        .itemDescriptor("Coffee")
                        .itemQuantity("1.0")
                        .productCode("101")
                        .salesTaxAmount(null)
                        .salesTaxCurrency(null)
                        .salesTaxRate(null)
                        .totalAmount(500L)
                        .totalAmountCurrency("USD")
                        .unitCost("5.0")
                        .unitCostCurrency("USD")
                        .unitOfMeasureCode("NMB")
                        .build()
                )
                .transactionId("transaction_uyrp7fld2ium70oa7oi")
                .type(CardPurchaseSupplement.Type.CARD_PURCHASE_SUPPLEMENT)
                .build()
        assertThat(cardPurchaseSupplement).isNotNull
        assertThat(cardPurchaseSupplement.id())
            .isEqualTo("card_purchase_supplement_ijuc45iym4jchnh2sfk3")
        assertThat(cardPurchaseSupplement.cardPaymentId())
            .contains("card_payment_nd3k2kacrqjli8482ave")
        assertThat(cardPurchaseSupplement.invoice())
            .contains(
                CardPurchaseSupplement.Invoice.builder()
                    .discountAmount(100L)
                    .discountCurrency("USD")
                    .discountTreatmentCode(
                        CardPurchaseSupplement.Invoice.DiscountTreatmentCode
                            .NO_INVOICE_LEVEL_DISCOUNT_PROVIDED
                    )
                    .dutyTaxAmount(200L)
                    .dutyTaxCurrency("USD")
                    .orderDate(LocalDate.parse("2023-07-20"))
                    .shippingAmount(300L)
                    .shippingCurrency("USD")
                    .shippingDestinationCountryCode("US")
                    .shippingDestinationPostalCode("10045")
                    .shippingSourcePostalCode("10045")
                    .shippingTaxAmount(400L)
                    .shippingTaxCurrency("USD")
                    .shippingTaxRate("0.2")
                    .taxTreatments(CardPurchaseSupplement.Invoice.TaxTreatments.NO_TAX_APPLIES)
                    .uniqueValueAddedTaxInvoiceReference("12302")
                    .build()
            )
        assertThat(cardPurchaseSupplement.lineItems().get())
            .containsExactly(
                CardPurchaseSupplement.LineItem.builder()
                    .id("card_purchase_supplement_invoice_line_item_nf9760lz0apqy5retmqh")
                    .detailIndicator(CardPurchaseSupplement.LineItem.DetailIndicator.NORMAL)
                    .discountAmount(null)
                    .discountCurrency(null)
                    .discountTreatmentCode(
                        CardPurchaseSupplement.LineItem.DiscountTreatmentCode
                            .NO_LINE_ITEM_LEVEL_DISCOUNT_PROVIDED
                    )
                    .itemCommodityCode("001")
                    .itemDescriptor("Coffee")
                    .itemQuantity("1.0")
                    .productCode("101")
                    .salesTaxAmount(null)
                    .salesTaxCurrency(null)
                    .salesTaxRate(null)
                    .totalAmount(500L)
                    .totalAmountCurrency("USD")
                    .unitCost("5.0")
                    .unitCostCurrency("USD")
                    .unitOfMeasureCode("NMB")
                    .build()
            )
        assertThat(cardPurchaseSupplement.transactionId())
            .isEqualTo("transaction_uyrp7fld2ium70oa7oi")
        assertThat(cardPurchaseSupplement.type())
            .isEqualTo(CardPurchaseSupplement.Type.CARD_PURCHASE_SUPPLEMENT)
    }
}
