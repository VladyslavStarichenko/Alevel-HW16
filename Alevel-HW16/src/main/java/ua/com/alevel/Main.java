package ua.com.alevel;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;

public class Main {




    public static void main(String[] args) {
        ProductComparator pc = new ProductComparator();
        ArrayList<Product> products = new ArrayList<>();

        Category category1 = new Category("Protein", 1);
        Category category2 = new Category("Gainer", 2);
        Category category3 = new Category("BCAA", 3);
        Category category4 = new Category("Creatine", 4);
        Category category5 = new Category("Carnitine", 5);

        Product product1 = new Product("Optima", new BigDecimal("124.55"), category1);
        Product product2 = new Product("My Protein", new BigDecimal("104.20"), category1);
        Product product3 = new Product("Whey", new BigDecimal("124.55"), category1);
        Product product4 = new Product("Impact Way", new BigDecimal("94.25"), category2);
        Product product5 = new Product("Mass It", new BigDecimal("94.55"), category2);
        Product product6 = new Product("Gold Nutrition", new BigDecimal("244.99"), category2);
        Product product7 = new Product("Iso Way", new BigDecimal("94.55"), category3);
        Product product8 = new Product("Prime", new BigDecimal("124.55"), category3);
        Product product9 = new Product("Mass Tech", new BigDecimal("100.99"), category3);
        Product product10 = new Product("Involve", new BigDecimal("45.55"), category4);
        Product product11 = new Product("Olimpic", new BigDecimal("122.35"), category4);
        Product product12 = new Product("Maxer", new BigDecimal("116.75"), category4);
        Product product13 = new Product("Paladium", new BigDecimal("99.55"), category5);
        Product product14 = new Product("Orion", new BigDecimal("124.55"), category5);
        Product product15 = new Product("Optima", new BigDecimal("199.55"), category5);
        Product product16 = new Product("Whey", new BigDecimal("116.75"), category5);

        products.add(product10); products.add(product12); products.add(product13); products.add(product14);
        products.add(product9); products.add(product6); products.add(product11); products.add(product2);
        products.add(product5); products.add(product1); products.add(product7); products.add(product8);
        products.add(product3); products.add(product4); products.add(product15); products.add(product16);

        /*Testing of Comparator (before Bubble sort) ---> To make the list smaller,
        I decided to print part of the product' list */

//        for(Product product : products){
//            if(product.getCategory().getName().equals(category1.getName()) ||
//                    product.getCategory().getName().equals(category5.getName()))
//            System.out.println(product);
//        }
//
//        products.sort(pc);
//
//        System.out.println("--------------------------------------------------------------------------------------");
//        for(Product product : products){
//            if(product.getCategory().getName().equals(category1.getName()) ||
//                    product.getCategory().getName().equals(category5.getName()))
//                System.out.println(product);
//        }

        BubbleSort.bubbleSort(products);

        for (Product product : products) {
            if (product.getCategory().getName().equals(category1.getName()) ||
                    product.getCategory().getName().equals(category5.getName()))
                System.out.println(product);
        }
    }





}
