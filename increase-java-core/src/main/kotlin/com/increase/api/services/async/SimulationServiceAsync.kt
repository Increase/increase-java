// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async

import com.increase.api.services.async.simulations.AccountStatementServiceAsync
import com.increase.api.services.async.simulations.AccountTransferServiceAsync
import com.increase.api.services.async.simulations.AchTransferServiceAsync
import com.increase.api.services.async.simulations.CardAuthorizationExpirationServiceAsync
import com.increase.api.services.async.simulations.CardAuthorizationServiceAsync
import com.increase.api.services.async.simulations.CardDisputeServiceAsync
import com.increase.api.services.async.simulations.CardFuelConfirmationServiceAsync
import com.increase.api.services.async.simulations.CardIncrementServiceAsync
import com.increase.api.services.async.simulations.CardRefundServiceAsync
import com.increase.api.services.async.simulations.CardReversalServiceAsync
import com.increase.api.services.async.simulations.CardSettlementServiceAsync
import com.increase.api.services.async.simulations.CheckDepositServiceAsync
import com.increase.api.services.async.simulations.CheckTransferServiceAsync
import com.increase.api.services.async.simulations.DigitalWalletTokenRequestServiceAsync
import com.increase.api.services.async.simulations.DocumentServiceAsync
import com.increase.api.services.async.simulations.InboundAchTransferServiceAsync
import com.increase.api.services.async.simulations.InboundCheckDepositServiceAsync
import com.increase.api.services.async.simulations.InboundFundsHoldServiceAsync
import com.increase.api.services.async.simulations.InboundMailItemServiceAsync
import com.increase.api.services.async.simulations.InboundRealTimePaymentsTransferServiceAsync
import com.increase.api.services.async.simulations.InboundWireDrawdownRequestServiceAsync
import com.increase.api.services.async.simulations.InboundWireTransferServiceAsync
import com.increase.api.services.async.simulations.InterestPaymentServiceAsync
import com.increase.api.services.async.simulations.PhysicalCardServiceAsync
import com.increase.api.services.async.simulations.ProgramServiceAsync
import com.increase.api.services.async.simulations.RealTimePaymentsTransferServiceAsync
import com.increase.api.services.async.simulations.WireTransferServiceAsync

interface SimulationServiceAsync {

    fun accountTransfers(): AccountTransferServiceAsync

    fun inboundAchTransfers(): InboundAchTransferServiceAsync

    fun achTransfers(): AchTransferServiceAsync

    fun checkTransfers(): CheckTransferServiceAsync

    fun inboundCheckDeposits(): InboundCheckDepositServiceAsync

    fun inboundMailItems(): InboundMailItemServiceAsync

    fun checkDeposits(): CheckDepositServiceAsync

    fun inboundWireTransfers(): InboundWireTransferServiceAsync

    fun wireTransfers(): WireTransferServiceAsync

    fun inboundWireDrawdownRequests(): InboundWireDrawdownRequestServiceAsync

    fun inboundRealTimePaymentsTransfers(): InboundRealTimePaymentsTransferServiceAsync

    fun inboundFundsHolds(): InboundFundsHoldServiceAsync

    fun realTimePaymentsTransfers(): RealTimePaymentsTransferServiceAsync

    fun cardAuthorizations(): CardAuthorizationServiceAsync

    fun cardSettlements(): CardSettlementServiceAsync

    fun cardReversals(): CardReversalServiceAsync

    fun cardIncrements(): CardIncrementServiceAsync

    fun cardAuthorizationExpirations(): CardAuthorizationExpirationServiceAsync

    fun cardFuelConfirmations(): CardFuelConfirmationServiceAsync

    fun cardRefunds(): CardRefundServiceAsync

    fun cardDisputes(): CardDisputeServiceAsync

    fun digitalWalletTokenRequests(): DigitalWalletTokenRequestServiceAsync

    fun physicalCards(): PhysicalCardServiceAsync

    fun interestPayments(): InterestPaymentServiceAsync

    fun accountStatements(): AccountStatementServiceAsync

    fun documents(): DocumentServiceAsync

    fun programs(): ProgramServiceAsync
}
