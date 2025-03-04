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
import com.increase.api.core.prepare
import com.increase.api.errors.IncreaseError
import com.increase.api.models.OAuthApplication
import com.increase.api.models.OAuthApplicationListPage
import com.increase.api.models.OAuthApplicationListParams
import com.increase.api.models.OAuthApplicationRetrieveParams

class OAuthApplicationServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    OAuthApplicationService {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<OAuthApplication> =
        jsonHandler<OAuthApplication>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Retrieve an OAuth Application */
    override fun retrieve(
        params: OAuthApplicationRetrieveParams,
        requestOptions: RequestOptions,
    ): OAuthApplication {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("oauth_applications", params.getPathParam(0))
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

    private val listHandler: Handler<OAuthApplicationListPage.Response> =
        jsonHandler<OAuthApplicationListPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List OAuth Applications */
    override fun list(
        params: OAuthApplicationListParams,
        requestOptions: RequestOptions,
    ): OAuthApplicationListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("oauth_applications")
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
            .let { OAuthApplicationListPage.of(this, params, it) }
    }
}
