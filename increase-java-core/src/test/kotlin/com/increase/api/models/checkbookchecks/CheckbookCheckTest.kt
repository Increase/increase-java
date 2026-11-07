// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.checkbookchecks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CheckbookCheckTest {

    @Test
    fun create() {
        val checkbookCheck =
            CheckbookCheck.builder()
                .id("checkbook_check_klgh3z50guf6jcnfhibb")
                .checkNumber(1L)
                .checkbookId("checkbook_7iudxhxum6vlkcjxmi8y")
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .status(CheckbookCheck.Status.PENDING_DEPOSIT)
                .type(CheckbookCheck.Type.CHECKBOOK_CHECK)
                .build()

        assertThat(checkbookCheck.id()).isEqualTo("checkbook_check_klgh3z50guf6jcnfhibb")
        assertThat(checkbookCheck.checkNumber()).isEqualTo(1L)
        assertThat(checkbookCheck.checkbookId()).isEqualTo("checkbook_7iudxhxum6vlkcjxmi8y")
        assertThat(checkbookCheck.createdAt())
            .isEqualTo(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
        assertThat(checkbookCheck.status()).isEqualTo(CheckbookCheck.Status.PENDING_DEPOSIT)
        assertThat(checkbookCheck.type()).isEqualTo(CheckbookCheck.Type.CHECKBOOK_CHECK)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val checkbookCheck =
            CheckbookCheck.builder()
                .id("checkbook_check_klgh3z50guf6jcnfhibb")
                .checkNumber(1L)
                .checkbookId("checkbook_7iudxhxum6vlkcjxmi8y")
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .status(CheckbookCheck.Status.PENDING_DEPOSIT)
                .type(CheckbookCheck.Type.CHECKBOOK_CHECK)
                .build()

        val roundtrippedCheckbookCheck =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(checkbookCheck),
                jacksonTypeRef<CheckbookCheck>(),
            )

        assertThat(roundtrippedCheckbookCheck).isEqualTo(checkbookCheck)
    }
}
