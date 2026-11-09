// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking.simulations

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.checkbooks.Checkbook
import com.increase.api.models.simulations.checkbooks.CheckbookMailParams
import java.util.function.Consumer

interface CheckbookService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CheckbookService

    /**
     * Simulates the mailing of a [Checkbook](#checkbooks), which happens periodically throughout
     * the day in production but can be sped up in sandbox. This Checkbook must have a `status` of
     * `pending_submission` or `pending_mailing`.
     */
    fun mail(checkbookId: String): Checkbook = mail(checkbookId, CheckbookMailParams.none())

    /** @see mail */
    fun mail(
        checkbookId: String,
        params: CheckbookMailParams = CheckbookMailParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Checkbook = mail(params.toBuilder().checkbookId(checkbookId).build(), requestOptions)

    /** @see mail */
    fun mail(
        checkbookId: String,
        params: CheckbookMailParams = CheckbookMailParams.none(),
    ): Checkbook = mail(checkbookId, params, RequestOptions.none())

    /** @see mail */
    fun mail(
        params: CheckbookMailParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Checkbook

    /** @see mail */
    fun mail(params: CheckbookMailParams): Checkbook = mail(params, RequestOptions.none())

    /** @see mail */
    fun mail(checkbookId: String, requestOptions: RequestOptions): Checkbook =
        mail(checkbookId, CheckbookMailParams.none(), requestOptions)

    /** A view of [CheckbookService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): CheckbookService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /simulations/checkbooks/{checkbook_id}/mail`, but
         * is otherwise the same as [CheckbookService.mail].
         */
        @MustBeClosed
        fun mail(checkbookId: String): HttpResponseFor<Checkbook> =
            mail(checkbookId, CheckbookMailParams.none())

        /** @see mail */
        @MustBeClosed
        fun mail(
            checkbookId: String,
            params: CheckbookMailParams = CheckbookMailParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Checkbook> =
            mail(params.toBuilder().checkbookId(checkbookId).build(), requestOptions)

        /** @see mail */
        @MustBeClosed
        fun mail(
            checkbookId: String,
            params: CheckbookMailParams = CheckbookMailParams.none(),
        ): HttpResponseFor<Checkbook> = mail(checkbookId, params, RequestOptions.none())

        /** @see mail */
        @MustBeClosed
        fun mail(
            params: CheckbookMailParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Checkbook>

        /** @see mail */
        @MustBeClosed
        fun mail(params: CheckbookMailParams): HttpResponseFor<Checkbook> =
            mail(params, RequestOptions.none())

        /** @see mail */
        @MustBeClosed
        fun mail(checkbookId: String, requestOptions: RequestOptions): HttpResponseFor<Checkbook> =
            mail(checkbookId, CheckbookMailParams.none(), requestOptions)
    }
}
