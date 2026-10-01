// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.physicalcheckbatches.PhysicalCheckBatch
import com.increase.api.models.physicalcheckbatches.PhysicalCheckBatchCancelParams
import com.increase.api.models.physicalcheckbatches.PhysicalCheckBatchCompleteParams
import com.increase.api.models.physicalcheckbatches.PhysicalCheckBatchCreateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface PhysicalCheckBatchServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PhysicalCheckBatchServiceAsync

    /** Create a Physical Check Batch */
    fun create(params: PhysicalCheckBatchCreateParams): CompletableFuture<PhysicalCheckBatch> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: PhysicalCheckBatchCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhysicalCheckBatch>

    /** Cancel a pending Physical Check Batch, which cancels all of its related checks. */
    fun cancel(physicalCheckBatchId: String): CompletableFuture<PhysicalCheckBatch> =
        cancel(physicalCheckBatchId, PhysicalCheckBatchCancelParams.none())

    /** @see cancel */
    fun cancel(
        physicalCheckBatchId: String,
        params: PhysicalCheckBatchCancelParams = PhysicalCheckBatchCancelParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhysicalCheckBatch> =
        cancel(
            params.toBuilder().physicalCheckBatchId(physicalCheckBatchId).build(),
            requestOptions,
        )

    /** @see cancel */
    fun cancel(
        physicalCheckBatchId: String,
        params: PhysicalCheckBatchCancelParams = PhysicalCheckBatchCancelParams.none(),
    ): CompletableFuture<PhysicalCheckBatch> =
        cancel(physicalCheckBatchId, params, RequestOptions.none())

    /** @see cancel */
    fun cancel(
        params: PhysicalCheckBatchCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhysicalCheckBatch>

    /** @see cancel */
    fun cancel(params: PhysicalCheckBatchCancelParams): CompletableFuture<PhysicalCheckBatch> =
        cancel(params, RequestOptions.none())

    /** @see cancel */
    fun cancel(
        physicalCheckBatchId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<PhysicalCheckBatch> =
        cancel(physicalCheckBatchId, PhysicalCheckBatchCancelParams.none(), requestOptions)

    /**
     * Completing a Physical Check Batch closes it to new Physical Checks and begins the process of
     * printing and mailing it.
     */
    fun complete(physicalCheckBatchId: String): CompletableFuture<PhysicalCheckBatch> =
        complete(physicalCheckBatchId, PhysicalCheckBatchCompleteParams.none())

    /** @see complete */
    fun complete(
        physicalCheckBatchId: String,
        params: PhysicalCheckBatchCompleteParams = PhysicalCheckBatchCompleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhysicalCheckBatch> =
        complete(
            params.toBuilder().physicalCheckBatchId(physicalCheckBatchId).build(),
            requestOptions,
        )

    /** @see complete */
    fun complete(
        physicalCheckBatchId: String,
        params: PhysicalCheckBatchCompleteParams = PhysicalCheckBatchCompleteParams.none(),
    ): CompletableFuture<PhysicalCheckBatch> =
        complete(physicalCheckBatchId, params, RequestOptions.none())

    /** @see complete */
    fun complete(
        params: PhysicalCheckBatchCompleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhysicalCheckBatch>

    /** @see complete */
    fun complete(params: PhysicalCheckBatchCompleteParams): CompletableFuture<PhysicalCheckBatch> =
        complete(params, RequestOptions.none())

    /** @see complete */
    fun complete(
        physicalCheckBatchId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<PhysicalCheckBatch> =
        complete(physicalCheckBatchId, PhysicalCheckBatchCompleteParams.none(), requestOptions)

    /**
     * A view of [PhysicalCheckBatchServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PhysicalCheckBatchServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /physical_check_batches`, but is otherwise the same
         * as [PhysicalCheckBatchServiceAsync.create].
         */
        fun create(
            params: PhysicalCheckBatchCreateParams
        ): CompletableFuture<HttpResponseFor<PhysicalCheckBatch>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: PhysicalCheckBatchCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhysicalCheckBatch>>

        /**
         * Returns a raw HTTP response for `post
         * /physical_check_batches/{physical_check_batch_id}/cancel`, but is otherwise the same as
         * [PhysicalCheckBatchServiceAsync.cancel].
         */
        fun cancel(
            physicalCheckBatchId: String
        ): CompletableFuture<HttpResponseFor<PhysicalCheckBatch>> =
            cancel(physicalCheckBatchId, PhysicalCheckBatchCancelParams.none())

        /** @see cancel */
        fun cancel(
            physicalCheckBatchId: String,
            params: PhysicalCheckBatchCancelParams = PhysicalCheckBatchCancelParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhysicalCheckBatch>> =
            cancel(
                params.toBuilder().physicalCheckBatchId(physicalCheckBatchId).build(),
                requestOptions,
            )

        /** @see cancel */
        fun cancel(
            physicalCheckBatchId: String,
            params: PhysicalCheckBatchCancelParams = PhysicalCheckBatchCancelParams.none(),
        ): CompletableFuture<HttpResponseFor<PhysicalCheckBatch>> =
            cancel(physicalCheckBatchId, params, RequestOptions.none())

        /** @see cancel */
        fun cancel(
            params: PhysicalCheckBatchCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhysicalCheckBatch>>

        /** @see cancel */
        fun cancel(
            params: PhysicalCheckBatchCancelParams
        ): CompletableFuture<HttpResponseFor<PhysicalCheckBatch>> =
            cancel(params, RequestOptions.none())

        /** @see cancel */
        fun cancel(
            physicalCheckBatchId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PhysicalCheckBatch>> =
            cancel(physicalCheckBatchId, PhysicalCheckBatchCancelParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /physical_check_batches/{physical_check_batch_id}/complete`, but is otherwise the same as
         * [PhysicalCheckBatchServiceAsync.complete].
         */
        fun complete(
            physicalCheckBatchId: String
        ): CompletableFuture<HttpResponseFor<PhysicalCheckBatch>> =
            complete(physicalCheckBatchId, PhysicalCheckBatchCompleteParams.none())

        /** @see complete */
        fun complete(
            physicalCheckBatchId: String,
            params: PhysicalCheckBatchCompleteParams = PhysicalCheckBatchCompleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhysicalCheckBatch>> =
            complete(
                params.toBuilder().physicalCheckBatchId(physicalCheckBatchId).build(),
                requestOptions,
            )

        /** @see complete */
        fun complete(
            physicalCheckBatchId: String,
            params: PhysicalCheckBatchCompleteParams = PhysicalCheckBatchCompleteParams.none(),
        ): CompletableFuture<HttpResponseFor<PhysicalCheckBatch>> =
            complete(physicalCheckBatchId, params, RequestOptions.none())

        /** @see complete */
        fun complete(
            params: PhysicalCheckBatchCompleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhysicalCheckBatch>>

        /** @see complete */
        fun complete(
            params: PhysicalCheckBatchCompleteParams
        ): CompletableFuture<HttpResponseFor<PhysicalCheckBatch>> =
            complete(params, RequestOptions.none())

        /** @see complete */
        fun complete(
            physicalCheckBatchId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PhysicalCheckBatch>> =
            complete(physicalCheckBatchId, PhysicalCheckBatchCompleteParams.none(), requestOptions)
    }
}
