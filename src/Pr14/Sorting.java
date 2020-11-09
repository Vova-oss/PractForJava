package Pr14;

import java.util.Arrays;

public class Sorting {

    public static void main(String[] args) {
        Student[] array = new Student[10];
        System.out.println("Нетсортированный массив");
        for (int i = 0; i < 10; i++) {
            array[i] = new Student((int) (2 + Math.random() * 100));
            System.out.println(array[i].getMarks());
        }
        (new Sorting()).selectionSort(array);
        System.out.println("Отсортированный массив");
        for(int i =0;i<10;i++){
            System.out.println(array[i].getMarks());
        }


    }

    public void selectionSort (Comparable[] list) {
        int min;
        Comparable temp;
        for (int index = 0; index < list.length-1; index++)
        {
            min = index;
            for (int scan = index+1; scan < list.length; scan++)
                if (list[scan].compareTo(list[min]) < 0)
                    min = scan;
            temp = list[min];
            list[min] = list[index];
            list[index] = temp;
        }
    }
}
