package homework7.task2;

import homework7.task2.comparotors.ByAgeComparator;
import homework7.task2.comparotors.ByFullNameComparator;
import homework7.task2.comparotors.ByMarkComparator;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Collections.addAll(students,
                new Student("Ivanov", "Alex", 17, 8.5),
                new Student("Petrova", "Anna", 16, 9.5),
                new Student("Petrova", "Jane", 20, 8.6),
                new Student("Sidorov", "Max", 20, 9.5)
        );

        System.out.println("Sorting by full name:");
        Collections.sort(students, new ByFullNameComparator());
        printList(students);

        System.out.println("Sorting by age:");
        Collections.sort(students, new ByAgeComparator());
        printList(students);

        System.out.println("Sorting by mark:");
        Collections.sort(students, Collections.reverseOrder(new ByMarkComparator()));
        printList(students);

        System.out.println("Student with the highest mark:");
        printStudentsWithMaxMark(students);
    }

    public static void printStudentsWithMaxMark(List<Student> students) {
        if (students.size() == 0) {
            return;
        }
        double maxMark = students.get(0).getMark();

        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student temp = iterator.next();
            if(temp.getMark() > maxMark) {
                maxMark = temp.getMark();
            }
        }

        iterator = students.iterator();
        while (iterator.hasNext()) {
            Student temp = iterator.next();
            if (temp.getMark() == maxMark) {
                System.out.println(temp);
            }
        }
    }

    public static void printList(List<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println();
    }
}
