import java.util.*;
class Student implements Comparable<Student> {
    String firstName, lastName;
    Date birthDate;
    ArrayList<Integer> grades;

    public Student(String firstName, String lastName, Date birthDate, ArrayList<Integer> grades) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.grades = grades;
    }

    public double getAverageGrade() {
        return grades.stream().mapToInt(Integer::intValue).average().orElse(0);
    }

    @Override
    public int compareTo(Student o) {
        return (this.firstName + this.lastName).compareTo(o.firstName + o.lastName);
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " - Avg Grade: " + getAverageGrade();
    }
}
