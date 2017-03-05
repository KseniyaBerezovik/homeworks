package homework7.task2;

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private double mark;

    public Student(String firstName, String lastName, int age, double mark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.mark = mark;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public double getMark() {
        return mark;
    }

    @Override
    public String toString() {
        return String.format("%s %s. Age: %d. Average mark: %.1f", this.firstName, this.lastName, this.age, this.mark);
    }
}