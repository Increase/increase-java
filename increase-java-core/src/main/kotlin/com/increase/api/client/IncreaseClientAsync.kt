// File generated from our OpenAPI spec by Stainless.

package com.increase.api.client

import com.increase.api.services.async.AccountNumberServiceAsync
import com.increase.api.services.async.AccountServiceAsync
import com.increase.api.services.async.AccountStatementServiceAsync
import com.increase.api.services.async.AccountTransferServiceAsync
import com.increase.api.services.async.AchPrenotificationServiceAsync
import com.increase.api.services.async.AchTransferServiceAsync
import com.increase.api.services.async.BookkeepingAccountServiceAsync
import com.increase.api.services.async.BookkeepingEntryServiceAsync
import com.increase.api.services.async.BookkeepingEntrySetServiceAsync
import com.increase.api.services.async.CardDisputeServiceAsync
import com.increase.api.services.async.CardPaymentServiceAsync
import com.increase.api.services.async.CardPurchaseSupplementServiceAsync
import com.increase.api.services.async.CardServiceAsync
import com.increase.api.services.async.CheckDepositServiceAsync
import com.increase.api.services.async.CheckTransferServiceAsync
import com.increase.api.services.async.DeclinedTransactionServiceAsync
import com.increase.api.services.async.DigitalCardProfileServiceAsync
import com.increase.api.services.async.DigitalWalletTokenServiceAsync
import com.increase.api.services.async.DocumentServiceAsync
import com.increase.api.services.async.EntityServiceAsync
import com.increase.api.services.async.EventServiceAsync
import com.increase.api.services.async.EventSubscriptionServiceAsync
import com.increase.api.services.async.ExportServiceAsync
import com.increase.api.services.async.ExternalAccountServiceAsync
import com.increase.api.services.async.FileServiceAsync
import com.increase.api.services.async.GroupServiceAsync
import com.increase.api.services.async.InboundAchTransferServiceAsync
import com.increase.api.services.async.InboundCheckDepositServiceAsync
import com.increase.api.services.async.InboundMailItemServiceAsync
import com.increase.api.services.async.InboundRealTimePaymentsTransferServiceAsync
import com.increase.api.services.async.InboundWireDrawdownRequestServiceAsync
import com.increase.api.services.async.InboundWireTransferServiceAsync
import com.increase.api.services.async.IntrafiAccountEnrollmentServiceAsync
import com.increase.api.services.async.IntrafiBalanceServiceAsync
import com.increase.api.services.async.IntrafiExclusionServiceAsync
import com.increase.api.services.async.LockboxServiceAsync
import com.increase.api.services.async.OAuthApplicationServiceAsync
import com.increase.api.services.async.OAuthConnectionServiceAsync
import com.increase.api.services.async.OAuthTokenServiceAsync
import com.increase.api.services.async.PendingTransactionServiceAsync
import com.increase.api.services.async.PhysicalCardProfileServiceAsync
import com.increase.api.services.async.PhysicalCardServiceAsync
import com.increase.api.services.async.ProgramServiceAsync
import com.increase.api.services.async.ProofOfAuthorizationRequestServiceAsync
import com.increase.api.services.async.ProofOfAuthorizationRequestSubmissionServiceAsync
import com.increase.api.services.async.RealTimeDecisionServiceAsync
import com.increase.api.services.async.RealTimePaymentsRequestForPaymentServiceAsync
import com.increase.api.services.async.RealTimePaymentsTransferServiceAsync
import com.increase.api.services.async.RoutingNumberServiceAsync
import com.increase.api.services.async.SimulationServiceAsync
import com.increase.api.services.async.SupplementalDocumentServiceAsync
import com.increase.api.services.async.TransactionServiceAsync
import com.increase.api.services.async.WebhookServiceAsync
import com.increase.api.services.async.WireDrawdownRequestServiceAsync
import com.increase.api.services.async.WireTransferServiceAsync

interface IncreaseClientAsync {

    fun sync(): IncreaseClient

    fun accounts(): AccountServiceAsync

    fun accountNumbers(): AccountNumberServiceAsync

    fun cards(): CardServiceAsync

    fun cardPayments(): CardPaymentServiceAsync

    fun cardPurchaseSupplements(): CardPurchaseSupplementServiceAsync

    fun cardDisputes(): CardDisputeServiceAsync

    fun physicalCards(): PhysicalCardServiceAsync

    fun digitalCardProfiles(): DigitalCardProfileServiceAsync

    fun physicalCardProfiles(): PhysicalCardProfileServiceAsync

    fun digitalWalletTokens(): DigitalWalletTokenServiceAsync

    fun transactions(): TransactionServiceAsync

    fun pendingTransactions(): PendingTransactionServiceAsync

    fun declinedTransactions(): DeclinedTransactionServiceAsync

    fun accountTransfers(): AccountTransferServiceAsync

    fun achTransfers(): AchTransferServiceAsync

    fun achPrenotifications(): AchPrenotificationServiceAsync

    fun inboundAchTransfers(): InboundAchTransferServiceAsync

    fun wireTransfers(): WireTransferServiceAsync

    fun inboundWireTransfers(): InboundWireTransferServiceAsync

    fun wireDrawdownRequests(): WireDrawdownRequestServiceAsync

    fun inboundWireDrawdownRequests(): InboundWireDrawdownRequestServiceAsync

    fun checkTransfers(): CheckTransferServiceAsync

    fun inboundCheckDeposits(): InboundCheckDepositServiceAsync

    fun realTimePaymentsTransfers(): RealTimePaymentsTransferServiceAsync

    fun inboundRealTimePaymentsTransfers(): InboundRealTimePaymentsTransferServiceAsync

    fun checkDeposits(): CheckDepositServiceAsync

    fun lockboxes(): LockboxServiceAsync

    fun inboundMailItems(): InboundMailItemServiceAsync

    fun routingNumbers(): RoutingNumberServiceAsync

    fun externalAccounts(): ExternalAccountServiceAsync

    fun entities(): EntityServiceAsync

    fun supplementalDocuments(): SupplementalDocumentServiceAsync

    fun programs(): ProgramServiceAsync

    fun proofOfAuthorizationRequests(): ProofOfAuthorizationRequestServiceAsync

    fun proofOfAuthorizationRequestSubmissions(): ProofOfAuthorizationRequestSubmissionServiceAsync

    fun accountStatements(): AccountStatementServiceAsync

    fun files(): FileServiceAsync

    fun documents(): DocumentServiceAsync

    fun exports(): ExportServiceAsync

    fun events(): EventServiceAsync

    fun eventSubscriptions(): EventSubscriptionServiceAsync

    fun realTimeDecisions(): RealTimeDecisionServiceAsync

    fun bookkeepingAccounts(): BookkeepingAccountServiceAsync

    fun bookkeepingEntrySets(): BookkeepingEntrySetServiceAsync

    fun bookkeepingEntries(): BookkeepingEntryServiceAsync

    fun groups(): GroupServiceAsync

    fun oauthApplications(): OAuthApplicationServiceAsync

    fun oauthConnections(): OAuthConnectionServiceAsync

    fun webhooks(): WebhookServiceAsync

    fun oauthTokens(): OAuthTokenServiceAsync

    fun intrafiAccountEnrollments(): IntrafiAccountEnrollmentServiceAsync

    fun intrafiBalances(): IntrafiBalanceServiceAsync

    fun intrafiExclusions(): IntrafiExclusionServiceAsync

    fun realTimePaymentsRequestForPayments(): RealTimePaymentsRequestForPaymentServiceAsync

    fun simulations(): SimulationServiceAsync
}
