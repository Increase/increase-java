// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async.simulations

import com.increase.api.core.RequestOptions
import com.increase.api.models.CardProfile
import com.increase.api.models.SimulationCardProfileApproveParams
import java.util.concurrent.CompletableFuture

interface CardProfileServiceAsync {

    /**
     * After a [Card Profile](#card-profile) is created in production, the images will be uploaded
     * to Visa within one day. Since Card Profiles are not uploaded to Visa in sandbox, this
     * endpoint simulates that step. Invoking this simulation triggers the webhooks Increase sends
     * when the Card Profile is approved and updates the status of the Card Profile.
     */
    @JvmOverloads
    fun approve(
        params: SimulationCardProfileApproveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<CardProfile>
}
