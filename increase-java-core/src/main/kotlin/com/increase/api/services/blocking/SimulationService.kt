// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.blocking

import com.increase.api.core.RequestOptions
import com.increase.api.models.CardPayment
import com.increase.api.models.SimulationCardAuthorizationExpirationsParams
import com.increase.api.models.SimulationCardFuelConfirmationsParams
import com.increase.api.models.SimulationCardIncrementsParams
import com.increase.api.models.SimulationCardReversalsParams
import com.increase.api.services.blocking.simulations.AccountStatementService
import com.increase.api.services.blocking.simulations.AccountTransferService
import com.increase.api.services.blocking.simulations.AchTransferService
import com.increase.api.services.blocking.simulations.CardDisputeService
import com.increase.api.services.blocking.simulations.CardRefundService
import com.increase.api.services.blocking.simulations.CardService
import com.increase.api.services.blocking.simulations.CheckDepositService
import com.increase.api.services.blocking.simulations.CheckTransferService
import com.increase.api.services.blocking.simulations.DigitalWalletTokenRequestService
import com.increase.api.services.blocking.simulations.DocumentService
import com.increase.api.services.blocking.simulations.InboundCheckDepositService
import com.increase.api.services.blocking.simulations.InboundFundsHoldService
import com.increase.api.services.blocking.simulations.InboundWireDrawdownRequestService
import com.increase.api.services.blocking.simulations.InterestPaymentService
import com.increase.api.services.blocking.simulations.PhysicalCardService
import com.increase.api.services.blocking.simulations.ProgramService
import com.increase.api.services.blocking.simulations.RealTimePaymentsTransferService
import com.increase.api.services.blocking.simulations.WireTransferService

interface SimulationService {

    fun accountTransfers(): AccountTransferService

    fun accountStatements(): AccountStatementService

    fun achTransfers(): AchTransferService

    fun cardDisputes(): CardDisputeService

    fun cardRefunds(): CardRefundService

    fun checkTransfers(): CheckTransferService

    fun documents(): DocumentService

    fun digitalWalletTokenRequests(): DigitalWalletTokenRequestService

    fun checkDeposits(): CheckDepositService

    fun programs(): ProgramService

    fun inboundWireDrawdownRequests(): InboundWireDrawdownRequestService

    fun inboundFundsHolds(): InboundFundsHoldService

    fun interestPayments(): InterestPaymentService

    fun wireTransfers(): WireTransferService

    fun cards(): CardService

    fun realTimePaymentsTransfers(): RealTimePaymentsTransferService

    fun physicalCards(): PhysicalCardService

    fun inboundCheckDeposits(): InboundCheckDepositService

    /** Simulates expiring a card authorization immediately. */
    @JvmOverloads
    fun cardAuthorizationExpirations(
        params: SimulationCardAuthorizationExpirationsParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CardPayment

    /**
     * Simulates the fuel confirmation of an authorization by a card acquirer. This happens
     * asynchronously right after a fuel pump transaction is completed. A fuel confirmation can only
     * happen once per authorization.
     */
    @JvmOverloads
    fun cardFuelConfirmations(
        params: SimulationCardFuelConfirmationsParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CardPayment

    /**
     * Simulates the increment of an authorization by a card acquirer. An authorization can be
     * incremented multiple times.
     */
    @JvmOverloads
    fun cardIncrements(
        params: SimulationCardIncrementsParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CardPayment

    /**
     * Simulates the reversal of an authorization by a card acquirer. An authorization can be
     * partially reversed multiple times, up until the total authorized amount. Marks the pending
     * transaction as complete if the authorization is fully reversed.
     */
    @JvmOverloads
    fun cardReversals(
        params: SimulationCardReversalsParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CardPayment
}
