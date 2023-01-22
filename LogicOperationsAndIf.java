import java.util.Scanner;

public class LogicOperationsAndIf {
    //Дано натуральное число. Определить:
    //является ли оно нечетным
    //оканчивается ли оно цифрой 2
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число:");
        int number = sc.nextInt();
        if (number % 2 != 0) {
            System.out.println("Число нечетное");
        } else {
            System.out.println("Число четное");
        }
        if (Math.abs(number % 10) == 2) {
            System.out.println("Число оканчивается на 2");
        } else {
            System.out.println("Число не оканчивается на 2");
        }
    }
}
