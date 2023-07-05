// Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n) 

import java.util.Scanner;

public class Seminar_1_1 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Введите число: ");
        int sum = 0;
        int prod = 1;
        if (num.hasNextInt()) {
            int n = num.nextInt();
            for (int i = 1; i <= n; i++) {
                sum += i;
                prod *= i;
            }
        System.out.printf("Сумма чисел от 1 до %d: %d%n", n, sum);
        System.out.printf("Произведение чисел от 1 до %d: %d%n", n, prod);
        }
        else {
            System.out.println("Вы ввели не число!");
        }
      num.close(); 
    }
}