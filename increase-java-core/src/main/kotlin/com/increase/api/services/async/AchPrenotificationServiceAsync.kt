// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.AchPrenotification
import com.increase.api.models.AchPrenotificationCreateParams
import com.increase.api.models.AchPrenotificationListPageAsync
import com.increase.api.models.AchPrenotificationListParams
import com.increase.api.models.AchPrenotificationRetrieveParams
import java.util.concurrent.CompletableFuture

interface AchPrenotificationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create an ACH Prenotification */
    @JvmOverloads
    fun create(
        params: AchPrenotificationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AchPrenotification>

    /** Retrieve an ACH Prenotification */
    @JvmOverloads
    fun retrieve(
        params: AchPrenotificationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AchPrenotification>

    /** List ACH Prenotifications */
    @JvmOverloads
    fun list(
        params: AchPrenotificationListParams = AchPrenotificationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AchPrenotificationListPageAsync>

    /** List ACH Prenotifications */
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
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: AchPrenotificationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AchPrenotification>>

        /**
         * Returns a raw HTTP response for `get /ach_prenotifications/{ach_prenotification_id}`, but
         * is otherwise the same as [AchPrenotificationServiceAsync.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: AchPrenotificationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AchPrenotification>>

        /**
         * Returns a raw HTTP response for `get /ach_prenotifications`, but is otherwise the same as
         * [AchPrenotificationServiceAsync.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: AchPrenotificationListParams = AchPrenotificationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AchPrenotificationListPageAsync>>

        /**
         * Returns a raw HTTP response for `get /ach_prenotifications`, but is otherwise the same as
         * [AchPrenotificationServiceAsync.list].
         */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AchPrenotificationListPageAsync>> =
            list(AchPrenotificationListParams.none(), requestOptions)
    }
}
