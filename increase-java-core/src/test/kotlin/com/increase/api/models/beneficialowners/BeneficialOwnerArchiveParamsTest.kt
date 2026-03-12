// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.beneficialowners

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BeneficialOwnerArchiveParamsTest {

    @Test
    fun create() {
        BeneficialOwnerArchiveParams.builder()
            .entityBeneficialOwnerId("entity_beneficial_owner_vozma8szzu1sxezp5zq6")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            BeneficialOwnerArchiveParams.builder()
                .entityBeneficialOwnerId("entity_beneficial_owner_vozma8szzu1sxezp5zq6")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("entity_beneficial_owner_vozma8szzu1sxezp5zq6")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
