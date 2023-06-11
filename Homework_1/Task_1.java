
// Вычислить n-ое треугольного число (сумма чисел от 1 до n), 
// n! (произведение чисел от 1 до n)
import java.util.Scanner;
public class Task_1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Enter number: ");
        int n = iScanner.nextInt();
        iScanner.close();
        System.out.println("Summa on 1 to number is " + summ(n));
        System.out.println("Product on 1 to number is " + factorial(n));
        factorial(n);
    }
    static int summ(int a){
        int summa = 0;
        for (int i = 1; i <= a; i++) {          
            summa += i;
        }
        return summa;
    }  
    static double factorial(int a) {
        if (a == 1) return 1;
        else return a * factorial(a - 1);
    }
}