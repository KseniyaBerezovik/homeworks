package homework1;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        int month = scanner.nextInt();
        int year = scanner.nextInt();
        scanner.close();

        if (isNextYear(day, month)) {
            day = 1;
            month = 1;
            year++;
        } else {
            if (isNextMonth(day, month, year)) {
                day = 1;
                month++;
            } else {
                day++;
            }
        }

        System.out.println (getFormattedString(day, month, year));
    }

    public static String getFormattedString(int day, int month, int year) {
        return (day < 10 ? ("0" + day) : day) + "." + (month < 10 ? ("0" + month) : month) + "." + year;
    }

    public static boolean isYearLeap (int year) {
        return (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
    }

    public static boolean isNextYear (int day, int month) {
        return month == 12 && day == 31;
    }

    public static boolean isNextMonth (int day, int month, int year) {
        return ((month == 4 || month == 6 || month == 9 || month == 11) && day == 30) ||
                (month == 2 && (day == 28 && !isYearLeap(year) ||  day == 29)) || day == 31;
    }
}