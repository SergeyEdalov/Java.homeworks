package Homeworks.Homework_2;

public class Task_3 {
    public static void main(String[] args) {
        int[] array = {1, 22, 33, 44, 5, -5, -3, 23, -7, 120, -25};
        int sumIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 10 && array[i] < 100 || array[i] > - 100 && array[i] < - 10) {
                sumIndex += i;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array[i] = sumIndex;
            }
            System.out.print(array[i] + " ");
        }
        /**
         * @apiNote Дан массив целых чисел. Заменить отрицательные элементы на сумму индексов
         * двузначных элементов массива.
         * Пример:
         * Массив = {1, 22, 33, 44, 5, -5, -3, 23, -7}
         * Сумма индексов двузначных элементов массива = 1+2+3+7 = 13
         * Массив после замены отрицательных на сумму = {1, 22, 33, 44, 5, 13, 13, 23, 13}
         */
    }
}
