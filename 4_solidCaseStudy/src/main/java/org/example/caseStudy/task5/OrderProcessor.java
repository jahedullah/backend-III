package org.example.caseStudy.task5;

import java.util.List;

public class OrderProcessor {
    public Order createOrder(List<Product> products){
        Order order = new Order();
        order.setOrderStatus(OrderStatus.CREATED);
        order.setProducts(products);
        return order;
    }


}
