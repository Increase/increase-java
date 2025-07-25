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
import com.increase.api.models.bookkeepingaccounts.BookkeepingAccount
import com.increase.api.models.bookkeepingaccounts.BookkeepingAccountBalanceParams
import com.increase.api.models.bookkeepingaccounts.BookkeepingAccountCreateParams
import com.increase.api.models.bookkeepingaccounts.BookkeepingAccountListPageAsync
import com.increase.api.models.bookkeepingaccounts.BookkeepingAccountListPageResponse
import com.increase.api.models.bookkeepingaccounts.BookkeepingAccountListParams
import com.increase.api.models.bookkeepingaccounts.BookkeepingAccountUpdateParams
import com.increase.api.models.bookkeepingaccounts.BookkeepingBalanceLookup
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class BookkeepingAccountServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : BookkeepingAccountServiceAsync {

    private val withRawResponse: BookkeepingAccountServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BookkeepingAccountServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): BookkeepingAccountServiceAsync =
        BookkeepingAccountServiceAsyncImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    override fun create(
        params: BookkeepingAccountCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BookkeepingAccount> =
        // post /bookkeeping_accounts
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: BookkeepingAccountUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BookkeepingAccount> =
        // patch /bookkeeping_accounts/{bookkeeping_account_id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: BookkeepingAccountListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BookkeepingAccountListPageAsync> =
        // get /bookkeeping_accounts
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun balance(
        params: BookkeepingAccountBalanceParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BookkeepingBalanceLookup> =
        // get /bookkeeping_accounts/{bookkeeping_account_id}/balance
        withRawResponse().balance(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BookkeepingAccountServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BookkeepingAccountServiceAsync.WithRawResponse =
            BookkeepingAccountServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<BookkeepingAccount> =
            jsonHandler<BookkeepingAccount>(clientOptions.jsonMapper)

        override fun create(
            params: BookkeepingAccountCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BookkeepingAccount>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("bookkeeping_accounts")
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

        private val updateHandler: Handler<BookkeepingAccount> =
            jsonHandler<BookkeepingAccount>(clientOptions.jsonMapper)

        override fun update(
            params: BookkeepingAccountUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BookkeepingAccount>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("bookkeepingAccountId", params.bookkeepingAccountId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("bookkeeping_accounts", params._pathParam(0))
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

        private val listHandler: Handler<BookkeepingAccountListPageResponse> =
            jsonHandler<BookkeepingAccountListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: BookkeepingAccountListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BookkeepingAccountListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("bookkeeping_accounts")
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
                                BookkeepingAccountListPageAsync.builder()
                                    .service(BookkeepingAccountServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val balanceHandler: Handler<BookkeepingBalanceLookup> =
            jsonHandler<BookkeepingBalanceLookup>(clientOptions.jsonMapper)

        override fun balance(
            params: BookkeepingAccountBalanceParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BookkeepingBalanceLookup>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("bookkeepingAccountId", params.bookkeepingAccountId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("bookkeeping_accounts", params._pathParam(0), "balance")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { balanceHandler.handle(it) }
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
