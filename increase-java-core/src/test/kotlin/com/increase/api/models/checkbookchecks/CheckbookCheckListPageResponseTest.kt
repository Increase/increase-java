// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.checkbookchecks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CheckbookCheckListPageResponseTest {

    @Test
    fun create() {
        val checkbookCheckListPageResponse =
            CheckbookCheckListPageResponse.builder()
                .addData(
                    CheckbookCheck.builder()
                        .id("checkbook_check_klgh3z50guf6jcnfhibb")
                        .checkNumber(1L)
                        .checkbookId("checkbook_7iudxhxum6vlkcjxmi8y")
                        .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .status(CheckbookCheck.Status.PENDING_DEPOSIT)
                        .type(CheckbookCheck.Type.CHECKBOOK_CHECK)
                        .build()
                )
                .nextCursor("v57w5d")
                .build()

        assertThat(checkbookCheckListPageResponse.data())
            .containsExactly(
                CheckbookCheck.builder()
                    .id("checkbook_check_klgh3z50guf6jcnfhibb")
                    .checkNumber(1L)
                    .checkbookId("checkbook_7iudxhxum6vlkcjxmi8y")
                    .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                    .status(CheckbookCheck.Status.PENDING_DEPOSIT)
                    .type(CheckbookCheck.Type.CHECKBOOK_CHECK)
                    .build()
            )
        assertThat(checkbookCheckListPageResponse.nextCursor()).contains("v57w5d")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val checkbookCheckListPageResponse =
            CheckbookCheckListPageResponse.builder()
                .addData(
                    CheckbookCheck.builder()
                        .id("checkbook_check_klgh3z50guf6jcnfhibb")
                        .checkNumber(1L)
                        .checkbookId("checkbook_7iudxhxum6vlkcjxmi8y")
                        .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .status(CheckbookCheck.Status.PENDING_DEPOSIT)
                        .type(CheckbookCheck.Type.CHECKBOOK_CHECK)
                        .build()
                )
                .nextCursor("v57w5d")
                .build()

        val roundtrippedCheckbookCheckListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(checkbookCheckListPageResponse),
                jacksonTypeRef<CheckbookCheckListPageResponse>(),
            )

        assertThat(roundtrippedCheckbookCheckListPageResponse)
            .isEqualTo(checkbookCheckListPageResponse)
    }
}
