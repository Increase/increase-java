package com.increase.api.services

import com.fasterxml.jackson.databind.json.JsonMapper
import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.status
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.google.common.collect.ImmutableListMultimap
import com.google.common.collect.ListMultimap
import com.increase.api.client.IncreaseClient
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.core.JsonString
import com.increase.api.core.jsonMapper
import com.increase.api.errors.BadRequestException
import com.increase.api.errors.IncreaseError
import com.increase.api.errors.IncreaseException
import com.increase.api.errors.InternalServerException
import com.increase.api.errors.NotFoundException
import com.increase.api.errors.PermissionDeniedException
import com.increase.api.errors.RateLimitException
import com.increase.api.errors.UnauthorizedException
import com.increase.api.errors.UnexpectedStatusCodeException
import com.increase.api.errors.UnprocessableEntityException
import com.increase.api.models.*
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.assertj.core.api.InstanceOfAssertFactories
import org.assertj.guava.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

@WireMockTest
class ErrorHandlingTest {

    private val JSON_MAPPER: JsonMapper = jsonMapper()

    private val API_KEY: String = "apiKey"

    private val INCREASE_ERROR: IncreaseError =
        IncreaseError.builder().putAdditionalProperty("key", JsonString.of("value")).build()

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
    fun accountsCreate_200() {
        val params =
            AccountCreateParams.builder()
                .entityId("string")
                .programId("string")
                .informationalEntityId("string")
                .name("x")
                .build()

        val expected =
            Account.builder()
                .balances(
                    Account.Balances.builder().currentBalance(123L).availableBalance(123L).build()
                )
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency(Account.Currency.CAD)
                .entityId("string")
                .informationalEntityId("string")
                .id("string")
                .interestAccrued("string")
                .interestAccruedAt(LocalDate.parse("2019-12-27"))
                .name("string")
                .status(Account.Status.OPEN)
                .type(Account.Type.ACCOUNT)
                .build()

        stubFor(post(anyUrl()).willReturn(ok().withBody(toJson(expected))))

        assertThat(client.accounts().create(params)).isEqualTo(expected)
    }

    @Test
    fun accountsCreate_400() {
        val params =
            AccountCreateParams.builder()
                .entityId("string")
                .programId("string")
                .informationalEntityId("string")
                .name("x")
                .build()

        stubFor(
            post(anyUrl())
                .willReturn(status(400).withHeader("Foo", "Bar").withBody(toJson(INCREASE_ERROR)))
        )

        assertThatThrownBy({ client.accounts().create(params) })
            .satisfies({ e ->
                assertBadRequest(e, ImmutableListMultimap.of("Foo", "Bar"), INCREASE_ERROR)
            })
    }

    @Test
    fun accountsCreate_401() {
        val params =
            AccountCreateParams.builder()
                .entityId("string")
                .programId("string")
                .informationalEntityId("string")
                .name("x")
                .build()

        stubFor(
            post(anyUrl())
                .willReturn(status(401).withHeader("Foo", "Bar").withBody(toJson(INCREASE_ERROR)))
        )

        assertThatThrownBy({ client.accounts().create(params) })
            .satisfies({ e ->
                assertUnauthorized(e, ImmutableListMultimap.of("Foo", "Bar"), INCREASE_ERROR)
            })
    }

    @Test
    fun accountsCreate_403() {
        val params =
            AccountCreateParams.builder()
                .entityId("string")
                .programId("string")
                .informationalEntityId("string")
                .name("x")
                .build()

        stubFor(
            post(anyUrl())
                .willReturn(status(403).withHeader("Foo", "Bar").withBody(toJson(INCREASE_ERROR)))
        )

        assertThatThrownBy({ client.accounts().create(params) })
            .satisfies({ e ->
                assertPermissionDenied(e, ImmutableListMultimap.of("Foo", "Bar"), INCREASE_ERROR)
            })
    }

    @Test
    fun accountsCreate_404() {
        val params =
            AccountCreateParams.builder()
                .entityId("string")
                .programId("string")
                .informationalEntityId("string")
                .name("x")
                .build()

        stubFor(
            post(anyUrl())
                .willReturn(status(404).withHeader("Foo", "Bar").withBody(toJson(INCREASE_ERROR)))
        )

        assertThatThrownBy({ client.accounts().create(params) })
            .satisfies({ e ->
                assertNotFound(e, ImmutableListMultimap.of("Foo", "Bar"), INCREASE_ERROR)
            })
    }

    @Test
    fun accountsCreate_422() {
        val params =
            AccountCreateParams.builder()
                .entityId("string")
                .programId("string")
                .informationalEntityId("string")
                .name("x")
                .build()

        stubFor(
            post(anyUrl())
                .willReturn(status(422).withHeader("Foo", "Bar").withBody(toJson(INCREASE_ERROR)))
        )

        assertThatThrownBy({ client.accounts().create(params) })
            .satisfies({ e ->
                assertUnprocessableEntity(e, ImmutableListMultimap.of("Foo", "Bar"), INCREASE_ERROR)
            })
    }

    @Test
    fun accountsCreate_429() {
        val params =
            AccountCreateParams.builder()
                .entityId("string")
                .programId("string")
                .informationalEntityId("string")
                .name("x")
                .build()

        stubFor(
            post(anyUrl())
                .willReturn(status(429).withHeader("Foo", "Bar").withBody(toJson(INCREASE_ERROR)))
        )

        assertThatThrownBy({ client.accounts().create(params) })
            .satisfies({ e ->
                assertRateLimit(e, ImmutableListMultimap.of("Foo", "Bar"), INCREASE_ERROR)
            })
    }

    @Test
    fun accountsCreate_500() {
        val params =
            AccountCreateParams.builder()
                .entityId("string")
                .programId("string")
                .informationalEntityId("string")
                .name("x")
                .build()

        stubFor(
            post(anyUrl())
                .willReturn(status(500).withHeader("Foo", "Bar").withBody(toJson(INCREASE_ERROR)))
        )

        assertThatThrownBy({ client.accounts().create(params) })
            .satisfies({ e ->
                assertInternalServer(e, ImmutableListMultimap.of("Foo", "Bar"), INCREASE_ERROR)
            })
    }

    @Test
    fun unexpectedStatusCode() {
        val params =
            AccountCreateParams.builder()
                .entityId("string")
                .programId("string")
                .informationalEntityId("string")
                .name("x")
                .build()

        stubFor(
            post(anyUrl())
                .willReturn(status(999).withHeader("Foo", "Bar").withBody(toJson(INCREASE_ERROR)))
        )

        assertThatThrownBy({ client.accounts().create(params) })
            .satisfies({ e ->
                assertUnexpectedStatusCodeException(
                    e,
                    999,
                    ImmutableListMultimap.of("Foo", "Bar"),
                    toJson(INCREASE_ERROR)
                )
            })
    }

    @Test
    fun invalidBody() {
        val params =
            AccountCreateParams.builder()
                .entityId("string")
                .programId("string")
                .informationalEntityId("string")
                .name("x")
                .build()

        stubFor(post(anyUrl()).willReturn(status(200).withBody("Not JSON")))

        assertThatThrownBy({ client.accounts().create(params) })
            .satisfies({ e ->
                assertThat(e)
                    .isInstanceOf(IncreaseException::class.java)
                    .hasMessage("Error reading response")
            })
    }

    @Test
    fun invalidErrorBody() {
        val params =
            AccountCreateParams.builder()
                .entityId("string")
                .programId("string")
                .informationalEntityId("string")
                .name("x")
                .build()

        stubFor(post(anyUrl()).willReturn(status(400).withBody("Not JSON")))

        assertThatThrownBy({ client.accounts().create(params) })
            .satisfies({ e ->
                assertBadRequest(e, ImmutableListMultimap.of(), IncreaseError.builder().build())
            })
    }

    private fun <T> toJson(body: T): ByteArray {
        return JSON_MAPPER.writeValueAsBytes(body)
    }

    private fun assertUnexpectedStatusCodeException(
        throwable: Throwable,
        statusCode: Int,
        headers: ListMultimap<String, String>,
        responseBody: ByteArray
    ) {
        assertThat(throwable)
            .asInstanceOf(
                InstanceOfAssertFactories.throwable(UnexpectedStatusCodeException::class.java)
            )
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(statusCode)
                assertThat(e.body()).isEqualTo(String(responseBody))
                assertThat(e.headers()).containsAllEntriesOf(headers)
            })
    }

    private fun assertBadRequest(
        throwable: Throwable,
        headers: ListMultimap<String, String>,
        error: IncreaseError
    ) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(BadRequestException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(400)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers()).containsAllEntriesOf(headers)
            })
    }

    private fun assertUnauthorized(
        throwable: Throwable,
        headers: ListMultimap<String, String>,
        error: IncreaseError
    ) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(UnauthorizedException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(401)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers()).containsAllEntriesOf(headers)
            })
    }

    private fun assertPermissionDenied(
        throwable: Throwable,
        headers: ListMultimap<String, String>,
        error: IncreaseError
    ) {
        assertThat(throwable)
            .asInstanceOf(
                InstanceOfAssertFactories.throwable(PermissionDeniedException::class.java)
            )
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(403)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers()).containsAllEntriesOf(headers)
            })
    }

    private fun assertNotFound(
        throwable: Throwable,
        headers: ListMultimap<String, String>,
        error: IncreaseError
    ) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(NotFoundException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(404)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers()).containsAllEntriesOf(headers)
            })
    }

    private fun assertUnprocessableEntity(
        throwable: Throwable,
        headers: ListMultimap<String, String>,
        error: IncreaseError
    ) {
        assertThat(throwable)
            .asInstanceOf(
                InstanceOfAssertFactories.throwable(UnprocessableEntityException::class.java)
            )
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(422)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers()).containsAllEntriesOf(headers)
            })
    }

    private fun assertRateLimit(
        throwable: Throwable,
        headers: ListMultimap<String, String>,
        error: IncreaseError
    ) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(RateLimitException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(429)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers()).containsAllEntriesOf(headers)
            })
    }

    private fun assertInternalServer(
        throwable: Throwable,
        headers: ListMultimap<String, String>,
        error: IncreaseError
    ) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(InternalServerException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(500)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers()).containsAllEntriesOf(headers)
            })
    }
}
