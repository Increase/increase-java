// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.DigitalCardProfile
import com.increase.api.models.DigitalCardProfileArchiveParams
import com.increase.api.models.DigitalCardProfileCloneParams
import com.increase.api.models.DigitalCardProfileCreateParams
import com.increase.api.models.DigitalCardProfileListPageAsync
import com.increase.api.models.DigitalCardProfileListParams
import com.increase.api.models.DigitalCardProfileRetrieveParams
import java.util.concurrent.CompletableFuture

interface DigitalCardProfileServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a Digital Card Profile */
    @JvmOverloads
    fun create(
        params: DigitalCardProfileCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DigitalCardProfile>

    /** Retrieve a Digital Card Profile */
    @JvmOverloads
    fun retrieve(
        params: DigitalCardProfileRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DigitalCardProfile>

    /** List Card Profiles */
    @JvmOverloads
    fun list(
        params: DigitalCardProfileListParams = DigitalCardProfileListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DigitalCardProfileListPageAsync>

    /** List Card Profiles */
    fun list(requestOptions: RequestOptions): CompletableFuture<DigitalCardProfileListPageAsync> =
        list(DigitalCardProfileListParams.none(), requestOptions)

    /** Archive a Digital Card Profile */
    @JvmOverloads
    fun archive(
        params: DigitalCardProfileArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DigitalCardProfile>

    /** Clones a Digital Card Profile */
    @JvmOverloads
    fun clone(
        params: DigitalCardProfileCloneParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DigitalCardProfile>

    /**
     * A view of [DigitalCardProfileServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /digital_card_profiles`, but is otherwise the same
         * as [DigitalCardProfileServiceAsync.create].
         */
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: DigitalCardProfileCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DigitalCardProfile>>

        /**
         * Returns a raw HTTP response for `get /digital_card_profiles/{digital_card_profile_id}`,
         * but is otherwise the same as [DigitalCardProfileServiceAsync.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: DigitalCardProfileRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DigitalCardProfile>>

        /**
         * Returns a raw HTTP response for `get /digital_card_profiles`, but is otherwise the same
         * as [DigitalCardProfileServiceAsync.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: DigitalCardProfileListParams = DigitalCardProfileListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DigitalCardProfileListPageAsync>>

        /**
         * Returns a raw HTTP response for `get /digital_card_profiles`, but is otherwise the same
         * as [DigitalCardProfileServiceAsync.list].
         */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<DigitalCardProfileListPageAsync>> =
            list(DigitalCardProfileListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /digital_card_profiles/{digital_card_profile_id}/archive`, but is otherwise the same as
         * [DigitalCardProfileServiceAsync.archive].
         */
        @JvmOverloads
        @MustBeClosed
        fun archive(
            params: DigitalCardProfileArchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DigitalCardProfile>>

        /**
         * Returns a raw HTTP response for `post
         * /digital_card_profiles/{digital_card_profile_id}/clone`, but is otherwise the same as
         * [DigitalCardProfileServiceAsync.clone].
         */
        @JvmOverloads
        @MustBeClosed
        fun clone(
            params: DigitalCardProfileCloneParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DigitalCardProfile>>
    }
}
