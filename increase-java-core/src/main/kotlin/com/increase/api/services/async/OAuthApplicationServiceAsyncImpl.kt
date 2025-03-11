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
import com.increase.api.models.oauthapplications.OAuthApplication
import com.increase.api.models.oauthapplications.OAuthApplicationListPage
import com.increase.api.models.oauthapplications.OAuthApplicationListPageAsync
import com.increase.api.models.oauthapplications.OAuthApplicationListParams
import com.increase.api.models.oauthapplications.OAuthApplicationRetrieveParams
import java.util.concurrent.CompletableFuture

class OAuthApplicationServiceAsyncImpl internal constructor(
    private val clientOptions: ClientOptions,

) : OAuthApplicationServiceAsync {

    private val withRawResponse: OAuthApplicationServiceAsync.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): OAuthApplicationServiceAsync.WithRawResponse = withRawResponse

    override fun retrieve(params: OAuthApplicationRetrieveParams, requestOptions: RequestOptions): CompletableFuture<OAuthApplication> =
        // get /oauth_applications/{oauth_application_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(params: OAuthApplicationListParams, requestOptions: RequestOptions): CompletableFuture<OAuthApplicationListPageAsync> =
        // get /oauth_applications
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : OAuthApplicationServiceAsync.WithRawResponse {

        private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

        private val retrieveHandler: Handler<OAuthApplication> = jsonHandler<OAuthApplication>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(params: OAuthApplicationRetrieveParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<OAuthApplication>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .addPathSegments("oauth_applications", params.getPathParam(0))
            .build()
            .prepareAsync(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          return request.thenComposeAsync { clientOptions.httpClient.executeAsync(
            it, requestOptions
          ) }.thenApply { response -> response.parseable {
              response.use {
                  retrieveHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
          } }
        }

        private val listHandler: Handler<OAuthApplicationListPageAsync.Response> = jsonHandler<OAuthApplicationListPageAsync.Response>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun list(params: OAuthApplicationListParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<OAuthApplicationListPageAsync>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .addPathSegments("oauth_applications")
            .build()
            .prepareAsync(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          return request.thenComposeAsync { clientOptions.httpClient.executeAsync(
            it, requestOptions
          ) }.thenApply { response -> response.parseable {
              response.use {
                  listHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
              .let {
                  OAuthApplicationListPageAsync.of(OAuthApplicationServiceAsyncImpl(clientOptions), params, it)
              }
          } }
        }
    }
}
