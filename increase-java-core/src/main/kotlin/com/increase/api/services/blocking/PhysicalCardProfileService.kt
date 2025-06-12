// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.physicalcardprofiles.PhysicalCardProfile
import com.increase.api.models.physicalcardprofiles.PhysicalCardProfileArchiveParams
import com.increase.api.models.physicalcardprofiles.PhysicalCardProfileCloneParams
import com.increase.api.models.physicalcardprofiles.PhysicalCardProfileCreateParams
import com.increase.api.models.physicalcardprofiles.PhysicalCardProfileListPage
import com.increase.api.models.physicalcardprofiles.PhysicalCardProfileListParams
import com.increase.api.models.physicalcardprofiles.PhysicalCardProfileRetrieveParams
import java.util.function.Consumer

interface PhysicalCardProfileService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PhysicalCardProfileService

    /** Create a Physical Card Profile */
    fun create(params: PhysicalCardProfileCreateParams): PhysicalCardProfile =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: PhysicalCardProfileCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhysicalCardProfile

    /** Retrieve a Card Profile */
    fun retrieve(physicalCardProfileId: String): PhysicalCardProfile =
        retrieve(physicalCardProfileId, PhysicalCardProfileRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        physicalCardProfileId: String,
        params: PhysicalCardProfileRetrieveParams = PhysicalCardProfileRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhysicalCardProfile =
        retrieve(
            params.toBuilder().physicalCardProfileId(physicalCardProfileId).build(),
            requestOptions,
        )

    /** @see [retrieve] */
    fun retrieve(
        physicalCardProfileId: String,
        params: PhysicalCardProfileRetrieveParams = PhysicalCardProfileRetrieveParams.none(),
    ): PhysicalCardProfile = retrieve(physicalCardProfileId, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: PhysicalCardProfileRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhysicalCardProfile

    /** @see [retrieve] */
    fun retrieve(params: PhysicalCardProfileRetrieveParams): PhysicalCardProfile =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        physicalCardProfileId: String,
        requestOptions: RequestOptions,
    ): PhysicalCardProfile =
        retrieve(physicalCardProfileId, PhysicalCardProfileRetrieveParams.none(), requestOptions)

    /** List Physical Card Profiles */
    fun list(): PhysicalCardProfileListPage = list(PhysicalCardProfileListParams.none())

    /** @see [list] */
    fun list(
        params: PhysicalCardProfileListParams = PhysicalCardProfileListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhysicalCardProfileListPage

    /** @see [list] */
    fun list(
        params: PhysicalCardProfileListParams = PhysicalCardProfileListParams.none()
    ): PhysicalCardProfileListPage = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): PhysicalCardProfileListPage =
        list(PhysicalCardProfileListParams.none(), requestOptions)

    /** Archive a Physical Card Profile */
    fun archive(physicalCardProfileId: String): PhysicalCardProfile =
        archive(physicalCardProfileId, PhysicalCardProfileArchiveParams.none())

    /** @see [archive] */
    fun archive(
        physicalCardProfileId: String,
        params: PhysicalCardProfileArchiveParams = PhysicalCardProfileArchiveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhysicalCardProfile =
        archive(
            params.toBuilder().physicalCardProfileId(physicalCardProfileId).build(),
            requestOptions,
        )

    /** @see [archive] */
    fun archive(
        physicalCardProfileId: String,
        params: PhysicalCardProfileArchiveParams = PhysicalCardProfileArchiveParams.none(),
    ): PhysicalCardProfile = archive(physicalCardProfileId, params, RequestOptions.none())

    /** @see [archive] */
    fun archive(
        params: PhysicalCardProfileArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhysicalCardProfile

    /** @see [archive] */
    fun archive(params: PhysicalCardProfileArchiveParams): PhysicalCardProfile =
        archive(params, RequestOptions.none())

    /** @see [archive] */
    fun archive(
        physicalCardProfileId: String,
        requestOptions: RequestOptions,
    ): PhysicalCardProfile =
        archive(physicalCardProfileId, PhysicalCardProfileArchiveParams.none(), requestOptions)

    /** Clone a Physical Card Profile */
    fun clone(physicalCardProfileId: String): PhysicalCardProfile =
        clone(physicalCardProfileId, PhysicalCardProfileCloneParams.none())

    /** @see [clone] */
    fun clone(
        physicalCardProfileId: String,
        params: PhysicalCardProfileCloneParams = PhysicalCardProfileCloneParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhysicalCardProfile =
        clone(
            params.toBuilder().physicalCardProfileId(physicalCardProfileId).build(),
            requestOptions,
        )

    /** @see [clone] */
    fun clone(
        physicalCardProfileId: String,
        params: PhysicalCardProfileCloneParams = PhysicalCardProfileCloneParams.none(),
    ): PhysicalCardProfile = clone(physicalCardProfileId, params, RequestOptions.none())

    /** @see [clone] */
    fun clone(
        params: PhysicalCardProfileCloneParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhysicalCardProfile

    /** @see [clone] */
    fun clone(params: PhysicalCardProfileCloneParams): PhysicalCardProfile =
        clone(params, RequestOptions.none())

    /** @see [clone] */
    fun clone(physicalCardProfileId: String, requestOptions: RequestOptions): PhysicalCardProfile =
        clone(physicalCardProfileId, PhysicalCardProfileCloneParams.none(), requestOptions)

    /**
     * A view of [PhysicalCardProfileService] that provides access to raw HTTP responses for each
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
        ): PhysicalCardProfileService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /physical_card_profiles`, but is otherwise the same
         * as [PhysicalCardProfileService.create].
         */
        @MustBeClosed
        fun create(params: PhysicalCardProfileCreateParams): HttpResponseFor<PhysicalCardProfile> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: PhysicalCardProfileCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhysicalCardProfile>

        /**
         * Returns a raw HTTP response for `get /physical_card_profiles/{physical_card_profile_id}`,
         * but is otherwise the same as [PhysicalCardProfileService.retrieve].
         */
        @MustBeClosed
        fun retrieve(physicalCardProfileId: String): HttpResponseFor<PhysicalCardProfile> =
            retrieve(physicalCardProfileId, PhysicalCardProfileRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            physicalCardProfileId: String,
            params: PhysicalCardProfileRetrieveParams = PhysicalCardProfileRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhysicalCardProfile> =
            retrieve(
                params.toBuilder().physicalCardProfileId(physicalCardProfileId).build(),
                requestOptions,
            )

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            physicalCardProfileId: String,
            params: PhysicalCardProfileRetrieveParams = PhysicalCardProfileRetrieveParams.none(),
        ): HttpResponseFor<PhysicalCardProfile> =
            retrieve(physicalCardProfileId, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: PhysicalCardProfileRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhysicalCardProfile>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: PhysicalCardProfileRetrieveParams
        ): HttpResponseFor<PhysicalCardProfile> = retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            physicalCardProfileId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PhysicalCardProfile> =
            retrieve(
                physicalCardProfileId,
                PhysicalCardProfileRetrieveParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /physical_card_profiles`, but is otherwise the same
         * as [PhysicalCardProfileService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<PhysicalCardProfileListPage> =
            list(PhysicalCardProfileListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: PhysicalCardProfileListParams = PhysicalCardProfileListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhysicalCardProfileListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: PhysicalCardProfileListParams = PhysicalCardProfileListParams.none()
        ): HttpResponseFor<PhysicalCardProfileListPage> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<PhysicalCardProfileListPage> =
            list(PhysicalCardProfileListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /physical_card_profiles/{physical_card_profile_id}/archive`, but is otherwise the same as
         * [PhysicalCardProfileService.archive].
         */
        @MustBeClosed
        fun archive(physicalCardProfileId: String): HttpResponseFor<PhysicalCardProfile> =
            archive(physicalCardProfileId, PhysicalCardProfileArchiveParams.none())

        /** @see [archive] */
        @MustBeClosed
        fun archive(
            physicalCardProfileId: String,
            params: PhysicalCardProfileArchiveParams = PhysicalCardProfileArchiveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhysicalCardProfile> =
            archive(
                params.toBuilder().physicalCardProfileId(physicalCardProfileId).build(),
                requestOptions,
            )

        /** @see [archive] */
        @MustBeClosed
        fun archive(
            physicalCardProfileId: String,
            params: PhysicalCardProfileArchiveParams = PhysicalCardProfileArchiveParams.none(),
        ): HttpResponseFor<PhysicalCardProfile> =
            archive(physicalCardProfileId, params, RequestOptions.none())

        /** @see [archive] */
        @MustBeClosed
        fun archive(
            params: PhysicalCardProfileArchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhysicalCardProfile>

        /** @see [archive] */
        @MustBeClosed
        fun archive(
            params: PhysicalCardProfileArchiveParams
        ): HttpResponseFor<PhysicalCardProfile> = archive(params, RequestOptions.none())

        /** @see [archive] */
        @MustBeClosed
        fun archive(
            physicalCardProfileId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PhysicalCardProfile> =
            archive(physicalCardProfileId, PhysicalCardProfileArchiveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /physical_card_profiles/{physical_card_profile_id}/clone`, but is otherwise the same as
         * [PhysicalCardProfileService.clone].
         */
        @MustBeClosed
        fun clone(physicalCardProfileId: String): HttpResponseFor<PhysicalCardProfile> =
            clone(physicalCardProfileId, PhysicalCardProfileCloneParams.none())

        /** @see [clone] */
        @MustBeClosed
        fun clone(
            physicalCardProfileId: String,
            params: PhysicalCardProfileCloneParams = PhysicalCardProfileCloneParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhysicalCardProfile> =
            clone(
                params.toBuilder().physicalCardProfileId(physicalCardProfileId).build(),
                requestOptions,
            )

        /** @see [clone] */
        @MustBeClosed
        fun clone(
            physicalCardProfileId: String,
            params: PhysicalCardProfileCloneParams = PhysicalCardProfileCloneParams.none(),
        ): HttpResponseFor<PhysicalCardProfile> =
            clone(physicalCardProfileId, params, RequestOptions.none())

        /** @see [clone] */
        @MustBeClosed
        fun clone(
            params: PhysicalCardProfileCloneParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhysicalCardProfile>

        /** @see [clone] */
        @MustBeClosed
        fun clone(params: PhysicalCardProfileCloneParams): HttpResponseFor<PhysicalCardProfile> =
            clone(params, RequestOptions.none())

        /** @see [clone] */
        @MustBeClosed
        fun clone(
            physicalCardProfileId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PhysicalCardProfile> =
            clone(physicalCardProfileId, PhysicalCardProfileCloneParams.none(), requestOptions)
    }
}
