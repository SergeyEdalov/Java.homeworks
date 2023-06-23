package Homeworks.Homework_3.Task_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task_2 {
    /**
     * 2. Сведения о товаре состоят из наименования, страны-производителя, веса, цены, сорта.
     * Получить наименования товаров заданного сорта с наименьшей ценой.
     */
    public static void main(String[] args) {

        int sort = enterSortProduct();
        List<Product> productList = create();
        List<String> minProductList = createMinList(sort, productList);
        System.out.println(minProductList);
    }
    public static Integer enterSortProduct() {
        Scanner sc = new Scanner(System.in);
        int sort;
        while (true) {
            System.out.printf("Enter sort of product(must be from 1 to 3): ");
            sort = sc.nextInt();
            if (sort >= 1 && sort <= 3) {
                break;
            }
        }
        sc.close();
        return sort;
    }
    public static List<Product> create() {
        Product product1 = new Product("potato", "Belorussya", 2.1, 15.99, 1);
        Product product2 = new Product("apple", "USA", 0.5, 12.56, 2);
        Product product3 = new Product("cucumber", "Brazil", 1.3, 15.99, 1);
        Product product4 = new Product("tomato", "Turkish", 0.7, 13.40, 2);
        Product product5 = new Product("tea", "India", 1.0, 22.1, 1);

        List<Product> productList = new ArrayList<>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
        productList.add(product5);
        return productList;
    }

        public static List<String> createMinList(int sort, List<Product> productList) {
        List<String> minProductList = new ArrayList<>();
        double minPrice = 100;
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getSort() == sort && productList.get(i).getPrice() <= minPrice) {
                minProductList.add(productList.get(i).getName());
                minProductList.add(String.valueOf(productList.get(i).getPrice()));
                minPrice = productList.get(i).getPrice();
            }
        }
        return minProductList;
    }
}
