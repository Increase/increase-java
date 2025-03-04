// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.IntrafiExclusion
import com.increase.api.models.IntrafiExclusionArchiveParams
import com.increase.api.models.IntrafiExclusionCreateParams
import com.increase.api.models.IntrafiExclusionListPage
import com.increase.api.models.IntrafiExclusionListParams
import com.increase.api.models.IntrafiExclusionRetrieveParams

interface IntrafiExclusionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create an IntraFi Exclusion */
    @JvmOverloads
    fun create(
        params: IntrafiExclusionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IntrafiExclusion

    /** Get an IntraFi Exclusion */
    @JvmOverloads
    fun retrieve(
        params: IntrafiExclusionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IntrafiExclusion

    /** List IntraFi Exclusions */
    @JvmOverloads
    fun list(
        params: IntrafiExclusionListParams = IntrafiExclusionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IntrafiExclusionListPage

    /** List IntraFi Exclusions */
    fun list(requestOptions: RequestOptions): IntrafiExclusionListPage =
        list(IntrafiExclusionListParams.none(), requestOptions)

    /** Archive an IntraFi Exclusion */
    @JvmOverloads
    fun archive(
        params: IntrafiExclusionArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IntrafiExclusion

    /**
     * A view of [IntrafiExclusionService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /intrafi_exclusions`, but is otherwise the same as
         * [IntrafiExclusionService.create].
         */
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: IntrafiExclusionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IntrafiExclusion>

        /**
         * Returns a raw HTTP response for `get /intrafi_exclusions/{intrafi_exclusion_id}`, but is
         * otherwise the same as [IntrafiExclusionService.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: IntrafiExclusionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IntrafiExclusion>

        /**
         * Returns a raw HTTP response for `get /intrafi_exclusions`, but is otherwise the same as
         * [IntrafiExclusionService.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: IntrafiExclusionListParams = IntrafiExclusionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IntrafiExclusionListPage>

        /**
         * Returns a raw HTTP response for `get /intrafi_exclusions`, but is otherwise the same as
         * [IntrafiExclusionService.list].
         */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<IntrafiExclusionListPage> =
            list(IntrafiExclusionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /intrafi_exclusions/{intrafi_exclusion_id}/archive`, but is otherwise the same as
         * [IntrafiExclusionService.archive].
         */
        @JvmOverloads
        @MustBeClosed
        fun archive(
            params: IntrafiExclusionArchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IntrafiExclusion>
    }
}
