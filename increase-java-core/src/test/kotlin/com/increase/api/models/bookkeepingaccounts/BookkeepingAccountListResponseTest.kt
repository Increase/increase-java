// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.bookkeepingaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BookkeepingAccountListResponseTest {

    @Test
    fun create() {
        val bookkeepingAccountListResponse =
            BookkeepingAccountListResponse.builder()
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

        assertThat(bookkeepingAccountListResponse.data())
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
        assertThat(bookkeepingAccountListResponse.nextCursor()).contains("v57w5d")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val bookkeepingAccountListResponse =
            BookkeepingAccountListResponse.builder()
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

        val roundtrippedBookkeepingAccountListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(bookkeepingAccountListResponse),
                jacksonTypeRef<BookkeepingAccountListResponse>(),
            )

        assertThat(roundtrippedBookkeepingAccountListResponse)
            .isEqualTo(bookkeepingAccountListResponse)
    }
}
