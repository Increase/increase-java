package com.increase.api.services

import com.fasterxml.jackson.databind.json.JsonMapper
import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.equalTo
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.getRequestedFor
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
import com.increase.api.core.JsonString
import com.increase.api.core.JsonValue
import com.increase.api.core.jsonMapper
import com.increase.api.models.*
import com.increase.api.models.AccountListPage
import com.increase.api.models.AccountListParams
import java.time.LocalDate
import java.time.OffsetDateTime
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

@WireMockTest
class ServiceParamsTest {

    private val JSON_MAPPER: JsonMapper = jsonMapper()

    private val API_KEY: String = "apiKey"

    private lateinit var client: IncreaseClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            IncreaseOkHttpClient.builder()
                .apiKey(API_KEY)
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

        additionalBodyProperties.put("testBodyProperty", JsonString.of("ghi890"))

        val params =
            AccountCreateParams.builder()
                .entityId("string")
                .programId("string")
                .informationalEntityId("string")
                .name("x")
                .additionalHeaders(additionalHeaders)
                .additionalBodyProperties(additionalBodyProperties)
                .additionalQueryParams(additionalQueryParams)
                .build()

        val apiResponse =
            Account.builder()
                .id("string")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency(Account.Currency.CAD)
                .entityId("string")
                .informationalEntityId("string")
                .interestAccrued("string")
                .interestAccruedAt(LocalDate.parse("2019-12-27"))
                .interestRate("string")
                .name("string")
                .status(Account.Status.OPEN)
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

    @Test
    fun accountsListWithAdditionalParams() {
        val additionalHeaders = mutableMapOf<String, List<String>>()

        additionalHeaders.put("x-test-header", listOf("abc1234"))

        val additionalQueryParams = mutableMapOf<String, List<String>>()

        additionalQueryParams.put("test_query_param", listOf("def567"))

        val params =
            AccountListParams.builder()
                .cursor("string")
                .limit(123L)
                .entityId("string")
                .informationalEntityId("string")
                .status(AccountListParams.Status.OPEN)
                .createdAt(
                    AccountListParams.CreatedAt.builder()
                        .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .additionalHeaders(additionalHeaders)
                .additionalQueryParams(additionalQueryParams)
                .build()

        val apiResponse =
            AccountListPage.Response.builder()
                .data(
                    listOf(
                        Account.builder()
                            .id("string")
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .currency(Account.Currency.CAD)
                            .entityId("string")
                            .informationalEntityId("string")
                            .interestAccrued("string")
                            .interestAccruedAt(LocalDate.parse("2019-12-27"))
                            .interestRate("string")
                            .name("string")
                            .status(Account.Status.OPEN)
                            .type(Account.Type.ACCOUNT)
                            .build()
                    )
                )
                .nextCursor("string")
                .build()

        stubFor(
            get(anyUrl())
                .withHeader("x-test-header", equalTo("abc1234"))
                .withQueryParam("test_query_param", equalTo("def567"))
                .willReturn(ok(JSON_MAPPER.writeValueAsString(apiResponse)))
        )

        client.accounts().list(params)

        verify(getRequestedFor(anyUrl()))
    }
}
