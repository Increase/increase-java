// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.filelinks.FileLink
import com.increase.api.models.filelinks.FileLinkCreateParams
import com.increase.api.models.filelinks.FileLinkListPageAsync
import com.increase.api.models.filelinks.FileLinkListParams
import com.increase.api.models.filelinks.FileLinkRetrieveParams
import java.util.concurrent.CompletableFuture

interface FileLinkServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a File Link */
    fun create(params: FileLinkCreateParams): CompletableFuture<FileLink> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: FileLinkCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FileLink>

    /** Retrieve a File Link */
    fun retrieve(params: FileLinkRetrieveParams): CompletableFuture<FileLink> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: FileLinkRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FileLink>

    /** List File Links */
    fun list(params: FileLinkListParams): CompletableFuture<FileLinkListPageAsync> =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: FileLinkListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FileLinkListPageAsync>

    /**
     * A view of [FileLinkServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /file_links`, but is otherwise the same as
         * [FileLinkServiceAsync.create].
         */
        @MustBeClosed
        fun create(params: FileLinkCreateParams): CompletableFuture<HttpResponseFor<FileLink>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: FileLinkCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FileLink>>

        /**
         * Returns a raw HTTP response for `get /file_links/{file_link_id}`, but is otherwise the
         * same as [FileLinkServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: FileLinkRetrieveParams): CompletableFuture<HttpResponseFor<FileLink>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: FileLinkRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FileLink>>

        /**
         * Returns a raw HTTP response for `get /file_links`, but is otherwise the same as
         * [FileLinkServiceAsync.list].
         */
        @MustBeClosed
        fun list(
            params: FileLinkListParams
        ): CompletableFuture<HttpResponseFor<FileLinkListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: FileLinkListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FileLinkListPageAsync>>
    }
}
