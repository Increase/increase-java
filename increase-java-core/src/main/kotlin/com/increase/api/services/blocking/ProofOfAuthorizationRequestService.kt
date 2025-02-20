// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.blocking

import com.increase.api.core.RequestOptions
import com.increase.api.models.ProofOfAuthorizationRequest
import com.increase.api.models.ProofOfAuthorizationRequestListPage
import com.increase.api.models.ProofOfAuthorizationRequestListParams
import com.increase.api.models.ProofOfAuthorizationRequestRetrieveParams

interface ProofOfAuthorizationRequestService {

    /** Retrieve a Proof of Authorization Request */
    @JvmOverloads
    fun retrieve(
        params: ProofOfAuthorizationRequestRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProofOfAuthorizationRequest

    /** List Proof of Authorization Requests */
    @JvmOverloads
    fun list(
        params: ProofOfAuthorizationRequestListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProofOfAuthorizationRequestListPage
}
