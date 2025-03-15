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
import com.increase.api.models.filelinks.FileLink
import com.increase.api.models.filelinks.FileLinkCreateParams
import com.increase.api.models.filelinks.FileLinkListPage
import com.increase.api.models.filelinks.FileLinkListParams
import com.increase.api.models.filelinks.FileLinkRetrieveParams

class FileLinkServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    FileLinkService {

    private val withRawResponse: FileLinkService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): FileLinkService.WithRawResponse = withRawResponse

    override fun create(params: FileLinkCreateParams, requestOptions: RequestOptions): FileLink =
        // post /file_links
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: FileLinkRetrieveParams,
        requestOptions: RequestOptions,
    ): FileLink =
        // get /file_links/{file_link_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: FileLinkListParams,
        requestOptions: RequestOptions,
    ): FileLinkListPage =
        // get /file_links
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        FileLinkService.WithRawResponse {

        private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<FileLink> =
            jsonHandler<FileLink>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: FileLinkCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FileLink> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("file_links")
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

        private val retrieveHandler: Handler<FileLink> =
            jsonHandler<FileLink>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: FileLinkRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FileLink> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("file_links", params.getPathParam(0))
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

        private val listHandler: Handler<FileLinkListPage.Response> =
            jsonHandler<FileLinkListPage.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: FileLinkListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FileLinkListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("file_links")
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
                    .let { FileLinkListPage.of(FileLinkServiceImpl(clientOptions), params, it) }
            }
        }
    }
}
