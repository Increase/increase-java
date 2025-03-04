// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

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
    @JvmOverloads
    fun create(
        params: PhysicalCardProfileCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhysicalCardProfile>

    /** Retrieve a Card Profile */
    @JvmOverloads
    fun retrieve(
        params: PhysicalCardProfileRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhysicalCardProfile>

    /** List Physical Card Profiles */
    @JvmOverloads
    fun list(
        params: PhysicalCardProfileListParams = PhysicalCardProfileListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhysicalCardProfileListPageAsync>

    /** List Physical Card Profiles */
    fun list(requestOptions: RequestOptions): CompletableFuture<PhysicalCardProfileListPageAsync> =
        list(PhysicalCardProfileListParams.none(), requestOptions)

    /** Archive a Physical Card Profile */
    @JvmOverloads
    fun archive(
        params: PhysicalCardProfileArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhysicalCardProfile>

    /** Clone a Physical Card Profile */
    @JvmOverloads
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
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: PhysicalCardProfileCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhysicalCardProfile>>

        /**
         * Returns a raw HTTP response for `get /physical_card_profiles/{physical_card_profile_id}`,
         * but is otherwise the same as [PhysicalCardProfileServiceAsync.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: PhysicalCardProfileRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhysicalCardProfile>>

        /**
         * Returns a raw HTTP response for `get /physical_card_profiles`, but is otherwise the same
         * as [PhysicalCardProfileServiceAsync.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: PhysicalCardProfileListParams = PhysicalCardProfileListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhysicalCardProfileListPageAsync>>

        /**
         * Returns a raw HTTP response for `get /physical_card_profiles`, but is otherwise the same
         * as [PhysicalCardProfileServiceAsync.list].
         */
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
        @JvmOverloads
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
        @JvmOverloads
        @MustBeClosed
        fun clone(
            params: PhysicalCardProfileCloneParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhysicalCardProfile>>
    }
}
