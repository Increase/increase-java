package com.increase.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EventSubscriptionTest {

    @Test
    fun createEventSubscription() {
        val eventSubscription =
            EventSubscription.builder()
                .id("string")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .selectedEventCategory(EventSubscription.SelectedEventCategory.ACCOUNT_CREATED)
                .sharedSecret("string")
                .status(EventSubscription.Status.ACTIVE)
                .type(EventSubscription.Type.EVENT_SUBSCRIPTION)
                .url("string")
                .build()
        assertThat(eventSubscription).isNotNull
        assertThat(eventSubscription.id()).isEqualTo("string")
        assertThat(eventSubscription.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(eventSubscription.status()).isEqualTo(EventSubscription.Status.ACTIVE)
        assertThat(eventSubscription.selectedEventCategory())
            .contains(EventSubscription.SelectedEventCategory.ACCOUNT_CREATED)
        assertThat(eventSubscription.url()).isEqualTo("string")
        assertThat(eventSubscription.sharedSecret()).isEqualTo("string")
        assertThat(eventSubscription.type()).isEqualTo(EventSubscription.Type.EVENT_SUBSCRIPTION)
    }
}
