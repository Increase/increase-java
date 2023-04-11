package com.increase.api.client

import java.time.Duration
import java.util.Base64
import java.util.Optional
import java.util.concurrent.CompletableFuture
import com.increase.api.core.ClientOptions
import com.increase.api.core.http.HttpMethod
import com.increase.api.core.http.HttpRequest
import com.increase.api.core.http.HttpResponse.Handler
import com.increase.api.core.JsonField
import com.increase.api.core.RequestOptions
import com.increase.api.errors.IncreaseError
import com.increase.api.errors.IncreaseInvalidDataException
import com.increase.api.models.*
import com.increase.api.services.blocking.*
import com.increase.api.services.emptyHandler
import com.increase.api.services.errorHandler
import com.increase.api.services.json
import com.increase.api.services.jsonHandler
import com.increase.api.services.stringHandler
import com.increase.api.services.withErrorHandler

class IncreaseClientImpl constructor(private val clientOptions: ClientOptions,) : IncreaseClient {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val accounts: AccountService by lazy { AccountServiceImpl(clientOptions) }

    private val accountNumbers: AccountNumberService by lazy { AccountNumberServiceImpl(clientOptions) }

    private val realTimeDecisions: RealTimeDecisionService by lazy { RealTimeDecisionServiceImpl(clientOptions) }

    private val cards: CardService by lazy { CardServiceImpl(clientOptions) }

    private val cardDisputes: CardDisputeService by lazy { CardDisputeServiceImpl(clientOptions) }

    private val cardProfiles: CardProfileService by lazy { CardProfileServiceImpl(clientOptions) }

    private val externalAccounts: ExternalAccountService by lazy { ExternalAccountServiceImpl(clientOptions) }

    private val digitalWalletTokens: DigitalWalletTokenService by lazy { DigitalWalletTokenServiceImpl(clientOptions) }

    private val transactions: TransactionService by lazy { TransactionServiceImpl(clientOptions) }

    private val pendingTransactions: PendingTransactionService by lazy { PendingTransactionServiceImpl(clientOptions) }

    private val declinedTransactions: DeclinedTransactionService by lazy { DeclinedTransactionServiceImpl(clientOptions) }

    private val limits: LimitService by lazy { LimitServiceImpl(clientOptions) }

    private val accountTransfers: AccountTransferService by lazy { AccountTransferServiceImpl(clientOptions) }

    private val achTransfers: AchTransferService by lazy { AchTransferServiceImpl(clientOptions) }

    private val inboundAchTransferReturns: InboundAchTransferReturnService by lazy { InboundAchTransferReturnServiceImpl(clientOptions) }

    private val achPrenotifications: AchPrenotificationService by lazy { AchPrenotificationServiceImpl(clientOptions) }

    private val documents: DocumentService by lazy { DocumentServiceImpl(clientOptions) }

    private val wireTransfers: WireTransferService by lazy { WireTransferServiceImpl(clientOptions) }

    private val checkTransfers: CheckTransferService by lazy { CheckTransferServiceImpl(clientOptions) }

    private val entities: EntityService by lazy { EntityServiceImpl(clientOptions) }

    private val inboundWireDrawdownRequests: InboundWireDrawdownRequestService by lazy { InboundWireDrawdownRequestServiceImpl(clientOptions) }

    private val wireDrawdownRequests: WireDrawdownRequestService by lazy { WireDrawdownRequestServiceImpl(clientOptions) }

    private val events: EventService by lazy { EventServiceImpl(clientOptions) }

    private val eventSubscriptions: EventSubscriptionService by lazy { EventSubscriptionServiceImpl(clientOptions) }

    private val files: FileService by lazy { FileServiceImpl(clientOptions) }

    private val groups: GroupService by lazy { GroupServiceImpl(clientOptions) }

    private val oauthConnections: OauthConnectionService by lazy { OauthConnectionServiceImpl(clientOptions) }

    private val checkDeposits: CheckDepositService by lazy { CheckDepositServiceImpl(clientOptions) }

    private val routingNumbers: RoutingNumberService by lazy { RoutingNumberServiceImpl(clientOptions) }

    private val accountStatements: AccountStatementService by lazy { AccountStatementServiceImpl(clientOptions) }

    private val simulations: SimulationService by lazy { SimulationServiceImpl(clientOptions) }

    override fun accounts(): AccountService = accounts

    override fun accountNumbers(): AccountNumberService = accountNumbers

    override fun realTimeDecisions(): RealTimeDecisionService = realTimeDecisions

    override fun cards(): CardService = cards

    override fun cardDisputes(): CardDisputeService = cardDisputes

    override fun cardProfiles(): CardProfileService = cardProfiles

    override fun externalAccounts(): ExternalAccountService = externalAccounts

    override fun digitalWalletTokens(): DigitalWalletTokenService = digitalWalletTokens

    override fun transactions(): TransactionService = transactions

    override fun pendingTransactions(): PendingTransactionService = pendingTransactions

    override fun declinedTransactions(): DeclinedTransactionService = declinedTransactions

    override fun limits(): LimitService = limits

    override fun accountTransfers(): AccountTransferService = accountTransfers

    override fun achTransfers(): AchTransferService = achTransfers

    override fun inboundAchTransferReturns(): InboundAchTransferReturnService = inboundAchTransferReturns

    override fun achPrenotifications(): AchPrenotificationService = achPrenotifications

    override fun documents(): DocumentService = documents

    override fun wireTransfers(): WireTransferService = wireTransfers

    override fun checkTransfers(): CheckTransferService = checkTransfers

    override fun entities(): EntityService = entities

    override fun inboundWireDrawdownRequests(): InboundWireDrawdownRequestService = inboundWireDrawdownRequests

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
}
