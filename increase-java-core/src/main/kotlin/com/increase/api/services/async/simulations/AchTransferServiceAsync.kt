// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

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
    @JvmOverloads
    fun acknowledge(
        params: SimulationAchTransferAcknowledgeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AchTransfer>

    /** Simulates receiving a Notification of Change for an [ACH Transfer](#ach-transfers). */
    @JvmOverloads
    fun createNotificationOfChange(
        params: SimulationAchTransferCreateNotificationOfChangeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AchTransfer>

    /**
     * Simulates the return of an [ACH Transfer](#ach-transfers) by the Federal Reserve due to an
     * error condition. This will also create a Transaction to account for the returned funds. This
     * transfer must first have a `status` of `submitted`.
     */
    @JvmOverloads
    fun return_(
        params: SimulationAchTransferReturnParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AchTransfer>

    /**
     * Simulates the settlement of an [ACH Transfer](#ach-transfers) by the Federal Reserve. This
     * transfer must first have a `status` of `submitted`. Without this simulation the transfer will
     * eventually settle on its own following the same Federal Reserve timeline as in production.
     */
    @JvmOverloads
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
    @JvmOverloads
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
        @JvmOverloads
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
        @JvmOverloads
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
        @JvmOverloads
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
        @JvmOverloads
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
        @JvmOverloads
        @MustBeClosed
        fun submit(
            params: SimulationAchTransferSubmitParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AchTransfer>>
    }
}
