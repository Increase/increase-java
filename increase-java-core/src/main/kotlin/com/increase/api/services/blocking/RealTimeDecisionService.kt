// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.RealTimeDecision
import com.increase.api.models.RealTimeDecisionActionParams
import com.increase.api.models.RealTimeDecisionRetrieveParams

interface RealTimeDecisionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve a Real-Time Decision */
    @JvmOverloads
    fun retrieve(
        params: RealTimeDecisionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RealTimeDecision

    /** Action a Real-Time Decision */
    @JvmOverloads
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
        @JvmOverloads
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
        @JvmOverloads
        @MustBeClosed
        fun action(
            params: RealTimeDecisionActionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RealTimeDecision>
    }
}
