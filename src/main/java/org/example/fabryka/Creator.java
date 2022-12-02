package org.example.fabryka;

public interface Creator {
    Product getProductByType(ProductType type);
}
