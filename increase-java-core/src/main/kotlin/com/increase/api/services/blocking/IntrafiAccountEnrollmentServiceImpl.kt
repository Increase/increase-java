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
import com.increase.api.core.json
import com.increase.api.core.prepare
import com.increase.api.errors.IncreaseError
import com.increase.api.models.IntrafiAccountEnrollment
import com.increase.api.models.IntrafiAccountEnrollmentCreateParams
import com.increase.api.models.IntrafiAccountEnrollmentListPage
import com.increase.api.models.IntrafiAccountEnrollmentListParams
import com.increase.api.models.IntrafiAccountEnrollmentRetrieveParams
import com.increase.api.models.IntrafiAccountEnrollmentUnenrollParams

class IntrafiAccountEnrollmentServiceImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : IntrafiAccountEnrollmentService {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<IntrafiAccountEnrollment> =
        jsonHandler<IntrafiAccountEnrollment>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Enroll an account in the IntraFi deposit sweep network */
    override fun create(
        params: IntrafiAccountEnrollmentCreateParams,
        requestOptions: RequestOptions
    ): IntrafiAccountEnrollment {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("intrafi_account_enrollments")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { createHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val retrieveHandler: Handler<IntrafiAccountEnrollment> =
        jsonHandler<IntrafiAccountEnrollment>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Get an IntraFi Account Enrollment */
    override fun retrieve(
        params: IntrafiAccountEnrollmentRetrieveParams,
        requestOptions: RequestOptions
    ): IntrafiAccountEnrollment {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("intrafi_account_enrollments", params.getPathParam(0))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { retrieveHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val listHandler: Handler<IntrafiAccountEnrollmentListPage.Response> =
        jsonHandler<IntrafiAccountEnrollmentListPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List IntraFi Account Enrollments */
    override fun list(
        params: IntrafiAccountEnrollmentListParams,
        requestOptions: RequestOptions
    ): IntrafiAccountEnrollmentListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("intrafi_account_enrollments")
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { listHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
            .let { IntrafiAccountEnrollmentListPage.of(this, params, it) }
    }

    private val unenrollHandler: Handler<IntrafiAccountEnrollment> =
        jsonHandler<IntrafiAccountEnrollment>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Unenroll an account from IntraFi */
    override fun unenroll(
        params: IntrafiAccountEnrollmentUnenrollParams,
        requestOptions: RequestOptions
    ): IntrafiAccountEnrollment {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("intrafi_account_enrollments", params.getPathParam(0), "unenroll")
                .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { unenrollHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }
}
