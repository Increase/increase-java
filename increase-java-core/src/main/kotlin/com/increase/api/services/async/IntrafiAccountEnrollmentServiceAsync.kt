// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async

import com.increase.api.core.RequestOptions
import com.increase.api.models.IntrafiAccountEnrollment
import com.increase.api.models.IntrafiAccountEnrollmentCreateParams
import com.increase.api.models.IntrafiAccountEnrollmentListPageAsync
import com.increase.api.models.IntrafiAccountEnrollmentListParams
import com.increase.api.models.IntrafiAccountEnrollmentRetrieveParams
import com.increase.api.models.IntrafiAccountEnrollmentUnenrollParams
import java.util.concurrent.CompletableFuture

interface IntrafiAccountEnrollmentServiceAsync {

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
        params: IntrafiAccountEnrollmentListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IntrafiAccountEnrollmentListPageAsync>

    /** Unenroll an account from IntraFi */
    @JvmOverloads
    fun unenroll(
        params: IntrafiAccountEnrollmentUnenrollParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IntrafiAccountEnrollment>
}
