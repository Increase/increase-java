// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.intrafiexclusions.IntrafiExclusion
import com.increase.api.models.intrafiexclusions.IntrafiExclusionArchiveParams
import com.increase.api.models.intrafiexclusions.IntrafiExclusionCreateParams
import com.increase.api.models.intrafiexclusions.IntrafiExclusionListPage
import com.increase.api.models.intrafiexclusions.IntrafiExclusionListParams
import com.increase.api.models.intrafiexclusions.IntrafiExclusionRetrieveParams

interface IntrafiExclusionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for
     * each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create an IntraFi Exclusion */
    fun create(params: IntrafiExclusionCreateParams): IntrafiExclusion =
        create(
          params, RequestOptions.none()
        )

    /** @see [create] */
    fun create(params: IntrafiExclusionCreateParams, requestOptions: RequestOptions = RequestOptions.none()): IntrafiExclusion

    /** Get an IntraFi Exclusion */
    fun retrieve(params: IntrafiExclusionRetrieveParams): IntrafiExclusion =
        retrieve(
          params, RequestOptions.none()
        )

    /** @see [retrieve] */
    fun retrieve(params: IntrafiExclusionRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): IntrafiExclusion

    /** List IntraFi Exclusions */
    fun list(): IntrafiExclusionListPage = list(IntrafiExclusionListParams.none())

    /** @see [list] */
    fun list(params: IntrafiExclusionListParams = IntrafiExclusionListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): IntrafiExclusionListPage

    /** @see [list] */
    fun list(params: IntrafiExclusionListParams = IntrafiExclusionListParams.none()): IntrafiExclusionListPage =
        list(
          params, RequestOptions.none()
        )

    /** @see [list] */
    fun list(requestOptions: RequestOptions): IntrafiExclusionListPage = list(IntrafiExclusionListParams.none(), requestOptions)

    /** Archive an IntraFi Exclusion */
    fun archive(params: IntrafiExclusionArchiveParams): IntrafiExclusion =
        archive(
          params, RequestOptions.none()
        )

    /** @see [archive] */
    fun archive(params: IntrafiExclusionArchiveParams, requestOptions: RequestOptions = RequestOptions.none()): IntrafiExclusion

    /**
     * A view of [IntrafiExclusionService] that provides access to raw HTTP responses
     * for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /intrafi_exclusions`, but is otherwise the
         * same as [IntrafiExclusionService.create].
         */
        @MustBeClosed
        fun create(params: IntrafiExclusionCreateParams): HttpResponseFor<IntrafiExclusion> =
            create(
              params, RequestOptions.none()
            )

        /** @see [create] */
        @MustBeClosed
        fun create(params: IntrafiExclusionCreateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<IntrafiExclusion>

        /**
         * Returns a raw HTTP response for
         * `get /intrafi_exclusions/{intrafi_exclusion_id}`, but is otherwise the same as
         * [IntrafiExclusionService.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: IntrafiExclusionRetrieveParams): HttpResponseFor<IntrafiExclusion> =
            retrieve(
              params, RequestOptions.none()
            )

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(params: IntrafiExclusionRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<IntrafiExclusion>

        /**
         * Returns a raw HTTP response for `get /intrafi_exclusions`, but is otherwise the
         * same as [IntrafiExclusionService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<IntrafiExclusionListPage> = list(IntrafiExclusionListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(params: IntrafiExclusionListParams = IntrafiExclusionListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<IntrafiExclusionListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(params: IntrafiExclusionListParams = IntrafiExclusionListParams.none()): HttpResponseFor<IntrafiExclusionListPage> =
            list(
              params, RequestOptions.none()
            )

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<IntrafiExclusionListPage> = list(IntrafiExclusionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for
         * `post /intrafi_exclusions/{intrafi_exclusion_id}/archive`, but is otherwise the
         * same as [IntrafiExclusionService.archive].
         */
        @MustBeClosed
        fun archive(params: IntrafiExclusionArchiveParams): HttpResponseFor<IntrafiExclusion> =
            archive(
              params, RequestOptions.none()
            )

        /** @see [archive] */
        @MustBeClosed
        fun archive(params: IntrafiExclusionArchiveParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<IntrafiExclusion>
    }
}
