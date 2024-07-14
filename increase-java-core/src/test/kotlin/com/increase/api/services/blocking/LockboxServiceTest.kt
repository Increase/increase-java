// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.*
import com.increase.api.models.LockboxListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class LockboxServiceTest {

    @Test
    fun callCreate() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val lockboxService = client.lockboxes()
        val lockbox =
            lockboxService.create(
                LockboxCreateParams.builder().accountId("account_id").description("x").build()
            )
        println(lockbox)
        lockbox.validate()
    }

    @Test
    fun callRetrieve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val lockboxService = client.lockboxes()
        val lockbox =
            lockboxService.retrieve(LockboxRetrieveParams.builder().lockboxId("lockbox_id").build())
        println(lockbox)
        lockbox.validate()
    }

    @Test
    fun callUpdate() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val lockboxService = client.lockboxes()
        val lockbox =
            lockboxService.update(
                LockboxUpdateParams.builder()
                    .lockboxId("lockbox_id")
                    .description("x")
                    .status(LockboxUpdateParams.Status.ACTIVE)
                    .build()
            )
        println(lockbox)
        lockbox.validate()
    }

    @Test
    fun callList() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val lockboxService = client.lockboxes()
        val lockboxList = lockboxService.list(LockboxListParams.builder().build())
        println(lockboxList)
        lockboxList.data().forEach { it.validate() }
    }
}
