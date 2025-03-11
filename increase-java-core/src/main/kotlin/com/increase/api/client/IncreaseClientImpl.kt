// File generated from our OpenAPI spec by Stainless.

package com.increase.api.client

import com.increase.api.core.ClientOptions
import com.increase.api.core.getPackageVersion
import com.increase.api.services.blocking.AccountNumberService
import com.increase.api.services.blocking.AccountNumberServiceImpl
import com.increase.api.services.blocking.AccountService
import com.increase.api.services.blocking.AccountServiceImpl
import com.increase.api.services.blocking.AccountStatementService
import com.increase.api.services.blocking.AccountStatementServiceImpl
import com.increase.api.services.blocking.AccountTransferService
import com.increase.api.services.blocking.AccountTransferServiceImpl
import com.increase.api.services.blocking.AchPrenotificationService
import com.increase.api.services.blocking.AchPrenotificationServiceImpl
import com.increase.api.services.blocking.AchTransferService
import com.increase.api.services.blocking.AchTransferServiceImpl
import com.increase.api.services.blocking.BookkeepingAccountService
import com.increase.api.services.blocking.BookkeepingAccountServiceImpl
import com.increase.api.services.blocking.BookkeepingEntryService
import com.increase.api.services.blocking.BookkeepingEntryServiceImpl
import com.increase.api.services.blocking.BookkeepingEntrySetService
import com.increase.api.services.blocking.BookkeepingEntrySetServiceImpl
import com.increase.api.services.blocking.CardDisputeService
import com.increase.api.services.blocking.CardDisputeServiceImpl
import com.increase.api.services.blocking.CardPaymentService
import com.increase.api.services.blocking.CardPaymentServiceImpl
import com.increase.api.services.blocking.CardPurchaseSupplementService
import com.increase.api.services.blocking.CardPurchaseSupplementServiceImpl
import com.increase.api.services.blocking.CardService
import com.increase.api.services.blocking.CardServiceImpl
import com.increase.api.services.blocking.CheckDepositService
import com.increase.api.services.blocking.CheckDepositServiceImpl
import com.increase.api.services.blocking.CheckTransferService
import com.increase.api.services.blocking.CheckTransferServiceImpl
import com.increase.api.services.blocking.DeclinedTransactionService
import com.increase.api.services.blocking.DeclinedTransactionServiceImpl
import com.increase.api.services.blocking.DigitalCardProfileService
import com.increase.api.services.blocking.DigitalCardProfileServiceImpl
import com.increase.api.services.blocking.DigitalWalletTokenService
import com.increase.api.services.blocking.DigitalWalletTokenServiceImpl
import com.increase.api.services.blocking.DocumentService
import com.increase.api.services.blocking.DocumentServiceImpl
import com.increase.api.services.blocking.EntityService
import com.increase.api.services.blocking.EntityServiceImpl
import com.increase.api.services.blocking.EventService
import com.increase.api.services.blocking.EventServiceImpl
import com.increase.api.services.blocking.EventSubscriptionService
import com.increase.api.services.blocking.EventSubscriptionServiceImpl
import com.increase.api.services.blocking.ExportService
import com.increase.api.services.blocking.ExportServiceImpl
import com.increase.api.services.blocking.ExternalAccountService
import com.increase.api.services.blocking.ExternalAccountServiceImpl
import com.increase.api.services.blocking.FileService
import com.increase.api.services.blocking.FileServiceImpl
import com.increase.api.services.blocking.GroupService
import com.increase.api.services.blocking.GroupServiceImpl
import com.increase.api.services.blocking.InboundAchTransferService
import com.increase.api.services.blocking.InboundAchTransferServiceImpl
import com.increase.api.services.blocking.InboundCheckDepositService
import com.increase.api.services.blocking.InboundCheckDepositServiceImpl
import com.increase.api.services.blocking.InboundMailItemService
import com.increase.api.services.blocking.InboundMailItemServiceImpl
import com.increase.api.services.blocking.InboundRealTimePaymentsTransferService
import com.increase.api.services.blocking.InboundRealTimePaymentsTransferServiceImpl
import com.increase.api.services.blocking.InboundWireDrawdownRequestService
import com.increase.api.services.blocking.InboundWireDrawdownRequestServiceImpl
import com.increase.api.services.blocking.InboundWireTransferService
import com.increase.api.services.blocking.InboundWireTransferServiceImpl
import com.increase.api.services.blocking.IntrafiAccountEnrollmentService
import com.increase.api.services.blocking.IntrafiAccountEnrollmentServiceImpl
import com.increase.api.services.blocking.IntrafiBalanceService
import com.increase.api.services.blocking.IntrafiBalanceServiceImpl
import com.increase.api.services.blocking.IntrafiExclusionService
import com.increase.api.services.blocking.IntrafiExclusionServiceImpl
import com.increase.api.services.blocking.LockboxService
import com.increase.api.services.blocking.LockboxServiceImpl
import com.increase.api.services.blocking.OAuthApplicationService
import com.increase.api.services.blocking.OAuthApplicationServiceImpl
import com.increase.api.services.blocking.OAuthConnectionService
import com.increase.api.services.blocking.OAuthConnectionServiceImpl
import com.increase.api.services.blocking.OAuthTokenService
import com.increase.api.services.blocking.OAuthTokenServiceImpl
import com.increase.api.services.blocking.PendingTransactionService
import com.increase.api.services.blocking.PendingTransactionServiceImpl
import com.increase.api.services.blocking.PhysicalCardProfileService
import com.increase.api.services.blocking.PhysicalCardProfileServiceImpl
import com.increase.api.services.blocking.PhysicalCardService
import com.increase.api.services.blocking.PhysicalCardServiceImpl
import com.increase.api.services.blocking.ProgramService
import com.increase.api.services.blocking.ProgramServiceImpl
import com.increase.api.services.blocking.ProofOfAuthorizationRequestService
import com.increase.api.services.blocking.ProofOfAuthorizationRequestServiceImpl
import com.increase.api.services.blocking.ProofOfAuthorizationRequestSubmissionService
import com.increase.api.services.blocking.ProofOfAuthorizationRequestSubmissionServiceImpl
import com.increase.api.services.blocking.RealTimeDecisionService
import com.increase.api.services.blocking.RealTimeDecisionServiceImpl
import com.increase.api.services.blocking.RealTimePaymentsTransferService
import com.increase.api.services.blocking.RealTimePaymentsTransferServiceImpl
import com.increase.api.services.blocking.RoutingNumberService
import com.increase.api.services.blocking.RoutingNumberServiceImpl
import com.increase.api.services.blocking.SimulationService
import com.increase.api.services.blocking.SimulationServiceImpl
import com.increase.api.services.blocking.SupplementalDocumentService
import com.increase.api.services.blocking.SupplementalDocumentServiceImpl
import com.increase.api.services.blocking.TransactionService
import com.increase.api.services.blocking.TransactionServiceImpl
import com.increase.api.services.blocking.WireDrawdownRequestService
import com.increase.api.services.blocking.WireDrawdownRequestServiceImpl
import com.increase.api.services.blocking.WireTransferService
import com.increase.api.services.blocking.WireTransferServiceImpl

class IncreaseClientImpl(private val clientOptions: ClientOptions) : IncreaseClient {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val async: IncreaseClientAsync by lazy { IncreaseClientAsyncImpl(clientOptions) }

    private val withRawResponse: IncreaseClient.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

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

    private val oauthApplications: OAuthApplicationService by lazy {
        OAuthApplicationServiceImpl(clientOptionsWithUserAgent)
    }

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

    private val simulations: SimulationService by lazy {
        SimulationServiceImpl(clientOptionsWithUserAgent)
    }

    override fun async(): IncreaseClientAsync = async

    override fun withRawResponse(): IncreaseClient.WithRawResponse = withRawResponse

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

    override fun oauthApplications(): OAuthApplicationService = oauthApplications

    override fun oauthConnections(): OAuthConnectionService = oauthConnections

    override fun oauthTokens(): OAuthTokenService = oauthTokens

    override fun intrafiAccountEnrollments(): IntrafiAccountEnrollmentService =
        intrafiAccountEnrollments

    override fun intrafiBalances(): IntrafiBalanceService = intrafiBalances

    override fun intrafiExclusions(): IntrafiExclusionService = intrafiExclusions

    override fun simulations(): SimulationService = simulations

    override fun close() = clientOptions.httpClient.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        IncreaseClient.WithRawResponse {

        private val accounts: AccountService.WithRawResponse by lazy {
            AccountServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val accountNumbers: AccountNumberService.WithRawResponse by lazy {
            AccountNumberServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val cards: CardService.WithRawResponse by lazy {
            CardServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val cardPayments: CardPaymentService.WithRawResponse by lazy {
            CardPaymentServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val cardPurchaseSupplements: CardPurchaseSupplementService.WithRawResponse by lazy {
            CardPurchaseSupplementServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val cardDisputes: CardDisputeService.WithRawResponse by lazy {
            CardDisputeServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val physicalCards: PhysicalCardService.WithRawResponse by lazy {
            PhysicalCardServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val digitalCardProfiles: DigitalCardProfileService.WithRawResponse by lazy {
            DigitalCardProfileServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val physicalCardProfiles: PhysicalCardProfileService.WithRawResponse by lazy {
            PhysicalCardProfileServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val digitalWalletTokens: DigitalWalletTokenService.WithRawResponse by lazy {
            DigitalWalletTokenServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val transactions: TransactionService.WithRawResponse by lazy {
            TransactionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val pendingTransactions: PendingTransactionService.WithRawResponse by lazy {
            PendingTransactionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val declinedTransactions: DeclinedTransactionService.WithRawResponse by lazy {
            DeclinedTransactionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val accountTransfers: AccountTransferService.WithRawResponse by lazy {
            AccountTransferServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val achTransfers: AchTransferService.WithRawResponse by lazy {
            AchTransferServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val achPrenotifications: AchPrenotificationService.WithRawResponse by lazy {
            AchPrenotificationServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val inboundAchTransfers: InboundAchTransferService.WithRawResponse by lazy {
            InboundAchTransferServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val wireTransfers: WireTransferService.WithRawResponse by lazy {
            WireTransferServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val inboundWireTransfers: InboundWireTransferService.WithRawResponse by lazy {
            InboundWireTransferServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val wireDrawdownRequests: WireDrawdownRequestService.WithRawResponse by lazy {
            WireDrawdownRequestServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val inboundWireDrawdownRequests:
            InboundWireDrawdownRequestService.WithRawResponse by lazy {
            InboundWireDrawdownRequestServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val checkTransfers: CheckTransferService.WithRawResponse by lazy {
            CheckTransferServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val inboundCheckDeposits: InboundCheckDepositService.WithRawResponse by lazy {
            InboundCheckDepositServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val realTimePaymentsTransfers:
            RealTimePaymentsTransferService.WithRawResponse by lazy {
            RealTimePaymentsTransferServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val inboundRealTimePaymentsTransfers:
            InboundRealTimePaymentsTransferService.WithRawResponse by lazy {
            InboundRealTimePaymentsTransferServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val checkDeposits: CheckDepositService.WithRawResponse by lazy {
            CheckDepositServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val lockboxes: LockboxService.WithRawResponse by lazy {
            LockboxServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val inboundMailItems: InboundMailItemService.WithRawResponse by lazy {
            InboundMailItemServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val routingNumbers: RoutingNumberService.WithRawResponse by lazy {
            RoutingNumberServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val externalAccounts: ExternalAccountService.WithRawResponse by lazy {
            ExternalAccountServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val entities: EntityService.WithRawResponse by lazy {
            EntityServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val supplementalDocuments: SupplementalDocumentService.WithRawResponse by lazy {
            SupplementalDocumentServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val programs: ProgramService.WithRawResponse by lazy {
            ProgramServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val proofOfAuthorizationRequests:
            ProofOfAuthorizationRequestService.WithRawResponse by lazy {
            ProofOfAuthorizationRequestServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val proofOfAuthorizationRequestSubmissions:
            ProofOfAuthorizationRequestSubmissionService.WithRawResponse by lazy {
            ProofOfAuthorizationRequestSubmissionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val accountStatements: AccountStatementService.WithRawResponse by lazy {
            AccountStatementServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val files: FileService.WithRawResponse by lazy {
            FileServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val documents: DocumentService.WithRawResponse by lazy {
            DocumentServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val exports: ExportService.WithRawResponse by lazy {
            ExportServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val events: EventService.WithRawResponse by lazy {
            EventServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val eventSubscriptions: EventSubscriptionService.WithRawResponse by lazy {
            EventSubscriptionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val realTimeDecisions: RealTimeDecisionService.WithRawResponse by lazy {
            RealTimeDecisionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val bookkeepingAccounts: BookkeepingAccountService.WithRawResponse by lazy {
            BookkeepingAccountServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val bookkeepingEntrySets: BookkeepingEntrySetService.WithRawResponse by lazy {
            BookkeepingEntrySetServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val bookkeepingEntries: BookkeepingEntryService.WithRawResponse by lazy {
            BookkeepingEntryServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val groups: GroupService.WithRawResponse by lazy {
            GroupServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val oauthApplications: OAuthApplicationService.WithRawResponse by lazy {
            OAuthApplicationServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val oauthConnections: OAuthConnectionService.WithRawResponse by lazy {
            OAuthConnectionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val oauthTokens: OAuthTokenService.WithRawResponse by lazy {
            OAuthTokenServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val intrafiAccountEnrollments:
            IntrafiAccountEnrollmentService.WithRawResponse by lazy {
            IntrafiAccountEnrollmentServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val intrafiBalances: IntrafiBalanceService.WithRawResponse by lazy {
            IntrafiBalanceServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val intrafiExclusions: IntrafiExclusionService.WithRawResponse by lazy {
            IntrafiExclusionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val simulations: SimulationService.WithRawResponse by lazy {
            SimulationServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun accounts(): AccountService.WithRawResponse = accounts

        override fun accountNumbers(): AccountNumberService.WithRawResponse = accountNumbers

        override fun cards(): CardService.WithRawResponse = cards

        override fun cardPayments(): CardPaymentService.WithRawResponse = cardPayments

        override fun cardPurchaseSupplements(): CardPurchaseSupplementService.WithRawResponse =
            cardPurchaseSupplements

        override fun cardDisputes(): CardDisputeService.WithRawResponse = cardDisputes

        override fun physicalCards(): PhysicalCardService.WithRawResponse = physicalCards

        override fun digitalCardProfiles(): DigitalCardProfileService.WithRawResponse =
            digitalCardProfiles

        override fun physicalCardProfiles(): PhysicalCardProfileService.WithRawResponse =
            physicalCardProfiles

        override fun digitalWalletTokens(): DigitalWalletTokenService.WithRawResponse =
            digitalWalletTokens

        override fun transactions(): TransactionService.WithRawResponse = transactions

        override fun pendingTransactions(): PendingTransactionService.WithRawResponse =
            pendingTransactions

        override fun declinedTransactions(): DeclinedTransactionService.WithRawResponse =
            declinedTransactions

        override fun accountTransfers(): AccountTransferService.WithRawResponse = accountTransfers

        override fun achTransfers(): AchTransferService.WithRawResponse = achTransfers

        override fun achPrenotifications(): AchPrenotificationService.WithRawResponse =
            achPrenotifications

        override fun inboundAchTransfers(): InboundAchTransferService.WithRawResponse =
            inboundAchTransfers

        override fun wireTransfers(): WireTransferService.WithRawResponse = wireTransfers

        override fun inboundWireTransfers(): InboundWireTransferService.WithRawResponse =
            inboundWireTransfers

        override fun wireDrawdownRequests(): WireDrawdownRequestService.WithRawResponse =
            wireDrawdownRequests

        override fun inboundWireDrawdownRequests():
            InboundWireDrawdownRequestService.WithRawResponse = inboundWireDrawdownRequests

        override fun checkTransfers(): CheckTransferService.WithRawResponse = checkTransfers

        override fun inboundCheckDeposits(): InboundCheckDepositService.WithRawResponse =
            inboundCheckDeposits

        override fun realTimePaymentsTransfers(): RealTimePaymentsTransferService.WithRawResponse =
            realTimePaymentsTransfers

        override fun inboundRealTimePaymentsTransfers():
            InboundRealTimePaymentsTransferService.WithRawResponse =
            inboundRealTimePaymentsTransfers

        override fun checkDeposits(): CheckDepositService.WithRawResponse = checkDeposits

        override fun lockboxes(): LockboxService.WithRawResponse = lockboxes

        override fun inboundMailItems(): InboundMailItemService.WithRawResponse = inboundMailItems

        override fun routingNumbers(): RoutingNumberService.WithRawResponse = routingNumbers

        override fun externalAccounts(): ExternalAccountService.WithRawResponse = externalAccounts

        override fun entities(): EntityService.WithRawResponse = entities

        override fun supplementalDocuments(): SupplementalDocumentService.WithRawResponse =
            supplementalDocuments

        override fun programs(): ProgramService.WithRawResponse = programs

        override fun proofOfAuthorizationRequests():
            ProofOfAuthorizationRequestService.WithRawResponse = proofOfAuthorizationRequests

        override fun proofOfAuthorizationRequestSubmissions():
            ProofOfAuthorizationRequestSubmissionService.WithRawResponse =
            proofOfAuthorizationRequestSubmissions

        override fun accountStatements(): AccountStatementService.WithRawResponse =
            accountStatements

        override fun files(): FileService.WithRawResponse = files

        override fun documents(): DocumentService.WithRawResponse = documents

        override fun exports(): ExportService.WithRawResponse = exports

        override fun events(): EventService.WithRawResponse = events

        override fun eventSubscriptions(): EventSubscriptionService.WithRawResponse =
            eventSubscriptions

        override fun realTimeDecisions(): RealTimeDecisionService.WithRawResponse =
            realTimeDecisions

        override fun bookkeepingAccounts(): BookkeepingAccountService.WithRawResponse =
            bookkeepingAccounts

        override fun bookkeepingEntrySets(): BookkeepingEntrySetService.WithRawResponse =
            bookkeepingEntrySets

        override fun bookkeepingEntries(): BookkeepingEntryService.WithRawResponse =
            bookkeepingEntries

        override fun groups(): GroupService.WithRawResponse = groups

        override fun oauthApplications(): OAuthApplicationService.WithRawResponse =
            oauthApplications

        override fun oauthConnections(): OAuthConnectionService.WithRawResponse = oauthConnections

        override fun oauthTokens(): OAuthTokenService.WithRawResponse = oauthTokens

        override fun intrafiAccountEnrollments(): IntrafiAccountEnrollmentService.WithRawResponse =
            intrafiAccountEnrollments

        override fun intrafiBalances(): IntrafiBalanceService.WithRawResponse = intrafiBalances

        override fun intrafiExclusions(): IntrafiExclusionService.WithRawResponse =
            intrafiExclusions

        override fun simulations(): SimulationService.WithRawResponse = simulations
    }
}
