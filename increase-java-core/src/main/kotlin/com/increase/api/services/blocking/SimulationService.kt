// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.blocking

import com.increase.api.services.blocking.simulations.AccountStatementService
import com.increase.api.services.blocking.simulations.AccountTransferService
import com.increase.api.services.blocking.simulations.AchTransferService
import com.increase.api.services.blocking.simulations.CardAuthorizationExpirationService
import com.increase.api.services.blocking.simulations.CardAuthorizationService
import com.increase.api.services.blocking.simulations.CardDisputeService
import com.increase.api.services.blocking.simulations.CardFuelConfirmationService
import com.increase.api.services.blocking.simulations.CardIncrementService
import com.increase.api.services.blocking.simulations.CardRefundService
import com.increase.api.services.blocking.simulations.CardReversalService
import com.increase.api.services.blocking.simulations.CardSettlementService
import com.increase.api.services.blocking.simulations.CheckDepositService
import com.increase.api.services.blocking.simulations.CheckTransferService
import com.increase.api.services.blocking.simulations.DigitalWalletTokenRequestService
import com.increase.api.services.blocking.simulations.DocumentService
import com.increase.api.services.blocking.simulations.InboundAchTransferService
import com.increase.api.services.blocking.simulations.InboundCheckDepositService
import com.increase.api.services.blocking.simulations.InboundFundsHoldService
import com.increase.api.services.blocking.simulations.InboundRealTimePaymentsTransferService
import com.increase.api.services.blocking.simulations.InboundWireDrawdownRequestService
import com.increase.api.services.blocking.simulations.InboundWireTransferService
import com.increase.api.services.blocking.simulations.InterestPaymentService
import com.increase.api.services.blocking.simulations.PhysicalCardService
import com.increase.api.services.blocking.simulations.ProgramService
import com.increase.api.services.blocking.simulations.RealTimePaymentsTransferService
import com.increase.api.services.blocking.simulations.WireTransferService

interface SimulationService {

    fun accountTransfers(): AccountTransferService

    fun inboundAchTransfers(): InboundAchTransferService

    fun achTransfers(): AchTransferService

    fun checkTransfers(): CheckTransferService

    fun inboundCheckDeposits(): InboundCheckDepositService

    fun checkDeposits(): CheckDepositService

    fun inboundWireTransfers(): InboundWireTransferService

    fun wireTransfers(): WireTransferService

    fun inboundWireDrawdownRequests(): InboundWireDrawdownRequestService

    fun inboundRealTimePaymentsTransfers(): InboundRealTimePaymentsTransferService

    fun inboundFundsHolds(): InboundFundsHoldService

    fun realTimePaymentsTransfers(): RealTimePaymentsTransferService

    fun cardAuthorizations(): CardAuthorizationService

    fun cardSettlements(): CardSettlementService

    fun cardReversals(): CardReversalService

    fun cardIncrements(): CardIncrementService

    fun cardAuthorizationExpirations(): CardAuthorizationExpirationService

    fun cardFuelConfirmations(): CardFuelConfirmationService

    fun cardRefunds(): CardRefundService

    fun cardDisputes(): CardDisputeService

    fun digitalWalletTokenRequests(): DigitalWalletTokenRequestService

    fun physicalCards(): PhysicalCardService

    fun interestPayments(): InterestPaymentService

    fun accountStatements(): AccountStatementService

    fun documents(): DocumentService

    fun programs(): ProgramService
}
