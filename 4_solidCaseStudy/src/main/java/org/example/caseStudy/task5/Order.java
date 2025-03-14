package org.example.caseStudy.task5;


import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
public class Order {
    public Order(){
        orderId = String.valueOf(UUID.randomUUID());
    }
    private String orderId;
    private List<Product> products;
    private OrderStatus orderStatus;

    public double getTotalPrice(){
        if(!products.isEmpty()){
            return products.stream().mapToDouble(
                    Product::getPrice
            ).sum();
        }

        throw new RuntimeException("No products found");
    }
}
