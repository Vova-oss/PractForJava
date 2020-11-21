package Pr23.part5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Main {
    static Solution solution;
    static Integer[] mass;
    static String[] mas;
    static Cont[] cont;

    public static void main(String[] args) {

        solution = new Solution();
        mass = new Integer[10];
        mas = new String[10];
        cont = new Cont[10];
        for(int i =0;i<mass.length;i++){
            mass[i]= (int) (Math.random() * 100);
            mas[i]= String.valueOf(Math.random() * 100);
            cont[i] = new Cont(mass[i],mas[i]);
        }

        List list = solution.newArrayList(mass);
        HashSet set = solution.newHashSet(mass);
        HashMap map = solution.newHashMap(cont);

        outprint(list);
        outprint(set);
        outprint(map);
    }

    public static <T> void outprint(List<T> list){
        System.out.println("-------------------------");
        for(T obj:list){
            System.out.println(obj);
        }
    }
    public static <T> void outprint(HashSet<T> list){
        System.out.println("-------------------------");
        for(T obj:list){
            System.out.println(obj);
        }
    }
    public static <K,V> void outprint(HashMap<K,V> list){
        System.out.println("-------------------------");
        for(int i =0;i< mass.length;i++){
            System.out.println("Ключ:"+mass[i]+"  Значение:"+list.get(mass[i]));
        }
    }

}
