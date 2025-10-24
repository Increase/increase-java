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
import com.increase.api.services.async.CardPushTransferServiceAsync
import com.increase.api.services.async.CardPushTransferServiceAsyncImpl
import com.increase.api.services.async.CardServiceAsync
import com.increase.api.services.async.CardServiceAsyncImpl
import com.increase.api.services.async.CardTokenServiceAsync
import com.increase.api.services.async.CardTokenServiceAsyncImpl
import com.increase.api.services.async.CardValidationServiceAsync
import com.increase.api.services.async.CardValidationServiceAsyncImpl
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
import com.increase.api.services.async.FednowTransferServiceAsync
import com.increase.api.services.async.FednowTransferServiceAsyncImpl
import com.increase.api.services.async.FileLinkServiceAsync
import com.increase.api.services.async.FileLinkServiceAsyncImpl
import com.increase.api.services.async.FileServiceAsync
import com.increase.api.services.async.FileServiceAsyncImpl
import com.increase.api.services.async.GroupServiceAsync
import com.increase.api.services.async.GroupServiceAsyncImpl
import com.increase.api.services.async.InboundAchTransferServiceAsync
import com.increase.api.services.async.InboundAchTransferServiceAsyncImpl
import com.increase.api.services.async.InboundCheckDepositServiceAsync
import com.increase.api.services.async.InboundCheckDepositServiceAsyncImpl
import com.increase.api.services.async.InboundFednowTransferServiceAsync
import com.increase.api.services.async.InboundFednowTransferServiceAsyncImpl
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
import com.increase.api.services.async.RealTimeDecisionServiceAsync
import com.increase.api.services.async.RealTimeDecisionServiceAsyncImpl
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
import com.increase.api.services.async.WebhookServiceAsync
import com.increase.api.services.async.WebhookServiceAsyncImpl
import com.increase.api.services.async.WireDrawdownRequestServiceAsync
import com.increase.api.services.async.WireDrawdownRequestServiceAsyncImpl
import com.increase.api.services.async.WireTransferServiceAsync
import com.increase.api.services.async.WireTransferServiceAsyncImpl
import java.util.function.Consumer

class IncreaseClientAsyncImpl(private val clientOptions: ClientOptions) : IncreaseClientAsync {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val sync: IncreaseClient by lazy { IncreaseClientImpl(clientOptions) }

    private val withRawResponse: IncreaseClientAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val accounts: AccountServiceAsync by lazy {
        AccountServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val accountNumbers: AccountNumberServiceAsync by lazy {
        AccountNumberServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val accountTransfers: AccountTransferServiceAsync by lazy {
        AccountTransferServiceAsyncImpl(clientOptionsWithUserAgent)
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

    private val fednowTransfers: FednowTransferServiceAsync by lazy {
        FednowTransferServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val inboundFednowTransfers: InboundFednowTransferServiceAsync by lazy {
        InboundFednowTransferServiceAsyncImpl(clientOptionsWithUserAgent)
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

    private val accountStatements: AccountStatementServiceAsync by lazy {
        AccountStatementServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val files: FileServiceAsync by lazy { FileServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val fileLinks: FileLinkServiceAsync by lazy {
        FileLinkServiceAsyncImpl(clientOptionsWithUserAgent)
    }

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

    private val webhooks: WebhookServiceAsync by lazy { WebhookServiceAsyncImpl(clientOptions) }

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

    private val cardTokens: CardTokenServiceAsync by lazy {
        CardTokenServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val cardPushTransfers: CardPushTransferServiceAsync by lazy {
        CardPushTransferServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val cardValidations: CardValidationServiceAsync by lazy {
        CardValidationServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val simulations: SimulationServiceAsync by lazy {
        SimulationServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    override fun sync(): IncreaseClient = sync

    override fun withRawResponse(): IncreaseClientAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): IncreaseClientAsync =
        IncreaseClientAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun accounts(): AccountServiceAsync = accounts

    override fun accountNumbers(): AccountNumberServiceAsync = accountNumbers

    override fun accountTransfers(): AccountTransferServiceAsync = accountTransfers

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

    override fun fednowTransfers(): FednowTransferServiceAsync = fednowTransfers

    override fun inboundFednowTransfers(): InboundFednowTransferServiceAsync =
        inboundFednowTransfers

    override fun checkDeposits(): CheckDepositServiceAsync = checkDeposits

    override fun lockboxes(): LockboxServiceAsync = lockboxes

    override fun inboundMailItems(): InboundMailItemServiceAsync = inboundMailItems

    override fun routingNumbers(): RoutingNumberServiceAsync = routingNumbers

    override fun externalAccounts(): ExternalAccountServiceAsync = externalAccounts

    override fun entities(): EntityServiceAsync = entities

    override fun supplementalDocuments(): SupplementalDocumentServiceAsync = supplementalDocuments

    override fun programs(): ProgramServiceAsync = programs

    override fun accountStatements(): AccountStatementServiceAsync = accountStatements

    override fun files(): FileServiceAsync = files

    override fun fileLinks(): FileLinkServiceAsync = fileLinks

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

    override fun webhooks(): WebhookServiceAsync = webhooks

    override fun cardTokens(): CardTokenServiceAsync = cardTokens

    override fun cardPushTransfers(): CardPushTransferServiceAsync = cardPushTransfers

    override fun cardValidations(): CardValidationServiceAsync = cardValidations

    override fun simulations(): SimulationServiceAsync = simulations

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        IncreaseClientAsync.WithRawResponse {

        private val accounts: AccountServiceAsync.WithRawResponse by lazy {
            AccountServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val accountNumbers: AccountNumberServiceAsync.WithRawResponse by lazy {
            AccountNumberServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val accountTransfers: AccountTransferServiceAsync.WithRawResponse by lazy {
            AccountTransferServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val cards: CardServiceAsync.WithRawResponse by lazy {
            CardServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val cardPayments: CardPaymentServiceAsync.WithRawResponse by lazy {
            CardPaymentServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val cardPurchaseSupplements:
            CardPurchaseSupplementServiceAsync.WithRawResponse by lazy {
            CardPurchaseSupplementServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val cardDisputes: CardDisputeServiceAsync.WithRawResponse by lazy {
            CardDisputeServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val physicalCards: PhysicalCardServiceAsync.WithRawResponse by lazy {
            PhysicalCardServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val digitalCardProfiles: DigitalCardProfileServiceAsync.WithRawResponse by lazy {
            DigitalCardProfileServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val physicalCardProfiles: PhysicalCardProfileServiceAsync.WithRawResponse by lazy {
            PhysicalCardProfileServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val digitalWalletTokens: DigitalWalletTokenServiceAsync.WithRawResponse by lazy {
            DigitalWalletTokenServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val transactions: TransactionServiceAsync.WithRawResponse by lazy {
            TransactionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val pendingTransactions: PendingTransactionServiceAsync.WithRawResponse by lazy {
            PendingTransactionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val declinedTransactions: DeclinedTransactionServiceAsync.WithRawResponse by lazy {
            DeclinedTransactionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val achTransfers: AchTransferServiceAsync.WithRawResponse by lazy {
            AchTransferServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val achPrenotifications: AchPrenotificationServiceAsync.WithRawResponse by lazy {
            AchPrenotificationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val inboundAchTransfers: InboundAchTransferServiceAsync.WithRawResponse by lazy {
            InboundAchTransferServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val wireTransfers: WireTransferServiceAsync.WithRawResponse by lazy {
            WireTransferServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val inboundWireTransfers: InboundWireTransferServiceAsync.WithRawResponse by lazy {
            InboundWireTransferServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val wireDrawdownRequests: WireDrawdownRequestServiceAsync.WithRawResponse by lazy {
            WireDrawdownRequestServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val inboundWireDrawdownRequests:
            InboundWireDrawdownRequestServiceAsync.WithRawResponse by lazy {
            InboundWireDrawdownRequestServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val checkTransfers: CheckTransferServiceAsync.WithRawResponse by lazy {
            CheckTransferServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val inboundCheckDeposits: InboundCheckDepositServiceAsync.WithRawResponse by lazy {
            InboundCheckDepositServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val realTimePaymentsTransfers:
            RealTimePaymentsTransferServiceAsync.WithRawResponse by lazy {
            RealTimePaymentsTransferServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val inboundRealTimePaymentsTransfers:
            InboundRealTimePaymentsTransferServiceAsync.WithRawResponse by lazy {
            InboundRealTimePaymentsTransferServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val fednowTransfers: FednowTransferServiceAsync.WithRawResponse by lazy {
            FednowTransferServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val inboundFednowTransfers:
            InboundFednowTransferServiceAsync.WithRawResponse by lazy {
            InboundFednowTransferServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val checkDeposits: CheckDepositServiceAsync.WithRawResponse by lazy {
            CheckDepositServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val lockboxes: LockboxServiceAsync.WithRawResponse by lazy {
            LockboxServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val inboundMailItems: InboundMailItemServiceAsync.WithRawResponse by lazy {
            InboundMailItemServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val routingNumbers: RoutingNumberServiceAsync.WithRawResponse by lazy {
            RoutingNumberServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val externalAccounts: ExternalAccountServiceAsync.WithRawResponse by lazy {
            ExternalAccountServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val entities: EntityServiceAsync.WithRawResponse by lazy {
            EntityServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val supplementalDocuments:
            SupplementalDocumentServiceAsync.WithRawResponse by lazy {
            SupplementalDocumentServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val programs: ProgramServiceAsync.WithRawResponse by lazy {
            ProgramServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val accountStatements: AccountStatementServiceAsync.WithRawResponse by lazy {
            AccountStatementServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val files: FileServiceAsync.WithRawResponse by lazy {
            FileServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val fileLinks: FileLinkServiceAsync.WithRawResponse by lazy {
            FileLinkServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val documents: DocumentServiceAsync.WithRawResponse by lazy {
            DocumentServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val exports: ExportServiceAsync.WithRawResponse by lazy {
            ExportServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val events: EventServiceAsync.WithRawResponse by lazy {
            EventServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val eventSubscriptions: EventSubscriptionServiceAsync.WithRawResponse by lazy {
            EventSubscriptionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val realTimeDecisions: RealTimeDecisionServiceAsync.WithRawResponse by lazy {
            RealTimeDecisionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val bookkeepingAccounts: BookkeepingAccountServiceAsync.WithRawResponse by lazy {
            BookkeepingAccountServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val bookkeepingEntrySets: BookkeepingEntrySetServiceAsync.WithRawResponse by lazy {
            BookkeepingEntrySetServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val bookkeepingEntries: BookkeepingEntryServiceAsync.WithRawResponse by lazy {
            BookkeepingEntryServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val groups: GroupServiceAsync.WithRawResponse by lazy {
            GroupServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val oauthApplications: OAuthApplicationServiceAsync.WithRawResponse by lazy {
            OAuthApplicationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val oauthConnections: OAuthConnectionServiceAsync.WithRawResponse by lazy {
            OAuthConnectionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val oauthTokens: OAuthTokenServiceAsync.WithRawResponse by lazy {
            OAuthTokenServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val intrafiAccountEnrollments:
            IntrafiAccountEnrollmentServiceAsync.WithRawResponse by lazy {
            IntrafiAccountEnrollmentServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val intrafiBalances: IntrafiBalanceServiceAsync.WithRawResponse by lazy {
            IntrafiBalanceServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val intrafiExclusions: IntrafiExclusionServiceAsync.WithRawResponse by lazy {
            IntrafiExclusionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val cardTokens: CardTokenServiceAsync.WithRawResponse by lazy {
            CardTokenServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val cardPushTransfers: CardPushTransferServiceAsync.WithRawResponse by lazy {
            CardPushTransferServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val cardValidations: CardValidationServiceAsync.WithRawResponse by lazy {
            CardValidationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val simulations: SimulationServiceAsync.WithRawResponse by lazy {
            SimulationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): IncreaseClientAsync.WithRawResponse =
            IncreaseClientAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun accounts(): AccountServiceAsync.WithRawResponse = accounts

        override fun accountNumbers(): AccountNumberServiceAsync.WithRawResponse = accountNumbers

        override fun accountTransfers(): AccountTransferServiceAsync.WithRawResponse =
            accountTransfers

        override fun cards(): CardServiceAsync.WithRawResponse = cards

        override fun cardPayments(): CardPaymentServiceAsync.WithRawResponse = cardPayments

        override fun cardPurchaseSupplements(): CardPurchaseSupplementServiceAsync.WithRawResponse =
            cardPurchaseSupplements

        override fun cardDisputes(): CardDisputeServiceAsync.WithRawResponse = cardDisputes

        override fun physicalCards(): PhysicalCardServiceAsync.WithRawResponse = physicalCards

        override fun digitalCardProfiles(): DigitalCardProfileServiceAsync.WithRawResponse =
            digitalCardProfiles

        override fun physicalCardProfiles(): PhysicalCardProfileServiceAsync.WithRawResponse =
            physicalCardProfiles

        override fun digitalWalletTokens(): DigitalWalletTokenServiceAsync.WithRawResponse =
            digitalWalletTokens

        override fun transactions(): TransactionServiceAsync.WithRawResponse = transactions

        override fun pendingTransactions(): PendingTransactionServiceAsync.WithRawResponse =
            pendingTransactions

        override fun declinedTransactions(): DeclinedTransactionServiceAsync.WithRawResponse =
            declinedTransactions

        override fun achTransfers(): AchTransferServiceAsync.WithRawResponse = achTransfers

        override fun achPrenotifications(): AchPrenotificationServiceAsync.WithRawResponse =
            achPrenotifications

        override fun inboundAchTransfers(): InboundAchTransferServiceAsync.WithRawResponse =
            inboundAchTransfers

        override fun wireTransfers(): WireTransferServiceAsync.WithRawResponse = wireTransfers

        override fun inboundWireTransfers(): InboundWireTransferServiceAsync.WithRawResponse =
            inboundWireTransfers

        override fun wireDrawdownRequests(): WireDrawdownRequestServiceAsync.WithRawResponse =
            wireDrawdownRequests

        override fun inboundWireDrawdownRequests():
            InboundWireDrawdownRequestServiceAsync.WithRawResponse = inboundWireDrawdownRequests

        override fun checkTransfers(): CheckTransferServiceAsync.WithRawResponse = checkTransfers

        override fun inboundCheckDeposits(): InboundCheckDepositServiceAsync.WithRawResponse =
            inboundCheckDeposits

        override fun realTimePaymentsTransfers():
            RealTimePaymentsTransferServiceAsync.WithRawResponse = realTimePaymentsTransfers

        override fun inboundRealTimePaymentsTransfers():
            InboundRealTimePaymentsTransferServiceAsync.WithRawResponse =
            inboundRealTimePaymentsTransfers

        override fun fednowTransfers(): FednowTransferServiceAsync.WithRawResponse = fednowTransfers

        override fun inboundFednowTransfers(): InboundFednowTransferServiceAsync.WithRawResponse =
            inboundFednowTransfers

        override fun checkDeposits(): CheckDepositServiceAsync.WithRawResponse = checkDeposits

        override fun lockboxes(): LockboxServiceAsync.WithRawResponse = lockboxes

        override fun inboundMailItems(): InboundMailItemServiceAsync.WithRawResponse =
            inboundMailItems

        override fun routingNumbers(): RoutingNumberServiceAsync.WithRawResponse = routingNumbers

        override fun externalAccounts(): ExternalAccountServiceAsync.WithRawResponse =
            externalAccounts

        override fun entities(): EntityServiceAsync.WithRawResponse = entities

        override fun supplementalDocuments(): SupplementalDocumentServiceAsync.WithRawResponse =
            supplementalDocuments

        override fun programs(): ProgramServiceAsync.WithRawResponse = programs

        override fun accountStatements(): AccountStatementServiceAsync.WithRawResponse =
            accountStatements

        override fun files(): FileServiceAsync.WithRawResponse = files

        override fun fileLinks(): FileLinkServiceAsync.WithRawResponse = fileLinks

        override fun documents(): DocumentServiceAsync.WithRawResponse = documents

        override fun exports(): ExportServiceAsync.WithRawResponse = exports

        override fun events(): EventServiceAsync.WithRawResponse = events

        override fun eventSubscriptions(): EventSubscriptionServiceAsync.WithRawResponse =
            eventSubscriptions

        override fun realTimeDecisions(): RealTimeDecisionServiceAsync.WithRawResponse =
            realTimeDecisions

        override fun bookkeepingAccounts(): BookkeepingAccountServiceAsync.WithRawResponse =
            bookkeepingAccounts

        override fun bookkeepingEntrySets(): BookkeepingEntrySetServiceAsync.WithRawResponse =
            bookkeepingEntrySets

        override fun bookkeepingEntries(): BookkeepingEntryServiceAsync.WithRawResponse =
            bookkeepingEntries

        override fun groups(): GroupServiceAsync.WithRawResponse = groups

        override fun oauthApplications(): OAuthApplicationServiceAsync.WithRawResponse =
            oauthApplications

        override fun oauthConnections(): OAuthConnectionServiceAsync.WithRawResponse =
            oauthConnections

        override fun oauthTokens(): OAuthTokenServiceAsync.WithRawResponse = oauthTokens

        override fun intrafiAccountEnrollments():
            IntrafiAccountEnrollmentServiceAsync.WithRawResponse = intrafiAccountEnrollments

        override fun intrafiBalances(): IntrafiBalanceServiceAsync.WithRawResponse = intrafiBalances

        override fun intrafiExclusions(): IntrafiExclusionServiceAsync.WithRawResponse =
            intrafiExclusions

        override fun cardTokens(): CardTokenServiceAsync.WithRawResponse = cardTokens

        override fun cardPushTransfers(): CardPushTransferServiceAsync.WithRawResponse =
            cardPushTransfers

        override fun cardValidations(): CardValidationServiceAsync.WithRawResponse = cardValidations

        override fun simulations(): SimulationServiceAsync.WithRawResponse = simulations
    }
}
