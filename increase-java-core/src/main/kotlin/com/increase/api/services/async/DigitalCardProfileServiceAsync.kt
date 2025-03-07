// File generated from our OpenAPI spec by Stainless.

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
    fun create(params: DigitalCardProfileCreateParams): CompletableFuture<DigitalCardProfile> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: DigitalCardProfileCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DigitalCardProfile>

    /** Retrieve a Digital Card Profile */
    fun retrieve(params: DigitalCardProfileRetrieveParams): CompletableFuture<DigitalCardProfile> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: DigitalCardProfileRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DigitalCardProfile>

    /** List Card Profiles */
    fun list(): CompletableFuture<DigitalCardProfileListPageAsync> =
        list(DigitalCardProfileListParams.none())

    /** @see [list] */
    fun list(
        params: DigitalCardProfileListParams = DigitalCardProfileListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DigitalCardProfileListPageAsync>

    /** @see [list] */
    fun list(
        params: DigitalCardProfileListParams = DigitalCardProfileListParams.none()
    ): CompletableFuture<DigitalCardProfileListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<DigitalCardProfileListPageAsync> =
        list(DigitalCardProfileListParams.none(), requestOptions)

    /** Archive a Digital Card Profile */
    fun archive(params: DigitalCardProfileArchiveParams): CompletableFuture<DigitalCardProfile> =
        archive(params, RequestOptions.none())

    /** @see [archive] */
    fun archive(
        params: DigitalCardProfileArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DigitalCardProfile>

    /** Clones a Digital Card Profile */
    fun clone(params: DigitalCardProfileCloneParams): CompletableFuture<DigitalCardProfile> =
        clone(params, RequestOptions.none())

    /** @see [clone] */
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
        @MustBeClosed
        fun create(
            params: DigitalCardProfileCreateParams
        ): CompletableFuture<HttpResponseFor<DigitalCardProfile>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: DigitalCardProfileCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DigitalCardProfile>>

        /**
         * Returns a raw HTTP response for `get /digital_card_profiles/{digital_card_profile_id}`,
         * but is otherwise the same as [DigitalCardProfileServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: DigitalCardProfileRetrieveParams
        ): CompletableFuture<HttpResponseFor<DigitalCardProfile>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: DigitalCardProfileRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DigitalCardProfile>>

        /**
         * Returns a raw HTTP response for `get /digital_card_profiles`, but is otherwise the same
         * as [DigitalCardProfileServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<DigitalCardProfileListPageAsync>> =
            list(DigitalCardProfileListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: DigitalCardProfileListParams = DigitalCardProfileListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DigitalCardProfileListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: DigitalCardProfileListParams = DigitalCardProfileListParams.none()
        ): CompletableFuture<HttpResponseFor<DigitalCardProfileListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
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
        @MustBeClosed
        fun archive(
            params: DigitalCardProfileArchiveParams
        ): CompletableFuture<HttpResponseFor<DigitalCardProfile>> =
            archive(params, RequestOptions.none())

        /** @see [archive] */
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
        @MustBeClosed
        fun clone(
            params: DigitalCardProfileCloneParams
        ): CompletableFuture<HttpResponseFor<DigitalCardProfile>> =
            clone(params, RequestOptions.none())

        /** @see [clone] */
        @MustBeClosed
        fun clone(
            params: DigitalCardProfileCloneParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DigitalCardProfile>>
    }
}
