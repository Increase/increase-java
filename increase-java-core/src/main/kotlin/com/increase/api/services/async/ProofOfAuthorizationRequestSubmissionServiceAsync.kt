// File generated from our OpenAPI spec by Stainless.

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
    fun create(
        params: ProofOfAuthorizationRequestSubmissionCreateParams
    ): CompletableFuture<ProofOfAuthorizationRequestSubmission> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: ProofOfAuthorizationRequestSubmissionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProofOfAuthorizationRequestSubmission>

    /** Retrieve a Proof of Authorization Request Submission */
    fun retrieve(
        params: ProofOfAuthorizationRequestSubmissionRetrieveParams
    ): CompletableFuture<ProofOfAuthorizationRequestSubmission> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: ProofOfAuthorizationRequestSubmissionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProofOfAuthorizationRequestSubmission>

    /** List Proof of Authorization Request Submissions */
    fun list(): CompletableFuture<ProofOfAuthorizationRequestSubmissionListPageAsync> =
        list(ProofOfAuthorizationRequestSubmissionListParams.none())

    /** @see [list] */
    fun list(
        params: ProofOfAuthorizationRequestSubmissionListParams =
            ProofOfAuthorizationRequestSubmissionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProofOfAuthorizationRequestSubmissionListPageAsync>

    /** @see [list] */
    fun list(
        params: ProofOfAuthorizationRequestSubmissionListParams =
            ProofOfAuthorizationRequestSubmissionListParams.none()
    ): CompletableFuture<ProofOfAuthorizationRequestSubmissionListPageAsync> =
        list(params, RequestOptions.none())

    /** @see [list] */
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
        @MustBeClosed
        fun create(
            params: ProofOfAuthorizationRequestSubmissionCreateParams
        ): CompletableFuture<HttpResponseFor<ProofOfAuthorizationRequestSubmission>> =
            create(params, RequestOptions.none())

        /** @see [create] */
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
        @MustBeClosed
        fun retrieve(
            params: ProofOfAuthorizationRequestSubmissionRetrieveParams
        ): CompletableFuture<HttpResponseFor<ProofOfAuthorizationRequestSubmission>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: ProofOfAuthorizationRequestSubmissionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProofOfAuthorizationRequestSubmission>>

        /**
         * Returns a raw HTTP response for `get /proof_of_authorization_request_submissions`, but is
         * otherwise the same as [ProofOfAuthorizationRequestSubmissionServiceAsync.list].
         */
        @MustBeClosed
        fun list():
            CompletableFuture<HttpResponseFor<ProofOfAuthorizationRequestSubmissionListPageAsync>> =
            list(ProofOfAuthorizationRequestSubmissionListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: ProofOfAuthorizationRequestSubmissionListParams =
                ProofOfAuthorizationRequestSubmissionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProofOfAuthorizationRequestSubmissionListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: ProofOfAuthorizationRequestSubmissionListParams =
                ProofOfAuthorizationRequestSubmissionListParams.none()
        ): CompletableFuture<HttpResponseFor<ProofOfAuthorizationRequestSubmissionListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ProofOfAuthorizationRequestSubmissionListPageAsync>> =
            list(ProofOfAuthorizationRequestSubmissionListParams.none(), requestOptions)
    }
}
