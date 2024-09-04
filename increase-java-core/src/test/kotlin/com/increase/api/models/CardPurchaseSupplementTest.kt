// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import com.increase.api.core.JsonNull
import com.increase.api.core.JsonString
import com.increase.api.core.JsonValue
import com.increase.api.models.CardPurchaseSupplement

class CardPurchaseSupplementTest {

    @Test
    fun createCardPurchaseSupplement() {
      val cardPurchaseSupplement = CardPurchaseSupplement.builder()
          .id("id")
          .cardPaymentId("card_payment_id")
          .invoice(CardPurchaseSupplement.Invoice.builder()
              .discountAmount(123L)
              .discountCurrency("discount_currency")
              .discountTreatmentCode(CardPurchaseSupplement.Invoice.DiscountTreatmentCode.NO_INVOICE_LEVEL_DISCOUNT_PROVIDED)
              .dutyTaxAmount(123L)
              .dutyTaxCurrency("duty_tax_currency")
              .orderDate(LocalDate.parse("2019-12-27"))
              .shippingAmount(123L)
              .shippingCurrency("shipping_currency")
              .shippingDestinationCountryCode("shipping_destination_country_code")
              .shippingDestinationPostalCode("shipping_destination_postal_code")
              .shippingSourcePostalCode("shipping_source_postal_code")
              .shippingTaxAmount(123L)
              .shippingTaxCurrency("shipping_tax_currency")
              .shippingTaxRate("shipping_tax_rate")
              .taxTreatments(CardPurchaseSupplement.Invoice.TaxTreatments.NO_TAX_APPLIES)
              .uniqueValueAddedTaxInvoiceReference("unique_value_added_tax_invoice_reference")
              .build())
          .lineItems(listOf(CardPurchaseSupplement.LineItem.builder()
              .id("id")
              .detailIndicator(CardPurchaseSupplement.LineItem.DetailIndicator.NORMAL)
              .discountAmount(123L)
              .discountCurrency("discount_currency")
              .discountTreatmentCode(CardPurchaseSupplement.LineItem.DiscountTreatmentCode.NO_LINE_ITEM_LEVEL_DISCOUNT_PROVIDED)
              .itemCommodityCode("item_commodity_code")
              .itemDescriptor("item_descriptor")
              .itemQuantity("item_quantity")
              .productCode("product_code")
              .salesTaxAmount(123L)
              .salesTaxCurrency("sales_tax_currency")
              .salesTaxRate("sales_tax_rate")
              .totalAmount(123L)
              .totalAmountCurrency("total_amount_currency")
              .unitCost("unit_cost")
              .unitCostCurrency("unit_cost_currency")
              .unitOfMeasureCode("unit_of_measure_code")
              .build()))
          .transactionId("transaction_id")
          .type(CardPurchaseSupplement.Type.CARD_PURCHASE_SUPPLEMENT)
          .build()
      assertThat(cardPurchaseSupplement).isNotNull
      assertThat(cardPurchaseSupplement.id()).isEqualTo("id")
      assertThat(cardPurchaseSupplement.cardPaymentId()).contains("card_payment_id")
      assertThat(cardPurchaseSupplement.invoice()).contains(CardPurchaseSupplement.Invoice.builder()
          .discountAmount(123L)
          .discountCurrency("discount_currency")
          .discountTreatmentCode(CardPurchaseSupplement.Invoice.DiscountTreatmentCode.NO_INVOICE_LEVEL_DISCOUNT_PROVIDED)
          .dutyTaxAmount(123L)
          .dutyTaxCurrency("duty_tax_currency")
          .orderDate(LocalDate.parse("2019-12-27"))
          .shippingAmount(123L)
          .shippingCurrency("shipping_currency")
          .shippingDestinationCountryCode("shipping_destination_country_code")
          .shippingDestinationPostalCode("shipping_destination_postal_code")
          .shippingSourcePostalCode("shipping_source_postal_code")
          .shippingTaxAmount(123L)
          .shippingTaxCurrency("shipping_tax_currency")
          .shippingTaxRate("shipping_tax_rate")
          .taxTreatments(CardPurchaseSupplement.Invoice.TaxTreatments.NO_TAX_APPLIES)
          .uniqueValueAddedTaxInvoiceReference("unique_value_added_tax_invoice_reference")
          .build())
      assertThat(cardPurchaseSupplement.lineItems().get()).containsExactly(CardPurchaseSupplement.LineItem.builder()
          .id("id")
          .detailIndicator(CardPurchaseSupplement.LineItem.DetailIndicator.NORMAL)
          .discountAmount(123L)
          .discountCurrency("discount_currency")
          .discountTreatmentCode(CardPurchaseSupplement.LineItem.DiscountTreatmentCode.NO_LINE_ITEM_LEVEL_DISCOUNT_PROVIDED)
          .itemCommodityCode("item_commodity_code")
          .itemDescriptor("item_descriptor")
          .itemQuantity("item_quantity")
          .productCode("product_code")
          .salesTaxAmount(123L)
          .salesTaxCurrency("sales_tax_currency")
          .salesTaxRate("sales_tax_rate")
          .totalAmount(123L)
          .totalAmountCurrency("total_amount_currency")
          .unitCost("unit_cost")
          .unitCostCurrency("unit_cost_currency")
          .unitOfMeasureCode("unit_of_measure_code")
          .build())
      assertThat(cardPurchaseSupplement.transactionId()).isEqualTo("transaction_id")
      assertThat(cardPurchaseSupplement.type()).isEqualTo(CardPurchaseSupplement.Type.CARD_PURCHASE_SUPPLEMENT)
    }
}
