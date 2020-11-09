package Pr14;

import java.util.Comparator;
import java.util.Scanner;

public class Search implements Comparator<Student> {

    private static int c;

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getMarks()>o2.getMarks()?1:-1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student[] array = new Student[10];
        System.out.println("Нетсортированный массив");
        for (int i = 0; i < 10; i++) {
            array[i] = new Student((int) (2 + Math.random() * 100));
            System.out.println(array[i].getMarks());
        }


        Search search = new Search() ;
        System.out.print("Введите оценку студента для поиска: ");
        int x = sc.nextInt();
        System.out.println("\nАлгоритм итеративного линейного поиска: ");
        search.LinearSearch(array,x);


        long startTime = System.nanoTime();
        System.out.println("\nАлгоритм рекурсивного линейного поиска");
        search.LinearRecSearch(array,x,0);
        System.out.println("Время работы: " + (System.nanoTime()-startTime));

        Sorting sorting = new Sorting();
        sorting.selectionSort(array);
        System.out.println("Отсортированный массив");
        for (int i = 0; i < 10; i++) {
            System.out.println(array[i].getMarks());
        }

        System.out.println("\nАлгоритм итеративного бинарного поиска: ");
        search.BinarySearch(array,0,9, x);

        c=0;
        startTime = System.nanoTime();
        System.out.println("\nАлгоритм рекурсивного бинарного поиска");
        search.BinaryRecSearch(array,0,9, x);
        System.out.println("Время работы: " + (System.nanoTime()-startTime));

    }

    void LinearRecSearch(Student[] numbers, int key,int i){
        c++;
        int pos = -1;
        if(numbers[i].getMarks()==key)
        {
            pos = i;
            System.out.println("Количество операций сравнения: " + c );
            System.out.println("Позиция элемента: " + pos);

            return;
        }
        LinearRecSearch(numbers, key, i+1);

    }

    void LinearSearch(Student[] numbers,int key)
    {
        long time;
        long startTime = System.nanoTime();
        int c = 0,pos;
        for(int i=0;i<numbers.length;i++)
        {
            c++;
            if(numbers[i].getMarks()==key)
            {
                pos = i;
                long endTime = System.nanoTime();
                time = endTime-startTime;
                System.out.println("Количество операций сравнения: " + c );
                System.out.println("Позиция элемента: " + pos);
                System.out.println("Время работы: " + time);
                return;
            }
        }
    }

    void BinarySearch(Student[] numbers,int left,int right,int key)    {
        long time;
        int c=0;
        long startTime = System.nanoTime();
        int midd;
        int pos;
        while(true)
        {
            midd = (left+right)/2;
            c++;
            if(key<numbers[midd].getMarks())
            {
                right = midd-1;
            }
            else if(key>numbers[midd].getMarks())
            {
                c++;
                left = midd+1;
            }
            else
            {
                c++;
                pos = midd;
                long timeEnd =  System.nanoTime();
                time = timeEnd - startTime;
                System.out.println("Количество операций сравнения: " + c );
                System.out.println("Позиция элемента: " + pos);
                System.out.println("Время работы: " + time);
                return;
            }
        }
    }

    void BinaryRecSearch(Student[] numbers,int left,int right,int key){
        int midd;
        int pos;

        midd = (left+right)/2;
        c++;
        if(key<numbers[midd].getMarks())
        {
            right = midd-1;
        }
        else if(key>numbers[midd].getMarks())
        {
            c++;
            left = midd+1;
        }
        else
        {
            c++;
            pos = midd;
            System.out.println("Количество операций сравнения: " + c );
            System.out.println("Позиция элемента: " + pos);
            return;
        }

        BinaryRecSearch(numbers,left,right,key);

    }

}