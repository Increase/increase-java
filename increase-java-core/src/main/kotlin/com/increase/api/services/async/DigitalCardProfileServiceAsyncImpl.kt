// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.ClientOptions
import com.increase.api.core.JsonValue
import com.increase.api.core.RequestOptions
import com.increase.api.core.checkRequired
import com.increase.api.core.handlers.errorHandler
import com.increase.api.core.handlers.jsonHandler
import com.increase.api.core.handlers.withErrorHandler
import com.increase.api.core.http.HttpMethod
import com.increase.api.core.http.HttpRequest
import com.increase.api.core.http.HttpResponse.Handler
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.core.http.json
import com.increase.api.core.http.parseable
import com.increase.api.core.prepareAsync
import com.increase.api.models.digitalcardprofiles.DigitalCardProfile
import com.increase.api.models.digitalcardprofiles.DigitalCardProfileArchiveParams
import com.increase.api.models.digitalcardprofiles.DigitalCardProfileCloneParams
import com.increase.api.models.digitalcardprofiles.DigitalCardProfileCreateParams
import com.increase.api.models.digitalcardprofiles.DigitalCardProfileListPageAsync
import com.increase.api.models.digitalcardprofiles.DigitalCardProfileListPageResponse
import com.increase.api.models.digitalcardprofiles.DigitalCardProfileListParams
import com.increase.api.models.digitalcardprofiles.DigitalCardProfileRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class DigitalCardProfileServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : DigitalCardProfileServiceAsync {

    private val withRawResponse: DigitalCardProfileServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DigitalCardProfileServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): DigitalCardProfileServiceAsync =
        DigitalCardProfileServiceAsyncImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    override fun create(
        params: DigitalCardProfileCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DigitalCardProfile> =
        // post /digital_card_profiles
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: DigitalCardProfileRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DigitalCardProfile> =
        // get /digital_card_profiles/{digital_card_profile_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: DigitalCardProfileListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DigitalCardProfileListPageAsync> =
        // get /digital_card_profiles
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun archive(
        params: DigitalCardProfileArchiveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DigitalCardProfile> =
        // post /digital_card_profiles/{digital_card_profile_id}/archive
        withRawResponse().archive(params, requestOptions).thenApply { it.parse() }

    override fun clone(
        params: DigitalCardProfileCloneParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DigitalCardProfile> =
        // post /digital_card_profiles/{digital_card_profile_id}/clone
        withRawResponse().clone(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DigitalCardProfileServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DigitalCardProfileServiceAsync.WithRawResponse =
            DigitalCardProfileServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<DigitalCardProfile> =
            jsonHandler<DigitalCardProfile>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: DigitalCardProfileCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DigitalCardProfile>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("digital_card_profiles")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveHandler: Handler<DigitalCardProfile> =
            jsonHandler<DigitalCardProfile>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: DigitalCardProfileRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DigitalCardProfile>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("digitalCardProfileId", params.digitalCardProfileId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("digital_card_profiles", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
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

        private val listHandler: Handler<DigitalCardProfileListPageResponse> =
            jsonHandler<DigitalCardProfileListPageResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: DigitalCardProfileListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DigitalCardProfileListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("digital_card_profiles")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                DigitalCardProfileListPageAsync.builder()
                                    .service(DigitalCardProfileServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val archiveHandler: Handler<DigitalCardProfile> =
            jsonHandler<DigitalCardProfile>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun archive(
            params: DigitalCardProfileArchiveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DigitalCardProfile>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("digitalCardProfileId", params.digitalCardProfileId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("digital_card_profiles", params._pathParam(0), "archive")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { archiveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val cloneHandler: Handler<DigitalCardProfile> =
            jsonHandler<DigitalCardProfile>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun clone(
            params: DigitalCardProfileCloneParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DigitalCardProfile>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("digitalCardProfileId", params.digitalCardProfileId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("digital_card_profiles", params._pathParam(0), "clone")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { cloneHandler.handle(it) }
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
