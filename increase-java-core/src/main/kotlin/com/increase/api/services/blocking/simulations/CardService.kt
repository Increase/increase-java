@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.blocking.simulations

import com.increase.api.core.RequestOptions
import com.increase.api.models.CardAuthorizationSimulation
import com.increase.api.models.SimulationCardAuthorizeParams
import com.increase.api.models.SimulationCardSettlementParams
import com.increase.api.models.Transaction

interface CardService {

    /**
     * Simulates a purchase authorization on a [Card](#cards). Depending on the balance available to
     * the card and the `amount` submitted, the authorization activity will result in a
     * [Pending Transaction](#pending-transactions) of type `card_authorization` or a
     * [Declined Transaction](#declined-transactions) of type `card_decline`. You can pass either a
     * Card id or a [Digital Wallet Token](#digital-wallet-tokens) id to simulate the two different
     * ways purchases can be made.
     */
    @JvmOverloads
    fun authorize(
        params: SimulationCardAuthorizeParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CardAuthorizationSimulation

    /**
     * Simulates the settlement of an authorization by a card acquirer. After a card authorization
     * is created, the merchant will eventually send a settlement. This simulates that event, which
     * may occur many days after the purchase in production. The amount settled can be different
     * from the amount originally authorized, for example, when adding a tip to a restaurant bill.
     */
    @JvmOverloads
    fun settlement(
        params: SimulationCardSettlementParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Transaction
}
