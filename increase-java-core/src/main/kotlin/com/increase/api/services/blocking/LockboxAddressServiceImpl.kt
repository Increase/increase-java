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
import com.increase.api.models.lockboxaddresses.LockboxAddress
import com.increase.api.models.lockboxaddresses.LockboxAddressCreateParams
import com.increase.api.models.lockboxaddresses.LockboxAddressListPage
import com.increase.api.models.lockboxaddresses.LockboxAddressListPageResponse
import com.increase.api.models.lockboxaddresses.LockboxAddressListParams
import com.increase.api.models.lockboxaddresses.LockboxAddressRetrieveParams
import com.increase.api.models.lockboxaddresses.LockboxAddressUpdateParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class LockboxAddressServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    LockboxAddressService {

    private val withRawResponse: LockboxAddressService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): LockboxAddressService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): LockboxAddressService =
        LockboxAddressServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: LockboxAddressCreateParams,
        requestOptions: RequestOptions,
    ): LockboxAddress =
        // post /lockbox_addresses
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: LockboxAddressRetrieveParams,
        requestOptions: RequestOptions,
    ): LockboxAddress =
        // get /lockbox_addresses/{lockbox_address_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: LockboxAddressUpdateParams,
        requestOptions: RequestOptions,
    ): LockboxAddress =
        // patch /lockbox_addresses/{lockbox_address_id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: LockboxAddressListParams,
        requestOptions: RequestOptions,
    ): LockboxAddressListPage =
        // get /lockbox_addresses
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LockboxAddressService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LockboxAddressService.WithRawResponse =
            LockboxAddressServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<LockboxAddress> =
            jsonHandler<LockboxAddress>(clientOptions.jsonMapper)

        override fun create(
            params: LockboxAddressCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LockboxAddress> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("lockbox_addresses")
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

        private val retrieveHandler: Handler<LockboxAddress> =
            jsonHandler<LockboxAddress>(clientOptions.jsonMapper)

        override fun retrieve(
            params: LockboxAddressRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LockboxAddress> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("lockboxAddressId", params.lockboxAddressId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("lockbox_addresses", params._pathParam(0))
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

        private val updateHandler: Handler<LockboxAddress> =
            jsonHandler<LockboxAddress>(clientOptions.jsonMapper)

        override fun update(
            params: LockboxAddressUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LockboxAddress> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("lockboxAddressId", params.lockboxAddressId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("lockbox_addresses", params._pathParam(0))
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

        private val listHandler: Handler<LockboxAddressListPageResponse> =
            jsonHandler<LockboxAddressListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: LockboxAddressListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LockboxAddressListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("lockbox_addresses")
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
                        LockboxAddressListPage.builder()
                            .service(LockboxAddressServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
