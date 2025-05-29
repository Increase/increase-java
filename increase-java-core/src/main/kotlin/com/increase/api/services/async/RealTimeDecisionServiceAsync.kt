// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.realtimedecisions.RealTimeDecision
import com.increase.api.models.realtimedecisions.RealTimeDecisionActionParams
import com.increase.api.models.realtimedecisions.RealTimeDecisionRetrieveParams
import java.util.concurrent.CompletableFuture

interface RealTimeDecisionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve a Real-Time Decision */
    fun retrieve(realTimeDecisionId: String): CompletableFuture<RealTimeDecision> =
        retrieve(realTimeDecisionId, RealTimeDecisionRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        realTimeDecisionId: String,
        params: RealTimeDecisionRetrieveParams = RealTimeDecisionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RealTimeDecision> =
        retrieve(params.toBuilder().realTimeDecisionId(realTimeDecisionId).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        realTimeDecisionId: String,
        params: RealTimeDecisionRetrieveParams = RealTimeDecisionRetrieveParams.none(),
    ): CompletableFuture<RealTimeDecision> =
        retrieve(realTimeDecisionId, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: RealTimeDecisionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RealTimeDecision>

    /** @see [retrieve] */
    fun retrieve(params: RealTimeDecisionRetrieveParams): CompletableFuture<RealTimeDecision> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        realTimeDecisionId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<RealTimeDecision> =
        retrieve(realTimeDecisionId, RealTimeDecisionRetrieveParams.none(), requestOptions)

    /** Action a Real-Time Decision */
    fun action(realTimeDecisionId: String): CompletableFuture<RealTimeDecision> =
        action(realTimeDecisionId, RealTimeDecisionActionParams.none())

    /** @see [action] */
    fun action(
        realTimeDecisionId: String,
        params: RealTimeDecisionActionParams = RealTimeDecisionActionParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RealTimeDecision> =
        action(params.toBuilder().realTimeDecisionId(realTimeDecisionId).build(), requestOptions)

    /** @see [action] */
    fun action(
        realTimeDecisionId: String,
        params: RealTimeDecisionActionParams = RealTimeDecisionActionParams.none(),
    ): CompletableFuture<RealTimeDecision> =
        action(realTimeDecisionId, params, RequestOptions.none())

    /** @see [action] */
    fun action(
        params: RealTimeDecisionActionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RealTimeDecision>

    /** @see [action] */
    fun action(params: RealTimeDecisionActionParams): CompletableFuture<RealTimeDecision> =
        action(params, RequestOptions.none())

    /** @see [action] */
    fun action(
        realTimeDecisionId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<RealTimeDecision> =
        action(realTimeDecisionId, RealTimeDecisionActionParams.none(), requestOptions)

    /**
     * A view of [RealTimeDecisionServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /real_time_decisions/{real_time_decision_id}`, but
         * is otherwise the same as [RealTimeDecisionServiceAsync.retrieve].
         */
        fun retrieve(
            realTimeDecisionId: String
        ): CompletableFuture<HttpResponseFor<RealTimeDecision>> =
            retrieve(realTimeDecisionId, RealTimeDecisionRetrieveParams.none())

        /** @see [retrieve] */
        fun retrieve(
            realTimeDecisionId: String,
            params: RealTimeDecisionRetrieveParams = RealTimeDecisionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RealTimeDecision>> =
            retrieve(
                params.toBuilder().realTimeDecisionId(realTimeDecisionId).build(),
                requestOptions,
            )

        /** @see [retrieve] */
        fun retrieve(
            realTimeDecisionId: String,
            params: RealTimeDecisionRetrieveParams = RealTimeDecisionRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<RealTimeDecision>> =
            retrieve(realTimeDecisionId, params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            params: RealTimeDecisionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RealTimeDecision>>

        /** @see [retrieve] */
        fun retrieve(
            params: RealTimeDecisionRetrieveParams
        ): CompletableFuture<HttpResponseFor<RealTimeDecision>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            realTimeDecisionId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RealTimeDecision>> =
            retrieve(realTimeDecisionId, RealTimeDecisionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /real_time_decisions/{real_time_decision_id}/action`, but is otherwise the same as
         * [RealTimeDecisionServiceAsync.action].
         */
        fun action(
            realTimeDecisionId: String
        ): CompletableFuture<HttpResponseFor<RealTimeDecision>> =
            action(realTimeDecisionId, RealTimeDecisionActionParams.none())

        /** @see [action] */
        fun action(
            realTimeDecisionId: String,
            params: RealTimeDecisionActionParams = RealTimeDecisionActionParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RealTimeDecision>> =
            action(
                params.toBuilder().realTimeDecisionId(realTimeDecisionId).build(),
                requestOptions,
            )

        /** @see [action] */
        fun action(
            realTimeDecisionId: String,
            params: RealTimeDecisionActionParams = RealTimeDecisionActionParams.none(),
        ): CompletableFuture<HttpResponseFor<RealTimeDecision>> =
            action(realTimeDecisionId, params, RequestOptions.none())

        /** @see [action] */
        fun action(
            params: RealTimeDecisionActionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RealTimeDecision>>

        /** @see [action] */
        fun action(
            params: RealTimeDecisionActionParams
        ): CompletableFuture<HttpResponseFor<RealTimeDecision>> =
            action(params, RequestOptions.none())

        /** @see [action] */
        fun action(
            realTimeDecisionId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RealTimeDecision>> =
            action(realTimeDecisionId, RealTimeDecisionActionParams.none(), requestOptions)
    }
}
