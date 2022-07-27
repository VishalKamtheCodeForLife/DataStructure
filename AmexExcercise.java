package com.example.department;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AmexExcercise{
    public static void main(String[] args) {
    //Code challenge
    //Problem Statement
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Prod1", "description 1", 20, ProductType.international));
        productList.add(new Product("Prod2", "description 2", 15, ProductType.international));
        productList.add(new Product("Prod3", "description 3", 252, ProductType.domestic));
        productList.add(new Product("Prod4", "description 4", 98, ProductType.domestic));
        productList.add(new Product("Prod5", "description 5", 10, ProductType.domestic));
        productSortedList(productList,ProductType.international);
    }

    private static void productSortedList(List<Product> productList, ProductType type) {
        Comparator<Product> productSort=new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getAmount() - o2.getAmount();
            }
        };

        List<Product> filterProductList=productList.stream().filter(p->p.type.equals(type)).sorted(Comparator.comparingInt(Product::getAmount)).collect(Collectors.toList());
        for(Product p:filterProductList){
            System.out.println(p.toString());
        }
    }
}
