// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.client

import com.increase.api.models.*
import com.increase.api.services.async.*

interface IncreaseClientAsync {

    fun sync(): IncreaseClient

    fun accounts(): AccountServiceAsync

    fun accountNumbers(): AccountNumberServiceAsync

    fun bookkeepingAccounts(): BookkeepingAccountServiceAsync

    fun bookkeepingEntrySets(): BookkeepingEntrySetServiceAsync

    fun bookkeepingEntries(): BookkeepingEntryServiceAsync

    fun realTimeDecisions(): RealTimeDecisionServiceAsync

    fun realTimePaymentsTransfers(): RealTimePaymentsTransferServiceAsync

    fun cards(): CardServiceAsync

    fun cardDisputes(): CardDisputeServiceAsync

    fun cardPurchaseSupplements(): CardPurchaseSupplementServiceAsync

    fun externalAccounts(): ExternalAccountServiceAsync

    fun exports(): ExportServiceAsync

    fun digitalWalletTokens(): DigitalWalletTokenServiceAsync

    fun transactions(): TransactionServiceAsync

    fun pendingTransactions(): PendingTransactionServiceAsync

    fun programs(): ProgramServiceAsync

    fun declinedTransactions(): DeclinedTransactionServiceAsync

    fun accountTransfers(): AccountTransferServiceAsync

    fun achTransfers(): AchTransferServiceAsync

    fun achPrenotifications(): AchPrenotificationServiceAsync

    fun documents(): DocumentServiceAsync

    fun wireTransfers(): WireTransferServiceAsync

    fun checkTransfers(): CheckTransferServiceAsync

    fun entities(): EntityServiceAsync

    fun inboundAchTransfers(): InboundAchTransferServiceAsync

    fun inboundWireDrawdownRequests(): InboundWireDrawdownRequestServiceAsync

    fun wireDrawdownRequests(): WireDrawdownRequestServiceAsync

    fun events(): EventServiceAsync

    fun eventSubscriptions(): EventSubscriptionServiceAsync

    fun files(): FileServiceAsync

    fun groups(): GroupServiceAsync

    fun oauthConnections(): OAuthConnectionServiceAsync

    fun checkDeposits(): CheckDepositServiceAsync

    fun routingNumbers(): RoutingNumberServiceAsync

    fun accountStatements(): AccountStatementServiceAsync

    fun simulations(): SimulationServiceAsync

    fun physicalCards(): PhysicalCardServiceAsync

    fun cardPayments(): CardPaymentServiceAsync

    fun proofOfAuthorizationRequests(): ProofOfAuthorizationRequestServiceAsync

    fun proofOfAuthorizationRequestSubmissions(): ProofOfAuthorizationRequestSubmissionServiceAsync

    fun intrafi(): IntrafiServiceAsync

    fun realTimePaymentsRequestForPayments(): RealTimePaymentsRequestForPaymentServiceAsync

    fun webhooks(): WebhookServiceAsync

    fun oauthTokens(): OAuthTokenServiceAsync

    fun inboundWireTransfers(): InboundWireTransferServiceAsync

    fun digitalCardProfiles(): DigitalCardProfileServiceAsync

    fun physicalCardProfiles(): PhysicalCardProfileServiceAsync
}
