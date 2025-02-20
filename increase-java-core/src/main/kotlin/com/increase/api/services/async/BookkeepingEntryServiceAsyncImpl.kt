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
import com.increase.api.core.prepareAsync
import com.increase.api.errors.IncreaseError
import com.increase.api.models.BookkeepingEntry
import com.increase.api.models.BookkeepingEntryListPageAsync
import com.increase.api.models.BookkeepingEntryListParams
import com.increase.api.models.BookkeepingEntryRetrieveParams
import java.util.concurrent.CompletableFuture

class BookkeepingEntryServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : BookkeepingEntryServiceAsync {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<BookkeepingEntry> =
        jsonHandler<BookkeepingEntry>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Retrieve a Bookkeeping Entry */
    override fun retrieve(
        params: BookkeepingEntryRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BookkeepingEntry> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("bookkeeping_entries", params.getPathParam(0))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }

    private val listHandler: Handler<BookkeepingEntryListPageAsync.Response> =
        jsonHandler<BookkeepingEntryListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List Bookkeeping Entries */
    override fun list(
        params: BookkeepingEntryListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BookkeepingEntryListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("bookkeeping_entries")
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
                    .let { BookkeepingEntryListPageAsync.of(this, params, it) }
            }
    }
}
