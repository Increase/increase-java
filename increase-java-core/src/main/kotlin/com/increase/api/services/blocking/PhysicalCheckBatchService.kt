// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.physicalcheckbatches.PhysicalCheckBatch
import com.increase.api.models.physicalcheckbatches.PhysicalCheckBatchCancelParams
import com.increase.api.models.physicalcheckbatches.PhysicalCheckBatchCompleteParams
import com.increase.api.models.physicalcheckbatches.PhysicalCheckBatchCreateParams
import java.util.function.Consumer

interface PhysicalCheckBatchService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PhysicalCheckBatchService

    /** Create a Physical Check Batch */
    fun create(params: PhysicalCheckBatchCreateParams): PhysicalCheckBatch =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: PhysicalCheckBatchCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhysicalCheckBatch

    /** Cancel a pending Physical Check Batch, which cancels all of its related checks. */
    fun cancel(physicalCheckBatchId: String): PhysicalCheckBatch =
        cancel(physicalCheckBatchId, PhysicalCheckBatchCancelParams.none())

    /** @see cancel */
    fun cancel(
        physicalCheckBatchId: String,
        params: PhysicalCheckBatchCancelParams = PhysicalCheckBatchCancelParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhysicalCheckBatch =
        cancel(
            params.toBuilder().physicalCheckBatchId(physicalCheckBatchId).build(),
            requestOptions,
        )

    /** @see cancel */
    fun cancel(
        physicalCheckBatchId: String,
        params: PhysicalCheckBatchCancelParams = PhysicalCheckBatchCancelParams.none(),
    ): PhysicalCheckBatch = cancel(physicalCheckBatchId, params, RequestOptions.none())

    /** @see cancel */
    fun cancel(
        params: PhysicalCheckBatchCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhysicalCheckBatch

    /** @see cancel */
    fun cancel(params: PhysicalCheckBatchCancelParams): PhysicalCheckBatch =
        cancel(params, RequestOptions.none())

    /** @see cancel */
    fun cancel(physicalCheckBatchId: String, requestOptions: RequestOptions): PhysicalCheckBatch =
        cancel(physicalCheckBatchId, PhysicalCheckBatchCancelParams.none(), requestOptions)

    /**
     * Completing a Physical Check Batch closes it to new Physical Checks and begins the process of
     * printing and mailing it.
     */
    fun complete(physicalCheckBatchId: String): PhysicalCheckBatch =
        complete(physicalCheckBatchId, PhysicalCheckBatchCompleteParams.none())

    /** @see complete */
    fun complete(
        physicalCheckBatchId: String,
        params: PhysicalCheckBatchCompleteParams = PhysicalCheckBatchCompleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhysicalCheckBatch =
        complete(
            params.toBuilder().physicalCheckBatchId(physicalCheckBatchId).build(),
            requestOptions,
        )

    /** @see complete */
    fun complete(
        physicalCheckBatchId: String,
        params: PhysicalCheckBatchCompleteParams = PhysicalCheckBatchCompleteParams.none(),
    ): PhysicalCheckBatch = complete(physicalCheckBatchId, params, RequestOptions.none())

    /** @see complete */
    fun complete(
        params: PhysicalCheckBatchCompleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhysicalCheckBatch

    /** @see complete */
    fun complete(params: PhysicalCheckBatchCompleteParams): PhysicalCheckBatch =
        complete(params, RequestOptions.none())

    /** @see complete */
    fun complete(physicalCheckBatchId: String, requestOptions: RequestOptions): PhysicalCheckBatch =
        complete(physicalCheckBatchId, PhysicalCheckBatchCompleteParams.none(), requestOptions)

    /**
     * A view of [PhysicalCheckBatchService] that provides access to raw HTTP responses for each
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
        ): PhysicalCheckBatchService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /physical_check_batches`, but is otherwise the same
         * as [PhysicalCheckBatchService.create].
         */
        @MustBeClosed
        fun create(params: PhysicalCheckBatchCreateParams): HttpResponseFor<PhysicalCheckBatch> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: PhysicalCheckBatchCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhysicalCheckBatch>

        /**
         * Returns a raw HTTP response for `post
         * /physical_check_batches/{physical_check_batch_id}/cancel`, but is otherwise the same as
         * [PhysicalCheckBatchService.cancel].
         */
        @MustBeClosed
        fun cancel(physicalCheckBatchId: String): HttpResponseFor<PhysicalCheckBatch> =
            cancel(physicalCheckBatchId, PhysicalCheckBatchCancelParams.none())

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            physicalCheckBatchId: String,
            params: PhysicalCheckBatchCancelParams = PhysicalCheckBatchCancelParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhysicalCheckBatch> =
            cancel(
                params.toBuilder().physicalCheckBatchId(physicalCheckBatchId).build(),
                requestOptions,
            )

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            physicalCheckBatchId: String,
            params: PhysicalCheckBatchCancelParams = PhysicalCheckBatchCancelParams.none(),
        ): HttpResponseFor<PhysicalCheckBatch> =
            cancel(physicalCheckBatchId, params, RequestOptions.none())

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            params: PhysicalCheckBatchCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhysicalCheckBatch>

        /** @see cancel */
        @MustBeClosed
        fun cancel(params: PhysicalCheckBatchCancelParams): HttpResponseFor<PhysicalCheckBatch> =
            cancel(params, RequestOptions.none())

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            physicalCheckBatchId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PhysicalCheckBatch> =
            cancel(physicalCheckBatchId, PhysicalCheckBatchCancelParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /physical_check_batches/{physical_check_batch_id}/complete`, but is otherwise the same as
         * [PhysicalCheckBatchService.complete].
         */
        @MustBeClosed
        fun complete(physicalCheckBatchId: String): HttpResponseFor<PhysicalCheckBatch> =
            complete(physicalCheckBatchId, PhysicalCheckBatchCompleteParams.none())

        /** @see complete */
        @MustBeClosed
        fun complete(
            physicalCheckBatchId: String,
            params: PhysicalCheckBatchCompleteParams = PhysicalCheckBatchCompleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhysicalCheckBatch> =
            complete(
                params.toBuilder().physicalCheckBatchId(physicalCheckBatchId).build(),
                requestOptions,
            )

        /** @see complete */
        @MustBeClosed
        fun complete(
            physicalCheckBatchId: String,
            params: PhysicalCheckBatchCompleteParams = PhysicalCheckBatchCompleteParams.none(),
        ): HttpResponseFor<PhysicalCheckBatch> =
            complete(physicalCheckBatchId, params, RequestOptions.none())

        /** @see complete */
        @MustBeClosed
        fun complete(
            params: PhysicalCheckBatchCompleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhysicalCheckBatch>

        /** @see complete */
        @MustBeClosed
        fun complete(
            params: PhysicalCheckBatchCompleteParams
        ): HttpResponseFor<PhysicalCheckBatch> = complete(params, RequestOptions.none())

        /** @see complete */
        @MustBeClosed
        fun complete(
            physicalCheckBatchId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PhysicalCheckBatch> =
            complete(physicalCheckBatchId, PhysicalCheckBatchCompleteParams.none(), requestOptions)
    }
}
