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
import com.increase.api.models.digitalwallettokenrequests.DigitalWalletTokenRequest
import com.increase.api.models.digitalwallettokenrequests.DigitalWalletTokenRequestListPage
import com.increase.api.models.digitalwallettokenrequests.DigitalWalletTokenRequestListPageResponse
import com.increase.api.models.digitalwallettokenrequests.DigitalWalletTokenRequestListParams
import com.increase.api.models.digitalwallettokenrequests.DigitalWalletTokenRequestRetrieveParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class DigitalWalletTokenRequestServiceImpl
internal constructor(private val clientOptions: ClientOptions) : DigitalWalletTokenRequestService {

    private val withRawResponse: DigitalWalletTokenRequestService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DigitalWalletTokenRequestService.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): DigitalWalletTokenRequestService =
        DigitalWalletTokenRequestServiceImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    override fun retrieve(
        params: DigitalWalletTokenRequestRetrieveParams,
        requestOptions: RequestOptions,
    ): DigitalWalletTokenRequest =
        // get /digital_wallet_token_requests/{digital_wallet_token_request_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: DigitalWalletTokenRequestListParams,
        requestOptions: RequestOptions,
    ): DigitalWalletTokenRequestListPage =
        // get /digital_wallet_token_requests
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DigitalWalletTokenRequestService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DigitalWalletTokenRequestService.WithRawResponse =
            DigitalWalletTokenRequestServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<DigitalWalletTokenRequest> =
            jsonHandler<DigitalWalletTokenRequest>(clientOptions.jsonMapper)

        override fun retrieve(
            params: DigitalWalletTokenRequestRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DigitalWalletTokenRequest> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired(
                "digitalWalletTokenRequestId",
                params.digitalWalletTokenRequestId().getOrNull(),
            )
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("digital_wallet_token_requests", params._pathParam(0))
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

        private val listHandler: Handler<DigitalWalletTokenRequestListPageResponse> =
            jsonHandler<DigitalWalletTokenRequestListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: DigitalWalletTokenRequestListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DigitalWalletTokenRequestListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("digital_wallet_token_requests")
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
                    .let {
                        DigitalWalletTokenRequestListPage.builder()
                            .service(DigitalWalletTokenRequestServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
