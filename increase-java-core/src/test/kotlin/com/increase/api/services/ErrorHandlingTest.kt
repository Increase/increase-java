// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services

import com.fasterxml.jackson.databind.json.JsonMapper
import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.put
import com.github.tomakehurst.wiremock.client.WireMock.status
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.increase.api.client.IncreaseClient
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.core.JsonString
import com.increase.api.core.http.Headers
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
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

@WireMockTest
class ErrorHandlingTest {

    private val JSON_MAPPER: JsonMapper = jsonMapper()

    private val INCREASE_ERROR: IncreaseError =
        IncreaseError.builder().putAdditionalProperty("key", JsonString.of("value")).build()

    private lateinit var client: IncreaseClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            IncreaseOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.getHttpBaseUrl())
                .apiKey("My API Key")
                .webhookSecret("My Webhook Secret")
                .build()
    }

    @Test
    fun accountsCreate200() {
        val params =
            AccountCreateParams.builder()
                .name("x")
                .entityId("entity_id")
                .informationalEntityId("informational_entity_id")
                .programId("program_id")
                .build()

        val expected =
            Account.builder()
                .id("id")
                .bank(Account.Bank.BLUE_RIDGE_BANK)
                .closedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency(Account.Currency.CAD)
                .entityId("entity_id")
                .idempotencyKey("idempotency_key")
                .informationalEntityId("informational_entity_id")
                .interestAccrued("interest_accrued")
                .interestAccruedAt(LocalDate.parse("2019-12-27"))
                .interestRate("interest_rate")
                .name("name")
                .programId("program_id")
                .status(Account.Status.CLOSED)
                .type(Account.Type.ACCOUNT)
                .build()

        stubFor(post(anyUrl()).willReturn(ok().withBody(toJson(expected))))

        assertThat(client.accounts().create(params)).isEqualTo(expected)
    }

    @Test
    fun accountsCreate400() {
        val params =
            AccountCreateParams.builder()
                .name("x")
                .entityId("entity_id")
                .informationalEntityId("informational_entity_id")
                .programId("program_id")
                .build()

        stubFor(
            post(anyUrl())
                .willReturn(status(400).withHeader("Foo", "Bar").withBody(toJson(INCREASE_ERROR)))
        )

        assertThatThrownBy({ client.accounts().create(params) })
            .satisfies({ e ->
                assertBadRequest(e, Headers.builder().put("Foo", "Bar").build(), INCREASE_ERROR)
            })
    }

    @Test
    fun accountsCreate401() {
        val params =
            AccountCreateParams.builder()
                .name("x")
                .entityId("entity_id")
                .informationalEntityId("informational_entity_id")
                .programId("program_id")
                .build()

        stubFor(
            post(anyUrl())
                .willReturn(status(401).withHeader("Foo", "Bar").withBody(toJson(INCREASE_ERROR)))
        )

        assertThatThrownBy({ client.accounts().create(params) })
            .satisfies({ e ->
                assertUnauthorized(e, Headers.builder().put("Foo", "Bar").build(), INCREASE_ERROR)
            })
    }

    @Test
    fun accountsCreate403() {
        val params =
            AccountCreateParams.builder()
                .name("x")
                .entityId("entity_id")
                .informationalEntityId("informational_entity_id")
                .programId("program_id")
                .build()

        stubFor(
            post(anyUrl())
                .willReturn(status(403).withHeader("Foo", "Bar").withBody(toJson(INCREASE_ERROR)))
        )

        assertThatThrownBy({ client.accounts().create(params) })
            .satisfies({ e ->
                assertPermissionDenied(
                    e,
                    Headers.builder().put("Foo", "Bar").build(),
                    INCREASE_ERROR
                )
            })
    }

    @Test
    fun accountsCreate404() {
        val params =
            AccountCreateParams.builder()
                .name("x")
                .entityId("entity_id")
                .informationalEntityId("informational_entity_id")
                .programId("program_id")
                .build()

        stubFor(
            post(anyUrl())
                .willReturn(status(404).withHeader("Foo", "Bar").withBody(toJson(INCREASE_ERROR)))
        )

        assertThatThrownBy({ client.accounts().create(params) })
            .satisfies({ e ->
                assertNotFound(e, Headers.builder().put("Foo", "Bar").build(), INCREASE_ERROR)
            })
    }

    @Test
    fun accountsCreate422() {
        val params =
            AccountCreateParams.builder()
                .name("x")
                .entityId("entity_id")
                .informationalEntityId("informational_entity_id")
                .programId("program_id")
                .build()

        stubFor(
            post(anyUrl())
                .willReturn(status(422).withHeader("Foo", "Bar").withBody(toJson(INCREASE_ERROR)))
        )

        assertThatThrownBy({ client.accounts().create(params) })
            .satisfies({ e ->
                assertUnprocessableEntity(
                    e,
                    Headers.builder().put("Foo", "Bar").build(),
                    INCREASE_ERROR
                )
            })
    }

    @Test
    fun accountsCreate429() {
        val params =
            AccountCreateParams.builder()
                .name("x")
                .entityId("entity_id")
                .informationalEntityId("informational_entity_id")
                .programId("program_id")
                .build()

        stubFor(
            post(anyUrl())
                .willReturn(status(429).withHeader("Foo", "Bar").withBody(toJson(INCREASE_ERROR)))
        )

        assertThatThrownBy({ client.accounts().create(params) })
            .satisfies({ e ->
                assertRateLimit(e, Headers.builder().put("Foo", "Bar").build(), INCREASE_ERROR)
            })
    }

    @Test
    fun accountsCreate500() {
        val params =
            AccountCreateParams.builder()
                .name("x")
                .entityId("entity_id")
                .informationalEntityId("informational_entity_id")
                .programId("program_id")
                .build()

        stubFor(
            post(anyUrl())
                .willReturn(status(500).withHeader("Foo", "Bar").withBody(toJson(INCREASE_ERROR)))
        )

        assertThatThrownBy({ client.accounts().create(params) })
            .satisfies({ e ->
                assertInternalServer(e, Headers.builder().put("Foo", "Bar").build(), INCREASE_ERROR)
            })
    }

    @Test
    fun unexpectedStatusCode() {
        val params =
            AccountCreateParams.builder()
                .name("x")
                .entityId("entity_id")
                .informationalEntityId("informational_entity_id")
                .programId("program_id")
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
                    Headers.builder().put("Foo", "Bar").build(),
                    toJson(INCREASE_ERROR)
                )
            })
    }

    @Test
    fun invalidBody() {
        val params =
            AccountCreateParams.builder()
                .name("x")
                .entityId("entity_id")
                .informationalEntityId("informational_entity_id")
                .programId("program_id")
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
                .name("x")
                .entityId("entity_id")
                .informationalEntityId("informational_entity_id")
                .programId("program_id")
                .build()

        stubFor(post(anyUrl()).willReturn(status(400).withBody("Not JSON")))

        assertThatThrownBy({ client.accounts().create(params) })
            .satisfies({ e ->
                assertBadRequest(e, Headers.builder().build(), IncreaseError.builder().build())
            })
    }

    private fun <T> toJson(body: T): ByteArray {
        return JSON_MAPPER.writeValueAsBytes(body)
    }

    private fun assertUnexpectedStatusCodeException(
        throwable: Throwable,
        statusCode: Int,
        headers: Headers,
        responseBody: ByteArray
    ) {
        assertThat(throwable)
            .asInstanceOf(
                InstanceOfAssertFactories.throwable(UnexpectedStatusCodeException::class.java)
            )
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(statusCode)
                assertThat(e.body()).isEqualTo(String(responseBody))
                assertThat(e.headers().toMap()).containsAllEntriesOf(headers.toMap())
            })
    }

    private fun assertBadRequest(throwable: Throwable, headers: Headers, error: IncreaseError) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(BadRequestException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(400)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers().toMap()).containsAllEntriesOf(headers.toMap())
            })
    }

    private fun assertUnauthorized(throwable: Throwable, headers: Headers, error: IncreaseError) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(UnauthorizedException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(401)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers().toMap()).containsAllEntriesOf(headers.toMap())
            })
    }

    private fun assertPermissionDenied(
        throwable: Throwable,
        headers: Headers,
        error: IncreaseError
    ) {
        assertThat(throwable)
            .asInstanceOf(
                InstanceOfAssertFactories.throwable(PermissionDeniedException::class.java)
            )
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(403)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers().toMap()).containsAllEntriesOf(headers.toMap())
            })
    }

    private fun assertNotFound(throwable: Throwable, headers: Headers, error: IncreaseError) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(NotFoundException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(404)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers().toMap()).containsAllEntriesOf(headers.toMap())
            })
    }

    private fun assertUnprocessableEntity(
        throwable: Throwable,
        headers: Headers,
        error: IncreaseError
    ) {
        assertThat(throwable)
            .asInstanceOf(
                InstanceOfAssertFactories.throwable(UnprocessableEntityException::class.java)
            )
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(422)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers().toMap()).containsAllEntriesOf(headers.toMap())
            })
    }

    private fun assertRateLimit(throwable: Throwable, headers: Headers, error: IncreaseError) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(RateLimitException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(429)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers().toMap()).containsAllEntriesOf(headers.toMap())
            })
    }

    private fun assertInternalServer(throwable: Throwable, headers: Headers, error: IncreaseError) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(InternalServerException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(500)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers().toMap()).containsAllEntriesOf(headers.toMap())
            })
    }

    private fun Headers.toMap(): Map<String, List<String>> =
        mutableMapOf<String, List<String>>().also { map ->
            names().forEach { map[it] = values(it) }
        }
}
