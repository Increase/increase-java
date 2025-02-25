// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async

import com.increase.api.core.RequestOptions
import com.increase.api.models.ProofOfAuthorizationRequest
import com.increase.api.models.ProofOfAuthorizationRequestListPageAsync
import com.increase.api.models.ProofOfAuthorizationRequestListParams
import com.increase.api.models.ProofOfAuthorizationRequestRetrieveParams
import java.util.concurrent.CompletableFuture

interface ProofOfAuthorizationRequestServiceAsync {

    /** Retrieve a Proof of Authorization Request */
    @JvmOverloads
    fun retrieve(
        params: ProofOfAuthorizationRequestRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProofOfAuthorizationRequest>

    /** List Proof of Authorization Requests */
    @JvmOverloads
    fun list(
        params: ProofOfAuthorizationRequestListParams =
            ProofOfAuthorizationRequestListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProofOfAuthorizationRequestListPageAsync>

    /** List Proof of Authorization Requests */
    fun list(
        requestOptions: RequestOptions
    ): CompletableFuture<ProofOfAuthorizationRequestListPageAsync> =
        list(ProofOfAuthorizationRequestListParams.none(), requestOptions)
}
