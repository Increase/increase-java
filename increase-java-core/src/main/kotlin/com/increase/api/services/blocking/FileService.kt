// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponse
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.files.File
import com.increase.api.models.files.FileContentsParams
import com.increase.api.models.files.FileCreateParams
import com.increase.api.models.files.FileListPage
import com.increase.api.models.files.FileListParams
import com.increase.api.models.files.FileRetrieveParams
import java.util.function.Consumer

interface FileService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FileService

    /**
     * To upload a file to Increase, you'll need to send a request of Content-Type
     * `multipart/form-data`. The request should contain the file you would like to upload, as well
     * as the parameters for creating a file.
     */
    fun create(params: FileCreateParams): File = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: FileCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): File

    /** Retrieve a File */
    fun retrieve(fileId: String): File = retrieve(fileId, FileRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        fileId: String,
        params: FileRetrieveParams = FileRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): File = retrieve(params.toBuilder().fileId(fileId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(fileId: String, params: FileRetrieveParams = FileRetrieveParams.none()): File =
        retrieve(fileId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: FileRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): File

    /** @see retrieve */
    fun retrieve(params: FileRetrieveParams): File = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(fileId: String, requestOptions: RequestOptions): File =
        retrieve(fileId, FileRetrieveParams.none(), requestOptions)

    /** List Files */
    fun list(): FileListPage = list(FileListParams.none())

    /** @see list */
    fun list(
        params: FileListParams = FileListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FileListPage

    /** @see list */
    fun list(params: FileListParams = FileListParams.none()): FileListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): FileListPage =
        list(FileListParams.none(), requestOptions)

    /**
     * Download the contents of a File. Responds with a 307 redirect whose `Location` header points
     * at a short-lived, pre-signed URL. Our [SDKs](/documentation/software-development-kits) follow
     * the redirect and return the File's contents; if you call the API directly, follow the
     * redirect to download it. The pre-signed URL serves the File with a `Content-Type` matching
     * its `mime` and a `Content-Disposition` header set to its `filename`. It expires in 10
     * minutes. To share a File with someone who doesn't have access to your API key, create a File
     * Link.
     */
    @MustBeClosed
    fun contents(fileId: String): HttpResponse = contents(fileId, FileContentsParams.none())

    /** @see contents */
    @MustBeClosed
    fun contents(
        fileId: String,
        params: FileContentsParams = FileContentsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse = contents(params.toBuilder().fileId(fileId).build(), requestOptions)

    /** @see contents */
    @MustBeClosed
    fun contents(
        fileId: String,
        params: FileContentsParams = FileContentsParams.none(),
    ): HttpResponse = contents(fileId, params, RequestOptions.none())

    /** @see contents */
    @MustBeClosed
    fun contents(
        params: FileContentsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see contents */
    @MustBeClosed
    fun contents(params: FileContentsParams): HttpResponse = contents(params, RequestOptions.none())

    /** @see contents */
    @MustBeClosed
    fun contents(fileId: String, requestOptions: RequestOptions): HttpResponse =
        contents(fileId, FileContentsParams.none(), requestOptions)

    /** A view of [FileService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): FileService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /files`, but is otherwise the same as
         * [FileService.create].
         */
        @MustBeClosed
        fun create(params: FileCreateParams): HttpResponseFor<File> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: FileCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<File>

        /**
         * Returns a raw HTTP response for `get /files/{file_id}`, but is otherwise the same as
         * [FileService.retrieve].
         */
        @MustBeClosed
        fun retrieve(fileId: String): HttpResponseFor<File> =
            retrieve(fileId, FileRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            fileId: String,
            params: FileRetrieveParams = FileRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<File> =
            retrieve(params.toBuilder().fileId(fileId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            fileId: String,
            params: FileRetrieveParams = FileRetrieveParams.none(),
        ): HttpResponseFor<File> = retrieve(fileId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: FileRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<File>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: FileRetrieveParams): HttpResponseFor<File> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(fileId: String, requestOptions: RequestOptions): HttpResponseFor<File> =
            retrieve(fileId, FileRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /files`, but is otherwise the same as
         * [FileService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<FileListPage> = list(FileListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: FileListParams = FileListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FileListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: FileListParams = FileListParams.none()): HttpResponseFor<FileListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<FileListPage> =
            list(FileListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /files/{file_id}/contents`, but is otherwise the
         * same as [FileService.contents].
         */
        @MustBeClosed
        fun contents(fileId: String): HttpResponse = contents(fileId, FileContentsParams.none())

        /** @see contents */
        @MustBeClosed
        fun contents(
            fileId: String,
            params: FileContentsParams = FileContentsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = contents(params.toBuilder().fileId(fileId).build(), requestOptions)

        /** @see contents */
        @MustBeClosed
        fun contents(
            fileId: String,
            params: FileContentsParams = FileContentsParams.none(),
        ): HttpResponse = contents(fileId, params, RequestOptions.none())

        /** @see contents */
        @MustBeClosed
        fun contents(
            params: FileContentsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see contents */
        @MustBeClosed
        fun contents(params: FileContentsParams): HttpResponse =
            contents(params, RequestOptions.none())

        /** @see contents */
        @MustBeClosed
        fun contents(fileId: String, requestOptions: RequestOptions): HttpResponse =
            contents(fileId, FileContentsParams.none(), requestOptions)
    }
}
