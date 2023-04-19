package com.increase.api.services.blocking

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpMethod
import com.increase.api.core.http.HttpRequest
import com.increase.api.core.http.HttpResponse.Handler
import com.increase.api.errors.IncreaseError
import com.increase.api.models.BalanceLookupLookupParams
import com.increase.api.models.BalanceLookupLookupResponse
import com.increase.api.services.errorHandler
import com.increase.api.services.json
import com.increase.api.services.jsonHandler
import com.increase.api.services.withErrorHandler

class BalanceLookupServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : BalanceLookupService {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val lookupHandler: Handler<BalanceLookupLookupResponse> =
        jsonHandler<BalanceLookupLookupResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Look up the balance for an Account */
    override fun lookup(
        params: BalanceLookupLookupParams,
        requestOptions: RequestOptions
    ): BalanceLookupLookupResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("balance_lookups")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .let { lookupHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
