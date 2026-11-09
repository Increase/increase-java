// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.checkbooks.Checkbook
import com.increase.api.models.checkbooks.CheckbookCreateParams
import com.increase.api.models.checkbooks.CheckbookListPage
import com.increase.api.models.checkbooks.CheckbookListParams
import com.increase.api.models.checkbooks.CheckbookRetrieveParams
import com.increase.api.models.checkbooks.CheckbookStopParams
import java.util.function.Consumer

interface CheckbookService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CheckbookService

    /** Create a Checkbook */
    fun create(params: CheckbookCreateParams): Checkbook = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CheckbookCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Checkbook

    /** Retrieve a Checkbook */
    fun retrieve(checkbookId: String): Checkbook =
        retrieve(checkbookId, CheckbookRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        checkbookId: String,
        params: CheckbookRetrieveParams = CheckbookRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Checkbook = retrieve(params.toBuilder().checkbookId(checkbookId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        checkbookId: String,
        params: CheckbookRetrieveParams = CheckbookRetrieveParams.none(),
    ): Checkbook = retrieve(checkbookId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: CheckbookRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Checkbook

    /** @see retrieve */
    fun retrieve(params: CheckbookRetrieveParams): Checkbook =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(checkbookId: String, requestOptions: RequestOptions): Checkbook =
        retrieve(checkbookId, CheckbookRetrieveParams.none(), requestOptions)

    /** List Checkbooks */
    fun list(): CheckbookListPage = list(CheckbookListParams.none())

    /** @see list */
    fun list(
        params: CheckbookListParams = CheckbookListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CheckbookListPage

    /** @see list */
    fun list(params: CheckbookListParams = CheckbookListParams.none()): CheckbookListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CheckbookListPage =
        list(CheckbookListParams.none(), requestOptions)

    /**
     * Stop a Checkbook. Stopping a Checkbook stops all of its checks that have not yet been
     * deposited.
     */
    fun stop(checkbookId: String): Checkbook = stop(checkbookId, CheckbookStopParams.none())

    /** @see stop */
    fun stop(
        checkbookId: String,
        params: CheckbookStopParams = CheckbookStopParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Checkbook = stop(params.toBuilder().checkbookId(checkbookId).build(), requestOptions)

    /** @see stop */
    fun stop(
        checkbookId: String,
        params: CheckbookStopParams = CheckbookStopParams.none(),
    ): Checkbook = stop(checkbookId, params, RequestOptions.none())

    /** @see stop */
    fun stop(
        params: CheckbookStopParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Checkbook

    /** @see stop */
    fun stop(params: CheckbookStopParams): Checkbook = stop(params, RequestOptions.none())

    /** @see stop */
    fun stop(checkbookId: String, requestOptions: RequestOptions): Checkbook =
        stop(checkbookId, CheckbookStopParams.none(), requestOptions)

    /** A view of [CheckbookService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): CheckbookService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /checkbooks`, but is otherwise the same as
         * [CheckbookService.create].
         */
        @MustBeClosed
        fun create(params: CheckbookCreateParams): HttpResponseFor<Checkbook> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: CheckbookCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Checkbook>

        /**
         * Returns a raw HTTP response for `get /checkbooks/{checkbook_id}`, but is otherwise the
         * same as [CheckbookService.retrieve].
         */
        @MustBeClosed
        fun retrieve(checkbookId: String): HttpResponseFor<Checkbook> =
            retrieve(checkbookId, CheckbookRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            checkbookId: String,
            params: CheckbookRetrieveParams = CheckbookRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Checkbook> =
            retrieve(params.toBuilder().checkbookId(checkbookId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            checkbookId: String,
            params: CheckbookRetrieveParams = CheckbookRetrieveParams.none(),
        ): HttpResponseFor<Checkbook> = retrieve(checkbookId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: CheckbookRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Checkbook>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: CheckbookRetrieveParams): HttpResponseFor<Checkbook> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            checkbookId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Checkbook> =
            retrieve(checkbookId, CheckbookRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /checkbooks`, but is otherwise the same as
         * [CheckbookService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<CheckbookListPage> = list(CheckbookListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: CheckbookListParams = CheckbookListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CheckbookListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: CheckbookListParams = CheckbookListParams.none()
        ): HttpResponseFor<CheckbookListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<CheckbookListPage> =
            list(CheckbookListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /checkbooks/{checkbook_id}/stop`, but is otherwise
         * the same as [CheckbookService.stop].
         */
        @MustBeClosed
        fun stop(checkbookId: String): HttpResponseFor<Checkbook> =
            stop(checkbookId, CheckbookStopParams.none())

        /** @see stop */
        @MustBeClosed
        fun stop(
            checkbookId: String,
            params: CheckbookStopParams = CheckbookStopParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Checkbook> =
            stop(params.toBuilder().checkbookId(checkbookId).build(), requestOptions)

        /** @see stop */
        @MustBeClosed
        fun stop(
            checkbookId: String,
            params: CheckbookStopParams = CheckbookStopParams.none(),
        ): HttpResponseFor<Checkbook> = stop(checkbookId, params, RequestOptions.none())

        /** @see stop */
        @MustBeClosed
        fun stop(
            params: CheckbookStopParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Checkbook>

        /** @see stop */
        @MustBeClosed
        fun stop(params: CheckbookStopParams): HttpResponseFor<Checkbook> =
            stop(params, RequestOptions.none())

        /** @see stop */
        @MustBeClosed
        fun stop(checkbookId: String, requestOptions: RequestOptions): HttpResponseFor<Checkbook> =
            stop(checkbookId, CheckbookStopParams.none(), requestOptions)
    }
}
