@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.blocking

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
import com.increase.api.services.blocking.simulations.InboundWireDrawdownRequestService
import com.increase.api.services.blocking.simulations.InterestPaymentService
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

    fun interestPayments(): InterestPaymentService

    fun wireTransfers(): WireTransferService

    fun cards(): CardService

    fun realTimePaymentsTransfers(): RealTimePaymentsTransferService
}
