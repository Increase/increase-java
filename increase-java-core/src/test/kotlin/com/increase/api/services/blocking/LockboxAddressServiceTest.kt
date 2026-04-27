// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.lockboxaddresses.LockboxAddressCreateParams
import com.increase.api.models.lockboxaddresses.LockboxAddressUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class LockboxAddressServiceTest {

    @Test
    fun create() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val lockboxAddressService = client.lockboxAddresses()

        val lockboxAddress =
            lockboxAddressService.create(
                LockboxAddressCreateParams.builder().description("Lockbox Address 1").build()
            )

        lockboxAddress.validate()
    }

    @Test
    fun retrieve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val lockboxAddressService = client.lockboxAddresses()

        val lockboxAddress = lockboxAddressService.retrieve("lockbox_address_lw6sbzl9ol5dfd8hdml6")

        lockboxAddress.validate()
    }

    @Test
    fun update() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val lockboxAddressService = client.lockboxAddresses()

        val lockboxAddress =
            lockboxAddressService.update(
                LockboxAddressUpdateParams.builder()
                    .lockboxAddressId("lockbox_address_lw6sbzl9ol5dfd8hdml6")
                    .description("x")
                    .status(LockboxAddressUpdateParams.Status.DISABLED)
                    .build()
            )

        lockboxAddress.validate()
    }

    @Test
    fun list() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val lockboxAddressService = client.lockboxAddresses()

        val page = lockboxAddressService.list()

        page.response().validate()
    }
}
