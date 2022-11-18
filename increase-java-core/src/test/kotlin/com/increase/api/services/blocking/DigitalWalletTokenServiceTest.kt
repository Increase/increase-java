package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.*
import com.increase.api.models.DigitalWalletTokenListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class DigitalWalletTokenServiceTest {

    @Test
    fun callRetrieve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .build()
        val digitalWalletTokenService = client.digitalWalletTokens()
        val digitalWalletToken =
            digitalWalletTokenService.retrieve(
                DigitalWalletTokenRetrieveParams.builder().digitalWalletTokenId("string").build()
            )
        println(digitalWalletToken)
        digitalWalletToken.validate()
    }

    @Test
    fun callList() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .build()
        val digitalWalletTokenService = client.digitalWalletTokens()
        val digitalWalletTokenList =
            digitalWalletTokenService.list(DigitalWalletTokenListParams.builder().build())
        println(digitalWalletTokenList)
        digitalWalletTokenList.data().forEach { it.validate() }
    }
}
