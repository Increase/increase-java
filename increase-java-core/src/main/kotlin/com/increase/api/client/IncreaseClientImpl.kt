// File generated from our OpenAPI spec by Stainless.

package com.increase.api.client

import com.increase.api.core.ClientOptions
import com.increase.api.core.http.HttpResponse.Handler
import com.increase.api.errors.IncreaseError
import com.increase.api.models.*
import com.increase.api.services.blocking.*
import com.increase.api.services.errorHandler

class IncreaseClientImpl
constructor(
    private val clientOptions: ClientOptions,
) : IncreaseClient {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val async: IncreaseClientAsync by lazy { IncreaseClientAsyncImpl(clientOptions) }

    private val accounts: AccountService by lazy { AccountServiceImpl(clientOptions) }

    private val accountNumbers: AccountNumberService by lazy {
        AccountNumberServiceImpl(clientOptions)
    }

    private val bookkeepingAccounts: BookkeepingAccountService by lazy {
        BookkeepingAccountServiceImpl(clientOptions)
    }

    private val bookkeepingEntrySets: BookkeepingEntrySetService by lazy {
        BookkeepingEntrySetServiceImpl(clientOptions)
    }

    private val bookkeepingEntries: BookkeepingEntryService by lazy {
        BookkeepingEntryServiceImpl(clientOptions)
    }

    private val realTimeDecisions: RealTimeDecisionService by lazy {
        RealTimeDecisionServiceImpl(clientOptions)
    }

    private val realTimePaymentsTransfers: RealTimePaymentsTransferService by lazy {
        RealTimePaymentsTransferServiceImpl(clientOptions)
    }

    private val balanceLookups: BalanceLookupService by lazy {
        BalanceLookupServiceImpl(clientOptions)
    }

    private val cards: CardService by lazy { CardServiceImpl(clientOptions) }

    private val cardDisputes: CardDisputeService by lazy { CardDisputeServiceImpl(clientOptions) }

    private val cardProfiles: CardProfileService by lazy { CardProfileServiceImpl(clientOptions) }

    private val cardPurchaseSupplements: CardPurchaseSupplementService by lazy {
        CardPurchaseSupplementServiceImpl(clientOptions)
    }

    private val externalAccounts: ExternalAccountService by lazy {
        ExternalAccountServiceImpl(clientOptions)
    }

    private val exports: ExportService by lazy { ExportServiceImpl(clientOptions) }

    private val digitalWalletTokens: DigitalWalletTokenService by lazy {
        DigitalWalletTokenServiceImpl(clientOptions)
    }

    private val transactions: TransactionService by lazy { TransactionServiceImpl(clientOptions) }

    private val pendingTransactions: PendingTransactionService by lazy {
        PendingTransactionServiceImpl(clientOptions)
    }

    private val programs: ProgramService by lazy { ProgramServiceImpl(clientOptions) }

    private val declinedTransactions: DeclinedTransactionService by lazy {
        DeclinedTransactionServiceImpl(clientOptions)
    }

    private val accountTransfers: AccountTransferService by lazy {
        AccountTransferServiceImpl(clientOptions)
    }

    private val achTransfers: AchTransferService by lazy { AchTransferServiceImpl(clientOptions) }

    private val achPrenotifications: AchPrenotificationService by lazy {
        AchPrenotificationServiceImpl(clientOptions)
    }

    private val documents: DocumentService by lazy { DocumentServiceImpl(clientOptions) }

    private val wireTransfers: WireTransferService by lazy {
        WireTransferServiceImpl(clientOptions)
    }

    private val checkTransfers: CheckTransferService by lazy {
        CheckTransferServiceImpl(clientOptions)
    }

    private val entities: EntityService by lazy { EntityServiceImpl(clientOptions) }

    private val inboundAchTransfers: InboundAchTransferService by lazy {
        InboundAchTransferServiceImpl(clientOptions)
    }

    private val inboundWireDrawdownRequests: InboundWireDrawdownRequestService by lazy {
        InboundWireDrawdownRequestServiceImpl(clientOptions)
    }

    private val wireDrawdownRequests: WireDrawdownRequestService by lazy {
        WireDrawdownRequestServiceImpl(clientOptions)
    }

    private val events: EventService by lazy { EventServiceImpl(clientOptions) }

    private val eventSubscriptions: EventSubscriptionService by lazy {
        EventSubscriptionServiceImpl(clientOptions)
    }

    private val files: FileService by lazy { FileServiceImpl(clientOptions) }

    private val groups: GroupService by lazy { GroupServiceImpl(clientOptions) }

    private val oauthConnections: OauthConnectionService by lazy {
        OauthConnectionServiceImpl(clientOptions)
    }

    private val checkDeposits: CheckDepositService by lazy {
        CheckDepositServiceImpl(clientOptions)
    }

    private val routingNumbers: RoutingNumberService by lazy {
        RoutingNumberServiceImpl(clientOptions)
    }

    private val accountStatements: AccountStatementService by lazy {
        AccountStatementServiceImpl(clientOptions)
    }

    private val simulations: SimulationService by lazy { SimulationServiceImpl(clientOptions) }

    private val physicalCards: PhysicalCardService by lazy {
        PhysicalCardServiceImpl(clientOptions)
    }

    private val cardPayments: CardPaymentService by lazy { CardPaymentServiceImpl(clientOptions) }

    override fun async(): IncreaseClientAsync = async

    override fun accounts(): AccountService = accounts

    override fun accountNumbers(): AccountNumberService = accountNumbers

    override fun bookkeepingAccounts(): BookkeepingAccountService = bookkeepingAccounts

    override fun bookkeepingEntrySets(): BookkeepingEntrySetService = bookkeepingEntrySets

    override fun bookkeepingEntries(): BookkeepingEntryService = bookkeepingEntries

    override fun realTimeDecisions(): RealTimeDecisionService = realTimeDecisions

    override fun realTimePaymentsTransfers(): RealTimePaymentsTransferService =
        realTimePaymentsTransfers

    override fun balanceLookups(): BalanceLookupService = balanceLookups

    override fun cards(): CardService = cards

    override fun cardDisputes(): CardDisputeService = cardDisputes

    override fun cardProfiles(): CardProfileService = cardProfiles

    override fun cardPurchaseSupplements(): CardPurchaseSupplementService = cardPurchaseSupplements

    override fun externalAccounts(): ExternalAccountService = externalAccounts

    override fun exports(): ExportService = exports

    override fun digitalWalletTokens(): DigitalWalletTokenService = digitalWalletTokens

    override fun transactions(): TransactionService = transactions

    override fun pendingTransactions(): PendingTransactionService = pendingTransactions

    override fun programs(): ProgramService = programs

    override fun declinedTransactions(): DeclinedTransactionService = declinedTransactions

    override fun accountTransfers(): AccountTransferService = accountTransfers

    override fun achTransfers(): AchTransferService = achTransfers

    override fun achPrenotifications(): AchPrenotificationService = achPrenotifications

    override fun documents(): DocumentService = documents

    override fun wireTransfers(): WireTransferService = wireTransfers

    override fun checkTransfers(): CheckTransferService = checkTransfers

    override fun entities(): EntityService = entities

    override fun inboundAchTransfers(): InboundAchTransferService = inboundAchTransfers

    override fun inboundWireDrawdownRequests(): InboundWireDrawdownRequestService =
        inboundWireDrawdownRequests

    override fun wireDrawdownRequests(): WireDrawdownRequestService = wireDrawdownRequests

    override fun events(): EventService = events

    override fun eventSubscriptions(): EventSubscriptionService = eventSubscriptions

    override fun files(): FileService = files

    override fun groups(): GroupService = groups

    override fun oauthConnections(): OauthConnectionService = oauthConnections

    override fun checkDeposits(): CheckDepositService = checkDeposits

    override fun routingNumbers(): RoutingNumberService = routingNumbers

    override fun accountStatements(): AccountStatementService = accountStatements

    override fun simulations(): SimulationService = simulations

    override fun physicalCards(): PhysicalCardService = physicalCards

    override fun cardPayments(): CardPaymentService = cardPayments
}
