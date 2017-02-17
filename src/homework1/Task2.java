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

        boolean flag = false;

        if ((e > b + d) && f >= Math.max(a, c) || (f > b + d) && e >= Math.max(a, c)) {
            flag = true;
        }
        if ((e > b + c) && f >= Math.max(a, d) || (f > b + c) && e >= Math.max(a, d)) {
            flag = true;
        }
        if ((e > a + d) && f >= Math.max(b, c) || (f > a + d) && e >= Math.max(b, c)) {
            flag = true;
        }
        if ((e > a + c) && f >= Math.max(b, d) || (f > a + c) && e >= Math.max(b, d)) {
            flag = true;
        }

        if (flag) {
            System.out.println("Дома помещаются");
        } else {
            System.out.println("Дома не помещаются");
        }
    }
}
