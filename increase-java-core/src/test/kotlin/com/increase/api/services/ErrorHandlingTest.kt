// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.status
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.increase.api.client.IncreaseClient
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.core.JsonValue
import com.increase.api.core.http.Headers
import com.increase.api.core.jsonMapper
import com.increase.api.errors.BadRequestException
import com.increase.api.errors.IncreaseException
import com.increase.api.errors.InternalServerException
import com.increase.api.errors.NotFoundException
import com.increase.api.errors.PermissionDeniedException
import com.increase.api.errors.RateLimitException
import com.increase.api.errors.UnauthorizedException
import com.increase.api.errors.UnexpectedStatusCodeException
import com.increase.api.errors.UnprocessableEntityException
import com.increase.api.models.accounts.AccountCreateParams
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.entry
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

@WireMockTest
internal class ErrorHandlingTest {

    companion object {

        private val ERROR_JSON: JsonValue = JsonValue.from(mapOf("errorProperty" to "42"))

        private val ERROR_JSON_BYTES: ByteArray = jsonMapper().writeValueAsBytes(ERROR_JSON)

        private const val HEADER_NAME: String = "Error-Header"

        private const val HEADER_VALUE: String = "42"

        private const val NOT_JSON: String = "Not JSON"
    }

    private lateinit var client: IncreaseClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            IncreaseOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .apiKey("My API Key")
                .build()
    }

    @Test
    fun accountsCreate400() {
        val accountService = client.accounts()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(400).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<BadRequestException> {
                accountService.create(
                    AccountCreateParams.builder()
                        .name("New Account!")
                        .entityId("entity_n8y8tnk2p9339ti393yi")
                        .informationalEntityId("informational_entity_id")
                        .programId("program_i2v2os4mwza1oetokh9i")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(400)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun accountsCreate401() {
        val accountService = client.accounts()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(401).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnauthorizedException> {
                accountService.create(
                    AccountCreateParams.builder()
                        .name("New Account!")
                        .entityId("entity_n8y8tnk2p9339ti393yi")
                        .informationalEntityId("informational_entity_id")
                        .programId("program_i2v2os4mwza1oetokh9i")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(401)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun accountsCreate403() {
        val accountService = client.accounts()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(403).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<PermissionDeniedException> {
                accountService.create(
                    AccountCreateParams.builder()
                        .name("New Account!")
                        .entityId("entity_n8y8tnk2p9339ti393yi")
                        .informationalEntityId("informational_entity_id")
                        .programId("program_i2v2os4mwza1oetokh9i")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(403)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun accountsCreate404() {
        val accountService = client.accounts()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(404).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<NotFoundException> {
                accountService.create(
                    AccountCreateParams.builder()
                        .name("New Account!")
                        .entityId("entity_n8y8tnk2p9339ti393yi")
                        .informationalEntityId("informational_entity_id")
                        .programId("program_i2v2os4mwza1oetokh9i")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(404)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun accountsCreate422() {
        val accountService = client.accounts()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(422).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnprocessableEntityException> {
                accountService.create(
                    AccountCreateParams.builder()
                        .name("New Account!")
                        .entityId("entity_n8y8tnk2p9339ti393yi")
                        .informationalEntityId("informational_entity_id")
                        .programId("program_i2v2os4mwza1oetokh9i")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(422)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun accountsCreate429() {
        val accountService = client.accounts()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(429).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<RateLimitException> {
                accountService.create(
                    AccountCreateParams.builder()
                        .name("New Account!")
                        .entityId("entity_n8y8tnk2p9339ti393yi")
                        .informationalEntityId("informational_entity_id")
                        .programId("program_i2v2os4mwza1oetokh9i")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(429)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun accountsCreate500() {
        val accountService = client.accounts()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(500).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<InternalServerException> {
                accountService.create(
                    AccountCreateParams.builder()
                        .name("New Account!")
                        .entityId("entity_n8y8tnk2p9339ti393yi")
                        .informationalEntityId("informational_entity_id")
                        .programId("program_i2v2os4mwza1oetokh9i")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(500)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun accountsCreate999() {
        val accountService = client.accounts()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(999).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnexpectedStatusCodeException> {
                accountService.create(
                    AccountCreateParams.builder()
                        .name("New Account!")
                        .entityId("entity_n8y8tnk2p9339ti393yi")
                        .informationalEntityId("informational_entity_id")
                        .programId("program_i2v2os4mwza1oetokh9i")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(999)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun accountsCreateInvalidJsonBody() {
        val accountService = client.accounts()
        stubFor(
            post(anyUrl())
                .willReturn(status(200).withHeader(HEADER_NAME, HEADER_VALUE).withBody(NOT_JSON))
        )

        val e =
            assertThrows<IncreaseException> {
                accountService.create(
                    AccountCreateParams.builder()
                        .name("New Account!")
                        .entityId("entity_n8y8tnk2p9339ti393yi")
                        .informationalEntityId("informational_entity_id")
                        .programId("program_i2v2os4mwza1oetokh9i")
                        .build()
                )
            }

        assertThat(e).hasMessage("Error reading response")
    }

    private fun Headers.toMap(): Map<String, List<String>> =
        mutableMapOf<String, List<String>>().also { map ->
            names().forEach { map[it] = values(it) }
        }
}
