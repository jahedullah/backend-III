package org.example.caseStudy.task5;

import org.example.caseStudy.task5.payment.Payment;

public class InvoiceGenerator {
    private InvoiceGenerator() {
    }

    public static class InvoiceHelper {
        private static final InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
    }

    public static InvoiceGenerator getInstance() {
        return InvoiceHelper.invoiceGenerator;
    }

    public Invoice getInvoice(String invoiceOf, Order order, Payment payment) {
        return new Invoice.Builder()
                .invoiceFor(invoiceOf)
                .withOrder(order)
                .withPayment(payment)
                .build();
    }
}
