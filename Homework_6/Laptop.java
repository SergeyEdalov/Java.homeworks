package Homeworks.Homework_6;

import java.util.*;

public class Laptop {
    public String manufacturer;
    public Integer price;
    public String operationSystem;
    public Double screenDiagonal;
    public String color;
    public Integer operationMemory;
    public Integer hardDiskMemory;

    public Laptop(String manufacturer, Integer price, String operationSystem, Double screenDiagonal, String color, Integer operationMemory, Integer hardDiskMemory) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.operationSystem = operationSystem;
        this.screenDiagonal = screenDiagonal;
        this.color = color;
        this.operationMemory = operationMemory;
        this.hardDiskMemory = hardDiskMemory;
    }

    public String getManufacturer() {
        return manufacturer.toLowerCase();
    }


    public Integer getPrice() {
        return price;
    }


    public String getOperationSystem() {
        return operationSystem.toLowerCase();
    }


    public Double getScreenDiagonal() {
        return screenDiagonal;
    }


    public String getColor() {
        return color.toLowerCase();
    }


    public Integer getOperationMemory() {
        return operationMemory;
    }


    public Integer getHardDiskMemory() {
        return hardDiskMemory;
    }


    /**
     * @apiNote метод создания множества ноутбуков
     * @return
     */
    public static Set<Laptop> createSetNotebook() {
        Laptop laptop1 = new Laptop("Apple", 15990, "MAC",
                15.6, "Grey", 8, 1000);
        Laptop laptop2 = new Laptop("Lenovo", 24990, "Windows10",
                15.6, "Black", 12, 1000);
        Laptop laptop3 = new Laptop("Dexp", 18999, "Windows10",
                17.9, "Grey", 8, 2000);
        Laptop laptop4 = new Laptop("ASUS", 75000, "Windows11",
                17.9, "White", 16, 2000);
        Laptop laptop5 = new Laptop("Acer", 35550, "Linux",
                15.6, "Blue", 16, 1000);
        Set<Laptop> baseLaptop = new HashSet<>();
        baseLaptop.add(laptop1);
        baseLaptop.add(laptop2);
        baseLaptop.add(laptop3);
        baseLaptop.add(laptop4);
        baseLaptop.add(laptop5);
        return baseLaptop;
    }

    /**
     * @apiNote метод вывода ноутбуков
     * @param laptops - множество ноутбуков
     */
    public static void showLaptop(Set<Laptop> laptops) {
        for (Laptop item : laptops) {
            System.out.println("производитель: " + item.getManufacturer() + "; " + "цена: " + item.getPrice() + "; " + "операционная система: " +
                    item.getOperationSystem() + "; " + "диагональ экрана: " + item.getScreenDiagonal() + "; " + "цвет: " + item.getColor() + "; " +
                    "объем оперативной памяти: " + item.getOperationMemory() + "; " +
                    "объем памяти жестокого диска: " + item.getHardDiskMemory() + "; ");
        }
    }

    /**
     * @apiNote метод создания списка критериев
     * @return - список всех критериев выбора ноутбуков
     */
    public static Map<Integer, String> filterСriteria() {
        Map<Integer, String> criteria = new HashMap<>();
        criteria.put(1, "производитель");
        criteria.put(2, "цена");
        criteria.put(3, "операционная система");
        criteria.put(4, "диагональ экрана");
        criteria.put(5, "цвет");
        criteria.put(6, "объем оперативной памяти");
        criteria.put(7, "объем памяти жестокого диска");
        criteria.put(8, "продолжить");
        return criteria;
    }

    /**
     * @apiNote метод вывода критериев
     * @param criteria - список критериев
     */
    public static void showCriteria(Map<Integer, String> criteria) {
        for (Map.Entry<Integer, String> entity : criteria.entrySet()) {
            System.out.println(entity.getKey() + " - " + entity.getValue());
        }
    }

    /**
     * @apiNote метод получения критериев от пользователя
     * @param criteria - список критериев
     * @return список критериев от пользователя
     */
    public static Map<Integer, String> queryСriteria(Map<Integer, String> criteria) {
        Map<Integer, String> userCriteria = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер критерия: ");
        int number = sc.nextInt();
        String value = null;
        while (number != 8) {
            for (Map.Entry<Integer, String> entity : criteria.entrySet()) {
                if (number == entity.getKey()) {
                    System.out.println("Введите значение: ");
                    value = sc.next();
                    userCriteria.put(number, value);
                }
            }
            System.out.println("Введите номер критерия: ");
            number = sc.nextInt();
        }
        sc.close();
        return userCriteria;
    }
//    фильтр можно реализовать с помощью пересохранения элементов в новую коллекцию, а сравнивать можно через ключ-значение

    /**
     * @apiNote метод фильтрации
     * @param laptops - множество экземлпяров ноутбуков
     * @param userCriteria - критерии, которые выбрал пользователь
     * @return возвращает фильтр ноутбуков, где ключ - экземпляр ноутбука, значение - кол-во совпадений по критериям
     */
    public static Set<Laptop> filterLaptops(Set<Laptop> laptops, Map<Integer, String> userCriteria) {
        Set<Laptop> filterLaptops = new HashSet<>();
        int coincidence;
        for (Laptop item : laptops) {
            coincidence = 0;
            for (Map.Entry<Integer, String> entity : userCriteria.entrySet()) {
                if (entity.getKey() == 1) {
                    if (item.getManufacturer().equals(entity.getValue().toLowerCase())) {
                        coincidence++;
                    }
                } else if (entity.getKey() == 2) {
                    int num2 = Integer.parseInt(entity.getValue());
                    if (item.getPrice() <= num2) {
                        coincidence++;
                    }
                } else if (entity.getKey() == 3) {
                    if (item.getOperationSystem().equals(entity.getValue().toLowerCase())) {
                        coincidence++;
                    }
                } else if (entity.getKey() == 4) {
                    double num4 = Double.parseDouble(entity.getValue());
                    if (item.getScreenDiagonal() <= num4) {
                        coincidence++;
                    }
                } else if (entity.getKey() == 5) {
                    if (item.getColor().equals(entity.getValue().toLowerCase())) {
                        coincidence++;
                    }
                } else if (entity.getKey() == 6) {
                    int num6 = Integer.parseInt(entity.getValue());
                    if (item.getOperationMemory() <= num6) {
                        coincidence++;
                    }
                } else if (entity.getKey() == 7) {
                    int num7 = Integer.parseInt(entity.getValue());
                    if (item.getHardDiskMemory() <= num7) {
                        coincidence++;
                    }
                }
                if (coincidence > 0) {
                    filterLaptops.add(item);
                }
            }
        }
        return filterLaptops;
    }
/**
 * нереализованный метод сортировки. Так и не понял, как можно её провести
 */
//    public static Set<Laptop> sortedLaptops(Map<Laptop, Integer> filterLaptops) {
////        filterLaptops.entrySet().stream()
////                .sorted(Map.Entry.<Laptop, Integer>comparingByValue().reversed())
////                .forEach(System.out::println);
//
//        List<Map.Entry<Laptop, Integer>> entries = new LinkedList<Map.Entry<Laptop, Integer>>(filterLaptops.entrySet());
//
//        Collections.sort(entries, new Comparator<Map.Entry<Laptop, Integer>>() {
//            @Override
//            public int compare(Map.Entry<Laptop, Integer> entry1, Map.Entry<Laptop, Integer> entry2) {
//                return entry1.getValue().compareTo(entry2.getValue());
//            }
//        });
//
//        Map<Laptop, Integer> sortedMap = new LinkedHashMap<Laptop, Integer>();
//        for (Map.Entry<Laptop, Integer> entry : entries) {
//            sortedMap.put(entry.getKey(), entry.getValue());
//        }
//
////        Map<Laptop, Integer> sortedLaptops = new TreeMap<Laptop, Integer>(
////                Comparator.comparing(filterLaptops::get));
////        sortedLaptops.putAll(filterLaptops);
//
//
////        for (Map.Entry<Integer, String> entity : criteria.entrySet())
////        for (int i = 0; i < filterLaptops.size() - 1; i++)
////        {
////            int pos = i;
////            for (int j = i + 1; j < filterLaptops.size(); j++)
////            {
////                if (filterLaptops.get(j) > filterLaptops.get(pos)) pos = j;
////            }
////            int temp = filterLaptops.get(i);
////            filterLaptops.get(i) = filterLaptops.get(pos);
////            filterLaptops.get(pos) = temp;
////        }
////        return collection;
//        return sortedMap.keySet();
//    }
}

