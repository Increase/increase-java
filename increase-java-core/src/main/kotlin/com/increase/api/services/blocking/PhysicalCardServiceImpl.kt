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
import com.increase.api.core.http.json
import com.increase.api.core.http.parseable
import com.increase.api.core.prepare
import com.increase.api.models.physicalcards.PhysicalCard
import com.increase.api.models.physicalcards.PhysicalCardCreateParams
import com.increase.api.models.physicalcards.PhysicalCardListParams
import com.increase.api.models.physicalcards.PhysicalCardListResponse
import com.increase.api.models.physicalcards.PhysicalCardRetrieveParams
import com.increase.api.models.physicalcards.PhysicalCardUpdateParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class PhysicalCardServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    PhysicalCardService {

    private val withRawResponse: PhysicalCardService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PhysicalCardService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PhysicalCardService =
        PhysicalCardServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: PhysicalCardCreateParams,
        requestOptions: RequestOptions,
    ): PhysicalCard =
        // post /physical_cards
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: PhysicalCardRetrieveParams,
        requestOptions: RequestOptions,
    ): PhysicalCard =
        // get /physical_cards/{physical_card_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: PhysicalCardUpdateParams,
        requestOptions: RequestOptions,
    ): PhysicalCard =
        // patch /physical_cards/{physical_card_id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: PhysicalCardListParams,
        requestOptions: RequestOptions,
    ): PhysicalCardListResponse =
        // get /physical_cards
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PhysicalCardService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PhysicalCardService.WithRawResponse =
            PhysicalCardServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<PhysicalCard> =
            jsonHandler<PhysicalCard>(clientOptions.jsonMapper)

        override fun create(
            params: PhysicalCardCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PhysicalCard> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("physical_cards")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<PhysicalCard> =
            jsonHandler<PhysicalCard>(clientOptions.jsonMapper)

        override fun retrieve(
            params: PhysicalCardRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PhysicalCard> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("physicalCardId", params.physicalCardId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("physical_cards", params._pathParam(0))
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

        private val updateHandler: Handler<PhysicalCard> =
            jsonHandler<PhysicalCard>(clientOptions.jsonMapper)

        override fun update(
            params: PhysicalCardUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PhysicalCard> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("physicalCardId", params.physicalCardId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("physical_cards", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<PhysicalCardListResponse> =
            jsonHandler<PhysicalCardListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: PhysicalCardListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PhysicalCardListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("physical_cards")
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
