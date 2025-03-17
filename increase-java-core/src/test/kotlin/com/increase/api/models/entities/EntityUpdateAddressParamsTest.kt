// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.entities

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EntityUpdateAddressParamsTest {

    @Test
    fun create() {
        EntityUpdateAddressParams.builder()
            .entityId("entity_n8y8tnk2p9339ti393yi")
            .address(
                EntityUpdateAddressParams.Address.builder()
                    .city("New York")
                    .line1("33 Liberty Street")
                    .state("NY")
                    .zip("10045")
                    .line2("Unit 2")
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            EntityUpdateAddressParams.builder()
                .entityId("entity_n8y8tnk2p9339ti393yi")
                .address(
                    EntityUpdateAddressParams.Address.builder()
                        .city("New York")
                        .line1("33 Liberty Street")
                        .state("NY")
                        .zip("10045")
                        .line2("Unit 2")
                        .build()
                )
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.address())
            .isEqualTo(
                EntityUpdateAddressParams.Address.builder()
                    .city("New York")
                    .line1("33 Liberty Street")
                    .state("NY")
                    .zip("10045")
                    .line2("Unit 2")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            EntityUpdateAddressParams.builder()
                .entityId("entity_n8y8tnk2p9339ti393yi")
                .address(
                    EntityUpdateAddressParams.Address.builder()
                        .city("New York")
                        .line1("33 Liberty Street")
                        .state("NY")
                        .zip("10045")
                        .build()
                )
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.address())
            .isEqualTo(
                EntityUpdateAddressParams.Address.builder()
                    .city("New York")
                    .line1("33 Liberty Street")
                    .state("NY")
                    .zip("10045")
                    .build()
            )
    }

    @Test
    fun getPathParam() {
        val params =
            EntityUpdateAddressParams.builder()
                .entityId("entity_n8y8tnk2p9339ti393yi")
                .address(
                    EntityUpdateAddressParams.Address.builder()
                        .city("New York")
                        .line1("33 Liberty Street")
                        .state("NY")
                        .zip("10045")
                        .build()
                )
                .build()
        assertThat(params).isNotNull
        // path param "entityId"
        assertThat(params.getPathParam(0)).isEqualTo("entity_n8y8tnk2p9339ti393yi")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
