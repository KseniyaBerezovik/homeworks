package homework7.task2.comparotors;

import homework7.task2.Student;

import java.util.Comparator;

public class ByAgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student studentFirst, Student studentSecond) {
        return new Integer(studentFirst.getAge()).compareTo(studentSecond.getAge());
    }
}
