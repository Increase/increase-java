@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.client

import java.time.Duration
import java.util.Base64
import java.util.Optional
import java.util.concurrent.CompletableFuture
import com.increase.api.core.ClientOptions
import com.increase.api.core.http.HttpMethod
import com.increase.api.core.http.HttpRequest
import com.increase.api.core.http.HttpResponse.Handler
import com.increase.api.core.JsonField
import com.increase.api.core.RequestOptions
import com.increase.api.errors.IncreaseError
import com.increase.api.errors.IncreaseInvalidDataException
import com.increase.api.models.*
import com.increase.api.services.async.*
import com.increase.api.services.emptyHandler
import com.increase.api.services.errorHandler
import com.increase.api.services.json
import com.increase.api.services.jsonHandler
import com.increase.api.services.stringHandler
import com.increase.api.services.withErrorHandler

interface IncreaseClientAsync {

    fun accounts(): AccountServiceAsync

    fun accountNumbers(): AccountNumberServiceAsync

    fun realTimeDecisions(): RealTimeDecisionServiceAsync

    fun cards(): CardServiceAsync

    fun cardDisputes(): CardDisputeServiceAsync

    fun cardProfiles(): CardProfileServiceAsync

    fun externalAccounts(): ExternalAccountServiceAsync

    fun digitalWalletTokens(): DigitalWalletTokenServiceAsync

    fun transactions(): TransactionServiceAsync

    fun pendingTransactions(): PendingTransactionServiceAsync

    fun declinedTransactions(): DeclinedTransactionServiceAsync

    fun limits(): LimitServiceAsync

    fun accountTransfers(): AccountTransferServiceAsync

    fun achTransfers(): AchTransferServiceAsync

    fun inboundAchTransferReturns(): InboundAchTransferReturnServiceAsync

    fun achPrenotifications(): AchPrenotificationServiceAsync

    fun documents(): DocumentServiceAsync

    fun wireTransfers(): WireTransferServiceAsync

    fun checkTransfers(): CheckTransferServiceAsync

    fun entities(): EntityServiceAsync

    fun inboundWireDrawdownRequests(): InboundWireDrawdownRequestServiceAsync

    fun wireDrawdownRequests(): WireDrawdownRequestServiceAsync

    fun events(): EventServiceAsync

    fun eventSubscriptions(): EventSubscriptionServiceAsync

    fun files(): FileServiceAsync

    fun groups(): GroupServiceAsync

    fun oauthConnections(): OauthConnectionServiceAsync

    fun checkDeposits(): CheckDepositServiceAsync

    fun routingNumbers(): RoutingNumberServiceAsync

    fun accountStatements(): AccountStatementServiceAsync

    fun simulations(): SimulationServiceAsync
}
