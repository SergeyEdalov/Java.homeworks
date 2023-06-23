package Homeworks.Homework_3.Task_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task_4 {
    /**
     * Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
     */
    public static void main(String[] args) {
        List<Integer> listOfNumbers = new ArrayList<>();
        Collections.addAll(listOfNumbers, 1, 5, 7, 3, 4, 10, -8, -2, 0, 8, 15, 3);
        System.out.println(listOfNumbers);
        quickSort(listOfNumbers, 0, listOfNumbers.size() - 1);
        System.out.println(listOfNumbers);
        System.out.println("min value" + listOfNumbers.get(0));
        System.out.println("max value = " + listOfNumbers.get(listOfNumbers.size() - 1));
        System.out.println("middle value = " + listOfNumbers.get((listOfNumbers.size() - 1) / 2));
    }
    private static List<Integer> quickSort(List<Integer> listOfNumbers, int left, int right) {

        int i = left;
        int j = right;
        int pivot = listOfNumbers.get(left + (right - left) / 2);

        if (i >= j) return listOfNumbers;
        while (i <= j) {
            while (listOfNumbers.get(i) < pivot) i++;
            while (listOfNumbers.get(j) > pivot) j--;

            if (i <= j) {
                int t = listOfNumbers.get(i);
                listOfNumbers.set(i, listOfNumbers.get(j));
                listOfNumbers.set(j, t);
                i++;
                j--;
            }
        }
        if (i < right) quickSort(listOfNumbers, i, right);
        if (left < j) quickSort(listOfNumbers, left, j);
        return listOfNumbers;
    }
}
