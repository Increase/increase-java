// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.intrafiexclusions.IntrafiExclusion
import com.increase.api.models.intrafiexclusions.IntrafiExclusionArchiveParams
import com.increase.api.models.intrafiexclusions.IntrafiExclusionCreateParams
import com.increase.api.models.intrafiexclusions.IntrafiExclusionListPageAsync
import com.increase.api.models.intrafiexclusions.IntrafiExclusionListParams
import com.increase.api.models.intrafiexclusions.IntrafiExclusionRetrieveParams
import java.util.concurrent.CompletableFuture

interface IntrafiExclusionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for
     * each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create an IntraFi Exclusion */
    fun create(params: IntrafiExclusionCreateParams): CompletableFuture<IntrafiExclusion> =
        create(
          params, RequestOptions.none()
        )

    /** @see [create] */
    fun create(params: IntrafiExclusionCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<IntrafiExclusion>

    /** Get an IntraFi Exclusion */
    fun retrieve(params: IntrafiExclusionRetrieveParams): CompletableFuture<IntrafiExclusion> =
        retrieve(
          params, RequestOptions.none()
        )

    /** @see [retrieve] */
    fun retrieve(params: IntrafiExclusionRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<IntrafiExclusion>

    /** List IntraFi Exclusions */
    fun list(): CompletableFuture<IntrafiExclusionListPageAsync> = list(IntrafiExclusionListParams.none())

    /** @see [list] */
    fun list(params: IntrafiExclusionListParams = IntrafiExclusionListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<IntrafiExclusionListPageAsync>

    /** @see [list] */
    fun list(params: IntrafiExclusionListParams = IntrafiExclusionListParams.none()): CompletableFuture<IntrafiExclusionListPageAsync> =
        list(
          params, RequestOptions.none()
        )

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<IntrafiExclusionListPageAsync> = list(IntrafiExclusionListParams.none(), requestOptions)

    /** Archive an IntraFi Exclusion */
    fun archive(params: IntrafiExclusionArchiveParams): CompletableFuture<IntrafiExclusion> =
        archive(
          params, RequestOptions.none()
        )

    /** @see [archive] */
    fun archive(params: IntrafiExclusionArchiveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<IntrafiExclusion>

    /**
     * A view of [IntrafiExclusionServiceAsync] that provides access to raw HTTP
     * responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /intrafi_exclusions`, but is otherwise the
         * same as [IntrafiExclusionServiceAsync.create].
         */
        @MustBeClosed
        fun create(params: IntrafiExclusionCreateParams): CompletableFuture<HttpResponseFor<IntrafiExclusion>> =
            create(
              params, RequestOptions.none()
            )

        /** @see [create] */
        @MustBeClosed
        fun create(params: IntrafiExclusionCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<IntrafiExclusion>>

        /**
         * Returns a raw HTTP response for
         * `get /intrafi_exclusions/{intrafi_exclusion_id}`, but is otherwise the same as
         * [IntrafiExclusionServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: IntrafiExclusionRetrieveParams): CompletableFuture<HttpResponseFor<IntrafiExclusion>> =
            retrieve(
              params, RequestOptions.none()
            )

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(params: IntrafiExclusionRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<IntrafiExclusion>>

        /**
         * Returns a raw HTTP response for `get /intrafi_exclusions`, but is otherwise the
         * same as [IntrafiExclusionServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<IntrafiExclusionListPageAsync>> = list(IntrafiExclusionListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(params: IntrafiExclusionListParams = IntrafiExclusionListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<IntrafiExclusionListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(params: IntrafiExclusionListParams = IntrafiExclusionListParams.none()): CompletableFuture<HttpResponseFor<IntrafiExclusionListPageAsync>> =
            list(
              params, RequestOptions.none()
            )

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<IntrafiExclusionListPageAsync>> = list(IntrafiExclusionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for
         * `post /intrafi_exclusions/{intrafi_exclusion_id}/archive`, but is otherwise the
         * same as [IntrafiExclusionServiceAsync.archive].
         */
        @MustBeClosed
        fun archive(params: IntrafiExclusionArchiveParams): CompletableFuture<HttpResponseFor<IntrafiExclusion>> =
            archive(
              params, RequestOptions.none()
            )

        /** @see [archive] */
        @MustBeClosed
        fun archive(params: IntrafiExclusionArchiveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<IntrafiExclusion>>
    }
}
