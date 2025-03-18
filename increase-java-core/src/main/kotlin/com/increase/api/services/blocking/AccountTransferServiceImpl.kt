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
import com.increase.api.core.http.json
import com.increase.api.core.http.parseable
import com.increase.api.core.prepare
import com.increase.api.errors.IncreaseError
import com.increase.api.models.accounttransfers.AccountTransfer
import com.increase.api.models.accounttransfers.AccountTransferApproveParams
import com.increase.api.models.accounttransfers.AccountTransferCancelParams
import com.increase.api.models.accounttransfers.AccountTransferCreateParams
import com.increase.api.models.accounttransfers.AccountTransferListPage
import com.increase.api.models.accounttransfers.AccountTransferListParams
import com.increase.api.models.accounttransfers.AccountTransferRetrieveParams

class AccountTransferServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AccountTransferService {

    private val withRawResponse: AccountTransferService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AccountTransferService.WithRawResponse = withRawResponse

    override fun create(
        params: AccountTransferCreateParams,
        requestOptions: RequestOptions,
    ): AccountTransfer =
        // post /account_transfers
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: AccountTransferRetrieveParams,
        requestOptions: RequestOptions,
    ): AccountTransfer =
        // get /account_transfers/{account_transfer_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: AccountTransferListParams,
        requestOptions: RequestOptions,
    ): AccountTransferListPage =
        // get /account_transfers
        withRawResponse().list(params, requestOptions).parse()

    override fun approve(
        params: AccountTransferApproveParams,
        requestOptions: RequestOptions,
    ): AccountTransfer =
        // post /account_transfers/{account_transfer_id}/approve
        withRawResponse().approve(params, requestOptions).parse()

    override fun cancel(
        params: AccountTransferCancelParams,
        requestOptions: RequestOptions,
    ): AccountTransfer =
        // post /account_transfers/{account_transfer_id}/cancel
        withRawResponse().cancel(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AccountTransferService.WithRawResponse {

        private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<AccountTransfer> =
            jsonHandler<AccountTransfer>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: AccountTransferCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountTransfer> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("account_transfers")
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

        private val retrieveHandler: Handler<AccountTransfer> =
            jsonHandler<AccountTransfer>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: AccountTransferRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountTransfer> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("account_transfers", params._pathParam(0))
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

        private val listHandler: Handler<AccountTransferListPage.Response> =
            jsonHandler<AccountTransferListPage.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: AccountTransferListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountTransferListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("account_transfers")
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
                        AccountTransferListPage.of(
                            AccountTransferServiceImpl(clientOptions),
                            params,
                            it,
                        )
                    }
            }
        }

        private val approveHandler: Handler<AccountTransfer> =
            jsonHandler<AccountTransfer>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun approve(
            params: AccountTransferApproveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountTransfer> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("account_transfers", params._pathParam(0), "approve")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { approveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val cancelHandler: Handler<AccountTransfer> =
            jsonHandler<AccountTransfer>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun cancel(
            params: AccountTransferCancelParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountTransfer> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("account_transfers", params._pathParam(0), "cancel")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
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
