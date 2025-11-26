// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.intrafiaccountenrollments.IntrafiAccountEnrollment
import com.increase.api.models.intrafiaccountenrollments.IntrafiAccountEnrollmentCreateParams
import com.increase.api.models.intrafiaccountenrollments.IntrafiAccountEnrollmentListParams
import com.increase.api.models.intrafiaccountenrollments.IntrafiAccountEnrollmentListResponse
import com.increase.api.models.intrafiaccountenrollments.IntrafiAccountEnrollmentRetrieveParams
import com.increase.api.models.intrafiaccountenrollments.IntrafiAccountEnrollmentUnenrollParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface IntrafiAccountEnrollmentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): IntrafiAccountEnrollmentServiceAsync

    /** Enroll an account in the IntraFi deposit sweep network */
    fun create(
        params: IntrafiAccountEnrollmentCreateParams
    ): CompletableFuture<IntrafiAccountEnrollment> = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: IntrafiAccountEnrollmentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IntrafiAccountEnrollment>

    /** Get an IntraFi Account Enrollment */
    fun retrieve(intrafiAccountEnrollmentId: String): CompletableFuture<IntrafiAccountEnrollment> =
        retrieve(intrafiAccountEnrollmentId, IntrafiAccountEnrollmentRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        intrafiAccountEnrollmentId: String,
        params: IntrafiAccountEnrollmentRetrieveParams =
            IntrafiAccountEnrollmentRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IntrafiAccountEnrollment> =
        retrieve(
            params.toBuilder().intrafiAccountEnrollmentId(intrafiAccountEnrollmentId).build(),
            requestOptions,
        )

    /** @see retrieve */
    fun retrieve(
        intrafiAccountEnrollmentId: String,
        params: IntrafiAccountEnrollmentRetrieveParams =
            IntrafiAccountEnrollmentRetrieveParams.none(),
    ): CompletableFuture<IntrafiAccountEnrollment> =
        retrieve(intrafiAccountEnrollmentId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: IntrafiAccountEnrollmentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IntrafiAccountEnrollment>

    /** @see retrieve */
    fun retrieve(
        params: IntrafiAccountEnrollmentRetrieveParams
    ): CompletableFuture<IntrafiAccountEnrollment> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        intrafiAccountEnrollmentId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<IntrafiAccountEnrollment> =
        retrieve(
            intrafiAccountEnrollmentId,
            IntrafiAccountEnrollmentRetrieveParams.none(),
            requestOptions,
        )

    /** List IntraFi Account Enrollments */
    fun list(): CompletableFuture<IntrafiAccountEnrollmentListResponse> =
        list(IntrafiAccountEnrollmentListParams.none())

    /** @see list */
    fun list(
        params: IntrafiAccountEnrollmentListParams = IntrafiAccountEnrollmentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IntrafiAccountEnrollmentListResponse>

    /** @see list */
    fun list(
        params: IntrafiAccountEnrollmentListParams = IntrafiAccountEnrollmentListParams.none()
    ): CompletableFuture<IntrafiAccountEnrollmentListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        requestOptions: RequestOptions
    ): CompletableFuture<IntrafiAccountEnrollmentListResponse> =
        list(IntrafiAccountEnrollmentListParams.none(), requestOptions)

    /** Unenroll an account from IntraFi */
    fun unenroll(intrafiAccountEnrollmentId: String): CompletableFuture<IntrafiAccountEnrollment> =
        unenroll(intrafiAccountEnrollmentId, IntrafiAccountEnrollmentUnenrollParams.none())

    /** @see unenroll */
    fun unenroll(
        intrafiAccountEnrollmentId: String,
        params: IntrafiAccountEnrollmentUnenrollParams =
            IntrafiAccountEnrollmentUnenrollParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IntrafiAccountEnrollment> =
        unenroll(
            params.toBuilder().intrafiAccountEnrollmentId(intrafiAccountEnrollmentId).build(),
            requestOptions,
        )

    /** @see unenroll */
    fun unenroll(
        intrafiAccountEnrollmentId: String,
        params: IntrafiAccountEnrollmentUnenrollParams =
            IntrafiAccountEnrollmentUnenrollParams.none(),
    ): CompletableFuture<IntrafiAccountEnrollment> =
        unenroll(intrafiAccountEnrollmentId, params, RequestOptions.none())

    /** @see unenroll */
    fun unenroll(
        params: IntrafiAccountEnrollmentUnenrollParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IntrafiAccountEnrollment>

    /** @see unenroll */
    fun unenroll(
        params: IntrafiAccountEnrollmentUnenrollParams
    ): CompletableFuture<IntrafiAccountEnrollment> = unenroll(params, RequestOptions.none())

    /** @see unenroll */
    fun unenroll(
        intrafiAccountEnrollmentId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<IntrafiAccountEnrollment> =
        unenroll(
            intrafiAccountEnrollmentId,
            IntrafiAccountEnrollmentUnenrollParams.none(),
            requestOptions,
        )

    /**
     * A view of [IntrafiAccountEnrollmentServiceAsync] that provides access to raw HTTP responses
     * for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): IntrafiAccountEnrollmentServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /intrafi_account_enrollments`, but is otherwise the
         * same as [IntrafiAccountEnrollmentServiceAsync.create].
         */
        fun create(
            params: IntrafiAccountEnrollmentCreateParams
        ): CompletableFuture<HttpResponseFor<IntrafiAccountEnrollment>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: IntrafiAccountEnrollmentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IntrafiAccountEnrollment>>

        /**
         * Returns a raw HTTP response for `get
         * /intrafi_account_enrollments/{intrafi_account_enrollment_id}`, but is otherwise the same
         * as [IntrafiAccountEnrollmentServiceAsync.retrieve].
         */
        fun retrieve(
            intrafiAccountEnrollmentId: String
        ): CompletableFuture<HttpResponseFor<IntrafiAccountEnrollment>> =
            retrieve(intrafiAccountEnrollmentId, IntrafiAccountEnrollmentRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            intrafiAccountEnrollmentId: String,
            params: IntrafiAccountEnrollmentRetrieveParams =
                IntrafiAccountEnrollmentRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IntrafiAccountEnrollment>> =
            retrieve(
                params.toBuilder().intrafiAccountEnrollmentId(intrafiAccountEnrollmentId).build(),
                requestOptions,
            )

        /** @see retrieve */
        fun retrieve(
            intrafiAccountEnrollmentId: String,
            params: IntrafiAccountEnrollmentRetrieveParams =
                IntrafiAccountEnrollmentRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<IntrafiAccountEnrollment>> =
            retrieve(intrafiAccountEnrollmentId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: IntrafiAccountEnrollmentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IntrafiAccountEnrollment>>

        /** @see retrieve */
        fun retrieve(
            params: IntrafiAccountEnrollmentRetrieveParams
        ): CompletableFuture<HttpResponseFor<IntrafiAccountEnrollment>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            intrafiAccountEnrollmentId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<IntrafiAccountEnrollment>> =
            retrieve(
                intrafiAccountEnrollmentId,
                IntrafiAccountEnrollmentRetrieveParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /intrafi_account_enrollments`, but is otherwise the
         * same as [IntrafiAccountEnrollmentServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<IntrafiAccountEnrollmentListResponse>> =
            list(IntrafiAccountEnrollmentListParams.none())

        /** @see list */
        fun list(
            params: IntrafiAccountEnrollmentListParams = IntrafiAccountEnrollmentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IntrafiAccountEnrollmentListResponse>>

        /** @see list */
        fun list(
            params: IntrafiAccountEnrollmentListParams = IntrafiAccountEnrollmentListParams.none()
        ): CompletableFuture<HttpResponseFor<IntrafiAccountEnrollmentListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<IntrafiAccountEnrollmentListResponse>> =
            list(IntrafiAccountEnrollmentListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /intrafi_account_enrollments/{intrafi_account_enrollment_id}/unenroll`, but is otherwise
         * the same as [IntrafiAccountEnrollmentServiceAsync.unenroll].
         */
        fun unenroll(
            intrafiAccountEnrollmentId: String
        ): CompletableFuture<HttpResponseFor<IntrafiAccountEnrollment>> =
            unenroll(intrafiAccountEnrollmentId, IntrafiAccountEnrollmentUnenrollParams.none())

        /** @see unenroll */
        fun unenroll(
            intrafiAccountEnrollmentId: String,
            params: IntrafiAccountEnrollmentUnenrollParams =
                IntrafiAccountEnrollmentUnenrollParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IntrafiAccountEnrollment>> =
            unenroll(
                params.toBuilder().intrafiAccountEnrollmentId(intrafiAccountEnrollmentId).build(),
                requestOptions,
            )

        /** @see unenroll */
        fun unenroll(
            intrafiAccountEnrollmentId: String,
            params: IntrafiAccountEnrollmentUnenrollParams =
                IntrafiAccountEnrollmentUnenrollParams.none(),
        ): CompletableFuture<HttpResponseFor<IntrafiAccountEnrollment>> =
            unenroll(intrafiAccountEnrollmentId, params, RequestOptions.none())

        /** @see unenroll */
        fun unenroll(
            params: IntrafiAccountEnrollmentUnenrollParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IntrafiAccountEnrollment>>

        /** @see unenroll */
        fun unenroll(
            params: IntrafiAccountEnrollmentUnenrollParams
        ): CompletableFuture<HttpResponseFor<IntrafiAccountEnrollment>> =
            unenroll(params, RequestOptions.none())

        /** @see unenroll */
        fun unenroll(
            intrafiAccountEnrollmentId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<IntrafiAccountEnrollment>> =
            unenroll(
                intrafiAccountEnrollmentId,
                IntrafiAccountEnrollmentUnenrollParams.none(),
                requestOptions,
            )
    }
}
