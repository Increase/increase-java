package com.increase.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class GroupTest {

    @Test
    fun createGroup() {
        val group =
            Group.builder()
                .activationStatus(Group.ActivationStatus.UNACTIVATED)
                .achDebitStatus(Group.AchDebitStatus.DISABLED)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .id("string")
                .type(Group.Type.GROUP)
                .build()
        assertThat(group).isNotNull
        assertThat(group.activationStatus()).isEqualTo(Group.ActivationStatus.UNACTIVATED)
        assertThat(group.achDebitStatus()).isEqualTo(Group.AchDebitStatus.DISABLED)
        assertThat(group.createdAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(group.id()).isEqualTo("string")
        assertThat(group.type()).isEqualTo(Group.Type.GROUP)
    }
}
