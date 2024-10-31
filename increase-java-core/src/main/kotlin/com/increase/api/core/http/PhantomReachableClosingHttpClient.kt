package com.increase.api.core.http

import com.increase.api.core.RequestOptions
import com.increase.api.core.closeWhenPhantomReachable
import java.util.concurrent.CompletableFuture

internal class PhantomReachableClosingHttpClient(private val httpClient: HttpClient) : HttpClient {
    init {
        closeWhenPhantomReachable(this, httpClient)
    }

    override fun execute(request: HttpRequest, requestOptions: RequestOptions): HttpResponse =
        httpClient.execute(request, requestOptions)

    override fun executeAsync(
        request: HttpRequest,
        requestOptions: RequestOptions
    ): CompletableFuture<HttpResponse> = httpClient.executeAsync(request, requestOptions)

    override fun close() = httpClient.close()
}
