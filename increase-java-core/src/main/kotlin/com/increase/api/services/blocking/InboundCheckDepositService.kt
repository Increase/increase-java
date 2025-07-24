// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.inboundcheckdeposits.InboundCheckDeposit
import com.increase.api.models.inboundcheckdeposits.InboundCheckDepositDeclineParams
import com.increase.api.models.inboundcheckdeposits.InboundCheckDepositListPage
import com.increase.api.models.inboundcheckdeposits.InboundCheckDepositListParams
import com.increase.api.models.inboundcheckdeposits.InboundCheckDepositRetrieveParams
import com.increase.api.models.inboundcheckdeposits.InboundCheckDepositReturnParams
import java.util.function.Consumer

interface InboundCheckDepositService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): InboundCheckDepositService

    /** Retrieve an Inbound Check Deposit */
    fun retrieve(inboundCheckDepositId: String): InboundCheckDeposit =
        retrieve(inboundCheckDepositId, InboundCheckDepositRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        inboundCheckDepositId: String,
        params: InboundCheckDepositRetrieveParams = InboundCheckDepositRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundCheckDeposit =
        retrieve(
            params.toBuilder().inboundCheckDepositId(inboundCheckDepositId).build(),
            requestOptions,
        )

    /** @see retrieve */
    fun retrieve(
        inboundCheckDepositId: String,
        params: InboundCheckDepositRetrieveParams = InboundCheckDepositRetrieveParams.none(),
    ): InboundCheckDeposit = retrieve(inboundCheckDepositId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: InboundCheckDepositRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundCheckDeposit

    /** @see retrieve */
    fun retrieve(params: InboundCheckDepositRetrieveParams): InboundCheckDeposit =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        inboundCheckDepositId: String,
        requestOptions: RequestOptions,
    ): InboundCheckDeposit =
        retrieve(inboundCheckDepositId, InboundCheckDepositRetrieveParams.none(), requestOptions)

    /** List Inbound Check Deposits */
    fun list(): InboundCheckDepositListPage = list(InboundCheckDepositListParams.none())

    /** @see list */
    fun list(
        params: InboundCheckDepositListParams = InboundCheckDepositListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundCheckDepositListPage

    /** @see list */
    fun list(
        params: InboundCheckDepositListParams = InboundCheckDepositListParams.none()
    ): InboundCheckDepositListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): InboundCheckDepositListPage =
        list(InboundCheckDepositListParams.none(), requestOptions)

    /** Decline an Inbound Check Deposit */
    fun decline(inboundCheckDepositId: String): InboundCheckDeposit =
        decline(inboundCheckDepositId, InboundCheckDepositDeclineParams.none())

    /** @see decline */
    fun decline(
        inboundCheckDepositId: String,
        params: InboundCheckDepositDeclineParams = InboundCheckDepositDeclineParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundCheckDeposit =
        decline(
            params.toBuilder().inboundCheckDepositId(inboundCheckDepositId).build(),
            requestOptions,
        )

    /** @see decline */
    fun decline(
        inboundCheckDepositId: String,
        params: InboundCheckDepositDeclineParams = InboundCheckDepositDeclineParams.none(),
    ): InboundCheckDeposit = decline(inboundCheckDepositId, params, RequestOptions.none())

    /** @see decline */
    fun decline(
        params: InboundCheckDepositDeclineParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundCheckDeposit

    /** @see decline */
    fun decline(params: InboundCheckDepositDeclineParams): InboundCheckDeposit =
        decline(params, RequestOptions.none())

    /** @see decline */
    fun decline(
        inboundCheckDepositId: String,
        requestOptions: RequestOptions,
    ): InboundCheckDeposit =
        decline(inboundCheckDepositId, InboundCheckDepositDeclineParams.none(), requestOptions)

    /** Return an Inbound Check Deposit */
    fun return_(
        inboundCheckDepositId: String,
        params: InboundCheckDepositReturnParams,
    ): InboundCheckDeposit = return_(inboundCheckDepositId, params, RequestOptions.none())

    /** @see return\_ */
    fun return_(
        inboundCheckDepositId: String,
        params: InboundCheckDepositReturnParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundCheckDeposit =
        return_(
            params.toBuilder().inboundCheckDepositId(inboundCheckDepositId).build(),
            requestOptions,
        )

    /** @see return\_ */
    fun return_(params: InboundCheckDepositReturnParams): InboundCheckDeposit =
        return_(params, RequestOptions.none())

    /** @see return\_ */
    fun return_(
        params: InboundCheckDepositReturnParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundCheckDeposit

    /**
     * A view of [InboundCheckDepositService] that provides access to raw HTTP responses for each
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
        ): InboundCheckDepositService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /inbound_check_deposits/{inbound_check_deposit_id}`,
         * but is otherwise the same as [InboundCheckDepositService.retrieve].
         */
        @MustBeClosed
        fun retrieve(inboundCheckDepositId: String): HttpResponseFor<InboundCheckDeposit> =
            retrieve(inboundCheckDepositId, InboundCheckDepositRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            inboundCheckDepositId: String,
            params: InboundCheckDepositRetrieveParams = InboundCheckDepositRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InboundCheckDeposit> =
            retrieve(
                params.toBuilder().inboundCheckDepositId(inboundCheckDepositId).build(),
                requestOptions,
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            inboundCheckDepositId: String,
            params: InboundCheckDepositRetrieveParams = InboundCheckDepositRetrieveParams.none(),
        ): HttpResponseFor<InboundCheckDeposit> =
            retrieve(inboundCheckDepositId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: InboundCheckDepositRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InboundCheckDeposit>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: InboundCheckDepositRetrieveParams
        ): HttpResponseFor<InboundCheckDeposit> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            inboundCheckDepositId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InboundCheckDeposit> =
            retrieve(
                inboundCheckDepositId,
                InboundCheckDepositRetrieveParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /inbound_check_deposits`, but is otherwise the same
         * as [InboundCheckDepositService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<InboundCheckDepositListPage> =
            list(InboundCheckDepositListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: InboundCheckDepositListParams = InboundCheckDepositListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InboundCheckDepositListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: InboundCheckDepositListParams = InboundCheckDepositListParams.none()
        ): HttpResponseFor<InboundCheckDepositListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<InboundCheckDepositListPage> =
            list(InboundCheckDepositListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /inbound_check_deposits/{inbound_check_deposit_id}/decline`, but is otherwise the same as
         * [InboundCheckDepositService.decline].
         */
        @MustBeClosed
        fun decline(inboundCheckDepositId: String): HttpResponseFor<InboundCheckDeposit> =
            decline(inboundCheckDepositId, InboundCheckDepositDeclineParams.none())

        /** @see decline */
        @MustBeClosed
        fun decline(
            inboundCheckDepositId: String,
            params: InboundCheckDepositDeclineParams = InboundCheckDepositDeclineParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InboundCheckDeposit> =
            decline(
                params.toBuilder().inboundCheckDepositId(inboundCheckDepositId).build(),
                requestOptions,
            )

        /** @see decline */
        @MustBeClosed
        fun decline(
            inboundCheckDepositId: String,
            params: InboundCheckDepositDeclineParams = InboundCheckDepositDeclineParams.none(),
        ): HttpResponseFor<InboundCheckDeposit> =
            decline(inboundCheckDepositId, params, RequestOptions.none())

        /** @see decline */
        @MustBeClosed
        fun decline(
            params: InboundCheckDepositDeclineParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InboundCheckDeposit>

        /** @see decline */
        @MustBeClosed
        fun decline(
            params: InboundCheckDepositDeclineParams
        ): HttpResponseFor<InboundCheckDeposit> = decline(params, RequestOptions.none())

        /** @see decline */
        @MustBeClosed
        fun decline(
            inboundCheckDepositId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InboundCheckDeposit> =
            decline(inboundCheckDepositId, InboundCheckDepositDeclineParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /inbound_check_deposits/{inbound_check_deposit_id}/return`, but is otherwise the same as
         * [InboundCheckDepositService.return_].
         */
        @MustBeClosed
        fun return_(
            inboundCheckDepositId: String,
            params: InboundCheckDepositReturnParams,
        ): HttpResponseFor<InboundCheckDeposit> =
            return_(inboundCheckDepositId, params, RequestOptions.none())

        /** @see return\_ */
        @MustBeClosed
        fun return_(
            inboundCheckDepositId: String,
            params: InboundCheckDepositReturnParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InboundCheckDeposit> =
            return_(
                params.toBuilder().inboundCheckDepositId(inboundCheckDepositId).build(),
                requestOptions,
            )

        /** @see return\_ */
        @MustBeClosed
        fun return_(params: InboundCheckDepositReturnParams): HttpResponseFor<InboundCheckDeposit> =
            return_(params, RequestOptions.none())

        /** @see return\_ */
        @MustBeClosed
        fun return_(
            params: InboundCheckDepositReturnParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InboundCheckDeposit>
    }
}
