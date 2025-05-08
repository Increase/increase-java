// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.files.File
import com.increase.api.models.files.FileCreateParams
import com.increase.api.models.files.FileListPageAsync
import com.increase.api.models.files.FileListParams
import com.increase.api.models.files.FileRetrieveParams
import java.util.concurrent.CompletableFuture

interface FileServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * To upload a file to Increase, you'll need to send a request of Content-Type
     * `multipart/form-data`. The request should contain the file you would like to upload, as well
     * as the parameters for creating a file.
     */
    fun create(params: FileCreateParams): CompletableFuture<File> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: FileCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<File>

    /** Retrieve a File */
    fun retrieve(fileId: String): CompletableFuture<File> =
        retrieve(fileId, FileRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        fileId: String,
        params: FileRetrieveParams = FileRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<File> = retrieve(params.toBuilder().fileId(fileId).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        fileId: String,
        params: FileRetrieveParams = FileRetrieveParams.none(),
    ): CompletableFuture<File> = retrieve(fileId, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: FileRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<File>

    /** @see [retrieve] */
    fun retrieve(params: FileRetrieveParams): CompletableFuture<File> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(fileId: String, requestOptions: RequestOptions): CompletableFuture<File> =
        retrieve(fileId, FileRetrieveParams.none(), requestOptions)

    /** List Files */
    fun list(): CompletableFuture<FileListPageAsync> = list(FileListParams.none())

    /** @see [list] */
    fun list(
        params: FileListParams = FileListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FileListPageAsync>

    /** @see [list] */
    fun list(params: FileListParams = FileListParams.none()): CompletableFuture<FileListPageAsync> =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<FileListPageAsync> =
        list(FileListParams.none(), requestOptions)

    /** A view of [FileServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /files`, but is otherwise the same as
         * [FileServiceAsync.create].
         */
        @MustBeClosed
        fun create(params: FileCreateParams): CompletableFuture<HttpResponseFor<File>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: FileCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<File>>

        /**
         * Returns a raw HTTP response for `get /files/{file_id}`, but is otherwise the same as
         * [FileServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(fileId: String): CompletableFuture<HttpResponseFor<File>> =
            retrieve(fileId, FileRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            fileId: String,
            params: FileRetrieveParams = FileRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<File>> =
            retrieve(params.toBuilder().fileId(fileId).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            fileId: String,
            params: FileRetrieveParams = FileRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<File>> =
            retrieve(fileId, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: FileRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<File>>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(params: FileRetrieveParams): CompletableFuture<HttpResponseFor<File>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            fileId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<File>> =
            retrieve(fileId, FileRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /files`, but is otherwise the same as
         * [FileServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<FileListPageAsync>> =
            list(FileListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: FileListParams = FileListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FileListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: FileListParams = FileListParams.none()
        ): CompletableFuture<HttpResponseFor<FileListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<FileListPageAsync>> =
            list(FileListParams.none(), requestOptions)
    }
}
