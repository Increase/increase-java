// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.inboundcheckdeposits.InboundCheckDeposit
import com.increase.api.models.inboundcheckdeposits.InboundCheckDepositDeclineParams
import com.increase.api.models.inboundcheckdeposits.InboundCheckDepositListPage
import com.increase.api.models.inboundcheckdeposits.InboundCheckDepositListParams
import com.increase.api.models.inboundcheckdeposits.InboundCheckDepositRetrieveParams
import com.increase.api.models.inboundcheckdeposits.InboundCheckDepositReturnParams

interface InboundCheckDepositService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for
     * each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve an Inbound Check Deposit */
    fun retrieve(params: InboundCheckDepositRetrieveParams): InboundCheckDeposit =
        retrieve(
          params, RequestOptions.none()
        )

    /** @see [retrieve] */
    fun retrieve(params: InboundCheckDepositRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): InboundCheckDeposit

    /** List Inbound Check Deposits */
    fun list(): InboundCheckDepositListPage = list(InboundCheckDepositListParams.none())

    /** @see [list] */
    fun list(params: InboundCheckDepositListParams = InboundCheckDepositListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): InboundCheckDepositListPage

    /** @see [list] */
    fun list(params: InboundCheckDepositListParams = InboundCheckDepositListParams.none()): InboundCheckDepositListPage =
        list(
          params, RequestOptions.none()
        )

    /** @see [list] */
    fun list(requestOptions: RequestOptions): InboundCheckDepositListPage = list(InboundCheckDepositListParams.none(), requestOptions)

    /** Decline an Inbound Check Deposit */
    fun decline(params: InboundCheckDepositDeclineParams): InboundCheckDeposit =
        decline(
          params, RequestOptions.none()
        )

    /** @see [decline] */
    fun decline(params: InboundCheckDepositDeclineParams, requestOptions: RequestOptions = RequestOptions.none()): InboundCheckDeposit

    /** Return an Inbound Check Deposit */
    fun return_(params: InboundCheckDepositReturnParams): InboundCheckDeposit =
        return_(
          params, RequestOptions.none()
        )

    /** @see [return_] */
    fun return_(params: InboundCheckDepositReturnParams, requestOptions: RequestOptions = RequestOptions.none()): InboundCheckDeposit

    /**
     * A view of [InboundCheckDepositService] that provides access to raw HTTP
     * responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for
         * `get /inbound_check_deposits/{inbound_check_deposit_id}`, but is otherwise the
         * same as [InboundCheckDepositService.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: InboundCheckDepositRetrieveParams): HttpResponseFor<InboundCheckDeposit> =
            retrieve(
              params, RequestOptions.none()
            )

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(params: InboundCheckDepositRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<InboundCheckDeposit>

        /**
         * Returns a raw HTTP response for `get /inbound_check_deposits`, but is otherwise
         * the same as [InboundCheckDepositService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<InboundCheckDepositListPage> = list(InboundCheckDepositListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(params: InboundCheckDepositListParams = InboundCheckDepositListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<InboundCheckDepositListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(params: InboundCheckDepositListParams = InboundCheckDepositListParams.none()): HttpResponseFor<InboundCheckDepositListPage> =
            list(
              params, RequestOptions.none()
            )

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<InboundCheckDepositListPage> = list(InboundCheckDepositListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for
         * `post /inbound_check_deposits/{inbound_check_deposit_id}/decline`, but is
         * otherwise the same as [InboundCheckDepositService.decline].
         */
        @MustBeClosed
        fun decline(params: InboundCheckDepositDeclineParams): HttpResponseFor<InboundCheckDeposit> =
            decline(
              params, RequestOptions.none()
            )

        /** @see [decline] */
        @MustBeClosed
        fun decline(params: InboundCheckDepositDeclineParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<InboundCheckDeposit>

        /**
         * Returns a raw HTTP response for
         * `post /inbound_check_deposits/{inbound_check_deposit_id}/return`, but is
         * otherwise the same as [InboundCheckDepositService.return_].
         */
        @MustBeClosed
        fun return_(params: InboundCheckDepositReturnParams): HttpResponseFor<InboundCheckDeposit> =
            return_(
              params, RequestOptions.none()
            )

        /** @see [return_] */
        @MustBeClosed
        fun return_(params: InboundCheckDepositReturnParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<InboundCheckDeposit>
    }
}
