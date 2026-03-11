// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.beneficialowners.BeneficialOwnerListParams
import com.increase.api.models.beneficialowners.BeneficialOwnerUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class BeneficialOwnerServiceTest {

    @Test
    fun retrieve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val beneficialOwnerService = client.beneficialOwners()

        val entityBeneficialOwner =
            beneficialOwnerService.retrieve(
                "entity_setup_beneficial_owner_submission_vgkyk7dj5eb4sfhdbkx7"
            )

        entityBeneficialOwner.validate()
    }

    @Test
    fun update() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val beneficialOwnerService = client.beneficialOwners()

        val entityBeneficialOwner =
            beneficialOwnerService.update(
                BeneficialOwnerUpdateParams.builder()
                    .entityBeneficialOwnerId(
                        "entity_setup_beneficial_owner_submission_vgkyk7dj5eb4sfhdbkx7"
                    )
                    .address(
                        BeneficialOwnerUpdateParams.Address.builder()
                            .city("New York")
                            .country("US")
                            .line1("33 Liberty Street")
                            .line2("Unit 2")
                            .state("NY")
                            .zip("10045")
                            .build()
                    )
                    .build()
            )

        entityBeneficialOwner.validate()
    }

    @Test
    fun list() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val beneficialOwnerService = client.beneficialOwners()

        val page =
            beneficialOwnerService.list(
                BeneficialOwnerListParams.builder().entityId("entity_id").build()
            )

        page.response().validate()
    }
}
