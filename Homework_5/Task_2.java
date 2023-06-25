package Homeworks.Homework_5;

import java.util.*;
import java.util.stream.Collectors;

public class Task_2 {
    /**
     * 2) Пусть дан список сотрудников:
     * Иван Иванов
     * Светлана Петрова
     * Кристина Белова
     * Анна Мусина
     * Анна Крутова
     * Иван Юрин
     * Петр Лыков
     * Павел Чернов
     * Петр Чернышов
     * Мария Федорова
     * Марина Светлова
     * Мария Савина
     * Мария Рыкова
     * Марина Лугова
     * Анна Владимирова
     * Иван Мечников
     * Петр Петин
     * Иван Ежов
     * Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений.
     * Отсортировать по убыванию популярности.
     */

    public static void main(String[] args) {
        List<String> staffList = new ArrayList<>(Arrays.asList("Иван Иванов", "Светлана Петрова",
                "Кристина Белова", "Анна Мусина", "Анна Крутова", "Иван Юрин", "Петр Лыков", "Павел Чернов",
                "Петр Чернышов", "Мария Федорова", "Марина Светлова", "Мария Савина", "Мария Рыкова",
                "Марина Лугова", "Анна Владимирова", "Иван Мечников", "Петр Петин", "Иван Ежов"));

        printFirstNames(sortMap(findCoincidence(staffList)));
    }

    /**
     * @apiNote функция поиска совпадений по именам
     * @param staffList - список сотрудников
     * @return список повторяющихся имен и кол-во повторений
     */
    public static Map<String, Integer> findCoincidence(List<String> staffList) {
        Map<String, Integer> findCoincidence = new HashMap<>();
        for (String s : staffList) {
            String[] array = s.split(" ");
            findCoincidence.putIfAbsent(array[0], 0);
            findCoincidence.put(array[0], findCoincidence.get(array[0]) + 1);
        }
        return findCoincidence;
    }

    /**
     * @apiNote функция сортировки списка
     * @param findCoincidence - список повторяющихся имен и кол-во повторений
     * @return отсортированный список повторяющихся имен и кол-во повторений
     */
    private static Map<String, Integer> sortMap(Map<String, Integer> findCoincidence) {
        Map<String, Integer> sortedMap1 = findCoincidence.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a, b) -> a,
                        LinkedHashMap::new
                ));
        return sortedMap1;
    }

    /**
     * @apiNote Вывод в консоль списка
     * @param findCoincidence - отсортированный список повторяющихся имен и кол-во повторений
     */
    public static void printFirstNames(Map<String, Integer> findCoincidence) {
        for (Map.Entry<String, Integer> entity : findCoincidence.entrySet()) {
            if (entity.getValue() > 1)
                System.out.println(entity.getKey() + " встретился(ась) в списке имен : " + entity.getValue() + " раз(а)");
        }
    }
}
