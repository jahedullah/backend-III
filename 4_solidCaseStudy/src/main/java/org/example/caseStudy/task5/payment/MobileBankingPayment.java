package org.example.caseStudy.task5.payment;

public class MobileBankingPayment implements PaymentStrategy {
    @Override
    public boolean processPayment(double amount) {
        System.out.println("paying thru mobile banking");
        return true;
    }

    @Override
    public boolean refundPayment(String transactionId) {
        System.out.println("successfully refunded to mobile wallet");
        return true;
    }
}
