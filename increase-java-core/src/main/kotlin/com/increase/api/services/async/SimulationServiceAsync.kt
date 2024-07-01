// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async

import com.increase.api.core.RequestOptions
import com.increase.api.models.CardPayment
import com.increase.api.models.SimulationCardAuthorizationExpirationsParams
import com.increase.api.models.SimulationCardFuelConfirmationsParams
import com.increase.api.models.SimulationCardIncrementsParams
import com.increase.api.models.SimulationCardReversalsParams
import com.increase.api.services.async.simulations.AccountStatementServiceAsync
import com.increase.api.services.async.simulations.AccountTransferServiceAsync
import com.increase.api.services.async.simulations.AchTransferServiceAsync
import com.increase.api.services.async.simulations.CardDisputeServiceAsync
import com.increase.api.services.async.simulations.CardRefundServiceAsync
import com.increase.api.services.async.simulations.CardServiceAsync
import com.increase.api.services.async.simulations.CheckDepositServiceAsync
import com.increase.api.services.async.simulations.CheckTransferServiceAsync
import com.increase.api.services.async.simulations.DigitalWalletTokenRequestServiceAsync
import com.increase.api.services.async.simulations.DocumentServiceAsync
import com.increase.api.services.async.simulations.InboundCheckDepositServiceAsync
import com.increase.api.services.async.simulations.InboundFundsHoldServiceAsync
import com.increase.api.services.async.simulations.InboundInternationalAchTransferServiceAsync
import com.increase.api.services.async.simulations.InboundWireDrawdownRequestServiceAsync
import com.increase.api.services.async.simulations.InterestPaymentServiceAsync
import com.increase.api.services.async.simulations.PhysicalCardServiceAsync
import com.increase.api.services.async.simulations.ProgramServiceAsync
import com.increase.api.services.async.simulations.RealTimePaymentsTransferServiceAsync
import com.increase.api.services.async.simulations.WireTransferServiceAsync
import java.util.concurrent.CompletableFuture

interface SimulationServiceAsync {

    fun accountTransfers(): AccountTransferServiceAsync

    fun accountStatements(): AccountStatementServiceAsync

    fun achTransfers(): AchTransferServiceAsync

    fun cardDisputes(): CardDisputeServiceAsync

    fun cardRefunds(): CardRefundServiceAsync

    fun checkTransfers(): CheckTransferServiceAsync

    fun documents(): DocumentServiceAsync

    fun digitalWalletTokenRequests(): DigitalWalletTokenRequestServiceAsync

    fun checkDeposits(): CheckDepositServiceAsync

    fun programs(): ProgramServiceAsync

    fun inboundWireDrawdownRequests(): InboundWireDrawdownRequestServiceAsync

    fun inboundFundsHolds(): InboundFundsHoldServiceAsync

    fun interestPayments(): InterestPaymentServiceAsync

    fun wireTransfers(): WireTransferServiceAsync

    fun cards(): CardServiceAsync

    fun realTimePaymentsTransfers(): RealTimePaymentsTransferServiceAsync

    fun physicalCards(): PhysicalCardServiceAsync

    fun inboundCheckDeposits(): InboundCheckDepositServiceAsync

    fun inboundInternationalAchTransfers(): InboundInternationalAchTransferServiceAsync

    /** Simulates expiring a card authorization immediately. */
    @JvmOverloads
    fun cardAuthorizationExpirations(
        params: SimulationCardAuthorizationExpirationsParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<CardPayment>

    /**
     * Simulates the fuel confirmation of an authorization by a card acquirer. This happens
     * asynchronously right after a fuel pump transaction is completed. A fuel confirmation can only
     * happen once per authorization.
     */
    @JvmOverloads
    fun cardFuelConfirmations(
        params: SimulationCardFuelConfirmationsParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<CardPayment>

    /**
     * Simulates the increment of an authorization by a card acquirer. An authorization can be
     * incremented multiple times.
     */
    @JvmOverloads
    fun cardIncrements(
        params: SimulationCardIncrementsParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<CardPayment>

    /**
     * Simulates the reversal of an authorization by a card acquirer. An authorization can be
     * partially reversed multiple times, up until the total authorized amount. Marks the pending
     * transaction as complete if the authorization is fully reversed.
     */
    @JvmOverloads
    fun cardReversals(
        params: SimulationCardReversalsParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<CardPayment>
}
