package org.example.fabryka.fabryka2;

public class ProductCreator implements Creator{
    @Override
    public Product getProductByType(ProductType type) {
        switch (type){
            case SIMPLE -> {
                return new SimpleProduct();
            }
            case VIRUTAL -> {
                return new VirtualProduct();
            }
            case ADVANCED -> {
                return new AdvancedProduct();
            }
        }
        return null;
    }
}
