package homework1;

import java.util.Scanner;

public class Task1 {

    public static String getFormattedString(int day, int month, int year) {
        return (day < 10 ? ("0" + day) : day) + "." + (month < 10 ? ("0" + month) : month) + "." + year;
    }

    public static boolean isYearLeap (int year) {
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        int month = scanner.nextInt();
        int year = scanner.nextInt();

        scanner.close();

        if (month == 12 && day == 31) {    //next year
            day = 1;
            month = 1;
            year ++;
        } else {
            if (((month == 4 || month == 6 || month == 9 || month == 11) && day == 30) ||        //next month
                    (month == 2 && (day == 28 && !isYearLeap(year) ||  day == 29)) ||
                    day == 31 ) {
                day = 1;
                month ++;
            } else {
                day ++;
            }
        }

        System.out.println (getFormattedString(day, month, year));
    }
}