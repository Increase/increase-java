// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.checktransfers.CheckTransfer
import com.increase.api.models.simulations.checktransfers.CheckTransferMailParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface CheckTransferServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CheckTransferServiceAsync

    /**
     * Simulates the mailing of a [Check Transfer](#check-transfers), which happens periodically
     * throughout the day in production but can be sped up in sandbox. This transfer must first have
     * a `status` of `pending_approval` or `pending_submission`.
     */
    fun mail(checkTransferId: String): CompletableFuture<CheckTransfer> =
        mail(checkTransferId, CheckTransferMailParams.none())

    /** @see [mail] */
    fun mail(
        checkTransferId: String,
        params: CheckTransferMailParams = CheckTransferMailParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CheckTransfer> =
        mail(params.toBuilder().checkTransferId(checkTransferId).build(), requestOptions)

    /** @see [mail] */
    fun mail(
        checkTransferId: String,
        params: CheckTransferMailParams = CheckTransferMailParams.none(),
    ): CompletableFuture<CheckTransfer> = mail(checkTransferId, params, RequestOptions.none())

    /** @see [mail] */
    fun mail(
        params: CheckTransferMailParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CheckTransfer>

    /** @see [mail] */
    fun mail(params: CheckTransferMailParams): CompletableFuture<CheckTransfer> =
        mail(params, RequestOptions.none())

    /** @see [mail] */
    fun mail(
        checkTransferId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CheckTransfer> =
        mail(checkTransferId, CheckTransferMailParams.none(), requestOptions)

    /**
     * A view of [CheckTransferServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CheckTransferServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /simulations/check_transfers/{check_transfer_id}/mail`, but is otherwise the same as
         * [CheckTransferServiceAsync.mail].
         */
        fun mail(checkTransferId: String): CompletableFuture<HttpResponseFor<CheckTransfer>> =
            mail(checkTransferId, CheckTransferMailParams.none())

        /** @see [mail] */
        fun mail(
            checkTransferId: String,
            params: CheckTransferMailParams = CheckTransferMailParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CheckTransfer>> =
            mail(params.toBuilder().checkTransferId(checkTransferId).build(), requestOptions)

        /** @see [mail] */
        fun mail(
            checkTransferId: String,
            params: CheckTransferMailParams = CheckTransferMailParams.none(),
        ): CompletableFuture<HttpResponseFor<CheckTransfer>> =
            mail(checkTransferId, params, RequestOptions.none())

        /** @see [mail] */
        fun mail(
            params: CheckTransferMailParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CheckTransfer>>

        /** @see [mail] */
        fun mail(
            params: CheckTransferMailParams
        ): CompletableFuture<HttpResponseFor<CheckTransfer>> = mail(params, RequestOptions.none())

        /** @see [mail] */
        fun mail(
            checkTransferId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CheckTransfer>> =
            mail(checkTransferId, CheckTransferMailParams.none(), requestOptions)
    }
}
