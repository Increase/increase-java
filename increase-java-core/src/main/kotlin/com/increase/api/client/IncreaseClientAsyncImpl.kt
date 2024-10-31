// File generated from our OpenAPI spec by Stainless.

package com.increase.api.client

import com.increase.api.core.ClientOptions
import com.increase.api.core.getPackageVersion
import com.increase.api.models.*
import com.increase.api.services.async.*

class IncreaseClientAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : IncreaseClientAsync {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.containsKey("User-Agent")) clientOptions
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
