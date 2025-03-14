package org.example.caseStudy.task5;


import lombok.Getter;
import org.example.caseStudy.task5.payment.Payment;

import java.util.Objects;
import java.util.UUID;

@Getter
public class Invoice {
    private String invoiceId;
    private String invoiceOf;
    private Order order;
    private Payment payment;

    private Invoice(String invoiceId, String invoiceOf, Order order, Payment payment) {
        this.invoiceId = invoiceId;
        this.invoiceOf = invoiceOf;
        this.order = order;
        this.payment = payment;
    }

    public static class Builder extends BaseBuilder<Invoice, Builder> {
        private String invoiceId;
        private String invoiceOf;
        private Order order;
        private Payment payment;

        public Builder invoiceFor(String invoiceOf) {
            this.invoiceOf = invoiceOf;
            return self();
        }

        public Builder withOrder(Order order) {
            this.order = order;
            return self();
        }

        public Builder withPayment(Payment payment) {
            this.payment = payment;
            return self();
        }

        @Override
        protected Invoice createInstance() {
            if (Objects.isNull(order) || Objects.isNull(payment) || invoiceOf.isEmpty()) {
                throw new IllegalArgumentException("Few parameters are missing");
            }
            invoiceId = String.valueOf(UUID.randomUUID());
            return new Invoice(invoiceId, invoiceOf, order, payment);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }
}
