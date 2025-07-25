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
import com.increase.api.core.http.parseable
import com.increase.api.core.prepareAsync
import com.increase.api.models.bookkeepingentries.BookkeepingEntry
import com.increase.api.models.bookkeepingentries.BookkeepingEntryListPageAsync
import com.increase.api.models.bookkeepingentries.BookkeepingEntryListPageResponse
import com.increase.api.models.bookkeepingentries.BookkeepingEntryListParams
import com.increase.api.models.bookkeepingentries.BookkeepingEntryRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class BookkeepingEntryServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : BookkeepingEntryServiceAsync {

    private val withRawResponse: BookkeepingEntryServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BookkeepingEntryServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): BookkeepingEntryServiceAsync =
        BookkeepingEntryServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

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

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BookkeepingEntryServiceAsync.WithRawResponse =
            BookkeepingEntryServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<BookkeepingEntry> =
            jsonHandler<BookkeepingEntry>(clientOptions.jsonMapper)

        override fun retrieve(
            params: BookkeepingEntryRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BookkeepingEntry>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("bookkeepingEntryId", params.bookkeepingEntryId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("bookkeeping_entries", params._pathParam(0))
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

        private val listHandler: Handler<BookkeepingEntryListPageResponse> =
            jsonHandler<BookkeepingEntryListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: BookkeepingEntryListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BookkeepingEntryListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("bookkeeping_entries")
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
                            .let {
                                BookkeepingEntryListPageAsync.builder()
                                    .service(BookkeepingEntryServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }
    }
}
