package Homeworks.Homework_2;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b;
        int sum = 0;
        for (int i = 0; i < a; i++) {
            b = sc.nextInt();

            if (isSimple(b)) {
                sum += b;
            }
        }
        System.out.println("summa = " + sum);

    }

    public static boolean isSimple(int number) {
        if (number <= 2) return false;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
        /**
         * @apiNote Дана последовательность N целых чисел.
         * Найти сумму простых чисел.
         */
}


