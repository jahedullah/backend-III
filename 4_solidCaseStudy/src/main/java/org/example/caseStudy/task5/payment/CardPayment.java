package org.example.caseStudy.task5.payment;

public class CardPayment implements PaymentStrategy{
    @Override
    public boolean processPayment(double amount) {
        System.out.println("paying thru card");
        return true;
    }

    @Override
    public boolean refundPayment(String transactionId) {
        System.out.println("successfully refunded to card");
        return true;
    }
}
