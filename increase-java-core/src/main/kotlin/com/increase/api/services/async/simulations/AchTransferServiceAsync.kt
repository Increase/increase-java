// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.AchTransfer
import com.increase.api.models.SimulationAchTransferAcknowledgeParams
import com.increase.api.models.SimulationAchTransferCreateNotificationOfChangeParams
import com.increase.api.models.SimulationAchTransferReturnParams
import com.increase.api.models.SimulationAchTransferSettleParams
import com.increase.api.models.SimulationAchTransferSubmitParams
import java.util.concurrent.CompletableFuture

interface AchTransferServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Simulates the acknowledgement of an [ACH Transfer](#ach-transfers) by the Federal Reserve.
     * This transfer must first have a `status` of `submitted` . In production, the Federal Reserve
     * generally acknowledges submitted ACH files within 30 minutes. Since sandbox ACH Transfers are
     * not submitted to the Federal Reserve, this endpoint allows you to skip that delay and add the
     * acknowledgment subresource to the ACH Transfer.
     */
    fun acknowledge(
        params: SimulationAchTransferAcknowledgeParams
    ): CompletableFuture<AchTransfer> = acknowledge(params, RequestOptions.none())

    /** @see [acknowledge] */
    fun acknowledge(
        params: SimulationAchTransferAcknowledgeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AchTransfer>

    /** Simulates receiving a Notification of Change for an [ACH Transfer](#ach-transfers). */
    fun createNotificationOfChange(
        params: SimulationAchTransferCreateNotificationOfChangeParams
    ): CompletableFuture<AchTransfer> = createNotificationOfChange(params, RequestOptions.none())

    /** @see [createNotificationOfChange] */
    fun createNotificationOfChange(
        params: SimulationAchTransferCreateNotificationOfChangeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AchTransfer>

    /**
     * Simulates the return of an [ACH Transfer](#ach-transfers) by the Federal Reserve due to an
     * error condition. This will also create a Transaction to account for the returned funds. This
     * transfer must first have a `status` of `submitted`.
     */
    fun return_(params: SimulationAchTransferReturnParams): CompletableFuture<AchTransfer> =
        return_(params, RequestOptions.none())

    /** @see [return_] */
    fun return_(
        params: SimulationAchTransferReturnParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AchTransfer>

    /**
     * Simulates the settlement of an [ACH Transfer](#ach-transfers) by the Federal Reserve. This
     * transfer must first have a `status` of `submitted`. Without this simulation the transfer will
     * eventually settle on its own following the same Federal Reserve timeline as in production.
     */
    fun settle(params: SimulationAchTransferSettleParams): CompletableFuture<AchTransfer> =
        settle(params, RequestOptions.none())

    /** @see [settle] */
    fun settle(
        params: SimulationAchTransferSettleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AchTransfer>

    /**
     * Simulates the submission of an [ACH Transfer](#ach-transfers) to the Federal Reserve. This
     * transfer must first have a `status` of `pending_approval` or `pending_submission`. In
     * production, Increase submits ACH Transfers to the Federal Reserve three times per day on
     * weekdays. Since sandbox ACH Transfers are not submitted to the Federal Reserve, this endpoint
     * allows you to skip that delay and transition the ACH Transfer to a status of `submitted`.
     */
    fun submit(params: SimulationAchTransferSubmitParams): CompletableFuture<AchTransfer> =
        submit(params, RequestOptions.none())

    /** @see [submit] */
    fun submit(
        params: SimulationAchTransferSubmitParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AchTransfer>

    /**
     * A view of [AchTransferServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post
         * /simulations/ach_transfers/{ach_transfer_id}/acknowledge`, but is otherwise the same as
         * [AchTransferServiceAsync.acknowledge].
         */
        @MustBeClosed
        fun acknowledge(
            params: SimulationAchTransferAcknowledgeParams
        ): CompletableFuture<HttpResponseFor<AchTransfer>> =
            acknowledge(params, RequestOptions.none())

        /** @see [acknowledge] */
        @MustBeClosed
        fun acknowledge(
            params: SimulationAchTransferAcknowledgeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AchTransfer>>

        /**
         * Returns a raw HTTP response for `post
         * /simulations/ach_transfers/{ach_transfer_id}/create_notification_of_change`, but is
         * otherwise the same as [AchTransferServiceAsync.createNotificationOfChange].
         */
        @MustBeClosed
        fun createNotificationOfChange(
            params: SimulationAchTransferCreateNotificationOfChangeParams
        ): CompletableFuture<HttpResponseFor<AchTransfer>> =
            createNotificationOfChange(params, RequestOptions.none())

        /** @see [createNotificationOfChange] */
        @MustBeClosed
        fun createNotificationOfChange(
            params: SimulationAchTransferCreateNotificationOfChangeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AchTransfer>>

        /**
         * Returns a raw HTTP response for `post
         * /simulations/ach_transfers/{ach_transfer_id}/return`, but is otherwise the same as
         * [AchTransferServiceAsync.return_].
         */
        @MustBeClosed
        fun return_(
            params: SimulationAchTransferReturnParams
        ): CompletableFuture<HttpResponseFor<AchTransfer>> = return_(params, RequestOptions.none())

        /** @see [return_] */
        @MustBeClosed
        fun return_(
            params: SimulationAchTransferReturnParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AchTransfer>>

        /**
         * Returns a raw HTTP response for `post
         * /simulations/ach_transfers/{ach_transfer_id}/settle`, but is otherwise the same as
         * [AchTransferServiceAsync.settle].
         */
        @MustBeClosed
        fun settle(
            params: SimulationAchTransferSettleParams
        ): CompletableFuture<HttpResponseFor<AchTransfer>> = settle(params, RequestOptions.none())

        /** @see [settle] */
        @MustBeClosed
        fun settle(
            params: SimulationAchTransferSettleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AchTransfer>>

        /**
         * Returns a raw HTTP response for `post
         * /simulations/ach_transfers/{ach_transfer_id}/submit`, but is otherwise the same as
         * [AchTransferServiceAsync.submit].
         */
        @MustBeClosed
        fun submit(
            params: SimulationAchTransferSubmitParams
        ): CompletableFuture<HttpResponseFor<AchTransfer>> = submit(params, RequestOptions.none())

        /** @see [submit] */
        @MustBeClosed
        fun submit(
            params: SimulationAchTransferSubmitParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AchTransfer>>
    }
}
