package com.increase.api.services.blocking

import com.fasterxml.jackson.databind.json.JsonMapper
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import kotlin.LazyThreadSafetyMode.PUBLICATION
import java.time.LocalDate
import java.time.Duration
import java.time.OffsetDateTime
import java.util.Base64
import java.util.Optional
import java.util.UUID
import java.util.concurrent.CompletableFuture
import java.util.stream.Stream
import com.increase.api.core.NoAutoDetect
import com.increase.api.errors.IncreaseInvalidDataException
import com.increase.api.models.RoutingNumber
import com.increase.api.models.RoutingNumberListPage
import com.increase.api.models.RoutingNumberListParams
import com.increase.api.core.ClientOptions
import com.increase.api.core.http.HttpMethod
import com.increase.api.core.http.HttpRequest
import com.increase.api.core.http.HttpResponse.Handler
import com.increase.api.core.JsonField
import com.increase.api.core.RequestOptions
import com.increase.api.errors.IncreaseError
import com.increase.api.services.emptyHandler
import com.increase.api.services.errorHandler
import com.increase.api.services.json
import com.increase.api.services.jsonHandler
import com.increase.api.services.stringHandler
import com.increase.api.services.withErrorHandler

class RoutingNumberServiceImpl constructor(private val clientOptions: ClientOptions,) : RoutingNumberService {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val listHandler: Handler<RoutingNumberListPage.Response> =
    jsonHandler<RoutingNumberListPage.Response>(clientOptions.jsonMapper)
    .withErrorHandler(errorHandler)

    /**
     * You can use this API to confirm if a routing number is valid, such as when a
     * user is providing you with bank account details. Since routing numbers uniquely
     * identify a bank, this will always return 0 or 1 entry. In Sandbox, the only
     * valid routing number for this method is 110000000.
     */
    override fun list(
        params: RoutingNumberListParams,
        requestOptions: RequestOptions
    ): RoutingNumberListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("routing_numbers")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .let { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
                .let { RoutingNumberListPage.of(this, params, it) }
        }
    }
}
