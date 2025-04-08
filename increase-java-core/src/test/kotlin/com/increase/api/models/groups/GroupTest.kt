// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.groups

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GroupTest {

    @Test
    fun create() {
        val group =
            Group.builder()
                .id("group_1g4mhziu6kvrs3vz35um")
                .achDebitStatus(Group.AchDebitStatus.DISABLED)
                .activationStatus(Group.ActivationStatus.ACTIVATED)
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .type(Group.Type.GROUP)
                .build()

        assertThat(group.id()).isEqualTo("group_1g4mhziu6kvrs3vz35um")
        assertThat(group.achDebitStatus()).isEqualTo(Group.AchDebitStatus.DISABLED)
        assertThat(group.activationStatus()).isEqualTo(Group.ActivationStatus.ACTIVATED)
        assertThat(group.createdAt()).isEqualTo(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
        assertThat(group.type()).isEqualTo(Group.Type.GROUP)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val group =
            Group.builder()
                .id("group_1g4mhziu6kvrs3vz35um")
                .achDebitStatus(Group.AchDebitStatus.DISABLED)
                .activationStatus(Group.ActivationStatus.ACTIVATED)
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .type(Group.Type.GROUP)
                .build()

        val roundtrippedGroup =
            jsonMapper.readValue(jsonMapper.writeValueAsString(group), jacksonTypeRef<Group>())

        assertThat(roundtrippedGroup).isEqualTo(group)
    }
}
