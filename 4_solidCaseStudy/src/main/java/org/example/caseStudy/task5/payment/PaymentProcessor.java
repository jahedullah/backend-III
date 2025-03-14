package org.example.caseStudy.task5.payment;

import java.util.Objects;

public class PaymentProcessor {
    private PaymentStrategy paymentStrategy;

    public boolean initiatePayment(Payment payment) {
        paymentStrategy = PaymentStrategyFactory.getPaymentStrategy(payment.getPaymentChannel());
        if (Objects.nonNull(paymentStrategy)) {
            boolean isPaymentDone = paymentStrategy.processPayment(payment.getAmount());
            if (isPaymentDone){
                payment.setPaymentStatus(PaymentStatus.DONE);
            }
            return isPaymentDone;

        }
        throw new RuntimeException("No proper payment strategy found");
    }
}
