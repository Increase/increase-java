// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking.simulations

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.checktransfers.CheckTransfer
import com.increase.api.models.simulations.checktransfers.CheckTransferMailParams
import java.util.function.Consumer

interface CheckTransferService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CheckTransferService

    /**
     * Simulates the mailing of a [Check Transfer](#check-transfers), which happens periodically
     * throughout the day in production but can be sped up in sandbox. This transfer must first have
     * a `status` of `pending_approval` or `pending_submission`.
     */
    fun mail(checkTransferId: String): CheckTransfer =
        mail(checkTransferId, CheckTransferMailParams.none())

    /** @see mail */
    fun mail(
        checkTransferId: String,
        params: CheckTransferMailParams = CheckTransferMailParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CheckTransfer =
        mail(params.toBuilder().checkTransferId(checkTransferId).build(), requestOptions)

    /** @see mail */
    fun mail(
        checkTransferId: String,
        params: CheckTransferMailParams = CheckTransferMailParams.none(),
    ): CheckTransfer = mail(checkTransferId, params, RequestOptions.none())

    /** @see mail */
    fun mail(
        params: CheckTransferMailParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CheckTransfer

    /** @see mail */
    fun mail(params: CheckTransferMailParams): CheckTransfer = mail(params, RequestOptions.none())

    /** @see mail */
    fun mail(checkTransferId: String, requestOptions: RequestOptions): CheckTransfer =
        mail(checkTransferId, CheckTransferMailParams.none(), requestOptions)

    /**
     * A view of [CheckTransferService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CheckTransferService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /simulations/check_transfers/{check_transfer_id}/mail`, but is otherwise the same as
         * [CheckTransferService.mail].
         */
        @MustBeClosed
        fun mail(checkTransferId: String): HttpResponseFor<CheckTransfer> =
            mail(checkTransferId, CheckTransferMailParams.none())

        /** @see mail */
        @MustBeClosed
        fun mail(
            checkTransferId: String,
            params: CheckTransferMailParams = CheckTransferMailParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CheckTransfer> =
            mail(params.toBuilder().checkTransferId(checkTransferId).build(), requestOptions)

        /** @see mail */
        @MustBeClosed
        fun mail(
            checkTransferId: String,
            params: CheckTransferMailParams = CheckTransferMailParams.none(),
        ): HttpResponseFor<CheckTransfer> = mail(checkTransferId, params, RequestOptions.none())

        /** @see mail */
        @MustBeClosed
        fun mail(
            params: CheckTransferMailParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CheckTransfer>

        /** @see mail */
        @MustBeClosed
        fun mail(params: CheckTransferMailParams): HttpResponseFor<CheckTransfer> =
            mail(params, RequestOptions.none())

        /** @see mail */
        @MustBeClosed
        fun mail(
            checkTransferId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CheckTransfer> =
            mail(checkTransferId, CheckTransferMailParams.none(), requestOptions)
    }
}
