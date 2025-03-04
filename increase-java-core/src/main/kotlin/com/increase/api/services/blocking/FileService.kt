// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.File
import com.increase.api.models.FileCreateParams
import com.increase.api.models.FileListPage
import com.increase.api.models.FileListParams
import com.increase.api.models.FileRetrieveParams

interface FileService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * To upload a file to Increase, you'll need to send a request of Content-Type
     * `multipart/form-data`. The request should contain the file you would like to upload, as well
     * as the parameters for creating a file.
     */
    @JvmOverloads
    fun create(
        params: FileCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): File

    /** Retrieve a File */
    @JvmOverloads
    fun retrieve(
        params: FileRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): File

    /** List Files */
    @JvmOverloads
    fun list(
        params: FileListParams = FileListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FileListPage

    /** List Files */
    fun list(requestOptions: RequestOptions): FileListPage =
        list(FileListParams.none(), requestOptions)

    /** A view of [FileService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /files`, but is otherwise the same as
         * [FileService.create].
         */
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: FileCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<File>

        /**
         * Returns a raw HTTP response for `get /files/{file_id}`, but is otherwise the same as
         * [FileService.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: FileRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<File>

        /**
         * Returns a raw HTTP response for `get /files`, but is otherwise the same as
         * [FileService.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: FileListParams = FileListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FileListPage>

        /**
         * Returns a raw HTTP response for `get /files`, but is otherwise the same as
         * [FileService.list].
         */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<FileListPage> =
            list(FileListParams.none(), requestOptions)
    }
}
