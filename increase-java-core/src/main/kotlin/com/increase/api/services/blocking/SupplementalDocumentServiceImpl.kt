// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
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
import com.increase.api.models.supplementaldocuments.EntitySupplementalDocument
import com.increase.api.models.supplementaldocuments.SupplementalDocumentCreateParams
import com.increase.api.models.supplementaldocuments.SupplementalDocumentListPage
import com.increase.api.models.supplementaldocuments.SupplementalDocumentListPageResponse
import com.increase.api.models.supplementaldocuments.SupplementalDocumentListParams
import java.util.function.Consumer

class SupplementalDocumentServiceImpl
internal constructor(private val clientOptions: ClientOptions) : SupplementalDocumentService {

    private val withRawResponse: SupplementalDocumentService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SupplementalDocumentService.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): SupplementalDocumentService =
        SupplementalDocumentServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: SupplementalDocumentCreateParams,
        requestOptions: RequestOptions,
    ): EntitySupplementalDocument =
        // post /entity_supplemental_documents
        withRawResponse().create(params, requestOptions).parse()

    override fun list(
        params: SupplementalDocumentListParams,
        requestOptions: RequestOptions,
    ): SupplementalDocumentListPage =
        // get /entity_supplemental_documents
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SupplementalDocumentService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SupplementalDocumentService.WithRawResponse =
            SupplementalDocumentServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<EntitySupplementalDocument> =
            jsonHandler<EntitySupplementalDocument>(clientOptions.jsonMapper)

        override fun create(
            params: SupplementalDocumentCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EntitySupplementalDocument> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("entity_supplemental_documents")
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

        private val listHandler: Handler<SupplementalDocumentListPageResponse> =
            jsonHandler<SupplementalDocumentListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: SupplementalDocumentListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SupplementalDocumentListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("entity_supplemental_documents")
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
                        SupplementalDocumentListPage.builder()
                            .service(SupplementalDocumentServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
