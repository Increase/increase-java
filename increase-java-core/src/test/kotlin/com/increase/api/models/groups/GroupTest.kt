// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.groups

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class GroupTest {

    @Test
    fun createGroup() {
        val group =
            Group.builder()
                .id("group_1g4mhziu6kvrs3vz35um")
                .achDebitStatus(Group.AchDebitStatus.DISABLED)
                .activationStatus(Group.ActivationStatus.UNACTIVATED)
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .type(Group.Type.GROUP)
                .build()
        assertThat(group).isNotNull
        assertThat(group.id()).isEqualTo("group_1g4mhziu6kvrs3vz35um")
        assertThat(group.achDebitStatus()).isEqualTo(Group.AchDebitStatus.DISABLED)
        assertThat(group.activationStatus()).isEqualTo(Group.ActivationStatus.UNACTIVATED)
        assertThat(group.createdAt()).isEqualTo(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
        assertThat(group.type()).isEqualTo(Group.Type.GROUP)
    }
}
