// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.core.ClientOptions
import com.increase.api.services.blocking.simulations.AccountStatementService
import com.increase.api.services.blocking.simulations.AccountTransferService
import com.increase.api.services.blocking.simulations.AchTransferService
import com.increase.api.services.blocking.simulations.CardAuthorizationExpirationService
import com.increase.api.services.blocking.simulations.CardAuthorizationService
import com.increase.api.services.blocking.simulations.CardFuelConfirmationService
import com.increase.api.services.blocking.simulations.CardIncrementService
import com.increase.api.services.blocking.simulations.CardRefundService
import com.increase.api.services.blocking.simulations.CardReversalService
import com.increase.api.services.blocking.simulations.CardSettlementService
import com.increase.api.services.blocking.simulations.CardTokenService
import com.increase.api.services.blocking.simulations.CheckDepositService
import com.increase.api.services.blocking.simulations.CheckTransferService
import com.increase.api.services.blocking.simulations.DigitalWalletTokenRequestService
import com.increase.api.services.blocking.simulations.DocumentService
import com.increase.api.services.blocking.simulations.InboundAchTransferService
import com.increase.api.services.blocking.simulations.InboundCheckDepositService
import com.increase.api.services.blocking.simulations.InboundMailItemService
import com.increase.api.services.blocking.simulations.InboundRealTimePaymentsTransferService
import com.increase.api.services.blocking.simulations.InboundWireDrawdownRequestService
import com.increase.api.services.blocking.simulations.InboundWireTransferService
import com.increase.api.services.blocking.simulations.InterestPaymentService
import com.increase.api.services.blocking.simulations.PendingTransactionService
import com.increase.api.services.blocking.simulations.PhysicalCardService
import com.increase.api.services.blocking.simulations.ProgramService
import com.increase.api.services.blocking.simulations.RealTimePaymentsTransferService
import com.increase.api.services.blocking.simulations.WireDrawdownRequestService
import com.increase.api.services.blocking.simulations.WireTransferService
import java.util.function.Consumer

interface SimulationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SimulationService

    fun interestPayments(): InterestPaymentService

    fun accountTransfers(): AccountTransferService

    fun cardAuthorizations(): CardAuthorizationService

    fun cardAuthorizationExpirations(): CardAuthorizationExpirationService

    fun cardSettlements(): CardSettlementService

    fun cardReversals(): CardReversalService

    fun cardIncrements(): CardIncrementService

    fun cardFuelConfirmations(): CardFuelConfirmationService

    fun cardRefunds(): CardRefundService

    fun physicalCards(): PhysicalCardService

    fun digitalWalletTokenRequests(): DigitalWalletTokenRequestService

    fun pendingTransactions(): PendingTransactionService

    fun achTransfers(): AchTransferService

    fun inboundAchTransfers(): InboundAchTransferService

    fun wireTransfers(): WireTransferService

    fun inboundWireTransfers(): InboundWireTransferService

    fun wireDrawdownRequests(): WireDrawdownRequestService

    fun inboundWireDrawdownRequests(): InboundWireDrawdownRequestService

    fun checkTransfers(): CheckTransferService

    fun inboundCheckDeposits(): InboundCheckDepositService

    fun realTimePaymentsTransfers(): RealTimePaymentsTransferService

    fun inboundRealTimePaymentsTransfers(): InboundRealTimePaymentsTransferService

    fun checkDeposits(): CheckDepositService

    fun inboundMailItems(): InboundMailItemService

    fun programs(): ProgramService

    fun accountStatements(): AccountStatementService

    fun documents(): DocumentService

    fun cardTokens(): CardTokenService

    /** A view of [SimulationService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SimulationService.WithRawResponse

        fun interestPayments(): InterestPaymentService.WithRawResponse

        fun accountTransfers(): AccountTransferService.WithRawResponse

        fun cardAuthorizations(): CardAuthorizationService.WithRawResponse

        fun cardAuthorizationExpirations(): CardAuthorizationExpirationService.WithRawResponse

        fun cardSettlements(): CardSettlementService.WithRawResponse

        fun cardReversals(): CardReversalService.WithRawResponse

        fun cardIncrements(): CardIncrementService.WithRawResponse

        fun cardFuelConfirmations(): CardFuelConfirmationService.WithRawResponse

        fun cardRefunds(): CardRefundService.WithRawResponse

        fun physicalCards(): PhysicalCardService.WithRawResponse

        fun digitalWalletTokenRequests(): DigitalWalletTokenRequestService.WithRawResponse

        fun pendingTransactions(): PendingTransactionService.WithRawResponse

        fun achTransfers(): AchTransferService.WithRawResponse

        fun inboundAchTransfers(): InboundAchTransferService.WithRawResponse

        fun wireTransfers(): WireTransferService.WithRawResponse

        fun inboundWireTransfers(): InboundWireTransferService.WithRawResponse

        fun wireDrawdownRequests(): WireDrawdownRequestService.WithRawResponse

        fun inboundWireDrawdownRequests(): InboundWireDrawdownRequestService.WithRawResponse

        fun checkTransfers(): CheckTransferService.WithRawResponse

        fun inboundCheckDeposits(): InboundCheckDepositService.WithRawResponse

        fun realTimePaymentsTransfers(): RealTimePaymentsTransferService.WithRawResponse

        fun inboundRealTimePaymentsTransfers():
            InboundRealTimePaymentsTransferService.WithRawResponse

        fun checkDeposits(): CheckDepositService.WithRawResponse

        fun inboundMailItems(): InboundMailItemService.WithRawResponse

        fun programs(): ProgramService.WithRawResponse

        fun accountStatements(): AccountStatementService.WithRawResponse

        fun documents(): DocumentService.WithRawResponse

        fun cardTokens(): CardTokenService.WithRawResponse
    }
}
