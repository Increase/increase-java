// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.ProofOfAuthorizationRequest
import com.increase.api.models.ProofOfAuthorizationRequestListPageAsync
import com.increase.api.models.ProofOfAuthorizationRequestListParams
import com.increase.api.models.ProofOfAuthorizationRequestRetrieveParams
import java.util.concurrent.CompletableFuture

interface ProofOfAuthorizationRequestServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve a Proof of Authorization Request */
    fun retrieve(
        params: ProofOfAuthorizationRequestRetrieveParams
    ): CompletableFuture<ProofOfAuthorizationRequest> = retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: ProofOfAuthorizationRequestRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProofOfAuthorizationRequest>

    /** List Proof of Authorization Requests */
    fun list(): CompletableFuture<ProofOfAuthorizationRequestListPageAsync> =
        list(ProofOfAuthorizationRequestListParams.none())

    /** @see [list] */
    fun list(
        params: ProofOfAuthorizationRequestListParams =
            ProofOfAuthorizationRequestListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProofOfAuthorizationRequestListPageAsync>

    /** @see [list] */
    fun list(
        params: ProofOfAuthorizationRequestListParams = ProofOfAuthorizationRequestListParams.none()
    ): CompletableFuture<ProofOfAuthorizationRequestListPageAsync> =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        requestOptions: RequestOptions
    ): CompletableFuture<ProofOfAuthorizationRequestListPageAsync> =
        list(ProofOfAuthorizationRequestListParams.none(), requestOptions)

    /**
     * A view of [ProofOfAuthorizationRequestServiceAsync] that provides access to raw HTTP
     * responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get
         * /proof_of_authorization_requests/{proof_of_authorization_request_id}`, but is otherwise
         * the same as [ProofOfAuthorizationRequestServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: ProofOfAuthorizationRequestRetrieveParams
        ): CompletableFuture<HttpResponseFor<ProofOfAuthorizationRequest>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: ProofOfAuthorizationRequestRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProofOfAuthorizationRequest>>

        /**
         * Returns a raw HTTP response for `get /proof_of_authorization_requests`, but is otherwise
         * the same as [ProofOfAuthorizationRequestServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<ProofOfAuthorizationRequestListPageAsync>> =
            list(ProofOfAuthorizationRequestListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: ProofOfAuthorizationRequestListParams =
                ProofOfAuthorizationRequestListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProofOfAuthorizationRequestListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: ProofOfAuthorizationRequestListParams =
                ProofOfAuthorizationRequestListParams.none()
        ): CompletableFuture<HttpResponseFor<ProofOfAuthorizationRequestListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ProofOfAuthorizationRequestListPageAsync>> =
            list(ProofOfAuthorizationRequestListParams.none(), requestOptions)
    }
}
