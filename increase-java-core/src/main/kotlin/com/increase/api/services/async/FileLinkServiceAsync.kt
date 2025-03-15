// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.filelinks.FileLink
import com.increase.api.models.filelinks.FileLinkCreateParams
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
    }
}
