// File generated from our OpenAPI spec by Stainless.

package com.increase.api.client

import com.increase.api.services.blocking.AccountNumberService
import com.increase.api.services.blocking.AccountService
import com.increase.api.services.blocking.AccountStatementService
import com.increase.api.services.blocking.AccountTransferService
import com.increase.api.services.blocking.AchPrenotificationService
import com.increase.api.services.blocking.AchTransferService
import com.increase.api.services.blocking.BookkeepingAccountService
import com.increase.api.services.blocking.BookkeepingEntryService
import com.increase.api.services.blocking.BookkeepingEntrySetService
import com.increase.api.services.blocking.CardDisputeService
import com.increase.api.services.blocking.CardPaymentService
import com.increase.api.services.blocking.CardPurchaseSupplementService
import com.increase.api.services.blocking.CardService
import com.increase.api.services.blocking.CheckDepositService
import com.increase.api.services.blocking.CheckTransferService
import com.increase.api.services.blocking.DeclinedTransactionService
import com.increase.api.services.blocking.DigitalCardProfileService
import com.increase.api.services.blocking.DigitalWalletTokenService
import com.increase.api.services.blocking.DocumentService
import com.increase.api.services.blocking.EntityService
import com.increase.api.services.blocking.EventService
import com.increase.api.services.blocking.EventSubscriptionService
import com.increase.api.services.blocking.ExportService
import com.increase.api.services.blocking.ExternalAccountService
import com.increase.api.services.blocking.FileService
import com.increase.api.services.blocking.GroupService
import com.increase.api.services.blocking.InboundAchTransferService
import com.increase.api.services.blocking.InboundCheckDepositService
import com.increase.api.services.blocking.InboundMailItemService
import com.increase.api.services.blocking.InboundRealTimePaymentsTransferService
import com.increase.api.services.blocking.InboundWireDrawdownRequestService
import com.increase.api.services.blocking.InboundWireTransferService
import com.increase.api.services.blocking.IntrafiAccountEnrollmentService
import com.increase.api.services.blocking.IntrafiBalanceService
import com.increase.api.services.blocking.IntrafiExclusionService
import com.increase.api.services.blocking.LockboxService
import com.increase.api.services.blocking.OAuthApplicationService
import com.increase.api.services.blocking.OAuthConnectionService
import com.increase.api.services.blocking.OAuthTokenService
import com.increase.api.services.blocking.PendingTransactionService
import com.increase.api.services.blocking.PhysicalCardProfileService
import com.increase.api.services.blocking.PhysicalCardService
import com.increase.api.services.blocking.ProgramService
import com.increase.api.services.blocking.ProofOfAuthorizationRequestService
import com.increase.api.services.blocking.ProofOfAuthorizationRequestSubmissionService
import com.increase.api.services.blocking.RealTimeDecisionService
import com.increase.api.services.blocking.RealTimePaymentsRequestForPaymentService
import com.increase.api.services.blocking.RealTimePaymentsTransferService
import com.increase.api.services.blocking.RoutingNumberService
import com.increase.api.services.blocking.SimulationService
import com.increase.api.services.blocking.SupplementalDocumentService
import com.increase.api.services.blocking.TransactionService
import com.increase.api.services.blocking.WebhookService
import com.increase.api.services.blocking.WireDrawdownRequestService
import com.increase.api.services.blocking.WireTransferService

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

    fun oauthApplications(): OAuthApplicationService

    fun oauthConnections(): OAuthConnectionService

    fun webhooks(): WebhookService

    fun oauthTokens(): OAuthTokenService

    fun intrafiAccountEnrollments(): IntrafiAccountEnrollmentService

    fun intrafiBalances(): IntrafiBalanceService

    fun intrafiExclusions(): IntrafiExclusionService

    fun realTimePaymentsRequestForPayments(): RealTimePaymentsRequestForPaymentService

    fun simulations(): SimulationService

    /**
     * Closes this client, relinquishing any underlying resources.
     *
     * This is purposefully not inherited from [AutoCloseable] because the client is long-lived and
     * usually should not be synchronously closed via try-with-resources.
     *
     * It's also usually not necessary to call this method at all. the default HTTP client
     * automatically releases threads and connections if they remain idle, but if you are writing an
     * application that needs to aggressively release unused resources, then you may call this
     * method.
     */
    fun close()
}
