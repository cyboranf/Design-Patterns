package org.example.fabryka.fabryka2;

public class VirtualProduct implements Product{
    @Override
    public String getProductByName() {
        return "This is Virtual Product.";
    }
}
