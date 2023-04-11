package com.increase.api.core.http

import com.increase.api.core.RequestOptions
import java.io.Closeable
import java.util.concurrent.CompletableFuture
import com.increase.api.core.RequestOptions

interface HttpClient : Closeable {

    fun execute(
        request: HttpRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    fun executeAsync(
        request: HttpRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>
}
