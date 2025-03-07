// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.PhysicalCardProfile
import com.increase.api.models.PhysicalCardProfileArchiveParams
import com.increase.api.models.PhysicalCardProfileCloneParams
import com.increase.api.models.PhysicalCardProfileCreateParams
import com.increase.api.models.PhysicalCardProfileListPageAsync
import com.increase.api.models.PhysicalCardProfileListParams
import com.increase.api.models.PhysicalCardProfileRetrieveParams
import java.util.concurrent.CompletableFuture

interface PhysicalCardProfileServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a Physical Card Profile */
    fun create(params: PhysicalCardProfileCreateParams): CompletableFuture<PhysicalCardProfile> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: PhysicalCardProfileCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhysicalCardProfile>

    /** Retrieve a Card Profile */
    fun retrieve(
        params: PhysicalCardProfileRetrieveParams
    ): CompletableFuture<PhysicalCardProfile> = retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: PhysicalCardProfileRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhysicalCardProfile>

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
    fun archive(params: PhysicalCardProfileArchiveParams): CompletableFuture<PhysicalCardProfile> =
        archive(params, RequestOptions.none())

    /** @see [archive] */
    fun archive(
        params: PhysicalCardProfileArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhysicalCardProfile>

    /** Clone a Physical Card Profile */
    fun clone(params: PhysicalCardProfileCloneParams): CompletableFuture<PhysicalCardProfile> =
        clone(params, RequestOptions.none())

    /** @see [clone] */
    fun clone(
        params: PhysicalCardProfileCloneParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhysicalCardProfile>

    /**
     * A view of [PhysicalCardProfileServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /physical_card_profiles`, but is otherwise the same
         * as [PhysicalCardProfileServiceAsync.create].
         */
        @MustBeClosed
        fun create(
            params: PhysicalCardProfileCreateParams
        ): CompletableFuture<HttpResponseFor<PhysicalCardProfile>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: PhysicalCardProfileCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhysicalCardProfile>>

        /**
         * Returns a raw HTTP response for `get /physical_card_profiles/{physical_card_profile_id}`,
         * but is otherwise the same as [PhysicalCardProfileServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: PhysicalCardProfileRetrieveParams
        ): CompletableFuture<HttpResponseFor<PhysicalCardProfile>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: PhysicalCardProfileRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhysicalCardProfile>>

        /**
         * Returns a raw HTTP response for `get /physical_card_profiles`, but is otherwise the same
         * as [PhysicalCardProfileServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<PhysicalCardProfileListPageAsync>> =
            list(PhysicalCardProfileListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: PhysicalCardProfileListParams = PhysicalCardProfileListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhysicalCardProfileListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: PhysicalCardProfileListParams = PhysicalCardProfileListParams.none()
        ): CompletableFuture<HttpResponseFor<PhysicalCardProfileListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<PhysicalCardProfileListPageAsync>> =
            list(PhysicalCardProfileListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /physical_card_profiles/{physical_card_profile_id}/archive`, but is otherwise the same as
         * [PhysicalCardProfileServiceAsync.archive].
         */
        @MustBeClosed
        fun archive(
            params: PhysicalCardProfileArchiveParams
        ): CompletableFuture<HttpResponseFor<PhysicalCardProfile>> =
            archive(params, RequestOptions.none())

        /** @see [archive] */
        @MustBeClosed
        fun archive(
            params: PhysicalCardProfileArchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhysicalCardProfile>>

        /**
         * Returns a raw HTTP response for `post
         * /physical_card_profiles/{physical_card_profile_id}/clone`, but is otherwise the same as
         * [PhysicalCardProfileServiceAsync.clone].
         */
        @MustBeClosed
        fun clone(
            params: PhysicalCardProfileCloneParams
        ): CompletableFuture<HttpResponseFor<PhysicalCardProfile>> =
            clone(params, RequestOptions.none())

        /** @see [clone] */
        @MustBeClosed
        fun clone(
            params: PhysicalCardProfileCloneParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhysicalCardProfile>>
    }
}
