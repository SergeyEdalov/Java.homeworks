package Homeworks.Homework_3.Task_1;

import java.util.ArrayList;
import java.util.List;

public class Task_1 {
    /**
     * Дан массив записей: наименование товара, цена, сорт.
     * Найти наибольшую цену товаров 1го или 2-го сорта среди товаров,
     * название которых содержит «высший».
     */
    public static void main(String[] args) {
        Product product1 = new Product("high potato", 15.99, 1);
        Product product2 = new Product("apple", 9.50, 2);
        Product product3 = new Product("cucumber", 11.33, 2);
        Product product4 = new Product("high lemon", 20.12, 2);
        Product product5 = new Product("high vegetable marrow", 10.00, 1);
        List<Product> productList = new ArrayList<>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
        productList.add(product5);
//        System.out.println("productList = " + productList);

        double maxPrice = 0;
        String substring = "high";

        for (Product product : productList) {
            if (product.getSort().equals(1) || product.getSort().equals(2)) {
                if (product.getName().contains(substring) && product.getPrice() > maxPrice) {
                    maxPrice = product.getPrice();
                }
            }
        }
        System.out.println("maxPrice = " + maxPrice);
    }
}
