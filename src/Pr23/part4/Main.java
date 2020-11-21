package Pr23.part4;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<String> list;

        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите путь до каталога");

            File file = new File(sc.next());    // C:\\Users\\vovap\\Desktop\\Жепа

            if(file.list()!=null) {
                list = convertor(file.list());
                outprint(list);
            }else System.out.println("Данного каталога не существует");

        } catch (Exception e) {
            e.printStackTrace();
        }


    }


    public static <T> List<T> convertor(T[] mass){

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
