// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.DigitalCardProfile
import com.increase.api.models.DigitalCardProfileArchiveParams
import com.increase.api.models.DigitalCardProfileCloneParams
import com.increase.api.models.DigitalCardProfileCreateParams
import com.increase.api.models.DigitalCardProfileListPage
import com.increase.api.models.DigitalCardProfileListParams
import com.increase.api.models.DigitalCardProfileRetrieveParams

interface DigitalCardProfileService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a Digital Card Profile */
    @JvmOverloads
    fun create(
        params: DigitalCardProfileCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DigitalCardProfile

    /** Retrieve a Digital Card Profile */
    @JvmOverloads
    fun retrieve(
        params: DigitalCardProfileRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DigitalCardProfile

    /** List Card Profiles */
    @JvmOverloads
    fun list(
        params: DigitalCardProfileListParams = DigitalCardProfileListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DigitalCardProfileListPage

    /** List Card Profiles */
    fun list(requestOptions: RequestOptions): DigitalCardProfileListPage =
        list(DigitalCardProfileListParams.none(), requestOptions)

    /** Archive a Digital Card Profile */
    @JvmOverloads
    fun archive(
        params: DigitalCardProfileArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DigitalCardProfile

    /** Clones a Digital Card Profile */
    @JvmOverloads
    fun clone(
        params: DigitalCardProfileCloneParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DigitalCardProfile

    /**
     * A view of [DigitalCardProfileService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /digital_card_profiles`, but is otherwise the same
         * as [DigitalCardProfileService.create].
         */
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: DigitalCardProfileCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DigitalCardProfile>

        /**
         * Returns a raw HTTP response for `get /digital_card_profiles/{digital_card_profile_id}`,
         * but is otherwise the same as [DigitalCardProfileService.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: DigitalCardProfileRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DigitalCardProfile>

        /**
         * Returns a raw HTTP response for `get /digital_card_profiles`, but is otherwise the same
         * as [DigitalCardProfileService.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: DigitalCardProfileListParams = DigitalCardProfileListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DigitalCardProfileListPage>

        /**
         * Returns a raw HTTP response for `get /digital_card_profiles`, but is otherwise the same
         * as [DigitalCardProfileService.list].
         */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<DigitalCardProfileListPage> =
            list(DigitalCardProfileListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /digital_card_profiles/{digital_card_profile_id}/archive`, but is otherwise the same as
         * [DigitalCardProfileService.archive].
         */
        @JvmOverloads
        @MustBeClosed
        fun archive(
            params: DigitalCardProfileArchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DigitalCardProfile>

        /**
         * Returns a raw HTTP response for `post
         * /digital_card_profiles/{digital_card_profile_id}/clone`, but is otherwise the same as
         * [DigitalCardProfileService.clone].
         */
        @JvmOverloads
        @MustBeClosed
        fun clone(
            params: DigitalCardProfileCloneParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DigitalCardProfile>
    }
}
