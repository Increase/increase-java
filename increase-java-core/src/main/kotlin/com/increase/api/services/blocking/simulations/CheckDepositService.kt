// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking.simulations

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.CheckDeposit
import com.increase.api.models.SimulationCheckDepositRejectParams
import com.increase.api.models.SimulationCheckDepositReturnParams
import com.increase.api.models.SimulationCheckDepositSubmitParams

interface CheckDepositService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Simulates the rejection of a [Check Deposit](#check-deposits) by Increase due to factors like
     * poor image quality. This Check Deposit must first have a `status` of `pending`.
     */
    fun reject(params: SimulationCheckDepositRejectParams): CheckDeposit =
        reject(params, RequestOptions.none())

    /** @see [reject] */
    fun reject(
        params: SimulationCheckDepositRejectParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CheckDeposit

    /**
     * Simulates the return of a [Check Deposit](#check-deposits). This Check Deposit must first
     * have a `status` of `submitted`.
     */
    fun return_(params: SimulationCheckDepositReturnParams): CheckDeposit =
        return_(params, RequestOptions.none())

    /** @see [return_] */
    fun return_(
        params: SimulationCheckDepositReturnParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CheckDeposit

    /**
     * Simulates the submission of a [Check Deposit](#check-deposits) to the Federal Reserve. This
     * Check Deposit must first have a `status` of `pending`.
     */
    fun submit(params: SimulationCheckDepositSubmitParams): CheckDeposit =
        submit(params, RequestOptions.none())

    /** @see [submit] */
    fun submit(
        params: SimulationCheckDepositSubmitParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CheckDeposit

    /**
     * A view of [CheckDepositService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post
         * /simulations/check_deposits/{check_deposit_id}/reject`, but is otherwise the same as
         * [CheckDepositService.reject].
         */
        @MustBeClosed
        fun reject(params: SimulationCheckDepositRejectParams): HttpResponseFor<CheckDeposit> =
            reject(params, RequestOptions.none())

        /** @see [reject] */
        @MustBeClosed
        fun reject(
            params: SimulationCheckDepositRejectParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CheckDeposit>

        /**
         * Returns a raw HTTP response for `post
         * /simulations/check_deposits/{check_deposit_id}/return`, but is otherwise the same as
         * [CheckDepositService.return_].
         */
        @MustBeClosed
        fun return_(params: SimulationCheckDepositReturnParams): HttpResponseFor<CheckDeposit> =
            return_(params, RequestOptions.none())

        /** @see [return_] */
        @MustBeClosed
        fun return_(
            params: SimulationCheckDepositReturnParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CheckDeposit>

        /**
         * Returns a raw HTTP response for `post
         * /simulations/check_deposits/{check_deposit_id}/submit`, but is otherwise the same as
         * [CheckDepositService.submit].
         */
        @MustBeClosed
        fun submit(params: SimulationCheckDepositSubmitParams): HttpResponseFor<CheckDeposit> =
            submit(params, RequestOptions.none())

        /** @see [submit] */
        @MustBeClosed
        fun submit(
            params: SimulationCheckDepositSubmitParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CheckDeposit>
    }
}
