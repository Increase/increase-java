// File generated from our OpenAPI spec by Stainless.

package com.increase.api.client

import com.increase.api.core.ClientOptions
import com.increase.api.core.getPackageVersion
import com.increase.api.services.async.AccountNumberServiceAsync
import com.increase.api.services.async.AccountNumberServiceAsyncImpl
import com.increase.api.services.async.AccountServiceAsync
import com.increase.api.services.async.AccountServiceAsyncImpl
import com.increase.api.services.async.AccountStatementServiceAsync
import com.increase.api.services.async.AccountStatementServiceAsyncImpl
import com.increase.api.services.async.AccountTransferServiceAsync
import com.increase.api.services.async.AccountTransferServiceAsyncImpl
import com.increase.api.services.async.AchPrenotificationServiceAsync
import com.increase.api.services.async.AchPrenotificationServiceAsyncImpl
import com.increase.api.services.async.AchTransferServiceAsync
import com.increase.api.services.async.AchTransferServiceAsyncImpl
import com.increase.api.services.async.BookkeepingAccountServiceAsync
import com.increase.api.services.async.BookkeepingAccountServiceAsyncImpl
import com.increase.api.services.async.BookkeepingEntryServiceAsync
import com.increase.api.services.async.BookkeepingEntryServiceAsyncImpl
import com.increase.api.services.async.BookkeepingEntrySetServiceAsync
import com.increase.api.services.async.BookkeepingEntrySetServiceAsyncImpl
import com.increase.api.services.async.CardDisputeServiceAsync
import com.increase.api.services.async.CardDisputeServiceAsyncImpl
import com.increase.api.services.async.CardPaymentServiceAsync
import com.increase.api.services.async.CardPaymentServiceAsyncImpl
import com.increase.api.services.async.CardPurchaseSupplementServiceAsync
import com.increase.api.services.async.CardPurchaseSupplementServiceAsyncImpl
import com.increase.api.services.async.CardServiceAsync
import com.increase.api.services.async.CardServiceAsyncImpl
import com.increase.api.services.async.CheckDepositServiceAsync
import com.increase.api.services.async.CheckDepositServiceAsyncImpl
import com.increase.api.services.async.CheckTransferServiceAsync
import com.increase.api.services.async.CheckTransferServiceAsyncImpl
import com.increase.api.services.async.DeclinedTransactionServiceAsync
import com.increase.api.services.async.DeclinedTransactionServiceAsyncImpl
import com.increase.api.services.async.DigitalCardProfileServiceAsync
import com.increase.api.services.async.DigitalCardProfileServiceAsyncImpl
import com.increase.api.services.async.DigitalWalletTokenServiceAsync
import com.increase.api.services.async.DigitalWalletTokenServiceAsyncImpl
import com.increase.api.services.async.DocumentServiceAsync
import com.increase.api.services.async.DocumentServiceAsyncImpl
import com.increase.api.services.async.EntityServiceAsync
import com.increase.api.services.async.EntityServiceAsyncImpl
import com.increase.api.services.async.EventServiceAsync
import com.increase.api.services.async.EventServiceAsyncImpl
import com.increase.api.services.async.EventSubscriptionServiceAsync
import com.increase.api.services.async.EventSubscriptionServiceAsyncImpl
import com.increase.api.services.async.ExportServiceAsync
import com.increase.api.services.async.ExportServiceAsyncImpl
import com.increase.api.services.async.ExternalAccountServiceAsync
import com.increase.api.services.async.ExternalAccountServiceAsyncImpl
import com.increase.api.services.async.FileServiceAsync
import com.increase.api.services.async.FileServiceAsyncImpl
import com.increase.api.services.async.GroupServiceAsync
import com.increase.api.services.async.GroupServiceAsyncImpl
import com.increase.api.services.async.InboundAchTransferServiceAsync
import com.increase.api.services.async.InboundAchTransferServiceAsyncImpl
import com.increase.api.services.async.InboundCheckDepositServiceAsync
import com.increase.api.services.async.InboundCheckDepositServiceAsyncImpl
import com.increase.api.services.async.InboundMailItemServiceAsync
import com.increase.api.services.async.InboundMailItemServiceAsyncImpl
import com.increase.api.services.async.InboundRealTimePaymentsTransferServiceAsync
import com.increase.api.services.async.InboundRealTimePaymentsTransferServiceAsyncImpl
import com.increase.api.services.async.InboundWireDrawdownRequestServiceAsync
import com.increase.api.services.async.InboundWireDrawdownRequestServiceAsyncImpl
import com.increase.api.services.async.InboundWireTransferServiceAsync
import com.increase.api.services.async.InboundWireTransferServiceAsyncImpl
import com.increase.api.services.async.IntrafiAccountEnrollmentServiceAsync
import com.increase.api.services.async.IntrafiAccountEnrollmentServiceAsyncImpl
import com.increase.api.services.async.IntrafiBalanceServiceAsync
import com.increase.api.services.async.IntrafiBalanceServiceAsyncImpl
import com.increase.api.services.async.IntrafiExclusionServiceAsync
import com.increase.api.services.async.IntrafiExclusionServiceAsyncImpl
import com.increase.api.services.async.LockboxServiceAsync
import com.increase.api.services.async.LockboxServiceAsyncImpl
import com.increase.api.services.async.OAuthApplicationServiceAsync
import com.increase.api.services.async.OAuthApplicationServiceAsyncImpl
import com.increase.api.services.async.OAuthConnectionServiceAsync
import com.increase.api.services.async.OAuthConnectionServiceAsyncImpl
import com.increase.api.services.async.OAuthTokenServiceAsync
import com.increase.api.services.async.OAuthTokenServiceAsyncImpl
import com.increase.api.services.async.PendingTransactionServiceAsync
import com.increase.api.services.async.PendingTransactionServiceAsyncImpl
import com.increase.api.services.async.PhysicalCardProfileServiceAsync
import com.increase.api.services.async.PhysicalCardProfileServiceAsyncImpl
import com.increase.api.services.async.PhysicalCardServiceAsync
import com.increase.api.services.async.PhysicalCardServiceAsyncImpl
import com.increase.api.services.async.ProgramServiceAsync
import com.increase.api.services.async.ProgramServiceAsyncImpl
import com.increase.api.services.async.ProofOfAuthorizationRequestServiceAsync
import com.increase.api.services.async.ProofOfAuthorizationRequestServiceAsyncImpl
import com.increase.api.services.async.ProofOfAuthorizationRequestSubmissionServiceAsync
import com.increase.api.services.async.ProofOfAuthorizationRequestSubmissionServiceAsyncImpl
import com.increase.api.services.async.RealTimeDecisionServiceAsync
import com.increase.api.services.async.RealTimeDecisionServiceAsyncImpl
import com.increase.api.services.async.RealTimePaymentsRequestForPaymentServiceAsync
import com.increase.api.services.async.RealTimePaymentsRequestForPaymentServiceAsyncImpl
import com.increase.api.services.async.RealTimePaymentsTransferServiceAsync
import com.increase.api.services.async.RealTimePaymentsTransferServiceAsyncImpl
import com.increase.api.services.async.RoutingNumberServiceAsync
import com.increase.api.services.async.RoutingNumberServiceAsyncImpl
import com.increase.api.services.async.SimulationServiceAsync
import com.increase.api.services.async.SimulationServiceAsyncImpl
import com.increase.api.services.async.SupplementalDocumentServiceAsync
import com.increase.api.services.async.SupplementalDocumentServiceAsyncImpl
import com.increase.api.services.async.TransactionServiceAsync
import com.increase.api.services.async.TransactionServiceAsyncImpl
import com.increase.api.services.async.WireDrawdownRequestServiceAsync
import com.increase.api.services.async.WireDrawdownRequestServiceAsyncImpl
import com.increase.api.services.async.WireTransferServiceAsync
import com.increase.api.services.async.WireTransferServiceAsyncImpl

class IncreaseClientAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : IncreaseClientAsync {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val sync: IncreaseClient by lazy { IncreaseClientImpl(clientOptions) }

    private val accounts: AccountServiceAsync by lazy {
        AccountServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val accountNumbers: AccountNumberServiceAsync by lazy {
        AccountNumberServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val cards: CardServiceAsync by lazy { CardServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val cardPayments: CardPaymentServiceAsync by lazy {
        CardPaymentServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val cardPurchaseSupplements: CardPurchaseSupplementServiceAsync by lazy {
        CardPurchaseSupplementServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val cardDisputes: CardDisputeServiceAsync by lazy {
        CardDisputeServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val physicalCards: PhysicalCardServiceAsync by lazy {
        PhysicalCardServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val digitalCardProfiles: DigitalCardProfileServiceAsync by lazy {
        DigitalCardProfileServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val physicalCardProfiles: PhysicalCardProfileServiceAsync by lazy {
        PhysicalCardProfileServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val digitalWalletTokens: DigitalWalletTokenServiceAsync by lazy {
        DigitalWalletTokenServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val transactions: TransactionServiceAsync by lazy {
        TransactionServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val pendingTransactions: PendingTransactionServiceAsync by lazy {
        PendingTransactionServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val declinedTransactions: DeclinedTransactionServiceAsync by lazy {
        DeclinedTransactionServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val accountTransfers: AccountTransferServiceAsync by lazy {
        AccountTransferServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val achTransfers: AchTransferServiceAsync by lazy {
        AchTransferServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val achPrenotifications: AchPrenotificationServiceAsync by lazy {
        AchPrenotificationServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val inboundAchTransfers: InboundAchTransferServiceAsync by lazy {
        InboundAchTransferServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val wireTransfers: WireTransferServiceAsync by lazy {
        WireTransferServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val inboundWireTransfers: InboundWireTransferServiceAsync by lazy {
        InboundWireTransferServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val wireDrawdownRequests: WireDrawdownRequestServiceAsync by lazy {
        WireDrawdownRequestServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val inboundWireDrawdownRequests: InboundWireDrawdownRequestServiceAsync by lazy {
        InboundWireDrawdownRequestServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val checkTransfers: CheckTransferServiceAsync by lazy {
        CheckTransferServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val inboundCheckDeposits: InboundCheckDepositServiceAsync by lazy {
        InboundCheckDepositServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val realTimePaymentsTransfers: RealTimePaymentsTransferServiceAsync by lazy {
        RealTimePaymentsTransferServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val inboundRealTimePaymentsTransfers:
        InboundRealTimePaymentsTransferServiceAsync by lazy {
        InboundRealTimePaymentsTransferServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val checkDeposits: CheckDepositServiceAsync by lazy {
        CheckDepositServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val lockboxes: LockboxServiceAsync by lazy {
        LockboxServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val inboundMailItems: InboundMailItemServiceAsync by lazy {
        InboundMailItemServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val routingNumbers: RoutingNumberServiceAsync by lazy {
        RoutingNumberServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val externalAccounts: ExternalAccountServiceAsync by lazy {
        ExternalAccountServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val entities: EntityServiceAsync by lazy {
        EntityServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val supplementalDocuments: SupplementalDocumentServiceAsync by lazy {
        SupplementalDocumentServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val programs: ProgramServiceAsync by lazy {
        ProgramServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val proofOfAuthorizationRequests: ProofOfAuthorizationRequestServiceAsync by lazy {
        ProofOfAuthorizationRequestServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val proofOfAuthorizationRequestSubmissions:
        ProofOfAuthorizationRequestSubmissionServiceAsync by lazy {
        ProofOfAuthorizationRequestSubmissionServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val accountStatements: AccountStatementServiceAsync by lazy {
        AccountStatementServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val files: FileServiceAsync by lazy { FileServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val documents: DocumentServiceAsync by lazy {
        DocumentServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val exports: ExportServiceAsync by lazy {
        ExportServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val events: EventServiceAsync by lazy {
        EventServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val eventSubscriptions: EventSubscriptionServiceAsync by lazy {
        EventSubscriptionServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val realTimeDecisions: RealTimeDecisionServiceAsync by lazy {
        RealTimeDecisionServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val bookkeepingAccounts: BookkeepingAccountServiceAsync by lazy {
        BookkeepingAccountServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val bookkeepingEntrySets: BookkeepingEntrySetServiceAsync by lazy {
        BookkeepingEntrySetServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val bookkeepingEntries: BookkeepingEntryServiceAsync by lazy {
        BookkeepingEntryServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val groups: GroupServiceAsync by lazy {
        GroupServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val oauthApplications: OAuthApplicationServiceAsync by lazy {
        OAuthApplicationServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val oauthConnections: OAuthConnectionServiceAsync by lazy {
        OAuthConnectionServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val oauthTokens: OAuthTokenServiceAsync by lazy {
        OAuthTokenServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val intrafiAccountEnrollments: IntrafiAccountEnrollmentServiceAsync by lazy {
        IntrafiAccountEnrollmentServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val intrafiBalances: IntrafiBalanceServiceAsync by lazy {
        IntrafiBalanceServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val intrafiExclusions: IntrafiExclusionServiceAsync by lazy {
        IntrafiExclusionServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val realTimePaymentsRequestForPayments:
        RealTimePaymentsRequestForPaymentServiceAsync by lazy {
        RealTimePaymentsRequestForPaymentServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val simulations: SimulationServiceAsync by lazy {
        SimulationServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    override fun sync(): IncreaseClient = sync

    override fun accounts(): AccountServiceAsync = accounts

    override fun accountNumbers(): AccountNumberServiceAsync = accountNumbers

    override fun cards(): CardServiceAsync = cards

    override fun cardPayments(): CardPaymentServiceAsync = cardPayments

    override fun cardPurchaseSupplements(): CardPurchaseSupplementServiceAsync =
        cardPurchaseSupplements

    override fun cardDisputes(): CardDisputeServiceAsync = cardDisputes

    override fun physicalCards(): PhysicalCardServiceAsync = physicalCards

    override fun digitalCardProfiles(): DigitalCardProfileServiceAsync = digitalCardProfiles

    override fun physicalCardProfiles(): PhysicalCardProfileServiceAsync = physicalCardProfiles

    override fun digitalWalletTokens(): DigitalWalletTokenServiceAsync = digitalWalletTokens

    override fun transactions(): TransactionServiceAsync = transactions

    override fun pendingTransactions(): PendingTransactionServiceAsync = pendingTransactions

    override fun declinedTransactions(): DeclinedTransactionServiceAsync = declinedTransactions

    override fun accountTransfers(): AccountTransferServiceAsync = accountTransfers

    override fun achTransfers(): AchTransferServiceAsync = achTransfers

    override fun achPrenotifications(): AchPrenotificationServiceAsync = achPrenotifications

    override fun inboundAchTransfers(): InboundAchTransferServiceAsync = inboundAchTransfers

    override fun wireTransfers(): WireTransferServiceAsync = wireTransfers

    override fun inboundWireTransfers(): InboundWireTransferServiceAsync = inboundWireTransfers

    override fun wireDrawdownRequests(): WireDrawdownRequestServiceAsync = wireDrawdownRequests

    override fun inboundWireDrawdownRequests(): InboundWireDrawdownRequestServiceAsync =
        inboundWireDrawdownRequests

    override fun checkTransfers(): CheckTransferServiceAsync = checkTransfers

    override fun inboundCheckDeposits(): InboundCheckDepositServiceAsync = inboundCheckDeposits

    override fun realTimePaymentsTransfers(): RealTimePaymentsTransferServiceAsync =
        realTimePaymentsTransfers

    override fun inboundRealTimePaymentsTransfers(): InboundRealTimePaymentsTransferServiceAsync =
        inboundRealTimePaymentsTransfers

    override fun checkDeposits(): CheckDepositServiceAsync = checkDeposits

    override fun lockboxes(): LockboxServiceAsync = lockboxes

    override fun inboundMailItems(): InboundMailItemServiceAsync = inboundMailItems

    override fun routingNumbers(): RoutingNumberServiceAsync = routingNumbers

    override fun externalAccounts(): ExternalAccountServiceAsync = externalAccounts

    override fun entities(): EntityServiceAsync = entities

    override fun supplementalDocuments(): SupplementalDocumentServiceAsync = supplementalDocuments

    override fun programs(): ProgramServiceAsync = programs

    override fun proofOfAuthorizationRequests(): ProofOfAuthorizationRequestServiceAsync =
        proofOfAuthorizationRequests

    override fun proofOfAuthorizationRequestSubmissions():
        ProofOfAuthorizationRequestSubmissionServiceAsync = proofOfAuthorizationRequestSubmissions

    override fun accountStatements(): AccountStatementServiceAsync = accountStatements

    override fun files(): FileServiceAsync = files

    override fun documents(): DocumentServiceAsync = documents

    override fun exports(): ExportServiceAsync = exports

    override fun events(): EventServiceAsync = events

    override fun eventSubscriptions(): EventSubscriptionServiceAsync = eventSubscriptions

    override fun realTimeDecisions(): RealTimeDecisionServiceAsync = realTimeDecisions

    override fun bookkeepingAccounts(): BookkeepingAccountServiceAsync = bookkeepingAccounts

    override fun bookkeepingEntrySets(): BookkeepingEntrySetServiceAsync = bookkeepingEntrySets

    override fun bookkeepingEntries(): BookkeepingEntryServiceAsync = bookkeepingEntries

    override fun groups(): GroupServiceAsync = groups

    override fun oauthApplications(): OAuthApplicationServiceAsync = oauthApplications

    override fun oauthConnections(): OAuthConnectionServiceAsync = oauthConnections

    override fun oauthTokens(): OAuthTokenServiceAsync = oauthTokens

    override fun intrafiAccountEnrollments(): IntrafiAccountEnrollmentServiceAsync =
        intrafiAccountEnrollments

    override fun intrafiBalances(): IntrafiBalanceServiceAsync = intrafiBalances

    override fun intrafiExclusions(): IntrafiExclusionServiceAsync = intrafiExclusions

    override fun realTimePaymentsRequestForPayments():
        RealTimePaymentsRequestForPaymentServiceAsync = realTimePaymentsRequestForPayments

    override fun simulations(): SimulationServiceAsync = simulations
}
