// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

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
    @JvmOverloads
    fun retrieve(
        params: ProofOfAuthorizationRequestRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProofOfAuthorizationRequest>

    /** List Proof of Authorization Requests */
    @JvmOverloads
    fun list(
        params: ProofOfAuthorizationRequestListParams =
            ProofOfAuthorizationRequestListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProofOfAuthorizationRequestListPageAsync>

    /** List Proof of Authorization Requests */
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
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: ProofOfAuthorizationRequestRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProofOfAuthorizationRequest>>

        /**
         * Returns a raw HTTP response for `get /proof_of_authorization_requests`, but is otherwise
         * the same as [ProofOfAuthorizationRequestServiceAsync.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: ProofOfAuthorizationRequestListParams =
                ProofOfAuthorizationRequestListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProofOfAuthorizationRequestListPageAsync>>

        /**
         * Returns a raw HTTP response for `get /proof_of_authorization_requests`, but is otherwise
         * the same as [ProofOfAuthorizationRequestServiceAsync.list].
         */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ProofOfAuthorizationRequestListPageAsync>> =
            list(ProofOfAuthorizationRequestListParams.none(), requestOptions)
    }
}
