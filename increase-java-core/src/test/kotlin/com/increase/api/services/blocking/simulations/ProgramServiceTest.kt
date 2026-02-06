// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking.simulations

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.simulations.programs.ProgramCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ProgramServiceTest {

    @Test
    fun create() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val programService = client.simulations().programs()

        val program =
            programService.create(
                ProgramCreateParams.builder()
                    .name("For Benefit Of")
                    .bank(ProgramCreateParams.Bank.CORE_BANK)
                    .lendingMaximumExtendableCredit(0L)
                    .reserveAccountId("reserve_account_id")
                    .build()
            )

        program.validate()
    }
}
