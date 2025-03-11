// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.checkdeposits.CheckDeposit
import com.increase.api.models.checkdeposits.CheckDepositCreateParams
import com.increase.api.models.checkdeposits.CheckDepositListPage
import com.increase.api.models.checkdeposits.CheckDepositListParams
import com.increase.api.models.checkdeposits.CheckDepositRetrieveParams

interface CheckDepositService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for
     * each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a Check Deposit */
    fun create(params: CheckDepositCreateParams): CheckDeposit =
        create(
          params, RequestOptions.none()
        )

    /** @see [create] */
    fun create(params: CheckDepositCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CheckDeposit

    /** Retrieve a Check Deposit */
    fun retrieve(params: CheckDepositRetrieveParams): CheckDeposit =
        retrieve(
          params, RequestOptions.none()
        )

    /** @see [retrieve] */
    fun retrieve(params: CheckDepositRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CheckDeposit

    /** List Check Deposits */
    fun list(): CheckDepositListPage = list(CheckDepositListParams.none())

    /** @see [list] */
    fun list(params: CheckDepositListParams = CheckDepositListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CheckDepositListPage

    /** @see [list] */
    fun list(params: CheckDepositListParams = CheckDepositListParams.none()): CheckDepositListPage =
        list(
          params, RequestOptions.none()
        )

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CheckDepositListPage = list(CheckDepositListParams.none(), requestOptions)

    /**
     * A view of [CheckDepositService] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /check_deposits`, but is otherwise the
         * same as [CheckDepositService.create].
         */
        @MustBeClosed
        fun create(params: CheckDepositCreateParams): HttpResponseFor<CheckDeposit> =
            create(
              params, RequestOptions.none()
            )

        /** @see [create] */
        @MustBeClosed
        fun create(params: CheckDepositCreateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<CheckDeposit>

        /**
         * Returns a raw HTTP response for `get /check_deposits/{check_deposit_id}`, but is
         * otherwise the same as [CheckDepositService.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: CheckDepositRetrieveParams): HttpResponseFor<CheckDeposit> =
            retrieve(
              params, RequestOptions.none()
            )

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(params: CheckDepositRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<CheckDeposit>

        /**
         * Returns a raw HTTP response for `get /check_deposits`, but is otherwise the same
         * as [CheckDepositService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<CheckDepositListPage> = list(CheckDepositListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(params: CheckDepositListParams = CheckDepositListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<CheckDepositListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(params: CheckDepositListParams = CheckDepositListParams.none()): HttpResponseFor<CheckDepositListPage> =
            list(
              params, RequestOptions.none()
            )

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<CheckDepositListPage> = list(CheckDepositListParams.none(), requestOptions)
    }
}
