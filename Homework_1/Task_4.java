
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task_4 {
    public static void main(String[] args) {
        String s = "    небо синее в   очень  далеком  мире    ";


        String[] arrayString = s.trim().split(" ");

//        List<String> list = new ArrayList<>(Arrays.asList(arrayString));
//        list.remove(" ");
//        System.out.println(list.toString());
//        arrayString = list.toArray(new String[list.size()]);
        int j = arrayString.length - 1;
        String temp = "";
        for (int i = 0; i < arrayString.length / 2; i++, j--) {
            temp = arrayString[i];
            arrayString[i] = arrayString[j];
            arrayString[j] = temp;
        }
        for (int i = 0; i < arrayString.length; i++) {
            arrayString[i].trim();
            System.out.print(arrayString[i] + " ");
        }
    }


    /**
     *@apiNote  Учитывая входную строку s, измените порядок слов на противоположный .
     * Слово определяется как последовательность не пробельных символов.
     * Слова в будут разделены хотя бы одним пробелом .s
     * Возвращает строку слов в обратном порядке, объединенных одним пробелом.
     */

}

