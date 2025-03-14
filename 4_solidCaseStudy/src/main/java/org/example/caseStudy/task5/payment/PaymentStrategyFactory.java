package org.example.caseStudy.task5.payment;

public class PaymentStrategyFactory {
    public static PaymentStrategy getPaymentStrategy(PaymentChannel paymentChannel){
        if (paymentChannel == PaymentChannel.CARD){
            return new CardPayment();
        }

        if (paymentChannel == PaymentChannel.MOBILE_BANKING){
            return new MobileBankingPayment();
        }
        return null;
    }
}
