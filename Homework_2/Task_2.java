package Homeworks.Homework_2;
import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int b = sc.nextInt();
        int b1;
        int falseNum = 0;
        for (int i = 1; i < size; i++) {
            b1 = sc.nextInt();
            if (b > b1) {
                falseNum++;
            }
            b = b1;
        }
        if (falseNum == 0) System.out.println("Последовательность возрастающая");
        else System.out.println("Последовательность не возрастающая");


        /**
         * @apiNote Дана последовательность из N целых чисел.
         * Верно ли, что последовательность является возрастающей.
         */
    }
}
