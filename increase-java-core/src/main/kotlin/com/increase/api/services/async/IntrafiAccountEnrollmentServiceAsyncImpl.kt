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
import com.increase.api.core.json
import com.increase.api.core.prepareAsync
import com.increase.api.errors.IncreaseError
import com.increase.api.models.IntrafiAccountEnrollment
import com.increase.api.models.IntrafiAccountEnrollmentCreateParams
import com.increase.api.models.IntrafiAccountEnrollmentListPageAsync
import com.increase.api.models.IntrafiAccountEnrollmentListParams
import com.increase.api.models.IntrafiAccountEnrollmentRetrieveParams
import com.increase.api.models.IntrafiAccountEnrollmentUnenrollParams
import java.util.concurrent.CompletableFuture

class IntrafiAccountEnrollmentServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) :
    IntrafiAccountEnrollmentServiceAsync {

    private val withRawResponse: IntrafiAccountEnrollmentServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): IntrafiAccountEnrollmentServiceAsync.WithRawResponse =
        withRawResponse

    override fun create(
        params: IntrafiAccountEnrollmentCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<IntrafiAccountEnrollment> =
        // post /intrafi_account_enrollments
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: IntrafiAccountEnrollmentRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<IntrafiAccountEnrollment> =
        // get /intrafi_account_enrollments/{intrafi_account_enrollment_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: IntrafiAccountEnrollmentListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<IntrafiAccountEnrollmentListPageAsync> =
        // get /intrafi_account_enrollments
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun unenroll(
        params: IntrafiAccountEnrollmentUnenrollParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<IntrafiAccountEnrollment> =
        // post /intrafi_account_enrollments/{intrafi_account_enrollment_id}/unenroll
        withRawResponse().unenroll(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        IntrafiAccountEnrollmentServiceAsync.WithRawResponse {

        private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<IntrafiAccountEnrollment> =
            jsonHandler<IntrafiAccountEnrollment>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: IntrafiAccountEnrollmentCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<IntrafiAccountEnrollment>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("intrafi_account_enrollments")
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

        private val retrieveHandler: Handler<IntrafiAccountEnrollment> =
            jsonHandler<IntrafiAccountEnrollment>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: IntrafiAccountEnrollmentRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<IntrafiAccountEnrollment>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("intrafi_account_enrollments", params.getPathParam(0))
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

        private val listHandler: Handler<IntrafiAccountEnrollmentListPageAsync.Response> =
            jsonHandler<IntrafiAccountEnrollmentListPageAsync.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: IntrafiAccountEnrollmentListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<IntrafiAccountEnrollmentListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("intrafi_account_enrollments")
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
                                IntrafiAccountEnrollmentListPageAsync.of(
                                    IntrafiAccountEnrollmentServiceAsyncImpl(clientOptions),
                                    params,
                                    it,
                                )
                            }
                    }
                }
        }

        private val unenrollHandler: Handler<IntrafiAccountEnrollment> =
            jsonHandler<IntrafiAccountEnrollment>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun unenroll(
            params: IntrafiAccountEnrollmentUnenrollParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<IntrafiAccountEnrollment>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        "intrafi_account_enrollments",
                        params.getPathParam(0),
                        "unenroll",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { unenrollHandler.handle(it) }
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
