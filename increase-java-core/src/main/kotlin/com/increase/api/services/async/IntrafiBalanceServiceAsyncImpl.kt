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
import com.increase.api.core.prepareAsync
import com.increase.api.errors.IncreaseError
import com.increase.api.models.IntrafiBalance
import com.increase.api.models.IntrafiBalanceIntrafiBalanceParams
import java.util.concurrent.CompletableFuture

class IntrafiBalanceServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : IntrafiBalanceServiceAsync {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val intrafiBalanceHandler: Handler<IntrafiBalance> =
        jsonHandler<IntrafiBalance>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get IntraFi balances by bank */
    override fun intrafiBalance(
        params: IntrafiBalanceIntrafiBalanceParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<IntrafiBalance> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("accounts", params.getPathParam(0), "intrafi_balance")
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { intrafiBalanceHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }
}
