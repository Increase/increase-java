@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async

import com.increase.api.services.async.simulations.AccountStatementServiceAsync
import com.increase.api.services.async.simulations.AccountTransferServiceAsync
import com.increase.api.services.async.simulations.AchTransferServiceAsync
import com.increase.api.services.async.simulations.CardDisputeServiceAsync
import com.increase.api.services.async.simulations.CardRefundServiceAsync
import com.increase.api.services.async.simulations.CardServiceAsync
import com.increase.api.services.async.simulations.CheckDepositServiceAsync
import com.increase.api.services.async.simulations.CheckTransferServiceAsync
import com.increase.api.services.async.simulations.DigitalWalletTokenRequestServiceAsync
import com.increase.api.services.async.simulations.DocumentServiceAsync
import com.increase.api.services.async.simulations.InboundWireDrawdownRequestServiceAsync
import com.increase.api.services.async.simulations.InterestPaymentServiceAsync
import com.increase.api.services.async.simulations.RealTimePaymentsTransferServiceAsync
import com.increase.api.services.async.simulations.WireTransferServiceAsync

interface SimulationServiceAsync {

    fun accountTransfers(): AccountTransferServiceAsync

    fun accountStatements(): AccountStatementServiceAsync

    fun achTransfers(): AchTransferServiceAsync

    fun cardDisputes(): CardDisputeServiceAsync

    fun cardRefunds(): CardRefundServiceAsync

    fun checkTransfers(): CheckTransferServiceAsync

    fun documents(): DocumentServiceAsync

    fun digitalWalletTokenRequests(): DigitalWalletTokenRequestServiceAsync

    fun checkDeposits(): CheckDepositServiceAsync

    fun inboundWireDrawdownRequests(): InboundWireDrawdownRequestServiceAsync

    fun interestPayments(): InterestPaymentServiceAsync

    fun wireTransfers(): WireTransferServiceAsync

    fun cards(): CardServiceAsync

    fun realTimePaymentsTransfers(): RealTimePaymentsTransferServiceAsync
}
