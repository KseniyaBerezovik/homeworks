package homework4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        StringBuilder sb = new StringBuilder(string);
        System.out.println(string.equalsIgnoreCase(sb.reverse().toString()));
    }
}
