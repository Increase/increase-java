// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.ProofOfAuthorizationRequestSubmission
import com.increase.api.models.ProofOfAuthorizationRequestSubmissionCreateParams
import com.increase.api.models.ProofOfAuthorizationRequestSubmissionListPageAsync
import com.increase.api.models.ProofOfAuthorizationRequestSubmissionListParams
import com.increase.api.models.ProofOfAuthorizationRequestSubmissionRetrieveParams
import java.util.concurrent.CompletableFuture

interface ProofOfAuthorizationRequestSubmissionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Submit Proof of Authorization */
    @JvmOverloads
    fun create(
        params: ProofOfAuthorizationRequestSubmissionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProofOfAuthorizationRequestSubmission>

    /** Retrieve a Proof of Authorization Request Submission */
    @JvmOverloads
    fun retrieve(
        params: ProofOfAuthorizationRequestSubmissionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProofOfAuthorizationRequestSubmission>

    /** List Proof of Authorization Request Submissions */
    @JvmOverloads
    fun list(
        params: ProofOfAuthorizationRequestSubmissionListParams =
            ProofOfAuthorizationRequestSubmissionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProofOfAuthorizationRequestSubmissionListPageAsync>

    /** List Proof of Authorization Request Submissions */
    fun list(
        requestOptions: RequestOptions
    ): CompletableFuture<ProofOfAuthorizationRequestSubmissionListPageAsync> =
        list(ProofOfAuthorizationRequestSubmissionListParams.none(), requestOptions)

    /**
     * A view of [ProofOfAuthorizationRequestSubmissionServiceAsync] that provides access to raw
     * HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /proof_of_authorization_request_submissions`, but
         * is otherwise the same as [ProofOfAuthorizationRequestSubmissionServiceAsync.create].
         */
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: ProofOfAuthorizationRequestSubmissionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProofOfAuthorizationRequestSubmission>>

        /**
         * Returns a raw HTTP response for `get
         * /proof_of_authorization_request_submissions/{proof_of_authorization_request_submission_id}`,
         * but is otherwise the same as
         * [ProofOfAuthorizationRequestSubmissionServiceAsync.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: ProofOfAuthorizationRequestSubmissionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProofOfAuthorizationRequestSubmission>>

        /**
         * Returns a raw HTTP response for `get /proof_of_authorization_request_submissions`, but is
         * otherwise the same as [ProofOfAuthorizationRequestSubmissionServiceAsync.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: ProofOfAuthorizationRequestSubmissionListParams =
                ProofOfAuthorizationRequestSubmissionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProofOfAuthorizationRequestSubmissionListPageAsync>>

        /**
         * Returns a raw HTTP response for `get /proof_of_authorization_request_submissions`, but is
         * otherwise the same as [ProofOfAuthorizationRequestSubmissionServiceAsync.list].
         */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ProofOfAuthorizationRequestSubmissionListPageAsync>> =
            list(ProofOfAuthorizationRequestSubmissionListParams.none(), requestOptions)
    }
}
