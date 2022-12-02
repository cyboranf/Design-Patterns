package org.example.fabryka;

import static org.example.fabryka.ProductType.*;

public class Main {
    public static void main(String[] args) {
        ProductCreator creator = new ProductCreator();

        Product simple = creator.getProductByType(SIMPLE);
        System.out.println(simple.getProductName());

        Product advanced = creator.getProductByType(ADVANCED);
        System.out.println(advanced.getProductName());

        Product virtual = creator.getProductByType(VIRTUAL);
        System.out.println(virtual.getProductName());
    }
}
