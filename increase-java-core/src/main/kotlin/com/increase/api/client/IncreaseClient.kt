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
import com.increase.api.services.blocking.*
import com.increase.api.services.emptyHandler
import com.increase.api.services.errorHandler
import com.increase.api.services.json
import com.increase.api.services.jsonHandler
import com.increase.api.services.stringHandler
import com.increase.api.services.withErrorHandler

interface IncreaseClient {

    fun accounts(): AccountService

    fun accountNumbers(): AccountNumberService

    fun realTimeDecisions(): RealTimeDecisionService

    fun cards(): CardService

    fun cardDisputes(): CardDisputeService

    fun cardProfiles(): CardProfileService

    fun externalAccounts(): ExternalAccountService

    fun digitalWalletTokens(): DigitalWalletTokenService

    fun transactions(): TransactionService

    fun pendingTransactions(): PendingTransactionService

    fun declinedTransactions(): DeclinedTransactionService

    fun limits(): LimitService

    fun accountTransfers(): AccountTransferService

    fun achTransfers(): AchTransferService

    fun inboundAchTransferReturns(): InboundAchTransferReturnService

    fun achPrenotifications(): AchPrenotificationService

    fun documents(): DocumentService

    fun wireTransfers(): WireTransferService

    fun checkTransfers(): CheckTransferService

    fun entities(): EntityService

    fun inboundWireDrawdownRequests(): InboundWireDrawdownRequestService

    fun wireDrawdownRequests(): WireDrawdownRequestService

    fun events(): EventService

    fun eventSubscriptions(): EventSubscriptionService

    fun files(): FileService

    fun groups(): GroupService

    fun oauthConnections(): OauthConnectionService

    fun checkDeposits(): CheckDepositService

    fun routingNumbers(): RoutingNumberService

    fun accountStatements(): AccountStatementService

    fun simulations(): SimulationService
}
