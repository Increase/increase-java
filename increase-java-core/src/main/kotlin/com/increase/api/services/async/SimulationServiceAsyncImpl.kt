// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpMethod
import com.increase.api.core.http.HttpRequest
import com.increase.api.core.http.HttpResponse.Handler
import com.increase.api.errors.IncreaseError
import com.increase.api.models.CardPayment
import com.increase.api.models.SimulationCardAuthorizationExpirationsParams
import com.increase.api.models.SimulationCardFuelConfirmationsParams
import com.increase.api.models.SimulationCardIncrementsParams
import com.increase.api.models.SimulationCardReversalsParams
import com.increase.api.services.async.simulations.AccountStatementServiceAsync
import com.increase.api.services.async.simulations.AccountStatementServiceAsyncImpl
import com.increase.api.services.async.simulations.AccountTransferServiceAsync
import com.increase.api.services.async.simulations.AccountTransferServiceAsyncImpl
import com.increase.api.services.async.simulations.AchTransferServiceAsync
import com.increase.api.services.async.simulations.AchTransferServiceAsyncImpl
import com.increase.api.services.async.simulations.CardDisputeServiceAsync
import com.increase.api.services.async.simulations.CardDisputeServiceAsyncImpl
import com.increase.api.services.async.simulations.CardRefundServiceAsync
import com.increase.api.services.async.simulations.CardRefundServiceAsyncImpl
import com.increase.api.services.async.simulations.CardServiceAsync
import com.increase.api.services.async.simulations.CardServiceAsyncImpl
import com.increase.api.services.async.simulations.CheckDepositServiceAsync
import com.increase.api.services.async.simulations.CheckDepositServiceAsyncImpl
import com.increase.api.services.async.simulations.CheckTransferServiceAsync
import com.increase.api.services.async.simulations.CheckTransferServiceAsyncImpl
import com.increase.api.services.async.simulations.DigitalWalletTokenRequestServiceAsync
import com.increase.api.services.async.simulations.DigitalWalletTokenRequestServiceAsyncImpl
import com.increase.api.services.async.simulations.DocumentServiceAsync
import com.increase.api.services.async.simulations.DocumentServiceAsyncImpl
import com.increase.api.services.async.simulations.InboundCheckDepositServiceAsync
import com.increase.api.services.async.simulations.InboundCheckDepositServiceAsyncImpl
import com.increase.api.services.async.simulations.InboundFundsHoldServiceAsync
import com.increase.api.services.async.simulations.InboundFundsHoldServiceAsyncImpl
import com.increase.api.services.async.simulations.InboundWireDrawdownRequestServiceAsync
import com.increase.api.services.async.simulations.InboundWireDrawdownRequestServiceAsyncImpl
import com.increase.api.services.async.simulations.InterestPaymentServiceAsync
import com.increase.api.services.async.simulations.InterestPaymentServiceAsyncImpl
import com.increase.api.services.async.simulations.PhysicalCardServiceAsync
import com.increase.api.services.async.simulations.PhysicalCardServiceAsyncImpl
import com.increase.api.services.async.simulations.ProgramServiceAsync
import com.increase.api.services.async.simulations.ProgramServiceAsyncImpl
import com.increase.api.services.async.simulations.RealTimePaymentsTransferServiceAsync
import com.increase.api.services.async.simulations.RealTimePaymentsTransferServiceAsyncImpl
import com.increase.api.services.async.simulations.WireTransferServiceAsync
import com.increase.api.services.async.simulations.WireTransferServiceAsyncImpl
import com.increase.api.services.errorHandler
import com.increase.api.services.json
import com.increase.api.services.jsonHandler
import com.increase.api.services.withErrorHandler
import java.util.concurrent.CompletableFuture

class SimulationServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : SimulationServiceAsync {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val accountTransfers: AccountTransferServiceAsync by lazy {
        AccountTransferServiceAsyncImpl(clientOptions)
    }

    private val accountStatements: AccountStatementServiceAsync by lazy {
        AccountStatementServiceAsyncImpl(clientOptions)
    }

    private val achTransfers: AchTransferServiceAsync by lazy {
        AchTransferServiceAsyncImpl(clientOptions)
    }

    private val cardDisputes: CardDisputeServiceAsync by lazy {
        CardDisputeServiceAsyncImpl(clientOptions)
    }

    private val cardRefunds: CardRefundServiceAsync by lazy {
        CardRefundServiceAsyncImpl(clientOptions)
    }

    private val checkTransfers: CheckTransferServiceAsync by lazy {
        CheckTransferServiceAsyncImpl(clientOptions)
    }

    private val documents: DocumentServiceAsync by lazy { DocumentServiceAsyncImpl(clientOptions) }

    private val digitalWalletTokenRequests: DigitalWalletTokenRequestServiceAsync by lazy {
        DigitalWalletTokenRequestServiceAsyncImpl(clientOptions)
    }

    private val checkDeposits: CheckDepositServiceAsync by lazy {
        CheckDepositServiceAsyncImpl(clientOptions)
    }

    private val programs: ProgramServiceAsync by lazy { ProgramServiceAsyncImpl(clientOptions) }

    private val inboundWireDrawdownRequests: InboundWireDrawdownRequestServiceAsync by lazy {
        InboundWireDrawdownRequestServiceAsyncImpl(clientOptions)
    }

    private val inboundFundsHolds: InboundFundsHoldServiceAsync by lazy {
        InboundFundsHoldServiceAsyncImpl(clientOptions)
    }

    private val interestPayments: InterestPaymentServiceAsync by lazy {
        InterestPaymentServiceAsyncImpl(clientOptions)
    }

    private val wireTransfers: WireTransferServiceAsync by lazy {
        WireTransferServiceAsyncImpl(clientOptions)
    }

    private val cards: CardServiceAsync by lazy { CardServiceAsyncImpl(clientOptions) }

    private val realTimePaymentsTransfers: RealTimePaymentsTransferServiceAsync by lazy {
        RealTimePaymentsTransferServiceAsyncImpl(clientOptions)
    }

    private val physicalCards: PhysicalCardServiceAsync by lazy {
        PhysicalCardServiceAsyncImpl(clientOptions)
    }

    private val inboundCheckDeposits: InboundCheckDepositServiceAsync by lazy {
        InboundCheckDepositServiceAsyncImpl(clientOptions)
    }

    override fun accountTransfers(): AccountTransferServiceAsync = accountTransfers

    override fun accountStatements(): AccountStatementServiceAsync = accountStatements

    override fun achTransfers(): AchTransferServiceAsync = achTransfers

    override fun cardDisputes(): CardDisputeServiceAsync = cardDisputes

    override fun cardRefunds(): CardRefundServiceAsync = cardRefunds

    override fun checkTransfers(): CheckTransferServiceAsync = checkTransfers

    override fun documents(): DocumentServiceAsync = documents

    override fun digitalWalletTokenRequests(): DigitalWalletTokenRequestServiceAsync =
        digitalWalletTokenRequests

    override fun checkDeposits(): CheckDepositServiceAsync = checkDeposits

    override fun programs(): ProgramServiceAsync = programs

    override fun inboundWireDrawdownRequests(): InboundWireDrawdownRequestServiceAsync =
        inboundWireDrawdownRequests

    override fun inboundFundsHolds(): InboundFundsHoldServiceAsync = inboundFundsHolds

    override fun interestPayments(): InterestPaymentServiceAsync = interestPayments

    override fun wireTransfers(): WireTransferServiceAsync = wireTransfers

    override fun cards(): CardServiceAsync = cards

    override fun realTimePaymentsTransfers(): RealTimePaymentsTransferServiceAsync =
        realTimePaymentsTransfers

    override fun physicalCards(): PhysicalCardServiceAsync = physicalCards

    override fun inboundCheckDeposits(): InboundCheckDepositServiceAsync = inboundCheckDeposits

    private val cardAuthorizationExpirationsHandler: Handler<CardPayment> =
        jsonHandler<CardPayment>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Simulates expiring a card authorization immediately. */
    override fun cardAuthorizationExpirations(
        params: SimulationCardAuthorizationExpirationsParams,
        requestOptions: RequestOptions
    ): CompletableFuture<CardPayment> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("simulations", "card_authorization_expirations")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { cardAuthorizationExpirationsHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val cardFuelConfirmationsHandler: Handler<CardPayment> =
        jsonHandler<CardPayment>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Simulates the fuel confirmation of an authorization by a card acquirer. This happens
     * asynchronously right after a fuel pump transaction is completed. A fuel confirmation can only
     * happen once per authorization.
     */
    override fun cardFuelConfirmations(
        params: SimulationCardFuelConfirmationsParams,
        requestOptions: RequestOptions
    ): CompletableFuture<CardPayment> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("simulations", "card_fuel_confirmations")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { cardFuelConfirmationsHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val cardIncrementsHandler: Handler<CardPayment> =
        jsonHandler<CardPayment>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Simulates the increment of an authorization by a card acquirer. An authorization can be
     * incremented multiple times.
     */
    override fun cardIncrements(
        params: SimulationCardIncrementsParams,
        requestOptions: RequestOptions
    ): CompletableFuture<CardPayment> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("simulations", "card_increments")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { cardIncrementsHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val cardReversalsHandler: Handler<CardPayment> =
        jsonHandler<CardPayment>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Simulates the reversal of an authorization by a card acquirer. An authorization can be
     * partially reversed multiple times, up until the total authorized amount. Marks the pending
     * transaction as complete if the authorization is fully reversed.
     */
    override fun cardReversals(
        params: SimulationCardReversalsParams,
        requestOptions: RequestOptions
    ): CompletableFuture<CardPayment> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("simulations", "card_reversals")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { cardReversalsHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
