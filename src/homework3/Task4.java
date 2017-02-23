package homework3;

import java.util.Arrays;

public class Task4 {

    public static void main(String[] args) {
        int [][] array = new int[][] {{1, 3, 7}, {5}, {0, 10, 20}};

        Arrays.stream(linearize(array)).forEach(System.out::println);
    }

    public static int[] linearize(int[][] array) {
        int size = 0;
        for (int[] i : array) {
            size += i.length;
        }

        int[] result = new int[size];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                result[count] = array[i][j];
                count++;
            }
        }
        return result;
    }
}
