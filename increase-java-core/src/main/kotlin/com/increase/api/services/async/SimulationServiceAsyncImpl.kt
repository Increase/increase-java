// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.ClientOptions
import com.increase.api.services.async.simulations.AccountStatementServiceAsync
import com.increase.api.services.async.simulations.AccountStatementServiceAsyncImpl
import com.increase.api.services.async.simulations.AccountTransferServiceAsync
import com.increase.api.services.async.simulations.AccountTransferServiceAsyncImpl
import com.increase.api.services.async.simulations.AchTransferServiceAsync
import com.increase.api.services.async.simulations.AchTransferServiceAsyncImpl
import com.increase.api.services.async.simulations.CardAuthorizationExpirationServiceAsync
import com.increase.api.services.async.simulations.CardAuthorizationExpirationServiceAsyncImpl
import com.increase.api.services.async.simulations.CardAuthorizationServiceAsync
import com.increase.api.services.async.simulations.CardAuthorizationServiceAsyncImpl
import com.increase.api.services.async.simulations.CardDisputeServiceAsync
import com.increase.api.services.async.simulations.CardDisputeServiceAsyncImpl
import com.increase.api.services.async.simulations.CardFuelConfirmationServiceAsync
import com.increase.api.services.async.simulations.CardFuelConfirmationServiceAsyncImpl
import com.increase.api.services.async.simulations.CardIncrementServiceAsync
import com.increase.api.services.async.simulations.CardIncrementServiceAsyncImpl
import com.increase.api.services.async.simulations.CardRefundServiceAsync
import com.increase.api.services.async.simulations.CardRefundServiceAsyncImpl
import com.increase.api.services.async.simulations.CardReversalServiceAsync
import com.increase.api.services.async.simulations.CardReversalServiceAsyncImpl
import com.increase.api.services.async.simulations.CardSettlementServiceAsync
import com.increase.api.services.async.simulations.CardSettlementServiceAsyncImpl
import com.increase.api.services.async.simulations.CheckDepositServiceAsync
import com.increase.api.services.async.simulations.CheckDepositServiceAsyncImpl
import com.increase.api.services.async.simulations.CheckTransferServiceAsync
import com.increase.api.services.async.simulations.CheckTransferServiceAsyncImpl
import com.increase.api.services.async.simulations.DigitalWalletTokenRequestServiceAsync
import com.increase.api.services.async.simulations.DigitalWalletTokenRequestServiceAsyncImpl
import com.increase.api.services.async.simulations.DocumentServiceAsync
import com.increase.api.services.async.simulations.DocumentServiceAsyncImpl
import com.increase.api.services.async.simulations.InboundAchTransferServiceAsync
import com.increase.api.services.async.simulations.InboundAchTransferServiceAsyncImpl
import com.increase.api.services.async.simulations.InboundCheckDepositServiceAsync
import com.increase.api.services.async.simulations.InboundCheckDepositServiceAsyncImpl
import com.increase.api.services.async.simulations.InboundFundsHoldServiceAsync
import com.increase.api.services.async.simulations.InboundFundsHoldServiceAsyncImpl
import com.increase.api.services.async.simulations.InboundMailItemServiceAsync
import com.increase.api.services.async.simulations.InboundMailItemServiceAsyncImpl
import com.increase.api.services.async.simulations.InboundRealTimePaymentsTransferServiceAsync
import com.increase.api.services.async.simulations.InboundRealTimePaymentsTransferServiceAsyncImpl
import com.increase.api.services.async.simulations.InboundWireDrawdownRequestServiceAsync
import com.increase.api.services.async.simulations.InboundWireDrawdownRequestServiceAsyncImpl
import com.increase.api.services.async.simulations.InboundWireTransferServiceAsync
import com.increase.api.services.async.simulations.InboundWireTransferServiceAsyncImpl
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

class SimulationServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    SimulationServiceAsync {

    private val withRawResponse: SimulationServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val interestPayments: InterestPaymentServiceAsync by lazy {
        InterestPaymentServiceAsyncImpl(clientOptions)
    }

    private val cardAuthorizations: CardAuthorizationServiceAsync by lazy {
        CardAuthorizationServiceAsyncImpl(clientOptions)
    }

    private val cardAuthorizationExpirations: CardAuthorizationExpirationServiceAsync by lazy {
        CardAuthorizationExpirationServiceAsyncImpl(clientOptions)
    }

    private val cardSettlements: CardSettlementServiceAsync by lazy {
        CardSettlementServiceAsyncImpl(clientOptions)
    }

    private val cardReversals: CardReversalServiceAsync by lazy {
        CardReversalServiceAsyncImpl(clientOptions)
    }

    private val cardIncrements: CardIncrementServiceAsync by lazy {
        CardIncrementServiceAsyncImpl(clientOptions)
    }

    private val cardFuelConfirmations: CardFuelConfirmationServiceAsync by lazy {
        CardFuelConfirmationServiceAsyncImpl(clientOptions)
    }

    private val cardRefunds: CardRefundServiceAsync by lazy {
        CardRefundServiceAsyncImpl(clientOptions)
    }

    private val cardDisputes: CardDisputeServiceAsync by lazy {
        CardDisputeServiceAsyncImpl(clientOptions)
    }

    private val physicalCards: PhysicalCardServiceAsync by lazy {
        PhysicalCardServiceAsyncImpl(clientOptions)
    }

    private val digitalWalletTokenRequests: DigitalWalletTokenRequestServiceAsync by lazy {
        DigitalWalletTokenRequestServiceAsyncImpl(clientOptions)
    }

    private val inboundFundsHolds: InboundFundsHoldServiceAsync by lazy {
        InboundFundsHoldServiceAsyncImpl(clientOptions)
    }

    private val accountTransfers: AccountTransferServiceAsync by lazy {
        AccountTransferServiceAsyncImpl(clientOptions)
    }

    private val achTransfers: AchTransferServiceAsync by lazy {
        AchTransferServiceAsyncImpl(clientOptions)
    }

    private val inboundAchTransfers: InboundAchTransferServiceAsync by lazy {
        InboundAchTransferServiceAsyncImpl(clientOptions)
    }

    private val wireTransfers: WireTransferServiceAsync by lazy {
        WireTransferServiceAsyncImpl(clientOptions)
    }

    private val inboundWireTransfers: InboundWireTransferServiceAsync by lazy {
        InboundWireTransferServiceAsyncImpl(clientOptions)
    }

    private val inboundWireDrawdownRequests: InboundWireDrawdownRequestServiceAsync by lazy {
        InboundWireDrawdownRequestServiceAsyncImpl(clientOptions)
    }

    private val checkTransfers: CheckTransferServiceAsync by lazy {
        CheckTransferServiceAsyncImpl(clientOptions)
    }

    private val inboundCheckDeposits: InboundCheckDepositServiceAsync by lazy {
        InboundCheckDepositServiceAsyncImpl(clientOptions)
    }

    private val realTimePaymentsTransfers: RealTimePaymentsTransferServiceAsync by lazy {
        RealTimePaymentsTransferServiceAsyncImpl(clientOptions)
    }

    private val inboundRealTimePaymentsTransfers:
        InboundRealTimePaymentsTransferServiceAsync by lazy {
        InboundRealTimePaymentsTransferServiceAsyncImpl(clientOptions)
    }

    private val checkDeposits: CheckDepositServiceAsync by lazy {
        CheckDepositServiceAsyncImpl(clientOptions)
    }

    private val inboundMailItems: InboundMailItemServiceAsync by lazy {
        InboundMailItemServiceAsyncImpl(clientOptions)
    }

    private val programs: ProgramServiceAsync by lazy { ProgramServiceAsyncImpl(clientOptions) }

    private val accountStatements: AccountStatementServiceAsync by lazy {
        AccountStatementServiceAsyncImpl(clientOptions)
    }

    private val documents: DocumentServiceAsync by lazy { DocumentServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): SimulationServiceAsync.WithRawResponse = withRawResponse

    override fun interestPayments(): InterestPaymentServiceAsync = interestPayments

    override fun cardAuthorizations(): CardAuthorizationServiceAsync = cardAuthorizations

    override fun cardAuthorizationExpirations(): CardAuthorizationExpirationServiceAsync =
        cardAuthorizationExpirations

    override fun cardSettlements(): CardSettlementServiceAsync = cardSettlements

    override fun cardReversals(): CardReversalServiceAsync = cardReversals

    override fun cardIncrements(): CardIncrementServiceAsync = cardIncrements

    override fun cardFuelConfirmations(): CardFuelConfirmationServiceAsync = cardFuelConfirmations

    override fun cardRefunds(): CardRefundServiceAsync = cardRefunds

    override fun cardDisputes(): CardDisputeServiceAsync = cardDisputes

    override fun physicalCards(): PhysicalCardServiceAsync = physicalCards

    override fun digitalWalletTokenRequests(): DigitalWalletTokenRequestServiceAsync =
        digitalWalletTokenRequests

    override fun inboundFundsHolds(): InboundFundsHoldServiceAsync = inboundFundsHolds

    override fun accountTransfers(): AccountTransferServiceAsync = accountTransfers

    override fun achTransfers(): AchTransferServiceAsync = achTransfers

    override fun inboundAchTransfers(): InboundAchTransferServiceAsync = inboundAchTransfers

    override fun wireTransfers(): WireTransferServiceAsync = wireTransfers

    override fun inboundWireTransfers(): InboundWireTransferServiceAsync = inboundWireTransfers

    override fun inboundWireDrawdownRequests(): InboundWireDrawdownRequestServiceAsync =
        inboundWireDrawdownRequests

    override fun checkTransfers(): CheckTransferServiceAsync = checkTransfers

    override fun inboundCheckDeposits(): InboundCheckDepositServiceAsync = inboundCheckDeposits

    override fun realTimePaymentsTransfers(): RealTimePaymentsTransferServiceAsync =
        realTimePaymentsTransfers

    override fun inboundRealTimePaymentsTransfers(): InboundRealTimePaymentsTransferServiceAsync =
        inboundRealTimePaymentsTransfers

    override fun checkDeposits(): CheckDepositServiceAsync = checkDeposits

    override fun inboundMailItems(): InboundMailItemServiceAsync = inboundMailItems

    override fun programs(): ProgramServiceAsync = programs

    override fun accountStatements(): AccountStatementServiceAsync = accountStatements

    override fun documents(): DocumentServiceAsync = documents

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SimulationServiceAsync.WithRawResponse {

        private val interestPayments: InterestPaymentServiceAsync.WithRawResponse by lazy {
            InterestPaymentServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val cardAuthorizations: CardAuthorizationServiceAsync.WithRawResponse by lazy {
            CardAuthorizationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val cardAuthorizationExpirations:
            CardAuthorizationExpirationServiceAsync.WithRawResponse by lazy {
            CardAuthorizationExpirationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val cardSettlements: CardSettlementServiceAsync.WithRawResponse by lazy {
            CardSettlementServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val cardReversals: CardReversalServiceAsync.WithRawResponse by lazy {
            CardReversalServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val cardIncrements: CardIncrementServiceAsync.WithRawResponse by lazy {
            CardIncrementServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val cardFuelConfirmations:
            CardFuelConfirmationServiceAsync.WithRawResponse by lazy {
            CardFuelConfirmationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val cardRefunds: CardRefundServiceAsync.WithRawResponse by lazy {
            CardRefundServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val cardDisputes: CardDisputeServiceAsync.WithRawResponse by lazy {
            CardDisputeServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val physicalCards: PhysicalCardServiceAsync.WithRawResponse by lazy {
            PhysicalCardServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val digitalWalletTokenRequests:
            DigitalWalletTokenRequestServiceAsync.WithRawResponse by lazy {
            DigitalWalletTokenRequestServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val inboundFundsHolds: InboundFundsHoldServiceAsync.WithRawResponse by lazy {
            InboundFundsHoldServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val accountTransfers: AccountTransferServiceAsync.WithRawResponse by lazy {
            AccountTransferServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val achTransfers: AchTransferServiceAsync.WithRawResponse by lazy {
            AchTransferServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val inboundAchTransfers: InboundAchTransferServiceAsync.WithRawResponse by lazy {
            InboundAchTransferServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val wireTransfers: WireTransferServiceAsync.WithRawResponse by lazy {
            WireTransferServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val inboundWireTransfers: InboundWireTransferServiceAsync.WithRawResponse by lazy {
            InboundWireTransferServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val inboundWireDrawdownRequests:
            InboundWireDrawdownRequestServiceAsync.WithRawResponse by lazy {
            InboundWireDrawdownRequestServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val checkTransfers: CheckTransferServiceAsync.WithRawResponse by lazy {
            CheckTransferServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val inboundCheckDeposits: InboundCheckDepositServiceAsync.WithRawResponse by lazy {
            InboundCheckDepositServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val realTimePaymentsTransfers:
            RealTimePaymentsTransferServiceAsync.WithRawResponse by lazy {
            RealTimePaymentsTransferServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val inboundRealTimePaymentsTransfers:
            InboundRealTimePaymentsTransferServiceAsync.WithRawResponse by lazy {
            InboundRealTimePaymentsTransferServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val checkDeposits: CheckDepositServiceAsync.WithRawResponse by lazy {
            CheckDepositServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val inboundMailItems: InboundMailItemServiceAsync.WithRawResponse by lazy {
            InboundMailItemServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val programs: ProgramServiceAsync.WithRawResponse by lazy {
            ProgramServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val accountStatements: AccountStatementServiceAsync.WithRawResponse by lazy {
            AccountStatementServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val documents: DocumentServiceAsync.WithRawResponse by lazy {
            DocumentServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun interestPayments(): InterestPaymentServiceAsync.WithRawResponse =
            interestPayments

        override fun cardAuthorizations(): CardAuthorizationServiceAsync.WithRawResponse =
            cardAuthorizations

        override fun cardAuthorizationExpirations():
            CardAuthorizationExpirationServiceAsync.WithRawResponse = cardAuthorizationExpirations

        override fun cardSettlements(): CardSettlementServiceAsync.WithRawResponse = cardSettlements

        override fun cardReversals(): CardReversalServiceAsync.WithRawResponse = cardReversals

        override fun cardIncrements(): CardIncrementServiceAsync.WithRawResponse = cardIncrements

        override fun cardFuelConfirmations(): CardFuelConfirmationServiceAsync.WithRawResponse =
            cardFuelConfirmations

        override fun cardRefunds(): CardRefundServiceAsync.WithRawResponse = cardRefunds

        override fun cardDisputes(): CardDisputeServiceAsync.WithRawResponse = cardDisputes

        override fun physicalCards(): PhysicalCardServiceAsync.WithRawResponse = physicalCards

        override fun digitalWalletTokenRequests():
            DigitalWalletTokenRequestServiceAsync.WithRawResponse = digitalWalletTokenRequests

        override fun inboundFundsHolds(): InboundFundsHoldServiceAsync.WithRawResponse =
            inboundFundsHolds

        override fun accountTransfers(): AccountTransferServiceAsync.WithRawResponse =
            accountTransfers

        override fun achTransfers(): AchTransferServiceAsync.WithRawResponse = achTransfers

        override fun inboundAchTransfers(): InboundAchTransferServiceAsync.WithRawResponse =
            inboundAchTransfers

        override fun wireTransfers(): WireTransferServiceAsync.WithRawResponse = wireTransfers

        override fun inboundWireTransfers(): InboundWireTransferServiceAsync.WithRawResponse =
            inboundWireTransfers

        override fun inboundWireDrawdownRequests():
            InboundWireDrawdownRequestServiceAsync.WithRawResponse = inboundWireDrawdownRequests

        override fun checkTransfers(): CheckTransferServiceAsync.WithRawResponse = checkTransfers

        override fun inboundCheckDeposits(): InboundCheckDepositServiceAsync.WithRawResponse =
            inboundCheckDeposits

        override fun realTimePaymentsTransfers():
            RealTimePaymentsTransferServiceAsync.WithRawResponse = realTimePaymentsTransfers

        override fun inboundRealTimePaymentsTransfers():
            InboundRealTimePaymentsTransferServiceAsync.WithRawResponse =
            inboundRealTimePaymentsTransfers

        override fun checkDeposits(): CheckDepositServiceAsync.WithRawResponse = checkDeposits

        override fun inboundMailItems(): InboundMailItemServiceAsync.WithRawResponse =
            inboundMailItems

        override fun programs(): ProgramServiceAsync.WithRawResponse = programs

        override fun accountStatements(): AccountStatementServiceAsync.WithRawResponse =
            accountStatements

        override fun documents(): DocumentServiceAsync.WithRawResponse = documents
    }
}
