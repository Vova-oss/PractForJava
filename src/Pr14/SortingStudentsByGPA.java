package Pr14;

import java.util.Arrays;
import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.compareTo(o2);
    }

    public void quickSort(Student[] numbers, int left, int right) {
        Student buf1;
        int l_hold = left;
        int r_hold = right;
        buf1 = numbers[left];
        while (left < right)
        {
            while (compare(numbers[right],buf1)<0 ||(compare(numbers[right],buf1)==0)&& (left < right))
                right--;
            if (left != right)
            {
                Student tmp = numbers[left];
                numbers[left] = numbers[right];
                numbers[right] = tmp;
                left++;
            }
            while (compare(numbers[left],buf1)>0 ||(compare(numbers[left],buf1)==0) && (left < right))
                left++;
            if (left != right)
            {
                Student tmp = numbers[left];
                numbers[left] = numbers[right];
                numbers[right] = tmp;
                right--;
            }
        }
        numbers[left] = buf1;
        int buf2 = left;
        left = l_hold;
        right = r_hold;
        if (left < buf2)
            quickSort(numbers, left, buf2 - 1);
        if (right > buf2)
            quickSort(numbers, buf2 + 1, right);
    }

    public static void main(String[] args) {
        SortingStudentsByGPA object = new SortingStudentsByGPA();
        Student[] array1 = new Student[9];
        System.out.println("Нетсортированный массив");
        for (int i = 0;i < 9 ;i++) {
            array1[i] = new Student((int) (Math.random() * 101));
            System.out.println(array1[i].getMarks());
        }
        object.quickSort(array1, 0, array1.length -1);
        System.out.println("Отсортированный массив");
        for (int i = 0;i < array1.length-1;i++) {
            System.out.println(array1[i].getMarks());
        }
    }
}
