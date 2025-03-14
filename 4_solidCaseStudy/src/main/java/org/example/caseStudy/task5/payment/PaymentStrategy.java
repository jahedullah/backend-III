package org.example.caseStudy.task5.payment;

public interface PaymentStrategy {
    boolean processPayment(double amount);
    boolean refundPayment(String transactionId);
}
