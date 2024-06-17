// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpMethod
import com.increase.api.core.http.HttpRequest
import com.increase.api.core.http.HttpResponse.Handler
import com.increase.api.errors.IncreaseError
import com.increase.api.models.Group
import com.increase.api.models.GroupRetrieveDetailsParams
import com.increase.api.services.errorHandler
import com.increase.api.services.jsonHandler
import com.increase.api.services.withErrorHandler
import java.util.concurrent.CompletableFuture

class GroupServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : GroupServiceAsync {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveDetailsHandler: Handler<Group> =
        jsonHandler<Group>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Returns details for the currently authenticated Group. */
    override fun retrieveDetails(
        params: GroupRetrieveDetailsParams,
        requestOptions: RequestOptions
    ): CompletableFuture<Group> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("groups", "current")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { retrieveDetailsHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
