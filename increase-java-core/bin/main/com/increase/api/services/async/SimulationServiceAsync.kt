// File generated from our OpenAPI spec by Stainless.

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

    fun interestPayments(): InterestPaymentServiceAsync

    fun cardAuthorizations(): CardAuthorizationServiceAsync

    fun cardAuthorizationExpirations(): CardAuthorizationExpirationServiceAsync

    fun cardSettlements(): CardSettlementServiceAsync

    fun cardReversals(): CardReversalServiceAsync

    fun cardIncrements(): CardIncrementServiceAsync

    fun cardFuelConfirmations(): CardFuelConfirmationServiceAsync

    fun cardRefunds(): CardRefundServiceAsync

    fun cardDisputes(): CardDisputeServiceAsync

    fun physicalCards(): PhysicalCardServiceAsync

    fun digitalWalletTokenRequests(): DigitalWalletTokenRequestServiceAsync

    fun inboundFundsHolds(): InboundFundsHoldServiceAsync

    fun accountTransfers(): AccountTransferServiceAsync

    fun achTransfers(): AchTransferServiceAsync

    fun inboundAchTransfers(): InboundAchTransferServiceAsync

    fun wireTransfers(): WireTransferServiceAsync

    fun inboundWireTransfers(): InboundWireTransferServiceAsync

    fun inboundWireDrawdownRequests(): InboundWireDrawdownRequestServiceAsync

    fun checkTransfers(): CheckTransferServiceAsync

    fun inboundCheckDeposits(): InboundCheckDepositServiceAsync

    fun realTimePaymentsTransfers(): RealTimePaymentsTransferServiceAsync

    fun inboundRealTimePaymentsTransfers(): InboundRealTimePaymentsTransferServiceAsync

    fun checkDeposits(): CheckDepositServiceAsync

    fun inboundMailItems(): InboundMailItemServiceAsync

    fun programs(): ProgramServiceAsync

    fun accountStatements(): AccountStatementServiceAsync

    fun documents(): DocumentServiceAsync
}
