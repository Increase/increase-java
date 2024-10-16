// File generated from our OpenAPI spec by Stainless.

package com.increase.api.client

import com.increase.api.core.ClientOptions
import com.increase.api.core.handlers.errorHandler
import com.increase.api.core.http.HttpResponse.Handler
import com.increase.api.errors.IncreaseError
import com.increase.api.models.*
import com.increase.api.services.async.*

class IncreaseClientAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : IncreaseClientAsync {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val sync: IncreaseClient by lazy { IncreaseClientImpl(clientOptions) }

    private val accounts: AccountServiceAsync by lazy { AccountServiceAsyncImpl(clientOptions) }

    private val accountNumbers: AccountNumberServiceAsync by lazy {
        AccountNumberServiceAsyncImpl(clientOptions)
    }

    private val cards: CardServiceAsync by lazy { CardServiceAsyncImpl(clientOptions) }

    private val cardPayments: CardPaymentServiceAsync by lazy {
        CardPaymentServiceAsyncImpl(clientOptions)
    }

    private val cardPurchaseSupplements: CardPurchaseSupplementServiceAsync by lazy {
        CardPurchaseSupplementServiceAsyncImpl(clientOptions)
    }

    private val cardDisputes: CardDisputeServiceAsync by lazy {
        CardDisputeServiceAsyncImpl(clientOptions)
    }

    private val physicalCards: PhysicalCardServiceAsync by lazy {
        PhysicalCardServiceAsyncImpl(clientOptions)
    }

    private val digitalCardProfiles: DigitalCardProfileServiceAsync by lazy {
        DigitalCardProfileServiceAsyncImpl(clientOptions)
    }

    private val physicalCardProfiles: PhysicalCardProfileServiceAsync by lazy {
        PhysicalCardProfileServiceAsyncImpl(clientOptions)
    }

    private val digitalWalletTokens: DigitalWalletTokenServiceAsync by lazy {
        DigitalWalletTokenServiceAsyncImpl(clientOptions)
    }

    private val transactions: TransactionServiceAsync by lazy {
        TransactionServiceAsyncImpl(clientOptions)
    }

    private val pendingTransactions: PendingTransactionServiceAsync by lazy {
        PendingTransactionServiceAsyncImpl(clientOptions)
    }

    private val declinedTransactions: DeclinedTransactionServiceAsync by lazy {
        DeclinedTransactionServiceAsyncImpl(clientOptions)
    }

    private val accountTransfers: AccountTransferServiceAsync by lazy {
        AccountTransferServiceAsyncImpl(clientOptions)
    }

    private val achTransfers: AchTransferServiceAsync by lazy {
        AchTransferServiceAsyncImpl(clientOptions)
    }

    private val achPrenotifications: AchPrenotificationServiceAsync by lazy {
        AchPrenotificationServiceAsyncImpl(clientOptions)
    }

    private val inboundAchTransfers: InboundAchTransferServiceAsync by lazy {
        InboundAchTransferServiceAsyncImpl(clientOptions)
    }

    private val wireTransfers: WireTransferServiceAsync by lazy {
        WireTransferServiceAsyncImpl(clientOptions)
    }

    private val inboundWireTransfers: InboundWireTransferServiceAsync by lazy {
        InboundWireTransferServiceAsyncImpl(clientOptions)
    }

    private val wireDrawdownRequests: WireDrawdownRequestServiceAsync by lazy {
        WireDrawdownRequestServiceAsyncImpl(clientOptions)
    }

    private val inboundWireDrawdownRequests: InboundWireDrawdownRequestServiceAsync by lazy {
        InboundWireDrawdownRequestServiceAsyncImpl(clientOptions)
    }

    private val checkTransfers: CheckTransferServiceAsync by lazy {
        CheckTransferServiceAsyncImpl(clientOptions)
    }

    private val inboundCheckDeposits: InboundCheckDepositServiceAsync by lazy {
        InboundCheckDepositServiceAsyncImpl(clientOptions)
    }

    private val realTimePaymentsTransfers: RealTimePaymentsTransferServiceAsync by lazy {
        RealTimePaymentsTransferServiceAsyncImpl(clientOptions)
    }

    private val inboundRealTimePaymentsTransfers:
        InboundRealTimePaymentsTransferServiceAsync by lazy {
        InboundRealTimePaymentsTransferServiceAsyncImpl(clientOptions)
    }

    private val checkDeposits: CheckDepositServiceAsync by lazy {
        CheckDepositServiceAsyncImpl(clientOptions)
    }

    private val lockboxes: LockboxServiceAsync by lazy { LockboxServiceAsyncImpl(clientOptions) }

    private val inboundMailItems: InboundMailItemServiceAsync by lazy {
        InboundMailItemServiceAsyncImpl(clientOptions)
    }

    private val routingNumbers: RoutingNumberServiceAsync by lazy {
        RoutingNumberServiceAsyncImpl(clientOptions)
    }

    private val externalAccounts: ExternalAccountServiceAsync by lazy {
        ExternalAccountServiceAsyncImpl(clientOptions)
    }

    private val entities: EntityServiceAsync by lazy { EntityServiceAsyncImpl(clientOptions) }

    private val supplementalDocuments: SupplementalDocumentServiceAsync by lazy {
        SupplementalDocumentServiceAsyncImpl(clientOptions)
    }

    private val programs: ProgramServiceAsync by lazy { ProgramServiceAsyncImpl(clientOptions) }

    private val proofOfAuthorizationRequests: ProofOfAuthorizationRequestServiceAsync by lazy {
        ProofOfAuthorizationRequestServiceAsyncImpl(clientOptions)
    }

    private val proofOfAuthorizationRequestSubmissions:
        ProofOfAuthorizationRequestSubmissionServiceAsync by lazy {
        ProofOfAuthorizationRequestSubmissionServiceAsyncImpl(clientOptions)
    }

    private val accountStatements: AccountStatementServiceAsync by lazy {
        AccountStatementServiceAsyncImpl(clientOptions)
    }

    private val files: FileServiceAsync by lazy { FileServiceAsyncImpl(clientOptions) }

    private val documents: DocumentServiceAsync by lazy { DocumentServiceAsyncImpl(clientOptions) }

    private val exports: ExportServiceAsync by lazy { ExportServiceAsyncImpl(clientOptions) }

    private val events: EventServiceAsync by lazy { EventServiceAsyncImpl(clientOptions) }

    private val eventSubscriptions: EventSubscriptionServiceAsync by lazy {
        EventSubscriptionServiceAsyncImpl(clientOptions)
    }

    private val realTimeDecisions: RealTimeDecisionServiceAsync by lazy {
        RealTimeDecisionServiceAsyncImpl(clientOptions)
    }

    private val bookkeepingAccounts: BookkeepingAccountServiceAsync by lazy {
        BookkeepingAccountServiceAsyncImpl(clientOptions)
    }

    private val bookkeepingEntrySets: BookkeepingEntrySetServiceAsync by lazy {
        BookkeepingEntrySetServiceAsyncImpl(clientOptions)
    }

    private val bookkeepingEntries: BookkeepingEntryServiceAsync by lazy {
        BookkeepingEntryServiceAsyncImpl(clientOptions)
    }

    private val groups: GroupServiceAsync by lazy { GroupServiceAsyncImpl(clientOptions) }

    private val oauthConnections: OAuthConnectionServiceAsync by lazy {
        OAuthConnectionServiceAsyncImpl(clientOptions)
    }

    private val oauthTokens: OAuthTokenServiceAsync by lazy {
        OAuthTokenServiceAsyncImpl(clientOptions)
    }

    private val intrafiAccountEnrollments: IntrafiAccountEnrollmentServiceAsync by lazy {
        IntrafiAccountEnrollmentServiceAsyncImpl(clientOptions)
    }

    private val intrafiBalances: IntrafiBalanceServiceAsync by lazy {
        IntrafiBalanceServiceAsyncImpl(clientOptions)
    }

    private val intrafiExclusions: IntrafiExclusionServiceAsync by lazy {
        IntrafiExclusionServiceAsyncImpl(clientOptions)
    }

    private val realTimePaymentsRequestForPayments:
        RealTimePaymentsRequestForPaymentServiceAsync by lazy {
        RealTimePaymentsRequestForPaymentServiceAsyncImpl(clientOptions)
    }

    private val simulations: SimulationServiceAsync by lazy {
        SimulationServiceAsyncImpl(clientOptions)
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
