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
import com.increase.api.models.groups.Group
import com.increase.api.models.groups.GroupRetrieveParams
import java.util.concurrent.CompletableFuture

class GroupServiceAsyncImpl internal constructor(
    private val clientOptions: ClientOptions,

) : GroupServiceAsync {

    private val withRawResponse: GroupServiceAsync.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): GroupServiceAsync.WithRawResponse = withRawResponse

    override fun retrieve(params: GroupRetrieveParams, requestOptions: RequestOptions): CompletableFuture<Group> =
        // get /groups/current
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : GroupServiceAsync.WithRawResponse {

        private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

        private val retrieveHandler: Handler<Group> = jsonHandler<Group>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(params: GroupRetrieveParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<Group>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .addPathSegments("groups", "current")
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
    }
}
