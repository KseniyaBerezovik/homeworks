package homework3;

import java.util.Arrays;

public class Task1 {

    public static void main(String[] args) {
        int [] array = new int[] {1, 2, 3, 4, 5};

        int temp = array[array.length - 1];
        for (int i = array.length - 1; i > 0 ; i--) {
            array[i] = array[i - 1];
        }
        array[0] = temp;

        Arrays.stream(array).forEach(System.out::println);
    }
}
