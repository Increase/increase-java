// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.handlers.errorHandler
import com.increase.api.core.handlers.jsonHandler
import com.increase.api.core.handlers.withErrorHandler
import com.increase.api.core.http.HttpMethod
import com.increase.api.core.http.HttpRequest
import com.increase.api.core.http.HttpResponse.Handler
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.core.http.parseable
import com.increase.api.core.prepare
import com.increase.api.errors.IncreaseError
import com.increase.api.models.PendingTransaction
import com.increase.api.models.PendingTransactionListPage
import com.increase.api.models.PendingTransactionListParams
import com.increase.api.models.PendingTransactionRetrieveParams

class PendingTransactionServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    PendingTransactionService {

    private val withRawResponse: PendingTransactionService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PendingTransactionService.WithRawResponse = withRawResponse

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

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PendingTransactionService.WithRawResponse {

        private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

        private val retrieveHandler: Handler<PendingTransaction> =
            jsonHandler<PendingTransaction>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: PendingTransactionRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PendingTransaction> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("pending_transactions", params.getPathParam(0))
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

        private val listHandler: Handler<PendingTransactionListPage.Response> =
            jsonHandler<PendingTransactionListPage.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: PendingTransactionListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PendingTransactionListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
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
                        PendingTransactionListPage.of(
                            PendingTransactionServiceImpl(clientOptions),
                            params,
                            it,
                        )
                    }
            }
        }
    }
}
