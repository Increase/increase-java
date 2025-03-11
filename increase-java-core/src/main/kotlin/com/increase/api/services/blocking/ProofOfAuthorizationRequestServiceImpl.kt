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
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.core.http.parseable
import com.increase.api.core.prepare
import com.increase.api.errors.IncreaseError
import com.increase.api.models.proofofauthorizationrequests.ProofOfAuthorizationRequest
import com.increase.api.models.proofofauthorizationrequests.ProofOfAuthorizationRequestListPage
import com.increase.api.models.proofofauthorizationrequests.ProofOfAuthorizationRequestListParams
import com.increase.api.models.proofofauthorizationrequests.ProofOfAuthorizationRequestRetrieveParams

class ProofOfAuthorizationRequestServiceImpl internal constructor(
    private val clientOptions: ClientOptions,

) : ProofOfAuthorizationRequestService {

    private val withRawResponse: ProofOfAuthorizationRequestService.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): ProofOfAuthorizationRequestService.WithRawResponse = withRawResponse

    override fun retrieve(params: ProofOfAuthorizationRequestRetrieveParams, requestOptions: RequestOptions): ProofOfAuthorizationRequest =
        // get /proof_of_authorization_requests/{proof_of_authorization_request_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(params: ProofOfAuthorizationRequestListParams, requestOptions: RequestOptions): ProofOfAuthorizationRequestListPage =
        // get /proof_of_authorization_requests
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : ProofOfAuthorizationRequestService.WithRawResponse {

        private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

        private val retrieveHandler: Handler<ProofOfAuthorizationRequest> = jsonHandler<ProofOfAuthorizationRequest>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(params: ProofOfAuthorizationRequestRetrieveParams, requestOptions: RequestOptions): HttpResponseFor<ProofOfAuthorizationRequest> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .addPathSegments("proof_of_authorization_requests", params.getPathParam(0))
            .build()
            .prepare(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          val response = clientOptions.httpClient.execute(
            request, requestOptions
          )
          return response.parseable {
              response.use {
                  retrieveHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
          }
        }

        private val listHandler: Handler<ProofOfAuthorizationRequestListPage.Response> = jsonHandler<ProofOfAuthorizationRequestListPage.Response>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun list(params: ProofOfAuthorizationRequestListParams, requestOptions: RequestOptions): HttpResponseFor<ProofOfAuthorizationRequestListPage> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .addPathSegments("proof_of_authorization_requests")
            .build()
            .prepare(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          val response = clientOptions.httpClient.execute(
            request, requestOptions
          )
          return response.parseable {
              response.use {
                  listHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
              .let {
                  ProofOfAuthorizationRequestListPage.of(ProofOfAuthorizationRequestServiceImpl(clientOptions), params, it)
              }
          }
        }
    }
}
