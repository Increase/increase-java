// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.ClientOptions
import com.increase.api.core.JsonValue
import com.increase.api.core.RequestOptions
import com.increase.api.core.handlers.errorHandler
import com.increase.api.core.handlers.jsonHandler
import com.increase.api.core.handlers.withErrorHandler
import com.increase.api.core.http.HttpMethod
import com.increase.api.core.http.HttpRequest
import com.increase.api.core.http.HttpResponse.Handler
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.core.http.parseable
import com.increase.api.core.prepareAsync
import com.increase.api.models.bookkeepingentries.BookkeepingEntry
import com.increase.api.models.bookkeepingentries.BookkeepingEntryListPageAsync
import com.increase.api.models.bookkeepingentries.BookkeepingEntryListParams
import com.increase.api.models.bookkeepingentries.BookkeepingEntryRetrieveParams
import java.util.concurrent.CompletableFuture

class BookkeepingEntryServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : BookkeepingEntryServiceAsync {

    private val withRawResponse: BookkeepingEntryServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BookkeepingEntryServiceAsync.WithRawResponse = withRawResponse

    override fun retrieve(
        params: BookkeepingEntryRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BookkeepingEntry> =
        // get /bookkeeping_entries/{bookkeeping_entry_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: BookkeepingEntryListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BookkeepingEntryListPageAsync> =
        // get /bookkeeping_entries
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BookkeepingEntryServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val retrieveHandler: Handler<BookkeepingEntry> =
            jsonHandler<BookkeepingEntry>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: BookkeepingEntryRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BookkeepingEntry>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("bookkeeping_entries", params._pathParam(0))
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

        private val listHandler: Handler<BookkeepingEntryListPageAsync.Response> =
            jsonHandler<BookkeepingEntryListPageAsync.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: BookkeepingEntryListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BookkeepingEntryListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("bookkeeping_entries")
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
                                BookkeepingEntryListPageAsync.of(
                                    BookkeepingEntryServiceAsyncImpl(clientOptions),
                                    params,
                                    it,
                                )
                            }
                    }
                }
        }
    }
}
