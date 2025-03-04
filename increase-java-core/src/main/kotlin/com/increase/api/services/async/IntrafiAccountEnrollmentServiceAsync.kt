// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.IntrafiAccountEnrollment
import com.increase.api.models.IntrafiAccountEnrollmentCreateParams
import com.increase.api.models.IntrafiAccountEnrollmentListPageAsync
import com.increase.api.models.IntrafiAccountEnrollmentListParams
import com.increase.api.models.IntrafiAccountEnrollmentRetrieveParams
import com.increase.api.models.IntrafiAccountEnrollmentUnenrollParams
import java.util.concurrent.CompletableFuture

interface IntrafiAccountEnrollmentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Enroll an account in the IntraFi deposit sweep network */
    @JvmOverloads
    fun create(
        params: IntrafiAccountEnrollmentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IntrafiAccountEnrollment>

    /** Get an IntraFi Account Enrollment */
    @JvmOverloads
    fun retrieve(
        params: IntrafiAccountEnrollmentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IntrafiAccountEnrollment>

    /** List IntraFi Account Enrollments */
    @JvmOverloads
    fun list(
        params: IntrafiAccountEnrollmentListParams = IntrafiAccountEnrollmentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IntrafiAccountEnrollmentListPageAsync>

    /** List IntraFi Account Enrollments */
    fun list(
        requestOptions: RequestOptions
    ): CompletableFuture<IntrafiAccountEnrollmentListPageAsync> =
        list(IntrafiAccountEnrollmentListParams.none(), requestOptions)

    /** Unenroll an account from IntraFi */
    @JvmOverloads
    fun unenroll(
        params: IntrafiAccountEnrollmentUnenrollParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IntrafiAccountEnrollment>

    /**
     * A view of [IntrafiAccountEnrollmentServiceAsync] that provides access to raw HTTP responses
     * for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /intrafi_account_enrollments`, but is otherwise the
         * same as [IntrafiAccountEnrollmentServiceAsync.create].
         */
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: IntrafiAccountEnrollmentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IntrafiAccountEnrollment>>

        /**
         * Returns a raw HTTP response for `get
         * /intrafi_account_enrollments/{intrafi_account_enrollment_id}`, but is otherwise the same
         * as [IntrafiAccountEnrollmentServiceAsync.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: IntrafiAccountEnrollmentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IntrafiAccountEnrollment>>

        /**
         * Returns a raw HTTP response for `get /intrafi_account_enrollments`, but is otherwise the
         * same as [IntrafiAccountEnrollmentServiceAsync.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: IntrafiAccountEnrollmentListParams = IntrafiAccountEnrollmentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IntrafiAccountEnrollmentListPageAsync>>

        /**
         * Returns a raw HTTP response for `get /intrafi_account_enrollments`, but is otherwise the
         * same as [IntrafiAccountEnrollmentServiceAsync.list].
         */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<IntrafiAccountEnrollmentListPageAsync>> =
            list(IntrafiAccountEnrollmentListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /intrafi_account_enrollments/{intrafi_account_enrollment_id}/unenroll`, but is otherwise
         * the same as [IntrafiAccountEnrollmentServiceAsync.unenroll].
         */
        @JvmOverloads
        @MustBeClosed
        fun unenroll(
            params: IntrafiAccountEnrollmentUnenrollParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IntrafiAccountEnrollment>>
    }
}
