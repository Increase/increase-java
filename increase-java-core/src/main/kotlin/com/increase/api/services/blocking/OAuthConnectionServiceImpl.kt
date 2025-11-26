// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

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
import com.increase.api.core.http.parseable
import com.increase.api.core.prepare
import com.increase.api.models.oauthconnections.OAuthConnection
import com.increase.api.models.oauthconnections.OAuthConnectionListParams
import com.increase.api.models.oauthconnections.OAuthConnectionListResponse
import com.increase.api.models.oauthconnections.OAuthConnectionRetrieveParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class OAuthConnectionServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    OAuthConnectionService {

    private val withRawResponse: OAuthConnectionService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): OAuthConnectionService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): OAuthConnectionService =
        OAuthConnectionServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: OAuthConnectionRetrieveParams,
        requestOptions: RequestOptions,
    ): OAuthConnection =
        // get /oauth_connections/{oauth_connection_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: OAuthConnectionListParams,
        requestOptions: RequestOptions,
    ): OAuthConnectionListResponse =
        // get /oauth_connections
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        OAuthConnectionService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): OAuthConnectionService.WithRawResponse =
            OAuthConnectionServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<OAuthConnection> =
            jsonHandler<OAuthConnection>(clientOptions.jsonMapper)

        override fun retrieve(
            params: OAuthConnectionRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OAuthConnection> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("oauthConnectionId", params.oauthConnectionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("oauth_connections", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<OAuthConnectionListResponse> =
            jsonHandler<OAuthConnectionListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: OAuthConnectionListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OAuthConnectionListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("oauth_connections")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
