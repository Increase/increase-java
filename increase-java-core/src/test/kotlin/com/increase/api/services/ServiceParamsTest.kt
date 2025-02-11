// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services

import com.fasterxml.jackson.databind.json.JsonMapper
import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.equalTo
import com.github.tomakehurst.wiremock.client.WireMock.matchingJsonPath
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.postRequestedFor
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.client.WireMock.verify
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.increase.api.client.IncreaseClient
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.core.JsonValue
import com.increase.api.core.jsonMapper
import com.increase.api.models.Account
import com.increase.api.models.AccountCreateParams
import java.time.LocalDate
import java.time.OffsetDateTime
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

@WireMockTest
class ServiceParamsTest {

    private val JSON_MAPPER: JsonMapper = jsonMapper()

    private lateinit var client: IncreaseClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            IncreaseOkHttpClient.builder()
                .apiKey("My API Key")
                .webhookSecret("My Webhook Secret")
                .baseUrl(wmRuntimeInfo.getHttpBaseUrl())
                .build()
    }

    @Test
    fun accountsCreateWithAdditionalParams() {
        val additionalHeaders = mutableMapOf<String, List<String>>()

        additionalHeaders.put("x-test-header", listOf("abc1234"))

        val additionalQueryParams = mutableMapOf<String, List<String>>()

        additionalQueryParams.put("test_query_param", listOf("def567"))

        val additionalBodyProperties = mutableMapOf<String, JsonValue>()

        additionalBodyProperties.put("testBodyProperty", JsonValue.from("ghi890"))

        val params =
            AccountCreateParams.builder()
                .name("New Account!")
                .entityId("entity_n8y8tnk2p9339ti393yi")
                .informationalEntityId("informational_entity_id")
                .programId("program_i2v2os4mwza1oetokh9i")
                .additionalHeaders(additionalHeaders)
                .additionalBodyProperties(additionalBodyProperties)
                .additionalQueryParams(additionalQueryParams)
                .build()

        val apiResponse =
            Account.builder()
                .id("account_in71c4amph0vgo2qllky")
                .bank(Account.Bank.CORE_BANK)
                .closedAt(null)
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .currency(Account.Currency.CAD)
                .entityId("entity_n8y8tnk2p9339ti393yi")
                .idempotencyKey(null)
                .informationalEntityId(null)
                .interestAccrued("0.01")
                .interestAccruedAt(LocalDate.parse("2020-01-31"))
                .interestRate("0.055")
                .name("My first account!")
                .programId("program_i2v2os4mwza1oetokh9i")
                .status(Account.Status.CLOSED)
                .type(Account.Type.ACCOUNT)
                .build()

        stubFor(
            post(anyUrl())
                .withHeader("x-test-header", equalTo("abc1234"))
                .withQueryParam("test_query_param", equalTo("def567"))
                .withRequestBody(matchingJsonPath("$.testBodyProperty", equalTo("ghi890")))
                .willReturn(ok(JSON_MAPPER.writeValueAsString(apiResponse)))
        )

        client.accounts().create(params)

        verify(postRequestedFor(anyUrl()))
    }
}
