// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.checkdeposits.CheckDeposit
import com.increase.api.models.simulations.checkdeposits.CheckDepositRejectParams
import com.increase.api.models.simulations.checkdeposits.CheckDepositReturnParams
import com.increase.api.models.simulations.checkdeposits.CheckDepositSubmitParams
import java.util.concurrent.CompletableFuture

interface CheckDepositServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Simulates the rejection of a [Check Deposit](#check-deposits) by Increase due to factors like
     * poor image quality. This Check Deposit must first have a `status` of `pending`.
     */
    fun reject(checkDepositId: String): CompletableFuture<CheckDeposit> =
        reject(checkDepositId, CheckDepositRejectParams.none())

    /** @see [reject] */
    fun reject(
        checkDepositId: String,
        params: CheckDepositRejectParams = CheckDepositRejectParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CheckDeposit> =
        reject(params.toBuilder().checkDepositId(checkDepositId).build(), requestOptions)

    /** @see [reject] */
    fun reject(
        checkDepositId: String,
        params: CheckDepositRejectParams = CheckDepositRejectParams.none(),
    ): CompletableFuture<CheckDeposit> = reject(checkDepositId, params, RequestOptions.none())

    /** @see [reject] */
    fun reject(
        params: CheckDepositRejectParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CheckDeposit>

    /** @see [reject] */
    fun reject(params: CheckDepositRejectParams): CompletableFuture<CheckDeposit> =
        reject(params, RequestOptions.none())

    /** @see [reject] */
    fun reject(
        checkDepositId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CheckDeposit> =
        reject(checkDepositId, CheckDepositRejectParams.none(), requestOptions)

    /**
     * Simulates the return of a [Check Deposit](#check-deposits). This Check Deposit must first
     * have a `status` of `submitted`.
     */
    fun return_(checkDepositId: String): CompletableFuture<CheckDeposit> =
        return_(checkDepositId, CheckDepositReturnParams.none())

    /** @see [return_] */
    fun return_(
        checkDepositId: String,
        params: CheckDepositReturnParams = CheckDepositReturnParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CheckDeposit> =
        return_(params.toBuilder().checkDepositId(checkDepositId).build(), requestOptions)

    /** @see [return_] */
    fun return_(
        checkDepositId: String,
        params: CheckDepositReturnParams = CheckDepositReturnParams.none(),
    ): CompletableFuture<CheckDeposit> = return_(checkDepositId, params, RequestOptions.none())

    /** @see [return_] */
    fun return_(
        params: CheckDepositReturnParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CheckDeposit>

    /** @see [return_] */
    fun return_(params: CheckDepositReturnParams): CompletableFuture<CheckDeposit> =
        return_(params, RequestOptions.none())

    /** @see [return_] */
    fun return_(
        checkDepositId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CheckDeposit> =
        return_(checkDepositId, CheckDepositReturnParams.none(), requestOptions)

    /**
     * Simulates the submission of a [Check Deposit](#check-deposits) to the Federal Reserve. This
     * Check Deposit must first have a `status` of `pending`.
     */
    fun submit(checkDepositId: String): CompletableFuture<CheckDeposit> =
        submit(checkDepositId, CheckDepositSubmitParams.none())

    /** @see [submit] */
    fun submit(
        checkDepositId: String,
        params: CheckDepositSubmitParams = CheckDepositSubmitParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CheckDeposit> =
        submit(params.toBuilder().checkDepositId(checkDepositId).build(), requestOptions)

    /** @see [submit] */
    fun submit(
        checkDepositId: String,
        params: CheckDepositSubmitParams = CheckDepositSubmitParams.none(),
    ): CompletableFuture<CheckDeposit> = submit(checkDepositId, params, RequestOptions.none())

    /** @see [submit] */
    fun submit(
        params: CheckDepositSubmitParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CheckDeposit>

    /** @see [submit] */
    fun submit(params: CheckDepositSubmitParams): CompletableFuture<CheckDeposit> =
        submit(params, RequestOptions.none())

    /** @see [submit] */
    fun submit(
        checkDepositId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CheckDeposit> =
        submit(checkDepositId, CheckDepositSubmitParams.none(), requestOptions)

    /**
     * A view of [CheckDepositServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post
         * /simulations/check_deposits/{check_deposit_id}/reject`, but is otherwise the same as
         * [CheckDepositServiceAsync.reject].
         */
        @MustBeClosed
        fun reject(checkDepositId: String): CompletableFuture<HttpResponseFor<CheckDeposit>> =
            reject(checkDepositId, CheckDepositRejectParams.none())

        /** @see [reject] */
        @MustBeClosed
        fun reject(
            checkDepositId: String,
            params: CheckDepositRejectParams = CheckDepositRejectParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CheckDeposit>> =
            reject(params.toBuilder().checkDepositId(checkDepositId).build(), requestOptions)

        /** @see [reject] */
        @MustBeClosed
        fun reject(
            checkDepositId: String,
            params: CheckDepositRejectParams = CheckDepositRejectParams.none(),
        ): CompletableFuture<HttpResponseFor<CheckDeposit>> =
            reject(checkDepositId, params, RequestOptions.none())

        /** @see [reject] */
        @MustBeClosed
        fun reject(
            params: CheckDepositRejectParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CheckDeposit>>

        /** @see [reject] */
        @MustBeClosed
        fun reject(
            params: CheckDepositRejectParams
        ): CompletableFuture<HttpResponseFor<CheckDeposit>> = reject(params, RequestOptions.none())

        /** @see [reject] */
        @MustBeClosed
        fun reject(
            checkDepositId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CheckDeposit>> =
            reject(checkDepositId, CheckDepositRejectParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /simulations/check_deposits/{check_deposit_id}/return`, but is otherwise the same as
         * [CheckDepositServiceAsync.return_].
         */
        @MustBeClosed
        fun return_(checkDepositId: String): CompletableFuture<HttpResponseFor<CheckDeposit>> =
            return_(checkDepositId, CheckDepositReturnParams.none())

        /** @see [return_] */
        @MustBeClosed
        fun return_(
            checkDepositId: String,
            params: CheckDepositReturnParams = CheckDepositReturnParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CheckDeposit>> =
            return_(params.toBuilder().checkDepositId(checkDepositId).build(), requestOptions)

        /** @see [return_] */
        @MustBeClosed
        fun return_(
            checkDepositId: String,
            params: CheckDepositReturnParams = CheckDepositReturnParams.none(),
        ): CompletableFuture<HttpResponseFor<CheckDeposit>> =
            return_(checkDepositId, params, RequestOptions.none())

        /** @see [return_] */
        @MustBeClosed
        fun return_(
            params: CheckDepositReturnParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CheckDeposit>>

        /** @see [return_] */
        @MustBeClosed
        fun return_(
            params: CheckDepositReturnParams
        ): CompletableFuture<HttpResponseFor<CheckDeposit>> = return_(params, RequestOptions.none())

        /** @see [return_] */
        @MustBeClosed
        fun return_(
            checkDepositId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CheckDeposit>> =
            return_(checkDepositId, CheckDepositReturnParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /simulations/check_deposits/{check_deposit_id}/submit`, but is otherwise the same as
         * [CheckDepositServiceAsync.submit].
         */
        @MustBeClosed
        fun submit(checkDepositId: String): CompletableFuture<HttpResponseFor<CheckDeposit>> =
            submit(checkDepositId, CheckDepositSubmitParams.none())

        /** @see [submit] */
        @MustBeClosed
        fun submit(
            checkDepositId: String,
            params: CheckDepositSubmitParams = CheckDepositSubmitParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CheckDeposit>> =
            submit(params.toBuilder().checkDepositId(checkDepositId).build(), requestOptions)

        /** @see [submit] */
        @MustBeClosed
        fun submit(
            checkDepositId: String,
            params: CheckDepositSubmitParams = CheckDepositSubmitParams.none(),
        ): CompletableFuture<HttpResponseFor<CheckDeposit>> =
            submit(checkDepositId, params, RequestOptions.none())

        /** @see [submit] */
        @MustBeClosed
        fun submit(
            params: CheckDepositSubmitParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CheckDeposit>>

        /** @see [submit] */
        @MustBeClosed
        fun submit(
            params: CheckDepositSubmitParams
        ): CompletableFuture<HttpResponseFor<CheckDeposit>> = submit(params, RequestOptions.none())

        /** @see [submit] */
        @MustBeClosed
        fun submit(
            checkDepositId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CheckDeposit>> =
            submit(checkDepositId, CheckDepositSubmitParams.none(), requestOptions)
    }
}
