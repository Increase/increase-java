// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.bookkeepingaccounts

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class BookkeepingAccountTest {

    @Test
    fun createBookkeepingAccount() {
        val bookkeepingAccount =
            BookkeepingAccount.builder()
                .id("bookkeeping_account_e37p1f1iuocw5intf35v")
                .accountId(null)
                .complianceCategory(BookkeepingAccount.ComplianceCategory.COMMINGLED_CASH)
                .entityId("entity_n8y8tnk2p9339ti393yi")
                .idempotencyKey(null)
                .name("John Doe Balance")
                .type(BookkeepingAccount.Type.BOOKKEEPING_ACCOUNT)
                .build()
        assertThat(bookkeepingAccount).isNotNull
        assertThat(bookkeepingAccount.id()).isEqualTo("bookkeeping_account_e37p1f1iuocw5intf35v")
        assertThat(bookkeepingAccount.accountId()).isEmpty
        assertThat(bookkeepingAccount.complianceCategory())
            .contains(BookkeepingAccount.ComplianceCategory.COMMINGLED_CASH)
        assertThat(bookkeepingAccount.entityId()).contains("entity_n8y8tnk2p9339ti393yi")
        assertThat(bookkeepingAccount.idempotencyKey()).isEmpty
        assertThat(bookkeepingAccount.name()).isEqualTo("John Doe Balance")
        assertThat(bookkeepingAccount.type()).isEqualTo(BookkeepingAccount.Type.BOOKKEEPING_ACCOUNT)
    }
}
