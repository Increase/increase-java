// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.IntrafiAccountEnrollment
import com.increase.api.models.IntrafiAccountEnrollmentCreateParams
import com.increase.api.models.IntrafiAccountEnrollmentListPage
import com.increase.api.models.IntrafiAccountEnrollmentListParams
import com.increase.api.models.IntrafiAccountEnrollmentRetrieveParams
import com.increase.api.models.IntrafiAccountEnrollmentUnenrollParams

interface IntrafiAccountEnrollmentService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Enroll an account in the IntraFi deposit sweep network */
    @JvmOverloads
    fun create(
        params: IntrafiAccountEnrollmentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IntrafiAccountEnrollment

    /** Get an IntraFi Account Enrollment */
    @JvmOverloads
    fun retrieve(
        params: IntrafiAccountEnrollmentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IntrafiAccountEnrollment

    /** List IntraFi Account Enrollments */
    @JvmOverloads
    fun list(
        params: IntrafiAccountEnrollmentListParams = IntrafiAccountEnrollmentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IntrafiAccountEnrollmentListPage

    /** List IntraFi Account Enrollments */
    fun list(requestOptions: RequestOptions): IntrafiAccountEnrollmentListPage =
        list(IntrafiAccountEnrollmentListParams.none(), requestOptions)

    /** Unenroll an account from IntraFi */
    @JvmOverloads
    fun unenroll(
        params: IntrafiAccountEnrollmentUnenrollParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IntrafiAccountEnrollment

    /**
     * A view of [IntrafiAccountEnrollmentService] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /intrafi_account_enrollments`, but is otherwise the
         * same as [IntrafiAccountEnrollmentService.create].
         */
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: IntrafiAccountEnrollmentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IntrafiAccountEnrollment>

        /**
         * Returns a raw HTTP response for `get
         * /intrafi_account_enrollments/{intrafi_account_enrollment_id}`, but is otherwise the same
         * as [IntrafiAccountEnrollmentService.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: IntrafiAccountEnrollmentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IntrafiAccountEnrollment>

        /**
         * Returns a raw HTTP response for `get /intrafi_account_enrollments`, but is otherwise the
         * same as [IntrafiAccountEnrollmentService.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: IntrafiAccountEnrollmentListParams = IntrafiAccountEnrollmentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IntrafiAccountEnrollmentListPage>

        /**
         * Returns a raw HTTP response for `get /intrafi_account_enrollments`, but is otherwise the
         * same as [IntrafiAccountEnrollmentService.list].
         */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<IntrafiAccountEnrollmentListPage> =
            list(IntrafiAccountEnrollmentListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /intrafi_account_enrollments/{intrafi_account_enrollment_id}/unenroll`, but is otherwise
         * the same as [IntrafiAccountEnrollmentService.unenroll].
         */
        @JvmOverloads
        @MustBeClosed
        fun unenroll(
            params: IntrafiAccountEnrollmentUnenrollParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IntrafiAccountEnrollment>
    }
}
