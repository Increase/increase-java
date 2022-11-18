package com.increase.api.services.blocking

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpMethod
import com.increase.api.core.http.HttpRequest
import com.increase.api.core.http.HttpResponse.Handler
import com.increase.api.errors.IncreaseError
import com.increase.api.models.File
import com.increase.api.models.FileCreateParams
import com.increase.api.models.FileListPage
import com.increase.api.models.FileListParams
import com.increase.api.models.FileRetrieveParams
import com.increase.api.services.errorHandler
import com.increase.api.services.json
import com.increase.api.services.jsonHandler
import com.increase.api.services.withErrorHandler

class FileServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : FileService {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<File> =
        jsonHandler<File>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * To upload a file to Increase, you'll need to send a request of Content-Type
     * `multipart/form-data`. The request should contain the file you would like to upload, as well
     * as the parameters for creating a file.
     */
    override fun create(params: FileCreateParams, requestOptions: RequestOptions): File {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("files")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request).let { response ->
            response
                .let { createHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val retrieveHandler: Handler<File> =
        jsonHandler<File>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Retrieve a File */
    override fun retrieve(params: FileRetrieveParams, requestOptions: RequestOptions): File {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("files", params.getPathParam(0))
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request).let { response ->
            response
                .let { retrieveHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val listHandler: Handler<FileListPage.Response> =
        jsonHandler<FileListPage.Response>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** List Files */
    override fun list(params: FileListParams, requestOptions: RequestOptions): FileListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("files")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request).let { response ->
            response
                .let { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
                .let { FileListPage.of(this, params, it) }
        }
    }
}
