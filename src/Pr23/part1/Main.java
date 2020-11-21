package Pr23.part1;

import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static List listText = new ArrayList<>();



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество элементов");
        int n = sc.nextInt();

        String[] mass = new String[n];
        Integer[] mas = new Integer[n];
        System.out.println("Введите "+n+" чисел");
        for(int i =0;i<n;i++){
            mas[i] = sc.nextInt();
        }
        System.out.println("Введите "+n+" строк");
        for(int i =0;i<n;i++){
            mass[i] = sc.next();
        }

        listText = convertor(mass);
        outprint(listText);

        listText = convertor(mas);
        outprint(listText);
    }




    public static <T> List<T> convertor(T mass[]){
        List<T> list = new ArrayList<>();
        for(int i = 0;i<mass.length;i++){
            list.add(mass[i]);
        }
        return list;
    }


    public static <T> void outprint(List<T> list){
        System.out.println("-------------------------");
        for(T obj:list){
            System.out.println(obj);
        }
    }

}
