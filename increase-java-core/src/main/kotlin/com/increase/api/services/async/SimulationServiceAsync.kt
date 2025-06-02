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
import com.increase.api.services.async.simulations.FeePaymentServiceAsync
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

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun interestPayments(): InterestPaymentServiceAsync

    fun feePayments(): FeePaymentServiceAsync

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

    /**
     * A view of [SimulationServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        fun interestPayments(): InterestPaymentServiceAsync.WithRawResponse

        fun feePayments(): FeePaymentServiceAsync.WithRawResponse

        fun cardAuthorizations(): CardAuthorizationServiceAsync.WithRawResponse

        fun cardAuthorizationExpirations(): CardAuthorizationExpirationServiceAsync.WithRawResponse

        fun cardSettlements(): CardSettlementServiceAsync.WithRawResponse

        fun cardReversals(): CardReversalServiceAsync.WithRawResponse

        fun cardIncrements(): CardIncrementServiceAsync.WithRawResponse

        fun cardFuelConfirmations(): CardFuelConfirmationServiceAsync.WithRawResponse

        fun cardRefunds(): CardRefundServiceAsync.WithRawResponse

        fun cardDisputes(): CardDisputeServiceAsync.WithRawResponse

        fun physicalCards(): PhysicalCardServiceAsync.WithRawResponse

        fun digitalWalletTokenRequests(): DigitalWalletTokenRequestServiceAsync.WithRawResponse

        fun inboundFundsHolds(): InboundFundsHoldServiceAsync.WithRawResponse

        fun accountTransfers(): AccountTransferServiceAsync.WithRawResponse

        fun achTransfers(): AchTransferServiceAsync.WithRawResponse

        fun inboundAchTransfers(): InboundAchTransferServiceAsync.WithRawResponse

        fun wireTransfers(): WireTransferServiceAsync.WithRawResponse

        fun inboundWireTransfers(): InboundWireTransferServiceAsync.WithRawResponse

        fun inboundWireDrawdownRequests(): InboundWireDrawdownRequestServiceAsync.WithRawResponse

        fun checkTransfers(): CheckTransferServiceAsync.WithRawResponse

        fun inboundCheckDeposits(): InboundCheckDepositServiceAsync.WithRawResponse

        fun realTimePaymentsTransfers(): RealTimePaymentsTransferServiceAsync.WithRawResponse

        fun inboundRealTimePaymentsTransfers():
            InboundRealTimePaymentsTransferServiceAsync.WithRawResponse

        fun checkDeposits(): CheckDepositServiceAsync.WithRawResponse

        fun inboundMailItems(): InboundMailItemServiceAsync.WithRawResponse

        fun programs(): ProgramServiceAsync.WithRawResponse

        fun accountStatements(): AccountStatementServiceAsync.WithRawResponse

        fun documents(): DocumentServiceAsync.WithRawResponse
    }
}
