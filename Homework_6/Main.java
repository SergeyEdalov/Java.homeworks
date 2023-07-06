package Homeworks.Homework_6;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static Homeworks.Homework_6.Laptop.showLaptop;

public class Main {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в магазин!");
        Set<Laptop> setLaptop = Laptop.createSetNotebook();
        showLaptop(setLaptop);
        System.out.println("По каким критериям вы хотите найти ноутбук: ");
        Laptop.showCriteria(Laptop.filterСriteria());
        Map<Integer, String> userCriteria = new HashMap<>(Laptop.queryСriteria(Laptop.filterСriteria()));
        Set<Laptop> FilterListLaptops = new HashSet<>(Laptop.filterLaptops(setLaptop, userCriteria));
        showLaptop(FilterListLaptops);
    }
}
