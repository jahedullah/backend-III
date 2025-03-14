package org.example.caseStudy.task5;

import org.example.caseStudy.task5.payment.Payment;
import org.example.caseStudy.task5.payment.PaymentChannel;
import org.example.caseStudy.task5.payment.PaymentProcessor;

import java.util.ArrayList;
import java.util.List;

public class Task5Demo {
    public static void main(String[] args) {
        Product product1 = new Product(1, "MOBILE", "SAMSUNG", 20000, 300);
        Product product2 = new Product(2, "ELECTRONIC", "WASHING MACHINE", 31220, 300);
        Product product3 = new Product(2, "ELECTRONIC", "FRIDGE", 1212, 30);

        Inventory inventory = Inventory.getInstance();
        inventory.addProduct(product1);
        inventory.addProduct(product2);

        List<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);

        OrderProcessor orderProcessor = new OrderProcessor();
        Order order = orderProcessor.createOrder(products);

        Payment payment = Payment.fromOrderAndPayChannel(order, PaymentChannel.CARD);

        PaymentProcessor paymentProcessor = new PaymentProcessor();
        paymentProcessor.initiatePayment(payment);

//        InvoiceGenerator invoiceGenerator = InvoiceGenerator.getInstance();
//        invoiceGenerator.getInvoice("Jahedul", order, payment);
        Invoice invoice = new Invoice.Builder()
                .invoiceFor("Jahedul")
                .withPayment(payment)
                .withOrder(order).build();

        System.out.println(invoice.toString());
        System.out.println("Here is the invoice record");
        System.out.println("Total price: " + invoice.getOrder().getTotalPrice());
        System.out.println("Payment done with" + invoice.getPayment().getPaymentChannel());

    }
}
