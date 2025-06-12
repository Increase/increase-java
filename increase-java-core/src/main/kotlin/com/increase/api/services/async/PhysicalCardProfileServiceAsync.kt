// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.physicalcardprofiles.PhysicalCardProfile
import com.increase.api.models.physicalcardprofiles.PhysicalCardProfileArchiveParams
import com.increase.api.models.physicalcardprofiles.PhysicalCardProfileCloneParams
import com.increase.api.models.physicalcardprofiles.PhysicalCardProfileCreateParams
import com.increase.api.models.physicalcardprofiles.PhysicalCardProfileListPageAsync
import com.increase.api.models.physicalcardprofiles.PhysicalCardProfileListParams
import com.increase.api.models.physicalcardprofiles.PhysicalCardProfileRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface PhysicalCardProfileServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PhysicalCardProfileServiceAsync

    /** Create a Physical Card Profile */
    fun create(params: PhysicalCardProfileCreateParams): CompletableFuture<PhysicalCardProfile> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: PhysicalCardProfileCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhysicalCardProfile>

    /** Retrieve a Card Profile */
    fun retrieve(physicalCardProfileId: String): CompletableFuture<PhysicalCardProfile> =
        retrieve(physicalCardProfileId, PhysicalCardProfileRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        physicalCardProfileId: String,
        params: PhysicalCardProfileRetrieveParams = PhysicalCardProfileRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhysicalCardProfile> =
        retrieve(
            params.toBuilder().physicalCardProfileId(physicalCardProfileId).build(),
            requestOptions,
        )

    /** @see [retrieve] */
    fun retrieve(
        physicalCardProfileId: String,
        params: PhysicalCardProfileRetrieveParams = PhysicalCardProfileRetrieveParams.none(),
    ): CompletableFuture<PhysicalCardProfile> =
        retrieve(physicalCardProfileId, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: PhysicalCardProfileRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhysicalCardProfile>

    /** @see [retrieve] */
    fun retrieve(
        params: PhysicalCardProfileRetrieveParams
    ): CompletableFuture<PhysicalCardProfile> = retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        physicalCardProfileId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<PhysicalCardProfile> =
        retrieve(physicalCardProfileId, PhysicalCardProfileRetrieveParams.none(), requestOptions)

    /** List Physical Card Profiles */
    fun list(): CompletableFuture<PhysicalCardProfileListPageAsync> =
        list(PhysicalCardProfileListParams.none())

    /** @see [list] */
    fun list(
        params: PhysicalCardProfileListParams = PhysicalCardProfileListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhysicalCardProfileListPageAsync>

    /** @see [list] */
    fun list(
        params: PhysicalCardProfileListParams = PhysicalCardProfileListParams.none()
    ): CompletableFuture<PhysicalCardProfileListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<PhysicalCardProfileListPageAsync> =
        list(PhysicalCardProfileListParams.none(), requestOptions)

    /** Archive a Physical Card Profile */
    fun archive(physicalCardProfileId: String): CompletableFuture<PhysicalCardProfile> =
        archive(physicalCardProfileId, PhysicalCardProfileArchiveParams.none())

    /** @see [archive] */
    fun archive(
        physicalCardProfileId: String,
        params: PhysicalCardProfileArchiveParams = PhysicalCardProfileArchiveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhysicalCardProfile> =
        archive(
            params.toBuilder().physicalCardProfileId(physicalCardProfileId).build(),
            requestOptions,
        )

    /** @see [archive] */
    fun archive(
        physicalCardProfileId: String,
        params: PhysicalCardProfileArchiveParams = PhysicalCardProfileArchiveParams.none(),
    ): CompletableFuture<PhysicalCardProfile> =
        archive(physicalCardProfileId, params, RequestOptions.none())

    /** @see [archive] */
    fun archive(
        params: PhysicalCardProfileArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhysicalCardProfile>

    /** @see [archive] */
    fun archive(params: PhysicalCardProfileArchiveParams): CompletableFuture<PhysicalCardProfile> =
        archive(params, RequestOptions.none())

    /** @see [archive] */
    fun archive(
        physicalCardProfileId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<PhysicalCardProfile> =
        archive(physicalCardProfileId, PhysicalCardProfileArchiveParams.none(), requestOptions)

    /** Clone a Physical Card Profile */
    fun clone(physicalCardProfileId: String): CompletableFuture<PhysicalCardProfile> =
        clone(physicalCardProfileId, PhysicalCardProfileCloneParams.none())

    /** @see [clone] */
    fun clone(
        physicalCardProfileId: String,
        params: PhysicalCardProfileCloneParams = PhysicalCardProfileCloneParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhysicalCardProfile> =
        clone(
            params.toBuilder().physicalCardProfileId(physicalCardProfileId).build(),
            requestOptions,
        )

    /** @see [clone] */
    fun clone(
        physicalCardProfileId: String,
        params: PhysicalCardProfileCloneParams = PhysicalCardProfileCloneParams.none(),
    ): CompletableFuture<PhysicalCardProfile> =
        clone(physicalCardProfileId, params, RequestOptions.none())

    /** @see [clone] */
    fun clone(
        params: PhysicalCardProfileCloneParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhysicalCardProfile>

    /** @see [clone] */
    fun clone(params: PhysicalCardProfileCloneParams): CompletableFuture<PhysicalCardProfile> =
        clone(params, RequestOptions.none())

    /** @see [clone] */
    fun clone(
        physicalCardProfileId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<PhysicalCardProfile> =
        clone(physicalCardProfileId, PhysicalCardProfileCloneParams.none(), requestOptions)

    /**
     * A view of [PhysicalCardProfileServiceAsync] that provides access to raw HTTP responses for
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
        ): PhysicalCardProfileServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /physical_card_profiles`, but is otherwise the same
         * as [PhysicalCardProfileServiceAsync.create].
         */
        fun create(
            params: PhysicalCardProfileCreateParams
        ): CompletableFuture<HttpResponseFor<PhysicalCardProfile>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        fun create(
            params: PhysicalCardProfileCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhysicalCardProfile>>

        /**
         * Returns a raw HTTP response for `get /physical_card_profiles/{physical_card_profile_id}`,
         * but is otherwise the same as [PhysicalCardProfileServiceAsync.retrieve].
         */
        fun retrieve(
            physicalCardProfileId: String
        ): CompletableFuture<HttpResponseFor<PhysicalCardProfile>> =
            retrieve(physicalCardProfileId, PhysicalCardProfileRetrieveParams.none())

        /** @see [retrieve] */
        fun retrieve(
            physicalCardProfileId: String,
            params: PhysicalCardProfileRetrieveParams = PhysicalCardProfileRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhysicalCardProfile>> =
            retrieve(
                params.toBuilder().physicalCardProfileId(physicalCardProfileId).build(),
                requestOptions,
            )

        /** @see [retrieve] */
        fun retrieve(
            physicalCardProfileId: String,
            params: PhysicalCardProfileRetrieveParams = PhysicalCardProfileRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<PhysicalCardProfile>> =
            retrieve(physicalCardProfileId, params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            params: PhysicalCardProfileRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhysicalCardProfile>>

        /** @see [retrieve] */
        fun retrieve(
            params: PhysicalCardProfileRetrieveParams
        ): CompletableFuture<HttpResponseFor<PhysicalCardProfile>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            physicalCardProfileId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PhysicalCardProfile>> =
            retrieve(
                physicalCardProfileId,
                PhysicalCardProfileRetrieveParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /physical_card_profiles`, but is otherwise the same
         * as [PhysicalCardProfileServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<PhysicalCardProfileListPageAsync>> =
            list(PhysicalCardProfileListParams.none())

        /** @see [list] */
        fun list(
            params: PhysicalCardProfileListParams = PhysicalCardProfileListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhysicalCardProfileListPageAsync>>

        /** @see [list] */
        fun list(
            params: PhysicalCardProfileListParams = PhysicalCardProfileListParams.none()
        ): CompletableFuture<HttpResponseFor<PhysicalCardProfileListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<PhysicalCardProfileListPageAsync>> =
            list(PhysicalCardProfileListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /physical_card_profiles/{physical_card_profile_id}/archive`, but is otherwise the same as
         * [PhysicalCardProfileServiceAsync.archive].
         */
        fun archive(
            physicalCardProfileId: String
        ): CompletableFuture<HttpResponseFor<PhysicalCardProfile>> =
            archive(physicalCardProfileId, PhysicalCardProfileArchiveParams.none())

        /** @see [archive] */
        fun archive(
            physicalCardProfileId: String,
            params: PhysicalCardProfileArchiveParams = PhysicalCardProfileArchiveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhysicalCardProfile>> =
            archive(
                params.toBuilder().physicalCardProfileId(physicalCardProfileId).build(),
                requestOptions,
            )

        /** @see [archive] */
        fun archive(
            physicalCardProfileId: String,
            params: PhysicalCardProfileArchiveParams = PhysicalCardProfileArchiveParams.none(),
        ): CompletableFuture<HttpResponseFor<PhysicalCardProfile>> =
            archive(physicalCardProfileId, params, RequestOptions.none())

        /** @see [archive] */
        fun archive(
            params: PhysicalCardProfileArchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhysicalCardProfile>>

        /** @see [archive] */
        fun archive(
            params: PhysicalCardProfileArchiveParams
        ): CompletableFuture<HttpResponseFor<PhysicalCardProfile>> =
            archive(params, RequestOptions.none())

        /** @see [archive] */
        fun archive(
            physicalCardProfileId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PhysicalCardProfile>> =
            archive(physicalCardProfileId, PhysicalCardProfileArchiveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /physical_card_profiles/{physical_card_profile_id}/clone`, but is otherwise the same as
         * [PhysicalCardProfileServiceAsync.clone].
         */
        fun clone(
            physicalCardProfileId: String
        ): CompletableFuture<HttpResponseFor<PhysicalCardProfile>> =
            clone(physicalCardProfileId, PhysicalCardProfileCloneParams.none())

        /** @see [clone] */
        fun clone(
            physicalCardProfileId: String,
            params: PhysicalCardProfileCloneParams = PhysicalCardProfileCloneParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhysicalCardProfile>> =
            clone(
                params.toBuilder().physicalCardProfileId(physicalCardProfileId).build(),
                requestOptions,
            )

        /** @see [clone] */
        fun clone(
            physicalCardProfileId: String,
            params: PhysicalCardProfileCloneParams = PhysicalCardProfileCloneParams.none(),
        ): CompletableFuture<HttpResponseFor<PhysicalCardProfile>> =
            clone(physicalCardProfileId, params, RequestOptions.none())

        /** @see [clone] */
        fun clone(
            params: PhysicalCardProfileCloneParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhysicalCardProfile>>

        /** @see [clone] */
        fun clone(
            params: PhysicalCardProfileCloneParams
        ): CompletableFuture<HttpResponseFor<PhysicalCardProfile>> =
            clone(params, RequestOptions.none())

        /** @see [clone] */
        fun clone(
            physicalCardProfileId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PhysicalCardProfile>> =
            clone(physicalCardProfileId, PhysicalCardProfileCloneParams.none(), requestOptions)
    }
}
