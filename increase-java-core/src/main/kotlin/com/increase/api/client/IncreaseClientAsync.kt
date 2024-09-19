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
import com.increase.api.services.async.*
import com.increase.api.services.emptyHandler
import com.increase.api.services.errorHandler
import com.increase.api.services.json
import com.increase.api.services.jsonHandler
import com.increase.api.services.stringHandler
import com.increase.api.services.binaryHandler
import com.increase.api.services.withErrorHandler

interface IncreaseClientAsync {

    fun sync(): IncreaseClient

    fun accounts(): AccountServiceAsync

    fun accountNumbers(): AccountNumberServiceAsync

    fun cards(): CardServiceAsync

    fun cardPayments(): CardPaymentServiceAsync

    fun cardPurchaseSupplements(): CardPurchaseSupplementServiceAsync

    fun cardDisputes(): CardDisputeServiceAsync

    fun physicalCards(): PhysicalCardServiceAsync

    fun digitalCardProfiles(): DigitalCardProfileServiceAsync

    fun physicalCardProfiles(): PhysicalCardProfileServiceAsync

    fun digitalWalletTokens(): DigitalWalletTokenServiceAsync

    fun transactions(): TransactionServiceAsync

    fun pendingTransactions(): PendingTransactionServiceAsync

    fun declinedTransactions(): DeclinedTransactionServiceAsync

    fun accountTransfers(): AccountTransferServiceAsync

    fun achTransfers(): AchTransferServiceAsync

    fun achPrenotifications(): AchPrenotificationServiceAsync

    fun inboundAchTransfers(): InboundAchTransferServiceAsync

    fun wireTransfers(): WireTransferServiceAsync

    fun inboundWireTransfers(): InboundWireTransferServiceAsync

    fun wireDrawdownRequests(): WireDrawdownRequestServiceAsync

    fun inboundWireDrawdownRequests(): InboundWireDrawdownRequestServiceAsync

    fun checkTransfers(): CheckTransferServiceAsync

    fun inboundCheckDeposits(): InboundCheckDepositServiceAsync

    fun realTimePaymentsTransfers(): RealTimePaymentsTransferServiceAsync

    fun inboundRealTimePaymentsTransfers(): InboundRealTimePaymentsTransferServiceAsync

    fun checkDeposits(): CheckDepositServiceAsync

    fun lockboxes(): LockboxServiceAsync

    fun inboundMailItems(): InboundMailItemServiceAsync

    fun routingNumbers(): RoutingNumberServiceAsync

    fun externalAccounts(): ExternalAccountServiceAsync

    fun entities(): EntityServiceAsync

    fun supplementalDocuments(): SupplementalDocumentServiceAsync

    fun programs(): ProgramServiceAsync

    fun proofOfAuthorizationRequests(): ProofOfAuthorizationRequestServiceAsync

    fun proofOfAuthorizationRequestSubmissions(): ProofOfAuthorizationRequestSubmissionServiceAsync

    fun accountStatements(): AccountStatementServiceAsync

    fun files(): FileServiceAsync

    fun documents(): DocumentServiceAsync

    fun exports(): ExportServiceAsync

    fun events(): EventServiceAsync

    fun eventSubscriptions(): EventSubscriptionServiceAsync

    fun realTimeDecisions(): RealTimeDecisionServiceAsync

    fun bookkeepingAccounts(): BookkeepingAccountServiceAsync

    fun bookkeepingEntrySets(): BookkeepingEntrySetServiceAsync

    fun bookkeepingEntries(): BookkeepingEntryServiceAsync

    fun groups(): GroupServiceAsync

    fun oauthConnections(): OAuthConnectionServiceAsync

    fun oauthTokens(): OAuthTokenServiceAsync

    fun intrafiAccountEnrollments(): IntrafiAccountEnrollmentServiceAsync

    fun intrafiBalances(): IntrafiBalanceServiceAsync

    fun intrafiExclusions(): IntrafiExclusionServiceAsync

    fun realTimePaymentsRequestForPayments(): RealTimePaymentsRequestForPaymentServiceAsync

    fun simulations(): SimulationServiceAsync
}
