package org.example.caseStudy.task5;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private int productId;
    private String productCategory;
    private String productName;
    private double price;
    private int productCount;
}
