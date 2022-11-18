@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.client

import com.increase.api.models.*
import com.increase.api.services.async.*

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
