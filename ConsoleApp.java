import java.util.Scanner;
public class Array35 {
    public static void main(String[] args) {
        System.out.println("Введите размер массива: ");
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[] mas = new int[N];
        System.out.println("Заполните массив: ");
        for (int i = 0; i < N; i++) {
            int n = input.nextInt();
            mas[i] = n;
        }
        int[] min = new int[N];
        min[0] = mas[0];
        int c = 1;
        for (int i : mas) System.out.printf("%d ", i);
        System.out.printf("\n");
        for (int i = 1; i < N - 1; i++) {
            if ((mas[i] > mas[i + 1]) && (mas[i] > mas[i - 1])) {
                if (mas[i] > min[c]) {
                    System.out.println(mas[i]);
                    min[c] = mas[i];
                    c++;
                }
            }
            if (mas[i+1] == mas[N-1]) {
                if (mas[i] > mas[i - 1]) {
                    min[c] = mas[i];
                    c++;
                }
            }
        }
        //for (int j : min) System.out.printf("%d ", j);
        int min1 = min[0];
        for (int j = 0; j <= c - 1; j++) {
            //System.out.println(min[j]+' '+min1);
            if (min[j] < min1) {
                min1 = min[j];
            }
        }
        System.out.printf("\n Минимальный локальный элемент: %d", min1);
    }
}
