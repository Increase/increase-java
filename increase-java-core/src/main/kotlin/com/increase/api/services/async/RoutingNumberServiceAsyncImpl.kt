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
import com.increase.api.models.RoutingNumberListPageAsync
import com.increase.api.models.RoutingNumberListParams
import java.util.concurrent.CompletableFuture

class RoutingNumberServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    RoutingNumberServiceAsync {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val listHandler: Handler<RoutingNumberListPageAsync.Response> =
        jsonHandler<RoutingNumberListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * You can use this API to confirm if a routing number is valid, such as when a user is
     * providing you with bank account details. Since routing numbers uniquely identify a bank, this
     * will always return 0 or 1 entry. In Sandbox, the only valid routing number for this method
     * is 110000000.
     */
    override fun list(
        params: RoutingNumberListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RoutingNumberListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("routing_numbers")
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
                    .let { RoutingNumberListPageAsync.of(this, params, it) }
            }
    }
}
