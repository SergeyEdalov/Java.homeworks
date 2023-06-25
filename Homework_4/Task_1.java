package Homeworks.Homework_4;

import java.util.Scanner;
import java.util.Stack;

public class Task_1 {
    /**
     * Вывести список на экран в перевернутом виде (без массивов и ArrayList)
     * Пример:
     * 1 -> 2->3->4
     * Вывод:
     * 4->3->2->1
     * @apiNote 1-й способ: применение Stack
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

//        Stack<Integer> stackNumber = new Stack<>();
//        for (int i = 1; i <= n; i++) {
//            stackNumber.push(i);
//        }
//
//        int i = stackNumber.size() - 1;
//        while (i > -1) {
//            System.out.print(stackNumber.remove(i) + " ");
//            i--;
//        }
        printReverseList(n);
    }

    /**
     * @apiNote 2-й способ: применеие рекурсии
     * @param n - кол-во чисел
     * @return числа от n до 1
     */
    public static int printReverseList(int n) {
        if (n == 0) return 0;
        else {
            System.out.print(n + " ");
            return printReverseList(n - 1);
        }
    }
}
