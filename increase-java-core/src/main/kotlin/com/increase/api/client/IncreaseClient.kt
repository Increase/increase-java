// File generated from our OpenAPI spec by Stainless.

package com.increase.api.client

import com.increase.api.models.*
import com.increase.api.services.blocking.*

interface IncreaseClient {

    fun async(): IncreaseClientAsync

    fun accounts(): AccountService

    fun accountNumbers(): AccountNumberService

    fun cards(): CardService

    fun cardPayments(): CardPaymentService

    fun cardPurchaseSupplements(): CardPurchaseSupplementService

    fun cardDisputes(): CardDisputeService

    fun physicalCards(): PhysicalCardService

    fun digitalCardProfiles(): DigitalCardProfileService

    fun physicalCardProfiles(): PhysicalCardProfileService

    fun digitalWalletTokens(): DigitalWalletTokenService

    fun transactions(): TransactionService

    fun pendingTransactions(): PendingTransactionService

    fun declinedTransactions(): DeclinedTransactionService

    fun accountTransfers(): AccountTransferService

    fun achTransfers(): AchTransferService

    fun achPrenotifications(): AchPrenotificationService

    fun inboundAchTransfers(): InboundAchTransferService

    fun wireTransfers(): WireTransferService

    fun inboundWireTransfers(): InboundWireTransferService

    fun wireDrawdownRequests(): WireDrawdownRequestService

    fun inboundWireDrawdownRequests(): InboundWireDrawdownRequestService

    fun checkTransfers(): CheckTransferService

    fun inboundCheckDeposits(): InboundCheckDepositService

    fun realTimePaymentsTransfers(): RealTimePaymentsTransferService

    fun inboundRealTimePaymentsTransfers(): InboundRealTimePaymentsTransferService

    fun checkDeposits(): CheckDepositService

    fun lockboxes(): LockboxService

    fun inboundMailItems(): InboundMailItemService

    fun routingNumbers(): RoutingNumberService

    fun externalAccounts(): ExternalAccountService

    fun entities(): EntityService

    fun supplementalDocuments(): SupplementalDocumentService

    fun programs(): ProgramService

    fun proofOfAuthorizationRequests(): ProofOfAuthorizationRequestService

    fun proofOfAuthorizationRequestSubmissions(): ProofOfAuthorizationRequestSubmissionService

    fun accountStatements(): AccountStatementService

    fun files(): FileService

    fun documents(): DocumentService

    fun exports(): ExportService

    fun events(): EventService

    fun eventSubscriptions(): EventSubscriptionService

    fun realTimeDecisions(): RealTimeDecisionService

    fun bookkeepingAccounts(): BookkeepingAccountService

    fun bookkeepingEntrySets(): BookkeepingEntrySetService

    fun bookkeepingEntries(): BookkeepingEntryService

    fun groups(): GroupService

    fun oauthConnections(): OAuthConnectionService

    fun oauthTokens(): OAuthTokenService

    fun intrafiAccountEnrollments(): IntrafiAccountEnrollmentService

    fun intrafiBalances(): IntrafiBalanceService

    fun intrafiExclusions(): IntrafiExclusionService

    fun realTimePaymentsRequestForPayments(): RealTimePaymentsRequestForPaymentService

    fun simulations(): SimulationService
}
