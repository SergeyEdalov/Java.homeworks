package Homeworks.Homework_4;

import java.util.LinkedList;
import java.util.Queue;

public class Task_2 {
    /**
     * Учитывая строку s, содержащую только символы '(', ')', '{', и , определите '}',
     * допустима ли входная строка.'['']'
     * Входная строка действительна, если:
     * Открытые скобки должны быть закрыты однотипными скобками.
     * Открытые скобки должны быть закрыты в правильном порядке.
     * Каждой закрывающей скобке соответствует открытая скобка того же типа.
     *
     * @param s - строка
     * @return true, если очередь по итогу пуста или false, если очередь заполнена элементами
     * @apiNote применение очереди
     */

    public static void main(String[] args) {
        String s = "()[]{}";
        System.out.println("isValid(s) = " + isValid(s));
    }

    public static boolean isValid(String s) {
        Queue<Character> list = new LinkedList<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                list.add(c);
            } else {
                if (list.isEmpty()) {
                    return false;
                } else {
                    if (c == ')' && list.peek() == '(' ||
                            c == '}' && list.peek() == '{' ||
                            c == ']' && list.peek() == '[') {
                        list.poll();
                    } else return false;
                }
            }
        }
        return list.isEmpty();
    }
}

