// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.core.ClientOptions
import com.increase.api.core.JsonValue
import com.increase.api.core.RequestOptions
import com.increase.api.core.checkRequired
import com.increase.api.core.handlers.errorHandler
import com.increase.api.core.handlers.jsonHandler
import com.increase.api.core.handlers.withErrorHandler
import com.increase.api.core.http.HttpMethod
import com.increase.api.core.http.HttpRequest
import com.increase.api.core.http.HttpResponse.Handler
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.core.http.json
import com.increase.api.core.http.parseable
import com.increase.api.core.prepare
import com.increase.api.models.pendingtransactions.PendingTransaction
import com.increase.api.models.pendingtransactions.PendingTransactionCreateParams
import com.increase.api.models.pendingtransactions.PendingTransactionListPage
import com.increase.api.models.pendingtransactions.PendingTransactionListPageResponse
import com.increase.api.models.pendingtransactions.PendingTransactionListParams
import com.increase.api.models.pendingtransactions.PendingTransactionReleaseParams
import com.increase.api.models.pendingtransactions.PendingTransactionRetrieveParams
import kotlin.jvm.optionals.getOrNull

class PendingTransactionServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    PendingTransactionService {

    private val withRawResponse: PendingTransactionService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PendingTransactionService.WithRawResponse = withRawResponse

    override fun create(
        params: PendingTransactionCreateParams,
        requestOptions: RequestOptions,
    ): PendingTransaction =
        // post /pending_transactions
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: PendingTransactionRetrieveParams,
        requestOptions: RequestOptions,
    ): PendingTransaction =
        // get /pending_transactions/{pending_transaction_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: PendingTransactionListParams,
        requestOptions: RequestOptions,
    ): PendingTransactionListPage =
        // get /pending_transactions
        withRawResponse().list(params, requestOptions).parse()

    override fun release(
        params: PendingTransactionReleaseParams,
        requestOptions: RequestOptions,
    ): PendingTransaction =
        // post /pending_transactions/{pending_transaction_id}/release
        withRawResponse().release(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PendingTransactionService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<PendingTransaction> =
            jsonHandler<PendingTransaction>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: PendingTransactionCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PendingTransaction> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("pending_transactions")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<PendingTransaction> =
            jsonHandler<PendingTransaction>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: PendingTransactionRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PendingTransaction> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pendingTransactionId", params.pendingTransactionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("pending_transactions", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<PendingTransactionListPageResponse> =
            jsonHandler<PendingTransactionListPageResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: PendingTransactionListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PendingTransactionListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("pending_transactions")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        PendingTransactionListPage.builder()
                            .service(PendingTransactionServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val releaseHandler: Handler<PendingTransaction> =
            jsonHandler<PendingTransaction>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun release(
            params: PendingTransactionReleaseParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PendingTransaction> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pendingTransactionId", params.pendingTransactionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("pending_transactions", params._pathParam(0), "release")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { releaseHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
