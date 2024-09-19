// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

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
import com.increase.api.services.binaryHandler
import com.increase.api.services.withErrorHandler

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

    fun oauthConnections(): OAuthConnectionService

    fun oauthTokens(): OAuthTokenService

    fun intrafiAccountEnrollments(): IntrafiAccountEnrollmentService

    fun intrafiBalances(): IntrafiBalanceService

    fun intrafiExclusions(): IntrafiExclusionService

    fun realTimePaymentsRequestForPayments(): RealTimePaymentsRequestForPaymentService

    fun simulations(): SimulationService
}
