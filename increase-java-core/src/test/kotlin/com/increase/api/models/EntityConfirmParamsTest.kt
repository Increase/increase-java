// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EntityConfirmParamsTest {

    @Test
    fun createEntityConfirmParams() {
        EntityConfirmParams.builder()
            .entityId("entity_id")
            .confirmedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .build()
    }

    @Test
    fun getBody() {
        val params =
            EntityConfirmParams.builder()
                .entityId("entity_id")
                .confirmedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.confirmedAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = EntityConfirmParams.builder().entityId("entity_id").build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params = EntityConfirmParams.builder().entityId("entity_id").build()
        assertThat(params).isNotNull
        // path param "entityId"
        assertThat(params.getPathParam(0)).isEqualTo("entity_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
