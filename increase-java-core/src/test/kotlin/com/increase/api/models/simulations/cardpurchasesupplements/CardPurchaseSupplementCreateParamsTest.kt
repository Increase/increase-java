// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.simulations.cardpurchasesupplements

import java.time.LocalDate
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardPurchaseSupplementCreateParamsTest {

    @Test
    fun create() {
        CardPurchaseSupplementCreateParams.builder()
            .transactionId("transaction_uyrp7fld2ium70oa7oi")
            .invoice(
                CardPurchaseSupplementCreateParams.Invoice.builder()
                    .discountAmount(100L)
                    .dutyTaxAmount(200L)
                    .orderDate(LocalDate.parse("2023-07-20"))
                    .shippingAmount(300L)
                    .shippingDestinationCountryCode("US")
                    .shippingDestinationPostalCode("10045")
                    .shippingSourcePostalCode("10045")
                    .shippingTaxAmount(400L)
                    .shippingTaxRate("0.2")
                    .uniqueValueAddedTaxInvoiceReference("12302")
                    .build()
            )
            .addLineItem(
                CardPurchaseSupplementCreateParams.LineItem.builder()
                    .discountAmount(0L)
                    .itemCommodityCode("001")
                    .itemDescriptor("Coffee")
                    .itemQuantity("1")
                    .productCode("101")
                    .salesTaxAmount(0L)
                    .salesTaxRate("-16699")
                    .totalAmount(500L)
                    .unitCost("5")
                    .unitOfMeasureCode("NMB")
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            CardPurchaseSupplementCreateParams.builder()
                .transactionId("transaction_uyrp7fld2ium70oa7oi")
                .invoice(
                    CardPurchaseSupplementCreateParams.Invoice.builder()
                        .discountAmount(100L)
                        .dutyTaxAmount(200L)
                        .orderDate(LocalDate.parse("2023-07-20"))
                        .shippingAmount(300L)
                        .shippingDestinationCountryCode("US")
                        .shippingDestinationPostalCode("10045")
                        .shippingSourcePostalCode("10045")
                        .shippingTaxAmount(400L)
                        .shippingTaxRate("0.2")
                        .uniqueValueAddedTaxInvoiceReference("12302")
                        .build()
                )
                .addLineItem(
                    CardPurchaseSupplementCreateParams.LineItem.builder()
                        .discountAmount(0L)
                        .itemCommodityCode("001")
                        .itemDescriptor("Coffee")
                        .itemQuantity("1")
                        .productCode("101")
                        .salesTaxAmount(0L)
                        .salesTaxRate("-16699")
                        .totalAmount(500L)
                        .unitCost("5")
                        .unitOfMeasureCode("NMB")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.transactionId()).isEqualTo("transaction_uyrp7fld2ium70oa7oi")
        assertThat(body.invoice())
            .contains(
                CardPurchaseSupplementCreateParams.Invoice.builder()
                    .discountAmount(100L)
                    .dutyTaxAmount(200L)
                    .orderDate(LocalDate.parse("2023-07-20"))
                    .shippingAmount(300L)
                    .shippingDestinationCountryCode("US")
                    .shippingDestinationPostalCode("10045")
                    .shippingSourcePostalCode("10045")
                    .shippingTaxAmount(400L)
                    .shippingTaxRate("0.2")
                    .uniqueValueAddedTaxInvoiceReference("12302")
                    .build()
            )
        assertThat(body.lineItems().getOrNull())
            .containsExactly(
                CardPurchaseSupplementCreateParams.LineItem.builder()
                    .discountAmount(0L)
                    .itemCommodityCode("001")
                    .itemDescriptor("Coffee")
                    .itemQuantity("1")
                    .productCode("101")
                    .salesTaxAmount(0L)
                    .salesTaxRate("-16699")
                    .totalAmount(500L)
                    .unitCost("5")
                    .unitOfMeasureCode("NMB")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CardPurchaseSupplementCreateParams.builder()
                .transactionId("transaction_uyrp7fld2ium70oa7oi")
                .build()

        val body = params._body()

        assertThat(body.transactionId()).isEqualTo("transaction_uyrp7fld2ium70oa7oi")
    }
}
