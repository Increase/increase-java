// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.beneficialowners.BeneficialOwnerListParams
import com.increase.api.models.beneficialowners.BeneficialOwnerUpdateParams
import java.time.LocalDate
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class BeneficialOwnerServiceAsyncTest {

    @Test
    fun retrieve() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val beneficialOwnerServiceAsync = client.beneficialOwners()

        val entityBeneficialOwnerFuture =
            beneficialOwnerServiceAsync.retrieve(
                "entity_setup_beneficial_owner_submission_vgkyk7dj5eb4sfhdbkx7"
            )

        val entityBeneficialOwner = entityBeneficialOwnerFuture.get()
        entityBeneficialOwner.validate()
    }

    @Test
    fun update() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val beneficialOwnerServiceAsync = client.beneficialOwners()

        val entityBeneficialOwnerFuture =
            beneficialOwnerServiceAsync.update(
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
                    .confirmedNoUsTaxId(true)
                    .identification(
                        BeneficialOwnerUpdateParams.Identification.builder()
                            .method(
                                BeneficialOwnerUpdateParams.Identification.Method
                                    .SOCIAL_SECURITY_NUMBER
                            )
                            .number("xxxx")
                            .driversLicense(
                                BeneficialOwnerUpdateParams.Identification.DriversLicense.builder()
                                    .expirationDate(LocalDate.parse("2019-12-27"))
                                    .fileId("file_id")
                                    .state("x")
                                    .backFileId("back_file_id")
                                    .build()
                            )
                            .other(
                                BeneficialOwnerUpdateParams.Identification.Other.builder()
                                    .country("x")
                                    .description("x")
                                    .fileId("file_id")
                                    .backFileId("back_file_id")
                                    .expirationDate(LocalDate.parse("2019-12-27"))
                                    .build()
                            )
                            .passport(
                                BeneficialOwnerUpdateParams.Identification.Passport.builder()
                                    .country("x")
                                    .expirationDate(LocalDate.parse("2019-12-27"))
                                    .fileId("file_id")
                                    .build()
                            )
                            .build()
                    )
                    .name("x")
                    .build()
            )

        val entityBeneficialOwner = entityBeneficialOwnerFuture.get()
        entityBeneficialOwner.validate()
    }

    @Test
    fun list() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val beneficialOwnerServiceAsync = client.beneficialOwners()

        val pageFuture =
            beneficialOwnerServiceAsync.list(
                BeneficialOwnerListParams.builder().entityId("entity_id").build()
            )

        val page = pageFuture.get()
        page.response().validate()
    }
}
