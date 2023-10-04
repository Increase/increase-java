// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.core.ClientOptions
import com.increase.api.core.http.HttpResponse.Handler
import com.increase.api.errors.IncreaseError
import com.increase.api.services.blocking.simulations.AccountStatementService
import com.increase.api.services.blocking.simulations.AccountStatementServiceImpl
import com.increase.api.services.blocking.simulations.AccountTransferService
import com.increase.api.services.blocking.simulations.AccountTransferServiceImpl
import com.increase.api.services.blocking.simulations.AchTransferService
import com.increase.api.services.blocking.simulations.AchTransferServiceImpl
import com.increase.api.services.blocking.simulations.CardDisputeService
import com.increase.api.services.blocking.simulations.CardDisputeServiceImpl
import com.increase.api.services.blocking.simulations.CardProfileService
import com.increase.api.services.blocking.simulations.CardProfileServiceImpl
import com.increase.api.services.blocking.simulations.CardRefundService
import com.increase.api.services.blocking.simulations.CardRefundServiceImpl
import com.increase.api.services.blocking.simulations.CardService
import com.increase.api.services.blocking.simulations.CardServiceImpl
import com.increase.api.services.blocking.simulations.CheckDepositService
import com.increase.api.services.blocking.simulations.CheckDepositServiceImpl
import com.increase.api.services.blocking.simulations.CheckTransferService
import com.increase.api.services.blocking.simulations.CheckTransferServiceImpl
import com.increase.api.services.blocking.simulations.DigitalWalletTokenRequestService
import com.increase.api.services.blocking.simulations.DigitalWalletTokenRequestServiceImpl
import com.increase.api.services.blocking.simulations.DocumentService
import com.increase.api.services.blocking.simulations.DocumentServiceImpl
import com.increase.api.services.blocking.simulations.InboundFundsHoldService
import com.increase.api.services.blocking.simulations.InboundFundsHoldServiceImpl
import com.increase.api.services.blocking.simulations.InboundWireDrawdownRequestService
import com.increase.api.services.blocking.simulations.InboundWireDrawdownRequestServiceImpl
import com.increase.api.services.blocking.simulations.InterestPaymentService
import com.increase.api.services.blocking.simulations.InterestPaymentServiceImpl
import com.increase.api.services.blocking.simulations.PhysicalCardService
import com.increase.api.services.blocking.simulations.PhysicalCardServiceImpl
import com.increase.api.services.blocking.simulations.ProgramService
import com.increase.api.services.blocking.simulations.ProgramServiceImpl
import com.increase.api.services.blocking.simulations.RealTimePaymentsTransferService
import com.increase.api.services.blocking.simulations.RealTimePaymentsTransferServiceImpl
import com.increase.api.services.blocking.simulations.WireTransferService
import com.increase.api.services.blocking.simulations.WireTransferServiceImpl
import com.increase.api.services.errorHandler

class SimulationServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : SimulationService {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val accountTransfers: AccountTransferService by lazy {
        AccountTransferServiceImpl(clientOptions)
    }

    private val accountStatements: AccountStatementService by lazy {
        AccountStatementServiceImpl(clientOptions)
    }

    private val achTransfers: AchTransferService by lazy { AchTransferServiceImpl(clientOptions) }

    private val cardDisputes: CardDisputeService by lazy { CardDisputeServiceImpl(clientOptions) }

    private val cardProfiles: CardProfileService by lazy { CardProfileServiceImpl(clientOptions) }

    private val cardRefunds: CardRefundService by lazy { CardRefundServiceImpl(clientOptions) }

    private val checkTransfers: CheckTransferService by lazy {
        CheckTransferServiceImpl(clientOptions)
    }

    private val documents: DocumentService by lazy { DocumentServiceImpl(clientOptions) }

    private val digitalWalletTokenRequests: DigitalWalletTokenRequestService by lazy {
        DigitalWalletTokenRequestServiceImpl(clientOptions)
    }

    private val checkDeposits: CheckDepositService by lazy {
        CheckDepositServiceImpl(clientOptions)
    }

    private val programs: ProgramService by lazy { ProgramServiceImpl(clientOptions) }

    private val inboundWireDrawdownRequests: InboundWireDrawdownRequestService by lazy {
        InboundWireDrawdownRequestServiceImpl(clientOptions)
    }

    private val inboundFundsHolds: InboundFundsHoldService by lazy {
        InboundFundsHoldServiceImpl(clientOptions)
    }

    private val interestPayments: InterestPaymentService by lazy {
        InterestPaymentServiceImpl(clientOptions)
    }

    private val wireTransfers: WireTransferService by lazy {
        WireTransferServiceImpl(clientOptions)
    }

    private val cards: CardService by lazy { CardServiceImpl(clientOptions) }

    private val realTimePaymentsTransfers: RealTimePaymentsTransferService by lazy {
        RealTimePaymentsTransferServiceImpl(clientOptions)
    }

    private val physicalCards: PhysicalCardService by lazy {
        PhysicalCardServiceImpl(clientOptions)
    }

    override fun accountTransfers(): AccountTransferService = accountTransfers

    override fun accountStatements(): AccountStatementService = accountStatements

    override fun achTransfers(): AchTransferService = achTransfers

    override fun cardDisputes(): CardDisputeService = cardDisputes

    override fun cardProfiles(): CardProfileService = cardProfiles

    override fun cardRefunds(): CardRefundService = cardRefunds

    override fun checkTransfers(): CheckTransferService = checkTransfers

    override fun documents(): DocumentService = documents

    override fun digitalWalletTokenRequests(): DigitalWalletTokenRequestService =
        digitalWalletTokenRequests

    override fun checkDeposits(): CheckDepositService = checkDeposits

    override fun programs(): ProgramService = programs

    override fun inboundWireDrawdownRequests(): InboundWireDrawdownRequestService =
        inboundWireDrawdownRequests

    override fun inboundFundsHolds(): InboundFundsHoldService = inboundFundsHolds

    override fun interestPayments(): InterestPaymentService = interestPayments

    override fun wireTransfers(): WireTransferService = wireTransfers

    override fun cards(): CardService = cards

    override fun realTimePaymentsTransfers(): RealTimePaymentsTransferService =
        realTimePaymentsTransfers

    override fun physicalCards(): PhysicalCardService = physicalCards
}
