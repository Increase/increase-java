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
import com.increase.api.core.http.json
import com.increase.api.core.http.parseable
import com.increase.api.core.prepare
import com.increase.api.errors.IncreaseError
import com.increase.api.models.IntrafiAccountEnrollment
import com.increase.api.models.IntrafiAccountEnrollmentCreateParams
import com.increase.api.models.IntrafiAccountEnrollmentListPage
import com.increase.api.models.IntrafiAccountEnrollmentListParams
import com.increase.api.models.IntrafiAccountEnrollmentRetrieveParams
import com.increase.api.models.IntrafiAccountEnrollmentUnenrollParams

class IntrafiAccountEnrollmentServiceImpl
internal constructor(private val clientOptions: ClientOptions) : IntrafiAccountEnrollmentService {

    private val withRawResponse: IntrafiAccountEnrollmentService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): IntrafiAccountEnrollmentService.WithRawResponse =
        withRawResponse

    override fun create(
        params: IntrafiAccountEnrollmentCreateParams,
        requestOptions: RequestOptions,
    ): IntrafiAccountEnrollment =
        // post /intrafi_account_enrollments
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: IntrafiAccountEnrollmentRetrieveParams,
        requestOptions: RequestOptions,
    ): IntrafiAccountEnrollment =
        // get /intrafi_account_enrollments/{intrafi_account_enrollment_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: IntrafiAccountEnrollmentListParams,
        requestOptions: RequestOptions,
    ): IntrafiAccountEnrollmentListPage =
        // get /intrafi_account_enrollments
        withRawResponse().list(params, requestOptions).parse()

    override fun unenroll(
        params: IntrafiAccountEnrollmentUnenrollParams,
        requestOptions: RequestOptions,
    ): IntrafiAccountEnrollment =
        // post /intrafi_account_enrollments/{intrafi_account_enrollment_id}/unenroll
        withRawResponse().unenroll(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        IntrafiAccountEnrollmentService.WithRawResponse {

        private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<IntrafiAccountEnrollment> =
            jsonHandler<IntrafiAccountEnrollment>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: IntrafiAccountEnrollmentCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IntrafiAccountEnrollment> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("intrafi_account_enrollments")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
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
        ): HttpResponseFor<IntrafiAccountEnrollment> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("intrafi_account_enrollments", params.getPathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<IntrafiAccountEnrollmentListPage.Response> =
            jsonHandler<IntrafiAccountEnrollmentListPage.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: IntrafiAccountEnrollmentListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IntrafiAccountEnrollmentListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("intrafi_account_enrollments")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        IntrafiAccountEnrollmentListPage.of(
                            IntrafiAccountEnrollmentServiceImpl(clientOptions),
                            params,
                            it,
                        )
                    }
            }
        }

        private val unenrollHandler: Handler<IntrafiAccountEnrollment> =
            jsonHandler<IntrafiAccountEnrollment>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun unenroll(
            params: IntrafiAccountEnrollmentUnenrollParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IntrafiAccountEnrollment> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
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
