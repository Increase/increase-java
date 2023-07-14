package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class BookkeepingAccountTest {

    @Test
    fun createBookkeepingAccount() {
        val bookkeepingAccount =
            BookkeepingAccount.builder()
                .id("string")
                .accountId("string")
                .complianceCategory(BookkeepingAccount.ComplianceCategory.COMMINGLED_CASH)
                .entityId("string")
                .name("string")
                .type(BookkeepingAccount.Type.BOOKKEEPING_ACCOUNT)
                .build()
        assertThat(bookkeepingAccount).isNotNull
        assertThat(bookkeepingAccount.id()).isEqualTo("string")
        assertThat(bookkeepingAccount.complianceCategory())
            .contains(BookkeepingAccount.ComplianceCategory.COMMINGLED_CASH)
        assertThat(bookkeepingAccount.accountId()).contains("string")
        assertThat(bookkeepingAccount.entityId()).contains("string")
        assertThat(bookkeepingAccount.name()).isEqualTo("string")
        assertThat(bookkeepingAccount.type()).isEqualTo(BookkeepingAccount.Type.BOOKKEEPING_ACCOUNT)
    }
}
