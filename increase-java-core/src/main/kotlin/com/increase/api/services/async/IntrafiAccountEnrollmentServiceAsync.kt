// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.intrafiaccountenrollments.IntrafiAccountEnrollment
import com.increase.api.models.intrafiaccountenrollments.IntrafiAccountEnrollmentCreateParams
import com.increase.api.models.intrafiaccountenrollments.IntrafiAccountEnrollmentListPageAsync
import com.increase.api.models.intrafiaccountenrollments.IntrafiAccountEnrollmentListParams
import com.increase.api.models.intrafiaccountenrollments.IntrafiAccountEnrollmentRetrieveParams
import com.increase.api.models.intrafiaccountenrollments.IntrafiAccountEnrollmentUnenrollParams
import java.util.concurrent.CompletableFuture

interface IntrafiAccountEnrollmentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for
     * each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Enroll an account in the IntraFi deposit sweep network */
    fun create(params: IntrafiAccountEnrollmentCreateParams): CompletableFuture<IntrafiAccountEnrollment> =
        create(
          params, RequestOptions.none()
        )

    /** @see [create] */
    fun create(params: IntrafiAccountEnrollmentCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<IntrafiAccountEnrollment>

    /** Get an IntraFi Account Enrollment */
    fun retrieve(params: IntrafiAccountEnrollmentRetrieveParams): CompletableFuture<IntrafiAccountEnrollment> =
        retrieve(
          params, RequestOptions.none()
        )

    /** @see [retrieve] */
    fun retrieve(params: IntrafiAccountEnrollmentRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<IntrafiAccountEnrollment>

    /** List IntraFi Account Enrollments */
    fun list(): CompletableFuture<IntrafiAccountEnrollmentListPageAsync> = list(IntrafiAccountEnrollmentListParams.none())

    /** @see [list] */
    fun list(params: IntrafiAccountEnrollmentListParams = IntrafiAccountEnrollmentListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<IntrafiAccountEnrollmentListPageAsync>

    /** @see [list] */
    fun list(params: IntrafiAccountEnrollmentListParams = IntrafiAccountEnrollmentListParams.none()): CompletableFuture<IntrafiAccountEnrollmentListPageAsync> =
        list(
          params, RequestOptions.none()
        )

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<IntrafiAccountEnrollmentListPageAsync> = list(IntrafiAccountEnrollmentListParams.none(), requestOptions)

    /** Unenroll an account from IntraFi */
    fun unenroll(params: IntrafiAccountEnrollmentUnenrollParams): CompletableFuture<IntrafiAccountEnrollment> =
        unenroll(
          params, RequestOptions.none()
        )

    /** @see [unenroll] */
    fun unenroll(params: IntrafiAccountEnrollmentUnenrollParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<IntrafiAccountEnrollment>

    /**
     * A view of [IntrafiAccountEnrollmentServiceAsync] that provides access to raw
     * HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /intrafi_account_enrollments`, but is
         * otherwise the same as [IntrafiAccountEnrollmentServiceAsync.create].
         */
        @MustBeClosed
        fun create(params: IntrafiAccountEnrollmentCreateParams): CompletableFuture<HttpResponseFor<IntrafiAccountEnrollment>> =
            create(
              params, RequestOptions.none()
            )

        /** @see [create] */
        @MustBeClosed
        fun create(params: IntrafiAccountEnrollmentCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<IntrafiAccountEnrollment>>

        /**
         * Returns a raw HTTP response for
         * `get /intrafi_account_enrollments/{intrafi_account_enrollment_id}`, but is
         * otherwise the same as [IntrafiAccountEnrollmentServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: IntrafiAccountEnrollmentRetrieveParams): CompletableFuture<HttpResponseFor<IntrafiAccountEnrollment>> =
            retrieve(
              params, RequestOptions.none()
            )

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(params: IntrafiAccountEnrollmentRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<IntrafiAccountEnrollment>>

        /**
         * Returns a raw HTTP response for `get /intrafi_account_enrollments`, but is
         * otherwise the same as [IntrafiAccountEnrollmentServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<IntrafiAccountEnrollmentListPageAsync>> = list(IntrafiAccountEnrollmentListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(params: IntrafiAccountEnrollmentListParams = IntrafiAccountEnrollmentListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<IntrafiAccountEnrollmentListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(params: IntrafiAccountEnrollmentListParams = IntrafiAccountEnrollmentListParams.none()): CompletableFuture<HttpResponseFor<IntrafiAccountEnrollmentListPageAsync>> =
            list(
              params, RequestOptions.none()
            )

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<IntrafiAccountEnrollmentListPageAsync>> = list(IntrafiAccountEnrollmentListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for
         * `post /intrafi_account_enrollments/{intrafi_account_enrollment_id}/unenroll`,
         * but is otherwise the same as [IntrafiAccountEnrollmentServiceAsync.unenroll].
         */
        @MustBeClosed
        fun unenroll(params: IntrafiAccountEnrollmentUnenrollParams): CompletableFuture<HttpResponseFor<IntrafiAccountEnrollment>> =
            unenroll(
              params, RequestOptions.none()
            )

        /** @see [unenroll] */
        @MustBeClosed
        fun unenroll(params: IntrafiAccountEnrollmentUnenrollParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<IntrafiAccountEnrollment>>
    }
}
