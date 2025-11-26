// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

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
import com.increase.api.core.prepareAsync
import com.increase.api.models.inboundmailitems.InboundMailItem
import com.increase.api.models.inboundmailitems.InboundMailItemActionParams
import com.increase.api.models.inboundmailitems.InboundMailItemListParams
import com.increase.api.models.inboundmailitems.InboundMailItemListResponse
import com.increase.api.models.inboundmailitems.InboundMailItemRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class InboundMailItemServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : InboundMailItemServiceAsync {

    private val withRawResponse: InboundMailItemServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): InboundMailItemServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): InboundMailItemServiceAsync =
        InboundMailItemServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: InboundMailItemRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<InboundMailItem> =
        // get /inbound_mail_items/{inbound_mail_item_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: InboundMailItemListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<InboundMailItemListResponse> =
        // get /inbound_mail_items
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun action(
        params: InboundMailItemActionParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<InboundMailItem> =
        // post /inbound_mail_items/{inbound_mail_item_id}/action
        withRawResponse().action(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InboundMailItemServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InboundMailItemServiceAsync.WithRawResponse =
            InboundMailItemServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<InboundMailItem> =
            jsonHandler<InboundMailItem>(clientOptions.jsonMapper)

        override fun retrieve(
            params: InboundMailItemRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InboundMailItem>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("inboundMailItemId", params.inboundMailItemId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("inbound_mail_items", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<InboundMailItemListResponse> =
            jsonHandler<InboundMailItemListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: InboundMailItemListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InboundMailItemListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("inbound_mail_items")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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

        private val actionHandler: Handler<InboundMailItem> =
            jsonHandler<InboundMailItem>(clientOptions.jsonMapper)

        override fun action(
            params: InboundMailItemActionParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InboundMailItem>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("inboundMailItemId", params.inboundMailItemId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("inbound_mail_items", params._pathParam(0), "action")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { actionHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }
    }
}
