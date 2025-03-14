package org.example.caseStudy.task5;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Inventory {
    private Inventory() {

    }

    private Map<String, Product> productInfo = new ConcurrentHashMap<>();

    private static class InventoryHelper {
        private static final Inventory inventory = new Inventory();
    }

    public static Inventory getInstance() {
        return InventoryHelper.inventory;
    }

    public static String keyOfProduct(Integer productId, String productName) {
        return String.join(productId.toString(), productName);
    }

    public void addProduct(Product product) {
        productInfo.put(keyOfProduct(product.getProductId(), product.getProductName()), product);
    }
}
