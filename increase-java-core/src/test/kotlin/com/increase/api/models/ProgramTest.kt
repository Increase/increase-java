// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ProgramTest {

    @Test
    fun createProgram() {
        val program =
            Program.builder()
                .id("id")
                .bank(Program.Bank.BLUE_RIDGE_BANK)
                .billingAccountId("billing_account_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .defaultDigitalCardProfileId("default_digital_card_profile_id")
                .interestRate("interest_rate")
                .name("name")
                .type(Program.Type.PROGRAM)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        assertThat(program).isNotNull
        assertThat(program.id()).isEqualTo("id")
        assertThat(program.bank()).isEqualTo(Program.Bank.BLUE_RIDGE_BANK)
        assertThat(program.billingAccountId()).contains("billing_account_id")
        assertThat(program.createdAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(program.defaultDigitalCardProfileId())
            .contains("default_digital_card_profile_id")
        assertThat(program.interestRate()).isEqualTo("interest_rate")
        assertThat(program.name()).isEqualTo("name")
        assertThat(program.type()).isEqualTo(Program.Type.PROGRAM)
        assertThat(program.updatedAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}
