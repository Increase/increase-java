// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.RealTimeDecision
import com.increase.api.models.RealTimeDecisionActionParams
import com.increase.api.models.RealTimeDecisionRetrieveParams
import java.util.concurrent.CompletableFuture

interface RealTimeDecisionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve a Real-Time Decision */
    @JvmOverloads
    fun retrieve(
        params: RealTimeDecisionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RealTimeDecision>

    /** Action a Real-Time Decision */
    @JvmOverloads
    fun action(
        params: RealTimeDecisionActionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RealTimeDecision>

    /**
     * A view of [RealTimeDecisionServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /real_time_decisions/{real_time_decision_id}`, but
         * is otherwise the same as [RealTimeDecisionServiceAsync.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: RealTimeDecisionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RealTimeDecision>>

        /**
         * Returns a raw HTTP response for `post
         * /real_time_decisions/{real_time_decision_id}/action`, but is otherwise the same as
         * [RealTimeDecisionServiceAsync.action].
         */
        @JvmOverloads
        @MustBeClosed
        fun action(
            params: RealTimeDecisionActionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RealTimeDecision>>
    }
}
