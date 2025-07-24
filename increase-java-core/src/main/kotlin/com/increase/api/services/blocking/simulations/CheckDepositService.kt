// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking.simulations

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.checkdeposits.CheckDeposit
import com.increase.api.models.simulations.checkdeposits.CheckDepositRejectParams
import com.increase.api.models.simulations.checkdeposits.CheckDepositReturnParams
import com.increase.api.models.simulations.checkdeposits.CheckDepositSubmitParams
import java.util.function.Consumer

interface CheckDepositService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CheckDepositService

    /**
     * Simulates the rejection of a [Check Deposit](#check-deposits) by Increase due to factors like
     * poor image quality. This Check Deposit must first have a `status` of `pending`.
     */
    fun reject(checkDepositId: String): CheckDeposit =
        reject(checkDepositId, CheckDepositRejectParams.none())

    /** @see reject */
    fun reject(
        checkDepositId: String,
        params: CheckDepositRejectParams = CheckDepositRejectParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CheckDeposit =
        reject(params.toBuilder().checkDepositId(checkDepositId).build(), requestOptions)

    /** @see reject */
    fun reject(
        checkDepositId: String,
        params: CheckDepositRejectParams = CheckDepositRejectParams.none(),
    ): CheckDeposit = reject(checkDepositId, params, RequestOptions.none())

    /** @see reject */
    fun reject(
        params: CheckDepositRejectParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CheckDeposit

    /** @see reject */
    fun reject(params: CheckDepositRejectParams): CheckDeposit =
        reject(params, RequestOptions.none())

    /** @see reject */
    fun reject(checkDepositId: String, requestOptions: RequestOptions): CheckDeposit =
        reject(checkDepositId, CheckDepositRejectParams.none(), requestOptions)

    /**
     * Simulates the return of a [Check Deposit](#check-deposits). This Check Deposit must first
     * have a `status` of `submitted`.
     */
    fun return_(checkDepositId: String): CheckDeposit =
        return_(checkDepositId, CheckDepositReturnParams.none())

    /** @see return\_ */
    fun return_(
        checkDepositId: String,
        params: CheckDepositReturnParams = CheckDepositReturnParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CheckDeposit =
        return_(params.toBuilder().checkDepositId(checkDepositId).build(), requestOptions)

    /** @see return\_ */
    fun return_(
        checkDepositId: String,
        params: CheckDepositReturnParams = CheckDepositReturnParams.none(),
    ): CheckDeposit = return_(checkDepositId, params, RequestOptions.none())

    /** @see return\_ */
    fun return_(
        params: CheckDepositReturnParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CheckDeposit

    /** @see return\_ */
    fun return_(params: CheckDepositReturnParams): CheckDeposit =
        return_(params, RequestOptions.none())

    /** @see return\_ */
    fun return_(checkDepositId: String, requestOptions: RequestOptions): CheckDeposit =
        return_(checkDepositId, CheckDepositReturnParams.none(), requestOptions)

    /**
     * Simulates the submission of a [Check Deposit](#check-deposits) to the Federal Reserve. This
     * Check Deposit must first have a `status` of `pending`.
     */
    fun submit(checkDepositId: String): CheckDeposit =
        submit(checkDepositId, CheckDepositSubmitParams.none())

    /** @see submit */
    fun submit(
        checkDepositId: String,
        params: CheckDepositSubmitParams = CheckDepositSubmitParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CheckDeposit =
        submit(params.toBuilder().checkDepositId(checkDepositId).build(), requestOptions)

    /** @see submit */
    fun submit(
        checkDepositId: String,
        params: CheckDepositSubmitParams = CheckDepositSubmitParams.none(),
    ): CheckDeposit = submit(checkDepositId, params, RequestOptions.none())

    /** @see submit */
    fun submit(
        params: CheckDepositSubmitParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CheckDeposit

    /** @see submit */
    fun submit(params: CheckDepositSubmitParams): CheckDeposit =
        submit(params, RequestOptions.none())

    /** @see submit */
    fun submit(checkDepositId: String, requestOptions: RequestOptions): CheckDeposit =
        submit(checkDepositId, CheckDepositSubmitParams.none(), requestOptions)

    /**
     * A view of [CheckDepositService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CheckDepositService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /simulations/check_deposits/{check_deposit_id}/reject`, but is otherwise the same as
         * [CheckDepositService.reject].
         */
        @MustBeClosed
        fun reject(checkDepositId: String): HttpResponseFor<CheckDeposit> =
            reject(checkDepositId, CheckDepositRejectParams.none())

        /** @see reject */
        @MustBeClosed
        fun reject(
            checkDepositId: String,
            params: CheckDepositRejectParams = CheckDepositRejectParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CheckDeposit> =
            reject(params.toBuilder().checkDepositId(checkDepositId).build(), requestOptions)

        /** @see reject */
        @MustBeClosed
        fun reject(
            checkDepositId: String,
            params: CheckDepositRejectParams = CheckDepositRejectParams.none(),
        ): HttpResponseFor<CheckDeposit> = reject(checkDepositId, params, RequestOptions.none())

        /** @see reject */
        @MustBeClosed
        fun reject(
            params: CheckDepositRejectParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CheckDeposit>

        /** @see reject */
        @MustBeClosed
        fun reject(params: CheckDepositRejectParams): HttpResponseFor<CheckDeposit> =
            reject(params, RequestOptions.none())

        /** @see reject */
        @MustBeClosed
        fun reject(
            checkDepositId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CheckDeposit> =
            reject(checkDepositId, CheckDepositRejectParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /simulations/check_deposits/{check_deposit_id}/return`, but is otherwise the same as
         * [CheckDepositService.return_].
         */
        @MustBeClosed
        fun return_(checkDepositId: String): HttpResponseFor<CheckDeposit> =
            return_(checkDepositId, CheckDepositReturnParams.none())

        /** @see return\_ */
        @MustBeClosed
        fun return_(
            checkDepositId: String,
            params: CheckDepositReturnParams = CheckDepositReturnParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CheckDeposit> =
            return_(params.toBuilder().checkDepositId(checkDepositId).build(), requestOptions)

        /** @see return\_ */
        @MustBeClosed
        fun return_(
            checkDepositId: String,
            params: CheckDepositReturnParams = CheckDepositReturnParams.none(),
        ): HttpResponseFor<CheckDeposit> = return_(checkDepositId, params, RequestOptions.none())

        /** @see return\_ */
        @MustBeClosed
        fun return_(
            params: CheckDepositReturnParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CheckDeposit>

        /** @see return\_ */
        @MustBeClosed
        fun return_(params: CheckDepositReturnParams): HttpResponseFor<CheckDeposit> =
            return_(params, RequestOptions.none())

        /** @see return\_ */
        @MustBeClosed
        fun return_(
            checkDepositId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CheckDeposit> =
            return_(checkDepositId, CheckDepositReturnParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /simulations/check_deposits/{check_deposit_id}/submit`, but is otherwise the same as
         * [CheckDepositService.submit].
         */
        @MustBeClosed
        fun submit(checkDepositId: String): HttpResponseFor<CheckDeposit> =
            submit(checkDepositId, CheckDepositSubmitParams.none())

        /** @see submit */
        @MustBeClosed
        fun submit(
            checkDepositId: String,
            params: CheckDepositSubmitParams = CheckDepositSubmitParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CheckDeposit> =
            submit(params.toBuilder().checkDepositId(checkDepositId).build(), requestOptions)

        /** @see submit */
        @MustBeClosed
        fun submit(
            checkDepositId: String,
            params: CheckDepositSubmitParams = CheckDepositSubmitParams.none(),
        ): HttpResponseFor<CheckDeposit> = submit(checkDepositId, params, RequestOptions.none())

        /** @see submit */
        @MustBeClosed
        fun submit(
            params: CheckDepositSubmitParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CheckDeposit>

        /** @see submit */
        @MustBeClosed
        fun submit(params: CheckDepositSubmitParams): HttpResponseFor<CheckDeposit> =
            submit(params, RequestOptions.none())

        /** @see submit */
        @MustBeClosed
        fun submit(
            checkDepositId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CheckDeposit> =
            submit(checkDepositId, CheckDepositSubmitParams.none(), requestOptions)
    }
}
