// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking.simulations

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.simulations.cardpurchasesupplements.CardPurchaseSupplementCreateParams
import java.time.LocalDate
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CardPurchaseSupplementServiceTest {

    @Test
    fun create() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardPurchaseSupplementService = client.simulations().cardPurchaseSupplements()

        val cardPurchaseSupplement =
            cardPurchaseSupplementService.create(
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
            )

        cardPurchaseSupplement.validate()
    }
}
