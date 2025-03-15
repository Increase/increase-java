// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.filelinks.FileLink
import com.increase.api.models.filelinks.FileLinkCreateParams

interface FileLinkService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a File Link */
    fun create(params: FileLinkCreateParams): FileLink = create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: FileLinkCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FileLink

    /** A view of [FileLinkService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /file_links`, but is otherwise the same as
         * [FileLinkService.create].
         */
        @MustBeClosed
        fun create(params: FileLinkCreateParams): HttpResponseFor<FileLink> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: FileLinkCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FileLink>
    }
}
