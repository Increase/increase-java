// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.achprenotifications.AchPrenotification
import com.increase.api.models.achprenotifications.AchPrenotificationCreateParams
import com.increase.api.models.achprenotifications.AchPrenotificationListParams
import com.increase.api.models.achprenotifications.AchPrenotificationListResponse
import com.increase.api.models.achprenotifications.AchPrenotificationRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AchPrenotificationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AchPrenotificationServiceAsync

    /** Create an ACH Prenotification */
    fun create(params: AchPrenotificationCreateParams): CompletableFuture<AchPrenotification> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: AchPrenotificationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AchPrenotification>

    /** Retrieve an ACH Prenotification */
    fun retrieve(achPrenotificationId: String): CompletableFuture<AchPrenotification> =
        retrieve(achPrenotificationId, AchPrenotificationRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        achPrenotificationId: String,
        params: AchPrenotificationRetrieveParams = AchPrenotificationRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AchPrenotification> =
        retrieve(
            params.toBuilder().achPrenotificationId(achPrenotificationId).build(),
            requestOptions,
        )

    /** @see retrieve */
    fun retrieve(
        achPrenotificationId: String,
        params: AchPrenotificationRetrieveParams = AchPrenotificationRetrieveParams.none(),
    ): CompletableFuture<AchPrenotification> =
        retrieve(achPrenotificationId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: AchPrenotificationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AchPrenotification>

    /** @see retrieve */
    fun retrieve(params: AchPrenotificationRetrieveParams): CompletableFuture<AchPrenotification> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        achPrenotificationId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AchPrenotification> =
        retrieve(achPrenotificationId, AchPrenotificationRetrieveParams.none(), requestOptions)

    /** List ACH Prenotifications */
    fun list(): CompletableFuture<AchPrenotificationListResponse> =
        list(AchPrenotificationListParams.none())

    /** @see list */
    fun list(
        params: AchPrenotificationListParams = AchPrenotificationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AchPrenotificationListResponse>

    /** @see list */
    fun list(
        params: AchPrenotificationListParams = AchPrenotificationListParams.none()
    ): CompletableFuture<AchPrenotificationListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<AchPrenotificationListResponse> =
        list(AchPrenotificationListParams.none(), requestOptions)

    /**
     * A view of [AchPrenotificationServiceAsync] that provides access to raw HTTP responses for
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
        ): AchPrenotificationServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /ach_prenotifications`, but is otherwise the same
         * as [AchPrenotificationServiceAsync.create].
         */
        fun create(
            params: AchPrenotificationCreateParams
        ): CompletableFuture<HttpResponseFor<AchPrenotification>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: AchPrenotificationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AchPrenotification>>

        /**
         * Returns a raw HTTP response for `get /ach_prenotifications/{ach_prenotification_id}`, but
         * is otherwise the same as [AchPrenotificationServiceAsync.retrieve].
         */
        fun retrieve(
            achPrenotificationId: String
        ): CompletableFuture<HttpResponseFor<AchPrenotification>> =
            retrieve(achPrenotificationId, AchPrenotificationRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            achPrenotificationId: String,
            params: AchPrenotificationRetrieveParams = AchPrenotificationRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AchPrenotification>> =
            retrieve(
                params.toBuilder().achPrenotificationId(achPrenotificationId).build(),
                requestOptions,
            )

        /** @see retrieve */
        fun retrieve(
            achPrenotificationId: String,
            params: AchPrenotificationRetrieveParams = AchPrenotificationRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<AchPrenotification>> =
            retrieve(achPrenotificationId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: AchPrenotificationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AchPrenotification>>

        /** @see retrieve */
        fun retrieve(
            params: AchPrenotificationRetrieveParams
        ): CompletableFuture<HttpResponseFor<AchPrenotification>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            achPrenotificationId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AchPrenotification>> =
            retrieve(achPrenotificationId, AchPrenotificationRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /ach_prenotifications`, but is otherwise the same as
         * [AchPrenotificationServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<AchPrenotificationListResponse>> =
            list(AchPrenotificationListParams.none())

        /** @see list */
        fun list(
            params: AchPrenotificationListParams = AchPrenotificationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AchPrenotificationListResponse>>

        /** @see list */
        fun list(
            params: AchPrenotificationListParams = AchPrenotificationListParams.none()
        ): CompletableFuture<HttpResponseFor<AchPrenotificationListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AchPrenotificationListResponse>> =
            list(AchPrenotificationListParams.none(), requestOptions)
    }
}
