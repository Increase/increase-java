// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.realtimedecisions.RealTimeDecision
import com.increase.api.models.realtimedecisions.RealTimeDecisionActionParams
import com.increase.api.models.realtimedecisions.RealTimeDecisionRetrieveParams

interface RealTimeDecisionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve a Real-Time Decision */
    fun retrieve(params: RealTimeDecisionRetrieveParams): RealTimeDecision =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: RealTimeDecisionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RealTimeDecision

    /** Action a Real-Time Decision */
    fun action(params: RealTimeDecisionActionParams): RealTimeDecision =
        action(params, RequestOptions.none())

    /** @see [action] */
    fun action(
        params: RealTimeDecisionActionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RealTimeDecision

    /**
     * A view of [RealTimeDecisionService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /real_time_decisions/{real_time_decision_id}`, but
         * is otherwise the same as [RealTimeDecisionService.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: RealTimeDecisionRetrieveParams): HttpResponseFor<RealTimeDecision> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: RealTimeDecisionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RealTimeDecision>

        /**
         * Returns a raw HTTP response for `post
         * /real_time_decisions/{real_time_decision_id}/action`, but is otherwise the same as
         * [RealTimeDecisionService.action].
         */
        @MustBeClosed
        fun action(params: RealTimeDecisionActionParams): HttpResponseFor<RealTimeDecision> =
            action(params, RequestOptions.none())

        /** @see [action] */
        @MustBeClosed
        fun action(
            params: RealTimeDecisionActionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RealTimeDecision>
    }
}
