package org.example.caseStudy.task5.payment;

import lombok.Getter;
import lombok.Setter;
import org.example.caseStudy.task5.Order;

import java.util.UUID;

@Getter
@Setter
public class Payment {
    public Payment() {
        paymentId = String.valueOf(UUID.randomUUID());
    }

    private String paymentId;
    private PaymentStatus paymentStatus;
    private double amount;
    private PaymentChannel paymentChannel;

    public static Payment fromOrderAndPayChannel(Order order, PaymentChannel paymentChannel) {
        Payment payment = new Payment();
        payment.setPaymentChannel(paymentChannel);
        payment.setAmount(order.getTotalPrice());
        payment.setPaymentStatus(PaymentStatus.PENDING);
        return payment;
    }
}
