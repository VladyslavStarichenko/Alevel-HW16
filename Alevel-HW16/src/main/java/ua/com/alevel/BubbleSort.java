package ua.com.alevel;

import java.util.ArrayList;

public class BubbleSort {


    /*I had to make a new comparator to have an opportunity of using it inside bubble sort method */
    public static void bubbleSort(ArrayList<Product> products) {
        int n = products.size();
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (comparator (products.get(j) , products.get(j+1))) {
                    Product temp = products.get(j);
                    products.set(j, products.get(j+1));
                    products.set(j+1, temp);
                }
    }

    private static boolean comparator(Product product, Product product1) {
        return product.getCategory().categoryId > product1.getCategory().categoryId;
    }
}
