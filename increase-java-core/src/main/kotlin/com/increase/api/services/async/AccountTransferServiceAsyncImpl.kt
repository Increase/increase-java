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
import com.increase.api.models.accounttransfers.AccountTransfer
import com.increase.api.models.accounttransfers.AccountTransferApproveParams
import com.increase.api.models.accounttransfers.AccountTransferCancelParams
import com.increase.api.models.accounttransfers.AccountTransferCreateParams
import com.increase.api.models.accounttransfers.AccountTransferListPageAsync
import com.increase.api.models.accounttransfers.AccountTransferListPageResponse
import com.increase.api.models.accounttransfers.AccountTransferListParams
import com.increase.api.models.accounttransfers.AccountTransferRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class AccountTransferServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : AccountTransferServiceAsync {

    private val withRawResponse: AccountTransferServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AccountTransferServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): AccountTransferServiceAsync =
        AccountTransferServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: AccountTransferCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AccountTransfer> =
        // post /account_transfers
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: AccountTransferRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AccountTransfer> =
        // get /account_transfers/{account_transfer_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: AccountTransferListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AccountTransferListPageAsync> =
        // get /account_transfers
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun approve(
        params: AccountTransferApproveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AccountTransfer> =
        // post /account_transfers/{account_transfer_id}/approve
        withRawResponse().approve(params, requestOptions).thenApply { it.parse() }

    override fun cancel(
        params: AccountTransferCancelParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AccountTransfer> =
        // post /account_transfers/{account_transfer_id}/cancel
        withRawResponse().cancel(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AccountTransferServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AccountTransferServiceAsync.WithRawResponse =
            AccountTransferServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<AccountTransfer> =
            jsonHandler<AccountTransfer>(clientOptions.jsonMapper)

        override fun create(
            params: AccountTransferCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AccountTransfer>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("account_transfers")
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

        private val retrieveHandler: Handler<AccountTransfer> =
            jsonHandler<AccountTransfer>(clientOptions.jsonMapper)

        override fun retrieve(
            params: AccountTransferRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AccountTransfer>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("accountTransferId", params.accountTransferId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("account_transfers", params._pathParam(0))
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

        private val listHandler: Handler<AccountTransferListPageResponse> =
            jsonHandler<AccountTransferListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: AccountTransferListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AccountTransferListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("account_transfers")
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
                                AccountTransferListPageAsync.builder()
                                    .service(AccountTransferServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val approveHandler: Handler<AccountTransfer> =
            jsonHandler<AccountTransfer>(clientOptions.jsonMapper)

        override fun approve(
            params: AccountTransferApproveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AccountTransfer>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("accountTransferId", params.accountTransferId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("account_transfers", params._pathParam(0), "approve")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { approveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val cancelHandler: Handler<AccountTransfer> =
            jsonHandler<AccountTransfer>(clientOptions.jsonMapper)

        override fun cancel(
            params: AccountTransferCancelParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AccountTransfer>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("accountTransferId", params.accountTransferId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("account_transfers", params._pathParam(0), "cancel")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { cancelHandler.handle(it) }
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
