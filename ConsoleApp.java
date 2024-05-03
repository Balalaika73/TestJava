import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Создаем объект Scanner для считывания ввода пользователя
        Scanner scanner = new Scanner(System.in);

        // Печатаем приветствие и запрашиваем имя пользователя
        System.out.println("Привет! Как тебя зовут?");
        String name = scanner.nextLine();

        // Выводим персонализированное приветствие
        System.out.println("Приятно познакомиться, " + name + "!");
    }
}
