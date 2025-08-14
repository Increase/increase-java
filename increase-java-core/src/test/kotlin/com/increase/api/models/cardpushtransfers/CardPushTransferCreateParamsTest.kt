// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.cardpushtransfers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardPushTransferCreateParamsTest {

    @Test
    fun create() {
        CardPushTransferCreateParams.builder()
            .amount(100L)
            .businessApplicationIdentifier(
                CardPushTransferCreateParams.BusinessApplicationIdentifier.FUNDS_DISBURSEMENT
            )
            .cardTokenId("outbound_card_token_zlt0ml6youq3q7vcdlg0")
            .merchantCategoryCode("1234")
            .merchantCityName("New York")
            .merchantName("Acme Corp")
            .merchantNamePrefix("Acme")
            .merchantPostalCode("10045")
            .merchantState("NY")
            .recipientName("Ian Crease")
            .senderAddressCity("New York")
            .senderAddressLine1("33 Liberty Street")
            .senderAddressPostalCode("10045")
            .senderAddressState("NY")
            .senderName("Ian Crease")
            .sourceAccountNumberId("account_number_v18nkfqm6afpsrvy82b2")
            .requireApproval(true)
            .build()
    }

    @Test
    fun body() {
        val params =
            CardPushTransferCreateParams.builder()
                .amount(100L)
                .businessApplicationIdentifier(
                    CardPushTransferCreateParams.BusinessApplicationIdentifier.FUNDS_DISBURSEMENT
                )
                .cardTokenId("outbound_card_token_zlt0ml6youq3q7vcdlg0")
                .merchantCategoryCode("1234")
                .merchantCityName("New York")
                .merchantName("Acme Corp")
                .merchantNamePrefix("Acme")
                .merchantPostalCode("10045")
                .merchantState("NY")
                .recipientName("Ian Crease")
                .senderAddressCity("New York")
                .senderAddressLine1("33 Liberty Street")
                .senderAddressPostalCode("10045")
                .senderAddressState("NY")
                .senderName("Ian Crease")
                .sourceAccountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                .requireApproval(true)
                .build()

        val body = params._body()

        assertThat(body.amount()).isEqualTo(100L)
        assertThat(body.businessApplicationIdentifier())
            .isEqualTo(
                CardPushTransferCreateParams.BusinessApplicationIdentifier.FUNDS_DISBURSEMENT
            )
        assertThat(body.cardTokenId()).isEqualTo("outbound_card_token_zlt0ml6youq3q7vcdlg0")
        assertThat(body.merchantCategoryCode()).isEqualTo("1234")
        assertThat(body.merchantCityName()).isEqualTo("New York")
        assertThat(body.merchantName()).isEqualTo("Acme Corp")
        assertThat(body.merchantNamePrefix()).isEqualTo("Acme")
        assertThat(body.merchantPostalCode()).isEqualTo("10045")
        assertThat(body.merchantState()).isEqualTo("NY")
        assertThat(body.recipientName()).isEqualTo("Ian Crease")
        assertThat(body.senderAddressCity()).isEqualTo("New York")
        assertThat(body.senderAddressLine1()).isEqualTo("33 Liberty Street")
        assertThat(body.senderAddressPostalCode()).isEqualTo("10045")
        assertThat(body.senderAddressState()).isEqualTo("NY")
        assertThat(body.senderName()).isEqualTo("Ian Crease")
        assertThat(body.sourceAccountNumberId()).isEqualTo("account_number_v18nkfqm6afpsrvy82b2")
        assertThat(body.requireApproval()).contains(true)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CardPushTransferCreateParams.builder()
                .amount(100L)
                .businessApplicationIdentifier(
                    CardPushTransferCreateParams.BusinessApplicationIdentifier.FUNDS_DISBURSEMENT
                )
                .cardTokenId("outbound_card_token_zlt0ml6youq3q7vcdlg0")
                .merchantCategoryCode("1234")
                .merchantCityName("New York")
                .merchantName("Acme Corp")
                .merchantNamePrefix("Acme")
                .merchantPostalCode("10045")
                .merchantState("NY")
                .recipientName("Ian Crease")
                .senderAddressCity("New York")
                .senderAddressLine1("33 Liberty Street")
                .senderAddressPostalCode("10045")
                .senderAddressState("NY")
                .senderName("Ian Crease")
                .sourceAccountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                .build()

        val body = params._body()

        assertThat(body.amount()).isEqualTo(100L)
        assertThat(body.businessApplicationIdentifier())
            .isEqualTo(
                CardPushTransferCreateParams.BusinessApplicationIdentifier.FUNDS_DISBURSEMENT
            )
        assertThat(body.cardTokenId()).isEqualTo("outbound_card_token_zlt0ml6youq3q7vcdlg0")
        assertThat(body.merchantCategoryCode()).isEqualTo("1234")
        assertThat(body.merchantCityName()).isEqualTo("New York")
        assertThat(body.merchantName()).isEqualTo("Acme Corp")
        assertThat(body.merchantNamePrefix()).isEqualTo("Acme")
        assertThat(body.merchantPostalCode()).isEqualTo("10045")
        assertThat(body.merchantState()).isEqualTo("NY")
        assertThat(body.recipientName()).isEqualTo("Ian Crease")
        assertThat(body.senderAddressCity()).isEqualTo("New York")
        assertThat(body.senderAddressLine1()).isEqualTo("33 Liberty Street")
        assertThat(body.senderAddressPostalCode()).isEqualTo("10045")
        assertThat(body.senderAddressState()).isEqualTo("NY")
        assertThat(body.senderName()).isEqualTo("Ian Crease")
        assertThat(body.sourceAccountNumberId()).isEqualTo("account_number_v18nkfqm6afpsrvy82b2")
    }
}
