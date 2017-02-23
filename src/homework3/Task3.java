package homework3;

import java.util.Arrays;

public class Task3 {
    public static int count = 0;
    public static int [] results;

    public static void main(String[] args) {
        int [] array1 = new int[] {1, 2, 3, 4, 5};
        int [] array2 = new int[] {5, 6, 7};
        results = new int[array1.length + array2.length];

        int maxLength = array1.length > array2.length ? array1.length : array2.length;

        for (int i = 0; i < maxLength; i++) {
            addNumber(array1, i);
            addNumber(array2, i);
        }

        Arrays.stream(results).forEach(System.out::println);
    }

    public static void addNumber(int[] arrayFrom, int index) {
        if (index < arrayFrom.length) {
            results[count] = arrayFrom[index];
            count++;
        }
    }
}

