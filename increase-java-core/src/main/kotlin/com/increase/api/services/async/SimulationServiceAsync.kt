// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.ClientOptions
import com.increase.api.services.async.simulations.AccountStatementServiceAsync
import com.increase.api.services.async.simulations.AccountTransferServiceAsync
import com.increase.api.services.async.simulations.AchTransferServiceAsync
import com.increase.api.services.async.simulations.CardAuthorizationExpirationServiceAsync
import com.increase.api.services.async.simulations.CardAuthorizationServiceAsync
import com.increase.api.services.async.simulations.CardBalanceInquiryServiceAsync
import com.increase.api.services.async.simulations.CardDisputeServiceAsync
import com.increase.api.services.async.simulations.CardFuelConfirmationServiceAsync
import com.increase.api.services.async.simulations.CardIncrementServiceAsync
import com.increase.api.services.async.simulations.CardRefundServiceAsync
import com.increase.api.services.async.simulations.CardReversalServiceAsync
import com.increase.api.services.async.simulations.CardSettlementServiceAsync
import com.increase.api.services.async.simulations.CardTokenServiceAsync
import com.increase.api.services.async.simulations.CheckDepositServiceAsync
import com.increase.api.services.async.simulations.CheckTransferServiceAsync
import com.increase.api.services.async.simulations.DigitalWalletTokenRequestServiceAsync
import com.increase.api.services.async.simulations.DocumentServiceAsync
import com.increase.api.services.async.simulations.InboundAchTransferServiceAsync
import com.increase.api.services.async.simulations.InboundCheckDepositServiceAsync
import com.increase.api.services.async.simulations.InboundFednowTransferServiceAsync
import com.increase.api.services.async.simulations.InboundMailItemServiceAsync
import com.increase.api.services.async.simulations.InboundRealTimePaymentsTransferServiceAsync
import com.increase.api.services.async.simulations.InboundWireDrawdownRequestServiceAsync
import com.increase.api.services.async.simulations.InboundWireTransferServiceAsync
import com.increase.api.services.async.simulations.InterestPaymentServiceAsync
import com.increase.api.services.async.simulations.PendingTransactionServiceAsync
import com.increase.api.services.async.simulations.PhysicalCardServiceAsync
import com.increase.api.services.async.simulations.ProgramServiceAsync
import com.increase.api.services.async.simulations.RealTimePaymentsTransferServiceAsync
import com.increase.api.services.async.simulations.WireDrawdownRequestServiceAsync
import com.increase.api.services.async.simulations.WireTransferServiceAsync
import java.util.function.Consumer

interface SimulationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SimulationServiceAsync

    fun interestPayments(): InterestPaymentServiceAsync

    fun accountTransfers(): AccountTransferServiceAsync

    fun cardAuthorizations(): CardAuthorizationServiceAsync

    fun cardBalanceInquiries(): CardBalanceInquiryServiceAsync

    fun cardAuthorizationExpirations(): CardAuthorizationExpirationServiceAsync

    fun cardSettlements(): CardSettlementServiceAsync

    fun cardReversals(): CardReversalServiceAsync

    fun cardIncrements(): CardIncrementServiceAsync

    fun cardFuelConfirmations(): CardFuelConfirmationServiceAsync

    fun cardRefunds(): CardRefundServiceAsync

    fun cardDisputes(): CardDisputeServiceAsync

    fun physicalCards(): PhysicalCardServiceAsync

    fun digitalWalletTokenRequests(): DigitalWalletTokenRequestServiceAsync

    fun pendingTransactions(): PendingTransactionServiceAsync

    fun achTransfers(): AchTransferServiceAsync

    fun inboundAchTransfers(): InboundAchTransferServiceAsync

    fun wireTransfers(): WireTransferServiceAsync

    fun inboundWireTransfers(): InboundWireTransferServiceAsync

    fun wireDrawdownRequests(): WireDrawdownRequestServiceAsync

    fun inboundWireDrawdownRequests(): InboundWireDrawdownRequestServiceAsync

    fun checkTransfers(): CheckTransferServiceAsync

    fun inboundCheckDeposits(): InboundCheckDepositServiceAsync

    fun realTimePaymentsTransfers(): RealTimePaymentsTransferServiceAsync

    fun inboundRealTimePaymentsTransfers(): InboundRealTimePaymentsTransferServiceAsync

    fun inboundFednowTransfers(): InboundFednowTransferServiceAsync

    fun checkDeposits(): CheckDepositServiceAsync

    fun inboundMailItems(): InboundMailItemServiceAsync

    fun programs(): ProgramServiceAsync

    fun accountStatements(): AccountStatementServiceAsync

    fun documents(): DocumentServiceAsync

    fun cardTokens(): CardTokenServiceAsync

    /**
     * A view of [SimulationServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SimulationServiceAsync.WithRawResponse

        fun interestPayments(): InterestPaymentServiceAsync.WithRawResponse

        fun accountTransfers(): AccountTransferServiceAsync.WithRawResponse

        fun cardAuthorizations(): CardAuthorizationServiceAsync.WithRawResponse

        fun cardBalanceInquiries(): CardBalanceInquiryServiceAsync.WithRawResponse

        fun cardAuthorizationExpirations(): CardAuthorizationExpirationServiceAsync.WithRawResponse

        fun cardSettlements(): CardSettlementServiceAsync.WithRawResponse

        fun cardReversals(): CardReversalServiceAsync.WithRawResponse

        fun cardIncrements(): CardIncrementServiceAsync.WithRawResponse

        fun cardFuelConfirmations(): CardFuelConfirmationServiceAsync.WithRawResponse

        fun cardRefunds(): CardRefundServiceAsync.WithRawResponse

        fun cardDisputes(): CardDisputeServiceAsync.WithRawResponse

        fun physicalCards(): PhysicalCardServiceAsync.WithRawResponse

        fun digitalWalletTokenRequests(): DigitalWalletTokenRequestServiceAsync.WithRawResponse

        fun pendingTransactions(): PendingTransactionServiceAsync.WithRawResponse

        fun achTransfers(): AchTransferServiceAsync.WithRawResponse

        fun inboundAchTransfers(): InboundAchTransferServiceAsync.WithRawResponse

        fun wireTransfers(): WireTransferServiceAsync.WithRawResponse

        fun inboundWireTransfers(): InboundWireTransferServiceAsync.WithRawResponse

        fun wireDrawdownRequests(): WireDrawdownRequestServiceAsync.WithRawResponse

        fun inboundWireDrawdownRequests(): InboundWireDrawdownRequestServiceAsync.WithRawResponse

        fun checkTransfers(): CheckTransferServiceAsync.WithRawResponse

        fun inboundCheckDeposits(): InboundCheckDepositServiceAsync.WithRawResponse

        fun realTimePaymentsTransfers(): RealTimePaymentsTransferServiceAsync.WithRawResponse

        fun inboundRealTimePaymentsTransfers():
            InboundRealTimePaymentsTransferServiceAsync.WithRawResponse

        fun inboundFednowTransfers(): InboundFednowTransferServiceAsync.WithRawResponse

        fun checkDeposits(): CheckDepositServiceAsync.WithRawResponse

        fun inboundMailItems(): InboundMailItemServiceAsync.WithRawResponse

        fun programs(): ProgramServiceAsync.WithRawResponse

        fun accountStatements(): AccountStatementServiceAsync.WithRawResponse

        fun documents(): DocumentServiceAsync.WithRawResponse

        fun cardTokens(): CardTokenServiceAsync.WithRawResponse
    }
}
