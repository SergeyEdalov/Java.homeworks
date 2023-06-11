// 2) Вывести все простые числа от 1 до 1000

public class Task_2 {
    public static void main(String[] args) {
        simpleNum();
    }

    static void simpleNum() {
        for (int i = 3; i < 1001; i += 2) { 
            if ((i > 10) && (i%10 == 5)) {
                continue;
            }          
            for (int j = 2; j < i; j++) {
                if (j * (j - 1) > i){
                    System.out.println(i); 
                    break;                                   
                }
                if (i % j == 0) break; 
                else System.out.println(i); 
            }
        }
}
}

