package homework7.task2.comparotors;

import homework7.task2.Student;

import java.util.Comparator;

public class ByMarkComparator implements Comparator<Student> {
    @Override
    public int compare(Student studentFirst, Student studentSecond) {
        return new Double(studentFirst.getMark()).compareTo(studentSecond.getMark());
    }
}
