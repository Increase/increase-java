@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.blocking.simulations

import com.fasterxml.jackson.databind.json.JsonMapper
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import kotlin.LazyThreadSafetyMode.PUBLICATION
import java.time.LocalDate
import java.time.Duration
import java.time.OffsetDateTime
import java.util.Base64
import java.util.Optional
import java.util.UUID
import java.util.concurrent.CompletableFuture
import java.util.stream.Stream
import com.increase.api.core.NoAutoDetect
import com.increase.api.errors.IncreaseInvalidDataException
import com.increase.api.models.CardAuthorizationSimulation
import com.increase.api.models.SimulationsCardAuthorizeParams
import com.increase.api.models.SimulationsCardSettlementParams
import com.increase.api.models.Transaction
import com.increase.api.core.ClientOptions
import com.increase.api.core.http.HttpMethod
import com.increase.api.core.http.HttpRequest
import com.increase.api.core.http.HttpResponse.Handler
import com.increase.api.core.JsonField
import com.increase.api.core.RequestOptions
import com.increase.api.errors.IncreaseError
import com.increase.api.services.emptyHandler
import com.increase.api.services.errorHandler
import com.increase.api.services.json
import com.increase.api.services.jsonHandler
import com.increase.api.services.stringHandler
import com.increase.api.services.withErrorHandler

interface CardService {

    /**
     * Simulates a purchase authorization on a [Card](#cards). Depending on the balance
     * available to the card and the `amount` submitted, the authorization activity
     * will result in a [Pending Transaction](#pending-transactions) of type
     * `card_authorization` or a [Declined Transaction](#declined-transactions) of type
     * `card_decline`. You can pass either a Card id or a
     * [Digital Wallet Token](#digital-wallet-tokens) id to simulate the two different
     * ways purchases can be made.
     */
    @JvmOverloads
    fun authorize(params: SimulationsCardAuthorizeParams, requestOptions: RequestOptions = RequestOptions.none()): CardAuthorizationSimulation

    /**
     * Simulates the settlement of an authorization by a card acquirer. After a card
     * authorization is created, the merchant will eventually send a settlement. This
     * simulates that event, which may occur many days after the purchase in
     * production. The amount settled can be different from the amount originally
     * authorized, for example, when adding a tip to a restaurant bill.
     */
    @JvmOverloads
    fun settlement(params: SimulationsCardSettlementParams, requestOptions: RequestOptions = RequestOptions.none()): Transaction
}
