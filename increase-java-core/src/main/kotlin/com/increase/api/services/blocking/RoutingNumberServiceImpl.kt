// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.core.ClientOptions
import com.increase.api.core.JsonValue
import com.increase.api.core.RequestOptions
import com.increase.api.core.handlers.errorHandler
import com.increase.api.core.handlers.jsonHandler
import com.increase.api.core.handlers.withErrorHandler
import com.increase.api.core.http.HttpMethod
import com.increase.api.core.http.HttpRequest
import com.increase.api.core.http.HttpResponse.Handler
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.core.http.parseable
import com.increase.api.core.prepare
import com.increase.api.models.routingnumbers.RoutingNumberListPage
import com.increase.api.models.routingnumbers.RoutingNumberListPageResponse
import com.increase.api.models.routingnumbers.RoutingNumberListParams
import java.util.function.Consumer

class RoutingNumberServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    RoutingNumberService {

    private val withRawResponse: RoutingNumberService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): RoutingNumberService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RoutingNumberService =
        RoutingNumberServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: RoutingNumberListParams,
        requestOptions: RequestOptions,
    ): RoutingNumberListPage =
        // get /routing_numbers
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RoutingNumberService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RoutingNumberService.WithRawResponse =
            RoutingNumberServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<RoutingNumberListPageResponse> =
            jsonHandler<RoutingNumberListPageResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: RoutingNumberListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RoutingNumberListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("routing_numbers")
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
                        RoutingNumberListPage.builder()
                            .service(RoutingNumberServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
