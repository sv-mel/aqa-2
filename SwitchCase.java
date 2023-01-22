import java.util.Scanner;

public class SwitchCase {
    //Составить программу, которая в зависимости от названия дня недели (понедельник, вторник, .., воскресенье),
    //выводит на экран его порядковый номер дня недели (1, 2, .., 7)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите название дня недели:");
        String dayName = sc.next();
        sc.close();

        switch (dayName) {
            case "Понедельник":
                System.out.println("1");
                break;
            case "Вторник":
                System.out.println("2");
                break;
            case "Среда":
                System.out.println("3");
                break;
            case "Четверг":
                System.out.println("4");
                break;
            case "Пятница":
                System.out.println("5");
                break;
            case "Суббота":
                System.out.println("6");
                break;
            case "Воскресенье":
                System.out.println("7");
                break;
            default:
                System.out.println("Введено некорректное название дня недели");
        }
    }
}
