// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.checkbooks

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CheckbookCreateParamsTest {

    @Test
    fun create() {
        CheckbookCreateParams.builder()
            .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
            .mailingAddress(
                CheckbookCreateParams.MailingAddress.builder()
                    .city("New York")
                    .line1("33 Liberty Street")
                    .name("Ian Crease")
                    .postalCode("10045")
                    .state("NY")
                    .line2("line2")
                    .build()
            )
            .payer(
                listOf(
                    CheckbookCreateParams.Payer.builder()
                        .contents("National Phonograph Company")
                        .build(),
                    CheckbookCreateParams.Payer.builder().contents("33 Liberty Street").build(),
                    CheckbookCreateParams.Payer.builder().contents("New York, NY 10045").build(),
                )
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            CheckbookCreateParams.builder()
                .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                .mailingAddress(
                    CheckbookCreateParams.MailingAddress.builder()
                        .city("New York")
                        .line1("33 Liberty Street")
                        .name("Ian Crease")
                        .postalCode("10045")
                        .state("NY")
                        .line2("line2")
                        .build()
                )
                .payer(
                    listOf(
                        CheckbookCreateParams.Payer.builder()
                            .contents("National Phonograph Company")
                            .build(),
                        CheckbookCreateParams.Payer.builder().contents("33 Liberty Street").build(),
                        CheckbookCreateParams.Payer.builder().contents("New York, NY 10045").build(),
                    )
                )
                .build()

        val body = params._body()

        assertThat(body.accountNumberId()).isEqualTo("account_number_v18nkfqm6afpsrvy82b2")
        assertThat(body.mailingAddress())
            .isEqualTo(
                CheckbookCreateParams.MailingAddress.builder()
                    .city("New York")
                    .line1("33 Liberty Street")
                    .name("Ian Crease")
                    .postalCode("10045")
                    .state("NY")
                    .line2("line2")
                    .build()
            )
        assertThat(body.payer())
            .containsExactly(
                CheckbookCreateParams.Payer.builder()
                    .contents("National Phonograph Company")
                    .build(),
                CheckbookCreateParams.Payer.builder().contents("33 Liberty Street").build(),
                CheckbookCreateParams.Payer.builder().contents("New York, NY 10045").build(),
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CheckbookCreateParams.builder()
                .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                .mailingAddress(
                    CheckbookCreateParams.MailingAddress.builder()
                        .city("New York")
                        .line1("33 Liberty Street")
                        .name("Ian Crease")
                        .postalCode("10045")
                        .state("NY")
                        .build()
                )
                .payer(
                    listOf(
                        CheckbookCreateParams.Payer.builder()
                            .contents("National Phonograph Company")
                            .build(),
                        CheckbookCreateParams.Payer.builder().contents("33 Liberty Street").build(),
                        CheckbookCreateParams.Payer.builder().contents("New York, NY 10045").build(),
                    )
                )
                .build()

        val body = params._body()

        assertThat(body.accountNumberId()).isEqualTo("account_number_v18nkfqm6afpsrvy82b2")
        assertThat(body.mailingAddress())
            .isEqualTo(
                CheckbookCreateParams.MailingAddress.builder()
                    .city("New York")
                    .line1("33 Liberty Street")
                    .name("Ian Crease")
                    .postalCode("10045")
                    .state("NY")
                    .build()
            )
        assertThat(body.payer())
            .containsExactly(
                CheckbookCreateParams.Payer.builder()
                    .contents("National Phonograph Company")
                    .build(),
                CheckbookCreateParams.Payer.builder().contents("33 Liberty Street").build(),
                CheckbookCreateParams.Payer.builder().contents("New York, NY 10045").build(),
            )
    }
}
