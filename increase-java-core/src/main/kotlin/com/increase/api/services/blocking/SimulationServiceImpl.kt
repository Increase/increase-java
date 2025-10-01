// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.core.ClientOptions
import com.increase.api.services.blocking.simulations.AccountStatementService
import com.increase.api.services.blocking.simulations.AccountStatementServiceImpl
import com.increase.api.services.blocking.simulations.AccountTransferService
import com.increase.api.services.blocking.simulations.AccountTransferServiceImpl
import com.increase.api.services.blocking.simulations.AchTransferService
import com.increase.api.services.blocking.simulations.AchTransferServiceImpl
import com.increase.api.services.blocking.simulations.CardAuthorizationExpirationService
import com.increase.api.services.blocking.simulations.CardAuthorizationExpirationServiceImpl
import com.increase.api.services.blocking.simulations.CardAuthorizationService
import com.increase.api.services.blocking.simulations.CardAuthorizationServiceImpl
import com.increase.api.services.blocking.simulations.CardDisputeService
import com.increase.api.services.blocking.simulations.CardDisputeServiceImpl
import com.increase.api.services.blocking.simulations.CardFuelConfirmationService
import com.increase.api.services.blocking.simulations.CardFuelConfirmationServiceImpl
import com.increase.api.services.blocking.simulations.CardIncrementService
import com.increase.api.services.blocking.simulations.CardIncrementServiceImpl
import com.increase.api.services.blocking.simulations.CardRefundService
import com.increase.api.services.blocking.simulations.CardRefundServiceImpl
import com.increase.api.services.blocking.simulations.CardReversalService
import com.increase.api.services.blocking.simulations.CardReversalServiceImpl
import com.increase.api.services.blocking.simulations.CardSettlementService
import com.increase.api.services.blocking.simulations.CardSettlementServiceImpl
import com.increase.api.services.blocking.simulations.CardTokenService
import com.increase.api.services.blocking.simulations.CardTokenServiceImpl
import com.increase.api.services.blocking.simulations.CheckDepositService
import com.increase.api.services.blocking.simulations.CheckDepositServiceImpl
import com.increase.api.services.blocking.simulations.CheckTransferService
import com.increase.api.services.blocking.simulations.CheckTransferServiceImpl
import com.increase.api.services.blocking.simulations.DigitalWalletTokenRequestService
import com.increase.api.services.blocking.simulations.DigitalWalletTokenRequestServiceImpl
import com.increase.api.services.blocking.simulations.DocumentService
import com.increase.api.services.blocking.simulations.DocumentServiceImpl
import com.increase.api.services.blocking.simulations.InboundAchTransferService
import com.increase.api.services.blocking.simulations.InboundAchTransferServiceImpl
import com.increase.api.services.blocking.simulations.InboundCheckDepositService
import com.increase.api.services.blocking.simulations.InboundCheckDepositServiceImpl
import com.increase.api.services.blocking.simulations.InboundMailItemService
import com.increase.api.services.blocking.simulations.InboundMailItemServiceImpl
import com.increase.api.services.blocking.simulations.InboundRealTimePaymentsTransferService
import com.increase.api.services.blocking.simulations.InboundRealTimePaymentsTransferServiceImpl
import com.increase.api.services.blocking.simulations.InboundWireDrawdownRequestService
import com.increase.api.services.blocking.simulations.InboundWireDrawdownRequestServiceImpl
import com.increase.api.services.blocking.simulations.InboundWireTransferService
import com.increase.api.services.blocking.simulations.InboundWireTransferServiceImpl
import com.increase.api.services.blocking.simulations.InterestPaymentService
import com.increase.api.services.blocking.simulations.InterestPaymentServiceImpl
import com.increase.api.services.blocking.simulations.PendingTransactionService
import com.increase.api.services.blocking.simulations.PendingTransactionServiceImpl
import com.increase.api.services.blocking.simulations.PhysicalCardService
import com.increase.api.services.blocking.simulations.PhysicalCardServiceImpl
import com.increase.api.services.blocking.simulations.ProgramService
import com.increase.api.services.blocking.simulations.ProgramServiceImpl
import com.increase.api.services.blocking.simulations.RealTimePaymentsTransferService
import com.increase.api.services.blocking.simulations.RealTimePaymentsTransferServiceImpl
import com.increase.api.services.blocking.simulations.WireDrawdownRequestService
import com.increase.api.services.blocking.simulations.WireDrawdownRequestServiceImpl
import com.increase.api.services.blocking.simulations.WireTransferService
import com.increase.api.services.blocking.simulations.WireTransferServiceImpl
import java.util.function.Consumer

class SimulationServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SimulationService {

    private val withRawResponse: SimulationService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val interestPayments: InterestPaymentService by lazy {
        InterestPaymentServiceImpl(clientOptions)
    }

    private val accountTransfers: AccountTransferService by lazy {
        AccountTransferServiceImpl(clientOptions)
    }

    private val cardAuthorizations: CardAuthorizationService by lazy {
        CardAuthorizationServiceImpl(clientOptions)
    }

    private val cardAuthorizationExpirations: CardAuthorizationExpirationService by lazy {
        CardAuthorizationExpirationServiceImpl(clientOptions)
    }

    private val cardSettlements: CardSettlementService by lazy {
        CardSettlementServiceImpl(clientOptions)
    }

    private val cardReversals: CardReversalService by lazy {
        CardReversalServiceImpl(clientOptions)
    }

    private val cardIncrements: CardIncrementService by lazy {
        CardIncrementServiceImpl(clientOptions)
    }

    private val cardFuelConfirmations: CardFuelConfirmationService by lazy {
        CardFuelConfirmationServiceImpl(clientOptions)
    }

    private val cardRefunds: CardRefundService by lazy { CardRefundServiceImpl(clientOptions) }

    private val cardDisputes: CardDisputeService by lazy { CardDisputeServiceImpl(clientOptions) }

    private val physicalCards: PhysicalCardService by lazy {
        PhysicalCardServiceImpl(clientOptions)
    }

    private val digitalWalletTokenRequests: DigitalWalletTokenRequestService by lazy {
        DigitalWalletTokenRequestServiceImpl(clientOptions)
    }

    private val pendingTransactions: PendingTransactionService by lazy {
        PendingTransactionServiceImpl(clientOptions)
    }

    private val achTransfers: AchTransferService by lazy { AchTransferServiceImpl(clientOptions) }

    private val inboundAchTransfers: InboundAchTransferService by lazy {
        InboundAchTransferServiceImpl(clientOptions)
    }

    private val wireTransfers: WireTransferService by lazy {
        WireTransferServiceImpl(clientOptions)
    }

    private val inboundWireTransfers: InboundWireTransferService by lazy {
        InboundWireTransferServiceImpl(clientOptions)
    }

    private val wireDrawdownRequests: WireDrawdownRequestService by lazy {
        WireDrawdownRequestServiceImpl(clientOptions)
    }

    private val inboundWireDrawdownRequests: InboundWireDrawdownRequestService by lazy {
        InboundWireDrawdownRequestServiceImpl(clientOptions)
    }

    private val checkTransfers: CheckTransferService by lazy {
        CheckTransferServiceImpl(clientOptions)
    }

    private val inboundCheckDeposits: InboundCheckDepositService by lazy {
        InboundCheckDepositServiceImpl(clientOptions)
    }

    private val realTimePaymentsTransfers: RealTimePaymentsTransferService by lazy {
        RealTimePaymentsTransferServiceImpl(clientOptions)
    }

    private val inboundRealTimePaymentsTransfers: InboundRealTimePaymentsTransferService by lazy {
        InboundRealTimePaymentsTransferServiceImpl(clientOptions)
    }

    private val checkDeposits: CheckDepositService by lazy {
        CheckDepositServiceImpl(clientOptions)
    }

    private val inboundMailItems: InboundMailItemService by lazy {
        InboundMailItemServiceImpl(clientOptions)
    }

    private val programs: ProgramService by lazy { ProgramServiceImpl(clientOptions) }

    private val accountStatements: AccountStatementService by lazy {
        AccountStatementServiceImpl(clientOptions)
    }

    private val documents: DocumentService by lazy { DocumentServiceImpl(clientOptions) }

    private val cardTokens: CardTokenService by lazy { CardTokenServiceImpl(clientOptions) }

    override fun withRawResponse(): SimulationService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SimulationService =
        SimulationServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun interestPayments(): InterestPaymentService = interestPayments

    override fun accountTransfers(): AccountTransferService = accountTransfers

    override fun cardAuthorizations(): CardAuthorizationService = cardAuthorizations

    override fun cardAuthorizationExpirations(): CardAuthorizationExpirationService =
        cardAuthorizationExpirations

    override fun cardSettlements(): CardSettlementService = cardSettlements

    override fun cardReversals(): CardReversalService = cardReversals

    override fun cardIncrements(): CardIncrementService = cardIncrements

    override fun cardFuelConfirmations(): CardFuelConfirmationService = cardFuelConfirmations

    override fun cardRefunds(): CardRefundService = cardRefunds

    override fun cardDisputes(): CardDisputeService = cardDisputes

    override fun physicalCards(): PhysicalCardService = physicalCards

    override fun digitalWalletTokenRequests(): DigitalWalletTokenRequestService =
        digitalWalletTokenRequests

    override fun pendingTransactions(): PendingTransactionService = pendingTransactions

    override fun achTransfers(): AchTransferService = achTransfers

    override fun inboundAchTransfers(): InboundAchTransferService = inboundAchTransfers

    override fun wireTransfers(): WireTransferService = wireTransfers

    override fun inboundWireTransfers(): InboundWireTransferService = inboundWireTransfers

    override fun wireDrawdownRequests(): WireDrawdownRequestService = wireDrawdownRequests

    override fun inboundWireDrawdownRequests(): InboundWireDrawdownRequestService =
        inboundWireDrawdownRequests

    override fun checkTransfers(): CheckTransferService = checkTransfers

    override fun inboundCheckDeposits(): InboundCheckDepositService = inboundCheckDeposits

    override fun realTimePaymentsTransfers(): RealTimePaymentsTransferService =
        realTimePaymentsTransfers

    override fun inboundRealTimePaymentsTransfers(): InboundRealTimePaymentsTransferService =
        inboundRealTimePaymentsTransfers

    override fun checkDeposits(): CheckDepositService = checkDeposits

    override fun inboundMailItems(): InboundMailItemService = inboundMailItems

    override fun programs(): ProgramService = programs

    override fun accountStatements(): AccountStatementService = accountStatements

    override fun documents(): DocumentService = documents

    override fun cardTokens(): CardTokenService = cardTokens

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SimulationService.WithRawResponse {

        private val interestPayments: InterestPaymentService.WithRawResponse by lazy {
            InterestPaymentServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val accountTransfers: AccountTransferService.WithRawResponse by lazy {
            AccountTransferServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val cardAuthorizations: CardAuthorizationService.WithRawResponse by lazy {
            CardAuthorizationServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val cardAuthorizationExpirations:
            CardAuthorizationExpirationService.WithRawResponse by lazy {
            CardAuthorizationExpirationServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val cardSettlements: CardSettlementService.WithRawResponse by lazy {
            CardSettlementServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val cardReversals: CardReversalService.WithRawResponse by lazy {
            CardReversalServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val cardIncrements: CardIncrementService.WithRawResponse by lazy {
            CardIncrementServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val cardFuelConfirmations: CardFuelConfirmationService.WithRawResponse by lazy {
            CardFuelConfirmationServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val cardRefunds: CardRefundService.WithRawResponse by lazy {
            CardRefundServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val cardDisputes: CardDisputeService.WithRawResponse by lazy {
            CardDisputeServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val physicalCards: PhysicalCardService.WithRawResponse by lazy {
            PhysicalCardServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val digitalWalletTokenRequests:
            DigitalWalletTokenRequestService.WithRawResponse by lazy {
            DigitalWalletTokenRequestServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val pendingTransactions: PendingTransactionService.WithRawResponse by lazy {
            PendingTransactionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val achTransfers: AchTransferService.WithRawResponse by lazy {
            AchTransferServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val inboundAchTransfers: InboundAchTransferService.WithRawResponse by lazy {
            InboundAchTransferServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val wireTransfers: WireTransferService.WithRawResponse by lazy {
            WireTransferServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val inboundWireTransfers: InboundWireTransferService.WithRawResponse by lazy {
            InboundWireTransferServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val wireDrawdownRequests: WireDrawdownRequestService.WithRawResponse by lazy {
            WireDrawdownRequestServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val inboundWireDrawdownRequests:
            InboundWireDrawdownRequestService.WithRawResponse by lazy {
            InboundWireDrawdownRequestServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val checkTransfers: CheckTransferService.WithRawResponse by lazy {
            CheckTransferServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val inboundCheckDeposits: InboundCheckDepositService.WithRawResponse by lazy {
            InboundCheckDepositServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val realTimePaymentsTransfers:
            RealTimePaymentsTransferService.WithRawResponse by lazy {
            RealTimePaymentsTransferServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val inboundRealTimePaymentsTransfers:
            InboundRealTimePaymentsTransferService.WithRawResponse by lazy {
            InboundRealTimePaymentsTransferServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val checkDeposits: CheckDepositService.WithRawResponse by lazy {
            CheckDepositServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val inboundMailItems: InboundMailItemService.WithRawResponse by lazy {
            InboundMailItemServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val programs: ProgramService.WithRawResponse by lazy {
            ProgramServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val accountStatements: AccountStatementService.WithRawResponse by lazy {
            AccountStatementServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val documents: DocumentService.WithRawResponse by lazy {
            DocumentServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val cardTokens: CardTokenService.WithRawResponse by lazy {
            CardTokenServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SimulationService.WithRawResponse =
            SimulationServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun interestPayments(): InterestPaymentService.WithRawResponse = interestPayments

        override fun accountTransfers(): AccountTransferService.WithRawResponse = accountTransfers

        override fun cardAuthorizations(): CardAuthorizationService.WithRawResponse =
            cardAuthorizations

        override fun cardAuthorizationExpirations():
            CardAuthorizationExpirationService.WithRawResponse = cardAuthorizationExpirations

        override fun cardSettlements(): CardSettlementService.WithRawResponse = cardSettlements

        override fun cardReversals(): CardReversalService.WithRawResponse = cardReversals

        override fun cardIncrements(): CardIncrementService.WithRawResponse = cardIncrements

        override fun cardFuelConfirmations(): CardFuelConfirmationService.WithRawResponse =
            cardFuelConfirmations

        override fun cardRefunds(): CardRefundService.WithRawResponse = cardRefunds

        override fun cardDisputes(): CardDisputeService.WithRawResponse = cardDisputes

        override fun physicalCards(): PhysicalCardService.WithRawResponse = physicalCards

        override fun digitalWalletTokenRequests():
            DigitalWalletTokenRequestService.WithRawResponse = digitalWalletTokenRequests

        override fun pendingTransactions(): PendingTransactionService.WithRawResponse =
            pendingTransactions

        override fun achTransfers(): AchTransferService.WithRawResponse = achTransfers

        override fun inboundAchTransfers(): InboundAchTransferService.WithRawResponse =
            inboundAchTransfers

        override fun wireTransfers(): WireTransferService.WithRawResponse = wireTransfers

        override fun inboundWireTransfers(): InboundWireTransferService.WithRawResponse =
            inboundWireTransfers

        override fun wireDrawdownRequests(): WireDrawdownRequestService.WithRawResponse =
            wireDrawdownRequests

        override fun inboundWireDrawdownRequests():
            InboundWireDrawdownRequestService.WithRawResponse = inboundWireDrawdownRequests

        override fun checkTransfers(): CheckTransferService.WithRawResponse = checkTransfers

        override fun inboundCheckDeposits(): InboundCheckDepositService.WithRawResponse =
            inboundCheckDeposits

        override fun realTimePaymentsTransfers(): RealTimePaymentsTransferService.WithRawResponse =
            realTimePaymentsTransfers

        override fun inboundRealTimePaymentsTransfers():
            InboundRealTimePaymentsTransferService.WithRawResponse =
            inboundRealTimePaymentsTransfers

        override fun checkDeposits(): CheckDepositService.WithRawResponse = checkDeposits

        override fun inboundMailItems(): InboundMailItemService.WithRawResponse = inboundMailItems

        override fun programs(): ProgramService.WithRawResponse = programs

        override fun accountStatements(): AccountStatementService.WithRawResponse =
            accountStatements

        override fun documents(): DocumentService.WithRawResponse = documents

        override fun cardTokens(): CardTokenService.WithRawResponse = cardTokens
    }
}
