// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.oauthapplications.OAuthApplication
import com.increase.api.models.oauthapplications.OAuthApplicationListPage
import com.increase.api.models.oauthapplications.OAuthApplicationListParams
import com.increase.api.models.oauthapplications.OAuthApplicationRetrieveParams

interface OAuthApplicationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve an OAuth Application */
    fun retrieve(oauthApplicationId: String): OAuthApplication =
        retrieve(oauthApplicationId, OAuthApplicationRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        oauthApplicationId: String,
        params: OAuthApplicationRetrieveParams = OAuthApplicationRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OAuthApplication =
        retrieve(params.toBuilder().oauthApplicationId(oauthApplicationId).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        oauthApplicationId: String,
        params: OAuthApplicationRetrieveParams = OAuthApplicationRetrieveParams.none(),
    ): OAuthApplication = retrieve(oauthApplicationId, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: OAuthApplicationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OAuthApplication

    /** @see [retrieve] */
    fun retrieve(params: OAuthApplicationRetrieveParams): OAuthApplication =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(oauthApplicationId: String, requestOptions: RequestOptions): OAuthApplication =
        retrieve(oauthApplicationId, OAuthApplicationRetrieveParams.none(), requestOptions)

    /** List OAuth Applications */
    fun list(): OAuthApplicationListPage = list(OAuthApplicationListParams.none())

    /** @see [list] */
    fun list(
        params: OAuthApplicationListParams = OAuthApplicationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OAuthApplicationListPage

    /** @see [list] */
    fun list(
        params: OAuthApplicationListParams = OAuthApplicationListParams.none()
    ): OAuthApplicationListPage = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): OAuthApplicationListPage =
        list(OAuthApplicationListParams.none(), requestOptions)

    /**
     * A view of [OAuthApplicationService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /oauth_applications/{oauth_application_id}`, but is
         * otherwise the same as [OAuthApplicationService.retrieve].
         */
        @MustBeClosed
        fun retrieve(oauthApplicationId: String): HttpResponseFor<OAuthApplication> =
            retrieve(oauthApplicationId, OAuthApplicationRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            oauthApplicationId: String,
            params: OAuthApplicationRetrieveParams = OAuthApplicationRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OAuthApplication> =
            retrieve(
                params.toBuilder().oauthApplicationId(oauthApplicationId).build(),
                requestOptions,
            )

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            oauthApplicationId: String,
            params: OAuthApplicationRetrieveParams = OAuthApplicationRetrieveParams.none(),
        ): HttpResponseFor<OAuthApplication> =
            retrieve(oauthApplicationId, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: OAuthApplicationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OAuthApplication>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(params: OAuthApplicationRetrieveParams): HttpResponseFor<OAuthApplication> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            oauthApplicationId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OAuthApplication> =
            retrieve(oauthApplicationId, OAuthApplicationRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /oauth_applications`, but is otherwise the same as
         * [OAuthApplicationService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<OAuthApplicationListPage> =
            list(OAuthApplicationListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: OAuthApplicationListParams = OAuthApplicationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OAuthApplicationListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: OAuthApplicationListParams = OAuthApplicationListParams.none()
        ): HttpResponseFor<OAuthApplicationListPage> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<OAuthApplicationListPage> =
            list(OAuthApplicationListParams.none(), requestOptions)
    }
}
