// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.proofofauthorizationrequests.ProofOfAuthorizationRequest
import com.increase.api.models.proofofauthorizationrequests.ProofOfAuthorizationRequestListPage
import com.increase.api.models.proofofauthorizationrequests.ProofOfAuthorizationRequestListParams
import com.increase.api.models.proofofauthorizationrequests.ProofOfAuthorizationRequestRetrieveParams

interface ProofOfAuthorizationRequestService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for
     * each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve a Proof of Authorization Request */
    fun retrieve(params: ProofOfAuthorizationRequestRetrieveParams): ProofOfAuthorizationRequest =
        retrieve(
          params, RequestOptions.none()
        )

    /** @see [retrieve] */
    fun retrieve(params: ProofOfAuthorizationRequestRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): ProofOfAuthorizationRequest

    /** List Proof of Authorization Requests */
    fun list(): ProofOfAuthorizationRequestListPage = list(ProofOfAuthorizationRequestListParams.none())

    /** @see [list] */
    fun list(params: ProofOfAuthorizationRequestListParams = ProofOfAuthorizationRequestListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): ProofOfAuthorizationRequestListPage

    /** @see [list] */
    fun list(params: ProofOfAuthorizationRequestListParams = ProofOfAuthorizationRequestListParams.none()): ProofOfAuthorizationRequestListPage =
        list(
          params, RequestOptions.none()
        )

    /** @see [list] */
    fun list(requestOptions: RequestOptions): ProofOfAuthorizationRequestListPage = list(ProofOfAuthorizationRequestListParams.none(), requestOptions)

    /**
     * A view of [ProofOfAuthorizationRequestService] that provides access to raw HTTP
     * responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for
         * `get /proof_of_authorization_requests/{proof_of_authorization_request_id}`, but
         * is otherwise the same as [ProofOfAuthorizationRequestService.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: ProofOfAuthorizationRequestRetrieveParams): HttpResponseFor<ProofOfAuthorizationRequest> =
            retrieve(
              params, RequestOptions.none()
            )

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(params: ProofOfAuthorizationRequestRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<ProofOfAuthorizationRequest>

        /**
         * Returns a raw HTTP response for `get /proof_of_authorization_requests`, but is
         * otherwise the same as [ProofOfAuthorizationRequestService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<ProofOfAuthorizationRequestListPage> = list(ProofOfAuthorizationRequestListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(params: ProofOfAuthorizationRequestListParams = ProofOfAuthorizationRequestListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<ProofOfAuthorizationRequestListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(params: ProofOfAuthorizationRequestListParams = ProofOfAuthorizationRequestListParams.none()): HttpResponseFor<ProofOfAuthorizationRequestListPage> =
            list(
              params, RequestOptions.none()
            )

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ProofOfAuthorizationRequestListPage> = list(ProofOfAuthorizationRequestListParams.none(), requestOptions)
    }
}
