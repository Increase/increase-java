// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.achprenotifications.AchPrenotification
import com.increase.api.models.achprenotifications.AchPrenotificationCreateParams
import com.increase.api.models.achprenotifications.AchPrenotificationListPageAsync
import com.increase.api.models.achprenotifications.AchPrenotificationListParams
import com.increase.api.models.achprenotifications.AchPrenotificationRetrieveParams
import java.util.concurrent.CompletableFuture

interface AchPrenotificationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create an ACH Prenotification */
    fun create(params: AchPrenotificationCreateParams): CompletableFuture<AchPrenotification> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: AchPrenotificationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AchPrenotification>

    /** Retrieve an ACH Prenotification */
    fun retrieve(params: AchPrenotificationRetrieveParams): CompletableFuture<AchPrenotification> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: AchPrenotificationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AchPrenotification>

    /** List ACH Prenotifications */
    fun list(): CompletableFuture<AchPrenotificationListPageAsync> =
        list(AchPrenotificationListParams.none())

    /** @see [list] */
    fun list(
        params: AchPrenotificationListParams = AchPrenotificationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AchPrenotificationListPageAsync>

    /** @see [list] */
    fun list(
        params: AchPrenotificationListParams = AchPrenotificationListParams.none()
    ): CompletableFuture<AchPrenotificationListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<AchPrenotificationListPageAsync> =
        list(AchPrenotificationListParams.none(), requestOptions)

    /**
     * A view of [AchPrenotificationServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /ach_prenotifications`, but is otherwise the same
         * as [AchPrenotificationServiceAsync.create].
         */
        @MustBeClosed
        fun create(
            params: AchPrenotificationCreateParams
        ): CompletableFuture<HttpResponseFor<AchPrenotification>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: AchPrenotificationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AchPrenotification>>

        /**
         * Returns a raw HTTP response for `get /ach_prenotifications/{ach_prenotification_id}`, but
         * is otherwise the same as [AchPrenotificationServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: AchPrenotificationRetrieveParams
        ): CompletableFuture<HttpResponseFor<AchPrenotification>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: AchPrenotificationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AchPrenotification>>

        /**
         * Returns a raw HTTP response for `get /ach_prenotifications`, but is otherwise the same as
         * [AchPrenotificationServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<AchPrenotificationListPageAsync>> =
            list(AchPrenotificationListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: AchPrenotificationListParams = AchPrenotificationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AchPrenotificationListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: AchPrenotificationListParams = AchPrenotificationListParams.none()
        ): CompletableFuture<HttpResponseFor<AchPrenotificationListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AchPrenotificationListPageAsync>> =
            list(AchPrenotificationListParams.none(), requestOptions)
    }
}
