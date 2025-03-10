// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

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
import com.increase.api.core.prepareAsync
import com.increase.api.errors.IncreaseError
import com.increase.api.models.intrafibalances.IntrafiBalance
import com.increase.api.models.intrafibalances.IntrafiBalanceIntrafiBalanceParams
import java.util.concurrent.CompletableFuture

class IntrafiBalanceServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : IntrafiBalanceServiceAsync {

    private val withRawResponse: IntrafiBalanceServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): IntrafiBalanceServiceAsync.WithRawResponse = withRawResponse

    override fun intrafiBalance(
        params: IntrafiBalanceIntrafiBalanceParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<IntrafiBalance> =
        // get /accounts/{account_id}/intrafi_balance
        withRawResponse().intrafiBalance(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        IntrafiBalanceServiceAsync.WithRawResponse {

        private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

        private val intrafiBalanceHandler: Handler<IntrafiBalance> =
            jsonHandler<IntrafiBalance>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun intrafiBalance(
            params: IntrafiBalanceIntrafiBalanceParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<IntrafiBalance>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("accounts", params.getPathParam(0), "intrafi_balance")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { intrafiBalanceHandler.handle(it) }
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
