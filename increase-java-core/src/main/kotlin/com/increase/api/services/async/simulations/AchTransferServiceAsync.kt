// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.achtransfers.AchTransfer
import com.increase.api.models.simulations.achtransfers.AchTransferAcknowledgeParams
import com.increase.api.models.simulations.achtransfers.AchTransferCreateNotificationOfChangeParams
import com.increase.api.models.simulations.achtransfers.AchTransferReturnParams
import com.increase.api.models.simulations.achtransfers.AchTransferSettleParams
import com.increase.api.models.simulations.achtransfers.AchTransferSubmitParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AchTransferServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AchTransferServiceAsync

    /**
     * Simulates the acknowledgement of an [ACH Transfer](#ach-transfers) by the Federal Reserve.
     * This transfer must first have a `status` of `submitted`. In production, the Federal Reserve
     * generally acknowledges submitted ACH files within 30 minutes. Since sandbox ACH Transfers are
     * not submitted to the Federal Reserve, this endpoint allows you to skip that delay and add the
     * acknowledgement subresource to the ACH Transfer.
     */
    fun acknowledge(achTransferId: String): CompletableFuture<AchTransfer> =
        acknowledge(achTransferId, AchTransferAcknowledgeParams.none())

    /** @see acknowledge */
    fun acknowledge(
        achTransferId: String,
        params: AchTransferAcknowledgeParams = AchTransferAcknowledgeParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AchTransfer> =
        acknowledge(params.toBuilder().achTransferId(achTransferId).build(), requestOptions)

    /** @see acknowledge */
    fun acknowledge(
        achTransferId: String,
        params: AchTransferAcknowledgeParams = AchTransferAcknowledgeParams.none(),
    ): CompletableFuture<AchTransfer> = acknowledge(achTransferId, params, RequestOptions.none())

    /** @see acknowledge */
    fun acknowledge(
        params: AchTransferAcknowledgeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AchTransfer>

    /** @see acknowledge */
    fun acknowledge(params: AchTransferAcknowledgeParams): CompletableFuture<AchTransfer> =
        acknowledge(params, RequestOptions.none())

    /** @see acknowledge */
    fun acknowledge(
        achTransferId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AchTransfer> =
        acknowledge(achTransferId, AchTransferAcknowledgeParams.none(), requestOptions)

    /** Simulates receiving a Notification of Change for an [ACH Transfer](#ach-transfers). */
    fun createNotificationOfChange(
        achTransferId: String,
        params: AchTransferCreateNotificationOfChangeParams,
    ): CompletableFuture<AchTransfer> =
        createNotificationOfChange(achTransferId, params, RequestOptions.none())

    /** @see createNotificationOfChange */
    fun createNotificationOfChange(
        achTransferId: String,
        params: AchTransferCreateNotificationOfChangeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AchTransfer> =
        createNotificationOfChange(
            params.toBuilder().achTransferId(achTransferId).build(),
            requestOptions,
        )

    /** @see createNotificationOfChange */
    fun createNotificationOfChange(
        params: AchTransferCreateNotificationOfChangeParams
    ): CompletableFuture<AchTransfer> = createNotificationOfChange(params, RequestOptions.none())

    /** @see createNotificationOfChange */
    fun createNotificationOfChange(
        params: AchTransferCreateNotificationOfChangeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AchTransfer>

    /**
     * Simulates the return of an [ACH Transfer](#ach-transfers) by the Federal Reserve due to an
     * error condition. This will also create a Transaction to account for the returned funds. This
     * transfer must first have a `status` of `submitted`.
     */
    fun return_(achTransferId: String): CompletableFuture<AchTransfer> =
        return_(achTransferId, AchTransferReturnParams.none())

    /** @see return_ */
    fun return_(
        achTransferId: String,
        params: AchTransferReturnParams = AchTransferReturnParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AchTransfer> =
        return_(params.toBuilder().achTransferId(achTransferId).build(), requestOptions)

    /** @see return_ */
    fun return_(
        achTransferId: String,
        params: AchTransferReturnParams = AchTransferReturnParams.none(),
    ): CompletableFuture<AchTransfer> = return_(achTransferId, params, RequestOptions.none())

    /** @see return_ */
    fun return_(
        params: AchTransferReturnParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AchTransfer>

    /** @see return_ */
    fun return_(params: AchTransferReturnParams): CompletableFuture<AchTransfer> =
        return_(params, RequestOptions.none())

    /** @see return_ */
    fun return_(
        achTransferId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AchTransfer> =
        return_(achTransferId, AchTransferReturnParams.none(), requestOptions)

    /**
     * Simulates the settlement of an [ACH Transfer](#ach-transfers) by the Federal Reserve. This
     * transfer must first have a `status` of `pending_submission` or `submitted`. For convenience,
     * if the transfer is in `status`: `pending_submission`, the simulation will also submit the
     * transfer. Without this simulation the transfer will eventually settle on its own following
     * the same Federal Reserve timeline as in production. Additionally, you can specify the
     * behavior of the inbound funds hold that is created when the ACH Transfer is settled. If no
     * behavior is specified, the inbound funds hold will be released immediately in order for the
     * funds to be available for use.
     */
    fun settle(achTransferId: String): CompletableFuture<AchTransfer> =
        settle(achTransferId, AchTransferSettleParams.none())

    /** @see settle */
    fun settle(
        achTransferId: String,
        params: AchTransferSettleParams = AchTransferSettleParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AchTransfer> =
        settle(params.toBuilder().achTransferId(achTransferId).build(), requestOptions)

    /** @see settle */
    fun settle(
        achTransferId: String,
        params: AchTransferSettleParams = AchTransferSettleParams.none(),
    ): CompletableFuture<AchTransfer> = settle(achTransferId, params, RequestOptions.none())

    /** @see settle */
    fun settle(
        params: AchTransferSettleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AchTransfer>

    /** @see settle */
    fun settle(params: AchTransferSettleParams): CompletableFuture<AchTransfer> =
        settle(params, RequestOptions.none())

    /** @see settle */
    fun settle(
        achTransferId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AchTransfer> =
        settle(achTransferId, AchTransferSettleParams.none(), requestOptions)

    /**
     * Simulates the submission of an [ACH Transfer](#ach-transfers) to the Federal Reserve. This
     * transfer must first have a `status` of `pending_approval` or `pending_submission`. In
     * production, Increase submits ACH Transfers to the Federal Reserve three times per day on
     * weekdays. Since sandbox ACH Transfers are not submitted to the Federal Reserve, this endpoint
     * allows you to skip that delay and transition the ACH Transfer to a status of `submitted`.
     */
    fun submit(achTransferId: String): CompletableFuture<AchTransfer> =
        submit(achTransferId, AchTransferSubmitParams.none())

    /** @see submit */
    fun submit(
        achTransferId: String,
        params: AchTransferSubmitParams = AchTransferSubmitParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AchTransfer> =
        submit(params.toBuilder().achTransferId(achTransferId).build(), requestOptions)

    /** @see submit */
    fun submit(
        achTransferId: String,
        params: AchTransferSubmitParams = AchTransferSubmitParams.none(),
    ): CompletableFuture<AchTransfer> = submit(achTransferId, params, RequestOptions.none())

    /** @see submit */
    fun submit(
        params: AchTransferSubmitParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AchTransfer>

    /** @see submit */
    fun submit(params: AchTransferSubmitParams): CompletableFuture<AchTransfer> =
        submit(params, RequestOptions.none())

    /** @see submit */
    fun submit(
        achTransferId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AchTransfer> =
        submit(achTransferId, AchTransferSubmitParams.none(), requestOptions)

    /**
     * A view of [AchTransferServiceAsync] that provides access to raw HTTP responses for each
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
        ): AchTransferServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /simulations/ach_transfers/{ach_transfer_id}/acknowledge`, but is otherwise the same as
         * [AchTransferServiceAsync.acknowledge].
         */
        fun acknowledge(achTransferId: String): CompletableFuture<HttpResponseFor<AchTransfer>> =
            acknowledge(achTransferId, AchTransferAcknowledgeParams.none())

        /** @see acknowledge */
        fun acknowledge(
            achTransferId: String,
            params: AchTransferAcknowledgeParams = AchTransferAcknowledgeParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AchTransfer>> =
            acknowledge(params.toBuilder().achTransferId(achTransferId).build(), requestOptions)

        /** @see acknowledge */
        fun acknowledge(
            achTransferId: String,
            params: AchTransferAcknowledgeParams = AchTransferAcknowledgeParams.none(),
        ): CompletableFuture<HttpResponseFor<AchTransfer>> =
            acknowledge(achTransferId, params, RequestOptions.none())

        /** @see acknowledge */
        fun acknowledge(
            params: AchTransferAcknowledgeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AchTransfer>>

        /** @see acknowledge */
        fun acknowledge(
            params: AchTransferAcknowledgeParams
        ): CompletableFuture<HttpResponseFor<AchTransfer>> =
            acknowledge(params, RequestOptions.none())

        /** @see acknowledge */
        fun acknowledge(
            achTransferId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AchTransfer>> =
            acknowledge(achTransferId, AchTransferAcknowledgeParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /simulations/ach_transfers/{ach_transfer_id}/create_notification_of_change`, but is
         * otherwise the same as [AchTransferServiceAsync.createNotificationOfChange].
         */
        fun createNotificationOfChange(
            achTransferId: String,
            params: AchTransferCreateNotificationOfChangeParams,
        ): CompletableFuture<HttpResponseFor<AchTransfer>> =
            createNotificationOfChange(achTransferId, params, RequestOptions.none())

        /** @see createNotificationOfChange */
        fun createNotificationOfChange(
            achTransferId: String,
            params: AchTransferCreateNotificationOfChangeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AchTransfer>> =
            createNotificationOfChange(
                params.toBuilder().achTransferId(achTransferId).build(),
                requestOptions,
            )

        /** @see createNotificationOfChange */
        fun createNotificationOfChange(
            params: AchTransferCreateNotificationOfChangeParams
        ): CompletableFuture<HttpResponseFor<AchTransfer>> =
            createNotificationOfChange(params, RequestOptions.none())

        /** @see createNotificationOfChange */
        fun createNotificationOfChange(
            params: AchTransferCreateNotificationOfChangeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AchTransfer>>

        /**
         * Returns a raw HTTP response for `post
         * /simulations/ach_transfers/{ach_transfer_id}/return`, but is otherwise the same as
         * [AchTransferServiceAsync.return_].
         */
        fun return_(achTransferId: String): CompletableFuture<HttpResponseFor<AchTransfer>> =
            return_(achTransferId, AchTransferReturnParams.none())

        /** @see return_ */
        fun return_(
            achTransferId: String,
            params: AchTransferReturnParams = AchTransferReturnParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AchTransfer>> =
            return_(params.toBuilder().achTransferId(achTransferId).build(), requestOptions)

        /** @see return_ */
        fun return_(
            achTransferId: String,
            params: AchTransferReturnParams = AchTransferReturnParams.none(),
        ): CompletableFuture<HttpResponseFor<AchTransfer>> =
            return_(achTransferId, params, RequestOptions.none())

        /** @see return_ */
        fun return_(
            params: AchTransferReturnParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AchTransfer>>

        /** @see return_ */
        fun return_(
            params: AchTransferReturnParams
        ): CompletableFuture<HttpResponseFor<AchTransfer>> = return_(params, RequestOptions.none())

        /** @see return_ */
        fun return_(
            achTransferId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AchTransfer>> =
            return_(achTransferId, AchTransferReturnParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /simulations/ach_transfers/{ach_transfer_id}/settle`, but is otherwise the same as
         * [AchTransferServiceAsync.settle].
         */
        fun settle(achTransferId: String): CompletableFuture<HttpResponseFor<AchTransfer>> =
            settle(achTransferId, AchTransferSettleParams.none())

        /** @see settle */
        fun settle(
            achTransferId: String,
            params: AchTransferSettleParams = AchTransferSettleParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AchTransfer>> =
            settle(params.toBuilder().achTransferId(achTransferId).build(), requestOptions)

        /** @see settle */
        fun settle(
            achTransferId: String,
            params: AchTransferSettleParams = AchTransferSettleParams.none(),
        ): CompletableFuture<HttpResponseFor<AchTransfer>> =
            settle(achTransferId, params, RequestOptions.none())

        /** @see settle */
        fun settle(
            params: AchTransferSettleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AchTransfer>>

        /** @see settle */
        fun settle(
            params: AchTransferSettleParams
        ): CompletableFuture<HttpResponseFor<AchTransfer>> = settle(params, RequestOptions.none())

        /** @see settle */
        fun settle(
            achTransferId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AchTransfer>> =
            settle(achTransferId, AchTransferSettleParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /simulations/ach_transfers/{ach_transfer_id}/submit`, but is otherwise the same as
         * [AchTransferServiceAsync.submit].
         */
        fun submit(achTransferId: String): CompletableFuture<HttpResponseFor<AchTransfer>> =
            submit(achTransferId, AchTransferSubmitParams.none())

        /** @see submit */
        fun submit(
            achTransferId: String,
            params: AchTransferSubmitParams = AchTransferSubmitParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AchTransfer>> =
            submit(params.toBuilder().achTransferId(achTransferId).build(), requestOptions)

        /** @see submit */
        fun submit(
            achTransferId: String,
            params: AchTransferSubmitParams = AchTransferSubmitParams.none(),
        ): CompletableFuture<HttpResponseFor<AchTransfer>> =
            submit(achTransferId, params, RequestOptions.none())

        /** @see submit */
        fun submit(
            params: AchTransferSubmitParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AchTransfer>>

        /** @see submit */
        fun submit(
            params: AchTransferSubmitParams
        ): CompletableFuture<HttpResponseFor<AchTransfer>> = submit(params, RequestOptions.none())

        /** @see submit */
        fun submit(
            achTransferId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AchTransfer>> =
            submit(achTransferId, AchTransferSubmitParams.none(), requestOptions)
    }
}
