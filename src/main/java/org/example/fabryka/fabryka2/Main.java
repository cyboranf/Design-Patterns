package org.example.fabryka.fabryka2;

import static org.example.fabryka.fabryka2.ProductType.SIMPLE;

public class Main {
    public static void main(String[] args) {
        ProductCreator productCreator=new ProductCreator();

        Product simple= productCreator.getProductByType(SIMPLE);
        System.out.println(simple.getProductByName());
    }
}
