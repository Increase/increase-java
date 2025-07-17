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
import com.increase.api.models.bookkeepingentrysets.BookkeepingEntrySet
import com.increase.api.models.bookkeepingentrysets.BookkeepingEntrySetCreateParams
import com.increase.api.models.bookkeepingentrysets.BookkeepingEntrySetListPage
import com.increase.api.models.bookkeepingentrysets.BookkeepingEntrySetListPageResponse
import com.increase.api.models.bookkeepingentrysets.BookkeepingEntrySetListParams
import com.increase.api.models.bookkeepingentrysets.BookkeepingEntrySetRetrieveParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class BookkeepingEntrySetServiceImpl
internal constructor(private val clientOptions: ClientOptions) : BookkeepingEntrySetService {

    private val withRawResponse: BookkeepingEntrySetService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BookkeepingEntrySetService.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): BookkeepingEntrySetService =
        BookkeepingEntrySetServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: BookkeepingEntrySetCreateParams,
        requestOptions: RequestOptions,
    ): BookkeepingEntrySet =
        // post /bookkeeping_entry_sets
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: BookkeepingEntrySetRetrieveParams,
        requestOptions: RequestOptions,
    ): BookkeepingEntrySet =
        // get /bookkeeping_entry_sets/{bookkeeping_entry_set_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: BookkeepingEntrySetListParams,
        requestOptions: RequestOptions,
    ): BookkeepingEntrySetListPage =
        // get /bookkeeping_entry_sets
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BookkeepingEntrySetService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BookkeepingEntrySetService.WithRawResponse =
            BookkeepingEntrySetServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<BookkeepingEntrySet> =
            jsonHandler<BookkeepingEntrySet>(clientOptions.jsonMapper)

        override fun create(
            params: BookkeepingEntrySetCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BookkeepingEntrySet> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("bookkeeping_entry_sets")
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

        private val retrieveHandler: Handler<BookkeepingEntrySet> =
            jsonHandler<BookkeepingEntrySet>(clientOptions.jsonMapper)

        override fun retrieve(
            params: BookkeepingEntrySetRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BookkeepingEntrySet> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("bookkeepingEntrySetId", params.bookkeepingEntrySetId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("bookkeeping_entry_sets", params._pathParam(0))
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

        private val listHandler: Handler<BookkeepingEntrySetListPageResponse> =
            jsonHandler<BookkeepingEntrySetListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: BookkeepingEntrySetListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BookkeepingEntrySetListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("bookkeeping_entry_sets")
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
                        BookkeepingEntrySetListPage.builder()
                            .service(BookkeepingEntrySetServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
