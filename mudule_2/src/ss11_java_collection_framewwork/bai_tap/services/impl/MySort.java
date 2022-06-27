package ss11_java_collection_framewwork.bai_tap.services.impl;

import ss11_java_collection_framewwork.bai_tap.Model.Product;

import java.util.Comparator;

public class MySort implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o2.getPrice()- o1.getPrice();
    }
}
