package homework2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = scanner.nextInt();

        int sum = 0;
        int max = 0;

        for (int i = 1; i <= days; i++) {
            System.out.printf("Введите величину осадков за день №%d: ", i);
            int amount = scanner.nextInt();
            if (amount > max) {
                max = amount;
            }
            sum += amount;
        }

        System.out.println("Количество дней: " + days);
        System.out.println("Сумма осадков: " + sum);
        System.out.println("Среднее количество осадков: " + (double) sum / days);
        System.out.println("Максимальное количество осадков: " + max);
    }
}
