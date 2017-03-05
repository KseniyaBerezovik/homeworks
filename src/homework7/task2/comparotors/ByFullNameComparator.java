package homework7.task2.comparotors;

import homework7.task2.Student;

import java.util.Comparator;

public class ByFullNameComparator implements Comparator<Student> {
    @Override
    public int compare (Student studentFirst, Student studentSecond) {
        int compareResult = studentFirst.getFirstName().compareTo(studentSecond.getFirstName());
        if (compareResult == 0) {
            return studentFirst.getLastName().compareTo(studentSecond.getLastName());
        }
        return compareResult;
    }
}