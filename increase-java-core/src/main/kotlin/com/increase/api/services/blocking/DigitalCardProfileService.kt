// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.digitalcardprofiles.DigitalCardProfile
import com.increase.api.models.digitalcardprofiles.DigitalCardProfileArchiveParams
import com.increase.api.models.digitalcardprofiles.DigitalCardProfileCloneParams
import com.increase.api.models.digitalcardprofiles.DigitalCardProfileCreateParams
import com.increase.api.models.digitalcardprofiles.DigitalCardProfileListPage
import com.increase.api.models.digitalcardprofiles.DigitalCardProfileListParams
import com.increase.api.models.digitalcardprofiles.DigitalCardProfileRetrieveParams
import java.util.function.Consumer

interface DigitalCardProfileService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DigitalCardProfileService

    /** Create a Digital Card Profile */
    fun create(params: DigitalCardProfileCreateParams): DigitalCardProfile =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: DigitalCardProfileCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DigitalCardProfile

    /** Retrieve a Digital Card Profile */
    fun retrieve(digitalCardProfileId: String): DigitalCardProfile =
        retrieve(digitalCardProfileId, DigitalCardProfileRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        digitalCardProfileId: String,
        params: DigitalCardProfileRetrieveParams = DigitalCardProfileRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DigitalCardProfile =
        retrieve(
            params.toBuilder().digitalCardProfileId(digitalCardProfileId).build(),
            requestOptions,
        )

    /** @see retrieve */
    fun retrieve(
        digitalCardProfileId: String,
        params: DigitalCardProfileRetrieveParams = DigitalCardProfileRetrieveParams.none(),
    ): DigitalCardProfile = retrieve(digitalCardProfileId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: DigitalCardProfileRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DigitalCardProfile

    /** @see retrieve */
    fun retrieve(params: DigitalCardProfileRetrieveParams): DigitalCardProfile =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(digitalCardProfileId: String, requestOptions: RequestOptions): DigitalCardProfile =
        retrieve(digitalCardProfileId, DigitalCardProfileRetrieveParams.none(), requestOptions)

    /** List Card Profiles */
    fun list(): DigitalCardProfileListPage = list(DigitalCardProfileListParams.none())

    /** @see list */
    fun list(
        params: DigitalCardProfileListParams = DigitalCardProfileListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DigitalCardProfileListPage

    /** @see list */
    fun list(
        params: DigitalCardProfileListParams = DigitalCardProfileListParams.none()
    ): DigitalCardProfileListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): DigitalCardProfileListPage =
        list(DigitalCardProfileListParams.none(), requestOptions)

    /** Archive a Digital Card Profile */
    fun archive(digitalCardProfileId: String): DigitalCardProfile =
        archive(digitalCardProfileId, DigitalCardProfileArchiveParams.none())

    /** @see archive */
    fun archive(
        digitalCardProfileId: String,
        params: DigitalCardProfileArchiveParams = DigitalCardProfileArchiveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DigitalCardProfile =
        archive(
            params.toBuilder().digitalCardProfileId(digitalCardProfileId).build(),
            requestOptions,
        )

    /** @see archive */
    fun archive(
        digitalCardProfileId: String,
        params: DigitalCardProfileArchiveParams = DigitalCardProfileArchiveParams.none(),
    ): DigitalCardProfile = archive(digitalCardProfileId, params, RequestOptions.none())

    /** @see archive */
    fun archive(
        params: DigitalCardProfileArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DigitalCardProfile

    /** @see archive */
    fun archive(params: DigitalCardProfileArchiveParams): DigitalCardProfile =
        archive(params, RequestOptions.none())

    /** @see archive */
    fun archive(digitalCardProfileId: String, requestOptions: RequestOptions): DigitalCardProfile =
        archive(digitalCardProfileId, DigitalCardProfileArchiveParams.none(), requestOptions)

    /** Clones a Digital Card Profile */
    fun clone(digitalCardProfileId: String): DigitalCardProfile =
        clone(digitalCardProfileId, DigitalCardProfileCloneParams.none())

    /** @see clone */
    fun clone(
        digitalCardProfileId: String,
        params: DigitalCardProfileCloneParams = DigitalCardProfileCloneParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DigitalCardProfile =
        clone(params.toBuilder().digitalCardProfileId(digitalCardProfileId).build(), requestOptions)

    /** @see clone */
    fun clone(
        digitalCardProfileId: String,
        params: DigitalCardProfileCloneParams = DigitalCardProfileCloneParams.none(),
    ): DigitalCardProfile = clone(digitalCardProfileId, params, RequestOptions.none())

    /** @see clone */
    fun clone(
        params: DigitalCardProfileCloneParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DigitalCardProfile

    /** @see clone */
    fun clone(params: DigitalCardProfileCloneParams): DigitalCardProfile =
        clone(params, RequestOptions.none())

    /** @see clone */
    fun clone(digitalCardProfileId: String, requestOptions: RequestOptions): DigitalCardProfile =
        clone(digitalCardProfileId, DigitalCardProfileCloneParams.none(), requestOptions)

    /**
     * A view of [DigitalCardProfileService] that provides access to raw HTTP responses for each
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
        ): DigitalCardProfileService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /digital_card_profiles`, but is otherwise the same
         * as [DigitalCardProfileService.create].
         */
        @MustBeClosed
        fun create(params: DigitalCardProfileCreateParams): HttpResponseFor<DigitalCardProfile> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: DigitalCardProfileCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DigitalCardProfile>

        /**
         * Returns a raw HTTP response for `get /digital_card_profiles/{digital_card_profile_id}`,
         * but is otherwise the same as [DigitalCardProfileService.retrieve].
         */
        @MustBeClosed
        fun retrieve(digitalCardProfileId: String): HttpResponseFor<DigitalCardProfile> =
            retrieve(digitalCardProfileId, DigitalCardProfileRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            digitalCardProfileId: String,
            params: DigitalCardProfileRetrieveParams = DigitalCardProfileRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DigitalCardProfile> =
            retrieve(
                params.toBuilder().digitalCardProfileId(digitalCardProfileId).build(),
                requestOptions,
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            digitalCardProfileId: String,
            params: DigitalCardProfileRetrieveParams = DigitalCardProfileRetrieveParams.none(),
        ): HttpResponseFor<DigitalCardProfile> =
            retrieve(digitalCardProfileId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: DigitalCardProfileRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DigitalCardProfile>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: DigitalCardProfileRetrieveParams
        ): HttpResponseFor<DigitalCardProfile> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            digitalCardProfileId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DigitalCardProfile> =
            retrieve(digitalCardProfileId, DigitalCardProfileRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /digital_card_profiles`, but is otherwise the same
         * as [DigitalCardProfileService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<DigitalCardProfileListPage> =
            list(DigitalCardProfileListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: DigitalCardProfileListParams = DigitalCardProfileListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DigitalCardProfileListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: DigitalCardProfileListParams = DigitalCardProfileListParams.none()
        ): HttpResponseFor<DigitalCardProfileListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<DigitalCardProfileListPage> =
            list(DigitalCardProfileListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /digital_card_profiles/{digital_card_profile_id}/archive`, but is otherwise the same as
         * [DigitalCardProfileService.archive].
         */
        @MustBeClosed
        fun archive(digitalCardProfileId: String): HttpResponseFor<DigitalCardProfile> =
            archive(digitalCardProfileId, DigitalCardProfileArchiveParams.none())

        /** @see archive */
        @MustBeClosed
        fun archive(
            digitalCardProfileId: String,
            params: DigitalCardProfileArchiveParams = DigitalCardProfileArchiveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DigitalCardProfile> =
            archive(
                params.toBuilder().digitalCardProfileId(digitalCardProfileId).build(),
                requestOptions,
            )

        /** @see archive */
        @MustBeClosed
        fun archive(
            digitalCardProfileId: String,
            params: DigitalCardProfileArchiveParams = DigitalCardProfileArchiveParams.none(),
        ): HttpResponseFor<DigitalCardProfile> =
            archive(digitalCardProfileId, params, RequestOptions.none())

        /** @see archive */
        @MustBeClosed
        fun archive(
            params: DigitalCardProfileArchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DigitalCardProfile>

        /** @see archive */
        @MustBeClosed
        fun archive(params: DigitalCardProfileArchiveParams): HttpResponseFor<DigitalCardProfile> =
            archive(params, RequestOptions.none())

        /** @see archive */
        @MustBeClosed
        fun archive(
            digitalCardProfileId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DigitalCardProfile> =
            archive(digitalCardProfileId, DigitalCardProfileArchiveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /digital_card_profiles/{digital_card_profile_id}/clone`, but is otherwise the same as
         * [DigitalCardProfileService.clone].
         */
        @MustBeClosed
        fun clone(digitalCardProfileId: String): HttpResponseFor<DigitalCardProfile> =
            clone(digitalCardProfileId, DigitalCardProfileCloneParams.none())

        /** @see clone */
        @MustBeClosed
        fun clone(
            digitalCardProfileId: String,
            params: DigitalCardProfileCloneParams = DigitalCardProfileCloneParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DigitalCardProfile> =
            clone(
                params.toBuilder().digitalCardProfileId(digitalCardProfileId).build(),
                requestOptions,
            )

        /** @see clone */
        @MustBeClosed
        fun clone(
            digitalCardProfileId: String,
            params: DigitalCardProfileCloneParams = DigitalCardProfileCloneParams.none(),
        ): HttpResponseFor<DigitalCardProfile> =
            clone(digitalCardProfileId, params, RequestOptions.none())

        /** @see clone */
        @MustBeClosed
        fun clone(
            params: DigitalCardProfileCloneParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DigitalCardProfile>

        /** @see clone */
        @MustBeClosed
        fun clone(params: DigitalCardProfileCloneParams): HttpResponseFor<DigitalCardProfile> =
            clone(params, RequestOptions.none())

        /** @see clone */
        @MustBeClosed
        fun clone(
            digitalCardProfileId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DigitalCardProfile> =
            clone(digitalCardProfileId, DigitalCardProfileCloneParams.none(), requestOptions)
    }
}
