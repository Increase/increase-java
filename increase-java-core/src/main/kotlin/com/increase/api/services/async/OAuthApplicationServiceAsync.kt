// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.oauthapplications.OAuthApplication
import com.increase.api.models.oauthapplications.OAuthApplicationListParams
import com.increase.api.models.oauthapplications.OAuthApplicationListResponse
import com.increase.api.models.oauthapplications.OAuthApplicationRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface OAuthApplicationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): OAuthApplicationServiceAsync

    /** Retrieve an OAuth Application */
    fun retrieve(oauthApplicationId: String): CompletableFuture<OAuthApplication> =
        retrieve(oauthApplicationId, OAuthApplicationRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        oauthApplicationId: String,
        params: OAuthApplicationRetrieveParams = OAuthApplicationRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OAuthApplication> =
        retrieve(params.toBuilder().oauthApplicationId(oauthApplicationId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        oauthApplicationId: String,
        params: OAuthApplicationRetrieveParams = OAuthApplicationRetrieveParams.none(),
    ): CompletableFuture<OAuthApplication> =
        retrieve(oauthApplicationId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: OAuthApplicationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OAuthApplication>

    /** @see retrieve */
    fun retrieve(params: OAuthApplicationRetrieveParams): CompletableFuture<OAuthApplication> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        oauthApplicationId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<OAuthApplication> =
        retrieve(oauthApplicationId, OAuthApplicationRetrieveParams.none(), requestOptions)

    /** List OAuth Applications */
    fun list(): CompletableFuture<OAuthApplicationListResponse> =
        list(OAuthApplicationListParams.none())

    /** @see list */
    fun list(
        params: OAuthApplicationListParams = OAuthApplicationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OAuthApplicationListResponse>

    /** @see list */
    fun list(
        params: OAuthApplicationListParams = OAuthApplicationListParams.none()
    ): CompletableFuture<OAuthApplicationListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<OAuthApplicationListResponse> =
        list(OAuthApplicationListParams.none(), requestOptions)

    /**
     * A view of [OAuthApplicationServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): OAuthApplicationServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /oauth_applications/{oauth_application_id}`, but is
         * otherwise the same as [OAuthApplicationServiceAsync.retrieve].
         */
        fun retrieve(
            oauthApplicationId: String
        ): CompletableFuture<HttpResponseFor<OAuthApplication>> =
            retrieve(oauthApplicationId, OAuthApplicationRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            oauthApplicationId: String,
            params: OAuthApplicationRetrieveParams = OAuthApplicationRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OAuthApplication>> =
            retrieve(
                params.toBuilder().oauthApplicationId(oauthApplicationId).build(),
                requestOptions,
            )

        /** @see retrieve */
        fun retrieve(
            oauthApplicationId: String,
            params: OAuthApplicationRetrieveParams = OAuthApplicationRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<OAuthApplication>> =
            retrieve(oauthApplicationId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: OAuthApplicationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OAuthApplication>>

        /** @see retrieve */
        fun retrieve(
            params: OAuthApplicationRetrieveParams
        ): CompletableFuture<HttpResponseFor<OAuthApplication>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            oauthApplicationId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<OAuthApplication>> =
            retrieve(oauthApplicationId, OAuthApplicationRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /oauth_applications`, but is otherwise the same as
         * [OAuthApplicationServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<OAuthApplicationListResponse>> =
            list(OAuthApplicationListParams.none())

        /** @see list */
        fun list(
            params: OAuthApplicationListParams = OAuthApplicationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OAuthApplicationListResponse>>

        /** @see list */
        fun list(
            params: OAuthApplicationListParams = OAuthApplicationListParams.none()
        ): CompletableFuture<HttpResponseFor<OAuthApplicationListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<OAuthApplicationListResponse>> =
            list(OAuthApplicationListParams.none(), requestOptions)
    }
}
