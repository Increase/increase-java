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
import com.increase.api.core.prepare
import com.increase.api.errors.IncreaseError
import com.increase.api.models.Program
import com.increase.api.models.ProgramListPage
import com.increase.api.models.ProgramListParams
import com.increase.api.models.ProgramRetrieveParams

class ProgramServiceImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : ProgramService {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<Program> =
        jsonHandler<Program>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Retrieve a Program */
    override fun retrieve(params: ProgramRetrieveParams, requestOptions: RequestOptions): Program {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("programs", params.getPathParam(0))
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

    private val listHandler: Handler<ProgramListPage.Response> =
        jsonHandler<ProgramListPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List Programs */
    override fun list(params: ProgramListParams, requestOptions: RequestOptions): ProgramListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("programs")
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
            .let { ProgramListPage.of(this, params, it) }
    }
}
