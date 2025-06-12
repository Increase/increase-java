// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.realtimedecisions.RealTimeDecision
import com.increase.api.models.realtimedecisions.RealTimeDecisionActionParams
import com.increase.api.models.realtimedecisions.RealTimeDecisionRetrieveParams
import java.util.function.Consumer

interface RealTimeDecisionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RealTimeDecisionService

    /** Retrieve a Real-Time Decision */
    fun retrieve(realTimeDecisionId: String): RealTimeDecision =
        retrieve(realTimeDecisionId, RealTimeDecisionRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        realTimeDecisionId: String,
        params: RealTimeDecisionRetrieveParams = RealTimeDecisionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RealTimeDecision =
        retrieve(params.toBuilder().realTimeDecisionId(realTimeDecisionId).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        realTimeDecisionId: String,
        params: RealTimeDecisionRetrieveParams = RealTimeDecisionRetrieveParams.none(),
    ): RealTimeDecision = retrieve(realTimeDecisionId, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: RealTimeDecisionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RealTimeDecision

    /** @see [retrieve] */
    fun retrieve(params: RealTimeDecisionRetrieveParams): RealTimeDecision =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(realTimeDecisionId: String, requestOptions: RequestOptions): RealTimeDecision =
        retrieve(realTimeDecisionId, RealTimeDecisionRetrieveParams.none(), requestOptions)

    /** Action a Real-Time Decision */
    fun action(realTimeDecisionId: String): RealTimeDecision =
        action(realTimeDecisionId, RealTimeDecisionActionParams.none())

    /** @see [action] */
    fun action(
        realTimeDecisionId: String,
        params: RealTimeDecisionActionParams = RealTimeDecisionActionParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RealTimeDecision =
        action(params.toBuilder().realTimeDecisionId(realTimeDecisionId).build(), requestOptions)

    /** @see [action] */
    fun action(
        realTimeDecisionId: String,
        params: RealTimeDecisionActionParams = RealTimeDecisionActionParams.none(),
    ): RealTimeDecision = action(realTimeDecisionId, params, RequestOptions.none())

    /** @see [action] */
    fun action(
        params: RealTimeDecisionActionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RealTimeDecision

    /** @see [action] */
    fun action(params: RealTimeDecisionActionParams): RealTimeDecision =
        action(params, RequestOptions.none())

    /** @see [action] */
    fun action(realTimeDecisionId: String, requestOptions: RequestOptions): RealTimeDecision =
        action(realTimeDecisionId, RealTimeDecisionActionParams.none(), requestOptions)

    /**
     * A view of [RealTimeDecisionService] that provides access to raw HTTP responses for each
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
        ): RealTimeDecisionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /real_time_decisions/{real_time_decision_id}`, but
         * is otherwise the same as [RealTimeDecisionService.retrieve].
         */
        @MustBeClosed
        fun retrieve(realTimeDecisionId: String): HttpResponseFor<RealTimeDecision> =
            retrieve(realTimeDecisionId, RealTimeDecisionRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            realTimeDecisionId: String,
            params: RealTimeDecisionRetrieveParams = RealTimeDecisionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RealTimeDecision> =
            retrieve(
                params.toBuilder().realTimeDecisionId(realTimeDecisionId).build(),
                requestOptions,
            )

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            realTimeDecisionId: String,
            params: RealTimeDecisionRetrieveParams = RealTimeDecisionRetrieveParams.none(),
        ): HttpResponseFor<RealTimeDecision> =
            retrieve(realTimeDecisionId, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: RealTimeDecisionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RealTimeDecision>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(params: RealTimeDecisionRetrieveParams): HttpResponseFor<RealTimeDecision> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            realTimeDecisionId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RealTimeDecision> =
            retrieve(realTimeDecisionId, RealTimeDecisionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /real_time_decisions/{real_time_decision_id}/action`, but is otherwise the same as
         * [RealTimeDecisionService.action].
         */
        @MustBeClosed
        fun action(realTimeDecisionId: String): HttpResponseFor<RealTimeDecision> =
            action(realTimeDecisionId, RealTimeDecisionActionParams.none())

        /** @see [action] */
        @MustBeClosed
        fun action(
            realTimeDecisionId: String,
            params: RealTimeDecisionActionParams = RealTimeDecisionActionParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RealTimeDecision> =
            action(
                params.toBuilder().realTimeDecisionId(realTimeDecisionId).build(),
                requestOptions,
            )

        /** @see [action] */
        @MustBeClosed
        fun action(
            realTimeDecisionId: String,
            params: RealTimeDecisionActionParams = RealTimeDecisionActionParams.none(),
        ): HttpResponseFor<RealTimeDecision> =
            action(realTimeDecisionId, params, RequestOptions.none())

        /** @see [action] */
        @MustBeClosed
        fun action(
            params: RealTimeDecisionActionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RealTimeDecision>

        /** @see [action] */
        @MustBeClosed
        fun action(params: RealTimeDecisionActionParams): HttpResponseFor<RealTimeDecision> =
            action(params, RequestOptions.none())

        /** @see [action] */
        @MustBeClosed
        fun action(
            realTimeDecisionId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RealTimeDecision> =
            action(realTimeDecisionId, RealTimeDecisionActionParams.none(), requestOptions)
    }
}
