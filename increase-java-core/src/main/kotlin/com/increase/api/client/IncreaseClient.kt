@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.client

import com.increase.api.models.*
import com.increase.api.services.blocking.*

interface IncreaseClient {

    fun accounts(): AccountService

    fun accountNumbers(): AccountNumberService

    fun realTimeDecisions(): RealTimeDecisionService

    fun realTimePaymentsTransfers(): RealTimePaymentsTransferService

    fun balanceLookups(): BalanceLookupService

    fun cards(): CardService

    fun cardDisputes(): CardDisputeService

    fun cardProfiles(): CardProfileService

    fun externalAccounts(): ExternalAccountService

    fun exports(): ExportService

    fun digitalWalletTokens(): DigitalWalletTokenService

    fun transactions(): TransactionService

    fun pendingTransactions(): PendingTransactionService

    fun programs(): ProgramService

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
