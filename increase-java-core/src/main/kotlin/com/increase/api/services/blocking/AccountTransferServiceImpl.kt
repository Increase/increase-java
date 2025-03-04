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
import com.increase.api.core.json
import com.increase.api.core.prepare
import com.increase.api.errors.IncreaseError
import com.increase.api.models.AccountTransfer
import com.increase.api.models.AccountTransferApproveParams
import com.increase.api.models.AccountTransferCancelParams
import com.increase.api.models.AccountTransferCreateParams
import com.increase.api.models.AccountTransferListPage
import com.increase.api.models.AccountTransferListParams
import com.increase.api.models.AccountTransferRetrieveParams

class AccountTransferServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AccountTransferService {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<AccountTransfer> =
        jsonHandler<AccountTransfer>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create an Account Transfer */
    override fun create(
        params: AccountTransferCreateParams,
        requestOptions: RequestOptions,
    ): AccountTransfer {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("account_transfers")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { createHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation!!) {
                    it.validate()
                }
            }
    }

    private val retrieveHandler: Handler<AccountTransfer> =
        jsonHandler<AccountTransfer>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Retrieve an Account Transfer */
    override fun retrieve(
        params: AccountTransferRetrieveParams,
        requestOptions: RequestOptions,
    ): AccountTransfer {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("account_transfers", params.getPathParam(0))
                .build()
                .prepare(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { retrieveHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation!!) {
                    it.validate()
                }
            }
    }

    private val listHandler: Handler<AccountTransferListPage.Response> =
        jsonHandler<AccountTransferListPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List Account Transfers */
    override fun list(
        params: AccountTransferListParams,
        requestOptions: RequestOptions,
    ): AccountTransferListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("account_transfers")
                .build()
                .prepare(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { listHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation!!) {
                    it.validate()
                }
            }
            .let { AccountTransferListPage.of(this, params, it) }
    }

    private val approveHandler: Handler<AccountTransfer> =
        jsonHandler<AccountTransfer>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Approve an Account Transfer */
    override fun approve(
        params: AccountTransferApproveParams,
        requestOptions: RequestOptions,
    ): AccountTransfer {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("account_transfers", params.getPathParam(0), "approve")
                .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                .build()
                .prepare(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { approveHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation!!) {
                    it.validate()
                }
            }
    }

    private val cancelHandler: Handler<AccountTransfer> =
        jsonHandler<AccountTransfer>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Cancel an Account Transfer */
    override fun cancel(
        params: AccountTransferCancelParams,
        requestOptions: RequestOptions,
    ): AccountTransfer {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("account_transfers", params.getPathParam(0), "cancel")
                .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                .build()
                .prepare(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { cancelHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation!!) {
                    it.validate()
                }
            }
    }
}
