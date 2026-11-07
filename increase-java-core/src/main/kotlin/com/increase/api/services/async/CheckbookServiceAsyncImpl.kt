// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.checkRequired
import com.increase.api.core.handlers.errorBodyHandler
import com.increase.api.core.handlers.errorHandler
import com.increase.api.core.handlers.jsonHandler
import com.increase.api.core.http.HttpMethod
import com.increase.api.core.http.HttpRequest
import com.increase.api.core.http.HttpResponse
import com.increase.api.core.http.HttpResponse.Handler
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.core.http.json
import com.increase.api.core.http.parseable
import com.increase.api.core.prepareAsync
import com.increase.api.models.checkbooks.Checkbook
import com.increase.api.models.checkbooks.CheckbookCreateParams
import com.increase.api.models.checkbooks.CheckbookListPageAsync
import com.increase.api.models.checkbooks.CheckbookListPageResponse
import com.increase.api.models.checkbooks.CheckbookListParams
import com.increase.api.models.checkbooks.CheckbookRetrieveParams
import com.increase.api.models.checkbooks.CheckbookStopParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class CheckbookServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CheckbookServiceAsync {

    private val withRawResponse: CheckbookServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CheckbookServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CheckbookServiceAsync =
        CheckbookServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: CheckbookCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Checkbook> =
        // post /checkbooks
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: CheckbookRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Checkbook> =
        // get /checkbooks/{checkbook_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: CheckbookListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CheckbookListPageAsync> =
        // get /checkbooks
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun stop(
        params: CheckbookStopParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Checkbook> =
        // post /checkbooks/{checkbook_id}/stop
        withRawResponse().stop(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CheckbookServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CheckbookServiceAsync.WithRawResponse =
            CheckbookServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<Checkbook> =
            jsonHandler<Checkbook>(clientOptions.jsonMapper)

        override fun create(
            params: CheckbookCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Checkbook>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("checkbooks")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveHandler: Handler<Checkbook> =
            jsonHandler<Checkbook>(clientOptions.jsonMapper)

        override fun retrieve(
            params: CheckbookRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Checkbook>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("checkbookId", params.checkbookId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("checkbooks", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<CheckbookListPageResponse> =
            jsonHandler<CheckbookListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: CheckbookListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CheckbookListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("checkbooks")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                CheckbookListPageAsync.builder()
                                    .service(CheckbookServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val stopHandler: Handler<Checkbook> =
            jsonHandler<Checkbook>(clientOptions.jsonMapper)

        override fun stop(
            params: CheckbookStopParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Checkbook>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("checkbookId", params.checkbookId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("checkbooks", params._pathParam(0), "stop")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { stopHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }
    }
}
