// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.achprenotifications.AchPrenotification
import com.increase.api.models.achprenotifications.AchPrenotificationCreateParams
import com.increase.api.models.achprenotifications.AchPrenotificationListPage
import com.increase.api.models.achprenotifications.AchPrenotificationListParams
import com.increase.api.models.achprenotifications.AchPrenotificationRetrieveParams
import java.util.function.Consumer

interface AchPrenotificationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AchPrenotificationService

    /** Create an ACH Prenotification */
    fun create(params: AchPrenotificationCreateParams): AchPrenotification =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: AchPrenotificationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AchPrenotification

    /** Retrieve an ACH Prenotification */
    fun retrieve(achPrenotificationId: String): AchPrenotification =
        retrieve(achPrenotificationId, AchPrenotificationRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        achPrenotificationId: String,
        params: AchPrenotificationRetrieveParams = AchPrenotificationRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AchPrenotification =
        retrieve(
            params.toBuilder().achPrenotificationId(achPrenotificationId).build(),
            requestOptions,
        )

    /** @see [retrieve] */
    fun retrieve(
        achPrenotificationId: String,
        params: AchPrenotificationRetrieveParams = AchPrenotificationRetrieveParams.none(),
    ): AchPrenotification = retrieve(achPrenotificationId, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: AchPrenotificationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AchPrenotification

    /** @see [retrieve] */
    fun retrieve(params: AchPrenotificationRetrieveParams): AchPrenotification =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(achPrenotificationId: String, requestOptions: RequestOptions): AchPrenotification =
        retrieve(achPrenotificationId, AchPrenotificationRetrieveParams.none(), requestOptions)

    /** List ACH Prenotifications */
    fun list(): AchPrenotificationListPage = list(AchPrenotificationListParams.none())

    /** @see [list] */
    fun list(
        params: AchPrenotificationListParams = AchPrenotificationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AchPrenotificationListPage

    /** @see [list] */
    fun list(
        params: AchPrenotificationListParams = AchPrenotificationListParams.none()
    ): AchPrenotificationListPage = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): AchPrenotificationListPage =
        list(AchPrenotificationListParams.none(), requestOptions)

    /**
     * A view of [AchPrenotificationService] that provides access to raw HTTP responses for each
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
        ): AchPrenotificationService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /ach_prenotifications`, but is otherwise the same
         * as [AchPrenotificationService.create].
         */
        @MustBeClosed
        fun create(params: AchPrenotificationCreateParams): HttpResponseFor<AchPrenotification> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: AchPrenotificationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AchPrenotification>

        /**
         * Returns a raw HTTP response for `get /ach_prenotifications/{ach_prenotification_id}`, but
         * is otherwise the same as [AchPrenotificationService.retrieve].
         */
        @MustBeClosed
        fun retrieve(achPrenotificationId: String): HttpResponseFor<AchPrenotification> =
            retrieve(achPrenotificationId, AchPrenotificationRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            achPrenotificationId: String,
            params: AchPrenotificationRetrieveParams = AchPrenotificationRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AchPrenotification> =
            retrieve(
                params.toBuilder().achPrenotificationId(achPrenotificationId).build(),
                requestOptions,
            )

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            achPrenotificationId: String,
            params: AchPrenotificationRetrieveParams = AchPrenotificationRetrieveParams.none(),
        ): HttpResponseFor<AchPrenotification> =
            retrieve(achPrenotificationId, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: AchPrenotificationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AchPrenotification>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: AchPrenotificationRetrieveParams
        ): HttpResponseFor<AchPrenotification> = retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            achPrenotificationId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AchPrenotification> =
            retrieve(achPrenotificationId, AchPrenotificationRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /ach_prenotifications`, but is otherwise the same as
         * [AchPrenotificationService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<AchPrenotificationListPage> =
            list(AchPrenotificationListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: AchPrenotificationListParams = AchPrenotificationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AchPrenotificationListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: AchPrenotificationListParams = AchPrenotificationListParams.none()
        ): HttpResponseFor<AchPrenotificationListPage> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<AchPrenotificationListPage> =
            list(AchPrenotificationListParams.none(), requestOptions)
    }
}
