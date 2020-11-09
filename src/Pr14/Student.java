package Pr14;

public class Student implements Comparable<Student> {
    private final int marks;

    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.marks, o.marks);
    }

    public Student(int marks) {
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "grade=" + marks +
                '}';
    }
}
