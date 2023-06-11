// 2) Дана последовательность целых чисел, оканчивающаяся нулем. 
// Найти сумму положительных чисел, после которых следует отрицательное число.
// Пример ввода:
// 1 2 1 2 -1 1 3 1 3 -1 0
// Логика расчета:
// 2 -1 переход -> 2 в сумму
// 3 -1 переход -> 3 в сумму
// Пример вывода: 5
import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int num = sc.nextInt();
        int sum = 0;

        while (num != 0) {
            num = sc.nextInt();

            if (getSumPositiveNumbers(a, num)) {
                sum += a;
            }
            a = num;
        }
        System.out.println("summa = " + sum);
        /**
         * @apiNote 2) Дана последовательность целых чисел, оканчивающаяся нулем.
         * Найти сумму положительных чисел, после которых следует отрицательное число.
         * Пример ввода:
         * 1 2 1 2 -1 1 3 1 3 -1 0
         * Логика расчета:
         * 2 -1 переход -> 2 в сумму
         * 3 -1 переход -> 3 в сумму
         * Пример вывода: 5
         */
    }
    public static boolean getSumPositiveNumbers(int a, int b) {
        return a >= 0 && b < 0;
    }
}
