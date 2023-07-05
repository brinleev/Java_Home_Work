//Реализовать простой калькулятор


import java.util.Scanner;

/**
 * Seminar_1_3
 */
public class Seminar_1_3 {

    public static void main(String[] args) {
        System.out.println("Введите первое число: ");
        Scanner num1 = new Scanner(System.in);
        double n1 = num1.nextDouble();
        System.out.println("Введите второе число: ");
        Scanner num2 = new Scanner(System.in);
        double n2 = num2.nextDouble();
        System.out.println("Какое действие желаете совершить: + , - ,* , / ");
        Scanner scanner = new Scanner(System.in);
        char operation = scanner.next().charAt(0);
        switch(operation){
            case '+':
                System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
            break;
            case '-':
                 System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
            break;
            case '*':
                 System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
            break;
            case '/':
                 System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
            break;
        }
        num1.close();
        num2.close();
        scanner.close();

    }
}
    

