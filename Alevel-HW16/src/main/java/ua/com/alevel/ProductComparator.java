package ua.com.alevel;

import java.util.Comparator;

public class ProductComparator implements Comparator<Product> {

    @Override
    public int compare(Product leftProduct, Product rightProduct) {
        return leftProduct.getCategory().categoryId - rightProduct.getCategory().categoryId;
    }



}
