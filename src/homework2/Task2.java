package homework2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        printFibonacciWithCycle(number);
        System.out.println();
        printFibonacciWithRecursion(number);
    }

    public static void printFibonacciWithCycle(int number) {
        int currentNumber = 0;
        int nextNumber = 1;
        int temp;
        while (nextNumber <= number) {
            System.out.print(nextNumber + " ");
            temp = currentNumber;
            currentNumber = nextNumber;
            nextNumber += temp;
        }
    }

    public static void printFibonacciWithRecursion (int number) {
        for (int i = 1; ;i++) {
            int f = getFibonacciNumber(i);
            if (f <= number) {
                System.out.print(f + " ");
            } else {
                return;
            }
        }
    }

    public static int getFibonacciNumber(int index) {
        if (index == 1 || index == 2) {
            return 1;
        } else {
            return (getFibonacciNumber(index - 1) + getFibonacciNumber(index - 2));
        }
    }

}
