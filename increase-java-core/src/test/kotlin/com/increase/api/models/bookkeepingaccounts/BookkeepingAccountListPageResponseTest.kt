// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.bookkeepingaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BookkeepingAccountListPageResponseTest {

    @Test
    fun create() {
        val bookkeepingAccountListPageResponse =
            BookkeepingAccountListPageResponse.builder()
                .addData(
                    BookkeepingAccount.builder()
                        .id("bookkeeping_account_e37p1f1iuocw5intf35v")
                        .accountId(null)
                        .complianceCategory(BookkeepingAccount.ComplianceCategory.CUSTOMER_BALANCE)
                        .entityId("entity_n8y8tnk2p9339ti393yi")
                        .idempotencyKey(null)
                        .name("John Doe Balance")
                        .type(BookkeepingAccount.Type.BOOKKEEPING_ACCOUNT)
                        .build()
                )
                .nextCursor("v57w5d")
                .build()

        assertThat(bookkeepingAccountListPageResponse.data())
            .containsExactly(
                BookkeepingAccount.builder()
                    .id("bookkeeping_account_e37p1f1iuocw5intf35v")
                    .accountId(null)
                    .complianceCategory(BookkeepingAccount.ComplianceCategory.CUSTOMER_BALANCE)
                    .entityId("entity_n8y8tnk2p9339ti393yi")
                    .idempotencyKey(null)
                    .name("John Doe Balance")
                    .type(BookkeepingAccount.Type.BOOKKEEPING_ACCOUNT)
                    .build()
            )
        assertThat(bookkeepingAccountListPageResponse.nextCursor()).contains("v57w5d")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val bookkeepingAccountListPageResponse =
            BookkeepingAccountListPageResponse.builder()
                .addData(
                    BookkeepingAccount.builder()
                        .id("bookkeeping_account_e37p1f1iuocw5intf35v")
                        .accountId(null)
                        .complianceCategory(BookkeepingAccount.ComplianceCategory.CUSTOMER_BALANCE)
                        .entityId("entity_n8y8tnk2p9339ti393yi")
                        .idempotencyKey(null)
                        .name("John Doe Balance")
                        .type(BookkeepingAccount.Type.BOOKKEEPING_ACCOUNT)
                        .build()
                )
                .nextCursor("v57w5d")
                .build()

        val roundtrippedBookkeepingAccountListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(bookkeepingAccountListPageResponse),
                jacksonTypeRef<BookkeepingAccountListPageResponse>(),
            )

        assertThat(roundtrippedBookkeepingAccountListPageResponse)
            .isEqualTo(bookkeepingAccountListPageResponse)
    }
}
