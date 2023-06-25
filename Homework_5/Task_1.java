package Homeworks.Homework_5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task_1 {
    /**
     * 1) Подсчитать количество искомого слова, через map
     * (наполнением значение, где искомое слово будет являться ключом), вносить все слова не нужно
     * Пример:
     * Россия идет вперед всей планеты. Планета — это не Россия.
     * Запрос: Россия
     * Ответ: Россия - 2
     * toLoverCase().
     * (Усложнение - игнорировать пунктуацию)
     */

    public static void main(String[] args) {

        String suggestion = "Россия идет вперед всей планеты. Планета — это не Россия.";

        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        sc.close();

        System.out.println(findWord(suggestion, word));
    }

    /**
     * @apiNote функция нахождения слова в строке, если повторяется считает сколько раз
     * @param suggestion - входная строка
     * @param word - искомое слово
     * @return findWord - колекция Map, ключ - искомое слово, значение - сколько раз встречается
     */
    public static Map<String, Integer> findWord (String suggestion, String word) {

        String transformSuggestion = suggestion.toLowerCase().replace('.', ' ');
        String[] res = transformSuggestion.split(" ");
        Map<String, Integer> findWord = new HashMap<>();
        int count = 1;
        for (int i = 0; i < res.length; i++) {
            if (res[i].equals(word.toLowerCase())) {
                findWord.put(word, count);
                count++;
            }
        }
        return findWord;
    }
}
