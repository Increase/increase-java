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
import com.increase.api.models.lockboxes.Lockbox
import com.increase.api.models.lockboxes.LockboxCreateParams
import com.increase.api.models.lockboxes.LockboxListPageAsync
import com.increase.api.models.lockboxes.LockboxListPageResponse
import com.increase.api.models.lockboxes.LockboxListParams
import com.increase.api.models.lockboxes.LockboxRetrieveParams
import com.increase.api.models.lockboxes.LockboxUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class LockboxServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    LockboxServiceAsync {

    private val withRawResponse: LockboxServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): LockboxServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): LockboxServiceAsync =
        LockboxServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: LockboxCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Lockbox> =
        // post /lockboxes
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: LockboxRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Lockbox> =
        // get /lockboxes/{lockbox_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: LockboxUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Lockbox> =
        // patch /lockboxes/{lockbox_id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: LockboxListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<LockboxListPageAsync> =
        // get /lockboxes
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LockboxServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LockboxServiceAsync.WithRawResponse =
            LockboxServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<Lockbox> = jsonHandler<Lockbox>(clientOptions.jsonMapper)

        override fun create(
            params: LockboxCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Lockbox>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("lockboxes")
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

        private val retrieveHandler: Handler<Lockbox> =
            jsonHandler<Lockbox>(clientOptions.jsonMapper)

        override fun retrieve(
            params: LockboxRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Lockbox>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("lockboxId", params.lockboxId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("lockboxes", params._pathParam(0))
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

        private val updateHandler: Handler<Lockbox> = jsonHandler<Lockbox>(clientOptions.jsonMapper)

        override fun update(
            params: LockboxUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Lockbox>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("lockboxId", params.lockboxId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("lockboxes", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<LockboxListPageResponse> =
            jsonHandler<LockboxListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: LockboxListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LockboxListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("lockboxes")
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
                                LockboxListPageAsync.builder()
                                    .service(LockboxServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }
    }
}
