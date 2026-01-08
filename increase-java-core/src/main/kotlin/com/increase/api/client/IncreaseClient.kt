// File generated from our OpenAPI spec by Stainless.

package com.increase.api.client

import com.increase.api.core.ClientOptions
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
import com.increase.api.services.blocking.CardPushTransferService
import com.increase.api.services.blocking.CardService
import com.increase.api.services.blocking.CardTokenService
import com.increase.api.services.blocking.CardValidationService
import com.increase.api.services.blocking.CheckDepositService
import com.increase.api.services.blocking.CheckTransferService
import com.increase.api.services.blocking.DeclinedTransactionService
import com.increase.api.services.blocking.DigitalCardProfileService
import com.increase.api.services.blocking.DigitalWalletTokenService
import com.increase.api.services.blocking.EntityService
import com.increase.api.services.blocking.EventService
import com.increase.api.services.blocking.EventSubscriptionService
import com.increase.api.services.blocking.ExportService
import com.increase.api.services.blocking.ExternalAccountService
import com.increase.api.services.blocking.FednowTransferService
import com.increase.api.services.blocking.FileLinkService
import com.increase.api.services.blocking.FileService
import com.increase.api.services.blocking.GroupService
import com.increase.api.services.blocking.InboundAchTransferService
import com.increase.api.services.blocking.InboundCheckDepositService
import com.increase.api.services.blocking.InboundFednowTransferService
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
import com.increase.api.services.blocking.RealTimeDecisionService
import com.increase.api.services.blocking.RealTimePaymentsTransferService
import com.increase.api.services.blocking.RoutingNumberService
import com.increase.api.services.blocking.SimulationService
import com.increase.api.services.blocking.SupplementalDocumentService
import com.increase.api.services.blocking.SwiftTransferService
import com.increase.api.services.blocking.TransactionService
import com.increase.api.services.blocking.WireDrawdownRequestService
import com.increase.api.services.blocking.WireTransferService
import java.util.function.Consumer

/**
 * A client for interacting with the Increase REST API synchronously. You can also switch to
 * asynchronous execution via the [async] method.
 *
 * This client performs best when you create a single instance and reuse it for all interactions
 * with the REST API. This is because each client holds its own connection pool and thread pools.
 * Reusing connections and threads reduces latency and saves memory. The client also handles rate
 * limiting per client. This means that creating and using multiple instances at the same time will
 * not respect rate limits.
 *
 * The threads and connections that are held will be released automatically if they remain idle. But
 * if you are writing an application that needs to aggressively release unused resources, then you
 * may call [close].
 */
interface IncreaseClient {

    /**
     * Returns a version of this client that uses asynchronous execution.
     *
     * The returned client shares its resources, like its connection pool and thread pools, with
     * this client.
     */
    fun async(): IncreaseClientAsync

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): IncreaseClient

    fun accounts(): AccountService

    fun accountNumbers(): AccountNumberService

    fun accountTransfers(): AccountTransferService

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

    fun fednowTransfers(): FednowTransferService

    fun inboundFednowTransfers(): InboundFednowTransferService

    fun swiftTransfers(): SwiftTransferService

    fun checkDeposits(): CheckDepositService

    fun lockboxes(): LockboxService

    fun inboundMailItems(): InboundMailItemService

    fun routingNumbers(): RoutingNumberService

    fun externalAccounts(): ExternalAccountService

    fun entities(): EntityService

    fun supplementalDocuments(): SupplementalDocumentService

    fun programs(): ProgramService

    fun accountStatements(): AccountStatementService

    fun files(): FileService

    fun fileLinks(): FileLinkService

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

    fun oauthTokens(): OAuthTokenService

    fun intrafiAccountEnrollments(): IntrafiAccountEnrollmentService

    fun intrafiBalances(): IntrafiBalanceService

    fun intrafiExclusions(): IntrafiExclusionService

    fun cardTokens(): CardTokenService

    fun cardPushTransfers(): CardPushTransferService

    fun cardValidations(): CardValidationService

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

    /** A view of [IncreaseClient] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): IncreaseClient.WithRawResponse

        fun accounts(): AccountService.WithRawResponse

        fun accountNumbers(): AccountNumberService.WithRawResponse

        fun accountTransfers(): AccountTransferService.WithRawResponse

        fun cards(): CardService.WithRawResponse

        fun cardPayments(): CardPaymentService.WithRawResponse

        fun cardPurchaseSupplements(): CardPurchaseSupplementService.WithRawResponse

        fun cardDisputes(): CardDisputeService.WithRawResponse

        fun physicalCards(): PhysicalCardService.WithRawResponse

        fun digitalCardProfiles(): DigitalCardProfileService.WithRawResponse

        fun physicalCardProfiles(): PhysicalCardProfileService.WithRawResponse

        fun digitalWalletTokens(): DigitalWalletTokenService.WithRawResponse

        fun transactions(): TransactionService.WithRawResponse

        fun pendingTransactions(): PendingTransactionService.WithRawResponse

        fun declinedTransactions(): DeclinedTransactionService.WithRawResponse

        fun achTransfers(): AchTransferService.WithRawResponse

        fun achPrenotifications(): AchPrenotificationService.WithRawResponse

        fun inboundAchTransfers(): InboundAchTransferService.WithRawResponse

        fun wireTransfers(): WireTransferService.WithRawResponse

        fun inboundWireTransfers(): InboundWireTransferService.WithRawResponse

        fun wireDrawdownRequests(): WireDrawdownRequestService.WithRawResponse

        fun inboundWireDrawdownRequests(): InboundWireDrawdownRequestService.WithRawResponse

        fun checkTransfers(): CheckTransferService.WithRawResponse

        fun inboundCheckDeposits(): InboundCheckDepositService.WithRawResponse

        fun realTimePaymentsTransfers(): RealTimePaymentsTransferService.WithRawResponse

        fun inboundRealTimePaymentsTransfers():
            InboundRealTimePaymentsTransferService.WithRawResponse

        fun fednowTransfers(): FednowTransferService.WithRawResponse

        fun inboundFednowTransfers(): InboundFednowTransferService.WithRawResponse

        fun swiftTransfers(): SwiftTransferService.WithRawResponse

        fun checkDeposits(): CheckDepositService.WithRawResponse

        fun lockboxes(): LockboxService.WithRawResponse

        fun inboundMailItems(): InboundMailItemService.WithRawResponse

        fun routingNumbers(): RoutingNumberService.WithRawResponse

        fun externalAccounts(): ExternalAccountService.WithRawResponse

        fun entities(): EntityService.WithRawResponse

        fun supplementalDocuments(): SupplementalDocumentService.WithRawResponse

        fun programs(): ProgramService.WithRawResponse

        fun accountStatements(): AccountStatementService.WithRawResponse

        fun files(): FileService.WithRawResponse

        fun fileLinks(): FileLinkService.WithRawResponse

        fun exports(): ExportService.WithRawResponse

        fun events(): EventService.WithRawResponse

        fun eventSubscriptions(): EventSubscriptionService.WithRawResponse

        fun realTimeDecisions(): RealTimeDecisionService.WithRawResponse

        fun bookkeepingAccounts(): BookkeepingAccountService.WithRawResponse

        fun bookkeepingEntrySets(): BookkeepingEntrySetService.WithRawResponse

        fun bookkeepingEntries(): BookkeepingEntryService.WithRawResponse

        fun groups(): GroupService.WithRawResponse

        fun oauthApplications(): OAuthApplicationService.WithRawResponse

        fun oauthConnections(): OAuthConnectionService.WithRawResponse

        fun oauthTokens(): OAuthTokenService.WithRawResponse

        fun intrafiAccountEnrollments(): IntrafiAccountEnrollmentService.WithRawResponse

        fun intrafiBalances(): IntrafiBalanceService.WithRawResponse

        fun intrafiExclusions(): IntrafiExclusionService.WithRawResponse

        fun cardTokens(): CardTokenService.WithRawResponse

        fun cardPushTransfers(): CardPushTransferService.WithRawResponse

        fun cardValidations(): CardValidationService.WithRawResponse

        fun simulations(): SimulationService.WithRawResponse
    }
}
