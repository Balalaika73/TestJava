import java.util.Scanner;

public class SumCalculator {
    // Функция для вычисления суммы двух чисел
    public static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        // Создание сканера для ввода данных пользователем
        Scanner scanner = new Scanner(System.in);

        // Запрос первого числа у пользователя
        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();

        // Запрос второго числа у пользователя
        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();

        // Вызов функции для вычисления суммы
        int result = sum(num1, num2);

        // Вывод результата на экран
        System.out.println("Сумма: " + result);
    }
}
