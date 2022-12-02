package org.example.fabryka;

public class VirtualProduct implements Product {
    @Override
    public String getProductName() {
        return "This is virtual product.";
    }
}
