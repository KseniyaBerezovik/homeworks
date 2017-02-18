package homework1;

import java.util.Scanner;

public class Task2 {
    public static final int e = 100;
    public static final int f = 150;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        scanner.close();

        if (isHousesPlaced(a, b, c, d)) {
            System.out.println("Дома помещаются");
        } else {
            System.out.println("Дома не помещаются");
        }
    }

    public static boolean isHousesPlaced(int a, int b, int c, int d) {
        int sum = b + d;
        int max = Math.max(a, c);
        if ((e > sum) && f >= max || (f > sum) && e >= max) {
            return true;
        } else {
            sum = b + c;
            max= Math.max(a, d);
            if ((e > sum) && f >= max || (f > sum) && e >= max) {
                return true;
            } else {
                sum = a + d;
                max = Math.max(b, c);
                if ((e > sum) && f >= max || (f > sum) && e >= max) {
                    return true;
                } else {
                    sum = a + c;
                    max = Math.max(b, d);
                    if ((e > sum) && f >= max || (f > sum) && e >= max) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
