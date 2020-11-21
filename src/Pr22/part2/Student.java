package Pr22.part2;

public class Student implements Comparable<Student>, StudentIn {

    int iDNumber;
    String name;
    int mark;

    public Student(int iDNumber, String name, int mark) {
        this.iDNumber = iDNumber;
        this.name = name;
        this.mark = mark;
    }

    @Override
    public int getiDNumber() {
        return iDNumber;
    }

    public void setiDNumber(int iDNumber) {
        this.iDNumber = iDNumber;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }
}
