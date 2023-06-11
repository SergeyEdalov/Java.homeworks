// реализовать простой калькулятор
import java.util.Scanner;
public class Task_3 {
    public static void main(String[] args) throws java.io.IOException {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Enter number one: ");
        double a = iScanner.nextDouble();
        System.out.printf("Enter number two: ");
        double b = iScanner.nextDouble();
        System.out.printf("Enter math action (+, -, *, /): ");
        char c = (char) System.in.read ();
        iScanner.close();
        System.out.println("Calculation result is " + calculator(a, b, c));
    }

    static double calculator (double a, double b, char c) {
        double result = 0;
        if (c == '+') result = a + b;
        if (c == '-') result = a - b;
        if (c == '*') result = a * b;
        if (c == '/') result = a / b;
         
        return result;
    }
}
