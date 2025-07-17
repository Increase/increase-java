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
import com.increase.api.models.externalaccounts.ExternalAccount
import com.increase.api.models.externalaccounts.ExternalAccountCreateParams
import com.increase.api.models.externalaccounts.ExternalAccountListPageAsync
import com.increase.api.models.externalaccounts.ExternalAccountListPageResponse
import com.increase.api.models.externalaccounts.ExternalAccountListParams
import com.increase.api.models.externalaccounts.ExternalAccountRetrieveParams
import com.increase.api.models.externalaccounts.ExternalAccountUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ExternalAccountServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : ExternalAccountServiceAsync {

    private val withRawResponse: ExternalAccountServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ExternalAccountServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): ExternalAccountServiceAsync =
        ExternalAccountServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: ExternalAccountCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExternalAccount> =
        // post /external_accounts
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: ExternalAccountRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExternalAccount> =
        // get /external_accounts/{external_account_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: ExternalAccountUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExternalAccount> =
        // patch /external_accounts/{external_account_id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: ExternalAccountListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExternalAccountListPageAsync> =
        // get /external_accounts
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ExternalAccountServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ExternalAccountServiceAsync.WithRawResponse =
            ExternalAccountServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<ExternalAccount> =
            jsonHandler<ExternalAccount>(clientOptions.jsonMapper)

        override fun create(
            params: ExternalAccountCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExternalAccount>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("external_accounts")
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

        private val retrieveHandler: Handler<ExternalAccount> =
            jsonHandler<ExternalAccount>(clientOptions.jsonMapper)

        override fun retrieve(
            params: ExternalAccountRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExternalAccount>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("externalAccountId", params.externalAccountId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("external_accounts", params._pathParam(0))
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

        private val updateHandler: Handler<ExternalAccount> =
            jsonHandler<ExternalAccount>(clientOptions.jsonMapper)

        override fun update(
            params: ExternalAccountUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExternalAccount>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("externalAccountId", params.externalAccountId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("external_accounts", params._pathParam(0))
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

        private val listHandler: Handler<ExternalAccountListPageResponse> =
            jsonHandler<ExternalAccountListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: ExternalAccountListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExternalAccountListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("external_accounts")
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
                                ExternalAccountListPageAsync.builder()
                                    .service(ExternalAccountServiceAsyncImpl(clientOptions))
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
