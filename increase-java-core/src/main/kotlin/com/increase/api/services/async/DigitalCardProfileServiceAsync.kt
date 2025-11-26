// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.digitalcardprofiles.DigitalCardProfile
import com.increase.api.models.digitalcardprofiles.DigitalCardProfileArchiveParams
import com.increase.api.models.digitalcardprofiles.DigitalCardProfileCloneParams
import com.increase.api.models.digitalcardprofiles.DigitalCardProfileCreateParams
import com.increase.api.models.digitalcardprofiles.DigitalCardProfileListPageAsync
import com.increase.api.models.digitalcardprofiles.DigitalCardProfileListParams
import com.increase.api.models.digitalcardprofiles.DigitalCardProfileRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface DigitalCardProfileServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DigitalCardProfileServiceAsync

    /** Create a Digital Card Profile */
    fun create(params: DigitalCardProfileCreateParams): CompletableFuture<DigitalCardProfile> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: DigitalCardProfileCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DigitalCardProfile>

    /** Retrieve a Digital Card Profile */
    fun retrieve(digitalCardProfileId: String): CompletableFuture<DigitalCardProfile> =
        retrieve(digitalCardProfileId, DigitalCardProfileRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        digitalCardProfileId: String,
        params: DigitalCardProfileRetrieveParams = DigitalCardProfileRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DigitalCardProfile> =
        retrieve(
            params.toBuilder().digitalCardProfileId(digitalCardProfileId).build(),
            requestOptions,
        )

    /** @see retrieve */
    fun retrieve(
        digitalCardProfileId: String,
        params: DigitalCardProfileRetrieveParams = DigitalCardProfileRetrieveParams.none(),
    ): CompletableFuture<DigitalCardProfile> =
        retrieve(digitalCardProfileId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: DigitalCardProfileRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DigitalCardProfile>

    /** @see retrieve */
    fun retrieve(params: DigitalCardProfileRetrieveParams): CompletableFuture<DigitalCardProfile> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        digitalCardProfileId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<DigitalCardProfile> =
        retrieve(digitalCardProfileId, DigitalCardProfileRetrieveParams.none(), requestOptions)

    /** List Card Profiles */
    fun list(): CompletableFuture<DigitalCardProfileListPageAsync> =
        list(DigitalCardProfileListParams.none())

    /** @see list */
    fun list(
        params: DigitalCardProfileListParams = DigitalCardProfileListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DigitalCardProfileListPageAsync>

    /** @see list */
    fun list(
        params: DigitalCardProfileListParams = DigitalCardProfileListParams.none()
    ): CompletableFuture<DigitalCardProfileListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<DigitalCardProfileListPageAsync> =
        list(DigitalCardProfileListParams.none(), requestOptions)

    /** Archive a Digital Card Profile */
    fun archive(digitalCardProfileId: String): CompletableFuture<DigitalCardProfile> =
        archive(digitalCardProfileId, DigitalCardProfileArchiveParams.none())

    /** @see archive */
    fun archive(
        digitalCardProfileId: String,
        params: DigitalCardProfileArchiveParams = DigitalCardProfileArchiveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DigitalCardProfile> =
        archive(
            params.toBuilder().digitalCardProfileId(digitalCardProfileId).build(),
            requestOptions,
        )

    /** @see archive */
    fun archive(
        digitalCardProfileId: String,
        params: DigitalCardProfileArchiveParams = DigitalCardProfileArchiveParams.none(),
    ): CompletableFuture<DigitalCardProfile> =
        archive(digitalCardProfileId, params, RequestOptions.none())

    /** @see archive */
    fun archive(
        params: DigitalCardProfileArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DigitalCardProfile>

    /** @see archive */
    fun archive(params: DigitalCardProfileArchiveParams): CompletableFuture<DigitalCardProfile> =
        archive(params, RequestOptions.none())

    /** @see archive */
    fun archive(
        digitalCardProfileId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<DigitalCardProfile> =
        archive(digitalCardProfileId, DigitalCardProfileArchiveParams.none(), requestOptions)

    /** Clones a Digital Card Profile */
    fun clone(digitalCardProfileId: String): CompletableFuture<DigitalCardProfile> =
        clone(digitalCardProfileId, DigitalCardProfileCloneParams.none())

    /** @see clone */
    fun clone(
        digitalCardProfileId: String,
        params: DigitalCardProfileCloneParams = DigitalCardProfileCloneParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DigitalCardProfile> =
        clone(params.toBuilder().digitalCardProfileId(digitalCardProfileId).build(), requestOptions)

    /** @see clone */
    fun clone(
        digitalCardProfileId: String,
        params: DigitalCardProfileCloneParams = DigitalCardProfileCloneParams.none(),
    ): CompletableFuture<DigitalCardProfile> =
        clone(digitalCardProfileId, params, RequestOptions.none())

    /** @see clone */
    fun clone(
        params: DigitalCardProfileCloneParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DigitalCardProfile>

    /** @see clone */
    fun clone(params: DigitalCardProfileCloneParams): CompletableFuture<DigitalCardProfile> =
        clone(params, RequestOptions.none())

    /** @see clone */
    fun clone(
        digitalCardProfileId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<DigitalCardProfile> =
        clone(digitalCardProfileId, DigitalCardProfileCloneParams.none(), requestOptions)

    /**
     * A view of [DigitalCardProfileServiceAsync] that provides access to raw HTTP responses for
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
        ): DigitalCardProfileServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /digital_card_profiles`, but is otherwise the same
         * as [DigitalCardProfileServiceAsync.create].
         */
        fun create(
            params: DigitalCardProfileCreateParams
        ): CompletableFuture<HttpResponseFor<DigitalCardProfile>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: DigitalCardProfileCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DigitalCardProfile>>

        /**
         * Returns a raw HTTP response for `get /digital_card_profiles/{digital_card_profile_id}`,
         * but is otherwise the same as [DigitalCardProfileServiceAsync.retrieve].
         */
        fun retrieve(
            digitalCardProfileId: String
        ): CompletableFuture<HttpResponseFor<DigitalCardProfile>> =
            retrieve(digitalCardProfileId, DigitalCardProfileRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            digitalCardProfileId: String,
            params: DigitalCardProfileRetrieveParams = DigitalCardProfileRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DigitalCardProfile>> =
            retrieve(
                params.toBuilder().digitalCardProfileId(digitalCardProfileId).build(),
                requestOptions,
            )

        /** @see retrieve */
        fun retrieve(
            digitalCardProfileId: String,
            params: DigitalCardProfileRetrieveParams = DigitalCardProfileRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<DigitalCardProfile>> =
            retrieve(digitalCardProfileId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: DigitalCardProfileRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DigitalCardProfile>>

        /** @see retrieve */
        fun retrieve(
            params: DigitalCardProfileRetrieveParams
        ): CompletableFuture<HttpResponseFor<DigitalCardProfile>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            digitalCardProfileId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DigitalCardProfile>> =
            retrieve(digitalCardProfileId, DigitalCardProfileRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /digital_card_profiles`, but is otherwise the same
         * as [DigitalCardProfileServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<DigitalCardProfileListPageAsync>> =
            list(DigitalCardProfileListParams.none())

        /** @see list */
        fun list(
            params: DigitalCardProfileListParams = DigitalCardProfileListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DigitalCardProfileListPageAsync>>

        /** @see list */
        fun list(
            params: DigitalCardProfileListParams = DigitalCardProfileListParams.none()
        ): CompletableFuture<HttpResponseFor<DigitalCardProfileListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<DigitalCardProfileListPageAsync>> =
            list(DigitalCardProfileListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /digital_card_profiles/{digital_card_profile_id}/archive`, but is otherwise the same as
         * [DigitalCardProfileServiceAsync.archive].
         */
        fun archive(
            digitalCardProfileId: String
        ): CompletableFuture<HttpResponseFor<DigitalCardProfile>> =
            archive(digitalCardProfileId, DigitalCardProfileArchiveParams.none())

        /** @see archive */
        fun archive(
            digitalCardProfileId: String,
            params: DigitalCardProfileArchiveParams = DigitalCardProfileArchiveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DigitalCardProfile>> =
            archive(
                params.toBuilder().digitalCardProfileId(digitalCardProfileId).build(),
                requestOptions,
            )

        /** @see archive */
        fun archive(
            digitalCardProfileId: String,
            params: DigitalCardProfileArchiveParams = DigitalCardProfileArchiveParams.none(),
        ): CompletableFuture<HttpResponseFor<DigitalCardProfile>> =
            archive(digitalCardProfileId, params, RequestOptions.none())

        /** @see archive */
        fun archive(
            params: DigitalCardProfileArchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DigitalCardProfile>>

        /** @see archive */
        fun archive(
            params: DigitalCardProfileArchiveParams
        ): CompletableFuture<HttpResponseFor<DigitalCardProfile>> =
            archive(params, RequestOptions.none())

        /** @see archive */
        fun archive(
            digitalCardProfileId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DigitalCardProfile>> =
            archive(digitalCardProfileId, DigitalCardProfileArchiveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /digital_card_profiles/{digital_card_profile_id}/clone`, but is otherwise the same as
         * [DigitalCardProfileServiceAsync.clone].
         */
        fun clone(
            digitalCardProfileId: String
        ): CompletableFuture<HttpResponseFor<DigitalCardProfile>> =
            clone(digitalCardProfileId, DigitalCardProfileCloneParams.none())

        /** @see clone */
        fun clone(
            digitalCardProfileId: String,
            params: DigitalCardProfileCloneParams = DigitalCardProfileCloneParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DigitalCardProfile>> =
            clone(
                params.toBuilder().digitalCardProfileId(digitalCardProfileId).build(),
                requestOptions,
            )

        /** @see clone */
        fun clone(
            digitalCardProfileId: String,
            params: DigitalCardProfileCloneParams = DigitalCardProfileCloneParams.none(),
        ): CompletableFuture<HttpResponseFor<DigitalCardProfile>> =
            clone(digitalCardProfileId, params, RequestOptions.none())

        /** @see clone */
        fun clone(
            params: DigitalCardProfileCloneParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DigitalCardProfile>>

        /** @see clone */
        fun clone(
            params: DigitalCardProfileCloneParams
        ): CompletableFuture<HttpResponseFor<DigitalCardProfile>> =
            clone(params, RequestOptions.none())

        /** @see clone */
        fun clone(
            digitalCardProfileId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DigitalCardProfile>> =
            clone(digitalCardProfileId, DigitalCardProfileCloneParams.none(), requestOptions)
    }
}
