// File generated from our OpenAPI spec by Stainless.

package com.increase.api.client

import com.increase.api.core.ClientOptions
import com.increase.api.core.getPackageVersion
import com.increase.api.services.blocking.*

class IncreaseClientImpl
constructor(
    private val clientOptions: ClientOptions,
) : IncreaseClient {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val async: IncreaseClientAsync by lazy { IncreaseClientAsyncImpl(clientOptions) }

    private val accounts: AccountService by lazy { AccountServiceImpl(clientOptionsWithUserAgent) }

    private val accountNumbers: AccountNumberService by lazy {
        AccountNumberServiceImpl(clientOptionsWithUserAgent)
    }

    private val cards: CardService by lazy { CardServiceImpl(clientOptionsWithUserAgent) }

    private val cardPayments: CardPaymentService by lazy {
        CardPaymentServiceImpl(clientOptionsWithUserAgent)
    }

    private val cardPurchaseSupplements: CardPurchaseSupplementService by lazy {
        CardPurchaseSupplementServiceImpl(clientOptionsWithUserAgent)
    }

    private val cardDisputes: CardDisputeService by lazy {
        CardDisputeServiceImpl(clientOptionsWithUserAgent)
    }

    private val physicalCards: PhysicalCardService by lazy {
        PhysicalCardServiceImpl(clientOptionsWithUserAgent)
    }

    private val digitalCardProfiles: DigitalCardProfileService by lazy {
        DigitalCardProfileServiceImpl(clientOptionsWithUserAgent)
    }

    private val physicalCardProfiles: PhysicalCardProfileService by lazy {
        PhysicalCardProfileServiceImpl(clientOptionsWithUserAgent)
    }

    private val digitalWalletTokens: DigitalWalletTokenService by lazy {
        DigitalWalletTokenServiceImpl(clientOptionsWithUserAgent)
    }

    private val transactions: TransactionService by lazy {
        TransactionServiceImpl(clientOptionsWithUserAgent)
    }

    private val pendingTransactions: PendingTransactionService by lazy {
        PendingTransactionServiceImpl(clientOptionsWithUserAgent)
    }

    private val declinedTransactions: DeclinedTransactionService by lazy {
        DeclinedTransactionServiceImpl(clientOptionsWithUserAgent)
    }

    private val accountTransfers: AccountTransferService by lazy {
        AccountTransferServiceImpl(clientOptionsWithUserAgent)
    }

    private val achTransfers: AchTransferService by lazy {
        AchTransferServiceImpl(clientOptionsWithUserAgent)
    }

    private val achPrenotifications: AchPrenotificationService by lazy {
        AchPrenotificationServiceImpl(clientOptionsWithUserAgent)
    }

    private val inboundAchTransfers: InboundAchTransferService by lazy {
        InboundAchTransferServiceImpl(clientOptionsWithUserAgent)
    }

    private val wireTransfers: WireTransferService by lazy {
        WireTransferServiceImpl(clientOptionsWithUserAgent)
    }

    private val inboundWireTransfers: InboundWireTransferService by lazy {
        InboundWireTransferServiceImpl(clientOptionsWithUserAgent)
    }

    private val wireDrawdownRequests: WireDrawdownRequestService by lazy {
        WireDrawdownRequestServiceImpl(clientOptionsWithUserAgent)
    }

    private val inboundWireDrawdownRequests: InboundWireDrawdownRequestService by lazy {
        InboundWireDrawdownRequestServiceImpl(clientOptionsWithUserAgent)
    }

    private val checkTransfers: CheckTransferService by lazy {
        CheckTransferServiceImpl(clientOptionsWithUserAgent)
    }

    private val inboundCheckDeposits: InboundCheckDepositService by lazy {
        InboundCheckDepositServiceImpl(clientOptionsWithUserAgent)
    }

    private val realTimePaymentsTransfers: RealTimePaymentsTransferService by lazy {
        RealTimePaymentsTransferServiceImpl(clientOptionsWithUserAgent)
    }

    private val inboundRealTimePaymentsTransfers: InboundRealTimePaymentsTransferService by lazy {
        InboundRealTimePaymentsTransferServiceImpl(clientOptionsWithUserAgent)
    }

    private val checkDeposits: CheckDepositService by lazy {
        CheckDepositServiceImpl(clientOptionsWithUserAgent)
    }

    private val lockboxes: LockboxService by lazy { LockboxServiceImpl(clientOptionsWithUserAgent) }

    private val inboundMailItems: InboundMailItemService by lazy {
        InboundMailItemServiceImpl(clientOptionsWithUserAgent)
    }

    private val routingNumbers: RoutingNumberService by lazy {
        RoutingNumberServiceImpl(clientOptionsWithUserAgent)
    }

    private val externalAccounts: ExternalAccountService by lazy {
        ExternalAccountServiceImpl(clientOptionsWithUserAgent)
    }

    private val entities: EntityService by lazy { EntityServiceImpl(clientOptionsWithUserAgent) }

    private val supplementalDocuments: SupplementalDocumentService by lazy {
        SupplementalDocumentServiceImpl(clientOptionsWithUserAgent)
    }

    private val programs: ProgramService by lazy { ProgramServiceImpl(clientOptionsWithUserAgent) }

    private val proofOfAuthorizationRequests: ProofOfAuthorizationRequestService by lazy {
        ProofOfAuthorizationRequestServiceImpl(clientOptionsWithUserAgent)
    }

    private val proofOfAuthorizationRequestSubmissions:
        ProofOfAuthorizationRequestSubmissionService by lazy {
        ProofOfAuthorizationRequestSubmissionServiceImpl(clientOptionsWithUserAgent)
    }

    private val accountStatements: AccountStatementService by lazy {
        AccountStatementServiceImpl(clientOptionsWithUserAgent)
    }

    private val files: FileService by lazy { FileServiceImpl(clientOptionsWithUserAgent) }

    private val documents: DocumentService by lazy {
        DocumentServiceImpl(clientOptionsWithUserAgent)
    }

    private val exports: ExportService by lazy { ExportServiceImpl(clientOptionsWithUserAgent) }

    private val events: EventService by lazy { EventServiceImpl(clientOptionsWithUserAgent) }

    private val eventSubscriptions: EventSubscriptionService by lazy {
        EventSubscriptionServiceImpl(clientOptionsWithUserAgent)
    }

    private val realTimeDecisions: RealTimeDecisionService by lazy {
        RealTimeDecisionServiceImpl(clientOptionsWithUserAgent)
    }

    private val bookkeepingAccounts: BookkeepingAccountService by lazy {
        BookkeepingAccountServiceImpl(clientOptionsWithUserAgent)
    }

    private val bookkeepingEntrySets: BookkeepingEntrySetService by lazy {
        BookkeepingEntrySetServiceImpl(clientOptionsWithUserAgent)
    }

    private val bookkeepingEntries: BookkeepingEntryService by lazy {
        BookkeepingEntryServiceImpl(clientOptionsWithUserAgent)
    }

    private val groups: GroupService by lazy { GroupServiceImpl(clientOptionsWithUserAgent) }

    private val oauthConnections: OAuthConnectionService by lazy {
        OAuthConnectionServiceImpl(clientOptionsWithUserAgent)
    }

    private val oauthTokens: OAuthTokenService by lazy {
        OAuthTokenServiceImpl(clientOptionsWithUserAgent)
    }

    private val intrafiAccountEnrollments: IntrafiAccountEnrollmentService by lazy {
        IntrafiAccountEnrollmentServiceImpl(clientOptionsWithUserAgent)
    }

    private val intrafiBalances: IntrafiBalanceService by lazy {
        IntrafiBalanceServiceImpl(clientOptionsWithUserAgent)
    }

    private val intrafiExclusions: IntrafiExclusionService by lazy {
        IntrafiExclusionServiceImpl(clientOptionsWithUserAgent)
    }

    private val realTimePaymentsRequestForPayments:
        RealTimePaymentsRequestForPaymentService by lazy {
        RealTimePaymentsRequestForPaymentServiceImpl(clientOptionsWithUserAgent)
    }

    private val webhooks: WebhookService by lazy { WebhookServiceImpl(clientOptionsWithUserAgent) }

    private val simulations: SimulationService by lazy {
        SimulationServiceImpl(clientOptionsWithUserAgent)
    }

    override fun async(): IncreaseClientAsync = async

    override fun accounts(): AccountService = accounts

    override fun accountNumbers(): AccountNumberService = accountNumbers

    override fun cards(): CardService = cards

    override fun cardPayments(): CardPaymentService = cardPayments

    override fun cardPurchaseSupplements(): CardPurchaseSupplementService = cardPurchaseSupplements

    override fun cardDisputes(): CardDisputeService = cardDisputes

    override fun physicalCards(): PhysicalCardService = physicalCards

    override fun digitalCardProfiles(): DigitalCardProfileService = digitalCardProfiles

    override fun physicalCardProfiles(): PhysicalCardProfileService = physicalCardProfiles

    override fun digitalWalletTokens(): DigitalWalletTokenService = digitalWalletTokens

    override fun transactions(): TransactionService = transactions

    override fun pendingTransactions(): PendingTransactionService = pendingTransactions

    override fun declinedTransactions(): DeclinedTransactionService = declinedTransactions

    override fun accountTransfers(): AccountTransferService = accountTransfers

    override fun achTransfers(): AchTransferService = achTransfers

    override fun achPrenotifications(): AchPrenotificationService = achPrenotifications

    override fun inboundAchTransfers(): InboundAchTransferService = inboundAchTransfers

    override fun wireTransfers(): WireTransferService = wireTransfers

    override fun inboundWireTransfers(): InboundWireTransferService = inboundWireTransfers

    override fun wireDrawdownRequests(): WireDrawdownRequestService = wireDrawdownRequests

    override fun inboundWireDrawdownRequests(): InboundWireDrawdownRequestService =
        inboundWireDrawdownRequests

    override fun checkTransfers(): CheckTransferService = checkTransfers

    override fun inboundCheckDeposits(): InboundCheckDepositService = inboundCheckDeposits

    override fun realTimePaymentsTransfers(): RealTimePaymentsTransferService =
        realTimePaymentsTransfers

    override fun inboundRealTimePaymentsTransfers(): InboundRealTimePaymentsTransferService =
        inboundRealTimePaymentsTransfers

    override fun checkDeposits(): CheckDepositService = checkDeposits

    override fun lockboxes(): LockboxService = lockboxes

    override fun inboundMailItems(): InboundMailItemService = inboundMailItems

    override fun routingNumbers(): RoutingNumberService = routingNumbers

    override fun externalAccounts(): ExternalAccountService = externalAccounts

    override fun entities(): EntityService = entities

    override fun supplementalDocuments(): SupplementalDocumentService = supplementalDocuments

    override fun programs(): ProgramService = programs

    override fun proofOfAuthorizationRequests(): ProofOfAuthorizationRequestService =
        proofOfAuthorizationRequests

    override fun proofOfAuthorizationRequestSubmissions():
        ProofOfAuthorizationRequestSubmissionService = proofOfAuthorizationRequestSubmissions

    override fun accountStatements(): AccountStatementService = accountStatements

    override fun files(): FileService = files

    override fun documents(): DocumentService = documents

    override fun exports(): ExportService = exports

    override fun events(): EventService = events

    override fun eventSubscriptions(): EventSubscriptionService = eventSubscriptions

    override fun realTimeDecisions(): RealTimeDecisionService = realTimeDecisions

    override fun bookkeepingAccounts(): BookkeepingAccountService = bookkeepingAccounts

    override fun bookkeepingEntrySets(): BookkeepingEntrySetService = bookkeepingEntrySets

    override fun bookkeepingEntries(): BookkeepingEntryService = bookkeepingEntries

    override fun groups(): GroupService = groups

    override fun oauthConnections(): OAuthConnectionService = oauthConnections

    override fun oauthTokens(): OAuthTokenService = oauthTokens

    override fun intrafiAccountEnrollments(): IntrafiAccountEnrollmentService =
        intrafiAccountEnrollments

    override fun intrafiBalances(): IntrafiBalanceService = intrafiBalances

    override fun intrafiExclusions(): IntrafiExclusionService = intrafiExclusions

    override fun realTimePaymentsRequestForPayments(): RealTimePaymentsRequestForPaymentService =
        realTimePaymentsRequestForPayments

    override fun webhooks(): WebhookService = webhooks

    override fun simulations(): SimulationService = simulations
}
