package homework1;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        scanner.close();

        double d = discriminant(a, b, c);

        if (isZero(d)) {
            double x = -b / (2 * a);
            System.out.println("Уравнение имеет один корень: " + x);
        } else {
            if (!isPositive(d)) {
                System.out.println("Уравнение не имеет действительных корней");
            } else {
                double x1 = (-b + Math.sqrt(d)) / (2 * a);
                double x2 = (-b - Math.sqrt(d)) / (2 * a);
                System.out.println(String.format("Уравнение имеет два кореня: %f; %f", x1, x2));
            }
        }
    }

    public static boolean isPositive(double number) {
        return number > 0;
    }

    public static boolean isZero(double number) {
        return number == 0;
    }

    public static double discriminant(double a, double b, double c) {
        return b * b - 4 * a * c;
    }
}
